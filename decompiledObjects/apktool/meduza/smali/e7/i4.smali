.class public final Le7/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:Le7/k3;


# direct methods
.method public constructor <init>(Le7/k3;)V
    .locals 0

    iput-object p1, p0, Le7/i4;->a:Le7/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzeb;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Le7/s4;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, v0, Le7/s4;->p:Lcom/google/android/gms/internal/measurement/zzeb;

    .line 11
    .line 12
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-object v2, v0, Le7/s4;->p:Lcom/google/android/gms/internal/measurement/zzeb;

    .line 20
    .line 21
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Le7/h;->A()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, v0, Le7/s4;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzeb;->zza:I

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
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

.method public final b(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 8
    .line 9
    const-string v1, "onActivityCreated"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzeb;->zzc:Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 19
    .line 20
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1, p2}, Le7/s4;->w(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const-string v2, "com.android.vending.referral_url"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const/4 v1, 0x0

    .line 65
    :goto_1
    move-object v5, v1

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/net/Uri;->isHierarchical()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iget-object v1, p0, Le7/i4;->a:Le7/k3;

    .line 76
    .line 77
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Le7/r6;->S(Landroid/content/Intent;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    const-string v0, "gs"

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const-string v0, "auto"

    .line 90
    .line 91
    :goto_2
    move-object v6, v0

    .line 92
    const-string v0, "referrer"

    .line 93
    .line 94
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    if-nez p2, :cond_6

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    goto :goto_3

    .line 102
    :cond_6
    const/4 v0, 0x0

    .line 103
    :goto_3
    move v4, v0

    .line 104
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 105
    .line 106
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Le7/n3;

    .line 111
    .line 112
    move-object v2, v1

    .line 113
    move-object v3, p0

    .line 114
    invoke-direct/range {v2 .. v7}, Le7/n3;-><init>(Le7/i4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catchall_0
    move-exception v0

    .line 122
    goto :goto_4

    .line 123
    :catch_0
    move-exception v0

    .line 124
    :try_start_2
    iget-object v1, p0, Le7/i4;->a:Le7/k3;

    .line 125
    .line 126
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 131
    .line 132
    const-string v2, "Throwable caught in onActivityCreated"

    .line 133
    .line 134
    invoke-virtual {v1, v2, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :goto_4
    iget-object v1, p0, Le7/i4;->a:Le7/k3;

    .line 139
    .line 140
    invoke-virtual {v1}, Le7/o0;->p()Le7/s4;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1, p1, p2}, Le7/s4;->w(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V

    .line 145
    .line 146
    .line 147
    throw v0
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

.method public final c(Lcom/google/android/gms/internal/measurement/zzeb;)V
    .locals 6

    .line 1
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Le7/s4;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    iput-boolean v2, v0, Le7/s4;->t:Z

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    iput-boolean v2, v0, Le7/s4;->q:Z

    .line 15
    .line 16
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v0}, Ld2/q;->zzb()Lv6/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lb/z;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Le7/h;->A()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v5, 0x0

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iput-object v5, v0, Le7/s4;->d:Le7/q4;

    .line 42
    .line 43
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v1, Le7/v4;

    .line 48
    .line 49
    invoke-direct {v1, v0, v3, v4}, Le7/v4;-><init>(Le7/s4;J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0, p1}, Le7/s4;->A(Lcom/google/android/gms/internal/measurement/zzeb;)Le7/q4;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v1, v0, Le7/s4;->d:Le7/q4;

    .line 61
    .line 62
    iput-object v1, v0, Le7/s4;->e:Le7/q4;

    .line 63
    .line 64
    iput-object v5, v0, Le7/s4;->d:Le7/q4;

    .line 65
    .line 66
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v5, Le7/s3;

    .line 71
    .line 72
    invoke-direct {v5, v0, p1, v3, v4}, Le7/s3;-><init>(Le7/s4;Le7/q4;J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v5}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object p1, p0, Le7/i4;->a:Le7/k3;

    .line 79
    .line 80
    invoke-virtual {p1}, Le7/o0;->r()Le7/q5;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ld2/q;->zzb()Lv6/b;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lb/z;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    invoke-virtual {p1}, Ld2/q;->zzl()Le7/e2;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    new-instance v4, Le7/i0;

    .line 102
    .line 103
    invoke-direct {v4, p1, v0, v1, v2}, Le7/i0;-><init>(Le7/o0;JI)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v4}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    throw p1
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

.method public final d(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Le7/h;->A()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-nez p2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, v0, Le7/s4;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzeb;->zza:I

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Le7/q4;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-wide v1, p1, Le7/q4;->c:J

    .line 44
    .line 45
    const-string v3, "id"

    .line 46
    .line 47
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p1, Le7/q4;->a:Ljava/lang/String;

    .line 51
    .line 52
    const-string v2, "name"

    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Le7/q4;->b:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "referrer_name"

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string p1, "com.google.app_measurement.screen_service"

    .line 65
    .line 66
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    :goto_0
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
.end method

.method public final e(Lcom/google/android/gms/internal/measurement/zzeb;)V
    .locals 6

    .line 1
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->r()Le7/q5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ld2/q;->zzb()Lv6/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lb/z;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Le7/p5;

    .line 25
    .line 26
    invoke-direct {v4, v0, v1, v2}, Le7/p5;-><init>(Le7/q5;J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v4}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Le7/i4;->a:Le7/k3;

    .line 33
    .line 34
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, Le7/s4;->u:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v1

    .line 41
    const/4 v2, 0x1

    .line 42
    :try_start_0
    iput-boolean v2, v0, Le7/s4;->t:Z

    .line 43
    .line 44
    iget-object v3, v0, Le7/s4;->p:Lcom/google/android/gms/internal/measurement/zzeb;

    .line 45
    .line 46
    invoke-static {p1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    iget-object v3, v0, Le7/s4;->u:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    iput-object p1, v0, Le7/s4;->p:Lcom/google/android/gms/internal/measurement/zzeb;

    .line 57
    .line 58
    iput-boolean v4, v0, Le7/s4;->q:Z

    .line 59
    .line 60
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Le7/h;->A()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    iput-object v3, v0, Le7/s4;->r:Le7/q4;

    .line 73
    .line 74
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v5, Le7/t4;

    .line 79
    .line 80
    invoke-direct {v5, v0, v2}, Le7/t4;-><init>(Le7/s4;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v5}, Le7/e2;->u(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    :try_start_4
    throw p1

    .line 90
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 91
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Le7/h;->A()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_1

    .line 100
    .line 101
    iget-object p1, v0, Le7/s4;->r:Le7/q4;

    .line 102
    .line 103
    iput-object p1, v0, Le7/s4;->d:Le7/q4;

    .line 104
    .line 105
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v1, Le7/t4;

    .line 110
    .line 111
    invoke-direct {v1, v0, v4}, Le7/t4;-><init>(Le7/s4;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v0, p1}, Le7/s4;->A(Lcom/google/android/gms/internal/measurement/zzeb;)Le7/q4;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzeb;->zzb:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v0, p1, v1, v4}, Le7/s4;->z(Ljava/lang/String;Le7/q4;Z)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Le7/j2;

    .line 130
    .line 131
    iget-object p1, p1, Le7/j2;->y:Le7/a;

    .line 132
    .line 133
    if-eqz p1, :cond_2

    .line 134
    .line 135
    invoke-virtual {p1}, Ld2/q;->zzb()Lv6/b;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lb/z;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    invoke-virtual {p1}, Ld2/q;->zzl()Le7/e2;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, Le7/i0;

    .line 153
    .line 154
    invoke-direct {v3, p1, v0, v1, v4}, Le7/i0;-><init>(Le7/o0;JI)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v3}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    return-void

    .line 161
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    const-string v0, "Component not created"

    .line 164
    .line 165
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :catchall_1
    move-exception p1

    .line 170
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 171
    throw p1
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

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Le7/i4;->b(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    invoke-virtual {p0, p1}, Le7/i4;->a(Lcom/google/android/gms/internal/measurement/zzeb;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    invoke-virtual {p0, p1}, Le7/i4;->c(Lcom/google/android/gms/internal/measurement/zzeb;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    invoke-virtual {p0, p1}, Le7/i4;->e(Lcom/google/android/gms/internal/measurement/zzeb;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Le7/i4;->d(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
