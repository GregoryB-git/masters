.class public final Lv3/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/g1$a;,
        Lv3/g1$b;
    }
.end annotation


# instance fields
.field public final a:Lv3/g1$b;

.field public final b:Lv3/g1$a;

.field public final c:Lv5/c;

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Landroid/os/Looper;

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Lv3/g0;Lv3/g1$b;Lv3/r1;ILv5/c;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/g1;->b:Lv3/g1$a;

    iput-object p2, p0, Lv3/g1;->a:Lv3/g1$b;

    iput-object p6, p0, Lv3/g1;->f:Landroid/os/Looper;

    iput-object p5, p0, Lv3/g1;->c:Lv5/c;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(J)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lv3/g1;->g:Z

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lv3/g1;->f:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lv3/g1;->c:Lv5/c;

    invoke-interface {v0}, Lv5/c;->d()J

    move-result-wide v0

    add-long/2addr v0, p1

    :goto_1
    iget-boolean v2, p0, Lv3/g1;->i:Z

    if-nez v2, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v3, p1, v3

    if-lez v3, :cond_1

    iget-object v2, p0, Lv3/g1;->c:Lv5/c;

    invoke-interface {v2}, Lv5/c;->c()V

    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    iget-object p1, p0, Lv3/g1;->c:Lv5/c;

    invoke-interface {p1}, Lv5/c;->d()J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long p1, v0, p1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    const-string p2, "Message delivery timed out."

    invoke-direct {p1, p2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lv3/g1;->h:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Lv3/g1;->h:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv3/g1;->i:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lv3/g1;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lv3/g1;->g:Z

    .line 9
    .line 10
    iget-object v0, p0, Lv3/g1;->b:Lv3/g1$a;

    .line 11
    .line 12
    check-cast v0, Lv3/g0;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-boolean v1, v0, Lv3/g0;->H:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lv3/g0;->r:Landroid/os/Looper;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, v0, Lv3/g0;->p:Lv5/k;

    .line 33
    .line 34
    const/16 v2, 0xe

    .line 35
    .line 36
    invoke-interface {v1, v2, p0}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lv5/a0$a;->a()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const-string v1, "ExoPlayerImplInternal"

    .line 45
    .line 46
    const-string v2, "Ignoring messages sent after release."

    .line 47
    .line 48
    invoke-static {v1, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {p0, v1}, Lv3/g1;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0

    .line 59
    throw v1
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
