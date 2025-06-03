/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.attribution;

import androidx.annotation.NonNull;

public interface AppsFlyerRequestListener {
    public void onError(int var1, @NonNull String var2);

    public void onSuccess();
}

