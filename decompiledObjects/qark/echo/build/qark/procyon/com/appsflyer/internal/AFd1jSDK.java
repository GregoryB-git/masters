// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import android.util.Base64;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;
import androidx.annotation.NonNull;

public final class AFd1jSDK extends AFd1oSDK<String>
{
    private final AFe1fSDK afInfoLog;
    
    public AFd1jSDK(@NonNull final AFe1fSDK afInfoLog, @NonNull final AFc1xSDK aFc1xSDK) {
        AFd1vSDK aFd1vSDK = afInfoLog.AFLogger$LogLevel;
        if (aFd1vSDK == null) {
            aFd1vSDK = AFd1vSDK.AFKeystoreWrapper;
        }
        final AFd1vSDK values = AFd1vSDK.values;
        final StringBuilder sb = new StringBuilder();
        sb.append(afInfoLog.AFInAppEventType);
        sb.append("-");
        sb.append(valueOf(afInfoLog));
        super(aFd1vSDK, new AFd1vSDK[] { values }, aFc1xSDK, sb.toString(), afInfoLog.AFInAppEventType);
        this.afInfoLog = afInfoLog;
    }
    
    private static String valueOf(final AFe1fSDK aFe1fSDK) {
        try {
            return new URL(aFe1fSDK.afRDLog).getHost();
        }
        catch (MalformedURLException ex) {
            return "";
        }
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        AFd1vSDK aFd1vSDK = this.afInfoLog.AFLogger$LogLevel;
        if (aFd1vSDK == null) {
            aFd1vSDK = AFd1vSDK.AFKeystoreWrapper;
        }
        if (aFd1vSDK == AFd1vSDK.AppsFlyer2dXConversionCallback) {
            final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
            if (afErrorLog != null && afErrorLog.getStatusCode() == 424) {
                return true;
            }
        }
        if (!super.AFInAppEventParameterName()) {
            return false;
        }
        return true;
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
    public final AFc1qSDK<String> values(@NonNull String encodeToString) {
        encodeToString = Base64.encodeToString(this.afInfoLog.AFKeystoreWrapper(), 2);
        com.appsflyer.AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        super.afRDLog.valueOf(this.afInfoLog.afRDLog, encodeToString);
        return super.AFLogger.values(this.afInfoLog);
    }
}
