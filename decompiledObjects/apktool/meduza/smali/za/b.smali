.class public final Lza/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public final a:Landroid/content/pm/PackageManager;

.field public final b:Landroid/app/ActivityManager;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/app/ActivityManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/b;->a:Landroid/content/pm/PackageManager;

    iput-object p2, p0, Lza/b;->b:Landroid/app/ActivityManager;

    return-void
.end method


# virtual methods
.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 11

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "getDeviceInfo"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_8

    .line 20
    .line 21
    new-instance p1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "board"

    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v0, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 34
    .line 35
    const-string v1, "bootloader"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 41
    .line 42
    const-string v1, "brand"

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 48
    .line 49
    const-string v2, "device"

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v2, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 55
    .line 56
    const-string v3, "display"

    .line 57
    .line 58
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 62
    .line 63
    const-string v3, "fingerprint"

    .line 64
    .line 65
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 69
    .line 70
    const-string v4, "hardware"

    .line 71
    .line 72
    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    sget-object v4, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 76
    .line 77
    const-string v5, "host"

    .line 78
    .line 79
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object v4, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 83
    .line 84
    const-string v5, "id"

    .line 85
    .line 86
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 90
    .line 91
    const-string v5, "manufacturer"

    .line 92
    .line 93
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 97
    .line 98
    const-string v6, "model"

    .line 99
    .line 100
    invoke-virtual {p1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v6, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 104
    .line 105
    const-string v7, "product"

    .line 106
    .line 107
    invoke-virtual {p1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    sget-object v7, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 111
    .line 112
    array-length v8, v7

    .line 113
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-static {v7}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    const-string v8, "supported32BitAbis"

    .line 122
    .line 123
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    sget-object v7, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 127
    .line 128
    array-length v8, v7

    .line 129
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-static {v7}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-string v8, "supported64BitAbis"

    .line 138
    .line 139
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object v7, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 143
    .line 144
    array-length v8, v7

    .line 145
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v7}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    const-string v8, "supportedAbis"

    .line 154
    .line 155
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    sget-object v7, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 159
    .line 160
    const-string v8, "tags"

    .line 161
    .line 162
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object v7, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 166
    .line 167
    const-string v8, "type"

    .line 168
    .line 169
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    const-string v7, "BRAND"

    .line 173
    .line 174
    invoke-static {v0, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v7, "generic"

    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    invoke-static {v0, v7}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    const-string v9, "unknown"

    .line 185
    .line 186
    const/4 v10, 0x1

    .line 187
    if-eqz v0, :cond_0

    .line 188
    .line 189
    const-string v0, "DEVICE"

    .line 190
    .line 191
    invoke-static {v1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v7}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_2

    .line 199
    .line 200
    :cond_0
    const-string v0, "FINGERPRINT"

    .line 201
    .line 202
    invoke-static {v2, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v7}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_2

    .line 210
    .line 211
    invoke-static {v2, v9}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_2

    .line 216
    .line 217
    const-string v0, "HARDWARE"

    .line 218
    .line 219
    invoke-static {v3, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v0, "goldfish"

    .line 223
    .line 224
    invoke-static {v3, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_2

    .line 229
    .line 230
    const-string v0, "ranchu"

    .line 231
    .line 232
    invoke-static {v3, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_2

    .line 237
    .line 238
    const-string v0, "MODEL"

    .line 239
    .line 240
    invoke-static {v5, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string v0, "google_sdk"

    .line 244
    .line 245
    invoke-static {v5, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_2

    .line 250
    .line 251
    const-string v0, "Emulator"

    .line 252
    .line 253
    invoke-static {v5, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_2

    .line 258
    .line 259
    const-string v0, "Android SDK built for x86"

    .line 260
    .line 261
    invoke-static {v5, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_2

    .line 266
    .line 267
    const-string v0, "MANUFACTURER"

    .line 268
    .line 269
    invoke-static {v4, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    const-string v0, "Genymotion"

    .line 273
    .line 274
    invoke-static {v4, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_2

    .line 279
    .line 280
    const-string v0, "PRODUCT"

    .line 281
    .line 282
    invoke-static {v6, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v0, "sdk"

    .line 286
    .line 287
    invoke-static {v6, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_2

    .line 292
    .line 293
    const-string v0, "vbox86p"

    .line 294
    .line 295
    invoke-static {v6, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_2

    .line 300
    .line 301
    const-string v0, "emulator"

    .line 302
    .line 303
    invoke-static {v6, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_2

    .line 308
    .line 309
    const-string v0, "simulator"

    .line 310
    .line 311
    invoke-static {v6, v0}, Llc/k;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_1

    .line 316
    .line 317
    goto :goto_0

    .line 318
    :cond_1
    move v0, v8

    .line 319
    goto :goto_1

    .line 320
    :cond_2
    :goto_0
    move v0, v10

    .line 321
    :goto_1
    xor-int/2addr v0, v10

    .line 322
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    const-string v1, "isPhysicalDevice"

    .line 327
    .line 328
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    iget-object v0, p0, Lza/b;->a:Landroid/content/pm/PackageManager;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    const-string v1, "getSystemAvailableFeatures(...)"

    .line 338
    .line 339
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    new-instance v1, Ljava/util/ArrayList;

    .line 343
    .line 344
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 345
    .line 346
    .line 347
    array-length v2, v0

    .line 348
    move v3, v8

    .line 349
    :goto_2
    if-ge v3, v2, :cond_5

    .line 350
    .line 351
    aget-object v4, v0, v3

    .line 352
    .line 353
    iget-object v5, v4, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 354
    .line 355
    if-nez v5, :cond_3

    .line 356
    .line 357
    move v5, v10

    .line 358
    goto :goto_3

    .line 359
    :cond_3
    move v5, v8

    .line 360
    :goto_3
    if-nez v5, :cond_4

    .line 361
    .line 362
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-static {v1}, Lsb/m;->j(Ljava/lang/Iterable;)I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_6

    .line 386
    .line 387
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v2, Landroid/content/pm/FeatureInfo;

    .line 392
    .line 393
    iget-object v2, v2, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_6
    const-string v1, "systemFeatures"

    .line 400
    .line 401
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    new-instance v0, Ljava/util/HashMap;

    .line 405
    .line 406
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 407
    .line 408
    .line 409
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 410
    .line 411
    sget-object v2, Landroid/os/Build$VERSION;->BASE_OS:Ljava/lang/String;

    .line 412
    .line 413
    const-string v3, "baseOS"

    .line 414
    .line 415
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    sget v2, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    .line 419
    .line 420
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    const-string v3, "previewSdkInt"

    .line 425
    .line 426
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    sget-object v2, Landroid/os/Build$VERSION;->SECURITY_PATCH:Ljava/lang/String;

    .line 430
    .line 431
    const-string v3, "securityPatch"

    .line 432
    .line 433
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    sget-object v2, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 437
    .line 438
    const-string v3, "codename"

    .line 439
    .line 440
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    sget-object v2, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 444
    .line 445
    const-string v3, "incremental"

    .line 446
    .line 447
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 451
    .line 452
    const-string v3, "release"

    .line 453
    .line 454
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const-string v3, "sdkInt"

    .line 462
    .line 463
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    const-string v2, "version"

    .line 467
    .line 468
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    iget-object v0, p0, Lza/b;->b:Landroid/app/ActivityManager;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    const-string v2, "isLowRamDevice"

    .line 482
    .line 483
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    const/16 v0, 0x1a

    .line 487
    .line 488
    const-string v2, "serialNumber"

    .line 489
    .line 490
    if-lt v1, v0, :cond_7

    .line 491
    .line 492
    :try_start_0
    invoke-static {}, Lc0/b;->l()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 496
    :catch_0
    invoke-virtual {p1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    goto :goto_5

    .line 500
    :cond_7
    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    :goto_5
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    goto :goto_6

    .line 509
    :cond_8
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 510
    .line 511
    .line 512
    :goto_6
    return-void
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
