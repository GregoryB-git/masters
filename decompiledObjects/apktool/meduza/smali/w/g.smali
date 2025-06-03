.class public final synthetic Lw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lw/g;->a:I

    iput-object p2, p0, Lw/g;->b:Ljava/lang/Object;

    iput-object p3, p0, Lw/g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lw/g;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    goto/16 :goto_10

    .line 13
    .line 14
    :pswitch_1
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;

    .line 17
    .line 18
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 21
    .line 22
    invoke-static {v0, v2}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->a(Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;

    .line 29
    .line 30
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 33
    .line 34
    invoke-static {v0, v2}, Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;->i(Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lya/b;

    .line 41
    .line 42
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, v0, Lya/b;->c:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 47
    .line 48
    invoke-interface {v0, v2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v3, v0

    .line 55
    check-cast v3, Lva/j;

    .line 56
    .line 57
    iget-object v0, v1, Lw/g;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lva/g;

    .line 60
    .line 61
    monitor-enter v3

    .line 62
    :try_start_0
    new-instance v6, Ljava/util/HashSet;

    .line 63
    .line 64
    iget-object v7, v3, Lva/j;->e:Ljava/util/HashSet;

    .line 65
    .line 66
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 67
    .line 68
    .line 69
    iget-object v7, v3, Lva/j;->f:Ljava/util/HashSet;

    .line 70
    .line 71
    invoke-virtual {v7, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    iget-object v7, v3, Lva/j;->e:Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-virtual {v7, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object v7, v0, Lva/g;->f:Lva/f;

    .line 80
    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    iget-object v7, v7, Lva/f;->a:Lva/e;

    .line 84
    .line 85
    if-eqz v7, :cond_0

    .line 86
    .line 87
    check-cast v7, Lva/h;

    .line 88
    .line 89
    iget-object v7, v7, Lva/h;->a:Lva/d;

    .line 90
    .line 91
    invoke-virtual {v7}, Lva/d;->j()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_0

    .line 96
    .line 97
    move v7, v2

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move v7, v5

    .line 100
    :goto_0
    if-eqz v7, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move v2, v5

    .line 104
    :goto_1
    if-nez v2, :cond_4

    .line 105
    .line 106
    iget-object v2, v0, Lva/g;->f:Lva/f;

    .line 107
    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {v2}, Lva/f;->a()Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object v2, v4

    .line 116
    :goto_2
    if-eqz v2, :cond_4

    .line 117
    .line 118
    iget-object v2, v3, Lva/j;->g:Ljava/util/HashMap;

    .line 119
    .line 120
    iget-object v5, v0, Lva/g;->f:Lva/f;

    .line 121
    .line 122
    if-eqz v5, :cond_3

    .line 123
    .line 124
    invoke-virtual {v5}, Lva/f;->a()Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    :cond_3
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-virtual {v3, v0}, Lva/j;->e(Lva/g;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Lva/g;

    .line 149
    .line 150
    invoke-virtual {v3, v2}, Lva/j;->e(Lva/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    monitor-exit v3

    .line 155
    return-void

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    monitor-exit v3

    .line 158
    throw v0

    .line 159
    :pswitch_5
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Ln9/c;

    .line 162
    .line 163
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Ljava/lang/Runnable;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 171
    .line 172
    .line 173
    iget-object v0, v0, Ln9/c;->a:Ljava/util/concurrent/Semaphore;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_6
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lm9/y;

    .line 182
    .line 183
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Leb/n0;

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Lm9/y;->b(Leb/n0;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_7
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lm9/d;

    .line 194
    .line 195
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, Lm9/d$a;

    .line 198
    .line 199
    iget-object v0, v0, Lm9/d;->b:Landroid/net/ConnectivityManager;

    .line 200
    .line 201
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_8
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lm9/a$c;

    .line 208
    .line 209
    iget-object v4, v1, Lw/g;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v4, Leb/e1;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Leb/e1;->e()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_6

    .line 221
    .line 222
    iget-object v3, v0, Lm9/a$c;->c:Lm9/a;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    new-array v6, v2, [Ljava/lang/Object;

    .line 233
    .line 234
    iget-object v7, v0, Lm9/a$c;->c:Lm9/a;

    .line 235
    .line 236
    invoke-static {v7}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    aput-object v7, v6, v5

    .line 245
    .line 246
    const-string v7, "(%x) Stream closed."

    .line 247
    .line 248
    invoke-static {v2, v3, v7, v6}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_6
    iget-object v6, v0, Lm9/a$c;->c:Lm9/a;

    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    new-array v7, v3, [Ljava/lang/Object;

    .line 263
    .line 264
    iget-object v8, v0, Lm9/a$c;->c:Lm9/a;

    .line 265
    .line 266
    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    aput-object v8, v7, v5

    .line 275
    .line 276
    aput-object v4, v7, v2

    .line 277
    .line 278
    const-string v2, "(%x) Stream closed with status: %s."

    .line 279
    .line 280
    invoke-static {v3, v6, v2, v7}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_4
    iget-object v0, v0, Lm9/a$c;->c:Lm9/a;

    .line 284
    .line 285
    invoke-virtual {v0}, Lm9/a;->d()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    new-array v3, v5, [Ljava/lang/Object;

    .line 290
    .line 291
    const-string v5, "Can\'t handle server close on non-started stream!"

    .line 292
    .line 293
    invoke-static {v5, v2, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v2, Lm9/i0;->e:Lm9/i0;

    .line 297
    .line 298
    invoke-virtual {v0, v2, v4}, Lm9/a;->a(Lm9/i0;Leb/e1;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_9
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Li9/n;

    .line 305
    .line 306
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v2, Lma/h;

    .line 309
    .line 310
    iget-object v0, v0, Li9/n;->c:Li9/a0;

    .line 311
    .line 312
    invoke-interface {v0, v2}, Li9/a0;->c(Lma/h;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :pswitch_a
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Li9/n;

    .line 319
    .line 320
    iget-object v3, v1, Lw/g;->c:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v3, Ljava/util/List;

    .line 323
    .line 324
    sget v6, Li9/n;->o:I

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    :cond_7
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_d

    .line 338
    .line 339
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, Li9/o;

    .line 344
    .line 345
    iget v7, v6, Li9/o;->a:I

    .line 346
    .line 347
    iget-object v8, v0, Li9/n;->h:Ll3/l;

    .line 348
    .line 349
    iget-object v9, v6, Li9/o;->c:Lt8/e;

    .line 350
    .line 351
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    :goto_6
    move-object v10, v9

    .line 359
    check-cast v10, Lt8/e$a;

    .line 360
    .line 361
    invoke-virtual {v10}, Lt8/e$a;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    if-eqz v11, :cond_8

    .line 366
    .line 367
    invoke-virtual {v10}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    check-cast v10, Lj9/i;

    .line 372
    .line 373
    new-instance v11, Li9/c;

    .line 374
    .line 375
    invoke-direct {v11, v7, v10}, Li9/c;-><init>(ILj9/i;)V

    .line 376
    .line 377
    .line 378
    iget-object v10, v8, Ll3/l;->a:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v10, Lt8/e;

    .line 381
    .line 382
    invoke-virtual {v10, v11}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    iput-object v10, v8, Ll3/l;->a:Ljava/lang/Object;

    .line 387
    .line 388
    iget-object v10, v8, Ll3/l;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v10, Lt8/e;

    .line 391
    .line 392
    invoke-virtual {v10, v11}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    iput-object v10, v8, Ll3/l;->b:Ljava/lang/Object;

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_8
    iget-object v8, v6, Li9/o;->d:Lt8/e;

    .line 400
    .line 401
    invoke-virtual {v8}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    :goto_7
    move-object v10, v9

    .line 406
    check-cast v10, Lt8/e$a;

    .line 407
    .line 408
    invoke-virtual {v10}, Lt8/e$a;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    if-eqz v11, :cond_9

    .line 413
    .line 414
    invoke-virtual {v10}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    check-cast v10, Lj9/i;

    .line 419
    .line 420
    iget-object v11, v0, Li9/n;->a:Le9/a;

    .line 421
    .line 422
    invoke-virtual {v11}, Le9/a;->p()Li9/f0;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    invoke-interface {v11, v10}, Li9/f0;->c(Lj9/i;)V

    .line 427
    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_9
    iget-object v9, v0, Li9/n;->h:Ll3/l;

    .line 431
    .line 432
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v8}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    :goto_8
    move-object v10, v8

    .line 440
    check-cast v10, Lt8/e$a;

    .line 441
    .line 442
    invoke-virtual {v10}, Lt8/e$a;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v11

    .line 446
    if-eqz v11, :cond_a

    .line 447
    .line 448
    invoke-virtual {v10}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    check-cast v10, Lj9/i;

    .line 453
    .line 454
    new-instance v11, Li9/c;

    .line 455
    .line 456
    invoke-direct {v11, v7, v10}, Li9/c;-><init>(ILj9/i;)V

    .line 457
    .line 458
    .line 459
    iget-object v10, v9, Ll3/l;->a:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v10, Lt8/e;

    .line 462
    .line 463
    invoke-virtual {v10, v11}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    iput-object v10, v9, Ll3/l;->a:Ljava/lang/Object;

    .line 468
    .line 469
    iget-object v10, v9, Ll3/l;->b:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v10, Lt8/e;

    .line 472
    .line 473
    invoke-virtual {v10, v11}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    iput-object v10, v9, Ll3/l;->b:Ljava/lang/Object;

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :cond_a
    iget-boolean v6, v6, Li9/o;->b:Z

    .line 481
    .line 482
    if-nez v6, :cond_7

    .line 483
    .line 484
    iget-object v6, v0, Li9/n;->k:Landroid/util/SparseArray;

    .line 485
    .line 486
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    check-cast v6, Li9/m1;

    .line 491
    .line 492
    if-eqz v6, :cond_b

    .line 493
    .line 494
    move v8, v2

    .line 495
    goto :goto_9

    .line 496
    :cond_b
    move v8, v5

    .line 497
    :goto_9
    new-array v9, v2, [Ljava/lang/Object;

    .line 498
    .line 499
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    aput-object v10, v9, v5

    .line 504
    .line 505
    const-string v5, "Can\'t set limbo-free snapshot version for unknown target: %s"

    .line 506
    .line 507
    invoke-static {v5, v8, v9}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    iget-object v5, v6, Li9/m1;->e:Lj9/q;

    .line 511
    .line 512
    new-instance v8, Li9/m1;

    .line 513
    .line 514
    iget-object v11, v6, Li9/m1;->a:Lg9/k0;

    .line 515
    .line 516
    iget v12, v6, Li9/m1;->b:I

    .line 517
    .line 518
    iget-wide v13, v6, Li9/m1;->c:J

    .line 519
    .line 520
    iget-object v15, v6, Li9/m1;->d:Li9/e0;

    .line 521
    .line 522
    iget-object v9, v6, Li9/m1;->g:Lma/h;

    .line 523
    .line 524
    iget-object v10, v6, Li9/m1;->h:Ljava/lang/Integer;

    .line 525
    .line 526
    move-object/from16 v19, v10

    .line 527
    .line 528
    move-object v10, v8

    .line 529
    move-object/from16 v16, v5

    .line 530
    .line 531
    move-object/from16 v17, v5

    .line 532
    .line 533
    move-object/from16 v18, v9

    .line 534
    .line 535
    invoke-direct/range {v10 .. v19}, Li9/m1;-><init>(Lg9/k0;IJLi9/e0;Lj9/q;Lj9/q;Lma/h;Ljava/lang/Integer;)V

    .line 536
    .line 537
    .line 538
    iget-object v5, v0, Li9/n;->k:Landroid/util/SparseArray;

    .line 539
    .line 540
    invoke-virtual {v5, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v6, v8, v4}, Li9/n;->e(Li9/m1;Li9/m1;Lm9/k0;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    if-eqz v5, :cond_c

    .line 548
    .line 549
    iget-object v5, v0, Li9/n;->i:Li9/l1;

    .line 550
    .line 551
    invoke-interface {v5, v8}, Li9/l1;->h(Li9/m1;)V

    .line 552
    .line 553
    .line 554
    :cond_c
    const/4 v5, 0x0

    .line 555
    goto/16 :goto_5

    .line 556
    .line 557
    :cond_d
    return-void

    .line 558
    :pswitch_b
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, Lg9/u;

    .line 561
    .line 562
    iget-object v4, v1, Lw/g;->c:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v4, Lg9/g0;

    .line 565
    .line 566
    iget-object v0, v0, Lg9/u;->j:Lg9/k;

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    iget-object v5, v4, Lg9/g0;->a:Lg9/f0;

    .line 572
    .line 573
    iget-object v6, v0, Lg9/k;->b:Ljava/util/HashMap;

    .line 574
    .line 575
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    check-cast v6, Lg9/k$b;

    .line 580
    .line 581
    const/4 v7, 0x4

    .line 582
    if-nez v6, :cond_e

    .line 583
    .line 584
    goto/16 :goto_d

    .line 585
    .line 586
    :cond_e
    iget-object v8, v6, Lg9/k$b;->a:Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    iget-object v8, v6, Lg9/k$b;->a:Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 594
    .line 595
    .line 596
    move-result v8

    .line 597
    if-eqz v8, :cond_10

    .line 598
    .line 599
    invoke-virtual {v4}, Lg9/g0;->a()Z

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-eqz v4, :cond_f

    .line 604
    .line 605
    move v7, v2

    .line 606
    goto :goto_a

    .line 607
    :cond_f
    move v7, v3

    .line 608
    goto :goto_a

    .line 609
    :cond_10
    invoke-virtual {v6}, Lg9/k$b;->a()Z

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    if-nez v6, :cond_11

    .line 614
    .line 615
    invoke-virtual {v4}, Lg9/g0;->a()Z

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    if-eqz v4, :cond_11

    .line 620
    .line 621
    const/4 v7, 0x3

    .line 622
    :cond_11
    :goto_a
    invoke-static {v7}, Lq0/g;->c(I)I

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-eqz v4, :cond_15

    .line 627
    .line 628
    if-eq v4, v2, :cond_14

    .line 629
    .line 630
    if-eq v4, v3, :cond_12

    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_12
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 634
    .line 635
    const-string v3, "stopListeningToRemoteStore"

    .line 636
    .line 637
    invoke-virtual {v0, v3}, Lg9/j0;->g(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    iget-object v3, v0, Lg9/j0;->c:Ljava/util/HashMap;

    .line 641
    .line 642
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    check-cast v3, Lg9/h0;

    .line 647
    .line 648
    if-eqz v3, :cond_13

    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_13
    const/4 v2, 0x0

    .line 652
    :goto_b
    const/4 v4, 0x0

    .line 653
    new-array v4, v4, [Ljava/lang/Object;

    .line 654
    .line 655
    const-string v6, "Trying to stop listening to a query not found"

    .line 656
    .line 657
    invoke-static {v6, v2, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    iget v2, v3, Lg9/h0;->b:I

    .line 661
    .line 662
    iget-object v3, v0, Lg9/j0;->d:Ljava/util/HashMap;

    .line 663
    .line 664
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    check-cast v3, Ljava/util/List;

    .line 673
    .line 674
    invoke-interface {v3, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    if-eqz v3, :cond_16

    .line 682
    .line 683
    iget-object v0, v0, Lg9/j0;->b:Lm9/h0;

    .line 684
    .line 685
    invoke-virtual {v0, v2}, Lm9/h0;->j(I)V

    .line 686
    .line 687
    .line 688
    goto :goto_d

    .line 689
    :cond_14
    iget-object v2, v0, Lg9/k;->b:Ljava/util/HashMap;

    .line 690
    .line 691
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 695
    .line 696
    const/4 v2, 0x0

    .line 697
    goto :goto_c

    .line 698
    :cond_15
    iget-object v3, v0, Lg9/k;->b:Ljava/util/HashMap;

    .line 699
    .line 700
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 704
    .line 705
    :goto_c
    invoke-virtual {v0, v5, v2}, Lg9/j0;->p(Lg9/f0;Z)V

    .line 706
    .line 707
    .line 708
    :cond_16
    :goto_d
    return-void

    .line 709
    :pswitch_c
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, Lg9/u;

    .line 712
    .line 713
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v2, Ljava/util/List;

    .line 716
    .line 717
    iget-object v0, v0, Lg9/u;->g:Li9/n;

    .line 718
    .line 719
    iget-object v3, v0, Li9/n;->a:Le9/a;

    .line 720
    .line 721
    new-instance v4, Lx0/q0;

    .line 722
    .line 723
    const/16 v5, 0xe

    .line 724
    .line 725
    invoke-direct {v4, v5, v0, v2}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    const-string v0, "Configure indexes"

    .line 729
    .line 730
    invoke-virtual {v3, v0, v4}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :pswitch_d
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v0, Lj8/n;

    .line 737
    .line 738
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v2, Ljava/lang/String;

    .line 741
    .line 742
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 743
    .line 744
    invoke-virtual {v0, v2, v3}, Lj8/n;->c(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 745
    .line 746
    .line 747
    return-void

    .line 748
    :pswitch_e
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 751
    .line 752
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v2, Le8/g$b;

    .line 755
    .line 756
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    move-object v3, v2

    .line 761
    check-cast v3, Le8/g$a;

    .line 762
    .line 763
    iget-object v3, v3, Le8/g$a;->a:Le8/g;

    .line 764
    .line 765
    invoke-virtual {v3, v0}, Ls/a;->p(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 766
    .line 767
    .line 768
    goto :goto_e

    .line 769
    :catch_0
    move-exception v0

    .line 770
    check-cast v2, Le8/g$a;

    .line 771
    .line 772
    iget-object v2, v2, Le8/g$a;->a:Le8/g;

    .line 773
    .line 774
    invoke-virtual {v2, v0}, Ls/a;->q(Ljava/lang/Throwable;)Z

    .line 775
    .line 776
    .line 777
    :goto_e
    return-void

    .line 778
    :pswitch_f
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 779
    .line 780
    move-object v2, v0

    .line 781
    check-cast v2, Ld8/s;

    .line 782
    .line 783
    iget-object v0, v1, Lw/g;->c:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v0, Lt9/b;

    .line 786
    .line 787
    iget-object v3, v2, Ld8/s;->b:Lt9/b;

    .line 788
    .line 789
    sget-object v5, Ld8/s;->d:Ld8/r;

    .line 790
    .line 791
    if-ne v3, v5, :cond_17

    .line 792
    .line 793
    monitor-enter v2

    .line 794
    :try_start_2
    iget-object v3, v2, Ld8/s;->a:Lt9/a$a;

    .line 795
    .line 796
    iput-object v4, v2, Ld8/s;->a:Lt9/a$a;

    .line 797
    .line 798
    iput-object v0, v2, Ld8/s;->b:Lt9/b;

    .line 799
    .line 800
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 801
    invoke-interface {v3, v0}, Lt9/a$a;->h(Lt9/b;)V

    .line 802
    .line 803
    .line 804
    return-void

    .line 805
    :catchall_1
    move-exception v0

    .line 806
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 807
    throw v0

    .line 808
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 809
    .line 810
    const-string v2, "provide() can be called only once."

    .line 811
    .line 812
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    throw v0

    .line 816
    :pswitch_10
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, Lw5/n$a;

    .line 819
    .line 820
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v2, Lz3/e;

    .line 823
    .line 824
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 825
    .line 826
    sget v3, Lv5/e0;->a:I

    .line 827
    .line 828
    invoke-interface {v0, v2}, Lw5/n;->n(Lz3/e;)V

    .line 829
    .line 830
    .line 831
    return-void

    .line 832
    :pswitch_11
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v0, Lv5/s;

    .line 835
    .line 836
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v2, Lv5/s$a;

    .line 839
    .line 840
    iget-object v3, v0, Lv5/s;->c:Ljava/lang/Object;

    .line 841
    .line 842
    monitor-enter v3

    .line 843
    :try_start_4
    iget v0, v0, Lv5/s;->d:I

    .line 844
    .line 845
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 846
    invoke-interface {v2, v0}, Lv5/s$a;->a(I)V

    .line 847
    .line 848
    .line 849
    return-void

    .line 850
    :catchall_2
    move-exception v0

    .line 851
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 852
    throw v0

    .line 853
    :pswitch_12
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Lz4/y;

    .line 856
    .line 857
    iget-object v3, v1, Lw/g;->c:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v3, Lc4/t;

    .line 860
    .line 861
    iget-object v4, v0, Lz4/y;->z:Lt4/b;

    .line 862
    .line 863
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    if-nez v4, :cond_18

    .line 869
    .line 870
    move-object v4, v3

    .line 871
    goto :goto_f

    .line 872
    :cond_18
    new-instance v4, Lc4/t$b;

    .line 873
    .line 874
    invoke-direct {v4, v6, v7}, Lc4/t$b;-><init>(J)V

    .line 875
    .line 876
    .line 877
    :goto_f
    iput-object v4, v0, Lz4/y;->G:Lc4/t;

    .line 878
    .line 879
    invoke-interface {v3}, Lc4/t;->h()J

    .line 880
    .line 881
    .line 882
    move-result-wide v8

    .line 883
    iput-wide v8, v0, Lz4/y;->H:J

    .line 884
    .line 885
    iget-boolean v4, v0, Lz4/y;->N:Z

    .line 886
    .line 887
    if-nez v4, :cond_19

    .line 888
    .line 889
    invoke-interface {v3}, Lc4/t;->h()J

    .line 890
    .line 891
    .line 892
    move-result-wide v8

    .line 893
    cmp-long v4, v8, v6

    .line 894
    .line 895
    if-nez v4, :cond_19

    .line 896
    .line 897
    move v5, v2

    .line 898
    :cond_19
    iput-boolean v5, v0, Lz4/y;->I:Z

    .line 899
    .line 900
    if-eqz v5, :cond_1a

    .line 901
    .line 902
    const/4 v2, 0x7

    .line 903
    :cond_1a
    iput v2, v0, Lz4/y;->J:I

    .line 904
    .line 905
    iget-object v2, v0, Lz4/y;->o:Lz4/y$b;

    .line 906
    .line 907
    iget-wide v4, v0, Lz4/y;->H:J

    .line 908
    .line 909
    invoke-interface {v3}, Lc4/t;->e()Z

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    iget-boolean v6, v0, Lz4/y;->I:Z

    .line 914
    .line 915
    check-cast v2, Lz4/z;

    .line 916
    .line 917
    invoke-virtual {v2, v4, v5, v3, v6}, Lz4/z;->y(JZZ)V

    .line 918
    .line 919
    .line 920
    iget-boolean v2, v0, Lz4/y;->D:Z

    .line 921
    .line 922
    if-nez v2, :cond_1b

    .line 923
    .line 924
    invoke-virtual {v0}, Lz4/y;->y()V

    .line 925
    .line 926
    .line 927
    :cond_1b
    return-void

    .line 928
    :pswitch_13
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v0, La4/g$a;

    .line 931
    .line 932
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v2, La4/g;

    .line 935
    .line 936
    iget v3, v0, La4/g$a;->a:I

    .line 937
    .line 938
    iget-object v0, v0, La4/g$a;->b:Lz4/t$b;

    .line 939
    .line 940
    invoke-interface {v2, v3, v0}, La4/g;->O(ILz4/t$b;)V

    .line 941
    .line 942
    .line 943
    return-void

    .line 944
    :pswitch_14
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lx3/l$a;

    .line 947
    .line 948
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v2, Lz3/e;

    .line 951
    .line 952
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 953
    .line 954
    sget v3, Lv5/e0;->a:I

    .line 955
    .line 956
    invoke-interface {v0, v2}, Lx3/l;->g(Lz3/e;)V

    .line 957
    .line 958
    .line 959
    return-void

    .line 960
    :pswitch_15
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v0, Lx3/l$a;

    .line 963
    .line 964
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v2, Ljava/lang/String;

    .line 967
    .line 968
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 969
    .line 970
    sget v3, Lv5/e0;->a:I

    .line 971
    .line 972
    invoke-interface {v0, v2}, Lx3/l;->i(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    return-void

    .line 976
    :pswitch_16
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v0, Lv3/z0$a;

    .line 979
    .line 980
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v2, Landroid/util/Pair;

    .line 983
    .line 984
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 985
    .line 986
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 987
    .line 988
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v3, Ljava/lang/Integer;

    .line 991
    .line 992
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 997
    .line 998
    check-cast v2, Lz4/t$b;

    .line 999
    .line 1000
    invoke-interface {v0, v3, v2}, La4/g;->O(ILz4/t$b;)V

    .line 1001
    .line 1002
    .line 1003
    return-void

    .line 1004
    :pswitch_17
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v0, Landroidx/window/layout/adapter/sidecar/b$b;

    .line 1007
    .line 1008
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v2, Li2/k;

    .line 1011
    .line 1012
    const-string v3, "this$0"

    .line 1013
    .line 1014
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    const-string v3, "$newLayoutInfo"

    .line 1018
    .line 1019
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v0, v0, Landroidx/window/layout/adapter/sidecar/b$b;->c:Ld0/a;

    .line 1023
    .line 1024
    invoke-interface {v0, v2}, Ld0/a;->accept(Ljava/lang/Object;)V

    .line 1025
    .line 1026
    .line 1027
    return-void

    .line 1028
    :pswitch_18
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v0, Lp1/g;

    .line 1031
    .line 1032
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v2, Ljava/lang/String;

    .line 1035
    .line 1036
    const-string v3, "this$0"

    .line 1037
    .line 1038
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    const-string v3, "$sql"

    .line 1042
    .line 1043
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    const/4 v0, 0x0

    .line 1050
    throw v0

    .line 1051
    :pswitch_19
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, Ljava/lang/String;

    .line 1054
    .line 1055
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v2, Ly0/k;

    .line 1058
    .line 1059
    sget-object v3, Ly0/b;->a:Ly0/b$c;

    .line 1060
    .line 1061
    const-string v3, "$violation"

    .line 1062
    .line 1063
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1069
    .line 1070
    .line 1071
    const-string v4, "Policy violation with PENALTY_DEATH in "

    .line 1072
    .line 1073
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    const-string v3, "FragmentStrictMode"

    .line 1084
    .line 1085
    invoke-static {v3, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1086
    .line 1087
    .line 1088
    throw v2

    .line 1089
    :pswitch_1a
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v0, Lx0/r0;

    .line 1092
    .line 1093
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v2, Lx0/r0$b;

    .line 1096
    .line 1097
    const-string v3, "this$0"

    .line 1098
    .line 1099
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    const-string v3, "$operation"

    .line 1103
    .line 1104
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    iget-object v3, v0, Lx0/r0;->b:Ljava/util/ArrayList;

    .line 1108
    .line 1109
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    iget-object v0, v0, Lx0/r0;->c:Ljava/util/ArrayList;

    .line 1113
    .line 1114
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    return-void

    .line 1118
    :pswitch_1b
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Lx0/r0$c;

    .line 1121
    .line 1122
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v2, Lx0/e$g;

    .line 1125
    .line 1126
    const-string v4, "$operation"

    .line 1127
    .line 1128
    invoke-static {v0, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    const-string v4, "this$0"

    .line 1132
    .line 1133
    invoke-static {v2, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v3}, Lx0/y;->L(I)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v3

    .line 1140
    if-eqz v3, :cond_1c

    .line 1141
    .line 1142
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    const-string v4, "Transition for operation "

    .line 1148
    .line 1149
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    const-string v4, " has completed"

    .line 1156
    .line 1157
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v3

    .line 1164
    const-string v4, "FragmentManager"

    .line 1165
    .line 1166
    invoke-static {v4, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1167
    .line 1168
    .line 1169
    :cond_1c
    invoke-virtual {v0, v2}, Lx0/r0$c;->c(Lx0/r0$a;)V

    .line 1170
    .line 1171
    .line 1172
    return-void

    .line 1173
    :pswitch_1c
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1174
    .line 1175
    check-cast v0, Lw/f$e;

    .line 1176
    .line 1177
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v2, Landroid/graphics/Typeface;

    .line 1180
    .line 1181
    invoke-virtual {v0, v2}, Lw/f$e;->c(Landroid/graphics/Typeface;)V

    .line 1182
    .line 1183
    .line 1184
    return-void

    .line 1185
    :goto_10
    iget-object v0, v1, Lw/g;->b:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;

    .line 1188
    .line 1189
    iget-object v2, v1, Lw/g;->c:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1192
    .line 1193
    invoke-static {v0, v2}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->f(Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 1194
    .line 1195
    .line 1196
    return-void

    .line 1197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
    .end packed-switch
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method
