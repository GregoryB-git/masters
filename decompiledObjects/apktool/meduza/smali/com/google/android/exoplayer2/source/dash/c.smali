.class public final Lcom/google/android/exoplayer2/source/dash/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/dash/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/c$b;,
        Lcom/google/android/exoplayer2/source/dash/c$c;,
        Lcom/google/android/exoplayer2/source/dash/c$a;
    }
.end annotation


# instance fields
.field public final a:Lt5/e0;

.field public final b:Lc5/a;

.field public final c:[I

.field public final d:I

.field public final e:Lt5/k;

.field public final f:J

.field public final g:Lcom/google/android/exoplayer2/source/dash/d$c;

.field public final h:[Lcom/google/android/exoplayer2/source/dash/c$b;

.field public i:Lr5/h;

.field public j:Ld5/c;

.field public k:I

.field public l:Lz4/b;

.field public m:Z


# direct methods
.method public constructor <init>(Lt5/e0;Ld5/c;Lc5/a;I[ILr5/h;ILt5/k;JZLjava/util/ArrayList;Lcom/google/android/exoplayer2/source/dash/d$c;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, p1

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c;->a:Lt5/e0;

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->b:Lc5/a;

    move-object/from16 v6, p5

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c;->c:[I

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    iput v5, v0, Lcom/google/android/exoplayer2/source/dash/c;->d:I

    move-object/from16 v6, p8

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c;->e:Lt5/k;

    iput v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    move-wide/from16 v6, p9

    iput-wide v6, v0, Lcom/google/android/exoplayer2/source/dash/c;->f:J

    move-object/from16 v12, p13

    iput-object v12, v0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/d$c;

    invoke-virtual {v1, v3}, Ld5/c;->e(I)J

    move-result-wide v22

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/c;->l()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, Lr5/k;->length()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/exoplayer2/source/dash/c$b;

    iput-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    const/4 v3, 0x0

    move v14, v3

    :goto_0
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    array-length v6, v6

    if-ge v14, v6, :cond_7

    invoke-interface {v4, v14}, Lr5/k;->c(I)I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Ld5/j;

    iget-object v6, v15, Ld5/j;->b:Lo7/t;

    invoke-virtual {v2, v6}, Lc5/a;->d(Lo7/t;)Ld5/b;

    move-result-object v6

    iget-object v13, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    new-instance v24, Lcom/google/android/exoplayer2/source/dash/c$b;

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    iget-object v6, v15, Ld5/j;->b:Lo7/t;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld5/b;

    :goto_1
    move-object/from16 v17, v6

    iget-object v11, v15, Ld5/j;->a:Lv3/i0;

    .line 1
    iget-object v6, v11, Lv3/i0;->s:Ljava/lang/String;

    invoke-static {v6}, Lv5/p;->l(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v6, 0x0

    move-object/from16 v18, v6

    goto/16 :goto_7

    :cond_1
    const/4 v7, 0x1

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "video/webm"

    .line 2
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "audio/webm"

    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "application/webm"

    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "video/x-matroska"

    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "audio/x-matroska"

    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "application/x-matroska"

    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move v6, v3

    goto :goto_4

    :cond_4
    :goto_3
    move v6, v7

    :goto_4
    if-eqz v6, :cond_5

    .line 3
    new-instance v6, Li4/d;

    invoke-direct {v6, v7}, Li4/d;-><init>(I)V

    move-object v3, v11

    goto :goto_6

    :cond_5
    if-eqz p11, :cond_6

    const/4 v6, 0x4

    move v7, v6

    goto :goto_5

    :cond_6
    move v7, v3

    :goto_5
    new-instance v16, Lk4/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v16

    move-object/from16 v10, p12

    move-object v3, v11

    move-object/from16 v11, p13

    invoke-direct/range {v6 .. v11}, Lk4/e;-><init>(ILv5/c0;Lk4/j;Ljava/util/List;Lc4/v;)V

    :goto_6
    new-instance v7, Lb5/d;

    invoke-direct {v7, v6, v5, v3}, Lb5/d;-><init>(Lc4/h;ILv3/i0;)V

    move-object/from16 v18, v7

    :goto_7
    const-wide/16 v19, 0x0

    .line 4
    invoke-virtual {v15}, Ld5/j;->l()Lc5/c;

    move-result-object v21

    move-object v3, v13

    move-object/from16 v13, v24

    move v6, v14

    move-object v7, v15

    move-wide/from16 v14, v22

    move-object/from16 v16, v7

    invoke-direct/range {v13 .. v21}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    aput-object v24, v3, v6

    add-int/lit8 v14, v6, 0x1

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_7
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->a:Lt5/e0;

    invoke-interface {v0}, Lt5/e0;->a()V

    return-void

    :cond_0
    throw v0
.end method

.method public final b(Lr5/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    return-void
.end method

.method public final d(Ld5/c;I)V
    .locals 5

    :try_start_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    iput p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    invoke-virtual {p1, p2}, Ld5/c;->e(I)J

    move-result-wide p1

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/c;->l()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    invoke-interface {v2, v1}, Lr5/k;->c(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld5/j;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    aget-object v4, v3, v1

    invoke-virtual {v4, p1, p2, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->a(JLd5/j;)Lcom/google/android/exoplayer2/source/dash/c$b;

    move-result-object v2

    aput-object v2, v3, v1
    :try_end_0
    .catch Lz4/b; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    :cond_0
    return-void
.end method

.method public final e(JLv3/n1;)J
    .locals 16

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 14
    .line 15
    if-eqz v6, :cond_3

    .line 16
    .line 17
    iget-wide v8, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 18
    .line 19
    invoke-interface {v6, v8, v9}, Lc5/c;->j(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    cmp-long v6, v8, v10

    .line 26
    .line 27
    if-nez v6, :cond_0

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    iget-object v0, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 31
    .line 32
    iget-wide v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 33
    .line 34
    invoke-interface {v0, v1, v2, v3, v4}, Lc5/c;->g(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iget-wide v10, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 39
    .line 40
    add-long/2addr v3, v10

    .line 41
    invoke-virtual {v5, v3, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    cmp-long v0, v10, v1

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    const-wide/16 v12, -0x1

    .line 50
    .line 51
    cmp-long v0, v8, v12

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-object v0, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 56
    .line 57
    invoke-interface {v0}, Lc5/c;->i()J

    .line 58
    .line 59
    .line 60
    move-result-wide v14

    .line 61
    iget-wide v12, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 62
    .line 63
    add-long/2addr v14, v12

    .line 64
    add-long/2addr v14, v8

    .line 65
    const-wide/16 v8, 0x1

    .line 66
    .line 67
    sub-long/2addr v14, v8

    .line 68
    cmp-long v0, v3, v14

    .line 69
    .line 70
    if-gez v0, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const-wide/16 v8, 0x1

    .line 74
    .line 75
    :goto_1
    add-long/2addr v3, v8

    .line 76
    invoke-virtual {v5, v3, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    move-wide v5, v3

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move-wide v5, v10

    .line 83
    :goto_2
    move-object/from16 v0, p3

    .line 84
    .line 85
    move-wide/from16 v1, p1

    .line 86
    .line 87
    move-wide v3, v10

    .line 88
    invoke-virtual/range {v0 .. v6}, Lv3/n1;->a(JJJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    return-wide v0

    .line 93
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    return-wide v1
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

.method public final f(JLb5/e;Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lb5/e;",
            "Ljava/util/List<",
            "+",
            "Lb5/m;",
            ">;)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    return p2

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    invoke-interface {p1}, Lr5/h;->h()V

    return p2
.end method

.method public final g(Lb5/e;ZLt5/c0$c;Lt5/c0;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/d$c;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p2, :cond_6

    .line 9
    .line 10
    iget-wide v2, p2, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    .line 11
    .line 12
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    iget-wide v4, p1, Lb5/e;->g:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-gez v2, :cond_1

    .line 26
    .line 27
    move v2, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v0

    .line 30
    :goto_0
    iget-object p2, p2, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    .line 31
    .line 32
    iget-object v3, p2, Lcom/google/android/exoplayer2/source/dash/d;->f:Ld5/c;

    .line 33
    .line 34
    iget-boolean v3, v3, Ld5/c;->d:Z

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-boolean v3, p2, Lcom/google/android/exoplayer2/source/dash/d;->p:Z

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    if-eqz v2, :cond_5

    .line 45
    .line 46
    iget-boolean v2, p2, Lcom/google/android/exoplayer2/source/dash/d;->o:Z

    .line 47
    .line 48
    if-nez v2, :cond_4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    iput-boolean v1, p2, Lcom/google/android/exoplayer2/source/dash/d;->p:Z

    .line 52
    .line 53
    iput-boolean v0, p2, Lcom/google/android/exoplayer2/source/dash/d;->o:Z

    .line 54
    .line 55
    iget-object p2, p2, Lcom/google/android/exoplayer2/source/dash/d;->b:Lcom/google/android/exoplayer2/source/dash/d$b;

    .line 56
    .line 57
    check-cast p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 58
    .line 59
    iget-object p2, p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;->a:Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 60
    .line 61
    iget-object v2, p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 62
    .line 63
    iget-object v3, p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lu/a;

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B()V

    .line 69
    .line 70
    .line 71
    :goto_1
    move p2, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    :goto_2
    move p2, v0

    .line 74
    :goto_3
    if-eqz p2, :cond_6

    .line 75
    .line 76
    return v1

    .line 77
    :cond_6
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    .line 78
    .line 79
    iget-boolean p2, p2, Ld5/c;->d:Z

    .line 80
    .line 81
    if-nez p2, :cond_7

    .line 82
    .line 83
    instance-of p2, p1, Lb5/m;

    .line 84
    .line 85
    if-eqz p2, :cond_7

    .line 86
    .line 87
    iget-object p2, p3, Lt5/c0$c;->a:Ljava/io/IOException;

    .line 88
    .line 89
    instance-of v2, p2, Lt5/z;

    .line 90
    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    check-cast p2, Lt5/z;

    .line 94
    .line 95
    iget p2, p2, Lt5/z;->d:I

    .line 96
    .line 97
    const/16 v2, 0x194

    .line 98
    .line 99
    if-ne p2, v2, :cond_7

    .line 100
    .line 101
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 104
    .line 105
    iget-object v3, p1, Lb5/e;->d:Lv3/i0;

    .line 106
    .line 107
    invoke-interface {v2, v3}, Lr5/k;->d(Lv3/i0;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    aget-object p2, p2, v2

    .line 112
    .line 113
    iget-object v2, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 114
    .line 115
    iget-wide v3, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 116
    .line 117
    invoke-interface {v2, v3, v4}, Lc5/c;->j(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    const-wide/16 v4, -0x1

    .line 122
    .line 123
    cmp-long v4, v2, v4

    .line 124
    .line 125
    if-eqz v4, :cond_7

    .line 126
    .line 127
    const-wide/16 v4, 0x0

    .line 128
    .line 129
    cmp-long v4, v2, v4

    .line 130
    .line 131
    if-eqz v4, :cond_7

    .line 132
    .line 133
    iget-object v4, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 134
    .line 135
    invoke-interface {v4}, Lc5/c;->i()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    iget-wide v6, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 140
    .line 141
    add-long/2addr v4, v6

    .line 142
    add-long/2addr v4, v2

    .line 143
    const-wide/16 v2, 0x1

    .line 144
    .line 145
    sub-long/2addr v4, v2

    .line 146
    move-object p2, p1

    .line 147
    check-cast p2, Lb5/m;

    .line 148
    .line 149
    invoke-virtual {p2}, Lb5/m;->c()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    cmp-long p2, v2, v4

    .line 154
    .line 155
    if-lez p2, :cond_7

    .line 156
    .line 157
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->m:Z

    .line 158
    .line 159
    return v1

    .line 160
    :cond_7
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 161
    .line 162
    iget-object v2, p1, Lb5/e;->d:Lv3/i0;

    .line 163
    .line 164
    invoke-interface {p2, v2}, Lr5/k;->d(Lv3/i0;)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 169
    .line 170
    aget-object p2, v2, p2

    .line 171
    .line 172
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->b:Lc5/a;

    .line 173
    .line 174
    iget-object v3, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 175
    .line 176
    iget-object v3, v3, Ld5/j;->b:Lo7/t;

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Lc5/a;->d(Lo7/t;)Ld5/b;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-eqz v2, :cond_8

    .line 183
    .line 184
    iget-object v3, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 185
    .line 186
    invoke-virtual {v3, v2}, Ld5/b;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_8

    .line 191
    .line 192
    return v1

    .line 193
    :cond_8
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 194
    .line 195
    iget-object v3, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 196
    .line 197
    iget-object v3, v3, Ld5/j;->b:Lo7/t;

    .line 198
    .line 199
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    invoke-interface {v2}, Lr5/k;->length()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    move v7, v0

    .line 208
    move v8, v7

    .line 209
    :goto_4
    if-ge v7, v6, :cond_a

    .line 210
    .line 211
    invoke-interface {v2, v7, v4, v5}, Lr5/h;->l(IJ)Z

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    if-eqz v9, :cond_9

    .line 216
    .line 217
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_a
    new-instance v2, Ljava/util/HashSet;

    .line 223
    .line 224
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 225
    .line 226
    .line 227
    move v4, v0

    .line 228
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-ge v4, v5, :cond_b

    .line 233
    .line 234
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, Ld5/b;

    .line 239
    .line 240
    iget v5, v5, Ld5/b;->c:I

    .line 241
    .line 242
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    add-int/lit8 v4, v4, 0x1

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_b
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    new-instance v4, Lt5/c0$a;

    .line 257
    .line 258
    iget-object v5, p0, Lcom/google/android/exoplayer2/source/dash/c;->b:Lc5/a;

    .line 259
    .line 260
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    new-instance v7, Ljava/util/HashSet;

    .line 264
    .line 265
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, v3}, Lc5/a;->b(Lo7/t;)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    move v5, v0

    .line 273
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-ge v5, v9, :cond_c

    .line 278
    .line 279
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    check-cast v9, Ld5/b;

    .line 284
    .line 285
    iget v9, v9, Ld5/b;->c:I

    .line 286
    .line 287
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    add-int/lit8 v5, v5, 0x1

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_c
    invoke-virtual {v7}, Ljava/util/HashSet;->size()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    sub-int v3, v2, v3

    .line 302
    .line 303
    invoke-direct {v4, v2, v3, v6, v8}, Lt5/c0$a;-><init>(IIII)V

    .line 304
    .line 305
    .line 306
    const/4 v2, 0x2

    .line 307
    invoke-virtual {v4, v2}, Lt5/c0$a;->a(I)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-nez v3, :cond_d

    .line 312
    .line 313
    invoke-virtual {v4, v1}, Lt5/c0$a;->a(I)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_d

    .line 318
    .line 319
    return v0

    .line 320
    :cond_d
    check-cast p4, Lt5/u;

    .line 321
    .line 322
    invoke-virtual {p4, v4, p3}, Lt5/u;->a(Lt5/c0$a;Lt5/c0$c;)Lt5/c0$b;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    if-eqz p3, :cond_11

    .line 327
    .line 328
    iget p4, p3, Lt5/c0$b;->a:I

    .line 329
    .line 330
    invoke-virtual {v4, p4}, Lt5/c0$a;->a(I)Z

    .line 331
    .line 332
    .line 333
    move-result p4

    .line 334
    if-nez p4, :cond_e

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_e
    iget p4, p3, Lt5/c0$b;->a:I

    .line 338
    .line 339
    if-ne p4, v2, :cond_f

    .line 340
    .line 341
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 342
    .line 343
    iget-object p1, p1, Lb5/e;->d:Lv3/i0;

    .line 344
    .line 345
    invoke-interface {p2, p1}, Lr5/k;->d(Lv3/i0;)I

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    iget-wide p3, p3, Lt5/c0$b;->b:J

    .line 350
    .line 351
    invoke-interface {p2, p1, p3, p4}, Lr5/h;->k(IJ)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    goto :goto_7

    .line 356
    :cond_f
    if-ne p4, v1, :cond_11

    .line 357
    .line 358
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->b:Lc5/a;

    .line 359
    .line 360
    iget-object p2, p2, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 361
    .line 362
    iget-wide p3, p3, Lt5/c0$b;->b:J

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 368
    .line 369
    .line 370
    move-result-wide v2

    .line 371
    add-long/2addr v2, p3

    .line 372
    iget-object p3, p2, Ld5/b;->b:Ljava/lang/String;

    .line 373
    .line 374
    iget-object p4, p1, Lc5/a;->a:Ljava/util/HashMap;

    .line 375
    .line 376
    invoke-static {p3, v2, v3, p4}, Lc5/a;->a(Ljava/lang/Object;JLjava/util/HashMap;)V

    .line 377
    .line 378
    .line 379
    iget p2, p2, Ld5/b;->c:I

    .line 380
    .line 381
    const/high16 p3, -0x80000000

    .line 382
    .line 383
    if-eq p2, p3, :cond_10

    .line 384
    .line 385
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    iget-object p1, p1, Lc5/a;->b:Ljava/util/HashMap;

    .line 390
    .line 391
    invoke-static {p2, v2, v3, p1}, Lc5/a;->a(Ljava/lang/Object;JLjava/util/HashMap;)V

    .line 392
    .line 393
    .line 394
    :cond_10
    move v0, v1

    .line 395
    :cond_11
    :goto_7
    return v0
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final h(JLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lb5/m;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    invoke-interface {v0}, Lr5/k;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    invoke-interface {v0, p1, p2, p3}, Lr5/h;->n(JLjava/util/List;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final i(JJLjava/util/List;Lb5/g;)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "+",
            "Lb5/m;",
            ">;",
            "Lb5/g;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sub-long v6, v1, p1

    .line 13
    .line 14
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    .line 15
    .line 16
    iget-wide v4, v4, Ld5/c;->a:J

    .line 17
    .line 18
    invoke-static {v4, v5}, Lv5/e0;->I(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    .line 23
    .line 24
    iget v9, v0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 25
    .line 26
    invoke-virtual {v8, v9}, Ld5/c;->b(I)Ld5/g;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    iget-wide v8, v8, Ld5/g;->b:J

    .line 31
    .line 32
    invoke-static {v8, v9}, Lv5/e0;->I(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    add-long/2addr v8, v4

    .line 37
    add-long/2addr v8, v1

    .line 38
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/d$c;

    .line 39
    .line 40
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/4 v14, 0x1

    .line 46
    const/4 v15, 0x0

    .line 47
    if-eqz v4, :cond_8

    .line 48
    .line 49
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    .line 50
    .line 51
    iget-object v5, v4, Lcom/google/android/exoplayer2/source/dash/d;->f:Ld5/c;

    .line 52
    .line 53
    iget-boolean v10, v5, Ld5/c;->d:Z

    .line 54
    .line 55
    if-nez v10, :cond_1

    .line 56
    .line 57
    move v5, v15

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-boolean v10, v4, Lcom/google/android/exoplayer2/source/dash/d;->p:Z

    .line 60
    .line 61
    if-eqz v10, :cond_2

    .line 62
    .line 63
    move v5, v14

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-wide v10, v5, Ld5/c;->h:J

    .line 66
    .line 67
    iget-object v5, v4, Lcom/google/android/exoplayer2/source/dash/d;->e:Ljava/util/TreeMap;

    .line 68
    .line 69
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v5, v10}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    check-cast v10, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v10

    .line 89
    cmp-long v8, v10, v8

    .line 90
    .line 91
    if-gez v8, :cond_5

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v8

    .line 103
    iget-object v5, v4, Lcom/google/android/exoplayer2/source/dash/d;->b:Lcom/google/android/exoplayer2/source/dash/d$b;

    .line 104
    .line 105
    check-cast v5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 106
    .line 107
    iget-object v5, v5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;->a:Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 108
    .line 109
    iget-wide v10, v5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:J

    .line 110
    .line 111
    cmp-long v16, v10, v12

    .line 112
    .line 113
    if-eqz v16, :cond_3

    .line 114
    .line 115
    cmp-long v10, v10, v8

    .line 116
    .line 117
    if-gez v10, :cond_4

    .line 118
    .line 119
    :cond_3
    iput-wide v8, v5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:J

    .line 120
    .line 121
    :cond_4
    move v5, v14

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    move v5, v15

    .line 124
    :goto_0
    if-eqz v5, :cond_7

    .line 125
    .line 126
    iget-boolean v8, v4, Lcom/google/android/exoplayer2/source/dash/d;->o:Z

    .line 127
    .line 128
    if-nez v8, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    iput-boolean v14, v4, Lcom/google/android/exoplayer2/source/dash/d;->p:Z

    .line 132
    .line 133
    iput-boolean v15, v4, Lcom/google/android/exoplayer2/source/dash/d;->o:Z

    .line 134
    .line 135
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/dash/d;->b:Lcom/google/android/exoplayer2/source/dash/d$b;

    .line 136
    .line 137
    check-cast v4, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 138
    .line 139
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;->a:Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 140
    .line 141
    iget-object v8, v4, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 142
    .line 143
    iget-object v9, v4, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lu/a;

    .line 144
    .line 145
    invoke-virtual {v8, v9}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B()V

    .line 149
    .line 150
    .line 151
    :cond_7
    :goto_1
    if-eqz v5, :cond_8

    .line 152
    .line 153
    return-void

    .line 154
    :cond_8
    iget-wide v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->f:J

    .line 155
    .line 156
    invoke-static {v4, v5}, Lv5/e0;->u(J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    invoke-static {v4, v5}, Lv5/e0;->I(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v10

    .line 164
    invoke-virtual {v0, v10, v11}, Lcom/google/android/exoplayer2/source/dash/c;->k(J)J

    .line 165
    .line 166
    .line 167
    move-result-wide v8

    .line 168
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    if-eqz v4, :cond_9

    .line 175
    .line 176
    move-object/from16 v5, p5

    .line 177
    .line 178
    move-object/from16 v4, v16

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_9
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    sub-int/2addr v4, v14

    .line 186
    move-object/from16 v5, p5

    .line 187
    .line 188
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    check-cast v4, Lb5/m;

    .line 193
    .line 194
    :goto_2
    iget-object v14, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 195
    .line 196
    invoke-interface {v14}, Lr5/k;->length()I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    new-array v12, v14, [Lb5/n;

    .line 201
    .line 202
    move v13, v15

    .line 203
    :goto_3
    if-ge v13, v14, :cond_d

    .line 204
    .line 205
    iget-object v15, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 206
    .line 207
    aget-object v15, v15, v13

    .line 208
    .line 209
    iget-object v5, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 210
    .line 211
    if-nez v5, :cond_a

    .line 212
    .line 213
    sget-object v5, Lb5/n;->a:Lb5/n$a;

    .line 214
    .line 215
    aput-object v5, v12, v13

    .line 216
    .line 217
    move-object/from16 v28, v4

    .line 218
    .line 219
    move-wide/from16 v20, v6

    .line 220
    .line 221
    move-wide/from16 v18, v8

    .line 222
    .line 223
    move v7, v14

    .line 224
    goto :goto_5

    .line 225
    :cond_a
    move-wide/from16 v18, v8

    .line 226
    .line 227
    iget-wide v8, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 228
    .line 229
    invoke-interface {v5, v8, v9, v10, v11}, Lc5/c;->d(JJ)J

    .line 230
    .line 231
    .line 232
    move-result-wide v8

    .line 233
    move-wide/from16 v20, v6

    .line 234
    .line 235
    iget-wide v5, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 236
    .line 237
    add-long/2addr v8, v5

    .line 238
    invoke-virtual {v15, v10, v11}, Lcom/google/android/exoplayer2/source/dash/c$b;->b(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    if-eqz v4, :cond_b

    .line 243
    .line 244
    invoke-virtual {v4}, Lb5/m;->c()J

    .line 245
    .line 246
    .line 247
    move-result-wide v22

    .line 248
    move-object/from16 v28, v4

    .line 249
    .line 250
    move v7, v14

    .line 251
    move-wide/from16 v24, v22

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_b
    iget-object v7, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 255
    .line 256
    move-object/from16 v28, v4

    .line 257
    .line 258
    iget-wide v3, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 259
    .line 260
    invoke-interface {v7, v1, v2, v3, v4}, Lc5/c;->g(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    move v7, v14

    .line 265
    iget-wide v14, v15, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 266
    .line 267
    add-long v22, v3, v14

    .line 268
    .line 269
    move-wide/from16 v24, v8

    .line 270
    .line 271
    move-wide/from16 v26, v5

    .line 272
    .line 273
    invoke-static/range {v22 .. v27}, Lv5/e0;->j(JJJ)J

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    move-wide/from16 v24, v3

    .line 278
    .line 279
    :goto_4
    cmp-long v3, v24, v8

    .line 280
    .line 281
    if-gez v3, :cond_c

    .line 282
    .line 283
    sget-object v3, Lb5/n;->a:Lb5/n$a;

    .line 284
    .line 285
    aput-object v3, v12, v13

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_c
    invoke-virtual {v0, v13}, Lcom/google/android/exoplayer2/source/dash/c;->m(I)Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 289
    .line 290
    .line 291
    move-result-object v23

    .line 292
    new-instance v3, Lcom/google/android/exoplayer2/source/dash/c$c;

    .line 293
    .line 294
    move-object/from16 v22, v3

    .line 295
    .line 296
    move-wide/from16 v26, v5

    .line 297
    .line 298
    invoke-direct/range {v22 .. v27}, Lcom/google/android/exoplayer2/source/dash/c$c;-><init>(Lcom/google/android/exoplayer2/source/dash/c$b;JJ)V

    .line 299
    .line 300
    .line 301
    aput-object v3, v12, v13

    .line 302
    .line 303
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 304
    .line 305
    move-object/from16 v5, p5

    .line 306
    .line 307
    move-object/from16 v3, p6

    .line 308
    .line 309
    move v14, v7

    .line 310
    move-wide/from16 v8, v18

    .line 311
    .line 312
    move-wide/from16 v6, v20

    .line 313
    .line 314
    move-object/from16 v4, v28

    .line 315
    .line 316
    const/4 v15, 0x0

    .line 317
    goto :goto_3

    .line 318
    :cond_d
    move-object/from16 v28, v4

    .line 319
    .line 320
    move-wide/from16 v20, v6

    .line 321
    .line 322
    move-wide/from16 v18, v8

    .line 323
    .line 324
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    .line 325
    .line 326
    iget-boolean v3, v3, Ld5/c;->d:Z

    .line 327
    .line 328
    const-wide/16 v13, 0x0

    .line 329
    .line 330
    if-eqz v3, :cond_f

    .line 331
    .line 332
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 333
    .line 334
    const/4 v4, 0x0

    .line 335
    aget-object v3, v3, v4

    .line 336
    .line 337
    iget-object v5, v3, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 338
    .line 339
    iget-wide v6, v3, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 340
    .line 341
    invoke-interface {v5, v6, v7}, Lc5/c;->j(J)J

    .line 342
    .line 343
    .line 344
    move-result-wide v5

    .line 345
    cmp-long v3, v5, v13

    .line 346
    .line 347
    if-nez v3, :cond_e

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_e
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 351
    .line 352
    aget-object v3, v3, v4

    .line 353
    .line 354
    invoke-virtual {v3, v10, v11}, Lcom/google/android/exoplayer2/source/dash/c$b;->b(J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v5

    .line 358
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 359
    .line 360
    aget-object v3, v3, v4

    .line 361
    .line 362
    invoke-virtual {v3, v5, v6}, Lcom/google/android/exoplayer2/source/dash/c$b;->c(J)J

    .line 363
    .line 364
    .line 365
    move-result-wide v3

    .line 366
    invoke-virtual {v0, v10, v11}, Lcom/google/android/exoplayer2/source/dash/c;->k(J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v5

    .line 370
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 371
    .line 372
    .line 373
    move-result-wide v3

    .line 374
    sub-long v3, v3, p1

    .line 375
    .line 376
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 377
    .line 378
    .line 379
    move-result-wide v3

    .line 380
    move-wide v8, v3

    .line 381
    goto :goto_7

    .line 382
    :cond_f
    :goto_6
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    :goto_7
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 388
    .line 389
    move-wide/from16 v6, v20

    .line 390
    .line 391
    move-wide/from16 v3, v18

    .line 392
    .line 393
    move-wide/from16 v29, v10

    .line 394
    .line 395
    move-object/from16 v10, p5

    .line 396
    .line 397
    move-object v11, v12

    .line 398
    invoke-interface/range {v5 .. v11}, Lr5/h;->j(JJLjava/util/List;[Lb5/n;)V

    .line 399
    .line 400
    .line 401
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 402
    .line 403
    invoke-interface {v5}, Lr5/h;->i()I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/source/dash/c;->m(I)Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    iget-object v6, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 412
    .line 413
    if-eqz v6, :cond_15

    .line 414
    .line 415
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 416
    .line 417
    check-cast v6, Lb5/d;

    .line 418
    .line 419
    iget-object v6, v6, Lb5/d;->q:[Lv3/i0;

    .line 420
    .line 421
    if-nez v6, :cond_10

    .line 422
    .line 423
    iget-object v6, v7, Ld5/j;->o:Ld5/i;

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_10
    move-object/from16 v6, v16

    .line 427
    .line 428
    :goto_8
    iget-object v8, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 429
    .line 430
    if-nez v8, :cond_11

    .line 431
    .line 432
    invoke-virtual {v7}, Ld5/j;->m()Ld5/i;

    .line 433
    .line 434
    .line 435
    move-result-object v16

    .line 436
    :cond_11
    move-object/from16 v7, v16

    .line 437
    .line 438
    if-nez v6, :cond_12

    .line 439
    .line 440
    if-eqz v7, :cond_15

    .line 441
    .line 442
    :cond_12
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c;->e:Lt5/k;

    .line 443
    .line 444
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 445
    .line 446
    invoke-interface {v2}, Lr5/h;->p()Lv3/i0;

    .line 447
    .line 448
    .line 449
    move-result-object v21

    .line 450
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 451
    .line 452
    invoke-interface {v2}, Lr5/h;->q()I

    .line 453
    .line 454
    .line 455
    move-result v22

    .line 456
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 457
    .line 458
    invoke-interface {v2}, Lr5/h;->s()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v23

    .line 462
    iget-object v2, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 463
    .line 464
    if-eqz v6, :cond_14

    .line 465
    .line 466
    iget-object v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 467
    .line 468
    iget-object v3, v3, Ld5/b;->a:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v6, v7, v3}, Ld5/i;->a(Ld5/i;Ljava/lang/String;)Ld5/i;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    if-nez v3, :cond_13

    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_13
    move-object v6, v3

    .line 478
    goto :goto_9

    .line 479
    :cond_14
    move-object v6, v7

    .line 480
    :goto_9
    iget-object v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 481
    .line 482
    iget-object v3, v3, Ld5/b;->a:Ljava/lang/String;

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    invoke-static {v2, v3, v6, v7}, Lc5/d;->a(Ld5/j;Ljava/lang/String;Ld5/i;I)Lt5/n;

    .line 486
    .line 487
    .line 488
    move-result-object v20

    .line 489
    new-instance v2, Lb5/l;

    .line 490
    .line 491
    iget-object v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 492
    .line 493
    move-object/from16 v18, v2

    .line 494
    .line 495
    move-object/from16 v19, v1

    .line 496
    .line 497
    move-object/from16 v24, v3

    .line 498
    .line 499
    invoke-direct/range {v18 .. v24}, Lb5/l;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;Lb5/f;)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v6, p6

    .line 503
    .line 504
    iput-object v2, v6, Lb5/g;->b:Ljava/lang/Object;

    .line 505
    .line 506
    return-void

    .line 507
    :cond_15
    move-object/from16 v6, p6

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    iget-wide v8, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 511
    .line 512
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    cmp-long v12, v8, v10

    .line 518
    .line 519
    if-eqz v12, :cond_16

    .line 520
    .line 521
    const/4 v10, 0x1

    .line 522
    goto :goto_a

    .line 523
    :cond_16
    move v10, v7

    .line 524
    :goto_a
    iget-object v11, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 525
    .line 526
    invoke-interface {v11, v8, v9}, Lc5/c;->j(J)J

    .line 527
    .line 528
    .line 529
    move-result-wide v15

    .line 530
    cmp-long v11, v15, v13

    .line 531
    .line 532
    if-nez v11, :cond_17

    .line 533
    .line 534
    iput-boolean v10, v6, Lb5/g;->a:Z

    .line 535
    .line 536
    return-void

    .line 537
    :cond_17
    iget-object v11, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 538
    .line 539
    iget-wide v13, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 540
    .line 541
    move-wide v15, v8

    .line 542
    move-wide/from16 v7, v29

    .line 543
    .line 544
    invoke-interface {v11, v13, v14, v7, v8}, Lc5/c;->d(JJ)J

    .line 545
    .line 546
    .line 547
    move-result-wide v13

    .line 548
    move-wide/from16 v18, v3

    .line 549
    .line 550
    iget-wide v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 551
    .line 552
    add-long/2addr v13, v3

    .line 553
    invoke-virtual {v5, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->b(J)J

    .line 554
    .line 555
    .line 556
    move-result-wide v3

    .line 557
    if-eqz v28, :cond_18

    .line 558
    .line 559
    invoke-virtual/range {v28 .. v28}, Lb5/m;->c()J

    .line 560
    .line 561
    .line 562
    move-result-wide v7

    .line 563
    goto :goto_b

    .line 564
    :cond_18
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 565
    .line 566
    iget-wide v8, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 567
    .line 568
    invoke-interface {v7, v1, v2, v8, v9}, Lc5/c;->g(JJ)J

    .line 569
    .line 570
    .line 571
    move-result-wide v7

    .line 572
    iget-wide v1, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 573
    .line 574
    add-long v20, v7, v1

    .line 575
    .line 576
    move-wide/from16 v22, v13

    .line 577
    .line 578
    move-wide/from16 v24, v3

    .line 579
    .line 580
    invoke-static/range {v20 .. v25}, Lv5/e0;->j(JJJ)J

    .line 581
    .line 582
    .line 583
    move-result-wide v7

    .line 584
    :goto_b
    cmp-long v1, v7, v13

    .line 585
    .line 586
    if-gez v1, :cond_19

    .line 587
    .line 588
    new-instance v1, Lz4/b;

    .line 589
    .line 590
    invoke-direct {v1}, Lz4/b;-><init>()V

    .line 591
    .line 592
    .line 593
    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c;->l:Lz4/b;

    .line 594
    .line 595
    return-void

    .line 596
    :cond_19
    cmp-long v1, v7, v3

    .line 597
    .line 598
    if-gtz v1, :cond_24

    .line 599
    .line 600
    iget-boolean v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->m:Z

    .line 601
    .line 602
    if-eqz v2, :cond_1a

    .line 603
    .line 604
    if-ltz v1, :cond_1a

    .line 605
    .line 606
    goto/16 :goto_14

    .line 607
    .line 608
    :cond_1a
    if-eqz v10, :cond_1b

    .line 609
    .line 610
    invoke-virtual {v5, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    .line 611
    .line 612
    .line 613
    move-result-wide v1

    .line 614
    cmp-long v1, v1, v15

    .line 615
    .line 616
    if-ltz v1, :cond_1b

    .line 617
    .line 618
    const/4 v1, 0x1

    .line 619
    iput-boolean v1, v6, Lb5/g;->a:Z

    .line 620
    .line 621
    return-void

    .line 622
    :cond_1b
    const/4 v1, 0x1

    .line 623
    int-to-long v9, v1

    .line 624
    sub-long/2addr v3, v7

    .line 625
    const-wide/16 v13, 0x1

    .line 626
    .line 627
    add-long/2addr v3, v13

    .line 628
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 629
    .line 630
    .line 631
    move-result-wide v2

    .line 632
    long-to-int v2, v2

    .line 633
    if-eqz v12, :cond_1c

    .line 634
    .line 635
    :goto_c
    if-le v2, v1, :cond_1c

    .line 636
    .line 637
    int-to-long v3, v2

    .line 638
    add-long/2addr v3, v7

    .line 639
    sub-long/2addr v3, v13

    .line 640
    invoke-virtual {v5, v3, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    .line 641
    .line 642
    .line 643
    move-result-wide v3

    .line 644
    cmp-long v3, v3, v15

    .line 645
    .line 646
    if-ltz v3, :cond_1c

    .line 647
    .line 648
    add-int/lit8 v2, v2, -0x1

    .line 649
    .line 650
    goto :goto_c

    .line 651
    :cond_1c
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 652
    .line 653
    .line 654
    move-result v3

    .line 655
    if-eqz v3, :cond_1d

    .line 656
    .line 657
    move-wide/from16 v30, p3

    .line 658
    .line 659
    goto :goto_d

    .line 660
    :cond_1d
    const-wide v30, -0x7fffffffffffffffL    # -4.9E-324

    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    :goto_d
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->e:Lt5/k;

    .line 666
    .line 667
    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->d:I

    .line 668
    .line 669
    iget-object v9, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 670
    .line 671
    invoke-interface {v9}, Lr5/h;->p()Lv3/i0;

    .line 672
    .line 673
    .line 674
    move-result-object v9

    .line 675
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 676
    .line 677
    invoke-interface {v10}, Lr5/h;->q()I

    .line 678
    .line 679
    .line 680
    move-result v24

    .line 681
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 682
    .line 683
    invoke-interface {v10}, Lr5/h;->s()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v25

    .line 687
    iget-object v10, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 688
    .line 689
    invoke-virtual {v5, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->d(J)J

    .line 690
    .line 691
    .line 692
    move-result-wide v26

    .line 693
    iget-object v11, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 694
    .line 695
    iget-wide v13, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 696
    .line 697
    sub-long v12, v7, v13

    .line 698
    .line 699
    invoke-interface {v11, v12, v13}, Lc5/c;->f(J)Ld5/i;

    .line 700
    .line 701
    .line 702
    move-result-object v11

    .line 703
    iget-object v12, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 704
    .line 705
    if-nez v12, :cond_1f

    .line 706
    .line 707
    invoke-virtual {v5, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->c(J)J

    .line 708
    .line 709
    .line 710
    move-result-wide v28

    .line 711
    move-wide/from16 v14, v18

    .line 712
    .line 713
    invoke-virtual {v5, v7, v8, v14, v15}, Lcom/google/android/exoplayer2/source/dash/c$b;->e(JJ)Z

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    if-eqz v1, :cond_1e

    .line 718
    .line 719
    const/4 v15, 0x0

    .line 720
    goto :goto_e

    .line 721
    :cond_1e
    const/16 v15, 0x8

    .line 722
    .line 723
    :goto_e
    iget-object v1, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 724
    .line 725
    iget-object v1, v1, Ld5/b;->a:Ljava/lang/String;

    .line 726
    .line 727
    invoke-static {v10, v1, v11, v15}, Lc5/d;->a(Ld5/j;Ljava/lang/String;Ld5/i;I)Lt5/n;

    .line 728
    .line 729
    .line 730
    move-result-object v22

    .line 731
    new-instance v1, Lb5/o;

    .line 732
    .line 733
    move-object/from16 v20, v1

    .line 734
    .line 735
    move-object/from16 v21, v3

    .line 736
    .line 737
    move-object/from16 v23, v9

    .line 738
    .line 739
    move-wide/from16 v30, v7

    .line 740
    .line 741
    move/from16 v32, v4

    .line 742
    .line 743
    move-object/from16 v33, v9

    .line 744
    .line 745
    invoke-direct/range {v20 .. v33}, Lb5/o;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJILv3/i0;)V

    .line 746
    .line 747
    .line 748
    goto/16 :goto_13

    .line 749
    .line 750
    :cond_1f
    move-wide/from16 v14, v18

    .line 751
    .line 752
    move v4, v1

    .line 753
    :goto_f
    move-wide/from16 v18, v14

    .line 754
    .line 755
    if-ge v1, v2, :cond_21

    .line 756
    .line 757
    int-to-long v13, v1

    .line 758
    add-long/2addr v13, v7

    .line 759
    iget-object v12, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 760
    .line 761
    move/from16 v16, v2

    .line 762
    .line 763
    move-object v15, v3

    .line 764
    iget-wide v2, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 765
    .line 766
    sub-long/2addr v13, v2

    .line 767
    invoke-interface {v12, v13, v14}, Lc5/c;->f(J)Ld5/i;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    iget-object v3, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 772
    .line 773
    iget-object v3, v3, Ld5/b;->a:Ljava/lang/String;

    .line 774
    .line 775
    invoke-virtual {v11, v2, v3}, Ld5/i;->a(Ld5/i;Ljava/lang/String;)Ld5/i;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    if-nez v2, :cond_20

    .line 780
    .line 781
    goto :goto_10

    .line 782
    :cond_20
    add-int/lit8 v4, v4, 0x1

    .line 783
    .line 784
    add-int/lit8 v1, v1, 0x1

    .line 785
    .line 786
    move-object v11, v2

    .line 787
    move-object v3, v15

    .line 788
    move/from16 v2, v16

    .line 789
    .line 790
    move-wide/from16 v14, v18

    .line 791
    .line 792
    goto :goto_f

    .line 793
    :cond_21
    move-object v15, v3

    .line 794
    :goto_10
    int-to-long v1, v4

    .line 795
    add-long/2addr v1, v7

    .line 796
    const-wide/16 v12, 0x1

    .line 797
    .line 798
    sub-long/2addr v1, v12

    .line 799
    invoke-virtual {v5, v1, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->c(J)J

    .line 800
    .line 801
    .line 802
    move-result-wide v28

    .line 803
    iget-wide v12, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 804
    .line 805
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    cmp-long v3, v12, v16

    .line 811
    .line 812
    if-eqz v3, :cond_22

    .line 813
    .line 814
    cmp-long v3, v12, v28

    .line 815
    .line 816
    if-gtz v3, :cond_22

    .line 817
    .line 818
    move-wide/from16 v32, v12

    .line 819
    .line 820
    goto :goto_11

    .line 821
    :cond_22
    move-wide/from16 v32, v16

    .line 822
    .line 823
    :goto_11
    move-wide/from16 v12, v18

    .line 824
    .line 825
    invoke-virtual {v5, v1, v2, v12, v13}, Lcom/google/android/exoplayer2/source/dash/c$b;->e(JJ)Z

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    if-eqz v1, :cond_23

    .line 830
    .line 831
    const/4 v1, 0x0

    .line 832
    goto :goto_12

    .line 833
    :cond_23
    const/16 v1, 0x8

    .line 834
    .line 835
    :goto_12
    iget-object v2, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 836
    .line 837
    iget-object v2, v2, Ld5/b;->a:Ljava/lang/String;

    .line 838
    .line 839
    invoke-static {v10, v2, v11, v1}, Lc5/d;->a(Ld5/j;Ljava/lang/String;Ld5/i;I)Lt5/n;

    .line 840
    .line 841
    .line 842
    move-result-object v22

    .line 843
    iget-wide v1, v10, Ld5/j;->c:J

    .line 844
    .line 845
    neg-long v1, v1

    .line 846
    move-wide/from16 v37, v1

    .line 847
    .line 848
    new-instance v1, Lb5/j;

    .line 849
    .line 850
    move-object/from16 v20, v1

    .line 851
    .line 852
    iget-object v2, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 853
    .line 854
    move-object/from16 v39, v2

    .line 855
    .line 856
    move-object/from16 v21, v15

    .line 857
    .line 858
    move-object/from16 v23, v9

    .line 859
    .line 860
    move-wide/from16 v34, v7

    .line 861
    .line 862
    move/from16 v36, v4

    .line 863
    .line 864
    invoke-direct/range {v20 .. v39}, Lb5/j;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJJJIJLb5/f;)V

    .line 865
    .line 866
    .line 867
    :goto_13
    iput-object v1, v6, Lb5/g;->b:Ljava/lang/Object;

    .line 868
    .line 869
    return-void

    .line 870
    :cond_24
    :goto_14
    iput-boolean v10, v6, Lb5/g;->a:Z

    .line 871
    .line 872
    return-void
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
.end method

.method public final j(Lb5/e;)V
    .locals 13

    .line 1
    instance-of v0, p1, Lb5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lb5/l;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lr5/h;

    .line 9
    .line 10
    iget-object v0, v0, Lb5/e;->d:Lv3/i0;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lr5/k;->d(Lv3/i0;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 17
    .line 18
    aget-object v2, v1, v0

    .line 19
    .line 20
    iget-object v3, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    iget-object v9, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 25
    .line 26
    move-object v3, v9

    .line 27
    check-cast v3, Lb5/d;

    .line 28
    .line 29
    iget-object v3, v3, Lb5/d;->p:Lc4/t;

    .line 30
    .line 31
    instance-of v4, v3, Lc4/c;

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    check-cast v3, Lc4/c;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-eqz v3, :cond_1

    .line 40
    .line 41
    new-instance v12, Lc5/e;

    .line 42
    .line 43
    iget-object v7, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 44
    .line 45
    iget-wide v4, v7, Ld5/j;->c:J

    .line 46
    .line 47
    invoke-direct {v12, v3, v4, v5}, Lc5/e;-><init>(Ljava/lang/Object;J)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 51
    .line 52
    iget-wide v5, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 53
    .line 54
    iget-object v8, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 55
    .line 56
    iget-wide v10, v2, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 57
    .line 58
    move-object v4, v3

    .line 59
    invoke-direct/range {v4 .. v12}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    .line 60
    .line 61
    .line 62
    aput-object v3, v1, v0

    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/d$c;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    .line 69
    .line 70
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    cmp-long v3, v1, v3

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    iget-wide v3, p1, Lb5/e;->h:J

    .line 80
    .line 81
    cmp-long v1, v3, v1

    .line 82
    .line 83
    if-lez v1, :cond_3

    .line 84
    .line 85
    :cond_2
    iget-wide v1, p1, Lb5/e;->h:J

    .line 86
    .line 87
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    .line 88
    .line 89
    :cond_3
    iget-object p1, v0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p1, Lcom/google/android/exoplayer2/source/dash/d;->o:Z

    .line 93
    .line 94
    :cond_4
    return-void
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

.method public final k(J)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    iget-wide v1, v0, Ld5/c;->a:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    iget v3, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    invoke-virtual {v0, v3}, Ld5/c;->b(I)Ld5/g;

    move-result-object v0

    iget-wide v3, v0, Ld5/g;->b:J

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Lv5/e0;->I(J)J

    move-result-wide v0

    sub-long v3, p1, v0

    :goto_0
    return-wide v3
.end method

.method public final l()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ld5/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Ld5/c;

    iget v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    invoke-virtual {v0, v1}, Ld5/c;->b(I)Ld5/g;

    move-result-object v0

    iget-object v0, v0, Ld5/g;->c:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->c:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld5/a;

    iget-object v5, v5, Ld5/a;->c:Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final m(I)Lcom/google/android/exoplayer2/source/dash/c$b;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->b:Lc5/a;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 8
    .line 9
    iget-object v2, v2, Ld5/j;->b:Lo7/t;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lc5/a;->d(Lo7/t;)Ld5/b;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    if-eqz v7, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ld5/b;

    .line 18
    .line 19
    invoke-virtual {v7, v1}, Ld5/b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 26
    .line 27
    iget-wide v4, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->e:J

    .line 28
    .line 29
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Ld5/j;

    .line 30
    .line 31
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    .line 32
    .line 33
    iget-wide v9, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->f:J

    .line 34
    .line 35
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->d:Lc5/c;

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    invoke-direct/range {v3 .. v11}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JLd5/j;Ld5/b;Lb5/f;JLc5/c;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 42
    .line 43
    aput-object v1, v0, p1

    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :cond_0
    return-object v0
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

.method public final release()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v3, v3, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lb5/f;

    if-eqz v3, :cond_0

    check-cast v3, Lb5/d;

    iget-object v3, v3, Lb5/d;->a:Lc4/h;

    invoke-interface {v3}, Lc4/h;->release()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
