.class public final Ln4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln4/a$a;,
        Ln4/a$c;,
        Ln4/a$b;
    }
.end annotation


# instance fields
.field public a:Lc4/j;

.field public b:Lc4/v;

.field public c:I

.field public d:J

.field public e:Ln4/a$b;

.field public f:I

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln4/a;->c:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ln4/a;->d:J

    const/4 v2, -0x1

    iput v2, p0, Ln4/a;->f:I

    iput-wide v0, p0, Ln4/a;->g:J

    return-void
.end method


# virtual methods
.method public final b(Lc4/j;)V
    .locals 2

    iput-object p1, p0, Ln4/a;->a:Lc4/j;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    move-result-object v0

    iput-object v0, p0, Ln4/a;->b:Lc4/v;

    invoke-interface {p1}, Lc4/j;->m()V

    return-void
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ln4/a;->b:Lc4/v;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lv5/e0;->a:I

    .line 11
    .line 12
    iget v2, v0, Ln4/a;->c:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v2, :cond_12

    .line 19
    .line 20
    const/16 v7, 0x8

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const-wide/16 v9, -0x1

    .line 24
    .line 25
    if-eq v2, v5, :cond_10

    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    if-eq v2, v8, :cond_6

    .line 29
    .line 30
    if-eq v2, v11, :cond_3

    .line 31
    .line 32
    if-ne v2, v4, :cond_2

    .line 33
    .line 34
    iget-wide v7, v0, Ln4/a;->g:J

    .line 35
    .line 36
    cmp-long v2, v7, v9

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v6

    .line 42
    :goto_0
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 43
    .line 44
    .line 45
    iget-wide v4, v0, Ln4/a;->g:J

    .line 46
    .line 47
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sub-long/2addr v4, v7

    .line 52
    iget-object v2, v0, Ln4/a;->e:Ln4/a$b;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v2, v1, v4, v5}, Ln4/a$b;->b(Lc4/i;J)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v3, v6

    .line 65
    :goto_1
    return v3

    .line 66
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :cond_3
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lv5/u;

    .line 76
    .line 77
    invoke-direct {v2, v7}, Lv5/u;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const v3, 0x64617461

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v1, v2}, Ln4/c;->b(ILc4/i;Lv5/u;)Ln4/c$a;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v1, v7}, Lc4/i;->j(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 91
    .line 92
    .line 93
    move-result-wide v7

    .line 94
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-wide v7, v2, Ln4/c$a;->b:J

    .line 99
    .line 100
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iput v3, v0, Ln4/a;->f:I

    .line 117
    .line 118
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    iget-wide v7, v0, Ln4/a;->d:J

    .line 127
    .line 128
    cmp-long v5, v7, v9

    .line 129
    .line 130
    if-eqz v5, :cond_4

    .line 131
    .line 132
    const-wide v11, 0xffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    cmp-long v5, v2, v11

    .line 138
    .line 139
    if-nez v5, :cond_4

    .line 140
    .line 141
    move-wide v2, v7

    .line 142
    :cond_4
    iget v5, v0, Ln4/a;->f:I

    .line 143
    .line 144
    int-to-long v7, v5

    .line 145
    add-long/2addr v7, v2

    .line 146
    iput-wide v7, v0, Ln4/a;->g:J

    .line 147
    .line 148
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 149
    .line 150
    .line 151
    move-result-wide v1

    .line 152
    cmp-long v3, v1, v9

    .line 153
    .line 154
    if-eqz v3, :cond_5

    .line 155
    .line 156
    iget-wide v7, v0, Ln4/a;->g:J

    .line 157
    .line 158
    cmp-long v3, v7, v1

    .line 159
    .line 160
    if-lez v3, :cond_5

    .line 161
    .line 162
    const-string v3, "Data exceeds input length: "

    .line 163
    .line 164
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iget-wide v7, v0, Ln4/a;->g:J

    .line 169
    .line 170
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v5, ", "

    .line 174
    .line 175
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    const-string v5, "WavExtractor"

    .line 186
    .line 187
    invoke-static {v5, v3}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iput-wide v1, v0, Ln4/a;->g:J

    .line 191
    .line 192
    :cond_5
    iget-object v1, v0, Ln4/a;->e:Ln4/a$b;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget v2, v0, Ln4/a;->f:I

    .line 198
    .line 199
    iget-wide v7, v0, Ln4/a;->g:J

    .line 200
    .line 201
    invoke-interface {v1, v2, v7, v8}, Ln4/a$b;->c(IJ)V

    .line 202
    .line 203
    .line 204
    iput v4, v0, Ln4/a;->c:I

    .line 205
    .line 206
    return v6

    .line 207
    :cond_6
    new-instance v2, Lv5/u;

    .line 208
    .line 209
    const/16 v3, 0x10

    .line 210
    .line 211
    invoke-direct {v2, v3}, Lv5/u;-><init>(I)V

    .line 212
    .line 213
    .line 214
    const v7, 0x666d7420

    .line 215
    .line 216
    .line 217
    invoke-static {v7, v1, v2}, Ln4/c;->b(ILc4/i;Lv5/u;)Ln4/c$a;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    iget-wide v8, v7, Ln4/c$a;->b:J

    .line 222
    .line 223
    const-wide/16 v12, 0x10

    .line 224
    .line 225
    cmp-long v8, v8, v12

    .line 226
    .line 227
    if-ltz v8, :cond_7

    .line 228
    .line 229
    move v8, v5

    .line 230
    goto :goto_2

    .line 231
    :cond_7
    move v8, v6

    .line 232
    :goto_2
    invoke-static {v8}, Lx6/b;->H(Z)V

    .line 233
    .line 234
    .line 235
    iget-object v8, v2, Lv5/u;->a:[B

    .line 236
    .line 237
    invoke-interface {v1, v8, v6, v3}, Lc4/i;->m([BII)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v6}, Lv5/u;->G(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Lv5/u;->n()I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    invoke-virtual {v2}, Lv5/u;->n()I

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    invoke-virtual {v2}, Lv5/u;->m()I

    .line 252
    .line 253
    .line 254
    move-result v15

    .line 255
    invoke-virtual {v2}, Lv5/u;->m()I

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lv5/u;->n()I

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    invoke-virtual {v2}, Lv5/u;->n()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    iget-wide v9, v7, Ln4/c$a;->b:J

    .line 267
    .line 268
    long-to-int v7, v9

    .line 269
    sub-int/2addr v7, v3

    .line 270
    if-lez v7, :cond_8

    .line 271
    .line 272
    new-array v3, v7, [B

    .line 273
    .line 274
    invoke-interface {v1, v3, v6, v7}, Lc4/i;->m([BII)V

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_8
    sget-object v3, Lv5/e0;->f:[B

    .line 279
    .line 280
    :goto_3
    move-object/from16 v18, v3

    .line 281
    .line 282
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 283
    .line 284
    .line 285
    move-result-wide v9

    .line 286
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 287
    .line 288
    .line 289
    move-result-wide v12

    .line 290
    sub-long/2addr v9, v12

    .line 291
    long-to-int v3, v9

    .line 292
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 293
    .line 294
    .line 295
    new-instance v1, Ln4/b;

    .line 296
    .line 297
    move-object v12, v1

    .line 298
    move v13, v8

    .line 299
    move/from16 v17, v2

    .line 300
    .line 301
    invoke-direct/range {v12 .. v18}, Ln4/b;-><init>(IIIII[B)V

    .line 302
    .line 303
    .line 304
    const/16 v3, 0x11

    .line 305
    .line 306
    if-ne v8, v3, :cond_9

    .line 307
    .line 308
    new-instance v2, Ln4/a$a;

    .line 309
    .line 310
    iget-object v3, v0, Ln4/a;->a:Lc4/j;

    .line 311
    .line 312
    iget-object v4, v0, Ln4/a;->b:Lc4/v;

    .line 313
    .line 314
    invoke-direct {v2, v3, v4, v1}, Ln4/a$a;-><init>(Lc4/j;Lc4/v;Ln4/b;)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_7

    .line 318
    .line 319
    :cond_9
    const/4 v3, 0x6

    .line 320
    if-ne v8, v3, :cond_a

    .line 321
    .line 322
    new-instance v2, Ln4/a$c;

    .line 323
    .line 324
    iget-object v3, v0, Ln4/a;->a:Lc4/j;

    .line 325
    .line 326
    iget-object v4, v0, Ln4/a;->b:Lc4/v;

    .line 327
    .line 328
    const/16 v24, -0x1

    .line 329
    .line 330
    const-string v23, "audio/g711-alaw"

    .line 331
    .line 332
    move-object/from16 v19, v2

    .line 333
    .line 334
    move-object/from16 v20, v3

    .line 335
    .line 336
    move-object/from16 v21, v4

    .line 337
    .line 338
    move-object/from16 v22, v1

    .line 339
    .line 340
    invoke-direct/range {v19 .. v24}, Ln4/a$c;-><init>(Lc4/j;Lc4/v;Ln4/b;Ljava/lang/String;I)V

    .line 341
    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_a
    const/4 v3, 0x7

    .line 345
    if-ne v8, v3, :cond_b

    .line 346
    .line 347
    new-instance v2, Ln4/a$c;

    .line 348
    .line 349
    iget-object v3, v0, Ln4/a;->a:Lc4/j;

    .line 350
    .line 351
    iget-object v4, v0, Ln4/a;->b:Lc4/v;

    .line 352
    .line 353
    const/16 v24, -0x1

    .line 354
    .line 355
    const-string v23, "audio/g711-mlaw"

    .line 356
    .line 357
    move-object/from16 v19, v2

    .line 358
    .line 359
    move-object/from16 v20, v3

    .line 360
    .line 361
    move-object/from16 v21, v4

    .line 362
    .line 363
    move-object/from16 v22, v1

    .line 364
    .line 365
    invoke-direct/range {v19 .. v24}, Ln4/a$c;-><init>(Lc4/j;Lc4/v;Ln4/b;Ljava/lang/String;I)V

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_b
    if-eq v8, v5, :cond_e

    .line 370
    .line 371
    if-eq v8, v11, :cond_c

    .line 372
    .line 373
    const v3, 0xfffe

    .line 374
    .line 375
    .line 376
    if-eq v8, v3, :cond_e

    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_c
    const/16 v3, 0x20

    .line 380
    .line 381
    if-ne v2, v3, :cond_d

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_d
    :goto_4
    move/from16 v24, v6

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_e
    invoke-static {v2}, Lv5/e0;->v(I)I

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    :goto_5
    move/from16 v24, v4

    .line 392
    .line 393
    :goto_6
    if-eqz v24, :cond_f

    .line 394
    .line 395
    new-instance v2, Ln4/a$c;

    .line 396
    .line 397
    iget-object v3, v0, Ln4/a;->a:Lc4/j;

    .line 398
    .line 399
    iget-object v4, v0, Ln4/a;->b:Lc4/v;

    .line 400
    .line 401
    const-string v23, "audio/raw"

    .line 402
    .line 403
    move-object/from16 v19, v2

    .line 404
    .line 405
    move-object/from16 v20, v3

    .line 406
    .line 407
    move-object/from16 v21, v4

    .line 408
    .line 409
    move-object/from16 v22, v1

    .line 410
    .line 411
    invoke-direct/range {v19 .. v24}, Ln4/a$c;-><init>(Lc4/j;Lc4/v;Ln4/b;Ljava/lang/String;I)V

    .line 412
    .line 413
    .line 414
    :goto_7
    iput-object v2, v0, Ln4/a;->e:Ln4/a$b;

    .line 415
    .line 416
    iput v11, v0, Ln4/a;->c:I

    .line 417
    .line 418
    return v6

    .line 419
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    const-string v2, "Unsupported WAV format type: "

    .line 425
    .line 426
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-static {v1}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    throw v1

    .line 441
    :cond_10
    new-instance v2, Lv5/u;

    .line 442
    .line 443
    invoke-direct {v2, v7}, Lv5/u;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-static {v1, v2}, Ln4/c$a;->a(Lc4/i;Lv5/u;)Ln4/c$a;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    iget v4, v3, Ln4/c$a;->a:I

    .line 451
    .line 452
    const v5, 0x64733634

    .line 453
    .line 454
    .line 455
    if-eq v4, v5, :cond_11

    .line 456
    .line 457
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 458
    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_11
    invoke-interface {v1, v7}, Lc4/i;->e(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6}, Lv5/u;->G(I)V

    .line 465
    .line 466
    .line 467
    iget-object v4, v2, Lv5/u;->a:[B

    .line 468
    .line 469
    invoke-interface {v1, v4, v6, v7}, Lc4/i;->m([BII)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Lv5/u;->j()J

    .line 473
    .line 474
    .line 475
    move-result-wide v9

    .line 476
    iget-wide v2, v3, Ln4/c$a;->b:J

    .line 477
    .line 478
    long-to-int v2, v2

    .line 479
    add-int/2addr v2, v7

    .line 480
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 481
    .line 482
    .line 483
    :goto_8
    iput-wide v9, v0, Ln4/a;->d:J

    .line 484
    .line 485
    iput v8, v0, Ln4/a;->c:I

    .line 486
    .line 487
    return v6

    .line 488
    :cond_12
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 489
    .line 490
    .line 491
    move-result-wide v7

    .line 492
    const-wide/16 v9, 0x0

    .line 493
    .line 494
    cmp-long v2, v7, v9

    .line 495
    .line 496
    if-nez v2, :cond_13

    .line 497
    .line 498
    move v2, v5

    .line 499
    goto :goto_9

    .line 500
    :cond_13
    move v2, v6

    .line 501
    :goto_9
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 502
    .line 503
    .line 504
    iget v2, v0, Ln4/a;->f:I

    .line 505
    .line 506
    if-eq v2, v3, :cond_14

    .line 507
    .line 508
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 509
    .line 510
    .line 511
    iput v4, v0, Ln4/a;->c:I

    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_14
    invoke-static/range {p1 .. p1}, Ln4/c;->a(Lc4/i;)Z

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    if-eqz v2, :cond_15

    .line 519
    .line 520
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 521
    .line 522
    .line 523
    move-result-wide v2

    .line 524
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 525
    .line 526
    .line 527
    move-result-wide v7

    .line 528
    sub-long/2addr v2, v7

    .line 529
    long-to-int v2, v2

    .line 530
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 531
    .line 532
    .line 533
    iput v5, v0, Ln4/a;->c:I

    .line 534
    .line 535
    :goto_a
    return v6

    .line 536
    :cond_15
    const/4 v1, 0x0

    .line 537
    const-string v2, "Unsupported or unrecognized wav file type."

    .line 538
    .line 539
    invoke-static {v2, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    throw v1
.end method

.method public final f(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Ln4/a;->c:I

    iget-object p1, p0, Ln4/a;->e:Ln4/a$b;

    if-eqz p1, :cond_1

    invoke-interface {p1, p3, p4}, Ln4/a$b;->a(J)V

    :cond_1
    return-void
.end method

.method public final i(Lc4/i;)Z
    .locals 0

    invoke-static {p1}, Ln4/c;->a(Lc4/i;)Z

    move-result p1

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
