.class public final Ll3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/b;
.implements Le7/f1;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le7/i6;Ljava/lang/String;Le7/n6;)V
    .locals 0

    iput-object p2, p0, Ll3/j;->a:Ljava/lang/Object;

    iput-object p3, p0, Ll3/j;->b:Ljava/lang/Object;

    iput-object p1, p0, Ll3/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll3/j;->a:Ljava/lang/Object;

    iput-object p2, p0, Ll3/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Ll3/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj9/i;Lk9/m;)Lk9/f;
    .locals 7

    new-instance v6, Lk9/l;

    iget-object v0, p0, Ll3/j;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj9/n;

    iget-object v0, p0, Ll3/j;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lk9/d;

    iget-object v0, p0, Ll3/j;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lk9/l;-><init>(Lj9/i;Lj9/n;Lk9/d;Lk9/m;Ljava/util/List;)V

    return-object v6
.end method

.method public final c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 4

    .line 1
    iget-object p1, p0, Ll3/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Le7/i6;

    .line 4
    .line 5
    iget-object p5, p0, Ll3/j;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p5, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p0, Ll3/j;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Le7/n6;

    .line 12
    .line 13
    invoke-static {p1}, La0/j;->q(Le7/i6;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    :try_start_0
    new-array p4, v1, [B

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p2

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    :goto_0
    const/16 v2, 0xc8

    .line 26
    .line 27
    if-eq p2, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0xcc

    .line 30
    .line 31
    if-ne p2, v2, :cond_3

    .line 32
    .line 33
    :cond_1
    if-nez p3, :cond_3

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object p3, p1, Le7/i6;->c:Le7/o;

    .line 38
    .line 39
    invoke-static {p3}, Le7/i6;->q(Le7/h6;)V

    .line 40
    .line 41
    .line 42
    iget-wide v2, v0, Le7/n6;->a:J

    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-virtual {p3, p4}, Le7/o;->K(Ljava/lang/Long;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p1}, Le7/i6;->zzj()Le7/a1;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iget-object p3, p3, Le7/a1;->w:Le7/b1;

    .line 56
    .line 57
    const-string p4, "Successfully uploaded batch from upload queue. appId, status"

    .line 58
    .line 59
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p3, p4, p5, p2}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Le7/i6;->R()Le7/h;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    sget-object p3, Le7/h0;->I0:Le7/m0;

    .line 71
    .line 72
    const/4 p4, 0x0

    .line 73
    invoke-virtual {p2, p4, p3}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    iget-object p2, p1, Le7/i6;->b:Le7/g1;

    .line 80
    .line 81
    invoke-static {p2}, Le7/i6;->q(Le7/h6;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Le7/g1;->u()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    iget-object p2, p1, Le7/i6;->c:Le7/o;

    .line 91
    .line 92
    invoke-static {p2}, Le7/i6;->q(Le7/h6;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p5}, Le7/o;->z0(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1, p5}, Le7/i6;->S(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    new-instance v2, Ljava/lang/String;

    .line 106
    .line 107
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 108
    .line 109
    invoke-direct {v2, p4, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 110
    .line 111
    .line 112
    const/16 p4, 0x20

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result p4

    .line 122
    invoke-virtual {v2, v1, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-virtual {p1}, Le7/i6;->zzj()Le7/a1;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-object v2, v2, Le7/a1;->t:Le7/b1;

    .line 131
    .line 132
    const-string v3, "Network upload failed. Will retry later. appId, status, error"

    .line 133
    .line 134
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-nez p3, :cond_4

    .line 139
    .line 140
    move-object p3, p4

    .line 141
    :cond_4
    invoke-virtual {v2, p5, p2, p3, v3}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    iget-object p2, p1, Le7/i6;->c:Le7/o;

    .line 147
    .line 148
    invoke-static {p2}, Le7/i6;->q(Le7/h6;)V

    .line 149
    .line 150
    .line 151
    iget-wide p3, v0, Le7/n6;->a:J

    .line 152
    .line 153
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-virtual {p2, p3}, Le7/o;->e0(Ljava/lang/Long;)V

    .line 158
    .line 159
    .line 160
    :cond_5
    invoke-virtual {p1}, Le7/i6;->F()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    .line 163
    :goto_1
    iput-boolean v1, p1, Le7/i6;->C:Z

    .line 164
    .line 165
    invoke-virtual {p1}, Le7/i6;->C()V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :goto_2
    iput-boolean v1, p1, Le7/i6;->C:Z

    .line 170
    .line 171
    invoke-virtual {p1}, Le7/i6;->C()V

    .line 172
    .line 173
    .line 174
    throw p2
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
.end method

.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ll3/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqb/a;

    .line 4
    .line 5
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v1, p0, Ll3/j;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lqb/a;

    .line 14
    .line 15
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lt3/a;

    .line 20
    .line 21
    iget-object v2, p0, Ll3/j;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lqb/a;

    .line 24
    .line 25
    invoke-interface {v2}, Lqb/a;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lt3/a;

    .line 30
    .line 31
    new-instance v3, Ll3/i;

    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2}, Ll3/i;-><init>(Landroid/content/Context;Lt3/a;Lt3/a;)V

    .line 34
    .line 35
    .line 36
    return-object v3
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

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object p1, p0, Ll3/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 4
    .line 5
    iget-object v0, p0, Ll3/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Ll3/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->f()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lcom/google/firebase/iid/FirebaseInstanceId;->j:Lcom/google/firebase/iid/a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->g()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    monitor-enter v3

    .line 24
    :try_start_0
    iget-object v5, v3, Lcom/google/firebase/iid/a;->a:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    invoke-static {v4, v0, v1}, Lcom/google/firebase/iid/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-interface {v5, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, Lcom/google/firebase/iid/a$a;->b(Ljava/lang/String;)Lcom/google/firebase/iid/a$a;

    .line 36
    .line 37
    .line 38
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    monitor-exit v3

    .line 40
    invoke-virtual {p1, v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->k(Lcom/google/firebase/iid/a$a;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    new-instance p1, Lr9/g;

    .line 47
    .line 48
    iget-object v0, v4, Lcom/google/firebase/iid/a$a;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lr9/g;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_0
    iget-object v3, p1, Lcom/google/firebase/iid/FirebaseInstanceId;->e:Lr9/i;

    .line 60
    .line 61
    monitor-enter v3

    .line 62
    :try_start_1
    new-instance v5, Landroid/util/Pair;

    .line 63
    .line 64
    invoke-direct {v5, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v7, v3, Lr9/i;->b:Lr/b;

    .line 68
    .line 69
    invoke-virtual {v7, v5, v6}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Lcom/google/android/gms/tasks/Task;

    .line 74
    .line 75
    const/4 v7, 0x3

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    const-string p1, "FirebaseInstanceId"

    .line 79
    .line 80
    invoke-static {p1, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1d

    .line 97
    .line 98
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 99
    .line 100
    .line 101
    const-string v0, "Joining ongoing request for: "

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p1, "FirebaseInstanceId"

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    :cond_1
    move-object p1, v6

    .line 119
    goto :goto_0

    .line 120
    :cond_2
    const-string v6, "FirebaseInstanceId"

    .line 121
    .line 122
    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_3

    .line 127
    .line 128
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    new-instance v8, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    add-int/lit8 v7, v7, 0x18

    .line 139
    .line 140
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 141
    .line 142
    .line 143
    const-string v7, "Making new request for: "

    .line 144
    .line 145
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v6, "FirebaseInstanceId"

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    :cond_3
    iget-object v6, p1, Lcom/google/firebase/iid/FirebaseInstanceId;->d:Lr9/e;

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v7, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v7, v2, v0, v1}, Lr9/e;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    sget-object v8, Lr9/a;->a:Lr9/a;

    .line 175
    .line 176
    new-instance v9, Lb1/v;

    .line 177
    .line 178
    invoke-direct {v9, v6}, Lb1/v;-><init>(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iget-object v7, p1, Lcom/google/firebase/iid/FirebaseInstanceId;->a:Ljava/util/concurrent/Executor;

    .line 186
    .line 187
    new-instance v8, Lz5/j;

    .line 188
    .line 189
    invoke-direct {v8, p1, v1, v2, v0}, Lz5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v1, Lr9/d;->a:Lr9/d;

    .line 197
    .line 198
    new-instance v2, Lr4/c;

    .line 199
    .line 200
    const/4 v6, 0x7

    .line 201
    invoke-direct {v2, v6, p1, v4}, Lr4/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object v0, v3, Lr9/i;->a:Ljava/util/concurrent/Executor;

    .line 209
    .line 210
    new-instance v1, Ll/l;

    .line 211
    .line 212
    invoke-direct {v1, v6, v3, v5}, Ll/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget-object v0, v3, Lr9/i;->b:Lr/b;

    .line 220
    .line 221
    invoke-virtual {v0, v5, p1}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    .line 223
    .line 224
    :goto_0
    monitor-exit v3

    .line 225
    :goto_1
    return-object p1

    .line 226
    :catchall_0
    move-exception p1

    .line 227
    monitor-exit v3

    .line 228
    throw p1

    .line 229
    :catchall_1
    move-exception p1

    .line 230
    monitor-exit v3

    .line 231
    throw p1
    .line 232
    .line 233
.end method
