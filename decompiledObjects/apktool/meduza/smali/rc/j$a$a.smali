.class public final Lrc/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrc/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lpc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/f<",
            "Lsb/v<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Lpc/f;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/f<",
            "Lsb/v<",
            "Ljava/lang/Object;",
            ">;>;I)V"
        }
    .end annotation

    iput-object p1, p0, Lrc/j$a$a;->a:Lpc/f;

    iput p2, p0, Lrc/j$a$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lrc/j$a$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lrc/j$a$a$a;

    .line 7
    .line 8
    iget v1, v0, Lrc/j$a$a$a;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrc/j$a$a$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrc/j$a$a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lrc/j$a$a$a;-><init>(Lrc/j$a$a;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lrc/j$a$a$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lrc/j$a$a$a;->c:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_b

    .line 43
    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lrc/j$a$a;->a:Lpc/f;

    .line 60
    .line 61
    new-instance v2, Lsb/v;

    .line 62
    .line 63
    iget v5, p0, Lrc/j$a$a;->b:I

    .line 64
    .line 65
    invoke-direct {v2, v5, p1}, Lsb/v;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput v4, v0, Lrc/j$a$a$a;->c:I

    .line 69
    .line 70
    invoke-interface {p2, v2, v0}, Lpc/t;->k(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_4
    :goto_1
    iput v3, v0, Lrc/j$a$a$a;->c:I

    .line 78
    .line 79
    invoke-interface {v0}, Lub/e;->getContext()Lub/h;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lp2/m0;->C(Lub/h;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    instance-of v0, p2, Lsc/g;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    check-cast p2, Lsc/g;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-object p2, v2

    .line 99
    :goto_2
    if-nez p2, :cond_6

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_6
    iget-object v0, p2, Lsc/g;->d:Lnc/a0;

    .line 103
    .line 104
    invoke-virtual {v0}, Lnc/a0;->B0()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 111
    .line 112
    iput-object v0, p2, Lsc/g;->f:Ljava/lang/Object;

    .line 113
    .line 114
    iput v4, p2, Lnc/p0;->c:I

    .line 115
    .line 116
    iget-object v0, p2, Lsc/g;->d:Lnc/a0;

    .line 117
    .line 118
    invoke-virtual {v0, p1, p2}, Lnc/a0;->A0(Lub/h;Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_7
    new-instance v0, Lnc/j2;

    .line 123
    .line 124
    invoke-direct {v0}, Lnc/j2;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v0}, Lub/h;->plus(Lub/h;)Lub/h;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    sget-object v3, Lrb/h;->a:Lrb/h;

    .line 132
    .line 133
    iput-object v3, p2, Lsc/g;->f:Ljava/lang/Object;

    .line 134
    .line 135
    iput v4, p2, Lnc/p0;->c:I

    .line 136
    .line 137
    iget-object v5, p2, Lsc/g;->d:Lnc/a0;

    .line 138
    .line 139
    invoke-virtual {v5, p1, p2}, Lnc/a0;->A0(Lub/h;Ljava/lang/Runnable;)V

    .line 140
    .line 141
    .line 142
    iget-boolean p1, v0, Lnc/j2;->b:Z

    .line 143
    .line 144
    if-eqz p1, :cond_d

    .line 145
    .line 146
    invoke-static {}, Lnc/c2;->a()Lnc/x0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v0, p1, Lnc/x0;->e:Lsb/i;

    .line 151
    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    invoke-virtual {v0}, Lsb/i;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    goto :goto_3

    .line 159
    :cond_8
    move v0, v4

    .line 160
    :goto_3
    const/4 v5, 0x0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    invoke-virtual {p1}, Lnc/x0;->F0()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    iput-object v3, p2, Lsc/g;->f:Ljava/lang/Object;

    .line 171
    .line 172
    iput v4, p2, Lnc/p0;->c:I

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lnc/x0;->D0(Lnc/p0;)V

    .line 175
    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_a
    invoke-virtual {p1, v4}, Lnc/x0;->E0(Z)V

    .line 179
    .line 180
    .line 181
    :try_start_0
    invoke-virtual {p2}, Lnc/p0;->run()V

    .line 182
    .line 183
    .line 184
    :cond_b
    invoke-virtual {p1}, Lnc/x0;->H0()Z

    .line 185
    .line 186
    .line 187
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    if-nez v0, :cond_b

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    :try_start_1
    invoke-virtual {p2, v0, v2}, Lnc/p0;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-virtual {p1, v4}, Lnc/x0;->C0(Z)V

    .line 196
    .line 197
    .line 198
    :goto_5
    move v4, v5

    .line 199
    :goto_6
    if-eqz v4, :cond_c

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_c
    :goto_7
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :catchall_1
    move-exception p2

    .line 206
    invoke-virtual {p1, v4}, Lnc/x0;->C0(Z)V

    .line 207
    .line 208
    .line 209
    throw p2

    .line 210
    :cond_d
    :goto_8
    sget-object p1, Lvb/a;->a:Lvb/a;

    .line 211
    .line 212
    :goto_9
    sget-object p2, Lvb/a;->a:Lvb/a;

    .line 213
    .line 214
    if-ne p1, p2, :cond_e

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_e
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 218
    .line 219
    :goto_a
    if-ne p1, v1, :cond_f

    .line 220
    .line 221
    return-object v1

    .line 222
    :cond_f
    :goto_b
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 223
    .line 224
    return-object p1
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
