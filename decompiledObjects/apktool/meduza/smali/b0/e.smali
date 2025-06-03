.class public final Lb0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/e$a;,
        Lb0/e$c;,
        Lb0/e$b;
    }
.end annotation


# static fields
.field public static final a:Lb0/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb0/d;-><init>(I)V

    sput-object v0, Lb0/e;->a:Lb0/d;

    return-void
.end method

.method public static a(Landroid/content/Context;Lb0/g;)Lb0/m;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v1, Lb0/g;->a:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    if-eqz v6, :cond_12

    .line 21
    .line 22
    iget-object v7, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v8, v1, Lb0/g;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_11

    .line 31
    .line 32
    iget-object v4, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 33
    .line 34
    const/16 v7, 0x40

    .line 35
    .line 36
    invoke-virtual {v2, v4, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    array-length v7, v2

    .line 48
    move v8, v5

    .line 49
    :goto_0
    if-ge v8, v7, :cond_0

    .line 50
    .line 51
    aget-object v9, v2, v8

    .line 52
    .line 53
    invoke-virtual {v9}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object v2, Lb0/e;->a:Lb0/d;

    .line 64
    .line 65
    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, Lb0/g;->d:Ljava/util/List;

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v3, v5}, Lw/d;->b(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_1
    move v3, v5

    .line 78
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x1

    .line 84
    if-ge v3, v7, :cond_6

    .line 85
    .line 86
    new-instance v7, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    check-cast v10, Ljava/util/Collection;

    .line 93
    .line 94
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    sget-object v10, Lb0/e;->a:Lb0/d;

    .line 98
    .line 99
    invoke-static {v7, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eq v10, v11, :cond_2

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_2
    move v10, v5

    .line 114
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-ge v10, v11, :cond_4

    .line 119
    .line 120
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    check-cast v11, [B

    .line 125
    .line 126
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    check-cast v12, [B

    .line 131
    .line 132
    invoke-static {v11, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-nez v11, :cond_3

    .line 137
    .line 138
    :goto_4
    move v7, v5

    .line 139
    goto :goto_5

    .line 140
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    move v7, v9

    .line 144
    :goto_5
    if-eqz v7, :cond_5

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    move-object v6, v8

    .line 151
    :goto_6
    if-nez v6, :cond_7

    .line 152
    .line 153
    new-instance v0, Lb0/m;

    .line 154
    .line 155
    invoke-direct {v0, v9, v8}, Lb0/m;-><init>(I[Lb0/n;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_7
    iget-object v2, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v4, Landroid/net/Uri$Builder;

    .line 167
    .line 168
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v6, "content"

    .line 172
    .line 173
    invoke-virtual {v4, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v7, Landroid/net/Uri$Builder;

    .line 186
    .line 187
    invoke-direct {v7}, Landroid/net/Uri$Builder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v6, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v6, "file"

    .line 199
    .line 200
    invoke-virtual {v2, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    const/16 v7, 0x18

    .line 211
    .line 212
    if-ge v6, v7, :cond_8

    .line 213
    .line 214
    new-instance v6, Lb0/e$b;

    .line 215
    .line 216
    invoke-direct {v6, v0, v4}, Lb0/e$b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_8
    new-instance v6, Lb0/e$c;

    .line 221
    .line 222
    invoke-direct {v6, v0, v4}, Lb0/e$c;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 223
    .line 224
    .line 225
    :goto_7
    :try_start_0
    const-string v10, "_id"

    .line 226
    .line 227
    const-string v11, "file_id"

    .line 228
    .line 229
    const-string v12, "font_ttc_index"

    .line 230
    .line 231
    const-string v13, "font_variation_settings"

    .line 232
    .line 233
    const-string v14, "font_weight"

    .line 234
    .line 235
    const-string v15, "font_italic"

    .line 236
    .line 237
    const-string v16, "result_code"

    .line 238
    .line 239
    filled-new-array/range {v10 .. v16}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    new-array v7, v9, [Ljava/lang/String;

    .line 244
    .line 245
    iget-object v1, v1, Lb0/g;->c:Ljava/lang/String;

    .line 246
    .line 247
    aput-object v1, v7, v5

    .line 248
    .line 249
    invoke-interface {v6, v4, v0, v7}, Lb0/e$a;->a(Landroid/net/Uri;[Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    if-eqz v8, :cond_e

    .line 254
    .line 255
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-lez v0, :cond_e

    .line 260
    .line 261
    const-string v0, "result_code"

    .line 262
    .line 263
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    new-instance v3, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v1, "_id"

    .line 273
    .line 274
    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    const-string v7, "file_id"

    .line 279
    .line 280
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    const-string v10, "font_ttc_index"

    .line 285
    .line 286
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    const-string v11, "font_weight"

    .line 291
    .line 292
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    const-string v12, "font_italic"

    .line 297
    .line 298
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v12

    .line 302
    :goto_8
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    if-eqz v13, :cond_e

    .line 307
    .line 308
    const/4 v13, -0x1

    .line 309
    if-eq v0, v13, :cond_9

    .line 310
    .line 311
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    move/from16 v20, v14

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_9
    move/from16 v20, v5

    .line 319
    .line 320
    :goto_9
    if-eq v10, v13, :cond_a

    .line 321
    .line 322
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    move/from16 v17, v14

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_a
    move/from16 v17, v5

    .line 330
    .line 331
    :goto_a
    if-ne v7, v13, :cond_b

    .line 332
    .line 333
    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 334
    .line 335
    .line 336
    move-result-wide v14

    .line 337
    invoke-static {v4, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 338
    .line 339
    .line 340
    move-result-object v14

    .line 341
    goto :goto_b

    .line 342
    :cond_b
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 343
    .line 344
    .line 345
    move-result-wide v14

    .line 346
    invoke-static {v2, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 347
    .line 348
    .line 349
    move-result-object v14

    .line 350
    :goto_b
    move-object/from16 v16, v14

    .line 351
    .line 352
    if-eq v11, v13, :cond_c

    .line 353
    .line 354
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    goto :goto_c

    .line 359
    :cond_c
    const/16 v14, 0x190

    .line 360
    .line 361
    :goto_c
    move/from16 v18, v14

    .line 362
    .line 363
    if-eq v12, v13, :cond_d

    .line 364
    .line 365
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 366
    .line 367
    .line 368
    move-result v13

    .line 369
    if-ne v13, v9, :cond_d

    .line 370
    .line 371
    move/from16 v19, v9

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_d
    move/from16 v19, v5

    .line 375
    .line 376
    :goto_d
    new-instance v13, Lb0/n;

    .line 377
    .line 378
    move-object v15, v13

    .line 379
    invoke-direct/range {v15 .. v20}, Lb0/n;-><init>(Landroid/net/Uri;IIZI)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    .line 384
    .line 385
    goto :goto_8

    .line 386
    :cond_e
    if-eqz v8, :cond_f

    .line 387
    .line 388
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 389
    .line 390
    .line 391
    :cond_f
    invoke-interface {v6}, Lb0/e$a;->close()V

    .line 392
    .line 393
    .line 394
    new-array v0, v5, [Lb0/n;

    .line 395
    .line 396
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, [Lb0/n;

    .line 401
    .line 402
    new-instance v1, Lb0/m;

    .line 403
    .line 404
    invoke-direct {v1, v5, v0}, Lb0/m;-><init>(I[Lb0/n;)V

    .line 405
    .line 406
    .line 407
    return-object v1

    .line 408
    :catchall_0
    move-exception v0

    .line 409
    if-eqz v8, :cond_10

    .line 410
    .line 411
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 412
    .line 413
    .line 414
    :cond_10
    invoke-interface {v6}, Lb0/e$a;->close()V

    .line 415
    .line 416
    .line 417
    throw v0

    .line 418
    :cond_11
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 419
    .line 420
    const-string v2, "Found content provider "

    .line 421
    .line 422
    const-string v3, ", but package was not "

    .line 423
    .line 424
    invoke-static {v2, v4, v3}, Lf;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    iget-object v1, v1, Lb0/g;->b:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :cond_12
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 442
    .line 443
    const-string v1, "No package found for authority: "

    .line 444
    .line 445
    invoke-static {v1, v4}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v0
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
