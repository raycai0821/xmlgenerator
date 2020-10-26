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
        for (int i = 0; i < 2; i++) {
            csvHeadsEntity.setDebtorReference(RandomSeq.getRandmSeq());
            csvHeadsEntity.setDebtorMemberCode("1");
            csvHeadsEntity.setCurrency("USD");
            csvHeadsEntity.setAmount(String.valueOf(RandomNumUtile.getRandomNum()));
            csvHeadsEntity.setPurpose("VAT");
            csvHeadsEntity.setRequestedExecutionDate(DateUtile.getDate());
            csvHeadsEntity.setCreditorIdType("");
            csvHeadsEntity.setCreditorId("");
            csvHeadsEntity.setCreditorName("raytest");
            csvHeadsEntity.setCreditorAccountNumber("123456789012345");
            csvHeadsEntity.setCreditorIban("");
            csvHeadsEntity.setCreditorBankIdentificationCode("CITIHKHX");
            csvHeadsEntity.setClearingSystemType("GBDSC");
            csvHeadsEntity.setClearingSystemNumber("4");
            csvHeadsEntity.setCreditorBankName("BANKTEST");
            csvHeadsEntity.setCreditorBankCountry("HK");
            csvHeadsEntity.setCreditorBankAddressLineOne("ADDRESSONE");
            csvHeadsEntity.setCreditorBankAddressLineTwo("ADDRESSTWO");
            csvHeadsEntity.setCreditorBankAddressLineThree("ADDRESSTHREE");
            csvHeadsEntity.setCreditorAddressLineOne("CreditorAddressLineOne");
            csvHeadsEntity.setCreditorAddressLineTwo("CreditorAddressLineTwo");
            csvHeadsEntity.setCreditorAddressLineThree("CreditorAddressLineThree");
            csvHeadsEntity.setRemittanceInformation("RATESTINFO");
            rowContent.add(csvHeadsEntity.toRow());
        }
        return rowContent;
    }
    @Test
    public void genCSV() {
        FileUtile.csvWriter(CsvHeaderHelper.genCsvHeader(CsvHeadsEntity.class), setContents(), ".csv");
    }
}





