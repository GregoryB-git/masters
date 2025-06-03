.class public final Ll4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# instance fields
.field public a:Lc4/j;

.field public b:Ll4/h;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc4/i;)Z
    .locals 8

    .line 1
    new-instance v0, Ll4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ll4/e;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, Ll4/e;->a(Lc4/i;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    iget v2, v0, Ll4/e;->a:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    iget v0, v0, Ll4/e;->e:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Lv5/u;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lv5/u;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, Lv5/u;->a:[B

    .line 35
    .line 36
    invoke-interface {p1, v4, v3, v0}, Lc4/i;->m([BII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lv5/u;->G(I)V

    .line 40
    .line 41
    .line 42
    iget p1, v2, Lv5/u;->c:I

    .line 43
    .line 44
    iget v0, v2, Lv5/u;->b:I

    .line 45
    .line 46
    sub-int/2addr p1, v0

    .line 47
    const/4 v0, 0x5

    .line 48
    if-lt p1, v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/16 v0, 0x7f

    .line 55
    .line 56
    if-ne p1, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2}, Lv5/u;->w()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/32 v6, 0x464c4143

    .line 63
    .line 64
    .line 65
    cmp-long p1, v4, v6

    .line 66
    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    move p1, v1

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move p1, v3

    .line 72
    :goto_0
    if-eqz p1, :cond_2

    .line 73
    .line 74
    new-instance p1, Ll4/b;

    .line 75
    .line 76
    invoke-direct {p1}, Ll4/b;-><init>()V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v2, v3}, Lv5/u;->G(I)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    invoke-static {v1, v2, v1}, Lc4/y;->c(ILv5/u;Z)Z

    .line 84
    .line 85
    .line 86
    move-result p1
    :try_end_0
    .catch Lv3/a1; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_1

    .line 88
    :catch_0
    move p1, v3

    .line 89
    :goto_1
    if-eqz p1, :cond_3

    .line 90
    .line 91
    new-instance p1, Ll4/i;

    .line 92
    .line 93
    invoke-direct {p1}, Ll4/i;-><init>()V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-virtual {v2, v3}, Lv5/u;->G(I)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Ll4/g;->o:[B

    .line 101
    .line 102
    invoke-static {v2, p1}, Ll4/g;->e(Lv5/u;[B)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    new-instance p1, Ll4/g;

    .line 109
    .line 110
    invoke-direct {p1}, Ll4/g;-><init>()V

    .line 111
    .line 112
    .line 113
    :goto_2
    iput-object p1, p0, Ll4/c;->b:Ll4/h;

    .line 114
    .line 115
    return v1

    .line 116
    :cond_4
    :goto_3
    return v3
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

.method public final b(Lc4/j;)V
    .locals 0

    iput-object p1, p0, Ll4/c;->a:Lc4/j;

    return-void
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ll4/c;->a:Lc4/j;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Ll4/c;->b:Ll4/h;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p1}, Ll4/c;->a(Lc4/i;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "Failed to determine bitstream type"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    throw v1

    .line 32
    :cond_1
    :goto_0
    iget-boolean v2, v0, Ll4/c;->c:Z

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    iget-object v2, v0, Ll4/c;->a:Lc4/j;

    .line 39
    .line 40
    invoke-interface {v2, v3, v4}, Lc4/j;->r(II)Lc4/v;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v5, v0, Ll4/c;->a:Lc4/j;

    .line 45
    .line 46
    invoke-interface {v5}, Lc4/j;->m()V

    .line 47
    .line 48
    .line 49
    iget-object v5, v0, Ll4/c;->b:Ll4/h;

    .line 50
    .line 51
    iget-object v6, v0, Ll4/c;->a:Lc4/j;

    .line 52
    .line 53
    iput-object v6, v5, Ll4/h;->c:Lc4/j;

    .line 54
    .line 55
    iput-object v2, v5, Ll4/h;->b:Lc4/v;

    .line 56
    .line 57
    invoke-virtual {v5, v4}, Ll4/h;->d(Z)V

    .line 58
    .line 59
    .line 60
    iput-boolean v4, v0, Ll4/c;->c:Z

    .line 61
    .line 62
    :cond_2
    iget-object v2, v0, Ll4/c;->b:Ll4/h;

    .line 63
    .line 64
    iget-object v5, v2, Ll4/h;->b:Lc4/v;

    .line 65
    .line 66
    invoke-static {v5}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget v5, Lv5/e0;->a:I

    .line 70
    .line 71
    iget v5, v2, Ll4/h;->h:I

    .line 72
    .line 73
    const-wide/16 v6, -0x1

    .line 74
    .line 75
    const/4 v15, 0x2

    .line 76
    const/4 v8, 0x3

    .line 77
    if-eqz v5, :cond_c

    .line 78
    .line 79
    if-eq v5, v4, :cond_b

    .line 80
    .line 81
    if-eq v5, v15, :cond_4

    .line 82
    .line 83
    if-ne v5, v8, :cond_3

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_4
    iget-object v5, v2, Ll4/h;->d:Ll4/f;

    .line 94
    .line 95
    invoke-interface {v5, v1}, Ll4/f;->b(Lc4/i;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    const-wide/16 v11, 0x0

    .line 100
    .line 101
    cmp-long v5, v9, v11

    .line 102
    .line 103
    if-ltz v5, :cond_5

    .line 104
    .line 105
    move-object/from16 v5, p2

    .line 106
    .line 107
    iput-wide v9, v5, Lc4/s;->a:J

    .line 108
    .line 109
    move v3, v4

    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_5
    cmp-long v5, v9, v6

    .line 113
    .line 114
    if-gez v5, :cond_6

    .line 115
    .line 116
    const-wide/16 v13, 0x2

    .line 117
    .line 118
    add-long/2addr v9, v13

    .line 119
    neg-long v9, v9

    .line 120
    invoke-virtual {v2, v9, v10}, Ll4/h;->a(J)V

    .line 121
    .line 122
    .line 123
    :cond_6
    iget-boolean v5, v2, Ll4/h;->l:Z

    .line 124
    .line 125
    if-nez v5, :cond_7

    .line 126
    .line 127
    iget-object v5, v2, Ll4/h;->d:Ll4/f;

    .line 128
    .line 129
    invoke-interface {v5}, Ll4/f;->a()Lc4/t;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-static {v5}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v9, v2, Ll4/h;->c:Lc4/j;

    .line 137
    .line 138
    invoke-interface {v9, v5}, Lc4/j;->t(Lc4/t;)V

    .line 139
    .line 140
    .line 141
    iput-boolean v4, v2, Ll4/h;->l:Z

    .line 142
    .line 143
    :cond_7
    iget-wide v4, v2, Ll4/h;->k:J

    .line 144
    .line 145
    cmp-long v4, v4, v11

    .line 146
    .line 147
    if-gtz v4, :cond_9

    .line 148
    .line 149
    iget-object v4, v2, Ll4/h;->a:Ll4/d;

    .line 150
    .line 151
    invoke-virtual {v4, v1}, Ll4/d;->a(Lc4/i;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_8
    iput v8, v2, Ll4/h;->h:I

    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :cond_9
    :goto_1
    iput-wide v11, v2, Ll4/h;->k:J

    .line 163
    .line 164
    iget-object v1, v2, Ll4/h;->a:Ll4/d;

    .line 165
    .line 166
    iget-object v1, v1, Ll4/d;->b:Lv5/u;

    .line 167
    .line 168
    invoke-virtual {v2, v1}, Ll4/h;->b(Lv5/u;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v4

    .line 172
    cmp-long v8, v4, v11

    .line 173
    .line 174
    if-ltz v8, :cond_a

    .line 175
    .line 176
    iget-wide v8, v2, Ll4/h;->g:J

    .line 177
    .line 178
    add-long v10, v8, v4

    .line 179
    .line 180
    iget-wide v12, v2, Ll4/h;->e:J

    .line 181
    .line 182
    cmp-long v10, v10, v12

    .line 183
    .line 184
    if-ltz v10, :cond_a

    .line 185
    .line 186
    const-wide/32 v10, 0xf4240

    .line 187
    .line 188
    .line 189
    mul-long/2addr v8, v10

    .line 190
    iget v10, v2, Ll4/h;->i:I

    .line 191
    .line 192
    int-to-long v10, v10

    .line 193
    div-long v13, v8, v10

    .line 194
    .line 195
    iget-object v8, v2, Ll4/h;->b:Lc4/v;

    .line 196
    .line 197
    iget v9, v1, Lv5/u;->c:I

    .line 198
    .line 199
    invoke-interface {v8, v9, v1}, Lc4/v;->b(ILv5/u;)V

    .line 200
    .line 201
    .line 202
    iget-object v12, v2, Ll4/h;->b:Lc4/v;

    .line 203
    .line 204
    const/4 v15, 0x1

    .line 205
    iget v1, v1, Lv5/u;->c:I

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    move/from16 v16, v1

    .line 212
    .line 213
    invoke-interface/range {v12 .. v18}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 214
    .line 215
    .line 216
    iput-wide v6, v2, Ll4/h;->e:J

    .line 217
    .line 218
    :cond_a
    iget-wide v6, v2, Ll4/h;->g:J

    .line 219
    .line 220
    add-long/2addr v6, v4

    .line 221
    iput-wide v6, v2, Ll4/h;->g:J

    .line 222
    .line 223
    goto/16 :goto_8

    .line 224
    .line 225
    :cond_b
    iget-wide v4, v2, Ll4/h;->f:J

    .line 226
    .line 227
    long-to-int v4, v4

    .line 228
    invoke-interface {v1, v4}, Lc4/i;->j(I)V

    .line 229
    .line 230
    .line 231
    iput v15, v2, Ll4/h;->h:I

    .line 232
    .line 233
    goto/16 :goto_8

    .line 234
    .line 235
    :cond_c
    :goto_2
    iget-object v5, v2, Ll4/h;->a:Ll4/d;

    .line 236
    .line 237
    invoke-virtual {v5, v1}, Ll4/d;->a(Lc4/i;)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-nez v5, :cond_d

    .line 242
    .line 243
    iput v8, v2, Ll4/h;->h:I

    .line 244
    .line 245
    move v5, v3

    .line 246
    goto :goto_3

    .line 247
    :cond_d
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 248
    .line 249
    .line 250
    move-result-wide v9

    .line 251
    iget-wide v11, v2, Ll4/h;->f:J

    .line 252
    .line 253
    sub-long/2addr v9, v11

    .line 254
    iput-wide v9, v2, Ll4/h;->k:J

    .line 255
    .line 256
    iget-object v5, v2, Ll4/h;->a:Ll4/d;

    .line 257
    .line 258
    iget-object v5, v5, Ll4/d;->b:Lv5/u;

    .line 259
    .line 260
    iget-object v9, v2, Ll4/h;->j:Ll4/h$a;

    .line 261
    .line 262
    invoke-virtual {v2, v5, v11, v12, v9}, Ll4/h;->c(Lv5/u;JLl4/h$a;)Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-eqz v5, :cond_e

    .line 267
    .line 268
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 269
    .line 270
    .line 271
    move-result-wide v9

    .line 272
    iput-wide v9, v2, Ll4/h;->f:J

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_e
    move v5, v4

    .line 276
    :goto_3
    if-nez v5, :cond_f

    .line 277
    .line 278
    :goto_4
    const/4 v3, -0x1

    .line 279
    goto/16 :goto_8

    .line 280
    .line 281
    :cond_f
    iget-object v5, v2, Ll4/h;->j:Ll4/h$a;

    .line 282
    .line 283
    iget-object v5, v5, Ll4/h$a;->a:Lv3/i0;

    .line 284
    .line 285
    iget v8, v5, Lv3/i0;->H:I

    .line 286
    .line 287
    iput v8, v2, Ll4/h;->i:I

    .line 288
    .line 289
    iget-boolean v8, v2, Ll4/h;->m:Z

    .line 290
    .line 291
    if-nez v8, :cond_10

    .line 292
    .line 293
    iget-object v8, v2, Ll4/h;->b:Lc4/v;

    .line 294
    .line 295
    invoke-interface {v8, v5}, Lc4/v;->d(Lv3/i0;)V

    .line 296
    .line 297
    .line 298
    iput-boolean v4, v2, Ll4/h;->m:Z

    .line 299
    .line 300
    :cond_10
    iget-object v5, v2, Ll4/h;->j:Ll4/h$a;

    .line 301
    .line 302
    iget-object v5, v5, Ll4/h$a;->b:Ll4/b$a;

    .line 303
    .line 304
    if-eqz v5, :cond_11

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_11
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 308
    .line 309
    .line 310
    move-result-wide v8

    .line 311
    cmp-long v5, v8, v6

    .line 312
    .line 313
    if-nez v5, :cond_12

    .line 314
    .line 315
    new-instance v5, Ll4/h$b;

    .line 316
    .line 317
    invoke-direct {v5}, Ll4/h$b;-><init>()V

    .line 318
    .line 319
    .line 320
    :goto_5
    iput-object v5, v2, Ll4/h;->d:Ll4/f;

    .line 321
    .line 322
    move v1, v15

    .line 323
    goto :goto_7

    .line 324
    :cond_12
    iget-object v5, v2, Ll4/h;->a:Ll4/d;

    .line 325
    .line 326
    iget-object v5, v5, Ll4/d;->a:Ll4/e;

    .line 327
    .line 328
    iget v6, v5, Ll4/e;->a:I

    .line 329
    .line 330
    and-int/lit8 v6, v6, 0x4

    .line 331
    .line 332
    if-eqz v6, :cond_13

    .line 333
    .line 334
    move/from16 v17, v4

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_13
    move/from16 v17, v3

    .line 338
    .line 339
    :goto_6
    new-instance v4, Ll4/a;

    .line 340
    .line 341
    iget-wide v9, v2, Ll4/h;->f:J

    .line 342
    .line 343
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 344
    .line 345
    .line 346
    move-result-wide v11

    .line 347
    iget v1, v5, Ll4/e;->d:I

    .line 348
    .line 349
    iget v6, v5, Ll4/e;->e:I

    .line 350
    .line 351
    add-int/2addr v1, v6

    .line 352
    int-to-long v13, v1

    .line 353
    iget-wide v5, v5, Ll4/e;->b:J

    .line 354
    .line 355
    move-object v7, v4

    .line 356
    move-object v8, v2

    .line 357
    move v1, v15

    .line 358
    move-wide v15, v5

    .line 359
    invoke-direct/range {v7 .. v17}, Ll4/a;-><init>(Ll4/h;JJJJZ)V

    .line 360
    .line 361
    .line 362
    iput-object v4, v2, Ll4/h;->d:Ll4/f;

    .line 363
    .line 364
    :goto_7
    iput v1, v2, Ll4/h;->h:I

    .line 365
    .line 366
    iget-object v1, v2, Ll4/h;->a:Ll4/d;

    .line 367
    .line 368
    iget-object v2, v1, Ll4/d;->b:Lv5/u;

    .line 369
    .line 370
    iget-object v4, v2, Lv5/u;->a:[B

    .line 371
    .line 372
    array-length v5, v4

    .line 373
    const v6, 0xfe01

    .line 374
    .line 375
    .line 376
    if-ne v5, v6, :cond_14

    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_14
    iget v5, v2, Lv5/u;->c:I

    .line 380
    .line 381
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    iget-object v1, v1, Ll4/d;->b:Lv5/u;

    .line 390
    .line 391
    iget v1, v1, Lv5/u;->c:I

    .line 392
    .line 393
    invoke-virtual {v2, v4, v1}, Lv5/u;->E([BI)V

    .line 394
    .line 395
    .line 396
    :goto_8
    return v3
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
.end method

.method public final f(JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll4/c;->b:Ll4/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Ll4/h;->a:Ll4/d;

    .line 6
    .line 7
    iget-object v2, v1, Ll4/d;->a:Ll4/e;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iput v3, v2, Ll4/e;->a:I

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    iput-wide v4, v2, Ll4/e;->b:J

    .line 15
    .line 16
    iput v3, v2, Ll4/e;->c:I

    .line 17
    .line 18
    iput v3, v2, Ll4/e;->d:I

    .line 19
    .line 20
    iput v3, v2, Ll4/e;->e:I

    .line 21
    .line 22
    iget-object v2, v1, Ll4/d;->b:Lv5/u;

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lv5/u;->D(I)V

    .line 25
    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    iput v2, v1, Ll4/d;->c:I

    .line 29
    .line 30
    iput-boolean v3, v1, Ll4/d;->e:Z

    .line 31
    .line 32
    cmp-long p1, p1, v4

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    iget-boolean p1, v0, Ll4/h;->l:Z

    .line 37
    .line 38
    xor-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ll4/h;->d(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget p1, v0, Ll4/h;->h:I

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget p1, v0, Ll4/h;->i:I

    .line 49
    .line 50
    int-to-long p1, p1

    .line 51
    mul-long/2addr p1, p3

    .line 52
    const-wide/32 p3, 0xf4240

    .line 53
    .line 54
    .line 55
    div-long/2addr p1, p3

    .line 56
    iput-wide p1, v0, Ll4/h;->e:J

    .line 57
    .line 58
    iget-object p3, v0, Ll4/h;->d:Ll4/f;

    .line 59
    .line 60
    sget p4, Lv5/e0;->a:I

    .line 61
    .line 62
    invoke-interface {p3, p1, p2}, Ll4/f;->c(J)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x2

    .line 66
    iput p1, v0, Ll4/h;->h:I

    .line 67
    .line 68
    :cond_1
    :goto_0
    return-void
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

.method public final i(Lc4/i;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Ll4/c;->a(Lc4/i;)Z

    move-result p1
    :try_end_0
    .catch Lv3/a1; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
