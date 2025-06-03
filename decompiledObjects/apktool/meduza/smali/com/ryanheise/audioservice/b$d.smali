.class public final Lcom/ryanheise/audioservice/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/app/Activity;

.field public final c:Lio/flutter/plugin/common/BinaryMessenger;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ryanheise/audioservice/b$d;->c:Lio/flutter/plugin/common/BinaryMessenger;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "com.ryanheise.audio_service.client.methods"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method


# virtual methods
.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 9

    .line 1
    const-string v0, "artDownscaleHeight"

    .line 2
    .line 3
    const-string v1, "artDownscaleWidth"

    .line 4
    .line 5
    const-string v2, "notificationColor"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    iget-boolean v4, p0, Lcom/ryanheise/audioservice/b$d;->d:Z

    .line 9
    .line 10
    if-nez v4, :cond_10

    .line 11
    .line 12
    iget-object v4, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const v6, -0x2ff29d1a

    .line 19
    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, -0x1

    .line 23
    if-eq v5, v6, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v5, "configure"

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v4, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move v4, v8

    .line 37
    :goto_1
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :cond_2
    iget-boolean v4, p0, Lcom/ryanheise/audioservice/b$d;->e:Z

    .line 42
    .line 43
    if-nez v4, :cond_f

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    sput-boolean v4, Lcom/ryanheise/audioservice/b;->t:Z

    .line 47
    .line 48
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/util/Map;

    .line 51
    .line 52
    const-string v4, "config"

    .line 53
    .line 54
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/util/Map;

    .line 59
    .line 60
    new-instance v4, Lta/a;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-direct {v4, v5}, Lta/a;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    const-string v5, "androidNotificationClickStartsActivity"

    .line 72
    .line 73
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    iput-boolean v5, v4, Lta/a;->i:Z

    .line 84
    .line 85
    const-string v5, "androidNotificationOngoing"

    .line 86
    .line 87
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iput-boolean v5, v4, Lta/a;->j:Z

    .line 98
    .line 99
    const-string v5, "androidResumeOnClick"

    .line 100
    .line 101
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    iput-boolean v5, v4, Lta/a;->b:Z

    .line 112
    .line 113
    const-string v5, "androidNotificationChannelId"

    .line 114
    .line 115
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Ljava/lang/String;

    .line 120
    .line 121
    iput-object v5, v4, Lta/a;->c:Ljava/lang/String;

    .line 122
    .line 123
    const-string v5, "androidNotificationChannelName"

    .line 124
    .line 125
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Ljava/lang/String;

    .line 130
    .line 131
    iput-object v5, v4, Lta/a;->d:Ljava/lang/String;

    .line 132
    .line 133
    const-string v5, "androidNotificationChannelDescription"

    .line 134
    .line 135
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Ljava/lang/String;

    .line 140
    .line 141
    iput-object v5, v4, Lta/a;->e:Ljava/lang/String;

    .line 142
    .line 143
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    if-nez v5, :cond_3

    .line 148
    .line 149
    move v2, v8

    .line 150
    goto :goto_4

    .line 151
    :cond_3
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-eqz v2, :cond_5

    .line 156
    .line 157
    instance-of v5, v2, Ljava/lang/Integer;

    .line 158
    .line 159
    if-eqz v5, :cond_4

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    check-cast v2, Ljava/lang/Long;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    long-to-int v2, v5

    .line 169
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    goto :goto_3

    .line 174
    :cond_5
    :goto_2
    check-cast v2, Ljava/lang/Integer;

    .line 175
    .line 176
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    :goto_4
    iput v2, v4, Lta/a;->f:I

    .line 181
    .line 182
    const-string v2, "androidNotificationIcon"

    .line 183
    .line 184
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Ljava/lang/String;

    .line 189
    .line 190
    iput-object v2, v4, Lta/a;->g:Ljava/lang/String;

    .line 191
    .line 192
    const-string v2, "androidShowNotificationBadge"

    .line 193
    .line 194
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    iput-boolean v2, v4, Lta/a;->h:Z

    .line 205
    .line 206
    const-string v2, "androidStopForegroundOnPause"

    .line 207
    .line 208
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    iput-boolean v2, v4, Lta/a;->k:Z

    .line 219
    .line 220
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-eqz v2, :cond_6

    .line 225
    .line 226
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    goto :goto_5

    .line 237
    :cond_6
    move v1, v8

    .line 238
    :goto_5
    iput v1, v4, Lta/a;->l:I

    .line 239
    .line 240
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-eqz v1, :cond_7

    .line 245
    .line 246
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/lang/Integer;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    :cond_7
    iput v8, v4, Lta/a;->m:I

    .line 257
    .line 258
    const-string v0, "androidBrowsableRootExtras"

    .line 259
    .line 260
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    check-cast p1, Ljava/util/Map;

    .line 265
    .line 266
    if-eqz p1, :cond_8

    .line 267
    .line 268
    new-instance v0, Lorg/json/JSONObject;

    .line 269
    .line 270
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    goto :goto_6

    .line 278
    :cond_8
    move-object p1, v3

    .line 279
    :goto_6
    iput-object p1, v4, Lta/a;->o:Ljava/lang/String;

    .line 280
    .line 281
    iget-object p1, p0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 282
    .line 283
    if-eqz p1, :cond_9

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iput-object p1, v4, Lta/a;->n:Ljava/lang/String;

    .line 294
    .line 295
    :cond_9
    invoke-virtual {v4}, Lta/a;->a()V

    .line 296
    .line 297
    .line 298
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->F:Lcom/ryanheise/audioservice/AudioService;

    .line 299
    .line 300
    if-eqz p1, :cond_a

    .line 301
    .line 302
    invoke-virtual {p1, v4}, Lcom/ryanheise/audioservice/AudioService;->j(Lta/a;)V

    .line 303
    .line 304
    .line 305
    :cond_a
    sput-object p0, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 306
    .line 307
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 308
    .line 309
    if-nez p1, :cond_b

    .line 310
    .line 311
    new-instance p1, Lcom/ryanheise/audioservice/b$c;

    .line 312
    .line 313
    iget-object v0, p0, Lcom/ryanheise/audioservice/b$d;->c:Lio/flutter/plugin/common/BinaryMessenger;

    .line 314
    .line 315
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/b$c;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 316
    .line 317
    .line 318
    sput-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 319
    .line 320
    sput-object p1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_b
    iget-object v0, p1, Lcom/ryanheise/audioservice/b$c;->a:Lio/flutter/plugin/common/BinaryMessenger;

    .line 324
    .line 325
    iget-object v1, p0, Lcom/ryanheise/audioservice/b$d;->c:Lio/flutter/plugin/common/BinaryMessenger;

    .line 326
    .line 327
    if-eq v0, v1, :cond_c

    .line 328
    .line 329
    iget-object v0, p1, Lcom/ryanheise/audioservice/b$c;->b:Lio/flutter/plugin/common/MethodChannel;

    .line 330
    .line 331
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 332
    .line 333
    .line 334
    iput-object v1, p1, Lcom/ryanheise/audioservice/b$c;->a:Lio/flutter/plugin/common/BinaryMessenger;

    .line 335
    .line 336
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    .line 337
    .line 338
    const-string v2, "com.ryanheise.audio_service.handler.methods"

    .line 339
    .line 340
    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iput-object v0, p1, Lcom/ryanheise/audioservice/b$c;->b:Lio/flutter/plugin/common/MethodChannel;

    .line 344
    .line 345
    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 346
    .line 347
    .line 348
    :cond_c
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 349
    .line 350
    iget-object v0, p1, Lcom/ryanheise/audioservice/b$c;->e:Ljava/util/LinkedList;

    .line 351
    .line 352
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_d

    .line 361
    .line 362
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, Lcom/ryanheise/audioservice/b$e;

    .line 367
    .line 368
    iget-object v2, p1, Lcom/ryanheise/audioservice/b$c;->b:Lio/flutter/plugin/common/MethodChannel;

    .line 369
    .line 370
    iget-object v4, v1, Lcom/ryanheise/audioservice/b$e;->a:Ljava/lang/String;

    .line 371
    .line 372
    iget-object v5, v1, Lcom/ryanheise/audioservice/b$e;->b:Ljava/lang/Object;

    .line 373
    .line 374
    iget-object v1, v1, Lcom/ryanheise/audioservice/b$e;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 375
    .line 376
    invoke-virtual {v2, v4, v5, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 377
    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_d
    iget-object p1, p1, Lcom/ryanheise/audioservice/b$c;->e:Ljava/util/LinkedList;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 383
    .line 384
    .line 385
    :goto_8
    sget-object p1, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 386
    .line 387
    if-eqz p1, :cond_e

    .line 388
    .line 389
    new-array p1, v7, [Ljava/lang/Object;

    .line 390
    .line 391
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_e
    sput-object p2, Lcom/ryanheise/audioservice/b;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    const-string v0, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    .line 405
    .line 406
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw p1

    .line 410
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 411
    .line 412
    const-string v0, "The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions."

    .line 413
    .line 414
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    :catch_0
    move-exception p1

    .line 419
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-interface {p2, p1, v3, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :goto_9
    return-void
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
