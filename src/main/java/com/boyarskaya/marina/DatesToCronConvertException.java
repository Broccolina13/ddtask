package com.boyarskaya.marina;

import java.text.ParseException;
import java.util.Date;

import static com.boyarskaya.marina.DatesToCronConverter.DATE_FORMAT;
import static com.boyarskaya.marina.DatesToCronConverter.parseStringToDate;

public class DatesToCronConvertException extends Exception {

    public Date getDate(String cron) throws ParseException {
        return parseStringToDate(cron, DATE_FORMAT);
    }
}