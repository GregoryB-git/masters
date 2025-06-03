.class public final Laa/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Landroid/content/Context;

.field public final c:Laa/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Laa/s;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Laa/g;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Laa/g;->b:Landroid/content/Context;

    iput-object p2, p0, Laa/g;->c:Laa/s;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 11

    .line 1
    iget-object v0, p0, Laa/g;->c:Laa/s;

    .line 2
    .line 3
    const-string v1, "gcm.n.noui"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Laa/s;->a(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Laa/g;->b:Landroid/content/Context;

    .line 14
    .line 15
    const-string v2, "keyguard"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/app/KeyguardManager;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v3, p0, Laa/g;->b:Landroid/content/Context;

    .line 36
    .line 37
    const-string v4, "activity"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroid/app/ActivityManager;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 66
    .line 67
    iget v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 68
    .line 69
    if-ne v5, v0, :cond_2

    .line 70
    .line 71
    iget v0, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 72
    .line 73
    const/16 v3, 0x64

    .line 74
    .line 75
    if-ne v0, v3, :cond_3

    .line 76
    .line 77
    move v0, v1

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    :goto_0
    move v0, v2

    .line 80
    :goto_1
    if-eqz v0, :cond_4

    .line 81
    .line 82
    return v2

    .line 83
    :cond_4
    iget-object v0, p0, Laa/g;->c:Laa/s;

    .line 84
    .line 85
    const-string v3, "gcm.n.image"

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/4 v4, 0x0

    .line 96
    const-string v5, "FirebaseMessaging"

    .line 97
    .line 98
    if-eqz v3, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    :try_start_0
    new-instance v3, Laa/p;

    .line 102
    .line 103
    new-instance v6, Ljava/net/URL;

    .line 104
    .line 105
    invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v3, v6}, Laa/p;-><init>(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v6, "Not downloading image, bad URL: "

    .line 118
    .line 119
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    :goto_2
    move-object v3, v4

    .line 133
    :goto_3
    if-eqz v3, :cond_6

    .line 134
    .line 135
    iget-object v0, p0, Laa/g;->a:Ljava/util/concurrent/ExecutorService;

    .line 136
    .line 137
    new-instance v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 138
    .line 139
    invoke-direct {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v7, Lg/q;

    .line 143
    .line 144
    const/16 v8, 0x17

    .line 145
    .line 146
    invoke-direct {v7, v8, v3, v6}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iput-object v0, v3, Laa/p;->b:Ljava/util/concurrent/Future;

    .line 154
    .line 155
    invoke-virtual {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iput-object v0, v3, Laa/p;->c:Lcom/google/android/gms/tasks/Task;

    .line 160
    .line 161
    :cond_6
    iget-object v0, p0, Laa/g;->b:Landroid/content/Context;

    .line 162
    .line 163
    iget-object v6, p0, Laa/g;->c:Laa/s;

    .line 164
    .line 165
    invoke-static {v0, v6}, Laa/e;->a(Landroid/content/Context;Laa/s;)Laa/e$a;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v6, v0, Laa/e$a;->a:Lu/q;

    .line 170
    .line 171
    if-nez v3, :cond_7

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_7
    :try_start_1
    iget-object v7, v3, Laa/p;->c:Lcom/google/android/gms/tasks/Task;

    .line 175
    .line 176
    invoke-static {v7}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    const-wide/16 v8, 0x5

    .line 180
    .line 181
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 182
    .line 183
    invoke-static {v7, v8, v9, v10}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Landroid/graphics/Bitmap;

    .line 188
    .line 189
    invoke-virtual {v6, v7}, Lu/q;->e(Landroid/graphics/Bitmap;)V

    .line 190
    .line 191
    .line 192
    new-instance v8, Lu/o;

    .line 193
    .line 194
    invoke-direct {v8}, Lu/o;-><init>()V

    .line 195
    .line 196
    .line 197
    if-nez v7, :cond_8

    .line 198
    .line 199
    move-object v9, v4

    .line 200
    goto :goto_4

    .line 201
    :cond_8
    new-instance v9, Landroidx/core/graphics/drawable/IconCompat;

    .line 202
    .line 203
    invoke-direct {v9, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 204
    .line 205
    .line 206
    iput-object v7, v9, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 207
    .line 208
    :goto_4
    iput-object v9, v8, Lu/o;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 209
    .line 210
    iput-object v4, v8, Lu/o;->c:Landroidx/core/graphics/drawable/IconCompat;

    .line 211
    .line 212
    iput-boolean v1, v8, Lu/o;->d:Z

    .line 213
    .line 214
    invoke-virtual {v6, v8}, Lu/q;->g(Lu/s;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :catch_1
    const-string v4, "Failed to download image in time, showing notification without it"

    .line 219
    .line 220
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Laa/p;->close()V

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :catch_2
    const-string v4, "Interrupted while downloading image, showing notification without it"

    .line 228
    .line 229
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, Laa/p;->close()V

    .line 233
    .line 234
    .line 235
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :catch_3
    move-exception v3

    .line 244
    const-string v4, "Failed to download image: "

    .line 245
    .line 246
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :goto_5
    const/4 v3, 0x3

    .line 265
    invoke-static {v5, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_9

    .line 270
    .line 271
    const-string v3, "Showing notification"

    .line 272
    .line 273
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    :cond_9
    iget-object v3, p0, Laa/g;->b:Landroid/content/Context;

    .line 277
    .line 278
    const-string v4, "notification"

    .line 279
    .line 280
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Landroid/app/NotificationManager;

    .line 285
    .line 286
    iget-object v4, v0, Laa/e$a;->b:Ljava/lang/String;

    .line 287
    .line 288
    iget-object v0, v0, Laa/e$a;->a:Lu/q;

    .line 289
    .line 290
    invoke-virtual {v0}, Lu/q;->a()Landroid/app/Notification;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v3, v4, v2, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 295
    .line 296
    .line 297
    return v1
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
.end method
