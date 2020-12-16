package entity;

import lombok.Data;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 8:56
 **/

@Data
public class CsvHeadsEntity {

    private String debtorReference;

    private String clientId;

    private String currency;

    private String amount;

    private String purpose;

    private String requestedExecutionDate;

    private String creditorIdType;

    private String creditorId;

    private String creditorName;

    private String creditorAccountNumber;

    private String creditorIban;

    private String creditorBankBic;

    private String clearingSystemType;

    private String clearingSystemNumber;

    private String creditorBankName;

    private String creditorBankCountry;

    private String creditorBankAddressLineOne;

    private String creditorBankAddressLineTwo;

    private String creditorBankAddressLineThree;

    private String CreditorAddressLineOne;

    private String CreditorAddressLineTwo;

    private String CreditorAddressLineThree;

    private String remittanceInformationLineOne;

    private String remittanceInformationLineTwo;

    private String remittanceInformationLineThree;


    public String toRow() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", this.debtorReference, this.clientId,
                this.currency, this.amount, this.purpose, this.requestedExecutionDate, this.creditorIdType, this.creditorId, this.creditorName,
                this.creditorAccountNumber, this.creditorIban, this.creditorBankBic, this.clearingSystemType, this.clearingSystemNumber,
                this.creditorBankName, this.creditorBankCountry, this.creditorBankAddressLineOne, this.creditorBankAddressLineTwo,
                this.creditorBankAddressLineThree, this.CreditorAddressLineOne, this.CreditorAddressLineTwo, this.CreditorAddressLineThree, this.remittanceInformationLineOne,
                this.remittanceInformationLineTwo, this.remittanceInformationLineThree);
    }
}
