.class public final synthetic Lx0/f;
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

    iput p1, p0, Lx0/f;->a:I

    iput-object p2, p0, Lx0/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lx0/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lx0/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto/16 :goto_16

    .line 11
    .line 12
    :pswitch_0
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    .line 15
    .line 16
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->a(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;

    .line 27
    .line 28
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;->g(Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;

    .line 39
    .line 40
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->c(Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 55
    .line 56
    invoke-static {v1, v0}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->e(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_4
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lva/g;

    .line 63
    .line 64
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lva/f;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v2, v1, Lva/f;->b:Ljava/lang/Runnable;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 74
    .line 75
    .line 76
    iput-object v1, v0, Lva/g;->f:Lva/f;

    .line 77
    .line 78
    iget-object v0, v0, Lva/g;->e:Ljava/lang/Runnable;

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_5
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lva/d;

    .line 87
    .line 88
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lm/e;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lva/d;->e(Lm/e;)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_6
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 99
    .line 100
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 103
    .line 104
    sget-object v2, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    :try_start_0
    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Ls9/a;

    .line 110
    .line 111
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lu7/f;

    .line 112
    .line 113
    invoke-static {v0}, Laa/r;->a(Lu7/f;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v2, v0}, Ls9/a;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catch_0
    move-exception v0

    .line 125
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 126
    .line 127
    .line 128
    :goto_0
    return-void

    .line 129
    :pswitch_7
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ln9/g;

    .line 132
    .line 133
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Runnable;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v2, Ljava/util/Date;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    iput-wide v2, v0, Ln9/g;->g:J

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_8
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lm9/y;

    .line 158
    .line 159
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Leb/n0;

    .line 162
    .line 163
    iget-object v2, v0, Lm9/y;->b:Ln9/a;

    .line 164
    .line 165
    new-instance v3, Lw/g;

    .line 166
    .line 167
    const/16 v4, 0x17

    .line 168
    .line 169
    invoke-direct {v3, v4, v0, v1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_9
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lm9/a$c;

    .line 179
    .line 180
    iget-object v4, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v4, Leb/s0;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lp2/m0;->S()Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_5

    .line 192
    .line 193
    new-instance v5, Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 196
    .line 197
    .line 198
    iget v6, v4, Leb/s0;->b:I

    .line 199
    .line 200
    if-nez v6, :cond_0

    .line 201
    .line 202
    move v6, v3

    .line 203
    goto :goto_1

    .line 204
    :cond_0
    move v6, v2

    .line 205
    :goto_1
    if-eqz v6, :cond_1

    .line 206
    .line 207
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    goto :goto_3

    .line 212
    :cond_1
    new-instance v6, Ljava/util/HashSet;

    .line 213
    .line 214
    iget v7, v4, Leb/s0;->b:I

    .line 215
    .line 216
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(I)V

    .line 217
    .line 218
    .line 219
    move v7, v2

    .line 220
    :goto_2
    iget v8, v4, Leb/s0;->b:I

    .line 221
    .line 222
    if-ge v7, v8, :cond_2

    .line 223
    .line 224
    new-instance v8, Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v4, v7}, Leb/s0;->e(I)[B

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-direct {v8, v9, v2}, Ljava/lang/String;-><init>([BI)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    add-int/lit8 v7, v7, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_2
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    :goto_3
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    :cond_3
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    if-eqz v7, :cond_4

    .line 252
    .line 253
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    check-cast v7, Ljava/lang/String;

    .line 258
    .line 259
    sget-object v8, Lm9/j;->d:Ljava/util/HashSet;

    .line 260
    .line 261
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 262
    .line 263
    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    invoke-virtual {v8, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_3

    .line 272
    .line 273
    sget-object v8, Leb/s0;->d:Leb/s0$a;

    .line 274
    .line 275
    sget-object v9, Leb/s0$d;->d:Ljava/util/BitSet;

    .line 276
    .line 277
    new-instance v9, Leb/s0$b;

    .line 278
    .line 279
    invoke-direct {v9, v7, v8}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v9}, Leb/s0;->c(Leb/s0$d;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    check-cast v8, Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_5

    .line 297
    .line 298
    iget-object v4, v0, Lm9/a$c;->c:Lm9/a;

    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    new-array v1, v1, [Ljava/lang/Object;

    .line 309
    .line 310
    iget-object v0, v0, Lm9/a$c;->c:Lm9/a;

    .line 311
    .line 312
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    aput-object v0, v1, v2

    .line 321
    .line 322
    aput-object v5, v1, v3

    .line 323
    .line 324
    const-string v0, "(%x) Stream received headers: %s"

    .line 325
    .line 326
    invoke-static {v3, v4, v0, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_5
    return-void

    .line 330
    :pswitch_a
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Lg9/u;

    .line 333
    .line 334
    iget-object v4, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v4, Lg9/g0;

    .line 337
    .line 338
    iget-object v0, v0, Lg9/u;->j:Lg9/k;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v5, v4, Lg9/g0;->a:Lg9/f0;

    .line 344
    .line 345
    const/4 v6, 0x4

    .line 346
    iget-object v7, v0, Lg9/k;->b:Ljava/util/HashMap;

    .line 347
    .line 348
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    check-cast v7, Lg9/k$b;

    .line 353
    .line 354
    if-nez v7, :cond_7

    .line 355
    .line 356
    new-instance v7, Lg9/k$b;

    .line 357
    .line 358
    invoke-direct {v7}, Lg9/k$b;-><init>()V

    .line 359
    .line 360
    .line 361
    iget-object v6, v0, Lg9/k;->b:Ljava/util/HashMap;

    .line 362
    .line 363
    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4}, Lg9/g0;->a()Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_6

    .line 371
    .line 372
    move v6, v3

    .line 373
    goto :goto_5

    .line 374
    :cond_6
    move v6, v1

    .line 375
    goto :goto_5

    .line 376
    :cond_7
    invoke-virtual {v7}, Lg9/k$b;->a()Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    if-nez v8, :cond_8

    .line 381
    .line 382
    invoke-virtual {v4}, Lg9/g0;->a()Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-eqz v8, :cond_8

    .line 387
    .line 388
    const/4 v6, 0x3

    .line 389
    :cond_8
    :goto_5
    iget-object v8, v7, Lg9/k$b;->a:Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    iget-object v8, v0, Lg9/k;->d:Lg9/d0;

    .line 395
    .line 396
    iput-object v8, v4, Lg9/g0;->e:Lg9/d0;

    .line 397
    .line 398
    iget-object v9, v4, Lg9/g0;->f:Lg9/s0;

    .line 399
    .line 400
    if-eqz v9, :cond_9

    .line 401
    .line 402
    iget-boolean v10, v4, Lg9/g0;->d:Z

    .line 403
    .line 404
    if-nez v10, :cond_9

    .line 405
    .line 406
    invoke-virtual {v4, v9, v8}, Lg9/g0;->d(Lg9/s0;Lg9/d0;)Z

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    if-eqz v8, :cond_9

    .line 411
    .line 412
    iget-object v8, v4, Lg9/g0;->f:Lg9/s0;

    .line 413
    .line 414
    invoke-virtual {v4, v8}, Lg9/g0;->c(Lg9/s0;)V

    .line 415
    .line 416
    .line 417
    move v8, v3

    .line 418
    goto :goto_6

    .line 419
    :cond_9
    move v8, v2

    .line 420
    :goto_6
    xor-int/2addr v8, v3

    .line 421
    new-array v9, v2, [Ljava/lang/Object;

    .line 422
    .line 423
    const-string v10, "onOnlineStateChanged() shouldn\'t raise an event for brand-new listeners."

    .line 424
    .line 425
    invoke-static {v10, v8, v9}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    iget-object v7, v7, Lg9/k$b;->b:Lg9/s0;

    .line 429
    .line 430
    if-eqz v7, :cond_a

    .line 431
    .line 432
    invoke-virtual {v4, v7}, Lg9/g0;->b(Lg9/s0;)Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-eqz v4, :cond_a

    .line 437
    .line 438
    invoke-virtual {v0}, Lg9/k;->b()V

    .line 439
    .line 440
    .line 441
    :cond_a
    invoke-static {v6}, Lq0/g;->c(I)I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-eqz v4, :cond_d

    .line 446
    .line 447
    if-eq v4, v3, :cond_c

    .line 448
    .line 449
    if-eq v4, v1, :cond_b

    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_b
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 453
    .line 454
    const-string v1, "listenToRemoteStore"

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Lg9/j0;->g(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    iget-object v1, v0, Lg9/j0;->c:Ljava/util/HashMap;

    .line 460
    .line 461
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    new-array v3, v3, [Ljava/lang/Object;

    .line 466
    .line 467
    aput-object v5, v3, v2

    .line 468
    .line 469
    const-string v2, "This is the first listen to query: %s"

    .line 470
    .line 471
    invoke-static {v2, v1, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    iget-object v1, v0, Lg9/j0;->a:Li9/n;

    .line 475
    .line 476
    invoke-virtual {v5}, Lg9/f0;->i()Lg9/k0;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-virtual {v1, v2}, Li9/n;->a(Lg9/k0;)Li9/m1;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iget-object v0, v0, Lg9/j0;->b:Lm9/h0;

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Lm9/h0;->d(Li9/m1;)V

    .line 487
    .line 488
    .line 489
    goto :goto_7

    .line 490
    :cond_c
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 491
    .line 492
    invoke-virtual {v0, v5, v2}, Lg9/j0;->i(Lg9/f0;Z)I

    .line 493
    .line 494
    .line 495
    goto :goto_7

    .line 496
    :cond_d
    iget-object v0, v0, Lg9/k;->a:Lg9/j0;

    .line 497
    .line 498
    invoke-virtual {v0, v5, v3}, Lg9/j0;->i(Lg9/f0;Z)I

    .line 499
    .line 500
    .line 501
    :goto_7
    return-void

    .line 502
    :pswitch_b
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Lx0/m;

    .line 505
    .line 506
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v1, Ljava/lang/Runnable;

    .line 509
    .line 510
    const-class v4, Lg9/a$c;

    .line 511
    .line 512
    invoke-virtual {v0}, Lx0/m;->getSupportFragmentManager()Lx0/y;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    const-string v6, "FirestoreOnStopObserverSupportFragment"

    .line 517
    .line 518
    invoke-virtual {v5, v6}, Lx0/y;->E(Ljava/lang/String;)Lx0/i;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-static {v4, v5, v6}, Lg9/a;->b(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    check-cast v4, Lg9/a$c;

    .line 527
    .line 528
    if-eqz v4, :cond_e

    .line 529
    .line 530
    invoke-virtual {v4}, Lx0/i;->isRemoving()Z

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    if-eqz v5, :cond_f

    .line 535
    .line 536
    :cond_e
    new-instance v4, Lg9/a$c;

    .line 537
    .line 538
    invoke-direct {v4}, Lg9/a$c;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Lx0/m;->getSupportFragmentManager()Lx0/y;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    new-instance v7, Lx0/a;

    .line 549
    .line 550
    invoke-direct {v7, v5}, Lx0/a;-><init>(Lx0/y;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v7, v2, v4, v6}, Lx0/a;->e(ILx0/i;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v7, v3}, Lx0/a;->d(Z)I

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Lx0/m;->getSupportFragmentManager()Lx0/y;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0, v3}, Lx0/y;->A(Z)Z

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Lx0/y;->F()V

    .line 567
    .line 568
    .line 569
    :cond_f
    iget-object v0, v4, Lg9/a$c;->a:Lg9/a$a;

    .line 570
    .line 571
    monitor-enter v0

    .line 572
    :try_start_1
    iget-object v2, v0, Lg9/a$a;->a:Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 575
    .line 576
    .line 577
    monitor-exit v0

    .line 578
    return-void

    .line 579
    :catchall_0
    move-exception v1

    .line 580
    monitor-exit v0

    .line 581
    throw v1

    .line 582
    :pswitch_c
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 585
    .line 586
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    :try_start_2
    iget-object v2, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Landroid/content/Context;

    .line 594
    .line 595
    iget-object v3, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Lj9/f;

    .line 596
    .line 597
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v2, v3, v0}, Li9/y0;->D(Landroid/content/Context;Lj9/f;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/google/firebase/firestore/f; {:try_start_2 .. :try_end_2} :catch_1

    .line 603
    .line 604
    .line 605
    goto :goto_8

    .line 606
    :catch_1
    move-exception v0

    .line 607
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 608
    .line 609
    .line 610
    :goto_8
    return-void

    .line 611
    :pswitch_d
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v0, Lj8/s;

    .line 614
    .line 615
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v1, Ljava/lang/String;

    .line 618
    .line 619
    iget-object v0, v0, Lj8/s;->h:Lj8/n;

    .line 620
    .line 621
    iget-object v0, v0, Lj8/n;->d:Ll8/n;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    const/16 v4, 0x400

    .line 627
    .line 628
    invoke-static {v4, v1}, Ll8/e;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    iget-object v4, v0, Ll8/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 633
    .line 634
    monitor-enter v4

    .line 635
    :try_start_3
    iget-object v5, v0, Ll8/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 636
    .line 637
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    check-cast v5, Ljava/lang/String;

    .line 642
    .line 643
    if-nez v1, :cond_10

    .line 644
    .line 645
    if-nez v5, :cond_11

    .line 646
    .line 647
    move v2, v3

    .line 648
    goto :goto_9

    .line 649
    :cond_10
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    :cond_11
    :goto_9
    if-eqz v2, :cond_12

    .line 654
    .line 655
    monitor-exit v4

    .line 656
    goto :goto_a

    .line 657
    :catchall_1
    move-exception v0

    .line 658
    goto :goto_b

    .line 659
    :cond_12
    iget-object v2, v0, Ll8/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 660
    .line 661
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 662
    .line 663
    .line 664
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 665
    iget-object v1, v0, Ll8/n;->b:Lk8/i;

    .line 666
    .line 667
    iget-object v1, v1, Lk8/i;->b:Lk8/b;

    .line 668
    .line 669
    new-instance v2, Lb/m;

    .line 670
    .line 671
    const/16 v3, 0xd

    .line 672
    .line 673
    invoke-direct {v2, v0, v3}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v1, v2}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 677
    .line 678
    .line 679
    :goto_a
    return-void

    .line 680
    :goto_b
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 681
    throw v0

    .line 682
    :pswitch_e
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v0, Lj8/s;

    .line 685
    .line 686
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v1, Lr8/h;

    .line 689
    .line 690
    invoke-virtual {v0, v1}, Lj8/s;->a(Lr8/h;)V

    .line 691
    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_f
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Ljava/lang/Runnable;

    .line 697
    .line 698
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v1, Le8/g$b;

    .line 701
    .line 702
    :try_start_5
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 703
    .line 704
    .line 705
    move-object v0, v1

    .line 706
    check-cast v0, Le8/g$a;

    .line 707
    .line 708
    iget-object v0, v0, Le8/g$a;->a:Le8/g;

    .line 709
    .line 710
    invoke-virtual {v0, v4}, Ls/a;->p(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 711
    .line 712
    .line 713
    goto :goto_c

    .line 714
    :catch_2
    move-exception v0

    .line 715
    check-cast v1, Le8/g$a;

    .line 716
    .line 717
    iget-object v1, v1, Le8/g$a;->a:Le8/g;

    .line 718
    .line 719
    invoke-virtual {v1, v0}, Ls/a;->q(Ljava/lang/Throwable;)Z

    .line 720
    .line 721
    .line 722
    :goto_c
    return-void

    .line 723
    :pswitch_10
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, Lw5/n$a;

    .line 726
    .line 727
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v1, Lw5/o;

    .line 730
    .line 731
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 732
    .line 733
    sget v2, Lv5/e0;->a:I

    .line 734
    .line 735
    invoke-interface {v0, v1}, Lw5/n;->b(Lw5/o;)V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_11
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v0, Lf5/b$b;

    .line 742
    .line 743
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v1, Landroid/net/Uri;

    .line 746
    .line 747
    iput-boolean v2, v0, Lf5/b$b;->q:Z

    .line 748
    .line 749
    invoke-virtual {v0, v1}, Lf5/b$b;->b(Landroid/net/Uri;)V

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_12
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, La4/g$a;

    .line 756
    .line 757
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v1, La4/g;

    .line 760
    .line 761
    iget v2, v0, La4/g$a;->a:I

    .line 762
    .line 763
    iget-object v0, v0, La4/g$a;->b:Lz4/t$b;

    .line 764
    .line 765
    invoke-interface {v1, v2, v0}, La4/g;->E(ILz4/t$b;)V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :pswitch_13
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v0, Landroid/media/AudioTrack;

    .line 772
    .line 773
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v1, Lb5/g;

    .line 776
    .line 777
    sget-object v2, Lx3/s;->d0:Ljava/lang/Object;

    .line 778
    .line 779
    :try_start_6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1}, Lb5/g;->a()Z

    .line 786
    .line 787
    .line 788
    sget-object v0, Lx3/s;->d0:Ljava/lang/Object;

    .line 789
    .line 790
    monitor-enter v0

    .line 791
    :try_start_7
    sget v1, Lx3/s;->f0:I

    .line 792
    .line 793
    add-int/lit8 v1, v1, -0x1

    .line 794
    .line 795
    sput v1, Lx3/s;->f0:I

    .line 796
    .line 797
    if-nez v1, :cond_13

    .line 798
    .line 799
    sget-object v1, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 800
    .line 801
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 802
    .line 803
    .line 804
    sput-object v4, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 805
    .line 806
    goto :goto_d

    .line 807
    :catchall_2
    move-exception v1

    .line 808
    goto :goto_e

    .line 809
    :cond_13
    :goto_d
    monitor-exit v0

    .line 810
    return-void

    .line 811
    :goto_e
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 812
    throw v1

    .line 813
    :catchall_3
    move-exception v0

    .line 814
    invoke-virtual {v1}, Lb5/g;->a()Z

    .line 815
    .line 816
    .line 817
    sget-object v1, Lx3/s;->d0:Ljava/lang/Object;

    .line 818
    .line 819
    monitor-enter v1

    .line 820
    :try_start_8
    sget v2, Lx3/s;->f0:I

    .line 821
    .line 822
    add-int/lit8 v2, v2, -0x1

    .line 823
    .line 824
    sput v2, Lx3/s;->f0:I

    .line 825
    .line 826
    if-nez v2, :cond_14

    .line 827
    .line 828
    sget-object v2, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 829
    .line 830
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 831
    .line 832
    .line 833
    sput-object v4, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 834
    .line 835
    goto :goto_f

    .line 836
    :catchall_4
    move-exception v0

    .line 837
    goto :goto_10

    .line 838
    :cond_14
    :goto_f
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 839
    throw v0

    .line 840
    :goto_10
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 841
    throw v0

    .line 842
    :pswitch_14
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v0, Lx3/l$a;

    .line 845
    .line 846
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v1, Ljava/lang/Exception;

    .line 849
    .line 850
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 851
    .line 852
    sget v2, Lv5/e0;->a:I

    .line 853
    .line 854
    invoke-interface {v0, v1}, Lx3/l;->t(Ljava/lang/Exception;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_15
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, Lv3/z0$a;

    .line 861
    .line 862
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v1, Landroid/util/Pair;

    .line 865
    .line 866
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 867
    .line 868
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 869
    .line 870
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v2, Ljava/lang/Integer;

    .line 873
    .line 874
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v1, Lz4/t$b;

    .line 881
    .line 882
    invoke-interface {v0, v2, v1}, La4/g;->E(ILz4/t$b;)V

    .line 883
    .line 884
    .line 885
    return-void

    .line 886
    :pswitch_16
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v0, Lv3/g0;

    .line 889
    .line 890
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v1, Lv3/g1;

    .line 893
    .line 894
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    :try_start_a
    monitor-enter v1

    .line 898
    monitor-exit v1
    :try_end_a
    .catch Lv3/n; {:try_start_a .. :try_end_a} :catch_3

    .line 899
    :try_start_b
    iget-object v0, v1, Lv3/g1;->a:Lv3/g1$b;

    .line 900
    .line 901
    iget v2, v1, Lv3/g1;->d:I

    .line 902
    .line 903
    iget-object v4, v1, Lv3/g1;->e:Ljava/lang/Object;

    .line 904
    .line 905
    invoke-interface {v0, v2, v4}, Lv3/g1$b;->q(ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 906
    .line 907
    .line 908
    :try_start_c
    invoke-virtual {v1, v3}, Lv3/g1;->b(Z)V

    .line 909
    .line 910
    .line 911
    return-void

    .line 912
    :catch_3
    move-exception v0

    .line 913
    goto :goto_11

    .line 914
    :catchall_5
    move-exception v0

    .line 915
    invoke-virtual {v1, v3}, Lv3/g1;->b(Z)V

    .line 916
    .line 917
    .line 918
    throw v0
    :try_end_c
    .catch Lv3/n; {:try_start_c .. :try_end_c} :catch_3

    .line 919
    :goto_11
    const-string v1, "ExoPlayerImplInternal"

    .line 920
    .line 921
    const-string v2, "Unexpected error delivering message on external thread."

    .line 922
    .line 923
    invoke-static {v1, v2, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 924
    .line 925
    .line 926
    new-instance v1, Ljava/lang/RuntimeException;

    .line 927
    .line 928
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 929
    .line 930
    .line 931
    throw v1

    .line 932
    :pswitch_17
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 935
    .line 936
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v1, Landroid/app/job/JobParameters;

    .line 939
    .line 940
    sget v3, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->a:I

    .line 941
    .line 942
    invoke-virtual {v0, v1, v2}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 943
    .line 944
    .line 945
    return-void

    .line 946
    :pswitch_18
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 949
    .line 950
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v1, Ls7/e;

    .line 953
    .line 954
    const-string v2, "this$0"

    .line 955
    .line 956
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    const-string v2, "$innerFuture"

    .line 960
    .line 961
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->f:Ljava/lang/Object;

    .line 965
    .line 966
    monitor-enter v2

    .line 967
    :try_start_d
    iget-boolean v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->o:Z

    .line 968
    .line 969
    if-eqz v3, :cond_15

    .line 970
    .line 971
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Lz2/c;

    .line 972
    .line 973
    const-string v1, "future"

    .line 974
    .line 975
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    sget-object v1, Lb3/a;->a:Ljava/lang/String;

    .line 979
    .line 980
    new-instance v1, Landroidx/work/d$a$b;

    .line 981
    .line 982
    invoke-direct {v1}, Landroidx/work/d$a$b;-><init>()V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v1}, Lz2/c;->i(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    goto :goto_12

    .line 989
    :catchall_6
    move-exception v0

    .line 990
    goto :goto_13

    .line 991
    :cond_15
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Lz2/c;

    .line 992
    .line 993
    invoke-virtual {v0, v1}, Lz2/c;->k(Ls7/e;)Z

    .line 994
    .line 995
    .line 996
    :goto_12
    sget-object v0, Lrb/h;->a:Lrb/h;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 997
    .line 998
    monitor-exit v2

    .line 999
    return-void

    .line 1000
    :goto_13
    monitor-exit v2

    .line 1001
    throw v0

    .line 1002
    :pswitch_19
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v0, Ly2/x;

    .line 1005
    .line 1006
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v1, Lz2/c;

    .line 1009
    .line 1010
    iget-object v2, v0, Ly2/x;->a:Lz2/c;

    .line 1011
    .line 1012
    iget-object v2, v2, Lz2/a;->a:Ljava/lang/Object;

    .line 1013
    .line 1014
    instance-of v2, v2, Lz2/a$b;

    .line 1015
    .line 1016
    if-nez v2, :cond_16

    .line 1017
    .line 1018
    iget-object v0, v0, Ly2/x;->d:Landroidx/work/d;

    .line 1019
    .line 1020
    invoke-virtual {v0}, Landroidx/work/d;->b()Ls7/e;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v1, v0}, Lz2/c;->k(Ls7/e;)Z

    .line 1025
    .line 1026
    .line 1027
    goto :goto_14

    .line 1028
    :cond_16
    invoke-virtual {v1, v3}, Lz2/a;->cancel(Z)Z

    .line 1029
    .line 1030
    .line 1031
    :goto_14
    return-void

    .line 1032
    :pswitch_1a
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v0, Ljava/util/List;

    .line 1035
    .line 1036
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v1, Lv2/g;

    .line 1039
    .line 1040
    const-string v2, "$listenersList"

    .line 1041
    .line 1042
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    const-string v2, "this$0"

    .line 1046
    .line 1047
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    if-eqz v2, :cond_17

    .line 1059
    .line 1060
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    check-cast v2, Lt2/a;

    .line 1065
    .line 1066
    iget-object v3, v1, Lv2/g;->e:Ljava/lang/Object;

    .line 1067
    .line 1068
    invoke-interface {v2, v3}, Lt2/a;->a(Ljava/lang/Object;)V

    .line 1069
    .line 1070
    .line 1071
    goto :goto_15

    .line 1072
    :cond_17
    return-void

    .line 1073
    :pswitch_1b
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v0, Lp2/q0;

    .line 1076
    .line 1077
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 1078
    .line 1079
    check-cast v1, Ls7/e;

    .line 1080
    .line 1081
    iget-object v0, v0, Lp2/q0;->x:Lz2/c;

    .line 1082
    .line 1083
    iget-object v0, v0, Lz2/a;->a:Ljava/lang/Object;

    .line 1084
    .line 1085
    instance-of v0, v0, Lz2/a$b;

    .line 1086
    .line 1087
    if-eqz v0, :cond_18

    .line 1088
    .line 1089
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1090
    .line 1091
    .line 1092
    :cond_18
    return-void

    .line 1093
    :pswitch_1c
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v0, Lx0/r0$c;

    .line 1096
    .line 1097
    iget-object v2, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v2, Lx0/e$g;

    .line 1100
    .line 1101
    const-string v3, "$operation"

    .line 1102
    .line 1103
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    const-string v3, "this$0"

    .line 1107
    .line 1108
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v1}, Lx0/y;->L(I)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    if-eqz v1, :cond_19

    .line 1116
    .line 1117
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1120
    .line 1121
    .line 1122
    const-string v3, "Transition for operation "

    .line 1123
    .line 1124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    const-string v3, " has completed"

    .line 1131
    .line 1132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    const-string v3, "FragmentManager"

    .line 1140
    .line 1141
    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1142
    .line 1143
    .line 1144
    :cond_19
    invoke-virtual {v0, v2}, Lx0/r0$c;->c(Lx0/r0$a;)V

    .line 1145
    .line 1146
    .line 1147
    return-void

    .line 1148
    :goto_16
    iget-object v0, p0, Lx0/f;->b:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v0, Ljava/lang/Boolean;

    .line 1151
    .line 1152
    iget-object v1, p0, Lx0/f;->c:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    .line 1155
    .line 1156
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->o(Ljava/lang/Boolean;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    .line 1157
    .line 1158
    .line 1159
    return-void

    .line 1160
    nop

    .line 1161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
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
        :pswitch_0
    .end packed-switch
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
