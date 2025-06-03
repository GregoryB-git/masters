.class public final LR2/h6;
.super LR2/d;
.source "SourceFile"


# instance fields
.field public g:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic h:LR2/b6;


# direct methods
.method public constructor <init>(LR2/b6;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/h6;->h:LR2/b6;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, LR2/d;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x1;->U()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/Y1;JLR2/E;Z)Z
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A6;->a()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v0, LR2/h6;->h:LR2/b6;

    .line 11
    .line 12
    invoke-virtual {v1}, LR2/m3;->f()LR2/g;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v4, v0, LR2/d;->a:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v5, LR2/K;->j0:LR2/P1;

    .line 19
    .line 20
    invoke-virtual {v1, v4, v5}, LR2/g;->D(Ljava/lang/String;LR2/P1;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move v1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v2

    .line 29
    :goto_0
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->T()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    move-object/from16 v4, p6

    .line 38
    .line 39
    iget-wide v4, v4, LR2/E;->e:J

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-wide/from16 v4, p4

    .line 43
    .line 44
    :goto_1
    iget-object v6, v0, LR2/h6;->h:LR2/b6;

    .line 45
    .line 46
    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const/4 v7, 0x2

    .line 51
    invoke-virtual {v6, v7}, LR2/Y1;->C(I)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v7, 0x0

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    iget-object v6, v0, LR2/h6;->h:LR2/b6;

    .line 59
    .line 60
    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget v8, v0, LR2/d;->b:I

    .line 69
    .line 70
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    iget-object v9, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 75
    .line 76
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_2

    .line 81
    .line 82
    iget-object v9, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 83
    .line 84
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    move-object v9, v7

    .line 94
    :goto_2
    iget-object v10, v0, LR2/h6;->h:LR2/b6;

    .line 95
    .line 96
    invoke-virtual {v10}, LR2/m3;->h()LR2/X1;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    iget-object v11, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 101
    .line 102
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/x1;->P()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v10, v11}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    const-string v11, "Evaluating filter. audience, filter, event"

    .line 111
    .line 112
    invoke-virtual {v6, v11, v8, v9, v10}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v6, v0, LR2/h6;->h:LR2/b6;

    .line 116
    .line 117
    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 126
    .line 127
    invoke-virtual {v8}, LR2/z5;->o()LR2/N5;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    iget-object v9, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 132
    .line 133
    invoke-virtual {v8, v9}, LR2/N5;->I(Lcom/google/android/gms/internal/measurement/x1;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const-string v9, "Filter definition"

    .line 138
    .line 139
    invoke-virtual {v6, v9, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    iget-object v6, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 143
    .line 144
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_2a

    .line 149
    .line 150
    iget-object v6, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 151
    .line 152
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    const/16 v8, 0x100

    .line 157
    .line 158
    if-le v6, v8, :cond_4

    .line 159
    .line 160
    goto/16 :goto_10

    .line 161
    .line 162
    :cond_4
    iget-object v6, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 163
    .line 164
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/x1;->R()Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    iget-object v8, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 169
    .line 170
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/x1;->S()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    iget-object v9, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 175
    .line 176
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/x1;->T()Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-nez v6, :cond_6

    .line 181
    .line 182
    if-nez v8, :cond_6

    .line 183
    .line 184
    if-eqz v9, :cond_5

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move v6, v2

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    :goto_3
    move v6, v3

    .line 190
    :goto_4
    if-eqz p7, :cond_8

    .line 191
    .line 192
    if-nez v6, :cond_8

    .line 193
    .line 194
    iget-object v1, v0, LR2/h6;->h:LR2/b6;

    .line 195
    .line 196
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget v2, v0, LR2/d;->b:I

    .line 205
    .line 206
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 211
    .line 212
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_7

    .line 217
    .line 218
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 219
    .line 220
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    :cond_7
    const-string v4, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    .line 229
    .line 230
    invoke-virtual {v1, v4, v2, v7}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return v3

    .line 234
    :cond_8
    iget-object v8, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 235
    .line 236
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/x1;->U()Z

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    if-eqz v10, :cond_a

    .line 245
    .line 246
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/x1;->O()Lcom/google/android/gms/internal/measurement/z1;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-static {v4, v5, v10}, LR2/d;->c(JLcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    if-nez v4, :cond_9

    .line 255
    .line 256
    goto/16 :goto_d

    .line 257
    .line 258
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-nez v4, :cond_a

    .line 263
    .line 264
    :goto_5
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 265
    .line 266
    goto/16 :goto_d

    .line 267
    .line 268
    :cond_a
    new-instance v4, Ljava/util/HashSet;

    .line 269
    .line 270
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/x1;->Q()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-eqz v10, :cond_c

    .line 286
    .line 287
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    check-cast v10, Lcom/google/android/gms/internal/measurement/y1;

    .line 292
    .line 293
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/y1;->M()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-eqz v11, :cond_b

    .line 302
    .line 303
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 304
    .line 305
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 314
    .line 315
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    const-string v8, "null or empty param name in filter. event"

    .line 324
    .line 325
    :goto_7
    invoke-virtual {v4, v8, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_d

    .line 329
    .line 330
    :cond_b
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/y1;->M()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    invoke-interface {v4, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_c
    new-instance v5, Lt/a;

    .line 339
    .line 340
    invoke-direct {v5}, Lt/a;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/Y1;->c0()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    :cond_d
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    if-eqz v11, :cond_12

    .line 356
    .line 357
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    check-cast v11, Lcom/google/android/gms/internal/measurement/a2;

    .line 362
    .line 363
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v12

    .line 367
    invoke-interface {v4, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    if-eqz v12, :cond_d

    .line 372
    .line 373
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    if-eqz v12, :cond_f

    .line 378
    .line 379
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    if-eqz v13, :cond_e

    .line 388
    .line 389
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 390
    .line 391
    .line 392
    move-result-wide v13

    .line 393
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    goto :goto_9

    .line 398
    :cond_e
    move-object v11, v7

    .line 399
    :goto_9
    invoke-interface {v5, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_f
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->f0()Z

    .line 404
    .line 405
    .line 406
    move-result v12

    .line 407
    if-eqz v12, :cond_10

    .line 408
    .line 409
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v12

    .line 413
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->f0()Z

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    if-eqz v13, :cond_e

    .line 418
    .line 419
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->G()D

    .line 420
    .line 421
    .line 422
    move-result-wide v13

    .line 423
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    goto :goto_9

    .line 428
    :cond_10
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->j0()Z

    .line 429
    .line 430
    .line 431
    move-result v12

    .line 432
    if-eqz v12, :cond_11

    .line 433
    .line 434
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v11

    .line 442
    goto :goto_9

    .line 443
    :cond_11
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 444
    .line 445
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 454
    .line 455
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 464
    .line 465
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    invoke-virtual {v8, v9}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    const-string v9, "Unknown value for param. event, param"

    .line 478
    .line 479
    :goto_a
    invoke-virtual {v4, v9, v5, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_d

    .line 483
    .line 484
    :cond_12
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/x1;->Q()Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    if-eqz v8, :cond_22

    .line 497
    .line 498
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    check-cast v8, Lcom/google/android/gms/internal/measurement/y1;

    .line 503
    .line 504
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->O()Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_14

    .line 509
    .line 510
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->N()Z

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    if-eqz v10, :cond_14

    .line 515
    .line 516
    move v10, v3

    .line 517
    goto :goto_b

    .line 518
    :cond_14
    move v10, v2

    .line 519
    :goto_b
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->M()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v11

    .line 523
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 524
    .line 525
    .line 526
    move-result v12

    .line 527
    if-eqz v12, :cond_15

    .line 528
    .line 529
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 530
    .line 531
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 540
    .line 541
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    const-string v8, "Event has empty param name. event"

    .line 550
    .line 551
    goto/16 :goto_7

    .line 552
    .line 553
    :cond_15
    invoke-interface {v5, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    instance-of v13, v12, Ljava/lang/Long;

    .line 558
    .line 559
    if-eqz v13, :cond_18

    .line 560
    .line 561
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    .line 562
    .line 563
    .line 564
    move-result v13

    .line 565
    if-nez v13, :cond_16

    .line 566
    .line 567
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 568
    .line 569
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 578
    .line 579
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 588
    .line 589
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    invoke-virtual {v8, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    const-string v9, "No number filter for long param. event, param"

    .line 598
    .line 599
    goto :goto_a

    .line 600
    :cond_16
    check-cast v12, Ljava/lang/Long;

    .line 601
    .line 602
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 603
    .line 604
    .line 605
    move-result-wide v11

    .line 606
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    invoke-static {v11, v12, v8}, LR2/d;->c(JLcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    if-nez v8, :cond_17

    .line 615
    .line 616
    goto/16 :goto_d

    .line 617
    .line 618
    :cond_17
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 619
    .line 620
    .line 621
    move-result v8

    .line 622
    if-ne v8, v10, :cond_13

    .line 623
    .line 624
    goto/16 :goto_5

    .line 625
    .line 626
    :cond_18
    instance-of v13, v12, Ljava/lang/Double;

    .line 627
    .line 628
    if-eqz v13, :cond_1b

    .line 629
    .line 630
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    .line 631
    .line 632
    .line 633
    move-result v13

    .line 634
    if-nez v13, :cond_19

    .line 635
    .line 636
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 637
    .line 638
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 647
    .line 648
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 649
    .line 650
    .line 651
    move-result-object v5

    .line 652
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 657
    .line 658
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 659
    .line 660
    .line 661
    move-result-object v8

    .line 662
    invoke-virtual {v8, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    const-string v9, "No number filter for double param. event, param"

    .line 667
    .line 668
    goto/16 :goto_a

    .line 669
    .line 670
    :cond_19
    check-cast v12, Ljava/lang/Double;

    .line 671
    .line 672
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    .line 673
    .line 674
    .line 675
    move-result-wide v11

    .line 676
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    invoke-static {v11, v12, v8}, LR2/d;->b(DLcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    .line 681
    .line 682
    .line 683
    move-result-object v8

    .line 684
    if-nez v8, :cond_1a

    .line 685
    .line 686
    goto/16 :goto_d

    .line 687
    .line 688
    :cond_1a
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 689
    .line 690
    .line 691
    move-result v8

    .line 692
    if-ne v8, v10, :cond_13

    .line 693
    .line 694
    goto/16 :goto_5

    .line 695
    .line 696
    :cond_1b
    instance-of v13, v12, Ljava/lang/String;

    .line 697
    .line 698
    if-eqz v13, :cond_20

    .line 699
    .line 700
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->R()Z

    .line 701
    .line 702
    .line 703
    move-result v13

    .line 704
    if-eqz v13, :cond_1c

    .line 705
    .line 706
    check-cast v12, Ljava/lang/String;

    .line 707
    .line 708
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->L()Lcom/google/android/gms/internal/measurement/B1;

    .line 709
    .line 710
    .line 711
    move-result-object v8

    .line 712
    iget-object v11, v0, LR2/h6;->h:LR2/b6;

    .line 713
    .line 714
    invoke-virtual {v11}, LR2/m3;->j()LR2/Y1;

    .line 715
    .line 716
    .line 717
    move-result-object v11

    .line 718
    invoke-static {v12, v8, v11}, LR2/d;->g(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/B1;LR2/Y1;)Ljava/lang/Boolean;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    goto :goto_c

    .line 723
    :cond_1c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    .line 724
    .line 725
    .line 726
    move-result v13

    .line 727
    if-eqz v13, :cond_1f

    .line 728
    .line 729
    check-cast v12, Ljava/lang/String;

    .line 730
    .line 731
    invoke-static {v12}, LR2/N5;->f0(Ljava/lang/String;)Z

    .line 732
    .line 733
    .line 734
    move-result v13

    .line 735
    if-eqz v13, :cond_1e

    .line 736
    .line 737
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    invoke-static {v12, v8}, LR2/d;->e(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    .line 742
    .line 743
    .line 744
    move-result-object v8

    .line 745
    :goto_c
    if-nez v8, :cond_1d

    .line 746
    .line 747
    goto/16 :goto_d

    .line 748
    .line 749
    :cond_1d
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 750
    .line 751
    .line 752
    move-result v8

    .line 753
    if-ne v8, v10, :cond_13

    .line 754
    .line 755
    goto/16 :goto_5

    .line 756
    .line 757
    :cond_1e
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 758
    .line 759
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 768
    .line 769
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 778
    .line 779
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    invoke-virtual {v8, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    const-string v9, "Invalid param value for number filter. event, param"

    .line 788
    .line 789
    goto/16 :goto_a

    .line 790
    .line 791
    :cond_1f
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 792
    .line 793
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 794
    .line 795
    .line 796
    move-result-object v4

    .line 797
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 802
    .line 803
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 812
    .line 813
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 814
    .line 815
    .line 816
    move-result-object v8

    .line 817
    invoke-virtual {v8, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v8

    .line 821
    const-string v9, "No filter for String param. event, param"

    .line 822
    .line 823
    goto/16 :goto_a

    .line 824
    .line 825
    :cond_20
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 826
    .line 827
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    if-nez v12, :cond_21

    .line 832
    .line 833
    invoke-virtual {v4}, LR2/Y1;->K()LR2/a2;

    .line 834
    .line 835
    .line 836
    move-result-object v4

    .line 837
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 838
    .line 839
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v5

    .line 847
    iget-object v7, v0, LR2/h6;->h:LR2/b6;

    .line 848
    .line 849
    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    .line 850
    .line 851
    .line 852
    move-result-object v7

    .line 853
    invoke-virtual {v7, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    const-string v8, "Missing param for filter. event, param"

    .line 858
    .line 859
    invoke-virtual {v4, v8, v5, v7}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    goto/16 :goto_5

    .line 863
    .line 864
    :cond_21
    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    iget-object v5, v0, LR2/h6;->h:LR2/b6;

    .line 869
    .line 870
    invoke-virtual {v5}, LR2/m3;->h()LR2/X1;

    .line 871
    .line 872
    .line 873
    move-result-object v5

    .line 874
    invoke-virtual {v5, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v5

    .line 878
    iget-object v8, v0, LR2/h6;->h:LR2/b6;

    .line 879
    .line 880
    invoke-virtual {v8}, LR2/m3;->h()LR2/X1;

    .line 881
    .line 882
    .line 883
    move-result-object v8

    .line 884
    invoke-virtual {v8, v11}, LR2/X1;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v8

    .line 888
    const-string v9, "Unknown param type. event, param"

    .line 889
    .line 890
    goto/16 :goto_a

    .line 891
    .line 892
    :cond_22
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 893
    .line 894
    :goto_d
    iget-object v4, v0, LR2/h6;->h:LR2/b6;

    .line 895
    .line 896
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    .line 897
    .line 898
    .line 899
    move-result-object v4

    .line 900
    invoke-virtual {v4}, LR2/Y1;->K()LR2/a2;

    .line 901
    .line 902
    .line 903
    move-result-object v4

    .line 904
    if-nez v7, :cond_23

    .line 905
    .line 906
    const-string v5, "null"

    .line 907
    .line 908
    goto :goto_e

    .line 909
    :cond_23
    move-object v5, v7

    .line 910
    :goto_e
    const-string v8, "Event filter result"

    .line 911
    .line 912
    invoke-virtual {v4, v8, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    if-nez v7, :cond_24

    .line 916
    .line 917
    return v2

    .line 918
    :cond_24
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 919
    .line 920
    iput-object v2, v0, LR2/d;->c:Ljava/lang/Boolean;

    .line 921
    .line 922
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-nez v4, :cond_25

    .line 927
    .line 928
    return v3

    .line 929
    :cond_25
    iput-object v2, v0, LR2/d;->d:Ljava/lang/Boolean;

    .line 930
    .line 931
    if-eqz v6, :cond_29

    .line 932
    .line 933
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/Y1;->f0()Z

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    if-eqz v2, :cond_29

    .line 938
    .line 939
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    .line 940
    .line 941
    .line 942
    move-result-wide v4

    .line 943
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 948
    .line 949
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->S()Z

    .line 950
    .line 951
    .line 952
    move-result v4

    .line 953
    if-eqz v4, :cond_27

    .line 954
    .line 955
    if-eqz v1, :cond_26

    .line 956
    .line 957
    iget-object v1, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 958
    .line 959
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/x1;->U()Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-eqz v1, :cond_26

    .line 964
    .line 965
    move-object/from16 v2, p1

    .line 966
    .line 967
    :cond_26
    iput-object v2, v0, LR2/d;->f:Ljava/lang/Long;

    .line 968
    .line 969
    goto :goto_f

    .line 970
    :cond_27
    if-eqz v1, :cond_28

    .line 971
    .line 972
    iget-object v1, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 973
    .line 974
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/x1;->U()Z

    .line 975
    .line 976
    .line 977
    move-result v1

    .line 978
    if-eqz v1, :cond_28

    .line 979
    .line 980
    move-object/from16 v2, p2

    .line 981
    .line 982
    :cond_28
    iput-object v2, v0, LR2/d;->e:Ljava/lang/Long;

    .line 983
    .line 984
    :cond_29
    :goto_f
    return v3

    .line 985
    :cond_2a
    :goto_10
    iget-object v1, v0, LR2/h6;->h:LR2/b6;

    .line 986
    .line 987
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    iget-object v3, v0, LR2/d;->a:Ljava/lang/String;

    .line 996
    .line 997
    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 1002
    .line 1003
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v4

    .line 1007
    if-eqz v4, :cond_2b

    .line 1008
    .line 1009
    iget-object v4, v0, LR2/h6;->g:Lcom/google/android/gms/internal/measurement/x1;

    .line 1010
    .line 1011
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 1012
    .line 1013
    .line 1014
    move-result v4

    .line 1015
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v7

    .line 1019
    :cond_2b
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    const-string v5, "Invalid event filter ID. appId, id"

    .line 1024
    .line 1025
    invoke-virtual {v1, v5, v3, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    return v2
.end method
