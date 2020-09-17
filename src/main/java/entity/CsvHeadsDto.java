package entity;

import lombok.Data;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 8:56
 **/

@Data
public class CsvHeadsDto  {

    private String debtorReference;

    private String debtorMemberCode;

    private String currency;

    private String amount;

    private String purpose;

    private String requestedExecutionDate;

    private String creditorIdType;

    private String creditorId;

    private String creditorName;

    private String creditorAccountNumber;

    private String creditorIban;

    private String creditorBankIdentificationCode;

    private String clearingSystemId;

    private String clearingSystemNumber;

    private String creditorBankName;

    private String creditorBankCountry;

    private String creditorBankAddressLineOne;

    private String creditorBankAddressLineTwo;

    private String creditorBankAddressLineThree;

    private String remittanceInformation;


    public String toRow() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", this.debtorReference, this.debtorMemberCode,
                this.currency, this.amount, this.purpose, this.requestedExecutionDate, this.creditorIdType, this.creditorId, this.creditorName,
                this.creditorAccountNumber, this.creditorIban, this.creditorBankIdentificationCode, this.clearingSystemId, this.clearingSystemNumber,
                this.creditorBankName, this.creditorBankCountry, this.creditorBankAddressLineOne, this.creditorBankAddressLineTwo,
                this.creditorBankAddressLineThree, this.remittanceInformation);
    }
}
