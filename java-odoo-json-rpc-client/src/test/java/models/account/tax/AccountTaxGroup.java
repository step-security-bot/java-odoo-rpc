
/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.models.account.tax;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCountry;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.tax.group")
public class AccountTaxGroup implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("pos_receipt_label")
        private String posReceiptLabel;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("preceding_subtotal")
        private String precedingSubtotal;
    

    
        private Account taxReceivableAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("tax_receivable_account_id")
        private OdooId taxReceivableAccountId;
    

    
        private Account taxPayableAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("tax_payable_account_id")
        private OdooId taxPayableAccountId;
    

    
        private Account advanceTaxPaymentAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("advance_tax_payment_account_id")
        private OdooId advanceTaxPaymentAccountId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    


    public AccountTaxGroup() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getPosReceiptLabel() {
        return posReceiptLabel;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPrecedingSubtotal() {
        return precedingSubtotal;
    }

    public Account getTaxReceivableAccountIdAsObject() {
        return taxReceivableAccountIdAsObject;
    }

    public OdooId getTaxReceivableAccountId() {
        return taxReceivableAccountId;
    }

    public Account getTaxPayableAccountIdAsObject() {
        return taxPayableAccountIdAsObject;
    }

    public OdooId getTaxPayableAccountId() {
        return taxPayableAccountId;
    }

    public Account getAdvanceTaxPaymentAccountIdAsObject() {
        return advanceTaxPaymentAccountIdAsObject;
    }

    public OdooId getAdvanceTaxPaymentAccountId() {
        return advanceTaxPaymentAccountId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setPosReceiptLabel(String posReceiptLabel) {
        this.posReceiptLabel = posReceiptLabel;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPrecedingSubtotal(String precedingSubtotal) {
        this.precedingSubtotal = precedingSubtotal;
    }

    public void setTaxReceivableAccountIdAsObject(Account taxReceivableAccountIdAsObject) {
        this.taxReceivableAccountIdAsObject = taxReceivableAccountIdAsObject;
    }

    public void setTaxReceivableAccountId(OdooId taxReceivableAccountId) {
        this.taxReceivableAccountId = taxReceivableAccountId;
    }

    public void setTaxPayableAccountIdAsObject(Account taxPayableAccountIdAsObject) {
        this.taxPayableAccountIdAsObject = taxPayableAccountIdAsObject;
    }

    public void setTaxPayableAccountId(OdooId taxPayableAccountId) {
        this.taxPayableAccountId = taxPayableAccountId;
    }

    public void setAdvanceTaxPaymentAccountIdAsObject(Account advanceTaxPaymentAccountIdAsObject) {
        this.advanceTaxPaymentAccountIdAsObject = advanceTaxPaymentAccountIdAsObject;
    }

    public void setAdvanceTaxPaymentAccountId(OdooId advanceTaxPaymentAccountId) {
        this.advanceTaxPaymentAccountId = advanceTaxPaymentAccountId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}