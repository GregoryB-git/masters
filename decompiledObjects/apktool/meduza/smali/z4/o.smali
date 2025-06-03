.class public final Lz4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/r;
.implements Lz4/r$a;


# instance fields
.field public final a:Lz4/t$b;

.field public final b:J

.field public final c:Lt5/b;

.field public d:Lz4/t;

.field public e:Lz4/r;

.field public f:Lz4/r$a;

.field public o:J


# direct methods
.method public constructor <init>(Lz4/t$b;Lt5/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/o;->a:Lz4/t$b;

    iput-object p2, p0, Lz4/o;->c:Lt5/b;

    iput-wide p3, p0, Lz4/o;->b:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lz4/o;->o:J

    return-void
.end method


# virtual methods
.method public final a(Lz4/d0;)V
    .locals 1

    check-cast p1, Lz4/r;

    iget-object p1, p0, Lz4/o;->f:Lz4/r$a;

    sget v0, Lv5/e0;->a:I

    invoke-interface {p1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    return-void
.end method

.method public final b(Lz4/r;)V
    .locals 1

    iget-object p1, p0, Lz4/o;->f:Lz4/r$a;

    sget v0, Lv5/e0;->a:I

    invoke-interface {p1, p0}, Lz4/r$a;->b(Lz4/r;)V

    return-void
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0}, Lz4/r;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Z
    .locals 1

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lz4/r;->d(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e(JLv3/n1;)J
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2, p3}, Lz4/r;->e(JLv3/n1;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f(J)J
    .locals 4

    iget-wide v0, p0, Lz4/o;->o:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method

.method public final g()J
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0}, Lz4/r;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(J)V
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2}, Lz4/r;->h(J)V

    return-void
.end method

.method public final i([Lr5/h;[Z[Lz4/c0;[ZJ)J
    .locals 13

    move-object v0, p0

    iget-wide v1, v0, Lz4/o;->o:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lz4/o;->b:J

    cmp-long v5, p5, v5

    if-nez v5, :cond_0

    iput-wide v3, v0, Lz4/o;->o:J

    move-wide v11, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p5

    :goto_0
    iget-object v6, v0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-interface/range {v6 .. v12}, Lz4/r;->i([Lr5/h;[Z[Lz4/c0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz4/r;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz4/r;->j()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz4/o;->d:Lz4/t;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lz4/t;->h()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    throw v0
.end method

.method public final l(J)J
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2}, Lz4/r;->l(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final n(Lz4/r$a;J)V
    .locals 4

    .line 1
    iput-object p1, p0, Lz4/o;->f:Lz4/r$a;

    .line 2
    .line 3
    iget-object p1, p0, Lz4/o;->e:Lz4/r;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-wide p2, p0, Lz4/o;->b:J

    .line 8
    .line 9
    iget-wide v0, p0, Lz4/o;->o:J

    .line 10
    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v2, v0, v2

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    move-wide p2, v0

    .line 21
    :cond_0
    invoke-interface {p1, p0, p2, p3}, Lz4/r;->n(Lz4/r$a;J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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

.method public final o()J
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0}, Lz4/r;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Lz4/j0;
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0}, Lz4/r;->q()Lz4/j0;

    move-result-object v0

    return-object v0
.end method

.method public final s(JZ)V
    .locals 2

    iget-object v0, p0, Lz4/o;->e:Lz4/r;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2, p3}, Lz4/r;->s(JZ)V

    return-void
.end method
