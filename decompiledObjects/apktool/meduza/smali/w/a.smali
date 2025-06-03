.class public final Lw/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(FFFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw/a;->a:F

    iput p2, p0, Lw/a;->b:F

    iput p3, p0, Lw/a;->c:F

    iput p4, p0, Lw/a;->d:F

    iput p5, p0, Lw/a;->e:F

    iput p6, p0, Lw/a;->f:F

    return-void
.end method

.method public static a(I)Lw/a;
    .locals 21

    .line 1
    sget-object v0, Lw/l;->k:Lw/l;

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->red(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lyc/b;->b(I)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->green(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Lyc/b;->b(I)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->blue(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Lyc/b;->b(I)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sget-object v4, Lyc/b;->e:[[F

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aget-object v6, v4, v5

    .line 31
    .line 32
    aget v7, v6, v5

    .line 33
    .line 34
    mul-float/2addr v7, v1

    .line 35
    const/4 v8, 0x1

    .line 36
    aget v9, v6, v8

    .line 37
    .line 38
    mul-float/2addr v9, v2

    .line 39
    add-float/2addr v9, v7

    .line 40
    const/4 v7, 0x2

    .line 41
    aget v6, v6, v7

    .line 42
    .line 43
    mul-float/2addr v6, v3

    .line 44
    add-float/2addr v6, v9

    .line 45
    aget-object v9, v4, v8

    .line 46
    .line 47
    aget v10, v9, v5

    .line 48
    .line 49
    mul-float/2addr v10, v1

    .line 50
    aget v11, v9, v8

    .line 51
    .line 52
    mul-float/2addr v11, v2

    .line 53
    add-float/2addr v11, v10

    .line 54
    aget v9, v9, v7

    .line 55
    .line 56
    mul-float/2addr v9, v3

    .line 57
    add-float/2addr v9, v11

    .line 58
    aget-object v4, v4, v7

    .line 59
    .line 60
    aget v10, v4, v5

    .line 61
    .line 62
    mul-float/2addr v1, v10

    .line 63
    aget v10, v4, v8

    .line 64
    .line 65
    mul-float/2addr v2, v10

    .line 66
    add-float/2addr v2, v1

    .line 67
    aget v1, v4, v7

    .line 68
    .line 69
    mul-float/2addr v3, v1

    .line 70
    add-float/2addr v3, v2

    .line 71
    sget-object v1, Lyc/b;->b:[[F

    .line 72
    .line 73
    aget-object v2, v1, v5

    .line 74
    .line 75
    aget v4, v2, v5

    .line 76
    .line 77
    mul-float/2addr v4, v6

    .line 78
    aget v10, v2, v8

    .line 79
    .line 80
    mul-float/2addr v10, v9

    .line 81
    add-float/2addr v10, v4

    .line 82
    aget v2, v2, v7

    .line 83
    .line 84
    mul-float/2addr v2, v3

    .line 85
    add-float/2addr v2, v10

    .line 86
    aget-object v4, v1, v8

    .line 87
    .line 88
    aget v10, v4, v5

    .line 89
    .line 90
    mul-float/2addr v10, v6

    .line 91
    aget v11, v4, v8

    .line 92
    .line 93
    mul-float/2addr v11, v9

    .line 94
    add-float/2addr v11, v10

    .line 95
    aget v4, v4, v7

    .line 96
    .line 97
    mul-float/2addr v4, v3

    .line 98
    add-float/2addr v4, v11

    .line 99
    aget-object v1, v1, v7

    .line 100
    .line 101
    aget v10, v1, v5

    .line 102
    .line 103
    mul-float/2addr v6, v10

    .line 104
    aget v10, v1, v8

    .line 105
    .line 106
    mul-float/2addr v9, v10

    .line 107
    add-float/2addr v9, v6

    .line 108
    aget v1, v1, v7

    .line 109
    .line 110
    mul-float/2addr v3, v1

    .line 111
    add-float/2addr v3, v9

    .line 112
    iget-object v1, v0, Lw/l;->g:[F

    .line 113
    .line 114
    aget v5, v1, v5

    .line 115
    .line 116
    mul-float/2addr v5, v2

    .line 117
    aget v2, v1, v8

    .line 118
    .line 119
    mul-float/2addr v2, v4

    .line 120
    aget v1, v1, v7

    .line 121
    .line 122
    mul-float/2addr v1, v3

    .line 123
    iget v3, v0, Lw/l;->h:F

    .line 124
    .line 125
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    mul-float/2addr v4, v3

    .line 130
    float-to-double v3, v4

    .line 131
    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    .line 132
    .line 133
    div-double/2addr v3, v6

    .line 134
    const-wide v8, 0x3fdae147ae147ae1L    # 0.42

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 140
    .line 141
    .line 142
    move-result-wide v3

    .line 143
    double-to-float v3, v3

    .line 144
    iget v4, v0, Lw/l;->h:F

    .line 145
    .line 146
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    mul-float/2addr v10, v4

    .line 151
    float-to-double v10, v10

    .line 152
    div-double/2addr v10, v6

    .line 153
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 154
    .line 155
    .line 156
    move-result-wide v10

    .line 157
    double-to-float v4, v10

    .line 158
    iget v10, v0, Lw/l;->h:F

    .line 159
    .line 160
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    mul-float/2addr v11, v10

    .line 165
    float-to-double v10, v11

    .line 166
    div-double/2addr v10, v6

    .line 167
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 168
    .line 169
    .line 170
    move-result-wide v8

    .line 171
    double-to-float v8, v8

    .line 172
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    const/high16 v9, 0x43c80000    # 400.0f

    .line 177
    .line 178
    mul-float/2addr v5, v9

    .line 179
    mul-float/2addr v5, v3

    .line 180
    const v10, 0x41d90a3d    # 27.13f

    .line 181
    .line 182
    .line 183
    add-float/2addr v3, v10

    .line 184
    div-float/2addr v5, v3

    .line 185
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    mul-float/2addr v2, v9

    .line 190
    mul-float/2addr v2, v4

    .line 191
    add-float/2addr v4, v10

    .line 192
    div-float/2addr v2, v4

    .line 193
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    mul-float/2addr v1, v9

    .line 198
    mul-float/2addr v1, v8

    .line 199
    add-float/2addr v8, v10

    .line 200
    div-float/2addr v1, v8

    .line 201
    float-to-double v3, v5

    .line 202
    const-wide/high16 v8, 0x4026000000000000L    # 11.0

    .line 203
    .line 204
    mul-double/2addr v3, v8

    .line 205
    float-to-double v8, v2

    .line 206
    const-wide/high16 v10, -0x3fd8000000000000L    # -12.0

    .line 207
    .line 208
    mul-double/2addr v8, v10

    .line 209
    add-double/2addr v8, v3

    .line 210
    float-to-double v3, v1

    .line 211
    add-double/2addr v8, v3

    .line 212
    double-to-float v8, v8

    .line 213
    const/high16 v9, 0x41300000    # 11.0f

    .line 214
    .line 215
    div-float/2addr v8, v9

    .line 216
    add-float v9, v5, v2

    .line 217
    .line 218
    float-to-double v9, v9

    .line 219
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 220
    .line 221
    mul-double/2addr v3, v11

    .line 222
    sub-double/2addr v9, v3

    .line 223
    double-to-float v3, v9

    .line 224
    const/high16 v4, 0x41100000    # 9.0f

    .line 225
    .line 226
    div-float/2addr v3, v4

    .line 227
    const/high16 v4, 0x41a00000    # 20.0f

    .line 228
    .line 229
    mul-float v9, v5, v4

    .line 230
    .line 231
    mul-float/2addr v2, v4

    .line 232
    add-float/2addr v9, v2

    .line 233
    const/high16 v10, 0x41a80000    # 21.0f

    .line 234
    .line 235
    mul-float/2addr v10, v1

    .line 236
    add-float/2addr v10, v9

    .line 237
    div-float/2addr v10, v4

    .line 238
    const/high16 v9, 0x42200000    # 40.0f

    .line 239
    .line 240
    mul-float/2addr v5, v9

    .line 241
    add-float/2addr v5, v2

    .line 242
    add-float/2addr v5, v1

    .line 243
    div-float/2addr v5, v4

    .line 244
    float-to-double v1, v3

    .line 245
    float-to-double v13, v8

    .line 246
    invoke-static {v1, v2, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 247
    .line 248
    .line 249
    move-result-wide v1

    .line 250
    double-to-float v1, v1

    .line 251
    const/high16 v2, 0x43340000    # 180.0f

    .line 252
    .line 253
    mul-float/2addr v1, v2

    .line 254
    const v4, 0x40490fdb    # (float)Math.PI

    .line 255
    .line 256
    .line 257
    div-float/2addr v1, v4

    .line 258
    const/4 v9, 0x0

    .line 259
    cmpg-float v9, v1, v9

    .line 260
    .line 261
    const/high16 v13, 0x43b40000    # 360.0f

    .line 262
    .line 263
    if-gez v9, :cond_0

    .line 264
    .line 265
    add-float/2addr v1, v13

    .line 266
    goto :goto_0

    .line 267
    :cond_0
    cmpl-float v9, v1, v13

    .line 268
    .line 269
    if-ltz v9, :cond_1

    .line 270
    .line 271
    sub-float/2addr v1, v13

    .line 272
    :cond_1
    :goto_0
    move v15, v1

    .line 273
    mul-float/2addr v4, v15

    .line 274
    div-float/2addr v4, v2

    .line 275
    iget v1, v0, Lw/l;->b:F

    .line 276
    .line 277
    mul-float/2addr v5, v1

    .line 278
    iget v1, v0, Lw/l;->a:F

    .line 279
    .line 280
    div-float/2addr v5, v1

    .line 281
    float-to-double v1, v5

    .line 282
    iget v5, v0, Lw/l;->d:F

    .line 283
    .line 284
    iget v9, v0, Lw/l;->j:F

    .line 285
    .line 286
    mul-float/2addr v5, v9

    .line 287
    float-to-double v6, v5

    .line 288
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 289
    .line 290
    .line 291
    move-result-wide v1

    .line 292
    double-to-float v1, v1

    .line 293
    const/high16 v2, 0x42c80000    # 100.0f

    .line 294
    .line 295
    mul-float/2addr v1, v2

    .line 296
    const/high16 v5, 0x40800000    # 4.0f

    .line 297
    .line 298
    div-float v2, v1, v2

    .line 299
    .line 300
    float-to-double v6, v2

    .line 301
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 302
    .line 303
    .line 304
    float-to-double v6, v15

    .line 305
    const-wide v18, 0x403423d70a3d70a4L    # 20.14

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    cmpg-double v2, v6, v18

    .line 311
    .line 312
    if-gez v2, :cond_2

    .line 313
    .line 314
    add-float/2addr v13, v15

    .line 315
    goto :goto_1

    .line 316
    :cond_2
    move v13, v15

    .line 317
    :goto_1
    const/high16 v2, 0x3e800000    # 0.25f

    .line 318
    .line 319
    float-to-double v6, v13

    .line 320
    const-wide v13, 0x400921fb54442d18L    # Math.PI

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    mul-double/2addr v6, v13

    .line 326
    const-wide v13, 0x4066800000000000L    # 180.0

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    div-double/2addr v6, v13

    .line 332
    add-double/2addr v6, v11

    .line 333
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    const-wide v11, 0x400e666666666666L    # 3.8

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    add-double/2addr v6, v11

    .line 343
    double-to-float v6, v6

    .line 344
    mul-float/2addr v6, v2

    .line 345
    const v2, 0x45706276

    .line 346
    .line 347
    .line 348
    mul-float/2addr v6, v2

    .line 349
    iget v2, v0, Lw/l;->e:F

    .line 350
    .line 351
    mul-float/2addr v6, v2

    .line 352
    iget v2, v0, Lw/l;->c:F

    .line 353
    .line 354
    mul-float/2addr v6, v2

    .line 355
    mul-float/2addr v8, v8

    .line 356
    mul-float/2addr v3, v3

    .line 357
    add-float/2addr v3, v8

    .line 358
    float-to-double v2, v3

    .line 359
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 360
    .line 361
    .line 362
    move-result-wide v2

    .line 363
    double-to-float v2, v2

    .line 364
    mul-float/2addr v6, v2

    .line 365
    const v2, 0x3e9c28f6    # 0.305f

    .line 366
    .line 367
    .line 368
    add-float/2addr v10, v2

    .line 369
    div-float/2addr v6, v10

    .line 370
    const-wide v2, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    const-wide v7, 0x3fd28f5c28f5c28fL    # 0.29

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    iget v9, v0, Lw/l;->f:F

    .line 381
    .line 382
    float-to-double v9, v9

    .line 383
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 384
    .line 385
    .line 386
    move-result-wide v7

    .line 387
    sub-double/2addr v2, v7

    .line 388
    const-wide v7, 0x3fe75c28f5c28f5cL    # 0.73

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    double-to-float v2, v2

    .line 398
    float-to-double v6, v6

    .line 399
    const-wide v8, 0x3feccccccccccccdL    # 0.9

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 405
    .line 406
    .line 407
    move-result-wide v6

    .line 408
    double-to-float v3, v6

    .line 409
    mul-float/2addr v2, v3

    .line 410
    float-to-double v6, v1

    .line 411
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    .line 412
    .line 413
    div-double/2addr v6, v8

    .line 414
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 415
    .line 416
    .line 417
    move-result-wide v6

    .line 418
    double-to-float v3, v6

    .line 419
    mul-float v16, v3, v2

    .line 420
    .line 421
    iget v3, v0, Lw/l;->i:F

    .line 422
    .line 423
    mul-float v3, v3, v16

    .line 424
    .line 425
    iget v6, v0, Lw/l;->d:F

    .line 426
    .line 427
    mul-float/2addr v2, v6

    .line 428
    iget v0, v0, Lw/l;->a:F

    .line 429
    .line 430
    add-float/2addr v0, v5

    .line 431
    div-float/2addr v2, v0

    .line 432
    float-to-double v5, v2

    .line 433
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 434
    .line 435
    .line 436
    const v0, 0x3fd9999a    # 1.7f

    .line 437
    .line 438
    .line 439
    mul-float/2addr v0, v1

    .line 440
    const v2, 0x3be56042    # 0.007f

    .line 441
    .line 442
    .line 443
    mul-float/2addr v2, v1

    .line 444
    const/high16 v5, 0x3f800000    # 1.0f

    .line 445
    .line 446
    add-float/2addr v2, v5

    .line 447
    div-float v18, v0, v2

    .line 448
    .line 449
    const v0, 0x422f7048

    .line 450
    .line 451
    .line 452
    const v2, 0x3cbac711    # 0.0228f

    .line 453
    .line 454
    .line 455
    mul-float/2addr v3, v2

    .line 456
    add-float/2addr v3, v5

    .line 457
    float-to-double v2, v3

    .line 458
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 459
    .line 460
    .line 461
    move-result-wide v2

    .line 462
    double-to-float v2, v2

    .line 463
    mul-float/2addr v2, v0

    .line 464
    float-to-double v3, v4

    .line 465
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 466
    .line 467
    .line 468
    move-result-wide v5

    .line 469
    double-to-float v0, v5

    .line 470
    mul-float v19, v0, v2

    .line 471
    .line 472
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 473
    .line 474
    .line 475
    move-result-wide v3

    .line 476
    double-to-float v0, v3

    .line 477
    mul-float v20, v2, v0

    .line 478
    .line 479
    new-instance v0, Lw/a;

    .line 480
    .line 481
    move-object v14, v0

    .line 482
    move/from16 v17, v1

    .line 483
    .line 484
    invoke-direct/range {v14 .. v20}, Lw/a;-><init>(FFFFFF)V

    .line 485
    .line 486
    .line 487
    return-object v0
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

.method public static b(FFF)Lw/a;
    .locals 11

    .line 1
    sget-object v0, Lw/l;->k:Lw/l;

    .line 2
    .line 3
    iget v1, v0, Lw/l;->d:F

    .line 4
    .line 5
    float-to-double v1, p0

    .line 6
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 7
    .line 8
    div-double/2addr v1, v3

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 10
    .line 11
    .line 12
    iget v3, v0, Lw/l;->i:F

    .line 13
    .line 14
    mul-float/2addr v3, p1

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    double-to-float v1, v1

    .line 20
    div-float v1, p1, v1

    .line 21
    .line 22
    iget v2, v0, Lw/l;->d:F

    .line 23
    .line 24
    mul-float/2addr v1, v2

    .line 25
    iget v0, v0, Lw/l;->a:F

    .line 26
    .line 27
    const/high16 v2, 0x40800000    # 4.0f

    .line 28
    .line 29
    add-float/2addr v0, v2

    .line 30
    div-float/2addr v1, v0

    .line 31
    float-to-double v0, v1

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 33
    .line 34
    .line 35
    const v0, 0x40490fdb    # (float)Math.PI

    .line 36
    .line 37
    .line 38
    mul-float/2addr v0, p2

    .line 39
    const/high16 v1, 0x43340000    # 180.0f

    .line 40
    .line 41
    div-float/2addr v0, v1

    .line 42
    const v1, 0x3fd9999a    # 1.7f

    .line 43
    .line 44
    .line 45
    mul-float/2addr v1, p0

    .line 46
    const v2, 0x3be56042    # 0.007f

    .line 47
    .line 48
    .line 49
    mul-float/2addr v2, p0

    .line 50
    const/high16 v4, 0x3f800000    # 1.0f

    .line 51
    .line 52
    add-float/2addr v2, v4

    .line 53
    div-float v8, v1, v2

    .line 54
    .line 55
    float-to-double v1, v3

    .line 56
    const-wide v3, 0x3f9758e219652bd4L    # 0.0228

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    mul-double/2addr v1, v3

    .line 62
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 63
    .line 64
    add-double/2addr v1, v3

    .line 65
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    double-to-float v1, v1

    .line 70
    const v2, 0x422f7048

    .line 71
    .line 72
    .line 73
    mul-float/2addr v1, v2

    .line 74
    float-to-double v2, v0

    .line 75
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v4

    .line 79
    double-to-float v0, v4

    .line 80
    mul-float v9, v1, v0

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    double-to-float v0, v2

    .line 87
    mul-float v10, v1, v0

    .line 88
    .line 89
    new-instance v0, Lw/a;

    .line 90
    .line 91
    move-object v4, v0

    .line 92
    move v5, p2

    .line 93
    move v6, p1

    .line 94
    move v7, p0

    .line 95
    invoke-direct/range {v4 .. v10}, Lw/a;-><init>(FFFFFF)V

    .line 96
    .line 97
    .line 98
    return-object v0
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
.end method


# virtual methods
.method public final c(Lw/l;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lw/a;->b:F

    .line 6
    .line 7
    float-to-double v3, v2

    .line 8
    const-wide/16 v5, 0x0

    .line 9
    .line 10
    cmpl-double v3, v3, v5

    .line 11
    .line 12
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iget v3, v0, Lw/a;->c:F

    .line 17
    .line 18
    float-to-double v3, v3

    .line 19
    cmpl-double v9, v3, v5

    .line 20
    .line 21
    if-nez v9, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    div-double/2addr v3, v7

    .line 25
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    double-to-float v3, v3

    .line 30
    div-float/2addr v2, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 33
    :goto_1
    float-to-double v2, v2

    .line 34
    const-wide v9, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const-wide v11, 0x3fd28f5c28f5c28fL    # 0.29

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iget v4, v1, Lw/l;->f:F

    .line 45
    .line 46
    float-to-double v13, v4

    .line 47
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 48
    .line 49
    .line 50
    move-result-wide v11

    .line 51
    sub-double/2addr v9, v11

    .line 52
    const-wide v11, 0x3fe75c28f5c28f5cL    # 0.73

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    div-double/2addr v2, v9

    .line 62
    const-wide v9, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    double-to-float v2, v2

    .line 72
    iget v3, v0, Lw/a;->a:F

    .line 73
    .line 74
    const v4, 0x40490fdb    # (float)Math.PI

    .line 75
    .line 76
    .line 77
    mul-float/2addr v3, v4

    .line 78
    const/high16 v4, 0x43340000    # 180.0f

    .line 79
    .line 80
    div-float/2addr v3, v4

    .line 81
    const/high16 v4, 0x3e800000    # 0.25f

    .line 82
    .line 83
    float-to-double v9, v3

    .line 84
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 85
    .line 86
    add-double/2addr v11, v9

    .line 87
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    const-wide v13, 0x400e666666666666L    # 3.8

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    add-double/2addr v11, v13

    .line 97
    double-to-float v3, v11

    .line 98
    mul-float/2addr v3, v4

    .line 99
    iget v4, v1, Lw/l;->a:F

    .line 100
    .line 101
    iget v11, v0, Lw/a;->c:F

    .line 102
    .line 103
    float-to-double v11, v11

    .line 104
    div-double/2addr v11, v7

    .line 105
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 106
    .line 107
    iget v13, v1, Lw/l;->d:F

    .line 108
    .line 109
    float-to-double v13, v13

    .line 110
    div-double/2addr v7, v13

    .line 111
    iget v13, v1, Lw/l;->j:F

    .line 112
    .line 113
    float-to-double v13, v13

    .line 114
    div-double/2addr v7, v13

    .line 115
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    double-to-float v7, v7

    .line 120
    mul-float/2addr v4, v7

    .line 121
    const v7, 0x45706276

    .line 122
    .line 123
    .line 124
    mul-float/2addr v3, v7

    .line 125
    iget v7, v1, Lw/l;->e:F

    .line 126
    .line 127
    mul-float/2addr v3, v7

    .line 128
    iget v7, v1, Lw/l;->c:F

    .line 129
    .line 130
    mul-float/2addr v3, v7

    .line 131
    iget v7, v1, Lw/l;->b:F

    .line 132
    .line 133
    div-float/2addr v4, v7

    .line 134
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    double-to-float v7, v7

    .line 139
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v8

    .line 143
    double-to-float v8, v8

    .line 144
    const v9, 0x3e9c28f6    # 0.305f

    .line 145
    .line 146
    .line 147
    add-float/2addr v9, v4

    .line 148
    const/high16 v10, 0x41b80000    # 23.0f

    .line 149
    .line 150
    mul-float/2addr v9, v10

    .line 151
    mul-float/2addr v9, v2

    .line 152
    mul-float/2addr v3, v10

    .line 153
    const/high16 v10, 0x41300000    # 11.0f

    .line 154
    .line 155
    mul-float/2addr v10, v2

    .line 156
    mul-float/2addr v10, v8

    .line 157
    add-float/2addr v10, v3

    .line 158
    const/high16 v3, 0x42d80000    # 108.0f

    .line 159
    .line 160
    mul-float/2addr v2, v3

    .line 161
    mul-float/2addr v2, v7

    .line 162
    add-float/2addr v2, v10

    .line 163
    div-float/2addr v9, v2

    .line 164
    mul-float/2addr v8, v9

    .line 165
    mul-float/2addr v9, v7

    .line 166
    const/high16 v2, 0x43e60000    # 460.0f

    .line 167
    .line 168
    mul-float/2addr v4, v2

    .line 169
    const v2, 0x43e18000    # 451.0f

    .line 170
    .line 171
    .line 172
    mul-float/2addr v2, v8

    .line 173
    add-float/2addr v2, v4

    .line 174
    const/high16 v3, 0x43900000    # 288.0f

    .line 175
    .line 176
    mul-float/2addr v3, v9

    .line 177
    add-float/2addr v3, v2

    .line 178
    const v2, 0x44af6000    # 1403.0f

    .line 179
    .line 180
    .line 181
    div-float/2addr v3, v2

    .line 182
    const v7, 0x445ec000    # 891.0f

    .line 183
    .line 184
    .line 185
    mul-float/2addr v7, v8

    .line 186
    sub-float v7, v4, v7

    .line 187
    .line 188
    const v10, 0x43828000    # 261.0f

    .line 189
    .line 190
    .line 191
    mul-float/2addr v10, v9

    .line 192
    sub-float/2addr v7, v10

    .line 193
    div-float/2addr v7, v2

    .line 194
    const/high16 v10, 0x435c0000    # 220.0f

    .line 195
    .line 196
    mul-float/2addr v8, v10

    .line 197
    sub-float/2addr v4, v8

    .line 198
    const v8, 0x45c4e000    # 6300.0f

    .line 199
    .line 200
    .line 201
    mul-float/2addr v9, v8

    .line 202
    sub-float/2addr v4, v9

    .line 203
    div-float/2addr v4, v2

    .line 204
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    float-to-double v8, v2

    .line 209
    const-wide v10, 0x403b2147ae147ae1L    # 27.13

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    mul-double/2addr v8, v10

    .line 215
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    float-to-double v12, v2

    .line 220
    const-wide/high16 v14, 0x4079000000000000L    # 400.0

    .line 221
    .line 222
    sub-double v12, v14, v12

    .line 223
    .line 224
    div-double/2addr v8, v12

    .line 225
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 226
    .line 227
    .line 228
    move-result-wide v8

    .line 229
    double-to-float v2, v8

    .line 230
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    iget v8, v1, Lw/l;->h:F

    .line 235
    .line 236
    const/high16 v9, 0x42c80000    # 100.0f

    .line 237
    .line 238
    div-float v8, v9, v8

    .line 239
    .line 240
    mul-float/2addr v8, v3

    .line 241
    float-to-double v2, v2

    .line 242
    const-wide v12, 0x40030c30c30c30c3L    # 2.380952380952381

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 248
    .line 249
    .line 250
    move-result-wide v2

    .line 251
    double-to-float v2, v2

    .line 252
    mul-float/2addr v8, v2

    .line 253
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    float-to-double v2, v2

    .line 258
    mul-double/2addr v2, v10

    .line 259
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    float-to-double v10, v10

    .line 264
    sub-double v10, v14, v10

    .line 265
    .line 266
    div-double/2addr v2, v10

    .line 267
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 268
    .line 269
    .line 270
    move-result-wide v2

    .line 271
    double-to-float v2, v2

    .line 272
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    iget v7, v1, Lw/l;->h:F

    .line 277
    .line 278
    div-float v7, v9, v7

    .line 279
    .line 280
    mul-float/2addr v7, v3

    .line 281
    float-to-double v2, v2

    .line 282
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 283
    .line 284
    .line 285
    move-result-wide v2

    .line 286
    double-to-float v2, v2

    .line 287
    mul-float/2addr v7, v2

    .line 288
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    float-to-double v2, v2

    .line 293
    const-wide v10, 0x403b2147ae147ae1L    # 27.13

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    mul-double/2addr v2, v10

    .line 299
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    float-to-double v10, v10

    .line 304
    sub-double/2addr v14, v10

    .line 305
    div-double/2addr v2, v14

    .line 306
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 307
    .line 308
    .line 309
    move-result-wide v2

    .line 310
    double-to-float v2, v2

    .line 311
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    iget v4, v1, Lw/l;->h:F

    .line 316
    .line 317
    div-float/2addr v9, v4

    .line 318
    mul-float/2addr v9, v3

    .line 319
    float-to-double v2, v2

    .line 320
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 321
    .line 322
    .line 323
    move-result-wide v2

    .line 324
    double-to-float v2, v2

    .line 325
    mul-float/2addr v9, v2

    .line 326
    iget-object v1, v1, Lw/l;->g:[F

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    aget v3, v1, v2

    .line 330
    .line 331
    div-float/2addr v8, v3

    .line 332
    const/4 v3, 0x1

    .line 333
    aget v4, v1, v3

    .line 334
    .line 335
    div-float/2addr v7, v4

    .line 336
    const/4 v4, 0x2

    .line 337
    aget v1, v1, v4

    .line 338
    .line 339
    div-float/2addr v9, v1

    .line 340
    sget-object v1, Lyc/b;->c:[[F

    .line 341
    .line 342
    aget-object v5, v1, v2

    .line 343
    .line 344
    aget v6, v5, v2

    .line 345
    .line 346
    mul-float/2addr v6, v8

    .line 347
    aget v10, v5, v3

    .line 348
    .line 349
    mul-float/2addr v10, v7

    .line 350
    add-float/2addr v10, v6

    .line 351
    aget v5, v5, v4

    .line 352
    .line 353
    mul-float/2addr v5, v9

    .line 354
    add-float/2addr v5, v10

    .line 355
    aget-object v6, v1, v3

    .line 356
    .line 357
    aget v10, v6, v2

    .line 358
    .line 359
    mul-float/2addr v10, v8

    .line 360
    aget v11, v6, v3

    .line 361
    .line 362
    mul-float/2addr v11, v7

    .line 363
    add-float/2addr v11, v10

    .line 364
    aget v6, v6, v4

    .line 365
    .line 366
    mul-float/2addr v6, v9

    .line 367
    add-float/2addr v6, v11

    .line 368
    aget-object v1, v1, v4

    .line 369
    .line 370
    aget v2, v1, v2

    .line 371
    .line 372
    mul-float/2addr v8, v2

    .line 373
    aget v2, v1, v3

    .line 374
    .line 375
    mul-float/2addr v7, v2

    .line 376
    add-float/2addr v7, v8

    .line 377
    aget v1, v1, v4

    .line 378
    .line 379
    mul-float/2addr v9, v1

    .line 380
    add-float/2addr v9, v7

    .line 381
    float-to-double v10, v5

    .line 382
    float-to-double v12, v6

    .line 383
    float-to-double v14, v9

    .line 384
    invoke-static/range {v10 .. v15}, Lx/a;->a(DDD)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    return v1
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
