// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
import com.google.gson.annotations.SerializedName;

public class RoomUpdateReqBody {
    @SerializedName("name")
    private String name;
    @SerializedName("capacity")
    private Integer capacity;
    @SerializedName("is_disabled")
    private Boolean isDisabled;
    @SerializedName("custom_room_id")
    private String customRoomId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getCustomRoomId() {
        return this.customRoomId;
    }

    public void setCustomRoomId(String customRoomId) {
        this.customRoomId = customRoomId;
    }

}
