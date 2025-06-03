.class final Lcom/appsflyer/internal/AFc1bSDK$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFc1bSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

.field private synthetic valueOf:Lcom/appsflyer/internal/AFd1zSDK;

.field private synthetic values:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QUEUE: execution finished for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog:Ljava/util/Set;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFc1cSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1cSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    sget-object v1, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventType:Ljava/util/Set;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->values:Lcom/appsflyer/internal/AFd1vSDK;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1zSDK;->AFInAppEventParameterName()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf(Lcom/appsflyer/internal/AFd1zSDK;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog:Ljava/util/List;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/appsflyer/internal/AFc1cSDK;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    monitor-exit v0

    throw v1

    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventType:Ljava/util/Set;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->valueOf:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->values:Lcom/appsflyer/internal/AFd1vSDK;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$3;->values:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1bSDK;)V

    :cond_4
    return-void
.end method
