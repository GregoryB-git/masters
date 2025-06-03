.class public final Lu4/g;
.super Le9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/g$b;,
        Lu4/g$a;
    }
.end annotation


# static fields
.field public static final c:Lw3/v;


# instance fields
.field public final b:Lu4/g$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw3/v;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lw3/v;-><init>(I)V

    sput-object v0, Lu4/g;->c:Lw3/v;

    return-void
.end method

.method public constructor <init>(Lu4/g$a;)V
    .locals 0

    invoke-direct {p0}, Le9/a;-><init>()V

    iput-object p1, p0, Lu4/g;->b:Lu4/g$a;

    return-void
.end method

.method public static D(IILv5/u;)Lu4/a;
    .locals 8

    .line 1
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, -0x1

    .line 10
    add-int/2addr p0, v2

    .line 11
    new-array v3, p0, [B

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-virtual {p2, v3, v4, p0}, Lv5/u;->d([BII)V

    .line 15
    .line 16
    .line 17
    const-string p2, "image/"

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    if-ne p1, v5, :cond_1

    .line 21
    .line 22
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/String;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    sget-object v6, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 30
    .line 31
    invoke-direct {p2, v3, v4, v2, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "image/jpg"

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    const-string p1, "image/jpeg"

    .line 54
    .line 55
    :cond_0
    move-object p2, p1

    .line 56
    move p1, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {v3, v4}, Lu4/g;->Q([BI)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    new-instance v6, Ljava/lang/String;

    .line 63
    .line 64
    sget-object v7, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 65
    .line 66
    invoke-direct {v6, v3, v4, p1, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v6}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/16 v6, 0x2f

    .line 74
    .line 75
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-ne v6, v2, :cond_2

    .line 80
    .line 81
    invoke-static {p2, v4}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move-object p2, v4

    .line 87
    :goto_0
    add-int/lit8 v2, p1, 0x1

    .line 88
    .line 89
    aget-byte v2, v3, v2

    .line 90
    .line 91
    and-int/lit16 v2, v2, 0xff

    .line 92
    .line 93
    add-int/2addr p1, v5

    .line 94
    invoke-static {v3, p1, v0}, Lu4/g;->P([BII)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    new-instance v5, Ljava/lang/String;

    .line 99
    .line 100
    sub-int v6, v4, p1

    .line 101
    .line 102
    invoke-direct {v5, v3, p1, v6, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lu4/g;->M(I)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    add-int/2addr p1, v4

    .line 110
    if-gt p0, p1, :cond_3

    .line 111
    .line 112
    sget-object p0, Lv5/e0;->f:[B

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {v3, p1, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :goto_1
    new-instance p1, Lu4/a;

    .line 120
    .line 121
    invoke-direct {p1, v2, p2, v5, p0}, Lu4/a;-><init>(ILjava/lang/String;Ljava/lang/String;[B)V

    .line 122
    .line 123
    .line 124
    return-object p1
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public static E(Lv5/u;IIZILu4/g$a;)Lu4/c;
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    iget v1, v0, Lv5/u;->b:I

    .line 3
    .line 4
    iget-object v2, v0, Lv5/u;->a:[B

    .line 5
    .line 6
    invoke-static {v2, v1}, Lu4/g;->Q([BI)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    new-instance v4, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, v0, Lv5/u;->a:[B

    .line 13
    .line 14
    sub-int v5, v2, v1

    .line 15
    .line 16
    sget-object v6, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-direct {v4, v3, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lv5/u;->G(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lv5/u;->f()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p0}, Lv5/u;->f()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p0}, Lv5/u;->w()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-wide v7, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v9, v2, v7

    .line 44
    .line 45
    const-wide/16 v10, -0x1

    .line 46
    .line 47
    if-nez v9, :cond_0

    .line 48
    .line 49
    move-wide v12, v10

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-wide v12, v2

    .line 52
    :goto_0
    invoke-virtual {p0}, Lv5/u;->w()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long v7, v2, v7

    .line 57
    .line 58
    if-nez v7, :cond_1

    .line 59
    .line 60
    move-wide v9, v10

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-wide v9, v2

    .line 63
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    add-int v1, v1, p1

    .line 69
    .line 70
    :cond_2
    :goto_2
    iget v3, v0, Lv5/u;->b:I

    .line 71
    .line 72
    if-ge v3, v1, :cond_3

    .line 73
    .line 74
    move/from16 v3, p2

    .line 75
    .line 76
    move/from16 v7, p3

    .line 77
    .line 78
    move/from16 v8, p4

    .line 79
    .line 80
    move-object/from16 v11, p5

    .line 81
    .line 82
    invoke-static {v3, p0, v7, v8, v11}, Lu4/g;->H(ILv5/u;ZILu4/g$a;)Lu4/h;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    if-eqz v14, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    const/4 v0, 0x0

    .line 93
    new-array v0, v0, [Lu4/h;

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    move-object v11, v0

    .line 100
    check-cast v11, [Lu4/h;

    .line 101
    .line 102
    new-instance v0, Lu4/c;

    .line 103
    .line 104
    move-object v3, v0

    .line 105
    move-wide v7, v12

    .line 106
    invoke-direct/range {v3 .. v11}, Lu4/c;-><init>(Ljava/lang/String;IIJJ[Lu4/h;)V

    .line 107
    .line 108
    .line 109
    return-object v0
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
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
.end method

.method public static F(Lv5/u;IIZILu4/g$a;)Lu4/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv5/u;->b:I

    .line 4
    .line 5
    iget-object v2, v0, Lv5/u;->a:[B

    .line 6
    .line 7
    invoke-static {v2, v1}, Lu4/g;->Q([BI)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    new-instance v3, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, v0, Lv5/u;->a:[B

    .line 14
    .line 15
    sub-int v5, v2, v1

    .line 16
    .line 17
    sget-object v6, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-direct {v3, v4, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    add-int/2addr v2, v4

    .line 24
    invoke-virtual {v0, v2}, Lv5/u;->G(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    and-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v5, v6

    .line 39
    :goto_0
    and-int/2addr v2, v4

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    move v2, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v2, v6

    .line 45
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    new-array v8, v7, [Ljava/lang/String;

    .line 50
    .line 51
    move v9, v6

    .line 52
    :goto_2
    if-ge v9, v7, :cond_2

    .line 53
    .line 54
    iget v10, v0, Lv5/u;->b:I

    .line 55
    .line 56
    iget-object v11, v0, Lv5/u;->a:[B

    .line 57
    .line 58
    invoke-static {v11, v10}, Lu4/g;->Q([BI)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    new-instance v12, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v13, v0, Lv5/u;->a:[B

    .line 65
    .line 66
    sub-int v14, v11, v10

    .line 67
    .line 68
    sget-object v15, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    invoke-direct {v12, v13, v10, v14, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 71
    .line 72
    .line 73
    aput-object v12, v8, v9

    .line 74
    .line 75
    add-int/2addr v11, v4

    .line 76
    invoke-virtual {v0, v11}, Lv5/u;->G(I)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    add-int v1, v1, p1

    .line 88
    .line 89
    :cond_3
    :goto_3
    iget v7, v0, Lv5/u;->b:I

    .line 90
    .line 91
    if-ge v7, v1, :cond_4

    .line 92
    .line 93
    move/from16 v7, p2

    .line 94
    .line 95
    move/from16 v9, p3

    .line 96
    .line 97
    move/from16 v10, p4

    .line 98
    .line 99
    move-object/from16 v11, p5

    .line 100
    .line 101
    invoke-static {v7, v0, v9, v10, v11}, Lu4/g;->H(ILv5/u;ZILu4/g$a;)Lu4/h;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    if-eqz v12, :cond_3

    .line 106
    .line 107
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    new-array v0, v6, [Lu4/h;

    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, [Lu4/h;

    .line 118
    .line 119
    new-instance v1, Lu4/d;

    .line 120
    .line 121
    move-object/from16 p0, v1

    .line 122
    .line 123
    move-object/from16 p1, v3

    .line 124
    .line 125
    move/from16 p2, v5

    .line 126
    .line 127
    move/from16 p3, v2

    .line 128
    .line 129
    move-object/from16 p4, v8

    .line 130
    .line 131
    move-object/from16 p5, v0

    .line 132
    .line 133
    invoke-direct/range {p0 .. p5}, Lu4/d;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lu4/h;)V

    .line 134
    .line 135
    .line 136
    return-object v1
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
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
.end method

.method public static G(ILv5/u;)Lu4/e;
    .locals 7

    const/4 v0, 0x4

    if-ge p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lv5/u;->v()I

    move-result v1

    invoke-static {v1}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    move-result-object v2

    const/4 v3, 0x3

    new-array v4, v3, [B

    const/4 v5, 0x0

    invoke-virtual {p1, v4, v5, v3}, Lv5/u;->d([BII)V

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v5, v3}, Ljava/lang/String;-><init>([BII)V

    sub-int/2addr p0, v0

    new-array v0, p0, [B

    invoke-virtual {p1, v0, v5, p0}, Lv5/u;->d([BII)V

    invoke-static {v0, v5, v1}, Lu4/g;->P([BII)I

    move-result p0

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v5, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v1}, Lu4/g;->M(I)I

    move-result v3

    add-int/2addr v3, p0

    invoke-static {v0, v3, v1}, Lu4/g;->P([BII)I

    move-result p0

    invoke-static {v0, v3, p0, v2}, Lu4/g;->K([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lu4/e;

    invoke-direct {v0, v6, p1, p0}, Lu4/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static H(ILv5/u;ZILu4/g$a;)Lu4/h;
    .locals 19

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 6
    .line 7
    .line 8
    move-result v8

    .line 9
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 10
    .line 11
    .line 12
    move-result v9

    .line 13
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    const/4 v12, 0x3

    .line 18
    if-lt v0, v12, :cond_0

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    move v13, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v13, 0x0

    .line 27
    :goto_0
    const/4 v14, 0x4

    .line 28
    if-ne v0, v14, :cond_2

    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, Lv5/u;->y()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    and-int/lit16 v2, v1, 0xff

    .line 37
    .line 38
    shr-int/lit8 v3, v1, 0x8

    .line 39
    .line 40
    and-int/lit16 v3, v3, 0xff

    .line 41
    .line 42
    shl-int/lit8 v3, v3, 0x7

    .line 43
    .line 44
    or-int/2addr v2, v3

    .line 45
    shr-int/lit8 v3, v1, 0x10

    .line 46
    .line 47
    and-int/lit16 v3, v3, 0xff

    .line 48
    .line 49
    shl-int/lit8 v3, v3, 0xe

    .line 50
    .line 51
    or-int/2addr v2, v3

    .line 52
    shr-int/lit8 v1, v1, 0x18

    .line 53
    .line 54
    and-int/lit16 v1, v1, 0xff

    .line 55
    .line 56
    shl-int/lit8 v1, v1, 0x15

    .line 57
    .line 58
    or-int/2addr v1, v2

    .line 59
    :cond_1
    :goto_1
    move v15, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    if-ne v0, v12, :cond_3

    .line 62
    .line 63
    invoke-virtual/range {p1 .. p1}, Lv5/u;->y()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lv5/u;->x()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_1

    .line 73
    :goto_2
    if-lt v0, v12, :cond_4

    .line 74
    .line 75
    invoke-virtual/range {p1 .. p1}, Lv5/u;->A()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    move v6, v1

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    const/4 v6, 0x0

    .line 82
    :goto_3
    const/4 v5, 0x0

    .line 83
    if-nez v8, :cond_5

    .line 84
    .line 85
    if-nez v9, :cond_5

    .line 86
    .line 87
    if-nez v10, :cond_5

    .line 88
    .line 89
    if-nez v13, :cond_5

    .line 90
    .line 91
    if-nez v15, :cond_5

    .line 92
    .line 93
    if-nez v6, :cond_5

    .line 94
    .line 95
    :goto_4
    iget v0, v7, Lv5/u;->c:I

    .line 96
    .line 97
    invoke-virtual {v7, v0}, Lv5/u;->G(I)V

    .line 98
    .line 99
    .line 100
    return-object v5

    .line 101
    :cond_5
    iget v1, v7, Lv5/u;->b:I

    .line 102
    .line 103
    add-int v4, v1, v15

    .line 104
    .line 105
    iget v1, v7, Lv5/u;->c:I

    .line 106
    .line 107
    const-string v3, "Id3Decoder"

    .line 108
    .line 109
    if-le v4, v1, :cond_6

    .line 110
    .line 111
    const-string v0, "Frame size exceeds remaining tag data"

    .line 112
    .line 113
    invoke-static {v3, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    if-eqz p4, :cond_7

    .line 118
    .line 119
    move-object/from16 v1, p4

    .line 120
    .line 121
    move/from16 v2, p0

    .line 122
    .line 123
    move-object/from16 v16, v3

    .line 124
    .line 125
    move v3, v8

    .line 126
    move v11, v4

    .line 127
    move v4, v9

    .line 128
    move-object v14, v5

    .line 129
    move v5, v10

    .line 130
    move/from16 v17, v6

    .line 131
    .line 132
    move v6, v13

    .line 133
    invoke-interface/range {v1 .. v6}, Lu4/g$a;->d(IIIII)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v7, v11}, Lv5/u;->G(I)V

    .line 140
    .line 141
    .line 142
    return-object v14

    .line 143
    :cond_7
    move-object/from16 v16, v3

    .line 144
    .line 145
    move v11, v4

    .line 146
    move-object v14, v5

    .line 147
    move/from16 v17, v6

    .line 148
    .line 149
    :cond_8
    const/4 v1, 0x1

    .line 150
    if-ne v0, v12, :cond_c

    .line 151
    .line 152
    move/from16 v2, v17

    .line 153
    .line 154
    and-int/lit16 v3, v2, 0x80

    .line 155
    .line 156
    if-eqz v3, :cond_9

    .line 157
    .line 158
    move v3, v1

    .line 159
    goto :goto_5

    .line 160
    :cond_9
    const/4 v3, 0x0

    .line 161
    :goto_5
    and-int/lit8 v4, v2, 0x40

    .line 162
    .line 163
    if-eqz v4, :cond_a

    .line 164
    .line 165
    move v4, v1

    .line 166
    goto :goto_6

    .line 167
    :cond_a
    const/4 v4, 0x0

    .line 168
    :goto_6
    and-int/lit8 v2, v2, 0x20

    .line 169
    .line 170
    if-eqz v2, :cond_b

    .line 171
    .line 172
    move v2, v1

    .line 173
    goto :goto_7

    .line 174
    :cond_b
    const/4 v2, 0x0

    .line 175
    :goto_7
    move v5, v3

    .line 176
    goto :goto_c

    .line 177
    :cond_c
    move/from16 v2, v17

    .line 178
    .line 179
    const/4 v3, 0x4

    .line 180
    if-ne v0, v3, :cond_12

    .line 181
    .line 182
    and-int/lit8 v3, v2, 0x40

    .line 183
    .line 184
    if-eqz v3, :cond_d

    .line 185
    .line 186
    move v3, v1

    .line 187
    goto :goto_8

    .line 188
    :cond_d
    const/4 v3, 0x0

    .line 189
    :goto_8
    and-int/lit8 v4, v2, 0x8

    .line 190
    .line 191
    if-eqz v4, :cond_e

    .line 192
    .line 193
    move v4, v1

    .line 194
    goto :goto_9

    .line 195
    :cond_e
    const/4 v4, 0x0

    .line 196
    :goto_9
    and-int/lit8 v5, v2, 0x4

    .line 197
    .line 198
    if-eqz v5, :cond_f

    .line 199
    .line 200
    move v5, v1

    .line 201
    goto :goto_a

    .line 202
    :cond_f
    const/4 v5, 0x0

    .line 203
    :goto_a
    and-int/lit8 v6, v2, 0x2

    .line 204
    .line 205
    if-eqz v6, :cond_10

    .line 206
    .line 207
    move v6, v1

    .line 208
    goto :goto_b

    .line 209
    :cond_10
    const/4 v6, 0x0

    .line 210
    :goto_b
    and-int/2addr v2, v1

    .line 211
    if-eqz v2, :cond_11

    .line 212
    .line 213
    move v2, v1

    .line 214
    goto :goto_d

    .line 215
    :cond_11
    const/4 v2, 0x0

    .line 216
    goto :goto_d

    .line 217
    :cond_12
    const/4 v2, 0x0

    .line 218
    const/4 v3, 0x0

    .line 219
    const/4 v4, 0x0

    .line 220
    const/4 v5, 0x0

    .line 221
    :goto_c
    const/4 v6, 0x0

    .line 222
    move/from16 v18, v3

    .line 223
    .line 224
    move v3, v2

    .line 225
    move v2, v5

    .line 226
    move v5, v4

    .line 227
    move/from16 v4, v18

    .line 228
    .line 229
    :goto_d
    if-nez v4, :cond_2c

    .line 230
    .line 231
    if-eqz v5, :cond_13

    .line 232
    .line 233
    goto/16 :goto_14

    .line 234
    .line 235
    :cond_13
    if-eqz v3, :cond_14

    .line 236
    .line 237
    add-int/lit8 v15, v15, -0x1

    .line 238
    .line 239
    invoke-virtual {v7, v1}, Lv5/u;->H(I)V

    .line 240
    .line 241
    .line 242
    :cond_14
    if-eqz v2, :cond_15

    .line 243
    .line 244
    add-int/lit8 v15, v15, -0x4

    .line 245
    .line 246
    const/4 v2, 0x4

    .line 247
    invoke-virtual {v7, v2}, Lv5/u;->H(I)V

    .line 248
    .line 249
    .line 250
    :cond_15
    if-eqz v6, :cond_16

    .line 251
    .line 252
    invoke-static {v15, v7}, Lu4/g;->R(ILv5/u;)I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    :cond_16
    const/16 v2, 0x54

    .line 257
    .line 258
    const/16 v3, 0x58

    .line 259
    .line 260
    const/4 v4, 0x2

    .line 261
    if-ne v8, v2, :cond_19

    .line 262
    .line 263
    if-ne v9, v3, :cond_19

    .line 264
    .line 265
    if-ne v10, v3, :cond_19

    .line 266
    .line 267
    if-eq v0, v4, :cond_17

    .line 268
    .line 269
    if-ne v13, v3, :cond_19

    .line 270
    .line 271
    :cond_17
    if-ge v15, v1, :cond_18

    .line 272
    .line 273
    goto :goto_e

    .line 274
    :cond_18
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    add-int/lit8 v2, v15, -0x1

    .line 279
    .line 280
    new-array v3, v2, [B

    .line 281
    .line 282
    const/4 v4, 0x0

    .line 283
    invoke-virtual {v7, v3, v4, v2}, Lv5/u;->d([BII)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3, v4, v1}, Lu4/g;->P([BII)I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    new-instance v5, Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v1}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-direct {v5, v3, v4, v2, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v1}, Lu4/g;->M(I)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    add-int/2addr v4, v2

    .line 304
    invoke-static {v3, v1, v4}, Lu4/g;->L([BII)Lo7/l0;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    new-instance v2, Lu4/l;

    .line 309
    .line 310
    const-string v3, "TXXX"

    .line 311
    .line 312
    invoke-direct {v2, v3, v5, v1}, Lu4/l;-><init>(Ljava/lang/String;Ljava/lang/String;Lo7/l0;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_f

    .line 316
    .line 317
    :catchall_0
    move-exception v0

    .line 318
    goto/16 :goto_13

    .line 319
    .line 320
    :cond_19
    if-ne v8, v2, :cond_1b

    .line 321
    .line 322
    invoke-static {v0, v8, v9, v10, v13}, Lu4/g;->O(IIIII)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    if-ge v15, v1, :cond_1a

    .line 327
    .line 328
    goto :goto_e

    .line 329
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    add-int/lit8 v3, v15, -0x1

    .line 334
    .line 335
    new-array v4, v3, [B

    .line 336
    .line 337
    const/4 v5, 0x0

    .line 338
    invoke-virtual {v7, v4, v5, v3}, Lv5/u;->d([BII)V

    .line 339
    .line 340
    .line 341
    invoke-static {v4, v1, v5}, Lu4/g;->L([BII)Lo7/l0;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    new-instance v5, Lu4/l;

    .line 346
    .line 347
    invoke-direct {v5, v2, v14, v1}, Lu4/l;-><init>(Ljava/lang/String;Ljava/lang/String;Lo7/l0;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_12

    .line 351
    .line 352
    :cond_1b
    const/16 v5, 0x57

    .line 353
    .line 354
    if-ne v8, v5, :cond_1e

    .line 355
    .line 356
    if-ne v9, v3, :cond_1e

    .line 357
    .line 358
    if-ne v10, v3, :cond_1e

    .line 359
    .line 360
    if-eq v0, v4, :cond_1c

    .line 361
    .line 362
    if-ne v13, v3, :cond_1e

    .line 363
    .line 364
    :cond_1c
    if-ge v15, v1, :cond_1d

    .line 365
    .line 366
    :goto_e
    move-object v5, v14

    .line 367
    goto/16 :goto_12

    .line 368
    .line 369
    :cond_1d
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    add-int/lit8 v2, v15, -0x1

    .line 374
    .line 375
    new-array v3, v2, [B

    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    invoke-virtual {v7, v3, v4, v2}, Lv5/u;->d([BII)V

    .line 379
    .line 380
    .line 381
    invoke-static {v3, v4, v1}, Lu4/g;->P([BII)I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    new-instance v5, Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v1}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-direct {v5, v3, v4, v2, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v1}, Lu4/g;->M(I)I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    add-int/2addr v1, v2

    .line 399
    invoke-static {v3, v1}, Lu4/g;->Q([BI)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    sget-object v4, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 404
    .line 405
    invoke-static {v3, v1, v2, v4}, Lu4/g;->K([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    new-instance v2, Lu4/m;

    .line 410
    .line 411
    const-string v3, "WXXX"

    .line 412
    .line 413
    invoke-direct {v2, v3, v5, v1}, Lu4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    goto :goto_f

    .line 417
    :cond_1e
    if-ne v8, v5, :cond_1f

    .line 418
    .line 419
    invoke-static {v0, v8, v9, v10, v13}, Lu4/g;->O(IIIII)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    new-array v2, v15, [B

    .line 424
    .line 425
    const/4 v3, 0x0

    .line 426
    invoke-virtual {v7, v2, v3, v15}, Lv5/u;->d([BII)V

    .line 427
    .line 428
    .line 429
    invoke-static {v2, v3}, Lu4/g;->Q([BI)I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    new-instance v5, Ljava/lang/String;

    .line 434
    .line 435
    sget-object v6, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 436
    .line 437
    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 438
    .line 439
    .line 440
    new-instance v2, Lu4/m;

    .line 441
    .line 442
    invoke-direct {v2, v1, v14, v5}, Lu4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    :goto_f
    move-object v5, v2

    .line 446
    goto/16 :goto_12

    .line 447
    .line 448
    :cond_1f
    const/16 v3, 0x49

    .line 449
    .line 450
    const/16 v5, 0x50

    .line 451
    .line 452
    if-ne v8, v5, :cond_21

    .line 453
    .line 454
    const/16 v6, 0x52

    .line 455
    .line 456
    if-ne v9, v6, :cond_21

    .line 457
    .line 458
    if-ne v10, v3, :cond_21

    .line 459
    .line 460
    const/16 v6, 0x56

    .line 461
    .line 462
    if-ne v13, v6, :cond_21

    .line 463
    .line 464
    new-array v2, v15, [B

    .line 465
    .line 466
    const/4 v3, 0x0

    .line 467
    invoke-virtual {v7, v2, v3, v15}, Lv5/u;->d([BII)V

    .line 468
    .line 469
    .line 470
    invoke-static {v2, v3}, Lu4/g;->Q([BI)I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    new-instance v5, Ljava/lang/String;

    .line 475
    .line 476
    sget-object v6, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 477
    .line 478
    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 479
    .line 480
    .line 481
    add-int/2addr v4, v1

    .line 482
    if-gt v15, v4, :cond_20

    .line 483
    .line 484
    sget-object v1, Lv5/e0;->f:[B

    .line 485
    .line 486
    goto :goto_10

    .line 487
    :cond_20
    invoke-static {v2, v4, v15}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    :goto_10
    new-instance v2, Lu4/k;

    .line 492
    .line 493
    invoke-direct {v2, v5, v1}, Lu4/k;-><init>(Ljava/lang/String;[B)V

    .line 494
    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_21
    const/16 v1, 0x47

    .line 498
    .line 499
    const/16 v6, 0x4f

    .line 500
    .line 501
    if-ne v8, v1, :cond_23

    .line 502
    .line 503
    const/16 v1, 0x45

    .line 504
    .line 505
    if-ne v9, v1, :cond_23

    .line 506
    .line 507
    if-ne v10, v6, :cond_23

    .line 508
    .line 509
    const/16 v1, 0x42

    .line 510
    .line 511
    if-eq v13, v1, :cond_22

    .line 512
    .line 513
    if-ne v0, v4, :cond_23

    .line 514
    .line 515
    :cond_22
    invoke-static {v15, v7}, Lu4/g;->I(ILv5/u;)Lu4/f;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    goto/16 :goto_12

    .line 520
    .line 521
    :cond_23
    const/16 v1, 0x41

    .line 522
    .line 523
    const/16 v12, 0x43

    .line 524
    .line 525
    if-ne v0, v4, :cond_24

    .line 526
    .line 527
    if-ne v8, v5, :cond_25

    .line 528
    .line 529
    if-ne v9, v3, :cond_25

    .line 530
    .line 531
    if-ne v10, v12, :cond_25

    .line 532
    .line 533
    goto :goto_11

    .line 534
    :cond_24
    if-ne v8, v1, :cond_25

    .line 535
    .line 536
    if-ne v9, v5, :cond_25

    .line 537
    .line 538
    if-ne v10, v3, :cond_25

    .line 539
    .line 540
    if-ne v13, v12, :cond_25

    .line 541
    .line 542
    :goto_11
    invoke-static {v15, v0, v7}, Lu4/g;->D(IILv5/u;)Lu4/a;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    goto/16 :goto_12

    .line 547
    .line 548
    :cond_25
    const/16 v3, 0x4d

    .line 549
    .line 550
    if-ne v8, v12, :cond_27

    .line 551
    .line 552
    if-ne v9, v6, :cond_27

    .line 553
    .line 554
    if-ne v10, v3, :cond_27

    .line 555
    .line 556
    if-eq v13, v3, :cond_26

    .line 557
    .line 558
    if-ne v0, v4, :cond_27

    .line 559
    .line 560
    :cond_26
    invoke-static {v15, v7}, Lu4/g;->G(ILv5/u;)Lu4/e;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    goto :goto_12

    .line 565
    :cond_27
    if-ne v8, v12, :cond_28

    .line 566
    .line 567
    const/16 v4, 0x48

    .line 568
    .line 569
    if-ne v9, v4, :cond_28

    .line 570
    .line 571
    if-ne v10, v1, :cond_28

    .line 572
    .line 573
    if-ne v13, v5, :cond_28

    .line 574
    .line 575
    move-object/from16 v1, p1

    .line 576
    .line 577
    move v2, v15

    .line 578
    move/from16 v3, p0

    .line 579
    .line 580
    move/from16 v4, p2

    .line 581
    .line 582
    move/from16 v5, p3

    .line 583
    .line 584
    move-object/from16 v6, p4

    .line 585
    .line 586
    invoke-static/range {v1 .. v6}, Lu4/g;->E(Lv5/u;IIZILu4/g$a;)Lu4/c;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    goto :goto_12

    .line 591
    :cond_28
    if-ne v8, v12, :cond_29

    .line 592
    .line 593
    if-ne v9, v2, :cond_29

    .line 594
    .line 595
    if-ne v10, v6, :cond_29

    .line 596
    .line 597
    if-ne v13, v12, :cond_29

    .line 598
    .line 599
    move-object/from16 v1, p1

    .line 600
    .line 601
    move v2, v15

    .line 602
    move/from16 v3, p0

    .line 603
    .line 604
    move/from16 v4, p2

    .line 605
    .line 606
    move/from16 v5, p3

    .line 607
    .line 608
    move-object/from16 v6, p4

    .line 609
    .line 610
    invoke-static/range {v1 .. v6}, Lu4/g;->F(Lv5/u;IIZILu4/g$a;)Lu4/d;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    goto :goto_12

    .line 615
    :cond_29
    if-ne v8, v3, :cond_2a

    .line 616
    .line 617
    const/16 v1, 0x4c

    .line 618
    .line 619
    if-ne v9, v1, :cond_2a

    .line 620
    .line 621
    if-ne v10, v1, :cond_2a

    .line 622
    .line 623
    if-ne v13, v2, :cond_2a

    .line 624
    .line 625
    invoke-static {v15, v7}, Lu4/g;->J(ILv5/u;)Lu4/j;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    goto :goto_12

    .line 630
    :cond_2a
    invoke-static {v0, v8, v9, v10, v13}, Lu4/g;->O(IIIII)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    new-array v2, v15, [B

    .line 635
    .line 636
    const/4 v3, 0x0

    .line 637
    invoke-virtual {v7, v2, v3, v15}, Lv5/u;->d([BII)V

    .line 638
    .line 639
    .line 640
    new-instance v5, Lu4/b;

    .line 641
    .line 642
    invoke-direct {v5, v1, v2}, Lu4/b;-><init>(Ljava/lang/String;[B)V

    .line 643
    .line 644
    .line 645
    :goto_12
    if-nez v5, :cond_2b

    .line 646
    .line 647
    new-instance v1, Ljava/lang/StringBuilder;

    .line 648
    .line 649
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 650
    .line 651
    .line 652
    const-string v2, "Failed to decode frame: id="

    .line 653
    .line 654
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-static {v0, v8, v9, v10, v13}, Lu4/g;->O(IIIII)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    const-string v0, ", frameSize="

    .line 665
    .line 666
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    move-object/from16 v1, v16

    .line 677
    .line 678
    invoke-static {v1, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 679
    .line 680
    .line 681
    :cond_2b
    invoke-virtual {v7, v11}, Lv5/u;->G(I)V

    .line 682
    .line 683
    .line 684
    return-object v5

    .line 685
    :goto_13
    invoke-virtual {v7, v11}, Lv5/u;->G(I)V

    .line 686
    .line 687
    .line 688
    throw v0

    .line 689
    :cond_2c
    :goto_14
    move-object/from16 v1, v16

    .line 690
    .line 691
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    .line 692
    .line 693
    invoke-static {v1, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v7, v11}, Lv5/u;->G(I)V

    .line 697
    .line 698
    .line 699
    return-object v14
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
.end method

.method public static I(ILv5/u;)Lu4/f;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    add-int/lit8 p0, p0, -0x1

    .line 10
    .line 11
    new-array v2, p0, [B

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p1, v2, v3, p0}, Lv5/u;->d([BII)V

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lu4/g;->Q([BI)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v4, Ljava/lang/String;

    .line 22
    .line 23
    sget-object v5, Ln7/d;->b:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    invoke-direct {v4, v2, v3, p1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    invoke-static {v2, p1, v0}, Lu4/g;->P([BII)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v2, p1, v3, v1}, Lu4/g;->K([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0}, Lu4/g;->M(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    add-int/2addr v5, v3

    .line 43
    invoke-static {v2, v5, v0}, Lu4/g;->P([BII)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v2, v5, v3, v1}, Lu4/g;->K([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v0}, Lu4/g;->M(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v3

    .line 56
    if-gt p0, v0, :cond_0

    .line 57
    .line 58
    sget-object p0, Lv5/e0;->f:[B

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v2, v0, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    new-instance v0, Lu4/f;

    .line 66
    .line 67
    invoke-direct {v0, v4, p1, v1, p0}, Lu4/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    return-object v0
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

.method public static J(ILv5/u;)Lu4/j;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lv5/u;->A()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p1}, Lv5/u;->x()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p1}, Lv5/u;->x()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Lv5/t;

    .line 22
    .line 23
    invoke-direct {v4}, Lv5/t;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v6, p1, Lv5/u;->a:[B

    .line 27
    .line 28
    iget v7, p1, Lv5/u;->c:I

    .line 29
    .line 30
    invoke-virtual {v4, v6, v7}, Lv5/t;->j([BI)V

    .line 31
    .line 32
    .line 33
    iget p1, p1, Lv5/u;->b:I

    .line 34
    .line 35
    mul-int/lit8 p1, p1, 0x8

    .line 36
    .line 37
    invoke-virtual {v4, p1}, Lv5/t;->k(I)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p0, p0, -0xa

    .line 41
    .line 42
    mul-int/lit8 p0, p0, 0x8

    .line 43
    .line 44
    add-int p1, v0, v3

    .line 45
    .line 46
    div-int/2addr p0, p1

    .line 47
    new-array p1, p0, [I

    .line 48
    .line 49
    new-array v6, p0, [I

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    :goto_0
    if-ge v7, p0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v4, v0}, Lv5/t;->g(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-virtual {v4, v3}, Lv5/t;->g(I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    aput v8, p1, v7

    .line 63
    .line 64
    aput v9, v6, v7

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance p0, Lu4/j;

    .line 70
    .line 71
    move-object v0, p0

    .line 72
    move-object v3, p1

    .line 73
    move-object v4, v6

    .line 74
    invoke-direct/range {v0 .. v5}, Lu4/j;-><init>(II[I[II)V

    .line 75
    .line 76
    .line 77
    return-object p0
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

.method public static K([BIILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    if-le p2, p1, :cond_1

    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static L([BII)Lo7/l0;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    invoke-static {v1}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 12
    .line 13
    new-instance v0, Lo7/t$a;

    .line 14
    .line 15
    invoke-direct {v0}, Lo7/t$a;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {p0, p2, p1}, Lu4/g;->P([BII)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge p2, v2, :cond_1

    .line 23
    .line 24
    new-instance v3, Ljava/lang/String;

    .line 25
    .line 26
    sub-int v4, v2, p2

    .line 27
    .line 28
    invoke-static {p1}, Lu4/g;->N(I)Ljava/nio/charset/Charset;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-direct {v3, p0, p2, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lu4/g;->M(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    add-int/2addr p2, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lo7/t$a;->e()Lo7/l0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-static {v1}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_2
    return-object p0
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public static M(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static N(I)Ljava/nio/charset/Charset;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Ln7/d;->b:Ljava/nio/charset/Charset;

    return-object p0

    :cond_0
    sget-object p0, Ln7/d;->c:Ljava/nio/charset/Charset;

    return-object p0

    :cond_1
    sget-object p0, Ln7/d;->d:Ljava/nio/charset/Charset;

    return-object p0

    :cond_2
    sget-object p0, Ln7/d;->f:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static O(IIIII)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne p0, v3, :cond_0

    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "%c%c%c"

    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v0

    const-string p1, "%c%c%c%c"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static P([BII)I
    .locals 2

    invoke-static {p0, p1}, Lu4/g;->Q([BI)I

    move-result v0

    if-eqz p2, :cond_3

    const/4 v1, 0x3

    if-ne p2, v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    if-ge v0, p2, :cond_2

    sub-int p2, v0, p1

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p0, p2

    if-nez p2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lu4/g;->Q([BI)I

    move-result v0

    goto :goto_0

    :cond_2
    array-length p0, p0

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static Q([BI)I
    .locals 1

    :goto_0
    array-length v0, p0

    if-ge p1, v0, :cond_1

    aget-byte v0, p0, p1

    if-nez v0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    array-length p0, p0

    return p0
.end method

.method public static R(ILv5/u;)I
    .locals 5

    .line 1
    iget-object v0, p1, Lv5/u;->a:[B

    .line 2
    .line 3
    iget p1, p1, Lv5/u;->b:I

    .line 4
    .line 5
    move v1, p1

    .line 6
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    add-int v3, p1, p0

    .line 9
    .line 10
    if-ge v2, v3, :cond_1

    .line 11
    .line 12
    aget-byte v3, v0, v1

    .line 13
    .line 14
    const/16 v4, 0xff

    .line 15
    .line 16
    and-int/2addr v3, v4

    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    aget-byte v3, v0, v2

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    sub-int v3, v1, p1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    sub-int v3, p0, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, -0x2

    .line 30
    .line 31
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 p0, p0, -0x1

    .line 35
    .line 36
    :cond_0
    move v1, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return p0
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

.method public static S(Lv5/u;IIZ)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lv5/u;->b:I

    .line 6
    .line 7
    :goto_0
    :try_start_0
    iget v3, v1, Lv5/u;->c:I

    .line 8
    .line 9
    iget v4, v1, Lv5/u;->b:I

    .line 10
    .line 11
    sub-int/2addr v3, v4

    .line 12
    const/4 v4, 0x1

    .line 13
    move/from16 v5, p2

    .line 14
    .line 15
    if-lt v3, v5, :cond_c

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    const/4 v6, 0x0

    .line 19
    if-lt v0, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Lv5/u;->f()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-virtual/range {p0 .. p0}, Lv5/u;->w()J

    .line 26
    .line 27
    .line 28
    move-result-wide v8

    .line 29
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lv5/u;->x()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual/range {p0 .. p0}, Lv5/u;->x()I

    .line 39
    .line 40
    .line 41
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    int-to-long v8, v8

    .line 43
    move v10, v6

    .line 44
    :goto_1
    const-wide/16 v11, 0x0

    .line 45
    .line 46
    if-nez v7, :cond_1

    .line 47
    .line 48
    cmp-long v7, v8, v11

    .line 49
    .line 50
    if-nez v7, :cond_1

    .line 51
    .line 52
    if-nez v10, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 55
    .line 56
    .line 57
    return v4

    .line 58
    :cond_1
    const/4 v7, 0x4

    .line 59
    if-ne v0, v7, :cond_3

    .line 60
    .line 61
    if-nez p3, :cond_3

    .line 62
    .line 63
    const-wide/32 v13, 0x808080

    .line 64
    .line 65
    .line 66
    and-long/2addr v13, v8

    .line 67
    cmp-long v11, v13, v11

    .line 68
    .line 69
    if-eqz v11, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 72
    .line 73
    .line 74
    return v6

    .line 75
    :cond_2
    const-wide/16 v11, 0xff

    .line 76
    .line 77
    and-long v13, v8, v11

    .line 78
    .line 79
    const/16 v15, 0x8

    .line 80
    .line 81
    shr-long v15, v8, v15

    .line 82
    .line 83
    and-long/2addr v15, v11

    .line 84
    const/16 v17, 0x7

    .line 85
    .line 86
    shl-long v15, v15, v17

    .line 87
    .line 88
    or-long/2addr v13, v15

    .line 89
    const/16 v15, 0x10

    .line 90
    .line 91
    shr-long v15, v8, v15

    .line 92
    .line 93
    and-long/2addr v15, v11

    .line 94
    const/16 v17, 0xe

    .line 95
    .line 96
    shl-long v15, v15, v17

    .line 97
    .line 98
    or-long/2addr v13, v15

    .line 99
    const/16 v15, 0x18

    .line 100
    .line 101
    shr-long/2addr v8, v15

    .line 102
    and-long/2addr v8, v11

    .line 103
    const/16 v11, 0x15

    .line 104
    .line 105
    shl-long/2addr v8, v11

    .line 106
    or-long/2addr v8, v13

    .line 107
    :cond_3
    if-ne v0, v7, :cond_5

    .line 108
    .line 109
    and-int/lit8 v3, v10, 0x40

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    move v3, v4

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move v3, v6

    .line 116
    :goto_2
    and-int/lit8 v7, v10, 0x1

    .line 117
    .line 118
    if-eqz v7, :cond_7

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    if-ne v0, v3, :cond_8

    .line 122
    .line 123
    and-int/lit8 v3, v10, 0x20

    .line 124
    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    move v3, v4

    .line 128
    goto :goto_3

    .line 129
    :cond_6
    move v3, v6

    .line 130
    :goto_3
    and-int/lit16 v7, v10, 0x80

    .line 131
    .line 132
    if-eqz v7, :cond_7

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    move v4, v6

    .line 136
    goto :goto_4

    .line 137
    :cond_8
    move v3, v6

    .line 138
    move v4, v3

    .line 139
    :goto_4
    if-eqz v4, :cond_9

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x4

    .line 142
    .line 143
    :cond_9
    int-to-long v3, v3

    .line 144
    cmp-long v3, v8, v3

    .line 145
    .line 146
    if-gez v3, :cond_a

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 149
    .line 150
    .line 151
    return v6

    .line 152
    :cond_a
    :try_start_1
    iget v3, v1, Lv5/u;->c:I

    .line 153
    .line 154
    iget v4, v1, Lv5/u;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    .line 156
    sub-int/2addr v3, v4

    .line 157
    int-to-long v3, v3

    .line 158
    cmp-long v3, v3, v8

    .line 159
    .line 160
    if-gez v3, :cond_b

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 163
    .line 164
    .line 165
    return v6

    .line 166
    :cond_b
    long-to-int v3, v8

    .line 167
    :try_start_2
    invoke-virtual {v1, v3}, Lv5/u;->H(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_c
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 173
    .line 174
    .line 175
    return v4

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 178
    .line 179
    .line 180
    throw v0
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
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
.end method


# virtual methods
.method public final C([BI)Lp4/a;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lv5/u;

    .line 7
    .line 8
    invoke-direct {v1, p1, p2}, Lv5/u;-><init>([BI)V

    .line 9
    .line 10
    .line 11
    iget p1, v1, Lv5/u;->c:I

    .line 12
    .line 13
    iget p2, v1, Lv5/u;->b:I

    .line 14
    .line 15
    sub-int/2addr p1, p2

    .line 16
    const/4 p2, 0x2

    .line 17
    const-string v2, "Id3Decoder"

    .line 18
    .line 19
    const/16 v3, 0xa

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v5, 0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    if-ge p1, v3, :cond_0

    .line 26
    .line 27
    const-string p1, "Data too short to be an ID3 tag"

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, Lv5/u;->x()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const v8, 0x494433

    .line 36
    .line 37
    .line 38
    if-eq p1, v8, :cond_1

    .line 39
    .line 40
    const-string v8, "Unexpected first three bytes of ID3 tag header: 0x"

    .line 41
    .line 42
    invoke-static {v8}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    new-array v9, v5, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    aput-object p1, v9, v6

    .line 53
    .line 54
    const-string p1, "%06X"

    .line 55
    .line 56
    invoke-static {p1, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_1
    invoke-virtual {v1}, Lv5/u;->v()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v1, v5}, Lv5/u;->H(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lv5/u;->v()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    invoke-virtual {v1}, Lv5/u;->u()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-ne p1, p2, :cond_3

    .line 81
    .line 82
    and-int/lit8 v10, v8, 0x40

    .line 83
    .line 84
    if-eqz v10, :cond_2

    .line 85
    .line 86
    move v10, v5

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move v10, v6

    .line 89
    :goto_0
    if-eqz v10, :cond_9

    .line 90
    .line 91
    const-string p1, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_3
    const/4 v10, 0x3

    .line 95
    if-ne p1, v10, :cond_5

    .line 96
    .line 97
    and-int/lit8 v10, v8, 0x40

    .line 98
    .line 99
    if-eqz v10, :cond_4

    .line 100
    .line 101
    move v10, v5

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v10, v6

    .line 104
    :goto_1
    if-eqz v10, :cond_9

    .line 105
    .line 106
    invoke-virtual {v1}, Lv5/u;->f()I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    invoke-virtual {v1, v10}, Lv5/u;->H(I)V

    .line 111
    .line 112
    .line 113
    add-int/2addr v10, v4

    .line 114
    sub-int/2addr v9, v10

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    if-ne p1, v4, :cond_b

    .line 117
    .line 118
    and-int/lit8 v10, v8, 0x40

    .line 119
    .line 120
    if-eqz v10, :cond_6

    .line 121
    .line 122
    move v10, v5

    .line 123
    goto :goto_2

    .line 124
    :cond_6
    move v10, v6

    .line 125
    :goto_2
    if-eqz v10, :cond_7

    .line 126
    .line 127
    invoke-virtual {v1}, Lv5/u;->u()I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    add-int/lit8 v11, v10, -0x4

    .line 132
    .line 133
    invoke-virtual {v1, v11}, Lv5/u;->H(I)V

    .line 134
    .line 135
    .line 136
    sub-int/2addr v9, v10

    .line 137
    :cond_7
    and-int/lit8 v10, v8, 0x10

    .line 138
    .line 139
    if-eqz v10, :cond_8

    .line 140
    .line 141
    move v10, v5

    .line 142
    goto :goto_3

    .line 143
    :cond_8
    move v10, v6

    .line 144
    :goto_3
    if-eqz v10, :cond_9

    .line 145
    .line 146
    add-int/lit8 v9, v9, -0xa

    .line 147
    .line 148
    :cond_9
    :goto_4
    if-ge p1, v4, :cond_a

    .line 149
    .line 150
    and-int/lit16 v8, v8, 0x80

    .line 151
    .line 152
    if-eqz v8, :cond_a

    .line 153
    .line 154
    move v8, v5

    .line 155
    goto :goto_5

    .line 156
    :cond_a
    move v8, v6

    .line 157
    :goto_5
    new-instance v10, Lu4/g$b;

    .line 158
    .line 159
    invoke-direct {v10, p1, v9, v8}, Lu4/g$b;-><init>(IIZ)V

    .line 160
    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_b
    new-instance v8, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v9, "Skipped ID3 tag with unsupported majorVersion="

    .line 169
    .line 170
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    :goto_6
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    :goto_7
    invoke-static {v2, p1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    move-object v10, v7

    .line 184
    :goto_8
    if-nez v10, :cond_c

    .line 185
    .line 186
    return-object v7

    .line 187
    :cond_c
    iget p1, v1, Lv5/u;->b:I

    .line 188
    .line 189
    iget v8, v10, Lu4/g$b;->a:I

    .line 190
    .line 191
    if-ne v8, p2, :cond_d

    .line 192
    .line 193
    const/4 v3, 0x6

    .line 194
    :cond_d
    iget p2, v10, Lu4/g$b;->c:I

    .line 195
    .line 196
    iget-boolean v8, v10, Lu4/g$b;->b:Z

    .line 197
    .line 198
    if-eqz v8, :cond_e

    .line 199
    .line 200
    invoke-static {p2, v1}, Lu4/g;->R(ILv5/u;)I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    :cond_e
    add-int/2addr p1, p2

    .line 205
    invoke-virtual {v1, p1}, Lv5/u;->F(I)V

    .line 206
    .line 207
    .line 208
    iget p1, v10, Lu4/g$b;->a:I

    .line 209
    .line 210
    invoke-static {v1, p1, v3, v6}, Lu4/g;->S(Lv5/u;IIZ)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-nez p1, :cond_10

    .line 215
    .line 216
    iget p1, v10, Lu4/g$b;->a:I

    .line 217
    .line 218
    if-ne p1, v4, :cond_f

    .line 219
    .line 220
    invoke-static {v1, v4, v3, v5}, Lu4/g;->S(Lv5/u;IIZ)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_f

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_f
    const-string p1, "Failed to validate ID3 tag with majorVersion="

    .line 228
    .line 229
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iget p2, v10, Lu4/g$b;->a:I

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-static {v2, p1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v7

    .line 246
    :cond_10
    move v5, v6

    .line 247
    :cond_11
    :goto_9
    iget p1, v1, Lv5/u;->c:I

    .line 248
    .line 249
    iget p2, v1, Lv5/u;->b:I

    .line 250
    .line 251
    sub-int/2addr p1, p2

    .line 252
    if-lt p1, v3, :cond_12

    .line 253
    .line 254
    iget p1, v10, Lu4/g$b;->a:I

    .line 255
    .line 256
    iget-object p2, p0, Lu4/g;->b:Lu4/g$a;

    .line 257
    .line 258
    invoke-static {p1, v1, v5, v3, p2}, Lu4/g;->H(ILv5/u;ZILu4/g$a;)Lu4/h;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    if-eqz p1, :cond_11

    .line 263
    .line 264
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_12
    new-instance p1, Lp4/a;

    .line 269
    .line 270
    invoke-direct {p1, v0}, Lp4/a;-><init>(Ljava/util/List;)V

    .line 271
    .line 272
    .line 273
    return-object p1
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
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
.end method

.method public final i(Lp4/d;Ljava/nio/ByteBuffer;)Lp4/a;
    .locals 0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu4/g;->C([BI)Lp4/a;

    move-result-object p1

    return-object p1
.end method
