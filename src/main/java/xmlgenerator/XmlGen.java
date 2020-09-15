package xmlgenerator;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import utils.FileUtile;

import javax.sql.rowset.spi.XmlWriter;
import java.io.*;



/**
 * @author leifeng.cai
 **/
public class XmlGen {

    public static void main(String[] args) {
        new XmlGen().genXml();
    }

    public void genXml() {

        // 1、创建document对象
        Document document = DocumentHelper.createDocument();
        //创建根节点
        Element root = document.addElement("Document");
        root.setText("xmlns=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.03\"");
        /*
        * 创建第一个子节点 CstmrCdtTrfInitn;
        * */
        Element CstmrCdtTrfInitn = root.addElement("CstmrCdtTrfInitn");
        /*
        * 创建CstmrCdtTrfInitn的第一个子节点CstmrCdtTrfInitn
        * */
        Element GrpHdr = CstmrCdtTrfInitn.addElement("GrpHdr");

        Element msgId = GrpHdr.addElement("MsgId");
        msgId.setText("20170321CB0000000");
        Element creDtTm = GrpHdr.addElement("CreDtTm");
        creDtTm.setText("2020");
        Element nbOfTxs = GrpHdr.addElement("NbOfTxs");
        Element initgPty = GrpHdr.addElement("InitgPty");

        /*
        * 创建CstmrCdtTrfInitn的第二个子节点PmtInf
        * */

        Element pmtInf = CstmrCdtTrfInitn.addElement("PmtInf");
        /*
        * 创建子节点pmtinf的子节点
        * */
        Element PmtInfId = pmtInf.addElement("PmtInfId");
        /*
        * 自定义XML样式
        * */
        OutputFormat format = new OutputFormat();
        format.setIndent(true); // 行缩进
        format.setIndentSize(4);
        format.setNewlines(true); // 一个结点为一行
        format.setTrimText(true); // 去重空格
        format.setPadText(true);
        format.setNewLineAfterDeclaration(false);

        try {
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new FileUtile().createFile()), format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
            xmlWriter.close();
            System.out.println("文件生成成功");
        } catch (Exception e) {
            System.out.println("异常了");;
        }


    }

}



