/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.docs.VKUploadDocRequest
 *  com.vk.sdk.api.docs.VKUploadWallDocRequest
 *  com.vk.sdk.api.model.VKDocsArray
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.docs.VKUploadDocRequest;
import com.vk.sdk.api.docs.VKUploadWallDocRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKDocsArray;
import com.vk.sdk.util.VKUtil;
import java.io.File;

public class VKApiDocs
extends VKApiBase {
    @Override
    public String getMethodsGroup() {
        return "docs";
    }

    public VKRequest getUploadServer() {
        return this.prepareRequest("getUploadServer", null);
    }

    public VKRequest getUploadServer(long l) {
        return this.prepareRequest("getUploadServer", VKUtil.paramsFrom("group_id", l));
    }

    public VKRequest getUploadWallServer() {
        return this.prepareRequest("getWallUploadServer", null);
    }

    public VKRequest getUploadWallServer(long l) {
        return this.prepareRequest("getWallUploadServer", VKUtil.paramsFrom("group_id", l));
    }

    public VKRequest save(VKParameters vKParameters) {
        return this.prepareRequest("save", vKParameters, VKDocsArray.class);
    }

    public VKRequest uploadDocRequest(File file) {
        return new VKUploadDocRequest(file);
    }

    public VKRequest uploadDocRequest(File file, long l) {
        return new VKUploadDocRequest(file, l);
    }

    public VKRequest uploadWallDocRequest(File file) {
        return new VKUploadWallDocRequest(file);
    }

    public VKRequest uploadWallDocRequest(File file, long l) {
        return new VKUploadWallDocRequest(file, l);
    }
}

