.class final Lcom/appsflyer/internal/AFf1hSDK$4;
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
.field private synthetic AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1hSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1hSDK;->valueOf:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    iget-boolean v2, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventParameterName:Landroid/os/Handler;

    iget-object v1, v1, Lcom/appsflyer/internal/AFf1hSDK;->values:Ljava/lang/Runnable;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v2, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventParameterName:Landroid/os/Handler;

    iget-object v1, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventType:Ljava/lang/Runnable;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    iget-object v2, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFInAppEventParameterName:Landroid/os/Handler;

    new-instance v3, Lcom/appsflyer/internal/AFf1hSDK$5;

    invoke-direct {v3, v1}, Lcom/appsflyer/internal/AFf1hSDK$5;-><init>(Lcom/appsflyer/internal/AFf1hSDK;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK$4;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1hSDK;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method
