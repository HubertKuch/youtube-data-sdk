package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TabRenderer(
        String title,
        String trackingParams,
        Endpoint endpoint,
        TabRendererContent content
) {
}
