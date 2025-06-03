.class public final Lg1/c$n;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "n"
.end annotation


# instance fields
.field public final a:Lg1/c$k;


# direct methods
.method public constructor <init>(Lg1/c;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lg1/c$k;

    invoke-direct {v0, p1}, Lg1/c$k;-><init>(Lg1/c;)V

    iput-object v0, p0, Lg1/c$n;->a:Lg1/c$k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, v1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const-string v4, "data_callback_token"

    .line 12
    .line 13
    const-string v5, "data_calling_uid"

    .line 14
    .line 15
    const-string v6, "data_calling_pid"

    .line 16
    .line 17
    const-string v7, "data_package_name"

    .line 18
    .line 19
    const-string v8, "data_root_hints"

    .line 20
    .line 21
    const-string v9, "data_result_receiver"

    .line 22
    .line 23
    const-string v10, "data_media_item_id"

    .line 24
    .line 25
    packed-switch v3, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "Unhandled message: "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "\n  Service version: "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, "\n  Client version: "

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, v1, Landroid/os/Message;->arg1:I

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "MBServiceCompat"

    .line 65
    .line 66
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :pswitch_0
    const-string v3, "data_custom_action_extras"

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    invoke-static {v14}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    iget-object v11, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 81
    .line 82
    const-string v3, "data_custom_action"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    move-object v15, v2

    .line 93
    check-cast v15, Landroid/support/v4/os/a;

    .line 94
    .line 95
    new-instance v12, Lg1/c$m;

    .line 96
    .line 97
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 98
    .line 99
    invoke-direct {v12, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_7

    .line 110
    .line 111
    if-nez v15, :cond_0

    .line 112
    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_0
    iget-object v1, v11, Lg1/c$k;->a:Lg1/c;

    .line 116
    .line 117
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 118
    .line 119
    new-instance v2, Lg1/s;

    .line 120
    .line 121
    move-object v10, v2

    .line 122
    invoke-direct/range {v10 .. v15}, Lg1/s;-><init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/a;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_1
    const-string v3, "data_search_extras"

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    invoke-static {v14}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 137
    .line 138
    .line 139
    iget-object v11, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 140
    .line 141
    const-string v3, "data_search_query"

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    move-object v15, v2

    .line 152
    check-cast v15, Landroid/support/v4/os/a;

    .line 153
    .line 154
    new-instance v12, Lg1/c$m;

    .line 155
    .line 156
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 157
    .line 158
    invoke-direct {v12, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-nez v1, :cond_7

    .line 169
    .line 170
    if-nez v15, :cond_1

    .line 171
    .line 172
    goto/16 :goto_2

    .line 173
    .line 174
    :cond_1
    iget-object v1, v11, Lg1/c$k;->a:Lg1/c;

    .line 175
    .line 176
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 177
    .line 178
    new-instance v2, Lg1/r;

    .line 179
    .line 180
    move-object v10, v2

    .line 181
    invoke-direct/range {v10 .. v15}, Lg1/r;-><init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/a;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :pswitch_2
    iget-object v2, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 190
    .line 191
    new-instance v3, Lg1/c$m;

    .line 192
    .line 193
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 194
    .line 195
    invoke-direct {v3, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 196
    .line 197
    .line 198
    iget-object v1, v2, Lg1/c$k;->a:Lg1/c;

    .line 199
    .line 200
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 201
    .line 202
    new-instance v4, Lg1/q;

    .line 203
    .line 204
    invoke-direct {v4, v2, v3}, Lg1/q;-><init>(Lg1/c$k;Lg1/c$m;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v4}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_2

    .line 211
    .line 212
    :pswitch_3
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-static {v8}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 217
    .line 218
    .line 219
    iget-object v9, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 220
    .line 221
    new-instance v10, Lg1/c$m;

    .line 222
    .line 223
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 224
    .line 225
    invoke-direct {v10, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    iget-object v1, v9, Lg1/c$k;->a:Lg1/c;

    .line 241
    .line 242
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 243
    .line 244
    new-instance v2, Lg1/p;

    .line 245
    .line 246
    move-object v5, v2

    .line 247
    invoke-direct/range {v5 .. v11}, Lg1/p;-><init>(IILandroid/os/Bundle;Lg1/c$k;Lg1/c$m;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :pswitch_4
    iget-object v3, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 256
    .line 257
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Landroid/support/v4/os/a;

    .line 266
    .line 267
    new-instance v5, Lg1/c$m;

    .line 268
    .line 269
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 270
    .line 271
    invoke-direct {v5, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-nez v1, :cond_7

    .line 282
    .line 283
    if-nez v2, :cond_2

    .line 284
    .line 285
    goto/16 :goto_2

    .line 286
    .line 287
    :cond_2
    iget-object v1, v3, Lg1/c$k;->a:Lg1/c;

    .line 288
    .line 289
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 290
    .line 291
    new-instance v6, Lg1/o;

    .line 292
    .line 293
    invoke-direct {v6, v3, v5, v4, v2}, Lg1/o;-><init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/support/v4/os/a;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v6}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :pswitch_5
    iget-object v3, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 302
    .line 303
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v4, Lg1/c$m;

    .line 312
    .line 313
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 314
    .line 315
    invoke-direct {v4, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 316
    .line 317
    .line 318
    iget-object v1, v3, Lg1/c$k;->a:Lg1/c;

    .line 319
    .line 320
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 321
    .line 322
    new-instance v6, Lg1/n;

    .line 323
    .line 324
    invoke-direct {v6, v3, v4, v5, v2}, Lg1/n;-><init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v6}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :pswitch_6
    const-string v3, "data_options"

    .line 333
    .line 334
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 335
    .line 336
    .line 337
    move-result-object v16

    .line 338
    invoke-static/range {v16 .. v16}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 339
    .line 340
    .line 341
    iget-object v12, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 342
    .line 343
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 348
    .line 349
    .line 350
    move-result-object v15

    .line 351
    new-instance v13, Lg1/c$m;

    .line 352
    .line 353
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 354
    .line 355
    invoke-direct {v13, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 356
    .line 357
    .line 358
    iget-object v1, v12, Lg1/c$k;->a:Lg1/c;

    .line 359
    .line 360
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 361
    .line 362
    new-instance v2, Lg1/m;

    .line 363
    .line 364
    move-object v11, v2

    .line 365
    invoke-direct/range {v11 .. v16}, Lg1/m;-><init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v2}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_2

    .line 372
    .line 373
    :pswitch_7
    iget-object v2, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 374
    .line 375
    new-instance v3, Lg1/c$m;

    .line 376
    .line 377
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 378
    .line 379
    invoke-direct {v3, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 380
    .line 381
    .line 382
    iget-object v1, v2, Lg1/c$k;->a:Lg1/c;

    .line 383
    .line 384
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 385
    .line 386
    new-instance v4, Lg1/l;

    .line 387
    .line 388
    invoke-direct {v4, v2, v3}, Lg1/l;-><init>(Lg1/c$k;Lg1/c$m;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v4}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_2

    .line 395
    .line 396
    :pswitch_8
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    invoke-static {v8}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 401
    .line 402
    .line 403
    iget-object v9, v0, Lg1/c$n;->a:Lg1/c$k;

    .line 404
    .line 405
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    new-instance v10, Lg1/c$m;

    .line 418
    .line 419
    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 420
    .line 421
    invoke-direct {v10, v1}, Lg1/c$m;-><init>(Landroid/os/Messenger;)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v9, Lg1/c$k;->a:Lg1/c;

    .line 425
    .line 426
    const/4 v2, 0x0

    .line 427
    if-nez v11, :cond_3

    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    goto :goto_1

    .line 433
    :cond_3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1, v7}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    array-length v3, v1

    .line 442
    move v4, v2

    .line 443
    :goto_0
    if-ge v4, v3, :cond_5

    .line 444
    .line 445
    aget-object v5, v1, v4

    .line 446
    .line 447
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_4

    .line 452
    .line 453
    const/4 v2, 0x1

    .line 454
    goto :goto_1

    .line 455
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 456
    .line 457
    goto :goto_0

    .line 458
    :cond_5
    :goto_1
    if-eqz v2, :cond_6

    .line 459
    .line 460
    iget-object v1, v9, Lg1/c$k;->a:Lg1/c;

    .line 461
    .line 462
    iget-object v1, v1, Lg1/c;->e:Lg1/c$n;

    .line 463
    .line 464
    new-instance v2, Lg1/k;

    .line 465
    .line 466
    move-object v5, v2

    .line 467
    invoke-direct/range {v5 .. v11}, Lg1/k;-><init>(IILandroid/os/Bundle;Lg1/c$k;Lg1/c$m;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v2}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 471
    .line 472
    .line 473
    goto :goto_2

    .line 474
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 475
    .line 476
    new-instance v2, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 479
    .line 480
    .line 481
    const-string v3, "Package/uid mismatch: uid="

    .line 482
    .line 483
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    const-string v3, " package="

    .line 490
    .line 491
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v1

    .line 505
    :cond_7
    :goto_2
    return-void

    .line 506
    nop

    .line 507
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final sendMessageAtTime(Landroid/os/Message;J)Z
    .locals 3

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Landroid/support/v4/media/MediaBrowserCompat;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const-string v2, "data_calling_uid"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    const-string v2, "data_calling_pid"

    if-lez v1, :cond_0

    :goto_0
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    move-result p1

    return p1
.end method
