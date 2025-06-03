// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.io.IOException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.InterruptedIOException;
import android.util.Base64;
import java.nio.charset.Charset;
import com.appsflyer.AFLogger;
import android.text.TextUtils;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import androidx.annotation.NonNull;

public final class AFd1gSDK extends AFd1zSDK<AFd1dSDK>
{
    public AFd1dSDK AFLogger;
    private final AFb1ySDK AFLogger$LogLevel;
    private final AFe1zSDK AFVersionDeclaration;
    private final AFb1gSDK afDebugLog;
    private final AFd1cSDK afErrorLog;
    private final AFc1oSDK afErrorLogForExcManagerOnly;
    public final AFd1bSDK afInfoLog;
    public AFf1zSDK afRDLog;
    private final String afWarnLog;
    private final AFe1wSDK getLevel;
    
    public AFd1gSDK(@NonNull final AFd1cSDK afErrorLog, @NonNull final AFb1gSDK afDebugLog, @NonNull final AFe1wSDK getLevel, @NonNull final AFb1ySDK afLogger$LogLevel, @NonNull final AFc1oSDK afErrorLogForExcManagerOnly, @NonNull final AFe1zSDK afVersionDeclaration, @NonNull final String afWarnLog, final AFd1bSDK afInfoLog) {
        super(AFd1vSDK.values, new AFd1vSDK[0], "UpdateRemoteConfiguration");
        this.AFLogger = null;
        this.afErrorLog = afErrorLog;
        this.afDebugLog = afDebugLog;
        this.getLevel = getLevel;
        this.AFLogger$LogLevel = afLogger$LogLevel;
        this.afErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly;
        this.AFVersionDeclaration = afVersionDeclaration;
        this.afWarnLog = afWarnLog;
        this.afInfoLog = afInfoLog;
    }
    
    private void AFInAppEventParameterName(final String s, final long n, final AFc1gSDK<?> aFc1gSDK, final AFe1qSDK aFe1qSDK, final AFf1wSDK aFf1wSDK, final String s2, final Throwable t) {
        long n2;
        int statusCode;
        if (aFc1gSDK != null) {
            n2 = aFc1gSDK.values.AFKeystoreWrapper;
            statusCode = aFc1gSDK.getStatusCode();
        }
        else {
            n2 = 0L;
            statusCode = 0;
        }
        Throwable cause;
        if (t instanceof HttpException) {
            cause = t.getCause();
            n2 = ((HttpException)t).getMetrics().AFKeystoreWrapper;
        }
        else {
            cause = t;
        }
        String valueOf;
        if (aFe1qSDK != null) {
            valueOf = aFe1qSDK.valueOf;
        }
        else {
            valueOf = null;
        }
        this.afRDLog = new AFf1zSDK(valueOf, s, n2, System.currentTimeMillis() - n, statusCode, aFf1wSDK, s2, cause);
    }
    
    private AFd1dSDK afInfoLog() {
        final long currentTimeMillis = System.currentTimeMillis();
        final String afWarnLog = this.afWarnLog;
        final String afInAppEventParameterName = this.getLevel.AFInAppEventParameterName;
        String value = null;
        Label_0107: {
            if (afInAppEventParameterName != null && afInAppEventParameterName.trim().length() != 0) {
                if (afWarnLog != null) {
                    value = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[] { "appsflyersdk.com", afWarnLog, this.afDebugLog.valueOf.AFInAppEventType.getPackageName() }), afInAppEventParameterName);
                    break Label_0107;
                }
                com.appsflyer.AFLogger.afWarnLog("CFG: Can't create CDN token, domain or version is not provided.");
            }
            else {
                com.appsflyer.AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
            }
            value = null;
        }
        if (value == null) {
            com.appsflyer.AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
            return AFd1dSDK.AFInAppEventParameterName;
        }
        while (true) {
            try {
                if (!this.AFVersionDeclaration.AFInAppEventParameterName()) {
                    com.appsflyer.AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
                    return AFd1dSDK.AFKeystoreWrapper;
                }
                com.appsflyer.AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
                final AFc1gSDK<AFe1qSDK> afInAppEventType = this.afErrorLogForExcManagerOnly.values(this.AFVersionDeclaration.values(), this.AFVersionDeclaration.valueOf(), value, 1500).AFInAppEventType();
                if (!afInAppEventType.isSuccessful()) {
                    this.values(value, currentTimeMillis, null, null, afInAppEventType);
                    final StringBuilder sb = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
                    sb.append(afInAppEventType.getStatusCode());
                    com.appsflyer.AFLogger.afWarnLog(sb.toString());
                    return AFd1dSDK.AFInAppEventParameterName;
                }
                final AFe1qSDK afInAppEventParameterName2 = afInAppEventType.getBody();
                final String afInAppEventType2 = afInAppEventType.AFInAppEventType("x-amz-meta-af-auth-v1");
                final String afInAppEventType3 = afInAppEventType.AFInAppEventType("CF-Cache-Status");
                final String afInAppEventParameterName3 = this.getLevel.AFInAppEventParameterName;
                if (afInAppEventParameterName3 == null || afInAppEventParameterName3.trim().length() == 0) {
                    com.appsflyer.AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
                    return AFd1dSDK.AFInAppEventParameterName;
                }
                final AFf1xSDK value2 = this.afErrorLog.valueOf(afInAppEventParameterName2, afInAppEventType2, value, afInAppEventParameterName3);
                if (value2.AFKeystoreWrapper()) {
                    final long afKeystoreWrapper = this.AFVersionDeclaration.AFKeystoreWrapper();
                    final StringBuilder sb2 = new StringBuilder("CFG: using max-age fallback: ");
                    sb2.append(afKeystoreWrapper);
                    sb2.append(" seconds");
                    com.appsflyer.AFLogger.afRDLog(sb2.toString());
                    final long currentTimeMillis2 = System.currentTimeMillis();
                    final AFb1ySDK afLogger$LogLevel = this.AFLogger$LogLevel;
                    afLogger$LogLevel.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(afInAppEventParameterName2.AFInAppEventType.getBytes(Charset.defaultCharset()), 2));
                    afLogger$LogLevel.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_timestamp", currentTimeMillis2);
                    afLogger$LogLevel.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_max_age", afKeystoreWrapper);
                    afLogger$LogLevel.AFInAppEventParameterName = afInAppEventParameterName2;
                    afLogger$LogLevel.valueOf = currentTimeMillis2;
                    afLogger$LogLevel.AFInAppEventType = afKeystoreWrapper;
                    final StringBuilder sb3 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                    sb3.append(afKeystoreWrapper);
                    sb3.append(" seconds");
                    com.appsflyer.AFLogger.afDebugLog(sb3.toString());
                    this.values(value, currentTimeMillis, value2.valueOf, afInAppEventType3, afInAppEventType);
                    return AFd1dSDK.values;
                }
                this.values(value, currentTimeMillis, value2.valueOf, afInAppEventType3, afInAppEventType);
                com.appsflyer.AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                return AFd1dSDK.AFInAppEventParameterName;
                AFc1gSDK<?> rawResponse = null;
                Label_0678: {
                    rawResponse = null;
                }
                // iftrue(Label_0710:, ex.getCause() instanceof InterruptedIOException)
                // iftrue(Label_0678:, !ex instanceof ParsingException)
                final ParsingException ex;
                while (true) {
                    this.AFInAppEventParameterName(value, currentTimeMillis, rawResponse, null, null, null, ex);
                    return AFd1dSDK.AFInAppEventParameterName;
                    final StringBuilder sb4 = new StringBuilder("CFG: failed to fetch remote config: ");
                    sb4.append(ex.getMessage());
                    com.appsflyer.AFLogger.afErrorLog(sb4.toString(), ex, true, false, false);
                    rawResponse = ex.getRawResponse();
                    continue;
                }
                Label_0710:
                throw (InterruptedIOException)ex.getCause();
            }
            catch (IOException ex2) {}
            final IOException ex2;
            final ParsingException ex = (ParsingException)ex2;
            continue;
        }
    }
    
    private void values(final String s, final long n, final AFf1wSDK aFf1wSDK, String s2, final AFc1gSDK<AFe1qSDK> aFc1gSDK) {
        AFe1qSDK aFe1qSDK;
        if (aFc1gSDK != null) {
            aFe1qSDK = aFc1gSDK.getBody();
        }
        else {
            aFe1qSDK = null;
        }
        if (s2 == null) {
            s2 = null;
        }
        this.AFInAppEventParameterName(s, n, aFc1gSDK, aFe1qSDK, aFf1wSDK, s2, null);
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }
    
    @Override
    public final long AFInAppEventType() {
        return 1500L;
    }
    
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        AFd1dSDK afInfoLog = null;
        try {
            afInfoLog = this.afInfoLog();
            this.AFLogger = afInfoLog;
            if (afInfoLog == AFd1dSDK.AFInAppEventParameterName) {
                return AFd1ySDK.valueOf;
            }
            return AFd1ySDK.AFInAppEventParameterName;
        }
        catch (InterruptedIOException afInfoLog) {}
        catch (InterruptedException ex) {}
        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("RC update config failed", (Throwable)afInfoLog);
        this.AFLogger = AFd1dSDK.AFInAppEventParameterName;
        return AFd1ySDK.AFInAppEventType;
    }
}
