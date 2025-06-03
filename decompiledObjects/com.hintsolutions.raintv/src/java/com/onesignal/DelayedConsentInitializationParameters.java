/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;

class DelayedConsentInitializationParameters {
    private final String appId;
    private final Context context;

    public DelayedConsentInitializationParameters(Context context, String string2) {
        this.context = context;
        this.appId = string2;
    }

    public String getAppId() {
        return this.appId;
    }

    public Context getContext() {
        return this.context;
    }
}

