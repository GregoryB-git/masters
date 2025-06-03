.class public final Li9/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/database/sqlite/SQLiteDatabase;

.field public final b:Li9/i;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;Li9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p2, p0, Li9/h1;->b:Li9/i;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    new-instance v1, Li9/d1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Li9/d1;-><init>(Li9/h1;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "SELECT target_id, target_proto FROM targets"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1, v0}, Ln9/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_1
    throw v1
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

.method public final b([Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 6

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", "

    .line 8
    .line 9
    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "]"

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    move v3, v2

    .line 22
    :goto_0
    array-length v4, p1

    .line 23
    if-ge v2, v4, :cond_3

    .line 24
    .line 25
    aget-object v4, p1, v2

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Li9/h1;->e(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    move v3, v5

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    if-eq v5, v3, :cond_2

    .line 36
    .line 37
    const-string p2, "Expected all of "

    .line 38
    .line 39
    const-string v2, " to either exist or not, but "

    .line 40
    .line 41
    invoke-static {p2, v0, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    aget-object p1, p1, v1

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, " exists and "

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, " does not"

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    aget-object p1, p1, v1

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p1, " does not exist and "

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p1, " does"

    .line 81
    .line 82
    :goto_1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p2

    .line 95
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    if-nez v3, :cond_4

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    const-string p1, "Skipping migration because all of "

    .line 105
    .line 106
    const-string p2, " already exist"

    .line 107
    .line 108
    invoke-static {p1, v0, p2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-array p2, v1, [Ljava/lang/Object;

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    const-string v1, "SQLiteSchema"

    .line 116
    .line 117
    invoke-static {v0, v1, p1, p2}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    return-void
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
.end method

.method public final c(I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const/4 v4, 0x3

    .line 10
    const-string v5, "target_globals"

    .line 11
    .line 12
    const-string v6, "targets"

    .line 13
    .line 14
    const-string v7, "target_documents"

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    const-string v10, "remote_documents"

    .line 19
    .line 20
    if-ge v0, v9, :cond_0

    .line 21
    .line 22
    const-string v11, "mutation_queues"

    .line 23
    .line 24
    const-string v12, "mutations"

    .line 25
    .line 26
    const-string v13, "document_mutations"

    .line 27
    .line 28
    filled-new-array {v11, v12, v13}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    new-instance v12, Li9/c1;

    .line 33
    .line 34
    invoke-direct {v12, v1, v4}, Li9/c1;-><init>(Li9/h1;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v11, v12}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {v6, v5, v7}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    new-instance v12, Li9/c1;

    .line 45
    .line 46
    invoke-direct {v12, v1, v8}, Li9/c1;-><init>(Li9/h1;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v11, v12}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v10}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    new-instance v12, Li9/f1;

    .line 57
    .line 58
    invoke-direct {v12, v1, v8}, Li9/f1;-><init>(Li9/h1;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v11, v12}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    if-ge v0, v4, :cond_4

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {v1, v6}, Li9/h1;->e(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    if-eqz v11, :cond_1

    .line 73
    .line 74
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 75
    .line 76
    const-string v12, "DROP TABLE targets"

    .line 77
    .line 78
    invoke-virtual {v11, v12}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {v1, v5}, Li9/h1;->e(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-eqz v11, :cond_2

    .line 86
    .line 87
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 88
    .line 89
    const-string v12, "DROP TABLE target_globals"

    .line 90
    .line 91
    invoke-virtual {v11, v12}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual {v1, v7}, Li9/h1;->e(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_3

    .line 99
    .line 100
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 101
    .line 102
    const-string v12, "DROP TABLE target_documents"

    .line 103
    .line 104
    invoke-virtual {v11, v12}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    filled-new-array {v6, v5, v7}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    new-instance v12, Li9/c1;

    .line 112
    .line 113
    invoke-direct {v12, v1, v8}, Li9/c1;-><init>(Li9/h1;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v11, v12}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    const/4 v11, 0x4

    .line 120
    const/4 v12, 0x0

    .line 121
    if-ge v0, v11, :cond_8

    .line 122
    .line 123
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 124
    .line 125
    invoke-static {v11, v5}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    const-wide/16 v15, 0x1

    .line 130
    .line 131
    cmp-long v11, v13, v15

    .line 132
    .line 133
    if-nez v11, :cond_5

    .line 134
    .line 135
    move v11, v9

    .line 136
    goto :goto_0

    .line 137
    :cond_5
    move v11, v8

    .line 138
    :goto_0
    if-nez v11, :cond_6

    .line 139
    .line 140
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 141
    .line 142
    const-string v13, "0"

    .line 143
    .line 144
    filled-new-array {v13, v13, v13, v13}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    const-string v14, "INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)"

    .line 149
    .line 150
    invoke-virtual {v11, v14, v13}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    const-string v11, "target_count"

    .line 154
    .line 155
    invoke-virtual {v1, v5, v11}, Li9/h1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_7

    .line 160
    .line 161
    iget-object v13, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 162
    .line 163
    const-string v14, "ALTER TABLE target_globals ADD COLUMN target_count INTEGER"

    .line 164
    .line 165
    invoke-virtual {v13, v14}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    iget-object v13, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 169
    .line 170
    invoke-static {v13, v6}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 171
    .line 172
    .line 173
    move-result-wide v13

    .line 174
    new-instance v6, Landroid/content/ContentValues;

    .line 175
    .line 176
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-virtual {v6, v11, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 184
    .line 185
    .line 186
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 187
    .line 188
    invoke-virtual {v11, v5, v6, v12, v12}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    :cond_8
    const/4 v5, 0x5

    .line 192
    if-ge v0, v5, :cond_9

    .line 193
    .line 194
    const-string v5, "sequence_number"

    .line 195
    .line 196
    invoke-virtual {v1, v7, v5}, Li9/h1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_9

    .line 201
    .line 202
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 203
    .line 204
    const-string v6, "ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER"

    .line 205
    .line 206
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_9
    const/4 v5, 0x6

    .line 210
    if-ge v0, v5, :cond_c

    .line 211
    .line 212
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 213
    .line 214
    new-instance v6, Li9/m;

    .line 215
    .line 216
    invoke-direct {v6, v1, v4}, Li9/m;-><init>(Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    const-string v7, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues"

    .line 220
    .line 221
    invoke-virtual {v5, v7, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    :goto_1
    :try_start_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-eqz v7, :cond_a

    .line 230
    .line 231
    invoke-virtual {v6, v5}, Li9/m;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_a
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    move-object v2, v0

    .line 241
    if-eqz v5, :cond_b

    .line 242
    .line 243
    :try_start_1
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    move-object v3, v0

    .line 249
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :cond_b
    :goto_2
    throw v2

    .line 253
    :cond_c
    :goto_3
    const/4 v5, 0x7

    .line 254
    const/16 v6, 0x64

    .line 255
    .line 256
    const/4 v7, 0x2

    .line 257
    if-ge v0, v5, :cond_14

    .line 258
    .line 259
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 260
    .line 261
    const-string v11, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1"

    .line 262
    .line 263
    invoke-virtual {v5, v11, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    if-eqz v11, :cond_d

    .line 272
    .line 273
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v13

    .line 277
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 278
    .line 279
    .line 280
    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 281
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_d
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 286
    .line 287
    .line 288
    move-object v11, v12

    .line 289
    :goto_4
    if-eqz v11, :cond_e

    .line 290
    .line 291
    move v5, v9

    .line 292
    goto :goto_5

    .line 293
    :cond_e
    move v5, v8

    .line 294
    :goto_5
    new-array v13, v8, [Ljava/lang/Object;

    .line 295
    .line 296
    const-string v14, "Missing highest sequence number"

    .line 297
    .line 298
    invoke-static {v14, v5, v13}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 302
    .line 303
    .line 304
    move-result-wide v13

    .line 305
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 306
    .line 307
    const-string v11, "INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)"

    .line 308
    .line 309
    invoke-virtual {v5, v11}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget-object v11, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 314
    .line 315
    new-array v15, v9, [Ljava/lang/Object;

    .line 316
    .line 317
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v16

    .line 321
    aput-object v16, v15, v8

    .line 322
    .line 323
    new-instance v4, Lu1/b;

    .line 324
    .line 325
    invoke-direct {v4, v15, v9}, Lu1/b;-><init>(Ljava/lang/Object;I)V

    .line 326
    .line 327
    .line 328
    new-array v15, v9, [Z

    .line 329
    .line 330
    :goto_6
    aput-boolean v8, v15, v8

    .line 331
    .line 332
    const-string v6, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?"

    .line 333
    .line 334
    invoke-virtual {v11, v4, v6, v12, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    :goto_7
    :try_start_3
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 339
    .line 340
    .line 341
    move-result v17

    .line 342
    if-eqz v17, :cond_10

    .line 343
    .line 344
    aput-boolean v9, v15, v8

    .line 345
    .line 346
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 347
    .line 348
    .line 349
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    invoke-virtual {v5, v9, v12}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5, v7, v13, v14}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    .line 360
    .line 361
    .line 362
    move-result-wide v18

    .line 363
    const-wide/16 v20, -0x1

    .line 364
    .line 365
    cmp-long v12, v18, v20

    .line 366
    .line 367
    if-eqz v12, :cond_f

    .line 368
    .line 369
    move v12, v9

    .line 370
    goto :goto_8

    .line 371
    :cond_f
    move v12, v8

    .line 372
    :goto_8
    new-array v7, v8, [Ljava/lang/Object;

    .line 373
    .line 374
    const-string v9, "Failed to insert a sentinel row"

    .line 375
    .line 376
    invoke-static {v9, v12, v7}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 377
    .line 378
    .line 379
    const/4 v7, 0x2

    .line 380
    const/4 v9, 0x1

    .line 381
    const/4 v12, 0x0

    .line 382
    goto :goto_7

    .line 383
    :cond_10
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 384
    .line 385
    .line 386
    aget-boolean v6, v15, v8

    .line 387
    .line 388
    if-nez v6, :cond_11

    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_11
    const/16 v6, 0x64

    .line 392
    .line 393
    const/4 v7, 0x2

    .line 394
    const/4 v9, 0x1

    .line 395
    const/4 v12, 0x0

    .line 396
    goto :goto_6

    .line 397
    :catchall_2
    move-exception v0

    .line 398
    move-object v2, v0

    .line 399
    if-eqz v6, :cond_12

    .line 400
    .line 401
    :try_start_4
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 402
    .line 403
    .line 404
    goto :goto_9

    .line 405
    :catchall_3
    move-exception v0

    .line 406
    move-object v3, v0

    .line 407
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    :cond_12
    :goto_9
    throw v2

    .line 411
    :catchall_4
    move-exception v0

    .line 412
    move-object v2, v0

    .line 413
    if-eqz v5, :cond_13

    .line 414
    .line 415
    :try_start_5
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 416
    .line 417
    .line 418
    goto :goto_a

    .line 419
    :catchall_5
    move-exception v0

    .line 420
    move-object v3, v0

    .line 421
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    :cond_13
    :goto_a
    throw v2

    .line 425
    :cond_14
    :goto_b
    const/16 v4, 0x8

    .line 426
    .line 427
    if-ge v0, v4, :cond_19

    .line 428
    .line 429
    const-string v4, "collection_parents"

    .line 430
    .line 431
    filled-new-array {v4}, [Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    new-instance v5, Li9/f1;

    .line 436
    .line 437
    const/4 v6, 0x1

    .line 438
    invoke-direct {v5, v1, v6}, Li9/f1;-><init>(Li9/h1;I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v4, v5}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 442
    .line 443
    .line 444
    new-instance v4, Li9/s$a;

    .line 445
    .line 446
    invoke-direct {v4}, Li9/s$a;-><init>()V

    .line 447
    .line 448
    .line 449
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 450
    .line 451
    const-string v6, "INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"

    .line 452
    .line 453
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    new-instance v6, Li9/g1;

    .line 458
    .line 459
    invoke-direct {v6, v8, v4, v5}, Li9/g1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 463
    .line 464
    const-string v5, "SELECT path FROM remote_documents"

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    invoke-virtual {v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    :goto_c
    :try_start_6
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    if-eqz v5, :cond_15

    .line 476
    .line 477
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    invoke-static {v5}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    invoke-virtual {v5}, Lj9/e;->s()Lj9/e;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    check-cast v5, Lj9/o;

    .line 490
    .line 491
    invoke-virtual {v6, v5}, Li9/g1;->accept(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 492
    .line 493
    .line 494
    goto :goto_c

    .line 495
    :cond_15
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 496
    .line 497
    .line 498
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 499
    .line 500
    new-instance v5, Li9/t;

    .line 501
    .line 502
    const/4 v7, 0x2

    .line 503
    invoke-direct {v5, v6, v7}, Li9/t;-><init>(Ljava/lang/Object;I)V

    .line 504
    .line 505
    .line 506
    const-string v6, "SELECT path FROM document_mutations"

    .line 507
    .line 508
    const/4 v7, 0x0

    .line 509
    invoke-virtual {v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    :goto_d
    :try_start_7
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    if-eqz v6, :cond_16

    .line 518
    .line 519
    invoke-virtual {v5, v4}, Li9/t;->accept(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 520
    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_16
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 524
    .line 525
    .line 526
    goto :goto_10

    .line 527
    :catchall_6
    move-exception v0

    .line 528
    move-object v2, v0

    .line 529
    if-eqz v4, :cond_17

    .line 530
    .line 531
    :try_start_8
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 532
    .line 533
    .line 534
    goto :goto_e

    .line 535
    :catchall_7
    move-exception v0

    .line 536
    move-object v3, v0

    .line 537
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    :cond_17
    :goto_e
    throw v2

    .line 541
    :catchall_8
    move-exception v0

    .line 542
    move-object v2, v0

    .line 543
    if-eqz v4, :cond_18

    .line 544
    .line 545
    :try_start_9
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 546
    .line 547
    .line 548
    goto :goto_f

    .line 549
    :catchall_9
    move-exception v0

    .line 550
    move-object v3, v0

    .line 551
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 552
    .line 553
    .line 554
    :cond_18
    :goto_f
    throw v2

    .line 555
    :cond_19
    :goto_10
    const/16 v4, 0x9

    .line 556
    .line 557
    if-ge v0, v4, :cond_1d

    .line 558
    .line 559
    const-string v5, "read_time_seconds"

    .line 560
    .line 561
    invoke-virtual {v1, v10, v5}, Li9/h1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    const-string v6, "read_time_nanos"

    .line 566
    .line 567
    invoke-virtual {v1, v10, v6}, Li9/h1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    if-ne v5, v6, :cond_1a

    .line 572
    .line 573
    const/4 v7, 0x1

    .line 574
    goto :goto_11

    .line 575
    :cond_1a
    move v7, v8

    .line 576
    :goto_11
    new-array v9, v8, [Ljava/lang/Object;

    .line 577
    .line 578
    const-string v11, "Table contained just one of read_time_seconds or read_time_nanos"

    .line 579
    .line 580
    invoke-static {v11, v7, v9}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    if-eqz v5, :cond_1b

    .line 584
    .line 585
    if-eqz v6, :cond_1b

    .line 586
    .line 587
    const/4 v5, 0x1

    .line 588
    goto :goto_12

    .line 589
    :cond_1b
    move v5, v8

    .line 590
    :goto_12
    if-nez v5, :cond_1c

    .line 591
    .line 592
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 593
    .line 594
    const-string v6, "ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER"

    .line 595
    .line 596
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    iget-object v5, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 600
    .line 601
    const-string v6, "ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER"

    .line 602
    .line 603
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_13

    .line 607
    :cond_1c
    invoke-virtual/range {p0 .. p0}, Li9/h1;->a()V

    .line 608
    .line 609
    .line 610
    :cond_1d
    :goto_13
    if-ne v0, v4, :cond_1e

    .line 611
    .line 612
    invoke-virtual/range {p0 .. p0}, Li9/h1;->a()V

    .line 613
    .line 614
    .line 615
    :cond_1e
    const/16 v4, 0xb

    .line 616
    .line 617
    if-ge v0, v4, :cond_21

    .line 618
    .line 619
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 620
    .line 621
    new-instance v5, Li9/d1;

    .line 622
    .line 623
    invoke-direct {v5, v1, v8}, Li9/d1;-><init>(Li9/h1;I)V

    .line 624
    .line 625
    .line 626
    const-string v6, "SELECT target_id, target_proto FROM targets"

    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    invoke-virtual {v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    :goto_14
    :try_start_a
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 634
    .line 635
    .line 636
    move-result v6

    .line 637
    if-eqz v6, :cond_1f

    .line 638
    .line 639
    invoke-virtual {v5, v4}, Li9/d1;->accept(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 640
    .line 641
    .line 642
    goto :goto_14

    .line 643
    :cond_1f
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 644
    .line 645
    .line 646
    goto :goto_16

    .line 647
    :catchall_a
    move-exception v0

    .line 648
    move-object v2, v0

    .line 649
    if-eqz v4, :cond_20

    .line 650
    .line 651
    :try_start_b
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 652
    .line 653
    .line 654
    goto :goto_15

    .line 655
    :catchall_b
    move-exception v0

    .line 656
    move-object v3, v0

    .line 657
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 658
    .line 659
    .line 660
    :cond_20
    :goto_15
    throw v2

    .line 661
    :cond_21
    :goto_16
    const/16 v4, 0xc

    .line 662
    .line 663
    if-ge v0, v4, :cond_22

    .line 664
    .line 665
    const-string v4, "bundles"

    .line 666
    .line 667
    const-string v5, "named_queries"

    .line 668
    .line 669
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    new-instance v5, Li9/c1;

    .line 674
    .line 675
    const/4 v6, 0x2

    .line 676
    invoke-direct {v5, v1, v6}, Li9/c1;-><init>(Li9/h1;I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v4, v5}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 680
    .line 681
    .line 682
    :cond_22
    const/16 v4, 0xd

    .line 683
    .line 684
    if-ge v0, v4, :cond_27

    .line 685
    .line 686
    const-string v4, "path_length"

    .line 687
    .line 688
    invoke-virtual {v1, v10, v4}, Li9/h1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    if-nez v4, :cond_23

    .line 693
    .line 694
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 695
    .line 696
    const-string v5, "ALTER TABLE remote_documents ADD COLUMN path_length INTEGER"

    .line 697
    .line 698
    invoke-virtual {v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    :cond_23
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 702
    .line 703
    const/4 v5, 0x1

    .line 704
    new-array v6, v5, [Ljava/lang/Object;

    .line 705
    .line 706
    const/16 v7, 0x64

    .line 707
    .line 708
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    aput-object v7, v6, v8

    .line 713
    .line 714
    new-instance v7, Lu1/b;

    .line 715
    .line 716
    invoke-direct {v7, v6, v5}, Lu1/b;-><init>(Ljava/lang/Object;I)V

    .line 717
    .line 718
    .line 719
    iget-object v6, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 720
    .line 721
    const-string v9, "UPDATE remote_documents SET path_length = ? WHERE path = ?"

    .line 722
    .line 723
    invoke-virtual {v6, v9}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 724
    .line 725
    .line 726
    move-result-object v6

    .line 727
    new-array v9, v5, [Z

    .line 728
    .line 729
    :goto_17
    aput-boolean v8, v9, v8

    .line 730
    .line 731
    new-instance v10, Li9/r0;

    .line 732
    .line 733
    invoke-direct {v10, v5, v9, v6}, Li9/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    const-string v5, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?"

    .line 737
    .line 738
    const/4 v11, 0x0

    .line 739
    invoke-virtual {v4, v7, v5, v11, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    :goto_18
    :try_start_c
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 744
    .line 745
    .line 746
    move-result v12

    .line 747
    if-eqz v12, :cond_24

    .line 748
    .line 749
    invoke-virtual {v10, v5}, Li9/r0;->accept(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 750
    .line 751
    .line 752
    goto :goto_18

    .line 753
    :cond_24
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 754
    .line 755
    .line 756
    aget-boolean v5, v9, v8

    .line 757
    .line 758
    if-nez v5, :cond_25

    .line 759
    .line 760
    goto :goto_1a

    .line 761
    :cond_25
    const/4 v5, 0x1

    .line 762
    goto :goto_17

    .line 763
    :catchall_c
    move-exception v0

    .line 764
    move-object v2, v0

    .line 765
    if-eqz v5, :cond_26

    .line 766
    .line 767
    :try_start_d
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 768
    .line 769
    .line 770
    goto :goto_19

    .line 771
    :catchall_d
    move-exception v0

    .line 772
    move-object v3, v0

    .line 773
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 774
    .line 775
    .line 776
    :cond_26
    :goto_19
    throw v2

    .line 777
    :cond_27
    :goto_1a
    const/16 v4, 0xe

    .line 778
    .line 779
    const/16 v5, 0xf

    .line 780
    .line 781
    if-ge v0, v4, :cond_28

    .line 782
    .line 783
    const-string v4, "document_overlays"

    .line 784
    .line 785
    filled-new-array {v4}, [Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    new-instance v6, Li9/e1;

    .line 790
    .line 791
    invoke-direct {v6, v1, v8}, Li9/e1;-><init>(Li9/h1;I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1, v4, v6}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 795
    .line 796
    .line 797
    const-string v4, "data_migrations"

    .line 798
    .line 799
    filled-new-array {v4}, [Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    new-instance v6, Lb/k;

    .line 804
    .line 805
    invoke-direct {v6, v1, v5}, Lb/k;-><init>(Ljava/lang/Object;I)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v1, v4, v6}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 809
    .line 810
    .line 811
    sget v4, Le9/a;->a:I

    .line 812
    .line 813
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 814
    .line 815
    const-string v6, "BUILD_OVERLAYS"

    .line 816
    .line 817
    filled-new-array {v6}, [Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    const-string v7, "INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)"

    .line 822
    .line 823
    invoke-virtual {v4, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    :cond_28
    if-ge v0, v5, :cond_29

    .line 827
    .line 828
    iget-object v4, v1, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 829
    .line 830
    const-string v5, "UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL"

    .line 831
    .line 832
    invoke-virtual {v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    :cond_29
    const/16 v4, 0x10

    .line 836
    .line 837
    if-ge v0, v4, :cond_2a

    .line 838
    .line 839
    const-string v4, "index_configuration"

    .line 840
    .line 841
    const-string v5, "index_state"

    .line 842
    .line 843
    const-string v6, "index_entries"

    .line 844
    .line 845
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    new-instance v5, Li9/c1;

    .line 850
    .line 851
    const/4 v6, 0x1

    .line 852
    invoke-direct {v5, v1, v6}, Li9/c1;-><init>(Li9/h1;I)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1, v4, v5}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 856
    .line 857
    .line 858
    goto :goto_1b

    .line 859
    :cond_2a
    const/4 v6, 0x1

    .line 860
    :goto_1b
    const/16 v4, 0x11

    .line 861
    .line 862
    if-ge v0, v4, :cond_2b

    .line 863
    .line 864
    const-string v5, "globals"

    .line 865
    .line 866
    filled-new-array {v5}, [Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    new-instance v7, Li9/e1;

    .line 871
    .line 872
    invoke-direct {v7, v1, v6}, Li9/e1;-><init>(Li9/h1;I)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v5, v7}, Li9/h1;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 876
    .line 877
    .line 878
    :cond_2b
    const/4 v5, 0x3

    .line 879
    new-array v5, v5, [Ljava/lang/Object;

    .line 880
    .line 881
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    aput-object v0, v5, v8

    .line 886
    .line 887
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    aput-object v0, v5, v6

    .line 892
    .line 893
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 894
    .line 895
    .line 896
    move-result-wide v7

    .line 897
    sub-long/2addr v7, v2

    .line 898
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    const/4 v2, 0x2

    .line 903
    aput-object v0, v5, v2

    .line 904
    .line 905
    const-string v0, "SQLiteSchema"

    .line 906
    .line 907
    const-string v2, "Migration from version %s to %s took %s milliseconds"

    .line 908
    .line 909
    invoke-static {v6, v0, v2, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    return-void
    .line 913
    .line 914
    .line 915
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, p0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v4, "PRAGMA table_info("

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, ")"

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v2, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string p1, "name"

    .line 36
    .line 37
    invoke-interface {v1, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/4 p2, -0x1

    .line 63
    if-eq p1, p2, :cond_1

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 p1, 0x0

    .line 68
    :goto_1
    return p1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 73
    .line 74
    .line 75
    :cond_2
    throw p1
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

.method public final e(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-object p1, v2, v3

    .line 8
    .line 9
    new-instance p1, Lu1/b;

    .line 10
    .line 11
    invoke-direct {p1, v2, v1}, Lu1/b;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?"

    .line 16
    .line 17
    invoke-virtual {v0, p1, v3, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    xor-int/2addr v0, v1

    .line 26
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 27
    .line 28
    .line 29
    xor-int/lit8 p1, v0, 0x1

    .line 30
    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    :goto_0
    throw v0
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
