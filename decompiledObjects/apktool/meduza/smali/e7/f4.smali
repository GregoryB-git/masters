.class public final Le7/f4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic o:Le7/j0;


# direct methods
.method public constructor <init>(Le7/k3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7/f4;->a:I

    .line 1
    iput-object p2, p0, Le7/f4;->e:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, p0, Le7/f4;->b:Ljava/lang/String;

    iput-object p3, p0, Le7/f4;->c:Ljava/lang/String;

    iput-object p4, p0, Le7/f4;->f:Ljava/lang/Object;

    iput-boolean p5, p0, Le7/f4;->d:Z

    iput-object p1, p0, Le7/f4;->o:Le7/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Le7/w4;Ljava/lang/String;Ljava/lang/String;Le7/k6;ZLcom/google/android/gms/internal/measurement/zzdq;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/f4;->a:I

    .line 2
    iput-object p2, p0, Le7/f4;->b:Ljava/lang/String;

    iput-object p3, p0, Le7/f4;->c:Ljava/lang/String;

    iput-object p4, p0, Le7/f4;->e:Ljava/lang/Object;

    iput-boolean p5, p0, Le7/f4;->d:Z

    iput-object p6, p0, Le7/f4;->f:Ljava/lang/Object;

    iput-object p1, p0, Le7/f4;->o:Le7/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    const-string v0, "Error returning bundle value to wrapper"

    .line 2
    .line 3
    iget v1, p0, Le7/f4;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object v0, p0, Le7/f4;->o:Le7/j0;

    .line 10
    .line 11
    check-cast v0, Le7/k3;

    .line 12
    .line 13
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Le7/j2;

    .line 16
    .line 17
    invoke-virtual {v0}, Le7/j2;->l()Le7/w4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Le7/f4;->e:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v3, v1

    .line 24
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    iget-object v4, p0, Le7/f4;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Le7/f4;->f:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v1

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v7, p0, Le7/f4;->d:Z

    .line 34
    .line 35
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Le7/w4;->I(Z)Le7/k6;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    new-instance v8, Le7/h5;

    .line 47
    .line 48
    move-object v1, v8

    .line 49
    move-object v2, v0

    .line 50
    invoke-direct/range {v1 .. v7}, Le7/h5;-><init>(Le7/w4;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Le7/k6;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v8}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_0
    new-instance v1, Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 60
    .line 61
    .line 62
    :try_start_0
    iget-object v2, p0, Le7/f4;->o:Le7/j0;

    .line 63
    .line 64
    move-object v3, v2

    .line 65
    check-cast v3, Le7/w4;

    .line 66
    .line 67
    iget-object v3, v3, Le7/w4;->e:Le7/n0;

    .line 68
    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    check-cast v2, Le7/w4;

    .line 72
    .line 73
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 78
    .line 79
    const-string v3, "Failed to get user properties; not connected to service"

    .line 80
    .line 81
    iget-object v4, p0, Le7/f4;->b:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v5, p0, Le7/f4;->c:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2, v3, v4, v5}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    iget-object v2, p0, Le7/f4;->e:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Le7/k6;

    .line 92
    .line 93
    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, Le7/f4;->b:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v4, p0, Le7/f4;->c:Ljava/lang/String;

    .line 99
    .line 100
    iget-boolean v5, p0, Le7/f4;->d:Z

    .line 101
    .line 102
    iget-object v6, p0, Le7/f4;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, Le7/k6;

    .line 105
    .line 106
    invoke-interface {v3, v2, v4, v5, v6}, Le7/n0;->O2(Ljava/lang/String;Ljava/lang/String;ZLe7/k6;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2}, Le7/r6;->x(Ljava/util/List;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v2, p0, Le7/f4;->o:Le7/j0;

    .line 115
    .line 116
    check-cast v2, Le7/w4;

    .line 117
    .line 118
    invoke-virtual {v2}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v2

    .line 123
    goto :goto_3

    .line 124
    :catch_0
    move-exception v2

    .line 125
    :try_start_1
    iget-object v3, p0, Le7/f4;->o:Le7/j0;

    .line 126
    .line 127
    check-cast v3, Le7/w4;

    .line 128
    .line 129
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-object v3, v3, Le7/a1;->o:Le7/b1;

    .line 134
    .line 135
    const-string v4, "Failed to get user properties; remote exception"

    .line 136
    .line 137
    iget-object v5, p0, Le7/f4;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v3, v4, v5, v2}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    .line 141
    .line 142
    :goto_1
    iget-object v2, p0, Le7/f4;->o:Le7/j0;

    .line 143
    .line 144
    check-cast v2, Le7/w4;

    .line 145
    .line 146
    invoke-virtual {v2}, Ld2/q;->k()Le7/r6;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iget-object v3, p0, Le7/f4;->f:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    :try_start_2
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/measurement/zzdq;->zza(Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catch_1
    move-exception v1

    .line 162
    iget-object v2, v2, Ld2/q;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Le7/j2;

    .line 165
    .line 166
    invoke-virtual {v2}, Le7/j2;->zzj()Le7/a1;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v2, v2, Le7/a1;->r:Le7/b1;

    .line 171
    .line 172
    invoke-virtual {v2, v0, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-void

    .line 176
    :goto_3
    iget-object v3, p0, Le7/f4;->o:Le7/j0;

    .line 177
    .line 178
    check-cast v3, Le7/w4;

    .line 179
    .line 180
    invoke-virtual {v3}, Ld2/q;->k()Le7/r6;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    iget-object v4, p0, Le7/f4;->f:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    :try_start_3
    invoke-interface {v4, v1}, Lcom/google/android/gms/internal/measurement/zzdq;->zza(Landroid/os/Bundle;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :catch_2
    move-exception v1

    .line 196
    iget-object v3, v3, Ld2/q;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v3, Le7/j2;

    .line 199
    .line 200
    invoke-virtual {v3}, Le7/j2;->zzj()Le7/a1;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    iget-object v3, v3, Le7/a1;->r:Le7/b1;

    .line 205
    .line 206
    invoke-virtual {v3, v0, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :goto_4
    throw v2

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
