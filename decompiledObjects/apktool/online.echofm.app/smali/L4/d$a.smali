.class public LL4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final k:LF4/a;

.field public static final l:J


# instance fields
.field public final a:LM4/a;

.field public final b:Z

.field public c:LM4/l;

.field public d:LM4/i;

.field public e:J

.field public f:D

.field public g:LM4/i;

.field public h:LM4/i;

.field public i:J

.field public j:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LL4/d$a;->k:LF4/a;

    .line 6
    .line 7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-wide/16 v1, 0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, LL4/d$a;->l:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(LM4/i;JLM4/a;LC4/a;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, LL4/d$a;->a:LM4/a;

    .line 5
    .line 6
    iput-wide p2, p0, LL4/d$a;->e:J

    .line 7
    .line 8
    iput-object p1, p0, LL4/d$a;->d:LM4/i;

    .line 9
    .line 10
    long-to-double p1, p2

    .line 11
    iput-wide p1, p0, LL4/d$a;->f:D

    .line 12
    .line 13
    invoke-virtual {p4}, LM4/a;->a()LM4/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LL4/d$a;->c:LM4/l;

    .line 18
    .line 19
    invoke-virtual {p0, p5, p6, p7}, LL4/d$a;->g(LC4/a;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iput-boolean p7, p0, LL4/d$a;->b:Z

    .line 23
    .line 24
    return-void
.end method

.method public static c(LC4/a;Ljava/lang/String;)J
    .locals 1

    .line 1
    const-string v0, "Trace"

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LC4/a;->E()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, LC4/a;->q()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public static d(LC4/a;Ljava/lang/String;)J
    .locals 1

    .line 1
    const-string v0, "Trace"

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LC4/a;->t()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, LC4/a;->t()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public static e(LC4/a;Ljava/lang/String;)J
    .locals 1

    .line 1
    const-string v0, "Trace"

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LC4/a;->F()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, LC4/a;->r()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public static f(LC4/a;Ljava/lang/String;)J
    .locals 1

    .line 1
    const-string v0, "Trace"

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LC4/a;->t()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, LC4/a;->t()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method


# virtual methods
.method public declared-synchronized a(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, LL4/d$a;->g:LM4/i;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iget-object v0, p0, LL4/d$a;->h:LM4/i;

    .line 10
    .line 11
    :goto_0
    iput-object v0, p0, LL4/d$a;->d:LM4/i;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-wide v0, p0, LL4/d$a;->i:J

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-wide v0, p0, LL4/d$a;->j:J

    .line 19
    .line 20
    :goto_1
    iput-wide v0, p0, LL4/d$a;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_2
    monitor-exit p0

    .line 25
    throw p1
.end method

.method public declared-synchronized b(LN4/i;)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, LL4/d$a;->a:LM4/a;

    .line 3
    .line 4
    invoke-virtual {p1}, LM4/a;->a()LM4/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, LL4/d$a;->c:LM4/l;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LM4/l;->d(LM4/l;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-double v0, v0

    .line 15
    iget-object v2, p0, LL4/d$a;->d:LM4/i;

    .line 16
    .line 17
    invoke-virtual {v2}, LM4/i;->a()D

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    mul-double/2addr v0, v2

    .line 22
    sget-wide v2, LL4/d$a;->l:J

    .line 23
    .line 24
    long-to-double v2, v2

    .line 25
    div-double/2addr v0, v2

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmpl-double v2, v0, v2

    .line 29
    .line 30
    if-lez v2, :cond_0

    .line 31
    .line 32
    iget-wide v2, p0, LL4/d$a;->f:D

    .line 33
    .line 34
    add-double/2addr v2, v0

    .line 35
    iget-wide v0, p0, LL4/d$a;->e:J

    .line 36
    .line 37
    long-to-double v0, v0

    .line 38
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, LL4/d$a;->f:D

    .line 43
    .line 44
    iput-object p1, p0, LL4/d$a;->c:LM4/l;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iget-wide v0, p0, LL4/d$a;->f:D

    .line 50
    .line 51
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 52
    .line 53
    cmpl-double p1, v0, v2

    .line 54
    .line 55
    if-ltz p1, :cond_1

    .line 56
    .line 57
    sub-double/2addr v0, v2

    .line 58
    iput-wide v0, p0, LL4/d$a;->f:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_1
    :try_start_1
    iget-boolean p1, p0, LL4/d$a;->b:Z

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    sget-object p1, LL4/d$a;->k:LF4/a;

    .line 68
    .line 69
    const-string v0, "Exceeded log rate limit, dropping the log."

    .line 70
    .line 71
    invoke-virtual {p1, v0}, LF4/a;->j(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    :cond_2
    monitor-exit p0

    .line 75
    const/4 p1, 0x0

    .line 76
    return p1

    .line 77
    :goto_1
    monitor-exit p0

    .line 78
    throw p1
.end method

.method public final g(LC4/a;Ljava/lang/String;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x3

    .line 7
    invoke-static/range {p1 .. p2}, LL4/d$a;->f(LC4/a;Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    invoke-static/range {p1 .. p2}, LL4/d$a;->e(LC4/a;Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v11

    .line 15
    new-instance v13, LM4/i;

    .line 16
    .line 17
    sget-object v19, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    move-object v5, v13

    .line 20
    move-wide v6, v11

    .line 21
    move-object/from16 v10, v19

    .line 22
    .line 23
    invoke-direct/range {v5 .. v10}, LM4/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    .line 24
    .line 25
    .line 26
    iput-object v13, v0, LL4/d$a;->g:LM4/i;

    .line 27
    .line 28
    iput-wide v11, v0, LL4/d$a;->i:J

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    sget-object v5, LL4/d$a;->k:LF4/a;

    .line 33
    .line 34
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-array v7, v4, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object p2, v7, v3

    .line 41
    .line 42
    aput-object v13, v7, v2

    .line 43
    .line 44
    aput-object v6, v7, v1

    .line 45
    .line 46
    const-string v6, "Foreground %s logging rate:%f, burst capacity:%d"

    .line 47
    .line 48
    invoke-virtual {v5, v6, v7}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-static/range {p1 .. p2}, LL4/d$a;->d(LC4/a;Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v17

    .line 55
    invoke-static/range {p1 .. p2}, LL4/d$a;->c(LC4/a;Ljava/lang/String;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    new-instance v7, LM4/i;

    .line 60
    .line 61
    move-object v14, v7

    .line 62
    move-wide v15, v5

    .line 63
    invoke-direct/range {v14 .. v19}, LM4/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    .line 64
    .line 65
    .line 66
    iput-object v7, v0, LL4/d$a;->h:LM4/i;

    .line 67
    .line 68
    iput-wide v5, v0, LL4/d$a;->j:J

    .line 69
    .line 70
    if-eqz p3, :cond_1

    .line 71
    .line 72
    sget-object v8, LL4/d$a;->k:LF4/a;

    .line 73
    .line 74
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    new-array v4, v4, [Ljava/lang/Object;

    .line 79
    .line 80
    aput-object p2, v4, v3

    .line 81
    .line 82
    aput-object v7, v4, v2

    .line 83
    .line 84
    aput-object v5, v4, v1

    .line 85
    .line 86
    const-string v1, "Background %s logging rate:%f, capacity:%d"

    .line 87
    .line 88
    invoke-virtual {v8, v1, v4}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void
.end method
