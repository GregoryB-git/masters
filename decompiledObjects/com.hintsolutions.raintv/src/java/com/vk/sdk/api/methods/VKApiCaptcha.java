/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;

public class VKApiCaptcha
extends VKApiBase {
    public VKRequest force() {
        return this.prepareRequest("force", null);
    }

    @Override
    public String getMethodsGroup() {
        return "captcha";
    }
}

