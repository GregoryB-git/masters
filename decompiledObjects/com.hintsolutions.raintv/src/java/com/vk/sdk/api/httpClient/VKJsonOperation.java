/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.httpClient;

import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKHttpOperation;
import org.json.JSONObject;

public class VKJsonOperation
extends VKHttpOperation<JSONObject> {
    private JSONObject mResponseJson;

    public VKJsonOperation(VKHttpClient.VKHTTPRequest vKHTTPRequest) {
        super(vKHTTPRequest);
    }

    public JSONObject getResponseJson() {
        if (this.mResponseJson == null) {
            String string = this.getResponseString();
            if (string == null) {
                return null;
            }
            try {
                JSONObject jSONObject;
                this.mResponseJson = jSONObject = new JSONObject(string);
            }
            catch (Exception exception) {
                this.mLastException = exception;
            }
        }
        return this.mResponseJson;
    }

    @Override
    public JSONObject getResultObject() {
        return this.mResponseJson;
    }

    @Override
    public boolean postExecution() {
        if (!super.postExecution()) {
            return false;
        }
        this.mResponseJson = this.getResponseJson();
        return true;
    }
}

