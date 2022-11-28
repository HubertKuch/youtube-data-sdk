package com.hubert.youtube.vo.stream.initialplayerresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VideoDetails(
        String videoId,
        String title,
        String lengthSeconds,
        Boolean isLive,
        String channelId,
        Boolean isOwnerViewing,
        String shortDescription,
        Boolean isCrawlable,
        Boolean isLiveDvrEnabled,
        String viewCount,
        Integer liveChunkReadahead,
        String latencyClass,
        Boolean isUnpluggedCorpus,
        Boolean isPrivate,
        Boolean isLowLatencyLiveStream,
        Boolean isLiveContent,
        String author,
        Boolean allowRatings
) {}
