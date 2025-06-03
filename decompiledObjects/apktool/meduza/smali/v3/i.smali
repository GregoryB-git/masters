.class public final Lv3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/m0;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:J

.field public final d:F

.field public final e:J

.field public final f:J

.field public final g:F

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:J

.field public n:F

.field public o:F

.field public p:F

.field public q:J

.field public r:J

.field public s:J


# direct methods
.method public constructor <init>(FFJFJJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv3/i;->a:F

    iput p2, p0, Lv3/i;->b:F

    iput-wide p3, p0, Lv3/i;->c:J

    iput p5, p0, Lv3/i;->d:F

    iput-wide p6, p0, Lv3/i;->e:J

    iput-wide p8, p0, Lv3/i;->f:J

    iput p10, p0, Lv3/i;->g:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lv3/i;->h:J

    iput-wide p3, p0, Lv3/i;->i:J

    iput-wide p3, p0, Lv3/i;->k:J

    iput-wide p3, p0, Lv3/i;->l:J

    iput p1, p0, Lv3/i;->o:F

    iput p2, p0, Lv3/i;->n:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lv3/i;->p:F

    iput-wide p3, p0, Lv3/i;->q:J

    iput-wide p3, p0, Lv3/i;->j:J

    iput-wide p3, p0, Lv3/i;->m:J

    iput-wide p3, p0, Lv3/i;->r:J

    iput-wide p3, p0, Lv3/i;->s:J

    return-void
.end method


# virtual methods
.method public final a(JJ)F
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    iget-wide v1, v0, Lv3/i;->h:J

    .line 3
    .line 4
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmp-long v1, v1, v3

    .line 10
    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    sub-long v5, p1, p3

    .line 17
    .line 18
    iget-wide v7, v0, Lv3/i;->r:J

    .line 19
    .line 20
    cmp-long v1, v7, v3

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iput-wide v5, v0, Lv3/i;->r:J

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget v1, v0, Lv3/i;->g:F

    .line 30
    .line 31
    long-to-float v7, v7

    .line 32
    mul-float/2addr v7, v1

    .line 33
    sub-float v1, v2, v1

    .line 34
    .line 35
    long-to-float v8, v5

    .line 36
    mul-float/2addr v1, v8

    .line 37
    add-float/2addr v1, v7

    .line 38
    float-to-long v7, v1

    .line 39
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    iput-wide v7, v0, Lv3/i;->r:J

    .line 44
    .line 45
    sub-long/2addr v5, v7

    .line 46
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    iget-wide v7, v0, Lv3/i;->s:J

    .line 51
    .line 52
    iget v1, v0, Lv3/i;->g:F

    .line 53
    .line 54
    long-to-float v7, v7

    .line 55
    mul-float/2addr v7, v1

    .line 56
    sub-float v1, v2, v1

    .line 57
    .line 58
    long-to-float v5, v5

    .line 59
    mul-float/2addr v1, v5

    .line 60
    add-float/2addr v1, v7

    .line 61
    float-to-long v5, v1

    .line 62
    :goto_0
    iput-wide v5, v0, Lv3/i;->s:J

    .line 63
    .line 64
    iget-wide v5, v0, Lv3/i;->q:J

    .line 65
    .line 66
    cmp-long v1, v5, v3

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    iget-wide v7, v0, Lv3/i;->q:J

    .line 75
    .line 76
    sub-long/2addr v5, v7

    .line 77
    iget-wide v7, v0, Lv3/i;->c:J

    .line 78
    .line 79
    cmp-long v1, v5, v7

    .line 80
    .line 81
    if-gez v1, :cond_2

    .line 82
    .line 83
    iget v1, v0, Lv3/i;->p:F

    .line 84
    .line 85
    return v1

    .line 86
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    iput-wide v5, v0, Lv3/i;->q:J

    .line 91
    .line 92
    iget-wide v5, v0, Lv3/i;->r:J

    .line 93
    .line 94
    iget-wide v7, v0, Lv3/i;->s:J

    .line 95
    .line 96
    const-wide/16 v9, 0x3

    .line 97
    .line 98
    mul-long/2addr v7, v9

    .line 99
    add-long v13, v7, v5

    .line 100
    .line 101
    iget-wide v5, v0, Lv3/i;->m:J

    .line 102
    .line 103
    cmp-long v1, v5, v13

    .line 104
    .line 105
    if-lez v1, :cond_5

    .line 106
    .line 107
    iget-wide v3, v0, Lv3/i;->c:J

    .line 108
    .line 109
    invoke-static {v3, v4}, Lv5/e0;->I(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    iget v1, v0, Lv3/i;->p:F

    .line 114
    .line 115
    sub-float/2addr v1, v2

    .line 116
    long-to-float v3, v3

    .line 117
    mul-float/2addr v1, v3

    .line 118
    float-to-long v4, v1

    .line 119
    iget v1, v0, Lv3/i;->n:F

    .line 120
    .line 121
    sub-float/2addr v1, v2

    .line 122
    mul-float/2addr v1, v3

    .line 123
    float-to-long v6, v1

    .line 124
    add-long/2addr v4, v6

    .line 125
    const/4 v1, 0x3

    .line 126
    new-array v3, v1, [J

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    aput-wide v13, v3, v6

    .line 130
    .line 131
    iget-wide v6, v0, Lv3/i;->j:J

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    aput-wide v6, v3, v8

    .line 135
    .line 136
    const/4 v6, 0x2

    .line 137
    iget-wide v9, v0, Lv3/i;->m:J

    .line 138
    .line 139
    sub-long/2addr v9, v4

    .line 140
    aput-wide v9, v3, v6

    .line 141
    .line 142
    :goto_1
    if-ge v8, v1, :cond_4

    .line 143
    .line 144
    aget-wide v4, v3, v8

    .line 145
    .line 146
    cmp-long v6, v4, v13

    .line 147
    .line 148
    if-lez v6, :cond_3

    .line 149
    .line 150
    move-wide v13, v4

    .line 151
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    iput-wide v13, v0, Lv3/i;->m:J

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    const/4 v1, 0x0

    .line 158
    iget v5, v0, Lv3/i;->p:F

    .line 159
    .line 160
    sub-float/2addr v5, v2

    .line 161
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    iget v5, v0, Lv3/i;->d:F

    .line 166
    .line 167
    div-float/2addr v1, v5

    .line 168
    float-to-long v5, v1

    .line 169
    sub-long v9, p1, v5

    .line 170
    .line 171
    iget-wide v11, v0, Lv3/i;->m:J

    .line 172
    .line 173
    invoke-static/range {v9 .. v14}, Lv5/e0;->j(JJJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    iput-wide v5, v0, Lv3/i;->m:J

    .line 178
    .line 179
    iget-wide v7, v0, Lv3/i;->l:J

    .line 180
    .line 181
    cmp-long v1, v7, v3

    .line 182
    .line 183
    if-eqz v1, :cond_6

    .line 184
    .line 185
    cmp-long v1, v5, v7

    .line 186
    .line 187
    if-lez v1, :cond_6

    .line 188
    .line 189
    iput-wide v7, v0, Lv3/i;->m:J

    .line 190
    .line 191
    :cond_6
    :goto_2
    iget-wide v3, v0, Lv3/i;->m:J

    .line 192
    .line 193
    sub-long v3, p1, v3

    .line 194
    .line 195
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v5

    .line 199
    iget-wide v7, v0, Lv3/i;->e:J

    .line 200
    .line 201
    cmp-long v1, v5, v7

    .line 202
    .line 203
    if-gez v1, :cond_7

    .line 204
    .line 205
    iput v2, v0, Lv3/i;->p:F

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_7
    iget v1, v0, Lv3/i;->d:F

    .line 209
    .line 210
    long-to-float v3, v3

    .line 211
    mul-float/2addr v1, v3

    .line 212
    add-float/2addr v1, v2

    .line 213
    iget v2, v0, Lv3/i;->o:F

    .line 214
    .line 215
    iget v3, v0, Lv3/i;->n:F

    .line 216
    .line 217
    invoke-static {v1, v2, v3}, Lv5/e0;->h(FFF)F

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    iput v1, v0, Lv3/i;->p:F

    .line 222
    .line 223
    :goto_3
    iget v1, v0, Lv3/i;->p:F

    .line 224
    .line 225
    return v1
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

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lv3/i;->m:J

    return-wide v0
.end method

.method public final c()V
    .locals 7

    iget-wide v0, p0, Lv3/i;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-wide v4, p0, Lv3/i;->f:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lv3/i;->m:J

    iget-wide v4, p0, Lv3/i;->l:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    iput-wide v4, p0, Lv3/i;->m:J

    :cond_1
    iput-wide v2, p0, Lv3/i;->q:J

    return-void
.end method

.method public final d(Lv3/o0$e;)V
    .locals 3

    iget-wide v0, p1, Lv3/o0$e;->a:J

    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    move-result-wide v0

    iput-wide v0, p0, Lv3/i;->h:J

    iget-wide v0, p1, Lv3/o0$e;->b:J

    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    move-result-wide v0

    iput-wide v0, p0, Lv3/i;->k:J

    iget-wide v0, p1, Lv3/o0$e;->c:J

    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    move-result-wide v0

    iput-wide v0, p0, Lv3/i;->l:J

    iget v0, p1, Lv3/o0$e;->d:F

    const v1, -0x800001

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lv3/i;->a:F

    :goto_0
    iput v0, p0, Lv3/i;->o:F

    iget p1, p1, Lv3/o0$e;->e:F

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget p1, p0, Lv3/i;->b:F

    :goto_1
    iput p1, p0, Lv3/i;->n:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lv3/i;->h:J

    :cond_2
    invoke-virtual {p0}, Lv3/i;->f()V

    return-void
.end method

.method public final e(J)V
    .locals 0

    iput-wide p1, p0, Lv3/i;->i:J

    invoke-virtual {p0}, Lv3/i;->f()V

    return-void
.end method

.method public final f()V
    .locals 7

    iget-wide v0, p0, Lv3/i;->h:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    iget-wide v4, p0, Lv3/i;->i:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    move-wide v0, v4

    :cond_0
    iget-wide v4, p0, Lv3/i;->k:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v6, v0, v4

    if-gez v6, :cond_1

    move-wide v0, v4

    :cond_1
    iget-wide v4, p0, Lv3/i;->l:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    cmp-long v6, v0, v4

    if-lez v6, :cond_3

    move-wide v0, v4

    goto :goto_0

    :cond_2
    move-wide v0, v2

    :cond_3
    :goto_0
    iget-wide v4, p0, Lv3/i;->j:J

    cmp-long v4, v4, v0

    if-nez v4, :cond_4

    return-void

    :cond_4
    iput-wide v0, p0, Lv3/i;->j:J

    iput-wide v0, p0, Lv3/i;->m:J

    iput-wide v2, p0, Lv3/i;->r:J

    iput-wide v2, p0, Lv3/i;->s:J

    iput-wide v2, p0, Lv3/i;->q:J

    return-void
.end method
