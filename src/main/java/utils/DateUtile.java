package utils;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leifeng.cai
 **/
public class DateUtile {
    /**
     *日期格式 毫秒1600235962463
      */
    public static String getTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    /**
     *日期格式 yyyyMMdd
     */
    public static String getDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    /**
     * 日期格式 yyyy-MM-ddTHH:mm:ss
     */

    public static String getFormateDate() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date());
    }
    /**
     *  日期格式：yyyyMMddHHmmss
      */

    public static String getSimpleDateFormat() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }


//    @Test
//    public void testGetFormateDate() {
//        System.out.println(new DateUtile().getSimpleDateFormat());
//    }


}
