.class public abstract Lc4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/a$a;,
        Lc4/a$e;,
        Lc4/a$c;,
        Lc4/a$d;,
        Lc4/a$b;,
        Lc4/a$f;
    }
.end annotation


# instance fields
.field public final a:Lc4/a$a;

.field public final b:Lc4/a$f;

.field public c:Lc4/a$c;

.field public final d:I


# direct methods
.method public constructor <init>(Lc4/a$d;Lc4/a$f;JJJJJI)V
    .locals 14

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p2

    iput-object v1, v0, Lc4/a;->b:Lc4/a$f;

    move/from16 v1, p13

    iput v1, v0, Lc4/a;->d:I

    new-instance v13, Lc4/a$a;

    move-object v1, v13

    move-object v2, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    invoke-direct/range {v1 .. v12}, Lc4/a$a;-><init>(Lc4/a$d;JJJJJ)V

    iput-object v13, v0, Lc4/a;->a:Lc4/a$a;

    return-void
.end method

.method public static b(Lc4/i;JLc4/s;)I
    .locals 2

    invoke-interface {p0}, Lc4/i;->getPosition()J

    move-result-wide v0

    cmp-long p0, p1, v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iput-wide p1, p3, Lc4/s;->a:J

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Lc4/i;Lc4/s;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    iget-object v3, v0, Lc4/a;->c:Lc4/a$c;

    .line 8
    .line 9
    invoke-static {v3}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v4, v3, Lc4/a$c;->f:J

    .line 13
    .line 14
    iget-wide v6, v3, Lc4/a$c;->g:J

    .line 15
    .line 16
    iget-wide v8, v3, Lc4/a$c;->h:J

    .line 17
    .line 18
    sub-long/2addr v6, v4

    .line 19
    iget v10, v0, Lc4/a;->d:I

    .line 20
    .line 21
    int-to-long v10, v10

    .line 22
    cmp-long v6, v6, v10

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-gtz v6, :cond_0

    .line 26
    .line 27
    iput-object v7, v0, Lc4/a;->c:Lc4/a$c;

    .line 28
    .line 29
    iget-object v3, v0, Lc4/a;->b:Lc4/a$f;

    .line 30
    .line 31
    invoke-interface {v3}, Lc4/a$f;->a()V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v4, v5, v2}, Lc4/a;->b(Lc4/i;JLc4/s;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    return v1

    .line 39
    :cond_0
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    sub-long v4, v8, v4

    .line 44
    .line 45
    const-wide/16 v10, 0x0

    .line 46
    .line 47
    cmp-long v6, v4, v10

    .line 48
    .line 49
    const-wide/32 v12, 0x40000

    .line 50
    .line 51
    .line 52
    if-ltz v6, :cond_1

    .line 53
    .line 54
    cmp-long v6, v4, v12

    .line 55
    .line 56
    if-gtz v6, :cond_1

    .line 57
    .line 58
    long-to-int v4, v4

    .line 59
    invoke-interface {v1, v4}, Lc4/i;->j(I)V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/4 v4, 0x0

    .line 65
    :goto_1
    if-nez v4, :cond_2

    .line 66
    .line 67
    invoke-static {v1, v8, v9, v2}, Lc4/a;->b(Lc4/i;JLc4/s;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    return v1

    .line 72
    :cond_2
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 73
    .line 74
    .line 75
    iget-object v4, v0, Lc4/a;->b:Lc4/a$f;

    .line 76
    .line 77
    iget-wide v5, v3, Lc4/a$c;->b:J

    .line 78
    .line 79
    invoke-interface {v4, v1, v5, v6}, Lc4/a$f;->b(Lc4/i;J)Lc4/a$e;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget v5, v4, Lc4/a$e;->a:I

    .line 84
    .line 85
    const/4 v6, -0x3

    .line 86
    if-eq v5, v6, :cond_7

    .line 87
    .line 88
    const/4 v6, -0x2

    .line 89
    if-eq v5, v6, :cond_6

    .line 90
    .line 91
    const/4 v6, -0x1

    .line 92
    if-eq v5, v6, :cond_5

    .line 93
    .line 94
    if-nez v5, :cond_4

    .line 95
    .line 96
    iget-wide v5, v4, Lc4/a$e;->c:J

    .line 97
    .line 98
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 99
    .line 100
    .line 101
    move-result-wide v8

    .line 102
    sub-long/2addr v5, v8

    .line 103
    cmp-long v3, v5, v10

    .line 104
    .line 105
    if-ltz v3, :cond_3

    .line 106
    .line 107
    cmp-long v3, v5, v12

    .line 108
    .line 109
    if-gtz v3, :cond_3

    .line 110
    .line 111
    long-to-int v3, v5

    .line 112
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iput-object v7, v0, Lc4/a;->c:Lc4/a$c;

    .line 116
    .line 117
    iget-object v3, v0, Lc4/a;->b:Lc4/a$f;

    .line 118
    .line 119
    invoke-interface {v3}, Lc4/a$f;->a()V

    .line 120
    .line 121
    .line 122
    iget-wide v3, v4, Lc4/a$e;->c:J

    .line 123
    .line 124
    invoke-static {v1, v3, v4, v2}, Lc4/a;->b(Lc4/i;JLc4/s;)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    return v1

    .line 129
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v2, "Invalid case"

    .line 132
    .line 133
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :cond_5
    iget-wide v8, v4, Lc4/a$e;->b:J

    .line 138
    .line 139
    iget-wide v12, v4, Lc4/a$e;->c:J

    .line 140
    .line 141
    iput-wide v8, v3, Lc4/a$c;->e:J

    .line 142
    .line 143
    iput-wide v12, v3, Lc4/a$c;->g:J

    .line 144
    .line 145
    iget-wide v4, v3, Lc4/a$c;->b:J

    .line 146
    .line 147
    iget-wide v6, v3, Lc4/a$c;->d:J

    .line 148
    .line 149
    iget-wide v10, v3, Lc4/a$c;->f:J

    .line 150
    .line 151
    iget-wide v14, v3, Lc4/a$c;->c:J

    .line 152
    .line 153
    invoke-static/range {v4 .. v15}, Lc4/a$c;->a(JJJJJJ)J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    iput-wide v4, v3, Lc4/a$c;->h:J

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_6
    iget-wide v8, v4, Lc4/a$e;->b:J

    .line 162
    .line 163
    iget-wide v12, v4, Lc4/a$e;->c:J

    .line 164
    .line 165
    iput-wide v8, v3, Lc4/a$c;->d:J

    .line 166
    .line 167
    iput-wide v12, v3, Lc4/a$c;->f:J

    .line 168
    .line 169
    iget-wide v6, v3, Lc4/a$c;->b:J

    .line 170
    .line 171
    iget-wide v10, v3, Lc4/a$c;->e:J

    .line 172
    .line 173
    iget-wide v14, v3, Lc4/a$c;->g:J

    .line 174
    .line 175
    iget-wide v4, v3, Lc4/a$c;->c:J

    .line 176
    .line 177
    move-wide/from16 v16, v4

    .line 178
    .line 179
    invoke-static/range {v6 .. v17}, Lc4/a$c;->a(JJJJJJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v4

    .line 183
    iput-wide v4, v3, Lc4/a$c;->h:J

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_7
    iput-object v7, v0, Lc4/a;->c:Lc4/a$c;

    .line 188
    .line 189
    iget-object v3, v0, Lc4/a;->b:Lc4/a$f;

    .line 190
    .line 191
    invoke-interface {v3}, Lc4/a$f;->a()V

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v8, v9, v2}, Lc4/a;->b(Lc4/i;JLc4/s;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    return v1
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

.method public final c(J)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v0, Lc4/a;->c:Lc4/a$c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Lc4/a$c;->a:J

    .line 10
    .line 11
    cmp-long v1, v4, v2

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v14, Lc4/a$c;

    .line 17
    .line 18
    iget-object v1, v0, Lc4/a;->a:Lc4/a$a;

    .line 19
    .line 20
    iget-object v1, v1, Lc4/a$a;->a:Lc4/a$d;

    .line 21
    .line 22
    invoke-interface {v1, v2, v3}, Lc4/a$d;->a(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-object v1, v0, Lc4/a;->a:Lc4/a$a;

    .line 27
    .line 28
    iget-wide v6, v1, Lc4/a$a;->c:J

    .line 29
    .line 30
    iget-wide v8, v1, Lc4/a$a;->d:J

    .line 31
    .line 32
    iget-wide v10, v1, Lc4/a$a;->e:J

    .line 33
    .line 34
    iget-wide v12, v1, Lc4/a$a;->f:J

    .line 35
    .line 36
    move-wide v15, v12

    .line 37
    iget-wide v12, v1, Lc4/a$a;->g:J

    .line 38
    .line 39
    move-object v1, v14

    .line 40
    move-wide/from16 v2, p1

    .line 41
    .line 42
    move-wide/from16 v17, v12

    .line 43
    .line 44
    move-wide v12, v15

    .line 45
    move-object/from16 v19, v14

    .line 46
    .line 47
    move-wide/from16 v14, v17

    .line 48
    .line 49
    invoke-direct/range {v1 .. v15}, Lc4/a$c;-><init>(JJJJJJJ)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v1, v19

    .line 53
    .line 54
    iput-object v1, v0, Lc4/a;->c:Lc4/a$c;

    .line 55
    .line 56
    return-void
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
