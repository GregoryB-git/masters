.class final Lcom/appsflyer/internal/AFf1lSDK$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFf1lSDK;->valueOf(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

.field private synthetic AFKeystoreWrapper:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1lSDK;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFKeystoreWrapper:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/appsflyer/internal/AFf1pSDK;->afInfoLog:J

    sget-object v1, Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;

    iput-object v1, v0, Lcom/appsflyer/internal/AFf1pSDK;->afDebugLog:Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;

    new-instance v1, Lcom/appsflyer/internal/AFf1pSDK$1;

    invoke-direct {v1, v0}, Lcom/appsflyer/internal/AFf1pSDK$1;-><init>(Lcom/appsflyer/internal/AFf1pSDK;)V

    invoke-virtual {v0, v1}, Ljava/util/Observable;->addObserver(Ljava/util/Observer;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "content://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFf1lSDK;->AFInAppEventType:Landroid/content/pm/ProviderInfo;

    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/transaction_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFKeystoreWrapper:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFf1lSDK;->valueOf(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v7, 0x0

    const/16 v8, 0x18

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "app_id="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFKeystoreWrapper:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto :goto_7

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_4

    :goto_0
    :try_start_1
    const-string v2, "[Preinstall]: Error to get data from providerClient "

    invoke-static {v2, v1, v7}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto :goto_6

    :catchall_1
    move-exception v1

    goto :goto_5

    :goto_2
    :try_start_2
    const-string v2, "[Preinstall]: Failed to query unstable content providerClient"

    :goto_3
    invoke-static {v2, v1, v7}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_1

    :goto_4
    const-string v2, "[Preinstall]: Failed to acquire unstable content providerClient"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    throw v1

    :cond_0
    :goto_6
    const/4 v1, 0x0

    :goto_7
    const-string v0, "response"

    if-eqz v1, :cond_3

    const-string v2, "transaction_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const-string v2, "[Preinstall]: Wrong column name"

    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    const-string v3, "FEATURE_NOT_SUPPORTED"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v3, v3, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    const-string v4, "OK"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    const-string v3, "referrer"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_9

    :cond_3
    const-string v1, "[Preinstall]: ContentProvider query failed, got null Cursor"

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    const-string v2, "SERVICE_UNAVAILABLE"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFKeystoreWrapper:Landroid/content/Context;

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1lSDK;->AFInAppEventType:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFa1fSDK;->AFInAppEventType(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "api_ver"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFf1pSDK;->AFInAppEventParameterName:Ljava/util/Map;

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFKeystoreWrapper:Landroid/content/Context;

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1lSDK;->AFInAppEventType:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFa1fSDK;->AFKeystoreWrapper(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "api_ver_name"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1lSDK$2;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1lSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1pSDK;->values()V

    return-void
.end method
