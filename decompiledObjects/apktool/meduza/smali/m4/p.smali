.class public final Lm4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv5/u;

.field public final c:Lv5/t;

.field public d:Lc4/v;

.field public e:Ljava/lang/String;

.field public f:Lv3/i0;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:I

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm4/p;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Lv5/u;

    .line 7
    .line 8
    const/16 v0, 0x400

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lv5/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lm4/p;->b:Lv5/u;

    .line 14
    .line 15
    new-instance v0, Lv5/t;

    .line 16
    .line 17
    iget-object p1, p1, Lv5/u;->a:[B

    .line 18
    .line 19
    array-length v1, p1

    .line 20
    invoke-direct {v0, p1, v1}, Lv5/t;-><init>([BI)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lm4/p;->c:Lv5/t;

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iput-wide v0, p0, Lm4/p;->k:J

    .line 31
    .line 32
    return-void
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


# virtual methods
.method public final a(Lv5/u;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/p;->d:Lc4/v;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget v2, v1, Lv5/u;->c:I

    .line 11
    .line 12
    iget v3, v1, Lv5/u;->b:I

    .line 13
    .line 14
    sub-int/2addr v2, v3

    .line 15
    if-lez v2, :cond_1e

    .line 16
    .line 17
    iget v3, v0, Lm4/p;->g:I

    .line 18
    .line 19
    const/16 v4, 0x56

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz v3, :cond_1d

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x2

    .line 26
    if-eq v3, v5, :cond_1a

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/16 v8, 0x8

    .line 30
    .line 31
    if-eq v3, v7, :cond_18

    .line 32
    .line 33
    if-ne v3, v4, :cond_17

    .line 34
    .line 35
    iget v3, v0, Lm4/p;->i:I

    .line 36
    .line 37
    iget v9, v0, Lm4/p;->h:I

    .line 38
    .line 39
    sub-int/2addr v3, v9

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, v0, Lm4/p;->c:Lv5/t;

    .line 45
    .line 46
    iget-object v3, v3, Lv5/t;->a:[B

    .line 47
    .line 48
    iget v9, v0, Lm4/p;->h:I

    .line 49
    .line 50
    invoke-virtual {v1, v3, v9, v2}, Lv5/u;->d([BII)V

    .line 51
    .line 52
    .line 53
    iget v3, v0, Lm4/p;->h:I

    .line 54
    .line 55
    add-int/2addr v3, v2

    .line 56
    iput v3, v0, Lm4/p;->h:I

    .line 57
    .line 58
    iget v2, v0, Lm4/p;->i:I

    .line 59
    .line 60
    if-ne v3, v2, :cond_0

    .line 61
    .line 62
    iget-object v2, v0, Lm4/p;->c:Lv5/t;

    .line 63
    .line 64
    invoke-virtual {v2, v6}, Lv5/t;->k(I)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, Lm4/p;->c:Lv5/t;

    .line 68
    .line 69
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_f

    .line 74
    .line 75
    iput-boolean v5, v0, Lm4/p;->l:Z

    .line 76
    .line 77
    invoke-virtual {v2, v5}, Lv5/t;->g(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v3, v5, :cond_1

    .line 82
    .line 83
    invoke-virtual {v2, v5}, Lv5/t;->g(I)I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move v10, v6

    .line 89
    :goto_1
    iput v10, v0, Lm4/p;->m:I

    .line 90
    .line 91
    if-nez v10, :cond_e

    .line 92
    .line 93
    if-ne v3, v5, :cond_2

    .line 94
    .line 95
    invoke-virtual {v2, v7}, Lv5/t;->g(I)I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    add-int/2addr v10, v5

    .line 100
    mul-int/2addr v10, v8

    .line 101
    invoke-virtual {v2, v10}, Lv5/t;->g(I)I

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_d

    .line 109
    .line 110
    const/4 v10, 0x6

    .line 111
    invoke-virtual {v2, v10}, Lv5/t;->g(I)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    iput v11, v0, Lm4/p;->n:I

    .line 116
    .line 117
    const/4 v11, 0x4

    .line 118
    invoke-virtual {v2, v11}, Lv5/t;->g(I)I

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    invoke-virtual {v2, v4}, Lv5/t;->g(I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-nez v12, :cond_c

    .line 127
    .line 128
    if-nez v13, :cond_c

    .line 129
    .line 130
    if-nez v3, :cond_3

    .line 131
    .line 132
    invoke-virtual {v2}, Lv5/t;->e()I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    invoke-virtual {v2}, Lv5/t;->b()I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    invoke-static {v2, v5}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    iget-object v15, v14, Lx3/a$a;->c:Ljava/lang/String;

    .line 145
    .line 146
    iput-object v15, v0, Lm4/p;->u:Ljava/lang/String;

    .line 147
    .line 148
    iget v15, v14, Lx3/a$a;->a:I

    .line 149
    .line 150
    iput v15, v0, Lm4/p;->r:I

    .line 151
    .line 152
    iget v14, v14, Lx3/a$a;->b:I

    .line 153
    .line 154
    iput v14, v0, Lm4/p;->t:I

    .line 155
    .line 156
    invoke-virtual {v2}, Lv5/t;->b()I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    sub-int/2addr v13, v14

    .line 161
    invoke-virtual {v2, v12}, Lv5/t;->k(I)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v12, v13, 0x7

    .line 165
    .line 166
    div-int/2addr v12, v8

    .line 167
    new-array v12, v12, [B

    .line 168
    .line 169
    invoke-virtual {v2, v12, v13}, Lv5/t;->h([BI)V

    .line 170
    .line 171
    .line 172
    new-instance v13, Lv3/i0$a;

    .line 173
    .line 174
    invoke-direct {v13}, Lv3/i0$a;-><init>()V

    .line 175
    .line 176
    .line 177
    iget-object v14, v0, Lm4/p;->e:Ljava/lang/String;

    .line 178
    .line 179
    iput-object v14, v13, Lv3/i0$a;->a:Ljava/lang/String;

    .line 180
    .line 181
    const-string v14, "audio/mp4a-latm"

    .line 182
    .line 183
    iput-object v14, v13, Lv3/i0$a;->k:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v14, v0, Lm4/p;->u:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v14, v13, Lv3/i0$a;->h:Ljava/lang/String;

    .line 188
    .line 189
    iget v14, v0, Lm4/p;->t:I

    .line 190
    .line 191
    iput v14, v13, Lv3/i0$a;->x:I

    .line 192
    .line 193
    iget v14, v0, Lm4/p;->r:I

    .line 194
    .line 195
    iput v14, v13, Lv3/i0$a;->y:I

    .line 196
    .line 197
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    iput-object v12, v13, Lv3/i0$a;->m:Ljava/util/List;

    .line 202
    .line 203
    iget-object v12, v0, Lm4/p;->a:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v12, v13, Lv3/i0$a;->c:Ljava/lang/String;

    .line 206
    .line 207
    new-instance v12, Lv3/i0;

    .line 208
    .line 209
    invoke-direct {v12, v13}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 210
    .line 211
    .line 212
    iget-object v13, v0, Lm4/p;->f:Lv3/i0;

    .line 213
    .line 214
    invoke-virtual {v12, v13}, Lv3/i0;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-nez v13, :cond_4

    .line 219
    .line 220
    iput-object v12, v0, Lm4/p;->f:Lv3/i0;

    .line 221
    .line 222
    const-wide/32 v13, 0x3d090000

    .line 223
    .line 224
    .line 225
    iget v15, v12, Lv3/i0;->H:I

    .line 226
    .line 227
    int-to-long v9, v15

    .line 228
    div-long/2addr v13, v9

    .line 229
    iput-wide v13, v0, Lm4/p;->s:J

    .line 230
    .line 231
    iget-object v9, v0, Lm4/p;->d:Lc4/v;

    .line 232
    .line 233
    invoke-interface {v9, v12}, Lc4/v;->d(Lv3/i0;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_3
    invoke-virtual {v2, v7}, Lv5/t;->g(I)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    add-int/2addr v9, v5

    .line 242
    mul-int/2addr v9, v8

    .line 243
    invoke-virtual {v2, v9}, Lv5/t;->g(I)I

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    int-to-long v9, v9

    .line 248
    long-to-int v9, v9

    .line 249
    invoke-virtual {v2}, Lv5/t;->b()I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    invoke-static {v2, v5}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    iget-object v13, v12, Lx3/a$a;->c:Ljava/lang/String;

    .line 258
    .line 259
    iput-object v13, v0, Lm4/p;->u:Ljava/lang/String;

    .line 260
    .line 261
    iget v13, v12, Lx3/a$a;->a:I

    .line 262
    .line 263
    iput v13, v0, Lm4/p;->r:I

    .line 264
    .line 265
    iget v12, v12, Lx3/a$a;->b:I

    .line 266
    .line 267
    iput v12, v0, Lm4/p;->t:I

    .line 268
    .line 269
    invoke-virtual {v2}, Lv5/t;->b()I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    sub-int/2addr v10, v12

    .line 274
    sub-int/2addr v9, v10

    .line 275
    invoke-virtual {v2, v9}, Lv5/t;->m(I)V

    .line 276
    .line 277
    .line 278
    :cond_4
    :goto_2
    invoke-virtual {v2, v4}, Lv5/t;->g(I)I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    iput v9, v0, Lm4/p;->o:I

    .line 283
    .line 284
    if-eqz v9, :cond_9

    .line 285
    .line 286
    if-eq v9, v5, :cond_8

    .line 287
    .line 288
    if-eq v9, v4, :cond_7

    .line 289
    .line 290
    if-eq v9, v11, :cond_7

    .line 291
    .line 292
    const/4 v4, 0x5

    .line 293
    if-eq v9, v4, :cond_7

    .line 294
    .line 295
    const/4 v4, 0x6

    .line 296
    if-eq v9, v4, :cond_6

    .line 297
    .line 298
    const/4 v4, 0x7

    .line 299
    if-ne v9, v4, :cond_5

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 305
    .line 306
    .line 307
    throw v1

    .line 308
    :cond_6
    :goto_3
    invoke-virtual {v2, v5}, Lv5/t;->m(I)V

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_7
    const/4 v4, 0x6

    .line 313
    move v10, v4

    .line 314
    goto :goto_4

    .line 315
    :cond_8
    const/16 v10, 0x9

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_9
    move v10, v8

    .line 319
    :goto_4
    invoke-virtual {v2, v10}, Lv5/t;->m(I)V

    .line 320
    .line 321
    .line 322
    :goto_5
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    iput-boolean v4, v0, Lm4/p;->p:Z

    .line 327
    .line 328
    const-wide/16 v9, 0x0

    .line 329
    .line 330
    iput-wide v9, v0, Lm4/p;->q:J

    .line 331
    .line 332
    if-eqz v4, :cond_b

    .line 333
    .line 334
    if-ne v3, v5, :cond_a

    .line 335
    .line 336
    invoke-virtual {v2, v7}, Lv5/t;->g(I)I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    add-int/2addr v3, v5

    .line 341
    mul-int/2addr v3, v8

    .line 342
    invoke-virtual {v2, v3}, Lv5/t;->g(I)I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    int-to-long v3, v3

    .line 347
    iput-wide v3, v0, Lm4/p;->q:J

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_a
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    iget-wide v4, v0, Lm4/p;->q:J

    .line 355
    .line 356
    shl-long/2addr v4, v8

    .line 357
    invoke-virtual {v2, v8}, Lv5/t;->g(I)I

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    int-to-long v9, v7

    .line 362
    add-long/2addr v4, v9

    .line 363
    iput-wide v4, v0, Lm4/p;->q:J

    .line 364
    .line 365
    if-nez v3, :cond_a

    .line 366
    .line 367
    :cond_b
    :goto_6
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    if-eqz v3, :cond_10

    .line 372
    .line 373
    invoke-virtual {v2, v8}, Lv5/t;->m(I)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_c
    const/4 v1, 0x0

    .line 378
    invoke-static {v1, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    throw v1

    .line 383
    :cond_d
    const/4 v1, 0x0

    .line 384
    invoke-static {v1, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    throw v1

    .line 389
    :cond_e
    const/4 v1, 0x0

    .line 390
    invoke-static {v1, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    throw v1

    .line 395
    :cond_f
    iget-boolean v3, v0, Lm4/p;->l:Z

    .line 396
    .line 397
    if-nez v3, :cond_10

    .line 398
    .line 399
    goto/16 :goto_a

    .line 400
    .line 401
    :cond_10
    :goto_7
    iget v3, v0, Lm4/p;->m:I

    .line 402
    .line 403
    if-nez v3, :cond_16

    .line 404
    .line 405
    iget v3, v0, Lm4/p;->n:I

    .line 406
    .line 407
    if-nez v3, :cond_15

    .line 408
    .line 409
    iget v3, v0, Lm4/p;->o:I

    .line 410
    .line 411
    if-nez v3, :cond_14

    .line 412
    .line 413
    move v3, v6

    .line 414
    :goto_8
    invoke-virtual {v2, v8}, Lv5/t;->g(I)I

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    add-int v13, v3, v4

    .line 419
    .line 420
    const/16 v3, 0xff

    .line 421
    .line 422
    if-eq v4, v3, :cond_13

    .line 423
    .line 424
    invoke-virtual {v2}, Lv5/t;->e()I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    and-int/lit8 v4, v3, 0x7

    .line 429
    .line 430
    if-nez v4, :cond_11

    .line 431
    .line 432
    iget-object v4, v0, Lm4/p;->b:Lv5/u;

    .line 433
    .line 434
    shr-int/lit8 v3, v3, 0x3

    .line 435
    .line 436
    invoke-virtual {v4, v3}, Lv5/u;->G(I)V

    .line 437
    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_11
    iget-object v3, v0, Lm4/p;->b:Lv5/u;

    .line 441
    .line 442
    iget-object v3, v3, Lv5/u;->a:[B

    .line 443
    .line 444
    mul-int/lit8 v4, v13, 0x8

    .line 445
    .line 446
    invoke-virtual {v2, v3, v4}, Lv5/t;->h([BI)V

    .line 447
    .line 448
    .line 449
    iget-object v3, v0, Lm4/p;->b:Lv5/u;

    .line 450
    .line 451
    invoke-virtual {v3, v6}, Lv5/u;->G(I)V

    .line 452
    .line 453
    .line 454
    :goto_9
    iget-object v3, v0, Lm4/p;->d:Lc4/v;

    .line 455
    .line 456
    iget-object v4, v0, Lm4/p;->b:Lv5/u;

    .line 457
    .line 458
    invoke-interface {v3, v13, v4}, Lc4/v;->b(ILv5/u;)V

    .line 459
    .line 460
    .line 461
    iget-wide v10, v0, Lm4/p;->k:J

    .line 462
    .line 463
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    cmp-long v3, v10, v3

    .line 469
    .line 470
    if-eqz v3, :cond_12

    .line 471
    .line 472
    iget-object v9, v0, Lm4/p;->d:Lc4/v;

    .line 473
    .line 474
    const/4 v12, 0x1

    .line 475
    const/4 v14, 0x0

    .line 476
    const/4 v15, 0x0

    .line 477
    invoke-interface/range {v9 .. v15}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 478
    .line 479
    .line 480
    iget-wide v3, v0, Lm4/p;->k:J

    .line 481
    .line 482
    iget-wide v7, v0, Lm4/p;->s:J

    .line 483
    .line 484
    add-long/2addr v3, v7

    .line 485
    iput-wide v3, v0, Lm4/p;->k:J

    .line 486
    .line 487
    :cond_12
    iget-boolean v3, v0, Lm4/p;->p:Z

    .line 488
    .line 489
    if-eqz v3, :cond_1c

    .line 490
    .line 491
    iget-wide v3, v0, Lm4/p;->q:J

    .line 492
    .line 493
    long-to-int v3, v3

    .line 494
    invoke-virtual {v2, v3}, Lv5/t;->m(I)V

    .line 495
    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_13
    move v3, v13

    .line 499
    goto :goto_8

    .line 500
    :cond_14
    const/4 v3, 0x0

    .line 501
    invoke-static {v3, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    throw v1

    .line 506
    :cond_15
    const/4 v3, 0x0

    .line 507
    invoke-static {v3, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    throw v1

    .line 512
    :cond_16
    const/4 v3, 0x0

    .line 513
    invoke-static {v3, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    throw v1

    .line 518
    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 519
    .line 520
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 521
    .line 522
    .line 523
    throw v1

    .line 524
    :cond_18
    iget v2, v0, Lm4/p;->j:I

    .line 525
    .line 526
    and-int/lit16 v2, v2, -0xe1

    .line 527
    .line 528
    shl-int/2addr v2, v8

    .line 529
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    or-int/2addr v2, v3

    .line 534
    iput v2, v0, Lm4/p;->i:I

    .line 535
    .line 536
    iget-object v3, v0, Lm4/p;->b:Lv5/u;

    .line 537
    .line 538
    iget-object v5, v3, Lv5/u;->a:[B

    .line 539
    .line 540
    array-length v5, v5

    .line 541
    if-le v2, v5, :cond_19

    .line 542
    .line 543
    invoke-virtual {v3, v2}, Lv5/u;->D(I)V

    .line 544
    .line 545
    .line 546
    iget-object v2, v0, Lm4/p;->c:Lv5/t;

    .line 547
    .line 548
    iget-object v3, v0, Lm4/p;->b:Lv5/u;

    .line 549
    .line 550
    iget-object v3, v3, Lv5/u;->a:[B

    .line 551
    .line 552
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    array-length v5, v3

    .line 556
    invoke-virtual {v2, v3, v5}, Lv5/t;->j([BI)V

    .line 557
    .line 558
    .line 559
    :cond_19
    iput v6, v0, Lm4/p;->h:I

    .line 560
    .line 561
    iput v4, v0, Lm4/p;->g:I

    .line 562
    .line 563
    goto/16 :goto_0

    .line 564
    .line 565
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    and-int/lit16 v3, v2, 0xe0

    .line 570
    .line 571
    const/16 v5, 0xe0

    .line 572
    .line 573
    if-ne v3, v5, :cond_1b

    .line 574
    .line 575
    iput v2, v0, Lm4/p;->j:I

    .line 576
    .line 577
    iput v7, v0, Lm4/p;->g:I

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    .line 581
    :cond_1b
    if-eq v2, v4, :cond_0

    .line 582
    .line 583
    :cond_1c
    :goto_a
    iput v6, v0, Lm4/p;->g:I

    .line 584
    .line 585
    goto/16 :goto_0

    .line 586
    .line 587
    :cond_1d
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-ne v2, v4, :cond_0

    .line 592
    .line 593
    iput v5, v0, Lm4/p;->g:I

    .line 594
    .line 595
    goto/16 :goto_0

    .line 596
    .line 597
    :cond_1e
    return-void
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

.method public final b()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lm4/p;->g:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lm4/p;->k:J

    iput-boolean v0, p0, Lm4/p;->l:Z

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(IJ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    iput-wide p2, p0, Lm4/p;->k:J

    :cond_0
    return-void
.end method

.method public final e(Lc4/j;Lm4/d0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm4/d0$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, Lm4/d0$d;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lm4/p;->d:Lc4/v;

    .line 15
    .line 16
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lm4/p;->e:Ljava/lang/String;

    .line 22
    .line 23
    return-void
    .line 24
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
