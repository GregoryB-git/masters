/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.photo;

import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiPhotos;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.api.photo.VKUploadPhotoBase;
import com.vk.sdk.util.VKJsonHelper;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class VKUploadMessagesPhotoRequest
extends VKUploadPhotoBase {
    private static final long serialVersionUID = 1L;

    public VKUploadMessagesPhotoRequest(VKUploadImage vKUploadImage) {
        this.mImages = new File[]{vKUploadImage.getTmpFile()};
    }

    public VKUploadMessagesPhotoRequest(File file) {
        this.mImages = new File[]{file};
    }

    @Override
    public VKRequest getSaveRequest(JSONObject object) {
        try {
            VKApiPhotos vKApiPhotos = VKApi.photos();
            VKParameters vKParameters = new VKParameters(VKJsonHelper.toMap(object));
            object = vKApiPhotos.saveMessagesPhoto(vKParameters);
            return object;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    @Override
    public VKRequest getServerRequest() {
        return VKApi.photos().getMessagesUploadServer();
    }
}

