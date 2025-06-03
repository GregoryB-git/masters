.class public abstract Lr5/j;
.super Lr5/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/j$a;
    }
.end annotation


# instance fields
.field public c:Lr5/j$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr5/o;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lr5/j$a;

    iput-object p1, p0, Lr5/j;->c:Lr5/j$a;

    return-void
.end method

.method public final c([Lv3/k1;Lz4/j0;)Lr5/p;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x1

    .line 7
    add-int/2addr v2, v3

    .line 8
    new-array v2, v2, [I

    .line 9
    .line 10
    array-length v4, v0

    .line 11
    add-int/2addr v4, v3

    .line 12
    new-array v5, v4, [[Lz4/i0;

    .line 13
    .line 14
    array-length v6, v0

    .line 15
    add-int/2addr v6, v3

    .line 16
    new-array v6, v6, [[[I

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    :goto_0
    if-ge v7, v4, :cond_0

    .line 20
    .line 21
    iget v8, v1, Lz4/j0;->a:I

    .line 22
    .line 23
    new-array v9, v8, [Lz4/i0;

    .line 24
    .line 25
    aput-object v9, v5, v7

    .line 26
    .line 27
    new-array v8, v8, [[I

    .line 28
    .line 29
    aput-object v8, v6, v7

    .line 30
    .line 31
    add-int/lit8 v7, v7, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    array-length v4, v0

    .line 35
    new-array v14, v4, [I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    :goto_1
    if-ge v7, v4, :cond_1

    .line 39
    .line 40
    aget-object v8, v0, v7

    .line 41
    .line 42
    invoke-interface {v8}, Lv3/k1;->o()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    aput v8, v14, v7

    .line 47
    .line 48
    add-int/lit8 v7, v7, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v4, 0x0

    .line 52
    :goto_2
    iget v7, v1, Lz4/j0;->a:I

    .line 53
    .line 54
    const/4 v15, 0x5

    .line 55
    if-ge v4, v7, :cond_a

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Lz4/j0;->a(I)Lz4/i0;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget v8, v7, Lz4/i0;->c:I

    .line 62
    .line 63
    if-ne v8, v15, :cond_2

    .line 64
    .line 65
    move v8, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    const/4 v8, 0x0

    .line 68
    :goto_3
    array-length v9, v0

    .line 69
    move v12, v3

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x0

    .line 72
    :goto_4
    array-length v15, v0

    .line 73
    if-ge v10, v15, :cond_7

    .line 74
    .line 75
    aget-object v15, v0, v10

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    :goto_5
    iget v1, v7, Lz4/i0;->a:I

    .line 80
    .line 81
    if-ge v13, v1, :cond_3

    .line 82
    .line 83
    iget-object v1, v7, Lz4/i0;->d:[Lv3/i0;

    .line 84
    .line 85
    aget-object v1, v1, v13

    .line 86
    .line 87
    invoke-interface {v15, v1}, Lv3/k1;->a(Lv3/i0;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    and-int/lit8 v1, v1, 0x7

    .line 92
    .line 93
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    add-int/lit8 v13, v13, 0x1

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_3
    aget v1, v2, v10

    .line 101
    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    goto :goto_6

    .line 106
    :cond_4
    const/4 v1, 0x0

    .line 107
    :goto_6
    if-gt v3, v11, :cond_5

    .line 108
    .line 109
    if-ne v3, v11, :cond_6

    .line 110
    .line 111
    if-eqz v8, :cond_6

    .line 112
    .line 113
    if-nez v12, :cond_6

    .line 114
    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    :cond_5
    move v12, v1

    .line 118
    move v11, v3

    .line 119
    move v9, v10

    .line 120
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 121
    .line 122
    move-object/from16 v1, p2

    .line 123
    .line 124
    const/4 v3, 0x1

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    array-length v1, v0

    .line 127
    if-ne v9, v1, :cond_8

    .line 128
    .line 129
    iget v1, v7, Lz4/i0;->a:I

    .line 130
    .line 131
    new-array v1, v1, [I

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_8
    aget-object v1, v0, v9

    .line 135
    .line 136
    iget v3, v7, Lz4/i0;->a:I

    .line 137
    .line 138
    new-array v3, v3, [I

    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    :goto_7
    iget v10, v7, Lz4/i0;->a:I

    .line 142
    .line 143
    if-ge v8, v10, :cond_9

    .line 144
    .line 145
    iget-object v10, v7, Lz4/i0;->d:[Lv3/i0;

    .line 146
    .line 147
    aget-object v10, v10, v8

    .line 148
    .line 149
    invoke-interface {v1, v10}, Lv3/k1;->a(Lv3/i0;)I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    aput v10, v3, v8

    .line 154
    .line 155
    add-int/lit8 v8, v8, 0x1

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_9
    move-object v1, v3

    .line 159
    :goto_8
    aget v3, v2, v9

    .line 160
    .line 161
    aget-object v8, v5, v9

    .line 162
    .line 163
    aput-object v7, v8, v3

    .line 164
    .line 165
    aget-object v7, v6, v9

    .line 166
    .line 167
    aput-object v1, v7, v3

    .line 168
    .line 169
    const/4 v1, 0x1

    .line 170
    add-int/2addr v3, v1

    .line 171
    aput v3, v2, v9

    .line 172
    .line 173
    add-int/lit8 v4, v4, 0x1

    .line 174
    .line 175
    move-object/from16 v1, p2

    .line 176
    .line 177
    const/4 v3, 0x1

    .line 178
    goto :goto_2

    .line 179
    :cond_a
    array-length v1, v0

    .line 180
    new-array v9, v1, [Lz4/j0;

    .line 181
    .line 182
    array-length v1, v0

    .line 183
    new-array v1, v1, [Ljava/lang/String;

    .line 184
    .line 185
    array-length v3, v0

    .line 186
    new-array v8, v3, [I

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    :goto_9
    array-length v4, v0

    .line 190
    if-ge v3, v4, :cond_b

    .line 191
    .line 192
    aget v4, v2, v3

    .line 193
    .line 194
    new-instance v7, Lz4/j0;

    .line 195
    .line 196
    aget-object v10, v5, v3

    .line 197
    .line 198
    invoke-static {v4, v10}, Lv5/e0;->K(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, [Lz4/i0;

    .line 203
    .line 204
    invoke-direct {v7, v10}, Lz4/j0;-><init>([Lz4/i0;)V

    .line 205
    .line 206
    .line 207
    aput-object v7, v9, v3

    .line 208
    .line 209
    aget-object v7, v6, v3

    .line 210
    .line 211
    invoke-static {v4, v7}, Lv5/e0;->K(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, [[I

    .line 216
    .line 217
    aput-object v4, v6, v3

    .line 218
    .line 219
    aget-object v4, v0, v3

    .line 220
    .line 221
    invoke-interface {v4}, Lv3/k1;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    aput-object v4, v1, v3

    .line 226
    .line 227
    aget-object v4, v0, v3

    .line 228
    .line 229
    check-cast v4, Lv3/f;

    .line 230
    .line 231
    iget v4, v4, Lv3/f;->a:I

    .line 232
    .line 233
    aput v4, v8, v3

    .line 234
    .line 235
    add-int/lit8 v3, v3, 0x1

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_b
    array-length v1, v0

    .line 239
    aget v1, v2, v1

    .line 240
    .line 241
    new-instance v12, Lz4/j0;

    .line 242
    .line 243
    array-length v0, v0

    .line 244
    aget-object v0, v5, v0

    .line 245
    .line 246
    invoke-static {v1, v0}, Lv5/e0;->K(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, [Lz4/i0;

    .line 251
    .line 252
    invoke-direct {v12, v0}, Lz4/j0;-><init>([Lz4/i0;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Lr5/j$a;

    .line 256
    .line 257
    move-object v7, v0

    .line 258
    move-object v10, v14

    .line 259
    move-object v11, v6

    .line 260
    invoke-direct/range {v7 .. v12}, Lr5/j$a;-><init>([I[Lz4/j0;[I[[[ILz4/j0;)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v1, p0

    .line 264
    .line 265
    check-cast v1, Lr5/f;

    .line 266
    .line 267
    iget-object v2, v1, Lr5/f;->d:Ljava/lang/Object;

    .line 268
    .line 269
    monitor-enter v2

    .line 270
    :try_start_0
    iget-object v3, v1, Lr5/f;->g:Lr5/f$c;

    .line 271
    .line 272
    iget-boolean v4, v3, Lr5/f$c;->s0:Z

    .line 273
    .line 274
    const/16 v5, 0x20

    .line 275
    .line 276
    if-eqz v4, :cond_c

    .line 277
    .line 278
    sget v4, Lv5/e0;->a:I

    .line 279
    .line 280
    if-lt v4, v5, :cond_c

    .line 281
    .line 282
    iget-object v4, v1, Lr5/f;->h:Lr5/f$f;

    .line 283
    .line 284
    if-eqz v4, :cond_c

    .line 285
    .line 286
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-static {v7}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v1, v7}, Lr5/f$f;->b(Lr5/f;Landroid/os/Looper;)V

    .line 294
    .line 295
    .line 296
    :cond_c
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    iget v2, v0, Lr5/j$a;->a:I

    .line 298
    .line 299
    new-array v4, v2, [Lr5/h$a;

    .line 300
    .line 301
    new-instance v7, Lk1/a;

    .line 302
    .line 303
    const/16 v8, 0x8

    .line 304
    .line 305
    invoke-direct {v7, v8, v3, v14}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    new-instance v8, Lr5/c;

    .line 309
    .line 310
    const/4 v9, 0x1

    .line 311
    invoke-direct {v8, v9}, Lr5/c;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const/4 v9, 0x2

    .line 315
    invoke-static {v9, v0, v6, v7, v8}, Lr5/f;->l(ILr5/j$a;[[[ILr5/f$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    if-eqz v7, :cond_d

    .line 320
    .line 321
    iget-object v8, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v8, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v7, Lr5/h$a;

    .line 332
    .line 333
    aput-object v7, v4, v8

    .line 334
    .line 335
    :cond_d
    const/4 v7, 0x0

    .line 336
    :goto_a
    iget v8, v0, Lr5/j$a;->a:I

    .line 337
    .line 338
    if-ge v7, v8, :cond_f

    .line 339
    .line 340
    iget-object v8, v0, Lr5/j$a;->b:[I

    .line 341
    .line 342
    aget v8, v8, v7

    .line 343
    .line 344
    if-ne v9, v8, :cond_e

    .line 345
    .line 346
    iget-object v8, v0, Lr5/j$a;->c:[Lz4/j0;

    .line 347
    .line 348
    aget-object v8, v8, v7

    .line 349
    .line 350
    iget v8, v8, Lz4/j0;->a:I

    .line 351
    .line 352
    if-lez v8, :cond_e

    .line 353
    .line 354
    const/4 v7, 0x1

    .line 355
    goto :goto_b

    .line 356
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_f
    const/4 v7, 0x0

    .line 360
    :goto_b
    new-instance v8, Lr5/d;

    .line 361
    .line 362
    invoke-direct {v8, v1, v3, v7}, Lr5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 363
    .line 364
    .line 365
    new-instance v7, Lv4/d;

    .line 366
    .line 367
    const/4 v10, 0x4

    .line 368
    invoke-direct {v7, v10}, Lv4/d;-><init>(I)V

    .line 369
    .line 370
    .line 371
    const/4 v11, 0x1

    .line 372
    invoke-static {v11, v0, v6, v8, v7}, Lr5/f;->l(ILr5/j$a;[[[ILr5/f$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    if-eqz v7, :cond_10

    .line 377
    .line 378
    iget-object v8, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v8, Ljava/lang/Integer;

    .line 381
    .line 382
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    iget-object v11, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v11, Lr5/h$a;

    .line 389
    .line 390
    aput-object v11, v4, v8

    .line 391
    .line 392
    :cond_10
    if-nez v7, :cond_11

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    goto :goto_c

    .line 396
    :cond_11
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v7, Lr5/h$a;

    .line 399
    .line 400
    iget-object v11, v7, Lr5/h$a;->a:Lz4/i0;

    .line 401
    .line 402
    iget-object v7, v7, Lr5/h$a;->b:[I

    .line 403
    .line 404
    const/4 v12, 0x0

    .line 405
    aget v7, v7, v12

    .line 406
    .line 407
    iget-object v11, v11, Lz4/i0;->d:[Lv3/i0;

    .line 408
    .line 409
    aget-object v7, v11, v7

    .line 410
    .line 411
    iget-object v7, v7, Lv3/i0;->c:Ljava/lang/String;

    .line 412
    .line 413
    :goto_c
    new-instance v11, Lo9/l;

    .line 414
    .line 415
    invoke-direct {v11, v15, v3, v7}, Lo9/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    new-instance v7, Lv4/d;

    .line 419
    .line 420
    const/4 v12, 0x3

    .line 421
    invoke-direct {v7, v12}, Lv4/d;-><init>(I)V

    .line 422
    .line 423
    .line 424
    invoke-static {v12, v0, v6, v11, v7}, Lr5/f;->l(ILr5/j$a;[[[ILr5/f$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    if-eqz v7, :cond_12

    .line 429
    .line 430
    iget-object v11, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v11, Ljava/lang/Integer;

    .line 433
    .line 434
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v7, Lr5/h$a;

    .line 441
    .line 442
    aput-object v7, v4, v11

    .line 443
    .line 444
    :cond_12
    const/4 v7, 0x0

    .line 445
    :goto_d
    if-ge v7, v2, :cond_1a

    .line 446
    .line 447
    iget-object v11, v0, Lr5/j$a;->b:[I

    .line 448
    .line 449
    aget v11, v11, v7

    .line 450
    .line 451
    if-eq v11, v9, :cond_19

    .line 452
    .line 453
    const/4 v13, 0x1

    .line 454
    if-eq v11, v13, :cond_19

    .line 455
    .line 456
    if-eq v11, v12, :cond_19

    .line 457
    .line 458
    iget-object v11, v0, Lr5/j$a;->c:[Lz4/j0;

    .line 459
    .line 460
    aget-object v11, v11, v7

    .line 461
    .line 462
    aget-object v13, v6, v7

    .line 463
    .line 464
    const/4 v12, 0x0

    .line 465
    const/4 v14, 0x0

    .line 466
    const/4 v15, 0x0

    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    :goto_e
    iget v10, v11, Lz4/j0;->a:I

    .line 470
    .line 471
    if-ge v14, v10, :cond_17

    .line 472
    .line 473
    invoke-virtual {v11, v14}, Lz4/j0;->a(I)Lz4/i0;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    aget-object v18, v13, v14

    .line 478
    .line 479
    move-object/from16 v9, v17

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    :goto_f
    iget v8, v10, Lz4/i0;->a:I

    .line 483
    .line 484
    if-ge v5, v8, :cond_16

    .line 485
    .line 486
    aget v8, v18, v5

    .line 487
    .line 488
    move-object/from16 v20, v11

    .line 489
    .line 490
    iget-boolean v11, v3, Lr5/f$c;->t0:Z

    .line 491
    .line 492
    invoke-static {v8, v11}, Lr5/f;->i(IZ)Z

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    if-eqz v8, :cond_14

    .line 497
    .line 498
    iget-object v8, v10, Lz4/i0;->d:[Lv3/i0;

    .line 499
    .line 500
    aget-object v8, v8, v5

    .line 501
    .line 502
    new-instance v11, Lr5/f$b;

    .line 503
    .line 504
    move-object/from16 v21, v10

    .line 505
    .line 506
    aget v10, v18, v5

    .line 507
    .line 508
    invoke-direct {v11, v8, v10}, Lr5/f$b;-><init>(Lv3/i0;I)V

    .line 509
    .line 510
    .line 511
    if-eqz v9, :cond_13

    .line 512
    .line 513
    sget-object v8, Lo7/n;->a:Lo7/n$a;

    .line 514
    .line 515
    iget-boolean v10, v11, Lr5/f$b;->b:Z

    .line 516
    .line 517
    move-object/from16 v22, v12

    .line 518
    .line 519
    iget-boolean v12, v9, Lr5/f$b;->b:Z

    .line 520
    .line 521
    invoke-virtual {v8, v10, v12}, Lo7/n$a;->c(ZZ)Lo7/n;

    .line 522
    .line 523
    .line 524
    move-result-object v8

    .line 525
    iget-boolean v10, v11, Lr5/f$b;->a:Z

    .line 526
    .line 527
    iget-boolean v12, v9, Lr5/f$b;->a:Z

    .line 528
    .line 529
    invoke-virtual {v8, v10, v12}, Lo7/n;->c(ZZ)Lo7/n;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    invoke-virtual {v8}, Lo7/n;->e()I

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    if-lez v8, :cond_15

    .line 538
    .line 539
    :cond_13
    move v15, v5

    .line 540
    move-object v9, v11

    .line 541
    move-object/from16 v12, v21

    .line 542
    .line 543
    goto :goto_10

    .line 544
    :cond_14
    move-object/from16 v21, v10

    .line 545
    .line 546
    move-object/from16 v22, v12

    .line 547
    .line 548
    :cond_15
    move-object/from16 v12, v22

    .line 549
    .line 550
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 551
    .line 552
    move-object/from16 v11, v20

    .line 553
    .line 554
    move-object/from16 v10, v21

    .line 555
    .line 556
    goto :goto_f

    .line 557
    :cond_16
    move-object/from16 v20, v11

    .line 558
    .line 559
    move-object/from16 v22, v12

    .line 560
    .line 561
    add-int/lit8 v14, v14, 0x1

    .line 562
    .line 563
    move-object/from16 v17, v9

    .line 564
    .line 565
    const/16 v5, 0x20

    .line 566
    .line 567
    const/4 v9, 0x2

    .line 568
    goto :goto_e

    .line 569
    :cond_17
    if-nez v12, :cond_18

    .line 570
    .line 571
    const/4 v5, 0x0

    .line 572
    goto :goto_11

    .line 573
    :cond_18
    new-instance v5, Lr5/h$a;

    .line 574
    .line 575
    const/4 v8, 0x1

    .line 576
    new-array v9, v8, [I

    .line 577
    .line 578
    const/4 v8, 0x0

    .line 579
    aput v15, v9, v8

    .line 580
    .line 581
    invoke-direct {v5, v8, v12, v9}, Lr5/h$a;-><init>(ILz4/i0;[I)V

    .line 582
    .line 583
    .line 584
    :goto_11
    aput-object v5, v4, v7

    .line 585
    .line 586
    :cond_19
    add-int/lit8 v7, v7, 0x1

    .line 587
    .line 588
    const/16 v5, 0x20

    .line 589
    .line 590
    const/4 v9, 0x2

    .line 591
    const/4 v10, 0x4

    .line 592
    const/4 v12, 0x3

    .line 593
    goto/16 :goto_d

    .line 594
    .line 595
    :cond_1a
    iget v5, v0, Lr5/j$a;->a:I

    .line 596
    .line 597
    new-instance v7, Ljava/util/HashMap;

    .line 598
    .line 599
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 600
    .line 601
    .line 602
    const/4 v8, 0x0

    .line 603
    :goto_12
    if-ge v8, v5, :cond_1b

    .line 604
    .line 605
    iget-object v9, v0, Lr5/j$a;->c:[Lz4/j0;

    .line 606
    .line 607
    aget-object v9, v9, v8

    .line 608
    .line 609
    invoke-static {v9, v3, v7}, Lr5/f;->f(Lz4/j0;Lr5/f$c;Ljava/util/HashMap;)V

    .line 610
    .line 611
    .line 612
    add-int/lit8 v8, v8, 0x1

    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_1b
    iget-object v8, v0, Lr5/j$a;->f:Lz4/j0;

    .line 616
    .line 617
    invoke-static {v8, v3, v7}, Lr5/f;->f(Lz4/j0;Lr5/f$c;Ljava/util/HashMap;)V

    .line 618
    .line 619
    .line 620
    const/4 v8, 0x0

    .line 621
    :goto_13
    const/4 v9, -0x1

    .line 622
    if-ge v8, v5, :cond_1e

    .line 623
    .line 624
    iget-object v10, v0, Lr5/j$a;->b:[I

    .line 625
    .line 626
    aget v10, v10, v8

    .line 627
    .line 628
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    invoke-virtual {v7, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v10

    .line 636
    check-cast v10, Lr5/l;

    .line 637
    .line 638
    if-nez v10, :cond_1c

    .line 639
    .line 640
    goto :goto_15

    .line 641
    :cond_1c
    iget-object v11, v10, Lr5/l;->b:Lo7/t;

    .line 642
    .line 643
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 644
    .line 645
    .line 646
    move-result v11

    .line 647
    if-nez v11, :cond_1d

    .line 648
    .line 649
    iget-object v11, v0, Lr5/j$a;->c:[Lz4/j0;

    .line 650
    .line 651
    aget-object v11, v11, v8

    .line 652
    .line 653
    iget-object v12, v10, Lr5/l;->a:Lz4/i0;

    .line 654
    .line 655
    invoke-virtual {v11, v12}, Lz4/j0;->b(Lz4/i0;)I

    .line 656
    .line 657
    .line 658
    move-result v11

    .line 659
    if-eq v11, v9, :cond_1d

    .line 660
    .line 661
    new-instance v9, Lr5/h$a;

    .line 662
    .line 663
    iget-object v11, v10, Lr5/l;->a:Lz4/i0;

    .line 664
    .line 665
    iget-object v10, v10, Lr5/l;->b:Lo7/t;

    .line 666
    .line 667
    invoke-static {v10}, Lr7/a;->F(Ljava/util/Collection;)[I

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    const/4 v12, 0x0

    .line 672
    invoke-direct {v9, v12, v11, v10}, Lr5/h$a;-><init>(ILz4/i0;[I)V

    .line 673
    .line 674
    .line 675
    goto :goto_14

    .line 676
    :cond_1d
    const/4 v9, 0x0

    .line 677
    :goto_14
    aput-object v9, v4, v8

    .line 678
    .line 679
    :goto_15
    add-int/lit8 v8, v8, 0x1

    .line 680
    .line 681
    goto :goto_13

    .line 682
    :cond_1e
    iget v5, v0, Lr5/j$a;->a:I

    .line 683
    .line 684
    const/4 v7, 0x0

    .line 685
    :goto_16
    if-ge v7, v5, :cond_23

    .line 686
    .line 687
    iget-object v8, v0, Lr5/j$a;->c:[Lz4/j0;

    .line 688
    .line 689
    aget-object v8, v8, v7

    .line 690
    .line 691
    iget-object v10, v3, Lr5/f$c;->w0:Landroid/util/SparseArray;

    .line 692
    .line 693
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v10

    .line 697
    check-cast v10, Ljava/util/Map;

    .line 698
    .line 699
    if-eqz v10, :cond_1f

    .line 700
    .line 701
    invoke-interface {v10, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v10

    .line 705
    if-eqz v10, :cond_1f

    .line 706
    .line 707
    const/4 v10, 0x1

    .line 708
    goto :goto_17

    .line 709
    :cond_1f
    const/4 v10, 0x0

    .line 710
    :goto_17
    if-nez v10, :cond_20

    .line 711
    .line 712
    goto :goto_1a

    .line 713
    :cond_20
    iget-object v10, v3, Lr5/f$c;->w0:Landroid/util/SparseArray;

    .line 714
    .line 715
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v10

    .line 719
    check-cast v10, Ljava/util/Map;

    .line 720
    .line 721
    if-eqz v10, :cond_21

    .line 722
    .line 723
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v10

    .line 727
    check-cast v10, Lr5/f$e;

    .line 728
    .line 729
    goto :goto_18

    .line 730
    :cond_21
    const/4 v10, 0x0

    .line 731
    :goto_18
    if-eqz v10, :cond_22

    .line 732
    .line 733
    iget-object v11, v10, Lr5/f$e;->b:[I

    .line 734
    .line 735
    array-length v11, v11

    .line 736
    if-eqz v11, :cond_22

    .line 737
    .line 738
    new-instance v11, Lr5/h$a;

    .line 739
    .line 740
    iget v12, v10, Lr5/f$e;->a:I

    .line 741
    .line 742
    invoke-virtual {v8, v12}, Lz4/j0;->a(I)Lz4/i0;

    .line 743
    .line 744
    .line 745
    move-result-object v8

    .line 746
    iget-object v12, v10, Lr5/f$e;->b:[I

    .line 747
    .line 748
    iget v10, v10, Lr5/f$e;->c:I

    .line 749
    .line 750
    invoke-direct {v11, v10, v8, v12}, Lr5/h$a;-><init>(ILz4/i0;[I)V

    .line 751
    .line 752
    .line 753
    goto :goto_19

    .line 754
    :cond_22
    const/4 v11, 0x0

    .line 755
    :goto_19
    aput-object v11, v4, v7

    .line 756
    .line 757
    :goto_1a
    add-int/lit8 v7, v7, 0x1

    .line 758
    .line 759
    goto :goto_16

    .line 760
    :cond_23
    const/4 v5, 0x0

    .line 761
    :goto_1b
    if-ge v5, v2, :cond_26

    .line 762
    .line 763
    iget-object v7, v0, Lr5/j$a;->b:[I

    .line 764
    .line 765
    aget v7, v7, v5

    .line 766
    .line 767
    iget-object v8, v3, Lr5/f$c;->x0:Landroid/util/SparseBooleanArray;

    .line 768
    .line 769
    invoke-virtual {v8, v5}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 770
    .line 771
    .line 772
    move-result v8

    .line 773
    if-nez v8, :cond_25

    .line 774
    .line 775
    iget-object v8, v3, Lr5/m;->H:Lo7/x;

    .line 776
    .line 777
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object v7

    .line 781
    invoke-virtual {v8, v7}, Lo7/r;->contains(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v7

    .line 785
    if-eqz v7, :cond_24

    .line 786
    .line 787
    goto :goto_1c

    .line 788
    :cond_24
    const/4 v7, 0x0

    .line 789
    goto :goto_1d

    .line 790
    :cond_25
    :goto_1c
    const/4 v7, 0x0

    .line 791
    aput-object v7, v4, v5

    .line 792
    .line 793
    :goto_1d
    add-int/lit8 v5, v5, 0x1

    .line 794
    .line 795
    goto :goto_1b

    .line 796
    :cond_26
    const/4 v7, 0x0

    .line 797
    iget-object v5, v1, Lr5/f;->e:Lr5/h$b;

    .line 798
    .line 799
    iget-object v1, v1, Lr5/o;->b:Lt5/e;

    .line 800
    .line 801
    invoke-static {v1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    check-cast v5, Lr5/a$b;

    .line 805
    .line 806
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    new-instance v5, Ljava/util/ArrayList;

    .line 810
    .line 811
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 812
    .line 813
    .line 814
    const/4 v8, 0x0

    .line 815
    :goto_1e
    const-wide/16 v10, 0x0

    .line 816
    .line 817
    if-ge v8, v2, :cond_28

    .line 818
    .line 819
    aget-object v12, v4, v8

    .line 820
    .line 821
    if-eqz v12, :cond_27

    .line 822
    .line 823
    iget-object v12, v12, Lr5/h$a;->b:[I

    .line 824
    .line 825
    array-length v12, v12

    .line 826
    const/4 v13, 0x1

    .line 827
    if-le v12, v13, :cond_27

    .line 828
    .line 829
    sget-object v12, Lo7/t;->b:Lo7/t$b;

    .line 830
    .line 831
    new-instance v12, Lo7/t$a;

    .line 832
    .line 833
    invoke-direct {v12}, Lo7/t$a;-><init>()V

    .line 834
    .line 835
    .line 836
    new-instance v13, Lr5/a$a;

    .line 837
    .line 838
    invoke-direct {v13, v10, v11, v10, v11}, Lr5/a$a;-><init>(JJ)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v12, v13}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    goto :goto_1f

    .line 845
    :cond_27
    move-object v12, v7

    .line 846
    :goto_1f
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    add-int/lit8 v8, v8, 0x1

    .line 850
    .line 851
    goto :goto_1e

    .line 852
    :cond_28
    new-array v8, v2, [[J

    .line 853
    .line 854
    const/4 v12, 0x0

    .line 855
    :goto_20
    const-wide/16 v13, -0x1

    .line 856
    .line 857
    if-ge v12, v2, :cond_2c

    .line 858
    .line 859
    aget-object v15, v4, v12

    .line 860
    .line 861
    if-nez v15, :cond_29

    .line 862
    .line 863
    const/4 v7, 0x0

    .line 864
    new-array v13, v7, [J

    .line 865
    .line 866
    aput-object v13, v8, v12

    .line 867
    .line 868
    goto :goto_22

    .line 869
    :cond_29
    iget-object v7, v15, Lr5/h$a;->b:[I

    .line 870
    .line 871
    array-length v7, v7

    .line 872
    new-array v7, v7, [J

    .line 873
    .line 874
    aput-object v7, v8, v12

    .line 875
    .line 876
    const/4 v7, 0x0

    .line 877
    :goto_21
    iget-object v10, v15, Lr5/h$a;->b:[I

    .line 878
    .line 879
    array-length v11, v10

    .line 880
    if-ge v7, v11, :cond_2b

    .line 881
    .line 882
    iget-object v11, v15, Lr5/h$a;->a:Lz4/i0;

    .line 883
    .line 884
    aget v10, v10, v7

    .line 885
    .line 886
    iget-object v11, v11, Lz4/i0;->d:[Lv3/i0;

    .line 887
    .line 888
    aget-object v10, v11, v10

    .line 889
    .line 890
    iget v10, v10, Lv3/i0;->p:I

    .line 891
    .line 892
    int-to-long v10, v10

    .line 893
    aget-object v18, v8, v12

    .line 894
    .line 895
    cmp-long v21, v10, v13

    .line 896
    .line 897
    if-nez v21, :cond_2a

    .line 898
    .line 899
    const-wide/16 v10, 0x0

    .line 900
    .line 901
    :cond_2a
    aput-wide v10, v18, v7

    .line 902
    .line 903
    add-int/lit8 v7, v7, 0x1

    .line 904
    .line 905
    goto :goto_21

    .line 906
    :cond_2b
    aget-object v7, v8, v12

    .line 907
    .line 908
    invoke-static {v7}, Ljava/util/Arrays;->sort([J)V

    .line 909
    .line 910
    .line 911
    :goto_22
    add-int/lit8 v12, v12, 0x1

    .line 912
    .line 913
    const/4 v7, 0x0

    .line 914
    const-wide/16 v10, 0x0

    .line 915
    .line 916
    goto :goto_20

    .line 917
    :cond_2c
    new-array v7, v2, [I

    .line 918
    .line 919
    new-array v10, v2, [J

    .line 920
    .line 921
    const/4 v11, 0x0

    .line 922
    :goto_23
    if-ge v11, v2, :cond_2e

    .line 923
    .line 924
    aget-object v12, v8, v11

    .line 925
    .line 926
    array-length v15, v12

    .line 927
    if-nez v15, :cond_2d

    .line 928
    .line 929
    const-wide/16 v21, 0x0

    .line 930
    .line 931
    goto :goto_24

    .line 932
    :cond_2d
    const/4 v15, 0x0

    .line 933
    aget-wide v21, v12, v15

    .line 934
    .line 935
    :goto_24
    aput-wide v21, v10, v11

    .line 936
    .line 937
    add-int/lit8 v11, v11, 0x1

    .line 938
    .line 939
    goto :goto_23

    .line 940
    :cond_2e
    invoke-static {v5, v10}, Lr5/a;->v(Ljava/util/ArrayList;[J)V

    .line 941
    .line 942
    .line 943
    sget-object v11, Lo7/j0;->a:Lo7/j0;

    .line 944
    .line 945
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    const-string v12, "expectedValuesPerKey"

    .line 949
    .line 950
    const/4 v15, 0x2

    .line 951
    invoke-static {v15, v12}, Lp2/m0;->o(ILjava/lang/String;)V

    .line 952
    .line 953
    .line 954
    new-instance v12, Ljava/util/TreeMap;

    .line 955
    .line 956
    invoke-direct {v12, v11}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 957
    .line 958
    .line 959
    new-instance v11, Lo7/g0;

    .line 960
    .line 961
    invoke-direct {v11, v15}, Lo7/g0;-><init>(I)V

    .line 962
    .line 963
    .line 964
    new-instance v15, Lo7/h0;

    .line 965
    .line 966
    invoke-direct {v15, v12, v11}, Lo7/h0;-><init>(Ljava/util/TreeMap;Lo7/g0;)V

    .line 967
    .line 968
    .line 969
    const/4 v11, 0x0

    .line 970
    :goto_25
    if-ge v11, v2, :cond_37

    .line 971
    .line 972
    aget-object v12, v8, v11

    .line 973
    .line 974
    array-length v9, v12

    .line 975
    const/4 v13, 0x1

    .line 976
    if-gt v9, v13, :cond_2f

    .line 977
    .line 978
    move-object/from16 v32, v1

    .line 979
    .line 980
    move-object/from16 v31, v6

    .line 981
    .line 982
    const-wide/16 v19, -0x1

    .line 983
    .line 984
    move-object v6, v0

    .line 985
    goto/16 :goto_2b

    .line 986
    .line 987
    :cond_2f
    array-length v9, v12

    .line 988
    new-array v12, v9, [D

    .line 989
    .line 990
    const/4 v13, 0x0

    .line 991
    :goto_26
    aget-object v14, v8, v11

    .line 992
    .line 993
    move-object/from16 v31, v6

    .line 994
    .line 995
    array-length v6, v14

    .line 996
    const-wide/16 v21, 0x0

    .line 997
    .line 998
    if-ge v13, v6, :cond_31

    .line 999
    .line 1000
    move-object v6, v0

    .line 1001
    move-object/from16 v32, v1

    .line 1002
    .line 1003
    aget-wide v0, v14, v13

    .line 1004
    .line 1005
    const-wide/16 v19, -0x1

    .line 1006
    .line 1007
    cmp-long v14, v0, v19

    .line 1008
    .line 1009
    if-nez v14, :cond_30

    .line 1010
    .line 1011
    goto :goto_27

    .line 1012
    :cond_30
    long-to-double v0, v0

    .line 1013
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v21

    .line 1017
    :goto_27
    aput-wide v21, v12, v13

    .line 1018
    .line 1019
    add-int/lit8 v13, v13, 0x1

    .line 1020
    .line 1021
    move-object v0, v6

    .line 1022
    move-object/from16 v6, v31

    .line 1023
    .line 1024
    move-object/from16 v1, v32

    .line 1025
    .line 1026
    goto :goto_26

    .line 1027
    :cond_31
    move-object v6, v0

    .line 1028
    move-object/from16 v32, v1

    .line 1029
    .line 1030
    const-wide/16 v19, -0x1

    .line 1031
    .line 1032
    add-int/lit8 v9, v9, -0x1

    .line 1033
    .line 1034
    aget-wide v0, v12, v9

    .line 1035
    .line 1036
    const/4 v13, 0x0

    .line 1037
    aget-wide v23, v12, v13

    .line 1038
    .line 1039
    sub-double v0, v0, v23

    .line 1040
    .line 1041
    const/4 v13, 0x0

    .line 1042
    :goto_28
    if-ge v13, v9, :cond_36

    .line 1043
    .line 1044
    const-wide/high16 v23, 0x3fe0000000000000L    # 0.5

    .line 1045
    .line 1046
    aget-wide v25, v12, v13

    .line 1047
    .line 1048
    add-int/lit8 v13, v13, 0x1

    .line 1049
    .line 1050
    aget-wide v27, v12, v13

    .line 1051
    .line 1052
    add-double v25, v25, v27

    .line 1053
    .line 1054
    mul-double v25, v25, v23

    .line 1055
    .line 1056
    cmpl-double v14, v0, v21

    .line 1057
    .line 1058
    if-nez v14, :cond_32

    .line 1059
    .line 1060
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 1061
    .line 1062
    goto :goto_29

    .line 1063
    :cond_32
    const/4 v14, 0x0

    .line 1064
    aget-wide v23, v12, v14

    .line 1065
    .line 1066
    sub-double v25, v25, v23

    .line 1067
    .line 1068
    div-double v23, v25, v0

    .line 1069
    .line 1070
    :goto_29
    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v14

    .line 1074
    move-wide/from16 v23, v0

    .line 1075
    .line 1076
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    iget-object v1, v15, Lo7/d;->d:Ljava/util/Map;

    .line 1081
    .line 1082
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    check-cast v1, Ljava/util/Collection;

    .line 1087
    .line 1088
    if-nez v1, :cond_34

    .line 1089
    .line 1090
    iget-object v1, v15, Lo7/h0;->f:Ln7/q;

    .line 1091
    .line 1092
    invoke-interface {v1}, Ln7/q;->get()Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    check-cast v1, Ljava/util/List;

    .line 1097
    .line 1098
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v0

    .line 1102
    if-eqz v0, :cond_33

    .line 1103
    .line 1104
    iget v0, v15, Lo7/d;->e:I

    .line 1105
    .line 1106
    const/16 v16, 0x1

    .line 1107
    .line 1108
    add-int/lit8 v0, v0, 0x1

    .line 1109
    .line 1110
    iput v0, v15, Lo7/d;->e:I

    .line 1111
    .line 1112
    iget-object v0, v15, Lo7/d;->d:Ljava/util/Map;

    .line 1113
    .line 1114
    invoke-interface {v0, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1115
    .line 1116
    .line 1117
    goto :goto_2a

    .line 1118
    :cond_33
    new-instance v0, Ljava/lang/AssertionError;

    .line 1119
    .line 1120
    const-string v1, "New Collection violated the Collection spec"

    .line 1121
    .line 1122
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    throw v0

    .line 1126
    :cond_34
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    if-eqz v0, :cond_35

    .line 1131
    .line 1132
    iget v0, v15, Lo7/d;->e:I

    .line 1133
    .line 1134
    const/4 v1, 0x1

    .line 1135
    add-int/2addr v0, v1

    .line 1136
    iput v0, v15, Lo7/d;->e:I

    .line 1137
    .line 1138
    :cond_35
    :goto_2a
    move-wide/from16 v0, v23

    .line 1139
    .line 1140
    goto :goto_28

    .line 1141
    :cond_36
    :goto_2b
    add-int/lit8 v11, v11, 0x1

    .line 1142
    .line 1143
    move-object v0, v6

    .line 1144
    move-wide/from16 v13, v19

    .line 1145
    .line 1146
    move-object/from16 v6, v31

    .line 1147
    .line 1148
    move-object/from16 v1, v32

    .line 1149
    .line 1150
    const/4 v9, -0x1

    .line 1151
    goto/16 :goto_25

    .line 1152
    .line 1153
    :cond_37
    move-object/from16 v32, v1

    .line 1154
    .line 1155
    move-object/from16 v31, v6

    .line 1156
    .line 1157
    move-object v6, v0

    .line 1158
    invoke-virtual {v15}, Lo7/d;->g()Ljava/util/Collection;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    invoke-static {v0}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    const/4 v1, 0x0

    .line 1167
    :goto_2c
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 1168
    .line 1169
    .line 1170
    move-result v9

    .line 1171
    if-ge v1, v9, :cond_38

    .line 1172
    .line 1173
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v9

    .line 1177
    check-cast v9, Ljava/lang/Integer;

    .line 1178
    .line 1179
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1180
    .line 1181
    .line 1182
    move-result v9

    .line 1183
    aget v11, v7, v9

    .line 1184
    .line 1185
    const/4 v12, 0x1

    .line 1186
    add-int/2addr v11, v12

    .line 1187
    aput v11, v7, v9

    .line 1188
    .line 1189
    aget-object v12, v8, v9

    .line 1190
    .line 1191
    aget-wide v11, v12, v11

    .line 1192
    .line 1193
    aput-wide v11, v10, v9

    .line 1194
    .line 1195
    invoke-static {v5, v10}, Lr5/a;->v(Ljava/util/ArrayList;[J)V

    .line 1196
    .line 1197
    .line 1198
    add-int/lit8 v1, v1, 0x1

    .line 1199
    .line 1200
    goto :goto_2c

    .line 1201
    :cond_38
    const/4 v0, 0x0

    .line 1202
    :goto_2d
    if-ge v0, v2, :cond_3a

    .line 1203
    .line 1204
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    if-eqz v1, :cond_39

    .line 1209
    .line 1210
    aget-wide v7, v10, v0

    .line 1211
    .line 1212
    const-wide/16 v11, 0x2

    .line 1213
    .line 1214
    mul-long/2addr v7, v11

    .line 1215
    aput-wide v7, v10, v0

    .line 1216
    .line 1217
    :cond_39
    add-int/lit8 v0, v0, 0x1

    .line 1218
    .line 1219
    goto :goto_2d

    .line 1220
    :cond_3a
    invoke-static {v5, v10}, Lr5/a;->v(Ljava/util/ArrayList;[J)V

    .line 1221
    .line 1222
    .line 1223
    new-instance v0, Lo7/t$a;

    .line 1224
    .line 1225
    invoke-direct {v0}, Lo7/t$a;-><init>()V

    .line 1226
    .line 1227
    .line 1228
    const/4 v1, 0x0

    .line 1229
    :goto_2e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1230
    .line 1231
    .line 1232
    move-result v7

    .line 1233
    if-ge v1, v7, :cond_3c

    .line 1234
    .line 1235
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v7

    .line 1239
    check-cast v7, Lo7/t$a;

    .line 1240
    .line 1241
    if-nez v7, :cond_3b

    .line 1242
    .line 1243
    sget-object v7, Lo7/l0;->e:Lo7/l0;

    .line 1244
    .line 1245
    goto :goto_2f

    .line 1246
    :cond_3b
    invoke-virtual {v7}, Lo7/t$a;->e()Lo7/l0;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v7

    .line 1250
    :goto_2f
    invoke-virtual {v0, v7}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    add-int/lit8 v1, v1, 0x1

    .line 1254
    .line 1255
    goto :goto_2e

    .line 1256
    :cond_3c
    invoke-virtual {v0}, Lo7/t$a;->e()Lo7/l0;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    new-array v1, v2, [Lr5/h;

    .line 1261
    .line 1262
    const/4 v12, 0x0

    .line 1263
    :goto_30
    if-ge v12, v2, :cond_40

    .line 1264
    .line 1265
    aget-object v5, v4, v12

    .line 1266
    .line 1267
    if-eqz v5, :cond_3f

    .line 1268
    .line 1269
    iget-object v7, v5, Lr5/h$a;->b:[I

    .line 1270
    .line 1271
    array-length v8, v7

    .line 1272
    if-nez v8, :cond_3d

    .line 1273
    .line 1274
    goto :goto_32

    .line 1275
    :cond_3d
    array-length v8, v7

    .line 1276
    const/4 v9, 0x1

    .line 1277
    if-ne v8, v9, :cond_3e

    .line 1278
    .line 1279
    new-instance v8, Lr5/i;

    .line 1280
    .line 1281
    iget-object v9, v5, Lr5/h$a;->a:Lz4/i0;

    .line 1282
    .line 1283
    const/4 v10, 0x0

    .line 1284
    aget v7, v7, v10

    .line 1285
    .line 1286
    iget v5, v5, Lr5/h$a;->c:I

    .line 1287
    .line 1288
    invoke-direct {v8, v7, v5, v9}, Lr5/i;-><init>(IILz4/i0;)V

    .line 1289
    .line 1290
    .line 1291
    goto :goto_31

    .line 1292
    :cond_3e
    iget-object v8, v5, Lr5/h$a;->a:Lz4/i0;

    .line 1293
    .line 1294
    iget v5, v5, Lr5/h$a;->c:I

    .line 1295
    .line 1296
    invoke-virtual {v0, v12}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v9

    .line 1300
    move-object/from16 v30, v9

    .line 1301
    .line 1302
    check-cast v30, Lo7/t;

    .line 1303
    .line 1304
    new-instance v9, Lr5/a;

    .line 1305
    .line 1306
    const/16 v10, 0x2710

    .line 1307
    .line 1308
    int-to-long v10, v10

    .line 1309
    const/16 v13, 0x61a8

    .line 1310
    .line 1311
    int-to-long v13, v13

    .line 1312
    move-object/from16 v19, v9

    .line 1313
    .line 1314
    move-object/from16 v20, v8

    .line 1315
    .line 1316
    move-object/from16 v21, v7

    .line 1317
    .line 1318
    move/from16 v22, v5

    .line 1319
    .line 1320
    move-object/from16 v23, v32

    .line 1321
    .line 1322
    move-wide/from16 v24, v10

    .line 1323
    .line 1324
    move-wide/from16 v26, v13

    .line 1325
    .line 1326
    move-wide/from16 v28, v13

    .line 1327
    .line 1328
    invoke-direct/range {v19 .. v30}, Lr5/a;-><init>(Lz4/i0;[IILt5/e;JJJLo7/t;)V

    .line 1329
    .line 1330
    .line 1331
    move-object v8, v9

    .line 1332
    :goto_31
    aput-object v8, v1, v12

    .line 1333
    .line 1334
    :cond_3f
    :goto_32
    add-int/lit8 v12, v12, 0x1

    .line 1335
    .line 1336
    goto :goto_30

    .line 1337
    :cond_40
    new-array v0, v2, [Lv3/l1;

    .line 1338
    .line 1339
    const/4 v12, 0x0

    .line 1340
    :goto_33
    if-ge v12, v2, :cond_46

    .line 1341
    .line 1342
    iget-object v4, v6, Lr5/j$a;->b:[I

    .line 1343
    .line 1344
    aget v4, v4, v12

    .line 1345
    .line 1346
    iget-object v5, v3, Lr5/f$c;->x0:Landroid/util/SparseBooleanArray;

    .line 1347
    .line 1348
    invoke-virtual {v5, v12}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v5

    .line 1352
    if-nez v5, :cond_42

    .line 1353
    .line 1354
    iget-object v5, v3, Lr5/m;->H:Lo7/x;

    .line 1355
    .line 1356
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v4

    .line 1360
    invoke-virtual {v5, v4}, Lo7/r;->contains(Ljava/lang/Object;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v4

    .line 1364
    if-eqz v4, :cond_41

    .line 1365
    .line 1366
    goto :goto_34

    .line 1367
    :cond_41
    const/4 v4, 0x0

    .line 1368
    goto :goto_35

    .line 1369
    :cond_42
    :goto_34
    const/4 v4, 0x1

    .line 1370
    :goto_35
    if-nez v4, :cond_44

    .line 1371
    .line 1372
    iget-object v4, v6, Lr5/j$a;->b:[I

    .line 1373
    .line 1374
    aget v4, v4, v12

    .line 1375
    .line 1376
    const/4 v5, -0x2

    .line 1377
    if-eq v4, v5, :cond_43

    .line 1378
    .line 1379
    aget-object v4, v1, v12

    .line 1380
    .line 1381
    if-eqz v4, :cond_44

    .line 1382
    .line 1383
    :cond_43
    const/4 v4, 0x1

    .line 1384
    goto :goto_36

    .line 1385
    :cond_44
    const/4 v4, 0x0

    .line 1386
    :goto_36
    if-eqz v4, :cond_45

    .line 1387
    .line 1388
    sget-object v4, Lv3/l1;->b:Lv3/l1;

    .line 1389
    .line 1390
    goto :goto_37

    .line 1391
    :cond_45
    const/4 v4, 0x0

    .line 1392
    :goto_37
    aput-object v4, v0, v12

    .line 1393
    .line 1394
    add-int/lit8 v12, v12, 0x1

    .line 1395
    .line 1396
    goto :goto_33

    .line 1397
    :cond_46
    iget-boolean v2, v3, Lr5/f$c;->u0:Z

    .line 1398
    .line 1399
    if-eqz v2, :cond_51

    .line 1400
    .line 1401
    const/4 v2, -0x1

    .line 1402
    const/4 v3, -0x1

    .line 1403
    const/4 v12, 0x0

    .line 1404
    :goto_38
    iget v4, v6, Lr5/j$a;->a:I

    .line 1405
    .line 1406
    if-ge v12, v4, :cond_4f

    .line 1407
    .line 1408
    iget-object v4, v6, Lr5/j$a;->b:[I

    .line 1409
    .line 1410
    aget v4, v4, v12

    .line 1411
    .line 1412
    aget-object v5, v1, v12

    .line 1413
    .line 1414
    const/4 v7, 0x1

    .line 1415
    if-eq v4, v7, :cond_48

    .line 1416
    .line 1417
    const/4 v7, 0x2

    .line 1418
    if-ne v4, v7, :cond_47

    .line 1419
    .line 1420
    goto :goto_39

    .line 1421
    :cond_47
    const/16 v13, 0x20

    .line 1422
    .line 1423
    goto :goto_3d

    .line 1424
    :cond_48
    const/4 v7, 0x2

    .line 1425
    :goto_39
    if-eqz v5, :cond_47

    .line 1426
    .line 1427
    aget-object v8, v31, v12

    .line 1428
    .line 1429
    iget-object v9, v6, Lr5/j$a;->c:[Lz4/j0;

    .line 1430
    .line 1431
    aget-object v9, v9, v12

    .line 1432
    .line 1433
    invoke-interface {v5}, Lr5/k;->a()Lz4/i0;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v10

    .line 1437
    invoke-virtual {v9, v10}, Lz4/j0;->b(Lz4/i0;)I

    .line 1438
    .line 1439
    .line 1440
    move-result v9

    .line 1441
    const/4 v10, 0x0

    .line 1442
    :goto_3a
    invoke-interface {v5}, Lr5/k;->length()I

    .line 1443
    .line 1444
    .line 1445
    move-result v11

    .line 1446
    if-ge v10, v11, :cond_4a

    .line 1447
    .line 1448
    aget-object v11, v8, v9

    .line 1449
    .line 1450
    invoke-interface {v5, v10}, Lr5/k;->c(I)I

    .line 1451
    .line 1452
    .line 1453
    move-result v13

    .line 1454
    aget v11, v11, v13

    .line 1455
    .line 1456
    const/16 v13, 0x20

    .line 1457
    .line 1458
    and-int/2addr v11, v13

    .line 1459
    if-eq v11, v13, :cond_49

    .line 1460
    .line 1461
    const/4 v5, 0x0

    .line 1462
    goto :goto_3b

    .line 1463
    :cond_49
    add-int/lit8 v10, v10, 0x1

    .line 1464
    .line 1465
    goto :goto_3a

    .line 1466
    :cond_4a
    const/16 v13, 0x20

    .line 1467
    .line 1468
    const/4 v5, 0x1

    .line 1469
    :goto_3b
    if-eqz v5, :cond_4e

    .line 1470
    .line 1471
    const/4 v5, 0x1

    .line 1472
    if-ne v4, v5, :cond_4c

    .line 1473
    .line 1474
    const/4 v4, -0x1

    .line 1475
    if-eq v3, v4, :cond_4b

    .line 1476
    .line 1477
    goto :goto_3c

    .line 1478
    :cond_4b
    move v3, v12

    .line 1479
    goto :goto_3d

    .line 1480
    :cond_4c
    const/4 v4, -0x1

    .line 1481
    if-eq v2, v4, :cond_4d

    .line 1482
    .line 1483
    :goto_3c
    const/4 v4, 0x0

    .line 1484
    goto :goto_3e

    .line 1485
    :cond_4d
    move v2, v12

    .line 1486
    :cond_4e
    :goto_3d
    add-int/lit8 v12, v12, 0x1

    .line 1487
    .line 1488
    goto :goto_38

    .line 1489
    :cond_4f
    const/4 v4, 0x1

    .line 1490
    :goto_3e
    const/4 v5, -0x1

    .line 1491
    if-eq v3, v5, :cond_50

    .line 1492
    .line 1493
    if-eq v2, v5, :cond_50

    .line 1494
    .line 1495
    const/4 v5, 0x1

    .line 1496
    goto :goto_3f

    .line 1497
    :cond_50
    const/4 v5, 0x0

    .line 1498
    :goto_3f
    and-int/2addr v4, v5

    .line 1499
    if-eqz v4, :cond_51

    .line 1500
    .line 1501
    new-instance v4, Lv3/l1;

    .line 1502
    .line 1503
    const/4 v5, 0x1

    .line 1504
    invoke-direct {v4, v5}, Lv3/l1;-><init>(Z)V

    .line 1505
    .line 1506
    .line 1507
    aput-object v4, v0, v3

    .line 1508
    .line 1509
    aput-object v4, v0, v2

    .line 1510
    .line 1511
    :cond_51
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1516
    .line 1517
    check-cast v1, [Lr5/k;

    .line 1518
    .line 1519
    array-length v2, v1

    .line 1520
    new-array v2, v2, [Ljava/util/List;

    .line 1521
    .line 1522
    const/4 v12, 0x0

    .line 1523
    :goto_40
    array-length v3, v1

    .line 1524
    if-ge v12, v3, :cond_53

    .line 1525
    .line 1526
    aget-object v3, v1, v12

    .line 1527
    .line 1528
    if-eqz v3, :cond_52

    .line 1529
    .line 1530
    invoke-static {v3}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v3

    .line 1534
    goto :goto_41

    .line 1535
    :cond_52
    sget-object v3, Lo7/t;->b:Lo7/t$b;

    .line 1536
    .line 1537
    sget-object v3, Lo7/l0;->e:Lo7/l0;

    .line 1538
    .line 1539
    :goto_41
    aput-object v3, v2, v12

    .line 1540
    .line 1541
    add-int/lit8 v12, v12, 0x1

    .line 1542
    .line 1543
    goto :goto_40

    .line 1544
    :cond_53
    new-instance v1, Lo7/t$a;

    .line 1545
    .line 1546
    invoke-direct {v1}, Lo7/t$a;-><init>()V

    .line 1547
    .line 1548
    .line 1549
    const/4 v12, 0x0

    .line 1550
    :goto_42
    iget v3, v6, Lr5/j$a;->a:I

    .line 1551
    .line 1552
    if-ge v12, v3, :cond_5f

    .line 1553
    .line 1554
    iget-object v3, v6, Lr5/j$a;->c:[Lz4/j0;

    .line 1555
    .line 1556
    aget-object v3, v3, v12

    .line 1557
    .line 1558
    aget-object v4, v2, v12

    .line 1559
    .line 1560
    const/4 v5, 0x0

    .line 1561
    :goto_43
    iget v7, v3, Lz4/j0;->a:I

    .line 1562
    .line 1563
    if-ge v5, v7, :cond_5e

    .line 1564
    .line 1565
    invoke-virtual {v3, v5}, Lz4/j0;->a(I)Lz4/i0;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v7

    .line 1569
    iget-object v8, v6, Lr5/j$a;->c:[Lz4/j0;

    .line 1570
    .line 1571
    aget-object v8, v8, v12

    .line 1572
    .line 1573
    invoke-virtual {v8, v5}, Lz4/j0;->a(I)Lz4/i0;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v8

    .line 1577
    iget v8, v8, Lz4/i0;->a:I

    .line 1578
    .line 1579
    new-array v9, v8, [I

    .line 1580
    .line 1581
    const/4 v10, 0x0

    .line 1582
    const/4 v11, 0x0

    .line 1583
    :goto_44
    if-ge v10, v8, :cond_55

    .line 1584
    .line 1585
    iget-object v13, v6, Lr5/j$a;->e:[[[I

    .line 1586
    .line 1587
    aget-object v13, v13, v12

    .line 1588
    .line 1589
    aget-object v13, v13, v5

    .line 1590
    .line 1591
    aget v13, v13, v10

    .line 1592
    .line 1593
    and-int/lit8 v13, v13, 0x7

    .line 1594
    .line 1595
    const/4 v14, 0x4

    .line 1596
    if-eq v13, v14, :cond_54

    .line 1597
    .line 1598
    goto :goto_45

    .line 1599
    :cond_54
    add-int/lit8 v13, v11, 0x1

    .line 1600
    .line 1601
    aput v10, v9, v11

    .line 1602
    .line 1603
    move v11, v13

    .line 1604
    :goto_45
    add-int/lit8 v10, v10, 0x1

    .line 1605
    .line 1606
    goto :goto_44

    .line 1607
    :cond_55
    const/4 v14, 0x4

    .line 1608
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1609
    .line 1610
    .line 1611
    move-result-object v8

    .line 1612
    const/16 v9, 0x10

    .line 1613
    .line 1614
    const/4 v10, 0x0

    .line 1615
    const/4 v11, 0x0

    .line 1616
    const/4 v13, 0x0

    .line 1617
    const/4 v15, 0x0

    .line 1618
    :goto_46
    array-length v14, v8

    .line 1619
    if-ge v10, v14, :cond_57

    .line 1620
    .line 1621
    aget v14, v8, v10

    .line 1622
    .line 1623
    move-object/from16 v17, v2

    .line 1624
    .line 1625
    iget-object v2, v6, Lr5/j$a;->c:[Lz4/j0;

    .line 1626
    .line 1627
    aget-object v2, v2, v12

    .line 1628
    .line 1629
    invoke-virtual {v2, v5}, Lz4/j0;->a(I)Lz4/i0;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v2

    .line 1633
    iget-object v2, v2, Lz4/i0;->d:[Lv3/i0;

    .line 1634
    .line 1635
    aget-object v2, v2, v14

    .line 1636
    .line 1637
    iget-object v2, v2, Lv3/i0;->t:Ljava/lang/String;

    .line 1638
    .line 1639
    add-int/lit8 v14, v13, 0x1

    .line 1640
    .line 1641
    if-nez v13, :cond_56

    .line 1642
    .line 1643
    move-object v15, v2

    .line 1644
    const/4 v13, 0x1

    .line 1645
    goto :goto_47

    .line 1646
    :cond_56
    invoke-static {v15, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v2

    .line 1650
    const/4 v13, 0x1

    .line 1651
    xor-int/2addr v2, v13

    .line 1652
    or-int/2addr v2, v11

    .line 1653
    move v11, v2

    .line 1654
    :goto_47
    iget-object v2, v6, Lr5/j$a;->e:[[[I

    .line 1655
    .line 1656
    aget-object v2, v2, v12

    .line 1657
    .line 1658
    aget-object v2, v2, v5

    .line 1659
    .line 1660
    aget v2, v2, v10

    .line 1661
    .line 1662
    and-int/lit8 v2, v2, 0x18

    .line 1663
    .line 1664
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    .line 1665
    .line 1666
    .line 1667
    move-result v9

    .line 1668
    add-int/lit8 v10, v10, 0x1

    .line 1669
    .line 1670
    move v13, v14

    .line 1671
    move-object/from16 v2, v17

    .line 1672
    .line 1673
    goto :goto_46

    .line 1674
    :cond_57
    move-object/from16 v17, v2

    .line 1675
    .line 1676
    const/4 v13, 0x1

    .line 1677
    if-eqz v11, :cond_58

    .line 1678
    .line 1679
    iget-object v2, v6, Lr5/j$a;->d:[I

    .line 1680
    .line 1681
    aget v2, v2, v12

    .line 1682
    .line 1683
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    .line 1684
    .line 1685
    .line 1686
    move-result v9

    .line 1687
    :cond_58
    if-eqz v9, :cond_59

    .line 1688
    .line 1689
    move v2, v13

    .line 1690
    goto :goto_48

    .line 1691
    :cond_59
    const/4 v2, 0x0

    .line 1692
    :goto_48
    iget v8, v7, Lz4/i0;->a:I

    .line 1693
    .line 1694
    new-array v9, v8, [I

    .line 1695
    .line 1696
    new-array v8, v8, [Z

    .line 1697
    .line 1698
    const/4 v10, 0x0

    .line 1699
    :goto_49
    iget v11, v7, Lz4/i0;->a:I

    .line 1700
    .line 1701
    if-ge v10, v11, :cond_5d

    .line 1702
    .line 1703
    iget-object v11, v6, Lr5/j$a;->e:[[[I

    .line 1704
    .line 1705
    aget-object v11, v11, v12

    .line 1706
    .line 1707
    aget-object v11, v11, v5

    .line 1708
    .line 1709
    aget v11, v11, v10

    .line 1710
    .line 1711
    and-int/lit8 v11, v11, 0x7

    .line 1712
    .line 1713
    aput v11, v9, v10

    .line 1714
    .line 1715
    const/4 v11, 0x0

    .line 1716
    :goto_4a
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1717
    .line 1718
    .line 1719
    move-result v14

    .line 1720
    if-ge v11, v14, :cond_5c

    .line 1721
    .line 1722
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v14

    .line 1726
    check-cast v14, Lr5/k;

    .line 1727
    .line 1728
    invoke-interface {v14}, Lr5/k;->a()Lz4/i0;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v15

    .line 1732
    invoke-virtual {v15, v7}, Lz4/i0;->equals(Ljava/lang/Object;)Z

    .line 1733
    .line 1734
    .line 1735
    move-result v15

    .line 1736
    if-eqz v15, :cond_5a

    .line 1737
    .line 1738
    invoke-interface {v14, v10}, Lr5/k;->f(I)I

    .line 1739
    .line 1740
    .line 1741
    move-result v14

    .line 1742
    const/4 v15, -0x1

    .line 1743
    if-eq v14, v15, :cond_5b

    .line 1744
    .line 1745
    move v11, v13

    .line 1746
    goto :goto_4b

    .line 1747
    :cond_5a
    const/4 v15, -0x1

    .line 1748
    :cond_5b
    add-int/lit8 v11, v11, 0x1

    .line 1749
    .line 1750
    goto :goto_4a

    .line 1751
    :cond_5c
    const/4 v15, -0x1

    .line 1752
    const/4 v11, 0x0

    .line 1753
    :goto_4b
    aput-boolean v11, v8, v10

    .line 1754
    .line 1755
    add-int/lit8 v10, v10, 0x1

    .line 1756
    .line 1757
    goto :goto_49

    .line 1758
    :cond_5d
    const/4 v15, -0x1

    .line 1759
    new-instance v10, Lv3/s1$a;

    .line 1760
    .line 1761
    invoke-direct {v10, v7, v2, v9, v8}, Lv3/s1$a;-><init>(Lz4/i0;Z[I[Z)V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v1, v10}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 1765
    .line 1766
    .line 1767
    add-int/lit8 v5, v5, 0x1

    .line 1768
    .line 1769
    move-object/from16 v2, v17

    .line 1770
    .line 1771
    goto/16 :goto_43

    .line 1772
    .line 1773
    :cond_5e
    move-object/from16 v17, v2

    .line 1774
    .line 1775
    const/4 v13, 0x1

    .line 1776
    const/4 v15, -0x1

    .line 1777
    add-int/lit8 v12, v12, 0x1

    .line 1778
    .line 1779
    goto/16 :goto_42

    .line 1780
    .line 1781
    :cond_5f
    iget-object v2, v6, Lr5/j$a;->f:Lz4/j0;

    .line 1782
    .line 1783
    const/4 v12, 0x0

    .line 1784
    :goto_4c
    iget v3, v2, Lz4/j0;->a:I

    .line 1785
    .line 1786
    if-ge v12, v3, :cond_60

    .line 1787
    .line 1788
    invoke-virtual {v2, v12}, Lz4/j0;->a(I)Lz4/i0;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v3

    .line 1792
    iget v4, v3, Lz4/i0;->a:I

    .line 1793
    .line 1794
    new-array v4, v4, [I

    .line 1795
    .line 1796
    const/4 v5, 0x0

    .line 1797
    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([II)V

    .line 1798
    .line 1799
    .line 1800
    iget v7, v3, Lz4/i0;->a:I

    .line 1801
    .line 1802
    new-array v7, v7, [Z

    .line 1803
    .line 1804
    new-instance v8, Lv3/s1$a;

    .line 1805
    .line 1806
    invoke-direct {v8, v3, v5, v4, v7}, Lv3/s1$a;-><init>(Lz4/i0;Z[I[Z)V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v1, v8}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 1810
    .line 1811
    .line 1812
    add-int/lit8 v12, v12, 0x1

    .line 1813
    .line 1814
    goto :goto_4c

    .line 1815
    :cond_60
    new-instance v2, Lv3/s1;

    .line 1816
    .line 1817
    invoke-virtual {v1}, Lo7/t$a;->e()Lo7/l0;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v1

    .line 1821
    invoke-direct {v2, v1}, Lv3/s1;-><init>(Lo7/l0;)V

    .line 1822
    .line 1823
    .line 1824
    new-instance v1, Lr5/p;

    .line 1825
    .line 1826
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v3, [Lv3/l1;

    .line 1829
    .line 1830
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1831
    .line 1832
    check-cast v0, [Lr5/h;

    .line 1833
    .line 1834
    invoke-direct {v1, v3, v0, v2, v6}, Lr5/p;-><init>([Lv3/l1;[Lr5/h;Lv3/s1;Lr5/j$a;)V

    .line 1835
    .line 1836
    .line 1837
    return-object v1

    .line 1838
    :catchall_0
    move-exception v0

    .line 1839
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1840
    throw v0
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public final e()Lr5/j$a;
    .locals 1

    iget-object v0, p0, Lr5/j;->c:Lr5/j$a;

    return-object v0
.end method
