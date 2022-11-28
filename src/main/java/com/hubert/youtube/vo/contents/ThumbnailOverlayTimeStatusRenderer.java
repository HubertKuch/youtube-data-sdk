package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ThumbnailOverlayTimeStatusRenderer(
        ThumbnailText text,
        String style,
        Icon icon
) {
}
