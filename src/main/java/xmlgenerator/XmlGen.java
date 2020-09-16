package xmlgenerator;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import utils.DateUtile;
import utils.FileUtile;
import utils.RandomNumUtile;

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
        /*
        * GrpHdr下的子节点
        *         * */
        Element msgId = GrpHdr.addElement("MsgId");
        msgId.setText("20170321CB0000000");
        Element creDtTm = GrpHdr.addElement("CreDtTm");
        creDtTm.setText(new DateUtile().getFormateDate());
        Element nbOfTxs = GrpHdr.addElement("NbOfTxs");
        Element initgPty = GrpHdr.addElement("InitgPty");

        /*
        * 创建CstmrCdtTrfInitn的第二个子节点PmtInf
        * */

        Element PmtInf = CstmrCdtTrfInitn.addElement("PmtInf");
        /*
        * 创建PmtInf的子节点
        * */
        Element PmtInfId = PmtInf.addElement("PmtInfId");
        PmtInfId.setText("1111");
        Element PmtMtd = PmtInf.addElement("PmtMtd");
        Element PmtTpInf = PmtInf.addElement("PmtTpInf");
        /*
         * 创建子节点pmtinf的子节点
         * */
        Element SvcLvl = PmtTpInf.addElement("SvcLvl");
        Element Cd = SvcLvl.addElement("Cd");
        Element ReqdExctnDt = PmtInf.addElement("ReqdExctnDt");
        Element Dbtr = PmtInf.addElement("Dbtr");
        Element Nm = Dbtr.addElement("Nm");
        Nm.setText("TEST ORDERING PARTY NAME");
        Element DbtrAcct = PmtTpInf.addElement("DbtrAcct");
        Element Id = DbtrAcct.addElement("Id");
        Element Othr = Id.addElement("Othr");
        Element Othr_Id =  Id.addElement("Id");
        Othr_Id.setText("1234567890");
        Element DbtrAgt = PmtInf.addElement("PmtInf");
        Element FinInstnId = DbtrAgt.addElement("FinInstnId");
        Element BIC = FinInstnId.addElement("BIC");
        Element PstlAdr = FinInstnId.addElement("PstlAdr");
        Element Ctry = PstlAdr.addElement("Ctry");

        Element CdtTrfTxInf = PmtInf.addElement("CdtTrfTxInf");
        Element PmtId = CdtTrfTxInf.addElement("PmtId");
        Element EndToEndId = PmtId.addElement("EndToEndId");
        EndToEndId.setText("HKXXX800000001");
        Element Amt = CdtTrfTxInf.addElement("Amt");
        Element InstdAmt = Amt.addElement("InstdAmt");
        InstdAmt.addAttribute("Ccy", "USD").setText(RandomNumUtile.getRandomNum());
        Element ChrgBr = CdtTrfTxInf.addElement("ChrgBr");
        ChrgBr.setText("SHAR");
        Element CdtrAgt = CdtTrfTxInf.addElement("CdtTrfTxInf");
        Element CdtrAgt_FinInstnId = CdtrAgt.addElement("FinInstnId");
        Element CdtrAgt_FinInstnId_BIC = CdtrAgt_FinInstnId.addElement("BIC");
        CdtrAgt_FinInstnId_BIC.setText("CITITHBX");
        Element CdtrAgt_FinInstnId_Nm = CdtrAgt_FinInstnId.addElement("Nm");
        Element CdtrAgt_FinInstnId_PstlAdr = CdtrAgt_FinInstnId.addElement("PstlAdr");
        Element CdtrAgt_FinInstnId_PstlAdr_AdrTp = CdtrAgt_FinInstnId_PstlAdr.addElement("AdrTp");
        Element CdtrAgt_FinInstnId_PstlAdr_Ctry = CdtrAgt_FinInstnId_PstlAdr.addElement("Ctry");
        Element CdtrAgt_FinInstnId_PstlAdr_AdrLine = CdtrAgt_FinInstnId_PstlAdr.addElement("AdrLine");
        Element CdtTrfTxInf_Cdtr = CdtTrfTxInf.addElement("Cdtr");
        Element CdtTrfTxInf_Cdtr_Nm = CdtTrfTxInf_Cdtr.addElement("Nm");
        Element CdtTrfTxInf_Cdtr_PstlAdr = CdtTrfTxInf_Cdtr.addElement("PstlAdr");
        Element CdtTrfTxInf_Cdtr_PstlAdr_AdrTp = CdtTrfTxInf_Cdtr_PstlAdr.addElement("AdrTp");
        Element CdtTrfTxInf_Cdtr_PstlAdr_Ctry = CdtTrfTxInf_Cdtr_PstlAdr.addElement("Ctry");
        Element CdtTrfTxInf_Cdtr_PstlAdr_AdrLine = CdtTrfTxInf_Cdtr_PstlAdr.addElement("AdrLine");
        Element CdtTrfTxInf_Cdtr_PstlAdr_AdrLine1 = CdtTrfTxInf_Cdtr_PstlAdr.addElement("AdrLine");
        Element CdtTrfTxInf_CdtrAcct = CdtTrfTxInf.addElement("CdtrAcct");
        Element CdtTrfTxInf_CdtrAcct_Id = CdtTrfTxInf_CdtrAcct.addElement("Id");
        Element CdtTrfTxInf_CdtrAcct_Id_Othr = CdtTrfTxInf_CdtrAcct_Id.addElement("Othr");
        Element CdtTrfTxInf_CdtrAcct_Id_Othr_Id = CdtTrfTxInf_CdtrAcct_Id_Othr.addElement("Id");
        Element CdtTrfTxInf_RmtInf = CdtTrfTxInf.addElement("RmtInf");
        Element CdtTrfTxInf_RmtInf_Ustrd = CdtTrfTxInf_RmtInf.addElement("Ustrd");







        new FileUtile().xmlWriter(document);


    }

}



