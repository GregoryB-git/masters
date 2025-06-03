.class public final Le5/j;
.super Lb5/m;
.source "SourceFile"


# static fields
.field public static final L:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:Le5/k;

.field public D:Le5/n;

.field public E:I

.field public F:Z

.field public volatile G:Z

.field public H:Z

.field public I:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public J:Z

.field public K:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:Lt5/k;

.field public final q:Lt5/n;

.field public final r:Le5/k;

.field public final s:Z

.field public final t:Z

.field public final u:Lv5/c0;

.field public final v:Le5/i;

.field public final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final x:La4/d;

.field public final y:Lu4/g;

.field public final z:Lv5/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Le5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Le5/i;Lt5/k;Lt5/n;Lv3/i0;ZLt5/k;Lt5/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLv5/c0;La4/d;Le5/k;Lu4/g;Lv5/u;ZLw3/a0;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le5/i;",
            "Lt5/k;",
            "Lt5/n;",
            "Lv3/i0;",
            "Z",
            "Lt5/k;",
            "Lt5/n;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lv5/c0;",
            "La4/d;",
            "Le5/k;",
            "Lu4/g;",
            "Lv5/u;",
            "Z",
            "Lw3/a0;",
            ")V"
        }
    .end annotation

    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    invoke-direct/range {v0 .. v11}, Lb5/m;-><init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    iput-boolean v0, v12, Le5/j;->A:Z

    move/from16 v0, p19

    iput v0, v12, Le5/j;->o:I

    move/from16 v0, p20

    iput-boolean v0, v12, Le5/j;->K:Z

    move/from16 v0, p21

    iput v0, v12, Le5/j;->l:I

    iput-object v13, v12, Le5/j;->q:Lt5/n;

    move-object/from16 v0, p6

    iput-object v0, v12, Le5/j;->p:Lt5/k;

    if-eqz v13, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v12, Le5/j;->F:Z

    move/from16 v0, p8

    iput-boolean v0, v12, Le5/j;->B:Z

    move-object/from16 v0, p9

    iput-object v0, v12, Le5/j;->m:Landroid/net/Uri;

    move/from16 v0, p23

    iput-boolean v0, v12, Le5/j;->s:Z

    move-object/from16 v0, p24

    iput-object v0, v12, Le5/j;->u:Lv5/c0;

    move/from16 v0, p22

    iput-boolean v0, v12, Le5/j;->t:Z

    move-object v0, p1

    iput-object v0, v12, Le5/j;->v:Le5/i;

    move-object/from16 v0, p10

    iput-object v0, v12, Le5/j;->w:Ljava/util/List;

    move-object/from16 v0, p25

    iput-object v0, v12, Le5/j;->x:La4/d;

    move-object/from16 v0, p26

    iput-object v0, v12, Le5/j;->r:Le5/k;

    move-object/from16 v0, p27

    iput-object v0, v12, Le5/j;->y:Lu4/g;

    move-object/from16 v0, p28

    iput-object v0, v12, Le5/j;->z:Lv5/u;

    move/from16 v0, p29

    iput-boolean v0, v12, Le5/j;->n:Z

    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 1
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 2
    iput-object v0, v12, Le5/j;->I:Lo7/t;

    sget-object v0, Le5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Le5/j;->k:I

    return-void
.end method

.method public static f(Ljava/lang/String;)[B
    .locals 4

    invoke-static {p0}, Lx6/b;->x0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    new-array v0, v1, [B

    array-length v2, p0

    if-le v2, v1, :cond_1

    array-length v2, p0

    sub-int/2addr v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    array-length v3, p0

    sub-int/2addr v3, v2

    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Le5/j;->D:Le5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le5/j;->C:Le5/k;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Le5/j;->r:Le5/k;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Le5/b;

    .line 18
    .line 19
    iget-object v3, v3, Le5/b;->a:Lc4/h;

    .line 20
    .line 21
    instance-of v4, v3, Lm4/c0;

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    instance-of v3, v3, Lk4/e;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move v3, v1

    .line 33
    :goto_1
    if-eqz v3, :cond_2

    .line 34
    .line 35
    iput-object v0, p0, Le5/j;->C:Le5/k;

    .line 36
    .line 37
    iput-boolean v2, p0, Le5/j;->F:Z

    .line 38
    .line 39
    :cond_2
    iget-boolean v0, p0, Le5/j;->F:Z

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    iget-object v0, p0, Le5/j;->p:Lt5/k;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Le5/j;->q:Lt5/n;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Le5/j;->p:Lt5/k;

    .line 55
    .line 56
    iget-object v3, p0, Le5/j;->q:Lt5/n;

    .line 57
    .line 58
    iget-boolean v4, p0, Le5/j;->B:Z

    .line 59
    .line 60
    invoke-virtual {p0, v0, v3, v4, v2}, Le5/j;->e(Lt5/k;Lt5/n;ZZ)V

    .line 61
    .line 62
    .line 63
    iput v2, p0, Le5/j;->E:I

    .line 64
    .line 65
    iput-boolean v2, p0, Le5/j;->F:Z

    .line 66
    .line 67
    :goto_2
    iget-boolean v0, p0, Le5/j;->G:Z

    .line 68
    .line 69
    if-nez v0, :cond_5

    .line 70
    .line 71
    iget-boolean v0, p0, Le5/j;->t:Z

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 76
    .line 77
    iget-object v2, p0, Lb5/e;->b:Lt5/n;

    .line 78
    .line 79
    iget-boolean v3, p0, Le5/j;->A:Z

    .line 80
    .line 81
    invoke-virtual {p0, v0, v2, v3, v1}, Le5/j;->e(Lt5/k;Lt5/n;ZZ)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-boolean v0, p0, Le5/j;->G:Z

    .line 85
    .line 86
    xor-int/2addr v0, v1

    .line 87
    iput-boolean v0, p0, Le5/j;->H:Z

    .line 88
    .line 89
    :cond_5
    return-void
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

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le5/j;->G:Z

    return-void
.end method

.method public final d()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final e(Lt5/k;Lt5/n;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    iget p3, p0, Le5/j;->E:I

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    move p3, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p3, v1

    .line 12
    :goto_0
    move v2, p3

    .line 13
    move-object p3, p2

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    iget p3, p0, Le5/j;->E:I

    .line 16
    .line 17
    int-to-long v2, p3

    .line 18
    invoke-virtual {p2, v2, v3}, Lt5/n;->a(J)Lt5/n;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    move v2, v1

    .line 23
    :goto_1
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, Le5/j;->h(Lt5/k;Lt5/n;Z)Lc4/e;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget p4, p0, Le5/j;->E:I

    .line 30
    .line 31
    invoke-virtual {p3, p4}, Lc4/e;->j(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_2
    :try_start_1
    iget-boolean p4, p0, Le5/j;->G:Z

    .line 35
    .line 36
    if-nez p4, :cond_4

    .line 37
    .line 38
    iget-object p4, p0, Le5/j;->C:Le5/k;

    .line 39
    .line 40
    check-cast p4, Le5/b;

    .line 41
    .line 42
    iget-object p4, p4, Le5/b;->a:Lc4/h;

    .line 43
    .line 44
    sget-object v2, Le5/b;->d:Lc4/s;

    .line 45
    .line 46
    invoke-interface {p4, p3, v2}, Lc4/h;->d(Lc4/i;Lc4/s;)I

    .line 47
    .line 48
    .line 49
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    if-nez p4, :cond_3

    .line 51
    .line 52
    move p4, v0

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move p4, v1

    .line 55
    :goto_3
    if-eqz p4, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception p4

    .line 59
    goto :goto_6

    .line 60
    :cond_4
    :try_start_2
    iget-wide p3, p3, Lc4/e;->d:J

    .line 61
    .line 62
    iget-wide v0, p2, Lt5/n;->f:J

    .line 63
    .line 64
    :goto_4
    sub-long/2addr p3, v0

    .line 65
    long-to-int p2, p3

    .line 66
    iput p2, p0, Le5/j;->E:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :catch_0
    move-exception p4

    .line 70
    :try_start_3
    iget-object v0, p0, Lb5/e;->d:Lv3/i0;

    .line 71
    .line 72
    iget v0, v0, Lv3/i0;->e:I

    .line 73
    .line 74
    and-int/lit16 v0, v0, 0x4000

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object p4, p0, Le5/j;->C:Le5/k;

    .line 79
    .line 80
    check-cast p4, Le5/b;

    .line 81
    .line 82
    iget-object p4, p4, Le5/b;->a:Lc4/h;

    .line 83
    .line 84
    const-wide/16 v0, 0x0

    .line 85
    .line 86
    invoke-interface {p4, v0, v1, v0, v1}, Lc4/h;->f(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 87
    .line 88
    .line 89
    :try_start_4
    iget-wide p3, p3, Lc4/e;->d:J

    .line 90
    .line 91
    iget-wide v0, p2, Lt5/n;->f:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :goto_5
    invoke-static {p1}, Lb/z;->d(Lt5/k;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 99
    :goto_6
    :try_start_6
    iget-wide v0, p3, Lc4/e;->d:J

    .line 100
    .line 101
    iget-wide p2, p2, Lt5/n;->f:J

    .line 102
    .line 103
    sub-long/2addr v0, p2

    .line 104
    long-to-int p2, v0

    .line 105
    iput p2, p0, Le5/j;->E:I

    .line 106
    .line 107
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 108
    :catchall_1
    move-exception p2

    .line 109
    invoke-static {p1}, Lb/z;->d(Lt5/k;)V

    .line 110
    .line 111
    .line 112
    throw p2
    .line 113
    .line 114
    .line 115
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
.end method

.method public final g(I)I
    .locals 1

    iget-boolean v0, p0, Le5/j;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Le5/j;->I:Lo7/t;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Le5/j;->I:Lo7/t;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final h(Lt5/k;Lt5/n;Z)Lc4/e;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p2}, Lt5/k;->a(Lt5/n;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, 0x1

    .line 15
    const/4 v11, 0x0

    .line 16
    if-eqz p3, :cond_4

    .line 17
    .line 18
    :try_start_0
    iget-object v2, v1, Le5/j;->u:Lv5/c0;

    .line 19
    .line 20
    iget-boolean v3, v1, Le5/j;->s:Z

    .line 21
    .line 22
    iget-wide v4, v1, Lb5/e;->g:J

    .line 23
    .line 24
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :try_start_1
    iget-wide v12, v2, Lv5/c0;->a:J

    .line 26
    .line 27
    const-wide v14, 0x7ffffffffffffffeL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v12, v12, v14

    .line 33
    .line 34
    if-nez v12, :cond_0

    .line 35
    .line 36
    move v12, v10

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v12, v11

    .line 39
    :goto_0
    invoke-static {v12}, Lx6/b;->H(Z)V

    .line 40
    .line 41
    .line 42
    iget-wide v12, v2, Lv5/c0;->b:J

    .line 43
    .line 44
    cmp-long v12, v12, v8

    .line 45
    .line 46
    if-eqz v12, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    if-eqz v3, :cond_2

    .line 50
    .line 51
    iget-object v3, v2, Lv5/c0;->d:Ljava/lang/ThreadLocal;

    .line 52
    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    iget-wide v3, v2, Lv5/c0;->b:J

    .line 62
    .line 63
    cmp-long v3, v3, v8

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_2
    :try_start_2
    monitor-exit v2

    .line 72
    goto :goto_3

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    monitor-exit v2

    .line 75
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 76
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_4
    :goto_3
    new-instance v12, Lc4/e;

    .line 83
    .line 84
    iget-wide v4, v0, Lt5/n;->f:J

    .line 85
    .line 86
    move-object v2, v12

    .line 87
    move-object/from16 v3, p1

    .line 88
    .line 89
    invoke-direct/range {v2 .. v7}, Lc4/e;-><init>(Lt5/h;JJ)V

    .line 90
    .line 91
    .line 92
    iget-object v2, v1, Le5/j;->C:Le5/k;

    .line 93
    .line 94
    if-nez v2, :cond_2d

    .line 95
    .line 96
    iput v11, v12, Lc4/e;->f:I

    .line 97
    .line 98
    const/16 v2, 0x8

    .line 99
    .line 100
    :try_start_3
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 101
    .line 102
    const/16 v4, 0xa

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Lv5/u;->D(I)V

    .line 105
    .line 106
    .line 107
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 108
    .line 109
    iget-object v3, v3, Lv5/u;->a:[B

    .line 110
    .line 111
    invoke-virtual {v12, v3, v11, v4, v11}, Lc4/e;->c([BIIZ)Z
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_1

    .line 112
    .line 113
    .line 114
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 115
    .line 116
    invoke-virtual {v3}, Lv5/u;->x()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    const v5, 0x494433

    .line 121
    .line 122
    .line 123
    if-eq v3, v5, :cond_5

    .line 124
    .line 125
    goto/16 :goto_5

    .line 126
    .line 127
    :cond_5
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 128
    .line 129
    const/4 v5, 0x3

    .line 130
    invoke-virtual {v3, v5}, Lv5/u;->H(I)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 134
    .line 135
    invoke-virtual {v3}, Lv5/u;->u()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    add-int/lit8 v5, v3, 0xa

    .line 140
    .line 141
    iget-object v6, v1, Le5/j;->z:Lv5/u;

    .line 142
    .line 143
    iget-object v7, v6, Lv5/u;->a:[B

    .line 144
    .line 145
    array-length v13, v7

    .line 146
    if-le v5, v13, :cond_6

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Lv5/u;->D(I)V

    .line 149
    .line 150
    .line 151
    iget-object v5, v1, Le5/j;->z:Lv5/u;

    .line 152
    .line 153
    iget-object v5, v5, Lv5/u;->a:[B

    .line 154
    .line 155
    invoke-static {v7, v11, v5, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 156
    .line 157
    .line 158
    :cond_6
    iget-object v5, v1, Le5/j;->z:Lv5/u;

    .line 159
    .line 160
    iget-object v5, v5, Lv5/u;->a:[B

    .line 161
    .line 162
    invoke-virtual {v12, v5, v4, v3, v11}, Lc4/e;->c([BIIZ)Z

    .line 163
    .line 164
    .line 165
    iget-object v4, v1, Le5/j;->y:Lu4/g;

    .line 166
    .line 167
    iget-object v5, v1, Le5/j;->z:Lv5/u;

    .line 168
    .line 169
    iget-object v5, v5, Lv5/u;->a:[B

    .line 170
    .line 171
    invoke-virtual {v4, v5, v3}, Lu4/g;->C([BI)Lp4/a;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-nez v3, :cond_7

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    iget-object v4, v3, Lp4/a;->a:[Lp4/a$b;

    .line 179
    .line 180
    array-length v4, v4

    .line 181
    move v5, v11

    .line 182
    :goto_4
    if-ge v5, v4, :cond_9

    .line 183
    .line 184
    iget-object v6, v3, Lp4/a;->a:[Lp4/a$b;

    .line 185
    .line 186
    aget-object v6, v6, v5

    .line 187
    .line 188
    instance-of v7, v6, Lu4/k;

    .line 189
    .line 190
    if-eqz v7, :cond_8

    .line 191
    .line 192
    check-cast v6, Lu4/k;

    .line 193
    .line 194
    iget-object v7, v6, Lu4/k;->b:Ljava/lang/String;

    .line 195
    .line 196
    const-string v13, "com.apple.streaming.transportStreamTimestamp"

    .line 197
    .line 198
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-eqz v7, :cond_8

    .line 203
    .line 204
    iget-object v3, v6, Lu4/k;->c:[B

    .line 205
    .line 206
    iget-object v4, v1, Le5/j;->z:Lv5/u;

    .line 207
    .line 208
    iget-object v4, v4, Lv5/u;->a:[B

    .line 209
    .line 210
    invoke-static {v3, v11, v4, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 211
    .line 212
    .line 213
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 214
    .line 215
    invoke-virtual {v3, v11}, Lv5/u;->G(I)V

    .line 216
    .line 217
    .line 218
    iget-object v3, v1, Le5/j;->z:Lv5/u;

    .line 219
    .line 220
    invoke-virtual {v3, v2}, Lv5/u;->F(I)V

    .line 221
    .line 222
    .line 223
    iget-object v2, v1, Le5/j;->z:Lv5/u;

    .line 224
    .line 225
    invoke-virtual {v2}, Lv5/u;->o()J

    .line 226
    .line 227
    .line 228
    move-result-wide v2

    .line 229
    const-wide v4, 0x1ffffffffL

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    and-long v8, v2, v4

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :catch_1
    :cond_9
    :goto_5
    iput v11, v12, Lc4/e;->f:I

    .line 241
    .line 242
    iget-object v2, v1, Le5/j;->r:Le5/k;

    .line 243
    .line 244
    if-eqz v2, :cond_11

    .line 245
    .line 246
    check-cast v2, Le5/b;

    .line 247
    .line 248
    iget-object v0, v2, Le5/b;->a:Lc4/h;

    .line 249
    .line 250
    instance-of v3, v0, Lm4/c0;

    .line 251
    .line 252
    if-nez v3, :cond_b

    .line 253
    .line 254
    instance-of v0, v0, Lk4/e;

    .line 255
    .line 256
    if-eqz v0, :cond_a

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_a
    move v0, v11

    .line 260
    goto :goto_7

    .line 261
    :cond_b
    :goto_6
    move v0, v10

    .line 262
    :goto_7
    xor-int/2addr v0, v10

    .line 263
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 264
    .line 265
    .line 266
    iget-object v0, v2, Le5/b;->a:Lc4/h;

    .line 267
    .line 268
    instance-of v3, v0, Le5/p;

    .line 269
    .line 270
    if-eqz v3, :cond_c

    .line 271
    .line 272
    new-instance v0, Le5/p;

    .line 273
    .line 274
    iget-object v3, v2, Le5/b;->b:Lv3/i0;

    .line 275
    .line 276
    iget-object v3, v3, Lv3/i0;->c:Ljava/lang/String;

    .line 277
    .line 278
    iget-object v4, v2, Le5/b;->c:Lv5/c0;

    .line 279
    .line 280
    invoke-direct {v0, v3, v4}, Le5/p;-><init>(Ljava/lang/String;Lv5/c0;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_c
    instance-of v3, v0, Lm4/e;

    .line 285
    .line 286
    if-eqz v3, :cond_d

    .line 287
    .line 288
    new-instance v0, Lm4/e;

    .line 289
    .line 290
    invoke-direct {v0, v11}, Lm4/e;-><init>(I)V

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_d
    instance-of v3, v0, Lm4/a;

    .line 295
    .line 296
    if-eqz v3, :cond_e

    .line 297
    .line 298
    new-instance v0, Lm4/a;

    .line 299
    .line 300
    invoke-direct {v0}, Lm4/a;-><init>()V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_e
    instance-of v3, v0, Lm4/c;

    .line 305
    .line 306
    if-eqz v3, :cond_f

    .line 307
    .line 308
    new-instance v0, Lm4/c;

    .line 309
    .line 310
    invoke-direct {v0}, Lm4/c;-><init>()V

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_f
    instance-of v0, v0, Lj4/d;

    .line 315
    .line 316
    if-eqz v0, :cond_10

    .line 317
    .line 318
    new-instance v0, Lj4/d;

    .line 319
    .line 320
    invoke-direct {v0}, Lj4/d;-><init>()V

    .line 321
    .line 322
    .line 323
    :goto_8
    new-instance v3, Le5/b;

    .line 324
    .line 325
    iget-object v4, v2, Le5/b;->b:Lv3/i0;

    .line 326
    .line 327
    iget-object v2, v2, Le5/b;->c:Lv5/c0;

    .line 328
    .line 329
    invoke-direct {v3, v0, v4, v2}, Le5/b;-><init>(Lc4/h;Lv3/i0;Lv5/c0;)V

    .line 330
    .line 331
    .line 332
    move-wide/from16 v16, v8

    .line 333
    .line 334
    goto/16 :goto_19

    .line 335
    .line 336
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 337
    .line 338
    const-string v3, "Unexpected extractor type for recreation: "

    .line 339
    .line 340
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    iget-object v2, v2, Le5/b;->a:Lc4/h;

    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :cond_11
    iget-object v2, v1, Le5/j;->v:Le5/i;

    .line 366
    .line 367
    iget-object v0, v0, Lt5/n;->a:Landroid/net/Uri;

    .line 368
    .line 369
    iget-object v3, v1, Lb5/e;->d:Lv3/i0;

    .line 370
    .line 371
    iget-object v4, v1, Le5/j;->w:Ljava/util/List;

    .line 372
    .line 373
    iget-object v5, v1, Le5/j;->u:Lv5/c0;

    .line 374
    .line 375
    invoke-interface/range {p1 .. p1}, Lt5/k;->h()Ljava/util/Map;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    check-cast v2, Le5/d;

    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    iget-object v2, v3, Lv3/i0;->t:Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {v2}, Lb/z;->k(Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    invoke-static {v6}, Lb/z;->l(Ljava/util/Map;)I

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    invoke-static {v0}, Lb/z;->m(Landroid/net/Uri;)I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    new-instance v7, Ljava/util/ArrayList;

    .line 399
    .line 400
    sget-object v13, Le5/d;->b:[I

    .line 401
    .line 402
    const/4 v14, 0x7

    .line 403
    invoke-direct {v7, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-static {v2, v7}, Le5/d;->a(ILjava/util/ArrayList;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v6, v7}, Le5/d;->a(ILjava/util/ArrayList;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v0, v7}, Le5/d;->a(ILjava/util/ArrayList;)V

    .line 413
    .line 414
    .line 415
    move v15, v11

    .line 416
    :goto_9
    if-ge v15, v14, :cond_12

    .line 417
    .line 418
    aget v10, v13, v15

    .line 419
    .line 420
    invoke-static {v10, v7}, Le5/d;->a(ILjava/util/ArrayList;)V

    .line 421
    .line 422
    .line 423
    add-int/lit8 v15, v15, 0x1

    .line 424
    .line 425
    const/4 v10, 0x1

    .line 426
    goto :goto_9

    .line 427
    :cond_12
    iput v11, v12, Lc4/e;->f:I

    .line 428
    .line 429
    const/4 v10, 0x0

    .line 430
    move v13, v11

    .line 431
    const/4 v11, 0x1

    .line 432
    :goto_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v15

    .line 436
    if-ge v13, v15, :cond_28

    .line 437
    .line 438
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v15

    .line 442
    check-cast v15, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result v15

    .line 448
    move-object/from16 p1, v7

    .line 449
    .line 450
    const/16 v7, 0xb

    .line 451
    .line 452
    if-eqz v15, :cond_24

    .line 453
    .line 454
    if-eq v15, v11, :cond_23

    .line 455
    .line 456
    const/4 v11, 0x2

    .line 457
    if-eq v15, v11, :cond_22

    .line 458
    .line 459
    if-eq v15, v14, :cond_21

    .line 460
    .line 461
    const/16 v11, 0x8

    .line 462
    .line 463
    if-eq v15, v11, :cond_1b

    .line 464
    .line 465
    if-eq v15, v7, :cond_14

    .line 466
    .line 467
    const/16 v7, 0xd

    .line 468
    .line 469
    if-eq v15, v7, :cond_13

    .line 470
    .line 471
    const/4 v7, 0x0

    .line 472
    goto :goto_b

    .line 473
    :cond_13
    new-instance v7, Le5/p;

    .line 474
    .line 475
    iget-object v11, v3, Lv3/i0;->c:Ljava/lang/String;

    .line 476
    .line 477
    invoke-direct {v7, v11, v5}, Le5/p;-><init>(Ljava/lang/String;Lv5/c0;)V

    .line 478
    .line 479
    .line 480
    :goto_b
    move-wide/from16 v16, v8

    .line 481
    .line 482
    goto/16 :goto_16

    .line 483
    .line 484
    :cond_14
    if-eqz v4, :cond_15

    .line 485
    .line 486
    const/16 v7, 0x30

    .line 487
    .line 488
    move-object v11, v4

    .line 489
    goto :goto_c

    .line 490
    :cond_15
    new-instance v7, Lv3/i0$a;

    .line 491
    .line 492
    invoke-direct {v7}, Lv3/i0$a;-><init>()V

    .line 493
    .line 494
    .line 495
    const-string v11, "application/cea-608"

    .line 496
    .line 497
    iput-object v11, v7, Lv3/i0$a;->k:Ljava/lang/String;

    .line 498
    .line 499
    new-instance v11, Lv3/i0;

    .line 500
    .line 501
    invoke-direct {v11, v7}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v11}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v7

    .line 508
    const/16 v11, 0x10

    .line 509
    .line 510
    move/from16 v18, v11

    .line 511
    .line 512
    move-object v11, v7

    .line 513
    move/from16 v7, v18

    .line 514
    .line 515
    :goto_c
    iget-object v14, v3, Lv3/i0;->q:Ljava/lang/String;

    .line 516
    .line 517
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 518
    .line 519
    .line 520
    move-result v16

    .line 521
    if-nez v16, :cond_19

    .line 522
    .line 523
    move-wide/from16 v16, v8

    .line 524
    .line 525
    const-string v8, "audio/mp4a-latm"

    .line 526
    .line 527
    invoke-static {v14, v8}, Lv5/p;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    if-eqz v8, :cond_16

    .line 532
    .line 533
    const/4 v8, 0x1

    .line 534
    goto :goto_d

    .line 535
    :cond_16
    const/4 v8, 0x0

    .line 536
    :goto_d
    if-nez v8, :cond_17

    .line 537
    .line 538
    or-int/lit8 v7, v7, 0x2

    .line 539
    .line 540
    :cond_17
    const-string v8, "video/avc"

    .line 541
    .line 542
    invoke-static {v14, v8}, Lv5/p;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    if-eqz v8, :cond_18

    .line 547
    .line 548
    const/4 v8, 0x1

    .line 549
    goto :goto_e

    .line 550
    :cond_18
    const/4 v8, 0x0

    .line 551
    :goto_e
    if-nez v8, :cond_1a

    .line 552
    .line 553
    or-int/lit8 v7, v7, 0x4

    .line 554
    .line 555
    goto :goto_f

    .line 556
    :cond_19
    move-wide/from16 v16, v8

    .line 557
    .line 558
    :cond_1a
    :goto_f
    new-instance v8, Lm4/c0;

    .line 559
    .line 560
    new-instance v9, Lm4/g;

    .line 561
    .line 562
    invoke-direct {v9, v7, v11}, Lm4/g;-><init>(ILjava/util/List;)V

    .line 563
    .line 564
    .line 565
    const/4 v7, 0x2

    .line 566
    invoke-direct {v8, v7, v5, v9}, Lm4/c0;-><init>(ILv5/c0;Lm4/g;)V

    .line 567
    .line 568
    .line 569
    goto :goto_15

    .line 570
    :cond_1b
    move-wide/from16 v16, v8

    .line 571
    .line 572
    new-instance v7, Lk4/e;

    .line 573
    .line 574
    iget-object v8, v3, Lv3/i0;->r:Lp4/a;

    .line 575
    .line 576
    if-nez v8, :cond_1c

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_1c
    const/4 v9, 0x0

    .line 580
    :goto_10
    iget-object v11, v8, Lp4/a;->a:[Lp4/a$b;

    .line 581
    .line 582
    array-length v14, v11

    .line 583
    if-ge v9, v14, :cond_1e

    .line 584
    .line 585
    aget-object v11, v11, v9

    .line 586
    .line 587
    instance-of v14, v11, Le5/o;

    .line 588
    .line 589
    if-eqz v14, :cond_1d

    .line 590
    .line 591
    check-cast v11, Le5/o;

    .line 592
    .line 593
    iget-object v8, v11, Le5/o;->c:Ljava/util/List;

    .line 594
    .line 595
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    xor-int/lit8 v8, v8, 0x1

    .line 600
    .line 601
    goto :goto_12

    .line 602
    :cond_1d
    add-int/lit8 v9, v9, 0x1

    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_1e
    :goto_11
    const/4 v8, 0x0

    .line 606
    :goto_12
    if-eqz v8, :cond_1f

    .line 607
    .line 608
    const/4 v8, 0x4

    .line 609
    goto :goto_13

    .line 610
    :cond_1f
    const/4 v8, 0x0

    .line 611
    :goto_13
    if-eqz v4, :cond_20

    .line 612
    .line 613
    move-object v9, v4

    .line 614
    goto :goto_14

    .line 615
    :cond_20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v9

    .line 619
    :goto_14
    const/4 v11, 0x0

    .line 620
    invoke-direct {v7, v8, v5, v11, v9}, Lk4/e;-><init>(ILv5/c0;Lk4/j;Ljava/util/List;)V

    .line 621
    .line 622
    .line 623
    goto :goto_16

    .line 624
    :cond_21
    move-wide/from16 v16, v8

    .line 625
    .line 626
    new-instance v7, Lj4/d;

    .line 627
    .line 628
    const-wide/16 v8, 0x0

    .line 629
    .line 630
    const/4 v11, 0x0

    .line 631
    invoke-direct {v7, v11, v8, v9}, Lj4/d;-><init>(IJ)V

    .line 632
    .line 633
    .line 634
    goto :goto_16

    .line 635
    :cond_22
    move-wide/from16 v16, v8

    .line 636
    .line 637
    const/4 v7, 0x0

    .line 638
    new-instance v8, Lm4/e;

    .line 639
    .line 640
    invoke-direct {v8, v7}, Lm4/e;-><init>(I)V

    .line 641
    .line 642
    .line 643
    :goto_15
    move-object v7, v8

    .line 644
    goto :goto_16

    .line 645
    :cond_23
    move-wide/from16 v16, v8

    .line 646
    .line 647
    new-instance v7, Lm4/c;

    .line 648
    .line 649
    invoke-direct {v7}, Lm4/c;-><init>()V

    .line 650
    .line 651
    .line 652
    goto :goto_16

    .line 653
    :cond_24
    move-wide/from16 v16, v8

    .line 654
    .line 655
    new-instance v7, Lm4/a;

    .line 656
    .line 657
    invoke-direct {v7}, Lm4/a;-><init>()V

    .line 658
    .line 659
    .line 660
    :goto_16
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    :try_start_4
    invoke-interface {v7, v12}, Lc4/h;->i(Lc4/i;)Z

    .line 664
    .line 665
    .line 666
    move-result v8
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 667
    const/4 v9, 0x0

    .line 668
    iput v9, v12, Lc4/e;->f:I

    .line 669
    .line 670
    goto :goto_17

    .line 671
    :catchall_1
    move-exception v0

    .line 672
    move-object v2, v0

    .line 673
    const/4 v0, 0x0

    .line 674
    iput v0, v12, Lc4/e;->f:I

    .line 675
    .line 676
    throw v2

    .line 677
    :catch_2
    const/4 v8, 0x0

    .line 678
    iput v8, v12, Lc4/e;->f:I

    .line 679
    .line 680
    move v9, v8

    .line 681
    :goto_17
    if-eqz v8, :cond_25

    .line 682
    .line 683
    new-instance v0, Le5/b;

    .line 684
    .line 685
    invoke-direct {v0, v7, v3, v5}, Le5/b;-><init>(Lc4/h;Lv3/i0;Lv5/c0;)V

    .line 686
    .line 687
    .line 688
    goto :goto_18

    .line 689
    :cond_25
    if-nez v10, :cond_27

    .line 690
    .line 691
    if-eq v15, v2, :cond_26

    .line 692
    .line 693
    if-eq v15, v6, :cond_26

    .line 694
    .line 695
    if-eq v15, v0, :cond_26

    .line 696
    .line 697
    const/16 v8, 0xb

    .line 698
    .line 699
    if-ne v15, v8, :cond_27

    .line 700
    .line 701
    :cond_26
    move-object v10, v7

    .line 702
    :cond_27
    add-int/lit8 v13, v13, 0x1

    .line 703
    .line 704
    const/4 v14, 0x7

    .line 705
    const/4 v11, 0x1

    .line 706
    move-object/from16 v7, p1

    .line 707
    .line 708
    move-wide/from16 v8, v16

    .line 709
    .line 710
    goto/16 :goto_a

    .line 711
    .line 712
    :cond_28
    move-wide/from16 v16, v8

    .line 713
    .line 714
    const/4 v9, 0x0

    .line 715
    new-instance v0, Le5/b;

    .line 716
    .line 717
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    invoke-direct {v0, v10, v3, v5}, Le5/b;-><init>(Lc4/h;Lv3/i0;Lv5/c0;)V

    .line 721
    .line 722
    .line 723
    :goto_18
    move-object v3, v0

    .line 724
    move v11, v9

    .line 725
    :goto_19
    iput-object v3, v1, Le5/j;->C:Le5/k;

    .line 726
    .line 727
    iget-object v0, v3, Le5/b;->a:Lc4/h;

    .line 728
    .line 729
    instance-of v2, v0, Lm4/e;

    .line 730
    .line 731
    if-nez v2, :cond_2a

    .line 732
    .line 733
    instance-of v2, v0, Lm4/a;

    .line 734
    .line 735
    if-nez v2, :cond_2a

    .line 736
    .line 737
    instance-of v2, v0, Lm4/c;

    .line 738
    .line 739
    if-nez v2, :cond_2a

    .line 740
    .line 741
    instance-of v0, v0, Lj4/d;

    .line 742
    .line 743
    if-eqz v0, :cond_29

    .line 744
    .line 745
    goto :goto_1a

    .line 746
    :cond_29
    move v0, v11

    .line 747
    goto :goto_1b

    .line 748
    :cond_2a
    :goto_1a
    const/4 v0, 0x1

    .line 749
    :goto_1b
    iget-object v2, v1, Le5/j;->D:Le5/n;

    .line 750
    .line 751
    if-eqz v0, :cond_2c

    .line 752
    .line 753
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    cmp-long v0, v16, v3

    .line 759
    .line 760
    if-eqz v0, :cond_2b

    .line 761
    .line 762
    iget-object v0, v1, Le5/j;->u:Lv5/c0;

    .line 763
    .line 764
    move-wide/from16 v8, v16

    .line 765
    .line 766
    invoke-virtual {v0, v8, v9}, Lv5/c0;->b(J)J

    .line 767
    .line 768
    .line 769
    move-result-wide v3

    .line 770
    goto :goto_1c

    .line 771
    :cond_2b
    iget-wide v3, v1, Lb5/e;->g:J

    .line 772
    .line 773
    goto :goto_1c

    .line 774
    :cond_2c
    const-wide/16 v3, 0x0

    .line 775
    .line 776
    :goto_1c
    invoke-virtual {v2, v3, v4}, Le5/n;->H(J)V

    .line 777
    .line 778
    .line 779
    iget-object v0, v1, Le5/j;->D:Le5/n;

    .line 780
    .line 781
    iget-object v0, v0, Le5/n;->F:Ljava/util/HashSet;

    .line 782
    .line 783
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 784
    .line 785
    .line 786
    iget-object v0, v1, Le5/j;->C:Le5/k;

    .line 787
    .line 788
    iget-object v2, v1, Le5/j;->D:Le5/n;

    .line 789
    .line 790
    check-cast v0, Le5/b;

    .line 791
    .line 792
    iget-object v0, v0, Le5/b;->a:Lc4/h;

    .line 793
    .line 794
    invoke-interface {v0, v2}, Lc4/h;->b(Lc4/j;)V

    .line 795
    .line 796
    .line 797
    :cond_2d
    iget-object v0, v1, Le5/j;->D:Le5/n;

    .line 798
    .line 799
    iget-object v2, v1, Le5/j;->x:La4/d;

    .line 800
    .line 801
    iget-object v3, v0, Le5/n;->e0:La4/d;

    .line 802
    .line 803
    invoke-static {v3, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    if-nez v3, :cond_2f

    .line 808
    .line 809
    iput-object v2, v0, Le5/n;->e0:La4/d;

    .line 810
    .line 811
    :goto_1d
    iget-object v3, v0, Le5/n;->D:[Le5/n$c;

    .line 812
    .line 813
    array-length v4, v3

    .line 814
    if-ge v11, v4, :cond_2f

    .line 815
    .line 816
    iget-object v4, v0, Le5/n;->W:[Z

    .line 817
    .line 818
    aget-boolean v4, v4, v11

    .line 819
    .line 820
    if-eqz v4, :cond_2e

    .line 821
    .line 822
    aget-object v3, v3, v11

    .line 823
    .line 824
    iput-object v2, v3, Le5/n$c;->I:La4/d;

    .line 825
    .line 826
    const/4 v4, 0x1

    .line 827
    iput-boolean v4, v3, Lz4/b0;->z:Z

    .line 828
    .line 829
    :cond_2e
    add-int/lit8 v11, v11, 0x1

    .line 830
    .line 831
    goto :goto_1d

    .line 832
    :cond_2f
    return-object v12
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
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
.end method
