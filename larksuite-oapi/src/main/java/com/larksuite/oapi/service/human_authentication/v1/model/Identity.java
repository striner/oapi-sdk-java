// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.human_authentication.v1.model;
import com.google.gson.annotations.SerializedName;

public class Identity {
    @SerializedName("identity_name")
    private String identityName;
    @SerializedName("identity_code")
    private String identityCode;
    @SerializedName("mobile")
    private String mobile;

    public String getIdentityName() {
        return this.identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    public String getIdentityCode() {
        return this.identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
