package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AFd1oSDK<Result> extends AFd1zSDK<AFc1gSDK<Result>> {
    protected final AFc1oSDK AFLogger;
    private String AFLogger$LogLevel;
    public final AFe1wSDK afDebugLog;
    public AFc1gSDK<Result> afErrorLog;
    private AFa1bSDK afInfoLog;
    protected final AFb1tSDK afRDLog;

    private AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1oSDK aFc1oSDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFb1tSDK aFb1tSDK, @NonNull AFa1bSDK aFa1bSDK, String str) {
        super(aFd1vSDK, aFd1vSDKArr, str);
        this.AFLogger = aFc1oSDK;
        this.afDebugLog = aFe1wSDK;
        this.afRDLog = aFb1tSDK;
        this.afInfoLog = aFa1bSDK;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void AFInAppEventParameterName(Throwable th) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th)), th, true, !(th instanceof HttpException));
        AppsFlyerRequestListener afRDLog = afRDLog();
        if (afRDLog != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            afRDLog.onError(40, message);
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void AFKeystoreWrapper() {
        String str;
        super.AFKeystoreWrapper();
        if (!afInfoLog() || (str = this.afDebugLog.AFInAppEventParameterName) == null || str.trim().isEmpty()) {
            return;
        }
        AFc1qSDK<Result> values = values(str);
        if (values != null) {
            valueOf(values.valueOf);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    public abstract boolean afInfoLog();

    public abstract AppsFlyerRequestListener afRDLog();

    public boolean getLevel() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public AFd1ySDK valueOf() {
        if (getLevel() && this.afDebugLog.AFKeystoreWrapper()) {
            AppsFlyerRequestListener afRDLog = afRDLog();
            if (afRDLog != null) {
                afRDLog.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFd1xSDK();
        }
        String str = this.afDebugLog.AFInAppEventParameterName;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener afRDLog2 = afRDLog();
            if (afRDLog2 != null) {
                afRDLog2.onError(41, "No dev key");
            }
            throw new AFd1tSDK();
        }
        AFc1qSDK<Result> values = values(str);
        if (values == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFd1ySDK.FAILURE;
        }
        if (afInfoLog()) {
            valueOf(values.valueOf);
        }
        AFc1gSDK<Result> AFInAppEventType = values.AFInAppEventType();
        this.afErrorLog = AFInAppEventType;
        this.afRDLog.AFInAppEventParameterName(values.valueOf.valueOf, AFInAppEventType.getStatusCode(), AFInAppEventType.getBody().toString());
        AppsFlyerRequestListener afRDLog3 = afRDLog();
        if (afRDLog3 != null) {
            if (AFInAppEventType.isSuccessful()) {
                afRDLog3.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(AFInAppEventType.getStatusCode());
                afRDLog3.onError(50, sb.toString());
            }
        }
        return AFInAppEventType.isSuccessful() ? AFd1ySDK.SUCCESS : AFd1ySDK.FAILURE;
    }

    public abstract AFc1qSDK<Result> values(@NonNull String str);

    @Override // com.appsflyer.internal.AFd1zSDK
    public void values() {
        String str;
        if (this.valueOf == AFd1ySDK.SUCCESS) {
            String str2 = this.AFLogger$LogLevel;
            if (str2 != null) {
                this.afInfoLog.values(str2);
                return;
            }
            return;
        }
        if (AFInAppEventParameterName() || (str = this.AFLogger$LogLevel) == null) {
            return;
        }
        this.afInfoLog.values(str);
    }

    public AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1xSDK aFc1xSDK, String str) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), str);
    }

    private void valueOf(AFa1aSDK aFa1aSDK) {
        String str = this.AFLogger$LogLevel;
        this.AFLogger$LogLevel = this.afInfoLog.valueOf(new AFa1rSDK(aFa1aSDK.valueOf, aFa1aSDK.valueOf(), "6.12.2", this.values));
        if (str != null) {
            this.afInfoLog.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public boolean AFInAppEventParameterName() {
        if (afDebugLog() instanceof AFd1xSDK) {
            return false;
        }
        if (this.valueOf == AFd1ySDK.TIMEOUT) {
            return true;
        }
        Throwable afDebugLog = afDebugLog();
        return (afDebugLog instanceof IOException) && !(afDebugLog instanceof ParsingException);
    }

    public AFd1oSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1xSDK aFc1xSDK, String str, String str2) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.afWarnLog(), aFc1xSDK.afErrorLogForExcManagerOnly(), aFc1xSDK.onAppOpenAttributionNative(), str);
        this.AFLogger$LogLevel = str2;
    }
}
