/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONObject
 */
package com.vk.sdk.api.httpClient;

import com.vk.sdk.api.VKDefaultParser;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKJsonOperation;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONObject;

public class VKModelOperation
extends VKJsonOperation {
    public final VKParser mParser;
    public Object parsedModel;

    public VKModelOperation(VKHttpClient.VKHTTPRequest vKHTTPRequest, VKParser vKParser) {
        super(vKHTTPRequest);
        this.mParser = vKParser;
    }

    public VKModelOperation(VKHttpClient.VKHTTPRequest vKHTTPRequest, Class<? extends VKApiModel> clazz) {
        super(vKHTTPRequest);
        this.mParser = new VKDefaultParser(clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean postExecution() {
        if (!super.postExecution()) {
            return false;
        }
        if (this.mParser == null) return false;
        try {
            JSONObject jSONObject = this.getResponseJson();
            this.parsedModel = this.mParser.createModel(jSONObject);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

