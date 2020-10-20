package xmlgenerator;

import entity.CsvHeadsDto;
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

        CsvHeadsDto csvHeadsDto = new CsvHeadsDto();
        List<String> rowContent = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            csvHeadsDto.setDebtorReference(RandomSeq.getRandmSeq());
            csvHeadsDto.setDebtorMemberCode("1");
            csvHeadsDto.setCurrency("USD");
            csvHeadsDto.setAmount(String.valueOf(RandomNumUtile.getRandomNum()));
            csvHeadsDto.setPurpose("1");
            csvHeadsDto.setRequestedExecutionDate(DateUtile.getDate());
            csvHeadsDto.setCreditorIdType("");
            csvHeadsDto.setCreditorId("");
            csvHeadsDto.setCreditorName("raytest");
            csvHeadsDto.setCreditorAccountNumber("123456789012345");
            csvHeadsDto.setCreditorIban("");
            csvHeadsDto.setCreditorBankIdentificationCode("CITIHKHX");
            csvHeadsDto.setClearingSystemId("UK Domestic Sort Code");
            csvHeadsDto.setClearingSystemNumber("4");
            csvHeadsDto.setCreditorBankName("BANKTEST");
            csvHeadsDto.setCreditorBankCountry("HK");
            csvHeadsDto.setCreditorBankAddressLineOne("ADDRESSONE");
            csvHeadsDto.setCreditorBankAddressLineTwo("ADDRESSONETWO");
            csvHeadsDto.setCreditorBankAddressLineThree("ADDRESSTHREE");
            csvHeadsDto.setRemittanceInformation("RATESTINFO");

            rowContent.add(csvHeadsDto.toRow());

        }

        return rowContent;
    }

    @Test
    public void genCSV() {
        FileUtile.csvWriter(CsvHeaderHelper.genCsvHeader(CsvHeadsDto.class), setContents(), ".csv");
    }

}





