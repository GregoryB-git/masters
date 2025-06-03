.class public final Lw3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/x$a;
    }
.end annotation


# static fields
.field public static final g:Le0/d;

.field public static final h:Ljava/util/Random;


# instance fields
.field public final a:Lv3/r1$c;

.field public final b:Lv3/r1$b;

.field public final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lw3/x$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lw3/z;

.field public e:Lv3/r1;

.field public f:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, Lw3/x;->g:Le0/d;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lw3/x;->h:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv3/r1$c;

    invoke-direct {v0}, Lv3/r1$c;-><init>()V

    iput-object v0, p0, Lw3/x;->a:Lv3/r1$c;

    new-instance v0, Lv3/r1$b;

    invoke-direct {v0}, Lv3/r1$b;-><init>()V

    iput-object v0, p0, Lw3/x;->b:Lv3/r1$b;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw3/x;->c:Ljava/util/HashMap;

    sget-object v0, Lv3/r1;->a:Lv3/r1$a;

    iput-object v0, p0, Lw3/x;->e:Lv3/r1;

    return-void
.end method


# virtual methods
.method public final a(ILz4/t$b;)Lw3/x$a;
    .locals 13

    .line 1
    iget-object v0, p0, Lw3/x;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide v2, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_7

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lw3/x$a;

    .line 28
    .line 29
    iget-wide v5, v4, Lw3/x$a;->c:J

    .line 30
    .line 31
    const-wide/16 v7, -0x1

    .line 32
    .line 33
    cmp-long v5, v5, v7

    .line 34
    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    iget v5, v4, Lw3/x$a;->b:I

    .line 38
    .line 39
    if-ne p1, v5, :cond_1

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iget-wide v5, p2, Lz4/s;->d:J

    .line 44
    .line 45
    iput-wide v5, v4, Lw3/x$a;->c:J

    .line 46
    .line 47
    :cond_1
    if-nez p2, :cond_2

    .line 48
    .line 49
    iget v5, v4, Lw3/x$a;->b:I

    .line 50
    .line 51
    if-ne p1, v5, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget-object v5, v4, Lw3/x$a;->d:Lz4/t$b;

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {p2}, Lz4/s;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_4

    .line 63
    .line 64
    iget-wide v5, p2, Lz4/s;->d:J

    .line 65
    .line 66
    iget-wide v9, v4, Lw3/x$a;->c:J

    .line 67
    .line 68
    cmp-long v5, v5, v9

    .line 69
    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    iget-wide v9, p2, Lz4/s;->d:J

    .line 74
    .line 75
    iget-wide v11, v5, Lz4/s;->d:J

    .line 76
    .line 77
    cmp-long v6, v9, v11

    .line 78
    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    iget v6, p2, Lz4/s;->b:I

    .line 82
    .line 83
    iget v9, v5, Lz4/s;->b:I

    .line 84
    .line 85
    if-ne v6, v9, :cond_4

    .line 86
    .line 87
    iget v6, p2, Lz4/s;->c:I

    .line 88
    .line 89
    iget v5, v5, Lz4/s;->c:I

    .line 90
    .line 91
    if-ne v6, v5, :cond_4

    .line 92
    .line 93
    :goto_1
    const/4 v5, 0x1

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    const/4 v5, 0x0

    .line 96
    :goto_2
    if-eqz v5, :cond_0

    .line 97
    .line 98
    iget-wide v5, v4, Lw3/x$a;->c:J

    .line 99
    .line 100
    cmp-long v7, v5, v7

    .line 101
    .line 102
    if-eqz v7, :cond_6

    .line 103
    .line 104
    cmp-long v7, v5, v2

    .line 105
    .line 106
    if-gez v7, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    if-nez v7, :cond_0

    .line 110
    .line 111
    sget v5, Lv5/e0;->a:I

    .line 112
    .line 113
    iget-object v5, v1, Lw3/x$a;->d:Lz4/t$b;

    .line 114
    .line 115
    if-eqz v5, :cond_0

    .line 116
    .line 117
    iget-object v5, v4, Lw3/x$a;->d:Lz4/t$b;

    .line 118
    .line 119
    if-eqz v5, :cond_0

    .line 120
    .line 121
    move-object v1, v4

    .line 122
    goto :goto_0

    .line 123
    :cond_6
    :goto_3
    move-object v1, v4

    .line 124
    move-wide v2, v5

    .line 125
    goto :goto_0

    .line 126
    :cond_7
    if-nez v1, :cond_8

    .line 127
    .line 128
    sget-object v0, Lw3/x;->g:Le0/d;

    .line 129
    .line 130
    invoke-virtual {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Ljava/lang/String;

    .line 135
    .line 136
    new-instance v1, Lw3/x$a;

    .line 137
    .line 138
    invoke-direct {v1, p0, v0, p1, p2}, Lw3/x$a;-><init>(Lw3/x;Ljava/lang/String;ILz4/t$b;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lw3/x;->c:Ljava/util/HashMap;

    .line 142
    .line 143
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_8
    return-object v1
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

.method public final b(Lw3/b$a;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lw3/b$a;->b:Lv3/r1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lw3/x;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    iget-object v1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lw3/x$a;

    .line 22
    .line 23
    iget v1, p1, Lw3/b$a;->c:I

    .line 24
    .line 25
    iget-object v2, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Lw3/x;->a(ILz4/t$b;)Lw3/x$a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, Lw3/x$a;->a:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lw3/x;->c(Lw3/b$a;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Lz4/s;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-wide v1, v0, Lw3/x$a;->c:J

    .line 51
    .line 52
    iget-object v3, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 53
    .line 54
    iget-wide v4, v3, Lz4/s;->d:J

    .line 55
    .line 56
    cmp-long v1, v1, v4

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lw3/x$a;->d:Lz4/t$b;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget v1, v0, Lz4/s;->b:I

    .line 65
    .line 66
    iget v2, v3, Lz4/s;->b:I

    .line 67
    .line 68
    if-ne v1, v2, :cond_1

    .line 69
    .line 70
    iget v0, v0, Lz4/s;->c:I

    .line 71
    .line 72
    iget v1, v3, Lz4/s;->c:I

    .line 73
    .line 74
    if-eq v0, v1, :cond_2

    .line 75
    .line 76
    :cond_1
    new-instance v0, Lz4/t$b;

    .line 77
    .line 78
    iget-object v1, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 79
    .line 80
    iget-object v2, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iget-wide v3, v1, Lz4/s;->d:J

    .line 83
    .line 84
    invoke-direct {v0, v2, v3, v4}, Lz4/t$b;-><init>(Ljava/lang/Object;J)V

    .line 85
    .line 86
    .line 87
    iget p1, p1, Lw3/b$a;->c:I

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lw3/x;->a(ILz4/t$b;)Lw3/x$a;

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lw3/x;->d:Lw3/z;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void
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
.end method

.method public final declared-synchronized c(Lw3/b$a;)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lw3/x;->d:Lw3/z;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lw3/b$a;->b:Lv3/r1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    iget-object v0, p0, Lw3/x;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lw3/x$a;

    .line 26
    .line 27
    iget-object v1, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-wide v3, v0, Lw3/x$a;->c:J

    .line 35
    .line 36
    const-wide/16 v5, -0x1

    .line 37
    .line 38
    cmp-long v5, v3, v5

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    iget v0, v0, Lw3/x$a;->b:I

    .line 44
    .line 45
    iget v3, p1, Lw3/b$a;->c:I

    .line 46
    .line 47
    if-eq v0, v3, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-wide v7, v1, Lz4/s;->d:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    cmp-long v0, v7, v3

    .line 53
    .line 54
    if-gez v0, :cond_2

    .line 55
    .line 56
    :goto_0
    move v6, v2

    .line 57
    :cond_2
    if-eqz v6, :cond_3

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :cond_3
    :try_start_2
    iget v0, p1, Lw3/b$a;->c:I

    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, Lw3/x;->a(ILz4/t$b;)Lw3/x$a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v1, :cond_4

    .line 70
    .line 71
    iget-object v1, v0, Lw3/x$a;->a:Ljava/lang/String;

    .line 72
    .line 73
    iput-object v1, p0, Lw3/x;->f:Ljava/lang/String;

    .line 74
    .line 75
    :cond_4
    iget-object v1, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v1}, Lz4/s;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    new-instance v1, Lz4/t$b;

    .line 86
    .line 87
    iget-object v3, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 88
    .line 89
    iget-object v4, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iget-wide v5, v3, Lz4/s;->d:J

    .line 92
    .line 93
    iget v3, v3, Lz4/s;->b:I

    .line 94
    .line 95
    invoke-direct {v1, v4, v3, v5, v6}, Lz4/t$b;-><init>(Ljava/lang/Object;IJ)V

    .line 96
    .line 97
    .line 98
    iget v3, p1, Lw3/b$a;->c:I

    .line 99
    .line 100
    invoke-virtual {p0, v3, v1}, Lw3/x;->a(ILz4/t$b;)Lw3/x$a;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-boolean v3, v1, Lw3/x$a;->e:Z

    .line 105
    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    iput-boolean v2, v1, Lw3/x$a;->e:Z

    .line 109
    .line 110
    iget-object v1, p1, Lw3/b$a;->b:Lv3/r1;

    .line 111
    .line 112
    iget-object v3, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 113
    .line 114
    iget-object v3, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object v4, p0, Lw3/x;->b:Lv3/r1$b;

    .line 117
    .line 118
    invoke-virtual {v1, v3, v4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lw3/x;->b:Lv3/r1$b;

    .line 122
    .line 123
    iget-object v3, p1, Lw3/b$a;->d:Lz4/t$b;

    .line 124
    .line 125
    iget v3, v3, Lz4/s;->b:I

    .line 126
    .line 127
    invoke-virtual {v1, v3}, Lv3/r1$b;->d(I)J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    invoke-static {v3, v4}, Lv5/e0;->R(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    iget-object v1, p0, Lw3/x;->b:Lv3/r1$b;

    .line 136
    .line 137
    iget-wide v5, v1, Lv3/r1$b;->e:J

    .line 138
    .line 139
    invoke-static {v5, v6}, Lv5/e0;->R(J)J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    add-long/2addr v3, v5

    .line 144
    const-wide/16 v5, 0x0

    .line 145
    .line 146
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lw3/x;->d:Lw3/z;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-boolean v1, v0, Lw3/x$a;->e:Z

    .line 155
    .line 156
    if-nez v1, :cond_6

    .line 157
    .line 158
    iput-boolean v2, v0, Lw3/x$a;->e:Z

    .line 159
    .line 160
    iget-object v1, p0, Lw3/x;->d:Lw3/z;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    :cond_6
    iget-object v1, v0, Lw3/x$a;->a:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v3, p0, Lw3/x;->f:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_7

    .line 174
    .line 175
    iget-boolean v1, v0, Lw3/x$a;->f:Z

    .line 176
    .line 177
    if-nez v1, :cond_7

    .line 178
    .line 179
    iput-boolean v2, v0, Lw3/x$a;->f:Z

    .line 180
    .line 181
    iget-object v1, p0, Lw3/x;->d:Lw3/z;

    .line 182
    .line 183
    iget-object v0, v0, Lw3/x$a;->a:Ljava/lang/String;

    .line 184
    .line 185
    check-cast v1, Lw3/y;

    .line 186
    .line 187
    invoke-virtual {v1, p1, v0}, Lw3/y;->l(Lw3/b$a;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    .line 189
    .line 190
    :cond_7
    monitor-exit p0

    .line 191
    return-void

    .line 192
    :catchall_0
    move-exception p1

    .line 193
    monitor-exit p0

    .line 194
    throw p1
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
