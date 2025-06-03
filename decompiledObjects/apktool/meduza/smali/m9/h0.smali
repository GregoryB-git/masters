.class public final Lm9/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/o0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/h0$a;
    }
.end annotation


# instance fields
.field public final a:Lj9/f;

.field public final b:Lm9/h0$a;

.field public final c:Li9/n;

.field public final d:Lm9/j;

.field public final e:Lm9/h;

.field public final f:Ljava/util/HashMap;

.field public final g:Lm9/b0;

.field public h:Z

.field public final i:Lm9/p0;

.field public final j:Lm9/q0;

.field public k:Lm9/o0;

.field public final l:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Lj9/f;Lg9/b0$a;Li9/n;Lm9/j;Ln9/a;Lm9/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm9/h0;->h:Z

    .line 6
    .line 7
    iput-object p1, p0, Lm9/h0;->a:Lj9/f;

    .line 8
    .line 9
    iput-object p2, p0, Lm9/h0;->b:Lm9/h0$a;

    .line 10
    .line 11
    iput-object p3, p0, Lm9/h0;->c:Li9/n;

    .line 12
    .line 13
    iput-object p4, p0, Lm9/h0;->d:Lm9/j;

    .line 14
    .line 15
    iput-object p6, p0, Lm9/h0;->e:Lm9/h;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayDeque;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    new-instance p1, Lm9/b0;

    .line 32
    .line 33
    new-instance p3, Laa/m0;

    .line 34
    .line 35
    const/16 v0, 0xa

    .line 36
    .line 37
    invoke-direct {p3, p2, v0}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p5, p3}, Lm9/b0;-><init>(Ln9/a;Laa/m0;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lm9/h0;->g:Lm9/b0;

    .line 44
    .line 45
    new-instance p1, Lm9/f0;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lm9/f0;-><init>(Lm9/h0;)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Lm9/p0;

    .line 51
    .line 52
    iget-object p3, p4, Lm9/j;->c:Lm9/v;

    .line 53
    .line 54
    iget-object v0, p4, Lm9/j;->b:Ln9/a;

    .line 55
    .line 56
    iget-object v1, p4, Lm9/j;->a:Lm9/e0;

    .line 57
    .line 58
    invoke-direct {p2, p3, v0, v1, p1}, Lm9/p0;-><init>(Lm9/v;Ln9/a;Lm9/e0;Lm9/f0;)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lm9/h0;->i:Lm9/p0;

    .line 62
    .line 63
    new-instance p1, Lm9/g0;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Lm9/g0;-><init>(Lm9/h0;)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Lm9/q0;

    .line 69
    .line 70
    iget-object p3, p4, Lm9/j;->c:Lm9/v;

    .line 71
    .line 72
    iget-object v0, p4, Lm9/j;->b:Ln9/a;

    .line 73
    .line 74
    iget-object p4, p4, Lm9/j;->a:Lm9/e0;

    .line 75
    .line 76
    invoke-direct {p2, p3, v0, p4, p1}, Lm9/q0;-><init>(Lm9/v;Ln9/a;Lm9/e0;Lm9/g0;)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lm9/h0;->j:Lm9/q0;

    .line 80
    .line 81
    new-instance p1, Li9/i1;

    .line 82
    .line 83
    const/4 p2, 0x1

    .line 84
    invoke-direct {p1, p2, p0, p5}, Li9/i1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p6, p1}, Lm9/d;->a(Li9/i1;)V

    .line 88
    .line 89
    .line 90
    return-void
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


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    sget-object v0, Lm9/i0;->a:Lm9/i0;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/h0;->i:Lm9/p0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm9/a;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    sget-object v2, Leb/e1;->e:Leb/e1;

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2}, Lm9/a;->a(Lm9/i0;Leb/e1;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lm9/h0;->j:Lm9/q0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lm9/a;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    sget-object v2, Leb/e1;->e:Leb/e1;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lm9/a;->a(Lm9/i0;Leb/e1;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    new-array v1, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget-object v3, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    aput-object v3, v1, v2

    .line 52
    .line 53
    const-string v2, "RemoteStore"

    .line 54
    .line 55
    const-string v3, "Stopping write stream with %d pending writes"

    .line 56
    .line 57
    invoke-static {v0, v2, v3, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 63
    .line 64
    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lm9/h0;->k:Lm9/o0;

    .line 67
    .line 68
    return-void
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

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm9/h0;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lm9/h0;->j:Lm9/q0;

    .line 5
    .line 6
    iget-object v1, p0, Lm9/h0;->c:Li9/n;

    .line 7
    .line 8
    iget-object v1, v1, Li9/n;->c:Li9/a0;

    .line 9
    .line 10
    invoke-interface {v1}, Li9/a0;->i()Lma/h;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lm9/q0;->v:Lma/h;

    .line 21
    .line 22
    invoke-virtual {p0}, Lm9/h0;->g()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lm9/h0;->i()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lm9/h0;->g:Lm9/b0;

    .line 33
    .line 34
    sget-object v1, Lg9/d0;->a:Lg9/d0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lm9/b0;->c(Lg9/d0;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Lm9/h0;->c()V

    .line 40
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lk9/g;

    .line 18
    .line 19
    iget v0, v0, Lk9/g;->a:I

    .line 20
    .line 21
    :goto_0
    iget-boolean v1, p0, Lm9/h0;->h:Z

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/16 v3, 0xa

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ge v1, v3, :cond_1

    .line 36
    .line 37
    move v1, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v1, v4

    .line 40
    :goto_1
    if-eqz v1, :cond_5

    .line 41
    .line 42
    iget-object v1, p0, Lm9/h0;->c:Li9/n;

    .line 43
    .line 44
    iget-object v1, v1, Li9/n;->c:Li9/a0;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Li9/a0;->f(I)Lk9/g;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    iget-object v0, p0, Lm9/h0;->j:Lm9/q0;

    .line 61
    .line 62
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    iget-object v1, v0, Lm9/a;->b:Ln9/a$a;

    .line 69
    .line 70
    if-nez v1, :cond_5

    .line 71
    .line 72
    iget-object v1, v0, Lm9/a;->f:Ln9/a;

    .line 73
    .line 74
    iget-object v2, v0, Lm9/a;->g:Ln9/a$c;

    .line 75
    .line 76
    sget-wide v5, Lm9/a;->p:J

    .line 77
    .line 78
    iget-object v3, v0, Lm9/a;->e:Lm9/a$b;

    .line 79
    .line 80
    invoke-virtual {v1, v2, v5, v6, v3}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, v0, Lm9/a;->b:Ln9/a$a;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    iget-boolean v1, p0, Lm9/h0;->h:Z

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    iget-object v1, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-ge v1, v3, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    move v2, v4

    .line 101
    :goto_2
    new-array v1, v4, [Ljava/lang/Object;

    .line 102
    .line 103
    const-string v3, "addToWritePipeline called when pipeline is full"

    .line 104
    .line 105
    invoke-static {v3, v2, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lm9/h0;->j:Lm9/q0;

    .line 114
    .line 115
    invoke-virtual {v1}, Lm9/a;->c()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    iget-object v1, p0, Lm9/h0;->j:Lm9/q0;

    .line 122
    .line 123
    iget-boolean v2, v1, Lm9/q0;->u:Z

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    iget-object v2, v0, Lk9/g;->d:Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Lm9/q0;->j(Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    iget v0, v0, Lk9/g;->a:I

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    :goto_3
    invoke-virtual {p0}, Lm9/h0;->h()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    invoke-virtual {p0}, Lm9/h0;->h()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    new-array v1, v4, [Ljava/lang/Object;

    .line 146
    .line 147
    const-string v2, "startWriteStream() called when shouldStartWriteStream() is false."

    .line 148
    .line 149
    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lm9/h0;->j:Lm9/q0;

    .line 153
    .line 154
    invoke-virtual {v0}, Lm9/q0;->g()V

    .line 155
    .line 156
    .line 157
    :cond_6
    return-void
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
.end method

.method public final d(Li9/m1;)V
    .locals 2

    .line 1
    iget v0, p1, Li9/m1;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lm9/h0;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lm9/h0;->i()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 32
    .line 33
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lm9/h0;->f(Li9/m1;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
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

.method public final e(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm9/h0;->k:Lm9/o0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm9/o0;->a(I)Lm9/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v0, Lm9/l0;->a:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iput v1, v0, Lm9/l0;->a:I

    .line 12
    .line 13
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v3, "Unwatching targets requires an open stream"

    .line 23
    .line 24
    invoke-static {v3, v1, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lka/s;->L()Lka/s$a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, v0, Lm9/p0;->t:Lm9/e0;

    .line 32
    .line 33
    iget-object v2, v2, Lm9/e0;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 36
    .line 37
    .line 38
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 39
    .line 40
    check-cast v3, Lka/s;

    .line 41
    .line 42
    invoke-static {v3, v2}, Lka/s;->H(Lka/s;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 46
    .line 47
    .line 48
    iget-object v2, v1, Lma/w$a;->b:Lma/w;

    .line 49
    .line 50
    check-cast v2, Lka/s;

    .line 51
    .line 52
    invoke-static {v2, p1}, Lka/s;->J(Lka/s;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lka/s;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lm9/a;->i(Lma/w;)V

    .line 62
    .line 63
    .line 64
    return-void
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

.method public final f(Li9/m1;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lm9/h0;->k:Lm9/o0;

    .line 2
    .line 3
    iget v1, p1, Li9/m1;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lm9/o0;->a(I)Lm9/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Lm9/l0;->a:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    add-int/2addr v1, v2

    .line 13
    iput v1, v0, Lm9/l0;->a:I

    .line 14
    .line 15
    iget-object v0, p1, Li9/m1;->g:Lma/h;

    .line 16
    .line 17
    invoke-virtual {v0}, Lma/h;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p1, Li9/m1;->e:Lj9/q;

    .line 24
    .line 25
    sget-object v1, Lj9/q;->b:Lj9/q;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lj9/q;->f(Lj9/q;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-lez v0, :cond_1

    .line 32
    .line 33
    :cond_0
    iget v0, p1, Li9/m1;->b:I

    .line 34
    .line 35
    iget-object v1, p0, Lm9/h0;->b:Lm9/h0$a;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Lm9/h0$a;->d(I)Lt8/e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lt8/e;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    new-instance v0, Li9/m1;

    .line 50
    .line 51
    iget-object v4, p1, Li9/m1;->a:Lg9/k0;

    .line 52
    .line 53
    iget v5, p1, Li9/m1;->b:I

    .line 54
    .line 55
    iget-wide v6, p1, Li9/m1;->c:J

    .line 56
    .line 57
    iget-object v8, p1, Li9/m1;->d:Li9/e0;

    .line 58
    .line 59
    iget-object v9, p1, Li9/m1;->e:Lj9/q;

    .line 60
    .line 61
    iget-object v10, p1, Li9/m1;->f:Lj9/q;

    .line 62
    .line 63
    iget-object v11, p1, Li9/m1;->g:Lma/h;

    .line 64
    .line 65
    move-object v3, v0

    .line 66
    invoke-direct/range {v3 .. v12}, Li9/m1;-><init>(Lg9/k0;IJLi9/e0;Lj9/q;Lj9/q;Lma/h;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v0

    .line 70
    :cond_1
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 71
    .line 72
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v3, 0x0

    .line 77
    new-array v4, v3, [Ljava/lang/Object;

    .line 78
    .line 79
    const-string v5, "Watching queries requires an open stream"

    .line 80
    .line 81
    invoke-static {v5, v1, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lka/s;->L()Lka/s$a;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v4, v0, Lm9/p0;->t:Lm9/e0;

    .line 89
    .line 90
    iget-object v4, v4, Lm9/e0;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 93
    .line 94
    .line 95
    iget-object v5, v1, Lma/w$a;->b:Lma/w;

    .line 96
    .line 97
    check-cast v5, Lka/s;

    .line 98
    .line 99
    invoke-static {v5, v4}, Lka/s;->H(Lka/s;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v4, v0, Lm9/p0;->t:Lm9/e0;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lka/a0;->M()Lka/a0$a;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v6, p1, Li9/m1;->a:Lg9/k0;

    .line 112
    .line 113
    invoke-virtual {v6}, Lg9/k0;->e()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_2

    .line 118
    .line 119
    invoke-static {}, Lka/a0$b;->K()Lka/a0$b$a;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    iget-object v6, v6, Lg9/k0;->d:Lj9/o;

    .line 124
    .line 125
    iget-object v4, v4, Lm9/e0;->a:Lj9/f;

    .line 126
    .line 127
    invoke-static {v4, v6}, Lm9/e0;->m(Lj9/f;Lj9/o;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v7}, Lma/w$a;->m()V

    .line 132
    .line 133
    .line 134
    iget-object v6, v7, Lma/w$a;->b:Lma/w;

    .line 135
    .line 136
    check-cast v6, Lka/a0$b;

    .line 137
    .line 138
    invoke-static {v6, v4}, Lka/a0$b;->G(Lka/a0$b;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Lma/w$a;->k()Lma/w;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Lka/a0$b;

    .line 146
    .line 147
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 148
    .line 149
    .line 150
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 151
    .line 152
    check-cast v6, Lka/a0;

    .line 153
    .line 154
    invoke-static {v6, v4}, Lka/a0;->H(Lka/a0;Lka/a0$b;)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    invoke-virtual {v4, v6}, Lm9/e0;->l(Lg9/k0;)Lka/a0$c;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 163
    .line 164
    .line 165
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 166
    .line 167
    check-cast v6, Lka/a0;

    .line 168
    .line 169
    invoke-static {v6, v4}, Lka/a0;->G(Lka/a0;Lka/a0$c;)V

    .line 170
    .line 171
    .line 172
    :goto_0
    iget v4, p1, Li9/m1;->b:I

    .line 173
    .line 174
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 175
    .line 176
    .line 177
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 178
    .line 179
    check-cast v6, Lka/a0;

    .line 180
    .line 181
    invoke-static {v6, v4}, Lka/a0;->K(Lka/a0;I)V

    .line 182
    .line 183
    .line 184
    iget-object v4, p1, Li9/m1;->g:Lma/h;

    .line 185
    .line 186
    invoke-virtual {v4}, Lma/h;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_3

    .line 191
    .line 192
    iget-object v4, p1, Li9/m1;->e:Lj9/q;

    .line 193
    .line 194
    sget-object v6, Lj9/q;->b:Lj9/q;

    .line 195
    .line 196
    invoke-virtual {v4, v6}, Lj9/q;->f(Lj9/q;)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-lez v4, :cond_3

    .line 201
    .line 202
    iget-object v4, p1, Li9/m1;->e:Lj9/q;

    .line 203
    .line 204
    iget-object v4, v4, Lj9/q;->a:Lu7/m;

    .line 205
    .line 206
    invoke-static {v4}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 211
    .line 212
    .line 213
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 214
    .line 215
    check-cast v6, Lka/a0;

    .line 216
    .line 217
    invoke-static {v6, v4}, Lka/a0;->J(Lka/a0;Lma/n1;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_3
    iget-object v4, p1, Li9/m1;->g:Lma/h;

    .line 222
    .line 223
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 224
    .line 225
    .line 226
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 227
    .line 228
    check-cast v6, Lka/a0;

    .line 229
    .line 230
    invoke-static {v6, v4}, Lka/a0;->I(Lka/a0;Lma/h;)V

    .line 231
    .line 232
    .line 233
    :goto_1
    iget-object v4, p1, Li9/m1;->h:Ljava/lang/Integer;

    .line 234
    .line 235
    if-eqz v4, :cond_5

    .line 236
    .line 237
    iget-object v4, p1, Li9/m1;->g:Lma/h;

    .line 238
    .line 239
    invoke-virtual {v4}, Lma/h;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_4

    .line 244
    .line 245
    iget-object v4, p1, Li9/m1;->e:Lj9/q;

    .line 246
    .line 247
    sget-object v6, Lj9/q;->b:Lj9/q;

    .line 248
    .line 249
    invoke-virtual {v4, v6}, Lj9/q;->f(Lj9/q;)I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-lez v4, :cond_5

    .line 254
    .line 255
    :cond_4
    invoke-static {}, Lma/x;->J()Lma/x$a;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    iget-object v6, p1, Li9/m1;->h:Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-virtual {v4}, Lma/w$a;->m()V

    .line 266
    .line 267
    .line 268
    iget-object v7, v4, Lma/w$a;->b:Lma/w;

    .line 269
    .line 270
    check-cast v7, Lma/x;

    .line 271
    .line 272
    invoke-static {v7, v6}, Lma/x;->G(Lma/x;I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 276
    .line 277
    .line 278
    iget-object v6, v5, Lma/w$a;->b:Lma/w;

    .line 279
    .line 280
    check-cast v6, Lka/a0;

    .line 281
    .line 282
    invoke-virtual {v4}, Lma/w$a;->k()Lma/w;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, Lma/x;

    .line 287
    .line 288
    invoke-static {v6, v4}, Lka/a0;->L(Lka/a0;Lma/x;)V

    .line 289
    .line 290
    .line 291
    :cond_5
    invoke-virtual {v5}, Lma/w$a;->k()Lma/w;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Lka/a0;

    .line 296
    .line 297
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 298
    .line 299
    .line 300
    iget-object v5, v1, Lma/w$a;->b:Lma/w;

    .line 301
    .line 302
    check-cast v5, Lka/s;

    .line 303
    .line 304
    invoke-static {v5, v4}, Lka/s;->I(Lka/s;Lka/a0;)V

    .line 305
    .line 306
    .line 307
    iget-object v4, v0, Lm9/p0;->t:Lm9/e0;

    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    iget-object p1, p1, Li9/m1;->d:Li9/e0;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    const/4 v5, 0x0

    .line 319
    if-eqz v4, :cond_9

    .line 320
    .line 321
    if-eq v4, v2, :cond_8

    .line 322
    .line 323
    const/4 v6, 0x2

    .line 324
    if-eq v4, v6, :cond_7

    .line 325
    .line 326
    const/4 v6, 0x3

    .line 327
    if-ne v4, v6, :cond_6

    .line 328
    .line 329
    const-string p1, "limbo-document"

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_6
    new-array v0, v2, [Ljava/lang/Object;

    .line 333
    .line 334
    aput-object p1, v0, v3

    .line 335
    .line 336
    const-string p1, "Unrecognized query purpose: %s"

    .line 337
    .line 338
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    throw v5

    .line 342
    :cond_7
    const-string p1, "existence-filter-mismatch-bloom"

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_8
    const-string p1, "existence-filter-mismatch"

    .line 346
    .line 347
    goto :goto_2

    .line 348
    :cond_9
    move-object p1, v5

    .line 349
    :goto_2
    if-nez p1, :cond_a

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_a
    new-instance v5, Ljava/util/HashMap;

    .line 353
    .line 354
    invoke-direct {v5, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 355
    .line 356
    .line 357
    const-string v2, "goog-listen-tags"

    .line 358
    .line 359
    invoke-virtual {v5, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    :goto_3
    if-eqz v5, :cond_b

    .line 363
    .line 364
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 365
    .line 366
    .line 367
    iget-object p1, v1, Lma/w$a;->b:Lma/w;

    .line 368
    .line 369
    check-cast p1, Lka/s;

    .line 370
    .line 371
    invoke-static {p1}, Lka/s;->G(Lka/s;)Lma/m0;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {p1, v5}, Lma/m0;->putAll(Ljava/util/Map;)V

    .line 376
    .line 377
    .line 378
    :cond_b
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    check-cast p1, Lka/s;

    .line 383
    .line 384
    invoke-virtual {v0, p1}, Lm9/a;->i(Lma/w;)V

    .line 385
    .line 386
    .line 387
    return-void
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

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm9/h0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm9/a;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    return v0
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
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm9/h0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm9/h0;->j:Lm9/q0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm9/a;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    return v0
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
.end method

.method public final i()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lm9/h0;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "startWatchStream() called when shouldStartWatchStream() is false."

    .line 9
    .line 10
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lm9/o0;

    .line 14
    .line 15
    iget-object v2, p0, Lm9/h0;->a:Lj9/f;

    .line 16
    .line 17
    invoke-direct {v0, v2, p0}, Lm9/o0;-><init>(Lj9/f;Lm9/o0$a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lm9/h0;->k:Lm9/o0;

    .line 21
    .line 22
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lm9/a;->g()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lm9/h0;->g:Lm9/b0;

    .line 28
    .line 29
    iget v2, v0, Lm9/b0;->b:I

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Lg9/d0;->a:Lg9/d0;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lm9/b0;->b(Lg9/d0;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Lm9/b0;->c:Ln9/a$a;

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v2, v1

    .line 45
    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v3, "onlineStateTimer shouldn\'t be started yet"

    .line 48
    .line 49
    invoke-static {v3, v2, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lm9/b0;->e:Ln9/a;

    .line 53
    .line 54
    sget-object v2, Ln9/a$c;->f:Ln9/a$c;

    .line 55
    .line 56
    const-wide/16 v3, 0x2710

    .line 57
    .line 58
    new-instance v5, Lu/a;

    .line 59
    .line 60
    const/16 v6, 0xe

    .line 61
    .line 62
    invoke-direct {v5, v0, v6}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3, v4, v5}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, v0, Lm9/b0;->c:Ln9/a$a;

    .line 70
    .line 71
    :cond_1
    return-void
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

.method public final j(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Li9/m1;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const-string v2, "stopListening called on target no currently watched: %d"

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lm9/h0;->i:Lm9/p0;

    .line 34
    .line 35
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lm9/h0;->e(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p1, p0, Lm9/h0;->f:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lm9/h0;->i:Lm9/p0;

    .line 53
    .line 54
    invoke-virtual {p1}, Lm9/a;->c()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lm9/h0;->i:Lm9/p0;

    .line 61
    .line 62
    invoke-virtual {p1}, Lm9/a;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p1, Lm9/a;->b:Ln9/a$a;

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p1, Lm9/a;->f:Ln9/a;

    .line 73
    .line 74
    iget-object v1, p1, Lm9/a;->g:Ln9/a$c;

    .line 75
    .line 76
    sget-wide v2, Lm9/a;->p:J

    .line 77
    .line 78
    iget-object v4, p1, Lm9/a;->e:Lm9/a$b;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2, v3, v4}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p1, Lm9/a;->b:Ln9/a$a;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    iget-boolean p1, p0, Lm9/h0;->h:Z

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    iget-object p1, p0, Lm9/h0;->g:Lm9/b0;

    .line 92
    .line 93
    sget-object v0, Lg9/d0;->a:Lg9/d0;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lm9/b0;->c(Lg9/d0;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    return-void
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
