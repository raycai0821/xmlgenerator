package xmlgenerator;

import entity.CsvHeadsDto;
import org.junit.Test;
import utils.CsvHeaderHelper;
import utils.FileUtile;

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
        List<String> rowContent = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            csvHeadsDto.setDebtorReference("1");
            csvHeadsDto.setDebtorMemberCode("1");
            csvHeadsDto.setCurrency("1");
            csvHeadsDto.setAmount("1");
            csvHeadsDto.setPurpose("1");
            csvHeadsDto.setRequestedExecutionDate("1");
            csvHeadsDto.setCreditorIdType("4");
            csvHeadsDto.setCreditorId("4");
            csvHeadsDto.setCreditorName("4");
            csvHeadsDto.setCreditorAccountNumber("3");
            csvHeadsDto.setCreditorIban("2");
            csvHeadsDto.setCreditorBankIdentificationCode("3");
            csvHeadsDto.setClearingSystemId("1");
            csvHeadsDto.setClearingSystemNumber("4");
            csvHeadsDto.setCreditorBankName("4");
            csvHeadsDto.setCreditorBankCountry("4");
            csvHeadsDto.setCreditorBankAddressLineOne("4");
            csvHeadsDto.setCreditorBankAddressLineTwo("4");
            csvHeadsDto.setCreditorBankAddressLineThree("4");
            csvHeadsDto.setRemittanceInformation("4");

            rowContent.add(csvHeadsDto.toRow());

        }

        return rowContent;
    }
//
//    @Test
//    public void genCSV(){
//        FileUtile.csvWriter(CsvHeaderHelper.genCsvHeader(CsvHeadsDto.class),setContents(),".csv");
//    }

}





