package com.hubert.youtube.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class YoutubeDate {

    private static final DateTimeFormatter baseDateFormatter = DateTimeFormatter.ofPattern("MMM d, yyy", Locale.US);
    private static final String baseString = "Started streaming on";
    private static final String agoBaseString = "Started streaming";
    private static final String AGO = "ago";
    private static final String MINUTES = "minutes";
    private static final String HOURS = "hours";
    private static final String SECONDS = "seconds";
    private static final Integer AGO_STRING_TIME_UNIT_INDEX = 2;

    private static String prepareYoutubeStreamDateString(String dateString) {
        return dateString.replace(baseString, "").replace(agoBaseString, "").trim();
    }

    private static LocalDateTime baseStringStrategy(String baseString) {
        return LocalDate.parse(prepareYoutubeStreamDateString(baseString), baseDateFormatter).atStartOfDay();
    }

    private static String getTimeUnitFromAgoString(String agoString) {
        String[] fragments = agoString.trim().split(" ");

        return fragments[fragments.length - AGO_STRING_TIME_UNIT_INDEX];
    }

    private static LocalDateTime agoStringStrategy(String agoString) {
        String preparedString = prepareYoutubeStreamDateString(agoString);
        String timeUnit = getTimeUnitFromAgoString(preparedString);
        int time = Integer.parseInt(preparedString.replace(timeUnit, "").replace(AGO, "").trim());

        LocalDateTime now = LocalDateTime.now();

        return switch (timeUnit) {
            case SECONDS -> now.minusSeconds(time);
            case MINUTES -> now.minusMinutes(time);
            case HOURS -> now.minusHours(time);
            default -> now;
        };
    }

    private static Boolean isBaseString(String dateString) {
        return !dateString.contains(AGO);
    }

    public static LocalDateTime parseString(String startString) {
        Boolean isBaseString = isBaseString(startString);

        return isBaseString ? baseStringStrategy(startString) : agoStringStrategy(startString);
    }
}
