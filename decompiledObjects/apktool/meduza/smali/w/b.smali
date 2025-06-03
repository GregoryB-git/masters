.class public final Lw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/util/TypedValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lw/b;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1

    invoke-static {p0, p1, v0, p2}, Lw/b;->b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "selector"

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_2d

    .line 18
    .line 19
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x1

    .line 24
    add-int/2addr v3, v4

    .line 25
    const/16 v5, 0x14

    .line 26
    .line 27
    new-array v6, v5, [[I

    .line 28
    .line 29
    new-array v5, v5, [I

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    move v8, v7

    .line 33
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-eq v9, v4, :cond_2c

    .line 38
    .line 39
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    const/4 v11, 0x3

    .line 44
    if-ge v10, v3, :cond_0

    .line 45
    .line 46
    if-eq v9, v11, :cond_2c

    .line 47
    .line 48
    :cond_0
    const/4 v12, 0x2

    .line 49
    if-ne v9, v12, :cond_2b

    .line 50
    .line 51
    if-gt v10, v3, :cond_2b

    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    const-string v10, "item"

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_1

    .line 64
    .line 65
    goto/16 :goto_20

    .line 66
    .line 67
    :cond_1
    sget-object v9, Lb/a0;->a0:[I

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0, v1, v9}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v2, v1, v9, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    :goto_1
    const/4 v10, -0x1

    .line 81
    invoke-virtual {v9, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    const/16 v14, 0x1f

    .line 86
    .line 87
    const v15, -0xff01

    .line 88
    .line 89
    .line 90
    if-eq v13, v10, :cond_5

    .line 91
    .line 92
    sget-object v10, Lw/b;->a:Ljava/lang/ThreadLocal;

    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v16

    .line 98
    check-cast v16, Landroid/util/TypedValue;

    .line 99
    .line 100
    if-nez v16, :cond_3

    .line 101
    .line 102
    new-instance v12, Landroid/util/TypedValue;

    .line 103
    .line 104
    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v12}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object/from16 v12, v16

    .line 112
    .line 113
    :goto_2
    invoke-virtual {v0, v13, v12, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 114
    .line 115
    .line 116
    iget v10, v12, Landroid/util/TypedValue;->type:I

    .line 117
    .line 118
    const/16 v12, 0x1c

    .line 119
    .line 120
    if-lt v10, v12, :cond_4

    .line 121
    .line 122
    if-gt v10, v14, :cond_4

    .line 123
    .line 124
    move v10, v4

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    move v10, v7

    .line 127
    :goto_3
    if-nez v10, :cond_5

    .line 128
    .line 129
    :try_start_0
    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-static {v0, v10, v2}, Lw/b;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 138
    .line 139
    .line 140
    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    goto :goto_4

    .line 142
    :catch_0
    :cond_5
    invoke-virtual {v9, v7, v15}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    :goto_4
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    const/high16 v13, 0x3f800000    # 1.0f

    .line 151
    .line 152
    if-eqz v12, :cond_6

    .line 153
    .line 154
    invoke-virtual {v9, v4, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    goto :goto_5

    .line 159
    :cond_6
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    if-eqz v12, :cond_7

    .line 164
    .line 165
    invoke-virtual {v9, v11, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    move v11, v13

    .line 171
    :goto_5
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 172
    .line 173
    const/high16 v15, -0x40800000    # -1.0f

    .line 174
    .line 175
    if-lt v12, v14, :cond_8

    .line 176
    .line 177
    const/4 v12, 0x2

    .line 178
    invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_8

    .line 183
    .line 184
    const/4 v12, 0x2

    .line 185
    goto :goto_6

    .line 186
    :cond_8
    const/4 v12, 0x4

    .line 187
    :goto_6
    invoke-virtual {v9, v12, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 192
    .line 193
    .line 194
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    new-array v14, v9, [I

    .line 199
    .line 200
    move v4, v7

    .line 201
    move v15, v4

    .line 202
    :goto_7
    if-ge v15, v9, :cond_b

    .line 203
    .line 204
    invoke-interface {v1, v15}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    const v7, 0x10101a5

    .line 209
    .line 210
    .line 211
    if-eq v13, v7, :cond_a

    .line 212
    .line 213
    const v7, 0x101031f

    .line 214
    .line 215
    .line 216
    if-eq v13, v7, :cond_a

    .line 217
    .line 218
    const v7, 0x7f04002d

    .line 219
    .line 220
    .line 221
    if-eq v13, v7, :cond_a

    .line 222
    .line 223
    const v7, 0x7f0400ba

    .line 224
    .line 225
    .line 226
    if-eq v13, v7, :cond_a

    .line 227
    .line 228
    add-int/lit8 v7, v4, 0x1

    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    invoke-interface {v1, v15, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 232
    .line 233
    .line 234
    move-result v18

    .line 235
    if-eqz v18, :cond_9

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_9
    neg-int v13, v13

    .line 239
    :goto_8
    aput v13, v14, v4

    .line 240
    .line 241
    move v4, v7

    .line 242
    :cond_a
    add-int/lit8 v15, v15, 0x1

    .line 243
    .line 244
    move-object/from16 v0, p0

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v13, 0x3f800000    # 1.0f

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    invoke-static {v14, v4}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const/4 v4, 0x0

    .line 255
    cmpl-float v7, v12, v4

    .line 256
    .line 257
    const/high16 v9, 0x42c80000    # 100.0f

    .line 258
    .line 259
    if-ltz v7, :cond_c

    .line 260
    .line 261
    cmpg-float v7, v12, v9

    .line 262
    .line 263
    if-gtz v7, :cond_c

    .line 264
    .line 265
    const/4 v7, 0x1

    .line 266
    goto :goto_9

    .line 267
    :cond_c
    const/4 v7, 0x0

    .line 268
    :goto_9
    const/high16 v13, 0x3f800000    # 1.0f

    .line 269
    .line 270
    cmpl-float v14, v11, v13

    .line 271
    .line 272
    if-nez v14, :cond_d

    .line 273
    .line 274
    if-nez v7, :cond_d

    .line 275
    .line 276
    move/from16 v33, v3

    .line 277
    .line 278
    move-object/from16 v21, v5

    .line 279
    .line 280
    const/4 v7, 0x1

    .line 281
    goto/16 :goto_1d

    .line 282
    .line 283
    :cond_d
    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    int-to-float v13, v13

    .line 288
    mul-float/2addr v13, v11

    .line 289
    const/high16 v11, 0x3f000000    # 0.5f

    .line 290
    .line 291
    add-float/2addr v13, v11

    .line 292
    float-to-int v11, v13

    .line 293
    const/16 v13, 0xff

    .line 294
    .line 295
    if-gez v11, :cond_e

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    goto :goto_a

    .line 299
    :cond_e
    if-le v11, v13, :cond_f

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_f
    move v13, v11

    .line 303
    :goto_a
    if-eqz v7, :cond_26

    .line 304
    .line 305
    invoke-static {v10}, Lw/a;->a(I)Lw/a;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    iget v10, v7, Lw/a;->a:F

    .line 310
    .line 311
    iget v7, v7, Lw/a;->b:F

    .line 312
    .line 313
    sget-object v11, Lw/l;->k:Lw/l;

    .line 314
    .line 315
    float-to-double v14, v7

    .line 316
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 317
    .line 318
    cmpg-double v14, v14, v18

    .line 319
    .line 320
    const v18, 0x4461d2f7

    .line 321
    .line 322
    .line 323
    const/high16 v19, 0x42e80000    # 116.0f

    .line 324
    .line 325
    const/high16 v20, 0x41800000    # 16.0f

    .line 326
    .line 327
    if-ltz v14, :cond_1e

    .line 328
    .line 329
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 330
    .line 331
    .line 332
    move-result v14

    .line 333
    move-object/from16 v21, v5

    .line 334
    .line 335
    int-to-double v4, v14

    .line 336
    const-wide/16 v23, 0x0

    .line 337
    .line 338
    cmpg-double v4, v4, v23

    .line 339
    .line 340
    if-lez v4, :cond_1d

    .line 341
    .line 342
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    int-to-double v4, v4

    .line 347
    const-wide/high16 v23, 0x4059000000000000L    # 100.0

    .line 348
    .line 349
    cmpl-double v4, v4, v23

    .line 350
    .line 351
    if-ltz v4, :cond_10

    .line 352
    .line 353
    goto/16 :goto_14

    .line 354
    .line 355
    :cond_10
    const/4 v4, 0x0

    .line 356
    cmpg-float v5, v10, v4

    .line 357
    .line 358
    if-gez v5, :cond_11

    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    goto :goto_b

    .line 362
    :cond_11
    const/high16 v4, 0x43b40000    # 360.0f

    .line 363
    .line 364
    invoke-static {v4, v10}, Ljava/lang/Math;->min(FF)F

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    :goto_b
    move v10, v7

    .line 369
    move v14, v10

    .line 370
    const/4 v5, 0x0

    .line 371
    const/4 v7, 0x0

    .line 372
    const/16 v23, 0x1

    .line 373
    .line 374
    :goto_c
    sub-float v25, v7, v10

    .line 375
    .line 376
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->abs(F)F

    .line 377
    .line 378
    .line 379
    move-result v25

    .line 380
    const v26, 0x3ecccccd    # 0.4f

    .line 381
    .line 382
    .line 383
    cmpl-float v25, v25, v26

    .line 384
    .line 385
    if-ltz v25, :cond_1b

    .line 386
    .line 387
    const/high16 v25, 0x447a0000    # 1000.0f

    .line 388
    .line 389
    move/from16 v28, v9

    .line 390
    .line 391
    move/from16 v26, v25

    .line 392
    .line 393
    move/from16 v27, v26

    .line 394
    .line 395
    const/16 v25, 0x0

    .line 396
    .line 397
    const/16 v29, 0x0

    .line 398
    .line 399
    :goto_d
    sub-float v30, v25, v28

    .line 400
    .line 401
    invoke-static/range {v30 .. v30}, Ljava/lang/Math;->abs(F)F

    .line 402
    .line 403
    .line 404
    move-result v30

    .line 405
    const v31, 0x3c23d70a    # 0.01f

    .line 406
    .line 407
    .line 408
    cmpl-float v30, v30, v31

    .line 409
    .line 410
    const/high16 v31, 0x40000000    # 2.0f

    .line 411
    .line 412
    if-lez v30, :cond_17

    .line 413
    .line 414
    sub-float v30, v28, v25

    .line 415
    .line 416
    div-float v30, v30, v31

    .line 417
    .line 418
    add-float v15, v30, v25

    .line 419
    .line 420
    invoke-static {v15, v14, v4}, Lw/a;->b(FFF)Lw/a;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    sget-object v1, Lw/l;->k:Lw/l;

    .line 425
    .line 426
    invoke-virtual {v9, v1}, Lw/a;->c(Lw/l;)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    invoke-static {v9}, Lyc/b;->b(I)F

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 439
    .line 440
    .line 441
    move-result v32

    .line 442
    invoke-static/range {v32 .. v32}, Lyc/b;->b(I)F

    .line 443
    .line 444
    .line 445
    move-result v32

    .line 446
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 447
    .line 448
    .line 449
    move-result v33

    .line 450
    invoke-static/range {v33 .. v33}, Lyc/b;->b(I)F

    .line 451
    .line 452
    .line 453
    move-result v33

    .line 454
    sget-object v34, Lyc/b;->e:[[F

    .line 455
    .line 456
    const/16 v16, 0x1

    .line 457
    .line 458
    aget-object v34, v34, v16

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    aget v35, v34, v17

    .line 463
    .line 464
    mul-float v9, v9, v35

    .line 465
    .line 466
    aget v35, v34, v16

    .line 467
    .line 468
    mul-float v32, v32, v35

    .line 469
    .line 470
    add-float v32, v32, v9

    .line 471
    .line 472
    const/4 v9, 0x2

    .line 473
    aget v34, v34, v9

    .line 474
    .line 475
    mul-float v33, v33, v34

    .line 476
    .line 477
    add-float v33, v33, v32

    .line 478
    .line 479
    const/high16 v9, 0x42c80000    # 100.0f

    .line 480
    .line 481
    div-float v2, v33, v9

    .line 482
    .line 483
    const v30, 0x3c111aa7

    .line 484
    .line 485
    .line 486
    cmpg-float v32, v2, v30

    .line 487
    .line 488
    if-gtz v32, :cond_12

    .line 489
    .line 490
    mul-float v2, v2, v18

    .line 491
    .line 492
    move/from16 v30, v10

    .line 493
    .line 494
    goto :goto_e

    .line 495
    :cond_12
    move/from16 v30, v10

    .line 496
    .line 497
    float-to-double v9, v2

    .line 498
    invoke-static {v9, v10}, Ljava/lang/Math;->cbrt(D)D

    .line 499
    .line 500
    .line 501
    move-result-wide v9

    .line 502
    double-to-float v2, v9

    .line 503
    mul-float v2, v2, v19

    .line 504
    .line 505
    sub-float v2, v2, v20

    .line 506
    .line 507
    :goto_e
    sub-float v9, v12, v2

    .line 508
    .line 509
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    const v10, 0x3e4ccccd    # 0.2f

    .line 514
    .line 515
    .line 516
    cmpg-float v10, v9, v10

    .line 517
    .line 518
    if-gez v10, :cond_13

    .line 519
    .line 520
    invoke-static {v1}, Lw/a;->a(I)Lw/a;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    iget v10, v1, Lw/a;->c:F

    .line 525
    .line 526
    move/from16 v33, v3

    .line 527
    .line 528
    iget v3, v1, Lw/a;->b:F

    .line 529
    .line 530
    invoke-static {v10, v3, v4}, Lw/a;->b(FFF)Lw/a;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    iget v10, v1, Lw/a;->d:F

    .line 535
    .line 536
    move/from16 v34, v4

    .line 537
    .line 538
    iget v4, v3, Lw/a;->d:F

    .line 539
    .line 540
    sub-float/2addr v10, v4

    .line 541
    iget v4, v1, Lw/a;->e:F

    .line 542
    .line 543
    move/from16 v35, v9

    .line 544
    .line 545
    iget v9, v3, Lw/a;->e:F

    .line 546
    .line 547
    sub-float/2addr v4, v9

    .line 548
    iget v9, v1, Lw/a;->f:F

    .line 549
    .line 550
    iget v3, v3, Lw/a;->f:F

    .line 551
    .line 552
    sub-float/2addr v9, v3

    .line 553
    mul-float/2addr v10, v10

    .line 554
    mul-float/2addr v4, v4

    .line 555
    add-float/2addr v4, v10

    .line 556
    mul-float/2addr v9, v9

    .line 557
    add-float/2addr v9, v4

    .line 558
    float-to-double v3, v9

    .line 559
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 560
    .line 561
    .line 562
    move-result-wide v3

    .line 563
    const-wide v9, 0x3ff68f5c28f5c28fL    # 1.41

    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    move/from16 v36, v14

    .line 569
    .line 570
    move/from16 v37, v15

    .line 571
    .line 572
    const-wide v14, 0x3fe428f5c28f5c29L    # 0.63

    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 578
    .line 579
    .line 580
    move-result-wide v3

    .line 581
    mul-double/2addr v3, v9

    .line 582
    double-to-float v3, v3

    .line 583
    const/high16 v4, 0x3f800000    # 1.0f

    .line 584
    .line 585
    cmpg-float v9, v3, v4

    .line 586
    .line 587
    if-gtz v9, :cond_14

    .line 588
    .line 589
    move-object/from16 v29, v1

    .line 590
    .line 591
    move/from16 v27, v3

    .line 592
    .line 593
    move/from16 v26, v35

    .line 594
    .line 595
    goto :goto_f

    .line 596
    :cond_13
    move/from16 v33, v3

    .line 597
    .line 598
    move/from16 v34, v4

    .line 599
    .line 600
    move/from16 v36, v14

    .line 601
    .line 602
    move/from16 v37, v15

    .line 603
    .line 604
    :cond_14
    :goto_f
    const/4 v1, 0x0

    .line 605
    cmpl-float v3, v26, v1

    .line 606
    .line 607
    if-nez v3, :cond_15

    .line 608
    .line 609
    cmpl-float v3, v27, v1

    .line 610
    .line 611
    if-nez v3, :cond_15

    .line 612
    .line 613
    goto :goto_11

    .line 614
    :cond_15
    cmpg-float v2, v2, v12

    .line 615
    .line 616
    if-gez v2, :cond_16

    .line 617
    .line 618
    move/from16 v25, v37

    .line 619
    .line 620
    goto :goto_10

    .line 621
    :cond_16
    move/from16 v28, v37

    .line 622
    .line 623
    :goto_10
    move-object/from16 v1, p2

    .line 624
    .line 625
    move-object/from16 v2, p3

    .line 626
    .line 627
    move/from16 v10, v30

    .line 628
    .line 629
    move/from16 v3, v33

    .line 630
    .line 631
    move/from16 v4, v34

    .line 632
    .line 633
    move/from16 v14, v36

    .line 634
    .line 635
    const/high16 v9, 0x42c80000    # 100.0f

    .line 636
    .line 637
    goto/16 :goto_d

    .line 638
    .line 639
    :cond_17
    move/from16 v33, v3

    .line 640
    .line 641
    move/from16 v34, v4

    .line 642
    .line 643
    move/from16 v30, v10

    .line 644
    .line 645
    move/from16 v36, v14

    .line 646
    .line 647
    const/4 v1, 0x0

    .line 648
    :goto_11
    move-object/from16 v2, v29

    .line 649
    .line 650
    if-eqz v23, :cond_19

    .line 651
    .line 652
    if-eqz v2, :cond_18

    .line 653
    .line 654
    invoke-virtual {v2, v11}, Lw/a;->c(Lw/l;)I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    goto/16 :goto_1b

    .line 659
    .line 660
    :cond_18
    sub-float v10, v30, v7

    .line 661
    .line 662
    div-float v10, v10, v31

    .line 663
    .line 664
    add-float/2addr v10, v7

    .line 665
    move v14, v10

    .line 666
    move/from16 v10, v30

    .line 667
    .line 668
    const/16 v23, 0x0

    .line 669
    .line 670
    goto :goto_13

    .line 671
    :cond_19
    if-nez v2, :cond_1a

    .line 672
    .line 673
    move/from16 v10, v36

    .line 674
    .line 675
    goto :goto_12

    .line 676
    :cond_1a
    move-object v5, v2

    .line 677
    move/from16 v10, v30

    .line 678
    .line 679
    move/from16 v7, v36

    .line 680
    .line 681
    :goto_12
    sub-float v2, v10, v7

    .line 682
    .line 683
    div-float v2, v2, v31

    .line 684
    .line 685
    add-float/2addr v2, v7

    .line 686
    move v14, v2

    .line 687
    :goto_13
    move-object/from16 v1, p2

    .line 688
    .line 689
    move-object/from16 v2, p3

    .line 690
    .line 691
    move/from16 v3, v33

    .line 692
    .line 693
    move/from16 v4, v34

    .line 694
    .line 695
    const/high16 v9, 0x42c80000    # 100.0f

    .line 696
    .line 697
    goto/16 :goto_c

    .line 698
    .line 699
    :cond_1b
    move/from16 v33, v3

    .line 700
    .line 701
    if-nez v5, :cond_1c

    .line 702
    .line 703
    goto :goto_15

    .line 704
    :cond_1c
    invoke-virtual {v5, v11}, Lw/a;->c(Lw/l;)I

    .line 705
    .line 706
    .line 707
    move-result v10

    .line 708
    goto/16 :goto_1b

    .line 709
    .line 710
    :cond_1d
    :goto_14
    move/from16 v33, v3

    .line 711
    .line 712
    goto :goto_15

    .line 713
    :cond_1e
    move/from16 v33, v3

    .line 714
    .line 715
    move-object/from16 v21, v5

    .line 716
    .line 717
    :goto_15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 718
    .line 719
    cmpg-float v1, v12, v1

    .line 720
    .line 721
    if-gez v1, :cond_1f

    .line 722
    .line 723
    const/high16 v10, -0x1000000

    .line 724
    .line 725
    goto :goto_1b

    .line 726
    :cond_1f
    const/high16 v1, 0x42c60000    # 99.0f

    .line 727
    .line 728
    cmpl-float v1, v12, v1

    .line 729
    .line 730
    if-lez v1, :cond_20

    .line 731
    .line 732
    const/4 v7, 0x1

    .line 733
    const/4 v10, -0x1

    .line 734
    goto :goto_1c

    .line 735
    :cond_20
    add-float v1, v12, v20

    .line 736
    .line 737
    div-float v1, v1, v19

    .line 738
    .line 739
    const/high16 v2, 0x41000000    # 8.0f

    .line 740
    .line 741
    cmpl-float v2, v12, v2

    .line 742
    .line 743
    if-lez v2, :cond_21

    .line 744
    .line 745
    const/4 v2, 0x1

    .line 746
    goto :goto_16

    .line 747
    :cond_21
    const/4 v2, 0x0

    .line 748
    :goto_16
    if-eqz v2, :cond_22

    .line 749
    .line 750
    mul-float v2, v1, v1

    .line 751
    .line 752
    mul-float/2addr v2, v1

    .line 753
    goto :goto_17

    .line 754
    :cond_22
    div-float v2, v12, v18

    .line 755
    .line 756
    :goto_17
    mul-float v3, v1, v1

    .line 757
    .line 758
    mul-float/2addr v3, v1

    .line 759
    const v4, 0x3c111aa7

    .line 760
    .line 761
    .line 762
    cmpl-float v4, v3, v4

    .line 763
    .line 764
    if-lez v4, :cond_23

    .line 765
    .line 766
    const/4 v4, 0x1

    .line 767
    goto :goto_18

    .line 768
    :cond_23
    const/4 v4, 0x0

    .line 769
    :goto_18
    if-eqz v4, :cond_24

    .line 770
    .line 771
    move v5, v3

    .line 772
    goto :goto_19

    .line 773
    :cond_24
    mul-float v5, v1, v19

    .line 774
    .line 775
    sub-float v5, v5, v20

    .line 776
    .line 777
    div-float v5, v5, v18

    .line 778
    .line 779
    :goto_19
    if-eqz v4, :cond_25

    .line 780
    .line 781
    goto :goto_1a

    .line 782
    :cond_25
    mul-float v1, v1, v19

    .line 783
    .line 784
    sub-float v1, v1, v20

    .line 785
    .line 786
    div-float v3, v1, v18

    .line 787
    .line 788
    :goto_1a
    sget-object v1, Lyc/b;->d:[F

    .line 789
    .line 790
    const/4 v4, 0x0

    .line 791
    aget v7, v1, v4

    .line 792
    .line 793
    mul-float/2addr v5, v7

    .line 794
    float-to-double v4, v5

    .line 795
    const/4 v7, 0x1

    .line 796
    aget v9, v1, v7

    .line 797
    .line 798
    mul-float/2addr v2, v9

    .line 799
    float-to-double v9, v2

    .line 800
    const/4 v2, 0x2

    .line 801
    aget v1, v1, v2

    .line 802
    .line 803
    mul-float/2addr v3, v1

    .line 804
    float-to-double v1, v3

    .line 805
    move-wide/from16 v22, v4

    .line 806
    .line 807
    move-wide/from16 v24, v9

    .line 808
    .line 809
    move-wide/from16 v26, v1

    .line 810
    .line 811
    invoke-static/range {v22 .. v27}, Lx/a;->a(DDD)I

    .line 812
    .line 813
    .line 814
    move-result v10

    .line 815
    goto :goto_1c

    .line 816
    :cond_26
    move/from16 v33, v3

    .line 817
    .line 818
    move-object/from16 v21, v5

    .line 819
    .line 820
    :goto_1b
    const/4 v7, 0x1

    .line 821
    :goto_1c
    const v1, 0xffffff

    .line 822
    .line 823
    .line 824
    and-int/2addr v1, v10

    .line 825
    shl-int/lit8 v2, v13, 0x18

    .line 826
    .line 827
    or-int v10, v1, v2

    .line 828
    .line 829
    :goto_1d
    add-int/lit8 v1, v8, 0x1

    .line 830
    .line 831
    move-object/from16 v5, v21

    .line 832
    .line 833
    array-length v2, v5

    .line 834
    const/16 v3, 0x8

    .line 835
    .line 836
    if-le v1, v2, :cond_28

    .line 837
    .line 838
    const/4 v2, 0x4

    .line 839
    if-gt v8, v2, :cond_27

    .line 840
    .line 841
    move v2, v3

    .line 842
    goto :goto_1e

    .line 843
    :cond_27
    mul-int/lit8 v2, v8, 0x2

    .line 844
    .line 845
    :goto_1e
    new-array v2, v2, [I

    .line 846
    .line 847
    const/4 v4, 0x0

    .line 848
    invoke-static {v5, v4, v2, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 849
    .line 850
    .line 851
    move-object v5, v2

    .line 852
    :cond_28
    aput v10, v5, v8

    .line 853
    .line 854
    array-length v2, v6

    .line 855
    if-le v1, v2, :cond_2a

    .line 856
    .line 857
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    const/4 v4, 0x4

    .line 866
    if-gt v8, v4, :cond_29

    .line 867
    .line 868
    goto :goto_1f

    .line 869
    :cond_29
    mul-int/lit8 v3, v8, 0x2

    .line 870
    .line 871
    :goto_1f
    invoke-static {v2, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    check-cast v2, [Ljava/lang/Object;

    .line 876
    .line 877
    const/4 v3, 0x0

    .line 878
    invoke-static {v6, v3, v2, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 879
    .line 880
    .line 881
    move-object v6, v2

    .line 882
    :cond_2a
    aput-object v0, v6, v8

    .line 883
    .line 884
    check-cast v6, [[I

    .line 885
    .line 886
    move v8, v1

    .line 887
    goto :goto_21

    .line 888
    :cond_2b
    :goto_20
    move/from16 v33, v3

    .line 889
    .line 890
    move v7, v4

    .line 891
    :goto_21
    move-object/from16 v0, p0

    .line 892
    .line 893
    move-object/from16 v1, p2

    .line 894
    .line 895
    move-object/from16 v2, p3

    .line 896
    .line 897
    move v4, v7

    .line 898
    move/from16 v3, v33

    .line 899
    .line 900
    const/4 v7, 0x0

    .line 901
    goto/16 :goto_0

    .line 902
    .line 903
    :cond_2c
    new-array v0, v8, [I

    .line 904
    .line 905
    new-array v1, v8, [[I

    .line 906
    .line 907
    const/4 v2, 0x0

    .line 908
    invoke-static {v5, v2, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 909
    .line 910
    .line 911
    invoke-static {v6, v2, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 912
    .line 913
    .line 914
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 915
    .line 916
    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 917
    .line 918
    .line 919
    return-object v2

    .line 920
    :cond_2d
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 921
    .line 922
    new-instance v1, Ljava/lang/StringBuilder;

    .line 923
    .line 924
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 925
    .line 926
    .line 927
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 932
    .line 933
    .line 934
    const-string v2, ": invalid color state list tag "

    .line 935
    .line 936
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    throw v0
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
.end method
