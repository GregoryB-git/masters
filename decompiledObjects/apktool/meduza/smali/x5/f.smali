.class public final Lx5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lv5/u;)Ljava/util/ArrayList;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/u;",
            ")",
            "Ljava/util/ArrayList<",
            "Lx5/e$a;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    const/4 v1, 0x7

    .line 12
    invoke-virtual {v0, v1}, Lv5/u;->H(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x64666c38

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-ne v3, v4, :cond_2

    .line 24
    .line 25
    new-instance v3, Lv5/u;

    .line 26
    .line 27
    invoke-direct {v3}, Lv5/u;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ljava/util/zip/Inflater;

    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-static {v0, v3, v4}, Lv5/e0;->D(Lv5/u;Lv5/u;Ljava/util/zip/Inflater;)Z

    .line 36
    .line 37
    .line 38
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 40
    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    move-object v0, v3

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object v1, v0

    .line 49
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_2
    const v4, 0x72617720

    .line 54
    .line 55
    .line 56
    if-eq v3, v4, :cond_3

    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_3
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iget v4, v0, Lv5/u;->b:I

    .line 65
    .line 66
    iget v6, v0, Lv5/u;->c:I

    .line 67
    .line 68
    :goto_1
    if-ge v4, v6, :cond_14

    .line 69
    .line 70
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    add-int/2addr v7, v4

    .line 75
    if-le v7, v4, :cond_13

    .line 76
    .line 77
    if-le v7, v6, :cond_4

    .line 78
    .line 79
    goto/16 :goto_e

    .line 80
    .line 81
    :cond_4
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const v8, 0x6d657368

    .line 86
    .line 87
    .line 88
    if-ne v4, v8, :cond_12

    .line 89
    .line 90
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    const/16 v8, 0x2710

    .line 95
    .line 96
    if-le v4, v8, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    new-array v8, v4, [F

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    :goto_2
    if-ge v10, v4, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    aput v11, v8, v10

    .line 113
    .line 114
    add-int/lit8 v10, v10, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    const/16 v11, 0x7d00

    .line 122
    .line 123
    if-le v10, v11, :cond_8

    .line 124
    .line 125
    :goto_3
    move-object/from16 p0, v3

    .line 126
    .line 127
    :cond_7
    :goto_4
    move/from16 v20, v5

    .line 128
    .line 129
    move/from16 v19, v6

    .line 130
    .line 131
    goto/16 :goto_b

    .line 132
    .line 133
    :cond_8
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 134
    .line 135
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    .line 136
    .line 137
    .line 138
    move-result-wide v13

    .line 139
    move-object/from16 p0, v3

    .line 140
    .line 141
    int-to-double v2, v4

    .line 142
    mul-double/2addr v2, v11

    .line 143
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 144
    .line 145
    .line 146
    move-result-wide v2

    .line 147
    div-double/2addr v2, v13

    .line 148
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    double-to-int v2, v2

    .line 153
    new-instance v3, Lv5/t;

    .line 154
    .line 155
    iget-object v9, v0, Lv5/u;->a:[B

    .line 156
    .line 157
    array-length v15, v9

    .line 158
    invoke-direct {v3, v9, v15}, Lv5/t;-><init>([BI)V

    .line 159
    .line 160
    .line 161
    iget v9, v0, Lv5/u;->b:I

    .line 162
    .line 163
    const/16 v15, 0x8

    .line 164
    .line 165
    mul-int/2addr v9, v15

    .line 166
    invoke-virtual {v3, v9}, Lv5/t;->k(I)V

    .line 167
    .line 168
    .line 169
    mul-int/lit8 v9, v10, 0x5

    .line 170
    .line 171
    new-array v9, v9, [F

    .line 172
    .line 173
    const/4 v11, 0x5

    .line 174
    new-array v12, v11, [I

    .line 175
    .line 176
    const/4 v15, 0x0

    .line 177
    const/16 v18, 0x0

    .line 178
    .line 179
    :goto_5
    if-ge v15, v10, :cond_b

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    :goto_6
    if-ge v1, v11, :cond_a

    .line 183
    .line 184
    aget v19, v12, v1

    .line 185
    .line 186
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 187
    .line 188
    .line 189
    move-result v20

    .line 190
    shr-int/lit8 v21, v20, 0x1

    .line 191
    .line 192
    and-int/lit8 v11, v20, 0x1

    .line 193
    .line 194
    neg-int v11, v11

    .line 195
    xor-int v11, v11, v21

    .line 196
    .line 197
    add-int v11, v11, v19

    .line 198
    .line 199
    if-ge v11, v4, :cond_7

    .line 200
    .line 201
    if-gez v11, :cond_9

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_9
    add-int/lit8 v19, v18, 0x1

    .line 205
    .line 206
    aget v20, v8, v11

    .line 207
    .line 208
    aput v20, v9, v18

    .line 209
    .line 210
    aput v11, v12, v1

    .line 211
    .line 212
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    move/from16 v18, v19

    .line 215
    .line 216
    const/4 v11, 0x5

    .line 217
    goto :goto_6

    .line 218
    :cond_a
    add-int/lit8 v15, v15, 0x1

    .line 219
    .line 220
    const/4 v1, 0x7

    .line 221
    const/4 v11, 0x5

    .line 222
    goto :goto_5

    .line 223
    :cond_b
    invoke-virtual {v3}, Lv5/t;->e()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    const/4 v2, 0x7

    .line 228
    add-int/2addr v1, v2

    .line 229
    and-int/lit8 v1, v1, -0x8

    .line 230
    .line 231
    invoke-virtual {v3, v1}, Lv5/t;->k(I)V

    .line 232
    .line 233
    .line 234
    const/16 v1, 0x20

    .line 235
    .line 236
    invoke-virtual {v3, v1}, Lv5/t;->g(I)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    new-array v8, v4, [Lx5/e$b;

    .line 241
    .line 242
    const/4 v11, 0x0

    .line 243
    :goto_7
    if-ge v11, v4, :cond_10

    .line 244
    .line 245
    const/16 v12, 0x8

    .line 246
    .line 247
    invoke-virtual {v3, v12}, Lv5/t;->g(I)I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    invoke-virtual {v3, v12}, Lv5/t;->g(I)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v3, v1}, Lv5/t;->g(I)I

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    const v1, 0x1f400

    .line 260
    .line 261
    .line 262
    if-le v12, v1, :cond_c

    .line 263
    .line 264
    :goto_8
    goto/16 :goto_4

    .line 265
    .line 266
    :cond_c
    move/from16 v19, v6

    .line 267
    .line 268
    int-to-double v5, v10

    .line 269
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 270
    .line 271
    mul-double v5, v5, v16

    .line 272
    .line 273
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    div-double/2addr v5, v13

    .line 278
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 279
    .line 280
    .line 281
    move-result-wide v5

    .line 282
    double-to-int v5, v5

    .line 283
    mul-int/lit8 v6, v12, 0x3

    .line 284
    .line 285
    new-array v6, v6, [F

    .line 286
    .line 287
    mul-int/lit8 v1, v12, 0x2

    .line 288
    .line 289
    new-array v1, v1, [F

    .line 290
    .line 291
    move-object/from16 v21, v1

    .line 292
    .line 293
    const/4 v1, 0x0

    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    :goto_9
    if-ge v1, v12, :cond_f

    .line 297
    .line 298
    invoke-virtual {v3, v5}, Lv5/t;->g(I)I

    .line 299
    .line 300
    .line 301
    move-result v23

    .line 302
    shr-int/lit8 v24, v23, 0x1

    .line 303
    .line 304
    move-object/from16 v25, v3

    .line 305
    .line 306
    const/16 v20, 0x1

    .line 307
    .line 308
    and-int/lit8 v3, v23, 0x1

    .line 309
    .line 310
    move/from16 v23, v4

    .line 311
    .line 312
    move-object/from16 v4, v21

    .line 313
    .line 314
    neg-int v3, v3

    .line 315
    xor-int v3, v3, v24

    .line 316
    .line 317
    add-int v3, v3, v22

    .line 318
    .line 319
    if-ltz v3, :cond_e

    .line 320
    .line 321
    if-lt v3, v10, :cond_d

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_d
    mul-int/lit8 v21, v1, 0x3

    .line 325
    .line 326
    mul-int/lit8 v22, v3, 0x5

    .line 327
    .line 328
    aget v24, v9, v22

    .line 329
    .line 330
    aput v24, v6, v21

    .line 331
    .line 332
    add-int/lit8 v24, v21, 0x1

    .line 333
    .line 334
    add-int/lit8 v26, v22, 0x1

    .line 335
    .line 336
    aget v26, v9, v26

    .line 337
    .line 338
    aput v26, v6, v24

    .line 339
    .line 340
    add-int/lit8 v21, v21, 0x2

    .line 341
    .line 342
    add-int/lit8 v24, v22, 0x2

    .line 343
    .line 344
    aget v24, v9, v24

    .line 345
    .line 346
    aput v24, v6, v21

    .line 347
    .line 348
    mul-int/lit8 v21, v1, 0x2

    .line 349
    .line 350
    add-int/lit8 v24, v22, 0x3

    .line 351
    .line 352
    aget v24, v9, v24

    .line 353
    .line 354
    aput v24, v4, v21

    .line 355
    .line 356
    const/16 v20, 0x1

    .line 357
    .line 358
    add-int/lit8 v21, v21, 0x1

    .line 359
    .line 360
    add-int/lit8 v22, v22, 0x4

    .line 361
    .line 362
    aget v22, v9, v22

    .line 363
    .line 364
    aput v22, v4, v21

    .line 365
    .line 366
    add-int/lit8 v1, v1, 0x1

    .line 367
    .line 368
    move/from16 v22, v3

    .line 369
    .line 370
    move-object/from16 v21, v4

    .line 371
    .line 372
    move/from16 v4, v23

    .line 373
    .line 374
    move-object/from16 v3, v25

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_e
    :goto_a
    const/16 v20, 0x1

    .line 378
    .line 379
    :goto_b
    const/4 v1, 0x0

    .line 380
    goto :goto_c

    .line 381
    :cond_f
    move-object/from16 v25, v3

    .line 382
    .line 383
    move/from16 v23, v4

    .line 384
    .line 385
    move-object/from16 v4, v21

    .line 386
    .line 387
    const/16 v20, 0x1

    .line 388
    .line 389
    new-instance v1, Lx5/e$b;

    .line 390
    .line 391
    invoke-direct {v1, v15, v6, v4, v2}, Lx5/e$b;-><init>(I[F[FI)V

    .line 392
    .line 393
    .line 394
    aput-object v1, v8, v11

    .line 395
    .line 396
    add-int/lit8 v11, v11, 0x1

    .line 397
    .line 398
    move/from16 v6, v19

    .line 399
    .line 400
    move/from16 v5, v20

    .line 401
    .line 402
    move/from16 v4, v23

    .line 403
    .line 404
    const/16 v1, 0x20

    .line 405
    .line 406
    const/4 v2, 0x7

    .line 407
    goto/16 :goto_7

    .line 408
    .line 409
    :cond_10
    move/from16 v20, v5

    .line 410
    .line 411
    move/from16 v19, v6

    .line 412
    .line 413
    new-instance v1, Lx5/e$a;

    .line 414
    .line 415
    invoke-direct {v1, v8}, Lx5/e$a;-><init>([Lx5/e$b;)V

    .line 416
    .line 417
    .line 418
    :goto_c
    if-nez v1, :cond_11

    .line 419
    .line 420
    goto :goto_e

    .line 421
    :cond_11
    move-object/from16 v2, p0

    .line 422
    .line 423
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_d

    .line 427
    :cond_12
    move-object v2, v3

    .line 428
    move/from16 v20, v5

    .line 429
    .line 430
    move/from16 v19, v6

    .line 431
    .line 432
    :goto_d
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    .line 433
    .line 434
    .line 435
    move-object v3, v2

    .line 436
    move v4, v7

    .line 437
    move/from16 v6, v19

    .line 438
    .line 439
    move/from16 v5, v20

    .line 440
    .line 441
    const/4 v1, 0x7

    .line 442
    const/4 v2, 0x0

    .line 443
    goto/16 :goto_1

    .line 444
    .line 445
    :cond_13
    :goto_e
    const/4 v2, 0x0

    .line 446
    goto :goto_f

    .line 447
    :cond_14
    move-object v2, v3

    .line 448
    :goto_f
    return-object v2
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
