.class public final Lgb/g2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final g:Leb/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/c$b<",
            "Lgb/g2$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Boolean;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Lgb/a3;

.field public final f:Lgb/x0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leb/c$b;

    .line 2
    .line 3
    const-string v1, "io.grpc.internal.ManagedChannelServiceConfig.MethodInfo"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Leb/c$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgb/g2$a;->g:Leb/c$b;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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

.method public constructor <init>(Ljava/util/Map;ZII)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;ZII)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "timeout"

    .line 9
    .line 10
    invoke-static {v2, v1}, Lgb/n1;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, v0, Lgb/g2$a;->a:Ljava/lang/Long;

    .line 15
    .line 16
    const-string v2, "waitForReady"

    .line 17
    .line 18
    invoke-static {v2, v1}, Lgb/n1;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, v0, Lgb/g2$a;->b:Ljava/lang/Boolean;

    .line 23
    .line 24
    const-string v2, "maxResponseMessageBytes"

    .line 25
    .line 26
    invoke-static {v2, v1}, Lgb/n1;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, v0, Lgb/g2$a;->c:Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-ltz v5, :cond_0

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v5, 0x0

    .line 43
    :goto_0
    const-string v6, "maxInboundMessageSize %s exceeds bounds"

    .line 44
    .line 45
    invoke-static {v2, v6, v5}, Lx6/b;->n(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const-string v2, "maxRequestMessageBytes"

    .line 49
    .line 50
    invoke-static {v2, v1}, Lgb/n1;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, v0, Lgb/g2$a;->d:Ljava/lang/Integer;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-ltz v5, :cond_2

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 v5, 0x0

    .line 67
    :goto_1
    const-string v6, "maxOutboundMessageSize %s exceeds bounds"

    .line 68
    .line 69
    invoke-static {v2, v6, v5}, Lx6/b;->n(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-eqz p2, :cond_4

    .line 73
    .line 74
    const-string v5, "retryPolicy"

    .line 75
    .line 76
    invoke-static {v5, v1}, Lgb/n1;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 v5, 0x0

    .line 82
    :goto_2
    const-string v6, "%s must not contain OK"

    .line 83
    .line 84
    const-string v7, "maxAttempts must be greater than 1: %s"

    .line 85
    .line 86
    const-string v8, "maxAttempts cannot be empty"

    .line 87
    .line 88
    const-string v9, "maxAttempts"

    .line 89
    .line 90
    const/4 v10, 0x2

    .line 91
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    if-nez v5, :cond_5

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    goto/16 :goto_c

    .line 97
    .line 98
    :cond_5
    invoke-static {v9, v5}, Lgb/n1;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-static {v13, v8}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-lt v13, v10, :cond_6

    .line 110
    .line 111
    const/4 v14, 0x1

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    const/4 v14, 0x0

    .line 114
    :goto_3
    invoke-static {v13, v7, v14}, Lx6/b;->l(ILjava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    move/from16 v14, p3

    .line 118
    .line 119
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    const-string v13, "initialBackoff"

    .line 124
    .line 125
    invoke-static {v13, v5}, Lgb/n1;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    const-string v14, "initialBackoff cannot be empty"

    .line 130
    .line 131
    invoke-static {v13, v14}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v13

    .line 138
    cmp-long v16, v13, v11

    .line 139
    .line 140
    if-lez v16, :cond_7

    .line 141
    .line 142
    const/4 v2, 0x1

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    const/4 v2, 0x0

    .line 145
    :goto_4
    const-string v3, "initialBackoffNanos must be greater than 0: %s"

    .line 146
    .line 147
    invoke-static {v13, v14, v3, v2}, Lx6/b;->m(JLjava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    const-string v2, "maxBackoff"

    .line 151
    .line 152
    invoke-static {v2, v5}, Lgb/n1;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const-string v3, "maxBackoff cannot be empty"

    .line 157
    .line 158
    invoke-static {v2, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    cmp-long v16, v2, v11

    .line 166
    .line 167
    if-lez v16, :cond_8

    .line 168
    .line 169
    const/4 v10, 0x1

    .line 170
    goto :goto_5

    .line 171
    :cond_8
    const/4 v10, 0x0

    .line 172
    :goto_5
    const-string v4, "maxBackoff must be greater than 0: %s"

    .line 173
    .line 174
    invoke-static {v2, v3, v4, v10}, Lx6/b;->m(JLjava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    const-string v4, "backoffMultiplier"

    .line 178
    .line 179
    invoke-static {v4, v5}, Lgb/n1;->e(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Double;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    const-string v10, "backoffMultiplier cannot be empty"

    .line 184
    .line 185
    invoke-static {v4, v10}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v20

    .line 192
    const-wide/16 v16, 0x0

    .line 193
    .line 194
    cmpl-double v4, v20, v16

    .line 195
    .line 196
    if-lez v4, :cond_9

    .line 197
    .line 198
    const/4 v4, 0x1

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    const/4 v4, 0x0

    .line 201
    :goto_6
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    const-string v11, "backoffMultiplier must be greater than 0: %s"

    .line 206
    .line 207
    invoke-static {v10, v11, v4}, Lx6/b;->n(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 208
    .line 209
    .line 210
    const-string v4, "perAttemptRecvTimeout"

    .line 211
    .line 212
    invoke-static {v4, v5}, Lgb/n1;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    if-eqz v4, :cond_b

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v10

    .line 222
    const-wide/16 v16, 0x0

    .line 223
    .line 224
    cmp-long v10, v10, v16

    .line 225
    .line 226
    if-ltz v10, :cond_a

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_a
    const/4 v10, 0x0

    .line 230
    goto :goto_8

    .line 231
    :cond_b
    :goto_7
    const/4 v10, 0x1

    .line 232
    :goto_8
    const-string v11, "perAttemptRecvTimeout cannot be negative: %s"

    .line 233
    .line 234
    invoke-static {v4, v11, v10}, Lx6/b;->n(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 235
    .line 236
    .line 237
    const-string v10, "retryableStatusCodes"

    .line 238
    .line 239
    invoke-static {v10, v5}, Lgb/g3;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    if-eqz v5, :cond_c

    .line 244
    .line 245
    const/4 v11, 0x1

    .line 246
    goto :goto_9

    .line 247
    :cond_c
    const/4 v11, 0x0

    .line 248
    :goto_9
    const-string v12, "%s is required in retry policy"

    .line 249
    .line 250
    invoke-static {v10, v12, v11}, Lb/z;->r(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 251
    .line 252
    .line 253
    sget-object v11, Leb/e1$a;->c:Leb/e1$a;

    .line 254
    .line 255
    invoke-interface {v5, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    const/4 v12, 0x1

    .line 260
    xor-int/2addr v11, v12

    .line 261
    invoke-static {v10, v6, v11}, Lb/z;->r(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    if-nez v4, :cond_e

    .line 265
    .line 266
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-nez v10, :cond_d

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_d
    const/4 v12, 0x0

    .line 274
    goto :goto_b

    .line 275
    :cond_e
    :goto_a
    const/4 v12, 0x1

    .line 276
    :goto_b
    const-string v10, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout"

    .line 277
    .line 278
    invoke-static {v10, v12}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 279
    .line 280
    .line 281
    new-instance v10, Lgb/a3;

    .line 282
    .line 283
    move-wide v11, v13

    .line 284
    move-object v14, v10

    .line 285
    move-wide/from16 v16, v11

    .line 286
    .line 287
    move-wide/from16 v18, v2

    .line 288
    .line 289
    move-object/from16 v22, v4

    .line 290
    .line 291
    move-object/from16 v23, v5

    .line 292
    .line 293
    invoke-direct/range {v14 .. v23}, Lgb/a3;-><init>(IJJDLjava/lang/Long;Ljava/util/Set;)V

    .line 294
    .line 295
    .line 296
    :goto_c
    iput-object v10, v0, Lgb/g2$a;->e:Lgb/a3;

    .line 297
    .line 298
    if-eqz p2, :cond_f

    .line 299
    .line 300
    const-string v2, "hedgingPolicy"

    .line 301
    .line 302
    invoke-static {v2, v1}, Lgb/n1;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    goto :goto_d

    .line 307
    :cond_f
    const/4 v1, 0x0

    .line 308
    :goto_d
    if-nez v1, :cond_10

    .line 309
    .line 310
    const/4 v2, 0x0

    .line 311
    goto :goto_11

    .line 312
    :cond_10
    invoke-static {v9, v1}, Lgb/n1;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-static {v2, v8}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    const/4 v3, 0x2

    .line 324
    if-lt v2, v3, :cond_11

    .line 325
    .line 326
    const/4 v12, 0x1

    .line 327
    goto :goto_e

    .line 328
    :cond_11
    const/4 v12, 0x0

    .line 329
    :goto_e
    invoke-static {v2, v7, v12}, Lx6/b;->l(ILjava/lang/String;Z)V

    .line 330
    .line 331
    .line 332
    move/from16 v3, p4

    .line 333
    .line 334
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    const-string v3, "hedgingDelay"

    .line 339
    .line 340
    invoke-static {v3, v1}, Lgb/n1;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    const-string v4, "hedgingDelay cannot be empty"

    .line 345
    .line 346
    invoke-static {v3, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 350
    .line 351
    .line 352
    move-result-wide v3

    .line 353
    const-wide/16 v7, 0x0

    .line 354
    .line 355
    cmp-long v5, v3, v7

    .line 356
    .line 357
    if-ltz v5, :cond_12

    .line 358
    .line 359
    const/4 v5, 0x1

    .line 360
    goto :goto_f

    .line 361
    :cond_12
    const/4 v5, 0x0

    .line 362
    :goto_f
    const-string v7, "hedgingDelay must not be negative: %s"

    .line 363
    .line 364
    invoke-static {v3, v4, v7, v5}, Lx6/b;->m(JLjava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    new-instance v5, Lgb/x0;

    .line 368
    .line 369
    const-string v7, "nonFatalStatusCodes"

    .line 370
    .line 371
    invoke-static {v7, v1}, Lgb/g3;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Set;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    if-nez v1, :cond_13

    .line 376
    .line 377
    const-class v1, Leb/e1$a;

    .line 378
    .line 379
    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    goto :goto_10

    .line 388
    :cond_13
    sget-object v8, Leb/e1$a;->c:Leb/e1$a;

    .line 389
    .line 390
    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    const/4 v9, 0x1

    .line 395
    xor-int/2addr v8, v9

    .line 396
    invoke-static {v7, v6, v8}, Lb/z;->r(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 397
    .line 398
    .line 399
    :goto_10
    invoke-direct {v5, v2, v3, v4, v1}, Lgb/x0;-><init>(IJLjava/util/Set;)V

    .line 400
    .line 401
    .line 402
    move-object v2, v5

    .line 403
    :goto_11
    iput-object v2, v0, Lgb/g2$a;->f:Lgb/x0;

    .line 404
    .line 405
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgb/g2$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgb/g2$a;

    iget-object v0, p0, Lgb/g2$a;->a:Ljava/lang/Long;

    iget-object v2, p1, Lgb/g2$a;->a:Ljava/lang/Long;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/g2$a;->b:Ljava/lang/Boolean;

    iget-object v2, p1, Lgb/g2$a;->b:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/g2$a;->c:Ljava/lang/Integer;

    iget-object v2, p1, Lgb/g2$a;->c:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/g2$a;->d:Ljava/lang/Integer;

    iget-object v2, p1, Lgb/g2$a;->d:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/g2$a;->e:Lgb/a3;

    iget-object v2, p1, Lgb/g2$a;->e:Lgb/a3;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/g2$a;->f:Lgb/x0;

    iget-object p1, p1, Lgb/g2$a;->f:Lgb/x0;

    invoke-static {v0, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lgb/g2$a;->a:Ljava/lang/Long;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/g2$a;->b:Ljava/lang/Boolean;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/g2$a;->c:Ljava/lang/Integer;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/g2$a;->d:Ljava/lang/Integer;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/g2$a;->e:Lgb/a3;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/g2$a;->f:Lgb/x0;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Lgb/g2$a;->a:Ljava/lang/Long;

    const-string v2, "timeoutNanos"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/g2$a;->b:Ljava/lang/Boolean;

    const-string v2, "waitForReady"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/g2$a;->c:Ljava/lang/Integer;

    const-string v2, "maxInboundMessageSize"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/g2$a;->d:Ljava/lang/Integer;

    const-string v2, "maxOutboundMessageSize"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/g2$a;->e:Lgb/a3;

    const-string v2, "retryPolicy"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgb/g2$a;->f:Lgb/x0;

    const-string v2, "hedgingPolicy"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
