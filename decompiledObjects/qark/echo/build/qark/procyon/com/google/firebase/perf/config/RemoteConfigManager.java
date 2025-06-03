// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.config;

import java.util.Iterator;
import C4.d;
import V2.f;
import C4.z;
import V2.g;
import C4.y;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import s3.e;
import s3.n;
import java.util.Map;
import android.annotation.SuppressLint;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import r4.b;
import P4.m;
import java.util.concurrent.Executor;
import C4.x;
import P4.t;
import java.util.concurrent.ConcurrentHashMap;
import F4.a;
import androidx.annotation.Keep;

@Keep
public class RemoteConfigManager
{
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
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b firebaseRemoteConfigProvider;
    
    static {
        logger = a.e();
        instance = new RemoteConfigManager();
        TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12L);
    }
    
    @SuppressLint({ "ThreadPoolCreation" })
    private RemoteConfigManager() {
        this(x.f(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>()), null, 5000L + new Random().nextInt(25000), getInitialStartupMillis());
    }
    
    public RemoteConfigManager(final x cache, final Executor executor, final m firebaseRemoteConfig, final long appStartConfigFetchDelayInMs, final long appStartTimeInMs) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = cache;
        this.executor = executor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        ConcurrentHashMap<String, t> allRcConfigMap;
        if (firebaseRemoteConfig == null) {
            allRcConfigMap = new ConcurrentHashMap<String, t>();
        }
        else {
            allRcConfigMap = new ConcurrentHashMap<String, t>(firebaseRemoteConfig.m());
        }
        this.allRcConfigMap = allRcConfigMap;
        this.appStartTimeInMs = appStartTimeInMs;
        this.appStartConfigFetchDelayInMs = appStartConfigFetchDelayInMs;
    }
    
    public static long getInitialStartupMillis() {
        final n n = (n)e.o().k(n.class);
        if (n != null) {
            return n.c();
        }
        return System.currentTimeMillis();
    }
    
    public static RemoteConfigManager getInstance() {
        return RemoteConfigManager.instance;
    }
    
    private t getRemoteConfigValue(final String s) {
        this.triggerRemoteConfigFetchIfNecessary();
        if (this.isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(s)) {
            final t t = this.allRcConfigMap.get(s);
            if (t.f() == 2) {
                RemoteConfigManager.logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", t.b(), s);
                return t;
            }
        }
        return null;
    }
    
    public static int getVersionCode(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return 0;
        }
    }
    
    private boolean hasAppStartConfigFetchDelayElapsed(final long n) {
        return n - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }
    
    private boolean hasLastFetchBecomeStale(final long n) {
        return n - this.firebaseRemoteConfigLastFetchTimestampMs > RemoteConfigManager.TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }
    
    private boolean shouldFetchAndActivateRemoteConfigValues() {
        final long currentSystemTimeMillis = this.getCurrentSystemTimeMillis();
        return this.hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && this.hasLastFetchBecomeStale(currentSystemTimeMillis);
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
    
    public M4.g getBoolean(final String s) {
        if (s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config boolean value is null.");
            return M4.g.a();
        }
        final t remoteConfigValue = this.getRemoteConfigValue(s);
        Label_0080: {
            if (remoteConfigValue == null) {
                break Label_0080;
            }
            while (true) {
                while (true) {
                    try {
                        return M4.g.e(remoteConfigValue.d());
                        // iftrue(Label_0080:, remoteConfigValue.b().isEmpty())
                        RemoteConfigManager.logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), s);
                        return M4.g.a();
                    }
                    catch (IllegalArgumentException ex) {}
                    continue;
                }
            }
        }
    }
    
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }
    
    public M4.g getDouble(final String s) {
        if (s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config double value is null.");
            return M4.g.a();
        }
        final t remoteConfigValue = this.getRemoteConfigValue(s);
        Label_0080: {
            if (remoteConfigValue == null) {
                break Label_0080;
            }
        Label_0042_Outer:
            while (true) {
                while (true) {
                    try {
                        return M4.g.e(remoteConfigValue.a());
                        // iftrue(Label_0080:, remoteConfigValue.b().isEmpty())
                        while (true) {
                            RemoteConfigManager.logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), s);
                            return M4.g.a();
                            continue Label_0042_Outer;
                        }
                        return M4.g.a();
                    }
                    catch (IllegalArgumentException ex) {}
                    continue;
                }
            }
        }
    }
    
    public M4.g getLong(final String s) {
        if (s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config long value is null.");
            return M4.g.a();
        }
        final t remoteConfigValue = this.getRemoteConfigValue(s);
        Label_0080: {
            if (remoteConfigValue == null) {
                break Label_0080;
            }
            while (true) {
                while (true) {
                    try {
                        return M4.g.e(remoteConfigValue.c());
                        // iftrue(Label_0080:, remoteConfigValue.b().isEmpty())
                        Block_4: {
                            break Block_4;
                            return M4.g.a();
                        }
                        RemoteConfigManager.logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), s);
                        return M4.g.a();
                    }
                    catch (IllegalArgumentException ex) {}
                    continue;
                }
            }
        }
    }
    
    public <T> T getRemoteConfigValueOrDefault(final String p0, final T p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   com/google/firebase/perf/config/RemoteConfigManager.getRemoteConfigValue:(Ljava/lang/String;)LP4/t;
        //     5: astore          4
        //     7: aload_2        
        //     8: astore_3       
        //     9: aload           4
        //    11: ifnull          189
        //    14: aload_2        
        //    15: instanceof      Ljava/lang/Boolean;
        //    18: ifeq            37
        //    21: aload           4
        //    23: invokeinterface P4/t.d:()Z
        //    28: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    31: astore_3       
        //    32: aload_3        
        //    33: astore_1       
        //    34: goto            199
        //    37: aload_2        
        //    38: instanceof      Ljava/lang/Double;
        //    41: ifeq            60
        //    44: aload           4
        //    46: invokeinterface P4/t.a:()D
        //    51: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    54: astore_3       
        //    55: aload_3        
        //    56: astore_1       
        //    57: goto            199
        //    60: aload_2        
        //    61: instanceof      Ljava/lang/Long;
        //    64: ifne            129
        //    67: aload_2        
        //    68: instanceof      Ljava/lang/Integer;
        //    71: ifeq            77
        //    74: goto            129
        //    77: aload_2        
        //    78: instanceof      Ljava/lang/String;
        //    81: ifeq            97
        //    84: aload           4
        //    86: invokeinterface P4/t.b:()Ljava/lang/String;
        //    91: astore_3       
        //    92: aload_3        
        //    93: astore_1       
        //    94: goto            199
        //    97: aload           4
        //    99: invokeinterface P4/t.b:()Ljava/lang/String;
        //   104: astore_3       
        //   105: getstatic       com/google/firebase/perf/config/RemoteConfigManager.logger:LF4/a;
        //   108: ldc_w           "No matching type found for the defaultValue: '%s', using String."
        //   111: iconst_1       
        //   112: anewarray       Ljava/lang/Object;
        //   115: dup            
        //   116: iconst_0       
        //   117: aload_2        
        //   118: aastore        
        //   119: invokevirtual   F4/a.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   122: aload_3        
        //   123: areturn        
        //   124: aload_3        
        //   125: astore_2       
        //   126: goto            145
        //   129: aload           4
        //   131: invokeinterface P4/t.c:()J
        //   136: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   139: astore_3       
        //   140: aload_3        
        //   141: astore_1       
        //   142: goto            199
        //   145: aload_2        
        //   146: astore_3       
        //   147: aload           4
        //   149: invokeinterface P4/t.b:()Ljava/lang/String;
        //   154: invokevirtual   java/lang/String.isEmpty:()Z
        //   157: ifne            189
        //   160: getstatic       com/google/firebase/perf/config/RemoteConfigManager.logger:LF4/a;
        //   163: ldc_w           "Could not parse value: '%s' for key: '%s'."
        //   166: iconst_2       
        //   167: anewarray       Ljava/lang/Object;
        //   170: dup            
        //   171: iconst_0       
        //   172: aload           4
        //   174: invokeinterface P4/t.b:()Ljava/lang/String;
        //   179: aastore        
        //   180: dup            
        //   181: iconst_1       
        //   182: aload_1        
        //   183: aastore        
        //   184: invokevirtual   F4/a.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   187: aload_2        
        //   188: astore_3       
        //   189: aload_3        
        //   190: areturn        
        //   191: astore_3       
        //   192: goto            145
        //   195: astore_2       
        //   196: goto            124
        //   199: aload_1        
        //   200: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/String;TT;)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  14     32     191    195    Ljava/lang/IllegalArgumentException;
        //  37     55     191    195    Ljava/lang/IllegalArgumentException;
        //  60     74     191    195    Ljava/lang/IllegalArgumentException;
        //  77     92     191    195    Ljava/lang/IllegalArgumentException;
        //  97     105    191    195    Ljava/lang/IllegalArgumentException;
        //  105    122    195    129    Ljava/lang/IllegalArgumentException;
        //  129    140    191    195    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public M4.g getString(final String s) {
        if (s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config String value is null.");
            return M4.g.a();
        }
        final t remoteConfigValue = this.getRemoteConfigValue(s);
        if (remoteConfigValue != null) {
            return M4.g.e(remoteConfigValue.b());
        }
        return M4.g.a();
    }
    
    public boolean isFirebaseRemoteConfigAvailable() {
        if (this.firebaseRemoteConfig == null) {
            final b firebaseRemoteConfigProvider = this.firebaseRemoteConfigProvider;
            if (firebaseRemoteConfigProvider != null) {
                final P4.x x = (P4.x)firebaseRemoteConfigProvider.get();
                if (x != null) {
                    this.firebaseRemoteConfig = x.c("fireperf");
                }
            }
        }
        return this.firebaseRemoteConfig != null;
    }
    
    public boolean isLastFetchFailed() {
        final m firebaseRemoteConfig = this.firebaseRemoteConfig;
        boolean b = true;
        if (firebaseRemoteConfig != null) {
            b = b;
            if (firebaseRemoteConfig.n().c() != 1) {
                if (this.firebaseRemoteConfig.n().c() == 2) {
                    return true;
                }
                b = false;
            }
        }
        return b;
    }
    
    public void setFirebaseRemoteConfigProvider(final b firebaseRemoteConfigProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
    }
    
    public void syncConfigValues(final Map<String, t> m) {
        this.allRcConfigMap.putAll(m);
        for (final String key : this.allRcConfigMap.keySet()) {
            if (!m.containsKey(key)) {
                this.allRcConfigMap.remove(key);
            }
        }
        final d e = d.e();
        final t t = this.allRcConfigMap.get(e.c());
        Label_0118: {
            if (t == null) {
                break Label_0118;
            }
            while (true) {
                while (true) {
                    try {
                        this.cache.n(e.a(), t.d());
                        return;
                        a a = RemoteConfigManager.logger;
                        String s = "ExperimentTTID remote config flag has invalid value, expected boolean.";
                        while (true) {
                            a.a(s);
                            return;
                            a = RemoteConfigManager.logger;
                            s = "ExperimentTTID remote config flag does not exist.";
                            continue;
                        }
                    }
                    catch (Exception ex) {}
                    continue;
                }
            }
        }
    }
}
