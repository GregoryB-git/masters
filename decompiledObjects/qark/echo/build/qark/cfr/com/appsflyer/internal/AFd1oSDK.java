/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

public abstract class AFd1oSDK<Result>
extends AFd1zSDK<AFc1gSDK<Result>> {
    protected final AFc1oSDK AFLogger;
    private String AFLogger$LogLevel;
    public final AFe1wSDK afDebugLog;
    public AFc1gSDK<Result> afErrorLog;
    private AFa1bSDK afInfoLog;
    protected final AFb1tSDK afRDLog;

    private AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] arraFd1vSDK, @NonNull AFc1oSDK aFc1oSDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFb1tSDK aFb1tSDK, @NonNull AFa1bSDK aFa1bSDK, String string2) {
        super(aFd1vSDK, arraFd1vSDK, string2);
        this.AFLogger = aFc1oSDK;
        this.afDebugLog = aFe1wSDK;
        this.afRDLog = aFb1tSDK;
        this.afInfoLog = aFa1bSDK;
    }

    public AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] arraFd1vSDK, @NonNull AFc1xSDK aFc1xSDK, String string2) {
        this(aFd1vSDK, arraFd1vSDK, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), string2);
    }

    public AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] arraFd1vSDK, @NonNull AFc1xSDK aFc1xSDK, String string2, String string3) {
        this(aFd1vSDK, arraFd1vSDK, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), string2);
        this.AFLogger$LogLevel = string3;
    }

    private void valueOf(AFa1aSDK object) {
        String string2 = this.AFLogger$LogLevel;
        object = new AFa1rSDK(object.valueOf, object.valueOf(), "6.12.2", this.values);
        this.AFLogger$LogLevel = this.afInfoLog.valueOf((AFa1rSDK)object);
        if (string2 != null) {
            this.afInfoLog.values(string2);
        }
    }

    @Override
    public final void AFInAppEventParameterName(Throwable object) {
        boolean bl = object instanceof HttpException;
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf((Object)object)), (Throwable)object, true, bl ^ true);
        AppsFlyerRequestListener appsFlyerRequestListener = this.afRDLog();
        if (appsFlyerRequestListener != null) {
            if ((object = object.getMessage()) == null) {
                object = "";
            }
            appsFlyerRequestListener.onError(40, (String)object);
        }
    }

    @Override
    public boolean AFInAppEventParameterName() {
        if (this.afDebugLog() instanceof AFd1xSDK) {
            return false;
        }
        if (this.valueOf == AFd1ySDK.AFInAppEventType) {
            return true;
        }
        Throwable throwable = this.afDebugLog();
        if (throwable instanceof IOException && !(throwable instanceof ParsingException)) {
            return true;
        }
        return false;
    }

    @Override
    public long AFInAppEventType() {
        return 60000L;
    }

    @Override
    public final void AFKeystoreWrapper() {
        Object object;
        super.AFKeystoreWrapper();
        if (this.afInfoLog() && (object = this.afDebugLog.AFInAppEventParameterName) != null && !object.trim().isEmpty()) {
            if ((object = this.values((String)object)) != null) {
                this.valueOf(object.valueOf);
                return;
            }
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", (Throwable)new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    public abstract boolean afInfoLog();

    public abstract AppsFlyerRequestListener afRDLog();

    public boolean getLevel() {
        return true;
    }

    @NonNull
    @Override
    public AFd1ySDK valueOf() {
        if (this.getLevel() && this.afDebugLog.AFKeystoreWrapper()) {
            AppsFlyerRequestListener appsFlyerRequestListener = this.afRDLog();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFd1xSDK();
        }
        Object object = this.afDebugLog.AFInAppEventParameterName;
        if (object != null && !object.trim().isEmpty()) {
            AFc1qSDK<Result> aFc1qSDK = this.values((String)object);
            if (aFc1qSDK == null) {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", (Throwable)new CreateHttpCallException("createHttpCall returned null"));
                return AFd1ySDK.valueOf;
            }
            if (this.afInfoLog()) {
                this.valueOf(aFc1qSDK.valueOf);
            }
            object = aFc1qSDK.AFInAppEventType();
            this.afErrorLog = object;
            String string2 = object.getBody().toString();
            this.afRDLog.AFInAppEventParameterName(aFc1qSDK.valueOf.valueOf, object.getStatusCode(), string2);
            aFc1qSDK = this.afRDLog();
            if (aFc1qSDK != null) {
                if (object.isSuccessful()) {
                    aFc1qSDK.onSuccess();
                } else {
                    string2 = new StringBuilder("Status code failure ");
                    string2.append(object.getStatusCode());
                    aFc1qSDK.onError(50, string2.toString());
                }
            }
            if (object.isSuccessful()) {
                return AFd1ySDK.AFInAppEventParameterName;
            }
            return AFd1ySDK.valueOf;
        }
        object = this.afRDLog();
        if (object != null) {
            object.onError(41, "No dev key");
        }
        throw new AFd1tSDK();
    }

    public abstract AFc1qSDK<Result> values(@NonNull String var1);

    @Override
    public void values() {
        String string2;
        if (this.valueOf == AFd1ySDK.AFInAppEventParameterName) {
            String string3 = this.AFLogger$LogLevel;
            if (string3 != null) {
                this.afInfoLog.values(string3);
            }
            return;
        }
        if (!this.AFInAppEventParameterName() && (string2 = this.AFLogger$LogLevel) != null) {
            this.afInfoLog.values(string2);
        }
    }
}

