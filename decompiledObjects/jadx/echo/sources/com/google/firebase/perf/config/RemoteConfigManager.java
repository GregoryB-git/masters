package com.google.firebase.perf.config;

import C4.d;
import C4.x;
import F4.a;
import M4.g;
import P4.m;
import P4.t;
import V2.InterfaceC0655f;
import V2.InterfaceC0656g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r4.InterfaceC1922b;
import s3.C1947e;
import s3.n;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, t> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private m firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC1922b firebaseRemoteConfigProvider;
    private static final a logger = a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.f(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS), getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        n nVar = (n) C1947e.o().k(n.class);
        return nVar != null ? nVar.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private t getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        t tVar = this.allRcConfigMap.get(str);
        if (tVar.f() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", tVar.b(), str);
        return tVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j7) {
        return j7 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j7) {
        return j7 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.l().e(this.executor, new InterfaceC0656g() { // from class: C4.y
            @Override // V2.InterfaceC0656g
            public final void a(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).d(this.executor, new InterfaceC0655f() { // from class: C4.z
            @Override // V2.InterfaceC0655f
            public final void d(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public g getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return g.a();
        }
        t remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public g getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return g.a();
        }
        t remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Double.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    public g getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return g.a();
        }
        t remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t7) {
        Object obj;
        t remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t7;
        }
        try {
            if (t7 instanceof Boolean) {
                obj = Boolean.valueOf(remoteConfigValue.d());
            } else if (t7 instanceof Double) {
                obj = Double.valueOf(remoteConfigValue.a());
            } else {
                if (!(t7 instanceof Long) && !(t7 instanceof Integer)) {
                    if (!(t7 instanceof String)) {
                        T t8 = (T) remoteConfigValue.b();
                        try {
                            logger.b("No matching type found for the defaultValue: '%s', using String.", t7);
                            return t8;
                        } catch (IllegalArgumentException unused) {
                            t7 = t8;
                            if (remoteConfigValue.b().isEmpty()) {
                                return t7;
                            }
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                            return t7;
                        }
                    }
                    obj = remoteConfigValue.b();
                }
                obj = Long.valueOf(remoteConfigValue.c());
            }
            return obj;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public g getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return g.a();
        }
        t remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? g.e(remoteConfigValue.b()) : g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC1922b interfaceC1922b;
        P4.x xVar;
        if (this.firebaseRemoteConfig == null && (interfaceC1922b = this.firebaseRemoteConfigProvider) != null && (xVar = (P4.x) interfaceC1922b.get()) != null) {
            this.firebaseRemoteConfig = xVar.c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        m mVar = this.firebaseRemoteConfig;
        return mVar == null || mVar.n().c() == 1 || this.firebaseRemoteConfig.n().c() == 2;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC1922b interfaceC1922b) {
        this.firebaseRemoteConfigProvider = interfaceC1922b;
    }

    public void syncConfigValues(Map<String, t> map) {
        a aVar;
        String str;
        this.allRcConfigMap.putAll(map);
        for (String str2 : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str2)) {
                this.allRcConfigMap.remove(str2);
            }
        }
        d e7 = d.e();
        t tVar = this.allRcConfigMap.get(e7.c());
        if (tVar != null) {
            try {
                this.cache.n(e7.a(), tVar.d());
                return;
            } catch (Exception unused) {
                aVar = logger;
                str = "ExperimentTTID remote config flag has invalid value, expected boolean.";
            }
        } else {
            aVar = logger;
            str = "ExperimentTTID remote config flag does not exist.";
        }
        aVar.a(str);
    }

    public RemoteConfigManager(x xVar, Executor executor, m mVar, long j7, long j8) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = mVar;
        this.allRcConfigMap = mVar == null ? new ConcurrentHashMap<>() : new ConcurrentHashMap<>(mVar.m());
        this.appStartTimeInMs = j8;
        this.appStartConfigFetchDelayInMs = j7;
    }
}
