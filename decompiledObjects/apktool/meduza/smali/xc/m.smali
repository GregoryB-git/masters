.class public final Lxc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/y;


# instance fields
.field public a:B

.field public final b:Lxc/s;

.field public final c:Ljava/util/zip/Inflater;

.field public final d:Lxc/n;

.field public final e:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lxc/y;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxc/s;

    invoke-direct {v0, p1}, Lxc/s;-><init>(Lxc/y;)V

    iput-object v0, p0, Lxc/m;->b:Lxc/s;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, Lxc/m;->c:Ljava/util/zip/Inflater;

    new-instance v1, Lxc/n;

    invoke-direct {v1, v0, p1}, Lxc/n;-><init>(Lxc/s;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lxc/m;->d:Lxc/n;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lxc/m;->e:Ljava/util/zip/CRC32;

    return-void
.end method

.method public static f(IILjava/lang/String;)V
    .locals 4

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, p2

    const/4 p1, 0x2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, p1

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(this, *args)"

    invoke-static {p0, p1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lxc/m;->b:Lxc/s;

    invoke-virtual {v0}, Lxc/s;->c()Lxc/z;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lxc/m;->d:Lxc/n;

    invoke-virtual {v0}, Lxc/n;->close()V

    return-void
.end method

.method public final e0(Lxc/f;J)J
    .locals 26

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-wide/from16 v8, p2

    .line 6
    .line 7
    const-string v0, "sink"

    .line 8
    .line 9
    invoke-static {v7, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    cmp-long v2, v8, v0

    .line 15
    .line 16
    const/4 v10, 0x1

    .line 17
    const/4 v11, 0x0

    .line 18
    if-ltz v2, :cond_0

    .line 19
    .line 20
    move v3, v10

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, v11

    .line 23
    :goto_0
    if-eqz v3, :cond_16

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_1
    iget-byte v0, v6, Lxc/m;->a:B

    .line 29
    .line 30
    const-wide/16 v12, -0x1

    .line 31
    .line 32
    if-nez v0, :cond_11

    .line 33
    .line 34
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 35
    .line 36
    const-wide/16 v1, 0xa

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lxc/s;->u0(J)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 42
    .line 43
    iget-object v0, v0, Lxc/s;->b:Lxc/f;

    .line 44
    .line 45
    const-wide/16 v1, 0x3

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lxc/f;->I(J)B

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    shr-int/lit8 v0, v14, 0x1

    .line 52
    .line 53
    and-int/2addr v0, v10

    .line 54
    if-ne v0, v10, :cond_2

    .line 55
    .line 56
    move v15, v10

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v15, v11

    .line 59
    :goto_1
    if-eqz v15, :cond_3

    .line 60
    .line 61
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 62
    .line 63
    iget-object v5, v0, Lxc/s;->b:Lxc/f;

    .line 64
    .line 65
    const-wide/16 v1, 0x0

    .line 66
    .line 67
    const-wide/16 v3, 0xa

    .line 68
    .line 69
    move-object/from16 v0, p0

    .line 70
    .line 71
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 75
    .line 76
    invoke-virtual {v0}, Lxc/s;->readShort()S

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v1, 0x1f8b

    .line 81
    .line 82
    const-string v2, "ID1ID2"

    .line 83
    .line 84
    invoke-static {v1, v0, v2}, Lxc/m;->f(IILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 88
    .line 89
    const-wide/16 v1, 0x8

    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Lxc/s;->skip(J)V

    .line 92
    .line 93
    .line 94
    shr-int/lit8 v0, v14, 0x2

    .line 95
    .line 96
    and-int/2addr v0, v10

    .line 97
    if-ne v0, v10, :cond_4

    .line 98
    .line 99
    move v0, v10

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move v0, v11

    .line 102
    :goto_2
    const v16, 0xff00

    .line 103
    .line 104
    .line 105
    const-wide/16 v1, 0x2

    .line 106
    .line 107
    const v17, 0xffff

    .line 108
    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Lxc/s;->u0(J)V

    .line 115
    .line 116
    .line 117
    if-eqz v15, :cond_5

    .line 118
    .line 119
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 120
    .line 121
    iget-object v5, v0, Lxc/s;->b:Lxc/f;

    .line 122
    .line 123
    const-wide/16 v1, 0x0

    .line 124
    .line 125
    const-wide/16 v3, 0x2

    .line 126
    .line 127
    move-object/from16 v0, p0

    .line 128
    .line 129
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 133
    .line 134
    iget-object v0, v0, Lxc/s;->b:Lxc/f;

    .line 135
    .line 136
    invoke-virtual {v0}, Lxc/f;->readShort()S

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    and-int v0, v0, v17

    .line 141
    .line 142
    and-int v1, v0, v16

    .line 143
    .line 144
    ushr-int/lit8 v1, v1, 0x8

    .line 145
    .line 146
    and-int/lit16 v0, v0, 0xff

    .line 147
    .line 148
    shl-int/lit8 v0, v0, 0x8

    .line 149
    .line 150
    or-int/2addr v0, v1

    .line 151
    int-to-short v0, v0

    .line 152
    and-int v0, v0, v17

    .line 153
    .line 154
    int-to-long v3, v0

    .line 155
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 156
    .line 157
    invoke-virtual {v0, v3, v4}, Lxc/s;->u0(J)V

    .line 158
    .line 159
    .line 160
    if-eqz v15, :cond_6

    .line 161
    .line 162
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 163
    .line 164
    iget-object v5, v0, Lxc/s;->b:Lxc/f;

    .line 165
    .line 166
    const-wide/16 v1, 0x0

    .line 167
    .line 168
    move-object/from16 v0, p0

    .line 169
    .line 170
    move-wide/from16 v18, v3

    .line 171
    .line 172
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    move-wide/from16 v18, v3

    .line 177
    .line 178
    :goto_3
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 179
    .line 180
    move-wide/from16 v1, v18

    .line 181
    .line 182
    invoke-virtual {v0, v1, v2}, Lxc/s;->skip(J)V

    .line 183
    .line 184
    .line 185
    :cond_7
    shr-int/lit8 v0, v14, 0x3

    .line 186
    .line 187
    and-int/2addr v0, v10

    .line 188
    if-ne v0, v10, :cond_8

    .line 189
    .line 190
    move v0, v10

    .line 191
    goto :goto_4

    .line 192
    :cond_8
    move v0, v11

    .line 193
    :goto_4
    const-wide/16 v18, 0x1

    .line 194
    .line 195
    if-eqz v0, :cond_b

    .line 196
    .line 197
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const-wide/16 v22, 0x0

    .line 202
    .line 203
    const-wide v24, 0x7fffffffffffffffL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    move-object/from16 v20, v0

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v25}, Lxc/s;->f(BJJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v20

    .line 214
    cmp-long v0, v20, v12

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    if-eqz v15, :cond_9

    .line 219
    .line 220
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 221
    .line 222
    iget-object v5, v0, Lxc/s;->b:Lxc/f;

    .line 223
    .line 224
    const-wide/16 v1, 0x0

    .line 225
    .line 226
    add-long v3, v20, v18

    .line 227
    .line 228
    move-object/from16 v0, p0

    .line 229
    .line 230
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 231
    .line 232
    .line 233
    :cond_9
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 234
    .line 235
    add-long v1, v20, v18

    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, Lxc/s;->skip(J)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :cond_b
    :goto_5
    shr-int/lit8 v0, v14, 0x4

    .line 248
    .line 249
    and-int/2addr v0, v10

    .line 250
    if-ne v0, v10, :cond_c

    .line 251
    .line 252
    move v11, v10

    .line 253
    :cond_c
    if-eqz v11, :cond_f

    .line 254
    .line 255
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 256
    .line 257
    const/4 v1, 0x0

    .line 258
    const-wide/16 v2, 0x0

    .line 259
    .line 260
    const-wide v4, 0x7fffffffffffffffL

    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v0 .. v5}, Lxc/s;->f(BJJ)J

    .line 266
    .line 267
    .line 268
    move-result-wide v20

    .line 269
    cmp-long v0, v20, v12

    .line 270
    .line 271
    if-eqz v0, :cond_e

    .line 272
    .line 273
    if-eqz v15, :cond_d

    .line 274
    .line 275
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 276
    .line 277
    iget-object v5, v0, Lxc/s;->b:Lxc/f;

    .line 278
    .line 279
    const-wide/16 v1, 0x0

    .line 280
    .line 281
    add-long v3, v20, v18

    .line 282
    .line 283
    move-object/from16 v0, p0

    .line 284
    .line 285
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 286
    .line 287
    .line 288
    :cond_d
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 289
    .line 290
    add-long v1, v20, v18

    .line 291
    .line 292
    invoke-virtual {v0, v1, v2}, Lxc/s;->skip(J)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_e
    new-instance v0, Ljava/io/EOFException;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_f
    :goto_6
    if-eqz v15, :cond_10

    .line 303
    .line 304
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 305
    .line 306
    const-wide/16 v1, 0x2

    .line 307
    .line 308
    invoke-virtual {v0, v1, v2}, Lxc/s;->u0(J)V

    .line 309
    .line 310
    .line 311
    iget-object v0, v0, Lxc/s;->b:Lxc/f;

    .line 312
    .line 313
    invoke-virtual {v0}, Lxc/f;->readShort()S

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    and-int v0, v0, v17

    .line 318
    .line 319
    and-int v1, v0, v16

    .line 320
    .line 321
    ushr-int/lit8 v1, v1, 0x8

    .line 322
    .line 323
    and-int/lit16 v0, v0, 0xff

    .line 324
    .line 325
    shl-int/lit8 v0, v0, 0x8

    .line 326
    .line 327
    or-int/2addr v0, v1

    .line 328
    int-to-short v0, v0

    .line 329
    iget-object v1, v6, Lxc/m;->e:Ljava/util/zip/CRC32;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 332
    .line 333
    .line 334
    move-result-wide v1

    .line 335
    long-to-int v1, v1

    .line 336
    int-to-short v1, v1

    .line 337
    const-string v2, "FHCRC"

    .line 338
    .line 339
    invoke-static {v0, v1, v2}, Lxc/m;->f(IILjava/lang/String;)V

    .line 340
    .line 341
    .line 342
    iget-object v0, v6, Lxc/m;->e:Ljava/util/zip/CRC32;

    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    .line 345
    .line 346
    .line 347
    :cond_10
    iput-byte v10, v6, Lxc/m;->a:B

    .line 348
    .line 349
    :cond_11
    iget-byte v0, v6, Lxc/m;->a:B

    .line 350
    .line 351
    const/4 v1, 0x2

    .line 352
    if-ne v0, v10, :cond_13

    .line 353
    .line 354
    iget-wide v2, v7, Lxc/f;->b:J

    .line 355
    .line 356
    iget-object v0, v6, Lxc/m;->d:Lxc/n;

    .line 357
    .line 358
    invoke-virtual {v0, v7, v8, v9}, Lxc/n;->e0(Lxc/f;J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v8

    .line 362
    cmp-long v0, v8, v12

    .line 363
    .line 364
    if-eqz v0, :cond_12

    .line 365
    .line 366
    move-object/from16 v0, p0

    .line 367
    .line 368
    move-wide v1, v2

    .line 369
    move-wide v3, v8

    .line 370
    move-object/from16 v5, p1

    .line 371
    .line 372
    invoke-virtual/range {v0 .. v5}, Lxc/m;->g(JJLxc/f;)V

    .line 373
    .line 374
    .line 375
    return-wide v8

    .line 376
    :cond_12
    iput-byte v1, v6, Lxc/m;->a:B

    .line 377
    .line 378
    :cond_13
    iget-byte v0, v6, Lxc/m;->a:B

    .line 379
    .line 380
    if-ne v0, v1, :cond_15

    .line 381
    .line 382
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 383
    .line 384
    invoke-virtual {v0}, Lxc/s;->C()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    iget-object v1, v6, Lxc/m;->e:Ljava/util/zip/CRC32;

    .line 389
    .line 390
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 391
    .line 392
    .line 393
    move-result-wide v1

    .line 394
    long-to-int v1, v1

    .line 395
    const-string v2, "CRC"

    .line 396
    .line 397
    invoke-static {v0, v1, v2}, Lxc/m;->f(IILjava/lang/String;)V

    .line 398
    .line 399
    .line 400
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 401
    .line 402
    invoke-virtual {v0}, Lxc/s;->C()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    iget-object v1, v6, Lxc/m;->c:Ljava/util/zip/Inflater;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 409
    .line 410
    .line 411
    move-result-wide v1

    .line 412
    long-to-int v1, v1

    .line 413
    const-string v2, "ISIZE"

    .line 414
    .line 415
    invoke-static {v0, v1, v2}, Lxc/m;->f(IILjava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const/4 v0, 0x3

    .line 419
    iput-byte v0, v6, Lxc/m;->a:B

    .line 420
    .line 421
    iget-object v0, v6, Lxc/m;->b:Lxc/s;

    .line 422
    .line 423
    invoke-virtual {v0}, Lxc/s;->v()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_14

    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_14
    new-instance v0, Ljava/io/IOException;

    .line 431
    .line 432
    const-string v1, "gzip finished without exhausting source"

    .line 433
    .line 434
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw v0

    .line 438
    :cond_15
    :goto_7
    return-wide v12

    .line 439
    :cond_16
    const-string v0, "byteCount < 0: "

    .line 440
    .line 441
    invoke-static {v0, v8, v9}, La0/j;->i(Ljava/lang/String;J)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw v1
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

.method public final g(JJLxc/f;)V
    .locals 4

    iget-object p5, p5, Lxc/f;->a:Lxc/t;

    :goto_0
    invoke-static {p5}, Lec/i;->b(Ljava/lang/Object;)V

    iget v0, p5, Lxc/t;->c:I

    iget v1, p5, Lxc/t;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p1, v0

    iget-object p5, p5, Lxc/t;->f:Lxc/t;

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_1
    cmp-long v2, p3, v0

    if-lez v2, :cond_1

    iget v2, p5, Lxc/t;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p1

    long-to-int p1, v2

    iget p2, p5, Lxc/t;->c:I

    sub-int/2addr p2, p1

    int-to-long v2, p2

    invoke-static {v2, v3, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p2, v2

    iget-object v2, p0, Lxc/m;->e:Ljava/util/zip/CRC32;

    iget-object v3, p5, Lxc/t;->a:[B

    invoke-virtual {v2, v3, p1, p2}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p1, p2

    sub-long/2addr p3, p1

    iget-object p5, p5, Lxc/t;->f:Lxc/t;

    invoke-static {p5}, Lec/i;->b(Ljava/lang/Object;)V

    move-wide p1, v0

    goto :goto_1

    :cond_1
    return-void
.end method
