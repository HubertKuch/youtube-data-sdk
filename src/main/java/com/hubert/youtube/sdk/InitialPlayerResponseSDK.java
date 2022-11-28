package com.hubert.youtube.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubert.youtube.vo.stream.initialplayerresponse.InitialPlayerResponseRoot;

import java.io.IOException;

public class InitialPlayerResponseSDK {

    private final InitialPlayerResponseRoot initialPlayerResponseRoot;

    private InitialPlayerResponseSDK(InitialPlayerResponseRoot responseRoot) {
        this.initialPlayerResponseRoot = responseRoot;
    }

    public static InitialPlayerResponseSDK parse(String json) throws InvalidInitialDataContentException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            return new InitialPlayerResponseSDK(objectMapper.reader().readValue(json, InitialPlayerResponseRoot.class));
        } catch (IOException e) {
            throw new InvalidInitialDataContentException("Cannot parse initial data from provided source. Check is data is valid JSON format and is correctly getting.");
        }
    }

    public static InitialPlayerResponseSDK of(InitialPlayerResponseRoot responseRoot) {
        return new InitialPlayerResponseSDK(responseRoot);
    }

    public InitialPlayerResponseRoot getRoot() {
        return initialPlayerResponseRoot;
    }

    public Integer getWatchers() {
        return Integer.valueOf(initialPlayerResponseRoot.videoDetails().viewCount());
    }

    public Boolean isLive() {
        return initialPlayerResponseRoot.videoDetails().isLive();
    }
}
