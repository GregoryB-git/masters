.class Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http2/Http2Reader$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/Http2Connection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ReaderRunnable"
.end annotation


# instance fields
.field public final b:Lokhttp3/internal/http2/Http2Reader;

.field public final synthetic c:Lokhttp3/internal/http2/Http2Connection;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V
    .locals 2

    iput-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Reader;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(IILxc/h;Z)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    iget-object v3, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    and-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    move v5, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v5, v3

    .line 25
    :goto_0
    if-eqz v5, :cond_2

    .line 26
    .line 27
    iget-object v9, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 28
    .line 29
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v6, Lxc/f;

    .line 33
    .line 34
    invoke-direct {v6}, Lxc/f;-><init>()V

    .line 35
    .line 36
    .line 37
    int-to-long v10, v7

    .line 38
    invoke-interface {v2, v10, v11}, Lxc/h;->u0(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v6, v10, v11}, Lxc/y;->e0(Lxc/f;J)J

    .line 42
    .line 43
    .line 44
    iget-wide v12, v6, Lxc/f;->b:J

    .line 45
    .line 46
    cmp-long v2, v12, v10

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    new-instance v10, Lokhttp3/internal/http2/Http2Connection$6;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    new-array v5, v2, [Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v2, v9, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 56
    .line 57
    aput-object v2, v5, v3

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    aput-object v2, v5, v4

    .line 64
    .line 65
    move-object v2, v10

    .line 66
    move-object v3, v9

    .line 67
    move-object v4, v5

    .line 68
    move/from16 v5, p1

    .line 69
    .line 70
    move/from16 v7, p2

    .line 71
    .line 72
    move/from16 v8, p4

    .line 73
    .line 74
    invoke-direct/range {v2 .. v8}, Lokhttp3/internal/http2/Http2Connection$6;-><init>(Lokhttp3/internal/http2/Http2Connection;[Ljava/lang/Object;ILxc/f;IZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v10}, Lokhttp3/internal/http2/Http2Connection;->H(Lokhttp3/internal/NamedRunnable;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 82
    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-wide v3, v6, Lxc/f;->b:J

    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v3, " != "

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_2
    iget-object v5, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 110
    .line 111
    invoke-virtual {v5, v0}, Lokhttp3/internal/http2/Http2Connection;->C(I)Lokhttp3/internal/http2/Http2Stream;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    if-nez v5, :cond_3

    .line 116
    .line 117
    iget-object v3, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 118
    .line 119
    sget-object v4, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;

    .line 120
    .line 121
    invoke-virtual {v3, v0, v4}, Lokhttp3/internal/http2/Http2Connection;->h0(ILokhttp3/internal/http2/ErrorCode;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 125
    .line 126
    int-to-long v3, v7

    .line 127
    invoke-virtual {v0, v3, v4}, Lokhttp3/internal/http2/Http2Connection;->b0(J)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v2, v3, v4}, Lxc/h;->skip(J)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    iget-object v0, v5, Lokhttp3/internal/http2/Http2Stream;->g:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 135
    .line 136
    int-to-long v6, v7

    .line 137
    :cond_4
    :goto_1
    const-wide/16 v8, 0x0

    .line 138
    .line 139
    cmp-long v10, v6, v8

    .line 140
    .line 141
    if-lez v10, :cond_d

    .line 142
    .line 143
    iget-object v10, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 144
    .line 145
    monitor-enter v10

    .line 146
    :try_start_0
    iget-boolean v11, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->e:Z

    .line 147
    .line 148
    iget-object v12, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->b:Lxc/f;

    .line 149
    .line 150
    iget-wide v12, v12, Lxc/f;->b:J

    .line 151
    .line 152
    add-long/2addr v12, v6

    .line 153
    iget-wide v14, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->c:J

    .line 154
    .line 155
    cmp-long v12, v12, v14

    .line 156
    .line 157
    if-lez v12, :cond_5

    .line 158
    .line 159
    move v12, v4

    .line 160
    goto :goto_2

    .line 161
    :cond_5
    move v12, v3

    .line 162
    :goto_2
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 163
    if-eqz v12, :cond_7

    .line 164
    .line 165
    invoke-interface {v2, v6, v7}, Lxc/h;->skip(J)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 169
    .line 170
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->e:Lokhttp3/internal/http2/ErrorCode;

    .line 171
    .line 172
    invoke-virtual {v0, v2}, Lokhttp3/internal/http2/Http2Stream;->d(Lokhttp3/internal/http2/ErrorCode;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_6
    iget-object v3, v0, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 180
    .line 181
    iget v0, v0, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 182
    .line 183
    invoke-virtual {v3, v0, v2}, Lokhttp3/internal/http2/Http2Connection;->h0(ILokhttp3/internal/http2/ErrorCode;)V

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_7
    if-eqz v11, :cond_8

    .line 188
    .line 189
    invoke-interface {v2, v6, v7}, Lxc/h;->skip(J)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    iget-object v10, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->a:Lxc/f;

    .line 194
    .line 195
    invoke-interface {v2, v10, v6, v7}, Lxc/y;->e0(Lxc/f;J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v10

    .line 199
    const-wide/16 v12, -0x1

    .line 200
    .line 201
    cmp-long v12, v10, v12

    .line 202
    .line 203
    if-eqz v12, :cond_c

    .line 204
    .line 205
    sub-long/2addr v6, v10

    .line 206
    iget-object v10, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 207
    .line 208
    monitor-enter v10

    .line 209
    :try_start_1
    iget-boolean v11, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->d:Z

    .line 210
    .line 211
    if-eqz v11, :cond_9

    .line 212
    .line 213
    iget-object v11, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->a:Lxc/f;

    .line 214
    .line 215
    iget-wide v12, v11, Lxc/f;->b:J

    .line 216
    .line 217
    invoke-virtual {v11}, Lxc/f;->f()V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    iget-object v11, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->b:Lxc/f;

    .line 222
    .line 223
    iget-wide v12, v11, Lxc/f;->b:J

    .line 224
    .line 225
    cmp-long v12, v12, v8

    .line 226
    .line 227
    if-nez v12, :cond_a

    .line 228
    .line 229
    move v12, v4

    .line 230
    goto :goto_3

    .line 231
    :cond_a
    move v12, v3

    .line 232
    :goto_3
    iget-object v13, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->a:Lxc/f;

    .line 233
    .line 234
    invoke-virtual {v11, v13}, Lxc/f;->A0(Lxc/y;)J

    .line 235
    .line 236
    .line 237
    if-eqz v12, :cond_b

    .line 238
    .line 239
    iget-object v11, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 240
    .line 241
    invoke-virtual {v11}, Ljava/lang/Object;->notifyAll()V

    .line 242
    .line 243
    .line 244
    :cond_b
    move-wide v12, v8

    .line 245
    :goto_4
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    cmp-long v8, v12, v8

    .line 247
    .line 248
    if-lez v8, :cond_4

    .line 249
    .line 250
    iget-object v8, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 251
    .line 252
    iget-object v8, v8, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 253
    .line 254
    invoke-virtual {v8, v12, v13}, Lokhttp3/internal/http2/Http2Connection;->b0(J)V

    .line 255
    .line 256
    .line 257
    goto :goto_1

    .line 258
    :catchall_0
    move-exception v0

    .line 259
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 260
    throw v0

    .line 261
    :cond_c
    new-instance v0, Ljava/io/EOFException;

    .line 262
    .line 263
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :catchall_1
    move-exception v0

    .line 268
    :try_start_3
    monitor-exit v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 269
    throw v0

    .line 270
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    :goto_5
    if-eqz p4, :cond_e

    .line 274
    .line 275
    monitor-enter v5

    .line 276
    :try_start_4
    iget-object v0, v5, Lokhttp3/internal/http2/Http2Stream;->g:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 277
    .line 278
    iput-boolean v4, v0, Lokhttp3/internal/http2/Http2Stream$FramingSource;->e:Z

    .line 279
    .line 280
    invoke-virtual {v5}, Lokhttp3/internal/http2/Http2Stream;->f()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V

    .line 285
    .line 286
    .line 287
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 288
    if-nez v0, :cond_e

    .line 289
    .line 290
    iget-object v0, v5, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 291
    .line 292
    iget v2, v5, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 293
    .line 294
    invoke-virtual {v0, v2}, Lokhttp3/internal/http2/Http2Connection;->I(I)Lokhttp3/internal/http2/Http2Stream;

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :catchall_2
    move-exception v0

    .line 299
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 300
    throw v0

    .line 301
    :cond_e
    :goto_6
    return-void
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

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 7
    .line 8
    iget-wide v1, p1, Lokhttp3/internal/http2/Http2Connection;->y:J

    .line 9
    .line 10
    add-long/2addr v1, p2

    .line 11
    iput-wide v1, p1, Lokhttp3/internal/http2/Http2Connection;->y:J

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p1

    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Lokhttp3/internal/http2/Http2Connection;->C(I)Lokhttp3/internal/http2/Http2Stream;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_1
    iget-wide v0, p1, Lokhttp3/internal/http2/Http2Stream;->b:J

    .line 29
    .line 30
    add-long/2addr v0, p2

    .line 31
    iput-wide v0, p1, Lokhttp3/internal/http2/Http2Stream;->b:J

    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    cmp-long p2, p2, v0

    .line 36
    .line 37
    if-lez p2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 40
    .line 41
    .line 42
    :cond_1
    monitor-exit p1

    .line 43
    goto :goto_0

    .line 44
    :catchall_1
    move-exception p2

    .line 45
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    throw p2

    .line 47
    :cond_2
    :goto_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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

.method public final e(IIZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_3

    .line 2
    .line 3
    iget-object p3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 4
    .line 5
    monitor-enter p3

    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 12
    .line 13
    iget-wide v2, p1, Lokhttp3/internal/http2/Http2Connection;->t:J

    .line 14
    .line 15
    add-long/2addr v2, v0

    .line 16
    iput-wide v2, p1, Lokhttp3/internal/http2/Http2Connection;->t:J

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x2

    .line 20
    if-ne p1, p2, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 23
    .line 24
    iget-wide v2, p1, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 25
    .line 26
    add-long/2addr v2, v0

    .line 27
    iput-wide v2, p1, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p2, 0x3

    .line 31
    if-ne p1, p2, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    monitor-exit p3

    .line 45
    goto :goto_2

    .line 46
    :goto_1
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_3
    :try_start_1
    iget-object p3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 49
    .line 50
    iget-object v0, p3, Lokhttp3/internal/http2/Http2Connection;->p:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 51
    .line 52
    new-instance v1, Lokhttp3/internal/http2/Http2Connection$PingRunnable;

    .line 53
    .line 54
    invoke-direct {v1, p3, p1, p2}, Lokhttp3/internal/http2/Http2Connection$PingRunnable;-><init>(Lokhttp3/internal/http2/Http2Connection;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    .line 60
    :catch_0
    :goto_2
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
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
.end method

.method public final f(Lokhttp3/internal/http2/Settings;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection;->p:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 4
    .line 5
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    new-array v3, v3, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 12
    .line 13
    aput-object v0, v3, v4

    .line 14
    .line 15
    invoke-direct {v2, p0, v3, p1}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;-><init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;[Ljava/lang/Object;Lokhttp3/internal/http2/Settings;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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

.method public final g(ILokhttp3/internal/http2/ErrorCode;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v0

    .line 17
    :goto_0
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 20
    .line 21
    new-instance v3, Lokhttp3/internal/http2/Http2Connection$7;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    new-array v4, v4, [Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v5, v2, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 27
    .line 28
    aput-object v5, v4, v0

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    aput-object v0, v4, v1

    .line 35
    .line 36
    invoke-direct {v3, v2, v4, p1, p2}, Lokhttp3/internal/http2/Http2Connection$7;-><init>(Lokhttp3/internal/http2/Http2Connection;[Ljava/lang/Object;ILokhttp3/internal/http2/ErrorCode;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lokhttp3/internal/http2/Http2Connection;->H(Lokhttp3/internal/NamedRunnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lokhttp3/internal/http2/Http2Connection;->I(I)Lokhttp3/internal/http2/Http2Stream;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    monitor-enter p1

    .line 52
    :try_start_0
    iget-object v0, p1, Lokhttp3/internal/http2/Http2Stream;->k:Lokhttp3/internal/http2/ErrorCode;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iput-object p2, p1, Lokhttp3/internal/http2/Http2Stream;->k:Lokhttp3/internal/http2/ErrorCode;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_2
    monitor-exit p1

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p2

    .line 64
    monitor-exit p1

    .line 65
    throw p2

    .line 66
    :cond_3
    :goto_1
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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

.method public final h(ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection;->E:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object p2, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lokhttp3/internal/http2/Http2Connection;->h0(ILokhttp3/internal/http2/ErrorCode;)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection;->E:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :try_start_1
    new-instance v1, Lokhttp3/internal/http2/Http2Connection$4;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    new-array v2, v2, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 40
    .line 41
    aput-object v4, v2, v3

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    aput-object v4, v2, v3

    .line 49
    .line 50
    invoke-direct {v1, v0, v2, p1, p2}, Lokhttp3/internal/http2/Http2Connection$4;-><init>(Lokhttp3/internal/http2/Http2Connection;[Ljava/lang/Object;ILjava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lokhttp3/internal/http2/Http2Connection;->H(Lokhttp3/internal/NamedRunnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    .line 55
    .line 56
    :catch_0
    :goto_0
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw p1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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

.method public final i(ILxc/i;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lxc/i;->i()I

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 5
    .line 6
    monitor-enter p2

    .line 7
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 8
    .line 9
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 16
    .line 17
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-array v1, v1, [Lokhttp3/internal/http2/Http2Stream;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, [Lokhttp3/internal/http2/Http2Stream;

    .line 30
    .line 31
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    iput-boolean v2, v1, Lokhttp3/internal/http2/Http2Connection;->o:Z

    .line 35
    .line 36
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    array-length p2, v0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-ge v1, p2, :cond_2

    .line 40
    .line 41
    aget-object v2, v0, v1

    .line 42
    .line 43
    iget v3, v2, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 44
    .line 45
    if-le v3, p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Lokhttp3/internal/http2/Http2Stream;->e()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->f:Lokhttp3/internal/http2/ErrorCode;

    .line 54
    .line 55
    monitor-enter v2

    .line 56
    :try_start_1
    iget-object v4, v2, Lokhttp3/internal/http2/Http2Stream;->k:Lokhttp3/internal/http2/ErrorCode;

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    iput-object v3, v2, Lokhttp3/internal/http2/Http2Stream;->k:Lokhttp3/internal/http2/ErrorCode;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_0
    monitor-exit v2

    .line 66
    iget-object v3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 67
    .line 68
    iget v2, v2, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Lokhttp3/internal/http2/Http2Connection;->I(I)Lokhttp3/internal/http2/Http2Stream;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    monitor-exit v2

    .line 76
    throw p1

    .line 77
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-void

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    throw p1
    .line 84
    .line 85
    .line 86
    .line 87
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

.method public final j(ILjava/util/ArrayList;Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v0

    .line 17
    :goto_0
    const/4 v3, 0x2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :try_start_0
    new-instance v10, Lokhttp3/internal/http2/Http2Connection$5;

    .line 26
    .line 27
    new-array v6, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v3, v2, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 30
    .line 31
    aput-object v3, v6, v0

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    aput-object v0, v6, v1

    .line 38
    .line 39
    move-object v4, v10

    .line 40
    move-object v5, v2

    .line 41
    move v7, p1

    .line 42
    move-object v8, p2

    .line 43
    move v9, p3

    .line 44
    invoke-direct/range {v4 .. v9}, Lokhttp3/internal/http2/Http2Connection$5;-><init>(Lokhttp3/internal/http2/Http2Connection;[Ljava/lang/Object;ILjava/util/ArrayList;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v10}, Lokhttp3/internal/http2/Http2Connection;->H(Lokhttp3/internal/NamedRunnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    return-void

    .line 51
    :cond_1
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_1
    iget-object v4, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 55
    .line 56
    invoke-virtual {v4, p1}, Lokhttp3/internal/http2/Http2Connection;->C(I)Lokhttp3/internal/http2/Http2Stream;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    iget-object v4, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 63
    .line 64
    iget-boolean v5, v4, Lokhttp3/internal/http2/Http2Connection;->o:Z

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    monitor-exit v2

    .line 69
    return-void

    .line 70
    :cond_2
    iget v5, v4, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 71
    .line 72
    if-gt p1, v5, :cond_3

    .line 73
    .line 74
    monitor-exit v2

    .line 75
    return-void

    .line 76
    :cond_3
    rem-int/lit8 v5, p1, 0x2

    .line 77
    .line 78
    iget v4, v4, Lokhttp3/internal/http2/Http2Connection;->f:I

    .line 79
    .line 80
    rem-int/2addr v4, v3

    .line 81
    if-ne v5, v4, :cond_4

    .line 82
    .line 83
    monitor-exit v2

    .line 84
    return-void

    .line 85
    :cond_4
    invoke-static {p2}, Lokhttp3/internal/Util;->w(Ljava/util/ArrayList;)Lokhttp3/Headers;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    new-instance p2, Lokhttp3/internal/http2/Http2Stream;

    .line 90
    .line 91
    iget-object v6, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    move-object v4, p2

    .line 95
    move v5, p1

    .line 96
    move v8, p3

    .line 97
    invoke-direct/range {v4 .. v9}, Lokhttp3/internal/http2/Http2Stream;-><init>(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V

    .line 98
    .line 99
    .line 100
    iget-object p3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 101
    .line 102
    iput p1, p3, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 103
    .line 104
    iget-object p3, p3, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {p3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object p3, Lokhttp3/internal/http2/Http2Connection;->F:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 114
    .line 115
    new-instance v4, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$1;

    .line 116
    .line 117
    new-array v3, v3, [Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v5, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 120
    .line 121
    iget-object v5, v5, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 122
    .line 123
    aput-object v5, v3, v0

    .line 124
    .line 125
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    aput-object p1, v3, v1

    .line 130
    .line 131
    invoke-direct {v4, p0, v3, p2}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$1;-><init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;[Ljava/lang/Object;Lokhttp3/internal/http2/Http2Stream;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    monitor-exit v2

    .line 138
    return-void

    .line 139
    :catchall_0
    move-exception p1

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    monitor-enter v4

    .line 143
    :try_start_2
    iput-boolean v1, v4, Lokhttp3/internal/http2/Http2Stream;->f:Z

    .line 144
    .line 145
    iget-object p1, v4, Lokhttp3/internal/http2/Http2Stream;->e:Ljava/util/ArrayDeque;

    .line 146
    .line 147
    invoke-static {p2}, Lokhttp3/internal/Util;->w(Ljava/util/ArrayList;)Lokhttp3/Headers;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Lokhttp3/internal/http2/Http2Stream;->f()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    .line 159
    .line 160
    .line 161
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 162
    if-nez p1, :cond_6

    .line 163
    .line 164
    iget-object p1, v4, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 165
    .line 166
    iget p2, v4, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/Http2Connection;->I(I)Lokhttp3/internal/http2/Http2Stream;

    .line 169
    .line 170
    .line 171
    :cond_6
    if-eqz p3, :cond_7

    .line 172
    .line 173
    monitor-enter v4

    .line 174
    :try_start_3
    iget-object p1, v4, Lokhttp3/internal/http2/Http2Stream;->g:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 175
    .line 176
    iput-boolean v1, p1, Lokhttp3/internal/http2/Http2Stream$FramingSource;->e:Z

    .line 177
    .line 178
    invoke-virtual {v4}, Lokhttp3/internal/http2/Http2Stream;->f()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    .line 183
    .line 184
    .line 185
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 186
    if-nez p1, :cond_7

    .line 187
    .line 188
    iget-object p1, v4, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 189
    .line 190
    iget p2, v4, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 191
    .line 192
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/Http2Connection;->I(I)Lokhttp3/internal/http2/Http2Stream;

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :catchall_1
    move-exception p1

    .line 197
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    throw p1

    .line 199
    :cond_7
    :goto_1
    return-void

    .line 200
    :catchall_2
    move-exception p1

    .line 201
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 202
    throw p1

    .line 203
    :goto_2
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 204
    throw p1
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
.end method

.method public final k()V
    .locals 4

    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Reader;

    invoke-virtual {v1, p0}, Lokhttp3/internal/http2/Http2Reader;->C(Lokhttp3/internal/http2/Http2Reader$Handler;)V

    :goto_0
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Reader;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0}, Lokhttp3/internal/http2/Http2Reader;->g(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->b:Lokhttp3/internal/http2/ErrorCode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->o:Lokhttp3/internal/http2/ErrorCode;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    invoke-virtual {v2, v1, v0}, Lokhttp3/internal/http2/Http2Connection;->f(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception v2

    move-object v1, v0

    goto :goto_2

    :catch_0
    move-object v1, v0

    :catch_1
    :try_start_3
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    invoke-virtual {v1, v0, v0}, Lokhttp3/internal/http2/Http2Connection;->f(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Reader;

    invoke-static {v0}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v2

    :goto_2
    :try_start_5
    iget-object v3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    invoke-virtual {v3, v1, v0}, Lokhttp3/internal/http2/Http2Connection;->f(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Reader;

    invoke-static {v0}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    throw v2
.end method
