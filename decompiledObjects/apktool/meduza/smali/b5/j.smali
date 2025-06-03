.class public final Lb5/j;
.super Lb5/a;
.source "SourceFile"


# instance fields
.field public final o:I

.field public final p:J

.field public final q:Lb5/f;

.field public r:J

.field public volatile s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJJJIJLb5/f;)V
    .locals 3

    move-object v0, p0

    invoke-direct/range {p0 .. p15}, Lb5/a;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJJJ)V

    move/from16 v1, p16

    iput v1, v0, Lb5/j;->o:I

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lb5/j;->p:J

    move-object/from16 v1, p19

    iput-object v1, v0, Lb5/j;->q:Lb5/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .line 1
    iget-wide v0, p0, Lb5/j;->r:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iget-object v4, p0, Lb5/a;->m:Lb5/c;

    .line 12
    .line 13
    invoke-static {v4}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-wide v5, p0, Lb5/j;->p:J

    .line 17
    .line 18
    iget-object v0, v4, Lb5/c;->b:[Lz4/b0;

    .line 19
    .line 20
    array-length v3, v0

    .line 21
    move v7, v1

    .line 22
    :goto_0
    if-ge v7, v3, :cond_1

    .line 23
    .line 24
    aget-object v8, v0, v7

    .line 25
    .line 26
    iget-wide v9, v8, Lz4/b0;->F:J

    .line 27
    .line 28
    cmp-long v9, v9, v5

    .line 29
    .line 30
    if-eqz v9, :cond_0

    .line 31
    .line 32
    iput-wide v5, v8, Lz4/b0;->F:J

    .line 33
    .line 34
    iput-boolean v2, v8, Lz4/b0;->z:Z

    .line 35
    .line 36
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Lb5/j;->q:Lb5/f;

    .line 40
    .line 41
    iget-wide v5, p0, Lb5/a;->k:J

    .line 42
    .line 43
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmp-long v3, v5, v7

    .line 49
    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    move-wide v5, v7

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget-wide v9, p0, Lb5/j;->p:J

    .line 55
    .line 56
    sub-long/2addr v5, v9

    .line 57
    :goto_1
    iget-wide v9, p0, Lb5/a;->l:J

    .line 58
    .line 59
    cmp-long v3, v9, v7

    .line 60
    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-wide v7, p0, Lb5/j;->p:J

    .line 65
    .line 66
    sub-long/2addr v9, v7

    .line 67
    move-wide v7, v9

    .line 68
    :goto_2
    move-object v3, v0

    .line 69
    check-cast v3, Lb5/d;

    .line 70
    .line 71
    invoke-virtual/range {v3 .. v8}, Lb5/d;->a(Lb5/f$a;JJ)V

    .line 72
    .line 73
    .line 74
    :cond_4
    :try_start_0
    iget-object v0, p0, Lb5/e;->b:Lt5/n;

    .line 75
    .line 76
    iget-wide v3, p0, Lb5/j;->r:J

    .line 77
    .line 78
    invoke-virtual {v0, v3, v4}, Lt5/n;->a(J)Lt5/n;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v9, Lc4/e;

    .line 83
    .line 84
    iget-object v4, p0, Lb5/e;->i:Lt5/j0;

    .line 85
    .line 86
    iget-wide v5, v0, Lt5/n;->f:J

    .line 87
    .line 88
    invoke-virtual {v4, v0}, Lt5/j0;->a(Lt5/n;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    move-object v3, v9

    .line 93
    invoke-direct/range {v3 .. v8}, Lc4/e;-><init>(Lt5/h;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    .line 95
    .line 96
    :goto_3
    :try_start_1
    iget-boolean v0, p0, Lb5/j;->s:Z

    .line 97
    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    iget-object v0, p0, Lb5/j;->q:Lb5/f;

    .line 101
    .line 102
    check-cast v0, Lb5/d;

    .line 103
    .line 104
    iget-object v0, v0, Lb5/d;->a:Lc4/h;

    .line 105
    .line 106
    sget-object v3, Lb5/d;->r:Lc4/s;

    .line 107
    .line 108
    invoke-interface {v0, v9, v3}, Lc4/h;->d(Lc4/i;Lc4/s;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eq v0, v2, :cond_5

    .line 113
    .line 114
    move v3, v2

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    move v3, v1

    .line 117
    :goto_4
    invoke-static {v3}, Lx6/b;->H(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    if-nez v0, :cond_6

    .line 121
    .line 122
    move v0, v2

    .line 123
    goto :goto_5

    .line 124
    :cond_6
    move v0, v1

    .line 125
    :goto_5
    if-eqz v0, :cond_7

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    goto :goto_6

    .line 130
    :cond_7
    :try_start_2
    iget-wide v0, v9, Lc4/e;->d:J

    .line 131
    .line 132
    iget-object v3, p0, Lb5/e;->b:Lt5/n;

    .line 133
    .line 134
    iget-wide v3, v3, Lt5/n;->f:J

    .line 135
    .line 136
    sub-long/2addr v0, v3

    .line 137
    iput-wide v0, p0, Lb5/j;->r:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 140
    .line 141
    invoke-static {v0}, Lb/z;->d(Lt5/k;)V

    .line 142
    .line 143
    .line 144
    iget-boolean v0, p0, Lb5/j;->s:Z

    .line 145
    .line 146
    xor-int/2addr v0, v2

    .line 147
    iput-boolean v0, p0, Lb5/j;->t:Z

    .line 148
    .line 149
    return-void

    .line 150
    :goto_6
    :try_start_3
    iget-wide v1, v9, Lc4/e;->d:J

    .line 151
    .line 152
    iget-object v3, p0, Lb5/e;->b:Lt5/n;

    .line 153
    .line 154
    iget-wide v3, v3, Lt5/n;->f:J

    .line 155
    .line 156
    sub-long/2addr v1, v3

    .line 157
    iput-wide v1, p0, Lb5/j;->r:J

    .line 158
    .line 159
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    iget-object v1, p0, Lb5/e;->i:Lt5/j0;

    .line 162
    .line 163
    invoke-static {v1}, Lb/z;->d(Lt5/k;)V

    .line 164
    .line 165
    .line 166
    throw v0
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
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb5/j;->s:Z

    return-void
.end method

.method public final c()J
    .locals 4

    iget-wide v0, p0, Lb5/m;->j:J

    iget v2, p0, Lb5/j;->o:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lb5/j;->t:Z

    return v0
.end method
