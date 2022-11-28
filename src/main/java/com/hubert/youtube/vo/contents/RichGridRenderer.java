package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RichGridRenderer(
        List<RichGridRendererContentItem> contents,
        String trackingParams,
        String targetId,
        String style
) {
}
