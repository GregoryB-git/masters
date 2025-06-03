.class public final Lcom/appsflyer/internal/AFc1bSDK$4;
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
.field private synthetic AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

.field private synthetic AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog:Ljava/util/Set;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QUEUE: tried to add already running task: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto/16 :goto_9

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v3, v2, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/appsflyer/internal/AFd1vSDK;

    iget-object v5, v1, Lcom/appsflyer/internal/AFc1bSDK;->valueOf:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v2, Lcom/appsflyer/internal/AFd1zSDK;->AFInAppEventParameterName:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-static {v1, v2}, Lcom/appsflyer/internal/AFc1bSDK;->values(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QUEUE: new task was blocked: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper()V

    :cond_5
    :goto_1
    if-eqz v1, :cond_6

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v3, v2, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    iget-object v2, v2, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    goto :goto_2

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QUEUE: task not added, it\'s already in the queue: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_d

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->valueOf:Ljava/util/Set;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->values:Lcom/appsflyer/internal/AFd1vSDK;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QUEUE: new task added: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1bSDK;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFc1cSDK;

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    monitor-enter v1

    :try_start_1
    iget-object v2, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x28

    :goto_4
    if-lez v2, :cond_c

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_9

    if-eqz v3, :cond_9

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    invoke-interface {v3}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v4, v0, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    invoke-interface {v4}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v3, v4}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFd1zSDK;)I

    move-result v3

    if-lez v3, :cond_8

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    :goto_5
    invoke-virtual {v0, v3}, Lcom/appsflyer/internal/AFc1bSDK;->AFInAppEventParameterName(Ljava/util/NavigableSet;)V

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_8
    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    goto :goto_5

    :cond_9
    if-eqz v4, :cond_a

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger:Ljava/util/NavigableSet;

    goto :goto_5

    :cond_a
    if-eqz v3, :cond_b

    iget-object v3, v0, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog:Ljava/util/NavigableSet;

    goto :goto_5

    :cond_b
    :goto_6
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_c
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :goto_7
    monitor-exit v1

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QUEUE: tried to add already pending task: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    return-void

    :cond_e
    :goto_8
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QUEUE: tried to add already scheduled task: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1bSDK$4;->AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :goto_9
    monitor-exit v0

    throw v1
.end method
