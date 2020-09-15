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
     *
     * */
    public String getTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    /*
     * 2007-3-3
     * */
    public String getDate() {
        return DateFormat.getDateInstance().format(new Date());
    }
    /*
    * yyyy-MM-ddTHH:mm:ss
    * */

    public String getFormateDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

//    @Test
//    public void testGetFormateDate() {
//        System.out.println(new DateUtile().getFormateDate());
//    }



}
