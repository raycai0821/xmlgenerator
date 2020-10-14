package utils;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


import java.io.*;
import java.util.List;

/**
 * @author leifeng.cai
 **/
public class FileUtile {

    /*
     * xml文件生成
     * */

    public void xmlWriter(Document document, String fileType) {
        try {
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(createFile(fileType)), xmlFormat());
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
            xmlWriter.close();
            System.out.println("文件生成成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void csvWriter(String head, List<String> content, String fileType) {
        BufferedWriter csvWtriter = null;
        try {
            csvWtriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(createFile(fileType))));
            csvWtriter.write( head);
            csvWtriter.newLine();

            for (int i = 0; i < content.size(); i++) {

                csvWtriter.write(content.get(i));
                csvWtriter.newLine();
            }
            csvWtriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                csvWtriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /*
     * 自定义XML样式
     * */
    private static OutputFormat xmlFormat() {

        OutputFormat format = new OutputFormat();
        format.setIndent(true); // 行缩进
        format.setIndentSize(4);
        format.setNewlines(true); // 一个结点为一行
        format.setTrimText(true); // 去重空格
        format.setPadText(true);
        format.setNewLineAfterDeclaration(false);
        return format;
    }
    /**
     * 根据传参决定生成的文件格式
    */
    private static File createFile(String fileType) {
        String path = "D:\\job\\xml\\";
        String filename = DateUtile.getSimpleDateFormat();
        StringBuffer filePath = new StringBuffer();
        filePath.append(path);
        filePath.append(filename);
        filePath.append(fileType);
        System.out.println(filePath);
        return new File(String.valueOf(filePath));
    }
}
