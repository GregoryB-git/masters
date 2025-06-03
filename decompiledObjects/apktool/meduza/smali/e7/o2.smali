.class public final synthetic Le7/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/io/Serializable;

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzdq;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/o2;->a:I

    .line 1
    iput-object p2, p0, Le7/o2;->c:Ljava/lang/Object;

    iput-object p3, p0, Le7/o2;->b:Ljava/io/Serializable;

    iput-object p4, p0, Le7/o2;->d:Ljava/lang/Object;

    iput-object p1, p0, Le7/o2;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ln6/a;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Le7/o2;->a:I

    iput-object p1, p0, Le7/o2;->c:Ljava/lang/Object;

    iput-object p2, p0, Le7/o2;->b:Ljava/io/Serializable;

    iput-object p3, p0, Le7/o2;->d:Ljava/lang/Object;

    iput-object p4, p0, Le7/o2;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Le7/o2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/o2;->e:Ljava/lang/Object;

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
    iget-object v1, p0, Le7/o2;->c:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v6, v1

    .line 20
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 21
    .line 22
    iget-object v1, p0, Le7/o2;->b:Ljava/io/Serializable;

    .line 23
    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p0, Le7/o2;->d:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Le7/w4;->I(Z)Le7/k6;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v7, Le7/e4;

    .line 44
    .line 45
    move-object v1, v7

    .line 46
    move-object v2, v0

    .line 47
    invoke-direct/range {v1 .. v6}, Le7/e4;-><init>(Le7/w4;Ljava/lang/String;Ljava/lang/String;Le7/k6;Lcom/google/android/gms/internal/measurement/zzdq;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v7}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    iget-object v0, p0, Le7/o2;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 57
    .line 58
    iget-object v1, p0, Le7/o2;->b:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v2, p0, Le7/o2;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Le7/d6;

    .line 65
    .line 66
    iget-object v3, p0, Le7/o2;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Le7/s0;

    .line 69
    .line 70
    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzig;->zza(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Le7/d6;Le7/s0;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_0
    iget-object v0, p0, Le7/o2;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Le7/w4;

    .line 77
    .line 78
    iget-object v1, p0, Le7/o2;->b:Ljava/io/Serializable;

    .line 79
    .line 80
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 81
    .line 82
    iget-object v2, p0, Le7/o2;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Le7/k6;

    .line 85
    .line 86
    iget-object v3, p0, Le7/o2;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Landroid/os/Bundle;

    .line 89
    .line 90
    monitor-enter v1

    .line 91
    :try_start_0
    iget-object v4, v0, Le7/w4;->e:Le7/n0;

    .line 92
    .line 93
    if-nez v4, :cond_0

    .line 94
    .line 95
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 100
    .line 101
    const-string v3, "Failed to request trigger URIs; not connected to service"

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Le7/b1;->b(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance v5, Le7/a5;

    .line 111
    .line 112
    invoke-direct {v5, v1}, Le7/a5;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v4, v2, v3, v5}, Le7/n0;->h2(Le7/k6;Landroid/os/Bundle;Le7/p0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :catch_0
    move-exception v2

    .line 125
    :try_start_1
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 130
    .line 131
    const-string v3, "Failed to request trigger URIs; remote exception"

    .line 132
    .line 133
    invoke-virtual {v0, v3, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 137
    .line 138
    .line 139
    :goto_1
    monitor-exit v1

    .line 140
    return-void

    .line 141
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw v0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
