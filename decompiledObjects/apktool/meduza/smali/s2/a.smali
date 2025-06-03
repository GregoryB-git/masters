.class public final Ls2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/ComponentName;

.field public final b:Lo2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobInfoConverter"

    invoke-static {v0}, Lo2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls2/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lp2/m0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls2/a;->b:Lo2/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance p2, Landroid/content/ComponentName;

    const-class v0, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {p2, p1, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object p2, p0, Ls2/a;->a:Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public final a(Lx2/s;I)Landroid/app/job/JobInfo;
    .locals 12

    .line 1
    iget-object v0, p1, Lx2/s;->j:Lo2/c;

    .line 2
    .line 3
    new-instance v1, Landroid/os/PersistableBundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Lx2/s;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v3, "EXTRA_WORK_SPEC_ID"

    .line 11
    .line 12
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v2, p1, Lx2/s;->t:I

    .line 16
    .line 17
    const-string v3, "EXTRA_WORK_SPEC_GENERATION"

    .line 18
    .line 19
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lx2/s;->c()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "EXTRA_IS_PERIODIC"

    .line 27
    .line 28
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroid/app/job/JobInfo$Builder;

    .line 32
    .line 33
    iget-object v3, p0, Ls2/a;->a:Landroid/content/ComponentName;

    .line 34
    .line 35
    invoke-direct {v2, p2, v3}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p2, v0, Lo2/c;->b:Z

    .line 39
    .line 40
    invoke-virtual {v2, p2}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-boolean v2, v0, Lo2/c;->c:Z

    .line 45
    .line 46
    invoke-virtual {p2, v2}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget v1, v0, Lo2/c;->a:I

    .line 55
    .line 56
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    const/16 v4, 0x1e

    .line 60
    .line 61
    const/16 v5, 0x1a

    .line 62
    .line 63
    const/16 v6, 0x18

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x1

    .line 67
    if-lt v2, v4, :cond_0

    .line 68
    .line 69
    const/4 v4, 0x6

    .line 70
    if-ne v1, v4, :cond_0

    .line 71
    .line 72
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 73
    .line 74
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 v4, 0x19

    .line 78
    .line 79
    invoke-virtual {v1, v4}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {p2, v1}, Ld2/k;->i(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_0
    invoke-static {v1}, Lq0/g;->c(I)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    if-eq v4, v8, :cond_5

    .line 98
    .line 99
    if-eq v4, v3, :cond_4

    .line 100
    .line 101
    const/4 v9, 0x3

    .line 102
    if-eq v4, v9, :cond_2

    .line 103
    .line 104
    const/4 v9, 0x4

    .line 105
    if-eq v4, v9, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    if-lt v2, v5, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    if-lt v2, v6, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    :goto_0
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    sget-object v9, Ls2/a;->c:Ljava/lang/String;

    .line 119
    .line 120
    const-string v10, "API version too low. Cannot convert network type value "

    .line 121
    .line 122
    invoke-static {v10}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-static {v1}, La0/j;->x(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v4, v9, v1}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    move v9, v3

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    :goto_1
    move v9, v8

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    move v9, v7

    .line 146
    :goto_2
    invoke-virtual {p2, v9}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 147
    .line 148
    .line 149
    :goto_3
    iget-boolean v1, v0, Lo2/c;->c:Z

    .line 150
    .line 151
    if-nez v1, :cond_8

    .line 152
    .line 153
    iget v1, p1, Lx2/s;->l:I

    .line 154
    .line 155
    if-ne v1, v3, :cond_7

    .line 156
    .line 157
    move v1, v7

    .line 158
    goto :goto_4

    .line 159
    :cond_7
    move v1, v8

    .line 160
    :goto_4
    iget-wide v3, p1, Lx2/s;->m:J

    .line 161
    .line 162
    invoke-virtual {p2, v3, v4, v1}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {p1}, Lx2/s;->a()J

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    iget-object v1, p0, Ls2/a;->b:Lo2/a;

    .line 170
    .line 171
    invoke-interface {v1}, Lo2/a;->a()J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    sub-long/2addr v3, v9

    .line 176
    const-wide/16 v9, 0x0

    .line 177
    .line 178
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 179
    .line 180
    .line 181
    move-result-wide v3

    .line 182
    const/16 v1, 0x1c

    .line 183
    .line 184
    if-gt v2, v1, :cond_9

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_9
    cmp-long v1, v3, v9

    .line 188
    .line 189
    if-lez v1, :cond_a

    .line 190
    .line 191
    :goto_5
    invoke-virtual {p2, v3, v4}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_a
    iget-boolean v1, p1, Lx2/s;->q:Z

    .line 196
    .line 197
    if-nez v1, :cond_b

    .line 198
    .line 199
    invoke-static {p2}, Lcom/google/android/recaptcha/internal/a;->l(Landroid/app/job/JobInfo$Builder;)V

    .line 200
    .line 201
    .line 202
    :cond_b
    :goto_6
    if-lt v2, v6, :cond_d

    .line 203
    .line 204
    invoke-virtual {v0}, Lo2/c;->a()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_d

    .line 209
    .line 210
    iget-object v1, v0, Lo2/c;->h:Ljava/util/Set;

    .line 211
    .line 212
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_c

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Lo2/c$a;

    .line 227
    .line 228
    iget-boolean v6, v2, Lo2/c$a;->b:Z

    .line 229
    .line 230
    new-instance v11, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 231
    .line 232
    iget-object v2, v2, Lo2/c$a;->a:Landroid/net/Uri;

    .line 233
    .line 234
    invoke-direct {v11, v2, v6}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, v11}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_c
    iget-wide v1, v0, Lo2/c;->f:J

    .line 242
    .line 243
    invoke-virtual {p2, v1, v2}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 244
    .line 245
    .line 246
    iget-wide v1, v0, Lo2/c;->g:J

    .line 247
    .line 248
    invoke-virtual {p2, v1, v2}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 249
    .line 250
    .line 251
    :cond_d
    invoke-virtual {p2, v7}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 252
    .line 253
    .line 254
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 255
    .line 256
    if-lt v1, v5, :cond_e

    .line 257
    .line 258
    iget-boolean v2, v0, Lo2/c;->d:Z

    .line 259
    .line 260
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/base/a;->r(Landroid/app/job/JobInfo$Builder;Z)V

    .line 261
    .line 262
    .line 263
    iget-boolean v0, v0, Lo2/c;->e:Z

    .line 264
    .line 265
    invoke-static {p2, v0}, Lc0/b;->r(Landroid/app/job/JobInfo$Builder;Z)V

    .line 266
    .line 267
    .line 268
    :cond_e
    iget v0, p1, Lx2/s;->k:I

    .line 269
    .line 270
    if-lez v0, :cond_f

    .line 271
    .line 272
    move v0, v8

    .line 273
    goto :goto_8

    .line 274
    :cond_f
    move v0, v7

    .line 275
    :goto_8
    cmp-long v2, v3, v9

    .line 276
    .line 277
    if-lez v2, :cond_10

    .line 278
    .line 279
    move v7, v8

    .line 280
    :cond_10
    const/16 v2, 0x1f

    .line 281
    .line 282
    if-lt v1, v2, :cond_11

    .line 283
    .line 284
    iget-boolean p1, p1, Lx2/s;->q:Z

    .line 285
    .line 286
    if-eqz p1, :cond_11

    .line 287
    .line 288
    if-nez v0, :cond_11

    .line 289
    .line 290
    if-nez v7, :cond_11

    .line 291
    .line 292
    invoke-static {p2}, La4/r;->e(Landroid/app/job/JobInfo$Builder;)V

    .line 293
    .line 294
    .line 295
    :cond_11
    invoke-virtual {p2}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1
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
