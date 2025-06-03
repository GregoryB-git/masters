.class public final Lgb/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/h2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/f0$e;
    }
.end annotation


# instance fields
.field public final a:Leb/f0;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Leb/h1;

.field public e:Lgb/f0$a;

.field public f:Lgb/f0$b;

.field public g:Ljava/lang/Runnable;

.field public h:Lgb/h2$a;

.field public i:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lgb/f0$e;",
            ">;"
        }
    .end annotation
.end field

.field public j:Leb/e1;

.field public k:Leb/k0$j;

.field public l:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Leb/h1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lgb/f0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Leb/f0;->a(Ljava/lang/Class;Ljava/lang/String;)Leb/f0;

    move-result-object v0

    iput-object v0, p0, Lgb/f0;->a:Leb/f0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgb/f0;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lgb/f0;->i:Ljava/util/Collection;

    iput-object p1, p0, Lgb/f0;->c:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lgb/f0;->d:Leb/h1;

    return-void
.end method


# virtual methods
.method public final a(Lgb/s2;[Leb/h;)Lgb/f0$e;
    .locals 3

    .line 1
    new-instance v0, Lgb/f0$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lgb/f0$e;-><init>(Lgb/f0;Lgb/s2;[Leb/h;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lgb/f0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    iget-object v1, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const/4 p1, 0x1

    .line 22
    if-ne v1, p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lgb/f0;->d:Leb/h1;

    .line 25
    .line 26
    iget-object v1, p0, Lgb/f0;->e:Lgb/f0$a;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    array-length p1, p2

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-ge v1, p1, :cond_1

    .line 34
    .line 35
    aget-object v2, p2, v1

    .line 36
    .line 37
    invoke-virtual {v2}, Leb/h;->v()V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p2
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
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lgb/f0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lgb/f0;->i:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Leb/e1;)V
    .locals 3

    iget-object v0, p0, Lgb/f0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lgb/f0;->j:Leb/e1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iput-object p1, p0, Lgb/f0;->j:Leb/e1;

    iget-object v1, p0, Lgb/f0;->d:Leb/h1;

    new-instance v2, Lgb/f0$d;

    invoke-direct {v2, p0, p1}, Lgb/f0$d;-><init>(Lgb/f0;Leb/e1;)V

    invoke-virtual {v1, v2}, Leb/h1;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lgb/f0;->b()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lgb/f0;->d:Leb/h1;

    invoke-virtual {v1, p1}, Leb/h1;->b(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lgb/f0;->d:Leb/h1;

    invoke-virtual {p1}, Leb/h1;->a()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/t0<",
            "**>;",
            "Leb/s0;",
            "Leb/c;",
            "[",
            "Leb/h;",
            ")",
            "Lgb/s;"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lgb/s2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lgb/s2;-><init>(Leb/t0;Leb/s0;Leb/c;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const-wide/16 v1, -0x1

    .line 8
    .line 9
    :goto_0
    iget-object p2, p0, Lgb/f0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    iget-object v3, p0, Lgb/f0;->j:Leb/e1;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    new-instance p1, Lgb/l0;

    .line 17
    .line 18
    sget-object p3, Lgb/t$a;->a:Lgb/t$a;

    .line 19
    .line 20
    invoke-direct {p1, v3, p3, p4}, Lgb/l0;-><init>(Leb/e1;Lgb/t$a;[Leb/h;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_4

    .line 26
    :cond_0
    iget-object v3, p0, Lgb/f0;->k:Leb/k0$j;

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    :goto_1
    invoke-virtual {p0, v0, p4}, Lgb/f0;->a(Lgb/s2;[Leb/h;)Lgb/f0$e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-wide v4, p0, Lgb/f0;->l:J

    .line 38
    .line 39
    cmp-long p1, v1, v4

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :goto_2
    monitor-exit p2

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    iget-wide v1, p0, Lgb/f0;->l:J

    .line 47
    .line 48
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :try_start_2
    invoke-virtual {v3, v0}, Leb/k0$j;->a(Leb/k0$g;)Leb/k0$f;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    iget-object v4, p3, Leb/c;->h:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p2, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p1, p2}, Lgb/v0;->e(Leb/k0$f;Z)Lgb/u;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    iget-object p2, v0, Lgb/s2;->c:Leb/t0;

    .line 68
    .line 69
    iget-object p3, v0, Lgb/s2;->b:Leb/s0;

    .line 70
    .line 71
    iget-object v0, v0, Lgb/s2;->a:Leb/c;

    .line 72
    .line 73
    invoke-interface {p1, p2, p3, v0, p4}, Lgb/u;->d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    :goto_3
    iget-object p2, p0, Lgb/f0;->d:Leb/h1;

    .line 78
    .line 79
    invoke-virtual {p2}, Leb/h1;->a()V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_3
    move-object p1, v3

    .line 84
    goto :goto_0

    .line 85
    :goto_4
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 86
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    iget-object p2, p0, Lgb/f0;->d:Leb/h1;

    .line 89
    .line 90
    invoke-virtual {p2}, Leb/h1;->a()V

    .line 91
    .line 92
    .line 93
    throw p1
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

.method public final f()Leb/f0;
    .locals 1

    iget-object v0, p0, Lgb/f0;->a:Leb/f0;

    return-object v0
.end method

.method public final g(Lgb/h2$a;)Ljava/lang/Runnable;
    .locals 1

    iput-object p1, p0, Lgb/f0;->h:Lgb/h2$a;

    new-instance v0, Lgb/f0$a;

    check-cast p1, Lgb/r1$g;

    invoke-direct {v0, p1}, Lgb/f0$a;-><init>(Lgb/r1$g;)V

    iput-object v0, p0, Lgb/f0;->e:Lgb/f0$a;

    new-instance v0, Lgb/f0$b;

    invoke-direct {v0, p1}, Lgb/f0$b;-><init>(Lgb/r1$g;)V

    iput-object v0, p0, Lgb/f0;->f:Lgb/f0$b;

    new-instance v0, Lgb/f0$c;

    invoke-direct {v0, p1}, Lgb/f0$c;-><init>(Lgb/r1$g;)V

    iput-object v0, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Leb/e1;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lgb/f0;->c(Leb/e1;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lgb/f0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 8
    .line 9
    iget-object v2, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-object v3, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iput-object v3, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 25
    .line 26
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lgb/f0$e;

    .line 44
    .line 45
    new-instance v3, Lgb/l0;

    .line 46
    .line 47
    sget-object v4, Lgb/t$a;->b:Lgb/t$a;

    .line 48
    .line 49
    iget-object v5, v1, Lgb/f0$e;->l:[Leb/h;

    .line 50
    .line 51
    invoke-direct {v3, p1, v4, v5}, Lgb/l0;-><init>(Leb/e1;Lgb/t$a;[Leb/h;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Lgb/g0;->t(Lgb/s;)Lgb/h0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Lgb/h0;->run()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object p1, p0, Lgb/f0;->d:Leb/h1;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final i(Leb/k0$j;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lgb/f0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lgb/f0;->k:Leb/k0$j;

    .line 5
    .line 6
    iget-wide v1, p0, Lgb/f0;->l:J

    .line 7
    .line 8
    const-wide/16 v3, 0x1

    .line 9
    .line 10
    add-long/2addr v1, v3

    .line 11
    iput-wide v1, p0, Lgb/f0;->l:J

    .line 12
    .line 13
    if-eqz p1, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0}, Lgb/f0;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v2, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lgb/f0$e;

    .line 51
    .line 52
    iget-object v3, v2, Lgb/f0$e;->j:Leb/k0$g;

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Leb/k0$j;->a(Leb/k0$g;)Leb/k0$f;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, v2, Lgb/f0$e;->j:Leb/k0$g;

    .line 59
    .line 60
    check-cast v4, Lgb/s2;

    .line 61
    .line 62
    iget-object v4, v4, Lgb/s2;->a:Leb/c;

    .line 63
    .line 64
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    iget-object v6, v4, Leb/c;->h:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v3, v5}, Lgb/v0;->e(Leb/k0$f;Z)Lgb/u;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    iget-object v5, p0, Lgb/f0;->c:Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    iget-object v4, v4, Leb/c;->b:Ljava/util/concurrent/Executor;

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    move-object v5, v4

    .line 85
    :cond_2
    iget-object v4, v2, Lgb/f0$e;->k:Leb/p;

    .line 86
    .line 87
    invoke-virtual {v4}, Leb/p;->a()Leb/p;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :try_start_1
    iget-object v6, v2, Lgb/f0$e;->j:Leb/k0$g;

    .line 92
    .line 93
    move-object v7, v6

    .line 94
    check-cast v7, Lgb/s2;

    .line 95
    .line 96
    iget-object v7, v7, Lgb/s2;->c:Leb/t0;

    .line 97
    .line 98
    move-object v8, v6

    .line 99
    check-cast v8, Lgb/s2;

    .line 100
    .line 101
    iget-object v8, v8, Lgb/s2;->b:Leb/s0;

    .line 102
    .line 103
    check-cast v6, Lgb/s2;

    .line 104
    .line 105
    iget-object v6, v6, Lgb/s2;->a:Leb/c;

    .line 106
    .line 107
    iget-object v9, v2, Lgb/f0$e;->l:[Leb/h;

    .line 108
    .line 109
    invoke-interface {v3, v7, v8, v6, v9}, Lgb/u;->d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;

    .line 110
    .line 111
    .line 112
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    iget-object v6, v2, Lgb/f0$e;->k:Leb/p;

    .line 114
    .line 115
    invoke-virtual {v6, v4}, Leb/p;->c(Leb/p;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Lgb/g0;->t(Lgb/s;)Lgb/h0;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    invoke-interface {v5, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catchall_0
    move-exception p1

    .line 132
    iget-object v0, v2, Lgb/f0$e;->k:Leb/p;

    .line 133
    .line 134
    invoke-virtual {v0, v4}, Leb/p;->c(Leb/p;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_4
    iget-object p1, p0, Lgb/f0;->b:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter p1

    .line 141
    :try_start_2
    invoke-virtual {p0}, Lgb/f0;->b()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_5

    .line 146
    .line 147
    monitor-exit p1

    .line 148
    return-void

    .line 149
    :cond_5
    iget-object v1, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 150
    .line 151
    invoke-interface {v1, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v0, p0, Lgb/f0;->i:Ljava/util/Collection;

    .line 168
    .line 169
    :cond_6
    invoke-virtual {p0}, Lgb/f0;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_7

    .line 174
    .line 175
    iget-object v0, p0, Lgb/f0;->d:Leb/h1;

    .line 176
    .line 177
    iget-object v1, p0, Lgb/f0;->f:Lgb/f0$b;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lgb/f0;->j:Leb/e1;

    .line 183
    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    iget-object v0, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 187
    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    iget-object v1, p0, Lgb/f0;->d:Leb/h1;

    .line 191
    .line 192
    invoke-virtual {v1, v0}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 193
    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 197
    .line 198
    :cond_7
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    iget-object p1, p0, Lgb/f0;->d:Leb/h1;

    .line 200
    .line 201
    invoke-virtual {p1}, Leb/h1;->a()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :catchall_1
    move-exception v0

    .line 206
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 207
    throw v0

    .line 208
    :cond_8
    :goto_1
    :try_start_4
    monitor-exit v0

    .line 209
    return-void

    .line 210
    :catchall_2
    move-exception p1

    .line 211
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 212
    throw p1
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
.end method
