.class public Lpc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpc/b$a;,
        Lpc/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpc/f<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _closeCause:Ljava/lang/Object;

.field public final a:I

.field public final b:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "TE;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field private volatile bufferEnd:J

.field private volatile bufferEndSegment:Ljava/lang/Object;

.field private volatile closeHandler:Ljava/lang/Object;

.field private volatile completedExpandBuffersAndPauseFlag:J

.field private volatile receiveSegment:Ljava/lang/Object;

.field private volatile receivers:J

.field private volatile sendSegment:Ljava/lang/Object;

.field private volatile sendersAndCloseStatus:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lpc/b;

    const-string v2, "sendersAndCloseStatus"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "receivers"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "bufferEnd"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "completedExpandBuffersAndPauseFlag"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "sendSegment"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "receiveSegment"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "bufferEndSegment"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_closeCause"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lpc/b;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "closeHandler"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lpc/b;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(ILdc/l;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ldc/l<",
            "-TE;",
            "Lrb/h;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lpc/b;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lpc/b;->b:Ldc/l;

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_5

    .line 14
    .line 15
    sget-object v0, Lpc/e;->a:Lpc/k;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const v0, 0x7fffffff

    .line 20
    .line 21
    .line 22
    if-eq p1, v0, :cond_1

    .line 23
    .line 24
    int-to-long v0, p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    :goto_1
    iput-wide v0, p0, Lpc/b;->bufferEnd:J

    .line 35
    .line 36
    invoke-virtual {p0}, Lpc/b;->p()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, Lpc/b;->completedExpandBuffersAndPauseFlag:J

    .line 41
    .line 42
    new-instance p1, Lpc/k;

    .line 43
    .line 44
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v7, 0x3

    .line 48
    move-object v2, p1

    .line 49
    move-object v6, p0

    .line 50
    invoke-direct/range {v2 .. v7}, Lpc/k;-><init>(JLpc/k;Lpc/b;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lpc/b;->sendSegment:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p1, p0, Lpc/b;->receiveSegment:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {p0}, Lpc/b;->z()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    sget-object p1, Lpc/e;->a:Lpc/k;

    .line 64
    .line 65
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 66
    .line 67
    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    iput-object p1, p0, Lpc/b;->bufferEndSegment:Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz p2, :cond_4

    .line 73
    .line 74
    new-instance p1, Lpc/b$c;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lpc/b$c;-><init>(Lpc/b;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    sget-object p1, Lpc/e;->s:Ld2/h0;

    .line 80
    .line 81
    iput-object p1, p0, Lpc/b;->_closeCause:Ljava/lang/Object;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const-string p2, "Invalid channel capacity: "

    .line 85
    .line 86
    const-string v0, ", should be >=0"

    .line 87
    .line 88
    invoke-static {p2, p1, v0}, La0/j;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p2
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

.method public static D(Lpc/b;Lub/e;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/b<",
            "TE;>;",
            "Lub/e<",
            "-",
            "Lpc/j<",
            "+TE;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lpc/b$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lpc/b$d;

    .line 7
    .line 8
    iget v1, v0, Lpc/b$d;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpc/b$d;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpc/b$d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lpc/b$d;-><init>(Lpc/b;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    move-object v6, v0

    .line 26
    iget-object p1, v6, Lpc/b$d;->a:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 29
    .line 30
    iget v1, v6, Lpc/b$d;->c:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lpc/j;

    .line 41
    .line 42
    iget-object p0, p1, Lpc/j;->a:Ljava/lang/Object;

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    sget-object v1, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lpc/k;

    .line 65
    .line 66
    :goto_1
    invoke-virtual {p0}, Lpc/b;->x()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance p1, Lpc/j$a;

    .line 77
    .line 78
    invoke-direct {p1, p0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    sget-object v3, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 83
    .line 84
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    sget v3, Lpc/e;->b:I

    .line 89
    .line 90
    int-to-long v7, v3

    .line 91
    div-long v7, v4, v7

    .line 92
    .line 93
    int-to-long v9, v3

    .line 94
    rem-long v9, v4, v9

    .line 95
    .line 96
    long-to-int v3, v9

    .line 97
    iget-wide v9, v1, Lsc/t;->c:J

    .line 98
    .line 99
    cmp-long v9, v9, v7

    .line 100
    .line 101
    if-eqz v9, :cond_5

    .line 102
    .line 103
    invoke-virtual {p0, v7, v8, v1}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    if-nez v7, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move-object v13, v7

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move-object v13, v1

    .line 113
    :goto_2
    move-object v7, p0

    .line 114
    move-object v8, v13

    .line 115
    move v9, v3

    .line 116
    move-wide v10, v4

    .line 117
    move-object v12, p1

    .line 118
    invoke-virtual/range {v7 .. v12}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v7, Lpc/e;->m:Ld2/h0;

    .line 123
    .line 124
    if-eq v1, v7, :cond_a

    .line 125
    .line 126
    sget-object v7, Lpc/e;->o:Ld2/h0;

    .line 127
    .line 128
    if-ne v1, v7, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    cmp-long v1, v4, v7

    .line 135
    .line 136
    if-gez v1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v13}, Lsc/c;->a()V

    .line 139
    .line 140
    .line 141
    :cond_6
    move-object v1, v13

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    sget-object p1, Lpc/e;->n:Ld2/h0;

    .line 144
    .line 145
    if-ne v1, p1, :cond_9

    .line 146
    .line 147
    iput v2, v6, Lpc/b$d;->c:I

    .line 148
    .line 149
    move-object v1, p0

    .line 150
    move-object v2, v13

    .line 151
    invoke-virtual/range {v1 .. v6}, Lpc/b;->E(Lpc/k;IJLub/e;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-ne p0, v0, :cond_8

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_8
    :goto_3
    move-object p1, p0

    .line 159
    goto :goto_4

    .line 160
    :cond_9
    invoke-virtual {v13}, Lsc/c;->a()V

    .line 161
    .line 162
    .line 163
    move-object p1, v1

    .line 164
    :goto_4
    return-object p1

    .line 165
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string p1, "unexpected"

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p0
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

.method public static final b(Lpc/b;JLpc/k;)Lpc/k;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 5
    .line 6
    sget-object v1, Lpc/e;->a:Lpc/k;

    .line 7
    .line 8
    sget-object v1, Lpc/d;->a:Lpc/d;

    .line 9
    .line 10
    :cond_0
    invoke-static {p3, p1, p2, v1}, Lp2/m0;->F(Lsc/t;JLdc/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_7

    .line 19
    .line 20
    invoke-static {v2}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lsc/t;

    .line 29
    .line 30
    iget-wide v5, v4, Lsc/t;->c:J

    .line 31
    .line 32
    iget-wide v7, v3, Lsc/t;->c:J

    .line 33
    .line 34
    cmp-long v5, v5, v7

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-ltz v5, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {v3}, Lsc/t;->i()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    invoke-virtual {v0, p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    move v6, v7

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    if-eq v5, v4, :cond_3

    .line 61
    .line 62
    :goto_1
    if-eqz v6, :cond_6

    .line 63
    .line 64
    invoke-virtual {v4}, Lsc/t;->e()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    invoke-virtual {v4}, Lsc/c;->d()V

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_2
    move v6, v7

    .line 74
    :goto_3
    if-eqz v6, :cond_0

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_6
    invoke-virtual {v3}, Lsc/t;->e()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, Lsc/c;->d()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_7
    :goto_4
    invoke-static {v2}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, 0x0

    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    invoke-virtual {p0}, Lpc/b;->m()Z

    .line 95
    .line 96
    .line 97
    iget-wide p1, p3, Lsc/t;->c:J

    .line 98
    .line 99
    sget v0, Lpc/e;->b:I

    .line 100
    .line 101
    int-to-long v2, v0

    .line 102
    mul-long/2addr p1, v2

    .line 103
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    cmp-long p0, p1, v2

    .line 108
    .line 109
    if-gez p0, :cond_c

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_8
    invoke-static {v2}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    check-cast p3, Lpc/k;

    .line 117
    .line 118
    iget-wide v2, p3, Lsc/t;->c:J

    .line 119
    .line 120
    cmp-long p1, v2, p1

    .line 121
    .line 122
    if-lez p1, :cond_b

    .line 123
    .line 124
    sget p1, Lpc/e;->b:I

    .line 125
    .line 126
    int-to-long p1, p1

    .line 127
    mul-long/2addr v2, p1

    .line 128
    sget-object p1, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 129
    .line 130
    :cond_9
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v6

    .line 134
    const-wide v4, 0xfffffffffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v4, v6

    .line 140
    cmp-long p2, v4, v2

    .line 141
    .line 142
    if-ltz p2, :cond_a

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_a
    const/16 p2, 0x3c

    .line 146
    .line 147
    shr-long v8, v6, p2

    .line 148
    .line 149
    long-to-int v0, v8

    .line 150
    sget-object v8, Lpc/e;->a:Lpc/k;

    .line 151
    .line 152
    int-to-long v8, v0

    .line 153
    shl-long/2addr v8, p2

    .line 154
    add-long/2addr v8, v4

    .line 155
    sget-object v4, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 156
    .line 157
    move-object v5, p0

    .line 158
    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_9

    .line 163
    .line 164
    :goto_5
    iget-wide p1, p3, Lsc/t;->c:J

    .line 165
    .line 166
    sget v0, Lpc/e;->b:I

    .line 167
    .line 168
    int-to-long v2, v0

    .line 169
    mul-long/2addr p1, v2

    .line 170
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    cmp-long p0, p1, v2

    .line 175
    .line 176
    if-gez p0, :cond_c

    .line 177
    .line 178
    :goto_6
    invoke-virtual {p3}, Lsc/c;->a()V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_b
    move-object v1, p3

    .line 183
    :cond_c
    :goto_7
    return-object v1
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

.method public static final e(Lpc/b;Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2, p3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p7, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1, p2}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, p4, p5}, Lpc/b;->f(J)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget-object v1, Lpc/e;->d:Ld2/h0;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v2, v1}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    if-nez p6, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p1, p2, v2, p6}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_6

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    instance-of v3, v1, Lnc/i2;

    .line 46
    .line 47
    if-eqz v3, :cond_6

    .line 48
    .line 49
    invoke-virtual {p1, p2, v2}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1, p3}, Lpc/b;->G(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    sget-object p0, Lpc/e;->i:Ld2/h0;

    .line 59
    .line 60
    invoke-virtual {p1, p2, p0}, Lpc/k;->o(ILd2/h0;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    sget-object p0, Lpc/e;->k:Ld2/h0;

    .line 66
    .line 67
    iget-object p3, p1, Lpc/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 68
    .line 69
    mul-int/lit8 p4, p2, 0x2

    .line 70
    .line 71
    add-int/2addr p4, v0

    .line 72
    invoke-virtual {p3, p4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-eq p3, p0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p1, p2, v0}, Lpc/k;->l(IZ)V

    .line 79
    .line 80
    .line 81
    :cond_5
    const/4 v0, 0x5

    .line 82
    goto :goto_1

    .line 83
    :cond_6
    :goto_0
    invoke-virtual/range {p0 .. p7}, Lpc/b;->J(Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_1
    return v0
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
.end method


# virtual methods
.method public final A(JLpc/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lpc/k<",
            "TE;>;)V"
        }
    .end annotation

    :goto_0
    iget-wide v0, p3, Lsc/t;->c:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    invoke-virtual {p3}, Lsc/c;->b()Lsc/c;

    move-result-object v0

    check-cast v0, Lpc/k;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p3}, Lsc/t;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Lsc/c;->b()Lsc/c;

    move-result-object p1

    check-cast p1, Lpc/k;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, p1

    goto :goto_1

    :cond_3
    :goto_2
    sget-object p1, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_4
    :goto_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsc/t;

    iget-wide v0, p2, Lsc/t;->c:J

    iget-wide v2, p3, Lsc/t;->c:J

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p3}, Lsc/t;->i()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p1, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v1, v2

    goto :goto_4

    :cond_7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_6

    :goto_4
    if-eqz v1, :cond_9

    invoke-virtual {p2}, Lsc/t;->e()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lsc/c;->d()V

    :cond_8
    :goto_5
    move v1, v2

    :goto_6
    if-eqz v1, :cond_1

    return-void

    :cond_9
    invoke-virtual {p3}, Lsc/t;->e()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p3}, Lsc/c;->d()V

    goto :goto_3
.end method

.method public final B(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnc/l;

    .line 2
    .line 3
    invoke-static {p2}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lnc/l;-><init>(ILub/e;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lnc/l;->t()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lpc/b;->b:Ldc/l;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p2, p1, v1}, Lp2/m0;->k(Ldc/l;Ljava/lang/Object;Ln7/w;)Ln7/w;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, p2}, Lx6/b;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-static {p1}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lnc/l;->s()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object p2, Lvb/a;->a:Lvb/a;

    .line 49
    .line 50
    if-ne p1, p2, :cond_1

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 54
    .line 55
    return-object p1
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

.method public final C(Lub/e;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpc/k;

    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lpc/b;->x()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_11

    .line 14
    .line 15
    sget-object v1, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v8

    .line 21
    sget v1, Lpc/e;->b:I

    .line 22
    .line 23
    int-to-long v1, v1

    .line 24
    div-long v3, v8, v1

    .line 25
    .line 26
    rem-long v1, v8, v1

    .line 27
    .line 28
    long-to-int v1, v1

    .line 29
    iget-wide v5, v0, Lsc/t;->c:J

    .line 30
    .line 31
    cmp-long v2, v5, v3

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v3, v4, v0}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v2

    .line 43
    :cond_2
    const/4 v7, 0x0

    .line 44
    move-object v2, p0

    .line 45
    move-object v3, v0

    .line 46
    move v4, v1

    .line 47
    move-wide v5, v8

    .line 48
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v10, Lpc/e;->m:Ld2/h0;

    .line 53
    .line 54
    const-string v11, "unexpected"

    .line 55
    .line 56
    if-eq v2, v10, :cond_10

    .line 57
    .line 58
    sget-object v12, Lpc/e;->o:Ld2/h0;

    .line 59
    .line 60
    if-ne v2, v12, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    cmp-long v1, v8, v1

    .line 67
    .line 68
    if-gez v1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    sget-object v3, Lpc/e;->n:Ld2/h0;

    .line 75
    .line 76
    if-ne v2, v3, :cond_f

    .line 77
    .line 78
    invoke-static {p1}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lb/a0;->u(Lub/e;)Lnc/l;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v2, p0

    .line 87
    move-object v3, v0

    .line 88
    move v4, v1

    .line 89
    move-wide v5, v8

    .line 90
    move-object v7, p1

    .line 91
    :try_start_0
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-ne v2, v10, :cond_4

    .line 96
    .line 97
    invoke-virtual {p1, v0, v1}, Lnc/l;->c(Lsc/t;I)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_4
    const/4 v1, 0x0

    .line 103
    if-ne v2, v12, :cond_d

    .line 104
    .line 105
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    cmp-long v2, v8, v2

    .line 110
    .line 111
    if-gez v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 114
    .line 115
    .line 116
    :cond_5
    sget-object v0, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lpc/k;

    .line 123
    .line 124
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lpc/b;->x()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lpc/b;->r()Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {p1, v0}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :cond_7
    sget-object v2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 144
    .line 145
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v8

    .line 149
    sget v2, Lpc/e;->b:I

    .line 150
    .line 151
    int-to-long v2, v2

    .line 152
    div-long v4, v8, v2

    .line 153
    .line 154
    rem-long v2, v8, v2

    .line 155
    .line 156
    long-to-int v10, v2

    .line 157
    iget-wide v2, v0, Lsc/t;->c:J

    .line 158
    .line 159
    cmp-long v2, v2, v4

    .line 160
    .line 161
    if-eqz v2, :cond_9

    .line 162
    .line 163
    invoke-virtual {p0, v4, v5, v0}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-nez v2, :cond_8

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_8
    move-object v0, v2

    .line 171
    :cond_9
    move-object v2, p0

    .line 172
    move-object v3, v0

    .line 173
    move v4, v10

    .line 174
    move-wide v5, v8

    .line 175
    move-object v7, p1

    .line 176
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    sget-object v3, Lpc/e;->m:Ld2/h0;

    .line 181
    .line 182
    if-ne v2, v3, :cond_a

    .line 183
    .line 184
    invoke-virtual {p1, v0, v10}, Lnc/l;->c(Lsc/t;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    sget-object v3, Lpc/e;->o:Ld2/h0;

    .line 189
    .line 190
    if-ne v2, v3, :cond_b

    .line 191
    .line 192
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 193
    .line 194
    .line 195
    move-result-wide v2

    .line 196
    cmp-long v2, v8, v2

    .line 197
    .line 198
    if-gez v2, :cond_6

    .line 199
    .line 200
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_b
    sget-object v3, Lpc/e;->n:Ld2/h0;

    .line 205
    .line 206
    if-eq v2, v3, :cond_c

    .line 207
    .line 208
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lpc/b;->b:Ldc/l;

    .line 212
    .line 213
    if-eqz v0, :cond_e

    .line 214
    .line 215
    iget-object v1, p1, Lnc/l;->e:Lub/h;

    .line 216
    .line 217
    new-instance v3, Lsc/o;

    .line 218
    .line 219
    invoke-direct {v3, v0, v2, v1}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_d
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lpc/b;->b:Ldc/l;

    .line 237
    .line 238
    if-eqz v0, :cond_e

    .line 239
    .line 240
    iget-object v1, p1, Lnc/l;->e:Lub/h;

    .line 241
    .line 242
    new-instance v3, Lsc/o;

    .line 243
    .line 244
    invoke-direct {v3, v0, v2, v1}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 245
    .line 246
    .line 247
    :goto_2
    move-object v1, v3

    .line 248
    :cond_e
    invoke-virtual {p1, v2, v1}, Lnc/l;->b(Ljava/lang/Object;Ldc/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    :goto_3
    invoke-virtual {p1}, Lnc/l;->s()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    sget-object p1, Lvb/a;->a:Lvb/a;

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :catchall_0
    move-exception v0

    .line 259
    invoke-virtual {p1}, Lnc/l;->A()V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_f
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 264
    .line 265
    .line 266
    :goto_4
    return-object v2

    .line 267
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 268
    .line 269
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p1

    .line 277
    :cond_11
    invoke-virtual {p0}, Lpc/b;->r()Ljava/lang/Throwable;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    sget v0, Lsc/u;->a:I

    .line 282
    .line 283
    throw p1
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

.method public final E(Lpc/k;IJLub/e;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/k<",
            "TE;>;IJ",
            "Lub/e<",
            "-",
            "Lpc/j<",
            "+TE;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Lpc/b$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lpc/b$e;

    .line 7
    .line 8
    iget v1, v0, Lpc/b$e;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpc/b$e;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpc/b$e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lpc/b$e;-><init>(Lpc/b;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lpc/b$e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lpc/b$e;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p5}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p5}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput v3, v0, Lpc/b$e;->c:I

    .line 59
    .line 60
    invoke-static {v0}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 61
    .line 62
    .line 63
    move-result-object p5

    .line 64
    invoke-static {p5}, Lb/a0;->u(Lub/e;)Lnc/l;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    :try_start_0
    new-instance v0, Lpc/r;

    .line 69
    .line 70
    invoke-direct {v0, p5}, Lpc/r;-><init>(Lnc/l;)V

    .line 71
    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move-object v3, p1

    .line 75
    move v4, p2

    .line 76
    move-wide v5, p3

    .line 77
    move-object v7, v0

    .line 78
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v3, Lpc/e;->m:Ld2/h0;

    .line 83
    .line 84
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0, p1, p2}, Lpc/r;->c(Lsc/t;I)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_3
    sget-object p2, Lpc/e;->o:Ld2/h0;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    if-ne v2, p2, :cond_c

    .line 95
    .line 96
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    cmp-long p2, p3, v2

    .line 101
    .line 102
    if-gez p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p1}, Lsc/c;->a()V

    .line 105
    .line 106
    .line 107
    :cond_4
    sget-object p1, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Lpc/k;

    .line 114
    .line 115
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lpc/b;->x()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance p2, Lpc/j$a;

    .line 126
    .line 127
    invoke-direct {p2, p1}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, Lpc/j;

    .line 131
    .line 132
    invoke-direct {p1, p2}, Lpc/j;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p5, p1}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_6
    sget-object p2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 141
    .line 142
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 143
    .line 144
    .line 145
    move-result-wide p2

    .line 146
    sget p4, Lpc/e;->b:I

    .line 147
    .line 148
    int-to-long v2, p4

    .line 149
    div-long v4, p2, v2

    .line 150
    .line 151
    rem-long v2, p2, v2

    .line 152
    .line 153
    long-to-int p4, v2

    .line 154
    iget-wide v2, p1, Lsc/t;->c:J

    .line 155
    .line 156
    cmp-long v2, v2, v4

    .line 157
    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    invoke-virtual {p0, v4, v5, p1}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-nez v2, :cond_7

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    move-object p1, v2

    .line 168
    :cond_8
    move-object v2, p0

    .line 169
    move-object v3, p1

    .line 170
    move v4, p4

    .line 171
    move-wide v5, p2

    .line 172
    move-object v7, v0

    .line 173
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget-object v3, Lpc/e;->m:Ld2/h0;

    .line 178
    .line 179
    if-ne v2, v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v0, p1, p4}, Lpc/r;->c(Lsc/t;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_9
    sget-object p4, Lpc/e;->o:Ld2/h0;

    .line 186
    .line 187
    if-ne v2, p4, :cond_a

    .line 188
    .line 189
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 190
    .line 191
    .line 192
    move-result-wide v2

    .line 193
    cmp-long p2, p2, v2

    .line 194
    .line 195
    if-gez p2, :cond_5

    .line 196
    .line 197
    invoke-virtual {p1}, Lsc/c;->a()V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_a
    sget-object p2, Lpc/e;->n:Ld2/h0;

    .line 202
    .line 203
    if-eq v2, p2, :cond_b

    .line 204
    .line 205
    invoke-virtual {p1}, Lsc/c;->a()V

    .line 206
    .line 207
    .line 208
    new-instance p1, Lpc/j;

    .line 209
    .line 210
    invoke-direct {p1, v2}, Lpc/j;-><init>(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object p2, p0, Lpc/b;->b:Ldc/l;

    .line 214
    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    iget-object p3, p5, Lnc/l;->e:Lub/h;

    .line 218
    .line 219
    new-instance v8, Lsc/o;

    .line 220
    .line 221
    invoke-direct {v8, p2, v2, p3}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    const-string p2, "unexpected"

    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1

    .line 237
    :cond_c
    invoke-virtual {p1}, Lsc/c;->a()V

    .line 238
    .line 239
    .line 240
    new-instance p1, Lpc/j;

    .line 241
    .line 242
    invoke-direct {p1, v2}, Lpc/j;-><init>(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    iget-object p2, p0, Lpc/b;->b:Ldc/l;

    .line 246
    .line 247
    if-eqz p2, :cond_d

    .line 248
    .line 249
    iget-object p3, p5, Lnc/l;->e:Lub/h;

    .line 250
    .line 251
    new-instance v8, Lsc/o;

    .line 252
    .line 253
    invoke-direct {v8, p2, v2, p3}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 254
    .line 255
    .line 256
    :cond_d
    :goto_2
    invoke-virtual {p5, p1, v8}, Lnc/l;->b(Ljava/lang/Object;Ldc/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    .line 258
    .line 259
    :goto_3
    invoke-virtual {p5}, Lnc/l;->s()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p5

    .line 263
    sget-object p1, Lvb/a;->a:Lvb/a;

    .line 264
    .line 265
    if-ne p5, v1, :cond_e

    .line 266
    .line 267
    return-object v1

    .line 268
    :cond_e
    :goto_4
    check-cast p5, Lpc/j;

    .line 269
    .line 270
    iget-object p1, p5, Lpc/j;->a:Ljava/lang/Object;

    .line 271
    .line 272
    return-object p1

    .line 273
    :catchall_0
    move-exception p1

    .line 274
    invoke-virtual {p5}, Lnc/l;->A()V

    .line 275
    .line 276
    .line 277
    throw p1
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

.method public final F(Lnc/i2;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lpc/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    instance-of v0, p1, Lnc/k;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lub/e;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lpc/b;->r()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    invoke-static {p2}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    instance-of p2, p1, Lpc/r;

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    check-cast p1, Lpc/r;

    .line 33
    .line 34
    iget-object p1, p1, Lpc/r;->a:Lnc/l;

    .line 35
    .line 36
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance v0, Lpc/j$a;

    .line 41
    .line 42
    invoke-direct {v0, p2}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Lpc/j;

    .line 46
    .line 47
    invoke-direct {p2, v0}, Lpc/j;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-interface {p1, p2}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    instance-of p2, p1, Lpc/b$a;

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    check-cast p1, Lpc/b$a;

    .line 59
    .line 60
    iget-object p2, p1, Lpc/b$a;->b:Lnc/l;

    .line 61
    .line 62
    invoke-static {p2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p1, Lpc/b$a;->b:Lnc/l;

    .line 66
    .line 67
    sget-object v0, Lpc/e;->l:Ld2/h0;

    .line 68
    .line 69
    iput-object v0, p1, Lpc/b$a;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object p1, p1, Lpc/b$a;->c:Lpc/b;

    .line 72
    .line 73
    invoke-virtual {p1}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {p1}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_2
    invoke-virtual {p2, p1}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    instance-of p2, p1, Luc/f;

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    check-cast p1, Luc/f;

    .line 95
    .line 96
    sget-object p2, Lpc/e;->l:Ld2/h0;

    .line 97
    .line 98
    invoke-interface {p1, p0, p2}, Luc/f;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :goto_3
    return-void

    .line 102
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v1, "Unexpected waiter: "

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :cond_6
    check-cast p1, Lpc/b$b;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    throw v1
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

.method public final G(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "TE;)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Luc/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Luc/f;

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, Luc/f;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    instance-of v0, p1, Lpc/r;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Lpc/r;

    .line 23
    .line 24
    iget-object p1, p1, Lpc/r;->a:Lnc/l;

    .line 25
    .line 26
    new-instance v0, Lpc/j;

    .line 27
    .line 28
    invoke-direct {v0, p2}, Lpc/j;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lpc/b;->b:Ldc/l;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v1, p1, Lnc/l;->e:Lub/h;

    .line 36
    .line 37
    new-instance v3, Lsc/o;

    .line 38
    .line 39
    invoke-direct {v3, v2, p2, v1}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 40
    .line 41
    .line 42
    move-object v1, v3

    .line 43
    :cond_1
    invoke-static {p1, v0, v1}, Lpc/e;->a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    instance-of v0, p1, Lpc/b$a;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast p1, Lpc/b$a;

    .line 58
    .line 59
    iget-object v0, p1, Lpc/b$a;->b:Lnc/l;

    .line 60
    .line 61
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p1, Lpc/b$a;->b:Lnc/l;

    .line 65
    .line 66
    iput-object p2, p1, Lpc/b$a;->a:Ljava/lang/Object;

    .line 67
    .line 68
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    iget-object p1, p1, Lpc/b$a;->c:Lpc/b;

    .line 71
    .line 72
    iget-object p1, p1, Lpc/b;->b:Ldc/l;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    iget-object v1, v0, Lnc/l;->e:Lub/h;

    .line 77
    .line 78
    new-instance v3, Lsc/o;

    .line 79
    .line 80
    invoke-direct {v3, p1, p2, v1}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v3

    .line 84
    :cond_3
    invoke-static {v0, v2, v1}, Lpc/e;->a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    instance-of v0, p1, Lnc/k;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 94
    .line 95
    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    check-cast p1, Lnc/k;

    .line 99
    .line 100
    iget-object v0, p0, Lpc/b;->b:Ldc/l;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-interface {p1}, Lub/e;->getContext()Lub/h;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v2, Lsc/o;

    .line 109
    .line 110
    invoke-direct {v2, v0, p2, v1}, Lsc/o;-><init>(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v2

    .line 114
    :cond_5
    invoke-static {p1, p2, v1}, Lpc/e;->a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    :goto_0
    return p1

    .line 119
    :cond_6
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v1, "Unexpected receiver type: "

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p2
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

.method public final H(Ljava/lang/Object;Lpc/k;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lpc/k<",
            "TE;>;I)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnc/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    .line 8
    .line 9
    invoke-static {p1, p2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Lnc/k;

    .line 13
    .line 14
    sget-object p2, Lrb/h;->a:Lrb/h;

    .line 15
    .line 16
    invoke-static {p1, p2, v2}, Lpc/e;->a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    instance-of v0, p1, Luc/f;

    .line 22
    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Luc/e;

    .line 31
    .line 32
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Luc/e;->i(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    sget-object v0, Luc/g;->a:Luc/g$a;

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    const/4 v3, 0x2

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    if-eq p1, v1, :cond_2

    .line 45
    .line 46
    if-eq p1, v3, :cond_4

    .line 47
    .line 48
    if-ne p1, v0, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    new-instance p3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v0, "Unexpected internal result: "

    .line 60
    .line 61
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p2

    .line 79
    :cond_2
    move v0, v3

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move v0, v1

    .line 82
    :cond_4
    :goto_0
    if-ne v0, v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {p2, p3, v2}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    if-ne v0, v1, :cond_6

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    const/4 v1, 0x0

    .line 91
    :goto_1
    return v1

    .line 92
    :cond_7
    instance-of p2, p1, Lpc/b$b;

    .line 93
    .line 94
    if-eqz p2, :cond_8

    .line 95
    .line 96
    check-cast p1, Lpc/b$b;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-static {v2, p1, v2}, Lpc/e;->a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z

    .line 104
    .line 105
    .line 106
    throw v2

    .line 107
    :cond_8
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    new-instance p3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v0, "Unexpected waiter: "

    .line 115
    .line 116
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p2
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

.method public final I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/k<",
            "TE;>;IJ",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, 0xfffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v3, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    and-long/2addr v3, v1

    .line 19
    cmp-long v3, p3, v3

    .line 20
    .line 21
    if-ltz v3, :cond_2

    .line 22
    .line 23
    if-nez p5, :cond_0

    .line 24
    .line 25
    sget-object p1, Lpc/e;->n:Ld2/h0;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-virtual {p1, p2, v0, p5}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lpc/e;->m:Ld2/h0;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    sget-object v3, Lpc/e;->d:Ld2/h0;

    .line 41
    .line 42
    if-ne v0, v3, :cond_2

    .line 43
    .line 44
    sget-object v3, Lpc/e;->i:Ld2/h0;

    .line 45
    .line 46
    invoke-virtual {p1, p2, v0, v3}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lpc/k;->m(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_2
    invoke-virtual {p1, p2}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_a

    .line 65
    .line 66
    sget-object v3, Lpc/e;->e:Ld2/h0;

    .line 67
    .line 68
    if-ne v0, v3, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget-object v3, Lpc/e;->d:Ld2/h0;

    .line 72
    .line 73
    if-ne v0, v3, :cond_4

    .line 74
    .line 75
    sget-object v3, Lpc/e;->i:Ld2/h0;

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0, v3}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    sget-object v3, Lpc/e;->j:Ld2/h0;

    .line 85
    .line 86
    if-ne v0, v3, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    sget-object v4, Lpc/e;->h:Ld2/h0;

    .line 90
    .line 91
    if-ne v0, v4, :cond_6

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    sget-object v4, Lpc/e;->l:Ld2/h0;

    .line 95
    .line 96
    if-ne v0, v4, :cond_7

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    sget-object v4, Lpc/e;->g:Ld2/h0;

    .line 100
    .line 101
    if-eq v0, v4, :cond_2

    .line 102
    .line 103
    sget-object v4, Lpc/e;->f:Ld2/h0;

    .line 104
    .line 105
    invoke-virtual {p1, p2, v0, v4}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    instance-of p3, v0, Lpc/u;

    .line 112
    .line 113
    if-eqz p3, :cond_8

    .line 114
    .line 115
    check-cast v0, Lpc/u;

    .line 116
    .line 117
    iget-object v0, v0, Lpc/u;->a:Lnc/i2;

    .line 118
    .line 119
    :cond_8
    invoke-virtual {p0, v0, p1, p2}, Lpc/b;->H(Ljava/lang/Object;Lpc/k;I)Z

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    if-eqz p4, :cond_9

    .line 124
    .line 125
    sget-object p3, Lpc/e;->i:Ld2/h0;

    .line 126
    .line 127
    invoke-virtual {p1, p2, p3}, Lpc/k;->o(ILd2/h0;)V

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lpc/k;->m(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto :goto_4

    .line 138
    :cond_9
    invoke-virtual {p1, p2, v3}, Lpc/k;->o(ILd2/h0;)V

    .line 139
    .line 140
    .line 141
    const/4 p4, 0x0

    .line 142
    invoke-virtual {p1, p2, p4}, Lpc/k;->l(IZ)V

    .line 143
    .line 144
    .line 145
    if-eqz p3, :cond_b

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_a
    :goto_1
    sget-object v3, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 149
    .line 150
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    and-long/2addr v3, v1

    .line 155
    cmp-long v3, p3, v3

    .line 156
    .line 157
    if-gez v3, :cond_c

    .line 158
    .line 159
    sget-object v3, Lpc/e;->h:Ld2/h0;

    .line 160
    .line 161
    invoke-virtual {p1, p2, v0, v3}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_2

    .line 166
    .line 167
    :goto_2
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 168
    .line 169
    .line 170
    :cond_b
    :goto_3
    sget-object p1, Lpc/e;->o:Ld2/h0;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_c
    if-nez p5, :cond_d

    .line 174
    .line 175
    sget-object p1, Lpc/e;->n:Ld2/h0;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_d
    invoke-virtual {p1, p2, v0, p5}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_2

    .line 183
    .line 184
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 185
    .line 186
    .line 187
    sget-object p1, Lpc/e;->m:Ld2/h0;

    .line 188
    .line 189
    :goto_4
    return-object p1
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

.method public final J(Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/k<",
            "TE;>;ITE;J",
            "Ljava/lang/Object;",
            "Z)I"
        }
    .end annotation

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, p4, p5}, Lpc/b;->f(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-nez p7, :cond_1

    .line 18
    .line 19
    sget-object v0, Lpc/e;->d:Ld2/h0;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v3, v0}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return v4

    .line 28
    :cond_1
    if-eqz p7, :cond_2

    .line 29
    .line 30
    sget-object v0, Lpc/e;->j:Ld2/h0;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v3, v0}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, p2, v2}, Lpc/k;->l(IZ)V

    .line 39
    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    if-nez p6, :cond_3

    .line 43
    .line 44
    const/4 p1, 0x3

    .line 45
    return p1

    .line 46
    :cond_3
    invoke-virtual {p1, p2, v3, p6}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/4 p1, 0x2

    .line 53
    return p1

    .line 54
    :cond_4
    sget-object v5, Lpc/e;->e:Ld2/h0;

    .line 55
    .line 56
    if-ne v0, v5, :cond_5

    .line 57
    .line 58
    sget-object v1, Lpc/e;->d:Ld2/h0;

    .line 59
    .line 60
    invoke-virtual {p1, p2, v0, v1}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    return v4

    .line 67
    :cond_5
    sget-object p4, Lpc/e;->k:Ld2/h0;

    .line 68
    .line 69
    const/4 p5, 0x5

    .line 70
    if-ne v0, p4, :cond_6

    .line 71
    .line 72
    invoke-virtual {p1, p2, v3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return p5

    .line 76
    :cond_6
    sget-object p6, Lpc/e;->h:Ld2/h0;

    .line 77
    .line 78
    if-ne v0, p6, :cond_7

    .line 79
    .line 80
    invoke-virtual {p1, p2, v3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return p5

    .line 84
    :cond_7
    sget-object p6, Lpc/e;->l:Ld2/h0;

    .line 85
    .line 86
    if-ne v0, p6, :cond_8

    .line 87
    .line 88
    invoke-virtual {p1, p2, v3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lpc/b;->m()Z

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :cond_8
    invoke-virtual {p1, p2, v3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    instance-of p6, v0, Lpc/u;

    .line 99
    .line 100
    if-eqz p6, :cond_9

    .line 101
    .line 102
    check-cast v0, Lpc/u;

    .line 103
    .line 104
    iget-object v0, v0, Lpc/u;->a:Lnc/i2;

    .line 105
    .line 106
    :cond_9
    invoke-virtual {p0, v0, p3}, Lpc/b;->G(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-eqz p3, :cond_a

    .line 111
    .line 112
    sget-object p3, Lpc/e;->i:Ld2/h0;

    .line 113
    .line 114
    invoke-virtual {p1, p2, p3}, Lpc/k;->o(ILd2/h0;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_a
    iget-object p3, p1, Lpc/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 119
    .line 120
    mul-int/lit8 p6, p2, 0x2

    .line 121
    .line 122
    add-int/2addr p6, v4

    .line 123
    invoke-virtual {p3, p6, p4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eq p3, p4, :cond_b

    .line 128
    .line 129
    invoke-virtual {p1, p2, v4}, Lpc/k;->l(IZ)V

    .line 130
    .line 131
    .line 132
    :cond_b
    move v2, p5

    .line 133
    :goto_0
    return v2
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
.end method

.method public final K(J)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lpc/b;->z()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lpc/b;->p()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmp-long v0, v0, p1

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    sget v0, Lpc/e;->c:I

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move v1, v7

    .line 22
    :goto_0
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-ge v1, v0, :cond_2

    .line 28
    .line 29
    invoke-virtual/range {p0 .. p0}, Lpc/b;->p()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    sget-object v4, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    and-long/2addr v4, v8

    .line 40
    cmp-long v4, v2, v4

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Lpc/b;->p()J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    cmp-long v2, v2, v4

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    sget-object v10, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v10, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    and-long v0, v2, v8

    .line 63
    .line 64
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 65
    .line 66
    add-long v4, v11, v0

    .line 67
    .line 68
    move-object v0, v10

    .line 69
    move-object/from16 v1, p0

    .line 70
    .line 71
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    :cond_4
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lpc/b;->p()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    sget-object v10, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 82
    .line 83
    invoke-virtual {v10, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    and-long v4, v2, v8

    .line 88
    .line 89
    and-long v13, v2, v11

    .line 90
    .line 91
    const-wide/16 v15, 0x0

    .line 92
    .line 93
    cmp-long v13, v13, v15

    .line 94
    .line 95
    if-eqz v13, :cond_5

    .line 96
    .line 97
    const/4 v13, 0x1

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move v13, v7

    .line 100
    :goto_2
    cmp-long v14, v0, v4

    .line 101
    .line 102
    if-nez v14, :cond_7

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p0}, Lpc/b;->p()J

    .line 105
    .line 106
    .line 107
    move-result-wide v17

    .line 108
    cmp-long v0, v0, v17

    .line 109
    .line 110
    if-nez v0, :cond_7

    .line 111
    .line 112
    :cond_6
    invoke-virtual {v10, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    and-long v0, v2, v8

    .line 117
    .line 118
    add-long v4, v15, v0

    .line 119
    .line 120
    move-object v0, v10

    .line 121
    move-object/from16 v1, p0

    .line 122
    .line 123
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    return-void

    .line 130
    :cond_7
    if-nez v13, :cond_4

    .line 131
    .line 132
    add-long/2addr v4, v11

    .line 133
    move-object v0, v10

    .line 134
    move-object/from16 v1, p0

    .line 135
    .line 136
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1
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

.method public final a(Lpc/o$b;)V
    .locals 7

    .line 1
    sget-object v0, Lpc/b;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    :cond_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    sget-object v0, Lpc/b;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v4, Lpc/e;->q:Ld2/h0;

    .line 31
    .line 32
    if-ne v1, v4, :cond_6

    .line 33
    .line 34
    sget-object v5, Lpc/b;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 35
    .line 36
    sget-object v6, Lpc/e;->r:Ld2/h0;

    .line 37
    .line 38
    :cond_4
    invoke-virtual {v5, p0, v4, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    move v1, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_5
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eq v1, v4, :cond_4

    .line 51
    .line 52
    move v1, v2

    .line 53
    :goto_1
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Lpc/o$b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_6
    sget-object p1, Lpc/e;->r:Ld2/h0;

    .line 64
    .line 65
    if-ne v1, p1, :cond_7

    .line 66
    .line 67
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v0, "Another handler was already registered and successfully invoked"

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v2, "Another handler is already registered: "

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
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

.method public final c()Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-object v2, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-virtual {p0, v2, v3, v4}, Lpc/b;->w(JZ)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lpc/j$a;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const-wide v4, 0xfffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v2, v4

    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-ltz v0, :cond_1

    .line 39
    .line 40
    sget-object v0, Lpc/j;->b:Lpc/j$b;

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    sget-object v0, Lpc/e;->k:Ld2/h0;

    .line 44
    .line 45
    sget-object v1, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lpc/k;

    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0}, Lpc/b;->x()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Lpc/j$a;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    sget-object v2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 70
    .line 71
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    sget v2, Lpc/e;->b:I

    .line 76
    .line 77
    int-to-long v2, v2

    .line 78
    div-long v4, v7, v2

    .line 79
    .line 80
    rem-long v2, v7, v2

    .line 81
    .line 82
    long-to-int v9, v2

    .line 83
    iget-wide v2, v1, Lsc/t;->c:J

    .line 84
    .line 85
    cmp-long v2, v2, v4

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v4, v5, v1}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move-object v10, v2

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    move-object v10, v1

    .line 99
    :goto_1
    move-object v1, p0

    .line 100
    move-object v2, v10

    .line 101
    move v3, v9

    .line 102
    move-wide v4, v7

    .line 103
    move-object v6, v0

    .line 104
    invoke-virtual/range {v1 .. v6}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    sget-object v2, Lpc/e;->m:Ld2/h0;

    .line 109
    .line 110
    if-ne v1, v2, :cond_7

    .line 111
    .line 112
    instance-of v1, v0, Lnc/i2;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    check-cast v0, Lnc/i2;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const/4 v0, 0x0

    .line 120
    :goto_2
    if-eqz v0, :cond_6

    .line 121
    .line 122
    invoke-interface {v0, v10, v9}, Lnc/i2;->c(Lsc/t;I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    invoke-virtual {p0, v7, v8}, Lpc/b;->K(J)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v10}, Lsc/t;->h()V

    .line 129
    .line 130
    .line 131
    sget-object v1, Lpc/j;->b:Lpc/j$b;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    sget-object v2, Lpc/e;->o:Ld2/h0;

    .line 135
    .line 136
    if-ne v1, v2, :cond_9

    .line 137
    .line 138
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    cmp-long v1, v7, v1

    .line 143
    .line 144
    if-gez v1, :cond_8

    .line 145
    .line 146
    invoke-virtual {v10}, Lsc/c;->a()V

    .line 147
    .line 148
    .line 149
    :cond_8
    move-object v1, v10

    .line 150
    goto :goto_0

    .line 151
    :cond_9
    sget-object v0, Lpc/e;->n:Ld2/h0;

    .line 152
    .line 153
    if-eq v1, v0, :cond_a

    .line 154
    .line 155
    invoke-virtual {v10}, Lsc/c;->a()V

    .line 156
    .line 157
    .line 158
    :goto_3
    return-object v1

    .line 159
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v1, "unexpected"

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0
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

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Channel was cancelled"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lpc/b;->g(Ljava/lang/Throwable;Z)Z

    return-void
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lpc/b;->g(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method public final f(J)Z
    .locals 4

    invoke-virtual {p0}, Lpc/b;->p()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lpc/b;->s()J

    move-result-wide v0

    iget v2, p0, Lpc/b;->a:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final g(Ljava/lang/Throwable;Z)Z
    .locals 15

    .line 1
    move-object v6, p0

    .line 2
    const-wide v7, 0xfffffffffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const/16 v9, 0x3c

    .line 8
    .line 9
    const/4 v10, 0x1

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    sget-object v11, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v11, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    shr-long v0, v2, v9

    .line 19
    .line 20
    long-to-int v0, v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    and-long v0, v2, v7

    .line 24
    .line 25
    sget-object v4, Lpc/e;->a:Lpc/k;

    .line 26
    .line 27
    int-to-long v4, v10

    .line 28
    shl-long/2addr v4, v9

    .line 29
    add-long/2addr v4, v0

    .line 30
    move-object v0, v11

    .line 31
    move-object v1, p0

    .line 32
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    :cond_1
    sget-object v0, Lpc/b;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 39
    .line 40
    sget-object v1, Lpc/e;->s:Ld2/h0;

    .line 41
    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    :cond_2
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v11, 0x0

    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    move v12, v10

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eq v3, v1, :cond_2

    .line 58
    .line 59
    move v12, v11

    .line 60
    :goto_0
    const/4 v13, 0x3

    .line 61
    if-eqz p2, :cond_5

    .line 62
    .line 63
    sget-object v14, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 64
    .line 65
    :cond_4
    invoke-virtual {v14, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    and-long v0, v2, v7

    .line 70
    .line 71
    sget-object v4, Lpc/e;->a:Lpc/k;

    .line 72
    .line 73
    int-to-long v4, v13

    .line 74
    shl-long/2addr v4, v9

    .line 75
    add-long/2addr v4, v0

    .line 76
    move-object v0, v14

    .line 77
    move-object v1, p0

    .line 78
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    sget-object v14, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 86
    .line 87
    :cond_6
    invoke-virtual {v14, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    shr-long v0, v2, v9

    .line 92
    .line 93
    long-to-int v0, v0

    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    if-eq v0, v10, :cond_7

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    and-long v0, v2, v7

    .line 100
    .line 101
    sget-object v4, Lpc/e;->a:Lpc/k;

    .line 102
    .line 103
    move v4, v13

    .line 104
    goto :goto_1

    .line 105
    :cond_8
    and-long v0, v2, v7

    .line 106
    .line 107
    const/4 v4, 0x2

    .line 108
    sget-object v5, Lpc/e;->a:Lpc/k;

    .line 109
    .line 110
    :goto_1
    int-to-long v4, v4

    .line 111
    shl-long/2addr v4, v9

    .line 112
    add-long/2addr v4, v0

    .line 113
    move-object v0, v14

    .line 114
    move-object v1, p0

    .line 115
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    :goto_2
    invoke-virtual {p0}, Lpc/b;->m()Z

    .line 122
    .line 123
    .line 124
    if-eqz v12, :cond_e

    .line 125
    .line 126
    sget-object v0, Lpc/b;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 127
    .line 128
    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v1, :cond_a

    .line 133
    .line 134
    sget-object v2, Lpc/e;->q:Ld2/h0;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    sget-object v2, Lpc/e;->r:Ld2/h0;

    .line 138
    .line 139
    :cond_b
    :goto_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_c

    .line 144
    .line 145
    move v2, v10

    .line 146
    goto :goto_4

    .line 147
    :cond_c
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-eq v3, v1, :cond_b

    .line 152
    .line 153
    move v2, v11

    .line 154
    :goto_4
    if-eqz v2, :cond_9

    .line 155
    .line 156
    if-nez v1, :cond_d

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_d
    invoke-static {v10, v1}, Lec/v;->a(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    check-cast v1, Ldc/l;

    .line 163
    .line 164
    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v1, v0}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    :cond_e
    :goto_5
    return v12
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

.method public final h(J)Lpc/k;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lpc/k<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lpc/k;

    .line 14
    .line 15
    iget-wide v2, v1, Lsc/t;->c:J

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Lpc/k;

    .line 19
    .line 20
    iget-wide v4, v4, Lsc/t;->c:J

    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-lez v2, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    sget-object v1, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lpc/k;

    .line 34
    .line 35
    iget-wide v2, v1, Lsc/t;->c:J

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Lpc/k;

    .line 39
    .line 40
    iget-wide v4, v4, Lsc/t;->c:J

    .line 41
    .line 42
    cmp-long v2, v2, v4

    .line 43
    .line 44
    if-lez v2, :cond_1

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_1
    check-cast v0, Lsc/c;

    .line 48
    .line 49
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v1, Lsc/c;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v3, Lp2/m0;->C:Ld2/h0;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    const/4 v5, 0x0

    .line 62
    if-ne v2, v3, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    check-cast v2, Lsc/c;

    .line 66
    .line 67
    if-nez v2, :cond_16

    .line 68
    .line 69
    :cond_4
    invoke-virtual {v1, v0, v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    move v1, v4

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    :goto_1
    if-eqz v1, :cond_2

    .line 85
    .line 86
    :goto_2
    check-cast v0, Lpc/k;

    .line 87
    .line 88
    invoke-virtual {p0}, Lpc/b;->y()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v2, -0x1

    .line 93
    if-eqz v1, :cond_c

    .line 94
    .line 95
    move-object v1, v0

    .line 96
    :cond_6
    sget v3, Lpc/e;->b:I

    .line 97
    .line 98
    add-int/2addr v3, v2

    .line 99
    :goto_3
    const-wide/16 v6, -0x1

    .line 100
    .line 101
    if-ge v2, v3, :cond_b

    .line 102
    .line 103
    iget-wide v8, v1, Lsc/t;->c:J

    .line 104
    .line 105
    sget v10, Lpc/e;->b:I

    .line 106
    .line 107
    int-to-long v10, v10

    .line 108
    mul-long/2addr v8, v10

    .line 109
    int-to-long v10, v3

    .line 110
    add-long/2addr v8, v10

    .line 111
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    cmp-long v10, v8, v10

    .line 116
    .line 117
    if-gez v10, :cond_7

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    invoke-virtual {v1, v3}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    sget-object v11, Lpc/e;->e:Ld2/h0;

    .line 127
    .line 128
    if-ne v10, v11, :cond_8

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    sget-object v11, Lpc/e;->d:Ld2/h0;

    .line 132
    .line 133
    if-ne v10, v11, :cond_a

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    :goto_4
    sget-object v11, Lpc/e;->l:Ld2/h0;

    .line 137
    .line 138
    invoke-virtual {v1, v3, v10, v11}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_7

    .line 143
    .line 144
    invoke-virtual {v1}, Lsc/t;->h()V

    .line 145
    .line 146
    .line 147
    :cond_a
    add-int/lit8 v3, v3, -0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_b
    sget-object v3, Lsc/c;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Lsc/c;

    .line 157
    .line 158
    check-cast v1, Lpc/k;

    .line 159
    .line 160
    if-nez v1, :cond_6

    .line 161
    .line 162
    :goto_5
    move-wide v8, v6

    .line 163
    :goto_6
    cmp-long v1, v8, v6

    .line 164
    .line 165
    if-eqz v1, :cond_c

    .line 166
    .line 167
    invoke-virtual {p0, v8, v9}, Lpc/b;->j(J)V

    .line 168
    .line 169
    .line 170
    :cond_c
    move-object v1, v0

    .line 171
    :goto_7
    if-eqz v1, :cond_13

    .line 172
    .line 173
    sget v3, Lpc/e;->b:I

    .line 174
    .line 175
    sub-int/2addr v3, v4

    .line 176
    :goto_8
    if-ge v2, v3, :cond_12

    .line 177
    .line 178
    iget-wide v6, v1, Lsc/t;->c:J

    .line 179
    .line 180
    sget v8, Lpc/e;->b:I

    .line 181
    .line 182
    int-to-long v8, v8

    .line 183
    mul-long/2addr v6, v8

    .line 184
    int-to-long v8, v3

    .line 185
    add-long/2addr v6, v8

    .line 186
    cmp-long v6, v6, p1

    .line 187
    .line 188
    if-ltz v6, :cond_13

    .line 189
    .line 190
    :cond_d
    invoke-virtual {v1, v3}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    if-eqz v6, :cond_10

    .line 195
    .line 196
    sget-object v7, Lpc/e;->e:Ld2/h0;

    .line 197
    .line 198
    if-ne v6, v7, :cond_e

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_e
    instance-of v7, v6, Lpc/u;

    .line 202
    .line 203
    if-eqz v7, :cond_f

    .line 204
    .line 205
    sget-object v7, Lpc/e;->l:Ld2/h0;

    .line 206
    .line 207
    invoke-virtual {v1, v3, v6, v7}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_d

    .line 212
    .line 213
    check-cast v6, Lpc/u;

    .line 214
    .line 215
    iget-object v6, v6, Lpc/u;->a:Lnc/i2;

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_f
    instance-of v7, v6, Lnc/i2;

    .line 219
    .line 220
    if-eqz v7, :cond_11

    .line 221
    .line 222
    sget-object v7, Lpc/e;->l:Ld2/h0;

    .line 223
    .line 224
    invoke-virtual {v1, v3, v6, v7}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_d

    .line 229
    .line 230
    :goto_9
    invoke-static {v5, v6}, Lb/a0;->z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v1, v3, v4}, Lpc/k;->l(IZ)V

    .line 235
    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_10
    :goto_a
    sget-object v7, Lpc/e;->l:Ld2/h0;

    .line 239
    .line 240
    invoke-virtual {v1, v3, v6, v7}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_d

    .line 245
    .line 246
    invoke-virtual {v1}, Lsc/t;->h()V

    .line 247
    .line 248
    .line 249
    :cond_11
    :goto_b
    add-int/lit8 v3, v3, -0x1

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_12
    sget-object v3, Lsc/c;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 253
    .line 254
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Lsc/c;

    .line 259
    .line 260
    check-cast v1, Lpc/k;

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_13
    if-eqz v5, :cond_15

    .line 264
    .line 265
    instance-of p1, v5, Ljava/util/ArrayList;

    .line 266
    .line 267
    if-nez p1, :cond_14

    .line 268
    .line 269
    check-cast v5, Lnc/i2;

    .line 270
    .line 271
    invoke-virtual {p0, v5, v4}, Lpc/b;->F(Lnc/i2;Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_14
    check-cast v5, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    sub-int/2addr p1, v4

    .line 282
    :goto_c
    if-ge v2, p1, :cond_15

    .line 283
    .line 284
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    check-cast p2, Lnc/i2;

    .line 289
    .line 290
    invoke-virtual {p0, p2, v4}, Lpc/b;->F(Lnc/i2;Z)V

    .line 291
    .line 292
    .line 293
    add-int/lit8 p1, p1, -0x1

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_15
    :goto_d
    return-object v0

    .line 297
    :cond_16
    move-object v0, v2

    .line 298
    goto/16 :goto_0
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

.method public final i(Lrc/j;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lpc/b;->D(Lpc/b;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Lpc/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpc/h<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lpc/b$a;

    invoke-direct {v0, p0}, Lpc/b$a;-><init>(Lpc/b;)V

    return-object v0
.end method

.method public final j(J)V
    .locals 10

    .line 1
    sget-object v0, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpc/k;

    .line 8
    .line 9
    :cond_0
    :goto_0
    sget-object v1, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v8

    .line 15
    iget v2, p0, Lpc/b;->a:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    add-long/2addr v2, v8

    .line 19
    invoke-virtual {p0}, Lpc/b;->p()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v2, p1, v2

    .line 28
    .line 29
    if-gez v2, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    add-long v5, v8, v2

    .line 35
    .line 36
    move-object v2, p0

    .line 37
    move-wide v3, v8

    .line 38
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    sget v1, Lpc/e;->b:I

    .line 45
    .line 46
    int-to-long v1, v1

    .line 47
    div-long v3, v8, v1

    .line 48
    .line 49
    rem-long v1, v8, v1

    .line 50
    .line 51
    long-to-int v1, v1

    .line 52
    iget-wide v5, v0, Lsc/t;->c:J

    .line 53
    .line 54
    cmp-long v2, v5, v3

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, v3, v4, v0}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v0, v2

    .line 66
    :cond_3
    const/4 v7, 0x0

    .line 67
    move-object v2, p0

    .line 68
    move-object v3, v0

    .line 69
    move v4, v1

    .line 70
    move-wide v5, v8

    .line 71
    invoke-virtual/range {v2 .. v7}, Lpc/b;->I(Lpc/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v2, Lpc/e;->o:Ld2/h0;

    .line 76
    .line 77
    if-ne v1, v2, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    cmp-long v1, v8, v1

    .line 84
    .line 85
    if-gez v1, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lpc/b;->b:Ldc/l;

    .line 95
    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-static {v2, v1, v3}, Lp2/m0;->k(Ldc/l;Ljava/lang/Object;Ln7/w;)Ln7/w;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    throw v1
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

.method public k(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    sget-object v0, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lpc/k;

    .line 10
    .line 11
    :cond_0
    :goto_0
    sget-object v1, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const-wide v10, 0xfffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long v12, v1, v10

    .line 23
    .line 24
    const/4 v14, 0x0

    .line 25
    invoke-virtual {v9, v1, v2, v14}, Lpc/b;->w(JZ)Z

    .line 26
    .line 27
    .line 28
    move-result v15

    .line 29
    sget v8, Lpc/e;->b:I

    .line 30
    .line 31
    int-to-long v1, v8

    .line 32
    div-long v3, v12, v1

    .line 33
    .line 34
    rem-long v1, v12, v1

    .line 35
    .line 36
    long-to-int v7, v1

    .line 37
    iget-wide v1, v0, Lsc/t;->c:J

    .line 38
    .line 39
    cmp-long v1, v1, v3

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-static {v9, v3, v4, v0}, Lpc/b;->b(Lpc/b;JLpc/k;)Lpc/k;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    if-eqz v15, :cond_0

    .line 50
    .line 51
    invoke-virtual/range {p0 .. p2}, Lpc/b;->B(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 56
    .line 57
    if-ne v0, v1, :cond_1a

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_1
    move-object v0, v1

    .line 62
    :cond_2
    const/16 v16, 0x0

    .line 63
    .line 64
    move-object/from16 v1, p0

    .line 65
    .line 66
    move-object v2, v0

    .line 67
    move v3, v7

    .line 68
    move-object/from16 v4, p1

    .line 69
    .line 70
    move-wide v5, v12

    .line 71
    move/from16 v17, v7

    .line 72
    .line 73
    move-object/from16 v7, v16

    .line 74
    .line 75
    move/from16 v16, v8

    .line 76
    .line 77
    move v8, v15

    .line 78
    invoke-static/range {v1 .. v8}, Lpc/b;->e(Lpc/b;Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_19

    .line 83
    .line 84
    const/4 v8, 0x1

    .line 85
    if-eq v1, v8, :cond_1a

    .line 86
    .line 87
    const/4 v7, 0x2

    .line 88
    if-eq v1, v7, :cond_18

    .line 89
    .line 90
    const/4 v15, 0x4

    .line 91
    const/4 v5, 0x3

    .line 92
    const/4 v6, 0x5

    .line 93
    if-eq v1, v5, :cond_6

    .line 94
    .line 95
    if-eq v1, v15, :cond_4

    .line 96
    .line 97
    if-eq v1, v6, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lpc/b;->s()J

    .line 105
    .line 106
    .line 107
    move-result-wide v1

    .line 108
    cmp-long v1, v12, v1

    .line 109
    .line 110
    if-gez v1, :cond_5

    .line 111
    .line 112
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-virtual/range {p0 .. p2}, Lpc/b;->B(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 120
    .line 121
    if-ne v0, v1, :cond_1a

    .line 122
    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_6
    invoke-static/range {p2 .. p2}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, Lb/a0;->u(Lub/e;)Lnc/l;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    move-object/from16 v1, p0

    .line 136
    .line 137
    move-object v2, v0

    .line 138
    move/from16 v3, v17

    .line 139
    .line 140
    move-object/from16 p2, v4

    .line 141
    .line 142
    move-object/from16 v4, p1

    .line 143
    .line 144
    move v14, v6

    .line 145
    move-wide v5, v12

    .line 146
    move v10, v7

    .line 147
    move-object/from16 v7, p2

    .line 148
    .line 149
    move v11, v8

    .line 150
    move/from16 v8, v18

    .line 151
    .line 152
    :try_start_0
    invoke-static/range {v1 .. v8}, Lpc/b;->e(Lpc/b;Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 153
    .line 154
    .line 155
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 156
    if-eqz v1, :cond_16

    .line 157
    .line 158
    if-eq v1, v11, :cond_15

    .line 159
    .line 160
    if-eq v1, v10, :cond_14

    .line 161
    .line 162
    if-eq v1, v15, :cond_11

    .line 163
    .line 164
    const-string v12, "unexpected"

    .line 165
    .line 166
    if-ne v1, v14, :cond_10

    .line 167
    .line 168
    :try_start_1
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 169
    .line 170
    .line 171
    sget-object v0, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 172
    .line 173
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lpc/k;

    .line 178
    .line 179
    :cond_7
    :goto_1
    sget-object v1, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 180
    .line 181
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v1

    .line 185
    const-wide v16, 0xfffffffffffffffL

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    and-long v20, v1, v16

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    invoke-virtual {v9, v1, v2, v13}, Lpc/b;->w(JZ)Z

    .line 194
    .line 195
    .line 196
    move-result v18

    .line 197
    sget v8, Lpc/e;->b:I

    .line 198
    .line 199
    int-to-long v1, v8

    .line 200
    div-long v3, v20, v1

    .line 201
    .line 202
    rem-long v1, v20, v1

    .line 203
    .line 204
    long-to-int v7, v1

    .line 205
    iget-wide v1, v0, Lsc/t;->c:J

    .line 206
    .line 207
    cmp-long v1, v1, v3

    .line 208
    .line 209
    if-eqz v1, :cond_9

    .line 210
    .line 211
    invoke-static {v9, v3, v4, v0}, Lpc/b;->b(Lpc/b;JLpc/k;)Lpc/k;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    if-nez v1, :cond_8

    .line 216
    .line 217
    if-eqz v18, :cond_7

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_8
    move-object v0, v1

    .line 221
    :cond_9
    move-object/from16 v1, p0

    .line 222
    .line 223
    move-object v2, v0

    .line 224
    move v3, v7

    .line 225
    move-object/from16 v4, p1

    .line 226
    .line 227
    move-wide/from16 v5, v20

    .line 228
    .line 229
    move/from16 v19, v7

    .line 230
    .line 231
    move-object/from16 v7, p2

    .line 232
    .line 233
    move/from16 v22, v8

    .line 234
    .line 235
    move/from16 v8, v18

    .line 236
    .line 237
    invoke-static/range {v1 .. v8}, Lpc/b;->e(Lpc/b;Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_16

    .line 242
    .line 243
    if-eq v1, v11, :cond_15

    .line 244
    .line 245
    if-eq v1, v10, :cond_d

    .line 246
    .line 247
    const/4 v2, 0x3

    .line 248
    if-eq v1, v2, :cond_c

    .line 249
    .line 250
    if-eq v1, v15, :cond_b

    .line 251
    .line 252
    if-eq v1, v14, :cond_a

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_a
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_b
    invoke-virtual/range {p0 .. p0}, Lpc/b;->s()J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    cmp-long v1, v20, v1

    .line 264
    .line 265
    if-gez v1, :cond_e

    .line 266
    .line 267
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 272
    .line 273
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_d
    if-eqz v18, :cond_f

    .line 282
    .line 283
    invoke-virtual {v0}, Lsc/t;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 284
    .line 285
    .line 286
    :cond_e
    :goto_2
    move-object/from16 v1, p2

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_f
    add-int v7, v19, v22

    .line 290
    .line 291
    move-object/from16 v1, p2

    .line 292
    .line 293
    :try_start_2
    invoke-virtual {v1, v0, v7}, Lnc/l;->c(Lsc/t;I)V

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :catchall_0
    move-exception v0

    .line 298
    goto :goto_7

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    move-object/from16 v1, p2

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_10
    move-object/from16 v1, p2

    .line 304
    .line 305
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 306
    .line 307
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :cond_11
    move-object/from16 v1, p2

    .line 316
    .line 317
    invoke-virtual/range {p0 .. p0}, Lpc/b;->s()J

    .line 318
    .line 319
    .line 320
    move-result-wide v2

    .line 321
    cmp-long v2, v12, v2

    .line 322
    .line 323
    if-gez v2, :cond_12

    .line 324
    .line 325
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 326
    .line 327
    .line 328
    :cond_12
    :goto_3
    iget-object v0, v9, Lpc/b;->b:Ldc/l;

    .line 329
    .line 330
    if-eqz v0, :cond_13

    .line 331
    .line 332
    iget-object v2, v1, Lnc/l;->e:Lub/h;

    .line 333
    .line 334
    move-object/from16 v3, p1

    .line 335
    .line 336
    invoke-static {v0, v3, v2}, Lp2/m0;->j(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 337
    .line 338
    .line 339
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-static {v0}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v1, v0}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_14
    move-object/from16 v1, p2

    .line 352
    .line 353
    add-int v7, v17, v16

    .line 354
    .line 355
    invoke-virtual {v1, v0, v7}, Lnc/l;->c(Lsc/t;I)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_15
    move-object/from16 v1, p2

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_16
    move-object/from16 v1, p2

    .line 363
    .line 364
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 365
    .line 366
    .line 367
    :goto_4
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 368
    .line 369
    invoke-virtual {v1, v0}, Lnc/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 370
    .line 371
    .line 372
    :goto_5
    invoke-virtual {v1}, Lnc/l;->s()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 377
    .line 378
    if-ne v0, v1, :cond_17

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_17
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 382
    .line 383
    :goto_6
    if-ne v0, v1, :cond_1a

    .line 384
    .line 385
    goto :goto_8

    .line 386
    :goto_7
    invoke-virtual {v1}, Lnc/l;->A()V

    .line 387
    .line 388
    .line 389
    throw v0

    .line 390
    :cond_18
    move-object/from16 v3, p1

    .line 391
    .line 392
    if-eqz v15, :cond_1a

    .line 393
    .line 394
    invoke-virtual {v0}, Lsc/t;->h()V

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {p0 .. p2}, Lpc/b;->B(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 402
    .line 403
    if-ne v0, v1, :cond_1a

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_19
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 407
    .line 408
    .line 409
    :cond_1a
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 410
    .line 411
    :goto_8
    return-object v0
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

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    sget-object v0, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const/4 v9, 0x0

    .line 10
    invoke-virtual {v8, v0, v1, v9}, Lpc/b;->w(JZ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v10, 0x1

    .line 15
    const-wide v11, 0xfffffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move v0, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-long/2addr v0, v11

    .line 25
    invoke-virtual {v8, v0, v1}, Lpc/b;->f(J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    xor-int/2addr v0, v10

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget-object v0, Lpc/j;->b:Lpc/j$b;

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    sget-object v13, Lpc/e;->j:Ld2/h0;

    .line 36
    .line 37
    sget-object v0, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 38
    .line 39
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lpc/k;

    .line 44
    .line 45
    :cond_2
    :goto_1
    sget-object v1, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    and-long v14, v1, v11

    .line 52
    .line 53
    invoke-virtual {v8, v1, v2, v9}, Lpc/b;->w(JZ)Z

    .line 54
    .line 55
    .line 56
    move-result v16

    .line 57
    sget v7, Lpc/e;->b:I

    .line 58
    .line 59
    int-to-long v1, v7

    .line 60
    div-long v3, v14, v1

    .line 61
    .line 62
    rem-long v1, v14, v1

    .line 63
    .line 64
    long-to-int v6, v1

    .line 65
    iget-wide v1, v0, Lsc/t;->c:J

    .line 66
    .line 67
    cmp-long v1, v1, v3

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-static {v8, v3, v4, v0}, Lpc/b;->b(Lpc/b;JLpc/k;)Lpc/k;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    if-eqz v16, :cond_2

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lpc/j$a;

    .line 84
    .line 85
    invoke-direct {v1, v0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_3
    move-object v4, v1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move-object v4, v0

    .line 93
    :goto_2
    move-object/from16 v0, p0

    .line 94
    .line 95
    move-object v1, v4

    .line 96
    move v2, v6

    .line 97
    move-object/from16 v3, p1

    .line 98
    .line 99
    move-object/from16 v17, v4

    .line 100
    .line 101
    move-wide v4, v14

    .line 102
    move/from16 v18, v6

    .line 103
    .line 104
    move-object v6, v13

    .line 105
    move/from16 v19, v7

    .line 106
    .line 107
    move/from16 v7, v16

    .line 108
    .line 109
    invoke-static/range {v0 .. v7}, Lpc/b;->e(Lpc/b;Lpc/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_d

    .line 114
    .line 115
    if-eq v0, v10, :cond_e

    .line 116
    .line 117
    const/4 v1, 0x2

    .line 118
    if-eq v0, v1, :cond_9

    .line 119
    .line 120
    const/4 v1, 0x3

    .line 121
    if-eq v0, v1, :cond_8

    .line 122
    .line 123
    const/4 v1, 0x4

    .line 124
    if-eq v0, v1, :cond_6

    .line 125
    .line 126
    const/4 v1, 0x5

    .line 127
    if-eq v0, v1, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    invoke-virtual/range {v17 .. v17}, Lsc/c;->a()V

    .line 131
    .line 132
    .line 133
    :goto_3
    move-object/from16 v0, v17

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lpc/b;->s()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    cmp-long v0, v14, v0

    .line 141
    .line 142
    if-gez v0, :cond_7

    .line 143
    .line 144
    invoke-virtual/range {v17 .. v17}, Lsc/c;->a()V

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-instance v1, Lpc/j$a;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v1, "unexpected"

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_9
    if-eqz v16, :cond_a

    .line 170
    .line 171
    invoke-virtual/range {v17 .. v17}, Lsc/t;->h()V

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {p0 .. p0}, Lpc/b;->t()Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    new-instance v1, Lpc/j$a;

    .line 179
    .line 180
    invoke-direct {v1, v0}, Lpc/j$a;-><init>(Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    instance-of v0, v13, Lnc/i2;

    .line 185
    .line 186
    if-eqz v0, :cond_b

    .line 187
    .line 188
    check-cast v13, Lnc/i2;

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_b
    const/4 v13, 0x0

    .line 192
    :goto_4
    if-eqz v13, :cond_c

    .line 193
    .line 194
    add-int v6, v18, v19

    .line 195
    .line 196
    move-object/from16 v0, v17

    .line 197
    .line 198
    invoke-interface {v13, v0, v6}, Lnc/i2;->c(Lsc/t;I)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_c
    move-object/from16 v0, v17

    .line 203
    .line 204
    :goto_5
    invoke-virtual {v0}, Lsc/t;->h()V

    .line 205
    .line 206
    .line 207
    sget-object v1, Lpc/j;->b:Lpc/j$b;

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_d
    move-object/from16 v0, v17

    .line 211
    .line 212
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 213
    .line 214
    .line 215
    :cond_e
    sget-object v1, Lrb/h;->a:Lrb/h;

    .line 216
    .line 217
    :goto_6
    return-object v1
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

.method public final m()Z
    .locals 3

    sget-object v0, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lpc/b;->w(JZ)Z

    move-result v0

    return v0
.end method

.method public final n()V
    .locals 15

    .line 1
    move-object v6, p0

    .line 2
    invoke-virtual {p0}, Lpc/b;->z()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lpc/k;

    .line 16
    .line 17
    move-object v7, v0

    .line 18
    :cond_1
    :goto_0
    sget-object v0, Lpc/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    sget v0, Lpc/e;->b:I

    .line 25
    .line 26
    int-to-long v0, v0

    .line 27
    div-long v0, v8, v0

    .line 28
    .line 29
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    cmp-long v2, v2, v8

    .line 34
    .line 35
    const-wide/16 v10, 0x1

    .line 36
    .line 37
    if-gtz v2, :cond_3

    .line 38
    .line 39
    iget-wide v2, v7, Lsc/t;->c:J

    .line 40
    .line 41
    cmp-long v2, v2, v0

    .line 42
    .line 43
    if-gez v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v7}, Lsc/c;->b()Lsc/c;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0, v0, v1, v7}, Lpc/b;->A(JLpc/k;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0, v10, v11}, Lpc/b;->v(J)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    iget-wide v2, v7, Lsc/t;->c:J

    .line 59
    .line 60
    cmp-long v2, v2, v0

    .line 61
    .line 62
    if-eqz v2, :cond_10

    .line 63
    .line 64
    sget-object v2, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 65
    .line 66
    sget-object v3, Lpc/d;->a:Lpc/d;

    .line 67
    .line 68
    :goto_1
    invoke-static {v7, v0, v1, v3}, Lp2/m0;->F(Lsc/t;JLdc/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_b

    .line 77
    .line 78
    invoke-static {v4}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    :goto_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    check-cast v14, Lsc/t;

    .line 87
    .line 88
    iget-wide v12, v14, Lsc/t;->c:J

    .line 89
    .line 90
    iget-wide v10, v5, Lsc/t;->c:J

    .line 91
    .line 92
    cmp-long v10, v12, v10

    .line 93
    .line 94
    if-ltz v10, :cond_4

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    invoke-virtual {v5}, Lsc/t;->i()Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-nez v10, :cond_5

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    invoke-virtual {v2, p0, v14, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_6

    .line 110
    .line 111
    const/4 v10, 0x1

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    if-eq v10, v14, :cond_5

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    :goto_3
    if-eqz v10, :cond_9

    .line 121
    .line 122
    invoke-virtual {v14}, Lsc/t;->e()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    invoke-virtual {v14}, Lsc/c;->d()V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_4
    const/4 v5, 0x1

    .line 132
    :goto_5
    if-eqz v5, :cond_8

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_8
    const-wide/16 v10, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_9
    invoke-virtual {v5}, Lsc/t;->e()Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_a

    .line 143
    .line 144
    invoke-virtual {v5}, Lsc/c;->d()V

    .line 145
    .line 146
    .line 147
    :cond_a
    const-wide/16 v10, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_b
    :goto_6
    invoke-static {v4}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_c

    .line 155
    .line 156
    invoke-virtual {p0}, Lpc/b;->m()Z

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v0, v1, v7}, Lpc/b;->A(JLpc/k;)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_c
    invoke-static {v4}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    move-object v10, v2

    .line 168
    check-cast v10, Lpc/k;

    .line 169
    .line 170
    iget-wide v2, v10, Lsc/t;->c:J

    .line 171
    .line 172
    cmp-long v0, v2, v0

    .line 173
    .line 174
    if-lez v0, :cond_e

    .line 175
    .line 176
    sget-object v0, Lpc/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 177
    .line 178
    const-wide/16 v4, 0x1

    .line 179
    .line 180
    add-long v11, v8, v4

    .line 181
    .line 182
    sget v1, Lpc/e;->b:I

    .line 183
    .line 184
    int-to-long v13, v1

    .line 185
    mul-long v4, v13, v2

    .line 186
    .line 187
    move-object v1, p0

    .line 188
    move-wide v2, v11

    .line 189
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    iget-wide v0, v10, Lsc/t;->c:J

    .line 196
    .line 197
    mul-long/2addr v0, v13

    .line 198
    sub-long/2addr v0, v8

    .line 199
    invoke-virtual {p0, v0, v1}, Lpc/b;->v(J)V

    .line 200
    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_d
    :goto_7
    const-wide/16 v0, 0x1

    .line 204
    .line 205
    invoke-virtual {p0, v0, v1}, Lpc/b;->v(J)V

    .line 206
    .line 207
    .line 208
    :goto_8
    const/4 v10, 0x0

    .line 209
    :cond_e
    if-nez v10, :cond_f

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_f
    move-object v7, v10

    .line 214
    :cond_10
    sget v0, Lpc/e;->b:I

    .line 215
    .line 216
    int-to-long v0, v0

    .line 217
    rem-long v0, v8, v0

    .line 218
    .line 219
    long-to-int v0, v0

    .line 220
    invoke-virtual {v7, v0}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    instance-of v2, v1, Lnc/i2;

    .line 225
    .line 226
    if-eqz v2, :cond_12

    .line 227
    .line 228
    sget-object v2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 229
    .line 230
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    cmp-long v2, v8, v2

    .line 235
    .line 236
    if-ltz v2, :cond_12

    .line 237
    .line 238
    sget-object v2, Lpc/e;->g:Ld2/h0;

    .line 239
    .line 240
    invoke-virtual {v7, v0, v1, v2}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_12

    .line 245
    .line 246
    invoke-virtual {p0, v1, v7, v0}, Lpc/b;->H(Ljava/lang/Object;Lpc/k;I)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_11

    .line 251
    .line 252
    sget-object v1, Lpc/e;->d:Ld2/h0;

    .line 253
    .line 254
    invoke-virtual {v7, v0, v1}, Lpc/k;->o(ILd2/h0;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_b

    .line 258
    .line 259
    :cond_11
    sget-object v1, Lpc/e;->j:Ld2/h0;

    .line 260
    .line 261
    invoke-virtual {v7, v0, v1}, Lpc/k;->o(ILd2/h0;)V

    .line 262
    .line 263
    .line 264
    const/4 v1, 0x0

    .line 265
    invoke-virtual {v7, v0, v1}, Lpc/k;->l(IZ)V

    .line 266
    .line 267
    .line 268
    const/4 v12, 0x0

    .line 269
    goto/16 :goto_c

    .line 270
    .line 271
    :cond_12
    :goto_9
    invoke-virtual {v7, v0}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    instance-of v2, v1, Lnc/i2;

    .line 276
    .line 277
    if-eqz v2, :cond_15

    .line 278
    .line 279
    sget-object v2, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 280
    .line 281
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v2

    .line 285
    cmp-long v2, v8, v2

    .line 286
    .line 287
    if-gez v2, :cond_13

    .line 288
    .line 289
    new-instance v2, Lpc/u;

    .line 290
    .line 291
    move-object v3, v1

    .line 292
    check-cast v3, Lnc/i2;

    .line 293
    .line 294
    invoke-direct {v2, v3}, Lpc/u;-><init>(Lnc/i2;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v0, v1, v2}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_12

    .line 302
    .line 303
    goto/16 :goto_b

    .line 304
    .line 305
    :cond_13
    sget-object v2, Lpc/e;->g:Ld2/h0;

    .line 306
    .line 307
    invoke-virtual {v7, v0, v1, v2}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_12

    .line 312
    .line 313
    invoke-virtual {p0, v1, v7, v0}, Lpc/b;->H(Ljava/lang/Object;Lpc/k;I)Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-eqz v1, :cond_14

    .line 318
    .line 319
    sget-object v1, Lpc/e;->d:Ld2/h0;

    .line 320
    .line 321
    invoke-virtual {v7, v0, v1}, Lpc/k;->o(ILd2/h0;)V

    .line 322
    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_14
    sget-object v1, Lpc/e;->j:Ld2/h0;

    .line 326
    .line 327
    invoke-virtual {v7, v0, v1}, Lpc/k;->o(ILd2/h0;)V

    .line 328
    .line 329
    .line 330
    const/4 v2, 0x0

    .line 331
    invoke-virtual {v7, v0, v2}, Lpc/k;->l(IZ)V

    .line 332
    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_15
    const/4 v2, 0x0

    .line 336
    sget-object v3, Lpc/e;->j:Ld2/h0;

    .line 337
    .line 338
    if-ne v1, v3, :cond_16

    .line 339
    .line 340
    :goto_a
    move v12, v2

    .line 341
    goto :goto_c

    .line 342
    :cond_16
    if-nez v1, :cond_17

    .line 343
    .line 344
    sget-object v3, Lpc/e;->e:Ld2/h0;

    .line 345
    .line 346
    invoke-virtual {v7, v0, v1, v3}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_12

    .line 351
    .line 352
    goto :goto_b

    .line 353
    :cond_17
    sget-object v3, Lpc/e;->d:Ld2/h0;

    .line 354
    .line 355
    if-ne v1, v3, :cond_18

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_18
    sget-object v3, Lpc/e;->h:Ld2/h0;

    .line 359
    .line 360
    if-eq v1, v3, :cond_1c

    .line 361
    .line 362
    sget-object v3, Lpc/e;->i:Ld2/h0;

    .line 363
    .line 364
    if-eq v1, v3, :cond_1c

    .line 365
    .line 366
    sget-object v3, Lpc/e;->k:Ld2/h0;

    .line 367
    .line 368
    if-ne v1, v3, :cond_19

    .line 369
    .line 370
    goto :goto_b

    .line 371
    :cond_19
    sget-object v3, Lpc/e;->l:Ld2/h0;

    .line 372
    .line 373
    if-ne v1, v3, :cond_1a

    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_1a
    sget-object v3, Lpc/e;->f:Ld2/h0;

    .line 377
    .line 378
    if-ne v1, v3, :cond_1b

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 382
    .line 383
    new-instance v2, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const-string v3, "Unexpected cell state: "

    .line 389
    .line 390
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v0

    .line 408
    :cond_1c
    :goto_b
    const/4 v12, 0x1

    .line 409
    :goto_c
    const-wide/16 v0, 0x1

    .line 410
    .line 411
    invoke-virtual {p0, v0, v1}, Lpc/b;->v(J)V

    .line 412
    .line 413
    .line 414
    if-eqz v12, :cond_1

    .line 415
    .line 416
    return-void
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final o(JLpc/k;)Lpc/k;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lpc/k<",
            "TE;>;)",
            "Lpc/k<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    sget-object v1, Lpc/e;->a:Lpc/k;

    .line 4
    .line 5
    sget-object v1, Lpc/d;->a:Lpc/d;

    .line 6
    .line 7
    :cond_0
    invoke-static {p3, p1, p2, v1}, Lp2/m0;->F(Lsc/t;JLdc/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    if-nez v3, :cond_7

    .line 18
    .line 19
    invoke-static {v2}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lsc/t;

    .line 28
    .line 29
    iget-wide v7, v6, Lsc/t;->c:J

    .line 30
    .line 31
    iget-wide v9, v3, Lsc/t;->c:J

    .line 32
    .line 33
    cmp-long v7, v7, v9

    .line 34
    .line 35
    if-ltz v7, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {v3}, Lsc/t;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v0, p0, v6, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_4

    .line 51
    .line 52
    move v7, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eq v7, v6, :cond_3

    .line 59
    .line 60
    move v7, v4

    .line 61
    :goto_1
    if-eqz v7, :cond_6

    .line 62
    .line 63
    invoke-virtual {v6}, Lsc/t;->e()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    invoke-virtual {v6}, Lsc/c;->d()V

    .line 70
    .line 71
    .line 72
    :cond_5
    :goto_2
    move v3, v5

    .line 73
    :goto_3
    if-eqz v3, :cond_0

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_6
    invoke-virtual {v3}, Lsc/t;->e()Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_1

    .line 81
    .line 82
    invoke-virtual {v3}, Lsc/c;->d()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_7
    :goto_4
    invoke-static {v2}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    invoke-virtual {p0}, Lpc/b;->m()Z

    .line 94
    .line 95
    .line 96
    iget-wide p1, p3, Lsc/t;->c:J

    .line 97
    .line 98
    sget v0, Lpc/e;->b:I

    .line 99
    .line 100
    int-to-long v2, v0

    .line 101
    mul-long/2addr p1, v2

    .line 102
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    cmp-long p1, p1, v2

    .line 107
    .line 108
    if-gez p1, :cond_11

    .line 109
    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :cond_8
    invoke-static {v2}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    check-cast p3, Lpc/k;

    .line 117
    .line 118
    invoke-virtual {p0}, Lpc/b;->z()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_d

    .line 123
    .line 124
    invoke-virtual {p0}, Lpc/b;->p()J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    sget v0, Lpc/e;->b:I

    .line 129
    .line 130
    int-to-long v6, v0

    .line 131
    div-long/2addr v2, v6

    .line 132
    cmp-long v0, p1, v2

    .line 133
    .line 134
    if-gtz v0, :cond_d

    .line 135
    .line 136
    sget-object v0, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 137
    .line 138
    :cond_9
    :goto_5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Lsc/t;

    .line 143
    .line 144
    iget-wide v6, v2, Lsc/t;->c:J

    .line 145
    .line 146
    iget-wide v8, p3, Lsc/t;->c:J

    .line 147
    .line 148
    cmp-long v3, v6, v8

    .line 149
    .line 150
    if-gez v3, :cond_d

    .line 151
    .line 152
    invoke-virtual {p3}, Lsc/t;->i()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_d

    .line 157
    .line 158
    :cond_a
    invoke-virtual {v0, p0, v2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_b

    .line 163
    .line 164
    move v3, v5

    .line 165
    goto :goto_6

    .line 166
    :cond_b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    if-eq v3, v2, :cond_a

    .line 171
    .line 172
    move v3, v4

    .line 173
    :goto_6
    if-eqz v3, :cond_c

    .line 174
    .line 175
    invoke-virtual {v2}, Lsc/t;->e()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_d

    .line 180
    .line 181
    invoke-virtual {v2}, Lsc/c;->d()V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_c
    invoke-virtual {p3}, Lsc/t;->e()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    invoke-virtual {p3}, Lsc/c;->d()V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_d
    :goto_7
    iget-wide v2, p3, Lsc/t;->c:J

    .line 196
    .line 197
    cmp-long p1, v2, p1

    .line 198
    .line 199
    if-lez p1, :cond_10

    .line 200
    .line 201
    sget p1, Lpc/e;->b:I

    .line 202
    .line 203
    int-to-long p1, p1

    .line 204
    mul-long/2addr v2, p1

    .line 205
    sget-object p1, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 206
    .line 207
    :cond_e
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    cmp-long p2, v6, v2

    .line 212
    .line 213
    if-ltz p2, :cond_f

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_f
    sget-object v4, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 217
    .line 218
    move-object v5, p0

    .line 219
    move-wide v8, v2

    .line 220
    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_e

    .line 225
    .line 226
    :goto_8
    iget-wide p1, p3, Lsc/t;->c:J

    .line 227
    .line 228
    sget v0, Lpc/e;->b:I

    .line 229
    .line 230
    int-to-long v2, v0

    .line 231
    mul-long/2addr p1, v2

    .line 232
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 233
    .line 234
    .line 235
    move-result-wide v2

    .line 236
    cmp-long p1, p1, v2

    .line 237
    .line 238
    if-gez p1, :cond_11

    .line 239
    .line 240
    :goto_9
    invoke-virtual {p3}, Lsc/c;->a()V

    .line 241
    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_10
    move-object v1, p3

    .line 245
    :cond_11
    :goto_a
    return-object v1
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

.method public final p()J
    .locals 2

    sget-object v0, Lpc/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Ljava/lang/Throwable;
    .locals 1

    sget-object v0, Lpc/b;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public final r()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lpc/l;

    invoke-direct {v0}, Lpc/l;-><init>()V

    :cond_0
    return-object v0
.end method

.method public final s()J
    .locals 2

    sget-object v0, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final t()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, Lpc/b;->q()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lpc/m;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lpc/m;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const/16 v3, 0x3c

    .line 13
    .line 14
    shr-long/2addr v1, v3

    .line 15
    long-to-int v1, v1

    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x3

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    if-eq v1, v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string v1, "cancelled,"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v1, "closed,"

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :goto_1
    const-string v1, "capacity="

    .line 32
    .line 33
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v4, p0, Lpc/b;->a:I

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v4, 0x2c

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "data=["

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    new-array v1, v3, [Lpc/k;

    .line 60
    .line 61
    sget-object v3, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 62
    .line 63
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v5, 0x0

    .line 68
    aput-object v3, v1, v5

    .line 69
    .line 70
    sget-object v3, Lpc/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 71
    .line 72
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v6, 0x1

    .line 77
    aput-object v3, v1, v6

    .line 78
    .line 79
    sget-object v3, Lpc/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 80
    .line 81
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    aput-object v3, v1, v2

    .line 86
    .line 87
    invoke-static {v1}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v7, v3

    .line 111
    check-cast v7, Lpc/k;

    .line 112
    .line 113
    sget-object v8, Lpc/e;->a:Lpc/k;

    .line 114
    .line 115
    if-eq v7, v8, :cond_3

    .line 116
    .line 117
    move v7, v6

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move v7, v5

    .line 120
    :goto_3
    if-eqz v7, :cond_2

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_22

    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_5

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    move-object v3, v2

    .line 148
    check-cast v3, Lpc/k;

    .line 149
    .line 150
    iget-wide v6, v3, Lsc/t;->c:J

    .line 151
    .line 152
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    move-object v8, v3

    .line 157
    check-cast v8, Lpc/k;

    .line 158
    .line 159
    iget-wide v8, v8, Lsc/t;->c:J

    .line 160
    .line 161
    cmp-long v10, v6, v8

    .line 162
    .line 163
    if-lez v10, :cond_7

    .line 164
    .line 165
    move-object v2, v3

    .line 166
    move-wide v6, v8

    .line 167
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_6

    .line 172
    .line 173
    :goto_4
    check-cast v2, Lpc/k;

    .line 174
    .line 175
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 176
    .line 177
    .line 178
    move-result-wide v8

    .line 179
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 180
    .line 181
    .line 182
    move-result-wide v10

    .line 183
    :goto_5
    sget v1, Lpc/e;->b:I

    .line 184
    .line 185
    :goto_6
    if-ge v5, v1, :cond_1c

    .line 186
    .line 187
    iget-wide v6, v2, Lsc/t;->c:J

    .line 188
    .line 189
    sget v3, Lpc/e;->b:I

    .line 190
    .line 191
    int-to-long v12, v3

    .line 192
    mul-long/2addr v6, v12

    .line 193
    int-to-long v12, v5

    .line 194
    add-long/2addr v6, v12

    .line 195
    cmp-long v3, v6, v10

    .line 196
    .line 197
    if-ltz v3, :cond_8

    .line 198
    .line 199
    cmp-long v12, v6, v8

    .line 200
    .line 201
    if-gez v12, :cond_1d

    .line 202
    .line 203
    :cond_8
    invoke-virtual {v2, v5}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    iget-object v13, v2, Lpc/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 208
    .line 209
    mul-int/lit8 v14, v5, 0x2

    .line 210
    .line 211
    invoke-virtual {v13, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    instance-of v14, v12, Lnc/k;

    .line 216
    .line 217
    if-eqz v14, :cond_b

    .line 218
    .line 219
    cmp-long v6, v6, v8

    .line 220
    .line 221
    if-gez v6, :cond_9

    .line 222
    .line 223
    if-ltz v3, :cond_9

    .line 224
    .line 225
    const-string v3, "receive"

    .line 226
    .line 227
    goto/16 :goto_e

    .line 228
    .line 229
    :cond_9
    if-gez v3, :cond_a

    .line 230
    .line 231
    if-ltz v6, :cond_a

    .line 232
    .line 233
    const-string v3, "send"

    .line 234
    .line 235
    goto/16 :goto_e

    .line 236
    .line 237
    :cond_a
    const-string v3, "cont"

    .line 238
    .line 239
    goto/16 :goto_e

    .line 240
    .line 241
    :cond_b
    instance-of v14, v12, Luc/f;

    .line 242
    .line 243
    if-eqz v14, :cond_e

    .line 244
    .line 245
    cmp-long v6, v6, v8

    .line 246
    .line 247
    if-gez v6, :cond_c

    .line 248
    .line 249
    if-ltz v3, :cond_c

    .line 250
    .line 251
    const-string v3, "onReceive"

    .line 252
    .line 253
    goto/16 :goto_e

    .line 254
    .line 255
    :cond_c
    if-gez v3, :cond_d

    .line 256
    .line 257
    if-ltz v6, :cond_d

    .line 258
    .line 259
    const-string v3, "onSend"

    .line 260
    .line 261
    goto/16 :goto_e

    .line 262
    .line 263
    :cond_d
    const-string v3, "select"

    .line 264
    .line 265
    goto/16 :goto_e

    .line 266
    .line 267
    :cond_e
    instance-of v3, v12, Lpc/r;

    .line 268
    .line 269
    if-eqz v3, :cond_f

    .line 270
    .line 271
    const-string v3, "receiveCatching"

    .line 272
    .line 273
    goto/16 :goto_e

    .line 274
    .line 275
    :cond_f
    instance-of v3, v12, Lpc/b$b;

    .line 276
    .line 277
    if-eqz v3, :cond_10

    .line 278
    .line 279
    const-string v3, "sendBroadcast"

    .line 280
    .line 281
    goto/16 :goto_e

    .line 282
    .line 283
    :cond_10
    instance-of v3, v12, Lpc/u;

    .line 284
    .line 285
    if-eqz v3, :cond_11

    .line 286
    .line 287
    new-instance v3, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v6, "EB("

    .line 293
    .line 294
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const/16 v6, 0x29

    .line 301
    .line 302
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    goto :goto_e

    .line 310
    :cond_11
    sget-object v3, Lpc/e;->f:Ld2/h0;

    .line 311
    .line 312
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_12

    .line 317
    .line 318
    const/4 v3, 0x1

    .line 319
    goto :goto_7

    .line 320
    :cond_12
    sget-object v3, Lpc/e;->g:Ld2/h0;

    .line 321
    .line 322
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    :goto_7
    if-eqz v3, :cond_13

    .line 327
    .line 328
    const-string v3, "resuming_sender"

    .line 329
    .line 330
    goto :goto_e

    .line 331
    :cond_13
    if-nez v12, :cond_14

    .line 332
    .line 333
    const/4 v3, 0x1

    .line 334
    goto :goto_8

    .line 335
    :cond_14
    sget-object v3, Lpc/e;->e:Ld2/h0;

    .line 336
    .line 337
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    :goto_8
    if-eqz v3, :cond_15

    .line 342
    .line 343
    const/4 v3, 0x1

    .line 344
    goto :goto_9

    .line 345
    :cond_15
    sget-object v3, Lpc/e;->i:Ld2/h0;

    .line 346
    .line 347
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    :goto_9
    if-eqz v3, :cond_16

    .line 352
    .line 353
    const/4 v3, 0x1

    .line 354
    goto :goto_a

    .line 355
    :cond_16
    sget-object v3, Lpc/e;->h:Ld2/h0;

    .line 356
    .line 357
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    :goto_a
    if-eqz v3, :cond_17

    .line 362
    .line 363
    const/4 v3, 0x1

    .line 364
    goto :goto_b

    .line 365
    :cond_17
    sget-object v3, Lpc/e;->k:Ld2/h0;

    .line 366
    .line 367
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    :goto_b
    if-eqz v3, :cond_18

    .line 372
    .line 373
    const/4 v3, 0x1

    .line 374
    goto :goto_c

    .line 375
    :cond_18
    sget-object v3, Lpc/e;->j:Ld2/h0;

    .line 376
    .line 377
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    :goto_c
    if-eqz v3, :cond_19

    .line 382
    .line 383
    const/4 v3, 0x1

    .line 384
    goto :goto_d

    .line 385
    :cond_19
    sget-object v3, Lpc/e;->l:Ld2/h0;

    .line 386
    .line 387
    invoke-static {v12, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    :goto_d
    if-nez v3, :cond_1b

    .line 392
    .line 393
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    :goto_e
    new-instance v6, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    if-eqz v13, :cond_1a

    .line 400
    .line 401
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    const/16 v7, 0x28

    .line 405
    .line 406
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v3, "),"

    .line 419
    .line 420
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_1a
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    :goto_f
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    :cond_1b
    add-int/lit8 v5, v5, 0x1

    .line 441
    .line 442
    goto/16 :goto_6

    .line 443
    .line 444
    :cond_1c
    invoke-virtual {v2}, Lsc/c;->b()Lsc/c;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    move-object v2, v1

    .line 449
    check-cast v2, Lpc/k;

    .line 450
    .line 451
    if-nez v2, :cond_21

    .line 452
    .line 453
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-nez v1, :cond_1e

    .line 458
    .line 459
    const/4 v1, 0x1

    .line 460
    goto :goto_10

    .line 461
    :cond_1e
    const/4 v1, 0x0

    .line 462
    :goto_10
    if-nez v1, :cond_20

    .line 463
    .line 464
    invoke-static {v0}, Llc/k;->p0(Ljava/lang/CharSequence;)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-ne v1, v4, :cond_1f

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    add-int/lit8 v1, v1, -0x1

    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    const-string v2, "this.deleteCharAt(index)"

    .line 485
    .line 486
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :cond_1f
    const-string v1, "]"

    .line 490
    .line 491
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    return-object v0

    .line 499
    :cond_20
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 500
    .line 501
    const-string v1, "Char sequence is empty."

    .line 502
    .line 503
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v0

    .line 507
    :cond_21
    const/4 v5, 0x0

    .line 508
    goto/16 :goto_5

    .line 509
    .line 510
    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 511
    .line 512
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 513
    .line 514
    .line 515
    throw v0
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final u()J
    .locals 4

    sget-object v0, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0xfffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final v(J)V
    .locals 7

    sget-object v0, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    and-long/2addr p1, v0

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    const/4 p2, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    move p1, v4

    :goto_0
    if-eqz p1, :cond_3

    :cond_1
    sget-object p1, Lpc/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    and-long/2addr v5, v0

    cmp-long p1, v5, v2

    if-eqz p1, :cond_2

    move p1, p2

    goto :goto_1

    :cond_2
    move p1, v4

    :goto_1
    if-nez p1, :cond_1

    :cond_3
    return-void
.end method

.method public final w(JZ)Z
    .locals 11

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_22

    .line 9
    .line 10
    if-eq v0, v2, :cond_22

    .line 11
    .line 12
    const-wide v3, 0xfffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    if-eq v0, v5, :cond_11

    .line 19
    .line 20
    const/4 p3, 0x3

    .line 21
    if-ne v0, p3, :cond_10

    .line 22
    .line 23
    and-long/2addr p1, v3

    .line 24
    invoke-virtual {p0, p1, p2}, Lpc/b;->h(J)Lpc/k;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p2, p0, Lpc/b;->b:Ldc/l;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    move-object v0, p3

    .line 32
    move-object v3, v0

    .line 33
    :cond_0
    sget v4, Lpc/e;->b:I

    .line 34
    .line 35
    const/4 v5, -0x1

    .line 36
    add-int/2addr v4, v5

    .line 37
    :goto_0
    if-ge v5, v4, :cond_b

    .line 38
    .line 39
    iget-wide v6, p1, Lsc/t;->c:J

    .line 40
    .line 41
    sget v8, Lpc/e;->b:I

    .line 42
    .line 43
    int-to-long v8, v8

    .line 44
    mul-long/2addr v6, v8

    .line 45
    int-to-long v8, v4

    .line 46
    add-long/2addr v6, v8

    .line 47
    :cond_1
    invoke-virtual {p1, v4}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    sget-object v9, Lpc/e;->i:Ld2/h0;

    .line 52
    .line 53
    if-eq v8, v9, :cond_c

    .line 54
    .line 55
    sget-object v9, Lpc/e;->d:Ld2/h0;

    .line 56
    .line 57
    if-ne v8, v9, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    cmp-long v9, v6, v9

    .line 64
    .line 65
    if-ltz v9, :cond_c

    .line 66
    .line 67
    sget-object v9, Lpc/e;->l:Ld2/h0;

    .line 68
    .line 69
    invoke-virtual {p1, v4, v8, v9}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_1

    .line 74
    .line 75
    if-eqz p2, :cond_9

    .line 76
    .line 77
    iget-object v6, p1, Lpc/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 78
    .line 79
    mul-int/lit8 v7, v4, 0x2

    .line 80
    .line 81
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {p2, v6, v0}, Lp2/m0;->k(Ldc/l;Ljava/lang/Object;Ln7/w;)Ln7/w;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    sget-object v9, Lpc/e;->e:Ld2/h0;

    .line 91
    .line 92
    if-eq v8, v9, :cond_a

    .line 93
    .line 94
    if-nez v8, :cond_3

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_3
    instance-of v9, v8, Lnc/i2;

    .line 98
    .line 99
    if-nez v9, :cond_6

    .line 100
    .line 101
    instance-of v9, v8, Lpc/u;

    .line 102
    .line 103
    if-eqz v9, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    sget-object v9, Lpc/e;->g:Ld2/h0;

    .line 107
    .line 108
    if-eq v8, v9, :cond_c

    .line 109
    .line 110
    sget-object v10, Lpc/e;->f:Ld2/h0;

    .line 111
    .line 112
    if-ne v8, v10, :cond_5

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_5
    if-eq v8, v9, :cond_1

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 119
    .line 120
    .line 121
    move-result-wide v9

    .line 122
    cmp-long v9, v6, v9

    .line 123
    .line 124
    if-ltz v9, :cond_c

    .line 125
    .line 126
    instance-of v9, v8, Lpc/u;

    .line 127
    .line 128
    if-eqz v9, :cond_7

    .line 129
    .line 130
    move-object v9, v8

    .line 131
    check-cast v9, Lpc/u;

    .line 132
    .line 133
    iget-object v9, v9, Lpc/u;->a:Lnc/i2;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    move-object v9, v8

    .line 137
    check-cast v9, Lnc/i2;

    .line 138
    .line 139
    :goto_2
    sget-object v10, Lpc/e;->l:Ld2/h0;

    .line 140
    .line 141
    invoke-virtual {p1, v4, v8, v10}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_1

    .line 146
    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    iget-object v6, p1, Lpc/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 150
    .line 151
    mul-int/lit8 v7, v4, 0x2

    .line 152
    .line 153
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {p2, v6, v0}, Lp2/m0;->k(Ldc/l;Ljava/lang/Object;Ln7/w;)Ln7/w;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_8
    invoke-static {v3, v9}, Lb/a0;->z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    :cond_9
    :goto_3
    invoke-virtual {p1, v4, p3}, Lpc/k;->n(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    :goto_4
    sget-object v9, Lpc/e;->l:Ld2/h0;

    .line 170
    .line 171
    invoke-virtual {p1, v4, v8, v9}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_1

    .line 176
    .line 177
    :goto_5
    invoke-virtual {p1}, Lsc/t;->h()V

    .line 178
    .line 179
    .line 180
    :goto_6
    add-int/lit8 v4, v4, -0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    sget-object v4, Lsc/c;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 185
    .line 186
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    check-cast p1, Lsc/c;

    .line 191
    .line 192
    check-cast p1, Lpc/k;

    .line 193
    .line 194
    if-nez p1, :cond_0

    .line 195
    .line 196
    :cond_c
    :goto_7
    if-eqz v3, :cond_e

    .line 197
    .line 198
    instance-of p1, v3, Ljava/util/ArrayList;

    .line 199
    .line 200
    if-nez p1, :cond_d

    .line 201
    .line 202
    check-cast v3, Lnc/i2;

    .line 203
    .line 204
    invoke-virtual {p0, v3, v1}, Lpc/b;->F(Lnc/i2;Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_d
    check-cast v3, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    add-int/2addr p1, v5

    .line 215
    :goto_8
    if-ge v5, p1, :cond_e

    .line 216
    .line 217
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    check-cast p2, Lnc/i2;

    .line 222
    .line 223
    invoke-virtual {p0, p2, v1}, Lpc/b;->F(Lnc/i2;Z)V

    .line 224
    .line 225
    .line 226
    add-int/lit8 p1, p1, -0x1

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_e
    :goto_9
    if-nez v0, :cond_f

    .line 230
    .line 231
    goto/16 :goto_11

    .line 232
    .line 233
    :cond_f
    throw v0

    .line 234
    :cond_10
    const-string p1, "unexpected close status: "

    .line 235
    .line 236
    invoke-static {p1, v0}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p2

    .line 250
    :cond_11
    and-long/2addr p1, v3

    .line 251
    invoke-virtual {p0, p1, p2}, Lpc/b;->h(J)Lpc/k;

    .line 252
    .line 253
    .line 254
    if-eqz p3, :cond_21

    .line 255
    .line 256
    :cond_12
    :goto_a
    sget-object p1, Lpc/b;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 257
    .line 258
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    check-cast p2, Lpc/k;

    .line 263
    .line 264
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 265
    .line 266
    .line 267
    move-result-wide v5

    .line 268
    invoke-virtual {p0}, Lpc/b;->u()J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    cmp-long p3, v3, v5

    .line 273
    .line 274
    if-gtz p3, :cond_13

    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_13
    sget p3, Lpc/e;->b:I

    .line 278
    .line 279
    int-to-long v3, p3

    .line 280
    div-long v7, v5, v3

    .line 281
    .line 282
    iget-wide v9, p2, Lsc/t;->c:J

    .line 283
    .line 284
    cmp-long p3, v9, v7

    .line 285
    .line 286
    if-eqz p3, :cond_14

    .line 287
    .line 288
    invoke-virtual {p0, v7, v8, p2}, Lpc/b;->o(JLpc/k;)Lpc/k;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    if-nez p2, :cond_14

    .line 293
    .line 294
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, Lpc/k;

    .line 299
    .line 300
    iget-wide p1, p1, Lsc/t;->c:J

    .line 301
    .line 302
    cmp-long p1, p1, v7

    .line 303
    .line 304
    if-gez p1, :cond_12

    .line 305
    .line 306
    :goto_b
    move p1, v1

    .line 307
    goto :goto_10

    .line 308
    :cond_14
    invoke-virtual {p2}, Lsc/c;->a()V

    .line 309
    .line 310
    .line 311
    rem-long v3, v5, v3

    .line 312
    .line 313
    long-to-int p1, v3

    .line 314
    :cond_15
    invoke-virtual {p2, p1}, Lpc/k;->k(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    if-eqz p3, :cond_1e

    .line 319
    .line 320
    sget-object v0, Lpc/e;->e:Ld2/h0;

    .line 321
    .line 322
    if-ne p3, v0, :cond_16

    .line 323
    .line 324
    goto :goto_d

    .line 325
    :cond_16
    sget-object p1, Lpc/e;->d:Ld2/h0;

    .line 326
    .line 327
    if-ne p3, p1, :cond_17

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_17
    sget-object p1, Lpc/e;->j:Ld2/h0;

    .line 331
    .line 332
    if-ne p3, p1, :cond_18

    .line 333
    .line 334
    goto :goto_e

    .line 335
    :cond_18
    sget-object p1, Lpc/e;->l:Ld2/h0;

    .line 336
    .line 337
    if-ne p3, p1, :cond_19

    .line 338
    .line 339
    goto :goto_e

    .line 340
    :cond_19
    sget-object p1, Lpc/e;->i:Ld2/h0;

    .line 341
    .line 342
    if-ne p3, p1, :cond_1a

    .line 343
    .line 344
    goto :goto_e

    .line 345
    :cond_1a
    sget-object p1, Lpc/e;->h:Ld2/h0;

    .line 346
    .line 347
    if-ne p3, p1, :cond_1b

    .line 348
    .line 349
    goto :goto_e

    .line 350
    :cond_1b
    sget-object p1, Lpc/e;->g:Ld2/h0;

    .line 351
    .line 352
    if-ne p3, p1, :cond_1c

    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_1c
    sget-object p1, Lpc/e;->f:Ld2/h0;

    .line 356
    .line 357
    if-ne p3, p1, :cond_1d

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_1d
    invoke-virtual {p0}, Lpc/b;->s()J

    .line 361
    .line 362
    .line 363
    move-result-wide p1

    .line 364
    cmp-long p1, v5, p1

    .line 365
    .line 366
    if-nez p1, :cond_1f

    .line 367
    .line 368
    :goto_c
    move p1, v2

    .line 369
    goto :goto_f

    .line 370
    :cond_1e
    :goto_d
    sget-object v0, Lpc/e;->h:Ld2/h0;

    .line 371
    .line 372
    invoke-virtual {p2, p1, p3, v0}, Lpc/k;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p3

    .line 376
    if-eqz p3, :cond_15

    .line 377
    .line 378
    invoke-virtual {p0}, Lpc/b;->n()V

    .line 379
    .line 380
    .line 381
    :cond_1f
    :goto_e
    move p1, v1

    .line 382
    :goto_f
    if-eqz p1, :cond_20

    .line 383
    .line 384
    move p1, v2

    .line 385
    :goto_10
    if-nez p1, :cond_22

    .line 386
    .line 387
    goto :goto_11

    .line 388
    :cond_20
    sget-object v3, Lpc/b;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 389
    .line 390
    const-wide/16 p1, 0x1

    .line 391
    .line 392
    add-long v7, v5, p1

    .line 393
    .line 394
    move-object v4, p0

    .line 395
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 396
    .line 397
    .line 398
    goto/16 :goto_a

    .line 399
    .line 400
    :cond_21
    :goto_11
    move v1, v2

    .line 401
    :cond_22
    return v1
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

.method public final x()Z
    .locals 3

    sget-object v0, Lpc/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lpc/b;->w(JZ)Z

    move-result v0

    return v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final z()Z
    .locals 4

    invoke-virtual {p0}, Lpc/b;->p()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

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
