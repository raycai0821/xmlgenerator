package xmlgenerator;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import utils.DateUtile;
import utils.FileUtile;
import utils.RandomNumUtile;
import utils.RandomSeq;

import java.lang.annotation.Documented;


/**
 * @author leifeng.cai
 **/
public class XmlGen {

    private static double sum = 0.00;
    private static int count = 0;
    Document document = DocumentHelper.createDocument();

    public static void main(String[] args) {
        new XmlGen().genRequestXml(2);
    }

    public void genRequestXml(int quantity) {

        //创建根节点
        Element root = document.addElement("Document","urn:iso:std:iso:20022:tech:xsd:pain.002.001.03");
        root.addNamespace("xsi","urn:iso:std:iso:20022:tech:xsd:pain.001.001.03");
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
        msgId.setText(RandomSeq.getRandmSeq());

        Element creDtTm = GrpHdr.addElement("CreDtTm");
        creDtTm.setText(DateUtile.getDate());
        Element initgPty = GrpHdr.addElement("InitgPty");
        /*
         * 创建CstmrCdtTrfInitn的第二个子节点PmtInf
         * */
        for (int i = 0; i < quantity; i++) {
            double randomAmt = RandomNumUtile.getRandomNum().doubleValue();
            sum += randomAmt;
            Element PmtInf = CstmrCdtTrfInitn.addElement("PmtInf");
            /*
             * 创建PmtInf的子节点
             * */
            Element PmtInfId = PmtInf.addElement("PmtInfId");
            PmtInfId.setText(RandomSeq.getRandmSeq());
            PmtInfId.setText(RandomSeq.getRandmSeq());
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
            Element Othr_Id = Othr.addElement("Id");
            Othr_Id.setText("1234567890");
            Element DbtrAgt = PmtInf.addElement("PmtInf");
            Element FinInstnId = DbtrAgt.addElement("FinInstnId");
            Element BIC = FinInstnId.addElement("BIC");
            Element PstlAdr = FinInstnId.addElement("PstlAdr");
            Element Ctry = PstlAdr.addElement("Ctry");

            Element CdtTrfTxInf = PmtInf.addElement("CdtTrfTxInf");
            Element PmtId = CdtTrfTxInf.addElement("PmtId");
            Element EndToEndId = PmtId.addElement("EndToEndId");
            EndToEndId.setText(RandomSeq.getRandmSeq());

            Element Amt = CdtTrfTxInf.addElement("Amt");
            Element InstdAmt = Amt.addElement("InstdAmt");
            InstdAmt.addAttribute("Ccy", "USD").setText(String.valueOf(randomAmt));
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
            count++;
        }

        Element nbOfTxs = GrpHdr.addElement("nbOfTxs");
        nbOfTxs.setText(String.valueOf(count));
        Element GrpHdr_CtrlSum = GrpHdr.addElement("CtrlSum");
        GrpHdr_CtrlSum.setText(String.valueOf(sum));

        new FileUtile().xmlWriter(document,".xml");

    }

    public void genFileResponseXml(){

        Element Document = document.addElement("Document");
        Document.setText("xmlns=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.03\"");
        Element CstmrPmtStsRpt = Document.addElement("CstmrPmtStsRpt");
        Element GrpHdr = CstmrPmtStsRpt.addElement("GrpHdr");
        Element MsgId = GrpHdr.addElement("MsgId");
        Element CreDtTm = GrpHdr.addElement("CreDtTm");
        Element InitgPty = GrpHdr.addElement("InitgPty");
        Element Id = InitgPty.addElement("Id");
        Element OrgId = Id.addElement("OrgId");
        Element BICOrBEI = OrgId.addElement("BICOrBEI");
        BICOrBEI.setText("CITIUS33");

        Element OrgnlGrpInfAndSts = Document.addElement("OrgnlGrpInfAndSts");
        Element OrgnlMsgId = OrgnlGrpInfAndSts.addElement("OrgnlMsgId");
        Element OrgnlMsgNmId = OrgnlGrpInfAndSts.addElement("OrgnlMsgNmId");
        Element OrgnlCreDtTm = OrgnlGrpInfAndSts.addElement("OrgnlCreDtTm");
        Element OrgnlNbOfTxs = OrgnlGrpInfAndSts.addElement("OrgnlNbOfTxs");
        Element OrgnlCtrlSum = OrgnlGrpInfAndSts.addElement("OrgnlCtrlSum");
        Element GrpSts = OrgnlGrpInfAndSts.addElement("GrpSts");
        Element StsRsnInf = OrgnlGrpInfAndSts.addElement("StsRsnInf");
        Element AddtlInf = StsRsnInf.addElement("AddtlInf");

        new FileUtile().xmlWriter(document,".xml");

    }

    public void genTxnResponseXml(){

        Element Document = document.addElement("Document");
        Document.setText("xmlns=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.03\"");
        Element CstmrPmtStsRpt = Document.addElement("CstmrPmtStsRpt");
        Element GrpHdr = CstmrPmtStsRpt.addElement("GrpHdr");
        Element MsgId = GrpHdr.addElement("MsgId");
        Element CreDtTm = GrpHdr.addElement("CreDtTm");
        Element InitgPty = GrpHdr.addElement("InitgPty");
        Element Id = InitgPty.addElement("Id");
        Element OrgId = Id.addElement("OrgId");
        Element BICOrBEI = OrgId.addElement("BICOrBEI");
        BICOrBEI.setText("CITIUS33");
        Element OrgnlGrpInfAndSts = Document.addElement("OrgnlGrpInfAndSts");
        Element OrgnlMsgId = OrgnlGrpInfAndSts.addElement("OrgnlMsgId");
        Element OrgnlMsgNmId = OrgnlGrpInfAndSts.addElement("OrgnlMsgNmId");
        Element OrgnlCreDtTm = OrgnlGrpInfAndSts.addElement("OrgnlCreDtTm");
        Element OrgnlPmtInfAndSts = CstmrPmtStsRpt.addElement("OrgnlPmtInfAndSts");
        Element OrgnlPmtInfId = OrgnlPmtInfAndSts.addElement("OrgnlPmtInfId");
        Element TxInfAndSts = OrgnlPmtInfAndSts.addElement("TxInfAndSts");
        Element OrgnlInstrId = TxInfAndSts.addElement("OrgnlInstrId");
        Element OrgnlEndToEndId = TxInfAndSts.addElement("OrgnlEndToEndId");
        Element TxSts = TxInfAndSts.addElement("TxSts");
        Element StsRsnInf = TxInfAndSts.addElement("StsRsnInf");
        Element Orgtr = StsRsnInf.addElement("Orgtr");
        Element Nm = Orgtr.addElement("Nm");
        Element Rsn = StsRsnInf.addElement("Rsn");
        Element Cd = Rsn.addElement("Cd");
        Element AddtlInfOne = StsRsnInf.addElement("AddtlInf");
        Element AddtlInfTwo = StsRsnInf.addElement("AddtlInf");
        Element AddtlInfThree = StsRsnInf.addElement("AddtlInf");

        new FileUtile().xmlWriter(document,".xml");



    }

}



