.class public final Lg4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# instance fields
.field public final a:Lv5/u;

.field public final b:Lv5/u;

.field public final c:Lv5/u;

.field public final d:Lv5/u;

.field public final e:Lg4/c;

.field public f:Lc4/j;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Lg4/a;

.field public p:Lg4/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/u;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Lg4/b;->a:Lv5/u;

    new-instance v0, Lv5/u;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Lg4/b;->b:Lv5/u;

    new-instance v0, Lv5/u;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Lg4/b;->c:Lv5/u;

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lg4/b;->d:Lv5/u;

    new-instance v0, Lg4/c;

    invoke-direct {v0}, Lg4/c;-><init>()V

    iput-object v0, p0, Lg4/b;->e:Lg4/c;

    const/4 v0, 0x1

    iput v0, p0, Lg4/b;->g:I

    return-void
.end method


# virtual methods
.method public final a(Lc4/i;)Lv5/u;
    .locals 5

    .line 1
    iget v0, p0, Lg4/b;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lg4/b;->d:Lv5/u;

    .line 4
    .line 5
    iget-object v2, v1, Lv5/u;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-le v0, v3, :cond_0

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    invoke-virtual {v1, v0, v4}, Lv5/u;->E([BI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v4}, Lv5/u;->G(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, p0, Lg4/b;->d:Lv5/u;

    .line 28
    .line 29
    iget v1, p0, Lg4/b;->l:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lv5/u;->F(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lg4/b;->d:Lv5/u;

    .line 35
    .line 36
    iget-object v0, v0, Lv5/u;->a:[B

    .line 37
    .line 38
    iget v1, p0, Lg4/b;->l:I

    .line 39
    .line 40
    invoke-interface {p1, v0, v4, v1}, Lc4/i;->readFully([BII)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lg4/b;->d:Lv5/u;

    .line 44
    .line 45
    return-object p1
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

.method public final b(Lc4/j;)V
    .locals 0

    iput-object p1, p0, Lg4/b;->f:Lc4/j;

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
    iget-object v2, v0, Lg4/b;->f:Lc4/j;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget v2, v0, Lg4/b;->g:I

    .line 11
    .line 12
    const/4 v3, -0x1

    .line 13
    const/16 v4, 0x8

    .line 14
    .line 15
    const/16 v5, 0x9

    .line 16
    .line 17
    const/4 v6, 0x2

    .line 18
    const/4 v7, 0x4

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    if-eq v2, v9, :cond_f

    .line 22
    .line 23
    const/4 v10, 0x3

    .line 24
    if-eq v2, v6, :cond_e

    .line 25
    .line 26
    if-eq v2, v10, :cond_c

    .line 27
    .line 28
    if-ne v2, v7, :cond_b

    .line 29
    .line 30
    iget-boolean v2, v0, Lg4/b;->h:Z

    .line 31
    .line 32
    const-wide/16 v10, 0x0

    .line 33
    .line 34
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-wide v2, v0, Lg4/b;->i:J

    .line 42
    .line 43
    iget-wide v14, v0, Lg4/b;->m:J

    .line 44
    .line 45
    add-long/2addr v2, v14

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object v2, v0, Lg4/b;->e:Lg4/c;

    .line 48
    .line 49
    iget-wide v2, v2, Lg4/c;->b:J

    .line 50
    .line 51
    cmp-long v2, v2, v12

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    move-wide v2, v10

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-wide v2, v0, Lg4/b;->m:J

    .line 58
    .line 59
    :goto_1
    iget v14, v0, Lg4/b;->k:I

    .line 60
    .line 61
    if-ne v14, v4, :cond_4

    .line 62
    .line 63
    iget-object v4, v0, Lg4/b;->o:Lg4/a;

    .line 64
    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    iget-boolean v4, v0, Lg4/b;->n:Z

    .line 68
    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    iget-object v4, v0, Lg4/b;->f:Lc4/j;

    .line 72
    .line 73
    new-instance v5, Lc4/t$b;

    .line 74
    .line 75
    invoke-direct {v5, v12, v13}, Lc4/t$b;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v4, v5}, Lc4/j;->t(Lc4/t;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v9, v0, Lg4/b;->n:Z

    .line 82
    .line 83
    :cond_3
    iget-object v4, v0, Lg4/b;->o:Lg4/a;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    if-ne v14, v5, :cond_6

    .line 87
    .line 88
    iget-object v4, v0, Lg4/b;->p:Lg4/e;

    .line 89
    .line 90
    if-eqz v4, :cond_6

    .line 91
    .line 92
    iget-boolean v4, v0, Lg4/b;->n:Z

    .line 93
    .line 94
    if-nez v4, :cond_5

    .line 95
    .line 96
    iget-object v4, v0, Lg4/b;->f:Lc4/j;

    .line 97
    .line 98
    new-instance v5, Lc4/t$b;

    .line 99
    .line 100
    invoke-direct {v5, v12, v13}, Lc4/t$b;-><init>(J)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v4, v5}, Lc4/j;->t(Lc4/t;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v9, v0, Lg4/b;->n:Z

    .line 107
    .line 108
    :cond_5
    iget-object v4, v0, Lg4/b;->p:Lg4/e;

    .line 109
    .line 110
    :goto_2
    invoke-virtual/range {p0 .. p1}, Lg4/b;->a(Lc4/i;)Lv5/u;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v4, v5}, Lg4/d;->a(Lv5/u;)Z

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    if-eqz v14, :cond_7

    .line 119
    .line 120
    invoke-virtual {v4, v2, v3, v5}, Lg4/d;->b(JLv5/u;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_7

    .line 125
    .line 126
    move v2, v9

    .line 127
    goto :goto_3

    .line 128
    :cond_6
    const/16 v4, 0x12

    .line 129
    .line 130
    if-ne v14, v4, :cond_8

    .line 131
    .line 132
    iget-boolean v4, v0, Lg4/b;->n:Z

    .line 133
    .line 134
    if-nez v4, :cond_8

    .line 135
    .line 136
    iget-object v4, v0, Lg4/b;->e:Lg4/c;

    .line 137
    .line 138
    invoke-virtual/range {p0 .. p1}, Lg4/b;->a(Lc4/i;)Lv5/u;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v2, v3, v5}, Lg4/c;->b(JLv5/u;)Z

    .line 146
    .line 147
    .line 148
    iget-object v2, v0, Lg4/b;->e:Lg4/c;

    .line 149
    .line 150
    iget-wide v3, v2, Lg4/c;->b:J

    .line 151
    .line 152
    cmp-long v5, v3, v12

    .line 153
    .line 154
    if-eqz v5, :cond_7

    .line 155
    .line 156
    iget-object v5, v0, Lg4/b;->f:Lc4/j;

    .line 157
    .line 158
    new-instance v14, Lc4/r;

    .line 159
    .line 160
    iget-object v15, v2, Lg4/c;->d:[J

    .line 161
    .line 162
    iget-object v2, v2, Lg4/c;->c:[J

    .line 163
    .line 164
    invoke-direct {v14, v15, v2, v3, v4}, Lc4/r;-><init>([J[JJ)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v5, v14}, Lc4/j;->t(Lc4/t;)V

    .line 168
    .line 169
    .line 170
    iput-boolean v9, v0, Lg4/b;->n:Z

    .line 171
    .line 172
    :cond_7
    move v2, v8

    .line 173
    :goto_3
    move v3, v9

    .line 174
    goto :goto_4

    .line 175
    :cond_8
    iget v2, v0, Lg4/b;->l:I

    .line 176
    .line 177
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 178
    .line 179
    .line 180
    move v2, v8

    .line 181
    move v3, v2

    .line 182
    :goto_4
    iget-boolean v4, v0, Lg4/b;->h:Z

    .line 183
    .line 184
    if-nez v4, :cond_a

    .line 185
    .line 186
    if-eqz v2, :cond_a

    .line 187
    .line 188
    iput-boolean v9, v0, Lg4/b;->h:Z

    .line 189
    .line 190
    iget-object v2, v0, Lg4/b;->e:Lg4/c;

    .line 191
    .line 192
    iget-wide v4, v2, Lg4/c;->b:J

    .line 193
    .line 194
    cmp-long v2, v4, v12

    .line 195
    .line 196
    if-nez v2, :cond_9

    .line 197
    .line 198
    iget-wide v4, v0, Lg4/b;->m:J

    .line 199
    .line 200
    neg-long v10, v4

    .line 201
    :cond_9
    iput-wide v10, v0, Lg4/b;->i:J

    .line 202
    .line 203
    :cond_a
    iput v7, v0, Lg4/b;->j:I

    .line 204
    .line 205
    iput v6, v0, Lg4/b;->g:I

    .line 206
    .line 207
    if-eqz v3, :cond_0

    .line 208
    .line 209
    return v8

    .line 210
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 213
    .line 214
    .line 215
    throw v1

    .line 216
    :cond_c
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 217
    .line 218
    iget-object v2, v2, Lv5/u;->a:[B

    .line 219
    .line 220
    const/16 v4, 0xb

    .line 221
    .line 222
    invoke-interface {v1, v2, v8, v4, v9}, Lc4/i;->b([BIIZ)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_d

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_d
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 230
    .line 231
    invoke-virtual {v2, v8}, Lv5/u;->G(I)V

    .line 232
    .line 233
    .line 234
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 235
    .line 236
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    iput v2, v0, Lg4/b;->k:I

    .line 241
    .line 242
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 243
    .line 244
    invoke-virtual {v2}, Lv5/u;->x()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    iput v2, v0, Lg4/b;->l:I

    .line 249
    .line 250
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 251
    .line 252
    invoke-virtual {v2}, Lv5/u;->x()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    int-to-long v4, v2

    .line 257
    iput-wide v4, v0, Lg4/b;->m:J

    .line 258
    .line 259
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 260
    .line 261
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    shl-int/lit8 v2, v2, 0x18

    .line 266
    .line 267
    int-to-long v4, v2

    .line 268
    iget-wide v11, v0, Lg4/b;->m:J

    .line 269
    .line 270
    or-long/2addr v4, v11

    .line 271
    const-wide/16 v11, 0x3e8

    .line 272
    .line 273
    mul-long/2addr v4, v11

    .line 274
    iput-wide v4, v0, Lg4/b;->m:J

    .line 275
    .line 276
    iget-object v2, v0, Lg4/b;->c:Lv5/u;

    .line 277
    .line 278
    invoke-virtual {v2, v10}, Lv5/u;->H(I)V

    .line 279
    .line 280
    .line 281
    iput v7, v0, Lg4/b;->g:I

    .line 282
    .line 283
    move v8, v9

    .line 284
    :goto_5
    if-nez v8, :cond_0

    .line 285
    .line 286
    return v3

    .line 287
    :cond_e
    iget v2, v0, Lg4/b;->j:I

    .line 288
    .line 289
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 290
    .line 291
    .line 292
    iput v8, v0, Lg4/b;->j:I

    .line 293
    .line 294
    iput v10, v0, Lg4/b;->g:I

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_f
    iget-object v2, v0, Lg4/b;->b:Lv5/u;

    .line 299
    .line 300
    iget-object v2, v2, Lv5/u;->a:[B

    .line 301
    .line 302
    invoke-interface {v1, v2, v8, v5, v9}, Lc4/i;->b([BIIZ)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-nez v2, :cond_10

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_10
    iget-object v2, v0, Lg4/b;->b:Lv5/u;

    .line 310
    .line 311
    invoke-virtual {v2, v8}, Lv5/u;->G(I)V

    .line 312
    .line 313
    .line 314
    iget-object v2, v0, Lg4/b;->b:Lv5/u;

    .line 315
    .line 316
    invoke-virtual {v2, v7}, Lv5/u;->H(I)V

    .line 317
    .line 318
    .line 319
    iget-object v2, v0, Lg4/b;->b:Lv5/u;

    .line 320
    .line 321
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    and-int/lit8 v10, v2, 0x4

    .line 326
    .line 327
    if-eqz v10, :cond_11

    .line 328
    .line 329
    move v10, v9

    .line 330
    goto :goto_6

    .line 331
    :cond_11
    move v10, v8

    .line 332
    :goto_6
    and-int/lit8 v2, v2, 0x1

    .line 333
    .line 334
    if-eqz v2, :cond_12

    .line 335
    .line 336
    move v8, v9

    .line 337
    :cond_12
    if-eqz v10, :cond_13

    .line 338
    .line 339
    iget-object v2, v0, Lg4/b;->o:Lg4/a;

    .line 340
    .line 341
    if-nez v2, :cond_13

    .line 342
    .line 343
    new-instance v2, Lg4/a;

    .line 344
    .line 345
    iget-object v10, v0, Lg4/b;->f:Lc4/j;

    .line 346
    .line 347
    invoke-interface {v10, v4, v9}, Lc4/j;->r(II)Lc4/v;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-direct {v2, v4}, Lg4/a;-><init>(Lc4/v;)V

    .line 352
    .line 353
    .line 354
    iput-object v2, v0, Lg4/b;->o:Lg4/a;

    .line 355
    .line 356
    :cond_13
    if-eqz v8, :cond_14

    .line 357
    .line 358
    iget-object v2, v0, Lg4/b;->p:Lg4/e;

    .line 359
    .line 360
    if-nez v2, :cond_14

    .line 361
    .line 362
    new-instance v2, Lg4/e;

    .line 363
    .line 364
    iget-object v4, v0, Lg4/b;->f:Lc4/j;

    .line 365
    .line 366
    invoke-interface {v4, v5, v6}, Lc4/j;->r(II)Lc4/v;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-direct {v2, v4}, Lg4/e;-><init>(Lc4/v;)V

    .line 371
    .line 372
    .line 373
    iput-object v2, v0, Lg4/b;->p:Lg4/e;

    .line 374
    .line 375
    :cond_14
    iget-object v2, v0, Lg4/b;->f:Lc4/j;

    .line 376
    .line 377
    invoke-interface {v2}, Lc4/j;->m()V

    .line 378
    .line 379
    .line 380
    iget-object v2, v0, Lg4/b;->b:Lv5/u;

    .line 381
    .line 382
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    sub-int/2addr v2, v5

    .line 387
    add-int/2addr v2, v7

    .line 388
    iput v2, v0, Lg4/b;->j:I

    .line 389
    .line 390
    iput v6, v0, Lg4/b;->g:I

    .line 391
    .line 392
    move v8, v9

    .line 393
    :goto_7
    if-nez v8, :cond_0

    .line 394
    .line 395
    return v3
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

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lg4/b;->g:I

    iput-boolean p2, p0, Lg4/b;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lg4/b;->g:I

    :goto_0
    iput p2, p0, Lg4/b;->j:I

    return-void
.end method

.method public final i(Lc4/i;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lv5/u;->a:[B

    .line 4
    .line 5
    check-cast p1, Lc4/e;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv5/u;->x()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v2, 0x464c56

    .line 24
    .line 25
    .line 26
    if-eq v0, v2, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 30
    .line 31
    iget-object v0, v0, Lv5/u;->a:[B

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 43
    .line 44
    invoke-virtual {v0}, Lv5/u;->A()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    and-int/lit16 v0, v0, 0xfa

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    return v1

    .line 53
    :cond_1
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 54
    .line 55
    iget-object v0, v0, Lv5/u;->a:[B

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 67
    .line 68
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v1, p1, Lc4/e;->f:I

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Lc4/e;->k(IZ)Z

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lg4/b;->a:Lv5/u;

    .line 78
    .line 79
    iget-object v0, v0, Lv5/u;->a:[B

    .line 80
    .line 81
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lg4/b;->a:Lv5/u;

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lv5/u;->G(I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lg4/b;->a:Lv5/u;

    .line 90
    .line 91
    invoke-virtual {p1}, Lv5/u;->f()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    const/4 v1, 0x1

    .line 98
    :cond_2
    return v1
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

.method public final release()V
    .locals 0

    return-void
.end method
