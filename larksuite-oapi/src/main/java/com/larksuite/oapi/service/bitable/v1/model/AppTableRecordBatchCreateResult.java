// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.google.gson.annotations.SerializedName;

public class AppTableRecordBatchCreateResult {
    @SerializedName("records")
    private AppTableRecord[] records;

    public AppTableRecord[] getRecords() {
        return this.records;
    }

    public void setRecords(AppTableRecord[] records) {
        this.records = records;
    }

}
