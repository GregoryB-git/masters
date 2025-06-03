.class public final Le9/b;
.super Le9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le9/a;"
    }
.end annotation


# instance fields
.field public b:La8/a;


# direct methods
.method public constructor <init>(Lt9/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/a<",
            "La8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Le9/a;-><init>()V

    new-instance v0, Ld;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Ld;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Le;

    invoke-direct {v0, p0, v1}, Le;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lt9/a;->a(Lt9/a$a;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized s()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le9/b;->b:La8/a;

    if-nez v0, :cond_0

    new-instance v0, Lu7/c;

    const-string v1, "AppCheck is not available"

    invoke-direct {v0, v1}, Lu7/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-interface {v0}, La8/a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    sget-object v1, Ln9/f;->b:Lm/a;

    new-instance v2, Le0/d;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Le0/d;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized t()V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized w()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le9/b;->b:La8/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, La8/a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized z(Ln9/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln9/j<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    monitor-exit p0

    return-void
.end method
