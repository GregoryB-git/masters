.class public LD5/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LD5/w;


# direct methods
.method public constructor <init>(LD5/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/w$a;->a:LD5/w;

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
    .locals 13

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    iget-object v1, p0, LD5/w$a;->a:LD5/w;

    .line 4
    .line 5
    invoke-static {v1}, LD5/w;->a(LD5/w;)LD5/w$f;

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
    const-string v3, "TextInputChannel"

    .line 39
    .line 40
    invoke-static {v3, v2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, -0x1

    .line 53
    sparse-switch v2, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_0
    const-string v2, "TextInput.requestAutofill"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_1
    const/16 v5, 0x9

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_1
    const-string v2, "TextInput.clearClient"

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_2
    const/16 v5, 0x8

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_2
    const-string v2, "TextInput.finishAutofillContext"

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    const/4 v5, 0x7

    .line 96
    goto :goto_0

    .line 97
    :sswitch_3
    const-string v2, "TextInput.setEditableSizeAndTransform"

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/4 v5, 0x6

    .line 107
    goto :goto_0

    .line 108
    :sswitch_4
    const-string v2, "TextInput.sendAppPrivateCommand"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_5

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    const/4 v5, 0x5

    .line 118
    goto :goto_0

    .line 119
    :sswitch_5
    const-string v2, "TextInput.show"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_6

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    const/4 v5, 0x4

    .line 129
    goto :goto_0

    .line 130
    :sswitch_6
    const-string v2, "TextInput.hide"

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_7

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    const/4 v5, 0x3

    .line 140
    goto :goto_0

    .line 141
    :sswitch_7
    const-string v2, "TextInput.setClient"

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_8

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    const/4 v5, 0x2

    .line 151
    goto :goto_0

    .line 152
    :sswitch_8
    const-string v2, "TextInput.setEditingState"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_9

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_9
    move v5, v3

    .line 162
    goto :goto_0

    .line 163
    :sswitch_9
    const-string v2, "TextInput.setPlatformViewClient"

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_a
    move v5, v4

    .line 173
    :goto_0
    const-string v1, "error"

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    packed-switch v5, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_5

    .line 183
    .line 184
    :pswitch_0
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 185
    .line 186
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-interface {p1}, LD5/w$f;->f()V

    .line 191
    .line 192
    .line 193
    :goto_1
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :pswitch_1
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 199
    .line 200
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-interface {p1}, LD5/w$f;->b()V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :pswitch_2
    iget-object v0, p0, LD5/w$a;->a:LD5/w;

    .line 209
    .line 210
    invoke-static {v0}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast p1, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    invoke-interface {v0, p1}, LD5/w$f;->i(Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :pswitch_3
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 225
    .line 226
    const-string v0, "width"

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 229
    .line 230
    .line 231
    move-result-wide v6

    .line 232
    const-string v0, "height"

    .line 233
    .line 234
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 235
    .line 236
    .line 237
    move-result-wide v8

    .line 238
    const-string v0, "transform"

    .line 239
    .line 240
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    const/16 v0, 0x10

    .line 245
    .line 246
    new-array v10, v0, [D

    .line 247
    .line 248
    :goto_2
    if-ge v4, v0, :cond_b

    .line 249
    .line 250
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getDouble(I)D

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    aput-wide v11, v10, v4

    .line 255
    .line 256
    add-int/lit8 v4, v4, 0x1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :catch_0
    move-exception p1

    .line 260
    goto :goto_3

    .line 261
    :cond_b
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 262
    .line 263
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-interface/range {v5 .. v10}, LD5/w$f;->e(DD[D)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    .line 272
    .line 273
    goto/16 :goto_5

    .line 274
    .line 275
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-interface {p2, v1, p1, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_5

    .line 283
    .line 284
    :pswitch_4
    :try_start_1
    check-cast p1, Lorg/json/JSONObject;

    .line 285
    .line 286
    const-string v3, "action"

    .line 287
    .line 288
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    if-eqz p1, :cond_c

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    if-nez v4, :cond_c

    .line 303
    .line 304
    new-instance v4, Landroid/os/Bundle;

    .line 305
    .line 306
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_c
    move-object v4, v2

    .line 314
    :goto_4
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 315
    .line 316
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-interface {p1, v3, v4}, LD5/w$f;->c(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :pswitch_5
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 328
    .line 329
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-interface {p1}, LD5/w$f;->a()V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_6
    iget-object p1, p0, LD5/w$a;->a:LD5/w;

    .line 339
    .line 340
    invoke-static {p1}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-interface {p1}, LD5/w$f;->j()V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :pswitch_7
    :try_start_2
    check-cast p1, Lorg/json/JSONArray;

    .line 350
    .line 351
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getInt(I)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    iget-object v3, p0, LD5/w$a;->a:LD5/w;

    .line 360
    .line 361
    invoke-static {v3}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-static {p1}, LD5/w$b;->a(Lorg/json/JSONObject;)LD5/w$b;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-interface {v3, v0, p1}, LD5/w$f;->g(ILD5/w$b;)V

    .line 370
    .line 371
    .line 372
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    .line 373
    .line 374
    .line 375
    goto :goto_5

    .line 376
    :catch_1
    move-exception p1

    .line 377
    goto :goto_3

    .line 378
    :pswitch_8
    :try_start_3
    check-cast p1, Lorg/json/JSONObject;

    .line 379
    .line 380
    iget-object v0, p0, LD5/w$a;->a:LD5/w;

    .line 381
    .line 382
    invoke-static {v0}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {p1}, LD5/w$e;->a(Lorg/json/JSONObject;)LD5/w$e;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-interface {v0, p1}, LD5/w$f;->h(LD5/w$e;)V

    .line 391
    .line 392
    .line 393
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_5

    .line 397
    :pswitch_9
    check-cast p1, Lorg/json/JSONObject;

    .line 398
    .line 399
    const-string v0, "platformViewId"

    .line 400
    .line 401
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    const-string v3, "usesVirtualDisplay"

    .line 406
    .line 407
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    iget-object v3, p0, LD5/w$a;->a:LD5/w;

    .line 412
    .line 413
    invoke-static {v3}, LD5/w;->a(LD5/w;)LD5/w$f;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-interface {v3, v0, p1}, LD5/w$f;->d(IZ)V

    .line 418
    .line 419
    .line 420
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 421
    .line 422
    .line 423
    :goto_5
    return-void

    .line 424
    nop

    .line 425
    :sswitch_data_0
    .sparse-switch
        -0x6a0a6d0c -> :sswitch_9
        -0x3c861a16 -> :sswitch_8
        -0x23d2364 -> :sswitch_7
        0x101f2613 -> :sswitch_6
        0x102423ce -> :sswitch_5
        0x26b1e570 -> :sswitch_4
        0x47cf0f0b -> :sswitch_3
        0x66f8a3d9 -> :sswitch_2
        0x71834287 -> :sswitch_1
        0x7df775f0 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
