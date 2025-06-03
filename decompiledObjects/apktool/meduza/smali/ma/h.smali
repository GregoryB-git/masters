.class public abstract Lma/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma/h$d;,
        Lma/h$h;,
        Lma/h$g;,
        Lma/h$b;,
        Lma/h$f;,
        Lma/h$c;,
        Lma/h$i;,
        Lma/h$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Byte;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final b:Lma/h$h;

.field public static final c:Lma/h$e;


# instance fields
.field public a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lma/h$h;

    sget-object v1, Lma/a0;->b:[B

    invoke-direct {v0, v1}, Lma/h$h;-><init>([B)V

    sput-object v0, Lma/h;->b:Lma/h$h;

    invoke-static {}, Lma/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lma/h$i;

    invoke-direct {v0}, Lma/h$i;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lma/h$c;

    invoke-direct {v0}, Lma/h$c;-><init>()V

    :goto_0
    sput-object v0, Lma/h;->c:Lma/h$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lma/h;->a:I

    return-void
.end method

.method public static h(Ljava/util/Iterator;I)Lma/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "Lma/h;",
            ">;I)",
            "Lma/h;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-lt p1, v0, :cond_d

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lma/h;

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    ushr-int/lit8 v2, p1, 0x1

    .line 16
    .line 17
    invoke-static {p0, v2}, Lma/h;->h(Ljava/util/Iterator;I)Lma/h;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sub-int/2addr p1, v2

    .line 22
    invoke-static {p0, p1}, Lma/h;->h(Ljava/util/Iterator;I)Lma/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v3}, Lma/h;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const v2, 0x7fffffff

    .line 31
    .line 32
    .line 33
    sub-int/2addr v2, p1

    .line 34
    invoke-virtual {p0}, Lma/h;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-lt v2, p1, :cond_c

    .line 39
    .line 40
    invoke-virtual {p0}, Lma/h;->size()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    move-object p0, v3

    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v3}, Lma/h;->size()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v3}, Lma/h;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0}, Lma/h;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/2addr v2, p1

    .line 66
    const/16 p1, 0x80

    .line 67
    .line 68
    if-ge v2, p1, :cond_5

    .line 69
    .line 70
    invoke-virtual {v3}, Lma/h;->size()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0}, Lma/h;->size()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int v2, p1, v0

    .line 79
    .line 80
    new-array v4, v2, [B

    .line 81
    .line 82
    add-int/lit8 v5, p1, 0x0

    .line 83
    .line 84
    invoke-virtual {v3}, Lma/h;->size()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-static {v1, v5, v6}, Lma/h;->l(III)I

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v5, v2}, Lma/h;->l(III)I

    .line 92
    .line 93
    .line 94
    if-lez p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {v3, v1, v4, v1, p1}, Lma/h;->n(I[BII)V

    .line 97
    .line 98
    .line 99
    :cond_3
    add-int/lit8 v3, v0, 0x0

    .line 100
    .line 101
    invoke-virtual {p0}, Lma/h;->size()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-static {v1, v3, v5}, Lma/h;->l(III)I

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v2, v2}, Lma/h;->l(III)I

    .line 109
    .line 110
    .line 111
    if-lez v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0, v1, v4, p1, v0}, Lma/h;->n(I[BII)V

    .line 114
    .line 115
    .line 116
    :cond_4
    new-instance p0, Lma/h$h;

    .line 117
    .line 118
    invoke-direct {p0, v4}, Lma/h$h;-><init>([B)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :cond_5
    instance-of v4, v3, Lma/h1;

    .line 124
    .line 125
    if-eqz v4, :cond_9

    .line 126
    .line 127
    move-object v4, v3

    .line 128
    check-cast v4, Lma/h1;

    .line 129
    .line 130
    iget-object v5, v4, Lma/h1;->f:Lma/h;

    .line 131
    .line 132
    invoke-virtual {v5}, Lma/h;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    invoke-virtual {p0}, Lma/h;->size()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    add-int/2addr v6, v5

    .line 141
    if-ge v6, p1, :cond_8

    .line 142
    .line 143
    iget-object p1, v4, Lma/h1;->f:Lma/h;

    .line 144
    .line 145
    invoke-virtual {p1}, Lma/h;->size()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-virtual {p0}, Lma/h;->size()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    add-int v3, v0, v2

    .line 154
    .line 155
    new-array v5, v3, [B

    .line 156
    .line 157
    add-int/lit8 v6, v0, 0x0

    .line 158
    .line 159
    invoke-virtual {p1}, Lma/h;->size()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-static {v1, v6, v7}, Lma/h;->l(III)I

    .line 164
    .line 165
    .line 166
    invoke-static {v1, v6, v3}, Lma/h;->l(III)I

    .line 167
    .line 168
    .line 169
    if-lez v0, :cond_6

    .line 170
    .line 171
    invoke-virtual {p1, v1, v5, v1, v0}, Lma/h;->n(I[BII)V

    .line 172
    .line 173
    .line 174
    :cond_6
    add-int/lit8 p1, v2, 0x0

    .line 175
    .line 176
    invoke-virtual {p0}, Lma/h;->size()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    invoke-static {v1, p1, v6}, Lma/h;->l(III)I

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v3, v3}, Lma/h;->l(III)I

    .line 184
    .line 185
    .line 186
    if-lez v2, :cond_7

    .line 187
    .line 188
    invoke-virtual {p0, v1, v5, v0, v2}, Lma/h;->n(I[BII)V

    .line 189
    .line 190
    .line 191
    :cond_7
    new-instance p0, Lma/h$h;

    .line 192
    .line 193
    invoke-direct {p0, v5}, Lma/h$h;-><init>([B)V

    .line 194
    .line 195
    .line 196
    new-instance p1, Lma/h1;

    .line 197
    .line 198
    iget-object v0, v4, Lma/h1;->e:Lma/h;

    .line 199
    .line 200
    invoke-direct {p1, v0, p0}, Lma/h1;-><init>(Lma/h;Lma/h;)V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_8
    iget-object p1, v4, Lma/h1;->e:Lma/h;

    .line 205
    .line 206
    invoke-virtual {p1}, Lma/h;->o()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    iget-object v1, v4, Lma/h1;->f:Lma/h;

    .line 211
    .line 212
    invoke-virtual {v1}, Lma/h;->o()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-le p1, v1, :cond_9

    .line 217
    .line 218
    iget p1, v4, Lma/h1;->p:I

    .line 219
    .line 220
    invoke-virtual {p0}, Lma/h;->o()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-le p1, v1, :cond_9

    .line 225
    .line 226
    new-instance p1, Lma/h1;

    .line 227
    .line 228
    iget-object v0, v4, Lma/h1;->f:Lma/h;

    .line 229
    .line 230
    invoke-direct {p1, v0, p0}, Lma/h1;-><init>(Lma/h;Lma/h;)V

    .line 231
    .line 232
    .line 233
    new-instance p0, Lma/h1;

    .line 234
    .line 235
    iget-object v0, v4, Lma/h1;->e:Lma/h;

    .line 236
    .line 237
    invoke-direct {p0, v0, p1}, Lma/h1;-><init>(Lma/h;Lma/h;)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_9
    invoke-virtual {v3}, Lma/h;->o()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-virtual {p0}, Lma/h;->o()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    add-int/2addr p1, v0

    .line 254
    invoke-static {p1}, Lma/h1;->C(I)I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-lt v2, p1, :cond_a

    .line 259
    .line 260
    new-instance p1, Lma/h1;

    .line 261
    .line 262
    invoke-direct {p1, v3, p0}, Lma/h1;-><init>(Lma/h;Lma/h;)V

    .line 263
    .line 264
    .line 265
    :goto_0
    move-object p0, p1

    .line 266
    goto :goto_2

    .line 267
    :cond_a
    new-instance p1, Lma/h1$b;

    .line 268
    .line 269
    invoke-direct {p1}, Lma/h1$b;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v3}, Lma/h1$b;->a(Lma/h;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p0}, Lma/h1$b;->a(Lma/h;)V

    .line 276
    .line 277
    .line 278
    iget-object p0, p1, Lma/h1$b;->a:Ljava/util/ArrayDeque;

    .line 279
    .line 280
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    check-cast p0, Lma/h;

    .line 285
    .line 286
    :goto_1
    iget-object v0, p1, Lma/h1$b;->a:Ljava/util/ArrayDeque;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_b

    .line 293
    .line 294
    iget-object v0, p1, Lma/h1$b;->a:Ljava/util/ArrayDeque;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Lma/h;

    .line 301
    .line 302
    new-instance v1, Lma/h1;

    .line 303
    .line 304
    invoke-direct {v1, v0, p0}, Lma/h1;-><init>(Lma/h;Lma/h;)V

    .line 305
    .line 306
    .line 307
    move-object p0, v1

    .line 308
    goto :goto_1

    .line 309
    :cond_b
    :goto_2
    return-object p0

    .line 310
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 311
    .line 312
    const-string v0, "ByteString would be too long: "

    .line 313
    .line 314
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v3}, Lma/h;->size()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v1, "+"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, Lma/h;->size()I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw p1

    .line 345
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 346
    .line 347
    new-array v0, v0, [Ljava/lang/Object;

    .line 348
    .line 349
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    aput-object p1, v0, v1

    .line 354
    .line 355
    const-string p1, "length (%s) must be >= 1"

    .line 356
    .line 357
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw p0
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

.method public static k(II)V
    .locals 3

    .line 1
    add-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    sub-int v0, p1, v0

    .line 4
    .line 5
    or-int/2addr v0, p0

    .line 6
    if-gez v0, :cond_1

    .line 7
    .line 8
    if-gez p0, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 11
    .line 12
    const-string v0, "Index < 0: "

    .line 13
    .line 14
    invoke-static {v0, p0}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 23
    .line 24
    const-string v1, "Index > length: "

    .line 25
    .line 26
    const-string v2, ", "

    .line 27
    .line 28
    invoke-static {v1, p0, v2, p1}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    return-void
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

.method public static l(III)I
    .locals 3

    .line 1
    sub-int v0, p1, p0

    .line 2
    .line 3
    or-int v1, p0, p1

    .line 4
    .line 5
    or-int/2addr v1, v0

    .line 6
    sub-int v2, p2, p1

    .line 7
    .line 8
    or-int/2addr v1, v2

    .line 9
    if-gez v1, :cond_2

    .line 10
    .line 11
    if-ltz p0, :cond_1

    .line 12
    .line 13
    if-ge p1, p0, :cond_0

    .line 14
    .line 15
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 16
    .line 17
    const-string v0, "Beginning index larger than ending index: "

    .line 18
    .line 19
    const-string v1, ", "

    .line 20
    .line 21
    invoke-static {v0, p0, v1, p1}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p2

    .line 29
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 30
    .line 31
    const-string v0, "End index: "

    .line 32
    .line 33
    const-string v1, " >= "

    .line 34
    .line 35
    invoke-static {v0, p1, v1, p2}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 44
    .line 45
    const-string p2, "Beginning index: "

    .line 46
    .line 47
    const-string v0, " < 0"

    .line 48
    .line 49
    invoke-static {p2, p0, v0}, La0/j;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    return v0
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
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
.end method

.method public static m([BII)Lma/h$h;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lma/h;->l(III)I

    new-instance v0, Lma/h$h;

    sget-object v1, Lma/h;->c:Lma/h$e;

    invoke-interface {v1, p0, p1, p2}, Lma/h$e;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lma/h$h;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public abstract A(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract B(Lm/e;)V
.end method

.method public abstract a()Ljava/nio/ByteBuffer;
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lma/h;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lma/h;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lma/h;->u(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lma/h;->a:I

    :cond_1
    return v0
.end method

.method public abstract i(I)B
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lma/h;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lma/h;->s()Lma/h$f;

    move-result-object v0

    return-object v0
.end method

.method public abstract n(I[BII)V
.end method

.method public abstract o()I
.end method

.method public abstract p(I)B
.end method

.method public abstract q()Z
.end method

.method public abstract r()Z
.end method

.method public s()Lma/h$f;
    .locals 1

    new-instance v0, Lma/h$a;

    invoke-direct {v0, p0}, Lma/h$a;-><init>(Lma/h;)V

    return-object v0
.end method

.method public abstract size()I
.end method

.method public abstract t()Lma/i;
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v2, v1, v3

    .line 16
    .line 17
    invoke-virtual {p0}, Lma/h;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v4, 0x1

    .line 26
    aput-object v2, v1, v4

    .line 27
    .line 28
    invoke-virtual {p0}, Lma/h;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v4, 0x32

    .line 33
    .line 34
    if-gt v2, v4, :cond_0

    .line 35
    .line 36
    invoke-static {p0}, Lb/z;->i(Lma/h;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const/16 v4, 0x2f

    .line 47
    .line 48
    invoke-virtual {p0, v3, v4}, Lma/h;->y(II)Lma/h;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, Lb/z;->i(Lma/h;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v3, "..."

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_0
    const/4 v3, 0x2

    .line 69
    aput-object v2, v1, v3

    .line 70
    .line 71
    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    .line 72
    .line 73
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public abstract u(III)I
.end method

.method public abstract x(III)I
.end method

.method public abstract y(II)Lma/h;
.end method

.method public final z()[B
    .locals 3

    invoke-virtual {p0}, Lma/h;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lma/a0;->b:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2, v0}, Lma/h;->n(I[BII)V

    return-object v1
.end method
