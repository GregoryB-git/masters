.class public final Lcom/jhomlala/better_player/CacheWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# instance fields
.field public final f:Landroid/content/Context;

.field public o:Lu5/h;

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lcom/jhomlala/better_player/CacheWorker;->f:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/jhomlala/better_player/CacheWorker;->o:Lu5/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lu5/h;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "CacheWorker"

    .line 15
    .line 16
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
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

.method public final j()Landroidx/work/d$a;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "header_"

    .line 4
    .line 5
    const-string v2, "CacheWorker"

    .line 6
    .line 7
    :try_start_0
    iget-object v3, v1, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 8
    .line 9
    iget-object v3, v3, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 10
    .line 11
    const-string v4, "getInputData(...)"

    .line 12
    .line 13
    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v4, "url"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v5, "cacheKey"

    .line 23
    .line 24
    invoke-virtual {v3, v5}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v17

    .line 28
    const-string v5, "preCacheSize"

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Landroidx/work/c;->c(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v13

    .line 34
    const-string v5, "maxCacheSize"

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Landroidx/work/c;->c(Ljava/lang/String;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v20

    .line 40
    const-string v5, "maxCacheFileSize"

    .line 41
    .line 42
    invoke-virtual {v3, v5}, Landroidx/work/c;->c(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v22

    .line 46
    new-instance v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v6, v3, Landroidx/work/c;->a:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const/4 v12, 0x0

    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v7}, Lec/i;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v7, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    new-instance v8, Llc/d;

    .line 88
    .line 89
    invoke-direct {v8, v0}, Llc/d;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v7}, Llc/d;->a(Ljava/lang/String;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    new-array v9, v12, [Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {v8, v9}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, [Ljava/lang/String;

    .line 103
    .line 104
    aget-object v8, v8, v12

    .line 105
    .line 106
    iget-object v9, v3, Landroidx/work/c;->a:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    check-cast v7, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-static {v7}, Lpa/j;->b(Landroid/net/Uri;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    const-string v0, "http.agent"

    .line 136
    .line 137
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v3, "User-Agent"

    .line 142
    .line 143
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_2

    .line 148
    .line 149
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v3, :cond_2

    .line 156
    .line 157
    move-object v0, v3

    .line 158
    :cond_2
    invoke-static {v0, v5}, Lpa/j;->a(Ljava/lang/String;Ljava/util/Map;)Lt5/s$a;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v3, Lt5/n;

    .line 163
    .line 164
    const-wide/16 v8, 0x0

    .line 165
    .line 166
    move-object v6, v3

    .line 167
    move-wide v10, v13

    .line 168
    invoke-direct/range {v6 .. v11}, Lt5/n;-><init>(Landroid/net/Uri;JJ)V

    .line 169
    .line 170
    .line 171
    if-eqz v17, :cond_5

    .line 172
    .line 173
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-lez v5, :cond_3

    .line 178
    .line 179
    const/4 v12, 0x1

    .line 180
    :cond_3
    if-eqz v12, :cond_5

    .line 181
    .line 182
    iget-object v7, v3, Lt5/n;->a:Landroid/net/Uri;

    .line 183
    .line 184
    iget-wide v8, v3, Lt5/n;->b:J

    .line 185
    .line 186
    iget v10, v3, Lt5/n;->c:I

    .line 187
    .line 188
    iget-object v11, v3, Lt5/n;->d:[B

    .line 189
    .line 190
    iget-object v12, v3, Lt5/n;->e:Ljava/util/Map;

    .line 191
    .line 192
    iget-wide v5, v3, Lt5/n;->f:J

    .line 193
    .line 194
    move-object/from16 v24, v4

    .line 195
    .line 196
    move-wide v15, v5

    .line 197
    iget-wide v4, v3, Lt5/n;->g:J

    .line 198
    .line 199
    iget v6, v3, Lt5/n;->i:I

    .line 200
    .line 201
    iget-object v3, v3, Lt5/n;->j:Ljava/lang/Object;

    .line 202
    .line 203
    if-eqz v7, :cond_4

    .line 204
    .line 205
    new-instance v25, Lt5/n;

    .line 206
    .line 207
    move/from16 v18, v6

    .line 208
    .line 209
    move-object/from16 v6, v25

    .line 210
    .line 211
    move-wide/from16 v26, v13

    .line 212
    .line 213
    move-wide v13, v15

    .line 214
    move-wide v15, v4

    .line 215
    move-object/from16 v19, v3

    .line 216
    .line 217
    invoke-direct/range {v6 .. v19}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v3, v25

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    const-string v3, "The uri must be set."

    .line 226
    .line 227
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_5
    move-object/from16 v24, v4

    .line 232
    .line 233
    move-wide/from16 v26, v13

    .line 234
    .line 235
    :goto_1
    new-instance v4, Lpa/h;

    .line 236
    .line 237
    iget-object v7, v1, Lcom/jhomlala/better_player/CacheWorker;->f:Landroid/content/Context;

    .line 238
    .line 239
    move-object v6, v4

    .line 240
    move-wide/from16 v8, v20

    .line 241
    .line 242
    move-wide/from16 v10, v22

    .line 243
    .line 244
    move-object v12, v0

    .line 245
    invoke-direct/range {v6 .. v12}, Lpa/h;-><init>(Landroid/content/Context;JJLt5/s$a;)V

    .line 246
    .line 247
    .line 248
    new-instance v0, Lu5/h;

    .line 249
    .line 250
    invoke-virtual {v4}, Lpa/h;->b()Lu5/c;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    new-instance v5, Lq3/j;

    .line 255
    .line 256
    move-object/from16 v6, v24

    .line 257
    .line 258
    move-wide/from16 v7, v26

    .line 259
    .line 260
    invoke-direct {v5, v7, v8, v1, v6}, Lq3/j;-><init>(JLcom/jhomlala/better_player/CacheWorker;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-direct {v0, v4, v3, v5}, Lu5/h;-><init>(Lu5/c;Lt5/n;Lq3/j;)V

    .line 264
    .line 265
    .line 266
    iput-object v0, v1, Lcom/jhomlala/better_player/CacheWorker;->o:Lu5/h;

    .line 267
    .line 268
    invoke-virtual {v0}, Lu5/h;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    new-instance v0, Landroidx/work/d$a$c;

    .line 272
    .line 273
    invoke-direct {v0}, Landroidx/work/d$a$c;-><init>()V

    .line 274
    .line 275
    .line 276
    return-object v0

    .line 277
    :cond_6
    :try_start_1
    const-string v0, "Preloading only possible for remote data sources"

    .line 278
    .line 279
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    new-instance v0, Landroidx/work/d$a$a;

    .line 283
    .line 284
    invoke-direct {v0}, Landroidx/work/d$a$a;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :catch_0
    move-exception v0

    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    instance-of v0, v0, Lt5/x;

    .line 297
    .line 298
    if-eqz v0, :cond_7

    .line 299
    .line 300
    new-instance v0, Landroidx/work/d$a$c;

    .line 301
    .line 302
    invoke-direct {v0}, Landroidx/work/d$a$c;-><init>()V

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_7
    new-instance v0, Landroidx/work/d$a$a;

    .line 307
    .line 308
    invoke-direct {v0}, Landroidx/work/d$a$a;-><init>()V

    .line 309
    .line 310
    .line 311
    :goto_2
    return-object v0
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
