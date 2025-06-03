.class public final Lcom/google/android/gms/internal/measurement/zzas;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaq;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzaq;",
        "Ljava/lang/Iterable<",
        "Lcom/google/android/gms/internal/measurement/zzaq;",
        ">;"
    }
.end annotation


# instance fields
.field private final zza:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "StringValue cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/measurement/zzas;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzas;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzas;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/google/android/gms/internal/measurement/zzaq;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzau;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzau;-><init>(Lcom/google/android/gms/internal/measurement/zzas;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-static {v1, v0, v1}, La0/j;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzh;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzaq;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/zzaq;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "charAt"

    .line 10
    .line 11
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const-string v6, "concat"

    .line 16
    .line 17
    const-string v7, "indexOf"

    .line 18
    .line 19
    const-string v8, "replace"

    .line 20
    .line 21
    const-string v9, "substring"

    .line 22
    .line 23
    const-string v10, "split"

    .line 24
    .line 25
    const-string v11, "slice"

    .line 26
    .line 27
    const-string v12, "match"

    .line 28
    .line 29
    const-string v13, "lastIndexOf"

    .line 30
    .line 31
    const-string v14, "toLocaleUpperCase"

    .line 32
    .line 33
    const-string v15, "search"

    .line 34
    .line 35
    const-string v2, "toLowerCase"

    .line 36
    .line 37
    const-string v0, "toLocaleLowerCase"

    .line 38
    .line 39
    const-string v3, "toString"

    .line 40
    .line 41
    move-object/from16 v16, v4

    .line 42
    .line 43
    const-string v4, "hasOwnProperty"

    .line 44
    .line 45
    move-object/from16 v17, v14

    .line 46
    .line 47
    const-string v14, "toUpperCase"

    .line 48
    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_1

    .line 86
    .line 87
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_1

    .line 92
    .line 93
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_1

    .line 98
    .line 99
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-nez v5, :cond_1

    .line 104
    .line 105
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_1

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_1

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_1

    .line 122
    .line 123
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_1

    .line 128
    .line 129
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_1

    .line 134
    .line 135
    move-object/from16 v5, v17

    .line 136
    .line 137
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v17

    .line 141
    if-nez v17, :cond_2

    .line 142
    .line 143
    move-object/from16 v17, v4

    .line 144
    .line 145
    const-string v4, "trim"

    .line 146
    .line 147
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_0

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    const/4 v4, 0x0

    .line 155
    goto :goto_1

    .line 156
    :cond_1
    move-object/from16 v5, v17

    .line 157
    .line 158
    :cond_2
    move-object/from16 v17, v4

    .line 159
    .line 160
    :goto_0
    const/4 v4, 0x1

    .line 161
    :goto_1
    if-eqz v4, :cond_35

    .line 162
    .line 163
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    const/16 v18, -0x1

    .line 171
    .line 172
    sparse-switch v4, :sswitch_data_0

    .line 173
    .line 174
    .line 175
    :goto_2
    move-object/from16 v4, v16

    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :sswitch_0
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_3

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    const/16 v1, 0x10

    .line 187
    .line 188
    goto/16 :goto_3

    .line 189
    .line 190
    :sswitch_1
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_4

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    const/16 v1, 0xf

    .line 198
    .line 199
    goto/16 :goto_3

    .line 200
    .line 201
    :sswitch_2
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-nez v1, :cond_5

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_5
    const/16 v1, 0xe

    .line 209
    .line 210
    goto/16 :goto_3

    .line 211
    .line 212
    :sswitch_3
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_6

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_6
    const/16 v1, 0xd

    .line 220
    .line 221
    goto/16 :goto_3

    .line 222
    .line 223
    :sswitch_4
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_7

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_7
    const/16 v1, 0xc

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :sswitch_5
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_8

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_8
    const/16 v1, 0xb

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :sswitch_6
    const-string v4, "trim"

    .line 244
    .line 245
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-nez v1, :cond_9

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_9
    const/16 v1, 0xa

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :sswitch_7
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_a

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_a
    const/16 v1, 0x9

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :sswitch_8
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-nez v1, :cond_b

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_b
    const/16 v1, 0x8

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :sswitch_9
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-nez v1, :cond_c

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_c
    const/4 v1, 0x7

    .line 283
    goto :goto_3

    .line 284
    :sswitch_a
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_d

    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_d
    const/4 v1, 0x6

    .line 292
    goto :goto_3

    .line 293
    :sswitch_b
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-nez v1, :cond_e

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_e
    const/4 v1, 0x5

    .line 301
    goto :goto_3

    .line 302
    :sswitch_c
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-nez v1, :cond_f

    .line 307
    .line 308
    goto/16 :goto_2

    .line 309
    .line 310
    :cond_f
    const/4 v1, 0x4

    .line 311
    :goto_3
    move/from16 v18, v1

    .line 312
    .line 313
    goto/16 :goto_2

    .line 314
    .line 315
    :sswitch_d
    move-object/from16 v4, v16

    .line 316
    .line 317
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-nez v1, :cond_10

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_10
    const/16 v18, 0x3

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :sswitch_e
    move-object/from16 v4, v16

    .line 328
    .line 329
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_11

    .line 334
    .line 335
    :goto_4
    goto :goto_5

    .line 336
    :cond_11
    const/16 v18, 0x2

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :sswitch_f
    move-object/from16 v4, v16

    .line 340
    .line 341
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_12

    .line 346
    .line 347
    :goto_5
    goto :goto_6

    .line 348
    :cond_12
    const/16 v18, 0x1

    .line 349
    .line 350
    :goto_6
    move-object/from16 v6, v17

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :sswitch_10
    move-object/from16 v4, v16

    .line 354
    .line 355
    move-object/from16 v6, v17

    .line 356
    .line 357
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-nez v1, :cond_13

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_13
    const/16 v18, 0x0

    .line 365
    .line 366
    :goto_7
    move-object/from16 v16, v0

    .line 367
    .line 368
    const-wide/16 v0, 0x0

    .line 369
    .line 370
    packed-switch v18, :pswitch_data_0

    .line 371
    .line 372
    .line 373
    move-object/from16 v2, p0

    .line 374
    .line 375
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 376
    .line 377
    const-string v1, "Command not supported"

    .line 378
    .line 379
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :pswitch_0
    const/4 v2, 0x2

    .line 384
    move-object/from16 v3, p3

    .line 385
    .line 386
    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v2, p0

    .line 390
    .line 391
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 392
    .line 393
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    if-gtz v5, :cond_14

    .line 398
    .line 399
    sget-object v5, Lcom/google/android/gms/internal/measurement/zzaq;->zzc:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 400
    .line 401
    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    move-object/from16 v7, p2

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_14
    const/4 v5, 0x0

    .line 409
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 414
    .line 415
    move-object/from16 v7, p2

    .line 416
    .line 417
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    :goto_8
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    const/4 v8, 0x2

    .line 430
    if-ge v6, v8, :cond_15

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_15
    const/4 v0, 0x1

    .line 434
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 439
    .line 440
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    :goto_9
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 453
    .line 454
    .line 455
    move-result-wide v0

    .line 456
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 457
    .line 458
    double-to-int v0, v0

    .line 459
    invoke-virtual {v4, v5, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    int-to-double v0, v0

    .line 464
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 469
    .line 470
    .line 471
    return-object v3

    .line 472
    :pswitch_1
    move-object/from16 v2, p0

    .line 473
    .line 474
    move-object/from16 v7, p2

    .line 475
    .line 476
    move-object/from16 v3, p3

    .line 477
    .line 478
    const/4 v0, 0x2

    .line 479
    invoke-static {v8, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 480
    .line 481
    .line 482
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzc:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 483
    .line 484
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    if-nez v4, :cond_16

    .line 493
    .line 494
    const/4 v1, 0x0

    .line 495
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 500
    .line 501
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    const/4 v5, 0x1

    .line 514
    if-le v4, v5, :cond_16

    .line 515
    .line 516
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 521
    .line 522
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    :cond_16
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    if-gez v4, :cond_17

    .line 533
    .line 534
    return-object v2

    .line 535
    :cond_17
    instance-of v5, v0, Lcom/google/android/gms/internal/measurement/zzal;

    .line 536
    .line 537
    if-eqz v5, :cond_18

    .line 538
    .line 539
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzal;

    .line 540
    .line 541
    const/4 v5, 0x3

    .line 542
    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/zzaq;

    .line 543
    .line 544
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzas;

    .line 545
    .line 546
    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    const/4 v8, 0x0

    .line 550
    aput-object v6, v5, v8

    .line 551
    .line 552
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzai;

    .line 553
    .line 554
    int-to-double v8, v4

    .line 555
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    invoke-direct {v6, v8}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 560
    .line 561
    .line 562
    const/4 v8, 0x1

    .line 563
    aput-object v6, v5, v8

    .line 564
    .line 565
    const/4 v6, 0x2

    .line 566
    aput-object v2, v5, v6

    .line 567
    .line 568
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-virtual {v0, v7, v5}, Lcom/google/android/gms/internal/measurement/zzal;->zza(Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    :cond_18
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzas;

    .line 577
    .line 578
    const/4 v6, 0x0

    .line 579
    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    add-int/2addr v1, v4

    .line 592
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-static {v6, v0, v1}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    return-object v5

    .line 604
    :pswitch_2
    move-object/from16 v2, p0

    .line 605
    .line 606
    move-object/from16 v7, p2

    .line 607
    .line 608
    move-object/from16 v3, p3

    .line 609
    .line 610
    const/4 v0, 0x2

    .line 611
    invoke-static {v9, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 612
    .line 613
    .line 614
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 615
    .line 616
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-nez v1, :cond_19

    .line 621
    .line 622
    const/4 v1, 0x0

    .line 623
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 628
    .line 629
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 638
    .line 639
    .line 640
    move-result-wide v4

    .line 641
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 642
    .line 643
    .line 644
    move-result-wide v4

    .line 645
    double-to-int v1, v4

    .line 646
    goto :goto_a

    .line 647
    :cond_19
    const/4 v1, 0x0

    .line 648
    :goto_a
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    const/4 v5, 0x1

    .line 653
    if-le v4, v5, :cond_1a

    .line 654
    .line 655
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 660
    .line 661
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 670
    .line 671
    .line 672
    move-result-wide v3

    .line 673
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 674
    .line 675
    .line 676
    move-result-wide v3

    .line 677
    double-to-int v3, v3

    .line 678
    goto :goto_b

    .line 679
    :cond_1a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    :goto_b
    const/4 v4, 0x0

    .line 684
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzas;

    .line 709
    .line 710
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    return-object v4

    .line 726
    :pswitch_3
    move-object/from16 v2, p0

    .line 727
    .line 728
    move-object/from16 v7, p2

    .line 729
    .line 730
    move-object/from16 v3, p3

    .line 731
    .line 732
    const/4 v0, 0x2

    .line 733
    invoke-static {v10, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 734
    .line 735
    .line 736
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 737
    .line 738
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    if-nez v1, :cond_1b

    .line 743
    .line 744
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 745
    .line 746
    const/4 v1, 0x1

    .line 747
    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzaq;

    .line 748
    .line 749
    const/4 v3, 0x0

    .line 750
    aput-object v2, v1, v3

    .line 751
    .line 752
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>([Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 753
    .line 754
    .line 755
    return-object v0

    .line 756
    :cond_1b
    const/4 v1, 0x0

    .line 757
    new-instance v4, Ljava/util/ArrayList;

    .line 758
    .line 759
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 760
    .line 761
    .line 762
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 763
    .line 764
    .line 765
    move-result v5

    .line 766
    if-eqz v5, :cond_1c

    .line 767
    .line 768
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    goto/16 :goto_e

    .line 772
    .line 773
    :cond_1c
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 778
    .line 779
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    const-wide/32 v5, 0x7fffffff

    .line 788
    .line 789
    .line 790
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 791
    .line 792
    .line 793
    move-result v8

    .line 794
    const/4 v9, 0x1

    .line 795
    if-le v8, v9, :cond_1d

    .line 796
    .line 797
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 802
    .line 803
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 812
    .line 813
    .line 814
    move-result-wide v5

    .line 815
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(D)J

    .line 816
    .line 817
    .line 818
    move-result-wide v5

    .line 819
    :cond_1d
    const-wide/16 v7, 0x0

    .line 820
    .line 821
    cmp-long v3, v5, v7

    .line 822
    .line 823
    if-nez v3, :cond_1e

    .line 824
    .line 825
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 826
    .line 827
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 828
    .line 829
    .line 830
    return-object v0

    .line 831
    :cond_1e
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    long-to-int v7, v5

    .line 836
    add-int/lit8 v7, v7, 0x1

    .line 837
    .line 838
    invoke-virtual {v0, v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    array-length v3, v0

    .line 843
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 844
    .line 845
    .line 846
    move-result v1

    .line 847
    if-eqz v1, :cond_1f

    .line 848
    .line 849
    array-length v1, v0

    .line 850
    if-lez v1, :cond_1f

    .line 851
    .line 852
    const/4 v1, 0x0

    .line 853
    aget-object v1, v0, v1

    .line 854
    .line 855
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    array-length v7, v0

    .line 860
    add-int/lit8 v7, v7, -0x1

    .line 861
    .line 862
    aget-object v7, v0, v7

    .line 863
    .line 864
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 865
    .line 866
    .line 867
    move-result v7

    .line 868
    if-eqz v7, :cond_20

    .line 869
    .line 870
    array-length v3, v0

    .line 871
    add-int/lit8 v3, v3, -0x1

    .line 872
    .line 873
    goto :goto_c

    .line 874
    :cond_1f
    const/4 v1, 0x0

    .line 875
    :cond_20
    :goto_c
    array-length v7, v0

    .line 876
    int-to-long v7, v7

    .line 877
    cmp-long v5, v7, v5

    .line 878
    .line 879
    if-lez v5, :cond_21

    .line 880
    .line 881
    add-int/lit8 v3, v3, -0x1

    .line 882
    .line 883
    :cond_21
    :goto_d
    if-ge v1, v3, :cond_22

    .line 884
    .line 885
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzas;

    .line 886
    .line 887
    aget-object v6, v0, v1

    .line 888
    .line 889
    invoke-direct {v5, v6}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    add-int/lit8 v1, v1, 0x1

    .line 896
    .line 897
    goto :goto_d

    .line 898
    :cond_22
    :goto_e
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 899
    .line 900
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>(Ljava/util/List;)V

    .line 901
    .line 902
    .line 903
    return-object v0

    .line 904
    :pswitch_4
    move-object/from16 v2, p0

    .line 905
    .line 906
    move-object/from16 v7, p2

    .line 907
    .line 908
    move-object/from16 v3, p3

    .line 909
    .line 910
    const/4 v4, 0x2

    .line 911
    invoke-static {v11, v4, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 912
    .line 913
    .line 914
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 915
    .line 916
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 917
    .line 918
    .line 919
    move-result v5

    .line 920
    if-nez v5, :cond_23

    .line 921
    .line 922
    const/4 v5, 0x0

    .line 923
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v5

    .line 927
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 928
    .line 929
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 930
    .line 931
    .line 932
    move-result-object v5

    .line 933
    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 934
    .line 935
    .line 936
    move-result-object v5

    .line 937
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 938
    .line 939
    .line 940
    move-result-wide v5

    .line 941
    goto :goto_f

    .line 942
    :cond_23
    move-wide v5, v0

    .line 943
    :goto_f
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 944
    .line 945
    .line 946
    move-result-wide v5

    .line 947
    cmpg-double v8, v5, v0

    .line 948
    .line 949
    if-gez v8, :cond_24

    .line 950
    .line 951
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 952
    .line 953
    .line 954
    move-result v8

    .line 955
    int-to-double v8, v8

    .line 956
    add-double/2addr v8, v5

    .line 957
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 958
    .line 959
    .line 960
    move-result-wide v5

    .line 961
    goto :goto_10

    .line 962
    :cond_24
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 963
    .line 964
    .line 965
    move-result v8

    .line 966
    int-to-double v8, v8

    .line 967
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->min(DD)D

    .line 968
    .line 969
    .line 970
    move-result-wide v5

    .line 971
    :goto_10
    double-to-int v5, v5

    .line 972
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    const/4 v8, 0x1

    .line 977
    if-le v6, v8, :cond_25

    .line 978
    .line 979
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 984
    .line 985
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 990
    .line 991
    .line 992
    move-result-object v3

    .line 993
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 994
    .line 995
    .line 996
    move-result-wide v6

    .line 997
    goto :goto_11

    .line 998
    :cond_25
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    int-to-double v6, v3

    .line 1003
    :goto_11
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v6

    .line 1007
    cmpg-double v3, v6, v0

    .line 1008
    .line 1009
    if-gez v3, :cond_26

    .line 1010
    .line 1011
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    int-to-double v8, v3

    .line 1016
    add-double/2addr v8, v6

    .line 1017
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 1018
    .line 1019
    .line 1020
    move-result-wide v0

    .line 1021
    goto :goto_12

    .line 1022
    :cond_26
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    int-to-double v0, v0

    .line 1027
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 1028
    .line 1029
    .line 1030
    move-result-wide v0

    .line 1031
    :goto_12
    double-to-int v0, v0

    .line 1032
    sub-int/2addr v0, v5

    .line 1033
    const/4 v1, 0x0

    .line 1034
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    add-int/2addr v0, v5

    .line 1039
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1040
    .line 1041
    invoke-virtual {v4, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    return-object v1

    .line 1049
    :pswitch_5
    move-object/from16 v2, p0

    .line 1050
    .line 1051
    move-object/from16 v7, p2

    .line 1052
    .line 1053
    move-object/from16 v3, p3

    .line 1054
    .line 1055
    const/4 v0, 0x1

    .line 1056
    invoke-static {v12, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1060
    .line 1061
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    if-gtz v1, :cond_27

    .line 1066
    .line 1067
    const-string v1, ""

    .line 1068
    .line 1069
    goto :goto_13

    .line 1070
    :cond_27
    const/4 v1, 0x0

    .line 1071
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1076
    .line 1077
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    :goto_13
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v1

    .line 1097
    if-eqz v1, :cond_28

    .line 1098
    .line 1099
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1100
    .line 1101
    const/4 v3, 0x1

    .line 1102
    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1103
    .line 1104
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1105
    .line 1106
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    const/4 v0, 0x0

    .line 1114
    aput-object v4, v3, v0

    .line 1115
    .line 1116
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>([Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1117
    .line 1118
    .line 1119
    return-object v1

    .line 1120
    :cond_28
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzd:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1121
    .line 1122
    return-object v0

    .line 1123
    :pswitch_6
    move-object/from16 v2, p0

    .line 1124
    .line 1125
    move-object/from16 v3, p3

    .line 1126
    .line 1127
    const/4 v0, 0x0

    .line 1128
    invoke-static {v14, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1129
    .line 1130
    .line 1131
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1132
    .line 1133
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1134
    .line 1135
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    return-object v1

    .line 1143
    :pswitch_7
    move-object/from16 v2, p0

    .line 1144
    .line 1145
    move-object/from16 v3, p3

    .line 1146
    .line 1147
    const/4 v0, 0x0

    .line 1148
    invoke-static {v14, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1149
    .line 1150
    .line 1151
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1152
    .line 1153
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1154
    .line 1155
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1156
    .line 1157
    invoke-virtual {v0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    return-object v1

    .line 1165
    :pswitch_8
    move-object/from16 v2, p0

    .line 1166
    .line 1167
    move-object/from16 v7, p2

    .line 1168
    .line 1169
    move-object/from16 v3, p3

    .line 1170
    .line 1171
    const/4 v0, 0x2

    .line 1172
    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 1173
    .line 1174
    .line 1175
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1176
    .line 1177
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 1178
    .line 1179
    .line 1180
    move-result v1

    .line 1181
    if-gtz v1, :cond_29

    .line 1182
    .line 1183
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzaq;->zzc:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1184
    .line 1185
    goto :goto_14

    .line 1186
    :cond_29
    const/4 v1, 0x0

    .line 1187
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1192
    .line 1193
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    :goto_14
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 1202
    .line 1203
    .line 1204
    move-result v4

    .line 1205
    const/4 v5, 0x2

    .line 1206
    if-ge v4, v5, :cond_2a

    .line 1207
    .line 1208
    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    .line 1209
    .line 1210
    goto :goto_15

    .line 1211
    :cond_2a
    const/4 v4, 0x1

    .line 1212
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v3

    .line 1216
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1217
    .line 1218
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v3

    .line 1222
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v3

    .line 1226
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1227
    .line 1228
    .line 1229
    move-result-wide v3

    .line 1230
    :goto_15
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v5

    .line 1234
    if-eqz v5, :cond_2b

    .line 1235
    .line 1236
    const-wide/high16 v3, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 1237
    .line 1238
    goto :goto_16

    .line 1239
    :cond_2b
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 1240
    .line 1241
    .line 1242
    move-result-wide v3

    .line 1243
    :goto_16
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1244
    .line 1245
    double-to-int v3, v3

    .line 1246
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 1247
    .line 1248
    .line 1249
    move-result v0

    .line 1250
    int-to-double v0, v0

    .line 1251
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1256
    .line 1257
    .line 1258
    return-object v5

    .line 1259
    :pswitch_9
    move-object/from16 v2, p0

    .line 1260
    .line 1261
    move-object/from16 v3, p3

    .line 1262
    .line 1263
    const/4 v0, 0x0

    .line 1264
    invoke-static {v5, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1265
    .line 1266
    .line 1267
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1268
    .line 1269
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1270
    .line 1271
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v0

    .line 1275
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    return-object v1

    .line 1279
    :pswitch_a
    move-object/from16 v2, p0

    .line 1280
    .line 1281
    move-object/from16 v7, p2

    .line 1282
    .line 1283
    move-object/from16 v3, p3

    .line 1284
    .line 1285
    const/4 v0, 0x0

    .line 1286
    const/4 v1, 0x1

    .line 1287
    invoke-static {v15, v1, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 1288
    .line 1289
    .line 1290
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 1291
    .line 1292
    .line 1293
    move-result v1

    .line 1294
    if-nez v1, :cond_2c

    .line 1295
    .line 1296
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1301
    .line 1302
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    goto :goto_17

    .line 1307
    :cond_2c
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzc:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1308
    .line 1309
    :goto_17
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1314
    .line 1315
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    if-eqz v1, :cond_2d

    .line 1328
    .line 1329
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 1332
    .line 1333
    .line 1334
    move-result v0

    .line 1335
    int-to-double v3, v0

    .line 1336
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1341
    .line 1342
    .line 1343
    return-object v1

    .line 1344
    :cond_2d
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1345
    .line 1346
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 1347
    .line 1348
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1353
    .line 1354
    .line 1355
    return-object v0

    .line 1356
    :pswitch_b
    move-object/from16 v3, p3

    .line 1357
    .line 1358
    move-object v0, v2

    .line 1359
    move-object/from16 v2, p0

    .line 1360
    .line 1361
    const/4 v1, 0x0

    .line 1362
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1366
    .line 1367
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1368
    .line 1369
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1370
    .line 1371
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1376
    .line 1377
    .line 1378
    return-object v1

    .line 1379
    :pswitch_c
    move-object/from16 v2, p0

    .line 1380
    .line 1381
    move-object/from16 v7, p2

    .line 1382
    .line 1383
    move-object/from16 v3, p3

    .line 1384
    .line 1385
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v0

    .line 1389
    if-eqz v0, :cond_2e

    .line 1390
    .line 1391
    return-object v2

    .line 1392
    :cond_2e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1393
    .line 1394
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1395
    .line 1396
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    const/4 v1, 0x0

    .line 1400
    :goto_18
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 1401
    .line 1402
    .line 1403
    move-result v4

    .line 1404
    if-ge v1, v4, :cond_2f

    .line 1405
    .line 1406
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1411
    .line 1412
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v4

    .line 1416
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v4

    .line 1420
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    add-int/lit8 v1, v1, 0x1

    .line 1424
    .line 1425
    goto :goto_18

    .line 1426
    :cond_2f
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1427
    .line 1428
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    return-object v1

    .line 1436
    :pswitch_d
    move-object/from16 v2, p0

    .line 1437
    .line 1438
    move-object/from16 v7, p2

    .line 1439
    .line 1440
    move-object/from16 v3, p3

    .line 1441
    .line 1442
    const/4 v0, 0x1

    .line 1443
    invoke-static {v4, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zzc(Ljava/lang/String;ILjava/util/List;)V

    .line 1444
    .line 1445
    .line 1446
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 1447
    .line 1448
    .line 1449
    move-result v0

    .line 1450
    if-nez v0, :cond_30

    .line 1451
    .line 1452
    const/4 v0, 0x0

    .line 1453
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1458
    .line 1459
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v0

    .line 1467
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1468
    .line 1469
    .line 1470
    move-result-wide v0

    .line 1471
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(D)D

    .line 1472
    .line 1473
    .line 1474
    move-result-wide v0

    .line 1475
    double-to-int v0, v0

    .line 1476
    goto :goto_19

    .line 1477
    :cond_30
    const/4 v0, 0x0

    .line 1478
    :goto_19
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1479
    .line 1480
    if-ltz v0, :cond_32

    .line 1481
    .line 1482
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1483
    .line 1484
    .line 1485
    move-result v3

    .line 1486
    if-lt v0, v3, :cond_31

    .line 1487
    .line 1488
    goto :goto_1a

    .line 1489
    :cond_31
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1490
    .line 1491
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 1492
    .line 1493
    .line 1494
    move-result v0

    .line 1495
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1500
    .line 1501
    .line 1502
    return-object v3

    .line 1503
    :cond_32
    :goto_1a
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzj:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1504
    .line 1505
    return-object v0

    .line 1506
    :pswitch_e
    move-object/from16 v2, p0

    .line 1507
    .line 1508
    move-object/from16 v3, p3

    .line 1509
    .line 1510
    move-object/from16 v0, v16

    .line 1511
    .line 1512
    const/4 v1, 0x0

    .line 1513
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1514
    .line 1515
    .line 1516
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1517
    .line 1518
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1519
    .line 1520
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1525
    .line 1526
    .line 1527
    return-object v1

    .line 1528
    :pswitch_f
    move-object/from16 v2, p0

    .line 1529
    .line 1530
    move-object v0, v3

    .line 1531
    move-object/from16 v3, p3

    .line 1532
    .line 1533
    const/4 v1, 0x0

    .line 1534
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1535
    .line 1536
    .line 1537
    return-object v2

    .line 1538
    :pswitch_10
    move-object/from16 v2, p0

    .line 1539
    .line 1540
    move-object/from16 v7, p2

    .line 1541
    .line 1542
    move-object/from16 v3, p3

    .line 1543
    .line 1544
    const/4 v0, 0x1

    .line 1545
    const/4 v1, 0x0

    .line 1546
    invoke-static {v6, v0, v3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 1547
    .line 1548
    .line 1549
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    .line 1550
    .line 1551
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1556
    .line 1557
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v1

    .line 1561
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzf()Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v3

    .line 1565
    const-string v4, "length"

    .line 1566
    .line 1567
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1568
    .line 1569
    .line 1570
    move-result v3

    .line 1571
    if-eqz v3, :cond_33

    .line 1572
    .line 1573
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzh:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1574
    .line 1575
    return-object v0

    .line 1576
    :cond_33
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze()Ljava/lang/Double;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v1

    .line 1580
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1581
    .line 1582
    .line 1583
    move-result-wide v3

    .line 1584
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 1585
    .line 1586
    .line 1587
    move-result-wide v5

    .line 1588
    cmpl-double v1, v3, v5

    .line 1589
    .line 1590
    if-nez v1, :cond_34

    .line 1591
    .line 1592
    double-to-int v1, v3

    .line 1593
    if-ltz v1, :cond_34

    .line 1594
    .line 1595
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1596
    .line 1597
    .line 1598
    move-result v0

    .line 1599
    if-ge v1, v0, :cond_34

    .line 1600
    .line 1601
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzh:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1602
    .line 1603
    return-object v0

    .line 1604
    :cond_34
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->zzi:Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1605
    .line 1606
    return-object v0

    .line 1607
    :cond_35
    move-object/from16 v2, p0

    .line 1608
    .line 1609
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1610
    .line 1611
    const/4 v3, 0x1

    .line 1612
    new-array v3, v3, [Ljava/lang/Object;

    .line 1613
    .line 1614
    const/4 v4, 0x0

    .line 1615
    aput-object v1, v3, v4

    .line 1616
    .line 1617
    const-string v1, "%s is not a String function"

    .line 1618
    .line 1619
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v1

    .line 1623
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x6aaca37f -> :sswitch_10
        -0x69e9ad94 -> :sswitch_f
        -0x57513364 -> :sswitch_e
        -0x5128e1d7 -> :sswitch_d
        -0x50c088ec -> :sswitch_c
        -0x43ce226a -> :sswitch_b
        -0x36059a58 -> :sswitch_a
        -0x2b53be43 -> :sswitch_9
        -0x1bdda92d -> :sswitch_8
        -0x17d0ad49 -> :sswitch_7
        0x367422 -> :sswitch_6
        0x62dd9c5 -> :sswitch_5
        0x6873d92 -> :sswitch_4
        0x6891b1a -> :sswitch_3
        0x1f9f6e51 -> :sswitch_2
        0x413cb2b4 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
.end method

.method public final zzc()Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzas;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final zzd()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Ljava/lang/Double;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    goto :goto_0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzas;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zzh()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/google/android/gms/internal/measurement/zzaq;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzav;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzav;-><init>(Lcom/google/android/gms/internal/measurement/zzas;)V

    return-object v0
.end method
