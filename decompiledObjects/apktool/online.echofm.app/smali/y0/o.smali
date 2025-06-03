.class public final Ly0/o;
.super Ly0/a;
.source "SourceFile"


# instance fields
.field public final o:I

.field public final p:Ld0/q;

.field public q:J

.field public r:Z


# direct methods
.method public constructor <init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJILd0/q;)V
    .locals 16

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p0

    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    move-object/from16 v3, p3

    .line 20
    .line 21
    move/from16 v4, p4

    .line 22
    .line 23
    move-object/from16 v5, p5

    .line 24
    .line 25
    move-wide/from16 v6, p6

    .line 26
    .line 27
    move-wide/from16 v8, p8

    .line 28
    .line 29
    move-wide/from16 v14, p10

    .line 30
    .line 31
    invoke-direct/range {v0 .. v15}, Ly0/a;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJJJ)V

    .line 32
    .line 33
    .line 34
    move/from16 v1, p12

    .line 35
    .line 36
    iput v1, v0, Ly0/o;->o:I

    .line 37
    .line 38
    move-object/from16 v1, p13

    .line 39
    .line 40
    iput-object v1, v0, Ly0/o;->p:Ld0/q;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public b()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ly0/a;->j()Ly0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ly0/c;->c(J)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Ly0/o;->o:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Ly0/c;->a(II)LF0/T;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v0, p0, Ly0/o;->p:Ld0/q;

    .line 18
    .line 19
    invoke-interface {v3, v0}, LF0/T;->d(Ld0/q;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Ly0/e;->b:Li0/k;

    .line 23
    .line 24
    iget-wide v4, p0, Ly0/o;->q:J

    .line 25
    .line 26
    invoke-virtual {v0, v4, v5}, Li0/k;->e(J)Li0/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Ly0/e;->i:Li0/x;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Li0/x;->e(Li0/k;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    cmp-long v4, v0, v4

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    iget-wide v4, p0, Ly0/o;->q:J

    .line 43
    .line 44
    add-long/2addr v0, v4

    .line 45
    :cond_0
    move-wide v8, v0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_2

    .line 49
    :goto_0
    new-instance v0, LF0/j;

    .line 50
    .line 51
    iget-object v5, p0, Ly0/e;->i:Li0/x;

    .line 52
    .line 53
    iget-wide v6, p0, Ly0/o;->q:J

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    invoke-direct/range {v4 .. v9}, LF0/j;-><init>(Ld0/i;JJ)V

    .line 57
    .line 58
    .line 59
    :goto_1
    const/4 v1, -0x1

    .line 60
    const/4 v10, 0x1

    .line 61
    if-eq v2, v1, :cond_1

    .line 62
    .line 63
    iget-wide v4, p0, Ly0/o;->q:J

    .line 64
    .line 65
    int-to-long v1, v2

    .line 66
    add-long/2addr v4, v1

    .line 67
    iput-wide v4, p0, Ly0/o;->q:J

    .line 68
    .line 69
    const v1, 0x7fffffff

    .line 70
    .line 71
    .line 72
    invoke-interface {v3, v0, v1, v10}, LF0/T;->f(Ld0/i;IZ)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-wide v0, p0, Ly0/o;->q:J

    .line 78
    .line 79
    long-to-int v7, v0

    .line 80
    iget-wide v4, p0, Ly0/e;->g:J

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v6, 0x1

    .line 85
    invoke-interface/range {v3 .. v9}, LF0/T;->b(JIIILF0/T$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Ly0/e;->i:Li0/x;

    .line 89
    .line 90
    invoke-static {v0}, Li0/j;->a(Li0/g;)V

    .line 91
    .line 92
    .line 93
    iput-boolean v10, p0, Ly0/o;->r:Z

    .line 94
    .line 95
    return-void

    .line 96
    :goto_2
    iget-object v1, p0, Ly0/e;->i:Li0/x;

    .line 97
    .line 98
    invoke-static {v1}, Li0/j;->a(Li0/g;)V

    .line 99
    .line 100
    .line 101
    throw v0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly0/o;->r:Z

    .line 2
    .line 3
    return v0
.end method
