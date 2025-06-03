.class public final Lpa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpa/b$a;
    }
.end annotation


# instance fields
.field public final a:Lio/flutter/plugin/common/EventChannel;

.field public final b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field public final c:Lv3/d0;

.field public final d:Lpa/k;

.field public final e:Lr5/f;

.field public f:Z

.field public g:Landroid/view/Surface;

.field public h:Ljava/lang/String;

.field public i:Ls5/c;

.field public j:Landroid/os/Handler;

.field public k:Lb/d;

.field public l:Lpa/b$c;

.field public m:Landroid/graphics/Bitmap;

.field public n:Landroid/support/v4/media/session/MediaSessionCompat;

.field public o:La4/b;

.field public final p:Lp2/k0;

.field public final q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/util/UUID;",
            "Lb1/x<",
            "Lo2/o;",
            ">;>;"
        }
    .end annotation
.end field

.field public r:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/EventChannel;Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;Lpa/i;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "result"

    .line 10
    .line 11
    invoke-static {v3, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, Lpa/b;->a:Lio/flutter/plugin/common/EventChannel;

    .line 18
    .line 19
    move-object/from16 v4, p3

    .line 20
    .line 21
    iput-object v4, v0, Lpa/b;->b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 22
    .line 23
    new-instance v5, Lpa/k;

    .line 24
    .line 25
    invoke-direct {v5}, Lpa/k;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v5, v0, Lpa/b;->d:Lpa/k;

    .line 29
    .line 30
    new-instance v5, Lr5/f;

    .line 31
    .line 32
    invoke-direct {v5, v1}, Lr5/f;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v5, v0, Lpa/b;->e:Lr5/f;

    .line 36
    .line 37
    if-nez p4, :cond_0

    .line 38
    .line 39
    new-instance v6, Lpa/i;

    .line 40
    .line 41
    invoke-direct {v6}, Lpa/i;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object/from16 v6, p4

    .line 46
    .line 47
    :goto_0
    const/4 v13, -0x1

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    iget v9, v6, Lpa/i;->a:I

    .line 51
    .line 52
    iget v10, v6, Lpa/i;->b:I

    .line 53
    .line 54
    iget v11, v6, Lpa/i;->c:I

    .line 55
    .line 56
    iget v12, v6, Lpa/i;->d:I

    .line 57
    .line 58
    const-string v6, "bufferForPlaybackMs"

    .line 59
    .line 60
    const-string v7, "0"

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-static {v6, v11, v8, v7}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v14, "bufferForPlaybackAfterRebufferMs"

    .line 67
    .line 68
    invoke-static {v14, v12, v8, v7}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v7, "minBufferMs"

    .line 72
    .line 73
    invoke-static {v7, v9, v11, v6}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v7, v9, v12, v14}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v6, "maxBufferMs"

    .line 80
    .line 81
    invoke-static {v6, v10, v9, v7}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v8, Lt5/o;

    .line 85
    .line 86
    invoke-direct {v8}, Lt5/o;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v6, Lv3/j;

    .line 90
    .line 91
    move-object v7, v6

    .line 92
    move/from16 v14, v16

    .line 93
    .line 94
    move/from16 v15, v16

    .line 95
    .line 96
    invoke-direct/range {v7 .. v16}, Lv3/j;-><init>(Lt5/o;IIIIIZIZ)V

    .line 97
    .line 98
    .line 99
    new-instance v7, Lv3/r;

    .line 100
    .line 101
    invoke-direct {v7, v1}, Lv3/r;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    iget-boolean v8, v7, Lv3/r;->t:Z

    .line 105
    .line 106
    const/4 v9, 0x1

    .line 107
    xor-int/2addr v8, v9

    .line 108
    invoke-static {v8}, Lx6/b;->H(Z)V

    .line 109
    .line 110
    .line 111
    new-instance v8, Le;

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-direct {v8, v5, v10}, Le;-><init>(Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    iput-object v8, v7, Lv3/r;->e:Ln7/q;

    .line 118
    .line 119
    iget-boolean v5, v7, Lv3/r;->t:Z

    .line 120
    .line 121
    xor-int/2addr v5, v9

    .line 122
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 123
    .line 124
    .line 125
    new-instance v5, Laa/m0;

    .line 126
    .line 127
    invoke-direct {v5, v6, v10}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    iput-object v5, v7, Lv3/r;->f:Ln7/q;

    .line 131
    .line 132
    iget-boolean v5, v7, Lv3/r;->t:Z

    .line 133
    .line 134
    xor-int/2addr v5, v9

    .line 135
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 136
    .line 137
    .line 138
    iput-boolean v9, v7, Lv3/r;->t:Z

    .line 139
    .line 140
    new-instance v5, Lv3/d0;

    .line 141
    .line 142
    invoke-direct {v5, v7}, Lv3/d0;-><init>(Lv3/r;)V

    .line 143
    .line 144
    .line 145
    iput-object v5, v0, Lpa/b;->c:Lv3/d0;

    .line 146
    .line 147
    invoke-static/range {p1 .. p1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iput-object v1, v0, Lpa/b;->p:Lp2/k0;

    .line 152
    .line 153
    new-instance v1, Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v1, v0, Lpa/b;->q:Ljava/util/HashMap;

    .line 159
    .line 160
    new-instance v1, Lpa/d;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Lpa/d;-><init>(Lpa/b;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Landroid/view/Surface;

    .line 169
    .line 170
    invoke-interface/range {p3 .. p3}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-direct {v1, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 175
    .line 176
    .line 177
    iput-object v1, v0, Lpa/b;->g:Landroid/view/Surface;

    .line 178
    .line 179
    invoke-virtual {v5}, Lv3/d0;->u0()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v1}, Lv3/d0;->n0(Landroid/view/Surface;)V

    .line 183
    .line 184
    .line 185
    const/4 v1, -0x1

    .line 186
    invoke-virtual {v5, v1, v1}, Lv3/d0;->g0(II)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Lv3/d0;->u0()V

    .line 190
    .line 191
    .line 192
    const/4 v15, 0x1

    .line 193
    const/4 v12, 0x3

    .line 194
    new-instance v1, Lx3/d;

    .line 195
    .line 196
    move-object v11, v1

    .line 197
    move/from16 v13, v16

    .line 198
    .line 199
    move v14, v15

    .line 200
    invoke-direct/range {v11 .. v16}, Lx3/d;-><init>(IIIII)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v1, v10}, Lv3/d0;->k0(Lx3/d;Z)V

    .line 204
    .line 205
    .line 206
    new-instance v1, Lpa/e;

    .line 207
    .line 208
    invoke-direct {v1, v0}, Lpa/e;-><init>(Lpa/b;)V

    .line 209
    .line 210
    .line 211
    iget-object v2, v5, Lv3/d0;->l:Lv5/l;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Lv5/l;->a(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    new-instance v1, Ljava/util/HashMap;

    .line 217
    .line 218
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface/range {p3 .. p3}, Lio/flutter/view/TextureRegistry$TextureEntry;->id()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const-string v4, "textureId"

    .line 230
    .line 231
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    invoke-interface {v3, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 10
    .line 11
    invoke-virtual {p0}, Lpa/b;->b()V

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, Lpa/b;->f:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lpa/b;->c:Lv3/d0;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lv3/d0;->stop()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lpa/b;->b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 26
    .line 27
    invoke-interface {v1}, Lio/flutter/view/TextureRegistry$TextureEntry;->release()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lpa/b;->a:Lio/flutter/plugin/common/EventChannel;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lpa/b;->g:Landroid/view/Surface;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lpa/b;->c:Lv3/d0;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Lv3/d0;->h0()V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
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

.method public final b()V
    .locals 2

    iget-object v0, p0, Lpa/b;->l:Lpa/b$c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lpa/b;->c:Lv3/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lv3/d0;->h(Lv3/f1$c;)V

    :cond_0
    iget-object v0, p0, Lpa/b;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lpa/b;->j:Landroid/os/Handler;

    iput-object v1, p0, Lpa/b;->k:Lb/d;

    :cond_1
    iget-object v0, p0, Lpa/b;->i:Ls5/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Ls5/c;->b(Lv3/j0;)V

    :cond_2
    iput-object v1, p0, Lpa/b;->m:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final c(Z)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    const-string p1, "pipStart"

    goto :goto_0

    :cond_0
    const-string p1, "pipStop"

    :goto_0
    const-string v1, "event"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lpa/b;->d:Lpa/k;

    invoke-virtual {p1, v0}, Lpa/k;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Z)V
    .locals 7

    iget-object v0, p0, Lpa/b;->c:Lv3/d0;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv3/d0;->z()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    if-nez p1, :cond_1

    iget-wide v5, p0, Lpa/b;->r:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "event"

    const-string v5, "bufferingUpdate"

    invoke-virtual {p1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Long;

    const/4 v5, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v5

    const/4 v1, 0x1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lva/a;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "values"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lpa/b;->d:Lpa/k;

    invoke-virtual {v0, p1}, Lpa/k;->success(Ljava/lang/Object;)V

    iput-wide v3, p0, Lpa/b;->r:J

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lpa/b;->e:Lr5/f;

    invoke-virtual {v0}, Lr5/j;->e()Lr5/j$a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lpa/b;->e:Lr5/f;

    invoke-virtual {v0}, Lr5/f;->h()Lr5/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lr5/f$c;->buildUpon()Lr5/f$d;

    const/4 v0, 0x0

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    const-class v2, Lpa/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v2, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    check-cast p1, Lpa/b;

    iget-object v2, p0, Lpa/b;->c:Lv3/d0;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lpa/b;->c:Lv3/d0;

    invoke-static {v2, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lpa/b;->c:Lv3/d0;

    if-eqz v2, :cond_3

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    if-eqz v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lpa/b;->g:Landroid/view/Surface;

    iget-object p1, p1, Lpa/b;->g:Landroid/view/Surface;

    if-eqz v2, :cond_5

    invoke-static {v2, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    move v0, v1

    :goto_2
    return v0

    :cond_7
    :goto_3
    return v1
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/Map;ZJJJLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;ZJJJ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p14

    move-object/from16 v11, p16

    move-object/from16 v4, p17

    const-string v5, "context"

    invoke-static {v0, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "result"

    invoke-static {v10, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    iput-object v5, v1, Lpa/b;->h:Ljava/lang/String;

    const/4 v5, 0x0

    iput-boolean v5, v1, Lpa/b;->f:Z

    invoke-static/range {p3 .. p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    const-string v6, "http.agent"

    .line 1
    invoke-static {v6}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v2, :cond_0

    const-string v7, "User-Agent"

    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_0

    move-object v6, v7

    :cond_0
    const-string v7, "Protected content not supported on API levels below 18"

    const-string v8, "BetterPlayer"

    if-eqz v3, :cond_e

    .line 2
    invoke-virtual/range {p14 .. p14}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_1

    const/4 v5, 0x1

    :cond_1
    if-eqz v5, :cond_e

    new-instance v4, La4/t;

    new-instance v5, Lt5/s$a;

    invoke-direct {v5}, Lt5/s$a;-><init>()V

    invoke-direct {v4, v3, v5}, La4/t;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)V

    if-eqz p15, :cond_2

    invoke-interface/range {p15 .. p15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 3
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iget-object v14, v4, La4/t;->d:Ljava/util/HashMap;

    monitor-enter v14

    :try_start_0
    iget-object v15, v4, La4/t;->d:Ljava/util/HashMap;

    invoke-virtual {v15, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v14

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 5
    :cond_2
    sget v3, Lv5/e0;->a:I

    const/16 v5, 0x12

    if-ge v3, v5, :cond_3

    :goto_1
    invoke-static {v8, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto/16 :goto_6

    :cond_3
    const-string v3, "widevine"

    .line 6
    invoke-static {v3}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    const v8, -0x6ee3d111

    if-eq v7, v8, :cond_8

    const v8, -0x537ab703

    if-eq v7, v8, :cond_6

    const v8, 0x2f1b28f2

    if-eq v7, v8, :cond_4

    goto :goto_2

    :cond_4
    const-string v7, "clearkey"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x2

    goto :goto_3

    :cond_6
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_2

    :cond_7
    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    const-string v7, "playready"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :goto_2
    const/4 v5, -0x1

    goto :goto_3

    :cond_9
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_c

    const/4 v7, 0x1

    if-eq v5, v7, :cond_b

    const/4 v7, 0x2

    if-eq v5, v7, :cond_a

    :try_start_1
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    const/4 v3, 0x0

    goto :goto_4

    :cond_a
    sget-object v3, Lv3/h;->c:Ljava/util/UUID;

    goto :goto_4

    :cond_b
    sget-object v3, Lv3/h;->d:Ljava/util/UUID;

    goto :goto_4

    :cond_c
    sget-object v3, Lv3/h;->e:Ljava/util/UUID;

    :goto_4
    move-object v14, v3

    if-eqz v14, :cond_d

    const/16 v20, 0x0

    .line 7
    new-instance v17, Ljava/util/HashMap;

    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    sget-object v3, Lv3/h;->a:Ljava/util/UUID;

    new-instance v21, Lt5/u;

    invoke-direct/range {v21 .. v21}, Lt5/u;-><init>()V

    const/4 v3, 0x0

    new-array v3, v3, [I

    const-wide/32 v22, 0x493e0

    .line 8
    new-instance v15, Lf;

    invoke-direct {v15}, Lf;-><init>()V

    const/16 v18, 0x0

    .line 9
    new-instance v5, La4/b;

    move-object v13, v5

    move-object/from16 v16, v4

    move-object/from16 v19, v3

    invoke-direct/range {v13 .. v23}, La4/b;-><init>(Ljava/util/UUID;La4/o$c;La4/w;Ljava/util/HashMap;Z[IZLt5/u;J)V

    .line 10
    iput-object v5, v1, Lpa/b;->o:La4/b;

    :cond_d
    const/4 v3, 0x0

    move v13, v3

    goto :goto_7

    :cond_e
    if-eqz v4, :cond_11

    invoke-virtual/range {p17 .. p17}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_f

    const/4 v3, 0x1

    goto :goto_5

    :cond_f
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_11

    sget v3, Lv5/e0;->a:I

    const/16 v5, 0x12

    if-ge v3, v5, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v20, 0x0

    const/16 v18, 0x0

    .line 11
    new-instance v17, Ljava/util/HashMap;

    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    new-instance v21, Lt5/u;

    invoke-direct/range {v21 .. v21}, Lt5/u;-><init>()V

    const/4 v3, 0x0

    new-array v5, v3, [I

    const-wide/32 v22, 0x493e0

    .line 12
    sget-object v14, Lv3/h;->c:Ljava/util/UUID;

    sget-object v15, La4/s;->d:Lg;

    .line 13
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    new-instance v7, La4/v;

    sget-object v8, Llc/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v8, "this as java.lang.String).getBytes(charset)"

    invoke-static {v4, v8}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v4}, La4/v;-><init>([B)V

    .line 15
    new-instance v4, La4/b;

    move-object v13, v4

    move-object/from16 v16, v7

    move-object/from16 v19, v5

    invoke-direct/range {v13 .. v23}, La4/b;-><init>(Ljava/util/UUID;La4/o$c;La4/w;Ljava/util/HashMap;Z[IZLt5/u;J)V

    move-object/from16 v26, v4

    move v4, v3

    move-object/from16 v3, v26

    goto :goto_6

    :cond_11
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 16
    :goto_6
    iput-object v3, v1, Lpa/b;->o:La4/b;

    move v13, v4

    :goto_7
    invoke-static {v12}, Lpa/j;->b(Landroid/net/Uri;)Z

    move-result v3

    const-wide/16 v14, 0x0

    if-eqz v3, :cond_12

    invoke-static {v6, v2}, Lpa/j;->a(Ljava/lang/String;Ljava/util/Map;)Lt5/s$a;

    move-result-object v8

    if-eqz p7, :cond_13

    cmp-long v2, p8, v14

    if-lez v2, :cond_13

    cmp-long v2, p10, v14

    if-lez v2, :cond_13

    new-instance v16, Lpa/h;

    move-object/from16 v2, v16

    move-object/from16 v3, p1

    move-wide/from16 v4, p8

    move-wide/from16 v6, p10

    invoke-direct/range {v2 .. v8}, Lpa/h;-><init>(Landroid/content/Context;JJLt5/s$a;)V

    move-object/from16 v8, v16

    goto :goto_8

    :cond_12
    new-instance v8, Lt5/r$a;

    invoke-direct {v8, v0}, Lt5/r$a;-><init>(Landroid/content/Context;)V

    :cond_13
    :goto_8
    invoke-static {v12}, Lec/i;->b(Ljava/lang/Object;)V

    const/4 v2, 0x4

    if-nez v9, :cond_15

    .line 17
    invoke-virtual {v12}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_14

    const-string v3, ""

    :cond_14
    sget v4, Lv5/e0;->a:I

    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "file:///"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Lv5/e0;->C(Landroid/net/Uri;)I

    move-result v3

    goto :goto_a

    .line 19
    :cond_15
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0xe60

    if-eq v3, v4, :cond_1c

    const v4, 0x193ef

    if-eq v3, v4, :cond_1a

    const v4, 0x2eef92

    if-eq v3, v4, :cond_18

    const v4, 0x6527f10

    if-eq v3, v4, :cond_16

    goto :goto_9

    :cond_16
    const-string v3, "other"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_9

    :cond_17
    move v3, v2

    goto :goto_a

    :cond_18
    const-string v3, "dash"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    goto :goto_9

    :cond_19
    move v3, v13

    goto :goto_a

    :cond_1a
    const-string v3, "hls"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_9

    :cond_1b
    const/4 v3, 0x2

    goto :goto_a

    :cond_1c
    const-string v3, "ss"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :goto_9
    const/4 v3, -0x1

    goto :goto_a

    :cond_1d
    const/4 v3, 0x1

    :goto_a
    new-instance v4, Lv3/o0$a;

    invoke-direct {v4}, Lv3/o0$a;-><init>()V

    .line 20
    iput-object v12, v4, Lv3/o0$a;->b:Landroid/net/Uri;

    if-eqz v11, :cond_1f

    .line 21
    invoke-virtual/range {p16 .. p16}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1e

    const/4 v13, 0x1

    :cond_1e
    if-eqz v13, :cond_1f

    .line 22
    iput-object v11, v4, Lv3/o0$a;->g:Ljava/lang/String;

    .line 23
    :cond_1f
    invoke-virtual {v4}, Lv3/o0$a;->a()Lv3/o0;

    move-result-object v4

    iget-object v5, v1, Lpa/b;->o:La4/b;

    if-eqz v5, :cond_20

    new-instance v6, Lpa/a;

    invoke-direct {v6, v5}, Lpa/a;-><init>(La4/h;)V

    goto :goto_b

    :cond_20
    const/4 v6, 0x0

    :goto_b
    if-eqz v3, :cond_25

    const/4 v5, 0x1

    if-eq v3, v5, :cond_23

    const/4 v0, 0x2

    if-eq v3, v0, :cond_22

    if-ne v3, v2, :cond_21

    new-instance v0, Lc4/f;

    invoke-direct {v0}, Lc4/f;-><init>()V

    .line 24
    new-instance v2, Ld;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 25
    new-instance v21, Lt5/u;

    invoke-direct/range {v21 .. v21}, Lt5/u;-><init>()V

    const/high16 v22, 0x100000

    .line 26
    invoke-static {v6}, Lx6/b;->A(Lpa/a;)V

    .line 27
    iget-object v0, v4, Lv3/o0;->b:Lv3/o0$g;

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    iget-object v0, v4, Lv3/o0;->b:Lv3/o0$g;

    iget-object v0, v0, Lv3/o0$f;->g:Ljava/lang/Object;

    new-instance v0, Lz4/z;

    .line 30
    iget-object v3, v6, Lpa/a;->a:La4/h;

    move-object/from16 v16, v0

    move-object/from16 v17, v4

    move-object/from16 v18, v8

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    .line 31
    invoke-direct/range {v16 .. v22}, Lz4/z;-><init>(Lv3/o0;Lt5/k$a;Lz4/x$a;La4/h;Lt5/c0;I)V

    goto/16 :goto_d

    .line 32
    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unsupported type: "

    .line 33
    invoke-static {v2, v3}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-direct {v0, v8}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lt5/k$a;)V

    .line 35
    invoke-static {v6}, Lx6/b;->A(Lpa/a;)V

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:La4/i;

    .line 36
    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Lv3/o0;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object v0

    goto :goto_d

    :cond_23
    new-instance v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    new-instance v3, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    invoke-direct {v3, v8}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lt5/k$a;)V

    new-instance v5, Lt5/r$a;

    invoke-direct {v5, v0, v8}, Lt5/r$a;-><init>(Landroid/content/Context;Lt5/k$a;)V

    invoke-direct {v2, v3, v5}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;Lt5/k$a;)V

    .line 37
    invoke-static {v6}, Lx6/b;->A(Lpa/a;)V

    iput-object v6, v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->b:La4/i;

    .line 38
    iget-object v0, v4, Lv3/o0;->b:Lv3/o0$g;

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    new-instance v0, Lg5/b;

    invoke-direct {v0}, Lg5/b;-><init>()V

    iget-object v6, v4, Lv3/o0;->b:Lv3/o0$g;

    iget-object v6, v6, Lv3/o0$f;->d:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_24

    new-instance v7, Ly4/b;

    invoke-direct {v7, v0, v6}, Ly4/b;-><init>(Lt5/f0$a;Ljava/util/List;)V

    move-object/from16 v19, v7

    goto :goto_c

    :cond_24
    move-object/from16 v19, v0

    :goto_c
    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    iget-object v6, v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a:Lz4/i;

    iget-object v7, v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->b:La4/i;

    invoke-interface {v7, v4}, La4/i;->a(Lv3/o0;)La4/h;

    move-result-object v22

    iget-object v7, v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->c:Lt5/u;

    iget-wide v8, v2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->d:J

    move-object/from16 v16, v0

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v20, v3

    move-object/from16 v21, v6

    move-object/from16 v23, v7

    move-wide/from16 v24, v8

    invoke-direct/range {v16 .. v25}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;-><init>(Lv3/o0;Lt5/k$a;Lt5/f0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lz4/i;La4/h;Lt5/u;J)V

    goto :goto_d

    .line 41
    :cond_25
    new-instance v2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    new-instance v3, Lcom/google/android/exoplayer2/source/dash/c$a;

    invoke-direct {v3, v8}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lt5/k$a;)V

    new-instance v5, Lt5/r$a;

    invoke-direct {v5, v0, v8}, Lt5/r$a;-><init>(Landroid/content/Context;Lt5/k$a;)V

    invoke-direct {v2, v3, v5}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/c$a;Lt5/k$a;)V

    .line 42
    invoke-static {v6}, Lx6/b;->A(Lpa/a;)V

    iput-object v6, v2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->c:La4/i;

    .line 43
    invoke-virtual {v2, v4}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a(Lv3/o0;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object v0

    :goto_d
    cmp-long v2, p12, v14

    if-eqz v2, :cond_26

    .line 44
    new-instance v2, Lz4/d;

    const-wide/16 v3, 0x0

    const/16 v5, 0x3e8

    int-to-long v5, v5

    mul-long v5, v5, p12

    move-object/from16 p6, v2

    move-object/from16 p7, v0

    move-wide/from16 p8, v3

    move-wide/from16 p10, v5

    invoke-direct/range {p6 .. p11}, Lz4/d;-><init>(Lz4/t;JJ)V

    iget-object v0, v1, Lpa/b;->c:Lv3/d0;

    if-eqz v0, :cond_27

    invoke-virtual {v0, v2}, Lv3/d0;->l0(Lz4/t;)V

    goto :goto_e

    :cond_26
    iget-object v2, v1, Lpa/b;->c:Lv3/d0;

    if-eqz v2, :cond_27

    invoke-virtual {v2, v0}, Lv3/d0;->l0(Lz4/t;)V

    :cond_27
    :goto_e
    iget-object v0, v1, Lpa/b;->c:Lv3/d0;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Lv3/d0;->a()V

    :cond_28
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lpa/b;->e:Lr5/f;

    invoke-virtual {v0}, Lr5/f;->buildUponParameters()Lr5/f$d;

    move-result-object v0

    const-string v1, "buildUponParameters(...)"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h(Landroid/content/Context;)Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 6

    .line 1
    iget-object v0, p0, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    new-instance v1, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v2, "android.intent.action.MEDIA_BUTTON"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/high16 v2, 0x4000000

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v3, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat;

    .line 26
    .line 27
    const-string v4, "BetterPlayer"

    .line 28
    .line 29
    invoke-direct {v2, p1, v4, v1}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lpa/b$b;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Lpa/b$b;-><init>(Lpa/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->f(Landroid/support/v4/media/session/MediaSessionCompat$a;Landroid/os/Handler;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-virtual {v2, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lb4/a;

    .line 45
    .line 46
    invoke-direct {v0, v2}, Lb4/a;-><init>(Landroid/support/v4/media/session/MediaSessionCompat;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lpa/b;->c:Lv3/d0;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object v4, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 54
    .line 55
    iget-object v5, v0, Lb4/a;->b:Landroid/os/Looper;

    .line 56
    .line 57
    if-ne v4, v5, :cond_2

    .line 58
    .line 59
    :cond_1
    move v3, p1

    .line 60
    :cond_2
    invoke-static {v3}, Lx6/b;->q(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v0, Lb4/a;->i:Lv3/f1;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    iget-object v3, v0, Lb4/a;->c:Lb4/a$b;

    .line 68
    .line 69
    invoke-interface {p1, v3}, Lv3/f1;->h(Lv3/f1$c;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iput-object v1, v0, Lb4/a;->i:Lv3/f1;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    iget-object p1, v0, Lb4/a;->c:Lb4/a$b;

    .line 77
    .line 78
    invoke-virtual {v1, p1}, Lv3/d0;->s(Lv3/f1$c;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {v0}, Lb4/a;->c()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lb4/a;->b()V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_5
    return-object v0
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
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lpa/b;->c:Lv3/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lpa/b;->g:Landroid/view/Surface;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 21

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    const-string v0, "title"

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    invoke-static {v1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "activityName"

    .line 11
    .line 12
    move-object/from16 v3, p6

    .line 13
    .line 14
    invoke-static {v3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v12, Lpa/b$d;

    .line 18
    .line 19
    move-object v0, v12

    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    move-object/from16 v4, p3

    .line 23
    .line 24
    move-object/from16 v5, p4

    .line 25
    .line 26
    move-object/from16 v6, p0

    .line 27
    .line 28
    invoke-direct/range {v0 .. v6}, Lpa/b$d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpa/b;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "BETTER_PLAYER_NOTIFICATION"

    .line 32
    .line 33
    if-nez p5, :cond_0

    .line 34
    .line 35
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 v2, 0x1a

    .line 38
    .line 39
    if-lt v1, v2, :cond_0

    .line 40
    .line 41
    new-instance v1, Landroid/app/NotificationChannel;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, v0, v0, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-class v2, Landroid/app/NotificationManager;

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroid/app/NotificationManager;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 61
    .line 62
    .line 63
    move-object v10, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object/from16 v3, p1

    .line 66
    .line 67
    move-object/from16 v10, p5

    .line 68
    .line 69
    :goto_0
    const v11, 0x13cf4ed

    .line 70
    .line 71
    .line 72
    invoke-static {v10}, Lec/i;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const v13, 0x7f0800aa

    .line 76
    .line 77
    .line 78
    const v14, 0x7f0800a7

    .line 79
    .line 80
    .line 81
    const v15, 0x7f0800a6

    .line 82
    .line 83
    .line 84
    const v16, 0x7f0800ab

    .line 85
    .line 86
    .line 87
    const v17, 0x7f0800a9

    .line 88
    .line 89
    .line 90
    const v18, 0x7f0800a4

    .line 91
    .line 92
    .line 93
    const v19, 0x7f0800a8

    .line 94
    .line 95
    .line 96
    const v20, 0x7f0800a5

    .line 97
    .line 98
    .line 99
    new-instance v0, Ls5/c;

    .line 100
    .line 101
    move-object v8, v0

    .line 102
    move-object/from16 v9, p1

    .line 103
    .line 104
    invoke-direct/range {v8 .. v20}, Ls5/c;-><init>(Landroid/content/Context;Ljava/lang/String;ILs5/c$c;IIIIIIII)V

    .line 105
    .line 106
    .line 107
    iput-object v0, v7, Lpa/b;->i:Ls5/c;

    .line 108
    .line 109
    iget-object v1, v7, Lpa/b;->c:Lv3/d0;

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    new-instance v4, Lv3/j0;

    .line 115
    .line 116
    invoke-direct {v4, v1}, Lv3/j0;-><init>(Lv3/d0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Ls5/c;->b(Lv3/j0;)V

    .line 120
    .line 121
    .line 122
    iget-boolean v1, v0, Ls5/c;->u:Z

    .line 123
    .line 124
    if-eqz v1, :cond_1

    .line 125
    .line 126
    iput-boolean v2, v0, Ls5/c;->u:Z

    .line 127
    .line 128
    iget-boolean v1, v0, Ls5/c;->q:Z

    .line 129
    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_1

    .line 139
    .line 140
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 143
    .line 144
    .line 145
    :cond_1
    iget-boolean v1, v0, Ls5/c;->t:Z

    .line 146
    .line 147
    if-eqz v1, :cond_2

    .line 148
    .line 149
    iput-boolean v2, v0, Ls5/c;->t:Z

    .line 150
    .line 151
    iget-boolean v1, v0, Ls5/c;->q:Z

    .line 152
    .line 153
    if-eqz v1, :cond_2

    .line 154
    .line 155
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_2

    .line 162
    .line 163
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 166
    .line 167
    .line 168
    :cond_2
    iget-boolean v1, v0, Ls5/c;->y:Z

    .line 169
    .line 170
    if-nez v1, :cond_3

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_3
    iput-boolean v2, v0, Ls5/c;->y:Z

    .line 174
    .line 175
    iget-boolean v1, v0, Ls5/c;->q:Z

    .line 176
    .line 177
    if-eqz v1, :cond_4

    .line 178
    .line 179
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_4

    .line 186
    .line 187
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 190
    .line 191
    .line 192
    :cond_4
    :goto_1
    invoke-virtual/range {p0 .. p1}, Lpa/b;->h(Landroid/content/Context;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 199
    .line 200
    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat$c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 201
    .line 202
    iget-object v3, v0, Ls5/c;->s:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 203
    .line 204
    invoke-static {v3, v1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_5

    .line 209
    .line 210
    iput-object v1, v0, Ls5/c;->s:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 211
    .line 212
    iget-boolean v1, v0, Ls5/c;->q:Z

    .line 213
    .line 214
    if-eqz v1, :cond_5

    .line 215
    .line 216
    iget-object v1, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_5

    .line 223
    .line 224
    iget-object v0, v0, Ls5/c;->e:Landroid/os/Handler;

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 227
    .line 228
    .line 229
    :cond_5
    new-instance v0, Landroid/os/Handler;

    .line 230
    .line 231
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 236
    .line 237
    .line 238
    iput-object v0, v7, Lpa/b;->j:Landroid/os/Handler;

    .line 239
    .line 240
    new-instance v1, Lb/d;

    .line 241
    .line 242
    const/16 v2, 0x16

    .line 243
    .line 244
    invoke-direct {v1, v7, v2}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 245
    .line 246
    .line 247
    iput-object v1, v7, Lpa/b;->k:Lb/d;

    .line 248
    .line 249
    const-wide/16 v2, 0x0

    .line 250
    .line 251
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 252
    .line 253
    .line 254
    new-instance v0, Lpa/b$c;

    .line 255
    .line 256
    invoke-direct {v0, v7}, Lpa/b$c;-><init>(Lpa/b;)V

    .line 257
    .line 258
    .line 259
    iput-object v0, v7, Lpa/b;->l:Lpa/b$c;

    .line 260
    .line 261
    iget-object v1, v7, Lpa/b;->c:Lv3/d0;

    .line 262
    .line 263
    if-eqz v1, :cond_6

    .line 264
    .line 265
    iget-object v1, v1, Lv3/d0;->l:Lv5/l;

    .line 266
    .line 267
    invoke-virtual {v1, v0}, Lv5/l;->a(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    :cond_6
    iget-object v0, v7, Lpa/b;->c:Lv3/d0;

    .line 271
    .line 272
    if-eqz v0, :cond_7

    .line 273
    .line 274
    const/4 v1, 0x5

    .line 275
    invoke-virtual {v0, v1, v2, v3}, Lv3/e;->T(IJ)V

    .line 276
    .line 277
    .line 278
    :cond_7
    return-void
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
