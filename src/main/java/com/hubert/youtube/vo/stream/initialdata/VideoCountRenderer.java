package com.hubert.youtube.vo.stream.initialdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hubert.youtube.vo.contents.ViewCountText;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VideoCountRenderer(
        ViewCountText viewCount,
        Boolean isLive
) {
}
