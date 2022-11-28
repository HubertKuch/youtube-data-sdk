package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WebCommandMetadata(
        String url,
        String webPageType,
        String rootVe,
        String apiUrl
) {
}
