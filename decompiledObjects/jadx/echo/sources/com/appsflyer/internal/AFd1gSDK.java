package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class AFd1gSDK extends AFd1zSDK<AFd1dSDK> {
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

    public AFd1gSDK(@NonNull AFd1cSDK aFd1cSDK, @NonNull AFb1gSDK aFb1gSDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFb1ySDK aFb1ySDK, @NonNull AFc1oSDK aFc1oSDK, @NonNull AFe1zSDK aFe1zSDK, @NonNull String str, AFd1bSDK aFd1bSDK) {
        super(AFd1vSDK.RC_CDN, new AFd1vSDK[0], "UpdateRemoteConfiguration");
        this.AFLogger = null;
        this.afErrorLog = aFd1cSDK;
        this.afDebugLog = aFb1gSDK;
        this.getLevel = aFe1wSDK;
        this.AFLogger$LogLevel = aFb1ySDK;
        this.afErrorLogForExcManagerOnly = aFc1oSDK;
        this.AFVersionDeclaration = aFe1zSDK;
        this.afWarnLog = str;
        this.afInfoLog = aFd1bSDK;
    }

    private void AFInAppEventParameterName(String str, long j7, AFc1gSDK<?> aFc1gSDK, AFe1qSDK aFe1qSDK, AFf1wSDK aFf1wSDK, String str2, Throwable th) {
        long j8;
        int i7;
        Throwable th2;
        long j9;
        if (aFc1gSDK != null) {
            j8 = aFc1gSDK.values.AFKeystoreWrapper;
            i7 = aFc1gSDK.getStatusCode();
        } else {
            j8 = 0;
            i7 = 0;
        }
        int i8 = i7;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j9 = ((HttpException) th).getMetrics().AFKeystoreWrapper;
        } else {
            th2 = th;
            j9 = j8;
        }
        this.afRDLog = new AFf1zSDK(aFe1qSDK != null ? aFe1qSDK.valueOf : null, str, j9, System.currentTimeMillis() - j7, i8, aFf1wSDK, str2, th2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.appsflyer.internal.AFd1dSDK afInfoLog() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1gSDK.afInfoLog():com.appsflyer.internal.AFd1dSDK");
    }

    private void values(String str, long j7, AFf1wSDK aFf1wSDK, String str2, AFc1gSDK<AFe1qSDK> aFc1gSDK) {
        AFInAppEventParameterName(str, j7, aFc1gSDK, aFc1gSDK != null ? aFc1gSDK.getBody() : null, aFf1wSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1ySDK valueOf() {
        try {
            AFd1dSDK afInfoLog = afInfoLog();
            this.AFLogger = afInfoLog;
            return afInfoLog == AFd1dSDK.FAILURE ? AFd1ySDK.FAILURE : AFd1ySDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e7) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e7);
            this.AFLogger = AFd1dSDK.FAILURE;
            return AFd1ySDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }
}
