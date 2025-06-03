/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.MalformedURLException
 *  java.net.URL
 */
package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1fSDK;
import java.net.MalformedURLException;
import java.net.URL;

public final class AFd1jSDK
extends AFd1oSDK<String> {
    private final AFe1fSDK afInfoLog;

    public AFd1jSDK(@NonNull AFe1fSDK aFe1fSDK, @NonNull AFc1xSDK aFc1xSDK) {
        AFd1vSDK aFd1vSDK = aFe1fSDK.AFLogger$LogLevel;
        if (aFd1vSDK == null) {
            aFd1vSDK = AFd1vSDK.AFKeystoreWrapper;
        }
        AFd1vSDK aFd1vSDK2 = AFd1vSDK.values;
        Object object = new StringBuilder();
        object.append(aFe1fSDK.AFInAppEventType);
        object.append("-");
        object.append(AFd1jSDK.valueOf(aFe1fSDK));
        object = object.toString();
        String string2 = aFe1fSDK.AFInAppEventType;
        super(aFd1vSDK, new AFd1vSDK[]{aFd1vSDK2}, aFc1xSDK, (String)object, string2);
        this.afInfoLog = aFe1fSDK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String valueOf(AFe1fSDK object) {
        try {
            return new URL(object.afRDLog).getHost();
        }
        catch (MalformedURLException malformedURLException) {
            return "";
        }
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        Object object = this.afInfoLog.AFLogger$LogLevel;
        if (object == null) {
            object = AFd1vSDK.AFKeystoreWrapper;
        }
        if (object == AFd1vSDK.AppsFlyer2dXConversionCallback && (object = this.afErrorLog) != null && object.getStatusCode() == 424 || super.AFInAppEventParameterName()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return this.afInfoLog.AFInAppEventParameterName;
    }

    @Override
    public final AFc1qSDK<String> values(@NonNull String string2) {
        string2 = Base64.encodeToString((byte[])this.afInfoLog.AFKeystoreWrapper(), (int)2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf((Object)string2)));
        this.afRDLog.valueOf(this.afInfoLog.afRDLog, string2);
        return this.AFLogger.values(this.afInfoLog);
    }
}

