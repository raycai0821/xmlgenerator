package utils;

import java.io.File;

/**
 * @author leifeng.cai
 **/
public class FileUtile {

    public File createFile(){
        String path = "D:\\job\\xml\\";
        String filename = String.valueOf(System.currentTimeMillis());
        StringBuffer filePath = new StringBuffer();
        filePath.append(path);
        filePath.append(filename);
        filePath.append(".xml");
        System.out.println(filePath);
        return new File(String.valueOf(filePath));
    }
}
