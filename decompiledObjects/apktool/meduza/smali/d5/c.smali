.class public final Ld5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly4/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/a<",
        "Ld5/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Ld5/n;

.field public final j:Ld5/l;

.field public final k:Landroid/net/Uri;

.field public final l:Ld5/h;

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJJZJJJJLd5/h;Ld5/n;Ld5/l;Landroid/net/Uri;Ljava/util/ArrayList;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Ld5/c;->a:J

    move-wide v1, p3

    iput-wide v1, v0, Ld5/c;->b:J

    move-wide v1, p5

    iput-wide v1, v0, Ld5/c;->c:J

    move v1, p7

    iput-boolean v1, v0, Ld5/c;->d:Z

    move-wide v1, p8

    iput-wide v1, v0, Ld5/c;->e:J

    move-wide v1, p10

    iput-wide v1, v0, Ld5/c;->f:J

    move-wide v1, p12

    iput-wide v1, v0, Ld5/c;->g:J

    move-wide/from16 v1, p14

    iput-wide v1, v0, Ld5/c;->h:J

    move-object/from16 v1, p16

    iput-object v1, v0, Ld5/c;->l:Ld5/h;

    move-object/from16 v1, p17

    iput-object v1, v0, Ld5/c;->i:Ld5/n;

    move-object/from16 v1, p19

    iput-object v1, v0, Ld5/c;->k:Landroid/net/Uri;

    move-object/from16 v1, p18

    iput-object v1, v0, Ld5/c;->j:Ld5/l;

    move-object/from16 v1, p20

    iput-object v1, v0, Ld5/c;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedList;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ly4/c;

    .line 14
    .line 15
    invoke-direct {v2}, Ly4/c;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ld5/c;->c()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-ge v5, v6, :cond_5

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ly4/c;

    .line 45
    .line 46
    iget v6, v6, Ly4/c;->a:I

    .line 47
    .line 48
    if-eq v6, v5, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v5}, Ld5/c;->d(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide v9

    .line 54
    cmp-long v6, v9, v7

    .line 55
    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    add-long/2addr v3, v9

    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_0
    invoke-virtual {v0, v5}, Ld5/c;->b(I)Ld5/g;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object v9, v6, Ld5/g;->c:Ljava/util/List;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    check-cast v7, Ly4/c;

    .line 72
    .line 73
    iget v10, v7, Ly4/c;->a:I

    .line 74
    .line 75
    new-instance v15, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget v8, v7, Ly4/c;->b:I

    .line 81
    .line 82
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    check-cast v11, Ld5/a;

    .line 87
    .line 88
    iget-object v12, v11, Ld5/a;->c:Ljava/util/List;

    .line 89
    .line 90
    new-instance v13, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    :cond_1
    iget v7, v7, Ly4/c;->c:I

    .line 96
    .line 97
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ld5/j;

    .line 102
    .line 103
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Ly4/c;

    .line 111
    .line 112
    iget v14, v7, Ly4/c;->a:I

    .line 113
    .line 114
    if-ne v14, v10, :cond_2

    .line 115
    .line 116
    iget v14, v7, Ly4/c;->b:I

    .line 117
    .line 118
    if-eq v14, v8, :cond_1

    .line 119
    .line 120
    :cond_2
    new-instance v8, Ld5/a;

    .line 121
    .line 122
    iget v12, v11, Ld5/a;->a:I

    .line 123
    .line 124
    iget v14, v11, Ld5/a;->b:I

    .line 125
    .line 126
    move-object/from16 v23, v9

    .line 127
    .line 128
    iget-object v9, v11, Ld5/a;->d:Ljava/util/List;

    .line 129
    .line 130
    iget-object v0, v11, Ld5/a;->e:Ljava/util/List;

    .line 131
    .line 132
    iget-object v11, v11, Ld5/a;->f:Ljava/util/List;

    .line 133
    .line 134
    move-object/from16 v16, v8

    .line 135
    .line 136
    move/from16 v17, v12

    .line 137
    .line 138
    move/from16 v18, v14

    .line 139
    .line 140
    move-object/from16 v19, v13

    .line 141
    .line 142
    move-object/from16 v20, v9

    .line 143
    .line 144
    move-object/from16 v21, v0

    .line 145
    .line 146
    move-object/from16 v22, v11

    .line 147
    .line 148
    invoke-direct/range {v16 .. v22}, Ld5/a;-><init>(IILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    iget v0, v7, Ly4/c;->a:I

    .line 155
    .line 156
    if-eq v0, v10, :cond_4

    .line 157
    .line 158
    invoke-virtual {v1, v7}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Ld5/g;

    .line 162
    .line 163
    iget-object v12, v6, Ld5/g;->a:Ljava/lang/String;

    .line 164
    .line 165
    iget-wide v7, v6, Ld5/g;->b:J

    .line 166
    .line 167
    sub-long v13, v7, v3

    .line 168
    .line 169
    iget-object v6, v6, Ld5/g;->d:Ljava/util/List;

    .line 170
    .line 171
    move-object v11, v0

    .line 172
    move-object/from16 v16, v6

    .line 173
    .line 174
    invoke-direct/range {v11 .. v16}, Ld5/g;-><init>(Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    move-object/from16 v0, p0

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_4
    move-object/from16 v0, p0

    .line 187
    .line 188
    move-object/from16 v9, v23

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_5
    iget-wide v5, v0, Ld5/c;->b:J

    .line 192
    .line 193
    cmp-long v1, v5, v7

    .line 194
    .line 195
    if-eqz v1, :cond_6

    .line 196
    .line 197
    sub-long/2addr v5, v3

    .line 198
    move-wide v6, v5

    .line 199
    goto :goto_3

    .line 200
    :cond_6
    move-wide v6, v7

    .line 201
    :goto_3
    new-instance v1, Ld5/c;

    .line 202
    .line 203
    move-object v3, v1

    .line 204
    iget-wide v4, v0, Ld5/c;->a:J

    .line 205
    .line 206
    iget-wide v8, v0, Ld5/c;->c:J

    .line 207
    .line 208
    iget-boolean v10, v0, Ld5/c;->d:Z

    .line 209
    .line 210
    iget-wide v11, v0, Ld5/c;->e:J

    .line 211
    .line 212
    iget-wide v13, v0, Ld5/c;->f:J

    .line 213
    .line 214
    move-object/from16 p1, v3

    .line 215
    .line 216
    move-wide/from16 v24, v4

    .line 217
    .line 218
    iget-wide v3, v0, Ld5/c;->g:J

    .line 219
    .line 220
    move-wide v15, v3

    .line 221
    iget-wide v3, v0, Ld5/c;->h:J

    .line 222
    .line 223
    move-wide/from16 v17, v3

    .line 224
    .line 225
    iget-object v3, v0, Ld5/c;->l:Ld5/h;

    .line 226
    .line 227
    move-object/from16 v19, v3

    .line 228
    .line 229
    iget-object v3, v0, Ld5/c;->i:Ld5/n;

    .line 230
    .line 231
    move-object/from16 v20, v3

    .line 232
    .line 233
    iget-object v3, v0, Ld5/c;->j:Ld5/l;

    .line 234
    .line 235
    move-object/from16 v21, v3

    .line 236
    .line 237
    iget-object v3, v0, Ld5/c;->k:Landroid/net/Uri;

    .line 238
    .line 239
    move-object/from16 v22, v3

    .line 240
    .line 241
    move-object/from16 v23, v2

    .line 242
    .line 243
    move-object/from16 v3, p1

    .line 244
    .line 245
    move-wide/from16 v4, v24

    .line 246
    .line 247
    invoke-direct/range {v3 .. v23}, Ld5/c;-><init>(JJJZJJJJLd5/h;Ld5/n;Ld5/l;Landroid/net/Uri;Ljava/util/ArrayList;)V

    .line 248
    .line 249
    .line 250
    return-object v1
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

.method public final b(I)Ld5/g;
    .locals 1

    iget-object v0, p0, Ld5/c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/g;

    return-object p1
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Ld5/c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final d(I)J
    .locals 5

    iget-object v0, p0, Ld5/c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-ne p1, v0, :cond_1

    iget-wide v3, p0, Ld5/c;->b:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld5/c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/g;

    iget-wide v0, p1, Ld5/g;->b:J

    sub-long v1, v3, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld5/c;->m:Ljava/util/List;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/g;

    iget-wide v0, v0, Ld5/g;->b:J

    iget-object v2, p0, Ld5/c;->m:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/g;

    iget-wide v2, p1, Ld5/g;->b:J

    sub-long v1, v0, v2

    :goto_0
    return-wide v1
.end method

.method public final e(I)J
    .locals 2

    invoke-virtual {p0, p1}, Ld5/c;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    move-result-wide v0

    return-wide v0
.end method
