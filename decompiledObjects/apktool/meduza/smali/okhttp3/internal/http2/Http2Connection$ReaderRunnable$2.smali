.class Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lokhttp3/internal/http2/Settings;

.field public final synthetic d:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;


# direct methods
.method public varargs constructor <init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;[Ljava/lang/Object;Lokhttp3/internal/http2/Settings;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->d:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->b:Z

    iput-object p3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->c:Lokhttp3/internal/http2/Settings;

    const-string p1, "OkHttp %s ACK Settings"

    invoke-direct {p0, p1, p2}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final k()V
    .locals 14

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->d:Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    .line 2
    .line 3
    iget-boolean v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$2;->c:Lokhttp3/internal/http2/Settings;

    .line 6
    .line 7
    iget-object v3, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 8
    .line 9
    iget-object v3, v3, Lokhttp3/internal/http2/Http2Connection;->C:Lokhttp3/internal/http2/Http2Writer;

    .line 10
    .line 11
    monitor-enter v3

    .line 12
    :try_start_0
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 13
    .line 14
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    :try_start_1
    iget-object v5, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 16
    .line 17
    iget-object v5, v5, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 18
    .line 19
    invoke-virtual {v5}, Lokhttp3/internal/http2/Settings;->a()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 27
    .line 28
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 29
    .line 30
    iput v6, v1, Lokhttp3/internal/http2/Settings;->a:I

    .line 31
    .line 32
    iget-object v1, v1, Lokhttp3/internal/http2/Settings;->b:[I

    .line 33
    .line 34
    invoke-static {v1, v6}, Ljava/util/Arrays;->fill([II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 38
    .line 39
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move v7, v6

    .line 45
    :goto_0
    const/16 v8, 0xa

    .line 46
    .line 47
    const/4 v9, 0x1

    .line 48
    if-ge v7, v8, :cond_3

    .line 49
    .line 50
    shl-int v8, v9, v7

    .line 51
    .line 52
    iget v10, v2, Lokhttp3/internal/http2/Settings;->a:I

    .line 53
    .line 54
    and-int/2addr v8, v10

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v9, v6

    .line 59
    :goto_1
    if-nez v9, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object v8, v2, Lokhttp3/internal/http2/Settings;->b:[I

    .line 63
    .line 64
    aget v8, v8, v7

    .line 65
    .line 66
    invoke-virtual {v1, v7, v8}, Lokhttp3/internal/http2/Settings;->b(II)V

    .line 67
    .line 68
    .line 69
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_3
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 76
    .line 77
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 78
    .line 79
    invoke-virtual {v1}, Lokhttp3/internal/http2/Settings;->a()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v2, -0x1

    .line 84
    const/4 v7, 0x0

    .line 85
    const-wide/16 v10, 0x0

    .line 86
    .line 87
    if-eq v1, v2, :cond_4

    .line 88
    .line 89
    if-eq v1, v5, :cond_4

    .line 90
    .line 91
    sub-int/2addr v1, v5

    .line 92
    int-to-long v1, v1

    .line 93
    iget-object v5, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 94
    .line 95
    iget-object v5, v5, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_5

    .line 102
    .line 103
    iget-object v5, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 104
    .line 105
    iget-object v5, v5, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v7, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 112
    .line 113
    iget-object v7, v7, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    new-array v7, v7, [Lokhttp3/internal/http2/Http2Stream;

    .line 120
    .line 121
    invoke-interface {v5, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    move-object v7, v5

    .line 126
    check-cast v7, [Lokhttp3/internal/http2/Http2Stream;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move-wide v1, v10

    .line 130
    :cond_5
    :goto_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    :try_start_2
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 132
    .line 133
    iget-object v5, v4, Lokhttp3/internal/http2/Http2Connection;->C:Lokhttp3/internal/http2/Http2Writer;

    .line 134
    .line 135
    iget-object v4, v4, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 136
    .line 137
    invoke-virtual {v5, v4}, Lokhttp3/internal/http2/Http2Writer;->f(Lokhttp3/internal/http2/Settings;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catch_0
    :try_start_3
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 142
    .line 143
    invoke-virtual {v4}, Lokhttp3/internal/http2/Http2Connection;->g()V

    .line 144
    .line 145
    .line 146
    :goto_4
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 147
    if-eqz v7, :cond_7

    .line 148
    .line 149
    array-length v3, v7

    .line 150
    move v4, v6

    .line 151
    :goto_5
    if-ge v4, v3, :cond_7

    .line 152
    .line 153
    aget-object v5, v7, v4

    .line 154
    .line 155
    monitor-enter v5

    .line 156
    :try_start_4
    iget-wide v12, v5, Lokhttp3/internal/http2/Http2Stream;->b:J

    .line 157
    .line 158
    add-long/2addr v12, v1

    .line 159
    iput-wide v12, v5, Lokhttp3/internal/http2/Http2Stream;->b:J

    .line 160
    .line 161
    cmp-long v8, v1, v10

    .line 162
    .line 163
    if-lez v8, :cond_6

    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V

    .line 166
    .line 167
    .line 168
    :cond_6
    monitor-exit v5

    .line 169
    add-int/lit8 v4, v4, 0x1

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 174
    throw v0

    .line 175
    :cond_7
    sget-object v1, Lokhttp3/internal/http2/Http2Connection;->F:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 176
    .line 177
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$3;

    .line 178
    .line 179
    new-array v3, v9, [Ljava/lang/Object;

    .line 180
    .line 181
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 182
    .line 183
    iget-object v4, v4, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 184
    .line 185
    aput-object v4, v3, v6

    .line 186
    .line 187
    invoke-direct {v2, v0, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$3;-><init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :goto_6
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 195
    :try_start_6
    throw v0

    .line 196
    :catchall_2
    move-exception v0

    .line 197
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 198
    throw v0
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
