package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @author leifeng.cai
 **/
public class RandomNumUtile {
    public static BigDecimal getRandomNum() {
        Random random = new Random();
      /*
      * 随机double类型乘以随机int类型
      * */
        return new BigDecimal(random.nextInt(10000000)).setScale(0, RoundingMode.HALF_UP);
    }

//    @Test
//    public void testRadom() {
//        for (int i = 0; i < 10;i++ ) {
//            System.out.println(new RandomNum().getRandomNum());
//        }

//    }
}

