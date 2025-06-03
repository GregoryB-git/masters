/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.photo;

import com.vk.sdk.api.VKUploadBase;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKJsonOperation;
import java.io.File;

public abstract class VKUploadPhotoBase
extends VKUploadBase {
    private static final long serialVersionUID = -4566961568409572159L;
    public long mAlbumId;
    public long mGroupId;
    public File[] mImages;
    public long mUserId;

    @Override
    public VKJsonOperation getUploadOperation(String string) {
        return new VKJsonOperation(VKHttpClient.fileUploadRequest(string, this.mImages));
    }
}

