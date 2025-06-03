/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.docs;

import com.vk.sdk.api.VKUploadBase;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKJsonOperation;
import java.io.File;

public abstract class VKUploadDocBase
extends VKUploadBase {
    public File mDoc;
    public long mGroupId;

    @Override
    public VKJsonOperation getUploadOperation(String string) {
        return new VKJsonOperation(VKHttpClient.docUploadRequest(string, this.mDoc));
    }
}

