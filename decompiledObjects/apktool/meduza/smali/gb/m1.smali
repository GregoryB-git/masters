.class public final Lgb/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lgb/m1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lgb/m1;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lla/a;)Ljava/lang/Object;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lla/a;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "unexpected end of JSON"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Lq0/g;->c(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x4

    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v3, 0x3

    .line 21
    const-string v4, "Bad token: "

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    if-eqz v0, :cond_24

    .line 26
    .line 27
    const/16 v7, 0x22

    .line 28
    .line 29
    const/16 v8, 0x27

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    if-eq v0, v2, :cond_19

    .line 33
    .line 34
    const/16 v1, 0x10

    .line 35
    .line 36
    const/16 v2, 0xf

    .line 37
    .line 38
    const/16 v3, 0xb

    .line 39
    .line 40
    const/16 v10, 0x9

    .line 41
    .line 42
    const/16 v11, 0xa

    .line 43
    .line 44
    const/4 v12, 0x5

    .line 45
    const/16 v13, 0x8

    .line 46
    .line 47
    if-eq v0, v12, :cond_11

    .line 48
    .line 49
    const/4 v14, 0x6

    .line 50
    if-eq v0, v14, :cond_7

    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    if-eq v0, v1, :cond_3

    .line 54
    .line 55
    if-ne v0, v13, :cond_2

    .line 56
    .line 57
    iget v0, p0, Lla/a;->o:I

    .line 58
    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Lla/a;->g()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :cond_0
    if-ne v0, v1, :cond_1

    .line 66
    .line 67
    iput v5, p0, Lla/a;->o:I

    .line 68
    .line 69
    iget-object v0, p0, Lla/a;->v:[I

    .line 70
    .line 71
    iget p0, p0, Lla/a;->t:I

    .line 72
    .line 73
    add-int/lit8 p0, p0, -0x1

    .line 74
    .line 75
    aget v1, v0, p0

    .line 76
    .line 77
    add-int/2addr v1, v6

    .line 78
    aput v1, v0, p0

    .line 79
    .line 80
    return-object v9

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v1, "Expected null but was "

    .line 84
    .line 85
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 116
    .line 117
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p0}, Lla/a;->H()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_3
    iget v0, p0, Lla/a;->o:I

    .line 137
    .line 138
    if-nez v0, :cond_4

    .line 139
    .line 140
    invoke-virtual {p0}, Lla/a;->g()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    :cond_4
    if-ne v0, v12, :cond_5

    .line 145
    .line 146
    iput v5, p0, Lla/a;->o:I

    .line 147
    .line 148
    iget-object v0, p0, Lla/a;->v:[I

    .line 149
    .line 150
    iget p0, p0, Lla/a;->t:I

    .line 151
    .line 152
    sub-int/2addr p0, v6

    .line 153
    aget v1, v0, p0

    .line 154
    .line 155
    add-int/2addr v1, v6

    .line 156
    aput v1, v0, p0

    .line 157
    .line 158
    move v5, v6

    .line 159
    goto :goto_0

    .line 160
    :cond_5
    if-ne v0, v14, :cond_6

    .line 161
    .line 162
    iput v5, p0, Lla/a;->o:I

    .line 163
    .line 164
    iget-object v0, p0, Lla/a;->v:[I

    .line 165
    .line 166
    iget p0, p0, Lla/a;->t:I

    .line 167
    .line 168
    sub-int/2addr p0, v6

    .line 169
    aget v1, v0, p0

    .line 170
    .line 171
    add-int/2addr v1, v6

    .line 172
    aput v1, v0, p0

    .line 173
    .line 174
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    const-string v1, "Expected a boolean but was "

    .line 182
    .line 183
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_7
    iget v0, p0, Lla/a;->o:I

    .line 214
    .line 215
    if-nez v0, :cond_8

    .line 216
    .line 217
    invoke-virtual {p0}, Lla/a;->g()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    :cond_8
    if-ne v0, v2, :cond_9

    .line 222
    .line 223
    iput v5, p0, Lla/a;->o:I

    .line 224
    .line 225
    iget-object v0, p0, Lla/a;->v:[I

    .line 226
    .line 227
    iget v1, p0, Lla/a;->t:I

    .line 228
    .line 229
    add-int/lit8 v1, v1, -0x1

    .line 230
    .line 231
    aget v2, v0, v1

    .line 232
    .line 233
    add-int/2addr v2, v6

    .line 234
    aput v2, v0, v1

    .line 235
    .line 236
    iget-wide v0, p0, Lla/a;->p:J

    .line 237
    .line 238
    long-to-double v0, v0

    .line 239
    goto/16 :goto_4

    .line 240
    .line 241
    :cond_9
    if-ne v0, v1, :cond_a

    .line 242
    .line 243
    new-instance v0, Ljava/lang/String;

    .line 244
    .line 245
    iget-object v1, p0, Lla/a;->b:[C

    .line 246
    .line 247
    iget v2, p0, Lla/a;->c:I

    .line 248
    .line 249
    iget v4, p0, Lla/a;->q:I

    .line 250
    .line 251
    invoke-direct {v0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 252
    .line 253
    .line 254
    iput-object v0, p0, Lla/a;->r:Ljava/lang/String;

    .line 255
    .line 256
    iget v0, p0, Lla/a;->c:I

    .line 257
    .line 258
    iget v1, p0, Lla/a;->q:I

    .line 259
    .line 260
    add-int/2addr v0, v1

    .line 261
    iput v0, p0, Lla/a;->c:I

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_a
    if-eq v0, v13, :cond_e

    .line 265
    .line 266
    if-ne v0, v10, :cond_b

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_b
    if-ne v0, v11, :cond_c

    .line 270
    .line 271
    invoke-virtual {p0}, Lla/a;->h0()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_2

    .line 276
    :cond_c
    if-ne v0, v3, :cond_d

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    const-string v1, "Expected a double but was "

    .line 282
    .line 283
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_e
    :goto_1
    if-ne v0, v13, :cond_f

    .line 314
    .line 315
    move v7, v8

    .line 316
    :cond_f
    invoke-virtual {p0, v7}, Lla/a;->c0(C)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    :goto_2
    iput-object v0, p0, Lla/a;->r:Ljava/lang/String;

    .line 321
    .line 322
    :goto_3
    iput v3, p0, Lla/a;->o:I

    .line 323
    .line 324
    iget-object v0, p0, Lla/a;->r:Ljava/lang/String;

    .line 325
    .line 326
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 327
    .line 328
    .line 329
    move-result-wide v0

    .line 330
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-nez v2, :cond_10

    .line 335
    .line 336
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-nez v2, :cond_10

    .line 341
    .line 342
    iput-object v9, p0, Lla/a;->r:Ljava/lang/String;

    .line 343
    .line 344
    iput v5, p0, Lla/a;->o:I

    .line 345
    .line 346
    iget-object v2, p0, Lla/a;->v:[I

    .line 347
    .line 348
    iget p0, p0, Lla/a;->t:I

    .line 349
    .line 350
    add-int/lit8 p0, p0, -0x1

    .line 351
    .line 352
    aget v3, v2, p0

    .line 353
    .line 354
    add-int/2addr v3, v6

    .line 355
    aput v3, v2, p0

    .line 356
    .line 357
    :goto_4
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    return-object p0

    .line 362
    :cond_10
    new-instance v2, Ly3/a;

    .line 363
    .line 364
    new-instance v3, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    const-string v4, "JSON forbids NaN and infinities: "

    .line 370
    .line 371
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-direct {v2, p0}, Ly3/a;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v2

    .line 392
    :cond_11
    iget v0, p0, Lla/a;->o:I

    .line 393
    .line 394
    if-nez v0, :cond_12

    .line 395
    .line 396
    invoke-virtual {p0}, Lla/a;->g()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    :cond_12
    if-ne v0, v11, :cond_13

    .line 401
    .line 402
    invoke-virtual {p0}, Lla/a;->h0()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    goto :goto_5

    .line 407
    :cond_13
    if-ne v0, v13, :cond_14

    .line 408
    .line 409
    invoke-virtual {p0, v8}, Lla/a;->c0(C)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    goto :goto_5

    .line 414
    :cond_14
    if-ne v0, v10, :cond_15

    .line 415
    .line 416
    invoke-virtual {p0, v7}, Lla/a;->c0(C)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    goto :goto_5

    .line 421
    :cond_15
    if-ne v0, v3, :cond_16

    .line 422
    .line 423
    iget-object v0, p0, Lla/a;->r:Ljava/lang/String;

    .line 424
    .line 425
    iput-object v9, p0, Lla/a;->r:Ljava/lang/String;

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_16
    if-ne v0, v2, :cond_17

    .line 429
    .line 430
    iget-wide v0, p0, Lla/a;->p:J

    .line 431
    .line 432
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    goto :goto_5

    .line 437
    :cond_17
    if-ne v0, v1, :cond_18

    .line 438
    .line 439
    new-instance v0, Ljava/lang/String;

    .line 440
    .line 441
    iget-object v1, p0, Lla/a;->b:[C

    .line 442
    .line 443
    iget v2, p0, Lla/a;->c:I

    .line 444
    .line 445
    iget v3, p0, Lla/a;->q:I

    .line 446
    .line 447
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 448
    .line 449
    .line 450
    iget v1, p0, Lla/a;->c:I

    .line 451
    .line 452
    iget v2, p0, Lla/a;->q:I

    .line 453
    .line 454
    add-int/2addr v1, v2

    .line 455
    iput v1, p0, Lla/a;->c:I

    .line 456
    .line 457
    :goto_5
    iput v5, p0, Lla/a;->o:I

    .line 458
    .line 459
    iget-object v1, p0, Lla/a;->v:[I

    .line 460
    .line 461
    iget p0, p0, Lla/a;->t:I

    .line 462
    .line 463
    add-int/lit8 p0, p0, -0x1

    .line 464
    .line 465
    aget v2, v1, p0

    .line 466
    .line 467
    add-int/2addr v2, v6

    .line 468
    aput v2, v1, p0

    .line 469
    .line 470
    return-object v0

    .line 471
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 472
    .line 473
    const-string v1, "Expected a string but was "

    .line 474
    .line 475
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v0

    .line 505
    :cond_19
    iget v0, p0, Lla/a;->o:I

    .line 506
    .line 507
    if-nez v0, :cond_1a

    .line 508
    .line 509
    invoke-virtual {p0}, Lla/a;->g()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    :cond_1a
    if-ne v0, v6, :cond_23

    .line 514
    .line 515
    invoke-virtual {p0, v3}, Lla/a;->k0(I)V

    .line 516
    .line 517
    .line 518
    iput v5, p0, Lla/a;->o:I

    .line 519
    .line 520
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 521
    .line 522
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 523
    .line 524
    .line 525
    :goto_6
    invoke-virtual {p0}, Lla/a;->I()Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-eqz v3, :cond_1f

    .line 530
    .line 531
    iget v3, p0, Lla/a;->o:I

    .line 532
    .line 533
    if-nez v3, :cond_1b

    .line 534
    .line 535
    invoke-virtual {p0}, Lla/a;->g()I

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    :cond_1b
    const/16 v10, 0xe

    .line 540
    .line 541
    if-ne v3, v10, :cond_1c

    .line 542
    .line 543
    invoke-virtual {p0}, Lla/a;->h0()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    goto :goto_7

    .line 548
    :cond_1c
    const/16 v10, 0xc

    .line 549
    .line 550
    if-ne v3, v10, :cond_1d

    .line 551
    .line 552
    invoke-virtual {p0, v8}, Lla/a;->c0(C)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    goto :goto_7

    .line 557
    :cond_1d
    const/16 v10, 0xd

    .line 558
    .line 559
    if-ne v3, v10, :cond_1e

    .line 560
    .line 561
    invoke-virtual {p0, v7}, Lla/a;->c0(C)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    :goto_7
    iput v5, p0, Lla/a;->o:I

    .line 566
    .line 567
    iget-object v10, p0, Lla/a;->u:[Ljava/lang/String;

    .line 568
    .line 569
    iget v11, p0, Lla/a;->t:I

    .line 570
    .line 571
    add-int/lit8 v11, v11, -0x1

    .line 572
    .line 573
    aput-object v3, v10, v11

    .line 574
    .line 575
    invoke-static {p0}, Lgb/m1;->a(Lla/a;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v10

    .line 579
    invoke-interface {v0, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    goto :goto_6

    .line 583
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 584
    .line 585
    const-string v1, "Expected a name but was "

    .line 586
    .line 587
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw v0

    .line 617
    :cond_1f
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    if-ne v3, v1, :cond_20

    .line 622
    .line 623
    move v1, v6

    .line 624
    goto :goto_8

    .line 625
    :cond_20
    move v1, v5

    .line 626
    :goto_8
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    invoke-virtual {p0}, Lla/a;->H()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    invoke-static {v1, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 642
    .line 643
    .line 644
    iget v1, p0, Lla/a;->o:I

    .line 645
    .line 646
    if-nez v1, :cond_21

    .line 647
    .line 648
    invoke-virtual {p0}, Lla/a;->g()I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    :cond_21
    if-ne v1, v2, :cond_22

    .line 653
    .line 654
    iget v1, p0, Lla/a;->t:I

    .line 655
    .line 656
    add-int/lit8 v1, v1, -0x1

    .line 657
    .line 658
    iput v1, p0, Lla/a;->t:I

    .line 659
    .line 660
    iget-object v2, p0, Lla/a;->u:[Ljava/lang/String;

    .line 661
    .line 662
    aput-object v9, v2, v1

    .line 663
    .line 664
    iget-object v2, p0, Lla/a;->v:[I

    .line 665
    .line 666
    add-int/lit8 v1, v1, -0x1

    .line 667
    .line 668
    aget v3, v2, v1

    .line 669
    .line 670
    add-int/2addr v3, v6

    .line 671
    aput v3, v2, v1

    .line 672
    .line 673
    iput v5, p0, Lla/a;->o:I

    .line 674
    .line 675
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    return-object p0

    .line 680
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 681
    .line 682
    const-string v1, "Expected END_OBJECT but was "

    .line 683
    .line 684
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object p0

    .line 703
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    throw v0

    .line 714
    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 715
    .line 716
    const-string v1, "Expected BEGIN_OBJECT but was "

    .line 717
    .line 718
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object p0

    .line 737
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object p0

    .line 744
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    throw v0

    .line 748
    :cond_24
    iget v0, p0, Lla/a;->o:I

    .line 749
    .line 750
    if-nez v0, :cond_25

    .line 751
    .line 752
    invoke-virtual {p0}, Lla/a;->g()I

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    :cond_25
    if-ne v0, v3, :cond_2a

    .line 757
    .line 758
    invoke-virtual {p0, v6}, Lla/a;->k0(I)V

    .line 759
    .line 760
    .line 761
    iget-object v0, p0, Lla/a;->v:[I

    .line 762
    .line 763
    iget v3, p0, Lla/a;->t:I

    .line 764
    .line 765
    sub-int/2addr v3, v6

    .line 766
    aput v5, v0, v3

    .line 767
    .line 768
    iput v5, p0, Lla/a;->o:I

    .line 769
    .line 770
    new-instance v0, Ljava/util/ArrayList;

    .line 771
    .line 772
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 773
    .line 774
    .line 775
    :goto_9
    invoke-virtual {p0}, Lla/a;->I()Z

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    if-eqz v3, :cond_26

    .line 780
    .line 781
    invoke-static {p0}, Lgb/m1;->a(Lla/a;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    goto :goto_9

    .line 789
    :cond_26
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    if-ne v3, v2, :cond_27

    .line 794
    .line 795
    move v2, v6

    .line 796
    goto :goto_a

    .line 797
    :cond_27
    move v2, v5

    .line 798
    :goto_a
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    invoke-virtual {p0}, Lla/a;->H()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    invoke-static {v2, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 814
    .line 815
    .line 816
    iget v2, p0, Lla/a;->o:I

    .line 817
    .line 818
    if-nez v2, :cond_28

    .line 819
    .line 820
    invoke-virtual {p0}, Lla/a;->g()I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    :cond_28
    if-ne v2, v1, :cond_29

    .line 825
    .line 826
    iget v1, p0, Lla/a;->t:I

    .line 827
    .line 828
    add-int/lit8 v1, v1, -0x1

    .line 829
    .line 830
    iput v1, p0, Lla/a;->t:I

    .line 831
    .line 832
    iget-object v2, p0, Lla/a;->v:[I

    .line 833
    .line 834
    add-int/lit8 v1, v1, -0x1

    .line 835
    .line 836
    aget v3, v2, v1

    .line 837
    .line 838
    add-int/2addr v3, v6

    .line 839
    aput v3, v2, v1

    .line 840
    .line 841
    iput v5, p0, Lla/a;->o:I

    .line 842
    .line 843
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 844
    .line 845
    .line 846
    move-result-object p0

    .line 847
    return-object p0

    .line 848
    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 849
    .line 850
    const-string v1, "Expected END_ARRAY but was "

    .line 851
    .line 852
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object p0

    .line 878
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    throw v0

    .line 882
    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 883
    .line 884
    const-string v1, "Expected BEGIN_ARRAY but was "

    .line 885
    .line 886
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    invoke-virtual {p0}, Lla/a;->i0()I

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    invoke-static {v2}, Lg;->s(I)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {p0}, Lla/a;->Q()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object p0

    .line 905
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object p0

    .line 912
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    throw v0
.end method
