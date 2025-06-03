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
package com.vk.sdk.api.docs;

import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.docs.VKUploadDocBase;
import com.vk.sdk.api.methods.VKApiDocs;
import com.vk.sdk.util.VKJsonHelper;
import com.vk.sdk.util.VKUtil;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class VKUploadWallDocRequest
extends VKUploadDocBase {
    public VKUploadWallDocRequest(File file) {
        this.mDoc = file;
        this.mGroupId = 0L;
    }

    public VKUploadWallDocRequest(File file, long l4) {
        this.mDoc = file;
        this.mGroupId = l4;
    }

    @Override
    public VKRequest getSaveRequest(JSONObject object) {
        block2: {
            long l4;
            try {
                VKApiDocs vKApiDocs = VKApi.docs();
                VKParameters vKParameters = new VKParameters(VKJsonHelper.toMap((JSONObject)object));
                object = vKApiDocs.save(vKParameters);
                l4 = this.mGroupId;
                if (l4 == 0L) break block2;
            }
            catch (JSONException jSONException) {
                return null;
            }
            ((VKRequest)object).addExtraParameters(VKUtil.paramsFrom("group_id", l4));
        }
        return object;
    }

    @Override
    public VKRequest getServerRequest() {
        if (this.mGroupId != 0L) {
            return VKApi.docs().getUploadWallServer(this.mGroupId);
        }
        return VKApi.docs().getUploadWallServer();
    }
}

