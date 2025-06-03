.class public final synthetic Le7/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/io/Serializable;

.field public synthetic d:Landroid/os/Parcelable;

.field public synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb1/v;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/y4;->a:I

    .line 1
    iput-object p2, p0, Le7/y4;->b:Ljava/lang/Object;

    iput-object p3, p0, Le7/y4;->c:Ljava/io/Serializable;

    iput-object p4, p0, Le7/y4;->d:Landroid/os/Parcelable;

    iput-object p1, p0, Le7/y4;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le7/w4;Ljava/util/concurrent/atomic/AtomicReference;Le7/k6;Le7/d6;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7/y4;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/y4;->b:Ljava/lang/Object;

    iput-object p2, p0, Le7/y4;->c:Ljava/io/Serializable;

    iput-object p3, p0, Le7/y4;->d:Landroid/os/Parcelable;

    iput-object p4, p0, Le7/y4;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Le7/y4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_2

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/y4;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Le7/w4;

    .line 10
    .line 11
    iget-object v1, p0, Le7/y4;->c:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    iget-object v2, p0, Le7/y4;->d:Landroid/os/Parcelable;

    .line 16
    .line 17
    check-cast v2, Le7/k6;

    .line 18
    .line 19
    iget-object v3, p0, Le7/y4;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Le7/d6;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-object v4, v0, Le7/w4;->e:Le7/n0;

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 33
    .line 34
    const-string v3, "[sgtm] Failed to get upload batches; not connected to service"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Le7/b1;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Le7/c5;

    .line 44
    .line 45
    invoke-direct {v5, v1}, Le7/c5;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v4, v2, v3, v5}, Le7/n0;->N1(Le7/k6;Le7/d6;Le7/s0;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v2

    .line 58
    :try_start_1
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 63
    .line 64
    const-string v3, "[sgtm] Failed to get upload batches; remote exception"

    .line 65
    .line 66
    invoke-virtual {v0, v3, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 70
    .line 71
    .line 72
    :goto_0
    monitor-exit v1

    .line 73
    return-void

    .line 74
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw v0

    .line 76
    :goto_2
    iget-object v0, p0, Le7/y4;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lb1/v;

    .line 79
    .line 80
    iget-object v0, v0, Lb1/v;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Le7/i6;

    .line 83
    .line 84
    invoke-virtual {v0}, Le7/i6;->b0()Le7/r6;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v0, p0, Le7/y4;->c:Ljava/io/Serializable;

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    check-cast v2, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, p0, Le7/y4;->d:Landroid/os/Parcelable;

    .line 94
    .line 95
    move-object v3, v0

    .line 96
    check-cast v3, Landroid/os/Bundle;

    .line 97
    .line 98
    iget-object v0, p0, Le7/y4;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lb1/v;

    .line 101
    .line 102
    iget-object v0, v0, Lb1/v;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Le7/i6;

    .line 105
    .line 106
    invoke-virtual {v0}, Le7/i6;->zzb()Lv6/b;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lb/z;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    const/4 v7, 0x0

    .line 120
    const-string v4, "auto"

    .line 121
    .line 122
    invoke-virtual/range {v1 .. v7}, Le7/r6;->y(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Le7/f0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p0, Le7/y4;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lb1/v;

    .line 129
    .line 130
    iget-object v1, v1, Lb1/v;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Le7/i6;

    .line 133
    .line 134
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Le7/y4;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v1, v0, v2}, Le7/i6;->p(Le7/f0;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
