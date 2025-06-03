.class public final Li9/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/f;


# static fields
.field public static final k:[B


# instance fields
.field public final a:Li9/y0;

.field public final b:Li9/i;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/HashMap;

.field public final e:Li9/s$a;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/PriorityQueue;

.field public h:Z

.field public i:I

.field public j:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Li9/t0;->k:[B

    return-void
.end method

.method public constructor <init>(Li9/y0;Li9/i;Le9/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li9/t0;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Li9/s$a;

    .line 12
    .line 13
    invoke-direct {v0}, Li9/s$a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Li9/t0;->e:Li9/s$a;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Li9/t0;->f:Ljava/util/HashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/PriorityQueue;

    .line 26
    .line 27
    new-instance v1, Lb0/d;

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lb0/d;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Li9/t0;->h:Z

    .line 41
    .line 42
    const/4 v1, -0x1

    .line 43
    iput v1, p0, Li9/t0;->i:I

    .line 44
    .line 45
    const-wide/16 v1, -0x1

    .line 46
    .line 47
    iput-wide v1, p0, Li9/t0;->j:J

    .line 48
    .line 49
    iput-object p1, p0, Li9/t0;->a:Li9/y0;

    .line 50
    .line 51
    iput-object p2, p0, Li9/t0;->b:Li9/i;

    .line 52
    .line 53
    iget-object p1, p3, Le9/e;->a:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    :cond_0
    if-eqz v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string p1, ""

    .line 62
    .line 63
    :goto_0
    iput-object p1, p0, Li9/t0;->c:Ljava/lang/String;

    .line 64
    .line 65
    return-void
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

.method public static o(Lj9/k;Lg9/k0;Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 19

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lh9/c;

    .line 11
    .line 12
    invoke-direct {v1}, Lh9/c;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual/range {p0 .. p0}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lj9/k$c;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lka/d0;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_8

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Lh9/c;

    .line 63
    .line 64
    invoke-virtual {v3}, Lj9/k$c;->f()Lj9/l;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    move-object/from16 v9, p1

    .line 69
    .line 70
    iget-object v10, v9, Lg9/k0;->c:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    :cond_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_3

    .line 81
    .line 82
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    check-cast v11, Lg9/m;

    .line 87
    .line 88
    instance-of v12, v11, Lg9/l;

    .line 89
    .line 90
    if-eqz v12, :cond_1

    .line 91
    .line 92
    check-cast v11, Lg9/l;

    .line 93
    .line 94
    iget-object v12, v11, Lg9/l;->c:Lj9/l;

    .line 95
    .line 96
    invoke-virtual {v12, v8}, Lj9/e;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_1

    .line 101
    .line 102
    iget-object v11, v11, Lg9/l;->a:Lg9/l$a;

    .line 103
    .line 104
    sget-object v12, Lg9/l$a;->r:Lg9/l$a;

    .line 105
    .line 106
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-nez v12, :cond_2

    .line 111
    .line 112
    sget-object v12, Lg9/l$a;->s:Lg9/l$a;

    .line 113
    .line 114
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_1

    .line 119
    .line 120
    :cond_2
    const/4 v8, 0x1

    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const/4 v8, 0x0

    .line 123
    :goto_2
    if-eqz v8, :cond_7

    .line 124
    .line 125
    invoke-static {v5}, Lj9/s;->h(Lka/d0;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_7

    .line 130
    .line 131
    new-instance v7, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5}, Lka/d0;->R()Lka/b;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v8}, Lka/b;->h()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_6

    .line 158
    .line 159
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    check-cast v10, Lka/d0;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-eqz v12, :cond_4

    .line 174
    .line 175
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    check-cast v12, Lh9/c;

    .line 180
    .line 181
    new-instance v13, Lh9/c;

    .line 182
    .line 183
    invoke-direct {v13}, Lh9/c;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-object v12, v12, Lh9/c;->a:Lh9/f;

    .line 187
    .line 188
    iget-object v14, v12, Lh9/f;->a:[B

    .line 189
    .line 190
    iget v12, v12, Lh9/f;->b:I

    .line 191
    .line 192
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    iget-object v14, v13, Lh9/c;->a:Lh9/f;

    .line 197
    .line 198
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    array-length v15, v12

    .line 202
    invoke-virtual {v14, v15}, Lh9/f;->a(I)V

    .line 203
    .line 204
    .line 205
    array-length v15, v12

    .line 206
    const/4 v4, 0x0

    .line 207
    :goto_4
    if-ge v4, v15, :cond_5

    .line 208
    .line 209
    aget-byte v16, v12, v4

    .line 210
    .line 211
    move-object/from16 p2, v1

    .line 212
    .line 213
    iget-object v1, v14, Lh9/f;->a:[B

    .line 214
    .line 215
    move-object/from16 v17, v2

    .line 216
    .line 217
    iget v2, v14, Lh9/f;->b:I

    .line 218
    .line 219
    move-object/from16 v18, v6

    .line 220
    .line 221
    add-int/lit8 v6, v2, 0x1

    .line 222
    .line 223
    iput v6, v14, Lh9/f;->b:I

    .line 224
    .line 225
    aput-byte v16, v1, v2

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    move-object/from16 v1, p2

    .line 230
    .line 231
    move-object/from16 v2, v17

    .line 232
    .line 233
    move-object/from16 v6, v18

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_5
    move-object/from16 p2, v1

    .line 237
    .line 238
    move-object/from16 v17, v2

    .line 239
    .line 240
    move-object/from16 v18, v6

    .line 241
    .line 242
    invoke-virtual {v3}, Lj9/k$c;->g()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    invoke-virtual {v13, v1}, Lh9/c;->a(I)Lm/e;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-static {v10, v1}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Lm/e;->r()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-object/from16 v1, p2

    .line 260
    .line 261
    move-object/from16 v2, v17

    .line 262
    .line 263
    move-object/from16 v6, v18

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_6
    move-object/from16 p2, v1

    .line 267
    .line 268
    move-object/from16 v17, v2

    .line 269
    .line 270
    move-object/from16 v18, v6

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_7
    move-object/from16 p2, v1

    .line 274
    .line 275
    move-object/from16 v17, v2

    .line 276
    .line 277
    move-object/from16 v18, v6

    .line 278
    .line 279
    invoke-virtual {v3}, Lj9/k$c;->g()I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    invoke-virtual {v7, v1}, Lh9/c;->a(I)Lm/e;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v5, v1}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Lm/e;->r()V

    .line 291
    .line 292
    .line 293
    :goto_5
    move-object/from16 v1, p2

    .line 294
    .line 295
    move-object/from16 v2, v17

    .line 296
    .line 297
    move-object/from16 v6, v18

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :cond_8
    move-object/from16 v9, p1

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    new-array v1, v1, [Ljava/lang/Object;

    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-ge v4, v2, :cond_a

    .line 317
    .line 318
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Lh9/c;

    .line 323
    .line 324
    iget-object v2, v2, Lh9/c;->a:Lh9/f;

    .line 325
    .line 326
    iget-object v3, v2, Lh9/f;->a:[B

    .line 327
    .line 328
    iget v2, v2, Lh9/f;->b:I

    .line 329
    .line 330
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    aput-object v2, v1, v4

    .line 335
    .line 336
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_a
    return-object v1
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

.method public static r(Ljava/util/Collection;)Lj9/b;
    .locals 4

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Found empty index group when looking for least recent index offset."

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj9/k;

    invoke-virtual {v0}, Lj9/k;->e()Lj9/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lj9/k$b;->a()Lj9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Lj9/k$a;->i()I

    move-result v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj9/k;

    invoke-virtual {v2}, Lj9/k;->e()Lj9/k$b;

    move-result-object v2

    invoke-virtual {v2}, Lj9/k$b;->a()Lj9/k$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lj9/k$a;->f(Lj9/k$a;)I

    move-result v3

    if-gez v3, :cond_0

    move-object v0, v2

    :cond_0
    invoke-virtual {v2}, Lj9/k$a;->i()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lj9/k$a;->l()Lj9/q;

    move-result-object p0

    invoke-virtual {v0}, Lj9/k$a;->h()Lj9/i;

    move-result-object v0

    new-instance v2, Lj9/b;

    invoke-direct {v2, p0, v0, v1}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    return-object v2
.end method


# virtual methods
.method public final a(Lj9/k;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Li9/t0;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Li9/t0;->i:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    add-int/2addr v0, v2

    .line 15
    invoke-virtual {p1}, Lj9/k;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lj9/k;->f()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {p1}, Lj9/k;->e()Lj9/k$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v5, Lj9/a;

    .line 28
    .line 29
    invoke-direct {v5, v0, v3, v4, p1}, Lj9/a;-><init>(ILjava/lang/String;Ljava/util/List;Lj9/k$b;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Li9/t0;->a:Li9/y0;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    new-array v4, v3, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    aput-object v0, v4, v1

    .line 42
    .line 43
    iget-object v0, v5, Lj9/a;->d:Ljava/lang/String;

    .line 44
    .line 45
    aput-object v0, v4, v2

    .line 46
    .line 47
    iget-object v0, p0, Li9/t0;->b:Li9/i;

    .line 48
    .line 49
    iget-object v1, v5, Lj9/a;->e:Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lia/a;->J()Lia/a$a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 59
    .line 60
    .line 61
    iget-object v6, v0, Lma/w$a;->b:Lma/w;

    .line 62
    .line 63
    check-cast v6, Lia/a;

    .line 64
    .line 65
    invoke-static {v6}, Lia/a;->G(Lia/a;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Lj9/k$c;

    .line 83
    .line 84
    invoke-static {}, Lia/a$b;->M()Lia/a$b$b;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v6}, Lj9/k$c;->f()Lj9/l;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v8}, Lj9/l;->h()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v7}, Lma/w$a;->m()V

    .line 97
    .line 98
    .line 99
    iget-object v9, v7, Lma/w$a;->b:Lma/w;

    .line 100
    .line 101
    check-cast v9, Lia/a$b;

    .line 102
    .line 103
    invoke-static {v9, v8}, Lia/a$b;->G(Lia/a$b;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Lj9/k$c;->g()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-ne v8, v3, :cond_0

    .line 111
    .line 112
    invoke-virtual {v7}, Lma/w$a;->m()V

    .line 113
    .line 114
    .line 115
    iget-object v6, v7, Lma/w$a;->b:Lma/w;

    .line 116
    .line 117
    check-cast v6, Lia/a$b;

    .line 118
    .line 119
    invoke-static {v6}, Lia/a$b;->I(Lia/a$b;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_0
    invoke-virtual {v6}, Lj9/k$c;->g()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-ne v6, v2, :cond_1

    .line 128
    .line 129
    sget-object v6, Lia/a$b$c;->c:Lia/a$b$c;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_1
    sget-object v6, Lia/a$b$c;->d:Lia/a$b$c;

    .line 133
    .line 134
    :goto_1
    invoke-virtual {v7}, Lma/w$a;->m()V

    .line 135
    .line 136
    .line 137
    iget-object v8, v7, Lma/w$a;->b:Lma/w;

    .line 138
    .line 139
    check-cast v8, Lia/a$b;

    .line 140
    .line 141
    invoke-static {v8, v6}, Lia/a$b;->H(Lia/a$b;Lia/a$b$c;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 145
    .line 146
    .line 147
    iget-object v6, v0, Lma/w$a;->b:Lma/w;

    .line 148
    .line 149
    check-cast v6, Lia/a;

    .line 150
    .line 151
    invoke-virtual {v7}, Lma/w$a;->k()Lma/w;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lia/a$b;

    .line 156
    .line 157
    invoke-static {v6, v7}, Lia/a;->H(Lia/a;Lia/a$b;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_2
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Lia/a;

    .line 166
    .line 167
    invoke-virtual {v0}, Lma/a;->j()[B

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/4 v1, 0x2

    .line 172
    aput-object v0, v4, v1

    .line 173
    .line 174
    const-string v0, "INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)"

    .line 175
    .line 176
    invoke-virtual {p1, v0, v4}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v5}, Li9/t0;->t(Lj9/a;)V

    .line 180
    .line 181
    .line 182
    return-void
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

.method public final b(Lg9/k0;)Lj9/b;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Li9/t0;->s(Lg9/k0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg9/k0;

    invoke-virtual {p0, v1}, Li9/t0;->p(Lg9/k0;)Lj9/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Li9/t0;->r(Ljava/util/Collection;)Lj9/b;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lj9/k;)V
    .locals 5

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lj9/k;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "DELETE FROM index_configuration WHERE index_id = ?"

    invoke-virtual {v0, v3, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lj9/k;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    const-string v3, "DELETE FROM index_entries WHERE index_id = ?"

    invoke-virtual {v0, v3, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lj9/k;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    const-string v2, "DELETE FROM index_state WHERE index_id = ?"

    invoke-virtual {v0, v2, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Li9/t0;->f:Ljava/util/HashMap;

    invoke-virtual {p1}, Lj9/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj9/k;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final d()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lj9/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Li9/t0;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Li9/t0;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj9/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj9/k;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lj9/o;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Li9/t0;->h:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "IndexManager not started"

    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Li9/t0;->a:Li9/y0;

    const-string v3, "SELECT parent FROM collection_parents WHERE collection_id = ?"

    invoke-virtual {v2, v3}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v2, v3}, Li9/y0$d;->a([Ljava/lang/Object;)V

    new-instance p1, Li9/p0;

    invoke-direct {p1, v0, v1}, Li9/p0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, p1}, Li9/y0$d;->d(Ln9/d;)I

    return-object v0
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DELETE FROM index_configuration"

    invoke-virtual {v0, v3, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DELETE FROM index_entries"

    invoke-virtual {v0, v3, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->a:Li9/y0;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DELETE FROM index_state"

    invoke-virtual {v0, v2, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    iget-object v0, p0, Li9/t0;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final h(Lt8/c;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Li9/t0;->h:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "IndexManager not started"

    .line 9
    .line 10
    invoke-static {v4, v1, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lt8/c;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_8

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lj9/i;

    .line 34
    .line 35
    iget-object v4, v4, Lj9/i;->a:Lj9/o;

    .line 36
    .line 37
    invoke-virtual {v4}, Lj9/e;->q()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    add-int/lit8 v5, v5, -0x2

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lj9/e;->n(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v0, v4}, Li9/t0;->q(Ljava/lang/String;)Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lj9/k;

    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Lj9/i;

    .line 72
    .line 73
    new-instance v7, Ljava/util/TreeSet;

    .line 74
    .line 75
    invoke-direct {v7}, Ljava/util/TreeSet;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-object v8, v0, Li9/t0;->a:Li9/y0;

    .line 79
    .line 80
    const-string v9, "SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?"

    .line 81
    .line 82
    invoke-virtual {v8, v9}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    const/4 v9, 0x3

    .line 87
    new-array v9, v9, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {v5}, Lj9/k;->d()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    aput-object v10, v9, v2

    .line 98
    .line 99
    invoke-virtual {v6}, Lj9/i;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    const/4 v11, 0x1

    .line 104
    aput-object v10, v9, v11

    .line 105
    .line 106
    iget-object v10, v0, Li9/t0;->c:Ljava/lang/String;

    .line 107
    .line 108
    const/4 v12, 0x2

    .line 109
    aput-object v10, v9, v12

    .line 110
    .line 111
    invoke-virtual {v8, v9}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v9, Li9/s0;

    .line 115
    .line 116
    invoke-direct {v9, v7, v5, v6, v2}, Li9/s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v9}, Li9/y0$d;->d(Ln9/d;)I

    .line 120
    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Lj9/g;

    .line 127
    .line 128
    new-instance v8, Ljava/util/TreeSet;

    .line 129
    .line 130
    invoke-direct {v8}, Ljava/util/TreeSet;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v9, Lh9/c;

    .line 134
    .line 135
    invoke-direct {v9}, Lh9/c;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_2

    .line 151
    .line 152
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    check-cast v12, Lj9/k$c;

    .line 157
    .line 158
    invoke-virtual {v12}, Lj9/k$c;->f()Lj9/l;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    invoke-interface {v6, v13}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    if-nez v13, :cond_1

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    goto :goto_2

    .line 170
    :cond_1
    invoke-virtual {v12}, Lj9/k$c;->g()I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    invoke-virtual {v9, v12}, Lh9/c;->a(I)Lm/e;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    invoke-static {v13, v12}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Lm/e;->r()V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_2
    iget-object v9, v9, Lh9/c;->a:Lh9/f;

    .line 186
    .line 187
    iget-object v10, v9, Lh9/f;->a:[B

    .line 188
    .line 189
    iget v9, v9, Lh9/f;->b:I

    .line 190
    .line 191
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    :goto_2
    if-nez v9, :cond_3

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_3
    invoke-virtual {v5}, Lj9/k;->a()Lj9/k$c;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    if-eqz v10, :cond_4

    .line 203
    .line 204
    invoke-virtual {v10}, Lj9/k$c;->f()Lj9/l;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    invoke-interface {v6, v10}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-static {v10}, Lj9/s;->h(Lka/d0;)Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_5

    .line 217
    .line 218
    invoke-virtual {v10}, Lka/d0;->R()Lka/b;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-virtual {v10}, Lka/b;->h()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    if-eqz v12, :cond_5

    .line 235
    .line 236
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    check-cast v12, Lka/d0;

    .line 241
    .line 242
    invoke-virtual {v5}, Lj9/k;->d()I

    .line 243
    .line 244
    .line 245
    move-result v13

    .line 246
    invoke-interface {v6}, Lj9/g;->getKey()Lj9/i;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    new-instance v15, Lh9/c;

    .line 251
    .line 252
    invoke-direct {v15}, Lh9/c;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v15, v11}, Lh9/c;->a(I)Lm/e;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-static {v12, v2}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Lm/e;->r()V

    .line 263
    .line 264
    .line 265
    iget-object v2, v15, Lh9/c;->a:Lh9/f;

    .line 266
    .line 267
    iget-object v12, v2, Lh9/f;->a:[B

    .line 268
    .line 269
    iget v2, v2, Lh9/f;->b:I

    .line 270
    .line 271
    invoke-static {v12, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    new-instance v12, Lh9/a;

    .line 276
    .line 277
    invoke-direct {v12, v13, v14, v2, v9}, Lh9/a;-><init>(ILj9/i;[B[B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8, v12}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    goto :goto_3

    .line 285
    :cond_4
    invoke-virtual {v5}, Lj9/k;->d()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-interface {v6}, Lj9/g;->getKey()Lj9/i;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    const/4 v6, 0x0

    .line 294
    new-array v10, v6, [B

    .line 295
    .line 296
    new-instance v6, Lh9/a;

    .line 297
    .line 298
    invoke-direct {v6, v2, v5, v10, v9}, Lh9/a;-><init>(ILj9/i;[B[B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v8, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_5
    :goto_4
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-nez v2, :cond_7

    .line 309
    .line 310
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Lj9/g;

    .line 315
    .line 316
    const-string v5, "t0"

    .line 317
    .line 318
    new-array v6, v11, [Ljava/lang/Object;

    .line 319
    .line 320
    invoke-interface {v2}, Lj9/g;->getKey()Lj9/i;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    const/4 v10, 0x0

    .line 325
    aput-object v9, v6, v10

    .line 326
    .line 327
    const-string v9, "Updating index entries for document \'%s\'"

    .line 328
    .line 329
    invoke-static {v11, v5, v9, v6}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v5, Li9/q0;

    .line 333
    .line 334
    invoke-direct {v5, v10, v0, v2}, Li9/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    new-instance v6, Li9/r0;

    .line 338
    .line 339
    invoke-direct {v6, v10, v0, v2}, Li9/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    sget-object v2, Ln9/o;->a:Lr3/j;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v8}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v7}, Ljava/util/TreeSet;->comparator()Ljava/util/Comparator;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    if-eqz v9, :cond_6

    .line 357
    .line 358
    invoke-virtual {v7}, Ljava/util/TreeSet;->comparator()Ljava/util/Comparator;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    goto :goto_5

    .line 363
    :cond_6
    new-instance v7, Lq5/i;

    .line 364
    .line 365
    const/4 v9, 0x7

    .line 366
    invoke-direct {v7, v9}, Lq5/i;-><init>(I)V

    .line 367
    .line 368
    .line 369
    :goto_5
    invoke-static {v2, v8, v7, v5, v6}, Ln9/o;->f(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Ln9/d;Ln9/d;)V

    .line 370
    .line 371
    .line 372
    move v2, v10

    .line 373
    goto/16 :goto_0

    .line 374
    .line 375
    :cond_7
    const/4 v2, 0x0

    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_8
    return-void
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

.method public final i(Ljava/lang/String;)Lj9/b;
    .locals 3

    invoke-virtual {p0, p1}, Li9/t0;->q(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "minOffset was called for collection without indexes"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    invoke-static {p1}, Li9/t0;->r(Ljava/util/Collection;)Lj9/b;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lj9/o;)V
    .locals 6

    iget-boolean v0, p0, Li9/t0;->h:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "IndexManager not started"

    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj9/e;->q()I

    move-result v0

    const/4 v2, 0x2

    rem-int/2addr v0, v2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    new-array v4, v1, [Ljava/lang/Object;

    const-string v5, "Expected a collection path."

    invoke-static {v5, v0, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->e:Li9/s$a;

    invoke-virtual {v0, p1}, Li9/s$a;->a(Lj9/o;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj9/e;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj9/e;->s()Lj9/e;

    move-result-object p1

    check-cast p1, Lj9/o;

    iget-object v4, p0, Li9/t0;->a:Li9/y0;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    const-string p1, "INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"

    invoke-virtual {v4, p1, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final k(Lg9/k0;)I
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Li9/t0;->s(Lg9/k0;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x3

    .line 11
    move v4, v3

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    if-eqz v5, :cond_9

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Lg9/k0;

    .line 25
    .line 26
    move-object/from16 v8, p0

    .line 27
    .line 28
    invoke-virtual {v8, v5}, Li9/t0;->p(Lg9/k0;)Lj9/k;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    if-nez v9, :cond_1

    .line 33
    .line 34
    move v4, v7

    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v9}, Lj9/k;->f()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    new-instance v10, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v11, v5, Lg9/k0;->c:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    :cond_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-eqz v12, :cond_6

    .line 61
    .line 62
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    check-cast v12, Lg9/m;

    .line 67
    .line 68
    invoke-virtual {v12}, Lg9/m;->c()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-eqz v13, :cond_2

    .line 81
    .line 82
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    check-cast v13, Lg9/l;

    .line 87
    .line 88
    iget-object v14, v13, Lg9/l;->c:Lj9/l;

    .line 89
    .line 90
    invoke-virtual {v14}, Lj9/l;->u()Z

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    if-eqz v14, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    iget-object v14, v13, Lg9/l;->a:Lg9/l$a;

    .line 98
    .line 99
    sget-object v15, Lg9/l$a;->p:Lg9/l$a;

    .line 100
    .line 101
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-nez v14, :cond_5

    .line 106
    .line 107
    iget-object v14, v13, Lg9/l;->a:Lg9/l$a;

    .line 108
    .line 109
    sget-object v15, Lg9/l$a;->q:Lg9/l$a;

    .line 110
    .line 111
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v14, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object v13, v13, Lg9/l;->c:Lj9/l;

    .line 119
    .line 120
    invoke-virtual {v10, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    :goto_2
    move v6, v7

    .line 125
    goto :goto_1

    .line 126
    :cond_6
    iget-object v5, v5, Lg9/k0;->b:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_8

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Lg9/e0;

    .line 143
    .line 144
    iget-object v11, v7, Lg9/e0;->b:Lj9/l;

    .line 145
    .line 146
    invoke-virtual {v11}, Lj9/l;->u()Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-nez v11, :cond_7

    .line 151
    .line 152
    iget-object v7, v7, Lg9/e0;->b:Lj9/l;

    .line 153
    .line 154
    invoke-virtual {v10, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    invoke-virtual {v10}, Ljava/util/HashSet;->size()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    add-int/2addr v5, v6

    .line 163
    if-ge v9, v5, :cond_0

    .line 164
    .line 165
    move v4, v2

    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_9
    move-object/from16 v8, p0

    .line 169
    .line 170
    :goto_4
    move-object/from16 v1, p1

    .line 171
    .line 172
    iget-wide v9, v1, Lg9/k0;->f:J

    .line 173
    .line 174
    const-wide/16 v11, -0x1

    .line 175
    .line 176
    cmp-long v1, v9, v11

    .line 177
    .line 178
    if-eqz v1, :cond_a

    .line 179
    .line 180
    move v6, v7

    .line 181
    :cond_a
    if-eqz v6, :cond_b

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-le v0, v7, :cond_b

    .line 188
    .line 189
    if-ne v4, v3, :cond_b

    .line 190
    .line 191
    return v2

    .line 192
    :cond_b
    return v4
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

.method public final l(Lg9/k0;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/k0;",
            ")",
            "Ljava/util/List<",
            "Lj9/i;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "t0"

    .line 6
    .line 7
    iget-boolean v3, v0, Li9/t0;->h:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    new-array v4, v4, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v5, "IndexManager not started"

    .line 13
    .line 14
    invoke-static {v5, v3, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v5, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p0 .. p1}, Li9/t0;->s(Lg9/k0;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    const/4 v8, 0x0

    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Lg9/k0;

    .line 52
    .line 53
    invoke-virtual {v0, v7}, Li9/t0;->p(Lg9/k0;)Lj9/k;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    if-nez v9, :cond_0

    .line 58
    .line 59
    return-object v8

    .line 60
    :cond_0
    invoke-static {v7, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    const-string v7, ")"

    .line 77
    .line 78
    const-string v9, " UNION "

    .line 79
    .line 80
    if-eqz v6, :cond_18

    .line 81
    .line 82
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Landroid/util/Pair;

    .line 87
    .line 88
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, Lg9/k0;

    .line 91
    .line 92
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Lj9/k;

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Lj9/k;->a()Lj9/k$c;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    if-nez v11, :cond_2

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_2
    invoke-virtual {v11}, Lj9/k$c;->f()Lj9/l;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v10, v8}, Lg9/k0;->d(Lj9/l;)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    if-eqz v11, :cond_5

    .line 123
    .line 124
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    check-cast v11, Lg9/l;

    .line 129
    .line 130
    iget-object v12, v11, Lg9/l;->a:Lg9/l$a;

    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    const/4 v13, 0x6

    .line 137
    if-eq v12, v13, :cond_4

    .line 138
    .line 139
    const/4 v13, 0x7

    .line 140
    if-eq v12, v13, :cond_3

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-object v8, v11, Lg9/l;->b:Lka/d0;

    .line 144
    .line 145
    invoke-virtual {v8}, Lka/d0;->R()Lka/b;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v8}, Lka/b;->h()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    iget-object v8, v11, Lg9/l;->b:Lka/d0;

    .line 155
    .line 156
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    goto :goto_3

    .line 161
    :cond_5
    const/4 v8, 0x0

    .line 162
    :goto_3
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    :cond_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_9

    .line 180
    .line 181
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    check-cast v13, Lj9/k$c;

    .line 186
    .line 187
    invoke-virtual {v13}, Lj9/k$c;->f()Lj9/l;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    invoke-virtual {v10, v14}, Lg9/k0;->d(Lj9/l;)Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-eqz v15, :cond_6

    .line 204
    .line 205
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    check-cast v15, Lg9/l;

    .line 210
    .line 211
    move-object/from16 v16, v5

    .line 212
    .line 213
    iget-object v5, v15, Lg9/l;->a:Lg9/l$a;

    .line 214
    .line 215
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    move-object/from16 v17, v12

    .line 220
    .line 221
    const/4 v12, 0x2

    .line 222
    if-eq v5, v12, :cond_8

    .line 223
    .line 224
    const/4 v12, 0x3

    .line 225
    if-eq v5, v12, :cond_7

    .line 226
    .line 227
    const/16 v12, 0x8

    .line 228
    .line 229
    if-eq v5, v12, :cond_8

    .line 230
    .line 231
    const/16 v12, 0x9

    .line 232
    .line 233
    if-eq v5, v12, :cond_7

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_7
    invoke-virtual {v13}, Lj9/k$c;->f()Lj9/l;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iget-object v12, v15, Lg9/l;->b:Lka/d0;

    .line 241
    .line 242
    invoke-virtual {v11, v5, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    goto :goto_6

    .line 250
    :cond_8
    invoke-virtual {v13}, Lj9/k$c;->f()Lj9/l;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    iget-object v12, v15, Lg9/l;->b:Lka/d0;

    .line 255
    .line 256
    invoke-virtual {v11, v5, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :goto_5
    move-object/from16 v5, v16

    .line 260
    .line 261
    move-object/from16 v12, v17

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_9
    move-object/from16 v16, v5

    .line 265
    .line 266
    const/4 v5, 0x0

    .line 267
    :goto_6
    new-instance v11, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    const/4 v13, 0x1

    .line 281
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    if-eqz v14, :cond_b

    .line 286
    .line 287
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    check-cast v14, Lj9/k$c;

    .line 292
    .line 293
    invoke-virtual {v14}, Lj9/k$c;->g()I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    move-object/from16 v17, v12

    .line 298
    .line 299
    const/4 v12, 0x1

    .line 300
    invoke-static {v15, v12}, Lq0/g;->b(II)Z

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    iget-object v15, v10, Lg9/k0;->g:Lg9/e;

    .line 305
    .line 306
    if-eqz v12, :cond_a

    .line 307
    .line 308
    invoke-virtual {v10, v14, v15}, Lg9/k0;->a(Lj9/k$c;Lg9/e;)Landroid/util/Pair;

    .line 309
    .line 310
    .line 311
    move-result-object v12

    .line 312
    goto :goto_8

    .line 313
    :cond_a
    invoke-virtual {v10, v14, v15}, Lg9/k0;->c(Lj9/k$c;Lg9/e;)Landroid/util/Pair;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    :goto_8
    iget-object v14, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v14, Lka/d0;

    .line 320
    .line 321
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v12, Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    and-int/2addr v13, v12

    .line 333
    move-object/from16 v12, v17

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_b
    new-instance v12, Lg9/e;

    .line 337
    .line 338
    invoke-direct {v12, v11, v13}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 339
    .line 340
    .line 341
    new-instance v11, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    const/4 v14, 0x1

    .line 355
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v15

    .line 359
    if-eqz v15, :cond_d

    .line 360
    .line 361
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v15

    .line 365
    check-cast v15, Lj9/k$c;

    .line 366
    .line 367
    move-object/from16 v17, v13

    .line 368
    .line 369
    invoke-virtual {v15}, Lj9/k$c;->g()I

    .line 370
    .line 371
    .line 372
    move-result v13

    .line 373
    const/4 v1, 0x1

    .line 374
    invoke-static {v13, v1}, Lq0/g;->b(II)Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    iget-object v13, v10, Lg9/k0;->h:Lg9/e;

    .line 379
    .line 380
    if-eqz v1, :cond_c

    .line 381
    .line 382
    invoke-virtual {v10, v15, v13}, Lg9/k0;->c(Lj9/k$c;Lg9/e;)Landroid/util/Pair;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    goto :goto_a

    .line 387
    :cond_c
    invoke-virtual {v10, v15, v13}, Lg9/k0;->a(Lj9/k$c;Lg9/e;)Landroid/util/Pair;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    :goto_a
    iget-object v13, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v13, Lka/d0;

    .line 394
    .line 395
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v1, Ljava/lang/Boolean;

    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    and-int/2addr v14, v1

    .line 407
    move-object/from16 v1, p1

    .line 408
    .line 409
    move-object/from16 v13, v17

    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_d
    new-instance v1, Lg9/e;

    .line 413
    .line 414
    invoke-direct {v1, v11, v14}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 415
    .line 416
    .line 417
    invoke-static {}, Lp2/m0;->S()Z

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    if-eqz v13, :cond_e

    .line 422
    .line 423
    const/4 v13, 0x5

    .line 424
    new-array v13, v13, [Ljava/lang/Object;

    .line 425
    .line 426
    const/4 v15, 0x0

    .line 427
    aput-object v6, v13, v15

    .line 428
    .line 429
    const/4 v15, 0x1

    .line 430
    aput-object v10, v13, v15

    .line 431
    .line 432
    const/16 v17, 0x2

    .line 433
    .line 434
    aput-object v8, v13, v17

    .line 435
    .line 436
    const/16 v17, 0x3

    .line 437
    .line 438
    aput-object v12, v13, v17

    .line 439
    .line 440
    const/16 v17, 0x4

    .line 441
    .line 442
    aput-object v1, v13, v17

    .line 443
    .line 444
    const-string v1, "Using index \'%s\' to execute \'%s\' (Arrays: %s, Lower bound: %s, Upper bound: %s)"

    .line 445
    .line 446
    invoke-static {v15, v2, v1, v13}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    :cond_e
    iget-object v1, v12, Lg9/e;->b:Ljava/util/List;

    .line 450
    .line 451
    invoke-static {v6, v10, v1}, Li9/t0;->o(Lj9/k;Lg9/k0;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    iget-boolean v12, v12, Lg9/e;->a:Z

    .line 456
    .line 457
    if-eqz v12, :cond_f

    .line 458
    .line 459
    const-string v12, ">="

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_f
    const-string v12, ">"

    .line 463
    .line 464
    :goto_b
    invoke-static {v6, v10, v11}, Li9/t0;->o(Lj9/k;Lg9/k0;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    if-eqz v14, :cond_10

    .line 469
    .line 470
    const-string v13, "<="

    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_10
    const-string v13, "<"

    .line 474
    .line 475
    :goto_c
    invoke-static {v6, v10, v5}, Li9/t0;->o(Lj9/k;Lg9/k0;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-virtual {v6}, Lj9/k;->d()I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-eqz v8, :cond_11

    .line 484
    .line 485
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    goto :goto_d

    .line 490
    :cond_11
    const/4 v10, 0x1

    .line 491
    :goto_d
    array-length v14, v1

    .line 492
    array-length v15, v11

    .line 493
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 494
    .line 495
    .line 496
    move-result v14

    .line 497
    mul-int/2addr v14, v10

    .line 498
    new-instance v10, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 501
    .line 502
    .line 503
    const-string v15, "SELECT document_key, directional_value FROM index_entries "

    .line 504
    .line 505
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    const-string v15, "WHERE index_id = ? AND uid = ? "

    .line 509
    .line 510
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    const-string v15, "AND array_value = ? "

    .line 514
    .line 515
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const-string v15, "AND directional_value "

    .line 519
    .line 520
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v12, " ? "

    .line 527
    .line 528
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-static {v10, v14, v9}, Ln9/o;->h(Ljava/lang/CharSequence;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    if-eqz v5, :cond_12

    .line 545
    .line 546
    new-instance v10, Ljava/lang/StringBuilder;

    .line 547
    .line 548
    const-string v12, "SELECT document_key, directional_value FROM ("

    .line 549
    .line 550
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    const-string v9, ") WHERE directional_value NOT IN ("

    .line 557
    .line 558
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    array-length v9, v5

    .line 562
    const-string v12, "?"

    .line 563
    .line 564
    const-string v13, ", "

    .line 565
    .line 566
    invoke-static {v12, v9, v13}, Ln9/o;->h(Ljava/lang/CharSequence;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    move-object v9, v10

    .line 577
    :cond_12
    if-eqz v8, :cond_13

    .line 578
    .line 579
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 580
    .line 581
    .line 582
    move-result v7

    .line 583
    goto :goto_e

    .line 584
    :cond_13
    const/4 v7, 0x1

    .line 585
    :goto_e
    div-int v7, v14, v7

    .line 586
    .line 587
    mul-int/lit8 v10, v14, 0x5

    .line 588
    .line 589
    if-eqz v5, :cond_14

    .line 590
    .line 591
    array-length v12, v5

    .line 592
    goto :goto_f

    .line 593
    :cond_14
    const/4 v12, 0x0

    .line 594
    :goto_f
    add-int/2addr v10, v12

    .line 595
    new-array v10, v10, [Ljava/lang/Object;

    .line 596
    .line 597
    const/4 v12, 0x0

    .line 598
    const/4 v13, 0x0

    .line 599
    :goto_10
    if-ge v12, v14, :cond_16

    .line 600
    .line 601
    add-int/lit8 v15, v13, 0x1

    .line 602
    .line 603
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v17

    .line 607
    aput-object v17, v10, v13

    .line 608
    .line 609
    add-int/lit8 v13, v15, 0x1

    .line 610
    .line 611
    move/from16 v17, v6

    .line 612
    .line 613
    iget-object v6, v0, Li9/t0;->c:Ljava/lang/String;

    .line 614
    .line 615
    aput-object v6, v10, v15

    .line 616
    .line 617
    add-int/lit8 v6, v13, 0x1

    .line 618
    .line 619
    if-eqz v8, :cond_15

    .line 620
    .line 621
    div-int v15, v12, v7

    .line 622
    .line 623
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v15

    .line 627
    check-cast v15, Lka/d0;

    .line 628
    .line 629
    move-object/from16 v18, v8

    .line 630
    .line 631
    new-instance v8, Lh9/c;

    .line 632
    .line 633
    invoke-direct {v8}, Lh9/c;-><init>()V

    .line 634
    .line 635
    .line 636
    move/from16 v19, v14

    .line 637
    .line 638
    const/4 v14, 0x1

    .line 639
    invoke-virtual {v8, v14}, Lh9/c;->a(I)Lm/e;

    .line 640
    .line 641
    .line 642
    move-result-object v14

    .line 643
    invoke-static {v15, v14}, Lh9/b;->a(Lka/d0;Lm/e;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v14}, Lm/e;->r()V

    .line 647
    .line 648
    .line 649
    iget-object v8, v8, Lh9/c;->a:Lh9/f;

    .line 650
    .line 651
    iget-object v14, v8, Lh9/f;->a:[B

    .line 652
    .line 653
    iget v8, v8, Lh9/f;->b:I

    .line 654
    .line 655
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    goto :goto_11

    .line 660
    :cond_15
    move-object/from16 v18, v8

    .line 661
    .line 662
    move/from16 v19, v14

    .line 663
    .line 664
    sget-object v8, Li9/t0;->k:[B

    .line 665
    .line 666
    :goto_11
    aput-object v8, v10, v13

    .line 667
    .line 668
    add-int/lit8 v8, v6, 0x1

    .line 669
    .line 670
    rem-int v13, v12, v7

    .line 671
    .line 672
    aget-object v14, v1, v13

    .line 673
    .line 674
    aput-object v14, v10, v6

    .line 675
    .line 676
    add-int/lit8 v6, v8, 0x1

    .line 677
    .line 678
    aget-object v13, v11, v13

    .line 679
    .line 680
    aput-object v13, v10, v8

    .line 681
    .line 682
    add-int/lit8 v12, v12, 0x1

    .line 683
    .line 684
    move v13, v6

    .line 685
    move/from16 v6, v17

    .line 686
    .line 687
    move-object/from16 v8, v18

    .line 688
    .line 689
    move/from16 v14, v19

    .line 690
    .line 691
    goto :goto_10

    .line 692
    :cond_16
    if-eqz v5, :cond_17

    .line 693
    .line 694
    array-length v1, v5

    .line 695
    const/4 v6, 0x0

    .line 696
    :goto_12
    if-ge v6, v1, :cond_17

    .line 697
    .line 698
    aget-object v7, v5, v6

    .line 699
    .line 700
    add-int/lit8 v8, v13, 0x1

    .line 701
    .line 702
    aput-object v7, v10, v13

    .line 703
    .line 704
    add-int/lit8 v6, v6, 0x1

    .line 705
    .line 706
    move v13, v8

    .line 707
    goto :goto_12

    .line 708
    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v5

    .line 717
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    const/4 v5, 0x0

    .line 732
    aget-object v5, v1, v5

    .line 733
    .line 734
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    array-length v1, v1

    .line 746
    const/4 v6, 0x1

    .line 747
    invoke-interface {v5, v6, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 752
    .line 753
    .line 754
    const/4 v8, 0x0

    .line 755
    move-object/from16 v1, p1

    .line 756
    .line 757
    move-object/from16 v5, v16

    .line 758
    .line 759
    goto/16 :goto_1

    .line 760
    .line 761
    :cond_18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 762
    .line 763
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 764
    .line 765
    .line 766
    invoke-static {v9, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    const-string v3, "ORDER BY directional_value, document_key "

    .line 774
    .line 775
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    move-object/from16 v3, p1

    .line 779
    .line 780
    iget-object v5, v3, Lg9/k0;->b:Ljava/util/List;

    .line 781
    .line 782
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    add-int/lit8 v6, v6, -0x1

    .line 787
    .line 788
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    check-cast v5, Lg9/e0;

    .line 793
    .line 794
    iget v5, v5, Lg9/e0;->a:I

    .line 795
    .line 796
    const/4 v6, 0x1

    .line 797
    invoke-static {v5, v6}, Lq0/g;->b(II)Z

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    if-eqz v5, :cond_19

    .line 802
    .line 803
    const-string v5, "asc "

    .line 804
    .line 805
    goto :goto_13

    .line 806
    :cond_19
    const-string v5, "desc "

    .line 807
    .line 808
    :goto_13
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    const-string v5, "SELECT DISTINCT document_key FROM ("

    .line 816
    .line 817
    invoke-static {v5, v1, v7}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    iget-wide v5, v3, Lg9/k0;->f:J

    .line 822
    .line 823
    const-wide/16 v7, -0x1

    .line 824
    .line 825
    cmp-long v5, v5, v7

    .line 826
    .line 827
    if-eqz v5, :cond_1a

    .line 828
    .line 829
    const/4 v5, 0x1

    .line 830
    goto :goto_14

    .line 831
    :cond_1a
    const/4 v5, 0x0

    .line 832
    :goto_14
    if-eqz v5, :cond_1b

    .line 833
    .line 834
    const-string v5, " LIMIT "

    .line 835
    .line 836
    invoke-static {v1, v5}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    iget-wide v5, v3, Lg9/k0;->f:J

    .line 841
    .line 842
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    :cond_1b
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    const/16 v5, 0x3e8

    .line 854
    .line 855
    if-ge v3, v5, :cond_1c

    .line 856
    .line 857
    const/4 v3, 0x0

    .line 858
    const/4 v5, 0x1

    .line 859
    goto :goto_15

    .line 860
    :cond_1c
    const/4 v3, 0x0

    .line 861
    const/4 v5, 0x0

    .line 862
    :goto_15
    new-array v6, v3, [Ljava/lang/Object;

    .line 863
    .line 864
    const-string v7, "Cannot perform query with more than 999 bind elements"

    .line 865
    .line 866
    invoke-static {v7, v5, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    iget-object v5, v0, Li9/t0;->a:Li9/y0;

    .line 870
    .line 871
    invoke-virtual {v5, v1}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    invoke-virtual {v4}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v1, v4}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    new-instance v4, Ljava/util/ArrayList;

    .line 883
    .line 884
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 885
    .line 886
    .line 887
    new-instance v5, Li9/o0;

    .line 888
    .line 889
    invoke-direct {v5, v3, v4}, Li9/o0;-><init>(ILjava/util/ArrayList;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v1, v5}, Li9/y0$d;->d(Ln9/d;)I

    .line 893
    .line 894
    .line 895
    const/4 v1, 0x1

    .line 896
    new-array v5, v1, [Ljava/lang/Object;

    .line 897
    .line 898
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 899
    .line 900
    .line 901
    move-result v6

    .line 902
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 903
    .line 904
    .line 905
    move-result-object v6

    .line 906
    aput-object v6, v5, v3

    .line 907
    .line 908
    const-string v3, "Index scan returned %s documents"

    .line 909
    .line 910
    invoke-static {v1, v2, v3, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    return-object v4
    .line 914
    .line 915
.end method

.method public final m(Lg9/k0;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Li9/t0;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Li9/t0;->s(Lg9/k0;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_11

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lg9/k0;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Li9/t0;->k(Lg9/k0;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eq v2, v4, :cond_1

    .line 38
    .line 39
    if-ne v2, v3, :cond_0

    .line 40
    .line 41
    :cond_1
    iget-object v2, v0, Lg9/k0;->e:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v2, v0, Lg9/k0;->d:Lj9/o;

    .line 47
    .line 48
    invoke-virtual {v2}, Lj9/e;->m()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :goto_1
    iget-object v5, v0, Lg9/k0;->b:Ljava/util/List;

    .line 53
    .line 54
    new-instance v6, Ljava/util/TreeSet;

    .line 55
    .line 56
    new-instance v7, Lv4/d;

    .line 57
    .line 58
    const/16 v8, 0x9

    .line 59
    .line 60
    invoke-direct {v7, v8}, Lv4/d;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v6, v7}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 64
    .line 65
    .line 66
    new-instance v7, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lg9/k0;->c:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, Lg9/m;

    .line 88
    .line 89
    check-cast v8, Lg9/l;

    .line 90
    .line 91
    invoke-virtual {v8}, Lg9/l;->f()Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_3

    .line 96
    .line 97
    invoke-virtual {v6, v8}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-virtual {v6}, Ljava/util/TreeSet;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-le v0, v4, :cond_5

    .line 110
    .line 111
    move v0, v4

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    move v0, v1

    .line 114
    :goto_3
    if-eqz v0, :cond_6

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_6
    new-instance v0, Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v6, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_c

    .line 138
    .line 139
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    check-cast v8, Lg9/l;

    .line 144
    .line 145
    iget-object v9, v8, Lg9/l;->c:Lj9/l;

    .line 146
    .line 147
    invoke-virtual {v9}, Lj9/l;->u()Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_7

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_7
    iget-object v9, v8, Lg9/l;->a:Lg9/l$a;

    .line 155
    .line 156
    sget-object v10, Lg9/l$a;->p:Lg9/l$a;

    .line 157
    .line 158
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-nez v9, :cond_9

    .line 163
    .line 164
    iget-object v9, v8, Lg9/l;->a:Lg9/l$a;

    .line 165
    .line 166
    sget-object v10, Lg9/l$a;->q:Lg9/l$a;

    .line 167
    .line 168
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_8

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    move v9, v1

    .line 176
    goto :goto_6

    .line 177
    :cond_9
    :goto_5
    move v9, v4

    .line 178
    :goto_6
    if-eqz v9, :cond_a

    .line 179
    .line 180
    iget-object v8, v8, Lg9/l;->c:Lj9/l;

    .line 181
    .line 182
    const/4 v9, 0x3

    .line 183
    new-instance v10, Lj9/d;

    .line 184
    .line 185
    invoke-direct {v10, v8, v9}, Lj9/d;-><init>(Lj9/l;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_a
    iget-object v9, v8, Lg9/l;->c:Lj9/l;

    .line 193
    .line 194
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-eqz v9, :cond_b

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_b
    iget-object v9, v8, Lg9/l;->c:Lj9/l;

    .line 202
    .line 203
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    iget-object v8, v8, Lg9/l;->c:Lj9/l;

    .line 207
    .line 208
    new-instance v9, Lj9/d;

    .line 209
    .line 210
    invoke-direct {v9, v8, v4}, Lj9/d;-><init>(Lj9/l;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_c
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_10

    .line 226
    .line 227
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    check-cast v7, Lg9/e0;

    .line 232
    .line 233
    iget-object v8, v7, Lg9/e0;->b:Lj9/l;

    .line 234
    .line 235
    invoke-virtual {v8}, Lj9/l;->u()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_d

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_d
    iget-object v8, v7, Lg9/e0;->b:Lj9/l;

    .line 243
    .line 244
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_e

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_e
    iget-object v8, v7, Lg9/e0;->b:Lj9/l;

    .line 252
    .line 253
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    iget-object v8, v7, Lg9/e0;->b:Lj9/l;

    .line 257
    .line 258
    iget v7, v7, Lg9/e0;->a:I

    .line 259
    .line 260
    if-ne v7, v4, :cond_f

    .line 261
    .line 262
    move v7, v4

    .line 263
    goto :goto_8

    .line 264
    :cond_f
    move v7, v3

    .line 265
    :goto_8
    new-instance v9, Lj9/d;

    .line 266
    .line 267
    invoke-direct {v9, v8, v7}, Lj9/d;-><init>(Lj9/l;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_10
    const/4 v0, -0x1

    .line 275
    sget-object v3, Lj9/k;->a:Lj9/c;

    .line 276
    .line 277
    new-instance v4, Lj9/a;

    .line 278
    .line 279
    invoke-direct {v4, v0, v2, v6, v3}, Lj9/a;-><init>(ILjava/lang/String;Ljava/util/List;Lj9/k$b;)V

    .line 280
    .line 281
    .line 282
    move-object v0, v4

    .line 283
    :goto_9
    if-eqz v0, :cond_0

    .line 284
    .line 285
    invoke-virtual {p0, v0}, Li9/t0;->a(Lj9/k;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :cond_11
    return-void
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
.end method

.method public final n(Ljava/lang/String;Lj9/b;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Li9/t0;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-wide v2, p0, Li9/t0;->j:J

    .line 12
    .line 13
    const-wide/16 v4, 0x1

    .line 14
    .line 15
    add-long/2addr v2, v4

    .line 16
    iput-wide v2, p0, Li9/t0;->j:J

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Li9/t0;->q(Ljava/lang/String;)Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lj9/k;

    .line 37
    .line 38
    invoke-virtual {v0}, Lj9/k;->d()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v0}, Lj9/k;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0}, Lj9/k;->f()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-wide v5, p0, Li9/t0;->j:J

    .line 51
    .line 52
    new-instance v7, Lj9/c;

    .line 53
    .line 54
    invoke-direct {v7, v5, v6, p2}, Lj9/c;-><init>(JLj9/b;)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lj9/a;

    .line 58
    .line 59
    invoke-direct {v5, v2, v3, v4, v7}, Lj9/a;-><init>(ILjava/lang/String;Ljava/util/List;Lj9/k$b;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Li9/t0;->a:Li9/y0;

    .line 63
    .line 64
    const/4 v3, 0x7

    .line 65
    new-array v3, v3, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v0}, Lj9/k;->d()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    aput-object v0, v3, v1

    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    iget-object v4, p0, Li9/t0;->c:Ljava/lang/String;

    .line 79
    .line 80
    aput-object v4, v3, v0

    .line 81
    .line 82
    const/4 v0, 0x2

    .line 83
    iget-wide v6, p0, Li9/t0;->j:J

    .line 84
    .line 85
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    aput-object v4, v3, v0

    .line 90
    .line 91
    const/4 v0, 0x3

    .line 92
    iget-object v4, p2, Lj9/b;->c:Lj9/q;

    .line 93
    .line 94
    iget-object v4, v4, Lj9/q;->a:Lu7/m;

    .line 95
    .line 96
    iget-wide v6, v4, Lu7/m;->a:J

    .line 97
    .line 98
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    aput-object v4, v3, v0

    .line 103
    .line 104
    const/4 v0, 0x4

    .line 105
    iget-object v4, p2, Lj9/b;->c:Lj9/q;

    .line 106
    .line 107
    iget-object v4, v4, Lj9/q;->a:Lu7/m;

    .line 108
    .line 109
    iget v4, v4, Lu7/m;->b:I

    .line 110
    .line 111
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    aput-object v4, v3, v0

    .line 116
    .line 117
    const/4 v0, 0x5

    .line 118
    iget-object v4, p2, Lj9/b;->d:Lj9/i;

    .line 119
    .line 120
    iget-object v4, v4, Lj9/i;->a:Lj9/o;

    .line 121
    .line 122
    invoke-static {v4}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    aput-object v4, v3, v0

    .line 127
    .line 128
    const/4 v0, 0x6

    .line 129
    iget v4, p2, Lj9/b;->e:I

    .line 130
    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    aput-object v4, v3, v0

    .line 136
    .line 137
    const-string v0, "REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)"

    .line 138
    .line 139
    invoke-virtual {v2, v0, v3}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v5}, Li9/t0;->t(Lj9/a;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    return-void
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

.method public final p(Lg9/k0;)Lj9/k;
    .locals 11

    .line 1
    iget-boolean v0, p0, Li9/t0;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lj9/r;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lj9/r;-><init>(Lg9/k0;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p1, Lg9/k0;->e:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p1, Lg9/k0;->d:Lj9/o;

    .line 22
    .line 23
    invoke-virtual {p1}, Lj9/e;->m()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-virtual {p0, v2}, Li9/t0;->q(Ljava/lang/String;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_d

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lj9/k;

    .line 54
    .line 55
    invoke-virtual {v2}, Lj9/k;->b()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v5, v0, Lj9/r;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    new-array v5, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v6, "Collection IDs do not match"

    .line 68
    .line 69
    invoke-static {v6, v4, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v4, v0, Lj9/r;->b:Ljava/util/TreeSet;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/util/TreeSet;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    const/4 v5, 0x1

    .line 79
    if-le v4, v5, :cond_3

    .line 80
    .line 81
    move v4, v5

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move v4, v1

    .line 84
    :goto_2
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_4
    invoke-virtual {v2}, Lj9/k;->a()Lj9/k$c;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Lj9/r;->a(Lj9/k$c;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_5
    iget-object v4, v0, Lj9/r;->d:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v2}, Lj9/k;->c()Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    new-instance v7, Ljava/util/HashSet;

    .line 113
    .line 114
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    move v8, v1

    .line 118
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-ge v8, v9, :cond_6

    .line 123
    .line 124
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Lj9/k$c;

    .line 129
    .line 130
    invoke-virtual {v0, v9}, Lj9/r;->a(Lj9/k$c;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_6

    .line 135
    .line 136
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    check-cast v9, Lj9/k$c;

    .line 141
    .line 142
    invoke-virtual {v9}, Lj9/k$c;->f()Lj9/l;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v9}, Lj9/l;->h()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    add-int/lit8 v8, v8, 0x1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-ne v8, v9, :cond_7

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    iget-object v9, v0, Lj9/r;->b:Ljava/util/TreeSet;

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/util/TreeSet;->size()I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-lez v9, :cond_8

    .line 170
    .line 171
    iget-object v9, v0, Lj9/r;->b:Ljava/util/TreeSet;

    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Lg9/l;

    .line 178
    .line 179
    iget-object v10, v9, Lg9/l;->c:Lj9/l;

    .line 180
    .line 181
    invoke-virtual {v10}, Lj9/l;->h()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-nez v7, :cond_9

    .line 190
    .line 191
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, Lj9/k$c;

    .line 196
    .line 197
    invoke-static {v9, v7}, Lj9/r;->b(Lg9/l;Lj9/k$c;)Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_a

    .line 202
    .line 203
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    check-cast v9, Lg9/e0;

    .line 208
    .line 209
    invoke-static {v9, v7}, Lj9/r;->c(Lg9/e0;Lj9/k$c;)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-nez v7, :cond_9

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_8
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-ge v8, v7, :cond_b

    .line 221
    .line 222
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    check-cast v7, Lj9/k$c;

    .line 227
    .line 228
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-eqz v9, :cond_a

    .line 233
    .line 234
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    check-cast v9, Lg9/e0;

    .line 239
    .line 240
    invoke-static {v9, v7}, Lj9/r;->c(Lg9/e0;Lj9/k$c;)Z

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    if-nez v7, :cond_9

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_9
    add-int/2addr v8, v5

    .line 248
    goto :goto_4

    .line 249
    :cond_a
    :goto_5
    move v5, v1

    .line 250
    :cond_b
    :goto_6
    if-eqz v5, :cond_2

    .line 251
    .line 252
    if-eqz v3, :cond_c

    .line 253
    .line 254
    invoke-virtual {v2}, Lj9/k;->f()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    invoke-virtual {v3}, Lj9/k;->f()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-le v4, v5, :cond_2

    .line 271
    .line 272
    :cond_c
    move-object v3, v2

    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :cond_d
    return-object v3
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
.end method

.method public final q(Ljava/lang/String;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection<",
            "Lj9/k;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Li9/t0;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iget-object v0, p0, Li9/t0;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final s(Lg9/k0;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/k0;",
            ")",
            "Ljava/util/List<",
            "Lg9/k0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/t0;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Li9/t0;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p1, Lg9/k0;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    new-instance v1, Lg9/g;

    .line 37
    .line 38
    iget-object v2, p1, Lg9/k0;->c:Ljava/util/List;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v1, v2, v3}, Lg9/g;-><init>(Ljava/util/List;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lg9/g;->b()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    goto :goto_4

    .line 59
    :cond_2
    invoke-static {v1}, Ln9/k;->f(Lg9/m;)Lg9/m;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Ln9/k;->e(Lg9/m;)Lg9/m;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Ln9/k;->g(Lg9/m;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v4, 0x0

    .line 72
    new-array v5, v4, [Ljava/lang/Object;

    .line 73
    .line 74
    const-string v6, "computeDistributedNormalForm did not result in disjunctive normal form"

    .line 75
    .line 76
    invoke-static {v6, v2, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    instance-of v2, v1, Lg9/l;

    .line 80
    .line 81
    if-nez v2, :cond_8

    .line 82
    .line 83
    instance-of v2, v1, Lg9/g;

    .line 84
    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    move-object v2, v1

    .line 88
    check-cast v2, Lg9/g;

    .line 89
    .line 90
    iget-object v5, v2, Lg9/g;->a:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lg9/m;

    .line 107
    .line 108
    instance-of v6, v6, Lg9/g;

    .line 109
    .line 110
    if-eqz v6, :cond_3

    .line 111
    .line 112
    move v5, v4

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    move v5, v3

    .line 115
    :goto_0
    if-eqz v5, :cond_5

    .line 116
    .line 117
    invoke-virtual {v2}, Lg9/g;->e()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    move v2, v3

    .line 124
    goto :goto_1

    .line 125
    :cond_5
    move v2, v4

    .line 126
    :goto_1
    if-eqz v2, :cond_6

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    move v3, v4

    .line 130
    :goto_2
    if-eqz v3, :cond_7

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    invoke-virtual {v1}, Lg9/m;->b()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    goto :goto_4

    .line 138
    :cond_8
    :goto_3
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Lg9/m;

    .line 157
    .line 158
    new-instance v12, Lg9/k0;

    .line 159
    .line 160
    iget-object v4, p1, Lg9/k0;->d:Lj9/o;

    .line 161
    .line 162
    iget-object v5, p1, Lg9/k0;->e:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v2}, Lg9/m;->b()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iget-object v7, p1, Lg9/k0;->b:Ljava/util/List;

    .line 169
    .line 170
    iget-wide v8, p1, Lg9/k0;->f:J

    .line 171
    .line 172
    iget-object v10, p1, Lg9/k0;->g:Lg9/e;

    .line 173
    .line 174
    iget-object v11, p1, Lg9/k0;->h:Lg9/e;

    .line 175
    .line 176
    move-object v3, v12

    .line 177
    invoke-direct/range {v3 .. v11}, Lg9/k0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLg9/e;Lg9/e;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_9
    :goto_6
    iget-object v1, p0, Li9/t0;->d:Ljava/util/HashMap;

    .line 185
    .line 186
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    return-object v0
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

.method public final start()V
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Li9/t0;->a:Li9/y0;

    const-string v2, "SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?"

    invoke-virtual {v1, v2}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Li9/t0;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Li9/y0$d;->a([Ljava/lang/Object;)V

    new-instance v3, Li9/p0;

    invoke-direct {v3, v0, v2}, Li9/p0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v3}, Li9/y0$d;->d(Ln9/d;)I

    iget-object v1, p0, Li9/t0;->a:Li9/y0;

    const-string v3, "SELECT index_id, collection_group, index_proto FROM index_configuration"

    invoke-virtual {v1, v3}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v1

    new-instance v3, Li9/q0;

    invoke-direct {v3, v2, p0, v0}, Li9/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li9/y0$d;->d(Ln9/d;)I

    iput-boolean v2, p0, Li9/t0;->h:Z

    return-void
.end method

.method public final t(Lj9/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li9/t0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lj9/a;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Map;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Li9/t0;->f:Ljava/util/HashMap;

    .line 19
    .line 20
    iget-object v2, p1, Lj9/a;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    iget v1, p1, Lj9/a;->c:I

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lj9/k;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget v1, p1, Lj9/a;->c:I

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Li9/t0;->g:Ljava/util/PriorityQueue;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iget v0, p0, Li9/t0;->i:I

    .line 59
    .line 60
    iget v1, p1, Lj9/a;->c:I

    .line 61
    .line 62
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, Li9/t0;->i:I

    .line 67
    .line 68
    iget-wide v0, p0, Li9/t0;->j:J

    .line 69
    .line 70
    iget-object p1, p1, Lj9/a;->f:Lj9/k$b;

    .line 71
    .line 72
    invoke-virtual {p1}, Lj9/k$b;->b()J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iput-wide v0, p0, Li9/t0;->j:J

    .line 81
    .line 82
    return-void
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
.end method
