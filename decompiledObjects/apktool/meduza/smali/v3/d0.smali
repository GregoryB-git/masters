.class public final Lv3/d0;
.super Lv3/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/d0$a;,
        Lv3/d0$c;,
        Lv3/d0$b;,
        Lv3/d0$d;
    }
.end annotation


# static fields
.field public static final synthetic h0:I


# instance fields
.field public final A:Lv3/d;

.field public final B:Lv3/p1;

.field public final C:Lv3/t1;

.field public final D:Lv3/u1;

.field public final E:J

.field public F:I

.field public G:Z

.field public H:I

.field public I:I

.field public J:Z

.field public K:I

.field public L:Lv3/n1;

.field public M:Lz4/e0;

.field public N:Lv3/f1$a;

.field public O:Lv3/p0;

.field public P:Lv3/i0;

.field public Q:Landroid/media/AudioTrack;

.field public R:Ljava/lang/Object;

.field public S:Landroid/view/Surface;

.field public T:I

.field public U:Lv5/w;

.field public V:I

.field public W:Lx3/d;

.field public X:F

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public final b:Lr5/p;

.field public b0:Z

.field public final c:Lv3/f1$a;

.field public c0:Lv3/m;

.field public final d:Lb5/g;

.field public d0:Lv3/p0;

.field public final e:Landroid/content/Context;

.field public e0:Lv3/d1;

.field public final f:Lv3/f1;

.field public f0:I

.field public final g:[Lv3/j1;

.field public g0:J

.field public final h:Lr5/o;

.field public final i:Lv5/k;

.field public final j:Lio/flutter/plugins/firebase/auth/g;

.field public final k:Lv3/g0;

.field public final l:Lv5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv5/l<",
            "Lv3/f1$c;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lv3/o;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lv3/r1$b;

.field public final o:Ljava/util/ArrayList;

.field public final p:Z

.field public final q:Lz4/t$a;

.field public final r:Lw3/a;

.field public final s:Landroid/os/Looper;

.field public final t:Lt5/e;

.field public final u:J

.field public final v:J

.field public final w:Lv5/z;

.field public final x:Lv3/d0$b;

.field public final y:Lv3/d0$c;

.field public final z:Lv3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.exoplayer"

    invoke-static {v0}, Lv3/h0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lv3/r;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Lv3/e;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lb5/g;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v2, v3}, Lb5/g;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v1, Lv3/d0;->d:Lb5/g;

    .line 15
    .line 16
    :try_start_0
    const-string v2, "ExoPlayerImpl"

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v5, "Init "

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v5, " ["

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v5, "ExoPlayerLib/2.18.7"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v5, "] ["

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    sget-object v5, Lv5/e0;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v5, "]"

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v2, v4}, Lv5/m;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v0, Lv3/r;->a:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iput-object v2, v1, Lv3/d0;->e:Landroid/content/Context;

    .line 78
    .line 79
    iget-object v2, v0, Lv3/r;->h:Ln7/e;

    .line 80
    .line 81
    iget-object v4, v0, Lv3/r;->b:Lv5/z;

    .line 82
    .line 83
    invoke-interface {v2, v4}, Ln7/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lw3/a;

    .line 88
    .line 89
    iput-object v2, v1, Lv3/d0;->r:Lw3/a;

    .line 90
    .line 91
    iget-object v2, v0, Lv3/r;->j:Lx3/d;

    .line 92
    .line 93
    iput-object v2, v1, Lv3/d0;->W:Lx3/d;

    .line 94
    .line 95
    iget v2, v0, Lv3/r;->k:I

    .line 96
    .line 97
    iput v2, v1, Lv3/d0;->T:I

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    iput-boolean v2, v1, Lv3/d0;->Y:Z

    .line 101
    .line 102
    iget-wide v4, v0, Lv3/r;->r:J

    .line 103
    .line 104
    iput-wide v4, v1, Lv3/d0;->E:J

    .line 105
    .line 106
    new-instance v11, Lv3/d0$b;

    .line 107
    .line 108
    invoke-direct {v11, v1}, Lv3/d0$b;-><init>(Lv3/d0;)V

    .line 109
    .line 110
    .line 111
    iput-object v11, v1, Lv3/d0;->x:Lv3/d0$b;

    .line 112
    .line 113
    new-instance v4, Lv3/d0$c;

    .line 114
    .line 115
    invoke-direct {v4}, Lv3/d0$c;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v4, v1, Lv3/d0;->y:Lv3/d0$c;

    .line 119
    .line 120
    new-instance v4, Landroid/os/Handler;

    .line 121
    .line 122
    iget-object v5, v0, Lv3/r;->i:Landroid/os/Looper;

    .line 123
    .line 124
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 125
    .line 126
    .line 127
    iget-object v5, v0, Lv3/r;->c:Ln7/q;

    .line 128
    .line 129
    invoke-interface {v5}, Ln7/q;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    move-object v6, v5

    .line 134
    check-cast v6, Lv3/m1;

    .line 135
    .line 136
    move-object v7, v4

    .line 137
    move-object v8, v11

    .line 138
    move-object v9, v11

    .line 139
    move-object v10, v11

    .line 140
    invoke-interface/range {v6 .. v11}, Lv3/m1;->a(Landroid/os/Handler;Lv3/d0$b;Lv3/d0$b;Lv3/d0$b;Lv3/d0$b;)[Lv3/j1;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    iput-object v5, v1, Lv3/d0;->g:[Lv3/j1;

    .line 145
    .line 146
    array-length v6, v5

    .line 147
    if-lez v6, :cond_0

    .line 148
    .line 149
    move v6, v3

    .line 150
    goto :goto_0

    .line 151
    :cond_0
    move v6, v2

    .line 152
    :goto_0
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 153
    .line 154
    .line 155
    iget-object v6, v0, Lv3/r;->e:Ln7/q;

    .line 156
    .line 157
    invoke-interface {v6}, Ln7/q;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, Lr5/o;

    .line 162
    .line 163
    iput-object v6, v1, Lv3/d0;->h:Lr5/o;

    .line 164
    .line 165
    iget-object v6, v0, Lv3/r;->d:Ln7/q;

    .line 166
    .line 167
    invoke-interface {v6}, Ln7/q;->get()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    check-cast v6, Lz4/t$a;

    .line 172
    .line 173
    iput-object v6, v1, Lv3/d0;->q:Lz4/t$a;

    .line 174
    .line 175
    iget-object v6, v0, Lv3/r;->g:Ln7/q;

    .line 176
    .line 177
    invoke-interface {v6}, Ln7/q;->get()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    check-cast v6, Lt5/e;

    .line 182
    .line 183
    iput-object v6, v1, Lv3/d0;->t:Lt5/e;

    .line 184
    .line 185
    iget-boolean v6, v0, Lv3/r;->l:Z

    .line 186
    .line 187
    iput-boolean v6, v1, Lv3/d0;->p:Z

    .line 188
    .line 189
    iget-object v6, v0, Lv3/r;->m:Lv3/n1;

    .line 190
    .line 191
    iput-object v6, v1, Lv3/d0;->L:Lv3/n1;

    .line 192
    .line 193
    iget-wide v6, v0, Lv3/r;->n:J

    .line 194
    .line 195
    iput-wide v6, v1, Lv3/d0;->u:J

    .line 196
    .line 197
    iget-wide v6, v0, Lv3/r;->o:J

    .line 198
    .line 199
    iput-wide v6, v1, Lv3/d0;->v:J

    .line 200
    .line 201
    iget-object v6, v0, Lv3/r;->i:Landroid/os/Looper;

    .line 202
    .line 203
    iput-object v6, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 204
    .line 205
    iget-object v7, v0, Lv3/r;->b:Lv5/z;

    .line 206
    .line 207
    iput-object v7, v1, Lv3/d0;->w:Lv5/z;

    .line 208
    .line 209
    iput-object v1, v1, Lv3/d0;->f:Lv3/f1;

    .line 210
    .line 211
    new-instance v8, Lv5/l;

    .line 212
    .line 213
    new-instance v9, Lv3/w;

    .line 214
    .line 215
    invoke-direct {v9, v1}, Lv3/w;-><init>(Lv3/d0;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v8, v6, v7, v9}, Lv5/l;-><init>(Landroid/os/Looper;Lv5/c;Lv5/l$b;)V

    .line 219
    .line 220
    .line 221
    iput-object v8, v1, Lv3/d0;->l:Lv5/l;

    .line 222
    .line 223
    new-instance v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 224
    .line 225
    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v6, v1, Lv3/d0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 229
    .line 230
    new-instance v6, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v6, v1, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 236
    .line 237
    new-instance v6, Lz4/e0$a;

    .line 238
    .line 239
    invoke-direct {v6}, Lz4/e0$a;-><init>()V

    .line 240
    .line 241
    .line 242
    iput-object v6, v1, Lv3/d0;->M:Lz4/e0;

    .line 243
    .line 244
    new-instance v6, Lr5/p;

    .line 245
    .line 246
    array-length v7, v5

    .line 247
    new-array v7, v7, [Lv3/l1;

    .line 248
    .line 249
    array-length v5, v5

    .line 250
    new-array v5, v5, [Lr5/h;

    .line 251
    .line 252
    sget-object v8, Lv3/s1;->b:Lv3/s1;

    .line 253
    .line 254
    const/4 v9, 0x0

    .line 255
    invoke-direct {v6, v7, v5, v8, v9}, Lr5/p;-><init>([Lv3/l1;[Lr5/h;Lv3/s1;Lr5/j$a;)V

    .line 256
    .line 257
    .line 258
    iput-object v6, v1, Lv3/d0;->b:Lr5/p;

    .line 259
    .line 260
    new-instance v5, Lv3/r1$b;

    .line 261
    .line 262
    invoke-direct {v5}, Lv3/r1$b;-><init>()V

    .line 263
    .line 264
    .line 265
    iput-object v5, v1, Lv3/d0;->n:Lv3/r1$b;

    .line 266
    .line 267
    new-instance v5, Landroid/util/SparseBooleanArray;

    .line 268
    .line 269
    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 270
    .line 271
    .line 272
    const/16 v6, 0x15

    .line 273
    .line 274
    new-array v7, v6, [I

    .line 275
    .line 276
    aput v3, v7, v2

    .line 277
    .line 278
    const/4 v8, 0x2

    .line 279
    aput v8, v7, v3

    .line 280
    .line 281
    const/4 v10, 0x3

    .line 282
    aput v10, v7, v8

    .line 283
    .line 284
    const/16 v8, 0xd

    .line 285
    .line 286
    aput v8, v7, v10

    .line 287
    .line 288
    const/16 v10, 0xe

    .line 289
    .line 290
    const/4 v11, 0x4

    .line 291
    aput v10, v7, v11

    .line 292
    .line 293
    const/16 v12, 0xf

    .line 294
    .line 295
    const/4 v13, 0x5

    .line 296
    aput v12, v7, v13

    .line 297
    .line 298
    const/16 v14, 0x10

    .line 299
    .line 300
    const/4 v15, 0x6

    .line 301
    aput v14, v7, v15

    .line 302
    .line 303
    const/16 v15, 0x11

    .line 304
    .line 305
    const/16 v16, 0x7

    .line 306
    .line 307
    aput v15, v7, v16

    .line 308
    .line 309
    const/16 v16, 0x12

    .line 310
    .line 311
    const/16 v17, 0x8

    .line 312
    .line 313
    aput v16, v7, v17

    .line 314
    .line 315
    const/16 v17, 0x13

    .line 316
    .line 317
    const/16 v18, 0x9

    .line 318
    .line 319
    aput v17, v7, v18

    .line 320
    .line 321
    const/16 v2, 0x1f

    .line 322
    .line 323
    const/16 v13, 0xa

    .line 324
    .line 325
    aput v2, v7, v13

    .line 326
    .line 327
    const/16 v19, 0xb

    .line 328
    .line 329
    const/16 v20, 0x14

    .line 330
    .line 331
    aput v20, v7, v19

    .line 332
    .line 333
    const/16 v19, 0xc

    .line 334
    .line 335
    const/16 v21, 0x1e

    .line 336
    .line 337
    aput v21, v7, v19

    .line 338
    .line 339
    aput v6, v7, v8

    .line 340
    .line 341
    const/16 v8, 0x16

    .line 342
    .line 343
    aput v8, v7, v10

    .line 344
    .line 345
    const/16 v8, 0x17

    .line 346
    .line 347
    aput v8, v7, v12

    .line 348
    .line 349
    const/16 v8, 0x18

    .line 350
    .line 351
    aput v8, v7, v14

    .line 352
    .line 353
    const/16 v8, 0x19

    .line 354
    .line 355
    aput v8, v7, v15

    .line 356
    .line 357
    const/16 v8, 0x1a

    .line 358
    .line 359
    aput v8, v7, v16

    .line 360
    .line 361
    const/16 v8, 0x1b

    .line 362
    .line 363
    aput v8, v7, v17

    .line 364
    .line 365
    const/16 v8, 0x1c

    .line 366
    .line 367
    aput v8, v7, v20

    .line 368
    .line 369
    const/4 v8, 0x0

    .line 370
    :goto_1
    if-ge v8, v6, :cond_1

    .line 371
    .line 372
    aget v10, v7, v8

    .line 373
    .line 374
    xor-int/lit8 v12, v3, 0x0

    .line 375
    .line 376
    invoke-static {v12}, Lx6/b;->H(Z)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v10, v3}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 380
    .line 381
    .line 382
    add-int/lit8 v8, v8, 0x1

    .line 383
    .line 384
    goto :goto_1

    .line 385
    :cond_1
    const/16 v6, 0x1d

    .line 386
    .line 387
    iget-object v7, v1, Lv3/d0;->h:Lr5/o;

    .line 388
    .line 389
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    instance-of v7, v7, Lr5/f;

    .line 393
    .line 394
    if-eqz v7, :cond_2

    .line 395
    .line 396
    const/4 v7, 0x0

    .line 397
    xor-int/2addr v7, v3

    .line 398
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v6, v3}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 402
    .line 403
    .line 404
    :cond_2
    new-instance v6, Lv3/f1$a;

    .line 405
    .line 406
    xor-int/lit8 v7, v3, 0x0

    .line 407
    .line 408
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 409
    .line 410
    .line 411
    new-instance v7, Lv5/h;

    .line 412
    .line 413
    invoke-direct {v7, v5}, Lv5/h;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 414
    .line 415
    .line 416
    invoke-direct {v6, v7}, Lv3/f1$a;-><init>(Lv5/h;)V

    .line 417
    .line 418
    .line 419
    iput-object v6, v1, Lv3/d0;->c:Lv3/f1$a;

    .line 420
    .line 421
    new-instance v5, Landroid/util/SparseBooleanArray;

    .line 422
    .line 423
    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 424
    .line 425
    .line 426
    const/4 v6, 0x0

    .line 427
    :goto_2
    invoke-virtual {v7}, Lv5/h;->b()I

    .line 428
    .line 429
    .line 430
    move-result v8

    .line 431
    if-ge v6, v8, :cond_3

    .line 432
    .line 433
    invoke-virtual {v7, v6}, Lv5/h;->a(I)I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    xor-int/lit8 v10, v3, 0x0

    .line 438
    .line 439
    invoke-static {v10}, Lx6/b;->H(Z)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5, v8, v3}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 443
    .line 444
    .line 445
    add-int/lit8 v6, v6, 0x1

    .line 446
    .line 447
    goto :goto_2

    .line 448
    :cond_3
    xor-int/lit8 v6, v3, 0x0

    .line 449
    .line 450
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v5, v11, v3}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 454
    .line 455
    .line 456
    xor-int/lit8 v6, v3, 0x0

    .line 457
    .line 458
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v13, v3}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 462
    .line 463
    .line 464
    new-instance v6, Lv3/f1$a;

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    xor-int/2addr v3, v7

    .line 468
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 469
    .line 470
    .line 471
    new-instance v3, Lv5/h;

    .line 472
    .line 473
    invoke-direct {v3, v5}, Lv5/h;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 474
    .line 475
    .line 476
    invoke-direct {v6, v3}, Lv3/f1$a;-><init>(Lv5/h;)V

    .line 477
    .line 478
    .line 479
    iput-object v6, v1, Lv3/d0;->N:Lv3/f1$a;

    .line 480
    .line 481
    iget-object v3, v1, Lv3/d0;->w:Lv5/z;

    .line 482
    .line 483
    iget-object v5, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 484
    .line 485
    invoke-virtual {v3, v5, v9}, Lv5/z;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lv5/a0;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    iput-object v3, v1, Lv3/d0;->i:Lv5/k;

    .line 490
    .line 491
    new-instance v3, Lio/flutter/plugins/firebase/auth/g;

    .line 492
    .line 493
    const/4 v5, 0x5

    .line 494
    invoke-direct {v3, v1, v5}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    .line 495
    .line 496
    .line 497
    iput-object v3, v1, Lv3/d0;->j:Lio/flutter/plugins/firebase/auth/g;

    .line 498
    .line 499
    iget-object v5, v1, Lv3/d0;->b:Lr5/p;

    .line 500
    .line 501
    invoke-static {v5}, Lv3/d1;->h(Lr5/p;)Lv3/d1;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    iput-object v5, v1, Lv3/d0;->e0:Lv3/d1;

    .line 506
    .line 507
    iget-object v5, v1, Lv3/d0;->r:Lw3/a;

    .line 508
    .line 509
    iget-object v6, v1, Lv3/d0;->f:Lv3/f1;

    .line 510
    .line 511
    iget-object v7, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 512
    .line 513
    invoke-interface {v5, v6, v7}, Lw3/a;->i0(Lv3/f1;Landroid/os/Looper;)V

    .line 514
    .line 515
    .line 516
    sget v5, Lv5/e0;->a:I

    .line 517
    .line 518
    if-ge v5, v2, :cond_4

    .line 519
    .line 520
    new-instance v2, Lw3/a0;

    .line 521
    .line 522
    invoke-direct {v2}, Lw3/a0;-><init>()V

    .line 523
    .line 524
    .line 525
    goto :goto_3

    .line 526
    :cond_4
    iget-object v2, v1, Lv3/d0;->e:Landroid/content/Context;

    .line 527
    .line 528
    iget-boolean v6, v0, Lv3/r;->s:Z

    .line 529
    .line 530
    invoke-static {v2, v1, v6}, Lv3/d0$a;->a(Landroid/content/Context;Lv3/d0;Z)Lw3/a0;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    :goto_3
    move-object/from16 v36, v2

    .line 535
    .line 536
    new-instance v2, Lv3/g0;

    .line 537
    .line 538
    iget-object v6, v1, Lv3/d0;->g:[Lv3/j1;

    .line 539
    .line 540
    iget-object v7, v1, Lv3/d0;->h:Lr5/o;

    .line 541
    .line 542
    iget-object v8, v1, Lv3/d0;->b:Lr5/p;

    .line 543
    .line 544
    iget-object v9, v0, Lv3/r;->f:Ln7/q;

    .line 545
    .line 546
    invoke-interface {v9}, Ln7/q;->get()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    move-object/from16 v23, v9

    .line 551
    .line 552
    check-cast v23, Lv3/n0;

    .line 553
    .line 554
    iget-object v9, v1, Lv3/d0;->t:Lt5/e;

    .line 555
    .line 556
    iget v10, v1, Lv3/d0;->F:I

    .line 557
    .line 558
    iget-boolean v11, v1, Lv3/d0;->G:Z

    .line 559
    .line 560
    iget-object v12, v1, Lv3/d0;->r:Lw3/a;

    .line 561
    .line 562
    iget-object v13, v1, Lv3/d0;->L:Lv3/n1;

    .line 563
    .line 564
    iget-object v14, v0, Lv3/r;->p:Lv3/m0;

    .line 565
    .line 566
    move-object v15, v4

    .line 567
    move/from16 v16, v5

    .line 568
    .line 569
    iget-wide v4, v0, Lv3/r;->q:J

    .line 570
    .line 571
    const/16 v32, 0x0

    .line 572
    .line 573
    move-object/from16 v17, v15

    .line 574
    .line 575
    iget-object v15, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 576
    .line 577
    iget-object v0, v1, Lv3/d0;->w:Lv5/z;

    .line 578
    .line 579
    move-object/from16 v19, v2

    .line 580
    .line 581
    move-object/from16 v20, v6

    .line 582
    .line 583
    move-object/from16 v21, v7

    .line 584
    .line 585
    move-object/from16 v22, v8

    .line 586
    .line 587
    move-object/from16 v24, v9

    .line 588
    .line 589
    move/from16 v25, v10

    .line 590
    .line 591
    move/from16 v26, v11

    .line 592
    .line 593
    move-object/from16 v27, v12

    .line 594
    .line 595
    move-object/from16 v28, v13

    .line 596
    .line 597
    move-object/from16 v29, v14

    .line 598
    .line 599
    move-wide/from16 v30, v4

    .line 600
    .line 601
    move-object/from16 v33, v15

    .line 602
    .line 603
    move-object/from16 v34, v0

    .line 604
    .line 605
    move-object/from16 v35, v3

    .line 606
    .line 607
    invoke-direct/range {v19 .. v36}, Lv3/g0;-><init>([Lv3/j1;Lr5/o;Lr5/p;Lv3/n0;Lt5/e;IZLw3/a;Lv3/n1;Lv3/m0;JZLandroid/os/Looper;Lv5/c;Lio/flutter/plugins/firebase/auth/g;Lw3/a0;)V

    .line 608
    .line 609
    .line 610
    iput-object v2, v1, Lv3/d0;->k:Lv3/g0;

    .line 611
    .line 612
    const/high16 v0, 0x3f800000    # 1.0f

    .line 613
    .line 614
    iput v0, v1, Lv3/d0;->X:F

    .line 615
    .line 616
    const/4 v0, 0x0

    .line 617
    iput v0, v1, Lv3/d0;->F:I

    .line 618
    .line 619
    sget-object v0, Lv3/p0;->Q:Lv3/p0;

    .line 620
    .line 621
    iput-object v0, v1, Lv3/d0;->O:Lv3/p0;

    .line 622
    .line 623
    iput-object v0, v1, Lv3/d0;->d0:Lv3/p0;

    .line 624
    .line 625
    const/4 v0, -0x1

    .line 626
    iput v0, v1, Lv3/d0;->f0:I

    .line 627
    .line 628
    const/16 v2, 0x15

    .line 629
    .line 630
    move/from16 v3, v16

    .line 631
    .line 632
    if-ge v3, v2, :cond_7

    .line 633
    .line 634
    iget-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 635
    .line 636
    if-eqz v0, :cond_5

    .line 637
    .line 638
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_5

    .line 643
    .line 644
    iget-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 647
    .line 648
    .line 649
    const/4 v0, 0x0

    .line 650
    iput-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 651
    .line 652
    :cond_5
    iget-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 653
    .line 654
    if-nez v0, :cond_6

    .line 655
    .line 656
    const/16 v4, 0xfa0

    .line 657
    .line 658
    const/4 v5, 0x4

    .line 659
    const/4 v6, 0x2

    .line 660
    const/4 v7, 0x2

    .line 661
    new-instance v0, Landroid/media/AudioTrack;

    .line 662
    .line 663
    const/4 v3, 0x3

    .line 664
    const/4 v8, 0x0

    .line 665
    const/4 v9, 0x0

    .line 666
    move-object v2, v0

    .line 667
    invoke-direct/range {v2 .. v9}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 668
    .line 669
    .line 670
    iput-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 671
    .line 672
    :cond_6
    iget-object v0, v1, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 673
    .line 674
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    goto :goto_4

    .line 679
    :cond_7
    iget-object v2, v1, Lv3/d0;->e:Landroid/content/Context;

    .line 680
    .line 681
    const-string v3, "audio"

    .line 682
    .line 683
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Landroid/media/AudioManager;

    .line 688
    .line 689
    if-nez v2, :cond_8

    .line 690
    .line 691
    goto :goto_4

    .line 692
    :cond_8
    invoke-virtual {v2}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    :goto_4
    iput v0, v1, Lv3/d0;->V:I

    .line 697
    .line 698
    sget v0, Lh5/c;->b:I

    .line 699
    .line 700
    const/4 v0, 0x1

    .line 701
    iput-boolean v0, v1, Lv3/d0;->Z:Z

    .line 702
    .line 703
    iget-object v0, v1, Lv3/d0;->r:Lw3/a;

    .line 704
    .line 705
    invoke-virtual {v1, v0}, Lv3/d0;->s(Lv3/f1$c;)V

    .line 706
    .line 707
    .line 708
    iget-object v0, v1, Lv3/d0;->t:Lt5/e;

    .line 709
    .line 710
    new-instance v2, Landroid/os/Handler;

    .line 711
    .line 712
    iget-object v3, v1, Lv3/d0;->s:Landroid/os/Looper;

    .line 713
    .line 714
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 715
    .line 716
    .line 717
    iget-object v3, v1, Lv3/d0;->r:Lw3/a;

    .line 718
    .line 719
    invoke-interface {v0, v2, v3}, Lt5/e;->e(Landroid/os/Handler;Lw3/a;)V

    .line 720
    .line 721
    .line 722
    iget-object v0, v1, Lv3/d0;->x:Lv3/d0$b;

    .line 723
    .line 724
    iget-object v2, v1, Lv3/d0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 725
    .line 726
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    new-instance v0, Lv3/b;

    .line 730
    .line 731
    move-object/from16 v2, p1

    .line 732
    .line 733
    iget-object v3, v2, Lv3/r;->a:Landroid/content/Context;

    .line 734
    .line 735
    iget-object v4, v1, Lv3/d0;->x:Lv3/d0$b;

    .line 736
    .line 737
    move-object/from16 v5, v17

    .line 738
    .line 739
    invoke-direct {v0, v3, v5, v4}, Lv3/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lv3/d0$b;)V

    .line 740
    .line 741
    .line 742
    iput-object v0, v1, Lv3/d0;->z:Lv3/b;

    .line 743
    .line 744
    invoke-virtual {v0}, Lv3/b;->a()V

    .line 745
    .line 746
    .line 747
    new-instance v0, Lv3/d;

    .line 748
    .line 749
    iget-object v3, v2, Lv3/r;->a:Landroid/content/Context;

    .line 750
    .line 751
    iget-object v4, v1, Lv3/d0;->x:Lv3/d0$b;

    .line 752
    .line 753
    invoke-direct {v0, v3, v5, v4}, Lv3/d;-><init>(Landroid/content/Context;Landroid/os/Handler;Lv3/d0$b;)V

    .line 754
    .line 755
    .line 756
    iput-object v0, v1, Lv3/d0;->A:Lv3/d;

    .line 757
    .line 758
    const/4 v3, 0x0

    .line 759
    invoke-virtual {v0, v3}, Lv3/d;->c(Lx3/d;)V

    .line 760
    .line 761
    .line 762
    new-instance v0, Lv3/p1;

    .line 763
    .line 764
    iget-object v3, v2, Lv3/r;->a:Landroid/content/Context;

    .line 765
    .line 766
    iget-object v4, v1, Lv3/d0;->x:Lv3/d0$b;

    .line 767
    .line 768
    invoke-direct {v0, v3, v5, v4}, Lv3/p1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lv3/d0$b;)V

    .line 769
    .line 770
    .line 771
    iput-object v0, v1, Lv3/d0;->B:Lv3/p1;

    .line 772
    .line 773
    iget-object v3, v1, Lv3/d0;->W:Lx3/d;

    .line 774
    .line 775
    iget v3, v3, Lx3/d;->c:I

    .line 776
    .line 777
    invoke-static {v3}, Lv5/e0;->y(I)I

    .line 778
    .line 779
    .line 780
    move-result v3

    .line 781
    invoke-virtual {v0, v3}, Lv3/p1;->b(I)V

    .line 782
    .line 783
    .line 784
    new-instance v3, Lv3/t1;

    .line 785
    .line 786
    iget-object v4, v2, Lv3/r;->a:Landroid/content/Context;

    .line 787
    .line 788
    invoke-direct {v3, v4}, Lv3/t1;-><init>(Landroid/content/Context;)V

    .line 789
    .line 790
    .line 791
    iput-object v3, v1, Lv3/d0;->C:Lv3/t1;

    .line 792
    .line 793
    new-instance v3, Lv3/u1;

    .line 794
    .line 795
    iget-object v2, v2, Lv3/r;->a:Landroid/content/Context;

    .line 796
    .line 797
    invoke-direct {v3, v2}, Lv3/u1;-><init>(Landroid/content/Context;)V

    .line 798
    .line 799
    .line 800
    iput-object v3, v1, Lv3/d0;->D:Lv3/u1;

    .line 801
    .line 802
    invoke-static {v0}, Lv3/d0;->Y(Lv3/p1;)Lv3/m;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    iput-object v0, v1, Lv3/d0;->c0:Lv3/m;

    .line 807
    .line 808
    sget-object v0, Lw5/o;->e:Ljava/lang/String;

    .line 809
    .line 810
    sget-object v0, Lv5/w;->c:Lv5/w;

    .line 811
    .line 812
    iput-object v0, v1, Lv3/d0;->U:Lv5/w;

    .line 813
    .line 814
    iget-object v0, v1, Lv3/d0;->h:Lr5/o;

    .line 815
    .line 816
    iget-object v2, v1, Lv3/d0;->W:Lx3/d;

    .line 817
    .line 818
    invoke-virtual {v0, v2}, Lr5/o;->d(Lx3/d;)V

    .line 819
    .line 820
    .line 821
    iget v0, v1, Lv3/d0;->V:I

    .line 822
    .line 823
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    const/16 v2, 0xa

    .line 828
    .line 829
    const/4 v3, 0x1

    .line 830
    invoke-virtual {v1, v0, v3, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 831
    .line 832
    .line 833
    iget v0, v1, Lv3/d0;->V:I

    .line 834
    .line 835
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    const/4 v4, 0x2

    .line 840
    invoke-virtual {v1, v0, v4, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 841
    .line 842
    .line 843
    iget-object v0, v1, Lv3/d0;->W:Lx3/d;

    .line 844
    .line 845
    const/4 v2, 0x3

    .line 846
    invoke-virtual {v1, v0, v3, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 847
    .line 848
    .line 849
    iget v0, v1, Lv3/d0;->T:I

    .line 850
    .line 851
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    const/4 v2, 0x4

    .line 856
    invoke-virtual {v1, v0, v4, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 857
    .line 858
    .line 859
    const/4 v0, 0x0

    .line 860
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    const/4 v2, 0x5

    .line 865
    invoke-virtual {v1, v0, v4, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 866
    .line 867
    .line 868
    iget-boolean v0, v1, Lv3/d0;->Y:Z

    .line 869
    .line 870
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    const/16 v2, 0x9

    .line 875
    .line 876
    const/4 v3, 0x1

    .line 877
    invoke-virtual {v1, v0, v3, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 878
    .line 879
    .line 880
    iget-object v0, v1, Lv3/d0;->y:Lv3/d0$c;

    .line 881
    .line 882
    const/4 v2, 0x7

    .line 883
    invoke-virtual {v1, v0, v4, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v1, Lv3/d0;->y:Lv3/d0$c;

    .line 887
    .line 888
    const/16 v2, 0x8

    .line 889
    .line 890
    const/4 v3, 0x6

    .line 891
    invoke-virtual {v1, v0, v3, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 892
    .line 893
    .line 894
    iget-object v0, v1, Lv3/d0;->d:Lb5/g;

    .line 895
    .line 896
    invoke-virtual {v0}, Lb5/g;->a()Z

    .line 897
    .line 898
    .line 899
    return-void

    .line 900
    :catchall_0
    move-exception v0

    .line 901
    iget-object v2, v1, Lv3/d0;->d:Lb5/g;

    .line 902
    .line 903
    invoke-virtual {v2}, Lb5/g;->a()Z

    .line 904
    .line 905
    .line 906
    throw v0
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

.method public static Y(Lv3/p1;)Lv3/m;
    .locals 4

    .line 1
    new-instance v0, Lv3/m;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Lv5/e0;->a:I

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lv3/p1;->d:Landroid/media/AudioManager;

    .line 14
    .line 15
    iget v2, p0, Lv3/p1;->f:I

    .line 16
    .line 17
    invoke-static {v1, v2}, Lcom/google/android/recaptcha/internal/a;->c(Landroid/media/AudioManager;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    iget-object v2, p0, Lv3/p1;->d:Landroid/media/AudioManager;

    .line 24
    .line 25
    iget p0, p0, Lv3/p1;->f:I

    .line 26
    .line 27
    invoke-virtual {v2, p0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-direct {v0, v3, v1, p0}, Lv3/m;-><init>(III)V

    .line 32
    .line 33
    .line 34
    return-object v0
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

.method public static c0(Lv3/d1;)J
    .locals 6

    .line 1
    new-instance v0, Lv3/r1$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lv3/r1$c;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lv3/r1$b;

    .line 7
    .line 8
    invoke-direct {v1}, Lv3/r1$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lv3/d1;->a:Lv3/r1;

    .line 12
    .line 13
    iget-object v3, p0, Lv3/d1;->b:Lz4/t$b;

    .line 14
    .line 15
    iget-object v3, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Lv3/d1;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lv3/d1;->a:Lv3/r1;

    .line 32
    .line 33
    iget v1, v1, Lv3/r1$b;->c:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-wide v0, p0, Lv3/r1$c;->u:J

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-wide v0, v1, Lv3/r1$b;->e:J

    .line 43
    .line 44
    add-long/2addr v0, v2

    .line 45
    :goto_0
    return-wide v0
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

.method public static d0(Lv3/d1;)Z
    .locals 2

    iget v0, p0, Lv3/d1;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lv3/d1;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lv3/d1;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final B()Lv3/s1;
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->i:Lr5/p;

    iget-object v0, v0, Lr5/p;->d:Lv3/s1;

    return-object v0
.end method

.method public final E()I
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    invoke-virtual {p0}, Lv3/d0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    iget v0, v0, Lz4/s;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public final F()I
    .locals 2

    invoke-virtual {p0}, Lv3/d0;->u0()V

    invoke-virtual {p0}, Lv3/d0;->b0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final I()I
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget v0, v0, Lv3/d1;->m:I

    return v0
.end method

.method public final J()Lv3/r1;
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    return-object v0
.end method

.method public final K()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lv3/d0;->s:Landroid/os/Looper;

    return-object v0
.end method

.method public final L()Z
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-boolean v0, p0, Lv3/d0;->G:Z

    return v0
.end method

.method public final P()J
    .locals 2

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    invoke-virtual {p0, v0}, Lv3/d0;->a0(Lv3/d1;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final S(IJZ)V
    .locals 12

    .line 1
    move-object v11, p0

    .line 2
    move v0, p1

    .line 3
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-static {v2}, Lx6/b;->q(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v11, Lv3/d0;->r:Lw3/a;

    .line 16
    .line 17
    invoke-interface {v2}, Lw3/a;->S()V

    .line 18
    .line 19
    .line 20
    iget-object v2, v11, Lv3/d0;->e0:Lv3/d1;

    .line 21
    .line 22
    iget-object v2, v2, Lv3/d1;->a:Lv3/r1;

    .line 23
    .line 24
    invoke-virtual {v2}, Lv3/r1;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Lv3/r1;->o()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-lt v0, v3, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget v3, v11, Lv3/d0;->H:I

    .line 38
    .line 39
    add-int/2addr v3, v1

    .line 40
    iput v3, v11, Lv3/d0;->H:I

    .line 41
    .line 42
    invoke-virtual {p0}, Lv3/d0;->g()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    const-string v0, "ExoPlayerImpl"

    .line 49
    .line 50
    const-string v2, "seekTo ignored because an ad is playing"

    .line 51
    .line 52
    invoke-static {v0, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lv3/g0$d;

    .line 56
    .line 57
    iget-object v2, v11, Lv3/d0;->e0:Lv3/d1;

    .line 58
    .line 59
    invoke-direct {v0, v2}, Lv3/g0$d;-><init>(Lv3/d1;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v11, Lv3/d0;->j:Lio/flutter/plugins/firebase/auth/g;

    .line 66
    .line 67
    iget-object v1, v1, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lv3/d0;

    .line 70
    .line 71
    iget-object v2, v1, Lv3/d0;->i:Lv5/k;

    .line 72
    .line 73
    new-instance v3, Lg/q;

    .line 74
    .line 75
    const/4 v4, 0x4

    .line 76
    invoke-direct {v3, v4, v1, v0}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v3}, Lv5/k;->e(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-virtual {p0}, Lv3/d0;->d()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-ne v3, v1, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const/4 v1, 0x2

    .line 91
    :goto_1
    invoke-virtual {p0}, Lv3/d0;->F()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    iget-object v3, v11, Lv3/d0;->e0:Lv3/d1;

    .line 96
    .line 97
    invoke-virtual {v3, v1}, Lv3/d1;->f(I)Lv3/d1;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    move-wide v3, p2

    .line 102
    invoke-virtual {p0, v2, p1, p2, p3}, Lv3/d0;->f0(Lv3/r1;IJ)Landroid/util/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {p0, v1, v2, v5}, Lv3/d0;->e0(Lv3/d1;Lv3/r1;Landroid/util/Pair;)Lv3/d1;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v5, v11, Lv3/d0;->k:Lv3/g0;

    .line 111
    .line 112
    invoke-static {p2, p3}, Lv5/e0;->I(J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    iget-object v5, v5, Lv3/g0;->p:Lv5/k;

    .line 117
    .line 118
    new-instance v6, Lv3/g0$g;

    .line 119
    .line 120
    invoke-direct {v6, v2, p1, v3, v4}, Lv3/g0$g;-><init>(Lv3/r1;IJ)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x3

    .line 124
    invoke-interface {v5, v0, v6}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 129
    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v3, 0x1

    .line 133
    const/4 v4, 0x1

    .line 134
    const/4 v5, 0x1

    .line 135
    const/4 v6, 0x1

    .line 136
    invoke-virtual {p0, v1}, Lv3/d0;->a0(Lv3/d1;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    move-object v0, p0

    .line 141
    move/from16 v10, p4

    .line 142
    .line 143
    invoke-virtual/range {v0 .. v10}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 144
    .line 145
    .line 146
    return-void
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

.method public final X()Lv3/p0;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv3/d0;->J()Lv3/r1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lv3/d0;->d0:Lv3/p0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lv3/d0;->F()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lv3/r1$c;->c:Lv3/o0;

    .line 25
    .line 26
    iget-object v1, p0, Lv3/d0;->d0:Lv3/p0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, Lv3/p0$a;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lv3/p0$a;-><init>(Lv3/p0;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lv3/o0;->d:Lv3/p0;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    iget-object v1, v0, Lv3/p0;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iput-object v1, v2, Lv3/p0$a;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v1, v0, Lv3/p0;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iput-object v1, v2, Lv3/p0$a;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v1, v0, Lv3/p0;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iput-object v1, v2, Lv3/p0$a;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v1, v0, Lv3/p0;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    iput-object v1, v2, Lv3/p0$a;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v1, v0, Lv3/p0;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v1, :cond_6

    .line 69
    .line 70
    iput-object v1, v2, Lv3/p0$a;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v1, v0, Lv3/p0;->f:Ljava/lang/CharSequence;

    .line 73
    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    iput-object v1, v2, Lv3/p0$a;->f:Ljava/lang/CharSequence;

    .line 77
    .line 78
    :cond_7
    iget-object v1, v0, Lv3/p0;->o:Ljava/lang/CharSequence;

    .line 79
    .line 80
    if-eqz v1, :cond_8

    .line 81
    .line 82
    iput-object v1, v2, Lv3/p0$a;->g:Ljava/lang/CharSequence;

    .line 83
    .line 84
    :cond_8
    iget-object v1, v0, Lv3/p0;->p:Lv3/i1;

    .line 85
    .line 86
    if-eqz v1, :cond_9

    .line 87
    .line 88
    iput-object v1, v2, Lv3/p0$a;->h:Lv3/i1;

    .line 89
    .line 90
    :cond_9
    iget-object v1, v0, Lv3/p0;->q:Lv3/i1;

    .line 91
    .line 92
    if-eqz v1, :cond_a

    .line 93
    .line 94
    iput-object v1, v2, Lv3/p0$a;->i:Lv3/i1;

    .line 95
    .line 96
    :cond_a
    iget-object v1, v0, Lv3/p0;->r:[B

    .line 97
    .line 98
    if-eqz v1, :cond_b

    .line 99
    .line 100
    iget-object v3, v0, Lv3/p0;->s:Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, [B

    .line 107
    .line 108
    iput-object v1, v2, Lv3/p0$a;->j:[B

    .line 109
    .line 110
    iput-object v3, v2, Lv3/p0$a;->k:Ljava/lang/Integer;

    .line 111
    .line 112
    :cond_b
    iget-object v1, v0, Lv3/p0;->t:Landroid/net/Uri;

    .line 113
    .line 114
    if-eqz v1, :cond_c

    .line 115
    .line 116
    iput-object v1, v2, Lv3/p0$a;->l:Landroid/net/Uri;

    .line 117
    .line 118
    :cond_c
    iget-object v1, v0, Lv3/p0;->u:Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v1, :cond_d

    .line 121
    .line 122
    iput-object v1, v2, Lv3/p0$a;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    :cond_d
    iget-object v1, v0, Lv3/p0;->v:Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v1, :cond_e

    .line 127
    .line 128
    iput-object v1, v2, Lv3/p0$a;->n:Ljava/lang/Integer;

    .line 129
    .line 130
    :cond_e
    iget-object v1, v0, Lv3/p0;->w:Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v1, :cond_f

    .line 133
    .line 134
    iput-object v1, v2, Lv3/p0$a;->o:Ljava/lang/Integer;

    .line 135
    .line 136
    :cond_f
    iget-object v1, v0, Lv3/p0;->x:Ljava/lang/Boolean;

    .line 137
    .line 138
    if-eqz v1, :cond_10

    .line 139
    .line 140
    iput-object v1, v2, Lv3/p0$a;->p:Ljava/lang/Boolean;

    .line 141
    .line 142
    :cond_10
    iget-object v1, v0, Lv3/p0;->y:Ljava/lang/Boolean;

    .line 143
    .line 144
    if-eqz v1, :cond_11

    .line 145
    .line 146
    iput-object v1, v2, Lv3/p0$a;->q:Ljava/lang/Boolean;

    .line 147
    .line 148
    :cond_11
    iget-object v1, v0, Lv3/p0;->z:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v1, :cond_12

    .line 151
    .line 152
    iput-object v1, v2, Lv3/p0$a;->r:Ljava/lang/Integer;

    .line 153
    .line 154
    :cond_12
    iget-object v1, v0, Lv3/p0;->A:Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v1, :cond_13

    .line 157
    .line 158
    iput-object v1, v2, Lv3/p0$a;->r:Ljava/lang/Integer;

    .line 159
    .line 160
    :cond_13
    iget-object v1, v0, Lv3/p0;->B:Ljava/lang/Integer;

    .line 161
    .line 162
    if-eqz v1, :cond_14

    .line 163
    .line 164
    iput-object v1, v2, Lv3/p0$a;->s:Ljava/lang/Integer;

    .line 165
    .line 166
    :cond_14
    iget-object v1, v0, Lv3/p0;->C:Ljava/lang/Integer;

    .line 167
    .line 168
    if-eqz v1, :cond_15

    .line 169
    .line 170
    iput-object v1, v2, Lv3/p0$a;->t:Ljava/lang/Integer;

    .line 171
    .line 172
    :cond_15
    iget-object v1, v0, Lv3/p0;->D:Ljava/lang/Integer;

    .line 173
    .line 174
    if-eqz v1, :cond_16

    .line 175
    .line 176
    iput-object v1, v2, Lv3/p0$a;->u:Ljava/lang/Integer;

    .line 177
    .line 178
    :cond_16
    iget-object v1, v0, Lv3/p0;->E:Ljava/lang/Integer;

    .line 179
    .line 180
    if-eqz v1, :cond_17

    .line 181
    .line 182
    iput-object v1, v2, Lv3/p0$a;->v:Ljava/lang/Integer;

    .line 183
    .line 184
    :cond_17
    iget-object v1, v0, Lv3/p0;->F:Ljava/lang/Integer;

    .line 185
    .line 186
    if-eqz v1, :cond_18

    .line 187
    .line 188
    iput-object v1, v2, Lv3/p0$a;->w:Ljava/lang/Integer;

    .line 189
    .line 190
    :cond_18
    iget-object v1, v0, Lv3/p0;->G:Ljava/lang/CharSequence;

    .line 191
    .line 192
    if-eqz v1, :cond_19

    .line 193
    .line 194
    iput-object v1, v2, Lv3/p0$a;->x:Ljava/lang/CharSequence;

    .line 195
    .line 196
    :cond_19
    iget-object v1, v0, Lv3/p0;->H:Ljava/lang/CharSequence;

    .line 197
    .line 198
    if-eqz v1, :cond_1a

    .line 199
    .line 200
    iput-object v1, v2, Lv3/p0$a;->y:Ljava/lang/CharSequence;

    .line 201
    .line 202
    :cond_1a
    iget-object v1, v0, Lv3/p0;->I:Ljava/lang/CharSequence;

    .line 203
    .line 204
    if-eqz v1, :cond_1b

    .line 205
    .line 206
    iput-object v1, v2, Lv3/p0$a;->z:Ljava/lang/CharSequence;

    .line 207
    .line 208
    :cond_1b
    iget-object v1, v0, Lv3/p0;->J:Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v1, :cond_1c

    .line 211
    .line 212
    iput-object v1, v2, Lv3/p0$a;->A:Ljava/lang/Integer;

    .line 213
    .line 214
    :cond_1c
    iget-object v1, v0, Lv3/p0;->K:Ljava/lang/Integer;

    .line 215
    .line 216
    if-eqz v1, :cond_1d

    .line 217
    .line 218
    iput-object v1, v2, Lv3/p0$a;->B:Ljava/lang/Integer;

    .line 219
    .line 220
    :cond_1d
    iget-object v1, v0, Lv3/p0;->L:Ljava/lang/CharSequence;

    .line 221
    .line 222
    if-eqz v1, :cond_1e

    .line 223
    .line 224
    iput-object v1, v2, Lv3/p0$a;->C:Ljava/lang/CharSequence;

    .line 225
    .line 226
    :cond_1e
    iget-object v1, v0, Lv3/p0;->M:Ljava/lang/CharSequence;

    .line 227
    .line 228
    if-eqz v1, :cond_1f

    .line 229
    .line 230
    iput-object v1, v2, Lv3/p0$a;->D:Ljava/lang/CharSequence;

    .line 231
    .line 232
    :cond_1f
    iget-object v1, v0, Lv3/p0;->N:Ljava/lang/CharSequence;

    .line 233
    .line 234
    if-eqz v1, :cond_20

    .line 235
    .line 236
    iput-object v1, v2, Lv3/p0$a;->E:Ljava/lang/CharSequence;

    .line 237
    .line 238
    :cond_20
    iget-object v1, v0, Lv3/p0;->O:Ljava/lang/Integer;

    .line 239
    .line 240
    if-eqz v1, :cond_21

    .line 241
    .line 242
    iput-object v1, v2, Lv3/p0$a;->F:Ljava/lang/Integer;

    .line 243
    .line 244
    :cond_21
    iget-object v0, v0, Lv3/p0;->P:Landroid/os/Bundle;

    .line 245
    .line 246
    if-eqz v0, :cond_22

    .line 247
    .line 248
    iput-object v0, v2, Lv3/p0$a;->G:Landroid/os/Bundle;

    .line 249
    .line 250
    :cond_22
    :goto_0
    new-instance v0, Lv3/p0;

    .line 251
    .line 252
    invoke-direct {v0, v2}, Lv3/p0;-><init>(Lv3/p0$a;)V

    .line 253
    .line 254
    .line 255
    return-object v0
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

.method public final Z(Lv3/g1$b;)Lv3/g1;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lv3/d0;->b0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v8, Lv3/g1;

    .line 6
    .line 7
    iget-object v2, p0, Lv3/d0;->k:Lv3/g0;

    .line 8
    .line 9
    iget-object v1, p0, Lv3/d0;->e0:Lv3/d1;

    .line 10
    .line 11
    iget-object v4, v1, Lv3/d1;->a:Lv3/r1;

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :cond_0
    move v5, v0

    .line 18
    iget-object v6, p0, Lv3/d0;->w:Lv5/z;

    .line 19
    .line 20
    iget-object v7, v2, Lv3/g0;->r:Landroid/os/Looper;

    .line 21
    .line 22
    move-object v1, v8

    .line 23
    move-object v3, p1

    .line 24
    invoke-direct/range {v1 .. v7}, Lv3/g1;-><init>(Lv3/g0;Lv3/g1$b;Lv3/r1;ILv5/c;Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    return-object v8
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

.method public final a()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv3/d0;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lv3/d0;->A:Lv3/d;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, Lv3/d;->e(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    move v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v3

    .line 23
    :goto_0
    invoke-virtual {p0, v1, v4, v0}, Lv3/d0;->r0(IIZ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 27
    .line 28
    iget v1, v0, Lv3/d1;->e:I

    .line 29
    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lv3/d1;->d(Lv3/n;)Lv3/d1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 39
    .line 40
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    :cond_2
    invoke-virtual {v0, v2}, Lv3/d1;->f(I)Lv3/d1;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget v0, p0, Lv3/d0;->H:I

    .line 52
    .line 53
    add-int/2addr v0, v3

    .line 54
    iput v0, p0, Lv3/d0;->H:I

    .line 55
    .line 56
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 57
    .line 58
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-interface {v0, v1}, Lv5/k;->f(I)Lv5/a0$a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 66
    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    const/4 v7, 0x1

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x5

    .line 73
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const/4 v13, -0x1

    .line 79
    const/4 v14, 0x0

    .line 80
    move-object v4, p0

    .line 81
    invoke-virtual/range {v4 .. v14}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method

.method public final a0(Lv3/d1;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lv3/d1;->a:Lv3/r1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lv3/d0;->g0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v0, p1, Lv3/d1;->b:Lz4/t$b;

    .line 17
    .line 18
    invoke-virtual {v0}, Lz4/s;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-wide v0, p1, Lv3/d1;->r:J

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_1
    iget-object v0, p1, Lv3/d1;->a:Lv3/r1;

    .line 28
    .line 29
    iget-object v1, p1, Lv3/d1;->b:Lz4/t$b;

    .line 30
    .line 31
    iget-wide v2, p1, Lv3/d1;->r:J

    .line 32
    .line 33
    iget-object p1, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 36
    .line 37
    invoke-virtual {v0, p1, v1}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 41
    .line 42
    iget-wide v0, p1, Lv3/r1$b;->e:J

    .line 43
    .line 44
    add-long/2addr v2, v0

    .line 45
    return-wide v2
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

.method public final b0()I
    .locals 3

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v0}, Lv3/r1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lv3/d0;->f0:I

    return v0

    :cond_0
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Lv3/d0;->n:Lv3/r1$b;

    invoke-virtual {v1, v0, v2}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v0

    iget v0, v0, Lv3/r1$b;->c:I

    return v0
.end method

.method public final c(Lv3/e1;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 5
    .line 6
    iget-object v0, v0, Lv3/d1;->n:Lv3/e1;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv3/d1;->e(Lv3/e1;)Lv3/d1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, Lv3/d0;->H:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lv3/d0;->H:I

    .line 26
    .line 27
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 28
    .line 29
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-interface {v0, v1, p1}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lv5/a0$a;->a()V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x5

    .line 44
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 v10, -0x1

    .line 50
    const/4 v11, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-virtual/range {v1 .. v11}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final d()I
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget v0, v0, Lv3/d1;->e:I

    return v0
.end method

.method public final e0(Lv3/d1;Lv3/r1;Landroid/util/Pair;)Lv3/d1;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/d1;",
            "Lv3/r1;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Lv3/d1;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lv3/r1;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, Lx6/b;->q(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, Lv3/d1;->a:Lv3/r1;

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p2}, Lv3/d1;->g(Lv3/r1;)Lv3/d1;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual/range {p2 .. p2}, Lv3/r1;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v1, Lv3/d1;->s:Lz4/t$b;

    .line 39
    .line 40
    iget-wide v2, v0, Lv3/d0;->g0:J

    .line 41
    .line 42
    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v13

    .line 46
    const-wide/16 v15, 0x0

    .line 47
    .line 48
    sget-object v17, Lz4/j0;->d:Lz4/j0;

    .line 49
    .line 50
    iget-object v2, v0, Lv3/d0;->b:Lr5/p;

    .line 51
    .line 52
    sget-object v19, Lo7/l0;->e:Lo7/l0;

    .line 53
    .line 54
    move-object v8, v1

    .line 55
    move-wide v9, v13

    .line 56
    move-wide v11, v13

    .line 57
    move-object/from16 v18, v2

    .line 58
    .line 59
    invoke-virtual/range {v7 .. v19}, Lv3/d1;->b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2, v1}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-wide v2, v1, Lv3/d1;->r:J

    .line 68
    .line 69
    iput-wide v2, v1, Lv3/d1;->p:J

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_2
    iget-object v3, v7, Lv3/d1;->b:Lz4/t$b;

    .line 73
    .line 74
    iget-object v3, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    xor-int/2addr v8, v5

    .line 83
    if-eqz v8, :cond_3

    .line 84
    .line 85
    new-instance v9, Lz4/t$b;

    .line 86
    .line 87
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {v9, v10}, Lz4/t$b;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-object v9, v7, Lv3/d1;->b:Lz4/t$b;

    .line 94
    .line 95
    :goto_2
    move-object v15, v9

    .line 96
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v13

    .line 104
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->y()J

    .line 105
    .line 106
    .line 107
    move-result-wide v9

    .line 108
    invoke-static {v9, v10}, Lv5/e0;->I(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v9

    .line 112
    invoke-virtual {v6}, Lv3/r1;->p()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    iget-object v2, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 119
    .line 120
    invoke-virtual {v6, v3, v2}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-wide v2, v2, Lv3/r1$b;->e:J

    .line 125
    .line 126
    sub-long/2addr v9, v2

    .line 127
    :cond_4
    if-nez v8, :cond_a

    .line 128
    .line 129
    cmp-long v2, v13, v9

    .line 130
    .line 131
    if-gez v2, :cond_5

    .line 132
    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :cond_5
    if-nez v2, :cond_8

    .line 136
    .line 137
    iget-object v2, v7, Lv3/d1;->k:Lz4/t$b;

    .line 138
    .line 139
    iget-object v2, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-virtual {v1, v2}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/4 v3, -0x1

    .line 146
    if-eq v2, v3, :cond_6

    .line 147
    .line 148
    iget-object v3, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 149
    .line 150
    invoke-virtual {v1, v2, v3, v4}, Lv3/r1;->f(ILv3/r1$b;Z)Lv3/r1$b;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget v2, v2, Lv3/r1$b;->c:I

    .line 155
    .line 156
    iget-object v3, v15, Lz4/s;->a:Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v4, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 159
    .line 160
    invoke-virtual {v1, v3, v4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    iget v3, v3, Lv3/r1$b;->c:I

    .line 165
    .line 166
    if-eq v2, v3, :cond_e

    .line 167
    .line 168
    :cond_6
    iget-object v2, v15, Lz4/s;->a:Ljava/lang/Object;

    .line 169
    .line 170
    iget-object v3, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 171
    .line 172
    invoke-virtual {v1, v2, v3}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v15}, Lz4/s;->a()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_7

    .line 180
    .line 181
    iget-object v1, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 182
    .line 183
    iget v2, v15, Lz4/s;->b:I

    .line 184
    .line 185
    iget v3, v15, Lz4/s;->c:I

    .line 186
    .line 187
    invoke-virtual {v1, v2, v3}, Lv3/r1$b;->a(II)J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    goto :goto_3

    .line 192
    :cond_7
    iget-object v1, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 193
    .line 194
    iget-wide v1, v1, Lv3/r1$b;->d:J

    .line 195
    .line 196
    :goto_3
    iget-wide v9, v7, Lv3/d1;->r:J

    .line 197
    .line 198
    iget-wide v11, v7, Lv3/d1;->r:J

    .line 199
    .line 200
    iget-wide v13, v7, Lv3/d1;->d:J

    .line 201
    .line 202
    iget-wide v3, v7, Lv3/d1;->r:J

    .line 203
    .line 204
    sub-long v3, v1, v3

    .line 205
    .line 206
    iget-object v5, v7, Lv3/d1;->h:Lz4/j0;

    .line 207
    .line 208
    iget-object v6, v7, Lv3/d1;->i:Lr5/p;

    .line 209
    .line 210
    iget-object v8, v7, Lv3/d1;->j:Ljava/util/List;

    .line 211
    .line 212
    move-object/from16 v19, v8

    .line 213
    .line 214
    move-object v8, v15

    .line 215
    move-wide/from16 p1, v1

    .line 216
    .line 217
    move-object v1, v15

    .line 218
    move-wide v15, v3

    .line 219
    move-object/from16 v17, v5

    .line 220
    .line 221
    move-object/from16 v18, v6

    .line 222
    .line 223
    invoke-virtual/range {v7 .. v19}, Lv3/d1;->b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v2, v1}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object v7, v1

    .line 232
    move-wide/from16 v1, p1

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_8
    move-object v1, v15

    .line 236
    invoke-virtual {v1}, Lz4/s;->a()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    xor-int/2addr v2, v5

    .line 241
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 242
    .line 243
    .line 244
    const-wide/16 v2, 0x0

    .line 245
    .line 246
    iget-wide v4, v7, Lv3/d1;->q:J

    .line 247
    .line 248
    sub-long v8, v13, v9

    .line 249
    .line 250
    sub-long/2addr v4, v8

    .line 251
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v15

    .line 255
    iget-wide v2, v7, Lv3/d1;->p:J

    .line 256
    .line 257
    iget-object v4, v7, Lv3/d1;->k:Lz4/t$b;

    .line 258
    .line 259
    iget-object v5, v7, Lv3/d1;->b:Lz4/t$b;

    .line 260
    .line 261
    invoke-virtual {v4, v5}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_9

    .line 266
    .line 267
    add-long v2, v13, v15

    .line 268
    .line 269
    :cond_9
    iget-object v4, v7, Lv3/d1;->h:Lz4/j0;

    .line 270
    .line 271
    iget-object v5, v7, Lv3/d1;->i:Lr5/p;

    .line 272
    .line 273
    iget-object v6, v7, Lv3/d1;->j:Ljava/util/List;

    .line 274
    .line 275
    move-object v8, v1

    .line 276
    move-wide v9, v13

    .line 277
    move-wide v11, v13

    .line 278
    move-object/from16 v17, v4

    .line 279
    .line 280
    move-object/from16 v18, v5

    .line 281
    .line 282
    move-object/from16 v19, v6

    .line 283
    .line 284
    invoke-virtual/range {v7 .. v19}, Lv3/d1;->b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    move-object v7, v1

    .line 289
    move-wide v1, v2

    .line 290
    :goto_4
    iput-wide v1, v7, Lv3/d1;->p:J

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_a
    :goto_5
    move-object v1, v15

    .line 294
    invoke-virtual {v1}, Lz4/s;->a()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    xor-int/2addr v2, v5

    .line 299
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 300
    .line 301
    .line 302
    const-wide/16 v15, 0x0

    .line 303
    .line 304
    if-eqz v8, :cond_b

    .line 305
    .line 306
    sget-object v2, Lz4/j0;->d:Lz4/j0;

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_b
    iget-object v2, v7, Lv3/d1;->h:Lz4/j0;

    .line 310
    .line 311
    :goto_6
    move-object/from16 v17, v2

    .line 312
    .line 313
    if-eqz v8, :cond_c

    .line 314
    .line 315
    iget-object v2, v0, Lv3/d0;->b:Lr5/p;

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_c
    iget-object v2, v7, Lv3/d1;->i:Lr5/p;

    .line 319
    .line 320
    :goto_7
    move-object/from16 v18, v2

    .line 321
    .line 322
    if-eqz v8, :cond_d

    .line 323
    .line 324
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 325
    .line 326
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_d
    iget-object v2, v7, Lv3/d1;->j:Ljava/util/List;

    .line 330
    .line 331
    :goto_8
    move-object/from16 v19, v2

    .line 332
    .line 333
    move-object v8, v1

    .line 334
    move-wide v9, v13

    .line 335
    move-wide v11, v13

    .line 336
    move-wide v2, v13

    .line 337
    invoke-virtual/range {v7 .. v19}, Lv3/d1;->b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-virtual {v4, v1}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    iput-wide v2, v7, Lv3/d1;->p:J

    .line 346
    .line 347
    :cond_e
    :goto_9
    return-object v7
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public final f()Lv3/e1;
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->n:Lv3/e1;

    return-object v0
.end method

.method public final f0(Lv3/r1;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/r1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lv3/r1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p2, p0, Lv3/d0;->f0:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p3, p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_0
    iput-wide p3, p0, Lv3/d0;->g0:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :cond_1
    const/4 v0, -0x1

    .line 25
    if-eq p2, v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lv3/r1;->o()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-lt p2, v0, :cond_3

    .line 32
    .line 33
    :cond_2
    iget-boolean p2, p0, Lv3/d0;->G:Z

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lv3/r1;->a(Z)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object p3, p0, Lv3/e;->a:Lv3/r1$c;

    .line 40
    .line 41
    invoke-virtual {p1, p2, p3}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    iget-wide p3, p3, Lv3/r1$c;->u:J

    .line 46
    .line 47
    invoke-static {p3, p4}, Lv5/e0;->R(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p3

    .line 51
    :cond_3
    move v3, p2

    .line 52
    iget-object v1, p0, Lv3/e;->a:Lv3/r1$c;

    .line 53
    .line 54
    iget-object v2, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 55
    .line 56
    invoke-static {p3, p4}, Lv5/e0;->I(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    move-object v0, p1

    .line 61
    invoke-virtual/range {v0 .. v5}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
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

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    invoke-virtual {v0}, Lz4/s;->a()Z

    move-result v0

    return v0
.end method

.method public final g0(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/d0;->U:Lv5/w;

    .line 2
    .line 3
    iget v1, v0, Lv5/w;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lv5/w;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lv5/w;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lv5/w;-><init>(II)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv3/d0;->U:Lv5/w;

    .line 17
    .line 18
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 19
    .line 20
    const/16 v1, 0x18

    .line 21
    .line 22
    new-instance v2, Lv3/s;

    .line 23
    .line 24
    invoke-direct {v2, p1, p2}, Lv3/s;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lv5/l;->e(ILv5/l$a;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
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
.end method

.method public final getDuration()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv3/d0;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 11
    .line 12
    iget-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    .line 13
    .line 14
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 15
    .line 16
    iget-object v2, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 24
    .line 25
    iget v2, v1, Lz4/s;->b:I

    .line 26
    .line 27
    iget v1, v1, Lz4/s;->c:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lv3/r1$b;->a(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lv3/d0;->J()Lv3/r1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Lv3/d0;->F()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-wide v0, v0, Lv3/r1$c;->v:J

    .line 65
    .line 66
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    :goto_0
    return-wide v0
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

.method public final h(Lv3/f1$c;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lv5/l;->f()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lv5/l;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lv5/l$c;

    .line 29
    .line 30
    iget-object v3, v2, Lv5/l$c;->a:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    iget-object v3, v0, Lv5/l;->c:Lv5/l$b;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    iput-boolean v4, v2, Lv5/l$c;->d:Z

    .line 42
    .line 43
    iget-boolean v4, v2, Lv5/l$c;->c:Z

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    iput-boolean v4, v2, Lv5/l$c;->c:Z

    .line 49
    .line 50
    iget-object v4, v2, Lv5/l$c;->a:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v5, v2, Lv5/l$c;->b:Lv5/h$a;

    .line 53
    .line 54
    invoke-virtual {v5}, Lv5/h$a;->b()Lv5/h;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v3, v4, v5}, Lv5/l$b;->d(Ljava/lang/Object;Lv5/h;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v3, v0, Lv5/l;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
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

.method public final h0()V
    .locals 6

    .line 1
    const-string v0, "ExoPlayerImpl"

    .line 2
    .line 3
    const-string v1, "Release "

    .line 4
    .line 5
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " ["

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, "ExoPlayerLib/2.18.7"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, "] ["

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    sget-object v2, Lv5/e0;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "] ["

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    sget-object v2, Lv3/h0;->a:Ljava/util/HashSet;

    .line 46
    .line 47
    const-class v2, Lv3/h0;

    .line 48
    .line 49
    monitor-enter v2

    .line 50
    :try_start_0
    sget-object v3, Lv3/h0;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "]"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0, v1}, Lv5/m;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 69
    .line 70
    .line 71
    sget v0, Lv5/e0;->a:I

    .line 72
    .line 73
    const/16 v1, 0x15

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    if-ge v0, v1, :cond_0

    .line 77
    .line 78
    iget-object v0, p0, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 79
    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 83
    .line 84
    .line 85
    iput-object v2, p0, Lv3/d0;->Q:Landroid/media/AudioTrack;

    .line 86
    .line 87
    :cond_0
    iget-object v0, p0, Lv3/d0;->z:Lv3/b;

    .line 88
    .line 89
    invoke-virtual {v0}, Lv3/b;->a()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lv3/d0;->B:Lv3/p1;

    .line 93
    .line 94
    iget-object v1, v0, Lv3/p1;->e:Lv3/p1$b;

    .line 95
    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    :try_start_1
    iget-object v3, v0, Lv3/p1;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catch_0
    move-exception v1

    .line 105
    const-string v3, "StreamVolumeManager"

    .line 106
    .line 107
    const-string v4, "Error unregistering stream volume receiver"

    .line 108
    .line 109
    invoke-static {v3, v4, v1}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    iput-object v2, v0, Lv3/p1;->e:Lv3/p1$b;

    .line 113
    .line 114
    :cond_1
    iget-object v0, p0, Lv3/d0;->C:Lv3/t1;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lv3/d0;->D:Lv3/u1;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lv3/d0;->A:Lv3/d;

    .line 125
    .line 126
    iput-object v2, v0, Lv3/d;->c:Lv3/d$b;

    .line 127
    .line 128
    invoke-virtual {v0}, Lv3/d;->a()V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 132
    .line 133
    monitor-enter v0

    .line 134
    :try_start_2
    iget-boolean v1, v0, Lv3/g0;->H:Z

    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    if-nez v1, :cond_3

    .line 138
    .line 139
    iget-object v1, v0, Lv3/g0;->r:Landroid/os/Looper;

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    iget-object v1, v0, Lv3/g0;->p:Lv5/k;

    .line 153
    .line 154
    const/4 v4, 0x7

    .line 155
    invoke-interface {v1, v4}, Lv5/k;->i(I)Z

    .line 156
    .line 157
    .line 158
    new-instance v1, Le;

    .line 159
    .line 160
    const/4 v4, 0x3

    .line 161
    invoke-direct {v1, v0, v4}, Le;-><init>(Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    iget-wide v4, v0, Lv3/g0;->D:J

    .line 165
    .line 166
    invoke-virtual {v0, v1, v4, v5}, Lv3/g0;->g0(Le;J)V

    .line 167
    .line 168
    .line 169
    iget-boolean v1, v0, Lv3/g0;->H:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    monitor-exit v0

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    :goto_1
    monitor-exit v0

    .line 174
    move v1, v3

    .line 175
    :goto_2
    if-nez v1, :cond_4

    .line 176
    .line 177
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 178
    .line 179
    const/16 v1, 0xa

    .line 180
    .line 181
    new-instance v4, Lr3/j;

    .line 182
    .line 183
    const/4 v5, 0x4

    .line 184
    invoke-direct {v4, v5}, Lr3/j;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1, v4}, Lv5/l;->e(ILv5/l$a;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 191
    .line 192
    invoke-virtual {v0}, Lv5/l;->d()V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lv3/d0;->i:Lv5/k;

    .line 196
    .line 197
    invoke-interface {v0}, Lv5/k;->g()V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lv3/d0;->t:Lt5/e;

    .line 201
    .line 202
    iget-object v1, p0, Lv3/d0;->r:Lw3/a;

    .line 203
    .line 204
    invoke-interface {v0, v1}, Lt5/e;->b(Lw3/a;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 208
    .line 209
    invoke-virtual {v0, v3}, Lv3/d1;->f(I)Lv3/d1;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 214
    .line 215
    iget-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iput-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 222
    .line 223
    iget-wide v4, v0, Lv3/d1;->r:J

    .line 224
    .line 225
    iput-wide v4, v0, Lv3/d1;->p:J

    .line 226
    .line 227
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 228
    .line 229
    const-wide/16 v4, 0x0

    .line 230
    .line 231
    iput-wide v4, v0, Lv3/d1;->q:J

    .line 232
    .line 233
    iget-object v0, p0, Lv3/d0;->r:Lw3/a;

    .line 234
    .line 235
    invoke-interface {v0}, Lw3/a;->release()V

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lv3/d0;->h:Lr5/o;

    .line 239
    .line 240
    invoke-virtual {v0}, Lr5/o;->b()V

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Lv3/d0;->S:Landroid/view/Surface;

    .line 244
    .line 245
    if-eqz v0, :cond_5

    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 248
    .line 249
    .line 250
    iput-object v2, p0, Lv3/d0;->S:Landroid/view/Surface;

    .line 251
    .line 252
    :cond_5
    sget v0, Lh5/c;->b:I

    .line 253
    .line 254
    iput-boolean v3, p0, Lv3/d0;->b0:Z

    .line 255
    .line 256
    return-void

    .line 257
    :catchall_0
    move-exception v1

    .line 258
    monitor-exit v0

    .line 259
    throw v1

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    monitor-exit v2

    .line 262
    throw v0
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

.method public final i()J
    .locals 2

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-wide v0, v0, Lv3/d1;->q:J

    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i0(I)Lv3/d1;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->F()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->J()Lv3/r1;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    iget-object v3, v0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    iget v3, v0, Lv3/d0;->H:I

    .line 20
    .line 21
    const/4 v11, 0x1

    .line 22
    add-int/2addr v3, v11

    .line 23
    iput v3, v0, Lv3/d0;->H:I

    .line 24
    .line 25
    add-int/lit8 v3, v1, -0x1

    .line 26
    .line 27
    :goto_0
    if-ltz v3, :cond_0

    .line 28
    .line 29
    iget-object v4, v0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    add-int/lit8 v3, v3, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v3, v0, Lv3/d0;->M:Lz4/e0;

    .line 38
    .line 39
    const/4 v12, 0x0

    .line 40
    invoke-interface {v3, v12, v1}, Lz4/e0;->a(II)Lz4/e0$a;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iput-object v3, v0, Lv3/d0;->M:Lz4/e0;

    .line 45
    .line 46
    new-instance v13, Lv3/h1;

    .line 47
    .line 48
    iget-object v3, v0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object v4, v0, Lv3/d0;->M:Lz4/e0;

    .line 51
    .line 52
    invoke-direct {v13, v3, v4}, Lv3/h1;-><init>(Ljava/util/List;Lz4/e0;)V

    .line 53
    .line 54
    .line 55
    iget-object v14, v0, Lv3/d0;->e0:Lv3/d1;

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->y()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    invoke-virtual {v9}, Lv3/r1;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    const/4 v15, -0x1

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    invoke-virtual {v13}, Lv3/r1;->p()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->F()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iget-object v5, v0, Lv3/e;->a:Lv3/r1$c;

    .line 80
    .line 81
    iget-object v7, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 82
    .line 83
    invoke-static {v3, v4}, Lv5/e0;->I(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v16

    .line 87
    move-object v3, v9

    .line 88
    move-object v4, v5

    .line 89
    move-object v5, v7

    .line 90
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    move-wide/from16 v7, v16

    .line 96
    .line 97
    invoke-virtual/range {v3 .. v8}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v7, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {v13, v7}, Lv3/a;->b(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eq v4, v15, :cond_2

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_2
    iget-object v3, v0, Lv3/e;->a:Lv3/r1$c;

    .line 111
    .line 112
    iget-object v4, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 113
    .line 114
    iget v5, v0, Lv3/d0;->F:I

    .line 115
    .line 116
    iget-boolean v6, v0, Lv3/d0;->G:Z

    .line 117
    .line 118
    move-object v8, v9

    .line 119
    move-object v9, v13

    .line 120
    invoke-static/range {v3 .. v9}, Lv3/g0;->G(Lv3/r1$c;Lv3/r1$b;IZLjava/lang/Object;Lv3/r1;Lv3/r1;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    iget-object v4, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 127
    .line 128
    invoke-virtual {v13, v3, v4}, Lv3/a;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 129
    .line 130
    .line 131
    iget-object v3, v0, Lv3/d0;->n:Lv3/r1$b;

    .line 132
    .line 133
    iget v3, v3, Lv3/r1$b;->c:I

    .line 134
    .line 135
    iget-object v4, v0, Lv3/e;->a:Lv3/r1$c;

    .line 136
    .line 137
    invoke-virtual {v13, v3, v4}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iget-wide v4, v4, Lv3/r1$c;->u:J

    .line 142
    .line 143
    invoke-static {v4, v5}, Lv5/e0;->R(J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    invoke-virtual {v0, v13, v3, v4, v5}, Lv3/d0;->f0(Lv3/r1;IJ)Landroid/util/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    invoke-virtual {v0, v13, v15, v11, v12}, Lv3/d0;->f0(Lv3/r1;IJ)Landroid/util/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    goto :goto_4

    .line 157
    :cond_4
    :goto_1
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Lv3/r1;->p()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_5

    .line 167
    .line 168
    invoke-virtual {v13}, Lv3/r1;->p()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_5

    .line 173
    .line 174
    const/4 v5, 0x1

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    const/4 v5, 0x0

    .line 177
    :goto_2
    if-eqz v5, :cond_6

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->b0()I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    :goto_3
    if-eqz v5, :cond_7

    .line 185
    .line 186
    move-wide v3, v11

    .line 187
    :cond_7
    invoke-virtual {v0, v13, v15, v3, v4}, Lv3/d0;->f0(Lv3/r1;IJ)Landroid/util/Pair;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    :goto_4
    invoke-virtual {v0, v14, v13, v3}, Lv3/d0;->e0(Lv3/d1;Lv3/r1;Landroid/util/Pair;)Lv3/d1;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    iget v4, v3, Lv3/d1;->e:I

    .line 196
    .line 197
    const/4 v5, 0x4

    .line 198
    const/4 v6, 0x1

    .line 199
    if-eq v4, v6, :cond_8

    .line 200
    .line 201
    if-eq v4, v5, :cond_8

    .line 202
    .line 203
    if-lez v1, :cond_8

    .line 204
    .line 205
    if-ne v1, v10, :cond_8

    .line 206
    .line 207
    iget-object v4, v3, Lv3/d1;->a:Lv3/r1;

    .line 208
    .line 209
    invoke-virtual {v4}, Lv3/r1;->o()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-lt v2, v4, :cond_8

    .line 214
    .line 215
    move v11, v6

    .line 216
    goto :goto_5

    .line 217
    :cond_8
    const/4 v11, 0x0

    .line 218
    :goto_5
    if-eqz v11, :cond_9

    .line 219
    .line 220
    invoke-virtual {v3, v5}, Lv3/d1;->f(I)Lv3/d1;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    :cond_9
    iget-object v2, v0, Lv3/d0;->k:Lv3/g0;

    .line 225
    .line 226
    iget-object v4, v0, Lv3/d0;->M:Lz4/e0;

    .line 227
    .line 228
    iget-object v2, v2, Lv3/g0;->p:Lv5/k;

    .line 229
    .line 230
    invoke-interface {v2, v4, v1}, Lv5/k;->d(Lz4/e0;I)Lv5/a0$a;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Lv5/a0$a;->a()V

    .line 235
    .line 236
    .line 237
    return-object v3
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

.method public final j0(Ljava/lang/Object;II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/d0;->g:[Lv3/j1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Lv3/j1;->x()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-ne v4, p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Lv3/d0;->Z(Lv3/g1$b;)Lv3/g1;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-boolean v4, v3, Lv3/g1;->g:Z

    .line 20
    .line 21
    xor-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 24
    .line 25
    .line 26
    iput p3, v3, Lv3/g1;->d:I

    .line 27
    .line 28
    iget-boolean v4, v3, Lv3/g1;->g:Z

    .line 29
    .line 30
    xor-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v3, Lv3/g1;->e:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v3}, Lv3/g1;->c()V

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void
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

.method public final k()Z
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-boolean v0, v0, Lv3/d1;->l:Z

    return v0
.end method

.method public final k0(Lx3/d;Z)V
    .locals 5

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-boolean v0, p0, Lv3/d0;->b0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv3/d0;->W:Lx3/d;

    invoke-static {v0, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iput-object p1, p0, Lv3/d0;->W:Lx3/d;

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v1, v0}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    iget-object v0, p0, Lv3/d0;->B:Lv3/p1;

    iget v2, p1, Lx3/d;->c:I

    invoke-static {v2}, Lv5/e0;->y(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lv3/p1;->b(I)V

    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    const/16 v2, 0x14

    new-instance v3, Ld;

    const/4 v4, 0x4

    invoke-direct {v3, p1, v4}, Ld;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2, v3}, Lv5/l;->c(ILv5/l$a;)V

    :cond_1
    iget-object v0, p0, Lv3/d0;->A:Lv3/d;

    if-eqz p2, :cond_2

    move-object p2, p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Lv3/d;->c(Lx3/d;)V

    iget-object p2, p0, Lv3/d0;->h:Lr5/o;

    invoke-virtual {p2, p1}, Lr5/o;->d(Lx3/d;)V

    invoke-virtual {p0}, Lv3/d0;->k()Z

    move-result p1

    iget-object p2, p0, Lv3/d0;->A:Lv3/d;

    invoke-virtual {p0}, Lv3/d0;->d()I

    move-result v0

    invoke-virtual {p2, v0, p1}, Lv3/d;->e(IZ)I

    move-result p2

    if-eqz p1, :cond_3

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    :cond_3
    invoke-virtual {p0, p2, v1, p1}, Lv3/d0;->r0(IIZ)V

    iget-object p1, p0, Lv3/d0;->l:Lv5/l;

    invoke-virtual {p1}, Lv5/l;->b()V

    return-void
.end method

.method public final l0(Lz4/t;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lv3/d0;->b0()I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lv3/d0;->P()J

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lv3/d0;->H:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    add-int/2addr v1, v2

    .line 24
    iput v1, p0, Lv3/d0;->H:I

    .line 25
    .line 26
    iget-object v1, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/lit8 v4, v1, -0x1

    .line 42
    .line 43
    :goto_0
    if-ltz v4, :cond_0

    .line 44
    .line 45
    iget-object v5, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v4, v4, -0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v4, p0, Lv3/d0;->M:Lz4/e0;

    .line 54
    .line 55
    invoke-interface {v4, v3, v1}, Lz4/e0;->a(II)Lz4/e0$a;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Lv3/d0;->M:Lz4/e0;

    .line 60
    .line 61
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    move v1, v3

    .line 67
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ge v1, v4, :cond_2

    .line 72
    .line 73
    new-instance v4, Lv3/z0$c;

    .line 74
    .line 75
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Lz4/t;

    .line 80
    .line 81
    iget-boolean v7, p0, Lv3/d0;->p:Z

    .line 82
    .line 83
    invoke-direct {v4, v6, v7}, Lv3/z0$c;-><init>(Lz4/t;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object v6, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 90
    .line 91
    add-int/lit8 v7, v1, 0x0

    .line 92
    .line 93
    new-instance v8, Lv3/d0$d;

    .line 94
    .line 95
    iget-object v9, v4, Lv3/z0$c;->b:Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v4, v4, Lv3/z0$c;->a:Lz4/p;

    .line 98
    .line 99
    iget-object v4, v4, Lz4/p;->w:Lz4/p$a;

    .line 100
    .line 101
    invoke-direct {v8, v4, v9}, Lv3/d0$d;-><init>(Lz4/p$a;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v7, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    iget-object v0, p0, Lv3/d0;->M:Lz4/e0;

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-interface {v0, v3, v1}, Lz4/e0;->e(II)Lz4/e0$a;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Lv3/d0;->M:Lz4/e0;

    .line 121
    .line 122
    new-instance v0, Lv3/h1;

    .line 123
    .line 124
    iget-object v1, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 125
    .line 126
    iget-object v4, p0, Lv3/d0;->M:Lz4/e0;

    .line 127
    .line 128
    invoke-direct {v0, v1, v4}, Lv3/h1;-><init>(Ljava/util/List;Lz4/e0;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    const/4 v4, -0x1

    .line 141
    if-nez v1, :cond_4

    .line 142
    .line 143
    iget v1, v0, Lv3/h1;->f:I

    .line 144
    .line 145
    if-ge v4, v1, :cond_3

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    new-instance v0, Lv3/l0;

    .line 149
    .line 150
    invoke-direct {v0}, Lv3/l0;-><init>()V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_4
    :goto_2
    iget-boolean v1, p0, Lv3/d0;->G:Z

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lv3/a;->a(Z)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    iget-object v8, p0, Lv3/d0;->e0:Lv3/d1;

    .line 161
    .line 162
    invoke-virtual {p0, v0, v1, v6, v7}, Lv3/d0;->f0(Lv3/r1;IJ)Landroid/util/Pair;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    invoke-virtual {p0, v8, v0, v9}, Lv3/d0;->e0(Lv3/d1;Lv3/r1;Landroid/util/Pair;)Lv3/d1;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    iget v9, v8, Lv3/d1;->e:I

    .line 171
    .line 172
    if-eq v1, v4, :cond_7

    .line 173
    .line 174
    if-eq v9, v2, :cond_7

    .line 175
    .line 176
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_6

    .line 181
    .line 182
    iget v0, v0, Lv3/h1;->f:I

    .line 183
    .line 184
    if-lt v1, v0, :cond_5

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    const/4 v9, 0x2

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    :goto_3
    const/4 v9, 0x4

    .line 190
    :cond_7
    :goto_4
    invoke-virtual {v8, v9}, Lv3/d1;->f(I)Lv3/d1;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 195
    .line 196
    invoke-static {v6, v7}, Lv5/e0;->I(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v8

    .line 200
    iget-object v6, p0, Lv3/d0;->M:Lz4/e0;

    .line 201
    .line 202
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 203
    .line 204
    new-instance v11, Lv3/g0$a;

    .line 205
    .line 206
    move-object v4, v11

    .line 207
    move v7, v1

    .line 208
    invoke-direct/range {v4 .. v9}, Lv3/g0$a;-><init>(Ljava/util/ArrayList;Lz4/e0;IJ)V

    .line 209
    .line 210
    .line 211
    const/16 v1, 0x11

    .line 212
    .line 213
    invoke-interface {v0, v1, v11}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 221
    .line 222
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 223
    .line 224
    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v1, v10, Lv3/d1;->b:Lz4/t$b;

    .line 227
    .line 228
    iget-object v1, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_8

    .line 235
    .line 236
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 237
    .line 238
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 239
    .line 240
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_8

    .line 245
    .line 246
    move v5, v2

    .line 247
    goto :goto_5

    .line 248
    :cond_8
    move v5, v3

    .line 249
    :goto_5
    const/4 v2, 0x0

    .line 250
    const/4 v3, 0x1

    .line 251
    const/4 v4, 0x0

    .line 252
    const/4 v6, 0x4

    .line 253
    invoke-virtual {p0, v10}, Lv3/d0;->a0(Lv3/d1;)J

    .line 254
    .line 255
    .line 256
    move-result-wide v7

    .line 257
    const/4 v9, -0x1

    .line 258
    const/4 v11, 0x0

    .line 259
    move-object v0, p0

    .line 260
    move-object v1, v10

    .line 261
    move v10, v11

    .line 262
    invoke-virtual/range {v0 .. v10}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 263
    .line 264
    .line 265
    return-void
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

.method public final m0(Z)V
    .locals 2

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->A:Lv3/d;

    invoke-virtual {p0}, Lv3/d0;->d()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lv3/d;->e(IZ)I

    move-result v0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    :cond_0
    invoke-virtual {p0, v0, v1, p1}, Lv3/d0;->r0(IIZ)V

    return-void
.end method

.method public final n(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lv3/d0;->G:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Lv3/d0;->G:Z

    .line 9
    .line 10
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 11
    .line 12
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/16 v2, 0xc

    .line 16
    .line 17
    invoke-interface {v0, v2, p1, v1}, Lv5/k;->b(III)Lv5/a0$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 25
    .line 26
    const/16 v1, 0x9

    .line 27
    .line 28
    new-instance v2, Lv3/v;

    .line 29
    .line 30
    invoke-direct {v2, p1}, Lv3/v;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lv5/l;->c(ILv5/l$a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lv3/d0;->q0()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lv3/d0;->l:Lv5/l;

    .line 40
    .line 41
    invoke-virtual {p1}, Lv5/l;->b()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
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

.method public final n0(Landroid/view/Surface;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv3/d0;->g:[Lv3/j1;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    aget-object v7, v1, v4

    .line 16
    .line 17
    invoke-interface {v7}, Lv3/j1;->x()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    if-ne v8, v5, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v7}, Lv3/d0;->Z(Lv3/g1$b;)Lv3/g1;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-boolean v7, v5, Lv3/g1;->g:Z

    .line 28
    .line 29
    xor-int/2addr v7, v6

    .line 30
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 31
    .line 32
    .line 33
    iput v6, v5, Lv3/g1;->d:I

    .line 34
    .line 35
    iget-boolean v7, v5, Lv3/g1;->g:Z

    .line 36
    .line 37
    xor-int/2addr v6, v7

    .line 38
    invoke-static {v6}, Lx6/b;->H(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v5, Lv3/g1;->e:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v5}, Lv3/g1;->c()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v1, p0, Lv3/d0;->R:Ljava/lang/Object;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    if-eq v1, p1, :cond_3

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lv3/g1;

    .line 73
    .line 74
    iget-wide v7, p0, Lv3/d0;->E:J

    .line 75
    .line 76
    invoke-virtual {v1, v7, v8}, Lv3/g1;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 85
    .line 86
    .line 87
    :cond_2
    move v6, v3

    .line 88
    :catch_1
    iget-object v0, p0, Lv3/d0;->R:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v1, p0, Lv3/d0;->S:Landroid/view/Surface;

    .line 91
    .line 92
    if-ne v0, v1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Lv3/d0;->S:Landroid/view/Surface;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v6, v3

    .line 102
    :cond_4
    :goto_2
    iput-object p1, p0, Lv3/d0;->R:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    new-instance p1, Ln7/w;

    .line 107
    .line 108
    const/4 v0, 0x3

    .line 109
    invoke-direct {p1, v0}, Ln7/w;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const/16 v0, 0x3eb

    .line 113
    .line 114
    new-instance v1, Lv3/n;

    .line 115
    .line 116
    invoke-direct {v1, v5, v0, p1}, Lv3/n;-><init>(IILjava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v3, v1}, Lv3/d0;->p0(ZLv3/n;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-void
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

.method public final o(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv3/d0;->A:Lv3/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Lv3/d0;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2, v1}, Lv3/d;->e(IZ)I

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, p1, v0}, Lv3/d0;->p0(ZLv3/n;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lh5/c;

    .line 19
    .line 20
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 21
    .line 22
    iget-object v1, p0, Lv3/d0;->e0:Lv3/d1;

    .line 23
    .line 24
    iget-wide v1, v1, Lv3/d1;->r:J

    .line 25
    .line 26
    invoke-direct {p1, v0}, Lh5/c;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final o0(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lv5/e0;->h(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lv3/d0;->X:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Lv3/d0;->X:F

    .line 19
    .line 20
    iget-object v0, p0, Lv3/d0;->A:Lv3/d;

    .line 21
    .line 22
    iget v0, v0, Lv3/d;->g:F

    .line 23
    .line 24
    mul-float/2addr v0, p1

    .line 25
    const/4 v1, 0x1

    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0, v1, v2}, Lv3/d0;->j0(Ljava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 35
    .line 36
    const/16 v1, 0x16

    .line 37
    .line 38
    new-instance v2, Lv3/x;

    .line 39
    .line 40
    invoke-direct {v2, p1}, Lv3/x;-><init>(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lv5/l;->e(ILv5/l$a;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public final p()I
    .locals 2

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v0}, Lv3/r1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final p0(ZLv3/n;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lv3/d0;->o:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lv3/d0;->i0(I)Lv3/d1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lv3/d1;->d(Lv3/n;)Lv3/d1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lv3/d0;->e0:Lv3/d1;

    .line 20
    .line 21
    iget-object v0, p1, Lv3/d1;->b:Lz4/t$b;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-wide v0, p1, Lv3/d1;->r:J

    .line 28
    .line 29
    iput-wide v0, p1, Lv3/d1;->p:J

    .line 30
    .line 31
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    iput-wide v0, p1, Lv3/d1;->q:J

    .line 34
    .line 35
    :goto_0
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p1, v0}, Lv3/d1;->f(I)Lv3/d1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lv3/d1;->d(Lv3/n;)Lv3/d1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_1
    move-object v2, p1

    .line 47
    iget p1, p0, Lv3/d0;->H:I

    .line 48
    .line 49
    add-int/2addr p1, v0

    .line 50
    iput p1, p0, Lv3/d0;->H:I

    .line 51
    .line 52
    iget-object p1, p0, Lv3/d0;->k:Lv3/g0;

    .line 53
    .line 54
    iget-object p1, p1, Lv3/g0;->p:Lv5/k;

    .line 55
    .line 56
    const/4 p2, 0x6

    .line 57
    invoke-interface {p1, p2}, Lv5/k;->f(I)Lv5/a0$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lv5/a0$a;->a()V

    .line 62
    .line 63
    .line 64
    iget-object p1, v2, Lv3/d1;->a:Lv3/r1;

    .line 65
    .line 66
    invoke-virtual {p1}, Lv3/r1;->p()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lv3/d0;->e0:Lv3/d1;

    .line 73
    .line 74
    iget-object p1, p1, Lv3/d1;->a:Lv3/r1;

    .line 75
    .line 76
    invoke-virtual {p1}, Lv3/r1;->p()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v0, 0x0

    .line 84
    :goto_1
    move v6, v0

    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x1

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v7, 0x4

    .line 89
    invoke-virtual {p0, v2}, Lv3/d0;->a0(Lv3/d1;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v8

    .line 93
    const/4 v10, -0x1

    .line 94
    const/4 v11, 0x0

    .line 95
    move-object v1, p0

    .line 96
    invoke-virtual/range {v1 .. v11}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 97
    .line 98
    .line 99
    return-void
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

.method public final q0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lv3/d0;->N:Lv3/f1$a;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/d0;->f:Lv3/f1;

    .line 4
    .line 5
    iget-object v2, p0, Lv3/d0;->c:Lv3/f1$a;

    .line 6
    .line 7
    sget v3, Lv5/e0;->a:I

    .line 8
    .line 9
    invoke-interface {v1}, Lv3/f1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-interface {v1}, Lv3/f1;->A()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-interface {v1}, Lv3/f1;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-interface {v1}, Lv3/f1;->C()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-interface {v1}, Lv3/f1;->Q()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-interface {v1}, Lv3/f1;->H()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-interface {v1}, Lv3/f1;->J()Lv3/r1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    new-instance v9, Lv3/f1$a$a;

    .line 42
    .line 43
    invoke-direct {v9}, Lv3/f1$a$a;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v10, v9, Lv3/f1$a$a;->a:Lv5/h$a;

    .line 47
    .line 48
    iget-object v2, v2, Lv3/f1$a;->a:Lv5/h;

    .line 49
    .line 50
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    move v12, v11

    .line 55
    :goto_0
    invoke-virtual {v2}, Lv5/h;->b()I

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-ge v12, v13, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2, v12}, Lv5/h;->a(I)I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    invoke-virtual {v10, v13}, Lv5/h$a;->a(I)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v12, v12, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    xor-int/lit8 v2, v3, 0x1

    .line 72
    .line 73
    const/4 v10, 0x4

    .line 74
    invoke-virtual {v9, v10, v2}, Lv3/f1$a$a;->a(IZ)V

    .line 75
    .line 76
    .line 77
    const/4 v10, 0x5

    .line 78
    const/4 v12, 0x1

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    move v13, v12

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    move v13, v11

    .line 86
    :goto_1
    invoke-virtual {v9, v10, v13}, Lv3/f1$a$a;->a(IZ)V

    .line 87
    .line 88
    .line 89
    const/4 v10, 0x6

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    move v13, v12

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    move v13, v11

    .line 97
    :goto_2
    invoke-virtual {v9, v10, v13}, Lv3/f1$a$a;->a(IZ)V

    .line 98
    .line 99
    .line 100
    const/4 v10, 0x7

    .line 101
    if-nez v1, :cond_4

    .line 102
    .line 103
    if-nez v5, :cond_3

    .line 104
    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    :cond_3
    if-nez v3, :cond_4

    .line 110
    .line 111
    move v5, v12

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    move v5, v11

    .line 114
    :goto_3
    invoke-virtual {v9, v10, v5}, Lv3/f1$a$a;->a(IZ)V

    .line 115
    .line 116
    .line 117
    const/16 v5, 0x8

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    if-nez v3, :cond_5

    .line 122
    .line 123
    move v10, v12

    .line 124
    goto :goto_4

    .line 125
    :cond_5
    move v10, v11

    .line 126
    :goto_4
    invoke-virtual {v9, v5, v10}, Lv3/f1$a$a;->a(IZ)V

    .line 127
    .line 128
    .line 129
    const/16 v5, 0x9

    .line 130
    .line 131
    if-nez v1, :cond_7

    .line 132
    .line 133
    if-nez v6, :cond_6

    .line 134
    .line 135
    if-eqz v7, :cond_7

    .line 136
    .line 137
    if-eqz v8, :cond_7

    .line 138
    .line 139
    :cond_6
    if-nez v3, :cond_7

    .line 140
    .line 141
    move v1, v12

    .line 142
    goto :goto_5

    .line 143
    :cond_7
    move v1, v11

    .line 144
    :goto_5
    invoke-virtual {v9, v5, v1}, Lv3/f1$a$a;->a(IZ)V

    .line 145
    .line 146
    .line 147
    const/16 v1, 0xa

    .line 148
    .line 149
    invoke-virtual {v9, v1, v2}, Lv3/f1$a$a;->a(IZ)V

    .line 150
    .line 151
    .line 152
    const/16 v1, 0xb

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    if-nez v3, :cond_8

    .line 157
    .line 158
    move v2, v12

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    move v2, v11

    .line 161
    :goto_6
    invoke-virtual {v9, v1, v2}, Lv3/f1$a$a;->a(IZ)V

    .line 162
    .line 163
    .line 164
    const/16 v1, 0xc

    .line 165
    .line 166
    if-eqz v4, :cond_9

    .line 167
    .line 168
    if-nez v3, :cond_9

    .line 169
    .line 170
    move v11, v12

    .line 171
    :cond_9
    invoke-virtual {v9, v1, v11}, Lv3/f1$a$a;->a(IZ)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Lv3/f1$a;

    .line 175
    .line 176
    iget-object v2, v9, Lv3/f1$a$a;->a:Lv5/h$a;

    .line 177
    .line 178
    invoke-virtual {v2}, Lv5/h$a;->b()Lv5/h;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v1, v2}, Lv3/f1$a;-><init>(Lv5/h;)V

    .line 183
    .line 184
    .line 185
    iput-object v1, p0, Lv3/d0;->N:Lv3/f1$a;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Lv3/f1$a;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_a

    .line 192
    .line 193
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 194
    .line 195
    const/16 v1, 0xd

    .line 196
    .line 197
    new-instance v2, Lv3/w;

    .line 198
    .line 199
    invoke-direct {v2, p0}, Lv3/w;-><init>(Lv3/d0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1, v2}, Lv5/l;->c(ILv5/l$a;)V

    .line 203
    .line 204
    .line 205
    :cond_a
    return-void
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

.method public final r()I
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    invoke-virtual {p0}, Lv3/d0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    iget v0, v0, Lz4/s;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public final r0(IIZ)V
    .locals 13

    .line 1
    move-object v11, p0

    .line 2
    move v0, p1

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    if-eq v0, v3, :cond_0

    .line 9
    .line 10
    move v3, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v1

    .line 13
    :goto_0
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    move v1, v2

    .line 18
    :cond_1
    iget-object v0, v11, Lv3/d0;->e0:Lv3/d1;

    .line 19
    .line 20
    iget-boolean v4, v0, Lv3/d1;->l:Z

    .line 21
    .line 22
    if-ne v4, v3, :cond_2

    .line 23
    .line 24
    iget v4, v0, Lv3/d1;->m:I

    .line 25
    .line 26
    if-ne v4, v1, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget v4, v11, Lv3/d0;->H:I

    .line 30
    .line 31
    add-int/2addr v4, v2

    .line 32
    iput v4, v11, Lv3/d0;->H:I

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3}, Lv3/d1;->c(IZ)Lv3/d1;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v0, v11, Lv3/d0;->k:Lv3/g0;

    .line 39
    .line 40
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 41
    .line 42
    invoke-interface {v0, v2, v3, v1}, Lv5/k;->b(III)Lv5/a0$a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x5

    .line 53
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const/4 v10, -0x1

    .line 59
    const/4 v12, 0x0

    .line 60
    move-object v0, p0

    .line 61
    move-object v1, v4

    .line 62
    move v3, p2

    .line 63
    move v4, v5

    .line 64
    move v5, v6

    .line 65
    move v6, v7

    .line 66
    move-wide v7, v8

    .line 67
    move v9, v10

    .line 68
    move v10, v12

    .line 69
    invoke-virtual/range {v0 .. v10}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    .line 70
    .line 71
    .line 72
    return-void
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

.method public final s(Lv3/f1$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lv5/l;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
.end method

.method public final s0(Lv3/d1;IIZZIJIZ)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    iget-object v3, v0, Lv3/d0;->e0:Lv3/d1;

    iput-object v1, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v4, v3, Lv3/d1;->a:Lv3/r1;

    iget-object v5, v1, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v4, v5}, Lv3/r1;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    .line 1
    iget-object v6, v3, Lv3/d1;->a:Lv3/r1;

    iget-object v7, v1, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v7}, Lv3/r1;->p()Z

    move-result v8

    const/4 v9, -0x1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-eqz v8, :cond_0

    invoke-virtual {v6}, Lv3/r1;->p()Z

    move-result v8

    if-eqz v8, :cond_0

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v7}, Lv3/r1;->p()Z

    move-result v8

    invoke-virtual {v6}, Lv3/r1;->p()Z

    move-result v14

    if-eq v8, v14, :cond_1

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    iget-object v8, v3, Lv3/d1;->b:Lz4/t$b;

    iget-object v8, v8, Lz4/s;->a:Ljava/lang/Object;

    iget-object v14, v0, Lv3/d0;->n:Lv3/r1$b;

    invoke-virtual {v6, v8, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v8

    iget v8, v8, Lv3/r1$b;->c:I

    iget-object v14, v0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v6, v8, v14}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v6

    iget-object v6, v6, Lv3/r1$c;->a:Ljava/lang/Object;

    iget-object v8, v1, Lv3/d1;->b:Lz4/t$b;

    iget-object v8, v8, Lz4/s;->a:Ljava/lang/Object;

    iget-object v14, v0, Lv3/d0;->n:Lv3/r1$b;

    invoke-virtual {v7, v8, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v8

    iget v8, v8, Lv3/r1$b;->c:I

    iget-object v14, v0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v7, v8, v14}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v7

    iget-object v7, v7, Lv3/r1$c;->a:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    if-eqz p5, :cond_2

    if-nez v2, :cond_2

    move v6, v5

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_3

    if-ne v2, v5, :cond_3

    move v6, v12

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    move v6, v11

    :goto_0
    new-instance v7, Landroid/util/Pair;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v6, v7

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p5, :cond_6

    if-nez v2, :cond_6

    iget-object v6, v3, Lv3/d1;->b:Lz4/t$b;

    iget-wide v6, v6, Lz4/s;->d:J

    iget-object v8, v1, Lv3/d1;->b:Lz4/t$b;

    iget-wide v14, v8, Lz4/s;->d:J

    cmp-long v6, v6, v14

    if-gez v6, :cond_6

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    if-eqz p5, :cond_7

    if-ne v2, v5, :cond_7

    if-eqz p10, :cond_7

    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    :goto_1
    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v8, v0, Lv3/d0;->O:Lv3/p0;

    if-eqz v7, :cond_9

    iget-object v14, v1, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v14}, Lv3/r1;->p()Z

    move-result v14

    if-nez v14, :cond_8

    iget-object v14, v1, Lv3/d1;->a:Lv3/r1;

    iget-object v15, v1, Lv3/d1;->b:Lz4/t$b;

    iget-object v15, v15, Lz4/s;->a:Ljava/lang/Object;

    iget-object v10, v0, Lv3/d0;->n:Lv3/r1$b;

    invoke-virtual {v14, v15, v10}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v10

    iget v10, v10, Lv3/r1$b;->c:I

    iget-object v14, v1, Lv3/d1;->a:Lv3/r1;

    iget-object v15, v0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v14, v10, v15}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v10

    iget-object v10, v10, Lv3/r1$c;->c:Lv3/o0;

    goto :goto_2

    :cond_8
    const/4 v10, 0x0

    :goto_2
    sget-object v14, Lv3/p0;->Q:Lv3/p0;

    iput-object v14, v0, Lv3/d0;->d0:Lv3/p0;

    goto :goto_3

    :cond_9
    const/4 v10, 0x0

    :goto_3
    if-nez v7, :cond_a

    iget-object v14, v3, Lv3/d1;->j:Ljava/util/List;

    iget-object v15, v1, Lv3/d1;->j:Ljava/util/List;

    invoke-interface {v14, v15}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    :cond_a
    iget-object v8, v0, Lv3/d0;->d0:Lv3/p0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    new-instance v14, Lv3/p0$a;

    invoke-direct {v14, v8}, Lv3/p0$a;-><init>(Lv3/p0;)V

    .line 4
    iget-object v8, v1, Lv3/d1;->j:Ljava/util/List;

    move v15, v13

    .line 5
    :goto_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    if-ge v15, v11, :cond_c

    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp4/a;

    move v12, v13

    .line 6
    :goto_5
    iget-object v9, v11, Lp4/a;->a:[Lp4/a$b;

    .line 7
    array-length v13, v9

    if-ge v12, v13, :cond_b

    .line 8
    aget-object v9, v9, v12

    .line 9
    invoke-interface {v9, v14}, Lp4/a$b;->l(Lv3/p0$a;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v13, 0x0

    goto :goto_5

    :cond_b
    add-int/lit8 v15, v15, 0x1

    const/4 v9, -0x1

    const/4 v12, 0x2

    const/4 v13, 0x0

    goto :goto_4

    .line 10
    :cond_c
    new-instance v8, Lv3/p0;

    invoke-direct {v8, v14}, Lv3/p0;-><init>(Lv3/p0$a;)V

    .line 11
    iput-object v8, v0, Lv3/d0;->d0:Lv3/p0;

    invoke-virtual/range {p0 .. p0}, Lv3/d0;->X()Lv3/p0;

    move-result-object v8

    :cond_d
    iget-object v9, v0, Lv3/d0;->O:Lv3/p0;

    invoke-virtual {v8, v9}, Lv3/p0;->equals(Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, v5

    iput-object v8, v0, Lv3/d0;->O:Lv3/p0;

    iget-boolean v8, v3, Lv3/d1;->l:Z

    iget-boolean v11, v1, Lv3/d1;->l:Z

    if-eq v8, v11, :cond_e

    move v8, v5

    goto :goto_6

    :cond_e
    const/4 v8, 0x0

    :goto_6
    iget v11, v3, Lv3/d1;->e:I

    iget v12, v1, Lv3/d1;->e:I

    if-eq v11, v12, :cond_f

    move v11, v5

    goto :goto_7

    :cond_f
    const/4 v11, 0x0

    :goto_7
    if-nez v11, :cond_10

    if-eqz v8, :cond_11

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->t0()V

    :cond_11
    iget-boolean v12, v3, Lv3/d1;->g:Z

    iget-boolean v13, v1, Lv3/d1;->g:Z

    if-eq v12, v13, :cond_12

    move v12, v5

    goto :goto_8

    :cond_12
    const/4 v12, 0x0

    :goto_8
    if-eqz v4, :cond_13

    iget-object v4, v0, Lv3/d0;->l:Lv5/l;

    new-instance v13, Lv3/y;

    move/from16 v14, p2

    const/4 v15, 0x0

    invoke-direct {v13, v1, v14, v15}, Lv3/y;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v4, v15, v13}, Lv5/l;->c(ILv5/l$a;)V

    :cond_13
    if-eqz p5, :cond_1b

    .line 12
    new-instance v4, Lv3/r1$b;

    invoke-direct {v4}, Lv3/r1$b;-><init>()V

    iget-object v13, v3, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v13}, Lv3/r1;->p()Z

    move-result v13

    if-nez v13, :cond_14

    iget-object v13, v3, Lv3/d1;->b:Lz4/t$b;

    iget-object v13, v13, Lz4/s;->a:Ljava/lang/Object;

    iget-object v14, v3, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v14, v13, v4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    iget v14, v4, Lv3/r1$b;->c:I

    iget-object v15, v3, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v15, v13}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v15

    iget-object v5, v3, Lv3/d1;->a:Lv3/r1;

    move-object/from16 p2, v13

    iget-object v13, v0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v5, v14, v13}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v5

    iget-object v5, v5, Lv3/r1$c;->a:Ljava/lang/Object;

    iget-object v13, v0, Lv3/e;->a:Lv3/r1$c;

    iget-object v13, v13, Lv3/r1$c;->c:Lv3/o0;

    move-object/from16 v20, p2

    move-object/from16 v17, v5

    move-object/from16 v19, v13

    move/from16 v18, v14

    move/from16 v21, v15

    goto :goto_9

    :cond_14
    move/from16 v18, p9

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, -0x1

    :goto_9
    iget-object v5, v3, Lv3/d1;->b:Lz4/t$b;

    invoke-virtual {v5}, Lz4/s;->a()Z

    move-result v5

    if-nez v2, :cond_17

    if-eqz v5, :cond_15

    iget-object v5, v3, Lv3/d1;->b:Lz4/t$b;

    iget v13, v5, Lz4/s;->b:I

    iget v5, v5, Lz4/s;->c:I

    invoke-virtual {v4, v13, v5}, Lv3/r1$b;->a(II)J

    move-result-wide v4

    goto :goto_a

    :cond_15
    iget-object v5, v3, Lv3/d1;->b:Lz4/t$b;

    iget v5, v5, Lz4/s;->e:I

    const/4 v13, -0x1

    if-eq v5, v13, :cond_16

    iget-object v4, v0, Lv3/d0;->e0:Lv3/d1;

    invoke-static {v4}, Lv3/d0;->c0(Lv3/d1;)J

    move-result-wide v4

    goto :goto_c

    :cond_16
    iget-wide v13, v4, Lv3/r1$b;->e:J

    iget-wide v4, v4, Lv3/r1$b;->d:J

    goto :goto_b

    :cond_17
    if-eqz v5, :cond_18

    iget-wide v4, v3, Lv3/d1;->r:J

    :goto_a
    invoke-static {v3}, Lv3/d0;->c0(Lv3/d1;)J

    move-result-wide v13

    goto :goto_d

    :cond_18
    iget-wide v4, v4, Lv3/r1$b;->e:J

    iget-wide v13, v3, Lv3/d1;->r:J

    :goto_b
    add-long/2addr v4, v13

    :goto_c
    move-wide v13, v4

    :goto_d
    new-instance v15, Lv3/f1$d;

    invoke-static {v4, v5}, Lv5/e0;->R(J)J

    move-result-wide v22

    invoke-static {v13, v14}, Lv5/e0;->R(J)J

    move-result-wide v24

    iget-object v4, v3, Lv3/d1;->b:Lz4/t$b;

    iget v5, v4, Lz4/s;->b:I

    iget v4, v4, Lz4/s;->c:I

    move-object/from16 v16, v15

    move/from16 v26, v5

    move/from16 v27, v4

    invoke-direct/range {v16 .. v27}, Lv3/f1$d;-><init>(Ljava/lang/Object;ILv3/o0;Ljava/lang/Object;IJJII)V

    .line 13
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->F()I

    move-result v4

    iget-object v5, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v5, v5, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v5}, Lv3/r1;->p()Z

    move-result v5

    if-nez v5, :cond_19

    iget-object v5, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v13, v5, Lv3/d1;->b:Lz4/t$b;

    iget-object v13, v13, Lz4/s;->a:Ljava/lang/Object;

    iget-object v5, v5, Lv3/d1;->a:Lv3/r1;

    iget-object v14, v0, Lv3/d0;->n:Lv3/r1$b;

    invoke-virtual {v5, v13, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    iget-object v5, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v5, v5, Lv3/d1;->a:Lv3/r1;

    invoke-virtual {v5, v13}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v5

    iget-object v14, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v14, v14, Lv3/d1;->a:Lv3/r1;

    move/from16 p2, v5

    iget-object v5, v0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v14, v4, v5}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v5

    iget-object v5, v5, Lv3/r1$c;->a:Ljava/lang/Object;

    iget-object v14, v0, Lv3/e;->a:Lv3/r1$c;

    iget-object v14, v14, Lv3/r1$c;->c:Lv3/o0;

    move/from16 v31, p2

    move-object/from16 v27, v5

    move-object/from16 v30, v13

    move-object/from16 v29, v14

    goto :goto_e

    :cond_19
    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, -0x1

    :goto_e
    invoke-static/range {p7 .. p8}, Lv5/e0;->R(J)J

    move-result-wide v32

    new-instance v5, Lv3/f1$d;

    iget-object v13, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v13, v13, Lv3/d1;->b:Lz4/t$b;

    invoke-virtual {v13}, Lz4/s;->a()Z

    move-result v13

    if-eqz v13, :cond_1a

    iget-object v13, v0, Lv3/d0;->e0:Lv3/d1;

    invoke-static {v13}, Lv3/d0;->c0(Lv3/d1;)J

    move-result-wide v13

    invoke-static {v13, v14}, Lv5/e0;->R(J)J

    move-result-wide v13

    move-wide/from16 v34, v13

    goto :goto_f

    :cond_1a
    move-wide/from16 v34, v32

    :goto_f
    iget-object v13, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v13, v13, Lv3/d1;->b:Lz4/t$b;

    iget v14, v13, Lz4/s;->b:I

    iget v13, v13, Lz4/s;->c:I

    move-object/from16 v26, v5

    move/from16 v28, v4

    move/from16 v36, v14

    move/from16 v37, v13

    invoke-direct/range {v26 .. v37}, Lv3/f1$d;-><init>(Ljava/lang/Object;ILv3/o0;Ljava/lang/Object;IJJII)V

    .line 14
    iget-object v4, v0, Lv3/d0;->l:Lv5/l;

    const/16 v13, 0xb

    new-instance v14, Lv3/b0;

    invoke-direct {v14, v2, v15, v5}, Lv3/b0;-><init>(ILv3/f1$d;Lv3/f1$d;)V

    invoke-virtual {v4, v13, v14}, Lv5/l;->c(ILv5/l$a;)V

    :cond_1b
    if-eqz v7, :cond_1c

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    new-instance v4, Lv3/c0;

    const/4 v5, 0x0

    invoke-direct {v4, v10, v6, v5}, Lv3/c0;-><init>(Ljava/lang/Object;II)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5, v4}, Lv5/l;->c(ILv5/l$a;)V

    goto :goto_10

    :cond_1c
    const/4 v5, 0x1

    :goto_10
    iget-object v2, v3, Lv3/d1;->f:Lv3/n;

    iget-object v4, v1, Lv3/d1;->f:Lv3/n;

    if-eq v2, v4, :cond_1d

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    new-instance v4, Lv3/a0;

    invoke-direct {v4, v1, v5}, Lv3/a0;-><init>(Lv3/d1;I)V

    const/16 v5, 0xa

    invoke-virtual {v2, v5, v4}, Lv5/l;->c(ILv5/l$a;)V

    iget-object v2, v1, Lv3/d1;->f:Lv3/n;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    new-instance v4, Lv3/t;

    const/4 v6, 0x0

    invoke-direct {v4, v1, v6}, Lv3/t;-><init>(Lv3/d1;I)V

    invoke-virtual {v2, v5, v4}, Lv5/l;->c(ILv5/l$a;)V

    :cond_1d
    iget-object v2, v3, Lv3/d1;->i:Lr5/p;

    iget-object v4, v1, Lv3/d1;->i:Lr5/p;

    if-eq v2, v4, :cond_1e

    iget-object v2, v0, Lv3/d0;->h:Lr5/o;

    iget-object v4, v4, Lr5/p;->e:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lr5/o;->a(Ljava/lang/Object;)V

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    new-instance v4, Lv3/z;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lv3/z;-><init>(Lv3/d1;I)V

    const/4 v5, 0x2

    invoke-virtual {v2, v5, v4}, Lv5/l;->c(ILv5/l$a;)V

    :cond_1e
    const/4 v2, 0x7

    if-eqz v9, :cond_1f

    iget-object v4, v0, Lv3/d0;->O:Lv3/p0;

    iget-object v5, v0, Lv3/d0;->l:Lv5/l;

    const/16 v6, 0xe

    new-instance v7, Lio/flutter/plugins/firebase/auth/g;

    invoke-direct {v7, v4, v2}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v6, v7}, Lv5/l;->c(ILv5/l$a;)V

    :cond_1f
    if-eqz v12, :cond_20

    iget-object v4, v0, Lv3/d0;->l:Lv5/l;

    new-instance v5, Lv3/a0;

    const/4 v6, 0x2

    invoke-direct {v5, v1, v6}, Lv3/a0;-><init>(Lv3/d1;I)V

    const/4 v6, 0x3

    invoke-virtual {v4, v6, v5}, Lv5/l;->c(ILv5/l$a;)V

    :cond_20
    if-nez v11, :cond_21

    if-eqz v8, :cond_22

    :cond_21
    iget-object v4, v0, Lv3/d0;->l:Lv5/l;

    new-instance v5, Lv3/t;

    const/4 v6, 0x1

    invoke-direct {v5, v1, v6}, Lv3/t;-><init>(Lv3/d1;I)V

    const/4 v6, -0x1

    invoke-virtual {v4, v6, v5}, Lv5/l;->c(ILv5/l$a;)V

    :cond_22
    if-eqz v11, :cond_23

    iget-object v4, v0, Lv3/d0;->l:Lv5/l;

    const/4 v5, 0x4

    new-instance v6, Lv3/z;

    const/4 v7, 0x2

    invoke-direct {v6, v1, v7}, Lv3/z;-><init>(Lv3/d1;I)V

    invoke-virtual {v4, v5, v6}, Lv5/l;->c(ILv5/l$a;)V

    :cond_23
    const/4 v4, 0x5

    if-eqz v8, :cond_24

    iget-object v5, v0, Lv3/d0;->l:Lv5/l;

    new-instance v6, Ld9/g;

    move/from16 v7, p3

    invoke-direct {v6, v1, v7}, Ld9/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v4, v6}, Lv5/l;->c(ILv5/l$a;)V

    :cond_24
    iget v5, v3, Lv3/d1;->m:I

    iget v6, v1, Lv3/d1;->m:I

    const/4 v7, 0x6

    if-eq v5, v6, :cond_25

    iget-object v5, v0, Lv3/d0;->l:Lv5/l;

    new-instance v6, Lv3/z;

    const/4 v8, 0x0

    invoke-direct {v6, v1, v8}, Lv3/z;-><init>(Lv3/d1;I)V

    invoke-virtual {v5, v7, v6}, Lv5/l;->c(ILv5/l$a;)V

    :cond_25
    invoke-static {v3}, Lv3/d0;->d0(Lv3/d1;)Z

    move-result v5

    invoke-static/range {p1 .. p1}, Lv3/d0;->d0(Lv3/d1;)Z

    move-result v6

    if-eq v5, v6, :cond_26

    iget-object v5, v0, Lv3/d0;->l:Lv5/l;

    new-instance v6, Lio/flutter/plugins/firebase/auth/g;

    invoke-direct {v6, v1, v7}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v2, v6}, Lv5/l;->c(ILv5/l$a;)V

    :cond_26
    iget-object v2, v3, Lv3/d1;->n:Lv3/e1;

    iget-object v5, v1, Lv3/d1;->n:Lv3/e1;

    invoke-virtual {v2, v5}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    const/16 v5, 0xc

    new-instance v6, Lv3/a0;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, Lv3/a0;-><init>(Lv3/d1;I)V

    invoke-virtual {v2, v5, v6}, Lv5/l;->c(ILv5/l$a;)V

    :cond_27
    if-eqz p4, :cond_28

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    new-instance v5, Lr3/j;

    invoke-direct {v5, v4}, Lr3/j;-><init>(I)V

    const/4 v4, -0x1

    invoke-virtual {v2, v4, v5}, Lv5/l;->c(ILv5/l$a;)V

    :cond_28
    invoke-virtual/range {p0 .. p0}, Lv3/d0;->q0()V

    iget-object v2, v0, Lv3/d0;->l:Lv5/l;

    invoke-virtual {v2}, Lv5/l;->b()V

    iget-boolean v2, v3, Lv3/d1;->o:Z

    iget-boolean v1, v1, Lv3/d1;->o:Z

    if-eq v2, v1, :cond_29

    iget-object v1, v0, Lv3/d0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv3/o;

    invoke-interface {v2}, Lv3/o;->B()V

    goto :goto_11

    :cond_29
    return-void
.end method

.method public final stop()V
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lv3/d0;->o(Z)V

    return-void
.end method

.method public final t0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv3/d0;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 28
    .line 29
    iget-boolean v0, v0, Lv3/d1;->o:Z

    .line 30
    .line 31
    iget-object v1, p0, Lv3/d0;->C:Lv3/t1;

    .line 32
    .line 33
    invoke-virtual {p0}, Lv3/d0;->k()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lv3/d0;->D:Lv3/u1;

    .line 41
    .line 42
    invoke-virtual {p0}, Lv3/d0;->k()Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    iget-object v0, p0, Lv3/d0;->C:Lv3/t1;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lv3/d0;->D:Lv3/u1;

    .line 52
    .line 53
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-void
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

.method public final u(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lv3/d0;->F:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lv3/d0;->F:I

    .line 9
    .line 10
    iget-object v0, p0, Lv3/d0;->k:Lv3/g0;

    .line 11
    .line 12
    iget-object v0, v0, Lv3/g0;->p:Lv5/k;

    .line 13
    .line 14
    const/16 v1, 0xb

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v1, p1, v2}, Lv5/k;->b(III)Lv5/a0$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lv5/a0$a;->a()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lv3/d0;->l:Lv5/l;

    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    new-instance v2, Ld9/r;

    .line 29
    .line 30
    invoke-direct {v2, p1}, Ld9/r;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lv5/l;->c(ILv5/l$a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lv3/d0;->q0()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lv3/d0;->l:Lv5/l;

    .line 40
    .line 41
    invoke-virtual {p1}, Lv5/l;->b()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
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

.method public final u0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/d0;->d:Lb5/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    move v3, v1

    .line 7
    :goto_0
    :try_start_0
    iget-boolean v4, v0, Lb5/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    .line 26
    :cond_1
    monitor-exit v0

    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v3, p0, Lv3/d0;->s:Landroid/os/Looper;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eq v0, v3, :cond_4

    .line 38
    .line 39
    const-string v0, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    new-array v3, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    aput-object v4, v3, v1

    .line 53
    .line 54
    iget-object v1, p0, Lv3/d0;->s:Landroid/os/Looper;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    aput-object v1, v3, v2

    .line 65
    .line 66
    invoke-static {v0, v3}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-boolean v1, p0, Lv3/d0;->Z:Z

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    const-string v1, "ExoPlayerImpl"

    .line 75
    .line 76
    iget-boolean v3, p0, Lv3/d0;->a0:Z

    .line 77
    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-static {v1, v0, v3}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 88
    .line 89
    .line 90
    iput-boolean v2, p0, Lv3/d0;->a0:Z

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_4
    :goto_2
    return-void

    .line 100
    :catchall_0
    move-exception v1

    .line 101
    monitor-exit v0

    .line 102
    throw v1
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
.end method

.method public final v()Lv3/c1;
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    iget-object v0, v0, Lv3/d1;->f:Lv3/n;

    return-object v0
.end method

.method public final x()I
    .locals 1

    invoke-virtual {p0}, Lv3/d0;->u0()V

    iget v0, p0, Lv3/d0;->F:I

    return v0
.end method

.method public final y()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv3/d0;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 11
    .line 12
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 13
    .line 14
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 15
    .line 16
    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 24
    .line 25
    iget-wide v1, v0, Lv3/d1;->c:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v1, v1, v3

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 37
    .line 38
    invoke-virtual {p0}, Lv3/d0;->F()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-wide v0, v0, Lv3/r1$c;->u:J

    .line 49
    .line 50
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 56
    .line 57
    iget-wide v0, v0, Lv3/r1$b;->e:J

    .line 58
    .line 59
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    iget-object v2, p0, Lv3/d0;->e0:Lv3/d1;

    .line 64
    .line 65
    iget-wide v2, v2, Lv3/d1;->c:J

    .line 66
    .line 67
    invoke-static {v2, v3}, Lv5/e0;->R(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    add-long/2addr v0, v2

    .line 72
    :goto_0
    return-wide v0

    .line 73
    :cond_1
    invoke-virtual {p0}, Lv3/d0;->P()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    return-wide v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final z()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv3/d0;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 11
    .line 12
    iget-object v1, v0, Lv3/d1;->k:Lz4/t$b;

    .line 13
    .line 14
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 23
    .line 24
    iget-wide v0, v0, Lv3/d1;->p:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lv3/d0;->getDuration()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lv3/d0;->u0()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 40
    .line 41
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 42
    .line 43
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-wide v0, p0, Lv3/d0;->g0:J

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 53
    .line 54
    iget-object v1, v0, Lv3/d1;->k:Lz4/t$b;

    .line 55
    .line 56
    iget-wide v1, v1, Lz4/s;->d:J

    .line 57
    .line 58
    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    .line 59
    .line 60
    iget-wide v3, v3, Lz4/s;->d:J

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 67
    .line 68
    invoke-virtual {p0}, Lv3/d0;->F()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-wide v0, v0, Lv3/r1$c;->v:J

    .line 79
    .line 80
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    iget-wide v0, v0, Lv3/d1;->p:J

    .line 86
    .line 87
    iget-object v2, p0, Lv3/d0;->e0:Lv3/d1;

    .line 88
    .line 89
    iget-object v2, v2, Lv3/d1;->k:Lz4/t$b;

    .line 90
    .line 91
    invoke-virtual {v2}, Lz4/s;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v0, p0, Lv3/d0;->e0:Lv3/d1;

    .line 98
    .line 99
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 100
    .line 101
    iget-object v0, v0, Lv3/d1;->k:Lz4/t$b;

    .line 102
    .line 103
    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v2, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 106
    .line 107
    invoke-virtual {v1, v0, v2}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lv3/d0;->e0:Lv3/d1;

    .line 112
    .line 113
    iget-object v1, v1, Lv3/d1;->k:Lz4/t$b;

    .line 114
    .line 115
    iget v1, v1, Lz4/s;->b:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lv3/r1$b;->d(I)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    const-wide/high16 v3, -0x8000000000000000L

    .line 122
    .line 123
    cmp-long v3, v1, v3

    .line 124
    .line 125
    if-nez v3, :cond_4

    .line 126
    .line 127
    iget-wide v0, v0, Lv3/r1$b;->d:J

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move-wide v0, v1

    .line 131
    :cond_5
    :goto_1
    iget-object v2, p0, Lv3/d0;->e0:Lv3/d1;

    .line 132
    .line 133
    iget-object v3, v2, Lv3/d1;->a:Lv3/r1;

    .line 134
    .line 135
    iget-object v2, v2, Lv3/d1;->k:Lz4/t$b;

    .line 136
    .line 137
    iget-object v2, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v4, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 140
    .line 141
    invoke-virtual {v3, v2, v4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 142
    .line 143
    .line 144
    iget-object v2, p0, Lv3/d0;->n:Lv3/r1$b;

    .line 145
    .line 146
    iget-wide v2, v2, Lv3/r1$b;->e:J

    .line 147
    .line 148
    add-long/2addr v0, v2

    .line 149
    invoke-static {v0, v1}, Lv5/e0;->R(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v0

    .line 153
    :goto_2
    return-wide v0
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
