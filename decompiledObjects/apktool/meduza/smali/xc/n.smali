.class public final Lxc/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/y;


# instance fields
.field public final a:Lxc/h;

.field public final b:Ljava/util/zip/Inflater;

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lxc/s;Ljava/util/zip/Inflater;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc/n;->a:Lxc/h;

    iput-object p2, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lxc/n;->a:Lxc/h;

    invoke-interface {v0}, Lxc/y;->c()Lxc/z;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lxc/n;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxc/n;->d:Z

    iget-object v0, p0, Lxc/n;->a:Lxc/h;

    invoke-interface {v0}, Lxc/y;->close()V

    return-void
.end method

.method public final e0(Lxc/f;J)J
    .locals 8

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ltz v2, :cond_0

    .line 12
    .line 13
    move v4, v3

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v4, 0x0

    .line 16
    :goto_1
    if-eqz v4, :cond_c

    .line 17
    .line 18
    iget-boolean v4, p0, Lxc/n;->d:Z

    .line 19
    .line 20
    xor-int/2addr v4, v3

    .line 21
    if-eqz v4, :cond_b

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {p1, v3}, Lxc/f;->r0(I)Lxc/t;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget v3, v2, Lxc/t;->c:I

    .line 32
    .line 33
    rsub-int v3, v3, 0x2000

    .line 34
    .line 35
    int-to-long v3, v3

    .line 36
    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    long-to-int v3, v3

    .line 41
    iget-object v4, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget-object v4, p0, Lxc/n;->a:Lxc/h;

    .line 51
    .line 52
    invoke-interface {v4}, Lxc/h;->v()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    iget-object v4, p0, Lxc/n;->a:Lxc/h;

    .line 60
    .line 61
    invoke-interface {v4}, Lxc/h;->t()Lxc/f;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    iget-object v4, v4, Lxc/f;->a:Lxc/t;

    .line 66
    .line 67
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget v5, v4, Lxc/t;->c:I

    .line 71
    .line 72
    iget v6, v4, Lxc/t;->b:I

    .line 73
    .line 74
    sub-int/2addr v5, v6

    .line 75
    iput v5, p0, Lxc/n;->c:I

    .line 76
    .line 77
    iget-object v7, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 78
    .line 79
    iget-object v4, v4, Lxc/t;->a:[B

    .line 80
    .line 81
    invoke-virtual {v7, v4, v6, v5}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 82
    .line 83
    .line 84
    :goto_2
    iget-object v4, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 85
    .line 86
    iget-object v5, v2, Lxc/t;->a:[B

    .line 87
    .line 88
    iget v6, v2, Lxc/t;->c:I

    .line 89
    .line 90
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget v4, p0, Lxc/n;->c:I

    .line 95
    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    iget-object v5, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    sub-int/2addr v4, v5

    .line 106
    iget v5, p0, Lxc/n;->c:I

    .line 107
    .line 108
    sub-int/2addr v5, v4

    .line 109
    iput v5, p0, Lxc/n;->c:I

    .line 110
    .line 111
    iget-object v5, p0, Lxc/n;->a:Lxc/h;

    .line 112
    .line 113
    int-to-long v6, v4

    .line 114
    invoke-interface {v5, v6, v7}, Lxc/h;->skip(J)V

    .line 115
    .line 116
    .line 117
    :goto_3
    if-lez v3, :cond_5

    .line 118
    .line 119
    iget v4, v2, Lxc/t;->c:I

    .line 120
    .line 121
    add-int/2addr v4, v3

    .line 122
    iput v4, v2, Lxc/t;->c:I

    .line 123
    .line 124
    iget-wide v4, p1, Lxc/f;->b:J

    .line 125
    .line 126
    int-to-long v2, v3

    .line 127
    add-long/2addr v4, v2

    .line 128
    iput-wide v4, p1, Lxc/f;->b:J

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_5
    iget v3, v2, Lxc/t;->b:I

    .line 132
    .line 133
    iget v4, v2, Lxc/t;->c:I

    .line 134
    .line 135
    if-ne v3, v4, :cond_6

    .line 136
    .line 137
    invoke-virtual {v2}, Lxc/t;->a()Lxc/t;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iput-object v3, p1, Lxc/f;->a:Lxc/t;

    .line 142
    .line 143
    invoke-static {v2}, Lxc/u;->a(Lxc/t;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_4
    move-wide v2, v0

    .line 147
    :goto_5
    cmp-long v0, v2, v0

    .line 148
    .line 149
    if-lez v0, :cond_7

    .line 150
    .line 151
    return-wide v2

    .line 152
    :cond_7
    iget-object v0, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_a

    .line 159
    .line 160
    iget-object v0, p0, Lxc/n;->b:Ljava/util/zip/Inflater;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_8
    iget-object v0, p0, Lxc/n;->a:Lxc/h;

    .line 170
    .line 171
    invoke-interface {v0}, Lxc/h;->v()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_9
    new-instance p1, Ljava/io/EOFException;

    .line 180
    .line 181
    const-string p2, "source exhausted prematurely"

    .line 182
    .line 183
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_a
    :goto_6
    const-wide/16 p1, -0x1

    .line 188
    .line 189
    return-wide p1

    .line 190
    :catch_0
    move-exception p1

    .line 191
    new-instance p2, Ljava/io/IOException;

    .line 192
    .line 193
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    throw p2

    .line 197
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    const-string p2, "closed"

    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1

    .line 209
    :cond_c
    const-string p1, "byteCount < 0: "

    .line 210
    .line 211
    invoke-static {p1, p2, p3}, La0/j;->i(Ljava/lang/String;J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p2
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
