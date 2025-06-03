.class public final Lcom/google/android/gms/common/internal/h;
.super Lcom/google/android/gms/internal/common/zzh;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/a;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/common/zzh;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/internal/a;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x7

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    iget v0, p1, Landroid/os/Message;->what:I

    .line 19
    .line 20
    if-eq v0, v4, :cond_0

    .line 21
    .line 22
    if-eq v0, v5, :cond_0

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    :cond_0
    move v2, v5

    .line 27
    :cond_1
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lm6/k0;

    .line 32
    .line 33
    invoke-virtual {p1}, Lm6/k0;->b()V

    .line 34
    .line 35
    .line 36
    monitor-enter p1

    .line 37
    :try_start_0
    iput-object v6, p1, Lm6/k0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    iget-object v0, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    monitor-enter v0

    .line 47
    :try_start_1
    iget-object v1, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw p1

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    throw v0

    .line 64
    :cond_2
    :goto_0
    return-void

    .line 65
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    .line 66
    .line 67
    const/4 v1, 0x4

    .line 68
    const/4 v7, 0x5

    .line 69
    if-eq v0, v5, :cond_5

    .line 70
    .line 71
    if-eq v0, v3, :cond_5

    .line 72
    .line 73
    if-ne v0, v1, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->enableLocalFallback()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    .line 84
    .line 85
    if-ne v0, v7, :cond_6

    .line 86
    .line 87
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->isConnecting()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_18

    .line 94
    .line 95
    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 96
    .line 97
    const/16 v8, 0x8

    .line 98
    .line 99
    const/4 v9, 0x3

    .line 100
    if-ne v0, v1, :cond_a

    .line 101
    .line 102
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 103
    .line 104
    new-instance v1, Lj6/b;

    .line 105
    .line 106
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 107
    .line 108
    invoke-direct {v1, p1}, Lj6/b;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/a;->zzg(Lcom/google/android/gms/common/internal/a;Lj6/b;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 115
    .line 116
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zzo(Lcom/google/android/gms/common/internal/a;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zzm(Lcom/google/android/gms/common/internal/a;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-static {p1, v9, v6}, Lcom/google/android/gms/common/internal/a;->zzi(Lcom/google/android/gms/common/internal/a;ILandroid/os/IInterface;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zza(Lcom/google/android/gms/common/internal/a;)Lj6/b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zza(Lcom/google/android/gms/common/internal/a;)Lj6/b;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_2

    .line 148
    :cond_9
    new-instance p1, Lj6/b;

    .line 149
    .line 150
    invoke-direct {p1, v8}, Lj6/b;-><init>(I)V

    .line 151
    .line 152
    .line 153
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 154
    .line 155
    iget-object v0, v0, Lcom/google/android/gms/common/internal/a;->zzc:Lcom/google/android/gms/common/internal/a$c;

    .line 156
    .line 157
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/a$c;->a(Lj6/b;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lj6/b;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_a
    if-ne v0, v7, :cond_c

    .line 167
    .line 168
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 169
    .line 170
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zza(Lcom/google/android/gms/common/internal/a;)Lj6/b;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-eqz v0, :cond_b

    .line 175
    .line 176
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zza(Lcom/google/android/gms/common/internal/a;)Lj6/b;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    goto :goto_3

    .line 181
    :cond_b
    new-instance p1, Lj6/b;

    .line 182
    .line 183
    invoke-direct {p1, v8}, Lj6/b;-><init>(I)V

    .line 184
    .line 185
    .line 186
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 187
    .line 188
    iget-object v0, v0, Lcom/google/android/gms/common/internal/a;->zzc:Lcom/google/android/gms/common/internal/a$c;

    .line 189
    .line 190
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/a$c;->a(Lj6/b;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 194
    .line 195
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lj6/b;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_c
    if-ne v0, v9, :cond_e

    .line 200
    .line 201
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 202
    .line 203
    instance-of v1, v0, Landroid/app/PendingIntent;

    .line 204
    .line 205
    if-eqz v1, :cond_d

    .line 206
    .line 207
    move-object v6, v0

    .line 208
    check-cast v6, Landroid/app/PendingIntent;

    .line 209
    .line 210
    :cond_d
    new-instance v0, Lj6/b;

    .line 211
    .line 212
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 213
    .line 214
    invoke-direct {v0, p1, v6}, Lj6/b;-><init>(ILandroid/app/PendingIntent;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 218
    .line 219
    iget-object p1, p1, Lcom/google/android/gms/common/internal/a;->zzc:Lcom/google/android/gms/common/internal/a$c;

    .line 220
    .line 221
    invoke-interface {p1, v0}, Lcom/google/android/gms/common/internal/a$c;->a(Lj6/b;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 225
    .line 226
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lj6/b;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_e
    const/4 v1, 0x6

    .line 231
    if-ne v0, v1, :cond_10

    .line 232
    .line 233
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 234
    .line 235
    invoke-static {v0, v7, v6}, Lcom/google/android/gms/common/internal/a;->zzi(Lcom/google/android/gms/common/internal/a;ILandroid/os/IInterface;)V

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 239
    .line 240
    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzb(Lcom/google/android/gms/common/internal/a;)Lcom/google/android/gms/common/internal/a$a;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-eqz v1, :cond_f

    .line 245
    .line 246
    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzb(Lcom/google/android/gms/common/internal/a;)Lcom/google/android/gms/common/internal/a$a;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget v1, p1, Landroid/os/Message;->arg2:I

    .line 251
    .line 252
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/a$a;->r(I)V

    .line 253
    .line 254
    .line 255
    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 256
    .line 257
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 258
    .line 259
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionSuspended(I)V

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 263
    .line 264
    invoke-static {p1, v7, v5, v6}, Lcom/google/android/gms/common/internal/a;->zzn(Lcom/google/android/gms/common/internal/a;IILandroid/os/IInterface;)Z

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_10
    if-ne v0, v4, :cond_12

    .line 269
    .line 270
    iget-object v0, p0, Lcom/google/android/gms/common/internal/h;->a:Lcom/google/android/gms/common/internal/a;

    .line 271
    .line 272
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_11

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v0, p1

    .line 282
    check-cast v0, Lm6/k0;

    .line 283
    .line 284
    invoke-virtual {v0}, Lm6/k0;->b()V

    .line 285
    .line 286
    .line 287
    monitor-enter v0

    .line 288
    :try_start_3
    iput-object v6, v0, Lm6/k0;->a:Ljava/lang/Object;

    .line 289
    .line 290
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 291
    iget-object p1, v0, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 292
    .line 293
    invoke-static {p1}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    monitor-enter p1

    .line 298
    :try_start_4
    iget-object v1, v0, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 299
    .line 300
    invoke-static {v1}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    monitor-exit p1

    .line 308
    return-void

    .line 309
    :catchall_2
    move-exception v0

    .line 310
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 311
    throw v0

    .line 312
    :catchall_3
    move-exception p1

    .line 313
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 314
    throw p1

    .line 315
    :cond_12
    :goto_4
    iget v0, p1, Landroid/os/Message;->what:I

    .line 316
    .line 317
    if-eq v0, v4, :cond_13

    .line 318
    .line 319
    if-eq v0, v5, :cond_13

    .line 320
    .line 321
    if-ne v0, v3, :cond_14

    .line 322
    .line 323
    :cond_13
    move v2, v5

    .line 324
    :cond_14
    if-eqz v2, :cond_17

    .line 325
    .line 326
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p1, Lm6/k0;

    .line 329
    .line 330
    monitor-enter p1

    .line 331
    :try_start_6
    iget-object v0, p1, Lm6/k0;->a:Ljava/lang/Object;

    .line 332
    .line 333
    iget-boolean v1, p1, Lm6/k0;->b:Z

    .line 334
    .line 335
    if-eqz v1, :cond_15

    .line 336
    .line 337
    const-string v1, "GmsClient"

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    new-instance v3, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const-string v4, "Callback proxy "

    .line 349
    .line 350
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v2, " being reused. This is not safe."

    .line 357
    .line 358
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    :cond_15
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 369
    if-eqz v0, :cond_16

    .line 370
    .line 371
    :try_start_7
    invoke-virtual {p1, v0}, Lm6/k0;->a(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :catch_0
    move-exception p1

    .line 376
    throw p1

    .line 377
    :cond_16
    :goto_5
    monitor-enter p1

    .line 378
    :try_start_8
    iput-boolean v5, p1, Lm6/k0;->b:Z

    .line 379
    .line 380
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 381
    monitor-enter p1

    .line 382
    :try_start_9
    iput-object v6, p1, Lm6/k0;->a:Ljava/lang/Object;

    .line 383
    .line 384
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 385
    iget-object v0, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 386
    .line 387
    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    monitor-enter v0

    .line 392
    :try_start_a
    iget-object v1, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 393
    .line 394
    invoke-static {v1}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    monitor-exit v0

    .line 402
    return-void

    .line 403
    :catchall_4
    move-exception p1

    .line 404
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 405
    throw p1

    .line 406
    :catchall_5
    move-exception v0

    .line 407
    :try_start_b
    monitor-exit p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 408
    throw v0

    .line 409
    :catchall_6
    move-exception v0

    .line 410
    :try_start_c
    monitor-exit p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 411
    throw v0

    .line 412
    :catchall_7
    move-exception v0

    .line 413
    :try_start_d
    monitor-exit p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 414
    throw v0

    .line 415
    :cond_17
    const-string p1, "Don\'t know how to handle message: "

    .line 416
    .line 417
    invoke-static {p1, v0}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    new-instance v0, Ljava/lang/Exception;

    .line 422
    .line 423
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v1, "GmsClient"

    .line 427
    .line 428
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_18
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p1, Lm6/k0;

    .line 435
    .line 436
    invoke-virtual {p1}, Lm6/k0;->b()V

    .line 437
    .line 438
    .line 439
    monitor-enter p1

    .line 440
    :try_start_e
    iput-object v6, p1, Lm6/k0;->a:Ljava/lang/Object;

    .line 441
    .line 442
    monitor-exit p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 443
    iget-object v0, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 444
    .line 445
    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    monitor-enter v0

    .line 450
    :try_start_f
    iget-object v1, p1, Lm6/k0;->c:Lcom/google/android/gms/common/internal/a;

    .line 451
    .line 452
    invoke-static {v1}, Lcom/google/android/gms/common/internal/a;->zzf(Lcom/google/android/gms/common/internal/a;)Ljava/util/ArrayList;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    monitor-exit v0

    .line 460
    return-void

    .line 461
    :catchall_8
    move-exception p1

    .line 462
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 463
    throw p1

    .line 464
    :catchall_9
    move-exception v0

    .line 465
    :try_start_10
    monitor-exit p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 466
    throw v0
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
