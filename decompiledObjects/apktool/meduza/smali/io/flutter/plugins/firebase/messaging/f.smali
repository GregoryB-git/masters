.class public final synthetic Lio/flutter/plugins/firebase/messaging/f;
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

    iput p1, p0, Lio/flutter/plugins/firebase/messaging/f;->a:I

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/firebase/messaging/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lio/flutter/plugins/firebase/messaging/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/f;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ls7/f;

    .line 10
    .line 11
    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/f;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->a(Ls7/f;Ljava/util/concurrent/Callable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/f;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;

    .line 22
    .line 23
    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/f;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->k(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/f;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lvn/hunghd/flutterdownloader/DownloadWorker;

    .line 34
    .line 35
    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/f;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    sget-object v2, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v2, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_0
    sget-object v3, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Lio/flutter/embedding/engine/FlutterEngine;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    const-string v3, "vn.hunghd.downloader.pref"

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v3, "getSharedPreferences(...)"

    .line 59
    .line 60
    invoke-static {v1, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v3, "callback_dispatcher_handle_key"

    .line 64
    .line 65
    const-wide/16 v5, 0x0

    .line 66
    .line 67
    invoke-interface {v1, v3, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngine;

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    invoke-direct {v1, v3, v7, v4}, Lio/flutter/embedding/engine/FlutterEngine;-><init>(Landroid/content/Context;[Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Lio/flutter/embedding/engine/FlutterEngine;

    .line 80
    .line 81
    invoke-static {v5, v6}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_0

    .line 86
    .line 87
    const-string v1, "Fatal: failed to find callback"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    monitor-exit v2

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    :try_start_1
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, Lio/flutter/embedding/engine/loader/FlutterLoader;->findAppBundlePath()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v4, "findAppBundlePath(...)"

    .line 107
    .line 108
    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    sget-object v5, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Lio/flutter/embedding/engine/FlutterEngine;

    .line 118
    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    invoke-virtual {v5}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_1

    .line 126
    .line 127
    new-instance v6, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;

    .line 128
    .line 129
    invoke-direct {v6, v4, v3, v1}, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v6}, Lio/flutter/embedding/engine/dart/DartExecutor;->executeDartCallback(Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;)V

    .line 133
    .line 134
    .line 135
    :cond_1
    sget-object v1, Lrb/h;->a:Lrb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    monitor-exit v2

    .line 138
    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    .line 139
    .line 140
    sget-object v2, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Lio/flutter/embedding/engine/FlutterEngine;

    .line 141
    .line 142
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v3, "vn.hunghd/downloader_background"

    .line 150
    .line 151
    invoke-direct {v1, v2, v3}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iput-object v1, v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->q:Lio/flutter/plugin/common/MethodChannel;

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-void

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    monitor-exit v2

    .line 162
    throw v0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
