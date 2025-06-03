.class public final Lokhttp3/internal/connection/StreamAllocation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/StreamAllocation$StreamAllocationReference;
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/Address;

.field public b:Lokhttp3/internal/connection/RouteSelector$Selection;

.field public c:Lokhttp3/Route;

.field public final d:Lokhttp3/ConnectionPool;

.field public final e:Lokhttp3/Call;

.field public final f:Lokhttp3/EventListener;

.field public final g:Ljava/lang/Object;

.field public final h:Lokhttp3/internal/connection/RouteSelector;

.field public i:I

.field public j:Lokhttp3/internal/connection/RealConnection;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lokhttp3/internal/http/HttpCodec;


# direct methods
.method public constructor <init>(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->a:Lokhttp3/Address;

    .line 7
    .line 8
    iput-object p3, p0, Lokhttp3/internal/connection/StreamAllocation;->e:Lokhttp3/Call;

    .line 9
    .line 10
    iput-object p4, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 11
    .line 12
    new-instance v0, Lokhttp3/internal/connection/RouteSelector;

    .line 13
    .line 14
    sget-object v1, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lokhttp3/internal/Internal;->j(Lokhttp3/ConnectionPool;)Lokhttp3/internal/connection/RouteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p2, p1, p3, p4}, Lokhttp3/internal/connection/RouteSelector;-><init>(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->h:Lokhttp3/internal/connection/RouteSelector;

    .line 24
    .line 25
    iput-object p5, p0, Lokhttp3/internal/connection/StreamAllocation;->g:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
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


# virtual methods
.method public final a(Lokhttp3/internal/connection/RealConnection;Z)V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    if-nez v0, :cond_0

    iput-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    iput-boolean p2, p0, Lokhttp3/internal/connection/StreamAllocation;->k:Z

    iget-object p1, p1, Lokhttp3/internal/connection/RealConnection;->n:Ljava/util/ArrayList;

    new-instance p2, Lokhttp3/internal/connection/StreamAllocation$StreamAllocationReference;

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->g:Ljava/lang/Object;

    invoke-direct {p2, p0, v0}, Lokhttp3/internal/connection/StreamAllocation$StreamAllocationReference;-><init>(Lokhttp3/internal/connection/StreamAllocation;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized b()Lokhttp3/internal/connection/RealConnection;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c(ZZZ)Ljava/net/Socket;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    .line 5
    .line 6
    :cond_0
    const/4 p3, 0x1

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iput-boolean p3, p0, Lokhttp3/internal/connection/StreamAllocation;->l:Z

    .line 10
    .line 11
    :cond_1
    iget-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 12
    .line 13
    if-eqz p2, :cond_7

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iput-boolean p3, p2, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 18
    .line 19
    :cond_2
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    .line 20
    .line 21
    if-nez p1, :cond_7

    .line 22
    .line 23
    iget-boolean p1, p0, Lokhttp3/internal/connection/StreamAllocation;->l:Z

    .line 24
    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-boolean p1, p2, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 28
    .line 29
    if-eqz p1, :cond_7

    .line 30
    .line 31
    :cond_3
    iget-object p1, p2, Lokhttp3/internal/connection/RealConnection;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p3, 0x0

    .line 38
    :goto_0
    if-ge p3, p1, :cond_6

    .line 39
    .line 40
    iget-object v1, p2, Lokhttp3/internal/connection/RealConnection;->n:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/ref/Reference;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-ne v1, p0, :cond_5

    .line 53
    .line 54
    iget-object p1, p2, Lokhttp3/internal/connection/RealConnection;->n:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 60
    .line 61
    iget-object p1, p1, Lokhttp3/internal/connection/RealConnection;->n:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 72
    .line 73
    .line 74
    move-result-wide p2

    .line 75
    iput-wide p2, p1, Lokhttp3/internal/connection/RealConnection;->o:J

    .line 76
    .line 77
    sget-object p1, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 78
    .line 79
    iget-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 80
    .line 81
    iget-object p3, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 82
    .line 83
    invoke-virtual {p1, p2, p3}, Lokhttp3/internal/Internal;->e(Lokhttp3/ConnectionPool;Lokhttp3/internal/connection/RealConnection;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 90
    .line 91
    iget-object p1, p1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move-object p1, v0

    .line 95
    :goto_1
    iput-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 96
    .line 97
    move-object v0, p1

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    add-int/lit8 p3, p3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_7
    :goto_2
    return-object v0
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

.method public final d(ZIIII)Lokhttp3/internal/connection/RealConnection;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-boolean v0, v1, Lokhttp3/internal/connection/StreamAllocation;->l:Z

    .line 7
    .line 8
    if-nez v0, :cond_2b

    .line 9
    .line 10
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    .line 11
    .line 12
    if-nez v0, :cond_2a

    .line 13
    .line 14
    iget-boolean v0, v1, Lokhttp3/internal/connection/StreamAllocation;->m:Z

    .line 15
    .line 16
    if-nez v0, :cond_29

    .line 17
    .line 18
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-boolean v6, v0, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, v4, v4, v5}, Lokhttp3/internal/connection/StreamAllocation;->c(ZZZ)Ljava/net/Socket;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v6, v3

    .line 35
    :goto_0
    iget-object v7, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    move-object v0, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v7, v3

    .line 42
    :goto_1
    iget-boolean v8, v1, Lokhttp3/internal/connection/StreamAllocation;->k:Z

    .line 43
    .line 44
    if-nez v8, :cond_2

    .line 45
    .line 46
    move-object v0, v3

    .line 47
    :cond_2
    if-nez v7, :cond_4

    .line 48
    .line 49
    sget-object v8, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 50
    .line 51
    iget-object v9, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 52
    .line 53
    iget-object v10, v1, Lokhttp3/internal/connection/StreamAllocation;->a:Lokhttp3/Address;

    .line 54
    .line 55
    invoke-virtual {v8, v9, v10, v1, v3}, Lokhttp3/internal/Internal;->h(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/Route;)Lokhttp3/internal/connection/RealConnection;

    .line 56
    .line 57
    .line 58
    iget-object v8, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    move-object v7, v8

    .line 63
    move v8, v5

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-object v3, v1, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 66
    .line 67
    :cond_4
    move v8, v4

    .line 68
    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 69
    invoke-static {v6}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    .line 70
    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    :cond_5
    if-eqz v8, :cond_6

    .line 80
    .line 81
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    :cond_6
    if-eqz v7, :cond_7

    .line 87
    .line 88
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 89
    .line 90
    iget-object v0, v0, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 91
    .line 92
    iput-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 93
    .line 94
    return-object v7

    .line 95
    :cond_7
    if-nez v3, :cond_1e

    .line 96
    .line 97
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->b:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 98
    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    iget v2, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 102
    .line 103
    iget-object v0, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-ge v2, v0, :cond_8

    .line 110
    .line 111
    move v0, v5

    .line 112
    goto :goto_3

    .line 113
    :cond_8
    move v0, v4

    .line 114
    :goto_3
    if-nez v0, :cond_1e

    .line 115
    .line 116
    :cond_9
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->h:Lokhttp3/internal/connection/RouteSelector;

    .line 117
    .line 118
    iget v2, v0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 119
    .line 120
    iget-object v6, v0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-ge v2, v6, :cond_a

    .line 127
    .line 128
    move v2, v5

    .line 129
    goto :goto_4

    .line 130
    :cond_a
    move v2, v4

    .line 131
    :goto_4
    if-nez v2, :cond_c

    .line 132
    .line 133
    iget-object v2, v0, Lokhttp3/internal/connection/RouteSelector;->h:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_b

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_b
    move v2, v4

    .line 143
    goto :goto_6

    .line 144
    :cond_c
    :goto_5
    move v2, v5

    .line 145
    :goto_6
    if-eqz v2, :cond_1d

    .line 146
    .line 147
    new-instance v2, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    :cond_d
    iget v6, v0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 153
    .line 154
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-ge v6, v9, :cond_e

    .line 161
    .line 162
    move v6, v5

    .line 163
    goto :goto_7

    .line 164
    :cond_e
    move v6, v4

    .line 165
    :goto_7
    if-eqz v6, :cond_1b

    .line 166
    .line 167
    iget v6, v0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 168
    .line 169
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-ge v6, v9, :cond_f

    .line 176
    .line 177
    move v6, v5

    .line 178
    goto :goto_8

    .line 179
    :cond_f
    move v6, v4

    .line 180
    :goto_8
    const-string v9, "No route to "

    .line 181
    .line 182
    if-eqz v6, :cond_1a

    .line 183
    .line 184
    iget-object v6, v0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 185
    .line 186
    iget v10, v0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 187
    .line 188
    add-int/lit8 v11, v10, 0x1

    .line 189
    .line 190
    iput v11, v0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 191
    .line 192
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    check-cast v6, Ljava/net/Proxy;

    .line 197
    .line 198
    new-instance v10, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    iput-object v10, v0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/List;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    sget-object v11, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 210
    .line 211
    if-eq v10, v11, :cond_13

    .line 212
    .line 213
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 218
    .line 219
    if-ne v10, v11, :cond_10

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_10
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    instance-of v11, v10, Ljava/net/InetSocketAddress;

    .line 227
    .line 228
    if-eqz v11, :cond_12

    .line 229
    .line 230
    check-cast v10, Ljava/net/InetSocketAddress;

    .line 231
    .line 232
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    if-nez v11, :cond_11

    .line 237
    .line 238
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    goto :goto_9

    .line 243
    :cond_11
    invoke-virtual {v11}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    :goto_9
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    goto :goto_b

    .line 252
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 253
    .line 254
    const-string v2, "Proxy.address() is not an InetSocketAddress: "

    .line 255
    .line 256
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v0

    .line 275
    :cond_13
    :goto_a
    iget-object v10, v0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 276
    .line 277
    iget-object v10, v10, Lokhttp3/Address;->a:Lokhttp3/HttpUrl;

    .line 278
    .line 279
    iget-object v11, v10, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 280
    .line 281
    iget v10, v10, Lokhttp3/HttpUrl;->e:I

    .line 282
    .line 283
    :goto_b
    if-lt v10, v5, :cond_19

    .line 284
    .line 285
    const v12, 0xffff

    .line 286
    .line 287
    .line 288
    if-gt v10, v12, :cond_19

    .line 289
    .line 290
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    sget-object v12, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 295
    .line 296
    if-ne v9, v12, :cond_14

    .line 297
    .line 298
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/List;

    .line 299
    .line 300
    invoke-static {v11, v10}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto :goto_d

    .line 308
    :cond_14
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->d:Lokhttp3/EventListener;

    .line 309
    .line 310
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 314
    .line 315
    iget-object v9, v9, Lokhttp3/Address;->b:Lokhttp3/Dns;

    .line 316
    .line 317
    invoke-interface {v9, v11}, Lokhttp3/Dns;->a(Ljava/lang/String;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v12

    .line 325
    if-nez v12, :cond_18

    .line 326
    .line 327
    iget-object v11, v0, Lokhttp3/internal/connection/RouteSelector;->d:Lokhttp3/EventListener;

    .line 328
    .line 329
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    move v12, v4

    .line 337
    :goto_c
    if-ge v12, v11, :cond_15

    .line 338
    .line 339
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v13

    .line 343
    check-cast v13, Ljava/net/InetAddress;

    .line 344
    .line 345
    iget-object v14, v0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/List;

    .line 346
    .line 347
    new-instance v15, Ljava/net/InetSocketAddress;

    .line 348
    .line 349
    invoke-direct {v15, v13, v10}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    add-int/lit8 v12, v12, 0x1

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_15
    :goto_d
    iget-object v9, v0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    move v10, v4

    .line 365
    :goto_e
    if-ge v10, v9, :cond_17

    .line 366
    .line 367
    new-instance v11, Lokhttp3/Route;

    .line 368
    .line 369
    iget-object v12, v0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 370
    .line 371
    iget-object v13, v0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/List;

    .line 372
    .line 373
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    check-cast v13, Ljava/net/InetSocketAddress;

    .line 378
    .line 379
    invoke-direct {v11, v12, v6, v13}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 380
    .line 381
    .line 382
    iget-object v12, v0, Lokhttp3/internal/connection/RouteSelector;->b:Lokhttp3/internal/connection/RouteDatabase;

    .line 383
    .line 384
    monitor-enter v12

    .line 385
    :try_start_1
    iget-object v13, v12, Lokhttp3/internal/connection/RouteDatabase;->a:Ljava/util/LinkedHashSet;

    .line 386
    .line 387
    invoke-interface {v13, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 391
    monitor-exit v12

    .line 392
    if-eqz v13, :cond_16

    .line 393
    .line 394
    iget-object v12, v0, Lokhttp3/internal/connection/RouteSelector;->h:Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_f

    .line 400
    :cond_16
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :catchall_0
    move-exception v0

    .line 407
    monitor-exit v12

    .line 408
    throw v0

    .line 409
    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    if-nez v6, :cond_d

    .line 414
    .line 415
    goto :goto_10

    .line 416
    :cond_18
    new-instance v2, Ljava/net/UnknownHostException;

    .line 417
    .line 418
    new-instance v3, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    iget-object v0, v0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 424
    .line 425
    iget-object v0, v0, Lokhttp3/Address;->b:Lokhttp3/Dns;

    .line 426
    .line 427
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    const-string v0, " returned no addresses for "

    .line 431
    .line 432
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-direct {v2, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v2

    .line 446
    :cond_19
    new-instance v0, Ljava/net/SocketException;

    .line 447
    .line 448
    new-instance v2, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    const-string v3, ":"

    .line 460
    .line 461
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    const-string v3, "; port is out of range"

    .line 468
    .line 469
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v0

    .line 480
    :cond_1a
    new-instance v2, Ljava/net/SocketException;

    .line 481
    .line 482
    invoke-static {v9}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    iget-object v4, v0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 487
    .line 488
    iget-object v4, v4, Lokhttp3/Address;->a:Lokhttp3/HttpUrl;

    .line 489
    .line 490
    iget-object v4, v4, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const-string v4, "; exhausted proxy configurations: "

    .line 496
    .line 497
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    iget-object v0, v0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 501
    .line 502
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-direct {v2, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    throw v2

    .line 513
    :cond_1b
    :goto_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    if-eqz v6, :cond_1c

    .line 518
    .line 519
    iget-object v6, v0, Lokhttp3/internal/connection/RouteSelector;->h:Ljava/util/ArrayList;

    .line 520
    .line 521
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 522
    .line 523
    .line 524
    iget-object v0, v0, Lokhttp3/internal/connection/RouteSelector;->h:Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 527
    .line 528
    .line 529
    :cond_1c
    new-instance v0, Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 530
    .line 531
    invoke-direct {v0, v2}, Lokhttp3/internal/connection/RouteSelector$Selection;-><init>(Ljava/util/ArrayList;)V

    .line 532
    .line 533
    .line 534
    iput-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->b:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 535
    .line 536
    move v0, v5

    .line 537
    goto :goto_11

    .line 538
    :cond_1d
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 539
    .line 540
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 541
    .line 542
    .line 543
    throw v0

    .line 544
    :cond_1e
    move v0, v4

    .line 545
    :goto_11
    iget-object v6, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 546
    .line 547
    monitor-enter v6

    .line 548
    :try_start_2
    iget-boolean v2, v1, Lokhttp3/internal/connection/StreamAllocation;->m:Z

    .line 549
    .line 550
    if-nez v2, :cond_28

    .line 551
    .line 552
    if-eqz v0, :cond_20

    .line 553
    .line 554
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->b:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    new-instance v2, Ljava/util/ArrayList;

    .line 560
    .line 561
    iget-object v0, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/List;

    .line 562
    .line 563
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    move v9, v4

    .line 571
    :goto_12
    if-ge v9, v0, :cond_20

    .line 572
    .line 573
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v10

    .line 577
    check-cast v10, Lokhttp3/Route;

    .line 578
    .line 579
    sget-object v11, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 580
    .line 581
    iget-object v12, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 582
    .line 583
    iget-object v13, v1, Lokhttp3/internal/connection/StreamAllocation;->a:Lokhttp3/Address;

    .line 584
    .line 585
    invoke-virtual {v11, v12, v13, v1, v10}, Lokhttp3/internal/Internal;->h(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/Route;)Lokhttp3/internal/connection/RealConnection;

    .line 586
    .line 587
    .line 588
    iget-object v11, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 589
    .line 590
    if-eqz v11, :cond_1f

    .line 591
    .line 592
    iput-object v10, v1, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 593
    .line 594
    move v8, v5

    .line 595
    move-object v7, v11

    .line 596
    goto :goto_13

    .line 597
    :cond_1f
    add-int/lit8 v9, v9, 0x1

    .line 598
    .line 599
    goto :goto_12

    .line 600
    :cond_20
    :goto_13
    if-nez v8, :cond_24

    .line 601
    .line 602
    if-nez v3, :cond_23

    .line 603
    .line 604
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->b:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 605
    .line 606
    iget v2, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 607
    .line 608
    iget-object v3, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/List;

    .line 609
    .line 610
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    if-ge v2, v3, :cond_21

    .line 615
    .line 616
    move v2, v5

    .line 617
    goto :goto_14

    .line 618
    :cond_21
    move v2, v4

    .line 619
    :goto_14
    if-eqz v2, :cond_22

    .line 620
    .line 621
    iget-object v2, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/List;

    .line 622
    .line 623
    iget v3, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 624
    .line 625
    add-int/lit8 v7, v3, 0x1

    .line 626
    .line 627
    iput v7, v0, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 628
    .line 629
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    move-object v3, v0

    .line 634
    check-cast v3, Lokhttp3/Route;

    .line 635
    .line 636
    goto :goto_15

    .line 637
    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 638
    .line 639
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 640
    .line 641
    .line 642
    throw v0

    .line 643
    :cond_23
    :goto_15
    iput-object v3, v1, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 644
    .line 645
    iput v4, v1, Lokhttp3/internal/connection/StreamAllocation;->i:I

    .line 646
    .line 647
    new-instance v7, Lokhttp3/internal/connection/RealConnection;

    .line 648
    .line 649
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 650
    .line 651
    invoke-direct {v7, v0, v3}, Lokhttp3/internal/connection/RealConnection;-><init>(Lokhttp3/ConnectionPool;Lokhttp3/Route;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v7, v4}, Lokhttp3/internal/connection/StreamAllocation;->a(Lokhttp3/internal/connection/RealConnection;Z)V

    .line 655
    .line 656
    .line 657
    :cond_24
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 658
    if-eqz v8, :cond_25

    .line 659
    .line 660
    goto :goto_17

    .line 661
    :cond_25
    iget-object v15, v1, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 662
    .line 663
    move-object v9, v7

    .line 664
    move/from16 v10, p2

    .line 665
    .line 666
    move/from16 v11, p3

    .line 667
    .line 668
    move/from16 v12, p4

    .line 669
    .line 670
    move/from16 v13, p5

    .line 671
    .line 672
    move/from16 v14, p1

    .line 673
    .line 674
    invoke-virtual/range {v9 .. v15}, Lokhttp3/internal/connection/RealConnection;->c(IIIIZLokhttp3/EventListener;)V

    .line 675
    .line 676
    .line 677
    sget-object v0, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 678
    .line 679
    iget-object v2, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 680
    .line 681
    invoke-virtual {v0, v2}, Lokhttp3/internal/Internal;->j(Lokhttp3/ConnectionPool;)Lokhttp3/internal/connection/RouteDatabase;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    iget-object v2, v7, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 686
    .line 687
    invoke-virtual {v0, v2}, Lokhttp3/internal/connection/RouteDatabase;->a(Lokhttp3/Route;)V

    .line 688
    .line 689
    .line 690
    iget-object v2, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 691
    .line 692
    monitor-enter v2

    .line 693
    :try_start_3
    iput-boolean v5, v1, Lokhttp3/internal/connection/StreamAllocation;->k:Z

    .line 694
    .line 695
    sget-object v0, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 696
    .line 697
    iget-object v3, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 698
    .line 699
    invoke-virtual {v0, v3, v7}, Lokhttp3/internal/Internal;->i(Lokhttp3/ConnectionPool;Lokhttp3/internal/connection/RealConnection;)V

    .line 700
    .line 701
    .line 702
    iget-object v0, v7, Lokhttp3/internal/connection/RealConnection;->h:Lokhttp3/internal/http2/Http2Connection;

    .line 703
    .line 704
    if-eqz v0, :cond_26

    .line 705
    .line 706
    move v4, v5

    .line 707
    :cond_26
    if-eqz v4, :cond_27

    .line 708
    .line 709
    sget-object v0, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 710
    .line 711
    iget-object v3, v1, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 712
    .line 713
    iget-object v4, v1, Lokhttp3/internal/connection/StreamAllocation;->a:Lokhttp3/Address;

    .line 714
    .line 715
    invoke-virtual {v0, v3, v4, v1}, Lokhttp3/internal/Internal;->f(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;)Ljava/net/Socket;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    iget-object v3, v1, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 720
    .line 721
    move-object v7, v3

    .line 722
    goto :goto_16

    .line 723
    :cond_27
    const/4 v0, 0x0

    .line 724
    :goto_16
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 725
    invoke-static {v0}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    .line 726
    .line 727
    .line 728
    :goto_17
    iget-object v0, v1, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    return-object v7

    .line 734
    :catchall_1
    move-exception v0

    .line 735
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 736
    throw v0

    .line 737
    :cond_28
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    .line 738
    .line 739
    const-string v2, "Canceled"

    .line 740
    .line 741
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v0

    .line 745
    :catchall_2
    move-exception v0

    .line 746
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 747
    throw v0

    .line 748
    :cond_29
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 749
    .line 750
    const-string v3, "Canceled"

    .line 751
    .line 752
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    throw v0

    .line 756
    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 757
    .line 758
    const-string v3, "codec != null"

    .line 759
    .line 760
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    throw v0

    .line 764
    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 765
    .line 766
    const-string v3, "released"

    .line 767
    .line 768
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    throw v0

    .line 772
    :catchall_3
    move-exception v0

    .line 773
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 774
    throw v0
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

.method public final e(IIIIZZ)Lokhttp3/internal/connection/RealConnection;
    .locals 12

    .line 1
    :goto_0
    move-object v1, p0

    .line 2
    move/from16 v2, p5

    .line 3
    .line 4
    move v3, p1

    .line 5
    move v4, p2

    .line 6
    move v5, p3

    .line 7
    move/from16 v6, p4

    .line 8
    .line 9
    invoke-virtual/range {v1 .. v6}, Lokhttp3/internal/connection/StreamAllocation;->d(ZIIII)Lokhttp3/internal/connection/RealConnection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v2, p0

    .line 14
    iget-object v3, v2, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 15
    .line 16
    monitor-enter v3

    .line 17
    :try_start_0
    iget v0, v1, Lokhttp3/internal/connection/RealConnection;->l:I

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->h:Lokhttp3/internal/http2/Http2Connection;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move v0, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_1
    if-nez v0, :cond_1

    .line 31
    .line 32
    monitor-exit v3

    .line 33
    return-object v1

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_7

    .line 45
    .line 46
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_7

    .line 53
    .line 54
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    iget-object v3, v1, Lokhttp3/internal/connection/RealConnection;->h:Lokhttp3/internal/http2/Http2Connection;

    .line 64
    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    monitor-enter v3

    .line 72
    :try_start_1
    iget-boolean v0, v3, Lokhttp3/internal/http2/Http2Connection;->o:Z

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    iget-wide v8, v3, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 78
    .line 79
    iget-wide v10, v3, Lokhttp3/internal/http2/Http2Connection;->u:J

    .line 80
    .line 81
    cmp-long v0, v8, v10

    .line 82
    .line 83
    if-gez v0, :cond_4

    .line 84
    .line 85
    iget-wide v8, v3, Lokhttp3/internal/http2/Http2Connection;->w:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    .line 87
    cmp-long v0, v6, v8

    .line 88
    .line 89
    if-ltz v0, :cond_4

    .line 90
    .line 91
    :goto_2
    monitor-exit v3

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    monitor-exit v3

    .line 94
    goto :goto_4

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    monitor-exit v3

    .line 97
    throw v0

    .line 98
    :cond_5
    if-eqz p6, :cond_8

    .line 99
    .line 100
    :try_start_2
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I

    .line 103
    .line 104
    .line 105
    move-result v3
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    :try_start_3
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 107
    .line 108
    invoke-virtual {v0, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->i:Lxc/s;

    .line 112
    .line 113
    invoke-virtual {v0}, Lxc/s;->v()Z

    .line 114
    .line 115
    .line 116
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    :try_start_4
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    iget-object v0, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 126
    .line 127
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :catchall_2
    move-exception v0

    .line 132
    iget-object v6, v1, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 133
    .line 134
    invoke-virtual {v6, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 135
    .line 136
    .line 137
    throw v0
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 138
    :catch_0
    :cond_7
    :goto_3
    move v4, v5

    .line 139
    :catch_1
    :cond_8
    :goto_4
    if-nez v4, :cond_9

    .line 140
    .line 141
    invoke-virtual {p0}, Lokhttp3/internal/connection/StreamAllocation;->f()V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_9
    return-object v1

    .line 147
    :goto_5
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 148
    throw v0
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

.method public final f()V
    .locals 4

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v3}, Lokhttp3/internal/connection/StreamAllocation;->c(ZZZ)Ljava/net/Socket;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lokhttp3/internal/connection/StreamAllocation;->c(ZZZ)Ljava/net/Socket;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v1, v4

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    sget-object v0, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->e:Lokhttp3/Call;

    invoke-virtual {v0, v1, v4}, Lokhttp3/internal/Internal;->k(Lokhttp3/Call;Ljava/io/IOException;)Ljava/io/IOException;

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    instance-of v1, p1, Lokhttp3/internal/http2/StreamResetException;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    check-cast p1, Lokhttp3/internal/http2/StreamResetException;

    .line 12
    .line 13
    iget-object p1, p1, Lokhttp3/internal/http2/StreamResetException;->a:Lokhttp3/internal/http2/ErrorCode;

    .line 14
    .line 15
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->f:Lokhttp3/internal/http2/ErrorCode;

    .line 16
    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    iget p1, p0, Lokhttp3/internal/connection/StreamAllocation;->i:I

    .line 20
    .line 21
    add-int/2addr p1, v3

    .line 22
    iput p1, p0, Lokhttp3/internal/connection/StreamAllocation;->i:I

    .line 23
    .line 24
    if-le p1, v3, :cond_6

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->o:Lokhttp3/internal/http2/ErrorCode;

    .line 28
    .line 29
    if-eq p1, v1, :cond_6

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 33
    .line 34
    if-eqz v1, :cond_6

    .line 35
    .line 36
    iget-object v5, v1, Lokhttp3/internal/connection/RealConnection;->h:Lokhttp3/internal/http2/Http2Connection;

    .line 37
    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    move v5, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v5, v4

    .line 43
    :goto_0
    if-eqz v5, :cond_3

    .line 44
    .line 45
    instance-of v5, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 46
    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    :cond_3
    iget v1, v1, Lokhttp3/internal/connection/RealConnection;->l:I

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    iget-object v5, p0, Lokhttp3/internal/connection/StreamAllocation;->h:Lokhttp3/internal/connection/RouteSelector;

    .line 60
    .line 61
    invoke-virtual {v5, v1, p1}, Lokhttp3/internal/connection/RouteSelector;->a(Lokhttp3/Route;Ljava/io/IOException;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    iput-object v2, p0, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 65
    .line 66
    :cond_5
    move p1, v3

    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_4

    .line 70
    :cond_6
    move p1, v4

    .line 71
    :goto_2
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 72
    .line 73
    invoke-virtual {p0, p1, v4, v3}, Lokhttp3/internal/connection/StreamAllocation;->c(ZZZ)Ljava/net/Socket;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v3, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    .line 78
    .line 79
    if-nez v3, :cond_8

    .line 80
    .line 81
    iget-boolean v3, p0, Lokhttp3/internal/connection/StreamAllocation;->k:Z

    .line 82
    .line 83
    if-nez v3, :cond_7

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_7
    move-object v2, v1

    .line 87
    :cond_8
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    invoke-static {p1}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    .line 89
    .line 90
    .line 91
    if-eqz v2, :cond_9

    .line 92
    .line 93
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    :cond_9
    return-void

    .line 99
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    throw p1
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

.method public final i(ZLokhttp3/internal/http/HttpCodec;Ljava/io/IOException;)V
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    monitor-enter v0

    if-eqz p2, :cond_5

    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    if-ne p2, v1, :cond_5

    const/4 p2, 0x1

    if-nez p1, :cond_0

    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    iget v2, v1, Lokhttp3/internal/connection/RealConnection;->l:I

    add-int/2addr v2, p2

    iput v2, v1, Lokhttp3/internal/connection/RealConnection;->l:I

    :cond_0
    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, p2}, Lokhttp3/internal/connection/StreamAllocation;->c(ZZZ)Ljava/net/Socket;

    move-result-object p1

    iget-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->j:Lokhttp3/internal/connection/RealConnection;

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    move-object v1, v2

    :cond_1
    iget-boolean p2, p0, Lokhttp3/internal/connection/StreamAllocation;->l:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    if-eqz v1, :cond_2

    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    if-eqz p3, :cond_3

    sget-object p1, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    iget-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->e:Lokhttp3/Call;

    invoke-virtual {p1, p2, p3}, Lokhttp3/internal/Internal;->k(Lokhttp3/Call;Ljava/io/IOException;)Ljava/io/IOException;

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    sget-object p1, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    iget-object p2, p0, Lokhttp3/internal/connection/StreamAllocation;->e:Lokhttp3/Call;

    invoke-virtual {p1, p2, v2}, Lokhttp3/internal/Internal;->k(Lokhttp3/Call;Ljava/io/IOException;)Ljava/io/IOException;

    :goto_0
    iget-object p1, p0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    return-void

    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lokhttp3/internal/connection/StreamAllocation;->b()Lokhttp3/internal/connection/RealConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/connection/StreamAllocation;->a:Lokhttp3/Address;

    invoke-virtual {v0}, Lokhttp3/Address;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
