.class public final Lcom/google/android/exoplayer2/ui/a;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/ui/SubtitleView$a;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field

.field public c:I

.field public d:F

.field public e:Ls5/a;

.field public f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/a;->a:Ljava/util/ArrayList;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/a;->b:Ljava/util/List;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/exoplayer2/ui/a;->c:I

    const p1, 0x3d5a511a    # 0.0533f

    iput p1, p0, Lcom/google/android/exoplayer2/ui/a;->d:F

    sget-object p1, Ls5/a;->g:Ls5/a;

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/a;->e:Ls5/a;

    const p1, 0x3da3d70a    # 0.08f

    iput p1, p0, Lcom/google/android/exoplayer2/ui/a;->f:F

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ls5/a;FIF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh5/a;",
            ">;",
            "Ls5/a;",
            "FIF)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/a;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/a;->e:Ls5/a;

    iput p3, p0, Lcom/google/android/exoplayer2/ui/a;->d:F

    iput p4, p0, Lcom/google/android/exoplayer2/ui/a;->c:I

    iput p5, p0, Lcom/google/android/exoplayer2/ui/a;->f:F

    :goto_0
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/a;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/a;->a:Ljava/util/ArrayList;

    new-instance p3, Ls5/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4}, Ls5/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/a;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    sub-int/2addr v5, v6

    .line 33
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    sub-int v6, v2, v6

    .line 38
    .line 39
    if-le v6, v4, :cond_2e

    .line 40
    .line 41
    if-gt v5, v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_1d

    .line 44
    .line 45
    :cond_1
    sub-int v7, v6, v4

    .line 46
    .line 47
    iget v8, v0, Lcom/google/android/exoplayer2/ui/a;->c:I

    .line 48
    .line 49
    iget v9, v0, Lcom/google/android/exoplayer2/ui/a;->d:F

    .line 50
    .line 51
    invoke-static {v9, v8, v2, v7}, Ls5/f;->b(FIII)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    const/4 v9, 0x0

    .line 56
    cmpg-float v10, v8, v9

    .line 57
    .line 58
    if-gtz v10, :cond_2

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    move-object/from16 v13, p1

    .line 66
    .line 67
    const/4 v12, 0x0

    .line 68
    :goto_0
    if-ge v12, v10, :cond_2e

    .line 69
    .line 70
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    check-cast v14, Lh5/a;

    .line 75
    .line 76
    iget v15, v14, Lh5/a;->x:I

    .line 77
    .line 78
    const/high16 v16, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const/high16 v11, -0x80000000

    .line 81
    .line 82
    if-eq v15, v11, :cond_6

    .line 83
    .line 84
    iget-object v15, v14, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 85
    .line 86
    iget-object v11, v14, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 87
    .line 88
    iget-object v9, v14, Lh5/a;->c:Landroid/text/Layout$Alignment;

    .line 89
    .line 90
    move-object/from16 v35, v1

    .line 91
    .line 92
    iget v1, v14, Lh5/a;->o:I

    .line 93
    .line 94
    move/from16 v17, v1

    .line 95
    .line 96
    iget v1, v14, Lh5/a;->v:I

    .line 97
    .line 98
    move/from16 v36, v10

    .line 99
    .line 100
    iget v10, v14, Lh5/a;->w:F

    .line 101
    .line 102
    move-object/from16 v37, v13

    .line 103
    .line 104
    iget v13, v14, Lh5/a;->r:F

    .line 105
    .line 106
    move/from16 v38, v6

    .line 107
    .line 108
    iget v6, v14, Lh5/a;->s:F

    .line 109
    .line 110
    move/from16 v39, v5

    .line 111
    .line 112
    iget-boolean v5, v14, Lh5/a;->t:Z

    .line 113
    .line 114
    move/from16 v40, v4

    .line 115
    .line 116
    iget v4, v14, Lh5/a;->u:I

    .line 117
    .line 118
    move/from16 v41, v3

    .line 119
    .line 120
    iget v3, v14, Lh5/a;->x:I

    .line 121
    .line 122
    move/from16 v42, v8

    .line 123
    .line 124
    iget v8, v14, Lh5/a;->y:F

    .line 125
    .line 126
    const v25, -0x800001

    .line 127
    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    move/from16 v43, v12

    .line 132
    .line 133
    iget v12, v14, Lh5/a;->f:I

    .line 134
    .line 135
    if-nez v12, :cond_3

    .line 136
    .line 137
    iget v12, v14, Lh5/a;->e:F

    .line 138
    .line 139
    sub-float v12, v16, v12

    .line 140
    .line 141
    move/from16 v22, v12

    .line 142
    .line 143
    const/16 v23, 0x0

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    iget v12, v14, Lh5/a;->e:F

    .line 147
    .line 148
    neg-float v12, v12

    .line 149
    sub-float v12, v12, v16

    .line 150
    .line 151
    move/from16 v22, v12

    .line 152
    .line 153
    const/16 v23, 0x1

    .line 154
    .line 155
    :goto_1
    iget v12, v14, Lh5/a;->o:I

    .line 156
    .line 157
    if-eqz v12, :cond_5

    .line 158
    .line 159
    const/4 v14, 0x2

    .line 160
    if-eq v12, v14, :cond_4

    .line 161
    .line 162
    move/from16 v24, v17

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    const/16 v24, 0x0

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    const/16 v24, 0x2

    .line 169
    .line 170
    :goto_2
    new-instance v14, Lh5/a;

    .line 171
    .line 172
    move-object/from16 v17, v14

    .line 173
    .line 174
    move-object/from16 v18, v15

    .line 175
    .line 176
    move-object/from16 v20, v9

    .line 177
    .line 178
    move-object/from16 v21, v11

    .line 179
    .line 180
    const/high16 v9, -0x80000000

    .line 181
    .line 182
    move/from16 v26, v9

    .line 183
    .line 184
    move/from16 v27, v1

    .line 185
    .line 186
    move/from16 v28, v10

    .line 187
    .line 188
    move/from16 v29, v13

    .line 189
    .line 190
    move/from16 v30, v6

    .line 191
    .line 192
    move/from16 v31, v5

    .line 193
    .line 194
    move/from16 v32, v4

    .line 195
    .line 196
    move/from16 v33, v3

    .line 197
    .line 198
    move/from16 v34, v8

    .line 199
    .line 200
    invoke-direct/range {v17 .. v34}, Lh5/a;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_6
    move-object/from16 v35, v1

    .line 205
    .line 206
    move/from16 v41, v3

    .line 207
    .line 208
    move/from16 v40, v4

    .line 209
    .line 210
    move/from16 v39, v5

    .line 211
    .line 212
    move/from16 v38, v6

    .line 213
    .line 214
    move/from16 v42, v8

    .line 215
    .line 216
    move/from16 v36, v10

    .line 217
    .line 218
    move/from16 v43, v12

    .line 219
    .line 220
    move-object/from16 v37, v13

    .line 221
    .line 222
    :goto_3
    iget v1, v14, Lh5/a;->v:I

    .line 223
    .line 224
    iget v3, v14, Lh5/a;->w:F

    .line 225
    .line 226
    invoke-static {v3, v1, v2, v7}, Ls5/f;->b(FIII)F

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iget-object v3, v0, Lcom/google/android/exoplayer2/ui/a;->a:Ljava/util/ArrayList;

    .line 231
    .line 232
    move/from16 v11, v43

    .line 233
    .line 234
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Ls5/d;

    .line 239
    .line 240
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/a;->e:Ls5/a;

    .line 241
    .line 242
    iget v5, v0, Lcom/google/android/exoplayer2/ui/a;->f:F

    .line 243
    .line 244
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v6, v14, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 248
    .line 249
    if-nez v6, :cond_7

    .line 250
    .line 251
    const/4 v6, 0x1

    .line 252
    goto :goto_4

    .line 253
    :cond_7
    const/4 v6, 0x0

    .line 254
    :goto_4
    const/high16 v8, -0x1000000

    .line 255
    .line 256
    if-eqz v6, :cond_a

    .line 257
    .line 258
    iget-object v8, v14, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 259
    .line 260
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-eqz v8, :cond_8

    .line 265
    .line 266
    move-object/from16 v9, v37

    .line 267
    .line 268
    move/from16 v15, v38

    .line 269
    .line 270
    move/from16 v13, v39

    .line 271
    .line 272
    move/from16 v12, v40

    .line 273
    .line 274
    move/from16 v10, v41

    .line 275
    .line 276
    goto/16 :goto_8

    .line 277
    .line 278
    :cond_8
    iget-boolean v8, v14, Lh5/a;->t:Z

    .line 279
    .line 280
    if-eqz v8, :cond_9

    .line 281
    .line 282
    iget v8, v14, Lh5/a;->u:I

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_9
    iget v8, v4, Ls5/a;->c:I

    .line 286
    .line 287
    :cond_a
    :goto_5
    iget-object v9, v3, Ls5/d;->i:Ljava/lang/CharSequence;

    .line 288
    .line 289
    iget-object v10, v14, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 290
    .line 291
    if-eq v9, v10, :cond_c

    .line 292
    .line 293
    if-eqz v9, :cond_b

    .line 294
    .line 295
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_b

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_b
    const/4 v9, 0x0

    .line 303
    goto :goto_7

    .line 304
    :cond_c
    :goto_6
    const/4 v9, 0x1

    .line 305
    :goto_7
    if-eqz v9, :cond_11

    .line 306
    .line 307
    iget-object v9, v3, Ls5/d;->j:Landroid/text/Layout$Alignment;

    .line 308
    .line 309
    iget-object v10, v14, Lh5/a;->b:Landroid/text/Layout$Alignment;

    .line 310
    .line 311
    invoke-static {v9, v10}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-eqz v9, :cond_11

    .line 316
    .line 317
    iget-object v9, v3, Ls5/d;->k:Landroid/graphics/Bitmap;

    .line 318
    .line 319
    iget-object v10, v14, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 320
    .line 321
    if-ne v9, v10, :cond_11

    .line 322
    .line 323
    iget v9, v3, Ls5/d;->l:F

    .line 324
    .line 325
    iget v10, v14, Lh5/a;->e:F

    .line 326
    .line 327
    cmpl-float v9, v9, v10

    .line 328
    .line 329
    if-nez v9, :cond_11

    .line 330
    .line 331
    iget v9, v3, Ls5/d;->m:I

    .line 332
    .line 333
    iget v10, v14, Lh5/a;->f:I

    .line 334
    .line 335
    if-ne v9, v10, :cond_11

    .line 336
    .line 337
    iget v9, v3, Ls5/d;->n:I

    .line 338
    .line 339
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    iget v10, v14, Lh5/a;->o:I

    .line 344
    .line 345
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    invoke-static {v9, v10}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    if-eqz v9, :cond_11

    .line 354
    .line 355
    iget v9, v3, Ls5/d;->o:F

    .line 356
    .line 357
    iget v10, v14, Lh5/a;->p:F

    .line 358
    .line 359
    cmpl-float v9, v9, v10

    .line 360
    .line 361
    if-nez v9, :cond_11

    .line 362
    .line 363
    iget v9, v3, Ls5/d;->p:I

    .line 364
    .line 365
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    iget v10, v14, Lh5/a;->q:I

    .line 370
    .line 371
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    invoke-static {v9, v10}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    if-eqz v9, :cond_11

    .line 380
    .line 381
    iget v9, v3, Ls5/d;->q:F

    .line 382
    .line 383
    iget v10, v14, Lh5/a;->r:F

    .line 384
    .line 385
    cmpl-float v9, v9, v10

    .line 386
    .line 387
    if-nez v9, :cond_11

    .line 388
    .line 389
    iget v9, v3, Ls5/d;->r:F

    .line 390
    .line 391
    iget v10, v14, Lh5/a;->s:F

    .line 392
    .line 393
    cmpl-float v9, v9, v10

    .line 394
    .line 395
    if-nez v9, :cond_11

    .line 396
    .line 397
    iget v9, v3, Ls5/d;->s:I

    .line 398
    .line 399
    iget v10, v4, Ls5/a;->a:I

    .line 400
    .line 401
    if-ne v9, v10, :cond_11

    .line 402
    .line 403
    iget v9, v3, Ls5/d;->t:I

    .line 404
    .line 405
    iget v10, v4, Ls5/a;->b:I

    .line 406
    .line 407
    if-ne v9, v10, :cond_11

    .line 408
    .line 409
    iget v9, v3, Ls5/d;->u:I

    .line 410
    .line 411
    if-ne v9, v8, :cond_11

    .line 412
    .line 413
    iget v9, v3, Ls5/d;->w:I

    .line 414
    .line 415
    iget v10, v4, Ls5/a;->d:I

    .line 416
    .line 417
    if-ne v9, v10, :cond_11

    .line 418
    .line 419
    iget v9, v3, Ls5/d;->v:I

    .line 420
    .line 421
    iget v10, v4, Ls5/a;->e:I

    .line 422
    .line 423
    if-ne v9, v10, :cond_11

    .line 424
    .line 425
    iget-object v9, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 426
    .line 427
    invoke-virtual {v9}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    iget-object v10, v4, Ls5/a;->f:Landroid/graphics/Typeface;

    .line 432
    .line 433
    invoke-static {v9, v10}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    if-eqz v9, :cond_11

    .line 438
    .line 439
    iget v9, v3, Ls5/d;->x:F

    .line 440
    .line 441
    cmpl-float v9, v9, v42

    .line 442
    .line 443
    if-nez v9, :cond_11

    .line 444
    .line 445
    iget v9, v3, Ls5/d;->y:F

    .line 446
    .line 447
    cmpl-float v9, v9, v1

    .line 448
    .line 449
    if-nez v9, :cond_11

    .line 450
    .line 451
    iget v9, v3, Ls5/d;->z:F

    .line 452
    .line 453
    cmpl-float v9, v9, v5

    .line 454
    .line 455
    if-nez v9, :cond_11

    .line 456
    .line 457
    iget v9, v3, Ls5/d;->A:I

    .line 458
    .line 459
    move/from16 v10, v41

    .line 460
    .line 461
    if-ne v9, v10, :cond_10

    .line 462
    .line 463
    iget v9, v3, Ls5/d;->B:I

    .line 464
    .line 465
    move/from16 v12, v40

    .line 466
    .line 467
    if-ne v9, v12, :cond_f

    .line 468
    .line 469
    iget v9, v3, Ls5/d;->C:I

    .line 470
    .line 471
    move/from16 v13, v39

    .line 472
    .line 473
    if-ne v9, v13, :cond_e

    .line 474
    .line 475
    iget v9, v3, Ls5/d;->D:I

    .line 476
    .line 477
    move/from16 v15, v38

    .line 478
    .line 479
    if-ne v9, v15, :cond_d

    .line 480
    .line 481
    move-object/from16 v9, v37

    .line 482
    .line 483
    invoke-virtual {v3, v9, v6}, Ls5/d;->a(Landroid/graphics/Canvas;Z)V

    .line 484
    .line 485
    .line 486
    :goto_8
    move/from16 v26, v2

    .line 487
    .line 488
    move/from16 v27, v7

    .line 489
    .line 490
    move/from16 v41, v10

    .line 491
    .line 492
    move/from16 v43, v11

    .line 493
    .line 494
    move/from16 v40, v12

    .line 495
    .line 496
    move/from16 v39, v13

    .line 497
    .line 498
    move/from16 v38, v15

    .line 499
    .line 500
    const/4 v11, 0x0

    .line 501
    const/4 v12, 0x0

    .line 502
    move-object v13, v9

    .line 503
    goto/16 :goto_1c

    .line 504
    .line 505
    :cond_d
    move-object/from16 v9, v37

    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_e
    move-object/from16 v9, v37

    .line 509
    .line 510
    move/from16 v15, v38

    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_f
    move-object/from16 v9, v37

    .line 514
    .line 515
    move/from16 v15, v38

    .line 516
    .line 517
    move/from16 v13, v39

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_10
    move-object/from16 v9, v37

    .line 521
    .line 522
    move/from16 v15, v38

    .line 523
    .line 524
    move/from16 v13, v39

    .line 525
    .line 526
    move/from16 v12, v40

    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_11
    move-object/from16 v9, v37

    .line 530
    .line 531
    move/from16 v15, v38

    .line 532
    .line 533
    move/from16 v13, v39

    .line 534
    .line 535
    move/from16 v12, v40

    .line 536
    .line 537
    move/from16 v10, v41

    .line 538
    .line 539
    :goto_9
    iget-object v0, v14, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 540
    .line 541
    iput-object v0, v3, Ls5/d;->i:Ljava/lang/CharSequence;

    .line 542
    .line 543
    iget-object v0, v14, Lh5/a;->b:Landroid/text/Layout$Alignment;

    .line 544
    .line 545
    iput-object v0, v3, Ls5/d;->j:Landroid/text/Layout$Alignment;

    .line 546
    .line 547
    iget-object v0, v14, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 548
    .line 549
    iput-object v0, v3, Ls5/d;->k:Landroid/graphics/Bitmap;

    .line 550
    .line 551
    iget v0, v14, Lh5/a;->e:F

    .line 552
    .line 553
    iput v0, v3, Ls5/d;->l:F

    .line 554
    .line 555
    iget v0, v14, Lh5/a;->f:I

    .line 556
    .line 557
    iput v0, v3, Ls5/d;->m:I

    .line 558
    .line 559
    iget v0, v14, Lh5/a;->o:I

    .line 560
    .line 561
    iput v0, v3, Ls5/d;->n:I

    .line 562
    .line 563
    iget v0, v14, Lh5/a;->p:F

    .line 564
    .line 565
    iput v0, v3, Ls5/d;->o:F

    .line 566
    .line 567
    iget v0, v14, Lh5/a;->q:I

    .line 568
    .line 569
    iput v0, v3, Ls5/d;->p:I

    .line 570
    .line 571
    iget v0, v14, Lh5/a;->r:F

    .line 572
    .line 573
    iput v0, v3, Ls5/d;->q:F

    .line 574
    .line 575
    iget v0, v14, Lh5/a;->s:F

    .line 576
    .line 577
    iput v0, v3, Ls5/d;->r:F

    .line 578
    .line 579
    iget v0, v4, Ls5/a;->a:I

    .line 580
    .line 581
    iput v0, v3, Ls5/d;->s:I

    .line 582
    .line 583
    iget v0, v4, Ls5/a;->b:I

    .line 584
    .line 585
    iput v0, v3, Ls5/d;->t:I

    .line 586
    .line 587
    iput v8, v3, Ls5/d;->u:I

    .line 588
    .line 589
    iget v0, v4, Ls5/a;->d:I

    .line 590
    .line 591
    iput v0, v3, Ls5/d;->w:I

    .line 592
    .line 593
    iget v0, v4, Ls5/a;->e:I

    .line 594
    .line 595
    iput v0, v3, Ls5/d;->v:I

    .line 596
    .line 597
    iget-object v0, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 598
    .line 599
    iget-object v4, v4, Ls5/a;->f:Landroid/graphics/Typeface;

    .line 600
    .line 601
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 602
    .line 603
    .line 604
    move/from16 v0, v42

    .line 605
    .line 606
    iput v0, v3, Ls5/d;->x:F

    .line 607
    .line 608
    iput v1, v3, Ls5/d;->y:F

    .line 609
    .line 610
    iput v5, v3, Ls5/d;->z:F

    .line 611
    .line 612
    iput v10, v3, Ls5/d;->A:I

    .line 613
    .line 614
    iput v12, v3, Ls5/d;->B:I

    .line 615
    .line 616
    iput v13, v3, Ls5/d;->C:I

    .line 617
    .line 618
    iput v15, v3, Ls5/d;->D:I

    .line 619
    .line 620
    if-eqz v6, :cond_28

    .line 621
    .line 622
    iget-object v4, v3, Ls5/d;->i:Ljava/lang/CharSequence;

    .line 623
    .line 624
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    iget-object v4, v3, Ls5/d;->i:Ljava/lang/CharSequence;

    .line 628
    .line 629
    instance-of v5, v4, Landroid/text/SpannableStringBuilder;

    .line 630
    .line 631
    if-eqz v5, :cond_12

    .line 632
    .line 633
    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 634
    .line 635
    goto :goto_a

    .line 636
    :cond_12
    new-instance v4, Landroid/text/SpannableStringBuilder;

    .line 637
    .line 638
    iget-object v5, v3, Ls5/d;->i:Ljava/lang/CharSequence;

    .line 639
    .line 640
    invoke-direct {v4, v5}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 641
    .line 642
    .line 643
    :goto_a
    iget v5, v3, Ls5/d;->C:I

    .line 644
    .line 645
    iget v8, v3, Ls5/d;->A:I

    .line 646
    .line 647
    sub-int/2addr v5, v8

    .line 648
    iget v8, v3, Ls5/d;->D:I

    .line 649
    .line 650
    iget v14, v3, Ls5/d;->B:I

    .line 651
    .line 652
    sub-int/2addr v8, v14

    .line 653
    iget-object v14, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 654
    .line 655
    iget v1, v3, Ls5/d;->x:F

    .line 656
    .line 657
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 658
    .line 659
    .line 660
    iget v1, v3, Ls5/d;->x:F

    .line 661
    .line 662
    const/high16 v14, 0x3e000000    # 0.125f

    .line 663
    .line 664
    mul-float/2addr v1, v14

    .line 665
    const/high16 v14, 0x3f000000    # 0.5f

    .line 666
    .line 667
    add-float/2addr v1, v14

    .line 668
    float-to-int v1, v1

    .line 669
    mul-int/lit8 v14, v1, 0x2

    .line 670
    .line 671
    move/from16 v42, v0

    .line 672
    .line 673
    sub-int v0, v5, v14

    .line 674
    .line 675
    move/from16 v26, v2

    .line 676
    .line 677
    iget v2, v3, Ls5/d;->q:F

    .line 678
    .line 679
    const v17, -0x800001

    .line 680
    .line 681
    .line 682
    cmpl-float v18, v2, v17

    .line 683
    .line 684
    if-eqz v18, :cond_13

    .line 685
    .line 686
    int-to-float v0, v0

    .line 687
    mul-float/2addr v0, v2

    .line 688
    float-to-int v0, v0

    .line 689
    :cond_13
    const-string v2, "SubtitlePainter"

    .line 690
    .line 691
    if-gtz v0, :cond_14

    .line 692
    .line 693
    const-string v0, "Skipped drawing subtitle cue (insufficient space)"

    .line 694
    .line 695
    invoke-static {v2, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    move/from16 v27, v7

    .line 699
    .line 700
    move/from16 v41, v10

    .line 701
    .line 702
    move/from16 v43, v11

    .line 703
    .line 704
    move/from16 v40, v12

    .line 705
    .line 706
    move/from16 v39, v13

    .line 707
    .line 708
    move/from16 v38, v15

    .line 709
    .line 710
    const/4 v11, 0x0

    .line 711
    const/4 v12, 0x0

    .line 712
    move-object v13, v9

    .line 713
    goto/16 :goto_1b

    .line 714
    .line 715
    :cond_14
    iget v9, v3, Ls5/d;->y:F

    .line 716
    .line 717
    const/16 v17, 0x0

    .line 718
    .line 719
    cmpl-float v9, v9, v17

    .line 720
    .line 721
    move/from16 v27, v7

    .line 722
    .line 723
    if-lez v9, :cond_15

    .line 724
    .line 725
    new-instance v9, Landroid/text/style/AbsoluteSizeSpan;

    .line 726
    .line 727
    iget v7, v3, Ls5/d;->y:F

    .line 728
    .line 729
    float-to-int v7, v7

    .line 730
    invoke-direct {v9, v7}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 734
    .line 735
    .line 736
    move-result v7

    .line 737
    move/from16 v41, v10

    .line 738
    .line 739
    move/from16 v40, v12

    .line 740
    .line 741
    const/high16 v10, 0xff0000

    .line 742
    .line 743
    const/4 v12, 0x0

    .line 744
    invoke-virtual {v4, v9, v12, v7, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 745
    .line 746
    .line 747
    goto :goto_b

    .line 748
    :cond_15
    move/from16 v41, v10

    .line 749
    .line 750
    move/from16 v40, v12

    .line 751
    .line 752
    const/4 v12, 0x0

    .line 753
    :goto_b
    new-instance v7, Landroid/text/SpannableStringBuilder;

    .line 754
    .line 755
    invoke-direct {v7, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 756
    .line 757
    .line 758
    iget v9, v3, Ls5/d;->w:I

    .line 759
    .line 760
    const/4 v10, 0x1

    .line 761
    if-ne v9, v10, :cond_16

    .line 762
    .line 763
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 764
    .line 765
    .line 766
    move-result v9

    .line 767
    const-class v10, Landroid/text/style/ForegroundColorSpan;

    .line 768
    .line 769
    invoke-virtual {v7, v12, v9, v10}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v9

    .line 773
    check-cast v9, [Landroid/text/style/ForegroundColorSpan;

    .line 774
    .line 775
    array-length v10, v9

    .line 776
    const/4 v12, 0x0

    .line 777
    :goto_c
    if-ge v12, v10, :cond_16

    .line 778
    .line 779
    move/from16 v18, v10

    .line 780
    .line 781
    aget-object v10, v9, v12

    .line 782
    .line 783
    invoke-virtual {v7, v10}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    add-int/lit8 v12, v12, 0x1

    .line 787
    .line 788
    move/from16 v10, v18

    .line 789
    .line 790
    goto :goto_c

    .line 791
    :cond_16
    iget v9, v3, Ls5/d;->t:I

    .line 792
    .line 793
    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    .line 794
    .line 795
    .line 796
    move-result v9

    .line 797
    if-lez v9, :cond_19

    .line 798
    .line 799
    iget v9, v3, Ls5/d;->w:I

    .line 800
    .line 801
    if-eqz v9, :cond_18

    .line 802
    .line 803
    const/4 v10, 0x2

    .line 804
    if-ne v9, v10, :cond_17

    .line 805
    .line 806
    goto :goto_d

    .line 807
    :cond_17
    new-instance v9, Landroid/text/style/BackgroundColorSpan;

    .line 808
    .line 809
    iget v10, v3, Ls5/d;->t:I

    .line 810
    .line 811
    invoke-direct {v9, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 815
    .line 816
    .line 817
    move-result v10

    .line 818
    move/from16 v39, v13

    .line 819
    .line 820
    const/high16 v12, 0xff0000

    .line 821
    .line 822
    const/4 v13, 0x0

    .line 823
    invoke-virtual {v7, v9, v13, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 824
    .line 825
    .line 826
    goto :goto_e

    .line 827
    :cond_18
    :goto_d
    move/from16 v39, v13

    .line 828
    .line 829
    const/high16 v12, 0xff0000

    .line 830
    .line 831
    const/4 v13, 0x0

    .line 832
    new-instance v9, Landroid/text/style/BackgroundColorSpan;

    .line 833
    .line 834
    iget v10, v3, Ls5/d;->t:I

    .line 835
    .line 836
    invoke-direct {v9, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 840
    .line 841
    .line 842
    move-result v10

    .line 843
    invoke-virtual {v4, v9, v13, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 844
    .line 845
    .line 846
    goto :goto_e

    .line 847
    :cond_19
    move/from16 v39, v13

    .line 848
    .line 849
    :goto_e
    iget-object v9, v3, Ls5/d;->j:Landroid/text/Layout$Alignment;

    .line 850
    .line 851
    if-nez v9, :cond_1a

    .line 852
    .line 853
    sget-object v9, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 854
    .line 855
    :cond_1a
    new-instance v10, Landroid/text/StaticLayout;

    .line 856
    .line 857
    iget-object v12, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 858
    .line 859
    iget v13, v3, Ls5/d;->d:F

    .line 860
    .line 861
    move/from16 v38, v15

    .line 862
    .line 863
    iget v15, v3, Ls5/d;->e:F

    .line 864
    .line 865
    const/16 v24, 0x1

    .line 866
    .line 867
    move-object/from16 v17, v10

    .line 868
    .line 869
    move-object/from16 v18, v4

    .line 870
    .line 871
    move-object/from16 v19, v12

    .line 872
    .line 873
    move/from16 v20, v0

    .line 874
    .line 875
    move-object/from16 v21, v9

    .line 876
    .line 877
    move/from16 v22, v13

    .line 878
    .line 879
    move/from16 v23, v15

    .line 880
    .line 881
    invoke-direct/range {v17 .. v24}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 882
    .line 883
    .line 884
    iput-object v10, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 885
    .line 886
    invoke-virtual {v10}, Landroid/text/Layout;->getHeight()I

    .line 887
    .line 888
    .line 889
    move-result v10

    .line 890
    iget-object v12, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 891
    .line 892
    invoke-virtual {v12}, Landroid/text/StaticLayout;->getLineCount()I

    .line 893
    .line 894
    .line 895
    move-result v12

    .line 896
    const/4 v13, 0x0

    .line 897
    const/4 v15, 0x0

    .line 898
    :goto_f
    if-ge v13, v12, :cond_1b

    .line 899
    .line 900
    move/from16 v17, v12

    .line 901
    .line 902
    iget-object v12, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 903
    .line 904
    invoke-virtual {v12, v13}, Landroid/text/Layout;->getLineWidth(I)F

    .line 905
    .line 906
    .line 907
    move-result v12

    .line 908
    move/from16 v43, v11

    .line 909
    .line 910
    float-to-double v11, v12

    .line 911
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 912
    .line 913
    .line 914
    move-result-wide v11

    .line 915
    double-to-int v11, v11

    .line 916
    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    .line 917
    .line 918
    .line 919
    move-result v15

    .line 920
    add-int/lit8 v13, v13, 0x1

    .line 921
    .line 922
    move/from16 v12, v17

    .line 923
    .line 924
    move/from16 v11, v43

    .line 925
    .line 926
    goto :goto_f

    .line 927
    :cond_1b
    move/from16 v43, v11

    .line 928
    .line 929
    iget v11, v3, Ls5/d;->q:F

    .line 930
    .line 931
    const v12, -0x800001

    .line 932
    .line 933
    .line 934
    cmpl-float v11, v11, v12

    .line 935
    .line 936
    if-eqz v11, :cond_1c

    .line 937
    .line 938
    if-ge v15, v0, :cond_1c

    .line 939
    .line 940
    goto :goto_10

    .line 941
    :cond_1c
    move v0, v15

    .line 942
    :goto_10
    add-int/2addr v0, v14

    .line 943
    iget v11, v3, Ls5/d;->o:F

    .line 944
    .line 945
    cmpl-float v13, v11, v12

    .line 946
    .line 947
    if-eqz v13, :cond_1f

    .line 948
    .line 949
    int-to-float v5, v5

    .line 950
    mul-float/2addr v5, v11

    .line 951
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 952
    .line 953
    .line 954
    move-result v5

    .line 955
    iget v11, v3, Ls5/d;->A:I

    .line 956
    .line 957
    add-int/2addr v5, v11

    .line 958
    iget v12, v3, Ls5/d;->p:I

    .line 959
    .line 960
    const/4 v13, 0x1

    .line 961
    if-eq v12, v13, :cond_1e

    .line 962
    .line 963
    const/4 v13, 0x2

    .line 964
    if-eq v12, v13, :cond_1d

    .line 965
    .line 966
    goto :goto_11

    .line 967
    :cond_1d
    sub-int/2addr v5, v0

    .line 968
    goto :goto_11

    .line 969
    :cond_1e
    const/4 v13, 0x2

    .line 970
    mul-int/lit8 v5, v5, 0x2

    .line 971
    .line 972
    sub-int/2addr v5, v0

    .line 973
    div-int/2addr v5, v13

    .line 974
    :goto_11
    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    .line 975
    .line 976
    .line 977
    move-result v5

    .line 978
    add-int/2addr v0, v5

    .line 979
    iget v11, v3, Ls5/d;->C:I

    .line 980
    .line 981
    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    goto :goto_12

    .line 986
    :cond_1f
    const/4 v13, 0x2

    .line 987
    sub-int/2addr v5, v0

    .line 988
    div-int/2addr v5, v13

    .line 989
    iget v11, v3, Ls5/d;->A:I

    .line 990
    .line 991
    add-int/2addr v5, v11

    .line 992
    add-int/2addr v0, v5

    .line 993
    :goto_12
    sub-int/2addr v0, v5

    .line 994
    if-gtz v0, :cond_20

    .line 995
    .line 996
    const-string v0, "Skipped drawing subtitle cue (invalid horizontal positioning)"

    .line 997
    .line 998
    invoke-static {v2, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    move-object/from16 v13, p1

    .line 1002
    .line 1003
    const/4 v11, 0x0

    .line 1004
    const/4 v12, 0x0

    .line 1005
    goto/16 :goto_1b

    .line 1006
    .line 1007
    :cond_20
    iget v2, v3, Ls5/d;->l:F

    .line 1008
    .line 1009
    const v11, -0x800001

    .line 1010
    .line 1011
    .line 1012
    cmpl-float v11, v2, v11

    .line 1013
    .line 1014
    if-eqz v11, :cond_26

    .line 1015
    .line 1016
    iget v11, v3, Ls5/d;->m:I

    .line 1017
    .line 1018
    if-nez v11, :cond_23

    .line 1019
    .line 1020
    int-to-float v8, v8

    .line 1021
    mul-float/2addr v8, v2

    .line 1022
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    iget v8, v3, Ls5/d;->B:I

    .line 1027
    .line 1028
    add-int/2addr v2, v8

    .line 1029
    iget v8, v3, Ls5/d;->n:I

    .line 1030
    .line 1031
    const/4 v11, 0x2

    .line 1032
    if-ne v8, v11, :cond_21

    .line 1033
    .line 1034
    const/4 v11, 0x0

    .line 1035
    const/4 v12, 0x0

    .line 1036
    goto :goto_13

    .line 1037
    :cond_21
    const/4 v12, 0x1

    .line 1038
    if-ne v8, v12, :cond_22

    .line 1039
    .line 1040
    mul-int/lit8 v2, v2, 0x2

    .line 1041
    .line 1042
    sub-int/2addr v2, v10

    .line 1043
    div-int/2addr v2, v11

    .line 1044
    :cond_22
    const/4 v11, 0x0

    .line 1045
    const/4 v12, 0x0

    .line 1046
    goto :goto_14

    .line 1047
    :cond_23
    iget-object v2, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 1048
    .line 1049
    const/4 v11, 0x0

    .line 1050
    invoke-virtual {v2, v11}, Landroid/text/Layout;->getLineBottom(I)I

    .line 1051
    .line 1052
    .line 1053
    move-result v2

    .line 1054
    iget-object v8, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 1055
    .line 1056
    invoke-virtual {v8, v11}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 1057
    .line 1058
    .line 1059
    move-result v8

    .line 1060
    sub-int/2addr v2, v8

    .line 1061
    iget v8, v3, Ls5/d;->l:F

    .line 1062
    .line 1063
    const/4 v12, 0x0

    .line 1064
    cmpl-float v13, v8, v12

    .line 1065
    .line 1066
    if-ltz v13, :cond_24

    .line 1067
    .line 1068
    int-to-float v2, v2

    .line 1069
    mul-float/2addr v8, v2

    .line 1070
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    iget v8, v3, Ls5/d;->B:I

    .line 1075
    .line 1076
    add-int/2addr v2, v8

    .line 1077
    goto :goto_14

    .line 1078
    :cond_24
    add-float v8, v8, v16

    .line 1079
    .line 1080
    int-to-float v2, v2

    .line 1081
    mul-float/2addr v8, v2

    .line 1082
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 1083
    .line 1084
    .line 1085
    move-result v2

    .line 1086
    iget v8, v3, Ls5/d;->D:I

    .line 1087
    .line 1088
    add-int/2addr v2, v8

    .line 1089
    :goto_13
    sub-int/2addr v2, v10

    .line 1090
    :goto_14
    add-int v8, v2, v10

    .line 1091
    .line 1092
    iget v13, v3, Ls5/d;->D:I

    .line 1093
    .line 1094
    if-le v8, v13, :cond_25

    .line 1095
    .line 1096
    sub-int v2, v13, v10

    .line 1097
    .line 1098
    goto :goto_15

    .line 1099
    :cond_25
    iget v8, v3, Ls5/d;->B:I

    .line 1100
    .line 1101
    if-ge v2, v8, :cond_27

    .line 1102
    .line 1103
    goto :goto_16

    .line 1104
    :cond_26
    const/4 v11, 0x0

    .line 1105
    const/4 v12, 0x0

    .line 1106
    iget v2, v3, Ls5/d;->D:I

    .line 1107
    .line 1108
    sub-int/2addr v2, v10

    .line 1109
    int-to-float v8, v8

    .line 1110
    iget v10, v3, Ls5/d;->z:F

    .line 1111
    .line 1112
    mul-float/2addr v8, v10

    .line 1113
    float-to-int v8, v8

    .line 1114
    sub-int/2addr v2, v8

    .line 1115
    :cond_27
    :goto_15
    move v8, v2

    .line 1116
    :goto_16
    new-instance v2, Landroid/text/StaticLayout;

    .line 1117
    .line 1118
    iget-object v10, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 1119
    .line 1120
    iget v13, v3, Ls5/d;->d:F

    .line 1121
    .line 1122
    iget v14, v3, Ls5/d;->e:F

    .line 1123
    .line 1124
    const/4 v15, 0x1

    .line 1125
    const/16 v24, 0x1

    .line 1126
    .line 1127
    move-object/from16 v17, v2

    .line 1128
    .line 1129
    move-object/from16 v18, v4

    .line 1130
    .line 1131
    move-object/from16 v19, v10

    .line 1132
    .line 1133
    move/from16 v20, v0

    .line 1134
    .line 1135
    move-object/from16 v21, v9

    .line 1136
    .line 1137
    move/from16 v22, v13

    .line 1138
    .line 1139
    move/from16 v23, v14

    .line 1140
    .line 1141
    invoke-direct/range {v17 .. v24}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1142
    .line 1143
    .line 1144
    iput-object v2, v3, Ls5/d;->E:Landroid/text/StaticLayout;

    .line 1145
    .line 1146
    new-instance v2, Landroid/text/StaticLayout;

    .line 1147
    .line 1148
    iget-object v4, v3, Ls5/d;->f:Landroid/text/TextPaint;

    .line 1149
    .line 1150
    iget v10, v3, Ls5/d;->d:F

    .line 1151
    .line 1152
    iget v13, v3, Ls5/d;->e:F

    .line 1153
    .line 1154
    move-object/from16 v17, v2

    .line 1155
    .line 1156
    move-object/from16 v18, v7

    .line 1157
    .line 1158
    move-object/from16 v19, v4

    .line 1159
    .line 1160
    move/from16 v22, v10

    .line 1161
    .line 1162
    move/from16 v23, v13

    .line 1163
    .line 1164
    move/from16 v24, v15

    .line 1165
    .line 1166
    invoke-direct/range {v17 .. v24}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1167
    .line 1168
    .line 1169
    iput-object v2, v3, Ls5/d;->F:Landroid/text/StaticLayout;

    .line 1170
    .line 1171
    iput v5, v3, Ls5/d;->G:I

    .line 1172
    .line 1173
    iput v8, v3, Ls5/d;->H:I

    .line 1174
    .line 1175
    iput v1, v3, Ls5/d;->I:I

    .line 1176
    .line 1177
    goto/16 :goto_1a

    .line 1178
    .line 1179
    :cond_28
    move/from16 v42, v0

    .line 1180
    .line 1181
    move/from16 v26, v2

    .line 1182
    .line 1183
    move/from16 v27, v7

    .line 1184
    .line 1185
    move/from16 v41, v10

    .line 1186
    .line 1187
    move/from16 v43, v11

    .line 1188
    .line 1189
    move/from16 v40, v12

    .line 1190
    .line 1191
    move/from16 v39, v13

    .line 1192
    .line 1193
    move/from16 v38, v15

    .line 1194
    .line 1195
    const/4 v11, 0x0

    .line 1196
    const/4 v12, 0x0

    .line 1197
    iget-object v0, v3, Ls5/d;->k:Landroid/graphics/Bitmap;

    .line 1198
    .line 1199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    iget-object v0, v3, Ls5/d;->k:Landroid/graphics/Bitmap;

    .line 1203
    .line 1204
    iget v1, v3, Ls5/d;->C:I

    .line 1205
    .line 1206
    iget v2, v3, Ls5/d;->A:I

    .line 1207
    .line 1208
    sub-int/2addr v1, v2

    .line 1209
    iget v4, v3, Ls5/d;->D:I

    .line 1210
    .line 1211
    iget v5, v3, Ls5/d;->B:I

    .line 1212
    .line 1213
    sub-int/2addr v4, v5

    .line 1214
    int-to-float v2, v2

    .line 1215
    int-to-float v1, v1

    .line 1216
    iget v7, v3, Ls5/d;->o:F

    .line 1217
    .line 1218
    mul-float/2addr v7, v1

    .line 1219
    add-float/2addr v7, v2

    .line 1220
    int-to-float v2, v5

    .line 1221
    int-to-float v4, v4

    .line 1222
    iget v5, v3, Ls5/d;->l:F

    .line 1223
    .line 1224
    mul-float/2addr v5, v4

    .line 1225
    add-float/2addr v5, v2

    .line 1226
    iget v2, v3, Ls5/d;->q:F

    .line 1227
    .line 1228
    mul-float/2addr v1, v2

    .line 1229
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 1230
    .line 1231
    .line 1232
    move-result v1

    .line 1233
    iget v2, v3, Ls5/d;->r:F

    .line 1234
    .line 1235
    const v8, -0x800001

    .line 1236
    .line 1237
    .line 1238
    cmpl-float v8, v2, v8

    .line 1239
    .line 1240
    if-eqz v8, :cond_29

    .line 1241
    .line 1242
    goto :goto_17

    .line 1243
    :cond_29
    int-to-float v2, v1

    .line 1244
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1245
    .line 1246
    .line 1247
    move-result v4

    .line 1248
    int-to-float v4, v4

    .line 1249
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    int-to-float v0, v0

    .line 1254
    div-float/2addr v4, v0

    .line 1255
    :goto_17
    mul-float/2addr v4, v2

    .line 1256
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    iget v2, v3, Ls5/d;->p:I

    .line 1261
    .line 1262
    const/4 v4, 0x2

    .line 1263
    if-ne v2, v4, :cond_2a

    .line 1264
    .line 1265
    int-to-float v2, v1

    .line 1266
    goto :goto_18

    .line 1267
    :cond_2a
    const/4 v4, 0x1

    .line 1268
    if-ne v2, v4, :cond_2b

    .line 1269
    .line 1270
    div-int/lit8 v2, v1, 0x2

    .line 1271
    .line 1272
    int-to-float v2, v2

    .line 1273
    :goto_18
    sub-float/2addr v7, v2

    .line 1274
    :cond_2b
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 1275
    .line 1276
    .line 1277
    move-result v2

    .line 1278
    iget v4, v3, Ls5/d;->n:I

    .line 1279
    .line 1280
    const/4 v7, 0x2

    .line 1281
    if-ne v4, v7, :cond_2c

    .line 1282
    .line 1283
    int-to-float v4, v0

    .line 1284
    goto :goto_19

    .line 1285
    :cond_2c
    const/4 v7, 0x1

    .line 1286
    if-ne v4, v7, :cond_2d

    .line 1287
    .line 1288
    div-int/lit8 v4, v0, 0x2

    .line 1289
    .line 1290
    int-to-float v4, v4

    .line 1291
    :goto_19
    sub-float/2addr v5, v4

    .line 1292
    :cond_2d
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1293
    .line 1294
    .line 1295
    move-result v4

    .line 1296
    new-instance v5, Landroid/graphics/Rect;

    .line 1297
    .line 1298
    add-int/2addr v1, v2

    .line 1299
    add-int/2addr v0, v4

    .line 1300
    invoke-direct {v5, v2, v4, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1301
    .line 1302
    .line 1303
    iput-object v5, v3, Ls5/d;->J:Landroid/graphics/Rect;

    .line 1304
    .line 1305
    :goto_1a
    move-object/from16 v13, p1

    .line 1306
    .line 1307
    :goto_1b
    invoke-virtual {v3, v13, v6}, Ls5/d;->a(Landroid/graphics/Canvas;Z)V

    .line 1308
    .line 1309
    .line 1310
    :goto_1c
    add-int/lit8 v0, v43, 0x1

    .line 1311
    .line 1312
    move v9, v12

    .line 1313
    move/from16 v2, v26

    .line 1314
    .line 1315
    move/from16 v7, v27

    .line 1316
    .line 1317
    move-object/from16 v1, v35

    .line 1318
    .line 1319
    move/from16 v10, v36

    .line 1320
    .line 1321
    move/from16 v6, v38

    .line 1322
    .line 1323
    move/from16 v5, v39

    .line 1324
    .line 1325
    move/from16 v4, v40

    .line 1326
    .line 1327
    move/from16 v3, v41

    .line 1328
    .line 1329
    move/from16 v8, v42

    .line 1330
    .line 1331
    move v12, v0

    .line 1332
    move-object/from16 v0, p0

    .line 1333
    .line 1334
    goto/16 :goto_0

    .line 1335
    .line 1336
    :cond_2e
    :goto_1d
    return-void
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method
