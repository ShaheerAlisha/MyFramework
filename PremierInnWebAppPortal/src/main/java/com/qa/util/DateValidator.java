package com.qa.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class contains various date validation and date formatting methods
 *
 * @author ShaheerAlisha
 */
public class DateValidator {

    //Method to validate if a date is Valid or not
    public static boolean isValidDate(String dateInString) {
        boolean flag = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy");
        sdf.setLenient(false);
        try {
            sdf.parse(dateInString);
            return flag;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Method to convert a Date from one "dd-MMMM-yy" to "ddMyyyy"
    public static String covertDateFormat(String dateInString) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMyyyy");
        Date date = sdf1.parse(dateInString);
        return sdf2.format(date);
    }

    //Method to convert a Date from one "dd-MMMM-yy" to "dd"
    public static String getDate(String dateInString) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        Date date = sdf1.parse(dateInString);
        return sdf2.format(date);

    }
}
