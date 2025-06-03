.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lz4/a;
.source "SourceFile"

# interfaces
.implements Lf5/j$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field public final A:Lv3/o0;

.field public B:Lv3/o0$e;

.field public C:Lt5/l0;

.field public final p:Le5/i;

.field public final q:Lv3/o0$g;

.field public final r:Le5/h;

.field public final s:Lz4/i;

.field public final t:La4/h;

.field public final u:Lt5/c0;

.field public final v:Z

.field public final w:I

.field public final x:Z

.field public final y:Lf5/j;

.field public final z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Lv3/h0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lv3/o0;Le5/h;Le5/d;Lz4/i;La4/h;Lt5/u;Lf5/b;JZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz4/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lv3/o0$g;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Lv3/o0;

    .line 12
    .line 13
    iget-object p1, p1, Lv3/o0;->c:Lv3/o0$e;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Le5/h;

    .line 18
    .line 19
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Le5/i;

    .line 20
    .line 21
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lz4/i;

    .line 22
    .line 23
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:La4/h;

    .line 24
    .line 25
    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lt5/c0;

    .line 26
    .line 27
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 28
    .line 29
    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:J

    .line 30
    .line 31
    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Z

    .line 32
    .line 33
    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Z

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static x(JLo7/t;)Lf5/e$a;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf5/e$a;

    iget-wide v3, v2, Lf5/e$d;->e:J

    cmp-long v3, v3, p0

    if-gtz v3, :cond_0

    iget-boolean v4, v2, Lf5/e$a;->t:Z

    if-eqz v4, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    if-lez v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final f()Lv3/o0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Lv3/o0;

    return-object v0
.end method

.method public final g(Lz4/r;)V
    .locals 12

    .line 1
    check-cast p1, Le5/l;

    .line 2
    .line 3
    iget-object v0, p1, Le5/l;->b:Lf5/j;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lf5/j;->c(Lf5/j$a;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Le5/l;->C:[Le5/n;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x0

    .line 14
    if-ge v3, v1, :cond_2

    .line 15
    .line 16
    aget-object v5, v0, v3

    .line 17
    .line 18
    iget-boolean v6, v5, Le5/n;->L:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    iget-object v6, v5, Le5/n;->D:[Le5/n$c;

    .line 23
    .line 24
    array-length v7, v6

    .line 25
    move v8, v2

    .line 26
    :goto_1
    if-ge v8, v7, :cond_1

    .line 27
    .line 28
    aget-object v9, v6, v8

    .line 29
    .line 30
    invoke-virtual {v9}, Lz4/b0;->h()V

    .line 31
    .line 32
    .line 33
    iget-object v10, v9, Lz4/b0;->h:La4/e;

    .line 34
    .line 35
    if-eqz v10, :cond_0

    .line 36
    .line 37
    iget-object v11, v9, Lz4/b0;->e:La4/g$a;

    .line 38
    .line 39
    invoke-interface {v10, v11}, La4/e;->f(La4/g$a;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, v9, Lz4/b0;->h:La4/e;

    .line 43
    .line 44
    iput-object v4, v9, Lz4/b0;->g:Lv3/i0;

    .line 45
    .line 46
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v5, Le5/n;->r:Lt5/d0;

    .line 50
    .line 51
    invoke-virtual {v6, v5}, Lt5/d0;->e(Lt5/d0$e;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v5, Le5/n;->z:Landroid/os/Handler;

    .line 55
    .line 56
    invoke-virtual {v6, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    iput-boolean v4, v5, Le5/n;->P:Z

    .line 61
    .line 62
    iget-object v4, v5, Le5/n;->A:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iput-object v4, p1, Le5/l;->z:Lz4/r$a;

    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    invoke-interface {v0}, Lf5/j;->j()V

    return-void
.end method

.method public final o(Lz4/t$b;Lt5/b;J)Lz4/r;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Lz4/a;->q(Lz4/t$b;)Lz4/w$a;

    .line 4
    .line 5
    .line 6
    move-result-object v9

    .line 7
    iget-object v1, v0, Lz4/a;->d:La4/g$a;

    .line 8
    .line 9
    new-instance v7, La4/g$a;

    .line 10
    .line 11
    iget-object v1, v1, La4/g$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move-object/from16 v3, p1

    .line 15
    .line 16
    invoke-direct {v7, v1, v2, v3}, La4/g$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;)V

    .line 17
    .line 18
    .line 19
    new-instance v16, Le5/l;

    .line 20
    .line 21
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Le5/i;

    .line 22
    .line 23
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 24
    .line 25
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Le5/h;

    .line 26
    .line 27
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lt5/l0;

    .line 28
    .line 29
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:La4/h;

    .line 30
    .line 31
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lt5/c0;

    .line 32
    .line 33
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lz4/i;

    .line 34
    .line 35
    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Z

    .line 36
    .line 37
    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:I

    .line 38
    .line 39
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Z

    .line 40
    .line 41
    iget-object v15, v0, Lz4/a;->o:Lw3/a0;

    .line 42
    .line 43
    invoke-static {v15}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v1, v16

    .line 47
    .line 48
    move-object/from16 v10, p2

    .line 49
    .line 50
    invoke-direct/range {v1 .. v15}, Le5/l;-><init>(Le5/i;Lf5/j;Le5/h;Lt5/l0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;Lt5/b;Lz4/i;ZIZLw3/a0;)V

    .line 51
    .line 52
    .line 53
    return-object v16
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
.end method

.method public final t(Lt5/l0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lt5/l0;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:La4/h;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lz4/a;->o:Lw3/a0;

    .line 13
    .line 14
    invoke-static {v1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, La4/h;->c(Landroid/os/Looper;Lw3/a0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:La4/h;

    .line 21
    .line 22
    invoke-interface {p1}, La4/h;->a()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Lz4/a;->q(Lz4/t$b;)Lz4/w$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lv3/o0$g;

    .line 33
    .line 34
    iget-object v1, v1, Lv3/o0$f;->a:Landroid/net/Uri;

    .line 35
    .line 36
    invoke-interface {v0, v1, p1, p0}, Lf5/j;->f(Landroid/net/Uri;Lz4/w$a;Lf5/j$d;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public final w()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    invoke-interface {v0}, Lf5/j;->stop()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:La4/h;

    invoke-interface {v0}, La4/h;->release()V

    return-void
.end method

.method public final y(Lf5/e;)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lf5/e;->p:Z

    .line 6
    .line 7
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-wide v5, v1, Lf5/e;->h:J

    .line 15
    .line 16
    invoke-static {v5, v6}, Lv5/e0;->R(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    move-wide v10, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v10, v3

    .line 23
    :goto_0
    iget v2, v1, Lf5/e;->d:I

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x1

    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    if-ne v2, v6, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-wide v8, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    move-wide v8, v10

    .line 35
    :goto_2
    new-instance v2, Lx6/b;

    .line 36
    .line 37
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 38
    .line 39
    invoke-interface {v7}, Lf5/j;->h()Lf5/f;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v7}, Lx6/b;-><init>(Lf5/f;)V

    .line 47
    .line 48
    .line 49
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 50
    .line 51
    invoke-interface {v7}, Lf5/j;->g()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_13

    .line 56
    .line 57
    iget-wide v14, v1, Lf5/e;->h:J

    .line 58
    .line 59
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lf5/j;

    .line 60
    .line 61
    invoke-interface {v7}, Lf5/j;->e()J

    .line 62
    .line 63
    .line 64
    move-result-wide v16

    .line 65
    sub-long v16, v14, v16

    .line 66
    .line 67
    iget-boolean v7, v1, Lf5/e;->o:Z

    .line 68
    .line 69
    if-eqz v7, :cond_3

    .line 70
    .line 71
    iget-wide v14, v1, Lf5/e;->u:J

    .line 72
    .line 73
    add-long v14, v16, v14

    .line 74
    .line 75
    move-wide/from16 v18, v14

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-wide/from16 v18, v3

    .line 79
    .line 80
    :goto_3
    iget-boolean v7, v1, Lf5/e;->p:Z

    .line 81
    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    iget-wide v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:J

    .line 85
    .line 86
    invoke-static {v14, v15}, Lv5/e0;->u(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v14

    .line 90
    invoke-static {v14, v15}, Lv5/e0;->I(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v14

    .line 94
    iget-wide v12, v1, Lf5/e;->h:J

    .line 95
    .line 96
    iget-wide v5, v1, Lf5/e;->u:J

    .line 97
    .line 98
    add-long/2addr v12, v5

    .line 99
    sub-long/2addr v14, v12

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    const-wide/16 v14, 0x0

    .line 102
    .line 103
    :goto_4
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 104
    .line 105
    iget-wide v5, v5, Lv3/o0$e;->a:J

    .line 106
    .line 107
    cmp-long v12, v5, v3

    .line 108
    .line 109
    if-eqz v12, :cond_5

    .line 110
    .line 111
    invoke-static {v5, v6}, Lv5/e0;->I(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    move-wide/from16 v23, v5

    .line 116
    .line 117
    move-wide/from16 v29, v8

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_5
    iget-object v5, v1, Lf5/e;->v:Lf5/e$e;

    .line 121
    .line 122
    iget-wide v12, v1, Lf5/e;->e:J

    .line 123
    .line 124
    cmp-long v6, v12, v3

    .line 125
    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    iget-wide v5, v1, Lf5/e;->u:J

    .line 129
    .line 130
    sub-long/2addr v5, v12

    .line 131
    move-wide/from16 v29, v8

    .line 132
    .line 133
    move-wide v7, v5

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    iget-wide v12, v5, Lf5/e$e;->d:J

    .line 136
    .line 137
    cmp-long v6, v12, v3

    .line 138
    .line 139
    move-wide/from16 v29, v8

    .line 140
    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    iget-wide v7, v1, Lf5/e;->n:J

    .line 144
    .line 145
    cmp-long v7, v7, v3

    .line 146
    .line 147
    if-eqz v7, :cond_7

    .line 148
    .line 149
    move-wide v7, v12

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    iget-wide v7, v5, Lf5/e$e;->c:J

    .line 152
    .line 153
    cmp-long v5, v7, v3

    .line 154
    .line 155
    if-eqz v5, :cond_8

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_8
    const-wide/16 v7, 0x3

    .line 159
    .line 160
    iget-wide v12, v1, Lf5/e;->m:J

    .line 161
    .line 162
    mul-long/2addr v7, v12

    .line 163
    :goto_5
    add-long/2addr v7, v14

    .line 164
    move-wide/from16 v23, v7

    .line 165
    .line 166
    :goto_6
    iget-wide v7, v1, Lf5/e;->u:J

    .line 167
    .line 168
    add-long v27, v7, v14

    .line 169
    .line 170
    move-wide/from16 v25, v14

    .line 171
    .line 172
    invoke-static/range {v23 .. v28}, Lv5/e0;->j(JJJ)J

    .line 173
    .line 174
    .line 175
    move-result-wide v7

    .line 176
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Lv3/o0;

    .line 177
    .line 178
    iget-object v5, v5, Lv3/o0;->c:Lv3/o0$e;

    .line 179
    .line 180
    iget v9, v5, Lv3/o0$e;->d:F

    .line 181
    .line 182
    const v12, -0x800001

    .line 183
    .line 184
    .line 185
    cmpl-float v9, v9, v12

    .line 186
    .line 187
    if-nez v9, :cond_9

    .line 188
    .line 189
    iget v5, v5, Lv3/o0$e;->e:F

    .line 190
    .line 191
    cmpl-float v5, v5, v12

    .line 192
    .line 193
    if-nez v5, :cond_9

    .line 194
    .line 195
    iget-object v5, v1, Lf5/e;->v:Lf5/e$e;

    .line 196
    .line 197
    move-wide/from16 v23, v14

    .line 198
    .line 199
    iget-wide v13, v5, Lf5/e$e;->c:J

    .line 200
    .line 201
    cmp-long v12, v13, v3

    .line 202
    .line 203
    if-nez v12, :cond_a

    .line 204
    .line 205
    iget-wide v12, v5, Lf5/e$e;->d:J

    .line 206
    .line 207
    cmp-long v5, v12, v3

    .line 208
    .line 209
    if-nez v5, :cond_a

    .line 210
    .line 211
    const/4 v5, 0x1

    .line 212
    goto :goto_7

    .line 213
    :cond_9
    move-wide/from16 v23, v14

    .line 214
    .line 215
    :cond_a
    const/4 v5, 0x0

    .line 216
    :goto_7
    const-wide v36, -0x7fffffffffffffffL    # -4.9E-324

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    invoke-static {v7, v8}, Lv5/e0;->R(J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v7

    .line 225
    const/high16 v12, 0x3f800000    # 1.0f

    .line 226
    .line 227
    if-eqz v5, :cond_b

    .line 228
    .line 229
    move/from16 v38, v12

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_b
    iget-object v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 233
    .line 234
    iget v13, v13, Lv3/o0$e;->d:F

    .line 235
    .line 236
    move/from16 v38, v13

    .line 237
    .line 238
    :goto_8
    if-eqz v5, :cond_c

    .line 239
    .line 240
    move/from16 v39, v12

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_c
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 244
    .line 245
    iget v5, v5, Lv3/o0$e;->e:F

    .line 246
    .line 247
    move/from16 v39, v5

    .line 248
    .line 249
    :goto_9
    new-instance v5, Lv3/o0$e;

    .line 250
    .line 251
    move-object/from16 v31, v5

    .line 252
    .line 253
    move-wide/from16 v32, v7

    .line 254
    .line 255
    move-wide/from16 v34, v36

    .line 256
    .line 257
    invoke-direct/range {v31 .. v39}, Lv3/o0$e;-><init>(JJJFF)V

    .line 258
    .line 259
    .line 260
    iput-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 261
    .line 262
    iget-wide v12, v1, Lf5/e;->e:J

    .line 263
    .line 264
    cmp-long v3, v12, v3

    .line 265
    .line 266
    if-eqz v3, :cond_d

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_d
    iget-wide v3, v1, Lf5/e;->u:J

    .line 270
    .line 271
    add-long v3, v3, v23

    .line 272
    .line 273
    invoke-static {v7, v8}, Lv5/e0;->I(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v7

    .line 277
    sub-long v12, v3, v7

    .line 278
    .line 279
    :goto_a
    iget-boolean v3, v1, Lf5/e;->g:Z

    .line 280
    .line 281
    if-eqz v3, :cond_e

    .line 282
    .line 283
    move-wide v3, v12

    .line 284
    goto :goto_c

    .line 285
    :cond_e
    iget-object v3, v1, Lf5/e;->s:Lo7/t;

    .line 286
    .line 287
    invoke-static {v12, v13, v3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x(JLo7/t;)Lf5/e$a;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    if-eqz v3, :cond_f

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_f
    iget-object v3, v1, Lf5/e;->r:Lo7/t;

    .line 295
    .line 296
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_10

    .line 301
    .line 302
    const-wide/16 v3, 0x0

    .line 303
    .line 304
    goto :goto_c

    .line 305
    :cond_10
    iget-object v3, v1, Lf5/e;->r:Lo7/t;

    .line 306
    .line 307
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    const/4 v5, 0x1

    .line 312
    invoke-static {v3, v4, v5}, Lv5/e0;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Lf5/e$c;

    .line 321
    .line 322
    iget-object v4, v3, Lf5/e$c;->u:Lo7/t;

    .line 323
    .line 324
    invoke-static {v12, v13, v4}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x(JLo7/t;)Lf5/e$a;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    if-eqz v4, :cond_11

    .line 329
    .line 330
    iget-wide v3, v4, Lf5/e$d;->e:J

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_11
    :goto_b
    iget-wide v3, v3, Lf5/e$d;->e:J

    .line 334
    .line 335
    :goto_c
    iget v5, v1, Lf5/e;->d:I

    .line 336
    .line 337
    const/4 v6, 0x2

    .line 338
    if-ne v5, v6, :cond_12

    .line 339
    .line 340
    iget-boolean v5, v1, Lf5/e;->f:Z

    .line 341
    .line 342
    if-eqz v5, :cond_12

    .line 343
    .line 344
    const/4 v5, 0x1

    .line 345
    goto :goto_d

    .line 346
    :cond_12
    const/4 v5, 0x0

    .line 347
    :goto_d
    new-instance v6, Lz4/g0;

    .line 348
    .line 349
    move-object v7, v6

    .line 350
    iget-wide v14, v1, Lf5/e;->u:J

    .line 351
    .line 352
    const/16 v20, 0x1

    .line 353
    .line 354
    iget-boolean v1, v1, Lf5/e;->o:Z

    .line 355
    .line 356
    const/4 v8, 0x1

    .line 357
    xor-int/lit8 v21, v1, 0x1

    .line 358
    .line 359
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Lv3/o0;

    .line 360
    .line 361
    move-object/from16 v24, v1

    .line 362
    .line 363
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lv3/o0$e;

    .line 364
    .line 365
    move-object/from16 v25, v1

    .line 366
    .line 367
    move-wide/from16 v8, v29

    .line 368
    .line 369
    move-wide/from16 v12, v18

    .line 370
    .line 371
    move-wide/from16 v18, v3

    .line 372
    .line 373
    move/from16 v22, v5

    .line 374
    .line 375
    move-object/from16 v23, v2

    .line 376
    .line 377
    invoke-direct/range {v7 .. v25}, Lz4/g0;-><init>(JJJJJJZZZLjava/lang/Object;Lv3/o0;Lv3/o0$e;)V

    .line 378
    .line 379
    .line 380
    goto :goto_12

    .line 381
    :cond_13
    move-wide/from16 v29, v8

    .line 382
    .line 383
    iget-wide v5, v1, Lf5/e;->e:J

    .line 384
    .line 385
    cmp-long v3, v5, v3

    .line 386
    .line 387
    if-eqz v3, :cond_17

    .line 388
    .line 389
    iget-object v3, v1, Lf5/e;->r:Lo7/t;

    .line 390
    .line 391
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-eqz v3, :cond_14

    .line 396
    .line 397
    goto :goto_10

    .line 398
    :cond_14
    iget-boolean v3, v1, Lf5/e;->g:Z

    .line 399
    .line 400
    if-nez v3, :cond_16

    .line 401
    .line 402
    iget-wide v3, v1, Lf5/e;->e:J

    .line 403
    .line 404
    iget-wide v5, v1, Lf5/e;->u:J

    .line 405
    .line 406
    cmp-long v5, v3, v5

    .line 407
    .line 408
    if-nez v5, :cond_15

    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_15
    iget-object v5, v1, Lf5/e;->r:Lo7/t;

    .line 412
    .line 413
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    const/4 v4, 0x1

    .line 418
    invoke-static {v5, v3, v4}, Lv5/e0;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    check-cast v3, Lf5/e$c;

    .line 427
    .line 428
    iget-wide v3, v3, Lf5/e$d;->e:J

    .line 429
    .line 430
    goto :goto_f

    .line 431
    :cond_16
    :goto_e
    iget-wide v3, v1, Lf5/e;->e:J

    .line 432
    .line 433
    :goto_f
    move-wide/from16 v18, v3

    .line 434
    .line 435
    goto :goto_11

    .line 436
    :cond_17
    :goto_10
    const-wide/16 v18, 0x0

    .line 437
    .line 438
    :goto_11
    new-instance v6, Lz4/g0;

    .line 439
    .line 440
    move-object v7, v6

    .line 441
    iget-wide v14, v1, Lf5/e;->u:J

    .line 442
    .line 443
    move-wide v12, v14

    .line 444
    const-wide/16 v16, 0x0

    .line 445
    .line 446
    const/16 v20, 0x1

    .line 447
    .line 448
    const/16 v21, 0x0

    .line 449
    .line 450
    const/16 v22, 0x1

    .line 451
    .line 452
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Lv3/o0;

    .line 453
    .line 454
    move-object/from16 v24, v1

    .line 455
    .line 456
    const/16 v25, 0x0

    .line 457
    .line 458
    move-wide/from16 v8, v29

    .line 459
    .line 460
    move-object/from16 v23, v2

    .line 461
    .line 462
    invoke-direct/range {v7 .. v25}, Lz4/g0;-><init>(JJJJJJZZZLjava/lang/Object;Lv3/o0;Lv3/o0$e;)V

    .line 463
    .line 464
    .line 465
    :goto_12
    invoke-virtual {v0, v6}, Lz4/a;->v(Lv3/r1;)V

    .line 466
    .line 467
    .line 468
    return-void
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
.end method
