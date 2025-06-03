.class public abstract Lm9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/a$b;,
        Lm9/a$a;,
        Lm9/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        "CallbackT::",
        "Lm9/j0;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final n:J

.field public static final o:J

.field public static final p:J

.field public static final q:J

.field public static final r:J

.field public static final synthetic s:I


# instance fields
.field public a:Ln9/a$a;

.field public b:Ln9/a$a;

.field public final c:Lm9/v;

.field public final d:Leb/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field public final e:Lm9/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm9/a<",
            "TReqT;TRespT;TCallbackT;>.b;"
        }
    .end annotation
.end field

.field public final f:Ln9/a;

.field public final g:Ln9/a$c;

.field public final h:Ln9/a$c;

.field public i:Lm9/i0;

.field public j:J

.field public k:Lm9/s;

.field public final l:Ln9/g;

.field public final m:Lm9/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TCallbackT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lm9/a;->n:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sput-wide v4, Lm9/a;->o:J

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sput-wide v1, Lm9/a;->p:J

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lm9/a;->q:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lm9/a;->r:J

    return-void
.end method

.method public constructor <init>(Lm9/v;Leb/t0;Ln9/a;Ln9/a$c;Ln9/a$c;Lm9/j0;)V
    .locals 7

    sget-object v0, Ln9/a$c;->e:Ln9/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lm9/i0;->a:Lm9/i0;

    iput-object v1, p0, Lm9/a;->i:Lm9/i0;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lm9/a;->j:J

    iput-object p1, p0, Lm9/a;->c:Lm9/v;

    iput-object p2, p0, Lm9/a;->d:Leb/t0;

    iput-object p3, p0, Lm9/a;->f:Ln9/a;

    iput-object p5, p0, Lm9/a;->g:Ln9/a$c;

    iput-object v0, p0, Lm9/a;->h:Ln9/a$c;

    iput-object p6, p0, Lm9/a;->m:Lm9/j0;

    new-instance p1, Lm9/a$b;

    invoke-direct {p1, p0}, Lm9/a$b;-><init>(Lm9/a;)V

    iput-object p1, p0, Lm9/a;->e:Lm9/a$b;

    new-instance p1, Ln9/g;

    sget-wide v3, Lm9/a;->n:J

    sget-wide v5, Lm9/a;->o:J

    move-object v0, p1

    move-object v1, p3

    move-object v2, p4

    invoke-direct/range {v0 .. v6}, Ln9/g;-><init>(Ln9/a;Ln9/a$c;JJ)V

    iput-object p1, p0, Lm9/a;->l:Ln9/g;

    return-void
.end method


# virtual methods
.method public final a(Lm9/i0;Leb/e1;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lm9/a;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "Only started streams should be closed."

    .line 9
    .line 10
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lm9/i0;->e:Lm9/i0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Leb/e1;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move v3, v2

    .line 28
    :goto_1
    new-array v4, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    const-string v5, "Can\'t provide an error when not in an error state."

    .line 31
    .line 32
    invoke-static {v5, v3, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lm9/a;->f:Ln9/a;

    .line 36
    .line 37
    invoke-virtual {v3}, Ln9/a;->d()V

    .line 38
    .line 39
    .line 40
    sget-object v3, Lm9/j;->d:Ljava/util/HashSet;

    .line 41
    .line 42
    iget-object v3, p2, Leb/e1;->a:Leb/e1$a;

    .line 43
    .line 44
    iget-object v3, p2, Leb/e1;->c:Ljava/lang/Throwable;

    .line 45
    .line 46
    instance-of v4, v3, Ljavax/net/ssl/SSLHandshakeException;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "no ciphers available"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v3, p0, Lm9/a;->b:Ln9/a$a;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3}, Ln9/a$a;->a()V

    .line 65
    .line 66
    .line 67
    iput-object v4, p0, Lm9/a;->b:Ln9/a$a;

    .line 68
    .line 69
    :cond_3
    iget-object v3, p0, Lm9/a;->a:Ln9/a$a;

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v3}, Ln9/a$a;->a()V

    .line 74
    .line 75
    .line 76
    iput-object v4, p0, Lm9/a;->a:Ln9/a$a;

    .line 77
    .line 78
    :cond_4
    iget-object v3, p0, Lm9/a;->l:Ln9/g;

    .line 79
    .line 80
    iget-object v5, v3, Ln9/g;->h:Ln9/a$a;

    .line 81
    .line 82
    if-eqz v5, :cond_5

    .line 83
    .line 84
    invoke-virtual {v5}, Ln9/a$a;->a()V

    .line 85
    .line 86
    .line 87
    iput-object v4, v3, Ln9/g;->h:Ln9/a$a;

    .line 88
    .line 89
    :cond_5
    iget-wide v5, p0, Lm9/a;->j:J

    .line 90
    .line 91
    const-wide/16 v7, 0x1

    .line 92
    .line 93
    add-long/2addr v5, v7

    .line 94
    iput-wide v5, p0, Lm9/a;->j:J

    .line 95
    .line 96
    iget-object v3, p2, Leb/e1;->a:Leb/e1$a;

    .line 97
    .line 98
    sget-object v5, Leb/e1$a;->c:Leb/e1$a;

    .line 99
    .line 100
    if-ne v3, v5, :cond_6

    .line 101
    .line 102
    iget-object v3, p0, Lm9/a;->l:Ln9/g;

    .line 103
    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    iput-wide v5, v3, Ln9/g;->f:J

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    sget-object v5, Leb/e1$a;->s:Leb/e1$a;

    .line 110
    .line 111
    if-ne v3, v5, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    new-array v5, v2, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    aput-object v6, v5, v1

    .line 132
    .line 133
    const-string v6, "(%x) Using maximum backoff delay to prevent overloading the backend."

    .line 134
    .line 135
    invoke-static {v2, v3, v6, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Lm9/a;->l:Ln9/g;

    .line 139
    .line 140
    iget-wide v5, v3, Ln9/g;->e:J

    .line 141
    .line 142
    iput-wide v5, v3, Ln9/g;->f:J

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    sget-object v5, Leb/e1$a;->A:Leb/e1$a;

    .line 146
    .line 147
    if-ne v3, v5, :cond_8

    .line 148
    .line 149
    iget-object v5, p0, Lm9/a;->i:Lm9/i0;

    .line 150
    .line 151
    sget-object v6, Lm9/i0;->d:Lm9/i0;

    .line 152
    .line 153
    if-eq v5, v6, :cond_8

    .line 154
    .line 155
    iget-object v3, p0, Lm9/a;->c:Lm9/v;

    .line 156
    .line 157
    iget-object v5, v3, Lm9/v;->b:Le9/a;

    .line 158
    .line 159
    invoke-virtual {v5}, Le9/a;->t()V

    .line 160
    .line 161
    .line 162
    iget-object v3, v3, Lm9/v;->c:Le9/a;

    .line 163
    .line 164
    invoke-virtual {v3}, Le9/a;->t()V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    sget-object v5, Leb/e1$a;->y:Leb/e1$a;

    .line 169
    .line 170
    if-ne v3, v5, :cond_a

    .line 171
    .line 172
    iget-object v3, p2, Leb/e1;->c:Ljava/lang/Throwable;

    .line 173
    .line 174
    instance-of v5, v3, Ljava/net/UnknownHostException;

    .line 175
    .line 176
    if-nez v5, :cond_9

    .line 177
    .line 178
    instance-of v3, v3, Ljava/net/ConnectException;

    .line 179
    .line 180
    if-eqz v3, :cond_a

    .line 181
    .line 182
    :cond_9
    iget-object v3, p0, Lm9/a;->l:Ln9/g;

    .line 183
    .line 184
    sget-wide v5, Lm9/a;->r:J

    .line 185
    .line 186
    iput-wide v5, v3, Ln9/g;->e:J

    .line 187
    .line 188
    :cond_a
    :goto_2
    if-eq p1, v0, :cond_b

    .line 189
    .line 190
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-array v3, v2, [Ljava/lang/Object;

    .line 199
    .line 200
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    aput-object v5, v3, v1

    .line 209
    .line 210
    const-string v5, "(%x) Performing stream teardown"

    .line 211
    .line 212
    invoke-static {v2, v0, v5, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lm9/a;->h()V

    .line 216
    .line 217
    .line 218
    :cond_b
    iget-object v0, p0, Lm9/a;->k:Lm9/s;

    .line 219
    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    invoke-virtual {p2}, Leb/e1;->e()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_c

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    new-array v3, v2, [Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    aput-object v5, v3, v1

    .line 247
    .line 248
    const-string v1, "(%x) Closing stream client-side"

    .line 249
    .line 250
    invoke-static {v2, v0, v1, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iget-object v0, p0, Lm9/a;->k:Lm9/s;

    .line 254
    .line 255
    invoke-virtual {v0}, Lm9/s;->b()V

    .line 256
    .line 257
    .line 258
    :cond_c
    iput-object v4, p0, Lm9/a;->k:Lm9/s;

    .line 259
    .line 260
    :cond_d
    iput-object p1, p0, Lm9/a;->i:Lm9/i0;

    .line 261
    .line 262
    iget-object p1, p0, Lm9/a;->m:Lm9/j0;

    .line 263
    .line 264
    invoke-interface {p1, p2}, Lm9/j0;->c(Leb/e1;)V

    .line 265
    .line 266
    .line 267
    return-void
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

.method public final b()V
    .locals 3

    invoke-virtual {p0}, Lm9/a;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Can only inhibit backoff after in a stopped state"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iget-object v0, p0, Lm9/a;->f:Ln9/a;

    invoke-virtual {v0}, Ln9/a;->d()V

    sget-object v0, Lm9/i0;->a:Lm9/i0;

    iput-object v0, p0, Lm9/a;->i:Lm9/i0;

    iget-object v0, p0, Lm9/a;->l:Ln9/g;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Ln9/g;->f:J

    return-void
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lm9/a;->f:Ln9/a;

    invoke-virtual {v0}, Ln9/a;->d()V

    iget-object v0, p0, Lm9/a;->i:Lm9/i0;

    sget-object v1, Lm9/i0;->c:Lm9/i0;

    if-eq v0, v1, :cond_1

    sget-object v1, Lm9/i0;->d:Lm9/i0;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lm9/a;->f:Ln9/a;

    invoke-virtual {v0}, Ln9/a;->d()V

    iget-object v0, p0, Lm9/a;->i:Lm9/i0;

    sget-object v1, Lm9/i0;->b:Lm9/i0;

    if-eq v0, v1, :cond_1

    sget-object v1, Lm9/i0;->f:Lm9/i0;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lm9/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public abstract e(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRespT;)V"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRespT;)V"
        }
    .end annotation
.end method

.method public g()V
    .locals 6

    .line 1
    iget-object v0, p0, Lm9/a;->f:Ln9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/a;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/a;->k:Lm9/s;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v4, "Last call still set"

    .line 18
    .line 19
    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lm9/a;->b:Ln9/a$a;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    move v0, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v2

    .line 29
    :goto_1
    new-array v3, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v4, "Idle timer still set"

    .line 32
    .line 33
    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm9/a;->i:Lm9/i0;

    .line 37
    .line 38
    sget-object v3, Lm9/i0;->e:Lm9/i0;

    .line 39
    .line 40
    if-ne v0, v3, :cond_3

    .line 41
    .line 42
    if-ne v0, v3, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v1, v2

    .line 46
    :goto_2
    new-array v0, v2, [Ljava/lang/Object;

    .line 47
    .line 48
    const-string v2, "Should only perform backoff in an error state"

    .line 49
    .line 50
    invoke-static {v2, v1, v0}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lm9/i0;->f:Lm9/i0;

    .line 54
    .line 55
    iput-object v0, p0, Lm9/a;->i:Lm9/i0;

    .line 56
    .line 57
    iget-object v0, p0, Lm9/a;->l:Ln9/g;

    .line 58
    .line 59
    new-instance v1, Lu/a;

    .line 60
    .line 61
    const/16 v2, 0xd

    .line 62
    .line 63
    invoke-direct {v1, p0, v2}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ln9/g;->a(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    sget-object v3, Lm9/i0;->a:Lm9/i0;

    .line 71
    .line 72
    if-ne v0, v3, :cond_4

    .line 73
    .line 74
    move v0, v1

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    move v0, v2

    .line 77
    :goto_3
    new-array v3, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    const-string v4, "Already started"

    .line 80
    .line 81
    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lm9/a$a;

    .line 85
    .line 86
    iget-wide v3, p0, Lm9/a;->j:J

    .line 87
    .line 88
    invoke-direct {v0, p0, v3, v4}, Lm9/a$a;-><init>(Lm9/a;J)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lm9/a$c;

    .line 92
    .line 93
    invoke-direct {v3, p0, v0}, Lm9/a$c;-><init>(Lm9/a;Lm9/a$a;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lm9/a;->c:Lm9/v;

    .line 97
    .line 98
    iget-object v4, p0, Lm9/a;->d:Leb/t0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-array v1, v1, [Leb/e;

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    aput-object v5, v1, v2

    .line 107
    .line 108
    iget-object v2, v0, Lm9/v;->d:Lm9/y;

    .line 109
    .line 110
    invoke-virtual {v2, v4}, Lm9/y;->a(Leb/t0;)Lcom/google/android/gms/tasks/Task;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v4, v0, Lm9/v;->a:Ln9/a;

    .line 115
    .line 116
    iget-object v4, v4, Ln9/a;->a:Ln9/a$b;

    .line 117
    .line 118
    new-instance v5, Lm9/p;

    .line 119
    .line 120
    invoke-direct {v5, v0, v3, v1}, Lm9/p;-><init>(Lm9/v;Lm9/a$c;[Leb/e;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 124
    .line 125
    .line 126
    new-instance v3, Lm9/s;

    .line 127
    .line 128
    invoke-direct {v3, v0, v1, v2}, Lm9/s;-><init>(Lm9/v;[Leb/e;Lcom/google/android/gms/tasks/Task;)V

    .line 129
    .line 130
    .line 131
    iput-object v3, p0, Lm9/a;->k:Lm9/s;

    .line 132
    .line 133
    sget-object v0, Lm9/i0;->b:Lm9/i0;

    .line 134
    .line 135
    iput-object v0, p0, Lm9/a;->i:Lm9/i0;

    .line 136
    .line 137
    return-void
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

.method public h()V
    .locals 0

    return-void
.end method

.method public final i(Lma/w;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm9/a;->f:Ln9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/a;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x2

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v2, v1, v3

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object p1, v1, v2

    .line 30
    .line 31
    const-string v3, "(%x) Stream sending: %s"

    .line 32
    .line 33
    invoke-static {v2, v0, v3, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm9/a;->b:Ln9/a$a;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Ln9/a$a;->a()V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lm9/a;->b:Ln9/a$a;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lm9/a;->k:Lm9/s;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Leb/x;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
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
