/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.VKError
 *  java.lang.Object
 */
package com.vk.sdk;

import com.vk.sdk.api.VKError;

public interface VKCallback<RESULT> {
    public void onError(VKError var1);

    public void onResult(RESULT var1);
}

