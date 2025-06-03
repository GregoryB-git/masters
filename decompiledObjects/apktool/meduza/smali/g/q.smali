.class public final synthetic Lg/q;
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

    .line 1
    iput p1, p0, Lg/q;->a:I

    iput-object p2, p0, Lg/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lg/q;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Le8/g$b;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lg/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/q;->c:Ljava/lang/Object;

    iput-object p2, p0, Lg/q;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lg/q;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_d

    .line 9
    .line 10
    :pswitch_0
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;

    .line 13
    .line 14
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;->i(Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;

    .line 25
    .line 26
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;->h(Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lva/d;

    .line 37
    .line 38
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lm/e;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lva/d;->d(Lm/e;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 49
    .line 50
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Exception;

    .line 53
    .line 54
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "UNEXPECTED_ERROR"

    .line 59
    .line 60
    const-string v3, "Unexpected error"

    .line 61
    .line 62
    invoke-interface {v0, v2, v3, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_4
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Laa/p;

    .line 69
    .line 70
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :try_start_0
    invoke-virtual {v0}, Laa/p;->f()Landroid/graphics/Bitmap;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-void

    .line 90
    :pswitch_5
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 93
    .line 94
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 97
    .line 98
    sget-object v2, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    :try_start_1
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catch_1
    move-exception v0

    .line 112
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    return-void

    .line 116
    :pswitch_6
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ln9/m;

    .line 119
    .line 120
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Ljava/lang/Runnable;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 128
    .line 129
    .line 130
    iget-object v0, v0, Ln9/m;->b:Ljava/util/concurrent/Semaphore;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_7
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lm9/h0;

    .line 139
    .line 140
    iget-object v3, p0, Lg/q;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v3, Lm9/h$a;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    sget-object v4, Lm9/h$a;->b:Lm9/h$a;

    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_0

    .line 154
    .line 155
    iget-object v4, v0, Lm9/h0;->g:Lm9/b0;

    .line 156
    .line 157
    iget-object v4, v4, Lm9/b0;->a:Lg9/d0;

    .line 158
    .line 159
    sget-object v5, Lg9/d0;->b:Lg9/d0;

    .line 160
    .line 161
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_0

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_0
    sget-object v4, Lm9/h$a;->a:Lm9/h$a;

    .line 169
    .line 170
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_1

    .line 175
    .line 176
    iget-object v3, v0, Lm9/h0;->g:Lm9/b0;

    .line 177
    .line 178
    iget-object v3, v3, Lm9/b0;->a:Lg9/d0;

    .line 179
    .line 180
    sget-object v4, Lg9/d0;->c:Lg9/d0;

    .line 181
    .line 182
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_1
    iget-boolean v3, v0, Lm9/h0;->h:Z

    .line 190
    .line 191
    if-nez v3, :cond_2

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    .line 195
    .line 196
    const-string v4, "RemoteStore"

    .line 197
    .line 198
    const-string v5, "Restarting streams for network reachability change."

    .line 199
    .line 200
    invoke-static {v2, v4, v5, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iput-boolean v1, v0, Lm9/h0;->h:Z

    .line 204
    .line 205
    invoke-virtual {v0}, Lm9/h0;->a()V

    .line 206
    .line 207
    .line 208
    iget-object v1, v0, Lm9/h0;->g:Lm9/b0;

    .line 209
    .line 210
    sget-object v2, Lg9/d0;->a:Lg9/d0;

    .line 211
    .line 212
    invoke-virtual {v1, v2}, Lm9/b0;->c(Lg9/d0;)V

    .line 213
    .line 214
    .line 215
    iget-object v1, v0, Lm9/h0;->j:Lm9/q0;

    .line 216
    .line 217
    invoke-virtual {v1}, Lm9/a;->b()V

    .line 218
    .line 219
    .line 220
    iget-object v1, v0, Lm9/h0;->i:Lm9/p0;

    .line 221
    .line 222
    invoke-virtual {v1}, Lm9/a;->b()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lm9/h0;->b()V

    .line 226
    .line 227
    .line 228
    :goto_2
    return-void

    .line 229
    :pswitch_8
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, Lm9/y;

    .line 232
    .line 233
    iget-object v3, p0, Lg/q;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v3, Leb/n0;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-array v4, v1, [Ljava/lang/Object;

    .line 241
    .line 242
    const-string v5, "GrpcCallProvider"

    .line 243
    .line 244
    const-string v6, "connectivityAttemptTimer elapsed. Resetting the channel."

    .line 245
    .line 246
    invoke-static {v2, v5, v6, v4}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v4, v0, Lm9/y;->d:Ln9/a$a;

    .line 250
    .line 251
    if-eqz v4, :cond_3

    .line 252
    .line 253
    new-array v1, v1, [Ljava/lang/Object;

    .line 254
    .line 255
    const-string v4, "GrpcCallProvider"

    .line 256
    .line 257
    const-string v5, "Clearing the connectivityAttemptTimer"

    .line 258
    .line 259
    invoke-static {v4, v5, v1}, Lp2/m0;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object v1, v0, Lm9/y;->d:Ln9/a$a;

    .line 263
    .line 264
    invoke-virtual {v1}, Ln9/a$a;->a()V

    .line 265
    .line 266
    .line 267
    const/4 v1, 0x0

    .line 268
    iput-object v1, v0, Lm9/y;->d:Ln9/a$a;

    .line 269
    .line 270
    :cond_3
    iget-object v1, v0, Lm9/y;->b:Ln9/a;

    .line 271
    .line 272
    new-instance v4, Lm9/x;

    .line 273
    .line 274
    invoke-direct {v4, v0, v3, v2}, Lm9/x;-><init>(Lm9/y;Leb/n0;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v4}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_9
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lm9/d;

    .line 284
    .line 285
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, Lm9/d$b;

    .line 288
    .line 289
    iget-object v0, v0, Lm9/d;->a:Landroid/content/Context;

    .line 290
    .line 291
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_a
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Li9/n;

    .line 298
    .line 299
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v1, Lf9/e;

    .line 302
    .line 303
    iget-object v0, v0, Li9/n;->j:Li9/a;

    .line 304
    .line 305
    invoke-interface {v0, v1}, Li9/a;->b(Lf9/e;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_b
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lg9/u;

    .line 312
    .line 313
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, Ld9/l;

    .line 316
    .line 317
    iget-object v0, v0, Lg9/u;->j:Lg9/k;

    .line 318
    .line 319
    iget-object v0, v0, Lg9/k;->c:Ljava/util/HashSet;

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_c
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Landroid/app/Activity;

    .line 328
    .line 329
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, Ljava/lang/Runnable;

    .line 332
    .line 333
    const-class v2, Lg9/a$b;

    .line 334
    .line 335
    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const-string v4, "FirestoreOnStopObserverFragment"

    .line 340
    .line 341
    invoke-virtual {v3, v4}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-static {v2, v3, v4}, Lg9/a;->b(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    check-cast v2, Lg9/a$b;

    .line 350
    .line 351
    if-eqz v2, :cond_4

    .line 352
    .line 353
    invoke-virtual {v2}, Landroid/app/Fragment;->isRemoving()Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-eqz v3, :cond_5

    .line 358
    .line 359
    :cond_4
    new-instance v2, Lg9/a$b;

    .line 360
    .line 361
    invoke-direct {v2}, Lg9/a$b;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-virtual {v3}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v3, v2, v4}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 384
    .line 385
    .line 386
    :cond_5
    iget-object v0, v2, Lg9/a$b;->a:Lg9/a$a;

    .line 387
    .line 388
    monitor-enter v0

    .line 389
    :try_start_2
    iget-object v2, v0, Lg9/a$a;->a:Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 392
    .line 393
    .line 394
    monitor-exit v0

    .line 395
    return-void

    .line 396
    :catchall_0
    move-exception v1

    .line 397
    monitor-exit v0

    .line 398
    throw v1

    .line 399
    :pswitch_d
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v0, Ld9/c0$a;

    .line 402
    .line 403
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v1, Ld9/d0;

    .line 406
    .line 407
    iget-object v0, v0, Ld9/c0$a;->b:Le;

    .line 408
    .line 409
    iget-object v0, v0, Le;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 412
    .line 413
    invoke-interface {v0, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_e
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lj8/s;

    .line 420
    .line 421
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v1, Lr8/h;

    .line 424
    .line 425
    invoke-virtual {v0, v1}, Lj8/s;->a(Lr8/h;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_f
    iget-object v0, p0, Lg/q;->c:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Ljava/lang/Runnable;

    .line 432
    .line 433
    iget-object v1, p0, Lg/q;->b:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v1, Le8/g$b;

    .line 436
    .line 437
    :try_start_3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :catch_2
    move-exception v0

    .line 442
    check-cast v1, Le8/g$a;

    .line 443
    .line 444
    iget-object v1, v1, Le8/g$a;->a:Le8/g;

    .line 445
    .line 446
    invoke-virtual {v1, v0}, Ls/a;->q(Ljava/lang/Throwable;)Z

    .line 447
    .line 448
    .line 449
    throw v0

    .line 450
    :pswitch_10
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Ljava/util/Map$Entry;

    .line 453
    .line 454
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v1, Lc9/a;

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Lc9/b;

    .line 463
    .line 464
    invoke-interface {v0, v1}, Lc9/b;->a(Lc9/a;)V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :pswitch_11
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Ld8/p;

    .line 471
    .line 472
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v1, Lt9/b;

    .line 475
    .line 476
    monitor-enter v0

    .line 477
    :try_start_4
    iget-object v2, v0, Ld8/p;->b:Ljava/util/Set;

    .line 478
    .line 479
    if-nez v2, :cond_6

    .line 480
    .line 481
    iget-object v2, v0, Ld8/p;->a:Ljava/util/Set;

    .line 482
    .line 483
    goto :goto_3

    .line 484
    :cond_6
    iget-object v2, v0, Ld8/p;->b:Ljava/util/Set;

    .line 485
    .line 486
    invoke-interface {v1}, Lt9/b;->get()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    :goto_3
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 491
    .line 492
    .line 493
    monitor-exit v0

    .line 494
    return-void

    .line 495
    :catchall_1
    move-exception v1

    .line 496
    monitor-exit v0

    .line 497
    throw v1

    .line 498
    :pswitch_12
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Lx5/j;

    .line 501
    .line 502
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Landroid/graphics/SurfaceTexture;

    .line 505
    .line 506
    iget-object v2, v0, Lx5/j;->o:Landroid/graphics/SurfaceTexture;

    .line 507
    .line 508
    iget-object v3, v0, Lx5/j;->p:Landroid/view/Surface;

    .line 509
    .line 510
    new-instance v4, Landroid/view/Surface;

    .line 511
    .line 512
    invoke-direct {v4, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 513
    .line 514
    .line 515
    iput-object v1, v0, Lx5/j;->o:Landroid/graphics/SurfaceTexture;

    .line 516
    .line 517
    iput-object v4, v0, Lx5/j;->p:Landroid/view/Surface;

    .line 518
    .line 519
    iget-object v0, v0, Lx5/j;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_7

    .line 530
    .line 531
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    check-cast v1, Lx5/j$b;

    .line 536
    .line 537
    invoke-interface {v1, v4}, Lx5/j$b;->m(Landroid/view/Surface;)V

    .line 538
    .line 539
    .line 540
    goto :goto_4

    .line 541
    :cond_7
    if-eqz v2, :cond_8

    .line 542
    .line 543
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 544
    .line 545
    .line 546
    :cond_8
    if-eqz v3, :cond_9

    .line 547
    .line 548
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 549
    .line 550
    .line 551
    :cond_9
    return-void

    .line 552
    :pswitch_13
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Lw5/n$a;

    .line 555
    .line 556
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v1, Ljava/lang/Exception;

    .line 559
    .line 560
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 561
    .line 562
    sget v2, Lv5/e0;->a:I

    .line 563
    .line 564
    invoke-interface {v0, v1}, Lw5/n;->v(Ljava/lang/Exception;)V

    .line 565
    .line 566
    .line 567
    return-void

    .line 568
    :pswitch_14
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, Lw5/n$a;

    .line 571
    .line 572
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v1, Ljava/lang/String;

    .line 575
    .line 576
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 577
    .line 578
    sget v2, Lv5/e0;->a:I

    .line 579
    .line 580
    invoke-interface {v0, v1}, Lw5/n;->c(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    :pswitch_15
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, La4/b$d;

    .line 587
    .line 588
    iget-object v2, p0, Lg/q;->c:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v2, Lv3/i0;

    .line 591
    .line 592
    iget-object v3, v0, La4/b$d;->d:La4/b;

    .line 593
    .line 594
    iget v4, v3, La4/b;->p:I

    .line 595
    .line 596
    if-eqz v4, :cond_b

    .line 597
    .line 598
    iget-boolean v4, v0, La4/b$d;->c:Z

    .line 599
    .line 600
    if-eqz v4, :cond_a

    .line 601
    .line 602
    goto :goto_5

    .line 603
    :cond_a
    iget-object v4, v3, La4/b;->t:Landroid/os/Looper;

    .line 604
    .line 605
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    iget-object v5, v0, La4/b$d;->a:La4/g$a;

    .line 609
    .line 610
    invoke-virtual {v3, v4, v5, v2, v1}, La4/b;->f(Landroid/os/Looper;La4/g$a;Lv3/i0;Z)La4/e;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    iput-object v1, v0, La4/b$d;->b:La4/e;

    .line 615
    .line 616
    iget-object v1, v0, La4/b$d;->d:La4/b;

    .line 617
    .line 618
    iget-object v1, v1, La4/b;->n:Ljava/util/Set;

    .line 619
    .line 620
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    :cond_b
    :goto_5
    return-void

    .line 624
    :pswitch_16
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v0, Lx3/l$a;

    .line 627
    .line 628
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v1, Ljava/lang/Exception;

    .line 631
    .line 632
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 633
    .line 634
    sget v2, Lv5/e0;->a:I

    .line 635
    .line 636
    invoke-interface {v0, v1}, Lx3/l;->p(Ljava/lang/Exception;)V

    .line 637
    .line 638
    .line 639
    return-void

    .line 640
    :pswitch_17
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 641
    .line 642
    move-object v3, v0

    .line 643
    check-cast v3, Lv3/d0;

    .line 644
    .line 645
    iget-object v0, p0, Lg/q;->c:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Lv3/g0$d;

    .line 648
    .line 649
    iget v4, v3, Lv3/d0;->H:I

    .line 650
    .line 651
    iget v5, v0, Lv3/g0$d;->c:I

    .line 652
    .line 653
    sub-int/2addr v4, v5

    .line 654
    iput v4, v3, Lv3/d0;->H:I

    .line 655
    .line 656
    iget-boolean v5, v0, Lv3/g0$d;->d:Z

    .line 657
    .line 658
    if-eqz v5, :cond_c

    .line 659
    .line 660
    iget v5, v0, Lv3/g0$d;->e:I

    .line 661
    .line 662
    iput v5, v3, Lv3/d0;->I:I

    .line 663
    .line 664
    iput-boolean v2, v3, Lv3/d0;->J:Z

    .line 665
    .line 666
    :cond_c
    iget-boolean v5, v0, Lv3/g0$d;->f:Z

    .line 667
    .line 668
    if-eqz v5, :cond_d

    .line 669
    .line 670
    iget v5, v0, Lv3/g0$d;->g:I

    .line 671
    .line 672
    iput v5, v3, Lv3/d0;->K:I

    .line 673
    .line 674
    :cond_d
    if-nez v4, :cond_17

    .line 675
    .line 676
    iget-object v4, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 677
    .line 678
    iget-object v4, v4, Lv3/d1;->a:Lv3/r1;

    .line 679
    .line 680
    iget-object v5, v3, Lv3/d0;->e0:Lv3/d1;

    .line 681
    .line 682
    iget-object v5, v5, Lv3/d1;->a:Lv3/r1;

    .line 683
    .line 684
    invoke-virtual {v5}, Lv3/r1;->p()Z

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    if-nez v5, :cond_e

    .line 689
    .line 690
    invoke-virtual {v4}, Lv3/r1;->p()Z

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    if-eqz v5, :cond_e

    .line 695
    .line 696
    const/4 v5, -0x1

    .line 697
    iput v5, v3, Lv3/d0;->f0:I

    .line 698
    .line 699
    const-wide/16 v5, 0x0

    .line 700
    .line 701
    iput-wide v5, v3, Lv3/d0;->g0:J

    .line 702
    .line 703
    :cond_e
    invoke-virtual {v4}, Lv3/r1;->p()Z

    .line 704
    .line 705
    .line 706
    move-result v5

    .line 707
    if-nez v5, :cond_10

    .line 708
    .line 709
    move-object v5, v4

    .line 710
    check-cast v5, Lv3/h1;

    .line 711
    .line 712
    iget-object v5, v5, Lv3/h1;->r:[Lv3/r1;

    .line 713
    .line 714
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    iget-object v7, v3, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 725
    .line 726
    .line 727
    move-result v7

    .line 728
    if-ne v6, v7, :cond_f

    .line 729
    .line 730
    move v6, v2

    .line 731
    goto :goto_6

    .line 732
    :cond_f
    move v6, v1

    .line 733
    :goto_6
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 734
    .line 735
    .line 736
    move v6, v1

    .line 737
    :goto_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 738
    .line 739
    .line 740
    move-result v7

    .line 741
    if-ge v6, v7, :cond_10

    .line 742
    .line 743
    iget-object v7, v3, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 744
    .line 745
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    check-cast v7, Lv3/d0$d;

    .line 750
    .line 751
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v8

    .line 755
    check-cast v8, Lv3/r1;

    .line 756
    .line 757
    iput-object v8, v7, Lv3/d0$d;->b:Lv3/r1;

    .line 758
    .line 759
    add-int/lit8 v6, v6, 0x1

    .line 760
    .line 761
    goto :goto_7

    .line 762
    :cond_10
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    iget-boolean v7, v3, Lv3/d0;->J:Z

    .line 768
    .line 769
    if-eqz v7, :cond_16

    .line 770
    .line 771
    iget-object v7, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 772
    .line 773
    iget-object v7, v7, Lv3/d1;->b:Lz4/t$b;

    .line 774
    .line 775
    iget-object v8, v3, Lv3/d0;->e0:Lv3/d1;

    .line 776
    .line 777
    iget-object v8, v8, Lv3/d1;->b:Lz4/t$b;

    .line 778
    .line 779
    invoke-virtual {v7, v8}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    move-result v7

    .line 783
    if-eqz v7, :cond_12

    .line 784
    .line 785
    iget-object v7, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 786
    .line 787
    iget-wide v7, v7, Lv3/d1;->d:J

    .line 788
    .line 789
    iget-object v9, v3, Lv3/d0;->e0:Lv3/d1;

    .line 790
    .line 791
    iget-wide v9, v9, Lv3/d1;->r:J

    .line 792
    .line 793
    cmp-long v7, v7, v9

    .line 794
    .line 795
    if-eqz v7, :cond_11

    .line 796
    .line 797
    goto :goto_8

    .line 798
    :cond_11
    move v2, v1

    .line 799
    :cond_12
    :goto_8
    if-eqz v2, :cond_15

    .line 800
    .line 801
    invoke-virtual {v4}, Lv3/r1;->p()Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    if-nez v5, :cond_14

    .line 806
    .line 807
    iget-object v5, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 808
    .line 809
    iget-object v5, v5, Lv3/d1;->b:Lz4/t$b;

    .line 810
    .line 811
    invoke-virtual {v5}, Lz4/s;->a()Z

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    if-eqz v5, :cond_13

    .line 816
    .line 817
    goto :goto_9

    .line 818
    :cond_13
    iget-object v5, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 819
    .line 820
    iget-object v6, v5, Lv3/d1;->b:Lz4/t$b;

    .line 821
    .line 822
    iget-wide v7, v5, Lv3/d1;->d:J

    .line 823
    .line 824
    iget-object v5, v6, Lz4/s;->a:Ljava/lang/Object;

    .line 825
    .line 826
    iget-object v6, v3, Lv3/d0;->n:Lv3/r1$b;

    .line 827
    .line 828
    invoke-virtual {v4, v5, v6}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 829
    .line 830
    .line 831
    iget-object v4, v3, Lv3/d0;->n:Lv3/r1$b;

    .line 832
    .line 833
    iget-wide v4, v4, Lv3/r1$b;->e:J

    .line 834
    .line 835
    add-long v5, v7, v4

    .line 836
    .line 837
    goto :goto_a

    .line 838
    :cond_14
    :goto_9
    iget-object v4, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 839
    .line 840
    iget-wide v5, v4, Lv3/d1;->d:J

    .line 841
    .line 842
    :cond_15
    :goto_a
    move v8, v2

    .line 843
    goto :goto_b

    .line 844
    :cond_16
    move v8, v1

    .line 845
    :goto_b
    move-wide v10, v5

    .line 846
    iput-boolean v1, v3, Lv3/d0;->J:Z

    .line 847
    .line 848
    iget-object v4, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 849
    .line 850
    const/4 v5, 0x1

    .line 851
    iget v6, v3, Lv3/d0;->K:I

    .line 852
    .line 853
    const/4 v7, 0x0

    .line 854
    iget v9, v3, Lv3/d0;->I:I

    .line 855
    .line 856
    const/4 v12, -0x1

    .line 857
    const/4 v13, 0x0

    .line 858
    invoke-virtual/range {v3 .. v13}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 859
    .line 860
    .line 861
    :cond_17
    return-void

    .line 862
    :pswitch_18
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v0, Lp1/g;

    .line 865
    .line 866
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v1, Ljava/lang/String;

    .line 869
    .line 870
    const-string v2, "this$0"

    .line 871
    .line 872
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    const-string v2, "$query"

    .line 876
    .line 877
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    const/4 v0, 0x0

    .line 884
    throw v0

    .line 885
    :pswitch_19
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v0, Landroidx/profileinstaller/ProfileInstallerInitializer;

    .line 888
    .line 889
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v1, Landroid/content/Context;

    .line 892
    .line 893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 897
    .line 898
    const/16 v3, 0x1c

    .line 899
    .line 900
    if-lt v0, v3, :cond_18

    .line 901
    .line 902
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-static {v0}, Landroidx/profileinstaller/ProfileInstallerInitializer$b;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    goto :goto_c

    .line 911
    :cond_18
    new-instance v0, Landroid/os/Handler;

    .line 912
    .line 913
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 918
    .line 919
    .line 920
    :goto_c
    new-instance v3, Ljava/util/Random;

    .line 921
    .line 922
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 923
    .line 924
    .line 925
    const/16 v4, 0x3e8

    .line 926
    .line 927
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 928
    .line 929
    .line 930
    move-result v2

    .line 931
    invoke-virtual {v3, v2}, Ljava/util/Random;->nextInt(I)I

    .line 932
    .line 933
    .line 934
    move-result v2

    .line 935
    new-instance v3, Lb/d;

    .line 936
    .line 937
    const/4 v4, 0x3

    .line 938
    invoke-direct {v3, v1, v4}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 939
    .line 940
    .line 941
    add-int/lit16 v2, v2, 0x1388

    .line 942
    .line 943
    int-to-long v1, v2

    .line 944
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 945
    .line 946
    .line 947
    return-void

    .line 948
    :pswitch_1a
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v0, Lx0/e;

    .line 951
    .line 952
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v1, Lx0/r0$c;

    .line 955
    .line 956
    const-string v2, "this$0"

    .line 957
    .line 958
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    const-string v2, "$operation"

    .line 962
    .line 963
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v0, v1}, Lx0/r0;->a(Lx0/r0$c;)V

    .line 967
    .line 968
    .line 969
    return-void

    .line 970
    :pswitch_1b
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, Lg/r$a;

    .line 973
    .line 974
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v1, Ljava/lang/Runnable;

    .line 977
    .line 978
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    :try_start_5
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0}, Lg/r$a;->a()V

    .line 985
    .line 986
    .line 987
    return-void

    .line 988
    :catchall_2
    move-exception v1

    .line 989
    invoke-virtual {v0}, Lg/r$a;->a()V

    .line 990
    .line 991
    .line 992
    throw v1

    .line 993
    :goto_d
    iget-object v0, p0, Lg/q;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 996
    .line 997
    iget-object v1, p0, Lg/q;->c:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v1, Ljava/util/HashMap;

    .line 1000
    .line 1001
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->c(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/HashMap;)V

    .line 1002
    .line 1003
    .line 1004
    return-void

    .line 1005
    :pswitch_data_0
    .packed-switch 0x0
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
