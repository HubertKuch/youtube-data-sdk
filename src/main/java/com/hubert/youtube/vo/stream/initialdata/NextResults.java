package com.hubert.youtube.vo.stream.initialdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NextResults(
        List<StreamNextResultsContentItem> contents
) {
}
