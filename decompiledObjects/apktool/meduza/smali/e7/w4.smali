.class public final Le7/w4;
.super Le7/j0;
.source "SourceFile"


# instance fields
.field public final d:Le7/i5;

.field public e:Le7/n0;

.field public volatile f:Ljava/lang/Boolean;

.field public final o:Le7/x4;

.field public final p:Lpb/c;

.field public final q:Ljava/util/ArrayList;

.field public final r:Le7/x4;


# direct methods
.method public constructor <init>(Le7/j2;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Le7/j0;-><init>(Le7/j2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lpb/c;

    .line 12
    .line 13
    iget-object v1, p1, Le7/j2;->v:Lb/z;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lpb/c;-><init>(Lv6/b;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Le7/w4;->p:Lpb/c;

    .line 19
    .line 20
    new-instance v0, Le7/i5;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Le7/i5;-><init>(Le7/w4;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Le7/w4;->d:Le7/i5;

    .line 26
    .line 27
    new-instance v0, Le7/x4;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, Le7/x4;-><init>(Le7/w4;Le7/c3;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Le7/w4;->o:Le7/x4;

    .line 34
    .line 35
    new-instance v0, Le7/x4;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p1, v1}, Le7/x4;-><init>(Le7/w4;Le7/c3;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Le7/w4;->r:Le7/x4;

    .line 42
    .line 43
    return-void
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


# virtual methods
.method public final A()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/j0;->t()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Le7/w4;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Le7/w4;->F()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v0, p0, Le7/w4;->d:Le7/i5;

    .line 22
    .line 23
    iget-object v2, v0, Le7/i5;->c:Le7/w4;

    .line 24
    .line 25
    invoke-virtual {v2}, Le7/o0;->l()V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Le7/i5;->c:Le7/w4;

    .line 29
    .line 30
    invoke-virtual {v2}, Ld2/q;->zza()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-boolean v3, v0, Le7/i5;->a:Z

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Le7/i5;->c:Le7/w4;

    .line 40
    .line 41
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 46
    .line 47
    const-string v2, "Connection attempt already in progress"

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v3, v0, Le7/i5;->b:Le7/z0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v3, v0, Le7/i5;->b:Le7/z0;

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/a;->isConnecting()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    iget-object v3, v0, Le7/i5;->b:Le7/z0;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    :cond_2
    iget-object v1, v0, Le7/i5;->c:Le7/w4;

    .line 74
    .line 75
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 80
    .line 81
    const-string v2, "Already awaiting connection attempt"

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    new-instance v3, Le7/z0;

    .line 85
    .line 86
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-direct {v3, v2, v4, v0, v0}, Le7/z0;-><init>(Landroid/content/Context;Landroid/os/Looper;Le7/i5;Le7/i5;)V

    .line 91
    .line 92
    .line 93
    iput-object v3, v0, Le7/i5;->b:Le7/z0;

    .line 94
    .line 95
    iget-object v2, v0, Le7/i5;->c:Le7/w4;

    .line 96
    .line 97
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 102
    .line 103
    const-string v3, "Connecting to remote service"

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Le7/b1;->b(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-boolean v1, v0, Le7/i5;->a:Z

    .line 109
    .line 110
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 111
    .line 112
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->checkAvailabilityAndConnect()V

    .line 118
    .line 119
    .line 120
    :goto_1
    monitor-exit v0

    .line 121
    return-void

    .line 122
    :catchall_0
    move-exception v1

    .line 123
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    throw v1

    .line 125
    :cond_4
    invoke-virtual {p0}, Ld2/q;->h()Le7/h;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Le7/h;->C()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_8

    .line 134
    .line 135
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v2, Landroid/content/Intent;

    .line 144
    .line 145
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    .line 153
    .line 154
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const/high16 v3, 0x10000

    .line 159
    .line 160
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    move v0, v1

    .line 173
    goto :goto_2

    .line 174
    :cond_5
    const/4 v0, 0x0

    .line 175
    :goto_2
    if-eqz v0, :cond_7

    .line 176
    .line 177
    new-instance v0, Landroid/content/Intent;

    .line 178
    .line 179
    const-string v2, "com.google.android.gms.measurement.START"

    .line 180
    .line 181
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance v2, Landroid/content/ComponentName;

    .line 185
    .line 186
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    .line 191
    .line 192
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 196
    .line 197
    .line 198
    iget-object v2, p0, Le7/w4;->d:Le7/i5;

    .line 199
    .line 200
    iget-object v3, v2, Le7/i5;->c:Le7/w4;

    .line 201
    .line 202
    invoke-virtual {v3}, Le7/o0;->l()V

    .line 203
    .line 204
    .line 205
    iget-object v3, v2, Le7/i5;->c:Le7/w4;

    .line 206
    .line 207
    invoke-virtual {v3}, Ld2/q;->zza()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {}, Lu6/a;->b()Lu6/a;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    monitor-enter v2

    .line 216
    :try_start_1
    iget-boolean v5, v2, Le7/i5;->a:Z

    .line 217
    .line 218
    if-eqz v5, :cond_6

    .line 219
    .line 220
    iget-object v0, v2, Le7/i5;->c:Le7/w4;

    .line 221
    .line 222
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 227
    .line 228
    const-string v1, "Connection attempt already in progress"

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_6
    iget-object v5, v2, Le7/i5;->c:Le7/w4;

    .line 235
    .line 236
    invoke-virtual {v5}, Ld2/q;->zzj()Le7/a1;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iget-object v5, v5, Le7/a1;->w:Le7/b1;

    .line 241
    .line 242
    const-string v6, "Using local app measurement service"

    .line 243
    .line 244
    invoke-virtual {v5, v6}, Le7/b1;->b(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iput-boolean v1, v2, Le7/i5;->a:Z

    .line 248
    .line 249
    iget-object v1, v2, Le7/i5;->c:Le7/w4;

    .line 250
    .line 251
    iget-object v1, v1, Le7/w4;->d:Le7/i5;

    .line 252
    .line 253
    const/16 v5, 0x81

    .line 254
    .line 255
    invoke-virtual {v4, v3, v0, v1, v5}, Lu6/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 256
    .line 257
    .line 258
    :goto_3
    monitor-exit v2

    .line 259
    return-void

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 262
    throw v0

    .line 263
    :cond_7
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 268
    .line 269
    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    .line 270
    .line 271
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_8
    return-void
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

.method public final B()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/j0;->t()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Le7/w4;->d:Le7/i5;

    .line 8
    .line 9
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->isConnecting()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->disconnect()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    iput-object v1, v0, Le7/i5;->b:Le7/z0;

    .line 36
    .line 37
    :try_start_0
    invoke-static {}, Lu6/a;->b()Lu6/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Le7/w4;->d:Le7/i5;

    .line 46
    .line 47
    invoke-virtual {v0, v2, v3}, Lu6/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    iput-object v1, p0, Le7/w4;->e:Le7/n0;

    .line 51
    .line 52
    return-void
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

.method public final C()Z
    .locals 1

    invoke-virtual {p0}, Le7/o0;->l()V

    invoke-virtual {p0}, Le7/j0;->t()V

    iget-object v0, p0, Le7/w4;->e:Le7/n0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D()Z
    .locals 4

    invoke-virtual {p0}, Le7/o0;->l()V

    invoke-virtual {p0}, Le7/j0;->t()V

    invoke-virtual {p0}, Le7/w4;->F()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ld2/q;->k()Le7/r6;

    move-result-object v0

    invoke-virtual {v0}, Le7/r6;->s0()I

    move-result v0

    sget-object v2, Le7/h0;->E0:Le7/m0;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final E()Z
    .locals 3

    invoke-virtual {p0}, Le7/o0;->l()V

    invoke-virtual {p0}, Le7/j0;->t()V

    invoke-virtual {p0}, Le7/w4;->F()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ld2/q;->k()Le7/r6;

    move-result-object v0

    invoke-virtual {v0}, Le7/r6;->s0()I

    move-result v0

    const v2, 0x3ae30

    if-lt v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final F()Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/j0;->t()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Le7/w4;->f:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Le7/j0;->t()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ld2/q;->l()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "use_service"

    .line 29
    .line 30
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    const/4 v1, 0x1

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Le7/o0;->m()Le7/t0;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Le7/j0;->t()V

    .line 67
    .line 68
    .line 69
    iget v4, v4, Le7/t0;->u:I

    .line 70
    .line 71
    if-ne v4, v1, :cond_2

    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_2
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget-object v4, v4, Le7/a1;->w:Le7/b1;

    .line 80
    .line 81
    const-string v5, "Checking service availability"

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Le7/b1;->b(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ld2/q;->k()Le7/r6;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v5, Lj6/f;->b:Lj6/f;

    .line 94
    .line 95
    invoke-virtual {v4}, Ld2/q;->zza()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const v6, 0xbdfcb8

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v4, v6}, Lj6/f;->c(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_a

    .line 107
    .line 108
    if-eq v4, v1, :cond_9

    .line 109
    .line 110
    const/4 v5, 0x2

    .line 111
    if-eq v4, v5, :cond_6

    .line 112
    .line 113
    const/4 v0, 0x3

    .line 114
    if-eq v4, v0, :cond_5

    .line 115
    .line 116
    const/16 v0, 0x9

    .line 117
    .line 118
    if-eq v4, v0, :cond_4

    .line 119
    .line 120
    const/16 v0, 0x12

    .line 121
    .line 122
    if-eq v4, v0, :cond_3

    .line 123
    .line 124
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v4, "Unexpected service status"

    .line 135
    .line 136
    invoke-virtual {v0, v4, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 145
    .line 146
    const-string v4, "Service updating"

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_4
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 154
    .line 155
    const-string v1, "Service invalid"

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 163
    .line 164
    const-string v1, "Service disabled"

    .line 165
    .line 166
    :goto_1
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_2
    move v0, v3

    .line 170
    move v1, v0

    .line 171
    goto :goto_7

    .line 172
    :cond_6
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-object v4, v4, Le7/a1;->v:Le7/b1;

    .line 177
    .line 178
    const-string v5, "Service container out of date"

    .line 179
    .line 180
    invoke-virtual {v4, v5}, Le7/b1;->b(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ld2/q;->k()Le7/r6;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v4}, Le7/r6;->s0()I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    const/16 v5, 0x4423

    .line 192
    .line 193
    if-ge v4, v5, :cond_7

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_7
    if-nez v0, :cond_8

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_8
    move v1, v3

    .line 200
    :goto_3
    move v0, v3

    .line 201
    goto :goto_7

    .line 202
    :cond_9
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 207
    .line 208
    const-string v4, "Service missing"

    .line 209
    .line 210
    invoke-virtual {v0, v4}, Le7/b1;->b(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :goto_4
    move v0, v1

    .line 214
    move v1, v3

    .line 215
    goto :goto_7

    .line 216
    :cond_a
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 221
    .line 222
    const-string v4, "Service available"

    .line 223
    .line 224
    :goto_5
    invoke-virtual {v0, v4}, Le7/b1;->b(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :goto_6
    move v0, v1

    .line 228
    :goto_7
    if-nez v1, :cond_b

    .line 229
    .line 230
    invoke-virtual {p0}, Ld2/q;->h()Le7/h;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Le7/h;->C()Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_b

    .line 239
    .line 240
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 245
    .line 246
    const-string v4, "No way to upload. Consider using the full version of Analytics"

    .line 247
    .line 248
    invoke-virtual {v0, v4}, Le7/b1;->b(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_b
    move v3, v0

    .line 253
    :goto_8
    if-eqz v3, :cond_c

    .line 254
    .line 255
    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Ld2/q;->l()V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 271
    .line 272
    .line 273
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 274
    .line 275
    .line 276
    :cond_c
    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iput-object v0, p0, Le7/w4;->f:Ljava/lang/Boolean;

    .line 281
    .line 282
    :cond_d
    iget-object v0, p0, Le7/w4;->f:Ljava/lang/Boolean;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    return v0
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

.method public final G()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 9
    .line 10
    iget-object v1, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Processing queued up service tasks"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Runnable;

    .line 42
    .line 43
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v1

    .line 48
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 53
    .line 54
    const-string v3, "Task exception while flushing queue"

    .line 55
    .line 56
    invoke-virtual {v2, v3, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v0, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Le7/w4;->r:Le7/x4;

    .line 66
    .line 67
    invoke-virtual {v0}, Le7/v;->a()V

    .line 68
    .line 69
    .line 70
    return-void
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

.method public final H()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le7/w4;->p:Lpb/c;

    .line 5
    .line 6
    iget-object v1, v0, Lpb/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lv6/b;

    .line 9
    .line 10
    check-cast v1, Lb/z;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iput-wide v1, v0, Lpb/c;->a:J

    .line 20
    .line 21
    iget-object v0, p0, Le7/w4;->o:Le7/x4;

    .line 22
    .line 23
    sget-object v1, Le7/h0;->U:Le7/m0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v1, v2}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-virtual {v0, v1, v2}, Le7/v;->b(J)V

    .line 37
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

.method public final I(Z)Le7/k6;
    .locals 48

    .line 1
    invoke-virtual/range {p0 .. p0}, Le7/o0;->m()Le7/t0;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Le7/a1;->A()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v14, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v14, v2

    .line 19
    :goto_0
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 20
    .line 21
    .line 22
    new-instance v44, Le7/k6;

    .line 23
    .line 24
    invoke-virtual {v1}, Le7/t0;->v()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v1}, Le7/t0;->w()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 33
    .line 34
    .line 35
    iget-object v6, v1, Le7/t0;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 38
    .line 39
    .line 40
    iget v0, v1, Le7/t0;->f:I

    .line 41
    .line 42
    int-to-long v7, v0

    .line 43
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Le7/t0;->o:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v9, v1, Le7/t0;->o:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 57
    .line 58
    .line 59
    iget-wide v10, v1, Le7/t0;->q:J

    .line 60
    .line 61
    const-wide/16 v12, 0x0

    .line 62
    .line 63
    cmp-long v0, v10, v12

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Le7/j2;

    .line 71
    .line 72
    invoke-virtual {v0}, Le7/j2;->m()Le7/r6;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v10}, Ld2/q;->l()V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v11}, Lm6/j;->e(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    invoke-static {}, Le7/r6;->B0()Ljava/security/MessageDigest;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    const-wide/16 v18, -0x1

    .line 106
    .line 107
    if-nez v12, :cond_1

    .line 108
    .line 109
    invoke-virtual {v10}, Ld2/q;->zzj()Le7/a1;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 114
    .line 115
    const-string v10, "Could not get MD5 instance"

    .line 116
    .line 117
    invoke-virtual {v0, v10}, Le7/b1;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    if-eqz v15, :cond_3

    .line 122
    .line 123
    :try_start_0
    invoke-virtual {v10, v0, v11}, Le7/r6;->m0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_3

    .line 128
    .line 129
    invoke-static {v0}, Lx6/d;->a(Landroid/content/Context;)Lx6/c;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v10}, Ld2/q;->zza()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    const/16 v13, 0x40

    .line 142
    .line 143
    invoke-virtual {v0, v13, v11}, Lx6/c;->b(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 148
    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    array-length v11, v0

    .line 152
    if-lez v11, :cond_2

    .line 153
    .line 154
    aget-object v0, v0, v3

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v12, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Le7/r6;->t([B)J

    .line 165
    .line 166
    .line 167
    move-result-wide v10

    .line 168
    move-wide/from16 v18, v10

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    invoke-virtual {v10}, Ld2/q;->zzj()Le7/a1;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 176
    .line 177
    const-string v11, "Could not get signatures"

    .line 178
    .line 179
    invoke-virtual {v0, v11}, Le7/b1;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    .line 182
    :goto_1
    move-wide/from16 v10, v18

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catch_0
    move-exception v0

    .line 186
    invoke-virtual {v10}, Ld2/q;->zzj()Le7/a1;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    iget-object v10, v10, Le7/a1;->o:Le7/b1;

    .line 191
    .line 192
    const-string v11, "Package name not found"

    .line 193
    .line 194
    invoke-virtual {v10, v11, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_3
    const-wide/16 v10, 0x0

    .line 198
    .line 199
    :goto_2
    iput-wide v10, v1, Le7/t0;->q:J

    .line 200
    .line 201
    :cond_4
    iget-wide v12, v1, Le7/t0;->q:J

    .line 202
    .line 203
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Le7/j2;

    .line 206
    .line 207
    invoke-virtual {v0}, Le7/j2;->d()Z

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-boolean v0, v0, Le7/l1;->B:Z

    .line 216
    .line 217
    const/4 v10, 0x1

    .line 218
    xor-int/2addr v0, v10

    .line 219
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 220
    .line 221
    .line 222
    iget-object v11, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v11, Le7/j2;

    .line 225
    .line 226
    invoke-virtual {v11}, Le7/j2;->d()Z

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    if-nez v11, :cond_5

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpq;->zza()Z

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    if-eqz v11, :cond_6

    .line 238
    .line 239
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    sget-object v3, Le7/h0;->C0:Le7/m0;

    .line 244
    .line 245
    invoke-virtual {v11, v2, v3}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_6

    .line 250
    .line 251
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iget-object v3, v3, Le7/a1;->w:Le7/b1;

    .line 256
    .line 257
    const-string v11, "Disabled IID for tests."

    .line 258
    .line 259
    move/from16 v19, v15

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_6
    :try_start_1
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    const-string v11, "com.google.firebase.analytics.FirebaseAnalytics"

    .line 271
    .line 272
    invoke-virtual {v3, v11}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4

    .line 276
    if-nez v3, :cond_7

    .line 277
    .line 278
    :goto_3
    move/from16 v19, v15

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_7
    :try_start_2
    const-string v11, "getInstance"

    .line 282
    .line 283
    new-array v2, v10, [Ljava/lang/Class;

    .line 284
    .line 285
    const-class v19, Landroid/content/Context;

    .line 286
    .line 287
    const/4 v10, 0x0

    .line 288
    aput-object v19, v2, v10

    .line 289
    .line 290
    invoke-virtual {v3, v11, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/4 v11, 0x1

    .line 295
    new-array v10, v11, [Ljava/lang/Object;

    .line 296
    .line 297
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 298
    .line 299
    .line 300
    move-result-object v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 301
    move/from16 v19, v15

    .line 302
    .line 303
    const/4 v15, 0x0

    .line 304
    :try_start_3
    aput-object v11, v10, v15

    .line 305
    .line 306
    const/4 v11, 0x0

    .line 307
    invoke-virtual {v2, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 311
    if-nez v2, :cond_8

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_8
    :try_start_4
    const-string v10, "getFirebaseInstanceId"

    .line 315
    .line 316
    new-array v11, v15, [Ljava/lang/Class;

    .line 317
    .line 318
    invoke-virtual {v3, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    new-array v10, v15, [Ljava/lang/Object;

    .line 323
    .line 324
    invoke-virtual {v3, v2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :catch_1
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iget-object v3, v2, Le7/a1;->t:Le7/b1;

    .line 336
    .line 337
    const-string v11, "Failed to retrieve Firebase Instance Id"

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :catch_2
    move/from16 v19, v15

    .line 341
    .line 342
    :catch_3
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    iget-object v3, v2, Le7/a1;->s:Le7/b1;

    .line 347
    .line 348
    const-string v11, "Failed to obtain Firebase Analytics instance"

    .line 349
    .line 350
    :goto_4
    invoke-virtual {v3, v11}, Le7/b1;->b(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :catch_4
    move/from16 v19, v15

    .line 355
    .line 356
    :goto_5
    const/4 v2, 0x0

    .line 357
    :goto_6
    iget-object v3, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, Le7/j2;

    .line 360
    .line 361
    invoke-virtual {v3}, Le7/j2;->j()Le7/l1;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    iget-object v10, v10, Le7/l1;->p:Le7/q1;

    .line 366
    .line 367
    invoke-virtual {v10}, Le7/q1;->a()J

    .line 368
    .line 369
    .line 370
    move-result-wide v10

    .line 371
    const-wide/16 v15, 0x0

    .line 372
    .line 373
    cmp-long v21, v10, v15

    .line 374
    .line 375
    if-nez v21, :cond_9

    .line 376
    .line 377
    iget-wide v10, v3, Le7/j2;->Q:J

    .line 378
    .line 379
    move-object/from16 v21, v2

    .line 380
    .line 381
    move-wide/from16 v22, v10

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_9
    move-object/from16 v21, v2

    .line 385
    .line 386
    iget-wide v2, v3, Le7/j2;->Q:J

    .line 387
    .line 388
    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 389
    .line 390
    .line 391
    move-result-wide v2

    .line 392
    move-wide/from16 v22, v2

    .line 393
    .line 394
    :goto_7
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 395
    .line 396
    .line 397
    iget v2, v1, Le7/t0;->u:I

    .line 398
    .line 399
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    const-string v10, "google_analytics_adid_collection_enabled"

    .line 404
    .line 405
    invoke-virtual {v3, v10}, Le7/h;->v(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-eqz v3, :cond_b

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v3, :cond_a

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_a
    const/16 v24, 0x0

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_b
    :goto_8
    const/16 v24, 0x1

    .line 422
    .line 423
    :goto_9
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {v3}, Ld2/q;->l()V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    const-string v10, "deferred_analytics_collection"

    .line 435
    .line 436
    const/4 v11, 0x0

    .line 437
    invoke-interface {v3, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 438
    .line 439
    .line 440
    move-result v25

    .line 441
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 442
    .line 443
    .line 444
    iget-object v15, v1, Le7/t0;->w:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    const-string v10, "google_analytics_default_allow_ad_personalization_signals"

    .line 451
    .line 452
    const/4 v11, 0x1

    .line 453
    invoke-virtual {v3, v10, v11}, Le7/h;->t(Ljava/lang/String;Z)Le7/g3;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    sget-object v11, Le7/g3;->e:Le7/g3;

    .line 458
    .line 459
    if-eq v3, v11, :cond_c

    .line 460
    .line 461
    const/4 v3, 0x1

    .line 462
    goto :goto_a

    .line 463
    :cond_c
    const/4 v3, 0x0

    .line 464
    :goto_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 465
    .line 466
    .line 467
    move-result-object v26

    .line 468
    move-wide/from16 v27, v12

    .line 469
    .line 470
    iget-wide v11, v1, Le7/t0;->r:J

    .line 471
    .line 472
    iget-object v13, v1, Le7/t0;->s:Ljava/util/List;

    .line 473
    .line 474
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-virtual {v3}, Le7/l1;->y()Le7/e3;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-virtual {v3}, Le7/e3;->n()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v29

    .line 486
    iget-object v3, v1, Le7/t0;->t:Ljava/lang/String;

    .line 487
    .line 488
    if-nez v3, :cond_d

    .line 489
    .line 490
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v3}, Le7/r6;->A0()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    iput-object v3, v1, Le7/t0;->t:Ljava/lang/String;

    .line 499
    .line 500
    :cond_d
    iget-object v3, v1, Le7/t0;->t:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 503
    .line 504
    .line 505
    move-result-object v30

    .line 506
    move-object/from16 v31, v3

    .line 507
    .line 508
    invoke-virtual/range {v30 .. v30}, Le7/l1;->y()Le7/e3;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    move-wide/from16 v32, v11

    .line 513
    .line 514
    sget-object v11, Le7/e3$a;->c:Le7/e3$a;

    .line 515
    .line 516
    invoke-virtual {v3, v11}, Le7/e3;->j(Le7/e3$a;)Z

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    if-nez v3, :cond_e

    .line 521
    .line 522
    move/from16 v30, v2

    .line 523
    .line 524
    const/4 v2, 0x0

    .line 525
    const-wide/16 v16, 0x0

    .line 526
    .line 527
    goto :goto_c

    .line 528
    :cond_e
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 529
    .line 530
    .line 531
    iget-wide v11, v1, Le7/t0;->y:J

    .line 532
    .line 533
    const-wide/16 v16, 0x0

    .line 534
    .line 535
    cmp-long v3, v11, v16

    .line 536
    .line 537
    if-eqz v3, :cond_f

    .line 538
    .line 539
    invoke-virtual {v1}, Ld2/q;->zzb()Lv6/b;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    check-cast v3, Lb/z;

    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 549
    .line 550
    .line 551
    move-result-wide v11

    .line 552
    move/from16 v30, v2

    .line 553
    .line 554
    iget-wide v2, v1, Le7/t0;->y:J

    .line 555
    .line 556
    sub-long/2addr v11, v2

    .line 557
    iget-object v2, v1, Le7/t0;->x:Ljava/lang/String;

    .line 558
    .line 559
    if-eqz v2, :cond_10

    .line 560
    .line 561
    const-wide/32 v2, 0x5265c00

    .line 562
    .line 563
    .line 564
    cmp-long v2, v11, v2

    .line 565
    .line 566
    if-lez v2, :cond_10

    .line 567
    .line 568
    iget-object v2, v1, Le7/t0;->z:Ljava/lang/String;

    .line 569
    .line 570
    if-nez v2, :cond_10

    .line 571
    .line 572
    invoke-virtual {v1}, Le7/t0;->x()V

    .line 573
    .line 574
    .line 575
    goto :goto_b

    .line 576
    :cond_f
    move/from16 v30, v2

    .line 577
    .line 578
    :cond_10
    :goto_b
    iget-object v2, v1, Le7/t0;->x:Ljava/lang/String;

    .line 579
    .line 580
    if-nez v2, :cond_11

    .line 581
    .line 582
    invoke-virtual {v1}, Le7/t0;->x()V

    .line 583
    .line 584
    .line 585
    :cond_11
    iget-object v2, v1, Le7/t0;->x:Ljava/lang/String;

    .line 586
    .line 587
    :goto_c
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    const-string v11, "google_analytics_sgtm_upload_enabled"

    .line 592
    .line 593
    invoke-virtual {v3, v11}, Le7/h;->v(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    if-nez v3, :cond_12

    .line 598
    .line 599
    const/16 v34, 0x0

    .line 600
    .line 601
    goto :goto_d

    .line 602
    :cond_12
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    move/from16 v34, v3

    .line 607
    .line 608
    :goto_d
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    invoke-virtual {v1}, Le7/t0;->v()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v11

    .line 616
    invoke-virtual {v3}, Ld2/q;->zza()Landroid/content/Context;

    .line 617
    .line 618
    .line 619
    move-result-object v12

    .line 620
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 621
    .line 622
    .line 623
    move-result-object v12

    .line 624
    if-nez v12, :cond_13

    .line 625
    .line 626
    move-object/from16 v35, v13

    .line 627
    .line 628
    move-wide/from16 v36, v16

    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    goto :goto_f

    .line 632
    :cond_13
    :try_start_5
    invoke-virtual {v3}, Ld2/q;->zza()Landroid/content/Context;

    .line 633
    .line 634
    .line 635
    move-result-object v12

    .line 636
    invoke-static {v12}, Lx6/d;->a(Landroid/content/Context;)Lx6/c;

    .line 637
    .line 638
    .line 639
    move-result-object v12
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 640
    move-object/from16 v35, v13

    .line 641
    .line 642
    const/4 v13, 0x0

    .line 643
    :try_start_6
    invoke-virtual {v12, v13, v11}, Lx6/c;->a(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 644
    .line 645
    .line 646
    move-result-object v12

    .line 647
    if-eqz v12, :cond_14

    .line 648
    .line 649
    iget v3, v12, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    .line 650
    .line 651
    goto :goto_e

    .line 652
    :catch_5
    move-object/from16 v35, v13

    .line 653
    .line 654
    const/4 v13, 0x0

    .line 655
    :catch_6
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    iget-object v3, v3, Le7/a1;->u:Le7/b1;

    .line 660
    .line 661
    const-string v12, "PackageManager failed to find running app: app_id"

    .line 662
    .line 663
    invoke-virtual {v3, v12, v11}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :cond_14
    move v3, v13

    .line 667
    :goto_e
    int-to-long v11, v3

    .line 668
    move-wide/from16 v36, v11

    .line 669
    .line 670
    :goto_f
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-virtual {v3}, Le7/l1;->y()Le7/e3;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    iget v12, v3, Le7/e3;->b:I

    .line 679
    .line 680
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    invoke-virtual {v3}, Le7/l1;->x()Le7/x;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    iget-object v3, v3, Le7/x;->b:Ljava/lang/String;

    .line 689
    .line 690
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zza()Z

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    if-eqz v11, :cond_15

    .line 695
    .line 696
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    sget-object v13, Le7/h0;->R0:Le7/m0;

    .line 701
    .line 702
    move-object/from16 v38, v3

    .line 703
    .line 704
    const/4 v3, 0x0

    .line 705
    invoke-virtual {v11, v3, v13}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 706
    .line 707
    .line 708
    move-result v11

    .line 709
    if-eqz v11, :cond_16

    .line 710
    .line 711
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 712
    .line 713
    .line 714
    invoke-static {}, Le7/r6;->k0()I

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    move/from16 v39, v3

    .line 719
    .line 720
    goto :goto_10

    .line 721
    :cond_15
    move-object/from16 v38, v3

    .line 722
    .line 723
    :cond_16
    const/16 v39, 0x0

    .line 724
    .line 725
    :goto_10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zza()Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-eqz v3, :cond_17

    .line 730
    .line 731
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    sget-object v11, Le7/h0;->R0:Le7/m0;

    .line 736
    .line 737
    const/4 v13, 0x0

    .line 738
    invoke-virtual {v3, v13, v11}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    if-eqz v3, :cond_17

    .line 743
    .line 744
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    invoke-virtual {v3}, Le7/r6;->x0()J

    .line 749
    .line 750
    .line 751
    move-result-wide v16

    .line 752
    :cond_17
    move-wide/from16 v40, v16

    .line 753
    .line 754
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    iget-object v13, v3, Le7/h;->d:Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    const/4 v11, 0x1

    .line 765
    invoke-virtual {v3, v10, v11}, Le7/h;->t(Ljava/lang/String;Z)Le7/g3;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-static {v3}, Le7/e3;->a(Le7/g3;)C

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v42

    .line 777
    iget-object v3, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v3, Le7/j2;

    .line 780
    .line 781
    iget-wide v10, v3, Le7/j2;->Q:J

    .line 782
    .line 783
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    move-wide/from16 v16, v10

    .line 788
    .line 789
    sget-object v10, Le7/h0;->M0:Le7/m0;

    .line 790
    .line 791
    const/4 v11, 0x0

    .line 792
    invoke-virtual {v3, v11, v10}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    if-eqz v3, :cond_19

    .line 797
    .line 798
    iget-object v1, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v1, Le7/j2;

    .line 801
    .line 802
    iget-object v1, v1, Le7/j2;->F:Le7/o4;

    .line 803
    .line 804
    if-eqz v1, :cond_18

    .line 805
    .line 806
    invoke-virtual {v1}, Le7/o4;->w()Lcom/google/android/gms/internal/measurement/zzgf$zzo$zza;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgf$zzo$zza;->zza()I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    move/from16 v43, v1

    .line 815
    .line 816
    goto :goto_11

    .line 817
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 818
    .line 819
    const-string v1, "Component not created"

    .line 820
    .line 821
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    throw v0

    .line 825
    :cond_19
    const/16 v43, 0x0

    .line 826
    .line 827
    :goto_11
    const-wide/32 v10, 0x1bd5a

    .line 828
    .line 829
    .line 830
    move-wide/from16 v45, v16

    .line 831
    .line 832
    move-object/from16 v1, v31

    .line 833
    .line 834
    move-object/from16 v3, v44

    .line 835
    .line 836
    move-object/from16 v47, v13

    .line 837
    .line 838
    move-object/from16 v31, v35

    .line 839
    .line 840
    move/from16 v35, v12

    .line 841
    .line 842
    move-wide/from16 v12, v27

    .line 843
    .line 844
    move-object/from16 v27, v15

    .line 845
    .line 846
    move/from16 v15, v19

    .line 847
    .line 848
    move/from16 v16, v0

    .line 849
    .line 850
    move-object/from16 v17, v21

    .line 851
    .line 852
    move-wide/from16 v18, v22

    .line 853
    .line 854
    move/from16 v20, v30

    .line 855
    .line 856
    move/from16 v21, v24

    .line 857
    .line 858
    move/from16 v22, v25

    .line 859
    .line 860
    move-object/from16 v23, v27

    .line 861
    .line 862
    move-object/from16 v24, v26

    .line 863
    .line 864
    move-wide/from16 v25, v32

    .line 865
    .line 866
    move-object/from16 v27, v31

    .line 867
    .line 868
    move-object/from16 v28, v29

    .line 869
    .line 870
    move-object/from16 v29, v1

    .line 871
    .line 872
    move-object/from16 v30, v2

    .line 873
    .line 874
    move/from16 v31, v34

    .line 875
    .line 876
    move-wide/from16 v32, v36

    .line 877
    .line 878
    move/from16 v34, v35

    .line 879
    .line 880
    move-object/from16 v35, v38

    .line 881
    .line 882
    move/from16 v36, v39

    .line 883
    .line 884
    move-wide/from16 v37, v40

    .line 885
    .line 886
    move-object/from16 v39, v47

    .line 887
    .line 888
    move-object/from16 v40, v42

    .line 889
    .line 890
    move-wide/from16 v41, v45

    .line 891
    .line 892
    invoke-direct/range {v3 .. v43}, Le7/k6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 893
    .line 894
    .line 895
    return-object v44
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

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v(Le7/f;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/j0;->t()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Le7/o0;->n()Le7/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ld2/q;->k()Le7/r6;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Le7/r6;->a0(Landroid/os/Parcelable;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v1

    .line 19
    const/high16 v3, 0x20000

    .line 20
    .line 21
    if-le v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Le7/a1;->p:Le7/b1;

    .line 28
    .line 29
    const-string v1, "Conditional user property too long for local database. Sending directly to service"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x2

    .line 37
    invoke-virtual {v0, v1, v2}, Le7/w0;->w([BI)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    move v4, v0

    .line 42
    new-instance v5, Le7/f;

    .line 43
    .line 44
    invoke-direct {v5, p1}, Le7/f;-><init>(Le7/f;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p0, v0}, Le7/w4;->I(Z)Le7/k6;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-instance v0, Le7/g5;

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    move-object v2, p0

    .line 56
    move-object v6, p1

    .line 57
    invoke-direct/range {v1 .. v6}, Le7/g5;-><init>(Le7/w4;Le7/k6;ZLe7/f;Le7/f;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    return-void
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

.method public final w(Le7/n0;Ln6/a;Le7/k6;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Le7/o0;->l()V

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p0 .. p0}, Le7/j0;->t()V

    .line 13
    .line 14
    .line 15
    const/16 v5, 0x64

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move v0, v5

    .line 19
    move v7, v6

    .line 20
    :goto_0
    const/16 v8, 0x3e9

    .line 21
    .line 22
    if-ge v7, v8, :cond_1c

    .line 23
    .line 24
    if-ne v0, v5, :cond_1c

    .line 25
    .line 26
    new-instance v8, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p0 .. p0}, Le7/o0;->n()Le7/w0;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    const-string v10, "Error reading entries from local database"

    .line 36
    .line 37
    invoke-virtual {v9}, Le7/o0;->l()V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, v9, Le7/w0;->e:Z

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9}, Ld2/q;->zza()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v13, "google_app_measurement_local.db"

    .line 55
    .line 56
    invoke-virtual {v0, v13}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    move/from16 v16, v6

    .line 67
    .line 68
    move/from16 v17, v7

    .line 69
    .line 70
    goto/16 :goto_17

    .line 71
    .line 72
    :cond_1
    const/4 v13, 0x5

    .line 73
    move v14, v6

    .line 74
    move v15, v13

    .line 75
    :goto_1
    if-ge v14, v13, :cond_13

    .line 76
    .line 77
    const/4 v13, 0x1

    .line 78
    :try_start_0
    invoke-virtual {v9}, Le7/w0;->z()Landroid/database/sqlite/SQLiteDatabase;

    .line 79
    .line 80
    .line 81
    move-result-object v11
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_15
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_12
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 82
    if-nez v11, :cond_3

    .line 83
    .line 84
    :try_start_1
    iput-boolean v13, v9, Le7/w0;->e:Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_11
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_f
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 85
    .line 86
    if-eqz v11, :cond_2

    .line 87
    .line 88
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_2
    move/from16 v16, v6

    .line 92
    .line 93
    move/from16 v17, v7

    .line 94
    .line 95
    goto/16 :goto_16

    .line 96
    .line 97
    :cond_3
    :try_start_2
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 98
    .line 99
    .line 100
    invoke-static {v11}, Le7/w0;->v(Landroid/database/sqlite/SQLiteDatabase;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v16

    .line 104
    const-wide/16 v26, -0x1

    .line 105
    .line 106
    cmp-long v0, v16, v26

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    const-string v0, "rowid<?"

    .line 111
    .line 112
    new-array v5, v13, [Ljava/lang/String;

    .line 113
    .line 114
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    aput-object v16, v5, v6

    .line 119
    .line 120
    move-object/from16 v19, v0

    .line 121
    .line 122
    move-object/from16 v20, v5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    :goto_3
    const-string v17, "messages"

    .line 130
    .line 131
    const-string v0, "rowid"

    .line 132
    .line 133
    const-string v5, "type"

    .line 134
    .line 135
    const-string v13, "entry"

    .line 136
    .line 137
    filled-new-array {v0, v5, v13}, [Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v18

    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const-string v23, "rowid asc"

    .line 146
    .line 147
    const/16 v5, 0x64

    .line 148
    .line 149
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v24

    .line 153
    move-object/from16 v16, v11

    .line 154
    .line 155
    invoke-virtual/range {v16 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 156
    .line 157
    .line 158
    move-result-object v5
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_2 .. :try_end_2} :catch_11
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_2 .. :try_end_2} :catch_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_f
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 159
    :goto_4
    :try_start_3
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 160
    .line 161
    .line 162
    move-result v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    :try_start_4
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v26

    .line 169
    const/4 v13, 0x1

    .line 170
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    const/4 v13, 0x2

    .line 175
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getBlob(I)[B

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    if-nez v0, :cond_5

    .line 180
    .line 181
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 182
    .line 183
    .line 184
    move-result-object v13
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 185
    :try_start_5
    array-length v0, v6
    :try_end_5
    .catch Ln6/b$a; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 186
    move/from16 v17, v7

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    :try_start_6
    invoke-virtual {v13, v6, v7, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v13, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Le7/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 196
    .line 197
    invoke-interface {v0, v13}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Le7/f0;
    :try_end_6
    .catch Ln6/b$a; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 202
    .line 203
    :try_start_7
    invoke-virtual {v13}, Landroid/os/Parcel;->recycle()V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 204
    .line 205
    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    goto/16 :goto_9

    .line 209
    .line 210
    :catchall_0
    move-exception v0

    .line 211
    goto :goto_5

    .line 212
    :catchall_1
    move-exception v0

    .line 213
    move/from16 v17, v7

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :catch_0
    move/from16 v17, v7

    .line 217
    .line 218
    :catch_1
    :try_start_8
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 223
    .line 224
    const-string v6, "Failed to load event from local database"

    .line 225
    .line 226
    invoke-virtual {v0, v6}, Le7/b1;->b(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 227
    .line 228
    .line 229
    :try_start_9
    invoke-virtual {v13}, Landroid/os/Parcel;->recycle()V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_c

    .line 233
    .line 234
    :goto_5
    invoke-virtual {v13}, Landroid/os/Parcel;->recycle()V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_5
    move/from16 v17, v7

    .line 239
    .line 240
    const/4 v7, 0x1

    .line 241
    if-ne v0, v7, :cond_6

    .line 242
    .line 243
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 244
    .line 245
    .line 246
    move-result-object v7
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_9 .. :try_end_9} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_9 .. :try_end_9} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 247
    :try_start_a
    array-length v0, v6

    .line 248
    const/4 v13, 0x0

    .line 249
    invoke-virtual {v7, v6, v13, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v13}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 253
    .line 254
    .line 255
    sget-object v0, Le7/q6;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 256
    .line 257
    invoke-interface {v0, v7}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Le7/q6;
    :try_end_a
    .catch Ln6/b$a; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 262
    .line 263
    :try_start_b
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_b .. :try_end_b} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_b .. :try_end_b} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :catchall_2
    move-exception v0

    .line 268
    goto :goto_7

    .line 269
    :catch_2
    :try_start_c
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 274
    .line 275
    const-string v6, "Failed to load user property from local database"

    .line 276
    .line 277
    invoke-virtual {v0, v6}, Le7/b1;->b(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 278
    .line 279
    .line 280
    :try_start_d
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 281
    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    :goto_6
    if-eqz v0, :cond_9

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :goto_7
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 288
    .line 289
    .line 290
    throw v0

    .line 291
    :cond_6
    if-ne v0, v13, :cond_7

    .line 292
    .line 293
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 294
    .line 295
    .line 296
    move-result-object v7
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_d .. :try_end_d} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_d .. :try_end_d} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 297
    :try_start_e
    array-length v0, v6

    .line 298
    const/4 v13, 0x0

    .line 299
    invoke-virtual {v7, v6, v13, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7, v13}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Le7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 306
    .line 307
    invoke-interface {v0, v7}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Le7/f;
    :try_end_e
    .catch Ln6/b$a; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 312
    .line 313
    :try_start_f
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_f .. :try_end_f} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_f .. :try_end_f} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_9
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :catchall_3
    move-exception v0

    .line 318
    goto :goto_a

    .line 319
    :catch_3
    :try_start_10
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 324
    .line 325
    const-string v6, "Failed to load conditional user property from local database"

    .line 326
    .line 327
    invoke-virtual {v0, v6}, Le7/b1;->b(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 328
    .line 329
    .line 330
    :try_start_11
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 331
    .line 332
    .line 333
    const/4 v0, 0x0

    .line 334
    :goto_8
    if-eqz v0, :cond_9

    .line 335
    .line 336
    :goto_9
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_c

    .line 340
    :goto_a
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 341
    .line 342
    .line 343
    throw v0

    .line 344
    :cond_7
    const/4 v6, 0x3

    .line 345
    if-ne v0, v6, :cond_8

    .line 346
    .line 347
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 352
    .line 353
    const-string v6, "Skipping app launch break"

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :cond_8
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 361
    .line 362
    const-string v6, "Unknown record type in local database"

    .line 363
    .line 364
    :goto_b
    invoke-virtual {v0, v6}, Le7/b1;->b(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :cond_9
    :goto_c
    move/from16 v7, v17

    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    goto/16 :goto_4

    .line 371
    .line 372
    :catch_4
    move-exception v0

    .line 373
    move/from16 v17, v7

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :catch_5
    move/from16 v17, v7

    .line 377
    .line 378
    goto :goto_e

    .line 379
    :catch_6
    move-exception v0

    .line 380
    move/from16 v17, v7

    .line 381
    .line 382
    goto :goto_f

    .line 383
    :goto_d
    const/16 v16, 0x0

    .line 384
    .line 385
    goto/16 :goto_11

    .line 386
    .line 387
    :cond_a
    move/from16 v17, v7

    .line 388
    .line 389
    const-string v0, "messages"

    .line 390
    .line 391
    const-string v6, "rowid <= ?"

    .line 392
    .line 393
    const/4 v7, 0x1

    .line 394
    new-array v13, v7, [Ljava/lang/String;

    .line 395
    .line 396
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v7
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_11 .. :try_end_11} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_11 .. :try_end_11} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    :try_start_12
    aput-object v7, v13, v16

    .line 403
    .line 404
    invoke-virtual {v11, v0, v6, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    if-ge v0, v6, :cond_b

    .line 413
    .line 414
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 419
    .line 420
    const-string v6, "Fewer entries removed from local database than expected"

    .line 421
    .line 422
    invoke-virtual {v0, v6}, Le7/b1;->b(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    :cond_b
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_12 .. :try_end_12} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_12 .. :try_end_12} :catch_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 429
    .line 430
    .line 431
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_17

    .line 438
    .line 439
    :catch_7
    move-exception v0

    .line 440
    goto :goto_11

    .line 441
    :catch_8
    move-exception v0

    .line 442
    goto/16 :goto_13

    .line 443
    .line 444
    :catch_9
    move-exception v0

    .line 445
    goto :goto_d

    .line 446
    :catch_a
    :goto_e
    const/16 v16, 0x0

    .line 447
    .line 448
    goto/16 :goto_12

    .line 449
    .line 450
    :catch_b
    move-exception v0

    .line 451
    :goto_f
    const/16 v16, 0x0

    .line 452
    .line 453
    goto/16 :goto_13

    .line 454
    .line 455
    :catchall_4
    move-exception v0

    .line 456
    move-object v2, v11

    .line 457
    move-object v11, v5

    .line 458
    goto/16 :goto_15

    .line 459
    .line 460
    :catch_c
    move-exception v0

    .line 461
    move/from16 v16, v6

    .line 462
    .line 463
    move/from16 v17, v7

    .line 464
    .line 465
    goto :goto_11

    .line 466
    :catch_d
    move/from16 v16, v6

    .line 467
    .line 468
    move/from16 v17, v7

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :catch_e
    move-exception v0

    .line 472
    move/from16 v16, v6

    .line 473
    .line 474
    move/from16 v17, v7

    .line 475
    .line 476
    goto/16 :goto_13

    .line 477
    .line 478
    :catchall_5
    move-exception v0

    .line 479
    move-object v2, v11

    .line 480
    goto :goto_10

    .line 481
    :catch_f
    move-exception v0

    .line 482
    move/from16 v16, v6

    .line 483
    .line 484
    move/from16 v17, v7

    .line 485
    .line 486
    const/4 v5, 0x0

    .line 487
    goto :goto_11

    .line 488
    :catch_10
    move/from16 v16, v6

    .line 489
    .line 490
    move/from16 v17, v7

    .line 491
    .line 492
    const/4 v5, 0x0

    .line 493
    goto :goto_12

    .line 494
    :catch_11
    move-exception v0

    .line 495
    move/from16 v16, v6

    .line 496
    .line 497
    move/from16 v17, v7

    .line 498
    .line 499
    const/4 v5, 0x0

    .line 500
    goto :goto_13

    .line 501
    :catchall_6
    move-exception v0

    .line 502
    const/4 v2, 0x0

    .line 503
    :goto_10
    const/4 v11, 0x0

    .line 504
    goto :goto_15

    .line 505
    :catch_12
    move-exception v0

    .line 506
    move/from16 v16, v6

    .line 507
    .line 508
    move/from16 v17, v7

    .line 509
    .line 510
    const/4 v5, 0x0

    .line 511
    const/4 v11, 0x0

    .line 512
    :goto_11
    if-eqz v11, :cond_c

    .line 513
    .line 514
    :try_start_13
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-eqz v6, :cond_c

    .line 519
    .line 520
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 521
    .line 522
    .line 523
    :cond_c
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    iget-object v6, v6, Le7/a1;->o:Le7/b1;

    .line 528
    .line 529
    invoke-virtual {v6, v10, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    const/4 v6, 0x1

    .line 533
    iput-boolean v6, v9, Le7/w0;->e:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 534
    .line 535
    if-eqz v5, :cond_d

    .line 536
    .line 537
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 538
    .line 539
    .line 540
    :cond_d
    if-eqz v11, :cond_10

    .line 541
    .line 542
    goto :goto_14

    .line 543
    :catch_13
    move/from16 v16, v6

    .line 544
    .line 545
    move/from16 v17, v7

    .line 546
    .line 547
    const/4 v5, 0x0

    .line 548
    const/4 v11, 0x0

    .line 549
    :catch_14
    :goto_12
    int-to-long v6, v15

    .line 550
    :try_start_14
    invoke-static {v6, v7}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 551
    .line 552
    .line 553
    add-int/lit8 v15, v15, 0x14

    .line 554
    .line 555
    if-eqz v5, :cond_e

    .line 556
    .line 557
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 558
    .line 559
    .line 560
    :cond_e
    if-eqz v11, :cond_10

    .line 561
    .line 562
    goto :goto_14

    .line 563
    :catch_15
    move-exception v0

    .line 564
    move/from16 v16, v6

    .line 565
    .line 566
    move/from16 v17, v7

    .line 567
    .line 568
    const/4 v5, 0x0

    .line 569
    const/4 v11, 0x0

    .line 570
    :goto_13
    :try_start_15
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    iget-object v6, v6, Le7/a1;->o:Le7/b1;

    .line 575
    .line 576
    invoke-virtual {v6, v10, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    const/4 v6, 0x1

    .line 580
    iput-boolean v6, v9, Le7/w0;->e:Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 581
    .line 582
    if-eqz v5, :cond_f

    .line 583
    .line 584
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 585
    .line 586
    .line 587
    :cond_f
    if-eqz v11, :cond_10

    .line 588
    .line 589
    :goto_14
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 590
    .line 591
    .line 592
    :cond_10
    add-int/lit8 v14, v14, 0x1

    .line 593
    .line 594
    move/from16 v6, v16

    .line 595
    .line 596
    move/from16 v7, v17

    .line 597
    .line 598
    const/16 v5, 0x64

    .line 599
    .line 600
    const/4 v13, 0x5

    .line 601
    goto/16 :goto_1

    .line 602
    .line 603
    :goto_15
    if-eqz v11, :cond_11

    .line 604
    .line 605
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 606
    .line 607
    .line 608
    :cond_11
    if-eqz v2, :cond_12

    .line 609
    .line 610
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 611
    .line 612
    .line 613
    :cond_12
    throw v0

    .line 614
    :cond_13
    move/from16 v16, v6

    .line 615
    .line 616
    move/from16 v17, v7

    .line 617
    .line 618
    invoke-virtual {v9}, Ld2/q;->zzj()Le7/a1;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 623
    .line 624
    const-string v5, "Failed to read events from database in reasonable time"

    .line 625
    .line 626
    invoke-virtual {v0, v5}, Le7/b1;->b(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    :goto_16
    const/4 v12, 0x0

    .line 630
    :goto_17
    if-eqz v12, :cond_14

    .line 631
    .line 632
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 633
    .line 634
    .line 635
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    move v5, v0

    .line 640
    goto :goto_18

    .line 641
    :cond_14
    move/from16 v5, v16

    .line 642
    .line 643
    :goto_18
    const/16 v6, 0x64

    .line 644
    .line 645
    if-eqz v3, :cond_15

    .line 646
    .line 647
    if-ge v5, v6, :cond_15

    .line 648
    .line 649
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    :cond_15
    invoke-virtual/range {p0 .. p0}, Ld2/q;->h()Le7/h;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    sget-object v7, Le7/h0;->P0:Le7/m0;

    .line 657
    .line 658
    const/4 v9, 0x0

    .line 659
    invoke-virtual {v0, v9, v7}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 664
    .line 665
    .line 666
    move-result v9

    .line 667
    move/from16 v0, v16

    .line 668
    .line 669
    :goto_19
    if-ge v0, v9, :cond_1b

    .line 670
    .line 671
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v10

    .line 675
    add-int/lit8 v11, v0, 0x1

    .line 676
    .line 677
    check-cast v10, Ln6/a;

    .line 678
    .line 679
    instance-of v0, v10, Le7/f0;

    .line 680
    .line 681
    if-eqz v0, :cond_17

    .line 682
    .line 683
    if-eqz v7, :cond_16

    .line 684
    .line 685
    :try_start_16
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v0, Le7/j2;

    .line 688
    .line 689
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 690
    .line 691
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 695
    .line 696
    .line 697
    move-result-wide v14
    :try_end_16
    .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_16} :catch_17

    .line 698
    :try_start_17
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Le7/j2;

    .line 701
    .line 702
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 708
    .line 709
    .line 710
    move-result-wide v18
    :try_end_17
    .catch Landroid/os/RemoteException; {:try_start_17 .. :try_end_17} :catch_16

    .line 711
    move-wide/from16 v25, v18

    .line 712
    .line 713
    goto :goto_1b

    .line 714
    :catch_16
    move-exception v0

    .line 715
    goto :goto_1a

    .line 716
    :catch_17
    move-exception v0

    .line 717
    const-wide/16 v14, 0x0

    .line 718
    .line 719
    :goto_1a
    move-wide/from16 v21, v14

    .line 720
    .line 721
    const-wide/16 v25, 0x0

    .line 722
    .line 723
    goto :goto_1c

    .line 724
    :cond_16
    const-wide/16 v14, 0x0

    .line 725
    .line 726
    const-wide/16 v25, 0x0

    .line 727
    .line 728
    :goto_1b
    :try_start_18
    check-cast v10, Le7/f0;

    .line 729
    .line 730
    invoke-interface {v2, v10, v4}, Le7/n0;->V(Le7/f0;Le7/k6;)V

    .line 731
    .line 732
    .line 733
    if-eqz v7, :cond_1a

    .line 734
    .line 735
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 740
    .line 741
    const-string v10, "Logging telemetry for logEvent from database"

    .line 742
    .line 743
    invoke-virtual {v0, v10}, Le7/b1;->b(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v0, Le7/j2;

    .line 749
    .line 750
    invoke-static {v0}, Le7/y0;->a(Le7/j2;)Le7/y0;

    .line 751
    .line 752
    .line 753
    move-result-object v18

    .line 754
    const/16 v19, 0x0

    .line 755
    .line 756
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v0, Le7/j2;

    .line 759
    .line 760
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 761
    .line 762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 766
    .line 767
    .line 768
    move-result-wide v23

    .line 769
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v0, Le7/j2;

    .line 772
    .line 773
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 779
    .line 780
    .line 781
    move-result-wide v20

    .line 782
    sub-long v12, v20, v25

    .line 783
    .line 784
    long-to-int v0, v12

    .line 785
    move/from16 v20, v0

    .line 786
    .line 787
    move-wide/from16 v21, v14

    .line 788
    .line 789
    invoke-virtual/range {v18 .. v24}, Le7/y0;->b(IIJJ)V
    :try_end_18
    .catch Landroid/os/RemoteException; {:try_start_18 .. :try_end_18} :catch_18

    .line 790
    .line 791
    .line 792
    goto/16 :goto_1e

    .line 793
    .line 794
    :catch_18
    move-exception v0

    .line 795
    move-wide/from16 v21, v14

    .line 796
    .line 797
    :goto_1c
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 798
    .line 799
    .line 800
    move-result-object v10

    .line 801
    iget-object v10, v10, Le7/a1;->o:Le7/b1;

    .line 802
    .line 803
    const-string v12, "Failed to send event to the service"

    .line 804
    .line 805
    invoke-virtual {v10, v12, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    if-eqz v7, :cond_1a

    .line 809
    .line 810
    const-wide/16 v12, 0x0

    .line 811
    .line 812
    cmp-long v0, v21, v12

    .line 813
    .line 814
    if-eqz v0, :cond_1a

    .line 815
    .line 816
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, Le7/j2;

    .line 819
    .line 820
    invoke-static {v0}, Le7/y0;->a(Le7/j2;)Le7/y0;

    .line 821
    .line 822
    .line 823
    move-result-object v18

    .line 824
    const/16 v19, 0xd

    .line 825
    .line 826
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v0, Le7/j2;

    .line 829
    .line 830
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 836
    .line 837
    .line 838
    move-result-wide v23

    .line 839
    iget-object v0, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v0, Le7/j2;

    .line 842
    .line 843
    iget-object v0, v0, Le7/j2;->v:Lb/z;

    .line 844
    .line 845
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 849
    .line 850
    .line 851
    move-result-wide v12

    .line 852
    sub-long v12, v12, v25

    .line 853
    .line 854
    long-to-int v0, v12

    .line 855
    move/from16 v20, v0

    .line 856
    .line 857
    invoke-virtual/range {v18 .. v24}, Le7/y0;->b(IIJJ)V

    .line 858
    .line 859
    .line 860
    goto :goto_1e

    .line 861
    :cond_17
    instance-of v0, v10, Le7/q6;

    .line 862
    .line 863
    if-eqz v0, :cond_18

    .line 864
    .line 865
    :try_start_19
    check-cast v10, Le7/q6;

    .line 866
    .line 867
    invoke-interface {v2, v10, v4}, Le7/n0;->g0(Le7/q6;Le7/k6;)V
    :try_end_19
    .catch Landroid/os/RemoteException; {:try_start_19 .. :try_end_19} :catch_19

    .line 868
    .line 869
    .line 870
    goto :goto_1e

    .line 871
    :catch_19
    move-exception v0

    .line 872
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 873
    .line 874
    .line 875
    move-result-object v10

    .line 876
    iget-object v10, v10, Le7/a1;->o:Le7/b1;

    .line 877
    .line 878
    const-string v12, "Failed to send user property to the service"

    .line 879
    .line 880
    goto :goto_1d

    .line 881
    :cond_18
    instance-of v0, v10, Le7/f;

    .line 882
    .line 883
    if-eqz v0, :cond_19

    .line 884
    .line 885
    :try_start_1a
    check-cast v10, Le7/f;

    .line 886
    .line 887
    invoke-interface {v2, v10, v4}, Le7/n0;->F(Le7/f;Le7/k6;)V
    :try_end_1a
    .catch Landroid/os/RemoteException; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 888
    .line 889
    .line 890
    goto :goto_1e

    .line 891
    :catch_1a
    move-exception v0

    .line 892
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 893
    .line 894
    .line 895
    move-result-object v10

    .line 896
    iget-object v10, v10, Le7/a1;->o:Le7/b1;

    .line 897
    .line 898
    const-string v12, "Failed to send conditional user property to the service"

    .line 899
    .line 900
    :goto_1d
    invoke-virtual {v10, v12, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    goto :goto_1e

    .line 904
    :cond_19
    invoke-virtual/range {p0 .. p0}, Ld2/q;->zzj()Le7/a1;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 909
    .line 910
    const-string v10, "Discarding data. Unrecognized parcel type."

    .line 911
    .line 912
    invoke-virtual {v0, v10}, Le7/b1;->b(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    :cond_1a
    :goto_1e
    move v0, v11

    .line 916
    goto/16 :goto_19

    .line 917
    .line 918
    :cond_1b
    add-int/lit8 v7, v17, 0x1

    .line 919
    .line 920
    move v0, v5

    .line 921
    move v5, v6

    .line 922
    move/from16 v6, v16

    .line 923
    .line 924
    goto/16 :goto_0

    .line 925
    .line 926
    :cond_1c
    return-void
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public final x(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Le7/o0;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/w4;->C()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v0, v0

    .line 21
    const-wide/16 v2, 0x3e8

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, Le7/a1;->o:Le7/b1;

    .line 32
    .line 33
    const-string v0, "Discarding data. Max runnable queue size reached"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Le7/b1;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Le7/w4;->q:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Le7/w4;->r:Le7/x4;

    .line 45
    .line 46
    const-wide/32 v0, 0xea60

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Le7/v;->b(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Le7/w4;->A()V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final y(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Le7/o0;->l()V

    invoke-virtual {p0}, Le7/j0;->t()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le7/w4;->I(Z)Le7/k6;

    move-result-object v0

    new-instance v1, Le7/v1;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v0, v2}, Le7/v1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v1}, Le7/w4;->x(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final z(Z)V
    .locals 2

    invoke-virtual {p0}, Le7/o0;->l()V

    invoke-virtual {p0}, Le7/j0;->t()V

    invoke-virtual {p0}, Le7/w4;->D()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le7/w4;->I(Z)Le7/k6;

    move-result-object p1

    new-instance v0, Li6/p;

    const/16 v1, 0x8

    invoke-direct {v0, p0, p1, v1}, Li6/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Le7/w4;->x(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
