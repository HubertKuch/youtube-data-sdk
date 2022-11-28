package com.hubert.youtube.vo.contents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record RichGridRendererContentItem(
        RichItemRenderer richItemRenderer
) {
    public String getTitle() {
        return richItemRenderer().content().videoRenderer().title().runs().stream().reduce("", (prev, act) -> prev + act.text(), String::concat);
    }

    public String getId() {
        return richItemRenderer().content().videoRenderer().videoId();
    }
}
