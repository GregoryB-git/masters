.class public final Lx0/e;
.super Lx0/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/e$a;,
        Lx0/e$b;,
        Lx0/e$c;,
        Lx0/e$d;,
        Lx0/e$e;,
        Lx0/e$f;,
        Lx0/e$g;,
        Lx0/e$h;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lx0/r0;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static q(Lr/b;Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Le0/d0$d;->k(Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v2}, Lx0/e;->q(Lr/b;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
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

.method public static r(Lr/b;Ljava/util/Collection;)V
    .locals 1

    invoke-virtual {p0}, Lr/b;->entrySet()Ljava/util/Set;

    move-result-object p0

    const-string v0, "entries"

    invoke-static {p0, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx0/e$i;

    invoke-direct {v0, p1}, Lx0/e$i;-><init>(Ljava/util/Collection;)V

    check-cast p0, Lr/g$b;

    invoke-virtual {p0}, Lr/g$b;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx0/e$i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;Z)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v14, p2

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "operation.fragment.mView"

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    move-object v7, v3

    .line 26
    check-cast v7, Lx0/r0$c;

    .line 27
    .line 28
    iget-object v8, v7, Lx0/r0$c;->c:Lx0/i;

    .line 29
    .line 30
    iget-object v8, v8, Lx0/i;->mView:Landroid/view/View;

    .line 31
    .line 32
    invoke-static {v8, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v8}, Lx0/s0;->a(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-ne v8, v5, :cond_1

    .line 40
    .line 41
    iget v7, v7, Lx0/r0$c;->a:I

    .line 42
    .line 43
    if-eq v7, v5, :cond_1

    .line 44
    .line 45
    move v7, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v7, 0x0

    .line 48
    :goto_0
    if-eqz v7, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v3, 0x0

    .line 52
    :goto_1
    check-cast v3, Lx0/r0$c;

    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_3
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    move-object v8, v7

    .line 73
    check-cast v8, Lx0/r0$c;

    .line 74
    .line 75
    iget-object v9, v8, Lx0/r0$c;->c:Lx0/i;

    .line 76
    .line 77
    iget-object v9, v9, Lx0/i;->mView:Landroid/view/View;

    .line 78
    .line 79
    invoke-static {v9, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v9}, Lx0/s0;->a(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eq v9, v5, :cond_4

    .line 87
    .line 88
    iget v8, v8, Lx0/r0$c;->a:I

    .line 89
    .line 90
    if-ne v8, v5, :cond_4

    .line 91
    .line 92
    move v8, v6

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    const/4 v8, 0x0

    .line 95
    :goto_2
    if-eqz v8, :cond_3

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/4 v7, 0x0

    .line 99
    :goto_3
    move-object v4, v7

    .line 100
    check-cast v4, Lx0/r0$c;

    .line 101
    .line 102
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const-string v15, "FragmentManager"

    .line 107
    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v5, "Executing operations from "

    .line 116
    .line 117
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v5, " to "

    .line 124
    .line 125
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    :cond_6
    new-instance v13, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v2, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-nez v5, :cond_40

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, Lva/a;->d(Ljava/util/List;)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Lx0/r0$c;

    .line 163
    .line 164
    iget-object v5, v5, Lx0/r0$c;->c:Lx0/i;

    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_7

    .line 175
    .line 176
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Lx0/r0$c;

    .line 181
    .line 182
    iget-object v8, v8, Lx0/r0$c;->c:Lx0/i;

    .line 183
    .line 184
    iget-object v8, v8, Lx0/i;->mAnimationInfo:Lx0/i$k;

    .line 185
    .line 186
    iget-object v9, v5, Lx0/i;->mAnimationInfo:Lx0/i$k;

    .line 187
    .line 188
    iget v10, v9, Lx0/i$k;->b:I

    .line 189
    .line 190
    iput v10, v8, Lx0/i$k;->b:I

    .line 191
    .line 192
    iget v10, v9, Lx0/i$k;->c:I

    .line 193
    .line 194
    iput v10, v8, Lx0/i$k;->c:I

    .line 195
    .line 196
    iget v10, v9, Lx0/i$k;->d:I

    .line 197
    .line 198
    iput v10, v8, Lx0/i$k;->d:I

    .line 199
    .line 200
    iget v9, v9, Lx0/i$k;->e:I

    .line 201
    .line 202
    iput v9, v8, Lx0/i$k;->e:I

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_a

    .line 214
    .line 215
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Lx0/r0$c;

    .line 220
    .line 221
    new-instance v7, Lx0/e$b;

    .line 222
    .line 223
    invoke-direct {v7, v5, v14}, Lx0/e$b;-><init>(Lx0/r0$c;Z)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    new-instance v7, Lx0/e$h;

    .line 230
    .line 231
    if-eqz v14, :cond_8

    .line 232
    .line 233
    if-ne v5, v3, :cond_9

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_8
    if-ne v5, v4, :cond_9

    .line 237
    .line 238
    :goto_6
    move v8, v6

    .line 239
    goto :goto_7

    .line 240
    :cond_9
    const/4 v8, 0x0

    .line 241
    :goto_7
    invoke-direct {v7, v5, v14, v8}, Lx0/e$h;-><init>(Lx0/r0$c;ZZ)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    new-instance v7, Lg/q;

    .line 248
    .line 249
    invoke-direct {v7, v6, v0, v5}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    iget-object v5, v5, Lx0/r0$c;->d:Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    :cond_b
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_c

    .line 272
    .line 273
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    move-object v7, v5

    .line 278
    check-cast v7, Lx0/e$h;

    .line 279
    .line 280
    invoke-virtual {v7}, Lx0/e$f;->a()Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-nez v7, :cond_b

    .line 285
    .line 286
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_c
    new-instance v12, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    :cond_d
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_f

    .line 304
    .line 305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    move-object v5, v2

    .line 310
    check-cast v5, Lx0/e$h;

    .line 311
    .line 312
    invoke-virtual {v5}, Lx0/e$h;->b()Lx0/n0;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-eqz v5, :cond_e

    .line 317
    .line 318
    move v5, v6

    .line 319
    goto :goto_a

    .line 320
    :cond_e
    const/4 v5, 0x0

    .line 321
    :goto_a
    if-eqz v5, :cond_d

    .line 322
    .line 323
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const/4 v2, 0x0

    .line 332
    move-object v5, v2

    .line 333
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_13

    .line 338
    .line 339
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Lx0/e$h;

    .line 344
    .line 345
    invoke-virtual {v2}, Lx0/e$h;->b()Lx0/n0;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    if-eqz v5, :cond_11

    .line 350
    .line 351
    if-ne v7, v5, :cond_10

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_10
    const/4 v5, 0x0

    .line 355
    goto :goto_d

    .line 356
    :cond_11
    :goto_c
    move v5, v6

    .line 357
    :goto_d
    if-eqz v5, :cond_12

    .line 358
    .line 359
    move-object v5, v7

    .line 360
    goto :goto_b

    .line 361
    :cond_12
    const-string v1, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 362
    .line 363
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iget-object v3, v2, Lx0/e$f;->a:Lx0/r0$c;

    .line 368
    .line 369
    iget-object v3, v3, Lx0/r0$c;->c:Lx0/i;

    .line 370
    .line 371
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    const-string v3, " returned Transition "

    .line 375
    .line 376
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    iget-object v2, v2, Lx0/e$h;->b:Ljava/lang/Object;

    .line 380
    .line 381
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    const-string v2, " which uses a different Transition type than other Fragments."

    .line 385
    .line 386
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v2

    .line 403
    :cond_13
    if-nez v5, :cond_14

    .line 404
    .line 405
    move-object/from16 v17, v13

    .line 406
    .line 407
    goto/16 :goto_23

    .line 408
    .line 409
    :cond_14
    new-instance v7, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    new-instance v8, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 417
    .line 418
    .line 419
    new-instance v9, Lr/b;

    .line 420
    .line 421
    invoke-direct {v9}, Lr/b;-><init>()V

    .line 422
    .line 423
    .line 424
    new-instance v1, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    new-instance v2, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 432
    .line 433
    .line 434
    new-instance v11, Lr/b;

    .line 435
    .line 436
    invoke-direct {v11}, Lr/b;-><init>()V

    .line 437
    .line 438
    .line 439
    new-instance v10, Lr/b;

    .line 440
    .line 441
    invoke-direct {v10}, Lr/b;-><init>()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    const/16 v16, 0x0

    .line 449
    .line 450
    move-object/from16 v17, v1

    .line 451
    .line 452
    move-object/from16 v18, v2

    .line 453
    .line 454
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_2d

    .line 459
    .line 460
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    check-cast v1, Lx0/e$h;

    .line 465
    .line 466
    iget-object v1, v1, Lx0/e$h;->d:Ljava/lang/Object;

    .line 467
    .line 468
    if-eqz v1, :cond_15

    .line 469
    .line 470
    const/4 v2, 0x1

    .line 471
    goto :goto_f

    .line 472
    :cond_15
    const/4 v2, 0x0

    .line 473
    :goto_f
    if-eqz v2, :cond_2c

    .line 474
    .line 475
    if-eqz v3, :cond_2c

    .line 476
    .line 477
    if-eqz v4, :cond_2c

    .line 478
    .line 479
    invoke-virtual {v5, v1}, Lx0/n0;->e(Ljava/lang/Object;)Landroid/transition/Transition;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v5, v1}, Lx0/n0;->r(Ljava/lang/Object;)Landroid/transition/TransitionSet;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    iget-object v2, v4, Lx0/r0$c;->c:Lx0/i;

    .line 488
    .line 489
    invoke-virtual {v2}, Lx0/i;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    move-object/from16 p1, v6

    .line 494
    .line 495
    const-string v6, "lastIn.fragment.sharedElementSourceNames"

    .line 496
    .line 497
    invoke-static {v2, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    iget-object v6, v3, Lx0/r0$c;->c:Lx0/i;

    .line 501
    .line 502
    invoke-virtual {v6}, Lx0/i;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    move-object/from16 v19, v13

    .line 507
    .line 508
    const-string v13, "firstOut.fragment.sharedElementSourceNames"

    .line 509
    .line 510
    invoke-static {v6, v13}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    iget-object v13, v3, Lx0/r0$c;->c:Lx0/i;

    .line 514
    .line 515
    invoke-virtual {v13}, Lx0/i;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 516
    .line 517
    .line 518
    move-result-object v13

    .line 519
    const-string v0, "firstOut.fragment.sharedElementTargetNames"

    .line 520
    .line 521
    invoke-static {v13, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    const/16 v16, 0x0

    .line 529
    .line 530
    move-object/from16 v20, v5

    .line 531
    .line 532
    move-object/from16 v21, v12

    .line 533
    .line 534
    move/from16 v5, v16

    .line 535
    .line 536
    :goto_10
    const/4 v12, -0x1

    .line 537
    if-ge v5, v0, :cond_17

    .line 538
    .line 539
    move/from16 v16, v0

    .line 540
    .line 541
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-eq v0, v12, :cond_16

    .line 550
    .line 551
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v12

    .line 555
    invoke-virtual {v2, v0, v12}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    :cond_16
    add-int/lit8 v5, v5, 0x1

    .line 559
    .line 560
    move/from16 v0, v16

    .line 561
    .line 562
    goto :goto_10

    .line 563
    :cond_17
    iget-object v0, v4, Lx0/r0$c;->c:Lx0/i;

    .line 564
    .line 565
    invoke-virtual {v0}, Lx0/i;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    const-string v5, "lastIn.fragment.sharedElementTargetNames"

    .line 570
    .line 571
    invoke-static {v0, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    if-nez v14, :cond_18

    .line 575
    .line 576
    iget-object v5, v3, Lx0/r0$c;->c:Lx0/i;

    .line 577
    .line 578
    invoke-virtual {v5}, Lx0/i;->getExitTransitionCallback()Lu/a0;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    iget-object v6, v4, Lx0/r0$c;->c:Lx0/i;

    .line 583
    .line 584
    invoke-virtual {v6}, Lx0/i;->getEnterTransitionCallback()Lu/a0;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    new-instance v12, Lrb/d;

    .line 589
    .line 590
    invoke-direct {v12, v5, v6}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    goto :goto_11

    .line 594
    :cond_18
    iget-object v5, v3, Lx0/r0$c;->c:Lx0/i;

    .line 595
    .line 596
    invoke-virtual {v5}, Lx0/i;->getEnterTransitionCallback()Lu/a0;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    iget-object v6, v4, Lx0/r0$c;->c:Lx0/i;

    .line 601
    .line 602
    invoke-virtual {v6}, Lx0/i;->getExitTransitionCallback()Lu/a0;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    new-instance v12, Lrb/d;

    .line 607
    .line 608
    invoke-direct {v12, v5, v6}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    :goto_11
    iget-object v5, v12, Lrb/d;->a:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v5, Lu/a0;

    .line 614
    .line 615
    iget-object v6, v12, Lrb/d;->b:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v6, Lu/a0;

    .line 618
    .line 619
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 620
    .line 621
    .line 622
    move-result v12

    .line 623
    const/4 v13, 0x0

    .line 624
    :goto_12
    const-string v14, "enteringNames[i]"

    .line 625
    .line 626
    move-object/from16 v22, v8

    .line 627
    .line 628
    const-string v8, "exitingNames[i]"

    .line 629
    .line 630
    if-ge v13, v12, :cond_19

    .line 631
    .line 632
    move/from16 v16, v12

    .line 633
    .line 634
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v12

    .line 638
    invoke-static {v12, v8}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    check-cast v12, Ljava/lang/String;

    .line 642
    .line 643
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    invoke-static {v8, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    check-cast v8, Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v9, v12, v8}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    add-int/lit8 v13, v13, 0x1

    .line 656
    .line 657
    move/from16 v12, v16

    .line 658
    .line 659
    move-object/from16 v8, v22

    .line 660
    .line 661
    goto :goto_12

    .line 662
    :cond_19
    const/4 v12, 0x2

    .line 663
    invoke-static {v12}, Lx0/y;->L(I)Z

    .line 664
    .line 665
    .line 666
    move-result v12

    .line 667
    if-eqz v12, :cond_1b

    .line 668
    .line 669
    const-string v12, ">>> entering view names <<<"

    .line 670
    .line 671
    invoke-static {v15, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 675
    .line 676
    .line 677
    move-result-object v12

    .line 678
    :goto_13
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v13

    .line 682
    move-object/from16 v23, v7

    .line 683
    .line 684
    const-string v7, "Name: "

    .line 685
    .line 686
    if-eqz v13, :cond_1a

    .line 687
    .line 688
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v13

    .line 692
    check-cast v13, Ljava/lang/String;

    .line 693
    .line 694
    move-object/from16 v16, v12

    .line 695
    .line 696
    new-instance v12, Ljava/lang/StringBuilder;

    .line 697
    .line 698
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 712
    .line 713
    .line 714
    move-object/from16 v12, v16

    .line 715
    .line 716
    move-object/from16 v7, v23

    .line 717
    .line 718
    goto :goto_13

    .line 719
    :cond_1a
    const-string v12, ">>> exiting view names <<<"

    .line 720
    .line 721
    invoke-static {v15, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 725
    .line 726
    .line 727
    move-result-object v12

    .line 728
    :goto_14
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 729
    .line 730
    .line 731
    move-result v13

    .line 732
    if-eqz v13, :cond_1c

    .line 733
    .line 734
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v13

    .line 738
    check-cast v13, Ljava/lang/String;

    .line 739
    .line 740
    move-object/from16 v16, v12

    .line 741
    .line 742
    new-instance v12, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v12

    .line 757
    invoke-static {v15, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 758
    .line 759
    .line 760
    move-object/from16 v12, v16

    .line 761
    .line 762
    goto :goto_14

    .line 763
    :cond_1b
    move-object/from16 v23, v7

    .line 764
    .line 765
    :cond_1c
    iget-object v7, v3, Lx0/r0$c;->c:Lx0/i;

    .line 766
    .line 767
    iget-object v7, v7, Lx0/i;->mView:Landroid/view/View;

    .line 768
    .line 769
    const-string v12, "firstOut.fragment.mView"

    .line 770
    .line 771
    invoke-static {v7, v12}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-static {v11, v7}, Lx0/e;->q(Lr/b;Landroid/view/View;)V

    .line 775
    .line 776
    .line 777
    invoke-static {v11, v2}, Lr/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 778
    .line 779
    .line 780
    if-eqz v5, :cond_21

    .line 781
    .line 782
    const/4 v5, 0x2

    .line 783
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    if-eqz v5, :cond_1d

    .line 788
    .line 789
    new-instance v5, Ljava/lang/StringBuilder;

    .line 790
    .line 791
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 792
    .line 793
    .line 794
    const-string v7, "Executing exit callback for operation "

    .line 795
    .line 796
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 807
    .line 808
    .line 809
    :cond_1d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 810
    .line 811
    .line 812
    move-result v5

    .line 813
    add-int/lit8 v5, v5, -0x1

    .line 814
    .line 815
    if-ltz v5, :cond_22

    .line 816
    .line 817
    :goto_15
    add-int/lit8 v7, v5, -0x1

    .line 818
    .line 819
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v5

    .line 823
    invoke-static {v5, v8}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    check-cast v5, Ljava/lang/String;

    .line 827
    .line 828
    const/4 v12, 0x0

    .line 829
    invoke-virtual {v11, v5, v12}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v12

    .line 833
    check-cast v12, Landroid/view/View;

    .line 834
    .line 835
    if-nez v12, :cond_1e

    .line 836
    .line 837
    invoke-virtual {v9, v5}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    goto :goto_16

    .line 841
    :cond_1e
    sget-object v13, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 842
    .line 843
    invoke-static {v12}, Le0/d0$d;->k(Landroid/view/View;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v13

    .line 847
    invoke-static {v5, v13}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v13

    .line 851
    if-nez v13, :cond_1f

    .line 852
    .line 853
    invoke-virtual {v9, v5}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v5

    .line 857
    check-cast v5, Ljava/lang/String;

    .line 858
    .line 859
    invoke-static {v12}, Le0/d0$d;->k(Landroid/view/View;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v12

    .line 863
    invoke-virtual {v9, v12, v5}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    :cond_1f
    :goto_16
    if-gez v7, :cond_20

    .line 867
    .line 868
    goto :goto_17

    .line 869
    :cond_20
    move v5, v7

    .line 870
    goto :goto_15

    .line 871
    :cond_21
    invoke-virtual {v11}, Lr/b;->keySet()Ljava/util/Set;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    invoke-static {v9, v5}, Lr/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 876
    .line 877
    .line 878
    :cond_22
    :goto_17
    iget-object v5, v4, Lx0/r0$c;->c:Lx0/i;

    .line 879
    .line 880
    iget-object v5, v5, Lx0/i;->mView:Landroid/view/View;

    .line 881
    .line 882
    const-string v7, "lastIn.fragment.mView"

    .line 883
    .line 884
    invoke-static {v5, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    invoke-static {v10, v5}, Lx0/e;->q(Lr/b;Landroid/view/View;)V

    .line 888
    .line 889
    .line 890
    invoke-static {v10, v0}, Lr/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 891
    .line 892
    .line 893
    invoke-virtual {v9}, Lr/b;->values()Ljava/util/Collection;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    invoke-static {v10, v5}, Lr/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 898
    .line 899
    .line 900
    if-eqz v6, :cond_28

    .line 901
    .line 902
    const/4 v5, 0x2

    .line 903
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 904
    .line 905
    .line 906
    move-result v5

    .line 907
    if-eqz v5, :cond_23

    .line 908
    .line 909
    new-instance v5, Ljava/lang/StringBuilder;

    .line 910
    .line 911
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 912
    .line 913
    .line 914
    const-string v6, "Executing enter callback for operation "

    .line 915
    .line 916
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v5

    .line 926
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 927
    .line 928
    .line 929
    :cond_23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 930
    .line 931
    .line 932
    move-result v5

    .line 933
    add-int/lit8 v5, v5, -0x1

    .line 934
    .line 935
    if-ltz v5, :cond_27

    .line 936
    .line 937
    :goto_18
    add-int/lit8 v6, v5, -0x1

    .line 938
    .line 939
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    invoke-static {v5, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    check-cast v5, Ljava/lang/String;

    .line 947
    .line 948
    const/4 v7, 0x0

    .line 949
    invoke-virtual {v10, v5, v7}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v8

    .line 953
    check-cast v8, Landroid/view/View;

    .line 954
    .line 955
    if-nez v8, :cond_24

    .line 956
    .line 957
    invoke-static {v9, v5}, Lx0/h0;->b(Lr/b;Ljava/lang/String;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v5

    .line 961
    if-eqz v5, :cond_25

    .line 962
    .line 963
    invoke-virtual {v9, v5}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    goto :goto_19

    .line 967
    :cond_24
    sget-object v12, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 968
    .line 969
    invoke-static {v8}, Le0/d0$d;->k(Landroid/view/View;)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v12

    .line 973
    invoke-static {v5, v12}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v12

    .line 977
    if-nez v12, :cond_25

    .line 978
    .line 979
    invoke-static {v9, v5}, Lx0/h0;->b(Lr/b;Ljava/lang/String;)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    if-eqz v5, :cond_25

    .line 984
    .line 985
    invoke-static {v8}, Le0/d0$d;->k(Landroid/view/View;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v8

    .line 989
    invoke-virtual {v9, v5, v8}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    :cond_25
    :goto_19
    if-gez v6, :cond_26

    .line 993
    .line 994
    move-object/from16 v16, v7

    .line 995
    .line 996
    goto :goto_1c

    .line 997
    :cond_26
    move v5, v6

    .line 998
    goto :goto_18

    .line 999
    :cond_27
    const/4 v5, 0x0

    .line 1000
    goto :goto_1b

    .line 1001
    :cond_28
    const/4 v5, 0x0

    .line 1002
    sget-object v6, Lx0/h0;->a:Lx0/j0;

    .line 1003
    .line 1004
    iget v6, v9, Lr/h;->c:I

    .line 1005
    .line 1006
    const/4 v7, -0x1

    .line 1007
    add-int/2addr v6, v7

    .line 1008
    :goto_1a
    if-ge v7, v6, :cond_2a

    .line 1009
    .line 1010
    invoke-virtual {v9, v6}, Lr/h;->k(I)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v8

    .line 1014
    check-cast v8, Ljava/lang/String;

    .line 1015
    .line 1016
    invoke-virtual {v10, v8}, Lr/h;->containsKey(Ljava/lang/Object;)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v8

    .line 1020
    if-nez v8, :cond_29

    .line 1021
    .line 1022
    invoke-virtual {v9, v6}, Lr/h;->j(I)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    :cond_29
    add-int/lit8 v6, v6, -0x1

    .line 1026
    .line 1027
    goto :goto_1a

    .line 1028
    :cond_2a
    :goto_1b
    move-object/from16 v16, v5

    .line 1029
    .line 1030
    :goto_1c
    invoke-virtual {v9}, Lr/b;->keySet()Ljava/util/Set;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v5

    .line 1034
    const-string v6, "sharedElementNameMapping.keys"

    .line 1035
    .line 1036
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v11, v5}, Lx0/e;->r(Lr/b;Ljava/util/Collection;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v9}, Lr/b;->values()Ljava/util/Collection;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    const-string v6, "sharedElementNameMapping.values"

    .line 1047
    .line 1048
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v10, v5}, Lx0/e;->r(Lr/b;Ljava/util/Collection;)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v9}, Lr/h;->isEmpty()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v5

    .line 1058
    if-eqz v5, :cond_2b

    .line 1059
    .line 1060
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1063
    .line 1064
    .line 1065
    const-string v6, "Ignoring shared elements transition "

    .line 1066
    .line 1067
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    const-string v1, " between "

    .line 1074
    .line 1075
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    const-string v1, " and "

    .line 1082
    .line 1083
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    const-string v1, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    .line 1090
    .line 1091
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    invoke-static {v15, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->clear()V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->clear()V

    .line 1105
    .line 1106
    .line 1107
    move-object/from16 v17, v0

    .line 1108
    .line 1109
    goto :goto_1d

    .line 1110
    :cond_2b
    move-object/from16 v17, v0

    .line 1111
    .line 1112
    move-object/from16 v16, v1

    .line 1113
    .line 1114
    :goto_1d
    move-object/from16 v18, v2

    .line 1115
    .line 1116
    goto :goto_1e

    .line 1117
    :cond_2c
    move-object/from16 v20, v5

    .line 1118
    .line 1119
    move-object/from16 p1, v6

    .line 1120
    .line 1121
    move-object/from16 v23, v7

    .line 1122
    .line 1123
    move-object/from16 v22, v8

    .line 1124
    .line 1125
    move-object/from16 v21, v12

    .line 1126
    .line 1127
    move-object/from16 v19, v13

    .line 1128
    .line 1129
    :goto_1e
    move-object/from16 v0, p0

    .line 1130
    .line 1131
    move-object/from16 v6, p1

    .line 1132
    .line 1133
    move/from16 v14, p2

    .line 1134
    .line 1135
    move-object/from16 v13, v19

    .line 1136
    .line 1137
    move-object/from16 v5, v20

    .line 1138
    .line 1139
    move-object/from16 v12, v21

    .line 1140
    .line 1141
    move-object/from16 v8, v22

    .line 1142
    .line 1143
    move-object/from16 v7, v23

    .line 1144
    .line 1145
    goto/16 :goto_e

    .line 1146
    .line 1147
    :cond_2d
    move-object/from16 v20, v5

    .line 1148
    .line 1149
    move-object/from16 v23, v7

    .line 1150
    .line 1151
    move-object/from16 v22, v8

    .line 1152
    .line 1153
    move-object/from16 v21, v12

    .line 1154
    .line 1155
    move-object/from16 v19, v13

    .line 1156
    .line 1157
    if-nez v16, :cond_32

    .line 1158
    .line 1159
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    if-eqz v0, :cond_2e

    .line 1164
    .line 1165
    goto :goto_20

    .line 1166
    :cond_2e
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    :cond_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v1

    .line 1174
    if-eqz v1, :cond_31

    .line 1175
    .line 1176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    check-cast v1, Lx0/e$h;

    .line 1181
    .line 1182
    iget-object v1, v1, Lx0/e$h;->b:Ljava/lang/Object;

    .line 1183
    .line 1184
    if-nez v1, :cond_30

    .line 1185
    .line 1186
    const/4 v1, 0x1

    .line 1187
    goto :goto_1f

    .line 1188
    :cond_30
    const/4 v1, 0x0

    .line 1189
    :goto_1f
    if-nez v1, :cond_2f

    .line 1190
    .line 1191
    const/4 v0, 0x0

    .line 1192
    goto :goto_21

    .line 1193
    :cond_31
    :goto_20
    const/4 v0, 0x1

    .line 1194
    :goto_21
    if-eqz v0, :cond_32

    .line 1195
    .line 1196
    const/4 v6, 0x1

    .line 1197
    move-object/from16 v17, v19

    .line 1198
    .line 1199
    goto :goto_23

    .line 1200
    :cond_32
    new-instance v0, Lx0/e$g;

    .line 1201
    .line 1202
    const/16 v24, 0x1

    .line 1203
    .line 1204
    move-object v1, v0

    .line 1205
    move-object/from16 v2, v21

    .line 1206
    .line 1207
    move-object/from16 v5, v20

    .line 1208
    .line 1209
    move-object/from16 v6, v16

    .line 1210
    .line 1211
    move-object/from16 v7, v23

    .line 1212
    .line 1213
    move-object/from16 v8, v22

    .line 1214
    .line 1215
    move-object v13, v10

    .line 1216
    move-object/from16 v10, v17

    .line 1217
    .line 1218
    move-object v12, v11

    .line 1219
    move-object/from16 v11, v18

    .line 1220
    .line 1221
    move-object/from16 v16, v21

    .line 1222
    .line 1223
    move-object/from16 v17, v19

    .line 1224
    .line 1225
    move/from16 v14, p2

    .line 1226
    .line 1227
    invoke-direct/range {v1 .. v14}, Lx0/e$g;-><init>(Ljava/util/ArrayList;Lx0/r0$c;Lx0/r0$c;Lx0/n0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lr/b;Ljava/util/ArrayList;Ljava/util/ArrayList;Lr/b;Lr/b;Z)V

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    if-eqz v2, :cond_33

    .line 1239
    .line 1240
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v2

    .line 1244
    check-cast v2, Lx0/e$h;

    .line 1245
    .line 1246
    iget-object v2, v2, Lx0/e$f;->a:Lx0/r0$c;

    .line 1247
    .line 1248
    iget-object v2, v2, Lx0/r0$c;->j:Ljava/util/ArrayList;

    .line 1249
    .line 1250
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    goto :goto_22

    .line 1254
    :cond_33
    move/from16 v6, v24

    .line 1255
    .line 1256
    :goto_23
    new-instance v0, Ljava/util/ArrayList;

    .line 1257
    .line 1258
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1259
    .line 1260
    .line 1261
    new-instance v1, Ljava/util/ArrayList;

    .line 1262
    .line 1263
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1271
    .line 1272
    .line 1273
    move-result v3

    .line 1274
    if-eqz v3, :cond_34

    .line 1275
    .line 1276
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v3

    .line 1280
    check-cast v3, Lx0/e$b;

    .line 1281
    .line 1282
    iget-object v3, v3, Lx0/e$f;->a:Lx0/r0$c;

    .line 1283
    .line 1284
    iget-object v3, v3, Lx0/r0$c;->k:Ljava/util/ArrayList;

    .line 1285
    .line 1286
    invoke-static {v3, v1}, Lsb/o;->k(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 1287
    .line 1288
    .line 1289
    goto :goto_24

    .line 1290
    :cond_34
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1291
    .line 1292
    .line 1293
    move-result v1

    .line 1294
    xor-int/lit8 v1, v1, 0x1

    .line 1295
    .line 1296
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v2

    .line 1300
    const/4 v3, 0x0

    .line 1301
    :cond_35
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1302
    .line 1303
    .line 1304
    move-result v4

    .line 1305
    if-eqz v4, :cond_3b

    .line 1306
    .line 1307
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v4

    .line 1311
    check-cast v4, Lx0/e$b;

    .line 1312
    .line 1313
    move-object/from16 v5, p0

    .line 1314
    .line 1315
    iget-object v7, v5, Lx0/r0;->a:Landroid/view/ViewGroup;

    .line 1316
    .line 1317
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v7

    .line 1321
    iget-object v8, v4, Lx0/e$f;->a:Lx0/r0$c;

    .line 1322
    .line 1323
    const-string v9, "context"

    .line 1324
    .line 1325
    invoke-static {v7, v9}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v4, v7}, Lx0/e$b;->b(Landroid/content/Context;)Lx0/n;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v7

    .line 1332
    if-nez v7, :cond_36

    .line 1333
    .line 1334
    goto :goto_25

    .line 1335
    :cond_36
    iget-object v7, v7, Lx0/n;->b:Landroid/animation/AnimatorSet;

    .line 1336
    .line 1337
    if-nez v7, :cond_37

    .line 1338
    .line 1339
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1340
    .line 1341
    .line 1342
    goto :goto_25

    .line 1343
    :cond_37
    iget-object v7, v8, Lx0/r0$c;->c:Lx0/i;

    .line 1344
    .line 1345
    iget-object v9, v8, Lx0/r0$c;->k:Ljava/util/ArrayList;

    .line 1346
    .line 1347
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v9

    .line 1351
    xor-int/lit8 v9, v9, 0x1

    .line 1352
    .line 1353
    if-eqz v9, :cond_38

    .line 1354
    .line 1355
    const/4 v4, 0x2

    .line 1356
    invoke-static {v4}, Lx0/y;->L(I)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v4

    .line 1360
    if-eqz v4, :cond_35

    .line 1361
    .line 1362
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1363
    .line 1364
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1365
    .line 1366
    .line 1367
    const-string v8, "Ignoring Animator set on "

    .line 1368
    .line 1369
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1373
    .line 1374
    .line 1375
    const-string v7, " as this Fragment was involved in a Transition."

    .line 1376
    .line 1377
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v4

    .line 1384
    invoke-static {v15, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1385
    .line 1386
    .line 1387
    goto :goto_25

    .line 1388
    :cond_38
    iget v3, v8, Lx0/r0$c;->a:I

    .line 1389
    .line 1390
    const/4 v7, 0x3

    .line 1391
    if-ne v3, v7, :cond_39

    .line 1392
    .line 1393
    move v3, v6

    .line 1394
    goto :goto_26

    .line 1395
    :cond_39
    const/4 v3, 0x0

    .line 1396
    :goto_26
    const/4 v7, 0x0

    .line 1397
    if-eqz v3, :cond_3a

    .line 1398
    .line 1399
    iput-boolean v7, v8, Lx0/r0$c;->i:Z

    .line 1400
    .line 1401
    :cond_3a
    new-instance v3, Lx0/e$c;

    .line 1402
    .line 1403
    invoke-direct {v3, v4}, Lx0/e$c;-><init>(Lx0/e$b;)V

    .line 1404
    .line 1405
    .line 1406
    iget-object v4, v8, Lx0/r0$c;->j:Ljava/util/ArrayList;

    .line 1407
    .line 1408
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    move v3, v6

    .line 1412
    goto :goto_25

    .line 1413
    :cond_3b
    move-object/from16 v5, p0

    .line 1414
    .line 1415
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    :cond_3c
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v2

    .line 1423
    if-eqz v2, :cond_3f

    .line 1424
    .line 1425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    check-cast v2, Lx0/e$b;

    .line 1430
    .line 1431
    iget-object v4, v2, Lx0/e$f;->a:Lx0/r0$c;

    .line 1432
    .line 1433
    iget-object v6, v4, Lx0/r0$c;->c:Lx0/i;

    .line 1434
    .line 1435
    const-string v7, "Ignoring Animation set on "

    .line 1436
    .line 1437
    if-eqz v1, :cond_3d

    .line 1438
    .line 1439
    const/4 v2, 0x2

    .line 1440
    invoke-static {v2}, Lx0/y;->L(I)Z

    .line 1441
    .line 1442
    .line 1443
    move-result v2

    .line 1444
    if-eqz v2, :cond_3c

    .line 1445
    .line 1446
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1447
    .line 1448
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    const-string v4, " as Animations cannot run alongside Transitions."

    .line 1458
    .line 1459
    goto :goto_28

    .line 1460
    :cond_3d
    const/4 v8, 0x2

    .line 1461
    if-eqz v3, :cond_3e

    .line 1462
    .line 1463
    invoke-static {v8}, Lx0/y;->L(I)Z

    .line 1464
    .line 1465
    .line 1466
    move-result v2

    .line 1467
    if-eqz v2, :cond_3c

    .line 1468
    .line 1469
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1478
    .line 1479
    .line 1480
    const-string v4, " as Animations cannot run alongside Animators."

    .line 1481
    .line 1482
    :goto_28
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v2

    .line 1489
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1490
    .line 1491
    .line 1492
    goto :goto_27

    .line 1493
    :cond_3e
    new-instance v6, Lx0/e$a;

    .line 1494
    .line 1495
    invoke-direct {v6, v2}, Lx0/e$a;-><init>(Lx0/e$b;)V

    .line 1496
    .line 1497
    .line 1498
    iget-object v2, v4, Lx0/r0$c;->j:Ljava/util/ArrayList;

    .line 1499
    .line 1500
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1501
    .line 1502
    .line 1503
    goto :goto_27

    .line 1504
    :cond_3f
    return-void

    .line 1505
    :cond_40
    move-object v5, v0

    .line 1506
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 1507
    .line 1508
    const-string v1, "List is empty."

    .line 1509
    .line 1510
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 1511
    .line 1512
    .line 1513
    throw v0
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method
