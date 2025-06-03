.class public final Lm4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# instance fields
.field public final a:Lv5/t;

.field public final b:Lv5/u;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lc4/v;

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:J

.field public k:Lv3/i0;

.field public l:I

.field public m:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv5/t;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Lv5/t;-><init>([BI)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lm4/d;->a:Lv5/t;

    .line 14
    .line 15
    new-instance v1, Lv5/u;

    .line 16
    .line 17
    iget-object v0, v0, Lv5/t;->a:[B

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lv5/u;-><init>([B)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lm4/d;->b:Lv5/u;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lm4/d;->f:I

    .line 26
    .line 27
    iput v0, p0, Lm4/d;->g:I

    .line 28
    .line 29
    iput-boolean v0, p0, Lm4/d;->h:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lm4/d;->i:Z

    .line 32
    .line 33
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lm4/d;->m:J

    .line 39
    .line 40
    iput-object p1, p0, Lm4/d;->c:Ljava/lang/String;

    .line 41
    .line 42
    return-void
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
    .locals 12

    .line 1
    iget-object v0, p0, Lm4/d;->e:Lc4/v;

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    iget v0, p1, Lv5/u;->c:I

    .line 7
    .line 8
    iget v1, p1, Lv5/u;->b:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    if-lez v0, :cond_f

    .line 12
    .line 13
    iget v1, p0, Lm4/d;->f:I

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    if-eq v1, v3, :cond_3

    .line 21
    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v1, p0, Lm4/d;->l:I

    .line 26
    .line 27
    iget v2, p0, Lm4/d;->g:I

    .line 28
    .line 29
    sub-int/2addr v1, v2

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lm4/d;->e:Lc4/v;

    .line 35
    .line 36
    invoke-interface {v1, v0, p1}, Lc4/v;->b(ILv5/u;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lm4/d;->g:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    iput v1, p0, Lm4/d;->g:I

    .line 43
    .line 44
    iget v9, p0, Lm4/d;->l:I

    .line 45
    .line 46
    if-ne v1, v9, :cond_0

    .line 47
    .line 48
    iget-wide v6, p0, Lm4/d;->m:J

    .line 49
    .line 50
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    cmp-long v0, v6, v0

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v5, p0, Lm4/d;->e:Lc4/v;

    .line 60
    .line 61
    const/4 v8, 0x1

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    invoke-interface/range {v5 .. v11}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 65
    .line 66
    .line 67
    iget-wide v0, p0, Lm4/d;->m:J

    .line 68
    .line 69
    iget-wide v2, p0, Lm4/d;->j:J

    .line 70
    .line 71
    add-long/2addr v0, v2

    .line 72
    iput-wide v0, p0, Lm4/d;->m:J

    .line 73
    .line 74
    :cond_2
    iput v4, p0, Lm4/d;->f:I

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-object v1, p0, Lm4/d;->b:Lv5/u;

    .line 78
    .line 79
    iget-object v1, v1, Lv5/u;->a:[B

    .line 80
    .line 81
    iget v5, p0, Lm4/d;->g:I

    .line 82
    .line 83
    const/16 v6, 0x10

    .line 84
    .line 85
    rsub-int/lit8 v5, v5, 0x10

    .line 86
    .line 87
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget v5, p0, Lm4/d;->g:I

    .line 92
    .line 93
    invoke-virtual {p1, v1, v5, v0}, Lv5/u;->d([BII)V

    .line 94
    .line 95
    .line 96
    iget v1, p0, Lm4/d;->g:I

    .line 97
    .line 98
    add-int/2addr v1, v0

    .line 99
    iput v1, p0, Lm4/d;->g:I

    .line 100
    .line 101
    if-ne v1, v6, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    move v3, v4

    .line 105
    :goto_1
    if-eqz v3, :cond_0

    .line 106
    .line 107
    iget-object v0, p0, Lm4/d;->a:Lv5/t;

    .line 108
    .line 109
    invoke-virtual {v0, v4}, Lv5/t;->k(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lm4/d;->a:Lv5/t;

    .line 113
    .line 114
    invoke-static {v0}, Lx3/c;->b(Lv5/t;)Lx3/c$a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, p0, Lm4/d;->k:Lv3/i0;

    .line 119
    .line 120
    const-string v3, "audio/ac4"

    .line 121
    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    iget v5, v1, Lv3/i0;->G:I

    .line 125
    .line 126
    if-ne v2, v5, :cond_5

    .line 127
    .line 128
    iget v5, v0, Lx3/c$a;->a:I

    .line 129
    .line 130
    iget v7, v1, Lv3/i0;->H:I

    .line 131
    .line 132
    if-ne v5, v7, :cond_5

    .line 133
    .line 134
    iget-object v1, v1, Lv3/i0;->t:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_6

    .line 141
    .line 142
    :cond_5
    new-instance v1, Lv3/i0$a;

    .line 143
    .line 144
    invoke-direct {v1}, Lv3/i0$a;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v5, p0, Lm4/d;->d:Ljava/lang/String;

    .line 148
    .line 149
    iput-object v5, v1, Lv3/i0$a;->a:Ljava/lang/String;

    .line 150
    .line 151
    iput-object v3, v1, Lv3/i0$a;->k:Ljava/lang/String;

    .line 152
    .line 153
    iput v2, v1, Lv3/i0$a;->x:I

    .line 154
    .line 155
    iget v3, v0, Lx3/c$a;->a:I

    .line 156
    .line 157
    iput v3, v1, Lv3/i0$a;->y:I

    .line 158
    .line 159
    iget-object v3, p0, Lm4/d;->c:Ljava/lang/String;

    .line 160
    .line 161
    iput-object v3, v1, Lv3/i0$a;->c:Ljava/lang/String;

    .line 162
    .line 163
    new-instance v3, Lv3/i0;

    .line 164
    .line 165
    invoke-direct {v3, v1}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 166
    .line 167
    .line 168
    iput-object v3, p0, Lm4/d;->k:Lv3/i0;

    .line 169
    .line 170
    iget-object v1, p0, Lm4/d;->e:Lc4/v;

    .line 171
    .line 172
    invoke-interface {v1, v3}, Lc4/v;->d(Lv3/i0;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    iget v1, v0, Lx3/c$a;->b:I

    .line 176
    .line 177
    iput v1, p0, Lm4/d;->l:I

    .line 178
    .line 179
    const-wide/32 v7, 0xf4240

    .line 180
    .line 181
    .line 182
    iget v0, v0, Lx3/c$a;->c:I

    .line 183
    .line 184
    int-to-long v0, v0

    .line 185
    mul-long/2addr v0, v7

    .line 186
    iget-object v3, p0, Lm4/d;->k:Lv3/i0;

    .line 187
    .line 188
    iget v3, v3, Lv3/i0;->H:I

    .line 189
    .line 190
    int-to-long v7, v3

    .line 191
    div-long/2addr v0, v7

    .line 192
    iput-wide v0, p0, Lm4/d;->j:J

    .line 193
    .line 194
    iget-object v0, p0, Lm4/d;->b:Lv5/u;

    .line 195
    .line 196
    invoke-virtual {v0, v4}, Lv5/u;->G(I)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lm4/d;->e:Lc4/v;

    .line 200
    .line 201
    iget-object v1, p0, Lm4/d;->b:Lv5/u;

    .line 202
    .line 203
    invoke-interface {v0, v6, v1}, Lc4/v;->b(ILv5/u;)V

    .line 204
    .line 205
    .line 206
    iput v2, p0, Lm4/d;->f:I

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_7
    :goto_2
    iget v0, p1, Lv5/u;->c:I

    .line 211
    .line 212
    iget v1, p1, Lv5/u;->b:I

    .line 213
    .line 214
    sub-int/2addr v0, v1

    .line 215
    const/16 v1, 0x41

    .line 216
    .line 217
    const/16 v5, 0x40

    .line 218
    .line 219
    if-lez v0, :cond_d

    .line 220
    .line 221
    iget-boolean v0, p0, Lm4/d;->h:Z

    .line 222
    .line 223
    const/16 v6, 0xac

    .line 224
    .line 225
    if-nez v0, :cond_9

    .line 226
    .line 227
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-ne v0, v6, :cond_8

    .line 232
    .line 233
    move v0, v3

    .line 234
    goto :goto_3

    .line 235
    :cond_8
    move v0, v4

    .line 236
    :goto_3
    iput-boolean v0, p0, Lm4/d;->h:Z

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_9
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-ne v0, v6, :cond_a

    .line 244
    .line 245
    move v6, v3

    .line 246
    goto :goto_4

    .line 247
    :cond_a
    move v6, v4

    .line 248
    :goto_4
    iput-boolean v6, p0, Lm4/d;->h:Z

    .line 249
    .line 250
    if-eq v0, v5, :cond_b

    .line 251
    .line 252
    if-ne v0, v1, :cond_7

    .line 253
    .line 254
    :cond_b
    if-ne v0, v1, :cond_c

    .line 255
    .line 256
    move v0, v3

    .line 257
    goto :goto_5

    .line 258
    :cond_c
    move v0, v4

    .line 259
    :goto_5
    iput-boolean v0, p0, Lm4/d;->i:Z

    .line 260
    .line 261
    move v0, v3

    .line 262
    goto :goto_6

    .line 263
    :cond_d
    move v0, v4

    .line 264
    :goto_6
    if-eqz v0, :cond_0

    .line 265
    .line 266
    iput v3, p0, Lm4/d;->f:I

    .line 267
    .line 268
    iget-object v0, p0, Lm4/d;->b:Lv5/u;

    .line 269
    .line 270
    iget-object v0, v0, Lv5/u;->a:[B

    .line 271
    .line 272
    const/16 v6, -0x54

    .line 273
    .line 274
    aput-byte v6, v0, v4

    .line 275
    .line 276
    iget-boolean v4, p0, Lm4/d;->i:Z

    .line 277
    .line 278
    if-eqz v4, :cond_e

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_e
    move v1, v5

    .line 282
    :goto_7
    int-to-byte v1, v1

    .line 283
    aput-byte v1, v0, v3

    .line 284
    .line 285
    iput v2, p0, Lm4/d;->g:I

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_f
    return-void
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
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lm4/d;->f:I

    iput v0, p0, Lm4/d;->g:I

    iput-boolean v0, p0, Lm4/d;->h:Z

    iput-boolean v0, p0, Lm4/d;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/d;->m:J

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

    iput-wide p2, p0, Lm4/d;->m:J

    :cond_0
    return-void
.end method

.method public final e(Lc4/j;Lm4/d0$d;)V
    .locals 1

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
    iput-object v0, p0, Lm4/d;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, Lm4/d0$d;->d:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Lc4/j;->r(II)Lc4/v;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lm4/d;->e:Lc4/v;

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
