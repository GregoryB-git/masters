.class public LU3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU3/a$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Lc4/c;

.field public final c:J

.field public final d:J

.field public final e:D

.field public final f:D

.field public final g:Ljava/util/Random;

.field public h:Ljava/util/concurrent/ScheduledFuture;

.field public i:J

.field public j:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lc4/c;JJDD)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, LU3/a;->g:Ljava/util/Random;

    const/4 v0, 0x1

    iput-boolean v0, p0, LU3/a;->j:Z

    iput-object p1, p0, LU3/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, LU3/a;->b:Lc4/c;

    iput-wide p3, p0, LU3/a;->c:J

    iput-wide p5, p0, LU3/a;->d:J

    iput-wide p7, p0, LU3/a;->f:D

    iput-wide p9, p0, LU3/a;->e:D

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lc4/c;JJDDLU3/a$a;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p10}, LU3/a;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lc4/c;JJDD)V

    return-void
.end method

.method public static synthetic a(LU3/a;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    iput-object p1, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LU3/a;->b:Lc4/c;

    .line 7
    .line 8
    const-string v2, "Cancelling existing retry attempt"

    .line 9
    .line 10
    new-array v3, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v2, v3}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, LU3/a;->b:Lc4/c;

    .line 25
    .line 26
    const-string v2, "No existing retry attempt to cancel"

    .line 27
    .line 28
    new-array v1, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    iput-wide v0, p0, LU3/a;->i:J

    .line 36
    .line 37
    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 10

    .line 1
    new-instance v0, LU3/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LU3/a$a;-><init>(LU3/a;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LU3/a;->b:Lc4/c;

    .line 12
    .line 13
    const-string v2, "Cancelling previous scheduled retry"

    .line 14
    .line 15
    new-array v3, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p1, v2, v3}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    :cond_0
    iget-boolean p1, p0, LU3/a;->j:Z

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    iget-wide v4, p0, LU3/a;->i:J

    .line 36
    .line 37
    cmp-long p1, v4, v2

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-wide v2, p0, LU3/a;->c:J

    .line 42
    .line 43
    :goto_0
    iput-wide v2, p0, LU3/a;->i:J

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    long-to-double v2, v4

    .line 47
    iget-wide v4, p0, LU3/a;->f:D

    .line 48
    .line 49
    mul-double/2addr v2, v4

    .line 50
    double-to-long v2, v2

    .line 51
    iget-wide v4, p0, LU3/a;->d:J

    .line 52
    .line 53
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    goto :goto_0

    .line 58
    :goto_1
    iget-wide v2, p0, LU3/a;->e:D

    .line 59
    .line 60
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 61
    .line 62
    sub-double/2addr v4, v2

    .line 63
    iget-wide v6, p0, LU3/a;->i:J

    .line 64
    .line 65
    long-to-double v8, v6

    .line 66
    mul-double/2addr v4, v8

    .line 67
    long-to-double v6, v6

    .line 68
    mul-double/2addr v2, v6

    .line 69
    iget-object p1, p0, LU3/a;->g:Ljava/util/Random;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/Random;->nextDouble()D

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    mul-double/2addr v2, v6

    .line 76
    add-double/2addr v4, v2

    .line 77
    double-to-long v2, v4

    .line 78
    :goto_2
    iput-boolean v1, p0, LU3/a;->j:Z

    .line 79
    .line 80
    iget-object p1, p0, LU3/a;->b:Lc4/c;

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/4 v5, 0x1

    .line 87
    new-array v5, v5, [Ljava/lang/Object;

    .line 88
    .line 89
    aput-object v4, v5, v1

    .line 90
    .line 91
    const-string v1, "Scheduling retry in %dms"

    .line 92
    .line 93
    invoke-virtual {p1, v1, v5}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LU3/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 97
    .line 98
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 99
    .line 100
    invoke-interface {p1, v0, v2, v3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, LU3/a;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 105
    .line 106
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-wide v0, p0, LU3/a;->d:J

    .line 2
    .line 3
    iput-wide v0, p0, LU3/a;->i:J

    .line 4
    .line 5
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LU3/a;->j:Z

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, LU3/a;->i:J

    .line 7
    .line 8
    return-void
.end method
