.class public final Lm4/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lv5/c0;

.field public final b:Lv5/u;


# direct methods
.method public constructor <init>(Lv5/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/u$a;->a:Lv5/c0;

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Lm4/u$a;->b:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lm4/u$a;->b:Lv5/u;

    sget-object v1, Lv5/e0;->f:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    invoke-virtual {v0, v1, v2}, Lv5/u;->E([BI)V

    return-void
.end method

.method public final b(Lc4/i;J)Lc4/a$e;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 4
    .line 5
    .line 6
    move-result-wide v5

    .line 7
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, v5

    .line 12
    const-wide/16 v3, 0x4e20

    .line 13
    .line 14
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    long-to-int v1, v1

    .line 19
    iget-object v2, v0, Lm4/u$a;->b:Lv5/u;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Lv5/u;->D(I)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Lm4/u$a;->b:Lv5/u;

    .line 25
    .line 26
    iget-object v2, v2, Lv5/u;->a:[B

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move-object/from16 v4, p1

    .line 30
    .line 31
    invoke-interface {v4, v2, v3, v1}, Lc4/i;->m([BII)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lm4/u$a;->b:Lv5/u;

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    move v7, v2

    .line 43
    move-wide v10, v3

    .line 44
    :goto_0
    iget v8, v1, Lv5/u;->c:I

    .line 45
    .line 46
    iget v9, v1, Lv5/u;->b:I

    .line 47
    .line 48
    sub-int/2addr v8, v9

    .line 49
    const/4 v12, 0x4

    .line 50
    if-lt v8, v12, :cond_e

    .line 51
    .line 52
    iget-object v8, v1, Lv5/u;->a:[B

    .line 53
    .line 54
    invoke-static {v8, v9}, Lm4/u;->d([BI)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    const/4 v9, 0x1

    .line 59
    const/16 v13, 0x1ba

    .line 60
    .line 61
    if-eq v8, v13, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1, v9}, Lv5/u;->H(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1, v12}, Lv5/u;->H(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lm4/v;->c(Lv5/u;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v14

    .line 74
    cmp-long v2, v14, v3

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    iget-object v2, v0, Lm4/u$a;->a:Lv5/c0;

    .line 79
    .line 80
    invoke-virtual {v2, v14, v15}, Lv5/c0;->b(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    cmp-long v2, v14, p2

    .line 85
    .line 86
    if-lez v2, :cond_2

    .line 87
    .line 88
    cmp-long v1, v10, v3

    .line 89
    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    new-instance v7, Lc4/a$e;

    .line 93
    .line 94
    const/4 v2, -0x1

    .line 95
    move-object v1, v7

    .line 96
    move-wide v3, v14

    .line 97
    invoke-direct/range {v1 .. v6}, Lc4/a$e;-><init>(IJJ)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_1
    int-to-long v1, v7

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    const-wide/32 v7, 0x186a0

    .line 105
    .line 106
    .line 107
    add-long/2addr v7, v14

    .line 108
    cmp-long v2, v7, p2

    .line 109
    .line 110
    if-lez v2, :cond_3

    .line 111
    .line 112
    iget v1, v1, Lv5/u;->b:I

    .line 113
    .line 114
    int-to-long v1, v1

    .line 115
    :goto_1
    add-long/2addr v5, v1

    .line 116
    invoke-static {v5, v6}, Lc4/a$e;->a(J)Lc4/a$e;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_3
    iget v2, v1, Lv5/u;->b:I

    .line 123
    .line 124
    move v7, v2

    .line 125
    move-wide v10, v14

    .line 126
    :cond_4
    iget v2, v1, Lv5/u;->c:I

    .line 127
    .line 128
    iget v8, v1, Lv5/u;->b:I

    .line 129
    .line 130
    sub-int v8, v2, v8

    .line 131
    .line 132
    const/16 v14, 0xa

    .line 133
    .line 134
    if-ge v8, v14, :cond_5

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    const/16 v8, 0x9

    .line 138
    .line 139
    invoke-virtual {v1, v8}, Lv5/u;->H(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lv5/u;->v()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    and-int/lit8 v8, v8, 0x7

    .line 147
    .line 148
    iget v14, v1, Lv5/u;->c:I

    .line 149
    .line 150
    iget v15, v1, Lv5/u;->b:I

    .line 151
    .line 152
    sub-int/2addr v14, v15

    .line 153
    if-ge v14, v8, :cond_6

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    invoke-virtual {v1, v8}, Lv5/u;->H(I)V

    .line 157
    .line 158
    .line 159
    iget v8, v1, Lv5/u;->c:I

    .line 160
    .line 161
    iget v14, v1, Lv5/u;->b:I

    .line 162
    .line 163
    sub-int/2addr v8, v14

    .line 164
    if-ge v8, v12, :cond_7

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    iget-object v8, v1, Lv5/u;->a:[B

    .line 168
    .line 169
    invoke-static {v8, v14}, Lm4/u;->d([BI)I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    const/16 v14, 0x1bb

    .line 174
    .line 175
    if-ne v8, v14, :cond_9

    .line 176
    .line 177
    invoke-virtual {v1, v12}, Lv5/u;->H(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    iget v14, v1, Lv5/u;->c:I

    .line 185
    .line 186
    iget v15, v1, Lv5/u;->b:I

    .line 187
    .line 188
    sub-int/2addr v14, v15

    .line 189
    if-ge v14, v8, :cond_8

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    invoke-virtual {v1, v8}, Lv5/u;->H(I)V

    .line 193
    .line 194
    .line 195
    :cond_9
    :goto_2
    iget v8, v1, Lv5/u;->c:I

    .line 196
    .line 197
    iget v14, v1, Lv5/u;->b:I

    .line 198
    .line 199
    sub-int/2addr v8, v14

    .line 200
    if-lt v8, v12, :cond_d

    .line 201
    .line 202
    iget-object v8, v1, Lv5/u;->a:[B

    .line 203
    .line 204
    invoke-static {v8, v14}, Lm4/u;->d([BI)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-eq v8, v13, :cond_d

    .line 209
    .line 210
    const/16 v14, 0x1b9

    .line 211
    .line 212
    if-ne v8, v14, :cond_a

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_a
    ushr-int/lit8 v8, v8, 0x8

    .line 216
    .line 217
    if-eq v8, v9, :cond_b

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_b
    invoke-virtual {v1, v12}, Lv5/u;->H(I)V

    .line 221
    .line 222
    .line 223
    iget v8, v1, Lv5/u;->c:I

    .line 224
    .line 225
    iget v14, v1, Lv5/u;->b:I

    .line 226
    .line 227
    sub-int/2addr v8, v14

    .line 228
    const/4 v14, 0x2

    .line 229
    if-ge v8, v14, :cond_c

    .line 230
    .line 231
    :goto_3
    invoke-virtual {v1, v2}, Lv5/u;->G(I)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_c
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    iget v14, v1, Lv5/u;->c:I

    .line 240
    .line 241
    iget v15, v1, Lv5/u;->b:I

    .line 242
    .line 243
    add-int/2addr v15, v8

    .line 244
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-virtual {v1, v8}, Lv5/u;->G(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_d
    :goto_4
    iget v2, v1, Lv5/u;->b:I

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_e
    cmp-long v1, v10, v3

    .line 257
    .line 258
    if-eqz v1, :cond_f

    .line 259
    .line 260
    int-to-long v1, v2

    .line 261
    add-long v12, v5, v1

    .line 262
    .line 263
    new-instance v7, Lc4/a$e;

    .line 264
    .line 265
    const/4 v9, -0x2

    .line 266
    move-object v8, v7

    .line 267
    invoke-direct/range {v8 .. v13}, Lc4/a$e;-><init>(IJJ)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_f
    sget-object v7, Lc4/a$e;->d:Lc4/a$e;

    .line 272
    .line 273
    :goto_5
    return-object v7
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
