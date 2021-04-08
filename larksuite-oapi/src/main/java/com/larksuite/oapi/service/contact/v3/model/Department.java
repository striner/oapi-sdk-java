// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Department {
    @SerializedName("name")
    private String name;
    @SerializedName("i18n_name")
    private DepartmentI18nName iQXnName;
    @SerializedName("parent_department_id")
    private String parentDepartmentId;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("open_department_id")
    private String openDepartmentId;
    @SerializedName("leader_user_id")
    private String leaderUserId;
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("order")
    private Long order;
    @SerializedName("unit_ids")
    private String[] unitIds;
    @SerializedName("member_count")
    private Integer memberCount;
    @SerializedName("status")
    private DepartmentStatus status;
    @SerializedName("create_group_chat")
    private Boolean createGroupChat;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentI18nName getI18nName() {
        return this.iQXnName;
    }

    public void setI18nName(DepartmentI18nName iQXnName) {
        this.iQXnName = iQXnName;
    }

    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return this.openDepartmentId;
    }

    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getLeaderUserId() {
        return this.leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Long getOrder() {
        return this.order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public String[] getUnitIds() {
        return this.unitIds;
    }

    public void setUnitIds(String[] unitIds) {
        this.unitIds = unitIds;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public DepartmentStatus getStatus() {
        return this.status;
    }

    public void setStatus(DepartmentStatus status) {
        this.status = status;
    }

    public Boolean getCreateGroupChat() {
        return this.createGroupChat;
    }

    public void setCreateGroupChat(Boolean createGroupChat) {
        this.createGroupChat = createGroupChat;
    }

}
