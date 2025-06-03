.class public final Le7/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Le7/j0;


# direct methods
.method public constructor <init>(Le7/k3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7/e4;->a:I

    .line 1
    iput-object p2, p0, Le7/e4;->d:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, p0, Le7/e4;->b:Ljava/lang/String;

    iput-object p3, p0, Le7/e4;->c:Ljava/lang/String;

    iput-object p4, p0, Le7/e4;->e:Ljava/lang/Object;

    iput-object p1, p0, Le7/e4;->f:Le7/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Le7/w4;Ljava/lang/String;Ljava/lang/String;Le7/k6;Lcom/google/android/gms/internal/measurement/zzdq;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7/e4;->a:I

    .line 2
    iput-object p2, p0, Le7/e4;->b:Ljava/lang/String;

    iput-object p3, p0, Le7/e4;->c:Ljava/lang/String;

    iput-object p4, p0, Le7/e4;->d:Ljava/lang/Object;

    iput-object p5, p0, Le7/e4;->e:Ljava/lang/Object;

    iput-object p1, p0, Le7/e4;->f:Le7/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Le7/e4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/e4;->f:Le7/j0;

    .line 8
    .line 9
    check-cast v0, Le7/k3;

    .line 10
    .line 11
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Le7/j2;

    .line 14
    .line 15
    invoke-virtual {v0}, Le7/j2;->l()Le7/w4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Le7/e4;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    iget-object v4, p0, Le7/e4;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p0, Le7/e4;->e:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v5, v1

    .line 29
    check-cast v5, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {v0, v1}, Le7/w4;->I(Z)Le7/k6;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v7, Le7/f5;

    .line 43
    .line 44
    move-object v1, v7

    .line 45
    move-object v2, v0

    .line 46
    invoke-direct/range {v1 .. v6}, Le7/f5;-><init>(Le7/w4;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Le7/k6;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v7}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    :try_start_0
    iget-object v1, p0, Le7/e4;->f:Le7/j0;

    .line 59
    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Le7/w4;

    .line 62
    .line 63
    iget-object v2, v2, Le7/w4;->e:Le7/n0;

    .line 64
    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    check-cast v1, Le7/w4;

    .line 68
    .line 69
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 74
    .line 75
    const-string v2, "Failed to get conditional properties; not connected to service"

    .line 76
    .line 77
    iget-object v3, p0, Le7/e4;->b:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v4, p0, Le7/e4;->c:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v1, v2, v3, v4}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    iget-object v1, p0, Le7/e4;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Le7/k6;

    .line 88
    .line 89
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Le7/e4;->b:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v3, p0, Le7/e4;->c:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v4, p0, Le7/e4;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Le7/k6;

    .line 99
    .line 100
    invoke-interface {v2, v1, v3, v4}, Le7/n0;->T2(Ljava/lang/String;Ljava/lang/String;Le7/k6;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Le7/r6;->g0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, Le7/e4;->f:Le7/j0;

    .line 109
    .line 110
    check-cast v1, Le7/w4;

    .line 111
    .line 112
    invoke-virtual {v1}, Le7/w4;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception v1

    .line 117
    goto :goto_2

    .line 118
    :catch_0
    move-exception v1

    .line 119
    :try_start_1
    iget-object v2, p0, Le7/e4;->f:Le7/j0;

    .line 120
    .line 121
    check-cast v2, Le7/w4;

    .line 122
    .line 123
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 128
    .line 129
    const-string v3, "Failed to get conditional properties; remote exception"

    .line 130
    .line 131
    iget-object v4, p0, Le7/e4;->b:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v5, p0, Le7/e4;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v2, v4, v5, v1, v3}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    :goto_1
    iget-object v1, p0, Le7/e4;->f:Le7/j0;

    .line 139
    .line 140
    check-cast v1, Le7/w4;

    .line 141
    .line 142
    invoke-virtual {v1}, Ld2/q;->k()Le7/r6;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v2, p0, Le7/e4;->e:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 149
    .line 150
    invoke-virtual {v1, v2, v0}, Le7/r6;->H(Lcom/google/android/gms/internal/measurement/zzdq;Ljava/util/ArrayList;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_2
    iget-object v2, p0, Le7/e4;->f:Le7/j0;

    .line 155
    .line 156
    check-cast v2, Le7/w4;

    .line 157
    .line 158
    invoke-virtual {v2}, Ld2/q;->k()Le7/r6;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget-object v3, p0, Le7/e4;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdq;

    .line 165
    .line 166
    invoke-virtual {v2, v3, v0}, Le7/r6;->H(Lcom/google/android/gms/internal/measurement/zzdq;Ljava/util/ArrayList;)V

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
