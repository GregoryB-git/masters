.class public abstract Lw1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p0, v2, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const/16 p1, 0x1d

    .line 16
    .line 17
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 18
    .line 19
    if-ge v0, p1, :cond_3

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const-string p1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 29
    .line 30
    invoke-static {p0, v2, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_2
    return-object v2

    .line 38
    :cond_3
    if-lt v0, p1, :cond_4

    .line 39
    .line 40
    invoke-static {p0, v2, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_4
    return-object v2
.end method

.method public static b(Landroid/content/Context;I)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x21

    .line 8
    .line 9
    const/16 v3, 0x1d

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    goto/16 :goto_2

    .line 15
    .line 16
    :pswitch_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    if-lt p1, v2, :cond_15

    .line 19
    .line 20
    const-string p1, "android.permission.BODY_SENSORS_BACKGROUND"

    .line 21
    .line 22
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_15

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :pswitch_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v1, 0x1f

    .line 36
    .line 37
    if-lt p1, v1, :cond_15

    .line 38
    .line 39
    const-string p1, "android.permission.SCHEDULE_EXACT_ALARM"

    .line 40
    .line 41
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_15

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    if-lt p1, v2, :cond_15

    .line 51
    .line 52
    const-string p1, "android.permission.READ_MEDIA_AUDIO"

    .line 53
    .line 54
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_15

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    if-lt p1, v2, :cond_15

    .line 64
    .line 65
    const-string p1, "android.permission.READ_MEDIA_VIDEO"

    .line 66
    .line 67
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_15

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 75
    .line 76
    if-lt p1, v2, :cond_15

    .line 77
    .line 78
    const-string p1, "android.permission.NEARBY_WIFI_DEVICES"

    .line 79
    .line 80
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_15

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_6
    const-string p1, "android.permission.BLUETOOTH_CONNECT"

    .line 88
    .line 89
    invoke-static {p0, p1}, Lw1/u;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_15

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :pswitch_7
    const-string p1, "android.permission.BLUETOOTH_ADVERTISE"

    .line 101
    .line 102
    invoke-static {p0, p1}, Lw1/u;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz p0, :cond_15

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_8
    const-string p1, "android.permission.BLUETOOTH_SCAN"

    .line 110
    .line 111
    invoke-static {p0, p1}, Lw1/u;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz p0, :cond_15

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_9
    const-string p1, "android.permission.ACCESS_NOTIFICATION_POLICY"

    .line 119
    .line 120
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_15

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_a
    const-string p1, "android.permission.REQUEST_INSTALL_PACKAGES"

    .line 128
    .line 129
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_15

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :pswitch_b
    const-string p1, "android.permission.SYSTEM_ALERT_WINDOW"

    .line 137
    .line 138
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_15

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_c
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 146
    .line 147
    const/16 v1, 0x1e

    .line 148
    .line 149
    if-lt p1, v1, :cond_15

    .line 150
    .line 151
    const-string p1, "android.permission.MANAGE_EXTERNAL_STORAGE"

    .line 152
    .line 153
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_15

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :pswitch_d
    const-string p1, "android.permission.BLUETOOTH"

    .line 162
    .line 163
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_15

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 172
    .line 173
    if-ge p1, v3, :cond_0

    .line 174
    .line 175
    return-object v1

    .line 176
    :cond_0
    const-string p1, "android.permission.ACTIVITY_RECOGNITION"

    .line 177
    .line 178
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-eqz p0, :cond_15

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_f
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 187
    .line 188
    if-ge p1, v3, :cond_1

    .line 189
    .line 190
    return-object v1

    .line 191
    :cond_1
    const-string p1, "android.permission.ACCESS_MEDIA_LOCATION"

    .line 192
    .line 193
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_15

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :pswitch_10
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 202
    .line 203
    if-lt p1, v2, :cond_15

    .line 204
    .line 205
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 206
    .line 207
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_15

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :pswitch_11
    const-string p1, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 216
    .line 217
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-eqz p0, :cond_15

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :pswitch_12
    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 226
    .line 227
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_2

    .line 232
    .line 233
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 237
    .line 238
    if-lt p1, v3, :cond_3

    .line 239
    .line 240
    if-ne p1, v3, :cond_15

    .line 241
    .line 242
    invoke-static {}, Lw1/r;->a()Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_15

    .line 247
    .line 248
    :cond_3
    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 249
    .line 250
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    if-eqz p0, :cond_15

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :pswitch_13
    const-string p1, "android.permission.SEND_SMS"

    .line 259
    .line 260
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_4

    .line 265
    .line 266
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    :cond_4
    const-string p1, "android.permission.RECEIVE_SMS"

    .line 270
    .line 271
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_5

    .line 276
    .line 277
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    :cond_5
    const-string p1, "android.permission.READ_SMS"

    .line 281
    .line 282
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_6

    .line 287
    .line 288
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_6
    const-string p1, "android.permission.RECEIVE_WAP_PUSH"

    .line 292
    .line 293
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-eqz p1, :cond_7

    .line 298
    .line 299
    const-string p1, "android.permission.RECEIVE_WAP_PUSH"

    .line 300
    .line 301
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_7
    const-string p1, "android.permission.RECEIVE_MMS"

    .line 305
    .line 306
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    if-eqz p0, :cond_15

    .line 311
    .line 312
    const-string p0, "android.permission.RECEIVE_MMS"

    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :pswitch_14
    const-string p1, "android.permission.BODY_SENSORS"

    .line 317
    .line 318
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-eqz p0, :cond_15

    .line 323
    .line 324
    const-string p0, "android.permission.BODY_SENSORS"

    .line 325
    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :pswitch_15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 329
    .line 330
    if-lt p1, v2, :cond_15

    .line 331
    .line 332
    const-string p1, "android.permission.READ_MEDIA_IMAGES"

    .line 333
    .line 334
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    if-eqz p0, :cond_15

    .line 339
    .line 340
    const-string p0, "android.permission.READ_MEDIA_IMAGES"

    .line 341
    .line 342
    goto/16 :goto_1

    .line 343
    .line 344
    :pswitch_16
    const-string p1, "android.permission.READ_PHONE_STATE"

    .line 345
    .line 346
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    if-eqz p1, :cond_8

    .line 351
    .line 352
    const-string p1, "android.permission.READ_PHONE_STATE"

    .line 353
    .line 354
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :cond_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 358
    .line 359
    if-le p1, v3, :cond_9

    .line 360
    .line 361
    const-string v1, "android.permission.READ_PHONE_NUMBERS"

    .line 362
    .line 363
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_9

    .line 368
    .line 369
    const-string v1, "android.permission.READ_PHONE_NUMBERS"

    .line 370
    .line 371
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    :cond_9
    const-string v1, "android.permission.CALL_PHONE"

    .line 375
    .line 376
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_a

    .line 381
    .line 382
    const-string v1, "android.permission.CALL_PHONE"

    .line 383
    .line 384
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    :cond_a
    const-string v1, "android.permission.READ_CALL_LOG"

    .line 388
    .line 389
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_b

    .line 394
    .line 395
    const-string v1, "android.permission.READ_CALL_LOG"

    .line 396
    .line 397
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    :cond_b
    const-string v1, "android.permission.WRITE_CALL_LOG"

    .line 401
    .line 402
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_c

    .line 407
    .line 408
    const-string v1, "android.permission.WRITE_CALL_LOG"

    .line 409
    .line 410
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    :cond_c
    const-string v1, "com.android.voicemail.permission.ADD_VOICEMAIL"

    .line 414
    .line 415
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_d

    .line 420
    .line 421
    const-string v1, "com.android.voicemail.permission.ADD_VOICEMAIL"

    .line 422
    .line 423
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    :cond_d
    const-string v1, "android.permission.USE_SIP"

    .line 427
    .line 428
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_e

    .line 433
    .line 434
    const-string v1, "android.permission.USE_SIP"

    .line 435
    .line 436
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    :cond_e
    if-lt p1, v3, :cond_f

    .line 440
    .line 441
    const-string v1, "android.permission.BIND_CALL_REDIRECTION_SERVICE"

    .line 442
    .line 443
    invoke-static {p0, v0, v1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-eqz v1, :cond_f

    .line 448
    .line 449
    const-string v1, "android.permission.BIND_CALL_REDIRECTION_SERVICE"

    .line 450
    .line 451
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    :cond_f
    const/16 v1, 0x1a

    .line 455
    .line 456
    if-lt p1, v1, :cond_15

    .line 457
    .line 458
    const-string p1, "android.permission.ANSWER_PHONE_CALLS"

    .line 459
    .line 460
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    if-eqz p0, :cond_15

    .line 465
    .line 466
    const-string p0, "android.permission.ANSWER_PHONE_CALLS"

    .line 467
    .line 468
    goto/16 :goto_1

    .line 469
    .line 470
    :pswitch_17
    const-string p1, "android.permission.RECORD_AUDIO"

    .line 471
    .line 472
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    if-eqz p0, :cond_15

    .line 477
    .line 478
    const-string p0, "android.permission.RECORD_AUDIO"

    .line 479
    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :pswitch_18
    return-object v1

    .line 483
    :pswitch_19
    const/4 v1, 0x4

    .line 484
    if-ne p1, v1, :cond_10

    .line 485
    .line 486
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 487
    .line 488
    if-lt p1, v3, :cond_10

    .line 489
    .line 490
    const-string p1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 491
    .line 492
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 493
    .line 494
    .line 495
    move-result p0

    .line 496
    if-eqz p0, :cond_15

    .line 497
    .line 498
    const-string p0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 499
    .line 500
    goto/16 :goto_1

    .line 501
    .line 502
    :cond_10
    const-string p1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 503
    .line 504
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    if-eqz p1, :cond_11

    .line 509
    .line 510
    const-string p1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 511
    .line 512
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    :cond_11
    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    .line 516
    .line 517
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    if-eqz p0, :cond_15

    .line 522
    .line 523
    const-string p0, "android.permission.ACCESS_FINE_LOCATION"

    .line 524
    .line 525
    goto/16 :goto_1

    .line 526
    .line 527
    :pswitch_1a
    const-string p1, "android.permission.READ_CONTACTS"

    .line 528
    .line 529
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    if-eqz p1, :cond_12

    .line 534
    .line 535
    const-string p1, "android.permission.READ_CONTACTS"

    .line 536
    .line 537
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    :cond_12
    const-string p1, "android.permission.WRITE_CONTACTS"

    .line 541
    .line 542
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result p1

    .line 546
    if-eqz p1, :cond_13

    .line 547
    .line 548
    const-string p1, "android.permission.WRITE_CONTACTS"

    .line 549
    .line 550
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    :cond_13
    const-string p1, "android.permission.GET_ACCOUNTS"

    .line 554
    .line 555
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 556
    .line 557
    .line 558
    move-result p0

    .line 559
    if-eqz p0, :cond_15

    .line 560
    .line 561
    const-string p0, "android.permission.GET_ACCOUNTS"

    .line 562
    .line 563
    goto/16 :goto_1

    .line 564
    .line 565
    :pswitch_1b
    const-string p1, "android.permission.CAMERA"

    .line 566
    .line 567
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 568
    .line 569
    .line 570
    move-result p0

    .line 571
    if-eqz p0, :cond_15

    .line 572
    .line 573
    const-string p0, "android.permission.CAMERA"

    .line 574
    .line 575
    goto/16 :goto_1

    .line 576
    .line 577
    :pswitch_1c
    const-string p1, "android.permission.READ_CALENDAR"

    .line 578
    .line 579
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 580
    .line 581
    .line 582
    move-result p1

    .line 583
    if-eqz p1, :cond_14

    .line 584
    .line 585
    const-string p1, "android.permission.READ_CALENDAR"

    .line 586
    .line 587
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    :cond_14
    const-string p1, "android.permission.WRITE_CALENDAR"

    .line 591
    .line 592
    invoke-static {p0, v0, p1}, Lw1/u;->d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z

    .line 593
    .line 594
    .line 595
    move-result p0

    .line 596
    if-eqz p0, :cond_15

    .line 597
    .line 598
    const-string p0, "android.permission.WRITE_CALENDAR"

    .line 599
    .line 600
    goto/16 :goto_1

    .line 601
    .line 602
    :cond_15
    :goto_2
    return-object v0

    .line 603
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_0
        :pswitch_18
        :pswitch_14
        :pswitch_13
        :pswitch_17
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_18
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
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
.end method

.method public static c(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x21

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const-wide/16 v1, 0x1000

    .line 16
    .line 17
    invoke-static {v1, v2}, Lw1/s;->a(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, p0, v1}, Lw1/t;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const/16 v1, 0x1000

    .line 27
    .line 28
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "permissions_handler"

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-nez p0, :cond_2

    .line 33
    .line 34
    const-string p0, "Unable to detect current Activity or App Context."

    .line 35
    .line 36
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    invoke-static {p0}, Lw1/u;->c(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    const-string p0, "Unable to get Package info, will not be able to determine permissions to request."

    .line 47
    .line 48
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    return v0

    .line 86
    :goto_0
    const-string p1, "Unable to check manifest for permission: "

    .line 87
    .line 88
    invoke-static {v2, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 89
    .line 90
    .line 91
    :cond_5
    return v1
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-static {p0, p1}, Lw/a;->m(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method public static f(Ljava/lang/String;)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1e

    const/16 v3, 0x1d

    const/16 v4, 0x1c

    const/16 v5, 0x1b

    const/16 v6, 0x18

    const/16 v7, 0x17

    const/16 v8, 0x16

    const/16 v9, 0x14

    const/16 v10, 0x13

    const/16 v11, 0x12

    const/16 v12, 0x11

    const/16 v13, 0xf

    const/16 v14, 0xd

    const/16 v15, 0xc

    const/16 v16, 0x9

    const/16 v17, 0x8

    const/16 v18, 0x7

    const/16 v19, 0x4

    const/16 v20, 0x3

    const/16 v21, 0x2

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "com.android.voicemail.permission.ADD_VOICEMAIL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v24, 0x29

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v24, 0x28

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "android.permission.BLUETOOTH_SCAN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v24, 0x27

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v24, 0x26

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "android.permission.READ_CONTACTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v24, 0x25

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v24, 0x24

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "android.permission.ACTIVITY_RECOGNITION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v24, 0x23

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "android.permission.REQUEST_INSTALL_PACKAGES"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v24, 0x22

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v24, 0x21

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "android.permission.GET_ACCOUNTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v24, 0x20

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "android.permission.BLUETOOTH_ADVERTISE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v24, 0x1f

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "android.permission.SCHEDULE_EXACT_ALARM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "android.permission.USE_SIP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    move/from16 v24, v3

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "android.permission.WRITE_CALL_LOG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v24, 0x1a

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "android.permission.WRITE_CALENDAR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v24, 0x19

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "android.permission.CAMERA"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    move/from16 v24, v6

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "android.permission.BODY_SENSORS_BACKGROUND"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    move/from16 v24, v7

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "android.permission.WRITE_CONTACTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    move/from16 v24, v8

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v24, 0x15

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "android.permission.CALL_PHONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    move/from16 v24, v9

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "android.permission.SEND_SMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    move/from16 v24, v10

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    move/from16 v24, v11

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    move/from16 v24, v12

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v24, 0x10

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    move/from16 v24, v13

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "android.permission.RECEIVE_SMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v24, 0xe

    goto/16 :goto_0

    :sswitch_1c
    const-string v1, "android.permission.RECEIVE_MMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    move/from16 v24, v14

    goto/16 :goto_0

    :sswitch_1d
    const-string v1, "android.permission.BIND_CALL_REDIRECTION_SERVICE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    move/from16 v24, v15

    goto/16 :goto_0

    :sswitch_1e
    const-string v1, "android.permission.NEARBY_WIFI_DEVICES"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v24, 0xb

    goto/16 :goto_0

    :sswitch_1f
    const-string v1, "android.permission.READ_PHONE_NUMBERS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v24, 0xa

    goto/16 :goto_0

    :sswitch_20
    const-string v1, "android.permission.BODY_SENSORS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_0

    :cond_20
    move/from16 v24, v16

    goto/16 :goto_0

    :sswitch_21
    const-string v1, "android.permission.RECEIVE_WAP_PUSH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_0

    :cond_21
    move/from16 v24, v17

    goto/16 :goto_0

    :sswitch_22
    const-string v1, "android.permission.SYSTEM_ALERT_WINDOW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_0

    :cond_22
    move/from16 v24, v18

    goto :goto_0

    :sswitch_23
    const-string v1, "android.permission.ACCESS_NOTIFICATION_POLICY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_0

    :cond_23
    const/16 v24, 0x6

    goto :goto_0

    :sswitch_24
    const-string v1, "android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_0

    :cond_24
    const/16 v24, 0x5

    goto :goto_0

    :sswitch_25
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_0

    :cond_25
    move/from16 v24, v19

    goto :goto_0

    :sswitch_26
    const-string v1, "android.permission.READ_CALL_LOG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto :goto_0

    :cond_26
    move/from16 v24, v20

    goto :goto_0

    :sswitch_27
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto :goto_0

    :cond_27
    move/from16 v24, v21

    goto :goto_0

    :sswitch_28
    const-string v1, "android.permission.READ_CALENDAR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_0

    :cond_28
    move/from16 v24, v22

    goto :goto_0

    :sswitch_29
    const-string v1, "android.permission.READ_SMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto :goto_0

    :cond_29
    move/from16 v24, v23

    :goto_0
    packed-switch v24, :pswitch_data_0

    return v9

    :pswitch_0
    return v11

    :pswitch_1
    return v4

    :pswitch_2
    return v19

    :pswitch_3
    return v18

    :pswitch_4
    return v10

    :pswitch_5
    return v6

    :pswitch_6
    return v3

    :pswitch_7
    const/16 v0, 0x22

    return v0

    :pswitch_8
    const/16 v0, 0x20

    return v0

    :pswitch_9
    const/16 v0, 0x21

    return v0

    :pswitch_a
    return v22

    :pswitch_b
    const/16 v0, 0x23

    return v0

    :pswitch_c
    return v21

    :pswitch_d
    return v16

    :pswitch_e
    return v13

    :pswitch_f
    return v2

    :pswitch_10
    const/16 v0, 0x1f

    return v0

    :pswitch_11
    return v15

    :pswitch_12
    return v7

    :pswitch_13
    return v5

    :pswitch_14
    return v8

    :pswitch_15
    return v20

    :pswitch_16
    return v17

    :pswitch_17
    return v12

    :pswitch_18
    return v23

    :pswitch_19
    return v14

    :sswitch_data_0
    .sparse-switch
        -0x7aed85b0 -> :sswitch_29
        -0x72f13779 -> :sswitch_28
        -0x72ca2557 -> :sswitch_27
        -0x7286b8f4 -> :sswitch_26
        -0x70918bc1 -> :sswitch_25
        -0x6c1165bf -> :sswitch_24
        -0x6a47e915 -> :sswitch_23
        -0x5d1492dd -> :sswitch_22
        -0x583351d1 -> :sswitch_21
        -0x49cb6684 -> :sswitch_20
        -0x456a1f70 -> :sswitch_1f
        -0x363647ed -> :sswitch_1e
        -0x35b67cfd -> :sswitch_1d
        -0x3562fc09 -> :sswitch_1c
        -0x3562e583 -> :sswitch_1b
        -0x2f9abb27 -> :sswitch_1a
        -0x1833add0 -> :sswitch_19
        -0x3c1ac56 -> :sswitch_18
        -0x550ba9 -> :sswitch_17
        0x322a742 -> :sswitch_16
        0x6afff6d -> :sswitch_15
        0xa7a881c -> :sswitch_14
        0xcc96c13 -> :sswitch_13
        0x158e77d1 -> :sswitch_12
        0x1b9efa65 -> :sswitch_11
        0x23fb06fe -> :sswitch_10
        0x24658583 -> :sswitch_f
        0x2933cd92 -> :sswitch_e
        0x2a564637 -> :sswitch_d
        0x2ec2d2a2 -> :sswitch_c
        0x39db9e69 -> :sswitch_b
        0x4586b056 -> :sswitch_a
        0x4bcdda0f -> :sswitch_9
        0x516a29a7 -> :sswitch_8
        0x69eee241 -> :sswitch_7
        0x6a1dc9a7 -> :sswitch_6
        0x6d24f988 -> :sswitch_5
        0x75dd2d9c -> :sswitch_4
        0x78aeb38b -> :sswitch_3
        0x7aed10ce -> :sswitch_2
        0x7e09eacb -> :sswitch_1
        0x7f2f307d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_19
        :pswitch_11
        :pswitch_16
        :pswitch_10
        :pswitch_16
        :pswitch_19
        :pswitch_19
        :pswitch_f
        :pswitch_e
        :pswitch_15
        :pswitch_16
        :pswitch_19
        :pswitch_16
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_18
        :pswitch_16
        :pswitch_9
        :pswitch_8
        :pswitch_16
        :pswitch_7
        :pswitch_6
        :pswitch_c
        :pswitch_e
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_16
    .end packed-switch
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p1, "sp_permission_handler_permission_was_denied_before"

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;I)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p2, v0, :cond_4

    .line 4
    .line 5
    invoke-static {p0, p1}, Lw1/u;->j(Landroid/content/Context;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-static {p0, p1}, Lw1/u;->e(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/2addr v0, v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v1, v0

    .line 23
    :goto_0
    if-nez p2, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-static {p0, p1}, Lw1/u;->g(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    if-eqz p2, :cond_3

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const/4 p0, 0x4

    .line 35
    return p0

    .line 36
    :cond_3
    return v2

    .line 37
    :cond_4
    return v1
.end method

.method public static i(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Lw1/u;->b(Landroid/content/Context;I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    :cond_1
    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const-string p1, "sp_permission_handler_permission_was_denied_before"

    .line 7
    .line 8
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method
