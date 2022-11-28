package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ThumbnailText(
        List<RunsItem> runs,
        Accessibility accessibility
) {
}
