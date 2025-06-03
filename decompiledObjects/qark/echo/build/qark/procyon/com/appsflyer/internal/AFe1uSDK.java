// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.AppsFlyerLib;
import android.content.Context;

public final class AFe1uSDK extends AFa1qSDK
{
    @SuppressLint({ "VisibleForTests" })
    public AFe1uSDK(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFe1ySDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append(context.getPackageName());
        super("Register", sb.toString(), Boolean.FALSE);
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
