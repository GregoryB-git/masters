.class public final Lcom/appsflyer/internal/AFf1lSDK;
.super Lcom/appsflyer/internal/AFf1pSDK;
.source "SourceFile"


# instance fields
.field final AFInAppEventType:Landroid/content/pm/ProviderInfo;

.field private final valueOf:Lcom/appsflyer/internal/AFc1xSDK;


# direct methods
.method public constructor <init>(Landroid/content/pm/ProviderInfo;Ljava/lang/Runnable;Lcom/appsflyer/internal/AFc1xSDK;)V
    .locals 2

    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string v1, "af_referrer"

    invoke-direct {p0, v1, v0, p2}, Lcom/appsflyer/internal/AFf1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFf1lSDK;->valueOf:Lcom/appsflyer/internal/AFc1xSDK;

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1lSDK;->AFInAppEventType:Landroid/content/pm/ProviderInfo;

    return-void
.end method

.method public static valueOf(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    .locals 1

    .line 1
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :goto_0
    const-string p1, "[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable"

    :goto_1
    invoke-static {p1, p0, v0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_3

    :goto_2
    const-string p1, "[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException"

    goto :goto_1

    :goto_3
    const/4 p0, 0x0

    :goto_4
    return-object p0
.end method


# virtual methods
.method public final valueOf(Landroid/content/Context;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFf1lSDK$2;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/AFf1lSDK$2;-><init>(Lcom/appsflyer/internal/AFf1lSDK;Landroid/content/Context;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1lSDK;->valueOf:Lcom/appsflyer/internal/AFc1xSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->AFInAppEventType()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
