.class public final Lokhttp3/internal/http/RetryAndFollowUpInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final a:Lokhttp3/OkHttpClient;

.field public volatile b:Lokhttp3/internal/connection/StreamAllocation;

.field public c:Ljava/lang/Object;

.field public volatile d:Z


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    return-void
.end method

.method public static e(Lokhttp3/Response;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-virtual {p0, v0}, Lokhttp3/Response;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return p1

    :cond_0
    const-string p1, "\\d+"

    invoke-virtual {p0, p1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    const p0, 0x7fffffff

    return p0
.end method

.method public static f(Lokhttp3/Response;Lokhttp3/HttpUrl;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object p0, p0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 4
    .line 5
    iget-object v0, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lokhttp3/HttpUrl;->e:I

    .line 16
    .line 17
    iget v1, p1, Lokhttp3/HttpUrl;->e:I

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    return p0
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


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 14

    .line 1
    iget-object v0, p1, Lokhttp3/internal/http/RealInterceptorChain;->f:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object v7, p1, Lokhttp3/internal/http/RealInterceptorChain;->g:Lokhttp3/Call;

    .line 4
    .line 5
    iget-object v8, p1, Lokhttp3/internal/http/RealInterceptorChain;->h:Lokhttp3/EventListener;

    .line 6
    .line 7
    new-instance v9, Lokhttp3/internal/connection/StreamAllocation;

    .line 8
    .line 9
    iget-object v1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 10
    .line 11
    iget-object v2, v1, Lokhttp3/OkHttpClient;->A:Lokhttp3/ConnectionPool;

    .line 12
    .line 13
    iget-object v1, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b(Lokhttp3/HttpUrl;)Lokhttp3/Address;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v6, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v1, v9

    .line 22
    move-object v4, v7

    .line 23
    move-object v5, v8

    .line 24
    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/connection/StreamAllocation;-><init>(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v9, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    move v2, v10

    .line 32
    move-object v1, v11

    .line 33
    :goto_0
    iget-boolean v3, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->d:Z

    .line 34
    .line 35
    if-nez v3, :cond_a

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p1, v0, v9, v11, v11}, Lokhttp3/internal/http/RealInterceptorChain;->d(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    new-instance v3, Lokhttp3/Response$Builder;

    .line 44
    .line 45
    invoke-direct {v3, v0}, Lokhttp3/Response$Builder;-><init>(Lokhttp3/Response;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lokhttp3/Response$Builder;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lokhttp3/Response$Builder;-><init>(Lokhttp3/Response;)V

    .line 51
    .line 52
    .line 53
    iput-object v11, v0, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 54
    .line 55
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, v0, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    .line 60
    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    iput-object v0, v3, Lokhttp3/Response$Builder;->j:Lokhttp3/Response;

    .line 64
    .line 65
    invoke-virtual {v3}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    const-string v0, "priorResponse.body != null"

    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_1
    :goto_1
    :try_start_1
    iget-object v1, v9, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c(Lokhttp3/Response;Lokhttp3/Route;)Lokhttp3/Request;

    .line 81
    .line 82
    .line 83
    move-result-object v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    if-nez v12, :cond_2

    .line 85
    .line 86
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    iget-object v1, v0, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    .line 91
    .line 92
    invoke-static {v1}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v13, v2, 0x1

    .line 96
    .line 97
    const/16 v1, 0x14

    .line 98
    .line 99
    if-gt v13, v1, :cond_6

    .line 100
    .line 101
    iget-object v1, v12, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 102
    .line 103
    instance-of v1, v1, Lokhttp3/internal/http/UnrepeatableRequestBody;

    .line 104
    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    iget-object v1, v12, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->f(Lokhttp3/Response;Lokhttp3/HttpUrl;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_3

    .line 114
    .line 115
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 116
    .line 117
    .line 118
    new-instance v9, Lokhttp3/internal/connection/StreamAllocation;

    .line 119
    .line 120
    iget-object v1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 121
    .line 122
    iget-object v2, v1, Lokhttp3/OkHttpClient;->A:Lokhttp3/ConnectionPool;

    .line 123
    .line 124
    iget-object v1, v12, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b(Lokhttp3/HttpUrl;)Lokhttp3/Address;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-object v6, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v1, v9

    .line 133
    move-object v4, v7

    .line 134
    move-object v5, v8

    .line 135
    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/connection/StreamAllocation;-><init>(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iput-object v9, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    iget-object v1, v9, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 142
    .line 143
    monitor-enter v1

    .line 144
    :try_start_2
    iget-object v2, v9, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    .line 145
    .line 146
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    if-nez v2, :cond_4

    .line 148
    .line 149
    :goto_2
    move-object v1, v0

    .line 150
    move-object v0, v12

    .line 151
    move v2, v13

    .line 152
    goto :goto_0

    .line 153
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v2, "Closing the body of "

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, " didn\'t close its backing stream. Bad interceptor?"

    .line 169
    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :catchall_0
    move-exception p1

    .line 182
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 183
    throw p1

    .line 184
    :cond_5
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 185
    .line 186
    .line 187
    new-instance p1, Ljava/net/HttpRetryException;

    .line 188
    .line 189
    iget v0, v0, Lokhttp3/Response;->c:I

    .line 190
    .line 191
    const-string v1, "Cannot retry streamed HTTP body"

    .line 192
    .line 193
    invoke-direct {p1, v1, v0}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_6
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 198
    .line 199
    .line 200
    new-instance p1, Ljava/net/ProtocolException;

    .line 201
    .line 202
    const-string v0, "Too many follow-up requests: "

    .line 203
    .line 204
    invoke-static {v0, v13}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :catch_0
    move-exception p1

    .line 213
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :catchall_1
    move-exception p1

    .line 218
    goto :goto_4

    .line 219
    :catch_1
    move-exception v3

    .line 220
    :try_start_4
    instance-of v4, v3, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 221
    .line 222
    if-nez v4, :cond_7

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    goto :goto_3

    .line 226
    :cond_7
    move v4, v10

    .line 227
    :goto_3
    invoke-virtual {p0, v3, v9, v4, v0}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->d(Ljava/io/IOException;Lokhttp3/internal/connection/StreamAllocation;ZLokhttp3/Request;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-eqz v4, :cond_8

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_8
    throw v3

    .line 236
    :catch_2
    move-exception v3

    .line 237
    iget-object v4, v3, Lokhttp3/internal/connection/RouteException;->b:Ljava/io/IOException;

    .line 238
    .line 239
    invoke-virtual {p0, v4, v9, v10, v0}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->d(Ljava/io/IOException;Lokhttp3/internal/connection/StreamAllocation;ZLokhttp3/Request;)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_9

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_9
    iget-object p1, v3, Lokhttp3/internal/connection/RouteException;->a:Ljava/io/IOException;

    .line 248
    .line 249
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 250
    :goto_4
    invoke-virtual {v9, v11}, Lokhttp3/internal/connection/StreamAllocation;->h(Ljava/io/IOException;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 254
    .line 255
    .line 256
    throw p1

    .line 257
    :cond_a
    invoke-virtual {v9}, Lokhttp3/internal/connection/StreamAllocation;->g()V

    .line 258
    .line 259
    .line 260
    new-instance p1, Ljava/io/IOException;

    .line 261
    .line 262
    const-string v0, "Canceled"

    .line 263
    .line 264
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1
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

.method public final b(Lokhttp3/HttpUrl;)Lokhttp3/Address;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "https"

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 17
    .line 18
    iget-object v3, v2, Lokhttp3/OkHttpClient;->u:Ljavax/net/ssl/SSLSocketFactory;

    .line 19
    .line 20
    iget-object v4, v2, Lokhttp3/OkHttpClient;->w:Ljavax/net/ssl/HostnameVerifier;

    .line 21
    .line 22
    iget-object v2, v2, Lokhttp3/OkHttpClient;->x:Lokhttp3/CertificatePinner;

    .line 23
    .line 24
    move-object v12, v2

    .line 25
    move-object v10, v3

    .line 26
    move-object v11, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v10, v3

    .line 29
    move-object v11, v10

    .line 30
    move-object v12, v11

    .line 31
    :goto_0
    new-instance v2, Lokhttp3/Address;

    .line 32
    .line 33
    iget-object v6, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 34
    .line 35
    iget v7, v1, Lokhttp3/HttpUrl;->e:I

    .line 36
    .line 37
    iget-object v1, v0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 38
    .line 39
    iget-object v8, v1, Lokhttp3/OkHttpClient;->B:Lokhttp3/Dns;

    .line 40
    .line 41
    iget-object v9, v1, Lokhttp3/OkHttpClient;->t:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    iget-object v13, v1, Lokhttp3/OkHttpClient;->y:Lokhttp3/Authenticator;

    .line 44
    .line 45
    iget-object v14, v1, Lokhttp3/OkHttpClient;->b:Ljava/net/Proxy;

    .line 46
    .line 47
    iget-object v15, v1, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    .line 48
    .line 49
    iget-object v3, v1, Lokhttp3/OkHttpClient;->d:Ljava/util/List;

    .line 50
    .line 51
    iget-object v1, v1, Lokhttp3/OkHttpClient;->p:Ljava/net/ProxySelector;

    .line 52
    .line 53
    move-object v5, v2

    .line 54
    move-object/from16 v16, v3

    .line 55
    .line 56
    move-object/from16 v17, v1

    .line 57
    .line 58
    invoke-direct/range {v5 .. v17}, Lokhttp3/Address;-><init>(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 59
    .line 60
    .line 61
    return-object v2
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

.method public final c(Lokhttp3/Response;Lokhttp3/Route;)Lokhttp3/Request;
    .locals 6

    .line 1
    iget v0, p1, Lokhttp3/Response;->c:I

    .line 2
    .line 3
    iget-object v1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 4
    .line 5
    iget-object v2, v1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/16 v3, 0x133

    .line 8
    .line 9
    const-string v4, "GET"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-eq v0, v3, :cond_b

    .line 13
    .line 14
    const/16 v3, 0x134

    .line 15
    .line 16
    if-eq v0, v3, :cond_b

    .line 17
    .line 18
    const/16 v3, 0x191

    .line 19
    .line 20
    if-eq v0, v3, :cond_a

    .line 21
    .line 22
    const/16 v3, 0x1f7

    .line 23
    .line 24
    if-eq v0, v3, :cond_7

    .line 25
    .line 26
    const/16 v3, 0x197

    .line 27
    .line 28
    if-eq v0, v3, :cond_5

    .line 29
    .line 30
    const/16 p2, 0x198

    .line 31
    .line 32
    if-eq v0, p2, :cond_0

    .line 33
    .line 34
    packed-switch v0, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    return-object v5

    .line 38
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 39
    .line 40
    iget-boolean v0, v0, Lokhttp3/OkHttpClient;->E:Z

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    return-object v5

    .line 45
    :cond_1
    iget-object v0, v1, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 46
    .line 47
    instance-of v0, v0, Lokhttp3/internal/http/UnrepeatableRequestBody;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    return-object v5

    .line 52
    :cond_2
    iget-object v0, p1, Lokhttp3/Response;->r:Lokhttp3/Response;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget v0, v0, Lokhttp3/Response;->c:I

    .line 57
    .line 58
    if-ne v0, p2, :cond_3

    .line 59
    .line 60
    return-object v5

    .line 61
    :cond_3
    const/4 p2, 0x0

    .line 62
    invoke-static {p1, p2}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->e(Lokhttp3/Response;I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-lez p2, :cond_4

    .line 67
    .line 68
    return-object v5

    .line 69
    :cond_4
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_5
    iget-object p1, p2, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 79
    .line 80
    if-ne p1, p2, :cond_6

    .line 81
    .line 82
    iget-object p1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 83
    .line 84
    iget-object p1, p1, Lokhttp3/OkHttpClient;->y:Lokhttp3/Authenticator;

    .line 85
    .line 86
    :goto_0
    invoke-interface {p1}, Lokhttp3/Authenticator;->a()V

    .line 87
    .line 88
    .line 89
    return-object v5

    .line 90
    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    .line 91
    .line 92
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_7
    iget-object p2, p1, Lokhttp3/Response;->r:Lokhttp3/Response;

    .line 99
    .line 100
    if-eqz p2, :cond_8

    .line 101
    .line 102
    iget p2, p2, Lokhttp3/Response;->c:I

    .line 103
    .line 104
    if-ne p2, v3, :cond_8

    .line 105
    .line 106
    return-object v5

    .line 107
    :cond_8
    const p2, 0x7fffffff

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->e(Lokhttp3/Response;I)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_9

    .line 115
    .line 116
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_9
    return-object v5

    .line 120
    :cond_a
    iget-object p1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 121
    .line 122
    iget-object p1, p1, Lokhttp3/OkHttpClient;->z:Lokhttp3/Authenticator;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_b
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-nez p2, :cond_c

    .line 130
    .line 131
    const-string p2, "HEAD"

    .line 132
    .line 133
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_c

    .line 138
    .line 139
    return-object v5

    .line 140
    :cond_c
    :pswitch_0
    iget-object p2, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 141
    .line 142
    iget-boolean p2, p2, Lokhttp3/OkHttpClient;->D:Z

    .line 143
    .line 144
    if-nez p2, :cond_d

    .line 145
    .line 146
    return-object v5

    .line 147
    :cond_d
    const-string p2, "Location"

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Lokhttp3/Response;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    if-nez p2, :cond_e

    .line 154
    .line 155
    return-object v5

    .line 156
    :cond_e
    iget-object v0, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 157
    .line 158
    iget-object v0, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    :try_start_0
    new-instance v1, Lokhttp3/HttpUrl$Builder;

    .line 164
    .line 165
    invoke-direct {v1}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v0, p2}, Lokhttp3/HttpUrl$Builder;->b(Lokhttp3/HttpUrl;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catch_0
    move-object v1, v5

    .line 173
    :goto_1
    if-eqz v1, :cond_f

    .line 174
    .line 175
    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->a()Lokhttp3/HttpUrl;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    goto :goto_2

    .line 180
    :cond_f
    move-object p2, v5

    .line 181
    :goto_2
    if-nez p2, :cond_10

    .line 182
    .line 183
    return-object v5

    .line 184
    :cond_10
    iget-object v0, p2, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 187
    .line 188
    iget-object v1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 189
    .line 190
    iget-object v1, v1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_11

    .line 197
    .line 198
    iget-object v0, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 199
    .line 200
    iget-boolean v0, v0, Lokhttp3/OkHttpClient;->C:Z

    .line 201
    .line 202
    if-nez v0, :cond_11

    .line 203
    .line 204
    return-object v5

    .line 205
    :cond_11
    iget-object v0, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v1, Lokhttp3/Request$Builder;

    .line 211
    .line 212
    invoke-direct {v1, v0}, Lokhttp3/Request$Builder;-><init>(Lokhttp3/Request;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, Lokhttp3/internal/http/HttpMethod;->b(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_14

    .line 220
    .line 221
    const-string v0, "PROPFIND"

    .line 222
    .line 223
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    xor-int/lit8 v0, v0, 0x1

    .line 232
    .line 233
    if-eqz v0, :cond_12

    .line 234
    .line 235
    invoke-virtual {v1, v4, v5}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_12
    if-eqz v3, :cond_13

    .line 240
    .line 241
    iget-object v0, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 242
    .line 243
    iget-object v5, v0, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 244
    .line 245
    :cond_13
    invoke-virtual {v1, v2, v5}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 246
    .line 247
    .line 248
    :goto_3
    if-nez v3, :cond_14

    .line 249
    .line 250
    const-string v0, "Transfer-Encoding"

    .line 251
    .line 252
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->c(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-string v0, "Content-Length"

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->c(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const-string v0, "Content-Type"

    .line 261
    .line 262
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->c(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_14
    invoke-static {p1, p2}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->f(Lokhttp3/Response;Lokhttp3/HttpUrl;)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-nez p1, :cond_15

    .line 270
    .line 271
    const-string p1, "Authorization"

    .line 272
    .line 273
    invoke-virtual {v1, p1}, Lokhttp3/Request$Builder;->c(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :cond_15
    iput-object p2, v1, Lokhttp3/Request$Builder;->a:Lokhttp3/HttpUrl;

    .line 277
    .line 278
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->a()Lokhttp3/Request;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    return-object p1

    .line 283
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final d(Ljava/io/IOException;Lokhttp3/internal/connection/StreamAllocation;ZLokhttp3/Request;)Z
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, Lokhttp3/internal/connection/StreamAllocation;->h(Ljava/io/IOException;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 5
    .line 6
    iget-boolean v0, v0, Lokhttp3/OkHttpClient;->E:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    if-eqz p3, :cond_3

    .line 14
    .line 15
    iget-object p4, p4, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 16
    .line 17
    instance-of p4, p4, Lokhttp3/internal/http/UnrepeatableRequestBody;

    .line 18
    .line 19
    if-nez p4, :cond_2

    .line 20
    .line 21
    instance-of p4, p1, Ljava/io/FileNotFoundException;

    .line 22
    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p4, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    move p4, v0

    .line 29
    :goto_1
    if-eqz p4, :cond_3

    .line 30
    .line 31
    return v1

    .line 32
    :cond_3
    instance-of p4, p1, Ljava/net/ProtocolException;

    .line 33
    .line 34
    if-eqz p4, :cond_4

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_4
    instance-of p4, p1, Ljava/io/InterruptedIOException;

    .line 38
    .line 39
    if-eqz p4, :cond_5

    .line 40
    .line 41
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 42
    .line 43
    if-eqz p1, :cond_7

    .line 44
    .line 45
    if-nez p3, :cond_7

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 49
    .line 50
    if-eqz p3, :cond_6

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 57
    .line 58
    if-eqz p3, :cond_6

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_6
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 62
    .line 63
    if-eqz p1, :cond_8

    .line 64
    .line 65
    :cond_7
    :goto_2
    move p1, v1

    .line 66
    goto :goto_4

    .line 67
    :cond_8
    :goto_3
    move p1, v0

    .line 68
    :goto_4
    if-nez p1, :cond_9

    .line 69
    .line 70
    return v1

    .line 71
    :cond_9
    iget-object p1, p2, Lokhttp3/internal/connection/StreamAllocation;->c:Lokhttp3/Route;

    .line 72
    .line 73
    if-nez p1, :cond_10

    .line 74
    .line 75
    iget-object p1, p2, Lokhttp3/internal/connection/StreamAllocation;->b:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 76
    .line 77
    if-eqz p1, :cond_b

    .line 78
    .line 79
    iget p3, p1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 80
    .line 81
    iget-object p1, p1, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-ge p3, p1, :cond_a

    .line 88
    .line 89
    move p1, v0

    .line 90
    goto :goto_5

    .line 91
    :cond_a
    move p1, v1

    .line 92
    :goto_5
    if-nez p1, :cond_10

    .line 93
    .line 94
    :cond_b
    iget-object p1, p2, Lokhttp3/internal/connection/StreamAllocation;->h:Lokhttp3/internal/connection/RouteSelector;

    .line 95
    .line 96
    iget p2, p1, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 97
    .line 98
    iget-object p3, p1, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-ge p2, p3, :cond_c

    .line 105
    .line 106
    move p2, v0

    .line 107
    goto :goto_6

    .line 108
    :cond_c
    move p2, v1

    .line 109
    :goto_6
    if-nez p2, :cond_e

    .line 110
    .line 111
    iget-object p1, p1, Lokhttp3/internal/connection/RouteSelector;->h:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_d

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_d
    move p1, v1

    .line 121
    goto :goto_8

    .line 122
    :cond_e
    :goto_7
    move p1, v0

    .line 123
    :goto_8
    if-eqz p1, :cond_f

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_f
    move p1, v1

    .line 127
    goto :goto_a

    .line 128
    :cond_10
    :goto_9
    move p1, v0

    .line 129
    :goto_a
    if-nez p1, :cond_11

    .line 130
    .line 131
    return v1

    .line 132
    :cond_11
    return v0
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
