.class public final Lm4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/l$b;,
        Lm4/l$a;
    }
.end annotation


# static fields
.field public static final l:[F


# instance fields
.field public final a:Lm4/e0;

.field public final b:Lv5/u;

.field public final c:[Z

.field public final d:Lm4/l$a;

.field public final e:Lm4/r;

.field public f:Lm4/l$b;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Lc4/v;

.field public j:Z

.field public k:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lm4/l;->l:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lm4/e0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/l;->a:Lm4/e0;

    const/4 p1, 0x4

    new-array p1, p1, [Z

    iput-object p1, p0, Lm4/l;->c:[Z

    new-instance p1, Lm4/l$a;

    invoke-direct {p1}, Lm4/l$a;-><init>()V

    iput-object p1, p0, Lm4/l;->d:Lm4/l$a;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/l;->k:J

    new-instance p1, Lm4/r;

    const/16 v0, 0xb2

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/l;->e:Lm4/r;

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Lm4/l;->b:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/l;->f:Lm4/l$b;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lm4/l;->i:Lc4/v;

    .line 11
    .line 12
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget v2, v1, Lv5/u;->b:I

    .line 16
    .line 17
    iget v3, v1, Lv5/u;->c:I

    .line 18
    .line 19
    iget-object v4, v1, Lv5/u;->a:[B

    .line 20
    .line 21
    iget-wide v5, v0, Lm4/l;->g:J

    .line 22
    .line 23
    sub-int v7, v3, v2

    .line 24
    .line 25
    int-to-long v8, v7

    .line 26
    add-long/2addr v5, v8

    .line 27
    iput-wide v5, v0, Lm4/l;->g:J

    .line 28
    .line 29
    iget-object v5, v0, Lm4/l;->i:Lc4/v;

    .line 30
    .line 31
    invoke-interface {v5, v7, v1}, Lc4/v;->b(ILv5/u;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v5, v0, Lm4/l;->c:[Z

    .line 35
    .line 36
    invoke-static {v4, v2, v3, v5}, Lv5/q;->b([BII[Z)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ne v5, v3, :cond_2

    .line 41
    .line 42
    iget-boolean v1, v0, Lm4/l;->j:Z

    .line 43
    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    iget-object v1, v0, Lm4/l;->d:Lm4/l$a;

    .line 47
    .line 48
    invoke-virtual {v1, v4, v2, v3}, Lm4/l$a;->a([BII)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v1, v0, Lm4/l;->f:Lm4/l$b;

    .line 52
    .line 53
    invoke-virtual {v1, v4, v2, v3}, Lm4/l$b;->a([BII)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lm4/l;->e:Lm4/r;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1, v4, v2, v3}, Lm4/r;->a([BII)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :cond_2
    iget-object v6, v1, Lv5/u;->a:[B

    .line 65
    .line 66
    add-int/lit8 v7, v5, 0x3

    .line 67
    .line 68
    aget-byte v6, v6, v7

    .line 69
    .line 70
    and-int/lit16 v6, v6, 0xff

    .line 71
    .line 72
    sub-int v8, v5, v2

    .line 73
    .line 74
    iget-boolean v9, v0, Lm4/l;->j:Z

    .line 75
    .line 76
    const/4 v11, 0x1

    .line 77
    if-nez v9, :cond_18

    .line 78
    .line 79
    if-lez v8, :cond_3

    .line 80
    .line 81
    iget-object v9, v0, Lm4/l;->d:Lm4/l$a;

    .line 82
    .line 83
    invoke-virtual {v9, v4, v2, v5}, Lm4/l$a;->a([BII)V

    .line 84
    .line 85
    .line 86
    :cond_3
    if-gez v8, :cond_4

    .line 87
    .line 88
    neg-int v9, v8

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const/4 v9, 0x0

    .line 91
    :goto_1
    iget-object v13, v0, Lm4/l;->d:Lm4/l$a;

    .line 92
    .line 93
    iget v14, v13, Lm4/l$a;->b:I

    .line 94
    .line 95
    const-string v15, "H263Reader"

    .line 96
    .line 97
    const/4 v10, 0x2

    .line 98
    if-eqz v14, :cond_d

    .line 99
    .line 100
    const/16 v12, 0xb5

    .line 101
    .line 102
    if-eq v14, v11, :cond_b

    .line 103
    .line 104
    if-eq v14, v10, :cond_9

    .line 105
    .line 106
    const/4 v10, 0x3

    .line 107
    if-eq v14, v10, :cond_7

    .line 108
    .line 109
    const/4 v10, 0x4

    .line 110
    if-ne v14, v10, :cond_6

    .line 111
    .line 112
    const/16 v10, 0xb3

    .line 113
    .line 114
    if-eq v6, v10, :cond_5

    .line 115
    .line 116
    if-ne v6, v12, :cond_e

    .line 117
    .line 118
    :cond_5
    iget v10, v13, Lm4/l$a;->c:I

    .line 119
    .line 120
    sub-int/2addr v10, v9

    .line 121
    iput v10, v13, Lm4/l$a;->c:I

    .line 122
    .line 123
    const/4 v9, 0x0

    .line 124
    iput-boolean v9, v13, Lm4/l$a;->a:Z

    .line 125
    .line 126
    move v9, v11

    .line 127
    goto :goto_5

    .line 128
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_7
    and-int/lit16 v9, v6, 0xf0

    .line 135
    .line 136
    const/16 v10, 0x20

    .line 137
    .line 138
    if-eq v9, v10, :cond_8

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_8
    iget v9, v13, Lm4/l$a;->c:I

    .line 142
    .line 143
    iput v9, v13, Lm4/l$a;->d:I

    .line 144
    .line 145
    const/4 v9, 0x4

    .line 146
    goto :goto_3

    .line 147
    :cond_9
    const/16 v9, 0x1f

    .line 148
    .line 149
    if-le v6, v9, :cond_a

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_a
    const/4 v9, 0x3

    .line 153
    goto :goto_3

    .line 154
    :cond_b
    if-eq v6, v12, :cond_c

    .line 155
    .line 156
    :goto_2
    const-string v9, "Unexpected start code value"

    .line 157
    .line 158
    invoke-static {v15, v9}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const/4 v9, 0x0

    .line 162
    iput-boolean v9, v13, Lm4/l$a;->a:Z

    .line 163
    .line 164
    iput v9, v13, Lm4/l$a;->c:I

    .line 165
    .line 166
    iput v9, v13, Lm4/l$a;->b:I

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_c
    const/4 v9, 0x2

    .line 170
    :goto_3
    iput v9, v13, Lm4/l$a;->b:I

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_d
    const/16 v9, 0xb0

    .line 174
    .line 175
    if-ne v6, v9, :cond_e

    .line 176
    .line 177
    iput v11, v13, Lm4/l$a;->b:I

    .line 178
    .line 179
    iput-boolean v11, v13, Lm4/l$a;->a:Z

    .line 180
    .line 181
    :cond_e
    :goto_4
    sget-object v9, Lm4/l$a;->f:[B

    .line 182
    .line 183
    const/4 v10, 0x3

    .line 184
    const/4 v12, 0x0

    .line 185
    invoke-virtual {v13, v9, v12, v10}, Lm4/l$a;->a([BII)V

    .line 186
    .line 187
    .line 188
    const/4 v9, 0x0

    .line 189
    :goto_5
    if-eqz v9, :cond_18

    .line 190
    .line 191
    iget-object v9, v0, Lm4/l;->i:Lc4/v;

    .line 192
    .line 193
    iget-object v10, v0, Lm4/l;->d:Lm4/l$a;

    .line 194
    .line 195
    iget v12, v10, Lm4/l$a;->d:I

    .line 196
    .line 197
    iget-object v13, v0, Lm4/l;->h:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object v14, v10, Lm4/l$a;->e:[B

    .line 203
    .line 204
    iget v10, v10, Lm4/l$a;->c:I

    .line 205
    .line 206
    invoke-static {v14, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    new-instance v14, Lv5/t;

    .line 211
    .line 212
    array-length v11, v10

    .line 213
    invoke-direct {v14, v10, v11}, Lv5/t;-><init>([BI)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v14, v12}, Lv5/t;->n(I)V

    .line 217
    .line 218
    .line 219
    const/4 v11, 0x4

    .line 220
    invoke-virtual {v14, v11}, Lv5/t;->n(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 224
    .line 225
    .line 226
    const/16 v12, 0x8

    .line 227
    .line 228
    invoke-virtual {v14, v12}, Lv5/t;->m(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14}, Lv5/t;->f()Z

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    if-eqz v16, :cond_f

    .line 236
    .line 237
    invoke-virtual {v14, v11}, Lv5/t;->m(I)V

    .line 238
    .line 239
    .line 240
    const/4 v12, 0x3

    .line 241
    invoke-virtual {v14, v12}, Lv5/t;->m(I)V

    .line 242
    .line 243
    .line 244
    :cond_f
    invoke-virtual {v14, v11}, Lv5/t;->g(I)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    const/16 v12, 0xf

    .line 249
    .line 250
    if-ne v11, v12, :cond_11

    .line 251
    .line 252
    const/16 v12, 0x8

    .line 253
    .line 254
    invoke-virtual {v14, v12}, Lv5/t;->g(I)I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    invoke-virtual {v14, v12}, Lv5/t;->g(I)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    if-nez v12, :cond_10

    .line 263
    .line 264
    move/from16 v16, v7

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_10
    int-to-float v11, v11

    .line 268
    int-to-float v12, v12

    .line 269
    div-float/2addr v11, v12

    .line 270
    move/from16 v16, v7

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_11
    sget-object v12, Lm4/l;->l:[F

    .line 274
    .line 275
    move/from16 v16, v7

    .line 276
    .line 277
    const/4 v7, 0x7

    .line 278
    if-ge v11, v7, :cond_12

    .line 279
    .line 280
    aget v11, v12, v11

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_12
    :goto_6
    const-string v7, "Invalid aspect ratio"

    .line 284
    .line 285
    invoke-static {v15, v7}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const/high16 v11, 0x3f800000    # 1.0f

    .line 289
    .line 290
    :goto_7
    invoke-virtual {v14}, Lv5/t;->f()Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    if-eqz v7, :cond_13

    .line 295
    .line 296
    const/4 v7, 0x2

    .line 297
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 298
    .line 299
    .line 300
    const/4 v7, 0x1

    .line 301
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v14}, Lv5/t;->f()Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    if-eqz v7, :cond_13

    .line 309
    .line 310
    const/16 v7, 0xf

    .line 311
    .line 312
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 328
    .line 329
    .line 330
    const/4 v12, 0x3

    .line 331
    invoke-virtual {v14, v12}, Lv5/t;->m(I)V

    .line 332
    .line 333
    .line 334
    const/16 v12, 0xb

    .line 335
    .line 336
    invoke-virtual {v14, v12}, Lv5/t;->m(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v14, v7}, Lv5/t;->m(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 346
    .line 347
    .line 348
    :cond_13
    const/4 v7, 0x2

    .line 349
    invoke-virtual {v14, v7}, Lv5/t;->g(I)I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-eqz v7, :cond_14

    .line 354
    .line 355
    const-string v7, "Unhandled video object layer shape"

    .line 356
    .line 357
    invoke-static {v15, v7}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :cond_14
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 361
    .line 362
    .line 363
    const/16 v7, 0x10

    .line 364
    .line 365
    invoke-virtual {v14, v7}, Lv5/t;->g(I)I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v14}, Lv5/t;->f()Z

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    if-eqz v12, :cond_17

    .line 377
    .line 378
    if-nez v7, :cond_15

    .line 379
    .line 380
    const-string v7, "Invalid vop_increment_time_resolution"

    .line 381
    .line 382
    invoke-static {v15, v7}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_15
    add-int/lit8 v7, v7, -0x1

    .line 387
    .line 388
    const/4 v12, 0x0

    .line 389
    :goto_8
    if-lez v7, :cond_16

    .line 390
    .line 391
    add-int/lit8 v12, v12, 0x1

    .line 392
    .line 393
    shr-int/lit8 v7, v7, 0x1

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_16
    invoke-virtual {v14, v12}, Lv5/t;->m(I)V

    .line 397
    .line 398
    .line 399
    :cond_17
    :goto_9
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 400
    .line 401
    .line 402
    const/16 v7, 0xd

    .line 403
    .line 404
    invoke-virtual {v14, v7}, Lv5/t;->g(I)I

    .line 405
    .line 406
    .line 407
    move-result v12

    .line 408
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v14, v7}, Lv5/t;->g(I)I

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v14}, Lv5/t;->l()V

    .line 419
    .line 420
    .line 421
    new-instance v14, Lv3/i0$a;

    .line 422
    .line 423
    invoke-direct {v14}, Lv3/i0$a;-><init>()V

    .line 424
    .line 425
    .line 426
    iput-object v13, v14, Lv3/i0$a;->a:Ljava/lang/String;

    .line 427
    .line 428
    const-string v13, "video/mp4v-es"

    .line 429
    .line 430
    iput-object v13, v14, Lv3/i0$a;->k:Ljava/lang/String;

    .line 431
    .line 432
    iput v12, v14, Lv3/i0$a;->p:I

    .line 433
    .line 434
    iput v7, v14, Lv3/i0$a;->q:I

    .line 435
    .line 436
    iput v11, v14, Lv3/i0$a;->t:F

    .line 437
    .line 438
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    iput-object v7, v14, Lv3/i0$a;->m:Ljava/util/List;

    .line 443
    .line 444
    new-instance v7, Lv3/i0;

    .line 445
    .line 446
    invoke-direct {v7, v14}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 447
    .line 448
    .line 449
    invoke-interface {v9, v7}, Lc4/v;->d(Lv3/i0;)V

    .line 450
    .line 451
    .line 452
    const/4 v7, 0x1

    .line 453
    iput-boolean v7, v0, Lm4/l;->j:Z

    .line 454
    .line 455
    goto :goto_a

    .line 456
    :cond_18
    move/from16 v16, v7

    .line 457
    .line 458
    :goto_a
    iget-object v7, v0, Lm4/l;->f:Lm4/l$b;

    .line 459
    .line 460
    invoke-virtual {v7, v4, v2, v5}, Lm4/l$b;->a([BII)V

    .line 461
    .line 462
    .line 463
    iget-object v7, v0, Lm4/l;->e:Lm4/r;

    .line 464
    .line 465
    if-eqz v7, :cond_1b

    .line 466
    .line 467
    if-lez v8, :cond_19

    .line 468
    .line 469
    invoke-virtual {v7, v4, v2, v5}, Lm4/r;->a([BII)V

    .line 470
    .line 471
    .line 472
    const/4 v2, 0x0

    .line 473
    goto :goto_b

    .line 474
    :cond_19
    neg-int v2, v8

    .line 475
    :goto_b
    iget-object v7, v0, Lm4/l;->e:Lm4/r;

    .line 476
    .line 477
    invoke-virtual {v7, v2}, Lm4/r;->b(I)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_1a

    .line 482
    .line 483
    iget-object v2, v0, Lm4/l;->e:Lm4/r;

    .line 484
    .line 485
    iget-object v7, v2, Lm4/r;->d:[B

    .line 486
    .line 487
    iget v2, v2, Lm4/r;->e:I

    .line 488
    .line 489
    invoke-static {v7, v2}, Lv5/q;->e([BI)I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    iget-object v7, v0, Lm4/l;->b:Lv5/u;

    .line 494
    .line 495
    sget v8, Lv5/e0;->a:I

    .line 496
    .line 497
    iget-object v8, v0, Lm4/l;->e:Lm4/r;

    .line 498
    .line 499
    iget-object v8, v8, Lm4/r;->d:[B

    .line 500
    .line 501
    invoke-virtual {v7, v8, v2}, Lv5/u;->E([BI)V

    .line 502
    .line 503
    .line 504
    iget-object v2, v0, Lm4/l;->a:Lm4/e0;

    .line 505
    .line 506
    iget-wide v7, v0, Lm4/l;->k:J

    .line 507
    .line 508
    iget-object v9, v0, Lm4/l;->b:Lv5/u;

    .line 509
    .line 510
    invoke-virtual {v2, v7, v8, v9}, Lm4/e0;->a(JLv5/u;)V

    .line 511
    .line 512
    .line 513
    :cond_1a
    const/16 v2, 0xb2

    .line 514
    .line 515
    if-ne v6, v2, :cond_1b

    .line 516
    .line 517
    iget-object v2, v1, Lv5/u;->a:[B

    .line 518
    .line 519
    add-int/lit8 v7, v5, 0x2

    .line 520
    .line 521
    aget-byte v2, v2, v7

    .line 522
    .line 523
    const/4 v7, 0x1

    .line 524
    if-ne v2, v7, :cond_1c

    .line 525
    .line 526
    iget-object v2, v0, Lm4/l;->e:Lm4/r;

    .line 527
    .line 528
    invoke-virtual {v2, v6}, Lm4/r;->d(I)V

    .line 529
    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_1b
    const/4 v7, 0x1

    .line 533
    :cond_1c
    :goto_c
    sub-int v13, v3, v5

    .line 534
    .line 535
    iget-wide v8, v0, Lm4/l;->g:J

    .line 536
    .line 537
    int-to-long v10, v13

    .line 538
    sub-long v14, v8, v10

    .line 539
    .line 540
    iget-object v2, v0, Lm4/l;->f:Lm4/l$b;

    .line 541
    .line 542
    iget-boolean v5, v0, Lm4/l;->j:Z

    .line 543
    .line 544
    iget v8, v2, Lm4/l$b;->e:I

    .line 545
    .line 546
    const/16 v12, 0xb6

    .line 547
    .line 548
    if-ne v8, v12, :cond_1d

    .line 549
    .line 550
    if-eqz v5, :cond_1d

    .line 551
    .line 552
    iget-boolean v5, v2, Lm4/l$b;->b:Z

    .line 553
    .line 554
    if-eqz v5, :cond_1d

    .line 555
    .line 556
    iget-wide v9, v2, Lm4/l$b;->h:J

    .line 557
    .line 558
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    cmp-long v5, v9, v17

    .line 564
    .line 565
    if-eqz v5, :cond_1d

    .line 566
    .line 567
    iget-wide v7, v2, Lm4/l$b;->g:J

    .line 568
    .line 569
    sub-long v7, v14, v7

    .line 570
    .line 571
    long-to-int v5, v7

    .line 572
    iget-boolean v11, v2, Lm4/l$b;->d:Z

    .line 573
    .line 574
    iget-object v8, v2, Lm4/l$b;->a:Lc4/v;

    .line 575
    .line 576
    const/4 v7, 0x0

    .line 577
    move v12, v5

    .line 578
    move v5, v3

    .line 579
    move-object/from16 v17, v4

    .line 580
    .line 581
    move-wide v3, v14

    .line 582
    move-object v14, v7

    .line 583
    invoke-interface/range {v8 .. v14}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 584
    .line 585
    .line 586
    goto :goto_d

    .line 587
    :cond_1d
    move v5, v3

    .line 588
    move-object/from16 v17, v4

    .line 589
    .line 590
    move-wide v3, v14

    .line 591
    :goto_d
    iget v7, v2, Lm4/l$b;->e:I

    .line 592
    .line 593
    const/16 v8, 0xb3

    .line 594
    .line 595
    if-eq v7, v8, :cond_1e

    .line 596
    .line 597
    iput-wide v3, v2, Lm4/l$b;->g:J

    .line 598
    .line 599
    :cond_1e
    iget-object v2, v0, Lm4/l;->f:Lm4/l$b;

    .line 600
    .line 601
    iget-wide v3, v0, Lm4/l;->k:J

    .line 602
    .line 603
    iput v6, v2, Lm4/l$b;->e:I

    .line 604
    .line 605
    const/4 v7, 0x0

    .line 606
    iput-boolean v7, v2, Lm4/l$b;->d:Z

    .line 607
    .line 608
    const/16 v7, 0xb6

    .line 609
    .line 610
    if-eq v6, v7, :cond_20

    .line 611
    .line 612
    if-ne v6, v8, :cond_1f

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_1f
    const/4 v9, 0x0

    .line 616
    goto :goto_f

    .line 617
    :cond_20
    :goto_e
    const/4 v9, 0x1

    .line 618
    :goto_f
    iput-boolean v9, v2, Lm4/l$b;->b:Z

    .line 619
    .line 620
    if-ne v6, v7, :cond_21

    .line 621
    .line 622
    const/4 v11, 0x1

    .line 623
    goto :goto_10

    .line 624
    :cond_21
    const/4 v11, 0x0

    .line 625
    :goto_10
    iput-boolean v11, v2, Lm4/l$b;->c:Z

    .line 626
    .line 627
    const/4 v6, 0x0

    .line 628
    iput v6, v2, Lm4/l$b;->f:I

    .line 629
    .line 630
    iput-wide v3, v2, Lm4/l$b;->h:J

    .line 631
    .line 632
    move v3, v5

    .line 633
    move/from16 v2, v16

    .line 634
    .line 635
    move-object/from16 v4, v17

    .line 636
    .line 637
    goto/16 :goto_0
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
    .locals 2

    .line 1
    iget-object v0, p0, Lm4/l;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lv5/q;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm4/l;->d:Lm4/l$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lm4/l$a;->a:Z

    .line 10
    .line 11
    iput v1, v0, Lm4/l$a;->c:I

    .line 12
    .line 13
    iput v1, v0, Lm4/l$a;->b:I

    .line 14
    .line 15
    iget-object v0, p0, Lm4/l;->f:Lm4/l$b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-boolean v1, v0, Lm4/l$b;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, Lm4/l$b;->c:Z

    .line 22
    .line 23
    iput-boolean v1, v0, Lm4/l$b;->d:Z

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, Lm4/l$b;->e:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lm4/l;->e:Lm4/r;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 33
    .line 34
    .line 35
    :cond_1
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, Lm4/l;->g:J

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v0, p0, Lm4/l;->k:J

    .line 45
    .line 46
    return-void
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

    iput-wide p2, p0, Lm4/l;->k:J

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
    iget-object v0, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lm4/l;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lm4/d0$d;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lm4/l;->i:Lc4/v;

    .line 22
    .line 23
    new-instance v1, Lm4/l$b;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lm4/l$b;-><init>(Lc4/v;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lm4/l;->f:Lm4/l$b;

    .line 29
    .line 30
    iget-object v0, p0, Lm4/l;->a:Lm4/e0;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lm4/e0;->b(Lc4/j;Lm4/d0$d;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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
