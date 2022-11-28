package com.hubert.youtube.vo.stream.initialdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hubert.youtube.date.YoutubeDate;
import com.hubert.youtube.vo.contents.VideoTitle;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VideoPrimaryInfoRenderer(
        String trackingParams,
        VideoTitle title,
        ViewCount viewCount,
        DateText dateText
) {
    public Timestamp getStartDate() {
        LocalDateTime localDateTime = YoutubeDate.parseString(dateText.simpleText());

        return Timestamp.valueOf(localDateTime);
    }

    public boolean isOnLive() {
        VideoCountRenderer countRenderer = viewCount.videoViewCountRenderer();
        System.out.println(countRenderer.isLive() != null && countRenderer.isLive());
        return countRenderer.isLive() != null && countRenderer.isLive();
    }

    public Integer getWatchers() {
        String item = viewCount.videoViewCountRenderer().viewCount().runs().get(0).text().replace("watching now", "").trim();

        return Integer.valueOf(item);
    }
}
