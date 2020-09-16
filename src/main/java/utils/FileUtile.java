package utils;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.text.Format;

/**
 * @author leifeng.cai
 **/
public class FileUtile {

    public void xmlWriter(Document document){
        try {
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(createFile()), xmlFormat());
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
            xmlWriter.close();
            System.out.println("文件生成成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
     * 自定义XML样式
     * */
    private static OutputFormat xmlFormat(){

        OutputFormat format = new OutputFormat();
        format.setIndent(true); // 行缩进
        format.setIndentSize(4);
        format.setNewlines(true); // 一个结点为一行
        format.setTrimText(true); // 去重空格
        format.setPadText(true);
        format.setNewLineAfterDeclaration(false);
        return format;
    }

    private static File createFile(){
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
