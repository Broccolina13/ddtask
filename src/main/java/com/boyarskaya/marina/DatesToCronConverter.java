package com.boyarskaya.marina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesToCronConverter implements IDatesToCronConverter {

    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static String formatDateByPattern(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    public static Date parseStringToDate(String cron, String dateFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = null;
        if (cron != null) {
            date = sdf.parse(cron);
        }
        return date;
    }

    @Override
    public String convert(Date date){
        return formatDateByPattern(date, DATE_FORMAT);
    }


    @Override
    public String getImplementationInfo(){

        return "Боярская Марина Михайловна" +
                "DatesToCronConverter" +
                "com.boyarskaya.marina" +
                "https://github.com/Broccolina13/digitalDesignTask";
    }


}
