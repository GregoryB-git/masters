.class public final synthetic Lr3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/t$a;
.implements Lv5/l$a;
.implements Ln9/l;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lr3/l;->a:I

    iput-object p2, p0, Lr3/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr3/l;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lr3/l;->b:Ljava/lang/Object;

    check-cast v0, Lr3/t;

    iget-object v1, p0, Lr3/l;->c:Ljava/lang/Object;

    check-cast v1, Lk3/s;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lr3/t;->Q(Landroid/database/sqlite/SQLiteDatabase;Lk3/s;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr3/t;->I()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"

    invoke-virtual {v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance v0, Lw3/v;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw3/v;-><init>(I)V

    invoke-static {p1, v0}, Lr3/t;->k0(Landroid/database/Cursor;Lr3/t$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    :goto_0
    return-object p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lr3/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lr3/l;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Li9/n;

    .line 10
    .line 11
    iget-object v1, p0, Lr3/l;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, v0, Li9/n;->j:Li9/a;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Li9/a;->d(Ljava/lang/String;)Lf9/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :goto_0
    iget-object v0, p0, Lr3/l;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Li9/n;

    .line 25
    .line 26
    iget-object v1, p0, Lr3/l;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lk9/h;

    .line 29
    .line 30
    sget v2, Li9/n;->o:I

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v2, v1, Lk9/h;->a:Lk9/g;

    .line 36
    .line 37
    iget-object v3, v0, Li9/n;->c:Li9/a0;

    .line 38
    .line 39
    iget-object v4, v1, Lk9/h;->d:Lma/h;

    .line 40
    .line 41
    invoke-interface {v3, v2, v4}, Li9/a0;->j(Lk9/g;Lma/h;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v1, Lk9/h;->a:Lk9/g;

    .line 45
    .line 46
    invoke-virtual {v3}, Lk9/g;->b()Ljava/util/HashSet;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/4 v6, 0x0

    .line 59
    if-eqz v5, :cond_5

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lj9/i;

    .line 66
    .line 67
    iget-object v7, v0, Li9/n;->e:Li9/g0;

    .line 68
    .line 69
    invoke-interface {v7, v5}, Li9/g0;->g(Lj9/i;)Lj9/m;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iget-object v8, v1, Lk9/h;->e:Lt8/c;

    .line 74
    .line 75
    invoke-virtual {v8, v5}, Lt8/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lj9/q;

    .line 80
    .line 81
    const/4 v8, 0x1

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    move v9, v8

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    move v9, v6

    .line 87
    :goto_2
    new-array v10, v6, [Ljava/lang/Object;

    .line 88
    .line 89
    const-string v11, "docVersions should contain every doc in the write."

    .line 90
    .line 91
    invoke-static {v11, v9, v10}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v9, v7, Lj9/m;->d:Lj9/q;

    .line 95
    .line 96
    invoke-virtual {v9, v5}, Lj9/q;->f(Lj9/q;)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-gez v5, :cond_0

    .line 101
    .line 102
    iget-object v5, v3, Lk9/g;->d:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    iget-object v9, v1, Lk9/h;->c:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-ne v10, v5, :cond_2

    .line 115
    .line 116
    move v10, v8

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    move v10, v6

    .line 119
    :goto_3
    const/4 v11, 0x2

    .line 120
    new-array v11, v11, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    aput-object v12, v11, v6

    .line 127
    .line 128
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    aput-object v12, v11, v8

    .line 137
    .line 138
    const-string v12, "Mismatch between mutations length (%d) and results length (%d)"

    .line 139
    .line 140
    invoke-static {v12, v10, v11}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    if-ge v6, v5, :cond_4

    .line 144
    .line 145
    iget-object v10, v3, Lk9/g;->d:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    check-cast v10, Lk9/f;

    .line 152
    .line 153
    iget-object v11, v10, Lk9/f;->a:Lj9/i;

    .line 154
    .line 155
    iget-object v12, v7, Lj9/m;->b:Lj9/i;

    .line 156
    .line 157
    invoke-virtual {v11, v12}, Lj9/i;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_3

    .line 162
    .line 163
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    check-cast v11, Lk9/i;

    .line 168
    .line 169
    invoke-virtual {v10, v7, v11}, Lk9/f;->b(Lj9/m;Lk9/i;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_4
    iget v5, v7, Lj9/m;->c:I

    .line 176
    .line 177
    invoke-static {v5, v8}, Lq0/g;->b(II)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    xor-int/2addr v5, v8

    .line 182
    if-eqz v5, :cond_0

    .line 183
    .line 184
    iget-object v5, v0, Li9/n;->e:Li9/g0;

    .line 185
    .line 186
    iget-object v6, v1, Lk9/h;->b:Lj9/q;

    .line 187
    .line 188
    invoke-interface {v5, v7, v6}, Li9/g0;->d(Lj9/m;Lj9/q;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_5
    iget-object v4, v0, Li9/n;->c:Li9/a0;

    .line 194
    .line 195
    invoke-interface {v4, v3}, Li9/a0;->b(Lk9/g;)V

    .line 196
    .line 197
    .line 198
    iget-object v3, v0, Li9/n;->c:Li9/a0;

    .line 199
    .line 200
    invoke-interface {v3}, Li9/a0;->a()V

    .line 201
    .line 202
    .line 203
    iget-object v3, v0, Li9/n;->d:Li9/b;

    .line 204
    .line 205
    iget-object v4, v1, Lk9/h;->a:Lk9/g;

    .line 206
    .line 207
    iget v4, v4, Lk9/g;->a:I

    .line 208
    .line 209
    invoke-interface {v3, v4}, Li9/b;->f(I)V

    .line 210
    .line 211
    .line 212
    iget-object v3, v0, Li9/n;->f:Li9/h;

    .line 213
    .line 214
    new-instance v4, Ljava/util/HashSet;

    .line 215
    .line 216
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 217
    .line 218
    .line 219
    :goto_5
    iget-object v5, v1, Lk9/h;->c:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-ge v6, v5, :cond_7

    .line 226
    .line 227
    iget-object v5, v1, Lk9/h;->c:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    check-cast v5, Lk9/i;

    .line 234
    .line 235
    iget-object v5, v5, Lk9/i;->b:Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-nez v5, :cond_6

    .line 242
    .line 243
    iget-object v5, v1, Lk9/h;->a:Lk9/g;

    .line 244
    .line 245
    iget-object v5, v5, Lk9/g;->d:Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    check-cast v5, Lk9/f;

    .line 252
    .line 253
    iget-object v5, v5, Lk9/f;->a:Lj9/i;

    .line 254
    .line 255
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_7
    iget-object v1, v3, Li9/h;->a:Li9/g0;

    .line 262
    .line 263
    invoke-interface {v1, v4}, Li9/g0;->a(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v3, v1}, Li9/h;->g(Ljava/util/Map;)Ljava/util/HashMap;

    .line 268
    .line 269
    .line 270
    iget-object v0, v0, Li9/n;->f:Li9/h;

    .line 271
    .line 272
    invoke-virtual {v2}, Lk9/g;->b()Ljava/util/HashSet;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v0, v1}, Li9/h;->b(Ljava/lang/Iterable;)Lt8/c;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
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
.end method

.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lr3/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    check-cast p1, Lw3/b;

    .line 8
    .line 9
    invoke-interface {p1}, Lw3/b;->y0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    check-cast p1, Lw3/b;

    .line 14
    .line 15
    invoke-interface {p1}, Lw3/b;->w0()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lw3/b;->Z()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    check-cast p1, Lw3/b;

    .line 23
    .line 24
    invoke-interface {p1}, Lw3/b;->x0()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :goto_0
    check-cast p1, Lw3/b;

    .line 29
    .line 30
    invoke-interface {p1}, Lw3/b;->a0()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr3/l;->b:Ljava/lang/Object;

    check-cast v0, Lm9/y;

    iget-object v1, p0, Lr3/l;->c:Ljava/lang/Object;

    check-cast v1, Leb/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/n0;

    iget-object v0, v0, Lm9/y;->c:Leb/c;

    invoke-virtual {p1, v1, v0}, Le9/a;->v(Leb/t0;Leb/c;)Leb/e;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
