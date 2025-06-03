.class public final synthetic Lr3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/t$a;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lr3/r;->a:I

    iput-object p1, p0, Lr3/r;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr3/r;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr3/r;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lr3/r;->a:I

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x5

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :pswitch_0
    iget-object v0, v1, Lr3/r;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lr3/t;

    .line 19
    .line 20
    iget-object v9, v1, Lr3/r;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v9, Ljava/util/List;

    .line 23
    .line 24
    iget-object v10, v1, Lr3/r;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v10, Lk3/s;

    .line 27
    .line 28
    move-object/from16 v11, p1

    .line 29
    .line 30
    check-cast v11, Landroid/database/Cursor;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_7

    .line 40
    .line 41
    invoke-interface {v11, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v12

    .line 45
    const/4 v14, 0x7

    .line 46
    invoke-interface {v11, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    if-eqz v14, :cond_0

    .line 51
    .line 52
    move v14, v8

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    move v14, v6

    .line 55
    :goto_1
    new-instance v15, Lk3/h$a;

    .line 56
    .line 57
    invoke-direct {v15}, Lk3/h$a;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v2, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v2, v15, Lk3/h$a;->f:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v11, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v15, v2}, Lk3/h$a;->d(Ljava/lang/String;)Lk3/h$a;

    .line 72
    .line 73
    .line 74
    invoke-interface {v11, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v16

    .line 78
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iput-object v2, v15, Lk3/h$a;->d:Ljava/lang/Long;

    .line 83
    .line 84
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v16

    .line 88
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iput-object v2, v15, Lk3/h$a;->e:Ljava/lang/Long;

    .line 93
    .line 94
    new-instance v2, Lk3/m;

    .line 95
    .line 96
    invoke-interface {v11, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    invoke-static/range {v16 .. v16}, Lr3/t;->h0(Ljava/lang/String;)Lh3/c;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v14, :cond_1

    .line 105
    .line 106
    invoke-interface {v11, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    invoke-direct {v2, v3, v14}, Lk3/m;-><init>(Lh3/c;[B)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    invoke-virtual {v0}, Lr3/t;->I()Landroid/database/sqlite/SQLiteDatabase;

    .line 115
    .line 116
    .line 117
    move-result-object v18

    .line 118
    const-string v14, "bytes"

    .line 119
    .line 120
    filled-new-array {v14}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v20

    .line 124
    new-array v14, v8, [Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    aput-object v16, v14, v6

    .line 131
    .line 132
    const/16 v23, 0x0

    .line 133
    .line 134
    const/16 v24, 0x0

    .line 135
    .line 136
    const-string v19, "event_payloads"

    .line 137
    .line 138
    const-string v21, "event_id = ?"

    .line 139
    .line 140
    const-string v25, "sequence_num"

    .line 141
    .line 142
    move-object/from16 v22, v14

    .line 143
    .line 144
    invoke-virtual/range {v18 .. v25}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    new-instance v5, Le0/d;

    .line 149
    .line 150
    invoke-direct {v5, v4}, Le0/d;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v14, v5}, Lr3/t;->k0(Landroid/database/Cursor;Lr3/t$a;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, [B

    .line 158
    .line 159
    invoke-direct {v2, v3, v5}, Lk3/m;-><init>(Lh3/c;[B)V

    .line 160
    .line 161
    .line 162
    :goto_2
    invoke-virtual {v15, v2}, Lk3/h$a;->c(Lk3/m;)Lk3/h$a;

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x6

    .line 166
    invoke-interface {v11, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_2

    .line 171
    .line 172
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iput-object v2, v15, Lk3/h$a;->b:Ljava/lang/Integer;

    .line 181
    .line 182
    :cond_2
    const/16 v2, 0x8

    .line 183
    .line 184
    invoke-interface {v11, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-nez v3, :cond_3

    .line 189
    .line 190
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iput-object v2, v15, Lk3/h$a;->g:Ljava/lang/Integer;

    .line 199
    .line 200
    :cond_3
    const/16 v2, 0x9

    .line 201
    .line 202
    invoke-interface {v11, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_4

    .line 207
    .line 208
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    iput-object v2, v15, Lk3/h$a;->h:Ljava/lang/String;

    .line 213
    .line 214
    :cond_4
    const/16 v2, 0xa

    .line 215
    .line 216
    invoke-interface {v11, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-nez v3, :cond_5

    .line 221
    .line 222
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iput-object v2, v15, Lk3/h$a;->i:[B

    .line 227
    .line 228
    :cond_5
    const/16 v2, 0xb

    .line 229
    .line 230
    invoke-interface {v11, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-nez v3, :cond_6

    .line 235
    .line 236
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    iput-object v2, v15, Lk3/h$a;->j:[B

    .line 241
    .line 242
    :cond_6
    invoke-virtual {v15}, Lk3/h$a;->b()Lk3/h;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    new-instance v3, Lr3/b;

    .line 247
    .line 248
    invoke-direct {v3, v12, v13, v10, v2}, Lr3/b;-><init>(JLk3/s;Lk3/n;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    const/4 v3, 0x3

    .line 255
    const/4 v5, 0x5

    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_7
    const/4 v0, 0x0

    .line 259
    return-object v0

    .line 260
    :goto_3
    iget-object v0, v1, Lr3/r;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Lr3/t;

    .line 263
    .line 264
    iget-object v2, v1, Lr3/r;->c:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v2, Ljava/util/Map;

    .line 267
    .line 268
    iget-object v3, v1, Lr3/r;->d:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v3, Ln3/a$a;

    .line 271
    .line 272
    move-object/from16 v5, p1

    .line 273
    .line 274
    check-cast v5, Landroid/database/Cursor;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    sget-object v9, Ln3/c$a;->b:Ln3/c$a;

    .line 280
    .line 281
    :goto_4
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-eqz v10, :cond_10

    .line 286
    .line 287
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    if-nez v11, :cond_8

    .line 296
    .line 297
    const/4 v13, 0x3

    .line 298
    const/4 v14, 0x5

    .line 299
    const/4 v15, 0x6

    .line 300
    goto :goto_9

    .line 301
    :cond_8
    sget-object v12, Ln3/c$a;->c:Ln3/c$a;

    .line 302
    .line 303
    if-ne v11, v8, :cond_9

    .line 304
    .line 305
    :goto_5
    const/4 v13, 0x3

    .line 306
    :goto_6
    const/4 v14, 0x5

    .line 307
    goto :goto_8

    .line 308
    :cond_9
    sget-object v12, Ln3/c$a;->d:Ln3/c$a;

    .line 309
    .line 310
    if-ne v11, v7, :cond_a

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_a
    sget-object v12, Ln3/c$a;->e:Ln3/c$a;

    .line 314
    .line 315
    const/4 v13, 0x3

    .line 316
    if-ne v11, v13, :cond_b

    .line 317
    .line 318
    :goto_7
    goto :goto_6

    .line 319
    :cond_b
    sget-object v12, Ln3/c$a;->f:Ln3/c$a;

    .line 320
    .line 321
    if-ne v11, v4, :cond_c

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_c
    sget-object v12, Ln3/c$a;->o:Ln3/c$a;

    .line 325
    .line 326
    const/4 v14, 0x5

    .line 327
    if-ne v11, v14, :cond_d

    .line 328
    .line 329
    :goto_8
    move-object/from16 p1, v9

    .line 330
    .line 331
    const/4 v15, 0x6

    .line 332
    goto :goto_a

    .line 333
    :cond_d
    sget-object v12, Ln3/c$a;->p:Ln3/c$a;

    .line 334
    .line 335
    const/4 v15, 0x6

    .line 336
    if-ne v11, v15, :cond_e

    .line 337
    .line 338
    move-object/from16 p1, v9

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_e
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    const-string v12, "SQLiteEventStore"

    .line 346
    .line 347
    const-string v4, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"

    .line 348
    .line 349
    invoke-static {v12, v4, v11}, Lo3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    :goto_9
    move-object/from16 p1, v9

    .line 353
    .line 354
    move-object/from16 v12, p1

    .line 355
    .line 356
    :goto_a
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 357
    .line 358
    .line 359
    move-result-wide v8

    .line 360
    invoke-interface {v2, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-nez v11, :cond_f

    .line 365
    .line 366
    new-instance v11, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    :cond_f
    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    check-cast v10, Ljava/util/List;

    .line 379
    .line 380
    new-instance v11, Ln3/c;

    .line 381
    .line 382
    invoke-direct {v11, v8, v9, v12}, Ln3/c;-><init>(JLn3/c$a;)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-object/from16 v9, p1

    .line 389
    .line 390
    const/4 v4, 0x4

    .line 391
    const/4 v8, 0x1

    .line 392
    goto :goto_4

    .line 393
    :cond_10
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_11

    .line 406
    .line 407
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    check-cast v4, Ljava/util/Map$Entry;

    .line 412
    .line 413
    sget v5, Ln3/d;->c:I

    .line 414
    .line 415
    new-instance v5, Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    check-cast v5, Ljava/lang/String;

    .line 425
    .line 426
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    check-cast v4, Ljava/util/List;

    .line 431
    .line 432
    new-instance v7, Ln3/d;

    .line 433
    .line 434
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    invoke-direct {v7, v5, v4}, Ln3/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 439
    .line 440
    .line 441
    iget-object v4, v3, Ln3/a$a;->b:Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto :goto_b

    .line 447
    :cond_11
    iget-object v2, v0, Lr3/t;->b:Lt3/a;

    .line 448
    .line 449
    invoke-interface {v2}, Lt3/a;->a()J

    .line 450
    .line 451
    .line 452
    move-result-wide v4

    .line 453
    invoke-virtual {v0}, Lr3/t;->I()Landroid/database/sqlite/SQLiteDatabase;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 458
    .line 459
    .line 460
    :try_start_0
    new-array v6, v6, [Ljava/lang/String;

    .line 461
    .line 462
    const-string v7, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    .line 463
    .line 464
    invoke-virtual {v2, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    new-instance v7, Lr3/s;

    .line 469
    .line 470
    invoke-direct {v7, v4, v5}, Lr3/s;-><init>(J)V

    .line 471
    .line 472
    .line 473
    invoke-static {v6, v7}, Lr3/t;->k0(Landroid/database/Cursor;Lr3/t$a;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    check-cast v4, Ln3/f;

    .line 478
    .line 479
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 483
    .line 484
    .line 485
    iput-object v4, v3, Ln3/a$a;->a:Ln3/f;

    .line 486
    .line 487
    invoke-virtual {v0}, Lr3/t;->M()J

    .line 488
    .line 489
    .line 490
    move-result-wide v4

    .line 491
    invoke-virtual {v0}, Lr3/t;->I()Landroid/database/sqlite/SQLiteDatabase;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const-string v6, "PRAGMA page_size"

    .line 496
    .line 497
    invoke-virtual {v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 502
    .line 503
    .line 504
    move-result-wide v6

    .line 505
    mul-long/2addr v6, v4

    .line 506
    sget-object v2, Lr3/e;->a:Lr3/a;

    .line 507
    .line 508
    iget-wide v4, v2, Lr3/a;->b:J

    .line 509
    .line 510
    new-instance v2, Ln3/e;

    .line 511
    .line 512
    invoke-direct {v2, v6, v7, v4, v5}, Ln3/e;-><init>(JJ)V

    .line 513
    .line 514
    .line 515
    new-instance v4, Ln3/b;

    .line 516
    .line 517
    invoke-direct {v4, v2}, Ln3/b;-><init>(Ln3/e;)V

    .line 518
    .line 519
    .line 520
    iput-object v4, v3, Ln3/a$a;->c:Ln3/b;

    .line 521
    .line 522
    iget-object v0, v0, Lr3/t;->e:Lqb/a;

    .line 523
    .line 524
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, Ljava/lang/String;

    .line 529
    .line 530
    iput-object v0, v3, Ln3/a$a;->d:Ljava/lang/String;

    .line 531
    .line 532
    new-instance v0, Ln3/a;

    .line 533
    .line 534
    iget-object v2, v3, Ln3/a$a;->a:Ln3/f;

    .line 535
    .line 536
    iget-object v4, v3, Ln3/a$a;->b:Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    iget-object v5, v3, Ln3/a$a;->c:Ln3/b;

    .line 543
    .line 544
    iget-object v3, v3, Ln3/a$a;->d:Ljava/lang/String;

    .line 545
    .line 546
    invoke-direct {v0, v2, v4, v5, v3}, Ln3/a;-><init>(Ln3/f;Ljava/util/List;Ln3/b;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    return-object v0

    .line 550
    :catchall_0
    move-exception v0

    .line 551
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
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

.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    iget v0, p0, Lr3/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lr3/r;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/tasks/Task;

    .line 10
    .line 11
    iget-object v1, p0, Lr3/r;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lo9/b;

    .line 14
    .line 15
    iget-object v2, p0, Lr3/r;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Void;

    .line 20
    .line 21
    const-string p1, "$authToken"

    .line 22
    .line 23
    invoke-static {v0, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "this$0"

    .line 27
    .line 28
    invoke-static {v1, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "$appCheckToken"

    .line 32
    .line 33
    invoke-static {v2, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lo9/n;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, v1, Lo9/b;->b:Lt9/b;

    .line 45
    .line 46
    invoke-interface {v1}, Lt9/b;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ls9/a;

    .line 51
    .line 52
    invoke-interface {v1}, Ls9/a;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {p1, v0, v1, v2}, Lo9/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :goto_0
    iget-object v0, p0, Lr3/r;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 73
    .line 74
    iget-object v1, p0, Lr3/r;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, p0, Lr3/r;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lcom/google/firebase/messaging/a$a;

    .line 81
    .line 82
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->e(Landroid/content/Context;)Lcom/google/firebase/messaging/a;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->f()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v5, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:Laa/r;

    .line 95
    .line 96
    monitor-enter v5

    .line 97
    :try_start_0
    iget-object v6, v5, Laa/r;->b:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v6, :cond_0

    .line 100
    .line 101
    invoke-virtual {v5}, Laa/r;->d()V

    .line 102
    .line 103
    .line 104
    :cond_0
    iget-object v6, v5, Laa/r;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    .line 106
    monitor-exit v5

    .line 107
    monitor-enter v3

    .line 108
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    invoke-static {v7, v8, p1, v6}, Lcom/google/firebase/messaging/a$a;->a(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-nez v5, :cond_1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    iget-object v6, v3, Lcom/google/firebase/messaging/a;->a:Landroid/content/SharedPreferences;

    .line 120
    .line 121
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-static {v4, v1}, Lcom/google/firebase/messaging/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v6, v1, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 130
    .line 131
    .line 132
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    :goto_1
    monitor-exit v3

    .line 136
    if-eqz v2, :cond_2

    .line 137
    .line 138
    iget-object v1, v2, Lcom/google/firebase/messaging/a$a;->a:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_3

    .line 145
    .line 146
    :cond_2
    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->i(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :catchall_0
    move-exception p1

    .line 155
    monitor-exit v3

    .line 156
    throw p1

    .line 157
    :catchall_1
    move-exception p1

    .line 158
    monitor-exit v5

    .line 159
    throw p1

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
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
.end method
