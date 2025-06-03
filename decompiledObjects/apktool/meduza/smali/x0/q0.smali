.class public final synthetic Lx0/q0;
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

    iput p1, p0, Lx0/q0;->a:I

    iput-object p2, p0, Lx0/q0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lx0/q0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lx0/q0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    goto/16 :goto_e

    .line 10
    .line 11
    :pswitch_0
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;

    .line 14
    .line 15
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->f(Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lva/d;

    .line 26
    .line 27
    iget-object v4, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lm/e;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v5, "cursorId"

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Lm/e;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    const-string v8, "cancel"

    .line 49
    .line 50
    invoke-virtual {v4, v8}, Lm/e;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v7, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    iget v8, v0, Lva/d;->d:I

    .line 59
    .line 60
    invoke-static {v8}, Lp2/m0;->O(I)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    new-instance v8, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lva/d;->h()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v9, "cursor "

    .line 79
    .line 80
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    if-eqz v7, :cond_0

    .line 87
    .line 88
    const-string v9, " cancel"

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const-string v9, " next"

    .line 92
    .line 93
    :goto_0
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    const-string v9, "Sqflite"

    .line 101
    .line 102
    invoke-static {v9, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_1
    if-eqz v7, :cond_3

    .line 106
    .line 107
    iget-object v2, v0, Lva/d;->g:Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lva/l;

    .line 118
    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lva/d;->b(Lva/l;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    check-cast v4, Lwa/a;

    .line 125
    .line 126
    invoke-virtual {v4, v1}, Lwa/a;->a(Ljava/io/Serializable;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_3
    iget-object v7, v0, Lva/d;->g:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, Lva/l;

    .line 142
    .line 143
    if-eqz v7, :cond_6

    .line 144
    .line 145
    :try_start_0
    iget-object v8, v7, Lva/l;->c:Landroid/database/Cursor;

    .line 146
    .line 147
    iget v9, v7, Lva/l;->b:I

    .line 148
    .line 149
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-static {v8, v9}, Lva/d;->c(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/HashMap;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-interface {v8}, Landroid/database/Cursor;->isLast()Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-nez v10, :cond_4

    .line 162
    .line 163
    invoke-interface {v8}, Landroid/database/Cursor;->isAfterLast()Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-nez v8, :cond_4

    .line 168
    .line 169
    move v2, v3

    .line 170
    :cond_4
    if-eqz v2, :cond_5

    .line 171
    .line 172
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-interface {v9, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_5
    move-object v3, v4

    .line 180
    check-cast v3, Lwa/a;

    .line 181
    .line 182
    invoke-virtual {v3, v9}, Lwa/a;->a(Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    if-nez v2, :cond_8

    .line 186
    .line 187
    invoke-virtual {v0, v7}, Lva/d;->b(Lva/l;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    :try_start_1
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    new-instance v5, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v8, "Cursor "

    .line 199
    .line 200
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v6, " not found"

    .line 207
    .line 208
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-direct {v3, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    :catchall_0
    move-exception v1

    .line 220
    goto :goto_3

    .line 221
    :catch_0
    move-exception v3

    .line 222
    :try_start_2
    invoke-virtual {v0, v3, v4}, Lva/d;->i(Ljava/lang/Exception;Lm/e;)V

    .line 223
    .line 224
    .line 225
    if-eqz v7, :cond_7

    .line 226
    .line 227
    invoke-virtual {v0, v7}, Lva/d;->b(Lva/l;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_7
    move-object v1, v7

    .line 232
    :goto_1
    if-nez v2, :cond_8

    .line 233
    .line 234
    if-eqz v1, :cond_8

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Lva/d;->b(Lva/l;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    :goto_2
    return-void

    .line 240
    :goto_3
    if-nez v2, :cond_9

    .line 241
    .line 242
    if-eqz v7, :cond_9

    .line 243
    .line 244
    invoke-virtual {v0, v7}, Lva/d;->b(Lva/l;)V

    .line 245
    .line 246
    .line 247
    :cond_9
    throw v1

    .line 248
    :pswitch_2
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 251
    .line 252
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v1, Ljava/lang/Exception;

    .line 255
    .line 256
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    const-string v2, "UNEXPECTED_ERROR"

    .line 261
    .line 262
    const-string v3, "Unexpected error"

    .line 263
    .line 264
    invoke-interface {v0, v2, v3, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_3
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Lpa/g;

    .line 271
    .line 272
    iget-object v3, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v3, Lpa/b;

    .line 275
    .line 276
    iget-object v4, v0, Lpa/g;->f:Landroid/app/Activity;

    .line 277
    .line 278
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v4}, Lb0/f;->p(Landroid/app/Activity;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_a

    .line 286
    .line 287
    iget-object v1, v0, Lpa/g;->o:Landroid/os/Handler;

    .line 288
    .line 289
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object v0, v0, Lpa/g;->p:Lx0/q0;

    .line 293
    .line 294
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    const-wide/16 v2, 0x64

    .line 298
    .line 299
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_a
    invoke-virtual {v3, v2}, Lpa/b;->c(Z)V

    .line 304
    .line 305
    .line 306
    iget-object v2, v3, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 307
    .line 308
    if-eqz v2, :cond_b

    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->d()V

    .line 311
    .line 312
    .line 313
    :cond_b
    iput-object v1, v3, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 314
    .line 315
    iget-object v2, v0, Lpa/g;->o:Landroid/os/Handler;

    .line 316
    .line 317
    if-eqz v2, :cond_c

    .line 318
    .line 319
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iput-object v1, v0, Lpa/g;->o:Landroid/os/Handler;

    .line 323
    .line 324
    :cond_c
    iput-object v1, v0, Lpa/g;->p:Lx0/q0;

    .line 325
    .line 326
    :goto_4
    return-void

    .line 327
    :pswitch_4
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 330
    .line 331
    iget-object v2, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 334
    .line 335
    sget-object v3, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    :try_start_3
    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Laa/o;

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance v4, Landroid/os/Bundle;

    .line 346
    .line 347
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v5, "delete"

    .line 351
    .line 352
    const-string v6, "1"

    .line 353
    .line 354
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    iget-object v5, v3, Laa/o;->a:Lu7/f;

    .line 358
    .line 359
    invoke-static {v5}, Laa/r;->a(Lu7/f;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    const-string v6, "*"

    .line 364
    .line 365
    invoke-virtual {v3, v5, v6, v4}, Laa/o;->c(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v3, v4}, Laa/o;->a(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-static {v3}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Landroid/content/Context;

    .line 377
    .line 378
    invoke-static {v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->e(Landroid/content/Context;)Lcom/google/firebase/messaging/a;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->f()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lu7/f;

    .line 387
    .line 388
    invoke-static {v0}, Laa/r;->a(Lu7/f;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    monitor-enter v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 393
    :try_start_4
    invoke-static {v4, v0}, Lcom/google/firebase/messaging/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    iget-object v4, v3, Lcom/google/firebase/messaging/a;->a:Landroid/content/SharedPreferences;

    .line 398
    .line 399
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-interface {v4, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 404
    .line 405
    .line 406
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 407
    .line 408
    .line 409
    :try_start_5
    monitor-exit v3

    .line 410
    invoke-virtual {v2, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto :goto_5

    .line 414
    :catchall_1
    move-exception v0

    .line 415
    monitor-exit v3

    .line 416
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 417
    :catch_1
    move-exception v0

    .line 418
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 419
    .line 420
    .line 421
    :goto_5
    return-void

    .line 422
    :pswitch_5
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, Laa/k;

    .line 425
    .line 426
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, Landroid/content/Intent;

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Laa/k;->a(Landroid/content/Intent;)V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :pswitch_6
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 437
    .line 438
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 441
    .line 442
    :try_start_6
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :catch_2
    move-exception v1

    .line 451
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 452
    .line 453
    .line 454
    new-instance v0, Ljava/lang/RuntimeException;

    .line 455
    .line 456
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    throw v0

    .line 460
    :pswitch_7
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Li9/n;

    .line 463
    .line 464
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, Ljava/util/List;

    .line 467
    .line 468
    iget-object v3, v0, Li9/n;->b:Li9/f;

    .line 469
    .line 470
    invoke-interface {v3}, Li9/f;->d()Ljava/util/Collection;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    sget-object v4, Lj9/k;->b:Lr5/c;

    .line 475
    .line 476
    iget-object v5, v0, Li9/n;->b:Li9/f;

    .line 477
    .line 478
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    new-instance v6, Li9/l;

    .line 482
    .line 483
    invoke-direct {v6, v5, v2}, Li9/l;-><init>(Ljava/lang/Object;I)V

    .line 484
    .line 485
    .line 486
    iget-object v0, v0, Li9/n;->b:Li9/f;

    .line 487
    .line 488
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    new-instance v5, Li9/m;

    .line 492
    .line 493
    invoke-direct {v5, v0, v2}, Li9/m;-><init>(Ljava/lang/Object;I)V

    .line 494
    .line 495
    .line 496
    sget-object v0, Ln9/o;->a:Lr3/j;

    .line 497
    .line 498
    new-instance v0, Ljava/util/ArrayList;

    .line 499
    .line 500
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 501
    .line 502
    .line 503
    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 504
    .line 505
    .line 506
    new-instance v2, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 509
    .line 510
    .line 511
    invoke-static {v2, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-static {v0, v1, v4, v6, v5}, Ln9/o;->f(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Ln9/d;Ln9/d;)V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :pswitch_8
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v0, Lg9/u;

    .line 529
    .line 530
    iget-object v4, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v4, Le9/e;

    .line 533
    .line 534
    iget-object v5, v0, Lg9/u;->i:Lg9/j0;

    .line 535
    .line 536
    if-eqz v5, :cond_d

    .line 537
    .line 538
    move v5, v3

    .line 539
    goto :goto_6

    .line 540
    :cond_d
    move v5, v2

    .line 541
    :goto_6
    new-array v6, v2, [Ljava/lang/Object;

    .line 542
    .line 543
    const-string v7, "SyncEngine not yet initialized"

    .line 544
    .line 545
    invoke-static {v7, v5, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    new-array v5, v3, [Ljava/lang/Object;

    .line 549
    .line 550
    iget-object v6, v4, Le9/e;->a:Ljava/lang/String;

    .line 551
    .line 552
    aput-object v6, v5, v2

    .line 553
    .line 554
    const-string v6, "FirestoreClient"

    .line 555
    .line 556
    const-string v7, "Credential changed. Current user: %s"

    .line 557
    .line 558
    invoke-static {v3, v6, v7, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    iget-object v0, v0, Lg9/u;->i:Lg9/j0;

    .line 562
    .line 563
    iget-object v5, v0, Lg9/j0;->m:Le9/e;

    .line 564
    .line 565
    invoke-virtual {v5, v4}, Le9/e;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    xor-int/2addr v5, v3

    .line 570
    iput-object v4, v0, Lg9/j0;->m:Le9/e;

    .line 571
    .line 572
    if-eqz v5, :cond_13

    .line 573
    .line 574
    iget-object v5, v0, Lg9/j0;->k:Ljava/util/HashMap;

    .line 575
    .line 576
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    :cond_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v6

    .line 588
    if-eqz v6, :cond_f

    .line 589
    .line 590
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    check-cast v6, Ljava/util/Map$Entry;

    .line 595
    .line 596
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    check-cast v6, Ljava/util/List;

    .line 601
    .line 602
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    if-eqz v7, :cond_e

    .line 611
    .line 612
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    check-cast v7, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 617
    .line 618
    new-instance v8, Lcom/google/firebase/firestore/f;

    .line 619
    .line 620
    sget-object v9, Lcom/google/firebase/firestore/f$a;->c:Lcom/google/firebase/firestore/f$a;

    .line 621
    .line 622
    const-string v10, "\'waitForPendingWrites\' task is cancelled due to User change."

    .line 623
    .line 624
    invoke-direct {v8, v10, v9}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v7, v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 628
    .line 629
    .line 630
    goto :goto_7

    .line 631
    :cond_f
    iget-object v5, v0, Lg9/j0;->k:Ljava/util/HashMap;

    .line 632
    .line 633
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 634
    .line 635
    .line 636
    iget-object v5, v0, Lg9/j0;->a:Li9/n;

    .line 637
    .line 638
    iget-object v6, v5, Li9/n;->c:Li9/a0;

    .line 639
    .line 640
    invoke-interface {v6}, Li9/a0;->k()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    invoke-virtual {v5, v4}, Li9/n;->c(Le9/e;)V

    .line 645
    .line 646
    .line 647
    iget-object v4, v5, Li9/n;->a:Le9/a;

    .line 648
    .line 649
    new-instance v7, Lb/d;

    .line 650
    .line 651
    const/16 v8, 0x10

    .line 652
    .line 653
    invoke-direct {v7, v5, v8}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 654
    .line 655
    .line 656
    const-string v8, "Start IndexManager"

    .line 657
    .line 658
    invoke-virtual {v4, v8, v7}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 659
    .line 660
    .line 661
    iget-object v4, v5, Li9/n;->a:Le9/a;

    .line 662
    .line 663
    new-instance v7, Lb/m;

    .line 664
    .line 665
    const/16 v8, 0xf

    .line 666
    .line 667
    invoke-direct {v7, v5, v8}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 668
    .line 669
    .line 670
    const-string v8, "Start MutationQueue"

    .line 671
    .line 672
    invoke-virtual {v4, v8, v7}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 673
    .line 674
    .line 675
    iget-object v4, v5, Li9/n;->c:Li9/a0;

    .line 676
    .line 677
    invoke-interface {v4}, Li9/a0;->k()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    sget-object v7, Lj9/i;->c:Lt8/e;

    .line 682
    .line 683
    const/4 v8, 0x2

    .line 684
    new-array v8, v8, [Ljava/util/List;

    .line 685
    .line 686
    aput-object v6, v8, v2

    .line 687
    .line 688
    aput-object v4, v8, v3

    .line 689
    .line 690
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    :cond_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 699
    .line 700
    .line 701
    move-result v6

    .line 702
    if-eqz v6, :cond_12

    .line 703
    .line 704
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    check-cast v6, Ljava/util/List;

    .line 709
    .line 710
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    :cond_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v8

    .line 718
    if-eqz v8, :cond_10

    .line 719
    .line 720
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v8

    .line 724
    check-cast v8, Lk9/g;

    .line 725
    .line 726
    iget-object v8, v8, Lk9/g;->d:Ljava/util/List;

    .line 727
    .line 728
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 733
    .line 734
    .line 735
    move-result v9

    .line 736
    if-eqz v9, :cond_11

    .line 737
    .line 738
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    check-cast v9, Lk9/f;

    .line 743
    .line 744
    iget-object v9, v9, Lk9/f;->a:Lj9/i;

    .line 745
    .line 746
    invoke-virtual {v7, v9}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 747
    .line 748
    .line 749
    move-result-object v7

    .line 750
    goto :goto_8

    .line 751
    :cond_12
    iget-object v4, v5, Li9/n;->f:Li9/h;

    .line 752
    .line 753
    invoke-virtual {v4, v7}, Li9/h;->b(Ljava/lang/Iterable;)Lt8/c;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    invoke-virtual {v0, v4, v1}, Lg9/j0;->h(Lt8/c;Lm9/d0;)V

    .line 758
    .line 759
    .line 760
    :cond_13
    iget-object v0, v0, Lg9/j0;->b:Lm9/h0;

    .line 761
    .line 762
    iget-boolean v1, v0, Lm9/h0;->h:Z

    .line 763
    .line 764
    if-eqz v1, :cond_14

    .line 765
    .line 766
    new-array v1, v2, [Ljava/lang/Object;

    .line 767
    .line 768
    const-string v4, "RemoteStore"

    .line 769
    .line 770
    const-string v5, "Restarting streams for new credential."

    .line 771
    .line 772
    invoke-static {v3, v4, v5, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    iput-boolean v2, v0, Lm9/h0;->h:Z

    .line 776
    .line 777
    invoke-virtual {v0}, Lm9/h0;->a()V

    .line 778
    .line 779
    .line 780
    iget-object v1, v0, Lm9/h0;->g:Lm9/b0;

    .line 781
    .line 782
    sget-object v2, Lg9/d0;->a:Lg9/d0;

    .line 783
    .line 784
    invoke-virtual {v1, v2}, Lm9/b0;->c(Lg9/d0;)V

    .line 785
    .line 786
    .line 787
    iget-object v1, v0, Lm9/h0;->j:Lm9/q0;

    .line 788
    .line 789
    invoke-virtual {v1}, Lm9/a;->b()V

    .line 790
    .line 791
    .line 792
    iget-object v1, v0, Lm9/h0;->i:Lm9/p0;

    .line 793
    .line 794
    invoke-virtual {v1}, Lm9/a;->b()V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v0}, Lm9/h0;->b()V

    .line 798
    .line 799
    .line 800
    :cond_14
    return-void

    .line 801
    :pswitch_9
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v0, Lg9/u;

    .line 804
    .line 805
    iget-object v2, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v2, Ld9/l;

    .line 808
    .line 809
    iget-object v0, v0, Lg9/u;->j:Lg9/k;

    .line 810
    .line 811
    iget-object v0, v0, Lg9/k;->c:Ljava/util/HashSet;

    .line 812
    .line 813
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    invoke-interface {v2, v1, v1}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 817
    .line 818
    .line 819
    return-void

    .line 820
    :pswitch_a
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v0, Lg9/u;

    .line 823
    .line 824
    iget-object v4, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 827
    .line 828
    iget-object v0, v0, Lg9/u;->i:Lg9/j0;

    .line 829
    .line 830
    iget-object v5, v0, Lg9/j0;->b:Lm9/h0;

    .line 831
    .line 832
    iget-boolean v5, v5, Lm9/h0;->h:Z

    .line 833
    .line 834
    if-nez v5, :cond_15

    .line 835
    .line 836
    const-string v5, "j0"

    .line 837
    .line 838
    new-array v2, v2, [Ljava/lang/Object;

    .line 839
    .line 840
    const-string v6, "The network is disabled. The task returned by \'awaitPendingWrites()\' will not complete until the network is enabled."

    .line 841
    .line 842
    invoke-static {v3, v5, v6, v2}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    :cond_15
    iget-object v2, v0, Lg9/j0;->a:Li9/n;

    .line 846
    .line 847
    iget-object v2, v2, Li9/n;->c:Li9/a0;

    .line 848
    .line 849
    invoke-interface {v2}, Li9/a0;->g()I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    const/4 v3, -0x1

    .line 854
    if-ne v2, v3, :cond_16

    .line 855
    .line 856
    invoke-virtual {v4, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    goto :goto_9

    .line 860
    :cond_16
    iget-object v1, v0, Lg9/j0;->k:Ljava/util/HashMap;

    .line 861
    .line 862
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 863
    .line 864
    .line 865
    move-result-object v3

    .line 866
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    if-nez v1, :cond_17

    .line 871
    .line 872
    iget-object v1, v0, Lg9/j0;->k:Ljava/util/HashMap;

    .line 873
    .line 874
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object v3

    .line 878
    new-instance v5, Ljava/util/ArrayList;

    .line 879
    .line 880
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    :cond_17
    iget-object v0, v0, Lg9/j0;->k:Ljava/util/HashMap;

    .line 887
    .line 888
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    check-cast v0, Ljava/util/List;

    .line 897
    .line 898
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    :goto_9
    return-void

    .line 902
    :pswitch_b
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v0, Lq8/c;

    .line 905
    .line 906
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    :try_start_7
    iget-object v0, v0, Lq8/c;->h:Lh3/h;

    .line 914
    .line 915
    sget-object v4, Lh3/e;->c:Lh3/e;

    .line 916
    .line 917
    instance-of v5, v0, Lk3/u;

    .line 918
    .line 919
    if-eqz v5, :cond_18

    .line 920
    .line 921
    check-cast v0, Lk3/u;

    .line 922
    .line 923
    iget-object v0, v0, Lk3/u;->a:Lk3/s;

    .line 924
    .line 925
    invoke-virtual {v0, v4}, Lk3/s;->e(Lh3/e;)Lk3/j;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-static {}, Lk3/w;->a()Lk3/w;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    iget-object v2, v2, Lk3/w;->d:Lq3/k;

    .line 934
    .line 935
    invoke-virtual {v2, v0, v3}, Lq3/k;->a(Lk3/s;I)V

    .line 936
    .line 937
    .line 938
    goto :goto_a

    .line 939
    :cond_18
    const-string v4, "ForcedSender"

    .line 940
    .line 941
    const-string v5, "Expected instance of `TransportImpl`, got `%s`."

    .line 942
    .line 943
    invoke-static {v4}, Lo3/a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v4

    .line 947
    const/4 v6, 0x5

    .line 948
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 949
    .line 950
    .line 951
    move-result v6

    .line 952
    if-eqz v6, :cond_19

    .line 953
    .line 954
    new-array v3, v3, [Ljava/lang/Object;

    .line 955
    .line 956
    aput-object v0, v3, v2

    .line 957
    .line 958
    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 963
    .line 964
    .line 965
    :catch_3
    :cond_19
    :goto_a
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 966
    .line 967
    .line 968
    return-void

    .line 969
    :pswitch_c
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v0, Lj8/s;

    .line 972
    .line 973
    iget-object v2, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v2, Ljava/lang/Throwable;

    .line 976
    .line 977
    iget-object v4, v0, Lj8/s;->h:Lj8/n;

    .line 978
    .line 979
    iget-object v5, v0, Lj8/s;->c:Ll/l;

    .line 980
    .line 981
    iget-object v5, v5, Ll/l;->b:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 984
    .line 985
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 986
    .line 987
    .line 988
    move-result v5

    .line 989
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v5

    .line 993
    const-string v6, "com.crashlytics.on-demand.recorded-exceptions"

    .line 994
    .line 995
    invoke-virtual {v4, v6, v5}, Lj8/n;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    iget-object v4, v0, Lj8/s;->h:Lj8/n;

    .line 999
    .line 1000
    iget-object v5, v0, Lj8/s;->c:Ll/l;

    .line 1001
    .line 1002
    iget-object v5, v5, Ll/l;->c:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1005
    .line 1006
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v5

    .line 1014
    const-string v6, "com.crashlytics.on-demand.dropped-exceptions"

    .line 1015
    .line 1016
    invoke-virtual {v4, v6, v5}, Lj8/n;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    iget-object v0, v0, Lj8/s;->h:Lj8/n;

    .line 1020
    .line 1021
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    iget-object v5, v0, Lj8/n;->o:Lr8/h;

    .line 1026
    .line 1027
    if-nez v5, :cond_1a

    .line 1028
    .line 1029
    const-string v0, "FirebaseCrashlytics"

    .line 1030
    .line 1031
    const-string v2, "settingsProvider not set"

    .line 1032
    .line 1033
    invoke-static {v0, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1034
    .line 1035
    .line 1036
    goto :goto_b

    .line 1037
    :cond_1a
    invoke-virtual {v0, v5, v4, v2, v3}, Lj8/n;->g(Lr8/h;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    .line 1038
    .line 1039
    .line 1040
    :goto_b
    return-void

    .line 1041
    :pswitch_d
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v0, Ljava/lang/Runnable;

    .line 1044
    .line 1045
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v1, Le8/g$b;

    .line 1048
    .line 1049
    :try_start_8
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 1050
    .line 1051
    .line 1052
    goto :goto_c

    .line 1053
    :catch_4
    move-exception v0

    .line 1054
    check-cast v1, Le8/g$a;

    .line 1055
    .line 1056
    iget-object v1, v1, Le8/g$a;->a:Le8/g;

    .line 1057
    .line 1058
    invoke-virtual {v1, v0}, Ls/a;->q(Ljava/lang/Throwable;)Z

    .line 1059
    .line 1060
    .line 1061
    :goto_c
    return-void

    .line 1062
    :pswitch_e
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v0, Le8/a;

    .line 1065
    .line 1066
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v1, Ljava/lang/Runnable;

    .line 1069
    .line 1070
    iget v2, v0, Le8/a;->c:I

    .line 1071
    .line 1072
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1073
    .line 1074
    .line 1075
    iget-object v0, v0, Le8/a;->d:Landroid/os/StrictMode$ThreadPolicy;

    .line 1076
    .line 1077
    if-eqz v0, :cond_1b

    .line 1078
    .line 1079
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 1080
    .line 1081
    .line 1082
    :cond_1b
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 1083
    .line 1084
    .line 1085
    return-void

    .line 1086
    :pswitch_f
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v0, Lw5/n$a;

    .line 1089
    .line 1090
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v1, Lz3/e;

    .line 1093
    .line 1094
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    monitor-enter v1

    .line 1098
    monitor-exit v1

    .line 1099
    iget-object v0, v0, Lw5/n$a;->b:Lw5/n;

    .line 1100
    .line 1101
    sget v2, Lv5/e0;->a:I

    .line 1102
    .line 1103
    invoke-interface {v0, v1}, Lw5/n;->a(Lz3/e;)V

    .line 1104
    .line 1105
    .line 1106
    return-void

    .line 1107
    :pswitch_10
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, Lx3/l$a;

    .line 1110
    .line 1111
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v1, Lz3/e;

    .line 1114
    .line 1115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    monitor-enter v1

    .line 1119
    monitor-exit v1

    .line 1120
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 1121
    .line 1122
    sget v2, Lv5/e0;->a:I

    .line 1123
    .line 1124
    invoke-interface {v0, v1}, Lx3/l;->A(Lz3/e;)V

    .line 1125
    .line 1126
    .line 1127
    return-void

    .line 1128
    :pswitch_11
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast v0, Lq2/d;

    .line 1131
    .line 1132
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v1, Lp2/x;

    .line 1135
    .line 1136
    const-string v2, "this$0"

    .line 1137
    .line 1138
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1139
    .line 1140
    .line 1141
    const-string v2, "$token"

    .line 1142
    .line 1143
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    iget-object v0, v0, Lq2/d;->b:Lp2/h0;

    .line 1147
    .line 1148
    const/4 v2, 0x3

    .line 1149
    invoke-interface {v0, v1, v2}, Lp2/h0;->c(Lp2/x;I)V

    .line 1150
    .line 1151
    .line 1152
    return-void

    .line 1153
    :pswitch_12
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v0, Ljava/lang/Runnable;

    .line 1156
    .line 1157
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1158
    .line 1159
    check-cast v1, Lp1/q;

    .line 1160
    .line 1161
    const-string v2, "$command"

    .line 1162
    .line 1163
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    const-string v2, "this$0"

    .line 1167
    .line 1168
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    :try_start_9
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v1}, Lp1/q;->a()V

    .line 1175
    .line 1176
    .line 1177
    return-void

    .line 1178
    :catchall_2
    move-exception v0

    .line 1179
    invoke-virtual {v1}, Lp1/q;->a()V

    .line 1180
    .line 1181
    .line 1182
    throw v0

    .line 1183
    :pswitch_13
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1184
    .line 1185
    check-cast v0, Landroidx/room/MultiInstanceInvalidationClient;

    .line 1186
    .line 1187
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1188
    .line 1189
    check-cast v1, [Ljava/lang/String;

    .line 1190
    .line 1191
    sget v2, Landroidx/room/MultiInstanceInvalidationClient$callback$1;->b:I

    .line 1192
    .line 1193
    const-string v2, "this$0"

    .line 1194
    .line 1195
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    const-string v2, "$tables"

    .line 1199
    .line 1200
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    iget-object v0, v0, Landroidx/room/MultiInstanceInvalidationClient;->b:Lp1/e;

    .line 1204
    .line 1205
    array-length v2, v1

    .line 1206
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    check-cast v1, [Ljava/lang/String;

    .line 1211
    .line 1212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    const-string v2, "tables"

    .line 1216
    .line 1217
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    iget-object v2, v0, Lp1/e;->k:Ln/b;

    .line 1221
    .line 1222
    monitor-enter v2

    .line 1223
    :try_start_a
    iget-object v0, v0, Lp1/e;->k:Ln/b;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Ln/b;->iterator()Ljava/util/Iterator;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    :cond_1c
    :goto_d
    move-object v3, v0

    .line 1230
    check-cast v3, Ln/b$e;

    .line 1231
    .line 1232
    invoke-virtual {v3}, Ln/b$e;->hasNext()Z

    .line 1233
    .line 1234
    .line 1235
    move-result v4

    .line 1236
    if-eqz v4, :cond_1d

    .line 1237
    .line 1238
    invoke-virtual {v3}, Ln/b$e;->next()Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v3

    .line 1242
    check-cast v3, Ljava/util/Map$Entry;

    .line 1243
    .line 1244
    const-string v4, "(observer, wrapper)"

    .line 1245
    .line 1246
    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v4

    .line 1253
    check-cast v4, Lp1/e$c;

    .line 1254
    .line 1255
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v3

    .line 1259
    check-cast v3, Lp1/e$d;

    .line 1260
    .line 1261
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    instance-of v4, v4, Landroidx/room/MultiInstanceInvalidationClient$a;

    .line 1265
    .line 1266
    if-nez v4, :cond_1c

    .line 1267
    .line 1268
    invoke-virtual {v3, v1}, Lp1/e$d;->b([Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    goto :goto_d

    .line 1272
    :cond_1d
    sget-object v0, Lrb/h;->a:Lrb/h;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1273
    .line 1274
    monitor-exit v2

    .line 1275
    return-void

    .line 1276
    :catchall_3
    move-exception v0

    .line 1277
    monitor-exit v2

    .line 1278
    throw v0

    .line 1279
    :pswitch_14
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v0, Ly0/b$c;

    .line 1282
    .line 1283
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1284
    .line 1285
    check-cast v1, Ly0/k;

    .line 1286
    .line 1287
    sget-object v2, Ly0/b;->a:Ly0/b$c;

    .line 1288
    .line 1289
    const-string v2, "$policy"

    .line 1290
    .line 1291
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    const-string v2, "$violation"

    .line 1295
    .line 1296
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    const/4 v0, 0x0

    .line 1303
    throw v0

    .line 1304
    :pswitch_15
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v0, Lx0/r0;

    .line 1307
    .line 1308
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v1, Lx0/r0$b;

    .line 1311
    .line 1312
    const-string v2, "this$0"

    .line 1313
    .line 1314
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    const-string v2, "$operation"

    .line 1318
    .line 1319
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v2, v0, Lx0/r0;->b:Ljava/util/ArrayList;

    .line 1323
    .line 1324
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v2

    .line 1328
    if-eqz v2, :cond_1e

    .line 1329
    .line 1330
    iget v2, v1, Lx0/r0$c;->a:I

    .line 1331
    .line 1332
    iget-object v1, v1, Lx0/r0$c;->c:Lx0/i;

    .line 1333
    .line 1334
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 1335
    .line 1336
    const-string v3, "operation.fragment.mView"

    .line 1337
    .line 1338
    invoke-static {v1, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v0, v0, Lx0/r0;->a:Landroid/view/ViewGroup;

    .line 1342
    .line 1343
    invoke-static {v2, v1, v0}, La0/j;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 1344
    .line 1345
    .line 1346
    :cond_1e
    return-void

    .line 1347
    :goto_e
    iget-object v0, p0, Lx0/q0;->b:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v0, Lvn/hunghd/flutterdownloader/DownloadWorker;

    .line 1350
    .line 1351
    iget-object v1, p0, Lx0/q0;->c:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v1, Ljava/util/List;

    .line 1354
    .line 1355
    iget-object v0, v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->q:Lio/flutter/plugin/common/MethodChannel;

    .line 1356
    .line 1357
    if-eqz v0, :cond_1f

    .line 1358
    .line 1359
    const-string v2, ""

    .line 1360
    .line 1361
    invoke-virtual {v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1362
    .line 1363
    .line 1364
    :cond_1f
    return-void

    .line 1365
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
