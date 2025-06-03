/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

public final class AFf1cSDK {
    public String AFInAppEventType;
    public final WeakReference<Context> AFKeystoreWrapper;

    public AFf1cSDK(@NonNull Context context) {
        this.AFKeystoreWrapper = new WeakReference((Object)context);
    }
}

