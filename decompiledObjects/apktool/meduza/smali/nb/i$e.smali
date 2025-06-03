.class public final Lnb/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/i$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Lnb/i$f;

.field public final b:Leb/d;


# direct methods
.method public constructor <init>(Lnb/i$f;Leb/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/i$e;->a:Lnb/i$f;

    iput-object p2, p0, Lnb/i$e;->b:Leb/d;

    return-void
.end method


# virtual methods
.method public final a(Lnb/i$b;J)V
    .locals 10

    .line 1
    iget-object v0, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 2
    .line 3
    iget-object v0, v0, Lnb/i$f;->f:Lnb/i$f$a;

    .line 4
    .line 5
    iget-object v0, v0, Lnb/i$f$a;->d:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1, v0}, Lnb/i;->h(Lnb/i$b;I)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 20
    .line 21
    iget-object v2, v2, Lnb/i$f;->f:Lnb/i$f$a;

    .line 22
    .line 23
    iget-object v2, v2, Lnb/i$f$a;->c:Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lt v1, v2, :cond_4

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lnb/i$a;

    .line 54
    .line 55
    invoke-virtual {p1}, Lnb/i$b;->d()D

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    iget-object v4, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 60
    .line 61
    iget-object v4, v4, Lnb/i$f;->d:Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    int-to-double v4, v4

    .line 68
    cmpl-double v2, v2, v4

    .line 69
    .line 70
    if-ltz v2, :cond_2

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {v1}, Lnb/i$a;->c()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iget-object v4, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 78
    .line 79
    iget-object v4, v4, Lnb/i$f;->f:Lnb/i$f$a;

    .line 80
    .line 81
    iget-object v4, v4, Lnb/i$f$a;->d:Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    int-to-long v4, v4

    .line 88
    cmp-long v2, v2, v4

    .line 89
    .line 90
    if-gez v2, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    iget-object v2, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 94
    .line 95
    iget-object v2, v2, Lnb/i$f;->f:Lnb/i$f$a;

    .line 96
    .line 97
    iget-object v2, v2, Lnb/i$f$a;->a:Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    int-to-double v2, v2

    .line 104
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 105
    .line 106
    div-double/2addr v2, v4

    .line 107
    iget-object v4, v1, Lnb/i$a;->c:Lnb/i$a$a;

    .line 108
    .line 109
    iget-object v4, v4, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    long-to-double v4, v4

    .line 116
    invoke-virtual {v1}, Lnb/i$a;->c()J

    .line 117
    .line 118
    .line 119
    move-result-wide v6

    .line 120
    long-to-double v6, v6

    .line 121
    div-double/2addr v4, v6

    .line 122
    cmpl-double v2, v4, v2

    .line 123
    .line 124
    if-lez v2, :cond_1

    .line 125
    .line 126
    iget-object v2, p0, Lnb/i$e;->b:Leb/d;

    .line 127
    .line 128
    sget-object v3, Leb/d$a;->a:Leb/d$a;

    .line 129
    .line 130
    const/4 v4, 0x2

    .line 131
    new-array v4, v4, [Ljava/lang/Object;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    aput-object v1, v4, v5

    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    iget-object v6, v1, Lnb/i$a;->c:Lnb/i$a$a;

    .line 138
    .line 139
    iget-object v6, v6, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 142
    .line 143
    .line 144
    move-result-wide v6

    .line 145
    long-to-double v6, v6

    .line 146
    invoke-virtual {v1}, Lnb/i$a;->c()J

    .line 147
    .line 148
    .line 149
    move-result-wide v8

    .line 150
    long-to-double v8, v8

    .line 151
    div-double/2addr v6, v8

    .line 152
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    aput-object v6, v4, v5

    .line 157
    .line 158
    const-string v5, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}"

    .line 159
    .line 160
    invoke-virtual {v2, v3, v5, v4}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, Ljava/util/Random;

    .line 164
    .line 165
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 166
    .line 167
    .line 168
    const/16 v3, 0x64

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    iget-object v3, p0, Lnb/i$e;->a:Lnb/i$f;

    .line 175
    .line 176
    iget-object v3, v3, Lnb/i$f;->f:Lnb/i$f$a;

    .line 177
    .line 178
    iget-object v3, v3, Lnb/i$f$a;->b:Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-ge v2, v3, :cond_1

    .line 185
    .line 186
    invoke-virtual {v1, p2, p3}, Lnb/i$a;->b(J)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_4
    :goto_1
    return-void
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
