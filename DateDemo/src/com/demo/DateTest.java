package com.demo;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование работы с датами
 */
public class DateTest {
    @Test
    public void baseDate() throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(2014, Calendar.APRIL, 18);
        Date date = c.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        // Печать даты в строку
        assertEquals("18.04.2014", dateFormat.format(date));

        // Из строки в дату
        Date parsedDate = dateFormat.parse("19.05.2013");

        Calendar cal = Calendar.getInstance();
        cal.setTime(parsedDate);

        assertEquals(19, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        assertEquals(2013, cal.get(Calendar.YEAR));
    }
}
