package utils;


import entity.CsvHeadsDto;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 9:20
 **/
public class CsvHeaderHelper {


    public static String genCsvHeader(Class cls){

        Field[] fields = cls.getDeclaredFields();
        String[] heads = new String[fields.length];
        for (int i =0; i < fields.length; i++){
            heads[i] = fields[i].getName();

        }
        return String.join(",",heads);
    }


}
