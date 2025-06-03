.class public LD5/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LD5/o;


# direct methods
.method public constructor <init>(LD5/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/o$a;->a:LD5/o;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 5

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 4
    .line 5
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p1, LE5/j;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Received \'"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, "\' message."

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "PlatformChannel"

    .line 39
    .line 40
    invoke-static {v3, v2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sparse-switch v3, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :sswitch_0
    const-string v3, "SystemChrome.setPreferredOrientations"

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :catch_0
    move-exception p1

    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :sswitch_1
    const-string v3, "SystemChrome.setEnabledSystemUIOverlays"

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    const/4 v1, 0x4

    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :sswitch_2
    const-string v3, "Clipboard.getData"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    const/16 v1, 0xb

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :sswitch_3
    const-string v3, "SystemChrome.setSystemUIOverlayStyle"

    .line 91
    .line 92
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    const/16 v1, 0x8

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :sswitch_4
    const-string v3, "SystemChrome.setEnabledSystemUIMode"

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    const/4 v1, 0x5

    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :sswitch_5
    const-string v3, "Clipboard.hasStrings"

    .line 114
    .line 115
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_1

    .line 120
    .line 121
    const/16 v1, 0xd

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :sswitch_6
    const-string v3, "SystemChrome.restoreSystemUIOverlays"

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    const/4 v1, 0x7

    .line 133
    goto :goto_1

    .line 134
    :sswitch_7
    const-string v3, "SystemSound.play"

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_1

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    goto :goto_1

    .line 144
    :sswitch_8
    const-string v3, "HapticFeedback.vibrate"

    .line 145
    .line 146
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_1

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    goto :goto_1

    .line 154
    :sswitch_9
    const-string v3, "SystemChrome.setApplicationSwitcherDescription"

    .line 155
    .line 156
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_1

    .line 161
    .line 162
    const/4 v1, 0x3

    .line 163
    goto :goto_1

    .line 164
    :sswitch_a
    const-string v3, "SystemChrome.setSystemUIChangeListener"

    .line 165
    .line 166
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_1

    .line 171
    .line 172
    const/4 v1, 0x6

    .line 173
    goto :goto_1

    .line 174
    :sswitch_b
    const-string v3, "Clipboard.setData"

    .line 175
    .line 176
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_1

    .line 181
    .line 182
    const/16 v1, 0xc

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :sswitch_c
    const-string v3, "SystemNavigator.pop"

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_1

    .line 192
    .line 193
    const/16 v1, 0xa

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :sswitch_d
    const-string v3, "Share.invoke"

    .line 197
    .line 198
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_1

    .line 203
    .line 204
    const/16 v1, 0xe

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :sswitch_e
    const-string v3, "SystemNavigator.setFrameworkHandlesBack"

    .line 208
    .line 209
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    if-eqz v1, :cond_1

    .line 214
    .line 215
    const/16 v1, 0x9

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_1
    :goto_0
    const/4 v1, -0x1

    .line 219
    :goto_1
    const-string v3, "text"

    .line 220
    .line 221
    packed-switch v1, :pswitch_data_0

    .line 222
    .line 223
    .line 224
    :try_start_1
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_b

    .line 228
    .line 229
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 230
    .line 231
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 232
    .line 233
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-interface {v1, p1}, LD5/o$h;->q(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :cond_2
    :goto_2
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_b

    .line 244
    .line 245
    :pswitch_1
    iget-object p1, p0, LD5/o$a;->a:LD5/o;

    .line 246
    .line 247
    invoke-static {p1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-interface {p1}, LD5/o$h;->r()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    new-instance v1, Lorg/json/JSONObject;

    .line 256
    .line 257
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 258
    .line 259
    .line 260
    const-string v3, "value"

    .line 261
    .line 262
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 263
    .line 264
    .line 265
    :goto_3
    invoke-interface {p2, v1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_b

    .line 269
    .line 270
    :pswitch_2
    check-cast p1, Lorg/json/JSONObject;

    .line 271
    .line 272
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 277
    .line 278
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-interface {v1, p1}, LD5/o$h;->l(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :pswitch_3
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 287
    .line 288
    if-eqz p1, :cond_3

    .line 289
    .line 290
    :try_start_2
    invoke-static {p1}, LD5/o$e;->e(Ljava/lang/String;)LD5/o$e;

    .line 291
    .line 292
    .line 293
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 294
    goto :goto_4

    .line 295
    :catch_1
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string v4, "No such clipboard content format: "

    .line 301
    .line 302
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-interface {p2, v0, p1, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_3
    move-object p1, v2

    .line 316
    :goto_4
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 317
    .line 318
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-interface {v1, p1}, LD5/o$h;->o(LD5/o$e;)Ljava/lang/CharSequence;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    if-eqz p1, :cond_2

    .line 327
    .line 328
    new-instance v1, Lorg/json/JSONObject;

    .line 329
    .line 330
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :pswitch_4
    iget-object p1, p0, LD5/o$a;->a:LD5/o;

    .line 338
    .line 339
    invoke-static {p1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-interface {p1}, LD5/o$h;->a()V

    .line 344
    .line 345
    .line 346
    goto :goto_2

    .line 347
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 354
    .line 355
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-interface {v1, p1}, LD5/o$h;->f(Z)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 360
    .line 361
    .line 362
    goto :goto_2

    .line 363
    :pswitch_6
    :try_start_4
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 364
    .line 365
    check-cast p1, Lorg/json/JSONObject;

    .line 366
    .line 367
    invoke-static {v1, p1}, LD5/o;->f(LD5/o;Lorg/json/JSONObject;)LD5/o$j;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 372
    .line 373
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-interface {v1, p1}, LD5/o$h;->s(LD5/o$j;)V

    .line 378
    .line 379
    .line 380
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    .line 381
    .line 382
    .line 383
    goto/16 :goto_b

    .line 384
    .line 385
    :catch_2
    move-exception p1

    .line 386
    goto :goto_5

    .line 387
    :catch_3
    move-exception p1

    .line 388
    :goto_5
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    :goto_6
    invoke-interface {p2, v0, p1, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_b

    .line 396
    .line 397
    :pswitch_7
    iget-object p1, p0, LD5/o$a;->a:LD5/o;

    .line 398
    .line 399
    invoke-static {p1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-interface {p1}, LD5/o$h;->k()V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_2

    .line 407
    .line 408
    :pswitch_8
    iget-object p1, p0, LD5/o$a;->a:LD5/o;

    .line 409
    .line 410
    invoke-static {p1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-interface {p1}, LD5/o$h;->j()V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 415
    .line 416
    .line 417
    goto/16 :goto_2

    .line 418
    .line 419
    :pswitch_9
    :try_start_6
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 420
    .line 421
    check-cast p1, Ljava/lang/String;

    .line 422
    .line 423
    invoke-static {v1, p1}, LD5/o;->e(LD5/o;Ljava/lang/String;)LD5/o$k;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 428
    .line 429
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-interface {v1, p1}, LD5/o$h;->g(LD5/o$k;)V

    .line 434
    .line 435
    .line 436
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_4

    .line 437
    .line 438
    .line 439
    goto/16 :goto_b

    .line 440
    .line 441
    :catch_4
    move-exception p1

    .line 442
    goto :goto_7

    .line 443
    :catch_5
    move-exception p1

    .line 444
    :goto_7
    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 448
    goto :goto_6

    .line 449
    :pswitch_a
    :try_start_8
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 450
    .line 451
    check-cast p1, Lorg/json/JSONArray;

    .line 452
    .line 453
    invoke-static {v1, p1}, LD5/o;->d(LD5/o;Lorg/json/JSONArray;)Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 458
    .line 459
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-interface {v1, p1}, LD5/o$h;->h(Ljava/util/List;)V

    .line 464
    .line 465
    .line 466
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_6

    .line 467
    .line 468
    .line 469
    goto/16 :goto_b

    .line 470
    .line 471
    :catch_6
    move-exception p1

    .line 472
    goto :goto_8

    .line 473
    :catch_7
    move-exception p1

    .line 474
    :goto_8
    :try_start_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p1
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 478
    goto :goto_6

    .line 479
    :pswitch_b
    :try_start_a
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 480
    .line 481
    check-cast p1, Lorg/json/JSONObject;

    .line 482
    .line 483
    invoke-static {v1, p1}, LD5/o;->c(LD5/o;Lorg/json/JSONObject;)LD5/o$c;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 488
    .line 489
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-interface {v1, p1}, LD5/o$h;->m(LD5/o$c;)V

    .line 494
    .line 495
    .line 496
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_8

    .line 497
    .line 498
    .line 499
    goto/16 :goto_b

    .line 500
    .line 501
    :catch_8
    move-exception p1

    .line 502
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p1
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 506
    goto :goto_6

    .line 507
    :pswitch_c
    :try_start_c
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 508
    .line 509
    check-cast p1, Lorg/json/JSONArray;

    .line 510
    .line 511
    invoke-static {v1, p1}, LD5/o;->b(LD5/o;Lorg/json/JSONArray;)I

    .line 512
    .line 513
    .line 514
    move-result p1

    .line 515
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 516
    .line 517
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-interface {v1, p1}, LD5/o$h;->p(I)V

    .line 522
    .line 523
    .line 524
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_9

    .line 525
    .line 526
    .line 527
    goto :goto_b

    .line 528
    :catch_9
    move-exception p1

    .line 529
    goto :goto_9

    .line 530
    :catch_a
    move-exception p1

    .line 531
    :goto_9
    :try_start_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object p1
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    .line 535
    goto/16 :goto_6

    .line 536
    .line 537
    :pswitch_d
    :try_start_e
    check-cast p1, Ljava/lang/String;

    .line 538
    .line 539
    invoke-static {p1}, LD5/o$g;->e(Ljava/lang/String;)LD5/o$g;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 544
    .line 545
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-interface {v1, p1}, LD5/o$h;->n(LD5/o$g;)V

    .line 550
    .line 551
    .line 552
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_b
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    .line 553
    .line 554
    .line 555
    goto :goto_b

    .line 556
    :catch_b
    move-exception p1

    .line 557
    :try_start_f
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object p1
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    .line 561
    goto/16 :goto_6

    .line 562
    .line 563
    :pswitch_e
    :try_start_10
    check-cast p1, Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {p1}, LD5/o$i;->e(Ljava/lang/String;)LD5/o$i;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    iget-object v1, p0, LD5/o$a;->a:LD5/o;

    .line 570
    .line 571
    invoke-static {v1}, LD5/o;->a(LD5/o;)LD5/o$h;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-interface {v1, p1}, LD5/o$h;->i(LD5/o$i;)V

    .line 576
    .line 577
    .line 578
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    .line 579
    .line 580
    .line 581
    goto :goto_b

    .line 582
    :catch_c
    move-exception p1

    .line 583
    :try_start_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    .line 587
    goto/16 :goto_6

    .line 588
    .line 589
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    const-string v3, "JSON error: "

    .line 595
    .line 596
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    invoke-interface {p2, v0, p1, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :goto_b
    return-void

    .line 614
    nop

    .line 615
    :sswitch_data_0
    .sparse-switch
        -0x59804db0 -> :sswitch_e
        -0x3789da79 -> :sswitch_d
        -0x2dad73d5 -> :sswitch_c
        -0x2af4a94c -> :sswitch_b
        -0x2267c49c -> :sswitch_a
        -0x20b0f718 -> :sswitch_9
        -0xebc6f23 -> :sswitch_8
        -0xcd4cf9e -> :sswitch_7
        0xe6a45af -> :sswitch_6
        0x3436a200 -> :sswitch_5
        0x4341194a -> :sswitch_4
        0x52e10221 -> :sswitch_3
        0x5a408fa8 -> :sswitch_2
        0x63cbfa4a -> :sswitch_1
        0x7e576127 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
