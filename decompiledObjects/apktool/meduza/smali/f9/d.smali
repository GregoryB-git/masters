.class public final Lf9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf9/a;

.field public final b:Lf9/e;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashMap;

.field public e:Lt8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/m;",
            ">;"
        }
    .end annotation
.end field

.field public f:J

.field public g:Lf9/h;


# direct methods
.method public constructor <init>(Li9/n;Lf9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf9/d;->a:Lf9/a;

    .line 5
    .line 6
    iput-object p2, p0, Lf9/d;->b:Lf9/e;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lf9/d;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object p1, Lj9/h;->a:Lt8/b;

    .line 16
    .line 17
    iput-object p1, p0, Lf9/d;->e:Lt8/c;

    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lf9/d;->d:Ljava/util/HashMap;

    .line 25
    .line 26
    return-void
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


# virtual methods
.method public final a(Lf9/c;J)Ld9/d0;
    .locals 12

    .line 1
    instance-of v0, p1, Lf9/e;

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "Unexpected bundle metadata element."

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Lx6/b;->p(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lf9/d;->e:Lt8/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lt8/c;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    instance-of v1, p1, Lf9/j;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lf9/d;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    check-cast p1, Lf9/j;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    instance-of v1, p1, Lf9/h;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    check-cast p1, Lf9/h;

    .line 37
    .line 38
    iget-object v1, p0, Lf9/d;->d:Ljava/util/HashMap;

    .line 39
    .line 40
    iget-object v3, p1, Lf9/h;->a:Lj9/i;

    .line 41
    .line 42
    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lf9/d;->g:Lf9/h;

    .line 46
    .line 47
    iget-boolean v1, p1, Lf9/h;->c:Z

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, Lf9/d;->e:Lt8/c;

    .line 52
    .line 53
    iget-object v3, p1, Lf9/h;->a:Lj9/i;

    .line 54
    .line 55
    iget-object v4, p1, Lf9/h;->b:Lj9/q;

    .line 56
    .line 57
    invoke-static {v3, v4}, Lj9/m;->n(Lj9/i;Lj9/q;)Lj9/m;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object p1, p1, Lf9/h;->b:Lj9/q;

    .line 62
    .line 63
    iput-object p1, v4, Lj9/m;->e:Lj9/q;

    .line 64
    .line 65
    invoke-virtual {v1, v3, v4}, Lt8/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    instance-of v1, p1, Lf9/b;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    check-cast p1, Lf9/b;

    .line 75
    .line 76
    iget-object v1, p0, Lf9/d;->g:Lf9/h;

    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    iget-object v3, p1, Lf9/b;->a:Lj9/m;

    .line 81
    .line 82
    iget-object v3, v3, Lj9/m;->b:Lj9/i;

    .line 83
    .line 84
    iget-object v1, v1, Lf9/h;->a:Lj9/i;

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Lj9/i;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    iget-object v1, p0, Lf9/d;->e:Lt8/c;

    .line 93
    .line 94
    iget-object p1, p1, Lf9/b;->a:Lj9/m;

    .line 95
    .line 96
    iget-object v3, p1, Lj9/m;->b:Lj9/i;

    .line 97
    .line 98
    iget-object v4, p0, Lf9/d;->g:Lf9/h;

    .line 99
    .line 100
    iget-object v4, v4, Lf9/h;->b:Lj9/q;

    .line 101
    .line 102
    iput-object v4, p1, Lj9/m;->e:Lj9/q;

    .line 103
    .line 104
    invoke-virtual {v1, v3, p1}, Lt8/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_0
    iput-object p1, p0, Lf9/d;->e:Lt8/c;

    .line 109
    .line 110
    iput-object v2, p0, Lf9/d;->g:Lf9/h;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    const-string p2, "The document being added does not match the stored metadata."

    .line 116
    .line 117
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_3
    :goto_1
    iget-wide v3, p0, Lf9/d;->f:J

    .line 122
    .line 123
    add-long/2addr v3, p2

    .line 124
    iput-wide v3, p0, Lf9/d;->f:J

    .line 125
    .line 126
    iget-object p1, p0, Lf9/d;->e:Lt8/c;

    .line 127
    .line 128
    invoke-virtual {p1}, Lt8/c;->size()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eq v0, p1, :cond_4

    .line 133
    .line 134
    new-instance v2, Ld9/d0;

    .line 135
    .line 136
    iget-object p1, p0, Lf9/d;->e:Lt8/c;

    .line 137
    .line 138
    invoke-virtual {p1}, Lt8/c;->size()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object p1, p0, Lf9/d;->b:Lf9/e;

    .line 143
    .line 144
    iget v5, p1, Lf9/e;->d:I

    .line 145
    .line 146
    iget-wide v6, p0, Lf9/d;->f:J

    .line 147
    .line 148
    iget-wide v8, p1, Lf9/e;->e:J

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v11, 0x2

    .line 152
    move-object v3, v2

    .line 153
    invoke-direct/range {v3 .. v11}, Ld9/d0;-><init>(IIJJLcom/google/firebase/firestore/f;I)V

    .line 154
    .line 155
    .line 156
    :cond_4
    return-object v2
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

.method public final b()Lt8/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lf9/d;->g:Lf9/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "Bundled documents end with a document metadata element instead of a document."

    .line 13
    .line 14
    invoke-static {v4, v0, v3}, Lx6/b;->p(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lf9/d;->b:Lf9/e;

    .line 18
    .line 19
    iget-object v0, v0, Lf9/e;->a:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move v0, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, v2

    .line 26
    :goto_1
    new-array v3, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    const-string v4, "Bundle ID must be set"

    .line 29
    .line 30
    invoke-static {v4, v0, v3}, Lx6/b;->p(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lf9/d;->e:Lt8/c;

    .line 34
    .line 35
    invoke-virtual {v0}, Lt8/c;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lf9/d;->b:Lf9/e;

    .line 40
    .line 41
    iget v3, v3, Lf9/e;->d:I

    .line 42
    .line 43
    if-ne v0, v3, :cond_2

    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v0, v2

    .line 48
    :goto_2
    const/4 v4, 0x2

    .line 49
    new-array v4, v4, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    aput-object v3, v4, v2

    .line 56
    .line 57
    iget-object v2, p0, Lf9/d;->e:Lt8/c;

    .line 58
    .line 59
    invoke-virtual {v2}, Lt8/c;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    aput-object v2, v4, v1

    .line 68
    .line 69
    const-string v1, "Expected %s documents, but loaded %s."

    .line 70
    .line 71
    invoke-static {v1, v0, v4}, Lx6/b;->p(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lf9/d;->a:Lf9/a;

    .line 75
    .line 76
    iget-object v1, p0, Lf9/d;->e:Lt8/c;

    .line 77
    .line 78
    iget-object v2, p0, Lf9/d;->b:Lf9/e;

    .line 79
    .line 80
    iget-object v2, v2, Lf9/e;->a:Ljava/lang/String;

    .line 81
    .line 82
    check-cast v0, Li9/n;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v4, "__bundle__/docs/"

    .line 93
    .line 94
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v2}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    new-instance v3, Lg9/f0;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, v2, v4}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Lg9/f0;->i()Lg9/k0;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v2}, Li9/n;->a(Lg9/k0;)Li9/m1;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v3, v0, Li9/n;->a:Le9/a;

    .line 123
    .line 124
    new-instance v4, Lr3/o;

    .line 125
    .line 126
    invoke-direct {v4, v0, v1, v2}, Lr3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const-string v0, "Apply bundle documents"

    .line 130
    .line 131
    invoke-virtual {v3, v0, v4}, Le9/a;->x(Ljava/lang/String;Ln9/l;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lt8/c;

    .line 136
    .line 137
    new-instance v1, Ljava/util/HashMap;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lf9/d;->c:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_3

    .line 153
    .line 154
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lf9/j;

    .line 159
    .line 160
    iget-object v3, v3, Lf9/j;->a:Ljava/lang/String;

    .line 161
    .line 162
    sget-object v4, Lj9/i;->c:Lt8/e;

    .line 163
    .line 164
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_3
    iget-object v2, p0, Lf9/d;->d:Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_5

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Lf9/h;

    .line 189
    .line 190
    iget-object v4, v3, Lf9/h;->d:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_4

    .line 201
    .line 202
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lt8/e;

    .line 213
    .line 214
    iget-object v7, v3, Lf9/h;->a:Lj9/i;

    .line 215
    .line 216
    invoke-virtual {v6, v7}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_5
    iget-object v2, p0, Lf9/d;->c:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_6

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v6, v3

    .line 241
    check-cast v6, Lf9/j;

    .line 242
    .line 243
    iget-object v3, p0, Lf9/d;->a:Lf9/a;

    .line 244
    .line 245
    iget-object v4, v6, Lf9/j;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    move-object v9, v4

    .line 252
    check-cast v9, Lt8/e;

    .line 253
    .line 254
    move-object v5, v3

    .line 255
    check-cast v5, Li9/n;

    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object v3, v6, Lf9/j;->b:Lf9/i;

    .line 261
    .line 262
    iget-object v3, v3, Lf9/i;->a:Lg9/k0;

    .line 263
    .line 264
    invoke-virtual {v5, v3}, Li9/n;->a(Lg9/k0;)Li9/m1;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    iget v8, v7, Li9/m1;->b:I

    .line 269
    .line 270
    iget-object v3, v5, Li9/n;->a:Le9/a;

    .line 271
    .line 272
    new-instance v10, Li9/j;

    .line 273
    .line 274
    move-object v4, v10

    .line 275
    invoke-direct/range {v4 .. v9}, Li9/j;-><init>(Li9/n;Lf9/j;Li9/m1;ILt8/e;)V

    .line 276
    .line 277
    .line 278
    const-string v4, "Saved named query"

    .line 279
    .line 280
    invoke-virtual {v3, v4, v10}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_6
    iget-object v1, p0, Lf9/d;->a:Lf9/a;

    .line 285
    .line 286
    iget-object v2, p0, Lf9/d;->b:Lf9/e;

    .line 287
    .line 288
    check-cast v1, Li9/n;

    .line 289
    .line 290
    iget-object v3, v1, Li9/n;->a:Le9/a;

    .line 291
    .line 292
    new-instance v4, Lg/q;

    .line 293
    .line 294
    const/16 v5, 0x11

    .line 295
    .line 296
    invoke-direct {v4, v5, v1, v2}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    const-string v1, "Save bundle"

    .line 300
    .line 301
    invoke-virtual {v3, v1, v4}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 302
    .line 303
    .line 304
    return-object v0
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
