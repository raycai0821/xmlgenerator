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
            //截取地址属性名字，最终文件中字段名保持一致
            if (fields[i].getName().contains("reditorBankAddressLine")){
                heads[i] = "reditorBankAddressLine";
            }else if (fields[i].getName().contains("CreditorAddressLine")){
                heads[i] = "creditorAddressLine";
            }else
            heads[i] = fields[i].getName();

        }
        return String.join(",",heads);
    }


}
