.class public final Lm4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/d0;


# instance fields
.field public final a:Lm4/j;

.field public final b:Lv5/t;

.field public c:I

.field public d:I

.field public e:Lv5/c0;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Lm4/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm4/t;->a:Lm4/j;

    .line 5
    .line 6
    new-instance p1, Lv5/t;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v1, v0}, Lv5/t;-><init>([BI)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lm4/t;->b:Lv5/t;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lm4/t;->c:I

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
.end method


# virtual methods
.method public final a(ILv5/u;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lm4/t;->e:Lv5/c0;

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 v0, p1, 0x1

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, -0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const-string v5, "PesReader"

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget v0, p0, Lm4/t;->c:I

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    .line 23
    if-eq v0, v6, :cond_2

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    iget v0, p0, Lm4/t;->j:I

    .line 28
    .line 29
    if-eq v0, v3, :cond_0

    .line 30
    .line 31
    const-string v0, "Unexpected start indicator: expected "

    .line 32
    .line 33
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v7, p0, Lm4/t;->j:I

    .line 38
    .line 39
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, " more bytes"

    .line 43
    .line 44
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v0, p0, Lm4/t;->a:Lm4/j;

    .line 55
    .line 56
    invoke-interface {v0}, Lm4/j;->c()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    const-string v0, "Unexpected start indicator reading extended header"

    .line 67
    .line 68
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_0
    iput v1, p0, Lm4/t;->c:I

    .line 72
    .line 73
    iput v4, p0, Lm4/t;->d:I

    .line 74
    .line 75
    :cond_4
    :goto_1
    iget v0, p2, Lv5/u;->c:I

    .line 76
    .line 77
    iget v7, p2, Lv5/u;->b:I

    .line 78
    .line 79
    sub-int/2addr v0, v7

    .line 80
    if-lez v0, :cond_13

    .line 81
    .line 82
    iget v8, p0, Lm4/t;->c:I

    .line 83
    .line 84
    if-eqz v8, :cond_12

    .line 85
    .line 86
    if-eq v8, v1, :cond_c

    .line 87
    .line 88
    if-eq v8, v6, :cond_8

    .line 89
    .line 90
    if-ne v8, v2, :cond_7

    .line 91
    .line 92
    iget v8, p0, Lm4/t;->j:I

    .line 93
    .line 94
    if-ne v8, v3, :cond_5

    .line 95
    .line 96
    move v8, v4

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    sub-int v8, v0, v8

    .line 99
    .line 100
    :goto_2
    if-lez v8, :cond_6

    .line 101
    .line 102
    sub-int/2addr v0, v8

    .line 103
    add-int/2addr v7, v0

    .line 104
    invoke-virtual {p2, v7}, Lv5/u;->F(I)V

    .line 105
    .line 106
    .line 107
    :cond_6
    iget-object v7, p0, Lm4/t;->a:Lm4/j;

    .line 108
    .line 109
    invoke-interface {v7, p2}, Lm4/j;->a(Lv5/u;)V

    .line 110
    .line 111
    .line 112
    iget v7, p0, Lm4/t;->j:I

    .line 113
    .line 114
    if-eq v7, v3, :cond_4

    .line 115
    .line 116
    sub-int/2addr v7, v0

    .line 117
    iput v7, p0, Lm4/t;->j:I

    .line 118
    .line 119
    if-nez v7, :cond_4

    .line 120
    .line 121
    iget-object v0, p0, Lm4/t;->a:Lm4/j;

    .line 122
    .line 123
    invoke-interface {v0}, Lm4/j;->c()V

    .line 124
    .line 125
    .line 126
    iput v1, p0, Lm4/t;->c:I

    .line 127
    .line 128
    iput v4, p0, Lm4/t;->d:I

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_8
    const/16 v0, 0xa

    .line 138
    .line 139
    iget v3, p0, Lm4/t;->i:I

    .line 140
    .line 141
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iget-object v3, p0, Lm4/t;->b:Lv5/t;

    .line 146
    .line 147
    iget-object v3, v3, Lv5/t;->a:[B

    .line 148
    .line 149
    invoke-virtual {p0, v0, p2, v3}, Lm4/t;->d(ILv5/u;[B)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_11

    .line 154
    .line 155
    const/4 v0, 0x0

    .line 156
    iget v3, p0, Lm4/t;->i:I

    .line 157
    .line 158
    invoke-virtual {p0, v3, p2, v0}, Lm4/t;->d(ILv5/u;[B)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_11

    .line 163
    .line 164
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 165
    .line 166
    invoke-virtual {v0, v4}, Lv5/t;->k(I)V

    .line 167
    .line 168
    .line 169
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    iput-wide v3, p0, Lm4/t;->l:J

    .line 175
    .line 176
    iget-boolean v0, p0, Lm4/t;->f:Z

    .line 177
    .line 178
    const/4 v3, 0x4

    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 182
    .line 183
    invoke-virtual {v0, v3}, Lv5/t;->m(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Lv5/t;->g(I)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    int-to-long v6, v0

    .line 193
    const/16 v0, 0x1e

    .line 194
    .line 195
    shl-long/2addr v6, v0

    .line 196
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 197
    .line 198
    invoke-virtual {v4, v1}, Lv5/t;->m(I)V

    .line 199
    .line 200
    .line 201
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 202
    .line 203
    const/16 v8, 0xf

    .line 204
    .line 205
    invoke-virtual {v4, v8}, Lv5/t;->g(I)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    shl-int/2addr v4, v8

    .line 210
    int-to-long v9, v4

    .line 211
    or-long/2addr v6, v9

    .line 212
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 213
    .line 214
    invoke-virtual {v4, v1}, Lv5/t;->m(I)V

    .line 215
    .line 216
    .line 217
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 218
    .line 219
    invoke-virtual {v4, v8}, Lv5/t;->g(I)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    int-to-long v9, v4

    .line 224
    or-long/2addr v6, v9

    .line 225
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 226
    .line 227
    invoke-virtual {v4, v1}, Lv5/t;->m(I)V

    .line 228
    .line 229
    .line 230
    iget-boolean v4, p0, Lm4/t;->h:Z

    .line 231
    .line 232
    if-nez v4, :cond_9

    .line 233
    .line 234
    iget-boolean v4, p0, Lm4/t;->g:Z

    .line 235
    .line 236
    if-eqz v4, :cond_9

    .line 237
    .line 238
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 239
    .line 240
    invoke-virtual {v4, v3}, Lv5/t;->m(I)V

    .line 241
    .line 242
    .line 243
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 244
    .line 245
    invoke-virtual {v4, v2}, Lv5/t;->g(I)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    int-to-long v9, v4

    .line 250
    shl-long/2addr v9, v0

    .line 251
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Lv5/t;->m(I)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 257
    .line 258
    invoke-virtual {v0, v8}, Lv5/t;->g(I)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    shl-int/2addr v0, v8

    .line 263
    int-to-long v11, v0

    .line 264
    or-long/2addr v9, v11

    .line 265
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Lv5/t;->m(I)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 271
    .line 272
    invoke-virtual {v0, v8}, Lv5/t;->g(I)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    int-to-long v11, v0

    .line 277
    or-long v8, v9, v11

    .line 278
    .line 279
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 280
    .line 281
    invoke-virtual {v0, v1}, Lv5/t;->m(I)V

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Lm4/t;->e:Lv5/c0;

    .line 285
    .line 286
    invoke-virtual {v0, v8, v9}, Lv5/c0;->b(J)J

    .line 287
    .line 288
    .line 289
    iput-boolean v1, p0, Lm4/t;->h:Z

    .line 290
    .line 291
    :cond_9
    iget-object v0, p0, Lm4/t;->e:Lv5/c0;

    .line 292
    .line 293
    invoke-virtual {v0, v6, v7}, Lv5/c0;->b(J)J

    .line 294
    .line 295
    .line 296
    move-result-wide v6

    .line 297
    iput-wide v6, p0, Lm4/t;->l:J

    .line 298
    .line 299
    :cond_a
    iget-boolean v0, p0, Lm4/t;->k:Z

    .line 300
    .line 301
    if-eqz v0, :cond_b

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_b
    const/4 v3, 0x0

    .line 305
    :goto_3
    or-int/2addr p1, v3

    .line 306
    iget-object v0, p0, Lm4/t;->a:Lm4/j;

    .line 307
    .line 308
    iget-wide v3, p0, Lm4/t;->l:J

    .line 309
    .line 310
    invoke-interface {v0, p1, v3, v4}, Lm4/j;->d(IJ)V

    .line 311
    .line 312
    .line 313
    iput v2, p0, Lm4/t;->c:I

    .line 314
    .line 315
    const/4 v0, 0x0

    .line 316
    iput v0, p0, Lm4/t;->d:I

    .line 317
    .line 318
    const/4 v3, -0x1

    .line 319
    const/4 v4, 0x0

    .line 320
    const/4 v6, 0x2

    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :cond_c
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 324
    .line 325
    iget-object v0, v0, Lv5/t;->a:[B

    .line 326
    .line 327
    const/16 v3, 0x9

    .line 328
    .line 329
    invoke-virtual {p0, v3, p2, v0}, Lm4/t;->d(ILv5/u;[B)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_11

    .line 334
    .line 335
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 336
    .line 337
    const/4 v3, 0x0

    .line 338
    invoke-virtual {v0, v3}, Lv5/t;->k(I)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 342
    .line 343
    const/16 v3, 0x18

    .line 344
    .line 345
    invoke-virtual {v0, v3}, Lv5/t;->g(I)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eq v0, v1, :cond_d

    .line 350
    .line 351
    const-string v3, "Unexpected start code prefix: "

    .line 352
    .line 353
    invoke-static {v3, v0, v5}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const/4 v0, -0x1

    .line 357
    iput v0, p0, Lm4/t;->j:I

    .line 358
    .line 359
    const/4 v3, 0x0

    .line 360
    const/4 v4, 0x2

    .line 361
    goto :goto_6

    .line 362
    :cond_d
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 363
    .line 364
    const/16 v3, 0x8

    .line 365
    .line 366
    invoke-virtual {v0, v3}, Lv5/t;->m(I)V

    .line 367
    .line 368
    .line 369
    iget-object v0, p0, Lm4/t;->b:Lv5/t;

    .line 370
    .line 371
    const/16 v4, 0x10

    .line 372
    .line 373
    invoke-virtual {v0, v4}, Lv5/t;->g(I)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 378
    .line 379
    const/4 v6, 0x5

    .line 380
    invoke-virtual {v4, v6}, Lv5/t;->m(I)V

    .line 381
    .line 382
    .line 383
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 384
    .line 385
    invoke-virtual {v4}, Lv5/t;->f()Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    iput-boolean v4, p0, Lm4/t;->k:Z

    .line 390
    .line 391
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 392
    .line 393
    const/4 v6, 0x2

    .line 394
    invoke-virtual {v4, v6}, Lv5/t;->m(I)V

    .line 395
    .line 396
    .line 397
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 398
    .line 399
    invoke-virtual {v4}, Lv5/t;->f()Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    iput-boolean v4, p0, Lm4/t;->f:Z

    .line 404
    .line 405
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 406
    .line 407
    invoke-virtual {v4}, Lv5/t;->f()Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    iput-boolean v4, p0, Lm4/t;->g:Z

    .line 412
    .line 413
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 414
    .line 415
    const/4 v7, 0x6

    .line 416
    invoke-virtual {v4, v7}, Lv5/t;->m(I)V

    .line 417
    .line 418
    .line 419
    iget-object v4, p0, Lm4/t;->b:Lv5/t;

    .line 420
    .line 421
    invoke-virtual {v4, v3}, Lv5/t;->g(I)I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    iput v3, p0, Lm4/t;->i:I

    .line 426
    .line 427
    if-nez v0, :cond_e

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_e
    add-int/lit8 v0, v0, 0x6

    .line 431
    .line 432
    add-int/lit8 v0, v0, -0x9

    .line 433
    .line 434
    sub-int/2addr v0, v3

    .line 435
    iput v0, p0, Lm4/t;->j:I

    .line 436
    .line 437
    if-gez v0, :cond_f

    .line 438
    .line 439
    const-string v0, "Found negative packet payload size: "

    .line 440
    .line 441
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    iget v3, p0, Lm4/t;->j:I

    .line 446
    .line 447
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v5, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    :goto_4
    const/4 v0, -0x1

    .line 458
    iput v0, p0, Lm4/t;->j:I

    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_f
    const/4 v0, -0x1

    .line 462
    :goto_5
    move v3, v1

    .line 463
    move v4, v6

    .line 464
    :goto_6
    if-eqz v3, :cond_10

    .line 465
    .line 466
    move v3, v4

    .line 467
    goto :goto_7

    .line 468
    :cond_10
    const/4 v3, 0x0

    .line 469
    :goto_7
    iput v3, p0, Lm4/t;->c:I

    .line 470
    .line 471
    const/4 v3, 0x0

    .line 472
    iput v3, p0, Lm4/t;->d:I

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_11
    const/4 v0, -0x1

    .line 476
    const/4 v3, 0x0

    .line 477
    const/4 v4, 0x2

    .line 478
    :goto_8
    move v6, v4

    .line 479
    move v4, v3

    .line 480
    move v3, v0

    .line 481
    goto/16 :goto_1

    .line 482
    .line 483
    :cond_12
    invoke-virtual {p2, v0}, Lv5/u;->H(I)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_1

    .line 487
    .line 488
    :cond_13
    return-void
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

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm4/t;->c:I

    iput v0, p0, Lm4/t;->d:I

    iput-boolean v0, p0, Lm4/t;->h:Z

    iget-object v0, p0, Lm4/t;->a:Lm4/j;

    invoke-interface {v0}, Lm4/j;->b()V

    return-void
.end method

.method public final c(Lv5/c0;Lc4/j;Lm4/d0$d;)V
    .locals 0

    iput-object p1, p0, Lm4/t;->e:Lv5/c0;

    iget-object p1, p0, Lm4/t;->a:Lm4/j;

    invoke-interface {p1, p2, p3}, Lm4/j;->e(Lc4/j;Lm4/d0$d;)V

    return-void
.end method

.method public final d(ILv5/u;[B)Z
    .locals 3

    .line 1
    iget v0, p2, Lv5/u;->c:I

    .line 2
    .line 3
    iget v1, p2, Lv5/u;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget v1, p0, Lm4/t;->d:I

    .line 7
    .line 8
    sub-int v1, p1, v1

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    if-nez p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lv5/u;->H(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget v2, p0, Lm4/t;->d:I

    .line 25
    .line 26
    invoke-virtual {p2, p3, v2, v0}, Lv5/u;->d([BII)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget p2, p0, Lm4/t;->d:I

    .line 30
    .line 31
    add-int/2addr p2, v0

    .line 32
    iput p2, p0, Lm4/t;->d:I

    .line 33
    .line 34
    if-ne p2, p1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v1, 0x0

    .line 38
    :goto_1
    return v1
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
