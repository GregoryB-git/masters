.class public final Lq3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ll3/e;

.field public final c:Lr3/d;

.field public final d:Lq3/n;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ls3/b;

.field public final g:Lt3/a;

.field public final h:Lt3/a;

.field public final i:Lr3/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll3/e;Lr3/d;Lq3/n;Ljava/util/concurrent/Executor;Ls3/b;Lt3/a;Lt3/a;Lr3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/k;->a:Landroid/content/Context;

    iput-object p2, p0, Lq3/k;->b:Ll3/e;

    iput-object p3, p0, Lq3/k;->c:Lr3/d;

    iput-object p4, p0, Lq3/k;->d:Lq3/n;

    iput-object p5, p0, Lq3/k;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lq3/k;->f:Ls3/b;

    iput-object p7, p0, Lq3/k;->g:Lt3/a;

    iput-object p8, p0, Lq3/k;->h:Lt3/a;

    iput-object p9, p0, Lq3/k;->i:Lr3/c;

    return-void
.end method


# virtual methods
.method public final a(Lk3/s;I)V
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v0, v6, Lq3/k;->b:Ll3/e;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lk3/s;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ll3/e;->a(Ljava/lang/String;)Ll3/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ll3/b;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    invoke-direct {v1, v8, v2, v3}, Ll3/b;-><init>(IJ)V

    .line 21
    .line 22
    .line 23
    move-wide v4, v2

    .line 24
    :cond_0
    :goto_0
    iget-object v1, v6, Lq3/k;->f:Ls3/b;

    .line 25
    .line 26
    new-instance v2, Lq3/h;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, v3, v6, v7}, Lq3/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_b

    .line 43
    .line 44
    iget-object v1, v6, Lq3/k;->f:Ls3/b;

    .line 45
    .line 46
    new-instance v2, Lk1/a;

    .line 47
    .line 48
    invoke-direct {v2, v8, v6, v7}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    const/4 v1, 0x3

    .line 70
    const/4 v9, 0x2

    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    const-string v10, "Uploader"

    .line 74
    .line 75
    const-string v11, "Unknown backend for %s, deleting event batch for it..."

    .line 76
    .line 77
    invoke-static {v10, v11, v7}, Lo3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v10, Ll3/b;

    .line 81
    .line 82
    const-wide/16 v11, -0x1

    .line 83
    .line 84
    invoke-direct {v10, v1, v11, v12}, Ll3/b;-><init>(IJ)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_2
    new-instance v10, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_3

    .line 103
    .line 104
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    check-cast v12, Lr3/i;

    .line 109
    .line 110
    invoke-virtual {v12}, Lr3/i;->a()Lk3/n;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lk3/s;->c()[B

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    if-eqz v11, :cond_4

    .line 123
    .line 124
    move v11, v8

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    move v11, v3

    .line 127
    :goto_2
    if-eqz v11, :cond_5

    .line 128
    .line 129
    iget-object v11, v6, Lq3/k;->f:Ls3/b;

    .line 130
    .line 131
    iget-object v12, v6, Lq3/k;->i:Lr3/c;

    .line 132
    .line 133
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    new-instance v13, Ld;

    .line 137
    .line 138
    invoke-direct {v13, v12, v9}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v11, v13}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    check-cast v11, Ln3/a;

    .line 146
    .line 147
    new-instance v12, Lk3/h$a;

    .line 148
    .line 149
    invoke-direct {v12}, Lk3/h$a;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v13, Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v13, v12, Lk3/h$a;->f:Ljava/util/Map;

    .line 158
    .line 159
    iget-object v13, v6, Lq3/k;->g:Lt3/a;

    .line 160
    .line 161
    invoke-interface {v13}, Lt3/a;->a()J

    .line 162
    .line 163
    .line 164
    move-result-wide v13

    .line 165
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iput-object v13, v12, Lk3/h$a;->d:Ljava/lang/Long;

    .line 170
    .line 171
    iget-object v13, v6, Lq3/k;->h:Lt3/a;

    .line 172
    .line 173
    invoke-interface {v13}, Lt3/a;->a()J

    .line 174
    .line 175
    .line 176
    move-result-wide v13

    .line 177
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    iput-object v13, v12, Lk3/h$a;->e:Ljava/lang/Long;

    .line 182
    .line 183
    const-string v13, "GDT_CLIENT_METRICS"

    .line 184
    .line 185
    invoke-virtual {v12, v13}, Lk3/h$a;->d(Ljava/lang/String;)Lk3/h$a;

    .line 186
    .line 187
    .line 188
    new-instance v13, Lk3/m;

    .line 189
    .line 190
    new-instance v14, Lh3/c;

    .line 191
    .line 192
    const-string v15, "proto"

    .line 193
    .line 194
    invoke-direct {v14, v15}, Lh3/c;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v15, Lk3/p;->a:Lb9/g;

    .line 201
    .line 202
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 206
    .line 207
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 208
    .line 209
    .line 210
    :try_start_0
    invoke-virtual {v15, v11, v1}, Lb9/g;->a(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .line 212
    .line 213
    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-direct {v13, v14, v1}, Lk3/m;-><init>(Lh3/c;[B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v13}, Lk3/h$a;->c(Lk3/m;)Lk3/h$a;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Lk3/h$a;->b()Lk3/h;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-interface {v0, v1}, Ll3/m;->a(Lk3/n;)Lk3/h;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lk3/s;->c()[B

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v11, Ll3/a;

    .line 239
    .line 240
    invoke-direct {v11, v10, v1}, Ll3/a;-><init>(Ljava/lang/Iterable;[B)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0, v11}, Ll3/m;->b(Ll3/a;)Ll3/b;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    :goto_3
    iget v1, v10, Ll3/b;->a:I

    .line 248
    .line 249
    if-ne v1, v9, :cond_6

    .line 250
    .line 251
    iget-object v9, v6, Lq3/k;->f:Ls3/b;

    .line 252
    .line 253
    new-instance v10, Lq3/i;

    .line 254
    .line 255
    move-object v0, v10

    .line 256
    move-object/from16 v1, p0

    .line 257
    .line 258
    move-object/from16 v3, p1

    .line 259
    .line 260
    invoke-direct/range {v0 .. v5}, Lq3/i;-><init>(Lq3/k;Ljava/lang/Iterable;Lk3/s;J)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v9, v10}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    iget-object v0, v6, Lq3/k;->d:Lq3/n;

    .line 267
    .line 268
    add-int/lit8 v1, p2, 0x1

    .line 269
    .line 270
    invoke-interface {v0, v7, v1, v8}, Lq3/n;->a(Lk3/s;IZ)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_6
    iget-object v1, v6, Lq3/k;->f:Ls3/b;

    .line 275
    .line 276
    new-instance v11, Lo9/l;

    .line 277
    .line 278
    invoke-direct {v11, v3, v6, v2}, Lo9/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v1, v11}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    iget v1, v10, Ll3/b;->a:I

    .line 285
    .line 286
    if-ne v1, v8, :cond_8

    .line 287
    .line 288
    iget-wide v1, v10, Ll3/b;->b:J

    .line 289
    .line 290
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    invoke-virtual/range {p1 .. p1}, Lk3/s;->c()[B

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    if-eqz v1, :cond_7

    .line 299
    .line 300
    move v3, v8

    .line 301
    :cond_7
    if-eqz v3, :cond_0

    .line 302
    .line 303
    iget-object v1, v6, Lq3/k;->f:Ls3/b;

    .line 304
    .line 305
    new-instance v2, Le;

    .line 306
    .line 307
    const/4 v3, 0x3

    .line 308
    invoke-direct {v2, v6, v3}, Le;-><init>(Ljava/lang/Object;I)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v1, v2}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :cond_8
    const/4 v3, 0x4

    .line 317
    if-ne v1, v3, :cond_0

    .line 318
    .line 319
    new-instance v1, Ljava/util/HashMap;

    .line 320
    .line 321
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_a

    .line 333
    .line 334
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    check-cast v3, Lr3/i;

    .line 339
    .line 340
    invoke-virtual {v3}, Lr3/i;->a()Lk3/n;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-virtual {v3}, Lk3/n;->k()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    if-nez v10, :cond_9

    .line 353
    .line 354
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v10

    .line 358
    goto :goto_5

    .line 359
    :cond_9
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    check-cast v10, Ljava/lang/Integer;

    .line 364
    .line 365
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    add-int/2addr v10, v8

    .line 370
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    :goto_5
    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_a
    iget-object v2, v6, Lq3/k;->f:Ls3/b;

    .line 379
    .line 380
    new-instance v3, Lk1/a;

    .line 381
    .line 382
    invoke-direct {v3, v9, v6, v1}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v2, v3}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_b
    iget-object v0, v6, Lq3/k;->f:Ls3/b;

    .line 391
    .line 392
    new-instance v1, Lq3/j;

    .line 393
    .line 394
    invoke-direct {v1, v6, v7, v4, v5}, Lq3/j;-><init>(Lq3/k;Lk3/s;J)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v0, v1}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    return-void
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
