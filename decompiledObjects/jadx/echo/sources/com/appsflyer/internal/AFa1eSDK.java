package com.appsflyer.internal;

import L1.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import j3.C1373c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class AFa1eSDK extends AppsFlyerLib {
    public static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    private static String afErrorLog = null;
    private static AFa1eSDK afRDLog = null;
    private static int onAttributionFailure = 0;
    private static int onDeepLinking = 1;
    private static int onResponse;
    static AppsFlyerInAppPurchaseValidatorListener valueOf;
    static final String values;
    String AFLogger;
    private Map<Long, String> AFLogger$LogLevel;
    public AFa1cSDK afInfoLog;
    private String getLevel;
    private Application init;
    private boolean onAppOpenAttributionNative;
    private String onAttributionFailureNative;

    @NonNull
    private final AFc1ySDK onConversionDataFail;
    private SharedPreferences onConversionDataSuccess;
    private boolean onInstallConversionFailureNative;
    private Map<String, Object> onResponseErrorNative;
    private AFb1lSDK onResponseNative;
    public volatile AppsFlyerConversionListener AFInAppEventParameterName = null;
    private long afDebugLog = -1;
    private long afWarnLog = -1;
    private long AFVersionDeclaration = TimeUnit.SECONDS.toMillis(5);
    private boolean afErrorLogForExcManagerOnly = false;
    private final AFb1xSDK onInstallConversionDataLoadedNative = new AFb1xSDK();
    private boolean AppsFlyer2dXConversionCallback = false;
    private boolean onDeepLinkingNative = false;
    private final Executor onAppOpenAttribution = Executors.newSingleThreadExecutor();

    /* renamed from: com.appsflyer.internal.AFa1eSDK$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            valueOf = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1vSDK implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.AFInAppEventParameterName = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1eSDK.valueOf(AFa1eSDK.this, this.AFInAppEventParameterName);
        }

        public /* synthetic */ AFa1vSDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK, byte b7) {
            this(aFa1qSDK);
        }
    }

    public class AFa1wSDK implements AFc1cSDK {
        private AFa1wSDK() {
        }

        @Override // com.appsflyer.internal.AFc1cSDK
        public final void AFInAppEventParameterName(AFd1zSDK<?> aFd1zSDK) {
        }

        @Override // com.appsflyer.internal.AFc1cSDK
        public final void AFInAppEventType(AFd1zSDK<?> aFd1zSDK, AFd1ySDK aFd1ySDK) {
            JSONObject AFKeystoreWrapper;
            AFb1uSDK AFInAppEventParameterName;
            if (!(aFd1zSDK instanceof AFd1hSDK)) {
                if (!(aFd1zSDK instanceof AFe1pSDK) || aFd1ySDK == AFd1ySDK.SUCCESS) {
                    return;
                }
                AFe1rSDK aFe1rSDK = new AFe1rSDK(AFa1eSDK.this.AFInAppEventType());
                AFc1bSDK AFVersionDeclaration = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
                AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFe1rSDK));
                return;
            }
            AFd1hSDK aFd1hSDK = (AFd1hSDK) aFd1zSDK;
            boolean z7 = aFd1zSDK instanceof AFd1fSDK;
            if (z7 && values()) {
                AFd1fSDK aFd1fSDK = (AFd1fSDK) aFd1zSDK;
                if (aFd1fSDK.valueOf == AFd1ySDK.SUCCESS || aFd1fSDK.AFInAppEventType == 1) {
                    AFe1pSDK aFe1pSDK = new AFe1pSDK(aFd1fSDK, AFa1eSDK.this.AFInAppEventType().values());
                    AFc1bSDK AFVersionDeclaration2 = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
                    AFVersionDeclaration2.AFKeystoreWrapper.execute(AFVersionDeclaration2.new AnonymousClass4(aFe1pSDK));
                }
            }
            if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                aFa1eSDK.values(AFa1eSDK.AFInAppEventType(aFa1eSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                if (!(aFd1zSDK instanceof AFd1eSDK) && (AFInAppEventParameterName = new AFe1ySDK(AFa1eSDK.AFInAppEventType(AFa1eSDK.this)).AFInAppEventParameterName()) != null && AFInAppEventParameterName.AFKeystoreWrapper()) {
                    String str = AFInAppEventParameterName.valueOf;
                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFe1ySDK.valueOf(str);
                }
                ResponseNetwork responseNetwork = ((AFd1oSDK) aFd1hSDK).afErrorLog;
                if (responseNetwork != null && (AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper((String) responseNetwork.getBody())) != null) {
                    AFa1eSDK.valueOf(AFa1eSDK.this, AFKeystoreWrapper.optBoolean("send_background", false));
                }
                if (z7) {
                    AFa1eSDK.AFKeystoreWrapper(AFa1eSDK.this, System.currentTimeMillis());
                }
            }
        }

        @Override // com.appsflyer.internal.AFc1cSDK
        public final void values(AFd1zSDK<?> aFd1zSDK) {
            if (aFd1zSDK instanceof AFd1fSDK) {
                AFa1eSDK.this.AFInAppEventType().afDebugLog().AFKeystoreWrapper(((AFd1hSDK) aFd1zSDK).afInfoLog.AFLogger);
            }
        }

        public /* synthetic */ AFa1wSDK(AFa1eSDK aFa1eSDK, byte b7) {
            this();
        }

        private boolean values() {
            return AFa1eSDK.this.AFInAppEventParameterName != null;
        }
    }

    public class AFa1ySDK implements Runnable {
        private final AFa1qSDK values;

        private AFa1ySDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1hSDK aFd1hSDK;
            if (this.values.AFInAppEventParameterName()) {
                AFd1fSDK aFd1fSDK = new AFd1fSDK(this.values, AFa1eSDK.this.AFInAppEventType());
                aFd1fSDK.AFVersionDeclaration = AFa1eSDK.values(AFa1eSDK.this);
                aFd1hSDK = aFd1fSDK;
            } else {
                aFd1hSDK = new AFd1hSDK(this.values, AFa1eSDK.this.AFInAppEventType());
            }
            AFc1bSDK AFVersionDeclaration = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
            AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1hSDK));
        }

        public /* synthetic */ AFa1ySDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK, byte b7) {
            this(aFa1qSDK);
        }
    }

    static {
        values();
        values = "262";
        AFKeystoreWrapper = "6.12";
        afErrorLog = "https://%sstats.%s/stats";
        StringBuilder sb = new StringBuilder();
        sb.append("6.12");
        sb.append("/androidevent?buildnumber=6.12.2&app_id=");
        AFInAppEventType = sb.toString();
        valueOf = null;
        afRDLog = new AFa1eSDK();
        onAttributionFailure = (onDeepLinking + 93) % 128;
    }

    public AFa1eSDK() {
        AFVersionDeclaration.init();
        this.onConversionDataFail = new AFc1ySDK();
        AFc1bSDK AFVersionDeclaration = AFInAppEventType().AFVersionDeclaration();
        AFVersionDeclaration.values.add(new AFa1wSDK(this, (byte) 0));
    }

    private int AFInAppEventParameterName(AFb1dSDK aFb1dSDK) {
        onAttributionFailure = (onDeepLinking + 119) % 128;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdRevenueCount", true);
        onAttributionFailure = (onDeepLinking + 59) % 128;
        return AFKeystoreWrapper2;
    }

    private int AFInAppEventType(AFb1dSDK aFb1dSDK) {
        int i7 = onAttributionFailure + 115;
        onDeepLinking = i7 % 128;
        int i8 = i7 % 2;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdImpressionCount", true);
        onDeepLinking = (onAttributionFailure + 83) % 128;
        return AFKeystoreWrapper2;
    }

    private int AFKeystoreWrapper(AFb1dSDK aFb1dSDK, String str, boolean z7) {
        int values2 = aFb1dSDK.values(str, 0);
        if (z7) {
            int i7 = onAttributionFailure + 15;
            onDeepLinking = i7 % 128;
            values2 = i7 % 2 == 0 ? values2 + 59 : values2 + 1;
            aFb1dSDK.AFInAppEventType(str, values2);
        }
        if (!(!AFInAppEventType().afErrorLogForExcManagerOnly().afInfoLog())) {
            int i8 = onDeepLinking + 5;
            onAttributionFailure = i8 % 128;
            if (i8 % 2 != 0) {
                AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(values2));
                throw null;
            }
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(values2));
        }
        return values2;
    }

    private long AFLogger(Context context) {
        onDeepLinking = (onAttributionFailure + 115) % 128;
        AFb1dSDK values2 = values(context);
        long valueOf2 = values2.valueOf("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        values2.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (valueOf2 <= 0) {
            int i7 = onDeepLinking + 65;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 == 0) {
                return -1L;
            }
            throw null;
        }
        int i8 = onAttributionFailure;
        int i9 = i8 + 83;
        onDeepLinking = i9 % 128;
        long j7 = (i9 % 2 == 0 ? currentTimeMillis / valueOf2 : currentTimeMillis - valueOf2) / 1000;
        int i10 = i8 + 15;
        onDeepLinking = i10 % 128;
        if (i10 % 2 != 0) {
            return j7;
        }
        throw null;
    }

    private boolean AFLogger$LogLevel() {
        Map<String, Object> map = this.onResponseErrorNative;
        if (map == null) {
            return false;
        }
        onDeepLinking = (onAttributionFailure + 75) % 128;
        if (map.isEmpty()) {
            return false;
        }
        onAttributionFailure = (onDeepLinking + 5) % 128;
        return true;
    }

    @NonNull
    private AFf1pSDK[] AFVersionDeclaration() {
        onDeepLinking = (onAttributionFailure + 73) % 128;
        AFf1pSDK[] valueOf2 = AFInAppEventType().AFLogger$LogLevel().valueOf();
        onDeepLinking = (onAttributionFailure + 43) % 128;
        return valueOf2;
    }

    private void afDebugLog() {
        AFf1oSDK AFLogger$LogLevel = AFInAppEventType().AFLogger$LogLevel();
        AFf1qSDK afErrorLog2 = afErrorLog();
        Runnable AFKeystoreWrapper2 = AFKeystoreWrapper(afErrorLog2);
        AFLogger$LogLevel.AFKeystoreWrapper(afErrorLog2);
        AFLogger$LogLevel.AFKeystoreWrapper(new AFf1jSDK(AFKeystoreWrapper2));
        AFLogger$LogLevel.AFKeystoreWrapper(new AFf1nSDK(AFKeystoreWrapper2, AFInAppEventType()));
        AFLogger$LogLevel.AFKeystoreWrapper(new AFf1mSDK(AFKeystoreWrapper2, AFInAppEventType()));
        if (!AFLogger()) {
            int i7 = onAttributionFailure + 21;
            onDeepLinking = i7 % 128;
            if (i7 % 2 == 0) {
                AFLogger$LogLevel.values(this.init, AFKeystoreWrapper2, AFInAppEventType());
                throw null;
            }
            AFLogger$LogLevel.values(this.init, AFKeystoreWrapper2, AFInAppEventType());
            onAttributionFailure = (onDeepLinking + 29) % 128;
        }
        AFf1pSDK[] valueOf2 = AFLogger$LogLevel.valueOf();
        int length = valueOf2.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = onDeepLinking + 1;
            onAttributionFailure = i9 % 128;
            if (i9 % 2 != 0) {
                valueOf2[i8].valueOf(this.init);
                i8 += 12;
            } else {
                valueOf2[i8].valueOf(this.init);
                i8++;
            }
            onAttributionFailure = (onDeepLinking + 51) % 128;
        }
    }

    private AFf1qSDK afErrorLog() {
        AFf1qSDK aFf1qSDK = new AFf1qSDK(new Runnable() { // from class: com.appsflyer.internal.b
            @Override // java.lang.Runnable
            public final void run() {
                AFa1eSDK.this.afErrorLogForExcManagerOnly();
            }
        }, AFInAppEventType().AFInAppEventType());
        int i7 = onDeepLinking + 45;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            return aFf1qSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void afErrorLogForExcManagerOnly() {
        ScheduledExecutorService valueOf2;
        Runnable runnable;
        long j7;
        int i7 = onAttributionFailure + 25;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            valueOf2 = AFInAppEventType().valueOf();
            runnable = new Runnable() { // from class: com.appsflyer.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1eSDK.this.getLevel();
                }
            };
            j7 = 1;
        } else {
            valueOf2 = AFInAppEventType().valueOf();
            runnable = new Runnable() { // from class: com.appsflyer.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1eSDK.this.getLevel();
                }
            };
            j7 = 0;
        }
        AFInAppEventParameterName(valueOf2, runnable, j7, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r4.getResources().getIdentifier("appsflyer_backup_rules", "xml", r4.getPackageName()) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        com.appsflyer.AFLogger.AFKeystoreWrapper("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = (com.appsflyer.internal.AFa1eSDK.onDeepLinking + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r4.getResources().getIdentifier("appsflyer_backup_rules", "xml", r4.getPackageName()) != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void afInfoLog(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Exception -> L3b
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L3b
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Exception -> L3b
            int r0 = r0.flags     // Catch: java.lang.Exception -> L3b
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L5f
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            java.lang.String r1 = "xml"
            java.lang.String r3 = "appsflyer_backup_rules"
            if (r0 == 0) goto L3d
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L3b
            int r4 = r0.getIdentifier(r3, r1, r4)     // Catch: java.lang.Exception -> L3b
            r0 = 16
            int r0 = r0 / r2
            if (r4 == 0) goto L5a
            goto L4b
        L39:
            r4 = move-exception
            throw r4
        L3b:
            r4 = move-exception
            goto L60
        L3d:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L3b
            int r4 = r0.getIdentifier(r3, r1, r4)     // Catch: java.lang.Exception -> L3b
            if (r4 == 0) goto L5a
        L4b:
            java.lang.String r4 = "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data"
            r0 = 1
            com.appsflyer.AFLogger.afInfoLog(r4, r0)     // Catch: java.lang.Exception -> L3b
            int r4 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r4 = r4 + 23
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r4
            return
        L5a:
            java.lang.String r4 = "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch: java.lang.Exception -> L3b
        L5f:
            return
        L60:
            java.lang.String r0 = "checkBackupRules Exception"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "checkBackupRules Exception: "
            java.lang.String r4 = r0.concat(r4)
            com.appsflyer.AFLogger.afRDLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.afInfoLog(android.content.Context):void");
    }

    private static String afRDLog() {
        int i7 = onAttributionFailure + 121;
        onDeepLinking = i7 % 128;
        if (i7 % 2 != 0) {
            return values(AppsFlyerProperties.APP_ID);
        }
        values(AppsFlyerProperties.APP_ID);
        throw null;
    }

    private void afWarnLog() {
        onAttributionFailure = (onDeepLinking + 21) % 128;
        if (AFd1lSDK.afInfoLog()) {
            int i7 = onAttributionFailure + 83;
            onDeepLinking = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        AFc1xSDK AFInAppEventType2 = AFInAppEventType();
        AFc1bSDK AFVersionDeclaration = AFInAppEventType2.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(new AFd1lSDK(AFInAppEventType2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getLevel() {
        try {
            AFe1lSDK aFe1lSDK = new AFe1lSDK();
            if (AFInAppEventParameterName(aFe1lSDK, values(this.init))) {
                onDeepLinking = (onAttributionFailure + 91) % 128;
                valueOf(aFe1lSDK);
                onDeepLinking = (onAttributionFailure + 1) % 128;
            }
            onAttributionFailure = (onDeepLinking + 53) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private int values(AFb1dSDK aFb1dSDK, boolean z7) {
        int i7 = onDeepLinking + 119;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            return AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", z7);
        }
        AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", z7);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i7 = onDeepLinking + 95;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        List<String> asList = Arrays.asList(strArr);
        if (i8 != 0) {
            AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType.contains(asList);
            throw null;
        }
        List<List<String>> list = AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType;
        if (list.contains(asList)) {
            return;
        }
        list.add(asList);
        onAttributionFailure = (onDeepLinking + 23) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z7) {
        onAttributionFailure = (onDeepLinking + 99) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("anonymizeUser", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z7);
        int i7 = onDeepLinking + 5;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 34 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i7 = onDeepLinking + 1;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            AFb1sSDK AppsFlyer2dXConversionCallback = AFInAppEventType().AppsFlyer2dXConversionCallback();
            AppsFlyer2dXConversionCallback.AFKeystoreWrapper = str;
            AppsFlyer2dXConversionCallback.values = map;
        } else {
            AFb1sSDK AppsFlyer2dXConversionCallback2 = AFInAppEventType().AppsFlyer2dXConversionCallback();
            AppsFlyer2dXConversionCallback2.AFKeystoreWrapper = str;
            AppsFlyer2dXConversionCallback2.values = map;
            int i8 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z7) {
        int i7 = onAttributionFailure;
        this.onDeepLinkingNative = z7;
        onDeepLinking = (i7 + 33) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        AFKeystoreWrapper(r4);
        r4 = AFInAppEventType().AFInAppEventParameterName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        return com.appsflyer.internal.AFb1zSDK.valueOf(r4.valueOf, r4.AFInAppEventType);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r4 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 11;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getAppsFlyerUID(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "getAppsFlyerUID"
            if (r0 != 0) goto L1f
            com.appsflyer.internal.AFc1xSDK r0 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1tSDK r0 = r0.afErrorLogForExcManagerOnly()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.AFInAppEventParameterName(r2, r1)
            if (r4 != 0) goto L3d
            goto L2e
        L1f:
            com.appsflyer.internal.AFc1xSDK r0 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1tSDK r0 = r0.afErrorLogForExcManagerOnly()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.AFInAppEventParameterName(r2, r1)
            if (r4 != 0) goto L3d
        L2e:
            int r4 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r4 = r4 + 11
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r0
            int r4 = r4 % 2
            r0 = 0
            if (r4 != 0) goto L3c
            return r0
        L3c:
            throw r0
        L3d:
            r3.AFKeystoreWrapper(r4)
            com.appsflyer.internal.AFc1xSDK r4 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1gSDK r4 = r4.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1bSDK r0 = r4.valueOf
            com.appsflyer.internal.AFb1dSDK r4 = r4.AFInAppEventType
            java.lang.String r4 = com.appsflyer.internal.AFb1zSDK.valueOf(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventType2 = new AFa1dSDK(context, AFInAppEventType()).AFInAppEventType();
            onDeepLinking = (onAttributionFailure + 19) % 128;
            return AFInAppEventType2;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        onAttributionFailure = (onDeepLinking + 63) % 128;
        String AFInAppEventParameterName = AFInAppEventType().onInstallConversionFailureNative().AFInAppEventParameterName();
        int i7 = onAttributionFailure + 83;
        onDeepLinking = i7 % 128;
        if (i7 % 2 != 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        String valueOf2;
        int i7 = onDeepLinking + 51;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            valueOf2 = AFInAppEventType().onInstallConversionFailureNative().valueOf();
            int i8 = 58 / 0;
        } else {
            valueOf2 = AFInAppEventType().onInstallConversionFailureNative().valueOf();
        }
        int i9 = onAttributionFailure + 119;
        onDeepLinking = i9 % 128;
        if (i9 % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("No out-of-store value set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = (com.appsflyer.internal.AFa1eSDK.onDeepLinking + 93) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r3 = values(r3, "AF_STORE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 55) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        return r3;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getOutOfStore(android.content.Context r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            java.lang.String r1 = "api_store_value"
            if (r0 == 0) goto L1d
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            r1 = 36
            int r1 = r1 / 0
            if (r0 == 0) goto L30
            goto L27
        L1d:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L30
        L27:
            int r3 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r3 = r3 + 93
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r3
            return r0
        L30:
            java.lang.String r0 = "AF_STORE"
            java.lang.String r3 = r2.values(r3, r0)
            if (r3 == 0) goto L41
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r0 = r0 + 55
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r0
            return r3
        L41:
            java.lang.String r3 = "No out-of-store value set"
            com.appsflyer.AFLogger.afInfoLog(r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.getOutOfStore(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        onAttributionFailure = (onDeepLinking + 91) % 128;
        AFc1xSDK AFInAppEventType2 = AFInAppEventType();
        AFInAppEventType2.afErrorLogForExcManagerOnly().AFInAppEventParameterName("getSdkVersion", new String[0]);
        AFInAppEventType2.AFInAppEventParameterName();
        String valueOf2 = AFb1gSDK.valueOf();
        int i7 = onAttributionFailure + 1;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 93 / 0;
        }
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.onAppOpenAttributionNative) {
            return this;
        }
        this.onAppOpenAttributionNative = true;
        AFInAppEventType().afWarnLog().AFInAppEventParameterName = str;
        AFa1aSDK.AFInAppEventType(str);
        if (context != null) {
            this.init = (Application) context.getApplicationContext();
            AFKeystoreWrapper(context);
            AFInAppEventType().afDebugLog().values = System.currentTimeMillis();
            AFInAppEventType().onConversionDataSuccess().values();
            AFInAppEventType().afRDLog().AFInAppEventParameterName(new AFd1bSDK() { // from class: com.appsflyer.internal.c
                @Override // com.appsflyer.internal.AFd1bSDK
                public final void onRemoteConfigUpdateFinished(AFd1dSDK aFd1dSDK) {
                    AFa1eSDK.this.AFInAppEventParameterName(aFd1dSDK);
                }
            });
            afDebugLog();
            this.onConversionDataFail.afWarnLog().AFInAppEventParameterName();
            onDeepLinking = (onAttributionFailure + 85) % 128;
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i7 = onDeepLinking + 47;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str2 = "null";
        } else {
            onDeepLinking = (onAttributionFailure + 69) % 128;
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("init", strArr);
        AFLogger.AFInAppEventType(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.12.2", values));
        this.AFInAppEventParameterName = appsFlyerConversionListener;
        int i8 = onAttributionFailure + 125;
        onDeepLinking = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 27 / 0;
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        onAttributionFailure = (onDeepLinking + 79) % 128;
        try {
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e7);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
            onAttributionFailure = (onDeepLinking + 1) % 128;
            return true;
        }
        onAttributionFailure = (onDeepLinking + 113) % 128;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        onAttributionFailure = (onDeepLinking + 49) % 128;
        boolean AFKeystoreWrapper2 = AFInAppEventType().afWarnLog().AFKeystoreWrapper();
        onAttributionFailure = (onDeepLinking + 103) % 128;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i7 = onDeepLinking + 15;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        logEvent(context, str, map, null);
        if (i8 != 0) {
            int i9 = 68 / 0;
        }
        int i10 = onDeepLinking + 103;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d7, double d8) {
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logLocation", String.valueOf(d7), String.valueOf(d8));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d8));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d7));
        AFInAppEventType(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        onAttributionFailure = (onDeepLinking + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        onDeepLinking = (onAttributionFailure + 41) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
        AFInAppEventType(context, AFe1nSDK.logSession);
        AFInAppEventType(context, null, null);
        int i7 = onDeepLinking + 47;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        onDeepLinking = (onAttributionFailure + 5) % 128;
        AFInAppEventType().onResponseNative().AFInAppEventType(context);
        onAttributionFailure = (onDeepLinking + 43) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r5 = AFInAppEventType().AppsFlyer2dXConversionCallback();
        r0 = new java.lang.StringBuilder("Context is \"");
        r0.append(r4);
        r0.append("\"");
        r5.AFKeystoreWrapper(r0.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(r4, new java.util.HashMap(), android.net.Uri.parse(r5.toString()));
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r5.toString().isEmpty() == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void performOnAppAttribution(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.net.URI r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\""
            if (r0 == 0) goto L15
            r0 = 83
            int r0 = r0 / 0
            if (r5 == 0) goto L64
            goto L17
        L15:
            if (r5 == 0) goto L64
        L17:
            java.lang.String r0 = r5.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            goto L64
        L22:
            if (r4 != 0) goto L43
            com.appsflyer.internal.AFc1xSDK r5 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1sSDK r5 = r5.AppsFlyer2dXConversionCallback()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Context is \""
            r0.<init>(r2)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r5.AFKeystoreWrapper(r4, r0)
            return
        L43:
            com.appsflyer.internal.AFc1xSDK r0 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1sSDK r0 = r0.AppsFlyer2dXConversionCallback()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0.valueOf(r4, r1, r5)
            int r4 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r4 = r4 + 119
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r4
            return
        L64:
            com.appsflyer.internal.AFc1xSDK r4 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1sSDK r4 = r4.AppsFlyer2dXConversionCallback()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Link is \""
            r0.<init>(r2)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r4.AFKeystoreWrapper(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.performOnAppAttribution(android.content.Context, java.net.URI):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        if (intent == null) {
            AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            AFKeystoreWrapper(applicationContext);
            AFInAppEventType().AFInAppEventType().execute(new Runnable() { // from class: com.appsflyer.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1eSDK.this.values(applicationContext, intent);
                }
            });
            return;
        }
        int i7 = onAttributionFailure + 125;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            throw null;
        }
        AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        onDeepLinking = (onAttributionFailure + 113) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        onDeepLinking = (onAttributionFailure + 59) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerConversionListener", new String[0]);
        AFKeystoreWrapper(appsFlyerConversionListener);
        int i7 = onAttributionFailure + 93;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            valueOf = appsFlyerInAppPurchaseValidatorListener;
            return;
        }
        onDeepLinking = (onAttributionFailure + 113) % 128;
        AFLogger.afDebugLog("registerValidatorListener null listener");
        int i7 = onDeepLinking + 3;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int AFInAppEventType2 = AFInAppEventType(values(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFInAppEventType2));
        AFKeystoreWrapper(context, hashMap, new AFe1kSDK());
        onAttributionFailure = (onDeepLinking + 17) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int AFInAppEventParameterName = AFInAppEventParameterName(values(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName));
        AFKeystoreWrapper(context, hashMap, new AFe1oSDK());
        int i7 = onDeepLinking + 59;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onDeepLinking = (onAttributionFailure + 59) % 128;
        AFKeystoreWrapper(context);
        PurchaseHandler afErrorLog2 = AFInAppEventType().afErrorLog();
        if (afErrorLog2.AFInAppEventParameterName(map, purchaseValidationCallback, "purchases")) {
            AFd1qSDK aFd1qSDK = new AFd1qSDK(map, purchaseValidationCallback, afErrorLog2.values);
            AFc1bSDK aFc1bSDK = afErrorLog2.valueOf;
            aFc1bSDK.AFKeystoreWrapper.execute(aFc1bSDK.new AnonymousClass4(aFd1qSDK));
        }
        int i7 = onDeepLinking + 25;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onAttributionFailure = (onDeepLinking + 63) % 128;
        AFKeystoreWrapper(context);
        PurchaseHandler afErrorLog2 = AFInAppEventType().afErrorLog();
        if (afErrorLog2.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFd1wSDK aFd1wSDK = new AFd1wSDK(map, purchaseValidationCallback, afErrorLog2.values);
            AFc1bSDK aFc1bSDK = afErrorLog2.valueOf;
            aFc1bSDK.AFKeystoreWrapper.execute(aFc1bSDK.new AnonymousClass4(aFd1wSDK));
        }
        onAttributionFailure = (onDeepLinking + 35) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017d  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i7 = onAttributionFailure + 29;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (map != null) {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        onDeepLinking = (onAttributionFailure + 99) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i7 = onAttributionFailure + 23;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[0] = str;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setAndroidIdData", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAndroidIdData", str);
        }
        this.AFLogger = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i7 = onAttributionFailure + 83;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setAppId", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        onAttributionFailure = (onDeepLinking + 53) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if ((!r4.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID))) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r4.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAppInviteOneLink(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 53
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r0
            com.appsflyer.internal.AFc1xSDK r0 = r3.AFInAppEventType()
            com.appsflyer.internal.AFb1tSDK r0 = r0.afErrorLogForExcManagerOnly()
            java.lang.String r1 = "setAppInviteOneLink"
            java.lang.String[] r2 = new java.lang.String[]{r4}
            r0.AFInAppEventParameterName(r1, r2)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "setAppInviteOneLink = "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.lang.String r0 = "oneLinkSlug"
            if (r4 == 0) goto L57
            int r1 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r2
            r2 = 2
            int r1 = r1 % r2
            if (r1 != 0) goto L47
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r1.getString(r0)
            boolean r1 = r4.equals(r1)
            int r2 = r2 / 0
            if (r1 != 0) goto L7a
            goto L57
        L47:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r1.getString(r0)
            boolean r1 = r4.equals(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L7a
        L57:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r1.remove(r2)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r1.remove(r2)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r1.remove(r2)
            int r1 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r1 = r1 + 121
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
        L7a:
            AFInAppEventType(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z7) {
        int i7 = onAttributionFailure + 107;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z7));
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z7));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z7));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z7));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z7) {
        int i7 = onAttributionFailure + 79;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z7);
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCollectIMEI", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z7));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z7));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z7));
        onAttributionFailure = (onDeepLinking + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z7) {
        int i7 = onDeepLinking + 29;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z7);
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectOaid", String.valueOf(z7));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z7));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i7 = onAttributionFailure + 125;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        onAttributionFailure = (onDeepLinking + 69) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            onAttributionFailure = (onDeepLinking + 63) % 128;
            boolean AFKeystoreWrapper2 = AFKeystoreWrapper();
            setCustomerUserId(str);
            if (!AFKeystoreWrapper2) {
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().values());
            AFInAppEventType(context, AFe1nSDK.setCustomerIdAndLogSession);
            String str2 = AFInAppEventType().afWarnLog().AFInAppEventParameterName;
            if (referrer == null) {
                referrer = "";
            }
            String str3 = referrer;
            if (context instanceof Activity) {
                int i7 = onAttributionFailure + 29;
                onDeepLinking = i7 % 128;
                if (i7 % 2 == 0) {
                    ((Activity) context).getIntent();
                    int i8 = 72 / 0;
                } else {
                    ((Activity) context).getIntent();
                }
            }
            AFKeystoreWrapper(context, null, null, str3, null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        onAttributionFailure = (onDeepLinking + 83) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        onAttributionFailure = (onDeepLinking + 119) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r3 != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.DEBUG;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setDebugLog(boolean r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 83
            int r0 = r0 / 0
            if (r3 == 0) goto L16
            goto L19
        L13:
            r0 = 1
            if (r3 == r0) goto L19
        L16:
            com.appsflyer.AFLogger$LogLevel r3 = com.appsflyer.AFLogger.LogLevel.NONE
            goto L1b
        L19:
            com.appsflyer.AFLogger$LogLevel r3 = com.appsflyer.AFLogger.LogLevel.DEBUG
        L1b:
            r2.setLogLevel(r3)
            int r3 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r3 = r3 + 103
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.setDebugLog(boolean):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z7) {
        boolean z8;
        int i7 = onAttributionFailure + 15;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z7)));
            throw null;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z7)));
        if (z7) {
            onAttributionFailure = (onDeepLinking + 35) % 128;
            z8 = false;
        } else {
            onAttributionFailure = (onDeepLinking + 29) % 128;
            z8 = true;
        }
        AFa1cSDK.valueOf = Boolean.valueOf(z8);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z7) {
        onDeepLinking = (onAttributionFailure + 15) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z7)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z7);
        int i7 = onDeepLinking + 93;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 97 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        onAttributionFailure = (onDeepLinking + 81) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i7 = onAttributionFailure + 65;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String str3;
        if (!(!AFb1uSDK.AFInAppEventType(str2))) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        onDeepLinking = (onAttributionFailure + 29) % 128;
        if (str != null) {
            str3 = str.trim();
            onAttributionFailure = (onDeepLinking + 95) % 128;
        } else {
            str3 = "";
        }
        AFc1dSDK.valueOf(new AFc1fSDK(str3, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i7 = onDeepLinking + 27;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventType().afWarnLog().values = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z7) {
        onDeepLinking = (onAttributionFailure + 119) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setIsUpdate", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z7);
        int i7 = onAttributionFailure + 43;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z7 = false;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i7 = onDeepLinking + 85;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 == 0) {
                z7 = true;
            }
        }
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("log", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        onAttributionFailure = (onDeepLinking + 95) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i7) {
        int i8 = onAttributionFailure + 77;
        onDeepLinking = i8 % 128;
        if (i8 % 2 != 0) {
            this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis(i7);
        } else {
            this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis(i7);
            int i9 = 39 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        onAttributionFailure = (onDeepLinking + 123) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setOaidData", str);
        AFa1cSDK.values = str;
        int i7 = onAttributionFailure + 95;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String format;
        int i7 = onAttributionFailure + 77;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            format = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            format = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        AFInAppEventType().AppsFlyer2dXConversionCallback().afDebugLog = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        r3 = r3.toLowerCase(java.util.Locale.getDefault());
        com.appsflyer.AppsFlyerProperties.getInstance().set(com.appsflyer.AppsFlyerProperties.AF_STORE_FROM_API, r3);
        com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(java.lang.String.valueOf(r3)), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        com.appsflyer.AFLogger.AFKeystoreWrapper("Cannot set setOutOfStore with null");
        r3 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 91;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if ((r3 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setOutOfStore(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 65
            int r0 = r0 / 0
            if (r3 == 0) goto L35
            goto L15
        L13:
            if (r3 == 0) goto L35
        L15:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toLowerCase(r0)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "api_store_value"
            r0.set(r1, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Store API set with value: "
            java.lang.String r3 = r0.concat(r3)
            r0 = 1
            com.appsflyer.AFLogger.afInfoLog(r3, r0)
            return
        L35:
            java.lang.String r3 = "Cannot set setOutOfStore with null"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)
            int r3 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r3 = r3 + 91
            int r0 = r3 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L47
            return
        L47:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.setOutOfStore(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r1 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 27;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if ((r1 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r2 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r5.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r1 = new java.lang.StringBuilder("Setting partner data for ");
        r1.append(r4);
        r1.append(": ");
        r1.append(r5);
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = new org.json.JSONObject(r5).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r1 <= 1000) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r5 = new java.util.HashMap();
        r5.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r1)));
        r0.AFInAppEventParameterName.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        r0.values.put(r4, r5);
        r0.AFInAppEventParameterName.remove(r4);
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r5.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r0.values.remove(r4) != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        r4 = "Partner data is missing or `null`";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        com.appsflyer.AFLogger.afWarnLog(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        r4 = "Cleared partner data for ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if ((!r4.isEmpty()) != true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r4.isEmpty() != false) goto L36;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPartnerData(@androidx.annotation.NonNull java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r3 = this;
            com.appsflyer.internal.AFb1lSDK r0 = r3.onResponseNative
            if (r0 != 0) goto Lb
            com.appsflyer.internal.AFb1lSDK r0 = new com.appsflyer.internal.AFb1lSDK
            r0.<init>()
            r3.onResponseNative = r0
        Lb:
            com.appsflyer.internal.AFb1lSDK r0 = r3.onResponseNative
            if (r4 == 0) goto Lc2
            int r1 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L27
            boolean r1 = r4.isEmpty()
            r2 = 92
            int r2 = r2 / 0
            if (r1 == 0) goto L31
            goto Lc2
        L27:
            boolean r1 = r4.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L31
            goto Lc2
        L31:
            if (r5 == 0) goto Lad
            int r1 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L4a
            boolean r1 = r5.isEmpty()
            r2 = 40
            int r2 = r2 / 0
            if (r1 == 0) goto L51
            goto Lad
        L4a:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L51
            goto Lad
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting partner data for "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r5)
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L9a
            java.lang.String r5 = "Partner data 1000 characters limit exceeded"
            com.appsflyer.AFLogger.afWarnLog(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r2 = "limit exceeded: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "error"
            r5.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.AFInAppEventParameterName
            r0.put(r4, r5)
            return
        L9a:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.values
            r1.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.AFInAppEventParameterName
            r5.remove(r4)
            int r4 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r4 = r4 + 77
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r4
            return
        Lad:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.values
            java.lang.Object r5 = r5.remove(r4)
            if (r5 != 0) goto Lb8
            java.lang.String r4 = "Partner data is missing or `null`"
            goto Lbe
        Lb8:
            java.lang.String r5 = "Cleared partner data for "
            java.lang.String r4 = r5.concat(r4)
        Lbe:
            com.appsflyer.AFLogger.afWarnLog(r4)
            return
        Lc2:
            java.lang.String r4 = "Partner ID is missing or `null`"
            com.appsflyer.AFLogger.afWarnLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.setPartnerData(java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i7 = onAttributionFailure + 35;
        onDeepLinking = i7 % 128;
        int i8 = i7 % 2;
        this.onAttributionFailureNative = AFc1nSDK.AFInAppEventType(str);
        if (i8 == 0) {
            throw null;
        }
        onAttributionFailure = (onDeepLinking + 77) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        onDeepLinking = (onAttributionFailure + 93) % 128;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventType().onInstallConversionDataLoadedNative().AFInAppEventParameterName(pluginInfo);
        onDeepLinking = (onAttributionFailure + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            onDeepLinking = (onAttributionFailure + 93) % 128;
            try {
                jSONObject.put("pid", str);
                onDeepLinking = (onAttributionFailure + 17) % 128;
            } catch (JSONException e7) {
                AFLogger.afErrorLog(e7.getMessage(), e7);
            }
        }
        if (str2 != null) {
            jSONObject.put(C1373c.f15449d, str2);
        }
        if (str3 != null) {
            int i7 = onDeepLinking + 41;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 != 0) {
                jSONObject.put("af_siteid", str3);
                throw null;
            }
            jSONObject.put("af_siteid", str3);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        int i8 = onDeepLinking + 117;
        onAttributionFailure = i8 % 128;
        if (i8 % 2 == 0) {
            AFInAppEventType("preInstallName", jSONObject.toString());
        } else {
            AFInAppEventType("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        onDeepLinking = (onAttributionFailure + 87) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFb1sSDK AppsFlyer2dXConversionCallback = AFInAppEventType().AppsFlyer2dXConversionCallback();
        AppsFlyer2dXConversionCallback.AFLogger.clear();
        AppsFlyer2dXConversionCallback.AFLogger.addAll(Arrays.asList(strArr));
        onAttributionFailure = (onDeepLinking + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        onAttributionFailure = (onDeepLinking + 69) % 128;
        setSharingFilterForPartners(strArr);
        onAttributionFailure = (onDeepLinking + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i7 = onDeepLinking + 47;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            setSharingFilterForPartners("all");
            return;
        }
        String[] strArr = new String[0];
        strArr[1] = "all";
        setSharingFilterForPartners(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afInfoLog = new AFa1cSDK(strArr);
        onDeepLinking = (onAttributionFailure + 95) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        onDeepLinking = (onAttributionFailure + 93) % 128;
        String str = null;
        for (String str2 : strArr) {
            onAttributionFailure = (onDeepLinking + 33) % 128;
            if (AnonymousClass5.valueOf[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFc1nSDK.AFInAppEventType(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        onAttributionFailure = (onDeepLinking + 61) % 128;
        start(context, null);
        int i7 = onAttributionFailure + 49;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z7, Context context) {
        onDeepLinking = (onAttributionFailure + 121) % 128;
        AFKeystoreWrapper(context);
        final AFc1xSDK AFInAppEventType2 = AFInAppEventType();
        AFInAppEventType2.afWarnLog().AFInAppEventType = z7;
        AFInAppEventType2.AFInAppEventType().submit(new Runnable() { // from class: com.appsflyer.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                AFa1eSDK.valueOf(AFc1xSDK.this);
            }
        });
        if (z7) {
            onAttributionFailure = (onDeepLinking + 69) % 128;
            AFInAppEventType2.values().values("is_stop_tracking_used", true);
        }
        int i7 = onAttributionFailure + 37;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 93 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i7 = onDeepLinking + 99;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i8 = 39 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        onDeepLinking = (onAttributionFailure + 55) % 128;
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        this.AFInAppEventParameterName = null;
        onAttributionFailure = (onDeepLinking + 123) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFKeystoreWrapper(context);
        AFe1ySDK aFe1ySDK = new AFe1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
        AFb1uSDK AFInAppEventParameterName = aFe1ySDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName == null || !str.equals(AFInAppEventParameterName.valueOf)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z7 = AFInAppEventParameterName == null || currentTimeMillis - AFInAppEventParameterName.AFKeystoreWrapper > TimeUnit.SECONDS.toMillis(2L);
            AFb1uSDK aFb1uSDK = new AFb1uSDK(str, currentTimeMillis, !z7);
            aFe1ySDK.values.AFInAppEventParameterName("afUninstallToken", aFb1uSDK.valueOf);
            aFe1ySDK.values.AFInAppEventParameterName("afUninstallToken_received_time", aFb1uSDK.AFKeystoreWrapper);
            aFe1ySDK.values.values("afUninstallToken_queued", aFb1uSDK.AFKeystoreWrapper());
            if (z7) {
                AFe1ySDK.valueOf(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            new Thread(new AFa1gSDK(context.getApplicationContext(), AFInAppEventType().afWarnLog().AFInAppEventParameterName, str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = valueOf;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    public final int valueOf(AFb1dSDK aFb1dSDK, boolean z7) {
        onAttributionFailure = (onDeepLinking + 9) % 128;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(aFb1dSDK, "appsFlyerCount", z7);
        onAttributionFailure = (onDeepLinking + 13) % 128;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z7) {
        onAttributionFailure = (onDeepLinking + 77) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z7)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z7);
        int i7 = onDeepLinking + 45;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static String AFInAppEventParameterName() {
        onAttributionFailure = (onDeepLinking + 3) % 128;
        String values2 = values(AppsFlyerProperties.APP_USER_ID);
        onDeepLinking = (onAttributionFailure + 99) % 128;
        return values2;
    }

    public static /* synthetic */ Application AFInAppEventType(AFa1eSDK aFa1eSDK) {
        int i7 = onAttributionFailure + 33;
        int i8 = i7 % 128;
        onDeepLinking = i8;
        int i9 = i7 % 2;
        Application application = aFa1eSDK.init;
        if (i9 == 0) {
            int i10 = 57 / 0;
        }
        int i11 = i8 + 35;
        onAttributionFailure = i11 % 128;
        if (i11 % 2 == 0) {
            return application;
        }
        throw null;
    }

    public static /* synthetic */ long AFKeystoreWrapper(AFa1eSDK aFa1eSDK, long j7) {
        int i7 = onDeepLinking;
        int i8 = i7 + 95;
        onAttributionFailure = i8 % 128;
        int i9 = i8 % 2;
        aFa1eSDK.afWarnLog = j7;
        if (i9 != 0) {
            throw null;
        }
        onAttributionFailure = (i7 + 77) % 128;
        return j7;
    }

    private boolean AFLogger() {
        boolean AFKeystoreWrapper2;
        int i7 = onAttributionFailure + 119;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            AFKeystoreWrapper2 = AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
            int i8 = 93 / 0;
        } else {
            AFKeystoreWrapper2 = AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
        }
        int i9 = onAttributionFailure + 79;
        onDeepLinking = i9 % 128;
        if (i9 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private void afErrorLog(Context context) {
        int i7;
        if (AFa1fSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
            i7 = 23;
        } else {
            i7 = 18;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < i7 || valueOf(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(i8);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(i8);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (aFKeystoreWrapper.AFKeystoreWrapper()) {
            String AFInAppEventParameterName = aFKeystoreWrapper.AFInAppEventParameterName();
            synchronized (aFKeystoreWrapper.valueOf) {
                aFKeystoreWrapper.values++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName)));
                try {
                    synchronized (aFKeystoreWrapper.valueOf) {
                        aFKeystoreWrapper.AFInAppEventType.deleteEntry(AFInAppEventParameterName);
                    }
                } catch (KeyStoreException e7) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e7.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e7);
                }
            }
        } else {
            aFKeystoreWrapper.AFKeystoreWrapper = AFb1zSDK.valueOf(AFInAppEventType().init(), AFInAppEventType().values());
            aFKeystoreWrapper.values = 0;
        }
        aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFInAppEventParameterName());
        AFInAppEventType("KSAppsFlyerId", aFKeystoreWrapper.valueOf());
        AFInAppEventType("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
    }

    private boolean afInfoLog() {
        onAttributionFailure = (onDeepLinking + 93) % 128;
        if (this.afDebugLog > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.afDebugLog;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String AFInAppEventType2 = AFInAppEventType(simpleDateFormat, this.afDebugLog);
            String AFInAppEventType3 = AFInAppEventType(simpleDateFormat, this.afWarnLog);
            if (currentTimeMillis < this.AFVersionDeclaration) {
                onDeepLinking = (onAttributionFailure + 35) % 128;
                if (!isStopped()) {
                    onDeepLinking = (onAttributionFailure + 121) % 128;
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", AFInAppEventType2, AFInAppEventType3, Long.valueOf(currentTimeMillis), Long.valueOf(this.AFVersionDeclaration)));
                    return true;
                }
            }
            if (!isStopped()) {
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", AFInAppEventType2, AFInAppEventType3, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i7 = onAttributionFailure + 11;
            onDeepLinking = i7 % 128;
            int i8 = i7 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
            if (i8 == 0) {
                throw null;
            }
        }
        int i9 = onDeepLinking + 59;
        onAttributionFailure = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static synchronized SharedPreferences valueOf(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFa1eSDK.class) {
            try {
                onAttributionFailure = (onDeepLinking + 119) % 128;
                if (valueOf().onConversionDataSuccess == null) {
                    onDeepLinking = (onAttributionFailure + 7) % 128;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        valueOf().onConversionDataSuccess = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
                sharedPreferences = valueOf().onConversionDataSuccess;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFKeystoreWrapper(context);
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = str;
        aFe1iSDK.AFInAppEventParameterName = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFKeystoreWrapper("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1iSDK.values(singletonMap);
        }
        aFe1iSDK.values = hashMap;
        AFb1tSDK afErrorLogForExcManagerOnly = AFInAppEventType().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = aFe1iSDK.values;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("logEvent", strArr);
        if (str == null) {
            AFInAppEventType(context, AFe1nSDK.logEvent);
        }
        values(aFe1iSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i7 = onAttributionFailure + 43;
        onDeepLinking = i7 % 128;
        if (i7 % 2 != 0) {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i8 = 7 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        onDeepLinking = (onAttributionFailure + 39) % 128;
        start(context, str, null);
        onAttributionFailure = (onDeepLinking + 37) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j7) {
        onAttributionFailure = (onDeepLinking + 83) % 128;
        AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventParameterName = deepLinkListener;
        AFInAppEventType().AppsFlyer2dXConversionCallback().afInfoLog = j7;
        int i7 = onAttributionFailure + 45;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 87 / 0;
        }
    }

    public final AFb1dSDK values(Context context) {
        onAttributionFailure = (onDeepLinking + 19) % 128;
        AFKeystoreWrapper(context);
        AFb1dSDK values2 = AFInAppEventType().values();
        onAttributionFailure = (onDeepLinking + 33) % 128;
        return values2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String AFInAppEventParameterName(android.app.Activity r6) {
        /*
            java.lang.String r0 = "af"
            r1 = 0
            if (r6 == 0) goto L57
            android.content.Intent r2 = r6.getIntent()
            if (r2 == 0) goto L57
            int r3 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L24
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L22
            r4 = 96
            int r4 = r4 / 0
            if (r3 == 0) goto L57
            goto L2a
        L22:
            r6 = move-exception
            goto L50
        L24:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L57
        L2a:
            java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L57
            java.lang.String r4 = "Push Notification received af payload = "
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L22
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch: java.lang.Throwable -> L22
            r3.remove(r0)     // Catch: java.lang.Throwable -> L22
            android.content.Intent r0 = r2.putExtras(r3)     // Catch: java.lang.Throwable -> L22
            r6.setIntent(r0)     // Catch: java.lang.Throwable -> L22
            int r6 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r6 = r6 + 41
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r6
            goto L57
        L50:
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventParameterName(android.app.Activity):java.lang.String");
    }

    private AFd1nSDK.AFa1xSDK AFKeystoreWrapper(final Map<String, String> map) {
        AFd1nSDK.AFa1xSDK aFa1xSDK = new AFd1nSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1eSDK.4
            @Override // com.appsflyer.internal.AFd1nSDK.AFa1xSDK
            public final void AFKeystoreWrapper(String str) {
                AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFd1nSDK.AFa1xSDK
            public final void values(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(map);
            }
        };
        int i7 = onDeepLinking + 25;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            return aFa1xSDK;
        }
        throw null;
    }

    public static AFa1eSDK valueOf() {
        AFa1eSDK aFa1eSDK;
        int i7 = onDeepLinking + 33;
        int i8 = i7 % 128;
        onAttributionFailure = i8;
        if (i7 % 2 != 0) {
            aFa1eSDK = afRDLog;
            int i9 = 80 / 0;
        } else {
            aFa1eSDK = afRDLog;
        }
        onDeepLinking = (i8 + 51) % 128;
        return aFa1eSDK;
    }

    private String values(Context context, String str) {
        if (context != null) {
            AFKeystoreWrapper(context);
            String AFInAppEventType2 = AFInAppEventType().AFInAppEventParameterName().AFInAppEventType(str);
            onAttributionFailure = (onDeepLinking + 63) % 128;
            return AFInAppEventType2;
        }
        int i7 = onDeepLinking + 7;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final AFc1xSDK AFInAppEventType() {
        int i7 = onDeepLinking;
        AFc1ySDK aFc1ySDK = this.onConversionDataFail;
        int i8 = i7 + 5;
        onAttributionFailure = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 48 / 0;
        }
        return aFc1ySDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i7 = onDeepLinking + 57;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            AFInAppEventType().onResponseNative().AFInAppEventType();
            throw null;
        }
        if (AFInAppEventType().onResponseNative().AFInAppEventType()) {
            return;
        }
        if (!this.onAppOpenAttributionNative) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    int i8 = onAttributionFailure + 75;
                    onDeepLinking = i8 % 128;
                    if (i8 % 2 == 0) {
                        appsFlyerRequestListener.onError(7, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    }
                }
                return;
            }
        }
        AFKeystoreWrapper(context);
        final AFe1mSDK afDebugLog = AFInAppEventType().afDebugLog();
        afDebugLog.AFKeystoreWrapper(AFa1rSDK.AFInAppEventParameterName(context));
        this.init = (Application) context.getApplicationContext();
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("start", str);
        String str2 = values;
        AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.12.2", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        AFLogger.afInfoLog(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventType().values());
        if (!TextUtils.isEmpty(str)) {
            onDeepLinking = (onAttributionFailure + 17) % 128;
            AFInAppEventType().afWarnLog().AFInAppEventParameterName = str;
            AFa1aSDK.AFInAppEventType(str);
        } else if (TextUtils.isEmpty(AFInAppEventType().afWarnLog().AFInAppEventParameterName)) {
            int i9 = onAttributionFailure + 111;
            onDeepLinking = i9 % 128;
            int i10 = i9 % 2;
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (i10 == 0) {
                throw null;
            }
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            onDeepLinking = (onAttributionFailure + 31) % 128;
            return;
        }
        AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK) null);
        afWarnLog();
        afInfoLog(this.init.getBaseContext());
        if (this.onDeepLinkingNative) {
            AFInAppEventType(this.init.getApplicationContext());
        }
        this.onConversionDataFail.onResponseNative().AFKeystoreWrapper(context, new AFb1iSDK.AFa1wSDK() { // from class: com.appsflyer.internal.AFa1eSDK.3
            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void AFInAppEventType(@NonNull Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFe1mSDK aFe1mSDK = afDebugLog;
                long currentTimeMillis = System.currentTimeMillis();
                long j7 = aFe1mSDK.afErrorLog;
                if (j7 != 0) {
                    long j8 = currentTimeMillis - j7;
                    if (j8 > 0 && j8 < 1000) {
                        j8 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j8);
                    aFe1mSDK.afWarnLog = seconds;
                    aFe1mSDK.valueOf.AFInAppEventParameterName("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1eSDK.this.AFKeystoreWrapper(new WeakReference<>(context2));
                AFa1eSDK.this.AFInAppEventType().onConversionDataSuccess().valueOf();
                AFb1tSDK afErrorLogForExcManagerOnly = AFa1eSDK.this.AFInAppEventType().afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly.afInfoLog()) {
                    afErrorLogForExcManagerOnly.values();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        afErrorLogForExcManagerOnly.valueOf(context2.getPackageName(), context2.getPackageManager(), AFa1eSDK.this.AFInAppEventType());
                    }
                    afErrorLogForExcManagerOnly.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1eSDK.this.AFInAppEventType().getLevel().AFInAppEventType();
            }

            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void values(@NonNull Activity activity) {
                afDebugLog.values();
                AFa1eSDK.this.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK) null);
                AFa1eSDK.AFInAppEventParameterName(AFa1eSDK.this);
                AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                int valueOf2 = aFa1eSDK.valueOf(aFa1eSDK.values(activity), false);
                AFLogger.afInfoLog("onBecameForeground");
                if (valueOf2 < 2) {
                    AFa1eSDK.this.AFInAppEventType().getLevel().AFInAppEventParameterName();
                }
                AFe1hSDK aFe1hSDK = new AFe1hSDK();
                if (activity != null) {
                    AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(aFe1hSDK.valueOf(), activity.getIntent(), activity.getApplication());
                }
                AFa1eSDK aFa1eSDK2 = AFa1eSDK.this;
                aFe1hSDK.AFInAppEventParameterName = appsFlyerRequestListener;
                aFa1eSDK2.values(aFe1hSDK, activity);
            }
        });
    }

    public static String AFInAppEventType(AFb1dSDK aFb1dSDK, String str) {
        String values2 = aFb1dSDK.values("CACHED_CHANNEL", (String) null);
        if (values2 == null) {
            aFb1dSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
            return str;
        }
        int i7 = (onAttributionFailure + 97) % 128;
        onDeepLinking = i7;
        onAttributionFailure = (i7 + 115) % 128;
        return values2;
    }

    private Runnable AFKeystoreWrapper(final AFf1qSDK aFf1qSDK) {
        onDeepLinking = (onAttributionFailure + 81) % 128;
        Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                AFa1eSDK.this.AFInAppEventType(aFf1qSDK);
            }
        };
        int i7 = onAttributionFailure + 13;
        onDeepLinking = i7 % 128;
        if (i7 % 2 != 0) {
            return runnable;
        }
        throw null;
    }

    private static String valueOf(String str) {
        onDeepLinking = (onAttributionFailure + 117) % 128;
        int indexOf = str.indexOf(63);
        if (indexOf != -1) {
            String substring = str.substring(indexOf);
            onDeepLinking = (onAttributionFailure + 93) % 128;
            return substring;
        }
        int i7 = onAttributionFailure + 45;
        onDeepLinking = i7 % 128;
        if (i7 % 2 != 0) {
            return "";
        }
        throw null;
    }

    private static String values(String str) {
        int i7 = onDeepLinking + 117;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0429 A[Catch: all -> 0x00c5, Exception -> 0x042f, TRY_LEAVE, TryCatch #0 {Exception -> 0x042f, blocks: (B:131:0x0413, B:133:0x0429), top: B:130:0x0413, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04cb A[Catch: all -> 0x04d5, TryCatch #15 {all -> 0x04d5, blocks: (B:147:0x04b4, B:151:0x04c7, B:153:0x04cb, B:154:0x04e0), top: B:146:0x04b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05d0 A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05d9 A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0650 A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x066f A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06dc A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x073c A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x061e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0409 A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:11:0x00b3, B:13:0x00b9, B:16:0x00ca, B:17:0x00d1, B:18:0x00d8, B:20:0x00e3, B:22:0x00ff, B:23:0x0108, B:25:0x0110, B:26:0x0115, B:28:0x011b, B:30:0x0123, B:32:0x012e, B:34:0x01ae, B:36:0x01b4, B:38:0x01ba, B:39:0x01d6, B:41:0x01e3, B:43:0x01ea, B:44:0x01f1, B:46:0x01f7, B:47:0x0201, B:49:0x0218, B:50:0x021d, B:53:0x0225, B:54:0x0228, B:56:0x022f, B:57:0x0232, B:59:0x0244, B:61:0x024a, B:62:0x024d, B:64:0x0255, B:65:0x025e, B:67:0x0262, B:70:0x026c, B:71:0x0271, B:73:0x0279, B:74:0x028f, B:77:0x029f, B:79:0x02a5, B:80:0x02af, B:82:0x02b7, B:83:0x02bc, B:85:0x02cf, B:87:0x02d5, B:88:0x02d8, B:90:0x02ee, B:92:0x02f8, B:93:0x02fd, B:95:0x0303, B:96:0x0310, B:98:0x0316, B:99:0x0323, B:101:0x0329, B:104:0x033a, B:106:0x0340, B:107:0x0359, B:109:0x035f, B:110:0x0364, B:112:0x036c, B:114:0x0373, B:115:0x037f, B:117:0x0385, B:118:0x038e, B:120:0x0397, B:122:0x039d, B:123:0x03b3, B:124:0x03b8, B:126:0x03c0, B:127:0x03c5, B:272:0x0409, B:276:0x03fd, B:129:0x040e, B:131:0x0413, B:133:0x0429, B:136:0x0446, B:138:0x045b, B:141:0x0470, B:142:0x0485, B:144:0x0494, B:177:0x05b3, B:179:0x05d0, B:181:0x05d9, B:183:0x05dd, B:185:0x05e5, B:186:0x05ec, B:188:0x0602, B:190:0x0615, B:220:0x061e, B:192:0x064a, B:194:0x0650, B:197:0x065e, B:199:0x0665, B:201:0x066f, B:202:0x0681, B:205:0x06a2, B:208:0x06b2, B:209:0x06b6, B:211:0x06dc, B:212:0x06e9, B:214:0x073c, B:216:0x0740, B:224:0x0630, B:229:0x05ad, B:252:0x04af, B:256:0x0480, B:259:0x046b, B:263:0x0456, B:266:0x0431, B:281:0x03f4, B:284:0x0344, B:286:0x0350, B:288:0x0356, B:289:0x0746, B:295:0x028a, B:298:0x0129, B:268:0x03db, B:270:0x03df), top: B:10:0x00b3, inners: #0, #1, #3, #7, #9, #11, #14, #18 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventParameterName(com.appsflyer.internal.AFa1qSDK r37) {
        /*
            Method dump skipped, instructions count: 1883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventParameterName(com.appsflyer.internal.AFa1qSDK):java.util.Map");
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFa1eSDK aFa1eSDK) {
        onAttributionFailure = (onDeepLinking + 75) % 128;
        aFa1eSDK.afWarnLog();
        int i7 = onDeepLinking + 21;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 65 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r1.length() != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1.contains("&") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r3 = new java.util.ArrayList(java.util.Arrays.asList(r1.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r5 = new java.lang.StringBuilder();
        r3 = r3.iterator();
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if ((!r3.hasNext()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 9) % 128;
        r6 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r6.contains("access_token") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r5.length() == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r7 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 49;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r7 % 128;
        r7 = r7 % 2;
        r5.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (r7 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        r7 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r6.startsWith("?") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r8 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 35;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r8 % 128;
        r8 = r8 % 2;
        r5.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r8 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r6 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 95;
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = r6 % 128;
        r6 = r6 % 2;
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r6 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r6 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        return r10.replace(r1, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 97) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0016, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (r1 + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x001c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0014, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r10.matches("fb\\d*?://authorize.*") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r10.contains("access_token") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 59) % 128;
        r1 = valueOf(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String AFInAppEventType(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventType(java.lang.String):java.lang.String");
    }

    @NonNull
    @Deprecated
    public static String values(HttpURLConnection httpURLConnection) {
        InputStreamReader inputStreamReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream, Charset.defaultCharset());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    onDeepLinking = (onAttributionFailure + 99) % 128;
                    boolean z7 = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                bufferedReader2.close();
                                inputStreamReader.close();
                                onAttributionFailure = (onDeepLinking + 97) % 128;
                                break;
                            }
                            int i7 = onAttributionFailure + 111;
                            onDeepLinking = i7 % 128;
                            if (i7 % 2 == 0) {
                                throw null;
                            }
                            sb.append(z7 ? '\n' : "");
                            sb.append(readLine);
                            z7 = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                String obj = sb.toString();
                                try {
                                    new JSONObject(obj);
                                    return obj;
                                } catch (JSONException e7) {
                                    AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", e7);
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("string_response", obj);
                                        return jSONObject.toString();
                                    } catch (JSONException e8) {
                                        AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", e8);
                                        return new JSONObject().toString();
                                    }
                                }
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th6);
        }
    }

    public final void AFKeystoreWrapper(@NonNull Context context) {
        int i7 = onAttributionFailure + 39;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        AFc1ySDK aFc1ySDK = this.onConversionDataFail;
        if (context != null) {
            AFb1bSDK aFb1bSDK = aFc1ySDK.valueOf;
            if (context != null) {
                aFb1bSDK.AFInAppEventType = context.getApplicationContext();
                onAttributionFailure = (onDeepLinking + 91) % 128;
            }
        }
    }

    public final void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFKeystoreWrapper(context);
        if (!map.containsKey("af_deeplink")) {
            int i7 = onAttributionFailure + 29;
            onDeepLinking = i7 % 128;
            if (i7 % 2 == 0) {
                AFInAppEventType(uri.toString());
                String str = AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper;
                throw null;
            }
            String AFInAppEventType2 = AFInAppEventType(uri.toString());
            AFb1sSDK AppsFlyer2dXConversionCallback = AFInAppEventType().AppsFlyer2dXConversionCallback();
            String str2 = AppsFlyer2dXConversionCallback.AFKeystoreWrapper;
            if (str2 != null && AppsFlyer2dXConversionCallback.values != null && AFInAppEventType2.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(AFInAppEventType2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                Iterator<Map.Entry<String, String>> it = AppsFlyer2dXConversionCallback.values.entrySet().iterator();
                int i8 = onDeepLinking + 115;
                while (true) {
                    onAttributionFailure = i8 % 128;
                    if (!it.hasNext()) {
                        break;
                    }
                    onAttributionFailure = (onDeepLinking + 23) % 128;
                    Map.Entry<String, String> next = it.next();
                    buildUpon.appendQueryParameter(next.getKey(), next.getValue());
                    buildUpon2.appendQueryParameter(next.getKey(), next.getValue());
                    i8 = onDeepLinking + 93;
                }
                AFInAppEventType2 = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", AFInAppEventType2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        AFd1nSDK aFd1nSDK = new AFd1nSDK(AFInAppEventType(), UUID.randomUUID(), uri);
        if (aFd1nSDK.afWarnLog()) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1fSDK.AFInAppEventType(context, hashMap, uri);
        if (!aFd1nSDK.AFVersionDeclaration()) {
            AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(hashMap);
            return;
        }
        aFd1nSDK.afInfoLog = AFKeystoreWrapper(hashMap);
        AFc1bSDK AFVersionDeclaration = AFInAppEventType().AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1nSDK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFd1dSDK aFd1dSDK) {
        onDeepLinking = (onAttributionFailure + 111) % 128;
        if (aFd1dSDK == AFd1dSDK.SUCCESS) {
            int i7 = onDeepLinking + 75;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 != 0) {
                AFInAppEventType().onConversionDataSuccess().AFInAppEventType();
                throw null;
            }
            AFInAppEventType().onConversionDataSuccess().AFInAppEventType();
        }
        int i8 = onDeepLinking + 81;
        onAttributionFailure = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static String AFInAppEventType(SimpleDateFormat simpleDateFormat, long j7) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j7));
        onDeepLinking = (onAttributionFailure + 43) % 128;
        return format;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        byte b7 = 0;
        AFa1qSDK AFInAppEventParameterName = new AFe1gSDK().AFInAppEventParameterName(AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0));
        AFInAppEventParameterName.afErrorLog = str;
        if (str != null && str.length() > 5 && AFInAppEventParameterName(AFInAppEventParameterName, values(context))) {
            AFInAppEventParameterName(AFInAppEventType().valueOf(), new AFa1vSDK(this, AFInAppEventParameterName, b7), 5L, TimeUnit.MILLISECONDS);
            onDeepLinking = (onAttributionFailure + 63) % 128;
        }
        int i7 = onAttributionFailure + 61;
        onDeepLinking = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 80 / 0;
        }
    }

    public static /* synthetic */ void valueOf(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK) {
        onAttributionFailure = (onDeepLinking + 55) % 128;
        aFa1eSDK.valueOf(aFa1qSDK);
        onAttributionFailure = (onDeepLinking + 83) % 128;
    }

    public static /* synthetic */ Map values(AFa1eSDK aFa1eSDK) {
        int i7 = (onAttributionFailure + 125) % 128;
        onDeepLinking = i7;
        Map<String, Object> map = aFa1eSDK.onResponseErrorNative;
        onAttributionFailure = (i7 + 47) % 128;
        return map;
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            onAttributionFailure = (onDeepLinking + 81) % 128;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                if (map.get("advertiserId") != null) {
                    try {
                        if (AFb1uSDK.values(this.AFLogger) && map.remove("android_id") != null) {
                            int i7 = onAttributionFailure + 89;
                            onDeepLinking = i7 % 128;
                            if (i7 % 2 == 0) {
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                                throw null;
                            }
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                        if (!AFb1uSDK.values(AFInAppEventType().afWarnLog().values) || map.remove("imei") == null) {
                            return;
                        }
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        return;
                    } catch (Exception e7) {
                        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e7);
                        return;
                    }
                }
                return;
            }
        }
        onAttributionFailure = (onDeepLinking + 9) % 128;
    }

    private void AFInAppEventType(Context context) {
        String str;
        this.onResponseErrorNative = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1uSDK.AFa1zSDK aFa1zSDK = new AFa1uSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1eSDK.2
            @Override // com.appsflyer.internal.AFa1uSDK.AFa1zSDK
            public final void AFKeystoreWrapper(String str2) {
                AFa1eSDK.values(AFa1eSDK.this).put("error", str2);
            }

            @Override // com.appsflyer.internal.AFa1uSDK.AFa1zSDK
            public final void valueOf(String str2, String str3, String str4) {
                if (str2 != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str2));
                    AFa1eSDK.values(AFa1eSDK.this).put("link", str2);
                    if (str3 != null) {
                        AFa1eSDK.values(AFa1eSDK.this).put("target_url", str3);
                    }
                    if (str4 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str4);
                        hashMap.put("deeplink_context", hashMap2);
                        AFa1eSDK.values(AFa1eSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFa1eSDK.values(AFa1eSDK.this).put("link", "");
                }
                AFa1eSDK.values(AFa1eSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        };
        try {
            C2146B c2146b = C2146B.f20862a;
            C2146B.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<L1.a> cls = L1.a.class;
            int i7 = L1.a.f3323a;
            Method method = L1.a.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, a.InterfaceC0063a.class);
            Object newProxyInstance = Proxy.newProxyInstance(a.InterfaceC0063a.class.getClassLoader(), new Class[]{a.InterfaceC0063a.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1uSDK.3
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    String str2;
                    String str3;
                    String str4;
                    Bundle bundle;
                    if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        AFa1zSDK aFa1zSDK2 = aFa1zSDK;
                        if (aFa1zSDK2 != null) {
                            aFa1zSDK2.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                        if (bundle2 != null) {
                            str3 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                            str4 = bundle2.getString("target_url");
                            Bundle bundle3 = bundle2.getBundle("extras");
                            str2 = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                        } else {
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        AFa1zSDK aFa1zSDK3 = aFa1zSDK;
                        if (aFa1zSDK3 != null) {
                            aFa1zSDK3.valueOf(str3, str4, str2);
                        }
                    } else {
                        AFa1zSDK aFa1zSDK4 = aFa1zSDK;
                        if (aFa1zSDK4 != null) {
                            aFa1zSDK4.valueOf(null, null, null);
                        }
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                method.invoke(null, context, string, newProxyInstance);
                onDeepLinking = (onAttributionFailure + 3) % 128;
            } else {
                onDeepLinking = (onAttributionFailure + 93) % 128;
                aFa1zSDK.AFKeystoreWrapper("Facebook app id not defined in resources");
            }
        } catch (ClassNotFoundException e7) {
            e = e7;
            str = "FB class missing error";
            AFLogger.afErrorLogForExcManagerOnly(str, e);
            aFa1zSDK.AFKeystoreWrapper(e.toString());
        } catch (IllegalAccessException e8) {
            e = e8;
            str = "FB illegal access";
            AFLogger.afErrorLogForExcManagerOnly(str, e);
            aFa1zSDK.AFKeystoreWrapper(e.toString());
        } catch (NoSuchMethodException e9) {
            e = e9;
            str = "FB method missing error";
            AFLogger.afErrorLogForExcManagerOnly(str, e);
            aFa1zSDK.AFKeystoreWrapper(e.toString());
        } catch (InvocationTargetException e10) {
            e = e10;
            str = "FB invocation error";
            AFLogger.afErrorLogForExcManagerOnly(str, e);
            aFa1zSDK.AFKeystoreWrapper(e.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r4.trim().isEmpty() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r4.trim().isEmpty() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r0 = new com.appsflyer.internal.AFe1iSDK();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFKeystoreWrapper(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, java.lang.String r6, java.lang.String r7) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r1 = r0 + 27
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
            if (r4 == 0) goto L34
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L23
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            r1 = 84
            int r1 = r1 / 0
            if (r0 == 0) goto L2e
            goto L34
        L23:
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            goto L34
        L2e:
            com.appsflyer.internal.AFe1iSDK r0 = new com.appsflyer.internal.AFe1iSDK
            r0.<init>()
            goto L39
        L34:
            com.appsflyer.internal.AFe1hSDK r0 = new com.appsflyer.internal.AFe1hSDK
            r0.<init>()
        L39:
            r2.AFKeystoreWrapper(r3)
            r0.afDebugLog = r4
            r0.values = r5
            r0.afErrorLog = r6
            r0.valueOf = r7
            r2.AFInAppEventType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFKeystoreWrapper(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (r5.length() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (isStopped() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r3 = valueOf(r3, false);
        r5 = new com.appsflyer.internal.AFf1fSDK(AFInAppEventType().AFInAppEventParameterName());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        r6 = r12.AFInAppEventParameterName();
        r7 = r12 instanceof com.appsflyer.internal.AFe1oSDK;
        r8 = r12 instanceof com.appsflyer.internal.AFe1kSDK;
        r9 = r12 instanceof com.appsflyer.internal.AFe1gSDK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        if ((r12 instanceof com.appsflyer.internal.AFe1lSDK) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r9 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r8 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        r1 = com.appsflyer.internal.AFf1fSDK.afErrorLogForExcManagerOnly;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        r1 = r5.AFInAppEventType;
        r6 = com.appsflyer.internal.AFf1fSDK.valueOf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ff, code lost:
    
        r1 = r1.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0122, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append(r1);
        r6.append(r5.values.valueOf.AFInAppEventType.getPackageName());
        r1 = r5.AFInAppEventParameterName(com.appsflyer.internal.AFf1fSDK.AFInAppEventParameterName(r6.toString(), r7));
        AFInAppEventParameterName(r4);
        r5 = new com.appsflyer.internal.AFa1eSDK.AFa1ySDK(r11, r12.AFKeystoreWrapper(r1).values(r4).AFInAppEventParameterName(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r0 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = (com.appsflyer.internal.AFa1eSDK.onDeepLinking + 43) % 128;
        r12 = AFVersionDeclaration();
        r0 = r12.length;
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0168, code lost:
    
        if (r2 >= r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016a, code lost:
    
        r4 = r12[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0170, code lost:
    
        if (r4.afDebugLog != com.appsflyer.internal.AFf1pSDK.AFa1zSDK.STARTED) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0172, code lost:
    
        r1 = new java.lang.StringBuilder("Failed to get ");
        r1.append(r4.AFKeystoreWrapper);
        r1.append(" referrer, wait ...");
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018b, code lost:
    
        r2 = r2 + 1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0190, code lost:
    
        if (r11.onDeepLinkingNative == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0192, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = (com.appsflyer.internal.AFa1eSDK.onDeepLinking + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019e, code lost:
    
        if (AFLogger$LogLevel() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a0, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b4, code lost:
    
        if (AFInAppEventType().afWarnLog().AFInAppEventType() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b6, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 123) % 128;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a7, code lost:
    
        r2 = r1 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bf, code lost:
    
        r12 = AFInAppEventType().valueOf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c7, code lost:
    
        if (r2 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c9, code lost:
    
        r0 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ce, code lost:
    
        AFInAppEventParameterName(r12, r5, r0, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cc, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r7 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        r1 = com.appsflyer.internal.AFf1fSDK.getLevel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        r1 = r5.AFInAppEventType;
        r6 = com.appsflyer.internal.AFf1fSDK.AFInAppEventParameterName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
    
        if (r6 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3 >= 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 93) % 128;
        r6 = com.appsflyer.internal.AFf1fSDK.AppsFlyer2dXConversionCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        r6 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 49;
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r3 = values(r0);
        com.appsflyer.AppsFlyerProperties.getInstance().saveProperties(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        if ((r6 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00de, code lost:
    
        r1 = r5.AFInAppEventType;
        r6 = com.appsflyer.internal.AFf1fSDK.afRDLog;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        r5.AFInAppEventType.valueOf(com.appsflyer.internal.AFf1fSDK.afRDLog);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
    
        r1 = com.appsflyer.internal.AFf1fSDK.onAppOpenAttributionNative;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        r1 = r5.AFInAppEventType;
        r6 = com.appsflyer.internal.AFf1fSDK.afErrorLog;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        r1 = com.appsflyer.internal.AFf1fSDK.onInstallConversionDataLoadedNative;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (AFInAppEventType().afWarnLog().AFKeystoreWrapper() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fb, code lost:
    
        r1 = r5.AFInAppEventType;
        r6 = com.appsflyer.internal.AFf1fSDK.AFLogger;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        r6 = com.appsflyer.internal.AFf1fSDK.afWarnLog;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0108, code lost:
    
        r6 = com.appsflyer.internal.AFa1eSDK.onDeepLinking + 73;
        com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r6 % 128;
        r6 = r6 % 2;
        r1 = r5.AFInAppEventType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
    
        if (r6 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
    
        r1 = r1.valueOf(com.appsflyer.internal.AFf1fSDK.AFKeystoreWrapper);
        r6 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        r6 = com.appsflyer.internal.AFf1fSDK.AFKeystoreWrapper;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        r12 = r12.AFInAppEventParameterName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01db, code lost:
    
        if (r12 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dd, code lost:
    
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r4 = new java.lang.StringBuilder("sendWithEvent from activity: ");
        r4.append(r0.getClass().getName());
        com.appsflyer.AFLogger.afInfoLog(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0029, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0027, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        r0 = r12.AFInAppEventParameterName();
        r4 = AFInAppEventParameterName(r12);
        r5 = (java.lang.String) r4.get("appsflyerKey");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        if (r5 == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void valueOf(com.appsflyer.internal.AFa1qSDK r12) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.valueOf(com.appsflyer.internal.AFa1qSDK):void");
    }

    public static Map<String, Object> values(Map<String, Object> map) {
        onAttributionFailure = (onDeepLinking + 73) % 128;
        if (!map.containsKey("meta")) {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        int i7 = onDeepLinking + 13;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        Map<String, Object> map2 = (Map) map.get("meta");
        if (i8 == 0) {
            return map2;
        }
        throw null;
    }

    private static void AFInAppEventParameterName(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j7, TimeUnit timeUnit) {
        String str;
        onAttributionFailure = (onDeepLinking + 111) % 128;
        try {
            scheduledExecutorService.schedule(runnable, j7, timeUnit);
            onAttributionFailure = (onDeepLinking + 125) % 128;
        } catch (RejectedExecutionException e7) {
            e = e7;
            str = "scheduleJob failed with RejectedExecutionException Exception";
            AFLogger.afErrorLog(str, e);
        } catch (Throwable th) {
            e = th;
            str = "scheduleJob failed with Exception";
            AFLogger.afErrorLog(str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r4 != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r4 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        com.appsflyer.internal.AFa1eSDK.onDeepLinking = (com.appsflyer.internal.AFa1eSDK.onAttributionFailure + 77) % 128;
        r3 = (android.app.Activity) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFKeystoreWrapper(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4, com.appsflyer.internal.AFa1qSDK r5) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
            int r0 = r0 % 2
            r2.AFKeystoreWrapper(r3)
            r5.values(r4)
            boolean r4 = r3 instanceof android.app.Activity
            if (r0 != 0) goto L1b
            r0 = 19
            int r0 = r0 / 0
            if (r4 == 0) goto L1e
            goto L20
        L1b:
            r0 = 1
            if (r4 == r0) goto L20
        L1e:
            r3 = 0
            goto L2a
        L20:
            int r4 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r4 = r4 + 77
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r4
            android.app.Activity r3 = (android.app.Activity) r3
        L2a:
            r2.values(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFKeystoreWrapper(android.content.Context, java.util.Map, com.appsflyer.internal.AFa1qSDK):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(AFc1xSDK aFc1xSDK) {
        onAttributionFailure = (onDeepLinking + 87) % 128;
        aFc1xSDK.onAppOpenAttributionNative().AFInAppEventType();
        int i7 = onDeepLinking + 53;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static void values() {
        onResponse = 139;
    }

    public final void AFInAppEventType(Context context, Intent intent) {
        int i7 = onDeepLinking + 71;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            intent.getStringExtra("appsflyer_preinstall");
            throw null;
        }
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            onDeepLinking = (onAttributionFailure + 23) % 128;
            AFKeystoreWrapper(intent.getStringExtra("appsflyer_preinstall"));
            onAttributionFailure = (onDeepLinking + 59) % 128;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            values(context).AFInAppEventParameterName("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.AFKeystoreWrapper = stringExtra;
            if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFInAppEventType(context, AFe1nSDK.onReceive);
                AFKeystoreWrapper(context, stringExtra);
            }
        }
        onAttributionFailure = (onDeepLinking + 29) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (x2.C2196j.m().g(r4) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean AFInAppEventParameterName(android.content.Context r4) {
        /*
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            x2.j r0 = x2.C2196j.m()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.g(r4)     // Catch: java.lang.Throwable -> L1c
            r3 = 53
            int r3 = r3 / r2
            if (r0 != 0) goto L36
            goto L28
        L1c:
            r0 = move-exception
            goto L3f
        L1e:
            x2.j r0 = x2.C2196j.m()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.g(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L36
        L28:
            int r4 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r4 = r4 + 107
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L35
            r1 = r2
        L35:
            return r1
        L36:
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 55
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r0
            goto L44
        L3f:
            java.lang.String r3 = "WARNING:  Google play services is unavailable. "
            com.appsflyer.AFLogger.afErrorLog(r3, r0)
        L44:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r0 = "com.google.android.gms"
            r4.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            return r1
        L4e:
            r4 = move-exception
            java.lang.String r0 = "WARNING:  Google Play Services is unavailable. "
            com.appsflyer.AFLogger.afErrorLog(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventParameterName(android.content.Context):boolean");
    }

    private void AFInAppEventType(Context context, AFe1nSDK aFe1nSDK) {
        AFKeystoreWrapper(context);
        AFe1mSDK afDebugLog = AFInAppEventType().afDebugLog();
        AFe1tSDK AFInAppEventParameterName = AFa1rSDK.AFInAppEventParameterName(context);
        if (afDebugLog.valueOf()) {
            onDeepLinking = (onAttributionFailure + 27) % 128;
            afDebugLog.AFInAppEventParameterName.put("api_name", aFe1nSDK.toString());
            afDebugLog.AFKeystoreWrapper(AFInAppEventParameterName);
            onDeepLinking = (onAttributionFailure + 23) % 128;
        }
        afDebugLog.values();
    }

    private void AFKeystoreWrapper(AppsFlyerConversionListener appsFlyerConversionListener) {
        onAttributionFailure = (onDeepLinking + 99) % 128;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventParameterName = appsFlyerConversionListener;
        onAttributionFailure = (onDeepLinking + 103) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.valueOf(org.json.JSONObject):void");
    }

    private static void values(int i7, String str, int i8, int i9, boolean z7, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1mSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = new char[i9];
                AFg1mSDK.AFInAppEventParameterName = 0;
                while (true) {
                    int i10 = AFg1mSDK.AFInAppEventParameterName;
                    if (i10 >= i9) {
                        break;
                    }
                    AFg1mSDK.values = cArr2[i10];
                    cArr3[AFg1mSDK.AFInAppEventParameterName] = (char) (AFg1mSDK.values + i8);
                    int i11 = AFg1mSDK.AFInAppEventParameterName;
                    cArr3[i11] = (char) (cArr3[i11] - onResponse);
                    AFg1mSDK.AFInAppEventParameterName = i11 + 1;
                }
                if (i7 > 0) {
                    AFg1mSDK.valueOf = i7;
                    char[] cArr4 = new char[i9];
                    System.arraycopy(cArr3, 0, cArr4, 0, i9);
                    int i12 = AFg1mSDK.valueOf;
                    System.arraycopy(cArr4, 0, cArr3, i9 - i12, i12);
                    int i13 = AFg1mSDK.valueOf;
                    System.arraycopy(cArr4, i13, cArr3, 0, i9 - i13);
                }
                if (z7) {
                    char[] cArr5 = new char[i9];
                    AFg1mSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i14 = AFg1mSDK.AFInAppEventParameterName;
                        if (i14 >= i9) {
                            break;
                        }
                        cArr5[i14] = cArr3[(i9 - i14) - 1];
                        AFg1mSDK.AFInAppEventParameterName = i14 + 1;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r1 != true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean AFInAppEventParameterName(com.appsflyer.internal.AFa1qSDK r6, com.appsflyer.internal.AFb1dSDK r7) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r5.valueOf(r7, r0)
            r2 = 1
            if (r1 != r2) goto L16
            boolean r6 = r6 instanceof com.appsflyer.internal.AFe1lSDK
            if (r6 != 0) goto L16
            int r6 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r6 = r6 + 81
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r6
            r6 = r2
            goto L17
        L16:
            r6 = r0
        L17:
            java.lang.String r3 = "newGPReferrerSent"
            boolean r7 = r7.valueOf(r3)
            if (r7 != 0) goto L45
            int r7 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r3 = r7 + 83
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2e
            if (r1 != 0) goto L45
            goto L30
        L2e:
            if (r1 != r2) goto L45
        L30:
            int r1 = r7 + 17
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L3c
            r1 = r0
            goto L3d
        L3c:
            r1 = r2
        L3d:
            int r7 = r7 + 67
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r7
            if (r1 == r2) goto L53
        L45:
            int r7 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r7 = r7 + 97
            int r1 = r7 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r7 = r7 % 2
            if (r7 != 0) goto L55
            if (r6 == 0) goto L54
        L53:
            return r2
        L54:
            return r0
        L55:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventParameterName(com.appsflyer.internal.AFa1qSDK, com.appsflyer.internal.AFb1dSDK):boolean");
    }

    private static void AFKeystoreWrapper(String str) {
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i7 = onAttributionFailure + 21;
            onDeepLinking = i7 % 128;
            if (i7 % 2 != 0) {
                AFInAppEventType("preInstallName", str);
            } else {
                AFInAppEventType("preInstallName", str);
                int i8 = 83 / 0;
            }
        } catch (JSONException e7) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e7);
        }
    }

    public static /* synthetic */ boolean valueOf(AFa1eSDK aFa1eSDK, boolean z7) {
        int i7 = onDeepLinking;
        onAttributionFailure = (i7 + 119) % 128;
        aFa1eSDK.AppsFlyer2dXConversionCallback = z7;
        int i8 = i7 + 21;
        onAttributionFailure = i8 % 128;
        if (i8 % 2 == 0) {
            return z7;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(Context context, Intent intent) {
        Uri uri;
        onDeepLinking = (onAttributionFailure + 67) % 128;
        AFKeystoreWrapper(context);
        AFb1sSDK AppsFlyer2dXConversionCallback = AFInAppEventType().AppsFlyer2dXConversionCallback();
        AFb1dSDK values2 = AFInAppEventType().values();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i7 = onDeepLinking + 35;
            onAttributionFailure = i7 % 128;
            if (i7 % 2 != 0) {
                intent.getData();
                throw null;
            }
            uri = intent.getData();
        }
        boolean z7 = false;
        if (uri != null && !uri.toString().isEmpty()) {
            int i8 = onDeepLinking + 115;
            onAttributionFailure = i8 % 128;
            if (i8 % 2 == 0) {
                z7 = true;
            }
        }
        if (!values2.valueOf("ddl_sent") || z7) {
            AppsFlyer2dXConversionCallback.valueOf(new HashMap(), intent, context);
        } else {
            AppsFlyer2dXConversionCallback.AFKeystoreWrapper("No direct deep link", null);
        }
    }

    public final void AFInAppEventType(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String values2 = values(context).values("extraReferrers", (String) null);
            if (values2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(values2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                    onAttributionFailure = (onDeepLinking + 49) % 128;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                onDeepLinking = (onAttributionFailure + 53) % 128;
                valueOf(jSONObject);
                onAttributionFailure = (onDeepLinking + 1) % 128;
            }
            jSONObject.put(str, jSONArray2.toString());
            values(context).AFInAppEventParameterName("extraReferrers", jSONObject.toString());
        } catch (JSONException e7) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e7);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    private void AFInAppEventType(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = str;
        aFe1iSDK.values = map;
        if (context instanceof Activity) {
            onDeepLinking = (onAttributionFailure + 103) % 128;
            activity = (Activity) context;
        } else {
            onAttributionFailure = (onDeepLinking + 125) % 128;
            activity = null;
        }
        values(aFe1iSDK, activity);
        onAttributionFailure = (onDeepLinking + 9) % 128;
    }

    private static boolean valueOf(String str, boolean z7) {
        int i7 = onDeepLinking + 21;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            AppsFlyerProperties.getInstance().getBoolean(str, z7);
            throw null;
        }
        boolean z8 = AppsFlyerProperties.getInstance().getBoolean(str, z7);
        int i8 = onAttributionFailure + 117;
        onDeepLinking = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 36 / 0;
        }
        return z8;
    }

    public final void AFKeystoreWrapper(WeakReference<Context> weakReference) {
        onAttributionFailure = (onDeepLinking + 3) % 128;
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        AFb1dSDK values2 = values(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(values2);
        long j7 = AFInAppEventType().afDebugLog().afWarnLog;
        HashMap hashMap = new HashMap();
        String str = AFInAppEventType().afWarnLog().AFInAppEventParameterName;
        if (str == null) {
            AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String values3 = values("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            onAttributionFailure = (onDeepLinking + 57) % 128;
        }
        AFc1uSDK.AFa1wSDK AFInAppEventParameterName = AFa1cSDK.AFInAppEventParameterName(weakReference.get().getContentResolver());
        if (AFInAppEventParameterName != null) {
            hashMap.put("amazon_aid", AFInAppEventParameterName.valueOf);
            hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            hashMap.put("advertiserId", string);
            onDeepLinking = (onAttributionFailure + 105) % 128;
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", str);
        hashMap.put("uid", AFb1zSDK.valueOf(AFInAppEventType().init(), AFInAppEventType().values()));
        hashMap.put("time_in_app", String.valueOf(j7));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(valueOf(values2, false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventType().AFInAppEventParameterName().values());
        if (values3 == null) {
            values3 = "";
        }
        hashMap.put("originalAppsflyerId", values3);
        if (this.AppsFlyer2dXConversionCallback) {
            AFe1bSDK aFe1bSDK = new AFe1bSDK();
            aFe1bSDK.afErrorLogForExcManagerOnly = isStopped();
            AFd1hSDK aFd1hSDK = new AFd1hSDK((AFe1bSDK) aFe1bSDK.AFInAppEventParameterName(AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0)).values(hashMap).AFKeystoreWrapper(String.format(afErrorLog, AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName())), AFInAppEventType());
            AFc1bSDK AFVersionDeclaration = AFInAppEventType().AFVersionDeclaration();
            AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1hSDK));
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
        int i7 = onDeepLinking + 99;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
    }

    public final void values(@NonNull AFa1qSDK aFa1qSDK, Activity activity) {
        AFInAppEventType(aFa1qSDK, activity);
        if (AFInAppEventType().afWarnLog().AFInAppEventParameterName != null) {
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().values());
            if (referrer == null) {
                referrer = "";
            } else {
                onAttributionFailure = (onDeepLinking + 99) % 128;
            }
            aFa1qSDK.afErrorLog = referrer;
            AFInAppEventType(aFa1qSDK);
            onAttributionFailure = (onDeepLinking + 95) % 128;
            return;
        }
        int i7 = onDeepLinking + 65;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventParameterName;
        if (i8 != 0) {
            throw null;
        }
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        onDeepLinking = (onAttributionFailure + 95) % 128;
        byte b7 = 0;
        boolean z7 = aFa1qSDK.afDebugLog == null;
        if (AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z7) {
            onDeepLinking = (onAttributionFailure + 23) % 128;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (afInfoLog()) {
                int i7 = onDeepLinking + 109;
                onAttributionFailure = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventParameterName;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                    return;
                }
                return;
            }
            this.afDebugLog = System.currentTimeMillis();
        }
        AFInAppEventParameterName(AFInAppEventType().valueOf(), new AFa1vSDK(this, aFa1qSDK, b7), 0L, TimeUnit.MILLISECONDS);
        onDeepLinking = (onAttributionFailure + 59) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFKeystoreWrapper() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r1
            int r0 = r0 % 2
            r1 = 1
            java.lang.String r2 = "waitForCustomerId"
            r3 = 0
            if (r0 == 0) goto L17
            boolean r0 = valueOf(r2, r3)
            if (r0 == 0) goto L3c
            goto L1f
        L17:
            boolean r0 = valueOf(r2, r3)
            r0 = r0 ^ r1
            if (r0 == 0) goto L1f
            goto L3c
        L1f:
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r0 = r0 + 67
            int r2 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L35
            java.lang.String r0 = AFInAppEventParameterName()
            r2 = 46
            int r2 = r2 / r3
            if (r0 != 0) goto L3c
            goto L3b
        L35:
            java.lang.String r0 = AFInAppEventParameterName()
            if (r0 != 0) goto L3c
        L3b:
            return r1
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFKeystoreWrapper():boolean");
    }

    private void AFInAppEventType(@NonNull AFa1qSDK aFa1qSDK, Activity activity) {
        onAttributionFailure = (onDeepLinking + 117) % 128;
        AFf1vSDK onResponseErrorNative = AFInAppEventType().onResponseErrorNative();
        aFa1qSDK.valueOf = onResponseErrorNative.values(activity);
        aFa1qSDK.afInfoLog = onResponseErrorNative.valueOf(activity);
        int i7 = onDeepLinking + 13;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r7.afDebugLog == com.appsflyer.internal.AFf1pSDK.AFa1zSDK.NOT_STARTED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r7.afDebugLog == com.appsflyer.internal.AFf1pSDK.AFa1zSDK.NOT_STARTED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void AFInAppEventType(com.appsflyer.internal.AFf1qSDK r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r1
            int r0 = r0 % 2
            r1 = 1
            java.lang.String r2 = "newGPReferrerSent"
            java.lang.String r3 = "appsFlyerCount"
            r4 = 0
            if (r0 != 0) goto L31
            android.app.Application r0 = r6.init
            com.appsflyer.internal.AFb1dSDK r0 = r6.values(r0)
            com.appsflyer.internal.AFc1xSDK r5 = r6.AFInAppEventType()
            com.appsflyer.internal.AFb1gSDK r5 = r5.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1dSDK r5 = r5.AFInAppEventType
            int r3 = r5.values(r3, r4)
            boolean r0 = r0.valueOf(r2)
            com.appsflyer.internal.AFf1pSDK$AFa1zSDK r7 = r7.afDebugLog
            com.appsflyer.internal.AFf1pSDK$AFa1zSDK r2 = com.appsflyer.internal.AFf1pSDK.AFa1zSDK.NOT_STARTED
            if (r7 != r2) goto L50
            goto L4f
        L31:
            android.app.Application r0 = r6.init
            com.appsflyer.internal.AFb1dSDK r0 = r6.values(r0)
            com.appsflyer.internal.AFc1xSDK r5 = r6.AFInAppEventType()
            com.appsflyer.internal.AFb1gSDK r5 = r5.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1dSDK r5 = r5.AFInAppEventType
            int r3 = r5.values(r3, r4)
            boolean r0 = r0.valueOf(r2)
            com.appsflyer.internal.AFf1pSDK$AFa1zSDK r7 = r7.afDebugLog
            com.appsflyer.internal.AFf1pSDK$AFa1zSDK r2 = com.appsflyer.internal.AFf1pSDK.AFa1zSDK.NOT_STARTED
            if (r7 != r2) goto L50
        L4f:
            r4 = r1
        L50:
            if (r3 != r1) goto L6c
            int r7 = com.appsflyer.internal.AFa1eSDK.onAttributionFailure
            int r7 = r7 + 99
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1eSDK.onDeepLinking = r7
            if (r4 != 0) goto L64
            int r7 = r7 + 35
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r7
            if (r0 == 0) goto L6c
        L64:
            com.appsflyer.internal.AFe1lSDK r7 = new com.appsflyer.internal.AFe1lSDK
            r7.<init>()
            r6.valueOf(r7)
        L6c:
            int r7 = com.appsflyer.internal.AFa1eSDK.onDeepLinking
            int r7 = r7 + 113
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1eSDK.onAttributionFailure = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventType(com.appsflyer.internal.AFf1qSDK):void");
    }

    private static void AFInAppEventType(String str, String str2) {
        int i7 = onDeepLinking + 43;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
    }

    private static void AFInAppEventType(String str, boolean z7) {
        int i7 = onDeepLinking + 39;
        onAttributionFailure = i7 % 128;
        if (i7 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z7);
        } else {
            AppsFlyerProperties.getInstance().set(str, z7);
            int i8 = 70 / 0;
        }
    }
}
