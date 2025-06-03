.class public final Le5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# static fields
.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv5/c0;

.field public final c:Lv5/u;

.field public d:Lc4/j;

.field public e:[B

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "LOCAL:([^,]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le5/p;->g:Ljava/util/regex/Pattern;

    const-string v0, "MPEGTS:(-?\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le5/p;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv5/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/p;->a:Ljava/lang/String;

    iput-object p2, p0, Le5/p;->b:Lv5/c0;

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Le5/p;->c:Lv5/u;

    const/16 p1, 0x400

    new-array p1, p1, [B

    iput-object p1, p0, Le5/p;->e:[B

    return-void
.end method


# virtual methods
.method public final a(J)Lc4/v;
    .locals 3

    .line 1
    iget-object v0, p0, Le5/p;->d:Lc4/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-interface {v0, v1, v2}, Lc4/j;->r(II)Lc4/v;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lv3/i0$a;

    .line 10
    .line 11
    invoke-direct {v1}, Lv3/i0$a;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "text/vtt"

    .line 15
    .line 16
    iput-object v2, v1, Lv3/i0$a;->k:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Le5/p;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v2, v1, Lv3/i0$a;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-wide p1, v1, Lv3/i0$a;->o:J

    .line 23
    .line 24
    invoke-virtual {v1}, Lv3/i0$a;->a()Lv3/i0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {v0, p1}, Lc4/v;->d(Lv3/i0;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Le5/p;->d:Lc4/j;

    .line 32
    .line 33
    invoke-interface {p1}, Lc4/j;->m()V

    .line 34
    .line 35
    .line 36
    return-object v0
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

.method public final b(Lc4/j;)V
    .locals 3

    iput-object p1, p0, Le5/p;->d:Lc4/j;

    new-instance v0, Lc4/t$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lc4/t$b;-><init>(J)V

    invoke-interface {p1, v0}, Lc4/j;->t(Lc4/t;)V

    return-void
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Le5/p;->d:Lc4/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    long-to-int v1, v1

    .line 13
    iget v2, v0, Le5/p;->f:I

    .line 14
    .line 15
    iget-object v3, v0, Le5/p;->e:[B

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    const/4 v5, -0x1

    .line 19
    if-ne v2, v4, :cond_1

    .line 20
    .line 21
    if-eq v1, v5, :cond_0

    .line 22
    .line 23
    move v2, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v2, v3

    .line 26
    :goto_0
    mul-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    div-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v0, Le5/p;->e:[B

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Le5/p;->e:[B

    .line 37
    .line 38
    iget v3, v0, Le5/p;->f:I

    .line 39
    .line 40
    array-length v4, v2

    .line 41
    sub-int/2addr v4, v3

    .line 42
    move-object/from16 v6, p1

    .line 43
    .line 44
    invoke-interface {v6, v2, v3, v4}, Lc4/i;->read([BII)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eq v2, v5, :cond_3

    .line 49
    .line 50
    iget v3, v0, Le5/p;->f:I

    .line 51
    .line 52
    add-int/2addr v3, v2

    .line 53
    iput v3, v0, Le5/p;->f:I

    .line 54
    .line 55
    if-eq v1, v5, :cond_2

    .line 56
    .line 57
    if-eq v3, v1, :cond_3

    .line 58
    .line 59
    :cond_2
    const/4 v1, 0x0

    .line 60
    return v1

    .line 61
    :cond_3
    new-instance v1, Lv5/u;

    .line 62
    .line 63
    iget-object v2, v0, Le5/p;->e:[B

    .line 64
    .line 65
    invoke-direct {v1, v2}, Lv5/u;-><init>([B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Lq5/h;->d(Lv5/u;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lv5/u;->g()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-wide/16 v3, 0x0

    .line 76
    .line 77
    move-wide v6, v3

    .line 78
    move-wide v8, v6

    .line 79
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const/4 v11, 0x1

    .line 84
    const/4 v12, 0x0

    .line 85
    const-wide/32 v13, 0xf4240

    .line 86
    .line 87
    .line 88
    const-wide/32 v15, 0x15f90

    .line 89
    .line 90
    .line 91
    if-nez v10, :cond_7

    .line 92
    .line 93
    const-string v10, "X-TIMESTAMP-MAP"

    .line 94
    .line 95
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_6

    .line 100
    .line 101
    sget-object v6, Le5/p;->g:Ljava/util/regex/Pattern;

    .line 102
    .line 103
    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_5

    .line 112
    .line 113
    sget-object v7, Le5/p;->h:Ljava/util/regex/Pattern;

    .line 114
    .line 115
    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_4

    .line 124
    .line 125
    invoke-virtual {v6, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lq5/h;->c(Ljava/lang/String;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v8

    .line 136
    invoke-virtual {v7, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    mul-long/2addr v6, v13

    .line 148
    div-long/2addr v6, v15

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v3, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 156
    .line 157
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1, v12}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    throw v1

    .line 172
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v3, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 178
    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1, v12}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    throw v1

    .line 194
    :cond_6
    :goto_2
    invoke-virtual {v1}, Lv5/u;->g()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    goto :goto_1

    .line 199
    :cond_7
    invoke-virtual {v1}, Lv5/u;->g()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-eqz v2, :cond_9

    .line 204
    .line 205
    sget-object v10, Lq5/h;->a:Ljava/util/regex/Pattern;

    .line 206
    .line 207
    invoke-virtual {v10, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_8

    .line 216
    .line 217
    :goto_3
    invoke-virtual {v1}, Lv5/u;->g()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-eqz v2, :cond_7

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-nez v2, :cond_7

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_8
    sget-object v10, Lq5/f;->a:Ljava/util/regex/Pattern;

    .line 231
    .line 232
    invoke-virtual {v10, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-eqz v10, :cond_7

    .line 241
    .line 242
    move-object v12, v2

    .line 243
    :cond_9
    if-nez v12, :cond_a

    .line 244
    .line 245
    invoke-virtual {v0, v3, v4}, Le5/p;->a(J)Lc4/v;

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_a
    invoke-virtual {v12, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v1}, Lq5/h;->c(Ljava/lang/String;)J

    .line 257
    .line 258
    .line 259
    move-result-wide v1

    .line 260
    iget-object v3, v0, Le5/p;->b:Lv5/c0;

    .line 261
    .line 262
    add-long/2addr v6, v1

    .line 263
    sub-long/2addr v6, v8

    .line 264
    mul-long/2addr v6, v15

    .line 265
    div-long/2addr v6, v13

    .line 266
    const-wide v8, 0x200000000L

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    rem-long/2addr v6, v8

    .line 272
    invoke-virtual {v3, v6, v7}, Lv5/c0;->b(J)J

    .line 273
    .line 274
    .line 275
    move-result-wide v9

    .line 276
    sub-long v1, v9, v1

    .line 277
    .line 278
    invoke-virtual {v0, v1, v2}, Le5/p;->a(J)Lc4/v;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    iget-object v1, v0, Le5/p;->c:Lv5/u;

    .line 283
    .line 284
    iget-object v2, v0, Le5/p;->e:[B

    .line 285
    .line 286
    iget v3, v0, Le5/p;->f:I

    .line 287
    .line 288
    invoke-virtual {v1, v2, v3}, Lv5/u;->E([BI)V

    .line 289
    .line 290
    .line 291
    iget-object v1, v0, Le5/p;->c:Lv5/u;

    .line 292
    .line 293
    iget v2, v0, Le5/p;->f:I

    .line 294
    .line 295
    invoke-interface {v8, v2, v1}, Lc4/v;->b(ILv5/u;)V

    .line 296
    .line 297
    .line 298
    const/4 v11, 0x1

    .line 299
    iget v12, v0, Le5/p;->f:I

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    invoke-interface/range {v8 .. v14}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 304
    .line 305
    .line 306
    :goto_4
    return v5
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
.end method

.method public final f(JJ)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final i(Lc4/i;)Z
    .locals 4

    iget-object v0, p0, Le5/p;->e:[B

    check-cast p1, Lc4/e;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    iget-object v0, p0, Le5/p;->c:Lv5/u;

    iget-object v3, p0, Le5/p;->e:[B

    invoke-virtual {v0, v3, v2}, Lv5/u;->E([BI)V

    iget-object v0, p0, Le5/p;->c:Lv5/u;

    invoke-static {v0}, Lq5/h;->a(Lv5/u;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Le5/p;->e:[B

    const/4 v3, 0x3

    invoke-virtual {p1, v0, v2, v3, v1}, Lc4/e;->c([BIIZ)Z

    iget-object p1, p0, Le5/p;->c:Lv5/u;

    iget-object v0, p0, Le5/p;->e:[B

    const/16 v1, 0x9

    invoke-virtual {p1, v0, v1}, Lv5/u;->E([BI)V

    iget-object p1, p0, Le5/p;->c:Lv5/u;

    invoke-static {p1}, Lq5/h;->a(Lv5/u;)Z

    move-result p1

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
