package com.demo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование работы с датами
 */
public class DateTest {
    @Test
    public void baseDate() {
        Calendar c = Calendar.getInstance();
        c.set(2014, Calendar.APRIL, 18);
        Date date = c.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        assertEquals("18.04.2014", dateFormat.format(date));
    }
}
