.class public final Lg/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/t;


# instance fields
.field public final synthetic a:Lg/g;


# direct methods
.method public constructor <init>(Lg/g;)V
    .locals 0

    iput-object p1, p0, Lg/h;->a:Lg/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Le0/s0;)Le0/s0;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v0, v2, Le0/s0;->a:Le0/s0$k;

    .line 6
    .line 7
    invoke-virtual {v0}, Le0/s0$k;->g()Lx/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v3, v0, Lx/b;->b:I

    .line 12
    .line 13
    move-object/from16 v4, p0

    .line 14
    .line 15
    iget-object v5, v4, Lg/h;->a:Lg/g;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v2, Le0/s0;->a:Le0/s0$k;

    .line 21
    .line 22
    invoke-virtual {v0}, Le0/s0$k;->g()Lx/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v6, v0, Lx/b;->b:I

    .line 27
    .line 28
    iget-object v0, v5, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    .line 29
    .line 30
    const/16 v7, 0x8

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    if-eqz v0, :cond_10

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 40
    .line 41
    if-eqz v0, :cond_10

    .line 42
    .line 43
    iget-object v0, v5, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v9, v0

    .line 50
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 51
    .line 52
    iget-object v0, v5, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v10, 0x1

    .line 59
    if-eqz v0, :cond_e

    .line 60
    .line 61
    iget-object v0, v5, Lg/g;->l0:Landroid/graphics/Rect;

    .line 62
    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    new-instance v0, Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, v5, Lg/g;->l0:Landroid/graphics/Rect;

    .line 71
    .line 72
    new-instance v0, Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v0, v5, Lg/g;->m0:Landroid/graphics/Rect;

    .line 78
    .line 79
    :cond_0
    iget-object v11, v5, Lg/g;->l0:Landroid/graphics/Rect;

    .line 80
    .line 81
    iget-object v0, v5, Lg/g;->m0:Landroid/graphics/Rect;

    .line 82
    .line 83
    iget-object v12, v2, Le0/s0;->a:Le0/s0$k;

    .line 84
    .line 85
    invoke-virtual {v12}, Le0/s0$k;->g()Lx/b;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    iget v12, v12, Lx/b;->a:I

    .line 90
    .line 91
    iget-object v13, v2, Le0/s0;->a:Le0/s0$k;

    .line 92
    .line 93
    invoke-virtual {v13}, Le0/s0$k;->g()Lx/b;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    iget v13, v13, Lx/b;->b:I

    .line 98
    .line 99
    iget-object v14, v2, Le0/s0;->a:Le0/s0$k;

    .line 100
    .line 101
    invoke-virtual {v14}, Le0/s0$k;->g()Lx/b;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    iget v14, v14, Lx/b;->c:I

    .line 106
    .line 107
    iget-object v15, v2, Le0/s0;->a:Le0/s0$k;

    .line 108
    .line 109
    invoke-virtual {v15}, Le0/s0$k;->g()Lx/b;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    iget v15, v15, Lx/b;->d:I

    .line 114
    .line 115
    invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 116
    .line 117
    .line 118
    iget-object v12, v5, Lg/g;->J:Landroid/view/ViewGroup;

    .line 119
    .line 120
    sget-object v13, Ll/f1;->a:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz v13, :cond_1

    .line 123
    .line 124
    const/4 v14, 0x2

    .line 125
    :try_start_0
    new-array v14, v14, [Ljava/lang/Object;

    .line 126
    .line 127
    aput-object v11, v14, v8

    .line 128
    .line 129
    aput-object v0, v14, v10

    .line 130
    .line 131
    invoke-virtual {v13, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :catch_0
    move-exception v0

    .line 136
    const-string v12, "ViewUtils"

    .line 137
    .line 138
    const-string v13, "Could not invoke computeFitSystemWindows"

    .line 139
    .line 140
    invoke-static {v12, v13, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 141
    .line 142
    .line 143
    :cond_1
    :goto_0
    iget v0, v11, Landroid/graphics/Rect;->top:I

    .line 144
    .line 145
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 146
    .line 147
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 148
    .line 149
    iget-object v13, v5, Lg/g;->J:Landroid/view/ViewGroup;

    .line 150
    .line 151
    sget-object v14, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 152
    .line 153
    invoke-static {v13}, Le0/d0$e;->a(Landroid/view/View;)Le0/s0;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    if-nez v13, :cond_2

    .line 158
    .line 159
    move v14, v8

    .line 160
    goto :goto_1

    .line 161
    :cond_2
    iget-object v14, v13, Le0/s0;->a:Le0/s0$k;

    .line 162
    .line 163
    invoke-virtual {v14}, Le0/s0$k;->g()Lx/b;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    iget v14, v14, Lx/b;->a:I

    .line 168
    .line 169
    :goto_1
    if-nez v13, :cond_3

    .line 170
    .line 171
    move v13, v8

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    iget-object v13, v13, Le0/s0;->a:Le0/s0$k;

    .line 174
    .line 175
    invoke-virtual {v13}, Le0/s0$k;->g()Lx/b;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    iget v13, v13, Lx/b;->c:I

    .line 180
    .line 181
    :goto_2
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 182
    .line 183
    if-ne v15, v0, :cond_5

    .line 184
    .line 185
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 186
    .line 187
    if-ne v15, v12, :cond_5

    .line 188
    .line 189
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 190
    .line 191
    if-eq v15, v11, :cond_4

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_4
    move v11, v8

    .line 195
    goto :goto_4

    .line 196
    :cond_5
    :goto_3
    iput v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 197
    .line 198
    iput v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 199
    .line 200
    iput v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 201
    .line 202
    move v11, v10

    .line 203
    :goto_4
    if-lez v0, :cond_6

    .line 204
    .line 205
    iget-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 206
    .line 207
    if-nez v0, :cond_6

    .line 208
    .line 209
    new-instance v0, Landroid/view/View;

    .line 210
    .line 211
    iget-object v12, v5, Lg/g;->s:Landroid/content/Context;

    .line 212
    .line 213
    invoke-direct {v0, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    iput-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 217
    .line 218
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 222
    .line 223
    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 224
    .line 225
    const/16 v15, 0x33

    .line 226
    .line 227
    const/4 v7, -0x1

    .line 228
    invoke-direct {v0, v7, v12, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 229
    .line 230
    .line 231
    iput v14, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 232
    .line 233
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 234
    .line 235
    iget-object v12, v5, Lg/g;->J:Landroid/view/ViewGroup;

    .line 236
    .line 237
    iget-object v13, v5, Lg/g;->L:Landroid/view/View;

    .line 238
    .line 239
    invoke-virtual {v12, v13, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_6
    iget-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 244
    .line 245
    if-eqz v0, :cond_8

    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 252
    .line 253
    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 254
    .line 255
    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 256
    .line 257
    if-ne v7, v12, :cond_7

    .line 258
    .line 259
    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 260
    .line 261
    if-ne v7, v14, :cond_7

    .line 262
    .line 263
    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 264
    .line 265
    if-eq v7, v13, :cond_8

    .line 266
    .line 267
    :cond_7
    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 268
    .line 269
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 270
    .line 271
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 272
    .line 273
    iget-object v7, v5, Lg/g;->L:Landroid/view/View;

    .line 274
    .line 275
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    :goto_5
    iget-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 279
    .line 280
    if-eqz v0, :cond_9

    .line 281
    .line 282
    move v7, v10

    .line 283
    goto :goto_6

    .line 284
    :cond_9
    move v7, v8

    .line 285
    :goto_6
    if-eqz v7, :cond_c

    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_c

    .line 292
    .line 293
    iget-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    and-int/lit16 v12, v12, 0x2000

    .line 300
    .line 301
    if-eqz v12, :cond_a

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_a
    move v10, v8

    .line 305
    :goto_7
    if-eqz v10, :cond_b

    .line 306
    .line 307
    iget-object v10, v5, Lg/g;->s:Landroid/content/Context;

    .line 308
    .line 309
    const v12, 0x7f060006

    .line 310
    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_b
    iget-object v10, v5, Lg/g;->s:Landroid/content/Context;

    .line 314
    .line 315
    const v12, 0x7f060005

    .line 316
    .line 317
    .line 318
    :goto_8
    invoke-static {v10, v12}, Lv/a;->getColor(Landroid/content/Context;I)I

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    invoke-virtual {v0, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 323
    .line 324
    .line 325
    :cond_c
    iget-boolean v0, v5, Lg/g;->Q:Z

    .line 326
    .line 327
    if-nez v0, :cond_d

    .line 328
    .line 329
    if-eqz v7, :cond_d

    .line 330
    .line 331
    move v6, v8

    .line 332
    :cond_d
    move v10, v11

    .line 333
    goto :goto_9

    .line 334
    :cond_e
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 335
    .line 336
    if-eqz v0, :cond_f

    .line 337
    .line 338
    iput v8, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 339
    .line 340
    move v7, v8

    .line 341
    goto :goto_9

    .line 342
    :cond_f
    move v7, v8

    .line 343
    move v10, v7

    .line 344
    :goto_9
    if-eqz v10, :cond_11

    .line 345
    .line 346
    iget-object v0, v5, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    .line 347
    .line 348
    invoke-virtual {v0, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 349
    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_10
    move v7, v8

    .line 353
    :cond_11
    :goto_a
    iget-object v0, v5, Lg/g;->L:Landroid/view/View;

    .line 354
    .line 355
    if-eqz v0, :cond_13

    .line 356
    .line 357
    if-eqz v7, :cond_12

    .line 358
    .line 359
    move v7, v8

    .line 360
    goto :goto_b

    .line 361
    :cond_12
    const/16 v7, 0x8

    .line 362
    .line 363
    :goto_b
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    :cond_13
    if-eq v3, v6, :cond_16

    .line 367
    .line 368
    iget-object v0, v2, Le0/s0;->a:Le0/s0$k;

    .line 369
    .line 370
    invoke-virtual {v0}, Le0/s0$k;->g()Lx/b;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iget v0, v0, Lx/b;->a:I

    .line 375
    .line 376
    iget-object v3, v2, Le0/s0;->a:Le0/s0$k;

    .line 377
    .line 378
    invoke-virtual {v3}, Le0/s0$k;->g()Lx/b;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    iget v3, v3, Lx/b;->c:I

    .line 383
    .line 384
    iget-object v5, v2, Le0/s0;->a:Le0/s0$k;

    .line 385
    .line 386
    invoke-virtual {v5}, Le0/s0$k;->g()Lx/b;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    iget v5, v5, Lx/b;->d:I

    .line 391
    .line 392
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 393
    .line 394
    const/16 v8, 0x1e

    .line 395
    .line 396
    if-lt v7, v8, :cond_14

    .line 397
    .line 398
    new-instance v7, Le0/s0$d;

    .line 399
    .line 400
    invoke-direct {v7, v2}, Le0/s0$d;-><init>(Le0/s0;)V

    .line 401
    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_14
    const/16 v8, 0x1d

    .line 405
    .line 406
    if-lt v7, v8, :cond_15

    .line 407
    .line 408
    new-instance v7, Le0/s0$c;

    .line 409
    .line 410
    invoke-direct {v7, v2}, Le0/s0$c;-><init>(Le0/s0;)V

    .line 411
    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_15
    new-instance v7, Le0/s0$b;

    .line 415
    .line 416
    invoke-direct {v7, v2}, Le0/s0$b;-><init>(Le0/s0;)V

    .line 417
    .line 418
    .line 419
    :goto_c
    invoke-static {v0, v6, v3, v5}, Lx/b;->a(IIII)Lx/b;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v7, v0}, Le0/s0$e;->d(Lx/b;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v7}, Le0/s0$e;->b()Le0/s0;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    goto :goto_d

    .line 431
    :cond_16
    move-object v0, v2

    .line 432
    :goto_d
    sget-object v2, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 433
    .line 434
    invoke-virtual {v0}, Le0/s0;->b()Landroid/view/WindowInsets;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    if-eqz v2, :cond_17

    .line 439
    .line 440
    invoke-static {v1, v2}, Le0/d0$c;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_17

    .line 449
    .line 450
    invoke-static {v3, v1}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :cond_17
    return-object v0
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
