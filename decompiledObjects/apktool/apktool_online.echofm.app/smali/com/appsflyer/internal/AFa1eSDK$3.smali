.class final Lcom/appsflyer/internal/AFa1eSDK$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFa1eSDK;->start(Landroid/content/Context;Ljava/lang/String;Lcom/appsflyer/attribution/AppsFlyerRequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

.field private synthetic valueOf:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

.field private synthetic values:Lcom/appsflyer/internal/AFe1mSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFa1eSDK;Lcom/appsflyer/internal/AFe1mSDK;Lcom/appsflyer/attribution/AppsFlyerRequestListener;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->values:Lcom/appsflyer/internal/AFe1mSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->valueOf:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFInAppEventType(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onBecameBackground"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->values:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/appsflyer/internal/AFe1mSDK;->afErrorLog:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    sub-long/2addr v1, v3

    cmp-long v3, v1, v5

    if-lez v3, :cond_0

    const-wide/16 v3, 0x3e8

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    move-wide v1, v3

    :cond_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/appsflyer/internal/AFe1mSDK;->afWarnLog:J

    iget-object v0, v0, Lcom/appsflyer/internal/AFe1mSDK;->valueOf:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v3, "prev_session_dur"

    invoke-interface {v0, v3, v1, v2}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventParameterName(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    const-string v0, "Metrics: fg ts is missing"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    :goto_0
    const-string v0, "callStatsBackground background call"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFa1eSDK;->AFKeystoreWrapper(Ljava/lang/ref/WeakReference;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->onConversionDataSuccess()Lcom/appsflyer/internal/AFc1wSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1wSDK;->valueOf()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->afErrorLogForExcManagerOnly()Lcom/appsflyer/internal/AFb1tSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1tSDK;->afInfoLog()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1tSDK;->values()V

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v2

    invoke-interface {v0, v1, p1, v2}, Lcom/appsflyer/internal/AFb1tSDK;->valueOf(Ljava/lang/String;Landroid/content/pm/PackageManager;Lcom/appsflyer/internal/AFc1xSDK;)V

    :cond_2
    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1tSDK;->valueOf()V

    goto :goto_1

    :cond_3
    const-string p1, "RD status is OFF"

    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    :goto_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->getLevel()Lcom/appsflyer/internal/AFf1iSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFf1iSDK;->AFInAppEventType()V

    return-void
.end method

.method public final values(Landroid/app/Activity;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->values:Lcom/appsflyer/internal/AFe1mSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFe1mSDK;->values()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->afRDLog()Lcom/appsflyer/internal/AFb1wSDK;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFb1wSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFd1bSDK;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFa1eSDK;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFa1eSDK;->values(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf(Lcom/appsflyer/internal/AFb1dSDK;Z)I

    move-result v0

    const-string v1, "onBecameForeground"

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->getLevel()Lcom/appsflyer/internal/AFf1iSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFf1iSDK;->AFInAppEventParameterName()V

    :cond_0
    new-instance v0, Lcom/appsflyer/internal/AFe1hSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFe1hSDK;-><init>()V

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType()Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1xSDK;->AppsFlyer2dXConversionCallback()Lcom/appsflyer/internal/AFb1sSDK;

    move-result-object v1

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFa1qSDK;->valueOf()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/appsflyer/internal/AFb1sSDK;->valueOf(Ljava/util/Map;Landroid/content/Intent;Landroid/content/Context;)V

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFa1eSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1eSDK$3;->valueOf:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    iput-object v2, v0, Lcom/appsflyer/internal/AFa1qSDK;->AFInAppEventParameterName:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFa1eSDK;->values(Lcom/appsflyer/internal/AFa1qSDK;Landroid/app/Activity;)V

    return-void
.end method
