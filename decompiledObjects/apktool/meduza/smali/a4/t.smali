.class public final La4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/w;


# instance fields
.field public final a:Lt5/k$a;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLt5/s$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lx6/b;->q(Z)V

    iput-object p3, p0, La4/t;->a:Lt5/k$a;

    iput-object p1, p0, La4/t;->b:Ljava/lang/String;

    iput-boolean p2, p0, La4/t;->c:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La4/t;->d:Ljava/util/HashMap;

    return-void
.end method

.method public static c(Lt5/k$a;Ljava/lang/String;[BLjava/util/Map;)[B
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt5/k$a;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 1
    new-instance v1, Lt5/j0;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Lt5/k$a;->a()Lt5/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {v1, v0}, Lt5/j0;-><init>(Lt5/k;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v15, "The uri must be set."

    .line 18
    .line 19
    if-eqz v3, :cond_7

    .line 20
    .line 21
    new-instance v16, Lt5/n;

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v0, 0x0

    .line 29
    const/4 v6, 0x2

    .line 30
    const-wide/16 v11, -0x1

    .line 31
    .line 32
    const/4 v14, 0x1

    .line 33
    move-object/from16 v2, v16

    .line 34
    .line 35
    move-object/from16 v7, p2

    .line 36
    .line 37
    move-object/from16 v8, p3

    .line 38
    .line 39
    move-object/from16 v17, v15

    .line 40
    .line 41
    move-object v15, v0

    .line 42
    invoke-direct/range {v2 .. v15}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    move v4, v2

    .line 47
    move-object/from16 v3, v16

    .line 48
    .line 49
    :goto_0
    :try_start_0
    new-instance v5, Lt5/m;

    .line 50
    .line 51
    invoke-direct {v5, v1, v3}, Lt5/m;-><init>(Lt5/k;Lt5/n;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 52
    .line 53
    .line 54
    :try_start_1
    sget v0, Lv5/e0;->a:I

    .line 55
    .line 56
    const/16 v0, 0x1000

    .line 57
    .line 58
    new-array v0, v0, [B

    .line 59
    .line 60
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 61
    .line 62
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {v5, v0}, Lt5/m;->read([B)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const/4 v8, -0x1

    .line 70
    if-eq v7, v8, :cond_0

    .line 71
    .line 72
    invoke-virtual {v6, v0, v2, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :catch_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 82
    .line 83
    .line 84
    move-result-object v0
    :try_end_1
    .catch Lt5/z; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    invoke-static {v5}, Lv5/e0;->g(Ljava/io/Closeable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :goto_2
    :try_start_3
    iget v6, v0, Lt5/z;->d:I

    .line 90
    .line 91
    const/16 v7, 0x133

    .line 92
    .line 93
    if-eq v6, v7, :cond_1

    .line 94
    .line 95
    const/16 v7, 0x134

    .line 96
    .line 97
    if-ne v6, v7, :cond_2

    .line 98
    .line 99
    :cond_1
    const/4 v6, 0x5

    .line 100
    if-ge v4, v6, :cond_2

    .line 101
    .line 102
    const/4 v6, 0x1

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    move v6, v2

    .line 105
    :goto_3
    const/4 v7, 0x0

    .line 106
    if-nez v6, :cond_3

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_3
    iget-object v6, v0, Lt5/z;->e:Ljava/util/Map;

    .line 110
    .line 111
    if-eqz v6, :cond_4

    .line 112
    .line 113
    const-string v8, "Location"

    .line 114
    .line 115
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ljava/util/List;

    .line 120
    .line 121
    if-eqz v6, :cond_4

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-nez v8, :cond_4

    .line 128
    .line 129
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    move-object v7, v6

    .line 134
    check-cast v7, Ljava/lang/String;

    .line 135
    .line 136
    :cond_4
    :goto_4
    if-eqz v7, :cond_6

    .line 137
    .line 138
    add-int/lit8 v4, v4, 0x1

    .line 139
    .line 140
    iget-wide v8, v3, Lt5/n;->b:J

    .line 141
    .line 142
    iget v0, v3, Lt5/n;->c:I

    .line 143
    .line 144
    iget-object v6, v3, Lt5/n;->d:[B

    .line 145
    .line 146
    iget-object v10, v3, Lt5/n;->e:Ljava/util/Map;

    .line 147
    .line 148
    iget-wide v11, v3, Lt5/n;->f:J

    .line 149
    .line 150
    iget-wide v13, v3, Lt5/n;->g:J

    .line 151
    .line 152
    iget-object v15, v3, Lt5/n;->h:Ljava/lang/String;

    .line 153
    .line 154
    iget v2, v3, Lt5/n;->i:I

    .line 155
    .line 156
    iget-object v3, v3, Lt5/n;->j:Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 159
    .line 160
    .line 161
    move-result-object v19

    .line 162
    if-eqz v19, :cond_5

    .line 163
    .line 164
    new-instance v7, Lt5/n;

    .line 165
    .line 166
    move-object/from16 v18, v7

    .line 167
    .line 168
    move-wide/from16 v20, v8

    .line 169
    .line 170
    move/from16 v22, v0

    .line 171
    .line 172
    move-object/from16 v23, v6

    .line 173
    .line 174
    move-object/from16 v24, v10

    .line 175
    .line 176
    move-wide/from16 v25, v11

    .line 177
    .line 178
    move-wide/from16 v27, v13

    .line 179
    .line 180
    move-object/from16 v29, v15

    .line 181
    .line 182
    move/from16 v30, v2

    .line 183
    .line 184
    move-object/from16 v31, v3

    .line 185
    .line 186
    invoke-direct/range {v18 .. v31}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 187
    .line 188
    .line 189
    :try_start_4
    invoke-static {v5}, Lv5/e0;->g(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 190
    .line 191
    .line 192
    move-object v3, v7

    .line 193
    const/4 v2, 0x0

    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_5
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    move-object/from16 v2, v17

    .line 199
    .line 200
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v0

    .line 204
    :cond_6
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 205
    :goto_5
    :try_start_6
    invoke-static {v5}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 209
    :catch_1
    move-exception v0

    .line 210
    move-object v10, v0

    .line 211
    new-instance v0, La4/x;

    .line 212
    .line 213
    iget-object v6, v1, Lt5/j0;->c:Landroid/net/Uri;

    .line 214
    .line 215
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lt5/j0;->h()Ljava/util/Map;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    iget-wide v8, v1, Lt5/j0;->b:J

    .line 223
    .line 224
    move-object v4, v0

    .line 225
    move-object/from16 v5, v16

    .line 226
    .line 227
    invoke-direct/range {v4 .. v10}, La4/x;-><init>(Lt5/n;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_7
    move-object v2, v15

    .line 232
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 233
    .line 234
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0
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
.end method


# virtual methods
.method public final a(La4/o$d;)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, La4/o$d;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "&signedRequest="

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, La4/o$d;->a:[B

    .line 17
    .line 18
    invoke-static {p1}, Lv5/e0;->n([B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, La4/t;->a:Lt5/k$a;

    .line 30
    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v0, p1, v2, v1}, La4/t;->c(Lt5/k$a;Ljava/lang/String;[BLjava/util/Map;)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method public final b(Ljava/util/UUID;La4/o$a;)[B
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, La4/o$a;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, v1, La4/t;->c:Z

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v3, v1, La4/t;->b:Ljava/lang/String;

    .line 20
    .line 21
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_5

    .line 26
    .line 27
    new-instance v4, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v5, Lv3/h;->e:Ljava/util/UUID;

    .line 33
    .line 34
    invoke-virtual {v5, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    const-string v6, "text/xml"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    sget-object v6, Lv3/h;->c:Ljava/util/UUID;

    .line 44
    .line 45
    invoke-virtual {v6, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    const-string v6, "application/json"

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const-string v6, "application/octet-stream"

    .line 55
    .line 56
    :goto_0
    const-string v7, "Content-Type"

    .line 57
    .line 58
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    const-string v0, "SOAPAction"

    .line 68
    .line 69
    const-string v5, "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"

    .line 70
    .line 71
    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-object v5, v1, La4/t;->d:Ljava/util/HashMap;

    .line 75
    .line 76
    monitor-enter v5

    .line 77
    :try_start_0
    iget-object v0, v1, La4/t;->d:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    iget-object v0, v1, La4/t;->a:Lt5/k$a;

    .line 84
    .line 85
    iget-object v2, v2, La4/o$a;->a:[B

    .line 86
    .line 87
    invoke-static {v0, v3, v2, v4}, La4/t;->c(Lt5/k$a;Ljava/lang/String;[BLjava/util/Map;)[B

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    throw v0

    .line 95
    :cond_5
    new-instance v0, La4/x;

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    const-wide/16 v9, 0x0

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    const-wide/16 v4, 0x0

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const-wide/16 v11, -0x1

    .line 111
    .line 112
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    new-instance v16, Lt5/n;

    .line 117
    .line 118
    move-object/from16 v2, v16

    .line 119
    .line 120
    invoke-direct/range {v2 .. v15}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object v8, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 124
    .line 125
    sget-object v9, Lo7/m0;->o:Lo7/m0;

    .line 126
    .line 127
    const-wide/16 v10, 0x0

    .line 128
    .line 129
    new-instance v12, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v2, "No license URL"

    .line 132
    .line 133
    invoke-direct {v12, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v6, v0

    .line 137
    move-object/from16 v7, v16

    .line 138
    .line 139
    invoke-direct/range {v6 .. v12}, La4/x;-><init>(Lt5/n;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v2, "The uri must be set."

    .line 146
    .line 147
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v0
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
