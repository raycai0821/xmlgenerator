package utils;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leifeng.cai
 **/
public class DateUtile {
    /*
     *@description 毫秒1600235962463
     * */
    public static String getTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    /*
     * 2007-3-3
     * */
    public static String getDate() {
        return DateFormat.getDateInstance().format(new Date());
    }
    /*
     * @description yyyy-MM-ddTHH:mm:ss
     * */

    public static String getFormateDate() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date());
    }
    /*
     * @description 20200916152948
     * */

    public static String getSimpleDateFormat() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }


//    @Test
//    public void testGetFormateDate() {
//        System.out.println(new DateUtile().getSimpleDateFormat());
//    }


}
