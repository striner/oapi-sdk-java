// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.speech_to_text.v1.model;
import com.google.gson.annotations.SerializedName;

public class FileConfig {
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("format")
    private String format;
    @SerializedName("engine_type")
    private String engineType;

    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

}