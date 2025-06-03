.class public final Lm4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# static fields
.field public static final v:[B


# instance fields
.field public final a:Z

.field public final b:Lv5/t;

.field public final c:Lv5/u;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Lc4/v;

.field public g:Lc4/v;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:Lc4/v;

.field public u:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lm4/f;->v:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv5/t;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lv5/t;-><init>([BI)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lm4/f;->b:Lv5/t;

    .line 13
    .line 14
    new-instance v0, Lv5/u;

    .line 15
    .line 16
    sget-object v1, Lm4/f;->v:[B

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lv5/u;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lm4/f;->c:Lv5/u;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lm4/f;->h:I

    .line 31
    .line 32
    iput v0, p0, Lm4/f;->i:I

    .line 33
    .line 34
    const/16 v0, 0x100

    .line 35
    .line 36
    iput v0, p0, Lm4/f;->j:I

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    iput v0, p0, Lm4/f;->m:I

    .line 40
    .line 41
    iput v0, p0, Lm4/f;->n:I

    .line 42
    .line 43
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide v0, p0, Lm4/f;->q:J

    .line 49
    .line 50
    iput-wide v0, p0, Lm4/f;->s:J

    .line 51
    .line 52
    iput-boolean p2, p0, Lm4/f;->a:Z

    .line 53
    .line 54
    iput-object p1, p0, Lm4/f;->d:Ljava/lang/String;

    .line 55
    .line 56
    return-void
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


# virtual methods
.method public final a(Lv5/u;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/f;->f:Lc4/v;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget v2, Lv5/e0;->a:I

    .line 11
    .line 12
    :cond_0
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
    if-lez v4, :cond_2d

    .line 19
    .line 20
    iget v5, v0, Lm4/f;->h:I

    .line 21
    .line 22
    const/16 v6, 0xd

    .line 23
    .line 24
    const/4 v7, -0x1

    .line 25
    const/4 v8, 0x7

    .line 26
    const/16 v9, 0x100

    .line 27
    .line 28
    const/4 v10, 0x4

    .line 29
    const/4 v11, 0x3

    .line 30
    const/4 v12, 0x2

    .line 31
    const/4 v13, 0x1

    .line 32
    const/4 v14, 0x0

    .line 33
    if-eqz v5, :cond_d

    .line 34
    .line 35
    if-eq v5, v13, :cond_9

    .line 36
    .line 37
    const/16 v2, 0xa

    .line 38
    .line 39
    if-eq v5, v12, :cond_8

    .line 40
    .line 41
    if-eq v5, v11, :cond_3

    .line 42
    .line 43
    if-ne v5, v10, :cond_2

    .line 44
    .line 45
    iget v2, v0, Lm4/f;->r:I

    .line 46
    .line 47
    iget v3, v0, Lm4/f;->i:I

    .line 48
    .line 49
    sub-int/2addr v2, v3

    .line 50
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iget-object v3, v0, Lm4/f;->t:Lc4/v;

    .line 55
    .line 56
    invoke-interface {v3, v2, v1}, Lc4/v;->b(ILv5/u;)V

    .line 57
    .line 58
    .line 59
    iget v3, v0, Lm4/f;->i:I

    .line 60
    .line 61
    add-int/2addr v3, v2

    .line 62
    iput v3, v0, Lm4/f;->i:I

    .line 63
    .line 64
    iget v2, v0, Lm4/f;->r:I

    .line 65
    .line 66
    if-ne v3, v2, :cond_0

    .line 67
    .line 68
    iget-wide v3, v0, Lm4/f;->s:J

    .line 69
    .line 70
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    cmp-long v5, v3, v5

    .line 76
    .line 77
    if-eqz v5, :cond_1

    .line 78
    .line 79
    iget-object v15, v0, Lm4/f;->t:Lc4/v;

    .line 80
    .line 81
    const/16 v18, 0x1

    .line 82
    .line 83
    const/16 v20, 0x0

    .line 84
    .line 85
    const/16 v21, 0x0

    .line 86
    .line 87
    move-wide/from16 v16, v3

    .line 88
    .line 89
    move/from16 v19, v2

    .line 90
    .line 91
    invoke-interface/range {v15 .. v21}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 92
    .line 93
    .line 94
    iget-wide v2, v0, Lm4/f;->s:J

    .line 95
    .line 96
    iget-wide v4, v0, Lm4/f;->u:J

    .line 97
    .line 98
    add-long/2addr v2, v4

    .line 99
    iput-wide v2, v0, Lm4/f;->s:J

    .line 100
    .line 101
    :cond_1
    iput v14, v0, Lm4/f;->h:I

    .line 102
    .line 103
    iput v14, v0, Lm4/f;->i:I

    .line 104
    .line 105
    iput v9, v0, Lm4/f;->j:I

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_3
    iget-boolean v3, v0, Lm4/f;->k:Z

    .line 115
    .line 116
    const/4 v4, 0x5

    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move v8, v4

    .line 121
    :goto_1
    iget-object v3, v0, Lm4/f;->b:Lv5/t;

    .line 122
    .line 123
    iget-object v3, v3, Lv5/t;->a:[B

    .line 124
    .line 125
    invoke-virtual {v0, v8, v1, v3}, Lm4/f;->f(ILv5/u;[B)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_0

    .line 130
    .line 131
    iget-object v3, v0, Lm4/f;->b:Lv5/t;

    .line 132
    .line 133
    invoke-virtual {v3, v14}, Lv5/t;->k(I)V

    .line 134
    .line 135
    .line 136
    iget-boolean v3, v0, Lm4/f;->p:Z

    .line 137
    .line 138
    if-nez v3, :cond_6

    .line 139
    .line 140
    iget-object v2, v0, Lm4/f;->b:Lv5/t;

    .line 141
    .line 142
    invoke-virtual {v2, v12}, Lv5/t;->g(I)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    add-int/2addr v2, v13

    .line 147
    if-eq v2, v12, :cond_5

    .line 148
    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v5, "Detected audio object type: "

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v2, ", but assuming AAC LC."

    .line 163
    .line 164
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-string v3, "AdtsReader"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move v2, v12

    .line 177
    :cond_5
    iget-object v3, v0, Lm4/f;->b:Lv5/t;

    .line 178
    .line 179
    invoke-virtual {v3, v4}, Lv5/t;->m(I)V

    .line 180
    .line 181
    .line 182
    iget-object v3, v0, Lm4/f;->b:Lv5/t;

    .line 183
    .line 184
    invoke-virtual {v3, v11}, Lv5/t;->g(I)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iget v5, v0, Lm4/f;->n:I

    .line 189
    .line 190
    invoke-static {v2, v5, v3}, Lx3/a;->a(III)[B

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    new-instance v3, Lv5/t;

    .line 195
    .line 196
    invoke-direct {v3, v2, v12}, Lv5/t;-><init>([BI)V

    .line 197
    .line 198
    .line 199
    invoke-static {v3, v14}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    new-instance v5, Lv3/i0$a;

    .line 204
    .line 205
    invoke-direct {v5}, Lv3/i0$a;-><init>()V

    .line 206
    .line 207
    .line 208
    iget-object v7, v0, Lm4/f;->e:Ljava/lang/String;

    .line 209
    .line 210
    iput-object v7, v5, Lv3/i0$a;->a:Ljava/lang/String;

    .line 211
    .line 212
    const-string v7, "audio/mp4a-latm"

    .line 213
    .line 214
    iput-object v7, v5, Lv3/i0$a;->k:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v7, v3, Lx3/a$a;->c:Ljava/lang/String;

    .line 217
    .line 218
    iput-object v7, v5, Lv3/i0$a;->h:Ljava/lang/String;

    .line 219
    .line 220
    iget v7, v3, Lx3/a$a;->b:I

    .line 221
    .line 222
    iput v7, v5, Lv3/i0$a;->x:I

    .line 223
    .line 224
    iget v3, v3, Lx3/a$a;->a:I

    .line 225
    .line 226
    iput v3, v5, Lv3/i0$a;->y:I

    .line 227
    .line 228
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    iput-object v2, v5, Lv3/i0$a;->m:Ljava/util/List;

    .line 233
    .line 234
    iget-object v2, v0, Lm4/f;->d:Ljava/lang/String;

    .line 235
    .line 236
    iput-object v2, v5, Lv3/i0$a;->c:Ljava/lang/String;

    .line 237
    .line 238
    new-instance v2, Lv3/i0;

    .line 239
    .line 240
    invoke-direct {v2, v5}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 241
    .line 242
    .line 243
    const-wide/32 v7, 0x3d090000

    .line 244
    .line 245
    .line 246
    iget v3, v2, Lv3/i0;->H:I

    .line 247
    .line 248
    int-to-long v14, v3

    .line 249
    div-long/2addr v7, v14

    .line 250
    iput-wide v7, v0, Lm4/f;->q:J

    .line 251
    .line 252
    iget-object v3, v0, Lm4/f;->f:Lc4/v;

    .line 253
    .line 254
    invoke-interface {v3, v2}, Lc4/v;->d(Lv3/i0;)V

    .line 255
    .line 256
    .line 257
    iput-boolean v13, v0, Lm4/f;->p:Z

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_6
    iget-object v3, v0, Lm4/f;->b:Lv5/t;

    .line 261
    .line 262
    invoke-virtual {v3, v2}, Lv5/t;->m(I)V

    .line 263
    .line 264
    .line 265
    :goto_2
    iget-object v2, v0, Lm4/f;->b:Lv5/t;

    .line 266
    .line 267
    invoke-virtual {v2, v10}, Lv5/t;->m(I)V

    .line 268
    .line 269
    .line 270
    iget-object v2, v0, Lm4/f;->b:Lv5/t;

    .line 271
    .line 272
    invoke-virtual {v2, v6}, Lv5/t;->g(I)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    sub-int/2addr v2, v12

    .line 277
    sub-int/2addr v2, v4

    .line 278
    iget-boolean v3, v0, Lm4/f;->k:Z

    .line 279
    .line 280
    if-eqz v3, :cond_7

    .line 281
    .line 282
    add-int/lit8 v2, v2, -0x2

    .line 283
    .line 284
    :cond_7
    iget-object v3, v0, Lm4/f;->f:Lc4/v;

    .line 285
    .line 286
    iget-wide v6, v0, Lm4/f;->q:J

    .line 287
    .line 288
    iput v10, v0, Lm4/f;->h:I

    .line 289
    .line 290
    const/4 v4, 0x0

    .line 291
    iput v4, v0, Lm4/f;->i:I

    .line 292
    .line 293
    iput-object v3, v0, Lm4/f;->t:Lc4/v;

    .line 294
    .line 295
    iput-wide v6, v0, Lm4/f;->u:J

    .line 296
    .line 297
    iput v2, v0, Lm4/f;->r:I

    .line 298
    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :cond_8
    iget-object v3, v0, Lm4/f;->c:Lv5/u;

    .line 302
    .line 303
    iget-object v3, v3, Lv5/u;->a:[B

    .line 304
    .line 305
    invoke-virtual {v0, v2, v1, v3}, Lm4/f;->f(ILv5/u;[B)Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_0

    .line 310
    .line 311
    iget-object v3, v0, Lm4/f;->g:Lc4/v;

    .line 312
    .line 313
    iget-object v4, v0, Lm4/f;->c:Lv5/u;

    .line 314
    .line 315
    invoke-interface {v3, v2, v4}, Lc4/v;->b(ILv5/u;)V

    .line 316
    .line 317
    .line 318
    iget-object v3, v0, Lm4/f;->c:Lv5/u;

    .line 319
    .line 320
    const/4 v4, 0x6

    .line 321
    invoke-virtual {v3, v4}, Lv5/u;->G(I)V

    .line 322
    .line 323
    .line 324
    iget-object v3, v0, Lm4/f;->g:Lc4/v;

    .line 325
    .line 326
    iget-object v4, v0, Lm4/f;->c:Lv5/u;

    .line 327
    .line 328
    invoke-virtual {v4}, Lv5/u;->u()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    add-int/2addr v4, v2

    .line 333
    const-wide/16 v5, 0x0

    .line 334
    .line 335
    iput v10, v0, Lm4/f;->h:I

    .line 336
    .line 337
    iput v2, v0, Lm4/f;->i:I

    .line 338
    .line 339
    iput-object v3, v0, Lm4/f;->t:Lc4/v;

    .line 340
    .line 341
    iput-wide v5, v0, Lm4/f;->u:J

    .line 342
    .line 343
    iput v4, v0, Lm4/f;->r:I

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_9
    if-nez v4, :cond_a

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_a
    iget-object v2, v0, Lm4/f;->b:Lv5/t;

    .line 352
    .line 353
    iget-object v4, v2, Lv5/t;->a:[B

    .line 354
    .line 355
    iget-object v6, v1, Lv5/u;->a:[B

    .line 356
    .line 357
    aget-byte v3, v6, v3

    .line 358
    .line 359
    const/4 v5, 0x0

    .line 360
    aput-byte v3, v4, v5

    .line 361
    .line 362
    invoke-virtual {v2, v12}, Lv5/t;->k(I)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v0, Lm4/f;->b:Lv5/t;

    .line 366
    .line 367
    invoke-virtual {v2, v10}, Lv5/t;->g(I)I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    iget v3, v0, Lm4/f;->n:I

    .line 372
    .line 373
    if-eq v3, v7, :cond_b

    .line 374
    .line 375
    if-eq v2, v3, :cond_b

    .line 376
    .line 377
    iput-boolean v5, v0, Lm4/f;->l:Z

    .line 378
    .line 379
    iput v5, v0, Lm4/f;->h:I

    .line 380
    .line 381
    iput v5, v0, Lm4/f;->i:I

    .line 382
    .line 383
    iput v9, v0, Lm4/f;->j:I

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_b
    iget-boolean v3, v0, Lm4/f;->l:Z

    .line 388
    .line 389
    if-nez v3, :cond_c

    .line 390
    .line 391
    iput-boolean v13, v0, Lm4/f;->l:Z

    .line 392
    .line 393
    iget v3, v0, Lm4/f;->o:I

    .line 394
    .line 395
    iput v3, v0, Lm4/f;->m:I

    .line 396
    .line 397
    iput v2, v0, Lm4/f;->n:I

    .line 398
    .line 399
    :cond_c
    iput v11, v0, Lm4/f;->h:I

    .line 400
    .line 401
    const/4 v2, 0x0

    .line 402
    iput v2, v0, Lm4/f;->i:I

    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_d
    iget-object v4, v1, Lv5/u;->a:[B

    .line 407
    .line 408
    :goto_3
    if-ge v3, v2, :cond_2c

    .line 409
    .line 410
    add-int/lit8 v14, v3, 0x1

    .line 411
    .line 412
    aget-byte v3, v4, v3

    .line 413
    .line 414
    and-int/lit16 v3, v3, 0xff

    .line 415
    .line 416
    iget v15, v0, Lm4/f;->j:I

    .line 417
    .line 418
    const/16 v5, 0x200

    .line 419
    .line 420
    if-ne v15, v5, :cond_25

    .line 421
    .line 422
    int-to-byte v15, v3

    .line 423
    and-int/lit16 v15, v15, 0xff

    .line 424
    .line 425
    const v17, 0xff00

    .line 426
    .line 427
    .line 428
    or-int v15, v15, v17

    .line 429
    .line 430
    const v18, 0xfff6

    .line 431
    .line 432
    .line 433
    and-int v15, v15, v18

    .line 434
    .line 435
    const v5, 0xfff0

    .line 436
    .line 437
    .line 438
    if-ne v15, v5, :cond_e

    .line 439
    .line 440
    move v15, v13

    .line 441
    goto :goto_4

    .line 442
    :cond_e
    const/4 v15, 0x0

    .line 443
    :goto_4
    if-eqz v15, :cond_25

    .line 444
    .line 445
    iget-boolean v15, v0, Lm4/f;->l:Z

    .line 446
    .line 447
    if-nez v15, :cond_22

    .line 448
    .line 449
    add-int/lit8 v15, v14, -0x2

    .line 450
    .line 451
    add-int/lit8 v9, v15, 0x1

    .line 452
    .line 453
    invoke-virtual {v1, v9}, Lv5/u;->G(I)V

    .line 454
    .line 455
    .line 456
    iget-object v9, v0, Lm4/f;->b:Lv5/t;

    .line 457
    .line 458
    iget-object v9, v9, Lv5/t;->a:[B

    .line 459
    .line 460
    iget v11, v1, Lv5/u;->c:I

    .line 461
    .line 462
    iget v5, v1, Lv5/u;->b:I

    .line 463
    .line 464
    sub-int/2addr v11, v5

    .line 465
    if-ge v11, v13, :cond_f

    .line 466
    .line 467
    const/16 v16, 0x0

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_f
    const/4 v5, 0x0

    .line 471
    invoke-virtual {v1, v9, v5, v13}, Lv5/u;->d([BII)V

    .line 472
    .line 473
    .line 474
    move/from16 v16, v13

    .line 475
    .line 476
    :goto_5
    if-nez v16, :cond_10

    .line 477
    .line 478
    :goto_6
    move v6, v7

    .line 479
    goto/16 :goto_d

    .line 480
    .line 481
    :cond_10
    iget-object v9, v0, Lm4/f;->b:Lv5/t;

    .line 482
    .line 483
    invoke-virtual {v9, v10}, Lv5/t;->k(I)V

    .line 484
    .line 485
    .line 486
    iget-object v9, v0, Lm4/f;->b:Lv5/t;

    .line 487
    .line 488
    invoke-virtual {v9, v13}, Lv5/t;->g(I)I

    .line 489
    .line 490
    .line 491
    move-result v9

    .line 492
    iget v11, v0, Lm4/f;->m:I

    .line 493
    .line 494
    if-eq v11, v7, :cond_11

    .line 495
    .line 496
    if-eq v9, v11, :cond_11

    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_11
    iget v11, v0, Lm4/f;->n:I

    .line 500
    .line 501
    if-eq v11, v7, :cond_15

    .line 502
    .line 503
    iget-object v11, v0, Lm4/f;->b:Lv5/t;

    .line 504
    .line 505
    iget-object v11, v11, Lv5/t;->a:[B

    .line 506
    .line 507
    iget v5, v1, Lv5/u;->c:I

    .line 508
    .line 509
    iget v7, v1, Lv5/u;->b:I

    .line 510
    .line 511
    sub-int/2addr v5, v7

    .line 512
    if-ge v5, v13, :cond_12

    .line 513
    .line 514
    const/16 v16, 0x0

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_12
    const/4 v5, 0x0

    .line 518
    invoke-virtual {v1, v11, v5, v13}, Lv5/u;->d([BII)V

    .line 519
    .line 520
    .line 521
    move/from16 v16, v13

    .line 522
    .line 523
    :goto_7
    if-nez v16, :cond_13

    .line 524
    .line 525
    goto :goto_9

    .line 526
    :cond_13
    iget-object v7, v0, Lm4/f;->b:Lv5/t;

    .line 527
    .line 528
    invoke-virtual {v7, v12}, Lv5/t;->k(I)V

    .line 529
    .line 530
    .line 531
    iget-object v7, v0, Lm4/f;->b:Lv5/t;

    .line 532
    .line 533
    invoke-virtual {v7, v10}, Lv5/t;->g(I)I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    iget v11, v0, Lm4/f;->n:I

    .line 538
    .line 539
    if-eq v7, v11, :cond_14

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_14
    add-int/lit8 v7, v15, 0x2

    .line 543
    .line 544
    invoke-virtual {v1, v7}, Lv5/u;->G(I)V

    .line 545
    .line 546
    .line 547
    :cond_15
    iget-object v7, v0, Lm4/f;->b:Lv5/t;

    .line 548
    .line 549
    iget-object v7, v7, Lv5/t;->a:[B

    .line 550
    .line 551
    iget v11, v1, Lv5/u;->c:I

    .line 552
    .line 553
    iget v5, v1, Lv5/u;->b:I

    .line 554
    .line 555
    sub-int/2addr v11, v5

    .line 556
    if-ge v11, v10, :cond_16

    .line 557
    .line 558
    const/16 v16, 0x0

    .line 559
    .line 560
    goto :goto_8

    .line 561
    :cond_16
    const/4 v5, 0x0

    .line 562
    invoke-virtual {v1, v7, v5, v10}, Lv5/u;->d([BII)V

    .line 563
    .line 564
    .line 565
    move/from16 v16, v13

    .line 566
    .line 567
    :goto_8
    if-nez v16, :cond_17

    .line 568
    .line 569
    :goto_9
    const/4 v6, -0x1

    .line 570
    goto :goto_c

    .line 571
    :cond_17
    iget-object v7, v0, Lm4/f;->b:Lv5/t;

    .line 572
    .line 573
    const/16 v11, 0xe

    .line 574
    .line 575
    invoke-virtual {v7, v11}, Lv5/t;->k(I)V

    .line 576
    .line 577
    .line 578
    iget-object v7, v0, Lm4/f;->b:Lv5/t;

    .line 579
    .line 580
    invoke-virtual {v7, v6}, Lv5/t;->g(I)I

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    if-ge v7, v8, :cond_18

    .line 585
    .line 586
    :goto_a
    const/4 v6, -0x1

    .line 587
    goto :goto_d

    .line 588
    :cond_18
    iget-object v11, v1, Lv5/u;->a:[B

    .line 589
    .line 590
    iget v5, v1, Lv5/u;->c:I

    .line 591
    .line 592
    add-int/2addr v15, v7

    .line 593
    if-lt v15, v5, :cond_19

    .line 594
    .line 595
    goto :goto_9

    .line 596
    :cond_19
    aget-byte v7, v11, v15

    .line 597
    .line 598
    const/4 v6, -0x1

    .line 599
    if-ne v7, v6, :cond_1c

    .line 600
    .line 601
    add-int/lit8 v15, v15, 0x1

    .line 602
    .line 603
    if-ne v15, v5, :cond_1a

    .line 604
    .line 605
    goto :goto_c

    .line 606
    :cond_1a
    aget-byte v5, v11, v15

    .line 607
    .line 608
    and-int/lit16 v7, v5, 0xff

    .line 609
    .line 610
    or-int v7, v7, v17

    .line 611
    .line 612
    and-int v7, v7, v18

    .line 613
    .line 614
    const v11, 0xfff0

    .line 615
    .line 616
    .line 617
    if-ne v7, v11, :cond_1b

    .line 618
    .line 619
    move v7, v13

    .line 620
    goto :goto_b

    .line 621
    :cond_1b
    const/4 v7, 0x0

    .line 622
    :goto_b
    if-eqz v7, :cond_21

    .line 623
    .line 624
    and-int/lit8 v5, v5, 0x8

    .line 625
    .line 626
    const/4 v7, 0x3

    .line 627
    shr-int/2addr v5, v7

    .line 628
    if-ne v5, v9, :cond_21

    .line 629
    .line 630
    goto :goto_c

    .line 631
    :cond_1c
    const/16 v9, 0x49

    .line 632
    .line 633
    if-eq v7, v9, :cond_1d

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_1d
    add-int/lit8 v7, v15, 0x1

    .line 637
    .line 638
    if-ne v7, v5, :cond_1e

    .line 639
    .line 640
    goto :goto_c

    .line 641
    :cond_1e
    aget-byte v7, v11, v7

    .line 642
    .line 643
    const/16 v9, 0x44

    .line 644
    .line 645
    if-eq v7, v9, :cond_1f

    .line 646
    .line 647
    goto :goto_d

    .line 648
    :cond_1f
    add-int/lit8 v15, v15, 0x2

    .line 649
    .line 650
    if-ne v15, v5, :cond_20

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :cond_20
    aget-byte v5, v11, v15

    .line 654
    .line 655
    const/16 v7, 0x33

    .line 656
    .line 657
    if-ne v5, v7, :cond_21

    .line 658
    .line 659
    :goto_c
    move v5, v13

    .line 660
    goto :goto_e

    .line 661
    :cond_21
    :goto_d
    const/4 v5, 0x0

    .line 662
    :goto_e
    if-eqz v5, :cond_26

    .line 663
    .line 664
    :cond_22
    and-int/lit8 v2, v3, 0x8

    .line 665
    .line 666
    const/4 v4, 0x3

    .line 667
    shr-int/2addr v2, v4

    .line 668
    iput v2, v0, Lm4/f;->o:I

    .line 669
    .line 670
    and-int/lit8 v2, v3, 0x1

    .line 671
    .line 672
    if-nez v2, :cond_23

    .line 673
    .line 674
    move v5, v13

    .line 675
    goto :goto_f

    .line 676
    :cond_23
    const/4 v5, 0x0

    .line 677
    :goto_f
    iput-boolean v5, v0, Lm4/f;->k:Z

    .line 678
    .line 679
    iget-boolean v2, v0, Lm4/f;->l:Z

    .line 680
    .line 681
    if-nez v2, :cond_24

    .line 682
    .line 683
    iput v13, v0, Lm4/f;->h:I

    .line 684
    .line 685
    const/4 v2, 0x0

    .line 686
    iput v2, v0, Lm4/f;->i:I

    .line 687
    .line 688
    goto :goto_10

    .line 689
    :cond_24
    const/4 v2, 0x0

    .line 690
    const/4 v3, 0x3

    .line 691
    iput v3, v0, Lm4/f;->h:I

    .line 692
    .line 693
    iput v2, v0, Lm4/f;->i:I

    .line 694
    .line 695
    goto :goto_10

    .line 696
    :cond_25
    move v6, v7

    .line 697
    :cond_26
    iget v7, v0, Lm4/f;->j:I

    .line 698
    .line 699
    or-int/2addr v3, v7

    .line 700
    const/16 v9, 0x149

    .line 701
    .line 702
    if-eq v3, v9, :cond_2b

    .line 703
    .line 704
    const/16 v9, 0x1ff

    .line 705
    .line 706
    if-eq v3, v9, :cond_2a

    .line 707
    .line 708
    const/16 v9, 0x344

    .line 709
    .line 710
    if-eq v3, v9, :cond_29

    .line 711
    .line 712
    const/16 v9, 0x433

    .line 713
    .line 714
    if-eq v3, v9, :cond_28

    .line 715
    .line 716
    const/16 v9, 0x100

    .line 717
    .line 718
    if-eq v7, v9, :cond_27

    .line 719
    .line 720
    iput v9, v0, Lm4/f;->j:I

    .line 721
    .line 722
    add-int/lit8 v14, v14, -0x1

    .line 723
    .line 724
    move v3, v14

    .line 725
    const/4 v5, 0x0

    .line 726
    const/4 v7, 0x3

    .line 727
    goto :goto_13

    .line 728
    :cond_27
    const/4 v5, 0x0

    .line 729
    const/4 v7, 0x3

    .line 730
    goto :goto_12

    .line 731
    :cond_28
    iput v12, v0, Lm4/f;->h:I

    .line 732
    .line 733
    const/4 v7, 0x3

    .line 734
    iput v7, v0, Lm4/f;->i:I

    .line 735
    .line 736
    const/4 v5, 0x0

    .line 737
    iput v5, v0, Lm4/f;->r:I

    .line 738
    .line 739
    iget-object v2, v0, Lm4/f;->c:Lv5/u;

    .line 740
    .line 741
    invoke-virtual {v2, v5}, Lv5/u;->G(I)V

    .line 742
    .line 743
    .line 744
    :goto_10
    invoke-virtual {v1, v14}, Lv5/u;->G(I)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_0

    .line 748
    .line 749
    :cond_29
    const/4 v5, 0x0

    .line 750
    const/4 v7, 0x3

    .line 751
    const/16 v9, 0x100

    .line 752
    .line 753
    const/16 v3, 0x400

    .line 754
    .line 755
    goto :goto_11

    .line 756
    :cond_2a
    const/4 v5, 0x0

    .line 757
    const/4 v7, 0x3

    .line 758
    const/16 v9, 0x100

    .line 759
    .line 760
    const/16 v3, 0x200

    .line 761
    .line 762
    goto :goto_11

    .line 763
    :cond_2b
    const/4 v5, 0x0

    .line 764
    const/4 v7, 0x3

    .line 765
    const/16 v9, 0x100

    .line 766
    .line 767
    const/16 v3, 0x300

    .line 768
    .line 769
    :goto_11
    iput v3, v0, Lm4/f;->j:I

    .line 770
    .line 771
    :goto_12
    move v3, v14

    .line 772
    :goto_13
    move v11, v7

    .line 773
    move v7, v6

    .line 774
    const/16 v6, 0xd

    .line 775
    .line 776
    goto/16 :goto_3

    .line 777
    .line 778
    :cond_2c
    invoke-virtual {v1, v3}, Lv5/u;->G(I)V

    .line 779
    .line 780
    .line 781
    goto/16 :goto_0

    .line 782
    .line 783
    :cond_2d
    return-void
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
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lm4/f;->s:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lm4/f;->l:Z

    .line 10
    .line 11
    iput v0, p0, Lm4/f;->h:I

    .line 12
    .line 13
    iput v0, p0, Lm4/f;->i:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, Lm4/f;->j:I

    .line 18
    .line 19
    return-void
    .line 20
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

    iput-wide p2, p0, Lm4/f;->s:J

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
    iput-object v0, p0, Lm4/f;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lm4/d0$d;->d:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lm4/f;->f:Lc4/v;

    .line 22
    .line 23
    iput-object v0, p0, Lm4/f;->t:Lc4/v;

    .line 24
    .line 25
    iget-boolean v0, p0, Lm4/f;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Lm4/d0$d;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 33
    .line 34
    .line 35
    iget v0, p2, Lm4/d0$d;->d:I

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lm4/f;->g:Lc4/v;

    .line 43
    .line 44
    new-instance v0, Lv3/i0$a;

    .line 45
    .line 46
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 50
    .line 51
    .line 52
    iget-object p2, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p2, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 55
    .line 56
    const-string p2, "application/id3"

    .line 57
    .line 58
    iput-object p2, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 59
    .line 60
    new-instance p2, Lv3/i0;

    .line 61
    .line 62
    invoke-direct {p2, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, Lc4/v;->d(Lv3/i0;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Lc4/g;

    .line 70
    .line 71
    invoke-direct {p1}, Lc4/g;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lm4/f;->g:Lc4/v;

    .line 75
    .line 76
    :goto_0
    return-void
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

.method public final f(ILv5/u;[B)Z
    .locals 2

    .line 1
    iget v0, p2, Lv5/u;->c:I

    .line 2
    .line 3
    iget v1, p2, Lv5/u;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget v1, p0, Lm4/f;->i:I

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
    iget v1, p0, Lm4/f;->i:I

    .line 15
    .line 16
    invoke-virtual {p2, p3, v1, v0}, Lv5/u;->d([BII)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lm4/f;->i:I

    .line 20
    .line 21
    add-int/2addr p2, v0

    .line 22
    iput p2, p0, Lm4/f;->i:I

    .line 23
    .line 24
    if-ne p2, p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    return p1
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
