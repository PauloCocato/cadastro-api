package br.com.cadastra.util;

import org.junit.Test;

import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

public class LocalDateTimeUtilTest {

    @Test
    public void testFromText() {
        // given
        LocalDateTime localDateTime = LocalDateTime.of(2018, 6, 29, 18,30,40);

        // when
        String format = LocalDateTimeUtil.format(localDateTime);

        // then
        assertEquals("29-06-2018 18:30:40", format);
    }

    @Test
    public void testFormat() {
        // given
        String text = "29-06-2018 18:30:40";

        // when
        LocalDateTime localDateTime = LocalDateTimeUtil.fromText(text);

        // then
        assertEquals(LocalDateTime.of(2018, 6, 29, 18,30,40), localDateTime);
    }

}
