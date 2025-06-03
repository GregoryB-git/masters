.class final Lcom/appsflyer/internal/AFe1wSDK$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1xSDK$AFa1vSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFe1wSDK;->AFInAppEventParameterName()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFInAppEventType:J

.field private synthetic AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFe1wSDK;J)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    iput-wide p2, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFInAppEventType:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    const-string v2, "error"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v1, v0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    return-void
.end method

.method public final AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    const-string v1, "signedData"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    const-string v0, "signature"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFInAppEventType:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFe1wSDK;->valueOf:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "ttr"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Successfully retrieved Google LVL data."

    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    return-void
.end method
