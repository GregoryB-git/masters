.class public final Lg4/e;
.super Lg4/d;
.source "SourceFile"


# instance fields
.field public final b:Lv5/u;

.field public final c:Lv5/u;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(Lc4/v;)V
    .locals 1

    invoke-direct {p0, p1}, Lg4/d;-><init>(Lc4/v;)V

    new-instance p1, Lv5/u;

    sget-object v0, Lv5/q;->a:[B

    invoke-direct {p1, v0}, Lv5/u;-><init>([B)V

    iput-object p1, p0, Lg4/e;->b:Lv5/u;

    new-instance p1, Lv5/u;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lv5/u;-><init>(I)V

    iput-object p1, p0, Lg4/e;->c:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    shr-int/lit8 v0, p1, 0x4

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xf

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0xf

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-ne p1, v1, :cond_1

    .line 13
    .line 14
    iput v0, p0, Lg4/e;->g:I

    .line 15
    .line 16
    const/4 p1, 0x5

    .line 17
    if-eq v0, p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1

    .line 23
    :cond_1
    new-instance v0, Lg4/d$a;

    .line 24
    .line 25
    const-string v1, "Video format not supported: "

    .line 26
    .line 27
    invoke-static {v1, p1}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Lg4/d$a;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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
.end method

.method public final b(JLv5/u;)Z
    .locals 10

    .line 1
    invoke-virtual {p3}, Lv5/u;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p3, Lv5/u;->a:[B

    .line 6
    .line 7
    iget v2, p3, Lv5/u;->b:I

    .line 8
    .line 9
    add-int/lit8 v3, v2, 0x1

    .line 10
    .line 11
    aget-byte v2, v1, v2

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x18

    .line 16
    .line 17
    shr-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x1

    .line 20
    .line 21
    aget-byte v3, v1, v3

    .line 22
    .line 23
    and-int/lit16 v3, v3, 0xff

    .line 24
    .line 25
    shl-int/lit8 v3, v3, 0x8

    .line 26
    .line 27
    or-int/2addr v2, v3

    .line 28
    add-int/lit8 v3, v4, 0x1

    .line 29
    .line 30
    iput v3, p3, Lv5/u;->b:I

    .line 31
    .line 32
    aget-byte v1, v1, v4

    .line 33
    .line 34
    and-int/lit16 v1, v1, 0xff

    .line 35
    .line 36
    or-int/2addr v1, v2

    .line 37
    int-to-long v1, v1

    .line 38
    const-wide/16 v3, 0x3e8

    .line 39
    .line 40
    mul-long/2addr v1, v3

    .line 41
    add-long v4, v1, p1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    const/4 p2, 0x0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    iget-boolean v1, p0, Lg4/e;->e:Z

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    new-instance v0, Lv5/u;

    .line 52
    .line 53
    iget v1, p3, Lv5/u;->c:I

    .line 54
    .line 55
    iget v2, p3, Lv5/u;->b:I

    .line 56
    .line 57
    sub-int/2addr v1, v2

    .line 58
    new-array v1, v1, [B

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lv5/u;-><init>([B)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lv5/u;->a:[B

    .line 64
    .line 65
    iget v2, p3, Lv5/u;->c:I

    .line 66
    .line 67
    iget v3, p3, Lv5/u;->b:I

    .line 68
    .line 69
    sub-int/2addr v2, v3

    .line 70
    invoke-virtual {p3, v1, p2, v2}, Lv5/u;->d([BII)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lw5/a;->a(Lv5/u;)Lw5/a;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    iget v0, p3, Lw5/a;->b:I

    .line 78
    .line 79
    iput v0, p0, Lg4/e;->d:I

    .line 80
    .line 81
    new-instance v0, Lv3/i0$a;

    .line 82
    .line 83
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v1, "video/avc"

    .line 87
    .line 88
    iput-object v1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v1, p3, Lw5/a;->f:Ljava/lang/String;

    .line 91
    .line 92
    iput-object v1, v0, Lv3/i0$a;->h:Ljava/lang/String;

    .line 93
    .line 94
    iget v1, p3, Lw5/a;->c:I

    .line 95
    .line 96
    iput v1, v0, Lv3/i0$a;->p:I

    .line 97
    .line 98
    iget v1, p3, Lw5/a;->d:I

    .line 99
    .line 100
    iput v1, v0, Lv3/i0$a;->q:I

    .line 101
    .line 102
    iget v1, p3, Lw5/a;->e:F

    .line 103
    .line 104
    iput v1, v0, Lv3/i0$a;->t:F

    .line 105
    .line 106
    iget-object p3, p3, Lw5/a;->a:Ljava/util/List;

    .line 107
    .line 108
    iput-object p3, v0, Lv3/i0$a;->m:Ljava/util/List;

    .line 109
    .line 110
    new-instance p3, Lv3/i0;

    .line 111
    .line 112
    invoke-direct {p3, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lg4/d;->a:Lc4/v;

    .line 116
    .line 117
    invoke-interface {v0, p3}, Lc4/v;->d(Lv3/i0;)V

    .line 118
    .line 119
    .line 120
    iput-boolean p1, p0, Lg4/e;->e:Z

    .line 121
    .line 122
    return p2

    .line 123
    :cond_0
    if-ne v0, p1, :cond_4

    .line 124
    .line 125
    iget-boolean v0, p0, Lg4/e;->e:Z

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget v0, p0, Lg4/e;->g:I

    .line 130
    .line 131
    if-ne v0, p1, :cond_1

    .line 132
    .line 133
    move v6, p1

    .line 134
    goto :goto_0

    .line 135
    :cond_1
    move v6, p2

    .line 136
    :goto_0
    iget-boolean v0, p0, Lg4/e;->f:Z

    .line 137
    .line 138
    if-nez v0, :cond_2

    .line 139
    .line 140
    if-nez v6, :cond_2

    .line 141
    .line 142
    return p2

    .line 143
    :cond_2
    iget-object v0, p0, Lg4/e;->c:Lv5/u;

    .line 144
    .line 145
    iget-object v0, v0, Lv5/u;->a:[B

    .line 146
    .line 147
    aput-byte p2, v0, p2

    .line 148
    .line 149
    aput-byte p2, v0, p1

    .line 150
    .line 151
    const/4 v1, 0x2

    .line 152
    aput-byte p2, v0, v1

    .line 153
    .line 154
    iget v0, p0, Lg4/e;->d:I

    .line 155
    .line 156
    const/4 v1, 0x4

    .line 157
    rsub-int/lit8 v0, v0, 0x4

    .line 158
    .line 159
    move v7, p2

    .line 160
    :goto_1
    iget v2, p3, Lv5/u;->c:I

    .line 161
    .line 162
    iget v3, p3, Lv5/u;->b:I

    .line 163
    .line 164
    sub-int/2addr v2, v3

    .line 165
    if-lez v2, :cond_3

    .line 166
    .line 167
    iget-object v2, p0, Lg4/e;->c:Lv5/u;

    .line 168
    .line 169
    iget-object v2, v2, Lv5/u;->a:[B

    .line 170
    .line 171
    iget v3, p0, Lg4/e;->d:I

    .line 172
    .line 173
    invoke-virtual {p3, v2, v0, v3}, Lv5/u;->d([BII)V

    .line 174
    .line 175
    .line 176
    iget-object v2, p0, Lg4/e;->c:Lv5/u;

    .line 177
    .line 178
    invoke-virtual {v2, p2}, Lv5/u;->G(I)V

    .line 179
    .line 180
    .line 181
    iget-object v2, p0, Lg4/e;->c:Lv5/u;

    .line 182
    .line 183
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    iget-object v3, p0, Lg4/e;->b:Lv5/u;

    .line 188
    .line 189
    invoke-virtual {v3, p2}, Lv5/u;->G(I)V

    .line 190
    .line 191
    .line 192
    iget-object v3, p0, Lg4/d;->a:Lc4/v;

    .line 193
    .line 194
    iget-object v8, p0, Lg4/e;->b:Lv5/u;

    .line 195
    .line 196
    invoke-interface {v3, v1, v8}, Lc4/v;->b(ILv5/u;)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v7, v7, 0x4

    .line 200
    .line 201
    iget-object v3, p0, Lg4/d;->a:Lc4/v;

    .line 202
    .line 203
    invoke-interface {v3, v2, p3}, Lc4/v;->b(ILv5/u;)V

    .line 204
    .line 205
    .line 206
    add-int/2addr v7, v2

    .line 207
    goto :goto_1

    .line 208
    :cond_3
    iget-object v3, p0, Lg4/d;->a:Lc4/v;

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v9, 0x0

    .line 212
    invoke-interface/range {v3 .. v9}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 213
    .line 214
    .line 215
    iput-boolean p1, p0, Lg4/e;->f:Z

    .line 216
    .line 217
    return p1

    .line 218
    :cond_4
    return p2
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
