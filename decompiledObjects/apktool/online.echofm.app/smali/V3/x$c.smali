.class public LV3/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->u(LV3/h;Z)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/h;

.field public final synthetic p:Z

.field public final synthetic q:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;LV3/h;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$c;->q:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$c;->o:LV3/h;

    .line 4
    .line 5
    iput-boolean p3, p0, LV3/x$c;->p:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 12

    .line 1
    iget-object v0, p0, LV3/x$c;->o:LV3/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/h;->e()La4/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LV3/x$c;->q:LV3/x;

    .line 12
    .line 13
    invoke-static {v2}, LV3/x;->n(LV3/x;)LY3/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v6, v1

    .line 20
    move v5, v4

    .line 21
    :goto_0
    invoke-virtual {v2}, LY3/d;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x1

    .line 26
    if-nez v7, :cond_5

    .line 27
    .line 28
    invoke-virtual {v2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, LV3/v;

    .line 33
    .line 34
    if-eqz v7, :cond_3

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v7, v6}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_1
    if-nez v5, :cond_2

    .line 44
    .line 45
    invoke-virtual {v7}, LV3/v;->h()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    move v5, v4

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    :goto_2
    move v5, v8

    .line 55
    :cond_3
    :goto_3
    invoke-virtual {v6}, LV3/k;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const-string v7, ""

    .line 62
    .line 63
    invoke-static {v7}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    invoke-virtual {v6}, LV3/k;->Z()Ld4/b;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    :goto_4
    invoke-virtual {v2, v7}, LY3/d;->D(Ld4/b;)LY3/d;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v6}, LV3/k;->c0()LV3/k;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    iget-object v2, p0, LV3/x$c;->q:LV3/x;

    .line 82
    .line 83
    invoke-static {v2}, LV3/x;->n(LV3/x;)LY3/d;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2, v1}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, LV3/v;

    .line 92
    .line 93
    if-nez v2, :cond_6

    .line 94
    .line 95
    new-instance v2, LV3/v;

    .line 96
    .line 97
    iget-object v6, p0, LV3/x$c;->q:LV3/x;

    .line 98
    .line 99
    invoke-static {v6}, LV3/x;->c(LV3/x;)LX3/e;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-direct {v2, v6}, LV3/v;-><init>(LX3/e;)V

    .line 104
    .line 105
    .line 106
    iget-object v6, p0, LV3/x$c;->q:LV3/x;

    .line 107
    .line 108
    invoke-static {v6}, LV3/x;->n(LV3/x;)LY3/d;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v7, v1, v2}, LY3/d;->W(LV3/k;Ljava/lang/Object;)LY3/d;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v6, v7}, LV3/x;->o(LV3/x;LY3/d;)LY3/d;

    .line 117
    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_6
    if-nez v5, :cond_8

    .line 121
    .line 122
    invoke-virtual {v2}, LV3/v;->h()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    move v5, v4

    .line 130
    goto :goto_6

    .line 131
    :cond_8
    :goto_5
    move v5, v8

    .line 132
    :goto_6
    if-eqz v3, :cond_9

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_9
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v2, v3}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    :goto_7
    iget-object v6, p0, LV3/x$c;->q:LV3/x;

    .line 144
    .line 145
    invoke-static {v6}, LV3/x;->c(LV3/x;)LX3/e;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-interface {v6, v0}, LX3/e;->m(La4/i;)V

    .line 150
    .line 151
    .line 152
    if-eqz v3, :cond_a

    .line 153
    .line 154
    new-instance v6, La4/a;

    .line 155
    .line 156
    invoke-virtual {v0}, La4/i;->c()Ld4/h;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v3, v7}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v6, v3, v8, v4}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_a

    .line 168
    .line 169
    :cond_a
    iget-object v3, p0, LV3/x$c;->q:LV3/x;

    .line 170
    .line 171
    invoke-static {v3}, LV3/x;->c(LV3/x;)LX3/e;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-interface {v3, v0}, LX3/e;->k(La4/i;)La4/a;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v6}, La4/a;->f()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_b

    .line 184
    .line 185
    goto/16 :goto_a

    .line 186
    .line 187
    :cond_b
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget-object v7, p0, LV3/x$c;->q:LV3/x;

    .line 192
    .line 193
    invoke-static {v7}, LV3/x;->n(LV3/x;)LY3/d;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-virtual {v7, v1}, LY3/d;->Y(LV3/k;)LY3/d;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-virtual {v7}, LY3/d;->M()LS3/c;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-virtual {v7}, LS3/c;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    :cond_c
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_d

    .line 214
    .line 215
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    check-cast v9, Ljava/util/Map$Entry;

    .line 220
    .line 221
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    check-cast v10, LY3/d;

    .line 226
    .line 227
    invoke-virtual {v10}, LY3/d;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    check-cast v10, LV3/v;

    .line 232
    .line 233
    if-eqz v10, :cond_c

    .line 234
    .line 235
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-virtual {v10, v11}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    if-eqz v10, :cond_c

    .line 244
    .line 245
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    check-cast v9, Ld4/b;

    .line 250
    .line 251
    invoke-interface {v3, v9, v10}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    goto :goto_8

    .line 256
    :cond_d
    invoke-virtual {v6}, La4/a;->b()Ld4/n;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    :cond_e
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    if-eqz v7, :cond_f

    .line 269
    .line 270
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    check-cast v7, Ld4/m;

    .line 275
    .line 276
    invoke-virtual {v7}, Ld4/m;->c()Ld4/b;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    invoke-interface {v3, v9}, Ld4/n;->Q(Ld4/b;)Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-nez v9, :cond_e

    .line 285
    .line 286
    invoke-virtual {v7}, Ld4/m;->c()Ld4/b;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    invoke-virtual {v7}, Ld4/m;->d()Ld4/n;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-interface {v3, v9, v7}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    goto :goto_9

    .line 299
    :cond_f
    new-instance v6, La4/a;

    .line 300
    .line 301
    invoke-virtual {v0}, La4/i;->c()Ld4/h;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-static {v3, v7}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-direct {v6, v3, v4, v4}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 310
    .line 311
    .line 312
    :goto_a
    invoke-virtual {v2, v0}, LV3/v;->k(La4/i;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-nez v3, :cond_10

    .line 317
    .line 318
    invoke-virtual {v0}, La4/i;->g()Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-nez v4, :cond_10

    .line 323
    .line 324
    iget-object v4, p0, LV3/x$c;->q:LV3/x;

    .line 325
    .line 326
    invoke-static {v4}, LV3/x;->p(LV3/x;)Ljava/util/Map;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    xor-int/2addr v4, v8

    .line 335
    const-string v7, "View does not exist but we have a tag"

    .line 336
    .line 337
    invoke-static {v4, v7}, LY3/m;->g(ZLjava/lang/String;)V

    .line 338
    .line 339
    .line 340
    iget-object v4, p0, LV3/x$c;->q:LV3/x;

    .line 341
    .line 342
    invoke-static {v4}, LV3/x;->q(LV3/x;)LV3/y;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    iget-object v7, p0, LV3/x$c;->q:LV3/x;

    .line 347
    .line 348
    invoke-static {v7}, LV3/x;->p(LV3/x;)Ljava/util/Map;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-interface {v7, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    iget-object v7, p0, LV3/x$c;->q:LV3/x;

    .line 356
    .line 357
    invoke-static {v7}, LV3/x;->r(LV3/x;)Ljava/util/Map;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    invoke-interface {v7, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    :cond_10
    iget-object v4, p0, LV3/x$c;->q:LV3/x;

    .line 365
    .line 366
    invoke-static {v4}, LV3/x;->j(LV3/x;)LV3/F;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-virtual {v4, v1}, LV3/F;->h(LV3/k;)LV3/G;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    iget-object v4, p0, LV3/x$c;->o:LV3/h;

    .line 375
    .line 376
    invoke-virtual {v2, v4, v1, v6}, LV3/v;->a(LV3/h;LV3/G;La4/a;)Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    if-nez v3, :cond_11

    .line 381
    .line 382
    if-nez v5, :cond_11

    .line 383
    .line 384
    iget-boolean v3, p0, LV3/x$c;->p:Z

    .line 385
    .line 386
    if-nez v3, :cond_11

    .line 387
    .line 388
    invoke-virtual {v2, v0}, LV3/v;->l(La4/i;)La4/j;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget-object v3, p0, LV3/x$c;->q:LV3/x;

    .line 393
    .line 394
    invoke-static {v3, v0, v2}, LV3/x;->d(LV3/x;La4/i;La4/j;)V

    .line 395
    .line 396
    .line 397
    :cond_11
    return-object v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$c;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
