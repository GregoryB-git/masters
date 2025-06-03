.class public final Lo4/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/p$a;,
        Lo4/p$d;,
        Lo4/p$e;,
        Lo4/p$c;,
        Lo4/p$f;,
        Lo4/p$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lo4/p$a;",
            "Ljava/util/List<",
            "Lo4/l;",
            ">;>;"
        }
    .end annotation
.end field

.field public static c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^\\D?(\\d+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo4/p;->a:Ljava/util/regex/Pattern;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo4/p;->b:Ljava/util/HashMap;

    const/4 v0, -0x1

    sput v0, Lo4/p;->c:I

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget p0, Lv5/e0;->a:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Lv5/e0;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "R9"

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lo4/l;

    .line 38
    .line 39
    iget-object p0, p0, Lo4/l;->a:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const-string v2, "OMX.google.raw.decoder"

    .line 55
    .line 56
    const-string v3, "audio/raw"

    .line 57
    .line 58
    const-string v4, "audio/raw"

    .line 59
    .line 60
    invoke-static/range {v2 .. v9}, Lo4/l;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lo4/l;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_0
    new-instance p0, Le0/e;

    .line 68
    .line 69
    const/16 v2, 0xd

    .line 70
    .line 71
    invoke-direct {p0, v2}, Le0/e;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lo4/o;

    .line 75
    .line 76
    invoke-direct {v2, p0, v0}, Lo4/o;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    sget p0, Lv5/e0;->a:I

    .line 83
    .line 84
    const/16 v2, 0x15

    .line 85
    .line 86
    if-ge p0, v2, :cond_3

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-le v2, v1, :cond_3

    .line 93
    .line 94
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lo4/l;

    .line 99
    .line 100
    iget-object v2, v2, Lo4/l;->a:Ljava/lang/String;

    .line 101
    .line 102
    const-string v3, "OMX.SEC.mp3.dec"

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    const-string v3, "OMX.SEC.MP3.Decoder"

    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_2

    .line 117
    .line 118
    const-string v3, "OMX.brcm.audio.mp3.decoder"

    .line 119
    .line 120
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    :cond_2
    new-instance v2, Lw3/v;

    .line 127
    .line 128
    const/16 v3, 0x8

    .line 129
    .line 130
    invoke-direct {v2, v3}, Lw3/v;-><init>(I)V

    .line 131
    .line 132
    .line 133
    new-instance v3, Lo4/o;

    .line 134
    .line 135
    invoke-direct {v3, v2, v0}, Lo4/o;-><init>(Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    const/16 v2, 0x20

    .line 142
    .line 143
    if-ge p0, v2, :cond_4

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-le p0, v1, :cond_4

    .line 150
    .line 151
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Lo4/l;

    .line 156
    .line 157
    iget-object p0, p0, Lo4/l;->a:Ljava/lang/String;

    .line 158
    .line 159
    const-string v1, "OMX.qti.audio.decoder.flac"

    .line 160
    .line 161
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_4

    .line 166
    .line 167
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, Lo4/l;

    .line 172
    .line 173
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_4
    return-void
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

.method public static b(Lv3/i0;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lv3/i0;->t:Ljava/lang/String;

    const-string v1, "audio/eac3-joc"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "audio/eac3"

    return-object p0

    :cond_0
    iget-object v0, p0, Lv3/i0;->t:Ljava/lang/String;

    const-string v1, "video/dolby-vision"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lo4/p;->d(Lv3/i0;)Landroid/util/Pair;

    move-result-object p0

    if-eqz p0, :cond_3

    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x10

    if-eq p0, v0, :cond_2

    const/16 v0, 0x100

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x200

    if-ne p0, v0, :cond_3

    const-string p0, "video/avc"

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "video/hevc"

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string p0, "video/dolby-vision"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "OMX.MS.HEVCDV.Decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "video/hevcdv"

    return-object p0

    :cond_2
    const-string p0, "OMX.RTK.video.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, "OMX.realtek.video.decoder.tunneled"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    :cond_3
    const-string p0, "video/dv_hevc"

    return-object p0

    :cond_4
    const-string p0, "audio/alac"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "OMX.lge.alac.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "audio/x-lg-alac"

    return-object p0

    :cond_5
    const-string p0, "audio/flac"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "OMX.lge.flac.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "audio/x-lg-flac"

    return-object p0

    :cond_6
    const-string p0, "audio/ac3"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "OMX.lge.ac3.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "audio/lg-ac3"

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Lv3/i0;)Landroid/util/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/i0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    const-string v3, "\\."

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v3, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "video/dolby-vision"

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    const-string v5, "MediaCodecUtil"

    .line 26
    .line 27
    const/16 v6, 0x10

    .line 28
    .line 29
    const/16 v7, 0x8

    .line 30
    .line 31
    const/4 v8, 0x6

    .line 32
    const/4 v9, -0x1

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x4

    .line 35
    const/4 v12, 0x3

    .line 36
    const/4 v13, 0x2

    .line 37
    const/4 v14, 0x1

    .line 38
    if-eqz v3, :cond_1e

    .line 39
    .line 40
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 41
    .line 42
    array-length v3, v1

    .line 43
    if-ge v3, v12, :cond_1

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v3, Lo4/p;->a:Ljava/util/regex/Pattern;

    .line 52
    .line 53
    aget-object v4, v1, v14

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_0
    const-string v3, "Ignoring malformed Dolby Vision codec string: "

    .line 71
    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_2
    invoke-virtual {v3, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 83
    .line 84
    .line 85
    const/4 v3, -0x1

    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    packed-switch v4, :pswitch_data_0

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :pswitch_0
    const-string v4, "09"

    .line 96
    .line 97
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_4

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_4
    const/16 v3, 0x9

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :pswitch_1
    const-string v4, "08"

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_5

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_5
    const/16 v3, 0x8

    .line 120
    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :pswitch_2
    const-string v4, "07"

    .line 124
    .line 125
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_6

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    const/4 v3, 0x7

    .line 133
    goto :goto_1

    .line 134
    :pswitch_3
    const-string v4, "06"

    .line 135
    .line 136
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_7

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    const/4 v3, 0x6

    .line 144
    goto :goto_1

    .line 145
    :pswitch_4
    const-string v4, "05"

    .line 146
    .line 147
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_8

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_8
    const/4 v3, 0x5

    .line 155
    goto :goto_1

    .line 156
    :pswitch_5
    const-string v4, "04"

    .line 157
    .line 158
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_9

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_9
    const/4 v3, 0x4

    .line 166
    goto :goto_1

    .line 167
    :pswitch_6
    const-string v4, "03"

    .line 168
    .line 169
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_a

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_a
    const/4 v3, 0x3

    .line 177
    goto :goto_1

    .line 178
    :pswitch_7
    const-string v4, "02"

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-nez v4, :cond_b

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_b
    const/4 v3, 0x2

    .line 188
    goto :goto_1

    .line 189
    :pswitch_8
    const-string v4, "01"

    .line 190
    .line 191
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_c

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_c
    const/4 v3, 0x1

    .line 199
    goto :goto_1

    .line 200
    :pswitch_9
    const-string v4, "00"

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_d

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_d
    const/4 v3, 0x0

    .line 210
    :goto_1
    packed-switch v3, :pswitch_data_1

    .line 211
    .line 212
    .line 213
    :goto_2
    move-object v3, v2

    .line 214
    goto :goto_4

    .line 215
    :pswitch_a
    const/16 v3, 0x200

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :pswitch_b
    const/16 v3, 0x100

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :pswitch_c
    const/16 v3, 0x80

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :pswitch_d
    const/16 v3, 0x40

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_e
    const/16 v3, 0x20

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :pswitch_f
    move v3, v6

    .line 231
    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    goto :goto_4

    .line 236
    :pswitch_10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    goto :goto_4

    .line 241
    :pswitch_11
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    goto :goto_4

    .line 246
    :pswitch_12
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    goto :goto_4

    .line 251
    :pswitch_13
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :goto_4
    if-nez v3, :cond_e

    .line 256
    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v3, "Unknown Dolby Vision profile string: "

    .line 263
    .line 264
    goto/16 :goto_9

    .line 265
    .line 266
    :cond_e
    aget-object v0, v1, v13

    .line 267
    .line 268
    if-nez v0, :cond_f

    .line 269
    .line 270
    goto/16 :goto_6

    .line 271
    .line 272
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 273
    .line 274
    .line 275
    const/4 v1, -0x1

    .line 276
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    sparse-switch v4, :sswitch_data_0

    .line 281
    .line 282
    .line 283
    goto/16 :goto_5

    .line 284
    .line 285
    :sswitch_0
    const-string v4, "13"

    .line 286
    .line 287
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_10

    .line 292
    .line 293
    goto/16 :goto_5

    .line 294
    .line 295
    :cond_10
    const/16 v1, 0xc

    .line 296
    .line 297
    goto/16 :goto_5

    .line 298
    .line 299
    :sswitch_1
    const-string v4, "12"

    .line 300
    .line 301
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-nez v4, :cond_11

    .line 306
    .line 307
    goto/16 :goto_5

    .line 308
    .line 309
    :cond_11
    const/16 v1, 0xb

    .line 310
    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :sswitch_2
    const-string v4, "11"

    .line 314
    .line 315
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_12

    .line 320
    .line 321
    goto/16 :goto_5

    .line 322
    .line 323
    :cond_12
    const/16 v1, 0xa

    .line 324
    .line 325
    goto/16 :goto_5

    .line 326
    .line 327
    :sswitch_3
    const-string v4, "10"

    .line 328
    .line 329
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-nez v4, :cond_13

    .line 334
    .line 335
    goto/16 :goto_5

    .line 336
    .line 337
    :cond_13
    const/16 v1, 0x9

    .line 338
    .line 339
    goto/16 :goto_5

    .line 340
    .line 341
    :sswitch_4
    const-string v4, "09"

    .line 342
    .line 343
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-nez v4, :cond_14

    .line 348
    .line 349
    goto/16 :goto_5

    .line 350
    .line 351
    :cond_14
    const/16 v1, 0x8

    .line 352
    .line 353
    goto/16 :goto_5

    .line 354
    .line 355
    :sswitch_5
    const-string v4, "08"

    .line 356
    .line 357
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-nez v4, :cond_15

    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_15
    const/4 v1, 0x7

    .line 365
    goto :goto_5

    .line 366
    :sswitch_6
    const-string v4, "07"

    .line 367
    .line 368
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    if-nez v4, :cond_16

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_16
    const/4 v1, 0x6

    .line 376
    goto :goto_5

    .line 377
    :sswitch_7
    const-string v4, "06"

    .line 378
    .line 379
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-nez v4, :cond_17

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_17
    const/4 v1, 0x5

    .line 387
    goto :goto_5

    .line 388
    :sswitch_8
    const-string v4, "05"

    .line 389
    .line 390
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-nez v4, :cond_18

    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_18
    const/4 v1, 0x4

    .line 398
    goto :goto_5

    .line 399
    :sswitch_9
    const-string v4, "04"

    .line 400
    .line 401
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-nez v4, :cond_19

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_19
    const/4 v1, 0x3

    .line 409
    goto :goto_5

    .line 410
    :sswitch_a
    const-string v4, "03"

    .line 411
    .line 412
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-nez v4, :cond_1a

    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_1a
    const/4 v1, 0x2

    .line 420
    goto :goto_5

    .line 421
    :sswitch_b
    const-string v4, "02"

    .line 422
    .line 423
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-nez v4, :cond_1b

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_1b
    const/4 v1, 0x1

    .line 431
    goto :goto_5

    .line 432
    :sswitch_c
    const-string v4, "01"

    .line 433
    .line 434
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    if-nez v4, :cond_1c

    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_1c
    const/4 v1, 0x0

    .line 442
    :goto_5
    packed-switch v1, :pswitch_data_2

    .line 443
    .line 444
    .line 445
    :goto_6
    move-object v1, v2

    .line 446
    goto :goto_8

    .line 447
    :pswitch_14
    const/16 v6, 0x1000

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :pswitch_15
    const/16 v6, 0x800

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :pswitch_16
    const/16 v6, 0x400

    .line 454
    .line 455
    goto :goto_7

    .line 456
    :pswitch_17
    const/16 v6, 0x200

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :pswitch_18
    const/16 v6, 0x100

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :pswitch_19
    const/16 v6, 0x80

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :pswitch_1a
    const/16 v6, 0x40

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :pswitch_1b
    const/16 v6, 0x20

    .line 469
    .line 470
    :goto_7
    :pswitch_1c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    goto :goto_8

    .line 475
    :pswitch_1d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    goto :goto_8

    .line 480
    :pswitch_1e
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    goto :goto_8

    .line 485
    :pswitch_1f
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    goto :goto_8

    .line 490
    :pswitch_20
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    :goto_8
    if-nez v1, :cond_1d

    .line 495
    .line 496
    new-instance v1, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    const-string v3, "Unknown Dolby Vision level string: "

    .line 502
    .line 503
    :goto_9
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_1d
    new-instance v2, Landroid/util/Pair;

    .line 518
    .line 519
    invoke-direct {v2, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :goto_a
    return-object v2

    .line 523
    :cond_1e
    aget-object v3, v1, v10

    .line 524
    .line 525
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 532
    .line 533
    .line 534
    move-result v16

    .line 535
    sparse-switch v16, :sswitch_data_1

    .line 536
    .line 537
    .line 538
    :goto_b
    const/4 v15, -0x1

    .line 539
    goto :goto_c

    .line 540
    :sswitch_d
    const-string v15, "vp09"

    .line 541
    .line 542
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    if-nez v3, :cond_1f

    .line 547
    .line 548
    goto :goto_b

    .line 549
    :cond_1f
    const/4 v15, 0x6

    .line 550
    goto :goto_c

    .line 551
    :sswitch_e
    const-string v15, "mp4a"

    .line 552
    .line 553
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-nez v3, :cond_20

    .line 558
    .line 559
    goto :goto_b

    .line 560
    :cond_20
    const/4 v15, 0x5

    .line 561
    goto :goto_c

    .line 562
    :sswitch_f
    const-string v15, "hvc1"

    .line 563
    .line 564
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-nez v3, :cond_21

    .line 569
    .line 570
    goto :goto_b

    .line 571
    :cond_21
    const/4 v15, 0x4

    .line 572
    goto :goto_c

    .line 573
    :sswitch_10
    const-string v15, "hev1"

    .line 574
    .line 575
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-nez v3, :cond_22

    .line 580
    .line 581
    goto :goto_b

    .line 582
    :cond_22
    const/4 v15, 0x3

    .line 583
    goto :goto_c

    .line 584
    :sswitch_11
    const-string v15, "avc2"

    .line 585
    .line 586
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-nez v3, :cond_23

    .line 591
    .line 592
    goto :goto_b

    .line 593
    :cond_23
    const/4 v15, 0x2

    .line 594
    goto :goto_c

    .line 595
    :sswitch_12
    const-string v15, "avc1"

    .line 596
    .line 597
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-nez v3, :cond_24

    .line 602
    .line 603
    goto :goto_b

    .line 604
    :cond_24
    const/4 v15, 0x1

    .line 605
    goto :goto_c

    .line 606
    :sswitch_13
    const-string v15, "av01"

    .line 607
    .line 608
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    if-nez v3, :cond_25

    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_25
    const/4 v15, 0x0

    .line 616
    :goto_c
    packed-switch v15, :pswitch_data_3

    .line 617
    .line 618
    .line 619
    return-object v2

    .line 620
    :pswitch_21
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 621
    .line 622
    array-length v3, v1

    .line 623
    if-ge v3, v12, :cond_26

    .line 624
    .line 625
    new-instance v1, Ljava/lang/StringBuilder;

    .line 626
    .line 627
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_f

    .line 631
    .line 632
    :cond_26
    :try_start_0
    aget-object v3, v1, v14

    .line 633
    .line 634
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    aget-object v1, v1, v13

    .line 639
    .line 640
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 641
    .line 642
    .line 643
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 644
    if-eqz v3, :cond_2a

    .line 645
    .line 646
    if-eq v3, v14, :cond_29

    .line 647
    .line 648
    if-eq v3, v13, :cond_28

    .line 649
    .line 650
    if-eq v3, v12, :cond_27

    .line 651
    .line 652
    move v1, v9

    .line 653
    goto :goto_d

    .line 654
    :cond_27
    move v1, v7

    .line 655
    goto :goto_d

    .line 656
    :cond_28
    move v1, v11

    .line 657
    goto :goto_d

    .line 658
    :cond_29
    move v1, v13

    .line 659
    goto :goto_d

    .line 660
    :cond_2a
    move v1, v14

    .line 661
    :goto_d
    if-ne v1, v9, :cond_2b

    .line 662
    .line 663
    const-string v0, "Unknown VP9 profile: "

    .line 664
    .line 665
    invoke-static {v0, v3}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    goto/16 :goto_11

    .line 670
    .line 671
    :cond_2b
    if-eq v0, v4, :cond_34

    .line 672
    .line 673
    const/16 v3, 0xb

    .line 674
    .line 675
    if-eq v0, v3, :cond_33

    .line 676
    .line 677
    const/16 v3, 0x14

    .line 678
    .line 679
    if-eq v0, v3, :cond_32

    .line 680
    .line 681
    const/16 v3, 0x15

    .line 682
    .line 683
    if-eq v0, v3, :cond_31

    .line 684
    .line 685
    const/16 v3, 0x1e

    .line 686
    .line 687
    if-eq v0, v3, :cond_35

    .line 688
    .line 689
    const/16 v3, 0x1f

    .line 690
    .line 691
    if-eq v0, v3, :cond_30

    .line 692
    .line 693
    const/16 v3, 0x28

    .line 694
    .line 695
    if-eq v0, v3, :cond_2f

    .line 696
    .line 697
    const/16 v3, 0x29

    .line 698
    .line 699
    if-eq v0, v3, :cond_2e

    .line 700
    .line 701
    const/16 v3, 0x32

    .line 702
    .line 703
    if-eq v0, v3, :cond_2d

    .line 704
    .line 705
    const/16 v3, 0x33

    .line 706
    .line 707
    if-eq v0, v3, :cond_2c

    .line 708
    .line 709
    packed-switch v0, :pswitch_data_4

    .line 710
    .line 711
    .line 712
    move v6, v9

    .line 713
    goto :goto_e

    .line 714
    :pswitch_22
    const/16 v6, 0x2000

    .line 715
    .line 716
    goto :goto_e

    .line 717
    :pswitch_23
    const/16 v6, 0x1000

    .line 718
    .line 719
    goto :goto_e

    .line 720
    :pswitch_24
    const/16 v6, 0x800

    .line 721
    .line 722
    goto :goto_e

    .line 723
    :cond_2c
    const/16 v6, 0x200

    .line 724
    .line 725
    goto :goto_e

    .line 726
    :cond_2d
    const/16 v6, 0x100

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_2e
    const/16 v6, 0x80

    .line 730
    .line 731
    goto :goto_e

    .line 732
    :cond_2f
    const/16 v6, 0x40

    .line 733
    .line 734
    goto :goto_e

    .line 735
    :cond_30
    const/16 v6, 0x20

    .line 736
    .line 737
    goto :goto_e

    .line 738
    :cond_31
    move v6, v7

    .line 739
    goto :goto_e

    .line 740
    :cond_32
    move v6, v11

    .line 741
    goto :goto_e

    .line 742
    :cond_33
    move v6, v13

    .line 743
    goto :goto_e

    .line 744
    :cond_34
    move v6, v14

    .line 745
    :cond_35
    :goto_e
    if-ne v6, v9, :cond_36

    .line 746
    .line 747
    new-instance v1, Ljava/lang/StringBuilder;

    .line 748
    .line 749
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 750
    .line 751
    .line 752
    const-string v3, "Unknown VP9 level: "

    .line 753
    .line 754
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    goto :goto_10

    .line 761
    :cond_36
    new-instance v2, Landroid/util/Pair;

    .line 762
    .line 763
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    goto :goto_12

    .line 775
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 778
    .line 779
    .line 780
    :goto_f
    const-string v3, "Ignoring malformed VP9 codec string: "

    .line 781
    .line 782
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    :goto_10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    :goto_11
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    :goto_12
    return-object v2

    .line 796
    :pswitch_25
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 797
    .line 798
    array-length v3, v1

    .line 799
    const-string v4, "Ignoring malformed MP4A codec string: "

    .line 800
    .line 801
    if-eq v3, v12, :cond_37

    .line 802
    .line 803
    new-instance v1, Ljava/lang/StringBuilder;

    .line 804
    .line 805
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 806
    .line 807
    .line 808
    goto :goto_14

    .line 809
    :cond_37
    :try_start_1
    aget-object v3, v1, v14

    .line 810
    .line 811
    invoke-static {v3, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    invoke-static {v3}, Lv5/p;->f(I)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    const-string v6, "audio/mp4a-latm"

    .line 820
    .line 821
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    if-eqz v3, :cond_39

    .line 826
    .line 827
    aget-object v1, v1, v13

    .line 828
    .line 829
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    const/16 v3, 0x11

    .line 834
    .line 835
    if-eq v1, v3, :cond_38

    .line 836
    .line 837
    const/16 v3, 0x14

    .line 838
    .line 839
    if-eq v1, v3, :cond_38

    .line 840
    .line 841
    const/16 v3, 0x17

    .line 842
    .line 843
    if-eq v1, v3, :cond_38

    .line 844
    .line 845
    const/16 v3, 0x1d

    .line 846
    .line 847
    if-eq v1, v3, :cond_38

    .line 848
    .line 849
    const/16 v3, 0x27

    .line 850
    .line 851
    if-eq v1, v3, :cond_38

    .line 852
    .line 853
    const/16 v3, 0x2a

    .line 854
    .line 855
    if-eq v1, v3, :cond_38

    .line 856
    .line 857
    packed-switch v1, :pswitch_data_5

    .line 858
    .line 859
    .line 860
    move v8, v9

    .line 861
    goto :goto_13

    .line 862
    :pswitch_26
    const/4 v8, 0x5

    .line 863
    goto :goto_13

    .line 864
    :pswitch_27
    move v8, v11

    .line 865
    goto :goto_13

    .line 866
    :pswitch_28
    move v8, v12

    .line 867
    goto :goto_13

    .line 868
    :pswitch_29
    move v8, v13

    .line 869
    goto :goto_13

    .line 870
    :pswitch_2a
    move v8, v14

    .line 871
    goto :goto_13

    .line 872
    :cond_38
    move v8, v3

    .line 873
    :goto_13
    :pswitch_2b
    if-eq v8, v9, :cond_39

    .line 874
    .line 875
    new-instance v1, Landroid/util/Pair;

    .line 876
    .line 877
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 882
    .line 883
    .line 884
    move-result-object v6

    .line 885
    invoke-direct {v1, v3, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 886
    .line 887
    .line 888
    move-object v2, v1

    .line 889
    goto :goto_15

    .line 890
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 893
    .line 894
    .line 895
    :goto_14
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    :cond_39
    :goto_15
    return-object v2

    .line 909
    :pswitch_2c
    iget-object v2, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 910
    .line 911
    iget-object v0, v0, Lv3/i0;->F:Lw5/b;

    .line 912
    .line 913
    array-length v3, v1

    .line 914
    if-ge v3, v11, :cond_3a

    .line 915
    .line 916
    new-instance v0, Ljava/lang/StringBuilder;

    .line 917
    .line 918
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 919
    .line 920
    .line 921
    goto :goto_16

    .line 922
    :cond_3a
    sget-object v3, Lo4/p;->a:Ljava/util/regex/Pattern;

    .line 923
    .line 924
    aget-object v4, v1, v14

    .line 925
    .line 926
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-nez v4, :cond_3b

    .line 935
    .line 936
    new-instance v0, Ljava/lang/StringBuilder;

    .line 937
    .line 938
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 939
    .line 940
    .line 941
    :goto_16
    const-string v1, "Ignoring malformed HEVC codec string: "

    .line 942
    .line 943
    goto/16 :goto_1c

    .line 944
    .line 945
    :cond_3b
    invoke-virtual {v3, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const-string v3, "1"

    .line 950
    .line 951
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v3

    .line 955
    if-eqz v3, :cond_3c

    .line 956
    .line 957
    move v0, v14

    .line 958
    goto :goto_17

    .line 959
    :cond_3c
    const-string v3, "2"

    .line 960
    .line 961
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    if-eqz v3, :cond_5a

    .line 966
    .line 967
    if-eqz v0, :cond_3d

    .line 968
    .line 969
    iget v0, v0, Lw5/b;->c:I

    .line 970
    .line 971
    if-ne v0, v8, :cond_3d

    .line 972
    .line 973
    const/16 v0, 0x1000

    .line 974
    .line 975
    goto :goto_17

    .line 976
    :cond_3d
    move v0, v13

    .line 977
    :goto_17
    aget-object v1, v1, v12

    .line 978
    .line 979
    if-nez v1, :cond_3e

    .line 980
    .line 981
    goto/16 :goto_19

    .line 982
    .line 983
    :cond_3e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 984
    .line 985
    .line 986
    const/4 v2, -0x1

    .line 987
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    sparse-switch v3, :sswitch_data_2

    .line 992
    .line 993
    .line 994
    goto/16 :goto_18

    .line 995
    .line 996
    :sswitch_14
    const-string v3, "L186"

    .line 997
    .line 998
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    if-nez v3, :cond_3f

    .line 1003
    .line 1004
    goto/16 :goto_18

    .line 1005
    .line 1006
    :cond_3f
    const/16 v2, 0x19

    .line 1007
    .line 1008
    goto/16 :goto_18

    .line 1009
    .line 1010
    :sswitch_15
    const-string v3, "L183"

    .line 1011
    .line 1012
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v3

    .line 1016
    if-nez v3, :cond_40

    .line 1017
    .line 1018
    goto/16 :goto_18

    .line 1019
    .line 1020
    :cond_40
    const/16 v2, 0x18

    .line 1021
    .line 1022
    goto/16 :goto_18

    .line 1023
    .line 1024
    :sswitch_16
    const-string v3, "L180"

    .line 1025
    .line 1026
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v3

    .line 1030
    if-nez v3, :cond_41

    .line 1031
    .line 1032
    goto/16 :goto_18

    .line 1033
    .line 1034
    :cond_41
    const/16 v2, 0x17

    .line 1035
    .line 1036
    goto/16 :goto_18

    .line 1037
    .line 1038
    :sswitch_17
    const-string v3, "L156"

    .line 1039
    .line 1040
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v3

    .line 1044
    if-nez v3, :cond_42

    .line 1045
    .line 1046
    goto/16 :goto_18

    .line 1047
    .line 1048
    :cond_42
    const/16 v2, 0x16

    .line 1049
    .line 1050
    goto/16 :goto_18

    .line 1051
    .line 1052
    :sswitch_18
    const-string v3, "L153"

    .line 1053
    .line 1054
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    if-nez v3, :cond_43

    .line 1059
    .line 1060
    goto/16 :goto_18

    .line 1061
    .line 1062
    :cond_43
    const/16 v2, 0x15

    .line 1063
    .line 1064
    goto/16 :goto_18

    .line 1065
    .line 1066
    :sswitch_19
    const-string v3, "L150"

    .line 1067
    .line 1068
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v3

    .line 1072
    if-nez v3, :cond_44

    .line 1073
    .line 1074
    goto/16 :goto_18

    .line 1075
    .line 1076
    :cond_44
    const/16 v2, 0x14

    .line 1077
    .line 1078
    goto/16 :goto_18

    .line 1079
    .line 1080
    :sswitch_1a
    const-string v3, "L123"

    .line 1081
    .line 1082
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v3

    .line 1086
    if-nez v3, :cond_45

    .line 1087
    .line 1088
    goto/16 :goto_18

    .line 1089
    .line 1090
    :cond_45
    const/16 v2, 0x13

    .line 1091
    .line 1092
    goto/16 :goto_18

    .line 1093
    .line 1094
    :sswitch_1b
    const-string v3, "L120"

    .line 1095
    .line 1096
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v3

    .line 1100
    if-nez v3, :cond_46

    .line 1101
    .line 1102
    goto/16 :goto_18

    .line 1103
    .line 1104
    :cond_46
    const/16 v2, 0x12

    .line 1105
    .line 1106
    goto/16 :goto_18

    .line 1107
    .line 1108
    :sswitch_1c
    const-string v3, "H186"

    .line 1109
    .line 1110
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v3

    .line 1114
    if-nez v3, :cond_47

    .line 1115
    .line 1116
    goto/16 :goto_18

    .line 1117
    .line 1118
    :cond_47
    const/16 v2, 0x11

    .line 1119
    .line 1120
    goto/16 :goto_18

    .line 1121
    .line 1122
    :sswitch_1d
    const-string v3, "H183"

    .line 1123
    .line 1124
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    if-nez v3, :cond_48

    .line 1129
    .line 1130
    goto/16 :goto_18

    .line 1131
    .line 1132
    :cond_48
    const/16 v2, 0x10

    .line 1133
    .line 1134
    goto/16 :goto_18

    .line 1135
    .line 1136
    :sswitch_1e
    const-string v3, "H180"

    .line 1137
    .line 1138
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    if-nez v3, :cond_49

    .line 1143
    .line 1144
    goto/16 :goto_18

    .line 1145
    .line 1146
    :cond_49
    const/16 v2, 0xf

    .line 1147
    .line 1148
    goto/16 :goto_18

    .line 1149
    .line 1150
    :sswitch_1f
    const-string v3, "H156"

    .line 1151
    .line 1152
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v3

    .line 1156
    if-nez v3, :cond_4a

    .line 1157
    .line 1158
    goto/16 :goto_18

    .line 1159
    .line 1160
    :cond_4a
    const/16 v2, 0xe

    .line 1161
    .line 1162
    goto/16 :goto_18

    .line 1163
    .line 1164
    :sswitch_20
    const-string v3, "H153"

    .line 1165
    .line 1166
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    if-nez v3, :cond_4b

    .line 1171
    .line 1172
    goto/16 :goto_18

    .line 1173
    .line 1174
    :cond_4b
    const/16 v2, 0xd

    .line 1175
    .line 1176
    goto/16 :goto_18

    .line 1177
    .line 1178
    :sswitch_21
    const-string v3, "H150"

    .line 1179
    .line 1180
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v3

    .line 1184
    if-nez v3, :cond_4c

    .line 1185
    .line 1186
    goto/16 :goto_18

    .line 1187
    .line 1188
    :cond_4c
    const/16 v2, 0xc

    .line 1189
    .line 1190
    goto/16 :goto_18

    .line 1191
    .line 1192
    :sswitch_22
    const-string v3, "H123"

    .line 1193
    .line 1194
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    if-nez v3, :cond_4d

    .line 1199
    .line 1200
    goto/16 :goto_18

    .line 1201
    .line 1202
    :cond_4d
    const/16 v2, 0xb

    .line 1203
    .line 1204
    goto/16 :goto_18

    .line 1205
    .line 1206
    :sswitch_23
    const-string v3, "H120"

    .line 1207
    .line 1208
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v3

    .line 1212
    if-nez v3, :cond_4e

    .line 1213
    .line 1214
    goto/16 :goto_18

    .line 1215
    .line 1216
    :cond_4e
    const/16 v2, 0xa

    .line 1217
    .line 1218
    goto/16 :goto_18

    .line 1219
    .line 1220
    :sswitch_24
    const-string v3, "L93"

    .line 1221
    .line 1222
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v3

    .line 1226
    if-nez v3, :cond_4f

    .line 1227
    .line 1228
    goto/16 :goto_18

    .line 1229
    .line 1230
    :cond_4f
    const/16 v2, 0x9

    .line 1231
    .line 1232
    goto/16 :goto_18

    .line 1233
    .line 1234
    :sswitch_25
    const-string v3, "L90"

    .line 1235
    .line 1236
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v3

    .line 1240
    if-nez v3, :cond_50

    .line 1241
    .line 1242
    goto/16 :goto_18

    .line 1243
    .line 1244
    :cond_50
    const/16 v2, 0x8

    .line 1245
    .line 1246
    goto/16 :goto_18

    .line 1247
    .line 1248
    :sswitch_26
    const-string v3, "L63"

    .line 1249
    .line 1250
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    if-nez v3, :cond_51

    .line 1255
    .line 1256
    goto :goto_18

    .line 1257
    :cond_51
    const/4 v2, 0x7

    .line 1258
    goto :goto_18

    .line 1259
    :sswitch_27
    const-string v3, "L60"

    .line 1260
    .line 1261
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v3

    .line 1265
    if-nez v3, :cond_52

    .line 1266
    .line 1267
    goto :goto_18

    .line 1268
    :cond_52
    const/4 v2, 0x6

    .line 1269
    goto :goto_18

    .line 1270
    :sswitch_28
    const-string v3, "L30"

    .line 1271
    .line 1272
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v3

    .line 1276
    if-nez v3, :cond_53

    .line 1277
    .line 1278
    goto :goto_18

    .line 1279
    :cond_53
    const/4 v2, 0x5

    .line 1280
    goto :goto_18

    .line 1281
    :sswitch_29
    const-string v3, "H93"

    .line 1282
    .line 1283
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v3

    .line 1287
    if-nez v3, :cond_54

    .line 1288
    .line 1289
    goto :goto_18

    .line 1290
    :cond_54
    const/4 v2, 0x4

    .line 1291
    goto :goto_18

    .line 1292
    :sswitch_2a
    const-string v3, "H90"

    .line 1293
    .line 1294
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    if-nez v3, :cond_55

    .line 1299
    .line 1300
    goto :goto_18

    .line 1301
    :cond_55
    const/4 v2, 0x3

    .line 1302
    goto :goto_18

    .line 1303
    :sswitch_2b
    const-string v3, "H63"

    .line 1304
    .line 1305
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v3

    .line 1309
    if-nez v3, :cond_56

    .line 1310
    .line 1311
    goto :goto_18

    .line 1312
    :cond_56
    const/4 v2, 0x2

    .line 1313
    goto :goto_18

    .line 1314
    :sswitch_2c
    const-string v3, "H60"

    .line 1315
    .line 1316
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v3

    .line 1320
    if-nez v3, :cond_57

    .line 1321
    .line 1322
    goto :goto_18

    .line 1323
    :cond_57
    const/4 v2, 0x1

    .line 1324
    goto :goto_18

    .line 1325
    :sswitch_2d
    const-string v3, "H30"

    .line 1326
    .line 1327
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v3

    .line 1331
    if-nez v3, :cond_58

    .line 1332
    .line 1333
    goto :goto_18

    .line 1334
    :cond_58
    const/4 v2, 0x0

    .line 1335
    :goto_18
    packed-switch v2, :pswitch_data_6

    .line 1336
    .line 1337
    .line 1338
    :goto_19
    const/4 v2, 0x0

    .line 1339
    goto/16 :goto_1b

    .line 1340
    .line 1341
    :pswitch_2d
    const/high16 v6, 0x1000000

    .line 1342
    .line 1343
    goto :goto_1a

    .line 1344
    :pswitch_2e
    const/high16 v6, 0x400000

    .line 1345
    .line 1346
    goto :goto_1a

    .line 1347
    :pswitch_2f
    const/high16 v6, 0x100000

    .line 1348
    .line 1349
    goto :goto_1a

    .line 1350
    :pswitch_30
    const/high16 v6, 0x40000

    .line 1351
    .line 1352
    goto :goto_1a

    .line 1353
    :pswitch_31
    const/high16 v6, 0x10000

    .line 1354
    .line 1355
    goto :goto_1a

    .line 1356
    :pswitch_32
    const/16 v6, 0x4000

    .line 1357
    .line 1358
    goto :goto_1a

    .line 1359
    :pswitch_33
    const/16 v6, 0x1000

    .line 1360
    .line 1361
    goto :goto_1a

    .line 1362
    :pswitch_34
    const/16 v6, 0x400

    .line 1363
    .line 1364
    goto :goto_1a

    .line 1365
    :pswitch_35
    const/high16 v6, 0x2000000

    .line 1366
    .line 1367
    goto :goto_1a

    .line 1368
    :pswitch_36
    const/high16 v6, 0x800000

    .line 1369
    .line 1370
    goto :goto_1a

    .line 1371
    :pswitch_37
    const/high16 v6, 0x200000

    .line 1372
    .line 1373
    goto :goto_1a

    .line 1374
    :pswitch_38
    const/high16 v6, 0x80000

    .line 1375
    .line 1376
    goto :goto_1a

    .line 1377
    :pswitch_39
    const/high16 v6, 0x20000

    .line 1378
    .line 1379
    goto :goto_1a

    .line 1380
    :pswitch_3a
    const v6, 0x8000

    .line 1381
    .line 1382
    .line 1383
    goto :goto_1a

    .line 1384
    :pswitch_3b
    const/16 v6, 0x2000

    .line 1385
    .line 1386
    goto :goto_1a

    .line 1387
    :pswitch_3c
    const/16 v6, 0x800

    .line 1388
    .line 1389
    goto :goto_1a

    .line 1390
    :pswitch_3d
    const/16 v6, 0x100

    .line 1391
    .line 1392
    goto :goto_1a

    .line 1393
    :pswitch_3e
    const/16 v6, 0x40

    .line 1394
    .line 1395
    goto :goto_1a

    .line 1396
    :pswitch_3f
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    goto :goto_1b

    .line 1401
    :pswitch_40
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    goto :goto_1b

    .line 1406
    :pswitch_41
    const/16 v6, 0x200

    .line 1407
    .line 1408
    goto :goto_1a

    .line 1409
    :pswitch_42
    const/16 v6, 0x80

    .line 1410
    .line 1411
    goto :goto_1a

    .line 1412
    :pswitch_43
    const/16 v6, 0x20

    .line 1413
    .line 1414
    :goto_1a
    :pswitch_44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v2

    .line 1418
    goto :goto_1b

    .line 1419
    :pswitch_45
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v2

    .line 1423
    goto :goto_1b

    .line 1424
    :pswitch_46
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    :goto_1b
    if-nez v2, :cond_59

    .line 1429
    .line 1430
    const-string v0, "Unknown HEVC level string: "

    .line 1431
    .line 1432
    invoke-static {v0, v1}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    goto :goto_1d

    .line 1437
    :cond_59
    new-instance v1, Landroid/util/Pair;

    .line 1438
    .line 1439
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_1e

    .line 1447
    :cond_5a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1448
    .line 1449
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1450
    .line 1451
    .line 1452
    const-string v1, "Unknown HEVC profile string: "

    .line 1453
    .line 1454
    :goto_1c
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    .line 1460
    :goto_1d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    const/4 v1, 0x0

    .line 1468
    :goto_1e
    return-object v1

    .line 1469
    :pswitch_47
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 1470
    .line 1471
    array-length v2, v1

    .line 1472
    const-string v3, "Ignoring malformed AVC codec string: "

    .line 1473
    .line 1474
    if-ge v2, v13, :cond_5b

    .line 1475
    .line 1476
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1477
    .line 1478
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1479
    .line 1480
    .line 1481
    goto/16 :goto_22

    .line 1482
    .line 1483
    :cond_5b
    :try_start_2
    aget-object v2, v1, v14

    .line 1484
    .line 1485
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    if-ne v2, v8, :cond_5c

    .line 1490
    .line 1491
    aget-object v2, v1, v14

    .line 1492
    .line 1493
    invoke-virtual {v2, v10, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v2

    .line 1497
    invoke-static {v2, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1498
    .line 1499
    .line 1500
    move-result v2

    .line 1501
    aget-object v1, v1, v14

    .line 1502
    .line 1503
    invoke-virtual {v1, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v1

    .line 1507
    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1508
    .line 1509
    .line 1510
    move-result v0

    .line 1511
    goto :goto_1f

    .line 1512
    :cond_5c
    array-length v2, v1

    .line 1513
    if-lt v2, v12, :cond_66

    .line 1514
    .line 1515
    aget-object v2, v1, v14

    .line 1516
    .line 1517
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1518
    .line 1519
    .line 1520
    move-result v2

    .line 1521
    aget-object v1, v1, v13

    .line 1522
    .line 1523
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1527
    :goto_1f
    const/16 v1, 0x42

    .line 1528
    .line 1529
    if-eq v2, v1, :cond_62

    .line 1530
    .line 1531
    const/16 v1, 0x4d

    .line 1532
    .line 1533
    if-eq v2, v1, :cond_63

    .line 1534
    .line 1535
    const/16 v1, 0x58

    .line 1536
    .line 1537
    if-eq v2, v1, :cond_61

    .line 1538
    .line 1539
    const/16 v1, 0x64

    .line 1540
    .line 1541
    if-eq v2, v1, :cond_60

    .line 1542
    .line 1543
    const/16 v1, 0x6e

    .line 1544
    .line 1545
    if-eq v2, v1, :cond_5f

    .line 1546
    .line 1547
    const/16 v1, 0x7a

    .line 1548
    .line 1549
    if-eq v2, v1, :cond_5e

    .line 1550
    .line 1551
    const/16 v1, 0xf4

    .line 1552
    .line 1553
    if-eq v2, v1, :cond_5d

    .line 1554
    .line 1555
    move v13, v9

    .line 1556
    goto :goto_20

    .line 1557
    :cond_5d
    const/16 v13, 0x40

    .line 1558
    .line 1559
    goto :goto_20

    .line 1560
    :cond_5e
    const/16 v13, 0x20

    .line 1561
    .line 1562
    goto :goto_20

    .line 1563
    :cond_5f
    move v13, v6

    .line 1564
    goto :goto_20

    .line 1565
    :cond_60
    move v13, v7

    .line 1566
    goto :goto_20

    .line 1567
    :cond_61
    move v13, v11

    .line 1568
    goto :goto_20

    .line 1569
    :cond_62
    move v13, v14

    .line 1570
    :cond_63
    :goto_20
    if-ne v13, v9, :cond_64

    .line 1571
    .line 1572
    const-string v0, "Unknown AVC profile: "

    .line 1573
    .line 1574
    invoke-static {v0, v2}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    goto/16 :goto_24

    .line 1579
    .line 1580
    :cond_64
    packed-switch v0, :pswitch_data_7

    .line 1581
    .line 1582
    .line 1583
    packed-switch v0, :pswitch_data_8

    .line 1584
    .line 1585
    .line 1586
    packed-switch v0, :pswitch_data_9

    .line 1587
    .line 1588
    .line 1589
    packed-switch v0, :pswitch_data_a

    .line 1590
    .line 1591
    .line 1592
    packed-switch v0, :pswitch_data_b

    .line 1593
    .line 1594
    .line 1595
    move v6, v9

    .line 1596
    goto :goto_21

    .line 1597
    :pswitch_48
    move v6, v7

    .line 1598
    goto :goto_21

    .line 1599
    :pswitch_49
    move v6, v11

    .line 1600
    goto :goto_21

    .line 1601
    :pswitch_4a
    move v6, v14

    .line 1602
    goto :goto_21

    .line 1603
    :pswitch_4b
    const/16 v6, 0x80

    .line 1604
    .line 1605
    goto :goto_21

    .line 1606
    :pswitch_4c
    const/16 v6, 0x40

    .line 1607
    .line 1608
    goto :goto_21

    .line 1609
    :pswitch_4d
    const/16 v6, 0x20

    .line 1610
    .line 1611
    goto :goto_21

    .line 1612
    :pswitch_4e
    const/16 v6, 0x400

    .line 1613
    .line 1614
    goto :goto_21

    .line 1615
    :pswitch_4f
    const/16 v6, 0x200

    .line 1616
    .line 1617
    goto :goto_21

    .line 1618
    :pswitch_50
    const/16 v6, 0x100

    .line 1619
    .line 1620
    goto :goto_21

    .line 1621
    :pswitch_51
    const/16 v6, 0x2000

    .line 1622
    .line 1623
    goto :goto_21

    .line 1624
    :pswitch_52
    const/16 v6, 0x1000

    .line 1625
    .line 1626
    goto :goto_21

    .line 1627
    :pswitch_53
    const/16 v6, 0x800

    .line 1628
    .line 1629
    goto :goto_21

    .line 1630
    :pswitch_54
    const/high16 v6, 0x10000

    .line 1631
    .line 1632
    goto :goto_21

    .line 1633
    :pswitch_55
    const v6, 0x8000

    .line 1634
    .line 1635
    .line 1636
    goto :goto_21

    .line 1637
    :pswitch_56
    const/16 v6, 0x4000

    .line 1638
    .line 1639
    :goto_21
    :pswitch_57
    if-ne v6, v9, :cond_65

    .line 1640
    .line 1641
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1642
    .line 1643
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1644
    .line 1645
    .line 1646
    const-string v2, "Unknown AVC level: "

    .line 1647
    .line 1648
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1652
    .line 1653
    .line 1654
    goto :goto_23

    .line 1655
    :cond_65
    new-instance v0, Landroid/util/Pair;

    .line 1656
    .line 1657
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v2

    .line 1665
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1666
    .line 1667
    .line 1668
    goto :goto_26

    .line 1669
    :cond_66
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v1

    .line 1684
    invoke-static {v5, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1685
    .line 1686
    .line 1687
    goto :goto_25

    .line 1688
    :catch_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1691
    .line 1692
    .line 1693
    :goto_22
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1697
    .line 1698
    .line 1699
    :goto_23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    :goto_24
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    :goto_25
    const/4 v0, 0x0

    .line 1707
    :goto_26
    return-object v0

    .line 1708
    :pswitch_58
    iget-object v2, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 1709
    .line 1710
    iget-object v0, v0, Lv3/i0;->F:Lw5/b;

    .line 1711
    .line 1712
    array-length v3, v1

    .line 1713
    if-ge v3, v11, :cond_67

    .line 1714
    .line 1715
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1718
    .line 1719
    .line 1720
    goto/16 :goto_29

    .line 1721
    .line 1722
    :cond_67
    :try_start_4
    aget-object v3, v1, v14

    .line 1723
    .line 1724
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1725
    .line 1726
    .line 1727
    move-result v3

    .line 1728
    aget-object v15, v1, v13

    .line 1729
    .line 1730
    invoke-virtual {v15, v10, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v10

    .line 1734
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1735
    .line 1736
    .line 1737
    move-result v10

    .line 1738
    aget-object v1, v1, v12

    .line 1739
    .line 1740
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1741
    .line 1742
    .line 1743
    move-result v1
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1744
    if-eqz v3, :cond_68

    .line 1745
    .line 1746
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1747
    .line 1748
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1749
    .line 1750
    .line 1751
    const-string v1, "Unknown AV1 profile: "

    .line 1752
    .line 1753
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1757
    .line 1758
    .line 1759
    goto/16 :goto_2a

    .line 1760
    .line 1761
    :cond_68
    if-eq v1, v7, :cond_69

    .line 1762
    .line 1763
    if-eq v1, v4, :cond_69

    .line 1764
    .line 1765
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1766
    .line 1767
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1768
    .line 1769
    .line 1770
    const-string v2, "Unknown AV1 bit depth: "

    .line 1771
    .line 1772
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1776
    .line 1777
    .line 1778
    goto/16 :goto_2a

    .line 1779
    .line 1780
    :cond_69
    if-ne v1, v7, :cond_6a

    .line 1781
    .line 1782
    move v0, v14

    .line 1783
    goto :goto_27

    .line 1784
    :cond_6a
    if-eqz v0, :cond_6c

    .line 1785
    .line 1786
    iget-object v1, v0, Lw5/b;->d:[B

    .line 1787
    .line 1788
    if-nez v1, :cond_6b

    .line 1789
    .line 1790
    iget v0, v0, Lw5/b;->c:I

    .line 1791
    .line 1792
    const/4 v1, 0x7

    .line 1793
    if-eq v0, v1, :cond_6b

    .line 1794
    .line 1795
    if-ne v0, v8, :cond_6c

    .line 1796
    .line 1797
    :cond_6b
    const/16 v0, 0x1000

    .line 1798
    .line 1799
    goto :goto_27

    .line 1800
    :cond_6c
    move v0, v13

    .line 1801
    :goto_27
    packed-switch v10, :pswitch_data_c

    .line 1802
    .line 1803
    .line 1804
    move v6, v9

    .line 1805
    goto :goto_28

    .line 1806
    :pswitch_59
    const/high16 v6, 0x800000

    .line 1807
    .line 1808
    goto :goto_28

    .line 1809
    :pswitch_5a
    const/high16 v6, 0x400000

    .line 1810
    .line 1811
    goto :goto_28

    .line 1812
    :pswitch_5b
    const/high16 v6, 0x200000

    .line 1813
    .line 1814
    goto :goto_28

    .line 1815
    :pswitch_5c
    const/high16 v6, 0x100000

    .line 1816
    .line 1817
    goto :goto_28

    .line 1818
    :pswitch_5d
    const/high16 v6, 0x80000

    .line 1819
    .line 1820
    goto :goto_28

    .line 1821
    :pswitch_5e
    const/high16 v6, 0x40000

    .line 1822
    .line 1823
    goto :goto_28

    .line 1824
    :pswitch_5f
    const/high16 v6, 0x20000

    .line 1825
    .line 1826
    goto :goto_28

    .line 1827
    :pswitch_60
    const/high16 v6, 0x10000

    .line 1828
    .line 1829
    goto :goto_28

    .line 1830
    :pswitch_61
    const v6, 0x8000

    .line 1831
    .line 1832
    .line 1833
    goto :goto_28

    .line 1834
    :pswitch_62
    const/16 v6, 0x4000

    .line 1835
    .line 1836
    goto :goto_28

    .line 1837
    :pswitch_63
    const/16 v6, 0x2000

    .line 1838
    .line 1839
    goto :goto_28

    .line 1840
    :pswitch_64
    const/16 v6, 0x1000

    .line 1841
    .line 1842
    goto :goto_28

    .line 1843
    :pswitch_65
    const/16 v6, 0x800

    .line 1844
    .line 1845
    goto :goto_28

    .line 1846
    :pswitch_66
    const/16 v6, 0x400

    .line 1847
    .line 1848
    goto :goto_28

    .line 1849
    :pswitch_67
    const/16 v6, 0x200

    .line 1850
    .line 1851
    goto :goto_28

    .line 1852
    :pswitch_68
    const/16 v6, 0x100

    .line 1853
    .line 1854
    goto :goto_28

    .line 1855
    :pswitch_69
    const/16 v6, 0x80

    .line 1856
    .line 1857
    goto :goto_28

    .line 1858
    :pswitch_6a
    const/16 v6, 0x40

    .line 1859
    .line 1860
    goto :goto_28

    .line 1861
    :pswitch_6b
    const/16 v6, 0x20

    .line 1862
    .line 1863
    goto :goto_28

    .line 1864
    :pswitch_6c
    move v6, v7

    .line 1865
    goto :goto_28

    .line 1866
    :pswitch_6d
    move v6, v11

    .line 1867
    goto :goto_28

    .line 1868
    :pswitch_6e
    move v6, v13

    .line 1869
    goto :goto_28

    .line 1870
    :pswitch_6f
    move v6, v14

    .line 1871
    :goto_28
    :pswitch_70
    if-ne v6, v9, :cond_6d

    .line 1872
    .line 1873
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1874
    .line 1875
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1876
    .line 1877
    .line 1878
    const-string v1, "Unknown AV1 level: "

    .line 1879
    .line 1880
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1884
    .line 1885
    .line 1886
    goto :goto_2a

    .line 1887
    :cond_6d
    new-instance v1, Landroid/util/Pair;

    .line 1888
    .line 1889
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v0

    .line 1893
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v2

    .line 1897
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1898
    .line 1899
    .line 1900
    goto :goto_2b

    .line 1901
    :catch_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1902
    .line 1903
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1904
    .line 1905
    .line 1906
    :goto_29
    const-string v1, "Ignoring malformed AV1 codec string: "

    .line 1907
    .line 1908
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1912
    .line 1913
    .line 1914
    :goto_2a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1919
    .line 1920
    .line 1921
    const/4 v1, 0x0

    .line 1922
    :goto_2b
    return-object v1

    .line 1923
    :pswitch_data_0
    .packed-switch 0x600
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    :sswitch_data_0
    .sparse-switch
        0x601 -> :sswitch_c
        0x602 -> :sswitch_b
        0x603 -> :sswitch_a
        0x604 -> :sswitch_9
        0x605 -> :sswitch_8
        0x606 -> :sswitch_7
        0x607 -> :sswitch_6
        0x608 -> :sswitch_5
        0x609 -> :sswitch_4
        0x61f -> :sswitch_3
        0x620 -> :sswitch_2
        0x621 -> :sswitch_1
        0x622 -> :sswitch_0
    .end sparse-switch

    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    :sswitch_data_1
    .sparse-switch
        0x2dd8f6 -> :sswitch_13
        0x2ddf23 -> :sswitch_12
        0x2ddf24 -> :sswitch_11
        0x30d038 -> :sswitch_10
        0x310dbc -> :sswitch_f
        0x333790 -> :sswitch_e
        0x374e43 -> :sswitch_d
    .end sparse-switch

    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_58
        :pswitch_47
        :pswitch_47
        :pswitch_2c
        :pswitch_2c
        :pswitch_25
        :pswitch_21
    .end packed-switch

    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    :pswitch_data_4
    .packed-switch 0x3c
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_2b
    .end packed-switch

    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    :sswitch_data_2
    .sparse-switch
        0x114a5 -> :sswitch_2d
        0x11502 -> :sswitch_2c
        0x11505 -> :sswitch_2b
        0x1155f -> :sswitch_2a
        0x11562 -> :sswitch_29
        0x123a9 -> :sswitch_28
        0x12406 -> :sswitch_27
        0x12409 -> :sswitch_26
        0x12463 -> :sswitch_25
        0x12466 -> :sswitch_24
        0x2178e7 -> :sswitch_23
        0x2178ea -> :sswitch_22
        0x217944 -> :sswitch_21
        0x217947 -> :sswitch_20
        0x21794a -> :sswitch_1f
        0x2179a1 -> :sswitch_1e
        0x2179a4 -> :sswitch_1d
        0x2179a7 -> :sswitch_1c
        0x234a63 -> :sswitch_1b
        0x234a66 -> :sswitch_1a
        0x234ac0 -> :sswitch_19
        0x234ac3 -> :sswitch_18
        0x234ac6 -> :sswitch_17
        0x234b1d -> :sswitch_16
        0x234b20 -> :sswitch_15
        0x234b23 -> :sswitch_14
    .end sparse-switch

    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_46
        :pswitch_45
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_44
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    :pswitch_data_7
    .packed-switch 0xa
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_57
    .end packed-switch

    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    :pswitch_data_8
    .packed-switch 0x14
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch

    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    :pswitch_data_9
    .packed-switch 0x1e
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
    .end packed-switch

    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    :pswitch_data_a
    .packed-switch 0x28
        :pswitch_53
        :pswitch_52
        :pswitch_51
    .end packed-switch

    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    :pswitch_data_b
    .packed-switch 0x32
        :pswitch_56
        :pswitch_55
        :pswitch_54
    .end packed-switch

    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_70
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
    .end packed-switch
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public static declared-synchronized e(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lo4/l;",
            ">;"
        }
    .end annotation

    const-class v0, Lo4/p;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lo4/p$a;

    invoke-direct {v1, p0, p1, p2}, Lo4/p$a;-><init>(Ljava/lang/String;ZZ)V

    sget-object v2, Lo4/p;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    monitor-exit v0

    return-object v3

    :cond_0
    :try_start_1
    sget v3, Lv5/e0;->a:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_1

    new-instance v5, Lo4/p$e;

    invoke-direct {v5, p1, p2}, Lo4/p$e;-><init>(ZZ)V

    goto :goto_0

    :cond_1
    new-instance v5, Lo4/p$d;

    invoke-direct {v5}, Lo4/p$d;-><init>()V

    :goto_0
    invoke-static {v1, v5}, Lo4/p;->f(Lo4/p$a;Lo4/p$c;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    if-gt v4, v3, :cond_2

    const/16 p1, 0x17

    if-gt v3, p1, :cond_2

    new-instance p1, Lo4/p$d;

    invoke-direct {p1}, Lo4/p$d;-><init>()V

    invoke-static {v1, p1}, Lo4/p;->f(Lo4/p$a;Lo4/p$c;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "MediaCodecUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MediaCodecList API didn\'t list secure decoder for: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ". Assuming: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo4/l;

    iget-object v4, v4, Lo4/l;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {p0, p2}, Lo4/p;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p2}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p0

    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static f(Lo4/p$a;Lo4/p$c;)Ljava/util/ArrayList;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/p$a;",
            "Lo4/p$c;",
            ")",
            "Ljava/util/ArrayList<",
            "Lo4/l;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "secure-playback"

    .line 6
    .line 7
    const-string v4, "tunneled-playback"

    .line 8
    .line 9
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v14, v1, Lo4/p$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface/range {p1 .. p1}, Lo4/p$c;->d()I

    .line 17
    .line 18
    .line 19
    move-result v15

    .line 20
    invoke-interface/range {p1 .. p1}, Lo4/p$c;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    move/from16 v12, v16

    .line 27
    .line 28
    :goto_0
    if-ge v12, v15, :cond_11

    .line 29
    .line 30
    invoke-interface {v2, v12}, Lo4/p$c;->a(I)Landroid/media/MediaCodecInfo;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget v6, Lv5/e0;->a:I

    .line 35
    .line 36
    const/16 v7, 0x1d

    .line 37
    .line 38
    if-lt v6, v7, :cond_0

    .line 39
    .line 40
    invoke-static {v0}, Laa/u;->u(Landroid/media/MediaCodecInfo;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_0

    .line 45
    .line 46
    const/4 v9, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move/from16 v9, v16

    .line 49
    .line 50
    :goto_1
    if-eqz v9, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-static {v0, v11, v13, v14}, Lo4/p;->g(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {v0, v11, v14}, Lo4/p;->c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    .line 68
    if-nez v10, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    :try_start_1
    invoke-virtual {v0, v10}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-interface {v2, v4, v10, v9}, Lo4/p$c;->b(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 76
    .line 77
    .line 78
    move-result v17

    .line 79
    invoke-interface {v2, v4, v9}, Lo4/p$c;->c(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 80
    .line 81
    .line 82
    move-result v18

    .line 83
    iget-boolean v8, v1, Lo4/p$a;->c:Z

    .line 84
    .line 85
    if-nez v8, :cond_4

    .line 86
    .line 87
    if-nez v18, :cond_7

    .line 88
    .line 89
    :cond_4
    if-eqz v8, :cond_5

    .line 90
    .line 91
    if-nez v17, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    invoke-interface {v2, v3, v10, v9}, Lo4/p$c;->b(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-interface {v2, v3, v9}, Lo4/p$c;->c(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 99
    .line 100
    .line 101
    move-result v17

    .line 102
    iget-boolean v7, v1, Lo4/p$a;->b:Z

    .line 103
    .line 104
    if-nez v7, :cond_6

    .line 105
    .line 106
    if-nez v17, :cond_7

    .line 107
    .line 108
    :cond_6
    if-eqz v7, :cond_8

    .line 109
    .line 110
    if-nez v8, :cond_8

    .line 111
    .line 112
    :cond_7
    :goto_2
    move/from16 v22, v12

    .line 113
    .line 114
    move/from16 v23, v13

    .line 115
    .line 116
    goto/16 :goto_8

    .line 117
    .line 118
    :cond_8
    const/16 v7, 0x1d

    .line 119
    .line 120
    if-lt v6, v7, :cond_9

    .line 121
    .line 122
    invoke-static {v0}, Laa/w;->r(Landroid/media/MediaCodecInfo;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    move/from16 v19, v7

    .line 127
    .line 128
    const/16 v17, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_9
    invoke-static {v0, v14}, Lo4/p;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    const/16 v17, 0x1

    .line 136
    .line 137
    xor-int/lit8 v7, v7, 0x1

    .line 138
    .line 139
    move/from16 v19, v7

    .line 140
    .line 141
    :goto_3
    invoke-static {v0, v14}, Lo4/p;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v20

    .line 145
    const/16 v7, 0x1d

    .line 146
    .line 147
    if-lt v6, v7, :cond_a

    .line 148
    .line 149
    invoke-static {v0}, Laa/v;->t(Landroid/media/MediaCodecInfo;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    goto :goto_5

    .line 154
    :cond_a
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v6, "omx.google."

    .line 163
    .line 164
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_b

    .line 169
    .line 170
    const-string v6, "c2.android."

    .line 171
    .line 172
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-nez v6, :cond_b

    .line 177
    .line 178
    const-string v6, "c2.google."

    .line 179
    .line 180
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_b

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    move/from16 v17, v16

    .line 188
    .line 189
    :goto_4
    move/from16 v0, v17

    .line 190
    .line 191
    :goto_5
    if-eqz v13, :cond_c

    .line 192
    .line 193
    iget-boolean v6, v1, Lo4/p$a;->b:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 194
    .line 195
    if-eq v6, v8, :cond_d

    .line 196
    .line 197
    :cond_c
    if-nez v13, :cond_e

    .line 198
    .line 199
    :try_start_2
    iget-boolean v6, v1, Lo4/p$a;->b:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 200
    .line 201
    if-nez v6, :cond_e

    .line 202
    .line 203
    :cond_d
    const/16 v17, 0x0

    .line 204
    .line 205
    move-object v6, v11

    .line 206
    move-object v7, v14

    .line 207
    move-object v8, v10

    .line 208
    move-object/from16 v18, v10

    .line 209
    .line 210
    move/from16 v10, v19

    .line 211
    .line 212
    move-object/from16 v21, v11

    .line 213
    .line 214
    move/from16 v11, v20

    .line 215
    .line 216
    move/from16 v22, v12

    .line 217
    .line 218
    move v12, v0

    .line 219
    move/from16 v23, v13

    .line 220
    .line 221
    move/from16 v13, v17

    .line 222
    .line 223
    :try_start_3
    invoke-static/range {v6 .. v13}, Lo4/l;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lo4/l;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto/16 :goto_8

    .line 231
    .line 232
    :catch_0
    move-exception v0

    .line 233
    move-object/from16 v18, v10

    .line 234
    .line 235
    move-object/from16 v21, v11

    .line 236
    .line 237
    move/from16 v22, v12

    .line 238
    .line 239
    move/from16 v23, v13

    .line 240
    .line 241
    :goto_6
    move-object/from16 v1, v21

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_e
    move-object/from16 v18, v10

    .line 245
    .line 246
    move-object/from16 v21, v11

    .line 247
    .line 248
    move/from16 v22, v12

    .line 249
    .line 250
    move/from16 v23, v13

    .line 251
    .line 252
    if-nez v23, :cond_f

    .line 253
    .line 254
    if-eqz v8, :cond_f

    .line 255
    .line 256
    new-instance v6, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 259
    .line 260
    .line 261
    move-object/from16 v13, v21

    .line 262
    .line 263
    :try_start_4
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v7, ".secure"

    .line 267
    .line 268
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 275
    const/16 v17, 0x1

    .line 276
    .line 277
    move-object v7, v14

    .line 278
    move-object/from16 v8, v18

    .line 279
    .line 280
    move/from16 v10, v19

    .line 281
    .line 282
    move/from16 v11, v20

    .line 283
    .line 284
    move v12, v0

    .line 285
    move-object v1, v13

    .line 286
    move/from16 v13, v17

    .line 287
    .line 288
    :try_start_5
    invoke-static/range {v6 .. v13}, Lo4/l;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lo4/l;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 293
    .line 294
    .line 295
    return-object v5

    .line 296
    :catch_1
    move-exception v0

    .line 297
    goto :goto_7

    .line 298
    :catch_2
    move-exception v0

    .line 299
    move-object v1, v13

    .line 300
    goto :goto_7

    .line 301
    :catch_3
    move-exception v0

    .line 302
    goto :goto_6

    .line 303
    :catch_4
    move-exception v0

    .line 304
    move-object/from16 v18, v10

    .line 305
    .line 306
    move-object v1, v11

    .line 307
    move/from16 v22, v12

    .line 308
    .line 309
    move/from16 v23, v13

    .line 310
    .line 311
    :goto_7
    :try_start_6
    sget v6, Lv5/e0;->a:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 312
    .line 313
    const/16 v7, 0x17

    .line 314
    .line 315
    const-string v8, "MediaCodecUtil"

    .line 316
    .line 317
    if-gt v6, v7, :cond_10

    .line 318
    .line 319
    :try_start_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-nez v6, :cond_10

    .line 324
    .line 325
    new-instance v0, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const-string v6, "Skipping codec "

    .line 331
    .line 332
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v1, " (failed to query capabilities)"

    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v8, v0}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_f
    :goto_8
    add-int/lit8 v12, v22, 0x1

    .line 351
    .line 352
    move-object/from16 v1, p0

    .line 353
    .line 354
    move/from16 v13, v23

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 361
    .line 362
    .line 363
    const-string v3, "Failed to query codec "

    .line 364
    .line 365
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-string v1, " ("

    .line 372
    .line 373
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    move-object/from16 v1, v18

    .line 377
    .line 378
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v1, ")"

    .line 382
    .line 383
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-static {v8, v1}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 394
    :cond_11
    return-object v5

    .line 395
    :catch_5
    move-exception v0

    .line 396
    new-instance v1, Lo4/p$b;

    .line 397
    .line 398
    invoke-direct {v1, v0}, Lo4/p$b;-><init>(Ljava/lang/Exception;)V

    .line 399
    .line 400
    .line 401
    throw v1
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

.method public static g(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result p0

    const/4 v0, 0x0

    if-nez p0, :cond_10

    if-nez p2, :cond_0

    const-string p0, ".secure"

    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget p0, Lv5/e0;->a:I

    const/16 p2, 0x15

    if-ge p0, p2, :cond_2

    const-string p2, "CIPAACDecoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "CIPMP3Decoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "CIPVorbisDecoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "CIPAMRNBDecoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "AACDecoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "MP3Decoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    return v0

    :cond_2
    const/16 p2, 0x12

    if-ge p0, p2, :cond_4

    const-string p2, "OMX.MTK.AUDIO.DECODER.AAC"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lv5/e0;->b:Ljava/lang/String;

    const-string v1, "a70"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lv5/e0;->c:Ljava/lang/String;

    const-string v2, "Xiaomi"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "HM"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    return v0

    :cond_4
    const/16 p2, 0x10

    if-ne p0, p2, :cond_6

    const-string v1, "OMX.qcom.audio.decoder.mp3"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lv5/e0;->b:Ljava/lang/String;

    const-string v2, "dlxu"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "protou"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "ville"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "villeplus"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "villec2"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "gee"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "C6602"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "C6603"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "C6606"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "C6616"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "L36h"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "SO-02E"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    return v0

    :cond_6
    if-ne p0, p2, :cond_8

    const-string p2, "OMX.qcom.audio.decoder.aac"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Lv5/e0;->b:Ljava/lang/String;

    const-string v1, "C1504"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "C1505"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "C1604"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "C1605"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :cond_7
    return v0

    :cond_8
    const/16 p2, 0x18

    const-string v1, "samsung"

    if-ge p0, p2, :cond_b

    const-string p2, "OMX.SEC.aac.dec"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "OMX.Exynos.AAC.Decoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    :cond_9
    sget-object p2, Lv5/e0;->c:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    sget-object p2, Lv5/e0;->b:Ljava/lang/String;

    const-string v2, "zeroflte"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "zerolte"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "zenlte"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "SC-05G"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "marinelteatt"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "404SC"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "SC-04G"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "SCV31"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    :cond_a
    return v0

    :cond_b
    const-string p2, "jflte"

    const/16 v2, 0x13

    if-gt p0, v2, :cond_d

    const-string v3, "OMX.SEC.vp8.dec"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v3, Lv5/e0;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v1, Lv5/e0;->b:Ljava/lang/String;

    const-string v3, "d2"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "serrano"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "santos"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "t0"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    :cond_c
    return v0

    :cond_d
    if-gt p0, v2, :cond_e

    sget-object v1, Lv5/e0;->b:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_e

    const-string p2, "OMX.qcom.video.decoder.vp8"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_e

    return v0

    :cond_e
    const/16 p2, 0x17

    if-gt p0, p2, :cond_f

    const-string p0, "audio/eac3-joc"

    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    return v0

    :cond_f
    const/4 p0, 0x1

    return p0

    :cond_10
    :goto_0
    return v0
.end method

.method public static h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lv5/e0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Laa/v;->s(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Lv5/p;->k(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "arc."

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    const-string p1, "omx.google."

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_5

    .line 45
    .line 46
    const-string p1, "omx.ffmpeg."

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    const-string p1, "omx.sec."

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    const-string p1, ".sw."

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "c2.android."

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "c2.google."

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    const-string p1, "omx."

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_4

    .line 101
    .line 102
    const-string p1, "c2."

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move v0, v1

    .line 112
    :cond_5
    :goto_0
    return v0
    .line 113
    .line 114
    .line 115
.end method

.method public static i()I
    .locals 7

    .line 1
    sget v0, Lo4/p;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const-string v0, "video/avc"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v2}, Lo4/p;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lo4/l;

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_6

    .line 28
    .line 29
    iget-object v0, v0, Lo4/l;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    :cond_1
    new-array v0, v2, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 38
    .line 39
    :cond_2
    array-length v3, v0

    .line 40
    move v4, v2

    .line 41
    :goto_1
    if-ge v2, v3, :cond_4

    .line 42
    .line 43
    aget-object v5, v0, v2

    .line 44
    .line 45
    iget v5, v5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-eq v5, v6, :cond_3

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    if-eq v5, v6, :cond_3

    .line 52
    .line 53
    sparse-switch v5, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    move v5, v1

    .line 57
    goto :goto_2

    .line 58
    :sswitch_0
    const/high16 v5, 0x2200000

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :sswitch_1
    const/high16 v5, 0x900000

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :sswitch_2
    const v5, 0x564000

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_3
    const/high16 v5, 0x220000

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :sswitch_4
    const/high16 v5, 0x200000

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :sswitch_5
    const/high16 v5, 0x140000

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :sswitch_6
    const v5, 0xe1000

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :sswitch_7
    const v5, 0x65400

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :sswitch_8
    const v5, 0x31800

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :sswitch_9
    const v5, 0x18c00

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/16 v5, 0x6300

    .line 94
    .line 95
    :goto_2
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    sget v0, Lv5/e0;->a:I

    .line 103
    .line 104
    const/16 v1, 0x15

    .line 105
    .line 106
    if-lt v0, v1, :cond_5

    .line 107
    .line 108
    const v0, 0x54600

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    const v0, 0x2a300

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    :cond_6
    sput v2, Lo4/p;->c:I

    .line 120
    .line 121
    :cond_7
    sget v0, Lo4/p;->c:I

    .line 122
    .line 123
    return v0

    .line 124
    nop

    .line 125
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_9
        0x10 -> :sswitch_9
        0x20 -> :sswitch_9
        0x40 -> :sswitch_8
        0x80 -> :sswitch_7
        0x100 -> :sswitch_7
        0x200 -> :sswitch_6
        0x400 -> :sswitch_5
        0x800 -> :sswitch_4
        0x1000 -> :sswitch_4
        0x2000 -> :sswitch_3
        0x4000 -> :sswitch_2
        0x8000 -> :sswitch_1
        0x10000 -> :sswitch_1
        0x20000 -> :sswitch_0
        0x40000 -> :sswitch_0
        0x80000 -> :sswitch_0
    .end sparse-switch
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
.end method
