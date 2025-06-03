.class public final Lk4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/b$f;,
        Lk4/b$e;,
        Lk4/b$c;,
        Lk4/b$b;,
        Lk4/b$d;,
        Lk4/b$a;
    }
.end annotation


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "OpusHead"

    invoke-static {v0}, Lv5/e0;->B(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lk4/b;->a:[B

    return-void
.end method

.method public static a(ILv5/u;)Lk4/b$b;
    .locals 13

    add-int/lit8 p0, p0, 0x8

    const/4 v0, 0x4

    add-int/2addr p0, v0

    invoke-virtual {p1, p0}, Lv5/u;->G(I)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Lv5/u;->H(I)V

    invoke-static {p1}, Lk4/b;->b(Lv5/u;)I

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lv5/u;->H(I)V

    invoke-virtual {p1}, Lv5/u;->v()I

    move-result v2

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_0

    invoke-virtual {p1, v1}, Lv5/u;->H(I)V

    :cond_0
    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lv5/u;->v()I

    move-result v3

    invoke-virtual {p1, v3}, Lv5/u;->H(I)V

    :cond_1
    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_2

    invoke-virtual {p1, v1}, Lv5/u;->H(I)V

    :cond_2
    invoke-virtual {p1, p0}, Lv5/u;->H(I)V

    invoke-static {p1}, Lk4/b;->b(Lv5/u;)I

    invoke-virtual {p1}, Lv5/u;->v()I

    move-result v1

    invoke-static {v1}, Lv5/p;->f(I)Ljava/lang/String;

    move-result-object v3

    const-string v1, "audio/mpeg"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "audio/vnd.dts"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "audio/vnd.dts.hd"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v0}, Lv5/u;->H(I)V

    invoke-virtual {p1}, Lv5/u;->w()J

    move-result-wide v0

    invoke-virtual {p1}, Lv5/u;->w()J

    move-result-wide v4

    invoke-virtual {p1, p0}, Lv5/u;->H(I)V

    invoke-static {p1}, Lk4/b;->b(Lv5/u;)I

    move-result p0

    new-array v6, p0, [B

    const/4 v2, 0x0

    invoke-virtual {p1, v6, v2, p0}, Lv5/u;->d([BII)V

    new-instance p0, Lk4/b$b;

    const-wide/16 v7, 0x0

    cmp-long p1, v4, v7

    const-wide/16 v9, -0x1

    if-lez p1, :cond_4

    move-wide v11, v4

    goto :goto_0

    :cond_4
    move-wide v11, v9

    :goto_0
    cmp-long p1, v0, v7

    if-lez p1, :cond_5

    move-wide v7, v0

    goto :goto_1

    :cond_5
    move-wide v7, v9

    :goto_1
    move-object v2, p0

    move-object v4, v6

    move-wide v5, v11

    invoke-direct/range {v2 .. v8}, Lk4/b$b;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0

    :cond_6
    :goto_2
    new-instance p0, Lk4/b$b;

    const/4 v4, 0x0

    const-wide/16 v5, -0x1

    const-wide/16 v7, -0x1

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lk4/b$b;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0
.end method

.method public static b(Lv5/u;)I
    .locals 3

    invoke-virtual {p0}, Lv5/u;->v()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lv5/u;->v()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static c(IILv5/u;)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget v1, v0, Lv5/u;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p0

    .line 6
    .line 7
    move/from16 v4, p1

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v5

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v6

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Lx6/b;->u(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v10, v6

    .line 43
    move v9, v8

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    :goto_2
    sub-int v12, v7, v1

    .line 47
    .line 48
    const/4 v13, 0x4

    .line 49
    if-ge v12, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const v3, 0x66726d61

    .line 63
    .line 64
    .line 65
    if-ne v14, v3, :cond_1

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    goto :goto_3

    .line 76
    :cond_1
    const v3, 0x7363686d

    .line 77
    .line 78
    .line 79
    if-ne v14, v3, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0, v13}, Lv5/u;->H(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v13}, Lv5/u;->s(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    const v3, 0x73636869

    .line 90
    .line 91
    .line 92
    if-ne v14, v3, :cond_3

    .line 93
    .line 94
    move v9, v7

    .line 95
    move v10, v12

    .line 96
    :cond_3
    :goto_3
    add-int/2addr v7, v12

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const-string v3, "cenc"

    .line 99
    .line 100
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_6

    .line 105
    .line 106
    const-string v3, "cbc1"

    .line 107
    .line 108
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_6

    .line 113
    .line 114
    const-string v3, "cens"

    .line 115
    .line 116
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_6

    .line 121
    .line 122
    const-string v3, "cbcs"

    .line 123
    .line 124
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_5

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    const/4 v3, 0x0

    .line 132
    goto/16 :goto_d

    .line 133
    .line 134
    :cond_6
    :goto_4
    if-eqz v15, :cond_7

    .line 135
    .line 136
    move v3, v5

    .line 137
    goto :goto_5

    .line 138
    :cond_7
    move v3, v6

    .line 139
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 140
    .line 141
    invoke-static {v7, v3}, Lx6/b;->u(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    if-eq v9, v8, :cond_8

    .line 145
    .line 146
    move v3, v5

    .line 147
    goto :goto_6

    .line 148
    :cond_8
    move v3, v6

    .line 149
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 150
    .line 151
    invoke-static {v7, v3}, Lx6/b;->u(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v3, v9, 0x8

    .line 155
    .line 156
    :goto_7
    sub-int v7, v3, v9

    .line 157
    .line 158
    if-ge v7, v10, :cond_d

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Lv5/u;->G(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    const v12, 0x74656e63

    .line 172
    .line 173
    .line 174
    if-ne v8, v12, :cond_c

    .line 175
    .line 176
    invoke-virtual/range {p2 .. p2}, Lv5/u;->f()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    shr-int/lit8 v3, v3, 0x18

    .line 181
    .line 182
    and-int/lit16 v3, v3, 0xff

    .line 183
    .line 184
    invoke-virtual {v0, v5}, Lv5/u;->H(I)V

    .line 185
    .line 186
    .line 187
    if-nez v3, :cond_9

    .line 188
    .line 189
    invoke-virtual {v0, v5}, Lv5/u;->H(I)V

    .line 190
    .line 191
    .line 192
    move v3, v6

    .line 193
    move v14, v3

    .line 194
    goto :goto_8

    .line 195
    :cond_9
    invoke-virtual/range {p2 .. p2}, Lv5/u;->v()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    and-int/lit16 v7, v3, 0xf0

    .line 200
    .line 201
    shr-int/2addr v7, v13

    .line 202
    and-int/lit8 v3, v3, 0xf

    .line 203
    .line 204
    move v14, v7

    .line 205
    :goto_8
    invoke-virtual/range {p2 .. p2}, Lv5/u;->v()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-ne v7, v5, :cond_a

    .line 210
    .line 211
    move v10, v5

    .line 212
    goto :goto_9

    .line 213
    :cond_a
    move v10, v6

    .line 214
    :goto_9
    invoke-virtual/range {p2 .. p2}, Lv5/u;->v()I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    const/16 v7, 0x10

    .line 219
    .line 220
    new-array v13, v7, [B

    .line 221
    .line 222
    invoke-virtual {v0, v13, v6, v7}, Lv5/u;->d([BII)V

    .line 223
    .line 224
    .line 225
    if-eqz v10, :cond_b

    .line 226
    .line 227
    if-nez v12, :cond_b

    .line 228
    .line 229
    invoke-virtual/range {p2 .. p2}, Lv5/u;->v()I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    new-array v8, v7, [B

    .line 234
    .line 235
    invoke-virtual {v0, v8, v6, v7}, Lv5/u;->d([BII)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v16, v8

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_b
    const/16 v16, 0x0

    .line 242
    .line 243
    :goto_a
    new-instance v7, Lk4/k;

    .line 244
    .line 245
    move-object v9, v7

    .line 246
    move-object v8, v15

    .line 247
    move v15, v3

    .line 248
    invoke-direct/range {v9 .. v16}, Lk4/k;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 249
    .line 250
    .line 251
    move-object v3, v7

    .line 252
    goto :goto_b

    .line 253
    :cond_c
    move-object v8, v15

    .line 254
    add-int/2addr v3, v7

    .line 255
    goto :goto_7

    .line 256
    :cond_d
    move-object v8, v15

    .line 257
    const/4 v3, 0x0

    .line 258
    :goto_b
    if-eqz v3, :cond_e

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_e
    move v5, v6

    .line 262
    :goto_c
    const-string v6, "tenc atom is mandatory"

    .line 263
    .line 264
    invoke-static {v6, v5}, Lx6/b;->u(Ljava/lang/String;Z)V

    .line 265
    .line 266
    .line 267
    sget v5, Lv5/e0;->a:I

    .line 268
    .line 269
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    :goto_d
    if-eqz v3, :cond_f

    .line 274
    .line 275
    return-object v3

    .line 276
    :cond_f
    add-int/2addr v1, v2

    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_10
    const/4 v1, 0x0

    .line 280
    return-object v1
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public static d(Lv5/u;IILjava/lang/String;La4/d;Z)Lk4/b$d;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const/16 v3, 0xc

    invoke-virtual {v0, v3}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v3

    new-instance v4, Lk4/b$d;

    invoke-direct {v4, v3}, Lk4/b$d;-><init>(I)V

    const/4 v5, 0x0

    move/from16 v6, p1

    :goto_0
    if-ge v5, v3, :cond_7f

    .line 1
    iget v7, v0, Lv5/u;->b:I

    .line 2
    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v8

    if-lez v8, :cond_0

    const/4 v9, 0x1

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :goto_1
    const-string v10, "childAtomSize must be positive"

    invoke-static {v10, v9}, Lx6/b;->u(Ljava/lang/String;Z)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v9

    const v11, 0x61766331

    const v12, 0x6d317620

    const v13, 0x656e6376

    const v14, 0x48323633

    if-eq v9, v11, :cond_4a

    const v11, 0x61766333

    if-eq v9, v11, :cond_4a

    if-eq v9, v13, :cond_4a

    if-eq v9, v12, :cond_4a

    const v11, 0x6d703476

    if-eq v9, v11, :cond_4a

    const v11, 0x68766331

    if-eq v9, v11, :cond_4a

    const v11, 0x68657631

    if-eq v9, v11, :cond_4a

    const v11, 0x73323633

    if-eq v9, v11, :cond_4a

    if-eq v9, v14, :cond_4a

    const v11, 0x76703038

    if-eq v9, v11, :cond_4a

    const v11, 0x76703039

    if-eq v9, v11, :cond_4a

    const v11, 0x61763031

    if-eq v9, v11, :cond_4a

    const v11, 0x64766176

    if-eq v9, v11, :cond_4a

    const v11, 0x64766131

    if-eq v9, v11, :cond_4a

    const v11, 0x64766865

    if-eq v9, v11, :cond_4a

    const v11, 0x64766831

    if-ne v9, v11, :cond_1

    goto/16 :goto_27

    :cond_1
    const v11, 0x6d703461

    const v12, 0x65632d33

    const v13, 0x61632d33

    const v14, 0x656e6361

    const v15, 0x616c6163

    if-eq v9, v11, :cond_b

    if-eq v9, v14, :cond_b

    if-eq v9, v13, :cond_b

    if-eq v9, v12, :cond_b

    const v11, 0x61632d34

    if-eq v9, v11, :cond_b

    const v11, 0x6d6c7061

    if-eq v9, v11, :cond_b

    const v11, 0x64747363

    if-eq v9, v11, :cond_b

    const v11, 0x64747365

    if-eq v9, v11, :cond_b

    const v11, 0x64747368

    if-eq v9, v11, :cond_b

    const v11, 0x6474736c

    if-eq v9, v11, :cond_b

    const v11, 0x64747378

    if-eq v9, v11, :cond_b

    const v11, 0x73616d72

    if-eq v9, v11, :cond_b

    const v11, 0x73617762

    if-eq v9, v11, :cond_b

    const v11, 0x6c70636d

    if-eq v9, v11, :cond_b

    const v11, 0x736f7774

    if-eq v9, v11, :cond_b

    const v11, 0x74776f73

    if-eq v9, v11, :cond_b

    const v11, 0x2e6d7032

    if-eq v9, v11, :cond_b

    const v11, 0x2e6d7033

    if-eq v9, v11, :cond_b

    const v11, 0x6d686131

    if-eq v9, v11, :cond_b

    const v11, 0x6d686d31

    if-eq v9, v11, :cond_b

    if-eq v9, v15, :cond_b

    const v11, 0x616c6177

    if-eq v9, v11, :cond_b

    const v11, 0x756c6177

    if-eq v9, v11, :cond_b

    const v11, 0x4f707573

    if-eq v9, v11, :cond_b

    const v11, 0x664c6143

    if-ne v9, v11, :cond_2

    goto/16 :goto_5

    :cond_2
    const v10, 0x54544d4c

    if-eq v9, v10, :cond_5

    const v10, 0x74783367

    if-eq v9, v10, :cond_5

    const v10, 0x77767474

    if-eq v9, v10, :cond_5

    const v10, 0x73747070

    if-eq v9, v10, :cond_5

    const v10, 0x63363038

    if-ne v9, v10, :cond_3

    goto :goto_2

    :cond_3
    const v10, 0x6d657474

    if-ne v9, v10, :cond_4

    add-int/lit8 v10, v7, 0x8

    add-int/lit8 v10, v10, 0x8

    .line 3
    invoke-virtual {v0, v10}, Lv5/u;->G(I)V

    const v10, 0x6d657474

    if-ne v9, v10, :cond_e

    invoke-virtual/range {p0 .. p0}, Lv5/u;->p()Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lv5/u;->p()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_e

    new-instance v10, Lv3/i0$a;

    invoke-direct {v10}, Lv3/i0$a;-><init>()V

    invoke-virtual {v10, v6}, Lv3/i0$a;->b(I)V

    .line 4
    iput-object v9, v10, Lv3/i0$a;->k:Ljava/lang/String;

    .line 5
    new-instance v9, Lv3/i0;

    invoke-direct {v9, v10}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 6
    iput-object v9, v4, Lk4/b$d;->b:Lv3/i0;

    goto/16 :goto_7

    :cond_4
    const v10, 0x63616d6d

    if-ne v9, v10, :cond_e

    .line 7
    new-instance v9, Lv3/i0$a;

    invoke-direct {v9}, Lv3/i0$a;-><init>()V

    invoke-virtual {v9, v6}, Lv3/i0$a;->b(I)V

    const-string v10, "application/x-camera-motion"

    .line 8
    iput-object v10, v9, Lv3/i0$a;->k:Ljava/lang/String;

    .line 9
    new-instance v10, Lv3/i0;

    invoke-direct {v10, v9}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 10
    iput-object v10, v4, Lk4/b$d;->b:Lv3/i0;

    goto/16 :goto_7

    :cond_5
    :goto_2
    add-int/lit8 v10, v7, 0x8

    add-int/lit8 v10, v10, 0x8

    .line 11
    invoke-virtual {v0, v10}, Lv5/u;->G(I)V

    const-wide v10, 0x7fffffffffffffffL

    const v12, 0x54544d4c

    const-string v13, "application/ttml+xml"

    if-ne v9, v12, :cond_6

    goto :goto_3

    :cond_6
    const v12, 0x74783367

    if-ne v9, v12, :cond_7

    add-int/lit8 v9, v8, -0x8

    add-int/lit8 v9, v9, -0x8

    new-array v12, v9, [B

    const/4 v13, 0x0

    invoke-virtual {v0, v12, v13, v9}, Lv5/u;->d([BII)V

    invoke-static {v12}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v9

    const-string v12, "application/x-quicktime-tx3g"

    goto :goto_4

    :cond_7
    const v12, 0x77767474

    if-ne v9, v12, :cond_8

    const-string v13, "application/x-mp4-vtt"

    goto :goto_3

    :cond_8
    const v12, 0x73747070

    if-ne v9, v12, :cond_9

    const-wide/16 v9, 0x0

    move-wide v10, v9

    goto :goto_3

    :cond_9
    const v12, 0x63363038

    if-ne v9, v12, :cond_a

    const/4 v9, 0x1

    iput v9, v4, Lk4/b$d;->d:I

    const-string v13, "application/x-mp4-cea-608"

    :goto_3
    const/4 v9, 0x0

    move-object v12, v13

    :goto_4
    new-instance v13, Lv3/i0$a;

    invoke-direct {v13}, Lv3/i0$a;-><init>()V

    invoke-virtual {v13, v6}, Lv3/i0$a;->b(I)V

    .line 12
    iput-object v12, v13, Lv3/i0$a;->k:Ljava/lang/String;

    .line 13
    iput-object v1, v13, Lv3/i0$a;->c:Ljava/lang/String;

    .line 14
    iput-wide v10, v13, Lv3/i0$a;->o:J

    .line 15
    iput-object v9, v13, Lv3/i0$a;->m:Ljava/util/List;

    .line 16
    new-instance v9, Lv3/i0;

    invoke-direct {v9, v13}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 17
    iput-object v9, v4, Lk4/b$d;->b:Lv3/i0;

    goto :goto_7

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_b
    :goto_5
    add-int/lit8 v11, v7, 0x8

    const/16 v12, 0x8

    add-int/2addr v11, v12

    .line 18
    invoke-virtual {v0, v11}, Lv5/u;->G(I)V

    const/4 v11, 0x6

    if-eqz p5, :cond_c

    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v12

    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    goto :goto_6

    :cond_c
    invoke-virtual {v0, v12}, Lv5/u;->H(I)V

    const/4 v12, 0x0

    :goto_6
    const/16 v13, 0x14

    if-eqz v12, :cond_f

    const/4 v14, 0x1

    if-ne v12, v14, :cond_d

    goto :goto_8

    :cond_d
    const/4 v11, 0x2

    if-ne v12, v11, :cond_e

    const/16 v11, 0x10

    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 19
    invoke-virtual/range {p0 .. p0}, Lv5/u;->o()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v11

    .line 20
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v11, v11

    invoke-virtual/range {p0 .. p0}, Lv5/u;->y()I

    move-result v12

    invoke-virtual {v0, v13}, Lv5/u;->H(I)V

    const/4 v13, 0x0

    goto :goto_9

    :cond_e
    :goto_7
    move/from16 v16, v3

    move/from16 v18, v5

    move/from16 v21, v7

    move/from16 v22, v8

    goto/16 :goto_26

    :cond_f
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v13

    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 21
    iget-object v11, v0, Lv5/u;->a:[B

    iget v14, v0, Lv5/u;->b:I

    add-int/lit8 v15, v14, 0x1

    aget-byte v14, v11, v14

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x8

    add-int/lit8 v16, v15, 0x1

    aget-byte v11, v11, v15

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v11, v14

    add-int/lit8 v14, v16, 0x2

    iput v14, v0, Lv5/u;->b:I

    add-int/lit8 v14, v14, -0x4

    .line 22
    invoke-virtual {v0, v14}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v14

    const/4 v15, 0x1

    if-ne v12, v15, :cond_10

    const/16 v12, 0x10

    invoke-virtual {v0, v12}, Lv5/u;->H(I)V

    :cond_10
    move v12, v13

    move v13, v14

    .line 23
    :goto_9
    iget v14, v0, Lv5/u;->b:I

    const v15, 0x656e6361

    if-ne v9, v15, :cond_13

    .line 24
    invoke-static {v7, v8, v0}, Lk4/b;->c(IILv5/u;)Landroid/util/Pair;

    move-result-object v15

    if-eqz v15, :cond_12

    iget-object v9, v15, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-nez v2, :cond_11

    const/16 v16, 0x0

    move-object/from16 v17, v16

    move/from16 v16, v3

    goto :goto_a

    :cond_11
    move/from16 v16, v3

    iget-object v3, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lk4/k;

    iget-object v3, v3, Lk4/k;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, La4/d;->a(Ljava/lang/String;)La4/d;

    move-result-object v3

    move-object/from16 v17, v3

    :goto_a
    iget-object v3, v4, Lk4/b$d;->a:[Lk4/k;

    iget-object v15, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lk4/k;

    aput-object v15, v3, v5

    move-object/from16 v3, v17

    goto :goto_b

    :cond_12
    move/from16 v16, v3

    move-object v3, v2

    :goto_b
    invoke-virtual {v0, v14}, Lv5/u;->G(I)V

    goto :goto_c

    :cond_13
    move/from16 v16, v3

    move-object v3, v2

    :goto_c
    const-string v15, "audio/ac4"

    const-string v17, "audio/eac3"

    move/from16 v18, v11

    const-string v11, "audio/ac3"

    const-string v19, "audio/raw"

    move/from16 v20, v12

    const v12, 0x61632d33

    if-ne v9, v12, :cond_14

    move-object/from16 v19, v11

    goto/16 :goto_11

    :cond_14
    const v12, 0x65632d33

    if-ne v9, v12, :cond_15

    move-object/from16 v19, v17

    goto/16 :goto_11

    :cond_15
    const v12, 0x61632d34

    if-ne v9, v12, :cond_16

    move-object/from16 v19, v15

    goto/16 :goto_11

    :cond_16
    const v12, 0x64747363

    if-ne v9, v12, :cond_17

    const-string v9, "audio/vnd.dts"

    :goto_d
    move-object/from16 v19, v9

    goto/16 :goto_11

    :cond_17
    const v12, 0x64747368

    if-eq v9, v12, :cond_2a

    const v12, 0x6474736c

    if-ne v9, v12, :cond_18

    goto/16 :goto_10

    :cond_18
    const v12, 0x64747365

    if-ne v9, v12, :cond_19

    const-string v9, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_d

    :cond_19
    const v12, 0x64747378

    if-ne v9, v12, :cond_1a

    const-string v9, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_d

    :cond_1a
    const v12, 0x73616d72

    if-ne v9, v12, :cond_1b

    const-string v9, "audio/3gpp"

    goto :goto_d

    :cond_1b
    const v12, 0x73617762

    if-ne v9, v12, :cond_1c

    const-string v9, "audio/amr-wb"

    goto :goto_d

    :cond_1c
    const v12, 0x6c70636d

    if-eq v9, v12, :cond_29

    const v12, 0x736f7774

    if-ne v9, v12, :cond_1d

    goto/16 :goto_f

    :cond_1d
    const v12, 0x74776f73

    if-ne v9, v12, :cond_1e

    const/high16 v9, 0x10000000

    goto :goto_12

    :cond_1e
    const v12, 0x2e6d7032

    if-eq v9, v12, :cond_28

    const v12, 0x2e6d7033

    if-ne v9, v12, :cond_1f

    goto :goto_e

    :cond_1f
    const v12, 0x6d686131

    if-ne v9, v12, :cond_20

    const-string v9, "audio/mha1"

    goto :goto_d

    :cond_20
    const v12, 0x6d686d31

    if-ne v9, v12, :cond_21

    const-string v9, "audio/mhm1"

    goto :goto_d

    :cond_21
    const v12, 0x616c6163

    if-ne v9, v12, :cond_22

    const-string v9, "audio/alac"

    goto :goto_d

    :cond_22
    const v12, 0x616c6177

    if-ne v9, v12, :cond_23

    const-string v9, "audio/g711-alaw"

    goto :goto_d

    :cond_23
    const v12, 0x756c6177

    if-ne v9, v12, :cond_24

    const-string v9, "audio/g711-mlaw"

    goto :goto_d

    :cond_24
    const v12, 0x4f707573

    if-ne v9, v12, :cond_25

    const-string v9, "audio/opus"

    goto :goto_d

    :cond_25
    const v12, 0x664c6143

    if-ne v9, v12, :cond_26

    const-string v9, "audio/flac"

    goto/16 :goto_d

    :cond_26
    const v12, 0x6d6c7061

    if-ne v9, v12, :cond_27

    const-string v9, "audio/true-hd"

    goto/16 :goto_d

    :cond_27
    const/4 v9, -0x1

    const/16 v19, 0x0

    goto :goto_12

    :cond_28
    :goto_e
    const-string v9, "audio/mpeg"

    goto/16 :goto_d

    :cond_29
    :goto_f
    const/4 v9, 0x2

    goto :goto_12

    :cond_2a
    :goto_10
    const-string v9, "audio/vnd.dts.hd"

    goto/16 :goto_d

    :goto_11
    const/4 v9, -0x1

    :goto_12
    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move v2, v14

    move/from16 v14, v20

    move-object/from16 v23, v21

    move-object/from16 v24, v22

    move-object/from16 v20, v12

    move/from16 v12, v18

    move/from16 v18, v5

    move-object/from16 v40, v19

    move/from16 v19, v9

    move-object/from16 v9, v40

    :goto_13
    sub-int v5, v2, v7

    if-ge v5, v8, :cond_47

    invoke-virtual {v0, v2}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v5

    if-lez v5, :cond_2b

    const/16 v21, 0x1

    goto :goto_14

    :cond_2b
    const/16 v21, 0x0

    :goto_14
    move/from16 v22, v8

    move/from16 v8, v21

    invoke-static {v10, v8}, Lx6/b;->u(Ljava/lang/String;Z)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v8

    move/from16 v21, v7

    const v7, 0x6d686143

    if-ne v8, v7, :cond_2c

    add-int/lit8 v7, v5, -0xd

    new-array v8, v7, [B

    move-object/from16 v25, v10

    add-int/lit8 v10, v2, 0xd

    invoke-virtual {v0, v10}, Lv5/u;->G(I)V

    const/4 v10, 0x0

    invoke-virtual {v0, v8, v10, v7}, Lv5/u;->d([BII)V

    invoke-static {v8}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v23

    move-object/from16 v28, v11

    goto/16 :goto_1d

    :cond_2c
    move-object/from16 v25, v10

    const v7, 0x65736473

    if-eq v8, v7, :cond_3e

    if-eqz p5, :cond_2d

    const v7, 0x77617665

    if-ne v8, v7, :cond_2d

    const v7, 0x65736473

    goto/16 :goto_1e

    :cond_2d
    const v7, 0x64616333

    if-ne v8, v7, :cond_2f

    add-int/lit8 v7, v2, 0x8

    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    .line 25
    new-instance v8, Lv5/t;

    invoke-direct {v8}, Lv5/t;-><init>()V

    .line 26
    iget-object v10, v0, Lv5/u;->a:[B

    move/from16 v26, v12

    .line 27
    iget v12, v0, Lv5/u;->c:I

    .line 28
    invoke-virtual {v8, v10, v12}, Lv5/t;->j([BI)V

    .line 29
    iget v10, v0, Lv5/u;->b:I

    const/16 v12, 0x8

    mul-int/2addr v10, v12

    .line 30
    invoke-virtual {v8, v10}, Lv5/t;->k(I)V

    const/4 v10, 0x2

    .line 31
    invoke-virtual {v8, v10}, Lv5/t;->g(I)I

    move-result v10

    sget-object v27, Lx3/b;->b:[I

    aget v10, v27, v10

    invoke-virtual {v8, v12}, Lv5/t;->m(I)V

    sget-object v12, Lx3/b;->d:[I

    move/from16 v27, v14

    const/4 v14, 0x3

    invoke-virtual {v8, v14}, Lv5/t;->g(I)I

    move-result v14

    aget v12, v12, v14

    const/4 v14, 0x1

    invoke-virtual {v8, v14}, Lv5/t;->g(I)I

    move-result v14

    if-eqz v14, :cond_2e

    add-int/lit8 v12, v12, 0x1

    :cond_2e
    const/4 v14, 0x5

    invoke-virtual {v8, v14}, Lv5/t;->g(I)I

    move-result v14

    sget-object v28, Lx3/b;->e:[I

    aget v14, v28, v14

    mul-int/lit16 v14, v14, 0x3e8

    invoke-virtual {v8}, Lv5/t;->c()V

    invoke-virtual {v8}, Lv5/t;->d()I

    move-result v8

    invoke-virtual {v0, v8}, Lv5/u;->G(I)V

    new-instance v8, Lv3/i0$a;

    invoke-direct {v8}, Lv3/i0$a;-><init>()V

    .line 32
    iput-object v7, v8, Lv3/i0$a;->a:Ljava/lang/String;

    .line 33
    iput-object v11, v8, Lv3/i0$a;->k:Ljava/lang/String;

    .line 34
    iput v12, v8, Lv3/i0$a;->x:I

    .line 35
    iput v10, v8, Lv3/i0$a;->y:I

    .line 36
    iput-object v3, v8, Lv3/i0$a;->n:La4/d;

    .line 37
    iput-object v1, v8, Lv3/i0$a;->c:Ljava/lang/String;

    .line 38
    iput v14, v8, Lv3/i0$a;->f:I

    .line 39
    iput v14, v8, Lv3/i0$a;->g:I

    .line 40
    new-instance v7, Lv3/i0;

    invoke-direct {v7, v8}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 41
    iput-object v7, v4, Lk4/b$d;->b:Lv3/i0;

    move-object/from16 v29, v9

    move-object/from16 v28, v11

    goto/16 :goto_18

    :cond_2f
    move/from16 v26, v12

    move/from16 v27, v14

    const v7, 0x64656333

    if-ne v8, v7, :cond_34

    add-int/lit8 v7, v2, 0x8

    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    .line 42
    new-instance v8, Lv5/t;

    invoke-direct {v8}, Lv5/t;-><init>()V

    .line 43
    iget-object v10, v0, Lv5/u;->a:[B

    .line 44
    iget v12, v0, Lv5/u;->c:I

    .line 45
    invoke-virtual {v8, v10, v12}, Lv5/t;->j([BI)V

    .line 46
    iget v10, v0, Lv5/u;->b:I

    mul-int/lit8 v10, v10, 0x8

    .line 47
    invoke-virtual {v8, v10}, Lv5/t;->k(I)V

    const/16 v10, 0xd

    .line 48
    invoke-virtual {v8, v10}, Lv5/t;->g(I)I

    move-result v10

    mul-int/lit16 v10, v10, 0x3e8

    const/4 v12, 0x3

    invoke-virtual {v8, v12}, Lv5/t;->m(I)V

    const/4 v12, 0x2

    invoke-virtual {v8, v12}, Lv5/t;->g(I)I

    move-result v12

    sget-object v14, Lx3/b;->b:[I

    aget v12, v14, v12

    const/16 v14, 0xa

    invoke-virtual {v8, v14}, Lv5/t;->m(I)V

    sget-object v14, Lx3/b;->d:[I

    move-object/from16 v28, v11

    const/4 v11, 0x3

    invoke-virtual {v8, v11}, Lv5/t;->g(I)I

    move-result v11

    aget v11, v14, v11

    const/4 v14, 0x1

    invoke-virtual {v8, v14}, Lv5/t;->g(I)I

    move-result v14

    if-eqz v14, :cond_30

    add-int/lit8 v11, v11, 0x1

    :cond_30
    const/4 v14, 0x3

    invoke-virtual {v8, v14}, Lv5/t;->m(I)V

    const/4 v14, 0x4

    invoke-virtual {v8, v14}, Lv5/t;->g(I)I

    move-result v14

    move-object/from16 v29, v9

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Lv5/t;->m(I)V

    if-lez v14, :cond_32

    const/4 v14, 0x6

    invoke-virtual {v8, v14}, Lv5/t;->n(I)V

    invoke-virtual {v8, v9}, Lv5/t;->g(I)I

    move-result v14

    if-eqz v14, :cond_31

    add-int/lit8 v11, v11, 0x2

    :cond_31
    invoke-virtual {v8, v9}, Lv5/t;->m(I)V

    :cond_32
    invoke-virtual {v8}, Lv5/t;->b()I

    move-result v9

    const/4 v14, 0x7

    if-le v9, v14, :cond_33

    invoke-virtual {v8, v14}, Lv5/t;->m(I)V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Lv5/t;->g(I)I

    move-result v9

    if-eqz v9, :cond_33

    const-string v9, "audio/eac3-joc"

    goto :goto_15

    :cond_33
    move-object/from16 v9, v17

    :goto_15
    invoke-virtual {v8}, Lv5/t;->c()V

    invoke-virtual {v8}, Lv5/t;->d()I

    move-result v8

    invoke-virtual {v0, v8}, Lv5/u;->G(I)V

    new-instance v8, Lv3/i0$a;

    invoke-direct {v8}, Lv3/i0$a;-><init>()V

    .line 49
    iput-object v7, v8, Lv3/i0$a;->a:Ljava/lang/String;

    .line 50
    iput-object v9, v8, Lv3/i0$a;->k:Ljava/lang/String;

    .line 51
    iput v11, v8, Lv3/i0$a;->x:I

    .line 52
    iput v12, v8, Lv3/i0$a;->y:I

    .line 53
    iput-object v3, v8, Lv3/i0$a;->n:La4/d;

    .line 54
    iput-object v1, v8, Lv3/i0$a;->c:Ljava/lang/String;

    .line 55
    iput v10, v8, Lv3/i0$a;->g:I

    .line 56
    new-instance v7, Lv3/i0;

    invoke-direct {v7, v8}, Lv3/i0;-><init>(Lv3/i0$a;)V

    goto :goto_17

    :cond_34
    move-object/from16 v29, v9

    move-object/from16 v28, v11

    const v7, 0x64616334

    if-ne v8, v7, :cond_37

    add-int/lit8 v7, v2, 0x8

    .line 57
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    .line 58
    invoke-virtual {v0, v8}, Lv5/u;->H(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v9

    and-int/lit8 v9, v9, 0x20

    shr-int/lit8 v9, v9, 0x5

    if-ne v9, v8, :cond_35

    const v8, 0xbb80

    goto :goto_16

    :cond_35
    const v8, 0xac44

    :goto_16
    new-instance v9, Lv3/i0$a;

    invoke-direct {v9}, Lv3/i0$a;-><init>()V

    .line 59
    iput-object v7, v9, Lv3/i0$a;->a:Ljava/lang/String;

    .line 60
    iput-object v15, v9, Lv3/i0$a;->k:Ljava/lang/String;

    const/4 v7, 0x2

    .line 61
    iput v7, v9, Lv3/i0$a;->x:I

    .line 62
    iput v8, v9, Lv3/i0$a;->y:I

    .line 63
    iput-object v3, v9, Lv3/i0$a;->n:La4/d;

    .line 64
    iput-object v1, v9, Lv3/i0$a;->c:Ljava/lang/String;

    .line 65
    new-instance v7, Lv3/i0;

    invoke-direct {v7, v9}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 66
    :goto_17
    iput-object v7, v4, Lk4/b$d;->b:Lv3/i0;

    :cond_36
    :goto_18
    move/from16 v11, v26

    move/from16 v10, v27

    move-object/from16 v9, v29

    goto/16 :goto_1c

    :cond_37
    const v7, 0x646d6c70

    if-ne v8, v7, :cond_39

    if-lez v13, :cond_38

    const/4 v7, 0x2

    move v10, v7

    move v12, v13

    move-object/from16 v14, v25

    move-object/from16 v9, v29

    move/from16 v25, v12

    goto/16 :goto_25

    :cond_38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_39
    const v7, 0x64647473

    if-eq v8, v7, :cond_3d

    const v7, 0x75647473

    if-ne v8, v7, :cond_3a

    goto/16 :goto_1b

    :cond_3a
    const v7, 0x644f7073

    if-ne v8, v7, :cond_3b

    add-int/lit8 v7, v5, -0x8

    sget-object v8, Lk4/b;->a:[B

    array-length v9, v8

    add-int/2addr v9, v7

    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    add-int/lit8 v10, v2, 0x8

    invoke-virtual {v0, v10}, Lv5/u;->G(I)V

    array-length v8, v8

    invoke-virtual {v0, v9, v8, v7}, Lv5/u;->d([BII)V

    invoke-static {v9}, Lb/a0;->n([B)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_19

    :cond_3b
    const v7, 0x64664c61

    if-ne v8, v7, :cond_3c

    add-int/lit8 v7, v5, -0xc

    add-int/lit8 v8, v7, 0x4

    new-array v8, v8, [B

    const/16 v9, 0x66

    const/4 v10, 0x0

    aput-byte v9, v8, v10

    const/16 v9, 0x4c

    const/4 v10, 0x1

    aput-byte v9, v8, v10

    const/16 v9, 0x61

    const/4 v10, 0x2

    aput-byte v9, v8, v10

    const/16 v9, 0x43

    const/4 v10, 0x3

    aput-byte v9, v8, v10

    add-int/lit8 v9, v2, 0xc

    invoke-virtual {v0, v9}, Lv5/u;->G(I)V

    const/4 v9, 0x4

    invoke-virtual {v0, v8, v9, v7}, Lv5/u;->d([BII)V

    invoke-static {v8}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v7

    :goto_19
    move-object/from16 v23, v7

    move/from16 v12, v26

    move/from16 v14, v27

    goto :goto_1a

    :cond_3c
    const v7, 0x616c6163

    if-ne v8, v7, :cond_36

    add-int/lit8 v7, v5, -0xc

    new-array v8, v7, [B

    add-int/lit8 v9, v2, 0xc

    invoke-virtual {v0, v9}, Lv5/u;->G(I)V

    const/4 v9, 0x0

    invoke-virtual {v0, v8, v9, v7}, Lv5/u;->d([BII)V

    .line 67
    new-instance v7, Lv5/u;

    invoke-direct {v7, v8}, Lv5/u;-><init>([B)V

    const/16 v9, 0x9

    invoke-virtual {v7, v9}, Lv5/u;->G(I)V

    invoke-virtual {v7}, Lv5/u;->v()I

    move-result v9

    const/16 v10, 0x14

    invoke-virtual {v7, v10}, Lv5/u;->G(I)V

    invoke-virtual {v7}, Lv5/u;->y()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v7

    .line 68
    iget-object v9, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static {v8}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v7

    move-object/from16 v23, v7

    :goto_1a
    move-object/from16 v9, v29

    goto :goto_1d

    :cond_3d
    :goto_1b
    new-instance v7, Lv3/i0$a;

    invoke-direct {v7}, Lv3/i0$a;-><init>()V

    invoke-virtual {v7, v6}, Lv3/i0$a;->b(I)V

    move-object/from16 v9, v29

    .line 69
    iput-object v9, v7, Lv3/i0$a;->k:Ljava/lang/String;

    move/from16 v10, v27

    .line 70
    iput v10, v7, Lv3/i0$a;->x:I

    move/from16 v11, v26

    .line 71
    iput v11, v7, Lv3/i0$a;->y:I

    .line 72
    iput-object v3, v7, Lv3/i0$a;->n:La4/d;

    .line 73
    iput-object v1, v7, Lv3/i0$a;->c:Ljava/lang/String;

    .line 74
    new-instance v8, Lv3/i0;

    invoke-direct {v8, v7}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 75
    iput-object v8, v4, Lk4/b$d;->b:Lv3/i0;

    :goto_1c
    move v14, v10

    move v12, v11

    :goto_1d
    move v10, v14

    move-object/from16 v14, v25

    move/from16 v25, v13

    goto/16 :goto_25

    :cond_3e
    :goto_1e
    move-object/from16 v28, v11

    move v11, v12

    move v10, v14

    if-ne v8, v7, :cond_3f

    move v7, v2

    move-object/from16 v14, v25

    move/from16 v25, v13

    goto :goto_22

    .line 76
    :cond_3f
    iget v7, v0, Lv5/u;->b:I

    if-lt v7, v2, :cond_40

    const/4 v8, 0x1

    goto :goto_1f

    :cond_40
    const/4 v8, 0x0

    :goto_1f
    const/4 v12, 0x0

    .line 77
    invoke-static {v12, v8}, Lx6/b;->u(Ljava/lang/String;Z)V

    :goto_20
    sub-int v8, v7, v2

    if-ge v8, v5, :cond_43

    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v8

    if-lez v8, :cond_41

    const/4 v12, 0x1

    goto :goto_21

    :cond_41
    const/4 v12, 0x0

    :goto_21
    move-object/from16 v14, v25

    invoke-static {v14, v12}, Lx6/b;->u(Ljava/lang/String;Z)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v12

    move/from16 v25, v13

    const v13, 0x65736473

    if-ne v12, v13, :cond_42

    goto :goto_22

    :cond_42
    add-int/2addr v7, v8

    move/from16 v13, v25

    move-object/from16 v25, v14

    goto :goto_20

    :cond_43
    move-object/from16 v14, v25

    move/from16 v25, v13

    const/4 v7, -0x1

    :goto_22
    const/4 v8, -0x1

    if-eq v7, v8, :cond_46

    .line 78
    invoke-static {v7, v0}, Lk4/b;->a(ILv5/u;)Lk4/b$b;

    move-result-object v7

    .line 79
    iget-object v8, v7, Lk4/b$b;->a:Ljava/lang/String;

    .line 80
    iget-object v9, v7, Lk4/b$b;->b:[B

    if-eqz v9, :cond_45

    const-string v12, "audio/mp4a-latm"

    .line 81
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_44

    .line 82
    new-instance v10, Lv5/t;

    .line 83
    array-length v11, v9

    invoke-direct {v10, v9, v11}, Lv5/t;-><init>([BI)V

    const/4 v11, 0x0

    .line 84
    invoke-static {v10, v11}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    move-result-object v10

    .line 85
    iget v12, v10, Lx3/a$a;->a:I

    iget v11, v10, Lx3/a$a;->b:I

    iget-object v10, v10, Lx3/a$a;->c:Ljava/lang/String;

    goto :goto_23

    :cond_44
    move v12, v11

    move v11, v10

    move-object/from16 v10, v20

    :goto_23
    invoke-static {v9}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v23

    goto :goto_24

    :cond_45
    move v12, v11

    move v11, v10

    move-object/from16 v10, v20

    :goto_24
    move-object/from16 v24, v7

    move-object v9, v8

    move-object/from16 v20, v10

    move v10, v11

    goto :goto_25

    :cond_46
    move v12, v11

    :goto_25
    add-int/2addr v2, v5

    move/from16 v7, v21

    move/from16 v8, v22

    move/from16 v13, v25

    move-object/from16 v11, v28

    move-object/from16 v40, v14

    move v14, v10

    move-object/from16 v10, v40

    goto/16 :goto_13

    :cond_47
    move/from16 v21, v7

    move/from16 v22, v8

    move v11, v12

    move v10, v14

    iget-object v2, v4, Lk4/b$d;->b:Lv3/i0;

    if-nez v2, :cond_49

    if-eqz v9, :cond_49

    new-instance v2, Lv3/i0$a;

    invoke-direct {v2}, Lv3/i0$a;-><init>()V

    invoke-virtual {v2, v6}, Lv3/i0$a;->b(I)V

    .line 86
    iput-object v9, v2, Lv3/i0$a;->k:Ljava/lang/String;

    move-object/from16 v12, v20

    .line 87
    iput-object v12, v2, Lv3/i0$a;->h:Ljava/lang/String;

    .line 88
    iput v10, v2, Lv3/i0$a;->x:I

    .line 89
    iput v11, v2, Lv3/i0$a;->y:I

    move/from16 v9, v19

    .line 90
    iput v9, v2, Lv3/i0$a;->z:I

    move-object/from16 v5, v23

    .line 91
    iput-object v5, v2, Lv3/i0$a;->m:Ljava/util/List;

    .line 92
    iput-object v3, v2, Lv3/i0$a;->n:La4/d;

    .line 93
    iput-object v1, v2, Lv3/i0$a;->c:Ljava/lang/String;

    move-object/from16 v3, v24

    if-eqz v3, :cond_48

    .line 94
    iget-wide v7, v3, Lk4/b$b;->c:J

    .line 95
    invoke-static {v7, v8}, Lr7/a;->E(J)I

    move-result v5

    .line 96
    iput v5, v2, Lv3/i0$a;->f:I

    .line 97
    iget-wide v7, v3, Lk4/b$b;->d:J

    .line 98
    invoke-static {v7, v8}, Lr7/a;->E(J)I

    move-result v3

    .line 99
    iput v3, v2, Lv3/i0$a;->g:I

    .line 100
    :cond_48
    new-instance v3, Lv3/i0;

    invoke-direct {v3, v2}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 101
    iput-object v3, v4, Lk4/b$d;->b:Lv3/i0;

    :cond_49
    :goto_26
    move-object v2, v4

    move v1, v6

    move/from16 v30, v21

    move/from16 v31, v22

    move/from16 v6, p1

    move/from16 v4, p2

    goto/16 :goto_4d

    :cond_4a
    :goto_27
    move/from16 v16, v3

    move/from16 v18, v5

    move/from16 v21, v7

    move/from16 v22, v8

    move-object v2, v10

    add-int/lit8 v7, v21, 0x8

    add-int/lit8 v7, v7, 0x8

    .line 102
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Lv5/u;->H(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v5

    const/16 v6, 0x32

    invoke-virtual {v0, v6}, Lv5/u;->H(I)V

    .line 103
    iget v6, v0, Lv5/u;->b:I

    if-ne v9, v13, :cond_4d

    move/from16 v7, v21

    move/from16 v8, v22

    .line 104
    invoke-static {v7, v8, v0}, Lk4/b;->c(IILv5/u;)Landroid/util/Pair;

    move-result-object v10

    if-eqz v10, :cond_4c

    iget-object v9, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move-object/from16 v11, p4

    if-nez v11, :cond_4b

    const/4 v13, 0x0

    goto :goto_28

    :cond_4b
    iget-object v13, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lk4/k;

    iget-object v13, v13, Lk4/k;->b:Ljava/lang/String;

    invoke-virtual {v11, v13}, La4/d;->a(Ljava/lang/String;)La4/d;

    move-result-object v13

    :goto_28
    iget-object v15, v4, Lk4/b$d;->a:[Lk4/k;

    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Lk4/k;

    aput-object v10, v15, v18

    goto :goto_29

    :cond_4c
    move-object/from16 v11, p4

    move-object v13, v11

    :goto_29
    invoke-virtual {v0, v6}, Lv5/u;->G(I)V

    goto :goto_2a

    :cond_4d
    move-object/from16 v11, p4

    move/from16 v7, v21

    move/from16 v8, v22

    move-object v13, v11

    :goto_2a
    const-string v10, "video/3gpp"

    if-ne v9, v12, :cond_4e

    const-string v12, "video/mpeg"

    goto :goto_2b

    :cond_4e
    if-ne v9, v14, :cond_4f

    move-object v12, v10

    goto :goto_2b

    :cond_4f
    const/4 v12, 0x0

    :goto_2b
    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, -0x1

    const/16 v17, -0x1

    const/16 v19, 0x0

    const/16 v20, -0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, -0x1

    const/16 v26, 0x0

    move/from16 v1, v17

    move-object/from16 v11, v26

    move-object/from16 v17, v10

    move/from16 v10, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v13

    move/from16 v40, v25

    move-object/from16 v25, v23

    move/from16 v23, v40

    :goto_2c
    sub-int v13, v6, v7

    if-ge v13, v8, :cond_79

    invoke-virtual {v0, v6}, Lv5/u;->G(I)V

    .line 105
    iget v13, v0, Lv5/u;->b:I

    move/from16 v26, v14

    .line 106
    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v14

    move/from16 v27, v5

    if-nez v14, :cond_50

    .line 107
    iget v5, v0, Lv5/u;->b:I

    sub-int/2addr v5, v7

    if-ne v5, v8, :cond_50

    move/from16 v33, v3

    move-object/from16 v32, v4

    move/from16 v30, v7

    move/from16 v31, v8

    move-object/from16 v34, v11

    goto/16 :goto_4b

    :cond_50
    if-lez v14, :cond_51

    const/4 v5, 0x1

    goto :goto_2d

    :cond_51
    const/4 v5, 0x0

    .line 108
    :goto_2d
    invoke-static {v2, v5}, Lx6/b;->u(Ljava/lang/String;Z)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v5

    move-object/from16 v28, v2

    const v2, 0x61766343

    if-ne v5, v2, :cond_54

    if-nez v12, :cond_52

    const/4 v2, 0x1

    goto :goto_2e

    :cond_52
    const/4 v2, 0x0

    :goto_2e
    const/4 v5, 0x0

    invoke-static {v5, v2}, Lx6/b;->u(Ljava/lang/String;Z)V

    add-int/lit8 v13, v13, 0x8

    invoke-virtual {v0, v13}, Lv5/u;->G(I)V

    invoke-static/range {p0 .. p0}, Lw5/a;->a(Lv5/u;)Lw5/a;

    move-result-object v2

    iget-object v5, v2, Lw5/a;->a:Ljava/util/List;

    iget v11, v2, Lw5/a;->b:I

    iput v11, v4, Lk4/b$d;->c:I

    if-nez v24, :cond_53

    iget v11, v2, Lw5/a;->e:F

    move/from16 v26, v11

    :cond_53
    iget-object v2, v2, Lw5/a;->f:Ljava/lang/String;

    const-string v11, "video/avc"

    move-object v12, v11

    move-object v11, v5

    goto/16 :goto_37

    :cond_54
    const v2, 0x68766343

    if-ne v5, v2, :cond_57

    if-nez v12, :cond_55

    const/4 v1, 0x1

    goto :goto_2f

    :cond_55
    const/4 v1, 0x0

    :goto_2f
    const/4 v2, 0x0

    invoke-static {v2, v1}, Lx6/b;->u(Ljava/lang/String;Z)V

    add-int/lit8 v13, v13, 0x8

    invoke-virtual {v0, v13}, Lv5/u;->G(I)V

    invoke-static/range {p0 .. p0}, Lw5/e;->a(Lv5/u;)Lw5/e;

    move-result-object v1

    iget-object v11, v1, Lw5/e;->a:Ljava/util/List;

    iget v2, v1, Lw5/e;->b:I

    iput v2, v4, Lk4/b$d;->c:I

    if-nez v24, :cond_56

    iget v2, v1, Lw5/e;->c:F

    move/from16 v26, v2

    :cond_56
    iget-object v2, v1, Lw5/e;->g:Ljava/lang/String;

    iget v5, v1, Lw5/e;->d:I

    iget v15, v1, Lw5/e;->e:I

    iget v10, v1, Lw5/e;->f:I

    const-string v12, "video/hevc"

    move/from16 v33, v3

    move-object/from16 v32, v4

    move v1, v5

    :goto_30
    move/from16 v39, v6

    move/from16 v30, v7

    move/from16 v31, v8

    move/from16 v29, v9

    move-object/from16 v22, v11

    move-object v11, v2

    goto/16 :goto_4a

    :cond_57
    const v2, 0x64766343

    if-eq v5, v2, :cond_78

    const v2, 0x64767643

    if-ne v5, v2, :cond_58

    goto/16 :goto_45

    :cond_58
    const v2, 0x76706343

    if-ne v5, v2, :cond_5d

    if-nez v12, :cond_59

    const/4 v1, 0x1

    goto :goto_31

    :cond_59
    const/4 v1, 0x0

    :goto_31
    const/4 v2, 0x0

    invoke-static {v2, v1}, Lx6/b;->u(Ljava/lang/String;Z)V

    const v1, 0x76703038

    if-ne v9, v1, :cond_5a

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_32

    :cond_5a
    const-string v1, "video/x-vnd.on2.vp9"

    :goto_32
    add-int/lit8 v13, v13, 0xc

    invoke-virtual {v0, v13}, Lv5/u;->G(I)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lv5/u;->H(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_5b

    const/4 v2, 0x1

    goto :goto_33

    :cond_5b
    const/4 v2, 0x0

    :goto_33
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v10

    invoke-static {v5}, Lw5/b;->a(I)I

    move-result v5

    if-eqz v2, :cond_5c

    const/4 v2, 0x1

    goto :goto_34

    :cond_5c
    const/4 v2, 0x2

    :goto_34
    invoke-static {v10}, Lw5/b;->b(I)I

    move-result v10

    move-object v12, v1

    move v15, v2

    move v1, v5

    goto :goto_36

    :cond_5d
    const v2, 0x61763143

    if-ne v5, v2, :cond_5f

    if-nez v12, :cond_5e

    const/4 v2, 0x1

    goto :goto_35

    :cond_5e
    const/4 v2, 0x0

    :goto_35
    const/4 v5, 0x0

    invoke-static {v5, v2}, Lx6/b;->u(Ljava/lang/String;Z)V

    const-string v12, "video/av01"

    goto :goto_36

    :cond_5f
    const v2, 0x636c6c69

    const/16 v29, 0x19

    if-ne v5, v2, :cond_61

    if-nez v19, :cond_60

    .line 109
    invoke-static/range {v29 .. v29}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v19

    :cond_60
    move-object/from16 v2, v19

    const/16 v5, 0x15

    .line 110
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v19, v2

    :goto_36
    move-object v2, v11

    move-object/from16 v11, v22

    :goto_37
    move/from16 v33, v3

    move-object/from16 v32, v4

    goto/16 :goto_30

    :cond_61
    const v2, 0x6d646376

    if-ne v5, v2, :cond_63

    if-nez v19, :cond_62

    .line 111
    invoke-static/range {v29 .. v29}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v19

    :cond_62
    move-object/from16 v2, v19

    .line 112
    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v13

    move/from16 v29, v9

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v9

    move/from16 v30, v7

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v7

    move/from16 v31, v8

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v8

    move-object/from16 v32, v4

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v4

    move/from16 v33, v3

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v3

    move-object/from16 v34, v11

    invoke-virtual/range {p0 .. p0}, Lv5/u;->r()S

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lv5/u;->w()J

    move-result-wide v35

    invoke-virtual/range {p0 .. p0}, Lv5/u;->w()J

    move-result-wide v37

    move/from16 v39, v6

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v3, 0x2710

    div-long v5, v35, v3

    long-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    div-long v3, v37, v3

    long-to-int v3, v3

    int-to-short v3, v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v19, v2

    goto/16 :goto_49

    :cond_63
    move/from16 v33, v3

    move-object/from16 v32, v4

    move/from16 v39, v6

    move/from16 v30, v7

    move/from16 v31, v8

    move/from16 v29, v9

    move-object/from16 v34, v11

    const v2, 0x64323633

    if-ne v5, v2, :cond_65

    const/4 v2, 0x0

    if-nez v12, :cond_64

    const/4 v3, 0x1

    goto :goto_38

    :cond_64
    const/4 v3, 0x0

    :goto_38
    invoke-static {v2, v3}, Lx6/b;->u(Ljava/lang/String;Z)V

    move-object/from16 v12, v17

    move-object/from16 v13, v25

    goto :goto_3c

    :cond_65
    const/4 v2, 0x0

    const v3, 0x65736473

    if-ne v5, v3, :cond_68

    if-nez v12, :cond_66

    const/4 v3, 0x1

    goto :goto_39

    :cond_66
    const/4 v3, 0x0

    :goto_39
    invoke-static {v2, v3}, Lx6/b;->u(Ljava/lang/String;Z)V

    invoke-static {v13, v0}, Lk4/b;->a(ILv5/u;)Lk4/b$b;

    move-result-object v11

    .line 113
    iget-object v2, v11, Lk4/b$b;->a:Ljava/lang/String;

    .line 114
    iget-object v3, v11, Lk4/b$b;->b:[B

    if-eqz v3, :cond_67

    .line 115
    invoke-static {v3}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    move-result-object v3

    goto :goto_3a

    :cond_67
    move-object/from16 v3, v22

    :goto_3a
    move-object/from16 v13, v25

    goto/16 :goto_48

    :cond_68
    const v3, 0x70617370

    if-ne v5, v3, :cond_69

    add-int/lit8 v13, v13, 0x8

    .line 116
    invoke-virtual {v0, v13}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->y()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lv5/u;->y()I

    move-result v3

    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/4 v3, 0x1

    move/from16 v26, v2

    move/from16 v24, v3

    goto/16 :goto_49

    :cond_69
    const v3, 0x73763364

    if-ne v5, v3, :cond_6c

    add-int/lit8 v3, v13, 0x8

    :goto_3b
    sub-int v4, v3, v13

    if-ge v4, v14, :cond_6b

    .line 117
    invoke-virtual {v0, v3}, Lv5/u;->G(I)V

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v5

    const v6, 0x70726f6a

    if-ne v5, v6, :cond_6a

    .line 118
    iget-object v2, v0, Lv5/u;->a:[B

    add-int/2addr v4, v3

    .line 119
    invoke-static {v2, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v13

    goto :goto_3c

    :cond_6a
    add-int/2addr v3, v4

    goto :goto_3b

    :cond_6b
    move-object v13, v2

    :goto_3c
    move/from16 v2, v23

    :goto_3d
    move-object/from16 v11, v34

    goto/16 :goto_47

    :cond_6c
    const v2, 0x73743364

    if-ne v5, v2, :cond_72

    .line 120
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v2

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Lv5/u;->H(I)V

    if-nez v2, :cond_71

    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_70

    if-eq v2, v4, :cond_6f

    const/4 v4, 0x2

    if-eq v2, v4, :cond_6e

    if-eq v2, v3, :cond_6d

    goto :goto_3e

    :cond_6d
    move v11, v3

    goto :goto_3f

    :cond_6e
    const/4 v2, 0x2

    goto :goto_40

    :cond_6f
    move v11, v4

    goto :goto_3f

    :cond_70
    const/4 v2, 0x0

    goto :goto_40

    :cond_71
    :goto_3e
    move/from16 v11, v23

    :goto_3f
    move v2, v11

    :goto_40
    move-object/from16 v13, v25

    goto :goto_3d

    :cond_72
    const/4 v2, 0x1

    const v3, 0x636f6c72

    if-ne v5, v3, :cond_77

    const/4 v3, -0x1

    if-ne v1, v3, :cond_77

    if-ne v15, v3, :cond_77

    if-ne v10, v3, :cond_77

    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    move-result v3

    const v4, 0x6e636c78

    if-eq v3, v4, :cond_74

    const v4, 0x6e636c63

    if-ne v3, v4, :cond_73

    goto :goto_41

    :cond_73
    const-string v2, "Unsupported color type: "

    .line 121
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 122
    invoke-static {v3}, Lk4/a;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AtomParsers"

    invoke-static {v3, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_44

    :cond_74
    :goto_41
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    move-result v3

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Lv5/u;->H(I)V

    const/16 v5, 0x13

    if-ne v14, v5, :cond_75

    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    move-result v5

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_75

    move v5, v2

    goto :goto_42

    :cond_75
    const/4 v5, 0x0

    :goto_42
    invoke-static {v1}, Lw5/b;->a(I)I

    move-result v1

    if-eqz v5, :cond_76

    move v15, v2

    goto :goto_43

    :cond_76
    move v15, v4

    :goto_43
    invoke-static {v3}, Lw5/b;->b(I)I

    move-result v10

    :cond_77
    :goto_44
    move-object/from16 v11, v34

    goto :goto_46

    :cond_78
    :goto_45
    move/from16 v33, v3

    move-object/from16 v32, v4

    move/from16 v39, v6

    move/from16 v30, v7

    move/from16 v31, v8

    move/from16 v29, v9

    move-object/from16 v34, v11

    invoke-static/range {p0 .. p0}, Lw5/c;->a(Lv5/u;)Lw5/c;

    move-result-object v2

    if-eqz v2, :cond_77

    iget-object v11, v2, Lw5/c;->a:Ljava/lang/String;

    const-string v12, "video/dolby-vision"

    :goto_46
    move/from16 v2, v23

    move-object/from16 v13, v25

    :goto_47
    move/from16 v23, v2

    move-object/from16 v34, v11

    move-object v2, v12

    move-object/from16 v11, v20

    move-object/from16 v3, v22

    :goto_48
    move-object v12, v2

    move-object/from16 v22, v3

    move-object/from16 v20, v11

    move-object/from16 v25, v13

    :goto_49
    move-object/from16 v11, v34

    :goto_4a
    add-int v6, v39, v14

    move/from16 v14, v26

    move/from16 v5, v27

    move-object/from16 v2, v28

    move/from16 v9, v29

    move/from16 v7, v30

    move/from16 v8, v31

    move-object/from16 v4, v32

    move/from16 v3, v33

    goto/16 :goto_2c

    :cond_79
    move/from16 v33, v3

    move-object/from16 v32, v4

    move/from16 v27, v5

    move/from16 v30, v7

    move/from16 v31, v8

    move-object/from16 v34, v11

    move/from16 v26, v14

    :goto_4b
    const/4 v2, 0x0

    if-nez v12, :cond_7a

    move/from16 v6, p1

    move/from16 v4, p2

    move-object/from16 v2, v32

    goto :goto_4c

    :cond_7a
    new-instance v3, Lv3/i0$a;

    invoke-direct {v3}, Lv3/i0$a;-><init>()V

    move/from16 v6, p1

    invoke-virtual {v3, v6}, Lv3/i0$a;->b(I)V

    .line 123
    iput-object v12, v3, Lv3/i0$a;->k:Ljava/lang/String;

    move-object/from16 v11, v34

    .line 124
    iput-object v11, v3, Lv3/i0$a;->h:Ljava/lang/String;

    move/from16 v4, v33

    .line 125
    iput v4, v3, Lv3/i0$a;->p:I

    move/from16 v4, v27

    .line 126
    iput v4, v3, Lv3/i0$a;->q:I

    move/from16 v14, v26

    .line 127
    iput v14, v3, Lv3/i0$a;->t:F

    move/from16 v4, p2

    .line 128
    iput v4, v3, Lv3/i0$a;->s:I

    move-object/from16 v5, v25

    .line 129
    iput-object v5, v3, Lv3/i0$a;->u:[B

    move/from16 v5, v23

    .line 130
    iput v5, v3, Lv3/i0$a;->v:I

    move-object/from16 v5, v22

    .line 131
    iput-object v5, v3, Lv3/i0$a;->m:Ljava/util/List;

    move-object/from16 v11, v21

    .line 132
    iput-object v11, v3, Lv3/i0$a;->n:La4/d;

    const/4 v5, -0x1

    if-ne v1, v5, :cond_7b

    if-ne v15, v5, :cond_7b

    if-ne v10, v5, :cond_7b

    if-eqz v19, :cond_7d

    .line 133
    :cond_7b
    new-instance v5, Lw5/b;

    if-eqz v19, :cond_7c

    invoke-virtual/range {v19 .. v19}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    :cond_7c
    invoke-direct {v5, v1, v2, v15, v10}, Lw5/b;-><init>(I[BII)V

    .line 134
    iput-object v5, v3, Lv3/i0$a;->w:Lw5/b;

    :cond_7d
    if-eqz v20, :cond_7e

    move-object/from16 v1, v20

    .line 135
    iget-wide v7, v1, Lk4/b$b;->c:J

    .line 136
    invoke-static {v7, v8}, Lr7/a;->E(J)I

    move-result v2

    .line 137
    iput v2, v3, Lv3/i0$a;->f:I

    .line 138
    iget-wide v1, v1, Lk4/b$b;->d:J

    .line 139
    invoke-static {v1, v2}, Lr7/a;->E(J)I

    move-result v1

    .line 140
    iput v1, v3, Lv3/i0$a;->g:I

    .line 141
    :cond_7e
    new-instance v1, Lv3/i0;

    invoke-direct {v1, v3}, Lv3/i0;-><init>(Lv3/i0$a;)V

    move-object/from16 v2, v32

    .line 142
    iput-object v1, v2, Lk4/b$d;->b:Lv3/i0;

    :goto_4c
    move v1, v6

    :goto_4d
    add-int v7, v30, v31

    .line 143
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    add-int/lit8 v5, v18, 0x1

    move v6, v1

    move-object v4, v2

    move/from16 v3, v16

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    goto/16 :goto_0

    :cond_7f
    move-object v2, v4

    return-object v2
.end method

.method public static e(Lk4/a$a;Lc4/p;JLa4/d;ZZLn7/e;)Ljava/util/ArrayList;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    iget-object v4, v0, Lk4/a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_56

    iget-object v4, v0, Lk4/a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk4/a$a;

    iget v5, v4, Lk4/a;->a:I

    const v6, 0x7472616b

    if-eq v5, v6, :cond_0

    :goto_1
    move-object v1, v2

    move/from16 v18, v3

    goto/16 :goto_3f

    :cond_0
    const v5, 0x6d766864

    invoke-virtual {v0, v5}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v5

    .line 1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6d646961

    .line 2
    invoke-virtual {v4, v6}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v6

    .line 3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, 0x68646c72    # 4.3148E24f

    .line 4
    invoke-virtual {v6, v7}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v7

    .line 5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iget-object v7, v7, Lk4/a$b;->b:Lv5/u;

    const/16 v8, 0x10

    .line 7
    invoke-virtual {v7, v8}, Lv5/u;->G(I)V

    invoke-virtual {v7}, Lv5/u;->f()I

    move-result v7

    const v9, 0x736f756e

    const/4 v10, -0x1

    if-ne v7, v9, :cond_1

    const/4 v7, 0x1

    :goto_2
    move v13, v7

    goto :goto_4

    :cond_1
    const v9, 0x76696465

    if-ne v7, v9, :cond_2

    const/4 v7, 0x2

    goto :goto_2

    :cond_2
    const v9, 0x74657874

    if-eq v7, v9, :cond_5

    const v9, 0x7362746c

    if-eq v7, v9, :cond_5

    const v9, 0x73756274

    if-eq v7, v9, :cond_5

    const v9, 0x636c6370

    if-ne v7, v9, :cond_3

    goto :goto_3

    :cond_3
    const v9, 0x6d657461

    if-ne v7, v9, :cond_4

    const/4 v7, 0x5

    goto :goto_2

    :cond_4
    move v13, v10

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v7, 0x3

    goto :goto_2

    :goto_4
    const-string v7, ""

    const/4 v9, 0x4

    if-ne v13, v10, :cond_6

    move-object/from16 v26, v7

    goto/16 :goto_15

    :cond_6
    const v10, 0x746b6864

    .line 8
    invoke-virtual {v4, v10}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v10

    .line 9
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    iget-object v10, v10, Lk4/a$b;->b:Lv5/u;

    const/16 v11, 0x8

    .line 11
    invoke-virtual {v10, v11}, Lv5/u;->G(I)V

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v11

    shr-int/lit8 v11, v11, 0x18

    and-int/lit16 v11, v11, 0xff

    if-nez v11, :cond_7

    const/16 v8, 0x8

    :cond_7
    invoke-virtual {v10, v8}, Lv5/u;->H(I)V

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v12

    invoke-virtual {v10, v9}, Lv5/u;->H(I)V

    .line 12
    iget v8, v10, Lv5/u;->b:I

    if-nez v11, :cond_8

    const/4 v9, 0x4

    goto :goto_5

    :cond_8
    const/16 v9, 0x8

    :goto_5
    const/4 v14, 0x0

    :goto_6
    if-ge v14, v9, :cond_a

    .line 13
    iget-object v15, v10, Lv5/u;->a:[B

    add-int v16, v8, v14

    .line 14
    aget-byte v15, v15, v16

    const/4 v0, -0x1

    if-eq v15, v0, :cond_9

    const/4 v0, 0x0

    goto :goto_7

    :cond_9
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_a
    const/4 v0, 0x1

    :goto_7
    if-eqz v0, :cond_b

    invoke-virtual {v10, v9}, Lv5/u;->H(I)V

    goto :goto_9

    :cond_b
    if-nez v11, :cond_c

    invoke-virtual {v10}, Lv5/u;->w()J

    move-result-wide v8

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lv5/u;->z()J

    move-result-wide v8

    :goto_8
    const-wide/16 v16, 0x0

    cmp-long v0, v8, v16

    if-nez v0, :cond_d

    :goto_9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    :cond_d
    const/16 v0, 0x10

    invoke-virtual {v10, v0}, Lv5/u;->H(I)V

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v0

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v11

    const/4 v14, 0x4

    invoke-virtual {v10, v14}, Lv5/u;->H(I)V

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v14

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v10

    const/high16 v15, 0x10000

    move-wide/from16 v18, v8

    const/high16 v8, -0x10000

    if-nez v0, :cond_e

    if-ne v11, v15, :cond_e

    if-ne v14, v8, :cond_e

    if-nez v10, :cond_e

    const/16 v0, 0x5a

    goto :goto_a

    :cond_e
    if-nez v0, :cond_f

    if-ne v11, v8, :cond_f

    if-ne v14, v15, :cond_f

    if-nez v10, :cond_f

    const/16 v0, 0x10e

    goto :goto_a

    :cond_f
    if-ne v0, v8, :cond_10

    if-nez v11, :cond_10

    if-nez v14, :cond_10

    if-ne v10, v8, :cond_10

    const/16 v0, 0xb4

    goto :goto_a

    :cond_10
    const/4 v0, 0x0

    :goto_a
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v10, p2, v8

    if-nez v10, :cond_11

    move-wide/from16 v20, v18

    goto :goto_b

    :cond_11
    move-wide/from16 v20, p2

    .line 15
    :goto_b
    iget-object v5, v5, Lk4/a$b;->b:Lv5/u;

    const/16 v8, 0x8

    .line 16
    invoke-virtual {v5, v8}, Lv5/u;->G(I)V

    invoke-virtual {v5}, Lv5/u;->f()I

    move-result v8

    shr-int/lit8 v8, v8, 0x18

    and-int/lit16 v8, v8, 0xff

    if-nez v8, :cond_12

    const/16 v8, 0x8

    goto :goto_c

    :cond_12
    const/16 v8, 0x10

    :goto_c
    invoke-virtual {v5, v8}, Lv5/u;->H(I)V

    invoke-virtual {v5}, Lv5/u;->w()J

    move-result-wide v8

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v20, v10

    if-nez v5, :cond_13

    goto :goto_d

    :cond_13
    const-wide/32 v22, 0xf4240

    move-wide/from16 v24, v8

    .line 17
    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v10

    :goto_d
    move-wide/from16 v20, v10

    const v5, 0x6d696e66

    invoke-virtual {v6, v5}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v5

    .line 18
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x7374626c

    .line 19
    invoke-virtual {v5, v10}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v5

    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x6d646864

    .line 21
    invoke-virtual {v6, v10}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v6

    .line 22
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object v6, v6, Lk4/a$b;->b:Lv5/u;

    const/16 v10, 0x8

    .line 24
    invoke-virtual {v6, v10}, Lv5/u;->G(I)V

    invoke-virtual {v6}, Lv5/u;->f()I

    move-result v10

    shr-int/lit8 v10, v10, 0x18

    and-int/lit16 v10, v10, 0xff

    if-nez v10, :cond_14

    const/16 v11, 0x8

    goto :goto_e

    :cond_14
    const/16 v11, 0x10

    :goto_e
    invoke-virtual {v6, v11}, Lv5/u;->H(I)V

    invoke-virtual {v6}, Lv5/u;->w()J

    move-result-wide v14

    if-nez v10, :cond_15

    const/4 v10, 0x4

    goto :goto_f

    :cond_15
    const/16 v10, 0x8

    :goto_f
    invoke-virtual {v6, v10}, Lv5/u;->H(I)V

    invoke-virtual {v6}, Lv5/u;->A()I

    move-result v6

    .line 25
    invoke-static {v7}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    shr-int/lit8 v11, v6, 0xa

    and-int/lit8 v11, v11, 0x1f

    add-int/lit8 v11, v11, 0x60

    int-to-char v11, v11

    .line 26
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v11, v6, 0x5

    and-int/lit8 v11, v11, 0x1f

    add-int/lit8 v11, v11, 0x60

    int-to-char v11, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x60

    int-to-char v6, v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v10, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    const v10, 0x73747364

    .line 27
    invoke-virtual {v5, v10}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v5

    if-eqz v5, :cond_55

    iget-object v14, v5, Lk4/a$b;->b:Lv5/u;

    iget-object v5, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v17, v5

    check-cast v17, Ljava/lang/String;

    move v15, v12

    move/from16 v16, v0

    move-object/from16 v18, p4

    move/from16 v19, p6

    invoke-static/range {v14 .. v19}, Lk4/b;->d(Lv5/u;IILjava/lang/String;La4/d;Z)Lk4/b$d;

    move-result-object v0

    if-nez p5, :cond_1b

    const v5, 0x65647473

    invoke-virtual {v4, v5}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v5

    if-eqz v5, :cond_1b

    const v10, 0x656c7374

    .line 28
    invoke-virtual {v5, v10}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v5

    if-nez v5, :cond_16

    const/4 v5, 0x0

    move-object/from16 v26, v7

    goto :goto_13

    :cond_16
    iget-object v5, v5, Lk4/a$b;->b:Lv5/u;

    const/16 v10, 0x8

    invoke-virtual {v5, v10}, Lv5/u;->G(I)V

    invoke-virtual {v5}, Lv5/u;->f()I

    move-result v10

    shr-int/lit8 v10, v10, 0x18

    and-int/lit16 v10, v10, 0xff

    invoke-virtual {v5}, Lv5/u;->y()I

    move-result v11

    new-array v14, v11, [J

    new-array v15, v11, [J

    const/16 v16, 0x0

    move-object/from16 v26, v7

    move/from16 v7, v16

    :goto_10
    if-ge v7, v11, :cond_1a

    move/from16 v16, v11

    const/4 v11, 0x1

    if-ne v10, v11, :cond_17

    invoke-virtual {v5}, Lv5/u;->z()J

    move-result-wide v17

    goto :goto_11

    :cond_17
    invoke-virtual {v5}, Lv5/u;->w()J

    move-result-wide v17

    :goto_11
    aput-wide v17, v14, v7

    if-ne v10, v11, :cond_18

    invoke-virtual {v5}, Lv5/u;->o()J

    move-result-wide v17

    move-wide/from16 v39, v17

    move/from16 v17, v10

    move-wide/from16 v10, v39

    goto :goto_12

    :cond_18
    invoke-virtual {v5}, Lv5/u;->f()I

    move-result v11

    move/from16 v17, v10

    int-to-long v10, v11

    :goto_12
    aput-wide v10, v15, v7

    invoke-virtual {v5}, Lv5/u;->r()S

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_19

    const/4 v10, 0x2

    invoke-virtual {v5, v10}, Lv5/u;->H(I)V

    add-int/lit8 v7, v7, 0x1

    move/from16 v11, v16

    move/from16 v10, v17

    goto :goto_10

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static {v14, v15}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v5

    :goto_13
    if-eqz v5, :cond_1c

    .line 29
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, [J

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, [J

    move-object/from16 v25, v5

    move-object/from16 v24, v7

    goto :goto_14

    :cond_1b
    move-object/from16 v26, v7

    :cond_1c
    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v5

    move-object/from16 v25, v7

    :goto_14
    iget-object v5, v0, Lk4/b$d;->b:Lv3/i0;

    if-nez v5, :cond_1d

    :goto_15
    const/4 v0, 0x0

    const v5, 0x7374626c

    move-object/from16 v6, p7

    goto :goto_16

    :cond_1d
    new-instance v5, Lk4/j;

    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    iget-object v6, v0, Lk4/b$d;->b:Lv3/i0;

    iget v7, v0, Lk4/b$d;->d:I

    iget-object v10, v0, Lk4/b$d;->a:[Lk4/k;

    iget v0, v0, Lk4/b$d;->c:I

    const v27, 0x7374626c

    move-object v11, v5

    move-wide/from16 v16, v8

    move-wide/from16 v18, v20

    move-object/from16 v20, v6

    move/from16 v21, v7

    move-object/from16 v22, v10

    move/from16 v23, v0

    invoke-direct/range {v11 .. v25}, Lk4/j;-><init>(IIJJJLv3/i0;I[Lk4/k;I[J[J)V

    move-object/from16 v6, p7

    move-object v0, v5

    move/from16 v5, v27

    .line 30
    :goto_16
    invoke-interface {v6, v0}, Ln7/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lk4/j;

    if-nez v8, :cond_1e

    goto/16 :goto_1

    :cond_1e
    const v0, 0x6d646961

    invoke-virtual {v4, v0}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x6d696e66

    .line 32
    invoke-virtual {v0, v4}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {v0, v5}, Lk4/a$a;->b(I)Lk4/a$a;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7374737a

    .line 36
    invoke-virtual {v0, v4}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v4

    if-eqz v4, :cond_1f

    new-instance v5, Lk4/b$e;

    iget-object v7, v8, Lk4/j;->f:Lv3/i0;

    invoke-direct {v5, v4, v7}, Lk4/b$e;-><init>(Lk4/a$b;Lv3/i0;)V

    goto :goto_17

    :cond_1f
    const v4, 0x73747a32

    invoke-virtual {v0, v4}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v4

    if-eqz v4, :cond_54

    new-instance v5, Lk4/b$f;

    invoke-direct {v5, v4}, Lk4/b$f;-><init>(Lk4/a$b;)V

    :goto_17
    invoke-interface {v5}, Lk4/b$c;->b()I

    move-result v4

    if-nez v4, :cond_20

    new-instance v0, Lk4/m;

    const/4 v4, 0x0

    new-array v9, v4, [J

    new-array v10, v4, [I

    const/4 v11, 0x0

    new-array v12, v4, [J

    new-array v13, v4, [I

    const-wide/16 v14, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v15}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    move-object/from16 v19, v2

    move/from16 v18, v3

    goto/16 :goto_3e

    :cond_20
    const v7, 0x7374636f

    invoke-virtual {v0, v7}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v7

    if-nez v7, :cond_21

    const v7, 0x636f3634

    invoke-virtual {v0, v7}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v7

    .line 37
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x1

    goto :goto_18

    :cond_21
    const/4 v9, 0x0

    .line 38
    :goto_18
    iget-object v7, v7, Lk4/a$b;->b:Lv5/u;

    const v10, 0x73747363

    invoke-virtual {v0, v10}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v10

    .line 39
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    iget-object v10, v10, Lk4/a$b;->b:Lv5/u;

    const v11, 0x73747473

    invoke-virtual {v0, v11}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v11

    .line 41
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    iget-object v11, v11, Lk4/a$b;->b:Lv5/u;

    const v12, 0x73747373

    invoke-virtual {v0, v12}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v12

    if-eqz v12, :cond_22

    iget-object v12, v12, Lk4/a$b;->b:Lv5/u;

    goto :goto_19

    :cond_22
    const/4 v12, 0x0

    :goto_19
    const v13, 0x63747473

    invoke-virtual {v0, v13}, Lk4/a$a;->c(I)Lk4/a$b;

    move-result-object v0

    if-eqz v0, :cond_23

    iget-object v0, v0, Lk4/a$b;->b:Lv5/u;

    goto :goto_1a

    :cond_23
    const/4 v0, 0x0

    :goto_1a
    new-instance v13, Lk4/b$a;

    invoke-direct {v13, v10, v7, v9}, Lk4/b$a;-><init>(Lv5/u;Lv5/u;Z)V

    const/16 v7, 0xc

    invoke-virtual {v11, v7}, Lv5/u;->G(I)V

    invoke-virtual {v11}, Lv5/u;->y()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-virtual {v11}, Lv5/u;->y()I

    move-result v10

    invoke-virtual {v11}, Lv5/u;->y()I

    move-result v14

    if-eqz v0, :cond_24

    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    invoke-virtual {v0}, Lv5/u;->y()I

    move-result v15

    goto :goto_1b

    :cond_24
    const/4 v15, 0x0

    :goto_1b
    if-eqz v12, :cond_26

    invoke-virtual {v12, v7}, Lv5/u;->G(I)V

    invoke-virtual {v12}, Lv5/u;->y()I

    move-result v7

    if-lez v7, :cond_25

    invoke-virtual {v12}, Lv5/u;->y()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    goto :goto_1c

    :cond_25
    const/16 v16, -0x1

    const/4 v12, 0x0

    goto :goto_1c

    :cond_26
    const/16 v16, -0x1

    const/4 v7, 0x0

    :goto_1c
    invoke-interface {v5}, Lk4/b$c;->a()I

    move-result v6

    move/from16 v17, v10

    iget-object v10, v8, Lk4/j;->f:Lv3/i0;

    iget-object v10, v10, Lv3/i0;->t:Ljava/lang/String;

    move/from16 v18, v3

    const/4 v3, -0x1

    if-eq v6, v3, :cond_28

    const-string v3, "audio/raw"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "audio/g711-mlaw"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "audio/g711-alaw"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    :cond_27
    if-nez v9, :cond_28

    if-nez v15, :cond_28

    if-nez v7, :cond_28

    const/4 v3, 0x1

    goto :goto_1d

    :cond_28
    const/4 v3, 0x0

    :goto_1d
    if-eqz v3, :cond_2d

    iget v0, v13, Lk4/b$a;->a:I

    new-array v3, v0, [J

    new-array v5, v0, [I

    :goto_1e
    invoke-virtual {v13}, Lk4/b$a;->a()Z

    move-result v7

    if-eqz v7, :cond_29

    iget v7, v13, Lk4/b$a;->b:I

    iget-wide v9, v13, Lk4/b$a;->d:J

    aput-wide v9, v3, v7

    iget v9, v13, Lk4/b$a;->c:I

    aput v9, v5, v7

    goto :goto_1e

    :cond_29
    int-to-long v9, v14

    const/16 v7, 0x2000

    .line 43
    div-int/2addr v7, v6

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1f
    if-ge v11, v0, :cond_2a

    aget v13, v5, v11

    sget v14, Lv5/e0;->a:I

    add-int/2addr v13, v7

    add-int/lit8 v13, v13, -0x1

    .line 44
    div-int/2addr v13, v7

    add-int/2addr v12, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_1f

    .line 45
    :cond_2a
    new-array v11, v12, [J

    new-array v13, v12, [I

    new-array v14, v12, [J

    new-array v12, v12, [I

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v39, v19

    move-object/from16 v19, v2

    move/from16 v2, v16

    move/from16 v16, v39

    :goto_20
    if-ge v15, v0, :cond_2c

    aget v20, v5, v15

    aget-wide v21, v3, v15

    move-wide/from16 v22, v21

    move-object/from16 v21, v3

    move/from16 v3, v20

    move/from16 v20, v0

    move/from16 v0, v17

    :goto_21
    if-lez v3, :cond_2b

    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    move-result v17

    aput-wide v22, v11, v16

    move-object/from16 v24, v5

    mul-int v5, v6, v17

    aput v5, v13, v16

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v25, v6

    int-to-long v5, v2

    mul-long/2addr v5, v9

    aput-wide v5, v14, v16

    const/4 v5, 0x1

    aput v5, v12, v16

    aget v5, v13, v16

    int-to-long v5, v5

    add-long v22, v22, v5

    add-int v2, v2, v17

    sub-int v3, v3, v17

    add-int/lit8 v16, v16, 0x1

    move-object/from16 v5, v24

    move/from16 v6, v25

    goto :goto_21

    :cond_2b
    move-object/from16 v24, v5

    move/from16 v25, v6

    add-int/lit8 v15, v15, 0x1

    move/from16 v17, v0

    move/from16 v0, v20

    move-object/from16 v3, v21

    goto :goto_20

    :cond_2c
    int-to-long v2, v2

    mul-long/2addr v9, v2

    move-object v2, v11

    move-object v1, v12

    move-object v0, v14

    move-object v14, v8

    move-wide v11, v9

    goto/16 :goto_2d

    :cond_2d
    move-object/from16 v19, v2

    .line 46
    new-array v2, v4, [J

    new-array v3, v4, [I

    new-array v6, v4, [J

    new-array v10, v4, [I

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move/from16 v1, v16

    move/from16 v30, v28

    move/from16 v31, v29

    move/from16 v16, v15

    move v15, v14

    move/from16 v14, v17

    move-object/from16 v17, v8

    move/from16 v8, v20

    move-object/from16 v20, v11

    move/from16 v11, v21

    move/from16 v21, v9

    :goto_22
    const-string v9, "AtomParsers"

    if-ge v11, v4, :cond_36

    const/16 v28, 0x1

    :goto_23
    if-nez v27, :cond_2e

    invoke-virtual {v13}, Lk4/b$a;->a()Z

    move-result v28

    if-eqz v28, :cond_2e

    move/from16 v29, v14

    move/from16 v32, v15

    iget-wide v14, v13, Lk4/b$a;->d:J

    move/from16 v33, v4

    iget v4, v13, Lk4/b$a;->c:I

    move/from16 v27, v4

    move-wide/from16 v24, v14

    move/from16 v14, v29

    move/from16 v15, v32

    move/from16 v4, v33

    goto :goto_23

    :cond_2e
    move/from16 v33, v4

    move/from16 v29, v14

    move/from16 v32, v15

    if-nez v28, :cond_2f

    const-string v1, "Unexpected end of chunk data"

    invoke-static {v9, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v10

    move v4, v11

    goto/16 :goto_27

    :cond_2f
    if-eqz v0, :cond_31

    :goto_24
    if-nez v31, :cond_30

    if-lez v16, :cond_30

    invoke-virtual {v0}, Lv5/u;->y()I

    move-result v31

    invoke-virtual {v0}, Lv5/u;->f()I

    move-result v30

    add-int/lit8 v16, v16, -0x1

    goto :goto_24

    :cond_30
    add-int/lit8 v31, v31, -0x1

    :cond_31
    move/from16 v4, v30

    aput-wide v24, v2, v11

    invoke-interface {v5}, Lk4/b$c;->c()I

    move-result v9

    aput v9, v3, v11

    if-le v9, v8, :cond_32

    move v8, v9

    :cond_32
    int-to-long v14, v4

    add-long v14, v22, v14

    aput-wide v14, v6, v11

    if-nez v12, :cond_33

    const/4 v9, 0x1

    goto :goto_25

    :cond_33
    const/4 v9, 0x0

    :goto_25
    aput v9, v10, v11

    if-ne v11, v1, :cond_34

    const/4 v9, 0x1

    aput v9, v10, v11

    add-int/lit8 v7, v7, -0x1

    if-lez v7, :cond_34

    .line 47
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    invoke-virtual {v12}, Lv5/u;->y()I

    move-result v1

    sub-int/2addr v1, v9

    :cond_34
    move v9, v1

    move-object v15, v2

    move/from16 v14, v32

    int-to-long v1, v14

    add-long v22, v22, v1

    add-int/lit8 v1, v29, -0x1

    if-nez v1, :cond_35

    if-lez v21, :cond_35

    invoke-virtual/range {v20 .. v20}, Lv5/u;->y()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lv5/u;->f()I

    move-result v2

    add-int/lit8 v21, v21, -0x1

    goto :goto_26

    :cond_35
    move v2, v14

    :goto_26
    move v14, v1

    aget v1, v3, v11

    move/from16 v28, v2

    int-to-long v1, v1

    add-long v24, v24, v1

    add-int/lit8 v27, v27, -0x1

    add-int/lit8 v11, v11, 0x1

    move/from16 v30, v4

    move v1, v9

    move-object v2, v15

    move/from16 v15, v28

    move/from16 v4, v33

    goto/16 :goto_22

    :cond_36
    move-object v15, v2

    move/from16 v33, v4

    move/from16 v29, v14

    :goto_27
    move/from16 v1, v27

    move/from16 v5, v30

    int-to-long v11, v5

    add-long v11, v22, v11

    if-eqz v0, :cond_38

    :goto_28
    if-lez v16, :cond_38

    invoke-virtual {v0}, Lv5/u;->y()I

    move-result v5

    if-eqz v5, :cond_37

    const/4 v0, 0x0

    goto :goto_29

    :cond_37
    invoke-virtual {v0}, Lv5/u;->f()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_28

    :cond_38
    const/4 v0, 0x1

    :goto_29
    if-nez v7, :cond_3a

    if-nez v29, :cond_3a

    if-nez v1, :cond_3a

    if-nez v21, :cond_3a

    move/from16 v5, v31

    if-nez v5, :cond_3b

    if-nez v0, :cond_39

    goto :goto_2a

    :cond_39
    move-object/from16 v14, v17

    goto :goto_2c

    :cond_3a
    move/from16 v5, v31

    :cond_3b
    :goto_2a
    const-string v13, "Inconsistent stbl box for track "

    .line 49
    invoke-static {v13}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v14, v17

    .line 50
    iget v15, v14, Lk4/j;->a:I

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ": remainingSynchronizationSamples "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v29

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", remainingSamplesInChunk "

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingTimestampDeltaChanges "

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v0, :cond_3c

    const-string v7, ", ctts invalid"

    goto :goto_2b

    :cond_3c
    move-object/from16 v7, v26

    :goto_2b
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2c
    move-object v13, v3

    move-object v0, v6

    move/from16 v17, v8

    move-object v1, v10

    :goto_2d
    iget-wide v9, v14, Lk4/j;->c:J

    const-wide/32 v7, 0xf4240

    move-wide v5, v11

    invoke-static/range {v5 .. v10}, Lv5/e0;->O(JJJ)J

    move-result-wide v5

    iget-object v3, v14, Lk4/j;->h:[J

    if-nez v3, :cond_3d

    iget-wide v3, v14, Lk4/j;->c:J

    invoke-static {v0, v3, v4}, Lv5/e0;->P([JJ)V

    new-instance v3, Lk4/m;

    move-object v7, v3

    move-object v8, v14

    move-object v9, v2

    move-object v10, v13

    move/from16 v11, v17

    move-object v12, v0

    move-object v13, v1

    move-wide v14, v5

    invoke-direct/range {v7 .. v15}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    move-object/from16 v5, p1

    move-object v0, v3

    goto/16 :goto_3e

    :cond_3d
    array-length v3, v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_42

    iget v3, v14, Lk4/j;->b:I

    if-ne v3, v5, :cond_42

    array-length v3, v0

    const/4 v5, 0x2

    if-lt v3, v5, :cond_42

    iget-object v3, v14, Lk4/j;->i:[J

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    .line 52
    aget-wide v6, v3, v5

    iget-object v3, v14, Lk4/j;->h:[J

    aget-wide v20, v3, v5

    iget-wide v8, v14, Lk4/j;->c:J

    move-wide v15, v6

    iget-wide v5, v14, Lk4/j;->d:J

    move-wide/from16 v22, v8

    move-wide/from16 v24, v5

    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v5

    add-long/2addr v5, v15

    .line 53
    array-length v7, v0

    add-int/lit8 v7, v7, -0x1

    const/4 v8, 0x4

    const/4 v3, 0x0

    invoke-static {v8, v3, v7}, Lv5/e0;->i(III)I

    move-result v9

    array-length v10, v0

    sub-int/2addr v10, v8

    invoke-static {v10, v3, v7}, Lv5/e0;->i(III)I

    move-result v7

    aget-wide v20, v0, v3

    cmp-long v3, v20, v15

    if-gtz v3, :cond_3e

    aget-wide v8, v0, v9

    cmp-long v3, v15, v8

    if-gez v3, :cond_3e

    aget-wide v7, v0, v7

    cmp-long v3, v7, v5

    if-gez v3, :cond_3e

    cmp-long v3, v5, v11

    if-gtz v3, :cond_3e

    const/4 v3, 0x1

    goto :goto_2e

    :cond_3e
    const/4 v3, 0x0

    :goto_2e
    if-eqz v3, :cond_41

    sub-long v22, v11, v5

    sub-long v5, v15, v20

    .line 54
    iget-object v3, v14, Lk4/j;->f:Lv3/i0;

    iget v3, v3, Lv3/i0;->H:I

    int-to-long v7, v3

    iget-wide v9, v14, Lk4/j;->c:J

    invoke-static/range {v5 .. v10}, Lv5/e0;->O(JJJ)J

    move-result-wide v5

    iget-object v3, v14, Lk4/j;->f:Lv3/i0;

    iget v3, v3, Lv3/i0;->H:I

    int-to-long v7, v3

    iget-wide v9, v14, Lk4/j;->c:J

    move-wide/from16 v24, v7

    move-wide/from16 v26, v9

    invoke-static/range {v22 .. v27}, Lv5/e0;->O(JJJ)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v3, v5, v9

    if-nez v3, :cond_3f

    cmp-long v3, v7, v9

    if-eqz v3, :cond_40

    :cond_3f
    const-wide/32 v15, 0x7fffffff

    cmp-long v3, v5, v15

    if-gtz v3, :cond_40

    cmp-long v3, v7, v15

    if-gtz v3, :cond_40

    long-to-int v3, v5

    move-object/from16 v5, p1

    iput v3, v5, Lc4/p;->a:I

    long-to-int v3, v7

    iput v3, v5, Lc4/p;->b:I

    iget-wide v3, v14, Lk4/j;->c:J

    invoke-static {v0, v3, v4}, Lv5/e0;->P([JJ)V

    iget-object v3, v14, Lk4/j;->h:[J

    const/4 v4, 0x0

    aget-wide v6, v3, v4

    const-wide/32 v8, 0xf4240

    iget-wide v10, v14, Lk4/j;->d:J

    invoke-static/range {v6 .. v11}, Lv5/e0;->O(JJJ)J

    move-result-wide v3

    new-instance v6, Lk4/m;

    move-object v7, v6

    move-object v8, v14

    move-object v9, v2

    move-object v10, v13

    move/from16 v11, v17

    move-object v12, v0

    move-object v13, v1

    move-wide v14, v3

    invoke-direct/range {v7 .. v15}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    goto :goto_32

    :cond_40
    move-object/from16 v5, p1

    goto :goto_2f

    :cond_41
    move-object/from16 v5, p1

    const-wide/16 v6, 0x0

    goto :goto_30

    :cond_42
    move-object/from16 v5, p1

    const-wide/16 v9, 0x0

    :goto_2f
    move-wide v6, v9

    :goto_30
    iget-object v3, v14, Lk4/j;->h:[J

    array-length v8, v3

    const/4 v9, 0x1

    if-ne v8, v9, :cond_44

    const/4 v8, 0x0

    aget-wide v9, v3, v8

    cmp-long v6, v9, v6

    if-nez v6, :cond_45

    iget-object v3, v14, Lk4/j;->i:[J

    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    aget-wide v6, v3, v8

    :goto_31
    array-length v3, v0

    if-ge v8, v3, :cond_43

    aget-wide v3, v0, v8

    sub-long v20, v3, v6

    const-wide/32 v22, 0xf4240

    iget-wide v3, v14, Lk4/j;->c:J

    move-wide/from16 v24, v3

    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v3

    aput-wide v3, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_31

    :cond_43
    sub-long v20, v11, v6

    const-wide/32 v22, 0xf4240

    iget-wide v3, v14, Lk4/j;->c:J

    move-wide/from16 v24, v3

    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v3

    new-instance v6, Lk4/m;

    move-object v7, v6

    move-object v8, v14

    move-object v9, v2

    move-object v10, v13

    move/from16 v11, v17

    move-object v12, v0

    move-object v13, v1

    move-wide v14, v3

    invoke-direct/range {v7 .. v15}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    :goto_32
    move-object v0, v6

    goto/16 :goto_3e

    :cond_44
    const/4 v8, 0x0

    :cond_45
    iget v6, v14, Lk4/j;->b:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_46

    const/4 v6, 0x1

    goto :goto_33

    :cond_46
    move v6, v8

    :goto_33
    array-length v7, v3

    new-array v7, v7, [I

    array-length v3, v3

    new-array v3, v3, [I

    iget-object v9, v14, Lk4/j;->i:[J

    .line 57
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v10, v8

    move v11, v10

    move v12, v11

    .line 58
    :goto_34
    iget-object v15, v14, Lk4/j;->h:[J

    array-length v5, v15

    move/from16 v16, v4

    if-ge v8, v5, :cond_4a

    aget-wide v4, v9, v8

    const-wide/16 v20, -0x1

    cmp-long v20, v4, v20

    if-eqz v20, :cond_49

    aget-wide v21, v15, v8

    move-object v15, v9

    move/from16 v20, v10

    iget-wide v9, v14, Lk4/j;->c:J

    move/from16 v28, v12

    move-object/from16 v27, v13

    iget-wide v12, v14, Lk4/j;->d:J

    move-wide/from16 v23, v9

    move-wide/from16 v25, v12

    invoke-static/range {v21 .. v26}, Lv5/e0;->O(JJJ)J

    move-result-wide v9

    const/4 v12, 0x1

    invoke-static {v0, v4, v5, v12}, Lv5/e0;->f([JJZ)I

    move-result v13

    aput v13, v7, v8

    add-long/2addr v4, v9

    invoke-static {v0, v4, v5, v6}, Lv5/e0;->b([JJZ)I

    move-result v4

    aput v4, v3, v8

    :goto_35
    aget v4, v7, v8

    aget v5, v3, v8

    if-ge v4, v5, :cond_47

    aget v9, v1, v4

    and-int/2addr v9, v12

    if-nez v9, :cond_47

    add-int/lit8 v4, v4, 0x1

    aput v4, v7, v8

    goto :goto_35

    :cond_47
    sub-int v9, v5, v4

    add-int/2addr v9, v11

    move/from16 v10, v28

    if-eq v10, v4, :cond_48

    goto :goto_36

    :cond_48
    const/4 v12, 0x0

    :goto_36
    or-int v4, v20, v12

    move v10, v4

    move v12, v5

    move v11, v9

    goto :goto_37

    :cond_49
    move-object v15, v9

    move/from16 v20, v10

    move v10, v12

    move-object/from16 v27, v13

    move/from16 v10, v20

    :goto_37
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, p1

    move-object v9, v15

    move/from16 v4, v16

    move-object/from16 v13, v27

    goto :goto_34

    :cond_4a
    move/from16 v20, v10

    move-object/from16 v27, v13

    const/4 v4, 0x1

    move/from16 v5, v16

    if-eq v11, v5, :cond_4b

    goto :goto_38

    :cond_4b
    const/4 v4, 0x0

    :goto_38
    or-int v4, v20, v4

    if-eqz v4, :cond_4c

    new-array v5, v11, [J

    move-object v9, v5

    goto :goto_39

    :cond_4c
    move-object v9, v2

    :goto_39
    if-eqz v4, :cond_4d

    new-array v5, v11, [I

    move-object v10, v5

    goto :goto_3a

    :cond_4d
    move-object/from16 v10, v27

    :goto_3a
    if-eqz v4, :cond_4e

    const/16 v17, 0x0

    :cond_4e
    if-eqz v4, :cond_4f

    new-array v5, v11, [I

    move-object v13, v5

    goto :goto_3b

    :cond_4f
    move-object v13, v1

    :goto_3b
    new-array v12, v11, [J

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v15, 0x0

    move/from16 v11, v17

    :goto_3c
    iget-object v8, v14, Lk4/j;->h:[J

    array-length v8, v8

    if-ge v5, v8, :cond_53

    iget-object v8, v14, Lk4/j;->i:[J

    aget-wide v28, v8, v5

    aget v8, v7, v5

    move-object/from16 v17, v7

    aget v7, v3, v5

    if-eqz v4, :cond_50

    move-object/from16 v26, v3

    sub-int v3, v7, v8

    invoke-static {v2, v8, v9, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v30, v2

    move-object/from16 v2, v27

    invoke-static {v2, v8, v10, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1, v8, v13, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3d

    :cond_50
    move-object/from16 v30, v2

    move-object/from16 v26, v3

    move-object/from16 v2, v27

    :goto_3d
    if-ge v8, v7, :cond_52

    const-wide/32 v22, 0xf4240

    move-object v3, v1

    move-object/from16 v27, v2

    iget-wide v1, v14, Lk4/j;->d:J

    move-wide/from16 v20, v15

    move-wide/from16 v24, v1

    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v1

    aget-wide v20, v0, v8

    move/from16 v22, v7

    move/from16 v23, v8

    sub-long v7, v20, v28

    move-object/from16 v31, v9

    move-object/from16 v32, v10

    const-wide/16 v9, 0x0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v33

    const-wide/32 v35, 0xf4240

    iget-wide v7, v14, Lk4/j;->c:J

    move-wide/from16 v37, v7

    invoke-static/range {v33 .. v38}, Lv5/e0;->O(JJJ)J

    move-result-wide v7

    add-long/2addr v1, v7

    aput-wide v1, v12, v6

    if-eqz v4, :cond_51

    aget v1, v32, v6

    if-le v1, v11, :cond_51

    aget v1, v27, v23

    move v11, v1

    :cond_51
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v8, v23, 0x1

    move-object v1, v3

    move/from16 v7, v22

    move-object/from16 v2, v27

    move-object/from16 v9, v31

    move-object/from16 v10, v32

    goto :goto_3d

    :cond_52
    move-object v3, v1

    move-object/from16 v27, v2

    move-object/from16 v31, v9

    move-object/from16 v32, v10

    iget-object v1, v14, Lk4/j;->h:[J

    aget-wide v7, v1, v5

    add-long/2addr v15, v7

    add-int/lit8 v5, v5, 0x1

    move-object v1, v3

    move-object/from16 v7, v17

    move-object/from16 v3, v26

    move-object/from16 v2, v30

    goto/16 :goto_3c

    :cond_53
    move-object/from16 v31, v9

    move-object/from16 v32, v10

    const-wide/32 v22, 0xf4240

    iget-wide v0, v14, Lk4/j;->d:J

    move-wide/from16 v20, v15

    move-wide/from16 v24, v0

    invoke-static/range {v20 .. v25}, Lv5/e0;->O(JJJ)J

    move-result-wide v0

    new-instance v2, Lk4/m;

    move-object v7, v2

    move-object v8, v14

    move-wide v14, v0

    invoke-direct/range {v7 .. v15}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    move-object v0, v2

    :goto_3e
    move-object/from16 v1, v19

    .line 59
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3f
    add-int/lit8 v3, v18, 0x1

    move-object/from16 v0, p0

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_54
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    .line 60
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_55
    const/4 v0, 0x0

    const-string v1, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 61
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_56
    move-object v1, v2

    return-object v1
.end method
