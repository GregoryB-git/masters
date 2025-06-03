.class public final Li4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Li4/d;


# direct methods
.method public constructor <init>(Li4/d;)V
    .locals 0

    iput-object p1, p0, Li4/d$a;->a:Li4/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v8, v0, Li4/d$a;->a:Li4/d;

    .line 6
    .line 7
    iget-object v2, v8, Li4/d;->b0:Lc4/j;

    .line 8
    .line 9
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xa0

    .line 13
    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    const-string v5, "A_OPUS"

    .line 17
    .line 18
    if-eq v1, v2, :cond_7e

    .line 19
    .line 20
    const/16 v2, 0xae

    .line 21
    .line 22
    const/4 v6, -0x1

    .line 23
    if-eq v1, v2, :cond_11

    .line 24
    .line 25
    const/16 v2, 0x4dbb

    .line 26
    .line 27
    const v5, 0x1c53bb6b

    .line 28
    .line 29
    .line 30
    if-eq v1, v2, :cond_f

    .line 31
    .line 32
    const/16 v2, 0x6240

    .line 33
    .line 34
    if-eq v1, v2, :cond_d

    .line 35
    .line 36
    const/16 v2, 0x6d80

    .line 37
    .line 38
    if-eq v1, v2, :cond_b

    .line 39
    .line 40
    const v2, 0x1549a966

    .line 41
    .line 42
    .line 43
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    if-eq v1, v2, :cond_9

    .line 49
    .line 50
    const v2, 0x1654ae6b

    .line 51
    .line 52
    .line 53
    if-eq v1, v2, :cond_7

    .line 54
    .line 55
    if-eq v1, v5, :cond_0

    .line 56
    .line 57
    goto/16 :goto_37

    .line 58
    .line 59
    :cond_0
    iget-boolean v1, v8, Li4/d;->v:Z

    .line 60
    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    iget-object v1, v8, Li4/d;->b0:Lc4/j;

    .line 64
    .line 65
    iget-object v2, v8, Li4/d;->C:Lv5/n;

    .line 66
    .line 67
    iget-object v5, v8, Li4/d;->D:Lv5/n;

    .line 68
    .line 69
    iget-wide v9, v8, Li4/d;->q:J

    .line 70
    .line 71
    const-wide/16 v11, -0x1

    .line 72
    .line 73
    cmp-long v9, v9, v11

    .line 74
    .line 75
    if-eqz v9, :cond_5

    .line 76
    .line 77
    iget-wide v9, v8, Li4/d;->t:J

    .line 78
    .line 79
    cmp-long v6, v9, v6

    .line 80
    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    if-eqz v2, :cond_5

    .line 84
    .line 85
    iget v6, v2, Lv5/n;->a:I

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    iget v7, v5, Lv5/n;->a:I

    .line 92
    .line 93
    if-eq v7, v6, :cond_1

    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_1
    new-array v7, v6, [I

    .line 98
    .line 99
    new-array v9, v6, [J

    .line 100
    .line 101
    new-array v10, v6, [J

    .line 102
    .line 103
    new-array v11, v6, [J

    .line 104
    .line 105
    const/4 v12, 0x0

    .line 106
    :goto_0
    if-ge v12, v6, :cond_2

    .line 107
    .line 108
    invoke-virtual {v2, v12}, Lv5/n;->b(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v13

    .line 112
    aput-wide v13, v11, v12

    .line 113
    .line 114
    iget-wide v13, v8, Li4/d;->q:J

    .line 115
    .line 116
    invoke-virtual {v5, v12}, Lv5/n;->b(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v15

    .line 120
    add-long/2addr v15, v13

    .line 121
    aput-wide v15, v9, v12

    .line 122
    .line 123
    add-int/lit8 v12, v12, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const/4 v2, 0x0

    .line 127
    :goto_1
    add-int/lit8 v5, v6, -0x1

    .line 128
    .line 129
    if-ge v2, v5, :cond_3

    .line 130
    .line 131
    add-int/lit8 v5, v2, 0x1

    .line 132
    .line 133
    aget-wide v12, v9, v5

    .line 134
    .line 135
    aget-wide v14, v9, v2

    .line 136
    .line 137
    sub-long/2addr v12, v14

    .line 138
    long-to-int v12, v12

    .line 139
    aput v12, v7, v2

    .line 140
    .line 141
    aget-wide v12, v11, v5

    .line 142
    .line 143
    aget-wide v14, v11, v2

    .line 144
    .line 145
    sub-long/2addr v12, v14

    .line 146
    aput-wide v12, v10, v2

    .line 147
    .line 148
    move v2, v5

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-wide v12, v8, Li4/d;->q:J

    .line 151
    .line 152
    iget-wide v14, v8, Li4/d;->p:J

    .line 153
    .line 154
    add-long/2addr v12, v14

    .line 155
    aget-wide v14, v9, v5

    .line 156
    .line 157
    sub-long/2addr v12, v14

    .line 158
    long-to-int v2, v12

    .line 159
    aput v2, v7, v5

    .line 160
    .line 161
    iget-wide v12, v8, Li4/d;->t:J

    .line 162
    .line 163
    aget-wide v14, v11, v5

    .line 164
    .line 165
    sub-long/2addr v12, v14

    .line 166
    aput-wide v12, v10, v5

    .line 167
    .line 168
    cmp-long v2, v12, v3

    .line 169
    .line 170
    if-gtz v2, :cond_4

    .line 171
    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v3, "Discarding last cue point with unexpected duration: "

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const-string v3, "MatroskaExtractor"

    .line 190
    .line 191
    invoke-static {v3, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    :cond_4
    new-instance v2, Lc4/c;

    .line 211
    .line 212
    invoke-direct {v2, v7, v9, v10, v11}, Lc4/c;-><init>([I[J[J[J)V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_5
    :goto_2
    new-instance v2, Lc4/t$b;

    .line 217
    .line 218
    iget-wide v3, v8, Li4/d;->t:J

    .line 219
    .line 220
    invoke-direct {v2, v3, v4}, Lc4/t$b;-><init>(J)V

    .line 221
    .line 222
    .line 223
    :goto_3
    invoke-interface {v1, v2}, Lc4/j;->t(Lc4/t;)V

    .line 224
    .line 225
    .line 226
    const/4 v1, 0x1

    .line 227
    iput-boolean v1, v8, Li4/d;->v:Z

    .line 228
    .line 229
    :cond_6
    const/4 v1, 0x0

    .line 230
    iput-object v1, v8, Li4/d;->C:Lv5/n;

    .line 231
    .line 232
    iput-object v1, v8, Li4/d;->D:Lv5/n;

    .line 233
    .line 234
    goto/16 :goto_37

    .line 235
    .line 236
    :cond_7
    const/4 v1, 0x0

    .line 237
    iget-object v2, v8, Li4/d;->c:Landroid/util/SparseArray;

    .line 238
    .line 239
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_8

    .line 244
    .line 245
    iget-object v1, v8, Li4/d;->b0:Lc4/j;

    .line 246
    .line 247
    invoke-interface {v1}, Lc4/j;->m()V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_37

    .line 251
    .line 252
    :cond_8
    const-string v2, "No valid tracks were found"

    .line 253
    .line 254
    invoke-static {v2, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    throw v1

    .line 259
    :cond_9
    iget-wide v1, v8, Li4/d;->r:J

    .line 260
    .line 261
    cmp-long v1, v1, v6

    .line 262
    .line 263
    if-nez v1, :cond_a

    .line 264
    .line 265
    const-wide/32 v1, 0xf4240

    .line 266
    .line 267
    .line 268
    iput-wide v1, v8, Li4/d;->r:J

    .line 269
    .line 270
    :cond_a
    iget-wide v1, v8, Li4/d;->s:J

    .line 271
    .line 272
    cmp-long v3, v1, v6

    .line 273
    .line 274
    if-eqz v3, :cond_84

    .line 275
    .line 276
    invoke-virtual {v8, v1, v2}, Li4/d;->k(J)J

    .line 277
    .line 278
    .line 279
    move-result-wide v1

    .line 280
    iput-wide v1, v8, Li4/d;->t:J

    .line 281
    .line 282
    goto/16 :goto_37

    .line 283
    .line 284
    :cond_b
    invoke-virtual {v8, v1}, Li4/d;->c(I)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v8, Li4/d;->u:Li4/d$b;

    .line 288
    .line 289
    iget-boolean v2, v1, Li4/d$b;->h:Z

    .line 290
    .line 291
    if-eqz v2, :cond_84

    .line 292
    .line 293
    iget-object v1, v1, Li4/d$b;->i:[B

    .line 294
    .line 295
    if-nez v1, :cond_c

    .line 296
    .line 297
    goto/16 :goto_37

    .line 298
    .line 299
    :cond_c
    const-string v1, "Combining encryption and compression is not supported"

    .line 300
    .line 301
    const/4 v2, 0x0

    .line 302
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    throw v1

    .line 307
    :cond_d
    invoke-virtual {v8, v1}, Li4/d;->c(I)V

    .line 308
    .line 309
    .line 310
    iget-object v1, v8, Li4/d;->u:Li4/d$b;

    .line 311
    .line 312
    iget-boolean v2, v1, Li4/d$b;->h:Z

    .line 313
    .line 314
    if-eqz v2, :cond_84

    .line 315
    .line 316
    iget-object v2, v1, Li4/d$b;->j:Lc4/v$a;

    .line 317
    .line 318
    if-eqz v2, :cond_e

    .line 319
    .line 320
    new-instance v3, La4/d;

    .line 321
    .line 322
    const/4 v4, 0x1

    .line 323
    new-array v4, v4, [La4/d$b;

    .line 324
    .line 325
    new-instance v5, La4/d$b;

    .line 326
    .line 327
    sget-object v6, Lv3/h;->a:Ljava/util/UUID;

    .line 328
    .line 329
    iget-object v2, v2, Lc4/v$a;->b:[B

    .line 330
    .line 331
    const-string v7, "video/webm"

    .line 332
    .line 333
    const/4 v8, 0x0

    .line 334
    invoke-direct {v5, v6, v8, v7, v2}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 335
    .line 336
    .line 337
    const/4 v2, 0x0

    .line 338
    aput-object v5, v4, v2

    .line 339
    .line 340
    invoke-direct {v3, v4}, La4/d;-><init>([La4/d$b;)V

    .line 341
    .line 342
    .line 343
    iput-object v3, v1, Li4/d$b;->l:La4/d;

    .line 344
    .line 345
    goto/16 :goto_37

    .line 346
    .line 347
    :cond_e
    const/4 v1, 0x0

    .line 348
    const-string v2, "Encrypted Track found but ContentEncKeyID was not found"

    .line 349
    .line 350
    invoke-static {v2, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    throw v1

    .line 355
    :cond_f
    iget v1, v8, Li4/d;->w:I

    .line 356
    .line 357
    if-eq v1, v6, :cond_10

    .line 358
    .line 359
    iget-wide v2, v8, Li4/d;->x:J

    .line 360
    .line 361
    const-wide/16 v6, -0x1

    .line 362
    .line 363
    cmp-long v4, v2, v6

    .line 364
    .line 365
    if-eqz v4, :cond_10

    .line 366
    .line 367
    if-ne v1, v5, :cond_84

    .line 368
    .line 369
    iput-wide v2, v8, Li4/d;->z:J

    .line 370
    .line 371
    goto/16 :goto_37

    .line 372
    .line 373
    :cond_10
    const-string v1, "Mandatory element SeekID or SeekPosition not found"

    .line 374
    .line 375
    const/4 v2, 0x0

    .line 376
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    throw v1

    .line 381
    :cond_11
    iget-object v1, v8, Li4/d;->u:Li4/d$b;

    .line 382
    .line 383
    invoke-static {v1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iget-object v2, v1, Li4/d$b;->b:Ljava/lang/String;

    .line 387
    .line 388
    if-eqz v2, :cond_7d

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    const-string v4, "A_MPEG/L2"

    .line 395
    .line 396
    const-string v6, "A_VORBIS"

    .line 397
    .line 398
    const-string v7, "A_TRUEHD"

    .line 399
    .line 400
    const-string v9, "A_MS/ACM"

    .line 401
    .line 402
    const-string v10, "V_MPEG4/ISO/SP"

    .line 403
    .line 404
    const-string v11, "V_MPEG4/ISO/AP"

    .line 405
    .line 406
    const-string v12, "A_AC3"

    .line 407
    .line 408
    const-string v13, "A_AAC"

    .line 409
    .line 410
    const-string v14, "A_DTS/LOSSLESS"

    .line 411
    .line 412
    const-string v15, "S_VOBSUB"

    .line 413
    .line 414
    const-string v0, "V_MPEG4/ISO/AVC"

    .line 415
    .line 416
    move-object/from16 v16, v1

    .line 417
    .line 418
    const-string v1, "V_MPEG4/ISO/ASP"

    .line 419
    .line 420
    move-object/from16 v17, v8

    .line 421
    .line 422
    const-string v8, "S_DVBSUB"

    .line 423
    .line 424
    move-object/from16 p1, v11

    .line 425
    .line 426
    const-string v11, "V_MS/VFW/FOURCC"

    .line 427
    .line 428
    move-object/from16 v18, v10

    .line 429
    .line 430
    const-string v10, "A_MPEG/L3"

    .line 431
    .line 432
    move-object/from16 v19, v9

    .line 433
    .line 434
    const-string v9, "A_DTS/EXPRESS"

    .line 435
    .line 436
    move-object/from16 v20, v7

    .line 437
    .line 438
    const-string v7, "V_THEORA"

    .line 439
    .line 440
    move-object/from16 v21, v6

    .line 441
    .line 442
    const-string v6, "S_HDMV/PGS"

    .line 443
    .line 444
    move-object/from16 v22, v4

    .line 445
    .line 446
    const-string v4, "V_VP9"

    .line 447
    .line 448
    move-object/from16 v23, v10

    .line 449
    .line 450
    const-string v10, "V_VP8"

    .line 451
    .line 452
    move-object/from16 v24, v11

    .line 453
    .line 454
    const-string v11, "V_AV1"

    .line 455
    .line 456
    move-object/from16 v25, v8

    .line 457
    .line 458
    const-string v8, "A_DTS"

    .line 459
    .line 460
    const/16 v26, 0x14

    .line 461
    .line 462
    sparse-switch v3, :sswitch_data_0

    .line 463
    .line 464
    .line 465
    :goto_4
    goto/16 :goto_a

    .line 466
    .line 467
    :sswitch_0
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-nez v2, :cond_12

    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_12
    const/16 v2, 0x20

    .line 475
    .line 476
    :goto_5
    move-object/from16 v3, v23

    .line 477
    .line 478
    goto/16 :goto_9

    .line 479
    .line 480
    :sswitch_1
    const-string v3, "A_FLAC"

    .line 481
    .line 482
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-nez v2, :cond_13

    .line 487
    .line 488
    goto :goto_4

    .line 489
    :cond_13
    const/16 v2, 0x1f

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :sswitch_2
    const-string v3, "A_EAC3"

    .line 493
    .line 494
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-nez v2, :cond_14

    .line 499
    .line 500
    goto :goto_4

    .line 501
    :cond_14
    const/16 v2, 0x1e

    .line 502
    .line 503
    goto :goto_5

    .line 504
    :sswitch_3
    const-string v3, "V_MPEG2"

    .line 505
    .line 506
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-nez v2, :cond_15

    .line 511
    .line 512
    goto :goto_4

    .line 513
    :cond_15
    const/16 v2, 0x1d

    .line 514
    .line 515
    goto :goto_5

    .line 516
    :sswitch_4
    const-string v3, "S_TEXT/UTF8"

    .line 517
    .line 518
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-nez v2, :cond_16

    .line 523
    .line 524
    goto :goto_4

    .line 525
    :cond_16
    const/16 v2, 0x1c

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :sswitch_5
    const-string v3, "S_TEXT/WEBVTT"

    .line 529
    .line 530
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    if-nez v2, :cond_17

    .line 535
    .line 536
    goto :goto_4

    .line 537
    :cond_17
    const/16 v2, 0x1b

    .line 538
    .line 539
    goto :goto_5

    .line 540
    :sswitch_6
    const-string v3, "V_MPEGH/ISO/HEVC"

    .line 541
    .line 542
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    if-nez v2, :cond_18

    .line 547
    .line 548
    goto :goto_4

    .line 549
    :cond_18
    const/16 v2, 0x1a

    .line 550
    .line 551
    goto :goto_5

    .line 552
    :sswitch_7
    const-string v3, "S_TEXT/ASS"

    .line 553
    .line 554
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    if-nez v2, :cond_19

    .line 559
    .line 560
    goto :goto_4

    .line 561
    :cond_19
    const/16 v2, 0x19

    .line 562
    .line 563
    goto/16 :goto_b

    .line 564
    .line 565
    :sswitch_8
    const-string v3, "A_PCM/INT/LIT"

    .line 566
    .line 567
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-nez v2, :cond_1a

    .line 572
    .line 573
    goto :goto_4

    .line 574
    :cond_1a
    const/16 v2, 0x18

    .line 575
    .line 576
    goto/16 :goto_b

    .line 577
    .line 578
    :sswitch_9
    const-string v3, "A_PCM/INT/BIG"

    .line 579
    .line 580
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-nez v2, :cond_1b

    .line 585
    .line 586
    goto :goto_4

    .line 587
    :cond_1b
    const/16 v2, 0x17

    .line 588
    .line 589
    goto :goto_5

    .line 590
    :sswitch_a
    const-string v3, "A_PCM/FLOAT/IEEE"

    .line 591
    .line 592
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    if-nez v2, :cond_1c

    .line 597
    .line 598
    goto/16 :goto_4

    .line 599
    .line 600
    :cond_1c
    const/16 v2, 0x16

    .line 601
    .line 602
    goto :goto_5

    .line 603
    :sswitch_b
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-nez v2, :cond_1d

    .line 608
    .line 609
    goto/16 :goto_4

    .line 610
    .line 611
    :cond_1d
    const/16 v2, 0x15

    .line 612
    .line 613
    goto/16 :goto_5

    .line 614
    .line 615
    :sswitch_c
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    if-nez v2, :cond_1e

    .line 620
    .line 621
    goto/16 :goto_4

    .line 622
    .line 623
    :cond_1e
    move-object/from16 v3, p1

    .line 624
    .line 625
    move/from16 v2, v26

    .line 626
    .line 627
    goto/16 :goto_d

    .line 628
    .line 629
    :sswitch_d
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-nez v2, :cond_1f

    .line 634
    .line 635
    goto/16 :goto_4

    .line 636
    .line 637
    :cond_1f
    const/16 v2, 0x13

    .line 638
    .line 639
    goto/16 :goto_5

    .line 640
    .line 641
    :sswitch_e
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-nez v2, :cond_20

    .line 646
    .line 647
    goto/16 :goto_4

    .line 648
    .line 649
    :cond_20
    const/16 v2, 0x12

    .line 650
    .line 651
    goto/16 :goto_5

    .line 652
    .line 653
    :sswitch_f
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    if-nez v2, :cond_21

    .line 658
    .line 659
    goto/16 :goto_4

    .line 660
    .line 661
    :cond_21
    const/16 v2, 0x11

    .line 662
    .line 663
    goto/16 :goto_5

    .line 664
    .line 665
    :sswitch_10
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    if-nez v2, :cond_22

    .line 670
    .line 671
    goto/16 :goto_4

    .line 672
    .line 673
    :cond_22
    const/16 v2, 0x10

    .line 674
    .line 675
    goto/16 :goto_5

    .line 676
    .line 677
    :sswitch_11
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-nez v2, :cond_23

    .line 682
    .line 683
    goto/16 :goto_4

    .line 684
    .line 685
    :cond_23
    const/16 v2, 0xf

    .line 686
    .line 687
    goto/16 :goto_b

    .line 688
    .line 689
    :sswitch_12
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    if-nez v2, :cond_24

    .line 694
    .line 695
    goto/16 :goto_4

    .line 696
    .line 697
    :cond_24
    const/16 v2, 0xe

    .line 698
    .line 699
    goto/16 :goto_5

    .line 700
    .line 701
    :sswitch_13
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    if-nez v2, :cond_25

    .line 706
    .line 707
    goto/16 :goto_4

    .line 708
    .line 709
    :cond_25
    const/16 v2, 0xd

    .line 710
    .line 711
    goto/16 :goto_5

    .line 712
    .line 713
    :sswitch_14
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-nez v2, :cond_26

    .line 718
    .line 719
    goto/16 :goto_4

    .line 720
    .line 721
    :cond_26
    const/16 v2, 0xc

    .line 722
    .line 723
    goto/16 :goto_5

    .line 724
    .line 725
    :sswitch_15
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    if-nez v2, :cond_27

    .line 730
    .line 731
    goto/16 :goto_4

    .line 732
    .line 733
    :cond_27
    const/16 v2, 0xb

    .line 734
    .line 735
    goto/16 :goto_5

    .line 736
    .line 737
    :sswitch_16
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-nez v2, :cond_28

    .line 742
    .line 743
    goto/16 :goto_4

    .line 744
    .line 745
    :cond_28
    const/16 v2, 0xa

    .line 746
    .line 747
    goto/16 :goto_5

    .line 748
    .line 749
    :sswitch_17
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    if-nez v2, :cond_29

    .line 754
    .line 755
    goto :goto_6

    .line 756
    :cond_29
    const/16 v2, 0x9

    .line 757
    .line 758
    move-object/from16 v3, v24

    .line 759
    .line 760
    goto :goto_7

    .line 761
    :sswitch_18
    move-object/from16 v3, v25

    .line 762
    .line 763
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    if-nez v2, :cond_2a

    .line 768
    .line 769
    move-object/from16 v25, v3

    .line 770
    .line 771
    goto/16 :goto_a

    .line 772
    .line 773
    :cond_2a
    const/16 v2, 0x8

    .line 774
    .line 775
    move-object/from16 v25, v3

    .line 776
    .line 777
    goto/16 :goto_b

    .line 778
    .line 779
    :sswitch_19
    move-object/from16 v3, v24

    .line 780
    .line 781
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    if-nez v2, :cond_2b

    .line 786
    .line 787
    move-object/from16 v24, v3

    .line 788
    .line 789
    :goto_6
    move-object/from16 v3, v23

    .line 790
    .line 791
    goto :goto_8

    .line 792
    :cond_2b
    const/4 v2, 0x7

    .line 793
    :goto_7
    move-object/from16 v24, v3

    .line 794
    .line 795
    goto/16 :goto_5

    .line 796
    .line 797
    :sswitch_1a
    move-object/from16 v3, v23

    .line 798
    .line 799
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    if-nez v2, :cond_2c

    .line 804
    .line 805
    :goto_8
    move-object/from16 v23, v3

    .line 806
    .line 807
    goto :goto_a

    .line 808
    :cond_2c
    const/4 v2, 0x6

    .line 809
    :goto_9
    move-object/from16 v23, v3

    .line 810
    .line 811
    goto :goto_b

    .line 812
    :sswitch_1b
    move-object/from16 v3, v22

    .line 813
    .line 814
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    if-nez v2, :cond_2d

    .line 819
    .line 820
    move-object/from16 v22, v3

    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_2d
    const/4 v2, 0x5

    .line 824
    move-object/from16 v22, v3

    .line 825
    .line 826
    goto :goto_b

    .line 827
    :sswitch_1c
    move-object/from16 v3, v21

    .line 828
    .line 829
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    if-nez v2, :cond_2e

    .line 834
    .line 835
    move-object/from16 v21, v3

    .line 836
    .line 837
    goto :goto_a

    .line 838
    :cond_2e
    const/4 v2, 0x4

    .line 839
    move-object/from16 v21, v3

    .line 840
    .line 841
    goto :goto_b

    .line 842
    :sswitch_1d
    move-object/from16 v3, v20

    .line 843
    .line 844
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    if-nez v2, :cond_2f

    .line 849
    .line 850
    move-object/from16 v20, v3

    .line 851
    .line 852
    goto :goto_a

    .line 853
    :cond_2f
    const/4 v2, 0x3

    .line 854
    move-object/from16 v20, v3

    .line 855
    .line 856
    goto :goto_b

    .line 857
    :sswitch_1e
    move-object/from16 v3, v19

    .line 858
    .line 859
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-nez v2, :cond_30

    .line 864
    .line 865
    move-object/from16 v19, v3

    .line 866
    .line 867
    goto :goto_a

    .line 868
    :cond_30
    const/4 v2, 0x2

    .line 869
    move-object/from16 v19, v3

    .line 870
    .line 871
    goto :goto_b

    .line 872
    :sswitch_1f
    move-object/from16 v3, v18

    .line 873
    .line 874
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    if-nez v2, :cond_31

    .line 879
    .line 880
    move-object/from16 v18, v3

    .line 881
    .line 882
    :goto_a
    move-object/from16 v3, p1

    .line 883
    .line 884
    goto :goto_c

    .line 885
    :cond_31
    const/4 v2, 0x1

    .line 886
    move-object/from16 v18, v3

    .line 887
    .line 888
    :goto_b
    move-object/from16 v3, p1

    .line 889
    .line 890
    goto :goto_d

    .line 891
    :sswitch_20
    move-object/from16 v3, p1

    .line 892
    .line 893
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    if-nez v2, :cond_32

    .line 898
    .line 899
    goto :goto_c

    .line 900
    :cond_32
    const/4 v2, 0x0

    .line 901
    goto :goto_d

    .line 902
    :goto_c
    const/4 v2, -0x1

    .line 903
    :goto_d
    packed-switch v2, :pswitch_data_0

    .line 904
    .line 905
    .line 906
    const/4 v2, 0x0

    .line 907
    goto :goto_e

    .line 908
    :pswitch_0
    const/4 v2, 0x1

    .line 909
    :goto_e
    if-eqz v2, :cond_7c

    .line 910
    .line 911
    move-object/from16 p1, v3

    .line 912
    .line 913
    move-object/from16 v2, v17

    .line 914
    .line 915
    iget-object v3, v2, Li4/d;->b0:Lc4/j;

    .line 916
    .line 917
    move-object/from16 v2, v16

    .line 918
    .line 919
    move-object/from16 v16, v3

    .line 920
    .line 921
    iget v3, v2, Li4/d$b;->c:I

    .line 922
    .line 923
    move/from16 v27, v3

    .line 924
    .line 925
    iget-object v3, v2, Li4/d$b;->b:Ljava/lang/String;

    .line 926
    .line 927
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 931
    .line 932
    .line 933
    move-result v28

    .line 934
    move-object/from16 v29, v2

    .line 935
    .line 936
    const/16 v2, 0x10

    .line 937
    .line 938
    sparse-switch v28, :sswitch_data_1

    .line 939
    .line 940
    .line 941
    goto/16 :goto_f

    .line 942
    .line 943
    :sswitch_21
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    if-nez v0, :cond_33

    .line 948
    .line 949
    goto/16 :goto_f

    .line 950
    .line 951
    :cond_33
    const/16 v26, 0x20

    .line 952
    .line 953
    goto/16 :goto_10

    .line 954
    .line 955
    :sswitch_22
    const-string v0, "A_FLAC"

    .line 956
    .line 957
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-nez v0, :cond_34

    .line 962
    .line 963
    goto/16 :goto_f

    .line 964
    .line 965
    :cond_34
    const/16 v26, 0x1f

    .line 966
    .line 967
    goto/16 :goto_10

    .line 968
    .line 969
    :sswitch_23
    const-string v0, "A_EAC3"

    .line 970
    .line 971
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    if-nez v0, :cond_35

    .line 976
    .line 977
    goto/16 :goto_f

    .line 978
    .line 979
    :cond_35
    const/16 v26, 0x1e

    .line 980
    .line 981
    goto/16 :goto_10

    .line 982
    .line 983
    :sswitch_24
    const-string v0, "V_MPEG2"

    .line 984
    .line 985
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-nez v0, :cond_36

    .line 990
    .line 991
    goto/16 :goto_f

    .line 992
    .line 993
    :cond_36
    const/16 v26, 0x1d

    .line 994
    .line 995
    goto/16 :goto_10

    .line 996
    .line 997
    :sswitch_25
    const-string v0, "S_TEXT/UTF8"

    .line 998
    .line 999
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    if-nez v0, :cond_37

    .line 1004
    .line 1005
    goto/16 :goto_f

    .line 1006
    .line 1007
    :cond_37
    const/16 v26, 0x1c

    .line 1008
    .line 1009
    goto/16 :goto_10

    .line 1010
    .line 1011
    :sswitch_26
    const-string v0, "S_TEXT/WEBVTT"

    .line 1012
    .line 1013
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    if-nez v0, :cond_38

    .line 1018
    .line 1019
    goto/16 :goto_f

    .line 1020
    .line 1021
    :cond_38
    const/16 v26, 0x1b

    .line 1022
    .line 1023
    goto/16 :goto_10

    .line 1024
    .line 1025
    :sswitch_27
    const-string v0, "V_MPEGH/ISO/HEVC"

    .line 1026
    .line 1027
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v0

    .line 1031
    if-nez v0, :cond_39

    .line 1032
    .line 1033
    goto/16 :goto_f

    .line 1034
    .line 1035
    :cond_39
    const/16 v26, 0x1a

    .line 1036
    .line 1037
    goto/16 :goto_10

    .line 1038
    .line 1039
    :sswitch_28
    const-string v0, "S_TEXT/ASS"

    .line 1040
    .line 1041
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    if-nez v0, :cond_3a

    .line 1046
    .line 1047
    goto/16 :goto_f

    .line 1048
    .line 1049
    :cond_3a
    const/16 v26, 0x19

    .line 1050
    .line 1051
    goto/16 :goto_10

    .line 1052
    .line 1053
    :sswitch_29
    const-string v0, "A_PCM/INT/LIT"

    .line 1054
    .line 1055
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v0

    .line 1059
    if-nez v0, :cond_3b

    .line 1060
    .line 1061
    goto/16 :goto_f

    .line 1062
    .line 1063
    :cond_3b
    const/16 v26, 0x18

    .line 1064
    .line 1065
    goto/16 :goto_10

    .line 1066
    .line 1067
    :sswitch_2a
    const-string v0, "A_PCM/INT/BIG"

    .line 1068
    .line 1069
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v0

    .line 1073
    if-nez v0, :cond_3c

    .line 1074
    .line 1075
    goto/16 :goto_f

    .line 1076
    .line 1077
    :cond_3c
    const/16 v26, 0x17

    .line 1078
    .line 1079
    goto/16 :goto_10

    .line 1080
    .line 1081
    :sswitch_2b
    const-string v0, "A_PCM/FLOAT/IEEE"

    .line 1082
    .line 1083
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-nez v0, :cond_3d

    .line 1088
    .line 1089
    goto/16 :goto_f

    .line 1090
    .line 1091
    :cond_3d
    const/16 v26, 0x16

    .line 1092
    .line 1093
    goto/16 :goto_10

    .line 1094
    .line 1095
    :sswitch_2c
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v0

    .line 1099
    if-nez v0, :cond_3e

    .line 1100
    .line 1101
    goto/16 :goto_f

    .line 1102
    .line 1103
    :cond_3e
    const/16 v26, 0x15

    .line 1104
    .line 1105
    goto/16 :goto_10

    .line 1106
    .line 1107
    :sswitch_2d
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-nez v0, :cond_53

    .line 1112
    .line 1113
    goto/16 :goto_f

    .line 1114
    .line 1115
    :sswitch_2e
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    if-nez v0, :cond_3f

    .line 1120
    .line 1121
    goto/16 :goto_f

    .line 1122
    .line 1123
    :cond_3f
    const/16 v26, 0x13

    .line 1124
    .line 1125
    goto/16 :goto_10

    .line 1126
    .line 1127
    :sswitch_2f
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-nez v0, :cond_40

    .line 1132
    .line 1133
    goto/16 :goto_f

    .line 1134
    .line 1135
    :cond_40
    const/16 v26, 0x12

    .line 1136
    .line 1137
    goto/16 :goto_10

    .line 1138
    .line 1139
    :sswitch_30
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v0

    .line 1143
    if-nez v0, :cond_41

    .line 1144
    .line 1145
    goto/16 :goto_f

    .line 1146
    .line 1147
    :cond_41
    const/16 v26, 0x11

    .line 1148
    .line 1149
    goto/16 :goto_10

    .line 1150
    .line 1151
    :sswitch_31
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v0

    .line 1155
    if-nez v0, :cond_42

    .line 1156
    .line 1157
    goto/16 :goto_f

    .line 1158
    .line 1159
    :cond_42
    move/from16 v26, v2

    .line 1160
    .line 1161
    goto/16 :goto_10

    .line 1162
    .line 1163
    :sswitch_32
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v0

    .line 1167
    if-nez v0, :cond_43

    .line 1168
    .line 1169
    goto/16 :goto_f

    .line 1170
    .line 1171
    :cond_43
    const/16 v26, 0xf

    .line 1172
    .line 1173
    goto/16 :goto_10

    .line 1174
    .line 1175
    :sswitch_33
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v0

    .line 1179
    if-nez v0, :cond_44

    .line 1180
    .line 1181
    goto/16 :goto_f

    .line 1182
    .line 1183
    :cond_44
    const/16 v26, 0xe

    .line 1184
    .line 1185
    goto/16 :goto_10

    .line 1186
    .line 1187
    :sswitch_34
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    if-nez v0, :cond_45

    .line 1192
    .line 1193
    goto/16 :goto_f

    .line 1194
    .line 1195
    :cond_45
    const/16 v26, 0xd

    .line 1196
    .line 1197
    goto/16 :goto_10

    .line 1198
    .line 1199
    :sswitch_35
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v0

    .line 1203
    if-nez v0, :cond_46

    .line 1204
    .line 1205
    goto/16 :goto_f

    .line 1206
    .line 1207
    :cond_46
    const/16 v26, 0xc

    .line 1208
    .line 1209
    goto/16 :goto_10

    .line 1210
    .line 1211
    :sswitch_36
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    if-nez v0, :cond_47

    .line 1216
    .line 1217
    goto/16 :goto_f

    .line 1218
    .line 1219
    :cond_47
    const/16 v26, 0xb

    .line 1220
    .line 1221
    goto/16 :goto_10

    .line 1222
    .line 1223
    :sswitch_37
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-nez v0, :cond_48

    .line 1228
    .line 1229
    goto/16 :goto_f

    .line 1230
    .line 1231
    :cond_48
    const/16 v26, 0xa

    .line 1232
    .line 1233
    goto/16 :goto_10

    .line 1234
    .line 1235
    :sswitch_38
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v0

    .line 1239
    if-nez v0, :cond_49

    .line 1240
    .line 1241
    goto/16 :goto_f

    .line 1242
    .line 1243
    :cond_49
    const/16 v26, 0x9

    .line 1244
    .line 1245
    goto/16 :goto_10

    .line 1246
    .line 1247
    :sswitch_39
    move-object/from16 v0, v25

    .line 1248
    .line 1249
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    if-nez v0, :cond_4a

    .line 1254
    .line 1255
    goto/16 :goto_f

    .line 1256
    .line 1257
    :cond_4a
    const/16 v26, 0x8

    .line 1258
    .line 1259
    goto/16 :goto_10

    .line 1260
    .line 1261
    :sswitch_3a
    move-object/from16 v0, v24

    .line 1262
    .line 1263
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v0

    .line 1267
    if-nez v0, :cond_4b

    .line 1268
    .line 1269
    goto/16 :goto_f

    .line 1270
    .line 1271
    :cond_4b
    const/16 v26, 0x7

    .line 1272
    .line 1273
    goto/16 :goto_10

    .line 1274
    .line 1275
    :sswitch_3b
    move-object/from16 v0, v23

    .line 1276
    .line 1277
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-nez v0, :cond_4c

    .line 1282
    .line 1283
    goto :goto_f

    .line 1284
    :cond_4c
    const/16 v26, 0x6

    .line 1285
    .line 1286
    goto :goto_10

    .line 1287
    :sswitch_3c
    move-object/from16 v0, v22

    .line 1288
    .line 1289
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1290
    .line 1291
    .line 1292
    move-result v0

    .line 1293
    if-nez v0, :cond_4d

    .line 1294
    .line 1295
    goto :goto_f

    .line 1296
    :cond_4d
    const/16 v26, 0x5

    .line 1297
    .line 1298
    goto :goto_10

    .line 1299
    :sswitch_3d
    move-object/from16 v0, v21

    .line 1300
    .line 1301
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    move-result v0

    .line 1305
    if-nez v0, :cond_4e

    .line 1306
    .line 1307
    goto :goto_f

    .line 1308
    :cond_4e
    const/16 v26, 0x4

    .line 1309
    .line 1310
    goto :goto_10

    .line 1311
    :sswitch_3e
    move-object/from16 v0, v20

    .line 1312
    .line 1313
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    if-nez v0, :cond_4f

    .line 1318
    .line 1319
    goto :goto_f

    .line 1320
    :cond_4f
    const/16 v26, 0x3

    .line 1321
    .line 1322
    goto :goto_10

    .line 1323
    :sswitch_3f
    move-object/from16 v0, v19

    .line 1324
    .line 1325
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v0

    .line 1329
    if-nez v0, :cond_50

    .line 1330
    .line 1331
    goto :goto_f

    .line 1332
    :cond_50
    const/16 v26, 0x2

    .line 1333
    .line 1334
    goto :goto_10

    .line 1335
    :sswitch_40
    move-object/from16 v0, v18

    .line 1336
    .line 1337
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v0

    .line 1341
    if-nez v0, :cond_51

    .line 1342
    .line 1343
    goto :goto_f

    .line 1344
    :cond_51
    const/16 v26, 0x1

    .line 1345
    .line 1346
    goto :goto_10

    .line 1347
    :sswitch_41
    move-object/from16 v0, p1

    .line 1348
    .line 1349
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v0

    .line 1353
    if-nez v0, :cond_52

    .line 1354
    .line 1355
    goto :goto_f

    .line 1356
    :cond_52
    const/16 v26, 0x0

    .line 1357
    .line 1358
    goto :goto_10

    .line 1359
    :goto_f
    const/16 v26, -0x1

    .line 1360
    .line 1361
    :cond_53
    :goto_10
    const-string v0, "video/x-unknown"

    .line 1362
    .line 1363
    const-string v1, ". Setting mimeType to "

    .line 1364
    .line 1365
    const-string v3, "audio/raw"

    .line 1366
    .line 1367
    const-string v4, "audio/x-unknown"

    .line 1368
    .line 1369
    const-string v5, "MatroskaExtractor"

    .line 1370
    .line 1371
    packed-switch v26, :pswitch_data_1

    .line 1372
    .line 1373
    .line 1374
    const-string v0, "Unrecognized codec identifier."

    .line 1375
    .line 1376
    const/4 v1, 0x0

    .line 1377
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    throw v0

    .line 1382
    :pswitch_1
    const/16 v0, 0x1680

    .line 1383
    .line 1384
    new-instance v1, Ljava/util/ArrayList;

    .line 1385
    .line 1386
    const/4 v2, 0x3

    .line 1387
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1388
    .line 1389
    .line 1390
    move-object/from16 v6, v29

    .line 1391
    .line 1392
    iget-object v2, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1393
    .line 1394
    invoke-virtual {v6, v2}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    const/16 v2, 0x8

    .line 1402
    .line 1403
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1408
    .line 1409
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v3

    .line 1413
    iget-wide v7, v6, Li4/d$b;->R:J

    .line 1414
    .line 1415
    invoke-virtual {v3, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v3

    .line 1419
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v2

    .line 1430
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    iget-wide v3, v6, Li4/d$b;->S:J

    .line 1435
    .line 1436
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    const-string v2, "audio/opus"

    .line 1448
    .line 1449
    const/4 v3, 0x3

    .line 1450
    goto/16 :goto_20

    .line 1451
    .line 1452
    :pswitch_2
    move-object/from16 v6, v29

    .line 1453
    .line 1454
    iget-object v0, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1455
    .line 1456
    invoke-virtual {v6, v0}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    const-string v1, "audio/flac"

    .line 1465
    .line 1466
    goto/16 :goto_1a

    .line 1467
    .line 1468
    :pswitch_3
    move-object/from16 v6, v29

    .line 1469
    .line 1470
    const-string v0, "audio/eac3"

    .line 1471
    .line 1472
    goto/16 :goto_13

    .line 1473
    .line 1474
    :pswitch_4
    move-object/from16 v6, v29

    .line 1475
    .line 1476
    const-string v0, "video/mpeg2"

    .line 1477
    .line 1478
    goto/16 :goto_13

    .line 1479
    .line 1480
    :pswitch_5
    move-object/from16 v6, v29

    .line 1481
    .line 1482
    const-string v0, "application/x-subrip"

    .line 1483
    .line 1484
    goto/16 :goto_13

    .line 1485
    .line 1486
    :pswitch_6
    move-object/from16 v6, v29

    .line 1487
    .line 1488
    const-string v0, "text/vtt"

    .line 1489
    .line 1490
    goto/16 :goto_13

    .line 1491
    .line 1492
    :pswitch_7
    move-object/from16 v6, v29

    .line 1493
    .line 1494
    new-instance v0, Lv5/u;

    .line 1495
    .line 1496
    iget-object v1, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1497
    .line 1498
    invoke-virtual {v6, v1}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    invoke-direct {v0, v1}, Lv5/u;-><init>([B)V

    .line 1503
    .line 1504
    .line 1505
    invoke-static {v0}, Lw5/e;->a(Lv5/u;)Lw5/e;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    iget-object v1, v0, Lw5/e;->a:Ljava/util/List;

    .line 1510
    .line 1511
    iget v2, v0, Lw5/e;->b:I

    .line 1512
    .line 1513
    iput v2, v6, Li4/d$b;->Y:I

    .line 1514
    .line 1515
    iget-object v0, v0, Lw5/e;->g:Ljava/lang/String;

    .line 1516
    .line 1517
    const-string v2, "video/hevc"

    .line 1518
    .line 1519
    goto/16 :goto_15

    .line 1520
    .line 1521
    :pswitch_8
    move-object/from16 v6, v29

    .line 1522
    .line 1523
    sget-object v0, Li4/d;->d0:[B

    .line 1524
    .line 1525
    iget-object v1, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1526
    .line 1527
    invoke-virtual {v6, v1}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1528
    .line 1529
    .line 1530
    move-result-object v1

    .line 1531
    invoke-static {v0, v1}, Lo7/t;->u(Ljava/lang/Object;Ljava/lang/Object;)Lo7/l0;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    const-string v1, "text/x-ssa"

    .line 1536
    .line 1537
    goto/16 :goto_1a

    .line 1538
    .line 1539
    :pswitch_9
    move-object/from16 v6, v29

    .line 1540
    .line 1541
    iget v0, v6, Li4/d$b;->P:I

    .line 1542
    .line 1543
    invoke-static {v0}, Lv5/e0;->v(I)I

    .line 1544
    .line 1545
    .line 1546
    move-result v0

    .line 1547
    if-nez v0, :cond_56

    .line 1548
    .line 1549
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1550
    .line 1551
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1552
    .line 1553
    .line 1554
    const-string v2, "Unsupported little endian PCM bit depth: "

    .line 1555
    .line 1556
    goto :goto_12

    .line 1557
    :pswitch_a
    move-object/from16 v6, v29

    .line 1558
    .line 1559
    iget v0, v6, Li4/d$b;->P:I

    .line 1560
    .line 1561
    const/16 v7, 0x8

    .line 1562
    .line 1563
    if-ne v0, v7, :cond_54

    .line 1564
    .line 1565
    const/4 v0, 0x3

    .line 1566
    goto :goto_11

    .line 1567
    :cond_54
    if-ne v0, v2, :cond_55

    .line 1568
    .line 1569
    const/high16 v0, 0x10000000

    .line 1570
    .line 1571
    goto :goto_11

    .line 1572
    :cond_55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1573
    .line 1574
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1575
    .line 1576
    .line 1577
    const-string v2, "Unsupported big endian PCM bit depth: "

    .line 1578
    .line 1579
    goto :goto_12

    .line 1580
    :pswitch_b
    move-object/from16 v6, v29

    .line 1581
    .line 1582
    iget v0, v6, Li4/d$b;->P:I

    .line 1583
    .line 1584
    const/16 v2, 0x20

    .line 1585
    .line 1586
    if-ne v0, v2, :cond_57

    .line 1587
    .line 1588
    const/4 v0, 0x4

    .line 1589
    :cond_56
    :goto_11
    const/4 v1, -0x1

    .line 1590
    const/4 v2, 0x1

    .line 1591
    const/4 v4, 0x0

    .line 1592
    const/4 v5, 0x3

    .line 1593
    goto/16 :goto_29

    .line 1594
    .line 1595
    :cond_57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1596
    .line 1597
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1598
    .line 1599
    .line 1600
    const-string v2, "Unsupported floating point PCM bit depth: "

    .line 1601
    .line 1602
    :goto_12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1603
    .line 1604
    .line 1605
    iget v2, v6, Li4/d$b;->P:I

    .line 1606
    .line 1607
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1621
    .line 1622
    .line 1623
    goto :goto_14

    .line 1624
    :pswitch_c
    move-object/from16 v6, v29

    .line 1625
    .line 1626
    goto :goto_13

    .line 1627
    :pswitch_d
    move-object/from16 v6, v29

    .line 1628
    .line 1629
    const-string v0, "application/pgs"

    .line 1630
    .line 1631
    goto :goto_13

    .line 1632
    :pswitch_e
    move-object/from16 v6, v29

    .line 1633
    .line 1634
    const-string v0, "video/x-vnd.on2.vp9"

    .line 1635
    .line 1636
    goto :goto_13

    .line 1637
    :pswitch_f
    move-object/from16 v6, v29

    .line 1638
    .line 1639
    const-string v0, "video/x-vnd.on2.vp8"

    .line 1640
    .line 1641
    goto :goto_13

    .line 1642
    :pswitch_10
    move-object/from16 v6, v29

    .line 1643
    .line 1644
    const-string v0, "video/av01"

    .line 1645
    .line 1646
    goto :goto_13

    .line 1647
    :pswitch_11
    move-object/from16 v6, v29

    .line 1648
    .line 1649
    const-string v0, "audio/vnd.dts"

    .line 1650
    .line 1651
    goto :goto_13

    .line 1652
    :pswitch_12
    move-object/from16 v6, v29

    .line 1653
    .line 1654
    const-string v0, "audio/ac3"

    .line 1655
    .line 1656
    goto :goto_13

    .line 1657
    :pswitch_13
    move-object/from16 v6, v29

    .line 1658
    .line 1659
    iget-object v0, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1660
    .line 1661
    invoke-virtual {v6, v0}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    iget-object v1, v6, Li4/d$b;->k:[B

    .line 1670
    .line 1671
    new-instance v2, Lv5/t;

    .line 1672
    .line 1673
    array-length v3, v1

    .line 1674
    invoke-direct {v2, v1, v3}, Lv5/t;-><init>([BI)V

    .line 1675
    .line 1676
    .line 1677
    const/4 v1, 0x0

    .line 1678
    invoke-static {v2, v1}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    iget v2, v1, Lx3/a$a;->a:I

    .line 1683
    .line 1684
    iput v2, v6, Li4/d$b;->Q:I

    .line 1685
    .line 1686
    iget v2, v1, Lx3/a$a;->b:I

    .line 1687
    .line 1688
    iput v2, v6, Li4/d$b;->O:I

    .line 1689
    .line 1690
    iget-object v1, v1, Lx3/a$a;->c:Ljava/lang/String;

    .line 1691
    .line 1692
    const-string v2, "audio/mp4a-latm"

    .line 1693
    .line 1694
    move-object v3, v2

    .line 1695
    goto :goto_16

    .line 1696
    :pswitch_14
    move-object/from16 v6, v29

    .line 1697
    .line 1698
    const-string v0, "audio/vnd.dts.hd"

    .line 1699
    .line 1700
    :goto_13
    move-object v4, v0

    .line 1701
    :goto_14
    const/4 v0, 0x0

    .line 1702
    goto/16 :goto_1b

    .line 1703
    .line 1704
    :pswitch_15
    move-object/from16 v6, v29

    .line 1705
    .line 1706
    iget-object v0, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1707
    .line 1708
    invoke-virtual {v6, v0}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1709
    .line 1710
    .line 1711
    move-result-object v0

    .line 1712
    invoke-static {v0}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v0

    .line 1716
    const-string v1, "application/vobsub"

    .line 1717
    .line 1718
    goto/16 :goto_1a

    .line 1719
    .line 1720
    :pswitch_16
    move-object/from16 v6, v29

    .line 1721
    .line 1722
    new-instance v0, Lv5/u;

    .line 1723
    .line 1724
    iget-object v1, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1725
    .line 1726
    invoke-virtual {v6, v1}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1727
    .line 1728
    .line 1729
    move-result-object v1

    .line 1730
    invoke-direct {v0, v1}, Lv5/u;-><init>([B)V

    .line 1731
    .line 1732
    .line 1733
    invoke-static {v0}, Lw5/a;->a(Lv5/u;)Lw5/a;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    iget-object v1, v0, Lw5/a;->a:Ljava/util/List;

    .line 1738
    .line 1739
    iget v2, v0, Lw5/a;->b:I

    .line 1740
    .line 1741
    iput v2, v6, Li4/d$b;->Y:I

    .line 1742
    .line 1743
    iget-object v0, v0, Lw5/a;->f:Ljava/lang/String;

    .line 1744
    .line 1745
    const-string v2, "video/avc"

    .line 1746
    .line 1747
    :goto_15
    move-object v3, v2

    .line 1748
    move-object/from16 v30, v1

    .line 1749
    .line 1750
    move-object v1, v0

    .line 1751
    move-object/from16 v0, v30

    .line 1752
    .line 1753
    :goto_16
    const/4 v2, -0x1

    .line 1754
    const/4 v4, 0x1

    .line 1755
    const/4 v5, 0x3

    .line 1756
    goto/16 :goto_23

    .line 1757
    .line 1758
    :pswitch_17
    move-object/from16 v6, v29

    .line 1759
    .line 1760
    const/4 v0, 0x4

    .line 1761
    new-array v1, v0, [B

    .line 1762
    .line 1763
    iget-object v2, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1764
    .line 1765
    invoke-virtual {v6, v2}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1766
    .line 1767
    .line 1768
    move-result-object v2

    .line 1769
    const/4 v3, 0x0

    .line 1770
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1771
    .line 1772
    .line 1773
    invoke-static {v1}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    const-string v1, "application/dvbsubs"

    .line 1778
    .line 1779
    goto/16 :goto_1a

    .line 1780
    .line 1781
    :pswitch_18
    move-object/from16 v6, v29

    .line 1782
    .line 1783
    new-instance v1, Lv5/u;

    .line 1784
    .line 1785
    iget-object v3, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1786
    .line 1787
    invoke-virtual {v6, v3}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1788
    .line 1789
    .line 1790
    move-result-object v3

    .line 1791
    invoke-direct {v1, v3}, Lv5/u;-><init>([B)V

    .line 1792
    .line 1793
    .line 1794
    :try_start_0
    invoke-virtual {v1, v2}, Lv5/u;->H(I)V

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v1}, Lv5/u;->l()J

    .line 1798
    .line 1799
    .line 1800
    move-result-wide v2

    .line 1801
    const-wide/32 v7, 0x58564944

    .line 1802
    .line 1803
    .line 1804
    cmp-long v4, v2, v7

    .line 1805
    .line 1806
    if-nez v4, :cond_58

    .line 1807
    .line 1808
    new-instance v0, Landroid/util/Pair;

    .line 1809
    .line 1810
    const-string v1, "video/divx"

    .line 1811
    .line 1812
    const/4 v2, 0x0

    .line 1813
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_19

    .line 1817
    :cond_58
    const-wide/32 v7, 0x33363248

    .line 1818
    .line 1819
    .line 1820
    cmp-long v4, v2, v7

    .line 1821
    .line 1822
    if-nez v4, :cond_59

    .line 1823
    .line 1824
    new-instance v0, Landroid/util/Pair;

    .line 1825
    .line 1826
    const-string v1, "video/3gpp"

    .line 1827
    .line 1828
    const/4 v2, 0x0

    .line 1829
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1830
    .line 1831
    .line 1832
    goto :goto_19

    .line 1833
    :cond_59
    const-wide/32 v7, 0x31435657

    .line 1834
    .line 1835
    .line 1836
    cmp-long v2, v2, v7

    .line 1837
    .line 1838
    if-nez v2, :cond_5c

    .line 1839
    .line 1840
    iget v0, v1, Lv5/u;->b:I

    .line 1841
    .line 1842
    add-int/lit8 v0, v0, 0x14

    .line 1843
    .line 1844
    iget-object v1, v1, Lv5/u;->a:[B

    .line 1845
    .line 1846
    :goto_17
    array-length v2, v1

    .line 1847
    add-int/lit8 v2, v2, -0x4

    .line 1848
    .line 1849
    if-ge v0, v2, :cond_5b

    .line 1850
    .line 1851
    aget-byte v2, v1, v0

    .line 1852
    .line 1853
    if-nez v2, :cond_5a

    .line 1854
    .line 1855
    add-int/lit8 v2, v0, 0x1

    .line 1856
    .line 1857
    aget-byte v2, v1, v2

    .line 1858
    .line 1859
    if-nez v2, :cond_5a

    .line 1860
    .line 1861
    add-int/lit8 v2, v0, 0x2

    .line 1862
    .line 1863
    aget-byte v2, v1, v2

    .line 1864
    .line 1865
    const/4 v3, 0x1

    .line 1866
    if-ne v2, v3, :cond_5a

    .line 1867
    .line 1868
    add-int/lit8 v2, v0, 0x3

    .line 1869
    .line 1870
    aget-byte v2, v1, v2

    .line 1871
    .line 1872
    const/16 v3, 0xf

    .line 1873
    .line 1874
    if-ne v2, v3, :cond_5a

    .line 1875
    .line 1876
    array-length v2, v1

    .line 1877
    invoke-static {v1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1878
    .line 1879
    .line 1880
    move-result-object v0

    .line 1881
    new-instance v1, Landroid/util/Pair;

    .line 1882
    .line 1883
    const-string v2, "video/wvc1"

    .line 1884
    .line 1885
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1890
    .line 1891
    .line 1892
    goto :goto_18

    .line 1893
    :cond_5a
    add-int/lit8 v0, v0, 0x1

    .line 1894
    .line 1895
    goto :goto_17

    .line 1896
    :cond_5b
    const-string v0, "Failed to find FourCC VC1 initialization data"

    .line 1897
    .line 1898
    const/4 v1, 0x0

    .line 1899
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1904
    :cond_5c
    const-string v1, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 1905
    .line 1906
    invoke-static {v5, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1907
    .line 1908
    .line 1909
    new-instance v1, Landroid/util/Pair;

    .line 1910
    .line 1911
    const/4 v2, 0x0

    .line 1912
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1913
    .line 1914
    .line 1915
    :goto_18
    move-object v0, v1

    .line 1916
    :goto_19
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1917
    .line 1918
    check-cast v1, Ljava/lang/String;

    .line 1919
    .line 1920
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1921
    .line 1922
    check-cast v0, Ljava/util/List;

    .line 1923
    .line 1924
    :goto_1a
    move-object v4, v1

    .line 1925
    :goto_1b
    const/4 v1, -0x1

    .line 1926
    goto :goto_1d

    .line 1927
    :catch_0
    const-string v0, "Error parsing FourCC private data"

    .line 1928
    .line 1929
    const/4 v1, 0x0

    .line 1930
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v0

    .line 1934
    throw v0

    .line 1935
    :pswitch_19
    move-object/from16 v6, v29

    .line 1936
    .line 1937
    const-string v0, "audio/mpeg"

    .line 1938
    .line 1939
    goto :goto_1c

    .line 1940
    :pswitch_1a
    move-object/from16 v6, v29

    .line 1941
    .line 1942
    const-string v0, "audio/mpeg-L2"

    .line 1943
    .line 1944
    :goto_1c
    move-object v4, v0

    .line 1945
    const/16 v1, 0x1000

    .line 1946
    .line 1947
    const/4 v0, 0x0

    .line 1948
    :goto_1d
    const/4 v2, 0x1

    .line 1949
    const/4 v3, 0x3

    .line 1950
    move v5, v3

    .line 1951
    move-object v3, v4

    .line 1952
    move-object v4, v0

    .line 1953
    goto/16 :goto_28

    .line 1954
    .line 1955
    :pswitch_1b
    move-object/from16 v6, v29

    .line 1956
    .line 1957
    const/16 v0, 0x2000

    .line 1958
    .line 1959
    iget-object v1, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 1960
    .line 1961
    invoke-virtual {v6, v1}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 1962
    .line 1963
    .line 1964
    move-result-object v1

    .line 1965
    const-string v2, "Error parsing vorbis codec private"

    .line 1966
    .line 1967
    const/4 v3, 0x0

    .line 1968
    :try_start_1
    aget-byte v3, v1, v3

    .line 1969
    .line 1970
    const/4 v4, 0x2

    .line 1971
    if-ne v3, v4, :cond_62

    .line 1972
    .line 1973
    const/4 v3, 0x0

    .line 1974
    const/4 v4, 0x1

    .line 1975
    :goto_1e
    aget-byte v5, v1, v4

    .line 1976
    .line 1977
    const/16 v7, 0xff

    .line 1978
    .line 1979
    and-int/2addr v5, v7

    .line 1980
    if-ne v5, v7, :cond_5d

    .line 1981
    .line 1982
    add-int/lit16 v3, v3, 0xff

    .line 1983
    .line 1984
    add-int/lit8 v4, v4, 0x1

    .line 1985
    .line 1986
    goto :goto_1e

    .line 1987
    :cond_5d
    add-int/lit8 v4, v4, 0x1

    .line 1988
    .line 1989
    add-int/2addr v3, v5

    .line 1990
    const/4 v5, 0x0

    .line 1991
    :goto_1f
    aget-byte v8, v1, v4

    .line 1992
    .line 1993
    and-int/2addr v8, v7

    .line 1994
    if-ne v8, v7, :cond_5e

    .line 1995
    .line 1996
    add-int/lit16 v5, v5, 0xff

    .line 1997
    .line 1998
    add-int/lit8 v4, v4, 0x1

    .line 1999
    .line 2000
    goto :goto_1f

    .line 2001
    :cond_5e
    const/4 v7, 0x1

    .line 2002
    add-int/2addr v4, v7

    .line 2003
    add-int/2addr v5, v8

    .line 2004
    aget-byte v8, v1, v4

    .line 2005
    .line 2006
    if-ne v8, v7, :cond_61

    .line 2007
    .line 2008
    new-array v7, v3, [B

    .line 2009
    .line 2010
    const/4 v8, 0x0

    .line 2011
    invoke-static {v1, v4, v7, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2012
    .line 2013
    .line 2014
    add-int/2addr v4, v3

    .line 2015
    aget-byte v3, v1, v4

    .line 2016
    .line 2017
    const/4 v8, 0x3

    .line 2018
    if-ne v3, v8, :cond_60

    .line 2019
    .line 2020
    add-int/2addr v4, v5

    .line 2021
    aget-byte v3, v1, v4

    .line 2022
    .line 2023
    const/4 v5, 0x5

    .line 2024
    if-ne v3, v5, :cond_5f

    .line 2025
    .line 2026
    array-length v3, v1

    .line 2027
    sub-int/2addr v3, v4

    .line 2028
    new-array v3, v3, [B

    .line 2029
    .line 2030
    array-length v5, v1

    .line 2031
    sub-int/2addr v5, v4

    .line 2032
    const/4 v9, 0x0

    .line 2033
    invoke-static {v1, v4, v3, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2034
    .line 2035
    .line 2036
    new-instance v1, Ljava/util/ArrayList;

    .line 2037
    .line 2038
    const/4 v4, 0x2

    .line 2039
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2046
    .line 2047
    .line 2048
    const-string v2, "audio/vorbis"

    .line 2049
    .line 2050
    move v3, v8

    .line 2051
    :goto_20
    const/4 v4, 0x1

    .line 2052
    move v5, v3

    .line 2053
    move-object v3, v2

    .line 2054
    move v2, v4

    .line 2055
    move-object v4, v1

    .line 2056
    move v1, v0

    .line 2057
    goto/16 :goto_28

    .line 2058
    .line 2059
    :cond_5f
    const/4 v0, 0x0

    .line 2060
    :try_start_2
    invoke-static {v2, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    throw v1
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    .line 2065
    :cond_60
    const/4 v0, 0x0

    .line 2066
    :try_start_3
    invoke-static {v2, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    throw v0

    .line 2071
    :cond_61
    const/4 v0, 0x0

    .line 2072
    invoke-static {v2, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v0

    .line 2076
    throw v0
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_1

    .line 2077
    :cond_62
    const/4 v0, 0x0

    .line 2078
    :try_start_4
    invoke-static {v2, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v1

    .line 2082
    throw v1
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    .line 2083
    :catch_1
    const/4 v0, 0x0

    .line 2084
    :catch_2
    invoke-static {v2, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    throw v0

    .line 2089
    :pswitch_1c
    move-object/from16 v6, v29

    .line 2090
    .line 2091
    const/4 v0, 0x3

    .line 2092
    new-instance v1, Lc4/w;

    .line 2093
    .line 2094
    invoke-direct {v1}, Lc4/w;-><init>()V

    .line 2095
    .line 2096
    .line 2097
    iput-object v1, v6, Li4/d$b;->T:Lc4/w;

    .line 2098
    .line 2099
    const-string v4, "audio/true-hd"

    .line 2100
    .line 2101
    const/4 v1, 0x1

    .line 2102
    goto/16 :goto_25

    .line 2103
    .line 2104
    :pswitch_1d
    move-object/from16 v6, v29

    .line 2105
    .line 2106
    const/4 v0, 0x3

    .line 2107
    new-instance v2, Lv5/u;

    .line 2108
    .line 2109
    iget-object v7, v6, Li4/d$b;->b:Ljava/lang/String;

    .line 2110
    .line 2111
    invoke-virtual {v6, v7}, Li4/d$b;->a(Ljava/lang/String;)[B

    .line 2112
    .line 2113
    .line 2114
    move-result-object v7

    .line 2115
    invoke-direct {v2, v7}, Lv5/u;-><init>([B)V

    .line 2116
    .line 2117
    .line 2118
    :try_start_5
    invoke-virtual {v2}, Lv5/u;->n()I

    .line 2119
    .line 2120
    .line 2121
    move-result v7

    .line 2122
    const/4 v8, 0x1

    .line 2123
    if-ne v7, v8, :cond_63

    .line 2124
    .line 2125
    goto :goto_21

    .line 2126
    :cond_63
    const v9, 0xfffe

    .line 2127
    .line 2128
    .line 2129
    if-ne v7, v9, :cond_64

    .line 2130
    .line 2131
    const/16 v7, 0x18

    .line 2132
    .line 2133
    invoke-virtual {v2, v7}, Lv5/u;->G(I)V

    .line 2134
    .line 2135
    .line 2136
    invoke-virtual {v2}, Lv5/u;->o()J

    .line 2137
    .line 2138
    .line 2139
    move-result-wide v9

    .line 2140
    sget-object v7, Li4/d;->g0:Ljava/util/UUID;

    .line 2141
    .line 2142
    invoke-virtual {v7}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 2143
    .line 2144
    .line 2145
    move-result-wide v11

    .line 2146
    cmp-long v9, v9, v11

    .line 2147
    .line 2148
    if-nez v9, :cond_64

    .line 2149
    .line 2150
    invoke-virtual {v2}, Lv5/u;->o()J

    .line 2151
    .line 2152
    .line 2153
    move-result-wide v9

    .line 2154
    invoke-virtual {v7}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 2155
    .line 2156
    .line 2157
    move-result-wide v11
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_3

    .line 2158
    cmp-long v2, v9, v11

    .line 2159
    .line 2160
    if-nez v2, :cond_64

    .line 2161
    .line 2162
    :goto_21
    move v2, v8

    .line 2163
    goto :goto_22

    .line 2164
    :cond_64
    const/4 v2, 0x0

    .line 2165
    :goto_22
    if-eqz v2, :cond_66

    .line 2166
    .line 2167
    iget v2, v6, Li4/d$b;->P:I

    .line 2168
    .line 2169
    invoke-static {v2}, Lv5/e0;->v(I)I

    .line 2170
    .line 2171
    .line 2172
    move-result v2

    .line 2173
    if-nez v2, :cond_65

    .line 2174
    .line 2175
    const-string v2, "Unsupported PCM bit depth: "

    .line 2176
    .line 2177
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v2

    .line 2181
    iget v3, v6, Li4/d$b;->P:I

    .line 2182
    .line 2183
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v1

    .line 2196
    goto :goto_24

    .line 2197
    :cond_65
    const/4 v1, 0x0

    .line 2198
    const/4 v4, 0x0

    .line 2199
    move v5, v0

    .line 2200
    move-object v0, v4

    .line 2201
    move v4, v8

    .line 2202
    :goto_23
    const/4 v7, -0x1

    .line 2203
    goto :goto_2a

    .line 2204
    :cond_66
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 2205
    .line 2206
    :goto_24
    invoke-static {v5, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2207
    .line 2208
    .line 2209
    move v1, v8

    .line 2210
    :goto_25
    const/4 v2, 0x0

    .line 2211
    goto :goto_27

    .line 2212
    :catch_3
    const-string v0, "Error parsing MS/ACM codec private"

    .line 2213
    .line 2214
    const/4 v1, 0x0

    .line 2215
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v0

    .line 2219
    throw v0

    .line 2220
    :pswitch_1e
    move-object/from16 v6, v29

    .line 2221
    .line 2222
    const/4 v1, 0x1

    .line 2223
    const/4 v0, 0x3

    .line 2224
    iget-object v2, v6, Li4/d$b;->k:[B

    .line 2225
    .line 2226
    if-nez v2, :cond_67

    .line 2227
    .line 2228
    const/4 v2, 0x0

    .line 2229
    goto :goto_26

    .line 2230
    :cond_67
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v2

    .line 2234
    :goto_26
    const-string v4, "video/mp4v-es"

    .line 2235
    .line 2236
    :goto_27
    const/4 v3, -0x1

    .line 2237
    move v5, v0

    .line 2238
    move-object/from16 v30, v2

    .line 2239
    .line 2240
    move v2, v1

    .line 2241
    move v1, v3

    .line 2242
    move-object v3, v4

    .line 2243
    move-object/from16 v4, v30

    .line 2244
    .line 2245
    :goto_28
    const/4 v0, -0x1

    .line 2246
    :goto_29
    const/4 v7, 0x0

    .line 2247
    move/from16 v30, v2

    .line 2248
    .line 2249
    move v2, v0

    .line 2250
    move-object v0, v4

    .line 2251
    move/from16 v4, v30

    .line 2252
    .line 2253
    move-object/from16 v31, v7

    .line 2254
    .line 2255
    move v7, v1

    .line 2256
    move-object/from16 v1, v31

    .line 2257
    .line 2258
    :goto_2a
    iget-object v8, v6, Li4/d$b;->N:[B

    .line 2259
    .line 2260
    if-eqz v8, :cond_68

    .line 2261
    .line 2262
    new-instance v8, Lv5/u;

    .line 2263
    .line 2264
    iget-object v9, v6, Li4/d$b;->N:[B

    .line 2265
    .line 2266
    invoke-direct {v8, v9}, Lv5/u;-><init>([B)V

    .line 2267
    .line 2268
    .line 2269
    invoke-static {v8}, Lw5/c;->a(Lv5/u;)Lw5/c;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v8

    .line 2273
    if-eqz v8, :cond_68

    .line 2274
    .line 2275
    iget-object v1, v8, Lw5/c;->a:Ljava/lang/String;

    .line 2276
    .line 2277
    const-string v3, "video/dolby-vision"

    .line 2278
    .line 2279
    :cond_68
    iget-boolean v8, v6, Li4/d$b;->V:Z

    .line 2280
    .line 2281
    or-int/lit8 v8, v8, 0x0

    .line 2282
    .line 2283
    iget-boolean v9, v6, Li4/d$b;->U:Z

    .line 2284
    .line 2285
    if-eqz v9, :cond_69

    .line 2286
    .line 2287
    const/4 v9, 0x2

    .line 2288
    goto :goto_2b

    .line 2289
    :cond_69
    const/4 v9, 0x0

    .line 2290
    :goto_2b
    or-int/2addr v8, v9

    .line 2291
    new-instance v9, Lv3/i0$a;

    .line 2292
    .line 2293
    invoke-direct {v9}, Lv3/i0$a;-><init>()V

    .line 2294
    .line 2295
    .line 2296
    invoke-static {v3}, Lv5/p;->k(Ljava/lang/String;)Z

    .line 2297
    .line 2298
    .line 2299
    move-result v10

    .line 2300
    if-eqz v10, :cond_6a

    .line 2301
    .line 2302
    iget v5, v6, Li4/d$b;->O:I

    .line 2303
    .line 2304
    iput v5, v9, Lv3/i0$a;->x:I

    .line 2305
    .line 2306
    iget v5, v6, Li4/d$b;->Q:I

    .line 2307
    .line 2308
    iput v5, v9, Lv3/i0$a;->y:I

    .line 2309
    .line 2310
    iput v2, v9, Lv3/i0$a;->z:I

    .line 2311
    .line 2312
    goto/16 :goto_33

    .line 2313
    .line 2314
    :cond_6a
    invoke-static {v3}, Lv5/p;->m(Ljava/lang/String;)Z

    .line 2315
    .line 2316
    .line 2317
    move-result v2

    .line 2318
    if-eqz v2, :cond_78

    .line 2319
    .line 2320
    iget v2, v6, Li4/d$b;->q:I

    .line 2321
    .line 2322
    if-nez v2, :cond_6d

    .line 2323
    .line 2324
    iget v2, v6, Li4/d$b;->o:I

    .line 2325
    .line 2326
    const/4 v4, -0x1

    .line 2327
    if-ne v2, v4, :cond_6b

    .line 2328
    .line 2329
    iget v2, v6, Li4/d$b;->m:I

    .line 2330
    .line 2331
    :cond_6b
    iput v2, v6, Li4/d$b;->o:I

    .line 2332
    .line 2333
    iget v2, v6, Li4/d$b;->p:I

    .line 2334
    .line 2335
    if-ne v2, v4, :cond_6c

    .line 2336
    .line 2337
    iget v2, v6, Li4/d$b;->n:I

    .line 2338
    .line 2339
    :cond_6c
    iput v2, v6, Li4/d$b;->p:I

    .line 2340
    .line 2341
    goto :goto_2c

    .line 2342
    :cond_6d
    const/4 v4, -0x1

    .line 2343
    :goto_2c
    const/high16 v2, -0x40800000    # -1.0f

    .line 2344
    .line 2345
    iget v5, v6, Li4/d$b;->o:I

    .line 2346
    .line 2347
    if-eq v5, v4, :cond_6e

    .line 2348
    .line 2349
    iget v10, v6, Li4/d$b;->p:I

    .line 2350
    .line 2351
    if-eq v10, v4, :cond_6e

    .line 2352
    .line 2353
    iget v2, v6, Li4/d$b;->n:I

    .line 2354
    .line 2355
    mul-int/2addr v2, v5

    .line 2356
    int-to-float v2, v2

    .line 2357
    iget v5, v6, Li4/d$b;->m:I

    .line 2358
    .line 2359
    mul-int/2addr v5, v10

    .line 2360
    int-to-float v5, v5

    .line 2361
    div-float/2addr v2, v5

    .line 2362
    :cond_6e
    iget-boolean v5, v6, Li4/d$b;->x:Z

    .line 2363
    .line 2364
    if-eqz v5, :cond_71

    .line 2365
    .line 2366
    iget v5, v6, Li4/d$b;->D:F

    .line 2367
    .line 2368
    const/high16 v10, -0x40800000    # -1.0f

    .line 2369
    .line 2370
    cmpl-float v5, v5, v10

    .line 2371
    .line 2372
    if-eqz v5, :cond_70

    .line 2373
    .line 2374
    iget v5, v6, Li4/d$b;->E:F

    .line 2375
    .line 2376
    cmpl-float v5, v5, v10

    .line 2377
    .line 2378
    if-eqz v5, :cond_70

    .line 2379
    .line 2380
    iget v5, v6, Li4/d$b;->F:F

    .line 2381
    .line 2382
    cmpl-float v5, v5, v10

    .line 2383
    .line 2384
    if-eqz v5, :cond_70

    .line 2385
    .line 2386
    iget v5, v6, Li4/d$b;->G:F

    .line 2387
    .line 2388
    cmpl-float v5, v5, v10

    .line 2389
    .line 2390
    if-eqz v5, :cond_70

    .line 2391
    .line 2392
    iget v5, v6, Li4/d$b;->H:F

    .line 2393
    .line 2394
    cmpl-float v5, v5, v10

    .line 2395
    .line 2396
    if-eqz v5, :cond_70

    .line 2397
    .line 2398
    iget v5, v6, Li4/d$b;->I:F

    .line 2399
    .line 2400
    cmpl-float v5, v5, v10

    .line 2401
    .line 2402
    if-eqz v5, :cond_70

    .line 2403
    .line 2404
    iget v5, v6, Li4/d$b;->J:F

    .line 2405
    .line 2406
    cmpl-float v5, v5, v10

    .line 2407
    .line 2408
    if-eqz v5, :cond_70

    .line 2409
    .line 2410
    iget v5, v6, Li4/d$b;->K:F

    .line 2411
    .line 2412
    cmpl-float v5, v5, v10

    .line 2413
    .line 2414
    if-eqz v5, :cond_70

    .line 2415
    .line 2416
    iget v5, v6, Li4/d$b;->L:F

    .line 2417
    .line 2418
    cmpl-float v5, v5, v10

    .line 2419
    .line 2420
    if-eqz v5, :cond_70

    .line 2421
    .line 2422
    iget v5, v6, Li4/d$b;->M:F

    .line 2423
    .line 2424
    cmpl-float v5, v5, v10

    .line 2425
    .line 2426
    if-nez v5, :cond_6f

    .line 2427
    .line 2428
    goto/16 :goto_2d

    .line 2429
    .line 2430
    :cond_6f
    const/16 v5, 0x19

    .line 2431
    .line 2432
    new-array v5, v5, [B

    .line 2433
    .line 2434
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v10

    .line 2438
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2439
    .line 2440
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v10

    .line 2444
    const/4 v11, 0x0

    .line 2445
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 2446
    .line 2447
    .line 2448
    iget v11, v6, Li4/d$b;->D:F

    .line 2449
    .line 2450
    const v12, 0x47435000    # 50000.0f

    .line 2451
    .line 2452
    .line 2453
    mul-float/2addr v11, v12

    .line 2454
    const/high16 v13, 0x3f000000    # 0.5f

    .line 2455
    .line 2456
    add-float/2addr v11, v13

    .line 2457
    float-to-int v11, v11

    .line 2458
    int-to-short v11, v11

    .line 2459
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2460
    .line 2461
    .line 2462
    iget v11, v6, Li4/d$b;->E:F

    .line 2463
    .line 2464
    mul-float/2addr v11, v12

    .line 2465
    add-float/2addr v11, v13

    .line 2466
    float-to-int v11, v11

    .line 2467
    int-to-short v11, v11

    .line 2468
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2469
    .line 2470
    .line 2471
    iget v11, v6, Li4/d$b;->F:F

    .line 2472
    .line 2473
    mul-float/2addr v11, v12

    .line 2474
    add-float/2addr v11, v13

    .line 2475
    float-to-int v11, v11

    .line 2476
    int-to-short v11, v11

    .line 2477
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2478
    .line 2479
    .line 2480
    iget v11, v6, Li4/d$b;->G:F

    .line 2481
    .line 2482
    mul-float/2addr v11, v12

    .line 2483
    add-float/2addr v11, v13

    .line 2484
    float-to-int v11, v11

    .line 2485
    int-to-short v11, v11

    .line 2486
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2487
    .line 2488
    .line 2489
    iget v11, v6, Li4/d$b;->H:F

    .line 2490
    .line 2491
    mul-float/2addr v11, v12

    .line 2492
    add-float/2addr v11, v13

    .line 2493
    float-to-int v11, v11

    .line 2494
    int-to-short v11, v11

    .line 2495
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2496
    .line 2497
    .line 2498
    iget v11, v6, Li4/d$b;->I:F

    .line 2499
    .line 2500
    mul-float/2addr v11, v12

    .line 2501
    add-float/2addr v11, v13

    .line 2502
    float-to-int v11, v11

    .line 2503
    int-to-short v11, v11

    .line 2504
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2505
    .line 2506
    .line 2507
    iget v11, v6, Li4/d$b;->J:F

    .line 2508
    .line 2509
    mul-float/2addr v11, v12

    .line 2510
    add-float/2addr v11, v13

    .line 2511
    float-to-int v11, v11

    .line 2512
    int-to-short v11, v11

    .line 2513
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2514
    .line 2515
    .line 2516
    iget v11, v6, Li4/d$b;->K:F

    .line 2517
    .line 2518
    mul-float/2addr v11, v12

    .line 2519
    add-float/2addr v11, v13

    .line 2520
    float-to-int v11, v11

    .line 2521
    int-to-short v11, v11

    .line 2522
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2523
    .line 2524
    .line 2525
    iget v11, v6, Li4/d$b;->L:F

    .line 2526
    .line 2527
    add-float/2addr v11, v13

    .line 2528
    float-to-int v11, v11

    .line 2529
    int-to-short v11, v11

    .line 2530
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2531
    .line 2532
    .line 2533
    iget v11, v6, Li4/d$b;->M:F

    .line 2534
    .line 2535
    add-float/2addr v11, v13

    .line 2536
    float-to-int v11, v11

    .line 2537
    int-to-short v11, v11

    .line 2538
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2539
    .line 2540
    .line 2541
    iget v11, v6, Li4/d$b;->B:I

    .line 2542
    .line 2543
    int-to-short v11, v11

    .line 2544
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2545
    .line 2546
    .line 2547
    iget v11, v6, Li4/d$b;->C:I

    .line 2548
    .line 2549
    int-to-short v11, v11

    .line 2550
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2551
    .line 2552
    .line 2553
    goto :goto_2e

    .line 2554
    :cond_70
    :goto_2d
    const/4 v5, 0x0

    .line 2555
    :goto_2e
    new-instance v10, Lw5/b;

    .line 2556
    .line 2557
    iget v11, v6, Li4/d$b;->y:I

    .line 2558
    .line 2559
    iget v12, v6, Li4/d$b;->A:I

    .line 2560
    .line 2561
    iget v13, v6, Li4/d$b;->z:I

    .line 2562
    .line 2563
    invoke-direct {v10, v11, v5, v12, v13}, Lw5/b;-><init>(I[BII)V

    .line 2564
    .line 2565
    .line 2566
    goto :goto_2f

    .line 2567
    :cond_71
    const/4 v10, 0x0

    .line 2568
    :goto_2f
    iget-object v5, v6, Li4/d$b;->a:Ljava/lang/String;

    .line 2569
    .line 2570
    if-eqz v5, :cond_72

    .line 2571
    .line 2572
    sget-object v11, Li4/d;->h0:Ljava/util/Map;

    .line 2573
    .line 2574
    invoke-interface {v11, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2575
    .line 2576
    .line 2577
    move-result v5

    .line 2578
    if-eqz v5, :cond_72

    .line 2579
    .line 2580
    iget-object v4, v6, Li4/d$b;->a:Ljava/lang/String;

    .line 2581
    .line 2582
    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v4

    .line 2586
    check-cast v4, Ljava/lang/Integer;

    .line 2587
    .line 2588
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2589
    .line 2590
    .line 2591
    move-result v4

    .line 2592
    :cond_72
    iget v5, v6, Li4/d$b;->r:I

    .line 2593
    .line 2594
    if-nez v5, :cond_77

    .line 2595
    .line 2596
    iget v5, v6, Li4/d$b;->s:F

    .line 2597
    .line 2598
    const/4 v11, 0x0

    .line 2599
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2600
    .line 2601
    .line 2602
    move-result v5

    .line 2603
    if-nez v5, :cond_77

    .line 2604
    .line 2605
    iget v5, v6, Li4/d$b;->t:F

    .line 2606
    .line 2607
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2608
    .line 2609
    .line 2610
    move-result v5

    .line 2611
    if-nez v5, :cond_77

    .line 2612
    .line 2613
    iget v5, v6, Li4/d$b;->u:F

    .line 2614
    .line 2615
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2616
    .line 2617
    .line 2618
    move-result v5

    .line 2619
    if-nez v5, :cond_73

    .line 2620
    .line 2621
    const/4 v4, 0x0

    .line 2622
    goto :goto_31

    .line 2623
    :cond_73
    iget v5, v6, Li4/d$b;->t:F

    .line 2624
    .line 2625
    const/high16 v11, 0x42b40000    # 90.0f

    .line 2626
    .line 2627
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2628
    .line 2629
    .line 2630
    move-result v5

    .line 2631
    if-nez v5, :cond_74

    .line 2632
    .line 2633
    const/16 v4, 0x5a

    .line 2634
    .line 2635
    goto :goto_31

    .line 2636
    :cond_74
    iget v5, v6, Li4/d$b;->t:F

    .line 2637
    .line 2638
    const/high16 v11, -0x3ccc0000    # -180.0f

    .line 2639
    .line 2640
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2641
    .line 2642
    .line 2643
    move-result v5

    .line 2644
    if-eqz v5, :cond_76

    .line 2645
    .line 2646
    iget v5, v6, Li4/d$b;->t:F

    .line 2647
    .line 2648
    const/high16 v11, 0x43340000    # 180.0f

    .line 2649
    .line 2650
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2651
    .line 2652
    .line 2653
    move-result v5

    .line 2654
    if-nez v5, :cond_75

    .line 2655
    .line 2656
    goto :goto_30

    .line 2657
    :cond_75
    iget v5, v6, Li4/d$b;->t:F

    .line 2658
    .line 2659
    const/high16 v11, -0x3d4c0000    # -90.0f

    .line 2660
    .line 2661
    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    .line 2662
    .line 2663
    .line 2664
    move-result v5

    .line 2665
    if-nez v5, :cond_77

    .line 2666
    .line 2667
    const/16 v4, 0x10e

    .line 2668
    .line 2669
    goto :goto_31

    .line 2670
    :cond_76
    :goto_30
    const/16 v4, 0xb4

    .line 2671
    .line 2672
    :cond_77
    :goto_31
    iget v5, v6, Li4/d$b;->m:I

    .line 2673
    .line 2674
    iput v5, v9, Lv3/i0$a;->p:I

    .line 2675
    .line 2676
    iget v5, v6, Li4/d$b;->n:I

    .line 2677
    .line 2678
    iput v5, v9, Lv3/i0$a;->q:I

    .line 2679
    .line 2680
    iput v2, v9, Lv3/i0$a;->t:F

    .line 2681
    .line 2682
    iput v4, v9, Lv3/i0$a;->s:I

    .line 2683
    .line 2684
    iget-object v2, v6, Li4/d$b;->v:[B

    .line 2685
    .line 2686
    iput-object v2, v9, Lv3/i0$a;->u:[B

    .line 2687
    .line 2688
    iget v2, v6, Li4/d$b;->w:I

    .line 2689
    .line 2690
    iput v2, v9, Lv3/i0$a;->v:I

    .line 2691
    .line 2692
    iput-object v10, v9, Lv3/i0$a;->w:Lw5/b;

    .line 2693
    .line 2694
    const/4 v4, 0x2

    .line 2695
    goto :goto_33

    .line 2696
    :cond_78
    const-string v2, "application/x-subrip"

    .line 2697
    .line 2698
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2699
    .line 2700
    .line 2701
    move-result v2

    .line 2702
    if-nez v2, :cond_7a

    .line 2703
    .line 2704
    const-string v2, "text/x-ssa"

    .line 2705
    .line 2706
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2707
    .line 2708
    .line 2709
    move-result v2

    .line 2710
    if-nez v2, :cond_7a

    .line 2711
    .line 2712
    const-string v2, "text/vtt"

    .line 2713
    .line 2714
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2715
    .line 2716
    .line 2717
    move-result v2

    .line 2718
    if-nez v2, :cond_7a

    .line 2719
    .line 2720
    const-string v2, "application/vobsub"

    .line 2721
    .line 2722
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2723
    .line 2724
    .line 2725
    move-result v2

    .line 2726
    if-nez v2, :cond_7a

    .line 2727
    .line 2728
    const-string v2, "application/pgs"

    .line 2729
    .line 2730
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2731
    .line 2732
    .line 2733
    move-result v2

    .line 2734
    if-nez v2, :cond_7a

    .line 2735
    .line 2736
    const-string v2, "application/dvbsubs"

    .line 2737
    .line 2738
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2739
    .line 2740
    .line 2741
    move-result v2

    .line 2742
    if-eqz v2, :cond_79

    .line 2743
    .line 2744
    goto :goto_32

    .line 2745
    :cond_79
    const-string v0, "Unexpected MIME type."

    .line 2746
    .line 2747
    const/4 v1, 0x0

    .line 2748
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v0

    .line 2752
    throw v0

    .line 2753
    :cond_7a
    :goto_32
    move v4, v5

    .line 2754
    :goto_33
    iget-object v2, v6, Li4/d$b;->a:Ljava/lang/String;

    .line 2755
    .line 2756
    if-eqz v2, :cond_7b

    .line 2757
    .line 2758
    sget-object v5, Li4/d;->h0:Ljava/util/Map;

    .line 2759
    .line 2760
    invoke-interface {v5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2761
    .line 2762
    .line 2763
    move-result v2

    .line 2764
    if-nez v2, :cond_7b

    .line 2765
    .line 2766
    iget-object v2, v6, Li4/d$b;->a:Ljava/lang/String;

    .line 2767
    .line 2768
    iput-object v2, v9, Lv3/i0$a;->b:Ljava/lang/String;

    .line 2769
    .line 2770
    :cond_7b
    move/from16 v2, v27

    .line 2771
    .line 2772
    invoke-virtual {v9, v2}, Lv3/i0$a;->b(I)V

    .line 2773
    .line 2774
    .line 2775
    iput-object v3, v9, Lv3/i0$a;->k:Ljava/lang/String;

    .line 2776
    .line 2777
    iput v7, v9, Lv3/i0$a;->l:I

    .line 2778
    .line 2779
    iget-object v2, v6, Li4/d$b;->W:Ljava/lang/String;

    .line 2780
    .line 2781
    iput-object v2, v9, Lv3/i0$a;->c:Ljava/lang/String;

    .line 2782
    .line 2783
    iput v8, v9, Lv3/i0$a;->d:I

    .line 2784
    .line 2785
    iput-object v0, v9, Lv3/i0$a;->m:Ljava/util/List;

    .line 2786
    .line 2787
    iput-object v1, v9, Lv3/i0$a;->h:Ljava/lang/String;

    .line 2788
    .line 2789
    iget-object v0, v6, Li4/d$b;->l:La4/d;

    .line 2790
    .line 2791
    iput-object v0, v9, Lv3/i0$a;->n:La4/d;

    .line 2792
    .line 2793
    invoke-virtual {v9}, Lv3/i0$a;->a()Lv3/i0;

    .line 2794
    .line 2795
    .line 2796
    move-result-object v0

    .line 2797
    iget v1, v6, Li4/d$b;->c:I

    .line 2798
    .line 2799
    move-object/from16 v2, v16

    .line 2800
    .line 2801
    invoke-interface {v2, v1, v4}, Lc4/j;->r(II)Lc4/v;

    .line 2802
    .line 2803
    .line 2804
    move-result-object v1

    .line 2805
    iput-object v1, v6, Li4/d$b;->X:Lc4/v;

    .line 2806
    .line 2807
    invoke-interface {v1, v0}, Lc4/v;->d(Lv3/i0;)V

    .line 2808
    .line 2809
    .line 2810
    move-object/from16 v0, v17

    .line 2811
    .line 2812
    iget-object v1, v0, Li4/d;->c:Landroid/util/SparseArray;

    .line 2813
    .line 2814
    iget v2, v6, Li4/d$b;->c:I

    .line 2815
    .line 2816
    invoke-virtual {v1, v2, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2817
    .line 2818
    .line 2819
    goto :goto_34

    .line 2820
    :cond_7c
    move-object/from16 v0, v17

    .line 2821
    .line 2822
    :goto_34
    const/4 v1, 0x0

    .line 2823
    iput-object v1, v0, Li4/d;->u:Li4/d$b;

    .line 2824
    .line 2825
    goto/16 :goto_37

    .line 2826
    .line 2827
    :cond_7d
    const/4 v0, 0x0

    .line 2828
    const-string v1, "CodecId is missing in TrackEntry element"

    .line 2829
    .line 2830
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v0

    .line 2834
    throw v0

    .line 2835
    :cond_7e
    move-object v0, v8

    .line 2836
    iget v1, v0, Li4/d;->G:I

    .line 2837
    .line 2838
    const/4 v2, 0x2

    .line 2839
    if-eq v1, v2, :cond_7f

    .line 2840
    .line 2841
    goto/16 :goto_37

    .line 2842
    .line 2843
    :cond_7f
    iget-object v1, v0, Li4/d;->c:Landroid/util/SparseArray;

    .line 2844
    .line 2845
    iget v2, v0, Li4/d;->M:I

    .line 2846
    .line 2847
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 2848
    .line 2849
    .line 2850
    move-result-object v1

    .line 2851
    move-object v8, v1

    .line 2852
    check-cast v8, Li4/d$b;

    .line 2853
    .line 2854
    iget-object v1, v8, Li4/d$b;->X:Lc4/v;

    .line 2855
    .line 2856
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2857
    .line 2858
    .line 2859
    iget-wide v1, v0, Li4/d;->R:J

    .line 2860
    .line 2861
    cmp-long v1, v1, v3

    .line 2862
    .line 2863
    if-lez v1, :cond_80

    .line 2864
    .line 2865
    iget-object v1, v8, Li4/d$b;->b:Ljava/lang/String;

    .line 2866
    .line 2867
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2868
    .line 2869
    .line 2870
    move-result v1

    .line 2871
    if-eqz v1, :cond_80

    .line 2872
    .line 2873
    iget-object v1, v0, Li4/d;->n:Lv5/u;

    .line 2874
    .line 2875
    const/16 v2, 0x8

    .line 2876
    .line 2877
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2878
    .line 2879
    .line 2880
    move-result-object v2

    .line 2881
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2882
    .line 2883
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v2

    .line 2887
    iget-wide v3, v0, Li4/d;->R:J

    .line 2888
    .line 2889
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v2

    .line 2893
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 2894
    .line 2895
    .line 2896
    move-result-object v2

    .line 2897
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2898
    .line 2899
    .line 2900
    array-length v3, v2

    .line 2901
    invoke-virtual {v1, v2, v3}, Lv5/u;->E([BI)V

    .line 2902
    .line 2903
    .line 2904
    :cond_80
    const/4 v1, 0x0

    .line 2905
    const/4 v2, 0x0

    .line 2906
    :goto_35
    iget v3, v0, Li4/d;->K:I

    .line 2907
    .line 2908
    if-ge v2, v3, :cond_81

    .line 2909
    .line 2910
    iget-object v3, v0, Li4/d;->L:[I

    .line 2911
    .line 2912
    aget v3, v3, v2

    .line 2913
    .line 2914
    add-int/2addr v1, v3

    .line 2915
    add-int/lit8 v2, v2, 0x1

    .line 2916
    .line 2917
    goto :goto_35

    .line 2918
    :cond_81
    const/4 v2, 0x0

    .line 2919
    move v9, v2

    .line 2920
    :goto_36
    iget v2, v0, Li4/d;->K:I

    .line 2921
    .line 2922
    if-ge v9, v2, :cond_83

    .line 2923
    .line 2924
    iget-wide v2, v0, Li4/d;->H:J

    .line 2925
    .line 2926
    iget v4, v8, Li4/d$b;->e:I

    .line 2927
    .line 2928
    mul-int/2addr v4, v9

    .line 2929
    div-int/lit16 v4, v4, 0x3e8

    .line 2930
    .line 2931
    int-to-long v4, v4

    .line 2932
    add-long v3, v2, v4

    .line 2933
    .line 2934
    iget v2, v0, Li4/d;->O:I

    .line 2935
    .line 2936
    if-nez v9, :cond_82

    .line 2937
    .line 2938
    iget-boolean v5, v0, Li4/d;->Q:Z

    .line 2939
    .line 2940
    if-nez v5, :cond_82

    .line 2941
    .line 2942
    or-int/lit8 v2, v2, 0x1

    .line 2943
    .line 2944
    :cond_82
    move v5, v2

    .line 2945
    iget-object v2, v0, Li4/d;->L:[I

    .line 2946
    .line 2947
    aget v6, v2, v9

    .line 2948
    .line 2949
    sub-int v10, v1, v6

    .line 2950
    .line 2951
    move-object v1, v0

    .line 2952
    move-object v2, v8

    .line 2953
    move v7, v10

    .line 2954
    invoke-virtual/range {v1 .. v7}, Li4/d;->e(Li4/d$b;JIII)V

    .line 2955
    .line 2956
    .line 2957
    add-int/lit8 v9, v9, 0x1

    .line 2958
    .line 2959
    move v1, v10

    .line 2960
    goto :goto_36

    .line 2961
    :cond_83
    const/4 v1, 0x0

    .line 2962
    iput v1, v0, Li4/d;->G:I

    .line 2963
    .line 2964
    :cond_84
    :goto_37
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_41
        -0x7ce7f3b0 -> :sswitch_40
        -0x76567dc0 -> :sswitch_3f
        -0x6a615338 -> :sswitch_3e
        -0x672350af -> :sswitch_3d
        -0x585f4fce -> :sswitch_3c
        -0x585f4fcd -> :sswitch_3b
        -0x51dc40b2 -> :sswitch_3a
        -0x37a9c464 -> :sswitch_39
        -0x2016c535 -> :sswitch_38
        -0x2016c4e5 -> :sswitch_37
        -0x19552dbd -> :sswitch_36
        -0x1538b2ba -> :sswitch_35
        0x3c02325 -> :sswitch_34
        0x3c02353 -> :sswitch_33
        0x3c030c5 -> :sswitch_32
        0x4e81333 -> :sswitch_31
        0x4e86155 -> :sswitch_30
        0x4e86156 -> :sswitch_2f
        0x5e8da3e -> :sswitch_2e
        0x1a8350d6 -> :sswitch_2d
        0x2056f406 -> :sswitch_2c
        0x25e26ee2 -> :sswitch_2b
        0x2b45174d -> :sswitch_2a
        0x2b453ce4 -> :sswitch_29
        0x2c0618eb -> :sswitch_28
        0x32fdf009 -> :sswitch_27
        0x3e4ca2d8 -> :sswitch_26
        0x54c61e47 -> :sswitch_25
        0x6bd6c624 -> :sswitch_24
        0x7446132a -> :sswitch_23
        0x7446b0a6 -> :sswitch_22
        0x744ad97d -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_11
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
