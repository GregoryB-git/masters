/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.networktasks.api;

public interface CacheControlHttpsConnectionPerformer$Client {
    public String getOldETag();

    public void onError();

    public void onNotModified();

    public void onResponse(String var1, byte[] var2);
}

