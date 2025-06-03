.class public final Lr5/a;
.super Lr5/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/a$a;,
        Lr5/a$b;
    }
.end annotation


# instance fields
.field public final g:Lt5/e;

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lr5/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lv5/c;

.field public q:F

.field public r:I

.field public s:I

.field public t:J

.field public u:Lb5/m;


# direct methods
.method public constructor <init>(Lz4/i0;[IILt5/e;JJJLo7/t;)V
    .locals 0

    sget-object p3, Lv5/c;->a:Lv5/z;

    invoke-direct {p0, p1, p2}, Lr5/b;-><init>(Lz4/i0;[I)V

    cmp-long p1, p9, p5

    if-gez p1, :cond_0

    const-string p1, "AdaptiveTrackSelection"

    const-string p2, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    invoke-static {p1, p2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    move-wide p9, p5

    :cond_0
    iput-object p4, p0, Lr5/a;->g:Lt5/e;

    const-wide/16 p1, 0x3e8

    mul-long/2addr p5, p1

    iput-wide p5, p0, Lr5/a;->h:J

    mul-long/2addr p7, p1

    iput-wide p7, p0, Lr5/a;->i:J

    mul-long/2addr p9, p1

    iput-wide p9, p0, Lr5/a;->j:J

    const/16 p1, 0x4ff

    iput p1, p0, Lr5/a;->k:I

    const/16 p1, 0x2cf

    iput p1, p0, Lr5/a;->l:I

    const p1, 0x3f333333    # 0.7f

    iput p1, p0, Lr5/a;->m:F

    const/high16 p1, 0x3f400000    # 0.75f

    iput p1, p0, Lr5/a;->n:F

    invoke-static {p11}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Lr5/a;->o:Lo7/t;

    iput-object p3, p0, Lr5/a;->p:Lv5/c;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lr5/a;->q:F

    const/4 p1, 0x0

    iput p1, p0, Lr5/a;->s:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lr5/a;->t:J

    return-void
.end method

.method public static v(Ljava/util/ArrayList;[J)V
    .locals 7

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move v3, v0

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    aget-wide v4, p1, v3

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo7/t$a;

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v4, Lr5/a$a;

    aget-wide v5, p1, v0

    invoke-direct {v4, v1, v2, v5, v6}, Lr5/a$a;-><init>(JJ)V

    invoke-virtual {v3, v4}, Lo7/t$a;->c(Ljava/lang/Object;)V

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static x(Ljava/util/List;)J
    .locals 7

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-static {p0}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb5/m;

    iget-wide v3, p0, Lb5/e;->g:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    iget-wide v5, p0, Lb5/e;->h:J

    cmp-long p0, v5, v1

    if-eqz p0, :cond_1

    sub-long v1, v5, v3

    :cond_1
    return-wide v1
.end method


# virtual methods
.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lr5/a;->u:Lb5/m;

    return-void
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lr5/a;->r:I

    return v0
.end method

.method public final j(JJLjava/util/List;[Lb5/n;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr5/a;->p:Lv5/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lv5/c;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget v2, p0, Lr5/a;->r:I

    .line 8
    .line 9
    array-length v3, p6

    .line 10
    if-ge v2, v3, :cond_0

    .line 11
    .line 12
    aget-object v2, p6, v2

    .line 13
    .line 14
    invoke-interface {v2}, Lb5/n;->next()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget v2, p0, Lr5/a;->r:I

    .line 21
    .line 22
    aget-object p6, p6, v2

    .line 23
    .line 24
    invoke-interface {p6}, Lb5/n;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-interface {p6}, Lb5/n;->a()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    array-length v2, p6

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-ge v3, v2, :cond_2

    .line 36
    .line 37
    aget-object v4, p6, v3

    .line 38
    .line 39
    invoke-interface {v4}, Lb5/n;->next()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-interface {v4}, Lb5/n;->b()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    invoke-interface {v4}, Lb5/n;->a()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    :goto_1
    sub-long/2addr v2, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-static {p5}, Lr5/a;->x(Ljava/util/List;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    :goto_2
    iget p6, p0, Lr5/a;->s:I

    .line 63
    .line 64
    if-nez p6, :cond_3

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput p1, p0, Lr5/a;->s:I

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1, v2, v3}, Lr5/a;->w(JJ)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput p1, p0, Lr5/a;->r:I

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    iget v4, p0, Lr5/a;->r:I

    .line 77
    .line 78
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/4 v6, -0x1

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    move v5, v6

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-static {p5}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lb5/m;

    .line 92
    .line 93
    iget-object v5, v5, Lb5/e;->d:Lv3/i0;

    .line 94
    .line 95
    invoke-virtual {p0, v5}, Lr5/b;->d(Lv3/i0;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    :goto_3
    if-eq v5, v6, :cond_5

    .line 100
    .line 101
    invoke-static {p5}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p5

    .line 105
    check-cast p5, Lb5/m;

    .line 106
    .line 107
    iget p6, p5, Lb5/e;->e:I

    .line 108
    .line 109
    move v4, v5

    .line 110
    :cond_5
    invoke-virtual {p0, v0, v1, v2, v3}, Lr5/a;->w(JJ)I

    .line 111
    .line 112
    .line 113
    move-result p5

    .line 114
    invoke-virtual {p0, v4, v0, v1}, Lr5/b;->l(IJ)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_9

    .line 119
    .line 120
    iget-object v0, p0, Lr5/b;->d:[Lv3/i0;

    .line 121
    .line 122
    aget-object v1, v0, v4

    .line 123
    .line 124
    aget-object v0, v0, p5

    .line 125
    .line 126
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    cmp-long v7, p3, v5

    .line 132
    .line 133
    if-nez v7, :cond_6

    .line 134
    .line 135
    iget-wide p3, p0, Lr5/a;->h:J

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    cmp-long v5, v2, v5

    .line 139
    .line 140
    if-eqz v5, :cond_7

    .line 141
    .line 142
    sub-long/2addr p3, v2

    .line 143
    :cond_7
    long-to-float p3, p3

    .line 144
    iget p4, p0, Lr5/a;->n:F

    .line 145
    .line 146
    mul-float/2addr p3, p4

    .line 147
    float-to-long p3, p3

    .line 148
    iget-wide v2, p0, Lr5/a;->h:J

    .line 149
    .line 150
    invoke-static {p3, p4, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide p3

    .line 154
    :goto_4
    iget v0, v0, Lv3/i0;->p:I

    .line 155
    .line 156
    iget v1, v1, Lv3/i0;->p:I

    .line 157
    .line 158
    if-le v0, v1, :cond_8

    .line 159
    .line 160
    cmp-long p3, p1, p3

    .line 161
    .line 162
    if-gez p3, :cond_8

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    if-ge v0, v1, :cond_9

    .line 166
    .line 167
    iget-wide p3, p0, Lr5/a;->i:J

    .line 168
    .line 169
    cmp-long p1, p1, p3

    .line 170
    .line 171
    if-ltz p1, :cond_9

    .line 172
    .line 173
    :goto_5
    move p5, v4

    .line 174
    :cond_9
    if-ne p5, v4, :cond_a

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_a
    const/4 p6, 0x3

    .line 178
    :goto_6
    iput p6, p0, Lr5/a;->s:I

    .line 179
    .line 180
    iput p5, p0, Lr5/a;->r:I

    .line 181
    .line 182
    return-void
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
.end method

.method public final m()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lr5/a;->t:J

    const/4 v0, 0x0

    iput-object v0, p0, Lr5/a;->u:Lb5/m;

    return-void
.end method

.method public final n(JLjava/util/List;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lb5/m;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lr5/a;->p:Lv5/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lv5/c;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Lr5/a;->t:J

    .line 8
    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    sub-long v2, v0, v2

    .line 20
    .line 21
    const-wide/16 v6, 0x3e8

    .line 22
    .line 23
    cmp-long v2, v2, v6

    .line 24
    .line 25
    if-gez v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-static {p3}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lb5/m;

    .line 38
    .line 39
    iget-object v3, p0, Lr5/a;->u:Lb5/m;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v2, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 51
    :goto_1
    if-nez v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_2
    iput-wide v0, p0, Lr5/a;->t:J

    .line 59
    .line 60
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {p3}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lb5/m;

    .line 73
    .line 74
    :goto_2
    iput-object v2, p0, Lr5/a;->u:Lb5/m;

    .line 75
    .line 76
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    return v5

    .line 83
    :cond_4
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    add-int/lit8 v3, v2, -0x1

    .line 88
    .line 89
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Lb5/m;

    .line 94
    .line 95
    iget-wide v3, v3, Lb5/e;->g:J

    .line 96
    .line 97
    sub-long/2addr v3, p1

    .line 98
    iget v6, p0, Lr5/a;->q:F

    .line 99
    .line 100
    invoke-static {v3, v4, v6}, Lv5/e0;->x(JF)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    iget-wide v6, p0, Lr5/a;->j:J

    .line 105
    .line 106
    cmp-long v3, v3, v6

    .line 107
    .line 108
    if-gez v3, :cond_5

    .line 109
    .line 110
    return v2

    .line 111
    :cond_5
    invoke-static {p3}, Lr5/a;->x(Ljava/util/List;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-virtual {p0, v0, v1, v3, v4}, Lr5/a;->w(JJ)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-object v1, p0, Lr5/b;->d:[Lv3/i0;

    .line 120
    .line 121
    aget-object v0, v1, v0

    .line 122
    .line 123
    :goto_3
    if-ge v5, v2, :cond_7

    .line 124
    .line 125
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Lb5/m;

    .line 130
    .line 131
    iget-object v3, v1, Lb5/e;->d:Lv3/i0;

    .line 132
    .line 133
    iget-wide v8, v1, Lb5/e;->g:J

    .line 134
    .line 135
    sub-long/2addr v8, p1

    .line 136
    iget v1, p0, Lr5/a;->q:F

    .line 137
    .line 138
    invoke-static {v8, v9, v1}, Lv5/e0;->x(JF)J

    .line 139
    .line 140
    .line 141
    move-result-wide v8

    .line 142
    cmp-long v1, v8, v6

    .line 143
    .line 144
    if-ltz v1, :cond_6

    .line 145
    .line 146
    iget v1, v3, Lv3/i0;->p:I

    .line 147
    .line 148
    iget v4, v0, Lv3/i0;->p:I

    .line 149
    .line 150
    if-ge v1, v4, :cond_6

    .line 151
    .line 152
    iget v1, v3, Lv3/i0;->z:I

    .line 153
    .line 154
    const/4 v4, -0x1

    .line 155
    if-eq v1, v4, :cond_6

    .line 156
    .line 157
    iget v8, p0, Lr5/a;->l:I

    .line 158
    .line 159
    if-gt v1, v8, :cond_6

    .line 160
    .line 161
    iget v3, v3, Lv3/i0;->y:I

    .line 162
    .line 163
    if-eq v3, v4, :cond_6

    .line 164
    .line 165
    iget v4, p0, Lr5/a;->k:I

    .line 166
    .line 167
    if-gt v3, v4, :cond_6

    .line 168
    .line 169
    iget v3, v0, Lv3/i0;->z:I

    .line 170
    .line 171
    if-ge v1, v3, :cond_6

    .line 172
    .line 173
    return v5

    .line 174
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    return v2
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

.method public final q()I
    .locals 1

    iget v0, p0, Lr5/a;->s:I

    return v0
.end method

.method public final r(F)V
    .locals 0

    iput p1, p0, Lr5/a;->q:F

    return-void
.end method

.method public final s()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final w(JJ)I
    .locals 7

    .line 1
    iget-object p3, p0, Lr5/a;->g:Lt5/e;

    .line 2
    .line 3
    invoke-interface {p3}, Lt5/e;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    long-to-float p3, p3

    .line 8
    iget p4, p0, Lr5/a;->m:F

    .line 9
    .line 10
    mul-float/2addr p3, p4

    .line 11
    float-to-long p3, p3

    .line 12
    iget-object v0, p0, Lr5/a;->g:Lt5/e;

    .line 13
    .line 14
    invoke-interface {v0}, Lt5/e;->c()V

    .line 15
    .line 16
    .line 17
    long-to-float p3, p3

    .line 18
    iget p4, p0, Lr5/a;->q:F

    .line 19
    .line 20
    div-float/2addr p3, p4

    .line 21
    float-to-long p3, p3

    .line 22
    iget-object v0, p0, Lr5/a;->o:Lo7/t;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    iget-object v2, p0, Lr5/a;->o:Lo7/t;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v2, v1

    .line 40
    if-ge v0, v2, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Lr5/a;->o:Lo7/t;

    .line 43
    .line 44
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lr5/a$a;

    .line 49
    .line 50
    iget-wide v2, v2, Lr5/a$a;->a:J

    .line 51
    .line 52
    cmp-long v2, v2, p3

    .line 53
    .line 54
    if-gez v2, :cond_1

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v2, p0, Lr5/a;->o:Lo7/t;

    .line 60
    .line 61
    add-int/lit8 v3, v0, -0x1

    .line 62
    .line 63
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Lr5/a$a;

    .line 68
    .line 69
    iget-object v3, p0, Lr5/a;->o:Lo7/t;

    .line 70
    .line 71
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lr5/a$a;

    .line 76
    .line 77
    iget-wide v3, v2, Lr5/a$a;->a:J

    .line 78
    .line 79
    sub-long/2addr p3, v3

    .line 80
    long-to-float p3, p3

    .line 81
    iget-wide v5, v0, Lr5/a$a;->a:J

    .line 82
    .line 83
    sub-long/2addr v5, v3

    .line 84
    long-to-float p4, v5

    .line 85
    div-float/2addr p3, p4

    .line 86
    iget-wide v2, v2, Lr5/a$a;->b:J

    .line 87
    .line 88
    iget-wide v4, v0, Lr5/a$a;->b:J

    .line 89
    .line 90
    sub-long/2addr v4, v2

    .line 91
    long-to-float p4, v4

    .line 92
    mul-float/2addr p3, p4

    .line 93
    float-to-long p3, p3

    .line 94
    add-long/2addr p3, v2

    .line 95
    :goto_1
    const/4 v0, 0x0

    .line 96
    move v2, v0

    .line 97
    move v3, v2

    .line 98
    :goto_2
    iget v4, p0, Lr5/b;->b:I

    .line 99
    .line 100
    if-ge v2, v4, :cond_6

    .line 101
    .line 102
    const-wide/high16 v4, -0x8000000000000000L

    .line 103
    .line 104
    cmp-long v4, p1, v4

    .line 105
    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0, v2, p1, p2}, Lr5/b;->l(IJ)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    :cond_2
    iget-object v3, p0, Lr5/b;->d:[Lv3/i0;

    .line 115
    .line 116
    aget-object v3, v3, v2

    .line 117
    .line 118
    iget v3, v3, Lv3/i0;->p:I

    .line 119
    .line 120
    int-to-long v3, v3

    .line 121
    cmp-long v3, v3, p3

    .line 122
    .line 123
    if-gtz v3, :cond_3

    .line 124
    .line 125
    move v3, v1

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    move v3, v0

    .line 128
    :goto_3
    if-eqz v3, :cond_4

    .line 129
    .line 130
    return v2

    .line 131
    :cond_4
    move v3, v2

    .line 132
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    return v3
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
