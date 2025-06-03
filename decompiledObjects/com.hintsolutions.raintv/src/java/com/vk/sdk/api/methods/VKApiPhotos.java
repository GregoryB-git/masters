/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VKPhotoArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKPhotoArray;
import com.vk.sdk.util.VKUtil;

public class VKApiPhotos
extends VKApiBase {
    public VKRequest getMessagesUploadServer() {
        return this.prepareRequest("getMessagesUploadServer", null);
    }

    @Override
    public String getMethodsGroup() {
        return "photos";
    }

    public VKRequest getUploadServer(long l) {
        return this.prepareRequest("getUploadServer", VKUtil.paramsFrom("album_id", String.valueOf((long)l)));
    }

    public VKRequest getUploadServer(long l, long l2) {
        return this.prepareRequest("getUploadServer", VKUtil.paramsFrom("album_id", l, "group_id", l2));
    }

    public VKRequest getWallUploadServer() {
        return this.prepareRequest("getWallUploadServer", null);
    }

    public VKRequest getWallUploadServer(long l) {
        return this.prepareRequest("getWallUploadServer", VKUtil.paramsFrom("group_id", l));
    }

    public VKRequest save(VKParameters vKParameters) {
        return this.prepareRequest("save", vKParameters, VKPhotoArray.class);
    }

    public VKRequest saveMessagesPhoto(VKParameters vKParameters) {
        return this.prepareRequest("saveMessagesPhoto", vKParameters, VKPhotoArray.class);
    }

    public VKRequest saveWallPhoto(VKParameters vKParameters) {
        return this.prepareRequest("saveWallPhoto", vKParameters, VKPhotoArray.class);
    }
}

