.class public final Le7/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/c3;


# static fields
.field public static volatile R:Le7/j2;


# instance fields
.field public final A:Ljava/lang/String;

.field public B:Le7/w0;

.field public C:Le7/w4;

.field public D:Le7/z;

.field public E:Le7/t0;

.field public F:Le7/o4;

.field public G:Z

.field public H:Ljava/lang/Boolean;

.field public I:J

.field public volatile J:Ljava/lang/Boolean;

.field public K:Ljava/lang/Boolean;

.field public L:Ljava/lang/Boolean;

.field public volatile M:Z

.field public N:I

.field public O:I

.field public P:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final Q:J

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lnc/g0;

.field public final o:Le7/h;

.field public final p:Le7/l1;

.field public final q:Le7/a1;

.field public final r:Le7/e2;

.field public final s:Le7/q5;

.field public final t:Le7/r6;

.field public final u:Le7/x0;

.field public final v:Lb/z;

.field public final w:Le7/s4;

.field public final x:Le7/k3;

.field public final y:Le7/a;

.field public final z:Le7/l4;


# direct methods
.method public constructor <init>(Le7/i3;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Le7/j2;->G:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Le7/j2;->P:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, Le7/i3;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, Lnc/g0;

    .line 17
    .line 18
    invoke-direct {v2}, Lnc/g0;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Le7/j2;->f:Lnc/g0;

    .line 22
    .line 23
    sput-object v2, Lx6/b;->c:Lnc/g0;

    .line 24
    .line 25
    iput-object v1, p0, Le7/j2;->a:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v2, p1, Le7/i3;->b:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v2, p0, Le7/j2;->b:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p1, Le7/i3;->c:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v2, p0, Le7/j2;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p1, Le7/i3;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v2, p0, Le7/j2;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-boolean v2, p1, Le7/i3;->h:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Le7/j2;->e:Z

    .line 42
    .line 43
    iget-object v2, p1, Le7/i3;->e:Ljava/lang/Boolean;

    .line 44
    .line 45
    iput-object v2, p0, Le7/j2;->J:Ljava/lang/Boolean;

    .line 46
    .line 47
    iget-object v2, p1, Le7/i3;->j:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v2, p0, Le7/j2;->A:Ljava/lang/String;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    iput-boolean v2, p0, Le7/j2;->M:Z

    .line 53
    .line 54
    iget-object v3, p1, Le7/i3;->g:Lcom/google/android/gms/internal/measurement/zzdz;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    const-string v5, "measurementEnabled"

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 69
    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    check-cast v4, Ljava/lang/Boolean;

    .line 73
    .line 74
    iput-object v4, p0, Le7/j2;->K:Ljava/lang/Boolean;

    .line 75
    .line 76
    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    .line 77
    .line 78
    const-string v4, "measurementDeactivated"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 85
    .line 86
    if-eqz v4, :cond_1

    .line 87
    .line 88
    check-cast v3, Ljava/lang/Boolean;

    .line 89
    .line 90
    iput-object v3, p0, Le7/j2;->L:Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzhx;->zzb(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    sget-object v3, Lb/z;->p:Lb/z;

    .line 96
    .line 97
    iput-object v3, p0, Le7/j2;->v:Lb/z;

    .line 98
    .line 99
    iget-object v3, p1, Le7/i3;->i:Ljava/lang/Long;

    .line 100
    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    goto :goto_0

    .line 108
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    :goto_0
    iput-wide v3, p0, Le7/j2;->Q:J

    .line 113
    .line 114
    new-instance v3, Le7/h;

    .line 115
    .line 116
    invoke-direct {v3, p0}, Le7/h;-><init>(Le7/j2;)V

    .line 117
    .line 118
    .line 119
    iput-object v3, p0, Le7/j2;->o:Le7/h;

    .line 120
    .line 121
    new-instance v3, Le7/l1;

    .line 122
    .line 123
    invoke-direct {v3, p0}, Le7/l1;-><init>(Le7/j2;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Le7/d3;->n()V

    .line 127
    .line 128
    .line 129
    iput-object v3, p0, Le7/j2;->p:Le7/l1;

    .line 130
    .line 131
    new-instance v3, Le7/a1;

    .line 132
    .line 133
    invoke-direct {v3, p0}, Le7/a1;-><init>(Le7/j2;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Le7/d3;->n()V

    .line 137
    .line 138
    .line 139
    iput-object v3, p0, Le7/j2;->q:Le7/a1;

    .line 140
    .line 141
    new-instance v3, Le7/r6;

    .line 142
    .line 143
    invoke-direct {v3, p0}, Le7/r6;-><init>(Le7/j2;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Le7/d3;->n()V

    .line 147
    .line 148
    .line 149
    iput-object v3, p0, Le7/j2;->t:Le7/r6;

    .line 150
    .line 151
    new-instance v3, Lb1/v;

    .line 152
    .line 153
    invoke-direct {v3, p0, v0}, Lb1/v;-><init>(Ljava/lang/Object;I)V

    .line 154
    .line 155
    .line 156
    new-instance v4, Le7/x0;

    .line 157
    .line 158
    invoke-direct {v4, v3}, Le7/x0;-><init>(Lb1/v;)V

    .line 159
    .line 160
    .line 161
    iput-object v4, p0, Le7/j2;->u:Le7/x0;

    .line 162
    .line 163
    new-instance v3, Le7/a;

    .line 164
    .line 165
    invoke-direct {v3, p0}, Le7/a;-><init>(Le7/j2;)V

    .line 166
    .line 167
    .line 168
    iput-object v3, p0, Le7/j2;->y:Le7/a;

    .line 169
    .line 170
    new-instance v3, Le7/s4;

    .line 171
    .line 172
    invoke-direct {v3, p0}, Le7/s4;-><init>(Le7/j2;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Le7/j0;->u()V

    .line 176
    .line 177
    .line 178
    iput-object v3, p0, Le7/j2;->w:Le7/s4;

    .line 179
    .line 180
    new-instance v3, Le7/k3;

    .line 181
    .line 182
    invoke-direct {v3, p0}, Le7/k3;-><init>(Le7/j2;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Le7/j0;->u()V

    .line 186
    .line 187
    .line 188
    iput-object v3, p0, Le7/j2;->x:Le7/k3;

    .line 189
    .line 190
    new-instance v3, Le7/q5;

    .line 191
    .line 192
    invoke-direct {v3, p0}, Le7/q5;-><init>(Le7/j2;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Le7/j0;->u()V

    .line 196
    .line 197
    .line 198
    iput-object v3, p0, Le7/j2;->s:Le7/q5;

    .line 199
    .line 200
    new-instance v3, Le7/l4;

    .line 201
    .line 202
    invoke-direct {v3, p0}, Le7/l4;-><init>(Le7/j2;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Le7/d3;->n()V

    .line 206
    .line 207
    .line 208
    iput-object v3, p0, Le7/j2;->z:Le7/l4;

    .line 209
    .line 210
    new-instance v3, Le7/e2;

    .line 211
    .line 212
    invoke-direct {v3, p0}, Le7/e2;-><init>(Le7/j2;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Le7/d3;->n()V

    .line 216
    .line 217
    .line 218
    iput-object v3, p0, Le7/j2;->r:Le7/e2;

    .line 219
    .line 220
    iget-object v4, p1, Le7/i3;->g:Lcom/google/android/gms/internal/measurement/zzdz;

    .line 221
    .line 222
    if-eqz v4, :cond_3

    .line 223
    .line 224
    iget-wide v4, v4, Lcom/google/android/gms/internal/measurement/zzdz;->zzb:J

    .line 225
    .line 226
    const-wide/16 v6, 0x0

    .line 227
    .line 228
    cmp-long v4, v4, v6

    .line 229
    .line 230
    if-eqz v4, :cond_3

    .line 231
    .line 232
    move v0, v2

    .line 233
    :cond_3
    xor-int/2addr v0, v2

    .line 234
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    instance-of v1, v1, Landroid/app/Application;

    .line 239
    .line 240
    if-eqz v1, :cond_5

    .line 241
    .line 242
    invoke-virtual {p0}, Le7/j2;->k()Le7/k3;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    instance-of v4, v4, Landroid/app/Application;

    .line 255
    .line 256
    if-eqz v4, :cond_6

    .line 257
    .line 258
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    check-cast v4, Landroid/app/Application;

    .line 267
    .line 268
    iget-object v5, v1, Le7/k3;->d:Le7/i4;

    .line 269
    .line 270
    if-nez v5, :cond_4

    .line 271
    .line 272
    new-instance v5, Le7/i4;

    .line 273
    .line 274
    invoke-direct {v5, v1}, Le7/i4;-><init>(Le7/k3;)V

    .line 275
    .line 276
    .line 277
    iput-object v5, v1, Le7/k3;->d:Le7/i4;

    .line 278
    .line 279
    :cond_4
    if-eqz v0, :cond_6

    .line 280
    .line 281
    iget-object v0, v1, Le7/k3;->d:Le7/i4;

    .line 282
    .line 283
    invoke-virtual {v4, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 284
    .line 285
    .line 286
    iget-object v0, v1, Le7/k3;->d:Le7/i4;

    .line 287
    .line 288
    invoke-virtual {v4, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 296
    .line 297
    const-string v1, "Registered activity lifecycle callback"

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto :goto_1

    .line 303
    :cond_5
    invoke-virtual {p0}, Le7/j2;->zzj()Le7/a1;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 308
    .line 309
    const-string v1, "Application context is not an Application"

    .line 310
    .line 311
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :cond_6
    :goto_1
    new-instance v0, Ll6/q0;

    .line 315
    .line 316
    invoke-direct {v0, v2, p0, p1}, Ll6/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v0}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 320
    .line 321
    .line 322
    return-void
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

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/Long;)Le7/j2;
    .locals 12

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zze:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzf:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdz;

    .line 12
    .line 13
    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zza:J

    .line 14
    .line 15
    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzb:J

    .line 16
    .line 17
    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzc:Z

    .line 18
    .line 19
    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzd:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    move-object v1, v0

    .line 27
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :cond_1
    invoke-static {p0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Le7/j2;->R:Le7/j2;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    const-class v0, Le7/j2;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_0
    sget-object v1, Le7/j2;->R:Le7/j2;

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    new-instance v1, Le7/i3;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, p2}, Le7/i3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/Long;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, Le7/j2;

    .line 58
    .line 59
    invoke-direct {p0, v1}, Le7/j2;-><init>(Le7/i3;)V

    .line 60
    .line 61
    .line 62
    sput-object p0, Le7/j2;->R:Le7/j2;

    .line 63
    .line 64
    :cond_2
    monitor-exit v0

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_3
    if-eqz p1, :cond_4

    .line 70
    .line 71
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    .line 72
    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    const-string p2, "dataCollectionDefaultEnabled"

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    sget-object p0, Le7/j2;->R:Le7/j2;

    .line 84
    .line 85
    invoke-static {p0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Le7/j2;->R:Le7/j2;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    .line 91
    .line 92
    const-string p2, "dataCollectionDefaultEnabled"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Le7/j2;->J:Ljava/lang/Boolean;

    .line 103
    .line 104
    :cond_4
    :goto_0
    sget-object p0, Le7/j2;->R:Le7/j2;

    .line 105
    .line 106
    invoke-static {p0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Le7/j2;->R:Le7/j2;

    .line 110
    .line 111
    return-object p0
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

.method public static b(Le7/j0;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Le7/j0;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-static {v1, p0}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
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

.method public static c(Le7/d3;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Le7/d3;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-static {v1, p0}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
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


# virtual methods
.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Le7/j2;->f()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Le7/j2;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p0}, Le7/j2;->zzl()Le7/e2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le7/j2;->H:Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-wide v1, p0, Le7/j2;->I:J

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_5

    .line 29
    .line 30
    iget-object v0, p0, Le7/j2;->v:Lb/z;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-wide v2, p0, Le7/j2;->I:J

    .line 40
    .line 41
    sub-long/2addr v0, v2

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    const-wide/16 v2, 0x3e8

    .line 47
    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-lez v0, :cond_5

    .line 51
    .line 52
    :cond_0
    iget-object v0, p0, Le7/j2;->v:Lb/z;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    iput-wide v0, p0, Le7/j2;->I:J

    .line 62
    .line 63
    invoke-virtual {p0}, Le7/j2;->m()Le7/r6;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "android.permission.INTERNET"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Le7/r6;->q0(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x1

    .line 74
    const/4 v2, 0x0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Le7/j2;->m()Le7/r6;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Le7/r6;->q0(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    iget-object v0, p0, Le7/j2;->a:Landroid/content/Context;

    .line 90
    .line 91
    invoke-static {v0}, Lx6/d;->a(Landroid/content/Context;)Lx6/c;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Lx6/c;->c()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, Le7/j2;->o:Le7/h;

    .line 102
    .line 103
    invoke-virtual {v0}, Le7/h;->C()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_1

    .line 108
    .line 109
    iget-object v0, p0, Le7/j2;->a:Landroid/content/Context;

    .line 110
    .line 111
    invoke-static {v0}, Le7/r6;->R(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    iget-object v0, p0, Le7/j2;->a:Landroid/content/Context;

    .line 118
    .line 119
    invoke-static {v0}, Le7/r6;->c0(Landroid/content/Context;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    :cond_1
    move v0, v1

    .line 126
    goto :goto_0

    .line 127
    :cond_2
    move v0, v2

    .line 128
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Le7/j2;->H:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {p0}, Le7/j2;->m()Le7/r6;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {p0}, Le7/j2;->h()Le7/t0;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Le7/t0;->w()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {p0}, Le7/j2;->h()Le7/t0;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Le7/j0;->t()V

    .line 157
    .line 158
    .line 159
    iget-object v4, v4, Le7/t0;->w:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v3, v4}, Le7/r6;->V(Ljava/lang/String;Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_4

    .line 166
    .line 167
    invoke-virtual {p0}, Le7/j2;->h()Le7/t0;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 172
    .line 173
    .line 174
    iget-object v0, v0, Le7/t0;->w:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_3

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    move v1, v2

    .line 184
    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Le7/j2;->H:Ljava/lang/Boolean;

    .line 189
    .line 190
    :cond_5
    iget-object v0, p0, Le7/j2;->H:Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    return v0

    .line 197
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    const-string v1, "AppMeasurement is not initialized"

    .line 200
    .line 201
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v0
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

.method public final f()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Le7/j2;->zzl()Le7/e2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Le7/j2;->o:Le7/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Le7/h;->B()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    iget-object v0, p0, Le7/j2;->L:Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    return v0

    .line 30
    :cond_1
    invoke-virtual {p0}, Le7/j2;->zzl()Le7/e2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, p0, Le7/j2;->M:Z

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    const/16 v0, 0x8

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    invoke-virtual {p0}, Le7/j2;->j()Le7/l1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Le7/l1;->z()Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    return v1

    .line 62
    :cond_3
    const/4 v0, 0x3

    .line 63
    return v0

    .line 64
    :cond_4
    iget-object v0, p0, Le7/j2;->o:Le7/h;

    .line 65
    .line 66
    const-string v2, "firebase_analytics_collection_enabled"

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Le7/h;->v(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    return v1

    .line 81
    :cond_5
    const/4 v0, 0x4

    .line 82
    return v0

    .line 83
    :cond_6
    iget-object v0, p0, Le7/j2;->K:Ljava/lang/Boolean;

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    return v1

    .line 94
    :cond_7
    const/4 v0, 0x5

    .line 95
    return v0

    .line 96
    :cond_8
    iget-object v0, p0, Le7/j2;->J:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-eqz v0, :cond_a

    .line 99
    .line 100
    iget-object v0, p0, Le7/j2;->J:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_9

    .line 107
    .line 108
    return v1

    .line 109
    :cond_9
    const/4 v0, 0x7

    .line 110
    return v0

    .line 111
    :cond_a
    return v1
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
.end method

.method public final g()Le7/z;
    .locals 1

    iget-object v0, p0, Le7/j2;->D:Le7/z;

    invoke-static {v0}, Le7/j2;->c(Le7/d3;)V

    iget-object v0, p0, Le7/j2;->D:Le7/z;

    return-object v0
.end method

.method public final h()Le7/t0;
    .locals 1

    iget-object v0, p0, Le7/j2;->E:Le7/t0;

    invoke-static {v0}, Le7/j2;->b(Le7/j0;)V

    iget-object v0, p0, Le7/j2;->E:Le7/t0;

    return-object v0
.end method

.method public final i()Le7/x0;
    .locals 1

    iget-object v0, p0, Le7/j2;->u:Le7/x0;

    return-object v0
.end method

.method public final j()Le7/l1;
    .locals 2

    iget-object v0, p0, Le7/j2;->p:Le7/l1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Le7/k3;
    .locals 1

    iget-object v0, p0, Le7/j2;->x:Le7/k3;

    invoke-static {v0}, Le7/j2;->b(Le7/j0;)V

    iget-object v0, p0, Le7/j2;->x:Le7/k3;

    return-object v0
.end method

.method public final l()Le7/w4;
    .locals 1

    iget-object v0, p0, Le7/j2;->C:Le7/w4;

    invoke-static {v0}, Le7/j2;->b(Le7/j0;)V

    iget-object v0, p0, Le7/j2;->C:Le7/w4;

    return-object v0
.end method

.method public final m()Le7/r6;
    .locals 2

    iget-object v0, p0, Le7/j2;->t:Le7/r6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le7/j2;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final zzb()Lv6/b;
    .locals 1

    iget-object v0, p0, Le7/j2;->v:Lb/z;

    return-object v0
.end method

.method public final zzd()Lnc/g0;
    .locals 1

    iget-object v0, p0, Le7/j2;->f:Lnc/g0;

    return-object v0
.end method

.method public final zzj()Le7/a1;
    .locals 1

    iget-object v0, p0, Le7/j2;->q:Le7/a1;

    invoke-static {v0}, Le7/j2;->c(Le7/d3;)V

    iget-object v0, p0, Le7/j2;->q:Le7/a1;

    return-object v0
.end method

.method public final zzl()Le7/e2;
    .locals 1

    iget-object v0, p0, Le7/j2;->r:Le7/e2;

    invoke-static {v0}, Le7/j2;->c(Le7/d3;)V

    iget-object v0, p0, Le7/j2;->r:Le7/e2;

    return-object v0
.end method
