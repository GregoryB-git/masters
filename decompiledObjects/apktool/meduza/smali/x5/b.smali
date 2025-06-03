.class public final Lx5/b;
.super Lv3/f;
.source "SourceFile"


# instance fields
.field public final u:Lz3/g;

.field public final v:Lv5/u;

.field public w:J

.field public x:Lx5/a;

.field public y:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lv3/f;-><init>(I)V

    new-instance v0, Lz3/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz3/g;-><init>(I)V

    iput-object v0, p0, Lx5/b;->u:Lz3/g;

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lx5/b;->v:Lv5/u;

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 1

    iget-object v0, p0, Lx5/b;->x:Lx5/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx5/a;->f()V

    :cond_0
    return-void
.end method

.method public final D(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lx5/b;->y:J

    iget-object p1, p0, Lx5/b;->x:Lx5/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lx5/a;->f()V

    :cond_0
    return-void
.end method

.method public final H([Lv3/i0;JJ)V
    .locals 0

    iput-wide p4, p0, Lx5/b;->w:J

    return-void
.end method

.method public final a(Lv3/i0;)I
    .locals 1

    iget-object p1, p1, Lv3/i0;->t:Ljava/lang/String;

    const-string v0, "application/x-camera-motion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    invoke-static {p1, v0, v0}, La0/j;->b(III)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {v0, v0, v0}, La0/j;->b(III)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lv3/f;->h()Z

    move-result v0

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public final p(JJ)V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lv3/f;->h()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_6

    .line 6
    .line 7
    iget-wide p3, p0, Lx5/b;->y:J

    .line 8
    .line 9
    const-wide/32 v0, 0x186a0

    .line 10
    .line 11
    .line 12
    add-long/2addr v0, p1

    .line 13
    cmp-long p3, p3, v0

    .line 14
    .line 15
    if-gez p3, :cond_6

    .line 16
    .line 17
    iget-object p3, p0, Lx5/b;->u:Lz3/g;

    .line 18
    .line 19
    invoke-virtual {p3}, Lz3/g;->o()V

    .line 20
    .line 21
    .line 22
    iget-object p3, p0, Lv3/f;->b:Ll3/l;

    .line 23
    .line 24
    const/4 p4, 0x0

    .line 25
    iput-object p4, p3, Ll3/l;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p4, p3, Ll3/l;->b:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, p0, Lx5/b;->u:Lz3/g;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, p3, v0, v1}, Lv3/f;->I(Ll3/l;Lz3/g;I)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    const/4 v0, -0x4

    .line 37
    if-ne p3, v0, :cond_6

    .line 38
    .line 39
    iget-object p3, p0, Lx5/b;->u:Lz3/g;

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    invoke-virtual {p3, v0}, Lz3/a;->m(I)Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-eqz p3, :cond_1

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    iget-object p3, p0, Lx5/b;->u:Lz3/g;

    .line 50
    .line 51
    iget-wide v2, p3, Lz3/g;->e:J

    .line 52
    .line 53
    iput-wide v2, p0, Lx5/b;->y:J

    .line 54
    .line 55
    iget-object v2, p0, Lx5/b;->x:Lx5/a;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    invoke-virtual {p3}, Lz3/a;->n()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p3, p0, Lx5/b;->u:Lz3/g;

    .line 67
    .line 68
    invoke-virtual {p3}, Lz3/g;->r()V

    .line 69
    .line 70
    .line 71
    iget-object p3, p0, Lx5/b;->u:Lz3/g;

    .line 72
    .line 73
    iget-object p3, p3, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    sget v2, Lv5/e0;->a:I

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    const/16 v3, 0x10

    .line 82
    .line 83
    if-eq v2, v3, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget-object p4, p0, Lx5/b;->v:Lv5/u;

    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p4, v2, v3}, Lv5/u;->E([BI)V

    .line 97
    .line 98
    .line 99
    iget-object p4, p0, Lx5/b;->v:Lv5/u;

    .line 100
    .line 101
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    add-int/2addr p3, v0

    .line 106
    invoke-virtual {p4, p3}, Lv5/u;->G(I)V

    .line 107
    .line 108
    .line 109
    const/4 p3, 0x3

    .line 110
    new-array p4, p3, [F

    .line 111
    .line 112
    :goto_1
    if-ge v1, p3, :cond_4

    .line 113
    .line 114
    iget-object v0, p0, Lx5/b;->v:Lv5/u;

    .line 115
    .line 116
    invoke-virtual {v0}, Lv5/u;->i()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    aput v0, p4, v1

    .line 125
    .line 126
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    :goto_2
    if-nez p4, :cond_5

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_5
    iget-object p3, p0, Lx5/b;->x:Lx5/a;

    .line 134
    .line 135
    iget-wide v0, p0, Lx5/b;->y:J

    .line 136
    .line 137
    iget-wide v2, p0, Lx5/b;->w:J

    .line 138
    .line 139
    sub-long/2addr v0, v2

    .line 140
    invoke-interface {p3, v0, v1, p4}, Lx5/a;->a(J[F)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_6
    :goto_3
    return-void
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

.method public final q(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lx5/a;

    iput-object p2, p0, Lx5/b;->x:Lx5/a;

    :cond_0
    return-void
.end method
