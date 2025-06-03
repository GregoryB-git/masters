.class public final Lma/u1$e;
.super Lma/u1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lma/u1$b;-><init>()V

    return-void
.end method

.method public static f([BIJI)I
    .locals 2

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p4, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p2, p3}, Lma/t1;->i([BJ)B

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    add-long/2addr p2, v0

    .line 16
    invoke-static {p0, p2, p3}, Lma/t1;->i([BJ)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p1, p4, p0}, Lma/u1;->d(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {p0, p2, p3}, Lma/t1;->i([BJ)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p1, p0}, Lma/u1;->c(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    sget-object p0, Lma/u1;->a:Lma/u1$b;

    .line 41
    .line 42
    const/16 p0, -0xc

    .line 43
    .line 44
    if-le p1, p0, :cond_3

    .line 45
    .line 46
    const/4 p1, -0x1

    .line 47
    :cond_3
    return p1
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


# virtual methods
.method public final a([BII)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lma/a0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, p2, p3, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v2, "\ufffd"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    add-int/2addr p3, p2

    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lma/b0;->c()Lma/b0;

    move-result-object p1

    throw p1
.end method

.method public final c(ILjava/nio/ByteBuffer;I)Ljava/lang/String;
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    or-int v2, v0, v1

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-int/2addr v3, v0

    .line 12
    sub-int/2addr v3, v1

    .line 13
    or-int/2addr v2, v3

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-ltz v2, :cond_10

    .line 17
    .line 18
    sget-object v2, Lma/t1;->c:Lma/t1$e;

    .line 19
    .line 20
    sget-wide v5, Lma/t1;->g:J

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    invoke-virtual {v2, v7, v5, v6}, Lma/t1$e;->j(Ljava/lang/Object;J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    int-to-long v7, v0

    .line 29
    add-long/2addr v5, v7

    .line 30
    int-to-long v7, v1

    .line 31
    add-long/2addr v7, v5

    .line 32
    new-array v0, v1, [C

    .line 33
    .line 34
    move v1, v3

    .line 35
    :goto_0
    cmp-long v2, v5, v7

    .line 36
    .line 37
    const-wide/16 v15, 0x1

    .line 38
    .line 39
    if-gez v2, :cond_2

    .line 40
    .line 41
    invoke-static {v5, v6}, Lma/t1;->h(J)B

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ltz v2, :cond_0

    .line 46
    .line 47
    move v9, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move v9, v3

    .line 50
    :goto_1
    if-nez v9, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    add-long/2addr v5, v15

    .line 54
    add-int/lit8 v9, v1, 0x1

    .line 55
    .line 56
    int-to-char v2, v2

    .line 57
    aput-char v2, v0, v1

    .line 58
    .line 59
    move v1, v9

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_2
    move v14, v1

    .line 62
    :cond_3
    :goto_3
    cmp-long v1, v5, v7

    .line 63
    .line 64
    if-gez v1, :cond_f

    .line 65
    .line 66
    add-long v1, v5, v15

    .line 67
    .line 68
    invoke-static {v5, v6}, Lma/t1;->h(J)B

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-ltz v9, :cond_4

    .line 73
    .line 74
    move v5, v4

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move v5, v3

    .line 77
    :goto_4
    if-eqz v5, :cond_7

    .line 78
    .line 79
    add-int/lit8 v5, v14, 0x1

    .line 80
    .line 81
    int-to-char v6, v9

    .line 82
    aput-char v6, v0, v14

    .line 83
    .line 84
    move v14, v5

    .line 85
    move-wide v5, v1

    .line 86
    :goto_5
    cmp-long v1, v5, v7

    .line 87
    .line 88
    if-gez v1, :cond_3

    .line 89
    .line 90
    invoke-static {v5, v6}, Lma/t1;->h(J)B

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-ltz v1, :cond_5

    .line 95
    .line 96
    move v2, v4

    .line 97
    goto :goto_6

    .line 98
    :cond_5
    move v2, v3

    .line 99
    :goto_6
    if-nez v2, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    add-long/2addr v5, v15

    .line 103
    add-int/lit8 v2, v14, 0x1

    .line 104
    .line 105
    int-to-char v1, v1

    .line 106
    aput-char v1, v0, v14

    .line 107
    .line 108
    move v14, v2

    .line 109
    goto :goto_5

    .line 110
    :cond_7
    const/16 v5, -0x20

    .line 111
    .line 112
    if-ge v9, v5, :cond_8

    .line 113
    .line 114
    move v5, v4

    .line 115
    goto :goto_7

    .line 116
    :cond_8
    move v5, v3

    .line 117
    :goto_7
    if-eqz v5, :cond_a

    .line 118
    .line 119
    cmp-long v5, v1, v7

    .line 120
    .line 121
    if-gez v5, :cond_9

    .line 122
    .line 123
    add-long v5, v1, v15

    .line 124
    .line 125
    invoke-static {v1, v2}, Lma/t1;->h(J)B

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    add-int/lit8 v2, v14, 0x1

    .line 130
    .line 131
    invoke-static {v9, v1, v0, v14}, Lma/u1$a;->b(BB[CI)V

    .line 132
    .line 133
    .line 134
    move v14, v2

    .line 135
    goto :goto_3

    .line 136
    :cond_9
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    throw v0

    .line 141
    :cond_a
    const/16 v5, -0x10

    .line 142
    .line 143
    if-ge v9, v5, :cond_b

    .line 144
    .line 145
    move v5, v4

    .line 146
    goto :goto_8

    .line 147
    :cond_b
    move v5, v3

    .line 148
    :goto_8
    if-eqz v5, :cond_d

    .line 149
    .line 150
    sub-long v5, v7, v15

    .line 151
    .line 152
    cmp-long v5, v1, v5

    .line 153
    .line 154
    if-gez v5, :cond_c

    .line 155
    .line 156
    add-long v5, v1, v15

    .line 157
    .line 158
    invoke-static {v1, v2}, Lma/t1;->h(J)B

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    add-long v10, v5, v15

    .line 163
    .line 164
    invoke-static {v5, v6}, Lma/t1;->h(J)B

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    add-int/lit8 v5, v14, 0x1

    .line 169
    .line 170
    invoke-static {v9, v1, v2, v0, v14}, Lma/u1$a;->c(BBB[CI)V

    .line 171
    .line 172
    .line 173
    move v14, v5

    .line 174
    move-wide v5, v10

    .line 175
    goto :goto_3

    .line 176
    :cond_c
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    throw v0

    .line 181
    :cond_d
    const-wide/16 v5, 0x2

    .line 182
    .line 183
    sub-long v5, v7, v5

    .line 184
    .line 185
    cmp-long v5, v1, v5

    .line 186
    .line 187
    if-gez v5, :cond_e

    .line 188
    .line 189
    add-long v5, v1, v15

    .line 190
    .line 191
    invoke-static {v1, v2}, Lma/t1;->h(J)B

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    add-long v1, v5, v15

    .line 196
    .line 197
    invoke-static {v5, v6}, Lma/t1;->h(J)B

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    add-long v5, v1, v15

    .line 202
    .line 203
    invoke-static {v1, v2}, Lma/t1;->h(J)B

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    add-int/lit8 v1, v14, 0x1

    .line 208
    .line 209
    move-object v13, v0

    .line 210
    invoke-static/range {v9 .. v14}, Lma/u1$a;->a(BBBB[CI)V

    .line 211
    .line 212
    .line 213
    add-int/2addr v1, v4

    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_e
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0

    .line 221
    :cond_f
    new-instance v1, Ljava/lang/String;

    .line 222
    .line 223
    invoke-direct {v1, v0, v3, v14}, Ljava/lang/String;-><init>([CII)V

    .line 224
    .line 225
    .line 226
    return-object v1

    .line 227
    :cond_10
    move-object/from16 v7, p2

    .line 228
    .line 229
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 230
    .line 231
    const/4 v5, 0x3

    .line 232
    new-array v5, v5, [Ljava/lang/Object;

    .line 233
    .line 234
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    aput-object v6, v5, v3

    .line 243
    .line 244
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    aput-object v0, v5, v4

    .line 249
    .line 250
    const/4 v0, 0x2

    .line 251
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    aput-object v1, v5, v0

    .line 256
    .line 257
    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    .line 258
    .line 259
    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {v2, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v2
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
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
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
.end method

.method public final d(Ljava/lang/CharSequence;[BII)I
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    int-to-long v4, v2

    .line 10
    int-to-long v6, v3

    .line 11
    add-long/2addr v6, v4

    .line 12
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v8

    .line 16
    const-string v9, " at index "

    .line 17
    .line 18
    const-string v10, "Failed writing "

    .line 19
    .line 20
    if-gt v8, v3, :cond_c

    .line 21
    .line 22
    array-length v11, v1

    .line 23
    sub-int/2addr v11, v3

    .line 24
    if-lt v11, v2, :cond_c

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    const-wide/16 v11, 0x1

    .line 28
    .line 29
    const/16 v3, 0x80

    .line 30
    .line 31
    if-ge v2, v8, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v13

    .line 37
    if-ge v13, v3, :cond_0

    .line 38
    .line 39
    add-long/2addr v11, v4

    .line 40
    int-to-byte v3, v13

    .line 41
    invoke-static {v1, v4, v5, v3}, Lma/t1;->s([BJB)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    move-wide v4, v11

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    if-ne v2, v8, :cond_1

    .line 49
    .line 50
    long-to-int v0, v4

    .line 51
    return v0

    .line 52
    :cond_1
    :goto_1
    if-ge v2, v8, :cond_b

    .line 53
    .line 54
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-ge v13, v3, :cond_2

    .line 59
    .line 60
    cmp-long v14, v4, v6

    .line 61
    .line 62
    if-gez v14, :cond_2

    .line 63
    .line 64
    add-long v14, v4, v11

    .line 65
    .line 66
    int-to-byte v13, v13

    .line 67
    invoke-static {v1, v4, v5, v13}, Lma/t1;->s([BJB)V

    .line 68
    .line 69
    .line 70
    move-wide v4, v14

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_2
    const/16 v3, 0x800

    .line 74
    .line 75
    if-ge v13, v3, :cond_3

    .line 76
    .line 77
    const-wide/16 v14, 0x2

    .line 78
    .line 79
    sub-long v14, v6, v14

    .line 80
    .line 81
    cmp-long v3, v4, v14

    .line 82
    .line 83
    if-gtz v3, :cond_3

    .line 84
    .line 85
    add-long v14, v4, v11

    .line 86
    .line 87
    ushr-int/lit8 v3, v13, 0x6

    .line 88
    .line 89
    or-int/lit16 v3, v3, 0x3c0

    .line 90
    .line 91
    int-to-byte v3, v3

    .line 92
    invoke-static {v1, v4, v5, v3}, Lma/t1;->s([BJB)V

    .line 93
    .line 94
    .line 95
    add-long v3, v14, v11

    .line 96
    .line 97
    and-int/lit8 v5, v13, 0x3f

    .line 98
    .line 99
    or-int/lit16 v5, v5, 0x80

    .line 100
    .line 101
    int-to-byte v5, v5

    .line 102
    invoke-static {v1, v14, v15, v5}, Lma/t1;->s([BJB)V

    .line 103
    .line 104
    .line 105
    :goto_2
    const/16 v5, 0x80

    .line 106
    .line 107
    move-wide/from16 v17, v3

    .line 108
    .line 109
    move v3, v5

    .line 110
    move-wide/from16 v4, v17

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_3
    const v3, 0xdfff

    .line 115
    .line 116
    .line 117
    const v14, 0xd800

    .line 118
    .line 119
    .line 120
    if-lt v13, v14, :cond_4

    .line 121
    .line 122
    if-ge v3, v13, :cond_5

    .line 123
    .line 124
    :cond_4
    const-wide/16 v15, 0x3

    .line 125
    .line 126
    sub-long v15, v6, v15

    .line 127
    .line 128
    cmp-long v15, v4, v15

    .line 129
    .line 130
    if-gtz v15, :cond_5

    .line 131
    .line 132
    add-long v14, v4, v11

    .line 133
    .line 134
    ushr-int/lit8 v3, v13, 0xc

    .line 135
    .line 136
    or-int/lit16 v3, v3, 0x1e0

    .line 137
    .line 138
    int-to-byte v3, v3

    .line 139
    invoke-static {v1, v4, v5, v3}, Lma/t1;->s([BJB)V

    .line 140
    .line 141
    .line 142
    add-long/2addr v11, v14

    .line 143
    ushr-int/lit8 v3, v13, 0x6

    .line 144
    .line 145
    and-int/lit8 v3, v3, 0x3f

    .line 146
    .line 147
    or-int/lit16 v3, v3, 0x80

    .line 148
    .line 149
    int-to-byte v3, v3

    .line 150
    invoke-static {v1, v14, v15, v3}, Lma/t1;->s([BJB)V

    .line 151
    .line 152
    .line 153
    const-wide/16 v3, 0x1

    .line 154
    .line 155
    add-long/2addr v3, v11

    .line 156
    and-int/lit8 v5, v13, 0x3f

    .line 157
    .line 158
    or-int/lit16 v5, v5, 0x80

    .line 159
    .line 160
    int-to-byte v5, v5

    .line 161
    invoke-static {v1, v11, v12, v5}, Lma/t1;->s([BJB)V

    .line 162
    .line 163
    .line 164
    const-wide/16 v11, 0x1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    const-wide/16 v11, 0x4

    .line 168
    .line 169
    sub-long v11, v6, v11

    .line 170
    .line 171
    cmp-long v11, v4, v11

    .line 172
    .line 173
    if-gtz v11, :cond_8

    .line 174
    .line 175
    add-int/lit8 v3, v2, 0x1

    .line 176
    .line 177
    if-eq v3, v8, :cond_7

    .line 178
    .line 179
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-static {v13, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_6

    .line 188
    .line 189
    invoke-static {v13, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    const-wide/16 v11, 0x1

    .line 194
    .line 195
    add-long v13, v4, v11

    .line 196
    .line 197
    ushr-int/lit8 v15, v2, 0x12

    .line 198
    .line 199
    or-int/lit16 v15, v15, 0xf0

    .line 200
    .line 201
    int-to-byte v15, v15

    .line 202
    invoke-static {v1, v4, v5, v15}, Lma/t1;->s([BJB)V

    .line 203
    .line 204
    .line 205
    add-long/2addr v11, v13

    .line 206
    ushr-int/lit8 v4, v2, 0xc

    .line 207
    .line 208
    and-int/lit8 v4, v4, 0x3f

    .line 209
    .line 210
    const/16 v5, 0x80

    .line 211
    .line 212
    or-int/lit16 v4, v4, 0x80

    .line 213
    .line 214
    int-to-byte v4, v4

    .line 215
    invoke-static {v1, v13, v14, v4}, Lma/t1;->s([BJB)V

    .line 216
    .line 217
    .line 218
    const-wide/16 v13, 0x1

    .line 219
    .line 220
    add-long/2addr v13, v11

    .line 221
    ushr-int/lit8 v4, v2, 0x6

    .line 222
    .line 223
    and-int/lit8 v4, v4, 0x3f

    .line 224
    .line 225
    or-int/2addr v4, v5

    .line 226
    int-to-byte v4, v4

    .line 227
    invoke-static {v1, v11, v12, v4}, Lma/t1;->s([BJB)V

    .line 228
    .line 229
    .line 230
    const-wide/16 v11, 0x1

    .line 231
    .line 232
    add-long v15, v13, v11

    .line 233
    .line 234
    and-int/lit8 v2, v2, 0x3f

    .line 235
    .line 236
    or-int/2addr v2, v5

    .line 237
    int-to-byte v2, v2

    .line 238
    invoke-static {v1, v13, v14, v2}, Lma/t1;->s([BJB)V

    .line 239
    .line 240
    .line 241
    move v2, v3

    .line 242
    move v3, v5

    .line 243
    move-wide v4, v15

    .line 244
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_6
    move v2, v3

    .line 249
    :cond_7
    new-instance v0, Lma/u1$d;

    .line 250
    .line 251
    add-int/lit8 v2, v2, -0x1

    .line 252
    .line 253
    invoke-direct {v0, v2, v8}, Lma/u1$d;-><init>(II)V

    .line 254
    .line 255
    .line 256
    throw v0

    .line 257
    :cond_8
    if-gt v14, v13, :cond_a

    .line 258
    .line 259
    if-gt v13, v3, :cond_a

    .line 260
    .line 261
    add-int/lit8 v1, v2, 0x1

    .line 262
    .line 263
    if-eq v1, v8, :cond_9

    .line 264
    .line 265
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-static {v13, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_a

    .line 274
    .line 275
    :cond_9
    new-instance v0, Lma/u1$d;

    .line 276
    .line 277
    invoke-direct {v0, v2, v8}, Lma/u1$d;-><init>(II)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 282
    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v0

    .line 308
    :cond_b
    long-to-int v0, v4

    .line 309
    return v0

    .line 310
    :cond_c
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 311
    .line 312
    invoke-static {v10}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    add-int/lit8 v8, v8, -0x1

    .line 317
    .line 318
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    add-int v0, v2, v3

    .line 329
    .line 330
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v1
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

.method public final e(I[BII)I
    .locals 23

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    or-int v4, v2, v3

    .line 10
    .line 11
    array-length v5, v1

    .line 12
    sub-int/2addr v5, v3

    .line 13
    or-int/2addr v4, v5

    .line 14
    if-ltz v4, :cond_26

    .line 15
    .line 16
    int-to-long v8, v2

    .line 17
    int-to-long v2, v3

    .line 18
    const/16 v4, -0x13

    .line 19
    .line 20
    const/16 v10, -0x3e

    .line 21
    .line 22
    const/16 v11, -0x10

    .line 23
    .line 24
    const/16 v12, 0x10

    .line 25
    .line 26
    const/16 v13, -0x60

    .line 27
    .line 28
    const/16 v14, -0x20

    .line 29
    .line 30
    const/16 v15, -0x41

    .line 31
    .line 32
    const/16 v16, -0x1

    .line 33
    .line 34
    const-wide/16 v17, 0x1

    .line 35
    .line 36
    if-eqz v0, :cond_10

    .line 37
    .line 38
    cmp-long v19, v8, v2

    .line 39
    .line 40
    if-ltz v19, :cond_0

    .line 41
    .line 42
    return v0

    .line 43
    :cond_0
    int-to-byte v7, v0

    .line 44
    if-ge v7, v14, :cond_3

    .line 45
    .line 46
    if-lt v7, v10, :cond_2

    .line 47
    .line 48
    add-long v20, v8, v17

    .line 49
    .line 50
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-le v0, v15, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-wide/from16 v8, v20

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_2
    :goto_0
    return v16

    .line 62
    :cond_3
    if-ge v7, v11, :cond_9

    .line 63
    .line 64
    shr-int/lit8 v0, v0, 0x8

    .line 65
    .line 66
    not-int v0, v0

    .line 67
    int-to-byte v0, v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    add-long v20, v8, v17

    .line 71
    .line 72
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    cmp-long v8, v20, v2

    .line 77
    .line 78
    if-ltz v8, :cond_4

    .line 79
    .line 80
    invoke-static {v7, v0}, Lma/u1;->c(II)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    return v0

    .line 85
    :cond_4
    move-wide/from16 v8, v20

    .line 86
    .line 87
    :cond_5
    if-gt v0, v15, :cond_8

    .line 88
    .line 89
    if-ne v7, v14, :cond_6

    .line 90
    .line 91
    if-lt v0, v13, :cond_8

    .line 92
    .line 93
    :cond_6
    if-ne v7, v4, :cond_7

    .line 94
    .line 95
    if-ge v0, v13, :cond_8

    .line 96
    .line 97
    :cond_7
    add-long v20, v8, v17

    .line 98
    .line 99
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-le v0, v15, :cond_1

    .line 104
    .line 105
    :cond_8
    return v16

    .line 106
    :cond_9
    shr-int/lit8 v6, v0, 0x8

    .line 107
    .line 108
    not-int v6, v6

    .line 109
    int-to-byte v6, v6

    .line 110
    if-nez v6, :cond_b

    .line 111
    .line 112
    add-long v21, v8, v17

    .line 113
    .line 114
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    cmp-long v0, v21, v2

    .line 119
    .line 120
    if-ltz v0, :cond_a

    .line 121
    .line 122
    invoke-static {v7, v6}, Lma/u1;->c(II)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    return v0

    .line 127
    :cond_a
    move-wide/from16 v8, v21

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    goto :goto_1

    .line 131
    :cond_b
    shr-int/2addr v0, v12

    .line 132
    int-to-byte v0, v0

    .line 133
    :goto_1
    if-nez v0, :cond_d

    .line 134
    .line 135
    add-long v21, v8, v17

    .line 136
    .line 137
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    cmp-long v8, v21, v2

    .line 142
    .line 143
    if-ltz v8, :cond_c

    .line 144
    .line 145
    invoke-static {v7, v6, v0}, Lma/u1;->d(III)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    return v0

    .line 150
    :cond_c
    move-wide/from16 v8, v21

    .line 151
    .line 152
    :cond_d
    if-gt v6, v15, :cond_f

    .line 153
    .line 154
    shl-int/lit8 v7, v7, 0x1c

    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x70

    .line 157
    .line 158
    add-int/2addr v6, v7

    .line 159
    shr-int/lit8 v6, v6, 0x1e

    .line 160
    .line 161
    if-nez v6, :cond_f

    .line 162
    .line 163
    if-gt v0, v15, :cond_f

    .line 164
    .line 165
    add-long v6, v8, v17

    .line 166
    .line 167
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-le v0, v15, :cond_e

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_e
    move-wide v8, v6

    .line 175
    goto :goto_3

    .line 176
    :cond_f
    :goto_2
    return v16

    .line 177
    :cond_10
    :goto_3
    sub-long/2addr v2, v8

    .line 178
    long-to-int v0, v2

    .line 179
    if-ge v0, v12, :cond_11

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    goto :goto_7

    .line 183
    :cond_11
    long-to-int v2, v8

    .line 184
    and-int/lit8 v2, v2, 0x7

    .line 185
    .line 186
    rsub-int/lit8 v2, v2, 0x8

    .line 187
    .line 188
    move-wide v6, v8

    .line 189
    const/4 v3, 0x0

    .line 190
    :goto_4
    if-ge v3, v2, :cond_13

    .line 191
    .line 192
    add-long v21, v6, v17

    .line 193
    .line 194
    invoke-static {v1, v6, v7}, Lma/t1;->i([BJ)B

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-gez v6, :cond_12

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_12
    add-int/lit8 v3, v3, 0x1

    .line 202
    .line 203
    move-wide/from16 v6, v21

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_13
    :goto_5
    add-int/lit8 v2, v3, 0x8

    .line 207
    .line 208
    if-gt v2, v0, :cond_15

    .line 209
    .line 210
    sget-wide v21, Lma/t1;->f:J

    .line 211
    .line 212
    add-long v4, v21, v6

    .line 213
    .line 214
    invoke-static {v1, v4, v5}, Lma/t1;->o(Ljava/lang/Object;J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v4

    .line 218
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    and-long v4, v4, v21

    .line 224
    .line 225
    const-wide/16 v21, 0x0

    .line 226
    .line 227
    cmp-long v4, v4, v21

    .line 228
    .line 229
    if-eqz v4, :cond_14

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_14
    const-wide/16 v3, 0x8

    .line 233
    .line 234
    add-long/2addr v6, v3

    .line 235
    move v3, v2

    .line 236
    const/16 v4, -0x13

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_15
    :goto_6
    if-ge v3, v0, :cond_17

    .line 240
    .line 241
    add-long v4, v6, v17

    .line 242
    .line 243
    invoke-static {v1, v6, v7}, Lma/t1;->i([BJ)B

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-gez v2, :cond_16

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_16
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    move-wide v6, v4

    .line 253
    goto :goto_6

    .line 254
    :cond_17
    move v3, v0

    .line 255
    :goto_7
    sub-int/2addr v0, v3

    .line 256
    int-to-long v2, v3

    .line 257
    add-long/2addr v8, v2

    .line 258
    :cond_18
    :goto_8
    const/4 v2, 0x0

    .line 259
    :goto_9
    if-lez v0, :cond_1a

    .line 260
    .line 261
    add-long v2, v8, v17

    .line 262
    .line 263
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-ltz v4, :cond_19

    .line 268
    .line 269
    add-int/lit8 v0, v0, -0x1

    .line 270
    .line 271
    move-wide v8, v2

    .line 272
    move v2, v4

    .line 273
    goto :goto_9

    .line 274
    :cond_19
    move-wide v8, v2

    .line 275
    move v2, v4

    .line 276
    :cond_1a
    if-nez v0, :cond_1b

    .line 277
    .line 278
    const/4 v7, 0x0

    .line 279
    goto/16 :goto_c

    .line 280
    .line 281
    :cond_1b
    add-int/lit8 v0, v0, -0x1

    .line 282
    .line 283
    if-ge v2, v14, :cond_1f

    .line 284
    .line 285
    if-nez v0, :cond_1c

    .line 286
    .line 287
    move v7, v2

    .line 288
    goto/16 :goto_c

    .line 289
    .line 290
    :cond_1c
    add-int/lit8 v0, v0, -0x1

    .line 291
    .line 292
    if-lt v2, v10, :cond_1e

    .line 293
    .line 294
    add-long v2, v8, v17

    .line 295
    .line 296
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-le v4, v15, :cond_1d

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_1d
    move-wide v8, v2

    .line 304
    const/16 v6, -0x13

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_1e
    :goto_a
    move/from16 v7, v16

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_1f
    if-ge v2, v11, :cond_23

    .line 311
    .line 312
    const/4 v3, 0x2

    .line 313
    if-ge v0, v3, :cond_20

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_20
    add-int/lit8 v0, v0, -0x2

    .line 317
    .line 318
    add-long v3, v8, v17

    .line 319
    .line 320
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-gt v5, v15, :cond_1e

    .line 325
    .line 326
    if-ne v2, v14, :cond_21

    .line 327
    .line 328
    if-lt v5, v13, :cond_1e

    .line 329
    .line 330
    :cond_21
    const/16 v6, -0x13

    .line 331
    .line 332
    if-ne v2, v6, :cond_22

    .line 333
    .line 334
    if-ge v5, v13, :cond_1e

    .line 335
    .line 336
    :cond_22
    add-long v8, v3, v17

    .line 337
    .line 338
    invoke-static {v1, v3, v4}, Lma/t1;->i([BJ)B

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-le v2, v15, :cond_18

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_23
    const/4 v3, 0x3

    .line 346
    const/16 v6, -0x13

    .line 347
    .line 348
    if-ge v0, v3, :cond_24

    .line 349
    .line 350
    :goto_b
    invoke-static {v1, v2, v8, v9, v0}, Lma/u1$e;->f([BIJI)I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    goto :goto_c

    .line 355
    :cond_24
    add-int/lit8 v0, v0, -0x3

    .line 356
    .line 357
    add-long v3, v8, v17

    .line 358
    .line 359
    invoke-static {v1, v8, v9}, Lma/t1;->i([BJ)B

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-gt v5, v15, :cond_1e

    .line 364
    .line 365
    shl-int/lit8 v2, v2, 0x1c

    .line 366
    .line 367
    add-int/lit8 v5, v5, 0x70

    .line 368
    .line 369
    add-int/2addr v5, v2

    .line 370
    shr-int/lit8 v2, v5, 0x1e

    .line 371
    .line 372
    if-nez v2, :cond_1e

    .line 373
    .line 374
    add-long v7, v3, v17

    .line 375
    .line 376
    invoke-static {v1, v3, v4}, Lma/t1;->i([BJ)B

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-gt v2, v15, :cond_1e

    .line 381
    .line 382
    add-long v2, v7, v17

    .line 383
    .line 384
    invoke-static {v1, v7, v8}, Lma/t1;->i([BJ)B

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-le v4, v15, :cond_25

    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_25
    move-wide v8, v2

    .line 392
    goto/16 :goto_8

    .line 393
    .line 394
    :goto_c
    return v7

    .line 395
    :cond_26
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 396
    .line 397
    const/4 v4, 0x3

    .line 398
    new-array v4, v4, [Ljava/lang/Object;

    .line 399
    .line 400
    array-length v1, v1

    .line 401
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    const/4 v5, 0x0

    .line 406
    aput-object v1, v4, v5

    .line 407
    .line 408
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    const/4 v2, 0x1

    .line 413
    aput-object v1, v4, v2

    .line 414
    .line 415
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    const/4 v2, 0x2

    .line 420
    aput-object v1, v4, v2

    .line 421
    .line 422
    const-string v1, "Array length=%d, index=%d, limit=%d"

    .line 423
    .line 424
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v0
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
