.class public final Lr5/f$i;
.super Lr5/f$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr5/f$h<",
        "Lr5/f$i;",
        ">;"
    }
.end annotation


# instance fields
.field public final e:Z

.field public final f:Lr5/f$c;

.field public final o:Z

.field public final p:Z

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:Z

.field public final v:Z

.field public final w:I

.field public final x:Z

.field public final y:Z

.field public final z:I


# direct methods
.method public constructor <init>(ILz4/i0;ILr5/f$c;IIZ)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p3, p2}, Lr5/f$h;-><init>(IILz4/i0;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lr5/f$i;->f:Lr5/f$c;

    .line 5
    .line 6
    iget-boolean p1, p4, Lr5/f$c;->l0:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x18

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p1, 0x10

    .line 14
    .line 15
    :goto_0
    iget-boolean p2, p4, Lr5/f$c;->k0:Z

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    and-int p2, p6, p1

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    move p2, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p2, p3

    .line 28
    :goto_1
    iput-boolean p2, p0, Lr5/f$i;->v:Z

    .line 29
    .line 30
    const/high16 p2, -0x40800000    # -1.0f

    .line 31
    .line 32
    const/4 p6, -0x1

    .line 33
    if-eqz p7, :cond_6

    .line 34
    .line 35
    iget-object v1, p0, Lr5/f$h;->d:Lv3/i0;

    .line 36
    .line 37
    iget v2, v1, Lv3/i0;->y:I

    .line 38
    .line 39
    if-eq v2, p6, :cond_2

    .line 40
    .line 41
    iget v3, p4, Lr5/m;->a:I

    .line 42
    .line 43
    if-gt v2, v3, :cond_6

    .line 44
    .line 45
    :cond_2
    iget v2, v1, Lv3/i0;->z:I

    .line 46
    .line 47
    if-eq v2, p6, :cond_3

    .line 48
    .line 49
    iget v3, p4, Lr5/m;->b:I

    .line 50
    .line 51
    if-gt v2, v3, :cond_6

    .line 52
    .line 53
    :cond_3
    iget v2, v1, Lv3/i0;->A:F

    .line 54
    .line 55
    cmpl-float v3, v2, p2

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    iget v3, p4, Lr5/m;->c:I

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    cmpg-float v2, v2, v3

    .line 63
    .line 64
    if-gtz v2, :cond_6

    .line 65
    .line 66
    :cond_4
    iget v1, v1, Lv3/i0;->p:I

    .line 67
    .line 68
    if-eq v1, p6, :cond_5

    .line 69
    .line 70
    iget v2, p4, Lr5/m;->d:I

    .line 71
    .line 72
    if-gt v1, v2, :cond_6

    .line 73
    .line 74
    :cond_5
    move v1, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_6
    move v1, p3

    .line 77
    :goto_2
    iput-boolean v1, p0, Lr5/f$i;->e:Z

    .line 78
    .line 79
    if-eqz p7, :cond_b

    .line 80
    .line 81
    iget-object p7, p0, Lr5/f$h;->d:Lv3/i0;

    .line 82
    .line 83
    iget v1, p7, Lv3/i0;->y:I

    .line 84
    .line 85
    if-eq v1, p6, :cond_7

    .line 86
    .line 87
    iget v2, p4, Lr5/m;->e:I

    .line 88
    .line 89
    if-lt v1, v2, :cond_b

    .line 90
    .line 91
    :cond_7
    iget v1, p7, Lv3/i0;->z:I

    .line 92
    .line 93
    if-eq v1, p6, :cond_8

    .line 94
    .line 95
    iget v2, p4, Lr5/m;->f:I

    .line 96
    .line 97
    if-lt v1, v2, :cond_b

    .line 98
    .line 99
    :cond_8
    iget v1, p7, Lv3/i0;->A:F

    .line 100
    .line 101
    cmpl-float p2, v1, p2

    .line 102
    .line 103
    if-eqz p2, :cond_9

    .line 104
    .line 105
    iget p2, p4, Lr5/m;->o:I

    .line 106
    .line 107
    int-to-float p2, p2

    .line 108
    cmpl-float p2, v1, p2

    .line 109
    .line 110
    if-ltz p2, :cond_b

    .line 111
    .line 112
    :cond_9
    iget p2, p7, Lv3/i0;->p:I

    .line 113
    .line 114
    if-eq p2, p6, :cond_a

    .line 115
    .line 116
    iget p7, p4, Lr5/m;->p:I

    .line 117
    .line 118
    if-lt p2, p7, :cond_b

    .line 119
    .line 120
    :cond_a
    move p2, v0

    .line 121
    goto :goto_3

    .line 122
    :cond_b
    move p2, p3

    .line 123
    :goto_3
    iput-boolean p2, p0, Lr5/f$i;->o:Z

    .line 124
    .line 125
    invoke-static {p5, p3}, Lr5/f;->i(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    iput-boolean p2, p0, Lr5/f$i;->p:Z

    .line 130
    .line 131
    iget-object p2, p0, Lr5/f$h;->d:Lv3/i0;

    .line 132
    .line 133
    iget p7, p2, Lv3/i0;->p:I

    .line 134
    .line 135
    iput p7, p0, Lr5/f$i;->q:I

    .line 136
    .line 137
    iget p7, p2, Lv3/i0;->y:I

    .line 138
    .line 139
    if-eq p7, p6, :cond_d

    .line 140
    .line 141
    iget v1, p2, Lv3/i0;->z:I

    .line 142
    .line 143
    if-ne v1, p6, :cond_c

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_c
    mul-int/2addr p7, v1

    .line 147
    goto :goto_5

    .line 148
    :cond_d
    :goto_4
    move p7, p6

    .line 149
    :goto_5
    iput p7, p0, Lr5/f$i;->r:I

    .line 150
    .line 151
    iget p2, p2, Lv3/i0;->e:I

    .line 152
    .line 153
    iget p7, p4, Lr5/m;->u:I

    .line 154
    .line 155
    const v1, 0x7fffffff

    .line 156
    .line 157
    .line 158
    if-eqz p2, :cond_e

    .line 159
    .line 160
    if-ne p2, p7, :cond_e

    .line 161
    .line 162
    move p2, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_e
    and-int/2addr p2, p7

    .line 165
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    :goto_6
    iput p2, p0, Lr5/f$i;->t:I

    .line 170
    .line 171
    iget-object p2, p0, Lr5/f$h;->d:Lv3/i0;

    .line 172
    .line 173
    iget p2, p2, Lv3/i0;->e:I

    .line 174
    .line 175
    if-eqz p2, :cond_10

    .line 176
    .line 177
    and-int/2addr p2, v0

    .line 178
    if-eqz p2, :cond_f

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_f
    move p2, p3

    .line 182
    goto :goto_8

    .line 183
    :cond_10
    :goto_7
    move p2, v0

    .line 184
    :goto_8
    iput-boolean p2, p0, Lr5/f$i;->u:Z

    .line 185
    .line 186
    move p2, p3

    .line 187
    :goto_9
    iget-object p7, p4, Lr5/m;->t:Lo7/t;

    .line 188
    .line 189
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    .line 190
    .line 191
    .line 192
    move-result p7

    .line 193
    if-ge p2, p7, :cond_12

    .line 194
    .line 195
    iget-object p7, p0, Lr5/f$h;->d:Lv3/i0;

    .line 196
    .line 197
    iget-object p7, p7, Lv3/i0;->t:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz p7, :cond_11

    .line 200
    .line 201
    iget-object v2, p4, Lr5/m;->t:Lo7/t;

    .line 202
    .line 203
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {p7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p7

    .line 211
    if-eqz p7, :cond_11

    .line 212
    .line 213
    move v1, p2

    .line 214
    goto :goto_a

    .line 215
    :cond_11
    add-int/lit8 p2, p2, 0x1

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_12
    :goto_a
    iput v1, p0, Lr5/f$i;->s:I

    .line 219
    .line 220
    and-int/lit16 p2, p5, 0x180

    .line 221
    .line 222
    const/16 p4, 0x80

    .line 223
    .line 224
    if-ne p2, p4, :cond_13

    .line 225
    .line 226
    move p2, v0

    .line 227
    goto :goto_b

    .line 228
    :cond_13
    move p2, p3

    .line 229
    :goto_b
    iput-boolean p2, p0, Lr5/f$i;->x:Z

    .line 230
    .line 231
    and-int/lit8 p2, p5, 0x40

    .line 232
    .line 233
    const/16 p4, 0x40

    .line 234
    .line 235
    if-ne p2, p4, :cond_14

    .line 236
    .line 237
    move p2, v0

    .line 238
    goto :goto_c

    .line 239
    :cond_14
    move p2, p3

    .line 240
    :goto_c
    iput-boolean p2, p0, Lr5/f$i;->y:Z

    .line 241
    .line 242
    iget-object p2, p0, Lr5/f$h;->d:Lv3/i0;

    .line 243
    .line 244
    iget-object p4, p2, Lv3/i0;->t:Ljava/lang/String;

    .line 245
    .line 246
    const/4 p7, 0x2

    .line 247
    const/4 v1, 0x3

    .line 248
    const/4 v2, 0x4

    .line 249
    if-nez p4, :cond_15

    .line 250
    .line 251
    goto :goto_f

    .line 252
    :cond_15
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    sparse-switch v3, :sswitch_data_0

    .line 257
    .line 258
    .line 259
    :goto_d
    move p4, p6

    .line 260
    goto :goto_e

    .line 261
    :sswitch_0
    const-string v3, "video/x-vnd.on2.vp9"

    .line 262
    .line 263
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p4

    .line 267
    if-nez p4, :cond_16

    .line 268
    .line 269
    goto :goto_d

    .line 270
    :cond_16
    move p4, v2

    .line 271
    goto :goto_e

    .line 272
    :sswitch_1
    const-string v3, "video/avc"

    .line 273
    .line 274
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p4

    .line 278
    if-nez p4, :cond_17

    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_17
    move p4, v1

    .line 282
    goto :goto_e

    .line 283
    :sswitch_2
    const-string v3, "video/hevc"

    .line 284
    .line 285
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p4

    .line 289
    if-nez p4, :cond_18

    .line 290
    .line 291
    goto :goto_d

    .line 292
    :cond_18
    move p4, p7

    .line 293
    goto :goto_e

    .line 294
    :sswitch_3
    const-string v3, "video/av01"

    .line 295
    .line 296
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p4

    .line 300
    if-nez p4, :cond_19

    .line 301
    .line 302
    goto :goto_d

    .line 303
    :cond_19
    move p4, v0

    .line 304
    goto :goto_e

    .line 305
    :sswitch_4
    const-string v3, "video/dolby-vision"

    .line 306
    .line 307
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p4

    .line 311
    if-nez p4, :cond_1a

    .line 312
    .line 313
    goto :goto_d

    .line 314
    :cond_1a
    move p4, p3

    .line 315
    :goto_e
    packed-switch p4, :pswitch_data_0

    .line 316
    .line 317
    .line 318
    :goto_f
    move v1, p3

    .line 319
    goto :goto_10

    .line 320
    :pswitch_0
    move v1, p7

    .line 321
    goto :goto_10

    .line 322
    :pswitch_1
    move v1, v0

    .line 323
    goto :goto_10

    .line 324
    :pswitch_2
    move v1, v2

    .line 325
    goto :goto_10

    .line 326
    :pswitch_3
    const/4 v1, 0x5

    .line 327
    :goto_10
    :pswitch_4
    iput v1, p0, Lr5/f$i;->z:I

    .line 328
    .line 329
    iget p2, p2, Lv3/i0;->e:I

    .line 330
    .line 331
    and-int/lit16 p2, p2, 0x4000

    .line 332
    .line 333
    if-eqz p2, :cond_1b

    .line 334
    .line 335
    goto :goto_11

    .line 336
    :cond_1b
    iget-object p2, p0, Lr5/f$i;->f:Lr5/f$c;

    .line 337
    .line 338
    iget-boolean p2, p2, Lr5/f$c;->t0:Z

    .line 339
    .line 340
    invoke-static {p5, p2}, Lr5/f;->i(IZ)Z

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    if-nez p2, :cond_1c

    .line 345
    .line 346
    goto :goto_11

    .line 347
    :cond_1c
    iget-boolean p2, p0, Lr5/f$i;->e:Z

    .line 348
    .line 349
    if-nez p2, :cond_1d

    .line 350
    .line 351
    iget-object p2, p0, Lr5/f$i;->f:Lr5/f$c;

    .line 352
    .line 353
    iget-boolean p2, p2, Lr5/f$c;->j0:Z

    .line 354
    .line 355
    if-nez p2, :cond_1d

    .line 356
    .line 357
    goto :goto_11

    .line 358
    :cond_1d
    invoke-static {p5, p3}, Lr5/f;->i(IZ)Z

    .line 359
    .line 360
    .line 361
    move-result p2

    .line 362
    if-eqz p2, :cond_1e

    .line 363
    .line 364
    iget-boolean p2, p0, Lr5/f$i;->o:Z

    .line 365
    .line 366
    if-eqz p2, :cond_1e

    .line 367
    .line 368
    iget-boolean p2, p0, Lr5/f$i;->e:Z

    .line 369
    .line 370
    if-eqz p2, :cond_1e

    .line 371
    .line 372
    iget-object p2, p0, Lr5/f$h;->d:Lv3/i0;

    .line 373
    .line 374
    iget p2, p2, Lv3/i0;->p:I

    .line 375
    .line 376
    if-eq p2, p6, :cond_1e

    .line 377
    .line 378
    iget-object p2, p0, Lr5/f$i;->f:Lr5/f$c;

    .line 379
    .line 380
    iget-boolean p3, p2, Lr5/m;->F:Z

    .line 381
    .line 382
    if-nez p3, :cond_1e

    .line 383
    .line 384
    iget-boolean p2, p2, Lr5/m;->E:Z

    .line 385
    .line 386
    if-nez p2, :cond_1e

    .line 387
    .line 388
    and-int/2addr p1, p5

    .line 389
    if-eqz p1, :cond_1e

    .line 390
    .line 391
    move p3, p7

    .line 392
    goto :goto_11

    .line 393
    :cond_1e
    move p3, v0

    .line 394
    :goto_11
    iput p3, p0, Lr5/f$i;->w:I

    .line 395
    .line 396
    return-void

    .line 397
    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static h(Lr5/f$i;Lr5/f$i;)I
    .locals 4

    .line 1
    sget-object v0, Lo7/n;->a:Lo7/n$a;

    .line 2
    .line 3
    iget-boolean v1, p0, Lr5/f$i;->p:Z

    .line 4
    .line 5
    iget-boolean v2, p1, Lr5/f$i;->p:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lo7/n$a;->c(ZZ)Lo7/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lr5/f$i;->t:I

    .line 12
    .line 13
    iget v2, p1, Lr5/f$i;->t:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lo7/n;->a(II)Lo7/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-boolean v1, p0, Lr5/f$i;->u:Z

    .line 20
    .line 21
    iget-boolean v2, p1, Lr5/f$i;->u:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lo7/n;->c(ZZ)Lo7/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-boolean v1, p0, Lr5/f$i;->e:Z

    .line 28
    .line 29
    iget-boolean v2, p1, Lr5/f$i;->e:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lo7/n;->c(ZZ)Lo7/n;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-boolean v1, p0, Lr5/f$i;->o:Z

    .line 36
    .line 37
    iget-boolean v2, p1, Lr5/f$i;->o:Z

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lo7/n;->c(ZZ)Lo7/n;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, p0, Lr5/f$i;->s:I

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget v2, p1, Lr5/f$i;->s:I

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lo7/j0;->a:Lo7/j0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v3, Lo7/o0;->a:Lo7/o0;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2, v3}, Lo7/n;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-boolean v1, p0, Lr5/f$i;->x:Z

    .line 67
    .line 68
    iget-boolean v2, p1, Lr5/f$i;->x:Z

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lo7/n;->c(ZZ)Lo7/n;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-boolean v1, p0, Lr5/f$i;->y:Z

    .line 75
    .line 76
    iget-boolean v2, p1, Lr5/f$i;->y:Z

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Lo7/n;->c(ZZ)Lo7/n;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-boolean v1, p0, Lr5/f$i;->x:Z

    .line 83
    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    iget-boolean v1, p0, Lr5/f$i;->y:Z

    .line 87
    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    iget p0, p0, Lr5/f$i;->z:I

    .line 91
    .line 92
    iget p1, p1, Lr5/f$i;->z:I

    .line 93
    .line 94
    invoke-virtual {v0, p0, p1}, Lo7/n;->a(II)Lo7/n;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_0
    invoke-virtual {v0}, Lo7/n;->e()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0
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

.method public static i(Lr5/f$i;Lr5/f$i;)I
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr5/f$i;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lr5/f$i;->p:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lr5/f;->j:Lo7/k0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lr5/f;->j:Lo7/k0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lo7/k0;->a()Lo7/k0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    sget-object v1, Lo7/n;->a:Lo7/n$a;

    .line 19
    .line 20
    iget v2, p0, Lr5/f$i;->q:I

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v3, p1, Lr5/f$i;->q:I

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, p0, Lr5/f$i;->f:Lr5/f$c;

    .line 33
    .line 34
    iget-boolean v4, v4, Lr5/m;->E:Z

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    sget-object v4, Lr5/f;->j:Lo7/k0;

    .line 39
    .line 40
    invoke-virtual {v4}, Lo7/k0;->a()Lo7/k0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v4, Lr5/f;->k:Lo7/k0;

    .line 46
    .line 47
    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lo7/n$a;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v2, p0, Lr5/f$i;->r:I

    .line 52
    .line 53
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v3, p1, Lr5/f$i;->r:I

    .line 58
    .line 59
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v2, v3, v0}, Lo7/n;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget p0, p0, Lr5/f$i;->q:I

    .line 68
    .line 69
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget p1, p1, Lr5/f$i;->q:I

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v1, p0, p1, v0}, Lo7/n;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Lo7/n;->e()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0
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


# virtual methods
.method public final f()I
    .locals 1

    iget v0, p0, Lr5/f$i;->w:I

    return v0
.end method

.method public final g(Lr5/f$h;)Z
    .locals 2

    check-cast p1, Lr5/f$i;

    iget-boolean v0, p0, Lr5/f$i;->v:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lr5/f$h;->d:Lv3/i0;

    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    iget-object v1, p1, Lr5/f$h;->d:Lv3/i0;

    iget-object v1, v1, Lv3/i0;->t:Ljava/lang/String;

    invoke-static {v0, v1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr5/f$i;->f:Lr5/f$c;

    iget-boolean v0, v0, Lr5/f$c;->m0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lr5/f$i;->x:Z

    iget-boolean v1, p1, Lr5/f$i;->x:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lr5/f$i;->y:Z

    iget-boolean p1, p1, Lr5/f$i;->y:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
