package utils;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author leifeng.cai
 **/
public class RandomNumUtile {
    public static String getRandomNum() {
        Random random = new Random();
      /*
      * 随机double类型乘以随机int类型
      * */
        return String.valueOf(new BigDecimal(random.nextDouble() * random.nextInt(10000)).setScale(2, RoundingMode.HALF_UP));
    }

//    @Test
//    public void testRadom() {
//        for (int i = 0; i < 10;i++ ) {
//            System.out.println(new RandomNum().getRandomNum());
//        }

//    }
}

