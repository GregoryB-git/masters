.class Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "SourceFile"


# static fields
.field private static final DATA_TYPE_ARRAY_REMOVE:B = -0x47t

.field private static final DATA_TYPE_ARRAY_UNION:B = -0x48t

.field private static final DATA_TYPE_BLOB:B = -0x49t

.field private static final DATA_TYPE_DATE_TIME:B = -0x4ct

.field private static final DATA_TYPE_DELETE:B = -0x46t

.field private static final DATA_TYPE_DOCUMENT_ID:B = -0x41t

.field private static final DATA_TYPE_DOCUMENT_REFERENCE:B = -0x4at

.field private static final DATA_TYPE_FIELD_PATH:B = -0x40t

.field private static final DATA_TYPE_FIRESTORE_INSTANCE:B = -0x3ct

.field private static final DATA_TYPE_FIRESTORE_QUERY:B = -0x3bt

.field private static final DATA_TYPE_FIRESTORE_SETTINGS:B = -0x3at

.field private static final DATA_TYPE_GEO_POINT:B = -0x4bt

.field private static final DATA_TYPE_INCREMENT_DOUBLE:B = -0x43t

.field private static final DATA_TYPE_INCREMENT_INTEGER:B = -0x42t

.field private static final DATA_TYPE_INFINITY:B = -0x3et

.field private static final DATA_TYPE_NAN:B = -0x3ft

.field private static final DATA_TYPE_NEGATIVE_INFINITY:B = -0x3dt

.field private static final DATA_TYPE_SERVER_TIMESTAMP:B = -0x45t

.field private static final DATA_TYPE_TIMESTAMP:B = -0x44t

.field private static final DATA_TYPE_VECTOR_VALUE:B = -0x39t

.field public static final INSTANCE:Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->INSTANCE:Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    return-void
.end method

.method private filterFromJson(Ljava/util/Map;)Lcom/google/firebase/firestore/e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/e;"
        }
    .end annotation

    .line 1
    const-string v0, "fieldPath"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "Invalid operator"

    .line 11
    .line 12
    const-string v6, "op"

    .line 13
    .line 14
    if-eqz v1, :cond_a

    .line 15
    .line 16
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ld9/n;

    .line 27
    .line 28
    const-string v6, "value"

    .line 29
    .line 30
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sparse-switch v7, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    :goto_0
    move v2, v6

    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :sswitch_0
    const-string v2, "array-contains-any"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v2, 0x9

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_1
    const-string v2, "array-contains"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/16 v2, 0x8

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :sswitch_2
    const-string v2, "in"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v2, 0x7

    .line 84
    goto :goto_1

    .line 85
    :sswitch_3
    const-string v2, ">="

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/4 v2, 0x6

    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v2, "=="

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    const/4 v2, 0x5

    .line 106
    goto :goto_1

    .line 107
    :sswitch_5
    const-string v2, "<="

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    const/4 v2, 0x4

    .line 117
    goto :goto_1

    .line 118
    :sswitch_6
    const-string v2, "!="

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_6

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    const/4 v2, 0x3

    .line 128
    goto :goto_1

    .line 129
    :sswitch_7
    const-string v3, ">"

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_9

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :sswitch_8
    const-string v2, "<"

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_7

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    move v2, v3

    .line 148
    goto :goto_1

    .line 149
    :sswitch_9
    const-string v2, "not-in"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    move v2, v4

    .line 159
    :cond_9
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    new-instance p1, Ljava/lang/Error;

    .line 163
    .line 164
    invoke-direct {p1, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 169
    .line 170
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 171
    .line 172
    sget-object v2, Lg9/l$a;->q:Lg9/l$a;

    .line 173
    .line 174
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :pswitch_1
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 179
    .line 180
    sget-object v2, Lg9/l$a;->p:Lg9/l$a;

    .line 181
    .line 182
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v1

    .line 186
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 189
    .line 190
    sget-object v2, Lg9/l$a;->r:Lg9/l$a;

    .line 191
    .line 192
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_3
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 197
    .line 198
    sget-object v2, Lg9/l$a;->o:Lg9/l$a;

    .line 199
    .line 200
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v1

    .line 204
    :pswitch_4
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 205
    .line 206
    sget-object v2, Lg9/l$a;->d:Lg9/l$a;

    .line 207
    .line 208
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-object v1

    .line 212
    :pswitch_5
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 213
    .line 214
    sget-object v2, Lg9/l$a;->c:Lg9/l$a;

    .line 215
    .line 216
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object v1

    .line 220
    :pswitch_6
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 221
    .line 222
    sget-object v2, Lg9/l$a;->e:Lg9/l$a;

    .line 223
    .line 224
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-object v1

    .line 228
    :pswitch_7
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 229
    .line 230
    sget-object v2, Lg9/l$a;->f:Lg9/l$a;

    .line 231
    .line 232
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :pswitch_8
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 237
    .line 238
    sget-object v2, Lg9/l$a;->b:Lg9/l$a;

    .line 239
    .line 240
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 245
    .line 246
    new-instance v1, Lcom/google/firebase/firestore/e$b;

    .line 247
    .line 248
    sget-object v2, Lg9/l$a;->s:Lg9/l$a;

    .line 249
    .line 250
    invoke-direct {v1, v0, v2, p1}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-object v1

    .line 254
    :cond_a
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/lang/String;

    .line 259
    .line 260
    const-string v1, "queries"

    .line 261
    .line 262
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    check-cast p1, Ljava/util/List;

    .line 267
    .line 268
    new-instance v1, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eqz v6, :cond_b

    .line 282
    .line 283
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    check-cast v6, Ljava/util/Map;

    .line 288
    .line 289
    invoke-direct {p0, v6}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->filterFromJson(Ljava/util/Map;)Lcom/google/firebase/firestore/e;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_b
    const-string p1, "OR"

    .line 298
    .line 299
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_c

    .line 304
    .line 305
    new-array p1, v4, [Lcom/google/firebase/firestore/e;

    .line 306
    .line 307
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, [Lcom/google/firebase/firestore/e;

    .line 312
    .line 313
    new-instance v0, Lcom/google/firebase/firestore/e$a;

    .line 314
    .line 315
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-direct {v0, p1, v2}, Lcom/google/firebase/firestore/e$a;-><init>(Ljava/util/List;I)V

    .line 320
    .line 321
    .line 322
    return-object v0

    .line 323
    :cond_c
    const-string p1, "AND"

    .line 324
    .line 325
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-eqz p1, :cond_d

    .line 330
    .line 331
    new-array p1, v4, [Lcom/google/firebase/firestore/e;

    .line 332
    .line 333
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    check-cast p1, [Lcom/google/firebase/firestore/e;

    .line 338
    .line 339
    new-instance v0, Lcom/google/firebase/firestore/e$a;

    .line 340
    .line 341
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-direct {v0, p1, v3}, Lcom/google/firebase/firestore/e$a;-><init>(Ljava/util/List;I)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :cond_d
    new-instance p1, Ljava/lang/Error;

    .line 350
    .line 351
    invoke-direct {p1, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p1

    .line 355
    :sswitch_data_0
    .sparse-switch
        -0x3df949a1 -> :sswitch_9
        0x3c -> :sswitch_8
        0x3e -> :sswitch_7
        0x43c -> :sswitch_6
        0x781 -> :sswitch_5
        0x7a0 -> :sswitch_4
        0x7bf -> :sswitch_3
        0xd25 -> :sswitch_2
        0x8111b13 -> :sswitch_1
        0x152d4832 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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

.method private readFirestoreInstance(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 4

    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/g;

    sget-object v2, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->firestoreInstanceCache:Ljava/util/HashMap;

    monitor-enter v2

    :try_start_0
    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->getFirestoreInstanceByNameAndDatabaseUrl(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v3

    if-eqz v3, :cond_0

    monitor-exit v2

    return-object v3

    :cond_0
    invoke-static {v0}, Lu7/f;->f(Ljava/lang/String;)Lu7/f;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->e(Lu7/f;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->g(Lcom/google/firebase/firestore/g;)V

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->setCachedFirebaseFirestoreInstanceForKey(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private readFirestoreQuery(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/i;
    .locals 23

    .line 1
    const-string v0, "endBefore"

    .line 2
    .line 3
    const-string v1, "endAt"

    .line 4
    .line 5
    const-string v2, "startAfter"

    .line 6
    .line 7
    const-string v3, "startAt"

    .line 8
    .line 9
    const-string v4, "filters"

    .line 10
    .line 11
    const-string v5, "FLTFirestoreMsgCodec"

    .line 12
    .line 13
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Ljava/util/Map;

    .line 18
    .line 19
    const-string v7, "firestore"

    .line 20
    .line 21
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    check-cast v7, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 29
    .line 30
    const-string v8, "path"

    .line 31
    .line 32
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v8, Ljava/lang/String;

    .line 40
    .line 41
    const-string v9, "isCollectionGroup"

    .line 42
    .line 43
    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    const-string v10, "parameters"

    .line 54
    .line 55
    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Ljava/util/Map;

    .line 60
    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    invoke-virtual {v7, v8}, Lcom/google/firebase/firestore/FirebaseFirestore;->c(Ljava/lang/String;)Lcom/google/firebase/firestore/i;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v9, v7, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 69
    .line 70
    invoke-virtual {v9}, Ld9/x;->b()V

    .line 71
    .line 72
    .line 73
    new-instance v9, Ld9/d;

    .line 74
    .line 75
    invoke-static {v8}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-direct {v9, v8, v7}, Ld9/d;-><init>(Lj9/o;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 80
    .line 81
    .line 82
    move-object v7, v9

    .line 83
    :goto_0
    if-nez v6, :cond_1

    .line 84
    .line 85
    return-object v7

    .line 86
    :cond_1
    invoke-interface {v6, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 90
    if-eqz v8, :cond_2

    .line 91
    .line 92
    :try_start_1
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    check-cast v4, Ljava/util/Map;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    .line 101
    move-object/from16 v8, p0

    .line 102
    .line 103
    :try_start_2
    invoke-direct {v8, v4}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->filterFromJson(Ljava/util/Map;)Lcom/google/firebase/firestore/e;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v7, v4}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    move-object/from16 v8, p0

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_2
    move-object/from16 v8, p0

    .line 118
    .line 119
    :goto_1
    const-string v4, "where"

    .line 120
    .line 121
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    check-cast v4, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    const/4 v10, 0x2

    .line 139
    const/4 v11, 0x0

    .line 140
    const/4 v12, 0x1

    .line 141
    if-eqz v9, :cond_d

    .line 142
    .line 143
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    check-cast v11, Ld9/n;

    .line 154
    .line 155
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    check-cast v12, Ljava/lang/String;

    .line 160
    .line 161
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    const-string v10, "=="

    .line 166
    .line 167
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_3

    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 177
    .line 178
    sget-object v12, Lg9/l$a;->d:Lg9/l$a;

    .line 179
    .line 180
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    goto :goto_2

    .line 188
    :cond_3
    const-string v10, "!="

    .line 189
    .line 190
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_4

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 200
    .line 201
    sget-object v12, Lg9/l$a;->e:Lg9/l$a;

    .line 202
    .line 203
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    goto :goto_2

    .line 211
    :cond_4
    const-string v10, "<"

    .line 212
    .line 213
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_5

    .line 218
    .line 219
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 223
    .line 224
    sget-object v12, Lg9/l$a;->b:Lg9/l$a;

    .line 225
    .line 226
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    goto :goto_2

    .line 234
    :cond_5
    const-string v10, "<="

    .line 235
    .line 236
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-eqz v10, :cond_6

    .line 241
    .line 242
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 246
    .line 247
    sget-object v12, Lg9/l$a;->c:Lg9/l$a;

    .line 248
    .line 249
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    goto :goto_2

    .line 257
    :cond_6
    const-string v10, ">"

    .line 258
    .line 259
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eqz v10, :cond_7

    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 269
    .line 270
    sget-object v12, Lg9/l$a;->f:Lg9/l$a;

    .line 271
    .line 272
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :cond_7
    const-string v10, ">="

    .line 282
    .line 283
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-eqz v10, :cond_8

    .line 288
    .line 289
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 293
    .line 294
    sget-object v12, Lg9/l$a;->o:Lg9/l$a;

    .line 295
    .line 296
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :cond_8
    const-string v10, "array-contains"

    .line 306
    .line 307
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v10

    .line 311
    if-eqz v10, :cond_9

    .line 312
    .line 313
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 317
    .line 318
    sget-object v12, Lg9/l$a;->p:Lg9/l$a;

    .line 319
    .line 320
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    goto/16 :goto_2

    .line 328
    .line 329
    :cond_9
    const-string v10, "array-contains-any"

    .line 330
    .line 331
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    if-eqz v10, :cond_a

    .line 336
    .line 337
    check-cast v9, Ljava/util/List;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 343
    .line 344
    sget-object v12, Lg9/l$a;->q:Lg9/l$a;

    .line 345
    .line 346
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    goto/16 :goto_2

    .line 354
    .line 355
    :cond_a
    const-string v10, "in"

    .line 356
    .line 357
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-eqz v10, :cond_b

    .line 362
    .line 363
    check-cast v9, Ljava/util/List;

    .line 364
    .line 365
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 369
    .line 370
    sget-object v12, Lg9/l$a;->r:Lg9/l$a;

    .line 371
    .line 372
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    goto/16 :goto_2

    .line 380
    .line 381
    :cond_b
    const-string v10, "not-in"

    .line 382
    .line 383
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-eqz v10, :cond_c

    .line 388
    .line 389
    check-cast v9, Ljava/util/List;

    .line 390
    .line 391
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    new-instance v10, Lcom/google/firebase/firestore/e$b;

    .line 395
    .line 396
    sget-object v12, Lg9/l$a;->s:Lg9/l$a;

    .line 397
    .line 398
    invoke-direct {v10, v11, v12, v9}, Lcom/google/firebase/firestore/e$b;-><init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v7, v10}, Lcom/google/firebase/firestore/i;->k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    goto/16 :goto_2

    .line 406
    .line 407
    :cond_c
    new-instance v9, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    const-string v10, "An invalid query operator "

    .line 413
    .line 414
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const-string v10, " was received but not handled."

    .line 421
    .line 422
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    invoke-static {v5, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 430
    .line 431
    .line 432
    goto/16 :goto_2

    .line 433
    .line 434
    :cond_d
    const-string v4, "limit"

    .line 435
    .line 436
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    check-cast v4, Ljava/lang/Number;

    .line 441
    .line 442
    if-eqz v4, :cond_e

    .line 443
    .line 444
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 445
    .line 446
    .line 447
    move-result-wide v13

    .line 448
    invoke-virtual {v7, v13, v14}, Lcom/google/firebase/firestore/i;->c(J)Lcom/google/firebase/firestore/i;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    :cond_e
    const-string v4, "limitToLast"

    .line 453
    .line 454
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    check-cast v4, Ljava/lang/Number;

    .line 459
    .line 460
    if-eqz v4, :cond_f

    .line 461
    .line 462
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 463
    .line 464
    .line 465
    move-result-wide v13

    .line 466
    invoke-virtual {v7, v13, v14}, Lcom/google/firebase/firestore/i;->d(J)Lcom/google/firebase/firestore/i;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    :cond_f
    const-string v4, "orderBy"

    .line 471
    .line 472
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    check-cast v4, Ljava/util/List;

    .line 477
    .line 478
    if-nez v4, :cond_10

    .line 479
    .line 480
    return-object v7

    .line 481
    :cond_10
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v9

    .line 489
    if-eqz v9, :cond_12

    .line 490
    .line 491
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    check-cast v9, Ljava/util/List;

    .line 496
    .line 497
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v13

    .line 501
    check-cast v13, Ld9/n;

    .line 502
    .line 503
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    check-cast v9, Ljava/lang/Boolean;

    .line 508
    .line 509
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    if-eqz v9, :cond_11

    .line 514
    .line 515
    move v9, v10

    .line 516
    goto :goto_4

    .line 517
    :cond_11
    move v9, v12

    .line 518
    :goto_4
    invoke-virtual {v7, v13, v9}, Lcom/google/firebase/firestore/i;->e(Ld9/n;I)Lcom/google/firebase/firestore/i;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    goto :goto_3

    .line 523
    :cond_12
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    check-cast v4, Ljava/util/List;

    .line 528
    .line 529
    if-eqz v4, :cond_13

    .line 530
    .line 531
    invoke-interface {v4}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v7, v3, v12, v4}, Lcom/google/firebase/firestore/i;->a(Ljava/lang/String;Z[Ljava/lang/Object;)Lg9/e;

    .line 539
    .line 540
    .line 541
    move-result-object v21

    .line 542
    new-instance v3, Lcom/google/firebase/firestore/i;

    .line 543
    .line 544
    iget-object v4, v7, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 545
    .line 546
    new-instance v9, Lg9/f0;

    .line 547
    .line 548
    iget-object v14, v4, Lg9/f0;->f:Lj9/o;

    .line 549
    .line 550
    iget-object v15, v4, Lg9/f0;->g:Ljava/lang/String;

    .line 551
    .line 552
    iget-object v10, v4, Lg9/f0;->e:Ljava/util/List;

    .line 553
    .line 554
    iget-object v13, v4, Lg9/f0;->a:Ljava/util/List;

    .line 555
    .line 556
    iget-wide v11, v4, Lg9/f0;->h:J

    .line 557
    .line 558
    iget v8, v4, Lg9/f0;->i:I

    .line 559
    .line 560
    iget-object v4, v4, Lg9/f0;->k:Lg9/e;

    .line 561
    .line 562
    move-object/from16 v17, v13

    .line 563
    .line 564
    move-object v13, v9

    .line 565
    move-object/from16 v16, v10

    .line 566
    .line 567
    move-wide/from16 v18, v11

    .line 568
    .line 569
    move/from16 v20, v8

    .line 570
    .line 571
    move-object/from16 v22, v4

    .line 572
    .line 573
    invoke-direct/range {v13 .. v22}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 574
    .line 575
    .line 576
    iget-object v4, v7, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 577
    .line 578
    invoke-direct {v3, v9, v4}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 579
    .line 580
    .line 581
    move-object v7, v3

    .line 582
    :cond_13
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    check-cast v3, Ljava/util/List;

    .line 587
    .line 588
    if-eqz v3, :cond_14

    .line 589
    .line 590
    invoke-interface {v3}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    const/4 v4, 0x0

    .line 598
    invoke-virtual {v7, v2, v4, v3}, Lcom/google/firebase/firestore/i;->a(Ljava/lang/String;Z[Ljava/lang/Object;)Lg9/e;

    .line 599
    .line 600
    .line 601
    move-result-object v16

    .line 602
    new-instance v2, Lcom/google/firebase/firestore/i;

    .line 603
    .line 604
    iget-object v3, v7, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 605
    .line 606
    new-instance v4, Lg9/f0;

    .line 607
    .line 608
    iget-object v9, v3, Lg9/f0;->f:Lj9/o;

    .line 609
    .line 610
    iget-object v10, v3, Lg9/f0;->g:Ljava/lang/String;

    .line 611
    .line 612
    iget-object v11, v3, Lg9/f0;->e:Ljava/util/List;

    .line 613
    .line 614
    iget-object v12, v3, Lg9/f0;->a:Ljava/util/List;

    .line 615
    .line 616
    iget-wide v13, v3, Lg9/f0;->h:J

    .line 617
    .line 618
    iget v15, v3, Lg9/f0;->i:I

    .line 619
    .line 620
    iget-object v3, v3, Lg9/f0;->k:Lg9/e;

    .line 621
    .line 622
    move-object v8, v4

    .line 623
    move-object/from16 v17, v3

    .line 624
    .line 625
    invoke-direct/range {v8 .. v17}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 626
    .line 627
    .line 628
    iget-object v3, v7, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 629
    .line 630
    invoke-direct {v2, v4, v3}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 631
    .line 632
    .line 633
    move-object v7, v2

    .line 634
    :cond_14
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    check-cast v2, Ljava/util/List;

    .line 639
    .line 640
    if-eqz v2, :cond_15

    .line 641
    .line 642
    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    const/4 v3, 0x1

    .line 650
    invoke-virtual {v7, v1, v3, v2}, Lcom/google/firebase/firestore/i;->a(Ljava/lang/String;Z[Ljava/lang/Object;)Lg9/e;

    .line 651
    .line 652
    .line 653
    move-result-object v17

    .line 654
    new-instance v1, Lcom/google/firebase/firestore/i;

    .line 655
    .line 656
    iget-object v2, v7, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 657
    .line 658
    new-instance v3, Lg9/f0;

    .line 659
    .line 660
    iget-object v9, v2, Lg9/f0;->f:Lj9/o;

    .line 661
    .line 662
    iget-object v10, v2, Lg9/f0;->g:Ljava/lang/String;

    .line 663
    .line 664
    iget-object v11, v2, Lg9/f0;->e:Ljava/util/List;

    .line 665
    .line 666
    iget-object v12, v2, Lg9/f0;->a:Ljava/util/List;

    .line 667
    .line 668
    iget-wide v13, v2, Lg9/f0;->h:J

    .line 669
    .line 670
    iget v15, v2, Lg9/f0;->i:I

    .line 671
    .line 672
    iget-object v2, v2, Lg9/f0;->j:Lg9/e;

    .line 673
    .line 674
    move-object v8, v3

    .line 675
    move-object/from16 v16, v2

    .line 676
    .line 677
    invoke-direct/range {v8 .. v17}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 678
    .line 679
    .line 680
    iget-object v2, v7, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 681
    .line 682
    invoke-direct {v1, v3, v2}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 683
    .line 684
    .line 685
    move-object v7, v1

    .line 686
    :cond_15
    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    check-cast v1, Ljava/util/List;

    .line 691
    .line 692
    if-eqz v1, :cond_16

    .line 693
    .line 694
    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    const/4 v2, 0x0

    .line 702
    invoke-virtual {v7, v0, v2, v1}, Lcom/google/firebase/firestore/i;->a(Ljava/lang/String;Z[Ljava/lang/Object;)Lg9/e;

    .line 703
    .line 704
    .line 705
    move-result-object v17

    .line 706
    new-instance v0, Lcom/google/firebase/firestore/i;

    .line 707
    .line 708
    iget-object v1, v7, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 709
    .line 710
    new-instance v2, Lg9/f0;

    .line 711
    .line 712
    iget-object v9, v1, Lg9/f0;->f:Lj9/o;

    .line 713
    .line 714
    iget-object v10, v1, Lg9/f0;->g:Ljava/lang/String;

    .line 715
    .line 716
    iget-object v11, v1, Lg9/f0;->e:Ljava/util/List;

    .line 717
    .line 718
    iget-object v12, v1, Lg9/f0;->a:Ljava/util/List;

    .line 719
    .line 720
    iget-wide v13, v1, Lg9/f0;->h:J

    .line 721
    .line 722
    iget v15, v1, Lg9/f0;->i:I

    .line 723
    .line 724
    iget-object v1, v1, Lg9/f0;->j:Lg9/e;

    .line 725
    .line 726
    move-object v8, v2

    .line 727
    move-object/from16 v16, v1

    .line 728
    .line 729
    invoke-direct/range {v8 .. v17}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 730
    .line 731
    .line 732
    iget-object v1, v7, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 733
    .line 734
    invoke-direct {v0, v2, v1}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 735
    .line 736
    .line 737
    move-object v7, v0

    .line 738
    :cond_16
    return-object v7

    .line 739
    :catch_1
    move-exception v0

    .line 740
    :goto_5
    const-string v1, "An error occurred while parsing query arguments, this is most likely an error with this SDK."

    .line 741
    .line 742
    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 743
    .line 744
    .line 745
    const/4 v0, 0x0

    .line 746
    return-object v0
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

.method private readFirestoreSettings(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/g;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/util/Map;

    .line 6
    .line 7
    new-instance v0, Lcom/google/firebase/firestore/g$a;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/firebase/firestore/g$a;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "persistenceEnabled"

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_5

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
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_4

    .line 33
    .line 34
    const-string v1, "cacheSizeBytes"

    .line 35
    .line 36
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-wide/32 v3, 0x6400000

    .line 41
    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    instance-of v3, v1, Ljava/lang/Long;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    move-object v2, v1

    .line 58
    check-cast v2, Ljava/lang/Long;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    instance-of v3, v1, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    int-to-long v1, v1

    .line 72
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    const-wide/16 v5, -0x1

    .line 81
    .line 82
    cmp-long v1, v3, v5

    .line 83
    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    move-wide v3, v5

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    :cond_3
    :goto_1
    new-instance v1, Ld9/l0;

    .line 93
    .line 94
    invoke-direct {v1, v3, v4}, Ld9/l0;-><init>(J)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    new-instance v1, Ld9/g0;

    .line 99
    .line 100
    invoke-direct {v1}, Ld9/g0;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v2, Ld9/f0;

    .line 104
    .line 105
    invoke-direct {v2, v1}, Ld9/f0;-><init>(Ld9/g0;)V

    .line 106
    .line 107
    .line 108
    move-object v1, v2

    .line 109
    :goto_2
    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/g$a;->b(Ld9/e0;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    const-string v1, "host"

    .line 113
    .line 114
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    check-cast v1, Ljava/lang/String;

    .line 128
    .line 129
    iput-object v1, v0, Lcom/google/firebase/firestore/g$a;->a:Ljava/lang/String;

    .line 130
    .line 131
    const-string v1, "sslEnabled"

    .line 132
    .line 133
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    check-cast p1, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iput-boolean p1, v0, Lcom/google/firebase/firestore/g$a;->b:Z

    .line 153
    .line 154
    :cond_6
    invoke-virtual {v0}, Lcom/google/firebase/firestore/g$a;->a()Lcom/google/firebase/firestore/g;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1
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

.method private toArray(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "java.util.List was expected, unable to convert \'%s\' to an object array"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeDocumentChange(Ljava/io/ByteArrayOutputStream;Ld9/e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p2, Ld9/e;->a:Ld9/e$a;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v1, "DocumentChangeType.removed"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v1, "DocumentChangeType.modified"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string v1, "DocumentChangeType.added"

    .line 29
    .line 30
    :goto_0
    const-string v2, "type"

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v1, p2, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/firebase/firestore/j;->b()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "data"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iget-object v1, p2, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/google/firebase/firestore/d;->b:Lj9/i;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v1, v1, Lj9/i;->a:Lj9/o;

    .line 54
    .line 55
    invoke-virtual {v1}, Lj9/o;->h()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "path"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget v1, p2, Ld9/e;->c:I

    .line 65
    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "oldIndex"

    .line 71
    .line 72
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget v1, p2, Ld9/e;->d:I

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v2, "newIndex"

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    iget-object p2, p2, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    .line 87
    .line 88
    iget-object p2, p2, Lcom/google/firebase/firestore/d;->d:Ld9/u0;

    .line 89
    .line 90
    const-string v1, "metadata"

    .line 91
    .line 92
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
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

.method private writeDocumentSnapshot(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/d;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p2, Lcom/google/firebase/firestore/d;->b:Lj9/i;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v1, Lj9/i;->a:Lj9/o;

    .line 12
    .line 13
    invoke-virtual {v1}, Lj9/o;->h()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "path"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v1, p2, Lcom/google/firebase/firestore/d;->c:Lj9/g;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz v1, :cond_2

    .line 30
    .line 31
    sget-object v1, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->serverTimestampBehaviorHashMap:Ljava/util/Map;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/google/firebase/firestore/d;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/google/firebase/firestore/d$a;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Lcom/google/firebase/firestore/d;->a(Lcom/google/firebase/firestore/d$a;)Ljava/util/HashMap;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p2}, Lcom/google/firebase/firestore/d;->b()Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v1, 0x0

    .line 60
    :goto_1
    const-string v2, "data"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object v1, p2, Lcom/google/firebase/firestore/d;->d:Ld9/u0;

    .line 66
    .line 67
    const-string v2, "metadata"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object v1, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->serverTimestampBehaviorHashMap:Ljava/util/Map;

    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/google/firebase/firestore/d;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {v1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void
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

.method private writeLoadBundleTaskProgress(Ljava/io/ByteArrayOutputStream;Ld9/d0;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p2, Ld9/d0;->c:J

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "bytesLoaded"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v1, p2, Ld9/d0;->a:I

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "documentsLoaded"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p2, Ld9/d0;->d:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "totalBytes"

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    iget v1, p2, Ld9/d0;->b:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "totalDocuments"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget p2, p2, Ld9/d0;->e:I

    .line 51
    .line 52
    invoke-static {p2}, Lq0/g;->c(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    if-eq p2, v1, :cond_1

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    if-eq p2, v1, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string p2, "success"

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    :goto_0
    const-string p2, "running"

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const-string p2, "error"

    .line 72
    .line 73
    :goto_1
    const-string v1, "taskState"

    .line 74
    .line 75
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
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

.method private writeQuerySnapshot(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/k;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v4, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->serverTimestampBehaviorHashMap:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lcom/google/firebase/firestore/d$a;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->h()Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lcom/google/firebase/firestore/d;

    .line 56
    .line 57
    iget-object v7, v6, Lcom/google/firebase/firestore/d;->b:Lj9/i;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v7, v7, Lj9/i;->a:Lj9/o;

    .line 63
    .line 64
    invoke-virtual {v7}, Lj9/o;->h()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    invoke-virtual {v6, v4}, Lcom/google/firebase/firestore/d;->a(Lcom/google/firebase/firestore/d$a;)Ljava/util/HashMap;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    invoke-virtual {v6}, Lcom/google/firebase/firestore/d;->b()Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    :goto_1
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    iget-object v6, v6, Lcom/google/firebase/firestore/d;->d:Ld9/u0;

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const-string v4, "paths"

    .line 92
    .line 93
    invoke-virtual {v1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-string v0, "documents"

    .line 97
    .line 98
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const-string v0, "metadatas"

    .line 102
    .line 103
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->a()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "documentChanges"

    .line 111
    .line 112
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-object v0, p2, Lcom/google/firebase/firestore/k;->f:Ld9/u0;

    .line 116
    .line 117
    const-string v2, "metadata"

    .line 118
    .line 119
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object v0, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->serverTimestampBehaviorHashMap:Ljava/util/Map;

    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-void
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

.method private writeSnapshotMetadata(Ljava/io/ByteArrayOutputStream;Ld9/u0;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p2, Ld9/u0;->a:Z

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "hasPendingWrites"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p2, Ld9/u0;->b:Z

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v1, "isFromCache"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
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
.method public readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p1, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :pswitch_0
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    new-array p2, p2, [D

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Double;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "Null value at index "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    aput-wide v1, p2, v0

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p1, Ld9/o;->a:Ld9/o$c;

    .line 64
    .line 65
    new-instance p1, Ld9/z0;

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ld9/z0;-><init>([D)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_1
    invoke-direct {p0, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->readFirestoreSettings(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/g;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_2
    invoke-direct {p0, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->readFirestoreQuery(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/i;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :pswitch_3
    invoke-direct {p0, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->readFirestoreInstance(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :pswitch_4
    const-wide/high16 p1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 87
    .line 88
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_5
    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 94
    .line 95
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :pswitch_6
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    .line 101
    .line 102
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :pswitch_7
    invoke-static {p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readSize(Ljava/nio/ByteBuffer;)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    .line 115
    .line 116
    move v2, v0

    .line 117
    :goto_1
    if-ge v2, p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    new-array p1, v0, [Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, [Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {p1}, Ld9/n;->b([Ljava/lang/String;)Ld9/n;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :pswitch_8
    sget-object p1, Ld9/n;->c:Ld9/n;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_9
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    int-to-long p1, p1

    .line 156
    sget-object v0, Ld9/o;->a:Ld9/o$c;

    .line 157
    .line 158
    new-instance v0, Ld9/o$d;

    .line 159
    .line 160
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-direct {v0, p1}, Ld9/o$d;-><init>(Ljava/lang/Number;)V

    .line 165
    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_a
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 175
    .line 176
    .line 177
    move-result-wide p1

    .line 178
    sget-object v0, Ld9/o;->a:Ld9/o$c;

    .line 179
    .line 180
    new-instance v0, Ld9/o$d;

    .line 181
    .line 182
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {v0, p1}, Ld9/o$d;-><init>(Ljava/lang/Number;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_b
    new-instance p1, Lu7/m;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    invoke-direct {p1, p2, v0, v1}, Lu7/m;-><init>(IJ)V

    .line 201
    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_c
    sget-object p1, Ld9/o;->b:Ld9/o$e;

    .line 205
    .line 206
    return-object p1

    .line 207
    :pswitch_d
    sget-object p1, Ld9/o;->a:Ld9/o$c;

    .line 208
    .line 209
    return-object p1

    .line 210
    :pswitch_e
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->toArray(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    sget-object p2, Ld9/o;->a:Ld9/o$c;

    .line 219
    .line 220
    new-instance p2, Ld9/o$a;

    .line 221
    .line 222
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p2, p1}, Ld9/o$a;-><init>(Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    return-object p2

    .line 230
    :pswitch_f
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->toArray(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    sget-object p2, Ld9/o;->a:Ld9/o$c;

    .line 239
    .line 240
    new-instance p2, Ld9/o$b;

    .line 241
    .line 242
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-direct {p2, p1}, Ld9/o$b;-><init>(Ljava/util/List;)V

    .line 247
    .line 248
    .line 249
    return-object p2

    .line 250
    :pswitch_10
    invoke-static {p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readBytes(Ljava/nio/ByteBuffer;)[B

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const-string p2, "Provided bytes array must not be null."

    .line 255
    .line 256
    invoke-static {p1, p2}, Lx6/b;->B(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance p2, Ld9/c;

    .line 260
    .line 261
    array-length v1, p1

    .line 262
    invoke-static {p1, v0, v1}, Lma/h;->m([BII)Lma/h$h;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {p2, p1}, Ld9/c;-><init>(Lma/h;)V

    .line 267
    .line 268
    .line 269
    return-object p2

    .line 270
    :pswitch_11
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 275
    .line 276
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    check-cast p2, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {p1, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lcom/google/firebase/firestore/c;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    return-object p1

    .line 287
    :pswitch_12
    const/16 p1, 0x8

    .line 288
    .line 289
    invoke-static {p2, p1}, Lio/flutter/plugin/common/StandardMessageCodec;->readAlignment(Ljava/nio/ByteBuffer;I)V

    .line 290
    .line 291
    .line 292
    new-instance p1, Ld9/y;

    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 295
    .line 296
    .line 297
    move-result-wide v0

    .line 298
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 299
    .line 300
    .line 301
    move-result-wide v2

    .line 302
    invoke-direct {p1, v0, v1, v2, v3}, Ld9/y;-><init>(DD)V

    .line 303
    .line 304
    .line 305
    return-object p1

    .line 306
    :pswitch_13
    new-instance p1, Ljava/util/Date;

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    .line 309
    .line 310
    .line 311
    move-result-wide v0

    .line 312
    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 313
    .line 314
    .line 315
    return-object p1

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch -0x4c
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

.method public writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p2, Ljava/util/Date;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, -0x4c

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 8
    .line 9
    .line 10
    check-cast p2, Ljava/util/Date;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {p1, v0, v1}, Lio/flutter/plugin/common/StandardMessageCodec;->writeLong(Ljava/io/ByteArrayOutputStream;J)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    instance-of v0, p2, Lu7/m;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/16 v0, -0x44

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 28
    .line 29
    .line 30
    check-cast p2, Lu7/m;

    .line 31
    .line 32
    iget-wide v0, p2, Lu7/m;->a:J

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, Lio/flutter/plugin/common/StandardMessageCodec;->writeLong(Ljava/io/ByteArrayOutputStream;J)V

    .line 35
    .line 36
    .line 37
    iget p2, p2, Lu7/m;->b:I

    .line 38
    .line 39
    invoke-static {p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    instance-of v0, p2, Ld9/y;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/16 v0, -0x4b

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    invoke-static {p1, v0}, Lio/flutter/plugin/common/StandardMessageCodec;->writeAlignment(Ljava/io/ByteArrayOutputStream;I)V

    .line 56
    .line 57
    .line 58
    check-cast p2, Ld9/y;

    .line 59
    .line 60
    iget-wide v0, p2, Ld9/y;->a:D

    .line 61
    .line 62
    invoke-static {p1, v0, v1}, Lio/flutter/plugin/common/StandardMessageCodec;->writeDouble(Ljava/io/ByteArrayOutputStream;D)V

    .line 63
    .line 64
    .line 65
    iget-wide v0, p2, Ld9/y;->b:D

    .line 66
    .line 67
    invoke-static {p1, v0, v1}, Lio/flutter/plugin/common/StandardMessageCodec;->writeDouble(Ljava/io/ByteArrayOutputStream;D)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_2
    instance-of v0, p2, Ld9/z0;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    const/16 v0, -0x39

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 79
    .line 80
    .line 81
    check-cast p2, Ld9/z0;

    .line 82
    .line 83
    iget-object p2, p2, Ld9/z0;->a:[D

    .line 84
    .line 85
    invoke-virtual {p2}, [D->clone()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, [D

    .line 90
    .line 91
    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_3
    instance-of v0, p2, Lcom/google/firebase/firestore/c;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    const/16 v0, -0x4a

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 103
    .line 104
    .line 105
    check-cast p2, Lcom/google/firebase/firestore/c;

    .line 106
    .line 107
    iget-object v0, p2, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 108
    .line 109
    iget-object v1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Lu7/f;

    .line 110
    .line 111
    invoke-virtual {v1}, Lu7/f;->a()V

    .line 112
    .line 113
    .line 114
    iget-object v1, v1, Lu7/f;->b:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0, p1, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->c()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object v1, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->firestoreInstanceCache:Ljava/util/HashMap;

    .line 127
    .line 128
    monitor-enter v1

    .line 129
    :try_start_0
    invoke-static {v0}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->getCachedFirebaseFirestoreInstanceForKey(Lcom/google/firebase/firestore/FirebaseFirestore;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreExtension;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreExtension;->getDatabaseURL()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    monitor-exit v1

    .line 138
    goto :goto_0

    .line 139
    :catchall_0
    move-exception p1

    .line 140
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    throw p1

    .line 142
    :cond_4
    instance-of v0, p2, Lcom/google/firebase/firestore/d;

    .line 143
    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    check-cast p2, Lcom/google/firebase/firestore/d;

    .line 147
    .line 148
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeDocumentSnapshot(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/d;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    :cond_5
    instance-of v0, p2, Lcom/google/firebase/firestore/k;

    .line 154
    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    check-cast p2, Lcom/google/firebase/firestore/k;

    .line 158
    .line 159
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeQuerySnapshot(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/k;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :cond_6
    instance-of v0, p2, Ld9/e;

    .line 165
    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    check-cast p2, Ld9/e;

    .line 169
    .line 170
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeDocumentChange(Ljava/io/ByteArrayOutputStream;Ld9/e;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    instance-of v0, p2, Ld9/d0;

    .line 175
    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    check-cast p2, Ld9/d0;

    .line 179
    .line 180
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeLoadBundleTaskProgress(Ljava/io/ByteArrayOutputStream;Ld9/d0;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_8
    instance-of v0, p2, Ld9/u0;

    .line 185
    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    check-cast p2, Ld9/u0;

    .line 189
    .line 190
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreMessageCodec;->writeSnapshotMetadata(Ljava/io/ByteArrayOutputStream;Ld9/u0;)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_9
    instance-of v0, p2, Ld9/c;

    .line 195
    .line 196
    if-eqz v0, :cond_a

    .line 197
    .line 198
    const/16 v0, -0x49

    .line 199
    .line 200
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 201
    .line 202
    .line 203
    check-cast p2, Ld9/c;

    .line 204
    .line 205
    iget-object p2, p2, Ld9/c;->a:Lma/h;

    .line 206
    .line 207
    invoke-virtual {p2}, Lma/h;->z()[B

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-static {p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeBytes(Ljava/io/ByteArrayOutputStream;[B)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_a
    instance-of v0, p2, Ljava/lang/Double;

    .line 216
    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    move-object v0, p2

    .line 220
    check-cast v0, Ljava/lang/Double;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 223
    .line 224
    .line 225
    move-result-wide v1

    .line 226
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_b

    .line 231
    .line 232
    const/16 p2, -0x3f

    .line 233
    .line 234
    :goto_1
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_b
    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 239
    .line 240
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_c

    .line 249
    .line 250
    const/16 p2, -0x3d

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_c
    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 254
    .line 255
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_d

    .line 264
    .line 265
    const/16 p2, -0x3e

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_d
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :goto_2
    return-void
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
