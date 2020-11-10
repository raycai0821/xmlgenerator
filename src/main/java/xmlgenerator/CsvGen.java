package xmlgenerator;

import entity.CsvHeadsEntity;
import org.junit.Test;
import utils.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 8:48
 **/
public class CsvGen {

    private static List<String> setContents() {

        CsvHeadsEntity csvHeadsEntity = new CsvHeadsEntity();
        List<String> rowContent = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            csvHeadsEntity.setDebtorReference(RandomSeq.getRandmSeq());
            csvHeadsEntity.setDebtorMemberCode("memberCode11123");
            if(1==0) {
                csvHeadsEntity.setCurrency("GBP");
                csvHeadsEntity.setCreditorBankCountry("GB");
                csvHeadsEntity.setPurpose("VAT");
            }else {
                csvHeadsEntity.setCurrency("GBP");
                csvHeadsEntity.setCreditorBankCountry("GB");
                csvHeadsEntity.setPurpose("TRANSFER TO OWN ACCOUNT");
            }
            csvHeadsEntity.setAmount(String.valueOf(RandomNumUtile.getRandomNum()));

            csvHeadsEntity.setRequestedExecutionDate(DateUtile.getDate());
            csvHeadsEntity.setCreditorIdType("");
            csvHeadsEntity.setCreditorId("");
            csvHeadsEntity.setCreditorName("raytest");
            csvHeadsEntity.setCreditorAccountNumber("DK4789000049910549");
            csvHeadsEntity.setCreditorIBAN("DK4789000049910549");
            csvHeadsEntity.setCreditorBankIdentificationCode("CITIHKHX");
            csvHeadsEntity.setClearingSystemType("GBDSC");
            csvHeadsEntity.setClearingSystemNumber("031100209");
            csvHeadsEntity.setCreditorBankName("raytestbank");
            csvHeadsEntity.setCreditorBankCountry("HK");
            csvHeadsEntity.setCreditorBankAddressLineOne("ADDRESSONE");
            csvHeadsEntity.setCreditorBankAddressLineTwo("");
            csvHeadsEntity.setCreditorBankAddressLineThree("");
            csvHeadsEntity.setCreditorAddressLineOne("CreditorAddressLineOne");
            csvHeadsEntity.setCreditorAddressLineTwo("");
            csvHeadsEntity.setCreditorAddressLineThree("");
            csvHeadsEntity.setRemittanceInformation("remitinfo");
            rowContent.add(csvHeadsEntity.toRow());
        }
        return rowContent;
    }
    @Test
    public void genCSV() {
        FileUtile.csvWriter(CsvHeaderHelper.genCsvHeader(CsvHeadsEntity.class), setContents(), ".csv");
    }
}





