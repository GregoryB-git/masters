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
import com.vk.sdk.util.VKUtil;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class VKUploadWallPhotoRequest
extends VKUploadPhotoBase {
    private static final long serialVersionUID = 4732771149932923938L;

    public VKUploadWallPhotoRequest(VKUploadImage vKUploadImage, long l4, int n4) {
        this.mUserId = l4;
        this.mGroupId = n4;
        this.mImages = new File[]{vKUploadImage.getTmpFile()};
    }

    public VKUploadWallPhotoRequest(File file, long l4, int n4) {
        this.mUserId = l4;
        this.mGroupId = n4;
        this.mImages = new File[]{file};
    }

    public VKUploadWallPhotoRequest(VKUploadImage[] vKUploadImageArray, long l4, int n4) {
        this.mUserId = l4;
        this.mGroupId = n4;
        this.mImages = new File[vKUploadImageArray.length];
        for (n4 = 0; n4 < vKUploadImageArray.length; ++n4) {
            this.mImages[n4] = vKUploadImageArray[n4].getTmpFile();
        }
    }

    @Override
    public VKRequest getSaveRequest(JSONObject object) {
        long l4;
        block3: {
            try {
                VKApiPhotos vKApiPhotos = VKApi.photos();
                VKParameters vKParameters = new VKParameters(VKJsonHelper.toMap((JSONObject)object));
                object = vKApiPhotos.saveWallPhoto(vKParameters);
                l4 = this.mUserId;
                if (l4 == 0L) break block3;
            }
            catch (JSONException jSONException) {
                return null;
            }
            ((VKRequest)object).addExtraParameters(VKUtil.paramsFrom("user_id", l4));
        }
        if ((l4 = this.mGroupId) != 0L) {
            ((VKRequest)object).addExtraParameters(VKUtil.paramsFrom("group_id", l4));
        }
        return object;
    }

    @Override
    public VKRequest getServerRequest() {
        if (this.mGroupId != 0L) {
            return VKApi.photos().getWallUploadServer(this.mGroupId);
        }
        return VKApi.photos().getWallUploadServer();
    }
}

