.class public final Lx2/u$i;
.super Lp1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx2/u;-><init>(Lp1/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/d;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lp1/d;-><init>(Lp1/j;I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public final e(Lt1/f;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    check-cast v1, Lx2/s;

    .line 6
    .line 7
    iget-object v2, v1, Lx2/s;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, v3}, Lt1/d;->d0(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {v0, v3, v2}, Lt1/d;->n(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v2, v1, Lx2/s;->b:Lo2/o$b;

    .line 20
    .line 21
    invoke-static {v2}, Lx2/z;->f(Lo2/o$b;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    int-to-long v4, v2

    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-interface {v0, v2, v4, v5}, Lt1/d;->F(IJ)V

    .line 28
    .line 29
    .line 30
    iget-object v4, v1, Lx2/s;->c:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    invoke-interface {v0, v5}, Lt1/d;->d0(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {v0, v5, v4}, Lt1/d;->n(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    iget-object v4, v1, Lx2/s;->d:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v0, v6}, Lt1/d;->d0(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-interface {v0, v6, v4}, Lt1/d;->n(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v4, v1, Lx2/s;->e:Landroidx/work/c;

    .line 55
    .line 56
    invoke-static {v4}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const/4 v7, 0x5

    .line 61
    if-nez v4, :cond_3

    .line 62
    .line 63
    invoke-interface {v0, v7}, Lt1/d;->d0(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-interface {v0, v4, v7}, Lt1/d;->T([BI)V

    .line 68
    .line 69
    .line 70
    :goto_3
    iget-object v4, v1, Lx2/s;->f:Landroidx/work/c;

    .line 71
    .line 72
    invoke-static {v4}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v7, 0x6

    .line 77
    if-nez v4, :cond_4

    .line 78
    .line 79
    invoke-interface {v0, v7}, Lt1/d;->d0(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-interface {v0, v4, v7}, Lt1/d;->T([BI)V

    .line 84
    .line 85
    .line 86
    :goto_4
    const/4 v4, 0x7

    .line 87
    iget-wide v8, v1, Lx2/s;->g:J

    .line 88
    .line 89
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 90
    .line 91
    .line 92
    const/16 v4, 0x8

    .line 93
    .line 94
    iget-wide v8, v1, Lx2/s;->h:J

    .line 95
    .line 96
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 97
    .line 98
    .line 99
    const/16 v4, 0x9

    .line 100
    .line 101
    iget-wide v8, v1, Lx2/s;->i:J

    .line 102
    .line 103
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 104
    .line 105
    .line 106
    const/16 v4, 0xa

    .line 107
    .line 108
    iget v8, v1, Lx2/s;->k:I

    .line 109
    .line 110
    int-to-long v8, v8

    .line 111
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 112
    .line 113
    .line 114
    iget v4, v1, Lx2/s;->l:I

    .line 115
    .line 116
    const-string v8, "backoffPolicy"

    .line 117
    .line 118
    invoke-static {v4, v8}, La0/j;->p(ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v4}, Lq0/g;->c(I)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    if-ne v4, v3, :cond_5

    .line 128
    .line 129
    move v4, v3

    .line 130
    goto :goto_5

    .line 131
    :cond_5
    new-instance v0, Ln7/w;

    .line 132
    .line 133
    invoke-direct {v0}, Ln7/w;-><init>()V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_6
    const/4 v4, 0x0

    .line 138
    :goto_5
    const/16 v8, 0xb

    .line 139
    .line 140
    int-to-long v9, v4

    .line 141
    invoke-interface {v0, v8, v9, v10}, Lt1/d;->F(IJ)V

    .line 142
    .line 143
    .line 144
    const/16 v4, 0xc

    .line 145
    .line 146
    iget-wide v8, v1, Lx2/s;->m:J

    .line 147
    .line 148
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 149
    .line 150
    .line 151
    const/16 v4, 0xd

    .line 152
    .line 153
    iget-wide v8, v1, Lx2/s;->n:J

    .line 154
    .line 155
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 156
    .line 157
    .line 158
    const/16 v4, 0xe

    .line 159
    .line 160
    iget-wide v8, v1, Lx2/s;->o:J

    .line 161
    .line 162
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 163
    .line 164
    .line 165
    const/16 v4, 0xf

    .line 166
    .line 167
    iget-wide v8, v1, Lx2/s;->p:J

    .line 168
    .line 169
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 170
    .line 171
    .line 172
    iget-boolean v4, v1, Lx2/s;->q:Z

    .line 173
    .line 174
    const/16 v8, 0x10

    .line 175
    .line 176
    int-to-long v9, v4

    .line 177
    invoke-interface {v0, v8, v9, v10}, Lt1/d;->F(IJ)V

    .line 178
    .line 179
    .line 180
    iget v4, v1, Lx2/s;->r:I

    .line 181
    .line 182
    const-string v8, "policy"

    .line 183
    .line 184
    invoke-static {v4, v8}, La0/j;->p(ILjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v4}, Lq0/g;->c(I)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_8

    .line 192
    .line 193
    if-ne v4, v3, :cond_7

    .line 194
    .line 195
    move v4, v3

    .line 196
    goto :goto_6

    .line 197
    :cond_7
    new-instance v0, Ln7/w;

    .line 198
    .line 199
    invoke-direct {v0}, Ln7/w;-><init>()V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_8
    const/4 v4, 0x0

    .line 204
    :goto_6
    const/16 v8, 0x11

    .line 205
    .line 206
    int-to-long v9, v4

    .line 207
    invoke-interface {v0, v8, v9, v10}, Lt1/d;->F(IJ)V

    .line 208
    .line 209
    .line 210
    const/16 v4, 0x12

    .line 211
    .line 212
    iget v8, v1, Lx2/s;->s:I

    .line 213
    .line 214
    int-to-long v8, v8

    .line 215
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 216
    .line 217
    .line 218
    const/16 v4, 0x13

    .line 219
    .line 220
    iget v8, v1, Lx2/s;->t:I

    .line 221
    .line 222
    int-to-long v8, v8

    .line 223
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 224
    .line 225
    .line 226
    const/16 v4, 0x14

    .line 227
    .line 228
    iget-wide v8, v1, Lx2/s;->u:J

    .line 229
    .line 230
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 231
    .line 232
    .line 233
    const/16 v4, 0x15

    .line 234
    .line 235
    iget v8, v1, Lx2/s;->v:I

    .line 236
    .line 237
    int-to-long v8, v8

    .line 238
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 239
    .line 240
    .line 241
    const/16 v4, 0x16

    .line 242
    .line 243
    iget v8, v1, Lx2/s;->w:I

    .line 244
    .line 245
    int-to-long v8, v8

    .line 246
    invoke-interface {v0, v4, v8, v9}, Lt1/d;->F(IJ)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v1, Lx2/s;->j:Lo2/c;

    .line 250
    .line 251
    const/16 v4, 0x1c

    .line 252
    .line 253
    const/16 v8, 0x1b

    .line 254
    .line 255
    const/16 v9, 0x1a

    .line 256
    .line 257
    const/16 v10, 0x19

    .line 258
    .line 259
    const/16 v11, 0x18

    .line 260
    .line 261
    const/16 v12, 0x17

    .line 262
    .line 263
    const/16 v13, 0x1e

    .line 264
    .line 265
    if-eqz v1, :cond_11

    .line 266
    .line 267
    iget v14, v1, Lo2/c;->a:I

    .line 268
    .line 269
    const-string v15, "networkType"

    .line 270
    .line 271
    invoke-static {v14, v15}, La0/j;->p(ILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v14}, Lq0/g;->c(I)I

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    if-eqz v15, :cond_d

    .line 279
    .line 280
    if-eq v15, v3, :cond_e

    .line 281
    .line 282
    if-eq v15, v2, :cond_c

    .line 283
    .line 284
    if-eq v15, v5, :cond_b

    .line 285
    .line 286
    if-eq v15, v6, :cond_a

    .line 287
    .line 288
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 289
    .line 290
    if-lt v2, v13, :cond_9

    .line 291
    .line 292
    if-ne v14, v7, :cond_9

    .line 293
    .line 294
    const/4 v3, 0x5

    .line 295
    goto :goto_7

    .line 296
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    const-string v1, "Could not convert "

    .line 299
    .line 300
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-static {v14}, La0/j;->x(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v2, " to int"

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v0

    .line 324
    :cond_a
    move v3, v6

    .line 325
    goto :goto_7

    .line 326
    :cond_b
    move v3, v5

    .line 327
    goto :goto_7

    .line 328
    :cond_c
    move v3, v2

    .line 329
    goto :goto_7

    .line 330
    :cond_d
    const/4 v3, 0x0

    .line 331
    :cond_e
    :goto_7
    int-to-long v2, v3

    .line 332
    invoke-interface {v0, v12, v2, v3}, Lt1/d;->F(IJ)V

    .line 333
    .line 334
    .line 335
    iget-boolean v2, v1, Lo2/c;->b:Z

    .line 336
    .line 337
    int-to-long v2, v2

    .line 338
    invoke-interface {v0, v11, v2, v3}, Lt1/d;->F(IJ)V

    .line 339
    .line 340
    .line 341
    iget-boolean v2, v1, Lo2/c;->c:Z

    .line 342
    .line 343
    int-to-long v2, v2

    .line 344
    invoke-interface {v0, v10, v2, v3}, Lt1/d;->F(IJ)V

    .line 345
    .line 346
    .line 347
    iget-boolean v2, v1, Lo2/c;->d:Z

    .line 348
    .line 349
    int-to-long v2, v2

    .line 350
    invoke-interface {v0, v9, v2, v3}, Lt1/d;->F(IJ)V

    .line 351
    .line 352
    .line 353
    iget-boolean v2, v1, Lo2/c;->e:Z

    .line 354
    .line 355
    int-to-long v2, v2

    .line 356
    invoke-interface {v0, v8, v2, v3}, Lt1/d;->F(IJ)V

    .line 357
    .line 358
    .line 359
    iget-wide v2, v1, Lo2/c;->f:J

    .line 360
    .line 361
    invoke-interface {v0, v4, v2, v3}, Lt1/d;->F(IJ)V

    .line 362
    .line 363
    .line 364
    iget-wide v2, v1, Lo2/c;->g:J

    .line 365
    .line 366
    const/16 v4, 0x1d

    .line 367
    .line 368
    invoke-interface {v0, v4, v2, v3}, Lt1/d;->F(IJ)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v1, Lo2/c;->h:Ljava/util/Set;

    .line 372
    .line 373
    const-string v2, "triggers"

    .line 374
    .line 375
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_f

    .line 383
    .line 384
    const/4 v1, 0x0

    .line 385
    new-array v1, v1, [B

    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_f
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 389
    .line 390
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 391
    .line 392
    .line 393
    :try_start_0
    new-instance v3, Ljava/io/ObjectOutputStream;

    .line 394
    .line 395
    invoke-direct {v3, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 396
    .line 397
    .line 398
    :try_start_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    invoke-virtual {v3, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-eqz v4, :cond_10

    .line 414
    .line 415
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    check-cast v4, Lo2/c$a;

    .line 420
    .line 421
    iget-object v5, v4, Lo2/c$a;->a:Landroid/net/Uri;

    .line 422
    .line 423
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    iget-boolean v4, v4, Lo2/c$a;->b:Z

    .line 431
    .line 432
    invoke-virtual {v3, v4}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 433
    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_10
    sget-object v1, Lrb/h;->a:Lrb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 437
    .line 438
    const/4 v1, 0x0

    .line 439
    :try_start_2
    invoke-static {v3, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 440
    .line 441
    .line 442
    invoke-static {v2, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    const-string v2, "outputStream.toByteArray()"

    .line 450
    .line 451
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :goto_9
    invoke-interface {v0, v1, v13}, Lt1/d;->T([BI)V

    .line 455
    .line 456
    .line 457
    goto :goto_a

    .line 458
    :catchall_0
    move-exception v0

    .line 459
    move-object v1, v0

    .line 460
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 461
    :catchall_1
    move-exception v0

    .line 462
    move-object v4, v0

    .line 463
    :try_start_4
    invoke-static {v3, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 467
    :catchall_2
    move-exception v0

    .line 468
    move-object v1, v0

    .line 469
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 470
    :catchall_3
    move-exception v0

    .line 471
    move-object v3, v0

    .line 472
    invoke-static {v2, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 473
    .line 474
    .line 475
    throw v3

    .line 476
    :cond_11
    invoke-interface {v0, v12}, Lt1/d;->d0(I)V

    .line 477
    .line 478
    .line 479
    invoke-interface {v0, v11}, Lt1/d;->d0(I)V

    .line 480
    .line 481
    .line 482
    invoke-interface {v0, v10}, Lt1/d;->d0(I)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v0, v9}, Lt1/d;->d0(I)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v0, v8}, Lt1/d;->d0(I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0, v4}, Lt1/d;->d0(I)V

    .line 492
    .line 493
    .line 494
    const/16 v1, 0x1d

    .line 495
    .line 496
    invoke-interface {v0, v1}, Lt1/d;->d0(I)V

    .line 497
    .line 498
    .line 499
    invoke-interface {v0, v13}, Lt1/d;->d0(I)V

    .line 500
    .line 501
    .line 502
    :goto_a
    return-void
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
