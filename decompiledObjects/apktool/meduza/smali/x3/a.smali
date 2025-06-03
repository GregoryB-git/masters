.class public final Lx3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/a$a;
    }
.end annotation


# static fields
.field public static final a:[I

.field public static final b:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lx3/a;->a:[I

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lx3/a;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x17700
        0x15888
        0xfa00
        0xbb80
        0xac44
        0x7d00
        0x5dc0
        0x5622
        0x3e80
        0x2ee0
        0x2b11
        0x1f40
        0x1cb6
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        0x7
        0x8
        -0x1
        0x8
        -0x1
    .end array-data
.end method

.method public static a(III)[B
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [B

    shl-int/lit8 p0, p0, 0x3

    and-int/lit16 p0, p0, 0xf8

    shr-int/lit8 v1, p1, 0x1

    and-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    int-to-byte p0, p0

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    shl-int/lit8 p0, p1, 0x7

    and-int/lit16 p0, p0, 0x80

    shl-int/lit8 p1, p2, 0x3

    and-int/lit8 p1, p1, 0x78

    or-int/2addr p0, p1

    int-to-byte p0, p0

    const/4 p1, 0x1

    aput-byte p0, v0, p1

    return-object v0
.end method

.method public static b(Lv5/t;)I
    .locals 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xf

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lv5/t;->b()I

    move-result v0

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v2}, Lv5/t;->g(I)I

    move-result p0

    goto :goto_0

    :cond_0
    const-string p0, "AAC header insufficient data"

    invoke-static {p0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p0

    throw p0

    :cond_1
    const/16 p0, 0xd

    if-ge v0, p0, :cond_2

    sget-object p0, Lx3/a;->a:[I

    aget p0, p0, v0

    :goto_0
    return p0

    :cond_2
    const-string p0, "AAC header wrong Sampling Frequency Index"

    invoke-static {p0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p0

    throw p0
.end method

.method public static c(Lv5/t;Z)Lx3/a$a;
    .locals 11

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x1f

    .line 7
    .line 8
    const/4 v3, 0x6

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Lv5/t;->g(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, 0x20

    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lx3/a;->b(Lv5/t;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x4

    .line 22
    invoke-virtual {p0, v5}, Lv5/t;->g(I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-string v7, "mp4a.40."

    .line 27
    .line 28
    invoke-static {v7, v1}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const/16 v8, 0x16

    .line 33
    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    const/16 v9, 0x1d

    .line 37
    .line 38
    if-ne v1, v9, :cond_3

    .line 39
    .line 40
    :cond_1
    invoke-static {p0}, Lx3/a;->b(Lv5/t;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ne v0, v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Lv5/t;->g(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/lit8 v0, v0, 0x20

    .line 55
    .line 56
    :cond_2
    move v1, v0

    .line 57
    if-ne v1, v8, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, v5}, Lv5/t;->g(I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    :cond_3
    if-eqz p1, :cond_f

    .line 64
    .line 65
    const/16 p1, 0x11

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    const/4 v2, 0x3

    .line 69
    const/4 v9, 0x2

    .line 70
    if-eq v1, v0, :cond_4

    .line 71
    .line 72
    if-eq v1, v9, :cond_4

    .line 73
    .line 74
    if-eq v1, v2, :cond_4

    .line 75
    .line 76
    if-eq v1, v5, :cond_4

    .line 77
    .line 78
    if-eq v1, v3, :cond_4

    .line 79
    .line 80
    const/4 v5, 0x7

    .line 81
    if-eq v1, v5, :cond_4

    .line 82
    .line 83
    if-eq v1, p1, :cond_4

    .line 84
    .line 85
    packed-switch v1, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string p1, "Unsupported audio object type: "

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    throw p0

    .line 110
    :cond_4
    :pswitch_0
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    const-string v5, "AacUtil"

    .line 117
    .line 118
    const-string v10, "Unexpected frameLengthFlag = 1"

    .line 119
    .line 120
    invoke-static {v5, v10}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_6

    .line 128
    .line 129
    const/16 v5, 0xe

    .line 130
    .line 131
    invoke-virtual {p0, v5}, Lv5/t;->m(I)V

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v6, :cond_e

    .line 139
    .line 140
    const/16 v10, 0x14

    .line 141
    .line 142
    if-eq v1, v3, :cond_7

    .line 143
    .line 144
    if-ne v1, v10, :cond_8

    .line 145
    .line 146
    :cond_7
    invoke-virtual {p0, v2}, Lv5/t;->m(I)V

    .line 147
    .line 148
    .line 149
    :cond_8
    if-eqz v5, :cond_c

    .line 150
    .line 151
    if-ne v1, v8, :cond_9

    .line 152
    .line 153
    const/16 v3, 0x10

    .line 154
    .line 155
    invoke-virtual {p0, v3}, Lv5/t;->m(I)V

    .line 156
    .line 157
    .line 158
    :cond_9
    if-eq v1, p1, :cond_a

    .line 159
    .line 160
    const/16 p1, 0x13

    .line 161
    .line 162
    if-eq v1, p1, :cond_a

    .line 163
    .line 164
    if-eq v1, v10, :cond_a

    .line 165
    .line 166
    const/16 p1, 0x17

    .line 167
    .line 168
    if-ne v1, p1, :cond_b

    .line 169
    .line 170
    :cond_a
    invoke-virtual {p0, v2}, Lv5/t;->m(I)V

    .line 171
    .line 172
    .line 173
    :cond_b
    invoke-virtual {p0, v0}, Lv5/t;->m(I)V

    .line 174
    .line 175
    .line 176
    :cond_c
    packed-switch v1, :pswitch_data_1

    .line 177
    .line 178
    .line 179
    :pswitch_1
    goto :goto_0

    .line 180
    :pswitch_2
    invoke-virtual {p0, v9}, Lv5/t;->g(I)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eq p0, v9, :cond_d

    .line 185
    .line 186
    if-eq p0, v2, :cond_d

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v0, "Unsupported epConfig: "

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-static {p0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    throw p0

    .line 211
    :cond_e
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 212
    .line 213
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :cond_f
    :goto_0
    sget-object p0, Lx3/a;->b:[I

    .line 218
    .line 219
    aget p0, p0, v6

    .line 220
    .line 221
    const/4 p1, -0x1

    .line 222
    const/4 v0, 0x0

    .line 223
    if-eq p0, p1, :cond_10

    .line 224
    .line 225
    new-instance p1, Lx3/a$a;

    .line 226
    .line 227
    invoke-direct {p1, v4, p0, v7}, Lx3/a$a;-><init>(IILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object p1

    .line 231
    :cond_10
    invoke-static {v0, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    throw p0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
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
