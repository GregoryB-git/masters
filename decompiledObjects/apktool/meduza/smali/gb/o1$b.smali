.class public final Lgb/o1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/o1;


# direct methods
.method public constructor <init>(Lgb/o1;)V
    .locals 0

    iput-object p1, p0, Lgb/o1$b;->a:Lgb/o1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lgb/o1$b;->a:Lgb/o1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgb/o1$b;->a:Lgb/o1;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lgb/o1;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 8
    .line 9
    iget v2, v1, Lgb/o1;->e:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x4

    .line 16
    iput v3, v1, Lgb/o1;->e:I

    .line 17
    .line 18
    iget-object v3, v1, Lgb/o1;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    iget-object v4, v1, Lgb/o1;->h:Lgb/p1;

    .line 21
    .line 22
    iget-wide v5, v1, Lgb/o1;->k:J

    .line 23
    .line 24
    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-interface {v3, v4, v5, v6, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iput-object v3, v1, Lgb/o1;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v4, 0x3

    .line 34
    if-ne v2, v4, :cond_1

    .line 35
    .line 36
    iget-object v2, v1, Lgb/o1;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    iget-object v4, v1, Lgb/o1;->i:Lgb/p1;

    .line 39
    .line 40
    iget-wide v5, v1, Lgb/o1;->j:J

    .line 41
    .line 42
    iget-object v7, v1, Lgb/o1;->b:Ln7/p;

    .line 43
    .line 44
    sget-object v8, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 45
    .line 46
    invoke-virtual {v7, v8}, Ln7/p;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    sub-long/2addr v5, v9

    .line 51
    invoke-interface {v2, v4, v5, v6, v8}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iput-object v2, v1, Lgb/o1;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 56
    .line 57
    iget-object v1, p0, Lgb/o1$b;->a:Lgb/o1;

    .line 58
    .line 59
    iput v3, v1, Lgb/o1;->e:I

    .line 60
    .line 61
    :cond_1
    const/4 v2, 0x0

    .line 62
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lgb/o1$b;->a:Lgb/o1;

    .line 66
    .line 67
    iget-object v0, v0, Lgb/o1;->c:Lgb/o1$d;

    .line 68
    .line 69
    invoke-interface {v0}, Lgb/o1$d;->b()V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw v1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
