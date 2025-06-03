.class public final Lf5/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/d0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt5/d0$a<",
        "Lt5/f0<",
        "Lf5/g;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lt5/d0;

.field public final c:Lt5/k;

.field public d:Lf5/e;

.field public e:J

.field public f:J

.field public o:J

.field public p:J

.field public q:Z

.field public r:Ljava/io/IOException;

.field public final synthetic s:Lf5/b;


# direct methods
.method public constructor <init>(Lf5/b;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Lt5/d0;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Lt5/d0;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lf5/b$b;->b:Lt5/d0;

    .line 16
    .line 17
    iget-object p1, p1, Lf5/b;->a:Le5/h;

    .line 18
    .line 19
    invoke-interface {p1}, Le5/h;->a()Lt5/k;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lf5/b$b;->c:Lt5/k;

    .line 24
    .line 25
    return-void
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

.method public static a(Lf5/b$b;J)Z
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Lf5/b$b;->p:J

    .line 7
    .line 8
    iget-object p1, p0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p2, p0, Lf5/b$b;->s:Lf5/b;

    .line 11
    .line 12
    iget-object p2, p2, Lf5/b;->s:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x1

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lf5/b$b;->s:Lf5/b;

    .line 23
    .line 24
    iget-object p1, p0, Lf5/b;->r:Lf5/f;

    .line 25
    .line 26
    iget-object p1, p1, Lf5/f;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    move v4, v0

    .line 37
    :goto_0
    if-ge v4, v1, :cond_1

    .line 38
    .line 39
    iget-object v5, p0, Lf5/b;->d:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Lf5/f$b;

    .line 46
    .line 47
    iget-object v6, v6, Lf5/f$b;->a:Landroid/net/Uri;

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lf5/b$b;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-wide v6, v5, Lf5/b$b;->p:J

    .line 59
    .line 60
    cmp-long v6, v2, v6

    .line 61
    .line 62
    if-lez v6, :cond_0

    .line 63
    .line 64
    iget-object p1, v5, Lf5/b$b;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iput-object p1, p0, Lf5/b;->s:Landroid/net/Uri;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lf5/b;->n(Landroid/net/Uri;)Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v5, p0}, Lf5/b$b;->c(Landroid/net/Uri;)V

    .line 73
    .line 74
    .line 75
    move p0, p2

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move p0, v0

    .line 81
    :goto_1
    if-nez p0, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move p2, v0

    .line 85
    :goto_2
    return p2
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
.method public final b(Landroid/net/Uri;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lf5/b$b;->s:Lf5/b;

    .line 2
    .line 3
    iget-object v1, v0, Lf5/b;->b:Lf5/i;

    .line 4
    .line 5
    iget-object v0, v0, Lf5/b;->r:Lf5/f;

    .line 6
    .line 7
    iget-object v2, p0, Lf5/b$b;->d:Lf5/e;

    .line 8
    .line 9
    invoke-interface {v1, v0, v2}, Lf5/i;->a(Lf5/f;Lf5/e;)Lt5/f0$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lt5/f0;

    .line 14
    .line 15
    iget-object v2, p0, Lf5/b$b;->c:Lt5/k;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v1, v2, p1, v3, v0}, Lt5/f0;-><init>(Lt5/k;Landroid/net/Uri;ILt5/f0$a;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lf5/b$b;->b:Lt5/d0;

    .line 22
    .line 23
    iget-object v0, p0, Lf5/b$b;->s:Lf5/b;

    .line 24
    .line 25
    iget-object v0, v0, Lf5/b;->c:Lt5/c0;

    .line 26
    .line 27
    iget v2, v1, Lt5/f0;->c:I

    .line 28
    .line 29
    check-cast v0, Lt5/u;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lt5/u;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v1, p0, v0}, Lt5/d0;->f(Lt5/d0$d;Lt5/d0$a;I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 40
    .line 41
    iget-object p1, p1, Lf5/b;->f:Lz4/w$a;

    .line 42
    .line 43
    new-instance v0, Lz4/n;

    .line 44
    .line 45
    iget-wide v3, v1, Lt5/f0;->a:J

    .line 46
    .line 47
    iget-object v5, v1, Lt5/f0;->b:Lt5/n;

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    invoke-direct/range {v2 .. v7}, Lz4/n;-><init>(JLt5/n;J)V

    .line 51
    .line 52
    .line 53
    iget v1, v1, Lt5/f0;->c:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Lz4/w$a;->m(Lz4/n;I)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final c(Landroid/net/Uri;)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lf5/b$b;->p:J

    .line 4
    .line 5
    iget-boolean v0, p0, Lf5/b$b;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lf5/b$b;->b:Lt5/d0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt5/d0;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lf5/b$b;->b:Lt5/d0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt5/d0;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iget-wide v2, p0, Lf5/b$b;->o:J

    .line 31
    .line 32
    cmp-long v4, v0, v2

    .line 33
    .line 34
    if-gez v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    iput-boolean v4, p0, Lf5/b$b;->q:Z

    .line 38
    .line 39
    iget-object v4, p0, Lf5/b$b;->s:Lf5/b;

    .line 40
    .line 41
    iget-object v4, v4, Lf5/b;->p:Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v5, Lx0/f;

    .line 44
    .line 45
    const/16 v6, 0xb

    .line 46
    .line 47
    invoke-direct {v5, v6, p0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sub-long/2addr v2, v0

    .line 51
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0, p1}, Lf5/b$b;->b(Landroid/net/Uri;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
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

.method public final d(Lf5/e;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lf5/b$b;->d:Lf5/e;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iput-wide v3, v0, Lf5/b$b;->e:J

    .line 12
    .line 13
    iget-object v5, v0, Lf5/b$b;->s:Lf5/b;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    iget-wide v8, v1, Lf5/e;->k:J

    .line 22
    .line 23
    iget-wide v10, v2, Lf5/e;->k:J

    .line 24
    .line 25
    cmp-long v8, v8, v10

    .line 26
    .line 27
    if-lez v8, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-gez v8, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v8, v1, Lf5/e;->r:Lo7/t;

    .line 34
    .line 35
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    iget-object v9, v2, Lf5/e;->r:Lo7/t;

    .line 40
    .line 41
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    sub-int/2addr v8, v9

    .line 46
    if-eqz v8, :cond_2

    .line 47
    .line 48
    if-lez v8, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v8, v1, Lf5/e;->s:Lo7/t;

    .line 52
    .line 53
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    iget-object v9, v2, Lf5/e;->s:Lo7/t;

    .line 58
    .line 59
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-gt v8, v9, :cond_5

    .line 64
    .line 65
    if-ne v8, v9, :cond_3

    .line 66
    .line 67
    iget-boolean v8, v1, Lf5/e;->o:Z

    .line 68
    .line 69
    if-eqz v8, :cond_3

    .line 70
    .line 71
    iget-boolean v8, v2, Lf5/e;->o:Z

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    move v8, v6

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_1
    const/4 v8, 0x1

    .line 82
    :goto_2
    const/4 v11, 0x0

    .line 83
    if-nez v8, :cond_8

    .line 84
    .line 85
    iget-boolean v5, v1, Lf5/e;->o:Z

    .line 86
    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    iget-boolean v5, v2, Lf5/e;->o:Z

    .line 90
    .line 91
    if-eqz v5, :cond_6

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    new-instance v5, Lf5/e;

    .line 95
    .line 96
    move-object v12, v5

    .line 97
    iget v13, v2, Lf5/e;->d:I

    .line 98
    .line 99
    iget-object v14, v2, Lf5/g;->a:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v15, v2, Lf5/g;->b:Ljava/util/List;

    .line 102
    .line 103
    iget-wide v9, v2, Lf5/e;->e:J

    .line 104
    .line 105
    move-wide/from16 v16, v9

    .line 106
    .line 107
    iget-boolean v8, v2, Lf5/e;->g:Z

    .line 108
    .line 109
    move/from16 v18, v8

    .line 110
    .line 111
    iget-wide v8, v2, Lf5/e;->h:J

    .line 112
    .line 113
    move-wide/from16 v19, v8

    .line 114
    .line 115
    iget-boolean v8, v2, Lf5/e;->i:Z

    .line 116
    .line 117
    move/from16 v21, v8

    .line 118
    .line 119
    iget v8, v2, Lf5/e;->j:I

    .line 120
    .line 121
    move/from16 v22, v8

    .line 122
    .line 123
    iget-wide v8, v2, Lf5/e;->k:J

    .line 124
    .line 125
    move-wide/from16 v23, v8

    .line 126
    .line 127
    iget v8, v2, Lf5/e;->l:I

    .line 128
    .line 129
    move/from16 v25, v8

    .line 130
    .line 131
    iget-wide v8, v2, Lf5/e;->m:J

    .line 132
    .line 133
    move-wide/from16 v26, v8

    .line 134
    .line 135
    iget-wide v8, v2, Lf5/e;->n:J

    .line 136
    .line 137
    move-wide/from16 v28, v8

    .line 138
    .line 139
    iget-boolean v8, v2, Lf5/g;->c:Z

    .line 140
    .line 141
    move/from16 v30, v8

    .line 142
    .line 143
    const/16 v31, 0x1

    .line 144
    .line 145
    iget-boolean v8, v2, Lf5/e;->p:Z

    .line 146
    .line 147
    move/from16 v32, v8

    .line 148
    .line 149
    iget-object v8, v2, Lf5/e;->q:La4/d;

    .line 150
    .line 151
    move-object/from16 v33, v8

    .line 152
    .line 153
    iget-object v8, v2, Lf5/e;->r:Lo7/t;

    .line 154
    .line 155
    move-object/from16 v34, v8

    .line 156
    .line 157
    iget-object v8, v2, Lf5/e;->s:Lo7/t;

    .line 158
    .line 159
    move-object/from16 v35, v8

    .line 160
    .line 161
    iget-object v8, v2, Lf5/e;->v:Lf5/e$e;

    .line 162
    .line 163
    move-object/from16 v36, v8

    .line 164
    .line 165
    iget-object v8, v2, Lf5/e;->t:Lo7/u;

    .line 166
    .line 167
    move-object/from16 v37, v8

    .line 168
    .line 169
    invoke-direct/range {v12 .. v37}, Lf5/e;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLa4/d;Ljava/util/List;Ljava/util/List;Lf5/e$e;Ljava/util/Map;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_e

    .line 173
    .line 174
    :cond_7
    :goto_3
    move-object v5, v2

    .line 175
    goto/16 :goto_e

    .line 176
    .line 177
    :cond_8
    iget-boolean v8, v1, Lf5/e;->p:Z

    .line 178
    .line 179
    if-eqz v8, :cond_9

    .line 180
    .line 181
    iget-wide v8, v1, Lf5/e;->h:J

    .line 182
    .line 183
    :goto_4
    move-wide/from16 v19, v8

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_9
    iget-object v8, v5, Lf5/b;->t:Lf5/e;

    .line 187
    .line 188
    if-eqz v8, :cond_a

    .line 189
    .line 190
    iget-wide v8, v8, Lf5/e;->h:J

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_a
    const-wide/16 v8, 0x0

    .line 194
    .line 195
    :goto_5
    if-nez v2, :cond_b

    .line 196
    .line 197
    move-wide/from16 v16, v8

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_b
    iget-object v10, v2, Lf5/e;->r:Lo7/t;

    .line 201
    .line 202
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    iget-wide v12, v1, Lf5/e;->k:J

    .line 207
    .line 208
    iget-wide v14, v2, Lf5/e;->k:J

    .line 209
    .line 210
    sub-long/2addr v12, v14

    .line 211
    long-to-int v12, v12

    .line 212
    iget-object v13, v2, Lf5/e;->r:Lo7/t;

    .line 213
    .line 214
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-ge v12, v14, :cond_c

    .line 219
    .line 220
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    check-cast v12, Lf5/e$c;

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_c
    move-object v12, v11

    .line 228
    :goto_6
    if-eqz v12, :cond_d

    .line 229
    .line 230
    iget-wide v8, v2, Lf5/e;->h:J

    .line 231
    .line 232
    iget-wide v12, v12, Lf5/e$d;->e:J

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_d
    int-to-long v12, v10

    .line 236
    iget-wide v14, v1, Lf5/e;->k:J

    .line 237
    .line 238
    move-wide/from16 v16, v8

    .line 239
    .line 240
    iget-wide v7, v2, Lf5/e;->k:J

    .line 241
    .line 242
    sub-long/2addr v14, v7

    .line 243
    cmp-long v7, v12, v14

    .line 244
    .line 245
    if-nez v7, :cond_e

    .line 246
    .line 247
    iget-wide v8, v2, Lf5/e;->h:J

    .line 248
    .line 249
    iget-wide v12, v2, Lf5/e;->u:J

    .line 250
    .line 251
    :goto_7
    add-long/2addr v8, v12

    .line 252
    goto :goto_4

    .line 253
    :cond_e
    :goto_8
    move-wide/from16 v19, v16

    .line 254
    .line 255
    :goto_9
    iget-boolean v7, v1, Lf5/e;->i:Z

    .line 256
    .line 257
    if-eqz v7, :cond_10

    .line 258
    .line 259
    iget v5, v1, Lf5/e;->j:I

    .line 260
    .line 261
    :cond_f
    :goto_a
    move/from16 v22, v5

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_10
    iget-object v5, v5, Lf5/b;->t:Lf5/e;

    .line 265
    .line 266
    if-eqz v5, :cond_11

    .line 267
    .line 268
    iget v5, v5, Lf5/e;->j:I

    .line 269
    .line 270
    goto :goto_b

    .line 271
    :cond_11
    move v5, v6

    .line 272
    :goto_b
    if-nez v2, :cond_12

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_12
    iget-wide v7, v1, Lf5/e;->k:J

    .line 276
    .line 277
    iget-wide v12, v2, Lf5/e;->k:J

    .line 278
    .line 279
    sub-long/2addr v7, v12

    .line 280
    long-to-int v7, v7

    .line 281
    iget-object v8, v2, Lf5/e;->r:Lo7/t;

    .line 282
    .line 283
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    if-ge v7, v9, :cond_13

    .line 288
    .line 289
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    check-cast v7, Lf5/e$c;

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_13
    move-object v7, v11

    .line 297
    :goto_c
    if-eqz v7, :cond_f

    .line 298
    .line 299
    iget v5, v2, Lf5/e;->j:I

    .line 300
    .line 301
    iget v7, v7, Lf5/e$d;->d:I

    .line 302
    .line 303
    add-int/2addr v5, v7

    .line 304
    iget-object v7, v1, Lf5/e;->r:Lo7/t;

    .line 305
    .line 306
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    check-cast v7, Lf5/e$c;

    .line 311
    .line 312
    iget v7, v7, Lf5/e$d;->d:I

    .line 313
    .line 314
    sub-int/2addr v5, v7

    .line 315
    goto :goto_a

    .line 316
    :goto_d
    new-instance v5, Lf5/e;

    .line 317
    .line 318
    move-object v12, v5

    .line 319
    iget v13, v1, Lf5/e;->d:I

    .line 320
    .line 321
    iget-object v14, v1, Lf5/g;->a:Ljava/lang/String;

    .line 322
    .line 323
    iget-object v15, v1, Lf5/g;->b:Ljava/util/List;

    .line 324
    .line 325
    iget-wide v7, v1, Lf5/e;->e:J

    .line 326
    .line 327
    move-wide/from16 v16, v7

    .line 328
    .line 329
    iget-boolean v7, v1, Lf5/e;->g:Z

    .line 330
    .line 331
    move/from16 v18, v7

    .line 332
    .line 333
    iget-wide v7, v1, Lf5/e;->k:J

    .line 334
    .line 335
    move-wide/from16 v23, v7

    .line 336
    .line 337
    iget v7, v1, Lf5/e;->l:I

    .line 338
    .line 339
    move/from16 v25, v7

    .line 340
    .line 341
    iget-wide v7, v1, Lf5/e;->m:J

    .line 342
    .line 343
    move-wide/from16 v26, v7

    .line 344
    .line 345
    iget-wide v7, v1, Lf5/e;->n:J

    .line 346
    .line 347
    move-wide/from16 v28, v7

    .line 348
    .line 349
    iget-boolean v7, v1, Lf5/g;->c:Z

    .line 350
    .line 351
    move/from16 v30, v7

    .line 352
    .line 353
    iget-boolean v7, v1, Lf5/e;->o:Z

    .line 354
    .line 355
    move/from16 v31, v7

    .line 356
    .line 357
    iget-boolean v7, v1, Lf5/e;->p:Z

    .line 358
    .line 359
    move/from16 v32, v7

    .line 360
    .line 361
    iget-object v7, v1, Lf5/e;->q:La4/d;

    .line 362
    .line 363
    move-object/from16 v33, v7

    .line 364
    .line 365
    iget-object v7, v1, Lf5/e;->r:Lo7/t;

    .line 366
    .line 367
    move-object/from16 v34, v7

    .line 368
    .line 369
    iget-object v7, v1, Lf5/e;->s:Lo7/t;

    .line 370
    .line 371
    move-object/from16 v35, v7

    .line 372
    .line 373
    iget-object v7, v1, Lf5/e;->v:Lf5/e$e;

    .line 374
    .line 375
    move-object/from16 v36, v7

    .line 376
    .line 377
    iget-object v7, v1, Lf5/e;->t:Lo7/u;

    .line 378
    .line 379
    move-object/from16 v37, v7

    .line 380
    .line 381
    const/16 v21, 0x1

    .line 382
    .line 383
    invoke-direct/range {v12 .. v37}, Lf5/e;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLa4/d;Ljava/util/List;Ljava/util/List;Lf5/e$e;Ljava/util/Map;)V

    .line 384
    .line 385
    .line 386
    :goto_e
    iput-object v5, v0, Lf5/b$b;->d:Lf5/e;

    .line 387
    .line 388
    if-eq v5, v2, :cond_16

    .line 389
    .line 390
    iput-object v11, v0, Lf5/b$b;->r:Ljava/io/IOException;

    .line 391
    .line 392
    iput-wide v3, v0, Lf5/b$b;->f:J

    .line 393
    .line 394
    iget-object v1, v0, Lf5/b$b;->s:Lf5/b;

    .line 395
    .line 396
    iget-object v7, v0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 397
    .line 398
    iget-object v8, v1, Lf5/b;->s:Landroid/net/Uri;

    .line 399
    .line 400
    invoke-virtual {v7, v8}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    if-eqz v7, :cond_15

    .line 405
    .line 406
    iget-object v7, v1, Lf5/b;->t:Lf5/e;

    .line 407
    .line 408
    if-nez v7, :cond_14

    .line 409
    .line 410
    iget-boolean v7, v5, Lf5/e;->o:Z

    .line 411
    .line 412
    const/4 v8, 0x1

    .line 413
    xor-int/2addr v7, v8

    .line 414
    iput-boolean v7, v1, Lf5/b;->u:Z

    .line 415
    .line 416
    iget-wide v7, v5, Lf5/e;->h:J

    .line 417
    .line 418
    iput-wide v7, v1, Lf5/b;->v:J

    .line 419
    .line 420
    :cond_14
    iput-object v5, v1, Lf5/b;->t:Lf5/e;

    .line 421
    .line 422
    iget-object v7, v1, Lf5/b;->q:Lf5/j$d;

    .line 423
    .line 424
    check-cast v7, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    .line 425
    .line 426
    invoke-virtual {v7, v5}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y(Lf5/e;)V

    .line 427
    .line 428
    .line 429
    :cond_15
    iget-object v1, v1, Lf5/b;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_19

    .line 440
    .line 441
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    check-cast v5, Lf5/j$a;

    .line 446
    .line 447
    invoke-interface {v5}, Lf5/j$a;->f()V

    .line 448
    .line 449
    .line 450
    goto :goto_f

    .line 451
    :cond_16
    iget-boolean v5, v5, Lf5/e;->o:Z

    .line 452
    .line 453
    if-nez v5, :cond_19

    .line 454
    .line 455
    iget-wide v7, v1, Lf5/e;->k:J

    .line 456
    .line 457
    iget-object v1, v1, Lf5/e;->r:Lo7/t;

    .line 458
    .line 459
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    int-to-long v12, v1

    .line 464
    add-long/2addr v7, v12

    .line 465
    iget-object v1, v0, Lf5/b$b;->d:Lf5/e;

    .line 466
    .line 467
    iget-wide v12, v1, Lf5/e;->k:J

    .line 468
    .line 469
    cmp-long v5, v7, v12

    .line 470
    .line 471
    if-gez v5, :cond_17

    .line 472
    .line 473
    new-instance v1, Lf5/j$b;

    .line 474
    .line 475
    invoke-direct {v1}, Lf5/j$b;-><init>()V

    .line 476
    .line 477
    .line 478
    const/4 v8, 0x1

    .line 479
    goto :goto_10

    .line 480
    :cond_17
    iget-wide v7, v0, Lf5/b$b;->f:J

    .line 481
    .line 482
    sub-long v7, v3, v7

    .line 483
    .line 484
    long-to-double v7, v7

    .line 485
    iget-wide v12, v1, Lf5/e;->m:J

    .line 486
    .line 487
    invoke-static {v12, v13}, Lv5/e0;->R(J)J

    .line 488
    .line 489
    .line 490
    move-result-wide v12

    .line 491
    long-to-double v12, v12

    .line 492
    iget-object v1, v0, Lf5/b$b;->s:Lf5/b;

    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    const-wide/high16 v14, 0x400c000000000000L    # 3.5

    .line 498
    .line 499
    mul-double/2addr v12, v14

    .line 500
    cmpl-double v1, v7, v12

    .line 501
    .line 502
    if-lez v1, :cond_18

    .line 503
    .line 504
    new-instance v11, Lf5/j$c;

    .line 505
    .line 506
    invoke-direct {v11}, Lf5/j$c;-><init>()V

    .line 507
    .line 508
    .line 509
    :cond_18
    move v8, v6

    .line 510
    move-object v1, v11

    .line 511
    :goto_10
    if-eqz v1, :cond_19

    .line 512
    .line 513
    iput-object v1, v0, Lf5/b$b;->r:Ljava/io/IOException;

    .line 514
    .line 515
    iget-object v5, v0, Lf5/b$b;->s:Lf5/b;

    .line 516
    .line 517
    iget-object v7, v0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 518
    .line 519
    new-instance v9, Lt5/c0$c;

    .line 520
    .line 521
    const/4 v10, 0x1

    .line 522
    invoke-direct {v9, v1, v10}, Lt5/c0$c;-><init>(Ljava/io/IOException;I)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v5, Lf5/b;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-eqz v5, :cond_1a

    .line 536
    .line 537
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    check-cast v5, Lf5/j$a;

    .line 542
    .line 543
    invoke-interface {v5, v7, v9, v8}, Lf5/j$a;->a(Landroid/net/Uri;Lt5/c0$c;Z)Z

    .line 544
    .line 545
    .line 546
    goto :goto_11

    .line 547
    :cond_19
    const/4 v10, 0x1

    .line 548
    :cond_1a
    iget-object v1, v0, Lf5/b$b;->d:Lf5/e;

    .line 549
    .line 550
    iget-object v5, v1, Lf5/e;->v:Lf5/e$e;

    .line 551
    .line 552
    iget-boolean v5, v5, Lf5/e$e;->e:Z

    .line 553
    .line 554
    if-nez v5, :cond_1c

    .line 555
    .line 556
    if-eq v1, v2, :cond_1b

    .line 557
    .line 558
    iget-wide v1, v1, Lf5/e;->m:J

    .line 559
    .line 560
    goto :goto_12

    .line 561
    :cond_1b
    iget-wide v1, v1, Lf5/e;->m:J

    .line 562
    .line 563
    const-wide/16 v7, 0x2

    .line 564
    .line 565
    div-long/2addr v1, v7

    .line 566
    goto :goto_12

    .line 567
    :cond_1c
    const-wide/16 v1, 0x0

    .line 568
    .line 569
    :goto_12
    invoke-static {v1, v2}, Lv5/e0;->R(J)J

    .line 570
    .line 571
    .line 572
    move-result-wide v1

    .line 573
    add-long/2addr v1, v3

    .line 574
    iput-wide v1, v0, Lf5/b$b;->o:J

    .line 575
    .line 576
    iget-object v1, v0, Lf5/b$b;->d:Lf5/e;

    .line 577
    .line 578
    iget-wide v1, v1, Lf5/e;->n:J

    .line 579
    .line 580
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    cmp-long v1, v1, v3

    .line 586
    .line 587
    if-nez v1, :cond_1d

    .line 588
    .line 589
    iget-object v1, v0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 590
    .line 591
    iget-object v2, v0, Lf5/b$b;->s:Lf5/b;

    .line 592
    .line 593
    iget-object v2, v2, Lf5/b;->s:Landroid/net/Uri;

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    if-eqz v1, :cond_1e

    .line 600
    .line 601
    :cond_1d
    move v6, v10

    .line 602
    :cond_1e
    if-eqz v6, :cond_24

    .line 603
    .line 604
    iget-object v1, v0, Lf5/b$b;->d:Lf5/e;

    .line 605
    .line 606
    iget-boolean v2, v1, Lf5/e;->o:Z

    .line 607
    .line 608
    if-nez v2, :cond_24

    .line 609
    .line 610
    iget-object v1, v1, Lf5/e;->v:Lf5/e$e;

    .line 611
    .line 612
    iget-wide v5, v1, Lf5/e$e;->a:J

    .line 613
    .line 614
    cmp-long v2, v5, v3

    .line 615
    .line 616
    if-nez v2, :cond_1f

    .line 617
    .line 618
    iget-boolean v1, v1, Lf5/e$e;->e:Z

    .line 619
    .line 620
    if-nez v1, :cond_1f

    .line 621
    .line 622
    iget-object v1, v0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 623
    .line 624
    goto :goto_14

    .line 625
    :cond_1f
    iget-object v1, v0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 626
    .line 627
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    iget-object v2, v0, Lf5/b$b;->d:Lf5/e;

    .line 632
    .line 633
    iget-object v5, v2, Lf5/e;->v:Lf5/e$e;

    .line 634
    .line 635
    iget-boolean v5, v5, Lf5/e$e;->e:Z

    .line 636
    .line 637
    if-eqz v5, :cond_21

    .line 638
    .line 639
    iget-wide v5, v2, Lf5/e;->k:J

    .line 640
    .line 641
    iget-object v2, v2, Lf5/e;->r:Lo7/t;

    .line 642
    .line 643
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    int-to-long v7, v2

    .line 648
    add-long/2addr v5, v7

    .line 649
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const-string v5, "_HLS_msn"

    .line 654
    .line 655
    invoke-virtual {v1, v5, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 656
    .line 657
    .line 658
    iget-object v2, v0, Lf5/b$b;->d:Lf5/e;

    .line 659
    .line 660
    iget-wide v5, v2, Lf5/e;->n:J

    .line 661
    .line 662
    cmp-long v5, v5, v3

    .line 663
    .line 664
    if-eqz v5, :cond_21

    .line 665
    .line 666
    iget-object v2, v2, Lf5/e;->s:Lo7/t;

    .line 667
    .line 668
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 673
    .line 674
    .line 675
    move-result v6

    .line 676
    if-nez v6, :cond_20

    .line 677
    .line 678
    invoke-static {v2}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    check-cast v2, Lf5/e$a;

    .line 683
    .line 684
    iget-boolean v2, v2, Lf5/e$a;->u:Z

    .line 685
    .line 686
    if-eqz v2, :cond_20

    .line 687
    .line 688
    add-int/lit8 v5, v5, -0x1

    .line 689
    .line 690
    :cond_20
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const-string v5, "_HLS_part"

    .line 695
    .line 696
    invoke-virtual {v1, v5, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 697
    .line 698
    .line 699
    :cond_21
    iget-object v2, v0, Lf5/b$b;->d:Lf5/e;

    .line 700
    .line 701
    iget-object v2, v2, Lf5/e;->v:Lf5/e$e;

    .line 702
    .line 703
    iget-wide v5, v2, Lf5/e$e;->a:J

    .line 704
    .line 705
    cmp-long v3, v5, v3

    .line 706
    .line 707
    if-eqz v3, :cond_23

    .line 708
    .line 709
    iget-boolean v2, v2, Lf5/e$e;->b:Z

    .line 710
    .line 711
    if-eqz v2, :cond_22

    .line 712
    .line 713
    const-string v2, "v2"

    .line 714
    .line 715
    goto :goto_13

    .line 716
    :cond_22
    const-string v2, "YES"

    .line 717
    .line 718
    :goto_13
    const-string v3, "_HLS_skip"

    .line 719
    .line 720
    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 721
    .line 722
    .line 723
    :cond_23
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    :goto_14
    invoke-virtual {v0, v1}, Lf5/b$b;->c(Landroid/net/Uri;)V

    .line 728
    .line 729
    .line 730
    :cond_24
    return-void
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
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
.end method

.method public final k(Lt5/d0$d;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lt5/f0;

    .line 2
    .line 3
    new-instance p2, Lz4/n;

    .line 4
    .line 5
    iget-wide p3, p1, Lt5/f0;->a:J

    .line 6
    .line 7
    iget-object p1, p1, Lt5/f0;->d:Lt5/j0;

    .line 8
    .line 9
    iget-object p3, p1, Lt5/j0;->c:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object p1, p1, Lt5/j0;->d:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 17
    .line 18
    iget-object p1, p1, Lf5/b;->c:Lt5/c0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 24
    .line 25
    iget-object p1, p1, Lf5/b;->f:Lz4/w$a;

    .line 26
    .line 27
    const/4 p3, 0x4

    .line 28
    invoke-virtual {p1, p2, p3}, Lz4/w$a;->d(Lz4/n;I)V

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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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

.method public final p(Lt5/d0$d;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lt5/f0;

    .line 2
    .line 3
    iget-object p2, p1, Lt5/f0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lf5/g;

    .line 6
    .line 7
    new-instance p3, Lz4/n;

    .line 8
    .line 9
    iget-object p1, p1, Lt5/f0;->d:Lt5/j0;

    .line 10
    .line 11
    iget-object p4, p1, Lt5/j0;->c:Landroid/net/Uri;

    .line 12
    .line 13
    iget-object p1, p1, Lt5/j0;->d:Ljava/util/Map;

    .line 14
    .line 15
    invoke-direct {p3, p1}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    instance-of p1, p2, Lf5/e;

    .line 19
    .line 20
    const/4 p4, 0x4

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    check-cast p2, Lf5/e;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lf5/b$b;->d(Lf5/e;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 29
    .line 30
    iget-object p1, p1, Lf5/b;->f:Lz4/w$a;

    .line 31
    .line 32
    invoke-virtual {p1, p3, p4}, Lz4/w$a;->g(Lz4/n;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    const-string p2, "Loaded playlist has unexpected type."

    .line 38
    .line 39
    invoke-static {p2, p1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lf5/b$b;->r:Ljava/io/IOException;

    .line 44
    .line 45
    iget-object p2, p0, Lf5/b$b;->s:Lf5/b;

    .line 46
    .line 47
    iget-object p2, p2, Lf5/b;->f:Lz4/w$a;

    .line 48
    .line 49
    const/4 p5, 0x1

    .line 50
    invoke-virtual {p2, p3, p4, p1, p5}, Lz4/w$a;->k(Lz4/n;ILjava/io/IOException;Z)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 54
    .line 55
    iget-object p1, p1, Lf5/b;->c:Lt5/c0;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-void
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final u(Lt5/d0$d;JJLjava/io/IOException;I)Lt5/d0$b;
    .locals 4

    .line 1
    check-cast p1, Lt5/f0;

    .line 2
    .line 3
    new-instance p2, Lz4/n;

    .line 4
    .line 5
    iget-wide p3, p1, Lt5/f0;->a:J

    .line 6
    .line 7
    iget-object p3, p1, Lt5/f0;->d:Lt5/j0;

    .line 8
    .line 9
    iget-object p4, p3, Lt5/j0;->c:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object p3, p3, Lt5/j0;->d:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p2, p3}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    const-string p3, "_HLS_msn"

    .line 17
    .line 18
    invoke-virtual {p4, p3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/4 p4, 0x0

    .line 23
    const/4 p5, 0x1

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    move p3, p5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p3, p4

    .line 29
    :goto_0
    instance-of v0, p6, Lf5/h$a;

    .line 30
    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    :cond_1
    const p3, 0x7fffffff

    .line 36
    .line 37
    .line 38
    instance-of v1, p6, Lt5/z;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move-object p3, p6

    .line 43
    check-cast p3, Lt5/z;

    .line 44
    .line 45
    iget p3, p3, Lt5/z;->d:I

    .line 46
    .line 47
    :cond_2
    if-nez v0, :cond_7

    .line 48
    .line 49
    const/16 v0, 0x190

    .line 50
    .line 51
    if-eq p3, v0, :cond_7

    .line 52
    .line 53
    const/16 v0, 0x1f7

    .line 54
    .line 55
    if-ne p3, v0, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    new-instance p3, Lt5/c0$c;

    .line 59
    .line 60
    invoke-direct {p3, p6, p7}, Lt5/c0$c;-><init>(Ljava/io/IOException;I)V

    .line 61
    .line 62
    .line 63
    iget-object p7, p0, Lf5/b$b;->s:Lf5/b;

    .line 64
    .line 65
    iget-object v0, p0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 66
    .line 67
    iget-object p7, p7, Lf5/b;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 68
    .line 69
    invoke-virtual {p7}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p7

    .line 73
    move v1, p4

    .line 74
    :goto_1
    invoke-interface {p7}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-interface {p7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lf5/j$a;

    .line 85
    .line 86
    invoke-interface {v2, v0, p3, p4}, Lf5/j$a;->a(Landroid/net/Uri;Lt5/c0$c;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    xor-int/2addr v2, p5

    .line 91
    or-int/2addr v1, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    if-eqz v1, :cond_6

    .line 94
    .line 95
    iget-object p7, p0, Lf5/b$b;->s:Lf5/b;

    .line 96
    .line 97
    iget-object p7, p7, Lf5/b;->c:Lt5/c0;

    .line 98
    .line 99
    check-cast p7, Lt5/u;

    .line 100
    .line 101
    invoke-virtual {p7, p3}, Lt5/u;->c(Lt5/c0$c;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    cmp-long p3, v0, v2

    .line 111
    .line 112
    if-eqz p3, :cond_5

    .line 113
    .line 114
    new-instance p3, Lt5/d0$b;

    .line 115
    .line 116
    invoke-direct {p3, p4, v0, v1}, Lt5/d0$b;-><init>(IJ)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    sget-object p3, Lt5/d0;->f:Lt5/d0$b;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    sget-object p3, Lt5/d0;->e:Lt5/d0$b;

    .line 124
    .line 125
    :goto_2
    invoke-virtual {p3}, Lt5/d0$b;->a()Z

    .line 126
    .line 127
    .line 128
    move-result p4

    .line 129
    xor-int/2addr p4, p5

    .line 130
    iget-object p5, p0, Lf5/b$b;->s:Lf5/b;

    .line 131
    .line 132
    iget-object p5, p5, Lf5/b;->f:Lz4/w$a;

    .line 133
    .line 134
    iget p1, p1, Lt5/f0;->c:I

    .line 135
    .line 136
    invoke-virtual {p5, p2, p1, p6, p4}, Lz4/w$a;->k(Lz4/n;ILjava/io/IOException;Z)V

    .line 137
    .line 138
    .line 139
    if-eqz p4, :cond_8

    .line 140
    .line 141
    iget-object p1, p0, Lf5/b$b;->s:Lf5/b;

    .line 142
    .line 143
    iget-object p1, p1, Lf5/b;->c:Lt5/c0;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 150
    .line 151
    .line 152
    move-result-wide p3

    .line 153
    iput-wide p3, p0, Lf5/b$b;->o:J

    .line 154
    .line 155
    iget-object p3, p0, Lf5/b$b;->a:Landroid/net/Uri;

    .line 156
    .line 157
    invoke-virtual {p0, p3}, Lf5/b$b;->c(Landroid/net/Uri;)V

    .line 158
    .line 159
    .line 160
    iget-object p3, p0, Lf5/b$b;->s:Lf5/b;

    .line 161
    .line 162
    iget-object p3, p3, Lf5/b;->f:Lz4/w$a;

    .line 163
    .line 164
    sget p4, Lv5/e0;->a:I

    .line 165
    .line 166
    iget p1, p1, Lt5/f0;->c:I

    .line 167
    .line 168
    invoke-virtual {p3, p2, p1, p6, p5}, Lz4/w$a;->k(Lz4/n;ILjava/io/IOException;Z)V

    .line 169
    .line 170
    .line 171
    sget-object p3, Lt5/d0;->e:Lt5/d0$b;

    .line 172
    .line 173
    :cond_8
    :goto_4
    return-object p3
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
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
.end method
