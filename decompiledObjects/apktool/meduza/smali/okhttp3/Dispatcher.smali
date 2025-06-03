.class public final Lokhttp3/Dispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    iput v0, p0, Lokhttp3/Dispatcher;->a:I

    const/4 v0, 0x5

    iput v0, p0, Lokhttp3/Dispatcher;->b:I

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lokhttp3/Dispatcher;->f:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/RealCall$AsyncCall;)V
    .locals 1

    iget-object v0, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    monitor-enter p0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lokhttp3/Dispatcher;->b()V

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Call wasn\'t in-flight!"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lokhttp3/RealCall$AsyncCall;

    .line 25
    .line 26
    iget-object v4, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget v5, p0, Lokhttp3/Dispatcher;->a:I

    .line 33
    .line 34
    if-lt v4, v5, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-object v4, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lokhttp3/RealCall$AsyncCall;

    .line 54
    .line 55
    iget-object v5, v5, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 56
    .line 57
    iget-boolean v6, v5, Lokhttp3/RealCall;->f:Z

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v5, v5, Lokhttp3/RealCall;->e:Lokhttp3/Request;

    .line 63
    .line 64
    iget-object v5, v5, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 65
    .line 66
    iget-object v5, v5, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v6, v2, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 69
    .line 70
    iget-object v6, v6, Lokhttp3/RealCall;->e:Lokhttp3/Request;

    .line 71
    .line 72
    iget-object v6, v6, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 73
    .line 74
    iget-object v6, v6, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    iget v4, p0, Lokhttp3/Dispatcher;->b:I

    .line 86
    .line 87
    if-lt v3, v4, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    :goto_2
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 103
    :try_start_1
    iget-object v1, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iget-object v2, p0, Lokhttp3/Dispatcher;->f:Ljava/util/ArrayDeque;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 115
    add-int/2addr v1, v2

    .line 116
    :try_start_2
    monitor-exit p0

    .line 117
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    move v2, v3

    .line 123
    :goto_3
    if-ge v2, v1, :cond_7

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lokhttp3/RealCall$AsyncCall;

    .line 130
    .line 131
    monitor-enter p0

    .line 132
    :try_start_3
    iget-object v5, p0, Lokhttp3/Dispatcher;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 133
    .line 134
    if-nez v5, :cond_6

    .line 135
    .line 136
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const v8, 0x7fffffff

    .line 140
    .line 141
    .line 142
    const-wide/16 v9, 0x3c

    .line 143
    .line 144
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 145
    .line 146
    new-instance v12, Ljava/util/concurrent/SynchronousQueue;

    .line 147
    .line 148
    invoke-direct {v12}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v6, "OkHttp Dispatcher"

    .line 152
    .line 153
    invoke-static {v6, v3}, Lokhttp3/internal/Util;->v(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    move-object v6, v5

    .line 158
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 159
    .line 160
    .line 161
    iput-object v5, p0, Lokhttp3/Dispatcher;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 162
    .line 163
    :cond_6
    iget-object v5, p0, Lokhttp3/Dispatcher;->c:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    .line 165
    monitor-exit p0

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    :try_start_4
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    goto :goto_5

    .line 175
    :catch_0
    move-exception v5

    .line 176
    :try_start_5
    new-instance v6, Ljava/io/InterruptedIOException;

    .line 177
    .line 178
    const-string v7, "executor rejected"

    .line 179
    .line 180
    invoke-direct {v6, v7}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    iget-object v5, v4, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 187
    .line 188
    iget-object v5, v5, Lokhttp3/RealCall;->d:Lokhttp3/EventListener;

    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v5, v4, Lokhttp3/RealCall$AsyncCall;->b:Lokhttp3/Callback;

    .line 194
    .line 195
    iget-object v7, v4, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 196
    .line 197
    invoke-interface {v5, v7, v6}, Lokhttp3/Callback;->b(Lokhttp3/Call;Ljava/io/IOException;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 198
    .line 199
    .line 200
    iget-object v5, v4, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 201
    .line 202
    iget-object v5, v5, Lokhttp3/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 203
    .line 204
    iget-object v5, v5, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 205
    .line 206
    invoke-virtual {v5, v4}, Lokhttp3/Dispatcher;->a(Lokhttp3/RealCall$AsyncCall;)V

    .line 207
    .line 208
    .line 209
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :goto_5
    iget-object v1, v4, Lokhttp3/RealCall$AsyncCall;->c:Lokhttp3/RealCall;

    .line 213
    .line 214
    iget-object v1, v1, Lokhttp3/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 215
    .line 216
    iget-object v1, v1, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Lokhttp3/Dispatcher;->a(Lokhttp3/RealCall$AsyncCall;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    monitor-exit p0

    .line 224
    throw v0

    .line 225
    :cond_7
    return-void

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    :try_start_6
    monitor-exit p0

    .line 228
    throw v0

    .line 229
    :catchall_3
    move-exception v0

    .line 230
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 231
    throw v0
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
