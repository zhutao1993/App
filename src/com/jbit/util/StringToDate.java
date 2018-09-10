package com.jbit.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 檐上落白 on 2018/9/3.
 */
public class StringToDate implements Converter<String,Date>{
    private String partten;

    public StringToDate(String partten) {
        this.partten = partten;
    }

    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(partten);
        try {
            return  simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
