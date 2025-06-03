// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import androidx.annotation.NonNull;

public abstract class AFd1oSDK<Result> extends AFd1zSDK<AFc1gSDK<Result>>
{
    protected final AFc1oSDK AFLogger;
    private String AFLogger$LogLevel;
    public final AFe1wSDK afDebugLog;
    public AFc1gSDK<Result> afErrorLog;
    private AFa1bSDK afInfoLog;
    protected final AFb1tSDK afRDLog;
    
    private AFd1oSDK(@NonNull final AFd1vSDK aFd1vSDK, @NonNull final AFd1vSDK[] array, @NonNull final AFc1oSDK afLogger, @NonNull final AFe1wSDK afDebugLog, @NonNull final AFb1tSDK afRDLog, @NonNull final AFa1bSDK afInfoLog, final String s) {
        super(aFd1vSDK, array, s);
        this.AFLogger = afLogger;
        this.afDebugLog = afDebugLog;
        this.afRDLog = afRDLog;
        this.afInfoLog = afInfoLog;
    }
    
    public AFd1oSDK(@NonNull final AFd1vSDK aFd1vSDK, @NonNull final AFd1vSDK[] array, @NonNull final AFc1xSDK aFc1xSDK, final String s) {
        this(aFd1vSDK, array, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), s);
    }
    
    public AFd1oSDK(@NonNull final AFd1vSDK aFd1vSDK, @NonNull final AFd1vSDK[] array, @NonNull final AFc1xSDK aFc1xSDK, final String s, final String afLogger$LogLevel) {
        this(aFd1vSDK, array, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), s);
        this.AFLogger$LogLevel = afLogger$LogLevel;
    }
    
    private void valueOf(final AFa1aSDK aFa1aSDK) {
        final String afLogger$LogLevel = this.AFLogger$LogLevel;
        this.AFLogger$LogLevel = this.afInfoLog.valueOf(new AFa1rSDK(aFa1aSDK.valueOf, aFa1aSDK.valueOf(), "6.12.2", super.values));
        if (afLogger$LogLevel != null) {
            this.afInfoLog.values(afLogger$LogLevel);
        }
    }
    
    @Override
    public final void AFInAppEventParameterName(final Throwable obj) {
        com.appsflyer.AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(obj)), obj, true, obj instanceof HttpException ^ true);
        final AppsFlyerRequestListener afRDLog = this.afRDLog();
        if (afRDLog != null) {
            String message = obj.getMessage();
            if (message == null) {
                message = "";
            }
            afRDLog.onError(40, message);
        }
    }
    
    @Override
    public boolean AFInAppEventParameterName() {
        if (this.afDebugLog() instanceof AFd1xSDK) {
            return false;
        }
        if (super.valueOf == AFd1ySDK.AFInAppEventType) {
            return true;
        }
        final Throwable afDebugLog = this.afDebugLog();
        return afDebugLog instanceof IOException && !(afDebugLog instanceof ParsingException);
    }
    
    @Override
    public long AFInAppEventType() {
        return 60000L;
    }
    
    @Override
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        if (this.afInfoLog()) {
            final String afInAppEventParameterName = this.afDebugLog.AFInAppEventParameterName;
            if (afInAppEventParameterName != null && !afInAppEventParameterName.trim().isEmpty()) {
                final AFc1qSDK<Result> values = this.values(afInAppEventParameterName);
                if (values != null) {
                    this.valueOf(values.valueOf);
                    return;
                }
                com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            }
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
            final AppsFlyerRequestListener afRDLog = this.afRDLog();
            if (afRDLog != null) {
                afRDLog.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFd1xSDK();
        }
        final String afInAppEventParameterName = this.afDebugLog.AFInAppEventParameterName;
        if (afInAppEventParameterName == null || afInAppEventParameterName.trim().isEmpty()) {
            final AppsFlyerRequestListener afRDLog2 = this.afRDLog();
            if (afRDLog2 != null) {
                afRDLog2.onError(41, "No dev key");
            }
            throw new AFd1tSDK();
        }
        final AFc1qSDK<Result> values = this.values(afInAppEventParameterName);
        if (values == null) {
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFd1ySDK.valueOf;
        }
        if (this.afInfoLog()) {
            this.valueOf(values.valueOf);
        }
        final AFc1gSDK<Result> afInAppEventType = values.AFInAppEventType();
        this.afErrorLog = afInAppEventType;
        this.afRDLog.AFInAppEventParameterName(values.valueOf.valueOf, afInAppEventType.getStatusCode(), afInAppEventType.getBody().toString());
        final AppsFlyerRequestListener afRDLog3 = this.afRDLog();
        if (afRDLog3 != null) {
            if (afInAppEventType.isSuccessful()) {
                afRDLog3.onSuccess();
            }
            else {
                final StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(afInAppEventType.getStatusCode());
                afRDLog3.onError(50, sb.toString());
            }
        }
        if (afInAppEventType.isSuccessful()) {
            return AFd1ySDK.AFInAppEventParameterName;
        }
        return AFd1ySDK.valueOf;
    }
    
    public abstract AFc1qSDK<Result> values(@NonNull final String p0);
    
    @Override
    public void values() {
        if (super.valueOf == AFd1ySDK.AFInAppEventParameterName) {
            final String afLogger$LogLevel = this.AFLogger$LogLevel;
            if (afLogger$LogLevel != null) {
                this.afInfoLog.values(afLogger$LogLevel);
            }
            return;
        }
        if (!this.AFInAppEventParameterName()) {
            final String afLogger$LogLevel2 = this.AFLogger$LogLevel;
            if (afLogger$LogLevel2 != null) {
                this.afInfoLog.values(afLogger$LogLevel2);
            }
        }
    }
}
