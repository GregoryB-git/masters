.class public final Lcom/google/android/exoplayer2/source/dash/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lb5/f;

.field public final b:Ld5/j;

.field public final c:Ld5/b;

.field public final d:Lc5/c;

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    iput-wide p6, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    return-void
.end method


# virtual methods
.method public final a(JLd5/j;)Lcom/google/android/exoplayer2/source/dash/c$b;
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    invoke-virtual {v1}, Ld5/j;->l()Lc5/c;

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, Ld5/j;->l()Lc5/c;

    move-result-object v10

    if-nez v9, :cond_0

    new-instance v10, Lcom/google/android/exoplayer2/source/dash/c$b;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    iget-wide v7, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    move-object v1, v10

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    return-object v10

    :cond_0
    invoke-interface {v9}, Lc5/c;->h()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v11, Lcom/google/android/exoplayer2/source/dash/c$b;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    iget-wide v7, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    move-object v1, v11

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object v9, v10

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    return-object v11

    :cond_1
    invoke-interface {v9, v2, v3}, Lc5/c;->j(J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_2

    new-instance v11, Lcom/google/android/exoplayer2/source/dash/c$b;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    iget-wide v7, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    move-object v1, v11

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object v9, v10

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    return-object v11

    :cond_2
    invoke-interface {v9}, Lc5/c;->i()J

    move-result-wide v6

    invoke-interface {v9, v6, v7}, Lc5/c;->a(J)J

    move-result-wide v11

    add-long/2addr v4, v6

    const-wide/16 v13, 0x1

    sub-long/2addr v4, v13

    invoke-interface {v9, v4, v5}, Lc5/c;->a(J)J

    move-result-wide v15

    invoke-interface {v9, v4, v5, v2, v3}, Lc5/c;->b(JJ)J

    move-result-wide v17

    add-long v17, v17, v15

    invoke-interface {v10}, Lc5/c;->i()J

    move-result-wide v13

    move-object v1, v9

    invoke-interface {v10, v13, v14}, Lc5/c;->a(J)J

    move-result-wide v8

    move-wide/from16 v19, v6

    iget-wide v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    cmp-long v17, v17, v8

    if-nez v17, :cond_3

    const-wide/16 v15, 0x1

    add-long/2addr v4, v15

    :goto_0
    sub-long/2addr v4, v13

    add-long/2addr v4, v6

    move-wide v7, v4

    goto :goto_1

    :cond_3
    if-ltz v17, :cond_5

    cmp-long v4, v8, v11

    if-gez v4, :cond_4

    invoke-interface {v10, v11, v12, v2, v3}, Lc5/c;->g(JJ)J

    move-result-wide v4

    sub-long v4, v4, v19

    sub-long/2addr v6, v4

    move-wide v7, v6

    goto :goto_1

    :cond_4
    invoke-interface {v1, v8, v9, v2, v3}, Lc5/c;->g(JJ)J

    move-result-wide v4

    goto :goto_0

    :goto_1
    new-instance v11, Lcom/google/android/exoplayer2/source/dash/c$b;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    move-object v1, v11

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object v9, v10

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    return-object v11

    :cond_5
    new-instance v1, Lz4/b;

    invoke-direct {v1}, Lz4/b;-><init>()V

    throw v1
.end method

.method public final b(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 4
    .line 5
    invoke-interface {v0, v1, v2, p1, p2}, Lc5/c;->d(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 13
    .line 14
    iget-wide v3, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 15
    .line 16
    invoke-interface {v2, v3, v4, p1, p2}, Lc5/c;->k(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    add-long/2addr p1, v0

    .line 21
    const-wide/16 v0, 0x1

    .line 22
    .line 23
    sub-long/2addr p1, v0

    .line 24
    return-wide p1
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
.end method

.method public final c(J)J
    .locals 5

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    iget-wide v3, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    sub-long/2addr p1, v3

    iget-wide v3, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    invoke-interface {v2, p1, p2, v3, v4}, Lc5/c;->b(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final d(J)J
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lc5/c;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e(JJ)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    invoke-interface {v0}, Lc5/c;->h()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, v2

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/c$b;->c(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method
