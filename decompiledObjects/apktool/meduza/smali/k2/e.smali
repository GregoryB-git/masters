.class public final Lk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Li2/l;Landroidx/window/extensions/layout/FoldingFeature;)Li2/c;
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v0, v3, :cond_1

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    sget-object v0, Li2/c$a;->c:Li2/c$a;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    sget-object v0, Li2/c$a;->b:Li2/c$a;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getState()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eq v4, v3, :cond_3

    .line 23
    .line 24
    if-eq v4, v1, :cond_2

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_2
    sget-object v1, Li2/b$b;->c:Li2/b$b;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    sget-object v1, Li2/b$b;->b:Li2/b$b;

    .line 31
    .line 32
    :goto_1
    new-instance v4, Lf2/a;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v6, "oemFeature.bounds"

    .line 39
    .line 40
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v4, v5}, Lf2/a;-><init>(Landroid/graphics/Rect;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li2/l;->a()Landroid/graphics/Rect;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget v5, v4, Lf2/a;->d:I

    .line 51
    .line 52
    iget v7, v4, Lf2/a;->b:I

    .line 53
    .line 54
    sub-int/2addr v5, v7

    .line 55
    const/4 v7, 0x0

    .line 56
    if-nez v5, :cond_4

    .line 57
    .line 58
    iget v5, v4, Lf2/a;->c:I

    .line 59
    .line 60
    iget v8, v4, Lf2/a;->a:I

    .line 61
    .line 62
    sub-int/2addr v5, v8

    .line 63
    if-nez v5, :cond_4

    .line 64
    .line 65
    move v5, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move v5, v7

    .line 68
    :goto_2
    if-eqz v5, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    iget v5, v4, Lf2/a;->c:I

    .line 72
    .line 73
    iget v8, v4, Lf2/a;->a:I

    .line 74
    .line 75
    sub-int/2addr v5, v8

    .line 76
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eq v5, v8, :cond_6

    .line 81
    .line 82
    iget v5, v4, Lf2/a;->d:I

    .line 83
    .line 84
    iget v8, v4, Lf2/a;->b:I

    .line 85
    .line 86
    sub-int/2addr v5, v8

    .line 87
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eq v5, v8, :cond_6

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    iget v5, v4, Lf2/a;->c:I

    .line 95
    .line 96
    iget v8, v4, Lf2/a;->a:I

    .line 97
    .line 98
    sub-int/2addr v5, v8

    .line 99
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-ge v5, v8, :cond_7

    .line 104
    .line 105
    iget v5, v4, Lf2/a;->d:I

    .line 106
    .line 107
    iget v8, v4, Lf2/a;->b:I

    .line 108
    .line 109
    sub-int/2addr v5, v8

    .line 110
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-ge v5, v8, :cond_7

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    iget v5, v4, Lf2/a;->c:I

    .line 118
    .line 119
    iget v8, v4, Lf2/a;->a:I

    .line 120
    .line 121
    sub-int/2addr v5, v8

    .line 122
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-ne v5, v8, :cond_8

    .line 127
    .line 128
    iget v5, v4, Lf2/a;->d:I

    .line 129
    .line 130
    iget v4, v4, Lf2/a;->b:I

    .line 131
    .line 132
    sub-int/2addr v5, v4

    .line 133
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-ne v5, p0, :cond_8

    .line 138
    .line 139
    :goto_3
    move v3, v7

    .line 140
    :cond_8
    if-eqz v3, :cond_9

    .line 141
    .line 142
    new-instance v2, Li2/c;

    .line 143
    .line 144
    new-instance p0, Lf2/a;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {p0, p1}, Lf2/a;-><init>(Landroid/graphics/Rect;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v2, p0, v0, v1}, Li2/c;-><init>(Lf2/a;Li2/c$a;Li2/b$b;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    return-object v2
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

.method public static b(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Li2/k;
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1d

    .line 14
    .line 15
    const/16 v2, 0x1e

    .line 16
    .line 17
    if-lt v0, v2, :cond_9

    .line 18
    .line 19
    sget-object v3, Li2/o;->b:Li2/o;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    if-lt v0, v2, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Lm2/a;->c(Landroid/content/Context;)Li2/l;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    move-object v0, p0

    .line 33
    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 34
    .line 35
    const-string v4, " is not a UiContext"

    .line 36
    .line 37
    if-eqz v3, :cond_8

    .line 38
    .line 39
    instance-of v3, v0, Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    instance-of v5, v0, Landroid/inputmethodservice/InputMethodService;

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v5, v0

    .line 50
    check-cast v5, Landroid/content/ContextWrapper;

    .line 51
    .line 52
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    if-nez v6, :cond_7

    .line 57
    .line 58
    :goto_1
    if-eqz v3, :cond_3

    .line 59
    .line 60
    check-cast p0, Landroid/app/Activity;

    .line 61
    .line 62
    invoke-static {p0}, Li2/o;->b(Landroid/app/Activity;)Li2/l;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_3
    instance-of v0, v0, Landroid/inputmethodservice/InputMethodService;

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    const-string v0, "window"

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 79
    .line 80
    invoke-static {p0, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    check-cast p0, Landroid/view/WindowManager;

    .line 84
    .line 85
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-string v0, "wm.defaultDisplay"

    .line 90
    .line 91
    invoke-static {p0, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Landroid/graphics/Point;

    .line 95
    .line 96
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Landroid/graphics/Rect;

    .line 103
    .line 104
    iget v3, v0, Landroid/graphics/Point;->x:I

    .line 105
    .line 106
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-direct {p0, v4, v4, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Li2/l;

    .line 113
    .line 114
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 115
    .line 116
    if-lt v3, v2, :cond_4

    .line 117
    .line 118
    new-instance v1, Le0/s0$d;

    .line 119
    .line 120
    invoke-direct {v1}, Le0/s0$d;-><init>()V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    if-lt v3, v1, :cond_5

    .line 125
    .line 126
    new-instance v1, Le0/s0$c;

    .line 127
    .line 128
    invoke-direct {v1}, Le0/s0$c;-><init>()V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    new-instance v1, Le0/s0$b;

    .line 133
    .line 134
    invoke-direct {v1}, Le0/s0$b;-><init>()V

    .line 135
    .line 136
    .line 137
    :goto_2
    invoke-virtual {v1}, Le0/s0$e;->b()Le0/s0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "Builder().build()"

    .line 142
    .line 143
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, p0, v1}, Li2/l;-><init>(Landroid/graphics/Rect;Le0/s0;)V

    .line 147
    .line 148
    .line 149
    move-object p0, v0

    .line 150
    goto :goto_3

    .line 151
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_7
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const-string v3, "iterator.baseContext"

    .line 177
    .line 178
    invoke-static {v0, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v1, "Context "

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1

    .line 209
    :cond_9
    if-lt v0, v1, :cond_a

    .line 210
    .line 211
    instance-of v0, p0, Landroid/app/Activity;

    .line 212
    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    sget-object v0, Li2/o;->b:Li2/o;

    .line 216
    .line 217
    check-cast p0, Landroid/app/Activity;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {p0}, Li2/o;->b(Landroid/app/Activity;)Li2/l;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    :goto_3
    invoke-static {p0, p1}, Lk2/e;->c(Li2/l;Landroidx/window/extensions/layout/WindowLayoutInfo;)Li2/k;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :cond_a
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 232
    .line 233
    const-string p1, "Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q."

    .line 234
    .line 235
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw p0
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

.method public static c(Li2/l;Landroidx/window/extensions/layout/WindowLayoutInfo;)Li2/k;
    .locals 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    move-result-object p1

    const-string v0, "info.displayFeatures"

    invoke-static {p1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/extensions/layout/DisplayFeature;

    instance-of v2, v1, Landroidx/window/extensions/layout/FoldingFeature;

    if-eqz v2, :cond_1

    const-string v2, "feature"

    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/window/extensions/layout/FoldingFeature;

    invoke-static {p0, v1}, Lk2/e;->a(Li2/l;Landroidx/window/extensions/layout/FoldingFeature;)Li2/c;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Li2/k;

    invoke-direct {p0, v0}, Li2/k;-><init>(Ljava/util/List;)V

    return-object p0
.end method
