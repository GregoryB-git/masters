.class public final Lm4/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lv5/c0;

.field public final b:Lv5/u;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(ILv5/c0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm4/a0$a;->c:I

    iput-object p2, p0, Lm4/a0$a;->a:Lv5/c0;

    iput p3, p0, Lm4/a0$a;->d:I

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Lm4/a0$a;->b:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lm4/a0$a;->b:Lv5/u;

    sget-object v1, Lv5/e0;->f:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    invoke-virtual {v0, v1, v2}, Lv5/u;->E([BI)V

    return-void
.end method

.method public final b(Lc4/i;J)Lc4/a$e;
    .locals 17

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
    iget v1, v0, Lm4/a0$a;->d:I

    .line 8
    .line 9
    int-to-long v1, v1

    .line 10
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    sub-long/2addr v3, v5

    .line 15
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    long-to-int v1, v1

    .line 20
    iget-object v2, v0, Lm4/a0$a;->b:Lv5/u;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lv5/u;->D(I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lm4/a0$a;->b:Lv5/u;

    .line 26
    .line 27
    iget-object v2, v2, Lv5/u;->a:[B

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object/from16 v4, p1

    .line 31
    .line 32
    invoke-interface {v4, v2, v3, v1}, Lc4/i;->m([BII)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, Lm4/a0$a;->b:Lv5/u;

    .line 36
    .line 37
    iget v2, v1, Lv5/u;->c:I

    .line 38
    .line 39
    const-wide/16 v3, -0x1

    .line 40
    .line 41
    move-wide v9, v3

    .line 42
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    :goto_0
    iget v11, v1, Lv5/u;->c:I

    .line 48
    .line 49
    iget v12, v1, Lv5/u;->b:I

    .line 50
    .line 51
    sub-int/2addr v11, v12

    .line 52
    const/16 v15, 0xbc

    .line 53
    .line 54
    if-lt v11, v15, :cond_6

    .line 55
    .line 56
    iget-object v11, v1, Lv5/u;->a:[B

    .line 57
    .line 58
    :goto_1
    if-ge v12, v2, :cond_0

    .line 59
    .line 60
    aget-byte v15, v11, v12

    .line 61
    .line 62
    const/16 v7, 0x47

    .line 63
    .line 64
    if-eq v15, v7, :cond_0

    .line 65
    .line 66
    add-int/lit8 v12, v12, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    add-int/lit16 v7, v12, 0xbc

    .line 70
    .line 71
    if-le v7, v2, :cond_1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_1
    iget v3, v0, Lm4/a0$a;->c:I

    .line 75
    .line 76
    invoke-static {v12, v3, v1}, Lb/a0;->A(IILv5/u;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    cmp-long v8, v3, v15

    .line 86
    .line 87
    if-eqz v8, :cond_5

    .line 88
    .line 89
    iget-object v8, v0, Lm4/a0$a;->a:Lv5/c0;

    .line 90
    .line 91
    invoke-virtual {v8, v3, v4}, Lv5/c0;->b(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    cmp-long v8, v3, p2

    .line 96
    .line 97
    if-lez v8, :cond_3

    .line 98
    .line 99
    cmp-long v1, v13, v15

    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    new-instance v7, Lc4/a$e;

    .line 104
    .line 105
    const/4 v2, -0x1

    .line 106
    move-object v1, v7

    .line 107
    invoke-direct/range {v1 .. v6}, Lc4/a$e;-><init>(IJJ)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_2
    add-long/2addr v5, v9

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    const-wide/32 v8, 0x186a0

    .line 114
    .line 115
    .line 116
    add-long/2addr v8, v3

    .line 117
    cmp-long v8, v8, p2

    .line 118
    .line 119
    if-lez v8, :cond_4

    .line 120
    .line 121
    int-to-long v1, v12

    .line 122
    add-long/2addr v5, v1

    .line 123
    :goto_2
    invoke-static {v5, v6}, Lc4/a$e;->a(J)Lc4/a$e;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    goto :goto_4

    .line 128
    :cond_4
    int-to-long v8, v12

    .line 129
    move-wide v13, v3

    .line 130
    move-wide v9, v8

    .line 131
    :cond_5
    invoke-virtual {v1, v7}, Lv5/u;->G(I)V

    .line 132
    .line 133
    .line 134
    int-to-long v3, v7

    .line 135
    goto :goto_0

    .line 136
    :cond_6
    :goto_3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    cmp-long v1, v13, v1

    .line 142
    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    add-long v15, v5, v3

    .line 146
    .line 147
    new-instance v7, Lc4/a$e;

    .line 148
    .line 149
    const/4 v12, -0x2

    .line 150
    move-object v11, v7

    .line 151
    invoke-direct/range {v11 .. v16}, Lc4/a$e;-><init>(IJJ)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    sget-object v7, Lc4/a$e;->d:Lc4/a$e;

    .line 156
    .line 157
    :goto_4
    return-object v7
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
