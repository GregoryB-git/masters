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

public class VKUploadAlbumPhotoRequest
extends VKUploadPhotoBase {
    private static final long serialVersionUID = 5439648671595840976L;

    public VKUploadAlbumPhotoRequest(VKUploadImage vKUploadImage, long l4, long l5) {
        this.mAlbumId = l4;
        this.mGroupId = l5;
        this.mImages = new File[]{vKUploadImage.getTmpFile()};
    }

    public VKUploadAlbumPhotoRequest(File file, long l4, long l5) {
        this.mAlbumId = l4;
        this.mGroupId = l5;
        this.mImages = new File[]{file};
    }

    @Override
    public VKRequest getSaveRequest(JSONObject object) {
        long l4;
        block3: {
            try {
                VKApiPhotos vKApiPhotos = VKApi.photos();
                VKParameters vKParameters = new VKParameters(VKJsonHelper.toMap((JSONObject)object));
                object = vKApiPhotos.save(vKParameters);
                l4 = this.mAlbumId;
                if (l4 == 0L) break block3;
            }
            catch (JSONException jSONException) {
                return null;
            }
            ((VKRequest)object).addExtraParameters(VKUtil.paramsFrom("album_id", l4));
        }
        if ((l4 = this.mGroupId) != 0L) {
            ((VKRequest)object).addExtraParameters(VKUtil.paramsFrom("group_id", l4));
        }
        return object;
    }

    @Override
    public VKRequest getServerRequest() {
        if (this.mAlbumId != 0L && this.mGroupId != 0L) {
            return VKApi.photos().getUploadServer(this.mAlbumId, this.mGroupId);
        }
        return VKApi.photos().getUploadServer(this.mAlbumId);
    }
}

