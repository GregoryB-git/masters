.class final Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1cSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFa1eSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AFa1wSDK"
.end annotation


# instance fields
.field private synthetic valueOf:Lcom/appsflyer/internal/AFa1eSDK;


# direct methods
.method private constructor <init>(Lcom/appsflyer/internal/AFa1eSDK;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1eSDK;B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;-><init>(Lcom/appsflyer/internal/AFa1eSDK;)V

    return-void
.end method

.method private values()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventParameterName:Lcom/appsflyer/AppsFlyerConversionListener;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final AFInAppEventParameterName(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1zSDK<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public final AFInAppEventType(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1zSDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFd1ySDK;",
            ")V"
        }
    .end annotation

    instance-of v0, p1, Lcom/appsflyer/internal/AFd1hSDK;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/appsflyer/internal/AFd1hSDK;

    instance-of v1, p1, Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->values()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Lcom/appsflyer/internal/AFd1fSDK;

    iget-object v3, v2, Lcom/appsflyer/internal/AFd1zSDK;->valueOf:Lcom/appsflyer/internal/AFd1ySDK;

    sget-object v4, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    if-eq v3, v4, :cond_0

    iget v3, v2, Lcom/appsflyer/internal/AFd1zSDK;->AFInAppEventType:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    :cond_0
    new-instance v3, Lcom/appsflyer/internal/AFe1pSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v4}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v4

    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1xSDK;->values()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/appsflyer/internal/AFe1pSDK;-><init>(Lcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFb1dSDK;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v2

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1xSDK;->AFVersionDeclaration()Lcom/appsflyer/internal/AFc1bSDK;

    move-result-object v2

    iget-object v4, v2, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper:Ljava/util/concurrent/Executor;

    new-instance v5, Lcom/appsflyer/internal/AFc1bSDK$4;

    invoke-direct {v5, v2, v3}, Lcom/appsflyer/internal/AFc1bSDK$4;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    sget-object v2, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    if-ne p2, v2, :cond_4

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {p2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFa1eSDK;)Landroid/app/Application;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/appsflyer/internal/AFa1eSDK;->values(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object p2

    const-string v2, "sentSuccessfully"

    const-string v3, "true"

    invoke-interface {p2, v2, v3}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/appsflyer/internal/AFd1eSDK;

    if-nez p1, :cond_2

    new-instance p1, Lcom/appsflyer/internal/AFe1ySDK;

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {p2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFa1eSDK;)Landroid/app/Application;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFe1ySDK;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFe1ySDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1uSDK;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFb1uSDK;->AFKeystoreWrapper()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p1, Lcom/appsflyer/internal/AFb1uSDK;->valueOf:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "Resending Uninstall token to AF servers: "

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFe1ySDK;->valueOf(Ljava/lang/String;)V

    :cond_2
    iget-object p1, v0, Lcom/appsflyer/internal/AFd1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1gSDK;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFc1gSDK;->getBody()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/appsflyer/internal/AFb1vSDK;->AFKeystoreWrapper(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    const-string v0, "send_background"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p2, p1}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf(Lcom/appsflyer/internal/AFa1eSDK;Z)Z

    :cond_3
    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/appsflyer/internal/AFa1eSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFa1eSDK;J)J

    :cond_4
    return-void

    :cond_5
    instance-of p1, p1, Lcom/appsflyer/internal/AFe1pSDK;

    if-eqz p1, :cond_6

    sget-object p1, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    if-eq p2, p1, :cond_6

    new-instance p1, Lcom/appsflyer/internal/AFe1rSDK;

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {p2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFe1rSDK;-><init>(Lcom/appsflyer/internal/AFc1xSDK;)V

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {p2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object p2

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1xSDK;->AFVersionDeclaration()Lcom/appsflyer/internal/AFc1bSDK;

    move-result-object p2

    iget-object v0, p2, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/appsflyer/internal/AFc1bSDK$4;

    invoke-direct {v1, p2, p1}, Lcom/appsflyer/internal/AFc1bSDK$4;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_6
    return-void
.end method

.method public final values(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1zSDK<",
            "*>;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/appsflyer/internal/AFd1hSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$AFa1wSDK;->valueOf:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->afDebugLog()Lcom/appsflyer/internal/AFe1mSDK;

    move-result-object v0

    iget-object p1, p1, Lcom/appsflyer/internal/AFd1hSDK;->afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;

    iget p1, p1, Lcom/appsflyer/internal/AFa1qSDK;->AFLogger:I

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFe1mSDK;->AFKeystoreWrapper(I)V

    :cond_0
    return-void
.end method
