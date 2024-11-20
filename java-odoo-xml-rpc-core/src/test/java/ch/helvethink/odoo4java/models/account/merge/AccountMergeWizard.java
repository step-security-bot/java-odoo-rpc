
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

package ch.helvethink.odoo4java.models.account.merge;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.merge.wizard.AccountMergeWizardLine;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.merge.wizard")
public class AccountMergeWizard implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<Account> accountIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_ids")
        private List<Integer> accountIds;
    

    
        private List<AccountMergeWizardLine> wizardLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.merge.wizard.AccountMergeWizardLine")
        @OdooModel("account.merge.wizard.AccountMergeWizardLine")
        @JsonProperty("wizard_line_ids")
        private List<Integer> wizardLineIds;
    

    
        @JsonProperty("is_group_by_name")
        private boolean isIsGroupByName;
    

    
        @JsonProperty("disable_merge_button")
        private boolean isDisableMergeButton;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public AccountMergeWizard() {
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

    public List<Account> getAccountIdsAsList() {
        return accountIdsAsList;
    }

    public List<Integer> getAccountIds() {
        return accountIds;
    }

    public List<AccountMergeWizardLine> getWizardLineIdsAsList() {
        return wizardLineIdsAsList;
    }

    public List<Integer> getWizardLineIds() {
        return wizardLineIds;
    }

    public boolean getIsIsGroupByName() {
        return isIsGroupByName;
    }

    public boolean getIsDisableMergeButton() {
        return isDisableMergeButton;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
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

    public void setAccountIdsAsList(List<Account> accountIdsAsList) {
        this.accountIdsAsList = accountIdsAsList;
    }

    public void setAccountIds(List<Integer> accountIds) {
        this.accountIds = accountIds;
    }

    public void setWizardLineIdsAsList(List<AccountMergeWizardLine> wizardLineIdsAsList) {
        this.wizardLineIdsAsList = wizardLineIdsAsList;
    }

    public void setWizardLineIds(List<Integer> wizardLineIds) {
        this.wizardLineIds = wizardLineIds;
    }

    public void setIsIsGroupByName(boolean isIsGroupByName) {
        this.isIsGroupByName = isIsGroupByName;
    }

    public void setIsDisableMergeButton(boolean isDisableMergeButton) {
        this.isDisableMergeButton = isDisableMergeButton;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}