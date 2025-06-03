.class public final Lm9/q0;
.super Lm9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/q0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm9/a<",
        "Lka/f0;",
        "Lka/g0;",
        "Lm9/q0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final w:Lma/h$h;


# instance fields
.field public final t:Lm9/e0;

.field public u:Z

.field public v:Lma/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lma/h;->b:Lma/h$h;

    sput-object v0, Lm9/q0;->w:Lma/h$h;

    return-void
.end method

.method public constructor <init>(Lm9/v;Ln9/a;Lm9/e0;Lm9/g0;)V
    .locals 9

    .line 1
    sget-object v0, Lka/r;->d:Leb/t0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v1, Lka/r;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v0, Lka/r;->d:Leb/t0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Leb/t0;->b()Leb/t0$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Leb/t0$c;->c:Leb/t0$c;

    .line 17
    .line 18
    iput-object v2, v0, Leb/t0$a;->c:Leb/t0$c;

    .line 19
    .line 20
    const-string v2, "google.firestore.v1.Firestore"

    .line 21
    .line 22
    const-string v3, "Write"

    .line 23
    .line 24
    invoke-static {v2, v3}, Leb/t0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v0, Leb/t0$a;->d:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    iput-boolean v2, v0, Leb/t0$a;->e:Z

    .line 32
    .line 33
    invoke-static {}, Lka/f0;->J()Lka/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Llb/b;->a:Lma/o;

    .line 38
    .line 39
    new-instance v3, Llb/b$a;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Llb/b$a;-><init>(Lma/w;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, v0, Leb/t0$a;->a:Leb/t0$b;

    .line 45
    .line 46
    invoke-static {}, Lka/g0;->H()Lka/g0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Llb/b$a;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Llb/b$a;-><init>(Lma/w;)V

    .line 53
    .line 54
    .line 55
    iput-object v3, v0, Leb/t0$a;->b:Leb/t0$b;

    .line 56
    .line 57
    invoke-virtual {v0}, Leb/t0$a;->a()Leb/t0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lka/r;->d:Leb/t0;

    .line 62
    .line 63
    :cond_0
    monitor-exit v1

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw p1

    .line 68
    :cond_1
    :goto_0
    move-object v4, v0

    .line 69
    sget-object v6, Ln9/a$c;->d:Ln9/a$c;

    .line 70
    .line 71
    sget-object v7, Ln9/a$c;->c:Ln9/a$c;

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move-object v3, p1

    .line 75
    move-object v5, p2

    .line 76
    move-object v8, p4

    .line 77
    invoke-direct/range {v2 .. v8}, Lm9/a;-><init>(Lm9/v;Leb/t0;Ln9/a;Ln9/a$c;Ln9/a$c;Lm9/j0;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Lm9/q0;->u:Z

    .line 82
    .line 83
    sget-object p1, Lm9/q0;->w:Lma/h$h;

    .line 84
    .line 85
    iput-object p1, p0, Lm9/q0;->v:Lma/h;

    .line 86
    .line 87
    iput-object p3, p0, Lm9/q0;->t:Lm9/e0;

    .line 88
    .line 89
    return-void
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
.method public final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lka/g0;

    invoke-virtual {p1}, Lka/g0;->I()Lma/h;

    move-result-object p1

    iput-object p1, p0, Lm9/q0;->v:Lma/h;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/q0;->u:Z

    iget-object p1, p0, Lm9/a;->m:Lm9/j0;

    check-cast p1, Lm9/q0$a;

    invoke-interface {p1}, Lm9/q0$a;->d()V

    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, Lka/g0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lka/g0;->I()Lma/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lm9/q0;->v:Lma/h;

    .line 8
    .line 9
    iget-object v0, p0, Lm9/a;->l:Ln9/g;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, v0, Ln9/g;->f:J

    .line 14
    .line 15
    iget-object v0, p0, Lm9/q0;->t:Lm9/e0;

    .line 16
    .line 17
    invoke-virtual {p1}, Lka/g0;->G()Lma/n1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lka/g0;->K()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_0
    if-ge v3, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v3}, Lka/g0;->J(I)Lka/h0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, p0, Lm9/q0;->t:Lm9/e0;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v0}, Lm9/e0;->d(Lka/h0;Lj9/q;)Lk9/i;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, p0, Lm9/a;->m:Lm9/j0;

    .line 60
    .line 61
    check-cast p1, Lm9/q0$a;

    .line 62
    .line 63
    invoke-interface {p1, v0, v2}, Lm9/q0$a;->b(Lj9/q;Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm9/q0;->u:Z

    invoke-super {p0}, Lm9/a;->g()V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, Lm9/q0;->u:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm9/q0;->j(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk9/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm9/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "Writing mutations requires an opened stream"

    .line 9
    .line 10
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lm9/q0;->u:Z

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v2, "Handshake must be complete before writing mutations"

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lka/f0;->K()Lka/f0$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lk9/f;

    .line 41
    .line 42
    iget-object v2, p0, Lm9/q0;->t:Lm9/e0;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lm9/e0;->k(Lk9/f;)Lka/e0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 49
    .line 50
    .line 51
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 52
    .line 53
    check-cast v2, Lka/f0;

    .line 54
    .line 55
    invoke-static {v2, v1}, Lka/f0;->I(Lka/f0;Lka/e0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, p0, Lm9/q0;->v:Lma/h;

    .line 60
    .line 61
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 62
    .line 63
    .line 64
    iget-object v1, v0, Lma/w$a;->b:Lma/w;

    .line 65
    .line 66
    check-cast v1, Lka/f0;

    .line 67
    .line 68
    invoke-static {v1, p1}, Lka/f0;->H(Lka/f0;Lma/h;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lka/f0;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lm9/a;->i(Lma/w;)V

    .line 78
    .line 79
    .line 80
    return-void
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
.end method
