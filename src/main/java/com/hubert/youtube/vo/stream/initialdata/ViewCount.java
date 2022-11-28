package com.hubert.youtube.vo.stream.initialdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ViewCount(
        VideoCountRenderer videoViewCountRenderer
) {
}
