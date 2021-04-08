// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

import java.util.Map;

public class UserDeletedEvent extends BaseEventV2{
    @SerializedName("event")
    private UserDeletedEventData event;

    public UserDeletedEventData getEvent() {
        return this.event;
    }

    public void setEvent(UserDeletedEventData event) {
        this.event = event;
    }

}
