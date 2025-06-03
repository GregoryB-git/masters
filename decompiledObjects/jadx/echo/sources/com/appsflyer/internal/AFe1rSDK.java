package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFe1rSDK extends AFd1oSDK<Map<String, Object>> {
    private static final List<String> afInfoLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private Map<String, Object> AFLogger$LogLevel;
    private final AFe1mSDK AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private final AFb1gSDK afErrorLogForExcManagerOnly;
    private final AFb1dSDK afWarnLog;
    private final AFc1oSDK getLevel;

    public AFe1rSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, "GCD-FETCH");
        this.getLevel = aFc1xSDK.AFKeystoreWrapper();
        this.afWarnLog = aFc1xSDK.values();
        this.AFVersionDeclaration = aFc1xSDK.afDebugLog();
        this.afErrorLogForExcManagerOnly = aFc1xSDK.AFInAppEventParameterName();
        this.AFKeystoreWrapper.add(AFd1vSDK.CONVERSION);
        this.AFKeystoreWrapper.add(AFd1vSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1tSDK -> 0x006f, TryCatch #3 {AFd1tSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00cf, B:50:0x00d3, B:51:0x00e2, B:53:0x0101, B:54:0x0106), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1tSDK -> 0x006f, TryCatch #3 {AFd1tSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00cf, B:50:0x00d3, B:51:0x00e2, B:53:0x0101, B:54:0x0106), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1tSDK -> 0x006f, TryCatch #3 {AFd1tSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00cf, B:50:0x00d3, B:51:0x00e2, B:53:0x0101, B:54:0x0106), top: B:10:0x0025, outer: #2 }] */
    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFd1ySDK valueOf() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1rSDK.valueOf():com.appsflyer.internal.AFd1ySDK");
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<Map<String, Object>> values(@NonNull String str) {
        String str2;
        String AFInAppEventType = AFa1eSDK.AFInAppEventType(this.afWarnLog, this.afErrorLogForExcManagerOnly.values());
        if (AFInAppEventType != null && !AFInAppEventType.trim().isEmpty()) {
            if (!afInfoLog.contains(AFInAppEventType.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFInAppEventType);
                AFc1qSDK<Map<String, Object>> values = this.getLevel.values(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(values.valueOf.valueOf);
                AFa1aSDK.values(sb.toString());
                return values;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFInAppEventType));
        }
        str2 = "";
        AFc1qSDK<Map<String, Object>> values2 = this.getLevel.values(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(values2.valueOf.valueOf);
        AFa1aSDK.values(sb2.toString());
        return values2;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        super.values();
        Map<String, Object> map = this.AFLogger$LogLevel;
        String str = this.AppsFlyer2dXConversionCallback;
        if (map != null) {
            AFe1sSDK.values(map);
        } else if (str == null || str.isEmpty()) {
            AFe1sSDK.AFInAppEventType("Unknown error");
        } else {
            AFe1sSDK.AFInAppEventType(str);
        }
    }
}
