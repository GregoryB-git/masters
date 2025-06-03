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
package com.vk.sdk.api;

import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONObject;

public class VKDefaultParser
extends VKParser {
    private final Class<? extends VKApiModel> mModelClass;

    public VKDefaultParser(Class<? extends VKApiModel> clazz) {
        this.mModelClass = clazz;
    }

    @Override
    public Object createModel(JSONObject jSONObject) {
        try {
            VKApiModel vKApiModel = (VKApiModel)this.mModelClass.newInstance();
            vKApiModel.parse(jSONObject);
            return vKApiModel;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

