/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.perf.config;

import C4.d;
import C4.x;
import C4.y;
import C4.z;
import F4.a;
import P4.m;
import P4.q;
import P4.t;
import V2.f;
import V2.g;
import V2.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r4.b;
import s3.e;
import s3.n;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0L;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000L;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    private static final RemoteConfigManager instance;
    private static final a logger;
    private final ConcurrentHashMap<String, t> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private m firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs = 0L;
    private b firebaseRemoteConfigProvider;

    static {
        logger = a.e();
        instance = new RemoteConfigManager();
        TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12L);
    }

    @SuppressLint(value={"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.f(), (Executor)new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue()), null, 5000L + (long)new Random().nextInt(25000), RemoteConfigManager.getInitialStartupMillis());
    }

    public RemoteConfigManager(x x8, Executor executor, m m8, long l8, long l9) {
        this.cache = x8;
        this.executor = executor;
        this.firebaseRemoteConfig = m8;
        x8 = m8 == null ? new ConcurrentHashMap() : new ConcurrentHashMap(m8.m());
        this.allRcConfigMap = x8;
        this.appStartTimeInMs = l9;
        this.appStartConfigFetchDelayInMs = l8;
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exception) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exception);
    }

    public static /* synthetic */ void b(RemoteConfigManager remoteConfigManager, Boolean bl) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(bl);
    }

    public static long getInitialStartupMillis() {
        n n8 = (n)e.o().k(n.class);
        if (n8 != null) {
            return n8.c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private t getRemoteConfigValue(String string2) {
        t t8;
        this.triggerRemoteConfigFetchIfNecessary();
        if (this.isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey((Object)string2) && (t8 = (t)this.allRcConfigMap.get((Object)string2)).f() == 2) {
            logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", t8.b(), string2);
            return t8;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            int n8 = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
            return n8;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long l8) {
        if (l8 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long l8) {
        if (l8 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bl) {
        this.syncConfigValues(this.firebaseRemoteConfig.m());
    }

    private /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exception) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", new Object[]{exception});
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long l8 = this.getCurrentSystemTimeMillis();
        if (this.hasAppStartConfigFetchDelayElapsed(l8) && this.hasLastFetchBecomeStale(l8)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = this.getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.l().e(this.executor, new y(this)).d(this.executor, new z(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!this.isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m());
        }
        if (this.shouldFetchAndActivateRemoteConfigValues()) {
            this.triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public M4.g getBoolean(String string2) {
        if (string2 == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return M4.g.a();
        }
        t t8 = this.getRemoteConfigValue(string2);
        if (t8 == null) return M4.g.a();
        try {
            return M4.g.e(t8.d());
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        if (t8.b().isEmpty()) return M4.g.a();
        logger.b("Could not parse value: '%s' for key: '%s'.", t8.b(), string2);
        return M4.g.a();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public M4.g getDouble(String string2) {
        if (string2 == null) {
            logger.a("The key to get Remote Config double value is null.");
            return M4.g.a();
        }
        t t8 = this.getRemoteConfigValue(string2);
        if (t8 == null) return M4.g.a();
        try {
            return M4.g.e(t8.a());
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        if (t8.b().isEmpty()) return M4.g.a();
        logger.b("Could not parse value: '%s' for key: '%s'.", t8.b(), string2);
        return M4.g.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public M4.g getLong(String string2) {
        if (string2 == null) {
            logger.a("The key to get Remote Config long value is null.");
            return M4.g.a();
        }
        t t8 = this.getRemoteConfigValue(string2);
        if (t8 == null) return M4.g.a();
        try {
            return M4.g.e(t8.c());
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        if (t8.b().isEmpty()) return M4.g.a();
        logger.b("Could not parse value: '%s' for key: '%s'.", t8.b(), string2);
        return M4.g.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> T getRemoteConfigValueOrDefault(String object, T object2) {
        t t8;
        Object object3;
        block9 : {
            block8 : {
                t8 = this.getRemoteConfigValue((String)object);
                object3 = object2;
                if (t8 == null) return (T)object3;
                try {
                    if (object2 instanceof Boolean) {
                        object = object3 = Boolean.valueOf((boolean)t8.d());
                        return (T)object;
                    }
                    if (object2 instanceof Double) {
                        object = object3 = Double.valueOf((double)t8.a());
                        return (T)object;
                    }
                    if (object2 instanceof Long || object2 instanceof Integer) break block8;
                    if (object2 instanceof String) {
                        object = object3 = t8.b();
                        return (T)object;
                    }
                    object3 = t8.b();
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                try {
                    logger.b("No matching type found for the defaultValue: '%s', using String.", object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                return (T)object3;
            }
            object = object3 = Long.valueOf((long)t8.c());
            return (T)object;
            break block9;
            object2 = object3;
        }
        object3 = object2;
        if (t8.b().isEmpty()) return (T)object3;
        logger.b("Could not parse value: '%s' for key: '%s'.", t8.b(), object);
        object3 = object2;
        return (T)object3;
    }

    public M4.g getString(String object) {
        if (object == null) {
            logger.a("The key to get Remote Config String value is null.");
            return M4.g.a();
        }
        if ((object = this.getRemoteConfigValue((String)object)) != null) {
            return M4.g.e(object.b());
        }
        return M4.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Object object;
        if (this.firebaseRemoteConfig == null && (object = this.firebaseRemoteConfigProvider) != null && (object = (P4.x)object.get()) != null) {
            this.firebaseRemoteConfig = object.c("fireperf");
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        boolean bl;
        m m8 = this.firebaseRemoteConfig;
        boolean bl2 = bl = true;
        if (m8 != null) {
            bl2 = bl;
            if (m8.n().c() != 1) {
                if (this.firebaseRemoteConfig.n().c() == 2) {
                    return true;
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    public void setFirebaseRemoteConfigProvider(b b8) {
        this.firebaseRemoteConfigProvider = b8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void syncConfigValues(Map<String, t> object) {
        Object object2;
        block4 : {
            this.allRcConfigMap.putAll((Map)object);
            for (String string2 : this.allRcConfigMap.keySet()) {
                if (object.containsKey((Object)string2)) continue;
                this.allRcConfigMap.remove((Object)string2);
            }
            object = d.e();
            object2 = (t)this.allRcConfigMap.get((Object)object.c());
            if (object2 != null) {
                this.cache.n(object.a(), object2.d());
                return;
            }
            object2 = logger;
            object = "ExperimentTTID remote config flag does not exist.";
            break block4;
            catch (Exception exception) {}
            object2 = logger;
            object = "ExperimentTTID remote config flag has invalid value, expected boolean.";
        }
        object2.a((String)object);
    }
}

