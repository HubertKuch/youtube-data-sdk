package com.hubert.youtube.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubert.youtube.vo.contents.ChannelInitialDataRoot;
import com.hubert.youtube.vo.contents.RichGridRendererContentItem;
import com.hubert.youtube.vo.contents.Tab;
import com.hubert.youtube.vo.contents.TabRenderer;

import java.io.IOException;
import java.util.List;

public class ChannelInitialDataSDK {

    private final ChannelInitialDataRoot initialDataRoot;

    public static ChannelInitialDataSDK parse(String jsonInitialDataContent) throws InvalidInitialDataContentException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return new ChannelInitialDataSDK(objectMapper.reader().readValue(jsonInitialDataContent, ChannelInitialDataRoot.class));
        } catch (IOException e) {
            throw new InvalidInitialDataContentException("Cannot parse initial data from provided source. Check is data is valid JSON format and is correctly getting.");
        }
    }

    private ChannelInitialDataSDK(ChannelInitialDataRoot initialDataRoot) {
        this.initialDataRoot = initialDataRoot;
    }

    public ChannelInitialDataRoot getRoot() {
        return initialDataRoot;
    }

    public TabRenderer getLiveStreamsTabRenderer() {
        final String TITLE_KEY = "Na żywo";
        final String TITLE_KEY_SECOND_GOAL = "Live";
        List<Tab> tabs = getRoot().contents().twoColumnBrowseResultsRenderer().tabs();
        List<Tab> matchedTabs = tabs.stream().filter(tab -> tab.tabRenderer() != null && (tab.tabRenderer().title().equals(TITLE_KEY) || tab.tabRenderer().title().equals(TITLE_KEY_SECOND_GOAL))).toList();

        if (matchedTabs.isEmpty()) {
            return null;
        }

        return matchedTabs.get(0).tabRenderer();
    }

    public List<RichGridRendererContentItem> getLiveStreamsRenderers() {
        return getLiveStreamsTabRenderer().content().richGridRenderer().contents();
    }
}
