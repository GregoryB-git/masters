.class public final Le5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5/g$c;,
        Le5/g$a;,
        Le5/g$d;,
        Le5/g$e;,
        Le5/g$b;
    }
.end annotation


# instance fields
.field public final a:Le5/i;

.field public final b:Lt5/k;

.field public final c:Lt5/k;

.field public final d:Ld2/h0;

.field public final e:[Landroid/net/Uri;

.field public final f:[Lv3/i0;

.field public final g:Lf5/j;

.field public final h:Lz4/i0;

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Le5/f;

.field public final k:Lw3/a0;

.field public l:Z

.field public m:[B

.field public n:Lz4/b;

.field public o:Landroid/net/Uri;

.field public p:Z

.field public q:Lr5/h;

.field public r:J

.field public s:Z


# direct methods
.method public constructor <init>(Le5/i;Lf5/j;[Landroid/net/Uri;[Lv3/i0;Le5/h;Lt5/l0;Ld2/h0;Ljava/util/List;Lw3/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le5/i;",
            "Lf5/j;",
            "[",
            "Landroid/net/Uri;",
            "[",
            "Lv3/i0;",
            "Le5/h;",
            "Lt5/l0;",
            "Ld2/h0;",
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;",
            "Lw3/a0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le5/g;->a:Le5/i;

    .line 5
    .line 6
    iput-object p2, p0, Le5/g;->g:Lf5/j;

    .line 7
    .line 8
    iput-object p3, p0, Le5/g;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iput-object p4, p0, Le5/g;->f:[Lv3/i0;

    .line 11
    .line 12
    iput-object p7, p0, Le5/g;->d:Ld2/h0;

    .line 13
    .line 14
    iput-object p8, p0, Le5/g;->i:Ljava/util/List;

    .line 15
    .line 16
    iput-object p9, p0, Le5/g;->k:Lw3/a0;

    .line 17
    .line 18
    new-instance p1, Le5/f;

    .line 19
    .line 20
    invoke-direct {p1}, Le5/f;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Le5/g;->j:Le5/f;

    .line 24
    .line 25
    sget-object p1, Lv5/e0;->f:[B

    .line 26
    .line 27
    iput-object p1, p0, Le5/g;->m:[B

    .line 28
    .line 29
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide p1, p0, Le5/g;->r:J

    .line 35
    .line 36
    invoke-interface {p5}, Le5/h;->a()Lt5/k;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Le5/g;->b:Lt5/k;

    .line 41
    .line 42
    if-eqz p6, :cond_0

    .line 43
    .line 44
    invoke-interface {p1, p6}, Lt5/k;->f(Lt5/l0;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-interface {p5}, Le5/h;->a()Lt5/k;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Le5/g;->c:Lt5/k;

    .line 52
    .line 53
    new-instance p1, Lz4/i0;

    .line 54
    .line 55
    const-string p2, ""

    .line 56
    .line 57
    invoke-direct {p1, p2, p4}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Le5/g;->h:Lz4/i0;

    .line 61
    .line 62
    new-instance p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    const/4 p2, 0x0

    .line 68
    :goto_0
    array-length p5, p3

    .line 69
    if-ge p2, p5, :cond_2

    .line 70
    .line 71
    aget-object p5, p4, p2

    .line 72
    .line 73
    iget p5, p5, Lv3/i0;->e:I

    .line 74
    .line 75
    and-int/lit16 p5, p5, 0x4000

    .line 76
    .line 77
    if-nez p5, :cond_1

    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p5

    .line 83
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance p2, Le5/g$d;

    .line 90
    .line 91
    iget-object p3, p0, Le5/g;->h:Lz4/i0;

    .line 92
    .line 93
    invoke-static {p1}, Lr7/a;->F(Ljava/util/Collection;)[I

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p2, p3, p1}, Le5/g$d;-><init>(Lz4/i0;[I)V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, Le5/g;->q:Lr5/h;

    .line 101
    .line 102
    return-void
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
.end method


# virtual methods
.method public final a(Le5/j;J)[Lb5/n;
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    const/4 v10, -0x1

    .line 6
    if-nez v9, :cond_0

    .line 7
    .line 8
    move v11, v10

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, v8, Le5/g;->h:Lz4/i0;

    .line 11
    .line 12
    iget-object v1, v9, Lb5/e;->d:Lv3/i0;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lz4/i0;->a(Lv3/i0;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    move v11, v0

    .line 19
    :goto_0
    iget-object v0, v8, Le5/g;->q:Lr5/h;

    .line 20
    .line 21
    invoke-interface {v0}, Lr5/k;->length()I

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    new-array v13, v12, [Lb5/n;

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    move v15, v14

    .line 29
    :goto_1
    if-ge v15, v12, :cond_b

    .line 30
    .line 31
    iget-object v0, v8, Le5/g;->q:Lr5/h;

    .line 32
    .line 33
    invoke-interface {v0, v15}, Lr5/k;->c(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, v8, Le5/g;->e:[Landroid/net/Uri;

    .line 38
    .line 39
    aget-object v1, v1, v0

    .line 40
    .line 41
    iget-object v2, v8, Le5/g;->g:Lf5/j;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Lf5/j;->a(Landroid/net/Uri;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    sget-object v0, Lb5/n;->a:Lb5/n$a;

    .line 50
    .line 51
    aput-object v0, v13, v15

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    iget-object v2, v8, Le5/g;->g:Lf5/j;

    .line 56
    .line 57
    invoke-interface {v2, v14, v1}, Lf5/j;->m(ZLandroid/net/Uri;)Lf5/e;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-wide v1, v6, Lf5/e;->h:J

    .line 65
    .line 66
    iget-object v3, v8, Le5/g;->g:Lf5/j;

    .line 67
    .line 68
    invoke-interface {v3}, Lf5/j;->e()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    sub-long v4, v1, v3

    .line 73
    .line 74
    if-eq v0, v11, :cond_2

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    move v2, v0

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v2, v14

    .line 80
    :goto_2
    move-object/from16 v0, p0

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    move-object v3, v6

    .line 85
    move-wide/from16 v16, v4

    .line 86
    .line 87
    move-object v14, v6

    .line 88
    move-wide/from16 v6, p2

    .line 89
    .line 90
    invoke-virtual/range {v0 .. v7}, Le5/g;->d(Le5/j;ZLf5/e;JJ)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ljava/lang/Long;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v1

    .line 102
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    new-instance v3, Le5/g$c;

    .line 111
    .line 112
    iget-wide v4, v14, Lf5/e;->k:J

    .line 113
    .line 114
    sub-long/2addr v1, v4

    .line 115
    long-to-int v1, v1

    .line 116
    if-ltz v1, :cond_a

    .line 117
    .line 118
    iget-object v2, v14, Lf5/e;->r:Lo7/t;

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-ge v2, v1, :cond_3

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v4, v14, Lf5/e;->r:Lo7/t;

    .line 133
    .line 134
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-ge v1, v4, :cond_7

    .line 139
    .line 140
    if-eq v0, v10, :cond_6

    .line 141
    .line 142
    iget-object v4, v14, Lf5/e;->r:Lo7/t;

    .line 143
    .line 144
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lf5/e$c;

    .line 149
    .line 150
    if-nez v0, :cond_4

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    iget-object v5, v4, Lf5/e$c;->u:Lo7/t;

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-ge v0, v5, :cond_5

    .line 163
    .line 164
    iget-object v4, v4, Lf5/e$c;->u:Lo7/t;

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    invoke-interface {v4, v0, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    :cond_6
    iget-object v0, v14, Lf5/e;->r:Lo7/t;

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-interface {v0, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    :cond_7
    iget-wide v4, v14, Lf5/e;->n:J

    .line 194
    .line 195
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    cmp-long v1, v4, v6

    .line 201
    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    if-ne v0, v10, :cond_8

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    :cond_8
    iget-object v1, v14, Lf5/e;->s:Lo7/t;

    .line 208
    .line 209
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-ge v0, v1, :cond_9

    .line 214
    .line 215
    iget-object v1, v14, Lf5/e;->s:Lo7/t;

    .line 216
    .line 217
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    invoke-interface {v1, v0, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 226
    .line 227
    .line 228
    :cond_9
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    goto :goto_5

    .line 233
    :cond_a
    :goto_4
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 234
    .line 235
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 236
    .line 237
    :goto_5
    move-wide/from16 v1, v16

    .line 238
    .line 239
    invoke-direct {v3, v1, v2, v0}, Le5/g$c;-><init>(JLjava/util/List;)V

    .line 240
    .line 241
    .line 242
    aput-object v3, v13, v15

    .line 243
    .line 244
    :goto_6
    add-int/lit8 v15, v15, 0x1

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_b
    return-object v13
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

.method public final b(Le5/j;)I
    .locals 8

    .line 1
    iget v0, p1, Le5/j;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Le5/g;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iget-object v2, p0, Le5/g;->h:Lz4/i0;

    .line 11
    .line 12
    iget-object v3, p1, Lb5/e;->d:Lv3/i0;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Lz4/i0;->a(Lv3/i0;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    aget-object v0, v0, v2

    .line 19
    .line 20
    iget-object v2, p0, Le5/g;->g:Lf5/j;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v2, v3, v0}, Lf5/j;->m(ZLandroid/net/Uri;)Lf5/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-wide v4, p1, Lb5/m;->j:J

    .line 31
    .line 32
    iget-wide v6, v0, Lf5/e;->k:J

    .line 33
    .line 34
    sub-long/2addr v4, v6

    .line 35
    long-to-int v2, v4

    .line 36
    if-gez v2, :cond_1

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    iget-object v4, v0, Lf5/e;->r:Lo7/t;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-ge v2, v4, :cond_2

    .line 46
    .line 47
    iget-object v4, v0, Lf5/e;->r:Lo7/t;

    .line 48
    .line 49
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lf5/e$c;

    .line 54
    .line 55
    iget-object v2, v2, Lf5/e$c;->u:Lo7/t;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object v2, v0, Lf5/e;->s:Lo7/t;

    .line 59
    .line 60
    :goto_0
    iget v4, p1, Le5/j;->o:I

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/4 v6, 0x2

    .line 67
    if-lt v4, v5, :cond_3

    .line 68
    .line 69
    return v6

    .line 70
    :cond_3
    iget v4, p1, Le5/j;->o:I

    .line 71
    .line 72
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lf5/e$a;

    .line 77
    .line 78
    iget-boolean v4, v2, Lf5/e$a;->u:Z

    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    return v3

    .line 83
    :cond_4
    iget-object v0, v0, Lf5/g;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, v2, Lf5/e$d;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v2}, Lv5/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object p1, p1, Lb5/e;->b:Lt5/n;

    .line 96
    .line 97
    iget-object p1, p1, Lt5/n;->a:Landroid/net/Uri;

    .line 98
    .line 99
    invoke-static {v0, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    move v1, v6

    .line 107
    :goto_1
    return v1
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
.end method

.method public final c(JJLjava/util/List;ZLe5/g$b;)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Le5/j;",
            ">;Z",
            "Le5/g$b;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-wide/from16 v9, p3

    .line 4
    .line 5
    move-object/from16 v11, p7

    .line 6
    .line 7
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v13, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static/range {p5 .. p5}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Le5/j;

    .line 20
    .line 21
    move-object v13, v0

    .line 22
    :goto_0
    if-nez v13, :cond_1

    .line 23
    .line 24
    const/4 v15, -0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-object v0, v8, Le5/g;->h:Lz4/i0;

    .line 27
    .line 28
    iget-object v1, v13, Lb5/e;->d:Lv3/i0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lz4/i0;->a(Lv3/i0;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    move v15, v0

    .line 35
    :goto_1
    sub-long v0, v9, p1

    .line 36
    .line 37
    iget-wide v2, v8, Le5/g;->r:J

    .line 38
    .line 39
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v6, v2, v4

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v6, 0x0

    .line 51
    :goto_2
    if-eqz v6, :cond_3

    .line 52
    .line 53
    sub-long v2, v2, p1

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move-wide v2, v4

    .line 57
    :goto_3
    if-eqz v13, :cond_4

    .line 58
    .line 59
    iget-boolean v6, v8, Le5/g;->p:Z

    .line 60
    .line 61
    if-nez v6, :cond_4

    .line 62
    .line 63
    move/from16 v17, v15

    .line 64
    .line 65
    iget-wide v14, v13, Lb5/e;->h:J

    .line 66
    .line 67
    iget-wide v7, v13, Lb5/e;->g:J

    .line 68
    .line 69
    sub-long/2addr v14, v7

    .line 70
    sub-long/2addr v0, v14

    .line 71
    const-wide/16 v7, 0x0

    .line 72
    .line 73
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    cmp-long v18, v2, v4

    .line 78
    .line 79
    if-eqz v18, :cond_5

    .line 80
    .line 81
    sub-long/2addr v2, v14

    .line 82
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move/from16 v17, v15

    .line 88
    .line 89
    :cond_5
    :goto_4
    move-object/from16 v8, p0

    .line 90
    .line 91
    move-wide/from16 v19, v0

    .line 92
    .line 93
    move-wide/from16 v21, v2

    .line 94
    .line 95
    invoke-virtual {v8, v13, v9, v10}, Le5/g;->a(Le5/j;J)[Lb5/n;

    .line 96
    .line 97
    .line 98
    move-result-object v24

    .line 99
    iget-object v0, v8, Le5/g;->q:Lr5/h;

    .line 100
    .line 101
    move-object/from16 v18, v0

    .line 102
    .line 103
    move-object/from16 v23, p5

    .line 104
    .line 105
    invoke-interface/range {v18 .. v24}, Lr5/h;->j(JJLjava/util/List;[Lb5/n;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v8, Le5/g;->q:Lr5/h;

    .line 109
    .line 110
    invoke-interface {v0}, Lr5/h;->o()I

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    move/from16 v15, v17

    .line 115
    .line 116
    if-eq v15, v14, :cond_6

    .line 117
    .line 118
    const/16 v17, 0x1

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    const/16 v17, 0x0

    .line 122
    .line 123
    :goto_5
    iget-object v0, v8, Le5/g;->e:[Landroid/net/Uri;

    .line 124
    .line 125
    aget-object v7, v0, v14

    .line 126
    .line 127
    iget-object v0, v8, Le5/g;->g:Lf5/j;

    .line 128
    .line 129
    invoke-interface {v0, v7}, Lf5/j;->a(Landroid/net/Uri;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_7

    .line 134
    .line 135
    iput-object v7, v11, Le5/g$b;->c:Landroid/net/Uri;

    .line 136
    .line 137
    iget-boolean v0, v8, Le5/g;->s:Z

    .line 138
    .line 139
    iget-object v1, v8, Le5/g;->o:Landroid/net/Uri;

    .line 140
    .line 141
    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    and-int/2addr v0, v1

    .line 146
    iput-boolean v0, v8, Le5/g;->s:Z

    .line 147
    .line 148
    iput-object v7, v8, Le5/g;->o:Landroid/net/Uri;

    .line 149
    .line 150
    return-void

    .line 151
    :cond_7
    iget-object v0, v8, Le5/g;->g:Lf5/j;

    .line 152
    .line 153
    const/4 v6, 0x1

    .line 154
    invoke-interface {v0, v6, v7}, Lf5/j;->m(ZLandroid/net/Uri;)Lf5/e;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-boolean v0, v3, Lf5/g;->c:Z

    .line 162
    .line 163
    iput-boolean v0, v8, Le5/g;->p:Z

    .line 164
    .line 165
    iget-boolean v0, v3, Lf5/e;->o:Z

    .line 166
    .line 167
    if-eqz v0, :cond_8

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_8
    iget-wide v0, v3, Lf5/e;->h:J

    .line 171
    .line 172
    iget-wide v4, v3, Lf5/e;->u:J

    .line 173
    .line 174
    add-long/2addr v0, v4

    .line 175
    iget-object v2, v8, Le5/g;->g:Lf5/j;

    .line 176
    .line 177
    invoke-interface {v2}, Lf5/j;->e()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    sub-long v4, v0, v4

    .line 182
    .line 183
    :goto_6
    iput-wide v4, v8, Le5/g;->r:J

    .line 184
    .line 185
    iget-wide v0, v3, Lf5/e;->h:J

    .line 186
    .line 187
    iget-object v2, v8, Le5/g;->g:Lf5/j;

    .line 188
    .line 189
    invoke-interface {v2}, Lf5/j;->e()J

    .line 190
    .line 191
    .line 192
    move-result-wide v4

    .line 193
    sub-long v18, v0, v4

    .line 194
    .line 195
    move-object/from16 v0, p0

    .line 196
    .line 197
    move-object v1, v13

    .line 198
    move/from16 v2, v17

    .line 199
    .line 200
    move-object v4, v3

    .line 201
    move-object v12, v4

    .line 202
    move-wide/from16 v4, v18

    .line 203
    .line 204
    move v9, v6

    .line 205
    move-object/from16 v21, v7

    .line 206
    .line 207
    move-wide/from16 v6, p3

    .line 208
    .line 209
    invoke-virtual/range {v0 .. v7}, Le5/g;->d(Le5/j;ZLf5/e;JJ)Landroid/util/Pair;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Ljava/lang/Long;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    iget-wide v3, v12, Lf5/e;->k:J

    .line 230
    .line 231
    cmp-long v3, v1, v3

    .line 232
    .line 233
    if-gez v3, :cond_9

    .line 234
    .line 235
    if-eqz v13, :cond_9

    .line 236
    .line 237
    if-eqz v17, :cond_9

    .line 238
    .line 239
    iget-object v0, v8, Le5/g;->e:[Landroid/net/Uri;

    .line 240
    .line 241
    aget-object v10, v0, v15

    .line 242
    .line 243
    iget-object v0, v8, Le5/g;->g:Lf5/j;

    .line 244
    .line 245
    invoke-interface {v0, v9, v10}, Lf5/j;->m(ZLandroid/net/Uri;)Lf5/e;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget-wide v0, v12, Lf5/e;->h:J

    .line 253
    .line 254
    iget-object v2, v8, Le5/g;->g:Lf5/j;

    .line 255
    .line 256
    invoke-interface {v2}, Lf5/j;->e()J

    .line 257
    .line 258
    .line 259
    move-result-wide v2

    .line 260
    sub-long v18, v0, v2

    .line 261
    .line 262
    const/4 v2, 0x0

    .line 263
    move-object/from16 v0, p0

    .line 264
    .line 265
    move-object v1, v13

    .line 266
    move-object v3, v12

    .line 267
    move-wide/from16 v4, v18

    .line 268
    .line 269
    move-wide/from16 v6, p3

    .line 270
    .line 271
    invoke-virtual/range {v0 .. v7}, Le5/g;->d(Le5/j;ZLf5/e;JJ)Landroid/util/Pair;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Ljava/lang/Long;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    goto :goto_7

    .line 292
    :cond_9
    move-object v3, v12

    .line 293
    move v15, v14

    .line 294
    move-object/from16 v10, v21

    .line 295
    .line 296
    :goto_7
    iget-wide v4, v3, Lf5/e;->k:J

    .line 297
    .line 298
    cmp-long v6, v1, v4

    .line 299
    .line 300
    if-gez v6, :cond_a

    .line 301
    .line 302
    new-instance v0, Lz4/b;

    .line 303
    .line 304
    invoke-direct {v0}, Lz4/b;-><init>()V

    .line 305
    .line 306
    .line 307
    iput-object v0, v8, Le5/g;->n:Lz4/b;

    .line 308
    .line 309
    return-void

    .line 310
    :cond_a
    sub-long v4, v1, v4

    .line 311
    .line 312
    long-to-int v4, v4

    .line 313
    iget-object v5, v3, Lf5/e;->r:Lo7/t;

    .line 314
    .line 315
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    const-wide/16 v6, 0x1

    .line 320
    .line 321
    if-ne v4, v5, :cond_c

    .line 322
    .line 323
    const/4 v5, -0x1

    .line 324
    if-eq v0, v5, :cond_b

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_b
    const/4 v0, 0x0

    .line 328
    :goto_8
    iget-object v4, v3, Lf5/e;->s:Lo7/t;

    .line 329
    .line 330
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-ge v0, v4, :cond_10

    .line 335
    .line 336
    new-instance v4, Le5/g$e;

    .line 337
    .line 338
    iget-object v5, v3, Lf5/e;->s:Lo7/t;

    .line 339
    .line 340
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    check-cast v5, Lf5/e$d;

    .line 345
    .line 346
    invoke-direct {v4, v5, v1, v2, v0}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 347
    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_c
    iget-object v5, v3, Lf5/e;->r:Lo7/t;

    .line 351
    .line 352
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    check-cast v5, Lf5/e$c;

    .line 357
    .line 358
    const/4 v12, -0x1

    .line 359
    if-ne v0, v12, :cond_d

    .line 360
    .line 361
    new-instance v0, Le5/g$e;

    .line 362
    .line 363
    invoke-direct {v0, v5, v1, v2, v12}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 364
    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_d
    iget-object v12, v5, Lf5/e$c;->u:Lo7/t;

    .line 368
    .line 369
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    if-ge v0, v12, :cond_e

    .line 374
    .line 375
    new-instance v4, Le5/g$e;

    .line 376
    .line 377
    iget-object v5, v5, Lf5/e$c;->u:Lo7/t;

    .line 378
    .line 379
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Lf5/e$d;

    .line 384
    .line 385
    invoke-direct {v4, v5, v1, v2, v0}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 386
    .line 387
    .line 388
    :goto_9
    move-object v0, v4

    .line 389
    goto :goto_a

    .line 390
    :cond_e
    add-int/2addr v4, v9

    .line 391
    iget-object v0, v3, Lf5/e;->r:Lo7/t;

    .line 392
    .line 393
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-ge v4, v0, :cond_f

    .line 398
    .line 399
    new-instance v0, Le5/g$e;

    .line 400
    .line 401
    iget-object v5, v3, Lf5/e;->r:Lo7/t;

    .line 402
    .line 403
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    check-cast v4, Lf5/e$d;

    .line 408
    .line 409
    add-long/2addr v1, v6

    .line 410
    const/4 v5, -0x1

    .line 411
    invoke-direct {v0, v4, v1, v2, v5}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 412
    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_f
    iget-object v0, v3, Lf5/e;->s:Lo7/t;

    .line 416
    .line 417
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_10

    .line 422
    .line 423
    new-instance v0, Le5/g$e;

    .line 424
    .line 425
    iget-object v4, v3, Lf5/e;->s:Lo7/t;

    .line 426
    .line 427
    const/4 v5, 0x0

    .line 428
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    check-cast v4, Lf5/e$d;

    .line 433
    .line 434
    add-long/2addr v1, v6

    .line 435
    invoke-direct {v0, v4, v1, v2, v5}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 436
    .line 437
    .line 438
    goto :goto_a

    .line 439
    :cond_10
    const/4 v0, 0x0

    .line 440
    :goto_a
    if-nez v0, :cond_14

    .line 441
    .line 442
    iget-boolean v0, v3, Lf5/e;->o:Z

    .line 443
    .line 444
    if-nez v0, :cond_11

    .line 445
    .line 446
    iput-object v10, v11, Le5/g$b;->c:Landroid/net/Uri;

    .line 447
    .line 448
    iget-boolean v0, v8, Le5/g;->s:Z

    .line 449
    .line 450
    iget-object v1, v8, Le5/g;->o:Landroid/net/Uri;

    .line 451
    .line 452
    invoke-virtual {v10, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    and-int/2addr v0, v1

    .line 457
    iput-boolean v0, v8, Le5/g;->s:Z

    .line 458
    .line 459
    iput-object v10, v8, Le5/g;->o:Landroid/net/Uri;

    .line 460
    .line 461
    return-void

    .line 462
    :cond_11
    if-nez p6, :cond_13

    .line 463
    .line 464
    iget-object v0, v3, Lf5/e;->r:Lo7/t;

    .line 465
    .line 466
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_12

    .line 471
    .line 472
    goto :goto_b

    .line 473
    :cond_12
    new-instance v0, Le5/g$e;

    .line 474
    .line 475
    iget-object v1, v3, Lf5/e;->r:Lo7/t;

    .line 476
    .line 477
    invoke-static {v1}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    check-cast v1, Lf5/e$d;

    .line 482
    .line 483
    iget-wide v4, v3, Lf5/e;->k:J

    .line 484
    .line 485
    iget-object v2, v3, Lf5/e;->r:Lo7/t;

    .line 486
    .line 487
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    move-object v12, v10

    .line 492
    int-to-long v9, v2

    .line 493
    add-long/2addr v4, v9

    .line 494
    sub-long/2addr v4, v6

    .line 495
    const/4 v2, -0x1

    .line 496
    invoke-direct {v0, v1, v4, v5, v2}, Le5/g$e;-><init>(Lf5/e$d;JI)V

    .line 497
    .line 498
    .line 499
    goto :goto_c

    .line 500
    :cond_13
    :goto_b
    move v0, v9

    .line 501
    iput-boolean v0, v11, Le5/g$b;->b:Z

    .line 502
    .line 503
    return-void

    .line 504
    :cond_14
    move-object v12, v10

    .line 505
    :goto_c
    const/4 v5, 0x0

    .line 506
    iput-boolean v5, v8, Le5/g;->s:Z

    .line 507
    .line 508
    const/4 v1, 0x0

    .line 509
    iput-object v1, v8, Le5/g;->o:Landroid/net/Uri;

    .line 510
    .line 511
    iget-object v1, v0, Le5/g$e;->a:Lf5/e$d;

    .line 512
    .line 513
    iget-object v1, v1, Lf5/e$d;->b:Lf5/e$c;

    .line 514
    .line 515
    if-eqz v1, :cond_16

    .line 516
    .line 517
    iget-object v1, v1, Lf5/e$d;->o:Ljava/lang/String;

    .line 518
    .line 519
    if-nez v1, :cond_15

    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_15
    iget-object v2, v3, Lf5/g;->a:Ljava/lang/String;

    .line 523
    .line 524
    invoke-static {v2, v1}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    goto :goto_e

    .line 529
    :cond_16
    :goto_d
    const/4 v1, 0x0

    .line 530
    :goto_e
    invoke-virtual {v8, v1, v15}, Le5/g;->e(Landroid/net/Uri;I)Le5/g$a;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    iput-object v2, v11, Le5/g$b;->a:Lb5/e;

    .line 535
    .line 536
    if-eqz v2, :cond_17

    .line 537
    .line 538
    return-void

    .line 539
    :cond_17
    iget-object v2, v0, Le5/g$e;->a:Lf5/e$d;

    .line 540
    .line 541
    if-eqz v2, :cond_19

    .line 542
    .line 543
    iget-object v2, v2, Lf5/e$d;->o:Ljava/lang/String;

    .line 544
    .line 545
    if-nez v2, :cond_18

    .line 546
    .line 547
    goto :goto_f

    .line 548
    :cond_18
    iget-object v4, v3, Lf5/g;->a:Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v4, v2}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    goto :goto_10

    .line 555
    :cond_19
    :goto_f
    const/4 v2, 0x0

    .line 556
    :goto_10
    invoke-virtual {v8, v2, v15}, Le5/g;->e(Landroid/net/Uri;I)Le5/g$a;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    iput-object v4, v11, Le5/g$b;->a:Lb5/e;

    .line 561
    .line 562
    if-eqz v4, :cond_1a

    .line 563
    .line 564
    return-void

    .line 565
    :cond_1a
    if-nez v13, :cond_1b

    .line 566
    .line 567
    sget-object v4, Le5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 568
    .line 569
    move-object v10, v12

    .line 570
    goto :goto_11

    .line 571
    :cond_1b
    iget-object v4, v13, Le5/j;->m:Landroid/net/Uri;

    .line 572
    .line 573
    move-object v10, v12

    .line 574
    invoke-virtual {v10, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-eqz v4, :cond_1c

    .line 579
    .line 580
    iget-boolean v4, v13, Le5/j;->H:Z

    .line 581
    .line 582
    if-eqz v4, :cond_1c

    .line 583
    .line 584
    :goto_11
    move/from16 v50, v5

    .line 585
    .line 586
    move v4, v15

    .line 587
    goto :goto_16

    .line 588
    :cond_1c
    iget-object v4, v0, Le5/g$e;->a:Lf5/e$d;

    .line 589
    .line 590
    iget-wide v6, v4, Lf5/e$d;->e:J

    .line 591
    .line 592
    add-long v6, v6, v18

    .line 593
    .line 594
    instance-of v9, v4, Lf5/e$a;

    .line 595
    .line 596
    if-eqz v9, :cond_1f

    .line 597
    .line 598
    check-cast v4, Lf5/e$a;

    .line 599
    .line 600
    iget-boolean v4, v4, Lf5/e$a;->t:Z

    .line 601
    .line 602
    if-nez v4, :cond_1e

    .line 603
    .line 604
    iget v4, v0, Le5/g$e;->c:I

    .line 605
    .line 606
    if-nez v4, :cond_1d

    .line 607
    .line 608
    iget-boolean v4, v3, Lf5/g;->c:Z

    .line 609
    .line 610
    if-eqz v4, :cond_1d

    .line 611
    .line 612
    goto :goto_12

    .line 613
    :cond_1d
    move v4, v5

    .line 614
    goto :goto_13

    .line 615
    :cond_1e
    :goto_12
    const/4 v4, 0x1

    .line 616
    goto :goto_13

    .line 617
    :cond_1f
    iget-boolean v4, v3, Lf5/g;->c:Z

    .line 618
    .line 619
    :goto_13
    if-eqz v4, :cond_21

    .line 620
    .line 621
    move v4, v15

    .line 622
    iget-wide v14, v13, Lb5/e;->h:J

    .line 623
    .line 624
    cmp-long v6, v6, v14

    .line 625
    .line 626
    if-gez v6, :cond_20

    .line 627
    .line 628
    goto :goto_14

    .line 629
    :cond_20
    move v7, v5

    .line 630
    goto :goto_15

    .line 631
    :cond_21
    move v4, v15

    .line 632
    :goto_14
    const/4 v7, 0x1

    .line 633
    :goto_15
    move/from16 v50, v7

    .line 634
    .line 635
    :goto_16
    if-eqz v50, :cond_22

    .line 636
    .line 637
    iget-boolean v6, v0, Le5/g$e;->d:Z

    .line 638
    .line 639
    if-eqz v6, :cond_22

    .line 640
    .line 641
    return-void

    .line 642
    :cond_22
    iget-object v6, v8, Le5/g;->a:Le5/i;

    .line 643
    .line 644
    iget-object v7, v8, Le5/g;->b:Lt5/k;

    .line 645
    .line 646
    iget-object v12, v8, Le5/g;->f:[Lv3/i0;

    .line 647
    .line 648
    aget-object v25, v12, v4

    .line 649
    .line 650
    iget-object v4, v8, Le5/g;->i:Ljava/util/List;

    .line 651
    .line 652
    iget-object v12, v8, Le5/g;->q:Lr5/h;

    .line 653
    .line 654
    invoke-interface {v12}, Lr5/h;->q()I

    .line 655
    .line 656
    .line 657
    move-result v32

    .line 658
    iget-object v12, v8, Le5/g;->q:Lr5/h;

    .line 659
    .line 660
    invoke-interface {v12}, Lr5/h;->s()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v33

    .line 664
    iget-boolean v12, v8, Le5/g;->l:Z

    .line 665
    .line 666
    iget-object v14, v8, Le5/g;->d:Ld2/h0;

    .line 667
    .line 668
    iget-object v15, v8, Le5/g;->j:Le5/f;

    .line 669
    .line 670
    if-nez v2, :cond_23

    .line 671
    .line 672
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    const/4 v2, 0x0

    .line 676
    goto :goto_17

    .line 677
    :cond_23
    iget-object v15, v15, Le5/f;->a:Le5/e;

    .line 678
    .line 679
    invoke-virtual {v15, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    check-cast v2, [B

    .line 684
    .line 685
    :goto_17
    iget-object v15, v8, Le5/g;->j:Le5/f;

    .line 686
    .line 687
    if-nez v1, :cond_24

    .line 688
    .line 689
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    const/4 v1, 0x0

    .line 693
    goto :goto_18

    .line 694
    :cond_24
    iget-object v15, v15, Le5/f;->a:Le5/e;

    .line 695
    .line 696
    invoke-virtual {v15, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    check-cast v1, [B

    .line 701
    .line 702
    :goto_18
    iget-object v15, v8, Le5/g;->k:Lw3/a0;

    .line 703
    .line 704
    sget-object v16, Le5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 705
    .line 706
    iget-object v5, v0, Le5/g$e;->a:Lf5/e$d;

    .line 707
    .line 708
    const/16 v38, 0x1

    .line 709
    .line 710
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 711
    .line 712
    .line 713
    move-result-object v40

    .line 714
    iget-object v9, v3, Lf5/g;->a:Ljava/lang/String;

    .line 715
    .line 716
    iget-object v8, v5, Lf5/e$d;->a:Ljava/lang/String;

    .line 717
    .line 718
    invoke-static {v9, v8}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 719
    .line 720
    .line 721
    move-result-object v35

    .line 722
    iget-wide v8, v5, Lf5/e$d;->q:J

    .line 723
    .line 724
    move/from16 v16, v12

    .line 725
    .line 726
    iget-wide v11, v5, Lf5/e$d;->r:J

    .line 727
    .line 728
    move-object/from16 v17, v15

    .line 729
    .line 730
    iget-boolean v15, v0, Le5/g$e;->d:Z

    .line 731
    .line 732
    if-eqz v15, :cond_25

    .line 733
    .line 734
    const/16 v15, 0x8

    .line 735
    .line 736
    move/from16 v46, v15

    .line 737
    .line 738
    goto :goto_19

    .line 739
    :cond_25
    const/16 v46, 0x0

    .line 740
    .line 741
    :goto_19
    if-eqz v35, :cond_33

    .line 742
    .line 743
    new-instance v24, Lt5/n;

    .line 744
    .line 745
    const-wide/16 v36, 0x0

    .line 746
    .line 747
    const/16 v39, 0x0

    .line 748
    .line 749
    const/16 v45, 0x0

    .line 750
    .line 751
    const/16 v47, 0x0

    .line 752
    .line 753
    move-object/from16 v34, v24

    .line 754
    .line 755
    move-wide/from16 v41, v8

    .line 756
    .line 757
    move-wide/from16 v43, v11

    .line 758
    .line 759
    invoke-direct/range {v34 .. v47}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    if-eqz v2, :cond_26

    .line 763
    .line 764
    const/16 v26, 0x1

    .line 765
    .line 766
    goto :goto_1a

    .line 767
    :cond_26
    const/16 v26, 0x0

    .line 768
    .line 769
    :goto_1a
    if-eqz v26, :cond_27

    .line 770
    .line 771
    iget-object v8, v5, Lf5/e$d;->p:Ljava/lang/String;

    .line 772
    .line 773
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-static {v8}, Le5/j;->f(Ljava/lang/String;)[B

    .line 777
    .line 778
    .line 779
    move-result-object v8

    .line 780
    goto :goto_1b

    .line 781
    :cond_27
    const/4 v8, 0x0

    .line 782
    :goto_1b
    if-eqz v2, :cond_28

    .line 783
    .line 784
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    new-instance v9, Le5/a;

    .line 788
    .line 789
    invoke-direct {v9, v7, v2, v8}, Le5/a;-><init>(Lt5/k;[B[B)V

    .line 790
    .line 791
    .line 792
    move-object/from16 v23, v9

    .line 793
    .line 794
    goto :goto_1c

    .line 795
    :cond_28
    move-object/from16 v23, v7

    .line 796
    .line 797
    :goto_1c
    iget-object v2, v5, Lf5/e$d;->b:Lf5/e$c;

    .line 798
    .line 799
    if-eqz v2, :cond_2c

    .line 800
    .line 801
    if-eqz v1, :cond_29

    .line 802
    .line 803
    const/4 v8, 0x1

    .line 804
    goto :goto_1d

    .line 805
    :cond_29
    const/4 v8, 0x0

    .line 806
    :goto_1d
    if-eqz v8, :cond_2a

    .line 807
    .line 808
    iget-object v9, v2, Lf5/e$d;->p:Ljava/lang/String;

    .line 809
    .line 810
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    invoke-static {v9}, Le5/j;->f(Ljava/lang/String;)[B

    .line 814
    .line 815
    .line 816
    move-result-object v9

    .line 817
    goto :goto_1e

    .line 818
    :cond_2a
    const/4 v9, 0x0

    .line 819
    :goto_1e
    iget-object v11, v3, Lf5/g;->a:Ljava/lang/String;

    .line 820
    .line 821
    iget-object v12, v2, Lf5/e$d;->a:Ljava/lang/String;

    .line 822
    .line 823
    invoke-static {v11, v12}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 824
    .line 825
    .line 826
    move-result-object v35

    .line 827
    new-instance v11, Lt5/n;

    .line 828
    .line 829
    move-object v12, v14

    .line 830
    iget-wide v14, v2, Lf5/e$d;->q:J

    .line 831
    .line 832
    move-object/from16 p2, v12

    .line 833
    .line 834
    move-object/from16 v21, v13

    .line 835
    .line 836
    iget-wide v12, v2, Lf5/e$d;->r:J

    .line 837
    .line 838
    move-object/from16 v34, v11

    .line 839
    .line 840
    move-wide/from16 v36, v14

    .line 841
    .line 842
    move-wide/from16 v38, v12

    .line 843
    .line 844
    invoke-direct/range {v34 .. v39}, Lt5/n;-><init>(Landroid/net/Uri;JJ)V

    .line 845
    .line 846
    .line 847
    if-eqz v1, :cond_2b

    .line 848
    .line 849
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    new-instance v2, Le5/a;

    .line 853
    .line 854
    invoke-direct {v2, v7, v1, v9}, Le5/a;-><init>(Lt5/k;[B[B)V

    .line 855
    .line 856
    .line 857
    move-object v7, v2

    .line 858
    :cond_2b
    move-object/from16 v27, v7

    .line 859
    .line 860
    move/from16 v29, v8

    .line 861
    .line 862
    goto :goto_1f

    .line 863
    :cond_2c
    move-object/from16 v21, v13

    .line 864
    .line 865
    move-object/from16 p2, v14

    .line 866
    .line 867
    const/4 v11, 0x0

    .line 868
    const/16 v27, 0x0

    .line 869
    .line 870
    const/16 v29, 0x0

    .line 871
    .line 872
    :goto_1f
    iget-wide v1, v5, Lf5/e$d;->e:J

    .line 873
    .line 874
    add-long v34, v18, v1

    .line 875
    .line 876
    iget-wide v1, v5, Lf5/e$d;->c:J

    .line 877
    .line 878
    add-long v36, v34, v1

    .line 879
    .line 880
    iget v1, v3, Lf5/e;->j:I

    .line 881
    .line 882
    iget v2, v5, Lf5/e$d;->d:I

    .line 883
    .line 884
    add-int/2addr v1, v2

    .line 885
    if-eqz v21, :cond_31

    .line 886
    .line 887
    move-object/from16 v12, v21

    .line 888
    .line 889
    iget-object v2, v12, Le5/j;->q:Lt5/n;

    .line 890
    .line 891
    if-eq v11, v2, :cond_2e

    .line 892
    .line 893
    if-eqz v11, :cond_2d

    .line 894
    .line 895
    if-eqz v2, :cond_2d

    .line 896
    .line 897
    iget-object v3, v11, Lt5/n;->a:Landroid/net/Uri;

    .line 898
    .line 899
    iget-object v2, v2, Lt5/n;->a:Landroid/net/Uri;

    .line 900
    .line 901
    invoke-virtual {v3, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    if-eqz v2, :cond_2d

    .line 906
    .line 907
    iget-wide v2, v11, Lt5/n;->f:J

    .line 908
    .line 909
    iget-object v7, v12, Le5/j;->q:Lt5/n;

    .line 910
    .line 911
    iget-wide v7, v7, Lt5/n;->f:J

    .line 912
    .line 913
    cmp-long v2, v2, v7

    .line 914
    .line 915
    if-nez v2, :cond_2d

    .line 916
    .line 917
    goto :goto_20

    .line 918
    :cond_2d
    const/4 v7, 0x0

    .line 919
    goto :goto_21

    .line 920
    :cond_2e
    :goto_20
    const/4 v7, 0x1

    .line 921
    :goto_21
    iget-object v2, v12, Le5/j;->m:Landroid/net/Uri;

    .line 922
    .line 923
    invoke-virtual {v10, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    if-eqz v2, :cond_2f

    .line 928
    .line 929
    iget-boolean v2, v12, Le5/j;->H:Z

    .line 930
    .line 931
    if-eqz v2, :cond_2f

    .line 932
    .line 933
    const/16 v20, 0x1

    .line 934
    .line 935
    goto :goto_22

    .line 936
    :cond_2f
    const/16 v20, 0x0

    .line 937
    .line 938
    :goto_22
    iget-object v2, v12, Le5/j;->y:Lu4/g;

    .line 939
    .line 940
    iget-object v3, v12, Le5/j;->z:Lv5/u;

    .line 941
    .line 942
    if-eqz v7, :cond_30

    .line 943
    .line 944
    if-eqz v20, :cond_30

    .line 945
    .line 946
    iget-boolean v7, v12, Le5/j;->J:Z

    .line 947
    .line 948
    if-nez v7, :cond_30

    .line 949
    .line 950
    iget v7, v12, Le5/j;->l:I

    .line 951
    .line 952
    if-ne v7, v1, :cond_30

    .line 953
    .line 954
    iget-object v7, v12, Le5/j;->C:Le5/k;

    .line 955
    .line 956
    move-object v12, v7

    .line 957
    goto :goto_23

    .line 958
    :cond_30
    const/4 v12, 0x0

    .line 959
    :goto_23
    move-object/from16 v48, v2

    .line 960
    .line 961
    move-object/from16 v49, v3

    .line 962
    .line 963
    move-object/from16 v47, v12

    .line 964
    .line 965
    goto :goto_24

    .line 966
    :cond_31
    new-instance v2, Lu4/g;

    .line 967
    .line 968
    const/4 v3, 0x0

    .line 969
    invoke-direct {v2, v3}, Lu4/g;-><init>(Lu4/g$a;)V

    .line 970
    .line 971
    .line 972
    new-instance v7, Lv5/u;

    .line 973
    .line 974
    const/16 v8, 0xa

    .line 975
    .line 976
    invoke-direct {v7, v8}, Lv5/u;-><init>(I)V

    .line 977
    .line 978
    .line 979
    move-object/from16 v48, v2

    .line 980
    .line 981
    move-object/from16 v47, v3

    .line 982
    .line 983
    move-object/from16 v49, v7

    .line 984
    .line 985
    :goto_24
    new-instance v2, Le5/j;

    .line 986
    .line 987
    iget-wide v7, v0, Le5/g$e;->b:J

    .line 988
    .line 989
    iget v3, v0, Le5/g$e;->c:I

    .line 990
    .line 991
    iget-boolean v0, v0, Le5/g$e;->d:Z

    .line 992
    .line 993
    const/4 v9, 0x1

    .line 994
    xor-int/lit8 v41, v0, 0x1

    .line 995
    .line 996
    iget-boolean v0, v5, Lf5/e$d;->s:Z

    .line 997
    .line 998
    move-object/from16 v9, p2

    .line 999
    .line 1000
    iget-object v12, v9, Ld2/h0;->b:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v12, Landroid/util/SparseArray;

    .line 1003
    .line 1004
    invoke-virtual {v12, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v12

    .line 1008
    check-cast v12, Lv5/c0;

    .line 1009
    .line 1010
    if-nez v12, :cond_32

    .line 1011
    .line 1012
    new-instance v12, Lv5/c0;

    .line 1013
    .line 1014
    const-wide v13, 0x7ffffffffffffffeL

    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    invoke-direct {v12, v13, v14}, Lv5/c0;-><init>(J)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v9, v9, Ld2/h0;->b:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v9, Landroid/util/SparseArray;

    .line 1025
    .line 1026
    invoke-virtual {v9, v1, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    :cond_32
    move-object/from16 v45, v12

    .line 1030
    .line 1031
    iget-object v5, v5, Lf5/e$d;->f:La4/d;

    .line 1032
    .line 1033
    move-object/from16 v46, v5

    .line 1034
    .line 1035
    move-object/from16 v21, v2

    .line 1036
    .line 1037
    move-object/from16 v22, v6

    .line 1038
    .line 1039
    move-object/from16 v28, v11

    .line 1040
    .line 1041
    move-object/from16 v30, v10

    .line 1042
    .line 1043
    move-object/from16 v31, v4

    .line 1044
    .line 1045
    move-wide/from16 v38, v7

    .line 1046
    .line 1047
    move/from16 v40, v3

    .line 1048
    .line 1049
    move/from16 v42, v1

    .line 1050
    .line 1051
    move/from16 v43, v0

    .line 1052
    .line 1053
    move/from16 v44, v16

    .line 1054
    .line 1055
    move-object/from16 v51, v17

    .line 1056
    .line 1057
    invoke-direct/range {v21 .. v51}, Le5/j;-><init>(Le5/i;Lt5/k;Lt5/n;Lv3/i0;ZLt5/k;Lt5/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLv5/c0;La4/d;Le5/k;Lu4/g;Lv5/u;ZLw3/a0;)V

    .line 1058
    .line 1059
    .line 1060
    move-object/from16 v0, p7

    .line 1061
    .line 1062
    iput-object v2, v0, Le5/g$b;->a:Lb5/e;

    .line 1063
    .line 1064
    return-void

    .line 1065
    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1066
    .line 1067
    const-string v1, "The uri must be set."

    .line 1068
    .line 1069
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    throw v0
.end method

.method public final d(Le5/j;ZLf5/e;JJ)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le5/j;",
            "Z",
            "Lf5/e;",
            "JJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    iget-boolean p2, p1, Le5/j;->H:Z

    .line 9
    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    new-instance p2, Landroid/util/Pair;

    .line 13
    .line 14
    iget p3, p1, Le5/j;->o:I

    .line 15
    .line 16
    if-ne p3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lb5/m;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide p3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-wide p3, p1, Lb5/m;->j:J

    .line 24
    .line 25
    :goto_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iget p1, p1, Le5/j;->o:I

    .line 30
    .line 31
    if-ne p1, v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    add-int/lit8 v1, p1, 0x1

    .line 35
    .line 36
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    new-instance p2, Landroid/util/Pair;

    .line 45
    .line 46
    iget-wide p3, p1, Lb5/m;->j:J

    .line 47
    .line 48
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iget p1, p1, Le5/j;->o:I

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_2
    return-object p2

    .line 62
    :cond_4
    :goto_3
    iget-wide v2, p3, Lf5/e;->u:J

    .line 63
    .line 64
    add-long/2addr v2, p4

    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-boolean p2, p0, Le5/g;->p:Z

    .line 68
    .line 69
    if-eqz p2, :cond_5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    iget-wide p6, p1, Lb5/e;->g:J

    .line 73
    .line 74
    :cond_6
    :goto_4
    iget-boolean p2, p3, Lf5/e;->o:Z

    .line 75
    .line 76
    if-nez p2, :cond_7

    .line 77
    .line 78
    cmp-long p2, p6, v2

    .line 79
    .line 80
    if-ltz p2, :cond_7

    .line 81
    .line 82
    new-instance p1, Landroid/util/Pair;

    .line 83
    .line 84
    iget-wide p4, p3, Lf5/e;->k:J

    .line 85
    .line 86
    iget-object p2, p3, Lf5/e;->r:Lo7/t;

    .line 87
    .line 88
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    int-to-long p2, p2

    .line 93
    add-long/2addr p4, p2

    .line 94
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_7
    sub-long/2addr p6, p4

    .line 107
    iget-object p2, p3, Lf5/e;->r:Lo7/t;

    .line 108
    .line 109
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    iget-object p5, p0, Le5/g;->g:Lf5/j;

    .line 114
    .line 115
    invoke-interface {p5}, Lf5/j;->g()Z

    .line 116
    .line 117
    .line 118
    move-result p5

    .line 119
    const/4 v2, 0x0

    .line 120
    if-eqz p5, :cond_9

    .line 121
    .line 122
    if-nez p1, :cond_8

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_8
    move v0, v2

    .line 126
    :cond_9
    :goto_5
    invoke-static {p2, p4, v0}, Lv5/e0;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long p4, p1

    .line 131
    iget-wide v3, p3, Lf5/e;->k:J

    .line 132
    .line 133
    add-long/2addr p4, v3

    .line 134
    if-ltz p1, :cond_d

    .line 135
    .line 136
    iget-object p2, p3, Lf5/e;->r:Lo7/t;

    .line 137
    .line 138
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lf5/e$c;

    .line 143
    .line 144
    iget-wide v3, p1, Lf5/e$d;->e:J

    .line 145
    .line 146
    iget-wide v5, p1, Lf5/e$d;->c:J

    .line 147
    .line 148
    add-long/2addr v3, v5

    .line 149
    cmp-long p2, p6, v3

    .line 150
    .line 151
    if-gez p2, :cond_a

    .line 152
    .line 153
    iget-object p1, p1, Lf5/e$c;->u:Lo7/t;

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_a
    iget-object p1, p3, Lf5/e;->s:Lo7/t;

    .line 157
    .line 158
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-ge v2, p2, :cond_d

    .line 163
    .line 164
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, Lf5/e$a;

    .line 169
    .line 170
    iget-wide v3, p2, Lf5/e$d;->e:J

    .line 171
    .line 172
    iget-wide v5, p2, Lf5/e$d;->c:J

    .line 173
    .line 174
    add-long/2addr v3, v5

    .line 175
    cmp-long v0, p6, v3

    .line 176
    .line 177
    if-gez v0, :cond_c

    .line 178
    .line 179
    iget-boolean p2, p2, Lf5/e$a;->t:Z

    .line 180
    .line 181
    if-eqz p2, :cond_d

    .line 182
    .line 183
    iget-object p2, p3, Lf5/e;->s:Lo7/t;

    .line 184
    .line 185
    if-ne p1, p2, :cond_b

    .line 186
    .line 187
    const-wide/16 p1, 0x1

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_b
    const-wide/16 p1, 0x0

    .line 191
    .line 192
    :goto_7
    add-long/2addr p4, p1

    .line 193
    move v1, v2

    .line 194
    goto :goto_8

    .line 195
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_d
    :goto_8
    new-instance p1, Landroid/util/Pair;

    .line 199
    .line 200
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-object p1
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

.method public final e(Landroid/net/Uri;I)Le5/g$a;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v3, v0, Le5/g;->j:Le5/f;

    .line 10
    .line 11
    iget-object v3, v3, Le5/f;->a:Le5/e;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, [B

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget-object v4, v0, Le5/g;->j:Le5/f;

    .line 22
    .line 23
    iget-object v4, v4, Le5/f;->a:Le5/e;

    .line 24
    .line 25
    invoke-virtual {v4, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, [B

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 v14, 0x0

    .line 33
    const/4 v12, 0x0

    .line 34
    const-wide/16 v8, 0x0

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const-wide/16 v10, -0x1

    .line 45
    .line 46
    const/4 v13, 0x1

    .line 47
    new-instance v17, Lt5/n;

    .line 48
    .line 49
    move-object/from16 v1, v17

    .line 50
    .line 51
    move-object/from16 v2, p1

    .line 52
    .line 53
    invoke-direct/range {v1 .. v14}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Le5/g$a;

    .line 57
    .line 58
    iget-object v2, v0, Le5/g;->c:Lt5/k;

    .line 59
    .line 60
    iget-object v3, v0, Le5/g;->f:[Lv3/i0;

    .line 61
    .line 62
    aget-object v18, v3, p2

    .line 63
    .line 64
    iget-object v3, v0, Le5/g;->q:Lr5/h;

    .line 65
    .line 66
    invoke-interface {v3}, Lr5/h;->q()I

    .line 67
    .line 68
    .line 69
    move-result v19

    .line 70
    iget-object v3, v0, Le5/g;->q:Lr5/h;

    .line 71
    .line 72
    invoke-interface {v3}, Lr5/h;->s()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v20

    .line 76
    iget-object v3, v0, Le5/g;->m:[B

    .line 77
    .line 78
    move-object v15, v1

    .line 79
    move-object/from16 v16, v2

    .line 80
    .line 81
    move-object/from16 v21, v3

    .line 82
    .line 83
    invoke-direct/range {v15 .. v21}, Le5/g$a;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;[B)V

    .line 84
    .line 85
    .line 86
    return-object v1
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
