.class public final Lo9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/e;->a(Ljava/net/URL;Ljava/lang/Object;Lo9/n;Lo9/m;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lo9/p;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lo9/e;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lo9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lo9/p;",
            ">;",
            "Lo9/e;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lo9/e$a;->b:Lo9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 7

    .line 1
    const-string v0, "ignored"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lo9/f$a;->a:Lo9/f$a;

    .line 12
    .line 13
    iget p1, p2, Lokhttp3/Response;->c:I

    .line 14
    .line 15
    const/16 v0, 0xc8

    .line 16
    .line 17
    if-eq p1, v0, :cond_8

    .line 18
    .line 19
    const/16 v0, 0x199

    .line 20
    .line 21
    if-eq p1, v0, :cond_7

    .line 22
    .line 23
    const/16 v0, 0x1ad

    .line 24
    .line 25
    if-eq p1, v0, :cond_6

    .line 26
    .line 27
    const/16 v0, 0x190

    .line 28
    .line 29
    if-eq p1, v0, :cond_5

    .line 30
    .line 31
    const/16 v0, 0x191

    .line 32
    .line 33
    if-eq p1, v0, :cond_4

    .line 34
    .line 35
    const/16 v0, 0x193

    .line 36
    .line 37
    if-eq p1, v0, :cond_3

    .line 38
    .line 39
    const/16 v0, 0x194

    .line 40
    .line 41
    if-eq p1, v0, :cond_2

    .line 42
    .line 43
    const/16 v0, 0x1f7

    .line 44
    .line 45
    if-eq p1, v0, :cond_1

    .line 46
    .line 47
    const/16 v0, 0x1f8

    .line 48
    .line 49
    if-eq p1, v0, :cond_0

    .line 50
    .line 51
    packed-switch p1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    sget-object p1, Lo9/f$a;->c:Lo9/f$a;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_0
    sget-object p1, Lo9/f$a;->r:Lo9/f$a;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    sget-object p1, Lo9/f$a;->s:Lo9/f$a;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    sget-object p1, Lo9/f$a;->b:Lo9/f$a;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object p1, Lo9/f$a;->e:Lo9/f$a;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object p1, Lo9/f$a;->t:Lo9/f$a;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object p1, Lo9/f$a;->f:Lo9/f$a;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    sget-object p1, Lo9/f$a;->o:Lo9/f$a;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    sget-object p1, Lo9/f$a;->u:Lo9/f$a;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    sget-object p1, Lo9/f$a;->d:Lo9/f$a;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_6
    sget-object p1, Lo9/f$a;->p:Lo9/f$a;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_7
    sget-object p1, Lo9/f$a;->q:Lo9/f$a;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    sget-object p1, Lo9/f$a;->a:Lo9/f$a;

    .line 91
    .line 92
    :goto_0
    iget-object p2, p2, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    .line 93
    .line 94
    invoke-static {p2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Lokhttp3/ResponseBody;->H()Lxc/h;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/ResponseBody;->g()Lokhttp3/MediaType;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-eqz p2, :cond_9

    .line 106
    .line 107
    sget-object v1, Lokhttp3/internal/Util;->i:Ljava/nio/charset/Charset;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    :try_start_1
    iget-object p2, p2, Lokhttp3/MediaType;->b:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz p2, :cond_a

    .line 112
    .line 113
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 114
    .line 115
    .line 116
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    goto :goto_1

    .line 118
    :cond_9
    :try_start_2
    sget-object v1, Lokhttp3/internal/Util;->i:Ljava/nio/charset/Charset;

    .line 119
    .line 120
    :catch_0
    :cond_a
    :goto_1
    invoke-static {v0, v1}, Lokhttp3/internal/Util;->b(Lxc/h;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-interface {v0, p2}, Lxc/h;->S(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    invoke-static {v0}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    .line 129
    .line 130
    .line 131
    sget v0, Lo9/f;->c:I

    .line 132
    .line 133
    iget-object v0, p0, Lo9/e$a;->b:Lo9/e;

    .line 134
    .line 135
    iget-object v0, v0, Lo9/e;->c:Lo9/q;

    .line 136
    .line 137
    const-string v1, "error.getString(\"message\")"

    .line 138
    .line 139
    const-string v2, "status"

    .line 140
    .line 141
    const-string v3, "message"

    .line 142
    .line 143
    const-string v4, "serializer"

    .line 144
    .line 145
    invoke-static {v0, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const/4 v4, 0x0

    .line 153
    :try_start_3
    new-instance v5, Lorg/json/JSONObject;

    .line 154
    .line 155
    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v6, "error"

    .line 159
    .line 160
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    instance-of v6, v6, Ljava/lang/String;

    .line 169
    .line 170
    if-eqz v6, :cond_b

    .line 171
    .line 172
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v6, "error.getString(\"status\")"

    .line 177
    .line 178
    invoke-static {v2, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v2}, Lo9/f$a;->valueOf(Ljava/lang/String;)Lo9/f$a;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :cond_b
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    instance-of v2, v2, Ljava/lang/String;

    .line 194
    .line 195
    if-eqz v2, :cond_d

    .line 196
    .line 197
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-static {v2, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-nez v2, :cond_c

    .line 209
    .line 210
    const/4 v2, 0x1

    .line 211
    goto :goto_2

    .line 212
    :cond_c
    const/4 v2, 0x0

    .line 213
    :goto_2
    if-nez v2, :cond_d

    .line 214
    .line 215
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {v2, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    move-object v0, v2

    .line 223
    :cond_d
    const-string v1, "details"

    .line 224
    .line 225
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 229
    if-eqz v1, :cond_e

    .line 230
    .line 231
    :try_start_4
    invoke-static {v1}, Lo9/q;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 235
    goto :goto_3

    .line 236
    :catch_1
    move-object v1, v4

    .line 237
    goto :goto_3

    .line 238
    :catch_2
    move-object v1, v4

    .line 239
    :catch_3
    sget-object p1, Lo9/f$a;->s:Lo9/f$a;

    .line 240
    .line 241
    const-string v0, "INTERNAL"

    .line 242
    .line 243
    :catch_4
    :cond_e
    :goto_3
    sget-object v2, Lo9/f$a;->a:Lo9/f$a;

    .line 244
    .line 245
    if-ne p1, v2, :cond_f

    .line 246
    .line 247
    move-object v2, v4

    .line 248
    goto :goto_4

    .line 249
    :cond_f
    new-instance v2, Lo9/f;

    .line 250
    .line 251
    invoke-direct {v2, v0, p1, v1}, Lo9/f;-><init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :goto_4
    if-eqz v2, :cond_10

    .line 255
    .line 256
    iget-object p1, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 257
    .line 258
    invoke-virtual {p1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_10
    :try_start_5
    new-instance p1, Lorg/json/JSONObject;

    .line 263
    .line 264
    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 265
    .line 266
    .line 267
    const-string p2, "data"

    .line 268
    .line 269
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    if-nez p2, :cond_11

    .line 274
    .line 275
    const-string p2, "result"

    .line 276
    .line 277
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    :cond_11
    if-nez p2, :cond_12

    .line 282
    .line 283
    new-instance p1, Lo9/f;

    .line 284
    .line 285
    sget-object p2, Lo9/f$a;->s:Lo9/f$a;

    .line 286
    .line 287
    const-string v0, "Response is missing data field."

    .line 288
    .line 289
    invoke-direct {p1, v0, p2, v4}, Lo9/f;-><init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object p2, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 293
    .line 294
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_12
    new-instance p1, Lo9/p;

    .line 299
    .line 300
    iget-object v0, p0, Lo9/e$a;->b:Lo9/e;

    .line 301
    .line 302
    iget-object v0, v0, Lo9/e;->c:Lo9/q;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {p2}, Lo9/q;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-direct {p1, p2}, Lo9/p;-><init>(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object p2, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 315
    .line 316
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :catch_5
    move-exception p1

    .line 321
    new-instance p2, Lo9/f;

    .line 322
    .line 323
    sget-object v0, Lo9/f$a;->s:Lo9/f$a;

    .line 324
    .line 325
    const-string v1, "Response is not valid JSON object."

    .line 326
    .line 327
    invoke-direct {p2, v1, v0, p1}, Lo9/f;-><init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    iget-object p1, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 331
    .line 332
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :catchall_0
    move-exception p1

    .line 337
    invoke-static {v0}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    .line 338
    .line 339
    .line 340
    throw p1

    .line 341
    :pswitch_data_0
    .packed-switch 0x1f3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final b(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 2

    const-string v0, "ignored"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p2, Ljava/io/InterruptedIOException;

    if-eqz p1, :cond_0

    new-instance p1, Lo9/f;

    sget-object v0, Lo9/f$a;->e:Lo9/f$a;

    const-string v1, "DEADLINE_EXCEEDED"

    invoke-direct {p1, v1, v0, p2}, Lo9/f;-><init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lo9/f;

    sget-object v0, Lo9/f$a;->s:Lo9/f$a;

    const-string v1, "INTERNAL"

    invoke-direct {p1, v1, v0, p2}, Lo9/f;-><init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Throwable;)V

    :goto_0
    iget-object p2, p0, Lo9/e$a;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
