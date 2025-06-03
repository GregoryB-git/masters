.class public final Lg/g$n;
.super Lg/g$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "n"
.end annotation


# instance fields
.field public final c:Lg/w;

.field public final synthetic d:Lg/g;


# direct methods
.method public constructor <init>(Lg/g;Lg/w;)V
    .locals 0

    iput-object p1, p0, Lg/g$n;->d:Lg/g;

    invoke-direct {p0, p1}, Lg/g$m;-><init>(Lg/g;)V

    iput-object p2, p0, Lg/g$n;->c:Lg/w;

    return-void
.end method


# virtual methods
.method public final b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()I
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lg/g$n;->c:Lg/w;

    .line 4
    .line 5
    iget-object v3, v2, Lg/w;->c:Lg/w$a;

    .line 6
    .line 7
    iget-wide v4, v3, Lg/w$a;->b:J

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    cmp-long v0, v4, v6

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    move v0, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v4

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :cond_1
    iget-object v0, v2, Lg/w;->a:Landroid/content/Context;

    .line 27
    .line 28
    const-string v6, "android.permission.ACCESS_COARSE_LOCATION"

    .line 29
    .line 30
    invoke-static {v0, v6}, Lx6/b;->F(Landroid/content/Context;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-string v6, "Failed to get last known location"

    .line 35
    .line 36
    const-string v7, "TwilightManager"

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    const-string v0, "network"

    .line 42
    .line 43
    :try_start_0
    iget-object v9, v2, Lg/w;->b:Landroid/location/LocationManager;

    .line 44
    .line 45
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    iget-object v9, v2, Lg/w;->b:Landroid/location/LocationManager;

    .line 52
    .line 53
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 54
    .line 55
    .line 56
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception v0

    .line 59
    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    :cond_2
    move-object v0, v8

    .line 63
    :goto_1
    move-object v9, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object v9, v8

    .line 66
    :goto_2
    iget-object v0, v2, Lg/w;->a:Landroid/content/Context;

    .line 67
    .line 68
    const-string v10, "android.permission.ACCESS_FINE_LOCATION"

    .line 69
    .line 70
    invoke-static {v0, v10}, Lx6/b;->F(Landroid/content/Context;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    const-string v0, "gps"

    .line 77
    .line 78
    :try_start_1
    iget-object v10, v2, Lg/w;->b:Landroid/location/LocationManager;

    .line 79
    .line 80
    invoke-virtual {v10, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_4

    .line 85
    .line 86
    iget-object v10, v2, Lg/w;->b:Landroid/location/LocationManager;

    .line 87
    .line 88
    invoke-virtual {v10, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 89
    .line 90
    .line 91
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    move-object v8, v0

    .line 93
    goto :goto_3

    .line 94
    :catch_1
    move-exception v0

    .line 95
    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_3
    if-eqz v8, :cond_5

    .line 99
    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    invoke-virtual {v8}, Landroid/location/Location;->getTime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v10

    .line 106
    invoke-virtual {v9}, Landroid/location/Location;->getTime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v12

    .line 110
    cmp-long v0, v10, v12

    .line 111
    .line 112
    if-lez v0, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    if-eqz v8, :cond_6

    .line 116
    .line 117
    :goto_4
    move-object v9, v8

    .line 118
    :cond_6
    if-eqz v9, :cond_d

    .line 119
    .line 120
    iget-object v0, v2, Lg/w;->c:Lg/w$a;

    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    sget-object v2, Lg/v;->d:Lg/v;

    .line 127
    .line 128
    if-nez v2, :cond_7

    .line 129
    .line 130
    new-instance v2, Lg/v;

    .line 131
    .line 132
    invoke-direct {v2}, Lg/v;-><init>()V

    .line 133
    .line 134
    .line 135
    sput-object v2, Lg/v;->d:Lg/v;

    .line 136
    .line 137
    :cond_7
    sget-object v2, Lg/v;->d:Lg/v;

    .line 138
    .line 139
    const-wide/32 v17, 0x5265c00

    .line 140
    .line 141
    .line 142
    sub-long v11, v6, v17

    .line 143
    .line 144
    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    .line 145
    .line 146
    .line 147
    move-result-wide v13

    .line 148
    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    .line 149
    .line 150
    .line 151
    move-result-wide v15

    .line 152
    move-object v10, v2

    .line 153
    invoke-virtual/range {v10 .. v16}, Lg/v;->a(JDD)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    .line 157
    .line 158
    .line 159
    move-result-wide v13

    .line 160
    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    .line 161
    .line 162
    .line 163
    move-result-wide v15

    .line 164
    move-wide v11, v6

    .line 165
    invoke-virtual/range {v10 .. v16}, Lg/v;->a(JDD)V

    .line 166
    .line 167
    .line 168
    iget v8, v2, Lg/v;->c:I

    .line 169
    .line 170
    if-ne v8, v5, :cond_8

    .line 171
    .line 172
    move v4, v5

    .line 173
    :cond_8
    iget-wide v13, v2, Lg/v;->b:J

    .line 174
    .line 175
    iget-wide v11, v2, Lg/v;->a:J

    .line 176
    .line 177
    add-long v15, v6, v17

    .line 178
    .line 179
    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    .line 180
    .line 181
    .line 182
    move-result-wide v17

    .line 183
    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    .line 184
    .line 185
    .line 186
    move-result-wide v8

    .line 187
    move-object v10, v2

    .line 188
    move-wide/from16 v19, v11

    .line 189
    .line 190
    move-wide v11, v15

    .line 191
    move-wide/from16 v21, v13

    .line 192
    .line 193
    move-wide/from16 v13, v17

    .line 194
    .line 195
    move-wide v15, v8

    .line 196
    invoke-virtual/range {v10 .. v16}, Lg/v;->a(JDD)V

    .line 197
    .line 198
    .line 199
    iget-wide v8, v2, Lg/v;->b:J

    .line 200
    .line 201
    const-wide/16 v10, 0x0

    .line 202
    .line 203
    const-wide/16 v12, -0x1

    .line 204
    .line 205
    cmp-long v2, v21, v12

    .line 206
    .line 207
    if-eqz v2, :cond_c

    .line 208
    .line 209
    cmp-long v2, v19, v12

    .line 210
    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_9
    cmp-long v2, v6, v19

    .line 215
    .line 216
    if-lez v2, :cond_a

    .line 217
    .line 218
    add-long/2addr v8, v10

    .line 219
    goto :goto_5

    .line 220
    :cond_a
    cmp-long v2, v6, v21

    .line 221
    .line 222
    if-lez v2, :cond_b

    .line 223
    .line 224
    add-long v8, v19, v10

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_b
    add-long v8, v21, v10

    .line 228
    .line 229
    :goto_5
    const-wide/32 v6, 0xea60

    .line 230
    .line 231
    .line 232
    add-long/2addr v8, v6

    .line 233
    goto :goto_7

    .line 234
    :cond_c
    :goto_6
    const-wide/32 v8, 0x2932e00

    .line 235
    .line 236
    .line 237
    add-long/2addr v8, v6

    .line 238
    :goto_7
    iput-boolean v4, v0, Lg/w$a;->a:Z

    .line 239
    .line 240
    iput-wide v8, v0, Lg/w$a;->b:J

    .line 241
    .line 242
    :goto_8
    iget-boolean v0, v3, Lg/w$a;->a:Z

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_d
    const-string v0, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    .line 246
    .line 247
    invoke-static {v7, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const/16 v2, 0xb

    .line 255
    .line 256
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    const/4 v2, 0x6

    .line 261
    if-lt v0, v2, :cond_e

    .line 262
    .line 263
    const/16 v2, 0x16

    .line 264
    .line 265
    if-lt v0, v2, :cond_f

    .line 266
    .line 267
    :cond_e
    move v4, v5

    .line 268
    :cond_f
    move v0, v4

    .line 269
    :goto_9
    if-eqz v0, :cond_10

    .line 270
    .line 271
    const/4 v5, 0x2

    .line 272
    :cond_10
    return v5
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

.method public final d()V
    .locals 2

    iget-object v0, p0, Lg/g$n;->d:Lg/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lg/g;->E(ZZ)Z

    return-void
.end method
