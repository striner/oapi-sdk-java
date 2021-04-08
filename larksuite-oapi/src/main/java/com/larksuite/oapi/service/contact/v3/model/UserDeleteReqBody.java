// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class UserDeleteReqBody {
    @SerializedName("department_chat_acceptor_user_id")
    private String departmentChatAcceptorUserId;
    @SerializedName("external_chat_acceptor_user_id")
    private String externalChatAcceptorUserId;
    @SerializedName("docs_acceptor_user_id")
    private String docsAcceptorUserId;
    @SerializedName("calendar_acceptor_user_id")
    private String calendarAcceptorUserId;
    @SerializedName("application_acceptor_user_id")
    private String applicationAcceptorUserId;
    @SerializedName("helpdesk_acceptor_user_id")
    private String helpdeskAcceptorUserId;

    public String getDepartmentChatAcceptorUserId() {
        return this.departmentChatAcceptorUserId;
    }

    public void setDepartmentChatAcceptorUserId(String departmentChatAcceptorUserId) {
        this.departmentChatAcceptorUserId = departmentChatAcceptorUserId;
    }

    public String getExternalChatAcceptorUserId() {
        return this.externalChatAcceptorUserId;
    }

    public void setExternalChatAcceptorUserId(String externalChatAcceptorUserId) {
        this.externalChatAcceptorUserId = externalChatAcceptorUserId;
    }

    public String getDocsAcceptorUserId() {
        return this.docsAcceptorUserId;
    }

    public void setDocsAcceptorUserId(String docsAcceptorUserId) {
        this.docsAcceptorUserId = docsAcceptorUserId;
    }

    public String getCalendarAcceptorUserId() {
        return this.calendarAcceptorUserId;
    }

    public void setCalendarAcceptorUserId(String calendarAcceptorUserId) {
        this.calendarAcceptorUserId = calendarAcceptorUserId;
    }

    public String getApplicationAcceptorUserId() {
        return this.applicationAcceptorUserId;
    }

    public void setApplicationAcceptorUserId(String applicationAcceptorUserId) {
        this.applicationAcceptorUserId = applicationAcceptorUserId;
    }

    public String getHelpdeskAcceptorUserId() {
        return this.helpdeskAcceptorUserId;
    }

    public void setHelpdeskAcceptorUserId(String helpdeskAcceptorUserId) {
        this.helpdeskAcceptorUserId = helpdeskAcceptorUserId;
    }

}
