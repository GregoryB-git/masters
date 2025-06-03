.class public final Lm4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# instance fields
.field public final a:I

.field public final b:Lm4/f;

.field public final c:Lv5/u;

.field public final d:Lv5/u;

.field public final e:Lv5/t;

.field public f:Lc4/j;

.field public g:J

.field public h:J

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x2

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    :cond_0
    iput p1, p0, Lm4/e;->a:I

    .line 11
    .line 12
    new-instance p1, Lm4/f;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {p1, v0, v1}, Lm4/f;-><init>(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lm4/e;->b:Lm4/f;

    .line 20
    .line 21
    new-instance p1, Lv5/u;

    .line 22
    .line 23
    const/16 v0, 0x800

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lv5/u;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lm4/e;->c:Lv5/u;

    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    iput p1, p0, Lm4/e;->i:I

    .line 32
    .line 33
    const-wide/16 v0, -0x1

    .line 34
    .line 35
    iput-wide v0, p0, Lm4/e;->h:J

    .line 36
    .line 37
    new-instance p1, Lv5/u;

    .line 38
    .line 39
    const/16 v0, 0xa

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lv5/u;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lm4/e;->d:Lv5/u;

    .line 45
    .line 46
    new-instance v0, Lv5/t;

    .line 47
    .line 48
    iget-object p1, p1, Lv5/u;->a:[B

    .line 49
    .line 50
    array-length v1, p1

    .line 51
    invoke-direct {v0, p1, v1}, Lv5/t;-><init>([BI)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lm4/e;->e:Lv5/t;

    .line 55
    .line 56
    return-void
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


# virtual methods
.method public final a(Lc4/i;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lm4/e;->d:Lv5/u;

    .line 4
    .line 5
    iget-object v2, v2, Lv5/u;->a:[B

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    invoke-interface {p1, v2, v0, v3}, Lc4/i;->m([BII)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lm4/e;->d:Lv5/u;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lv5/u;->G(I)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lm4/e;->d:Lv5/u;

    .line 18
    .line 19
    invoke-virtual {v2}, Lv5/u;->x()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0x494433

    .line 24
    .line 25
    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lc4/i;->i()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v1}, Lc4/i;->e(I)V

    .line 32
    .line 33
    .line 34
    iget-wide v2, p0, Lm4/e;->h:J

    .line 35
    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    cmp-long p1, v2, v4

    .line 39
    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    int-to-long v2, v1

    .line 43
    iput-wide v2, p0, Lm4/e;->h:J

    .line 44
    .line 45
    :cond_0
    return v1

    .line 46
    :cond_1
    iget-object v2, p0, Lm4/e;->d:Lv5/u;

    .line 47
    .line 48
    const/4 v3, 0x3

    .line 49
    invoke-virtual {v2, v3}, Lv5/u;->H(I)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lm4/e;->d:Lv5/u;

    .line 53
    .line 54
    invoke-virtual {v2}, Lv5/u;->u()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v3, v2, 0xa

    .line 59
    .line 60
    add-int/2addr v1, v3

    .line 61
    invoke-interface {p1, v2}, Lc4/i;->e(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_0
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

.method public final b(Lc4/j;)V
    .locals 4

    iput-object p1, p0, Lm4/e;->f:Lc4/j;

    iget-object v0, p0, Lm4/e;->b:Lm4/f;

    new-instance v1, Lm4/d0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lm4/d0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lm4/f;->e(Lc4/j;Lm4/d0$d;)V

    invoke-interface {p1}, Lc4/j;->m()V

    return-void
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/e;->f:Lc4/j;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 11
    .line 12
    .line 13
    move-result-wide v6

    .line 14
    iget v2, v0, Lm4/e;->a:I

    .line 15
    .line 16
    and-int/lit8 v3, v2, 0x2

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    and-int/2addr v2, v12

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const-wide/16 v2, -0x1

    .line 26
    .line 27
    cmp-long v2, v6, v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v11

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v2, v12

    .line 35
    :goto_1
    const/4 v13, 0x4

    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v14, -0x1

    .line 38
    if-eqz v2, :cond_c

    .line 39
    .line 40
    iget-boolean v2, v0, Lm4/e;->j:Z

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_2
    iput v14, v0, Lm4/e;->i:I

    .line 47
    .line 48
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 49
    .line 50
    .line 51
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    cmp-long v2, v4, v8

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    invoke-virtual/range {p0 .. p1}, Lm4/e;->a(Lc4/i;)I

    .line 62
    .line 63
    .line 64
    :cond_3
    move v2, v11

    .line 65
    :goto_2
    :try_start_0
    iget-object v4, v0, Lm4/e;->d:Lv5/u;

    .line 66
    .line 67
    iget-object v4, v4, Lv5/u;->a:[B

    .line 68
    .line 69
    invoke-interface {v1, v4, v11, v3, v12}, Lc4/i;->c([BIIZ)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_a

    .line 74
    .line 75
    iget-object v4, v0, Lm4/e;->d:Lv5/u;

    .line 76
    .line 77
    invoke-virtual {v4, v11}, Lv5/u;->G(I)V

    .line 78
    .line 79
    .line 80
    iget-object v4, v0, Lm4/e;->d:Lv5/u;

    .line 81
    .line 82
    invoke-virtual {v4}, Lv5/u;->A()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const v5, 0xfff6

    .line 87
    .line 88
    .line 89
    and-int/2addr v4, v5

    .line 90
    const v5, 0xfff0

    .line 91
    .line 92
    .line 93
    if-ne v4, v5, :cond_4

    .line 94
    .line 95
    move v4, v12

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v4, v11

    .line 98
    :goto_3
    if-nez v4, :cond_5

    .line 99
    .line 100
    move v2, v11

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    iget-object v4, v0, Lm4/e;->d:Lv5/u;

    .line 103
    .line 104
    iget-object v4, v4, Lv5/u;->a:[B

    .line 105
    .line 106
    invoke-interface {v1, v4, v11, v13, v12}, Lc4/i;->c([BIIZ)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    iget-object v4, v0, Lm4/e;->e:Lv5/t;

    .line 114
    .line 115
    const/16 v5, 0xe

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Lv5/t;->k(I)V

    .line 118
    .line 119
    .line 120
    iget-object v4, v0, Lm4/e;->e:Lv5/t;

    .line 121
    .line 122
    const/16 v5, 0xd

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Lv5/t;->g(I)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    const/4 v5, 0x6

    .line 129
    if-le v4, v5, :cond_9

    .line 130
    .line 131
    int-to-long v13, v4

    .line 132
    add-long/2addr v8, v13

    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    const/16 v5, 0x3e8

    .line 136
    .line 137
    if-ne v2, v5, :cond_7

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    add-int/lit8 v4, v4, -0x6

    .line 141
    .line 142
    invoke-interface {v1, v4, v12}, Lc4/i;->k(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_8

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    const/4 v13, 0x4

    .line 150
    const/4 v14, -0x1

    .line 151
    goto :goto_2

    .line 152
    :cond_9
    iput-boolean v12, v0, Lm4/e;->j:Z

    .line 153
    .line 154
    const-string v4, "Malformed ADTS stream"

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    invoke-static {v4, v5}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    throw v4
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :catch_0
    :cond_a
    :goto_4
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 163
    .line 164
    .line 165
    if-lez v2, :cond_b

    .line 166
    .line 167
    int-to-long v4, v2

    .line 168
    div-long/2addr v8, v4

    .line 169
    long-to-int v2, v8

    .line 170
    goto :goto_5

    .line 171
    :cond_b
    const/4 v2, -0x1

    .line 172
    :goto_5
    iput v2, v0, Lm4/e;->i:I

    .line 173
    .line 174
    iput-boolean v12, v0, Lm4/e;->j:Z

    .line 175
    .line 176
    :cond_c
    :goto_6
    iget-object v2, v0, Lm4/e;->c:Lv5/u;

    .line 177
    .line 178
    iget-object v2, v2, Lv5/u;->a:[B

    .line 179
    .line 180
    const/16 v4, 0x800

    .line 181
    .line 182
    invoke-interface {v1, v2, v11, v4}, Lc4/i;->read([BII)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    const/4 v2, -0x1

    .line 187
    if-ne v1, v2, :cond_d

    .line 188
    .line 189
    move v2, v12

    .line 190
    goto :goto_7

    .line 191
    :cond_d
    move v2, v11

    .line 192
    :goto_7
    iget-boolean v4, v0, Lm4/e;->l:Z

    .line 193
    .line 194
    if-eqz v4, :cond_e

    .line 195
    .line 196
    goto :goto_b

    .line 197
    :cond_e
    iget v4, v0, Lm4/e;->a:I

    .line 198
    .line 199
    and-int/lit8 v5, v4, 0x1

    .line 200
    .line 201
    if-eqz v5, :cond_f

    .line 202
    .line 203
    iget v5, v0, Lm4/e;->i:I

    .line 204
    .line 205
    if-lez v5, :cond_f

    .line 206
    .line 207
    move v5, v12

    .line 208
    goto :goto_8

    .line 209
    :cond_f
    move v5, v11

    .line 210
    :goto_8
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    if-eqz v5, :cond_10

    .line 216
    .line 217
    iget-object v10, v0, Lm4/e;->b:Lm4/f;

    .line 218
    .line 219
    iget-wide v13, v10, Lm4/f;->q:J

    .line 220
    .line 221
    cmp-long v10, v13, v8

    .line 222
    .line 223
    if-nez v10, :cond_10

    .line 224
    .line 225
    if-nez v2, :cond_10

    .line 226
    .line 227
    goto :goto_b

    .line 228
    :cond_10
    if-eqz v5, :cond_12

    .line 229
    .line 230
    iget-object v5, v0, Lm4/e;->b:Lm4/f;

    .line 231
    .line 232
    iget-wide v13, v5, Lm4/f;->q:J

    .line 233
    .line 234
    cmp-long v5, v13, v8

    .line 235
    .line 236
    if-eqz v5, :cond_12

    .line 237
    .line 238
    iget-object v10, v0, Lm4/e;->f:Lc4/j;

    .line 239
    .line 240
    and-int/2addr v3, v4

    .line 241
    if-eqz v3, :cond_11

    .line 242
    .line 243
    move v15, v12

    .line 244
    goto :goto_9

    .line 245
    :cond_11
    move v15, v11

    .line 246
    :goto_9
    iget v5, v0, Lm4/e;->i:I

    .line 247
    .line 248
    int-to-long v3, v5

    .line 249
    const-wide/16 v8, 0x8

    .line 250
    .line 251
    mul-long/2addr v3, v8

    .line 252
    const-wide/32 v8, 0xf4240

    .line 253
    .line 254
    .line 255
    mul-long/2addr v3, v8

    .line 256
    div-long/2addr v3, v13

    .line 257
    long-to-int v4, v3

    .line 258
    new-instance v13, Lc4/d;

    .line 259
    .line 260
    iget-wide v8, v0, Lm4/e;->h:J

    .line 261
    .line 262
    move-object v3, v13

    .line 263
    move-object v14, v10

    .line 264
    move v10, v15

    .line 265
    invoke-direct/range {v3 .. v10}, Lc4/d;-><init>(IIJJZ)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v14, v13}, Lc4/j;->t(Lc4/t;)V

    .line 269
    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_12
    iget-object v3, v0, Lm4/e;->f:Lc4/j;

    .line 273
    .line 274
    new-instance v4, Lc4/t$b;

    .line 275
    .line 276
    invoke-direct {v4, v8, v9}, Lc4/t$b;-><init>(J)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v3, v4}, Lc4/j;->t(Lc4/t;)V

    .line 280
    .line 281
    .line 282
    :goto_a
    iput-boolean v12, v0, Lm4/e;->l:Z

    .line 283
    .line 284
    :goto_b
    if-eqz v2, :cond_13

    .line 285
    .line 286
    const/4 v2, -0x1

    .line 287
    return v2

    .line 288
    :cond_13
    iget-object v2, v0, Lm4/e;->c:Lv5/u;

    .line 289
    .line 290
    invoke-virtual {v2, v11}, Lv5/u;->G(I)V

    .line 291
    .line 292
    .line 293
    iget-object v2, v0, Lm4/e;->c:Lv5/u;

    .line 294
    .line 295
    invoke-virtual {v2, v1}, Lv5/u;->F(I)V

    .line 296
    .line 297
    .line 298
    iget-boolean v1, v0, Lm4/e;->k:Z

    .line 299
    .line 300
    if-nez v1, :cond_14

    .line 301
    .line 302
    iget-object v1, v0, Lm4/e;->b:Lm4/f;

    .line 303
    .line 304
    iget-wide v2, v0, Lm4/e;->g:J

    .line 305
    .line 306
    const/4 v4, 0x4

    .line 307
    invoke-virtual {v1, v4, v2, v3}, Lm4/f;->d(IJ)V

    .line 308
    .line 309
    .line 310
    iput-boolean v12, v0, Lm4/e;->k:Z

    .line 311
    .line 312
    :cond_14
    iget-object v1, v0, Lm4/e;->b:Lm4/f;

    .line 313
    .line 314
    iget-object v2, v0, Lm4/e;->c:Lv5/u;

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Lm4/f;->a(Lv5/u;)V

    .line 317
    .line 318
    .line 319
    return v11
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
.end method

.method public final f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lm4/e;->k:Z

    iget-object p1, p0, Lm4/e;->b:Lm4/f;

    invoke-virtual {p1}, Lm4/f;->b()V

    iput-wide p3, p0, Lm4/e;->g:J

    return-void
.end method

.method public final i(Lc4/i;)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lm4/e;->a(Lc4/i;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v4, v0

    .line 7
    move v2, v1

    .line 8
    move v3, v2

    .line 9
    :cond_0
    iget-object v5, p0, Lm4/e;->d:Lv5/u;

    .line 10
    .line 11
    iget-object v5, v5, Lv5/u;->a:[B

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    move-object v7, p1

    .line 15
    check-cast v7, Lc4/e;

    .line 16
    .line 17
    invoke-virtual {v7, v5, v1, v6, v1}, Lc4/e;->c([BIIZ)Z

    .line 18
    .line 19
    .line 20
    iget-object v5, p0, Lm4/e;->d:Lv5/u;

    .line 21
    .line 22
    invoke-virtual {v5, v1}, Lv5/u;->G(I)V

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Lm4/e;->d:Lv5/u;

    .line 26
    .line 27
    invoke-virtual {v5}, Lv5/u;->A()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const v6, 0xfff6

    .line 32
    .line 33
    .line 34
    and-int/2addr v5, v6

    .line 35
    const v6, 0xfff0

    .line 36
    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    if-ne v5, v6, :cond_1

    .line 40
    .line 41
    move v5, v8

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v5, v1

    .line 44
    :goto_0
    if-nez v5, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    add-int/2addr v2, v8

    .line 48
    const/4 v5, 0x4

    .line 49
    if-lt v2, v5, :cond_3

    .line 50
    .line 51
    const/16 v6, 0xbc

    .line 52
    .line 53
    if-le v3, v6, :cond_3

    .line 54
    .line 55
    return v8

    .line 56
    :cond_3
    iget-object v6, p0, Lm4/e;->d:Lv5/u;

    .line 57
    .line 58
    iget-object v6, v6, Lv5/u;->a:[B

    .line 59
    .line 60
    invoke-virtual {v7, v6, v1, v5, v1}, Lc4/e;->c([BIIZ)Z

    .line 61
    .line 62
    .line 63
    iget-object v5, p0, Lm4/e;->e:Lv5/t;

    .line 64
    .line 65
    const/16 v6, 0xe

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Lv5/t;->k(I)V

    .line 68
    .line 69
    .line 70
    iget-object v5, p0, Lm4/e;->e:Lv5/t;

    .line 71
    .line 72
    const/16 v6, 0xd

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Lv5/t;->g(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/4 v6, 0x6

    .line 79
    if-gt v5, v6, :cond_4

    .line 80
    .line 81
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    iput v1, v7, Lc4/e;->f:I

    .line 84
    .line 85
    invoke-virtual {v7, v4, v1}, Lc4/e;->k(IZ)Z

    .line 86
    .line 87
    .line 88
    move v2, v1

    .line 89
    move v3, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    add-int/lit8 v6, v5, -0x6

    .line 92
    .line 93
    invoke-virtual {v7, v6, v1}, Lc4/e;->k(IZ)Z

    .line 94
    .line 95
    .line 96
    add-int/2addr v3, v5

    .line 97
    :goto_2
    sub-int v5, v4, v0

    .line 98
    .line 99
    const/16 v6, 0x2000

    .line 100
    .line 101
    if-lt v5, v6, :cond_0

    .line 102
    .line 103
    return v1
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

.method public final release()V
    .locals 0

    return-void
.end method
