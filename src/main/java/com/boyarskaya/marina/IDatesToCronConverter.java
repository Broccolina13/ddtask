package com.boyarskaya.marina;

import java.util.Date;
import java.util.List;

public interface IDatesToCronConverter {


    String convert(Date date) throws DatesToCronConvertException;

    String getImplementationInfo();
}
