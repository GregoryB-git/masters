.class public final Lh/a;
.super Lh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/a$e;,
        Lh/a$b;,
        Lh/a$c;,
        Lh/a$d;,
        Lh/a$a;,
        Lh/a$f;
    }
.end annotation


# instance fields
.field public A:I

.field public B:Z

.field public x:Lh/a$b;

.field public y:Lh/a$f;

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lh/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lh/a;-><init>(Lh/a$b;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Lh/a$b;Landroid/content/res/Resources;)V
    .locals 1

    invoke-direct {p0}, Lh/d;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lh/a;->z:I

    iput v0, p0, Lh/a;->A:I

    new-instance v0, Lh/a$b;

    invoke-direct {v0, p1, p0, p2}, Lh/a$b;-><init>(Lh/a$b;Lh/a;Landroid/content/res/Resources;)V

    invoke-virtual {p0, v0}, Lh/a;->e(Lh/b$c;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lh/a;->onStateChange([I)Z

    invoke-virtual {p0}, Lh/a;->jumpToCurrentState()V

    return-void
.end method

.method public static g(Landroid/content/Context;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;)Lh/a;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const-string v5, "animated-selector"

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_1b

    .line 20
    .line 21
    new-instance v4, Lh/a;

    .line 22
    .line 23
    invoke-direct {v4}, Lh/a;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v5, Lp2/m0;->e:[I

    .line 27
    .line 28
    invoke-static {v1, v0, v2, v5}, Lw/k;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const/4 v6, 0x1

    .line 33
    invoke-virtual {v5, v6, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v4, v7, v6}, Lh/a;->setVisible(ZZ)Z

    .line 38
    .line 39
    .line 40
    iget-object v7, v4, Lh/a;->x:Lh/a$b;

    .line 41
    .line 42
    iget v8, v7, Lh/b$c;->d:I

    .line 43
    .line 44
    invoke-static {v5}, Li/b;->b(Landroid/content/res/TypedArray;)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    or-int/2addr v8, v9

    .line 49
    iput v8, v7, Lh/b$c;->d:I

    .line 50
    .line 51
    iget-boolean v8, v7, Lh/b$c;->i:Z

    .line 52
    .line 53
    const/4 v9, 0x2

    .line 54
    invoke-virtual {v5, v9, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    iput-boolean v8, v7, Lh/b$c;->i:Z

    .line 59
    .line 60
    iget-boolean v8, v7, Lh/b$c;->l:Z

    .line 61
    .line 62
    const/4 v10, 0x3

    .line 63
    invoke-virtual {v5, v10, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    iput-boolean v8, v7, Lh/b$c;->l:Z

    .line 68
    .line 69
    iget v8, v7, Lh/b$c;->y:I

    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    invoke-virtual {v5, v11, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    iput v8, v7, Lh/b$c;->y:I

    .line 77
    .line 78
    const/4 v8, 0x5

    .line 79
    iget v12, v7, Lh/b$c;->z:I

    .line 80
    .line 81
    invoke-virtual {v5, v8, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    iput v8, v7, Lh/b$c;->z:I

    .line 86
    .line 87
    iget-boolean v7, v7, Lh/b$c;->w:Z

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    invoke-virtual {v5, v8, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v4, v7}, Lh/b;->setDither(Z)V

    .line 95
    .line 96
    .line 97
    iget-object v7, v4, Lh/b;->a:Lh/b$c;

    .line 98
    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    iput-object v1, v7, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 102
    .line 103
    invoke-virtual/range {p2 .. p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    iget v12, v12, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 108
    .line 109
    if-nez v12, :cond_0

    .line 110
    .line 111
    const/16 v12, 0xa0

    .line 112
    .line 113
    :cond_0
    iget v13, v7, Lh/b$c;->c:I

    .line 114
    .line 115
    iput v12, v7, Lh/b$c;->c:I

    .line 116
    .line 117
    if-eq v13, v12, :cond_2

    .line 118
    .line 119
    iput-boolean v8, v7, Lh/b$c;->m:Z

    .line 120
    .line 121
    iput-boolean v8, v7, Lh/b$c;->j:Z

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    :cond_2
    :goto_0
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 128
    .line 129
    .line 130
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    add-int/2addr v5, v6

    .line 135
    move-object/from16 v12, p0

    .line 136
    .line 137
    move-object v7, v0

    .line 138
    :goto_1
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    if-eq v13, v6, :cond_1a

    .line 143
    .line 144
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-ge v14, v5, :cond_3

    .line 149
    .line 150
    if-eq v13, v10, :cond_1a

    .line 151
    .line 152
    :cond_3
    if-eq v13, v9, :cond_4

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    if-le v14, v5, :cond_5

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    const-string v14, "item"

    .line 163
    .line 164
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, -0x1

    .line 170
    if-eqz v13, :cond_f

    .line 171
    .line 172
    sget-object v13, Lp2/m0;->f:[I

    .line 173
    .line 174
    invoke-static {v1, v7, v2, v13}, Lw/k;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v13, v8, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    invoke-virtual {v13, v6, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-lez v15, :cond_6

    .line 187
    .line 188
    invoke-static {}, Ll/q0;->d()Ll/q0;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-virtual {v14, v12, v15}, Ll/q0;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    :cond_6
    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    .line 197
    .line 198
    .line 199
    invoke-interface/range {p3 .. p3}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    new-array v15, v13, [I

    .line 204
    .line 205
    move v6, v8

    .line 206
    move v10, v6

    .line 207
    :goto_2
    if-ge v10, v13, :cond_9

    .line 208
    .line 209
    invoke-interface {v2, v10}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_8

    .line 214
    .line 215
    const v11, 0x10100d0

    .line 216
    .line 217
    .line 218
    if-eq v9, v11, :cond_8

    .line 219
    .line 220
    const v11, 0x1010199

    .line 221
    .line 222
    .line 223
    if-eq v9, v11, :cond_8

    .line 224
    .line 225
    add-int/lit8 v11, v6, 0x1

    .line 226
    .line 227
    invoke-interface {v2, v10, v8}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result v19

    .line 231
    if-eqz v19, :cond_7

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_7
    neg-int v9, v9

    .line 235
    :goto_3
    aput v9, v15, v6

    .line 236
    .line 237
    move v6, v11

    .line 238
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 239
    .line 240
    const/4 v9, 0x2

    .line 241
    const/4 v11, 0x4

    .line 242
    goto :goto_2

    .line 243
    :cond_9
    invoke-static {v15, v6}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    const-string v9, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

    .line 248
    .line 249
    if-nez v14, :cond_d

    .line 250
    .line 251
    :goto_4
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    const/4 v11, 0x4

    .line 256
    if-ne v10, v11, :cond_a

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    const/4 v11, 0x2

    .line 260
    if-ne v10, v11, :cond_c

    .line 261
    .line 262
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    const-string v11, "vector"

    .line 267
    .line 268
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-eqz v10, :cond_b

    .line 273
    .line 274
    new-instance v14, La2/f;

    .line 275
    .line 276
    invoke-direct {v14}, La2/f;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14, v1, v3, v2, v7}, La2/f;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 280
    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_b
    invoke-static {v1, v3, v2, v7}, Li/b;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    goto :goto_5

    .line 288
    :cond_c
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 289
    .line 290
    new-instance v1, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_d
    :goto_5
    if-eqz v14, :cond_e

    .line 314
    .line 315
    iget-object v9, v4, Lh/a;->x:Lh/a$b;

    .line 316
    .line 317
    invoke-virtual {v9, v14}, Lh/b$c;->a(Landroid/graphics/drawable/Drawable;)I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    iget-object v11, v9, Lh/d$a;->H:[[I

    .line 322
    .line 323
    aput-object v6, v11, v10

    .line 324
    .line 325
    iget-object v6, v9, Lh/a$b;->J:Lr/i;

    .line 326
    .line 327
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-virtual {v6, v10, v9}, Lr/i;->d(ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v8, p0

    .line 335
    .line 336
    goto/16 :goto_a

    .line 337
    .line 338
    :cond_e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 339
    .line 340
    new-instance v1, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 343
    .line 344
    .line 345
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v0

    .line 363
    :cond_f
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    const-string v9, "transition"

    .line 368
    .line 369
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    if-eqz v6, :cond_18

    .line 374
    .line 375
    sget-object v6, Lp2/m0;->o:[I

    .line 376
    .line 377
    invoke-static {v1, v7, v2, v6}, Lw/k;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    const/4 v9, 0x2

    .line 382
    invoke-virtual {v6, v9, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    const/4 v9, 0x1

    .line 387
    invoke-virtual {v6, v9, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    invoke-virtual {v6, v8, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    if-lez v13, :cond_10

    .line 396
    .line 397
    invoke-static {}, Ll/q0;->d()Ll/q0;

    .line 398
    .line 399
    .line 400
    move-result-object v14

    .line 401
    invoke-virtual {v14, v12, v13}, Ll/q0;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    :cond_10
    const/4 v12, 0x3

    .line 406
    invoke-virtual {v6, v12, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 411
    .line 412
    .line 413
    const-string v6, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

    .line 414
    .line 415
    if-nez v14, :cond_14

    .line 416
    .line 417
    :goto_6
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 418
    .line 419
    .line 420
    move-result v14

    .line 421
    const/4 v8, 0x4

    .line 422
    if-ne v14, v8, :cond_11

    .line 423
    .line 424
    const/4 v8, 0x0

    .line 425
    goto :goto_6

    .line 426
    :cond_11
    const/4 v8, 0x2

    .line 427
    if-ne v14, v8, :cond_13

    .line 428
    .line 429
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    const-string v8, "animated-vector"

    .line 434
    .line 435
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v8

    .line 439
    if-eqz v8, :cond_12

    .line 440
    .line 441
    new-instance v14, La2/b;

    .line 442
    .line 443
    move-object/from16 v8, p0

    .line 444
    .line 445
    invoke-direct {v14, v8}, La2/b;-><init>(Landroid/content/Context;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v14, v1, v3, v2, v0}, La2/b;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 449
    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_12
    move-object/from16 v8, p0

    .line 453
    .line 454
    invoke-static {v1, v3, v2, v7}, Li/b;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 455
    .line 456
    .line 457
    move-result-object v14

    .line 458
    goto :goto_7

    .line 459
    :cond_13
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 460
    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v0

    .line 484
    :cond_14
    move-object/from16 v8, p0

    .line 485
    .line 486
    :goto_7
    if-eqz v14, :cond_17

    .line 487
    .line 488
    if-eq v10, v15, :cond_16

    .line 489
    .line 490
    if-eq v11, v15, :cond_16

    .line 491
    .line 492
    iget-object v6, v4, Lh/a;->x:Lh/a$b;

    .line 493
    .line 494
    invoke-virtual {v6, v14}, Lh/b$c;->a(Landroid/graphics/drawable/Drawable;)I

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    int-to-long v14, v10

    .line 499
    const/16 v10, 0x20

    .line 500
    .line 501
    shl-long v17, v14, v10

    .line 502
    .line 503
    int-to-long v9, v11

    .line 504
    move/from16 v20, v13

    .line 505
    .line 506
    or-long v12, v9, v17

    .line 507
    .line 508
    if-eqz v20, :cond_15

    .line 509
    .line 510
    const-wide v17, 0x200000000L

    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    goto :goto_8

    .line 516
    :cond_15
    const-wide/16 v17, 0x0

    .line 517
    .line 518
    :goto_8
    iget-object v11, v6, Lh/a$b;->I:Lr/e;

    .line 519
    .line 520
    int-to-long v0, v7

    .line 521
    or-long v21, v0, v17

    .line 522
    .line 523
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 524
    .line 525
    .line 526
    move-result-object v7

    .line 527
    invoke-virtual {v11, v7, v12, v13}, Lr/e;->a(Ljava/lang/Long;J)V

    .line 528
    .line 529
    .line 530
    if-eqz v20, :cond_19

    .line 531
    .line 532
    const/16 v7, 0x20

    .line 533
    .line 534
    shl-long/2addr v9, v7

    .line 535
    or-long/2addr v9, v14

    .line 536
    iget-object v6, v6, Lh/a$b;->I:Lr/e;

    .line 537
    .line 538
    const-wide v11, 0x100000000L

    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    or-long/2addr v0, v11

    .line 544
    or-long v0, v0, v17

    .line 545
    .line 546
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v6, v0, v9, v10}, Lr/e;->a(Ljava/lang/Long;J)V

    .line 551
    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_16
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 555
    .line 556
    new-instance v1, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v2, ": <transition> tag requires \'fromId\' & \'toId\' attributes"

    .line 569
    .line 570
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw v0

    .line 581
    :cond_17
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 582
    .line 583
    new-instance v1, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw v0

    .line 606
    :cond_18
    move-object/from16 v8, p0

    .line 607
    .line 608
    :cond_19
    :goto_9
    move-object/from16 v7, p1

    .line 609
    .line 610
    move-object v12, v8

    .line 611
    :goto_a
    move-object/from16 v0, p1

    .line 612
    .line 613
    move-object/from16 v1, p2

    .line 614
    .line 615
    const/4 v6, 0x1

    .line 616
    const/4 v8, 0x0

    .line 617
    const/4 v9, 0x2

    .line 618
    const/4 v10, 0x3

    .line 619
    const/4 v11, 0x4

    .line 620
    goto/16 :goto_1

    .line 621
    .line 622
    :cond_1a
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v4, v0}, Lh/a;->onStateChange([I)Z

    .line 627
    .line 628
    .line 629
    return-object v4

    .line 630
    :cond_1b
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 631
    .line 632
    new-instance v1, Ljava/lang/StringBuilder;

    .line 633
    .line 634
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 635
    .line 636
    .line 637
    invoke-interface/range {p4 .. p4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v2, ": invalid animated-selector tag "

    .line 645
    .line 646
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw v0
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
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
.end method


# virtual methods
.method public final b()Lh/b$c;
    .locals 3

    new-instance v0, Lh/a$b;

    iget-object v1, p0, Lh/a;->x:Lh/a$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lh/a$b;-><init>(Lh/a$b;Lh/a;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final e(Lh/b$c;)V
    .locals 1

    invoke-super {p0, p1}, Lh/d;->e(Lh/b$c;)V

    instance-of v0, p1, Lh/a$b;

    if-eqz v0, :cond_0

    check-cast p1, Lh/a$b;

    iput-object p1, p0, Lh/a;->x:Lh/a$b;

    :cond_0
    return-void
.end method

.method public final f()Lh/d$a;
    .locals 3

    new-instance v0, Lh/a$b;

    iget-object v1, p0, Lh/a;->x:Lh/a$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lh/a$b;-><init>(Lh/a$b;Lh/a;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final jumpToCurrentState()V
    .locals 1

    invoke-super {p0}, Lh/b;->jumpToCurrentState()V

    iget-object v0, p0, Lh/a;->y:Lh/a$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/a$f;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh/a;->y:Lh/a$f;

    iget v0, p0, Lh/a;->z:I

    invoke-virtual {p0, v0}, Lh/b;->d(I)Z

    const/4 v0, -0x1

    iput v0, p0, Lh/a;->z:I

    iput v0, p0, Lh/a;->A:I

    :cond_0
    return-void
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, Lh/a;->B:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lh/d;->mutate()Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lh/a;->x:Lh/a$b;

    invoke-virtual {v0}, Lh/a$b;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/a;->B:Z

    :cond_0
    return-object p0
.end method

.method public final onStateChange([I)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lh/a;->x:Lh/a$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/d$a;->f([I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lh/d$a;->f([I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    iget v0, p0, Lh/b;->o:I

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eq v1, v0, :cond_d

    .line 21
    .line 22
    iget-object v4, p0, Lh/a;->y:Lh/a$f;

    .line 23
    .line 24
    if-eqz v4, :cond_3

    .line 25
    .line 26
    iget v0, p0, Lh/a;->z:I

    .line 27
    .line 28
    if-ne v1, v0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    iget v0, p0, Lh/a;->A:I

    .line 33
    .line 34
    if-ne v1, v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v4}, Lh/a$f;->a()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v4}, Lh/a$f;->b()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lh/a;->A:I

    .line 46
    .line 47
    iput v0, p0, Lh/a;->z:I

    .line 48
    .line 49
    iput v1, p0, Lh/a;->A:I

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_2
    iget v0, p0, Lh/a;->z:I

    .line 54
    .line 55
    invoke-virtual {v4}, Lh/a$f;->d()V

    .line 56
    .line 57
    .line 58
    :cond_3
    const/4 v4, 0x0

    .line 59
    iput-object v4, p0, Lh/a;->y:Lh/a$f;

    .line 60
    .line 61
    const/4 v4, -0x1

    .line 62
    iput v4, p0, Lh/a;->A:I

    .line 63
    .line 64
    iput v4, p0, Lh/a;->z:I

    .line 65
    .line 66
    iget-object v4, p0, Lh/a;->x:Lh/a$b;

    .line 67
    .line 68
    if-gez v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move v5, v3

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget-object v5, v4, Lh/a$b;->J:Lr/i;

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v5, v0, v6}, Lr/i;->c(ILjava/lang/Integer;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    :goto_1
    if-gez v1, :cond_5

    .line 92
    .line 93
    move v6, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_5
    iget-object v6, v4, Lh/a$b;->J:Lr/i;

    .line 96
    .line 97
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v6, v1, v7}, Lr/i;->c(ILjava/lang/Integer;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    :goto_2
    if-eqz v6, :cond_c

    .line 112
    .line 113
    if-nez v5, :cond_6

    .line 114
    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :cond_6
    int-to-long v7, v5

    .line 118
    const/16 v5, 0x20

    .line 119
    .line 120
    shl-long/2addr v7, v5

    .line 121
    int-to-long v5, v6

    .line 122
    or-long/2addr v5, v7

    .line 123
    iget-object v7, v4, Lh/a$b;->I:Lr/e;

    .line 124
    .line 125
    const-wide/16 v8, -0x1

    .line 126
    .line 127
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-virtual {v7, v10, v5, v6}, Lr/e;->d(Ljava/lang/Long;J)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Ljava/lang/Long;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v10

    .line 141
    long-to-int v7, v10

    .line 142
    if-gez v7, :cond_7

    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_7
    iget-object v10, v4, Lh/a$b;->I:Lr/e;

    .line 147
    .line 148
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    invoke-virtual {v10, v11, v5, v6}, Lr/e;->d(Ljava/lang/Long;J)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    check-cast v10, Ljava/lang/Long;

    .line 157
    .line 158
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    const-wide v12, 0x200000000L

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    and-long/2addr v10, v12

    .line 168
    const-wide/16 v12, 0x0

    .line 169
    .line 170
    cmp-long v10, v10, v12

    .line 171
    .line 172
    if-eqz v10, :cond_8

    .line 173
    .line 174
    move v10, v2

    .line 175
    goto :goto_3

    .line 176
    :cond_8
    move v10, v3

    .line 177
    :goto_3
    invoke-virtual {p0, v7}, Lh/b;->d(I)Z

    .line 178
    .line 179
    .line 180
    iget-object v7, p0, Lh/b;->c:Landroid/graphics/drawable/Drawable;

    .line 181
    .line 182
    instance-of v11, v7, Landroid/graphics/drawable/AnimationDrawable;

    .line 183
    .line 184
    if-eqz v11, :cond_a

    .line 185
    .line 186
    iget-object v4, v4, Lh/a$b;->I:Lr/e;

    .line 187
    .line 188
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-virtual {v4, v8, v5, v6}, Lr/e;->d(Ljava/lang/Long;J)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    check-cast v4, Ljava/lang/Long;

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    const-wide v8, 0x100000000L

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    and-long/2addr v4, v8

    .line 208
    cmp-long v4, v4, v12

    .line 209
    .line 210
    if-eqz v4, :cond_9

    .line 211
    .line 212
    move v4, v2

    .line 213
    goto :goto_4

    .line 214
    :cond_9
    move v4, v3

    .line 215
    :goto_4
    new-instance v5, Lh/a$d;

    .line 216
    .line 217
    check-cast v7, Landroid/graphics/drawable/AnimationDrawable;

    .line 218
    .line 219
    invoke-direct {v5, v7, v4, v10}, Lh/a$d;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_a
    instance-of v4, v7, La2/b;

    .line 224
    .line 225
    if-eqz v4, :cond_b

    .line 226
    .line 227
    new-instance v5, Lh/a$c;

    .line 228
    .line 229
    check-cast v7, La2/b;

    .line 230
    .line 231
    invoke-direct {v5, v7}, Lh/a$c;-><init>(La2/b;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_b
    instance-of v4, v7, Landroid/graphics/drawable/Animatable;

    .line 236
    .line 237
    if-eqz v4, :cond_c

    .line 238
    .line 239
    new-instance v5, Lh/a$a;

    .line 240
    .line 241
    check-cast v7, Landroid/graphics/drawable/Animatable;

    .line 242
    .line 243
    invoke-direct {v5, v7}, Lh/a$a;-><init>(Landroid/graphics/drawable/Animatable;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    invoke-virtual {v5}, Lh/a$f;->c()V

    .line 247
    .line 248
    .line 249
    iput-object v5, p0, Lh/a;->y:Lh/a$f;

    .line 250
    .line 251
    iput v0, p0, Lh/a;->A:I

    .line 252
    .line 253
    iput v1, p0, Lh/a;->z:I

    .line 254
    .line 255
    :goto_6
    move v0, v2

    .line 256
    goto :goto_8

    .line 257
    :cond_c
    :goto_7
    move v0, v3

    .line 258
    :goto_8
    if-nez v0, :cond_e

    .line 259
    .line 260
    invoke-virtual {p0, v1}, Lh/b;->d(I)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_d

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_d
    move v2, v3

    .line 268
    :cond_e
    :goto_9
    iget-object v0, p0, Lh/b;->c:Landroid/graphics/drawable/Drawable;

    .line 269
    .line 270
    if-eqz v0, :cond_f

    .line 271
    .line 272
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    or-int/2addr v2, p1

    .line 277
    :cond_f
    return v2
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    invoke-super {p0, p1, p2}, Lh/b;->setVisible(ZZ)Z

    move-result v0

    iget-object v1, p0, Lh/a;->y:Lh/a$f;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lh/a$f;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh/a;->jumpToCurrentState()V

    :cond_2
    :goto_0
    return v0
.end method
