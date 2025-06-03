.class public final synthetic Lb0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb0/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lb0/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :pswitch_0
    check-cast p1, Lk9/g;

    .line 10
    .line 11
    check-cast p2, Lk9/g;

    .line 12
    .line 13
    iget p1, p1, Lk9/g;->a:I

    .line 14
    .line 15
    iget p2, p2, Lk9/g;->a:I

    .line 16
    .line 17
    invoke-static {p1, p2}, Ln9/o;->d(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_1
    check-cast p1, Lj9/k;

    .line 23
    .line 24
    check-cast p2, Lj9/k;

    .line 25
    .line 26
    sget-object v0, Li9/t0;->k:[B

    .line 27
    .line 28
    invoke-virtual {p1}, Lj9/k;->e()Lj9/k$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lj9/k$b;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p2}, Lj9/k;->e()Lj9/k$b;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lj9/k$b;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p1}, Lj9/k;->b()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p2}, Lj9/k;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :cond_0
    return v0

    .line 63
    :pswitch_2
    check-cast p1, Li9/c;

    .line 64
    .line 65
    check-cast p2, Li9/c;

    .line 66
    .line 67
    iget-object v0, p1, Li9/c;->a:Lj9/i;

    .line 68
    .line 69
    iget-object v1, p2, Li9/c;->a:Lj9/i;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lj9/i;->f(Lj9/i;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget p1, p1, Li9/c;->b:I

    .line 79
    .line 80
    iget p2, p2, Li9/c;->b:I

    .line 81
    .line 82
    invoke-static {p1, p2}, Ln9/o;->d(II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    :goto_0
    return v0

    .line 87
    :pswitch_3
    check-cast p1, Ljava/io/File;

    .line 88
    .line 89
    check-cast p2, Ljava/io/File;

    .line 90
    .line 91
    sget-object v0, Lp8/c;->e:Ljava/nio/charset/Charset;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget v0, Lp8/c;->f:I

    .line 98
    .line 99
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    return p1

    .line 116
    :pswitch_4
    check-cast p1, Lt5/i0$a;

    .line 117
    .line 118
    check-cast p2, Lt5/i0$a;

    .line 119
    .line 120
    iget p1, p1, Lt5/i0$a;->a:I

    .line 121
    .line 122
    iget p2, p2, Lt5/i0$a;->a:I

    .line 123
    .line 124
    sub-int/2addr p1, p2

    .line 125
    return p1

    .line 126
    :pswitch_5
    check-cast p1, Lcom/google/android/exoplayer2/ui/b$b;

    .line 127
    .line 128
    check-cast p2, Lcom/google/android/exoplayer2/ui/b$b;

    .line 129
    .line 130
    iget v0, p2, Lcom/google/android/exoplayer2/ui/b$b;->a:I

    .line 131
    .line 132
    iget v1, p1, Lcom/google/android/exoplayer2/ui/b$b;->a:I

    .line 133
    .line 134
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    iget-object v0, p2, Lcom/google/android/exoplayer2/ui/b$b;->c:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p1, Lcom/google/android/exoplayer2/ui/b$b;->c:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    iget-object p2, p2, Lcom/google/android/exoplayer2/ui/b$b;->d:Ljava/lang/String;

    .line 153
    .line 154
    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/b$b;->d:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    :goto_1
    return v0

    .line 161
    :pswitch_6
    check-cast p1, Lr5/f$i;

    .line 162
    .line 163
    check-cast p2, Lr5/f$i;

    .line 164
    .line 165
    invoke-static {p1, p2}, Lr5/f$i;->i(Lr5/f$i;Lr5/f$i;)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    return p1

    .line 170
    :pswitch_7
    check-cast p1, Lr5/f$i;

    .line 171
    .line 172
    check-cast p2, Lr5/f$i;

    .line 173
    .line 174
    invoke-static {p1, p2}, Lr5/f$i;->h(Lr5/f$i;Lr5/f$i;)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    return p1

    .line 179
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 180
    .line 181
    check-cast p2, Ljava/lang/Integer;

    .line 182
    .line 183
    sget-object v0, Lr5/f;->j:Lo7/k0;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    const/4 v2, -0x1

    .line 190
    if-ne v0, v2, :cond_5

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-ne p1, v2, :cond_4

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    move v1, v2

    .line 200
    goto :goto_2

    .line 201
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-ne v0, v2, :cond_6

    .line 206
    .line 207
    const/4 v1, 0x1

    .line 208
    goto :goto_2

    .line 209
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    sub-int v1, p1, p2

    .line 218
    .line 219
    :goto_2
    return v1

    .line 220
    :pswitch_9
    check-cast p1, Lq5/f$a;

    .line 221
    .line 222
    check-cast p2, Lq5/f$a;

    .line 223
    .line 224
    iget-object p1, p1, Lq5/f$a;->a:Lq5/f$b;

    .line 225
    .line 226
    iget p1, p1, Lq5/f$b;->b:I

    .line 227
    .line 228
    iget-object p2, p2, Lq5/f$a;->a:Lq5/f$b;

    .line 229
    .line 230
    iget p2, p2, Lq5/f$b;->b:I

    .line 231
    .line 232
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    return p1

    .line 237
    :pswitch_a
    check-cast p1, Li5/b$a;

    .line 238
    .line 239
    check-cast p2, Li5/b$a;

    .line 240
    .line 241
    iget p2, p2, Li5/b$a;->b:I

    .line 242
    .line 243
    iget p1, p1, Li5/b$a;->b:I

    .line 244
    .line 245
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    return p1

    .line 250
    :pswitch_b
    check-cast p1, [B

    .line 251
    .line 252
    check-cast p2, [B

    .line 253
    .line 254
    array-length v0, p1

    .line 255
    array-length v2, p2

    .line 256
    if-eq v0, v2, :cond_7

    .line 257
    .line 258
    array-length p1, p1

    .line 259
    array-length p2, p2

    .line 260
    sub-int v1, p1, p2

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_7
    move v0, v1

    .line 264
    :goto_3
    array-length v2, p1

    .line 265
    if-ge v0, v2, :cond_9

    .line 266
    .line 267
    aget-byte v2, p1, v0

    .line 268
    .line 269
    aget-byte v3, p2, v0

    .line 270
    .line 271
    if-eq v2, v3, :cond_8

    .line 272
    .line 273
    sub-int v1, v2, v3

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_9
    :goto_4
    return v1

    .line 280
    :goto_5
    check-cast p1, Ljava/lang/Comparable;

    .line 281
    .line 282
    check-cast p2, Ljava/lang/Comparable;

    .line 283
    .line 284
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    return p1

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
