.class public final Lcom/appsflyer/internal/AFe1rSDK;
.super Lcom/appsflyer/internal/AFd1oSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFd1oSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final afInfoLog:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AFLogger$LogLevel:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

.field private AppsFlyer2dXConversionCallback:Ljava/lang/String;

.field private final afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1gSDK;

.field private final afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

.field private final getLevel:Lcom/appsflyer/internal/AFc1oSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "playstore"

    const-string v1, "googleplaystore"

    const-string v2, "googleplay"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFe1rSDK;->afInfoLog:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1xSDK;)V
    .locals 4
    .param p1    # Lcom/appsflyer/internal/AFc1xSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/appsflyer/internal/AFd1vSDK;->afDebugLog:Lcom/appsflyer/internal/AFd1vSDK;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/appsflyer/internal/AFd1vSDK;

    sget-object v2, Lcom/appsflyer/internal/AFd1vSDK;->values:Lcom/appsflyer/internal/AFd1vSDK;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "GCD-FETCH"

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Lcom/appsflyer/internal/AFd1vSDK;[Lcom/appsflyer/internal/AFd1vSDK;Lcom/appsflyer/internal/AFc1xSDK;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1oSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->getLevel:Lcom/appsflyer/internal/AFc1oSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->afDebugLog()Lcom/appsflyer/internal/AFe1mSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFe1rSDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1gSDK;

    sget-object p1, Lcom/appsflyer/internal/AFd1vSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1vSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p1, Lcom/appsflyer/internal/AFd1vSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1vSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final AFInAppEventParameterName()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final afInfoLog()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final afRDLog()Lcom/appsflyer/attribution/AppsFlyerRequestListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final valueOf()Lcom/appsflyer/internal/AFd1ySDK;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "is_first_launch"

    const-string v1, "af_channel"

    const-string v2, "af_siteid"

    const-string v3, "[GCD-A03] Server retrieving attempt finished"

    iget-object v4, p0, Lcom/appsflyer/internal/AFd1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {v4}, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper()Z

    move-result v4

    if-nez v4, :cond_f

    sget-object v4, Lcom/appsflyer/internal/AFd1ySDK;->valueOf:Lcom/appsflyer/internal/AFd1ySDK;

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x2

    if-gt v6, v7, :cond_e

    const/4 v4, 0x1

    if-lt v6, v7, :cond_0

    move v7, v4

    goto :goto_1

    :cond_0
    move v7, v5

    :goto_1
    iget-object v8, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v8, Lcom/appsflyer/internal/AFe1mSDK;->AFVersionDeclaration:J

    :try_start_0
    invoke-super {p0}, Lcom/appsflyer/internal/AFd1oSDK;->valueOf()Lcom/appsflyer/internal/AFd1ySDK;

    move-result-object v8

    iget-object v9, p0, Lcom/appsflyer/internal/AFd1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1gSDK;

    if-nez v9, :cond_1

    goto/16 :goto_b

    :cond_1
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFc1gSDK;->getStatusCode()I

    move-result v10

    const/16 v11, 0x193

    if-eq v10, v11, :cond_3

    const/16 v11, 0x1f4

    if-lt v10, v11, :cond_2

    goto :goto_2

    :cond_2
    move v11, v5

    goto :goto_3

    :cond_3
    :goto_2
    move v11, v4

    :goto_3
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFc1gSDK;->isSuccessful()Z

    move-result v12

    const/16 v13, 0x194

    if-nez v12, :cond_6

    if-ne v10, v13, :cond_4

    goto :goto_7

    :cond_4
    if-nez v7, :cond_5

    if-nez v11, :cond_c

    goto :goto_5

    :goto_4
    move-object v4, v8

    goto/16 :goto_c

    :cond_5
    :goto_5
    const-string v4, "Error connection to server: "

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/appsflyer/internal/AFe1rSDK;->AppsFlyer2dXConversionCallback:Ljava/lang/String;

    sget-object v0, Lcom/appsflyer/internal/AFd1ySDK;->valueOf:Lcom/appsflyer/internal/AFd1ySDK;
    :try_end_0
    .catch Lcom/appsflyer/internal/AFd1tSDK; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_6
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-virtual {v1, v6}, Lcom/appsflyer/internal/AFe1mSDK;->values(I)V

    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :catch_0
    move-exception v4

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :cond_6
    :goto_7
    :try_start_1
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFc1gSDK;->getBody()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-virtual {v9}, Lcom/appsflyer/internal/AFc1gSDK;->getStatusCode()I

    move-result v9

    const-string v10, "iscache"

    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    if-ne v9, v13, :cond_7

    const-string v9, "error_reason"

    invoke-interface {v8, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "status_code"

    invoke-interface {v8, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "af_status"

    const-string v11, "Organic"

    invoke-interface {v8, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "af_message"

    const-string v11, "organic install"

    invoke-interface {v8, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_8

    iget-object v9, p0, Lcom/appsflyer/internal/AFe1rSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v10, "appsflyerConversionDataCacheExpiration"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-interface {v9, v10, v11, v12}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventParameterName(Ljava/lang/String;J)V

    :cond_8
    invoke-interface {v8, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "[Invite] Detected App-Invite via channel: "

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_8
    invoke-static {v4}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    const-string v9, "[CrossPromotion] App was installed via %s\'s Cross Promotion"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v4, v5

    invoke-static {v9, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :cond_a
    :goto_9
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v8, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v8}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v9, p0, Lcom/appsflyer/internal/AFe1rSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v10, "attributionId"

    invoke-interface {v9, v10, v4}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/appsflyer/internal/AFe1rSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v9, "sixtyDayConversionData"

    invoke-interface {v4, v9}, Lcom/appsflyer/internal/AFb1dSDK;->valueOf(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_b

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v8, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iput-object v8, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFLogger$LogLevel:Ljava/util/Map;

    sget-object v0, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;
    :try_end_1
    .catch Lcom/appsflyer/internal/AFd1tSDK; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    :goto_a
    :try_start_2
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[GCD] Error: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v8, Lcom/appsflyer/internal/AFd1ySDK;->valueOf:Lcom/appsflyer/internal/AFd1ySDK;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v7, :cond_d

    :cond_c
    :goto_b
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-virtual {v4, v6}, Lcom/appsflyer/internal/AFe1mSDK;->values(I)V

    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    goto/16 :goto_4

    :goto_c
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_d
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->AppsFlyer2dXConversionCallback:Ljava/lang/String;

    throw v4

    :goto_d
    const-string v1, "[GCD-E05] AppsFlyer dev key is missing"

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    const-string v1, "AppsFlyer dev key is missing"

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->AppsFlyer2dXConversionCallback:Ljava/lang/String;

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_e
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-virtual {v1, v6}, Lcom/appsflyer/internal/AFe1mSDK;->values(I)V

    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    throw v0

    :cond_e
    return-object v4

    :cond_f
    const-string v0, "[GCD-E03] \'isStopTracking\' enabled"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    const-string v0, "\'isStopTracking\' enabled"

    iput-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->AppsFlyer2dXConversionCallback:Ljava/lang/String;

    new-instance v0, Lcom/appsflyer/internal/AFd1xSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1xSDK;-><init>()V

    throw v0
.end method

.method public final values(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFc1qSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1dSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1gSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFb1gSDK;->values()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFb1dSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/appsflyer/internal/AFe1rSDK;->afInfoLog:Ljava/util/List;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    :cond_1
    const-string v0, ""

    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->getLevel:Lcom/appsflyer/internal/AFc1oSDK;

    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFc1oSDK;->values(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[GCD-B01] URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/appsflyer/internal/AFc1qSDK;->valueOf:Lcom/appsflyer/internal/AFa1aSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFa1aSDK;->valueOf:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1aSDK;->values(Ljava/lang/String;)V

    return-object p1
.end method

.method public final values()V
    .locals 2

    .line 2
    invoke-super {p0}, Lcom/appsflyer/internal/AFd1oSDK;->values()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1rSDK;->AFLogger$LogLevel:Ljava/util/Map;

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1rSDK;->AppsFlyer2dXConversionCallback:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/appsflyer/internal/AFe1sSDK;->values(Ljava/util/Map;)V

    return-void

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lcom/appsflyer/internal/AFe1sSDK;->AFInAppEventType(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "Unknown error"

    invoke-static {v0}, Lcom/appsflyer/internal/AFe1sSDK;->AFInAppEventType(Ljava/lang/String;)V

    return-void
.end method
