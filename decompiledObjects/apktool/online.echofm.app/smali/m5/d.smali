.class public Lm5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;
.implements Ld0/D$d;
.implements Lu0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm5/d$b;
    }
.end annotation


# static fields
.field public static H:Ljava/util/Random;


# instance fields
.field public A:Ljava/util/Map;

.field public B:Lk0/w;

.field public C:Ljava/lang/Integer;

.field public D:Lx0/x;

.field public E:Ljava/lang/Integer;

.field public final F:Landroid/os/Handler;

.field public final G:Ljava/lang/Runnable;

.field public final a:Landroid/content/Context;

.field public final b:LE5/k;

.field public final c:Lm5/e;

.field public final d:Lm5/e;

.field public e:Lm5/d$b;

.field public f:J

.field public g:J

.field public h:J

.field public i:Ljava/lang/Long;

.field public j:J

.field public k:Ljava/lang/Integer;

.field public l:LE5/k$d;

.field public m:LE5/k$d;

.field public n:LE5/k$d;

.field public o:Ljava/util/Map;

.field public p:LS0/c;

.field public q:LS0/b;

.field public r:I

.field public s:Ld0/b;

.field public t:Lk0/x0;

.field public u:Z

.field public v:Lk0/w0;

.field public w:Ljava/util/List;

.field public x:Ljava/util/List;

.field public y:Ljava/util/Map;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm5/d;->H:Ljava/util/Random;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LE5/c;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lm5/d;->o:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm5/d;->x:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lm5/d;->y:Ljava/util/Map;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lm5/d;->z:I

    .line 27
    .line 28
    new-instance v1, Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lm5/d;->F:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v1, Lm5/d$a;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lm5/d$a;-><init>(Lm5/d;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lm5/d;->G:Ljava/lang/Runnable;

    .line 45
    .line 46
    iput-object p1, p0, Lm5/d;->a:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p5, p0, Lm5/d;->w:Ljava/util/List;

    .line 49
    .line 50
    if-eqz p6, :cond_0

    .line 51
    .line 52
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move p1, v0

    .line 58
    :goto_0
    iput-boolean p1, p0, Lm5/d;->u:Z

    .line 59
    .line 60
    new-instance p1, LE5/k;

    .line 61
    .line 62
    new-instance p5, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string p6, "com.ryanheise.just_audio.methods."

    .line 68
    .line 69
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    invoke-direct {p1, p2, p5}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lm5/d;->b:LE5/k;

    .line 83
    .line 84
    invoke-virtual {p1, p0}, LE5/k;->e(LE5/k$c;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lm5/e;

    .line 88
    .line 89
    new-instance p5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string p6, "com.ryanheise.just_audio.events."

    .line 95
    .line 96
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p5

    .line 106
    invoke-direct {p1, p2, p5}, Lm5/e;-><init>(LE5/c;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lm5/d;->c:Lm5/e;

    .line 110
    .line 111
    new-instance p1, Lm5/e;

    .line 112
    .line 113
    new-instance p5, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string p6, "com.ryanheise.just_audio.data."

    .line 119
    .line 120
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-direct {p1, p2, p3}, Lm5/e;-><init>(LE5/c;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, Lm5/d;->d:Lm5/e;

    .line 134
    .line 135
    sget-object p1, Lm5/d$b;->o:Lm5/d$b;

    .line 136
    .line 137
    iput-object p1, p0, Lm5/d;->e:Lm5/d$b;

    .line 138
    .line 139
    if-eqz p4, :cond_3

    .line 140
    .line 141
    const-string p1, "androidLoadControl"

    .line 142
    .line 143
    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Ljava/util/Map;

    .line 148
    .line 149
    const-wide/16 p2, 0x3e8

    .line 150
    .line 151
    if-eqz p1, :cond_2

    .line 152
    .line 153
    new-instance p5, Lk0/r$b;

    .line 154
    .line 155
    invoke-direct {p5}, Lk0/r$b;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string p6, "minBufferDuration"

    .line 159
    .line 160
    invoke-interface {p1, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p6

    .line 164
    invoke-static {p6}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object p6

    .line 168
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    div-long/2addr v1, p2

    .line 173
    long-to-int p6, v1

    .line 174
    const-string v1, "maxBufferDuration"

    .line 175
    .line 176
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 185
    .line 186
    .line 187
    move-result-wide v1

    .line 188
    div-long/2addr v1, p2

    .line 189
    long-to-int v1, v1

    .line 190
    const-string v2, "bufferForPlaybackDuration"

    .line 191
    .line 192
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide v2

    .line 204
    div-long/2addr v2, p2

    .line 205
    long-to-int v2, v2

    .line 206
    const-string v3, "bufferForPlaybackAfterRebufferDuration"

    .line 207
    .line 208
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    div-long/2addr v3, p2

    .line 221
    long-to-int v3, v3

    .line 222
    invoke-virtual {p5, p6, v1, v2, v3}, Lk0/r$b;->c(IIII)Lk0/r$b;

    .line 223
    .line 224
    .line 225
    move-result-object p5

    .line 226
    const-string p6, "prioritizeTimeOverSizeThresholds"

    .line 227
    .line 228
    invoke-interface {p1, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p6

    .line 232
    check-cast p6, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result p6

    .line 238
    invoke-virtual {p5, p6}, Lk0/r$b;->d(Z)Lk0/r$b;

    .line 239
    .line 240
    .line 241
    move-result-object p5

    .line 242
    const-string p6, "backBufferDuration"

    .line 243
    .line 244
    invoke-interface {p1, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p6

    .line 248
    invoke-static {p6}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object p6

    .line 252
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    .line 253
    .line 254
    .line 255
    move-result-wide v1

    .line 256
    div-long/2addr v1, p2

    .line 257
    long-to-int p6, v1

    .line 258
    invoke-virtual {p5, p6, v0}, Lk0/r$b;->b(IZ)Lk0/r$b;

    .line 259
    .line 260
    .line 261
    move-result-object p5

    .line 262
    const-string p6, "targetBufferBytes"

    .line 263
    .line 264
    invoke-interface {p1, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-eqz v0, :cond_1

    .line 269
    .line 270
    invoke-interface {p1, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    check-cast p1, Ljava/lang/Integer;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    invoke-virtual {p5, p1}, Lk0/r$b;->e(I)Lk0/r$b;

    .line 281
    .line 282
    .line 283
    :cond_1
    invoke-virtual {p5}, Lk0/r$b;->a()Lk0/r;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    iput-object p1, p0, Lm5/d;->t:Lk0/x0;

    .line 288
    .line 289
    :cond_2
    const-string p1, "androidLivePlaybackSpeedControl"

    .line 290
    .line 291
    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, Ljava/util/Map;

    .line 296
    .line 297
    if-eqz p1, :cond_3

    .line 298
    .line 299
    new-instance p4, Lk0/q$b;

    .line 300
    .line 301
    invoke-direct {p4}, Lk0/q$b;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string p5, "fallbackMinPlaybackSpeed"

    .line 305
    .line 306
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p5

    .line 310
    check-cast p5, Ljava/lang/Double;

    .line 311
    .line 312
    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    .line 313
    .line 314
    .line 315
    move-result-wide p5

    .line 316
    double-to-float p5, p5

    .line 317
    invoke-virtual {p4, p5}, Lk0/q$b;->c(F)Lk0/q$b;

    .line 318
    .line 319
    .line 320
    move-result-object p4

    .line 321
    const-string p5, "fallbackMaxPlaybackSpeed"

    .line 322
    .line 323
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p5

    .line 327
    check-cast p5, Ljava/lang/Double;

    .line 328
    .line 329
    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    .line 330
    .line 331
    .line 332
    move-result-wide p5

    .line 333
    double-to-float p5, p5

    .line 334
    invoke-virtual {p4, p5}, Lk0/q$b;->b(F)Lk0/q$b;

    .line 335
    .line 336
    .line 337
    move-result-object p4

    .line 338
    const-string p5, "minUpdateInterval"

    .line 339
    .line 340
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p5

    .line 344
    invoke-static {p5}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object p5

    .line 348
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 349
    .line 350
    .line 351
    move-result-wide p5

    .line 352
    div-long/2addr p5, p2

    .line 353
    invoke-virtual {p4, p5, p6}, Lk0/q$b;->f(J)Lk0/q$b;

    .line 354
    .line 355
    .line 356
    move-result-object p4

    .line 357
    const-string p5, "proportionalControlFactor"

    .line 358
    .line 359
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object p5

    .line 363
    check-cast p5, Ljava/lang/Double;

    .line 364
    .line 365
    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    .line 366
    .line 367
    .line 368
    move-result-wide p5

    .line 369
    double-to-float p5, p5

    .line 370
    invoke-virtual {p4, p5}, Lk0/q$b;->g(F)Lk0/q$b;

    .line 371
    .line 372
    .line 373
    move-result-object p4

    .line 374
    const-string p5, "maxLiveOffsetErrorForUnitSpeed"

    .line 375
    .line 376
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p5

    .line 380
    invoke-static {p5}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 381
    .line 382
    .line 383
    move-result-object p5

    .line 384
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 385
    .line 386
    .line 387
    move-result-wide p5

    .line 388
    div-long/2addr p5, p2

    .line 389
    invoke-virtual {p4, p5, p6}, Lk0/q$b;->d(J)Lk0/q$b;

    .line 390
    .line 391
    .line 392
    move-result-object p4

    .line 393
    const-string p5, "targetLiveOffsetIncrementOnRebuffer"

    .line 394
    .line 395
    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p5

    .line 399
    invoke-static {p5}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 400
    .line 401
    .line 402
    move-result-object p5

    .line 403
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 404
    .line 405
    .line 406
    move-result-wide p5

    .line 407
    div-long/2addr p5, p2

    .line 408
    invoke-virtual {p4, p5, p6}, Lk0/q$b;->h(J)Lk0/q$b;

    .line 409
    .line 410
    .line 411
    move-result-object p2

    .line 412
    const-string p3, "minPossibleLiveOffsetSmoothingFactor"

    .line 413
    .line 414
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    check-cast p1, Ljava/lang/Double;

    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 421
    .line 422
    .line 423
    move-result-wide p3

    .line 424
    double-to-float p1, p3

    .line 425
    invoke-virtual {p2, p1}, Lk0/q$b;->e(F)Lk0/q$b;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    invoke-virtual {p1}, Lk0/q$b;->a()Lk0/q;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    iput-object p1, p0, Lm5/d;->v:Lk0/w0;

    .line 434
    .line 435
    :cond_3
    return-void
.end method

.method public static synthetic K(LE5/k$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lm5/d;->M0(LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static L0(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v0, p0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 21
    .line 22
    :goto_1
    return-object p0
.end method

.method public static synthetic M(LE5/k$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lm5/d;->N0(LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic M0(LE5/k$d;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic N0(LE5/k$d;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic O0(LE5/k$d;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static synthetic S(LE5/k$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lm5/d;->O0(LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static varargs S0([Ljava/lang/Object;)Ljava/util/Map;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    aget-object v3, p0, v3

    .line 17
    .line 18
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method

.method public static synthetic Z(Lm5/d;)Lk0/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic a0(Lm5/d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm5/d;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic b0(Lm5/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c0(Lm5/d;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lm5/d;->F:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static s0(Ljava/util/Map;)Ljava/util/Map;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final A0(Ljava/util/List;)Lx0/T;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aput v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lx0/T$a;

    .line 26
    .line 27
    sget-object v0, Lm5/d;->H:Ljava/util/Random;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-direct {p1, v1, v2, v3}, Lx0/T$a;-><init>([IJ)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public synthetic B(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->o(Ld0/D$d;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public B0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 2
    .line 3
    sget-object v1, Lm5/d$b;->p:Lm5/d$b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lm5/d;->T()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lm5/d;->m:LE5/k$d;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lm5/d;->m:LE5/k$d;

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lm5/d;->o:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lm5/d;->D:Lx0/x;

    .line 31
    .line 32
    invoke-virtual {p0}, Lm5/d;->t0()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Lk0/w;->release()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lm5/d;->B:Lk0/w;

    .line 43
    .line 44
    sget-object v0, Lm5/d$b;->o:Lm5/d$b;

    .line 45
    .line 46
    iput-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 47
    .line 48
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Lm5/d;->c:Lm5/e;

    .line 52
    .line 53
    invoke-virtual {v0}, Lm5/e;->c()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lm5/d;->d:Lm5/e;

    .line 57
    .line 58
    invoke-virtual {v0}, Lm5/e;->c()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public synthetic C(ZI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->q(Ld0/D$d;ZI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm5/d;->x0()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lm5/d;->A:Ljava/util/Map;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic D(Ld0/K;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->x(Ld0/D$d;Ld0/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Lk0/w$b;

    .line 6
    .line 7
    iget-object v1, p0, Lm5/d;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lk0/w$b;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lm5/d;->t:Lk0/x0;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lk0/w$b;->m(Lk0/x0;)Lk0/w$b;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lm5/d;->v:Lk0/w0;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lk0/w$b;->l(Lk0/w0;)Lk0/w$b;

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0}, Lk0/w$b;->f()Lk0/w;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 31
    .line 32
    invoke-interface {v0}, Ld0/D;->O()Ld0/K;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ld0/K;->a()Ld0/K$c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Ld0/K$b$a;

    .line 41
    .line 42
    invoke-direct {v2}, Ld0/K$b$a;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-boolean v3, p0, Lm5/d;->u:Z

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    xor-int/2addr v3, v4

    .line 49
    invoke-virtual {v2, v3}, Ld0/K$b$a;->f(Z)Ld0/K$b$a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget-boolean v3, p0, Lm5/d;->u:Z

    .line 54
    .line 55
    xor-int/2addr v3, v4

    .line 56
    invoke-virtual {v2, v3}, Ld0/K$b$a;->g(Z)Ld0/K$b$a;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2, v4}, Ld0/K$b$a;->e(I)Ld0/K$b$a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ld0/K$b$a;->d()Ld0/K$b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Ld0/K$c;->F(Ld0/K$b;)Ld0/K$c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ld0/K$c;->C()Ld0/K;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v0, v1}, Ld0/D;->F(Ld0/K;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 80
    .line 81
    invoke-interface {v0}, Lk0/w;->j()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0, v0}, Lm5/d;->Z0(I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 89
    .line 90
    invoke-interface {v0, p0}, Ld0/D;->v(Ld0/D$d;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public synthetic E(Ld0/B;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->p(Ld0/D$d;Ld0/B;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final E0()Ljava/util/Map;
    .locals 16

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x1

    .line 3
    move-object/from16 v6, p0

    .line 4
    .line 5
    iget-object v7, v6, Lm5/d;->y:Ljava/util/Map;

    .line 6
    .line 7
    const-string v8, "AndroidEqualizer"

    .line 8
    .line 9
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    check-cast v7, Landroid/media/audiofx/Equalizer;

    .line 14
    .line 15
    new-instance v8, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    move v10, v9

    .line 22
    :goto_0
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    .line 23
    .line 24
    .line 25
    move-result v11

    .line 26
    const-wide v12, 0x408f400000000000L    # 1000.0

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-ge v10, v11, :cond_0

    .line 32
    .line 33
    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 38
    .line 39
    .line 40
    move-result-object v14

    .line 41
    aget v14, v14, v9

    .line 42
    .line 43
    int-to-double v14, v14

    .line 44
    div-double/2addr v14, v12

    .line 45
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 50
    .line 51
    .line 52
    move-result-object v15

    .line 53
    aget v15, v15, v5

    .line 54
    .line 55
    int-to-double v0, v15

    .line 56
    div-double/2addr v0, v12

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-double v2, v1

    .line 66
    div-double/2addr v2, v12

    .line 67
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-double v2, v2

    .line 76
    div-double/2addr v2, v12

    .line 77
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    new-array v3, v3, [Ljava/lang/Object;

    .line 84
    .line 85
    const-string v12, "index"

    .line 86
    .line 87
    aput-object v12, v3, v9

    .line 88
    .line 89
    aput-object v11, v3, v5

    .line 90
    .line 91
    const-string v11, "lowerFrequency"

    .line 92
    .line 93
    aput-object v11, v3, v4

    .line 94
    .line 95
    const/4 v11, 0x3

    .line 96
    aput-object v14, v3, v11

    .line 97
    .line 98
    const-string v11, "upperFrequency"

    .line 99
    .line 100
    const/4 v12, 0x4

    .line 101
    aput-object v11, v3, v12

    .line 102
    .line 103
    const/4 v11, 0x5

    .line 104
    aput-object v0, v3, v11

    .line 105
    .line 106
    const-string v0, "centerFrequency"

    .line 107
    .line 108
    const/4 v11, 0x6

    .line 109
    aput-object v0, v3, v11

    .line 110
    .line 111
    const/4 v0, 0x7

    .line 112
    aput-object v1, v3, v0

    .line 113
    .line 114
    const-string v0, "gain"

    .line 115
    .line 116
    const/16 v1, 0x8

    .line 117
    .line 118
    aput-object v0, v3, v1

    .line 119
    .line 120
    const/16 v0, 0x9

    .line 121
    .line 122
    aput-object v2, v3, v0

    .line 123
    .line 124
    invoke-static {v3}, Lm5/d;->S0([Ljava/lang/Object;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/2addr v10, v5

    .line 132
    int-to-short v10, v10

    .line 133
    goto :goto_0

    .line 134
    :cond_0
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    aget-short v0, v0, v9

    .line 139
    .line 140
    int-to-double v0, v0

    .line 141
    div-double/2addr v0, v12

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    aget-short v1, v1, v5

    .line 151
    .line 152
    int-to-double v1, v1

    .line 153
    div-double/2addr v1, v12

    .line 154
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/4 v2, 0x6

    .line 159
    new-array v2, v2, [Ljava/lang/Object;

    .line 160
    .line 161
    const-string v3, "minDecibels"

    .line 162
    .line 163
    aput-object v3, v2, v9

    .line 164
    .line 165
    aput-object v0, v2, v5

    .line 166
    .line 167
    const-string v0, "maxDecibels"

    .line 168
    .line 169
    aput-object v0, v2, v4

    .line 170
    .line 171
    const/4 v0, 0x3

    .line 172
    aput-object v1, v2, v0

    .line 173
    .line 174
    const-string v0, "bands"

    .line 175
    .line 176
    const/4 v1, 0x4

    .line 177
    aput-object v0, v2, v1

    .line 178
    .line 179
    const/4 v0, 0x5

    .line 180
    aput-object v8, v2, v0

    .line 181
    .line 182
    invoke-static {v2}, Lm5/d;->S0([Ljava/lang/Object;)Ljava/util/Map;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-array v1, v4, [Ljava/lang/Object;

    .line 187
    .line 188
    const-string v2, "parameters"

    .line 189
    .line 190
    aput-object v2, v1, v9

    .line 191
    .line 192
    aput-object v0, v1, v5

    .line 193
    .line 194
    invoke-static {v1}, Lm5/d;->S0([Ljava/lang/Object;)Ljava/util/Map;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0
.end method

.method public synthetic F(Ld0/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->a(Ld0/D$d;Ld0/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final F0(ID)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/d;->y:Ljava/util/Map;

    .line 2
    .line 3
    const-string v1, "AndroidEqualizer"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/media/audiofx/Equalizer;

    .line 10
    .line 11
    int-to-short p1, p1

    .line 12
    const-wide v1, 0x408f400000000000L    # 1000.0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr p2, v1

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    long-to-int p2, p2

    .line 23
    int-to-short p2, p2

    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public synthetic G(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->j(Ld0/D$d;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final G0(Ljava/lang/Object;)Lx0/x;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lm5/d;->o:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/x;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lm5/d;->z0(Ljava/lang/Object;)Lx0/x;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p1, p0, Lm5/d;->o:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object v1
.end method

.method public synthetic H(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->r(Ld0/D$d;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final H0(Ljava/lang/Object;)Ljava/util/List;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0, v2}, Lm5/d;->G0(Ljava/lang/Object;)Lx0/x;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "List expected: "

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public synthetic I(Ld0/w;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->l(Ld0/D$d;Ld0/w;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final I0(Ljava/lang/Object;)[Lx0/x;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lm5/d;->H0(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Lx0/x;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public J(Ld0/L;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Ld0/L;->a()LX2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Ld0/L;->a()LX2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ld0/L$a;

    .line 22
    .line 23
    invoke-virtual {v2}, Ld0/L$a;->a()Ld0/J;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move v3, v0

    .line 28
    :goto_1
    iget v4, v2, Ld0/J;->a:I

    .line 29
    .line 30
    if-ge v3, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ld0/J;->a(I)Ld0/q;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v4, v4, Ld0/q;->k:Ld0/x;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    move v5, v0

    .line 41
    :goto_2
    invoke-virtual {v4}, Ld0/x;->e()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-ge v5, v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Ld0/x;->d(I)Ld0/x$b;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    instance-of v7, v6, LS0/b;

    .line 52
    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    check-cast v6, LS0/b;

    .line 56
    .line 57
    iput-object v6, p0, Lm5/d;->q:LS0/b;

    .line 58
    .line 59
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public final J0()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lm5/d;->j:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 14
    .line 15
    sget-object v1, Lm5/d$b;->o:Lm5/d$b;

    .line 16
    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    sget-object v1, Lm5/d$b;->p:Lm5/d$b;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    cmp-long v0, v0, v2

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0

    .line 43
    :cond_2
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 44
    .line 45
    invoke-interface {v0}, Ld0/D;->P()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    return-wide v0

    .line 50
    :cond_3
    :goto_0
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 51
    .line 52
    invoke-interface {v0}, Ld0/D;->P()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    const-wide/16 v2, 0x0

    .line 57
    .line 58
    cmp-long v4, v0, v2

    .line 59
    .line 60
    if-gez v4, :cond_4

    .line 61
    .line 62
    move-wide v0, v2

    .line 63
    :cond_4
    return-wide v0
.end method

.method public final K0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 2
    .line 3
    sget-object v1, Lm5/d$b;->o:Lm5/d$b;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v1, Lm5/d$b;->p:Lm5/d$b;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {v0}, Ld0/D;->K()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    return-wide v0
.end method

.method public synthetic O(Ld0/u;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->k(Ld0/D$d;Ld0/u;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public P(Ld0/I;I)V
    .locals 5

    .line 1
    iget-wide p1, p0, Lm5/d;->j:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lm5/d;->k:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lm5/d;->k:Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p1, p2

    .line 27
    :goto_0
    iget-object v2, p0, Lm5/d;->B:Lk0/w;

    .line 28
    .line 29
    iget-wide v3, p0, Lm5/d;->j:J

    .line 30
    .line 31
    invoke-interface {v2, p1, v3, v4}, Ld0/D;->s(IJ)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lm5/d;->k:Ljava/lang/Integer;

    .line 36
    .line 37
    iput-wide v0, p0, Lm5/d;->j:J

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Lm5/d;->i1()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 49
    .line 50
    invoke-interface {p1}, Ld0/D;->f()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v0, 0x4

    .line 55
    if-ne p1, v0, :cond_6

    .line 56
    .line 57
    :try_start_0
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 58
    .line 59
    invoke-interface {p1}, Ld0/D;->u()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const-wide/16 v0, 0x0

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    iget p1, p0, Lm5/d;->z:I

    .line 68
    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 72
    .line 73
    invoke-interface {p1}, Ld0/D;->M()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 80
    .line 81
    :goto_1
    invoke-interface {p1, p2, v0, v1}, Ld0/D;->s(IJ)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catch_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 88
    .line 89
    invoke-interface {p1}, Ld0/D;->B()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 96
    .line 97
    invoke-interface {p1}, Ld0/D;->y()V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 102
    .line 103
    invoke-interface {p1}, Ld0/D;->E()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iget-object p2, p0, Lm5/d;->B:Lk0/w;

    .line 108
    .line 109
    invoke-interface {p2}, Ld0/D;->M()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-ge p1, p2, :cond_6

    .line 114
    .line 115
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 116
    .line 117
    invoke-interface {p1}, Ld0/D;->E()I

    .line 118
    .line 119
    .line 120
    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_1

    .line 122
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_3
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 126
    .line 127
    invoke-interface {p1}, Ld0/D;->M()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iput p1, p0, Lm5/d;->z:I

    .line 132
    .line 133
    return-void
.end method

.method public final P0(Lx0/x;JLjava/lang/Integer;LE5/k$d;)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lm5/d;->j:J

    .line 2
    .line 3
    iput-object p4, p0, Lm5/d;->k:Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p3, p2

    .line 14
    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iput-object p3, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 19
    .line 20
    iget-object p3, p0, Lm5/d;->e:Lm5/d$b;

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-eqz p3, :cond_2

    .line 27
    .line 28
    const/4 p4, 0x1

    .line 29
    if-eq p3, p4, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object p3, p0, Lm5/d;->B:Lk0/w;

    .line 32
    .line 33
    invoke-interface {p3}, Ld0/D;->stop()V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-virtual {p0}, Lm5/d;->T()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_2
    iput p2, p0, Lm5/d;->r:I

    .line 42
    .line 43
    iput-object p5, p0, Lm5/d;->l:LE5/k$d;

    .line 44
    .line 45
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 46
    .line 47
    .line 48
    sget-object p2, Lm5/d$b;->p:Lm5/d$b;

    .line 49
    .line 50
    iput-object p2, p0, Lm5/d;->e:Lm5/d$b;

    .line 51
    .line 52
    invoke-virtual {p0}, Lm5/d;->C0()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lm5/d;->D:Lx0/x;

    .line 56
    .line 57
    iget-object p2, p0, Lm5/d;->B:Lk0/w;

    .line 58
    .line 59
    invoke-interface {p2, p1}, Lk0/w;->e(Lx0/x;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 63
    .line 64
    invoke-interface {p1}, Ld0/D;->g()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public synthetic Q(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->h(Ld0/D$d;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Q0(D)V
    .locals 2

    .line 1
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr p1, v0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    long-to-int p1, p1

    .line 12
    iget-object p2, p0, Lm5/d;->y:Ljava/util/Map;

    .line 13
    .line 14
    const-string v0, "AndroidLoudnessEnhancer"

    .line 15
    .line 16
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/media/audiofx/LoudnessEnhancer;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public synthetic R()V
    .locals 0

    .line 1
    invoke-static {p0}, Ld0/E;->s(Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final T()V
    .locals 2

    .line 1
    const-string v0, "abort"

    .line 2
    .line 3
    const-string v1, "Connection aborted"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lm5/d;->W0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public T0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ld0/D;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-interface {v0, v1}, Ld0/D;->n(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lm5/d;->m:LE5/k$d;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lm5/d;->m:LE5/k$d;

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public synthetic U(F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->z(Ld0/D$d;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public U0(LE5/k$d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ld0/D;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lm5/d;->m:LE5/k$d;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iput-object p1, p0, Lm5/d;->m:LE5/k$d;

    .line 31
    .line 32
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-interface {p1, v0}, Ld0/D;->n(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lm5/d;->e:Lm5/d$b;

    .line 42
    .line 43
    sget-object v0, Lm5/d$b;->s:Lm5/d$b;

    .line 44
    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Lm5/d;->m:LE5/k$d;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Lm5/d;->m:LE5/k$d;

    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public synthetic V(Ld0/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->e(Ld0/D$d;Ld0/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public V0(JLjava/lang/Integer;LE5/k$d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 2
    .line 3
    sget-object v1, Lm5/d$b;->o:Lm5/d$b;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    sget-object v1, Lm5/d$b;->p:Lm5/d$b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p0}, Lm5/d;->W()V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 20
    .line 21
    iput-object p4, p0, Lm5/d;->n:LE5/k$d;

    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object p3, p0, Lm5/d;->B:Lk0/w;

    .line 33
    .line 34
    invoke-interface {p3}, Ld0/D;->E()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    :goto_0
    iget-object p4, p0, Lm5/d;->B:Lk0/w;

    .line 39
    .line 40
    invoke-interface {p4, p3, p1, p2}, Ld0/D;->s(IJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    const/4 p2, 0x0

    .line 45
    iput-object p2, p0, Lm5/d;->n:LE5/k$d;

    .line 46
    .line 47
    iput-object p2, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p4, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final W()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->n:LE5/k$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lm5/d;->n:LE5/k$d;

    .line 15
    .line 16
    iput-object v0, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final W0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lm5/d;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public X(I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_7

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lm5/d;->e:Lm5/d$b;

    .line 15
    .line 16
    sget-object v0, Lm5/d$b;->s:Lm5/d$b;

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 24
    .line 25
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lm5/d;->l:LE5/k$d;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lm5/d;->l:LE5/k$d;

    .line 38
    .line 39
    invoke-interface {v0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Lm5/d;->l:LE5/k$d;

    .line 43
    .line 44
    iget-object p1, p0, Lm5/d;->s:Ld0/b;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 49
    .line 50
    invoke-interface {v0, p1, v1}, Ld0/D;->A(Ld0/b;Z)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lm5/d;->s:Ld0/b;

    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Lm5/d;->m:LE5/k$d;

    .line 56
    .line 57
    if-eqz p1, :cond_9

    .line 58
    .line 59
    new-instance v0, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Lm5/d;->m:LE5/k$d;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 71
    .line 72
    invoke-interface {p1}, Ld0/D;->u()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 79
    .line 80
    .line 81
    :cond_4
    sget-object p1, Lm5/d$b;->r:Lm5/d$b;

    .line 82
    .line 83
    iput-object p1, p0, Lm5/d;->e:Lm5/d$b;

    .line 84
    .line 85
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lm5/d;->l:LE5/k$d;

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    new-instance p1, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lm5/d;->K0()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    cmp-long v0, v3, v5

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    move-object v0, v2

    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const-wide/16 v3, 0x3e8

    .line 113
    .line 114
    invoke-virtual {p0}, Lm5/d;->K0()J

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    mul-long/2addr v5, v3

    .line 119
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_0
    const-string v3, "duration"

    .line 124
    .line 125
    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lm5/d;->l:LE5/k$d;

    .line 129
    .line 130
    invoke-interface {v0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iput-object v2, p0, Lm5/d;->l:LE5/k$d;

    .line 134
    .line 135
    iget-object p1, p0, Lm5/d;->s:Ld0/b;

    .line 136
    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 140
    .line 141
    invoke-interface {v0, p1, v1}, Ld0/D;->A(Ld0/b;Z)V

    .line 142
    .line 143
    .line 144
    iput-object v2, p0, Lm5/d;->s:Ld0/b;

    .line 145
    .line 146
    :cond_6
    iget-object p1, p0, Lm5/d;->n:LE5/k$d;

    .line 147
    .line 148
    if-eqz p1, :cond_9

    .line 149
    .line 150
    invoke-virtual {p0}, Lm5/d;->v0()V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    invoke-virtual {p0}, Lm5/d;->k1()Z

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lm5/d;->e:Lm5/d$b;

    .line 158
    .line 159
    sget-object v0, Lm5/d$b;->q:Lm5/d$b;

    .line 160
    .line 161
    if-eq p1, v0, :cond_8

    .line 162
    .line 163
    sget-object v1, Lm5/d$b;->p:Lm5/d$b;

    .line 164
    .line 165
    if-eq p1, v1, :cond_8

    .line 166
    .line 167
    iput-object v0, p0, Lm5/d;->e:Lm5/d$b;

    .line 168
    .line 169
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 170
    .line 171
    .line 172
    :cond_8
    invoke-virtual {p0}, Lm5/d;->h1()V

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_1
    return-void
.end method

.method public final X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->l:LE5/k$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lm5/d;->l:LE5/k$d;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lm5/d;->c:Lm5/e;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lm5/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic Y(ZI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->m(Ld0/D$d;ZI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y0(III)V
    .locals 1

    .line 1
    new-instance v0, Ld0/b$e;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/b$e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ld0/b$e;->b(I)Ld0/b$e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ld0/b$e;->c(I)Ld0/b$e;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ld0/b$e;->d(I)Ld0/b$e;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ld0/b$e;->a()Ld0/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, Lm5/d;->e:Lm5/d$b;

    .line 20
    .line 21
    sget-object p3, Lm5/d$b;->p:Lm5/d$b;

    .line 22
    .line 23
    if-ne p2, p3, :cond_0

    .line 24
    .line 25
    iput-object p1, p0, Lm5/d;->s:Ld0/b;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p2, p0, Lm5/d;->B:Lk0/w;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-interface {p2, p1, p3}, Ld0/D;->A(Ld0/b;Z)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
.end method

.method public final Z0(I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :goto_0
    iput-object p1, p0, Lm5/d;->C:Ljava/lang/Integer;

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    invoke-virtual {p0}, Lm5/d;->t0()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lm5/d;->C:Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p1, p0, Lm5/d;->w:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Ljava/util/Map;

    .line 37
    .line 38
    iget-object v2, p0, Lm5/d;->C:Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0, v0, v2}, Lm5/d;->y0(Ljava/lang/Object;I)Landroid/media/audiofx/AudioEffect;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v2, "enabled"

    .line 49
    .line 50
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-virtual {v0, v2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v2, p0, Lm5/d;->x:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lm5/d;->y:Ljava/util/Map;

    .line 72
    .line 73
    const-string v3, "type"

    .line 74
    .line 75
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual {p0}, Lm5/d;->C0()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public a1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ld0/D;->i(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Ld0/P;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->y(Ld0/D$d;Ld0/P;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b1(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ld0/D;->h()Ld0/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v0, Ld0/C;->b:F

    .line 8
    .line 9
    cmpl-float v1, v1, p1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Lm5/d;->B:Lk0/w;

    .line 15
    .line 16
    new-instance v2, Ld0/C;

    .line 17
    .line 18
    iget v0, v0, Ld0/C;->a:F

    .line 19
    .line 20
    invoke-direct {v2, v0, p1}, Ld0/C;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v2}, Ld0/D;->k(Ld0/C;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lm5/d;->C0()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public synthetic c(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->v(Ld0/D$d;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c1(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ld0/D;->x(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d0(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->y:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/media/audiofx/AudioEffect;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d1(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lm5/d;->o:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx0/x;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string v1, "type"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    const-string v2, "concatenating"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v0, "looping"

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "child"

    .line 51
    .line 52
    invoke-static {p1, v0}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lm5/d;->d1(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    check-cast v0, Lx0/l;

    .line 61
    .line 62
    const-string v1, "shuffleOrder"

    .line 63
    .line 64
    invoke-static {p1, v1}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lm5/d;->A0(Ljava/util/List;)Lx0/T;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lx0/l;->r0(Lx0/T;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "children"

    .line 78
    .line 79
    invoke-static {p1, v0}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v0}, Lm5/d;->d1(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    :goto_1
    return-void
.end method

.method public e0(Ld0/B;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    instance-of v2, p1, Lk0/u;

    .line 4
    .line 5
    const-string v3, "index"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const-string v5, "AudioPlayer"

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    check-cast p1, Lk0/u;

    .line 13
    .line 14
    iget v2, p1, Lk0/u;->x:I

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-eq v2, v4, :cond_1

    .line 19
    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v6, "default ExoPlaybackException: "

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lk0/u;->h()Ljava/lang/RuntimeException;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v5, v2}, Lt5/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v6, "TYPE_UNEXPECTED: "

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v6, "TYPE_RENDERER: "

    .line 65
    .line 66
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lk0/u;->f()Ljava/lang/Exception;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v6, "TYPE_SOURCE: "

    .line 80
    .line 81
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lk0/u;->g()Ljava/io/IOException;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    goto :goto_1

    .line 89
    :goto_2
    iget v2, p1, Lk0/u;->x:I

    .line 90
    .line 91
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object v5, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 100
    .line 101
    new-array v1, v1, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v3, v1, v0

    .line 104
    .line 105
    aput-object v5, v1, v4

    .line 106
    .line 107
    invoke-static {v1}, Lm5/d;->S0([Ljava/lang/Object;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :goto_3
    invoke-virtual {p0, v2, p1, v0}, Lm5/d;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v6, "default PlaybackException: "

    .line 121
    .line 122
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v5, v2}, Lt5/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget v2, p1, Ld0/B;->o:I

    .line 140
    .line 141
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object v5, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 150
    .line 151
    new-array v1, v1, [Ljava/lang/Object;

    .line 152
    .line 153
    aput-object v3, v1, v0

    .line 154
    .line 155
    aput-object v5, v1, v4

    .line 156
    .line 157
    invoke-static {v1}, Lm5/d;->S0([Ljava/lang/Object;)Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    goto :goto_3

    .line 162
    :goto_4
    iget p1, p0, Lm5/d;->r:I

    .line 163
    .line 164
    add-int/2addr p1, v4

    .line 165
    iput p1, p0, Lm5/d;->r:I

    .line 166
    .line 167
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 168
    .line 169
    invoke-interface {p1}, Ld0/D;->B()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    iget-object p1, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 176
    .line 177
    if-eqz p1, :cond_4

    .line 178
    .line 179
    iget v0, p0, Lm5/d;->r:I

    .line 180
    .line 181
    const/4 v1, 0x5

    .line 182
    if-gt v0, v1, :cond_4

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    add-int/2addr p1, v4

    .line 189
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 190
    .line 191
    invoke-interface {v0}, Ld0/D;->L()Ld0/I;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ld0/I;->p()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-ge p1, v0, :cond_4

    .line 200
    .line 201
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 202
    .line 203
    iget-object v1, p0, Lm5/d;->D:Lx0/x;

    .line 204
    .line 205
    invoke-interface {v0, v1}, Lk0/w;->e(Lx0/x;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 209
    .line 210
    invoke-interface {v0}, Ld0/D;->g()V

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 214
    .line 215
    const-wide/16 v1, 0x0

    .line 216
    .line 217
    invoke-interface {v0, p1, v1, v2}, Ld0/D;->s(IJ)V

    .line 218
    .line 219
    .line 220
    :cond_4
    return-void
.end method

.method public e1(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lk0/w;->d(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f1(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ld0/D;->h()Ld0/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v0, Ld0/C;->a:F

    .line 8
    .line 9
    cmpl-float v1, v1, p1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Lm5/d;->B:Lk0/w;

    .line 15
    .line 16
    new-instance v2, Ld0/C;

    .line 17
    .line 18
    iget v0, v0, Ld0/C;->b:F

    .line 19
    .line 20
    invoke-direct {v2, p1, v0}, Ld0/C;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v2}, Ld0/D;->k(Ld0/C;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lm5/d;->B:Lk0/w;

    .line 27
    .line 28
    invoke-interface {p1}, Ld0/D;->u()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Lm5/d;->C0()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final g0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm5/d;->C0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm5/d;->l0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public g1(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ld0/D;->l(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic h0(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->u(Ld0/D$d;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final h1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->F:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lm5/d;->G:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm5/d;->F:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lm5/d;->G:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public synthetic i0(II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->w(Ld0/D$d;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final i1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->B:Lk0/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ld0/D;->E()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public synthetic j(Ld0/C;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->n(Ld0/D$d;Ld0/C;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic j0(Ld0/D$b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->b(Ld0/D$d;Ld0/D$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/d;->J0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lm5/d;->f:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lm5/d;->g:J

    .line 12
    .line 13
    return-void
.end method

.method public synthetic k(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->d(Ld0/D$d;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public k0(Ld0/D$e;Ld0/D$e;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm5/d;->j1()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-eq p3, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lm5/d;->i1()Z

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final k1()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lm5/d;->J0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lm5/d;->f:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lm5/d;->J0()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lm5/d;->f:J

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lm5/d;->g:J

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0
.end method

.method public final l0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->A:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lm5/d;->c:Lm5/e;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lm5/e;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lm5/d;->A:Ljava/util/Map;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public synthetic m(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->t(Ld0/D$d;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m0(Ljava/util/Map;)Li0/g$a;
    .locals 2

    .line 1
    invoke-static {p1}, Lm5/d;->s0(Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "User-Agent"

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "user-agent"

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lm5/d;->a:Landroid/content/Context;

    .line 30
    .line 31
    const-string v1, "just_audio"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lg0/M;->q0(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_2
    new-instance v1, Li0/m$b;

    .line 38
    .line 39
    invoke-direct {v1}, Li0/m$b;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Li0/m$b;->e(Ljava/lang/String;)Li0/m$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, Li0/m$b;->c(Z)Li0/m$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Li0/m$b;->d(Ljava/util/Map;)Li0/m$b;

    .line 60
    .line 61
    .line 62
    :cond_3
    new-instance p1, Li0/l$a;

    .line 63
    .line 64
    iget-object v1, p0, Lm5/d;->a:Landroid/content/Context;

    .line 65
    .line 66
    invoke-direct {p1, v1, v0}, Li0/l$a;-><init>(Landroid/content/Context;Li0/g$a;)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method public synthetic n0(Ld0/D;Ld0/D$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->g(Ld0/D$d;Ld0/D;Ld0/D$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 16

    .line 1
    move-object/from16 v7, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    invoke-virtual/range {p0 .. p0}, Lm5/d;->D0()V

    const/4 v9, 0x0

    :try_start_0
    iget-object v2, v1, LE5/j;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v5, 0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "audioEffectSetEnabled"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x12

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_a

    :sswitch_1
    const-string v3, "setAutomaticallyWaitsToMinimizeStalling"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "androidEqualizerGetParameters"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "setPreferredPeakBitRate"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xc

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "setSpeed"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "setPitch"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x5

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "concatenatingMove"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "concatenatingRemoveRange"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xf

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "setVolume"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "pause"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "seek"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_b
    const-string v3, "play"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v5

    goto/16 :goto_1

    :sswitch_c
    const-string v3, "load"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_d
    const-string v3, "setLoopMode"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x7

    goto :goto_1

    :sswitch_e
    const-string v3, "setAndroidAudioAttributes"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x11

    goto :goto_1

    :sswitch_f
    const-string v3, "androidLoudnessEnhancerSetTargetGain"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x13

    goto :goto_1

    :sswitch_10
    const-string v3, "setCanUseNetworkResourcesForLiveStreamingWhilePaused"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xb

    goto :goto_1

    :sswitch_11
    const-string v3, "setShuffleOrder"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x9

    goto :goto_1

    :sswitch_12
    const-string v3, "concatenatingInsertAll"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xe

    goto :goto_1

    :sswitch_13
    const-string v3, "setSkipSilence"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x6

    goto :goto_1

    :sswitch_14
    const-string v3, "setShuffleMode"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    goto :goto_1

    :sswitch_15
    const-string v3, "androidEqualizerBandSetGain"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/16 v2, 0x15

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v2, -0x1

    :goto_1
    const-string v3, "audioSource"

    const-wide/16 v10, 0x3e8

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const-string v6, "index"

    const-string v14, "enabled"

    const-string v15, "shuffleOrder"

    const-string v4, "id"

    packed-switch v2, :pswitch_data_0

    :try_start_1
    invoke-interface/range {p2 .. p2}, LE5/k$d;->c()V

    goto/16 :goto_7

    :pswitch_0
    const-string v2, "bandIndex"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "gain"

    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v7, v2, v3, v4}, Lm5/d;->F0(ID)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :goto_2
    invoke-interface {v8, v1}, LE5/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Lm5/d;->E0()Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :pswitch_2
    const-string v2, "targetGain"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Lm5/d;->Q0(D)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :pswitch_3
    const-string v2, "type"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v14}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v7, v2, v1}, Lm5/d;->d0(Ljava/lang/String;Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :pswitch_4
    const-string v2, "contentType"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "flags"

    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "usage"

    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7, v2, v3, v1}, Lm5/d;->Y0(III)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    const-string v3, "currentIndex"

    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v5, "newIndex"

    invoke-virtual {v1, v5}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, v7, Lm5/d;->F:Landroid/os/Handler;

    new-instance v10, Lm5/c;

    invoke-direct {v10, v8}, Lm5/c;-><init>(LE5/k$d;)V

    invoke-virtual {v2, v3, v5, v6, v10}, Lx0/l;->h0(IILandroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    invoke-virtual {v1, v15}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v7, v1}, Lm5/d;->A0(Ljava/util/List;)Lx0/T;

    move-result-object v1

    :goto_3
    invoke-virtual {v2, v1}, Lx0/l;->r0(Lx0/T;)V

    goto/16 :goto_7

    :pswitch_6
    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    const-string v3, "startIndex"

    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v5, "endIndex"

    invoke-virtual {v1, v5}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, v7, Lm5/d;->F:Landroid/os/Handler;

    new-instance v10, Lm5/b;

    invoke-direct {v10, v8}, Lm5/b;-><init>(LE5/k$d;)V

    invoke-virtual {v2, v3, v5, v6, v10}, Lx0/l;->m0(IILandroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    invoke-virtual {v1, v15}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v7, v1}, Lm5/d;->A0(Ljava/util/List;)Lx0/T;

    move-result-object v1

    goto :goto_3

    :pswitch_7
    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    invoke-virtual {v1, v6}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v5, "children"

    invoke-virtual {v1, v5}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v7, v5}, Lm5/d;->H0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iget-object v6, v7, Lm5/d;->F:Landroid/os/Handler;

    new-instance v10, Lm5/a;

    invoke-direct {v10, v8}, Lm5/a;-><init>(LE5/k$d;)V

    invoke-virtual {v2, v3, v5, v6, v10}, Lx0/l;->P(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lm5/d;->w0(Ljava/lang/Object;)Lx0/l;

    move-result-object v2

    invoke-virtual {v1, v15}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v7, v1}, Lm5/d;->A0(Ljava/util/List;)Lx0/T;

    move-result-object v1

    goto :goto_3

    :pswitch_8
    const-string v2, "position"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v6}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    div-long v12, v2, v10

    :goto_4
    invoke-virtual {v7, v12, v13, v1, v8}, Lm5/d;->V0(JLjava/lang/Integer;LE5/k$d;)V

    goto/16 :goto_7

    :pswitch_9
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_a
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_b
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7, v1}, Lm5/d;->d1(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_d
    const-string v2, "shuffleMode"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v5, :cond_2

    move v4, v5

    goto :goto_5

    :cond_2
    const/4 v4, 0x0

    :goto_5
    invoke-virtual {v7, v4}, Lm5/d;->c1(Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_e
    const-string v2, "loopMode"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7, v1}, Lm5/d;->a1(I)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v1, v14}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v7, v1}, Lm5/d;->e1(Z)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_10
    const-string v2, "pitch"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lm5/d;->b1(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_11
    const-string v2, "speed"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lm5/d;->f1(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_12
    const-string v2, "volume"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v7, v1}, Lm5/d;->g1(F)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Lm5/d;->T0()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v7, v8}, Lm5/d;->U0(LE5/k$d;)V

    goto :goto_7

    :pswitch_15
    const-string v2, "initialPosition"

    invoke-virtual {v1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "initialIndex"

    invoke-virtual {v1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7, v1}, Lm5/d;->G0(Ljava/lang/Object;)Lx0/x;

    move-result-object v3

    if-nez v2, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    div-long/2addr v1, v10

    move-wide v12, v1

    :goto_6
    move-object/from16 v1, p0

    move-object v2, v3

    move-wide v3, v12

    move-object/from16 v6, p2

    invoke-virtual/range {v1 .. v6}, Lm5/d;->P0(Lx0/x;JLjava/lang/Integer;LE5/k$d;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lm5/d;->l0()V

    goto :goto_b

    :goto_8
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_9
    invoke-interface {v8, v2, v1, v9}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    :goto_a
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_9

    :goto_b
    return-void

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lm5/d;->l0()V

    throw v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aad3a17 -> :sswitch_15
        -0x76787586 -> :sswitch_14
        -0x6fccfba0 -> :sswitch_13
        -0x5bd749ea -> :sswitch_12
        -0x5878aea9 -> :sswitch_11
        -0x29f8037e -> :sswitch_10
        -0x1494f7ca -> :sswitch_f
        -0x64229a0 -> :sswitch_e
        -0x2e1df17 -> :sswitch_d
        0x32c4e6 -> :sswitch_c
        0x348b34 -> :sswitch_b
        0x35ce78 -> :sswitch_a
        0x65825f6 -> :sswitch_9
        0x27f73e1c -> :sswitch_8
        0x3264dd87 -> :sswitch_7
        0x3ad42123 -> :sswitch_6
        0x538783fe -> :sswitch_5
        0x53b4c105 -> :sswitch_4
        0x56b389ef -> :sswitch_3
        0x60da657d -> :sswitch_2
        0x613a0038 -> :sswitch_1
        0x7e381ce6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p0(Ljava/util/Map;)LF0/m;
    .locals 4

    .line 1
    new-instance v0, LF0/m;

    .line 2
    .line 3
    invoke-direct {v0}, LF0/m;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v1, "androidExtractorOptions"

    .line 9
    .line 10
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string v1, "constantBitrateSeekingEnabled"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-string v2, "constantBitrateSeekingAlwaysEnabled"

    .line 31
    .line 32
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "mp3Flags"

    .line 43
    .line 44
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v1, 0x1

    .line 56
    const/4 v2, 0x0

    .line 57
    move p1, v2

    .line 58
    :goto_0
    invoke-virtual {v0, v1}, LF0/m;->i(Z)LF0/m;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, LF0/m;->h(Z)LF0/m;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, LF0/m;->j(I)LF0/m;

    .line 65
    .line 66
    .line 67
    return-object v0
.end method

.method public synthetic q0(IZ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld0/E;->f(Ld0/D$d;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic r(Lf0/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->c(Ld0/D$d;Lf0/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic r0(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld0/E;->i(Ld0/D$d;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final t0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/d;->x:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/media/audiofx/AudioEffect;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/media/audiofx/AudioEffect;->release()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lm5/d;->y:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final u0()Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm5/d;->p:LS0/c;

    .line 7
    .line 8
    const-string v2, "url"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lm5/d;->p:LS0/c;

    .line 18
    .line 19
    iget-object v3, v3, LS0/c;->p:Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "title"

    .line 22
    .line 23
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lm5/d;->p:LS0/c;

    .line 27
    .line 28
    iget-object v3, v3, LS0/c;->q:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v3, "info"

    .line 34
    .line 35
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lm5/d;->q:LS0/b;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lm5/d;->q:LS0/b;

    .line 48
    .line 49
    iget v3, v3, LS0/b;->o:I

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string v4, "bitrate"

    .line 56
    .line 57
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lm5/d;->q:LS0/b;

    .line 61
    .line 62
    iget-object v3, v3, LS0/b;->p:Ljava/lang/String;

    .line 63
    .line 64
    const-string v4, "genre"

    .line 65
    .line 66
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lm5/d;->q:LS0/b;

    .line 70
    .line 71
    iget-object v3, v3, LS0/b;->q:Ljava/lang/String;

    .line 72
    .line 73
    const-string v4, "name"

    .line 74
    .line 75
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, Lm5/d;->q:LS0/b;

    .line 79
    .line 80
    iget v3, v3, LS0/b;->t:I

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v4, "metadataInterval"

    .line 87
    .line 88
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Lm5/d;->q:LS0/b;

    .line 92
    .line 93
    iget-object v3, v3, LS0/b;->r:Ljava/lang/String;

    .line 94
    .line 95
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lm5/d;->q:LS0/b;

    .line 99
    .line 100
    iget-boolean v2, v2, LS0/b;->s:Z

    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "isPublic"

    .line 107
    .line 108
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const-string v2, "headers"

    .line 112
    .line 113
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_1
    return-object v0
.end method

.method public final v0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm5/d;->i:Ljava/lang/Long;

    .line 3
    .line 4
    iget-object v1, p0, Lm5/d;->n:LE5/k$d;

    .line 5
    .line 6
    new-instance v2, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lm5/d;->n:LE5/k$d;

    .line 15
    .line 16
    return-void
.end method

.method public final w0(Ljava/lang/Object;)Lx0/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->o:Ljava/util/Map;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lx0/l;

    .line 10
    .line 11
    return-object p1
.end method

.method public x(Ld0/x;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ld0/x;->e()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ld0/x;->d(I)Ld0/x$b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, LS0/c;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, LS0/c;

    .line 17
    .line 18
    iput-object v1, p0, Lm5/d;->p:LS0/c;

    .line 19
    .line 20
    invoke-virtual {p0}, Lm5/d;->g0()V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public final x0()Ljava/util/Map;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm5/d;->K0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    const-wide/16 v2, 0x3e8

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lm5/d;->K0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    mul-long/2addr v4, v2

    .line 28
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    iget-object v4, p0, Lm5/d;->B:Lk0/w;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v4}, Ld0/D;->t()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    :goto_1
    iput-wide v4, p0, Lm5/d;->h:J

    .line 44
    .line 45
    iget-object v4, p0, Lm5/d;->e:Lm5/d$b;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v5, "processingState"

    .line 56
    .line 57
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-wide v4, p0, Lm5/d;->f:J

    .line 61
    .line 62
    mul-long/2addr v4, v2

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v5, "updatePosition"

    .line 68
    .line 69
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-wide v4, p0, Lm5/d;->g:J

    .line 73
    .line 74
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "updateTime"

    .line 79
    .line 80
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget-wide v4, p0, Lm5/d;->f:J

    .line 84
    .line 85
    iget-wide v6, p0, Lm5/d;->h:J

    .line 86
    .line 87
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    mul-long/2addr v4, v2

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "bufferedPosition"

    .line 97
    .line 98
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const-string v2, "icyMetadata"

    .line 102
    .line 103
    invoke-virtual {p0}, Lm5/d;->u0()Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v2, "duration"

    .line 111
    .line 112
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-string v1, "currentIndex"

    .line 116
    .line 117
    iget-object v2, p0, Lm5/d;->E:Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string v1, "androidAudioSessionId"

    .line 123
    .line 124
    iget-object v2, p0, Lm5/d;->C:Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    return-object v0
.end method

.method public final y0(Ljava/lang/Object;I)Landroid/media/audiofx/AudioEffect;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "type"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    const-string v2, "AndroidEqualizer"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const-string v2, "AndroidLoudnessEnhancer"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const-string v0, "targetGain"

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Double;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    mul-double/2addr v0, v2

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    long-to-int p1, v0

    .line 53
    new-instance v0, Landroid/media/audiofx/LoudnessEnhancer;

    .line 54
    .line 55
    invoke-direct {v0, p2}, Landroid/media/audiofx/LoudnessEnhancer;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v2, "Unknown AudioEffect type: "

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p2

    .line 89
    :cond_1
    new-instance p1, Landroid/media/audiofx/Equalizer;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-direct {p1, v0, p2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 93
    .line 94
    .line 95
    return-object p1
.end method

.method public final z0(Ljava/lang/Object;)Lx0/x;
    .locals 10

    .line 1
    check-cast p1, Ljava/util/Map;

    const-string v0, "id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "type"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "silence"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x6

    goto :goto_0

    :sswitch_1
    const-string v3, "progressive"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x5

    goto :goto_0

    :sswitch_2
    const-string v3, "clipping"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x4

    goto :goto_0

    :sswitch_3
    const-string v3, "looping"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v3, "dash"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_5
    const-string v3, "hls"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v5, 0x1

    goto :goto_0

    :sswitch_6
    const-string v3, "concatenating"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    move v5, v4

    :goto_0
    const-string v2, "child"

    const-string v3, "uri"

    const-string v6, "headers"

    packed-switch v5, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown AudioSource type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v1, Lx0/U$b;

    invoke-direct {v1}, Lx0/U$b;-><init>()V

    const-string v2, "duration"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lx0/U$b;->b(J)Lx0/U$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx0/U$b;->c(Ljava/lang/Object;)Lx0/U$b;

    move-result-object p1

    invoke-virtual {p1}, Lx0/U$b;->a()Lx0/U;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v1, Lx0/L$b;

    invoke-static {p1, v6}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p0, v2}, Lm5/d;->m0(Ljava/util/Map;)Li0/g$a;

    move-result-object v2

    const-string v4, "options"

    invoke-static {p1, v4}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {p0, v4}, Lm5/d;->p0(Ljava/util/Map;)LF0/m;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lx0/L$b;-><init>(Li0/g$a;LF0/x;)V

    new-instance v2, Ld0/u$c;

    invoke-direct {v2}, Ld0/u$c;-><init>()V

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v2, p1}, Ld0/u$c;->e(Landroid/net/Uri;)Ld0/u$c;

    move-result-object p1

    invoke-virtual {p1, v0}, Ld0/u$c;->d(Ljava/lang/Object;)Ld0/u$c;

    move-result-object p1

    invoke-virtual {p1}, Ld0/u$c;->a()Ld0/u;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx0/L$b;->b(Ld0/u;)Lx0/L;

    move-result-object p1

    return-object p1

    :pswitch_2
    const-string v0, "start"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "end"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lm5/d;->L0(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    new-instance v9, Lx0/f;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm5/d;->G0(Ljava/lang/Object;)Lx0/x;

    move-result-object v4

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    goto :goto_2

    :cond_7
    const-wide/16 v2, 0x0

    goto :goto_1

    :goto_2
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_3
    move-wide v7, v0

    goto :goto_4

    :cond_8
    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_3

    :goto_4
    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lx0/f;-><init>(Lx0/x;JJ)V

    return-object v9

    :pswitch_3
    const-string v0, "count"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm5/d;->G0(Ljava/lang/Object;)Lx0/x;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-array v1, v0, [Lx0/x;

    :goto_5
    if-ge v4, v0, :cond_9

    aput-object p1, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    new-instance p1, Lx0/l;

    invoke-direct {p1, v1}, Lx0/l;-><init>([Lx0/x;)V

    return-object p1

    :pswitch_4
    new-instance v1, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    invoke-static {p1, v6}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p0, v2}, Lm5/d;->m0(Ljava/util/Map;)Li0/g$a;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;-><init>(Li0/g$a;)V

    new-instance v2, Ld0/u$c;

    invoke-direct {v2}, Ld0/u$c;-><init>()V

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v2, p1}, Ld0/u$c;->e(Landroid/net/Uri;)Ld0/u$c;

    move-result-object p1

    const-string v2, "application/dash+xml"

    invoke-virtual {p1, v2}, Ld0/u$c;->c(Ljava/lang/String;)Ld0/u$c;

    move-result-object p1

    invoke-virtual {p1, v0}, Ld0/u$c;->d(Ljava/lang/Object;)Ld0/u$c;

    move-result-object p1

    invoke-virtual {p1}, Ld0/u$c;->a()Ld0/u;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a(Ld0/u;)Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    invoke-static {p1, v6}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {p0, v1}, Lm5/d;->m0(Ljava/util/Map;)Li0/g$a;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Li0/g$a;)V

    new-instance v1, Ld0/u$c;

    invoke-direct {v1}, Ld0/u$c;-><init>()V

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld0/u$c;->e(Landroid/net/Uri;)Ld0/u$c;

    move-result-object p1

    const-string v1, "application/x-mpegURL"

    invoke-virtual {p1, v1}, Ld0/u$c;->c(Ljava/lang/String;)Ld0/u$c;

    move-result-object p1

    invoke-virtual {p1}, Ld0/u$c;->a()Ld0/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a(Ld0/u;)Landroidx/media3/exoplayer/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    :pswitch_6
    const-string v0, "children"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm5/d;->I0(Ljava/lang/Object;)[Lx0/x;

    move-result-object v0

    new-instance v1, Lx0/l;

    const-string v2, "useLazyPreparation"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v3, "shuffleOrder"

    invoke-static {p1, v3}, Lm5/d;->R0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lm5/d;->A0(Ljava/util/List;)Lx0/T;

    move-result-object p1

    invoke-direct {v1, v4, v2, p1, v0}, Lx0/l;-><init>(ZZLx0/T;[Lx0/x;)V

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x1a9425ce -> :sswitch_6
        0x193ef -> :sswitch_5
        0x2eef92 -> :sswitch_4
        0x14db9ebe -> :sswitch_3
        0x36c0fcc2 -> :sswitch_2
        0x43720b8b -> :sswitch_1
        0x7cbaf4a1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
