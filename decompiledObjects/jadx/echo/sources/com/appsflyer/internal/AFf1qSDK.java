package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1qSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AFf1qSDK extends AFf1uSDK {

    @NonNull
    private final ExecutorService AFInAppEventType;
    public final Map<String, Object> valueOf;

    /* renamed from: com.appsflyer.internal.AFf1qSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass5(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i7) {
            AFf1qSDK.valueOf(AFf1qSDK.this, installReferrerClient, context, i7);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.afDebugLog("Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i7) {
            ExecutorService executorService = AFf1qSDK.this.AFInAppEventType;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.w
                @Override // java.lang.Runnable
                public final void run() {
                    AFf1qSDK.AnonymousClass5.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i7);
                }
            });
        }
    }

    public AFf1qSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService) {
        super("store", "google", runnable);
        this.valueOf = new HashMap();
        this.AFInAppEventType = executorService;
    }

    private static boolean AFInAppEventType(@NonNull Context context) {
        if (!AFf1uSDK.valueOf()) {
            return false;
        }
        try {
            if (AFa1fSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e7) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e7);
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.afRDLog(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(Context context) {
        if (AFInAppEventType(context)) {
            this.afInfoLog = System.currentTimeMillis();
            this.afDebugLog = AFf1pSDK.AFa1zSDK.STARTED;
            addObserver(new AFf1pSDK.AnonymousClass1());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass5(build, context));
            } catch (Throwable th) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th);
            }
        }
    }

    public static /* synthetic */ void valueOf(AFf1qSDK aFf1qSDK, InstallReferrerClient installReferrerClient, Context context, int i7) {
        Map<String, Object> map;
        String str;
        String str2;
        aFf1qSDK.valueOf.put("code", String.valueOf(i7));
        aFf1qSDK.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFa1fSDK.AFInAppEventType(context, "com.android.vending")));
        aFf1qSDK.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(context, "com.android.vending"));
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 == 1) {
                    aFf1qSDK.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                    str2 = "InstallReferrer not supported";
                } else if (i7 == 2) {
                    AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                    map = aFf1qSDK.AFInAppEventParameterName;
                    str = "FEATURE_NOT_SUPPORTED";
                } else if (i7 != 3) {
                    str2 = "responseCode not found.";
                } else {
                    AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                    map = aFf1qSDK.AFInAppEventParameterName;
                    str = "DEVELOPER_ERROR";
                }
                AFLogger.afWarnLog(str2);
            } else {
                aFf1qSDK.AFInAppEventParameterName.put("response", "OK");
                try {
                    AFLogger.afDebugLog("InstallReferrer connected");
                    if (installReferrerClient.isReady()) {
                        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null) {
                            aFf1qSDK.valueOf.put("val", installReferrer2);
                            aFf1qSDK.AFInAppEventParameterName.put("referrer", installReferrer2);
                        }
                        long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                        aFf1qSDK.valueOf.put("clk", Long.toString(referrerClickTimestampSeconds));
                        aFf1qSDK.AFInAppEventParameterName.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                        long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                        aFf1qSDK.valueOf.put("install", Long.toString(installBeginTimestampSeconds));
                        aFf1qSDK.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                        HashMap hashMap = new HashMap();
                        try {
                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                            aFf1qSDK.valueOf.put("instant", Boolean.valueOf(googlePlayInstantParam));
                            hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        } catch (NoSuchMethodError e7) {
                            AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e7);
                        }
                        try {
                            hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                            hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                            hashMap.put("install_version", installReferrer.getInstallVersion());
                        } catch (NoSuchMethodError e8) {
                            AFLogger.afErrorLogForExcManagerOnly("some method not exist", e8);
                        }
                        if (!hashMap.isEmpty()) {
                            aFf1qSDK.AFInAppEventParameterName.put("google_custom", hashMap);
                        }
                        installReferrerClient.endConnection();
                    } else {
                        AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                        aFf1qSDK.valueOf.put("err", "ReferrerClient: InstallReferrer is not ready");
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                    sb.append(th.getMessage());
                    AFLogger.afWarnLog(sb.toString());
                    aFf1qSDK.valueOf.put("err", th.getMessage());
                    AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th);
                }
            }
            AFLogger.afDebugLog("Install Referrer collected locally");
            aFf1qSDK.values();
        }
        AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
        map = aFf1qSDK.AFInAppEventParameterName;
        str = "SERVICE_DISCONNECTED";
        map.put("response", str);
        AFLogger.afDebugLog("Install Referrer collected locally");
        aFf1qSDK.values();
    }
}
