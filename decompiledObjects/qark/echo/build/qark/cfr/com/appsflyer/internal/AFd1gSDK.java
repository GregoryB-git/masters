/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 */
package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1cSDK;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1zSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1xSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;

public final class AFd1gSDK
extends AFd1zSDK<AFd1dSDK> {
    public AFd1dSDK AFLogger = null;
    private final AFb1ySDK AFLogger$LogLevel;
    private final AFe1zSDK AFVersionDeclaration;
    private final AFb1gSDK afDebugLog;
    private final AFd1cSDK afErrorLog;
    private final AFc1oSDK afErrorLogForExcManagerOnly;
    public final AFd1bSDK afInfoLog;
    public AFf1zSDK afRDLog;
    private final String afWarnLog;
    private final AFe1wSDK getLevel;

    public AFd1gSDK(@NonNull AFd1cSDK aFd1cSDK, @NonNull AFb1gSDK aFb1gSDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFb1ySDK aFb1ySDK, @NonNull AFc1oSDK aFc1oSDK, @NonNull AFe1zSDK aFe1zSDK, @NonNull String string2, AFd1bSDK aFd1bSDK) {
        super(AFd1vSDK.values, new AFd1vSDK[0], "UpdateRemoteConfiguration");
        this.afErrorLog = aFd1cSDK;
        this.afDebugLog = aFb1gSDK;
        this.getLevel = aFe1wSDK;
        this.AFLogger$LogLevel = aFb1ySDK;
        this.afErrorLogForExcManagerOnly = aFc1oSDK;
        this.AFVersionDeclaration = aFe1zSDK;
        this.afWarnLog = string2;
        this.afInfoLog = aFd1bSDK;
    }

    private void AFInAppEventParameterName(String string2, long l8, AFc1gSDK<?> throwable, AFe1qSDK object, AFf1wSDK aFf1wSDK, String string3, Throwable throwable2) {
        int n8;
        long l9;
        if (throwable != null) {
            l9 = throwable.values.AFKeystoreWrapper;
            n8 = throwable.getStatusCode();
        } else {
            l9 = 0L;
            n8 = 0;
        }
        if (throwable2 instanceof HttpException) {
            throwable = throwable2.getCause();
            l9 = ((HttpException)throwable2).getMetrics().AFKeystoreWrapper;
        } else {
            throwable = throwable2;
        }
        object = object != null ? object.valueOf : null;
        this.afRDLog = new AFf1zSDK((String)object, string2, l9, System.currentTimeMillis() - l8, n8, aFf1wSDK, string3, throwable);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private AFd1dSDK afInfoLog() {
        block12 : {
            block11 : {
                block9 : {
                    block10 : {
                        var1_1 = System.currentTimeMillis();
                        var9_2 = this.afWarnLog;
                        var10_3 = this.getLevel.AFInAppEventParameterName;
                        if (var10_3 == null || var10_3.trim().length() == 0) break block9;
                        if (var9_2 != null) break block10;
                        AFLogger.afWarnLog("CFG: Can't create CDN token, domain or version is not provided.");
                        break block11;
                    }
                    var9_2 = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[]{"appsflyersdk.com", var9_2, this.afDebugLog.valueOf.AFInAppEventType.getPackageName()}), (String)var10_3);
                    break block12;
                }
                AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
            }
            var9_2 = null;
        }
        if (var9_2 == null) {
            AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
            return AFd1dSDK.AFInAppEventParameterName;
        }
        try {
            if (this.AFVersionDeclaration.AFInAppEventParameterName()) {
                AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
                var7_4 = this.AFVersionDeclaration.values();
                var8_5 = this.AFVersionDeclaration.valueOf();
                var10_3 = this.afErrorLogForExcManagerOnly.values(var7_4, var8_5, var9_2, 1500).AFInAppEventType();
                if (!var10_3.isSuccessful()) {
                    this.values(var9_2, var1_1, null, null, (AFc1gSDK<AFe1qSDK>)var10_3);
                    var11_9 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
                    var11_9.append(var10_3.getStatusCode());
                    AFLogger.afWarnLog(var11_9.toString());
                    return AFd1dSDK.AFInAppEventParameterName;
                }
                var12_6 = var10_3.getBody();
                var13_7 = var10_3.AFInAppEventType("x-amz-meta-af-auth-v1");
                var11_8 = var10_3.AFInAppEventType("CF-Cache-Status");
                var14_12 = this.getLevel.AFInAppEventParameterName;
                if (var14_12 != null && var14_12.trim().length() != 0) {
                    if ((var13_7 = this.afErrorLog.valueOf(var12_6, (String)var13_7, var9_2, (String)var14_12)).AFKeystoreWrapper()) {
                        var3_13 = this.AFVersionDeclaration.AFKeystoreWrapper();
                        var14_12 = new StringBuilder("CFG: using max-age fallback: ");
                        var14_12.append(var3_13);
                        var14_12.append(" seconds");
                        AFLogger.afRDLog(var14_12.toString());
                        var5_14 = System.currentTimeMillis();
                        var14_12 = this.AFLogger$LogLevel;
                        var15_15 = Base64.encodeToString((byte[])var12_6.AFInAppEventType.getBytes(Charset.defaultCharset()), (int)2);
                        var14_12.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", var15_15);
                        var14_12.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_timestamp", var5_14);
                        var14_12.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_max_age", var3_13);
                        var14_12.AFInAppEventParameterName = var12_6;
                        var14_12.valueOf = var5_14;
                        var14_12.AFInAppEventType = var3_13;
                        var12_6 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                        var12_6.append(var3_13);
                        var12_6.append(" seconds");
                        AFLogger.afDebugLog(var12_6.toString());
                        this.values(var9_2, var1_1, var13_7.valueOf, var11_8, (AFc1gSDK<AFe1qSDK>)var10_3);
                        return AFd1dSDK.values;
                    }
                    this.values(var9_2, var1_1, var13_7.valueOf, var11_8, (AFc1gSDK<AFe1qSDK>)var10_3);
                    AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                    return AFd1dSDK.AFInAppEventParameterName;
                }
                AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
                return AFd1dSDK.AFInAppEventParameterName;
            }
            AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
            var10_3 = AFd1dSDK.AFKeystoreWrapper;
            return var10_3;
        }
        catch (IOException var11_11) {}
        ** finally { 
lbl67: // 1 sources:
        var10_3 = new StringBuilder("CFG: failed to update remote config: ");
        var10_3.append(var11_10.getMessage());
        AFLogger.afErrorLog(var10_3.toString(), var11_10, true, false, false);
        this.AFInAppEventParameterName(var9_2, var1_1, null, null, null, null, var11_10);
        if (var11_10.getCause() instanceof InterruptedException != false) throw (InterruptedException)var11_10.getCause();
        return AFd1dSDK.AFInAppEventParameterName;
    }

    private void values(String string2, long l8, AFf1wSDK aFf1wSDK, String string3, AFc1gSDK<AFe1qSDK> aFc1gSDK) {
        AFe1qSDK aFe1qSDK = aFc1gSDK != null ? aFc1gSDK.getBody() : null;
        if (string3 == null) {
            string3 = null;
        }
        this.AFInAppEventParameterName(string2, l8, aFc1gSDK, aFe1qSDK, aFf1wSDK, string3, null);
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
        void var1_4;
        try {
            AFd1dSDK aFd1dSDK;
            this.AFLogger = aFd1dSDK = this.afInfoLog();
            if (aFd1dSDK == AFd1dSDK.AFInAppEventParameterName) {
                return AFd1ySDK.valueOf;
            }
            return AFd1ySDK.AFInAppEventParameterName;
        }
        catch (InterruptedIOException interruptedIOException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        AFLogger.afErrorLogForExcManagerOnly("RC update config failed", (Throwable)var1_4);
        this.AFLogger = AFd1dSDK.AFInAppEventParameterName;
        return AFd1ySDK.AFInAppEventType;
    }
}

