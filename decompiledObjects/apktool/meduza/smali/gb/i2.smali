.class public final Lgb/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lgb/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/i2$b;,
        Lgb/i2$c;,
        Lgb/i2$a;
    }
.end annotation


# instance fields
.field public volatile A:Z

.field public a:Lgb/i2$a;

.field public b:I

.field public final c:Lgb/l3;

.field public final d:Lgb/r3;

.field public e:Leb/r;

.field public f:Lgb/w0;

.field public o:[B

.field public p:I

.field public q:I

.field public r:I

.field public s:Z

.field public t:Lgb/w;

.field public u:Lgb/w;

.field public v:J

.field public w:Z

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Lgb/i2$a;ILgb/l3;Lgb/r3;)V
    .locals 3

    sget-object v0, Leb/j$b;->a:Leb/j$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput v1, p0, Lgb/i2;->q:I

    const/4 v1, 0x5

    iput v1, p0, Lgb/i2;->r:I

    new-instance v1, Lgb/w;

    invoke-direct {v1}, Lgb/w;-><init>()V

    iput-object v1, p0, Lgb/i2;->u:Lgb/w;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lgb/i2;->w:Z

    const/4 v2, -0x1

    iput v2, p0, Lgb/i2;->x:I

    iput-boolean v1, p0, Lgb/i2;->z:Z

    iput-boolean v1, p0, Lgb/i2;->A:Z

    const-string v1, "sink"

    invoke-static {p1, v1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/i2;->a:Lgb/i2$a;

    iput-object v0, p0, Lgb/i2;->e:Leb/r;

    iput p2, p0, Lgb/i2;->b:I

    iput-object p3, p0, Lgb/i2;->c:Lgb/l3;

    const-string p1, "transportTracer"

    invoke-static {p4, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p4, p0, Lgb/i2;->d:Lgb/r3;

    return-void
.end method


# virtual methods
.method public final C(Lgb/u2;)V
    .locals 6

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lgb/i2;->isClosed()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-boolean v2, p0, Lgb/i2;->z:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    move v2, v1

    .line 22
    :goto_1
    if-nez v2, :cond_3

    .line 23
    .line 24
    iget-object v2, p0, Lgb/i2;->f:Lgb/w0;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iget-boolean v3, v2, Lgb/w0;->q:Z

    .line 29
    .line 30
    xor-int/2addr v3, v1

    .line 31
    const-string v4, "GzipInflatingBuffer is closed"

    .line 32
    .line 33
    invoke-static {v3, v4}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Lgb/w0;->a:Lgb/w;

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Lgb/w;->g(Lgb/u2;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v0, v2, Lgb/w0;->w:Z

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-object v2, p0, Lgb/i2;->u:Lgb/w;

    .line 45
    .line 46
    invoke-virtual {v2, p1}, Lgb/w;->g(Lgb/u2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    .line 48
    .line 49
    :goto_2
    :try_start_1
    invoke-virtual {p0}, Lgb/i2;->M()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_4

    .line 55
    :cond_3
    move v0, v1

    .line 56
    :goto_3
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-interface {p1}, Lgb/u2;->close()V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    move v5, v1

    .line 64
    move-object v1, v0

    .line 65
    move v0, v5

    .line 66
    :goto_4
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-interface {p1}, Lgb/u2;->close()V

    .line 69
    .line 70
    .line 71
    :cond_5
    throw v1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final H()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lgb/i2;->isClosed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v2, v0, Lgb/w0;->q:Z

    .line 14
    .line 15
    xor-int/2addr v2, v1

    .line 16
    const-string v3, "GzipInflatingBuffer is closed"

    .line 17
    .line 18
    invoke-static {v2, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, v0, Lgb/w0;->w:Z

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lgb/i2;->u:Lgb/w;

    .line 25
    .line 26
    iget v0, v0, Lgb/w;->c:I

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    move v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Lgb/i2;->close()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    iput-boolean v1, p0, Lgb/i2;->z:Z

    .line 40
    .line 41
    :goto_1
    return-void
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

.method public final I(Leb/r;)V
    .locals 2

    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already set full stream decompressor"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iput-object p1, p0, Lgb/i2;->e:Leb/r;

    return-void
.end method

.method public final M()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lgb/i2;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lgb/i2;->w:Z

    .line 8
    .line 9
    :goto_0
    const/4 v1, 0x0

    .line 10
    :try_start_0
    iget-boolean v2, p0, Lgb/i2;->A:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    iget-wide v2, p0, Lgb/i2;->v:J

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    if-lez v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lgb/i2;->c0()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    iget v2, p0, Lgb/i2;->q:I

    .line 29
    .line 30
    invoke-static {v2}, Lq0/g;->c(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lgb/i2;->Q()V

    .line 39
    .line 40
    .line 41
    iget-wide v2, p0, Lgb/i2;->v:J

    .line 42
    .line 43
    const-wide/16 v4, 0x1

    .line 44
    .line 45
    sub-long/2addr v2, v4

    .line 46
    iput-wide v2, p0, Lgb/i2;->v:J

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v3, "Invalid state: "

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget v3, p0, Lgb/i2;->q:I

    .line 64
    .line 65
    invoke-static {v3}, Lg;->o(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    invoke-virtual {p0}, Lgb/i2;->b0()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    iget-boolean v2, p0, Lgb/i2;->A:Z

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Lgb/i2;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    iput-boolean v1, p0, Lgb/i2;->w:Z

    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    :try_start_1
    iget-boolean v2, p0, Lgb/i2;->z:Z

    .line 95
    .line 96
    if-eqz v2, :cond_7

    .line 97
    .line 98
    iget-object v2, p0, Lgb/i2;->f:Lgb/w0;

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    iget-boolean v3, v2, Lgb/w0;->q:Z

    .line 103
    .line 104
    xor-int/2addr v0, v3

    .line 105
    const-string v3, "GzipInflatingBuffer is closed"

    .line 106
    .line 107
    invoke-static {v0, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-boolean v0, v2, Lgb/w0;->w:Z

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    iget-object v2, p0, Lgb/i2;->u:Lgb/w;

    .line 114
    .line 115
    iget v2, v2, Lgb/w;->c:I

    .line 116
    .line 117
    if-nez v2, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    move v0, v1

    .line 121
    :goto_1
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {p0}, Lgb/i2;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_7
    iput-boolean v1, p0, Lgb/i2;->w:Z

    .line 127
    .line 128
    return-void

    .line 129
    :goto_2
    iput-boolean v1, p0, Lgb/i2;->w:Z

    .line 130
    .line 131
    throw v0
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

.method public final Q()V
    .locals 8

    .line 1
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 2
    .line 3
    iget v1, p0, Lgb/i2;->x:I

    .line 4
    .line 5
    iget v2, p0, Lgb/i2;->y:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    iget-object v0, v0, Lgb/l3;->a:[Lm/e;

    .line 9
    .line 10
    array-length v4, v0

    .line 11
    const/4 v5, 0x0

    .line 12
    move v6, v5

    .line 13
    :goto_0
    if-ge v6, v4, :cond_0

    .line 14
    .line 15
    aget-object v7, v0, v6

    .line 16
    .line 17
    invoke-virtual {v7, v1, v2, v3}, Lm/e;->h(IJ)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v6, v6, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput v5, p0, Lgb/i2;->y:I

    .line 24
    .line 25
    iget-boolean v0, p0, Lgb/i2;->s:Z

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lgb/i2;->e:Leb/r;

    .line 30
    .line 31
    sget-object v1, Leb/j$b;->a:Leb/j$b;

    .line 32
    .line 33
    if-eq v0, v1, :cond_1

    .line 34
    .line 35
    :try_start_0
    iget-object v1, p0, Lgb/i2;->t:Lgb/w;

    .line 36
    .line 37
    sget-object v2, Lgb/v2;->a:Lgb/v2$b;

    .line 38
    .line 39
    new-instance v2, Lgb/v2$a;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Lgb/v2$a;-><init>(Lgb/u2;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2}, Leb/r;->c(Lgb/v2$a;)Ljava/io/InputStream;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lgb/i2$c;

    .line 49
    .line 50
    iget v2, p0, Lgb/i2;->b:I

    .line 51
    .line 52
    iget-object v3, p0, Lgb/i2;->c:Lgb/l3;

    .line 53
    .line 54
    invoke-direct {v1, v0, v2, v3}, Lgb/i2$c;-><init>(Ljava/io/InputStream;ILgb/l3;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catch_0
    move-exception v0

    .line 59
    new-instance v1, Ljava/lang/RuntimeException;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_1
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 66
    .line 67
    const-string v1, "Can\'t decode compressed gRPC message as compression not configured"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Leb/g1;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Leb/g1;-><init>(Leb/e1;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_2
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 80
    .line 81
    iget-object v1, p0, Lgb/i2;->t:Lgb/w;

    .line 82
    .line 83
    iget v1, v1, Lgb/w;->c:I

    .line 84
    .line 85
    int-to-long v1, v1

    .line 86
    iget-object v0, v0, Lgb/l3;->a:[Lm/e;

    .line 87
    .line 88
    array-length v3, v0

    .line 89
    :goto_1
    if-ge v5, v3, :cond_3

    .line 90
    .line 91
    aget-object v4, v0, v5

    .line 92
    .line 93
    invoke-virtual {v4, v1, v2}, Lm/e;->i(J)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    iget-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 100
    .line 101
    sget-object v1, Lgb/v2;->a:Lgb/v2$b;

    .line 102
    .line 103
    new-instance v1, Lgb/v2$a;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Lgb/v2$a;-><init>(Lgb/u2;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    iget-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 115
    .line 116
    iget-object v0, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 117
    .line 118
    new-instance v2, Lgb/i2$b;

    .line 119
    .line 120
    invoke-direct {v2, v1}, Lgb/i2$b;-><init>(Ljava/io/InputStream;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v2}, Lgb/i2$a;->a(Lgb/n3$a;)V

    .line 124
    .line 125
    .line 126
    const/4 v0, 0x1

    .line 127
    iput v0, p0, Lgb/i2;->q:I

    .line 128
    .line 129
    const/4 v0, 0x5

    .line 130
    iput v0, p0, Lgb/i2;->r:I

    .line 131
    .line 132
    return-void
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

.method public final b0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit16 v1, v0, 0xfe

    .line 8
    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    iput-boolean v0, p0, Lgb/i2;->s:Z

    .line 20
    .line 21
    iget-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-virtual {v0, v3}, Lgb/b;->f(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    shl-int/lit8 v3, v3, 0x18

    .line 44
    .line 45
    shl-int/lit8 v4, v4, 0x10

    .line 46
    .line 47
    or-int/2addr v3, v4

    .line 48
    shl-int/lit8 v4, v5, 0x8

    .line 49
    .line 50
    or-int/2addr v3, v4

    .line 51
    or-int/2addr v0, v3

    .line 52
    iput v0, p0, Lgb/i2;->r:I

    .line 53
    .line 54
    const/4 v3, 0x2

    .line 55
    if-ltz v0, :cond_2

    .line 56
    .line 57
    iget v4, p0, Lgb/i2;->b:I

    .line 58
    .line 59
    if-gt v0, v4, :cond_2

    .line 60
    .line 61
    iget v0, p0, Lgb/i2;->x:I

    .line 62
    .line 63
    add-int/2addr v0, v1

    .line 64
    iput v0, p0, Lgb/i2;->x:I

    .line 65
    .line 66
    iget-object v1, p0, Lgb/i2;->c:Lgb/l3;

    .line 67
    .line 68
    iget-object v1, v1, Lgb/l3;->a:[Lm/e;

    .line 69
    .line 70
    array-length v4, v1

    .line 71
    :goto_1
    if-ge v2, v4, :cond_1

    .line 72
    .line 73
    aget-object v5, v1, v2

    .line 74
    .line 75
    invoke-virtual {v5, v0}, Lm/e;->g(I)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object v0, p0, Lgb/i2;->d:Lgb/r3;

    .line 82
    .line 83
    iget-object v1, v0, Lgb/r3;->b:Lgb/q1;

    .line 84
    .line 85
    invoke-interface {v1}, Lgb/q1;->b()V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, Lgb/r3;->a:Lgb/o3;

    .line 89
    .line 90
    invoke-interface {v0}, Lgb/o3;->a()J

    .line 91
    .line 92
    .line 93
    iput v3, p0, Lgb/i2;->q:I

    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    sget-object v0, Leb/e1;->k:Leb/e1;

    .line 97
    .line 98
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 99
    .line 100
    new-array v3, v3, [Ljava/lang/Object;

    .line 101
    .line 102
    iget v5, p0, Lgb/i2;->b:I

    .line 103
    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    aput-object v5, v3, v2

    .line 109
    .line 110
    iget v2, p0, Lgb/i2;->r:I

    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    aput-object v2, v3, v1

    .line 117
    .line 118
    const-string v1, "gRPC message exceeds maximum size %d: %d"

    .line 119
    .line 120
    invoke-static {v4, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v1, Leb/g1;

    .line 129
    .line 130
    invoke-direct {v1, v0}, Leb/g1;-><init>(Leb/e1;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_3
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 135
    .line 136
    const-string v1, "gRPC frame header malformed: reserved bits not zero"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Leb/g1;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Leb/g1;-><init>(Leb/e1;)V

    .line 145
    .line 146
    .line 147
    throw v1
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

.method public final c0()Z
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lgb/i2;->t:Lgb/w;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    new-instance v2, Lgb/w;

    .line 8
    .line 9
    invoke-direct {v2}, Lgb/w;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, Lgb/i2;->t:Lgb/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    :cond_0
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    :try_start_1
    iget v4, p0, Lgb/i2;->r:I

    .line 17
    .line 18
    iget-object v5, p0, Lgb/i2;->t:Lgb/w;

    .line 19
    .line 20
    iget v5, v5, Lgb/w;->c:I

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    if-lez v4, :cond_a

    .line 24
    .line 25
    iget-object v5, p0, Lgb/i2;->f:Lgb/w0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    if-eqz v5, :cond_6

    .line 28
    .line 29
    :try_start_2
    iget-object v5, p0, Lgb/i2;->o:[B

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    iget v6, p0, Lgb/i2;->p:I

    .line 34
    .line 35
    array-length v5, v5

    .line 36
    if-ne v6, v5, :cond_2

    .line 37
    .line 38
    :cond_1
    const/high16 v5, 0x200000

    .line 39
    .line 40
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    new-array v5, v5, [B

    .line 45
    .line 46
    iput-object v5, p0, Lgb/i2;->o:[B

    .line 47
    .line 48
    iput v1, p0, Lgb/i2;->p:I

    .line 49
    .line 50
    :cond_2
    iget-object v5, p0, Lgb/i2;->o:[B

    .line 51
    .line 52
    array-length v5, v5

    .line 53
    iget v6, p0, Lgb/i2;->p:I

    .line 54
    .line 55
    sub-int/2addr v5, v6

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v5, p0, Lgb/i2;->f:Lgb/w0;

    .line 61
    .line 62
    iget-object v6, p0, Lgb/i2;->o:[B

    .line 63
    .line 64
    iget v7, p0, Lgb/i2;->p:I

    .line 65
    .line 66
    invoke-virtual {v5, v6, v7, v4}, Lgb/w0;->f([BII)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iget-object v5, p0, Lgb/i2;->f:Lgb/w0;

    .line 71
    .line 72
    iget v6, v5, Lgb/w0;->u:I

    .line 73
    .line 74
    iput v1, v5, Lgb/w0;->u:I

    .line 75
    .line 76
    add-int/2addr v2, v6

    .line 77
    iget v6, v5, Lgb/w0;->v:I

    .line 78
    .line 79
    iput v1, v5, Lgb/w0;->v:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    add-int/2addr v3, v6

    .line 82
    if-nez v4, :cond_5

    .line 83
    .line 84
    if-lez v2, :cond_4

    .line 85
    .line 86
    iget-object v4, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 87
    .line 88
    invoke-interface {v4, v2}, Lgb/i2$a;->d(I)V

    .line 89
    .line 90
    .line 91
    iget v4, p0, Lgb/i2;->q:I

    .line 92
    .line 93
    if-ne v4, v0, :cond_4

    .line 94
    .line 95
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 100
    .line 101
    int-to-long v4, v3

    .line 102
    invoke-virtual {v0, v4, v5}, Lgb/l3;->a(J)V

    .line 103
    .line 104
    .line 105
    iget v0, p0, Lgb/i2;->y:I

    .line 106
    .line 107
    add-int/2addr v0, v3

    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 110
    .line 111
    int-to-long v3, v2

    .line 112
    invoke-virtual {v0, v3, v4}, Lgb/l3;->a(J)V

    .line 113
    .line 114
    .line 115
    iget v0, p0, Lgb/i2;->y:I

    .line 116
    .line 117
    add-int/2addr v0, v2

    .line 118
    :goto_1
    iput v0, p0, Lgb/i2;->y:I

    .line 119
    .line 120
    :cond_4
    return v1

    .line 121
    :cond_5
    :try_start_3
    iget-object v5, p0, Lgb/i2;->t:Lgb/w;

    .line 122
    .line 123
    iget-object v6, p0, Lgb/i2;->o:[B

    .line 124
    .line 125
    iget v7, p0, Lgb/i2;->p:I

    .line 126
    .line 127
    sget-object v8, Lgb/v2;->a:Lgb/v2$b;

    .line 128
    .line 129
    new-instance v8, Lgb/v2$b;

    .line 130
    .line 131
    invoke-direct {v8, v6, v7, v4}, Lgb/v2$b;-><init>([BII)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v8}, Lgb/w;->g(Lgb/u2;)V

    .line 135
    .line 136
    .line 137
    iget v5, p0, Lgb/i2;->p:I

    .line 138
    .line 139
    add-int/2addr v5, v4

    .line 140
    iput v5, p0, Lgb/i2;->p:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catch_0
    move-exception v1

    .line 144
    :try_start_4
    new-instance v4, Ljava/lang/RuntimeException;

    .line 145
    .line 146
    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v4

    .line 150
    :catch_1
    move-exception v1

    .line 151
    new-instance v4, Ljava/lang/RuntimeException;

    .line 152
    .line 153
    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    throw v4

    .line 157
    :cond_6
    iget-object v5, p0, Lgb/i2;->u:Lgb/w;

    .line 158
    .line 159
    iget v5, v5, Lgb/w;->c:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    .line 161
    if-nez v5, :cond_9

    .line 162
    .line 163
    if-lez v2, :cond_8

    .line 164
    .line 165
    iget-object v4, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 166
    .line 167
    invoke-interface {v4, v2}, Lgb/i2$a;->d(I)V

    .line 168
    .line 169
    .line 170
    iget v4, p0, Lgb/i2;->q:I

    .line 171
    .line 172
    if-ne v4, v0, :cond_8

    .line 173
    .line 174
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 175
    .line 176
    if-eqz v0, :cond_7

    .line 177
    .line 178
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 179
    .line 180
    int-to-long v4, v3

    .line 181
    invoke-virtual {v0, v4, v5}, Lgb/l3;->a(J)V

    .line 182
    .line 183
    .line 184
    iget v0, p0, Lgb/i2;->y:I

    .line 185
    .line 186
    add-int/2addr v0, v3

    .line 187
    goto :goto_2

    .line 188
    :cond_7
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 189
    .line 190
    int-to-long v3, v2

    .line 191
    invoke-virtual {v0, v3, v4}, Lgb/l3;->a(J)V

    .line 192
    .line 193
    .line 194
    iget v0, p0, Lgb/i2;->y:I

    .line 195
    .line 196
    add-int/2addr v0, v2

    .line 197
    :goto_2
    iput v0, p0, Lgb/i2;->y:I

    .line 198
    .line 199
    :cond_8
    return v1

    .line 200
    :cond_9
    :try_start_5
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    add-int/2addr v2, v4

    .line 205
    iget-object v5, p0, Lgb/i2;->t:Lgb/w;

    .line 206
    .line 207
    iget-object v6, p0, Lgb/i2;->u:Lgb/w;

    .line 208
    .line 209
    invoke-virtual {v6, v4}, Lgb/w;->r(I)Lgb/u2;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v5, v4}, Lgb/w;->g(Lgb/u2;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_a
    const/4 v1, 0x1

    .line 219
    if-lez v2, :cond_c

    .line 220
    .line 221
    iget-object v4, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 222
    .line 223
    invoke-interface {v4, v2}, Lgb/i2$a;->d(I)V

    .line 224
    .line 225
    .line 226
    iget v4, p0, Lgb/i2;->q:I

    .line 227
    .line 228
    if-ne v4, v0, :cond_c

    .line 229
    .line 230
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 231
    .line 232
    if-eqz v0, :cond_b

    .line 233
    .line 234
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 235
    .line 236
    int-to-long v4, v3

    .line 237
    invoke-virtual {v0, v4, v5}, Lgb/l3;->a(J)V

    .line 238
    .line 239
    .line 240
    iget v0, p0, Lgb/i2;->y:I

    .line 241
    .line 242
    add-int/2addr v0, v3

    .line 243
    goto :goto_3

    .line 244
    :cond_b
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 245
    .line 246
    int-to-long v3, v2

    .line 247
    invoke-virtual {v0, v3, v4}, Lgb/l3;->a(J)V

    .line 248
    .line 249
    .line 250
    iget v0, p0, Lgb/i2;->y:I

    .line 251
    .line 252
    add-int/2addr v0, v2

    .line 253
    :goto_3
    iput v0, p0, Lgb/i2;->y:I

    .line 254
    .line 255
    :cond_c
    return v1

    .line 256
    :catchall_0
    move-exception v1

    .line 257
    move v9, v2

    .line 258
    move-object v2, v1

    .line 259
    move v1, v9

    .line 260
    goto :goto_4

    .line 261
    :catchall_1
    move-exception v2

    .line 262
    move v3, v1

    .line 263
    :goto_4
    if-lez v1, :cond_e

    .line 264
    .line 265
    iget-object v4, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 266
    .line 267
    invoke-interface {v4, v1}, Lgb/i2$a;->d(I)V

    .line 268
    .line 269
    .line 270
    iget v4, p0, Lgb/i2;->q:I

    .line 271
    .line 272
    if-ne v4, v0, :cond_e

    .line 273
    .line 274
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 275
    .line 276
    if-eqz v0, :cond_d

    .line 277
    .line 278
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 279
    .line 280
    int-to-long v4, v3

    .line 281
    invoke-virtual {v0, v4, v5}, Lgb/l3;->a(J)V

    .line 282
    .line 283
    .line 284
    iget v0, p0, Lgb/i2;->y:I

    .line 285
    .line 286
    add-int/2addr v0, v3

    .line 287
    goto :goto_5

    .line 288
    :cond_d
    iget-object v0, p0, Lgb/i2;->c:Lgb/l3;

    .line 289
    .line 290
    int-to-long v3, v1

    .line 291
    invoke-virtual {v0, v3, v4}, Lgb/l3;->a(J)V

    .line 292
    .line 293
    .line 294
    iget v0, p0, Lgb/i2;->y:I

    .line 295
    .line 296
    add-int/2addr v0, v1

    .line 297
    :goto_5
    iput v0, p0, Lgb/i2;->y:I

    .line 298
    .line 299
    :cond_e
    throw v2
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

.method public final close()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lgb/i2;->isClosed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lgb/i2;->t:Lgb/w;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v0, v0, Lgb/w;->c:I

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v0, v1

    .line 21
    :goto_0
    const/4 v3, 0x0

    .line 22
    :try_start_0
    iget-object v4, p0, Lgb/i2;->f:Lgb/w0;

    .line 23
    .line 24
    if-eqz v4, :cond_6

    .line 25
    .line 26
    if-nez v0, :cond_4

    .line 27
    .line 28
    iget-boolean v0, v4, Lgb/w0;->q:Z

    .line 29
    .line 30
    xor-int/2addr v0, v2

    .line 31
    const-string v5, "GzipInflatingBuffer is closed"

    .line 32
    .line 33
    invoke-static {v0, v5}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v4, Lgb/w0;->c:Lgb/w0$a;

    .line 37
    .line 38
    invoke-virtual {v0}, Lgb/w0$a;->d()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    iget v0, v4, Lgb/w0;->p:I

    .line 45
    .line 46
    if-eq v0, v2, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v0, v1

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    :goto_1
    move v0, v2

    .line 52
    :goto_2
    if-eqz v0, :cond_5

    .line 53
    .line 54
    :cond_4
    move v1, v2

    .line 55
    :cond_5
    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    .line 56
    .line 57
    invoke-virtual {v0}, Lgb/w0;->close()V

    .line 58
    .line 59
    .line 60
    move v0, v1

    .line 61
    :cond_6
    iget-object v1, p0, Lgb/i2;->u:Lgb/w;

    .line 62
    .line 63
    if-eqz v1, :cond_7

    .line 64
    .line 65
    invoke-virtual {v1}, Lgb/w;->close()V

    .line 66
    .line 67
    .line 68
    :cond_7
    iget-object v1, p0, Lgb/i2;->t:Lgb/w;

    .line 69
    .line 70
    if-eqz v1, :cond_8

    .line 71
    .line 72
    invoke-virtual {v1}, Lgb/w;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    :cond_8
    iput-object v3, p0, Lgb/i2;->f:Lgb/w0;

    .line 76
    .line 77
    iput-object v3, p0, Lgb/i2;->u:Lgb/w;

    .line 78
    .line 79
    iput-object v3, p0, Lgb/i2;->t:Lgb/w;

    .line 80
    .line 81
    iget-object v1, p0, Lgb/i2;->a:Lgb/i2$a;

    .line 82
    .line 83
    invoke-interface {v1, v0}, Lgb/i2$a;->c(Z)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    iput-object v3, p0, Lgb/i2;->f:Lgb/w0;

    .line 89
    .line 90
    iput-object v3, p0, Lgb/i2;->u:Lgb/w;

    .line 91
    .line 92
    iput-object v3, p0, Lgb/i2;->t:Lgb/w;

    .line 93
    .line 94
    throw v0
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

.method public final f(I)V
    .locals 4

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "numMessages must be > 0"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lgb/i2;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-wide v0, p0, Lgb/i2;->v:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lgb/i2;->v:J

    invoke-virtual {p0}, Lgb/i2;->M()V

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lgb/i2;->b:I

    return-void
.end method

.method public final isClosed()Z
    .locals 1

    iget-object v0, p0, Lgb/i2;->u:Lgb/w;

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/i2;->f:Lgb/w0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
