.class public abstract LR2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile d:Landroid/os/Handler;


# instance fields
.field public final a:LR2/o3;

.field public final b:Ljava/lang/Runnable;

.field public volatile c:J


# direct methods
.method public constructor <init>(LR2/o3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LR2/x;->a:LR2/o3;

    .line 8
    .line 9
    new-instance v0, LR2/w;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, LR2/w;-><init>(LR2/x;LR2/o3;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LR2/x;->b:Ljava/lang/Runnable;

    .line 15
    .line 16
    return-void
.end method

.method public static bridge synthetic c(LR2/x;J)V
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    iput-wide p1, p0, LR2/x;->c:J

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LR2/x;->c:J

    .line 4
    .line 5
    invoke-virtual {p0}, LR2/x;->f()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LR2/x;->b:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/x;->a()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LR2/x;->a:LR2/o3;

    .line 11
    .line 12
    invoke-interface {v0}, LR2/o3;->b()LE2/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LE2/e;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LR2/x;->c:J

    .line 21
    .line 22
    invoke-virtual {p0}, LR2/x;->f()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LR2/x;->b:Ljava/lang/Runnable;

    .line 27
    .line 28
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, LR2/x;->a:LR2/o3;

    .line 35
    .line 36
    invoke-interface {v0}, LR2/o3;->j()LR2/Y1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "Failed to schedule delayed post. time"

    .line 49
    .line 50
    invoke-virtual {v0, p2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public abstract d()V
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LR2/x;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final f()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, LR2/x;->d:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LR2/x;->d:Landroid/os/Handler;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, LR2/x;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, LR2/x;->d:Landroid/os/Handler;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/measurement/t0;

    .line 16
    .line 17
    iget-object v2, p0, LR2/x;->a:LR2/o3;

    .line 18
    .line 19
    invoke-interface {v2}, LR2/o3;->a()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, LR2/x;->d:Landroid/os/Handler;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    sget-object v1, LR2/x;->d:Landroid/os/Handler;

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return-object v1

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method
