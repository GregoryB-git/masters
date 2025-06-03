.class public final Lv3/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz4/r;

.field public final b:Ljava/lang/Object;

.field public final c:[Lz4/c0;

.field public d:Z

.field public e:Z

.field public f:Lv3/r0;

.field public g:Z

.field public final h:[Z

.field public final i:[Lv3/k1;

.field public final j:Lr5/o;

.field public final k:Lv3/z0;

.field public l:Lv3/q0;

.field public m:Lz4/j0;

.field public n:Lr5/p;

.field public o:J


# direct methods
.method public constructor <init>([Lv3/k1;JLr5/o;Lt5/b;Lv3/z0;Lv3/r0;Lr5/p;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv3/q0;->i:[Lv3/k1;

    .line 5
    .line 6
    iput-wide p2, p0, Lv3/q0;->o:J

    .line 7
    .line 8
    iput-object p4, p0, Lv3/q0;->j:Lr5/o;

    .line 9
    .line 10
    iput-object p6, p0, Lv3/q0;->k:Lv3/z0;

    .line 11
    .line 12
    iget-object p2, p7, Lv3/r0;->a:Lz4/t$b;

    .line 13
    .line 14
    iget-object p3, p2, Lz4/s;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, p0, Lv3/q0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p7, p0, Lv3/q0;->f:Lv3/r0;

    .line 19
    .line 20
    sget-object p3, Lz4/j0;->d:Lz4/j0;

    .line 21
    .line 22
    iput-object p3, p0, Lv3/q0;->m:Lz4/j0;

    .line 23
    .line 24
    iput-object p8, p0, Lv3/q0;->n:Lr5/p;

    .line 25
    .line 26
    array-length p3, p1

    .line 27
    new-array p3, p3, [Lz4/c0;

    .line 28
    .line 29
    iput-object p3, p0, Lv3/q0;->c:[Lz4/c0;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    new-array p1, p1, [Z

    .line 33
    .line 34
    iput-object p1, p0, Lv3/q0;->h:[Z

    .line 35
    .line 36
    iget-wide p3, p7, Lv3/r0;->b:J

    .line 37
    .line 38
    iget-wide v5, p7, Lv3/r0;->d:J

    .line 39
    .line 40
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p1, p2, Lz4/s;->a:Ljava/lang/Object;

    .line 44
    .line 45
    sget p7, Lv3/a;->e:I

    .line 46
    .line 47
    check-cast p1, Landroid/util/Pair;

    .line 48
    .line 49
    iget-object p7, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lz4/t$b;->b(Ljava/lang/Object;)Lz4/t$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p2, p6, Lv3/z0;->d:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {p2, p7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Lv3/z0$c;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p7, p6, Lv3/z0;->g:Ljava/util/HashSet;

    .line 69
    .line 70
    invoke-virtual {p7, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object p7, p6, Lv3/z0;->f:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {p7, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p7

    .line 79
    check-cast p7, Lv3/z0$b;

    .line 80
    .line 81
    if-eqz p7, :cond_0

    .line 82
    .line 83
    iget-object p8, p7, Lv3/z0$b;->a:Lz4/t;

    .line 84
    .line 85
    iget-object p7, p7, Lv3/z0$b;->b:Lz4/t$c;

    .line 86
    .line 87
    invoke-interface {p8, p7}, Lz4/t;->b(Lz4/t$c;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    iget-object p7, p2, Lv3/z0$c;->c:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object p7, p2, Lv3/z0$c;->a:Lz4/p;

    .line 96
    .line 97
    invoke-virtual {p7, p1, p5, p3, p4}, Lz4/p;->F(Lz4/t$b;Lt5/b;J)Lz4/o;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object p1, p6, Lv3/z0;->c:Ljava/util/IdentityHashMap;

    .line 102
    .line 103
    invoke-virtual {p1, v1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p6}, Lv3/z0;->d()V

    .line 107
    .line 108
    .line 109
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    cmp-long p1, v5, p1

    .line 115
    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    new-instance p1, Lz4/c;

    .line 119
    .line 120
    const/4 v2, 0x1

    .line 121
    const-wide/16 v3, 0x0

    .line 122
    .line 123
    move-object v0, p1

    .line 124
    invoke-direct/range {v0 .. v6}, Lz4/c;-><init>(Lz4/r;ZJJ)V

    .line 125
    .line 126
    .line 127
    move-object v1, p1

    .line 128
    :cond_1
    iput-object v1, p0, Lv3/q0;->a:Lz4/r;

    .line 129
    .line 130
    return-void
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
.end method


# virtual methods
.method public final a(Lr5/p;JZ[Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget v4, v1, Lr5/p;->a:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v3, v4, :cond_1

    .line 11
    .line 12
    iget-object v4, v0, Lv3/q0;->h:[Z

    .line 13
    .line 14
    if-nez p4, :cond_0

    .line 15
    .line 16
    iget-object v6, v0, Lv3/q0;->n:Lr5/p;

    .line 17
    .line 18
    invoke-virtual {v1, v6, v3}, Lr5/p;->a(Lr5/p;I)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v5, v2

    .line 26
    :goto_1
    aput-boolean v5, v4, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v3, v0, Lv3/q0;->c:[Lz4/c0;

    .line 32
    .line 33
    move v4, v2

    .line 34
    :goto_2
    iget-object v6, v0, Lv3/q0;->i:[Lv3/k1;

    .line 35
    .line 36
    array-length v7, v6

    .line 37
    const/4 v8, -0x2

    .line 38
    if-ge v4, v7, :cond_3

    .line 39
    .line 40
    aget-object v6, v6, v4

    .line 41
    .line 42
    check-cast v6, Lv3/f;

    .line 43
    .line 44
    iget v6, v6, Lv3/f;->a:I

    .line 45
    .line 46
    if-ne v6, v8, :cond_2

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    aput-object v6, v3, v4

    .line 50
    .line 51
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lv3/q0;->b()V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lv3/q0;->n:Lr5/p;

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p0}, Lv3/q0;->c()V

    .line 60
    .line 61
    .line 62
    iget-object v9, v0, Lv3/q0;->a:Lz4/r;

    .line 63
    .line 64
    iget-object v10, v1, Lr5/p;->c:[Lr5/h;

    .line 65
    .line 66
    iget-object v11, v0, Lv3/q0;->h:[Z

    .line 67
    .line 68
    iget-object v12, v0, Lv3/q0;->c:[Lz4/c0;

    .line 69
    .line 70
    move-object/from16 v13, p5

    .line 71
    .line 72
    move-wide/from16 v14, p2

    .line 73
    .line 74
    invoke-interface/range {v9 .. v15}, Lz4/r;->i([Lr5/h;[Z[Lz4/c0;[ZJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    iget-object v6, v0, Lv3/q0;->c:[Lz4/c0;

    .line 79
    .line 80
    move v7, v2

    .line 81
    :goto_3
    iget-object v9, v0, Lv3/q0;->i:[Lv3/k1;

    .line 82
    .line 83
    array-length v10, v9

    .line 84
    if-ge v7, v10, :cond_5

    .line 85
    .line 86
    aget-object v9, v9, v7

    .line 87
    .line 88
    check-cast v9, Lv3/f;

    .line 89
    .line 90
    iget v9, v9, Lv3/f;->a:I

    .line 91
    .line 92
    if-ne v9, v8, :cond_4

    .line 93
    .line 94
    iget-object v9, v0, Lv3/q0;->n:Lr5/p;

    .line 95
    .line 96
    invoke-virtual {v9, v7}, Lr5/p;->b(I)Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_4

    .line 101
    .line 102
    new-instance v9, Lz4/k;

    .line 103
    .line 104
    invoke-direct {v9}, Lz4/k;-><init>()V

    .line 105
    .line 106
    .line 107
    aput-object v9, v6, v7

    .line 108
    .line 109
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    iput-boolean v2, v0, Lv3/q0;->e:Z

    .line 113
    .line 114
    move v6, v2

    .line 115
    :goto_4
    iget-object v7, v0, Lv3/q0;->c:[Lz4/c0;

    .line 116
    .line 117
    array-length v9, v7

    .line 118
    if-ge v6, v9, :cond_9

    .line 119
    .line 120
    aget-object v7, v7, v6

    .line 121
    .line 122
    if-eqz v7, :cond_6

    .line 123
    .line 124
    invoke-virtual {v1, v6}, Lr5/p;->b(I)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 129
    .line 130
    .line 131
    iget-object v7, v0, Lv3/q0;->i:[Lv3/k1;

    .line 132
    .line 133
    aget-object v7, v7, v6

    .line 134
    .line 135
    check-cast v7, Lv3/f;

    .line 136
    .line 137
    iget v7, v7, Lv3/f;->a:I

    .line 138
    .line 139
    if-eq v7, v8, :cond_8

    .line 140
    .line 141
    iput-boolean v5, v0, Lv3/q0;->e:Z

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget-object v7, v1, Lr5/p;->c:[Lr5/h;

    .line 145
    .line 146
    aget-object v7, v7, v6

    .line 147
    .line 148
    if-nez v7, :cond_7

    .line 149
    .line 150
    move v7, v5

    .line 151
    goto :goto_5

    .line 152
    :cond_7
    move v7, v2

    .line 153
    :goto_5
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    return-wide v3
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
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/q0;->l:Lv3/q0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    :goto_1
    iget-object v0, p0, Lv3/q0;->n:Lr5/p;

    .line 13
    .line 14
    iget v2, v0, Lr5/p;->a:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lr5/p;->b(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lv3/q0;->n:Lr5/p;

    .line 23
    .line 24
    iget-object v2, v2, Lr5/p;->c:[Lr5/h;

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v2}, Lr5/h;->g()V

    .line 33
    .line 34
    .line 35
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    return-void
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

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/q0;->l:Lv3/q0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    :goto_1
    iget-object v0, p0, Lv3/q0;->n:Lr5/p;

    .line 13
    .line 14
    iget v2, v0, Lr5/p;->a:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lr5/p;->b(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lv3/q0;->n:Lr5/p;

    .line 23
    .line 24
    iget-object v2, v2, Lr5/p;->c:[Lr5/h;

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v2}, Lr5/h;->m()V

    .line 33
    .line 34
    .line 35
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    return-void
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

.method public final d()J
    .locals 5

    iget-boolean v0, p0, Lv3/q0;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lv3/q0;->f:Lv3/r0;

    iget-wide v0, v0, Lv3/r0;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lv3/q0;->e:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv3/q0;->a:Lz4/r;

    invoke-interface {v0}, Lz4/r;->g()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lv3/q0;->f:Lv3/r0;

    iget-wide v3, v0, Lv3/r0;->e:J

    :cond_2
    return-wide v3
.end method

.method public final e()J
    .locals 4

    iget-object v0, p0, Lv3/q0;->f:Lv3/r0;

    iget-wide v0, v0, Lv3/r0;->b:J

    iget-wide v2, p0, Lv3/q0;->o:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final f()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv3/q0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv3/q0;->k:Lv3/z0;

    .line 5
    .line 6
    iget-object v1, p0, Lv3/q0;->a:Lz4/r;

    .line 7
    .line 8
    :try_start_0
    instance-of v2, v1, Lz4/c;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v1, Lz4/c;

    .line 13
    .line 14
    iget-object v1, v1, Lz4/c;->a:Lz4/r;

    .line 15
    .line 16
    :cond_0
    iget-object v2, v0, Lv3/z0;->c:Ljava/util/IdentityHashMap;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lv3/z0$c;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v3, v2, Lv3/z0$c;->a:Lz4/p;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Lz4/p;->g(Lz4/r;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v2, Lv3/z0$c;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    check-cast v1, Lz4/o;

    .line 35
    .line 36
    iget-object v1, v1, Lz4/o;->a:Lz4/t$b;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lv3/z0;->c:Ljava/util/IdentityHashMap;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Lv3/z0;->d()V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0, v2}, Lv3/z0;->e(Lv3/z0$c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    const-string v1, "MediaPeriodHolder"

    .line 58
    .line 59
    const-string v2, "Period release failed."

    .line 60
    .line 61
    invoke-static {v1, v2, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void
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

.method public final g(FLv3/r1;)Lr5/p;
    .locals 4

    .line 1
    iget-object p2, p0, Lv3/q0;->j:Lr5/o;

    .line 2
    .line 3
    iget-object v0, p0, Lv3/q0;->i:[Lv3/k1;

    .line 4
    .line 5
    iget-object v1, p0, Lv3/q0;->m:Lz4/j0;

    .line 6
    .line 7
    iget-object v2, p0, Lv3/q0;->f:Lv3/r0;

    .line 8
    .line 9
    iget-object v2, v2, Lv3/r0;->a:Lz4/t$b;

    .line 10
    .line 11
    invoke-virtual {p2, v0, v1}, Lr5/o;->c([Lv3/k1;Lz4/j0;)Lr5/p;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p2, Lr5/p;->c:[Lr5/h;

    .line 16
    .line 17
    array-length v1, v0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_1

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v3, p1}, Lr5/h;->r(F)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-object p2
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

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/q0;->a:Lz4/r;

    .line 2
    .line 3
    instance-of v1, v0, Lz4/c;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lv3/q0;->f:Lv3/r0;

    .line 8
    .line 9
    iget-wide v1, v1, Lv3/r0;->d:J

    .line 10
    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v3, v1, v3

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const-wide/high16 v1, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, Lz4/c;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    iput-wide v3, v0, Lz4/c;->e:J

    .line 27
    .line 28
    iput-wide v1, v0, Lz4/c;->f:J

    .line 29
    .line 30
    :cond_1
    return-void
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
