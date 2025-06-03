.class public final Ly2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Lp2/y;

.field public final b:Lp2/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "EnqueueRunnable"

    invoke-static {v0}, Lo2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly2/f;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lp2/y;)V
    .locals 1

    new-instance v0, Lp2/o;

    invoke-direct {v0}, Lp2/o;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/f;->a:Lp2/y;

    iput-object v0, p0, Ly2/f;->b:Lp2/o;

    return-void
.end method

.method public static a(Lp2/y;)Z
    .locals 61

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lp2/y;->h:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lp2/y;

    .line 24
    .line 25
    iget-boolean v5, v4, Lp2/y;->i:Z

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    invoke-static {v4}, Ly2/f;->a(Lp2/y;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    or-int/2addr v3, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    sget-object v6, Ly2/f;->c:Ljava/lang/String;

    .line 40
    .line 41
    const-string v7, "Already enqueued work ids ("

    .line 42
    .line 43
    invoke-static {v7}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    iget-object v4, v4, Lp2/y;->f:Ljava/util/ArrayList;

    .line 48
    .line 49
    const-string v8, ", "

    .line 50
    .line 51
    invoke-static {v8, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v4, ")"

    .line 59
    .line 60
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v5, v6, v4}, Lo2/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v3, v2

    .line 72
    :cond_2
    invoke-static/range {p0 .. p0}, Lp2/y;->w(Lp2/y;)Ljava/util/HashSet;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v4, v0, Lp2/y;->b:Lp2/k0;

    .line 77
    .line 78
    iget-object v5, v0, Lp2/y;->e:Ljava/util/List;

    .line 79
    .line 80
    new-array v2, v2, [Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v1, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, [Ljava/lang/String;

    .line 87
    .line 88
    iget-object v2, v0, Lp2/y;->c:Ljava/lang/String;

    .line 89
    .line 90
    iget v6, v0, Lp2/y;->d:I

    .line 91
    .line 92
    sget-object v7, Lo2/o$b;->a:Lo2/o$b;

    .line 93
    .line 94
    sget-object v8, Lo2/o$b;->c:Lo2/o$b;

    .line 95
    .line 96
    sget-object v9, Lo2/o$b;->f:Lo2/o$b;

    .line 97
    .line 98
    sget-object v10, Lo2/o$b;->d:Lo2/o$b;

    .line 99
    .line 100
    iget-object v11, v4, Lp2/k0;->b:Landroidx/work/a;

    .line 101
    .line 102
    iget-object v11, v11, Landroidx/work/a;->c:Lp2/m0;

    .line 103
    .line 104
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    iget-object v13, v4, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 112
    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    array-length v14, v1

    .line 116
    if-lez v14, :cond_3

    .line 117
    .line 118
    const/4 v14, 0x1

    .line 119
    goto :goto_1

    .line 120
    :cond_3
    const/4 v14, 0x0

    .line 121
    :goto_1
    if-eqz v14, :cond_8

    .line 122
    .line 123
    array-length v15, v1

    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x1

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    move/from16 v20, v3

    .line 133
    .line 134
    move/from16 v3, v16

    .line 135
    .line 136
    :goto_2
    if-ge v3, v15, :cond_9

    .line 137
    .line 138
    move/from16 v16, v15

    .line 139
    .line 140
    aget-object v15, v1, v3

    .line 141
    .line 142
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0, v15}, Lx2/t;->t(Ljava/lang/String;)Lx2/s;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-nez v0, :cond_4

    .line 151
    .line 152
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Ly2/f;->c:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v3, "Prerequisite "

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v3, " doesn\'t exist; not enqueuing"

    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v0, v1, v2}, Lo2/j;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_4
    iget-object v0, v0, Lx2/s;->b:Lo2/o$b;

    .line 186
    .line 187
    if-ne v0, v8, :cond_5

    .line 188
    .line 189
    const/4 v15, 0x1

    .line 190
    goto :goto_3

    .line 191
    :cond_5
    const/4 v15, 0x0

    .line 192
    :goto_3
    and-int v17, v17, v15

    .line 193
    .line 194
    if-ne v0, v10, :cond_6

    .line 195
    .line 196
    const/4 v0, 0x1

    .line 197
    move/from16 v19, v0

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-ne v0, v9, :cond_7

    .line 201
    .line 202
    const/4 v0, 0x1

    .line 203
    move/from16 v18, v0

    .line 204
    .line 205
    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 206
    .line 207
    move-object/from16 v0, p0

    .line 208
    .line 209
    move/from16 v15, v16

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    move/from16 v20, v3

    .line 213
    .line 214
    const/16 v17, 0x1

    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    const/16 v19, 0x0

    .line 219
    .line 220
    :cond_9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    xor-int/lit8 v0, v0, 0x1

    .line 225
    .line 226
    if-eqz v0, :cond_a

    .line 227
    .line 228
    if-nez v14, :cond_a

    .line 229
    .line 230
    const/4 v3, 0x1

    .line 231
    goto :goto_5

    .line 232
    :cond_a
    const/4 v3, 0x0

    .line 233
    :goto_5
    if-eqz v3, :cond_1a

    .line 234
    .line 235
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-interface {v3, v2}, Lx2/t;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    if-nez v15, :cond_1a

    .line 248
    .line 249
    const/4 v15, 0x3

    .line 250
    if-eq v6, v15, :cond_10

    .line 251
    .line 252
    const/4 v15, 0x4

    .line 253
    if-ne v6, v15, :cond_b

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_b
    const/4 v8, 0x2

    .line 257
    if-ne v6, v8, :cond_e

    .line 258
    .line 259
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    :cond_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_e

    .line 268
    .line 269
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    check-cast v8, Lx2/s$b;

    .line 274
    .line 275
    iget-object v8, v8, Lx2/s$b;->b:Lo2/o$b;

    .line 276
    .line 277
    if-eq v8, v7, :cond_d

    .line 278
    .line 279
    sget-object v15, Lo2/o$b;->b:Lo2/o$b;

    .line 280
    .line 281
    if-ne v8, v15, :cond_c

    .line 282
    .line 283
    :cond_d
    :goto_6
    const/4 v0, 0x1

    .line 284
    const/4 v1, 0x0

    .line 285
    goto/16 :goto_14

    .line 286
    .line 287
    :cond_e
    new-instance v6, Ly2/d;

    .line 288
    .line 289
    invoke-direct {v6, v4, v2}, Ly2/d;-><init>(Lp2/k0;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6}, Ly2/e;->run()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_f

    .line 308
    .line 309
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    check-cast v8, Lx2/s$b;

    .line 314
    .line 315
    iget-object v8, v8, Lx2/s$b;->a:Ljava/lang/String;

    .line 316
    .line 317
    invoke-interface {v6, v8}, Lx2/t;->a(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_f
    const/4 v3, 0x1

    .line 322
    move/from16 v16, v0

    .line 323
    .line 324
    goto/16 :goto_e

    .line 325
    .line 326
    :cond_10
    :goto_8
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->p()Lx2/b;

    .line 327
    .line 328
    .line 329
    move-result-object v14

    .line 330
    new-instance v15, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v16

    .line 343
    if-eqz v16, :cond_15

    .line 344
    .line 345
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v16

    .line 349
    move-object/from16 v21, v3

    .line 350
    .line 351
    move-object/from16 v3, v16

    .line 352
    .line 353
    check-cast v3, Lx2/s$b;

    .line 354
    .line 355
    move/from16 v16, v0

    .line 356
    .line 357
    iget-object v0, v3, Lx2/s$b;->a:Ljava/lang/String;

    .line 358
    .line 359
    invoke-interface {v14, v0}, Lx2/b;->d(Ljava/lang/String;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-nez v0, :cond_14

    .line 364
    .line 365
    iget-object v0, v3, Lx2/s$b;->b:Lo2/o$b;

    .line 366
    .line 367
    if-ne v0, v8, :cond_11

    .line 368
    .line 369
    const/16 v22, 0x1

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_11
    const/16 v22, 0x0

    .line 373
    .line 374
    :goto_a
    and-int v17, v17, v22

    .line 375
    .line 376
    if-ne v0, v10, :cond_12

    .line 377
    .line 378
    const/16 v19, 0x1

    .line 379
    .line 380
    goto :goto_b

    .line 381
    :cond_12
    if-ne v0, v9, :cond_13

    .line 382
    .line 383
    const/16 v18, 0x1

    .line 384
    .line 385
    :cond_13
    :goto_b
    iget-object v0, v3, Lx2/s$b;->a:Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    :cond_14
    move/from16 v0, v16

    .line 391
    .line 392
    move-object/from16 v3, v21

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_15
    move/from16 v16, v0

    .line 396
    .line 397
    const/4 v0, 0x4

    .line 398
    if-ne v6, v0, :cond_18

    .line 399
    .line 400
    if-nez v18, :cond_16

    .line 401
    .line 402
    if-eqz v19, :cond_18

    .line 403
    .line 404
    :cond_16
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-interface {v0, v2}, Lx2/t;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    if-eqz v6, :cond_17

    .line 421
    .line 422
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    check-cast v6, Lx2/s$b;

    .line 427
    .line 428
    iget-object v6, v6, Lx2/s$b;->a:Ljava/lang/String;

    .line 429
    .line 430
    invoke-interface {v0, v6}, Lx2/t;->a(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    goto :goto_c

    .line 434
    :cond_17
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v15

    .line 438
    const/4 v0, 0x0

    .line 439
    const/4 v3, 0x0

    .line 440
    move/from16 v18, v0

    .line 441
    .line 442
    move/from16 v19, v3

    .line 443
    .line 444
    :cond_18
    invoke-interface {v15, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    move-object v1, v0

    .line 449
    check-cast v1, [Ljava/lang/String;

    .line 450
    .line 451
    array-length v0, v1

    .line 452
    if-lez v0, :cond_19

    .line 453
    .line 454
    const/4 v14, 0x1

    .line 455
    goto :goto_d

    .line 456
    :cond_19
    const/4 v14, 0x0

    .line 457
    goto :goto_d

    .line 458
    :cond_1a
    move/from16 v16, v0

    .line 459
    .line 460
    :goto_d
    const/4 v3, 0x0

    .line 461
    :goto_e
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    if-eqz v5, :cond_25

    .line 470
    .line 471
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    check-cast v5, Lo2/q;

    .line 476
    .line 477
    iget-object v6, v5, Lo2/q;->b:Lx2/s;

    .line 478
    .line 479
    if-eqz v14, :cond_1d

    .line 480
    .line 481
    if-nez v17, :cond_1d

    .line 482
    .line 483
    if-eqz v19, :cond_1b

    .line 484
    .line 485
    iput-object v10, v6, Lx2/s;->b:Lo2/o$b;

    .line 486
    .line 487
    goto :goto_10

    .line 488
    :cond_1b
    if-eqz v18, :cond_1c

    .line 489
    .line 490
    iput-object v9, v6, Lx2/s;->b:Lo2/o$b;

    .line 491
    .line 492
    goto :goto_10

    .line 493
    :cond_1c
    sget-object v8, Lo2/o$b;->e:Lo2/o$b;

    .line 494
    .line 495
    iput-object v8, v6, Lx2/s;->b:Lo2/o$b;

    .line 496
    .line 497
    goto :goto_10

    .line 498
    :cond_1d
    iput-wide v11, v6, Lx2/s;->n:J

    .line 499
    .line 500
    :goto_10
    iget-object v8, v6, Lx2/s;->b:Lo2/o$b;

    .line 501
    .line 502
    if-ne v8, v7, :cond_1e

    .line 503
    .line 504
    const/4 v3, 0x1

    .line 505
    :cond_1e
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    iget-object v15, v4, Lp2/k0;->e:Ljava/util/List;

    .line 510
    .line 511
    move-object/from16 v21, v0

    .line 512
    .line 513
    const-string v0, "schedulers"

    .line 514
    .line 515
    invoke-static {v15, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 519
    .line 520
    const/16 v15, 0x1a

    .line 521
    .line 522
    if-ge v0, v15, :cond_1f

    .line 523
    .line 524
    const/4 v0, 0x1

    .line 525
    goto :goto_11

    .line 526
    :cond_1f
    const/4 v0, 0x0

    .line 527
    :goto_11
    if-eqz v0, :cond_21

    .line 528
    .line 529
    const-class v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 530
    .line 531
    iget-object v15, v6, Lx2/s;->j:Lo2/c;

    .line 532
    .line 533
    move/from16 v22, v3

    .line 534
    .line 535
    iget-object v3, v6, Lx2/s;->c:Ljava/lang/String;

    .line 536
    .line 537
    move-object/from16 v23, v4

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    invoke-static {v3, v4}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    if-nez v4, :cond_22

    .line 548
    .line 549
    iget-boolean v4, v15, Lo2/c;->d:Z

    .line 550
    .line 551
    if-nez v4, :cond_20

    .line 552
    .line 553
    iget-boolean v4, v15, Lo2/c;->e:Z

    .line 554
    .line 555
    if-eqz v4, :cond_22

    .line 556
    .line 557
    :cond_20
    new-instance v4, Landroidx/work/c$a;

    .line 558
    .line 559
    invoke-direct {v4}, Landroidx/work/c$a;-><init>()V

    .line 560
    .line 561
    .line 562
    iget-object v15, v6, Lx2/s;->e:Landroidx/work/c;

    .line 563
    .line 564
    iget-object v15, v15, Landroidx/work/c;->a:Ljava/util/HashMap;

    .line 565
    .line 566
    invoke-virtual {v4, v15}, Landroidx/work/c$a;->a(Ljava/util/HashMap;)V

    .line 567
    .line 568
    .line 569
    const-string v15, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 570
    .line 571
    invoke-virtual {v4, v15, v3}, Landroidx/work/c$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    new-instance v3, Landroidx/work/c;

    .line 575
    .line 576
    move-object/from16 v29, v3

    .line 577
    .line 578
    iget-object v4, v4, Landroidx/work/c$a;->a:Ljava/util/HashMap;

    .line 579
    .line 580
    invoke-direct {v3, v4}, Landroidx/work/c;-><init>(Ljava/util/HashMap;)V

    .line 581
    .line 582
    .line 583
    invoke-static {v3}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v27

    .line 590
    iget-object v0, v6, Lx2/s;->a:Ljava/lang/String;

    .line 591
    .line 592
    move-object/from16 v25, v0

    .line 593
    .line 594
    iget-object v3, v6, Lx2/s;->b:Lo2/o$b;

    .line 595
    .line 596
    move-object/from16 v26, v3

    .line 597
    .line 598
    iget-object v4, v6, Lx2/s;->d:Ljava/lang/String;

    .line 599
    .line 600
    move-object/from16 v28, v4

    .line 601
    .line 602
    iget-object v15, v6, Lx2/s;->f:Landroidx/work/c;

    .line 603
    .line 604
    move-object/from16 v30, v15

    .line 605
    .line 606
    move-object/from16 v56, v9

    .line 607
    .line 608
    move-object/from16 v57, v10

    .line 609
    .line 610
    iget-wide v9, v6, Lx2/s;->g:J

    .line 611
    .line 612
    move-wide/from16 v31, v9

    .line 613
    .line 614
    iget-wide v9, v6, Lx2/s;->h:J

    .line 615
    .line 616
    move-wide/from16 v33, v9

    .line 617
    .line 618
    iget-wide v9, v6, Lx2/s;->i:J

    .line 619
    .line 620
    move-wide/from16 v35, v9

    .line 621
    .line 622
    iget-object v9, v6, Lx2/s;->j:Lo2/c;

    .line 623
    .line 624
    move-object/from16 v37, v9

    .line 625
    .line 626
    iget v10, v6, Lx2/s;->k:I

    .line 627
    .line 628
    move/from16 v38, v10

    .line 629
    .line 630
    iget v10, v6, Lx2/s;->l:I

    .line 631
    .line 632
    move/from16 v39, v10

    .line 633
    .line 634
    move-wide/from16 v58, v11

    .line 635
    .line 636
    iget-wide v11, v6, Lx2/s;->m:J

    .line 637
    .line 638
    move-wide/from16 v40, v11

    .line 639
    .line 640
    iget-wide v11, v6, Lx2/s;->n:J

    .line 641
    .line 642
    move-wide/from16 v42, v11

    .line 643
    .line 644
    iget-wide v11, v6, Lx2/s;->o:J

    .line 645
    .line 646
    move-wide/from16 v44, v11

    .line 647
    .line 648
    iget-wide v11, v6, Lx2/s;->p:J

    .line 649
    .line 650
    move-wide/from16 v46, v11

    .line 651
    .line 652
    iget-boolean v11, v6, Lx2/s;->q:Z

    .line 653
    .line 654
    move/from16 v48, v11

    .line 655
    .line 656
    iget v11, v6, Lx2/s;->r:I

    .line 657
    .line 658
    move/from16 v49, v11

    .line 659
    .line 660
    iget v12, v6, Lx2/s;->s:I

    .line 661
    .line 662
    move/from16 v50, v12

    .line 663
    .line 664
    iget v12, v6, Lx2/s;->t:I

    .line 665
    .line 666
    move/from16 v51, v12

    .line 667
    .line 668
    move-object/from16 v60, v13

    .line 669
    .line 670
    iget-wide v12, v6, Lx2/s;->u:J

    .line 671
    .line 672
    move-wide/from16 v52, v12

    .line 673
    .line 674
    iget v12, v6, Lx2/s;->v:I

    .line 675
    .line 676
    move/from16 v54, v12

    .line 677
    .line 678
    iget v6, v6, Lx2/s;->w:I

    .line 679
    .line 680
    move/from16 v55, v6

    .line 681
    .line 682
    const-string v6, "id"

    .line 683
    .line 684
    invoke-static {v0, v6}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    const-string v0, "state"

    .line 688
    .line 689
    invoke-static {v3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    const-string v0, "inputMergerClassName"

    .line 693
    .line 694
    invoke-static {v4, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    const-string v0, "output"

    .line 698
    .line 699
    invoke-static {v15, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const-string v0, "constraints"

    .line 703
    .line 704
    invoke-static {v9, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    const-string v0, "backoffPolicy"

    .line 708
    .line 709
    invoke-static {v10, v0}, La0/j;->p(ILjava/lang/String;)V

    .line 710
    .line 711
    .line 712
    const-string v0, "outOfQuotaPolicy"

    .line 713
    .line 714
    invoke-static {v11, v0}, La0/j;->p(ILjava/lang/String;)V

    .line 715
    .line 716
    .line 717
    new-instance v6, Lx2/s;

    .line 718
    .line 719
    move-object/from16 v24, v6

    .line 720
    .line 721
    invoke-direct/range {v24 .. v55}, Lx2/s;-><init>(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V

    .line 722
    .line 723
    .line 724
    goto :goto_12

    .line 725
    :cond_21
    move/from16 v22, v3

    .line 726
    .line 727
    move-object/from16 v23, v4

    .line 728
    .line 729
    :cond_22
    move-object/from16 v56, v9

    .line 730
    .line 731
    move-object/from16 v57, v10

    .line 732
    .line 733
    move-wide/from16 v58, v11

    .line 734
    .line 735
    move-object/from16 v60, v13

    .line 736
    .line 737
    :goto_12
    invoke-interface {v8, v6}, Lx2/t;->b(Lx2/s;)V

    .line 738
    .line 739
    .line 740
    const-string v0, "id.toString()"

    .line 741
    .line 742
    if-eqz v14, :cond_23

    .line 743
    .line 744
    array-length v3, v1

    .line 745
    const/4 v4, 0x0

    .line 746
    :goto_13
    if-ge v4, v3, :cond_23

    .line 747
    .line 748
    aget-object v6, v1, v4

    .line 749
    .line 750
    new-instance v8, Lx2/a;

    .line 751
    .line 752
    iget-object v9, v5, Lo2/q;->a:Ljava/util/UUID;

    .line 753
    .line 754
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v9

    .line 758
    invoke-static {v9, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    invoke-direct {v8, v9, v6}, Lx2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual/range {v60 .. v60}, Landroidx/work/impl/WorkDatabase;->p()Lx2/b;

    .line 765
    .line 766
    .line 767
    move-result-object v6

    .line 768
    invoke-interface {v6, v8}, Lx2/b;->b(Lx2/a;)V

    .line 769
    .line 770
    .line 771
    add-int/lit8 v4, v4, 0x1

    .line 772
    .line 773
    goto :goto_13

    .line 774
    :cond_23
    invoke-virtual/range {v60 .. v60}, Landroidx/work/impl/WorkDatabase;->v()Lx2/x;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    iget-object v4, v5, Lo2/q;->a:Ljava/util/UUID;

    .line 779
    .line 780
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    invoke-static {v4, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    iget-object v6, v5, Lo2/q;->c:Ljava/util/Set;

    .line 788
    .line 789
    invoke-interface {v3, v4, v6}, Lx2/x;->b(Ljava/lang/String;Ljava/util/Set;)V

    .line 790
    .line 791
    .line 792
    if-eqz v16, :cond_24

    .line 793
    .line 794
    invoke-virtual/range {v60 .. v60}, Landroidx/work/impl/WorkDatabase;->s()Lx2/n;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    new-instance v4, Lx2/m;

    .line 799
    .line 800
    iget-object v5, v5, Lo2/q;->a:Ljava/util/UUID;

    .line 801
    .line 802
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    invoke-static {v5, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    invoke-direct {v4, v2, v5}, Lx2/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    invoke-interface {v3, v4}, Lx2/n;->a(Lx2/m;)V

    .line 813
    .line 814
    .line 815
    :cond_24
    move-object/from16 v0, v21

    .line 816
    .line 817
    move/from16 v3, v22

    .line 818
    .line 819
    move-object/from16 v4, v23

    .line 820
    .line 821
    move-object/from16 v9, v56

    .line 822
    .line 823
    move-object/from16 v10, v57

    .line 824
    .line 825
    move-wide/from16 v11, v58

    .line 826
    .line 827
    move-object/from16 v13, v60

    .line 828
    .line 829
    goto/16 :goto_f

    .line 830
    .line 831
    :cond_25
    const/4 v0, 0x1

    .line 832
    move v1, v3

    .line 833
    :goto_14
    move-object/from16 v2, p0

    .line 834
    .line 835
    iput-boolean v0, v2, Lp2/y;->i:Z

    .line 836
    .line 837
    or-int v0, v20, v1

    .line 838
    .line 839
    return v0
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ly2/f;->a:Lp2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lp2/y;->v(Lp2/y;Ljava/util/HashSet;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ly2/f;->a:Lp2/y;

    .line 18
    .line 19
    iget-object v0, v0, Lp2/y;->b:Lp2/k0;

    .line 20
    .line 21
    iget-object v1, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 22
    .line 23
    invoke-virtual {v1}, Lp1/j;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    iget-object v0, v0, Lp2/k0;->b:Landroidx/work/a;

    .line 27
    .line 28
    iget-object v2, p0, Ly2/f;->a:Lp2/y;

    .line 29
    .line 30
    invoke-static {v1, v0, v2}, Ly2/g;->a(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Lp2/y;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ly2/f;->a:Lp2/y;

    .line 34
    .line 35
    invoke-static {v0}, Ly2/f;->a(Lp2/y;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {v1}, Lp1/j;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    invoke-virtual {v1}, Lp1/j;->j()V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, Ly2/f;->a:Lp2/y;

    .line 48
    .line 49
    iget-object v0, v0, Lp2/y;->b:Lp2/k0;

    .line 50
    .line 51
    iget-object v0, v0, Lp2/k0;->a:Landroid/content/Context;

    .line 52
    .line 53
    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-static {v0, v1, v2}, Ly2/o;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Ly2/f;->a:Lp2/y;

    .line 60
    .line 61
    iget-object v0, v0, Lp2/y;->b:Lp2/k0;

    .line 62
    .line 63
    iget-object v1, v0, Lp2/k0;->b:Landroidx/work/a;

    .line 64
    .line 65
    iget-object v2, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 66
    .line 67
    iget-object v0, v0, Lp2/k0;->e:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v1, v2, v0}, Lp2/w;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    iget-object v0, p0, Ly2/f;->b:Lp2/o;

    .line 73
    .line 74
    sget-object v1, Lo2/m;->a:Lo2/m$a$c;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lp2/o;->a(Lo2/m$a;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    invoke-virtual {v1}, Lp1/j;->j()V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v2, "WorkContinuation has cycles ("

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Ly2/f;->a:Lp2/y;

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v2, ")"

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    iget-object v1, p0, Ly2/f;->b:Lp2/o;

    .line 117
    .line 118
    new-instance v2, Lo2/m$a$a;

    .line 119
    .line 120
    invoke-direct {v2, v0}, Lo2/m$a$a;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Lp2/o;->a(Lo2/m$a;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    return-void
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
