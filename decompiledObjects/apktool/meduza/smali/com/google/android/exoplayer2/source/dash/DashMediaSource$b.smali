.class public final Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;
.super Lv3/r1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:J

.field public final o:J

.field public final p:J

.field public final q:Ld5/c;

.field public final r:Lv3/o0;

.field public final s:Lv3/o0$e;


# direct methods
.method public constructor <init>(JJJIJJJLd5/c;Lv3/o0;Lv3/o0$e;)V
    .locals 7

    move-object v0, p0

    move-object/from16 v1, p14

    move-object/from16 v2, p16

    invoke-direct {p0}, Lv3/r1;-><init>()V

    iget-boolean v3, v1, Ld5/c;->d:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    move v6, v4

    goto :goto_0

    :cond_0
    move v6, v5

    :goto_0
    if-ne v3, v6, :cond_1

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    invoke-static {v4}, Lx6/b;->H(Z)V

    move-wide v3, p1

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->b:J

    move-wide v3, p3

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->c:J

    move-wide v3, p5

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->d:J

    move v3, p7

    iput v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->e:I

    move-wide v3, p8

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->f:J

    move-wide/from16 v3, p10

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->o:J

    move-wide/from16 v3, p12

    iput-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->p:J

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->r:Lv3/o0;

    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->s:Lv3/o0$e;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->e:I

    sub-int/2addr p1, v0

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->h()I

    move-result v0

    if-lt p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final f(ILv3/r1$b;Z)Lv3/r1$b;
    .locals 12

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->h()I

    move-result v0

    invoke-static {p1, v0}, Lx6/b;->x(II)V

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    invoke-virtual {v1, p1}, Ld5/c;->b(I)Ld5/g;

    move-result-object v1

    iget-object v1, v1, Ld5/g;->a:Ljava/lang/String;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-eqz p3, :cond_1

    iget p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->e:I

    add-int/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    move-object v4, v0

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    invoke-virtual {p3, p1}, Ld5/c;->e(I)J

    move-result-wide v6

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    invoke-virtual {p3, p1}, Ld5/c;->b(I)Ld5/g;

    move-result-object p1

    iget-wide v0, p1, Ld5/g;->b:J

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ld5/c;->b(I)Ld5/g;

    move-result-object p1

    iget-wide v8, p1, Ld5/g;->b:J

    sub-long/2addr v0, v8

    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    move-result-wide v0

    iget-wide v8, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->f:J

    sub-long v8, v0, v8

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La5/a;->o:La5/a;

    const/4 v5, 0x0

    const/4 v11, 0x0

    move-object v2, p2

    invoke-virtual/range {v2 .. v11}, Lv3/r1$b;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLa5/a;Z)V

    return-object p2
.end method

.method public final h()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    invoke-virtual {v0}, Ld5/c;->c()I

    move-result v0

    return v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->h()I

    move-result v0

    invoke-static {p1, v0}, Lx6/b;->x(II)V

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->e:I

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final n(ILv3/r1$c;J)Lv3/r1$c;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move/from16 v2, p1

    .line 5
    .line 6
    invoke-static {v2, v1}, Lx6/b;->x(II)V

    .line 7
    .line 8
    .line 9
    iget-wide v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->p:J

    .line 10
    .line 11
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    .line 12
    .line 13
    iget-boolean v5, v4, Ld5/c;->d:Z

    .line 14
    .line 15
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget-wide v9, v4, Ld5/c;->e:J

    .line 24
    .line 25
    cmp-long v5, v9, v6

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget-wide v9, v4, Ld5/c;->b:J

    .line 30
    .line 31
    cmp-long v5, v9, v6

    .line 32
    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    move v5, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v8

    .line 38
    :goto_0
    const/4 v9, -0x1

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    :cond_1
    :goto_1
    move-wide/from16 v29, v2

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_2
    const-wide/16 v10, 0x0

    .line 46
    .line 47
    cmp-long v5, p3, v10

    .line 48
    .line 49
    if-lez v5, :cond_3

    .line 50
    .line 51
    add-long v2, v2, p3

    .line 52
    .line 53
    iget-wide v12, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->o:J

    .line 54
    .line 55
    cmp-long v5, v2, v12

    .line 56
    .line 57
    if-lez v5, :cond_3

    .line 58
    .line 59
    move-wide/from16 v29, v6

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_3
    iget-wide v12, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->f:J

    .line 64
    .line 65
    add-long/2addr v12, v2

    .line 66
    invoke-virtual {v4, v8}, Ld5/c;->e(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    move v14, v8

    .line 71
    :goto_2
    iget-object v15, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    .line 72
    .line 73
    invoke-virtual {v15}, Ld5/c;->c()I

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    add-int/2addr v15, v9

    .line 78
    if-ge v14, v15, :cond_4

    .line 79
    .line 80
    cmp-long v15, v12, v4

    .line 81
    .line 82
    if-ltz v15, :cond_4

    .line 83
    .line 84
    sub-long/2addr v12, v4

    .line 85
    add-int/lit8 v14, v14, 0x1

    .line 86
    .line 87
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    .line 88
    .line 89
    invoke-virtual {v4, v14}, Ld5/c;->e(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget-object v15, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    .line 95
    .line 96
    invoke-virtual {v15, v14}, Ld5/c;->b(I)Ld5/g;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    const/4 v15, 0x2

    .line 101
    iget-object v1, v14, Ld5/g;->c:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    move v6, v8

    .line 108
    :goto_3
    if-ge v6, v1, :cond_6

    .line 109
    .line 110
    iget-object v7, v14, Ld5/g;->c:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    check-cast v7, Ld5/a;

    .line 117
    .line 118
    iget v7, v7, Ld5/a;->b:I

    .line 119
    .line 120
    if-ne v7, v15, :cond_5

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    move v6, v9

    .line 127
    :goto_4
    if-ne v6, v9, :cond_7

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    iget-object v1, v14, Ld5/g;->c:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ld5/a;

    .line 137
    .line 138
    iget-object v1, v1, Ld5/a;->c:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Ld5/j;

    .line 145
    .line 146
    invoke-virtual {v1}, Ld5/j;->l()Lc5/c;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-eqz v1, :cond_1

    .line 151
    .line 152
    invoke-interface {v1, v4, v5}, Lc5/c;->j(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    cmp-long v6, v6, v10

    .line 157
    .line 158
    if-nez v6, :cond_8

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    invoke-interface {v1, v12, v13, v4, v5}, Lc5/c;->g(JJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    invoke-interface {v1, v4, v5}, Lc5/c;->a(J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    add-long/2addr v4, v2

    .line 170
    sub-long v2, v4, v12

    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    :goto_5
    sget-object v17, Lv3/r1$c;->z:Ljava/lang/Object;

    .line 175
    .line 176
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->r:Lv3/o0;

    .line 177
    .line 178
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->q:Ld5/c;

    .line 179
    .line 180
    iget-wide v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->b:J

    .line 181
    .line 182
    iget-wide v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->c:J

    .line 183
    .line 184
    iget-wide v10, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->d:J

    .line 185
    .line 186
    const/16 v26, 0x1

    .line 187
    .line 188
    iget-boolean v7, v2, Ld5/c;->d:Z

    .line 189
    .line 190
    if-eqz v7, :cond_9

    .line 191
    .line 192
    iget-wide v12, v2, Ld5/c;->e:J

    .line 193
    .line 194
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    cmp-long v7, v12, v14

    .line 200
    .line 201
    if-eqz v7, :cond_9

    .line 202
    .line 203
    iget-wide v12, v2, Ld5/c;->b:J

    .line 204
    .line 205
    cmp-long v7, v12, v14

    .line 206
    .line 207
    if-nez v7, :cond_9

    .line 208
    .line 209
    const/16 v27, 0x1

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_9
    move/from16 v27, v8

    .line 213
    .line 214
    :goto_6
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->s:Lv3/o0$e;

    .line 215
    .line 216
    move-object/from16 v28, v7

    .line 217
    .line 218
    iget-wide v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->o:J

    .line 219
    .line 220
    move-wide/from16 v31, v7

    .line 221
    .line 222
    const/16 v33, 0x0

    .line 223
    .line 224
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->h()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    add-int/lit8 v34, v7, -0x1

    .line 229
    .line 230
    iget-wide v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;->f:J

    .line 231
    .line 232
    move-wide/from16 v35, v7

    .line 233
    .line 234
    move-object/from16 v16, p2

    .line 235
    .line 236
    move-object/from16 v18, v1

    .line 237
    .line 238
    move-object/from16 v19, v2

    .line 239
    .line 240
    move-wide/from16 v20, v3

    .line 241
    .line 242
    move-wide/from16 v22, v5

    .line 243
    .line 244
    move-wide/from16 v24, v10

    .line 245
    .line 246
    invoke-virtual/range {v16 .. v36}, Lv3/r1$c;->b(Ljava/lang/Object;Lv3/o0;Ljava/lang/Object;JJJZZLv3/o0$e;JJIIJ)V

    .line 247
    .line 248
    .line 249
    return-object p2
    .line 250
    .line 251
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
