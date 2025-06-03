/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.VKRequest
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.model.VKApiModel;
import java.util.Locale;

public abstract class VKApiBase {
    public abstract String getMethodsGroup();

    public VKRequest prepareRequest(String string2, VKParameters vKParameters) {
        return new VKRequest(String.format((Locale)Locale.US, (String)"%s.%s", (Object[])new Object[]{this.getMethodsGroup(), string2}), vKParameters, null);
    }

    public VKRequest prepareRequest(String string2, VKParameters vKParameters, VKParser vKParser) {
        string2 = new VKRequest(String.format((Locale)Locale.US, (String)"%s.%s", (Object[])new Object[]{this.getMethodsGroup(), string2}), vKParameters);
        string2.setResponseParser(vKParser);
        return string2;
    }

    public VKRequest prepareRequest(String string2, VKParameters vKParameters, Class<? extends VKApiModel> clazz) {
        return new VKRequest(String.format((Locale)Locale.US, (String)"%s.%s", (Object[])new Object[]{this.getMethodsGroup(), string2}), vKParameters, clazz);
    }
}

