.class public final Lnb/i$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/i$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public final a:Lnb/i$f;

.field public final b:Leb/d;


# direct methods
.method public constructor <init>(Lnb/i$f;Leb/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lnb/i$f;->e:Lnb/i$f$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "success rate ejection config is null"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    iput-object p1, p0, Lnb/i$j;->a:Lnb/i$f;

    iput-object p2, p0, Lnb/i$j;->b:Leb/d;

    return-void
.end method


# virtual methods
.method public final a(Lnb/i$b;J)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnb/i$j;->a:Lnb/i$f;

    .line 4
    .line 5
    iget-object v1, v1, Lnb/i$f;->e:Lnb/i$f$b;

    .line 6
    .line 7
    iget-object v1, v1, Lnb/i$f$b;->d:Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-static {v2, v1}, Lnb/i;->h(Lnb/i$b;I)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, v0, Lnb/i$j;->a:Lnb/i$f;

    .line 24
    .line 25
    iget-object v4, v4, Lnb/i$f;->e:Lnb/i$f$b;

    .line 26
    .line 27
    iget-object v4, v4, Lnb/i$f$b;->c:Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-lt v3, v4, :cond_7

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lnb/i$a;

    .line 63
    .line 64
    iget-object v6, v5, Lnb/i$a;->c:Lnb/i$a$a;

    .line 65
    .line 66
    iget-object v6, v6, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    long-to-double v6, v6

    .line 73
    invoke-virtual {v5}, Lnb/i$a;->c()J

    .line 74
    .line 75
    .line 76
    move-result-wide v8

    .line 77
    long-to-double v8, v8

    .line 78
    div-double/2addr v6, v8

    .line 79
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const-wide/16 v5, 0x0

    .line 92
    .line 93
    move-wide v7, v5

    .line 94
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_2

    .line 99
    .line 100
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, Ljava/lang/Double;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    add-double/2addr v7, v9

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    int-to-double v9, v4

    .line 117
    div-double/2addr v7, v9

    .line 118
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    check-cast v9, Ljava/lang/Double;

    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 135
    .line 136
    .line 137
    move-result-wide v9

    .line 138
    sub-double/2addr v9, v7

    .line 139
    mul-double/2addr v9, v9

    .line 140
    add-double/2addr v5, v9

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    int-to-double v3, v3

    .line 147
    div-double/2addr v5, v3

    .line 148
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    iget-object v5, v0, Lnb/i$j;->a:Lnb/i$f;

    .line 153
    .line 154
    iget-object v5, v5, Lnb/i$f;->e:Lnb/i$f$b;

    .line 155
    .line 156
    iget-object v5, v5, Lnb/i$f$b;->a:Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    int-to-float v5, v5

    .line 163
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 164
    .line 165
    div-float/2addr v5, v6

    .line 166
    float-to-double v5, v5

    .line 167
    mul-double/2addr v5, v3

    .line 168
    sub-double v5, v7, v5

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-eqz v9, :cond_7

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    check-cast v9, Lnb/i$a;

    .line 185
    .line 186
    invoke-virtual/range {p1 .. p1}, Lnb/i$b;->d()D

    .line 187
    .line 188
    .line 189
    move-result-wide v10

    .line 190
    iget-object v12, v0, Lnb/i$j;->a:Lnb/i$f;

    .line 191
    .line 192
    iget-object v12, v12, Lnb/i$f;->d:Ljava/lang/Integer;

    .line 193
    .line 194
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    int-to-double v12, v12

    .line 199
    cmpl-double v10, v10, v12

    .line 200
    .line 201
    if-ltz v10, :cond_4

    .line 202
    .line 203
    return-void

    .line 204
    :cond_4
    iget-object v10, v9, Lnb/i$a;->c:Lnb/i$a$a;

    .line 205
    .line 206
    iget-object v10, v10, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 207
    .line 208
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 209
    .line 210
    .line 211
    move-result-wide v10

    .line 212
    long-to-double v10, v10

    .line 213
    invoke-virtual {v9}, Lnb/i$a;->c()J

    .line 214
    .line 215
    .line 216
    move-result-wide v12

    .line 217
    long-to-double v12, v12

    .line 218
    div-double/2addr v10, v12

    .line 219
    cmpg-double v10, v10, v5

    .line 220
    .line 221
    if-gez v10, :cond_5

    .line 222
    .line 223
    iget-object v10, v0, Lnb/i$j;->b:Leb/d;

    .line 224
    .line 225
    sget-object v11, Leb/d$a;->a:Leb/d$a;

    .line 226
    .line 227
    const/4 v12, 0x5

    .line 228
    new-array v12, v12, [Ljava/lang/Object;

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    aput-object v9, v12, v13

    .line 232
    .line 233
    const/4 v13, 0x1

    .line 234
    iget-object v14, v9, Lnb/i$a;->c:Lnb/i$a$a;

    .line 235
    .line 236
    iget-object v14, v14, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 237
    .line 238
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 239
    .line 240
    .line 241
    move-result-wide v14

    .line 242
    long-to-double v14, v14

    .line 243
    move-object/from16 v16, v1

    .line 244
    .line 245
    invoke-virtual {v9}, Lnb/i$a;->c()J

    .line 246
    .line 247
    .line 248
    move-result-wide v1

    .line 249
    long-to-double v1, v1

    .line 250
    div-double/2addr v14, v1

    .line 251
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    aput-object v1, v12, v13

    .line 256
    .line 257
    const/4 v1, 0x2

    .line 258
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    aput-object v2, v12, v1

    .line 263
    .line 264
    const/4 v1, 0x3

    .line 265
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    aput-object v2, v12, v1

    .line 270
    .line 271
    const/4 v1, 0x4

    .line 272
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    aput-object v2, v12, v1

    .line 277
    .line 278
    const-string v1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}"

    .line 279
    .line 280
    invoke-virtual {v10, v11, v1, v12}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, Ljava/util/Random;

    .line 284
    .line 285
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 286
    .line 287
    .line 288
    const/16 v2, 0x64

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    iget-object v2, v0, Lnb/i$j;->a:Lnb/i$f;

    .line 295
    .line 296
    iget-object v2, v2, Lnb/i$f;->e:Lnb/i$f$b;

    .line 297
    .line 298
    iget-object v2, v2, Lnb/i$f$b;->b:Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-ge v1, v2, :cond_6

    .line 305
    .line 306
    move-wide/from16 v1, p2

    .line 307
    .line 308
    invoke-virtual {v9, v1, v2}, Lnb/i$a;->b(J)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_5
    move-object/from16 v16, v1

    .line 313
    .line 314
    :cond_6
    move-wide/from16 v1, p2

    .line 315
    .line 316
    :goto_4
    move-object/from16 v2, p1

    .line 317
    .line 318
    move-object/from16 v1, v16

    .line 319
    .line 320
    goto/16 :goto_3

    .line 321
    .line 322
    :cond_7
    :goto_5
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
.end method
