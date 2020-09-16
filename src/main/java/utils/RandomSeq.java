package utils;

import java.util.UUID;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/16 14:01
 **/
public class RandomSeq {

    public static String getRandmSeq(){
            return UUID.randomUUID().toString().replaceAll("-","");

    }
}


