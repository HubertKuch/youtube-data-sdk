package com.hubert.youtube.vo.stream.initialplayerresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record InitialPlayerResponseRoot(
        VideoDetails videoDetails
) {}
