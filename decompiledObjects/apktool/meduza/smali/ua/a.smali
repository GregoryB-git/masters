.class public final Lua/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lv3/f1$c;
.implements Lp4/e;


# static fields
.field public static O:Ljava/util/Random;


# instance fields
.field public A:Lv3/j;

.field public B:Z

.field public C:Lv3/i;

.field public D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public E:Ljava/util/ArrayList;

.field public F:Ljava/util/HashMap;

.field public G:I

.field public H:Ljava/util/HashMap;

.field public I:Lv3/d0;

.field public J:Ljava/lang/Integer;

.field public K:Lz4/t;

.field public L:Ljava/lang/Integer;

.field public final M:Landroid/os/Handler;

.field public final N:Lua/a$a;

.field public final a:Landroid/content/Context;

.field public final b:Lua/b;

.field public final c:Lua/b;

.field public d:I

.field public e:J

.field public f:J

.field public o:J

.field public p:Ljava/lang/Long;

.field public q:J

.field public r:Ljava/lang/Integer;

.field public s:Lio/flutter/plugin/common/MethodChannel$Result;

.field public t:Lio/flutter/plugin/common/MethodChannel$Result;

.field public u:Lio/flutter/plugin/common/MethodChannel$Result;

.field public v:Ljava/util/HashMap;

.field public w:Lt4/c;

.field public x:Lt4/b;

.field public y:I

.field public z:Lx3/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lua/a;->O:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/flutter/plugin/common/BinaryMessenger;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v4, v0, Lua/a;->v:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v4, v0, Lua/a;->E:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v4, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v4, v0, Lua/a;->F:Ljava/util/HashMap;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput v4, v0, Lua/a;->G:I

    .line 35
    .line 36
    new-instance v5, Landroid/os/Handler;

    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 43
    .line 44
    .line 45
    iput-object v5, v0, Lua/a;->M:Landroid/os/Handler;

    .line 46
    .line 47
    new-instance v5, Lua/a$a;

    .line 48
    .line 49
    invoke-direct {v5, v0}, Lua/a$a;-><init>(Lua/a;)V

    .line 50
    .line 51
    .line 52
    iput-object v5, v0, Lua/a;->N:Lua/a$a;

    .line 53
    .line 54
    move-object/from16 v5, p1

    .line 55
    .line 56
    iput-object v5, v0, Lua/a;->a:Landroid/content/Context;

    .line 57
    .line 58
    move-object/from16 v5, p5

    .line 59
    .line 60
    iput-object v5, v0, Lua/a;->D:Ljava/util/List;

    .line 61
    .line 62
    if-eqz p6, :cond_0

    .line 63
    .line 64
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v5, v4

    .line 70
    :goto_0
    iput-boolean v5, v0, Lua/a;->B:Z

    .line 71
    .line 72
    new-instance v5, Lio/flutter/plugin/common/MethodChannel;

    .line 73
    .line 74
    const-string v6, "com.ryanheise.just_audio.methods."

    .line 75
    .line 76
    invoke-static {v6, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-direct {v5, v1, v6}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Lua/b;

    .line 87
    .line 88
    const-string v6, "com.ryanheise.just_audio.events."

    .line 89
    .line 90
    invoke-static {v6, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-direct {v5, v1, v6}, Lua/b;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v5, v0, Lua/a;->b:Lua/b;

    .line 98
    .line 99
    new-instance v5, Lua/b;

    .line 100
    .line 101
    const-string v6, "com.ryanheise.just_audio.data."

    .line 102
    .line 103
    invoke-static {v6, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-direct {v5, v1, v2}, Lua/b;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iput-object v5, v0, Lua/a;->c:Lua/b;

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    iput v1, v0, Lua/a;->d:I

    .line 114
    .line 115
    if-eqz v3, :cond_a

    .line 116
    .line 117
    const-string v2, "androidLoadControl"

    .line 118
    .line 119
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/util/Map;

    .line 124
    .line 125
    const-wide/16 v5, 0x3e8

    .line 126
    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    const/4 v7, -0x1

    .line 130
    const-string v8, "minBufferDuration"

    .line 131
    .line 132
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-static {v8}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v8

    .line 144
    div-long/2addr v8, v5

    .line 145
    long-to-int v12, v8

    .line 146
    const-string v8, "maxBufferDuration"

    .line 147
    .line 148
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-static {v8}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    div-long/2addr v8, v5

    .line 161
    long-to-int v13, v8

    .line 162
    const-string v8, "bufferForPlaybackDuration"

    .line 163
    .line 164
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-static {v8}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v8

    .line 176
    div-long/2addr v8, v5

    .line 177
    long-to-int v14, v8

    .line 178
    const-string v8, "bufferForPlaybackAfterRebufferDuration"

    .line 179
    .line 180
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-static {v8}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v8

    .line 192
    div-long/2addr v8, v5

    .line 193
    long-to-int v15, v8

    .line 194
    const-string v8, "bufferForPlaybackMs"

    .line 195
    .line 196
    const-string v9, "0"

    .line 197
    .line 198
    invoke-static {v8, v14, v4, v9}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v10, "bufferForPlaybackAfterRebufferMs"

    .line 202
    .line 203
    invoke-static {v10, v15, v4, v9}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string v11, "minBufferMs"

    .line 207
    .line 208
    invoke-static {v11, v12, v14, v8}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v11, v12, v15, v10}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string v8, "maxBufferMs"

    .line 215
    .line 216
    invoke-static {v8, v13, v12, v11}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const-string v8, "prioritizeTimeOverSizeThresholds"

    .line 220
    .line 221
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    check-cast v8, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result v17

    .line 231
    const-string v8, "backBufferDuration"

    .line 232
    .line 233
    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-static {v8}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 242
    .line 243
    .line 244
    move-result-wide v10

    .line 245
    div-long/2addr v10, v5

    .line 246
    long-to-int v8, v10

    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    const-string v10, "backBufferDurationMs"

    .line 250
    .line 251
    invoke-static {v10, v8, v4, v9}, Lv3/j;->j(Ljava/lang/String;IILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-string v9, "targetBufferBytes"

    .line 255
    .line 256
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    if-eqz v10, :cond_1

    .line 261
    .line 262
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Ljava/lang/Integer;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    :cond_1
    move/from16 v16, v7

    .line 273
    .line 274
    new-instance v11, Lt5/o;

    .line 275
    .line 276
    invoke-direct {v11}, Lt5/o;-><init>()V

    .line 277
    .line 278
    .line 279
    new-instance v2, Lv3/j;

    .line 280
    .line 281
    move-object v10, v2

    .line 282
    move/from16 v18, v8

    .line 283
    .line 284
    invoke-direct/range {v10 .. v19}, Lv3/j;-><init>(Lt5/o;IIIIIZIZ)V

    .line 285
    .line 286
    .line 287
    iput-object v2, v0, Lua/a;->A:Lv3/j;

    .line 288
    .line 289
    :cond_2
    const-string v2, "androidLivePlaybackSpeedControl"

    .line 290
    .line 291
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Ljava/util/Map;

    .line 296
    .line 297
    if-eqz v2, :cond_a

    .line 298
    .line 299
    sget v3, Lv5/e0;->a:I

    .line 300
    .line 301
    const-string v3, "fallbackMinPlaybackSpeed"

    .line 302
    .line 303
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    check-cast v3, Ljava/lang/Double;

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 310
    .line 311
    .line 312
    move-result-wide v7

    .line 313
    double-to-float v10, v7

    .line 314
    const/4 v3, 0x0

    .line 315
    cmpg-float v7, v3, v10

    .line 316
    .line 317
    const/high16 v8, 0x3f800000    # 1.0f

    .line 318
    .line 319
    if-gez v7, :cond_3

    .line 320
    .line 321
    cmpg-float v7, v10, v8

    .line 322
    .line 323
    if-gtz v7, :cond_3

    .line 324
    .line 325
    move v7, v1

    .line 326
    goto :goto_1

    .line 327
    :cond_3
    move v7, v4

    .line 328
    :goto_1
    invoke-static {v7}, Lx6/b;->q(Z)V

    .line 329
    .line 330
    .line 331
    const-string v7, "fallbackMaxPlaybackSpeed"

    .line 332
    .line 333
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    check-cast v7, Ljava/lang/Double;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v11

    .line 343
    double-to-float v11, v11

    .line 344
    cmpl-float v7, v11, v8

    .line 345
    .line 346
    if-ltz v7, :cond_4

    .line 347
    .line 348
    move v7, v1

    .line 349
    goto :goto_2

    .line 350
    :cond_4
    move v7, v4

    .line 351
    :goto_2
    invoke-static {v7}, Lx6/b;->q(Z)V

    .line 352
    .line 353
    .line 354
    const-string v7, "minUpdateInterval"

    .line 355
    .line 356
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-static {v7}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 365
    .line 366
    .line 367
    move-result-wide v7

    .line 368
    div-long v12, v7, v5

    .line 369
    .line 370
    const-wide/16 v7, 0x0

    .line 371
    .line 372
    cmp-long v9, v12, v7

    .line 373
    .line 374
    if-lez v9, :cond_5

    .line 375
    .line 376
    move v9, v1

    .line 377
    goto :goto_3

    .line 378
    :cond_5
    move v9, v4

    .line 379
    :goto_3
    invoke-static {v9}, Lx6/b;->q(Z)V

    .line 380
    .line 381
    .line 382
    const-string v9, "proportionalControlFactor"

    .line 383
    .line 384
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    check-cast v9, Ljava/lang/Double;

    .line 389
    .line 390
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 391
    .line 392
    .line 393
    move-result-wide v14

    .line 394
    double-to-float v9, v14

    .line 395
    cmpl-float v14, v9, v3

    .line 396
    .line 397
    if-lez v14, :cond_6

    .line 398
    .line 399
    move v14, v1

    .line 400
    goto :goto_4

    .line 401
    :cond_6
    move v14, v4

    .line 402
    :goto_4
    invoke-static {v14}, Lx6/b;->q(Z)V

    .line 403
    .line 404
    .line 405
    const v14, 0x49742400    # 1000000.0f

    .line 406
    .line 407
    .line 408
    div-float v14, v9, v14

    .line 409
    .line 410
    const-string v9, "maxLiveOffsetErrorForUnitSpeed"

    .line 411
    .line 412
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    invoke-static {v9}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 421
    .line 422
    .line 423
    move-result-wide v15

    .line 424
    div-long/2addr v15, v5

    .line 425
    cmp-long v9, v15, v7

    .line 426
    .line 427
    if-lez v9, :cond_7

    .line 428
    .line 429
    move v9, v1

    .line 430
    goto :goto_5

    .line 431
    :cond_7
    move v9, v4

    .line 432
    :goto_5
    invoke-static {v9}, Lx6/b;->q(Z)V

    .line 433
    .line 434
    .line 435
    invoke-static/range {v15 .. v16}, Lv5/e0;->I(J)J

    .line 436
    .line 437
    .line 438
    move-result-wide v15

    .line 439
    const-string v9, "targetLiveOffsetIncrementOnRebuffer"

    .line 440
    .line 441
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-static {v9}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 450
    .line 451
    .line 452
    move-result-wide v17

    .line 453
    div-long v17, v17, v5

    .line 454
    .line 455
    cmp-long v5, v17, v7

    .line 456
    .line 457
    if-ltz v5, :cond_8

    .line 458
    .line 459
    move v5, v1

    .line 460
    goto :goto_6

    .line 461
    :cond_8
    move v5, v4

    .line 462
    :goto_6
    invoke-static {v5}, Lx6/b;->q(Z)V

    .line 463
    .line 464
    .line 465
    invoke-static/range {v17 .. v18}, Lv5/e0;->I(J)J

    .line 466
    .line 467
    .line 468
    move-result-wide v17

    .line 469
    const-string v5, "minPossibleLiveOffsetSmoothingFactor"

    .line 470
    .line 471
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Ljava/lang/Double;

    .line 476
    .line 477
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 478
    .line 479
    .line 480
    move-result-wide v5

    .line 481
    double-to-float v2, v5

    .line 482
    cmpl-float v3, v2, v3

    .line 483
    .line 484
    if-ltz v3, :cond_9

    .line 485
    .line 486
    const/high16 v3, 0x3f800000    # 1.0f

    .line 487
    .line 488
    cmpg-float v3, v2, v3

    .line 489
    .line 490
    if-gez v3, :cond_9

    .line 491
    .line 492
    move v4, v1

    .line 493
    :cond_9
    invoke-static {v4}, Lx6/b;->q(Z)V

    .line 494
    .line 495
    .line 496
    new-instance v1, Lv3/i;

    .line 497
    .line 498
    move-object v9, v1

    .line 499
    move/from16 v19, v2

    .line 500
    .line 501
    invoke-direct/range {v9 .. v19}, Lv3/i;-><init>(FFJFJJF)V

    .line 502
    .line 503
    .line 504
    iput-object v1, v0, Lua/a;->C:Lv3/i;

    .line 505
    .line 506
    :cond_a
    return-void
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
.end method

.method public static U(Ljava/util/List;)Lz4/e0$a;
    .locals 4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lz4/e0$a;

    sget-object v2, Lua/a;->O:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    invoke-direct {p0, v0, v1}, Lz4/e0$a;-><init>([ILjava/util/Random;)V

    return-object p0
.end method

.method public static t0(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    if-eqz p0, :cond_1

    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v0, p0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    :goto_1
    return-object p0
.end method

.method public static w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs x0([Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final A0(JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget v0, p0, Lua/a;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    iput-object v1, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 24
    .line 25
    iput-object v1, p0, Lua/a;->p:Ljava/lang/Long;

    .line 26
    .line 27
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lua/a;->p:Ljava/lang/Long;

    .line 32
    .line 33
    iput-object p4, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p3, p0, Lua/a;->I:Lv3/d0;

    .line 43
    .line 44
    invoke-virtual {p3}, Lv3/d0;->F()I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    :goto_0
    iget-object p4, p0, Lua/a;->I:Lv3/d0;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p4, p3, p1, p2, v0}, Lv3/e;->S(IJZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_1
    move-exception p1

    .line 56
    iput-object v1, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 57
    .line 58
    iput-object v1, p0, Lua/a;->p:Ljava/lang/Long;

    .line 59
    .line 60
    throw p1

    .line 61
    :cond_3
    :goto_1
    new-instance p1, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p4, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
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

.method public final B(Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lua/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/audiofx/AudioEffect;

    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    return-void
.end method

.method public final B0(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    iget-object v0, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    iget-object v0, p0, Lua/a;->b:Lua/b;

    invoke-virtual {v0, p1, p2, p3}, Lua/b;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final C0(III)V
    .locals 7

    .line 1
    new-instance v6, Lx3/d;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v0, v6

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move v3, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Lx3/d;-><init>(IIIII)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lua/a;->d:I

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    iput-object v6, p0, Lua/a;->z:Lx3/d;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p1, v6, p2}, Lv3/d0;->k0(Lx3/d;Z)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
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

.method public final synthetic D(Z)V
    .locals 0

    return-void
.end method

.method public final D0(I)V
    .locals 1

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0, p1}, Lv3/d0;->u(I)V

    return-void
.end method

.method public final E()V
    .locals 0

    invoke-virtual {p0}, Lua/a;->f0()V

    invoke-virtual {p0}, Lua/a;->H()V

    return-void
.end method

.method public final E0(F)V
    .locals 3

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->f()Lv3/e1;

    move-result-object v0

    iget v1, v0, Lv3/e1;->b:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lua/a;->I:Lv3/d0;

    new-instance v2, Lv3/e1;

    iget v0, v0, Lv3/e1;->a:F

    invoke-direct {v2, v0, p1}, Lv3/e1;-><init>(FF)V

    invoke-virtual {v1, v2}, Lv3/d0;->c(Lv3/e1;)V

    invoke-virtual {p0}, Lua/a;->f0()V

    return-void
.end method

.method public final synthetic F(Lv3/f1$a;)V
    .locals 0

    return-void
.end method

.method public final F0(Z)V
    .locals 1

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0, p1}, Lv3/d0;->n(Z)V

    return-void
.end method

.method public final G(ILv3/f1$d;Lv3/f1$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lua/a;->K0()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    if-eq p1, p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iput-object p1, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua/a;->E()V

    .line 31
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

.method public final G0(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/util/Map;

    const-string v0, "id"

    invoke-static {p1, v0}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lua/a;->v:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "type"

    invoke-static {p1, v1}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "concatenating"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v0, "looping"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "child"

    invoke-static {p1, v0}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lua/a;->G0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    check-cast v0, Lz4/h;

    const-string v1, "shuffleOrder"

    invoke-static {p1, v1}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lua/a;->U(Ljava/util/List;)Lz4/e0$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz4/h;->P(Lz4/e0$a;)V

    const-string v0, "children"

    invoke-static {p1, v0}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lua/a;->G0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final H()V
    .locals 2

    iget-object v0, p0, Lua/a;->H:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lua/a;->b:Lua/b;

    invoke-virtual {v1, v0}, Lua/b;->success(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lua/a;->H:Ljava/util/HashMap;

    :cond_0
    return-void
.end method

.method public final H0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lv3/d0;->Y:Z

    .line 7
    .line 8
    if-ne v1, p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iput-boolean p1, v0, Lv3/d0;->Y:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0, v3, v1, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lv3/d0;->l:Lv5/l;

    .line 24
    .line 25
    const/16 v1, 0x17

    .line 26
    .line 27
    new-instance v2, Lv3/u;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v3, p1}, Lv3/u;-><init>(IZ)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lv5/l;->e(ILv5/l$a;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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

.method public final synthetic I(Z)V
    .locals 0

    return-void
.end method

.method public final I0(F)V
    .locals 3

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->f()Lv3/e1;

    move-result-object v0

    iget v1, v0, Lv3/e1;->a:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lua/a;->I:Lv3/d0;

    new-instance v2, Lv3/e1;

    iget v0, v0, Lv3/e1;->b:F

    invoke-direct {v2, p1, v0}, Lv3/e1;-><init>(FF)V

    invoke-virtual {v1, v2}, Lv3/d0;->c(Lv3/e1;)V

    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {p1}, Lv3/d0;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lua/a;->K0()V

    :cond_1
    invoke-virtual {p0}, Lua/a;->f0()V

    return-void
.end method

.method public final J0(F)V
    .locals 1

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0, p1}, Lv3/d0;->o0(F)V

    return-void
.end method

.method public final synthetic K(IZ)V
    .locals 0

    return-void
.end method

.method public final K0()V
    .locals 2

    invoke-virtual {p0}, Lua/a;->r0()J

    move-result-wide v0

    iput-wide v0, p0, Lua/a;->e:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lua/a;->f:J

    return-void
.end method

.method public final synthetic L(F)V
    .locals 0

    return-void
.end method

.method public final M(Ljava/util/Map;)Lt5/r$a;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const-string p1, "User-Agent"

    .line 45
    .line 46
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    const-string p1, "user-agent"

    .line 55
    .line 56
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-object p1, v0

    .line 64
    :cond_3
    :goto_2
    if-nez p1, :cond_4

    .line 65
    .line 66
    iget-object p1, p0, Lua/a;->a:Landroid/content/Context;

    .line 67
    .line 68
    sget v2, Lv5/e0;->a:I

    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-virtual {p1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_0
    const-string p1, "?"

    .line 87
    .line 88
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "just_audio"

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v3, "/"

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, " (Linux;Android "

    .line 107
    .line 108
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p1, ") "

    .line 117
    .line 118
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, "ExoPlayerLib/2.18.7"

    .line 122
    .line 123
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :cond_4
    new-instance v2, Lt5/s$a;

    .line 131
    .line 132
    invoke-direct {v2}, Lt5/s$a;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object p1, v2, Lt5/s$a;->b:Ljava/lang/String;

    .line 136
    .line 137
    const/4 p1, 0x1

    .line 138
    iput-boolean p1, v2, Lt5/s$a;->e:Z

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-lez p1, :cond_5

    .line 147
    .line 148
    iget-object p1, v2, Lt5/s$a;->a:Lt5/a0;

    .line 149
    .line 150
    monitor-enter p1

    .line 151
    :try_start_1
    iput-object v0, p1, Lt5/a0;->b:Ljava/util/Map;

    .line 152
    .line 153
    iget-object v0, p1, Lt5/a0;->a:Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 156
    .line 157
    .line 158
    iget-object v0, p1, Lt5/a0;->a:Ljava/util/HashMap;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    monitor-exit p1

    .line 164
    goto :goto_4

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    monitor-exit p1

    .line 167
    throw v0

    .line 168
    :cond_5
    :goto_4
    new-instance p1, Lt5/r$a;

    .line 169
    .line 170
    iget-object v0, p0, Lua/a;->a:Landroid/content/Context;

    .line 171
    .line 172
    invoke-direct {p1, v0, v2}, Lt5/r$a;-><init>(Landroid/content/Context;Lt5/k$a;)V

    .line 173
    .line 174
    .line 175
    return-object p1
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

.method public final N(I)V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    if-eq p1, v1, :cond_7

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x4

    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    if-eq p1, v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    iget p1, p0, Lua/a;->d:I

    .line 15
    .line 16
    const/4 v0, 0x5

    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lua/a;->K0()V

    .line 20
    .line 21
    .line 22
    iput v0, p0, Lua/a;->d:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lua/a;->E()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 42
    .line 43
    iget-object p1, p0, Lua/a;->z:Lx3/d;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 48
    .line 49
    invoke-virtual {v0, p1, v1}, Lv3/d0;->k0(Lx3/d;Z)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, Lua/a;->z:Lx3/d;

    .line 53
    .line 54
    :cond_2
    iget-object p1, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 55
    .line 56
    if-eqz p1, :cond_a

    .line 57
    .line 58
    new-instance v0, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_3
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 71
    .line 72
    invoke-virtual {p1}, Lv3/d0;->k()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, Lua/a;->K0()V

    .line 79
    .line 80
    .line 81
    :cond_4
    iput v3, p0, Lua/a;->d:I

    .line 82
    .line 83
    invoke-virtual {p0}, Lua/a;->E()V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 87
    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    new-instance p1, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lua/a;->s0()J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    cmp-long v0, v3, v5

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    move-object v0, v2

    .line 109
    goto :goto_0

    .line 110
    :cond_5
    const-wide/16 v3, 0x3e8

    .line 111
    .line 112
    invoke-virtual {p0}, Lua/a;->s0()J

    .line 113
    .line 114
    .line 115
    move-result-wide v5

    .line 116
    mul-long/2addr v5, v3

    .line 117
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :goto_0
    const-string v3, "duration"

    .line 122
    .line 123
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 127
    .line 128
    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iput-object v2, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 132
    .line 133
    iget-object p1, p0, Lua/a;->z:Lx3/d;

    .line 134
    .line 135
    if-eqz p1, :cond_6

    .line 136
    .line 137
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 138
    .line 139
    invoke-virtual {v0, p1, v1}, Lv3/d0;->k0(Lx3/d;Z)V

    .line 140
    .line 141
    .line 142
    iput-object v2, p0, Lua/a;->z:Lx3/d;

    .line 143
    .line 144
    :cond_6
    iget-object p1, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 145
    .line 146
    if-eqz p1, :cond_a

    .line 147
    .line 148
    iput-object v2, p0, Lua/a;->p:Ljava/lang/Long;

    .line 149
    .line 150
    new-instance v0, Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iput-object v2, p0, Lua/a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    invoke-virtual {p0}, Lua/a;->r0()J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    iget-wide v4, p0, Lua/a;->e:J

    .line 166
    .line 167
    cmp-long p1, v2, v4

    .line 168
    .line 169
    if-nez p1, :cond_8

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    invoke-virtual {p0}, Lua/a;->r0()J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    iput-wide v2, p0, Lua/a;->e:J

    .line 177
    .line 178
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 179
    .line 180
    .line 181
    move-result-wide v2

    .line 182
    iput-wide v2, p0, Lua/a;->f:J

    .line 183
    .line 184
    :goto_1
    iget p1, p0, Lua/a;->d:I

    .line 185
    .line 186
    if-eq p1, v0, :cond_9

    .line 187
    .line 188
    if-eq p1, v1, :cond_9

    .line 189
    .line 190
    iput v0, p0, Lua/a;->d:I

    .line 191
    .line 192
    invoke-virtual {p0}, Lua/a;->E()V

    .line 193
    .line 194
    .line 195
    :cond_9
    iget-object p1, p0, Lua/a;->M:Landroid/os/Handler;

    .line 196
    .line 197
    iget-object v0, p0, Lua/a;->N:Lua/a$a;

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, Lua/a;->M:Landroid/os/Handler;

    .line 203
    .line 204
    iget-object v0, p0, Lua/a;->N:Lua/a$a;

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    :cond_a
    :goto_2
    return-void
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

.method public final O()V
    .locals 2

    iget-object v0, p0, Lua/a;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/audiofx/AudioEffect;

    invoke-virtual {v1}, Landroid/media/audiofx/AudioEffect;->release()V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lua/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final P(Ljava/lang/Object;)Lz4/h;
    .locals 1

    iget-object v0, p0, Lua/a;->v:Ljava/util/HashMap;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz4/h;

    return-object p1
.end method

.method public final Q(Ljava/lang/Object;)Lz4/a;
    .locals 13

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "type"

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    const/4 v4, 0x0

    .line 28
    sparse-switch v2, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :sswitch_0
    const-string v2, "silence"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x6

    .line 42
    goto :goto_1

    .line 43
    :sswitch_1
    const-string v2, "progressive"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v1, 0x5

    .line 53
    goto :goto_1

    .line 54
    :sswitch_2
    const-string v2, "clipping"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v1, 0x4

    .line 64
    goto :goto_1

    .line 65
    :sswitch_3
    const-string v2, "looping"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v1, 0x3

    .line 75
    goto :goto_1

    .line 76
    :sswitch_4
    const-string v2, "dash"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/4 v1, 0x2

    .line 86
    goto :goto_1

    .line 87
    :sswitch_5
    const-string v2, "hls"

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move v1, v3

    .line 97
    goto :goto_1

    .line 98
    :sswitch_6
    const-string v2, "concatenating"

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    move v1, v4

    .line 108
    goto :goto_1

    .line 109
    :goto_0
    const/4 v1, -0x1

    .line 110
    :goto_1
    const-wide/16 v5, 0x0

    .line 111
    .line 112
    packed-switch v1, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    const-string v1, "Unknown AudioSource type: "

    .line 118
    .line 119
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "type"

    .line 124
    .line 125
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :pswitch_0
    const-string v1, "duration"

    .line 141
    .line 142
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    cmp-long p1, v1, v5

    .line 155
    .line 156
    if-lez p1, :cond_7

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    move v3, v4

    .line 160
    :goto_2
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Lz4/f0;

    .line 164
    .line 165
    sget-object v3, Lz4/f0;->s:Lv3/o0;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v4, Lv3/o0$a;

    .line 171
    .line 172
    invoke-direct {v4}, Lv3/o0$a;-><init>()V

    .line 173
    .line 174
    .line 175
    iget-object v5, v3, Lv3/o0;->e:Lv3/o0$c;

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v6, Lv3/o0$b$a;

    .line 181
    .line 182
    invoke-direct {v6, v5}, Lv3/o0$b$a;-><init>(Lv3/o0$c;)V

    .line 183
    .line 184
    .line 185
    iput-object v6, v4, Lv3/o0$a;->d:Lv3/o0$b$a;

    .line 186
    .line 187
    iget-object v5, v3, Lv3/o0;->a:Ljava/lang/String;

    .line 188
    .line 189
    iput-object v5, v4, Lv3/o0$a;->a:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v5, v3, Lv3/o0;->d:Lv3/p0;

    .line 192
    .line 193
    iput-object v5, v4, Lv3/o0$a;->j:Lv3/p0;

    .line 194
    .line 195
    iget-object v5, v3, Lv3/o0;->c:Lv3/o0$e;

    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v6, Lv3/o0$e$a;

    .line 201
    .line 202
    invoke-direct {v6, v5}, Lv3/o0$e$a;-><init>(Lv3/o0$e;)V

    .line 203
    .line 204
    .line 205
    iput-object v6, v4, Lv3/o0$a;->k:Lv3/o0$e$a;

    .line 206
    .line 207
    iget-object v5, v3, Lv3/o0;->f:Lv3/o0$h;

    .line 208
    .line 209
    iput-object v5, v4, Lv3/o0$a;->l:Lv3/o0$h;

    .line 210
    .line 211
    iget-object v3, v3, Lv3/o0;->b:Lv3/o0$g;

    .line 212
    .line 213
    if-eqz v3, :cond_9

    .line 214
    .line 215
    iget-object v5, v3, Lv3/o0$f;->e:Ljava/lang/String;

    .line 216
    .line 217
    iput-object v5, v4, Lv3/o0$a;->g:Ljava/lang/String;

    .line 218
    .line 219
    iget-object v5, v3, Lv3/o0$f;->b:Ljava/lang/String;

    .line 220
    .line 221
    iput-object v5, v4, Lv3/o0$a;->c:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v5, v3, Lv3/o0$f;->a:Landroid/net/Uri;

    .line 224
    .line 225
    iput-object v5, v4, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 226
    .line 227
    iget-object v5, v3, Lv3/o0$f;->d:Ljava/util/List;

    .line 228
    .line 229
    iput-object v5, v4, Lv3/o0$a;->f:Ljava/util/List;

    .line 230
    .line 231
    iget-object v5, v3, Lv3/o0$f;->f:Lo7/t;

    .line 232
    .line 233
    iput-object v5, v4, Lv3/o0$a;->h:Lo7/t;

    .line 234
    .line 235
    iget-object v5, v3, Lv3/o0$f;->g:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v5, v4, Lv3/o0$a;->i:Ljava/lang/Object;

    .line 238
    .line 239
    iget-object v3, v3, Lv3/o0$f;->c:Lv3/o0$d;

    .line 240
    .line 241
    if-eqz v3, :cond_8

    .line 242
    .line 243
    new-instance v5, Lv3/o0$d$a;

    .line 244
    .line 245
    invoke-direct {v5, v3}, Lv3/o0$d$a;-><init>(Lv3/o0$d;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_8
    new-instance v5, Lv3/o0$d$a;

    .line 250
    .line 251
    invoke-direct {v5}, Lv3/o0$d$a;-><init>()V

    .line 252
    .line 253
    .line 254
    :goto_3
    iput-object v5, v4, Lv3/o0$a;->e:Lv3/o0$d$a;

    .line 255
    .line 256
    :cond_9
    iput-object v0, v4, Lv3/o0$a;->i:Ljava/lang/Object;

    .line 257
    .line 258
    invoke-virtual {v4}, Lv3/o0$a;->a()Lv3/o0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-direct {p1, v1, v2, v0}, Lz4/f0;-><init>(JLv3/o0;)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :pswitch_1
    const-string v1, "headers"

    .line 267
    .line 268
    invoke-static {p1, v1}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Ljava/util/Map;

    .line 273
    .line 274
    invoke-virtual {p0, v1}, Lua/a;->M(Ljava/util/Map;)Lt5/r$a;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    const-string v1, "options"

    .line 279
    .line 280
    invoke-static {p1, v1}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v1, Ljava/util/Map;

    .line 285
    .line 286
    new-instance v2, Lc4/f;

    .line 287
    .line 288
    invoke-direct {v2}, Lc4/f;-><init>()V

    .line 289
    .line 290
    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    const-string v5, "androidExtractorOptions"

    .line 294
    .line 295
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    check-cast v1, Ljava/util/Map;

    .line 300
    .line 301
    if-eqz v1, :cond_a

    .line 302
    .line 303
    const-string v3, "constantBitrateSeekingEnabled"

    .line 304
    .line 305
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    check-cast v3, Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    const-string v4, "constantBitrateSeekingAlwaysEnabled"

    .line 316
    .line 317
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    check-cast v4, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    const-string v5, "mp3Flags"

    .line 328
    .line 329
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Ljava/lang/Integer;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    goto :goto_4

    .line 340
    :cond_a
    move v1, v4

    .line 341
    :goto_4
    monitor-enter v2

    .line 342
    :try_start_0
    iput-boolean v3, v2, Lc4/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 343
    .line 344
    monitor-exit v2

    .line 345
    monitor-enter v2

    .line 346
    :try_start_1
    iput-boolean v4, v2, Lc4/f;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 347
    .line 348
    monitor-exit v2

    .line 349
    monitor-enter v2

    .line 350
    :try_start_2
    iput v1, v2, Lc4/f;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 351
    .line 352
    monitor-exit v2

    .line 353
    new-instance v8, Ld;

    .line 354
    .line 355
    const/4 v1, 0x7

    .line 356
    invoke-direct {v8, v2, v1}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 357
    .line 358
    .line 359
    new-instance v1, Ljava/lang/Object;

    .line 360
    .line 361
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 362
    .line 363
    .line 364
    new-instance v10, Lt5/u;

    .line 365
    .line 366
    invoke-direct {v10}, Lt5/u;-><init>()V

    .line 367
    .line 368
    .line 369
    const/high16 v11, 0x100000

    .line 370
    .line 371
    new-instance v2, Lv3/o0$a;

    .line 372
    .line 373
    invoke-direct {v2}, Lv3/o0$a;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v3, "uri"

    .line 377
    .line 378
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    check-cast p1, Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    iput-object p1, v2, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 389
    .line 390
    iput-object v0, v2, Lv3/o0$a;->i:Ljava/lang/Object;

    .line 391
    .line 392
    invoke-virtual {v2}, Lv3/o0$a;->a()Lv3/o0;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    iget-object p1, v6, Lv3/o0;->b:Lv3/o0$g;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object p1, v6, Lv3/o0;->b:Lv3/o0$g;

    .line 402
    .line 403
    iget-object p1, p1, Lv3/o0$f;->g:Ljava/lang/Object;

    .line 404
    .line 405
    new-instance p1, Lz4/z;

    .line 406
    .line 407
    iget-object v0, v6, Lv3/o0;->b:Lv3/o0$g;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v0, v6, Lv3/o0;->b:Lv3/o0$g;

    .line 413
    .line 414
    iget-object v0, v0, Lv3/o0$f;->c:Lv3/o0$d;

    .line 415
    .line 416
    if-eqz v0, :cond_d

    .line 417
    .line 418
    sget v2, Lv5/e0;->a:I

    .line 419
    .line 420
    const/16 v3, 0x12

    .line 421
    .line 422
    if-ge v2, v3, :cond_b

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_b
    monitor-enter v1

    .line 426
    const/4 v2, 0x0

    .line 427
    :try_start_3
    invoke-static {v0, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-nez v3, :cond_c

    .line 432
    .line 433
    invoke-static {v0}, La4/c;->b(Lv3/o0$d;)La4/b;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    monitor-exit v1

    .line 441
    move-object v9, v2

    .line 442
    goto :goto_6

    .line 443
    :catchall_0
    move-exception p1

    .line 444
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 445
    throw p1

    .line 446
    :cond_d
    :goto_5
    sget-object v0, La4/h;->a:La4/h$a;

    .line 447
    .line 448
    move-object v9, v0

    .line 449
    :goto_6
    move-object v5, p1

    .line 450
    invoke-direct/range {v5 .. v11}, Lz4/z;-><init>(Lv3/o0;Lt5/k$a;Lz4/x$a;La4/h;Lt5/c0;I)V

    .line 451
    .line 452
    .line 453
    return-object p1

    .line 454
    :catchall_1
    move-exception p1

    .line 455
    monitor-exit v2

    .line 456
    throw p1

    .line 457
    :catchall_2
    move-exception p1

    .line 458
    monitor-exit v2

    .line 459
    throw p1

    .line 460
    :catchall_3
    move-exception p1

    .line 461
    monitor-exit v2

    .line 462
    throw p1

    .line 463
    :pswitch_2
    const-string v0, "start"

    .line 464
    .line 465
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    const-string v1, "end"

    .line 474
    .line 475
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-static {v1}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    new-instance v2, Lz4/d;

    .line 484
    .line 485
    const-string v3, "child"

    .line 486
    .line 487
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p0, p1}, Lua/a;->o0(Ljava/lang/Object;)Lz4/t;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    if-eqz v0, :cond_e

    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 498
    .line 499
    .line 500
    move-result-wide v5

    .line 501
    :cond_e
    move-wide v9, v5

    .line 502
    if-eqz v1, :cond_f

    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 505
    .line 506
    .line 507
    move-result-wide v0

    .line 508
    goto :goto_7

    .line 509
    :cond_f
    const-wide/high16 v0, -0x8000000000000000L

    .line 510
    .line 511
    :goto_7
    move-wide v11, v0

    .line 512
    move-object v7, v2

    .line 513
    invoke-direct/range {v7 .. v12}, Lz4/d;-><init>(Lz4/t;JJ)V

    .line 514
    .line 515
    .line 516
    return-object v2

    .line 517
    :pswitch_3
    const-string v0, "count"

    .line 518
    .line 519
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    check-cast v0, Ljava/lang/Integer;

    .line 524
    .line 525
    const-string v1, "child"

    .line 526
    .line 527
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    invoke-virtual {p0, p1}, Lua/a;->o0(Ljava/lang/Object;)Lz4/t;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    new-array v1, v0, [Lz4/t;

    .line 540
    .line 541
    move v2, v4

    .line 542
    :goto_8
    if-ge v2, v0, :cond_10

    .line 543
    .line 544
    aput-object p1, v1, v2

    .line 545
    .line 546
    add-int/lit8 v2, v2, 0x1

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_10
    new-instance p1, Lz4/h;

    .line 550
    .line 551
    new-instance v0, Lz4/e0$a;

    .line 552
    .line 553
    invoke-direct {v0}, Lz4/e0$a;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-direct {p1, v4, v0, v1}, Lz4/h;-><init>(ZLz4/e0$a;[Lz4/t;)V

    .line 557
    .line 558
    .line 559
    return-object p1

    .line 560
    :pswitch_4
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 561
    .line 562
    const-string v2, "headers"

    .line 563
    .line 564
    invoke-static {p1, v2}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    check-cast v2, Ljava/util/Map;

    .line 569
    .line 570
    invoke-virtual {p0, v2}, Lua/a;->M(Ljava/util/Map;)Lt5/r$a;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lt5/k$a;)V

    .line 575
    .line 576
    .line 577
    new-instance v2, Lv3/o0$a;

    .line 578
    .line 579
    invoke-direct {v2}, Lv3/o0$a;-><init>()V

    .line 580
    .line 581
    .line 582
    const-string v3, "uri"

    .line 583
    .line 584
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    check-cast p1, Ljava/lang/String;

    .line 589
    .line 590
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    iput-object p1, v2, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 595
    .line 596
    const-string p1, "application/dash+xml"

    .line 597
    .line 598
    iput-object p1, v2, Lv3/o0$a;->c:Ljava/lang/String;

    .line 599
    .line 600
    iput-object v0, v2, Lv3/o0$a;->i:Ljava/lang/Object;

    .line 601
    .line 602
    invoke-virtual {v2}, Lv3/o0$a;->a()Lv3/o0;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a(Lv3/o0;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    return-object p1

    .line 611
    :pswitch_5
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 612
    .line 613
    const-string v1, "headers"

    .line 614
    .line 615
    invoke-static {p1, v1}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    check-cast v1, Ljava/util/Map;

    .line 620
    .line 621
    invoke-virtual {p0, v1}, Lua/a;->M(Ljava/util/Map;)Lt5/r$a;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lt5/k$a;)V

    .line 626
    .line 627
    .line 628
    new-instance v1, Lv3/o0$a;

    .line 629
    .line 630
    invoke-direct {v1}, Lv3/o0$a;-><init>()V

    .line 631
    .line 632
    .line 633
    const-string v2, "uri"

    .line 634
    .line 635
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    check-cast p1, Ljava/lang/String;

    .line 640
    .line 641
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 642
    .line 643
    .line 644
    move-result-object p1

    .line 645
    iput-object p1, v1, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 646
    .line 647
    const-string p1, "application/x-mpegURL"

    .line 648
    .line 649
    iput-object p1, v1, Lv3/o0$a;->c:Ljava/lang/String;

    .line 650
    .line 651
    invoke-virtual {v1}, Lv3/o0$a;->a()Lv3/o0;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Lv3/o0;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    .line 656
    .line 657
    .line 658
    move-result-object p1

    .line 659
    return-object p1

    .line 660
    :pswitch_6
    const-string v0, "children"

    .line 661
    .line 662
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {p0, v0}, Lua/a;->q0(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    new-array v1, v1, [Lz4/t;

    .line 675
    .line 676
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    new-instance v0, Lz4/h;

    .line 680
    .line 681
    const-string v2, "useLazyPreparation"

    .line 682
    .line 683
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Ljava/lang/Boolean;

    .line 688
    .line 689
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    const-string v3, "shuffleOrder"

    .line 694
    .line 695
    invoke-static {p1, v3}, Lua/a;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    check-cast p1, Ljava/util/List;

    .line 700
    .line 701
    invoke-static {p1}, Lua/a;->U(Ljava/util/List;)Lz4/e0$a;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    invoke-direct {v0, v2, p1, v1}, Lz4/h;-><init>(ZLz4/e0$a;[Lz4/t;)V

    .line 706
    .line 707
    .line 708
    return-object v0

    .line 709
    :sswitch_data_0
    .sparse-switch
        -0x1a9425ce -> :sswitch_6
        0x193ef -> :sswitch_5
        0x2eef92 -> :sswitch_4
        0x14db9ebe -> :sswitch_3
        0x36c0fcc2 -> :sswitch_2
        0x43720b8b -> :sswitch_1
        0x7cbaf4a1 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final synthetic R(Lv3/p0;)V
    .locals 0

    return-void
.end method

.method public final synthetic T(Z)V
    .locals 0

    return-void
.end method

.method public final V()V
    .locals 3

    .line 1
    iget v0, p0, Lua/a;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    const-string v0, "abort"

    .line 8
    .line 9
    const-string v2, "Connection aborted"

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v1}, Lua/a;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v2, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lua/a;->v:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lua/a;->K:Lz4/t;

    .line 34
    .line 35
    invoke-virtual {p0}, Lua/a;->O()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lv3/d0;->h0()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lua/a;->I:Lv3/d0;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    iput v0, p0, Lua/a;->d:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lua/a;->E()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lua/a;->b:Lua/b;

    .line 54
    .line 55
    invoke-virtual {v0}, Lua/b;->endOfStream()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lua/a;->c:Lua/b;

    .line 59
    .line 60
    invoke-virtual {v0}, Lua/b;->endOfStream()V

    .line 61
    .line 62
    .line 63
    return-void
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

.method public final synthetic W(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic X(Lv3/n;)V
    .locals 0

    return-void
.end method

.method public final Y(Lv3/r1;I)V
    .locals 6

    .line 1
    iget-wide p1, p0, Lua/a;->q:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lua/a;->r:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lua/a;->r:Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p1, p2

    .line 27
    :goto_0
    iget-object v2, p0, Lua/a;->I:Lv3/d0;

    .line 28
    .line 29
    iget-wide v3, p0, Lua/a;->q:J

    .line 30
    .line 31
    invoke-virtual {v2, p1, v3, v4, p2}, Lv3/e;->S(IJZ)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lua/a;->r:Ljava/lang/Integer;

    .line 36
    .line 37
    iput-wide v0, p0, Lua/a;->q:J

    .line 38
    .line 39
    :cond_2
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 40
    .line 41
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v2, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x1

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iput-object p1, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 59
    .line 60
    move p1, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move p1, p2

    .line 63
    :goto_1
    if-eqz p1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, Lua/a;->E()V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 69
    .line 70
    invoke-virtual {p1}, Lv3/d0;->d()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/4 v2, 0x4

    .line 75
    if-ne p1, v2, :cond_9

    .line 76
    .line 77
    :try_start_0
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 78
    .line 79
    invoke-virtual {p1}, Lv3/d0;->k()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const-wide/16 v4, 0x0

    .line 84
    .line 85
    if-eqz p1, :cond_8

    .line 86
    .line 87
    iget p1, p0, Lua/a;->G:I

    .line 88
    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lv3/d0;->J()Lv3/r1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lv3/r1;->o()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-lez p1, :cond_5

    .line 105
    .line 106
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 107
    .line 108
    move v0, p2

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 111
    .line 112
    invoke-virtual {p1}, Lv3/e;->C()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 119
    .line 120
    const/16 p2, 0x8

    .line 121
    .line 122
    invoke-virtual {p1}, Lv3/e;->e()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    const/4 v4, -0x1

    .line 127
    if-ne v2, v4, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-ne v2, v4, :cond_7

    .line 135
    .line 136
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    invoke-virtual {p1, p2, v0, v1, v3}, Lv3/e;->S(IJZ)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    invoke-virtual {p1, v2, p2}, Lv3/e;->U(II)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 149
    .line 150
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lv3/r1;->o()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-ge p1, v0, :cond_9

    .line 168
    .line 169
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 170
    .line 171
    invoke-virtual {p1}, Lv3/d0;->F()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    :goto_2
    invoke-virtual {p1, v0, v4, v5, p2}, Lv3/e;->S(IJZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :catch_0
    move-exception p1

    .line 180
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    :cond_9
    :goto_3
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lv3/d0;->J()Lv3/r1;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Lv3/r1;->o()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    iput p1, p0, Lua/a;->G:I

    .line 197
    .line 198
    return-void
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

.method public final Z(Lv3/s1;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p1, Lv3/s1;->a:Lo7/t;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p1, Lv3/s1;->a:Lo7/t;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lv3/s1$a;

    .line 18
    .line 19
    iget-object v2, v2, Lv3/s1$a;->b:Lz4/i0;

    .line 20
    .line 21
    move v3, v0

    .line 22
    :goto_1
    iget v4, v2, Lz4/i0;->a:I

    .line 23
    .line 24
    if-ge v3, v4, :cond_2

    .line 25
    .line 26
    iget-object v4, v2, Lz4/i0;->d:[Lv3/i0;

    .line 27
    .line 28
    aget-object v4, v4, v3

    .line 29
    .line 30
    iget-object v4, v4, Lv3/i0;->r:Lp4/a;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v5, v0

    .line 35
    :goto_2
    iget-object v6, v4, Lp4/a;->a:[Lp4/a$b;

    .line 36
    .line 37
    array-length v7, v6

    .line 38
    if-ge v5, v7, :cond_1

    .line 39
    .line 40
    aget-object v6, v6, v5

    .line 41
    .line 42
    instance-of v7, v6, Lt4/b;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    check-cast v6, Lt4/b;

    .line 47
    .line 48
    iput-object v6, p0, Lua/a;->x:Lt4/b;

    .line 49
    .line 50
    invoke-virtual {p0}, Lua/a;->E()V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-void
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

.method public final a0(Lv3/n;)V
    .locals 7

    .line 1
    instance-of v0, p1, Lv3/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "index"

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const-string v4, "AudioPlayer"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    iget v0, p1, Lv3/n;->c:I

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, v5, :cond_1

    .line 17
    .line 18
    if-eq v0, v3, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v6, "default ExoPlaybackException: "

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v6, "TYPE_UNEXPECTED: "

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lv3/n;->b()Ljava/lang/RuntimeException;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string v0, "TYPE_RENDERER: "

    .line 44
    .line 45
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v6, p1, Lv3/n;->c:I

    .line 50
    .line 51
    if-ne v6, v5, :cond_2

    .line 52
    .line 53
    move v6, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v6, v1

    .line 56
    :goto_1
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v6, Ljava/lang/Exception;

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const-string v0, "TYPE_SOURCE: "

    .line 70
    .line 71
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v6, p1, Lv3/n;->c:I

    .line 76
    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    move v6, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move v6, v1

    .line 82
    :goto_2
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v6, Ljava/io/IOException;

    .line 93
    .line 94
    :goto_3
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v4, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget v0, p1, Lv3/n;->c:I

    .line 109
    .line 110
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-array v3, v3, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object v2, v3, v1

    .line 121
    .line 122
    iget-object v2, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 123
    .line 124
    aput-object v2, v3, v5

    .line 125
    .line 126
    invoke-static {v3}, Lua/a;->x0([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    const-string v0, "default PlaybackException: "

    .line 132
    .line 133
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v4, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget v0, p1, Lv3/c1;->a:I

    .line 152
    .line 153
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-array v3, v3, [Ljava/lang/Object;

    .line 162
    .line 163
    aput-object v2, v3, v1

    .line 164
    .line 165
    iget-object v2, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 166
    .line 167
    aput-object v2, v3, v5

    .line 168
    .line 169
    invoke-static {v3}, Lua/a;->x0([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :goto_4
    invoke-virtual {p0, v0, p1, v2}, Lua/a;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 174
    .line 175
    .line 176
    iget p1, p0, Lua/a;->y:I

    .line 177
    .line 178
    add-int/2addr p1, v5

    .line 179
    iput p1, p0, Lua/a;->y:I

    .line 180
    .line 181
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 182
    .line 183
    invoke-virtual {p1}, Lv3/e;->C()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_6

    .line 188
    .line 189
    iget-object p1, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 190
    .line 191
    if-eqz p1, :cond_6

    .line 192
    .line 193
    iget v0, p0, Lua/a;->y:I

    .line 194
    .line 195
    const/4 v2, 0x5

    .line 196
    if-gt v0, v2, :cond_6

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    add-int/2addr p1, v5

    .line 203
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 204
    .line 205
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lv3/r1;->o()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-ge p1, v0, :cond_6

    .line 214
    .line 215
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 216
    .line 217
    iget-object v2, p0, Lua/a;->K:Lz4/t;

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Lv3/d0;->l0(Lz4/t;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 223
    .line 224
    invoke-virtual {v0}, Lv3/d0;->a()V

    .line 225
    .line 226
    .line 227
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 228
    .line 229
    const-wide/16 v2, 0x0

    .line 230
    .line 231
    invoke-virtual {v0, p1, v2, v3, v1}, Lv3/e;->S(IJZ)V

    .line 232
    .line 233
    .line 234
    :cond_6
    return-void
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

.method public final synthetic b(Lw5/o;)V
    .locals 0

    return-void
.end method

.method public final synthetic b0(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic c0(Lv3/e1;)V
    .locals 0

    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    return-void
.end method

.method public final synthetic d0(Lx3/d;)V
    .locals 0

    return-void
.end method

.method public final synthetic e0(Lv3/f1;Lv3/f1$b;)V
    .locals 0

    return-void
.end method

.method public final synthetic f()V
    .locals 0

    return-void
.end method

.method public final f0()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lua/a;->s0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    const-wide/16 v2, 0x3e8

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lua/a;->s0()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    mul-long/2addr v4, v2

    .line 33
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    iget-object v4, p0, Lua/a;->I:Lv3/d0;

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v4}, Lv3/d0;->z()J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-wide/16 v4, 0x0

    .line 47
    .line 48
    :goto_1
    iput-wide v4, p0, Lua/a;->o:J

    .line 49
    .line 50
    iget v4, p0, Lua/a;->d:I

    .line 51
    .line 52
    invoke-static {v4}, Lq0/g;->c(I)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "processingState"

    .line 61
    .line 62
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-wide v4, p0, Lua/a;->e:J

    .line 66
    .line 67
    mul-long/2addr v4, v2

    .line 68
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const-string v5, "updatePosition"

    .line 73
    .line 74
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iget-wide v4, p0, Lua/a;->f:J

    .line 78
    .line 79
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v5, "updateTime"

    .line 84
    .line 85
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-wide v4, p0, Lua/a;->e:J

    .line 89
    .line 90
    iget-wide v6, p0, Lua/a;->o:J

    .line 91
    .line 92
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    mul-long/2addr v4, v2

    .line 97
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v3, "bufferedPosition"

    .line 102
    .line 103
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    new-instance v2, Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lua/a;->w:Lt4/c;

    .line 112
    .line 113
    const-string v4, "url"

    .line 114
    .line 115
    if-eqz v3, :cond_2

    .line 116
    .line 117
    new-instance v3, Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-object v5, p0, Lua/a;->w:Lt4/c;

    .line 123
    .line 124
    iget-object v5, v5, Lt4/c;->b:Ljava/lang/String;

    .line 125
    .line 126
    const-string v6, "title"

    .line 127
    .line 128
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    iget-object v5, p0, Lua/a;->w:Lt4/c;

    .line 132
    .line 133
    iget-object v5, v5, Lt4/c;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-string v5, "info"

    .line 139
    .line 140
    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_2
    iget-object v3, p0, Lua/a;->x:Lt4/b;

    .line 144
    .line 145
    if-eqz v3, :cond_3

    .line 146
    .line 147
    new-instance v3, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    iget-object v5, p0, Lua/a;->x:Lt4/b;

    .line 153
    .line 154
    iget v5, v5, Lt4/b;->a:I

    .line 155
    .line 156
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    const-string v6, "bitrate"

    .line 161
    .line 162
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    iget-object v5, p0, Lua/a;->x:Lt4/b;

    .line 166
    .line 167
    iget-object v5, v5, Lt4/b;->b:Ljava/lang/String;

    .line 168
    .line 169
    const-string v6, "genre"

    .line 170
    .line 171
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    iget-object v5, p0, Lua/a;->x:Lt4/b;

    .line 175
    .line 176
    iget-object v5, v5, Lt4/b;->c:Ljava/lang/String;

    .line 177
    .line 178
    const-string v6, "name"

    .line 179
    .line 180
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    iget-object v5, p0, Lua/a;->x:Lt4/b;

    .line 184
    .line 185
    iget v5, v5, Lt4/b;->f:I

    .line 186
    .line 187
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    const-string v6, "metadataInterval"

    .line 192
    .line 193
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    iget-object v5, p0, Lua/a;->x:Lt4/b;

    .line 197
    .line 198
    iget-object v5, v5, Lt4/b;->d:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    iget-object v4, p0, Lua/a;->x:Lt4/b;

    .line 204
    .line 205
    iget-boolean v4, v4, Lt4/b;->e:Z

    .line 206
    .line 207
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    const-string v5, "isPublic"

    .line 212
    .line 213
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    const-string v4, "headers"

    .line 217
    .line 218
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    :cond_3
    const-string v3, "icyMetadata"

    .line 222
    .line 223
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    const-string v2, "duration"

    .line 227
    .line 228
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    iget-object v1, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 232
    .line 233
    const-string v2, "currentIndex"

    .line 234
    .line 235
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    iget-object v1, p0, Lua/a;->J:Ljava/lang/Integer;

    .line 239
    .line 240
    const-string v2, "androidAudioSessionId"

    .line 241
    .line 242
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    iput-object v0, p0, Lua/a;->H:Ljava/util/HashMap;

    .line 246
    .line 247
    return-void
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

.method public final h0()V
    .locals 10

    .line 1
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    new-instance v0, Lv3/r;

    .line 6
    .line 7
    iget-object v1, p0, Lua/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lv3/r;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lua/a;->A:Lv3/j;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-boolean v4, v0, Lv3/r;->t:Z

    .line 19
    .line 20
    xor-int/2addr v4, v3

    .line 21
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Laa/m0;

    .line 25
    .line 26
    invoke-direct {v4, v1, v2}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    iput-object v4, v0, Lv3/r;->f:Ln7/q;

    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lua/a;->C:Lv3/i;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v4, v0, Lv3/r;->t:Z

    .line 36
    .line 37
    xor-int/2addr v4, v3

    .line 38
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Lv3/r;->p:Lv3/m0;

    .line 42
    .line 43
    :cond_1
    iget-boolean v1, p0, Lua/a;->B:Z

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance v1, Lv3/l;

    .line 48
    .line 49
    iget-object v4, p0, Lua/a;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-direct {v1, v4}, Lv3/l;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v3, v1, Lv3/l;->c:Z

    .line 55
    .line 56
    iget-boolean v4, v0, Lv3/r;->t:Z

    .line 57
    .line 58
    xor-int/2addr v4, v3

    .line 59
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Le;

    .line 63
    .line 64
    const/4 v5, 0x2

    .line 65
    invoke-direct {v4, v1, v5}, Le;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    iput-object v4, v0, Lv3/r;->c:Ln7/q;

    .line 69
    .line 70
    :cond_2
    iget-boolean v1, v0, Lv3/r;->t:Z

    .line 71
    .line 72
    xor-int/2addr v1, v3

    .line 73
    invoke-static {v1}, Lx6/b;->H(Z)V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, v0, Lv3/r;->t:Z

    .line 77
    .line 78
    new-instance v1, Lv3/d0;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lv3/d0;-><init>(Lv3/r;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lua/a;->I:Lv3/d0;

    .line 84
    .line 85
    iget-boolean v0, p0, Lua/a;->B:Z

    .line 86
    .line 87
    invoke-virtual {v1}, Lv3/d0;->u0()V

    .line 88
    .line 89
    .line 90
    iget-object v4, v1, Lv3/d0;->k:Lv3/g0;

    .line 91
    .line 92
    iget-object v4, v4, Lv3/g0;->p:Lv5/k;

    .line 93
    .line 94
    const/16 v5, 0x18

    .line 95
    .line 96
    invoke-interface {v4, v5, v0, v2}, Lv5/k;->b(III)Lv5/a0$a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 101
    .line 102
    .line 103
    iget-object v0, v1, Lv3/d0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lv3/o;

    .line 120
    .line 121
    invoke-interface {v1}, Lv3/o;->d()V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 126
    .line 127
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 128
    .line 129
    .line 130
    iget v0, v0, Lv3/d0;->V:I

    .line 131
    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_1
    iput-object v0, p0, Lua/a;->J:Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {p0}, Lua/a;->O()V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lua/a;->J:Ljava/lang/Integer;

    .line 146
    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    iget-object v0, p0, Lua/a;->D:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_8

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Ljava/util/Map;

    .line 166
    .line 167
    iget-object v4, p0, Lua/a;->J:Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    const-string v5, "type"

    .line 174
    .line 175
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    check-cast v6, Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const-string v7, "AndroidEqualizer"

    .line 185
    .line 186
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_6

    .line 191
    .line 192
    const-string v7, "AndroidLoudnessEnhancer"

    .line 193
    .line 194
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_5

    .line 199
    .line 200
    const-string v6, "targetGain"

    .line 201
    .line 202
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Ljava/lang/Double;

    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const-wide v8, 0x408f400000000000L    # 1000.0

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    mul-double/2addr v6, v8

    .line 218
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 219
    .line 220
    .line 221
    move-result-wide v6

    .line 222
    long-to-int v6, v6

    .line 223
    new-instance v7, Landroid/media/audiofx/LoudnessEnhancer;

    .line 224
    .line 225
    invoke-direct {v7, v4}, Landroid/media/audiofx/LoudnessEnhancer;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v6}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    const-string v2, "Unknown AudioEffect type: "

    .line 235
    .line 236
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_6
    new-instance v7, Landroid/media/audiofx/Equalizer;

    .line 256
    .line 257
    invoke-direct {v7, v2, v4}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 258
    .line 259
    .line 260
    :goto_3
    const-string v4, "enabled"

    .line 261
    .line 262
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    check-cast v4, Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-eqz v4, :cond_7

    .line 273
    .line 274
    invoke-virtual {v7, v3}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 275
    .line 276
    .line 277
    :cond_7
    iget-object v4, p0, Lua/a;->E:Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    iget-object v4, p0, Lua/a;->F:Ljava/util/HashMap;

    .line 283
    .line 284
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v4, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    goto/16 :goto_2

    .line 294
    .line 295
    :cond_8
    invoke-virtual {p0}, Lua/a;->f0()V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    .line 299
    .line 300
    iget-object v0, v0, Lv3/d0;->l:Lv5/l;

    .line 301
    .line 302
    invoke-virtual {v0, p0}, Lv5/l;->a(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :cond_9
    return-void
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

.method public final synthetic j(Lh5/c;)V
    .locals 0

    return-void
.end method

.method public final j0()Ljava/util/HashMap;
    .locals 15

    iget-object v0, p0, Lua/a;->F:Ljava/util/HashMap;

    const-string v1, "AndroidEqualizer"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/audiofx/Equalizer;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    move-result v4

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x6

    const/4 v9, 0x2

    const-wide v10, 0x408f400000000000L    # 1000.0

    const/4 v12, 0x1

    if-ge v3, v4, :cond_0

    const/16 v4, 0xa

    new-array v4, v4, [Ljava/lang/Object;

    const-string v13, "index"

    aput-object v13, v4, v2

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v13

    aput-object v13, v4, v12

    const-string v13, "lowerFrequency"

    aput-object v13, v4, v9

    invoke-virtual {v0, v3}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    move-result-object v9

    aget v9, v9, v2

    int-to-double v13, v9

    div-double/2addr v13, v10

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v4, v7

    const-string v7, "upperFrequency"

    aput-object v7, v4, v6

    invoke-virtual {v0, v3}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    move-result-object v6

    aget v6, v6, v12

    int-to-double v6, v6

    div-double/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    const-string v5, "centerFrequency"

    aput-object v5, v4, v8

    const/4 v5, 0x7

    invoke-virtual {v0, v3}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    move-result v6

    int-to-double v6, v6

    div-double/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    const/16 v5, 0x8

    const-string v6, "gain"

    aput-object v6, v4, v5

    const/16 v5, 0x9

    invoke-virtual {v0, v3}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    move-result v6

    int-to-double v6, v6

    div-double/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v4}, Lua/a;->x0([Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    goto :goto_0

    :cond_0
    new-array v3, v9, [Ljava/lang/Object;

    const-string v4, "parameters"

    aput-object v4, v3, v2

    new-array v4, v8, [Ljava/lang/Object;

    const-string v8, "minDecibels"

    aput-object v8, v4, v2

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v8

    aget-short v2, v8, v2

    int-to-double v13, v2

    div-double/2addr v13, v10

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v4, v12

    const-string v2, "maxDecibels"

    aput-object v2, v4, v9

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    aget-short v0, v0, v12

    int-to-double v8, v0

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v4, v7

    const-string v0, "bands"

    aput-object v0, v4, v6

    aput-object v1, v4, v5

    invoke-static {v4}, Lua/a;->x0([Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v0

    aput-object v0, v3, v12

    invoke-static {v3}, Lua/a;->x0([Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic k0(Lv3/o0;I)V
    .locals 0

    return-void
.end method

.method public final synthetic l0(Lv3/m;)V
    .locals 0

    return-void
.end method

.method public final synthetic m()V
    .locals 0

    return-void
.end method

.method public final synthetic m0(II)V
    .locals 0

    return-void
.end method

.method public final n0(ID)V
    .locals 3

    iget-object v0, p0, Lua/a;->F:Ljava/util/HashMap;

    const-string v1, "AndroidEqualizer"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/audiofx/Equalizer;

    int-to-short p1, p1

    const-wide v1, 0x408f400000000000L    # 1000.0

    mul-double/2addr p2, v1

    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    long-to-int p2, p2

    int-to-short p2, p2

    invoke-virtual {v0, p1, p2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    return-void
.end method

.method public final synthetic o(Z)V
    .locals 0

    return-void
.end method

.method public final o0(Ljava/lang/Object;)Lz4/t;
    .locals 2

    check-cast p1, Ljava/util/Map;

    const-string v0, "id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lua/a;->v:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/t;

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lua/a;->Q(Ljava/lang/Object;)Lz4/a;

    move-result-object v1

    iget-object p1, p0, Lua/a;->v:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    invoke-virtual/range {p0 .. p0}, Lua/a;->h0()V

    :try_start_0
    iget-object v2, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x10

    const/4 v6, 0x1

    const/4 v9, 0x0

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "audioEffectSetEnabled"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_1
    const-string v4, "setAutomaticallyWaitsToMinimizeStalling"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v4, "androidEqualizerGetParameters"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_3
    const-string v4, "setPreferredPeakBitRate"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_4
    const-string v4, "setSpeed"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x4

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "setPitch"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x5

    goto/16 :goto_0

    :sswitch_6
    const-string v4, "concatenatingMove"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v3, v5

    goto/16 :goto_0

    :sswitch_7
    const-string v4, "concatenatingRemoveRange"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "setVolume"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x3

    goto/16 :goto_0

    :sswitch_9
    const-string v4, "pause"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "seek"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_b
    const-string v4, "play"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v3, v6

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "load"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v3, v9

    goto :goto_0

    :sswitch_d
    const-string v4, "setLoopMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x7

    goto :goto_0

    :sswitch_e
    const-string v4, "setAndroidAudioAttributes"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x11

    goto :goto_0

    :sswitch_f
    const-string v4, "androidLoudnessEnhancerSetTargetGain"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x13

    goto :goto_0

    :sswitch_10
    const-string v4, "setCanUseNetworkResourcesForLiveStreamingWhilePaused"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xb

    goto :goto_0

    :sswitch_11
    const-string v4, "setShuffleOrder"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x9

    goto :goto_0

    :sswitch_12
    const-string v4, "concatenatingInsertAll"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0xe

    goto :goto_0

    :sswitch_13
    const-string v4, "setSkipSilence"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x6

    goto :goto_0

    :sswitch_14
    const-string v4, "setShuffleMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v3, 0x8

    goto :goto_0

    :sswitch_15
    const-string v4, "androidEqualizerBandSetGain"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/16 v3, 0x15

    :cond_0
    :goto_0
    const-wide/16 v10, 0x3e8

    const-string v2, "index"

    const-string v4, "audioSource"

    const-string v12, "enabled"

    const-string v13, "shuffleOrder"

    const-string v14, "id"

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    packed-switch v3, :pswitch_data_0

    :try_start_1
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_a

    :pswitch_0
    const-string v2, "bandIndex"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "gain"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v7, v2, v3, v4}, Lua/a;->n0(ID)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Lua/a;->j0()Ljava/util/HashMap;

    move-result-object v1

    goto/16 :goto_6

    :pswitch_2
    const-string v2, "targetGain"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Lua/a;->v0(D)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_3
    const-string v2, "type"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v7, v2, v1}, Lua/a;->B(Ljava/lang/String;Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_4
    const-string v2, "contentType"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "flags"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "usage"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7, v2, v3, v1}, Lua/a;->C0(III)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v2

    const-string v3, "currentIndex"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "newIndex"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v7, Lua/a;->M:Landroid/os/Handler;

    new-instance v9, Lta/d;

    invoke-direct {v9, v6, v8}, Lta/d;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v2, v3, v4, v5, v9}, Lz4/h;->K(IILandroid/os/Handler;Lta/d;)V

    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v2

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    :goto_1
    invoke-static {v1}, Lua/a;->U(Ljava/util/List;)Lz4/e0$a;

    move-result-object v1

    goto :goto_2

    :pswitch_6
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v2

    const-string v3, "startIndex"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "endIndex"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v6, v7, Lua/a;->M:Landroid/os/Handler;

    new-instance v9, Lu/a;

    invoke-direct {v9, v8, v5}, Lu/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3, v4, v6, v9}, Lz4/h;->M(IILandroid/os/Handler;Lu/a;)V

    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v2

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    goto :goto_1

    :pswitch_7
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v7, v3}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v3

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v4, "children"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v7, v4}, Lua/a;->q0(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v5, v7, Lua/a;->M:Landroid/os/Handler;

    new-instance v9, Lta/c;

    invoke-direct {v9, v6, v8}, Lta/c;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v3, v2, v4, v5, v9}, Lz4/h;->C(ILjava/util/ArrayList;Landroid/os/Handler;Lta/c;)V

    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lua/a;->P(Ljava/lang/Object;)Lz4/h;

    move-result-object v2

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    goto :goto_1

    :goto_2
    invoke-virtual {v2, v1}, Lz4/h;->P(Lz4/e0$a;)V

    goto/16 :goto_a

    :pswitch_8
    const-string v3, "position"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v3, :cond_1

    :goto_3
    move-wide v2, v15

    goto :goto_4

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    div-long v15, v2, v10

    goto :goto_3

    :goto_4
    invoke-virtual {v7, v2, v3, v1, v8}, Lua/a;->A0(JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_a

    :pswitch_9
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_a
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_b
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_c
    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7, v1}, Lua/a;->G0(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_6

    :pswitch_d
    const-string v2, "shuffleMode"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v6, :cond_2

    goto :goto_5

    :cond_2
    move v6, v9

    :goto_5
    invoke-virtual {v7, v6}, Lua/a;->F0(Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_e
    const-string v2, "loopMode"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7, v1}, Lua/a;->D0(I)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_f
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v7, v1}, Lua/a;->H0(Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_10
    const-string v2, "pitch"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lua/a;->E0(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_11
    const-string v2, "speed"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lua/a;->I0(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_12
    const-string v2, "volume"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lua/a;->J0(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_6

    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Lua/a;->y0()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :goto_6
    invoke-interface {v8, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_14
    invoke-virtual {v7, v8}, Lua/a;->z0(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_a

    :pswitch_15
    const-string v2, "initialPosition"

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lua/a;->t0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "initialIndex"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7, v1}, Lua/a;->o0(Ljava/lang/Object;)Lz4/t;

    move-result-object v3

    if-nez v2, :cond_3

    goto :goto_7

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    div-long/2addr v1, v10

    move-wide v15, v1

    :goto_7
    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v15

    move-object/from16 v6, p2

    invoke-virtual/range {v1 .. v6}, Lua/a;->u0(Lz4/t;JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v1, v0

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :catch_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :goto_9
    const/4 v2, 0x0

    invoke-interface {v8, v1, v2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lua/a;->H()V

    return-void

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lua/a;->H()V

    throw v1

    :sswitch_data_0
    .sparse-switch
        -0x7aad3a17 -> :sswitch_15
        -0x76787586 -> :sswitch_14
        -0x6fccfba0 -> :sswitch_13
        -0x5bd749ea -> :sswitch_12
        -0x5878aea9 -> :sswitch_11
        -0x29f8037e -> :sswitch_10
        -0x1494f7ca -> :sswitch_f
        -0x64229a0 -> :sswitch_e
        -0x2e1df17 -> :sswitch_d
        0x32c4e6 -> :sswitch_c
        0x348b34 -> :sswitch_b
        0x35ce78 -> :sswitch_a
        0x65825f6 -> :sswitch_9
        0x27f73e1c -> :sswitch_8
        0x3264dd87 -> :sswitch_7
        0x3ad42123 -> :sswitch_6
        0x538783fe -> :sswitch_5
        0x53b4c105 -> :sswitch_4
        0x56b389ef -> :sswitch_3
        0x60da657d -> :sswitch_2
        0x613a0038 -> :sswitch_1
        0x7e381ce6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic p0(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic q(I)V
    .locals 0

    return-void
.end method

.method public final q0(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lua/a;->o0(Ljava/lang/Object;)Lz4/t;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "List expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic r(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public final r0()J
    .locals 5

    iget-wide v0, p0, Lua/a;->q:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-wide v0

    :cond_0
    iget v0, p0, Lua/a;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lua/a;->p:Ljava/lang/Long;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lua/a;->p:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->P()J

    move-result-wide v0

    return-wide v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->P()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_4

    move-wide v0, v2

    :cond_4
    return-wide v0
.end method

.method public final s0()J
    .locals 2

    iget v0, p0, Lua/a;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lv3/d0;->getDuration()J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final u0(Lz4/t;JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    .line 1
    iput-wide p2, p0, Lua/a;->q:J

    .line 2
    .line 3
    iput-object p4, p0, Lua/a;->r:Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p3, p2

    .line 14
    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iput-object p3, p0, Lua/a;->L:Ljava/lang/Integer;

    .line 19
    .line 20
    iget p3, p0, Lua/a;->d:I

    .line 21
    .line 22
    invoke-static {p3}, Lq0/g;->c(I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-eqz p3, :cond_2

    .line 27
    .line 28
    const/4 p4, 0x1

    .line 29
    if-eq p3, p4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p3, 0x0

    .line 33
    const-string p4, "abort"

    .line 34
    .line 35
    const-string v0, "Connection aborted"

    .line 36
    .line 37
    invoke-virtual {p0, p4, v0, p3}, Lua/a;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    iget-object p3, p0, Lua/a;->I:Lv3/d0;

    .line 41
    .line 42
    invoke-virtual {p3}, Lv3/d0;->stop()V

    .line 43
    .line 44
    .line 45
    :cond_2
    iput p2, p0, Lua/a;->y:I

    .line 46
    .line 47
    iput-object p5, p0, Lua/a;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 48
    .line 49
    invoke-virtual {p0}, Lua/a;->K0()V

    .line 50
    .line 51
    .line 52
    const/4 p2, 0x2

    .line 53
    iput p2, p0, Lua/a;->d:I

    .line 54
    .line 55
    invoke-virtual {p0}, Lua/a;->f0()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lua/a;->K:Lz4/t;

    .line 59
    .line 60
    iget-object p2, p0, Lua/a;->I:Lv3/d0;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Lv3/d0;->l0(Lz4/t;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    .line 66
    .line 67
    invoke-virtual {p1}, Lv3/d0;->a()V

    .line 68
    .line 69
    .line 70
    return-void
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

.method public final v0(D)V
    .locals 2

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p1, p1

    iget-object p2, p0, Lua/a;->F:Ljava/util/HashMap;

    const-string v0, "AndroidLoudnessEnhancer"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/media/audiofx/LoudnessEnhancer;

    invoke-virtual {p2, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    return-void
.end method

.method public final w(Lp4/a;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, Lp4/a;->a:[Lp4/a$b;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    instance-of v2, v1, Lt4/c;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Lt4/c;

    .line 14
    .line 15
    iput-object v1, p0, Lua/a;->w:Lt4/c;

    .line 16
    .line 17
    invoke-virtual {p0}, Lua/a;->E()V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
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

.method public final synthetic x(I)V
    .locals 0

    return-void
.end method

.method public final y0()V
    .locals 2

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv3/d0;->m0(Z)V

    invoke-virtual {p0}, Lua/a;->K0()V

    iget-object v0, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_1
    return-void
.end method

.method public final z0(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lua/a;->I:Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_1
    iput-object p1, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object p1, p0, Lua/a;->I:Lv3/d0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lv3/d0;->m0(Z)V

    invoke-virtual {p0}, Lua/a;->K0()V

    iget p1, p0, Lua/a;->d:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz p1, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lua/a;->t:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_2
    return-void
.end method
