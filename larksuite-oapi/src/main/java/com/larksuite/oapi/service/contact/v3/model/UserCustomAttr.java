// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class UserCustomAttr {
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;
    @SerializedName("value")
    private UserCustomAttrValue value;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserCustomAttrValue getValue() {
        return this.value;
    }

    public void setValue(UserCustomAttrValue value) {
        this.value = value;
    }

}
