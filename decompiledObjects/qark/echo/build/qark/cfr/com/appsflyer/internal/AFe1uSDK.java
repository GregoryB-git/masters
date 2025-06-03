/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1ySDK;

public final class AFe1uSDK
extends AFa1qSDK {
    @SuppressLint(value={"VisibleForTests"})
    public AFe1uSDK(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format((String)AFe1ySDK.valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        stringBuilder.append(context.getPackageName());
        super("Register", stringBuilder.toString(), Boolean.FALSE);
    }

    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.afErrorLog;
    }

    @Override
    public final boolean afErrorLog() {
        return false;
    }
}

