.class Lokhttp3/internal/http1/Http1Codec$ChunkedSource;
.super Lokhttp3/internal/http1/Http1Codec$AbstractSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1Codec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ChunkedSource"
.end annotation


# instance fields
.field public final e:Lokhttp3/HttpUrl;

.field public f:J

.field public o:Z

.field public final synthetic p:Lokhttp3/internal/http1/Http1Codec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1Codec;Lokhttp3/HttpUrl;)V
    .locals 2

    iput-object p1, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->p:Lokhttp3/internal/http1/Http1Codec;

    invoke-direct {p0, p1}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;-><init>(Lokhttp3/internal/http1/Http1Codec;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->o:Z

    iput-object p2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->e:Lokhttp3/HttpUrl;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->o:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    const/16 v1, 0x64

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :try_start_0
    invoke-static {p0, v1, v0}, Lokhttp3/internal/Util;->s(Lxc/y;ILjava/util/concurrent/TimeUnit;)Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move v0, v2

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0, v2}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->f(Ljava/io/IOException;Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->b:Z

    .line 29
    .line 30
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final e0(Lxc/f;J)J
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-ltz v2, :cond_a

    .line 6
    .line 7
    iget-boolean v2, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->b:Z

    .line 8
    .line 9
    if-nez v2, :cond_9

    .line 10
    .line 11
    iget-boolean v2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->o:Z

    .line 12
    .line 13
    const-wide/16 v3, -0x1

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-wide v3

    .line 18
    :cond_0
    iget-wide v5, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 19
    .line 20
    cmp-long v2, v5, v0

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    cmp-long v2, v5, v3

    .line 26
    .line 27
    if-nez v2, :cond_6

    .line 28
    .line 29
    :cond_1
    cmp-long v2, v5, v3

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->p:Lokhttp3/internal/http1/Http1Codec;

    .line 34
    .line 35
    iget-object v2, v2, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 36
    .line 37
    invoke-interface {v2}, Lxc/h;->f0()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    :cond_2
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->p:Lokhttp3/internal/http1/Http1Codec;

    .line 41
    .line 42
    iget-object v2, v2, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 43
    .line 44
    invoke-interface {v2}, Lxc/h;->x0()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    iput-wide v5, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 49
    .line 50
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->p:Lokhttp3/internal/http1/Http1Codec;

    .line 51
    .line 52
    iget-object v2, v2, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 53
    .line 54
    invoke-interface {v2}, Lxc/h;->f0()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-wide v5, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 63
    .line 64
    cmp-long v5, v5, v0

    .line 65
    .line 66
    if-ltz v5, :cond_8

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_3

    .line 73
    .line 74
    const-string v5, ";"

    .line 75
    .line 76
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    if-eqz v5, :cond_8

    .line 81
    .line 82
    :cond_3
    iget-wide v5, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 83
    .line 84
    cmp-long v0, v5, v0

    .line 85
    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    iput-boolean v7, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->o:Z

    .line 89
    .line 90
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->p:Lokhttp3/internal/http1/Http1Codec;

    .line 91
    .line 92
    iget-object v1, v0, Lokhttp3/internal/http1/Http1Codec;->a:Lokhttp3/OkHttpClient;

    .line 93
    .line 94
    iget-object v1, v1, Lokhttp3/OkHttpClient;->q:Lokhttp3/CookieJar;

    .line 95
    .line 96
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->e:Lokhttp3/HttpUrl;

    .line 97
    .line 98
    new-instance v5, Lokhttp3/Headers$Builder;

    .line 99
    .line 100
    invoke-direct {v5}, Lokhttp3/Headers$Builder;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_0
    iget-object v6, v0, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 104
    .line 105
    iget-wide v8, v0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 106
    .line 107
    invoke-interface {v6, v8, v9}, Lxc/h;->E(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-wide v8, v0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    int-to-long v10, v10

    .line 118
    sub-long/2addr v8, v10

    .line 119
    iput-wide v8, v0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    sget-object v8, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 128
    .line 129
    invoke-virtual {v8, v5, v6}, Lokhttp3/internal/Internal;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    new-instance v0, Lokhttp3/Headers;

    .line 134
    .line 135
    invoke-direct {v0, v5}, Lokhttp3/Headers;-><init>(Lokhttp3/Headers$Builder;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v2, v0}, Lokhttp3/internal/http/HttpHeaders;->d(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x1

    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p0, v1, v0}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->f(Ljava/io/IOException;Z)V

    .line 144
    .line 145
    .line 146
    :cond_5
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->o:Z

    .line 147
    .line 148
    if-nez v0, :cond_6

    .line 149
    .line 150
    return-wide v3

    .line 151
    :cond_6
    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 152
    .line 153
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 154
    .line 155
    .line 156
    move-result-wide p2

    .line 157
    invoke-super {p0, p1, p2, p3}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->e0(Lxc/f;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide p1

    .line 161
    cmp-long p3, p1, v3

    .line 162
    .line 163
    if-eqz p3, :cond_7

    .line 164
    .line 165
    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 166
    .line 167
    sub-long/2addr v0, p1

    .line 168
    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 169
    .line 170
    return-wide p1

    .line 171
    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    .line 172
    .line 173
    const-string p2, "unexpected end of stream"

    .line 174
    .line 175
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1, v7}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->f(Ljava/io/IOException;Z)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_8
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    .line 183
    .line 184
    new-instance p2, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string p3, "expected chunk size and optional extensions but was \""

    .line 190
    .line 191
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;->f:J

    .line 195
    .line 196
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string p3, "\""

    .line 203
    .line 204
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 215
    :catch_0
    move-exception p1

    .line 216
    new-instance p2, Ljava/net/ProtocolException;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p2

    .line 226
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    const-string p2, "closed"

    .line 229
    .line 230
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    const-string v0, "byteCount < 0: "

    .line 237
    .line 238
    invoke-static {v0, p2, p3}, La0/j;->i(Ljava/lang/String;J)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1
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
