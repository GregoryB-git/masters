.class public final Ld5/d;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"

# interfaces
.implements Lt5/f0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld5/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/xml/sax/helpers/DefaultHandler;",
        "Lt5/f0$a<",
        "Ld5/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:[I


# instance fields
.field public final a:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\d+)(?:/(\\d+))?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ld5/d;->b:Ljava/util/regex/Pattern;

    const-string v0, "CC([1-4])=.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ld5/d;->c:Ljava/util/regex/Pattern;

    const-string v0, "([1-9]|[1-5][0-9]|6[0-3])=.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ld5/d;->d:Ljava/util/regex/Pattern;

    const/16 v0, 0x15

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ld5/d;->e:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        0x2
        0x3
        0x4
        0x7
        0x8
        0x18
        0x8
        0xc
        0xa
        0xc
        0xe
        0xc
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    iput-object v0, p0, Ld5/d;->a:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static b(Ljava/util/ArrayList;JJIJ)J
    .locals 2

    .line 1
    if-ltz p5, :cond_0

    .line 2
    .line 3
    add-int/lit8 p5, p5, 0x1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p6, p1

    .line 7
    sget p5, Lv5/e0;->a:I

    .line 8
    .line 9
    add-long/2addr p6, p3

    .line 10
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    sub-long/2addr p6, v0

    .line 13
    div-long/2addr p6, p3

    .line 14
    long-to-int p5, p6

    .line 15
    :goto_0
    const/4 p6, 0x0

    .line 16
    :goto_1
    if-ge p6, p5, :cond_1

    .line 17
    .line 18
    new-instance p7, Ld5/k$d;

    .line 19
    .line 20
    invoke-direct {p7, p1, p2, p3, p4}, Ld5/k$d;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-long/2addr p1, p3

    .line 27
    add-int/lit8 p6, p6, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    return-wide p1
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
.end method

.method public static c(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    invoke-static {p0}, Lp2/m0;->U(Lorg/xmlpull/v1/XmlPullParser;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    move v1, v0

    :cond_1
    :goto_0
    if-eqz v1, :cond_4

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    invoke-static {p0}, Lp2/m0;->U(Lorg/xmlpull/v1/XmlPullParser;)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    move v2, v0

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static d(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "schemeIdUri"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x6

    .line 19
    const/4 v4, -0x1

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x3

    .line 24
    sparse-switch v2, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_0
    const-string v2, "urn:dolby:dash:audio_channel_configuration:2011"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v1, v3

    .line 38
    goto :goto_1

    .line 39
    :sswitch_1
    const-string v2, "tag:dts.com,2018:uhd:audio_channel_configuration"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v1, 0x5

    .line 49
    goto :goto_1

    .line 50
    :sswitch_2
    const-string v2, "tag:dts.com,2014:dash:audio_channel_configuration:2012"

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/4 v1, 0x4

    .line 60
    goto :goto_1

    .line 61
    :sswitch_3
    const-string v2, "urn:mpeg:mpegB:cicp:ChannelConfiguration"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    move v1, v8

    .line 71
    goto :goto_1

    .line 72
    :sswitch_4
    const-string v2, "tag:dolby.com,2014:dash:audio_channel_configuration:2011"

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    move v1, v6

    .line 82
    goto :goto_1

    .line 83
    :sswitch_5
    const-string v2, "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    move v1, v5

    .line 93
    goto :goto_1

    .line 94
    :sswitch_6
    const-string v2, "urn:dts:dash:audio_channel_configuration:2012"

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_7

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    move v1, v7

    .line 104
    goto :goto_1

    .line 105
    :goto_0
    move v1, v4

    .line 106
    :goto_1
    const-string v2, "value"

    .line 107
    .line 108
    packed-switch v1, :pswitch_data_0

    .line 109
    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :pswitch_0
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    goto/16 :goto_7

    .line 120
    .line 121
    :cond_8
    const/16 v1, 0x10

    .line 122
    .line 123
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_9

    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_9
    :goto_2
    move v4, v0

    .line 136
    goto/16 :goto_7

    .line 137
    .line 138
    :pswitch_1
    invoke-static {p0, v2, v4}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-ltz v0, :cond_f

    .line 143
    .line 144
    sget-object v1, Ld5/d;->e:[I

    .line 145
    .line 146
    array-length v2, v1

    .line 147
    if-ge v0, v2, :cond_f

    .line 148
    .line 149
    aget v4, v1, v0

    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    :pswitch_2
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-nez v0, :cond_a

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_a
    invoke-static {v0}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    sparse-switch v1, :sswitch_data_1

    .line 172
    .line 173
    .line 174
    :goto_3
    move v7, v4

    .line 175
    goto :goto_4

    .line 176
    :sswitch_7
    const-string v1, "fa01"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_b

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    move v7, v8

    .line 186
    goto :goto_4

    .line 187
    :sswitch_8
    const-string v1, "f801"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_c

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_c
    move v7, v6

    .line 197
    goto :goto_4

    .line 198
    :sswitch_9
    const-string v1, "a000"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_d

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_d
    move v7, v5

    .line 208
    goto :goto_4

    .line 209
    :sswitch_a
    const-string v1, "4000"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_e

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_e
    :goto_4
    packed-switch v7, :pswitch_data_1

    .line 219
    .line 220
    .line 221
    :goto_5
    move v3, v4

    .line 222
    goto :goto_6

    .line 223
    :pswitch_3
    const/16 v3, 0x8

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :pswitch_4
    move v3, v6

    .line 227
    goto :goto_6

    .line 228
    :pswitch_5
    move v3, v5

    .line 229
    :goto_6
    :pswitch_6
    move v4, v3

    .line 230
    goto :goto_7

    .line 231
    :pswitch_7
    invoke-static {p0, v2, v4}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    goto :goto_7

    .line 236
    :pswitch_8
    invoke-static {p0, v2, v4}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-lez v0, :cond_f

    .line 241
    .line 242
    const/16 v1, 0x21

    .line 243
    .line 244
    if-ge v0, v1, :cond_f

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_f
    :goto_7
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 248
    .line 249
    .line 250
    const-string v0, "AudioChannelConfiguration"

    .line 251
    .line 252
    invoke-static {p0, v0}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_f

    .line 257
    .line 258
    return v4

    .line 259
    :sswitch_data_0
    .sparse-switch
        -0x7ee09c90 -> :sswitch_6
        -0x50a2db6e -> :sswitch_5
        -0x43d6a909 -> :sswitch_4
        -0x3aced4cf -> :sswitch_3
        -0x4b58cf3 -> :sswitch_2
        0x129b7989 -> :sswitch_1
        0x79657164 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_0
        :pswitch_2
    .end packed-switch

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
    :sswitch_data_1
    .sparse-switch
        0x185d7c -> :sswitch_a
        0x2cd22f -> :sswitch_9
        0x2f3613 -> :sswitch_8
        0x2fcffc -> :sswitch_7
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
    .end packed-switch
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

.method public static e(Lorg/xmlpull/v1/XmlPullParser;J)J
    .locals 2

    const/4 v0, 0x0

    const-string v1, "availabilityTimeOffset"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-wide p1

    :cond_0
    const-string p1, "INF"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide p0, 0x7fffffffffffffffL

    return-wide p0

    :cond_1
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const p1, 0x49742400    # 1000000.0f

    mul-float/2addr p0, p1

    float-to-long p0, p0

    return-wide p0
.end method

.method public static f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/ArrayList;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "dvb:priority"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/high16 v1, -0x80000000

    .line 21
    .line 22
    :goto_0
    const-string v3, "dvb:weight"

    .line 23
    .line 24
    invoke-interface {p0, v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v3, v2

    .line 36
    :goto_1
    const-string v4, "serviceLocation"

    .line 37
    .line 38
    invoke-interface {p0, v0, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v4, ""

    .line 43
    .line 44
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const/4 v6, 0x4

    .line 52
    if-ne v5, v6, :cond_4

    .line 53
    .line 54
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    invoke-static {p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 60
    .line 61
    .line 62
    :goto_2
    const-string v5, "BaseURL"

    .line 63
    .line 64
    invoke-static {p0, v5}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    invoke-static {v4}, Lv5/d0;->a(Ljava/lang/String;)[I

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    aget v5, v5, p0

    .line 78
    .line 79
    const/4 v6, -0x1

    .line 80
    if-eq v5, v6, :cond_5

    .line 81
    .line 82
    move v5, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v5, p0

    .line 85
    :goto_3
    if-eqz v5, :cond_7

    .line 86
    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    move-object v0, v4

    .line 90
    :cond_6
    new-array p1, v2, [Ld5/b;

    .line 91
    .line 92
    new-instance p2, Ld5/b;

    .line 93
    .line 94
    invoke-direct {p2, v4, v0, v1, v3}, Ld5/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    aput-object p2, p1, p0

    .line 98
    .line 99
    invoke-static {p1}, Lo7/c0;->c([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-ge p0, v5, :cond_a

    .line 114
    .line 115
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Ld5/b;

    .line 120
    .line 121
    iget-object v6, v5, Ld5/b;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v6, v4}, Lv5/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-nez v0, :cond_8

    .line 128
    .line 129
    move-object v7, v6

    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move-object v7, v0

    .line 132
    :goto_5
    if-eqz p2, :cond_9

    .line 133
    .line 134
    iget v1, v5, Ld5/b;->c:I

    .line 135
    .line 136
    iget v3, v5, Ld5/b;->d:I

    .line 137
    .line 138
    iget-object v7, v5, Ld5/b;->b:Ljava/lang/String;

    .line 139
    .line 140
    :cond_9
    new-instance v5, Ld5/b;

    .line 141
    .line 142
    invoke-direct {v5, v6, v7, v1, v3}, Ld5/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    add-int/lit8 p0, p0, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_a
    return-object v2
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

.method public static g(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "schemeIdUri"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0x3a

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, -0x1

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v1, :cond_8

    .line 14
    .line 15
    invoke-static {v1}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    sparse-switch v6, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    :goto_0
    move v1, v4

    .line 30
    goto :goto_1

    .line 31
    :sswitch_0
    const-string v6, "urn:mpeg:dash:mp4protection:2011"

    .line 32
    .line 33
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x3

    .line 41
    goto :goto_1

    .line 42
    :sswitch_1
    const-string v6, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 43
    .line 44
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x2

    .line 52
    goto :goto_1

    .line 53
    :sswitch_2
    const-string v6, "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"

    .line 54
    .line 55
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v1, v5

    .line 63
    goto :goto_1

    .line 64
    :sswitch_3
    const-string v6, "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"

    .line 65
    .line 66
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v1, v3

    .line 74
    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :pswitch_0
    const-string v1, "value"

    .line 80
    .line 81
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    move v7, v3

    .line 90
    :goto_2
    if-ge v7, v6, :cond_6

    .line 91
    .line 92
    invoke-interface {p0, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v8, v2}, Ljava/lang/String;->indexOf(I)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-ne v9, v4, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 104
    .line 105
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    :goto_3
    const-string v9, "default_KID"

    .line 110
    .line 111
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_5

    .line 116
    .line 117
    invoke-interface {p0, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_4

    .line 122
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move-object v6, v0

    .line 126
    :goto_4
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-nez v7, :cond_9

    .line 131
    .line 132
    const-string v7, "00000000-0000-0000-0000-000000000000"

    .line 133
    .line 134
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_9

    .line 139
    .line 140
    const-string v7, "\\s+"

    .line 141
    .line 142
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    array-length v7, v6

    .line 147
    new-array v7, v7, [Ljava/util/UUID;

    .line 148
    .line 149
    move v8, v3

    .line 150
    :goto_5
    array-length v9, v6

    .line 151
    if-ge v8, v9, :cond_7

    .line 152
    .line 153
    aget-object v9, v6, v8

    .line 154
    .line 155
    invoke-static {v9}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    aput-object v9, v7, v8

    .line 160
    .line 161
    add-int/lit8 v8, v8, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    sget-object v6, Lv3/h;->b:Ljava/util/UUID;

    .line 165
    .line 166
    invoke-static {v6, v7, v0}, Lk4/h;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    move-object v8, v0

    .line 171
    goto :goto_9

    .line 172
    :pswitch_1
    sget-object v1, Lv3/h;->d:Ljava/util/UUID;

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :pswitch_2
    sget-object v1, Lv3/h;->e:Ljava/util/UUID;

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :pswitch_3
    sget-object v1, Lv3/h;->c:Ljava/util/UUID;

    .line 179
    .line 180
    :goto_6
    move-object v6, v1

    .line 181
    move-object v1, v0

    .line 182
    goto :goto_8

    .line 183
    :cond_8
    :goto_7
    move-object v1, v0

    .line 184
    :cond_9
    move-object v6, v0

    .line 185
    :goto_8
    move-object v7, v0

    .line 186
    move-object v8, v7

    .line 187
    :cond_a
    :goto_9
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 188
    .line 189
    .line 190
    const-string v9, "clearkey:Laurl"

    .line 191
    .line 192
    invoke-static {p0, v9}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    const/4 v10, 0x4

    .line 197
    if-eqz v9, :cond_b

    .line 198
    .line 199
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-ne v9, v10, :cond_b

    .line 204
    .line 205
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    goto/16 :goto_d

    .line 210
    .line 211
    :cond_b
    const-string v9, "ms:laurl"

    .line 212
    .line 213
    invoke-static {p0, v9}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eqz v9, :cond_c

    .line 218
    .line 219
    const-string v8, "licenseUrl"

    .line 220
    .line 221
    invoke-interface {p0, v0, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    goto/16 :goto_d

    .line 226
    .line 227
    :cond_c
    if-nez v7, :cond_11

    .line 228
    .line 229
    invoke-static {p0}, Lp2/m0;->U(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    if-eqz v9, :cond_e

    .line 234
    .line 235
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-virtual {v9, v2}, Ljava/lang/String;->indexOf(I)I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    if-ne v11, v4, :cond_d

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 247
    .line 248
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    :goto_a
    const-string v11, "pssh"

    .line 253
    .line 254
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    if-eqz v9, :cond_e

    .line 259
    .line 260
    move v9, v5

    .line 261
    goto :goto_b

    .line 262
    :cond_e
    move v9, v3

    .line 263
    :goto_b
    if-eqz v9, :cond_11

    .line 264
    .line 265
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-ne v9, v10, :cond_11

    .line 270
    .line 271
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-static {v6, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-static {v6}, Lk4/h;->b([B)Lk4/h$a;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    if-nez v7, :cond_f

    .line 284
    .line 285
    move-object v7, v0

    .line 286
    goto :goto_c

    .line 287
    :cond_f
    iget-object v7, v7, Lk4/h$a;->a:Ljava/util/UUID;

    .line 288
    .line 289
    :goto_c
    if-nez v7, :cond_10

    .line 290
    .line 291
    const-string v6, "MpdParser"

    .line 292
    .line 293
    const-string v9, "Skipping malformed cenc:pssh data"

    .line 294
    .line 295
    invoke-static {v6, v9}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    move-object v6, v7

    .line 299
    move-object v7, v0

    .line 300
    goto :goto_d

    .line 301
    :cond_10
    move-object v12, v7

    .line 302
    move-object v7, v6

    .line 303
    move-object v6, v12

    .line 304
    goto :goto_d

    .line 305
    :cond_11
    if-nez v7, :cond_12

    .line 306
    .line 307
    sget-object v9, Lv3/h;->e:Ljava/util/UUID;

    .line 308
    .line 309
    invoke-virtual {v9, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-eqz v11, :cond_12

    .line 314
    .line 315
    const-string v11, "mspr:pro"

    .line 316
    .line 317
    invoke-static {p0, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    if-eqz v11, :cond_12

    .line 322
    .line 323
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-ne v11, v10, :cond_12

    .line 328
    .line 329
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-static {v7, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-static {v9, v0, v7}, Lk4/h;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    goto :goto_d

    .line 342
    :cond_12
    invoke-static {p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 343
    .line 344
    .line 345
    :goto_d
    const-string v9, "ContentProtection"

    .line 346
    .line 347
    invoke-static {p0, v9}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    if-eqz v9, :cond_a

    .line 352
    .line 353
    if-eqz v6, :cond_13

    .line 354
    .line 355
    new-instance v0, La4/d$b;

    .line 356
    .line 357
    const-string p0, "video/mp4"

    .line 358
    .line 359
    invoke-direct {v0, v6, v8, p0, v7}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 360
    .line 361
    .line 362
    :cond_13
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :sswitch_data_0
    .sparse-switch
        -0x7610741f -> :sswitch_3
        0x1d2c5beb -> :sswitch_2
        0x2d06c692 -> :sswitch_1
        0x6c0c9d2a -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static h(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    const/4 v0, 0x0

    const-string v1, "contentType"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "audio"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "video"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "text"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x3

    goto :goto_1

    :cond_3
    const-string v0, "image"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x4

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, -0x1

    :goto_1
    return p0
.end method

.method public static i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "schemeIdUri"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    :cond_0
    const-string v2, "value"

    .line 13
    .line 14
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    :cond_1
    const-string v3, "id"

    .line 22
    .line 23
    invoke-interface {p0, v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v0, v3

    .line 31
    :cond_3
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    new-instance p0, Ld5/e;

    .line 41
    .line 42
    invoke-direct {p0, v1, v2, v0}, Ld5/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p0
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

.method public static j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 10

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-wide p2

    :cond_0
    sget-object p1, Lv5/e0;->h:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p2

    const-wide v0, 0x408f400000000000L    # 1000.0

    const-wide v2, 0x40ac200000000000L    # 3600.0

    if-eqz p2, :cond_7

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    xor-int/2addr p0, p2

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    const-wide/16 v4, 0x0

    if-eqz p2, :cond_1

    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p2

    const-wide v6, 0x417e1852c0000000L    # 3.1556908E7

    mul-double/2addr p2, v6

    goto :goto_0

    :cond_1
    move-wide p2, v4

    :goto_0
    const/4 v6, 0x5

    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-wide v8, 0x4144103580000000L    # 2629739.0

    mul-double/2addr v6, v8

    goto :goto_1

    :cond_2
    move-wide v6, v4

    :goto_1
    add-double/2addr p2, v6

    const/4 v6, 0x7

    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-wide v8, 0x40f5180000000000L    # 86400.0

    mul-double/2addr v6, v8

    goto :goto_2

    :cond_3
    move-wide v6, v4

    :goto_2
    add-double/2addr p2, v6

    const/16 v6, 0xa

    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    mul-double/2addr v6, v2

    goto :goto_3

    :cond_4
    move-wide v6, v4

    :goto_3
    add-double/2addr p2, v6

    const/16 v2, 0xc

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide/high16 v6, 0x404e000000000000L    # 60.0

    mul-double/2addr v2, v6

    goto :goto_4

    :cond_5
    move-wide v2, v4

    :goto_4
    add-double/2addr p2, v2

    const/16 v2, 0xe

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    :cond_6
    add-double/2addr p2, v4

    mul-double/2addr p2, v0

    double-to-long p1, p2

    if-eqz p0, :cond_8

    neg-long p1, p1

    goto :goto_5

    :cond_7
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    mul-double/2addr p0, v2

    mul-double/2addr p0, v0

    double-to-long p1, p0

    :cond_8
    :goto_5
    return-wide p1
.end method

.method public static k(Lorg/xmlpull/v1/XmlPullParser;F)F
    .locals 2

    const/4 v0, 0x0

    const-string v1, "frameRate"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Ld5/d;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    int-to-float p1, p1

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p1, p0

    :cond_0
    return p1
.end method

.method public static l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    :goto_0
    return p2
.end method

.method public static m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p2

    :goto_0
    return-wide p2
.end method

.method public static n(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Ld5/c;
    .locals 135

    move-object/from16 v13, p0

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "profiles"

    .line 1
    invoke-interface {v13, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ","

    invoke-virtual {v3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 2
    :goto_0
    array-length v3, v1

    move v4, v0

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v3, :cond_2

    aget-object v6, v1, v4

    const-string v7, "urn:dvb:dash:profile:dvb-dash:"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v14, v5

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    move v14, v0

    :goto_2
    const-string v1, "availabilityStartTime"

    .line 3
    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_3

    move-wide/from16 v16, v3

    goto :goto_3

    :cond_3
    invoke-static {v1}, Lv5/e0;->L(Ljava/lang/String;)J

    move-result-wide v6

    move-wide/from16 v16, v6

    :goto_3
    const-string v1, "mediaPresentationDuration"

    .line 4
    invoke-static {v13, v1, v3, v4}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v18

    const-string v1, "minBufferTime"

    invoke-static {v13, v1, v3, v4}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v20

    const-string v1, "type"

    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "dynamic"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_4

    const-string v1, "minimumUpdatePeriod"

    invoke-static {v13, v1, v3, v4}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v6

    move-wide/from16 v23, v6

    goto :goto_4

    :cond_4
    move-wide/from16 v23, v3

    :goto_4
    if-eqz v22, :cond_5

    const-string v1, "timeShiftBufferDepth"

    invoke-static {v13, v1, v3, v4}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v6

    move-wide/from16 v25, v6

    goto :goto_5

    :cond_5
    move-wide/from16 v25, v3

    :goto_5
    if-eqz v22, :cond_6

    const-string v1, "suggestedPresentationDelay"

    invoke-static {v13, v1, v3, v4}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v6

    move-wide/from16 v27, v6

    goto :goto_6

    :cond_6
    move-wide/from16 v27, v3

    :goto_6
    const-string v1, "publishTime"

    .line 5
    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move-wide/from16 v29, v3

    goto :goto_7

    :cond_7
    invoke-static {v1}, Lv5/e0;->L(Ljava/lang/String;)J

    move-result-wide v6

    move-wide/from16 v29, v6

    :goto_7
    if-eqz v22, :cond_8

    const-wide/16 v6, 0x0

    goto :goto_8

    :cond_8
    move-wide v6, v3

    .line 6
    :goto_8
    new-instance v1, Ld5/b;

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v14, :cond_9

    move v10, v5

    goto :goto_9

    :cond_9
    const/high16 v10, -0x80000000

    :goto_9
    invoke-direct {v1, v8, v9, v10, v5}, Ld5/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-array v8, v5, [Ld5/b;

    aput-object v1, v8, v0

    invoke-static {v8}, Lo7/c0;->c([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v15

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    if-eqz v22, :cond_a

    goto :goto_a

    :cond_a
    const-wide/16 v3, 0x0

    :goto_a
    move/from16 v31, v0

    move/from16 v32, v31

    move-object/from16 v33, v2

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-wide v8, v3

    :goto_b
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v11, "BaseURL"

    invoke-static {v13, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    if-nez v31, :cond_b

    invoke-static {v13, v6, v7}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v6

    move/from16 v31, v5

    :cond_b
    invoke-static {v13, v15, v14}, Ld5/d;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_f

    :cond_c
    const-string v0, "ProgramInformation"

    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    const-string v4, "lang"

    if-eqz v1, :cond_13

    const-string v1, "moreInformationURL"

    .line 7
    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_d

    move-object/from16 v41, v2

    goto :goto_c

    :cond_d
    move-object/from16 v41, v1

    :goto_c
    invoke-interface {v13, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    move-object/from16 v42, v2

    goto :goto_d

    :cond_e
    move-object/from16 v42, v1

    :goto_d
    move-object v1, v2

    move-object v3, v1

    .line 8
    :cond_f
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v4, "Title"

    invoke-static {v13, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_10
    const-string v4, "Source"

    invoke-static {v13, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_11
    const-string v4, "Copyright"

    invoke-static {v13, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v3

    goto :goto_e

    :cond_12
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_e
    invoke-static {v13, v0}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v33, Ld5/h;

    move-object/from16 v37, v33

    move-object/from16 v38, v2

    move-object/from16 v39, v1

    move-object/from16 v40, v3

    invoke-direct/range {v37 .. v42}, Ld5/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_f

    :cond_13
    const-string v0, "UTCTiming"

    .line 9
    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    const-string v3, "value"

    const-string v1, "schemeIdUri"

    if-eqz v0, :cond_14

    .line 10
    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v13, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v2, Ld5/n;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v1}, Ld5/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v34, v2

    goto :goto_f

    :cond_14
    const-string v0, "Location"

    .line 12
    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v35

    :goto_f
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v78, v10

    move-object v3, v12

    move/from16 v81, v14

    move-object/from16 v43, v15

    goto/16 :goto_75

    :cond_15
    const-string v0, "ServiceDescription"

    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1b

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v36, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v38, -0x7fffffffffffffffL    # -4.9E-324

    const v1, -0x800001

    const v11, -0x800001

    .line 13
    :goto_10
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v5, "Latency"

    invoke-static {v13, v5}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    move/from16 v41, v1

    const-string v1, "max"

    move-wide/from16 v42, v3

    const-string v3, "min"

    if-eqz v5, :cond_16

    const-string v4, "target"

    move-wide/from16 v44, v6

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v13, v4, v5, v6}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v36

    invoke-static {v13, v3, v5, v6}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v13, v1, v5, v6}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v5

    move-wide/from16 v49, v3

    move-wide/from16 v51, v5

    move/from16 v54, v11

    move-wide/from16 v47, v36

    move/from16 v53, v41

    goto :goto_13

    :cond_16
    move-wide/from16 v44, v6

    const-string v4, "PlaybackRate"

    invoke-static {v13, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 14
    invoke-interface {v13, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_17

    const v3, -0x800001

    goto :goto_11

    :cond_17
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    :goto_11
    invoke-interface {v13, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_18

    move/from16 v53, v3

    move-wide/from16 v49, v36

    move-wide/from16 v51, v38

    move-wide/from16 v47, v42

    const v54, -0x800001

    goto :goto_13

    :cond_18
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v11

    move/from16 v53, v3

    move/from16 v54, v11

    move-wide/from16 v49, v36

    move-wide/from16 v51, v38

    goto :goto_12

    :cond_19
    move/from16 v54, v11

    move-wide/from16 v49, v36

    move-wide/from16 v51, v38

    move/from16 v53, v41

    :goto_12
    move-wide/from16 v47, v42

    .line 15
    :goto_13
    invoke-static {v13, v0}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    new-instance v0, Ld5/l;

    move-object/from16 v46, v0

    invoke-direct/range {v46 .. v54}, Ld5/l;-><init>(JJJFF)V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x1

    move-object/from16 v36, v0

    move-wide v0, v1

    move v5, v3

    move-object/from16 v78, v10

    move-object v3, v12

    move/from16 v81, v14

    move-object/from16 v43, v15

    :goto_14
    move-wide/from16 v6, v44

    goto/16 :goto_75

    :cond_1a
    move-wide/from16 v6, v44

    move-wide/from16 v3, v47

    move-wide/from16 v36, v49

    move-wide/from16 v38, v51

    move/from16 v1, v53

    move/from16 v11, v54

    goto/16 :goto_10

    :cond_1b
    move-wide/from16 v44, v6

    const-string v6, "Period"

    .line 16
    invoke-static {v13, v6}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a5

    if-nez v32, :cond_a5

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    move-object v7, v10

    goto :goto_15

    :cond_1c
    move-object v7, v15

    :goto_15
    const-string v5, "id"

    .line 17
    invoke-interface {v13, v2, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    const-string v0, "start"

    invoke-static {v13, v0, v8, v9}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v39

    move-object v2, v1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v37, v16, v0

    if-eqz v37, :cond_1d

    add-long v41, v16, v39

    goto :goto_16

    :cond_1d
    move-wide/from16 v41, v0

    :goto_16
    move-object/from16 v43, v15

    const-string v15, "duration"

    invoke-static {v13, v15, v0, v1}, Ld5/d;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v46

    move-object/from16 v37, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v48, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v49, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/16 v50, 0x0

    const/16 v51, 0x0

    move-object/from16 v54, v12

    move/from16 v52, v50

    move-object/from16 v53, v51

    move-wide/from16 v50, v0

    move-object v1, v13

    move-wide/from16 v12, v44

    :goto_17
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    invoke-static {v1, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    if-nez v52, :cond_1e

    invoke-static {v1, v12, v13}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v12

    const/16 v52, 0x1

    :cond_1e
    invoke-static {v1, v7, v14}, Ld5/d;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x1

    move-object/from16 v104, v4

    move-object/from16 v74, v7

    move-wide/from16 v128, v8

    move-object/from16 v78, v10

    move-object/from16 v119, v11

    move/from16 v81, v14

    move-object/from16 v55, v15

    move-object/from16 v59, v37

    move-object/from16 v15, v49

    move-object/from16 v58, v54

    move-object/from16 v49, v2

    move-object v14, v3

    move-object/from16 v37, v5

    move-object v2, v6

    move-object/from16 v54, v48

    goto/16 :goto_72

    :cond_1f
    const-string v0, "AdaptationSet"

    invoke-static {v1, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v55

    move-wide/from16 v56, v12

    const-string v13, "SegmentTemplate"

    const-string v12, "SegmentList"

    move-object/from16 v58, v13

    const-string v13, "SegmentBase"

    const-string v59, ""

    if-eqz v55, :cond_92

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v55

    move-object/from16 v60, v0

    if-nez v55, :cond_20

    move-object/from16 v55, v15

    goto :goto_18

    :cond_20
    move-object/from16 v55, v15

    move-object v15, v7

    :goto_18
    const/4 v0, -0x1

    .line 18
    invoke-static {v1, v5, v0}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v62

    invoke-static/range {p0 .. p0}, Ld5/d;->h(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v0

    move-object/from16 v61, v10

    const-string v10, "mimeType"

    move/from16 v63, v0

    const/4 v0, 0x0

    invoke-interface {v1, v0, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v64

    move-wide/from16 v65, v8

    const-string v8, "codecs"

    invoke-interface {v1, v0, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v67

    const-string v9, "width"

    const/4 v0, -0x1

    move-object/from16 v68, v6

    invoke-static {v1, v9, v0}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v6

    move-object/from16 v69, v7

    const-string v7, "height"

    invoke-static {v1, v7, v0}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v70, v2

    const/high16 v2, -0x40800000    # -1.0f

    invoke-static {v1, v2}, Ld5/d;->k(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v2

    move-object/from16 v71, v3

    const-string v3, "audioSamplingRate"

    move-object/from16 v72, v12

    const/4 v12, -0x1

    invoke-static {v1, v3, v12}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v12

    move-object/from16 v73, v13

    const/4 v13, 0x0

    invoke-interface {v1, v13, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v74

    move-object/from16 v75, v3

    const-string v3, "label"

    invoke-interface {v1, v13, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v76, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v77, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move/from16 v78, v12

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move/from16 v79, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move/from16 v80, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v81, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v82, -0x1

    const/16 v83, 0x0

    const/16 v84, 0x0

    move-object/from16 v87, v2

    move-object/from16 v86, v3

    move-object/from16 v85, v7

    move-wide/from16 v88, v50

    move-object/from16 v90, v53

    move-wide/from16 v2, v56

    move/from16 v7, v63

    move/from16 v63, v6

    move-object/from16 v6, v74

    move-object/from16 v74, v9

    move-object/from16 v9, p0

    :goto_19
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    invoke-static {v9, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v91

    if-eqz v91, :cond_22

    if-nez v83, :cond_21

    invoke-static {v9, v2, v3}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v2

    const/16 v83, 0x1

    :cond_21
    move-wide/from16 v91, v2

    invoke-static {v9, v15, v14}, Ld5/d;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-wide/from16 v2, v91

    move-object/from16 v91, v15

    goto/16 :goto_1e

    :cond_22
    move-object/from16 v91, v15

    const-string v15, "ContentProtection"

    invoke-static {v9, v15}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v92

    if-eqz v92, :cond_25

    invoke-static/range {p0 .. p0}, Ld5/d;->g(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v15

    move-wide/from16 v92, v2

    iget-object v2, v15, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v2, :cond_23

    move-object/from16 v84, v2

    check-cast v84, Ljava/lang/String;

    :cond_23
    iget-object v2, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v2, :cond_24

    check-cast v2, La4/d$b;

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    :goto_1a
    move-wide/from16 v2, v92

    goto :goto_1e

    :cond_25
    move-wide/from16 v92, v2

    const-string v2, "ContentComponent"

    invoke-static {v9, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2b

    const/4 v2, 0x0

    invoke-interface {v9, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v6, :cond_26

    move-object v6, v2

    goto :goto_1b

    :cond_26
    if-nez v2, :cond_27

    goto :goto_1b

    .line 19
    :cond_27
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 20
    :goto_1b
    invoke-static/range {p0 .. p0}, Ld5/d;->h(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v7, v3, :cond_28

    move v7, v2

    goto :goto_1a

    :cond_28
    if-ne v2, v3, :cond_29

    goto :goto_1a

    :cond_29
    if-ne v7, v2, :cond_2a

    const/4 v2, 0x1

    goto :goto_1c

    :cond_2a
    const/4 v2, 0x0

    .line 21
    :goto_1c
    invoke-static {v2}, Lx6/b;->H(Z)V

    goto :goto_1a

    :cond_2b
    const-string v2, "Role"

    .line 22
    invoke-static {v9, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-static {v9, v2}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v86

    :goto_1d
    move-object/from16 v86, v13

    goto/16 :goto_1f

    :cond_2c
    const-string v2, "AudioChannelConfiguration"

    invoke-static {v9, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-static/range {p0 .. p0}, Ld5/d;->d(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v82

    goto :goto_1a

    :goto_1e
    const/4 v15, 0x1

    move-object/from16 v98, v0

    move-wide/from16 v116, v2

    move-object/from16 v104, v4

    move-object/from16 v126, v5

    move-object/from16 v119, v11

    move v0, v15

    move-object/from16 v131, v58

    move-object/from16 v2, v60

    move-wide/from16 v128, v65

    move-object/from16 v127, v68

    move-object/from16 v122, v70

    move-object/from16 v125, v71

    move-object/from16 v65, v74

    move-object/from16 v3, v76

    move-object/from16 v105, v81

    move-object/from16 v92, v87

    move-object/from16 v15, p0

    move-object/from16 v66, v1

    move-object/from16 v60, v8

    move-object/from16 v71, v12

    move/from16 v81, v14

    move-object/from16 v58, v54

    move/from16 v68, v63

    move-object/from16 v74, v69

    move-object/from16 v14, v73

    move-object/from16 v76, v75

    move-object/from16 v1, v77

    move/from16 v54, v78

    move/from16 v73, v79

    move-object/from16 v69, v85

    move-object/from16 v75, v86

    move-object/from16 v86, v13

    move-object/from16 v78, v61

    move-object/from16 v13, v72

    move-object/from16 v61, v10

    goto/16 :goto_56

    :cond_2d
    const-string v3, "Accessibility"

    invoke-static {v9, v3}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v94

    if-eqz v94, :cond_2e

    invoke-static {v9, v3}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v2

    move-object/from16 v3, v86

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_2e
    move-object/from16 v3, v86

    move-object/from16 v86, v13

    const-string v13, "EssentialProperty"

    invoke-static {v9, v13}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v94

    if-eqz v94, :cond_2f

    invoke-static {v9, v13}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1f
    move-object/from16 v13, v87

    goto :goto_20

    :cond_2f
    move-object/from16 v94, v13

    const-string v13, "SupplementalProperty"

    invoke-static {v9, v13}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v95

    if-eqz v95, :cond_30

    invoke-static {v9, v13}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v2

    move-object/from16 v13, v87

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_20
    const/4 v2, 0x1

    move-object/from16 v15, p0

    move-object/from16 v98, v0

    move-object/from16 v104, v4

    move-object/from16 v126, v5

    move-object/from16 v119, v11

    move-object/from16 v131, v58

    move-wide/from16 v128, v65

    move-object/from16 v127, v68

    move-object/from16 v122, v70

    move-object/from16 v125, v71

    move-object/from16 v65, v74

    move-object/from16 v105, v81

    move-wide/from16 v116, v92

    move-object/from16 v66, v1

    move-object/from16 v71, v12

    move-object/from16 v92, v13

    move/from16 v81, v14

    move-object/from16 v58, v54

    move-object/from16 v70, v60

    move/from16 v68, v63

    move-object/from16 v74, v69

    move-object/from16 v13, v72

    move-object/from16 v14, v73

    move/from16 v54, v78

    move/from16 v73, v79

    move-object/from16 v69, v85

    move-wide/from16 v0, v88

    move-object/from16 v79, v6

    move/from16 v63, v7

    move-object/from16 v60, v8

    move-object/from16 v78, v61

    move-object/from16 v61, v10

    move-object/from16 v133, v75

    move-object/from16 v75, v3

    move-object/from16 v3, v76

    move-object/from16 v76, v133

    goto/16 :goto_54

    :cond_30
    move-object/from16 v95, v13

    move-object/from16 v133, v87

    move-object/from16 v87, v3

    move-object/from16 v3, v133

    const-string v13, "Representation"

    invoke-static {v9, v13}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v96

    move-object/from16 v97, v13

    const-string v13, "InbandEventStream"

    if-eqz v96, :cond_76

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v96

    move-object/from16 v98, v0

    const/4 v0, 0x0

    if-nez v96, :cond_31

    move-object/from16 v96, v13

    move-object/from16 v99, v15

    move-object/from16 v13, v98

    goto :goto_21

    :cond_31
    move-object/from16 v96, v13

    move-object/from16 v99, v15

    move-object/from16 v13, v91

    .line 23
    :goto_21
    invoke-interface {v9, v0, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "bandwidth"

    move-object/from16 v101, v1

    const/4 v1, -0x1

    invoke-static {v9, v0, v1}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v1

    const/4 v0, 0x0

    .line 24
    invoke-interface {v9, v0, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v100

    if-nez v100, :cond_32

    move-object/from16 v102, v64

    goto :goto_22

    :cond_32
    move-object/from16 v102, v100

    :goto_22
    invoke-interface {v9, v0, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v100, v15

    if-nez v0, :cond_33

    move-object/from16 v0, v74

    move-object/from16 v74, v6

    move/from16 v6, v63

    move-object/from16 v63, v67

    goto :goto_23

    :cond_33
    move/from16 v133, v63

    move-object/from16 v63, v0

    move-object/from16 v0, v74

    move-object/from16 v74, v6

    move/from16 v6, v133

    .line 25
    :goto_23
    invoke-static {v9, v0, v6}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v15

    move/from16 v103, v6

    move-object/from16 v6, v85

    move/from16 v85, v15

    move/from16 v133, v80

    move-object/from16 v80, v0

    move/from16 v0, v133

    invoke-static {v9, v6, v0}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v15

    move-object/from16 v104, v4

    move/from16 v4, v79

    move/from16 v79, v15

    invoke-static {v9, v4}, Ld5/d;->k(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v15

    move/from16 v105, v4

    move-object/from16 v4, v75

    move/from16 v75, v15

    move/from16 v15, v78

    move-object/from16 v78, v10

    invoke-static {v9, v4, v15}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v10

    move/from16 v106, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v111, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v112, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v113, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v114, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/16 v107, 0x0

    const/16 v108, 0x0

    move/from16 v117, v0

    move/from16 v116, v1

    move-object/from16 v110, v6

    move/from16 v109, v7

    move/from16 v118, v82

    move-wide/from16 v0, v88

    move-object/from16 v115, v90

    move-wide/from16 v6, v92

    :goto_24
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    invoke-static {v9, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v119

    if-eqz v119, :cond_35

    if-nez v107, :cond_34

    invoke-static {v9, v6, v7}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v6

    const/16 v107, 0x1

    :cond_34
    move-object/from16 v119, v3

    invoke-static {v9, v13, v14}, Ld5/d;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_25

    :cond_35
    move-object/from16 v119, v3

    invoke-static {v9, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-static/range {p0 .. p0}, Ld5/d;->d(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v118

    :goto_25
    move-object/from16 v3, v73

    move-object/from16 v73, v2

    goto :goto_26

    :cond_36
    move-object/from16 v3, v73

    invoke-static {v9, v3}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v73

    if-eqz v73, :cond_37

    move-object/from16 v73, v2

    move-object/from16 v2, v115

    check-cast v2, Ld5/k$e;

    invoke-static {v9, v2}, Ld5/d;->r(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$e;)Ld5/k$e;

    move-result-object v115

    :goto_26
    move-object/from16 v123, v3

    move-object/from16 v126, v5

    move/from16 v130, v10

    move-object/from16 v131, v58

    move-wide/from16 v128, v65

    move-object/from16 v127, v68

    move-object/from16 v122, v70

    move-object/from16 v125, v71

    move-object/from16 v132, v72

    move-object/from16 v124, v76

    move-object/from16 v65, v80

    move-object/from16 v5, v94

    move-object/from16 v3, v96

    move-object/from16 v2, v99

    move/from16 v68, v103

    move/from16 v103, v109

    move-object/from16 v10, v114

    move/from16 v80, v117

    move-object/from16 v76, v4

    move-object/from16 v71, v12

    move-object/from16 v72, v13

    move-object/from16 v66, v15

    move-object/from16 v58, v54

    move-object/from16 v70, v60

    move/from16 v54, v106

    move-object/from16 v4, v111

    move/from16 v13, v116

    move-object/from16 v60, v8

    move-object v15, v9

    move-wide/from16 v116, v92

    move-object/from16 v9, v108

    move-object/from16 v8, v113

    move-object/from16 v92, v119

    move-object/from16 v119, v11

    move-object/from16 v93, v73

    move/from16 v73, v105

    move/from16 v11, v118

    move-object/from16 v105, v81

    move/from16 v81, v14

    move-object/from16 v14, v74

    move-object/from16 v74, v69

    move-object/from16 v69, v110

    move-wide/from16 v109, v6

    move-object/from16 v7, v95

    move-object/from16 v6, v112

    move-object/from16 v133, v78

    move-object/from16 v78, v61

    move-object/from16 v61, v133

    goto/16 :goto_2c

    :cond_37
    move-object/from16 v73, v2

    move-object/from16 v2, v72

    invoke-static {v9, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v72

    if-eqz v72, :cond_38

    invoke-static {v9, v0, v1}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v120

    move-object/from16 v1, v115

    check-cast v1, Ld5/k$b;

    move-object/from16 v72, v13

    move-object/from16 v13, v60

    move-object/from16 v60, v80

    move/from16 v80, v117

    move-object/from16 v133, v81

    move/from16 v81, v14

    move-object/from16 v14, v133

    move-object/from16 v0, p0

    move-object/from16 v122, v70

    move-object/from16 v70, v13

    move/from16 v13, v116

    move-object/from16 v123, v3

    move-object/from16 v124, v76

    move-wide/from16 v116, v92

    move-object/from16 v92, v119

    move-object/from16 v76, v4

    move-object/from16 v4, v71

    move-object/from16 v93, v73

    move/from16 v73, v105

    move-object/from16 v71, v2

    move-wide/from16 v2, v41

    move-object/from16 v125, v4

    move-object/from16 v126, v5

    move-wide/from16 v4, v46

    move-object/from16 v105, v14

    move-object/from16 v127, v68

    move-object/from16 v14, v74

    move/from16 v68, v103

    move/from16 v103, v109

    move-object/from16 v74, v69

    move-object/from16 v69, v110

    move-wide/from16 v109, v6

    move-wide/from16 v128, v65

    move-object/from16 v66, v15

    move-object/from16 v65, v60

    move-object/from16 v60, v8

    move-object v15, v9

    move-wide/from16 v8, v120

    move/from16 v130, v10

    move-object/from16 v119, v11

    move-object/from16 v133, v78

    move-object/from16 v78, v61

    move-object/from16 v61, v133

    move-wide/from16 v10, v25

    invoke-static/range {v0 .. v11}, Ld5/d;->s(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$b;JJJJJ)Ld5/k$b;

    move-result-object v0

    move-object/from16 v115, v0

    move-object/from16 v131, v58

    move-object/from16 v132, v71

    move-wide/from16 v0, v120

    move-object/from16 v71, v12

    move-object/from16 v58, v54

    move/from16 v54, v106

    goto/16 :goto_27

    :cond_38
    move-object/from16 v123, v3

    move-object/from16 v126, v5

    move/from16 v130, v10

    move-object/from16 v72, v13

    move-wide/from16 v128, v65

    move-object/from16 v127, v68

    move-object/from16 v122, v70

    move-object/from16 v125, v71

    move-object/from16 v124, v76

    move-object/from16 v65, v80

    move/from16 v68, v103

    move/from16 v103, v109

    move/from16 v13, v116

    move/from16 v80, v117

    move-object/from16 v71, v2

    move-object/from16 v76, v4

    move-object/from16 v66, v15

    move-object/from16 v70, v60

    move-wide/from16 v116, v92

    move-object/from16 v92, v119

    move-object/from16 v60, v8

    move-object v15, v9

    move-object/from16 v119, v11

    move-object/from16 v11, v58

    move-object/from16 v93, v73

    move/from16 v73, v105

    move-object/from16 v105, v81

    move/from16 v81, v14

    move-object/from16 v14, v74

    move-object/from16 v74, v69

    move-object/from16 v69, v110

    move-wide/from16 v109, v6

    move-object/from16 v133, v78

    move-object/from16 v78, v61

    move-object/from16 v61, v133

    invoke-static {v15, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3a

    invoke-static {v15, v0, v1}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v120

    move-object/from16 v1, v115

    check-cast v1, Ld5/k$c;

    move-object/from16 v0, p0

    move-object/from16 v2, v92

    move-wide/from16 v3, v41

    move-wide/from16 v5, v46

    move-wide/from16 v7, v109

    move-wide/from16 v9, v120

    move-object/from16 v131, v11

    move-object/from16 v58, v54

    move-object/from16 v132, v71

    move/from16 v54, v106

    move-object/from16 v71, v12

    move-wide/from16 v11, v25

    invoke-static/range {v0 .. v12}, Ld5/d;->t(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$c;Ljava/util/List;JJJJJ)Ld5/k$c;

    move-result-object v0

    move-object/from16 v115, v0

    move-wide/from16 v0, v120

    :goto_27
    move-object/from16 v2, v99

    :cond_39
    move-object/from16 v4, v111

    goto :goto_28

    :cond_3a
    move-object/from16 v131, v11

    move-object/from16 v58, v54

    move-object/from16 v132, v71

    move-object/from16 v2, v99

    move/from16 v54, v106

    move-object/from16 v71, v12

    invoke-static {v15, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3c

    invoke-static/range {p0 .. p0}, Ld5/d;->g(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v3

    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v4, :cond_3b

    move-object/from16 v108, v4

    check-cast v108, Ljava/lang/String;

    :cond_3b
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v3, :cond_39

    check-cast v3, La4/d$b;

    move-object/from16 v4, v111

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_28
    move-object/from16 v3, v96

    move-object/from16 v6, v112

    goto :goto_29

    :cond_3c
    move-object/from16 v3, v96

    move-object/from16 v4, v111

    invoke-static {v15, v3}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3d

    invoke-static {v15, v3}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v5

    move-object/from16 v6, v112

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_29
    move-object/from16 v5, v94

    move-object/from16 v8, v113

    goto :goto_2a

    :cond_3d
    move-object/from16 v5, v94

    move-object/from16 v6, v112

    invoke-static {v15, v5}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3e

    invoke-static {v15, v5}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v7

    move-object/from16 v8, v113

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2a
    move-object/from16 v7, v95

    move-object/from16 v10, v114

    goto :goto_2b

    :cond_3e
    move-object/from16 v7, v95

    move-object/from16 v8, v113

    invoke-static {v15, v7}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3f

    invoke-static {v15, v7}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v9

    move-object/from16 v10, v114

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_3f
    move-object/from16 v10, v114

    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_2b
    move-object/from16 v9, v108

    move/from16 v11, v118

    :goto_2c
    move-object/from16 v12, v97

    invoke-static {v15, v12}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_75

    .line 26
    invoke-static/range {v102 .. v102}, Lv5/p;->k(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "image"

    if-eqz v0, :cond_40

    invoke-static/range {v63 .. v63}, Lv5/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2d

    :cond_40
    invoke-static/range {v102 .. v102}, Lv5/p;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_41

    invoke-static/range {v63 .. v63}, Lv5/p;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2d
    move-object/from16 v15, v102

    goto :goto_30

    :cond_41
    invoke-static/range {v102 .. v102}, Lv5/p;->l(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_42

    goto :goto_2e

    .line 27
    :cond_42
    invoke-static/range {v102 .. v102}, Lv5/p;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_43

    :goto_2e
    move-object/from16 v0, v102

    move-object v15, v0

    goto :goto_30

    :cond_43
    const-string v0, "application/mp4"

    move-object/from16 v15, v102

    .line 28
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    invoke-static/range {v63 .. v63}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "text/vtt"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_45

    const-string v102, "application/x-mp4-vtt"

    goto :goto_2f

    :cond_44
    const/16 v102, 0x0

    :goto_2f
    move-object/from16 v0, v102

    :cond_45
    :goto_30
    const-string v2, "audio/eac3"

    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "ec+3"

    if-eqz v3, :cond_4a

    const/4 v0, 0x0

    .line 30
    :goto_31
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const-string v7, "audio/eac3-joc"

    if-ge v0, v3, :cond_49

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld5/e;

    iget-object v12, v3, Ld5/e;->a:Ljava/lang/String;

    move-object/from16 v93, v2

    const-string v2, "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_46

    iget-object v2, v3, Ld5/e;->b:Ljava/lang/String;

    move-object/from16 v112, v6

    const-string v6, "JOC"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_47

    goto :goto_32

    :cond_46
    move-object/from16 v112, v6

    :goto_32
    const-string v2, "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_48

    iget-object v2, v3, Ld5/e;->b:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_48

    :cond_47
    move-object v0, v7

    goto :goto_33

    :cond_48
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v2, v93

    move-object/from16 v6, v112

    goto :goto_31

    :cond_49
    move-object/from16 v93, v2

    move-object/from16 v112, v6

    move-object/from16 v0, v93

    .line 31
    :goto_33
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4b

    goto :goto_34

    :cond_4a
    move-object/from16 v112, v6

    :cond_4b
    move-object/from16 v5, v63

    :goto_34
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 32
    :goto_35
    invoke-virtual/range {v101 .. v101}, Ljava/util/ArrayList;->size()I

    move-result v6

    const-string v7, "urn:mpeg:dash:role:2011"

    if-ge v2, v6, :cond_4f

    move-object/from16 v6, v101

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld5/e;

    move-object/from16 v111, v4

    iget-object v4, v12, Ld5/e;->a:Ljava/lang/String;

    invoke-static {v7, v4}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4e

    iget-object v4, v12, Ld5/e;->b:Ljava/lang/String;

    if-nez v4, :cond_4c

    goto :goto_36

    :cond_4c
    const-string v7, "forced_subtitle"

    .line 33
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4d

    const-string v7, "forced-subtitle"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4d

    :goto_36
    const/4 v4, 0x0

    goto :goto_37

    :cond_4d
    const/4 v4, 0x2

    :goto_37
    or-int/2addr v3, v4

    :cond_4e
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v101, v6

    move-object/from16 v4, v111

    goto :goto_35

    :cond_4f
    move-object/from16 v111, v4

    move-object/from16 v6, v101

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 34
    :goto_38
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v2, v12, :cond_51

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld5/e;

    move-object/from16 v101, v6

    iget-object v6, v12, Ld5/e;->a:Ljava/lang/String;

    invoke-static {v7, v6}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_50

    iget-object v6, v12, Ld5/e;->b:Ljava/lang/String;

    invoke-static {v6}, Ld5/d;->p(Ljava/lang/String;)I

    move-result v6

    or-int/2addr v4, v6

    :cond_50
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v6, v101

    goto :goto_38

    :cond_51
    move-object/from16 v101, v6

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 35
    :goto_39
    invoke-virtual/range {v87 .. v87}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v2, v12, :cond_5f

    move-object/from16 v12, v87

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v63

    move-object/from16 v87, v9

    move-object/from16 v9, v63

    check-cast v9, Ld5/e;

    move-object/from16 v93, v1

    iget-object v1, v9, Ld5/e;->a:Ljava/lang/String;

    invoke-static {v7, v1}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_52

    iget-object v1, v9, Ld5/e;->b:Ljava/lang/String;

    invoke-static {v1}, Ld5/d;->p(Ljava/lang/String;)I

    move-result v1

    or-int/2addr v1, v6

    move v6, v1

    move-object/from16 v63, v7

    goto/16 :goto_3e

    :cond_52
    iget-object v1, v9, Ld5/e;->a:Ljava/lang/String;

    move-object/from16 v63, v7

    const-string v7, "urn:tva:metadata:cs:AudioPurposeCS:2007"

    invoke-static {v7, v1}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5e

    iget-object v1, v9, Ld5/e;->b:Ljava/lang/String;

    if-nez v1, :cond_53

    goto :goto_3c

    .line 36
    :cond_53
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v9, 0x3

    packed-switch v7, :pswitch_data_0

    :pswitch_0
    goto :goto_3a

    :pswitch_1
    const-string v7, "6"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_54

    goto :goto_3a

    :cond_54
    const/4 v1, 0x4

    goto :goto_3b

    :pswitch_2
    const-string v7, "4"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_55

    goto :goto_3a

    :cond_55
    move v1, v9

    goto :goto_3b

    :pswitch_3
    const-string v7, "3"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_56

    goto :goto_3a

    :cond_56
    const/4 v1, 0x2

    goto :goto_3b

    :pswitch_4
    const-string v7, "2"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_57

    goto :goto_3a

    :cond_57
    const/4 v1, 0x1

    goto :goto_3b

    :pswitch_5
    const-string v7, "1"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_58

    goto :goto_3a

    :cond_58
    const/4 v1, 0x0

    goto :goto_3b

    :goto_3a
    const/4 v1, -0x1

    :goto_3b
    if-eqz v1, :cond_5d

    const/4 v7, 0x1

    if-eq v1, v7, :cond_5c

    const/4 v7, 0x2

    if-eq v1, v7, :cond_5b

    if-eq v1, v9, :cond_5a

    const/4 v7, 0x4

    if-eq v1, v7, :cond_59

    :goto_3c
    const/4 v1, 0x0

    goto :goto_3d

    :cond_59
    const/4 v1, 0x1

    goto :goto_3d

    :cond_5a
    const/16 v1, 0x8

    goto :goto_3d

    :cond_5b
    const/4 v1, 0x4

    goto :goto_3d

    :cond_5c
    const/16 v1, 0x800

    goto :goto_3d

    :cond_5d
    const/16 v1, 0x200

    :goto_3d
    or-int/2addr v1, v6

    move v6, v1

    :cond_5e
    :goto_3e
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v7, v63

    move-object/from16 v9, v87

    move-object/from16 v1, v93

    move-object/from16 v87, v12

    goto/16 :goto_39

    :cond_5f
    move-object/from16 v93, v1

    move-object/from16 v12, v87

    move-object/from16 v87, v9

    or-int v1, v4, v6

    .line 37
    invoke-static {v8}, Ld5/d;->q(Ljava/util/ArrayList;)I

    move-result v2

    or-int/2addr v1, v2

    invoke-static {v10}, Ld5/d;->q(Ljava/util/ArrayList;)I

    move-result v2

    or-int/2addr v1, v2

    const/4 v2, 0x0

    .line 38
    :goto_3f
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_63

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld5/e;

    iget-object v6, v4, Ld5/e;->a:Ljava/lang/String;

    const-string v7, "http://dashif.org/thumbnail_tile"

    invoke-static {v7, v6}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_60

    iget-object v6, v4, Ld5/e;->a:Ljava/lang/String;

    const-string v7, "http://dashif.org/guidelines/thumbnail_tile"

    invoke-static {v7, v6}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_62

    :cond_60
    iget-object v4, v4, Ld5/e;->b:Ljava/lang/String;

    if-eqz v4, :cond_62

    sget v6, Lv5/e0;->a:I

    const-string v6, "x"

    const/4 v7, -0x1

    .line 39
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 40
    array-length v6, v4

    const/4 v7, 0x2

    if-eq v6, v7, :cond_61

    goto :goto_40

    :cond_61
    const/4 v6, 0x0

    :try_start_0
    aget-object v7, v4, v6

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v9, 0x1

    aget-object v4, v4, v9

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v7, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_41

    :catch_0
    :cond_62
    :goto_40
    add-int/lit8 v2, v2, 0x1

    goto :goto_3f

    :cond_63
    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 41
    :goto_41
    new-instance v4, Lv3/i0$a;

    invoke-direct {v4}, Lv3/i0$a;-><init>()V

    move-object/from16 v9, v100

    .line 42
    iput-object v9, v4, Lv3/i0$a;->a:Ljava/lang/String;

    .line 43
    iput-object v15, v4, Lv3/i0$a;->j:Ljava/lang/String;

    .line 44
    iput-object v0, v4, Lv3/i0$a;->k:Ljava/lang/String;

    .line 45
    iput-object v5, v4, Lv3/i0$a;->h:Ljava/lang/String;

    .line 46
    iput v13, v4, Lv3/i0$a;->g:I

    .line 47
    iput v3, v4, Lv3/i0$a;->d:I

    .line 48
    iput v1, v4, Lv3/i0$a;->e:I

    .line 49
    iput-object v14, v4, Lv3/i0$a;->c:Ljava/lang/String;

    if-eqz v2, :cond_64

    .line 50
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_42

    :cond_64
    const/4 v1, -0x1

    .line 51
    :goto_42
    iput v1, v4, Lv3/i0$a;->D:I

    if-eqz v2, :cond_65

    .line 52
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_43

    :cond_65
    const/4 v1, -0x1

    .line 53
    :goto_43
    iput v1, v4, Lv3/i0$a;->E:I

    .line 54
    invoke-static {v0}, Lv5/p;->m(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_66

    move/from16 v1, v85

    .line 55
    iput v1, v4, Lv3/i0$a;->p:I

    move/from16 v2, v79

    .line 56
    iput v2, v4, Lv3/i0$a;->q:I

    move/from16 v0, v75

    .line 57
    iput v0, v4, Lv3/i0$a;->r:F

    goto :goto_44

    :cond_66
    move/from16 v2, v79

    move/from16 v1, v85

    .line 58
    invoke-static {v0}, Lv5/p;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_67

    .line 59
    iput v11, v4, Lv3/i0$a;->x:I

    move/from16 v0, v130

    .line 60
    iput v0, v4, Lv3/i0$a;->y:I

    :goto_44
    const/4 v0, 0x1

    goto/16 :goto_49

    .line 61
    :cond_67
    invoke-static {v0}, Lv5/p;->l(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6e

    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "MpdParser"

    if-eqz v1, :cond_6a

    move v0, v6

    .line 62
    :goto_45
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_6d

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/e;

    iget-object v3, v1, Ld5/e;->a:Ljava/lang/String;

    const-string v5, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_69

    iget-object v3, v1, Ld5/e;->b:Ljava/lang/String;

    if-eqz v3, :cond_69

    sget-object v5, Ld5/d;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_68

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    goto :goto_48

    :cond_68
    const-string v3, "Unable to parse CEA-608 channel number from: "

    .line 63
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 64
    iget-object v1, v1, Ld5/e;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_69
    add-int/lit8 v0, v0, 0x1

    goto :goto_45

    :cond_6a
    const-string v1, "application/cea-708"

    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6d

    move v0, v6

    .line 66
    :goto_46
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_6d

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/e;

    iget-object v3, v1, Ld5/e;->a:Ljava/lang/String;

    const-string v5, "urn:scte:dash:cc:cea-708:2015"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6c

    iget-object v3, v1, Ld5/e;->b:Ljava/lang/String;

    if-eqz v3, :cond_6c

    sget-object v5, Ld5/d;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_6b

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_47

    :cond_6b
    const-string v3, "Unable to parse CEA-708 service block number from: "

    .line 67
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 68
    iget-object v1, v1, Ld5/e;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6c
    add-int/lit8 v0, v0, 0x1

    goto :goto_46

    :cond_6d
    const/4 v0, 0x1

    const/4 v1, -0x1

    :goto_47
    move/from16 v133, v1

    move v1, v0

    move/from16 v0, v133

    .line 69
    :goto_48
    iput v0, v4, Lv3/i0$a;->C:I

    move v0, v1

    goto :goto_49

    :cond_6e
    const/4 v3, 0x1

    .line 70
    invoke-static {v0}, Lv5/p;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v93

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    .line 71
    iput v1, v4, Lv3/i0$a;->p:I

    .line 72
    iput v2, v4, Lv3/i0$a;->q:I

    :cond_6f
    move v0, v3

    .line 73
    :goto_49
    new-instance v1, Lv3/i0;

    invoke-direct {v1, v4}, Lv3/i0;-><init>(Lv3/i0$a;)V

    if-eqz v115, :cond_70

    move-object/from16 v109, v115

    goto :goto_4a

    .line 74
    :cond_70
    new-instance v2, Ld5/k$e;

    invoke-direct {v2}, Ld5/k$e;-><init>()V

    move-object/from16 v109, v2

    :goto_4a
    new-instance v2, Ld5/d$a;

    invoke-virtual/range {v66 .. v66}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_71

    move-object/from16 v108, v66

    goto :goto_4b

    :cond_71
    move-object/from16 v108, v72

    :goto_4b
    move-object/from16 v106, v2

    move-object/from16 v107, v1

    move-object/from16 v110, v87

    move-object/from16 v113, v8

    move-object/from16 v114, v10

    invoke-direct/range {v106 .. v114}, Ld5/d$a;-><init>(Lv3/i0;Ljava/util/List;Ld5/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 75
    iget-object v1, v1, Lv3/i0;->t:Ljava/lang/String;

    invoke-static {v1}, Lv5/p;->i(Ljava/lang/String;)I

    move-result v7

    const/4 v1, -0x1

    move/from16 v4, v103

    if-ne v4, v1, :cond_72

    :goto_4c
    move-object/from16 v6, v105

    goto :goto_4e

    :cond_72
    if-ne v7, v1, :cond_73

    goto :goto_4d

    :cond_73
    if-ne v4, v7, :cond_74

    move v6, v0

    .line 76
    :cond_74
    invoke-static {v6}, Lx6/b;->H(Z)V

    :goto_4d
    move v7, v4

    goto :goto_4c

    .line 77
    :goto_4e
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v15, p0

    move-object/from16 v105, v6

    move-object/from16 v75, v12

    move-object/from16 v66, v101

    move-object/from16 v12, v123

    move-object/from16 v13, v132

    goto/16 :goto_50

    :cond_75
    move/from16 v94, v75

    move-object/from16 v75, v87

    move-object/from16 v87, v9

    move/from16 v133, v85

    move/from16 v85, v79

    move/from16 v79, v133

    move-object/from16 v9, p0

    move-object/from16 v99, v2

    move-object/from16 v96, v3

    move-object/from16 v111, v4

    move-object/from16 v112, v6

    move-object/from16 v95, v7

    move-object/from16 v113, v8

    move-object/from16 v114, v10

    move/from16 v118, v11

    move-object/from16 v97, v12

    move/from16 v106, v54

    move-object/from16 v54, v58

    move-object/from16 v8, v60

    move-object/from16 v15, v66

    move-object/from16 v60, v70

    move-object/from16 v12, v71

    move-object/from16 v4, v76

    move-object/from16 v108, v87

    move-object/from16 v3, v92

    move-object/from16 v2, v93

    move-wide/from16 v6, v109

    move-wide/from16 v92, v116

    move-object/from16 v11, v119

    move-object/from16 v70, v122

    move-object/from16 v76, v124

    move-object/from16 v71, v125

    move/from16 v10, v130

    move-object/from16 v58, v131

    move/from16 v116, v13

    move-object/from16 v110, v69

    move-object/from16 v13, v72

    move-object/from16 v69, v74

    move-object/from16 v87, v75

    move/from16 v117, v80

    move/from16 v75, v94

    move/from16 v109, v103

    move-object/from16 v72, v132

    move-object/from16 v94, v5

    move-object/from16 v74, v14

    move-object/from16 v80, v65

    move/from16 v103, v68

    move/from16 v14, v81

    move-object/from16 v81, v105

    move-object/from16 v5, v126

    move-object/from16 v68, v127

    move-wide/from16 v65, v128

    move/from16 v105, v73

    move-object/from16 v73, v123

    move-object/from16 v133, v78

    move-object/from16 v78, v61

    move-object/from16 v61, v133

    move/from16 v134, v85

    move/from16 v85, v79

    move/from16 v79, v134

    goto/16 :goto_24

    :cond_76
    move-object/from16 v98, v0

    move-object/from16 v101, v1

    move-object/from16 v104, v4

    move-object/from16 v126, v5

    move v4, v7

    move-object/from16 v119, v11

    move-object/from16 v131, v58

    move-wide/from16 v128, v65

    move-object/from16 v127, v68

    move-object/from16 v122, v70

    move-object/from16 v125, v71

    move-object/from16 v132, v72

    move-object/from16 v123, v73

    move-object/from16 v65, v74

    move-object/from16 v124, v76

    move/from16 v73, v79

    move-wide/from16 v116, v92

    move-object/from16 v92, v3

    move-object/from16 v71, v12

    move-object v3, v13

    move-object/from16 v58, v54

    move-object/from16 v70, v60

    move/from16 v68, v63

    move-object/from16 v74, v69

    move-object/from16 v76, v75

    move/from16 v54, v78

    move-object/from16 v69, v85

    move-object/from16 v75, v87

    move-object/from16 v60, v8

    move-object/from16 v78, v61

    move-object/from16 v61, v10

    move/from16 v133, v14

    move-object v14, v6

    move-object/from16 v6, v81

    move/from16 v81, v133

    move-object/from16 v15, p0

    move-object/from16 v12, v123

    invoke-static {v15, v12}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_77

    move-object/from16 v0, v90

    check-cast v0, Ld5/k$e;

    invoke-static {v15, v0}, Ld5/d;->r(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$e;)Ld5/k$e;

    move-result-object v0

    move-object/from16 v90, v0

    move/from16 v63, v4

    move-object/from16 v105, v6

    move-object/from16 v66, v101

    move-object/from16 v13, v132

    goto :goto_4f

    :cond_77
    move-object/from16 v10, v132

    invoke-static {v15, v10}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_78

    move-wide/from16 v0, v88

    invoke-static {v15, v0, v1}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v88

    move-object/from16 v1, v90

    check-cast v1, Ld5/k$b;

    move-object/from16 v0, p0

    move-wide/from16 v2, v41

    move/from16 v63, v4

    move-wide/from16 v4, v46

    move-object v11, v6

    move-object/from16 v66, v101

    move-wide/from16 v6, v116

    move-wide/from16 v8, v88

    move-object v13, v10

    move-object/from16 v105, v11

    move-wide/from16 v10, v25

    invoke-static/range {v0 .. v11}, Ld5/d;->s(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$b;JJJJJ)Ld5/k$b;

    move-result-object v0

    move-object/from16 v90, v0

    :goto_4f
    move/from16 v7, v63

    const/4 v0, 0x1

    :goto_50
    move-object/from16 v79, v14

    move-object v14, v12

    goto :goto_51

    :cond_78
    move/from16 v63, v4

    move-object/from16 v105, v6

    move-object v13, v10

    move-wide/from16 v0, v88

    move-object/from16 v66, v101

    move-object/from16 v11, v131

    invoke-static {v15, v11}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_79

    invoke-static {v15, v0, v1}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v88

    move-object/from16 v1, v90

    check-cast v1, Ld5/k$c;

    move-object/from16 v0, p0

    move-object/from16 v2, v92

    move-wide/from16 v3, v41

    move-wide/from16 v5, v46

    move-wide/from16 v7, v116

    move-wide/from16 v9, v88

    move-object/from16 v131, v11

    move-object/from16 v79, v14

    move-object v14, v12

    move-wide/from16 v11, v25

    invoke-static/range {v0 .. v12}, Ld5/d;->t(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$c;Ljava/util/List;JJJJJ)Ld5/k$c;

    move-result-object v90

    move/from16 v7, v63

    const/4 v0, 0x1

    :goto_51
    move-object v9, v15

    move-object/from16 v3, v124

    goto :goto_55

    :cond_79
    move-object/from16 v131, v11

    move-object/from16 v79, v14

    move-object v14, v12

    invoke-static {v15, v3}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7a

    invoke-static {v15, v3}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    move-result-object v2

    move-object/from16 v3, v124

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_53

    :cond_7a
    move-object/from16 v3, v124

    const-string v2, "Label"

    invoke-static {v15, v2}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7d

    move-object/from16 v4, v59

    .line 78
    :cond_7b
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    const/4 v6, 0x4

    if-ne v5, v6, :cond_7c

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v4

    goto :goto_52

    :cond_7c
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_52
    invoke-static {v15, v2}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7b

    move-object/from16 v77, v4

    goto :goto_53

    .line 79
    :cond_7d
    invoke-static/range {p0 .. p0}, Lp2/m0;->U(Lorg/xmlpull/v1/XmlPullParser;)Z

    move-result v2

    if-eqz v2, :cond_7e

    .line 80
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :cond_7e
    :goto_53
    move-object v9, v15

    const/4 v2, 0x1

    :goto_54
    move-wide/from16 v88, v0

    move v0, v2

    move/from16 v7, v63

    :goto_55
    move-object/from16 v2, v70

    move-object/from16 v1, v77

    move-object/from16 v6, v79

    .line 81
    :goto_56
    invoke-static {v9, v2}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_91

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual/range {v105 .. v105}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_57
    invoke-virtual/range {v105 .. v105}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_90

    move-object/from16 v5, v105

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld5/d$a;

    .line 82
    iget-object v8, v6, Ld5/d$a;->a:Lv3/i0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    new-instance v9, Lv3/i0$a;

    invoke-direct {v9, v8}, Lv3/i0$a;-><init>(Lv3/i0;)V

    if-eqz v1, :cond_7f

    .line 84
    iput-object v1, v9, Lv3/i0$a;->b:Ljava/lang/String;

    .line 85
    :cond_7f
    iget-object v8, v6, Ld5/d$a;->d:Ljava/lang/String;

    if-nez v8, :cond_80

    move-object/from16 v8, v84

    :cond_80
    iget-object v10, v6, Ld5/d$a;->e:Ljava/util/ArrayList;

    move-object/from16 v11, v86

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_8d

    const/4 v12, 0x0

    .line 86
    :goto_58
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v12, v13, :cond_82

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La4/d$b;

    sget-object v14, Lv3/h;->c:Ljava/util/UUID;

    move/from16 v70, v0

    iget-object v0, v13, La4/d$b;->b:Ljava/util/UUID;

    invoke-virtual {v14, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_81

    iget-object v0, v13, La4/d$b;->c:Ljava/lang/String;

    if-eqz v0, :cond_81

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_59

    :cond_81
    add-int/lit8 v12, v12, 0x1

    move/from16 v0, v70

    goto :goto_58

    :cond_82
    move/from16 v70, v0

    const/4 v0, 0x0

    :goto_59
    if-nez v0, :cond_84

    :cond_83
    move-object/from16 v63, v1

    move-object/from16 v105, v5

    goto :goto_5c

    :cond_84
    const/4 v12, 0x0

    :goto_5a
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v12, v13, :cond_83

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La4/d$b;

    sget-object v14, Lv3/h;->b:Ljava/util/UUID;

    move-object/from16 v63, v1

    iget-object v1, v13, La4/d$b;->b:Ljava/util/UUID;

    invoke-virtual {v14, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_85

    iget-object v1, v13, La4/d$b;->c:Ljava/lang/String;

    if-nez v1, :cond_85

    new-instance v1, La4/d$b;

    sget-object v14, Lv3/h;->c:Ljava/util/UUID;

    move-object/from16 v105, v5

    iget-object v5, v13, La4/d$b;->d:Ljava/lang/String;

    iget-object v13, v13, La4/d$b;->e:[B

    invoke-direct {v1, v14, v0, v5, v13}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-virtual {v10, v12, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_5b

    :cond_85
    move-object/from16 v105, v5

    :goto_5b
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v63

    move-object/from16 v5, v105

    goto :goto_5a

    .line 87
    :goto_5c
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_86
    :goto_5d
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_8c

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La4/d$b;

    .line 88
    iget-object v5, v1, La4/d$b;->e:[B

    if-eqz v5, :cond_87

    move/from16 v5, v70

    goto :goto_5e

    :cond_87
    const/4 v5, 0x0

    :goto_5e
    if-nez v5, :cond_86

    const/4 v5, 0x0

    .line 89
    :goto_5f
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v5, v12, :cond_86

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La4/d$b;

    .line 90
    iget-object v13, v12, La4/d$b;->e:[B

    if-eqz v13, :cond_88

    move/from16 v13, v70

    goto :goto_60

    :cond_88
    const/4 v13, 0x0

    :goto_60
    if-eqz v13, :cond_8a

    .line 91
    iget-object v13, v1, La4/d$b;->e:[B

    if-eqz v13, :cond_89

    move/from16 v13, v70

    goto :goto_61

    :cond_89
    const/4 v13, 0x0

    :goto_61
    if-nez v13, :cond_8a

    .line 92
    iget-object v13, v1, La4/d$b;->b:Ljava/util/UUID;

    invoke-virtual {v12, v13}, La4/d$b;->a(Ljava/util/UUID;)Z

    move-result v12

    if-eqz v12, :cond_8a

    move/from16 v12, v70

    goto :goto_62

    :cond_8a
    const/4 v12, 0x0

    :goto_62
    if-eqz v12, :cond_8b

    .line 93
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_5d

    :cond_8b
    add-int/lit8 v5, v5, 0x1

    goto :goto_5f

    .line 94
    :cond_8c
    new-instance v0, La4/d;

    invoke-direct {v0, v8, v10}, La4/d;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 95
    iput-object v0, v9, Lv3/i0$a;->n:La4/d;

    goto :goto_63

    :cond_8d
    move/from16 v70, v0

    move-object/from16 v63, v1

    move-object/from16 v105, v5

    .line 96
    :goto_63
    iget-object v0, v6, Ld5/d$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-wide v12, v6, Ld5/d$a;->g:J

    .line 97
    new-instance v1, Lv3/i0;

    invoke-direct {v1, v9}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 98
    iget-object v5, v6, Ld5/d$a;->b:Lo7/t;

    iget-object v8, v6, Ld5/d$a;->c:Ld5/k;

    iget-object v9, v6, Ld5/d$a;->h:Ljava/util/List;

    iget-object v6, v6, Ld5/d$a;->i:Ljava/util/List;

    .line 99
    instance-of v10, v8, Ld5/k$e;

    if-eqz v10, :cond_8e

    new-instance v10, Ld5/j$b;

    move-object/from16 v98, v8

    check-cast v98, Ld5/k$e;

    move-object/from16 v93, v10

    move-wide/from16 v94, v12

    move-object/from16 v96, v1

    move-object/from16 v97, v5

    move-object/from16 v99, v0

    move-object/from16 v100, v9

    move-object/from16 v101, v6

    invoke-direct/range {v93 .. v101}, Ld5/j$b;-><init>(JLv3/i0;Lo7/t;Ld5/k$e;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V

    goto :goto_64

    :cond_8e
    instance-of v10, v8, Ld5/k$a;

    if-eqz v10, :cond_8f

    new-instance v10, Ld5/j$a;

    move-object/from16 v98, v8

    check-cast v98, Ld5/k$a;

    move-object/from16 v93, v10

    move-wide/from16 v94, v12

    move-object/from16 v96, v1

    move-object/from16 v97, v5

    move-object/from16 v99, v0

    move-object/from16 v100, v9

    move-object/from16 v101, v6

    invoke-direct/range {v93 .. v101}, Ld5/j$a;-><init>(JLv3/i0;Lo7/t;Ld5/k$a;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V

    .line 100
    :goto_64
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v86, v11

    move-object/from16 v1, v63

    move/from16 v0, v70

    goto/16 :goto_57

    .line 101
    :cond_8f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_90
    move/from16 v70, v0

    .line 102
    new-instance v0, Ld5/a;

    move-object/from16 v61, v0

    move/from16 v63, v7

    move-object/from16 v64, v2

    move-object/from16 v65, v75

    move-object/from16 v66, v71

    move-object/from16 v67, v92

    invoke-direct/range {v61 .. v67}, Ld5/a;-><init>(IILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v12, v48

    .line 103
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v54, v12

    move-object v1, v15

    move-object/from16 v59, v37

    move-object/from16 v15, v49

    move/from16 v0, v70

    move-object/from16 v71, v125

    goto/16 :goto_6e

    :cond_91
    move-object/from16 v63, v1

    move-object/from16 v72, v13

    move-object/from16 v8, v60

    move-object/from16 v10, v61

    move-object/from16 v77, v63

    move-object/from16 v1, v66

    move/from16 v63, v68

    move-object/from16 v85, v69

    move-object/from16 v12, v71

    move/from16 v79, v73

    move-object/from16 v69, v74

    move-object/from16 v61, v78

    move-object/from16 v13, v86

    move-object/from16 v15, v91

    move-object/from16 v87, v92

    move-object/from16 v0, v98

    move-object/from16 v4, v104

    move-object/from16 v11, v119

    move-object/from16 v70, v122

    move-object/from16 v71, v125

    move-object/from16 v5, v126

    move-object/from16 v68, v127

    move-object/from16 v60, v2

    move-object/from16 v73, v14

    move/from16 v78, v54

    move-object/from16 v54, v58

    move-object/from16 v74, v65

    move-object/from16 v86, v75

    move-object/from16 v75, v76

    move/from16 v14, v81

    move-object/from16 v81, v105

    move-wide/from16 v65, v128

    move-object/from16 v58, v131

    move-object/from16 v76, v3

    move-wide/from16 v2, v116

    goto/16 :goto_19

    :cond_92
    move-object/from16 v122, v2

    move-object/from16 v125, v3

    move-object/from16 v104, v4

    move-object/from16 v126, v5

    move-object/from16 v127, v6

    move-object/from16 v74, v7

    move-wide/from16 v128, v8

    move-object/from16 v78, v10

    move-object/from16 v119, v11

    move/from16 v81, v14

    move-object/from16 v55, v15

    move-object/from16 v131, v58

    move-object/from16 v15, p0

    move-object v14, v13

    move-object/from16 v58, v54

    move-object v13, v12

    move-object/from16 v12, v48

    const/16 v48, 0x1

    const-string v0, "EventStream"

    invoke-static {v1, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9c

    const/4 v2, 0x0

    move-object/from16 v10, v122

    .line 104
    invoke-interface {v1, v2, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_93

    move-object/from16 v3, v59

    :cond_93
    move-object/from16 v11, v125

    invoke-interface {v1, v2, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_94

    move-object/from16 v2, v59

    :cond_94
    const-wide/16 v4, 0x1

    const-string v6, "timescale"

    .line 105
    invoke-static {v1, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v4

    const-string v6, "presentationTimeOffset"

    const-wide/16 v7, 0x0

    invoke-static {v1, v6, v7, v8}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v68

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/io/ByteArrayOutputStream;

    const/16 v13, 0x200

    invoke-direct {v9, v13}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_65
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v13, "Event"

    invoke-static {v1, v13}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_99

    move-object/from16 v14, v126

    .line 106
    invoke-static {v1, v14, v7, v8}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v65

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v15, v37

    invoke-static {v1, v15, v7, v8}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v59

    const-string v7, "presentationTime"

    move-object/from16 v122, v10

    move-object/from16 v71, v11

    const-wide/16 v10, 0x0

    invoke-static {v1, v7, v10, v11}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v7

    const-wide/16 v61, 0x3e8

    move-wide/from16 v63, v4

    invoke-static/range {v59 .. v64}, Lv5/e0;->O(JJJ)J

    move-result-wide v10

    sub-long v59, v7, v68

    const-wide/32 v61, 0xf4240

    invoke-static/range {v59 .. v64}, Lv5/e0;->O(JJJ)J

    move-result-wide v7

    move-wide/from16 v72, v4

    const-string v4, "messageData"

    const/4 v5, 0x0

    .line 107
    invoke-interface {v1, v5, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_95

    const/4 v4, 0x0

    .line 108
    :cond_95
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    sget-object v37, Ln7/d;->c:Ljava/nio/charset/Charset;

    move-object/from16 v54, v12

    invoke-virtual/range {v37 .. v37}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v9, v12}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    :goto_66
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    invoke-static {v1, v13}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_97

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    packed-switch v12, :pswitch_data_1

    goto :goto_67

    :pswitch_6
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_7
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_8
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_9
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_a
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_b
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    goto :goto_67

    :pswitch_c
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v12}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    :goto_67
    move-object/from16 v37, v13

    :cond_96
    :goto_68
    move-object/from16 v126, v14

    move-object/from16 v59, v15

    goto :goto_6a

    :pswitch_d
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v37, v13

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_68

    :pswitch_e
    move-object/from16 v37, v13

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const/4 v12, 0x0

    :goto_69
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v13

    if-ge v12, v13, :cond_96

    invoke-interface {v1, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v126, v14

    invoke-interface {v1, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v59, v15

    invoke-interface {v1, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5, v13, v14, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v15, v59

    move-object/from16 v14, v126

    goto :goto_69

    :pswitch_f
    move-object/from16 v37, v13

    move-object/from16 v126, v14

    move-object/from16 v59, v15

    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    goto/16 :goto_66

    :pswitch_10
    move-object/from16 v37, v13

    move-object/from16 v126, v14

    move-object/from16 v59, v15

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v13, 0x0

    invoke-interface {v5, v13, v12}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    :goto_6a
    move-object/from16 v13, v37

    move-object/from16 v15, v59

    move-object/from16 v14, v126

    goto/16 :goto_66

    :cond_97
    move-object/from16 v126, v14

    move-object/from16 v59, v15

    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    .line 109
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    if-nez v4, :cond_98

    move-object/from16 v67, v5

    goto :goto_6b

    :cond_98
    invoke-static {v4}, Lv5/e0;->B(Ljava/lang/String;)[B

    move-result-object v4

    move-object/from16 v67, v4

    .line 110
    :goto_6b
    new-instance v4, Lr4/a;

    const-wide/16 v12, 0x0

    move-object/from16 v60, v4

    move-object/from16 v61, v3

    move-object/from16 v62, v2

    move-wide/from16 v63, v10

    invoke-direct/range {v60 .. v67}, Lr4/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 111
    invoke-static {v7, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v4

    .line 112
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v7, v12

    goto :goto_6c

    :cond_99
    move-wide/from16 v72, v4

    move-object/from16 v122, v10

    move-object/from16 v71, v11

    move-object/from16 v54, v12

    move-object/from16 v59, v37

    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_6c
    invoke-static {v1, v0}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9b

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Lr4/a;

    const/4 v5, 0x0

    :goto_6d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_9a

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    aput-wide v8, v0, v5

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Lr4/a;

    aput-object v7, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_6d

    .line 113
    :cond_9a
    new-instance v5, Ld5/f;

    invoke-direct {v5, v3, v2, v0, v4}, Ld5/f;-><init>(Ljava/lang/String;Ljava/lang/String;[J[Lr4/a;)V

    move-object/from16 v15, v49

    .line 114
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v48

    :goto_6e
    move-object/from16 v14, v71

    move-object/from16 v49, v122

    move-object/from16 v37, v126

    goto/16 :goto_71

    :cond_9b
    move-object/from16 v15, p0

    move-object/from16 v12, v54

    move-object/from16 v37, v59

    move-object/from16 v11, v71

    move-wide/from16 v4, v72

    move-object/from16 v10, v122

    goto/16 :goto_65

    :cond_9c
    move-object/from16 v54, v12

    move-object/from16 v59, v37

    move-object/from16 v15, v49

    move-object/from16 v71, v125

    move-object/from16 v37, v126

    invoke-static {v1, v14}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9d

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ld5/d;->r(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$e;)Ld5/k$e;

    move-result-object v0

    move-object/from16 v53, v0

    move/from16 v0, v48

    move-wide/from16 v12, v56

    move-object/from16 v14, v71

    move-object/from16 v49, v122

    :goto_6f
    move-object/from16 v2, v127

    goto/16 :goto_72

    :cond_9d
    invoke-static {v1, v13}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9e

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v1, v2, v3}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v50

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v13, v1

    move-object v1, v2

    move-wide/from16 v2, v41

    move-wide/from16 v4, v46

    move-wide/from16 v6, v56

    move-wide/from16 v8, v50

    move-object/from16 v14, v71

    move-object/from16 v49, v122

    move-wide/from16 v10, v25

    invoke-static/range {v0 .. v11}, Ld5/d;->s(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$b;JJJJJ)Ld5/k$b;

    move-result-object v53

    goto :goto_70

    :cond_9e
    move-object v13, v1

    move-object/from16 v14, v71

    move-object/from16 v49, v122

    move-object/from16 v0, v131

    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9f

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v13, v0, v1}, Ld5/d;->e(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v50

    const/4 v1, 0x0

    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 115
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    move-object/from16 v0, p0

    move-wide/from16 v3, v41

    move-wide/from16 v5, v46

    move-wide/from16 v7, v56

    move-wide/from16 v9, v50

    move-wide/from16 v11, v25

    .line 116
    invoke-static/range {v0 .. v12}, Ld5/d;->t(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$c;Ljava/util/List;JJJJJ)Ld5/k$c;

    move-result-object v53

    goto :goto_70

    :cond_9f
    const-string v0, "AssetIdentifier"

    invoke-static {v13, v0}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a0

    invoke-static {v13, v0}, Ld5/d;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ld5/e;

    goto :goto_70

    :cond_a0
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_70
    move-object v1, v13

    move/from16 v0, v48

    :goto_71
    move-wide/from16 v12, v56

    goto :goto_6f

    :goto_72
    invoke-static {v1, v2}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a4

    .line 117
    new-instance v1, Ld5/g;

    move-object/from16 v37, v1

    move-object/from16 v41, v54

    move-object/from16 v42, v15

    invoke-direct/range {v37 .. v42}, Ld5/g;-><init>(Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    .line 118
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 119
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ld5/g;

    iget-wide v3, v2, Ld5/g;->b:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v3, v5

    if-nez v3, :cond_a2

    if-eqz v22, :cond_a1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move/from16 v32, v0

    move-object/from16 v3, v58

    move-wide/from16 v8, v128

    goto :goto_74

    :cond_a1
    const-string v0, "Unable to determine start of period "

    .line 120
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 121
    invoke-virtual/range {v58 .. v58}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_a2
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v3, v5

    if-nez v1, :cond_a3

    move-wide v8, v5

    goto :goto_73

    :cond_a3
    iget-wide v7, v2, Ld5/g;->b:J

    add-long/2addr v7, v3

    move-wide v8, v7

    :goto_73
    move-object/from16 v3, v58

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v1, v5

    :goto_74
    move v5, v0

    move-wide v0, v1

    goto/16 :goto_14

    :cond_a4
    move-object v6, v2

    move-object v3, v14

    move-object/from16 v5, v37

    move-object/from16 v2, v49

    move-object/from16 v48, v54

    move-object/from16 v54, v58

    move-object/from16 v37, v59

    move-object/from16 v7, v74

    move-object/from16 v10, v78

    move/from16 v14, v81

    move-object/from16 v4, v104

    move-object/from16 v11, v119

    move-wide/from16 v8, v128

    move-object/from16 v49, v15

    move-object/from16 v15, v55

    goto/16 :goto_17

    :cond_a5
    move-wide/from16 v128, v8

    move-object/from16 v78, v10

    move-object v3, v12

    move/from16 v81, v14

    move-object/from16 v43, v15

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    move v5, v2

    move-wide/from16 v6, v44

    move-wide/from16 v8, v128

    :goto_75
    const-string v2, "MPD"

    move-object/from16 v4, p0

    invoke-static {v4, v2}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_aa

    cmp-long v2, v18, v0

    if-nez v2, :cond_a8

    cmp-long v0, v8, v0

    if-eqz v0, :cond_a6

    move-wide/from16 v18, v8

    goto :goto_76

    :cond_a6
    if-eqz v22, :cond_a7

    goto :goto_76

    :cond_a7
    const-string v0, "Unable to determine duration of static manifest."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_a8
    :goto_76
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a9

    .line 122
    new-instance v0, Ld5/c;

    move-object v15, v0

    move-object/from16 v31, v33

    move-object/from16 v32, v34

    move-object/from16 v33, v36

    move-object/from16 v34, v35

    move-object/from16 v35, v3

    invoke-direct/range {v15 .. v35}, Ld5/c;-><init>(JJJZJJJJLd5/h;Ld5/n;Ld5/l;Landroid/net/Uri;Ljava/util/ArrayList;)V

    return-object v0

    :cond_a9
    const-string v0, "No periods found."

    const/4 v1, 0x0

    .line 123
    invoke-static {v0, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_aa
    const/4 v2, 0x0

    move-object v12, v3

    move-object v13, v4

    move-object/from16 v15, v43

    move-object/from16 v10, v78

    move/from16 v14, v81

    goto/16 :goto_b

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static o(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ld5/i;
    .locals 7

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string p1, "-"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    aget-object p1, p0, p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    array-length v0, p0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    aget-object p0, p0, v0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :cond_1
    const-wide/16 v0, -0x1

    :goto_0
    move-wide v2, p1

    move-wide v4, v0

    new-instance p0, Ld5/i;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ld5/i;-><init>(JJLjava/lang/String;)V

    return-object p0
.end method

.method public static p(Ljava/lang/String;)I
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/16 v6, 0x8

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "supplementary"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0xc

    goto/16 :goto_0

    :sswitch_1
    const-string v2, "emergency"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0xb

    goto/16 :goto_0

    :sswitch_2
    const-string v2, "commentary"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_3
    const-string v2, "caption"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "sign"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    move v1, v6

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "main"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_6
    const-string v2, "dub"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_7
    const-string v2, "forced-subtitle"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_8
    const-string v2, "alternate"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    move v1, v5

    goto :goto_0

    :sswitch_9
    const-string v2, "forced_subtitle"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_a
    const-string v2, "enhanced-audio-intelligibility"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    move v1, v4

    goto :goto_0

    :sswitch_b
    const-string v2, "description"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    move v1, v3

    goto :goto_0

    :sswitch_c
    const-string v2, "subtitle"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    move v1, v0

    :goto_0
    packed-switch v1, :pswitch_data_0

    return v0

    :pswitch_0
    return v5

    :pswitch_1
    const/16 p0, 0x20

    return p0

    :pswitch_2
    return v6

    :pswitch_3
    const/16 p0, 0x40

    return p0

    :pswitch_4
    const/16 p0, 0x100

    return p0

    :pswitch_5
    return v3

    :pswitch_6
    const/16 p0, 0x10

    return p0

    :pswitch_7
    return v4

    :pswitch_8
    const/16 p0, 0x800

    return p0

    :pswitch_9
    const/16 p0, 0x200

    return p0

    :pswitch_a
    const/16 p0, 0x80

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x7ad0b3e8 -> :sswitch_c
        -0x66ca7c04 -> :sswitch_b
        -0x5e3a5c50 -> :sswitch_a
        -0x5dde3142 -> :sswitch_9
        -0x53ecbf86 -> :sswitch_8
        -0x533bdf74 -> :sswitch_7
        0x185f1 -> :sswitch_6
        0x3305b9 -> :sswitch_5
        0x35ddbd -> :sswitch_4
        0x20ef99e6 -> :sswitch_3
        0x3597fba9 -> :sswitch_2
        0x6118c591 -> :sswitch_1
        0x6e96bb0f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(Ljava/util/ArrayList;)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld5/e;

    iget-object v2, v2, Ld5/e;->a:Ljava/lang/String;

    const-string v3, "http://dashif.org/guidelines/trickmode"

    invoke-static {v3, v2}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    or-int/lit16 v1, v1, 0x4000

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static r(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$e;)Ld5/k$e;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Ld5/k;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const-string v6, "timescale"

    .line 14
    .line 15
    invoke-static {v0, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-wide v6, v1, Ld5/k;->c:J

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-wide v6, v4

    .line 27
    :goto_1
    const-string v8, "presentationTimeOffset"

    .line 28
    .line 29
    invoke-static {v0, v8, v6, v7}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v11

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-wide v6, v1, Ld5/k$e;->d:J

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-wide v6, v4

    .line 39
    :goto_2
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-wide v4, v1, Ld5/k$e;->e:J

    .line 42
    .line 43
    :cond_3
    const/4 v8, 0x0

    .line 44
    const-string v13, "indexRange"

    .line 45
    .line 46
    invoke-interface {v0, v8, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    if-eqz v13, :cond_4

    .line 51
    .line 52
    const-string v4, "-"

    .line 53
    .line 54
    invoke-virtual {v13, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    aget-object v5, v4, v5

    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    const/4 v7, 0x1

    .line 66
    aget-object v4, v4, v7

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v13

    .line 72
    sub-long/2addr v13, v5

    .line 73
    add-long/2addr v13, v2

    .line 74
    move-wide v15, v13

    .line 75
    move-wide v13, v5

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-wide v15, v4

    .line 78
    move-wide v13, v6

    .line 79
    :goto_3
    if-eqz v1, :cond_5

    .line 80
    .line 81
    iget-object v8, v1, Ld5/k;->a:Ld5/i;

    .line 82
    .line 83
    :cond_5
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 84
    .line 85
    .line 86
    const-string v1, "Initialization"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    const-string v1, "sourceURL"

    .line 95
    .line 96
    const-string v2, "range"

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, Ld5/d;->o(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ld5/i;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v8, v1

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    const-string v1, "SegmentBase"

    .line 108
    .line 109
    invoke-static {v0, v1}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    new-instance v0, Ld5/k$e;

    .line 116
    .line 117
    move-object v7, v0

    .line 118
    invoke-direct/range {v7 .. v16}, Ld5/k$e;-><init>(Ld5/i;JJJJ)V

    .line 119
    .line 120
    .line 121
    return-object v0
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
.end method

.method public static s(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$b;JJJJJ)Ld5/k$b;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Ld5/k;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const-string v6, "timescale"

    .line 14
    .line 15
    invoke-static {v0, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-wide v4, v1, Ld5/k;->c:J

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    :goto_1
    const-string v6, "presentationTimeOffset"

    .line 27
    .line 28
    invoke-static {v0, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v11

    .line 32
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-wide v6, v1, Ld5/k$a;->e:J

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-wide v6, v4

    .line 43
    :goto_2
    const-string v8, "duration"

    .line 44
    .line 45
    invoke-static {v0, v8, v6, v7}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v15

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-wide v2, v1, Ld5/k$a;->d:J

    .line 52
    .line 53
    :cond_3
    const-string v6, "startNumber"

    .line 54
    .line 55
    invoke-static {v0, v6, v2, v3}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    cmp-long v2, p8, v4

    .line 60
    .line 61
    if-nez v2, :cond_4

    .line 62
    .line 63
    move-wide/from16 v2, p6

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move-wide/from16 v2, p8

    .line 67
    .line 68
    :goto_3
    const-wide v6, 0x7fffffffffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    cmp-long v6, v2, v6

    .line 74
    .line 75
    if-nez v6, :cond_5

    .line 76
    .line 77
    move-wide/from16 v18, v4

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move-wide/from16 v18, v2

    .line 81
    .line 82
    :goto_4
    const/4 v2, 0x0

    .line 83
    move-object v3, v2

    .line 84
    move-object v4, v3

    .line 85
    :cond_6
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 86
    .line 87
    .line 88
    const-string v5, "Initialization"

    .line 89
    .line 90
    invoke-static {v0, v5}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_7

    .line 95
    .line 96
    const-string v3, "sourceURL"

    .line 97
    .line 98
    const-string v5, "range"

    .line 99
    .line 100
    invoke-static {v0, v3, v5}, Ld5/d;->o(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ld5/i;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-wide/from16 v5, p4

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_7
    const-string v5, "SegmentTimeline"

    .line 108
    .line 109
    invoke-static {v0, v5}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    move-wide/from16 v5, p4

    .line 116
    .line 117
    invoke-static {v0, v9, v10, v5, v6}, Ld5/d;->u(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    goto :goto_5

    .line 122
    :cond_8
    move-wide/from16 v5, p4

    .line 123
    .line 124
    const-string v7, "SegmentURL"

    .line 125
    .line 126
    invoke-static {v0, v7}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_a

    .line 131
    .line 132
    if-nez v2, :cond_9

    .line 133
    .line 134
    new-instance v2, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    :cond_9
    const-string v7, "media"

    .line 140
    .line 141
    const-string v8, "mediaRange"

    .line 142
    .line 143
    invoke-static {v0, v7, v8}, Ld5/d;->o(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ld5/i;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_a
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 152
    .line 153
    .line 154
    :goto_5
    const-string v7, "SegmentList"

    .line 155
    .line 156
    invoke-static {v0, v7}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    if-eqz v7, :cond_6

    .line 161
    .line 162
    if-eqz v1, :cond_e

    .line 163
    .line 164
    if-eqz v3, :cond_b

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    iget-object v3, v1, Ld5/k;->a:Ld5/i;

    .line 168
    .line 169
    :goto_6
    if-eqz v4, :cond_c

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_c
    iget-object v4, v1, Ld5/k$a;->f:Ljava/util/List;

    .line 173
    .line 174
    :goto_7
    if-eqz v2, :cond_d

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_d
    iget-object v0, v1, Ld5/k$b;->j:Ljava/util/List;

    .line 178
    .line 179
    move-object/from16 v20, v0

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_e
    :goto_8
    move-object/from16 v20, v2

    .line 183
    .line 184
    :goto_9
    move-object v8, v3

    .line 185
    move-object/from16 v17, v4

    .line 186
    .line 187
    new-instance v0, Ld5/k$b;

    .line 188
    .line 189
    move-object v7, v0

    .line 190
    invoke-static/range {p10 .. p11}, Lv5/e0;->I(J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v21

    .line 194
    invoke-static/range {p2 .. p3}, Lv5/e0;->I(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v23

    .line 198
    invoke-direct/range {v7 .. v24}, Ld5/k$b;-><init>(Ld5/i;JJJJLjava/util/List;JLjava/util/List;JJ)V

    .line 199
    .line 200
    .line 201
    return-object v0
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
.end method

.method public static t(Lorg/xmlpull/v1/XmlPullParser;Ld5/k$c;Ljava/util/List;JJJJJ)Ld5/k$c;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Ld5/k;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const-string v6, "timescale"

    .line 14
    .line 15
    invoke-static {v0, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-wide v4, v1, Ld5/k;->c:J

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    :goto_1
    const-string v6, "presentationTimeOffset"

    .line 27
    .line 28
    invoke-static {v0, v6, v4, v5}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v11

    .line 32
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-wide v6, v1, Ld5/k$a;->e:J

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-wide v6, v4

    .line 43
    :goto_2
    const-string v8, "duration"

    .line 44
    .line 45
    invoke-static {v0, v8, v6, v7}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v17

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-wide v2, v1, Ld5/k$a;->d:J

    .line 52
    .line 53
    :cond_3
    const-string v6, "startNumber"

    .line 54
    .line 55
    invoke-static {v0, v6, v2, v3}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    const/4 v2, 0x0

    .line 60
    :goto_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ge v2, v3, :cond_5

    .line 65
    .line 66
    move-object/from16 v3, p2

    .line 67
    .line 68
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ld5/e;

    .line 73
    .line 74
    iget-object v7, v6, Ld5/e;->a:Ljava/lang/String;

    .line 75
    .line 76
    const-string v8, "http://dashif.org/guidelines/last-segment-number"

    .line 77
    .line 78
    invoke-static {v8, v7}, Lx6/b;->R(Ljava/lang/String;Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    iget-object v2, v6, Ld5/e;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    const-wide/16 v2, -0x1

    .line 95
    .line 96
    :goto_4
    move-wide v15, v2

    .line 97
    cmp-long v2, p9, v4

    .line 98
    .line 99
    if-nez v2, :cond_6

    .line 100
    .line 101
    move-wide/from16 v2, p7

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_6
    move-wide/from16 v2, p9

    .line 105
    .line 106
    :goto_5
    const-wide v6, 0x7fffffffffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    cmp-long v6, v2, v6

    .line 112
    .line 113
    if-nez v6, :cond_7

    .line 114
    .line 115
    move-wide/from16 v20, v4

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_7
    move-wide/from16 v20, v2

    .line 119
    .line 120
    :goto_6
    const/4 v2, 0x0

    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    iget-object v3, v1, Ld5/k$c;->k:Ld5/m;

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_8
    move-object v3, v2

    .line 127
    :goto_7
    const-string v4, "media"

    .line 128
    .line 129
    invoke-static {v0, v4, v3}, Ld5/d;->v(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ld5/m;)Ld5/m;

    .line 130
    .line 131
    .line 132
    move-result-object v23

    .line 133
    if-eqz v1, :cond_9

    .line 134
    .line 135
    iget-object v3, v1, Ld5/k$c;->j:Ld5/m;

    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_9
    move-object v3, v2

    .line 139
    :goto_8
    const-string v4, "initialization"

    .line 140
    .line 141
    invoke-static {v0, v4, v3}, Ld5/d;->v(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ld5/m;)Ld5/m;

    .line 142
    .line 143
    .line 144
    move-result-object v22

    .line 145
    move-object v3, v2

    .line 146
    :cond_a
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 147
    .line 148
    .line 149
    const-string v4, "Initialization"

    .line 150
    .line 151
    invoke-static {v0, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_b

    .line 156
    .line 157
    const-string v2, "sourceURL"

    .line 158
    .line 159
    const-string v4, "range"

    .line 160
    .line 161
    invoke-static {v0, v2, v4}, Ld5/d;->o(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ld5/i;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    move-wide/from16 v4, p5

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_b
    const-string v4, "SegmentTimeline"

    .line 169
    .line 170
    invoke-static {v0, v4}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_c

    .line 175
    .line 176
    move-wide/from16 v4, p5

    .line 177
    .line 178
    invoke-static {v0, v9, v10, v4, v5}, Ld5/d;->u(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    goto :goto_9

    .line 183
    :cond_c
    move-wide/from16 v4, p5

    .line 184
    .line 185
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 186
    .line 187
    .line 188
    :goto_9
    const-string v6, "SegmentTemplate"

    .line 189
    .line 190
    invoke-static {v0, v6}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_a

    .line 195
    .line 196
    if-eqz v1, :cond_f

    .line 197
    .line 198
    if-eqz v2, :cond_d

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_d
    iget-object v2, v1, Ld5/k;->a:Ld5/i;

    .line 202
    .line 203
    :goto_a
    if-eqz v3, :cond_e

    .line 204
    .line 205
    goto :goto_b

    .line 206
    :cond_e
    iget-object v0, v1, Ld5/k$a;->f:Ljava/util/List;

    .line 207
    .line 208
    move-object/from16 v19, v0

    .line 209
    .line 210
    move-object v8, v2

    .line 211
    goto :goto_c

    .line 212
    :cond_f
    :goto_b
    move-object v8, v2

    .line 213
    move-object/from16 v19, v3

    .line 214
    .line 215
    :goto_c
    new-instance v0, Ld5/k$c;

    .line 216
    .line 217
    move-object v7, v0

    .line 218
    invoke-static/range {p11 .. p12}, Lv5/e0;->I(J)J

    .line 219
    .line 220
    .line 221
    move-result-wide v24

    .line 222
    invoke-static/range {p3 .. p4}, Lv5/e0;->I(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v26

    .line 226
    invoke-direct/range {v7 .. v27}, Ld5/k$c;-><init>(Ld5/i;JJJJJLjava/util/List;JLd5/m;Ld5/m;JJ)V

    .line 227
    .line 228
    .line 229
    return-object v0
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
.end method

.method public static u(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;
    .locals 21

    move-object/from16 v0, p0

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v1, 0x0

    move-wide v2, v1

    move v1, v10

    move v6, v1

    move-wide v4, v11

    :cond_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v7, "S"

    invoke-static {v0, v7}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "t"

    invoke-static {v0, v7, v11, v12}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v13

    if-eqz v1, :cond_1

    move-object v1, v9

    move-wide v7, v13

    invoke-static/range {v1 .. v8}, Ld5/d;->b(Ljava/util/ArrayList;JJIJ)J

    move-result-wide v2

    :cond_1
    cmp-long v1, v13, v11

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move-wide v13, v2

    :goto_0
    const-string v1, "d"

    invoke-static {v0, v1, v11, v12}, Ld5/d;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v1

    const-string v3, "r"

    invoke-static {v0, v3, v10}, Ld5/d;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v3

    const/4 v4, 0x1

    move v6, v3

    move-wide/from16 v19, v1

    move v1, v4

    move-wide/from16 v4, v19

    move-wide v2, v13

    goto :goto_1

    :cond_3
    invoke-static/range {p0 .. p0}, Ld5/d;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_1
    const-string v7, "SegmentTimeline"

    invoke-static {v0, v7}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    if-eqz v1, :cond_4

    const-wide/16 v17, 0x3e8

    move-wide/from16 v13, p3

    move-wide/from16 v15, p1

    invoke-static/range {v13 .. v18}, Lv5/e0;->O(JJJ)J

    move-result-wide v7

    move-object v0, v9

    move-wide v1, v2

    move-wide v3, v4

    move v5, v6

    move-wide v6, v7

    invoke-static/range {v0 .. v7}, Ld5/d;->b(Ljava/util/ArrayList;JJIJ)J

    :cond_4
    return-object v9
.end method

.method public static v(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ld5/m;)Ld5/m;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-eqz p0, :cond_a

    .line 7
    .line 8
    const/4 p1, 0x5

    .line 9
    new-array p1, p1, [Ljava/lang/String;

    .line 10
    .line 11
    const/4 p2, 0x4

    .line 12
    new-array v0, p2, [I

    .line 13
    .line 14
    new-array v1, p2, [Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, p1, v3

    .line 20
    .line 21
    move v4, v3

    .line 22
    move v5, v4

    .line 23
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v4, v6, :cond_9

    .line 28
    .line 29
    const-string v6, "$"

    .line 30
    .line 31
    invoke-virtual {p0, v6, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v8, -0x1

    .line 36
    if-ne v7, v8, :cond_0

    .line 37
    .line 38
    new-instance v6, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    aget-object v7, p1, v5

    .line 44
    .line 45
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    aput-object v4, p1, v5

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    if-eq v7, v4, :cond_1

    .line 67
    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    aget-object v8, p1, v5

    .line 74
    .line 75
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    aput-object v4, p1, v5

    .line 90
    .line 91
    move v4, v7

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string v7, "$$"

    .line 94
    .line 95
    invoke-virtual {p0, v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_2

    .line 100
    .line 101
    new-instance v7, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    aget-object v8, p1, v5

    .line 107
    .line 108
    invoke-static {v7, v8, v6}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    aput-object v6, p1, v5

    .line 113
    .line 114
    add-int/lit8 v4, v4, 0x2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    invoke-virtual {p0, v6, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {p0, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const-string v7, "RepresentationID"

    .line 128
    .line 129
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    const/4 v9, 0x1

    .line 134
    if-eqz v7, :cond_3

    .line 135
    .line 136
    aput v9, v0, v5

    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_3
    const-string v7, "%0"

    .line 141
    .line 142
    invoke-virtual {v4, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eq v7, v8, :cond_5

    .line 147
    .line 148
    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    const-string v9, "d"

    .line 153
    .line 154
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_4

    .line 159
    .line 160
    const-string v10, "x"

    .line 161
    .line 162
    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-nez v10, :cond_4

    .line 167
    .line 168
    const-string v10, "X"

    .line 169
    .line 170
    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-nez v10, :cond_4

    .line 175
    .line 176
    invoke-static {v8, v9}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    :cond_4
    invoke-virtual {v4, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    goto :goto_1

    .line 185
    :cond_5
    const-string v8, "%01d"

    .line 186
    .line 187
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 191
    .line 192
    .line 193
    const/4 v7, 0x2

    .line 194
    const/4 v9, -0x1

    .line 195
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    sparse-switch v10, :sswitch_data_0

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :sswitch_0
    const-string v10, "Bandwidth"

    .line 204
    .line 205
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_6

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_6
    const/4 v9, 0x2

    .line 213
    goto :goto_2

    .line 214
    :sswitch_1
    const-string v10, "Time"

    .line 215
    .line 216
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_7

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_7
    const/4 v9, 0x1

    .line 224
    goto :goto_2

    .line 225
    :sswitch_2
    const-string v10, "Number"

    .line 226
    .line 227
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-nez v4, :cond_8

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_8
    const/4 v9, 0x0

    .line 235
    :goto_2
    packed-switch v9, :pswitch_data_0

    .line 236
    .line 237
    .line 238
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 239
    .line 240
    const-string p2, "Invalid template: "

    .line 241
    .line 242
    invoke-static {p2, p0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :pswitch_0
    const/4 v4, 0x3

    .line 251
    aput v4, v0, v5

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :pswitch_1
    aput p2, v0, v5

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :pswitch_2
    aput v7, v0, v5

    .line 258
    .line 259
    :goto_3
    aput-object v8, v1, v5

    .line 260
    .line 261
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 262
    .line 263
    aput-object v2, p1, v5

    .line 264
    .line 265
    add-int/lit8 v4, v6, 0x1

    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :cond_9
    new-instance p0, Ld5/m;

    .line 270
    .line 271
    invoke-direct {p0, p1, v0, v1, v5}, Ld5/m;-><init>([Ljava/lang/String;[I[Ljava/lang/String;I)V

    .line 272
    .line 273
    .line 274
    return-object p0

    .line 275
    :cond_a
    return-object p2

    .line 276
    nop

    .line 277
    :sswitch_data_0
    .sparse-switch
        -0x74423897 -> :sswitch_2
        0x27c6ed -> :sswitch_1
        0x246e091 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final a(Landroid/net/Uri;Lt5/m;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ld5/d;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    const-string p2, "MPD"

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {v1, p1}, Ld5/d;->n(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Ld5/c;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "inputStream does not contain a valid media presentation description"

    invoke-static {p1, v0}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {v0, p1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object p1

    throw p1
.end method
