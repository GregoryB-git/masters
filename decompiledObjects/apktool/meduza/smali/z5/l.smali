.class public Lz5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Landroid/content/ComponentName;

.field public static final c:Lp6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.google"

    .line 2
    .line 3
    const-string v1, "com.google.work"

    .line 4
    .line 5
    const-string v2, "cn.google"

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lz5/l;->a:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Landroid/content/ComponentName;

    .line 14
    .line 15
    const-string v1, "com.google.android.gms"

    .line 16
    .line 17
    const-string v2, "com.google.android.gms.auth.GetToken"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lz5/l;->b:Landroid/content/ComponentName;

    .line 23
    .line 24
    const-string v0, "GoogleAuthUtil"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lp6/a;

    .line 31
    .line 32
    const-string v2, "Auth"

    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Lp6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lz5/l;->c:Lp6/a;

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;
    .locals 10

    .line 1
    const-class v0, Lcom/google/android/gms/auth/TokenData;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-string v1, "tokenDetails"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    const-string v0, "TokenData"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/google/android/gms/auth/TokenData;

    .line 34
    .line 35
    :goto_0
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    const-string v0, "Error"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "userRecoveryIntent"

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/content/Intent;

    .line 51
    .line 52
    const-string v2, "userRecoveryPendingIntent"

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Landroid/app/PendingIntent;

    .line 59
    .line 60
    const-string v2, "getTokenWithDetails"

    .line 61
    .line 62
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzby;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/auth/zzby;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget-object v4, Lz5/l;->c:Lp6/a;

    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    new-array v6, v5, [Ljava/lang/Object;

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    aput-object v3, v6, v7

    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    aput-object v2, v6, v8

    .line 76
    .line 77
    const-string v9, "[GoogleAuthUtil] error status:%s with method:%s"

    .line 78
    .line 79
    invoke-static {v9, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-array v9, v7, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v4, v6, v9}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzi:Lcom/google/android/gms/internal/auth/zzby;

    .line 89
    .line 90
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_7

    .line 95
    .line 96
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzs:Lcom/google/android/gms/internal/auth/zzby;

    .line 97
    .line 98
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-nez v6, :cond_7

    .line 103
    .line 104
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzw:Lcom/google/android/gms/internal/auth/zzby;

    .line 105
    .line 106
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-nez v6, :cond_7

    .line 111
    .line 112
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzx:Lcom/google/android/gms/internal/auth/zzby;

    .line 113
    .line 114
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_7

    .line 119
    .line 120
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzn:Lcom/google/android/gms/internal/auth/zzby;

    .line 121
    .line 122
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_7

    .line 127
    .line 128
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzz:Lcom/google/android/gms/internal/auth/zzby;

    .line 129
    .line 130
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-nez v6, :cond_7

    .line 135
    .line 136
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzN:Lcom/google/android/gms/internal/auth/zzby;

    .line 137
    .line 138
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_7

    .line 143
    .line 144
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzF:Lcom/google/android/gms/internal/auth/zzby;

    .line 145
    .line 146
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_7

    .line 151
    .line 152
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzG:Lcom/google/android/gms/internal/auth/zzby;

    .line 153
    .line 154
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-nez v6, :cond_7

    .line 159
    .line 160
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzH:Lcom/google/android/gms/internal/auth/zzby;

    .line 161
    .line 162
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-nez v6, :cond_7

    .line 167
    .line 168
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzI:Lcom/google/android/gms/internal/auth/zzby;

    .line 169
    .line 170
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_7

    .line 175
    .line 176
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzJ:Lcom/google/android/gms/internal/auth/zzby;

    .line 177
    .line 178
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_7

    .line 183
    .line 184
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzK:Lcom/google/android/gms/internal/auth/zzby;

    .line 185
    .line 186
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_7

    .line 191
    .line 192
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzM:Lcom/google/android/gms/internal/auth/zzby;

    .line 193
    .line 194
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_7

    .line 199
    .line 200
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzE:Lcom/google/android/gms/internal/auth/zzby;

    .line 201
    .line 202
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-nez v6, :cond_7

    .line 207
    .line 208
    sget-object v6, Lcom/google/android/gms/internal/auth/zzby;->zzL:Lcom/google/android/gms/internal/auth/zzby;

    .line 209
    .line 210
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-eqz v6, :cond_4

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/auth/zzby;->zze:Lcom/google/android/gms/internal/auth/zzby;

    .line 218
    .line 219
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-nez p0, :cond_6

    .line 224
    .line 225
    sget-object p0, Lcom/google/android/gms/internal/auth/zzby;->zzf:Lcom/google/android/gms/internal/auth/zzby;

    .line 226
    .line 227
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-nez p0, :cond_6

    .line 232
    .line 233
    sget-object p0, Lcom/google/android/gms/internal/auth/zzby;->zzg:Lcom/google/android/gms/internal/auth/zzby;

    .line 234
    .line 235
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    if-nez p0, :cond_6

    .line 240
    .line 241
    sget-object p0, Lcom/google/android/gms/internal/auth/zzby;->zzaf:Lcom/google/android/gms/internal/auth/zzby;

    .line 242
    .line 243
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    if-nez p0, :cond_6

    .line 248
    .line 249
    sget-object p0, Lcom/google/android/gms/internal/auth/zzby;->zzah:Lcom/google/android/gms/internal/auth/zzby;

    .line 250
    .line 251
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_5

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_5
    new-instance p0, Lz3/f;

    .line 259
    .line 260
    invoke-direct {p0, v0}, Lz3/f;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p0

    .line 264
    :cond_6
    :goto_1
    new-instance p0, Ljava/io/IOException;

    .line 265
    .line 266
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p0

    .line 270
    :cond_7
    :goto_2
    invoke-static {p0}, Lcom/google/android/gms/internal/auth/zzdc;->zzd(Landroid/content/Context;)V

    .line 271
    .line 272
    .line 273
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzht;->zzc()Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_c

    .line 278
    .line 279
    if-eqz p1, :cond_9

    .line 280
    .line 281
    if-nez v1, :cond_8

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_8
    new-instance p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 285
    .line 286
    invoke-direct {p0, v0, v1, v5}, Lcom/google/android/gms/auth/UserRecoverableAuthException;-><init>(Ljava/lang/String;Landroid/content/Intent;I)V

    .line 287
    .line 288
    .line 289
    throw p0

    .line 290
    :cond_9
    :goto_3
    sget-object v3, Lj6/e;->d:Lj6/e;

    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    sget-object v3, Lj6/j;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 296
    .line 297
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    const-string v3, "com.google.android.gms"

    .line 302
    .line 303
    invoke-virtual {p0, v3, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 304
    .line 305
    .line 306
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :catch_0
    const-string p0, "GooglePlayServicesUtil"

    .line 311
    .line 312
    const-string v3, "Google Play services is missing."

    .line 313
    .line 314
    invoke-static {p0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move p0, v7

    .line 318
    :goto_4
    const v3, 0x7fffffff

    .line 319
    .line 320
    .line 321
    if-lt p0, v3, :cond_a

    .line 322
    .line 323
    if-nez p1, :cond_a

    .line 324
    .line 325
    const/4 p0, 0x3

    .line 326
    new-array p0, p0, [Ljava/lang/Object;

    .line 327
    .line 328
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    aput-object p1, p0, v7

    .line 333
    .line 334
    aput-object v2, p0, v8

    .line 335
    .line 336
    aput-object p1, p0, v5

    .line 337
    .line 338
    const-string p1, "Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation."

    .line 339
    .line 340
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    new-array p1, v7, [Ljava/lang/Object;

    .line 345
    .line 346
    invoke-virtual {v4, p0, p1}, Lp6/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_a
    if-nez v1, :cond_b

    .line 350
    .line 351
    new-array p0, v5, [Ljava/lang/Object;

    .line 352
    .line 353
    aput-object v0, p0, v7

    .line 354
    .line 355
    aput-object v2, p0, v8

    .line 356
    .line 357
    const-string p1, "no recovery Intent found with status=%s for method=%s. This shouldn\'t happen"

    .line 358
    .line 359
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    new-array p1, v7, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-virtual {v4, p0, p1}, Lp6/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_b
    new-instance p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 369
    .line 370
    invoke-direct {p0, v0, v1, v8}, Lcom/google/android/gms/auth/UserRecoverableAuthException;-><init>(Ljava/lang/String;Landroid/content/Intent;I)V

    .line 371
    .line 372
    .line 373
    throw p0

    .line 374
    :cond_c
    new-instance p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 375
    .line 376
    invoke-direct {p0, v0, v1, v8}, Lcom/google/android/gms/auth/UserRecoverableAuthException;-><init>(Ljava/lang/String;Landroid/content/Intent;I)V

    .line 377
    .line 378
    .line 379
    throw p0
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
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

.method public static b(Landroid/content/Context;Landroid/content/ComponentName;Lz5/k;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "Error on service connection."

    .line 2
    .line 3
    const-string v1, "GoogleAuthUtil"

    .line 4
    .line 5
    new-instance v2, Lj6/a;

    .line 6
    .line 7
    invoke-direct {v2}, Lj6/a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lm6/c;->a(Landroid/content/Context;)Lm6/s0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v3, Lm6/p0;

    .line 18
    .line 19
    invoke-direct {v3, p1}, Lm6/p0;-><init>(Landroid/content/ComponentName;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {p0, v3, v2, v1, v4}, Lm6/s0;->b(Lm6/p0;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lj6/b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lj6/b;->D()Z

    .line 28
    .line 29
    .line 30
    move-result v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v2}, Lj6/a;->a()Landroid/os/IBinder;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {p2, v3}, Lz5/k;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    new-instance v0, Lm6/p0;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Lm6/p0;-><init>(Landroid/content/ComponentName;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0, v2}, Lm6/s0;->c(Lm6/p0;Landroid/content/ServiceConnection;)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :catchall_0
    move-exception p2

    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception p2

    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception p2

    .line 55
    goto :goto_0

    .line 56
    :catch_2
    move-exception p2

    .line 57
    :goto_0
    :try_start_2
    invoke-static {v1, v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/io/IOException;

    .line 61
    .line 62
    invoke-direct {v1, v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    :goto_1
    new-instance v0, Lm6/p0;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Lm6/p0;-><init>(Landroid/content/ComponentName;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0, v2}, Lm6/s0;->c(Lm6/p0;Landroid/content/ServiceConnection;)V

    .line 72
    .line 73
    .line 74
    throw p2

    .line 75
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 76
    .line 77
    const-string p1, "Could not bind to service."

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :catch_3
    move-exception p0

    .line 84
    const/4 p1, 0x1

    .line 85
    new-array p1, p1, [Ljava/lang/Object;

    .line 86
    .line 87
    const/4 p2, 0x0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    aput-object v0, p1, p2

    .line 93
    .line 94
    const-string p2, "SecurityException while bind to auth service: %s"

    .line 95
    .line 96
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    new-instance p1, Ljava/io/IOException;

    .line 104
    .line 105
    const-string p2, "SecurityException while binding to Auth service."

    .line 106
    .line 107
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw p1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
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
.end method

.method public static c(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Canceled while waiting for the task of %s to finish."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lz5/l;->c:Lp6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Interrupted while waiting for the task of %s to finish."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lz5/l;->c:Lp6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v3, v2, Lk6/b;

    if-eqz v3, :cond_0

    check-cast v2, Lk6/b;

    throw v2

    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Unable to get a result for %s due to ExecutionException."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lz5/l;->c:Lp6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x802c80

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lj6/j;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Lj6/h; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lj6/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :catch_1
    move-exception p0

    .line 15
    :goto_0
    new-instance v0, Lz3/f;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1, p0}, Lz3/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_2
    move-exception p0

    .line 26
    new-instance v0, Lz5/e;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Landroid/content/Intent;

    .line 33
    .line 34
    iget-object p0, p0, Lj6/h;->a:Landroid/content/Intent;

    .line 35
    .line 36
    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lz5/e;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    .line 40
    .line 41
    .line 42
    throw v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static e(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v0, "clientPackageName"

    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "androidPackageName"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-string p0, "service_connection_start_time_millis"

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public static f(Landroid/accounts/Account;)V
    .locals 4

    iget-object v0, p0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lz5/l;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    iget-object v3, p0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Account type not supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Account name cannot be empty!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget-object v0, Lj6/e;->d:Lj6/e;

    .line 2
    .line 3
    const v1, 0x1110e58

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, v1}, Lj6/e;->c(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhw;->zzb()Lcom/google/android/gms/internal/auth/zzhs;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/zzhs;->zzq()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v1, 0x1

    .line 52
    :goto_0
    return v1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
