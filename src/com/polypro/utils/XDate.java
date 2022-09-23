/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polypro.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class XDate {
    static SimpleDateFormat formatter = new SimpleDateFormat();
    
    public static Date toDate(String date, String pattern){
        try {
            formatter.applyPattern(pattern);
            return formatter.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static String toString(Date date,String pattern){
        formatter.applyPattern(pattern);
        return formatter.format(date);
    }
    
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
