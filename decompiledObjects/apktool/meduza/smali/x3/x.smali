.class public final Lx3/x;
.super Lo4/m;
.source "SourceFile"

# interfaces
.implements Lv5/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/x$a;,
        Lx3/x$b;
    }
.end annotation


# instance fields
.field public final K0:Landroid/content/Context;

.field public final L0:Lx3/l$a;

.field public final M0:Lx3/m;

.field public N0:I

.field public O0:Z

.field public P0:Lv3/i0;

.field public Q0:Lv3/i0;

.field public R0:J

.field public S0:Z

.field public T0:Z

.field public U0:Z

.field public V0:Lv3/j1$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo4/h;Landroid/os/Handler;Lv3/d0$b;Lx3/s;)V
    .locals 2

    const/4 v0, 0x1

    const v1, 0x472c4400    # 44100.0f

    invoke-direct {p0, v0, p2, v1}, Lo4/m;-><init>(ILo4/h;F)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lx3/x;->K0:Landroid/content/Context;

    iput-object p5, p0, Lx3/x;->M0:Lx3/m;

    new-instance p1, Lx3/l$a;

    invoke-direct {p1, p3, p4}, Lx3/l$a;-><init>(Landroid/os/Handler;Lv3/d0$b;)V

    iput-object p1, p0, Lx3/x;->L0:Lx3/l$a;

    new-instance p1, Lx3/x$b;

    invoke-direct {p1, p0}, Lx3/x$b;-><init>(Lx3/x;)V

    iput-object p1, p5, Lx3/s;->r:Lx3/m$c;

    return-void
.end method

.method public static B0(Lo4/n;Lv3/i0;ZLx3/m;)Lo7/t;
    .locals 3

    .line 1
    iget-object v0, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lo7/t;->b:Lo7/t$b;

    .line 6
    .line 7
    sget-object p0, Lo7/l0;->e:Lo7/l0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p1}, Lx3/m;->a(Lv3/i0;)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p3, :cond_2

    .line 16
    .line 17
    const-string p3, "audio/raw"

    .line 18
    .line 19
    invoke-static {p3, v1, v1}, Lo4/p;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, Lo4/l;

    .line 36
    .line 37
    :goto_0
    if-eqz p3, :cond_2

    .line 38
    .line 39
    invoke-static {p3}, Lo7/t;->t(Ljava/lang/Object;)Lo7/l0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-interface {p0, v0, p2, v1}, Lo4/n;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-static {p1}, Lo4/p;->b(Lv3/i0;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    invoke-static {p3}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_3
    invoke-interface {p0, p1, p2, v1}, Lo4/n;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object p1, Lo7/t;->b:Lo7/t$b;

    .line 64
    .line 65
    new-instance p1, Lo7/t$a;

    .line 66
    .line 67
    invoke-direct {p1}, Lo7/t$a;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p3}, Lo7/t$a;->d(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, Lo7/t$a;->d(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lo7/t$a;->e()Lo7/l0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
.end method


# virtual methods
.method public final A0(Lv3/i0;Lo4/l;)I
    .locals 1

    iget-object p2, p2, Lo4/l;->a:Ljava/lang/String;

    const-string v0, "OMX.google.raw.decoder"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Lv5/e0;->a:I

    const/16 v0, 0x18

    if-ge p2, v0, :cond_1

    const/16 v0, 0x17

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lx3/x;->K0:Landroid/content/Context;

    invoke-static {p2}, Lv5/e0;->H(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p1, Lv3/i0;->u:I

    return p1
.end method

.method public final B()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/x;->U0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lx3/x;->P0:Lv3/i0;

    :try_start_0
    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lo4/m;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lx3/x;->L0:Lx3/l$a;

    iget-object v1, p0, Lo4/m;->F0:Lz3/e;

    invoke-virtual {v0, v1}, Lx3/l$a;->a(Lz3/e;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lx3/x;->L0:Lx3/l$a;

    iget-object v2, p0, Lo4/m;->F0:Lz3/e;

    invoke-virtual {v1, v2}, Lx3/l$a;->a(Lz3/e;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lo4/m;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lx3/x;->L0:Lx3/l$a;

    iget-object v2, p0, Lo4/m;->F0:Lz3/e;

    invoke-virtual {v1, v2}, Lx3/l$a;->a(Lz3/e;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lx3/x;->L0:Lx3/l$a;

    iget-object v2, p0, Lo4/m;->F0:Lz3/e;

    invoke-virtual {v1, v2}, Lx3/l$a;->a(Lz3/e;)V

    throw v0
.end method

.method public final C(ZZ)V
    .locals 3

    .line 1
    new-instance p1, Lz3/e;

    .line 2
    .line 3
    invoke-direct {p1}, Lz3/e;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lo4/m;->F0:Lz3/e;

    .line 7
    .line 8
    iget-object p2, p0, Lx3/x;->L0:Lx3/l$a;

    .line 9
    .line 10
    iget-object v0, p2, Lx3/l$a;->a:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Lw/g;

    .line 15
    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    invoke-direct {v1, v2, p2, p1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lv3/f;->c:Lv3/l1;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p1, Lv3/l1;->a:Z

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    .line 34
    .line 35
    invoke-interface {p1}, Lx3/m;->q()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    .line 40
    .line 41
    invoke-interface {p1}, Lx3/m;->m()V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    .line 45
    .line 46
    iget-object p2, p0, Lv3/f;->e:Lw3/a0;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, p2}, Lx3/m;->p(Lw3/a0;)V

    .line 52
    .line 53
    .line 54
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final C0()V
    .locals 4

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-virtual {p0}, Lx3/x;->d()Z

    move-result v1

    invoke-interface {v0, v1}, Lx3/m;->l(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lx3/x;->T0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lx3/x;->R0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lx3/x;->R0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx3/x;->T0:Z

    :cond_1
    return-void
.end method

.method public final D(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lo4/m;->D(JZ)V

    iget-object p3, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {p3}, Lx3/m;->flush()V

    iput-wide p1, p0, Lx3/x;->R0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx3/x;->S0:Z

    iput-boolean p1, p0, Lx3/x;->T0:Z

    return-void
.end method

.method public final E()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lo4/m;->M()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo4/m;->o0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    .line 9
    :try_start_1
    iget-object v2, p0, Lo4/m;->I:La4/e;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {v2, v0}, La4/e;->f(La4/g$a;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, Lo4/m;->I:La4/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    iget-boolean v0, p0, Lx3/x;->U0:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iput-boolean v1, p0, Lx3/x;->U0:Z

    .line 24
    .line 25
    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    .line 26
    .line 27
    invoke-interface {v0}, Lx3/m;->reset()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception v2

    .line 34
    :try_start_2
    iget-object v3, p0, Lo4/m;->I:La4/e;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v3, v0}, La4/e;->f(La4/g$a;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput-object v0, p0, Lo4/m;->I:La4/e;

    .line 42
    .line 43
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :goto_1
    iget-boolean v2, p0, Lx3/x;->U0:Z

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p0, Lx3/x;->U0:Z

    .line 49
    .line 50
    iget-object v1, p0, Lx3/x;->M0:Lx3/m;

    .line 51
    .line 52
    invoke-interface {v1}, Lx3/m;->reset()V

    .line 53
    .line 54
    .line 55
    :cond_3
    throw v0
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

.method public final F()V
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->b()V

    return-void
.end method

.method public final G()V
    .locals 1

    invoke-virtual {p0}, Lx3/x;->C0()V

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->pause()V

    return-void
.end method

.method public final K(Lo4/l;Lv3/i0;Lv3/i0;)Lz3/i;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lo4/l;->b(Lv3/i0;Lv3/i0;)Lz3/i;

    move-result-object v0

    iget v1, v0, Lz3/i;->e:I

    invoke-virtual {p0, p3, p1}, Lx3/x;->A0(Lv3/i0;Lo4/l;)I

    move-result v2

    iget v3, p0, Lx3/x;->N0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    new-instance v1, Lz3/i;

    iget-object v3, p1, Lo4/l;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget p1, v0, Lz3/i;->d:I

    :goto_0
    move v6, p1

    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lz3/i;-><init>(Ljava/lang/String;Lv3/i0;Lv3/i0;II)V

    return-object v1
.end method

.method public final U(F[Lv3/i0;)F
    .locals 5

    array-length v0, p2

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p2, v2

    iget v4, v4, Lv3/i0;->H:I

    if-eq v4, v1, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, v3

    mul-float/2addr p1, p2

    :goto_1
    return p1
.end method

.method public final V(Lo4/n;Lv3/i0;Z)Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v0}, Lx3/x;->B0(Lo4/n;Lv3/i0;ZLx3/m;)Lo7/t;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p3, Lo4/p;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance p3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Le;

    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    invoke-direct {p1, p2, v0}, Le;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lo4/o;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p2, p1, v0}, Lo4/o;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    return-object p3
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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

.method public final X(Lo4/l;Lv3/i0;Landroid/media/MediaCrypto;F)Lo4/j$a;
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object v4, p2

    .line 4
    move/from16 v1, p4

    .line 5
    .line 6
    iget-object v3, v0, Lv3/f;->p:[Lv3/i0;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2, p1}, Lx3/x;->A0(Lv3/i0;Lo4/l;)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    array-length v6, v3

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, 0x0

    .line 18
    if-ne v6, v7, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    array-length v6, v3

    .line 22
    move v9, v8

    .line 23
    :goto_0
    if-ge v9, v6, :cond_2

    .line 24
    .line 25
    aget-object v10, v3, v9

    .line 26
    .line 27
    invoke-virtual {p1, p2, v10}, Lo4/l;->b(Lv3/i0;Lv3/i0;)Lz3/i;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    iget v11, v11, Lz3/i;->d:I

    .line 32
    .line 33
    if-eqz v11, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v10, p1}, Lx3/x;->A0(Lv3/i0;Lo4/l;)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    iput v5, v0, Lx3/x;->N0:I

    .line 47
    .line 48
    iget-object v3, v2, Lo4/l;->a:Ljava/lang/String;

    .line 49
    .line 50
    sget v5, Lv5/e0;->a:I

    .line 51
    .line 52
    const/16 v6, 0x18

    .line 53
    .line 54
    if-ge v5, v6, :cond_4

    .line 55
    .line 56
    const-string v9, "OMX.SEC.aac.dec"

    .line 57
    .line 58
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    sget-object v3, Lv5/e0;->c:Ljava/lang/String;

    .line 65
    .line 66
    const-string v9, "samsung"

    .line 67
    .line 68
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    sget-object v3, Lv5/e0;->b:Ljava/lang/String;

    .line 75
    .line 76
    const-string v9, "zeroflte"

    .line 77
    .line 78
    invoke-virtual {v3, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-nez v9, :cond_3

    .line 83
    .line 84
    const-string v9, "herolte"

    .line 85
    .line 86
    invoke-virtual {v3, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-nez v9, :cond_3

    .line 91
    .line 92
    const-string v9, "heroqlte"

    .line 93
    .line 94
    invoke-virtual {v3, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    :cond_3
    move v3, v7

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move v3, v8

    .line 103
    :goto_2
    iput-boolean v3, v0, Lx3/x;->O0:Z

    .line 104
    .line 105
    iget-object v3, v2, Lo4/l;->c:Ljava/lang/String;

    .line 106
    .line 107
    iget v9, v0, Lx3/x;->N0:I

    .line 108
    .line 109
    new-instance v10, Landroid/media/MediaFormat;

    .line 110
    .line 111
    invoke-direct {v10}, Landroid/media/MediaFormat;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v11, "mime"

    .line 115
    .line 116
    invoke-virtual {v10, v11, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget v3, v4, Lv3/i0;->G:I

    .line 120
    .line 121
    const-string v11, "channel-count"

    .line 122
    .line 123
    invoke-virtual {v10, v11, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    iget v3, v4, Lv3/i0;->H:I

    .line 127
    .line 128
    const-string v11, "sample-rate"

    .line 129
    .line 130
    invoke-virtual {v10, v11, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v4, Lv3/i0;->v:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {v10, v3}, Lx6/b;->q0(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    const-string v3, "max-input-size"

    .line 139
    .line 140
    invoke-static {v10, v3, v9}, Lx6/b;->h0(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    const/16 v3, 0x17

    .line 144
    .line 145
    if-lt v5, v3, :cond_7

    .line 146
    .line 147
    const-string v9, "priority"

    .line 148
    .line 149
    invoke-virtual {v10, v9, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    const/high16 v9, -0x40800000    # -1.0f

    .line 153
    .line 154
    cmpl-float v9, v1, v9

    .line 155
    .line 156
    if-eqz v9, :cond_7

    .line 157
    .line 158
    if-ne v5, v3, :cond_6

    .line 159
    .line 160
    sget-object v3, Lv5/e0;->d:Ljava/lang/String;

    .line 161
    .line 162
    const-string v9, "ZTE B2017G"

    .line 163
    .line 164
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_5

    .line 169
    .line 170
    const-string v9, "AXON 7 mini"

    .line 171
    .line 172
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    :cond_5
    move v3, v7

    .line 179
    goto :goto_3

    .line 180
    :cond_6
    move v3, v8

    .line 181
    :goto_3
    if-nez v3, :cond_7

    .line 182
    .line 183
    const-string v3, "operating-rate"

    .line 184
    .line 185
    invoke-virtual {v10, v3, v1}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 186
    .line 187
    .line 188
    :cond_7
    const/16 v1, 0x1c

    .line 189
    .line 190
    if-gt v5, v1, :cond_8

    .line 191
    .line 192
    iget-object v1, v4, Lv3/i0;->t:Ljava/lang/String;

    .line 193
    .line 194
    const-string v3, "audio/ac4"

    .line 195
    .line 196
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    const-string v1, "ac4-is-sync"

    .line 203
    .line 204
    invoke-virtual {v10, v1, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 205
    .line 206
    .line 207
    :cond_8
    const-string v1, "audio/raw"

    .line 208
    .line 209
    if-lt v5, v6, :cond_9

    .line 210
    .line 211
    iget-object v3, v0, Lx3/x;->M0:Lx3/m;

    .line 212
    .line 213
    iget v6, v4, Lv3/i0;->G:I

    .line 214
    .line 215
    iget v9, v4, Lv3/i0;->H:I

    .line 216
    .line 217
    const/4 v11, 0x4

    .line 218
    new-instance v12, Lv3/i0$a;

    .line 219
    .line 220
    invoke-direct {v12}, Lv3/i0$a;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object v1, v12, Lv3/i0$a;->k:Ljava/lang/String;

    .line 224
    .line 225
    iput v6, v12, Lv3/i0$a;->x:I

    .line 226
    .line 227
    iput v9, v12, Lv3/i0$a;->y:I

    .line 228
    .line 229
    iput v11, v12, Lv3/i0$a;->z:I

    .line 230
    .line 231
    invoke-virtual {v12}, Lv3/i0$a;->a()Lv3/i0;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-interface {v3, v6}, Lx3/m;->u(Lv3/i0;)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    const/4 v6, 0x2

    .line 240
    if-ne v3, v6, :cond_9

    .line 241
    .line 242
    const-string v3, "pcm-encoding"

    .line 243
    .line 244
    invoke-virtual {v10, v3, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 245
    .line 246
    .line 247
    :cond_9
    const/16 v3, 0x20

    .line 248
    .line 249
    if-lt v5, v3, :cond_a

    .line 250
    .line 251
    const/16 v3, 0x63

    .line 252
    .line 253
    const-string v5, "max-output-channel-count"

    .line 254
    .line 255
    invoke-virtual {v10, v5, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    :cond_a
    iget-object v3, v2, Lo4/l;->b:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_b

    .line 265
    .line 266
    iget-object v3, v4, Lv3/i0;->t:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-nez v1, :cond_b

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_b
    move v7, v8

    .line 276
    :goto_4
    if-eqz v7, :cond_c

    .line 277
    .line 278
    move-object v1, v4

    .line 279
    goto :goto_5

    .line 280
    :cond_c
    const/4 v1, 0x0

    .line 281
    :goto_5
    iput-object v1, v0, Lx3/x;->Q0:Lv3/i0;

    .line 282
    .line 283
    new-instance v7, Lo4/j$a;

    .line 284
    .line 285
    const/4 v5, 0x0

    .line 286
    move-object v1, v7

    .line 287
    move-object v2, p1

    .line 288
    move-object v3, v10

    .line 289
    move-object v4, p2

    .line 290
    move-object/from16 v6, p3

    .line 291
    .line 292
    invoke-direct/range {v1 .. v6}, Lo4/j$a;-><init>(Lo4/l;Landroid/media/MediaFormat;Lv3/i0;Landroid/view/Surface;Landroid/media/MediaCrypto;)V

    .line 293
    .line 294
    .line 295
    return-object v7
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lo4/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final c(Lv3/e1;)V
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0, p1}, Lx3/m;->c(Lv3/e1;)V

    return-void
.end method

.method public final c0(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lx3/x;->L0:Lx3/l$a;

    .line 9
    .line 10
    iget-object v1, v0, Lx3/l$a;->a:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lx0/f;

    .line 15
    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    invoke-direct {v2, v3, v0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo4/m;->B0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    .line 6
    .line 7
    invoke-interface {v0}, Lx3/m;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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

.method public final d0(Ljava/lang/String;JJ)V
    .locals 9

    .line 1
    iget-object v1, p0, Lx3/x;->L0:Lx3/l$a;

    .line 2
    .line 3
    iget-object v7, v1, Lx3/l$a;->a:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v7, :cond_0

    .line 6
    .line 7
    new-instance v8, Lx3/i;

    .line 8
    .line 9
    move-object v0, v8

    .line 10
    move-object v2, p1

    .line 11
    move-wide v3, p2

    .line 12
    move-wide v5, p4

    .line 13
    invoke-direct/range {v0 .. v6}, Lx3/i;-><init>(Lx3/l$a;Ljava/lang/String;JJ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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

.method public final e0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx3/x;->L0:Lx3/l$a;

    .line 2
    .line 3
    iget-object v1, v0, Lx3/l$a;->a:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lw/g;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-direct {v2, v3, v0, p1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final f()Lv3/e1;
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->f()Lv3/e1;

    move-result-object v0

    return-object v0
.end method

.method public final f0(Ll3/l;)Lz3/i;
    .locals 5

    .line 1
    iget-object v0, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/i0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lx3/x;->P0:Lv3/i0;

    .line 9
    .line 10
    invoke-super {p0, p1}, Lo4/m;->f0(Ll3/l;)Lz3/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lx3/x;->L0:Lx3/l$a;

    .line 15
    .line 16
    iget-object v1, p0, Lx3/x;->P0:Lv3/i0;

    .line 17
    .line 18
    iget-object v2, v0, Lx3/l$a;->a:Landroid/os/Handler;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v3, Lx0/g;

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    invoke-direct {v3, v0, v1, p1, v4}, Lx0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final g0(Lv3/i0;Landroid/media/MediaFormat;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lx3/x;->Q0:Lv3/i0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lo4/m;->O:Lo4/j;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_1
    iget-object v0, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "audio/raw"

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget v0, p1, Lv3/i0;->I:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget v0, Lv5/e0;->a:I

    .line 30
    .line 31
    const/16 v4, 0x18

    .line 32
    .line 33
    if-lt v0, v4, :cond_3

    .line 34
    .line 35
    const-string v0, "pcm-encoding"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Lv5/e0;->v(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const/4 v0, 0x2

    .line 66
    :goto_0
    new-instance v4, Lv3/i0$a;

    .line 67
    .line 68
    invoke-direct {v4}, Lv3/i0$a;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v3, v4, Lv3/i0$a;->k:Ljava/lang/String;

    .line 72
    .line 73
    iput v0, v4, Lv3/i0$a;->z:I

    .line 74
    .line 75
    iget v0, p1, Lv3/i0;->J:I

    .line 76
    .line 77
    iput v0, v4, Lv3/i0$a;->A:I

    .line 78
    .line 79
    iget v0, p1, Lv3/i0;->K:I

    .line 80
    .line 81
    iput v0, v4, Lv3/i0$a;->B:I

    .line 82
    .line 83
    const-string v0, "channel-count"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iput v0, v4, Lv3/i0$a;->x:I

    .line 90
    .line 91
    const-string v0, "sample-rate"

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, v4, Lv3/i0$a;->y:I

    .line 98
    .line 99
    new-instance p2, Lv3/i0;

    .line 100
    .line 101
    invoke-direct {p2, v4}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 102
    .line 103
    .line 104
    iget-boolean v0, p0, Lx3/x;->O0:Z

    .line 105
    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget v0, p2, Lv3/i0;->G:I

    .line 109
    .line 110
    const/4 v3, 0x6

    .line 111
    if-ne v0, v3, :cond_6

    .line 112
    .line 113
    iget v0, p1, Lv3/i0;->G:I

    .line 114
    .line 115
    if-ge v0, v3, :cond_6

    .line 116
    .line 117
    new-array v0, v0, [I

    .line 118
    .line 119
    move v2, v1

    .line 120
    :goto_1
    iget v3, p1, Lv3/i0;->G:I

    .line 121
    .line 122
    if-ge v2, v3, :cond_5

    .line 123
    .line 124
    aput v2, v0, v2

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move-object v2, v0

    .line 130
    :cond_6
    move-object p1, p2

    .line 131
    :goto_2
    :try_start_0
    iget-object p2, p0, Lx3/x;->M0:Lx3/m;

    .line 132
    .line 133
    invoke-interface {p2, p1, v2}, Lx3/m;->e(Lv3/i0;[I)V
    :try_end_0
    .catch Lx3/m$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :catch_0
    move-exception p1

    .line 138
    iget-object p2, p1, Lx3/m$a;->a:Lv3/i0;

    .line 139
    .line 140
    const/16 v0, 0x1389

    .line 141
    .line 142
    invoke-virtual {p0, v0, p2, p1, v1}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final h0(J)V
    .locals 0

    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {p1}, Lx3/m;->r()V

    return-void
.end method

.method public final j0()V
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->n()V

    return-void
.end method

.method public final k0(Lz3/g;)V
    .locals 4

    iget-boolean v0, p0, Lx3/x;->S0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lz3/a;->n()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lz3/g;->e:J

    iget-wide v2, p0, Lx3/x;->R0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lz3/g;->e:J

    iput-wide v0, p0, Lx3/x;->R0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lx3/x;->S0:Z

    :cond_1
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    iget v0, p0, Lv3/f;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lx3/x;->C0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lx3/x;->R0:J

    .line 10
    .line 11
    return-wide v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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

.method public final m0(JJLo4/j;Ljava/nio/ByteBuffer;IIIJZZLv3/i0;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lx3/x;->Q0:Lv3/i0;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    and-int/lit8 p1, p8, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p5, p7, p3}, Lo4/j;->j(IZ)V

    .line 18
    .line 19
    .line 20
    return p2

    .line 21
    :cond_0
    if-eqz p12, :cond_2

    .line 22
    .line 23
    if-eqz p5, :cond_1

    .line 24
    .line 25
    invoke-interface {p5, p7, p3}, Lo4/j;->j(IZ)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lo4/m;->F0:Lz3/e;

    .line 29
    .line 30
    iget p3, p1, Lz3/e;->f:I

    .line 31
    .line 32
    add-int/2addr p3, p9

    .line 33
    iput p3, p1, Lz3/e;->f:I

    .line 34
    .line 35
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    .line 36
    .line 37
    invoke-interface {p1}, Lx3/m;->n()V

    .line 38
    .line 39
    .line 40
    return p2

    .line 41
    :cond_2
    :try_start_0
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    .line 42
    .line 43
    invoke-interface {p1, p10, p11, p6, p9}, Lx3/m;->k(JLjava/nio/ByteBuffer;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1
    :try_end_0
    .catch Lx3/m$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lx3/m$e; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    if-eqz p5, :cond_3

    .line 50
    .line 51
    invoke-interface {p5, p7, p3}, Lo4/j;->j(IZ)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object p1, p0, Lo4/m;->F0:Lz3/e;

    .line 55
    .line 56
    iget p3, p1, Lz3/e;->e:I

    .line 57
    .line 58
    add-int/2addr p3, p9

    .line 59
    iput p3, p1, Lz3/e;->e:I

    .line 60
    .line 61
    return p2

    .line 62
    :cond_4
    return p3

    .line 63
    :catch_0
    move-exception p1

    .line 64
    iget-boolean p2, p1, Lx3/m$e;->b:Z

    .line 65
    .line 66
    const/16 p3, 0x138a

    .line 67
    .line 68
    invoke-virtual {p0, p3, p14, p1, p2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    throw p1

    .line 73
    :catch_1
    move-exception p1

    .line 74
    iget-object p2, p0, Lx3/x;->P0:Lv3/i0;

    .line 75
    .line 76
    iget-boolean p3, p1, Lx3/m$b;->b:Z

    .line 77
    .line 78
    const/16 p4, 0x1389

    .line 79
    .line 80
    invoke-virtual {p0, p4, p2, p1, p3}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    throw p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
.end method

.method public final p0()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0}, Lx3/m;->g()V
    :try_end_0
    .catch Lx3/m$e; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v0, Lx3/m$e;->c:Lv3/i0;

    iget-boolean v2, v0, Lx3/m$e;->b:Z

    const/16 v3, 0x138a

    invoke-virtual {p0, v3, v1, v0, v2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    move-result-object v0

    throw v0
.end method

.method public final q(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget p1, Lv5/e0;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    invoke-static {p1, p2}, Lx3/x$a;->a(Lx3/m;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p2, Lv3/j1$a;

    iput-object p2, p0, Lx3/x;->V0:Lv3/j1$a;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lx3/m;->i(I)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lx3/m;->t(Z)V

    goto :goto_0

    :cond_0
    check-cast p2, Lx3/p;

    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {p1, p2}, Lx3/m;->j(Lx3/p;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lx3/d;

    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {p1, p2}, Lx3/m;->s(Lx3/d;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lx3/x;->M0:Lx3/m;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lx3/m;->o(F)V

    :cond_3
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v0(Lv3/i0;)Z
    .locals 1

    iget-object v0, p0, Lx3/x;->M0:Lx3/m;

    invoke-interface {v0, p1}, Lx3/m;->a(Lv3/i0;)Z

    move-result p1

    return p1
.end method

.method public final w()Lv5/o;
    .locals 0

    return-object p0
.end method

.method public final w0(Lo4/n;Lv3/i0;)I
    .locals 12

    .line 1
    iget-object v0, p2, Lv3/i0;->t:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lv5/p;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1, v1, v1}, La0/j;->b(III)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    sget v0, Lv5/e0;->a:I

    .line 16
    .line 17
    const/16 v2, 0x15

    .line 18
    .line 19
    if-lt v0, v2, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v2, p2, Lv3/i0;->O:I

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    move v4, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v4, v1

    .line 33
    :goto_1
    const/4 v5, 0x2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-ne v2, v5, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move v2, v1

    .line 40
    goto :goto_3

    .line 41
    :cond_4
    :goto_2
    move v2, v3

    .line 42
    :goto_3
    const/16 v6, 0x8

    .line 43
    .line 44
    const/4 v7, 0x4

    .line 45
    const-string v8, "audio/raw"

    .line 46
    .line 47
    if-eqz v2, :cond_7

    .line 48
    .line 49
    iget-object v9, p0, Lx3/x;->M0:Lx3/m;

    .line 50
    .line 51
    invoke-interface {v9, p2}, Lx3/m;->a(Lv3/i0;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_7

    .line 56
    .line 57
    if-eqz v4, :cond_6

    .line 58
    .line 59
    invoke-static {v8, v1, v1}, Lo4/p;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_5

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Lo4/l;

    .line 76
    .line 77
    :goto_4
    if-eqz v4, :cond_7

    .line 78
    .line 79
    :cond_6
    invoke-static {v7, v6, v0}, La0/j;->b(III)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1

    .line 84
    :cond_7
    iget-object v4, p2, Lv3/i0;->t:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_8

    .line 91
    .line 92
    iget-object v4, p0, Lx3/x;->M0:Lx3/m;

    .line 93
    .line 94
    invoke-interface {v4, p2}, Lx3/m;->a(Lv3/i0;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_8

    .line 99
    .line 100
    invoke-static {v3, v1, v1}, La0/j;->b(III)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    return p1

    .line 105
    :cond_8
    iget-object v4, p0, Lx3/x;->M0:Lx3/m;

    .line 106
    .line 107
    iget v9, p2, Lv3/i0;->G:I

    .line 108
    .line 109
    iget v10, p2, Lv3/i0;->H:I

    .line 110
    .line 111
    new-instance v11, Lv3/i0$a;

    .line 112
    .line 113
    invoke-direct {v11}, Lv3/i0$a;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v8, v11, Lv3/i0$a;->k:Ljava/lang/String;

    .line 117
    .line 118
    iput v9, v11, Lv3/i0$a;->x:I

    .line 119
    .line 120
    iput v10, v11, Lv3/i0$a;->y:I

    .line 121
    .line 122
    iput v5, v11, Lv3/i0$a;->z:I

    .line 123
    .line 124
    invoke-virtual {v11}, Lv3/i0$a;->a()Lv3/i0;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-interface {v4, v8}, Lx3/m;->a(Lv3/i0;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_9

    .line 133
    .line 134
    invoke-static {v3, v1, v1}, La0/j;->b(III)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    return p1

    .line 139
    :cond_9
    iget-object v4, p0, Lx3/x;->M0:Lx3/m;

    .line 140
    .line 141
    invoke-static {p1, p2, v1, v4}, Lx3/x;->B0(Lo4/n;Lv3/i0;ZLx3/m;)Lo7/t;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_a

    .line 150
    .line 151
    invoke-static {v3, v1, v1}, La0/j;->b(III)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    return p1

    .line 156
    :cond_a
    if-nez v2, :cond_b

    .line 157
    .line 158
    invoke-static {v5, v1, v1}, La0/j;->b(III)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    return p1

    .line 163
    :cond_b
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Lo4/l;

    .line 168
    .line 169
    invoke-virtual {v2, p2}, Lo4/l;->d(Lv3/i0;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_d

    .line 174
    .line 175
    move v5, v3

    .line 176
    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-ge v5, v8, :cond_d

    .line 181
    .line 182
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    check-cast v8, Lo4/l;

    .line 187
    .line 188
    invoke-virtual {v8, p2}, Lo4/l;->d(Lv3/i0;)Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_c

    .line 193
    .line 194
    move p1, v1

    .line 195
    move-object v2, v8

    .line 196
    goto :goto_6

    .line 197
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_d
    move p1, v3

    .line 201
    move v3, v4

    .line 202
    :goto_6
    if-eqz v3, :cond_e

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_e
    const/4 v7, 0x3

    .line 206
    :goto_7
    if-eqz v3, :cond_f

    .line 207
    .line 208
    invoke-virtual {v2, p2}, Lo4/l;->e(Lv3/i0;)Z

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    if-eqz p2, :cond_f

    .line 213
    .line 214
    const/16 v6, 0x10

    .line 215
    .line 216
    :cond_f
    iget-boolean p2, v2, Lo4/l;->g:Z

    .line 217
    .line 218
    if-eqz p2, :cond_10

    .line 219
    .line 220
    const/16 p2, 0x40

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_10
    move p2, v1

    .line 224
    :goto_8
    if-eqz p1, :cond_11

    .line 225
    .line 226
    const/16 v1, 0x80

    .line 227
    .line 228
    :cond_11
    or-int p1, v7, v6

    .line 229
    .line 230
    or-int/2addr p1, v0

    .line 231
    or-int/2addr p1, p2

    .line 232
    or-int/2addr p1, v1

    .line 233
    return p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
