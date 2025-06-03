.class public final Lgb/p2;
.super Leb/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/p2$d;,
        Lgb/p2$g;,
        Lgb/p2$c;,
        Lgb/p2$f;,
        Lgb/p2$e;,
        Lgb/p2$b;
    }
.end annotation


# static fields
.field public static final o:Ljava/util/logging/Logger;


# instance fields
.field public final f:Leb/k0$e;

.field public final g:Ljava/util/HashMap;

.field public h:Lgb/p2$c;

.field public i:I

.field public j:Z

.field public k:Leb/h1$c;

.field public l:Leb/n;

.field public m:Leb/n;

.field public final n:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lgb/p2;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lgb/p2;->o:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Leb/k0$e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Leb/k0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lgb/p2;->i:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lgb/p2;->j:Z

    .line 16
    .line 17
    sget-object v2, Leb/n;->d:Leb/n;

    .line 18
    .line 19
    iput-object v2, p0, Lgb/p2;->l:Leb/n;

    .line 20
    .line 21
    iput-object v2, p0, Lgb/p2;->m:Leb/n;

    .line 22
    .line 23
    sget-object v2, Lgb/v0;->a:Ljava/util/logging/Logger;

    .line 24
    .line 25
    const-string v2, "GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS"

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_0
    invoke-static {v3}, Ln7/i;->a(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v0, v1

    .line 50
    :cond_1
    iput-boolean v0, p0, Lgb/p2;->n:Z

    .line 51
    .line 52
    const-string v0, "helper"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lgb/p2;->f:Leb/k0$e;

    .line 58
    .line 59
    return-void
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


# virtual methods
.method public final a(Leb/k0$h;)Leb/e1;
    .locals 6

    .line 1
    sget-object v0, Leb/n;->a:Leb/n;

    .line 2
    .line 3
    sget-object v1, Leb/n;->b:Leb/n;

    .line 4
    .line 5
    iget-object v2, p0, Lgb/p2;->l:Leb/n;

    .line 6
    .line 7
    sget-object v3, Leb/n;->e:Leb/n;

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    sget-object p1, Leb/e1;->l:Leb/e1;

    .line 12
    .line 13
    const-string v0, "Already shut down"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v2, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const-string v4, ", attrs="

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 31
    .line 32
    const-string v1, "NameResolver returned no usable address. addrs="

    .line 33
    .line 34
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, Leb/k0$h;->b:Leb/a;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Lgb/p2;->c(Leb/e1;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Leb/u;

    .line 78
    .line 79
    if-nez v5, :cond_2

    .line 80
    .line 81
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 82
    .line 83
    const-string v1, "NameResolver returned address list with null endpoint. addrs="

    .line 84
    .line 85
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, Leb/k0$h;->b:Leb/a;

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Lgb/p2;->c(Leb/e1;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_3
    const/4 v3, 0x1

    .line 115
    iput-boolean v3, p0, Lgb/p2;->j:Z

    .line 116
    .line 117
    iget-object p1, p1, Leb/k0$h;->c:Ljava/lang/Object;

    .line 118
    .line 119
    instance-of v3, p1, Lgb/p2$d;

    .line 120
    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    check-cast p1, Lgb/p2$d;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    :cond_4
    sget-object p1, Lo7/t;->b:Lo7/t$b;

    .line 129
    .line 130
    new-instance p1, Lo7/t$a;

    .line 131
    .line 132
    invoke-direct {p1}, Lo7/t$a;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v2}, Lo7/t$a;->d(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lo7/t$a;->e()Lo7/l0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v2, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    if-nez v2, :cond_5

    .line 146
    .line 147
    new-instance v2, Lgb/p2$c;

    .line 148
    .line 149
    invoke-direct {v2, p1}, Lgb/p2$c;-><init>(Lo7/l0;)V

    .line 150
    .line 151
    .line 152
    iput-object v2, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    iget-object v4, p0, Lgb/p2;->l:Leb/n;

    .line 156
    .line 157
    if-ne v4, v1, :cond_8

    .line 158
    .line 159
    invoke-virtual {v2}, Lgb/p2$c;->a()Ljava/net/SocketAddress;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iget-object v4, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 164
    .line 165
    if-eqz p1, :cond_6

    .line 166
    .line 167
    move-object v5, p1

    .line 168
    goto :goto_0

    .line 169
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    :goto_0
    iput-object v5, v4, Lgb/p2$c;->a:Ljava/util/List;

    .line 177
    .line 178
    iput v3, v4, Lgb/p2$c;->b:I

    .line 179
    .line 180
    iput v3, v4, Lgb/p2$c;->c:I

    .line 181
    .line 182
    iget-object v4, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 183
    .line 184
    invoke-virtual {v4, v2}, Lgb/p2$c;->d(Ljava/net/SocketAddress;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    sget-object p1, Leb/e1;->e:Leb/e1;

    .line 191
    .line 192
    return-object p1

    .line 193
    :cond_7
    iget-object v2, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 194
    .line 195
    iput v3, v2, Lgb/p2$c;->b:I

    .line 196
    .line 197
    iput v3, v2, Lgb/p2$c;->c:I

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    if-eqz p1, :cond_9

    .line 201
    .line 202
    move-object v4, p1

    .line 203
    goto :goto_1

    .line 204
    :cond_9
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    :goto_1
    iput-object v4, v2, Lgb/p2$c;->a:Ljava/util/List;

    .line 209
    .line 210
    iput v3, v2, Lgb/p2$c;->b:I

    .line 211
    .line 212
    iput v3, v2, Lgb/p2$c;->c:I

    .line 213
    .line 214
    :goto_2
    new-instance v2, Ljava/util/HashSet;

    .line 215
    .line 216
    iget-object v4, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 223
    .line 224
    .line 225
    new-instance v4, Ljava/util/HashSet;

    .line 226
    .line 227
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v3}, Lo7/t;->r(I)Lo7/t$b;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_3
    invoke-virtual {p1}, Lo7/a;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_a

    .line 239
    .line 240
    invoke-virtual {p1}, Lo7/a;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Leb/u;

    .line 245
    .line 246
    iget-object v3, v3, Leb/u;->a:Ljava/util/List;

    .line 247
    .line 248
    invoke-interface {v4, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_a
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    :cond_b
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_c

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Ljava/net/SocketAddress;

    .line 267
    .line 268
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-nez v5, :cond_b

    .line 273
    .line 274
    iget-object v5, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 275
    .line 276
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Lgb/p2$g;

    .line 281
    .line 282
    iget-object v3, v3, Lgb/p2$g;->a:Leb/k0$i;

    .line 283
    .line 284
    invoke-virtual {v3}, Leb/k0$i;->g()V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_c
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_f

    .line 293
    .line 294
    iget-object p1, p0, Lgb/p2;->l:Leb/n;

    .line 295
    .line 296
    if-eq p1, v0, :cond_f

    .line 297
    .line 298
    if-ne p1, v1, :cond_d

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_d
    sget-object v0, Leb/n;->d:Leb/n;

    .line 302
    .line 303
    if-ne p1, v0, :cond_e

    .line 304
    .line 305
    new-instance p1, Lgb/p2$f;

    .line 306
    .line 307
    invoke-direct {p1, p0, p0}, Lgb/p2$f;-><init>(Lgb/p2;Lgb/p2;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v0, p1}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 311
    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_e
    sget-object v0, Leb/n;->c:Leb/n;

    .line 315
    .line 316
    if-ne p1, v0, :cond_10

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_f
    :goto_5
    iput-object v0, p0, Lgb/p2;->l:Leb/n;

    .line 320
    .line 321
    new-instance p1, Lgb/p2$e;

    .line 322
    .line 323
    sget-object v1, Leb/k0$f;->e:Leb/k0$f;

    .line 324
    .line 325
    invoke-direct {p1, v1}, Lgb/p2$e;-><init>(Leb/k0$f;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v0, p1}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 329
    .line 330
    .line 331
    :goto_6
    invoke-virtual {p0}, Lgb/p2;->g()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0}, Lgb/p2;->e()V

    .line 335
    .line 336
    .line 337
    :cond_10
    :goto_7
    sget-object p1, Leb/e1;->e:Leb/e1;

    .line 338
    .line 339
    return-object p1
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

.method public final c(Leb/e1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lgb/p2$g;

    .line 22
    .line 23
    iget-object v1, v1, Lgb/p2$g;->a:Leb/k0$i;

    .line 24
    .line 25
    invoke-virtual {v1}, Leb/k0$i;->g()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 32
    .line 33
    .line 34
    sget-object v0, Leb/n;->c:Leb/n;

    .line 35
    .line 36
    new-instance v1, Lgb/p2$e;

    .line 37
    .line 38
    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v1, p1}, Lgb/p2$e;-><init>(Leb/k0$f;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public final e()V
    .locals 8

    .line 1
    iget-object v0, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lgb/p2$c;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    iget-object v0, p0, Lgb/p2;->l:Leb/n;

    .line 12
    .line 13
    sget-object v1, Leb/n;->e:Leb/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgb/p2$c;->a()Ljava/net/SocketAddress;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lgb/p2$g;

    .line 41
    .line 42
    iget-object v1, v1, Lgb/p2$g;->a:Leb/k0$i;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v1, Lgb/p2$b;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lgb/p2$b;-><init>(Lgb/p2;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lgb/p2;->f:Leb/k0$e;

    .line 51
    .line 52
    new-instance v4, Leb/k0$b$a;

    .line 53
    .line 54
    invoke-direct {v4}, Leb/k0$b$a;-><init>()V

    .line 55
    .line 56
    .line 57
    new-array v5, v2, [Leb/u;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    new-instance v7, Leb/u;

    .line 61
    .line 62
    invoke-direct {v7, v0}, Leb/u;-><init>(Ljava/net/SocketAddress;)V

    .line 63
    .line 64
    .line 65
    aput-object v7, v5, v6

    .line 66
    .line 67
    invoke-static {v5}, Lo7/c0;->c([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v5}, Leb/k0$b$a;->b(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v1}, Leb/k0$b$a;->a(Leb/k0$k;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Leb/k0$b;

    .line 78
    .line 79
    iget-object v6, v4, Leb/k0$b$a;->a:Ljava/util/List;

    .line 80
    .line 81
    iget-object v7, v4, Leb/k0$b$a;->b:Leb/a;

    .line 82
    .line 83
    iget-object v4, v4, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    .line 84
    .line 85
    invoke-direct {v5, v6, v7, v4}, Leb/k0$b;-><init>(Ljava/util/List;Leb/a;[[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v5}, Leb/k0$e;->a(Leb/k0$b;)Leb/k0$i;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_8

    .line 93
    .line 94
    new-instance v4, Lgb/p2$g;

    .line 95
    .line 96
    invoke-direct {v4, v3, v1}, Lgb/p2$g;-><init>(Leb/k0$i;Lgb/p2$b;)V

    .line 97
    .line 98
    .line 99
    iput-object v4, v1, Lgb/p2$b;->b:Lgb/p2$g;

    .line 100
    .line 101
    iget-object v5, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Leb/k0$i;->c()Leb/a;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    sget-object v5, Leb/k0;->d:Leb/a$b;

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Leb/a;->a(Leb/a$b;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-nez v4, :cond_2

    .line 117
    .line 118
    sget-object v4, Leb/n;->b:Leb/n;

    .line 119
    .line 120
    invoke-static {v4}, Leb/o;->a(Leb/n;)Leb/o;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object v4, v1, Lgb/p2$b;->a:Leb/o;

    .line 125
    .line 126
    :cond_2
    new-instance v1, Lgb/o2;

    .line 127
    .line 128
    invoke-direct {v1, p0, v3}, Lgb/o2;-><init>(Lgb/p2;Leb/k0$i;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v1}, Leb/k0$i;->h(Leb/k0$k;)V

    .line 132
    .line 133
    .line 134
    move-object v1, v3

    .line 135
    :goto_0
    iget-object v3, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lgb/p2$g;

    .line 142
    .line 143
    iget-object v3, v3, Lgb/p2$g;->b:Leb/n;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    if-eq v3, v2, :cond_5

    .line 152
    .line 153
    const/4 v2, 0x2

    .line 154
    if-eq v3, v2, :cond_4

    .line 155
    .line 156
    const/4 v2, 0x3

    .line 157
    if-eq v3, v2, :cond_3

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    invoke-virtual {v1}, Leb/k0$i;->f()V

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lgb/p2$g;

    .line 170
    .line 171
    sget-object v1, Leb/n;->a:Leb/n;

    .line 172
    .line 173
    invoke-static {v0, v1}, Lgb/p2$g;->a(Lgb/p2$g;Leb/n;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    iget-object v0, p0, Lgb/p2;->h:Lgb/p2$c;

    .line 178
    .line 179
    invoke-virtual {v0}, Lgb/p2$c;->b()Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lgb/p2;->e()V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    sget-object v0, Lgb/p2;->o:Ljava/util/logging/Logger;

    .line 187
    .line 188
    const-string v1, "Requesting a connection even though we have a READY subchannel"

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_6
    iget-boolean v0, p0, Lgb/p2;->n:Z

    .line 195
    .line 196
    if-eqz v0, :cond_7

    .line 197
    .line 198
    :goto_1
    invoke-virtual {p0}, Lgb/p2;->h()V

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_7
    invoke-virtual {v1}, Leb/k0$i;->f()V

    .line 203
    .line 204
    .line 205
    :goto_2
    return-void

    .line 206
    :cond_8
    sget-object v1, Lgb/p2;->o:Ljava/util/logging/Logger;

    .line 207
    .line 208
    new-instance v2, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const-string v3, "Was not able to create subchannel for "

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 229
    .line 230
    const-string v1, "Can\'t create subchannel"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_9
    :goto_3
    return-void
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

.method public final f()V
    .locals 4

    .line 1
    sget-object v0, Lgb/p2;->o:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 4
    .line 5
    iget-object v2, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "Shutting down, currently have {} subchannels created"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v3, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Leb/n;->e:Leb/n;

    .line 21
    .line 22
    iput-object v0, p0, Lgb/p2;->l:Leb/n;

    .line 23
    .line 24
    iput-object v0, p0, Lgb/p2;->m:Leb/n;

    .line 25
    .line 26
    invoke-virtual {p0}, Lgb/p2;->g()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lgb/p2$g;

    .line 50
    .line 51
    iget-object v1, v1, Lgb/p2$g;->a:Leb/k0$i;

    .line 52
    .line 53
    invoke-virtual {v1}, Leb/k0$i;->g()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, Lgb/p2;->g:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    return-void
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

.method public final g()V
    .locals 1

    iget-object v0, p0, Lgb/p2;->k:Leb/h1$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leb/h1$c;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgb/p2;->k:Leb/h1$c;

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lgb/p2;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lgb/p2;->k:Leb/h1$c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Leb/h1$c;->a:Leb/h1$b;

    .line 10
    .line 11
    iget-boolean v1, v0, Leb/h1$b;->c:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-boolean v0, v0, Leb/h1$b;->b:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v0, p0, Lgb/p2;->f:Leb/k0$e;

    .line 26
    .line 27
    invoke-virtual {v0}, Leb/k0$e;->d()Leb/h1;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lgb/p2$a;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Lgb/p2$a;-><init>(Lgb/p2;)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v3, 0xfa

    .line 37
    .line 38
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    iget-object v0, p0, Lgb/p2;->f:Leb/k0$e;

    .line 41
    .line 42
    invoke-virtual {v0}, Leb/k0$e;->c()Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual/range {v1 .. v6}, Leb/h1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Leb/h1$c;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lgb/p2;->k:Leb/h1$c;

    .line 51
    .line 52
    :cond_2
    :goto_1
    return-void
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

.method public final i(Leb/n;Leb/k0$j;)V
    .locals 1

    iget-object v0, p0, Lgb/p2;->m:Leb/n;

    if-ne p1, v0, :cond_1

    sget-object v0, Leb/n;->d:Leb/n;

    if-eq p1, v0, :cond_0

    sget-object v0, Leb/n;->a:Leb/n;

    if-ne p1, v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iput-object p1, p0, Lgb/p2;->m:Leb/n;

    iget-object v0, p0, Lgb/p2;->f:Leb/k0$e;

    invoke-virtual {v0, p1, p2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    return-void
.end method

.method public final j(Lgb/p2$g;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lgb/p2$g;->b:Leb/n;

    .line 2
    .line 3
    sget-object v1, Leb/n;->b:Leb/n;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p1, Lgb/p2$g;->c:Lgb/p2$b;

    .line 9
    .line 10
    iget-object v0, v0, Lgb/p2$b;->a:Leb/o;

    .line 11
    .line 12
    iget-object v2, v0, Leb/o;->a:Leb/n;

    .line 13
    .line 14
    if-ne v2, v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Leb/k0$d;

    .line 17
    .line 18
    iget-object p1, p1, Lgb/p2$g;->a:Leb/k0$i;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {p1, v2}, Leb/k0$f;->b(Leb/k0$i;Lnb/i$g$a;)Leb/k0$f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Leb/k0$d;-><init>(Leb/k0$f;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v0}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object p1, Leb/n;->c:Leb/n;

    .line 33
    .line 34
    if-ne v2, p1, :cond_2

    .line 35
    .line 36
    new-instance v1, Lgb/p2$e;

    .line 37
    .line 38
    iget-object v0, v0, Leb/o;->b:Leb/e1;

    .line 39
    .line 40
    invoke-static {v0}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v1, v0}, Lgb/p2$e;-><init>(Leb/k0$f;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v0, p0, Lgb/p2;->m:Leb/n;

    .line 52
    .line 53
    if-eq v0, p1, :cond_3

    .line 54
    .line 55
    new-instance p1, Lgb/p2$e;

    .line 56
    .line 57
    sget-object v0, Leb/k0$f;->e:Leb/k0$f;

    .line 58
    .line 59
    invoke-direct {p1, v0}, Lgb/p2$e;-><init>(Leb/k0$f;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v2, p1}, Lgb/p2;->i(Leb/n;Leb/k0$j;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    return-void
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
