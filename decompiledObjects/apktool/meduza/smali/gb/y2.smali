.class public abstract Lgb/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/y2$t;,
        Lgb/y2$v;,
        Lgb/y2$b0;,
        Lgb/y2$s;,
        Lgb/y2$r;,
        Lgb/y2$a0;,
        Lgb/y2$y;,
        Lgb/y2$z;,
        Lgb/y2$q;,
        Lgb/y2$w;,
        Lgb/y2$u;,
        Lgb/y2$x;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgb/s;"
    }
.end annotation


# static fields
.field public static final A:Leb/s0$b;

.field public static final B:Leb/s0$b;

.field public static final C:Leb/e1;

.field public static D:Ljava/util/Random;


# instance fields
.field public final a:Leb/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0<",
            "TReqT;*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Leb/h1;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Leb/s0;

.field public final f:Lgb/a3;

.field public final g:Lgb/x0;

.field public final h:Z

.field public final i:Ljava/lang/Object;

.field public final j:Lgb/y2$s;

.field public final k:J

.field public final l:J

.field public final m:Lgb/y2$b0;

.field public final n:Ld2/q;

.field public volatile o:Lgb/y2$y;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field public s:Lgb/y2$w;

.field public t:J

.field public u:Lgb/t;

.field public v:Lgb/y2$t;

.field public w:Lgb/y2$t;

.field public x:J

.field public y:Leb/e1;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Leb/s0;->d:Leb/s0$a;

    .line 2
    .line 3
    sget-object v1, Leb/s0$d;->d:Ljava/util/BitSet;

    .line 4
    .line 5
    new-instance v1, Leb/s0$b;

    .line 6
    .line 7
    const-string v2, "grpc-previous-rpc-attempts"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lgb/y2;->A:Leb/s0$b;

    .line 13
    .line 14
    new-instance v1, Leb/s0$b;

    .line 15
    .line 16
    const-string v2, "grpc-retry-pushback-ms"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lgb/y2;->B:Leb/s0$b;

    .line 22
    .line 23
    sget-object v0, Leb/e1;->f:Leb/e1;

    .line 24
    .line 25
    const-string v1, "Stream thrown away because RetriableStream committed"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lgb/y2;->C:Leb/e1;

    .line 32
    .line 33
    new-instance v0, Ljava/util/Random;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lgb/y2;->D:Ljava/util/Random;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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

.method public constructor <init>(Leb/t0;Leb/s0;Lgb/y2$s;JJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lgb/a3;Lgb/x0;Lgb/y2$b0;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/t0<",
            "TReqT;*>;",
            "Leb/s0;",
            "Lgb/y2$s;",
            "JJ",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lgb/a3;",
            "Lgb/x0;",
            "Lgb/y2$b0;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Leb/h1;

    new-instance v4, Lgb/y2$a;

    invoke-direct {v4}, Lgb/y2$a;-><init>()V

    invoke-direct {v3, v4}, Leb/h1;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v3, v0, Lgb/y2;->c:Leb/h1;

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Lgb/y2;->i:Ljava/lang/Object;

    new-instance v3, Ld2/q;

    invoke-direct {v3}, Ld2/q;-><init>()V

    iput-object v3, v0, Lgb/y2;->n:Ld2/q;

    new-instance v3, Lgb/y2$y;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v4, 0x8

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v12}, Lgb/y2$y;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lgb/y2$a0;ZZZI)V

    iput-object v3, v0, Lgb/y2;->o:Lgb/y2$y;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v3, v0, Lgb/y2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v3, v0, Lgb/y2;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v3, v0, Lgb/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v3, p1

    iput-object v3, v0, Lgb/y2;->a:Leb/t0;

    move-object/from16 v3, p3

    iput-object v3, v0, Lgb/y2;->j:Lgb/y2$s;

    move-wide/from16 v3, p4

    iput-wide v3, v0, Lgb/y2;->k:J

    move-wide/from16 v3, p6

    iput-wide v3, v0, Lgb/y2;->l:J

    move-object/from16 v3, p8

    iput-object v3, v0, Lgb/y2;->b:Ljava/util/concurrent/Executor;

    move-object/from16 v3, p9

    iput-object v3, v0, Lgb/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v3, p2

    iput-object v3, v0, Lgb/y2;->e:Leb/s0;

    iput-object v1, v0, Lgb/y2;->f:Lgb/a3;

    if-eqz v1, :cond_0

    iget-wide v3, v1, Lgb/a3;->b:J

    iput-wide v3, v0, Lgb/y2;->x:J

    :cond_0
    iput-object v2, v0, Lgb/y2;->g:Lgb/x0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v4

    :goto_1
    const-string v5, "Should not provide both retryPolicy and hedgingPolicy"

    invoke-static {v5, v1}, Lx6/b;->s(Ljava/lang/String;Z)V

    if-eqz v2, :cond_3

    move v3, v4

    :cond_3
    iput-boolean v3, v0, Lgb/y2;->h:Z

    move-object/from16 v1, p12

    iput-object v1, v0, Lgb/y2;->m:Lgb/y2$b0;

    return-void
.end method

.method public static c(Lgb/y2;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lgb/y2;->u()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    iget-object v1, p0, Lgb/y2;->w:Lgb/y2$t;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 v2, 0x1

    .line 27
    iput-boolean v2, v1, Lgb/y2$t;->c:Z

    .line 28
    .line 29
    iget-object v1, v1, Lgb/y2$t;->b:Ljava/util/concurrent/Future;

    .line 30
    .line 31
    new-instance v2, Lgb/y2$t;

    .line 32
    .line 33
    iget-object v3, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lgb/y2$t;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lgb/y2;->w:Lgb/y2$t;

    .line 39
    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Lgb/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 48
    .line 49
    new-instance v1, Lgb/y2$u;

    .line 50
    .line 51
    invoke-direct {v1, p0, v2}, Lgb/y2$u;-><init>(Lgb/y2;Lgb/y2$t;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    int-to-long p0, p0

    .line 59
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 60
    .line 61
    invoke-interface {v0, v1, p0, p1, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v2, p0}, Lgb/y2$t;->a(Ljava/util/concurrent/ScheduledFuture;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    return-void

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 2
    .line 3
    iget-boolean v1, v0, Lgb/y2$y;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 8
    .line 9
    iget-object v0, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 10
    .line 11
    iget-object v1, p0, Lgb/y2;->a:Leb/t0;

    .line 12
    .line 13
    iget-object v1, v1, Leb/t0;->d:Leb/t0$b;

    .line 14
    .line 15
    invoke-interface {v1, p1}, Leb/t0$b;->b(Ljava/lang/Object;)Llb/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, p1}, Lgb/m3;->d(Ljava/io/InputStream;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v0, Lgb/y2$m;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lgb/y2$m;-><init>(Lgb/y2;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method

.method public final a(Leb/l;)V
    .locals 1

    new-instance v0, Lgb/y2$c;

    invoke-direct {v0, p1}, Lgb/y2$c;-><init>(Leb/l;)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v0, v0, Lgb/y2$y;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/y2$a0;

    iget-object v1, v1, Lgb/y2$a0;->a:Lgb/s;

    invoke-interface {v1}, Lgb/m3;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Ljava/io/InputStream;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RetriableStream.writeMessage() should not be called directly"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()V
    .locals 1

    new-instance v0, Lgb/y2$k;

    invoke-direct {v0}, Lgb/y2$k;-><init>()V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-boolean v1, v0, Lgb/y2$y;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    iget-object v0, v0, Lgb/y2$a0;->a:Lgb/s;

    invoke-interface {v0, p1}, Lgb/m3;->f(I)V

    return-void

    :cond_0
    new-instance v0, Lgb/y2$l;

    invoke-direct {v0, p1}, Lgb/y2$l;-><init>(I)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final flush()V
    .locals 2

    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-boolean v1, v0, Lgb/y2$y;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    iget-object v0, v0, Lgb/y2$a0;->a:Lgb/s;

    invoke-interface {v0}, Lgb/m3;->flush()V

    return-void

    :cond_0
    new-instance v0, Lgb/y2$f;

    invoke-direct {v0}, Lgb/y2$f;-><init>()V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final g(I)V
    .locals 1

    new-instance v0, Lgb/y2$i;

    invoke-direct {v0, p1}, Lgb/y2$i;-><init>(I)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final h(I)V
    .locals 1

    new-instance v0, Lgb/y2$j;

    invoke-direct {v0, p1}, Lgb/y2$j;-><init>(I)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final i(Ld2/q;)V
    .locals 4

    iget-object v0, p0, Lgb/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "closed"

    iget-object v2, p0, Lgb/y2;->n:Ld2/q;

    invoke-virtual {p1, v2, v1}, Ld2/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lgb/y2$y;->f:Lgb/y2$a0;

    if-eqz v0, :cond_0

    new-instance v0, Ld2/q;

    invoke-direct {v0}, Ld2/q;-><init>()V

    iget-object v1, v1, Lgb/y2$y;->f:Lgb/y2$a0;

    iget-object v1, v1, Lgb/y2$a0;->a:Lgb/s;

    invoke-interface {v1, v0}, Lgb/s;->i(Ld2/q;)V

    const-string v1, "committed"

    goto :goto_1

    :cond_0
    new-instance v0, Ld2/q;

    invoke-direct {v0}, Ld2/q;-><init>()V

    iget-object v1, v1, Lgb/y2$y;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgb/y2$a0;

    new-instance v3, Ld2/q;

    invoke-direct {v3}, Ld2/q;-><init>()V

    iget-object v2, v2, Lgb/y2$a0;->a:Lgb/s;

    invoke-interface {v2, v3}, Lgb/s;->i(Ld2/q;)V

    invoke-virtual {v0, v3}, Ld2/q;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "open"

    :goto_1
    invoke-virtual {p1, v0, v1}, Ld2/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Leb/q;)V
    .locals 1

    new-instance v0, Lgb/y2$d;

    invoke-direct {v0, p1}, Lgb/y2$d;-><init>(Leb/q;)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lgb/y2$b;

    invoke-direct {v0, p1}, Lgb/y2$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final l(Lgb/t;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lgb/y2;->u:Lgb/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgb/y2;->y()Leb/e1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lgb/y2;->n(Leb/e1;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p1

    .line 16
    :try_start_0
    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 17
    .line 18
    iget-object v0, v0, Lgb/y2$y;->b:Ljava/util/List;

    .line 19
    .line 20
    new-instance v1, Lgb/y2$x;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lgb/y2$x;-><init>(Lgb/y2;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1, p1}, Lgb/y2;->r(IZ)Lgb/y2$a0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-boolean v1, p0, Lgb/y2;->h:Z

    .line 38
    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iget-object v2, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v2

    .line 45
    :try_start_1
    iget-object v3, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 46
    .line 47
    invoke-virtual {v3, v0}, Lgb/y2$y;->a(Lgb/y2$a0;)Lgb/y2$y;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iput-object v3, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 52
    .line 53
    iget-object v3, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Lgb/y2;->v(Lgb/y2$y;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    iget-object v3, p0, Lgb/y2;->m:Lgb/y2$b0;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    iget-object v4, v3, Lgb/y2$b0;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iget v3, v3, Lgb/y2$b0;->b:I

    .line 72
    .line 73
    if-le v4, v3, :cond_2

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    :cond_2
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    new-instance v1, Lgb/y2$t;

    .line 82
    .line 83
    iget-object p1, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-direct {v1, p1}, Lgb/y2$t;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Lgb/y2;->w:Lgb/y2$t;

    .line 89
    .line 90
    :cond_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    iget-object p1, p0, Lgb/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    new-instance v2, Lgb/y2$u;

    .line 96
    .line 97
    invoke-direct {v2, p0, v1}, Lgb/y2$u;-><init>(Lgb/y2;Lgb/y2$t;)V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, Lgb/y2;->g:Lgb/x0;

    .line 101
    .line 102
    iget-wide v3, v3, Lgb/x0;->b:J

    .line 103
    .line 104
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 105
    .line 106
    invoke-interface {p1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v1, p1}, Lgb/y2$t;->a(Ljava/util/concurrent/ScheduledFuture;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    throw p1

    .line 116
    :cond_5
    :goto_2
    invoke-virtual {p0, v0}, Lgb/y2;->t(Lgb/y2$a0;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 122
    throw v0
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final m()V
    .locals 1

    new-instance v0, Lgb/y2$h;

    invoke-direct {v0}, Lgb/y2$h;-><init>()V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final n(Leb/e1;)V
    .locals 13

    .line 1
    new-instance v0, Lgb/y2$a0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lgb/y2$a0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lgb/l2;

    .line 8
    .line 9
    invoke-direct {v1}, Lgb/l2;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lgb/y2;->q(Lgb/y2$a0;)Lgb/z2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    iget-object v3, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Lgb/y2$y;->e(Lgb/y2$a0;)Lgb/y2$y;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 30
    .line 31
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-virtual {v1}, Lgb/z2;->run()V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lgb/t$a;->a:Lgb/t$a;

    .line 36
    .line 37
    new-instance v1, Leb/s0;

    .line 38
    .line 39
    invoke-direct {v1}, Leb/s0;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v0, v1}, Lgb/y2;->z(Leb/e1;Lgb/t$a;Leb/s0;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    iget-object v1, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v1

    .line 53
    :try_start_2
    iget-object v2, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 54
    .line 55
    iget-object v2, v2, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 56
    .line 57
    iget-object v3, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 58
    .line 59
    iget-object v3, v3, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 68
    .line 69
    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iput-object p1, p0, Lgb/y2;->y:Leb/e1;

    .line 73
    .line 74
    :goto_0
    iget-object v2, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 75
    .line 76
    new-instance v12, Lgb/y2$y;

    .line 77
    .line 78
    iget-object v4, v2, Lgb/y2$y;->b:Ljava/util/List;

    .line 79
    .line 80
    iget-object v5, v2, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 81
    .line 82
    iget-object v6, v2, Lgb/y2$y;->d:Ljava/util/Collection;

    .line 83
    .line 84
    iget-object v7, v2, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 85
    .line 86
    iget-boolean v9, v2, Lgb/y2$y;->a:Z

    .line 87
    .line 88
    iget-boolean v10, v2, Lgb/y2$y;->h:Z

    .line 89
    .line 90
    iget v11, v2, Lgb/y2$y;->e:I

    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    move-object v3, v12

    .line 94
    invoke-direct/range {v3 .. v11}, Lgb/y2$y;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lgb/y2$a0;ZZZI)V

    .line 95
    .line 96
    .line 97
    iput-object v12, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 98
    .line 99
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iget-object v0, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 103
    .line 104
    invoke-interface {v0, p1}, Lgb/s;->n(Leb/e1;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void

    .line 108
    :catchall_1
    move-exception p1

    .line 109
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    throw p1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final o(Leb/s;)V
    .locals 1

    new-instance v0, Lgb/y2$e;

    invoke-direct {v0, p1}, Lgb/y2$e;-><init>(Leb/s;)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    new-instance v0, Lgb/y2$g;

    invoke-direct {v0, p1}, Lgb/y2$g;-><init>(Z)V

    invoke-virtual {p0, v0}, Lgb/y2;->s(Lgb/y2$q;)V

    return-void
.end method

.method public final q(Lgb/y2$a0;)Lgb/z2;
    .locals 18

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v8, v7, Lgb/y2;->i:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v8

    .line 6
    :try_start_0
    iget-object v0, v7, Lgb/y2;->o:Lgb/y2$y;

    .line 7
    .line 8
    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    monitor-exit v8

    .line 14
    return-object v1

    .line 15
    :cond_0
    iget-object v0, v7, Lgb/y2;->o:Lgb/y2$y;

    .line 16
    .line 17
    iget-object v3, v0, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 18
    .line 19
    iget-object v0, v7, Lgb/y2;->o:Lgb/y2$y;

    .line 20
    .line 21
    iget-object v2, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    move v2, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v4

    .line 30
    :goto_0
    const-string v6, "Already committed"

    .line 31
    .line 32
    invoke-static {v2, v6}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lgb/y2$y;->b:Ljava/util/List;

    .line 36
    .line 37
    iget-object v6, v0, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 38
    .line 39
    move-object/from16 v15, p1

    .line 40
    .line 41
    invoke-interface {v6, v15}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v10, v1

    .line 52
    move-object v11, v2

    .line 53
    move v4, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    move-object v10, v2

    .line 60
    move-object v11, v6

    .line 61
    :goto_1
    new-instance v2, Lgb/y2$y;

    .line 62
    .line 63
    iget-object v12, v0, Lgb/y2$y;->d:Ljava/util/Collection;

    .line 64
    .line 65
    iget-boolean v14, v0, Lgb/y2$y;->g:Z

    .line 66
    .line 67
    iget-boolean v6, v0, Lgb/y2$y;->h:Z

    .line 68
    .line 69
    iget v0, v0, Lgb/y2$y;->e:I

    .line 70
    .line 71
    move-object v9, v2

    .line 72
    move-object/from16 v13, p1

    .line 73
    .line 74
    move v15, v4

    .line 75
    move/from16 v16, v6

    .line 76
    .line 77
    move/from16 v17, v0

    .line 78
    .line 79
    invoke-direct/range {v9 .. v17}, Lgb/y2$y;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lgb/y2$a0;ZZZI)V

    .line 80
    .line 81
    .line 82
    iput-object v2, v7, Lgb/y2;->o:Lgb/y2$y;

    .line 83
    .line 84
    iget-object v0, v7, Lgb/y2;->j:Lgb/y2$s;

    .line 85
    .line 86
    iget-wide v9, v7, Lgb/y2;->t:J

    .line 87
    .line 88
    neg-long v9, v9

    .line 89
    iget-object v0, v0, Lgb/y2$s;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 90
    .line 91
    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 92
    .line 93
    .line 94
    iget-object v0, v7, Lgb/y2;->v:Lgb/y2$t;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    iput-boolean v5, v0, Lgb/y2$t;->c:Z

    .line 99
    .line 100
    iget-object v0, v0, Lgb/y2$t;->b:Ljava/util/concurrent/Future;

    .line 101
    .line 102
    iput-object v1, v7, Lgb/y2;->v:Lgb/y2$t;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move-object v0, v1

    .line 106
    :goto_2
    iget-object v2, v7, Lgb/y2;->w:Lgb/y2$t;

    .line 107
    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    iput-boolean v5, v2, Lgb/y2$t;->c:Z

    .line 111
    .line 112
    iget-object v2, v2, Lgb/y2$t;->b:Ljava/util/concurrent/Future;

    .line 113
    .line 114
    iput-object v1, v7, Lgb/y2;->w:Lgb/y2$t;

    .line 115
    .line 116
    move-object v6, v2

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move-object v6, v1

    .line 119
    :goto_3
    new-instance v9, Lgb/z2;

    .line 120
    .line 121
    move-object v1, v9

    .line 122
    move-object/from16 v2, p0

    .line 123
    .line 124
    move-object/from16 v4, p1

    .line 125
    .line 126
    move-object v5, v0

    .line 127
    invoke-direct/range {v1 .. v6}, Lgb/z2;-><init>(Lgb/y2;Ljava/util/Collection;Lgb/y2$a0;Ljava/util/concurrent/Future;Ljava/util/concurrent/Future;)V

    .line 128
    .line 129
    .line 130
    monitor-exit v8

    .line 131
    return-object v9

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    throw v0
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final r(IZ)Lgb/y2$a0;
    .locals 5

    .line 1
    :cond_0
    iget-object v0, p0, Lgb/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_1
    iget-object v1, p0, Lgb/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    add-int/lit8 v2, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lgb/y2$a0;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lgb/y2$a0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lgb/y2$r;

    .line 27
    .line 28
    invoke-direct {v1, p0, v0}, Lgb/y2$r;-><init>(Lgb/y2;Lgb/y2$a0;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lgb/y2$n;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lgb/y2$n;-><init>(Lgb/y2$r;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lgb/y2;->e:Leb/s0;

    .line 37
    .line 38
    new-instance v3, Leb/s0;

    .line 39
    .line 40
    invoke-direct {v3}, Leb/s0;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1}, Leb/s0;->d(Leb/s0;)V

    .line 44
    .line 45
    .line 46
    if-lez p1, :cond_2

    .line 47
    .line 48
    sget-object v1, Lgb/y2;->A:Leb/s0$b;

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v3, v1, v4}, Leb/s0;->f(Leb/s0$d;Ljava/io/Serializable;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, v3, v2, p1, p2}, Lgb/y2;->w(Leb/s0;Lgb/y2$n;IZ)Lgb/s;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 62
    .line 63
    return-object v0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final s(Lgb/y2$q;)V
    .locals 2

    iget-object v0, p0, Lgb/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-boolean v1, v1, Lgb/y2$y;->a:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v1, v1, Lgb/y2$y;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v1, v1, Lgb/y2$y;->c:Ljava/util/Collection;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/y2$a0;

    invoke-interface {p1, v1}, Lgb/y2$q;->a(Lgb/y2$a0;)V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t(Lgb/y2$a0;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v3, v0

    move v2, v1

    :goto_0
    iget-object v4, p0, Lgb/y2;->i:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v6, v5, Lgb/y2$y;->f:Lgb/y2$a0;

    if-eqz v6, :cond_0

    if-eq v6, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v6, v5, Lgb/y2$y;->g:Z

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v6, v5, Lgb/y2$y;->b:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v1, v6, :cond_6

    invoke-virtual {v5, p1}, Lgb/y2$y;->e(Lgb/y2$a0;)Lgb/y2$y;

    move-result-object v0

    iput-object v0, p0, Lgb/y2;->o:Lgb/y2$y;

    invoke-virtual {p0}, Lgb/y2;->b()Z

    move-result v0

    if-nez v0, :cond_2

    monitor-exit v4

    return-void

    :cond_2
    new-instance v0, Lgb/y2$o;

    invoke-direct {v0, p0}, Lgb/y2$o;-><init>(Lgb/y2;)V

    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lgb/y2;->c:Leb/h1;

    invoke-virtual {p1, v0}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    if-nez v2, :cond_4

    iget-object v0, p1, Lgb/y2$a0;->a:Lgb/s;

    new-instance v1, Lgb/y2$z;

    invoke-direct {v1, p0, p1}, Lgb/y2$z;-><init>(Lgb/y2;Lgb/y2$a0;)V

    invoke-interface {v0, v1}, Lgb/s;->l(Lgb/t;)V

    :cond_4
    iget-object v0, p1, Lgb/y2$a0;->a:Lgb/s;

    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v1, v1, Lgb/y2$y;->f:Lgb/y2$a0;

    if-ne v1, p1, :cond_5

    iget-object p1, p0, Lgb/y2;->y:Leb/e1;

    goto :goto_2

    :cond_5
    sget-object p1, Lgb/y2;->C:Leb/e1;

    :goto_2
    invoke-interface {v0, p1}, Lgb/s;->n(Leb/e1;)V

    return-void

    :cond_6
    :try_start_1
    iget-boolean v6, p1, Lgb/y2$a0;->b:Z

    if-eqz v6, :cond_7

    monitor-exit v4

    return-void

    :cond_7
    add-int/lit16 v6, v1, 0x80

    iget-object v7, v5, Lgb/y2$y;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-nez v3, :cond_8

    new-instance v3, Ljava/util/ArrayList;

    iget-object v5, v5, Lgb/y2$y;->b:Ljava/util/List;

    invoke-interface {v5, v1, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_3

    :cond_8
    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v5, v5, Lgb/y2$y;->b:Ljava/util/List;

    invoke-interface {v5, v1, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgb/y2$q;

    invoke-interface {v4, p1}, Lgb/y2$q;->a(Lgb/y2$a0;)V

    instance-of v4, v4, Lgb/y2$x;

    if-eqz v4, :cond_a

    const/4 v2, 0x1

    :cond_a
    iget-object v4, p0, Lgb/y2;->o:Lgb/y2$y;

    iget-object v5, v4, Lgb/y2$y;->f:Lgb/y2$a0;

    if-eqz v5, :cond_b

    if-eq v5, p1, :cond_b

    goto :goto_4

    :cond_b
    iget-boolean v4, v4, Lgb/y2$y;->g:Z

    if-eqz v4, :cond_9

    :cond_c
    :goto_4
    move v1, v6

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final u()V
    .locals 13

    .line 1
    iget-object v0, p0, Lgb/y2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgb/y2;->w:Lgb/y2$t;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    iput-boolean v3, v1, Lgb/y2$t;->c:Z

    .line 11
    .line 12
    iget-object v1, v1, Lgb/y2$t;->b:Ljava/util/concurrent/Future;

    .line 13
    .line 14
    iput-object v2, p0, Lgb/y2;->w:Lgb/y2$t;

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    :cond_0
    iget-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 18
    .line 19
    iget-boolean v3, v1, Lgb/y2$y;->h:Z

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v3, Lgb/y2$y;

    .line 25
    .line 26
    iget-object v5, v1, Lgb/y2$y;->b:Ljava/util/List;

    .line 27
    .line 28
    iget-object v6, v1, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 29
    .line 30
    iget-object v7, v1, Lgb/y2$y;->d:Ljava/util/Collection;

    .line 31
    .line 32
    iget-object v8, v1, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 33
    .line 34
    iget-boolean v9, v1, Lgb/y2$y;->g:Z

    .line 35
    .line 36
    iget-boolean v10, v1, Lgb/y2$y;->a:Z

    .line 37
    .line 38
    const/4 v11, 0x1

    .line 39
    iget v12, v1, Lgb/y2$y;->e:I

    .line 40
    .line 41
    move-object v4, v3

    .line 42
    invoke-direct/range {v4 .. v12}, Lgb/y2$y;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lgb/y2$a0;ZZZI)V

    .line 43
    .line 44
    .line 45
    move-object v1, v3

    .line 46
    :goto_0
    iput-object v1, p0, Lgb/y2;->o:Lgb/y2$y;

    .line 47
    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void

    .line 56
    :catchall_0
    move-exception v1

    .line 57
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v1
    .line 59
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

.method public final v(Lgb/y2$y;)Z
    .locals 2

    iget-object v0, p1, Lgb/y2$y;->f:Lgb/y2$a0;

    if-nez v0, :cond_0

    iget v0, p1, Lgb/y2$y;->e:I

    iget-object v1, p0, Lgb/y2;->g:Lgb/x0;

    iget v1, v1, Lgb/x0;->a:I

    if-ge v0, v1, :cond_0

    iget-boolean p1, p1, Lgb/y2$y;->h:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract w(Leb/s0;Lgb/y2$n;IZ)Lgb/s;
.end method

.method public abstract x()V
.end method

.method public abstract y()Leb/e1;
.end method

.method public final z(Leb/e1;Lgb/t$a;Leb/s0;)V
    .locals 2

    new-instance v0, Lgb/y2$w;

    invoke-direct {v0, p1, p2, p3}, Lgb/y2$w;-><init>(Leb/e1;Lgb/t$a;Leb/s0;)V

    iput-object v0, p0, Lgb/y2;->s:Lgb/y2$w;

    iget-object v0, p0, Lgb/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lgb/y2;->c:Leb/h1;

    new-instance v1, Lgb/y2$p;

    invoke-direct {v1, p0, p1, p2, p3}, Lgb/y2$p;-><init>(Lgb/y2;Leb/e1;Lgb/t$a;Leb/s0;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
