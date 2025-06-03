.class public Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$IDelegate;
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;
.implements Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Delegate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;
    }
.end annotation


# static fields
.field private static final DEFAULT_GAMES_SIGN_IN:Ljava/lang/String; = "SignInOption.games"

.field private static final DEFAULT_SIGN_IN:Ljava/lang/String; = "SignInOption.standard"

.field private static final ERROR_FAILURE_TO_RECOVER_AUTH:Ljava/lang/String; = "failed_to_recover_auth"

.field private static final ERROR_REASON_EXCEPTION:Ljava/lang/String; = "exception"

.field private static final ERROR_REASON_NETWORK_ERROR:Ljava/lang/String; = "network_error"

.field private static final ERROR_REASON_SIGN_IN_CANCELED:Ljava/lang/String; = "sign_in_canceled"

.field private static final ERROR_REASON_SIGN_IN_FAILED:Ljava/lang/String; = "sign_in_failed"

.field private static final ERROR_REASON_SIGN_IN_REQUIRED:Ljava/lang/String; = "sign_in_required"

.field private static final ERROR_REASON_STATUS:Ljava/lang/String; = "status"

.field private static final ERROR_USER_RECOVERABLE_AUTH:Ljava/lang/String; = "user_recoverable_auth"

.field private static final REQUEST_CODE_RECOVER_AUTH:I = 0xd02e

.field public static final REQUEST_CODE_REQUEST_SCOPE:I = 0xd02f

.field private static final REQUEST_CODE_SIGNIN:I = 0xd02d


# instance fields
.field private activity:Landroid/app/Activity;

.field private final backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

.field private final context:Landroid/content/Context;

.field private final googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

.field private pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

.field private requestedScopes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private signInClient:Lg6/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;-><init>(I)V

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$disconnect$1(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$signOut$0(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private checkAndSetPendingAccessTokenOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingStringOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingBoolOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move-object v7, p6

    .line 14
    invoke-direct/range {v1 .. v7}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;-><init>(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string p3, "Concurrent operations detected: "

    .line 23
    .line 24
    invoke-static {p3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iget-object p4, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 29
    .line 30
    iget-object p4, p4, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->method:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p4, ", "

    .line 36
    .line 37
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p2
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

.method private checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingStringOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$clearAuthCache$3(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$getAccessToken$4(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private errorCodeForStatus(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x30d5

    if-eq p1, v0, :cond_0

    const-string p1, "sign_in_failed"

    return-object p1

    :cond_0
    const-string p1, "sign_in_canceled"

    return-object p1

    :cond_1
    const-string p1, "network_error"

    return-object p1

    :cond_2
    const-string p1, "sign_in_required"

    return-object p1
.end method

.method public static synthetic f(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$clearAuthCache$2(Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private finishWithBoolean(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->boolResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->userDataResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->boolResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->stringResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->voidResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    :goto_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/googlesignin/Messages$Result;

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    iput-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithSuccess()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->voidResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithUserData(Lio/flutter/plugins/googlesignin/Messages$UserData;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->userDataResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$getAccessToken$5(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private lambda$clearAuthCache$2(Ljava/lang/String;)Ljava/lang/Void;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 2
    .line 3
    sget v1, Lz5/d;->d:I

    .line 4
    .line 5
    const-string v1, "Calling this from your main thread can lead to deadlock"

    .line 6
    .line 7
    invoke-static {v1}, Lm6/j;->h(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lz5/l;->d(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lz5/l;->e(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzdc;->zzd(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhw;->zze()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-static {v0}, Lz5/l;->g(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzh;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/zzg;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v4, Lcom/google/android/gms/internal/auth/zzbw;

    .line 42
    .line 43
    invoke-direct {v4}, Lcom/google/android/gms/internal/auth/zzbw;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/auth/zzbw;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/auth/zzbw;

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/auth/zzg;->zza(Lcom/google/android/gms/internal/auth/zzbw;)Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v4, "clear token"

    .line 54
    .line 55
    :try_start_0
    invoke-static {v2, v4}, Lz5/l;->c(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Lk6/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v2

    .line 60
    sget-object v5, Lz5/l;->c:Lp6/a;

    .line 61
    .line 62
    const/4 v6, 0x2

    .line 63
    new-array v6, v6, [Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    aput-object v4, v6, v7

    .line 67
    .line 68
    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    aput-object v2, v6, v3

    .line 73
    .line 74
    const-string v2, "%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s"

    .line 75
    .line 76
    invoke-virtual {v5, v2, v6}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    new-instance v2, Lr4/c;

    .line 80
    .line 81
    invoke-direct {v2, v3, p1, v1}, Lr4/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lz5/l;->b:Landroid/content/ComponentName;

    .line 85
    .line 86
    invoke-static {v0, p1, v2}, Lz5/l;->b(Landroid/content/Context;Landroid/content/ComponentName;Lz5/k;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :goto_0
    const/4 p1, 0x0

    .line 90
    return-object p1
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

.method private static synthetic lambda$clearAuthCache$3(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V
    .locals 3

    const-string v0, "exception"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Void;

    invoke-interface {p0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    new-instance v2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    if-nez p1, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {v2, v0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method private synthetic lambda$disconnect$1(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithSuccess()V

    goto :goto_0

    :cond_0
    const-string p1, "status"

    const-string v0, "Failed to disconnect."

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private lambda$getAccessToken$4(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Landroid/accounts/Account;

    .line 2
    .line 3
    const-string v1, "com.google"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "oauth2:"

    .line 9
    .line 10
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestedScopes:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    check-cast v4, Ljava/lang/CharSequence;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 83
    .line 84
    sget v2, Lz5/d;->d:I

    .line 85
    .line 86
    new-instance v2, Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lz5/l;->f(Landroid/accounts/Account;)V

    .line 92
    .line 93
    .line 94
    const-string v3, "Calling this from your main thread can lead to deadlock"

    .line 95
    .line 96
    invoke-static {v3}, Lm6/j;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v3, "Scope cannot be empty or null."

    .line 100
    .line 101
    invoke-static {v3, p1}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lz5/l;->f(Landroid/accounts/Account;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lz5/l;->d(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    new-instance v3, Landroid/os/Bundle;

    .line 111
    .line 112
    invoke-direct {v3, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v3}, Lz5/l;->e(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lcom/google/android/gms/internal/auth/zzdc;->zzd(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhw;->zze()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    invoke-static {v1}, Lz5/l;->g(Landroid/content/Context;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_3

    .line 132
    .line 133
    invoke-static {v1}, Lcom/google/android/gms/internal/auth/zzh;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/zzg;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2, v0, p1, v3}, Lcom/google/android/gms/internal/auth/zzg;->zzc(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const-string v4, "token retrieval"

    .line 142
    .line 143
    const/4 v5, 0x0

    .line 144
    :try_start_1
    invoke-static {v2, v4}, Lz5/l;->c(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Landroid/os/Bundle;

    .line 149
    .line 150
    if-eqz v2, :cond_2

    .line 151
    .line 152
    invoke-static {v1, v2}, Lz5/l;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    sget-object v2, Lz5/l;->c:Lp6/a;

    .line 158
    .line 159
    new-array v6, v5, [Ljava/lang/Object;

    .line 160
    .line 161
    const-string v7, "Service call returned null."

    .line 162
    .line 163
    invoke-virtual {v2, v7, v6}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v2, Ljava/io/IOException;

    .line 167
    .line 168
    const-string v6, "Service unavailable."

    .line 169
    .line 170
    invoke-direct {v2, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v2
    :try_end_1
    .catch Lk6/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    :catch_0
    move-exception v2

    .line 175
    sget-object v6, Lz5/l;->c:Lp6/a;

    .line 176
    .line 177
    const/4 v7, 0x2

    .line 178
    new-array v7, v7, [Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v4, v7, v5

    .line 181
    .line 182
    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/4 v4, 0x1

    .line 187
    aput-object v2, v7, v4

    .line 188
    .line 189
    const-string v2, "%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s"

    .line 190
    .line 191
    invoke-virtual {v6, v2, v7}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_3
    new-instance v2, Lz5/j;

    .line 195
    .line 196
    invoke-direct {v2, v0, v3, v1, p1}, Lz5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sget-object p1, Lz5/l;->b:Landroid/content/ComponentName;

    .line 200
    .line 201
    invoke-static {v1, p1, v2}, Lz5/l;->b(Landroid/content/Context;Landroid/content/ComponentName;Lz5/k;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Lcom/google/android/gms/auth/TokenData;

    .line 206
    .line 207
    :goto_2
    iget-object p1, p1, Lcom/google/android/gms/auth/TokenData;->b:Ljava/lang/String;

    .line 208
    .line 209
    return-object p1

    .line 210
    :catch_1
    move-exception p1

    .line 211
    new-instance v0, Ljava/lang/AssertionError;

    .line 212
    .line 213
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    throw v0
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

.method private lambda$getAccessToken$5(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V
    .locals 3

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-interface {p4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    check-cast p4, Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p1, p4}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :catch_0
    move-exception p2

    .line 16
    new-instance p3, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-direct {p3, v0, p2, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p3}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :catch_1
    move-exception p4

    .line 38
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v2, v2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 43
    .line 44
    if-eqz v2, :cond_6

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const-string v0, "user_recoverable_auth"

    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 55
    .line 56
    if-nez p2, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-nez p2, :cond_0

    .line 63
    .line 64
    new-instance p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    .line 65
    .line 66
    const-string p3, "Cannot recover auth because app is not in foreground. "

    .line 67
    .line 68
    invoke-static {p3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-direct {p2, v0, p3, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, p2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_0
    const-string v0, "getTokens"

    .line 91
    .line 92
    invoke-direct {p0, v0, p1, p3}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingAccessTokenOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 100
    .line 101
    iget-object p3, p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a:Landroid/content/Intent;

    .line 102
    .line 103
    if-nez p3, :cond_4

    .line 104
    .line 105
    iget p1, p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;->b:I

    .line 106
    .line 107
    invoke-static {p1}, Lq0/g;->c(I)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const-string p3, "Auth"

    .line 112
    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    const/4 p4, 0x1

    .line 116
    if-eq p1, p4, :cond_2

    .line 117
    .line 118
    const/4 p4, 0x2

    .line 119
    if-eq p1, p4, :cond_1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    const-string p1, "this instantiation of UserRecoverableAuthException doesn\'t support an Intent."

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    const-string p1, "This shouldn\'t happen. Gms API throwing this exception should support the recovery Intent."

    .line 126
    .line 127
    :goto_0
    invoke-static {p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    const-string p1, "Make sure that an intent was provided to class instantiation."

    .line 132
    .line 133
    invoke-static {p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    new-instance v1, Landroid/content/Intent;

    .line 138
    .line 139
    invoke-direct {v1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 140
    .line 141
    .line 142
    :goto_1
    const p1, 0xd02e

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v1, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    new-instance p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    .line 150
    .line 151
    invoke-virtual {p4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-direct {p2, v0, p3, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1, p2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    new-instance p3, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    .line 167
    .line 168
    if-nez p2, :cond_7

    .line 169
    .line 170
    move-object p2, v1

    .line 171
    goto :goto_2

    .line 172
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    :goto_2
    invoke-direct {p3, v0, p2, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p1, p3}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    :goto_3
    return-void
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

.method private synthetic lambda$signOut$0(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithSuccess()V

    goto :goto_0

    :cond_0
    const-string p1, "status"

    const-string v0, "Failed to signout."

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private onSignInAccount(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 2

    .line 1
    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setEmail(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setIdToken(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->o:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setServerAuthCode(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setDisplayName(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->f:Landroid/net/Uri;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setPhotoUrl(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->build()Lio/flutter/plugins/googlesignin/Messages$UserData;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithUserData(Lio/flutter/plugins/googlesignin/Messages$UserData;)V

    .line 52
    .line 53
    .line 54
    return-void
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

.method private onSignInResult(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lk6/b;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInAccount(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    :try_end_0
    .catch Lk6/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "exception"

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lk6/b;->getStatusCode()I

    move-result v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->errorCodeForStatus(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public clearAuthCache(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->clearAuthCache(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public clearAuthCache(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/b;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/b;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    new-instance v1, Le;

    const/16 v2, 0x10

    invoke-direct {v1, p2, v2}, Le;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V

    return-void
.end method

.method public disconnect(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public disconnect(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "disconnect"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:Lg6/a;

    invoke-virtual {p1}, Lg6/a;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/firebase/auth/o;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/flutter/plugins/firebase/auth/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/c;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/c;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    new-instance v2, Lo9/c;

    invoke-direct {v2, p0, p3, p2, p1}, Lo9/c;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V

    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public getTokens(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Z)V
    .locals 1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$2;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$2;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, p3, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public init(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/4 v0, -0x1

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x329ca50a

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const v2, 0x7a8d9bd4

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "SignInOption.standard"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    move v0, v3

    goto :goto_0

    :cond_1
    const-string v1, "SignInOption.games"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    if-ne v0, v3, :cond_3

    sget-object p2, Lio/flutter/plugins/googlesignin/Messages$SignInType;->STANDARD:Lio/flutter/plugins/googlesignin/Messages$SignInType;

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Unknown signInOption"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    sget-object p2, Lio/flutter/plugins/googlesignin/Messages$SignInType;->GAMES:Lio/flutter/plugins/googlesignin/Messages$SignInType;

    :goto_1
    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    invoke-direct {v0}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;-><init>()V

    invoke-virtual {v0, p2}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setSignInType(Lio/flutter/plugins/googlesignin/Messages$SignInType;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p3}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setScopes(Ljava/util/List;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p4}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setHostedDomain(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p5}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setClientId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p6}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setServerClientId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setForceCodeForRefreshToken(Ljava/lang/Boolean;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->build()Lio/flutter/plugins/googlesignin/Messages$InitParams;

    move-result-object p2

    invoke-virtual {p0, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->init(Lio/flutter/plugins/googlesignin/Messages$InitParams;)V

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/flutter/plugins/googlesignin/Messages$FlutterError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    iget-object p3, p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;->code:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    iget-object p2, p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;->details:Ljava/lang/Object;

    invoke-interface {p1, p3, p4, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public init(Lio/flutter/plugins/googlesignin/Messages$InitParams;)V
    .locals 8

    .line 1
    const-string v0, "two different server client ids provided"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$1;->$SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType:[I

    .line 4
    .line 5
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getSignInType()Lio/flutter/plugins/googlesignin/Messages$SignInType;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    aget v1, v1, v2

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    .line 22
    .line 23
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 24
    .line 25
    invoke-direct {v1, v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->a:Ljava/util/HashSet;

    .line 29
    .line 30
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->v:Lcom/google/android/gms/common/api/Scope;

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "Unknown signInOption"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    new-instance v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    .line 45
    .line 46
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->u:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 47
    .line 48
    invoke-direct {v1, v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getServerClientId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getClientId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v4}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    invoke-static {v3}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    const-string v3, "google_sign_in"

    .line 72
    .line 73
    const-string v4, "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning."

    .line 74
    .line 75
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getClientId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :cond_2
    invoke-static {v3}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    iget-object v4, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 89
    .line 90
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const-string v5, "default_web_client_id"

    .line 95
    .line 96
    const-string v6, "string"

    .line 97
    .line 98
    iget-object v7, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v4, v5, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    iget-object v3, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    :cond_3
    invoke-static {v3}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const/4 v5, 0x0

    .line 121
    if-nez v4, :cond_8

    .line 122
    .line 123
    iput-boolean v2, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->d:Z

    .line 124
    .line 125
    invoke-static {v3}, Lm6/j;->e(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v4, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->e:Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v4, :cond_5

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    move v4, v5

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    :goto_1
    move v4, v2

    .line 142
    :goto_2
    invoke-static {v0, v4}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    iput-object v3, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->e:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getForceCodeForRefreshToken()Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    iput-boolean v2, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->b:Z

    .line 156
    .line 157
    invoke-static {v3}, Lm6/j;->e(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v6, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->e:Ljava/lang/String;

    .line 161
    .line 162
    if-eqz v6, :cond_7

    .line 163
    .line 164
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_6

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    move v6, v5

    .line 172
    goto :goto_4

    .line 173
    :cond_7
    :goto_3
    move v6, v2

    .line 174
    :goto_4
    invoke-static {v0, v6}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    iput-object v3, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->e:Ljava/lang/String;

    .line 178
    .line 179
    iput-boolean v4, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->c:Z

    .line 180
    .line 181
    :cond_8
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getScopes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestedScopes:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_9

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Ljava/lang/String;

    .line 202
    .line 203
    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    .line 204
    .line 205
    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-array v3, v5, [Lcom/google/android/gms/common/api/Scope;

    .line 209
    .line 210
    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->b(Lcom/google/android/gms/common/api/Scope;[Lcom/google/android/gms/common/api/Scope;)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_9
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getHostedDomain()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_a

    .line 223
    .line 224
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getHostedDomain()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    iput-object p1, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->g:Ljava/lang/String;

    .line 232
    .line 233
    :cond_a
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    .line 234
    .line 235
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {p1, v0, v1}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->getClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lg6/a;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:Lg6/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    .line 247
    return-void

    .line 248
    :catch_0
    move-exception p1

    .line 249
    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    const/4 v1, 0x0

    .line 256
    const-string v2, "exception"

    .line 257
    .line 258
    invoke-direct {v0, v2, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    throw v0
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

.method public isSignedIn()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lh6/o;->a(Landroid/content/Context;)Lh6/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, v0, Lh6/o;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0

    .line 23
    throw v1
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
.end method

.method public isSignedIn(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->isSignedIn()Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    const/4 v3, -0x1

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :pswitch_0
    if-ne p2, v3, :cond_1

    .line 15
    .line 16
    move v1, v4

    .line 17
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithBoolean(Ljava/lang/Boolean;)V

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :pswitch_1
    if-ne p2, v3, :cond_2

    .line 26
    .line 27
    iget-object p1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->stringResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 33
    .line 34
    iget-object p2, p2, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->data:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast p2, Ljava/lang/String;

    .line 40
    .line 41
    iput-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    .line 42
    .line 43
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p0, p2, p3, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string p1, "failed_to_recover_auth"

    .line 50
    .line 51
    const-string p2, "Failed attempt to recover authentication"

    .line 52
    .line 53
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return v4

    .line 57
    :pswitch_2
    if-eqz p3, :cond_7

    .line 58
    .line 59
    sget-object p1, Lh6/n;->a:Lp6/a;

    .line 60
    .line 61
    const-string p1, "googleSignInStatus"

    .line 62
    .line 63
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 68
    .line 69
    const-string p2, "googleSignInAccount"

    .line 70
    .line 71
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 76
    .line 77
    if-nez p2, :cond_4

    .line 78
    .line 79
    new-instance p2, Lg6/b;

    .line 80
    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    .line 84
    .line 85
    :cond_3
    invoke-direct {p2, v2, p1}, Lg6/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    new-instance p1, Lg6/b;

    .line 90
    .line 91
    sget-object p3, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 92
    .line 93
    invoke-direct {p1, p2, p3}, Lg6/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 94
    .line 95
    .line 96
    move-object p2, p1

    .line 97
    :goto_1
    iget-object p1, p2, Lg6/b;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 98
    .line 99
    iget-object p3, p2, Lg6/b;->a:Lcom/google/android/gms/common/api/Status;

    .line 100
    .line 101
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/Status;->D()Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-eqz p3, :cond_6

    .line 106
    .line 107
    if-nez p1, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    :goto_2
    iget-object p1, p2, Lg6/b;->a:Lcom/google/android/gms/common/api/Status;

    .line 116
    .line 117
    invoke-static {p1}, Lb/a0;->r(Lcom/google/android/gms/common/api/Status;)Lk6/b;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_3
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    const-string p1, "sign_in_failed"

    .line 130
    .line 131
    const-string p2, "Signin failed"

    .line 132
    .line 133
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_4
    return v4

    .line 137
    :pswitch_data_0
    .packed-switch 0xd02d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public requestScopes(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$1;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$1;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestScopes(Ljava/util/List;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public requestScopes(Ljava/util/List;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "requestScopes"

    .line 2
    .line 3
    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingBoolOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    .line 7
    .line 8
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    const-string p1, "sign_in_required"

    .line 17
    .line 18
    const-string p2, "No account to grant scopes."

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    .line 52
    .line 53
    invoke-virtual {v1, p2, v2}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->hasPermissions(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Scope;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithBoolean(Ljava/lang/Boolean;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    .line 76
    .line 77
    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const v2, 0xd02f

    .line 82
    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->requestPermissions(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V

    .line 94
    .line 95
    .line 96
    return-void
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

.method public setActivity(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->activity:Landroid/app/Activity;

    return-void
.end method

.method public signIn(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signIn(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signIn(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "signIn"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:Lg6/a;

    invoke-virtual {p1}, Lg6/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0xd02d

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "signIn needs a foreground activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public signInSilently(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInSilently(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signInSilently(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "signInSilently"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:Lg6/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lk6/d;->asGoogleApiClient()Lk6/e;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0}, Lk6/d;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0}, Lk6/d;->getApiOptions()Lk6/a$d;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 25
    .line 26
    invoke-virtual {v0}, Lg6/a;->c()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v5, 0x1

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x3

    .line 33
    if-ne v0, v7, :cond_0

    .line 34
    .line 35
    move v0, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v0, v6

    .line 38
    :goto_0
    sget-object v7, Lh6/n;->a:Lp6/a;

    .line 39
    .line 40
    const-string v8, "silentSignIn()"

    .line 41
    .line 42
    new-array v9, v6, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v7, v8, v9}, Lp6/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string v8, "getEligibleSavedSignInResult()"

    .line 48
    .line 49
    new-array v9, v6, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v7, v8, v9}, Lp6/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3}, Lh6/o;->a(Landroid/content/Context;)Lh6/o;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    monitor-enter v8

    .line 62
    :try_start_0
    iget-object v9, v8, Lh6/o;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    .line 64
    monitor-exit v8

    .line 65
    const/4 v8, 0x0

    .line 66
    if-nez v9, :cond_1

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_1
    iget-object v10, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 71
    .line 72
    iget-object v11, v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 73
    .line 74
    if-nez v10, :cond_2

    .line 75
    .line 76
    if-nez v11, :cond_9

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {v10, v11}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_3

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    :goto_1
    iget-boolean v10, v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 87
    .line 88
    if-eqz v10, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    iget-boolean v10, v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 92
    .line 93
    if-eqz v10, :cond_6

    .line 94
    .line 95
    iget-boolean v10, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 96
    .line 97
    if-nez v10, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    iget-object v10, v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v11, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v10, v11}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-nez v10, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    new-instance v10, Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-virtual {v9}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->D()Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-direct {v10, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 118
    .line 119
    .line 120
    new-instance v9, Ljava/util/HashSet;

    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->D()Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-direct {v9, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v10, v9}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-nez v9, :cond_7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    invoke-static {v3}, Lh6/o;->a(Landroid/content/Context;)Lh6/o;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    monitor-enter v9

    .line 141
    :try_start_1
    iget-object v10, v9, Lh6/o;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    .line 143
    monitor-exit v9

    .line 144
    if-eqz v10, :cond_9

    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v11

    .line 150
    const-wide/16 v13, 0x3e8

    .line 151
    .line 152
    div-long/2addr v11, v13

    .line 153
    iget-wide v13, v10, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->p:J

    .line 154
    .line 155
    const-wide/16 v15, -0x12c

    .line 156
    .line 157
    add-long/2addr v13, v15

    .line 158
    cmp-long v9, v11, v13

    .line 159
    .line 160
    if-ltz v9, :cond_8

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    move v5, v6

    .line 164
    :goto_2
    if-nez v5, :cond_9

    .line 165
    .line 166
    new-instance v5, Lg6/b;

    .line 167
    .line 168
    sget-object v9, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 169
    .line 170
    invoke-direct {v5, v10, v9}, Lg6/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_9
    :goto_3
    move-object v5, v8

    .line 175
    :goto_4
    if-eqz v5, :cond_a

    .line 176
    .line 177
    new-array v0, v6, [Ljava/lang/Object;

    .line 178
    .line 179
    const-string v3, "Eligible saved sign in result found"

    .line 180
    .line 181
    invoke-virtual {v7, v3, v0}, Lp6/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    new-instance v0, Lk6/p;

    .line 185
    .line 186
    invoke-direct {v0, v2}, Lk6/p;-><init>(Lk6/e;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v5}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lk6/j;)V

    .line 190
    .line 191
    .line 192
    new-instance v2, Ll6/k;

    .line 193
    .line 194
    invoke-direct {v2, v0}, Ll6/k;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_a
    if-eqz v0, :cond_b

    .line 199
    .line 200
    new-instance v0, Lg6/b;

    .line 201
    .line 202
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    .line 203
    .line 204
    const/4 v4, 0x4

    .line 205
    invoke-direct {v3, v4, v8, v8, v8}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lj6/b;)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v0, v8, v3}, Lg6/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 209
    .line 210
    .line 211
    new-instance v3, Lk6/p;

    .line 212
    .line 213
    invoke-direct {v3, v2}, Lk6/p;-><init>(Lk6/e;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lk6/j;)V

    .line 217
    .line 218
    .line 219
    new-instance v2, Ll6/k;

    .line 220
    .line 221
    invoke-direct {v2, v3}, Ll6/k;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_b
    new-array v0, v6, [Ljava/lang/Object;

    .line 226
    .line 227
    const-string v5, "trySilentSignIn()"

    .line 228
    .line 229
    invoke-virtual {v7, v5, v0}, Lp6/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v0, Lh6/h;

    .line 233
    .line 234
    invoke-direct {v0, v2, v3, v4}, Lh6/h;-><init>(Lk6/e;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v0}, Lk6/e;->a(Lh6/h;)Lcom/google/android/gms/common/api/internal/a;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    new-instance v2, Ll6/k;

    .line 242
    .line 243
    invoke-direct {v2, v0}, Ll6/k;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    sget-object v0, Lg6/a;->a:Lp2/m0;

    .line 247
    .line 248
    new-instance v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 249
    .line 250
    invoke-direct {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 251
    .line 252
    .line 253
    new-instance v4, Lm6/w;

    .line 254
    .line 255
    invoke-direct {v4, v2, v3, v0}, Lm6/w;-><init>(Lk6/g;Lcom/google/android/gms/tasks/TaskCompletionSource;Lm6/i;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4}, Ll6/k;->addStatusListener(Lk6/g$a;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_c

    .line 270
    .line 271
    invoke-direct {v1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_c
    new-instance v2, Laa/m0;

    .line 276
    .line 277
    const/4 v3, 0x2

    .line 278
    invoke-direct {v2, v1, v3}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 282
    .line 283
    .line 284
    :goto_6
    return-void

    .line 285
    :catchall_0
    move-exception v0

    .line 286
    move-object v2, v0

    .line 287
    monitor-exit v9

    .line 288
    throw v2

    .line 289
    :catchall_1
    move-exception v0

    .line 290
    move-object v2, v0

    .line 291
    monitor-exit v8

    .line 292
    throw v2
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

.method public signOut(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "signOut"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:Lg6/a;

    invoke-virtual {p1}, Lg6/a;->signOut()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Le;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Le;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
