.class public final Lokhttp3/internal/http/RealInterceptorChain;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor$Chain;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lokhttp3/internal/connection/StreamAllocation;

.field public final c:Lokhttp3/internal/http/HttpCodec;

.field public final d:Lokhttp3/internal/connection/RealConnection;

.field public final e:I

.field public final f:Lokhttp3/Request;

.field public final g:Lokhttp3/Call;

.field public final h:Lokhttp3/EventListener;

.field public final i:I

.field public final j:I

.field public final k:I

.field public l:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;ILokhttp3/Request;Lokhttp3/Call;Lokhttp3/EventListener;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;",
            "Lokhttp3/internal/connection/StreamAllocation;",
            "Lokhttp3/internal/http/HttpCodec;",
            "Lokhttp3/internal/connection/RealConnection;",
            "I",
            "Lokhttp3/Request;",
            "Lokhttp3/Call;",
            "Lokhttp3/EventListener;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    iput-object p4, p0, Lokhttp3/internal/http/RealInterceptorChain;->d:Lokhttp3/internal/connection/RealConnection;

    iput-object p2, p0, Lokhttp3/internal/http/RealInterceptorChain;->b:Lokhttp3/internal/connection/StreamAllocation;

    iput-object p3, p0, Lokhttp3/internal/http/RealInterceptorChain;->c:Lokhttp3/internal/http/HttpCodec;

    iput p5, p0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    iput-object p6, p0, Lokhttp3/internal/http/RealInterceptorChain;->f:Lokhttp3/Request;

    iput-object p7, p0, Lokhttp3/internal/http/RealInterceptorChain;->g:Lokhttp3/Call;

    iput-object p8, p0, Lokhttp3/internal/http/RealInterceptorChain;->h:Lokhttp3/EventListener;

    iput p9, p0, Lokhttp3/internal/http/RealInterceptorChain;->i:I

    iput p10, p0, Lokhttp3/internal/http/RealInterceptorChain;->j:I

    iput p11, p0, Lokhttp3/internal/http/RealInterceptorChain;->k:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lokhttp3/internal/http/RealInterceptorChain;->j:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lokhttp3/internal/http/RealInterceptorChain;->k:I

    return v0
.end method

.method public final c(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/http/RealInterceptorChain;->b:Lokhttp3/internal/connection/StreamAllocation;

    iget-object v1, p0, Lokhttp3/internal/http/RealInterceptorChain;->c:Lokhttp3/internal/http/HttpCodec;

    iget-object v2, p0, Lokhttp3/internal/http/RealInterceptorChain;->d:Lokhttp3/internal/connection/RealConnection;

    invoke-virtual {p0, p1, v0, v1, v2}, Lokhttp3/internal/http/RealInterceptorChain;->d(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    .line 4
    .line 5
    iget-object v2, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_8

    .line 12
    .line 13
    iget v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->l:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    add-int/2addr v1, v2

    .line 17
    iput v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->l:I

    .line 18
    .line 19
    iget-object v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->c:Lokhttp3/internal/http/HttpCodec;

    .line 20
    .line 21
    const-string v3, "network interceptor "

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->d:Lokhttp3/internal/connection/RealConnection;

    .line 26
    .line 27
    move-object/from16 v10, p1

    .line 28
    .line 29
    iget-object v4, v10, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Lokhttp3/internal/connection/RealConnection;->j(Lokhttp3/HttpUrl;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    .line 45
    .line 46
    iget v5, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    .line 47
    .line 48
    sub-int/2addr v5, v2

    .line 49
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, " must retain the same host and port"

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_1
    move-object/from16 v10, p1

    .line 70
    .line 71
    :goto_0
    iget-object v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->c:Lokhttp3/internal/http/HttpCodec;

    .line 72
    .line 73
    const-string v15, " must call proceed() exactly once"

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->l:I

    .line 78
    .line 79
    if-gt v1, v2, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v4, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    .line 89
    .line 90
    iget v5, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    .line 91
    .line 92
    sub-int/2addr v5, v2

    .line 93
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :cond_3
    :goto_1
    new-instance v1, Lokhttp3/internal/http/RealInterceptorChain;

    .line 112
    .line 113
    iget-object v2, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    .line 114
    .line 115
    iget v14, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    .line 116
    .line 117
    add-int/lit8 v9, v14, 0x1

    .line 118
    .line 119
    iget-object v11, v0, Lokhttp3/internal/http/RealInterceptorChain;->g:Lokhttp3/Call;

    .line 120
    .line 121
    iget-object v12, v0, Lokhttp3/internal/http/RealInterceptorChain;->h:Lokhttp3/EventListener;

    .line 122
    .line 123
    iget v13, v0, Lokhttp3/internal/http/RealInterceptorChain;->i:I

    .line 124
    .line 125
    iget v8, v0, Lokhttp3/internal/http/RealInterceptorChain;->j:I

    .line 126
    .line 127
    iget v7, v0, Lokhttp3/internal/http/RealInterceptorChain;->k:I

    .line 128
    .line 129
    move-object v4, v1

    .line 130
    move-object v5, v2

    .line 131
    move-object/from16 v6, p2

    .line 132
    .line 133
    move/from16 v16, v7

    .line 134
    .line 135
    move-object/from16 v7, p3

    .line 136
    .line 137
    move/from16 v17, v8

    .line 138
    .line 139
    move-object/from16 v8, p4

    .line 140
    .line 141
    move-object/from16 v10, p1

    .line 142
    .line 143
    move-object/from16 v18, v3

    .line 144
    .line 145
    move v3, v14

    .line 146
    move/from16 v14, v17

    .line 147
    .line 148
    move-object/from16 v19, v15

    .line 149
    .line 150
    move/from16 v15, v16

    .line 151
    .line 152
    invoke-direct/range {v4 .. v15}, Lokhttp3/internal/http/RealInterceptorChain;-><init>(Ljava/util/List;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;ILokhttp3/Request;Lokhttp3/Call;Lokhttp3/EventListener;III)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Lokhttp3/Interceptor;

    .line 160
    .line 161
    invoke-interface {v2, v1}, Lokhttp3/Interceptor;->a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-eqz p3, :cond_5

    .line 166
    .line 167
    iget v4, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:I

    .line 168
    .line 169
    const/4 v5, 0x1

    .line 170
    add-int/2addr v4, v5

    .line 171
    iget-object v6, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-ge v4, v6, :cond_5

    .line 178
    .line 179
    iget v1, v1, Lokhttp3/internal/http/RealInterceptorChain;->l:I

    .line 180
    .line 181
    if-ne v1, v5, :cond_4

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 185
    .line 186
    new-instance v3, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    move-object/from16 v4, v18

    .line 192
    .line 193
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    move-object/from16 v2, v19

    .line 200
    .line 201
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v1

    .line 212
    :cond_5
    :goto_2
    const-string v1, "interceptor "

    .line 213
    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    iget-object v4, v3, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    .line 217
    .line 218
    if-eqz v4, :cond_6

    .line 219
    .line 220
    return-object v3

    .line 221
    :cond_6
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    new-instance v4, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v1, " returned a response with no body"

    .line 235
    .line 236
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v3

    .line 247
    :cond_7
    new-instance v3, Ljava/lang/NullPointerException;

    .line 248
    .line 249
    new-instance v4, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v1, " returned null"

    .line 261
    .line 262
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-direct {v3, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v3

    .line 273
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 276
    .line 277
    .line 278
    throw v1
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
