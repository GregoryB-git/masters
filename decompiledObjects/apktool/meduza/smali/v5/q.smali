.class public final Lv5/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv5/q$b;,
        Lv5/q$a;,
        Lv5/q$c;
    }
.end annotation


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lv5/q;->a:[B

    const/16 v0, 0x11

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, Lv5/q;->b:[F

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv5/q;->c:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [I

    sput-object v0, Lv5/q;->d:[I

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static a([Z)V
    .locals 2

    const/4 v0, 0x0

    aput-boolean v0, p0, v0

    const/4 v1, 0x1

    aput-boolean v0, p0, v1

    const/4 v1, 0x2

    aput-boolean v0, p0, v1

    return-void
.end method

.method public static b([BII[Z)I
    .locals 8

    sub-int v0, p2, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, Lx6/b;->H(Z)V

    if-nez v0, :cond_1

    return p2

    :cond_1
    aget-boolean v3, p3, v1

    if-eqz v3, :cond_2

    invoke-static {p3}, Lv5/q;->a([Z)V

    add-int/lit8 p1, p1, -0x3

    return p1

    :cond_2
    const/4 v3, 0x2

    if-le v0, v2, :cond_3

    aget-boolean v4, p3, v2

    if-eqz v4, :cond_3

    aget-byte v4, p0, p1

    if-ne v4, v2, :cond_3

    invoke-static {p3}, Lv5/q;->a([Z)V

    sub-int/2addr p1, v3

    return p1

    :cond_3
    if-le v0, v3, :cond_4

    aget-boolean v4, p3, v3

    if-eqz v4, :cond_4

    aget-byte v4, p0, p1

    if-nez v4, :cond_4

    add-int/lit8 v4, p1, 0x1

    aget-byte v4, p0, v4

    if-ne v4, v2, :cond_4

    invoke-static {p3}, Lv5/q;->a([Z)V

    sub-int/2addr p1, v2

    return p1

    :cond_4
    add-int/lit8 v4, p2, -0x1

    add-int/2addr p1, v3

    :goto_1
    if-ge p1, v4, :cond_7

    aget-byte v5, p0, p1

    and-int/lit16 v6, v5, 0xfe

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v6, p1, -0x2

    aget-byte v7, p0, v6

    if-nez v7, :cond_6

    add-int/lit8 v7, p1, -0x1

    aget-byte v7, p0, v7

    if-nez v7, :cond_6

    if-ne v5, v2, :cond_6

    invoke-static {p3}, Lv5/q;->a([Z)V

    return v6

    :cond_6
    add-int/lit8 p1, p1, -0x2

    :goto_2
    add-int/lit8 p1, p1, 0x3

    goto :goto_1

    :cond_7
    if-le v0, v3, :cond_9

    add-int/lit8 p1, p2, -0x3

    aget-byte p1, p0, p1

    if-nez p1, :cond_8

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_8

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_8

    goto :goto_3

    :cond_8
    move p1, v1

    goto :goto_4

    :cond_9
    if-ne v0, v3, :cond_a

    aget-boolean p1, p3, v3

    if-eqz p1, :cond_8

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_8

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_8

    goto :goto_3

    :cond_a
    aget-boolean p1, p3, v2

    if-eqz p1, :cond_8

    aget-byte p1, p0, v4

    if-ne p1, v2, :cond_8

    :goto_3
    move p1, v2

    :goto_4
    aput-boolean p1, p3, v1

    if-le v0, v2, :cond_b

    add-int/lit8 p1, p2, -0x2

    aget-byte p1, p0, p1

    if-nez p1, :cond_c

    aget-byte p1, p0, v4

    if-nez p1, :cond_c

    goto :goto_5

    :cond_b
    aget-boolean p1, p3, v3

    if-eqz p1, :cond_c

    aget-byte p1, p0, v4

    if-nez p1, :cond_c

    :goto_5
    move p1, v2

    goto :goto_6

    :cond_c
    move p1, v1

    :goto_6
    aput-boolean p1, p3, v2

    aget-byte p0, p0, v4

    if-nez p0, :cond_d

    move v1, v2

    :cond_d
    aput-boolean v1, p3, v3

    return p2
.end method

.method public static c([BII)Lv5/q$a;
    .locals 25

    .line 1
    const/4 v0, 0x2

    .line 2
    add-int/lit8 v1, p1, 0x2

    .line 3
    .line 4
    new-instance v2, Lv5/v;

    .line 5
    .line 6
    move-object/from16 v3, p0

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v2, v3, v1, v4}, Lv5/v;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-virtual {v2, v1}, Lv5/v;->j(I)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-virtual {v2, v3}, Lv5/v;->e(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lv5/v;->e(I)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    const/4 v5, 0x5

    .line 34
    invoke-virtual {v2, v5}, Lv5/v;->e(I)I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    move v10, v5

    .line 41
    :goto_0
    const/16 v5, 0x20

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    if-ge v9, v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    shl-int v5, v11, v9

    .line 53
    .line 54
    or-int/2addr v10, v5

    .line 55
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v5, 0x6

    .line 59
    new-array v12, v5, [I

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    :goto_1
    const/16 v13, 0x8

    .line 63
    .line 64
    invoke-virtual {v2, v13}, Lv5/v;->e(I)I

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-ge v9, v5, :cond_2

    .line 69
    .line 70
    aput v13, v12, v9

    .line 71
    .line 72
    add-int/lit8 v9, v9, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v9, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    :goto_2
    if-ge v14, v4, :cond_5

    .line 78
    .line 79
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    if-eqz v15, :cond_3

    .line 84
    .line 85
    add-int/lit8 v9, v9, 0x59

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    if-eqz v15, :cond_4

    .line 92
    .line 93
    add-int/lit8 v9, v9, 0x8

    .line 94
    .line 95
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-virtual {v2, v9}, Lv5/v;->j(I)V

    .line 99
    .line 100
    .line 101
    if-lez v4, :cond_6

    .line 102
    .line 103
    rsub-int/lit8 v9, v4, 0x8

    .line 104
    .line 105
    mul-int/2addr v9, v0

    .line 106
    invoke-virtual {v2, v9}, Lv5/v;->j(I)V

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-ne v9, v3, :cond_7

    .line 117
    .line 118
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 119
    .line 120
    .line 121
    :cond_7
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 130
    .line 131
    .line 132
    move-result v16

    .line 133
    if-eqz v16, :cond_b

    .line 134
    .line 135
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 140
    .line 141
    .line 142
    move-result v17

    .line 143
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 144
    .line 145
    .line 146
    move-result v18

    .line 147
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 148
    .line 149
    .line 150
    move-result v19

    .line 151
    if-eq v9, v11, :cond_9

    .line 152
    .line 153
    if-ne v9, v0, :cond_8

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    move/from16 v20, v11

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    :goto_3
    move/from16 v20, v0

    .line 160
    .line 161
    :goto_4
    if-ne v9, v11, :cond_a

    .line 162
    .line 163
    move v9, v0

    .line 164
    goto :goto_5

    .line 165
    :cond_a
    move v9, v11

    .line 166
    :goto_5
    add-int v16, v16, v17

    .line 167
    .line 168
    mul-int v16, v16, v20

    .line 169
    .line 170
    sub-int v14, v14, v16

    .line 171
    .line 172
    add-int v18, v18, v19

    .line 173
    .line 174
    mul-int v18, v18, v9

    .line 175
    .line 176
    sub-int v15, v15, v18

    .line 177
    .line 178
    :cond_b
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    if-eqz v16, :cond_c

    .line 193
    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_c
    move/from16 v16, v4

    .line 198
    .line 199
    :goto_6
    move/from16 v1, v16

    .line 200
    .line 201
    :goto_7
    if-gt v1, v4, :cond_d

    .line 202
    .line 203
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 210
    .line 211
    .line 212
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_d
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_13

    .line 238
    .line 239
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_13

    .line 244
    .line 245
    const/4 v1, 0x0

    .line 246
    const/4 v4, 0x4

    .line 247
    :goto_8
    if-ge v1, v4, :cond_13

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    :goto_9
    if-ge v4, v5, :cond_12

    .line 251
    .line 252
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-nez v5, :cond_e

    .line 257
    .line 258
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 259
    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_e
    const/16 v5, 0x40

    .line 263
    .line 264
    shl-int/lit8 v16, v1, 0x1

    .line 265
    .line 266
    add-int/lit8 v16, v16, 0x4

    .line 267
    .line 268
    shl-int v0, v11, v16

    .line 269
    .line 270
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-le v1, v11, :cond_f

    .line 275
    .line 276
    invoke-virtual {v2}, Lv5/v;->g()I

    .line 277
    .line 278
    .line 279
    :cond_f
    const/4 v5, 0x0

    .line 280
    :goto_a
    if-ge v5, v0, :cond_10

    .line 281
    .line 282
    invoke-virtual {v2}, Lv5/v;->g()I

    .line 283
    .line 284
    .line 285
    add-int/lit8 v5, v5, 0x1

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_10
    :goto_b
    if-ne v1, v3, :cond_11

    .line 289
    .line 290
    move v0, v3

    .line 291
    goto :goto_c

    .line 292
    :cond_11
    move v0, v11

    .line 293
    :goto_c
    add-int/2addr v4, v0

    .line 294
    const/4 v5, 0x6

    .line 295
    const/4 v0, 0x2

    .line 296
    goto :goto_9

    .line 297
    :cond_12
    add-int/lit8 v1, v1, 0x1

    .line 298
    .line 299
    const/4 v4, 0x4

    .line 300
    const/4 v5, 0x6

    .line 301
    const/4 v0, 0x2

    .line 302
    goto :goto_8

    .line 303
    :cond_13
    invoke-virtual {v2, v0}, Lv5/v;->j(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_14

    .line 311
    .line 312
    const/16 v0, 0x8

    .line 313
    .line 314
    invoke-virtual {v2, v0}, Lv5/v;->j(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 324
    .line 325
    .line 326
    :cond_14
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    const/4 v1, 0x0

    .line 331
    new-array v3, v1, [I

    .line 332
    .line 333
    new-array v4, v1, [I

    .line 334
    .line 335
    move/from16 p1, v11

    .line 336
    .line 337
    const/4 v5, -0x1

    .line 338
    const/4 v11, -0x1

    .line 339
    :goto_d
    if-ge v1, v0, :cond_25

    .line 340
    .line 341
    if-eqz v1, :cond_15

    .line 342
    .line 343
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 344
    .line 345
    .line 346
    move-result v16

    .line 347
    if-eqz v16, :cond_15

    .line 348
    .line 349
    move/from16 v16, p1

    .line 350
    .line 351
    goto :goto_e

    .line 352
    :cond_15
    const/16 v16, 0x0

    .line 353
    .line 354
    :goto_e
    if-eqz v16, :cond_22

    .line 355
    .line 356
    move/from16 p1, v0

    .line 357
    .line 358
    add-int v0, v5, v11

    .line 359
    .line 360
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 361
    .line 362
    .line 363
    move-result v16

    .line 364
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 365
    .line 366
    .line 367
    move-result v17

    .line 368
    add-int/lit8 v17, v17, 0x1

    .line 369
    .line 370
    mul-int/lit8 v16, v16, 0x2

    .line 371
    .line 372
    rsub-int/lit8 v16, v16, 0x1

    .line 373
    .line 374
    mul-int v16, v16, v17

    .line 375
    .line 376
    move/from16 p2, v14

    .line 377
    .line 378
    add-int/lit8 v14, v0, 0x1

    .line 379
    .line 380
    move/from16 v17, v13

    .line 381
    .line 382
    new-array v13, v14, [Z

    .line 383
    .line 384
    const/16 v18, 0x0

    .line 385
    .line 386
    move-object/from16 v19, v12

    .line 387
    .line 388
    move/from16 v12, v18

    .line 389
    .line 390
    :goto_f
    if-gt v12, v0, :cond_17

    .line 391
    .line 392
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 393
    .line 394
    .line 395
    move-result v18

    .line 396
    if-nez v18, :cond_16

    .line 397
    .line 398
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 399
    .line 400
    .line 401
    move-result v18

    .line 402
    aput-boolean v18, v13, v12

    .line 403
    .line 404
    goto :goto_10

    .line 405
    :cond_16
    const/16 v18, 0x1

    .line 406
    .line 407
    aput-boolean v18, v13, v12

    .line 408
    .line 409
    :goto_10
    add-int/lit8 v12, v12, 0x1

    .line 410
    .line 411
    goto :goto_f

    .line 412
    :cond_17
    new-array v12, v14, [I

    .line 413
    .line 414
    new-array v14, v14, [I

    .line 415
    .line 416
    add-int/lit8 v18, v11, -0x1

    .line 417
    .line 418
    const/16 v20, 0x0

    .line 419
    .line 420
    :goto_11
    if-ltz v18, :cond_19

    .line 421
    .line 422
    aget v21, v4, v18

    .line 423
    .line 424
    add-int v21, v21, v16

    .line 425
    .line 426
    if-gez v21, :cond_18

    .line 427
    .line 428
    add-int v22, v5, v18

    .line 429
    .line 430
    aget-boolean v22, v13, v22

    .line 431
    .line 432
    if-eqz v22, :cond_18

    .line 433
    .line 434
    add-int/lit8 v22, v20, 0x1

    .line 435
    .line 436
    aput v21, v12, v20

    .line 437
    .line 438
    move/from16 v20, v22

    .line 439
    .line 440
    :cond_18
    add-int/lit8 v18, v18, -0x1

    .line 441
    .line 442
    goto :goto_11

    .line 443
    :cond_19
    if-gez v16, :cond_1a

    .line 444
    .line 445
    aget-boolean v18, v13, v0

    .line 446
    .line 447
    if-eqz v18, :cond_1a

    .line 448
    .line 449
    add-int/lit8 v18, v20, 0x1

    .line 450
    .line 451
    aput v16, v12, v20

    .line 452
    .line 453
    move/from16 v20, v18

    .line 454
    .line 455
    :cond_1a
    const/16 v18, 0x0

    .line 456
    .line 457
    move/from16 v21, v10

    .line 458
    .line 459
    move/from16 v10, v18

    .line 460
    .line 461
    move/from16 v18, v8

    .line 462
    .line 463
    move/from16 v8, v20

    .line 464
    .line 465
    :goto_12
    if-ge v10, v5, :cond_1c

    .line 466
    .line 467
    aget v20, v3, v10

    .line 468
    .line 469
    add-int v20, v20, v16

    .line 470
    .line 471
    if-gez v20, :cond_1b

    .line 472
    .line 473
    aget-boolean v22, v13, v10

    .line 474
    .line 475
    if-eqz v22, :cond_1b

    .line 476
    .line 477
    add-int/lit8 v22, v8, 0x1

    .line 478
    .line 479
    aput v20, v12, v8

    .line 480
    .line 481
    move/from16 v8, v22

    .line 482
    .line 483
    :cond_1b
    add-int/lit8 v10, v10, 0x1

    .line 484
    .line 485
    goto :goto_12

    .line 486
    :cond_1c
    invoke-static {v12, v8}, Ljava/util/Arrays;->copyOf([II)[I

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    add-int/lit8 v12, v5, -0x1

    .line 491
    .line 492
    const/16 v20, 0x0

    .line 493
    .line 494
    :goto_13
    if-ltz v12, :cond_1e

    .line 495
    .line 496
    aget v22, v3, v12

    .line 497
    .line 498
    add-int v22, v22, v16

    .line 499
    .line 500
    if-lez v22, :cond_1d

    .line 501
    .line 502
    aget-boolean v23, v13, v12

    .line 503
    .line 504
    if-eqz v23, :cond_1d

    .line 505
    .line 506
    add-int/lit8 v23, v20, 0x1

    .line 507
    .line 508
    aput v22, v14, v20

    .line 509
    .line 510
    move/from16 v20, v23

    .line 511
    .line 512
    :cond_1d
    add-int/lit8 v12, v12, -0x1

    .line 513
    .line 514
    goto :goto_13

    .line 515
    :cond_1e
    if-lez v16, :cond_1f

    .line 516
    .line 517
    aget-boolean v0, v13, v0

    .line 518
    .line 519
    if-eqz v0, :cond_1f

    .line 520
    .line 521
    add-int/lit8 v0, v20, 0x1

    .line 522
    .line 523
    aput v16, v14, v20

    .line 524
    .line 525
    move/from16 v20, v0

    .line 526
    .line 527
    :cond_1f
    const/4 v0, 0x0

    .line 528
    move/from16 v3, v20

    .line 529
    .line 530
    :goto_14
    if-ge v0, v11, :cond_21

    .line 531
    .line 532
    aget v12, v4, v0

    .line 533
    .line 534
    add-int v12, v12, v16

    .line 535
    .line 536
    if-lez v12, :cond_20

    .line 537
    .line 538
    add-int v20, v5, v0

    .line 539
    .line 540
    aget-boolean v20, v13, v20

    .line 541
    .line 542
    if-eqz v20, :cond_20

    .line 543
    .line 544
    add-int/lit8 v20, v3, 0x1

    .line 545
    .line 546
    aput v12, v14, v3

    .line 547
    .line 548
    move/from16 v3, v20

    .line 549
    .line 550
    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 551
    .line 552
    goto :goto_14

    .line 553
    :cond_21
    invoke-static {v14, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    move-object v4, v0

    .line 558
    move v11, v3

    .line 559
    move v5, v8

    .line 560
    move-object v3, v10

    .line 561
    goto :goto_17

    .line 562
    :cond_22
    move/from16 p1, v0

    .line 563
    .line 564
    move/from16 v18, v8

    .line 565
    .line 566
    move/from16 v21, v10

    .line 567
    .line 568
    move-object/from16 v19, v12

    .line 569
    .line 570
    move/from16 v17, v13

    .line 571
    .line 572
    move/from16 p2, v14

    .line 573
    .line 574
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    new-array v4, v0, [I

    .line 583
    .line 584
    const/4 v5, 0x0

    .line 585
    :goto_15
    if-ge v5, v0, :cond_23

    .line 586
    .line 587
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 588
    .line 589
    .line 590
    move-result v8

    .line 591
    add-int/lit8 v8, v8, 0x1

    .line 592
    .line 593
    aput v8, v4, v5

    .line 594
    .line 595
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 596
    .line 597
    .line 598
    add-int/lit8 v5, v5, 0x1

    .line 599
    .line 600
    goto :goto_15

    .line 601
    :cond_23
    const/4 v5, 0x1

    .line 602
    new-array v8, v3, [I

    .line 603
    .line 604
    const/4 v10, 0x0

    .line 605
    :goto_16
    if-ge v10, v3, :cond_24

    .line 606
    .line 607
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    add-int/2addr v11, v5

    .line 612
    aput v11, v8, v10

    .line 613
    .line 614
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 615
    .line 616
    .line 617
    add-int/lit8 v10, v10, 0x1

    .line 618
    .line 619
    const/4 v5, 0x1

    .line 620
    goto :goto_16

    .line 621
    :cond_24
    move v5, v0

    .line 622
    move v11, v3

    .line 623
    move-object v3, v4

    .line 624
    move-object v4, v8

    .line 625
    :goto_17
    add-int/lit8 v1, v1, 0x1

    .line 626
    .line 627
    const/4 v0, 0x1

    .line 628
    move/from16 v14, p2

    .line 629
    .line 630
    move/from16 v13, v17

    .line 631
    .line 632
    move/from16 v8, v18

    .line 633
    .line 634
    move-object/from16 v12, v19

    .line 635
    .line 636
    move/from16 v10, v21

    .line 637
    .line 638
    move/from16 v24, v0

    .line 639
    .line 640
    move/from16 v0, p1

    .line 641
    .line 642
    move/from16 p1, v24

    .line 643
    .line 644
    goto/16 :goto_d

    .line 645
    .line 646
    :cond_25
    move/from16 v18, v8

    .line 647
    .line 648
    move/from16 v21, v10

    .line 649
    .line 650
    move-object/from16 v19, v12

    .line 651
    .line 652
    move/from16 v17, v13

    .line 653
    .line 654
    move/from16 p2, v14

    .line 655
    .line 656
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_26

    .line 661
    .line 662
    const/4 v0, 0x0

    .line 663
    :goto_18
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    if-ge v0, v1, :cond_26

    .line 668
    .line 669
    add-int/lit8 v1, v9, 0x4

    .line 670
    .line 671
    add-int/lit8 v1, v1, 0x1

    .line 672
    .line 673
    invoke-virtual {v2, v1}, Lv5/v;->j(I)V

    .line 674
    .line 675
    .line 676
    add-int/lit8 v0, v0, 0x1

    .line 677
    .line 678
    goto :goto_18

    .line 679
    :cond_26
    const/4 v0, 0x1

    .line 680
    const/4 v1, 0x2

    .line 681
    invoke-virtual {v2, v1}, Lv5/v;->j(I)V

    .line 682
    .line 683
    .line 684
    const/high16 v3, 0x3f800000    # 1.0f

    .line 685
    .line 686
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 687
    .line 688
    .line 689
    move-result v4

    .line 690
    if-eqz v4, :cond_2f

    .line 691
    .line 692
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    if-eqz v4, :cond_29

    .line 697
    .line 698
    const/16 v4, 0x8

    .line 699
    .line 700
    invoke-virtual {v2, v4}, Lv5/v;->e(I)I

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    const/16 v5, 0xff

    .line 705
    .line 706
    if-ne v4, v5, :cond_27

    .line 707
    .line 708
    const/16 v4, 0x10

    .line 709
    .line 710
    invoke-virtual {v2, v4}, Lv5/v;->e(I)I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    invoke-virtual {v2, v4}, Lv5/v;->e(I)I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    if-eqz v5, :cond_29

    .line 719
    .line 720
    if-eqz v4, :cond_29

    .line 721
    .line 722
    int-to-float v3, v5

    .line 723
    int-to-float v4, v4

    .line 724
    div-float/2addr v3, v4

    .line 725
    goto :goto_19

    .line 726
    :cond_27
    sget-object v5, Lv5/q;->b:[F

    .line 727
    .line 728
    const/16 v8, 0x11

    .line 729
    .line 730
    if-ge v4, v8, :cond_28

    .line 731
    .line 732
    aget v3, v5, v4

    .line 733
    .line 734
    goto :goto_19

    .line 735
    :cond_28
    const-string v5, "Unexpected aspect_ratio_idc value: "

    .line 736
    .line 737
    const-string v8, "NalUnitUtil"

    .line 738
    .line 739
    invoke-static {v5, v4, v8}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 740
    .line 741
    .line 742
    :cond_29
    :goto_19
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    if-eqz v4, :cond_2a

    .line 747
    .line 748
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 749
    .line 750
    .line 751
    :cond_2a
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    if-eqz v4, :cond_2c

    .line 756
    .line 757
    const/4 v4, 0x3

    .line 758
    invoke-virtual {v2, v4}, Lv5/v;->j(I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 762
    .line 763
    .line 764
    move-result v4

    .line 765
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 766
    .line 767
    .line 768
    move-result v5

    .line 769
    if-eqz v5, :cond_2c

    .line 770
    .line 771
    const/16 v5, 0x8

    .line 772
    .line 773
    invoke-virtual {v2, v5}, Lv5/v;->e(I)I

    .line 774
    .line 775
    .line 776
    move-result v8

    .line 777
    invoke-virtual {v2, v5}, Lv5/v;->e(I)I

    .line 778
    .line 779
    .line 780
    move-result v9

    .line 781
    invoke-virtual {v2, v5}, Lv5/v;->j(I)V

    .line 782
    .line 783
    .line 784
    invoke-static {v8}, Lw5/b;->a(I)I

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    if-eqz v4, :cond_2b

    .line 789
    .line 790
    goto :goto_1a

    .line 791
    :cond_2b
    move v0, v1

    .line 792
    :goto_1a
    invoke-static {v9}, Lw5/b;->b(I)I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    goto :goto_1b

    .line 797
    :cond_2c
    const/4 v0, -0x1

    .line 798
    const/4 v1, -0x1

    .line 799
    const/4 v5, -0x1

    .line 800
    :goto_1b
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 801
    .line 802
    .line 803
    move-result v4

    .line 804
    if-eqz v4, :cond_2d

    .line 805
    .line 806
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 810
    .line 811
    .line 812
    :cond_2d
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    if-eqz v2, :cond_2e

    .line 820
    .line 821
    mul-int/lit8 v15, v15, 0x2

    .line 822
    .line 823
    :cond_2e
    move/from16 v16, v0

    .line 824
    .line 825
    move v14, v3

    .line 826
    move v13, v15

    .line 827
    move v15, v5

    .line 828
    goto :goto_1c

    .line 829
    :cond_2f
    move v14, v3

    .line 830
    move v13, v15

    .line 831
    const/4 v1, -0x1

    .line 832
    const/4 v15, -0x1

    .line 833
    const/16 v16, -0x1

    .line 834
    .line 835
    :goto_1c
    new-instance v0, Lv5/q$a;

    .line 836
    .line 837
    move-object v5, v0

    .line 838
    move/from16 v8, v18

    .line 839
    .line 840
    move/from16 v9, v21

    .line 841
    .line 842
    move-object/from16 v10, v19

    .line 843
    .line 844
    move/from16 v11, v17

    .line 845
    .line 846
    move/from16 v12, p2

    .line 847
    .line 848
    move/from16 v17, v1

    .line 849
    .line 850
    invoke-direct/range {v5 .. v17}, Lv5/q$a;-><init>(IZII[IIIIFIII)V

    .line 851
    .line 852
    .line 853
    return-object v0
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

.method public static d([BII)Lv5/q$c;
    .locals 21

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p1, 0x1

    .line 3
    .line 4
    new-instance v2, Lv5/v;

    .line 5
    .line 6
    move-object/from16 v3, p0

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v2, v3, v1, v4}, Lv5/v;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lv5/v;->e(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v2, v1}, Lv5/v;->e(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v2, v1}, Lv5/v;->e(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v3, 0x3

    .line 32
    const/16 v8, 0x64

    .line 33
    .line 34
    if-eq v4, v8, :cond_1

    .line 35
    .line 36
    const/16 v8, 0x6e

    .line 37
    .line 38
    if-eq v4, v8, :cond_1

    .line 39
    .line 40
    const/16 v8, 0x7a

    .line 41
    .line 42
    if-eq v4, v8, :cond_1

    .line 43
    .line 44
    const/16 v8, 0xf4

    .line 45
    .line 46
    if-eq v4, v8, :cond_1

    .line 47
    .line 48
    const/16 v8, 0x2c

    .line 49
    .line 50
    if-eq v4, v8, :cond_1

    .line 51
    .line 52
    const/16 v8, 0x53

    .line 53
    .line 54
    if-eq v4, v8, :cond_1

    .line 55
    .line 56
    const/16 v8, 0x56

    .line 57
    .line 58
    if-eq v4, v8, :cond_1

    .line 59
    .line 60
    const/16 v8, 0x76

    .line 61
    .line 62
    if-eq v4, v8, :cond_1

    .line 63
    .line 64
    const/16 v8, 0x80

    .line 65
    .line 66
    if-eq v4, v8, :cond_1

    .line 67
    .line 68
    const/16 v8, 0x8a

    .line 69
    .line 70
    if-ne v4, v8, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v3, 0x0

    .line 74
    move v8, v0

    .line 75
    move v11, v3

    .line 76
    goto :goto_7

    .line 77
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-ne v8, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v9, 0x0

    .line 89
    :goto_1
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_8

    .line 103
    .line 104
    if-eq v8, v3, :cond_3

    .line 105
    .line 106
    move v3, v1

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    const/16 v3, 0xc

    .line 109
    .line 110
    :goto_2
    const/4 v10, 0x0

    .line 111
    :goto_3
    if-ge v10, v3, :cond_8

    .line 112
    .line 113
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-eqz v11, :cond_7

    .line 118
    .line 119
    const/4 v11, 0x6

    .line 120
    if-ge v10, v11, :cond_4

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    const/16 v11, 0x40

    .line 126
    .line 127
    :goto_4
    const/4 v12, 0x0

    .line 128
    move v13, v1

    .line 129
    move v14, v13

    .line 130
    :goto_5
    if-ge v12, v11, :cond_7

    .line 131
    .line 132
    if-eqz v13, :cond_5

    .line 133
    .line 134
    invoke-virtual {v2}, Lv5/v;->g()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    add-int/2addr v13, v14

    .line 139
    add-int/lit16 v13, v13, 0x100

    .line 140
    .line 141
    rem-int/lit16 v13, v13, 0x100

    .line 142
    .line 143
    :cond_5
    if-nez v13, :cond_6

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    move v14, v13

    .line 147
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    move v11, v9

    .line 154
    :goto_7
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    add-int/lit8 v13, v3, 0x4

    .line 159
    .line 160
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-nez v14, :cond_9

    .line 165
    .line 166
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    add-int/lit8 v3, v3, 0x4

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_9
    if-ne v14, v0, :cond_b

    .line 174
    .line 175
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v2}, Lv5/v;->g()I

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Lv5/v;->g()I

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    int-to-long v9, v9

    .line 190
    const/4 v12, 0x0

    .line 191
    :goto_8
    int-to-long v0, v12

    .line 192
    cmp-long v0, v0, v9

    .line 193
    .line 194
    if-gez v0, :cond_a

    .line 195
    .line 196
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 197
    .line 198
    .line 199
    add-int/lit8 v12, v12, 0x1

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_a
    const/4 v0, 0x0

    .line 203
    move/from16 v16, v3

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_b
    const/4 v3, 0x0

    .line 207
    :goto_9
    const/4 v0, 0x0

    .line 208
    move/from16 v16, v0

    .line 209
    .line 210
    move v0, v3

    .line 211
    :goto_a
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    const/4 v3, 0x1

    .line 222
    add-int/2addr v1, v3

    .line 223
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    add-int/2addr v9, v3

    .line 228
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    rsub-int/lit8 v3, v12, 0x2

    .line 233
    .line 234
    mul-int/2addr v9, v3

    .line 235
    if-nez v12, :cond_c

    .line 236
    .line 237
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 238
    .line 239
    .line 240
    :cond_c
    invoke-virtual {v2}, Lv5/v;->i()V

    .line 241
    .line 242
    .line 243
    mul-int/lit8 v1, v1, 0x10

    .line 244
    .line 245
    mul-int/lit8 v9, v9, 0x10

    .line 246
    .line 247
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-eqz v10, :cond_10

    .line 252
    .line 253
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 258
    .line 259
    .line 260
    move-result v17

    .line 261
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 262
    .line 263
    .line 264
    move-result v18

    .line 265
    invoke-virtual {v2}, Lv5/v;->f()I

    .line 266
    .line 267
    .line 268
    move-result v19

    .line 269
    if-nez v8, :cond_d

    .line 270
    .line 271
    const/4 v15, 0x1

    .line 272
    goto :goto_c

    .line 273
    :cond_d
    const/16 v20, 0x2

    .line 274
    .line 275
    const/4 v15, 0x3

    .line 276
    if-ne v8, v15, :cond_e

    .line 277
    .line 278
    const/16 p1, 0x1

    .line 279
    .line 280
    goto :goto_b

    .line 281
    :cond_e
    move/from16 p1, v20

    .line 282
    .line 283
    :goto_b
    const/4 v15, 0x1

    .line 284
    if-ne v8, v15, :cond_f

    .line 285
    .line 286
    move/from16 v15, v20

    .line 287
    .line 288
    :cond_f
    mul-int/2addr v3, v15

    .line 289
    move/from16 v15, p1

    .line 290
    .line 291
    :goto_c
    add-int v10, v10, v17

    .line 292
    .line 293
    mul-int/2addr v10, v15

    .line 294
    sub-int/2addr v1, v10

    .line 295
    add-int v18, v18, v19

    .line 296
    .line 297
    mul-int v18, v18, v3

    .line 298
    .line 299
    sub-int v9, v9, v18

    .line 300
    .line 301
    :cond_10
    move v8, v1

    .line 302
    const/high16 v1, 0x3f800000    # 1.0f

    .line 303
    .line 304
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    if-eqz v3, :cond_13

    .line 309
    .line 310
    invoke-virtual {v2}, Lv5/v;->d()Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_13

    .line 315
    .line 316
    const/16 v3, 0x8

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Lv5/v;->e(I)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    const/16 v10, 0xff

    .line 323
    .line 324
    if-ne v3, v10, :cond_11

    .line 325
    .line 326
    const/16 v3, 0x10

    .line 327
    .line 328
    invoke-virtual {v2, v3}, Lv5/v;->e(I)I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    invoke-virtual {v2, v3}, Lv5/v;->e(I)I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-eqz v10, :cond_13

    .line 337
    .line 338
    if-eqz v2, :cond_13

    .line 339
    .line 340
    int-to-float v1, v10

    .line 341
    int-to-float v2, v2

    .line 342
    div-float/2addr v1, v2

    .line 343
    goto :goto_d

    .line 344
    :cond_11
    sget-object v2, Lv5/q;->b:[F

    .line 345
    .line 346
    const/16 v10, 0x11

    .line 347
    .line 348
    if-ge v3, v10, :cond_12

    .line 349
    .line 350
    aget v1, v2, v3

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_12
    const-string v2, "Unexpected aspect_ratio_idc value: "

    .line 354
    .line 355
    const-string v10, "NalUnitUtil"

    .line 356
    .line 357
    invoke-static {v2, v3, v10}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :cond_13
    :goto_d
    move v10, v1

    .line 361
    new-instance v1, Lv5/q$c;

    .line 362
    .line 363
    move-object v3, v1

    .line 364
    move v15, v0

    .line 365
    invoke-direct/range {v3 .. v16}, Lv5/q$c;-><init>(IIIIIIFZZIIIZ)V

    .line 366
    .line 367
    .line 368
    return-object v1
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

.method public static e([BI)I
    .locals 8

    .line 1
    sget-object v0, Lv5/q;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p1, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p1, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p0, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p0, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p0, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p1

    .line 35
    :goto_2
    if-ge v2, p1, :cond_0

    .line 36
    .line 37
    sget-object v4, Lv5/q;->d:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Lv5/q;->d:[I

    .line 50
    .line 51
    :cond_3
    sget-object v4, Lv5/q;->d:[I

    .line 52
    .line 53
    add-int/lit8 v5, v3, 0x1

    .line 54
    .line 55
    aput v2, v4, v3

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x3

    .line 58
    .line 59
    move v3, v5

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    sub-int/2addr p1, v3

    .line 62
    move v2, v1

    .line 63
    move v4, v2

    .line 64
    move v5, v4

    .line 65
    :goto_3
    if-ge v2, v3, :cond_5

    .line 66
    .line 67
    sget-object v6, Lv5/q;->d:[I

    .line 68
    .line 69
    aget v6, v6, v2

    .line 70
    .line 71
    sub-int/2addr v6, v5

    .line 72
    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    add-int/2addr v4, v6

    .line 76
    add-int/lit8 v7, v4, 0x1

    .line 77
    .line 78
    aput-byte v1, p0, v4

    .line 79
    .line 80
    add-int/lit8 v4, v7, 0x1

    .line 81
    .line 82
    aput-byte v1, p0, v7

    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x3

    .line 85
    .line 86
    add-int/2addr v5, v6

    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    sub-int v1, p1, v4

    .line 91
    .line 92
    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    monitor-exit v0

    .line 96
    return p1

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw p0
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
