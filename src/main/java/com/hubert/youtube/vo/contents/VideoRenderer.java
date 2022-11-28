package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VideoRenderer(
        String videoId,
        VideoTitle title,
        ViewCountText viewCountText,
        List<ThumbnailOverlays> thumbnailOverlays
) {
    public boolean hasLiveStreamThumbnail() {
        return thumbnailOverlays().stream().anyMatch(thumbnailOverlays -> thumbnailOverlays.thumbnailOverlayTimeStatusRenderer().style().equals("LIVE"));
    }
}
