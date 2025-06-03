.class public final LV2/K;
.super LV2/j;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LV2/H;

.field public c:Z

.field public volatile d:Z

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LV2/j;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, LV2/H;

    .line 12
    .line 13
    invoke-direct {v0}, LV2/H;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LV2/K;->b:LV2/H;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;LV2/d;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 2
    .line 3
    new-instance v1, LV2/x;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LV2/x;-><init>(Ljava/util/concurrent/Executor;LV2/d;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LV2/H;->a(LV2/G;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LV2/K;->y()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final b(LV2/e;)LV2/j;
    .locals 3

    .line 1
    sget-object v0, LV2/l;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v1, p0, LV2/K;->b:LV2/H;

    .line 4
    .line 5
    new-instance v2, LV2/z;

    .line 6
    .line 7
    invoke-direct {v2, v0, p1}, LV2/z;-><init>(Ljava/util/concurrent/Executor;LV2/e;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, LV2/H;->a(LV2/G;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LV2/K;->y()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;LV2/e;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 2
    .line 3
    new-instance v1, LV2/z;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LV2/z;-><init>(Ljava/util/concurrent/Executor;LV2/e;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LV2/H;->a(LV2/G;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LV2/K;->y()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;LV2/f;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 2
    .line 3
    new-instance v1, LV2/B;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LV2/B;-><init>(Ljava/util/concurrent/Executor;LV2/f;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LV2/H;->a(LV2/G;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LV2/K;->y()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final e(Ljava/util/concurrent/Executor;LV2/g;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 2
    .line 3
    new-instance v1, LV2/D;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LV2/D;-><init>(Ljava/util/concurrent/Executor;LV2/g;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LV2/H;->a(LV2/G;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LV2/K;->y()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final f(LV2/b;)LV2/j;
    .locals 1

    .line 1
    sget-object v0, LV2/l;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/K;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/K;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV2/K;->b:LV2/H;

    .line 7
    .line 8
    new-instance v2, LV2/t;

    .line 9
    .line 10
    invoke-direct {v2, p1, p2, v0}, LV2/t;-><init>(Ljava/util/concurrent/Executor;LV2/b;LV2/K;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, LV2/H;->a(LV2/G;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LV2/K;->y()V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final h(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/K;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/K;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV2/K;->b:LV2/H;

    .line 7
    .line 8
    new-instance v2, LV2/v;

    .line 9
    .line 10
    invoke-direct {v2, p1, p2, v0}, LV2/v;-><init>(Ljava/util/concurrent/Executor;LV2/b;LV2/K;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, LV2/H;->a(LV2/G;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LV2/K;->y()V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final i()Ljava/lang/Exception;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final j()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LV2/K;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LV2/K;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LV2/K;->e:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, LV2/h;

    .line 21
    .line 22
    invoke-direct {v2, v1}, LV2/h;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v2

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
.end method

.method public final k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LV2/K;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LV2/K;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, LV2/K;->e:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, LV2/h;

    .line 29
    .line 30
    invoke-direct {v1, p1}, LV2/h;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    iget-object v1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    throw p1

    .line 43
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV2/K;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final m()Z
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final n()Z
    .locals 3

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, LV2/K;->d:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    return v2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
.end method

.method public final o(LV2/i;)LV2/j;
    .locals 4

    .line 1
    sget-object v0, LV2/l;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, LV2/K;

    .line 4
    .line 5
    invoke-direct {v1}, LV2/K;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LV2/K;->b:LV2/H;

    .line 9
    .line 10
    new-instance v3, LV2/F;

    .line 11
    .line 12
    invoke-direct {v3, v0, p1, v1}, LV2/F;-><init>(Ljava/util/concurrent/Executor;LV2/i;LV2/K;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v3}, LV2/H;->a(LV2/G;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LV2/K;->y()V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final p(Ljava/util/concurrent/Executor;LV2/i;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/K;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/K;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV2/K;->b:LV2/H;

    .line 7
    .line 8
    new-instance v2, LV2/F;

    .line 9
    .line 10
    invoke-direct {v2, p1, p2, v0}, LV2/F;-><init>(Ljava/util/concurrent/Executor;LV2/i;LV2/K;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, LV2/H;->a(LV2/G;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LV2/K;->y()V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final q(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "Exception must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-virtual {p0}, LV2/K;->x()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, LV2/K;->c:Z

    .line 14
    .line 15
    iput-object p1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object p1, p0, LV2/K;->b:LV2/H;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, LV2/H;->b(LV2/j;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LV2/K;->x()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, LV2/K;->c:Z

    .line 9
    .line 10
    iput-object p1, p0, LV2/K;->e:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object p1, p0, LV2/K;->b:LV2/H;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, LV2/H;->b(LV2/j;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final s()Z
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, LV2/K;->c:Z

    .line 15
    .line 16
    iput-boolean v1, p0, LV2/K;->d:Z

    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, LV2/H;->b(LV2/j;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1
.end method

.method public final t(Ljava/lang/Exception;)Z
    .locals 2

    .line 1
    const-string v0, "Exception must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, p0, LV2/K;->c:Z

    .line 20
    .line 21
    iput-object p1, p0, LV2/K;->f:Ljava/lang/Exception;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object p1, p0, LV2/K;->b:LV2/H;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, LV2/H;->b(LV2/j;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
.end method

.method public final u(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, LV2/K;->c:Z

    .line 15
    .line 16
    iput-object p1, p0, LV2/K;->e:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object p1, p0, LV2/K;->b:LV2/H;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, LV2/H;->b(LV2/j;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LV2/K;->c:Z

    .line 2
    .line 3
    const-string v1, "Task is not yet complete"

    .line 4
    .line 5
    invoke-static {v0, v1}, LA2/n;->m(ZLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LV2/K;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v1, "Task is already canceled."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LV2/K;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p0}, LV2/c;->a(LV2/j;)Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    throw v0
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, LV2/K;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LV2/K;->c:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, LV2/K;->b:LV2/H;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, LV2/H;->b(LV2/j;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v1
.end method
