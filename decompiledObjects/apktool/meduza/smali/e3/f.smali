.class public final Le3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/f$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Le3/f$a;

.field public c:Landroid/app/Activity;

.field public d:I

.field public e:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    iget-object v0, p0, Le3/f;->a:Landroid/content/Context;

    const/16 v1, 0x15

    invoke-static {v0, v1}, Le3/g;->c(Landroid/content/Context;I)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    const-string v0, "permissions_handler"

    const-string v2, "Bluetooth permission missing in manifest"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_2
    return v2
.end method

.method public final b(I)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, 0x0

    .line 11
    const/16 v5, 0x11

    .line 12
    .line 13
    if-ne v1, v5, :cond_3

    .line 14
    .line 15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v3, 0x21

    .line 18
    .line 19
    if-ge v1, v3, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Le3/f;->a:Landroid/content/Context;

    .line 22
    .line 23
    new-instance v3, Lu/u;

    .line 24
    .line 25
    invoke-direct {v3, v1}, Lu/u;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lu/u;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v1, v0, Le3/f;->a:Landroid/content/Context;

    .line 38
    .line 39
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v1, v0, Le3/f;->c:Landroid/app/Activity;

    .line 49
    .line 50
    invoke-static {v1, v3}, Le3/g;->b(Landroid/app/Activity;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    :goto_0
    return v2

    .line 55
    :cond_3
    const/16 v5, 0x15

    .line 56
    .line 57
    if-ne v1, v5, :cond_4

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p0}, Le3/f;->a()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    return v1

    .line 64
    :cond_4
    const/16 v5, 0x1f

    .line 65
    .line 66
    const/16 v6, 0x1e

    .line 67
    .line 68
    if-eq v1, v6, :cond_5

    .line 69
    .line 70
    const/16 v7, 0x1c

    .line 71
    .line 72
    if-eq v1, v7, :cond_5

    .line 73
    .line 74
    const/16 v7, 0x1d

    .line 75
    .line 76
    if-ne v1, v7, :cond_6

    .line 77
    .line 78
    :cond_5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    if-ge v7, v5, :cond_6

    .line 81
    .line 82
    invoke-virtual/range {p0 .. p0}, Le3/f;->a()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    return v1

    .line 87
    :cond_6
    const/16 v7, 0x25

    .line 88
    .line 89
    if-eq v1, v7, :cond_7

    .line 90
    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    :cond_7
    invoke-virtual/range {p0 .. p0}, Le3/f;->c()Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-nez v7, :cond_8

    .line 98
    .line 99
    return v4

    .line 100
    :cond_8
    iget-object v7, v0, Le3/f;->a:Landroid/content/Context;

    .line 101
    .line 102
    invoke-static {v7, v1}, Le3/g;->c(Landroid/content/Context;I)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    const-string v8, "permissions_handler"

    .line 107
    .line 108
    if-nez v7, :cond_9

    .line 109
    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v4, "No android specific permissions needed for: "

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    return v2

    .line 131
    :cond_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    const/4 v10, 0x2

    .line 136
    const/16 v11, 0x16

    .line 137
    .line 138
    const/16 v12, 0x10

    .line 139
    .line 140
    if-nez v9, :cond_b

    .line 141
    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v3, "No permissions found in manifest for: "

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v8, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    if-ne v1, v11, :cond_a

    .line 166
    .line 167
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 168
    .line 169
    if-ge v1, v6, :cond_a

    .line 170
    .line 171
    return v10

    .line 172
    :cond_a
    return v4

    .line 173
    :cond_b
    iget-object v8, v0, Le3/f;->a:Landroid/content/Context;

    .line 174
    .line 175
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    iget v8, v8, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 180
    .line 181
    const/16 v9, 0x17

    .line 182
    .line 183
    if-lt v8, v9, :cond_c

    .line 184
    .line 185
    move v8, v2

    .line 186
    goto :goto_1

    .line 187
    :cond_c
    move v8, v4

    .line 188
    :goto_1
    if-eqz v8, :cond_1d

    .line 189
    .line 190
    new-instance v8, Ljava/util/HashSet;

    .line 191
    .line 192
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-eqz v13, :cond_1c

    .line 204
    .line 205
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    check-cast v13, Ljava/lang/String;

    .line 210
    .line 211
    if-ne v1, v12, :cond_e

    .line 212
    .line 213
    iget-object v13, v0, Le3/f;->a:Landroid/content/Context;

    .line 214
    .line 215
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    iget-object v14, v0, Le3/f;->a:Landroid/content/Context;

    .line 220
    .line 221
    const-string v15, "power"

    .line 222
    .line 223
    invoke-virtual {v14, v15}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    check-cast v14, Landroid/os/PowerManager;

    .line 228
    .line 229
    if-eqz v14, :cond_d

    .line 230
    .line 231
    invoke-virtual {v14, v13}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    if-eqz v13, :cond_d

    .line 236
    .line 237
    goto/16 :goto_7

    .line 238
    .line 239
    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    goto/16 :goto_4

    .line 244
    .line 245
    :cond_e
    if-ne v1, v11, :cond_10

    .line 246
    .line 247
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 248
    .line 249
    if-ge v13, v6, :cond_f

    .line 250
    .line 251
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-virtual {v8, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_f
    invoke-static {}, Le0/g0;->i()Z

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    goto :goto_3

    .line 263
    :cond_10
    if-ne v1, v9, :cond_11

    .line 264
    .line 265
    iget-object v13, v0, Le3/f;->a:Landroid/content/Context;

    .line 266
    .line 267
    invoke-static {v13}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    goto :goto_3

    .line 272
    :cond_11
    const/16 v14, 0x18

    .line 273
    .line 274
    if-ne v1, v14, :cond_12

    .line 275
    .line 276
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 277
    .line 278
    const/16 v14, 0x1a

    .line 279
    .line 280
    if-lt v13, v14, :cond_1b

    .line 281
    .line 282
    iget-object v13, v0, Le3/f;->a:Landroid/content/Context;

    .line 283
    .line 284
    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-static {v13}, Lc0/b;->z(Landroid/content/pm/PackageManager;)Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    goto :goto_3

    .line 293
    :cond_12
    const/16 v14, 0x1b

    .line 294
    .line 295
    if-ne v1, v14, :cond_13

    .line 296
    .line 297
    iget-object v13, v0, Le3/f;->a:Landroid/content/Context;

    .line 298
    .line 299
    const-string v14, "notification"

    .line 300
    .line 301
    invoke-virtual {v13, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    check-cast v13, Landroid/app/NotificationManager;

    .line 306
    .line 307
    invoke-virtual {v13}, Landroid/app/NotificationManager;->isNotificationPolicyAccessGranted()Z

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    goto :goto_3

    .line 312
    :cond_13
    const/16 v14, 0x22

    .line 313
    .line 314
    if-ne v1, v14, :cond_14

    .line 315
    .line 316
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 317
    .line 318
    if-lt v13, v5, :cond_19

    .line 319
    .line 320
    iget-object v13, v0, Le3/f;->a:Landroid/content/Context;

    .line 321
    .line 322
    const-string v14, "alarm"

    .line 323
    .line 324
    invoke-virtual {v13, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    check-cast v13, Landroid/app/AlarmManager;

    .line 329
    .line 330
    invoke-static {v13}, La4/r;->h(Landroid/app/AlarmManager;)Z

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    goto :goto_3

    .line 335
    :cond_14
    const/16 v15, 0x9

    .line 336
    .line 337
    if-eq v1, v15, :cond_16

    .line 338
    .line 339
    const/16 v15, 0x20

    .line 340
    .line 341
    if-ne v1, v15, :cond_15

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_15
    iget-object v14, v0, Le3/f;->a:Landroid/content/Context;

    .line 345
    .line 346
    invoke-static {v14, v13}, Lv/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    if-eqz v14, :cond_1b

    .line 351
    .line 352
    iget-object v14, v0, Le3/f;->c:Landroid/app/Activity;

    .line 353
    .line 354
    invoke-static {v14, v13}, Le3/g;->b(Landroid/app/Activity;Ljava/lang/String;)I

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    :goto_3
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v13

    .line 362
    :goto_4
    invoke-virtual {v8, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_16
    :goto_5
    iget-object v15, v0, Le3/f;->a:Landroid/content/Context;

    .line 367
    .line 368
    invoke-static {v15, v13}, Lv/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 369
    .line 370
    .line 371
    move-result v15

    .line 372
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 373
    .line 374
    if-lt v4, v14, :cond_17

    .line 375
    .line 376
    iget-object v4, v0, Le3/f;->a:Landroid/content/Context;

    .line 377
    .line 378
    const-string v14, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    .line 379
    .line 380
    invoke-static {v4, v14}, Lv/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    goto :goto_6

    .line 385
    :cond_17
    move v4, v15

    .line 386
    :goto_6
    if-nez v4, :cond_18

    .line 387
    .line 388
    const/4 v4, -0x1

    .line 389
    if-ne v15, v4, :cond_18

    .line 390
    .line 391
    const/4 v4, 0x3

    .line 392
    goto :goto_8

    .line 393
    :cond_18
    if-nez v15, :cond_1a

    .line 394
    .line 395
    :cond_19
    :goto_7
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_1a
    iget-object v4, v0, Le3/f;->c:Landroid/app/Activity;

    .line 400
    .line 401
    invoke-static {v4, v13}, Le3/g;->b(Landroid/app/Activity;Ljava/lang/String;)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    :goto_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v8, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :cond_1b
    :goto_9
    const/4 v4, 0x0

    .line 413
    goto/16 :goto_2

    .line 414
    .line 415
    :cond_1c
    invoke-virtual {v8}, Ljava/util/HashSet;->isEmpty()Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_1d

    .line 420
    .line 421
    invoke-static {v8}, Le3/g;->e(Ljava/util/HashSet;)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    return v1

    .line 430
    :cond_1d
    return v2
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

.method public final c()Z
    .locals 5

    iget-object v0, p0, Le3/f;->a:Landroid/content/Context;

    const/16 v1, 0x25

    invoke-static {v0, v1}, Le3/g;->c(Landroid/content/Context;I)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string v3, "android.permission.WRITE_CALENDAR"

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v0, :cond_1

    const-string v4, "android.permission.READ_CALENDAR"

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    move v4, v1

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    if-nez v4, :cond_5

    const-string v1, "permissions_handler"

    if-nez v3, :cond_3

    const-string v3, "android.permission.WRITE_CALENDAR missing in manifest"

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    if-nez v0, :cond_4

    const-string v0, "android.permission.READ_CALENDAR missing in manifest"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return v2

    :cond_5
    return v1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 3

    iget-object p2, p0, Le3/f;->c:Landroid/app/Activity;

    const/4 p3, 0x0

    if-nez p2, :cond_0

    return p3

    :cond_0
    iget-object v0, p0, Le3/f;->e:Ljava/util/HashMap;

    if-nez v0, :cond_1

    iput p3, p0, Le3/f;->d:I

    return p3

    :cond_1
    const/16 v0, 0xd1

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    const/16 p1, 0x10

    iget-object p2, p0, Le3/f;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Le3/f;->a:Landroid/content/Context;

    const-string v2, "power"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p2}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_0

    :cond_2
    const/16 v0, 0xd2

    if-ne p1, v0, :cond_4

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1e

    if-lt p1, p2, :cond_3

    invoke-static {}, Le0/g0;->i()Z

    move-result p3

    const/16 p1, 0x16

    goto :goto_1

    :cond_3
    return p3

    :cond_4
    const/16 v0, 0xd3

    if-ne p1, v0, :cond_5

    invoke-static {p2}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result p3

    const/16 p1, 0x17

    goto :goto_1

    :cond_5
    const/16 v0, 0xd4

    if-ne p1, v0, :cond_7

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_6

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-static {p1}, Lc0/b;->z(Landroid/content/pm/PackageManager;)Z

    move-result p3

    const/16 p1, 0x18

    goto :goto_1

    :cond_6
    return p3

    :cond_7
    const/16 v0, 0xd5

    if-ne p1, v0, :cond_8

    const-string p1, "notification"

    invoke-virtual {p2, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p1}, Landroid/app/NotificationManager;->isNotificationPolicyAccessGranted()Z

    move-result p3

    const/16 p1, 0x1b

    goto :goto_1

    :cond_8
    const/16 v0, 0xd6

    if-ne p1, v0, :cond_c

    const/16 p1, 0x22

    const-string p3, "alarm"

    invoke-virtual {p2, p3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/AlarmManager;

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p3, v0, :cond_9

    invoke-static {p2}, La4/r;->h(Landroid/app/AlarmManager;)Z

    move-result p3

    goto :goto_1

    :cond_9
    :goto_0
    move p3, v1

    :cond_a
    :goto_1
    iget-object p2, p0, Le3/f;->e:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Le3/f;->d:I

    sub-int/2addr p1, v1

    iput p1, p0, Le3/f;->d:I

    iget-object p2, p0, Le3/f;->b:Le3/f$a;

    if-eqz p2, :cond_b

    if-nez p1, :cond_b

    iget-object p1, p0, Le3/f;->e:Ljava/util/HashMap;

    check-cast p2, Le3/c;

    iget-object p2, p2, Le3/c;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_b
    return v1

    :cond_c
    return p3
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 29

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
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x18

    .line 9
    .line 10
    move/from16 v5, p1

    .line 11
    .line 12
    if-eq v5, v4, :cond_0

    .line 13
    .line 14
    iput v3, v0, Le3/f;->d:I

    .line 15
    .line 16
    return v3

    .line 17
    :cond_0
    iget-object v5, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 18
    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    return v3

    .line 22
    :cond_1
    array-length v5, v1

    .line 23
    if-nez v5, :cond_2

    .line 24
    .line 25
    array-length v5, v2

    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    const-string v1, "permissions_handler"

    .line 29
    .line 30
    const-string v2, "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues"

    .line 31
    .line 32
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    invoke-static/range {p2 .. p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-string v6, "android.permission.WRITE_CALENDAR"

    .line 41
    .line 42
    invoke-interface {v5, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const-string v8, "android.permission.READ_CALENDAR"

    .line 47
    .line 48
    const/16 v9, 0x24

    .line 49
    .line 50
    const/16 v10, 0x25

    .line 51
    .line 52
    if-ltz v7, :cond_3

    .line 53
    .line 54
    aget v7, v2, v7

    .line 55
    .line 56
    iget-object v11, v0, Le3/f;->c:Landroid/app/Activity;

    .line 57
    .line 58
    invoke-static {v11, v6, v7}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget-object v11, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    invoke-virtual {v11, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-interface {v5, v8}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-ltz v5, :cond_3

    .line 80
    .line 81
    aget v5, v2, v5

    .line 82
    .line 83
    iget-object v11, v0, Le3/f;->c:Landroid/app/Activity;

    .line 84
    .line 85
    invoke-static {v11, v8, v5}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    new-instance v11, Ljava/util/HashSet;

    .line 98
    .line 99
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-static {v11}, Le3/g;->e(Ljava/util/HashSet;)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    iget-object v7, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-virtual {v7, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-object v7, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v7, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_3
    move v5, v3

    .line 143
    :goto_0
    array-length v7, v1

    .line 144
    if-ge v5, v7, :cond_39

    .line 145
    .line 146
    aget-object v7, v1, v5

    .line 147
    .line 148
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-nez v12, :cond_38

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    if-eqz v12, :cond_4

    .line 159
    .line 160
    goto/16 :goto_a

    .line 161
    .line 162
    :cond_4
    const/4 v12, 0x7

    .line 163
    const/16 v13, 0x8

    .line 164
    .line 165
    const/4 v14, 0x4

    .line 166
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v16

    .line 170
    const/16 v3, 0x1d

    .line 171
    .line 172
    const/16 v4, 0x14

    .line 173
    .line 174
    const/16 v9, 0x9

    .line 175
    .line 176
    const/4 v10, 0x3

    .line 177
    const/16 v17, 0x5

    .line 178
    .line 179
    const/16 v18, 0xe

    .line 180
    .line 181
    const/16 v15, 0x20

    .line 182
    .line 183
    const/16 v20, 0x1e

    .line 184
    .line 185
    const/16 v21, 0x1c

    .line 186
    .line 187
    const/16 v22, 0x1b

    .line 188
    .line 189
    const/16 v23, 0x17

    .line 190
    .line 191
    const/16 v24, 0x16

    .line 192
    .line 193
    const/16 v25, 0x2

    .line 194
    .line 195
    const/16 v26, 0xc

    .line 196
    .line 197
    const/16 v27, 0xd

    .line 198
    .line 199
    sparse-switch v16, :sswitch_data_0

    .line 200
    .line 201
    .line 202
    :goto_1
    const/16 v19, -0x1

    .line 203
    .line 204
    goto/16 :goto_3

    .line 205
    .line 206
    :sswitch_0
    const-string v11, "com.android.voicemail.permission.ADD_VOICEMAIL"

    .line 207
    .line 208
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-nez v11, :cond_5

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    const/16 v11, 0x28

    .line 216
    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :sswitch_1
    const-string v11, "android.permission.ACCESS_MEDIA_LOCATION"

    .line 220
    .line 221
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-nez v11, :cond_6

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_6
    const/16 v11, 0x27

    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :sswitch_2
    const-string v11, "android.permission.BLUETOOTH_SCAN"

    .line 233
    .line 234
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-nez v11, :cond_7

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_7
    const/16 v11, 0x26

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    :sswitch_3
    const-string v11, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 246
    .line 247
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-nez v11, :cond_8

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_8
    const/16 v19, 0x25

    .line 255
    .line 256
    goto/16 :goto_3

    .line 257
    .line 258
    :sswitch_4
    const-string v11, "android.permission.READ_CONTACTS"

    .line 259
    .line 260
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    if-nez v11, :cond_9

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_9
    const/16 v19, 0x24

    .line 268
    .line 269
    goto/16 :goto_3

    .line 270
    .line 271
    :sswitch_5
    const-string v11, "android.permission.RECORD_AUDIO"

    .line 272
    .line 273
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-nez v11, :cond_a

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_a
    const/16 v11, 0x23

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :sswitch_6
    const-string v11, "android.permission.ACTIVITY_RECOGNITION"

    .line 285
    .line 286
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-nez v11, :cond_b

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_b
    const/16 v11, 0x22

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :sswitch_7
    const-string v11, "android.permission.REQUEST_INSTALL_PACKAGES"

    .line 298
    .line 299
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    if-nez v11, :cond_c

    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_c
    const/16 v11, 0x21

    .line 307
    .line 308
    goto/16 :goto_2

    .line 309
    .line 310
    :sswitch_8
    const-string v11, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 311
    .line 312
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    if-nez v11, :cond_d

    .line 317
    .line 318
    goto :goto_1

    .line 319
    :cond_d
    move/from16 v19, v15

    .line 320
    .line 321
    goto/16 :goto_3

    .line 322
    .line 323
    :sswitch_9
    const-string v11, "android.permission.GET_ACCOUNTS"

    .line 324
    .line 325
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-nez v11, :cond_e

    .line 330
    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :cond_e
    const/16 v11, 0x1f

    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :sswitch_a
    const-string v11, "android.permission.BLUETOOTH_ADVERTISE"

    .line 338
    .line 339
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v11

    .line 343
    if-nez v11, :cond_f

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :cond_f
    move/from16 v19, v20

    .line 348
    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :sswitch_b
    const-string v11, "android.permission.SCHEDULE_EXACT_ALARM"

    .line 352
    .line 353
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    if-nez v11, :cond_10

    .line 358
    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    :cond_10
    move/from16 v19, v3

    .line 362
    .line 363
    goto/16 :goto_3

    .line 364
    .line 365
    :sswitch_c
    const-string v11, "android.permission.USE_SIP"

    .line 366
    .line 367
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    if-nez v11, :cond_11

    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :cond_11
    move/from16 v19, v21

    .line 376
    .line 377
    goto/16 :goto_3

    .line 378
    .line 379
    :sswitch_d
    const-string v11, "android.permission.READ_MEDIA_VIDEO"

    .line 380
    .line 381
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v11

    .line 385
    if-nez v11, :cond_12

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :cond_12
    move/from16 v19, v22

    .line 390
    .line 391
    goto/16 :goto_3

    .line 392
    .line 393
    :sswitch_e
    const-string v11, "android.permission.READ_MEDIA_AUDIO"

    .line 394
    .line 395
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    if-nez v11, :cond_13

    .line 400
    .line 401
    goto/16 :goto_1

    .line 402
    .line 403
    :cond_13
    const/16 v11, 0x1a

    .line 404
    .line 405
    goto/16 :goto_2

    .line 406
    .line 407
    :sswitch_f
    const-string v11, "android.permission.WRITE_CALL_LOG"

    .line 408
    .line 409
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    if-nez v11, :cond_14

    .line 414
    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :cond_14
    const/16 v11, 0x19

    .line 418
    .line 419
    goto/16 :goto_2

    .line 420
    .line 421
    :sswitch_10
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v11

    .line 425
    if-nez v11, :cond_15

    .line 426
    .line 427
    goto/16 :goto_1

    .line 428
    .line 429
    :cond_15
    const/16 v19, 0x18

    .line 430
    .line 431
    goto/16 :goto_3

    .line 432
    .line 433
    :sswitch_11
    const-string v11, "android.permission.CAMERA"

    .line 434
    .line 435
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    if-nez v11, :cond_16

    .line 440
    .line 441
    goto/16 :goto_1

    .line 442
    .line 443
    :cond_16
    move/from16 v19, v23

    .line 444
    .line 445
    goto/16 :goto_3

    .line 446
    .line 447
    :sswitch_12
    const-string v11, "android.permission.BODY_SENSORS_BACKGROUND"

    .line 448
    .line 449
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    if-nez v11, :cond_17

    .line 454
    .line 455
    goto/16 :goto_1

    .line 456
    .line 457
    :cond_17
    move/from16 v19, v24

    .line 458
    .line 459
    goto/16 :goto_3

    .line 460
    .line 461
    :sswitch_13
    const-string v11, "android.permission.WRITE_CONTACTS"

    .line 462
    .line 463
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    if-nez v11, :cond_18

    .line 468
    .line 469
    goto/16 :goto_1

    .line 470
    .line 471
    :cond_18
    const/16 v11, 0x15

    .line 472
    .line 473
    goto/16 :goto_2

    .line 474
    .line 475
    :sswitch_14
    const-string v11, "android.permission.READ_MEDIA_IMAGES"

    .line 476
    .line 477
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    if-nez v11, :cond_19

    .line 482
    .line 483
    goto/16 :goto_1

    .line 484
    .line 485
    :cond_19
    move/from16 v19, v4

    .line 486
    .line 487
    goto/16 :goto_3

    .line 488
    .line 489
    :sswitch_15
    const-string v11, "android.permission.CALL_PHONE"

    .line 490
    .line 491
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    if-nez v11, :cond_1a

    .line 496
    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :cond_1a
    const/16 v11, 0x13

    .line 500
    .line 501
    goto/16 :goto_2

    .line 502
    .line 503
    :sswitch_16
    const-string v11, "android.permission.SEND_SMS"

    .line 504
    .line 505
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    if-nez v11, :cond_1b

    .line 510
    .line 511
    goto/16 :goto_1

    .line 512
    .line 513
    :cond_1b
    const/16 v11, 0x12

    .line 514
    .line 515
    goto/16 :goto_2

    .line 516
    .line 517
    :sswitch_17
    const-string v11, "android.permission.READ_PHONE_STATE"

    .line 518
    .line 519
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-nez v11, :cond_1c

    .line 524
    .line 525
    goto/16 :goto_1

    .line 526
    .line 527
    :cond_1c
    const/16 v11, 0x11

    .line 528
    .line 529
    goto/16 :goto_2

    .line 530
    .line 531
    :sswitch_18
    const-string v11, "android.permission.ACCESS_COARSE_LOCATION"

    .line 532
    .line 533
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v11

    .line 537
    if-nez v11, :cond_1d

    .line 538
    .line 539
    goto/16 :goto_1

    .line 540
    .line 541
    :cond_1d
    const/16 v11, 0x10

    .line 542
    .line 543
    goto/16 :goto_2

    .line 544
    .line 545
    :sswitch_19
    const-string v11, "android.permission.READ_EXTERNAL_STORAGE"

    .line 546
    .line 547
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v11

    .line 551
    if-nez v11, :cond_1e

    .line 552
    .line 553
    goto/16 :goto_1

    .line 554
    .line 555
    :cond_1e
    const/16 v11, 0xf

    .line 556
    .line 557
    goto/16 :goto_2

    .line 558
    .line 559
    :sswitch_1a
    const-string v11, "android.permission.BLUETOOTH_CONNECT"

    .line 560
    .line 561
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    if-nez v11, :cond_1f

    .line 566
    .line 567
    goto/16 :goto_1

    .line 568
    .line 569
    :cond_1f
    move/from16 v19, v18

    .line 570
    .line 571
    goto/16 :goto_3

    .line 572
    .line 573
    :sswitch_1b
    const-string v11, "android.permission.RECEIVE_SMS"

    .line 574
    .line 575
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    if-nez v11, :cond_20

    .line 580
    .line 581
    goto/16 :goto_1

    .line 582
    .line 583
    :cond_20
    move/from16 v19, v27

    .line 584
    .line 585
    goto/16 :goto_3

    .line 586
    .line 587
    :sswitch_1c
    const-string v11, "android.permission.RECEIVE_MMS"

    .line 588
    .line 589
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v11

    .line 593
    if-nez v11, :cond_21

    .line 594
    .line 595
    goto/16 :goto_1

    .line 596
    .line 597
    :cond_21
    move/from16 v19, v26

    .line 598
    .line 599
    goto/16 :goto_3

    .line 600
    .line 601
    :sswitch_1d
    const-string v11, "android.permission.NEARBY_WIFI_DEVICES"

    .line 602
    .line 603
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v11

    .line 607
    if-nez v11, :cond_22

    .line 608
    .line 609
    goto/16 :goto_1

    .line 610
    .line 611
    :cond_22
    const/16 v11, 0xb

    .line 612
    .line 613
    goto :goto_2

    .line 614
    :sswitch_1e
    const-string v11, "android.permission.READ_PHONE_NUMBERS"

    .line 615
    .line 616
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    if-nez v11, :cond_23

    .line 621
    .line 622
    goto/16 :goto_1

    .line 623
    .line 624
    :cond_23
    const/16 v11, 0xa

    .line 625
    .line 626
    goto :goto_2

    .line 627
    :sswitch_1f
    const-string v11, "android.permission.BODY_SENSORS"

    .line 628
    .line 629
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v11

    .line 633
    if-nez v11, :cond_24

    .line 634
    .line 635
    goto/16 :goto_1

    .line 636
    .line 637
    :cond_24
    move/from16 v19, v9

    .line 638
    .line 639
    goto/16 :goto_3

    .line 640
    .line 641
    :sswitch_20
    const-string v11, "android.permission.RECEIVE_WAP_PUSH"

    .line 642
    .line 643
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v11

    .line 647
    if-nez v11, :cond_25

    .line 648
    .line 649
    goto/16 :goto_1

    .line 650
    .line 651
    :cond_25
    const/16 v11, 0x8

    .line 652
    .line 653
    goto :goto_2

    .line 654
    :sswitch_21
    const-string v11, "android.permission.SYSTEM_ALERT_WINDOW"

    .line 655
    .line 656
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v11

    .line 660
    if-nez v11, :cond_26

    .line 661
    .line 662
    goto/16 :goto_1

    .line 663
    .line 664
    :cond_26
    const/4 v11, 0x7

    .line 665
    goto :goto_2

    .line 666
    :sswitch_22
    const-string v11, "android.permission.ACCESS_NOTIFICATION_POLICY"

    .line 667
    .line 668
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    if-nez v11, :cond_27

    .line 673
    .line 674
    goto/16 :goto_1

    .line 675
    .line 676
    :cond_27
    const/4 v11, 0x6

    .line 677
    goto :goto_2

    .line 678
    :sswitch_23
    const-string v11, "android.permission.MANAGE_EXTERNAL_STORAGE"

    .line 679
    .line 680
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v11

    .line 684
    if-nez v11, :cond_28

    .line 685
    .line 686
    goto/16 :goto_1

    .line 687
    .line 688
    :cond_28
    move/from16 v19, v17

    .line 689
    .line 690
    goto :goto_3

    .line 691
    :sswitch_24
    const-string v11, "android.permission.ACCESS_FINE_LOCATION"

    .line 692
    .line 693
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    if-nez v11, :cond_29

    .line 698
    .line 699
    goto/16 :goto_1

    .line 700
    .line 701
    :cond_29
    const/4 v11, 0x4

    .line 702
    :goto_2
    move/from16 v19, v11

    .line 703
    .line 704
    goto :goto_3

    .line 705
    :sswitch_25
    const-string v11, "android.permission.READ_CALL_LOG"

    .line 706
    .line 707
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v11

    .line 711
    if-nez v11, :cond_2a

    .line 712
    .line 713
    goto/16 :goto_1

    .line 714
    .line 715
    :cond_2a
    move/from16 v19, v10

    .line 716
    .line 717
    goto :goto_3

    .line 718
    :sswitch_26
    const-string v11, "android.permission.POST_NOTIFICATIONS"

    .line 719
    .line 720
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    if-nez v11, :cond_2b

    .line 725
    .line 726
    goto/16 :goto_1

    .line 727
    .line 728
    :cond_2b
    move/from16 v19, v25

    .line 729
    .line 730
    goto :goto_3

    .line 731
    :sswitch_27
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v11

    .line 735
    if-nez v11, :cond_2c

    .line 736
    .line 737
    goto/16 :goto_1

    .line 738
    .line 739
    :cond_2c
    const/16 v19, 0x1

    .line 740
    .line 741
    goto :goto_3

    .line 742
    :sswitch_28
    const-string v11, "android.permission.READ_SMS"

    .line 743
    .line 744
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v11

    .line 748
    if-nez v11, :cond_2d

    .line 749
    .line 750
    goto/16 :goto_1

    .line 751
    .line 752
    :cond_2d
    const/16 v19, 0x0

    .line 753
    .line 754
    :goto_3
    packed-switch v19, :pswitch_data_0

    .line 755
    .line 756
    .line 757
    move v11, v4

    .line 758
    goto/16 :goto_4

    .line 759
    .line 760
    :pswitch_0
    const/16 v11, 0x12

    .line 761
    .line 762
    goto/16 :goto_4

    .line 763
    .line 764
    :pswitch_1
    move/from16 v11, v21

    .line 765
    .line 766
    goto/16 :goto_4

    .line 767
    .line 768
    :pswitch_2
    move v11, v14

    .line 769
    goto :goto_4

    .line 770
    :pswitch_3
    move v11, v12

    .line 771
    goto :goto_4

    .line 772
    :pswitch_4
    const/16 v11, 0x13

    .line 773
    .line 774
    goto :goto_4

    .line 775
    :pswitch_5
    const/16 v11, 0x18

    .line 776
    .line 777
    goto :goto_4

    .line 778
    :pswitch_6
    move v11, v3

    .line 779
    goto :goto_4

    .line 780
    :pswitch_7
    const/16 v11, 0x22

    .line 781
    .line 782
    goto :goto_4

    .line 783
    :pswitch_8
    move v11, v15

    .line 784
    goto :goto_4

    .line 785
    :pswitch_9
    const/16 v11, 0x21

    .line 786
    .line 787
    goto :goto_4

    .line 788
    :pswitch_a
    const/4 v11, 0x1

    .line 789
    goto :goto_4

    .line 790
    :pswitch_b
    const/16 v11, 0x23

    .line 791
    .line 792
    goto :goto_4

    .line 793
    :pswitch_c
    move/from16 v11, v25

    .line 794
    .line 795
    goto :goto_4

    .line 796
    :pswitch_d
    move v11, v9

    .line 797
    goto :goto_4

    .line 798
    :pswitch_e
    const/16 v11, 0xf

    .line 799
    .line 800
    goto :goto_4

    .line 801
    :pswitch_f
    move/from16 v11, v20

    .line 802
    .line 803
    goto :goto_4

    .line 804
    :pswitch_10
    const/16 v11, 0x1f

    .line 805
    .line 806
    goto :goto_4

    .line 807
    :pswitch_11
    move/from16 v11, v26

    .line 808
    .line 809
    goto :goto_4

    .line 810
    :pswitch_12
    move/from16 v11, v23

    .line 811
    .line 812
    goto :goto_4

    .line 813
    :pswitch_13
    move/from16 v11, v22

    .line 814
    .line 815
    goto :goto_4

    .line 816
    :pswitch_14
    move/from16 v11, v24

    .line 817
    .line 818
    goto :goto_4

    .line 819
    :pswitch_15
    move v11, v10

    .line 820
    goto :goto_4

    .line 821
    :pswitch_16
    move v11, v13

    .line 822
    goto :goto_4

    .line 823
    :pswitch_17
    const/16 v11, 0x11

    .line 824
    .line 825
    goto :goto_4

    .line 826
    :pswitch_18
    const/4 v11, 0x0

    .line 827
    goto :goto_4

    .line 828
    :pswitch_19
    move/from16 v11, v27

    .line 829
    .line 830
    :goto_4
    if-ne v11, v4, :cond_2e

    .line 831
    .line 832
    goto/16 :goto_a

    .line 833
    .line 834
    :cond_2e
    aget v4, v2, v5

    .line 835
    .line 836
    if-ne v11, v13, :cond_2f

    .line 837
    .line 838
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 839
    .line 840
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 841
    .line 842
    .line 843
    move-result-object v9

    .line 844
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    check-cast v3, Ljava/lang/Integer;

    .line 849
    .line 850
    iget-object v9, v0, Le3/f;->c:Landroid/app/Activity;

    .line 851
    .line 852
    invoke-static {v9, v7, v4}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 857
    .line 858
    .line 859
    move-result-object v4

    .line 860
    new-instance v7, Ljava/util/HashSet;

    .line 861
    .line 862
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v7, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    invoke-virtual {v7, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    invoke-static {v7}, Le3/g;->e(Ljava/util/HashSet;)Ljava/lang/Integer;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    iget-object v4, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 876
    .line 877
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v7

    .line 881
    goto/16 :goto_6

    .line 882
    .line 883
    :cond_2f
    if-ne v11, v12, :cond_31

    .line 884
    .line 885
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 886
    .line 887
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    if-nez v3, :cond_30

    .line 896
    .line 897
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 898
    .line 899
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v9

    .line 903
    iget-object v10, v0, Le3/f;->c:Landroid/app/Activity;

    .line 904
    .line 905
    invoke-static {v10, v7, v4}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 906
    .line 907
    .line 908
    move-result v10

    .line 909
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 910
    .line 911
    .line 912
    move-result-object v10

    .line 913
    invoke-virtual {v3, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    :cond_30
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 917
    .line 918
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    if-nez v3, :cond_38

    .line 927
    .line 928
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 929
    .line 930
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 931
    .line 932
    .line 933
    move-result-object v9

    .line 934
    goto/16 :goto_7

    .line 935
    .line 936
    :cond_31
    if-ne v11, v14, :cond_32

    .line 937
    .line 938
    iget-object v3, v0, Le3/f;->c:Landroid/app/Activity;

    .line 939
    .line 940
    invoke-static {v3, v7, v4}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 941
    .line 942
    .line 943
    move-result v3

    .line 944
    iget-object v4, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 945
    .line 946
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 947
    .line 948
    .line 949
    move-result-object v7

    .line 950
    invoke-virtual {v4, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    if-nez v4, :cond_38

    .line 955
    .line 956
    iget-object v4, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 957
    .line 958
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 959
    .line 960
    .line 961
    move-result-object v7

    .line 962
    goto :goto_5

    .line 963
    :cond_32
    if-ne v11, v10, :cond_35

    .line 964
    .line 965
    iget-object v9, v0, Le3/f;->c:Landroid/app/Activity;

    .line 966
    .line 967
    invoke-static {v9, v7, v4}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 972
    .line 973
    if-ge v7, v3, :cond_33

    .line 974
    .line 975
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 976
    .line 977
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 978
    .line 979
    .line 980
    move-result-object v7

    .line 981
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v3

    .line 985
    if-nez v3, :cond_33

    .line 986
    .line 987
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 988
    .line 989
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 990
    .line 991
    .line 992
    move-result-object v7

    .line 993
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 994
    .line 995
    .line 996
    move-result-object v9

    .line 997
    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    :cond_33
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1001
    .line 1002
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v7

    .line 1006
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v3

    .line 1010
    if-nez v3, :cond_34

    .line 1011
    .line 1012
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1013
    .line 1014
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v7

    .line 1018
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v9

    .line 1022
    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    :cond_34
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1026
    .line 1027
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v7

    .line 1031
    move/from16 v28, v4

    .line 1032
    .line 1033
    move-object v4, v3

    .line 1034
    move/from16 v3, v28

    .line 1035
    .line 1036
    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    :goto_6
    invoke-virtual {v4, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    goto :goto_a

    .line 1044
    :cond_35
    if-eq v11, v9, :cond_37

    .line 1045
    .line 1046
    if-ne v11, v15, :cond_36

    .line 1047
    .line 1048
    goto :goto_8

    .line 1049
    :cond_36
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1050
    .line 1051
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v9

    .line 1055
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    if-nez v3, :cond_38

    .line 1060
    .line 1061
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1062
    .line 1063
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v9

    .line 1067
    :goto_7
    iget-object v10, v0, Le3/f;->c:Landroid/app/Activity;

    .line 1068
    .line 1069
    invoke-static {v10, v7, v4}, Le3/g;->f(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 1070
    .line 1071
    .line 1072
    move-result v4

    .line 1073
    goto :goto_9

    .line 1074
    :cond_37
    :goto_8
    iget-object v3, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1075
    .line 1076
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v9

    .line 1080
    invoke-virtual {v0, v11}, Le3/f;->b(I)I

    .line 1081
    .line 1082
    .line 1083
    move-result v4

    .line 1084
    :goto_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v4

    .line 1088
    invoke-virtual {v3, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    :cond_38
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 1092
    .line 1093
    const/4 v3, 0x0

    .line 1094
    const/16 v4, 0x18

    .line 1095
    .line 1096
    const/16 v9, 0x24

    .line 1097
    .line 1098
    const/16 v10, 0x25

    .line 1099
    .line 1100
    goto/16 :goto_0

    .line 1101
    .line 1102
    :cond_39
    iget v1, v0, Le3/f;->d:I

    .line 1103
    .line 1104
    array-length v2, v2

    .line 1105
    sub-int/2addr v1, v2

    .line 1106
    iput v1, v0, Le3/f;->d:I

    .line 1107
    .line 1108
    iget-object v2, v0, Le3/f;->b:Le3/f$a;

    .line 1109
    .line 1110
    if-eqz v2, :cond_3a

    .line 1111
    .line 1112
    if-nez v1, :cond_3a

    .line 1113
    .line 1114
    iget-object v1, v0, Le3/f;->e:Ljava/util/HashMap;

    .line 1115
    .line 1116
    check-cast v2, Le3/c;

    .line 1117
    .line 1118
    iget-object v2, v2, Le3/c;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 1119
    .line 1120
    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    :cond_3a
    const/4 v1, 0x1

    .line 1124
    return v1

    .line 1125
    :sswitch_data_0
    .sparse-switch
        -0x7aed85b0 -> :sswitch_28
        -0x72f13779 -> :sswitch_27
        -0x72ca2557 -> :sswitch_26
        -0x7286b8f4 -> :sswitch_25
        -0x70918bc1 -> :sswitch_24
        -0x6c1165bf -> :sswitch_23
        -0x6a47e915 -> :sswitch_22
        -0x5d1492dd -> :sswitch_21
        -0x583351d1 -> :sswitch_20
        -0x49cb6684 -> :sswitch_1f
        -0x456a1f70 -> :sswitch_1e
        -0x363647ed -> :sswitch_1d
        -0x3562fc09 -> :sswitch_1c
        -0x3562e583 -> :sswitch_1b
        -0x2f9abb27 -> :sswitch_1a
        -0x1833add0 -> :sswitch_19
        -0x3c1ac56 -> :sswitch_18
        -0x550ba9 -> :sswitch_17
        0x322a742 -> :sswitch_16
        0x6afff6d -> :sswitch_15
        0xa7a881c -> :sswitch_14
        0xcc96c13 -> :sswitch_13
        0x158e77d1 -> :sswitch_12
        0x1b9efa65 -> :sswitch_11
        0x23fb06fe -> :sswitch_10
        0x24658583 -> :sswitch_f
        0x2933cd92 -> :sswitch_e
        0x2a564637 -> :sswitch_d
        0x2ec2d2a2 -> :sswitch_c
        0x39db9e69 -> :sswitch_b
        0x4586b056 -> :sswitch_a
        0x4bcdda0f -> :sswitch_9
        0x516a29a7 -> :sswitch_8
        0x69eee241 -> :sswitch_7
        0x6a1dc9a7 -> :sswitch_6
        0x6d24f988 -> :sswitch_5
        0x75dd2d9c -> :sswitch_4
        0x78aeb38b -> :sswitch_3
        0x7aed10ce -> :sswitch_2
        0x7e09eacb -> :sswitch_1
        0x7f2f307d -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_19
        :pswitch_11
        :pswitch_16
        :pswitch_10
        :pswitch_19
        :pswitch_19
        :pswitch_f
        :pswitch_e
        :pswitch_15
        :pswitch_16
        :pswitch_19
        :pswitch_16
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_18
        :pswitch_16
        :pswitch_9
        :pswitch_8
        :pswitch_16
        :pswitch_7
        :pswitch_6
        :pswitch_c
        :pswitch_e
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_16
    .end packed-switch
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
