/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import com.vk.sdk.api.model.VKApiCommunityFull;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiCommunityArray
extends VKList<VKApiCommunityFull> {
    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiCommunityFull.class);
        return this;
    }
}

