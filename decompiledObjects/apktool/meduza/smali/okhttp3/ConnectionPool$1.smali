.class Lokhttp3/ConnectionPool$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/ConnectionPool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lokhttp3/ConnectionPool;


# direct methods
.method public constructor <init>(Lokhttp3/ConnectionPool;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/ConnectionPool$1;->a:Lokhttp3/ConnectionPool;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lokhttp3/ConnectionPool$1;->a:Lokhttp3/ConnectionPool;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v3, v0, Lokhttp3/ConnectionPool;->d:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const-wide/high16 v6, -0x8000000000000000L

    .line 17
    .line 18
    move v8, v4

    .line 19
    move v9, v8

    .line 20
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    if-eqz v10, :cond_3

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    check-cast v10, Lokhttp3/internal/connection/RealConnection;

    .line 31
    .line 32
    invoke-virtual {v0, v10, v1, v2}, Lokhttp3/ConnectionPool;->a(Lokhttp3/internal/connection/RealConnection;J)I

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    if-lez v11, :cond_2

    .line 37
    .line 38
    add-int/lit8 v9, v9, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 42
    .line 43
    iget-wide v11, v10, Lokhttp3/internal/connection/RealConnection;->o:J

    .line 44
    .line 45
    sub-long v11, v1, v11

    .line 46
    .line 47
    cmp-long v13, v11, v6

    .line 48
    .line 49
    if-lez v13, :cond_1

    .line 50
    .line 51
    move-object v5, v10

    .line 52
    move-wide v6, v11

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    iget-wide v1, v0, Lokhttp3/ConnectionPool;->b:J

    .line 55
    .line 56
    cmp-long v3, v6, v1

    .line 57
    .line 58
    const-wide/16 v10, -0x1

    .line 59
    .line 60
    const-wide/16 v12, 0x0

    .line 61
    .line 62
    if-gez v3, :cond_7

    .line 63
    .line 64
    iget v3, v0, Lokhttp3/ConnectionPool;->a:I

    .line 65
    .line 66
    if-le v8, v3, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    if-lez v8, :cond_5

    .line 70
    .line 71
    sub-long/2addr v1, v6

    .line 72
    monitor-exit v0

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    if-lez v9, :cond_6

    .line 75
    .line 76
    monitor-exit v0

    .line 77
    goto :goto_3

    .line 78
    :cond_6
    iput-boolean v4, v0, Lokhttp3/ConnectionPool;->f:Z

    .line 79
    .line 80
    monitor-exit v0

    .line 81
    move-wide v1, v10

    .line 82
    goto :goto_3

    .line 83
    :cond_7
    :goto_2
    iget-object v1, v0, Lokhttp3/ConnectionPool;->d:Ljava/util/ArrayDeque;

    .line 84
    .line 85
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    iget-object v0, v5, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;

    .line 90
    .line 91
    invoke-static {v0}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    .line 92
    .line 93
    .line 94
    move-wide v1, v12

    .line 95
    :goto_3
    cmp-long v0, v1, v10

    .line 96
    .line 97
    if-nez v0, :cond_8

    .line 98
    .line 99
    return-void

    .line 100
    :cond_8
    cmp-long v0, v1, v12

    .line 101
    .line 102
    if-lez v0, :cond_0

    .line 103
    .line 104
    const-wide/32 v3, 0xf4240

    .line 105
    .line 106
    .line 107
    div-long v5, v1, v3

    .line 108
    .line 109
    mul-long/2addr v3, v5

    .line 110
    sub-long/2addr v1, v3

    .line 111
    iget-object v0, p0, Lokhttp3/ConnectionPool$1;->a:Lokhttp3/ConnectionPool;

    .line 112
    .line 113
    monitor-enter v0

    .line 114
    :try_start_1
    iget-object v3, p0, Lokhttp3/ConnectionPool$1;->a:Lokhttp3/ConnectionPool;

    .line 115
    .line 116
    long-to-int v1, v1

    .line 117
    invoke-virtual {v3, v5, v6, v1}, Ljava/lang/Object;->wait(JI)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :catchall_0
    move-exception v1

    .line 122
    goto :goto_5

    .line 123
    :catch_0
    :goto_4
    :try_start_2
    monitor-exit v0

    .line 124
    goto :goto_0

    .line 125
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    throw v1

    .line 127
    :catchall_1
    move-exception v1

    .line 128
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 129
    throw v1
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
