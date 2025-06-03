.class public final Ln9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/e$b;,
        Ln9/e$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Ln9/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 5
    .line 6
    const-string v0, "Hard assert failed: "

    .line 7
    .line 8
    invoke-static {v0, p0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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

.method public static b(Ljava/lang/Object;Ln9/e$b;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ln9/e$b;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget v0, p1, Ln9/e$b;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f4

    .line 4
    .line 5
    if-gt v0, v1, :cond_1a

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    instance-of v0, p0, Ljava/lang/Long;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    instance-of v0, p0, Ljava/lang/Integer;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    instance-of v0, p0, Ljava/lang/Double;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    instance-of v0, p0, Ljava/lang/Float;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-array v0, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    aput-object p0, v0, v1

    .line 45
    .line 46
    const-string p0, "Numbers of type %s are not supported, please use an int, long, float or double"

    .line 47
    .line 48
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    throw p0

    .line 57
    :cond_2
    :goto_0
    return-object p0

    .line 58
    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_4
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_5
    instance-of v0, p0, Ljava/lang/Character;

    .line 69
    .line 70
    if-nez v0, :cond_19

    .line 71
    .line 72
    instance-of v0, p0, Ljava/util/Map;

    .line 73
    .line 74
    if-eqz v0, :cond_8

    .line 75
    .line 76
    new-instance v0, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    check-cast p0, Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/util/Map$Entry;

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    instance-of v4, v3, Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    check-cast v3, Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v4, Ln9/e$b;

    .line 118
    .line 119
    iget v5, p1, Ln9/e$b;->a:I

    .line 120
    .line 121
    add-int/2addr v5, v2

    .line 122
    invoke-direct {v4, p1, v3, v5}, Ln9/e$b;-><init>(Ln9/e$b;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v4}, Ln9/e;->b(Ljava/lang/Object;Ln9/e$b;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    const-string p0, "Maps with non-string keys are not supported"

    .line 134
    .line 135
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    throw p0

    .line 140
    :cond_7
    return-object v0

    .line 141
    :cond_8
    instance-of v0, p0, Ljava/util/Collection;

    .line 142
    .line 143
    if-eqz v0, :cond_b

    .line 144
    .line 145
    instance-of v0, p0, Ljava/util/List;

    .line 146
    .line 147
    if-eqz v0, :cond_a

    .line 148
    .line 149
    check-cast p0, Ljava/util/List;

    .line 150
    .line 151
    new-instance v0, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-ge v1, v3, :cond_9

    .line 165
    .line 166
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    const-string v4, "["

    .line 171
    .line 172
    const-string v5, "]"

    .line 173
    .line 174
    invoke-static {v4, v1, v5}, La0/j;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    new-instance v5, Ln9/e$b;

    .line 179
    .line 180
    iget v6, p1, Ln9/e$b;->a:I

    .line 181
    .line 182
    add-int/2addr v6, v2

    .line 183
    invoke-direct {v5, p1, v4, v6}, Ln9/e$b;-><init>(Ln9/e$b;Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    invoke-static {v3, v5}, Ln9/e;->b(Ljava/lang/Object;Ln9/e$b;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    return-object v0

    .line 197
    :cond_a
    const-string p0, "Serializing Collections is not supported, please use Lists instead"

    .line 198
    .line 199
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    throw p0

    .line 204
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_18

    .line 213
    .line 214
    instance-of v0, p0, Ljava/lang/Enum;

    .line 215
    .line 216
    if-eqz v0, :cond_c

    .line 217
    .line 218
    move-object p1, p0

    .line 219
    check-cast p1, Ljava/lang/Enum;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Ln9/e$a;->e(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    return-object p0

    .line 238
    :catch_0
    return-object p1

    .line 239
    :cond_c
    instance-of v0, p0, Ljava/util/Date;

    .line 240
    .line 241
    if-nez v0, :cond_17

    .line 242
    .line 243
    instance-of v0, p0, Lu7/m;

    .line 244
    .line 245
    if-nez v0, :cond_17

    .line 246
    .line 247
    instance-of v0, p0, Ld9/y;

    .line 248
    .line 249
    if-nez v0, :cond_17

    .line 250
    .line 251
    instance-of v0, p0, Ld9/c;

    .line 252
    .line 253
    if-nez v0, :cond_17

    .line 254
    .line 255
    instance-of v0, p0, Lcom/google/firebase/firestore/c;

    .line 256
    .line 257
    if-nez v0, :cond_17

    .line 258
    .line 259
    instance-of v0, p0, Ld9/o;

    .line 260
    .line 261
    if-nez v0, :cond_17

    .line 262
    .line 263
    instance-of v0, p0, Ld9/z0;

    .line 264
    .line 265
    if-eqz v0, :cond_d

    .line 266
    .line 267
    goto/16 :goto_7

    .line 268
    .line 269
    :cond_d
    instance-of v0, p0, Landroid/net/Uri;

    .line 270
    .line 271
    if-nez v0, :cond_16

    .line 272
    .line 273
    instance-of v0, p0, Ljava/net/URI;

    .line 274
    .line 275
    if-nez v0, :cond_16

    .line 276
    .line 277
    instance-of v0, p0, Ljava/net/URL;

    .line 278
    .line 279
    if-eqz v0, :cond_e

    .line 280
    .line 281
    goto/16 :goto_6

    .line 282
    .line 283
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sget-object v3, Ln9/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 288
    .line 289
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    check-cast v4, Ln9/e$a;

    .line 294
    .line 295
    if-nez v4, :cond_f

    .line 296
    .line 297
    new-instance v4, Ln9/e$a;

    .line 298
    .line 299
    invoke-direct {v4, v0}, Ln9/e$a;-><init>(Ljava/lang/Class;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :cond_f
    iget-object v0, v4, Ln9/e$a;->a:Ljava/lang/Class;

    .line 306
    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_15

    .line 316
    .line 317
    new-instance v0, Ljava/util/HashMap;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 320
    .line 321
    .line 322
    iget-object v3, v4, Ln9/e$a;->b:Ljava/util/HashMap;

    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_14

    .line 337
    .line 338
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Ljava/lang/String;

    .line 343
    .line 344
    iget-object v6, v4, Ln9/e$a;->g:Ljava/util/HashSet;

    .line 345
    .line 346
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-eqz v6, :cond_10

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_10
    iget-object v6, v4, Ln9/e$a;->c:Ljava/util/HashMap;

    .line 354
    .line 355
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-eqz v6, :cond_11

    .line 360
    .line 361
    iget-object v6, v4, Ln9/e$a;->c:Ljava/util/HashMap;

    .line 362
    .line 363
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    check-cast v6, Ljava/lang/reflect/Method;

    .line 368
    .line 369
    new-array v7, v1, [Ljava/lang/Object;

    .line 370
    .line 371
    :try_start_1
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 375
    goto :goto_4

    .line 376
    :catch_1
    move-exception p0

    .line 377
    new-instance p1, Ljava/lang/RuntimeException;

    .line 378
    .line 379
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    throw p1

    .line 383
    :catch_2
    move-exception p0

    .line 384
    new-instance p1, Ljava/lang/RuntimeException;

    .line 385
    .line 386
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    throw p1

    .line 390
    :cond_11
    iget-object v6, v4, Ln9/e$a;->e:Ljava/util/HashMap;

    .line 391
    .line 392
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    check-cast v6, Ljava/lang/reflect/Field;

    .line 397
    .line 398
    if-eqz v6, :cond_13

    .line 399
    .line 400
    :try_start_2
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3

    .line 404
    :goto_4
    iget-object v7, v4, Ln9/e$a;->f:Ljava/util/HashSet;

    .line 405
    .line 406
    invoke-virtual {v7, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    if-eqz v7, :cond_12

    .line 411
    .line 412
    if-nez v6, :cond_12

    .line 413
    .line 414
    sget-object v6, Ld9/o;->b:Ld9/o$e;

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_12
    new-instance v7, Ln9/e$b;

    .line 418
    .line 419
    iget v8, p1, Ln9/e$b;->a:I

    .line 420
    .line 421
    add-int/2addr v8, v2

    .line 422
    invoke-direct {v7, p1, v5, v8}, Ln9/e$b;-><init>(Ln9/e$b;Ljava/lang/String;I)V

    .line 423
    .line 424
    .line 425
    invoke-static {v6, v7}, Ln9/e;->b(Ljava/lang/Object;Ln9/e$b;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    :goto_5
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    goto :goto_3

    .line 433
    :catch_3
    move-exception p0

    .line 434
    new-instance p1, Ljava/lang/RuntimeException;

    .line 435
    .line 436
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 437
    .line 438
    .line 439
    throw p1

    .line 440
    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 441
    .line 442
    const-string p1, "Bean property without field or getter: "

    .line 443
    .line 444
    invoke-static {p1, v5}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw p0

    .line 452
    :cond_14
    return-object v0

    .line 453
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    const-string v0, "Can\'t serialize object of class "

    .line 456
    .line 457
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    const-string p0, " with BeanMapper for class "

    .line 469
    .line 470
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    iget-object p0, v4, Ln9/e$a;->a:Ljava/lang/Class;

    .line 474
    .line 475
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw p1

    .line 486
    :cond_16
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    :cond_17
    :goto_7
    return-object p0

    .line 491
    :cond_18
    const-string p0, "Serializing Arrays is not supported, please use Lists instead"

    .line 492
    .line 493
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    throw p0

    .line 498
    :cond_19
    const-string p0, "Characters are not supported, please use Strings"

    .line 499
    .line 500
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    throw p0

    .line 505
    :cond_1a
    const-string p0, "Exceeded maximum depth of 500, which likely indicates there\'s an object cycle"

    .line 506
    .line 507
    invoke-static {p1, p0}, Ln9/e;->c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    throw p0
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

.method public static c(Ln9/e$b;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 1
    const-string v0, "Could not serialize object. "

    .line 2
    .line 3
    invoke-static {v0, p1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p0, Ln9/e$b;->a:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const-string v0, " (found in field \'"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Ln9/e$b;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "\')"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p0
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
