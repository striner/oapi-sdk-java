// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.optical_char_recognition.v1.model;
import com.google.gson.annotations.SerializedName;

public class ImageBasicRecognizeReqBody {
    @SerializedName("image")
    private String image;
    @SerializedName("image_key")
    private String imageKey;

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageKey() {
        return this.imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

}
