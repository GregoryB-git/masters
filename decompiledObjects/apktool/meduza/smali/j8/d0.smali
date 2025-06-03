.class public final Lj8/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj8/t;

.field public final b:Lp8/c;

.field public final c:Lq8/a;

.field public final d:Ll8/f;

.field public final e:Ll8/n;

.field public final f:Lj8/a0;

.field public final g:Lk8/i;


# direct methods
.method public constructor <init>(Lj8/t;Lp8/c;Lq8/a;Ll8/f;Ll8/n;Lj8/a0;Lk8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/d0;->a:Lj8/t;

    iput-object p2, p0, Lj8/d0;->b:Lp8/c;

    iput-object p3, p0, Lj8/d0;->c:Lq8/a;

    iput-object p4, p0, Lj8/d0;->d:Ll8/f;

    iput-object p5, p0, Lj8/d0;->e:Ll8/n;

    iput-object p6, p0, Lj8/d0;->f:Lj8/a0;

    iput-object p7, p0, Lj8/d0;->g:Lk8/i;

    return-void
.end method

.method public static a(Lm8/l;Ll8/f;Ll8/n;Ljava/util/Map;)Lm8/l;
    .locals 9

    .line 1
    new-instance v0, Lm8/l$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm8/l$a;-><init>(Lm8/f0$e$d;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Ll8/f;->b:Ll8/d;

    .line 7
    .line 8
    invoke-interface {p1}, Ll8/d;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const-string v3, "FirebaseCrashlytics"

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance v4, Lm8/v;

    .line 19
    .line 20
    invoke-direct {v4, p1}, Lm8/v;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v4, v0, Lm8/l$a;->e:Lm8/f0$e$d$d;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x2

    .line 27
    invoke-static {v3, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const-string p1, "No log data to include with this event."

    .line 34
    .line 35
    invoke-static {v3, p1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p2, Ll8/n;->d:Ll8/n$a;

    .line 48
    .line 49
    invoke-virtual {p1}, Ll8/n$a;->a()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    iget-object p1, p2, Ll8/n;->d:Ll8/n$a;

    .line 55
    .line 56
    invoke-virtual {p1}, Ll8/n$a;->a()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v4, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    const/16 v5, 0x400

    .line 78
    .line 79
    if-eqz p3, :cond_5

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Ljava/util/Map$Entry;

    .line 86
    .line 87
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v5, v6}, Ll8/e;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    const/16 v8, 0x40

    .line 102
    .line 103
    if-lt v7, v8, :cond_4

    .line 104
    .line 105
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    :goto_2
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    check-cast p3, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v5, p3}, Ll8/e;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-virtual {v4, v6, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    if-lez v1, :cond_6

    .line 130
    .line 131
    const-string p1, "Ignored "

    .line 132
    .line 133
    const-string p3, " keys when adding event specific keys. Maximum allowable: "

    .line 134
    .line 135
    invoke-static {p1, v1, p3, v5}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v3, p1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_3
    invoke-static {p1}, Lj8/d0;->d(Ljava/util/Map;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p2, p2, Ll8/n;->e:Ll8/n$a;

    .line 151
    .line 152
    invoke-virtual {p2}, Ll8/n$a;->a()Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-static {p2}, Lj8/d0;->d(Ljava/util/Map;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    if-eqz p3, :cond_7

    .line 165
    .line 166
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-nez p3, :cond_8

    .line 171
    .line 172
    :cond_7
    iget-object p0, p0, Lm8/l;->c:Lm8/f0$e$d$a;

    .line 173
    .line 174
    invoke-virtual {p0}, Lm8/f0$e$d$a;->h()Lm8/m$a;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iput-object p1, p0, Lm8/m$a;->b:Ljava/util/List;

    .line 179
    .line 180
    iput-object p2, p0, Lm8/m$a;->c:Ljava/util/List;

    .line 181
    .line 182
    invoke-virtual {p0}, Lm8/m$a;->a()Lm8/m;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    iput-object p0, v0, Lm8/l$a;->c:Lm8/f0$e$d$a;

    .line 187
    .line 188
    :cond_8
    invoke-virtual {v0}, Lm8/l$a;->a()Lm8/l;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
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

.method public static b(Lm8/l;Ll8/n;)Lm8/f0$e$d;
    .locals 7

    .line 1
    iget-object p1, p1, Ll8/n;->f:Ll8/l;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p1, Ll8/l;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p1

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v1, v2, :cond_4

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ll8/k;

    .line 33
    .line 34
    new-instance v3, Lm8/w$a;

    .line 35
    .line 36
    invoke-direct {v3}, Lm8/w$a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ll8/k;->f()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, Ll8/k;->d()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    new-instance v6, Lm8/x;

    .line 52
    .line 53
    invoke-direct {v6, v5, v4}, Lm8/x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v6, v3, Lm8/w$a;->a:Lm8/f0$e$d$e$b;

    .line 57
    .line 58
    invoke-virtual {v2}, Ll8/k;->b()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iput-object v4, v3, Lm8/w$a;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2}, Ll8/k;->c()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    iput-object v4, v3, Lm8/w$a;->c:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v2}, Ll8/k;->e()J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    iput-wide v4, v3, Lm8/w$a;->d:J

    .line 79
    .line 80
    iget-byte v2, v3, Lm8/w$a;->e:B

    .line 81
    .line 82
    or-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    int-to-byte v2, v2

    .line 85
    iput-byte v2, v3, Lm8/w$a;->e:B

    .line 86
    .line 87
    invoke-virtual {v3}, Lm8/w$a;->a()Lm8/w;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 98
    .line 99
    const-string p1, "Null parameterValue"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 106
    .line 107
    const-string p1, "Null parameterKey"

    .line 108
    .line 109
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    const-string p1, "Null rolloutId"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 122
    .line 123
    const-string p1, "Null variantId"

    .line 124
    .line 125
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_5
    new-instance v0, Lm8/l$a;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Lm8/l$a;-><init>(Lm8/f0$e$d;)V

    .line 139
    .line 140
    .line 141
    new-instance p0, Lm8/y;

    .line 142
    .line 143
    invoke-direct {p0, p1}, Lm8/y;-><init>(Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    iput-object p0, v0, Lm8/l$a;->f:Lm8/f0$e$d$f;

    .line 147
    .line 148
    invoke-virtual {v0}, Lm8/l$a;->a()Lm8/l;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :catchall_0
    move-exception p0

    .line 154
    monitor-exit p1

    .line 155
    throw p0
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

.method public static c(Landroid/content/Context;Lj8/a0;Lp8/e;Lj8/a;Ll8/f;Ll8/n;Ls8/a;Lr8/f;Ll/l;Lj8/j;Lk8/i;)Lj8/d0;
    .locals 9

    .line 1
    new-instance v6, Lj8/t;

    .line 2
    .line 3
    move-object v0, v6

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p6

    .line 8
    move-object/from16 v5, p7

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lj8/t;-><init>(Landroid/content/Context;Lj8/a0;Lj8/a;Ls8/a;Lr8/f;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lp8/c;

    .line 14
    .line 15
    move-object v0, p2

    .line 16
    move-object/from16 v3, p7

    .line 17
    .line 18
    move-object/from16 v1, p9

    .line 19
    .line 20
    invoke-direct {v2, p2, v3, v1}, Lp8/c;-><init>(Lp8/e;Lr8/f;Lj8/j;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lq8/a;->b:Ln8/a;

    .line 24
    .line 25
    invoke-static {p0}, Lk3/w;->b(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lk3/w;->a()Lk3/w;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Li3/a;

    .line 33
    .line 34
    sget-object v4, Lq8/a;->c:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v5, Lq8/a;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v1, v4, v5}, Li3/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lk3/w;->c(Li3/a;)Lk3/t;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lh3/c;

    .line 46
    .line 47
    const-string v4, "json"

    .line 48
    .line 49
    invoke-direct {v1, v4}, Lh3/c;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v4, Lq8/a;->e:Lw3/v;

    .line 53
    .line 54
    const-string v5, "FIREBASE_CRASHLYTICS_REPORT"

    .line 55
    .line 56
    invoke-virtual {v0, v5, v1, v4}, Lk3/t;->a(Ljava/lang/String;Lh3/c;Lh3/g;)Lk3/u;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lq8/c;

    .line 61
    .line 62
    invoke-virtual/range {p7 .. p7}, Lr8/f;->b()Lr8/c;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    move-object/from16 v4, p8

    .line 67
    .line 68
    invoke-direct {v1, v0, v3, v4}, Lq8/c;-><init>(Lh3/h;Lr8/c;Ll/l;)V

    .line 69
    .line 70
    .line 71
    new-instance v3, Lq8/a;

    .line 72
    .line 73
    invoke-direct {v3, v1}, Lq8/a;-><init>(Lq8/c;)V

    .line 74
    .line 75
    .line 76
    new-instance v8, Lj8/d0;

    .line 77
    .line 78
    move-object v0, v8

    .line 79
    move-object v1, v6

    .line 80
    move-object v4, p4

    .line 81
    move-object v5, p5

    .line 82
    move-object v6, p1

    .line 83
    move-object/from16 v7, p10

    .line 84
    .line 85
    invoke-direct/range {v0 .. v7}, Lj8/d0;-><init>(Lj8/t;Lp8/c;Lq8/a;Ll8/f;Ll8/n;Lj8/a0;Lk8/i;)V

    .line 86
    .line 87
    .line 88
    return-object v8
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
.end method

.method public static d(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lm8/f0$c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    new-instance v3, Lm8/e;

    .line 50
    .line 51
    invoke-direct {v3, v2, v1}, Lm8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    const-string v0, "Null value"

    .line 61
    .line 62
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 67
    .line 68
    const-string v0, "Null key"

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_2
    new-instance p0, Lv4/d;

    .line 75
    .line 76
    const/4 v1, 0x7

    .line 77
    invoke-direct {p0, v1}, Lv4/d;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
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


# virtual methods
.method public final e(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ll8/c;Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "crash"

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v4, v0, Lj8/d0;->a:Lj8/t;

    .line 14
    .line 15
    iget-wide v5, v2, Ll8/c;->b:J

    .line 16
    .line 17
    iget-object v7, v4, Lj8/t;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I

    .line 28
    .line 29
    iget-object v8, v4, Lj8/t;->d:Ls8/c;

    .line 30
    .line 31
    new-instance v9, Ljava/util/Stack;

    .line 32
    .line 33
    invoke-direct {v9}, Ljava/util/Stack;-><init>()V

    .line 34
    .line 35
    .line 36
    move-object/from16 v10, p1

    .line 37
    .line 38
    :goto_0
    if-eqz v10, :cond_0

    .line 39
    .line 40
    invoke-virtual {v9, v10}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v10}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v10, 0x0

    .line 49
    move-object v11, v10

    .line 50
    :goto_1
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-nez v12, :cond_1

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    check-cast v12, Ljava/lang/Throwable;

    .line 61
    .line 62
    new-instance v13, Lz5/j;

    .line 63
    .line 64
    invoke-virtual {v12}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    invoke-virtual {v12}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    invoke-interface {v8, v12}, Ls8/c;->b([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-direct {v13, v14, v15, v12, v11}, Lz5/j;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;Lz5/j;)V

    .line 85
    .line 86
    .line 87
    move-object v11, v13

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    new-instance v15, Lm8/l$a;

    .line 90
    .line 91
    invoke-direct {v15}, Lm8/l$a;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v1, v15, Lm8/l$a;->b:Ljava/lang/String;

    .line 95
    .line 96
    iput-wide v5, v15, Lm8/l$a;->a:J

    .line 97
    .line 98
    iget-byte v1, v15, Lm8/l$a;->g:B

    .line 99
    .line 100
    const/4 v5, 0x1

    .line 101
    or-int/2addr v1, v5

    .line 102
    int-to-byte v1, v1

    .line 103
    iput-byte v1, v15, Lm8/l$a;->g:B

    .line 104
    .line 105
    sget-object v1, Lg8/e;->a:Lg8/e;

    .line 106
    .line 107
    iget-object v6, v4, Lj8/t;->a:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {v1, v6}, Lg8/e;->c(Landroid/content/Context;)Lm8/f0$e$d$a$c;

    .line 110
    .line 111
    .line 112
    move-result-object v13

    .line 113
    invoke-virtual {v13}, Lm8/f0$e$d$a$c;->a()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-lez v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {v13}, Lm8/f0$e$d$a$c;->a()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const/16 v6, 0x64

    .line 124
    .line 125
    if-eq v1, v6, :cond_2

    .line 126
    .line 127
    move v1, v5

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    const/4 v1, 0x0

    .line 130
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    move-object v12, v1

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    move-object v12, v10

    .line 137
    :goto_3
    iget-object v1, v4, Lj8/t;->a:Landroid/content/Context;

    .line 138
    .line 139
    invoke-static {v1}, Lg8/e;->b(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    or-int/lit8 v1, v5, 0x0

    .line 144
    .line 145
    int-to-byte v1, v1

    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-object v8, v11, Lz5/j;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v8, [Ljava/lang/StackTraceElement;

    .line 156
    .line 157
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    const-string v10, "Null name"

    .line 162
    .line 163
    if-eqz v9, :cond_13

    .line 164
    .line 165
    int-to-byte v5, v5

    .line 166
    move-object/from16 p1, v15

    .line 167
    .line 168
    const/4 v15, 0x4

    .line 169
    invoke-static {v8, v15}, Lj8/t;->d([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    const-string v15, "Null frames"

    .line 174
    .line 175
    if-eqz v8, :cond_12

    .line 176
    .line 177
    move/from16 v22, v3

    .line 178
    .line 179
    const-string v3, " importance"

    .line 180
    .line 181
    const-string v0, "Missing required properties:"

    .line 182
    .line 183
    const/4 v2, 0x1

    .line 184
    if-ne v5, v2, :cond_10

    .line 185
    .line 186
    new-instance v2, Lm8/r;

    .line 187
    .line 188
    move/from16 v23, v7

    .line 189
    .line 190
    const/4 v7, 0x4

    .line 191
    invoke-direct {v2, v9, v7, v8}, Lm8/r;-><init>(Ljava/lang/String;ILjava/util/List;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    if-eqz p5, :cond_9

    .line 198
    .line 199
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :cond_4
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_9

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    check-cast v7, Ljava/util/Map$Entry;

    .line 222
    .line 223
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    check-cast v8, Ljava/lang/Thread;

    .line 228
    .line 229
    move-object/from16 v9, p2

    .line 230
    .line 231
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    if-nez v16, :cond_4

    .line 236
    .line 237
    move-object/from16 p3, v2

    .line 238
    .line 239
    iget-object v2, v4, Lj8/t;->d:Ls8/c;

    .line 240
    .line 241
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    check-cast v7, [Ljava/lang/StackTraceElement;

    .line 246
    .line 247
    invoke-interface {v2, v7}, Ls8/c;->b([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v8}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    if-eqz v7, :cond_8

    .line 256
    .line 257
    const/4 v8, 0x0

    .line 258
    invoke-static {v2, v8}, Lj8/t;->d([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    if-eqz v2, :cond_7

    .line 263
    .line 264
    const/4 v8, 0x1

    .line 265
    if-ne v5, v8, :cond_5

    .line 266
    .line 267
    new-instance v8, Lm8/r;

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    invoke-direct {v8, v7, v9, v2}, Lm8/r;-><init>(Ljava/lang/String;ILjava/util/List;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-object/from16 v2, p3

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    and-int/lit8 v2, v5, 0x1

    .line 285
    .line 286
    if-nez v2, :cond_6

    .line 287
    .line 288
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-static {v0, v1}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v2

    .line 301
    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    .line 302
    .line 303
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    .line 308
    .line 309
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_9
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v17

    .line 317
    const/4 v2, 0x0

    .line 318
    invoke-static {v11, v2}, Lj8/t;->c(Lz5/j;I)Lm8/p;

    .line 319
    .line 320
    .line 321
    move-result-object v18

    .line 322
    const-wide/16 v2, 0x0

    .line 323
    .line 324
    const/4 v6, 0x1

    .line 325
    if-ne v5, v6, :cond_e

    .line 326
    .line 327
    new-instance v5, Lm8/q;

    .line 328
    .line 329
    const-string v6, "0"

    .line 330
    .line 331
    invoke-direct {v5, v6, v6, v2, v3}, Lm8/q;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4}, Lj8/t;->a()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v21

    .line 338
    if-eqz v21, :cond_d

    .line 339
    .line 340
    new-instance v9, Lm8/n;

    .line 341
    .line 342
    move-object/from16 v16, v9

    .line 343
    .line 344
    move-object/from16 v20, v5

    .line 345
    .line 346
    invoke-direct/range {v16 .. v21}, Lm8/n;-><init>(Ljava/util/List;Lm8/f0$e$d$a$b$b;Lm8/f0$a;Lm8/f0$e$d$a$b$c;Ljava/util/List;)V

    .line 347
    .line 348
    .line 349
    const/4 v2, 0x1

    .line 350
    if-ne v1, v2, :cond_b

    .line 351
    .line 352
    new-instance v0, Lm8/m;

    .line 353
    .line 354
    const/4 v10, 0x0

    .line 355
    const/4 v11, 0x0

    .line 356
    move-object v8, v0

    .line 357
    move-object/from16 v1, p1

    .line 358
    .line 359
    move/from16 v15, v23

    .line 360
    .line 361
    invoke-direct/range {v8 .. v15}, Lm8/m;-><init>(Lm8/f0$e$d$a$b;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lm8/f0$e$d$a$c;Ljava/util/List;I)V

    .line 362
    .line 363
    .line 364
    iput-object v0, v1, Lm8/l$a;->c:Lm8/f0$e$d$a;

    .line 365
    .line 366
    move/from16 v0, v23

    .line 367
    .line 368
    invoke-virtual {v4, v0}, Lj8/t;->b(I)Lm8/u;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v0, v1, Lm8/l$a;->d:Lm8/f0$e$d$c;

    .line 373
    .line 374
    invoke-virtual {v1}, Lm8/l$a;->a()Lm8/l;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    move-object/from16 v1, p4

    .line 379
    .line 380
    iget-object v2, v1, Ll8/c;->c:Ljava/util/Map;

    .line 381
    .line 382
    move-object/from16 v4, p0

    .line 383
    .line 384
    iget-object v3, v4, Lj8/d0;->d:Ll8/f;

    .line 385
    .line 386
    iget-object v5, v4, Lj8/d0;->e:Ll8/n;

    .line 387
    .line 388
    invoke-static {v0, v3, v5, v2}, Lj8/d0;->a(Lm8/l;Ll8/f;Ll8/n;Ljava/util/Map;)Lm8/l;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    iget-object v2, v4, Lj8/d0;->e:Ll8/n;

    .line 393
    .line 394
    invoke-static {v0, v2}, Lj8/d0;->b(Lm8/l;Ll8/n;)Lm8/f0$e$d;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-nez p5, :cond_a

    .line 399
    .line 400
    iget-object v2, v4, Lj8/d0;->g:Lk8/i;

    .line 401
    .line 402
    iget-object v2, v2, Lk8/i;->b:Lk8/b;

    .line 403
    .line 404
    new-instance v3, Lj8/c0;

    .line 405
    .line 406
    move/from16 v5, v22

    .line 407
    .line 408
    invoke-direct {v3, v4, v0, v1, v5}, Lj8/c0;-><init>(Lj8/d0;Lm8/f0$e$d;Ll8/c;Z)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v3}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :cond_a
    move/from16 v5, v22

    .line 416
    .line 417
    iget-object v2, v4, Lj8/d0;->b:Lp8/c;

    .line 418
    .line 419
    iget-object v1, v1, Ll8/c;->a:Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v2, v0, v1, v5}, Lp8/c;->c(Lm8/f0$e$d;Ljava/lang/String;Z)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_b
    move-object/from16 v4, p0

    .line 426
    .line 427
    new-instance v2, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    and-int/lit8 v1, v1, 0x1

    .line 433
    .line 434
    if-nez v1, :cond_c

    .line 435
    .line 436
    const-string v1, " uiOrientation"

    .line 437
    .line 438
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 442
    .line 443
    invoke-static {v0, v2}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v1

    .line 451
    :cond_d
    move-object/from16 v4, p0

    .line 452
    .line 453
    new-instance v0, Ljava/lang/NullPointerException;

    .line 454
    .line 455
    const-string v1, "Null binaries"

    .line 456
    .line 457
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :cond_e
    move-object/from16 v4, p0

    .line 462
    .line 463
    new-instance v1, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    and-int/lit8 v2, v5, 0x1

    .line 469
    .line 470
    if-nez v2, :cond_f

    .line 471
    .line 472
    const-string v2, " address"

    .line 473
    .line 474
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    :cond_f
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 478
    .line 479
    invoke-static {v0, v1}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v2

    .line 487
    :cond_10
    move-object/from16 v4, p0

    .line 488
    .line 489
    new-instance v1, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    and-int/lit8 v2, v5, 0x1

    .line 495
    .line 496
    if-nez v2, :cond_11

    .line 497
    .line 498
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    :cond_11
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 502
    .line 503
    invoke-static {v0, v1}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    throw v2

    .line 511
    :cond_12
    move-object v4, v0

    .line 512
    new-instance v0, Ljava/lang/NullPointerException;

    .line 513
    .line 514
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw v0

    .line 518
    :cond_13
    move-object v4, v0

    .line 519
    new-instance v0, Ljava/lang/NullPointerException;

    .line 520
    .line 521
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    throw v0
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
.end method

.method public final f(Ljava/lang/String;Ljava/util/List;Ll8/f;Ll8/n;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;",
            "Ll8/f;",
            "Ll8/n;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    iget-object v0, v1, Lj8/d0;->b:Lp8/c;

    .line 8
    .line 9
    iget-object v0, v0, Lp8/c;->b:Lp8/e;

    .line 10
    .line 11
    const-string v4, "start-time"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v4}, Lp8/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/4 v7, 0x0

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Landroid/app/ApplicationExitInfo;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    cmp-long v8, v8, v4

    .line 43
    .line 44
    if-gez v8, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getReason()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const/4 v9, 0x6

    .line 52
    if-eq v8, v9, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    move-object v6, v7

    .line 56
    :cond_2
    const-string v4, "FirebaseCrashlytics"

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    if-nez v6, :cond_4

    .line 60
    .line 61
    const-string v0, "No relevant ApplicationExitInfo occurred during session: "

    .line 62
    .line 63
    invoke-static {v0, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-static {v4, v0, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void

    .line 77
    :cond_4
    iget-object v8, v1, Lj8/d0;->a:Lj8/t;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    :try_start_0
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    if-eqz v9, :cond_6

    .line 85
    .line 86
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 87
    .line 88
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 89
    .line 90
    .line 91
    const/16 v11, 0x2000

    .line 92
    .line 93
    new-array v11, v11, [B

    .line 94
    .line 95
    :goto_2
    invoke-virtual {v9, v11}, Ljava/io/InputStream;->read([B)I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    const/4 v13, -0x1

    .line 100
    if-eq v12, v13, :cond_5

    .line 101
    .line 102
    invoke-virtual {v10, v11, v0, v12}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v10, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    goto :goto_3

    .line 117
    :catch_0
    move-exception v0

    .line 118
    const-string v9, "Could not get input trace in application exit info: "

    .line 119
    .line 120
    invoke-static {v9}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v10, " Error: "

    .line 132
    .line 133
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v4, v0, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_3
    new-instance v0, Lm8/c$a;

    .line 147
    .line 148
    invoke-direct {v0}, Lm8/c$a;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getImportance()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    iput v9, v0, Lm8/c$a;->d:I

    .line 156
    .line 157
    iget-byte v9, v0, Lm8/c$a;->j:B

    .line 158
    .line 159
    or-int/lit8 v9, v9, 0x4

    .line 160
    .line 161
    int-to-byte v9, v9

    .line 162
    iput-byte v9, v0, Lm8/c$a;->j:B

    .line 163
    .line 164
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getProcessName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    const-string v10, "Null processName"

    .line 169
    .line 170
    if-eqz v9, :cond_14

    .line 171
    .line 172
    iput-object v9, v0, Lm8/c$a;->b:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getReason()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    iput v9, v0, Lm8/c$a;->c:I

    .line 179
    .line 180
    iget-byte v9, v0, Lm8/c$a;->j:B

    .line 181
    .line 182
    or-int/2addr v9, v5

    .line 183
    int-to-byte v9, v9

    .line 184
    iput-byte v9, v0, Lm8/c$a;->j:B

    .line 185
    .line 186
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    iput-wide v11, v0, Lm8/c$a;->g:J

    .line 191
    .line 192
    iget-byte v9, v0, Lm8/c$a;->j:B

    .line 193
    .line 194
    or-int/lit8 v9, v9, 0x20

    .line 195
    .line 196
    int-to-byte v9, v9

    .line 197
    iput-byte v9, v0, Lm8/c$a;->j:B

    .line 198
    .line 199
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getPid()I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    iput v9, v0, Lm8/c$a;->a:I

    .line 204
    .line 205
    iget-byte v9, v0, Lm8/c$a;->j:B

    .line 206
    .line 207
    or-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    int-to-byte v9, v9

    .line 210
    iput-byte v9, v0, Lm8/c$a;->j:B

    .line 211
    .line 212
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getPss()J

    .line 213
    .line 214
    .line 215
    move-result-wide v11

    .line 216
    iput-wide v11, v0, Lm8/c$a;->e:J

    .line 217
    .line 218
    iget-byte v9, v0, Lm8/c$a;->j:B

    .line 219
    .line 220
    or-int/lit8 v9, v9, 0x8

    .line 221
    .line 222
    int-to-byte v9, v9

    .line 223
    iput-byte v9, v0, Lm8/c$a;->j:B

    .line 224
    .line 225
    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getRss()J

    .line 226
    .line 227
    .line 228
    move-result-wide v11

    .line 229
    iput-wide v11, v0, Lm8/c$a;->f:J

    .line 230
    .line 231
    iget-byte v6, v0, Lm8/c$a;->j:B

    .line 232
    .line 233
    or-int/lit8 v6, v6, 0x10

    .line 234
    .line 235
    int-to-byte v6, v6

    .line 236
    iput-byte v6, v0, Lm8/c$a;->j:B

    .line 237
    .line 238
    iput-object v7, v0, Lm8/c$a;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v0}, Lm8/c$a;->a()Lm8/c;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v6, v8, Lj8/t;->a:Landroid/content/Context;

    .line 245
    .line 246
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    .line 255
    .line 256
    new-instance v7, Lm8/l$a;

    .line 257
    .line 258
    invoke-direct {v7}, Lm8/l$a;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v9, "anr"

    .line 262
    .line 263
    iput-object v9, v7, Lm8/l$a;->b:Ljava/lang/String;

    .line 264
    .line 265
    iget-wide v11, v0, Lm8/c;->g:J

    .line 266
    .line 267
    iput-wide v11, v7, Lm8/l$a;->a:J

    .line 268
    .line 269
    iget-byte v9, v7, Lm8/l$a;->g:B

    .line 270
    .line 271
    or-int/lit8 v9, v9, 0x1

    .line 272
    .line 273
    int-to-byte v9, v9

    .line 274
    iput-byte v9, v7, Lm8/l$a;->g:B

    .line 275
    .line 276
    iget-object v9, v8, Lj8/t;->e:Lr8/h;

    .line 277
    .line 278
    check-cast v9, Lr8/f;

    .line 279
    .line 280
    invoke-virtual {v9}, Lr8/f;->b()Lr8/c;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    iget-object v9, v9, Lr8/c;->b:Lr8/c$a;

    .line 285
    .line 286
    iget-boolean v9, v9, Lr8/c$a;->c:Z

    .line 287
    .line 288
    if-eqz v9, :cond_b

    .line 289
    .line 290
    iget-object v9, v8, Lj8/t;->c:Lj8/a;

    .line 291
    .line 292
    iget-object v9, v9, Lj8/a;->c:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-lez v9, :cond_b

    .line 299
    .line 300
    new-instance v9, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    iget-object v11, v8, Lj8/t;->c:Lj8/a;

    .line 306
    .line 307
    iget-object v11, v11, Lj8/a;->c:Ljava/util/List;

    .line 308
    .line 309
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    if-eqz v12, :cond_a

    .line 318
    .line 319
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    check-cast v12, Lj8/e;

    .line 324
    .line 325
    iget-object v13, v12, Lj8/e;->a:Ljava/lang/String;

    .line 326
    .line 327
    if-eqz v13, :cond_9

    .line 328
    .line 329
    iget-object v14, v12, Lj8/e;->b:Ljava/lang/String;

    .line 330
    .line 331
    if-eqz v14, :cond_8

    .line 332
    .line 333
    iget-object v12, v12, Lj8/e;->c:Ljava/lang/String;

    .line 334
    .line 335
    if-eqz v12, :cond_7

    .line 336
    .line 337
    new-instance v15, Lm8/d;

    .line 338
    .line 339
    invoke-direct {v15, v14, v13, v12}, Lm8/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    .line 347
    .line 348
    const-string v2, "Null buildId"

    .line 349
    .line 350
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    .line 355
    .line 356
    const-string v2, "Null arch"

    .line 357
    .line 358
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_9
    new-instance v0, Ljava/lang/NullPointerException;

    .line 363
    .line 364
    const-string v2, "Null libraryName"

    .line 365
    .line 366
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v0

    .line 370
    :cond_a
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    goto :goto_5

    .line 375
    :cond_b
    const/4 v9, 0x0

    .line 376
    :goto_5
    new-instance v11, Lm8/c$a;

    .line 377
    .line 378
    invoke-direct {v11}, Lm8/c$a;-><init>()V

    .line 379
    .line 380
    .line 381
    iget v12, v0, Lm8/c;->d:I

    .line 382
    .line 383
    iput v12, v11, Lm8/c$a;->d:I

    .line 384
    .line 385
    iget-byte v12, v11, Lm8/c$a;->j:B

    .line 386
    .line 387
    or-int/lit8 v12, v12, 0x4

    .line 388
    .line 389
    int-to-byte v12, v12

    .line 390
    iput-byte v12, v11, Lm8/c$a;->j:B

    .line 391
    .line 392
    iget-object v13, v0, Lm8/c;->b:Ljava/lang/String;

    .line 393
    .line 394
    if-eqz v13, :cond_13

    .line 395
    .line 396
    iput-object v13, v11, Lm8/c$a;->b:Ljava/lang/String;

    .line 397
    .line 398
    iget v10, v0, Lm8/c;->c:I

    .line 399
    .line 400
    iput v10, v11, Lm8/c$a;->c:I

    .line 401
    .line 402
    or-int/2addr v5, v12

    .line 403
    int-to-byte v5, v5

    .line 404
    iget-wide v12, v0, Lm8/c;->g:J

    .line 405
    .line 406
    iput-wide v12, v11, Lm8/c$a;->g:J

    .line 407
    .line 408
    or-int/lit8 v5, v5, 0x20

    .line 409
    .line 410
    int-to-byte v5, v5

    .line 411
    iget v10, v0, Lm8/c;->a:I

    .line 412
    .line 413
    iput v10, v11, Lm8/c$a;->a:I

    .line 414
    .line 415
    or-int/lit8 v5, v5, 0x1

    .line 416
    .line 417
    int-to-byte v5, v5

    .line 418
    iget-wide v12, v0, Lm8/c;->e:J

    .line 419
    .line 420
    iput-wide v12, v11, Lm8/c$a;->e:J

    .line 421
    .line 422
    or-int/lit8 v5, v5, 0x8

    .line 423
    .line 424
    int-to-byte v5, v5

    .line 425
    iget-wide v12, v0, Lm8/c;->f:J

    .line 426
    .line 427
    iput-wide v12, v11, Lm8/c$a;->f:J

    .line 428
    .line 429
    or-int/lit8 v5, v5, 0x10

    .line 430
    .line 431
    int-to-byte v5, v5

    .line 432
    iput-byte v5, v11, Lm8/c$a;->j:B

    .line 433
    .line 434
    iget-object v0, v0, Lm8/c;->h:Ljava/lang/String;

    .line 435
    .line 436
    iput-object v0, v11, Lm8/c$a;->h:Ljava/lang/String;

    .line 437
    .line 438
    iput-object v9, v11, Lm8/c$a;->i:Ljava/util/List;

    .line 439
    .line 440
    invoke-virtual {v11}, Lm8/c$a;->a()Lm8/c;

    .line 441
    .line 442
    .line 443
    move-result-object v15

    .line 444
    iget v0, v15, Lm8/c;->d:I

    .line 445
    .line 446
    const/16 v5, 0x64

    .line 447
    .line 448
    if-eq v0, v5, :cond_c

    .line 449
    .line 450
    const/4 v0, 0x1

    .line 451
    goto :goto_6

    .line 452
    :cond_c
    const/4 v0, 0x0

    .line 453
    :goto_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    sget-object v11, Lg8/e;->a:Lg8/e;

    .line 458
    .line 459
    iget-object v12, v15, Lm8/c;->b:Ljava/lang/String;

    .line 460
    .line 461
    iget v13, v15, Lm8/c;->a:I

    .line 462
    .line 463
    iget v14, v15, Lm8/c;->d:I

    .line 464
    .line 465
    const-string v5, "processName"

    .line 466
    .line 467
    invoke-static {v12, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    const/16 v5, 0x8

    .line 471
    .line 472
    invoke-static {v11, v12, v13, v14, v5}, Lg8/e;->a(Lg8/e;Ljava/lang/String;III)Lm8/t;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    const/4 v11, 0x0

    .line 477
    or-int/lit8 v11, v11, 0x1

    .line 478
    .line 479
    int-to-byte v11, v11

    .line 480
    const-wide/16 v9, 0x0

    .line 481
    .line 482
    const/4 v12, 0x1

    .line 483
    int-to-byte v14, v12

    .line 484
    const-string v13, "Missing required properties:"

    .line 485
    .line 486
    if-ne v14, v12, :cond_11

    .line 487
    .line 488
    new-instance v14, Lm8/q;

    .line 489
    .line 490
    const-string v12, "0"

    .line 491
    .line 492
    invoke-direct {v14, v12, v12, v9, v10}, Lm8/q;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v8}, Lj8/t;->a()Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    if-eqz v9, :cond_10

    .line 500
    .line 501
    new-instance v10, Lm8/n;

    .line 502
    .line 503
    move-object v12, v10

    .line 504
    move-object/from16 v19, v13

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    move-object/from16 v16, v14

    .line 508
    .line 509
    const/4 v14, 0x0

    .line 510
    move-object/from16 v17, v9

    .line 511
    .line 512
    invoke-direct/range {v12 .. v17}, Lm8/n;-><init>(Ljava/util/List;Lm8/f0$e$d$a$b$b;Lm8/f0$a;Lm8/f0$e$d$a$b$c;Ljava/util/List;)V

    .line 513
    .line 514
    .line 515
    const/4 v9, 0x1

    .line 516
    if-ne v11, v9, :cond_e

    .line 517
    .line 518
    new-instance v9, Lm8/m;

    .line 519
    .line 520
    move-object v11, v9

    .line 521
    move-object v12, v10

    .line 522
    const/4 v10, 0x0

    .line 523
    move-object v13, v10

    .line 524
    const/4 v10, 0x0

    .line 525
    move-object v14, v10

    .line 526
    move-object v15, v0

    .line 527
    move-object/from16 v16, v5

    .line 528
    .line 529
    const/4 v0, 0x0

    .line 530
    move-object/from16 v17, v0

    .line 531
    .line 532
    move/from16 v18, v6

    .line 533
    .line 534
    invoke-direct/range {v11 .. v18}, Lm8/m;-><init>(Lm8/f0$e$d$a$b;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lm8/f0$e$d$a$c;Ljava/util/List;I)V

    .line 535
    .line 536
    .line 537
    iput-object v9, v7, Lm8/l$a;->c:Lm8/f0$e$d$a;

    .line 538
    .line 539
    invoke-virtual {v8, v6}, Lj8/t;->b(I)Lm8/u;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    iput-object v0, v7, Lm8/l$a;->d:Lm8/f0$e$d$c;

    .line 544
    .line 545
    invoke-virtual {v7}, Lm8/l$a;->a()Lm8/l;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    const-string v5, "Persisting anr for session "

    .line 550
    .line 551
    invoke-static {v5, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    const/4 v6, 0x3

    .line 556
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 557
    .line 558
    .line 559
    move-result v6

    .line 560
    if-eqz v6, :cond_d

    .line 561
    .line 562
    const/4 v6, 0x0

    .line 563
    invoke-static {v4, v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 564
    .line 565
    .line 566
    :cond_d
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    move-object/from16 v5, p3

    .line 571
    .line 572
    invoke-static {v0, v5, v3, v4}, Lj8/d0;->a(Lm8/l;Ll8/f;Ll8/n;Ljava/util/Map;)Lm8/l;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {v0, v3}, Lj8/d0;->b(Lm8/l;Ll8/n;)Lm8/f0$e$d;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object v3, v1, Lj8/d0;->b:Lp8/c;

    .line 581
    .line 582
    const/4 v4, 0x1

    .line 583
    invoke-virtual {v3, v0, v2, v4}, Lp8/c;->c(Lm8/f0$e$d;Ljava/lang/String;Z)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    and-int/lit8 v2, v11, 0x1

    .line 593
    .line 594
    if-nez v2, :cond_f

    .line 595
    .line 596
    const-string v2, " uiOrientation"

    .line 597
    .line 598
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    :cond_f
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 602
    .line 603
    move-object/from16 v3, v19

    .line 604
    .line 605
    invoke-static {v3, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    throw v2

    .line 613
    :cond_10
    new-instance v0, Ljava/lang/NullPointerException;

    .line 614
    .line 615
    const-string v2, "Null binaries"

    .line 616
    .line 617
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    throw v0

    .line 621
    :cond_11
    move-object v3, v13

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 625
    .line 626
    .line 627
    and-int/lit8 v2, v14, 0x1

    .line 628
    .line 629
    if-nez v2, :cond_12

    .line 630
    .line 631
    const-string v2, " address"

    .line 632
    .line 633
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    :cond_12
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 637
    .line 638
    invoke-static {v3, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    throw v2

    .line 646
    :cond_13
    new-instance v0, Ljava/lang/NullPointerException;

    .line 647
    .line 648
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    throw v0

    .line 652
    :cond_14
    new-instance v0, Ljava/lang/NullPointerException;

    .line 653
    .line 654
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v0
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
.end method

.method public final g(Lk8/b;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    .line 1
    iget-object v0, p0, Lj8/d0;->b:Lp8/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/io/File;

    .line 27
    .line 28
    :try_start_0
    sget-object v3, Lp8/c;->g:Ln8/a;

    .line 29
    .line 30
    invoke-static {v2}, Lp8/c;->d(Ljava/io/File;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Ln8/a;->i(Ljava/lang/String;)Lm8/b;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Lj8/b;

    .line 46
    .line 47
    invoke-direct {v5, v3, v4, v2}, Lj8/b;-><init>(Lm8/b;Ljava/lang/String;Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v3

    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v5, "Could not load report file "

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v5, "; deleting"

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const-string v5, "FirebaseCrashlytics"

    .line 78
    .line 79
    invoke-static {v5, v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_a

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lj8/u;

    .line 106
    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    invoke-virtual {v2}, Lj8/u;->c()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_1

    .line 118
    .line 119
    :cond_2
    iget-object v3, p0, Lj8/d0;->c:Lq8/a;

    .line 120
    .line 121
    invoke-virtual {v2}, Lj8/u;->a()Lm8/f0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v4}, Lm8/f0;->f()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const/4 v5, 0x1

    .line 130
    if-eqz v4, :cond_3

    .line 131
    .line 132
    invoke-virtual {v2}, Lj8/u;->a()Lm8/f0;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4}, Lm8/f0;->e()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-nez v4, :cond_4

    .line 141
    .line 142
    :cond_3
    iget-object v4, p0, Lj8/d0;->f:Lj8/a0;

    .line 143
    .line 144
    invoke-virtual {v4, v5}, Lj8/a0;->b(Z)Lj8/z;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v2}, Lj8/u;->a()Lm8/f0;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object v7, v4, Lj8/z;->a:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v6}, Lm8/f0;->m()Lm8/b$a;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iput-object v7, v6, Lm8/b$a;->e:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v6}, Lm8/b$a;->a()Lm8/b;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    iget-object v4, v4, Lj8/z;->b:Ljava/lang/String;

    .line 165
    .line 166
    new-instance v7, Lm8/b$a;

    .line 167
    .line 168
    invoke-direct {v7, v6}, Lm8/b$a;-><init>(Lm8/f0;)V

    .line 169
    .line 170
    .line 171
    iput-object v4, v7, Lm8/b$a;->f:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v7}, Lm8/b$a;->a()Lm8/b;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v2}, Lj8/u;->c()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v2}, Lj8/u;->b()Ljava/io/File;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    new-instance v7, Lj8/b;

    .line 186
    .line 187
    invoke-direct {v7, v4, v6, v2}, Lj8/b;-><init>(Lm8/b;Ljava/lang/String;Ljava/io/File;)V

    .line 188
    .line 189
    .line 190
    move-object v2, v7

    .line 191
    :cond_4
    const/4 v4, 0x0

    .line 192
    if-eqz p2, :cond_5

    .line 193
    .line 194
    move v6, v5

    .line 195
    goto :goto_2

    .line 196
    :cond_5
    move v6, v4

    .line 197
    :goto_2
    iget-object v3, v3, Lq8/a;->a:Lq8/c;

    .line 198
    .line 199
    iget-object v7, v3, Lq8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 200
    .line 201
    monitor-enter v7

    .line 202
    :try_start_1
    new-instance v8, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 203
    .line 204
    invoke-direct {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 205
    .line 206
    .line 207
    if-eqz v6, :cond_9

    .line 208
    .line 209
    iget-object v6, v3, Lq8/c;->i:Ll/l;

    .line 210
    .line 211
    iget-object v6, v6, Ll/l;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 214
    .line 215
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 216
    .line 217
    .line 218
    iget-object v6, v3, Lq8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/util/concurrent/ArrayBlockingQueue;->size()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    iget v9, v3, Lq8/c;->e:I

    .line 225
    .line 226
    if-ge v6, v9, :cond_6

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    move v5, v4

    .line 230
    :goto_3
    const/4 v4, 0x0

    .line 231
    if-eqz v5, :cond_7

    .line 232
    .line 233
    sget-object v4, Lb/z;->e:Lb/z;

    .line 234
    .line 235
    new-instance v5, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v6, "Enqueueing report: "

    .line 241
    .line 242
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Lj8/u;->c()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-virtual {v4, v5}, Lb/z;->h(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v5, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v6, "Queue size: "

    .line 265
    .line 266
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    iget-object v6, v3, Lq8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/util/concurrent/ArrayBlockingQueue;->size()I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-virtual {v4, v5}, Lb/z;->h(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object v5, v3, Lq8/c;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 286
    .line 287
    new-instance v6, Lq8/c$a;

    .line 288
    .line 289
    invoke-direct {v6, v3, v2, v8}, Lq8/c$a;-><init>(Lq8/c;Lj8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    new-instance v3, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string v5, "Closing task for report: "

    .line 301
    .line 302
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Lj8/u;->c()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-virtual {v4, v3}, Lb/z;->h(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_7
    invoke-virtual {v3}, Lq8/c;->a()I

    .line 321
    .line 322
    .line 323
    new-instance v5, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v6, "Dropping report due to queue being full: "

    .line 329
    .line 330
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Lj8/u;->c()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    const/4 v6, 0x3

    .line 345
    const-string v9, "FirebaseCrashlytics"

    .line 346
    .line 347
    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    if-eqz v6, :cond_8

    .line 352
    .line 353
    const-string v6, "FirebaseCrashlytics"

    .line 354
    .line 355
    invoke-static {v6, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 356
    .line 357
    .line 358
    :cond_8
    iget-object v3, v3, Lq8/c;->i:Ll/l;

    .line 359
    .line 360
    iget-object v3, v3, Ll/l;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 363
    .line 364
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 365
    .line 366
    .line 367
    :goto_4
    invoke-virtual {v8, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_9
    invoke-virtual {v3, v2, v8}, Lq8/c;->b(Lj8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 372
    .line 373
    .line 374
    :goto_5
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 375
    invoke-virtual {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    new-instance v3, Lio/flutter/plugins/firebase/auth/g;

    .line 380
    .line 381
    const/16 v4, 0xf

    .line 382
    .line 383
    invoke-direct {v3, p0, v4}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    goto/16 :goto_1

    .line 394
    .line 395
    :catchall_0
    move-exception p1

    .line 396
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 397
    throw p1

    .line 398
    :cond_a
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    return-object p1
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
