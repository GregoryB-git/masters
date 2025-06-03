.class public final synthetic Lp3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/b$a;
.implements Lr3/t$a;
.implements Ln9/l;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lp3/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lp3/b;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr3/t;Lk3/n;Lk3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lp3/b;->a:Ljava/lang/Object;

    iput-object p3, p0, Lp3/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lp3/b;->c:Ljava/lang/Object;

    check-cast v0, Lp3/c;

    iget-object v1, p0, Lp3/b;->b:Ljava/lang/Object;

    check-cast v1, Lk3/s;

    iget-object v2, p0, Lp3/b;->a:Ljava/lang/Object;

    check-cast v2, Lk3/n;

    iget-object v3, v0, Lp3/c;->d:Lr3/d;

    invoke-interface {v3, v1, v2}, Lr3/d;->j(Lk3/s;Lk3/n;)Lr3/b;

    iget-object v0, v0, Lp3/c;->a:Lq3/n;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lq3/n;->b(Lk3/s;I)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lp3/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr3/t;

    .line 4
    .line 5
    iget-object v1, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lk3/n;

    .line 8
    .line 9
    iget-object v2, p0, Lp3/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lk3/s;

    .line 12
    .line 13
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    sget-object v3, Lr3/t;->f:Lh3/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Lr3/t;->M()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v0}, Lr3/t;->I()Landroid/database/sqlite/SQLiteDatabase;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v6, "PRAGMA page_size"

    .line 26
    .line 27
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    mul-long/2addr v5, v3

    .line 36
    iget-object v3, v0, Lr3/t;->d:Lr3/e;

    .line 37
    .line 38
    invoke-virtual {v3}, Lr3/e;->e()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    cmp-long v3, v5, v3

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-ltz v3, :cond_0

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v3, v4

    .line 51
    :goto_0
    if-eqz v3, :cond_1

    .line 52
    .line 53
    const-wide/16 v2, 0x1

    .line 54
    .line 55
    sget-object p1, Ln3/c$a;->d:Ln3/c$a;

    .line 56
    .line 57
    invoke-virtual {v1}, Lk3/n;->k()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v2, v3, p1, v1}, Lr3/t;->C(JLn3/c$a;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-wide/16 v0, -0x1

    .line 65
    .line 66
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_1
    invoke-static {p1, v2}, Lr3/t;->Q(Landroid/database/sqlite/SQLiteDatabase;Lk3/s;)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v6, 0x0

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    new-instance v3, Landroid/content/ContentValues;

    .line 85
    .line 86
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lk3/s;->b()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v8, "backend_name"

    .line 94
    .line 95
    invoke-virtual {v3, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lk3/s;->d()Lh3/e;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-static {v7}, Lu3/a;->a(Lh3/e;)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    const-string v8, "priority"

    .line 111
    .line 112
    invoke-virtual {v3, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const-string v8, "next_request_ms"

    .line 120
    .line 121
    invoke-virtual {v3, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lk3/s;->c()[B

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-eqz v7, :cond_3

    .line 129
    .line 130
    invoke-virtual {v2}, Lk3/s;->c()[B

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v2, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-string v7, "extras"

    .line 139
    .line 140
    invoke-virtual {v3, v7, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    const-string v2, "transport_contexts"

    .line 144
    .line 145
    invoke-virtual {p1, v2, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    :goto_1
    iget-object v0, v0, Lr3/t;->d:Lr3/e;

    .line 150
    .line 151
    invoke-virtual {v0}, Lr3/e;->d()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {v1}, Lk3/n;->d()Lk3/m;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    iget-object v7, v7, Lk3/m;->b:[B

    .line 160
    .line 161
    array-length v8, v7

    .line 162
    if-gt v8, v0, :cond_4

    .line 163
    .line 164
    move v8, v5

    .line 165
    goto :goto_2

    .line 166
    :cond_4
    move v8, v4

    .line 167
    :goto_2
    new-instance v9, Landroid/content/ContentValues;

    .line 168
    .line 169
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v3, "context_id"

    .line 177
    .line 178
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Lk3/n;->k()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const-string v3, "transport_name"

    .line 186
    .line 187
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Lk3/n;->e()J

    .line 191
    .line 192
    .line 193
    move-result-wide v2

    .line 194
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v3, "timestamp_ms"

    .line 199
    .line 200
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lk3/n;->l()J

    .line 204
    .line 205
    .line 206
    move-result-wide v2

    .line 207
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const-string v3, "uptime_ms"

    .line 212
    .line 213
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lk3/n;->d()Lk3/m;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    iget-object v2, v2, Lk3/m;->a:Lh3/c;

    .line 221
    .line 222
    iget-object v2, v2, Lh3/c;->a:Ljava/lang/String;

    .line 223
    .line 224
    const-string v3, "payload_encoding"

    .line 225
    .line 226
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lk3/n;->c()Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v3, "code"

    .line 234
    .line 235
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const-string v3, "num_attempts"

    .line 243
    .line 244
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const-string v3, "inline"

    .line 252
    .line 253
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 254
    .line 255
    .line 256
    if-eqz v8, :cond_5

    .line 257
    .line 258
    move-object v2, v7

    .line 259
    goto :goto_3

    .line 260
    :cond_5
    new-array v2, v4, [B

    .line 261
    .line 262
    :goto_3
    const-string v3, "payload"

    .line 263
    .line 264
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Lk3/n;->i()Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    const-string v3, "product_id"

    .line 272
    .line 273
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Lk3/n;->j()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const-string v3, "pseudonymous_id"

    .line 281
    .line 282
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Lk3/n;->f()[B

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const-string v3, "experiment_ids_clear_blob"

    .line 290
    .line 291
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Lk3/n;->g()[B

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const-string v3, "experiment_ids_encrypted_blob"

    .line 299
    .line 300
    invoke-virtual {v9, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 301
    .line 302
    .line 303
    const-string v2, "events"

    .line 304
    .line 305
    invoke-virtual {p1, v2, v6, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 306
    .line 307
    .line 308
    move-result-wide v2

    .line 309
    const-string v4, "event_id"

    .line 310
    .line 311
    if-nez v8, :cond_6

    .line 312
    .line 313
    array-length v8, v7

    .line 314
    int-to-double v8, v8

    .line 315
    int-to-double v10, v0

    .line 316
    div-double/2addr v8, v10

    .line 317
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 318
    .line 319
    .line 320
    move-result-wide v8

    .line 321
    double-to-int v8, v8

    .line 322
    :goto_4
    if-gt v5, v8, :cond_6

    .line 323
    .line 324
    add-int/lit8 v9, v5, -0x1

    .line 325
    .line 326
    mul-int/2addr v9, v0

    .line 327
    mul-int v10, v5, v0

    .line 328
    .line 329
    array-length v11, v7

    .line 330
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    invoke-static {v7, v9, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    new-instance v10, Landroid/content/ContentValues;

    .line 339
    .line 340
    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-virtual {v10, v4, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    const-string v12, "sequence_num"

    .line 355
    .line 356
    invoke-virtual {v10, v12, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 357
    .line 358
    .line 359
    const-string v11, "bytes"

    .line 360
    .line 361
    invoke-virtual {v10, v11, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 362
    .line 363
    .line 364
    const-string v9, "event_payloads"

    .line 365
    .line 366
    invoke-virtual {p1, v9, v6, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 367
    .line 368
    .line 369
    add-int/lit8 v5, v5, 0x1

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_6
    invoke-virtual {v1}, Lk3/n;->b()Ljava/util/Map;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-eqz v1, :cond_7

    .line 393
    .line 394
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Ljava/util/Map$Entry;

    .line 399
    .line 400
    new-instance v5, Landroid/content/ContentValues;

    .line 401
    .line 402
    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    invoke-virtual {v5, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    check-cast v7, Ljava/lang/String;

    .line 417
    .line 418
    const-string v8, "name"

    .line 419
    .line 420
    invoke-virtual {v5, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, Ljava/lang/String;

    .line 428
    .line 429
    const-string v7, "value"

    .line 430
    .line 431
    invoke-virtual {v5, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    const-string v1, "event_metadata"

    .line 435
    .line 436
    invoke-virtual {p1, v1, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 437
    .line 438
    .line 439
    goto :goto_5

    .line 440
    :cond_7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    :goto_6
    return-object p1
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
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

.method public final get()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lp3/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li9/n;

    .line 6
    .line 7
    iget-object v2, v0, Lp3/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lm9/d0;

    .line 10
    .line 11
    iget-object v3, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lj9/q;

    .line 14
    .line 15
    sget v4, Li9/n;->o:I

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v4, v2, Lm9/d0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ljava/util/Map;

    .line 23
    .line 24
    iget-object v5, v1, Li9/n;->a:Le9/a;

    .line 25
    .line 26
    invoke-virtual {v5}, Le9/a;->p()Li9/f0;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-interface {v5}, Li9/f0;->h()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_4

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Lm9/k0;

    .line 69
    .line 70
    iget-object v9, v1, Li9/n;->k:Landroid/util/SparseArray;

    .line 71
    .line 72
    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Li9/m1;

    .line 77
    .line 78
    if-nez v9, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iget-object v10, v1, Li9/n;->i:Li9/l1;

    .line 82
    .line 83
    iget-object v11, v7, Lm9/k0;->e:Lt8/e;

    .line 84
    .line 85
    invoke-interface {v10, v11, v8}, Li9/l1;->e(Lt8/e;I)V

    .line 86
    .line 87
    .line 88
    iget-object v10, v1, Li9/n;->i:Li9/l1;

    .line 89
    .line 90
    iget-object v11, v7, Lm9/k0;->c:Lt8/e;

    .line 91
    .line 92
    invoke-interface {v10, v11, v8}, Li9/l1;->b(Lt8/e;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v5, v6}, Li9/m1;->b(J)Li9/m1;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    iget-object v11, v2, Lm9/d0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v11, Ljava/util/Map;

    .line 102
    .line 103
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-interface {v11, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-eqz v11, :cond_1

    .line 112
    .line 113
    sget-object v11, Lma/h;->b:Lma/h$h;

    .line 114
    .line 115
    sget-object v15, Lj9/q;->b:Lj9/q;

    .line 116
    .line 117
    invoke-virtual {v10, v11, v15}, Li9/m1;->a(Lma/h;Lj9/q;)Li9/m1;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    new-instance v11, Li9/m1;

    .line 122
    .line 123
    iget-object v13, v10, Li9/m1;->a:Lg9/k0;

    .line 124
    .line 125
    iget v14, v10, Li9/m1;->b:I

    .line 126
    .line 127
    move-wide/from16 v22, v5

    .line 128
    .line 129
    move-object v6, v4

    .line 130
    iget-wide v4, v10, Li9/m1;->c:J

    .line 131
    .line 132
    iget-object v12, v10, Li9/m1;->d:Li9/e0;

    .line 133
    .line 134
    iget-object v0, v10, Li9/m1;->e:Lj9/q;

    .line 135
    .line 136
    iget-object v10, v10, Li9/m1;->g:Lma/h;

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    move-object/from16 v17, v12

    .line 141
    .line 142
    move-object v12, v11

    .line 143
    move-object/from16 v19, v15

    .line 144
    .line 145
    move-wide v15, v4

    .line 146
    move-object/from16 v18, v0

    .line 147
    .line 148
    move-object/from16 v20, v10

    .line 149
    .line 150
    invoke-direct/range {v12 .. v21}, Li9/m1;-><init>(Lg9/k0;IJLi9/e0;Lj9/q;Lj9/q;Lma/h;Ljava/lang/Integer;)V

    .line 151
    .line 152
    .line 153
    move-object v10, v11

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    move-wide/from16 v22, v5

    .line 156
    .line 157
    move-object v6, v4

    .line 158
    iget-object v0, v7, Lm9/k0;->a:Lma/h;

    .line 159
    .line 160
    invoke-virtual {v0}, Lma/h;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_2

    .line 165
    .line 166
    iget-object v0, v7, Lm9/k0;->a:Lma/h;

    .line 167
    .line 168
    iget-object v4, v2, Lm9/d0;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, Lj9/q;

    .line 171
    .line 172
    invoke-virtual {v10, v0, v4}, Li9/m1;->a(Lma/h;Lj9/q;)Li9/m1;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    :cond_2
    :goto_1
    iget-object v0, v1, Li9/n;->k:Landroid/util/SparseArray;

    .line 177
    .line 178
    invoke-virtual {v0, v8, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v9, v10, v7}, Li9/n;->e(Li9/m1;Li9/m1;Lm9/k0;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_3

    .line 186
    .line 187
    iget-object v0, v1, Li9/n;->i:Li9/l1;

    .line 188
    .line 189
    invoke-interface {v0, v10}, Li9/l1;->h(Li9/m1;)V

    .line 190
    .line 191
    .line 192
    :cond_3
    move-object/from16 v0, p0

    .line 193
    .line 194
    move-object v4, v6

    .line 195
    move-wide/from16 v5, v22

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_4
    iget-object v0, v2, Lm9/d0;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Ljava/util/Map;

    .line 202
    .line 203
    iget-object v2, v2, Lm9/d0;->e:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Ljava/util/Set;

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_6

    .line 220
    .line 221
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Lj9/i;

    .line 226
    .line 227
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_5

    .line 232
    .line 233
    iget-object v6, v1, Li9/n;->a:Le9/a;

    .line 234
    .line 235
    invoke-virtual {v6}, Le9/a;->p()Li9/f0;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-interface {v6, v5}, Li9/f0;->k(Lj9/i;)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_6
    invoke-virtual {v1, v0}, Li9/n;->d(Ljava/util/Map;)Li9/n$b;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget-object v2, v0, Li9/n$b;->a:Ljava/util/Map;

    .line 248
    .line 249
    iget-object v4, v1, Li9/n;->i:Li9/l1;

    .line 250
    .line 251
    invoke-interface {v4}, Li9/l1;->g()Lj9/q;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    sget-object v5, Lj9/q;->b:Lj9/q;

    .line 256
    .line 257
    invoke-virtual {v3, v5}, Lj9/q;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_8

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Lj9/q;->f(Lj9/q;)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    const/4 v6, 0x1

    .line 268
    const/4 v7, 0x0

    .line 269
    if-ltz v5, :cond_7

    .line 270
    .line 271
    move v5, v6

    .line 272
    goto :goto_3

    .line 273
    :cond_7
    move v5, v7

    .line 274
    :goto_3
    const/4 v8, 0x2

    .line 275
    new-array v8, v8, [Ljava/lang/Object;

    .line 276
    .line 277
    aput-object v3, v8, v7

    .line 278
    .line 279
    aput-object v4, v8, v6

    .line 280
    .line 281
    const-string v4, "Watch stream reverted to previous snapshot?? (%s < %s)"

    .line 282
    .line 283
    invoke-static {v4, v5, v8}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object v4, v1, Li9/n;->i:Li9/l1;

    .line 287
    .line 288
    invoke-interface {v4, v3}, Li9/l1;->j(Lj9/q;)V

    .line 289
    .line 290
    .line 291
    :cond_8
    iget-object v1, v1, Li9/n;->f:Li9/h;

    .line 292
    .line 293
    iget-object v0, v0, Li9/n$b;->b:Ljava/util/Set;

    .line 294
    .line 295
    invoke-virtual {v1, v2, v0}, Li9/h;->e(Ljava/util/Map;Ljava/util/Set;)Lt8/c;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0
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
