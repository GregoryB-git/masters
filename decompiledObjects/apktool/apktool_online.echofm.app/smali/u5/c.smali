.class public Lu5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Landroid/graphics/Matrix;


# instance fields
.field public final a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field public final b:Lu5/N;

.field public final c:Z

.field public final d:Ljava/util/Map;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu5/c;->f:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu5/c;->d:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lu5/c;->a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 12
    .line 13
    invoke-static {}, Lu5/N;->a()Lu5/N;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lu5/c;->b:Lu5/N;

    .line 18
    .line 19
    iput-boolean p2, p0, Lu5/c;->c:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-virtual/range {v0 .. v7}, Lu5/c;->b(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, -0x1

    .line 17
    if-ne v3, v9, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    invoke-virtual {v0, v11}, Lu5/c;->f(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    new-array v14, v8, [F

    .line 41
    .line 42
    aput v12, v14, v7

    .line 43
    .line 44
    aput v13, v14, v6

    .line 45
    .line 46
    move-object/from16 v12, p5

    .line 47
    .line 48
    invoke-virtual {v12, v14}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 49
    .line 50
    .line 51
    const/4 v12, 0x4

    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    if-ne v11, v6, :cond_1

    .line 55
    .line 56
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 57
    .line 58
    .line 59
    move-result v16

    .line 60
    and-int/lit8 v13, v16, 0x1f

    .line 61
    .line 62
    move/from16 v17, v10

    .line 63
    .line 64
    int-to-long v9, v13

    .line 65
    cmp-long v13, v9, v7

    .line 66
    .line 67
    if-nez v13, :cond_3

    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    const/16 v15, 0x2002

    .line 74
    .line 75
    if-ne v13, v15, :cond_3

    .line 76
    .line 77
    if-ne v3, v12, :cond_3

    .line 78
    .line 79
    iget-object v12, v0, Lu5/c;->d:Ljava/util/Map;

    .line 80
    .line 81
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-interface {v12, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move/from16 v17, v10

    .line 90
    .line 91
    const/4 v9, 0x2

    .line 92
    if-ne v11, v9, :cond_2

    .line 93
    .line 94
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    shr-int/2addr v9, v12

    .line 99
    and-int/lit8 v9, v9, 0xf

    .line 100
    .line 101
    int-to-long v9, v9

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move-wide v9, v7

    .line 104
    :cond_3
    :goto_0
    iget-object v12, v0, Lu5/c;->d:Ljava/util/Map;

    .line 105
    .line 106
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    invoke-interface {v12, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    if-eqz v12, :cond_5

    .line 115
    .line 116
    invoke-virtual {v0, v3}, Lu5/c;->e(I)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    const/4 v15, -0x1

    .line 121
    if-ne v13, v15, :cond_4

    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    move v15, v13

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    const/4 v15, -0x1

    .line 127
    :goto_1
    iget-boolean v13, v0, Lu5/c;->c:Z

    .line 128
    .line 129
    if-eqz v13, :cond_6

    .line 130
    .line 131
    iget-object v13, v0, Lu5/c;->b:Lu5/N;

    .line 132
    .line 133
    invoke-virtual {v13, v1}, Lu5/N;->c(Landroid/view/MotionEvent;)Lu5/N$a;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    invoke-virtual {v13}, Lu5/N$a;->d()J

    .line 138
    .line 139
    .line 140
    move-result-wide v18

    .line 141
    move-wide/from16 v6, v18

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    move-wide v6, v7

    .line 145
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    const/16 v13, 0x8

    .line 150
    .line 151
    if-ne v8, v13, :cond_7

    .line 152
    .line 153
    const/4 v8, 0x1

    .line 154
    goto :goto_3

    .line 155
    :cond_7
    const/4 v8, 0x0

    .line 156
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v20

    .line 160
    const-wide/16 v22, 0x3e8

    .line 161
    .line 162
    move-object/from16 v24, v14

    .line 163
    .line 164
    mul-long v13, v20, v22

    .line 165
    .line 166
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    .line 172
    if-eqz v12, :cond_8

    .line 173
    .line 174
    int-to-long v6, v15

    .line 175
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 176
    .line 177
    .line 178
    const-wide/16 v6, 0x4

    .line 179
    .line 180
    :goto_4
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    int-to-long v6, v3

    .line 185
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    .line 188
    int-to-long v6, v11

    .line 189
    goto :goto_4

    .line 190
    :goto_5
    int-to-long v6, v8

    .line 191
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    .line 194
    move/from16 v3, v17

    .line 195
    .line 196
    int-to-long v6, v3

    .line 197
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    .line 200
    const-wide/16 v6, 0x0

    .line 201
    .line 202
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 203
    .line 204
    .line 205
    if-eqz v12, :cond_9

    .line 206
    .line 207
    iget-object v6, v0, Lu5/c;->d:Ljava/util/Map;

    .line 208
    .line 209
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, [F

    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    aget v13, v6, v7

    .line 221
    .line 222
    float-to-double v13, v13

    .line 223
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 224
    .line 225
    .line 226
    const/4 v14, 0x1

    .line 227
    aget v6, v6, v14

    .line 228
    .line 229
    move/from16 v17, v15

    .line 230
    .line 231
    float-to-double v14, v6

    .line 232
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 233
    .line 234
    .line 235
    const/16 v7, 0x8

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_9
    move/from16 v17, v15

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    aget v6, v24, v7

    .line 242
    .line 243
    const/16 v7, 0x8

    .line 244
    .line 245
    float-to-double v14, v6

    .line 246
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x1

    .line 250
    aget v14, v24, v6

    .line 251
    .line 252
    float-to-double v14, v14

    .line 253
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 254
    .line 255
    .line 256
    :goto_6
    const-wide/16 v14, 0x0

    .line 257
    .line 258
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 265
    .line 266
    .line 267
    const-wide/16 v9, 0x0

    .line 268
    .line 269
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    float-to-double v9, v6

    .line 280
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    if-eqz v6, :cond_b

    .line 288
    .line 289
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    const/4 v13, 0x2

    .line 294
    invoke-virtual {v6, v13}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    move-wide v13, v14

    .line 299
    move/from16 v15, v17

    .line 300
    .line 301
    if-eqz v6, :cond_a

    .line 302
    .line 303
    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getMin()F

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    float-to-double v9, v9

    .line 308
    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getMax()F

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    move/from16 v17, v8

    .line 313
    .line 314
    float-to-double v7, v6

    .line 315
    goto :goto_9

    .line 316
    :cond_a
    :goto_7
    move/from16 v17, v8

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_b
    move-wide v13, v14

    .line 320
    move/from16 v15, v17

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :goto_8
    move-wide v9, v13

    .line 324
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 325
    .line 326
    :goto_9
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 330
    .line 331
    .line 332
    const/4 v6, 0x2

    .line 333
    if-ne v11, v6, :cond_c

    .line 334
    .line 335
    const/16 v7, 0x18

    .line 336
    .line 337
    invoke-virtual {v1, v7, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    float-to-double v7, v7

    .line 342
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    .line 345
    :goto_a
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 346
    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_c
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 350
    .line 351
    .line 352
    goto :goto_a

    .line 353
    :goto_b
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getSize(I)F

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    float-to-double v7, v7

    .line 358
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMajor(I)F

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    float-to-double v7, v7

    .line 366
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMinor(I)F

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    float-to-double v7, v7

    .line 374
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 381
    .line 382
    .line 383
    const/16 v7, 0x8

    .line 384
    .line 385
    invoke-virtual {v1, v7, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    float-to-double v7, v7

    .line 390
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 391
    .line 392
    .line 393
    const/4 v6, 0x2

    .line 394
    if-ne v11, v6, :cond_d

    .line 395
    .line 396
    const/16 v6, 0x19

    .line 397
    .line 398
    invoke-virtual {v1, v6, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    float-to-double v6, v6

    .line 403
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 404
    .line 405
    .line 406
    :goto_c
    move/from16 v6, p4

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :cond_d
    invoke-virtual {v4, v13, v14}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 410
    .line 411
    .line 412
    goto :goto_c

    .line 413
    :goto_d
    int-to-long v6, v6

    .line 414
    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 415
    .line 416
    .line 417
    const/16 v6, 0x9

    .line 418
    .line 419
    move/from16 v7, v17

    .line 420
    .line 421
    const/4 v8, 0x1

    .line 422
    if-ne v7, v8, :cond_f

    .line 423
    .line 424
    if-eqz v5, :cond_e

    .line 425
    .line 426
    invoke-virtual {v0, v5}, Lu5/c;->c(Landroid/content/Context;)F

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    float-to-double v7, v7

    .line 431
    invoke-virtual {v0, v5}, Lu5/c;->g(Landroid/content/Context;)F

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    float-to-double v9, v5

    .line 436
    goto :goto_e

    .line 437
    :cond_e
    const-wide/high16 v7, 0x4048000000000000L    # 48.0

    .line 438
    .line 439
    move-wide v9, v7

    .line 440
    :goto_e
    const/16 v5, 0xa

    .line 441
    .line 442
    invoke-virtual {v1, v5, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    neg-float v5, v5

    .line 447
    float-to-double v13, v5

    .line 448
    mul-double/2addr v7, v13

    .line 449
    invoke-virtual {v1, v6, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    neg-float v1, v1

    .line 454
    float-to-double v1, v1

    .line 455
    mul-double/2addr v9, v1

    .line 456
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 460
    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_f
    move-wide v1, v13

    .line 464
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 468
    .line 469
    .line 470
    :goto_f
    if-eqz v12, :cond_10

    .line 471
    .line 472
    iget-object v1, v0, Lu5/c;->d:Ljava/util/Map;

    .line 473
    .line 474
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    check-cast v1, [F

    .line 483
    .line 484
    const/4 v2, 0x0

    .line 485
    aget v5, v24, v2

    .line 486
    .line 487
    aget v2, v1, v2

    .line 488
    .line 489
    sub-float/2addr v5, v2

    .line 490
    float-to-double v7, v5

    .line 491
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 492
    .line 493
    .line 494
    const/4 v2, 0x1

    .line 495
    aget v5, v24, v2

    .line 496
    .line 497
    aget v1, v1, v2

    .line 498
    .line 499
    sub-float/2addr v5, v1

    .line 500
    float-to-double v1, v5

    .line 501
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 502
    .line 503
    .line 504
    const-wide/16 v1, 0x0

    .line 505
    .line 506
    goto :goto_10

    .line 507
    :cond_10
    const-wide/16 v1, 0x0

    .line 508
    .line 509
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 513
    .line 514
    .line 515
    :goto_10
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 519
    .line 520
    .line 521
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 522
    .line 523
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 527
    .line 528
    .line 529
    const-wide/16 v1, 0x0

    .line 530
    .line 531
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 532
    .line 533
    .line 534
    if-eqz v12, :cond_11

    .line 535
    .line 536
    if-ne v15, v6, :cond_11

    .line 537
    .line 538
    iget-object v1, v0, Lu5/c;->d:Ljava/util/Map;

    .line 539
    .line 540
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    :cond_11
    return-void
.end method

.method public final c(Landroid/content/Context;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lu5/b;->a(Landroid/view/ViewConfiguration;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lu5/c;->i(Landroid/content/Context;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    int-to-float p1, p1

    .line 21
    return p1
.end method

.method public final d(I)I
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x6

    .line 7
    if-ne p1, v1, :cond_1

    .line 8
    .line 9
    return v2

    .line 10
    :cond_1
    const/4 v1, 0x5

    .line 11
    if-ne p1, v1, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    if-ne p1, v2, :cond_3

    .line 15
    .line 16
    return v2

    .line 17
    :cond_3
    const/4 v0, 0x2

    .line 18
    if-ne p1, v0, :cond_4

    .line 19
    .line 20
    return v1

    .line 21
    :cond_4
    const/4 v0, 0x7

    .line 22
    const/4 v1, 0x3

    .line 23
    if-ne p1, v0, :cond_5

    .line 24
    .line 25
    return v1

    .line 26
    :cond_5
    if-ne p1, v1, :cond_6

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_6
    const/16 v0, 0x8

    .line 31
    .line 32
    if-ne p1, v0, :cond_7

    .line 33
    .line 34
    return v1

    .line 35
    :cond_7
    const/4 p1, -0x1

    .line 36
    return p1
.end method

.method public final e(I)I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x7

    .line 5
    return p1

    .line 6
    :cond_0
    const/4 v0, 0x5

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    const/16 p1, 0x8

    .line 10
    .line 11
    return p1

    .line 12
    :cond_1
    const/4 v0, 0x6

    .line 13
    if-eq p1, v0, :cond_3

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_3
    :goto_0
    const/16 p1, 0x9

    .line 21
    .line 22
    return p1
.end method

.method public final f(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_3

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p1, v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p1, v1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x5

    .line 14
    return p1

    .line 15
    :cond_0
    return v1

    .line 16
    :cond_1
    return v0

    .line 17
    :cond_2
    return v1

    .line 18
    :cond_3
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public final g(Landroid/content/Context;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lu5/c;->h(Landroid/content/Context;)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lu5/c;->i(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-float p1, p1

    .line 17
    return p1
.end method

.method public final h(Landroid/content/Context;)F
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lu5/a;->a(Landroid/view/ViewConfiguration;)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final i(Landroid/content/Context;)I
    .locals 4

    .line 1
    iget v0, p0, Lu5/c;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x101004d

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 p1, 0x30

    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lu5/c;->e:I

    .line 41
    .line 42
    :cond_1
    iget p1, p0, Lu5/c;->e:I

    .line 43
    .line 44
    return p1
.end method

.method public j(Landroid/view/MotionEvent;Landroid/content/Context;)Z
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x7

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v1, v3

    .line 27
    :goto_1
    if-eqz v0, :cond_3

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0, v0}, Lu5/c;->d(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    mul-int/lit16 v0, v0, 0x120

    .line 44
    .line 45
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/4 v8, 0x0

    .line 59
    sget-object v9, Lu5/c;->f:Landroid/graphics/Matrix;

    .line 60
    .line 61
    move-object v4, p0

    .line 62
    move-object v5, p1

    .line 63
    move-object v10, v0

    .line 64
    move-object v11, p2

    .line 65
    invoke-virtual/range {v4 .. v11}, Lu5/c;->b(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    rem-int/lit16 p1, p1, 0x120

    .line 73
    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    iget-object p1, p0, Lu5/c;->a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {p1, v0, p2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->g(Ljava/nio/ByteBuffer;I)V

    .line 83
    .line 84
    .line 85
    return v3

    .line 86
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 87
    .line 88
    const-string p2, "Packet position is not on field boundary."

    .line 89
    .line 90
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_3
    return v4
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    sget-object v0, Lu5/c;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lu5/c;->l(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public l(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit16 v1, v0, 0x120

    .line 6
    .line 7
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0, v3}, Lu5/c;->d(I)I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v10, 0x1

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v4, 0x5

    .line 33
    if-ne v2, v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v4, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    move v4, v10

    .line 39
    :goto_1
    if-nez v4, :cond_3

    .line 40
    .line 41
    if-eq v2, v10, :cond_2

    .line 42
    .line 43
    const/4 v5, 0x6

    .line 44
    if-ne v2, v5, :cond_3

    .line 45
    .line 46
    :cond_2
    move v2, v10

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move v2, v3

    .line 49
    :goto_2
    if-eqz v4, :cond_5

    .line 50
    .line 51
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v6, 0x0

    .line 56
    move-object v2, p0

    .line 57
    move-object v3, p1

    .line 58
    move v5, v9

    .line 59
    move-object v7, p2

    .line 60
    move-object v8, v1

    .line 61
    invoke-virtual/range {v2 .. v8}, Lu5/c;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 62
    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move v11, v3

    .line 66
    if-eqz v2, :cond_7

    .line 67
    .line 68
    :goto_3
    if-ge v11, v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eq v11, v2, :cond_6

    .line 75
    .line 76
    invoke-virtual {p1, v11}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-ne v2, v10, :cond_6

    .line 81
    .line 82
    const/4 v5, 0x5

    .line 83
    const/4 v6, 0x1

    .line 84
    move-object v2, p0

    .line 85
    move-object v3, p1

    .line 86
    move v4, v11

    .line 87
    move-object v7, p2

    .line 88
    move-object v8, v1

    .line 89
    invoke-virtual/range {v2 .. v8}, Lu5/c;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    :goto_4
    if-ge v11, v0, :cond_8

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    move-object v2, p0

    .line 99
    move-object v3, p1

    .line 100
    move v4, v11

    .line 101
    move v5, v9

    .line 102
    move-object v7, p2

    .line 103
    move-object v8, v1

    .line 104
    invoke-virtual/range {v2 .. v8}, Lu5/c;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v11, v11, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    :goto_5
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    rem-int/lit16 p1, p1, 0x120

    .line 115
    .line 116
    if-nez p1, :cond_9

    .line 117
    .line 118
    iget-object p1, p0, Lu5/c;->a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-virtual {p1, v1, p2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->g(Ljava/nio/ByteBuffer;I)V

    .line 125
    .line 126
    .line 127
    return v10

    .line 128
    :cond_9
    new-instance p1, Ljava/lang/AssertionError;

    .line 129
    .line 130
    const-string p2, "Packet position is not on field boundary"

    .line 131
    .line 132
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    throw p1
.end method
