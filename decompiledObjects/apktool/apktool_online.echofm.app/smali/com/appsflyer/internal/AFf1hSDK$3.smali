.class final Lcom/appsflyer/internal/AFf1hSDK$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFf1hSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic valueOf:Lcom/appsflyer/internal/AFf1hSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1hSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFf1hSDK;->values(Lcom/appsflyer/internal/AFf1hSDK;)Landroid/hardware/SensorManager;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v2

    invoke-static {v2}, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventType(I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/appsflyer/internal/AFf1kSDK;

    invoke-direct {v2, v1}, Lcom/appsflyer/internal/AFf1kSDK;-><init>(Landroid/hardware/Sensor;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFf1hSDK;->valueOf(Lcom/appsflyer/internal/AFf1hSDK;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFf1hSDK;->valueOf(Lcom/appsflyer/internal/AFf1hSDK;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFf1hSDK;->valueOf(Lcom/appsflyer/internal/AFf1hSDK;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/SensorEventListener;

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFf1hSDK;->values(Lcom/appsflyer/internal/AFf1hSDK;)Landroid/hardware/SensorManager;

    move-result-object v3

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v4, v4, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventParameterName:Landroid/os/Handler;

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v1, v5, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    const-string v1, "registerListeners error"

    invoke-static {v1, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK$3;->valueOf:Lcom/appsflyer/internal/AFf1hSDK;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFf1hSDK;Z)Z

    return-void
.end method
