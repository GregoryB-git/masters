.class public Lxc/c;
.super Lxc/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxc/c$a;,
        Lxc/c$b;
    }
.end annotation


# static fields
.field public static final h:Ljava/util/concurrent/locks/ReentrantLock;

.field public static final i:Ljava/util/concurrent/locks/Condition;

.field public static final j:J

.field public static final k:J

.field public static l:Lxc/c;


# instance fields
.field public e:Z

.field public f:Lxc/c;

.field public g:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lxc/c;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "lock.newCondition()"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lxc/c;->i:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lxc/c;->j:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lxc/c;->k:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lxc/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 9

    .line 1
    iget-wide v0, p0, Lxc/z;->c:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lxc/z;->a:Z

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v3, v0, v3

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v4, Lxc/c;->h:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-boolean v5, p0, Lxc/c;->e:Z

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    xor-int/2addr v5, v6

    .line 23
    if-eqz v5, :cond_8

    .line 24
    .line 25
    iput-boolean v6, p0, Lxc/c;->e:Z

    .line 26
    .line 27
    sget-object v5, Lxc/c;->l:Lxc/c;

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    new-instance v5, Lxc/c;

    .line 32
    .line 33
    invoke-direct {v5}, Lxc/c;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v5, Lxc/c;->l:Lxc/c;

    .line 37
    .line 38
    new-instance v5, Lxc/c$b;

    .line 39
    .line 40
    invoke-direct {v5}, Lxc/c$b;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lxc/z;->c()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v2, v5

    .line 59
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-eqz v3, :cond_3

    .line 65
    .line 66
    :goto_0
    add-long/2addr v0, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Lxc/z;->c()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    :goto_1
    iput-wide v0, p0, Lxc/c;->g:J

    .line 75
    .line 76
    sub-long/2addr v0, v5

    .line 77
    sget-object v2, Lxc/c;->l:Lxc/c;

    .line 78
    .line 79
    :goto_2
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v3, v2, Lxc/c;->f:Lxc/c;

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    iget-wide v7, v3, Lxc/c;->g:J

    .line 87
    .line 88
    sub-long/2addr v7, v5

    .line 89
    cmp-long v7, v0, v7

    .line 90
    .line 91
    if-gez v7, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move-object v2, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    :goto_3
    iput-object v3, p0, Lxc/c;->f:Lxc/c;

    .line 97
    .line 98
    iput-object p0, v2, Lxc/c;->f:Lxc/c;

    .line 99
    .line 100
    sget-object v0, Lxc/c;->l:Lxc/c;

    .line 101
    .line 102
    if-ne v2, v0, :cond_6

    .line 103
    .line 104
    sget-object v0, Lxc/c;->i:Ljava/util/concurrent/locks/Condition;

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 107
    .line 108
    .line 109
    :cond_6
    sget-object v0, Lrb/h;->a:Lrb/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_7
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_8
    const-string v0, "Unbalanced enter/exit"

    .line 122
    .line 123
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 135
    .line 136
    .line 137
    throw v0
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

.method public final i()Z
    .locals 4

    .line 1
    sget-object v0, Lxc/c;->h:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lxc/c;->e:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iput-boolean v2, p0, Lxc/c;->e:Z

    .line 13
    .line 14
    sget-object v1, Lxc/c;->l:Lxc/c;

    .line 15
    .line 16
    :goto_0
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-object v3, v1, Lxc/c;->f:Lxc/c;

    .line 19
    .line 20
    if-ne v3, p0, :cond_1

    .line 21
    .line 22
    iget-object v3, p0, Lxc/c;->f:Lxc/c;

    .line 23
    .line 24
    iput-object v3, v1, Lxc/c;->f:Lxc/c;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Lxc/c;->f:Lxc/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v1, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v2, 0x1

    .line 33
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 34
    .line 35
    .line 36
    return v2

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 39
    .line 40
    .line 41
    throw v1
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

.method public j(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method
