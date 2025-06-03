.class public final Lcom/appsflyer/internal/AFc1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1xSDK;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFc1ySDK$AFa1wSDK;
    }
.end annotation


# static fields
.field private static final AFKeystoreWrapper:I


# instance fields
.field private AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;

.field private AFInAppEventType:Ljava/util/concurrent/ExecutorService;

.field private AFLogger:Lcom/appsflyer/internal/AFc1nSDK;

.field private AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1tSDK;

.field private AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

.field private AppsFlyer2dXConversionCallback:Lcom/appsflyer/internal/AFe1wSDK;

.field private afDebugLog:Lcom/appsflyer/internal/AFb1wSDK;

.field private afErrorLog:Lcom/appsflyer/internal/AFb1gSDK;

.field private afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFc1bSDK;

.field private afInfoLog:Lcom/appsflyer/internal/AFe1mSDK;

.field private afRDLog:Lcom/appsflyer/PurchaseHandler;

.field private afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

.field private getLevel:Lcom/appsflyer/internal/AFf1oSDK;

.field private init:Lcom/appsflyer/internal/AFc1dSDK;

.field private onAppOpenAttribution:Lcom/appsflyer/internal/AFb1vSDK;

.field private onAppOpenAttributionNative:Lcom/appsflyer/internal/AFa1bSDK;

.field private onAttributionFailureNative:Lcom/appsflyer/internal/AFb1iSDK;

.field private onConversionDataSuccess:Lcom/appsflyer/internal/AFa1iSDK;

.field private onDeepLinkingNative:Lcom/appsflyer/internal/AFa1kSDK;

.field private onInstallConversionDataLoadedNative:Lcom/appsflyer/internal/AFc1sSDK;

.field private onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

.field private onResponse:Lcom/appsflyer/internal/AFf1vSDK;

.field private onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

.field private onResponseNative:Lcom/appsflyer/internal/AFb1sSDK;

.field public final valueOf:Lcom/appsflyer/internal/AFb1bSDK;

.field private values:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/appsflyer/internal/AFc1ySDK;->AFKeystoreWrapper:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/appsflyer/internal/AFb1bSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFb1bSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    return-void
.end method

.method private static synthetic AFInAppEventParameterName(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "could not create executor for queue"

    invoke-static {p1, p0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method private declared-synchronized onAppOpenAttribution()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized onAttributionFailureNative()Lcom/appsflyer/internal/AFc1nSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger:Lcom/appsflyer/internal/AFc1nSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1nSDK;

    new-instance v1, Lcom/appsflyer/internal/AFc1lSDK;

    sget v2, Lcom/appsflyer/internal/AFc1ySDK;->AFKeystoreWrapper:I

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFc1lSDK;-><init>(I)V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventType()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFc1nSDK;-><init>(Lcom/appsflyer/internal/AFc1lSDK;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger:Lcom/appsflyer/internal/AFc1nSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger:Lcom/appsflyer/internal/AFc1nSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized onDeepLinking()Lcom/appsflyer/internal/AFc1sSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionDataLoadedNative:Lcom/appsflyer/internal/AFc1sSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1sSDK;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFc1sSDK;-><init>(Lcom/appsflyer/internal/AFc1xSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionDataLoadedNative:Lcom/appsflyer/internal/AFc1sSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionDataLoadedNative:Lcom/appsflyer/internal/AFc1sSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLog:Lcom/appsflyer/internal/AFb1gSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFb1gSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/AFb1cSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v3, v3, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFb1cSDK;-><init>(Landroid/content/SharedPreferences;)V

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFb1gSDK;-><init>(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLog:Lcom/appsflyer/internal/AFb1gSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLog:Lcom/appsflyer/internal/AFb1gSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized AFInAppEventType()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventType:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventType:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventType:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1oSDK;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/appsflyer/internal/AFc1oSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onAttributionFailureNative()Lcom/appsflyer/internal/AFc1nSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v2

    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative()Lcom/appsflyer/internal/AFc1dSDK;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/appsflyer/internal/AFc1oSDK;-><init>(Lcom/appsflyer/internal/AFc1nSDK;Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFc1dSDK;)V

    return-object v0
.end method

.method public final AFLogger()Lcom/appsflyer/internal/AFe1vSDK;
    .locals 13
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

    if-nez v0, :cond_7

    new-instance v0, Lcom/appsflyer/internal/AFb1nSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v2, v1, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    if-nez v3, :cond_0

    new-instance v3, Lcom/appsflyer/internal/AFf1sSDK;

    invoke-direct {v3}, Lcom/appsflyer/internal/AFf1sSDK;-><init>()V

    iput-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    :cond_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    if-nez v4, :cond_1

    new-instance v4, Lcom/appsflyer/internal/AFa1wSDK;

    invoke-direct {v4}, Lcom/appsflyer/internal/AFa1wSDK;-><init>()V

    iput-object v4, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    :cond_1
    iget-object v4, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    iget-object v5, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    if-nez v5, :cond_3

    new-instance v5, Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v6, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v6, v6, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    if-eqz v6, :cond_2

    invoke-direct {v5, v6}, Lcom/appsflyer/internal/AFf1hSDK;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v5, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->onConversionDataSuccess:Lcom/appsflyer/internal/AFa1iSDK;

    if-nez v1, :cond_4

    new-instance v1, Lcom/appsflyer/internal/AFa1jSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFa1jSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->onConversionDataSuccess:Lcom/appsflyer/internal/AFa1iSDK;

    :cond_4
    iget-object v6, p0, Lcom/appsflyer/internal/AFc1ySDK;->onConversionDataSuccess:Lcom/appsflyer/internal/AFa1iSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->afDebugLog()Lcom/appsflyer/internal/AFe1mSDK;

    move-result-object v7

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v8

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v9

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->onDeepLinkingNative:Lcom/appsflyer/internal/AFa1kSDK;

    if-nez v1, :cond_5

    new-instance v1, Lcom/appsflyer/internal/AFa1kSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFa1kSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->onDeepLinkingNative:Lcom/appsflyer/internal/AFa1kSDK;

    :cond_5
    iget-object v10, p0, Lcom/appsflyer/internal/AFc1ySDK;->onDeepLinkingNative:Lcom/appsflyer/internal/AFa1kSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v11

    new-instance v12, Lcom/appsflyer/internal/AFb1xSDK;

    invoke-direct {v12}, Lcom/appsflyer/internal/AFb1xSDK;-><init>()V

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/appsflyer/internal/AFb1nSDK;-><init>(Landroid/content/Context;Lcom/appsflyer/internal/AFf1tSDK;Lcom/appsflyer/internal/AFb1eSDK;Lcom/appsflyer/internal/AFf1iSDK;Lcom/appsflyer/internal/AFa1iSDK;Lcom/appsflyer/internal/AFe1mSDK;Lcom/appsflyer/internal/AFb1dSDK;Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/internal/AFa1kSDK;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFb1xSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

    return-object v0
.end method

.method public final declared-synchronized AFLogger$LogLevel()Lcom/appsflyer/internal/AFf1oSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->getLevel:Lcom/appsflyer/internal/AFf1oSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFf1oSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1oSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->getLevel:Lcom/appsflyer/internal/AFf1oSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->getLevel:Lcom/appsflyer/internal/AFf1oSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized AFVersionDeclaration()Lcom/appsflyer/internal/AFc1bSDK;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFc1bSDK;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Lcom/appsflyer/internal/AFc1ySDK$4;

    invoke-direct {v7}, Lcom/appsflyer/internal/AFc1ySDK$4;-><init>()V

    new-instance v8, Lcom/appsflyer/internal/AFc1ySDK$AFa1wSDK;

    invoke-direct {v8}, Lcom/appsflyer/internal/AFc1ySDK$AFa1wSDK;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x6

    const-wide/16 v4, 0x12c

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v1, Lcom/appsflyer/internal/s;

    invoke-direct {v1}, Lcom/appsflyer/internal/s;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    new-instance v1, Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v1, v0}, Lcom/appsflyer/internal/AFc1bSDK;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFc1bSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFc1bSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized AppsFlyer2dXConversionCallback()Lcom/appsflyer/internal/AFb1sSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseNative:Lcom/appsflyer/internal/AFb1sSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFb1sSDK;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFb1sSDK;-><init>(Lcom/appsflyer/internal/AFc1xSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseNative:Lcom/appsflyer/internal/AFb1sSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseNative:Lcom/appsflyer/internal/AFb1sSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afDebugLog()Lcom/appsflyer/internal/AFe1mSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afInfoLog:Lcom/appsflyer/internal/AFe1mSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFe1mSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1mSDK;-><init>(Lcom/appsflyer/internal/AFb1dSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afInfoLog:Lcom/appsflyer/internal/AFe1mSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afInfoLog:Lcom/appsflyer/internal/AFe1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afErrorLog()Lcom/appsflyer/PurchaseHandler;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afRDLog:Lcom/appsflyer/PurchaseHandler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/PurchaseHandler;

    invoke-direct {v0, p0}, Lcom/appsflyer/PurchaseHandler;-><init>(Lcom/appsflyer/internal/AFc1xSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afRDLog:Lcom/appsflyer/PurchaseHandler;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afRDLog:Lcom/appsflyer/PurchaseHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afErrorLogForExcManagerOnly()Lcom/appsflyer/internal/AFb1tSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1tSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFb1rSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFb1rSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1tSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1tSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afInfoLog()Lcom/appsflyer/internal/AFb1vSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttribution:Lcom/appsflyer/internal/AFb1vSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFb1vSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFb1vSDK;-><init>(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1gSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttribution:Lcom/appsflyer/internal/AFb1vSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttribution:Lcom/appsflyer/internal/AFb1vSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afRDLog()Lcom/appsflyer/internal/AFb1wSDK;
    .locals 11
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFb1wSDK;

    if-nez v0, :cond_0

    new-instance v5, Lcom/appsflyer/internal/AFb1ySDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/appsflyer/internal/AFb1ySDK;-><init>(Lcom/appsflyer/internal/AFb1dSDK;)V

    new-instance v7, Lcom/appsflyer/internal/AFe1zSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v0

    invoke-direct {v7, v0, v5}, Lcom/appsflyer/internal/AFe1zSDK;-><init>(Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/internal/AFb1ySDK;)V

    new-instance v0, Lcom/appsflyer/internal/AFb1wSDK;

    new-instance v2, Lcom/appsflyer/internal/AFd1cSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFd1cSDK;-><init>()V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v4

    new-instance v6, Lcom/appsflyer/internal/AFc1oSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onAttributionFailureNative()Lcom/appsflyer/internal/AFc1nSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v8

    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v9

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative()Lcom/appsflyer/internal/AFc1dSDK;

    move-result-object v10

    invoke-direct {v6, v1, v8, v9, v10}, Lcom/appsflyer/internal/AFc1oSDK;-><init>(Lcom/appsflyer/internal/AFc1nSDK;Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFc1dSDK;)V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFVersionDeclaration()Lcom/appsflyer/internal/AFc1bSDK;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/appsflyer/internal/AFb1wSDK;-><init>(Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFb1ySDK;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFb1wSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFb1wSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AppsFlyer2dXConversionCallback:Lcom/appsflyer/internal/AFe1wSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/AFe1xSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFe1xSDK;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFe1wSDK;-><init>(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFe1xSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AppsFlyer2dXConversionCallback:Lcom/appsflyer/internal/AFe1wSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->AppsFlyer2dXConversionCallback:Lcom/appsflyer/internal/AFe1wSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final getLevel()Lcom/appsflyer/internal/AFf1iSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFf1hSDK;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->afWarnLog:Lcom/appsflyer/internal/AFf1iSDK;

    return-object v0
.end method

.method public final declared-synchronized init()Lcom/appsflyer/internal/AFb1bSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized onAppOpenAttributionNative()Lcom/appsflyer/internal/AFa1bSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttributionNative:Lcom/appsflyer/internal/AFa1bSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFa1hSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1hSDK;-><init>(Lcom/appsflyer/internal/AFb1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttributionNative:Lcom/appsflyer/internal/AFa1bSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttributionNative:Lcom/appsflyer/internal/AFa1bSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final synthetic onConversionDataSuccess()Lcom/appsflyer/internal/AFc1wSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onDeepLinking()Lcom/appsflyer/internal/AFc1sSDK;

    move-result-object v0

    return-object v0
.end method

.method public final onDeepLinkingNative()Lcom/appsflyer/internal/AFb1eSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFa1wSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFa1wSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponseErrorNative:Lcom/appsflyer/internal/AFb1eSDK;

    return-object v0
.end method

.method public final onInstallConversionDataLoadedNative()Lcom/appsflyer/internal/AFf1tSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFf1sSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1sSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onInstallConversionFailureNative:Lcom/appsflyer/internal/AFf1tSDK;

    return-object v0
.end method

.method public final declared-synchronized onInstallConversionFailureNative()Lcom/appsflyer/internal/AFc1dSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->init:Lcom/appsflyer/internal/AFc1dSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1dSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/internal/AFb1dSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->init:Lcom/appsflyer/internal/AFc1dSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->init:Lcom/appsflyer/internal/AFc1dSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final onResponseErrorNative()Lcom/appsflyer/internal/AFf1vSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFf1ySDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1ySDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    return-object v0
.end method

.method public final onResponseNative()Lcom/appsflyer/internal/AFb1iSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAttributionFailureNative:Lcom/appsflyer/internal/AFb1iSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFb1kSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1ySDK;->onAppOpenAttribution()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1ySDK;->AppsFlyer2dXConversionCallback()Lcom/appsflyer/internal/AFb1sSDK;

    move-result-object v2

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    if-nez v3, :cond_0

    new-instance v3, Lcom/appsflyer/internal/AFf1ySDK;

    invoke-direct {v3}, Lcom/appsflyer/internal/AFf1ySDK;-><init>()V

    iput-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    :cond_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1ySDK;->onResponse:Lcom/appsflyer/internal/AFf1vSDK;

    invoke-direct {v0, v1, v2, v3}, Lcom/appsflyer/internal/AFb1kSDK;-><init>(Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFb1sSDK;Lcom/appsflyer/internal/AFf1vSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAttributionFailureNative:Lcom/appsflyer/internal/AFb1iSDK;

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->onAttributionFailureNative:Lcom/appsflyer/internal/AFb1iSDK;

    return-object v0
.end method

.method public final declared-synchronized valueOf()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->values:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->values:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1ySDK;->values:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final values()Lcom/appsflyer/internal/AFb1dSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/appsflyer/internal/AFb1cSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1ySDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFb1cSDK;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
