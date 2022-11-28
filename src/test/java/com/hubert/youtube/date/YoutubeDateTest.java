package com.hubert.youtube.date;

import com.hubert.youtube.date.YoutubeDate;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class YoutubeDateTest {

    @Test
    void parseBaseString() {
        String exampleBaseString = "Started streaming on Jan 11, 2022";

        LocalDateTime date = YoutubeDate.parseString(exampleBaseString);
        LocalDateTime exceptedDate = LocalDate.parse("Jan 11, 2022", DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.US)).atStartOfDay();

        assertEquals(date, exceptedDate);
    }

    @Test
    void parseHoursString() {
        String exampleHoursString = "Started streaming 2 hours ago";

        LocalDateTime date = YoutubeDate.parseString(exampleHoursString);
        LocalDateTime exceptedDate = LocalDateTime.now().minusHours(2);

        assertArrayEquals(new int[] { date.getHour(), date.getSecond() }, new int[] { exceptedDate.getHour(), exceptedDate.getSecond() });
    }

    @Test
    void parseMinutesString() {
        String exampleMinutesString = "Started streaming 79 minutes ago";

        LocalDateTime date = YoutubeDate.parseString(exampleMinutesString);
        LocalDateTime exceptedDate = LocalDateTime.now().minusMinutes(79);

        assertArrayEquals(new int[] { date.getHour(), date.getSecond() }, new int[] { exceptedDate.getHour(), exceptedDate.getSecond() });
    }

    @Test
    void parseSecondsString() {
        String exampleSecondsString = "Started streaming 5 seconds ago";

        LocalDateTime date = YoutubeDate.parseString(exampleSecondsString);
        LocalDateTime exceptedDate = LocalDateTime.now().minusSeconds(5);

        assertArrayEquals(new int[] { date.getHour(), date.getSecond() }, new int[] { exceptedDate.getHour(), exceptedDate.getSecond() });
    }
}
