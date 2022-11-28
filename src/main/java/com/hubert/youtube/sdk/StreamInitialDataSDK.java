package com.hubert.youtube.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubert.youtube.vo.stream.initialdata.StreamInitialDataRoot;
import com.hubert.youtube.vo.stream.initialdata.VideoPrimaryInfoRenderer;

public class StreamInitialDataSDK {

    private final StreamInitialDataRoot initialDataRoot;

    public static StreamInitialDataSDK parse(String json) throws InvalidInitialDataContentException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            return new StreamInitialDataSDK(objectMapper.reader().readValue(json, StreamInitialDataRoot.class));
        } catch (Exception exception) {
            throw new InvalidInitialDataContentException("Cannot parse initial data from provided source. Check is data is valid JSON format and is correctly getting.");
        }
    }

    private StreamInitialDataSDK(StreamInitialDataRoot initialDataRoot) {
        this.initialDataRoot = initialDataRoot;
    }

    public StreamInitialDataRoot getRoot() {
        return initialDataRoot;
    }

    public VideoPrimaryInfoRenderer getPrimaryInfoRenderer() {
        return initialDataRoot
                .contents()
                .twoColumnWatchNextResults()
                .results()
                .results()
                .contents()
                .get(0)
                .videoPrimaryInfoRenderer();

    }
}
