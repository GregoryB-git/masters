.class public final Lg9/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/f0$a;
    }
.end annotation


# static fields
.field public static final l:Lg9/e0;

.field public static final m:Lg9/e0;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg9/e0;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg9/e0;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lg9/k0;

.field public d:Lg9/k0;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg9/m;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lj9/o;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:I

.field public final j:Lg9/e;

.field public final k:Lg9/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lj9/l;->b:Lj9/l;

    .line 2
    .line 3
    new-instance v1, Lg9/e0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2, v0}, Lg9/e0;-><init>(ILj9/l;)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lg9/f0;->l:Lg9/e0;

    .line 10
    .line 11
    new-instance v1, Lg9/e0;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v1, v2, v0}, Lg9/e0;-><init>(ILj9/l;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lg9/f0;->m:Lg9/e0;

    .line 18
    .line 19
    return-void
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

.method public constructor <init>(Lj9/o;Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    const-wide/16 v5, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v9}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    return-void
.end method

.method public constructor <init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/o;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lg9/m;",
            ">;",
            "Ljava/util/List<",
            "Lg9/e0;",
            ">;J",
            "Ljava/lang/Object;",
            "Lg9/e;",
            "Lg9/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/f0;->f:Lj9/o;

    iput-object p2, p0, Lg9/f0;->g:Ljava/lang/String;

    iput-object p4, p0, Lg9/f0;->a:Ljava/util/List;

    iput-object p3, p0, Lg9/f0;->e:Ljava/util/List;

    iput-wide p5, p0, Lg9/f0;->h:J

    iput p7, p0, Lg9/f0;->i:I

    iput-object p8, p0, Lg9/f0;->j:Lg9/e;

    iput-object p9, p0, Lg9/f0;->k:Lg9/e;

    return-void
.end method


# virtual methods
.method public final a()Lg9/f0$a;
    .locals 2

    new-instance v0, Lg9/f0$a;

    invoke-virtual {p0}, Lg9/f0;->d()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lg9/f0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final b(Lg9/m;)Lg9/f0;
    .locals 13

    invoke-virtual {p0}, Lg9/f0;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No filter is allowed for document query"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    new-instance v6, Ljava/util/ArrayList;

    iget-object v0, p0, Lg9/f0;->e:Ljava/util/List;

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lg9/f0;

    iget-object v4, p0, Lg9/f0;->f:Lj9/o;

    iget-object v5, p0, Lg9/f0;->g:Ljava/lang/String;

    iget-object v7, p0, Lg9/f0;->a:Ljava/util/List;

    iget-wide v8, p0, Lg9/f0;->h:J

    iget v10, p0, Lg9/f0;->i:I

    iget-object v11, p0, Lg9/f0;->j:Lg9/e;

    iget-object v12, p0, Lg9/f0;->k:Lg9/e;

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    return-object p1
.end method

.method public final c()Ljava/util/TreeSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg9/f0;->e:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lg9/m;

    .line 23
    .line 24
    invoke-virtual {v2}, Lg9/m;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lg9/l;

    .line 43
    .line 44
    invoke-virtual {v3}, Lg9/l;->f()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget-object v3, v3, Lg9/l;->c:Lj9/l;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-object v0
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

.method public final declared-synchronized d()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg9/e0;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lg9/f0;->b:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lg9/f0;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lg9/e0;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Lg9/e0;->b:Lj9/l;

    .line 38
    .line 39
    invoke-virtual {v3}, Lj9/l;->h()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_4

    .line 49
    :cond_0
    iget-object v2, p0, Lg9/f0;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x1

    .line 56
    if-lez v2, :cond_1

    .line 57
    .line 58
    iget-object v2, p0, Lg9/f0;->a:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/lit8 v4, v4, -0x1

    .line 65
    .line 66
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lg9/e0;

    .line 71
    .line 72
    iget v2, v2, Lg9/e0;->a:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v2, v3

    .line 76
    :goto_1
    invoke-virtual {p0}, Lg9/f0;->c()Ljava/util/TreeSet;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lj9/l;

    .line 95
    .line 96
    invoke-virtual {v5}, Lj9/l;->h()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_2

    .line 105
    .line 106
    invoke-virtual {v5}, Lj9/l;->u()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-nez v6, :cond_2

    .line 111
    .line 112
    new-instance v6, Lg9/e0;

    .line 113
    .line 114
    invoke-direct {v6, v2, v5}, Lg9/e0;-><init>(ILj9/l;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    sget-object v4, Lj9/l;->b:Lj9/l;

    .line 122
    .line 123
    invoke-virtual {v4}, Lj9/l;->h()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_5

    .line 132
    .line 133
    invoke-static {v2, v3}, Lq0/g;->b(II)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    sget-object v1, Lg9/f0;->l:Lg9/e0;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    sget-object v1, Lg9/f0;->m:Lg9/e0;

    .line 143
    .line 144
    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, Lg9/f0;->b:Ljava/util/List;

    .line 152
    .line 153
    :cond_6
    iget-object v0, p0, Lg9/f0;->b:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    monitor-exit p0

    .line 156
    return-object v0

    .line 157
    :goto_4
    monitor-exit p0

    .line 158
    throw v0
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
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lg9/f0;->f:Lj9/o;

    invoke-static {v0}, Lj9/i;->l(Lj9/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg9/f0;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg9/f0;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-class v1, Lg9/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg9/f0;

    iget v1, p0, Lg9/f0;->i:I

    iget v2, p1, Lg9/f0;->i:I

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lg9/f0;->i()Lg9/k0;

    move-result-object v0

    invoke-virtual {p1}, Lg9/f0;->i()Lg9/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg9/k0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final f(J)Lg9/f0;
    .locals 11

    new-instance v10, Lg9/f0;

    iget-object v1, p0, Lg9/f0;->f:Lj9/o;

    iget-object v2, p0, Lg9/f0;->g:Ljava/lang/String;

    iget-object v3, p0, Lg9/f0;->e:Ljava/util/List;

    iget-object v4, p0, Lg9/f0;->a:Ljava/util/List;

    iget-object v8, p0, Lg9/f0;->j:Lg9/e;

    iget-object v9, p0, Lg9/f0;->k:Lg9/e;

    const/4 v7, 0x1

    move-object v0, v10

    move-wide v5, p1

    invoke-direct/range {v0 .. v9}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    return-object v10
.end method

.method public final g(Lj9/g;)Z
    .locals 7

    .line 1
    invoke-interface {p1}, Lj9/g;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lj9/i;->a:Lj9/o;

    .line 14
    .line 15
    iget-object v3, p0, Lg9/f0;->g:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lg9/f0;->g:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v5, v3, Lj9/i;->a:Lj9/o;

    .line 26
    .line 27
    invoke-virtual {v5}, Lj9/e;->q()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x2

    .line 32
    if-lt v5, v6, :cond_0

    .line 33
    .line 34
    iget-object v3, v3, Lj9/i;->a:Lj9/o;

    .line 35
    .line 36
    iget-object v5, v3, Lj9/e;->a:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v3}, Lj9/e;->q()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sub-int/2addr v3, v6

    .line 43
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    move v3, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v3, v2

    .line 58
    :goto_0
    if-eqz v3, :cond_1

    .line 59
    .line 60
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 61
    .line 62
    invoke-virtual {v3, v0}, Lj9/e;->p(Lj9/e;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    :goto_1
    move v0, v1

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    move v0, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 73
    .line 74
    invoke-static {v3}, Lj9/i;->l(Lj9/o;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 81
    .line 82
    invoke-virtual {v3, v0}, Lj9/e;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 88
    .line 89
    invoke-virtual {v3, v0}, Lj9/e;->p(Lj9/e;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_1

    .line 94
    .line 95
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 96
    .line 97
    invoke-virtual {v3}, Lj9/e;->q()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-virtual {v0}, Lj9/e;->q()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    sub-int/2addr v0, v1

    .line 106
    if-ne v3, v0, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :goto_2
    if-eqz v0, :cond_e

    .line 110
    .line 111
    invoke-virtual {p0}, Lg9/f0;->d()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_5

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lg9/e0;

    .line 130
    .line 131
    iget-object v4, v3, Lg9/e0;->b:Lj9/l;

    .line 132
    .line 133
    sget-object v5, Lj9/l;->b:Lj9/l;

    .line 134
    .line 135
    invoke-virtual {v4, v5}, Lj9/e;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_4

    .line 140
    .line 141
    iget-object v3, v3, Lg9/e0;->b:Lj9/l;

    .line 142
    .line 143
    invoke-interface {p1, v3}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-nez v3, :cond_4

    .line 148
    .line 149
    move v0, v2

    .line 150
    goto :goto_3

    .line 151
    :cond_5
    move v0, v1

    .line 152
    :goto_3
    if-eqz v0, :cond_e

    .line 153
    .line 154
    iget-object v0, p0, Lg9/f0;->e:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Lg9/m;

    .line 171
    .line 172
    invoke-virtual {v3, p1}, Lg9/m;->d(Lj9/g;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    move v0, v2

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    move v0, v1

    .line 181
    :goto_4
    if-eqz v0, :cond_e

    .line 182
    .line 183
    iget-object v0, p0, Lg9/f0;->j:Lg9/e;

    .line 184
    .line 185
    if-eqz v0, :cond_a

    .line 186
    .line 187
    invoke-virtual {p0}, Lg9/f0;->d()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v0, v3, p1}, Lg9/e;->a(Ljava/util/List;Lj9/g;)I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    iget-boolean v0, v0, Lg9/e;->a:Z

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    if-gtz v3, :cond_9

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    if-gez v3, :cond_9

    .line 203
    .line 204
    :goto_5
    move v0, v1

    .line 205
    goto :goto_6

    .line 206
    :cond_9
    move v0, v2

    .line 207
    :goto_6
    if-nez v0, :cond_a

    .line 208
    .line 209
    :goto_7
    move p1, v2

    .line 210
    goto :goto_a

    .line 211
    :cond_a
    iget-object v0, p0, Lg9/f0;->k:Lg9/e;

    .line 212
    .line 213
    if-eqz v0, :cond_d

    .line 214
    .line 215
    invoke-virtual {p0}, Lg9/f0;->d()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v0, v3, p1}, Lg9/e;->a(Ljava/util/List;Lj9/g;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    iget-boolean v0, v0, Lg9/e;->a:Z

    .line 224
    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    if-ltz p1, :cond_c

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_b
    if-lez p1, :cond_c

    .line 231
    .line 232
    :goto_8
    move p1, v1

    .line 233
    goto :goto_9

    .line 234
    :cond_c
    move p1, v2

    .line 235
    :goto_9
    if-nez p1, :cond_d

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_d
    move p1, v1

    .line 239
    :goto_a
    if-eqz p1, :cond_e

    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    move v1, v2

    .line 243
    :goto_b
    return v1
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

.method public final h()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lg9/f0;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v3, p0, Lg9/f0;->h:J

    .line 12
    .line 13
    const-wide/16 v5, -0x1

    .line 14
    .line 15
    cmp-long v0, v3, v5

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lg9/f0;->j:Lg9/e;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lg9/f0;->k:Lg9/e;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lg9/f0;->a:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lg9/f0;->a:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lg9/f0;->a:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lg9/e0;

    .line 50
    .line 51
    iget-object v0, v0, Lg9/e0;->b:Lj9/l;

    .line 52
    .line 53
    invoke-virtual {v0}, Lj9/l;->u()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v1, v2

    .line 61
    :cond_1
    :goto_0
    return v1
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

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lg9/f0;->i()Lg9/k0;

    move-result-object v0

    invoke-virtual {v0}, Lg9/k0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lg9/f0;->i:I

    invoke-static {v1}, Lq0/g;->c(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final declared-synchronized i()Lg9/k0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg9/f0;->c:Lg9/k0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lg9/f0;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg9/f0;->j(Ljava/util/List;)Lg9/k0;

    move-result-object v0

    iput-object v0, p0, Lg9/f0;->c:Lg9/k0;

    :cond_0
    iget-object v0, p0, Lg9/f0;->c:Lg9/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized j(Ljava/util/List;)Lg9/k0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg9/e0;",
            ">;)",
            "Lg9/k0;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lg9/f0;->i:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lg9/k0;

    .line 8
    .line 9
    iget-object v3, p0, Lg9/f0;->f:Lj9/o;

    .line 10
    .line 11
    iget-object v4, p0, Lg9/f0;->g:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, p0, Lg9/f0;->e:Ljava/util/List;

    .line 14
    .line 15
    iget-wide v7, p0, Lg9/f0;->h:J

    .line 16
    .line 17
    iget-object v9, p0, Lg9/f0;->j:Lg9/e;

    .line 18
    .line 19
    iget-object v10, p0, Lg9/f0;->k:Lg9/e;

    .line 20
    .line 21
    move-object v2, v0

    .line 22
    move-object v6, p1

    .line 23
    invoke-direct/range {v2 .. v10}, Lg9/k0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLg9/e;Lg9/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :cond_0
    :try_start_1
    new-instance v4, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lg9/e0;

    .line 48
    .line 49
    iget v2, v0, Lg9/e0;->a:I

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    if-ne v2, v3, :cond_1

    .line 53
    .line 54
    move v3, v1

    .line 55
    :cond_1
    iget-object v0, v0, Lg9/e0;->b:Lj9/l;

    .line 56
    .line 57
    new-instance v2, Lg9/e0;

    .line 58
    .line 59
    invoke-direct {v2, v3, v0}, Lg9/e0;-><init>(ILj9/l;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, Lg9/f0;->k:Lg9/e;

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    new-instance v1, Lg9/e;

    .line 72
    .line 73
    iget-object v2, p1, Lg9/e;->b:Ljava/util/List;

    .line 74
    .line 75
    iget-boolean p1, p1, Lg9/e;->a:Z

    .line 76
    .line 77
    invoke-direct {v1, v2, p1}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 78
    .line 79
    .line 80
    move-object v7, v1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v7, v0

    .line 83
    :goto_1
    iget-object p1, p0, Lg9/f0;->j:Lg9/e;

    .line 84
    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    new-instance v0, Lg9/e;

    .line 88
    .line 89
    iget-object v1, p1, Lg9/e;->b:Ljava/util/List;

    .line 90
    .line 91
    iget-boolean p1, p1, Lg9/e;->a:Z

    .line 92
    .line 93
    invoke-direct {v0, v1, p1}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 94
    .line 95
    .line 96
    :cond_4
    move-object v8, v0

    .line 97
    new-instance p1, Lg9/k0;

    .line 98
    .line 99
    iget-object v1, p0, Lg9/f0;->f:Lj9/o;

    .line 100
    .line 101
    iget-object v2, p0, Lg9/f0;->g:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p0, Lg9/f0;->e:Ljava/util/List;

    .line 104
    .line 105
    iget-wide v5, p0, Lg9/f0;->h:J

    .line 106
    .line 107
    move-object v0, p1

    .line 108
    invoke-direct/range {v0 .. v8}, Lg9/k0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLg9/e;Lg9/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    .line 111
    monitor-exit p0

    .line 112
    return-object p1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    monitor-exit p0

    .line 115
    throw p1
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Query(target="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lg9/f0;->i()Lg9/k0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lg9/k0;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ";limitType="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lg9/f0;->i:I

    .line 24
    .line 25
    invoke-static {v1}, Lg;->l(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ")"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
