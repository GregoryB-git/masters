.class public final Lb5/o;
.super Lb5/a;
.source "SourceFile"


# instance fields
.field public final o:I

.field public final p:Lv3/i0;

.field public q:J

.field public r:Z


# direct methods
.method public constructor <init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJILv3/i0;)V
    .locals 16

    move-object/from16 v14, p0

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v14, p10

    invoke-direct/range {v0 .. v15}, Lb5/a;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJJJ)V

    move/from16 v1, p12

    iput v1, v0, Lb5/o;->o:I

    move-object/from16 v1, p13

    iput-object v1, v0, Lb5/o;->p:Lv3/i0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .line 1
    iget-object v0, p0, Lb5/a;->m:Lb5/c;

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lb5/c;->b:[Lz4/b0;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x1

    .line 12
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v6, v1, v4

    .line 15
    .line 16
    iget-wide v7, v6, Lz4/b0;->F:J

    .line 17
    .line 18
    const-wide/16 v9, 0x0

    .line 19
    .line 20
    cmp-long v7, v7, v9

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    iput-wide v9, v6, Lz4/b0;->F:J

    .line 25
    .line 26
    iput-boolean v5, v6, Lz4/b0;->z:Z

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v1, p0, Lb5/o;->o:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lb5/c;->a(I)Lc4/v;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v0, p0, Lb5/o;->p:Lv3/i0;

    .line 38
    .line 39
    invoke-interface {v6, v0}, Lc4/v;->d(Lv3/i0;)V

    .line 40
    .line 41
    .line 42
    :try_start_0
    iget-object v0, p0, Lb5/e;->b:Lt5/n;

    .line 43
    .line 44
    iget-wide v1, p0, Lb5/o;->q:J

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Lt5/n;->a(J)Lt5/n;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lb5/e;->i:Lt5/j0;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lt5/j0;->a(Lt5/n;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    const-wide/16 v7, -0x1

    .line 57
    .line 58
    cmp-long v2, v0, v7

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    iget-wide v7, p0, Lb5/o;->q:J

    .line 63
    .line 64
    add-long/2addr v0, v7

    .line 65
    :cond_2
    move-wide v11, v0

    .line 66
    new-instance v0, Lc4/e;

    .line 67
    .line 68
    iget-object v8, p0, Lb5/e;->i:Lt5/j0;

    .line 69
    .line 70
    iget-wide v9, p0, Lb5/o;->q:J

    .line 71
    .line 72
    move-object v7, v0

    .line 73
    invoke-direct/range {v7 .. v12}, Lc4/e;-><init>(Lt5/h;JJ)V

    .line 74
    .line 75
    .line 76
    :goto_1
    const/4 v1, -0x1

    .line 77
    if-eq v3, v1, :cond_3

    .line 78
    .line 79
    iget-wide v1, p0, Lb5/o;->q:J

    .line 80
    .line 81
    int-to-long v3, v3

    .line 82
    add-long/2addr v1, v3

    .line 83
    iput-wide v1, p0, Lb5/o;->q:J

    .line 84
    .line 85
    const v1, 0x7fffffff

    .line 86
    .line 87
    .line 88
    invoke-interface {v6, v0, v1, v5}, Lc4/v;->e(Lt5/h;IZ)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-wide v0, p0, Lb5/o;->q:J

    .line 94
    .line 95
    long-to-int v10, v0

    .line 96
    iget-wide v7, p0, Lb5/e;->g:J

    .line 97
    .line 98
    const/4 v9, 0x1

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v12, 0x0

    .line 101
    invoke-interface/range {v6 .. v12}, Lc4/v;->c(JIIILc4/v$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 105
    .line 106
    invoke-static {v0}, Lb/z;->d(Lt5/k;)V

    .line 107
    .line 108
    .line 109
    iput-boolean v5, p0, Lb5/o;->r:Z

    .line 110
    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    iget-object v1, p0, Lb5/e;->i:Lt5/j0;

    .line 114
    .line 115
    invoke-static {v1}, Lb/z;->d(Lt5/k;)V

    .line 116
    .line 117
    .line 118
    throw v0
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
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lb5/o;->r:Z

    return v0
.end method
