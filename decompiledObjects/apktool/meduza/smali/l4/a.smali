.class public final Ll4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll4/a$a;
    }
.end annotation


# instance fields
.field public final a:Ll4/e;

.field public final b:J

.field public final c:J

.field public final d:Ll4/h;

.field public e:I

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:J


# direct methods
.method public constructor <init>(Ll4/h;JJJJZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    cmp-long v0, p4, p2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    iput-object p1, p0, Ll4/a;->d:Ll4/h;

    iput-wide p2, p0, Ll4/a;->b:J

    iput-wide p4, p0, Ll4/a;->c:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    :cond_1
    iput v1, p0, Ll4/a;->e:I

    goto :goto_2

    :cond_2
    :goto_1
    iput-wide p8, p0, Ll4/a;->f:J

    const/4 p1, 0x4

    iput p1, p0, Ll4/a;->e:I

    :goto_2
    new-instance p1, Ll4/e;

    invoke-direct {p1}, Ll4/e;-><init>()V

    iput-object p1, p0, Ll4/a;->a:Ll4/e;

    return-void
.end method


# virtual methods
.method public final a()Lc4/t;
    .locals 4

    iget-wide v0, p0, Ll4/a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ll4/a$a;

    invoke-direct {v0, p0}, Ll4/a$a;-><init>(Ll4/a;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b(Lc4/i;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ll4/a;->e:I

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x4

    .line 11
    const-wide/16 v7, -0x1

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    if-eqz v2, :cond_c

    .line 15
    .line 16
    if-eq v2, v5, :cond_d

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v10, 0x3

    .line 20
    if-eq v2, v5, :cond_2

    .line 21
    .line 22
    if-eq v2, v10, :cond_1

    .line 23
    .line 24
    if-ne v2, v6, :cond_0

    .line 25
    .line 26
    return-wide v7

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    move-wide v4, v7

    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_2
    iget-wide v13, v0, Ll4/a;->i:J

    .line 37
    .line 38
    iget-wide v11, v0, Ll4/a;->j:J

    .line 39
    .line 40
    cmp-long v2, v13, v11

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 46
    .line 47
    .line 48
    move-result-wide v11

    .line 49
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 50
    .line 51
    iget-wide v13, v0, Ll4/a;->j:J

    .line 52
    .line 53
    invoke-virtual {v2, v1, v13, v14}, Ll4/e;->b(Lc4/i;J)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    iget-wide v2, v0, Ll4/a;->i:J

    .line 60
    .line 61
    cmp-long v4, v2, v11

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    move-wide v4, v7

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 69
    .line 70
    const-string v2, "No ogg page can be found."

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_5
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 77
    .line 78
    invoke-virtual {v2, v1, v9}, Ll4/e;->a(Lc4/i;Z)Z

    .line 79
    .line 80
    .line 81
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 82
    .line 83
    .line 84
    iget-wide v13, v0, Ll4/a;->h:J

    .line 85
    .line 86
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 87
    .line 88
    iget-wide v9, v2, Ll4/e;->b:J

    .line 89
    .line 90
    sub-long/2addr v13, v9

    .line 91
    iget v5, v2, Ll4/e;->d:I

    .line 92
    .line 93
    iget v2, v2, Ll4/e;->e:I

    .line 94
    .line 95
    add-int/2addr v5, v2

    .line 96
    cmp-long v2, v3, v13

    .line 97
    .line 98
    if-gtz v2, :cond_6

    .line 99
    .line 100
    const-wide/32 v15, 0x11940

    .line 101
    .line 102
    .line 103
    cmp-long v2, v13, v15

    .line 104
    .line 105
    if-gez v2, :cond_6

    .line 106
    .line 107
    :goto_0
    move-wide v2, v7

    .line 108
    move-wide v4, v2

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    cmp-long v2, v13, v3

    .line 111
    .line 112
    if-gez v2, :cond_7

    .line 113
    .line 114
    iput-wide v11, v0, Ll4/a;->j:J

    .line 115
    .line 116
    iput-wide v9, v0, Ll4/a;->l:J

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    int-to-long v9, v5

    .line 124
    add-long/2addr v3, v9

    .line 125
    iput-wide v3, v0, Ll4/a;->i:J

    .line 126
    .line 127
    iget-object v3, v0, Ll4/a;->a:Ll4/e;

    .line 128
    .line 129
    iget-wide v3, v3, Ll4/e;->b:J

    .line 130
    .line 131
    iput-wide v3, v0, Ll4/a;->k:J

    .line 132
    .line 133
    :goto_1
    iget-wide v3, v0, Ll4/a;->j:J

    .line 134
    .line 135
    iget-wide v9, v0, Ll4/a;->i:J

    .line 136
    .line 137
    sub-long/2addr v3, v9

    .line 138
    const-wide/32 v11, 0x186a0

    .line 139
    .line 140
    .line 141
    cmp-long v3, v3, v11

    .line 142
    .line 143
    if-gez v3, :cond_8

    .line 144
    .line 145
    iput-wide v9, v0, Ll4/a;->j:J

    .line 146
    .line 147
    move-wide v4, v7

    .line 148
    move-wide v2, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_8
    int-to-long v3, v5

    .line 151
    const-wide/16 v9, 0x1

    .line 152
    .line 153
    if-gtz v2, :cond_9

    .line 154
    .line 155
    const-wide/16 v11, 0x2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    move-wide v11, v9

    .line 159
    :goto_2
    mul-long/2addr v3, v11

    .line 160
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    sub-long/2addr v11, v3

    .line 165
    iget-wide v2, v0, Ll4/a;->j:J

    .line 166
    .line 167
    iget-wide v4, v0, Ll4/a;->i:J

    .line 168
    .line 169
    sub-long v15, v2, v4

    .line 170
    .line 171
    mul-long/2addr v15, v13

    .line 172
    iget-wide v13, v0, Ll4/a;->l:J

    .line 173
    .line 174
    iget-wide v6, v0, Ll4/a;->k:J

    .line 175
    .line 176
    sub-long/2addr v13, v6

    .line 177
    div-long/2addr v15, v13

    .line 178
    add-long/2addr v15, v11

    .line 179
    sub-long v19, v2, v9

    .line 180
    .line 181
    move-wide/from16 v17, v4

    .line 182
    .line 183
    invoke-static/range {v15 .. v20}, Lv5/e0;->j(JJJ)J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    const-wide/16 v4, -0x1

    .line 188
    .line 189
    :goto_3
    cmp-long v6, v2, v4

    .line 190
    .line 191
    if-eqz v6, :cond_a

    .line 192
    .line 193
    return-wide v2

    .line 194
    :cond_a
    const/4 v2, 0x3

    .line 195
    iput v2, v0, Ll4/a;->e:I

    .line 196
    .line 197
    :goto_4
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 198
    .line 199
    invoke-virtual {v2, v1, v4, v5}, Ll4/e;->b(Lc4/i;J)Z

    .line 200
    .line 201
    .line 202
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    invoke-virtual {v2, v1, v3}, Ll4/e;->a(Lc4/i;Z)Z

    .line 206
    .line 207
    .line 208
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 209
    .line 210
    iget-wide v3, v2, Ll4/e;->b:J

    .line 211
    .line 212
    iget-wide v5, v0, Ll4/a;->h:J

    .line 213
    .line 214
    cmp-long v3, v3, v5

    .line 215
    .line 216
    if-lez v3, :cond_b

    .line 217
    .line 218
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 219
    .line 220
    .line 221
    const/4 v1, 0x4

    .line 222
    iput v1, v0, Ll4/a;->e:I

    .line 223
    .line 224
    iget-wide v1, v0, Ll4/a;->k:J

    .line 225
    .line 226
    const-wide/16 v6, 0x2

    .line 227
    .line 228
    add-long/2addr v1, v6

    .line 229
    neg-long v1, v1

    .line 230
    return-wide v1

    .line 231
    :cond_b
    const-wide/16 v6, 0x2

    .line 232
    .line 233
    iget v3, v2, Ll4/e;->d:I

    .line 234
    .line 235
    iget v2, v2, Ll4/e;->e:I

    .line 236
    .line 237
    add-int/2addr v3, v2

    .line 238
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 239
    .line 240
    .line 241
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    iput-wide v2, v0, Ll4/a;->i:J

    .line 246
    .line 247
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 248
    .line 249
    iget-wide v2, v2, Ll4/e;->b:J

    .line 250
    .line 251
    iput-wide v2, v0, Ll4/a;->k:J

    .line 252
    .line 253
    const-wide/16 v4, -0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_c
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    iput-wide v6, v0, Ll4/a;->g:J

    .line 261
    .line 262
    iput v5, v0, Ll4/a;->e:I

    .line 263
    .line 264
    iget-wide v8, v0, Ll4/a;->c:J

    .line 265
    .line 266
    const-wide/32 v10, 0xff1b

    .line 267
    .line 268
    .line 269
    sub-long/2addr v8, v10

    .line 270
    cmp-long v2, v8, v6

    .line 271
    .line 272
    if-lez v2, :cond_d

    .line 273
    .line 274
    return-wide v8

    .line 275
    :cond_d
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 276
    .line 277
    const/4 v6, 0x0

    .line 278
    iput v6, v2, Ll4/e;->a:I

    .line 279
    .line 280
    iput-wide v3, v2, Ll4/e;->b:J

    .line 281
    .line 282
    iput v6, v2, Ll4/e;->c:I

    .line 283
    .line 284
    iput v6, v2, Ll4/e;->d:I

    .line 285
    .line 286
    iput v6, v2, Ll4/e;->e:I

    .line 287
    .line 288
    const-wide/16 v3, -0x1

    .line 289
    .line 290
    invoke-virtual {v2, v1, v3, v4}, Ll4/e;->b(Lc4/i;J)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_10

    .line 295
    .line 296
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 297
    .line 298
    invoke-virtual {v2, v1, v6}, Ll4/e;->a(Lc4/i;Z)Z

    .line 299
    .line 300
    .line 301
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 302
    .line 303
    iget v3, v2, Ll4/e;->d:I

    .line 304
    .line 305
    iget v2, v2, Ll4/e;->e:I

    .line 306
    .line 307
    add-int/2addr v3, v2

    .line 308
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 309
    .line 310
    .line 311
    :cond_e
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 312
    .line 313
    iget-wide v3, v2, Ll4/e;->b:J

    .line 314
    .line 315
    iget v7, v2, Ll4/e;->a:I

    .line 316
    .line 317
    const/4 v8, 0x4

    .line 318
    and-int/2addr v7, v8

    .line 319
    if-eq v7, v8, :cond_f

    .line 320
    .line 321
    const-wide/16 v7, -0x1

    .line 322
    .line 323
    invoke-virtual {v2, v1, v7, v8}, Ll4/e;->b(Lc4/i;J)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_f

    .line 328
    .line 329
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 330
    .line 331
    .line 332
    move-result-wide v9

    .line 333
    iget-wide v11, v0, Ll4/a;->c:J

    .line 334
    .line 335
    cmp-long v2, v9, v11

    .line 336
    .line 337
    if-gez v2, :cond_f

    .line 338
    .line 339
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 340
    .line 341
    invoke-virtual {v2, v1, v5}, Ll4/e;->a(Lc4/i;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-eqz v2, :cond_f

    .line 346
    .line 347
    iget-object v2, v0, Ll4/a;->a:Ll4/e;

    .line 348
    .line 349
    iget v9, v2, Ll4/e;->d:I

    .line 350
    .line 351
    iget v2, v2, Ll4/e;->e:I

    .line 352
    .line 353
    add-int/2addr v9, v2

    .line 354
    :try_start_0
    invoke-interface {v1, v9}, Lc4/i;->j(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    .line 356
    .line 357
    move v2, v5

    .line 358
    goto :goto_5

    .line 359
    :catch_0
    move v2, v6

    .line 360
    :goto_5
    if-nez v2, :cond_e

    .line 361
    .line 362
    :cond_f
    iput-wide v3, v0, Ll4/a;->f:J

    .line 363
    .line 364
    const/4 v1, 0x4

    .line 365
    iput v1, v0, Ll4/a;->e:I

    .line 366
    .line 367
    iget-wide v1, v0, Ll4/a;->g:J

    .line 368
    .line 369
    return-wide v1

    .line 370
    :cond_10
    new-instance v1, Ljava/io/EOFException;

    .line 371
    .line 372
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 373
    .line 374
    .line 375
    throw v1
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
.end method

.method public final c(J)V
    .locals 10

    iget-wide v0, p0, Ll4/a;->f:J

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    const-wide/16 v6, 0x0

    move-wide v4, p1

    invoke-static/range {v4 .. v9}, Lv5/e0;->j(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll4/a;->h:J

    const/4 p1, 0x2

    iput p1, p0, Ll4/a;->e:I

    iget-wide p1, p0, Ll4/a;->b:J

    iput-wide p1, p0, Ll4/a;->i:J

    iget-wide p1, p0, Ll4/a;->c:J

    iput-wide p1, p0, Ll4/a;->j:J

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Ll4/a;->k:J

    iget-wide p1, p0, Ll4/a;->f:J

    iput-wide p1, p0, Ll4/a;->l:J

    return-void
.end method
