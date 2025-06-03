.class public final synthetic Le7/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Le7/k6;

.field public synthetic c:Landroid/os/IInterface;

.field public synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/f;Le7/k6;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/k2;->a:I

    .line 1
    iput-object p2, p0, Le7/k2;->d:Ljava/lang/Object;

    iput-object p3, p0, Le7/k2;->b:Le7/k6;

    iput-object p1, p0, Le7/k2;->c:Landroid/os/IInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Le7/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7/k2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/k2;->c:Landroid/os/IInterface;

    iput-object p2, p0, Le7/k2;->b:Le7/k6;

    iput-object p3, p0, Le7/k2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le7/w4;Le7/k6;Lcom/google/android/gms/internal/measurement/zzdq;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le7/k2;->a:I

    .line 3
    iput-object p2, p0, Le7/k2;->b:Le7/k6;

    iput-object p3, p0, Le7/k2;->c:Landroid/os/IInterface;

    iput-object p1, p0, Le7/k2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Le7/k2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 12
    .line 13
    invoke-virtual {v0}, Le7/i6;->c0()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Le7/f;

    .line 19
    .line 20
    iget-object v0, v0, Le7/f;->c:Le7/q6;

    .line 21
    .line 22
    invoke-virtual {v0}, Le7/q6;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 29
    .line 30
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 33
    .line 34
    iget-object v1, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Le7/f;

    .line 37
    .line 38
    iget-object v2, p0, Le7/k2;->b:Le7/k6;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Le7/i6;->n(Le7/f;Le7/k6;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 45
    .line 46
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 49
    .line 50
    iget-object v1, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Le7/f;

    .line 53
    .line 54
    iget-object v2, p0, Le7/k2;->b:Le7/k6;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Le7/i6;->I(Le7/f;Le7/k6;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_1
    iget-object v0, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 61
    .line 62
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 63
    .line 64
    iget-object v1, p0, Le7/k2;->b:Le7/k6;

    .line 65
    .line 66
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Le7/e;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzig;->zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Le7/e;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_1
    const-string v0, "Failed to get app instance id"

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    :try_start_0
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Le7/w4;

    .line 80
    .line 81
    invoke-virtual {v2}, Ld2/q;->j()Le7/l1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Le7/l1;->y()Le7/e3;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Le7/e3;->p()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_1

    .line 94
    .line 95
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Le7/w4;

    .line 98
    .line 99
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v2, v2, Le7/a1;->t:Le7/b1;

    .line 104
    .line 105
    const-string v3, "Analytics storage consent denied; will not get app instance id"

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Le7/b1;->b(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Le7/w4;

    .line 113
    .line 114
    invoke-virtual {v2}, Le7/o0;->o()Le7/k3;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2, v1}, Le7/k3;->P(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Le7/w4;

    .line 124
    .line 125
    invoke-virtual {v2}, Ld2/q;->j()Le7/l1;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iget-object v2, v2, Le7/l1;->q:Le7/r1;

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Le7/r1;->b(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v3, v2

    .line 138
    check-cast v3, Le7/w4;

    .line 139
    .line 140
    iget-object v3, v3, Le7/w4;->e:Le7/n0;

    .line 141
    .line 142
    if-nez v3, :cond_2

    .line 143
    .line 144
    check-cast v2, Le7/w4;

    .line 145
    .line 146
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 151
    .line 152
    invoke-virtual {v2, v0}, Le7/b1;->b(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_2
    iget-object v2, p0, Le7/k2;->b:Le7/k6;

    .line 157
    .line 158
    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object v2, p0, Le7/k2;->b:Le7/k6;

    .line 162
    .line 163
    invoke-interface {v3, v2}, Le7/n0;->V1(Le7/k6;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_3

    .line 168
    .line 169
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, Le7/w4;

    .line 172
    .line 173
    invoke-virtual {v2}, Le7/o0;->o()Le7/k3;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2, v1}, Le7/k3;->P(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, Le7/w4;

    .line 183
    .line 184
    invoke-virtual {v2}, Ld2/q;->j()Le7/l1;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-object v2, v2, Le7/l1;->q:Le7/r1;

    .line 189
    .line 190
    invoke-virtual {v2, v1}, Le7/r1;->b(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v2, Le7/w4;

    .line 196
    .line 197
    invoke-virtual {v2}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    goto :goto_3

    .line 203
    :catch_0
    move-exception v2

    .line 204
    :try_start_1
    iget-object v3, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v3, Le7/w4;

    .line 207
    .line 208
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    iget-object v3, v3, Le7/a1;->o:Le7/b1;

    .line 213
    .line 214
    invoke-virtual {v3, v0, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    .line 216
    .line 217
    :goto_2
    iget-object v0, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Le7/w4;

    .line 220
    .line 221
    invoke-virtual {v0}, Ld2/q;->k()Le7/r6;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v2, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 226
    .line 227
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 228
    .line 229
    invoke-virtual {v0, v1, v2}, Le7/r6;->N(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdq;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :goto_3
    iget-object v2, p0, Le7/k2;->d:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Le7/w4;

    .line 236
    .line 237
    invoke-virtual {v2}, Ld2/q;->k()Le7/r6;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    iget-object v3, p0, Le7/k2;->c:Landroid/os/IInterface;

    .line 242
    .line 243
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 244
    .line 245
    invoke-virtual {v2, v1, v3}, Le7/r6;->N(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdq;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
