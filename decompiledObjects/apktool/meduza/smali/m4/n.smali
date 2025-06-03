.class public final Lm4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/n$a;
    }
.end annotation


# instance fields
.field public final a:Lm4/z;

.field public b:Ljava/lang/String;

.field public c:Lc4/v;

.field public d:Lm4/n$a;

.field public e:Z

.field public final f:[Z

.field public final g:Lm4/r;

.field public final h:Lm4/r;

.field public final i:Lm4/r;

.field public final j:Lm4/r;

.field public final k:Lm4/r;

.field public l:J

.field public m:J

.field public final n:Lv5/u;


# direct methods
.method public constructor <init>(Lm4/z;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/n;->a:Lm4/z;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lm4/n;->f:[Z

    new-instance p1, Lm4/r;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/n;->g:Lm4/r;

    new-instance p1, Lm4/r;

    const/16 v0, 0x21

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/n;->h:Lm4/r;

    new-instance p1, Lm4/r;

    const/16 v0, 0x22

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/n;->i:Lm4/r;

    new-instance p1, Lm4/r;

    const/16 v0, 0x27

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/n;->j:Lm4/r;

    new-instance p1, Lm4/r;

    const/16 v0, 0x28

    invoke-direct {p1, v0}, Lm4/r;-><init>(I)V

    iput-object p1, p0, Lm4/n;->k:Lm4/r;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/n;->m:J

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Lm4/n;->n:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/n;->c:Lc4/v;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lv5/e0;->a:I

    .line 11
    .line 12
    :goto_0
    iget v2, v1, Lv5/u;->c:I

    .line 13
    .line 14
    iget v3, v1, Lv5/u;->b:I

    .line 15
    .line 16
    sub-int v4, v2, v3

    .line 17
    .line 18
    if-lez v4, :cond_1a

    .line 19
    .line 20
    iget-object v5, v1, Lv5/u;->a:[B

    .line 21
    .line 22
    iget-wide v6, v0, Lm4/n;->l:J

    .line 23
    .line 24
    int-to-long v8, v4

    .line 25
    add-long/2addr v6, v8

    .line 26
    iput-wide v6, v0, Lm4/n;->l:J

    .line 27
    .line 28
    iget-object v6, v0, Lm4/n;->c:Lc4/v;

    .line 29
    .line 30
    invoke-interface {v6, v4, v1}, Lc4/v;->b(ILv5/u;)V

    .line 31
    .line 32
    .line 33
    :goto_1
    if-ge v3, v2, :cond_19

    .line 34
    .line 35
    iget-object v4, v0, Lm4/n;->f:[Z

    .line 36
    .line 37
    invoke-static {v5, v3, v2, v4}, Lv5/q;->b([BII[Z)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v5, v3, v2}, Lm4/n;->f([BII)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    add-int/lit8 v6, v4, 0x3

    .line 48
    .line 49
    aget-byte v7, v5, v6

    .line 50
    .line 51
    and-int/lit8 v7, v7, 0x7e

    .line 52
    .line 53
    const/4 v8, 0x1

    .line 54
    shr-int/2addr v7, v8

    .line 55
    sub-int v9, v4, v3

    .line 56
    .line 57
    if-lez v9, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v5, v3, v4}, Lm4/n;->f([BII)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sub-int v15, v2, v4

    .line 63
    .line 64
    iget-wide v3, v0, Lm4/n;->l:J

    .line 65
    .line 66
    int-to-long v10, v15

    .line 67
    sub-long/2addr v3, v10

    .line 68
    const/4 v14, 0x0

    .line 69
    if-gez v9, :cond_2

    .line 70
    .line 71
    neg-int v9, v9

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v9, v14

    .line 74
    :goto_2
    iget-wide v10, v0, Lm4/n;->m:J

    .line 75
    .line 76
    iget-object v12, v0, Lm4/n;->d:Lm4/n$a;

    .line 77
    .line 78
    iget-boolean v13, v0, Lm4/n;->e:Z

    .line 79
    .line 80
    iget-boolean v8, v12, Lm4/n$a;->j:Z

    .line 81
    .line 82
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    iget-boolean v8, v12, Lm4/n$a;->g:Z

    .line 90
    .line 91
    if-eqz v8, :cond_3

    .line 92
    .line 93
    iget-boolean v8, v12, Lm4/n$a;->c:Z

    .line 94
    .line 95
    iput-boolean v8, v12, Lm4/n$a;->m:Z

    .line 96
    .line 97
    iput-boolean v14, v12, Lm4/n$a;->j:Z

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    iget-boolean v8, v12, Lm4/n$a;->h:Z

    .line 101
    .line 102
    if-nez v8, :cond_5

    .line 103
    .line 104
    iget-boolean v8, v12, Lm4/n$a;->g:Z

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    :goto_3
    move/from16 v19, v2

    .line 110
    .line 111
    move-object/from16 v27, v5

    .line 112
    .line 113
    move/from16 v28, v6

    .line 114
    .line 115
    move v8, v15

    .line 116
    goto :goto_6

    .line 117
    :cond_5
    :goto_4
    if-eqz v13, :cond_7

    .line 118
    .line 119
    iget-boolean v8, v12, Lm4/n$a;->i:Z

    .line 120
    .line 121
    if-eqz v8, :cond_7

    .line 122
    .line 123
    move v8, v15

    .line 124
    iget-wide v14, v12, Lm4/n$a;->b:J

    .line 125
    .line 126
    move/from16 v19, v2

    .line 127
    .line 128
    sub-long v1, v3, v14

    .line 129
    .line 130
    long-to-int v1, v1

    .line 131
    add-int v25, v1, v8

    .line 132
    .line 133
    iget-wide v1, v12, Lm4/n$a;->l:J

    .line 134
    .line 135
    cmp-long v13, v1, v17

    .line 136
    .line 137
    if-nez v13, :cond_6

    .line 138
    .line 139
    move-object/from16 v27, v5

    .line 140
    .line 141
    move/from16 v28, v6

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    iget-boolean v13, v12, Lm4/n$a;->m:Z

    .line 145
    .line 146
    move-object/from16 v27, v5

    .line 147
    .line 148
    move/from16 v28, v6

    .line 149
    .line 150
    iget-wide v5, v12, Lm4/n$a;->k:J

    .line 151
    .line 152
    sub-long/2addr v14, v5

    .line 153
    long-to-int v5, v14

    .line 154
    iget-object v6, v12, Lm4/n$a;->a:Lc4/v;

    .line 155
    .line 156
    const/16 v26, 0x0

    .line 157
    .line 158
    move-object/from16 v20, v6

    .line 159
    .line 160
    move-wide/from16 v21, v1

    .line 161
    .line 162
    move/from16 v23, v13

    .line 163
    .line 164
    move/from16 v24, v5

    .line 165
    .line 166
    invoke-interface/range {v20 .. v26}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    move/from16 v19, v2

    .line 171
    .line 172
    move-object/from16 v27, v5

    .line 173
    .line 174
    move/from16 v28, v6

    .line 175
    .line 176
    move v8, v15

    .line 177
    :goto_5
    iget-wide v1, v12, Lm4/n$a;->b:J

    .line 178
    .line 179
    iput-wide v1, v12, Lm4/n$a;->k:J

    .line 180
    .line 181
    iget-wide v1, v12, Lm4/n$a;->e:J

    .line 182
    .line 183
    iput-wide v1, v12, Lm4/n$a;->l:J

    .line 184
    .line 185
    iget-boolean v1, v12, Lm4/n$a;->c:Z

    .line 186
    .line 187
    iput-boolean v1, v12, Lm4/n$a;->m:Z

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    iput-boolean v1, v12, Lm4/n$a;->i:Z

    .line 191
    .line 192
    :goto_6
    iget-boolean v1, v0, Lm4/n;->e:Z

    .line 193
    .line 194
    if-nez v1, :cond_8

    .line 195
    .line 196
    iget-object v1, v0, Lm4/n;->g:Lm4/r;

    .line 197
    .line 198
    invoke-virtual {v1, v9}, Lm4/r;->b(I)Z

    .line 199
    .line 200
    .line 201
    iget-object v1, v0, Lm4/n;->h:Lm4/r;

    .line 202
    .line 203
    invoke-virtual {v1, v9}, Lm4/r;->b(I)Z

    .line 204
    .line 205
    .line 206
    iget-object v1, v0, Lm4/n;->i:Lm4/r;

    .line 207
    .line 208
    invoke-virtual {v1, v9}, Lm4/r;->b(I)Z

    .line 209
    .line 210
    .line 211
    iget-object v1, v0, Lm4/n;->g:Lm4/r;

    .line 212
    .line 213
    iget-boolean v2, v1, Lm4/r;->c:Z

    .line 214
    .line 215
    if-eqz v2, :cond_8

    .line 216
    .line 217
    iget-object v2, v0, Lm4/n;->h:Lm4/r;

    .line 218
    .line 219
    iget-boolean v5, v2, Lm4/r;->c:Z

    .line 220
    .line 221
    if-eqz v5, :cond_8

    .line 222
    .line 223
    iget-object v5, v0, Lm4/n;->i:Lm4/r;

    .line 224
    .line 225
    iget-boolean v6, v5, Lm4/r;->c:Z

    .line 226
    .line 227
    if-eqz v6, :cond_8

    .line 228
    .line 229
    iget-object v6, v0, Lm4/n;->c:Lc4/v;

    .line 230
    .line 231
    iget-object v12, v0, Lm4/n;->b:Ljava/lang/String;

    .line 232
    .line 233
    iget v13, v1, Lm4/r;->e:I

    .line 234
    .line 235
    iget v14, v2, Lm4/r;->e:I

    .line 236
    .line 237
    add-int/2addr v14, v13

    .line 238
    iget v15, v5, Lm4/r;->e:I

    .line 239
    .line 240
    add-int/2addr v14, v15

    .line 241
    new-array v14, v14, [B

    .line 242
    .line 243
    iget-object v15, v1, Lm4/r;->d:[B

    .line 244
    .line 245
    move/from16 v20, v8

    .line 246
    .line 247
    const/4 v8, 0x0

    .line 248
    invoke-static {v15, v8, v14, v8, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 249
    .line 250
    .line 251
    iget-object v13, v2, Lm4/r;->d:[B

    .line 252
    .line 253
    iget v15, v1, Lm4/r;->e:I

    .line 254
    .line 255
    move/from16 v21, v7

    .line 256
    .line 257
    iget v7, v2, Lm4/r;->e:I

    .line 258
    .line 259
    invoke-static {v13, v8, v14, v15, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    .line 261
    .line 262
    iget-object v7, v5, Lm4/r;->d:[B

    .line 263
    .line 264
    iget v1, v1, Lm4/r;->e:I

    .line 265
    .line 266
    iget v13, v2, Lm4/r;->e:I

    .line 267
    .line 268
    add-int/2addr v1, v13

    .line 269
    iget v5, v5, Lm4/r;->e:I

    .line 270
    .line 271
    invoke-static {v7, v8, v14, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    .line 273
    .line 274
    iget-object v1, v2, Lm4/r;->d:[B

    .line 275
    .line 276
    iget v2, v2, Lm4/r;->e:I

    .line 277
    .line 278
    const/4 v5, 0x3

    .line 279
    invoke-static {v1, v5, v2}, Lv5/q;->c([BII)Lv5/q$a;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget v2, v1, Lv5/q$a;->a:I

    .line 284
    .line 285
    iget-boolean v5, v1, Lv5/q$a;->b:Z

    .line 286
    .line 287
    iget v7, v1, Lv5/q$a;->c:I

    .line 288
    .line 289
    iget v8, v1, Lv5/q$a;->d:I

    .line 290
    .line 291
    iget-object v13, v1, Lv5/q$a;->e:[I

    .line 292
    .line 293
    iget v15, v1, Lv5/q$a;->f:I

    .line 294
    .line 295
    move/from16 v29, v2

    .line 296
    .line 297
    move/from16 v30, v5

    .line 298
    .line 299
    move/from16 v31, v7

    .line 300
    .line 301
    move/from16 v32, v8

    .line 302
    .line 303
    move-object/from16 v33, v13

    .line 304
    .line 305
    move/from16 v34, v15

    .line 306
    .line 307
    invoke-static/range {v29 .. v34}, Lb/a0;->m(IZII[II)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v5, Lv3/i0$a;

    .line 312
    .line 313
    invoke-direct {v5}, Lv3/i0$a;-><init>()V

    .line 314
    .line 315
    .line 316
    iput-object v12, v5, Lv3/i0$a;->a:Ljava/lang/String;

    .line 317
    .line 318
    const-string v7, "video/hevc"

    .line 319
    .line 320
    iput-object v7, v5, Lv3/i0$a;->k:Ljava/lang/String;

    .line 321
    .line 322
    iput-object v2, v5, Lv3/i0$a;->h:Ljava/lang/String;

    .line 323
    .line 324
    iget v2, v1, Lv5/q$a;->g:I

    .line 325
    .line 326
    iput v2, v5, Lv3/i0$a;->p:I

    .line 327
    .line 328
    iget v2, v1, Lv5/q$a;->h:I

    .line 329
    .line 330
    iput v2, v5, Lv3/i0$a;->q:I

    .line 331
    .line 332
    iget v1, v1, Lv5/q$a;->i:F

    .line 333
    .line 334
    iput v1, v5, Lv3/i0$a;->t:F

    .line 335
    .line 336
    invoke-static {v14}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v5, Lv3/i0$a;->m:Ljava/util/List;

    .line 341
    .line 342
    new-instance v1, Lv3/i0;

    .line 343
    .line 344
    invoke-direct {v1, v5}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 345
    .line 346
    .line 347
    invoke-interface {v6, v1}, Lc4/v;->d(Lv3/i0;)V

    .line 348
    .line 349
    .line 350
    const/4 v1, 0x1

    .line 351
    iput-boolean v1, v0, Lm4/n;->e:Z

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_8
    move/from16 v21, v7

    .line 355
    .line 356
    move/from16 v20, v8

    .line 357
    .line 358
    :goto_7
    iget-object v1, v0, Lm4/n;->j:Lm4/r;

    .line 359
    .line 360
    invoke-virtual {v1, v9}, Lm4/r;->b(I)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    const/4 v2, 0x5

    .line 365
    if-eqz v1, :cond_9

    .line 366
    .line 367
    iget-object v1, v0, Lm4/n;->j:Lm4/r;

    .line 368
    .line 369
    iget-object v5, v1, Lm4/r;->d:[B

    .line 370
    .line 371
    iget v1, v1, Lm4/r;->e:I

    .line 372
    .line 373
    invoke-static {v5, v1}, Lv5/q;->e([BI)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    iget-object v5, v0, Lm4/n;->n:Lv5/u;

    .line 378
    .line 379
    iget-object v6, v0, Lm4/n;->j:Lm4/r;

    .line 380
    .line 381
    iget-object v6, v6, Lm4/r;->d:[B

    .line 382
    .line 383
    invoke-virtual {v5, v6, v1}, Lv5/u;->E([BI)V

    .line 384
    .line 385
    .line 386
    iget-object v1, v0, Lm4/n;->n:Lv5/u;

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Lv5/u;->H(I)V

    .line 389
    .line 390
    .line 391
    iget-object v1, v0, Lm4/n;->a:Lm4/z;

    .line 392
    .line 393
    iget-object v5, v0, Lm4/n;->n:Lv5/u;

    .line 394
    .line 395
    iget-object v1, v1, Lm4/z;->b:[Lc4/v;

    .line 396
    .line 397
    invoke-static {v10, v11, v5, v1}, Lc4/b;->a(JLv5/u;[Lc4/v;)V

    .line 398
    .line 399
    .line 400
    :cond_9
    iget-object v1, v0, Lm4/n;->k:Lm4/r;

    .line 401
    .line 402
    invoke-virtual {v1, v9}, Lm4/r;->b(I)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_a

    .line 407
    .line 408
    iget-object v1, v0, Lm4/n;->k:Lm4/r;

    .line 409
    .line 410
    iget-object v5, v1, Lm4/r;->d:[B

    .line 411
    .line 412
    iget v1, v1, Lm4/r;->e:I

    .line 413
    .line 414
    invoke-static {v5, v1}, Lv5/q;->e([BI)I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    iget-object v5, v0, Lm4/n;->n:Lv5/u;

    .line 419
    .line 420
    iget-object v6, v0, Lm4/n;->k:Lm4/r;

    .line 421
    .line 422
    iget-object v6, v6, Lm4/r;->d:[B

    .line 423
    .line 424
    invoke-virtual {v5, v6, v1}, Lv5/u;->E([BI)V

    .line 425
    .line 426
    .line 427
    iget-object v1, v0, Lm4/n;->n:Lv5/u;

    .line 428
    .line 429
    invoke-virtual {v1, v2}, Lv5/u;->H(I)V

    .line 430
    .line 431
    .line 432
    iget-object v1, v0, Lm4/n;->a:Lm4/z;

    .line 433
    .line 434
    iget-object v2, v0, Lm4/n;->n:Lv5/u;

    .line 435
    .line 436
    iget-object v1, v1, Lm4/z;->b:[Lc4/v;

    .line 437
    .line 438
    invoke-static {v10, v11, v2, v1}, Lc4/b;->a(JLv5/u;[Lc4/v;)V

    .line 439
    .line 440
    .line 441
    :cond_a
    iget-wide v1, v0, Lm4/n;->m:J

    .line 442
    .line 443
    iget-object v5, v0, Lm4/n;->d:Lm4/n$a;

    .line 444
    .line 445
    iget-boolean v6, v0, Lm4/n;->e:Z

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    iput-boolean v7, v5, Lm4/n$a;->g:Z

    .line 449
    .line 450
    iput-boolean v7, v5, Lm4/n$a;->h:Z

    .line 451
    .line 452
    iput-wide v1, v5, Lm4/n$a;->e:J

    .line 453
    .line 454
    iput v7, v5, Lm4/n$a;->d:I

    .line 455
    .line 456
    iput-wide v3, v5, Lm4/n$a;->b:J

    .line 457
    .line 458
    const/16 v1, 0x20

    .line 459
    .line 460
    move/from16 v2, v21

    .line 461
    .line 462
    if-lt v2, v1, :cond_c

    .line 463
    .line 464
    const/16 v8, 0x28

    .line 465
    .line 466
    if-ne v2, v8, :cond_b

    .line 467
    .line 468
    goto :goto_8

    .line 469
    :cond_b
    move v8, v7

    .line 470
    goto :goto_9

    .line 471
    :cond_c
    :goto_8
    const/4 v8, 0x1

    .line 472
    :goto_9
    if-nez v8, :cond_13

    .line 473
    .line 474
    iget-boolean v8, v5, Lm4/n$a;->i:Z

    .line 475
    .line 476
    if-eqz v8, :cond_f

    .line 477
    .line 478
    iget-boolean v8, v5, Lm4/n$a;->j:Z

    .line 479
    .line 480
    if-nez v8, :cond_f

    .line 481
    .line 482
    if-eqz v6, :cond_e

    .line 483
    .line 484
    iget-wide v11, v5, Lm4/n$a;->l:J

    .line 485
    .line 486
    cmp-long v6, v11, v17

    .line 487
    .line 488
    if-nez v6, :cond_d

    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_d
    iget-boolean v13, v5, Lm4/n$a;->m:Z

    .line 492
    .line 493
    iget-wide v8, v5, Lm4/n$a;->k:J

    .line 494
    .line 495
    sub-long/2addr v3, v8

    .line 496
    long-to-int v14, v3

    .line 497
    iget-object v10, v5, Lm4/n$a;->a:Lc4/v;

    .line 498
    .line 499
    const/16 v16, 0x0

    .line 500
    .line 501
    move v3, v7

    .line 502
    move/from16 v15, v20

    .line 503
    .line 504
    invoke-interface/range {v10 .. v16}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 505
    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_e
    :goto_a
    move v3, v7

    .line 509
    :goto_b
    iput-boolean v3, v5, Lm4/n$a;->i:Z

    .line 510
    .line 511
    goto :goto_c

    .line 512
    :cond_f
    move v3, v7

    .line 513
    :goto_c
    if-gt v1, v2, :cond_10

    .line 514
    .line 515
    const/16 v1, 0x23

    .line 516
    .line 517
    if-le v2, v1, :cond_11

    .line 518
    .line 519
    :cond_10
    const/16 v1, 0x27

    .line 520
    .line 521
    if-ne v2, v1, :cond_12

    .line 522
    .line 523
    :cond_11
    const/4 v14, 0x1

    .line 524
    goto :goto_d

    .line 525
    :cond_12
    move v14, v3

    .line 526
    :goto_d
    if-eqz v14, :cond_14

    .line 527
    .line 528
    iget-boolean v1, v5, Lm4/n$a;->j:Z

    .line 529
    .line 530
    const/4 v4, 0x1

    .line 531
    xor-int/2addr v1, v4

    .line 532
    iput-boolean v1, v5, Lm4/n$a;->h:Z

    .line 533
    .line 534
    iput-boolean v4, v5, Lm4/n$a;->j:Z

    .line 535
    .line 536
    goto :goto_e

    .line 537
    :cond_13
    move v3, v7

    .line 538
    :cond_14
    const/4 v4, 0x1

    .line 539
    :goto_e
    const/16 v1, 0x10

    .line 540
    .line 541
    if-lt v2, v1, :cond_15

    .line 542
    .line 543
    const/16 v1, 0x15

    .line 544
    .line 545
    if-gt v2, v1, :cond_15

    .line 546
    .line 547
    move v14, v4

    .line 548
    goto :goto_f

    .line 549
    :cond_15
    move v14, v3

    .line 550
    :goto_f
    iput-boolean v14, v5, Lm4/n$a;->c:Z

    .line 551
    .line 552
    if-nez v14, :cond_17

    .line 553
    .line 554
    const/16 v1, 0x9

    .line 555
    .line 556
    if-gt v2, v1, :cond_16

    .line 557
    .line 558
    goto :goto_10

    .line 559
    :cond_16
    move v8, v3

    .line 560
    goto :goto_11

    .line 561
    :cond_17
    :goto_10
    move v8, v4

    .line 562
    :goto_11
    iput-boolean v8, v5, Lm4/n$a;->f:Z

    .line 563
    .line 564
    iget-boolean v1, v0, Lm4/n;->e:Z

    .line 565
    .line 566
    if-nez v1, :cond_18

    .line 567
    .line 568
    iget-object v1, v0, Lm4/n;->g:Lm4/r;

    .line 569
    .line 570
    invoke-virtual {v1, v2}, Lm4/r;->d(I)V

    .line 571
    .line 572
    .line 573
    iget-object v1, v0, Lm4/n;->h:Lm4/r;

    .line 574
    .line 575
    invoke-virtual {v1, v2}, Lm4/r;->d(I)V

    .line 576
    .line 577
    .line 578
    iget-object v1, v0, Lm4/n;->i:Lm4/r;

    .line 579
    .line 580
    invoke-virtual {v1, v2}, Lm4/r;->d(I)V

    .line 581
    .line 582
    .line 583
    :cond_18
    iget-object v1, v0, Lm4/n;->j:Lm4/r;

    .line 584
    .line 585
    invoke-virtual {v1, v2}, Lm4/r;->d(I)V

    .line 586
    .line 587
    .line 588
    iget-object v1, v0, Lm4/n;->k:Lm4/r;

    .line 589
    .line 590
    invoke-virtual {v1, v2}, Lm4/r;->d(I)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v1, p1

    .line 594
    .line 595
    move/from16 v2, v19

    .line 596
    .line 597
    move-object/from16 v5, v27

    .line 598
    .line 599
    move/from16 v3, v28

    .line 600
    .line 601
    goto/16 :goto_1

    .line 602
    .line 603
    :cond_19
    move-object/from16 v1, p1

    .line 604
    .line 605
    goto/16 :goto_0

    .line 606
    .line 607
    :cond_1a
    return-void
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

.method public final b()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lm4/n;->l:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, Lm4/n;->m:J

    .line 11
    .line 12
    iget-object v0, p0, Lm4/n;->f:[Z

    .line 13
    .line 14
    invoke-static {v0}, Lv5/q;->a([Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lm4/n;->g:Lm4/r;

    .line 18
    .line 19
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lm4/n;->h:Lm4/r;

    .line 23
    .line 24
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lm4/n;->i:Lm4/r;

    .line 28
    .line 29
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lm4/n;->j:Lm4/r;

    .line 33
    .line 34
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lm4/n;->k:Lm4/r;

    .line 38
    .line 39
    invoke-virtual {v0}, Lm4/r;->c()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lm4/n;->d:Lm4/n$a;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    iput-boolean v1, v0, Lm4/n$a;->f:Z

    .line 48
    .line 49
    iput-boolean v1, v0, Lm4/n$a;->g:Z

    .line 50
    .line 51
    iput-boolean v1, v0, Lm4/n$a;->h:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Lm4/n$a;->i:Z

    .line 54
    .line 55
    iput-boolean v1, v0, Lm4/n$a;->j:Z

    .line 56
    .line 57
    :cond_0
    return-void
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
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(IJ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    iput-wide p2, p0, Lm4/n;->m:J

    :cond_0
    return-void
.end method

.method public final e(Lc4/j;Lm4/d0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm4/d0$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lm4/n;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lm4/d0$d;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lm4/n;->c:Lc4/v;

    .line 22
    .line 23
    new-instance v1, Lm4/n$a;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lm4/n$a;-><init>(Lc4/v;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lm4/n;->d:Lm4/n$a;

    .line 29
    .line 30
    iget-object v0, p0, Lm4/n;->a:Lm4/z;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lm4/z;->a(Lc4/j;Lm4/d0$d;)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public final f([BII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm4/n;->d:Lm4/n$a;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm4/n$a;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    iget v2, v0, Lm4/n$a;->d:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-ge v1, p3, :cond_1

    .line 13
    .line 14
    aget-byte v1, p1, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iput-boolean v1, v0, Lm4/n$a;->g:Z

    .line 25
    .line 26
    iput-boolean v2, v0, Lm4/n$a;->f:Z

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sub-int v1, p3, p2

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, v0, Lm4/n$a;->d:I

    .line 33
    .line 34
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lm4/n;->e:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lm4/n;->g:Lm4/r;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, Lm4/r;->a([BII)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lm4/n;->h:Lm4/r;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lm4/r;->a([BII)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lm4/n;->i:Lm4/r;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2, p3}, Lm4/r;->a([BII)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, Lm4/n;->j:Lm4/r;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lm4/r;->a([BII)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lm4/n;->k:Lm4/r;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2, p3}, Lm4/r;->a([BII)V

    .line 61
    .line 62
    .line 63
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
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
.end method
