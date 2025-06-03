.class public final Lt5/h0;
.super Lt5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/h0$a;
    }
.end annotation


# instance fields
.field public final e:Landroid/content/res/Resources;

.field public final f:Ljava/lang/String;

.field public g:Landroid/net/Uri;

.field public h:Landroid/content/res/AssetFileDescriptor;

.field public i:Ljava/io/FileInputStream;

.field public j:J

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt5/f;-><init>(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lt5/h0;->e:Landroid/content/res/Resources;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lt5/h0;->f:Ljava/lang/String;

    return-void
.end method

.method public static buildRawResourceUri(I)Landroid/net/Uri;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rawresource:///"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 14

    .line 1
    iget-object v0, p1, Lt5/n;->a:Landroid/net/Uri;

    .line 2
    .line 3
    iput-object v0, p0, Lt5/h0;->g:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "rawresource"

    .line 10
    .line 11
    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    const/16 v4, 0x7d5

    .line 18
    .line 19
    const/16 v5, 0x3ec

    .line 20
    .line 21
    if-nez v1, :cond_5

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v6, "android.resource"

    .line 28
    .line 29
    invoke-static {v6, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string v7, "\\d+"

    .line 53
    .line 54
    invoke-virtual {v1, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v6, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const-string v5, "/"

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    new-instance v6, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_2

    .line 104
    .line 105
    const-string v5, ""

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    const-string v7, ":"

    .line 109
    .line 110
    invoke-static {v5, v7}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :goto_0
    invoke-static {v6, v5, v1}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v5, p0, Lt5/h0;->e:Landroid/content/res/Resources;

    .line 119
    .line 120
    iget-object v6, p0, Lt5/h0;->f:Ljava/lang/String;

    .line 121
    .line 122
    const-string v7, "raw"

    .line 123
    .line 124
    invoke-virtual {v5, v1, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_3
    new-instance p1, Lt5/h0$a;

    .line 132
    .line 133
    const-string v0, "Resource not found."

    .line 134
    .line 135
    invoke-direct {p1, v4, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_4
    new-instance p1, Lt5/h0$a;

    .line 140
    .line 141
    const-string v0, "URI must either use scheme rawresource or android.resource"

    .line 142
    .line 143
    invoke-direct {p1, v5, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_5
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3

    .line 158
    :goto_2
    invoke-virtual {p0, p1}, Lt5/f;->q(Lt5/n;)V

    .line 159
    .line 160
    .line 161
    :try_start_1
    iget-object v5, p0, Lt5/h0;->e:Landroid/content/res/Resources;

    .line 162
    .line 163
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    .line 164
    .line 165
    .line 166
    move-result-object v1
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 167
    iput-object v1, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    .line 168
    .line 169
    if-eqz v1, :cond_10

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    new-instance v0, Ljava/io/FileInputStream;

    .line 176
    .line 177
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-direct {v0, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 182
    .line 183
    .line 184
    iput-object v0, p0, Lt5/h0;->i:Ljava/io/FileInputStream;

    .line 185
    .line 186
    const-wide/16 v6, -0x1

    .line 187
    .line 188
    cmp-long v8, v4, v6

    .line 189
    .line 190
    const/16 v9, 0x7d8

    .line 191
    .line 192
    if-eqz v8, :cond_7

    .line 193
    .line 194
    :try_start_2
    iget-wide v10, p1, Lt5/n;->f:J

    .line 195
    .line 196
    cmp-long v10, v10, v4

    .line 197
    .line 198
    if-gtz v10, :cond_6

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    new-instance p1, Lt5/h0$a;

    .line 202
    .line 203
    invoke-direct {p1, v9, v3, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 204
    .line 205
    .line 206
    throw p1

    .line 207
    :cond_7
    :goto_3
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 208
    .line 209
    .line 210
    move-result-wide v10

    .line 211
    iget-wide v12, p1, Lt5/n;->f:J

    .line 212
    .line 213
    add-long/2addr v12, v10

    .line 214
    invoke-virtual {v0, v12, v13}, Ljava/io/FileInputStream;->skip(J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v12

    .line 218
    sub-long/2addr v12, v10

    .line 219
    iget-wide v10, p1, Lt5/n;->f:J

    .line 220
    .line 221
    cmp-long v1, v12, v10

    .line 222
    .line 223
    if-nez v1, :cond_f

    .line 224
    .line 225
    const-wide/16 v10, 0x0

    .line 226
    .line 227
    if-nez v8, :cond_a

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    cmp-long v1, v4, v10

    .line 238
    .line 239
    if-nez v1, :cond_8

    .line 240
    .line 241
    iput-wide v6, p0, Lt5/h0;->j:J

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_8
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 245
    .line 246
    .line 247
    move-result-wide v4

    .line 248
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->position()J

    .line 249
    .line 250
    .line 251
    move-result-wide v0

    .line 252
    sub-long/2addr v4, v0

    .line 253
    iput-wide v4, p0, Lt5/h0;->j:J

    .line 254
    .line 255
    cmp-long v0, v4, v10

    .line 256
    .line 257
    if-ltz v0, :cond_9

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_9
    new-instance p1, Lt5/h0$a;

    .line 261
    .line 262
    invoke-direct {p1, v9, v3, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_a
    sub-long/2addr v4, v12

    .line 267
    iput-wide v4, p0, Lt5/h0;->j:J
    :try_end_2
    .catch Lt5/h0$a; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 268
    .line 269
    cmp-long v0, v4, v10

    .line 270
    .line 271
    if-ltz v0, :cond_e

    .line 272
    .line 273
    :goto_4
    iget-wide v0, p1, Lt5/n;->g:J

    .line 274
    .line 275
    cmp-long v3, v0, v6

    .line 276
    .line 277
    if-eqz v3, :cond_c

    .line 278
    .line 279
    iget-wide v3, p0, Lt5/h0;->j:J

    .line 280
    .line 281
    cmp-long v5, v3, v6

    .line 282
    .line 283
    if-nez v5, :cond_b

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_b
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    :goto_5
    iput-wide v0, p0, Lt5/h0;->j:J

    .line 291
    .line 292
    :cond_c
    iput-boolean v2, p0, Lt5/h0;->k:Z

    .line 293
    .line 294
    invoke-virtual {p0, p1}, Lt5/f;->r(Lt5/n;)V

    .line 295
    .line 296
    .line 297
    iget-wide v0, p1, Lt5/n;->g:J

    .line 298
    .line 299
    cmp-long p1, v0, v6

    .line 300
    .line 301
    if-eqz p1, :cond_d

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_d
    iget-wide v0, p0, Lt5/h0;->j:J

    .line 305
    .line 306
    :goto_6
    return-wide v0

    .line 307
    :cond_e
    :try_start_3
    new-instance p1, Lt5/l;

    .line 308
    .line 309
    invoke-direct {p1, v9}, Lt5/l;-><init>(I)V

    .line 310
    .line 311
    .line 312
    throw p1

    .line 313
    :cond_f
    new-instance p1, Lt5/h0$a;

    .line 314
    .line 315
    invoke-direct {p1, v9, v3, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 316
    .line 317
    .line 318
    throw p1
    :try_end_3
    .catch Lt5/h0$a; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 319
    :catch_0
    move-exception p1

    .line 320
    new-instance v0, Lt5/h0$a;

    .line 321
    .line 322
    const/16 v1, 0x7d0

    .line 323
    .line 324
    invoke-direct {v0, v1, v3, p1}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :catch_1
    move-exception p1

    .line 329
    throw p1

    .line 330
    :cond_10
    new-instance p1, Lt5/h0$a;

    .line 331
    .line 332
    new-instance v1, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const-string v2, "Resource is compressed: "

    .line 338
    .line 339
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const/16 v1, 0x7d0

    .line 350
    .line 351
    invoke-direct {p1, v1, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 352
    .line 353
    .line 354
    throw p1

    .line 355
    :catch_2
    move-exception p1

    .line 356
    new-instance v0, Lt5/h0$a;

    .line 357
    .line 358
    invoke-direct {v0, v4, v3, p1}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :catch_3
    new-instance p1, Lt5/h0$a;

    .line 363
    .line 364
    const-string v0, "Resource identifier must be an integer."

    .line 365
    .line 366
    invoke-direct {p1, v5, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    .line 367
    .line 368
    .line 369
    throw p1
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

.method public final close()V
    .locals 5

    const/4 v0, 0x0

    iput-object v0, p0, Lt5/h0;->g:Landroid/net/Uri;

    const/16 v1, 0x7d0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lt5/h0;->i:Ljava/io/FileInputStream;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lt5/h0;->i:Ljava/io/FileInputStream;

    :try_start_1
    iget-object v3, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/h0;->k:Z

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Lt5/h0;->k:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_2
    return-void

    :catch_0
    move-exception v3

    :try_start_2
    new-instance v4, Lt5/h0$a;

    invoke-direct {v4, v1, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/h0;->k:Z

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Lt5/h0;->k:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_3
    throw v1

    :catch_1
    move-exception v3

    :try_start_3
    new-instance v4, Lt5/h0$a;

    invoke-direct {v4, v1, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    iput-object v0, p0, Lt5/h0;->i:Ljava/io/FileInputStream;

    :try_start_4
    iget-object v4, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_4
    iput-object v0, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/h0;->k:Z

    if-eqz v0, :cond_5

    iput-boolean v2, p0, Lt5/h0;->k:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_5
    throw v3

    :catch_2
    move-exception v3

    :try_start_5
    new-instance v4, Lt5/h0$a;

    invoke-direct {v4, v1, v0, v3}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lt5/h0;->h:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/h0;->k:Z

    if-eqz v0, :cond_6

    iput-boolean v2, p0, Lt5/h0;->k:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_6
    throw v1
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/h0;->g:Landroid/net/Uri;

    return-object v0
.end method

.method public final read([BII)I
    .locals 9

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lt5/h0;->j:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, -0x1

    if-nez v2, :cond_1

    return v3

    :cond_1
    const-wide/16 v4, -0x1

    cmp-long v2, v0, v4

    const/16 v6, 0x7d0

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v7, p3

    :try_start_0
    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    :goto_0
    iget-object v0, p0, Lt5/h0;->i:Ljava/io/FileInputStream;

    sget v1, Lv5/e0;->a:I

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v3, :cond_4

    iget-wide p1, p0, Lt5/h0;->j:J

    cmp-long p1, p1, v4

    if-nez p1, :cond_3

    return v3

    :cond_3
    new-instance p1, Lt5/h0$a;

    new-instance p2, Ljava/io/EOFException;

    invoke-direct {p2}, Ljava/io/EOFException;-><init>()V

    const-string p3, "End of stream reached having not read sufficient data."

    invoke-direct {p1, v6, p3, p2}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw p1

    :cond_4
    iget-wide p2, p0, Lt5/h0;->j:J

    cmp-long v0, p2, v4

    if-eqz v0, :cond_5

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lt5/h0;->j:J

    :cond_5
    invoke-virtual {p0, p1}, Lt5/f;->o(I)V

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lt5/h0$a;

    const/4 p3, 0x0

    invoke-direct {p2, v6, p3, p1}, Lt5/h0$a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method
