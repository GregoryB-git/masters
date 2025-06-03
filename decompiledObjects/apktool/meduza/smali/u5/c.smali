.class public final Lu5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu5/c$a;
    }
.end annotation


# instance fields
.field public final a:Lu5/a;

.field public final b:Lt5/k;

.field public final c:Lt5/k0;

.field public final d:Lt5/k;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public h:Landroid/net/Uri;

.field public i:Lt5/n;

.field public j:Lt5/n;

.field public k:Lt5/k;

.field public l:J

.field public m:J

.field public n:J

.field public o:Lu5/g;

.field public p:Z

.field public q:Z

.field public r:J

.field public s:J


# direct methods
.method public constructor <init>(Lu5/q;Lt5/r;Lt5/v;Lu5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/c;->a:Lu5/a;

    iput-object p3, p0, Lu5/c;->b:Lt5/k;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu5/c;->e:Z

    iput-boolean p1, p0, Lu5/c;->f:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu5/c;->g:Z

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    iput-object p2, p0, Lu5/c;->d:Lt5/k;

    new-instance p1, Lt5/k0;

    invoke-direct {p1, p2, p4}, Lt5/k0;-><init>(Lt5/k;Lu5/b;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lt5/g0;->a:Lt5/g0;

    iput-object p2, p0, Lu5/c;->d:Lt5/k;

    :goto_0
    iput-object p1, p0, Lu5/c;->c:Lt5/k0;

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v0, Lt5/n;->h:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v2, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    iget-object v4, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 17
    .line 18
    iget-wide v5, v0, Lt5/n;->b:J

    .line 19
    .line 20
    iget v7, v0, Lt5/n;->c:I

    .line 21
    .line 22
    iget-object v8, v0, Lt5/n;->d:[B

    .line 23
    .line 24
    iget-object v9, v0, Lt5/n;->e:Ljava/util/Map;

    .line 25
    .line 26
    iget-wide v10, v0, Lt5/n;->f:J

    .line 27
    .line 28
    iget-wide v12, v0, Lt5/n;->g:J

    .line 29
    .line 30
    iget v15, v0, Lt5/n;->i:I

    .line 31
    .line 32
    iget-object v14, v0, Lt5/n;->j:Ljava/lang/Object;

    .line 33
    .line 34
    if-eqz v4, :cond_f

    .line 35
    .line 36
    new-instance v3, Lt5/n;

    .line 37
    .line 38
    move-object/from16 v17, v3

    .line 39
    .line 40
    move-object/from16 v3, v17

    .line 41
    .line 42
    move-object/from16 v16, v14

    .line 43
    .line 44
    move-object v14, v2

    .line 45
    invoke-direct/range {v3 .. v16}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, v1, Lu5/c;->i:Lt5/n;

    .line 49
    .line 50
    iget-object v4, v1, Lu5/c;->a:Lu5/a;

    .line 51
    .line 52
    iget-object v5, v3, Lt5/n;->a:Landroid/net/Uri;

    .line 53
    .line 54
    invoke-interface {v4, v2}, Lu5/a;->c(Ljava/lang/String;)Lu5/m;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget-object v4, v4, Lu5/m;->b:Ljava/util/Map;

    .line 59
    .line 60
    const-string v6, "exo_redir"

    .line 61
    .line 62
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, [B

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    new-instance v7, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v8, Ln7/d;->c:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    invoke-direct {v7, v4, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v7, v6

    .line 80
    :goto_1
    if-nez v7, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    :goto_2
    if-eqz v6, :cond_3

    .line 88
    .line 89
    move-object v5, v6

    .line 90
    :cond_3
    iput-object v5, v1, Lu5/c;->h:Landroid/net/Uri;

    .line 91
    .line 92
    iget-wide v4, v0, Lt5/n;->f:J

    .line 93
    .line 94
    iput-wide v4, v1, Lu5/c;->m:J

    .line 95
    .line 96
    iget-boolean v4, v1, Lu5/c;->f:Z

    .line 97
    .line 98
    const/4 v5, -0x1

    .line 99
    const-wide/16 v6, -0x1

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    iget-boolean v4, v1, Lu5/c;->p:Z

    .line 104
    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    iget-boolean v4, v1, Lu5/c;->g:Z

    .line 110
    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    iget-wide v8, v0, Lt5/n;->g:J

    .line 114
    .line 115
    cmp-long v4, v8, v6

    .line 116
    .line 117
    if-nez v4, :cond_5

    .line 118
    .line 119
    const/4 v4, 0x1

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move v4, v5

    .line 122
    :goto_3
    if-eq v4, v5, :cond_6

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    goto :goto_4

    .line 126
    :cond_6
    const/4 v4, 0x0

    .line 127
    :goto_4
    iput-boolean v4, v1, Lu5/c;->q:Z

    .line 128
    .line 129
    iget-boolean v4, v1, Lu5/c;->q:Z

    .line 130
    .line 131
    const-wide/16 v8, 0x0

    .line 132
    .line 133
    if-eqz v4, :cond_7

    .line 134
    .line 135
    iput-wide v6, v1, Lu5/c;->n:J

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    iget-object v4, v1, Lu5/c;->a:Lu5/a;

    .line 139
    .line 140
    invoke-interface {v4, v2}, Lu5/a;->c(Ljava/lang/String;)Lu5/m;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {v2}, Lf;->d(Lu5/k;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    iput-wide v4, v1, Lu5/c;->n:J

    .line 149
    .line 150
    cmp-long v2, v4, v6

    .line 151
    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    iget-wide v10, v0, Lt5/n;->f:J

    .line 155
    .line 156
    sub-long/2addr v4, v10

    .line 157
    iput-wide v4, v1, Lu5/c;->n:J

    .line 158
    .line 159
    cmp-long v2, v4, v8

    .line 160
    .line 161
    if-ltz v2, :cond_8

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_8
    new-instance v0, Lt5/l;

    .line 165
    .line 166
    const/16 v2, 0x7d8

    .line 167
    .line 168
    invoke-direct {v0, v2}, Lt5/l;-><init>(I)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_9
    :goto_5
    iget-wide v4, v0, Lt5/n;->g:J

    .line 173
    .line 174
    cmp-long v2, v4, v6

    .line 175
    .line 176
    if-eqz v2, :cond_b

    .line 177
    .line 178
    iget-wide v10, v1, Lu5/c;->n:J

    .line 179
    .line 180
    cmp-long v2, v10, v6

    .line 181
    .line 182
    if-nez v2, :cond_a

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v4

    .line 189
    :goto_6
    iput-wide v4, v1, Lu5/c;->n:J

    .line 190
    .line 191
    :cond_b
    iget-wide v4, v1, Lu5/c;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 192
    .line 193
    cmp-long v2, v4, v8

    .line 194
    .line 195
    if-gtz v2, :cond_d

    .line 196
    .line 197
    cmp-long v2, v4, v6

    .line 198
    .line 199
    if-nez v2, :cond_c

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_c
    const/4 v2, 0x0

    .line 203
    goto :goto_8

    .line 204
    :cond_d
    :goto_7
    const/4 v2, 0x0

    .line 205
    :try_start_1
    invoke-virtual {v1, v3, v2}, Lu5/c;->p(Lt5/n;Z)V

    .line 206
    .line 207
    .line 208
    :goto_8
    iget-wide v3, v0, Lt5/n;->g:J

    .line 209
    .line 210
    cmp-long v0, v3, v6

    .line 211
    .line 212
    if-eqz v0, :cond_e

    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_e
    iget-wide v3, v1, Lu5/c;->n:J

    .line 216
    .line 217
    :goto_9
    return-wide v3

    .line 218
    :cond_f
    const/4 v2, 0x0

    .line 219
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 220
    .line 221
    const-string v3, "The uri must be set."

    .line 222
    .line 223
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    goto :goto_a

    .line 229
    :catchall_1
    move-exception v0

    .line 230
    const/4 v2, 0x0

    .line 231
    :goto_a
    iget-object v3, v1, Lu5/c;->k:Lt5/k;

    .line 232
    .line 233
    iget-object v4, v1, Lu5/c;->b:Lt5/k;

    .line 234
    .line 235
    if-ne v3, v4, :cond_10

    .line 236
    .line 237
    const/4 v2, 0x1

    .line 238
    :cond_10
    if-nez v2, :cond_11

    .line 239
    .line 240
    instance-of v2, v0, Lu5/a$a;

    .line 241
    .line 242
    if-eqz v2, :cond_12

    .line 243
    .line 244
    :cond_11
    const/4 v2, 0x1

    .line 245
    iput-boolean v2, v1, Lu5/c;->p:Z

    .line 246
    .line 247
    :cond_12
    throw v0
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
.end method

.method public final close()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lu5/c;->i:Lt5/n;

    .line 3
    .line 4
    iput-object v0, p0, Lu5/c;->h:Landroid/net/Uri;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lu5/c;->m:J

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lu5/c;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    iget-object v1, p0, Lu5/c;->k:Lt5/k;

    .line 16
    .line 17
    iget-object v2, p0, Lu5/c;->b:Lt5/k;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-nez v1, :cond_1

    .line 26
    .line 27
    instance-of v1, v0, Lu5/a$a;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    iput-boolean v3, p0, Lu5/c;->p:Z

    .line 32
    .line 33
    :cond_2
    throw v0
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
.end method

.method public final f(Lt5/l0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/c;->b:Lt5/k;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lt5/k;->f(Lt5/l0;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lu5/c;->d:Lt5/k;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lt5/k;->f(Lt5/l0;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method public final h()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lu5/c;->k:Lt5/k;

    .line 2
    .line 3
    iget-object v1, p0, Lu5/c;->b:Lt5/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    xor-int/2addr v0, v2

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lu5/c;->d:Lt5/k;

    .line 15
    .line 16
    invoke-interface {v0}, Lt5/k;->h()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_1
    return-object v0
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
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lu5/c;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public final o()V
    .locals 4

    iget-object v0, p0, Lu5/c;->k:Lt5/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lt5/k;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lu5/c;->j:Lt5/n;

    iput-object v1, p0, Lu5/c;->k:Lt5/k;

    iget-object v0, p0, Lu5/c;->o:Lu5/g;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lu5/c;->a:Lu5/a;

    invoke-interface {v2, v0}, Lu5/a;->b(Lu5/g;)V

    iput-object v1, p0, Lu5/c;->o:Lu5/g;

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lu5/c;->j:Lt5/n;

    iput-object v1, p0, Lu5/c;->k:Lt5/k;

    iget-object v2, p0, Lu5/c;->o:Lu5/g;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu5/c;->a:Lu5/a;

    invoke-interface {v3, v2}, Lu5/a;->b(Lu5/g;)V

    iput-object v1, p0, Lu5/c;->o:Lu5/g;

    :cond_2
    throw v0
.end method

.method public final p(Lt5/n;Z)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v8, v0, Lt5/n;->h:Ljava/lang/String;

    .line 6
    .line 7
    sget v2, Lv5/e0;->a:I

    .line 8
    .line 9
    iget-boolean v2, v1, Lu5/c;->q:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean v2, v1, Lu5/c;->e:Z

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-object v2, v1, Lu5/c;->a:Lu5/a;

    .line 20
    .line 21
    iget-wide v3, v1, Lu5/c;->m:J

    .line 22
    .line 23
    iget-wide v5, v1, Lu5/c;->n:J

    .line 24
    .line 25
    move-object v7, v8

    .line 26
    invoke-interface/range {v2 .. v7}, Lu5/a;->k(JJLjava/lang/String;)Lu5/r;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    iget-object v2, v1, Lu5/c;->a:Lu5/a;

    .line 45
    .line 46
    iget-wide v3, v1, Lu5/c;->m:J

    .line 47
    .line 48
    iget-wide v5, v1, Lu5/c;->n:J

    .line 49
    .line 50
    move-object v7, v8

    .line 51
    invoke-interface/range {v2 .. v7}, Lu5/a;->a(JJLjava/lang/String;)Lu5/r;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_0
    const-string v5, "The uri must be set."

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    iget-object v10, v1, Lu5/c;->d:Lt5/k;

    .line 60
    .line 61
    iget-object v12, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 62
    .line 63
    iget-wide v13, v0, Lt5/n;->b:J

    .line 64
    .line 65
    iget v15, v0, Lt5/n;->c:I

    .line 66
    .line 67
    iget-object v11, v0, Lt5/n;->d:[B

    .line 68
    .line 69
    iget-object v7, v0, Lt5/n;->e:Ljava/util/Map;

    .line 70
    .line 71
    iget-object v9, v0, Lt5/n;->h:Ljava/lang/String;

    .line 72
    .line 73
    iget v6, v0, Lt5/n;->i:I

    .line 74
    .line 75
    iget-object v3, v0, Lt5/n;->j:Ljava/lang/Object;

    .line 76
    .line 77
    move-object/from16 v16, v5

    .line 78
    .line 79
    iget-wide v4, v1, Lu5/c;->m:J

    .line 80
    .line 81
    move-object/from16 v25, v2

    .line 82
    .line 83
    move-object/from16 v24, v3

    .line 84
    .line 85
    iget-wide v2, v1, Lu5/c;->n:J

    .line 86
    .line 87
    if-eqz v12, :cond_2

    .line 88
    .line 89
    new-instance v26, Lt5/n;

    .line 90
    .line 91
    move-object/from16 v16, v11

    .line 92
    .line 93
    move-object/from16 v11, v26

    .line 94
    .line 95
    move-object/from16 v17, v7

    .line 96
    .line 97
    move-wide/from16 v18, v4

    .line 98
    .line 99
    move-wide/from16 v20, v2

    .line 100
    .line 101
    move-object/from16 v22, v9

    .line 102
    .line 103
    move/from16 v23, v6

    .line 104
    .line 105
    invoke-direct/range {v11 .. v24}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v24, v8

    .line 109
    .line 110
    move-object/from16 v2, v25

    .line 111
    .line 112
    :goto_1
    move-object/from16 v3, v26

    .line 113
    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    move-object/from16 v2, v16

    .line 119
    .line 120
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_3
    move-object v9, v2

    .line 125
    move-object v2, v5

    .line 126
    iget-boolean v3, v9, Lu5/g;->d:Z

    .line 127
    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    iget-object v3, v9, Lu5/g;->e:Ljava/io/File;

    .line 131
    .line 132
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    iget-wide v12, v9, Lu5/g;->b:J

    .line 137
    .line 138
    iget-wide v3, v1, Lu5/c;->m:J

    .line 139
    .line 140
    sub-long v17, v3, v12

    .line 141
    .line 142
    iget-wide v3, v9, Lu5/g;->c:J

    .line 143
    .line 144
    sub-long v3, v3, v17

    .line 145
    .line 146
    iget-wide v5, v1, Lu5/c;->n:J

    .line 147
    .line 148
    const-wide/16 v14, -0x1

    .line 149
    .line 150
    cmp-long v7, v5, v14

    .line 151
    .line 152
    if-eqz v7, :cond_4

    .line 153
    .line 154
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    :cond_4
    move-wide/from16 v19, v3

    .line 159
    .line 160
    iget v14, v0, Lt5/n;->c:I

    .line 161
    .line 162
    iget-object v15, v0, Lt5/n;->d:[B

    .line 163
    .line 164
    iget-object v3, v0, Lt5/n;->e:Ljava/util/Map;

    .line 165
    .line 166
    iget-object v4, v0, Lt5/n;->h:Ljava/lang/String;

    .line 167
    .line 168
    iget v5, v0, Lt5/n;->i:I

    .line 169
    .line 170
    iget-object v6, v0, Lt5/n;->j:Ljava/lang/Object;

    .line 171
    .line 172
    if-eqz v11, :cond_5

    .line 173
    .line 174
    new-instance v26, Lt5/n;

    .line 175
    .line 176
    move-object/from16 v10, v26

    .line 177
    .line 178
    move-object/from16 v16, v3

    .line 179
    .line 180
    move-object/from16 v21, v4

    .line 181
    .line 182
    move/from16 v22, v5

    .line 183
    .line 184
    move-object/from16 v23, v6

    .line 185
    .line 186
    invoke-direct/range {v10 .. v23}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v10, v1, Lu5/c;->b:Lt5/k;

    .line 190
    .line 191
    move-object/from16 v24, v8

    .line 192
    .line 193
    :goto_2
    move-object v2, v9

    .line 194
    goto :goto_1

    .line 195
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 196
    .line 197
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_6
    iget-wide v3, v9, Lu5/g;->c:J

    .line 202
    .line 203
    const-wide/16 v5, -0x1

    .line 204
    .line 205
    cmp-long v7, v3, v5

    .line 206
    .line 207
    if-nez v7, :cond_7

    .line 208
    .line 209
    const/4 v7, 0x1

    .line 210
    goto :goto_3

    .line 211
    :cond_7
    const/4 v7, 0x0

    .line 212
    :goto_3
    if-eqz v7, :cond_8

    .line 213
    .line 214
    iget-wide v3, v1, Lu5/c;->n:J

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_8
    iget-wide v10, v1, Lu5/c;->n:J

    .line 218
    .line 219
    cmp-long v7, v10, v5

    .line 220
    .line 221
    if-eqz v7, :cond_9

    .line 222
    .line 223
    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 224
    .line 225
    .line 226
    move-result-wide v3

    .line 227
    :cond_9
    :goto_4
    move-wide/from16 v19, v3

    .line 228
    .line 229
    iget-object v11, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 230
    .line 231
    iget-wide v12, v0, Lt5/n;->b:J

    .line 232
    .line 233
    iget v14, v0, Lt5/n;->c:I

    .line 234
    .line 235
    iget-object v15, v0, Lt5/n;->d:[B

    .line 236
    .line 237
    iget-object v3, v0, Lt5/n;->e:Ljava/util/Map;

    .line 238
    .line 239
    iget-object v4, v0, Lt5/n;->h:Ljava/lang/String;

    .line 240
    .line 241
    iget v5, v0, Lt5/n;->i:I

    .line 242
    .line 243
    iget-object v6, v0, Lt5/n;->j:Ljava/lang/Object;

    .line 244
    .line 245
    move-object/from16 v24, v8

    .line 246
    .line 247
    iget-wide v7, v1, Lu5/c;->m:J

    .line 248
    .line 249
    if-eqz v11, :cond_18

    .line 250
    .line 251
    new-instance v26, Lt5/n;

    .line 252
    .line 253
    move-object/from16 v10, v26

    .line 254
    .line 255
    move-object/from16 v16, v3

    .line 256
    .line 257
    move-wide/from16 v17, v7

    .line 258
    .line 259
    move-object/from16 v21, v4

    .line 260
    .line 261
    move/from16 v22, v5

    .line 262
    .line 263
    move-object/from16 v23, v6

    .line 264
    .line 265
    invoke-direct/range {v10 .. v23}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    iget-object v10, v1, Lu5/c;->c:Lt5/k0;

    .line 269
    .line 270
    if-eqz v10, :cond_a

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_a
    iget-object v10, v1, Lu5/c;->d:Lt5/k;

    .line 274
    .line 275
    iget-object v2, v1, Lu5/c;->a:Lu5/a;

    .line 276
    .line 277
    invoke-interface {v2, v9}, Lu5/a;->b(Lu5/g;)V

    .line 278
    .line 279
    .line 280
    move-object/from16 v3, v26

    .line 281
    .line 282
    const/4 v2, 0x0

    .line 283
    :goto_5
    iget-boolean v4, v1, Lu5/c;->q:Z

    .line 284
    .line 285
    if-nez v4, :cond_b

    .line 286
    .line 287
    iget-object v4, v1, Lu5/c;->d:Lt5/k;

    .line 288
    .line 289
    if-ne v10, v4, :cond_b

    .line 290
    .line 291
    iget-wide v4, v1, Lu5/c;->m:J

    .line 292
    .line 293
    const-wide/32 v6, 0x19000

    .line 294
    .line 295
    .line 296
    add-long/2addr v4, v6

    .line 297
    goto :goto_6

    .line 298
    :cond_b
    const-wide v4, 0x7fffffffffffffffL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    :goto_6
    iput-wide v4, v1, Lu5/c;->s:J

    .line 304
    .line 305
    if-eqz p2, :cond_f

    .line 306
    .line 307
    iget-object v4, v1, Lu5/c;->k:Lt5/k;

    .line 308
    .line 309
    iget-object v5, v1, Lu5/c;->d:Lt5/k;

    .line 310
    .line 311
    if-ne v4, v5, :cond_c

    .line 312
    .line 313
    const/4 v4, 0x1

    .line 314
    goto :goto_7

    .line 315
    :cond_c
    const/4 v4, 0x0

    .line 316
    :goto_7
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 317
    .line 318
    .line 319
    iget-object v4, v1, Lu5/c;->d:Lt5/k;

    .line 320
    .line 321
    if-ne v10, v4, :cond_d

    .line 322
    .line 323
    return-void

    .line 324
    :cond_d
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lu5/c;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    .line 326
    .line 327
    goto :goto_8

    .line 328
    :catchall_0
    move-exception v0

    .line 329
    move-object v3, v0

    .line 330
    iget-boolean v0, v2, Lu5/g;->d:Z

    .line 331
    .line 332
    const/4 v4, 0x1

    .line 333
    xor-int/2addr v0, v4

    .line 334
    if-eqz v0, :cond_e

    .line 335
    .line 336
    iget-object v0, v1, Lu5/c;->a:Lu5/a;

    .line 337
    .line 338
    invoke-interface {v0, v2}, Lu5/a;->b(Lu5/g;)V

    .line 339
    .line 340
    .line 341
    :cond_e
    throw v3

    .line 342
    :cond_f
    :goto_8
    const/4 v4, 0x1

    .line 343
    if-eqz v2, :cond_10

    .line 344
    .line 345
    iget-boolean v5, v2, Lu5/g;->d:Z

    .line 346
    .line 347
    xor-int/2addr v5, v4

    .line 348
    if-eqz v5, :cond_10

    .line 349
    .line 350
    iput-object v2, v1, Lu5/c;->o:Lu5/g;

    .line 351
    .line 352
    :cond_10
    iput-object v10, v1, Lu5/c;->k:Lt5/k;

    .line 353
    .line 354
    iput-object v3, v1, Lu5/c;->j:Lt5/n;

    .line 355
    .line 356
    const-wide/16 v4, 0x0

    .line 357
    .line 358
    iput-wide v4, v1, Lu5/c;->l:J

    .line 359
    .line 360
    invoke-interface {v10, v3}, Lt5/k;->a(Lt5/n;)J

    .line 361
    .line 362
    .line 363
    move-result-wide v4

    .line 364
    new-instance v2, Lu5/l;

    .line 365
    .line 366
    invoke-direct {v2}, Lu5/l;-><init>()V

    .line 367
    .line 368
    .line 369
    iget-wide v6, v3, Lt5/n;->g:J

    .line 370
    .line 371
    const-wide/16 v8, -0x1

    .line 372
    .line 373
    cmp-long v3, v6, v8

    .line 374
    .line 375
    if-nez v3, :cond_11

    .line 376
    .line 377
    cmp-long v3, v4, v8

    .line 378
    .line 379
    if-eqz v3, :cond_11

    .line 380
    .line 381
    iput-wide v4, v1, Lu5/c;->n:J

    .line 382
    .line 383
    iget-wide v6, v1, Lu5/c;->m:J

    .line 384
    .line 385
    add-long/2addr v6, v4

    .line 386
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    iget-object v4, v2, Lu5/l;->a:Ljava/util/HashMap;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    const-string v5, "exo_len"

    .line 396
    .line 397
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    iget-object v3, v2, Lu5/l;->b:Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    :cond_11
    iget-object v3, v1, Lu5/c;->k:Lt5/k;

    .line 406
    .line 407
    iget-object v4, v1, Lu5/c;->b:Lt5/k;

    .line 408
    .line 409
    if-ne v3, v4, :cond_12

    .line 410
    .line 411
    const/4 v3, 0x1

    .line 412
    const/4 v4, 0x1

    .line 413
    goto :goto_9

    .line 414
    :cond_12
    const/4 v3, 0x1

    .line 415
    const/4 v4, 0x0

    .line 416
    :goto_9
    xor-int/2addr v4, v3

    .line 417
    if-eqz v4, :cond_15

    .line 418
    .line 419
    invoke-interface {v10}, Lt5/k;->l()Landroid/net/Uri;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    iput-object v4, v1, Lu5/c;->h:Landroid/net/Uri;

    .line 424
    .line 425
    iget-object v0, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 426
    .line 427
    invoke-virtual {v0, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    xor-int/2addr v0, v3

    .line 432
    if-eqz v0, :cond_13

    .line 433
    .line 434
    iget-object v9, v1, Lu5/c;->h:Landroid/net/Uri;

    .line 435
    .line 436
    goto :goto_a

    .line 437
    :cond_13
    const/4 v9, 0x0

    .line 438
    :goto_a
    const-string v0, "exo_redir"

    .line 439
    .line 440
    if-nez v9, :cond_14

    .line 441
    .line 442
    iget-object v4, v2, Lu5/l;->b:Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    iget-object v4, v2, Lu5/l;->a:Ljava/util/HashMap;

    .line 448
    .line 449
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_14
    invoke-virtual {v9}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    iget-object v5, v2, Lu5/l;->a:Ljava/util/HashMap;

    .line 458
    .line 459
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    iget-object v4, v2, Lu5/l;->b:Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    :cond_15
    :goto_b
    iget-object v0, v1, Lu5/c;->k:Lt5/k;

    .line 471
    .line 472
    iget-object v4, v1, Lu5/c;->c:Lt5/k0;

    .line 473
    .line 474
    if-ne v0, v4, :cond_16

    .line 475
    .line 476
    move v6, v3

    .line 477
    goto :goto_c

    .line 478
    :cond_16
    const/4 v6, 0x0

    .line 479
    :goto_c
    if-eqz v6, :cond_17

    .line 480
    .line 481
    iget-object v0, v1, Lu5/c;->a:Lu5/a;

    .line 482
    .line 483
    move-object/from16 v3, v24

    .line 484
    .line 485
    invoke-interface {v0, v3, v2}, Lu5/a;->f(Ljava/lang/String;Lu5/l;)V

    .line 486
    .line 487
    .line 488
    :cond_17
    return-void

    .line 489
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 490
    .line 491
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v0
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

.method public final read([BII)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-wide v3, v1, Lu5/c;->n:J

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    cmp-long v3, v3, v5

    .line 14
    .line 15
    const/4 v4, -0x1

    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    return v4

    .line 19
    :cond_1
    iget-object v3, v1, Lu5/c;->i:Lt5/n;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v7, v1, Lu5/c;->j:Lt5/n;

    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    :try_start_0
    iget-wide v9, v1, Lu5/c;->m:J

    .line 31
    .line 32
    iget-wide v11, v1, Lu5/c;->s:J

    .line 33
    .line 34
    cmp-long v9, v9, v11

    .line 35
    .line 36
    if-ltz v9, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1, v3, v8}, Lu5/c;->p(Lt5/n;Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object v9, v1, Lu5/c;->k:Lt5/k;

    .line 42
    .line 43
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-object/from16 v10, p1

    .line 47
    .line 48
    move/from16 v11, p2

    .line 49
    .line 50
    invoke-interface {v9, v10, v11, v0}, Lt5/h;->read([BII)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    const-wide/16 v12, -0x1

    .line 55
    .line 56
    if-eq v9, v4, :cond_6

    .line 57
    .line 58
    iget-object v0, v1, Lu5/c;->k:Lt5/k;

    .line 59
    .line 60
    iget-object v3, v1, Lu5/c;->b:Lt5/k;

    .line 61
    .line 62
    if-ne v0, v3, :cond_3

    .line 63
    .line 64
    move v0, v8

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move v0, v2

    .line 67
    :goto_0
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-wide v3, v1, Lu5/c;->r:J

    .line 70
    .line 71
    int-to-long v5, v9

    .line 72
    add-long/2addr v3, v5

    .line 73
    iput-wide v3, v1, Lu5/c;->r:J

    .line 74
    .line 75
    :cond_4
    iget-wide v3, v1, Lu5/c;->m:J

    .line 76
    .line 77
    int-to-long v5, v9

    .line 78
    add-long/2addr v3, v5

    .line 79
    iput-wide v3, v1, Lu5/c;->m:J

    .line 80
    .line 81
    iget-wide v3, v1, Lu5/c;->l:J

    .line 82
    .line 83
    add-long/2addr v3, v5

    .line 84
    iput-wide v3, v1, Lu5/c;->l:J

    .line 85
    .line 86
    iget-wide v3, v1, Lu5/c;->n:J

    .line 87
    .line 88
    cmp-long v0, v3, v12

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    sub-long/2addr v3, v5

    .line 93
    iput-wide v3, v1, Lu5/c;->n:J

    .line 94
    .line 95
    :cond_5
    move/from16 v16, v9

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_6
    iget-object v4, v1, Lu5/c;->k:Lt5/k;

    .line 102
    .line 103
    iget-object v14, v1, Lu5/c;->b:Lt5/k;

    .line 104
    .line 105
    if-ne v4, v14, :cond_7

    .line 106
    .line 107
    move v14, v8

    .line 108
    goto :goto_1

    .line 109
    :cond_7
    move v14, v2

    .line 110
    :goto_1
    xor-int/2addr v14, v8

    .line 111
    if-eqz v14, :cond_a

    .line 112
    .line 113
    iget-wide v14, v7, Lt5/n;->g:J

    .line 114
    .line 115
    cmp-long v7, v14, v12

    .line 116
    .line 117
    if-eqz v7, :cond_8

    .line 118
    .line 119
    move/from16 v16, v9

    .line 120
    .line 121
    iget-wide v8, v1, Lu5/c;->l:J

    .line 122
    .line 123
    cmp-long v8, v8, v14

    .line 124
    .line 125
    if-gez v8, :cond_b

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    move/from16 v16, v9

    .line 129
    .line 130
    :goto_2
    iget-object v0, v3, Lt5/n;->h:Ljava/lang/String;

    .line 131
    .line 132
    sget v3, Lv5/e0;->a:I

    .line 133
    .line 134
    iput-wide v5, v1, Lu5/c;->n:J

    .line 135
    .line 136
    iget-object v3, v1, Lu5/c;->c:Lt5/k0;

    .line 137
    .line 138
    if-ne v4, v3, :cond_9

    .line 139
    .line 140
    const/4 v3, 0x1

    .line 141
    goto :goto_3

    .line 142
    :cond_9
    move v3, v2

    .line 143
    :goto_3
    if-eqz v3, :cond_c

    .line 144
    .line 145
    new-instance v3, Lu5/l;

    .line 146
    .line 147
    invoke-direct {v3}, Lu5/l;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-wide v4, v1, Lu5/c;->m:J

    .line 151
    .line 152
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget-object v5, v3, Lu5/l;->a:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-string v6, "exo_len"

    .line 162
    .line 163
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    iget-object v4, v3, Lu5/l;->b:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v4, v1, Lu5/c;->a:Lu5/a;

    .line 172
    .line 173
    invoke-interface {v4, v0, v3}, Lu5/a;->f(Ljava/lang/String;Lu5/l;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_a
    move/from16 v16, v9

    .line 178
    .line 179
    :cond_b
    iget-wide v8, v1, Lu5/c;->n:J

    .line 180
    .line 181
    cmp-long v4, v8, v5

    .line 182
    .line 183
    if-gtz v4, :cond_d

    .line 184
    .line 185
    cmp-long v4, v8, v12

    .line 186
    .line 187
    if-nez v4, :cond_c

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_c
    :goto_4
    return v16

    .line 191
    :cond_d
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lu5/c;->o()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v3, v2}, Lu5/c;->p(Lt5/n;Z)V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {p0 .. p3}, Lu5/c;->read([BII)I

    .line 198
    .line 199
    .line 200
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    return v0

    .line 202
    :goto_6
    iget-object v3, v1, Lu5/c;->k:Lt5/k;

    .line 203
    .line 204
    iget-object v4, v1, Lu5/c;->b:Lt5/k;

    .line 205
    .line 206
    if-ne v3, v4, :cond_e

    .line 207
    .line 208
    const/4 v2, 0x1

    .line 209
    :cond_e
    if-nez v2, :cond_f

    .line 210
    .line 211
    instance-of v2, v0, Lu5/a$a;

    .line 212
    .line 213
    if-eqz v2, :cond_10

    .line 214
    .line 215
    :cond_f
    const/4 v2, 0x1

    .line 216
    iput-boolean v2, v1, Lu5/c;->p:Z

    .line 217
    .line 218
    :cond_10
    throw v0
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
