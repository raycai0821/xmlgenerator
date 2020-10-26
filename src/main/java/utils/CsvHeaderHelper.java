package utils;


import java.lang.reflect.Field;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 9:20
 **/
public class CsvHeaderHelper {


    public static String genCsvHeader(Class cls){

        Field[] fields = cls.getDeclaredFields();
        String[] heads = new String[fields.length];
        int j = 1;
        int x = 1;
        for (int i =0; i < fields.length; i++){
            //截取地址属性名字，最终文件中字段名保持一致
            if (fields[i].getName().contains("creditorBankAddressLine")){
                heads[i] = "creditorBankAddressLine" + j;
                j++;
            }else if (fields[i].getName().contains("CreditorAddressLine")){
                heads[i] = "creditorAddressLine"+ x;
                x++;
            }else
            heads[i] = fields[i].getName();

        }
        return String.join(",",heads);
    }


}
