.class public final Lokhttp3/CacheControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/CacheControl$Builder;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public m:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lokhttp3/CacheControl$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->a:Z

    .line 8
    .line 9
    new-instance v2, Lokhttp3/CacheControl;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lokhttp3/CacheControl;-><init>(Lokhttp3/CacheControl$Builder;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lokhttp3/CacheControl$Builder;

    .line 15
    .line 16
    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->e:Z

    .line 20
    .line 21
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const v2, 0x7fffffff

    .line 24
    .line 25
    .line 26
    int-to-long v3, v2

    .line 27
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-wide/32 v5, 0x7fffffff

    .line 32
    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    long-to-int v2, v3

    .line 40
    :goto_0
    iput v2, v0, Lokhttp3/CacheControl$Builder;->c:I

    .line 41
    .line 42
    new-instance v1, Lokhttp3/CacheControl;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lokhttp3/CacheControl;-><init>(Lokhttp3/CacheControl$Builder;)V

    .line 45
    .line 46
    .line 47
    return-void
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
.end method

.method public constructor <init>(Lokhttp3/CacheControl$Builder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lokhttp3/CacheControl$Builder;->a:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/CacheControl;->b:Z

    iget v1, p1, Lokhttp3/CacheControl$Builder;->b:I

    iput v1, p0, Lokhttp3/CacheControl;->c:I

    const/4 v1, -0x1

    iput v1, p0, Lokhttp3/CacheControl;->d:I

    iput-boolean v0, p0, Lokhttp3/CacheControl;->e:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->f:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->g:Z

    iget v1, p1, Lokhttp3/CacheControl$Builder;->c:I

    iput v1, p0, Lokhttp3/CacheControl;->h:I

    iget v1, p1, Lokhttp3/CacheControl$Builder;->d:I

    iput v1, p0, Lokhttp3/CacheControl;->i:I

    iget-boolean p1, p1, Lokhttp3/CacheControl$Builder;->e:Z

    iput-boolean p1, p0, Lokhttp3/CacheControl;->j:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->k:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->l:Z

    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lokhttp3/CacheControl;->a:Z

    iput-boolean p2, p0, Lokhttp3/CacheControl;->b:Z

    iput p3, p0, Lokhttp3/CacheControl;->c:I

    iput p4, p0, Lokhttp3/CacheControl;->d:I

    iput-boolean p5, p0, Lokhttp3/CacheControl;->e:Z

    iput-boolean p6, p0, Lokhttp3/CacheControl;->f:Z

    iput-boolean p7, p0, Lokhttp3/CacheControl;->g:Z

    iput p8, p0, Lokhttp3/CacheControl;->h:I

    iput p9, p0, Lokhttp3/CacheControl;->i:I

    iput-boolean p10, p0, Lokhttp3/CacheControl;->j:Z

    iput-boolean p11, p0, Lokhttp3/CacheControl;->k:Z

    iput-boolean p12, p0, Lokhttp3/CacheControl;->l:Z

    iput-object p13, p0, Lokhttp3/CacheControl;->m:Ljava/lang/String;

    return-void
.end method

.method public static a(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lokhttp3/Headers;->a:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    div-int/lit8 v1, v1, 0x2

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, -0x1

    .line 14
    const/4 v12, -0x1

    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v14, 0x0

    .line 17
    const/4 v15, 0x0

    .line 18
    const/16 v16, -0x1

    .line 19
    .line 20
    const/16 v17, -0x1

    .line 21
    .line 22
    const/16 v18, 0x0

    .line 23
    .line 24
    const/16 v19, 0x0

    .line 25
    .line 26
    const/16 v20, 0x0

    .line 27
    .line 28
    :goto_0
    if-ge v6, v1, :cond_13

    .line 29
    .line 30
    invoke-virtual {v0, v6}, Lokhttp3/Headers;->d(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v6}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const-string v3, "Cache-Control"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object v8, v4

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    const-string v3, "Pragma"

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_12

    .line 58
    .line 59
    :goto_1
    const/4 v7, 0x0

    .line 60
    :goto_2
    const/4 v2, 0x0

    .line 61
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_12

    .line 66
    .line 67
    const-string v3, "=,;"

    .line 68
    .line 69
    invoke-static {v2, v4, v3}, Lokhttp3/internal/http/HttpHeaders;->e(ILjava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eq v3, v5, :cond_5

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/16 v0, 0x2c

    .line 92
    .line 93
    if-eq v5, v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v5, 0x3b

    .line 100
    .line 101
    if-ne v0, v5, :cond_2

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-ge v3, v0, :cond_3

    .line 109
    .line 110
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/16 v5, 0x20

    .line 115
    .line 116
    if-eq v0, v5, :cond_2

    .line 117
    .line 118
    const/16 v5, 0x9

    .line 119
    .line 120
    if-eq v0, v5, :cond_2

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_3
    :goto_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ge v3, v0, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/16 v5, 0x22

    .line 137
    .line 138
    if-ne v0, v5, :cond_4

    .line 139
    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    const-string v0, "\""

    .line 143
    .line 144
    invoke-static {v3, v4, v0}, Lokhttp3/internal/http/HttpHeaders;->e(ILjava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {v4, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const/4 v5, 0x1

    .line 153
    add-int/2addr v0, v5

    .line 154
    goto :goto_7

    .line 155
    :cond_4
    const/4 v5, 0x1

    .line 156
    const-string v0, ",;"

    .line 157
    .line 158
    invoke-static {v3, v4, v0}, Lokhttp3/internal/http/HttpHeaders;->e(ILjava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {v4, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    goto :goto_7

    .line 171
    :cond_5
    :goto_6
    const/4 v5, 0x1

    .line 172
    add-int/lit8 v3, v3, 0x1

    .line 173
    .line 174
    move v0, v3

    .line 175
    const/4 v3, 0x0

    .line 176
    :goto_7
    const-string v5, "no-cache"

    .line 177
    .line 178
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_6

    .line 183
    .line 184
    const/4 v5, -0x1

    .line 185
    const/4 v9, 0x1

    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :cond_6
    const-string v5, "no-store"

    .line 189
    .line 190
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_7

    .line 195
    .line 196
    const/4 v5, -0x1

    .line 197
    const/4 v10, 0x1

    .line 198
    goto/16 :goto_8

    .line 199
    .line 200
    :cond_7
    const-string v5, "max-age"

    .line 201
    .line 202
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-eqz v5, :cond_8

    .line 207
    .line 208
    const/4 v5, -0x1

    .line 209
    invoke-static {v5, v3}, Lokhttp3/internal/http/HttpHeaders;->c(ILjava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :cond_8
    const-string v5, "s-maxage"

    .line 216
    .line 217
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-eqz v5, :cond_9

    .line 222
    .line 223
    const/4 v5, -0x1

    .line 224
    invoke-static {v5, v3}, Lokhttp3/internal/http/HttpHeaders;->c(ILjava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    goto :goto_8

    .line 229
    :cond_9
    const-string v5, "private"

    .line 230
    .line 231
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_a

    .line 236
    .line 237
    const/4 v5, -0x1

    .line 238
    const/4 v13, 0x1

    .line 239
    goto :goto_8

    .line 240
    :cond_a
    const-string v5, "public"

    .line 241
    .line 242
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-eqz v5, :cond_b

    .line 247
    .line 248
    const/4 v5, -0x1

    .line 249
    const/4 v14, 0x1

    .line 250
    goto :goto_8

    .line 251
    :cond_b
    const-string v5, "must-revalidate"

    .line 252
    .line 253
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_c

    .line 258
    .line 259
    const/4 v5, -0x1

    .line 260
    const/4 v15, 0x1

    .line 261
    goto :goto_8

    .line 262
    :cond_c
    const-string v5, "max-stale"

    .line 263
    .line 264
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_d

    .line 269
    .line 270
    const v2, 0x7fffffff

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v3}, Lokhttp3/internal/http/HttpHeaders;->c(ILjava/lang/String;)I

    .line 274
    .line 275
    .line 276
    move-result v16

    .line 277
    const/4 v5, -0x1

    .line 278
    goto :goto_8

    .line 279
    :cond_d
    const-string v5, "min-fresh"

    .line 280
    .line 281
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_e

    .line 286
    .line 287
    const/4 v5, -0x1

    .line 288
    invoke-static {v5, v3}, Lokhttp3/internal/http/HttpHeaders;->c(ILjava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v17

    .line 292
    goto :goto_8

    .line 293
    :cond_e
    const/4 v5, -0x1

    .line 294
    const-string v3, "only-if-cached"

    .line 295
    .line 296
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_f

    .line 301
    .line 302
    const/16 v18, 0x1

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_f
    const-string v3, "no-transform"

    .line 306
    .line 307
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_10

    .line 312
    .line 313
    const/16 v19, 0x1

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_10
    const-string v3, "immutable"

    .line 317
    .line 318
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_11

    .line 323
    .line 324
    const/16 v20, 0x1

    .line 325
    .line 326
    :cond_11
    :goto_8
    move v2, v0

    .line 327
    move-object/from16 v0, p0

    .line 328
    .line 329
    goto/16 :goto_3

    .line 330
    .line 331
    :cond_12
    const/4 v5, -0x1

    .line 332
    add-int/lit8 v6, v6, 0x1

    .line 333
    .line 334
    move-object/from16 v0, p0

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :cond_13
    if-nez v7, :cond_14

    .line 339
    .line 340
    const/16 v21, 0x0

    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_14
    move-object/from16 v21, v8

    .line 344
    .line 345
    :goto_9
    new-instance v0, Lokhttp3/CacheControl;

    .line 346
    .line 347
    move-object v8, v0

    .line 348
    invoke-direct/range {v8 .. v21}, Lokhttp3/CacheControl;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 349
    .line 350
    .line 351
    return-object v0
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


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/CacheControl;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lokhttp3/CacheControl;->a:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const-string v1, "no-cache, "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-boolean v1, p0, Lokhttp3/CacheControl;->b:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const-string v1, "no-store, "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_2
    iget v1, p0, Lokhttp3/CacheControl;->c:I

    .line 31
    .line 32
    const-string v2, ", "

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    if-eq v1, v3, :cond_3

    .line 36
    .line 37
    const-string v1, "max-age="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lokhttp3/CacheControl;->c:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v1, p0, Lokhttp3/CacheControl;->d:I

    .line 51
    .line 52
    if-eq v1, v3, :cond_4

    .line 53
    .line 54
    const-string v1, "s-maxage="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lokhttp3/CacheControl;->d:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :cond_4
    iget-boolean v1, p0, Lokhttp3/CacheControl;->e:Z

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    const-string v1, "private, "

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    :cond_5
    iget-boolean v1, p0, Lokhttp3/CacheControl;->f:Z

    .line 77
    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    const-string v1, "public, "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-boolean v1, p0, Lokhttp3/CacheControl;->g:Z

    .line 86
    .line 87
    if-eqz v1, :cond_7

    .line 88
    .line 89
    const-string v1, "must-revalidate, "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_7
    iget v1, p0, Lokhttp3/CacheControl;->h:I

    .line 95
    .line 96
    if-eq v1, v3, :cond_8

    .line 97
    .line 98
    const-string v1, "max-stale="

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget v1, p0, Lokhttp3/CacheControl;->h:I

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :cond_8
    iget v1, p0, Lokhttp3/CacheControl;->i:I

    .line 112
    .line 113
    if-eq v1, v3, :cond_9

    .line 114
    .line 115
    const-string v1, "min-fresh="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lokhttp3/CacheControl;->i:I

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_9
    iget-boolean v1, p0, Lokhttp3/CacheControl;->j:Z

    .line 129
    .line 130
    if-eqz v1, :cond_a

    .line 131
    .line 132
    const-string v1, "only-if-cached, "

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    :cond_a
    iget-boolean v1, p0, Lokhttp3/CacheControl;->k:Z

    .line 138
    .line 139
    if-eqz v1, :cond_b

    .line 140
    .line 141
    const-string v1, "no-transform, "

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_b
    iget-boolean v1, p0, Lokhttp3/CacheControl;->l:Z

    .line 147
    .line 148
    if-eqz v1, :cond_c

    .line 149
    .line 150
    const-string v1, "immutable, "

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_d

    .line 160
    .line 161
    const-string v0, ""

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/lit8 v1, v1, -0x2

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :goto_0
    iput-object v0, p0, Lokhttp3/CacheControl;->m:Ljava/lang/String;

    .line 182
    .line 183
    :goto_1
    return-object v0
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
.end method
