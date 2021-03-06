package br.com.cadastra.util;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class LocalDateUtilTest {

    @Test
    public void testFromText() {
        // given
        LocalDate localDate = LocalDate.of(2018, 6, 29);

        // when
        String format = LocalDateUtil.format(localDate);

        // then
        assertEquals("29-06-2018", format);
    }

    @Test
    public void testFormat() {
        // given
        String text = "29-06-2018";

        // when
        LocalDate localDate = LocalDateUtil.fromText(text);

        // then
        assertEquals(LocalDate.of(2018, 6, 29), localDate);
    }

    @Test
    public void testToDate() throws ParseException {
        // given
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse("14-03-2016");

        LocalDate localDate = LocalDate.of(2016, 3, 14);

        // when
        Date toDate = LocalDateUtil.toDate(localDate);

        // then
        assertEquals(date, toDate);
    }

}
