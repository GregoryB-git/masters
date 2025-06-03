.class public final synthetic Lr3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/t$a;
.implements Ln9/l;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li9/n;Ljava/util/HashSet;Ljava/util/List;Lu7/m;)V
    .locals 0

    iput-object p1, p0, Lr3/q;->a:Ljava/lang/Object;

    iput-object p2, p0, Lr3/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr3/q;->c:Ljava/lang/Object;

    iput-object p4, p0, Lr3/q;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lr3/q;->a:Ljava/lang/Object;

    check-cast v0, Lr3/t;

    iget-object v1, p0, Lr3/q;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lr3/q;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    iget-object v3, p0, Lr3/q;->d:Ljava/lang/Object;

    check-cast v3, Ln3/a$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {p1, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance v1, Lr3/r;

    const/4 v4, 0x1

    invoke-direct {v1, v0, v2, v3, v4}, Lr3/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lr3/t;->k0(Landroid/database/Cursor;Lr3/t$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/a;

    return-object p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, Lr3/q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li9/n;

    .line 4
    .line 5
    iget-object v1, p0, Lr3/q;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    iget-object v2, p0, Lr3/q;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/List;

    .line 12
    .line 13
    iget-object v3, p0, Lr3/q;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lu7/m;

    .line 16
    .line 17
    iget-object v4, v0, Li9/n;->e:Li9/g0;

    .line 18
    .line 19
    invoke-interface {v4, v1}, Li9/g0;->a(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v4, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Lj9/m;

    .line 54
    .line 55
    iget v8, v8, Lj9/m;->c:I

    .line 56
    .line 57
    invoke-static {v8, v7}, Lq0/g;->b(II)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    xor-int/2addr v7, v8

    .line 62
    if-nez v7, :cond_0

    .line 63
    .line 64
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Lj9/i;

    .line 69
    .line 70
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v5, v0, Li9/n;->f:Li9/h;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v6, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v5, v6, v8}, Li9/h;->f(Ljava/util/Map;Ljava/util/Set;)V

    .line 89
    .line 90
    .line 91
    new-instance v8, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v1, v6, v8}, Li9/h;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v5, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    const/4 v9, 0x0

    .line 114
    if-eqz v8, :cond_6

    .line 115
    .line 116
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    check-cast v8, Lk9/f;

    .line 121
    .line 122
    iget-object v10, v8, Lk9/f;->a:Lj9/i;

    .line 123
    .line 124
    invoke-virtual {v1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    check-cast v10, Li9/c0;

    .line 129
    .line 130
    iget-object v10, v10, Li9/c0;->a:Lj9/g;

    .line 131
    .line 132
    iget-object v11, v8, Lk9/f;->c:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    :cond_3
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_5

    .line 143
    .line 144
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    check-cast v12, Lk9/e;

    .line 149
    .line 150
    iget-object v13, v12, Lk9/e;->a:Lj9/l;

    .line 151
    .line 152
    invoke-interface {v10, v13}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    iget-object v14, v12, Lk9/e;->b:Lk9/p;

    .line 157
    .line 158
    invoke-interface {v14, v13}, Lk9/p;->c(Lka/d0;)Lka/d0;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    if-eqz v13, :cond_3

    .line 163
    .line 164
    if-nez v9, :cond_4

    .line 165
    .line 166
    new-instance v9, Lj9/n;

    .line 167
    .line 168
    invoke-direct {v9}, Lj9/n;-><init>()V

    .line 169
    .line 170
    .line 171
    :cond_4
    iget-object v12, v12, Lk9/e;->a:Lj9/l;

    .line 172
    .line 173
    invoke-virtual {v9, v12, v13}, Lj9/n;->f(Lj9/l;Lka/d0;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    if-eqz v9, :cond_2

    .line 178
    .line 179
    new-instance v10, Lk9/l;

    .line 180
    .line 181
    iget-object v8, v8, Lk9/f;->a:Lj9/i;

    .line 182
    .line 183
    invoke-virtual {v9}, Lj9/n;->b()Lka/d0;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v11}, Lka/d0;->Y()Lka/u;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    invoke-static {v11}, Lj9/n;->c(Lka/u;)Lk9/d;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-static {v7}, Lk9/m;->a(Z)Lk9/m;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-direct {v10, v8, v9, v11, v12}, Lk9/l;-><init>(Lj9/i;Lj9/n;Lk9/d;Lk9/m;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_6
    iget-object v6, v0, Li9/n;->c:Li9/a0;

    .line 207
    .line 208
    invoke-interface {v6, v3, v5, v2}, Li9/a0;->d(Lu7/m;Ljava/util/ArrayList;Ljava/util/List;)Lk9/g;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v3, Ljava/util/HashMap;

    .line 216
    .line 217
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Lk9/g;->b()Ljava/util/HashSet;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_a

    .line 233
    .line 234
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, Lj9/i;

    .line 239
    .line 240
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Li9/c0;

    .line 245
    .line 246
    iget-object v8, v8, Li9/c0;->a:Lj9/g;

    .line 247
    .line 248
    check-cast v8, Lj9/m;

    .line 249
    .line 250
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    check-cast v10, Li9/c0;

    .line 255
    .line 256
    iget-object v10, v10, Li9/c0;->b:Lk9/d;

    .line 257
    .line 258
    invoke-virtual {v2, v8, v10}, Lk9/g;->a(Lj9/m;Lk9/d;)Lk9/d;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    if-eqz v11, :cond_8

    .line 267
    .line 268
    move-object v10, v9

    .line 269
    :cond_8
    invoke-static {v8, v10}, Lk9/f;->c(Lj9/m;Lk9/d;)Lk9/f;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    if-eqz v10, :cond_9

    .line 274
    .line 275
    invoke-virtual {v3, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :cond_9
    iget v6, v8, Lj9/m;->c:I

    .line 279
    .line 280
    invoke-static {v6, v7}, Lq0/g;->b(II)Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    xor-int/2addr v6, v7

    .line 285
    if-nez v6, :cond_7

    .line 286
    .line 287
    sget-object v6, Lj9/q;->b:Lj9/q;

    .line 288
    .line 289
    invoke-virtual {v8, v6}, Lj9/m;->l(Lj9/q;)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_a
    iget-object v0, v0, Li9/n;->d:Li9/b;

    .line 294
    .line 295
    iget v4, v2, Lk9/g;->a:I

    .line 296
    .line 297
    invoke-interface {v0, v4, v3}, Li9/b;->a(ILjava/util/HashMap;)V

    .line 298
    .line 299
    .line 300
    iget v0, v2, Lk9/g;->a:I

    .line 301
    .line 302
    invoke-static {v0, v1}, Li9/g;->a(ILjava/util/HashMap;)Li9/g;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    return-object v0
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
