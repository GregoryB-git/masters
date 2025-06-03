/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.common.api.GoogleApiClient
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

class GoogleApiClientCompatProxy {
    private final GoogleApiClient googleApiClient;
    private final Class googleApiClientListenerClass;

    public GoogleApiClientCompatProxy(GoogleApiClient googleApiClient) {
        this.googleApiClient = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke((Object)this.googleApiClient, new Object[0]);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke((Object)this.googleApiClient, new Object[0]);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public GoogleApiClient realInstance() {
        return this.googleApiClient;
    }
}

