.class public final Lh9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lka/d0;Lm/e;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lka/d0;->c0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lq0/g;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    const/16 v3, 0xf

    .line 13
    .line 14
    const-wide/16 v4, 0x2

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "unknown index value type "

    .line 22
    .line 23
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lka/d0;->c0()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Lf;->s(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_0
    sget-object v0, Lj9/s;->d:Lka/d0;

    .line 47
    .line 48
    invoke-virtual {p0}, Lka/d0;->Y()Lka/u;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lka/u;->J()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v6, "__type__"

    .line 57
    .line 58
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Lma/w;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    const p0, 0x7fffffff

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_0
    invoke-static {p0}, Lj9/s;->l(Lka/d0;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0}, Lka/d0;->Y()Lka/u;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0}, Lka/u;->J()Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/16 v0, 0x35

    .line 88
    .line 89
    int-to-long v4, v0

    .line 90
    invoke-virtual {p1, v4, v5}, Lm/e;->t(J)V

    .line 91
    .line 92
    .line 93
    const-string v0, "value"

    .line 94
    .line 95
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lka/d0;

    .line 100
    .line 101
    invoke-virtual {v2}, Lka/d0;->R()Lka/b;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Lka/b;->L()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    int-to-long v3, v3

    .line 110
    invoke-virtual {p1, v3, v4}, Lm/e;->t(J)V

    .line 111
    .line 112
    .line 113
    int-to-long v2, v2

    .line 114
    invoke-virtual {p1, v2, v3}, Lm/e;->t(J)V

    .line 115
    .line 116
    .line 117
    int-to-long v1, v1

    .line 118
    invoke-virtual {p1, v1, v2}, Lm/e;->t(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lm/e;->u(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Lka/d0;

    .line 129
    .line 130
    invoke-static {p0, p1}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_1
    const/16 v0, 0x37

    .line 136
    .line 137
    int-to-long v2, v0

    .line 138
    invoke-virtual {p1, v2, v3}, Lm/e;->t(J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lka/u;->J()Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_2

    .line 158
    .line 159
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ljava/util/Map$Entry;

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Lka/d0;

    .line 176
    .line 177
    int-to-long v6, v1

    .line 178
    invoke-virtual {p1, v6, v7}, Lm/e;->t(J)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v2}, Lm/e;->u(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v0, p1}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :pswitch_1
    invoke-virtual {p0}, Lka/d0;->R()Lka/b;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    const/16 v0, 0x32

    .line 193
    .line 194
    int-to-long v0, v0

    .line 195
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lka/b;->h()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_2

    .line 211
    .line 212
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Lka/d0;

    .line 217
    .line 218
    invoke-static {v0, p1}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 219
    .line 220
    .line 221
    goto :goto_1

    .line 222
    :pswitch_2
    invoke-virtual {p0}, Lka/d0;->W()Loa/a;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    const/16 v0, 0x2d

    .line 227
    .line 228
    int-to-long v0, v0

    .line 229
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Loa/a;->J()D

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    invoke-virtual {p1, v0, v1}, Lm/e;->q(D)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Loa/a;->K()D

    .line 240
    .line 241
    .line 242
    move-result-wide v0

    .line 243
    goto/16 :goto_5

    .line 244
    .line 245
    :pswitch_3
    invoke-virtual {p0}, Lka/d0;->Z()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    const/16 v0, 0x25

    .line 250
    .line 251
    int-to-long v0, v0

    .line 252
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 253
    .line 254
    .line 255
    invoke-static {p0}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {p0}, Lj9/e;->q()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    :goto_2
    if-ge v2, v0, :cond_6

    .line 264
    .line 265
    invoke-virtual {p0, v2}, Lj9/e;->n(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    const/16 v3, 0x3c

    .line 270
    .line 271
    int-to-long v3, v3

    .line 272
    invoke-virtual {p1, v3, v4}, Lm/e;->t(J)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v1}, Lm/e;->u(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    add-int/lit8 v2, v2, 0x1

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :pswitch_4
    const/16 v0, 0x1e

    .line 282
    .line 283
    int-to-long v0, v0

    .line 284
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0}, Lka/d0;->T()Lma/h;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p1, p0}, Lm/e;->p(Lma/h;)V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :pswitch_5
    invoke-virtual {p0}, Lka/d0;->a0()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    int-to-long v0, v1

    .line 300
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, p0}, Lm/e;->u(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :cond_2
    :goto_3
    invoke-virtual {p1, v4, v5}, Lm/e;->t(J)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :pswitch_6
    invoke-virtual {p0}, Lka/d0;->b0()Lma/n1;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    const/16 v0, 0x14

    .line 315
    .line 316
    int-to-long v0, v0

    .line 317
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lma/n1;->K()J

    .line 321
    .line 322
    .line 323
    move-result-wide v0

    .line 324
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0}, Lma/n1;->J()I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    int-to-long v0, p0

    .line 332
    goto :goto_6

    .line 333
    :pswitch_7
    invoke-virtual {p0}, Lka/d0;->V()D

    .line 334
    .line 335
    .line 336
    move-result-wide v0

    .line 337
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 338
    .line 339
    .line 340
    move-result p0

    .line 341
    if-eqz p0, :cond_3

    .line 342
    .line 343
    const/16 p0, 0xd

    .line 344
    .line 345
    :goto_4
    int-to-long v0, p0

    .line 346
    goto :goto_7

    .line 347
    :cond_3
    int-to-long v2, v3

    .line 348
    invoke-virtual {p1, v2, v3}, Lm/e;->t(J)V

    .line 349
    .line 350
    .line 351
    const-wide/high16 v2, -0x8000000000000000L

    .line 352
    .line 353
    cmpl-double p0, v0, v2

    .line 354
    .line 355
    if-nez p0, :cond_4

    .line 356
    .line 357
    const-wide/16 v0, 0x0

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :pswitch_8
    int-to-long v0, v3

    .line 361
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0}, Lka/d0;->X()J

    .line 365
    .line 366
    .line 367
    move-result-wide v0

    .line 368
    long-to-double v0, v0

    .line 369
    :cond_4
    :goto_5
    invoke-virtual {p1, v0, v1}, Lm/e;->q(D)V

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :pswitch_9
    const/16 v0, 0xa

    .line 374
    .line 375
    int-to-long v0, v0

    .line 376
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0}, Lka/d0;->S()Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    if-eqz p0, :cond_5

    .line 384
    .line 385
    const-wide/16 v0, 0x1

    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_5
    const-wide/16 v0, 0x0

    .line 389
    .line 390
    :goto_6
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 391
    .line 392
    .line 393
    goto :goto_8

    .line 394
    :pswitch_a
    int-to-long v0, v2

    .line 395
    :goto_7
    invoke-virtual {p1, v0, v1}, Lm/e;->t(J)V

    .line 396
    .line 397
    .line 398
    :cond_6
    :goto_8
    return-void

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
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
