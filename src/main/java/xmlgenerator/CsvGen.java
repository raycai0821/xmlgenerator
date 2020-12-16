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
        for (int i = 1; i < 100; i++) {
            csvHeadsEntity.setDebtorReference(RandomSeq.getRandmSeq());
            csvHeadsEntity.setClientId("CEHK000266");
            if (i % 2 == 0) {
                csvHeadsEntity.setCurrency("GBP");
                csvHeadsEntity.setCreditorBankCountry("US");
                csvHeadsEntity.setPurpose("VAT");
            } else {
                csvHeadsEntity.setCurrency("GBP");
                csvHeadsEntity.setCreditorBankCountry("US");
                csvHeadsEntity.setPurpose("VAT");
            }
//            csvHeadsEntity.setAmount(String.valueOf(RandomNumUtile.getRandomNum()));
            csvHeadsEntity.setAmount("100");

            csvHeadsEntity.setRequestedExecutionDate(DateUtile.getDate());
            csvHeadsEntity.setCreditorIdType("2");
            csvHeadsEntity.setCreditorId("2");
            csvHeadsEntity.setCreditorName("raytest");
            csvHeadsEntity.setCreditorAccountNumber("DK4789000049910549");
            csvHeadsEntity.setCreditorIban("DK4789000049910549");
            csvHeadsEntity.setCreditorBankBic("CITIHKHX");
            csvHeadsEntity.setClearingSystemType("GBDSC");
            csvHeadsEntity.setClearingSystemNumber("031100209");
            csvHeadsEntity.setCreditorBankName("raytestbank");
            csvHeadsEntity.setCreditorBankCountry("HK");
            csvHeadsEntity.setCreditorBankAddressLineOne("bankSS1+ADDRESS2");
            csvHeadsEntity.setCreditorBankAddressLineTwo("bankESS2+adddd");
            csvHeadsEntity.setCreditorBankAddressLineThree("ADDRESS3+ggggg");
            csvHeadsEntity.setCreditorAddressLineOne("CreditoneOne+CreditorAddressLineOne");
            csvHeadsEntity.setCreditorAddressLineTwo("CrediLine2+CreditorAddressLine2");
            csvHeadsEntity.setCreditorAddressLineThree("CredrLine3+CreditorAddressLine3");
            csvHeadsEntity.setRemittanceInformationLineOne("remitinfo1");
            csvHeadsEntity.setRemittanceInformationLineTwo("remitinfoline2");
            csvHeadsEntity.setRemittanceInformationLineThree("remitinfoline3");
            rowContent.add(csvHeadsEntity.toRow());
        }
        return rowContent;
    }

    @Test
    public void genCSV() {
        FileUtile.csvWriter(CsvHeaderHelper.genCsvHeader(CsvHeadsEntity.class), setContents(), ".csv");
    }
}





