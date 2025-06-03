.class public final Lh4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# instance fields
.field public final a:Lv5/u;

.field public b:Lc4/j;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:Lv4/b;

.field public h:Lc4/i;

.field public i:Lh4/c;

.field public j:Lk4/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/u;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Lh4/a;->a:Lv5/u;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lh4/a;->f:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lp4/a$b;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lh4/a;->c([Lp4/a$b;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh4/a;->b:Lc4/j;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lc4/j;->m()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh4/a;->b:Lc4/j;

    .line 16
    .line 17
    new-instance v1, Lc4/t$b;

    .line 18
    .line 19
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v3}, Lc4/t$b;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lc4/j;->t(Lc4/t;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    iput v0, p0, Lh4/a;->c:I

    .line 32
    .line 33
    return-void
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

.method public final b(Lc4/j;)V
    .locals 0

    iput-object p1, p0, Lh4/a;->b:Lc4/j;

    return-void
.end method

.method public final varargs c([Lp4/a$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/a;->b:Lc4/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x400

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-interface {v0, v1, v2}, Lc4/j;->r(II)Lc4/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lv3/i0$a;

    .line 14
    .line 15
    invoke-direct {v1}, Lv3/i0$a;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "image/jpeg"

    .line 19
    .line 20
    iput-object v2, v1, Lv3/i0$a;->j:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v2, Lp4/a;

    .line 23
    .line 24
    invoke-direct {v2, p1}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 25
    .line 26
    .line 27
    iput-object v2, v1, Lv3/i0$a;->i:Lp4/a;

    .line 28
    .line 29
    new-instance p1, Lv3/i0;

    .line 30
    .line 31
    invoke-direct {p1, v1}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p1}, Lc4/v;->d(Lv3/i0;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public final d(Lc4/i;Lc4/s;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lh4/a;->c:I

    .line 8
    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eqz v3, :cond_17

    .line 16
    .line 17
    if-eq v3, v8, :cond_16

    .line 18
    .line 19
    const/4 v10, -0x1

    .line 20
    if-eq v3, v7, :cond_a

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    if-eq v3, v6, :cond_5

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    if-ne v3, v1, :cond_0

    .line 29
    .line 30
    return v10

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iget-object v3, v0, Lh4/a;->i:Lh4/c;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v0, Lh4/a;->h:Lc4/i;

    .line 42
    .line 43
    if-eq v1, v3, :cond_3

    .line 44
    .line 45
    :cond_2
    iput-object v1, v0, Lh4/a;->h:Lc4/i;

    .line 46
    .line 47
    new-instance v3, Lh4/c;

    .line 48
    .line 49
    iget-wide v4, v0, Lh4/a;->f:J

    .line 50
    .line 51
    invoke-direct {v3, v1, v4, v5}, Lh4/c;-><init>(Lc4/i;J)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Lh4/a;->i:Lh4/c;

    .line 55
    .line 56
    :cond_3
    iget-object v1, v0, Lh4/a;->j:Lk4/g;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, Lh4/a;->i:Lh4/c;

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Lk4/g;->d(Lc4/i;Lc4/s;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v8, :cond_4

    .line 68
    .line 69
    iget-wide v3, v2, Lc4/s;->a:J

    .line 70
    .line 71
    iget-wide v5, v0, Lh4/a;->f:J

    .line 72
    .line 73
    add-long/2addr v3, v5

    .line 74
    iput-wide v3, v2, Lc4/s;->a:J

    .line 75
    .line 76
    :cond_4
    return v1

    .line 77
    :cond_5
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    iget-wide v10, v0, Lh4/a;->f:J

    .line 82
    .line 83
    cmp-long v3, v5, v10

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iput-wide v10, v2, Lc4/s;->a:J

    .line 88
    .line 89
    return v8

    .line 90
    :cond_6
    iget-object v2, v0, Lh4/a;->a:Lv5/u;

    .line 91
    .line 92
    iget-object v2, v2, Lv5/u;->a:[B

    .line 93
    .line 94
    invoke-interface {v1, v2, v9, v8, v8}, Lc4/i;->c([BIIZ)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_7

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_7
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 102
    .line 103
    .line 104
    iget-object v2, v0, Lh4/a;->j:Lk4/g;

    .line 105
    .line 106
    if-nez v2, :cond_8

    .line 107
    .line 108
    new-instance v2, Lk4/g;

    .line 109
    .line 110
    invoke-direct {v2}, Lk4/g;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v2, v0, Lh4/a;->j:Lk4/g;

    .line 114
    .line 115
    :cond_8
    new-instance v2, Lh4/c;

    .line 116
    .line 117
    iget-wide v5, v0, Lh4/a;->f:J

    .line 118
    .line 119
    invoke-direct {v2, v1, v5, v6}, Lh4/c;-><init>(Lc4/i;J)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v0, Lh4/a;->i:Lh4/c;

    .line 123
    .line 124
    iget-object v1, v0, Lh4/a;->j:Lk4/g;

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Lk4/g;->i(Lc4/i;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_9

    .line 131
    .line 132
    iget-object v1, v0, Lh4/a;->j:Lk4/g;

    .line 133
    .line 134
    new-instance v2, Lh4/d;

    .line 135
    .line 136
    iget-wide v5, v0, Lh4/a;->f:J

    .line 137
    .line 138
    iget-object v3, v0, Lh4/a;->b:Lc4/j;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v5, v6, v3}, Lh4/d;-><init>(JLc4/j;)V

    .line 144
    .line 145
    .line 146
    iput-object v2, v1, Lk4/g;->r:Lc4/j;

    .line 147
    .line 148
    new-array v1, v8, [Lp4/a$b;

    .line 149
    .line 150
    iget-object v2, v0, Lh4/a;->g:Lv4/b;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    aput-object v2, v1, v9

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lh4/a;->c([Lp4/a$b;)V

    .line 158
    .line 159
    .line 160
    iput v4, v0, Lh4/a;->c:I

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_9
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lh4/a;->a()V

    .line 164
    .line 165
    .line 166
    :goto_1
    return v9

    .line 167
    :cond_a
    iget v2, v0, Lh4/a;->d:I

    .line 168
    .line 169
    const v3, 0xffe1

    .line 170
    .line 171
    .line 172
    if-ne v2, v3, :cond_14

    .line 173
    .line 174
    new-instance v2, Lv5/u;

    .line 175
    .line 176
    iget v3, v0, Lh4/a;->e:I

    .line 177
    .line 178
    invoke-direct {v2, v3}, Lv5/u;-><init>(I)V

    .line 179
    .line 180
    .line 181
    iget-object v3, v2, Lv5/u;->a:[B

    .line 182
    .line 183
    iget v6, v0, Lh4/a;->e:I

    .line 184
    .line 185
    invoke-interface {v1, v3, v9, v6}, Lc4/i;->readFully([BII)V

    .line 186
    .line 187
    .line 188
    iget-object v3, v0, Lh4/a;->g:Lv4/b;

    .line 189
    .line 190
    if-nez v3, :cond_15

    .line 191
    .line 192
    invoke-virtual {v2}, Lv5/u;->p()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    const-string v6, "http://ns.adobe.com/xap/1.0/"

    .line 197
    .line 198
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_15

    .line 203
    .line 204
    invoke-virtual {v2}, Lv5/u;->p()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    if-eqz v2, :cond_15

    .line 209
    .line 210
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 211
    .line 212
    .line 213
    move-result-wide v11

    .line 214
    cmp-long v1, v11, v4

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    if-nez v1, :cond_b

    .line 218
    .line 219
    goto/16 :goto_5

    .line 220
    .line 221
    :cond_b
    :try_start_0
    invoke-static {v2}, Lh4/e;->a(Ljava/lang/String;)Lh4/b;

    .line 222
    .line 223
    .line 224
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lv3/a1; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    goto :goto_2

    .line 226
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 227
    .line 228
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 229
    .line 230
    invoke-static {v1, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    move-object v1, v3

    .line 234
    :goto_2
    if-nez v1, :cond_c

    .line 235
    .line 236
    goto/16 :goto_5

    .line 237
    .line 238
    :cond_c
    iget-object v2, v1, Lh4/b;->b:Ljava/util/List;

    .line 239
    .line 240
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-ge v2, v7, :cond_d

    .line 245
    .line 246
    goto/16 :goto_5

    .line 247
    .line 248
    :cond_d
    iget-object v2, v1, Lh4/b;->b:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    add-int/2addr v2, v10

    .line 255
    move-wide v14, v4

    .line 256
    move-wide/from16 v16, v14

    .line 257
    .line 258
    move-wide/from16 v20, v16

    .line 259
    .line 260
    move-wide/from16 v22, v20

    .line 261
    .line 262
    move v6, v9

    .line 263
    :goto_3
    if-ltz v2, :cond_11

    .line 264
    .line 265
    iget-object v7, v1, Lh4/b;->b:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    check-cast v7, Lh4/b$a;

    .line 272
    .line 273
    iget-object v8, v7, Lh4/b$a;->a:Ljava/lang/String;

    .line 274
    .line 275
    const-string v10, "video/mp4"

    .line 276
    .line 277
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    or-int/2addr v6, v8

    .line 282
    if-nez v2, :cond_e

    .line 283
    .line 284
    const-wide/16 v18, 0x0

    .line 285
    .line 286
    iget-wide v7, v7, Lh4/b$a;->c:J

    .line 287
    .line 288
    sub-long/2addr v11, v7

    .line 289
    move-wide v7, v11

    .line 290
    move-wide/from16 v11, v18

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_e
    iget-wide v7, v7, Lh4/b$a;->b:J

    .line 294
    .line 295
    sub-long v7, v11, v7

    .line 296
    .line 297
    move-wide/from16 v24, v7

    .line 298
    .line 299
    move-wide v7, v11

    .line 300
    move-wide/from16 v11, v24

    .line 301
    .line 302
    :goto_4
    if-eqz v6, :cond_f

    .line 303
    .line 304
    cmp-long v10, v11, v7

    .line 305
    .line 306
    if-eqz v10, :cond_f

    .line 307
    .line 308
    sub-long v22, v7, v11

    .line 309
    .line 310
    move v6, v9

    .line 311
    move-wide/from16 v20, v11

    .line 312
    .line 313
    :cond_f
    if-nez v2, :cond_10

    .line 314
    .line 315
    move-wide/from16 v16, v7

    .line 316
    .line 317
    move-wide v14, v11

    .line 318
    :cond_10
    add-int/lit8 v2, v2, -0x1

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_11
    cmp-long v2, v20, v4

    .line 322
    .line 323
    if-eqz v2, :cond_13

    .line 324
    .line 325
    cmp-long v2, v22, v4

    .line 326
    .line 327
    if-eqz v2, :cond_13

    .line 328
    .line 329
    cmp-long v2, v14, v4

    .line 330
    .line 331
    if-eqz v2, :cond_13

    .line 332
    .line 333
    cmp-long v2, v16, v4

    .line 334
    .line 335
    if-nez v2, :cond_12

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_12
    new-instance v3, Lv4/b;

    .line 339
    .line 340
    iget-wide v1, v1, Lh4/b;->a:J

    .line 341
    .line 342
    move-object v13, v3

    .line 343
    move-wide/from16 v18, v1

    .line 344
    .line 345
    invoke-direct/range {v13 .. v23}, Lv4/b;-><init>(JJJJJ)V

    .line 346
    .line 347
    .line 348
    :cond_13
    :goto_5
    iput-object v3, v0, Lh4/a;->g:Lv4/b;

    .line 349
    .line 350
    if-eqz v3, :cond_15

    .line 351
    .line 352
    iget-wide v1, v3, Lv4/b;->d:J

    .line 353
    .line 354
    iput-wide v1, v0, Lh4/a;->f:J

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_14
    iget v2, v0, Lh4/a;->e:I

    .line 358
    .line 359
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 360
    .line 361
    .line 362
    :cond_15
    :goto_6
    iput v9, v0, Lh4/a;->c:I

    .line 363
    .line 364
    return v9

    .line 365
    :cond_16
    iget-object v2, v0, Lh4/a;->a:Lv5/u;

    .line 366
    .line 367
    invoke-virtual {v2, v7}, Lv5/u;->D(I)V

    .line 368
    .line 369
    .line 370
    iget-object v2, v0, Lh4/a;->a:Lv5/u;

    .line 371
    .line 372
    iget-object v2, v2, Lv5/u;->a:[B

    .line 373
    .line 374
    invoke-interface {v1, v2, v9, v7}, Lc4/i;->readFully([BII)V

    .line 375
    .line 376
    .line 377
    iget-object v1, v0, Lh4/a;->a:Lv5/u;

    .line 378
    .line 379
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    sub-int/2addr v1, v7

    .line 384
    iput v1, v0, Lh4/a;->e:I

    .line 385
    .line 386
    iput v7, v0, Lh4/a;->c:I

    .line 387
    .line 388
    return v9

    .line 389
    :cond_17
    iget-object v2, v0, Lh4/a;->a:Lv5/u;

    .line 390
    .line 391
    invoke-virtual {v2, v7}, Lv5/u;->D(I)V

    .line 392
    .line 393
    .line 394
    iget-object v2, v0, Lh4/a;->a:Lv5/u;

    .line 395
    .line 396
    iget-object v2, v2, Lv5/u;->a:[B

    .line 397
    .line 398
    invoke-interface {v1, v2, v9, v7}, Lc4/i;->readFully([BII)V

    .line 399
    .line 400
    .line 401
    iget-object v1, v0, Lh4/a;->a:Lv5/u;

    .line 402
    .line 403
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    iput v1, v0, Lh4/a;->d:I

    .line 408
    .line 409
    const v2, 0xffda

    .line 410
    .line 411
    .line 412
    if-ne v1, v2, :cond_19

    .line 413
    .line 414
    iget-wide v1, v0, Lh4/a;->f:J

    .line 415
    .line 416
    cmp-long v1, v1, v4

    .line 417
    .line 418
    if-eqz v1, :cond_18

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_18
    invoke-virtual/range {p0 .. p0}, Lh4/a;->a()V

    .line 422
    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_19
    const v2, 0xffd0

    .line 426
    .line 427
    .line 428
    if-lt v1, v2, :cond_1a

    .line 429
    .line 430
    const v2, 0xffd9

    .line 431
    .line 432
    .line 433
    if-le v1, v2, :cond_1b

    .line 434
    .line 435
    :cond_1a
    const v2, 0xff01

    .line 436
    .line 437
    .line 438
    if-eq v1, v2, :cond_1b

    .line 439
    .line 440
    move v6, v8

    .line 441
    :goto_7
    iput v6, v0, Lh4/a;->c:I

    .line 442
    .line 443
    :cond_1b
    :goto_8
    return v9
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

.method public final e(Lc4/e;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lv5/u;->D(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 8
    .line 9
    iget-object v0, v0, Lv5/u;->a:[B

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v0, v2, v1, v2}, Lc4/e;->c([BIIZ)Z

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lh4/a;->a:Lv5/u;

    .line 16
    .line 17
    invoke-virtual {p1}, Lv5/u;->A()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method public final f(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lh4/a;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lh4/a;->j:Lk4/g;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, Lh4/a;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lh4/a;->j:Lk4/g;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Lk4/g;->f(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
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

.method public final i(Lc4/i;)Z
    .locals 6

    .line 1
    check-cast p1, Lc4/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh4/a;->e(Lc4/e;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const v2, 0xffd8

    .line 9
    .line 10
    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lh4/a;->e(Lc4/e;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lh4/a;->d:I

    .line 19
    .line 20
    const v2, 0xffe0

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    if-ne v0, v2, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lv5/u;->D(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 32
    .line 33
    iget-object v0, v0, Lv5/u;->a:[B

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, v3, v1}, Lc4/e;->c([BIIZ)Z

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 39
    .line 40
    invoke-virtual {v0}, Lv5/u;->A()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sub-int/2addr v0, v3

    .line 45
    invoke-virtual {p1, v0, v1}, Lc4/e;->k(IZ)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lh4/a;->e(Lc4/e;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lh4/a;->d:I

    .line 53
    .line 54
    :cond_1
    iget v0, p0, Lh4/a;->d:I

    .line 55
    .line 56
    const v2, 0xffe1

    .line 57
    .line 58
    .line 59
    if-eq v0, v2, :cond_2

    .line 60
    .line 61
    return v1

    .line 62
    :cond_2
    invoke-virtual {p1, v3, v1}, Lc4/e;->k(IZ)Z

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 66
    .line 67
    const/4 v2, 0x6

    .line 68
    invoke-virtual {v0, v2}, Lv5/u;->D(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lh4/a;->a:Lv5/u;

    .line 72
    .line 73
    iget-object v0, v0, Lv5/u;->a:[B

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lh4/a;->a:Lv5/u;

    .line 79
    .line 80
    invoke-virtual {p1}, Lv5/u;->w()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    .line 85
    .line 86
    .line 87
    cmp-long p1, v2, v4

    .line 88
    .line 89
    if-nez p1, :cond_3

    .line 90
    .line 91
    iget-object p1, p0, Lh4/a;->a:Lv5/u;

    .line 92
    .line 93
    invoke-virtual {p1}, Lv5/u;->A()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_3

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    :cond_3
    return v1
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
.end method

.method public final release()V
    .locals 1

    iget-object v0, p0, Lh4/a;->j:Lk4/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
