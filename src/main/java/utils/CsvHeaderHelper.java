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
        //银行地址字段列
        int j = 1;
        //收款人地址字段列
        int x = 1;
        //附言字段列
        int z = 1;
        for (int i =0; i < fields.length; i++){
            //截取地址属性名字，最终文件中字段名保持一致
            if (fields[i].getName().contains("creditorBankAddressLine")){
                heads[i] = "creditorBankAddressLine" + j;
                j++;
            }else if (fields[i].getName().contains("CreditorAddressLine")){
                heads[i] = "creditorAddressLine"+ x;
                x++;
            }else if (fields[i].getName().contains("remittanceInformationLine")){
                heads[i] = "remittanceInformationLine"+ z;
                z++;
            }else
            heads[i] = fields[i].getName();

        }
        return String.join(",",heads);
    }


}
