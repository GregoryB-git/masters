.class public final Ljb/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lxc/h;

.field public final b:Ljb/f$a;

.field public final c:Ljb/e$a;


# direct methods
.method public constructor <init>(Lxc/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/f$c;->a:Lxc/h;

    new-instance v0, Ljb/f$a;

    invoke-direct {v0, p1}, Ljb/f$a;-><init>(Lxc/s;)V

    iput-object v0, p0, Ljb/f$c;->b:Ljb/f$a;

    new-instance p1, Ljb/e$a;

    invoke-direct {p1, v0}, Ljb/e$a;-><init>(Ljb/f$a;)V

    iput-object p1, p0, Ljb/f$c;->c:Ljb/e$a;

    return-void
.end method


# virtual methods
.method public final C(Ljb/b$a;IBI)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p4, :cond_c

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v1

    .line 13
    :goto_0
    and-int/lit8 v4, p3, 0x8

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, Ljb/f$c;->a:Lxc/h;

    .line 18
    .line 19
    invoke-interface {v4}, Lxc/h;->readByte()B

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    and-int/lit16 v4, v4, 0xff

    .line 24
    .line 25
    int-to-short v4, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v4, v1

    .line 28
    :goto_1
    and-int/lit8 v5, p3, 0x20

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    iget-object v5, p0, Ljb/f$c;->a:Lxc/h;

    .line 33
    .line 34
    invoke-interface {v5}, Lxc/h;->readInt()I

    .line 35
    .line 36
    .line 37
    iget-object v5, p0, Ljb/f$c;->a:Lxc/h;

    .line 38
    .line 39
    invoke-interface {v5}, Lxc/h;->readByte()B

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    add-int/lit8 p2, p2, -0x5

    .line 46
    .line 47
    :cond_2
    invoke-static {p2, p3, v4}, Ljb/f;->c(IBS)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-virtual {p0, p2, v4, p3, p4}, Ljb/f$c;->g(ISBI)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p1, Lhb/i$d;

    .line 56
    .line 57
    iget-object p3, p1, Lhb/i$d;->a:Lhb/j;

    .line 58
    .line 59
    invoke-virtual {p3}, Lhb/j;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    iget-object v4, p3, Lhb/j;->a:Ljava/util/logging/Logger;

    .line 66
    .line 67
    iget-object p3, p3, Lhb/j;->b:Ljava/util/logging/Level;

    .line 68
    .line 69
    new-instance v5, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, La0/j;->u(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v6, " HEADERS: streamId="

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v6, " headers="

    .line 90
    .line 91
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v6, " endStream="

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v4, p3, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    iget-object p3, p1, Lhb/i$d;->d:Lhb/i;

    .line 113
    .line 114
    iget p3, p3, Lhb/i;->M:I

    .line 115
    .line 116
    const v4, 0x7fffffff

    .line 117
    .line 118
    .line 119
    if-eq p3, v4, :cond_6

    .line 120
    .line 121
    const-wide/16 v4, 0x0

    .line 122
    .line 123
    move p3, v1

    .line 124
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-ge p3, v6, :cond_4

    .line 129
    .line 130
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Ljb/d;

    .line 135
    .line 136
    iget-object v7, v6, Ljb/d;->a:Lxc/i;

    .line 137
    .line 138
    invoke-virtual {v7}, Lxc/i;->i()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    add-int/lit8 v7, v7, 0x20

    .line 143
    .line 144
    iget-object v6, v6, Ljb/d;->b:Lxc/i;

    .line 145
    .line 146
    invoke-virtual {v6}, Lxc/i;->i()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    add-int/2addr v6, v7

    .line 151
    int-to-long v6, v6

    .line 152
    add-long/2addr v4, v6

    .line 153
    add-int/lit8 p3, p3, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    const-wide/32 v6, 0x7fffffff

    .line 157
    .line 158
    .line 159
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 160
    .line 161
    .line 162
    move-result-wide v4

    .line 163
    long-to-int p3, v4

    .line 164
    iget-object v4, p1, Lhb/i$d;->d:Lhb/i;

    .line 165
    .line 166
    iget v4, v4, Lhb/i;->M:I

    .line 167
    .line 168
    if-le p3, v4, :cond_6

    .line 169
    .line 170
    sget-object v0, Leb/e1;->k:Leb/e1;

    .line 171
    .line 172
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 173
    .line 174
    const-string v6, "Response %s metadata larger than %d: %d"

    .line 175
    .line 176
    const/4 v7, 0x3

    .line 177
    new-array v7, v7, [Ljava/lang/Object;

    .line 178
    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    const-string v8, "trailer"

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    const-string v8, "header"

    .line 185
    .line 186
    :goto_3
    aput-object v8, v7, v1

    .line 187
    .line 188
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    aput-object v4, v7, v3

    .line 193
    .line 194
    const/4 v4, 0x2

    .line 195
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    aput-object p3, v7, v4

    .line 200
    .line 201
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    invoke-virtual {v0, p3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :cond_6
    iget-object p3, p1, Lhb/i$d;->d:Lhb/i;

    .line 210
    .line 211
    iget-object p3, p3, Lhb/i;->k:Ljava/lang/Object;

    .line 212
    .line 213
    monitor-enter p3

    .line 214
    :try_start_0
    iget-object v4, p1, Lhb/i$d;->d:Lhb/i;

    .line 215
    .line 216
    iget-object v4, v4, Lhb/i;->n:Ljava/util/HashMap;

    .line 217
    .line 218
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Lhb/h;

    .line 227
    .line 228
    if-nez v4, :cond_8

    .line 229
    .line 230
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 231
    .line 232
    invoke-virtual {p2, p4}, Lhb/i;->p(I)Z

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    if-eqz p2, :cond_7

    .line 237
    .line 238
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 239
    .line 240
    iget-object p2, p2, Lhb/i;->i:Lhb/b;

    .line 241
    .line 242
    sget-object v0, Ljb/a;->f:Ljb/a;

    .line 243
    .line 244
    invoke-virtual {p2, p4, v0}, Lhb/b;->R(ILjb/a;)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :catchall_0
    move-exception p1

    .line 249
    goto :goto_5

    .line 250
    :cond_7
    move v1, v3

    .line 251
    goto :goto_4

    .line 252
    :cond_8
    if-nez v0, :cond_9

    .line 253
    .line 254
    iget-object v0, v4, Lhb/h;->l:Lhb/h$b;

    .line 255
    .line 256
    iget-object v0, v0, Lhb/h$b;->J:Lpb/c;

    .line 257
    .line 258
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v0, v4, Lhb/h;->l:Lhb/h$b;

    .line 264
    .line 265
    invoke-virtual {v0, p2, v2}, Lhb/h$b;->q(Ljava/util/ArrayList;Z)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_9
    if-nez v2, :cond_a

    .line 270
    .line 271
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 272
    .line 273
    iget-object p2, p2, Lhb/i;->i:Lhb/b;

    .line 274
    .line 275
    sget-object v2, Ljb/a;->q:Ljb/a;

    .line 276
    .line 277
    invoke-virtual {p2, p4, v2}, Lhb/b;->R(ILjb/a;)V

    .line 278
    .line 279
    .line 280
    :cond_a
    iget-object p2, v4, Lhb/h;->l:Lhb/h$b;

    .line 281
    .line 282
    new-instance v2, Leb/s0;

    .line 283
    .line 284
    invoke-direct {v2}, Leb/s0;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p2, v2, v0, v1}, Lgb/a$b;->i(Leb/s0;Leb/e1;Z)V

    .line 288
    .line 289
    .line 290
    :goto_4
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    if-eqz v1, :cond_b

    .line 292
    .line 293
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 294
    .line 295
    new-instance p2, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string p3, "Received header for unknown stream: "

    .line 301
    .line 302
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    invoke-static {p1, p2}, Lhb/i;->i(Lhb/i;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :cond_b
    return-void

    .line 316
    :goto_5
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 317
    throw p1

    .line 318
    :cond_c
    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 319
    .line 320
    new-array p2, v1, [Ljava/lang/Object;

    .line 321
    .line 322
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    throw v0
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

.method public final H(Ljb/b$a;IBI)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/16 v3, 0x8

    .line 5
    .line 6
    if-ne p2, v3, :cond_7

    .line 7
    .line 8
    if-nez p4, :cond_6

    .line 9
    .line 10
    iget-object p2, p0, Ljb/f$c;->a:Lxc/h;

    .line 11
    .line 12
    invoke-interface {p2}, Lxc/h;->readInt()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object p4, p0, Ljb/f$c;->a:Lxc/h;

    .line 17
    .line 18
    invoke-interface {p4}, Lxc/h;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    and-int/2addr p3, v0

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    move p3, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p3, v2

    .line 28
    :goto_0
    check-cast p1, Lhb/i$d;

    .line 29
    .line 30
    int-to-long v3, p2

    .line 31
    const/16 v5, 0x20

    .line 32
    .line 33
    shl-long/2addr v3, v5

    .line 34
    int-to-long v5, p4

    .line 35
    const-wide v7, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v5, v7

    .line 41
    or-long/2addr v3, v5

    .line 42
    iget-object v5, p1, Lhb/i$d;->a:Lhb/j;

    .line 43
    .line 44
    invoke-virtual {v5, v0, v3, v4}, Lhb/j;->d(IJ)V

    .line 45
    .line 46
    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    iget-object p3, p1, Lhb/i$d;->d:Lhb/i;

    .line 50
    .line 51
    iget-object p3, p3, Lhb/i;->k:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter p3

    .line 54
    :try_start_0
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 55
    .line 56
    iget-object p1, p1, Lhb/i;->i:Lhb/b;

    .line 57
    .line 58
    invoke-virtual {p1, p2, p4, v0}, Lhb/b;->e(IIZ)V

    .line 59
    .line 60
    .line 61
    monitor-exit p3

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p1

    .line 67
    :cond_1
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 68
    .line 69
    iget-object p2, p2, Lhb/i;->k:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter p2

    .line 72
    :try_start_1
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 73
    .line 74
    iget-object p3, p1, Lhb/i;->x:Lgb/b1;

    .line 75
    .line 76
    if-eqz p3, :cond_3

    .line 77
    .line 78
    iget-wide v5, p3, Lgb/b1;->a:J

    .line 79
    .line 80
    cmp-long p4, v5, v3

    .line 81
    .line 82
    if-nez p4, :cond_2

    .line 83
    .line 84
    iput-object v1, p1, Lhb/i;->x:Lgb/b1;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    sget-object p1, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 88
    .line 89
    sget-object p3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 90
    .line 91
    sget-object p4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 92
    .line 93
    const-string v7, "Received unexpected ping ack. Expecting %d, got %d"

    .line 94
    .line 95
    const/4 v8, 0x2

    .line 96
    new-array v8, v8, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    aput-object v5, v8, v2

    .line 103
    .line 104
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    aput-object v2, v8, v0

    .line 109
    .line 110
    invoke-static {p4, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    invoke-virtual {p1, p3, p4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    sget-object p1, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 119
    .line 120
    const-string p3, "Received unexpected ping ack. No ping outstanding"

    .line 121
    .line 122
    invoke-virtual {p1, p3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    move-object p3, v1

    .line 126
    :goto_2
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 127
    if-eqz p3, :cond_5

    .line 128
    .line 129
    monitor-enter p3

    .line 130
    :try_start_2
    iget-boolean p1, p3, Lgb/b1;->d:Z

    .line 131
    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    monitor-exit p3

    .line 135
    goto :goto_4

    .line 136
    :cond_4
    iput-boolean v0, p3, Lgb/b1;->d:Z

    .line 137
    .line 138
    iget-object p1, p3, Lgb/b1;->b:Ln7/p;

    .line 139
    .line 140
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ln7/p;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 143
    .line 144
    .line 145
    move-result-wide p1

    .line 146
    iput-wide p1, p3, Lgb/b1;->f:J

    .line 147
    .line 148
    iget-object p4, p3, Lgb/b1;->c:Ljava/util/LinkedHashMap;

    .line 149
    .line 150
    iput-object v1, p3, Lgb/b1;->c:Ljava/util/LinkedHashMap;

    .line 151
    .line 152
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 153
    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result p4

    .line 165
    if-eqz p4, :cond_5

    .line 166
    .line 167
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p4

    .line 171
    check-cast p4, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 178
    .line 179
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    check-cast p4, Lgb/u$a;

    .line 184
    .line 185
    new-instance v1, Lgb/z0;

    .line 186
    .line 187
    invoke-direct {v1, p4, p1, p2}, Lgb/z0;-><init>(Lgb/u$a;J)V

    .line 188
    .line 189
    .line 190
    :try_start_3
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :catchall_1
    move-exception p4

    .line 195
    sget-object v0, Lgb/b1;->g:Ljava/util/logging/Logger;

    .line 196
    .line 197
    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 198
    .line 199
    const-string v2, "Failed to execute PingCallback"

    .line 200
    .line 201
    invoke-virtual {v0, v1, v2, p4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catchall_2
    move-exception p1

    .line 206
    :try_start_4
    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 207
    throw p1

    .line 208
    :cond_5
    :goto_4
    return-void

    .line 209
    :catchall_3
    move-exception p1

    .line 210
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 211
    throw p1

    .line 212
    :cond_6
    const-string p1, "TYPE_PING streamId != 0"

    .line 213
    .line 214
    new-array p2, v2, [Ljava/lang/Object;

    .line 215
    .line 216
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_7
    const-string p1, "TYPE_PING length != 8: %s"

    .line 221
    .line 222
    new-array p3, v0, [Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    aput-object p2, p3, v2

    .line 229
    .line 230
    invoke-static {p1, p3}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    throw v1
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
.end method

.method public final I(Ljb/b$a;IBI)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_2

    .line 3
    .line 4
    and-int/lit8 v1, p3, 0x8

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ljb/f$c;->a:Lxc/h;

    .line 9
    .line 10
    invoke-interface {v0}, Lxc/h;->readByte()B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    int-to-short v0, v0

    .line 17
    :cond_0
    iget-object v1, p0, Ljb/f$c;->a:Lxc/h;

    .line 18
    .line 19
    invoke-interface {v1}, Lxc/h;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const v2, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v1, v2

    .line 27
    add-int/lit8 p2, p2, -0x4

    .line 28
    .line 29
    invoke-static {p2, p3, v0}, Ljb/f;->c(IBS)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-virtual {p0, p2, v0, p3, p4}, Ljb/f$c;->g(ISBI)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p1, Lhb/i$d;

    .line 38
    .line 39
    iget-object p3, p1, Lhb/i$d;->a:Lhb/j;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p3}, Lhb/j;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p3, Lhb/j;->a:Ljava/util/logging/Logger;

    .line 49
    .line 50
    iget-object p3, p3, Lhb/j;->b:Ljava/util/logging/Level;

    .line 51
    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, La0/j;->u(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, " PUSH_PROMISE: streamId="

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, " promisedStreamId="

    .line 73
    .line 74
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, " headers="

    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {v2, p3, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 96
    .line 97
    iget-object p2, p2, Lhb/i;->k:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter p2

    .line 100
    :try_start_0
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 101
    .line 102
    iget-object p1, p1, Lhb/i;->i:Lhb/b;

    .line 103
    .line 104
    sget-object p3, Ljb/a;->c:Ljb/a;

    .line 105
    .line 106
    invoke-virtual {p1, p4, p3}, Lhb/b;->R(ILjb/a;)V

    .line 107
    .line 108
    .line 109
    monitor-exit p2

    .line 110
    return-void

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    throw p1

    .line 114
    :cond_2
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 115
    .line 116
    new-array p2, v0, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    throw p1
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

.method public final M(Ljb/b$a;II)V
    .locals 10

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x1

    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v4, 0x4

    .line 5
    if-ne p2, v4, :cond_8

    .line 6
    .line 7
    if-eqz p3, :cond_7

    .line 8
    .line 9
    iget-object v4, p0, Ljb/f$c;->a:Lxc/h;

    .line 10
    .line 11
    invoke-interface {v4}, Lxc/h;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-static {}, Ljb/a;->values()[Ljb/a;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    array-length v6, v5

    .line 20
    move v7, v1

    .line 21
    :goto_0
    if-ge v7, v6, :cond_1

    .line 22
    .line 23
    aget-object v8, v5, v7

    .line 24
    .line 25
    iget v9, v8, Ljb/a;->a:I

    .line 26
    .line 27
    if-ne v9, v4, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v8, v3

    .line 34
    :goto_1
    if-eqz v8, :cond_6

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lhb/i$d;

    .line 38
    .line 39
    iget-object v4, v3, Lhb/i$d;->a:Lhb/j;

    .line 40
    .line 41
    invoke-virtual {v4, v2, p3, v8}, Lhb/j;->e(IILjb/a;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v8}, Lhb/i;->x(Ljb/a;)Leb/e1;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "Rst Stream"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Leb/e1;->a(Ljava/lang/String;)Leb/e1;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v5, v4, Leb/e1;->a:Leb/e1$a;

    .line 55
    .line 56
    sget-object v6, Leb/e1$a;->d:Leb/e1$a;

    .line 57
    .line 58
    if-eq v5, v6, :cond_3

    .line 59
    .line 60
    sget-object v6, Leb/e1$a;->o:Leb/e1$a;

    .line 61
    .line 62
    if-ne v5, v6, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v5, v1

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    :goto_2
    move v5, v2

    .line 68
    :goto_3
    iget-object v1, v3, Lhb/i$d;->d:Lhb/i;

    .line 69
    .line 70
    iget-object v9, v1, Lhb/i;->k:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v9

    .line 73
    :try_start_0
    iget-object v1, v3, Lhb/i$d;->d:Lhb/i;

    .line 74
    .line 75
    iget-object v1, v1, Lhb/i;->n:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lhb/h;

    .line 86
    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    iget-object v1, v1, Lhb/h;->l:Lhb/h$b;

    .line 90
    .line 91
    iget-object v1, v1, Lhb/h$b;->J:Lpb/c;

    .line 92
    .line 93
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v1, v3, Lhb/i$d;->d:Lhb/i;

    .line 99
    .line 100
    sget-object v2, Ljb/a;->p:Ljb/a;

    .line 101
    .line 102
    if-ne v8, v2, :cond_4

    .line 103
    .line 104
    sget-object v2, Lgb/t$a;->b:Lgb/t$a;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    sget-object v2, Lgb/t$a;->a:Lgb/t$a;

    .line 108
    .line 109
    :goto_4
    move-object v6, v2

    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    move v2, p3

    .line 113
    move-object v3, v4

    .line 114
    move-object v4, v6

    .line 115
    move-object v6, v7

    .line 116
    move-object v7, v8

    .line 117
    invoke-virtual/range {v1 .. v7}, Lhb/i;->l(ILeb/e1;Lgb/t$a;ZLjb/a;Leb/s0;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    monitor-exit v9

    .line 121
    return-void

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    throw v0

    .line 125
    :cond_6
    const-string v0, "TYPE_RST_STREAM unexpected error code: %d"

    .line 126
    .line 127
    new-array v2, v2, [Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    aput-object v4, v2, v1

    .line 134
    .line 135
    invoke-static {v0, v2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    throw v3

    .line 139
    :cond_7
    const-string v0, "TYPE_RST_STREAM streamId == 0"

    .line 140
    .line 141
    new-array v1, v1, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v0, v1}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    throw v3

    .line 147
    :cond_8
    const-string v0, "TYPE_RST_STREAM length: %d != 4"

    .line 148
    .line 149
    new-array v2, v2, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    aput-object v4, v2, v1

    .line 156
    .line 157
    invoke-static {v0, v2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    throw v3
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

.method public final Q(Ljb/b$a;IBI)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p4, :cond_10

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    and-int/2addr p3, p4

    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 16
    .line 17
    new-array p2, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :cond_1
    rem-int/lit8 p3, p2, 0x6

    .line 24
    .line 25
    if-nez p3, :cond_f

    .line 26
    .line 27
    new-instance p3, Lc4/x;

    .line 28
    .line 29
    invoke-direct {p3}, Lc4/x;-><init>()V

    .line 30
    .line 31
    .line 32
    move v2, v0

    .line 33
    :goto_0
    const/4 v3, 0x7

    .line 34
    const/4 v4, 0x4

    .line 35
    if-ge v2, p2, :cond_6

    .line 36
    .line 37
    iget-object v5, p0, Ljb/f$c;->a:Lxc/h;

    .line 38
    .line 39
    invoke-interface {v5}, Lxc/h;->readShort()S

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    iget-object v6, p0, Ljb/f$c;->a:Lxc/h;

    .line 44
    .line 45
    invoke-interface {v6}, Lxc/h;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    packed-switch v5, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :pswitch_0
    const/16 v3, 0x4000

    .line 54
    .line 55
    if-lt v6, v3, :cond_2

    .line 56
    .line 57
    const v3, 0xffffff

    .line 58
    .line 59
    .line 60
    if-gt v6, v3, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    .line 64
    .line 65
    new-array p2, p4, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    aput-object p3, p2, v0

    .line 72
    .line 73
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :pswitch_1
    if-ltz v6, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 81
    .line 82
    new-array p2, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :pswitch_2
    move v3, v4

    .line 89
    goto :goto_2

    .line 90
    :pswitch_3
    if-eqz v6, :cond_5

    .line 91
    .line 92
    if-ne v6, p4, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 96
    .line 97
    new-array p2, v0, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_5
    :goto_1
    :pswitch_4
    move v3, v5

    .line 104
    :goto_2
    invoke-virtual {p3, v3, v6}, Lc4/x;->d(II)V

    .line 105
    .line 106
    .line 107
    :goto_3
    add-int/lit8 v2, v2, 0x6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    check-cast p1, Lhb/i$d;

    .line 111
    .line 112
    iget-object p2, p1, Lhb/i$d;->a:Lhb/j;

    .line 113
    .line 114
    invoke-virtual {p2, p4, p3}, Lhb/j;->f(ILc4/x;)V

    .line 115
    .line 116
    .line 117
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 118
    .line 119
    iget-object v2, p2, Lhb/i;->k:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-enter v2

    .line 122
    :try_start_0
    invoke-virtual {p3, v4}, Lc4/x;->a(I)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_7

    .line 127
    .line 128
    iget-object p2, p3, Lc4/x;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p2, [I

    .line 131
    .line 132
    aget p2, p2, v4

    .line 133
    .line 134
    iget-object v4, p1, Lhb/i$d;->d:Lhb/i;

    .line 135
    .line 136
    iput p2, v4, Lhb/i;->D:I

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_0
    move-exception p1

    .line 140
    goto/16 :goto_9

    .line 141
    .line 142
    :cond_7
    :goto_4
    invoke-virtual {p3, v3}, Lc4/x;->a(I)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    iget-object p2, p3, Lc4/x;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p2, [I

    .line 151
    .line 152
    aget p2, p2, v3

    .line 153
    .line 154
    iget-object v3, p1, Lhb/i$d;->d:Lhb/i;

    .line 155
    .line 156
    iget-object v3, v3, Lhb/i;->j:Lhb/p;

    .line 157
    .line 158
    invoke-virtual {v3, p2}, Lhb/p;->b(I)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    goto :goto_5

    .line 163
    :cond_8
    move p2, v0

    .line 164
    :goto_5
    iget-boolean v3, p1, Lhb/i$d;->c:Z

    .line 165
    .line 166
    if-eqz v3, :cond_9

    .line 167
    .line 168
    iget-object v3, p1, Lhb/i$d;->d:Lhb/i;

    .line 169
    .line 170
    iget-object v4, v3, Lhb/i;->h:Lgb/h2$a;

    .line 171
    .line 172
    iget-object v5, v3, Lhb/i;->u:Leb/a;

    .line 173
    .line 174
    invoke-interface {v4, v5}, Lgb/h2$a;->c(Leb/a;)Leb/a;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iput-object v4, v3, Lhb/i;->u:Leb/a;

    .line 179
    .line 180
    iget-object v3, p1, Lhb/i$d;->d:Lhb/i;

    .line 181
    .line 182
    iget-object v3, v3, Lhb/i;->h:Lgb/h2$a;

    .line 183
    .line 184
    invoke-interface {v3}, Lgb/h2$a;->b()V

    .line 185
    .line 186
    .line 187
    iput-boolean v0, p1, Lhb/i$d;->c:Z

    .line 188
    .line 189
    :cond_9
    iget-object v3, p1, Lhb/i$d;->d:Lhb/i;

    .line 190
    .line 191
    iget-object v3, v3, Lhb/i;->i:Lhb/b;

    .line 192
    .line 193
    invoke-virtual {v3, p3}, Lhb/b;->L(Lc4/x;)V

    .line 194
    .line 195
    .line 196
    if-eqz p2, :cond_a

    .line 197
    .line 198
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 199
    .line 200
    iget-object p2, p2, Lhb/i;->j:Lhb/p;

    .line 201
    .line 202
    invoke-virtual {p2}, Lhb/p;->d()V

    .line 203
    .line 204
    .line 205
    :cond_a
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 206
    .line 207
    invoke-virtual {p1}, Lhb/i;->u()Z

    .line 208
    .line 209
    .line 210
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    iget p1, p3, Lc4/x;->a:I

    .line 212
    .line 213
    and-int/lit8 p2, p1, 0x2

    .line 214
    .line 215
    const/4 v2, -0x1

    .line 216
    if-eqz p2, :cond_b

    .line 217
    .line 218
    iget-object p2, p3, Lc4/x;->d:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p2, [I

    .line 221
    .line 222
    aget p2, p2, p4

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_b
    move p2, v2

    .line 226
    :goto_6
    if-ltz p2, :cond_e

    .line 227
    .line 228
    iget-object p2, p0, Ljb/f$c;->c:Ljb/e$a;

    .line 229
    .line 230
    and-int/lit8 p1, p1, 0x2

    .line 231
    .line 232
    if-eqz p1, :cond_c

    .line 233
    .line 234
    iget-object p1, p3, Lc4/x;->d:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p1, [I

    .line 237
    .line 238
    aget p1, p1, p4

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_c
    move p1, v2

    .line 242
    :goto_7
    iput p1, p2, Ljb/e$a;->c:I

    .line 243
    .line 244
    iput p1, p2, Ljb/e$a;->d:I

    .line 245
    .line 246
    iget p3, p2, Ljb/e$a;->h:I

    .line 247
    .line 248
    if-ge p1, p3, :cond_e

    .line 249
    .line 250
    if-nez p1, :cond_d

    .line 251
    .line 252
    iget-object p1, p2, Ljb/e$a;->e:[Ljb/d;

    .line 253
    .line 254
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    iget-object p1, p2, Ljb/e$a;->e:[Ljb/d;

    .line 258
    .line 259
    array-length p1, p1

    .line 260
    add-int/2addr p1, v2

    .line 261
    iput p1, p2, Ljb/e$a;->f:I

    .line 262
    .line 263
    iput v0, p2, Ljb/e$a;->g:I

    .line 264
    .line 265
    iput v0, p2, Ljb/e$a;->h:I

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_d
    sub-int/2addr p3, p1

    .line 269
    invoke-virtual {p2, p3}, Ljb/e$a;->a(I)I

    .line 270
    .line 271
    .line 272
    :cond_e
    :goto_8
    return-void

    .line 273
    :goto_9
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    throw p1

    .line 275
    :cond_f
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    .line 276
    .line 277
    new-array p3, p4, [Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    aput-object p2, p3, v0

    .line 284
    .line 285
    invoke-static {p1, p3}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    throw v1

    .line 289
    :cond_10
    const-string p1, "TYPE_SETTINGS streamId != 0"

    .line 290
    .line 291
    new-array p2, v0, [Ljava/lang/Object;

    .line 292
    .line 293
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
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

.method public final b0(Ljb/b$a;II)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x4

    .line 5
    if-ne p2, v3, :cond_7

    .line 6
    .line 7
    iget-object p2, p0, Ljb/f$c;->a:Lxc/h;

    .line 8
    .line 9
    invoke-interface {p2}, Lxc/h;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    int-to-long v3, p2

    .line 14
    const-wide/32 v5, 0x7fffffff

    .line 15
    .line 16
    .line 17
    and-long/2addr v3, v5

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmp-long p2, v3, v5

    .line 21
    .line 22
    if-eqz p2, :cond_6

    .line 23
    .line 24
    check-cast p1, Lhb/i$d;

    .line 25
    .line 26
    sget-object v10, Ljb/a;->c:Ljb/a;

    .line 27
    .line 28
    iget-object v5, p1, Lhb/i$d;->a:Lhb/j;

    .line 29
    .line 30
    invoke-virtual {v5, v0, p3, v3, v4}, Lhb/j;->g(IIJ)V

    .line 31
    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    const-string p2, "Received 0 flow control window increment."

    .line 36
    .line 37
    if-nez p3, :cond_0

    .line 38
    .line 39
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    iget-object v5, p1, Lhb/i$d;->d:Lhb/i;

    .line 43
    .line 44
    sget-object p1, Leb/e1;->m:Leb/e1;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    sget-object v8, Lgb/t$a;->a:Lgb/t$a;

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    move v6, p3

    .line 55
    invoke-virtual/range {v5 .. v11}, Lhb/i;->l(ILeb/e1;Lgb/t$a;ZLjb/a;Leb/s0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_1
    iget-object p2, p1, Lhb/i$d;->d:Lhb/i;

    .line 60
    .line 61
    iget-object p2, p2, Lhb/i;->k:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter p2

    .line 64
    if-nez p3, :cond_2

    .line 65
    .line 66
    :try_start_0
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 67
    .line 68
    iget-object p1, p1, Lhb/i;->j:Lhb/p;

    .line 69
    .line 70
    long-to-int p3, v3

    .line 71
    invoke-virtual {p1, v1, p3}, Lhb/p;->c(Lhb/p$b;I)V

    .line 72
    .line 73
    .line 74
    monitor-exit p2

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    iget-object v1, p1, Lhb/i$d;->d:Lhb/i;

    .line 77
    .line 78
    iget-object v1, v1, Lhb/i;->n:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lhb/h;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    iget-object v0, p1, Lhb/i$d;->d:Lhb/i;

    .line 93
    .line 94
    iget-object v0, v0, Lhb/i;->j:Lhb/p;

    .line 95
    .line 96
    iget-object v1, v1, Lhb/h;->l:Lhb/h$b;

    .line 97
    .line 98
    iget-object v5, v1, Lhb/h$b;->x:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 101
    :try_start_1
    iget-object v1, v1, Lhb/h$b;->K:Lhb/p$b;

    .line 102
    .line 103
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    long-to-int v3, v3

    .line 105
    :try_start_2
    invoke-virtual {v0, v1, v3}, Lhb/p;->c(Lhb/p$b;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    :try_start_4
    throw p1

    .line 112
    :cond_3
    iget-object v1, p1, Lhb/i$d;->d:Lhb/i;

    .line 113
    .line 114
    invoke-virtual {v1, p3}, Lhb/i;->p(I)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    :goto_0
    move v0, v2

    .line 122
    :goto_1
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    iget-object p1, p1, Lhb/i$d;->d:Lhb/i;

    .line 126
    .line 127
    const-string p2, "Received window_update for unknown stream: "

    .line 128
    .line 129
    invoke-static {p2, p3}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    :goto_2
    invoke-static {p1, p2}, Lhb/i;->i(Lhb/i;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_3
    return-void

    .line 137
    :catchall_1
    move-exception p1

    .line 138
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 139
    throw p1

    .line 140
    :cond_6
    const-string p1, "windowSizeIncrement was 0"

    .line 141
    .line 142
    new-array p2, v2, [Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {p1, p2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :cond_7
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: %s"

    .line 149
    .line 150
    new-array p3, v0, [Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    aput-object p2, p3, v2

    .line 157
    .line 158
    invoke-static {p1, p3}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    throw v1
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

.method public final close()V
    .locals 1

    iget-object v0, p0, Ljb/f$c;->a:Lxc/h;

    invoke-interface {v0}, Lxc/y;->close()V

    return-void
.end method

.method public final f(Ljb/b$a;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, v1, Ljb/f$c;->a:Lxc/h;

    .line 7
    .line 8
    const-wide/16 v4, 0x9

    .line 9
    .line 10
    invoke-interface {v3, v4, v5}, Lxc/h;->u0(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    iget-object v3, v1, Ljb/f$c;->a:Lxc/h;

    .line 14
    .line 15
    invoke-interface {v3}, Lxc/h;->readByte()B

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    and-int/lit16 v4, v4, 0xff

    .line 20
    .line 21
    shl-int/lit8 v4, v4, 0x10

    .line 22
    .line 23
    invoke-interface {v3}, Lxc/h;->readByte()B

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    and-int/lit16 v5, v5, 0xff

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    .line 31
    shl-int/2addr v5, v6

    .line 32
    or-int/2addr v4, v5

    .line 33
    invoke-interface {v3}, Lxc/h;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    and-int/lit16 v3, v3, 0xff

    .line 38
    .line 39
    or-int/2addr v3, v4

    .line 40
    const/4 v4, 0x1

    .line 41
    const/4 v5, 0x0

    .line 42
    if-ltz v3, :cond_15

    .line 43
    .line 44
    const/16 v7, 0x4000

    .line 45
    .line 46
    if-gt v3, v7, :cond_15

    .line 47
    .line 48
    iget-object v7, v1, Ljb/f$c;->a:Lxc/h;

    .line 49
    .line 50
    invoke-interface {v7}, Lxc/h;->readByte()B

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    and-int/lit16 v7, v7, 0xff

    .line 55
    .line 56
    int-to-byte v7, v7

    .line 57
    iget-object v8, v1, Ljb/f$c;->a:Lxc/h;

    .line 58
    .line 59
    invoke-interface {v8}, Lxc/h;->readByte()B

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    and-int/lit16 v8, v8, 0xff

    .line 64
    .line 65
    int-to-byte v8, v8

    .line 66
    iget-object v9, v1, Ljb/f$c;->a:Lxc/h;

    .line 67
    .line 68
    invoke-interface {v9}, Lxc/h;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    const v10, 0x7fffffff

    .line 73
    .line 74
    .line 75
    and-int/2addr v9, v10

    .line 76
    sget-object v10, Ljb/f;->a:Ljava/util/logging/Logger;

    .line 77
    .line 78
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 79
    .line 80
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_0

    .line 85
    .line 86
    invoke-static {v4, v9, v3, v7, v8}, Ljb/f$b;->a(ZIIBB)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    packed-switch v7, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    iget-object v0, v1, Ljb/f$c;->a:Lxc/h;

    .line 97
    .line 98
    int-to-long v2, v3

    .line 99
    invoke-interface {v0, v2, v3}, Lxc/h;->skip(J)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_a

    .line 103
    .line 104
    :pswitch_0
    invoke-virtual {v1, v0, v3, v9}, Ljb/f$c;->b0(Ljb/b$a;II)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :pswitch_1
    if-lt v3, v6, :cond_b

    .line 110
    .line 111
    if-nez v9, :cond_a

    .line 112
    .line 113
    iget-object v7, v1, Ljb/f$c;->a:Lxc/h;

    .line 114
    .line 115
    invoke-interface {v7}, Lxc/h;->readInt()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    iget-object v8, v1, Ljb/f$c;->a:Lxc/h;

    .line 120
    .line 121
    invoke-interface {v8}, Lxc/h;->readInt()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    sub-int/2addr v3, v6

    .line 126
    invoke-static {}, Ljb/a;->values()[Ljb/a;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    array-length v9, v6

    .line 131
    move v10, v2

    .line 132
    :goto_0
    if-ge v10, v9, :cond_2

    .line 133
    .line 134
    aget-object v11, v6, v10

    .line 135
    .line 136
    iget v12, v11, Ljb/a;->a:I

    .line 137
    .line 138
    if-ne v12, v8, :cond_1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    move-object v11, v5

    .line 145
    :goto_1
    if-eqz v11, :cond_9

    .line 146
    .line 147
    sget-object v6, Lxc/i;->d:Lxc/i;

    .line 148
    .line 149
    if-lez v3, :cond_3

    .line 150
    .line 151
    iget-object v6, v1, Ljb/f$c;->a:Lxc/h;

    .line 152
    .line 153
    int-to-long v8, v3

    .line 154
    invoke-interface {v6, v8, v9}, Lxc/h;->l(J)Lxc/i;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    :cond_3
    check-cast v0, Lhb/i$d;

    .line 159
    .line 160
    iget-object v3, v0, Lhb/i$d;->a:Lhb/j;

    .line 161
    .line 162
    invoke-virtual {v3, v4, v7, v11, v6}, Lhb/j;->c(IILjb/a;Lxc/i;)V

    .line 163
    .line 164
    .line 165
    sget-object v3, Ljb/a;->t:Ljb/a;

    .line 166
    .line 167
    if-ne v11, v3, :cond_4

    .line 168
    .line 169
    invoke-virtual {v6}, Lxc/i;->t()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    sget-object v8, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 174
    .line 175
    sget-object v9, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 176
    .line 177
    const/4 v10, 0x2

    .line 178
    new-array v10, v10, [Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v0, v10, v2

    .line 181
    .line 182
    aput-object v3, v10, v4

    .line 183
    .line 184
    const-string v2, "%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s"

    .line 185
    .line 186
    invoke-static {v2, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v8, v9, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v2, "too_many_pings"

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_4

    .line 200
    .line 201
    iget-object v2, v0, Lhb/i$d;->d:Lhb/i;

    .line 202
    .line 203
    iget-object v2, v2, Lhb/i;->L:Ljava/lang/Runnable;

    .line 204
    .line 205
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 206
    .line 207
    .line 208
    :cond_4
    iget v2, v11, Ljb/a;->a:I

    .line 209
    .line 210
    int-to-long v2, v2

    .line 211
    sget-object v8, Lgb/v0$g;->d:[Lgb/v0$g;

    .line 212
    .line 213
    array-length v9, v8

    .line 214
    int-to-long v9, v9

    .line 215
    cmp-long v9, v2, v9

    .line 216
    .line 217
    if-gez v9, :cond_6

    .line 218
    .line 219
    const-wide/16 v9, 0x0

    .line 220
    .line 221
    cmp-long v9, v2, v9

    .line 222
    .line 223
    if-gez v9, :cond_5

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_5
    long-to-int v9, v2

    .line 227
    aget-object v8, v8, v9

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_6
    :goto_2
    move-object v8, v5

    .line 231
    :goto_3
    if-nez v8, :cond_7

    .line 232
    .line 233
    sget-object v8, Lgb/v0$g;->c:Lgb/v0$g;

    .line 234
    .line 235
    iget-object v8, v8, Lgb/v0$g;->b:Leb/e1;

    .line 236
    .line 237
    iget-object v8, v8, Leb/e1;->a:Leb/e1$a;

    .line 238
    .line 239
    iget v8, v8, Leb/e1$a;->a:I

    .line 240
    .line 241
    invoke-static {v8}, Leb/e1;->c(I)Leb/e1;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    new-instance v9, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v10, "Unrecognized HTTP/2 error code: "

    .line 251
    .line 252
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v8, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    goto :goto_4

    .line 267
    :cond_7
    iget-object v2, v8, Lgb/v0$g;->b:Leb/e1;

    .line 268
    .line 269
    :goto_4
    const-string v3, "Received Goaway"

    .line 270
    .line 271
    invoke-virtual {v2, v3}, Leb/e1;->a(Ljava/lang/String;)Leb/e1;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v6}, Lxc/i;->i()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-lez v3, :cond_8

    .line 280
    .line 281
    invoke-virtual {v6}, Lxc/i;->t()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v2, v3}, Leb/e1;->a(Ljava/lang/String;)Leb/e1;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    :cond_8
    iget-object v0, v0, Lhb/i$d;->d:Lhb/i;

    .line 290
    .line 291
    sget-object v3, Lhb/i;->S:Ljava/util/Map;

    .line 292
    .line 293
    invoke-virtual {v0, v7, v5, v2}, Lhb/i;->t(ILjb/a;Leb/e1;)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_a

    .line 297
    .line 298
    :cond_9
    new-array v0, v4, [Ljava/lang/Object;

    .line 299
    .line 300
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    aput-object v3, v0, v2

    .line 305
    .line 306
    const-string v2, "TYPE_GOAWAY unexpected error code: %d"

    .line 307
    .line 308
    invoke-static {v2, v0}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    throw v5

    .line 312
    :cond_a
    new-array v0, v2, [Ljava/lang/Object;

    .line 313
    .line 314
    const-string v2, "TYPE_GOAWAY streamId != 0"

    .line 315
    .line 316
    invoke-static {v2, v0}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    throw v5

    .line 320
    :cond_b
    new-array v0, v4, [Ljava/lang/Object;

    .line 321
    .line 322
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    aput-object v3, v0, v2

    .line 327
    .line 328
    const-string v2, "TYPE_GOAWAY length < 8: %s"

    .line 329
    .line 330
    invoke-static {v2, v0}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    throw v5

    .line 334
    :pswitch_2
    invoke-virtual {v1, v0, v3, v8, v9}, Ljb/f$c;->H(Ljb/b$a;IBI)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_a

    .line 338
    .line 339
    :pswitch_3
    invoke-virtual {v1, v0, v3, v8, v9}, Ljb/f$c;->I(Ljb/b$a;IBI)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_a

    .line 343
    .line 344
    :pswitch_4
    invoke-virtual {v1, v0, v3, v8, v9}, Ljb/f$c;->Q(Ljb/b$a;IBI)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_a

    .line 348
    .line 349
    :pswitch_5
    invoke-virtual {v1, v0, v3, v9}, Ljb/f$c;->M(Ljb/b$a;II)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_a

    .line 353
    .line 354
    :pswitch_6
    const/4 v6, 0x5

    .line 355
    if-ne v3, v6, :cond_d

    .line 356
    .line 357
    if-eqz v9, :cond_c

    .line 358
    .line 359
    iget-object v2, v1, Ljb/f$c;->a:Lxc/h;

    .line 360
    .line 361
    invoke-interface {v2}, Lxc/h;->readInt()I

    .line 362
    .line 363
    .line 364
    iget-object v2, v1, Ljb/f$c;->a:Lxc/h;

    .line 365
    .line 366
    invoke-interface {v2}, Lxc/h;->readByte()B

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    goto/16 :goto_a

    .line 373
    .line 374
    :cond_c
    new-array v0, v2, [Ljava/lang/Object;

    .line 375
    .line 376
    const-string v2, "TYPE_PRIORITY streamId == 0"

    .line 377
    .line 378
    invoke-static {v2, v0}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    throw v5

    .line 382
    :cond_d
    new-array v0, v4, [Ljava/lang/Object;

    .line 383
    .line 384
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    aput-object v3, v0, v2

    .line 389
    .line 390
    const-string v2, "TYPE_PRIORITY length: %d != 5"

    .line 391
    .line 392
    invoke-static {v2, v0}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    throw v5

    .line 396
    :pswitch_7
    invoke-virtual {v1, v0, v3, v8, v9}, Ljb/f$c;->C(Ljb/b$a;IBI)V

    .line 397
    .line 398
    .line 399
    goto/16 :goto_a

    .line 400
    .line 401
    :pswitch_8
    and-int/lit8 v6, v8, 0x1

    .line 402
    .line 403
    if-eqz v6, :cond_e

    .line 404
    .line 405
    move v6, v4

    .line 406
    goto :goto_5

    .line 407
    :cond_e
    move v6, v2

    .line 408
    :goto_5
    and-int/lit8 v7, v8, 0x20

    .line 409
    .line 410
    if-eqz v7, :cond_f

    .line 411
    .line 412
    move v7, v4

    .line 413
    goto :goto_6

    .line 414
    :cond_f
    move v7, v2

    .line 415
    :goto_6
    if-nez v7, :cond_14

    .line 416
    .line 417
    and-int/lit8 v5, v8, 0x8

    .line 418
    .line 419
    if-eqz v5, :cond_10

    .line 420
    .line 421
    iget-object v5, v1, Ljb/f$c;->a:Lxc/h;

    .line 422
    .line 423
    invoke-interface {v5}, Lxc/h;->readByte()B

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    and-int/lit16 v5, v5, 0xff

    .line 428
    .line 429
    int-to-short v5, v5

    .line 430
    goto :goto_7

    .line 431
    :cond_10
    move v5, v2

    .line 432
    :goto_7
    invoke-static {v3, v8, v5}, Ljb/f;->c(IBS)I

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    iget-object v8, v1, Ljb/f$c;->a:Lxc/h;

    .line 437
    .line 438
    check-cast v0, Lhb/i$d;

    .line 439
    .line 440
    iget-object v11, v0, Lhb/i$d;->a:Lhb/j;

    .line 441
    .line 442
    invoke-interface {v8}, Lxc/h;->t()Lxc/f;

    .line 443
    .line 444
    .line 445
    move-result-object v14

    .line 446
    const/4 v12, 0x1

    .line 447
    move v13, v9

    .line 448
    move v15, v7

    .line 449
    move/from16 v16, v6

    .line 450
    .line 451
    invoke-virtual/range {v11 .. v16}, Lhb/j;->b(IILxc/f;IZ)V

    .line 452
    .line 453
    .line 454
    iget-object v10, v0, Lhb/i$d;->d:Lhb/i;

    .line 455
    .line 456
    iget-object v11, v10, Lhb/i;->k:Ljava/lang/Object;

    .line 457
    .line 458
    monitor-enter v11

    .line 459
    :try_start_1
    iget-object v10, v10, Lhb/i;->n:Ljava/util/HashMap;

    .line 460
    .line 461
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v12

    .line 465
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    check-cast v10, Lhb/h;

    .line 470
    .line 471
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 472
    if-nez v10, :cond_12

    .line 473
    .line 474
    iget-object v6, v0, Lhb/i$d;->d:Lhb/i;

    .line 475
    .line 476
    invoke-virtual {v6, v9}, Lhb/i;->p(I)Z

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    if-eqz v6, :cond_11

    .line 481
    .line 482
    iget-object v6, v0, Lhb/i$d;->d:Lhb/i;

    .line 483
    .line 484
    iget-object v6, v6, Lhb/i;->k:Ljava/lang/Object;

    .line 485
    .line 486
    monitor-enter v6

    .line 487
    :try_start_2
    iget-object v10, v0, Lhb/i$d;->d:Lhb/i;

    .line 488
    .line 489
    iget-object v10, v10, Lhb/i;->i:Lhb/b;

    .line 490
    .line 491
    sget-object v11, Ljb/a;->f:Ljb/a;

    .line 492
    .line 493
    invoke-virtual {v10, v9, v11}, Lhb/b;->R(ILjb/a;)V

    .line 494
    .line 495
    .line 496
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 497
    int-to-long v6, v7

    .line 498
    invoke-interface {v8, v6, v7}, Lxc/h;->skip(J)V

    .line 499
    .line 500
    .line 501
    goto :goto_8

    .line 502
    :catchall_0
    move-exception v0

    .line 503
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 504
    throw v0

    .line 505
    :cond_11
    iget-object v0, v0, Lhb/i$d;->d:Lhb/i;

    .line 506
    .line 507
    new-instance v2, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v3, "Received data for unknown stream: "

    .line 513
    .line 514
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-static {v0, v2}, Lhb/i;->i(Lhb/i;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_12
    int-to-long v11, v7

    .line 529
    invoke-interface {v8, v11, v12}, Lxc/h;->u0(J)V

    .line 530
    .line 531
    .line 532
    new-instance v9, Lxc/f;

    .line 533
    .line 534
    invoke-direct {v9}, Lxc/f;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-interface {v8}, Lxc/h;->t()Lxc/f;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    invoke-virtual {v9, v8, v11, v12}, Lxc/f;->g0(Lxc/f;J)V

    .line 542
    .line 543
    .line 544
    iget-object v8, v10, Lhb/h;->l:Lhb/h$b;

    .line 545
    .line 546
    iget-object v8, v8, Lhb/h$b;->J:Lpb/c;

    .line 547
    .line 548
    sget-object v8, Lpb/b;->a:Lpb/a;

    .line 549
    .line 550
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    iget-object v8, v0, Lhb/i$d;->d:Lhb/i;

    .line 554
    .line 555
    iget-object v8, v8, Lhb/i;->k:Ljava/lang/Object;

    .line 556
    .line 557
    monitor-enter v8

    .line 558
    :try_start_4
    iget-object v10, v10, Lhb/h;->l:Lhb/h$b;

    .line 559
    .line 560
    sub-int v7, v3, v7

    .line 561
    .line 562
    invoke-virtual {v10, v7, v9, v6}, Lhb/h$b;->p(ILxc/f;Z)V

    .line 563
    .line 564
    .line 565
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 566
    :goto_8
    iget-object v6, v0, Lhb/i$d;->d:Lhb/i;

    .line 567
    .line 568
    iget v7, v6, Lhb/i;->s:I

    .line 569
    .line 570
    add-int/2addr v7, v3

    .line 571
    iput v7, v6, Lhb/i;->s:I

    .line 572
    .line 573
    int-to-float v3, v7

    .line 574
    iget v7, v6, Lhb/i;->f:I

    .line 575
    .line 576
    int-to-float v7, v7

    .line 577
    const/high16 v8, 0x3f000000    # 0.5f

    .line 578
    .line 579
    mul-float/2addr v7, v8

    .line 580
    cmpl-float v3, v3, v7

    .line 581
    .line 582
    if-ltz v3, :cond_13

    .line 583
    .line 584
    iget-object v3, v6, Lhb/i;->k:Ljava/lang/Object;

    .line 585
    .line 586
    monitor-enter v3

    .line 587
    :try_start_5
    iget-object v6, v0, Lhb/i$d;->d:Lhb/i;

    .line 588
    .line 589
    iget-object v7, v6, Lhb/i;->i:Lhb/b;

    .line 590
    .line 591
    iget v6, v6, Lhb/i;->s:I

    .line 592
    .line 593
    int-to-long v8, v6

    .line 594
    invoke-virtual {v7, v2, v8, v9}, Lhb/b;->d(IJ)V

    .line 595
    .line 596
    .line 597
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 598
    iget-object v0, v0, Lhb/i$d;->d:Lhb/i;

    .line 599
    .line 600
    iput v2, v0, Lhb/i;->s:I

    .line 601
    .line 602
    goto :goto_9

    .line 603
    :catchall_1
    move-exception v0

    .line 604
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 605
    throw v0

    .line 606
    :cond_13
    :goto_9
    iget-object v0, v1, Ljb/f$c;->a:Lxc/h;

    .line 607
    .line 608
    int-to-long v2, v5

    .line 609
    invoke-interface {v0, v2, v3}, Lxc/h;->skip(J)V

    .line 610
    .line 611
    .line 612
    goto :goto_a

    .line 613
    :catchall_2
    move-exception v0

    .line 614
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 615
    throw v0

    .line 616
    :catchall_3
    move-exception v0

    .line 617
    :try_start_8
    monitor-exit v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 618
    throw v0

    .line 619
    :cond_14
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 620
    .line 621
    new-array v2, v2, [Ljava/lang/Object;

    .line 622
    .line 623
    invoke-static {v0, v2}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    throw v5

    .line 627
    :goto_a
    return v4

    .line 628
    :cond_15
    const-string v0, "FRAME_SIZE_ERROR: %s"

    .line 629
    .line 630
    new-array v4, v4, [Ljava/lang/Object;

    .line 631
    .line 632
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    aput-object v3, v4, v2

    .line 637
    .line 638
    invoke-static {v0, v4}, Ljb/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    throw v5

    .line 642
    :catch_0
    return v2

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final g(ISBI)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Ljb/f$c;->b:Ljb/f$a;

    .line 2
    .line 3
    iput p1, v0, Ljb/f$a;->e:I

    .line 4
    .line 5
    iput p1, v0, Ljb/f$a;->b:I

    .line 6
    .line 7
    iput-short p2, v0, Ljb/f$a;->f:S

    .line 8
    .line 9
    iput-byte p3, v0, Ljb/f$a;->c:B

    .line 10
    .line 11
    iput p4, v0, Ljb/f$a;->d:I

    .line 12
    .line 13
    iget-object p1, p0, Ljb/f$c;->c:Ljb/e$a;

    .line 14
    .line 15
    :cond_0
    :goto_0
    iget-object p2, p1, Ljb/e$a;->b:Lxc/s;

    .line 16
    .line 17
    invoke-virtual {p2}, Lxc/s;->v()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_d

    .line 22
    .line 23
    iget-object p2, p1, Ljb/e$a;->b:Lxc/s;

    .line 24
    .line 25
    invoke-virtual {p2}, Lxc/s;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-int/lit16 p2, p2, 0xff

    .line 30
    .line 31
    const/16 p3, 0x80

    .line 32
    .line 33
    if-eq p2, p3, :cond_c

    .line 34
    .line 35
    and-int/lit16 p4, p2, 0x80

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    if-ne p4, p3, :cond_4

    .line 39
    .line 40
    const/16 p3, 0x7f

    .line 41
    .line 42
    invoke-virtual {p1, p2, p3}, Ljb/e$a;->e(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    add-int/lit8 p2, p2, -0x1

    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    if-ltz p2, :cond_1

    .line 50
    .line 51
    sget-object p4, Ljb/e;->b:[Ljb/d;

    .line 52
    .line 53
    array-length p4, p4

    .line 54
    sub-int/2addr p4, p3

    .line 55
    if-gt p2, p4, :cond_1

    .line 56
    .line 57
    move v0, p3

    .line 58
    :cond_1
    if-eqz v0, :cond_2

    .line 59
    .line 60
    sget-object p3, Ljb/e;->b:[Ljb/d;

    .line 61
    .line 62
    aget-object p2, p3, p2

    .line 63
    .line 64
    iget-object p3, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object p4, Ljb/e;->b:[Ljb/d;

    .line 71
    .line 72
    array-length p4, p4

    .line 73
    sub-int p4, p2, p4

    .line 74
    .line 75
    iget v0, p1, Ljb/e$a;->f:I

    .line 76
    .line 77
    add-int/2addr v0, p3

    .line 78
    add-int/2addr v0, p4

    .line 79
    if-ltz v0, :cond_3

    .line 80
    .line 81
    iget-object p4, p1, Ljb/e$a;->e:[Ljb/d;

    .line 82
    .line 83
    array-length v1, p4

    .line 84
    add-int/lit8 v1, v1, -0x1

    .line 85
    .line 86
    if-gt v0, v1, :cond_3

    .line 87
    .line 88
    iget-object p2, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 89
    .line 90
    aget-object p3, p4, v0

    .line 91
    .line 92
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 97
    .line 98
    const-string p4, "Header index too large "

    .line 99
    .line 100
    invoke-static {p4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    add-int/2addr p2, p3

    .line 105
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_4
    const/16 p3, 0x40

    .line 117
    .line 118
    if-ne p2, p3, :cond_5

    .line 119
    .line 120
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-static {p2}, Ljb/e;->a(Lxc/i;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    new-instance p4, Ljb/d;

    .line 132
    .line 133
    invoke-direct {p4, p2, p3}, Ljb/d;-><init>(Lxc/i;Lxc/i;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p4}, Ljb/e$a;->c(Ljb/d;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    and-int/lit8 p4, p2, 0x40

    .line 141
    .line 142
    if-ne p4, p3, :cond_6

    .line 143
    .line 144
    const/16 p3, 0x3f

    .line 145
    .line 146
    invoke-virtual {p1, p2, p3}, Ljb/e$a;->e(II)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    add-int/lit8 p2, p2, -0x1

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Ljb/e$a;->b(I)Lxc/i;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    new-instance p4, Ljb/d;

    .line 161
    .line 162
    invoke-direct {p4, p2, p3}, Ljb/d;-><init>(Lxc/i;Lxc/i;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p4}, Ljb/e$a;->c(Ljb/d;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_6
    and-int/lit8 p3, p2, 0x20

    .line 171
    .line 172
    const/16 p4, 0x20

    .line 173
    .line 174
    if-ne p3, p4, :cond_9

    .line 175
    .line 176
    const/16 p3, 0x1f

    .line 177
    .line 178
    invoke-virtual {p1, p2, p3}, Ljb/e$a;->e(II)I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    iput p2, p1, Ljb/e$a;->d:I

    .line 183
    .line 184
    if-ltz p2, :cond_8

    .line 185
    .line 186
    iget p3, p1, Ljb/e$a;->c:I

    .line 187
    .line 188
    if-gt p2, p3, :cond_8

    .line 189
    .line 190
    iget p3, p1, Ljb/e$a;->h:I

    .line 191
    .line 192
    if-ge p2, p3, :cond_0

    .line 193
    .line 194
    if-nez p2, :cond_7

    .line 195
    .line 196
    iget-object p2, p1, Ljb/e$a;->e:[Ljb/d;

    .line 197
    .line 198
    const/4 p3, 0x0

    .line 199
    invoke-static {p2, p3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p1, Ljb/e$a;->e:[Ljb/d;

    .line 203
    .line 204
    array-length p2, p2

    .line 205
    add-int/lit8 p2, p2, -0x1

    .line 206
    .line 207
    iput p2, p1, Ljb/e$a;->f:I

    .line 208
    .line 209
    iput v0, p1, Ljb/e$a;->g:I

    .line 210
    .line 211
    iput v0, p1, Ljb/e$a;->h:I

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_7
    sub-int/2addr p3, p2

    .line 216
    invoke-virtual {p1, p3}, Ljb/e$a;->a(I)I

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_8
    new-instance p2, Ljava/io/IOException;

    .line 222
    .line 223
    const-string p3, "Invalid dynamic table size update "

    .line 224
    .line 225
    invoke-static {p3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    iget p1, p1, Ljb/e$a;->d:I

    .line 230
    .line 231
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p2

    .line 242
    :cond_9
    const/16 p3, 0x10

    .line 243
    .line 244
    if-eq p2, p3, :cond_b

    .line 245
    .line 246
    if-nez p2, :cond_a

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_a
    const/16 p3, 0xf

    .line 250
    .line 251
    invoke-virtual {p1, p2, p3}, Ljb/e$a;->e(II)I

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    add-int/lit8 p2, p2, -0x1

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Ljb/e$a;->b(I)Lxc/i;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 262
    .line 263
    .line 264
    move-result-object p3

    .line 265
    iget-object p4, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 266
    .line 267
    new-instance v0, Ljb/d;

    .line 268
    .line 269
    invoke-direct {v0, p2, p3}, Ljb/d;-><init>(Lxc/i;Lxc/i;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :cond_b
    :goto_1
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-static {p2}, Ljb/e;->a(Lxc/i;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Ljb/e$a;->d()Lxc/i;

    .line 285
    .line 286
    .line 287
    move-result-object p3

    .line 288
    iget-object p4, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 289
    .line 290
    new-instance v0, Ljb/d;

    .line 291
    .line 292
    invoke-direct {v0, p2, p3}, Ljb/d;-><init>(Lxc/i;Lxc/i;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_c
    new-instance p1, Ljava/io/IOException;

    .line 301
    .line 302
    const-string p2, "index == 0"

    .line 303
    .line 304
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p1

    .line 308
    :cond_d
    iget-object p1, p0, Ljb/f$c;->c:Ljb/e$a;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance p2, Ljava/util/ArrayList;

    .line 314
    .line 315
    iget-object p3, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p1, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 323
    .line 324
    .line 325
    return-object p2
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
