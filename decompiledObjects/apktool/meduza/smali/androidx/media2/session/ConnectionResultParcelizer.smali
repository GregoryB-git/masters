.class public final Landroidx/media2/session/ConnectionResultParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/ConnectionResult;
    .locals 4

    .line 1
    new-instance v0, Landroidx/media2/session/ConnectionResult;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/session/ConnectionResult;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->a:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->a:I

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lb2/c;->v()Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 30
    .line 31
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->m:I

    .line 32
    .line 33
    const/16 v2, 0xa

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->m:I

    .line 40
    .line 41
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->n:I

    .line 42
    .line 43
    const/16 v2, 0xb

    .line 44
    .line 45
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->n:I

    .line 50
    .line 51
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->o:Landroidx/media2/common/ParcelImplListSlice;

    .line 52
    .line 53
    const/16 v2, 0xc

    .line 54
    .line 55
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroidx/media2/common/ParcelImplListSlice;

    .line 60
    .line 61
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->o:Landroidx/media2/common/ParcelImplListSlice;

    .line 62
    .line 63
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->p:Landroidx/media2/session/SessionCommandGroup;

    .line 64
    .line 65
    const/16 v2, 0xd

    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroidx/media2/session/SessionCommandGroup;

    .line 72
    .line 73
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->p:Landroidx/media2/session/SessionCommandGroup;

    .line 74
    .line 75
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->q:I

    .line 76
    .line 77
    const/16 v2, 0xe

    .line 78
    .line 79
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->q:I

    .line 84
    .line 85
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->r:I

    .line 86
    .line 87
    const/16 v2, 0xf

    .line 88
    .line 89
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->r:I

    .line 94
    .line 95
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->s:I

    .line 96
    .line 97
    const/16 v2, 0x10

    .line 98
    .line 99
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->s:I

    .line 104
    .line 105
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->t:Landroid/os/Bundle;

    .line 106
    .line 107
    const/16 v2, 0x11

    .line 108
    .line 109
    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->t:Landroid/os/Bundle;

    .line 114
    .line 115
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->u:Landroidx/media2/common/VideoSize;

    .line 116
    .line 117
    const/16 v2, 0x12

    .line 118
    .line 119
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Landroidx/media2/common/VideoSize;

    .line 124
    .line 125
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->u:Landroidx/media2/common/VideoSize;

    .line 126
    .line 127
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->v:Ljava/util/List;

    .line 128
    .line 129
    const/16 v2, 0x13

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v1}, Lb2/c;->k(Ljava/util/Collection;)Ljava/util/Collection;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/util/List;

    .line 148
    .line 149
    :goto_1
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->v:Ljava/util/List;

    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->d:Landroid/app/PendingIntent;

    .line 152
    .line 153
    const/4 v2, 0x2

    .line 154
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Landroid/app/PendingIntent;

    .line 159
    .line 160
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->d:Landroid/app/PendingIntent;

    .line 161
    .line 162
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->w:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 163
    .line 164
    const/16 v2, 0x14

    .line 165
    .line 166
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 171
    .line 172
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->w:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 173
    .line 174
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->x:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 175
    .line 176
    const/16 v2, 0x15

    .line 177
    .line 178
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 183
    .line 184
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->x:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 185
    .line 186
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->y:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 187
    .line 188
    const/16 v2, 0x17

    .line 189
    .line 190
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 195
    .line 196
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->y:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 197
    .line 198
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->z:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 199
    .line 200
    const/16 v2, 0x18

    .line 201
    .line 202
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 207
    .line 208
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->z:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 209
    .line 210
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->A:Landroidx/media2/common/MediaMetadata;

    .line 211
    .line 212
    const/16 v2, 0x19

    .line 213
    .line 214
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Landroidx/media2/common/MediaMetadata;

    .line 219
    .line 220
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->A:Landroidx/media2/common/MediaMetadata;

    .line 221
    .line 222
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->B:I

    .line 223
    .line 224
    const/16 v2, 0x1a

    .line 225
    .line 226
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->B:I

    .line 231
    .line 232
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->e:I

    .line 233
    .line 234
    const/4 v2, 0x3

    .line 235
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->e:I

    .line 240
    .line 241
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->g:Landroidx/media2/common/MediaItem;

    .line 242
    .line 243
    const/4 v2, 0x4

    .line 244
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, Landroidx/media2/common/MediaItem;

    .line 249
    .line 250
    iput-object v1, v0, Landroidx/media2/session/ConnectionResult;->g:Landroidx/media2/common/MediaItem;

    .line 251
    .line 252
    iget-wide v1, v0, Landroidx/media2/session/ConnectionResult;->h:J

    .line 253
    .line 254
    const/4 v3, 0x5

    .line 255
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    iput-wide v1, v0, Landroidx/media2/session/ConnectionResult;->h:J

    .line 260
    .line 261
    iget-wide v1, v0, Landroidx/media2/session/ConnectionResult;->i:J

    .line 262
    .line 263
    const/4 v3, 0x6

    .line 264
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    iput-wide v1, v0, Landroidx/media2/session/ConnectionResult;->i:J

    .line 269
    .line 270
    iget v1, v0, Landroidx/media2/session/ConnectionResult;->j:F

    .line 271
    .line 272
    const/4 v2, 0x7

    .line 273
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-nez v2, :cond_2

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_2
    invoke-virtual {p0}, Lb2/c;->m()F

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    :goto_2
    iput v1, v0, Landroidx/media2/session/ConnectionResult;->j:F

    .line 285
    .line 286
    iget-wide v1, v0, Landroidx/media2/session/ConnectionResult;->k:J

    .line 287
    .line 288
    const/16 v3, 0x8

    .line 289
    .line 290
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    iput-wide v1, v0, Landroidx/media2/session/ConnectionResult;->k:J

    .line 295
    .line 296
    iget-object v1, v0, Landroidx/media2/session/ConnectionResult;->l:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 297
    .line 298
    const/16 v2, 0x9

    .line 299
    .line 300
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    check-cast p0, Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 305
    .line 306
    iput-object p0, v0, Landroidx/media2/session/ConnectionResult;->l:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 307
    .line 308
    iget-object p0, v0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 309
    .line 310
    invoke-static {p0}, Landroidx/media2/session/IMediaSession$Stub;->asInterface(Landroid/os/IBinder;)Landroidx/media2/session/IMediaSession;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    iput-object p0, v0, Landroidx/media2/session/ConnectionResult;->b:Landroidx/media2/session/IMediaSession;

    .line 315
    .line 316
    iget-object p0, v0, Landroidx/media2/session/ConnectionResult;->g:Landroidx/media2/common/MediaItem;

    .line 317
    .line 318
    iput-object p0, v0, Landroidx/media2/session/ConnectionResult;->f:Landroidx/media2/common/MediaItem;

    .line 319
    .line 320
    return-object v0
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

.method public static write(Landroidx/media2/session/ConnectionResult;Lb2/c;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->b:Landroidx/media2/session/IMediaSession;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media2/session/ConnectionResult;->b:Landroidx/media2/session/IMediaSession;

    .line 12
    .line 13
    check-cast v1, Landroid/os/IBinder;

    .line 14
    .line 15
    iput-object v1, p0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media2/session/ConnectionResult;->f:Landroidx/media2/common/MediaItem;

    .line 18
    .line 19
    invoke-static {v1}, Landroidx/media2/session/a;->a(Landroidx/media2/common/MediaItem;)Landroidx/media2/common/MediaItem;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Landroidx/media2/session/ConnectionResult;->g:Landroidx/media2/common/MediaItem;

    .line 24
    .line 25
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->a:I

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->c:Landroid/os/IBinder;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {p1, v1}, Lb2/c;->y(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lb2/c;->P(Landroid/os/IBinder;)V

    .line 39
    .line 40
    .line 41
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->m:I

    .line 42
    .line 43
    const/16 v1, 0xa

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 46
    .line 47
    .line 48
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->n:I

    .line 49
    .line 50
    const/16 v1, 0xb

    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->o:Landroidx/media2/common/ParcelImplListSlice;

    .line 56
    .line 57
    const/16 v1, 0xc

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->p:Landroidx/media2/session/SessionCommandGroup;

    .line 63
    .line 64
    const/16 v1, 0xd

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 67
    .line 68
    .line 69
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->q:I

    .line 70
    .line 71
    const/16 v1, 0xe

    .line 72
    .line 73
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 74
    .line 75
    .line 76
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->r:I

    .line 77
    .line 78
    const/16 v1, 0xf

    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 81
    .line 82
    .line 83
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->s:I

    .line 84
    .line 85
    const/16 v1, 0x10

    .line 86
    .line 87
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->t:Landroid/os/Bundle;

    .line 91
    .line 92
    const/16 v1, 0x11

    .line 93
    .line 94
    invoke-virtual {p1, v1, v0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->u:Landroidx/media2/common/VideoSize;

    .line 98
    .line 99
    const/16 v1, 0x12

    .line 100
    .line 101
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->v:Ljava/util/List;

    .line 105
    .line 106
    const/16 v1, 0x13

    .line 107
    .line 108
    invoke-virtual {p1, v1, v0}, Lb2/c;->F(ILjava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->d:Landroid/app/PendingIntent;

    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    invoke-virtual {p1, v0, v1}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->w:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 118
    .line 119
    const/16 v1, 0x14

    .line 120
    .line 121
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->x:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 125
    .line 126
    const/16 v1, 0x15

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->y:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 132
    .line 133
    const/16 v1, 0x17

    .line 134
    .line 135
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->z:Landroidx/media2/common/SessionPlayer$TrackInfo;

    .line 139
    .line 140
    const/16 v1, 0x18

    .line 141
    .line 142
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->A:Landroidx/media2/common/MediaMetadata;

    .line 146
    .line 147
    const/16 v1, 0x19

    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 150
    .line 151
    .line 152
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->B:I

    .line 153
    .line 154
    const/16 v1, 0x1a

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 157
    .line 158
    .line 159
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->e:I

    .line 160
    .line 161
    const/4 v1, 0x3

    .line 162
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Landroidx/media2/session/ConnectionResult;->g:Landroidx/media2/common/MediaItem;

    .line 166
    .line 167
    const/4 v1, 0x4

    .line 168
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 169
    .line 170
    .line 171
    iget-wide v0, p0, Landroidx/media2/session/ConnectionResult;->h:J

    .line 172
    .line 173
    const/4 v2, 0x5

    .line 174
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 175
    .line 176
    .line 177
    iget-wide v0, p0, Landroidx/media2/session/ConnectionResult;->i:J

    .line 178
    .line 179
    const/4 v2, 0x6

    .line 180
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 181
    .line 182
    .line 183
    iget v0, p0, Landroidx/media2/session/ConnectionResult;->j:F

    .line 184
    .line 185
    const/4 v1, 0x7

    .line 186
    invoke-virtual {p1, v1}, Lb2/c;->y(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v0}, Lb2/c;->G(F)V

    .line 190
    .line 191
    .line 192
    iget-wide v0, p0, Landroidx/media2/session/ConnectionResult;->k:J

    .line 193
    .line 194
    const/16 v2, 0x8

    .line 195
    .line 196
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 197
    .line 198
    .line 199
    iget-object p0, p0, Landroidx/media2/session/ConnectionResult;->l:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 200
    .line 201
    const/16 v0, 0x9

    .line 202
    .line 203
    invoke-virtual {p1, p0, v0}, Lb2/c;->R(Lb2/e;I)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :catchall_0
    move-exception p0

    .line 208
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    throw p0
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
