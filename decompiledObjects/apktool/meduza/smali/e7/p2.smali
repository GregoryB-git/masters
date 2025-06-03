.class public final synthetic Le7/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/String;

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzdq;Le7/f0;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/p2;->a:I

    .line 1
    iput-object p2, p0, Le7/p2;->c:Ljava/lang/Object;

    iput-object p3, p0, Le7/p2;->d:Ljava/lang/Object;

    iput-object p4, p0, Le7/p2;->b:Ljava/lang/String;

    iput-object p1, p0, Le7/p2;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Landroid/os/Bundle;Ljava/lang/String;Le7/k6;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7/p2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/p2;->c:Ljava/lang/Object;

    iput-object p2, p0, Le7/p2;->d:Ljava/lang/Object;

    iput-object p3, p0, Le7/p2;->b:Ljava/lang/String;

    iput-object p4, p0, Le7/p2;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le7/w4;Le7/f0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdq;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le7/p2;->a:I

    .line 3
    iput-object p2, p0, Le7/p2;->c:Ljava/lang/Object;

    iput-object p3, p0, Le7/p2;->b:Ljava/lang/String;

    iput-object p4, p0, Le7/p2;->d:Ljava/lang/Object;

    iput-object p1, p0, Le7/p2;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Le7/p2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Le7/j2;

    .line 12
    .line 13
    invoke-virtual {v0}, Le7/j2;->l()Le7/w4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Le7/p2;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 20
    .line 21
    iget-object v2, p0, Le7/p2;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Le7/f0;

    .line 24
    .line 25
    iget-object v3, p0, Le7/p2;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ld2/q;->k()Le7/r6;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v5, Lj6/f;->b:Lj6/f;

    .line 41
    .line 42
    invoke-virtual {v4}, Ld2/q;->zza()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const v6, 0xbdfcb8

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v4, v6}, Lj6/f;->c(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v2, v2, Le7/a1;->r:Le7/b1;

    .line 60
    .line 61
    const-string v3, "Not bundling data. Service unavailable or out of date"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Le7/b1;->b(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ld2/q;->k()Le7/r6;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const/4 v2, 0x0

    .line 71
    new-array v2, v2, [B

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Le7/r6;->J(Lcom/google/android/gms/internal/measurement/zzdq;[B)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance v4, Le7/p2;

    .line 78
    .line 79
    invoke-direct {v4, v0, v2, v3, v1}, Le7/p2;-><init>(Le7/w4;Le7/f0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdq;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v4}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, Le7/p2;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 89
    .line 90
    iget-object v1, p0, Le7/p2;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Landroid/os/Bundle;

    .line 93
    .line 94
    iget-object v2, p0, Le7/p2;->b:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v3, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Le7/k6;

    .line 99
    .line 100
    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzig;->zza(Lcom/google/android/gms/measurement/internal/zzig;Landroid/os/Bundle;Ljava/lang/String;Le7/k6;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_1
    const/4 v0, 0x0

    .line 105
    :try_start_0
    iget-object v1, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v2, v1

    .line 108
    check-cast v2, Le7/w4;

    .line 109
    .line 110
    iget-object v2, v2, Le7/w4;->e:Le7/n0;

    .line 111
    .line 112
    if-nez v2, :cond_1

    .line 113
    .line 114
    check-cast v1, Le7/w4;

    .line 115
    .line 116
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 121
    .line 122
    const-string v2, "Discarding data. Failed to send event to service to bundle"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_1
    iget-object v1, p0, Le7/p2;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Le7/f0;

    .line 131
    .line 132
    iget-object v3, p0, Le7/p2;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {v2, v1, v3}, Le7/n0;->V2(Le7/f0;Ljava/lang/String;)[B

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v1, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Le7/w4;

    .line 141
    .line 142
    invoke-virtual {v1}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :catchall_0
    move-exception v1

    .line 147
    goto :goto_3

    .line 148
    :catch_0
    move-exception v1

    .line 149
    :try_start_1
    iget-object v2, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Le7/w4;

    .line 152
    .line 153
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 158
    .line 159
    const-string v3, "Failed to send event to the service to bundle"

    .line 160
    .line 161
    invoke-virtual {v2, v3, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    .line 163
    .line 164
    :goto_2
    iget-object v1, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, Le7/w4;

    .line 167
    .line 168
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object v2, p0, Le7/p2;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 175
    .line 176
    invoke-virtual {v1, v2, v0}, Le7/r6;->J(Lcom/google/android/gms/internal/measurement/zzdq;[B)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :goto_3
    iget-object v2, p0, Le7/p2;->e:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, Le7/w4;

    .line 183
    .line 184
    invoke-virtual {v2}, Ld2/q;->k()Le7/r6;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-object v3, p0, Le7/p2;->d:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 191
    .line 192
    invoke-virtual {v2, v3, v0}, Le7/r6;->J(Lcom/google/android/gms/internal/measurement/zzdq;[B)V

    .line 193
    .line 194
    .line 195
    throw v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
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
