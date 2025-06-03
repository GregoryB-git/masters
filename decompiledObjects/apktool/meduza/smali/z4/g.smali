.class public final synthetic Lz4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Lz4/h;


# direct methods
.method public synthetic constructor <init>(Lz4/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/g;->a:Lz4/h;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lz4/g;->a:Lz4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    if-eq v1, v2, :cond_4

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v1, v3, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-eq v1, v3, :cond_1

    .line 21
    .line 22
    const/4 v3, 0x5

    .line 23
    if-ne v1, v3, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 26
    .line 27
    sget v1, Lv5/e0;->a:I

    .line 28
    .line 29
    check-cast p1, Ljava/util/Set;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lz4/h;->I(Ljava/util/Set;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-virtual {v0}, Lz4/h;->Q()V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 48
    .line 49
    sget v1, Lv5/e0;->a:I

    .line 50
    .line 51
    check-cast p1, Lz4/h$e;

    .line 52
    .line 53
    iget-object v1, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lz4/e0;

    .line 56
    .line 57
    iput-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 62
    .line 63
    sget v1, Lv5/e0;->a:I

    .line 64
    .line 65
    check-cast p1, Lz4/h$e;

    .line 66
    .line 67
    iget-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 68
    .line 69
    iget v3, p1, Lz4/h$e;->a:I

    .line 70
    .line 71
    add-int/lit8 v4, v3, 0x1

    .line 72
    .line 73
    invoke-interface {v1, v3, v4}, Lz4/e0;->a(II)Lz4/e0$a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 78
    .line 79
    iget-object v3, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v1, v3, v2}, Lz4/e0$a;->e(II)Lz4/e0$a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 92
    .line 93
    iget v1, p1, Lz4/h$e;->a:I

    .line 94
    .line 95
    iget-object v3, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    iget-object v6, v0, Lz4/h;->v:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lz4/h$d;

    .line 118
    .line 119
    iget v6, v6, Lz4/h$d;->e:I

    .line 120
    .line 121
    iget-object v7, v0, Lz4/h;->v:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Lz4/h$d;

    .line 128
    .line 129
    invoke-virtual {v7, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :goto_0
    if-gt v4, v5, :cond_7

    .line 133
    .line 134
    iget-object v1, v0, Lz4/h;->v:Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lz4/h$d;

    .line 141
    .line 142
    iput v4, v1, Lz4/h$d;->d:I

    .line 143
    .line 144
    iput v6, v1, Lz4/h$d;->e:I

    .line 145
    .line 146
    iget-object v1, v1, Lz4/h$d;->a:Lz4/p;

    .line 147
    .line 148
    iget-object v1, v1, Lz4/p;->w:Lz4/p$a;

    .line 149
    .line 150
    invoke-virtual {v1}, Lz4/l;->o()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/2addr v6, v1

    .line 155
    add-int/lit8 v4, v4, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    sget v1, Lv5/e0;->a:I

    .line 161
    .line 162
    check-cast p1, Lz4/h$e;

    .line 163
    .line 164
    iget v1, p1, Lz4/h$e;->a:I

    .line 165
    .line 166
    iget-object v3, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-nez v1, :cond_5

    .line 175
    .line 176
    iget-object v4, v0, Lz4/h;->D:Lz4/e0;

    .line 177
    .line 178
    invoke-interface {v4}, Lz4/e0;->getLength()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-ne v3, v4, :cond_5

    .line 183
    .line 184
    iget-object v4, v0, Lz4/h;->D:Lz4/e0;

    .line 185
    .line 186
    invoke-interface {v4}, Lz4/e0;->g()Lz4/e0$a;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    goto :goto_1

    .line 191
    :cond_5
    iget-object v4, v0, Lz4/h;->D:Lz4/e0;

    .line 192
    .line 193
    invoke-interface {v4, v1, v3}, Lz4/e0;->a(II)Lz4/e0$a;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    :goto_1
    iput-object v4, v0, Lz4/h;->D:Lz4/e0;

    .line 198
    .line 199
    sub-int/2addr v3, v2

    .line 200
    :goto_2
    if-lt v3, v1, :cond_7

    .line 201
    .line 202
    iget-object v4, v0, Lz4/h;->v:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    check-cast v4, Lz4/h$d;

    .line 209
    .line 210
    iget-object v5, v0, Lz4/h;->x:Ljava/util/HashMap;

    .line 211
    .line 212
    iget-object v6, v4, Lz4/h$d;->b:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    iget-object v5, v4, Lz4/h$d;->a:Lz4/p;

    .line 218
    .line 219
    iget-object v5, v5, Lz4/p;->w:Lz4/p$a;

    .line 220
    .line 221
    invoke-virtual {v5}, Lz4/l;->o()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    neg-int v5, v5

    .line 226
    const/4 v6, -0x1

    .line 227
    invoke-virtual {v0, v3, v6, v5}, Lz4/h;->F(III)V

    .line 228
    .line 229
    .line 230
    iput-boolean v2, v4, Lz4/h$d;->f:Z

    .line 231
    .line 232
    invoke-virtual {v0, v4}, Lz4/h;->J(Lz4/h$d;)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v3, v3, -0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 239
    .line 240
    sget v1, Lv5/e0;->a:I

    .line 241
    .line 242
    check-cast p1, Lz4/h$e;

    .line 243
    .line 244
    iget-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 245
    .line 246
    iget v3, p1, Lz4/h$e;->a:I

    .line 247
    .line 248
    iget-object v4, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v4, Ljava/util/Collection;

    .line 251
    .line 252
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-interface {v1, v3, v4}, Lz4/e0;->e(II)Lz4/e0$a;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iput-object v1, v0, Lz4/h;->D:Lz4/e0;

    .line 261
    .line 262
    iget v1, p1, Lz4/h$e;->a:I

    .line 263
    .line 264
    iget-object v3, p1, Lz4/h$e;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v3, Ljava/util/Collection;

    .line 267
    .line 268
    invoke-virtual {v0, v1, v3}, Lz4/h;->D(ILjava/util/Collection;)V

    .line 269
    .line 270
    .line 271
    :cond_7
    :goto_3
    iget-object p1, p1, Lz4/h$e;->c:Lz4/h$c;

    .line 272
    .line 273
    invoke-virtual {v0, p1}, Lz4/h;->N(Lz4/h$c;)V

    .line 274
    .line 275
    .line 276
    :goto_4
    return v2
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
