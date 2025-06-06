.class public Lcom/google/firebase/perf/config/RemoteConfigManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final FETCH_NEVER_HAPPENED_TIMESTAMP_MS:J = 0x0L

.field private static final FIREPERF_FRC_NAMESPACE_NAME:Ljava/lang/String; = "fireperf"

.field private static final MIN_APP_START_CONFIG_FETCH_DELAY_MS:J = 0x1388L

.field private static final RANDOM_APP_START_CONFIG_FETCH_DELAY_MS:I = 0x61a8

.field private static final TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

.field private static final instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

.field private static final logger:LF4/a;


# instance fields
.field private final allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "LP4/t;",
            ">;"
        }
    .end annotation
.end field

.field private final appStartConfigFetchDelayInMs:J

.field private final appStartTimeInMs:J

.field private final cache:LC4/x;

.field private final executor:Ljava/util/concurrent/Executor;

.field private firebaseRemoteConfig:LP4/m;

.field private firebaseRemoteConfigLastFetchTimestampMs:J

.field private firebaseRemoteConfigProvider:Lr4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr4/b;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, LF4/a;->e()LF4/a;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    new-instance v0, Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-direct {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;-><init>()V

    sput-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

    return-void
.end method

.method private constructor <init>()V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .line 1
    invoke-static {}, LC4/x;->f()LC4/x;

    move-result-object v1

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x61a8

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v2, v0

    const-wide/16 v4, 0x1388

    add-long/2addr v4, v2

    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInitialStartupMillis()J

    move-result-wide v6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, v9

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/perf/config/RemoteConfigManager;-><init>(LC4/x;Ljava/util/concurrent/Executor;LP4/m;JJ)V

    return-void
.end method

.method public constructor <init>(LC4/x;Ljava/util/concurrent/Executor;LP4/m;JJ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->cache:LC4/x;

    iput-object p2, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p3, :cond_0

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, LP4/m;->m()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    iput-wide p6, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->appStartTimeInMs:J

    iput-wide p4, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->appStartConfigFetchDelayInMs:J

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/perf/config/RemoteConfigManager;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/perf/config/RemoteConfigManager;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static getInitialStartupMillis()J
    .locals 2

    invoke-static {}, Ls3/e;->o()Ls3/e;

    move-result-object v0

    const-class v1, Ls3/n;

    invoke-virtual {v0, v1}, Ls3/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls3/n;->c()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

    return-object v0
.end method

.method private getRemoteConfigValue(Ljava/lang/String;)LP4/t;
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->triggerRemoteConfigFetchIfNecessary()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isFirebaseRemoteConfigAvailable()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LP4/t;

    .line 26
    .line 27
    invoke-interface {v1}, LP4/t;->f()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ne v2, v0, :cond_0

    .line 32
    .line 33
    sget-object v2, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 34
    .line 35
    invoke-interface {v1}, LP4/t;->b()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-array v0, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    aput-object v3, v0, v4

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    aput-object p1, v0, v3

    .line 46
    .line 47
    const-string p1, "Fetched value: \'%s\' for key: \'%s\' from Firebase Remote Config."

    .line 48
    .line 49
    invoke-virtual {v2, p1, v0}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method public static getVersionCode(Landroid/content/Context;)I
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method private hasAppStartConfigFetchDelayElapsed(J)Z
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->appStartTimeInMs:J

    sub-long/2addr p1, v0

    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->appStartConfigFetchDelayInMs:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private hasLastFetchBecomeStale(J)Z
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    sub-long/2addr p1, v0

    sget-wide v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private synthetic lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Ljava/lang/Boolean;)V
    .locals 0

    iget-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    invoke-virtual {p1}, LP4/m;->m()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->syncConfigValues(Ljava/util/Map;)V

    return-void
.end method

.method private synthetic lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Ljava/lang/Exception;)V
    .locals 4

    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    const-string v1, "Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, LF4/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    return-void
.end method

.method private shouldFetchAndActivateRemoteConfigValues()Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getCurrentSystemTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->hasAppStartConfigFetchDelayElapsed(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->hasLastFetchBecomeStale(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getCurrentSystemTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    invoke-virtual {v0}, LP4/m;->l()LV2/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    new-instance v2, LC4/y;

    invoke-direct {v2, p0}, LC4/y;-><init>(Lcom/google/firebase/perf/config/RemoteConfigManager;)V

    invoke-virtual {v0, v1, v2}, LV2/j;->e(Ljava/util/concurrent/Executor;LV2/g;)LV2/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    new-instance v2, LC4/z;

    invoke-direct {v2, p0}, LC4/z;-><init>(Lcom/google/firebase/perf/config/RemoteConfigManager;)V

    invoke-virtual {v0, v1, v2}, LV2/j;->d(Ljava/util/concurrent/Executor;LV2/f;)LV2/j;

    return-void
.end method

.method private triggerRemoteConfigFetchIfNecessary()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isFirebaseRemoteConfigAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    invoke-virtual {v1}, LP4/m;->m()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->shouldFetchAndActivateRemoteConfigValues()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch()V

    :cond_2
    return-void
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;)LM4/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LM4/g;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 4
    .line 5
    const-string v0, "The key to get Remote Config boolean value is null."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LF4/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)LP4/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0}, LP4/t;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, LM4/g;->e(Ljava/lang/Object;)LM4/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget-object v1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 45
    .line 46
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v2, 0x2

    .line 51
    new-array v2, v2, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    aput-object v0, v2, v3

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-object p1, v2, v0

    .line 58
    .line 59
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 60
    .line 61
    invoke-virtual {v1, p1, v2}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public getCurrentSystemTimeMillis()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDouble(Ljava/lang/String;)LM4/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LM4/g;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 4
    .line 5
    const-string v0, "The key to get Remote Config double value is null."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LF4/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)LP4/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0}, LP4/t;->a()D

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, LM4/g;->e(Ljava/lang/Object;)LM4/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget-object v1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 45
    .line 46
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v2, 0x2

    .line 51
    new-array v2, v2, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    aput-object v0, v2, v3

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-object p1, v2, v0

    .line 58
    .line 59
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 60
    .line 61
    invoke-virtual {v1, p1, v2}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public getLong(Ljava/lang/String;)LM4/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LM4/g;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 4
    .line 5
    const-string v0, "The key to get Remote Config long value is null."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LF4/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)LP4/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0}, LP4/t;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, LM4/g;->e(Ljava/lang/Object;)LM4/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget-object v1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 45
    .line 46
    invoke-interface {v0}, LP4/t;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v2, 0x2

    .line 51
    new-array v2, v2, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    aput-object v0, v2, v3

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-object p1, v2, v0

    .line 58
    .line 59
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 60
    .line 61
    invoke-virtual {v1, p1, v2}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public getRemoteConfigValueOrDefault(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)LP4/t;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_0
    instance-of v3, p2, Ljava/lang/Boolean;

    if-eqz v3, :cond_0

    invoke-interface {v2}, LP4/t;->d()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    move-object p2, p1

    goto :goto_3

    :cond_0
    instance-of v3, p2, Ljava/lang/Double;

    if-eqz v3, :cond_1

    invoke-interface {v2}, LP4/t;->a()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v3, p2, Ljava/lang/Long;

    if-nez v3, :cond_4

    instance-of v3, p2, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    instance-of v3, p2, Ljava/lang/String;

    if-eqz v3, :cond_3

    invoke-interface {v2}, LP4/t;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-interface {v2}, LP4/t;->b()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v4, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    const-string v5, "No matching type found for the defaultValue: \'%s\', using String."

    new-array v6, v1, [Ljava/lang/Object;

    aput-object p2, v6, v0

    invoke-virtual {v4, v5, v6}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    move-object p2, v3

    goto :goto_3

    :catch_0
    move-object p2, v3

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_2
    invoke-interface {v2}, LP4/t;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    :goto_2
    invoke-interface {v2}, LP4/t;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    invoke-interface {v2}, LP4/t;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v0

    aput-object p1, v4, v1

    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    invoke-virtual {v3, p1, v4}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    :goto_3
    return-object p2
.end method

.method public getString(Ljava/lang/String;)LM4/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LM4/g;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    .line 4
    .line 5
    const-string v0, "The key to get Remote Config String value is null."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LF4/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)LP4/t;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, LP4/t;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, LM4/g;->e(Ljava/lang/Object;)LM4/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-static {}, LM4/g;->a()LM4/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public isFirebaseRemoteConfigAvailable()Z
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigProvider:Lr4/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr4/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP4/x;

    if-eqz v0, :cond_0

    const-string v1, "fireperf"

    invoke-virtual {v0, v1}, LP4/x;->c(Ljava/lang/String;)LP4/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isLastFetchFailed()Z
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LP4/m;->n()LP4/q;

    move-result-object v0

    invoke-interface {v0}, LP4/q;->c()I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:LP4/m;

    invoke-virtual {v0}, LP4/m;->n()LP4/q;

    move-result-object v0

    invoke-interface {v0}, LP4/q;->c()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public setFirebaseRemoteConfigProvider(Lr4/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr4/b;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigProvider:Lr4/b;

    .line 2
    .line 3
    return-void
.end method

.method public syncConfigValues(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LP4/t;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {}, LC4/d;->e()LC4/d;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, LC4/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP4/t;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->cache:LC4/x;

    invoke-virtual {p1}, LC4/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0}, LP4/t;->d()Z

    move-result v0

    invoke-virtual {v1, p1, v0}, LC4/x;->n(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    const-string v0, "ExperimentTTID remote config flag has invalid value, expected boolean."

    :goto_1
    invoke-virtual {p1, v0}, LF4/a;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:LF4/a;

    const-string v0, "ExperimentTTID remote config flag does not exist."

    goto :goto_1

    :goto_2
    return-void
.end method
