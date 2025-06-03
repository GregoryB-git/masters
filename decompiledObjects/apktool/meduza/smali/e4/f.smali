.class public final Le4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/a;


# instance fields
.field public final a:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Le4/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:I


# direct methods
.method public constructor <init>(ILo7/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le4/f;->b:I

    iput-object p2, p0, Le4/f;->a:Lo7/t;

    return-void
.end method

.method public static b(ILv5/u;)Le4/f;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Lo7/t$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lo7/t$a;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v2, v0, Lv5/u;->c:I

    .line 9
    .line 10
    const/4 v3, -0x2

    .line 11
    :goto_0
    iget v4, v0, Lv5/u;->c:I

    .line 12
    .line 13
    iget v5, v0, Lv5/u;->b:I

    .line 14
    .line 15
    sub-int/2addr v4, v5

    .line 16
    const/16 v5, 0x8

    .line 17
    .line 18
    if-le v4, v5, :cond_11

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget v7, v0, Lv5/u;->b:I

    .line 29
    .line 30
    add-int/2addr v7, v6

    .line 31
    invoke-virtual {v0, v7}, Lv5/u;->F(I)V

    .line 32
    .line 33
    .line 34
    const v6, 0x5453494c

    .line 35
    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x2

    .line 39
    if-ne v4, v6, :cond_0

    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4, v0}, Le4/f;->b(ILv5/u;)Le4/f;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_0
    const/16 v6, 0xc

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x4

    .line 55
    sparse-switch v4, :sswitch_data_0

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :sswitch_0
    new-instance v4, Le4/h;

    .line 61
    .line 62
    iget v5, v0, Lv5/u;->c:I

    .line 63
    .line 64
    iget v6, v0, Lv5/u;->b:I

    .line 65
    .line 66
    sub-int/2addr v5, v6

    .line 67
    invoke-virtual {v0, v5}, Lv5/u;->s(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-direct {v4, v5}, Le4/h;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :sswitch_1
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v0, v6}, Lv5/u;->H(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    invoke-virtual {v0, v5}, Lv5/u;->H(I)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Le4/d;

    .line 109
    .line 110
    move-object v10, v5

    .line 111
    move v11, v4

    .line 112
    invoke-direct/range {v10 .. v15}, Le4/d;-><init>(IIIII)V

    .line 113
    .line 114
    .line 115
    :goto_1
    move-object v4, v5

    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :sswitch_2
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v0, v5}, Lv5/u;->H(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v6}, Lv5/u;->H(I)V

    .line 140
    .line 141
    .line 142
    new-instance v6, Le4/c;

    .line 143
    .line 144
    invoke-direct {v6, v4, v5, v10}, Le4/c;-><init>(III)V

    .line 145
    .line 146
    .line 147
    move-object v4, v6

    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :sswitch_3
    const-string v4, "StreamFormatChunk"

    .line 151
    .line 152
    if-ne v3, v9, :cond_2

    .line 153
    .line 154
    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    invoke-virtual {v0, v11}, Lv5/u;->H(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    sparse-switch v11, :sswitch_data_1

    .line 173
    .line 174
    .line 175
    move-object v12, v10

    .line 176
    goto :goto_2

    .line 177
    :sswitch_4
    const-string v12, "video/mjpeg"

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :sswitch_5
    const-string v12, "video/mp43"

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :sswitch_6
    const-string v12, "video/mp42"

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :sswitch_7
    const-string v12, "video/avc"

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :sswitch_8
    const-string v12, "video/mp4v-es"

    .line 190
    .line 191
    :goto_2
    if-nez v12, :cond_1

    .line 192
    .line 193
    const-string v5, "Ignoring track with unsupported compression "

    .line 194
    .line 195
    invoke-static {v5, v11, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_4

    .line 199
    .line 200
    :cond_1
    new-instance v4, Lv3/i0$a;

    .line 201
    .line 202
    invoke-direct {v4}, Lv3/i0$a;-><init>()V

    .line 203
    .line 204
    .line 205
    iput v5, v4, Lv3/i0$a;->p:I

    .line 206
    .line 207
    iput v6, v4, Lv3/i0$a;->q:I

    .line 208
    .line 209
    iput-object v12, v4, Lv3/i0$a;->k:Ljava/lang/String;

    .line 210
    .line 211
    new-instance v5, Le4/g;

    .line 212
    .line 213
    new-instance v6, Lv3/i0;

    .line 214
    .line 215
    invoke-direct {v6, v4}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v5, v6}, Le4/g;-><init>(Lv3/i0;)V

    .line 219
    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_2
    if-ne v3, v8, :cond_b

    .line 223
    .line 224
    invoke-virtual/range {p1 .. p1}, Lv5/u;->n()I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    const-string v6, "audio/mp4a-latm"

    .line 229
    .line 230
    const-string v11, "audio/raw"

    .line 231
    .line 232
    if-eq v5, v8, :cond_7

    .line 233
    .line 234
    const/16 v12, 0x55

    .line 235
    .line 236
    if-eq v5, v12, :cond_6

    .line 237
    .line 238
    const/16 v12, 0xff

    .line 239
    .line 240
    if-eq v5, v12, :cond_5

    .line 241
    .line 242
    const/16 v12, 0x2000

    .line 243
    .line 244
    if-eq v5, v12, :cond_4

    .line 245
    .line 246
    const/16 v12, 0x2001

    .line 247
    .line 248
    if-eq v5, v12, :cond_3

    .line 249
    .line 250
    move-object v12, v10

    .line 251
    goto :goto_3

    .line 252
    :cond_3
    const-string v12, "audio/vnd.dts"

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_4
    const-string v12, "audio/ac3"

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_5
    move-object v12, v6

    .line 259
    goto :goto_3

    .line 260
    :cond_6
    const-string v12, "audio/mpeg"

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_7
    move-object v12, v11

    .line 264
    :goto_3
    if-nez v12, :cond_8

    .line 265
    .line 266
    const-string v6, "Ignoring track with unsupported format tag "

    .line 267
    .line 268
    invoke-static {v6, v5, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lv5/u;->n()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    const/4 v10, 0x6

    .line 281
    invoke-virtual {v0, v10}, Lv5/u;->H(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {p1 .. p1}, Lv5/u;->A()I

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    invoke-static {v10}, Lv5/e0;->v(I)I

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    invoke-virtual/range {p1 .. p1}, Lv5/u;->n()I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    new-array v14, v13, [B

    .line 297
    .line 298
    const/4 v15, 0x0

    .line 299
    invoke-virtual {v0, v14, v15, v13}, Lv5/u;->d([BII)V

    .line 300
    .line 301
    .line 302
    new-instance v15, Lv3/i0$a;

    .line 303
    .line 304
    invoke-direct {v15}, Lv3/i0$a;-><init>()V

    .line 305
    .line 306
    .line 307
    iput-object v12, v15, Lv3/i0$a;->k:Ljava/lang/String;

    .line 308
    .line 309
    iput v4, v15, Lv3/i0$a;->x:I

    .line 310
    .line 311
    iput v5, v15, Lv3/i0$a;->y:I

    .line 312
    .line 313
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_9

    .line 318
    .line 319
    if-eqz v10, :cond_9

    .line 320
    .line 321
    iput v10, v15, Lv3/i0$a;->z:I

    .line 322
    .line 323
    :cond_9
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_a

    .line 328
    .line 329
    if-lez v13, :cond_a

    .line 330
    .line 331
    invoke-static {v14}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    iput-object v4, v15, Lv3/i0$a;->m:Ljava/util/List;

    .line 336
    .line 337
    :cond_a
    new-instance v4, Le4/g;

    .line 338
    .line 339
    new-instance v5, Lv3/i0;

    .line 340
    .line 341
    invoke-direct {v5, v15}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 342
    .line 343
    .line 344
    invoke-direct {v4, v5}, Le4/g;-><init>(Lv3/i0;)V

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_b
    const-string v5, "Ignoring strf box for unsupported track type: "

    .line 349
    .line 350
    invoke-static {v5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-static {v3}, Lv5/e0;->A(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-static {v4, v5}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    :goto_4
    move-object v4, v10

    .line 369
    :goto_5
    if-eqz v4, :cond_10

    .line 370
    .line 371
    invoke-interface {v4}, Le4/a;->getType()I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    const v6, 0x68727473

    .line 376
    .line 377
    .line 378
    if-ne v5, v6, :cond_f

    .line 379
    .line 380
    move-object v3, v4

    .line 381
    check-cast v3, Le4/d;

    .line 382
    .line 383
    iget v5, v3, Le4/d;->a:I

    .line 384
    .line 385
    const v6, 0x73646976

    .line 386
    .line 387
    .line 388
    if-eq v5, v6, :cond_e

    .line 389
    .line 390
    const v6, 0x73647561

    .line 391
    .line 392
    .line 393
    if-eq v5, v6, :cond_d

    .line 394
    .line 395
    const v6, 0x73747874

    .line 396
    .line 397
    .line 398
    if-eq v5, v6, :cond_c

    .line 399
    .line 400
    const-string v5, "Found unsupported streamType fourCC: "

    .line 401
    .line 402
    invoke-static {v5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iget v3, v3, Le4/d;->a:I

    .line 407
    .line 408
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    const-string v5, "AviStreamHeaderChunk"

    .line 420
    .line 421
    invoke-static {v5, v3}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    const/4 v3, -0x1

    .line 425
    goto :goto_6

    .line 426
    :cond_c
    const/4 v3, 0x3

    .line 427
    goto :goto_6

    .line 428
    :cond_d
    move v3, v8

    .line 429
    goto :goto_6

    .line 430
    :cond_e
    move v3, v9

    .line 431
    :cond_f
    :goto_6
    invoke-virtual {v1, v4}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_10
    invoke-virtual {v0, v7}, Lv5/u;->G(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v2}, Lv5/u;->F(I)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_11
    new-instance v0, Le4/f;

    .line 443
    .line 444
    invoke-virtual {v1}, Lo7/t$a;->e()Lo7/l0;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    move/from16 v2, p0

    .line 449
    .line 450
    invoke-direct {v0, v2, v1}, Le4/f;-><init>(ILo7/l0;)V

    .line 451
    .line 452
    .line 453
    return-object v0

    .line 454
    nop

    .line 455
    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch
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


# virtual methods
.method public final a(Ljava/lang/Class;)Le4/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Le4/a;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le4/f;->a:Lo7/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lo7/t;->r(I)Lo7/t$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lo7/a;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lo7/a;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Le4/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, p1, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
    .line 29
    .line 30
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
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Le4/f;->b:I

    return v0
.end method
