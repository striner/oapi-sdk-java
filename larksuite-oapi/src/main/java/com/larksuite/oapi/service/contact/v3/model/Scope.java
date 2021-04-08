// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Scope {
    @SerializedName("departments")
    private Department[] departments;
    @SerializedName("users")
    private User[] users;
    @SerializedName("user_groups")
    private UserGroup[] userGroups;

    public Department[] getDepartments() {
        return this.departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public User[] getUsers() {
        return this.users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public UserGroup[] getUserGroups() {
        return this.userGroups;
    }

    public void setUserGroups(UserGroup[] userGroups) {
        this.userGroups = userGroups;
    }

}
