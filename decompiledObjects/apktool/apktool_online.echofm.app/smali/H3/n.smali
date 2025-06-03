.class public LH3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public b:LV2/j;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LH3/n;->b:LV2/j;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LH3/n;->c:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LH3/n;->d:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    iput-object p1, p0, LH3/n;->a:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    new-instance v0, LH3/n$a;

    .line 28
    .line 29
    invoke-direct {v0, p0}, LH3/n$a;-><init>(LH3/n;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic a(LH3/n;)Ljava/lang/ThreadLocal;
    .locals 0

    .line 1
    iget-object p0, p0, LH3/n;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LH3/n;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Not running on background worker thread as intended."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, LH3/n;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(LV2/j;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LH3/n;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, LH3/n$d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LH3/n$d;-><init>(LH3/n;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final e()Z
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object v1, p0, LH3/n;->d:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final f(Ljava/util/concurrent/Callable;)LV2/b;
    .locals 1

    .line 1
    new-instance v0, LH3/n$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LH3/n$c;-><init>(LH3/n;Ljava/util/concurrent/Callable;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public g(Ljava/lang/Runnable;)LV2/j;
    .locals 1

    .line 1
    new-instance v0, LH3/n$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LH3/n$b;-><init>(LH3/n;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LH3/n;->h(Ljava/util/concurrent/Callable;)LV2/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public h(Ljava/util/concurrent/Callable;)LV2/j;
    .locals 3

    .line 1
    iget-object v0, p0, LH3/n;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LH3/n;->b:LV2/j;

    .line 5
    .line 6
    iget-object v2, p0, LH3/n;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LH3/n;->f(Ljava/util/concurrent/Callable;)LV2/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, v2, p1}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, LH3/n;->d(LV2/j;)LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, LH3/n;->b:LV2/j;

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method

.method public i(Ljava/util/concurrent/Callable;)LV2/j;
    .locals 3

    .line 1
    iget-object v0, p0, LH3/n;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LH3/n;->b:LV2/j;

    .line 5
    .line 6
    iget-object v2, p0, LH3/n;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LH3/n;->f(Ljava/util/concurrent/Callable;)LV2/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, v2, p1}, LV2/j;->h(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, LH3/n;->d(LV2/j;)LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, LH3/n;->b:LV2/j;

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method
