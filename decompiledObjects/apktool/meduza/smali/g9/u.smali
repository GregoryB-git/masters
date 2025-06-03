.class public final Lg9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg9/h;

.field public final b:Le9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9/a;"
        }
    .end annotation
.end field

.field public final c:Le9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9/a;"
        }
    .end annotation
.end field

.field public final d:Ln9/a;

.field public final e:Lf9/g;

.field public f:Le9/a;

.field public g:Li9/n;

.field public h:Lm9/h0;

.field public i:Lg9/j0;

.field public j:Lg9/k;

.field public k:Li9/e$a;

.field public l:Li9/k1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg9/h;Le9/a;Le9/a;Ln9/a;Lm9/z;Lg9/f;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg9/h;",
            "Le9/a;",
            "Le9/a;",
            "Ln9/a;",
            "Lm9/z;",
            "Lg9/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lg9/u;->a:Lg9/h;

    .line 5
    .line 6
    iput-object p3, p0, Lg9/u;->b:Le9/a;

    .line 7
    .line 8
    iput-object p4, p0, Lg9/u;->c:Le9/a;

    .line 9
    .line 10
    iput-object p5, p0, Lg9/u;->d:Ln9/a;

    .line 11
    .line 12
    new-instance v0, Lf9/g;

    .line 13
    .line 14
    new-instance v1, Lm9/e0;

    .line 15
    .line 16
    iget-object p2, p2, Lg9/h;->a:Lj9/f;

    .line 17
    .line 18
    invoke-direct {v1, p2}, Lm9/e0;-><init>(Lj9/f;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lf9/g;-><init>(Lm9/e0;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lg9/u;->e:Lf9/g;

    .line 25
    .line 26
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 27
    .line 28
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lg9/p;

    .line 38
    .line 39
    move-object v2, v1

    .line 40
    move-object v3, p0

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p1

    .line 43
    move-object v6, p7

    .line 44
    move-object v7, p6

    .line 45
    invoke-direct/range {v2 .. v7}, Lg9/p;-><init>(Lg9/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lg9/f;Lm9/z;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5, v1}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    new-instance p1, Lg9/q;

    .line 52
    .line 53
    invoke-direct {p1, p0, v0, p2, p5}, Lg9/q;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p1}, Le9/a;->z(Ln9/j;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Le0/d;

    .line 60
    .line 61
    const/16 p2, 0x1a

    .line 62
    .line 63
    invoke-direct {p1, p2}, Le0/d;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p4, p1}, Le9/a;->z(Ln9/j;)V

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
.end method


# virtual methods
.method public final a(Landroid/content/Context;Le9/e;Lg9/f;Lm9/z;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p3

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v2, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    iget-object v3, v5, Le9/e;->a:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v11, 0x0

    .line 15
    aput-object v3, v2, v11

    .line 16
    .line 17
    const-string v3, "FirestoreClient"

    .line 18
    .line 19
    const-string v4, "Initializing. user=%s"

    .line 20
    .line 21
    invoke-static {v1, v3, v4, v2}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v12, Lg9/f$a;

    .line 25
    .line 26
    iget-object v13, v0, Lg9/u;->d:Ln9/a;

    .line 27
    .line 28
    iget-object v14, v0, Lg9/u;->a:Lg9/h;

    .line 29
    .line 30
    iget-object v15, v0, Lg9/u;->b:Le9/a;

    .line 31
    .line 32
    iget-object v8, v0, Lg9/u;->c:Le9/a;

    .line 33
    .line 34
    move-object v1, v12

    .line 35
    move-object/from16 v2, p1

    .line 36
    .line 37
    move-object v3, v13

    .line 38
    move-object v4, v14

    .line 39
    move-object/from16 v5, p2

    .line 40
    .line 41
    move-object v6, v15

    .line 42
    move-object v7, v8

    .line 43
    move-object v11, v8

    .line 44
    move-object/from16 v8, p4

    .line 45
    .line 46
    invoke-direct/range {v1 .. v8}, Lg9/f$a;-><init>(Landroid/content/Context;Ln9/a;Lg9/h;Le9/e;Le9/a;Le9/a;Lm9/z;)V

    .line 47
    .line 48
    .line 49
    iget-object v8, v10, Lg9/f;->b:Lm9/c0;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v1, Lm9/e0;

    .line 55
    .line 56
    iget-object v2, v14, Lg9/h;->a:Lj9/f;

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lm9/e0;-><init>(Lj9/f;)V

    .line 59
    .line 60
    .line 61
    iput-object v1, v8, Lm9/c0;->b:Lm9/e0;

    .line 62
    .line 63
    new-instance v1, Lm9/n;

    .line 64
    .line 65
    invoke-direct {v1, v15, v11}, Lm9/n;-><init>(Le9/a;Le9/a;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Lm9/y;

    .line 69
    .line 70
    invoke-direct {v2, v13, v9, v14, v1}, Lm9/y;-><init>(Ln9/a;Landroid/content/Context;Lg9/h;Lm9/n;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, v8, Lm9/c0;->a:Lm9/y;

    .line 74
    .line 75
    new-instance v7, Lm9/v;

    .line 76
    .line 77
    iget-object v5, v14, Lg9/h;->a:Lj9/f;

    .line 78
    .line 79
    iget-object v14, v8, Lm9/c0;->a:Lm9/y;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    new-array v2, v1, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v1, "grpcCallProvider not initialized yet"

    .line 85
    .line 86
    invoke-static {v14, v1, v2}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v1, v7

    .line 90
    move-object v2, v13

    .line 91
    move-object v3, v15

    .line 92
    move-object v4, v11

    .line 93
    move-object/from16 v6, p4

    .line 94
    .line 95
    move-object v11, v7

    .line 96
    move-object v7, v14

    .line 97
    invoke-direct/range {v1 .. v7}, Lm9/v;-><init>(Ln9/a;Le9/a;Le9/a;Lj9/f;Lm9/z;Lm9/y;)V

    .line 98
    .line 99
    .line 100
    iput-object v11, v8, Lm9/c0;->c:Lm9/v;

    .line 101
    .line 102
    new-instance v1, Lm9/j;

    .line 103
    .line 104
    iget-object v2, v8, Lm9/c0;->b:Lm9/e0;

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    new-array v4, v3, [Ljava/lang/Object;

    .line 108
    .line 109
    const-string v5, "remoteSerializer not initialized yet"

    .line 110
    .line 111
    invoke-static {v2, v5, v4}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v4, v8, Lm9/c0;->c:Lm9/v;

    .line 115
    .line 116
    new-array v5, v3, [Ljava/lang/Object;

    .line 117
    .line 118
    const-string v3, "firestoreChannel not initialized yet"

    .line 119
    .line 120
    invoke-static {v4, v3, v5}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v1, v13, v2, v4}, Lm9/j;-><init>(Ln9/a;Lm9/e0;Lm9/v;)V

    .line 124
    .line 125
    .line 126
    iput-object v1, v8, Lm9/c0;->d:Lm9/j;

    .line 127
    .line 128
    new-instance v1, Lm9/d;

    .line 129
    .line 130
    invoke-direct {v1, v9}, Lm9/d;-><init>(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    iput-object v1, v8, Lm9/c0;->e:Lm9/d;

    .line 134
    .line 135
    invoke-virtual {v10, v12}, Lg9/f;->e(Lg9/f$a;)Le9/a;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iput-object v1, v10, Lg9/f;->c:Le9/a;

    .line 140
    .line 141
    invoke-virtual {v1}, Le9/a;->B()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10, v12}, Lg9/f;->d(Lg9/f$a;)Li9/n;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, v10, Lg9/f;->d:Li9/n;

    .line 149
    .line 150
    invoke-virtual {v10, v12}, Lg9/f;->f(Lg9/f$a;)Lm9/h0;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, v10, Lg9/f;->f:Lm9/h0;

    .line 155
    .line 156
    invoke-virtual {v10, v12}, Lg9/f;->g(Lg9/f$a;)Lg9/j0;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iput-object v1, v10, Lg9/f;->e:Lg9/j0;

    .line 161
    .line 162
    invoke-virtual/range {p3 .. p3}, Lg9/f;->a()Lg9/k;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, v10, Lg9/f;->g:Lg9/k;

    .line 167
    .line 168
    iget-object v1, v10, Lg9/f;->d:Li9/n;

    .line 169
    .line 170
    iget-object v2, v1, Li9/n;->a:Le9/a;

    .line 171
    .line 172
    invoke-virtual {v2}, Le9/a;->o()Li9/b0;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v2}, Li9/b0;->run()V

    .line 177
    .line 178
    .line 179
    iget-object v2, v1, Li9/n;->a:Le9/a;

    .line 180
    .line 181
    new-instance v3, Lb/d;

    .line 182
    .line 183
    const/16 v4, 0x10

    .line 184
    .line 185
    invoke-direct {v3, v1, v4}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 186
    .line 187
    .line 188
    const-string v4, "Start IndexManager"

    .line 189
    .line 190
    invoke-virtual {v2, v4, v3}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 191
    .line 192
    .line 193
    iget-object v2, v1, Li9/n;->a:Le9/a;

    .line 194
    .line 195
    new-instance v3, Lb/m;

    .line 196
    .line 197
    const/16 v4, 0xf

    .line 198
    .line 199
    invoke-direct {v3, v1, v4}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    const-string v1, "Start MutationQueue"

    .line 203
    .line 204
    invoke-virtual {v2, v1, v3}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v10, Lg9/f;->f:Lm9/h0;

    .line 208
    .line 209
    invoke-virtual {v1}, Lm9/h0;->b()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10, v12}, Lg9/f;->b(Lg9/f$a;)Li9/k1;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iput-object v1, v10, Lg9/f;->i:Li9/k1;

    .line 217
    .line 218
    invoke-virtual {v10, v12}, Lg9/f;->c(Lg9/f$a;)Li9/e;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    iput-object v1, v10, Lg9/f;->h:Li9/e;

    .line 223
    .line 224
    iget-object v1, v10, Lg9/f;->c:Le9/a;

    .line 225
    .line 226
    const/4 v2, 0x0

    .line 227
    new-array v3, v2, [Ljava/lang/Object;

    .line 228
    .line 229
    const-string v2, "persistence not initialized yet"

    .line 230
    .line 231
    invoke-static {v1, v2, v3}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iput-object v1, v0, Lg9/u;->f:Le9/a;

    .line 235
    .line 236
    iget-object v1, v10, Lg9/f;->i:Li9/k1;

    .line 237
    .line 238
    iput-object v1, v0, Lg9/u;->l:Li9/k1;

    .line 239
    .line 240
    invoke-virtual/range {p3 .. p3}, Lg9/f;->h()Li9/n;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iput-object v1, v0, Lg9/u;->g:Li9/n;

    .line 245
    .line 246
    iget-object v1, v10, Lg9/f;->f:Lm9/h0;

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    new-array v3, v2, [Ljava/lang/Object;

    .line 250
    .line 251
    const-string v4, "remoteStore not initialized yet"

    .line 252
    .line 253
    invoke-static {v1, v4, v3}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iput-object v1, v0, Lg9/u;->h:Lm9/h0;

    .line 257
    .line 258
    invoke-virtual/range {p3 .. p3}, Lg9/f;->i()Lg9/j0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iput-object v1, v0, Lg9/u;->i:Lg9/j0;

    .line 263
    .line 264
    iget-object v1, v10, Lg9/f;->g:Lg9/k;

    .line 265
    .line 266
    new-array v2, v2, [Ljava/lang/Object;

    .line 267
    .line 268
    const-string v3, "eventManager not initialized yet"

    .line 269
    .line 270
    invoke-static {v1, v3, v2}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iput-object v1, v0, Lg9/u;->j:Lg9/k;

    .line 274
    .line 275
    iget-object v1, v10, Lg9/f;->h:Li9/e;

    .line 276
    .line 277
    iget-object v2, v0, Lg9/u;->l:Li9/k1;

    .line 278
    .line 279
    if-eqz v2, :cond_0

    .line 280
    .line 281
    invoke-interface {v2}, Li9/k1;->start()V

    .line 282
    .line 283
    .line 284
    :cond_0
    if-eqz v1, :cond_1

    .line 285
    .line 286
    iget-object v1, v1, Li9/e;->a:Li9/e$a;

    .line 287
    .line 288
    iput-object v1, v0, Lg9/u;->k:Li9/e$a;

    .line 289
    .line 290
    invoke-virtual {v1}, Li9/e$a;->start()V

    .line 291
    .line 292
    .line 293
    :cond_1
    return-void
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

.method public final b(Z)V
    .locals 2

    invoke-virtual {p0}, Lg9/u;->d()V

    iget-object v0, p0, Lg9/u;->d:Ln9/a;

    new-instance v1, Lg9/o;

    invoke-direct {v1, p0, p1}, Lg9/o;-><init>(Lg9/u;Z)V

    invoke-virtual {v0, v1}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final c()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg9/u;->b:Le9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/a;->w()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg9/u;->c:Le9/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Le9/a;->w()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg9/u;->d:Ln9/a;

    .line 12
    .line 13
    new-instance v1, Lb/k;

    .line 14
    .line 15
    const/16 v2, 0xc

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, Lb/k;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Ln9/a;->a:Ln9/a$b;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    :try_start_1
    iget-boolean v2, v0, Ln9/a$b;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    :try_start_2
    monitor-exit v0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 30
    .line 31
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v2, Lm9/w;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, v1, v3}, Lm9/w;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ln9/a$b;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-boolean v3, v0, Ln9/a$b;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    :goto_0
    monitor-exit v0

    .line 56
    return-object v1

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    :try_start_3
    monitor-exit v0

    .line 61
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    :goto_1
    monitor-exit v0

    .line 63
    throw v1
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

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/u;->d:Ln9/a;

    .line 2
    .line 3
    iget-object v0, v0, Ln9/a;->a:Ln9/a$b;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, v0, Ln9/a$b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "The client has already been terminated"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
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

.method public final e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk9/f;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lg9/u;->d()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lg9/u;->d:Ln9/a;

    .line 10
    .line 11
    new-instance v2, Lv3/x0;

    .line 12
    .line 13
    const/4 v3, 0x6

    .line 14
    invoke-direct {v2, p0, p1, v0, v3}, Lv3/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
