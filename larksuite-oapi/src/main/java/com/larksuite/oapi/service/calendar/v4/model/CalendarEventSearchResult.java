// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class CalendarEventSearchResult {
    @SerializedName("items")
    private CalendarEvent[] items;
    @SerializedName("page_token")
    private String pageToken;

    public CalendarEvent[] getItems() {
        return this.items;
    }

    public void setItems(CalendarEvent[] items) {
        this.items = items;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

}
