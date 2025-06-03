.class public final Lcom/google/android/exoplayer2/source/dash/DashMediaSource;
.super Lz4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$d;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$h;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$g;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;
    }
.end annotation


# static fields
.field public static final synthetic X:I


# instance fields
.field public final A:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

.field public final B:Ljava/lang/Object;

.field public final C:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/exoplayer2/source/dash/b;",
            ">;"
        }
    .end annotation
.end field

.field public final D:Lb/m;

.field public final E:Lu/a;

.field public final F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

.field public final G:Lt5/e0;

.field public H:Lt5/k;

.field public I:Lt5/d0;

.field public J:Lt5/l0;

.field public K:Lc5/b;

.field public L:Landroid/os/Handler;

.field public M:Lv3/o0$e;

.field public N:Landroid/net/Uri;

.field public O:Landroid/net/Uri;

.field public P:Ld5/c;

.field public Q:Z

.field public R:J

.field public S:J

.field public T:J

.field public U:I

.field public V:J

.field public W:I

.field public final p:Lv3/o0;

.field public final q:Z

.field public final r:Lt5/k$a;

.field public final s:Lcom/google/android/exoplayer2/source/dash/a$a;

.field public final t:Lz4/i;

.field public final u:La4/h;

.field public final v:Lt5/c0;

.field public final w:Lc5/a;

.field public final x:J

.field public final y:Lz4/w$a;

.field public final z:Lt5/f0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/f0$a<",
            "+",
            "Ld5/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.dash"

    invoke-static {v0}, Lv3/h0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lv3/o0;Lt5/k$a;Lt5/f0$a;Lcom/google/android/exoplayer2/source/dash/a$a;Lz4/i;La4/h;Lt5/u;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz4/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    .line 5
    .line 6
    iget-object v0, p1, Lv3/o0;->c:Lv3/o0$e;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lv3/o0$e;

    .line 9
    .line 10
    iget-object v0, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lv3/o0$f;->a:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Landroid/net/Uri;

    .line 18
    .line 19
    iget-object p1, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 20
    .line 21
    iget-object p1, p1, Lv3/o0$f;->a:Landroid/net/Uri;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->O:Landroid/net/Uri;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->r:Lt5/k$a;

    .line 29
    .line 30
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lt5/f0$a;

    .line 31
    .line 32
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->s:Lcom/google/android/exoplayer2/source/dash/a$a;

    .line 33
    .line 34
    iput-object p6, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:La4/h;

    .line 35
    .line 36
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Lt5/c0;

    .line 37
    .line 38
    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x:J

    .line 39
    .line 40
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->t:Lz4/i;

    .line 41
    .line 42
    new-instance p2, Lc5/a;

    .line 43
    .line 44
    invoke-direct {p2}, Lc5/a;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->w:Lc5/a;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->q:Z

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lz4/a;->q(Lz4/t$b;)Lz4/w$a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->y:Lz4/w$a;

    .line 57
    .line 58
    new-instance p1, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 71
    .line 72
    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 73
    .line 74
    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 78
    .line 79
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:J

    .line 85
    .line 86
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 87
    .line 88
    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    .line 94
    .line 95
    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Lt5/e0;

    .line 101
    .line 102
    new-instance p1, Lb/m;

    .line 103
    .line 104
    const/16 p2, 0xb

    .line 105
    .line 106
    invoke-direct {p1, p0, p2}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lb/m;

    .line 110
    .line 111
    new-instance p1, Lu/a;

    .line 112
    .line 113
    const/16 p2, 0xa

    .line 114
    .line 115
    invoke-direct {p1, p0, p2}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lu/a;

    .line 119
    .line 120
    return-void
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
.end method

.method public static x(Ld5/g;)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ld5/g;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Ld5/g;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld5/a;

    iget v2, v2, Ld5/a;->b:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v3

    :cond_2
    return v0
.end method


# virtual methods
.method public final A(Z)V
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ge v2, v3, :cond_8

    .line 13
    .line 14
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 21
    .line 22
    if-lt v3, v5, :cond_7

    .line 23
    .line 24
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v5, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lcom/google/android/exoplayer2/source/dash/b;

    .line 31
    .line 32
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 33
    .line 34
    iget v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 35
    .line 36
    sub-int/2addr v3, v7

    .line 37
    iput-object v6, v5, Lcom/google/android/exoplayer2/source/dash/b;->D:Ld5/c;

    .line 38
    .line 39
    iput v3, v5, Lcom/google/android/exoplayer2/source/dash/b;->E:I

    .line 40
    .line 41
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/b;->u:Lcom/google/android/exoplayer2/source/dash/d;

    .line 42
    .line 43
    iput-boolean v1, v7, Lcom/google/android/exoplayer2/source/dash/d;->p:Z

    .line 44
    .line 45
    iput-object v6, v7, Lcom/google/android/exoplayer2/source/dash/d;->f:Ld5/c;

    .line 46
    .line 47
    iget-object v8, v7, Lcom/google/android/exoplayer2/source/dash/d;->e:Ljava/util/TreeMap;

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_1

    .line 62
    .line 63
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, Ljava/util/Map$Entry;

    .line 68
    .line 69
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    check-cast v9, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    iget-object v11, v7, Lcom/google/android/exoplayer2/source/dash/d;->f:Ld5/c;

    .line 80
    .line 81
    iget-wide v11, v11, Ld5/c;->h:J

    .line 82
    .line 83
    cmp-long v9, v9, v11

    .line 84
    .line 85
    if-gez v9, :cond_0

    .line 86
    .line 87
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    .line 92
    .line 93
    if-eqz v7, :cond_3

    .line 94
    .line 95
    array-length v8, v7

    .line 96
    move v9, v1

    .line 97
    :goto_2
    if-ge v9, v8, :cond_2

    .line 98
    .line 99
    aget-object v10, v7, v9

    .line 100
    .line 101
    iget-object v10, v10, Lb5/h;->e:Lb5/i;

    .line 102
    .line 103
    check-cast v10, Lcom/google/android/exoplayer2/source/dash/a;

    .line 104
    .line 105
    invoke-interface {v10, v6, v3}, Lcom/google/android/exoplayer2/source/dash/a;->d(Ld5/c;I)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v9, v9, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/b;->z:Lz4/r$a;

    .line 112
    .line 113
    invoke-interface {v7, v5}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-virtual {v6, v3}, Ld5/c;->b(I)Ld5/g;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    iget-object v7, v7, Ld5/g;->d:Ljava/util/List;

    .line 121
    .line 122
    iput-object v7, v5, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/List;

    .line 123
    .line 124
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/dash/b;->B:[Lc5/f;

    .line 125
    .line 126
    array-length v8, v7

    .line 127
    move v9, v1

    .line 128
    :goto_3
    if-ge v9, v8, :cond_7

    .line 129
    .line 130
    aget-object v10, v7, v9

    .line 131
    .line 132
    iget-object v11, v5, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    :cond_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_6

    .line 143
    .line 144
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    check-cast v12, Ld5/f;

    .line 149
    .line 150
    invoke-virtual {v12}, Ld5/f;->a()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    iget-object v14, v10, Lc5/f;->e:Ld5/f;

    .line 155
    .line 156
    invoke-virtual {v14}, Ld5/f;->a()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_4

    .line 165
    .line 166
    invoke-virtual {v6}, Ld5/c;->c()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    sub-int/2addr v11, v4

    .line 171
    iget-boolean v13, v6, Ld5/c;->d:Z

    .line 172
    .line 173
    if-eqz v13, :cond_5

    .line 174
    .line 175
    if-ne v3, v11, :cond_5

    .line 176
    .line 177
    move v11, v4

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    move v11, v1

    .line 180
    :goto_4
    invoke-virtual {v10, v12, v11}, Lc5/f;->d(Ld5/f;Z)V

    .line 181
    .line 182
    .line 183
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_8
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Ld5/c;->b(I)Ld5/g;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 197
    .line 198
    invoke-virtual {v3}, Ld5/c;->c()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    sub-int/2addr v3, v4

    .line 203
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 204
    .line 205
    invoke-virtual {v5, v3}, Ld5/c;->b(I)Ld5/g;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 210
    .line 211
    invoke-virtual {v6, v3}, Ld5/c;->e(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    iget-wide v8, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 216
    .line 217
    invoke-static {v8, v9}, Lv5/e0;->u(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v8

    .line 221
    invoke-static {v8, v9}, Lv5/e0;->I(J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v8

    .line 225
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 226
    .line 227
    invoke-virtual {v3, v1}, Ld5/c;->e(I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v10

    .line 231
    iget-wide v12, v2, Ld5/g;->b:J

    .line 232
    .line 233
    invoke-static {v12, v13}, Lv5/e0;->I(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v12

    .line 237
    invoke-static {v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x(Ld5/g;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    move v14, v1

    .line 242
    move-wide v15, v12

    .line 243
    :goto_5
    iget-object v1, v2, Ld5/g;->c:Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    move-object/from16 v18, v5

    .line 250
    .line 251
    if-ge v14, v1, :cond_f

    .line 252
    .line 253
    iget-object v1, v2, Ld5/g;->c:Ljava/util/List;

    .line 254
    .line 255
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Ld5/a;

    .line 260
    .line 261
    iget-object v4, v1, Ld5/a;->c:Ljava/util/List;

    .line 262
    .line 263
    iget v1, v1, Ld5/a;->b:I

    .line 264
    .line 265
    const/4 v5, 0x1

    .line 266
    if-eq v1, v5, :cond_9

    .line 267
    .line 268
    const/4 v5, 0x2

    .line 269
    if-eq v1, v5, :cond_9

    .line 270
    .line 271
    const/4 v1, 0x1

    .line 272
    goto :goto_6

    .line 273
    :cond_9
    const/4 v1, 0x0

    .line 274
    :goto_6
    if-eqz v3, :cond_a

    .line 275
    .line 276
    if-nez v1, :cond_b

    .line 277
    .line 278
    :cond_a
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_c

    .line 283
    .line 284
    :cond_b
    move-wide/from16 v22, v10

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_c
    const/4 v1, 0x0

    .line 288
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Ld5/j;

    .line 293
    .line 294
    invoke-virtual {v4}, Ld5/j;->l()Lc5/c;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    if-nez v1, :cond_d

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_d
    invoke-interface {v1, v10, v11, v8, v9}, Lc5/c;->k(JJ)J

    .line 302
    .line 303
    .line 304
    move-result-wide v4

    .line 305
    const-wide/16 v20, 0x0

    .line 306
    .line 307
    cmp-long v4, v4, v20

    .line 308
    .line 309
    if-nez v4, :cond_e

    .line 310
    .line 311
    :goto_7
    goto :goto_9

    .line 312
    :cond_e
    invoke-interface {v1, v10, v11, v8, v9}, Lc5/c;->d(JJ)J

    .line 313
    .line 314
    .line 315
    move-result-wide v4

    .line 316
    invoke-interface {v1, v4, v5}, Lc5/c;->a(J)J

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    add-long/2addr v4, v12

    .line 321
    move-wide/from16 v22, v10

    .line 322
    .line 323
    move-wide v10, v15

    .line 324
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 325
    .line 326
    .line 327
    move-result-wide v15

    .line 328
    :goto_8
    add-int/lit8 v14, v14, 0x1

    .line 329
    .line 330
    move-object/from16 v5, v18

    .line 331
    .line 332
    move-wide/from16 v10, v22

    .line 333
    .line 334
    const/4 v4, 0x1

    .line 335
    goto :goto_5

    .line 336
    :cond_f
    move-wide v10, v15

    .line 337
    move-wide v12, v10

    .line 338
    :goto_9
    move-object/from16 v1, v18

    .line 339
    .line 340
    iget-wide v3, v1, Ld5/g;->b:J

    .line 341
    .line 342
    invoke-static {v3, v4}, Lv5/e0;->I(J)J

    .line 343
    .line 344
    .line 345
    move-result-wide v3

    .line 346
    invoke-static {v1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x(Ld5/g;)Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    const-wide v10, 0x7fffffffffffffffL

    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    :goto_a
    iget-object v15, v1, Ld5/g;->c:Ljava/util/List;

    .line 357
    .line 358
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 359
    .line 360
    .line 361
    move-result v15

    .line 362
    const-wide/16 v22, 0x1

    .line 363
    .line 364
    if-ge v14, v15, :cond_17

    .line 365
    .line 366
    iget-object v15, v1, Ld5/g;->c:Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v15

    .line 372
    check-cast v15, Ld5/a;

    .line 373
    .line 374
    move-object/from16 v16, v2

    .line 375
    .line 376
    iget-object v2, v15, Ld5/a;->c:Ljava/util/List;

    .line 377
    .line 378
    iget v15, v15, Ld5/a;->b:I

    .line 379
    .line 380
    move-wide/from16 v24, v12

    .line 381
    .line 382
    const/4 v12, 0x1

    .line 383
    if-eq v15, v12, :cond_10

    .line 384
    .line 385
    const/4 v12, 0x2

    .line 386
    if-eq v15, v12, :cond_11

    .line 387
    .line 388
    const/4 v13, 0x1

    .line 389
    goto :goto_b

    .line 390
    :cond_10
    const/4 v12, 0x2

    .line 391
    :cond_11
    const/4 v13, 0x0

    .line 392
    :goto_b
    if-eqz v5, :cond_12

    .line 393
    .line 394
    if-nez v13, :cond_16

    .line 395
    .line 396
    :cond_12
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    if-eqz v13, :cond_13

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_13
    const/4 v13, 0x0

    .line 404
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Ld5/j;

    .line 409
    .line 410
    invoke-virtual {v2}, Ld5/j;->l()Lc5/c;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-nez v2, :cond_14

    .line 415
    .line 416
    add-long/2addr v3, v6

    .line 417
    goto :goto_d

    .line 418
    :cond_14
    invoke-interface {v2, v6, v7, v8, v9}, Lc5/c;->k(JJ)J

    .line 419
    .line 420
    .line 421
    move-result-wide v18

    .line 422
    const-wide/16 v20, 0x0

    .line 423
    .line 424
    cmp-long v13, v18, v20

    .line 425
    .line 426
    if-nez v13, :cond_15

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_15
    invoke-interface {v2, v6, v7, v8, v9}, Lc5/c;->d(JJ)J

    .line 430
    .line 431
    .line 432
    move-result-wide v26

    .line 433
    add-long v26, v26, v18

    .line 434
    .line 435
    sub-long v12, v26, v22

    .line 436
    .line 437
    invoke-interface {v2, v12, v13}, Lc5/c;->a(J)J

    .line 438
    .line 439
    .line 440
    move-result-wide v22

    .line 441
    add-long v22, v22, v3

    .line 442
    .line 443
    invoke-interface {v2, v12, v13, v6, v7}, Lc5/c;->b(JJ)J

    .line 444
    .line 445
    .line 446
    move-result-wide v12

    .line 447
    add-long v12, v12, v22

    .line 448
    .line 449
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 450
    .line 451
    .line 452
    move-result-wide v10

    .line 453
    :cond_16
    :goto_c
    add-int/lit8 v14, v14, 0x1

    .line 454
    .line 455
    move-object/from16 v2, v16

    .line 456
    .line 457
    move-wide/from16 v12, v24

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_17
    move-object/from16 v16, v2

    .line 461
    .line 462
    move-wide/from16 v24, v12

    .line 463
    .line 464
    move-wide v3, v10

    .line 465
    :goto_d
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 466
    .line 467
    iget-boolean v2, v2, Ld5/c;->d:Z

    .line 468
    .line 469
    if-eqz v2, :cond_1b

    .line 470
    .line 471
    const/4 v2, 0x0

    .line 472
    :goto_e
    iget-object v5, v1, Ld5/g;->c:Ljava/util/List;

    .line 473
    .line 474
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    if-ge v2, v5, :cond_1a

    .line 479
    .line 480
    iget-object v5, v1, Ld5/g;->c:Ljava/util/List;

    .line 481
    .line 482
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    check-cast v5, Ld5/a;

    .line 487
    .line 488
    iget-object v5, v5, Ld5/a;->c:Ljava/util/List;

    .line 489
    .line 490
    const/4 v6, 0x0

    .line 491
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    check-cast v5, Ld5/j;

    .line 496
    .line 497
    invoke-virtual {v5}, Ld5/j;->l()Lc5/c;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    if-eqz v5, :cond_19

    .line 502
    .line 503
    invoke-interface {v5}, Lc5/c;->h()Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-eqz v5, :cond_18

    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_18
    add-int/lit8 v2, v2, 0x1

    .line 511
    .line 512
    goto :goto_e

    .line 513
    :cond_19
    :goto_f
    const/4 v1, 0x1

    .line 514
    goto :goto_10

    .line 515
    :cond_1a
    const/4 v1, 0x0

    .line 516
    :goto_10
    if-nez v1, :cond_1b

    .line 517
    .line 518
    const/4 v1, 0x1

    .line 519
    goto :goto_11

    .line 520
    :cond_1b
    const/4 v1, 0x0

    .line 521
    :goto_11
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    if-eqz v1, :cond_1c

    .line 527
    .line 528
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 529
    .line 530
    iget-wide v10, v2, Ld5/c;->f:J

    .line 531
    .line 532
    cmp-long v2, v10, v5

    .line 533
    .line 534
    if-eqz v2, :cond_1c

    .line 535
    .line 536
    invoke-static {v10, v11}, Lv5/e0;->I(J)J

    .line 537
    .line 538
    .line 539
    move-result-wide v10

    .line 540
    sub-long v10, v3, v10

    .line 541
    .line 542
    move-wide/from16 v12, v24

    .line 543
    .line 544
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 545
    .line 546
    .line 547
    move-result-wide v12

    .line 548
    goto :goto_12

    .line 549
    :cond_1c
    move-wide/from16 v12, v24

    .line 550
    .line 551
    :goto_12
    sub-long v34, v3, v12

    .line 552
    .line 553
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 554
    .line 555
    iget-boolean v3, v2, Ld5/c;->d:Z

    .line 556
    .line 557
    if-eqz v3, :cond_31

    .line 558
    .line 559
    iget-wide v2, v2, Ld5/c;->a:J

    .line 560
    .line 561
    cmp-long v2, v2, v5

    .line 562
    .line 563
    if-eqz v2, :cond_1d

    .line 564
    .line 565
    const/4 v2, 0x1

    .line 566
    goto :goto_13

    .line 567
    :cond_1d
    const/4 v2, 0x0

    .line 568
    :goto_13
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 569
    .line 570
    .line 571
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 572
    .line 573
    iget-wide v2, v2, Ld5/c;->a:J

    .line 574
    .line 575
    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    .line 576
    .line 577
    .line 578
    move-result-wide v2

    .line 579
    sub-long/2addr v8, v2

    .line 580
    sub-long/2addr v8, v12

    .line 581
    invoke-static {v8, v9}, Lv5/e0;->R(J)J

    .line 582
    .line 583
    .line 584
    move-result-wide v2

    .line 585
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    .line 586
    .line 587
    iget-object v4, v4, Lv3/o0;->c:Lv3/o0$e;

    .line 588
    .line 589
    iget-wide v10, v4, Lv3/o0$e;->c:J

    .line 590
    .line 591
    cmp-long v4, v10, v5

    .line 592
    .line 593
    if-eqz v4, :cond_1e

    .line 594
    .line 595
    goto :goto_14

    .line 596
    :cond_1e
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 597
    .line 598
    iget-object v4, v4, Ld5/c;->j:Ld5/l;

    .line 599
    .line 600
    if-eqz v4, :cond_1f

    .line 601
    .line 602
    iget-wide v10, v4, Ld5/l;->c:J

    .line 603
    .line 604
    cmp-long v4, v10, v5

    .line 605
    .line 606
    if-eqz v4, :cond_1f

    .line 607
    .line 608
    :goto_14
    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 609
    .line 610
    .line 611
    move-result-wide v10

    .line 612
    goto :goto_15

    .line 613
    :cond_1f
    move-wide v10, v2

    .line 614
    :goto_15
    sub-long v14, v8, v34

    .line 615
    .line 616
    invoke-static {v14, v15}, Lv5/e0;->R(J)J

    .line 617
    .line 618
    .line 619
    move-result-wide v14

    .line 620
    const-wide/16 v18, 0x0

    .line 621
    .line 622
    cmp-long v4, v14, v18

    .line 623
    .line 624
    if-gez v4, :cond_20

    .line 625
    .line 626
    cmp-long v4, v10, v18

    .line 627
    .line 628
    if-lez v4, :cond_20

    .line 629
    .line 630
    const-wide/16 v14, 0x0

    .line 631
    .line 632
    :cond_20
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 633
    .line 634
    move-wide/from16 v18, v12

    .line 635
    .line 636
    iget-wide v12, v4, Ld5/c;->c:J

    .line 637
    .line 638
    cmp-long v4, v12, v5

    .line 639
    .line 640
    if-eqz v4, :cond_21

    .line 641
    .line 642
    add-long/2addr v14, v12

    .line 643
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 644
    .line 645
    .line 646
    move-result-wide v12

    .line 647
    move-wide/from16 v26, v12

    .line 648
    .line 649
    goto :goto_16

    .line 650
    :cond_21
    move-wide/from16 v26, v14

    .line 651
    .line 652
    :goto_16
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    .line 653
    .line 654
    iget-object v4, v4, Lv3/o0;->c:Lv3/o0$e;

    .line 655
    .line 656
    iget-wide v12, v4, Lv3/o0$e;->b:J

    .line 657
    .line 658
    cmp-long v4, v12, v5

    .line 659
    .line 660
    if-eqz v4, :cond_22

    .line 661
    .line 662
    :goto_17
    move-wide/from16 v24, v12

    .line 663
    .line 664
    goto :goto_18

    .line 665
    :cond_22
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 666
    .line 667
    iget-object v4, v4, Ld5/c;->j:Ld5/l;

    .line 668
    .line 669
    if-eqz v4, :cond_23

    .line 670
    .line 671
    iget-wide v12, v4, Ld5/l;->b:J

    .line 672
    .line 673
    cmp-long v4, v12, v5

    .line 674
    .line 675
    if-eqz v4, :cond_23

    .line 676
    .line 677
    goto :goto_17

    .line 678
    :goto_18
    move-wide/from16 v28, v2

    .line 679
    .line 680
    invoke-static/range {v24 .. v29}, Lv5/e0;->j(JJJ)J

    .line 681
    .line 682
    .line 683
    move-result-wide v26

    .line 684
    :cond_23
    move-wide/from16 v39, v26

    .line 685
    .line 686
    cmp-long v2, v39, v10

    .line 687
    .line 688
    if-lez v2, :cond_24

    .line 689
    .line 690
    move-wide/from16 v41, v39

    .line 691
    .line 692
    goto :goto_19

    .line 693
    :cond_24
    move-wide/from16 v41, v10

    .line 694
    .line 695
    :goto_19
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lv3/o0$e;

    .line 696
    .line 697
    iget-wide v2, v2, Lv3/o0$e;->a:J

    .line 698
    .line 699
    cmp-long v4, v2, v5

    .line 700
    .line 701
    if-eqz v4, :cond_25

    .line 702
    .line 703
    goto :goto_1a

    .line 704
    :cond_25
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 705
    .line 706
    iget-object v3, v2, Ld5/c;->j:Ld5/l;

    .line 707
    .line 708
    if-eqz v3, :cond_26

    .line 709
    .line 710
    iget-wide v3, v3, Ld5/l;->a:J

    .line 711
    .line 712
    cmp-long v7, v3, v5

    .line 713
    .line 714
    if-eqz v7, :cond_26

    .line 715
    .line 716
    move-wide v2, v3

    .line 717
    goto :goto_1a

    .line 718
    :cond_26
    iget-wide v2, v2, Ld5/c;->g:J

    .line 719
    .line 720
    cmp-long v4, v2, v5

    .line 721
    .line 722
    if-eqz v4, :cond_27

    .line 723
    .line 724
    goto :goto_1a

    .line 725
    :cond_27
    iget-wide v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x:J

    .line 726
    .line 727
    :goto_1a
    cmp-long v4, v2, v39

    .line 728
    .line 729
    if-gez v4, :cond_28

    .line 730
    .line 731
    move-wide/from16 v2, v39

    .line 732
    .line 733
    :cond_28
    cmp-long v4, v2, v41

    .line 734
    .line 735
    const-wide/16 v10, 0x2

    .line 736
    .line 737
    const-wide/32 v12, 0x4c4b40

    .line 738
    .line 739
    .line 740
    if-lez v4, :cond_29

    .line 741
    .line 742
    div-long v2, v34, v10

    .line 743
    .line 744
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 745
    .line 746
    .line 747
    move-result-wide v2

    .line 748
    sub-long v2, v8, v2

    .line 749
    .line 750
    invoke-static {v2, v3}, Lv5/e0;->R(J)J

    .line 751
    .line 752
    .line 753
    move-result-wide v28

    .line 754
    move-wide/from16 v30, v39

    .line 755
    .line 756
    move-wide/from16 v32, v41

    .line 757
    .line 758
    invoke-static/range {v28 .. v33}, Lv5/e0;->j(JJJ)J

    .line 759
    .line 760
    .line 761
    move-result-wide v2

    .line 762
    :cond_29
    move-wide/from16 v37, v2

    .line 763
    .line 764
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    .line 765
    .line 766
    iget-object v2, v2, Lv3/o0;->c:Lv3/o0$e;

    .line 767
    .line 768
    iget v3, v2, Lv3/o0$e;->d:F

    .line 769
    .line 770
    const v4, -0x800001

    .line 771
    .line 772
    .line 773
    cmpl-float v7, v3, v4

    .line 774
    .line 775
    if-eqz v7, :cond_2a

    .line 776
    .line 777
    goto :goto_1b

    .line 778
    :cond_2a
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 779
    .line 780
    iget-object v3, v3, Ld5/c;->j:Ld5/l;

    .line 781
    .line 782
    if-eqz v3, :cond_2b

    .line 783
    .line 784
    iget v3, v3, Ld5/l;->d:F

    .line 785
    .line 786
    goto :goto_1b

    .line 787
    :cond_2b
    move v3, v4

    .line 788
    :goto_1b
    iget v2, v2, Lv3/o0$e;->e:F

    .line 789
    .line 790
    cmpl-float v7, v2, v4

    .line 791
    .line 792
    if-eqz v7, :cond_2c

    .line 793
    .line 794
    goto :goto_1c

    .line 795
    :cond_2c
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 796
    .line 797
    iget-object v2, v2, Ld5/c;->j:Ld5/l;

    .line 798
    .line 799
    if-eqz v2, :cond_2d

    .line 800
    .line 801
    iget v2, v2, Ld5/l;->e:F

    .line 802
    .line 803
    goto :goto_1c

    .line 804
    :cond_2d
    move v2, v4

    .line 805
    :goto_1c
    cmpl-float v7, v3, v4

    .line 806
    .line 807
    if-nez v7, :cond_2f

    .line 808
    .line 809
    cmpl-float v4, v2, v4

    .line 810
    .line 811
    if-nez v4, :cond_2f

    .line 812
    .line 813
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 814
    .line 815
    iget-object v4, v4, Ld5/c;->j:Ld5/l;

    .line 816
    .line 817
    if-eqz v4, :cond_2e

    .line 818
    .line 819
    iget-wide v14, v4, Ld5/l;->a:J

    .line 820
    .line 821
    cmp-long v4, v14, v5

    .line 822
    .line 823
    if-nez v4, :cond_2f

    .line 824
    .line 825
    :cond_2e
    const/high16 v43, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/high16 v44, 0x3f800000    # 1.0f

    .line 828
    .line 829
    goto :goto_1d

    .line 830
    :cond_2f
    move/from16 v44, v2

    .line 831
    .line 832
    move/from16 v43, v3

    .line 833
    .line 834
    :goto_1d
    new-instance v2, Lv3/o0$e;

    .line 835
    .line 836
    move-object/from16 v36, v2

    .line 837
    .line 838
    invoke-direct/range {v36 .. v44}, Lv3/o0$e;-><init>(JJJFF)V

    .line 839
    .line 840
    .line 841
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lv3/o0$e;

    .line 842
    .line 843
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 844
    .line 845
    iget-wide v2, v2, Ld5/c;->a:J

    .line 846
    .line 847
    invoke-static/range {v18 .. v19}, Lv5/e0;->R(J)J

    .line 848
    .line 849
    .line 850
    move-result-wide v14

    .line 851
    add-long/2addr v14, v2

    .line 852
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lv3/o0$e;

    .line 853
    .line 854
    iget-wide v2, v2, Lv3/o0$e;->a:J

    .line 855
    .line 856
    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    .line 857
    .line 858
    .line 859
    move-result-wide v2

    .line 860
    sub-long/2addr v8, v2

    .line 861
    div-long v2, v34, v10

    .line 862
    .line 863
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 864
    .line 865
    .line 866
    move-result-wide v2

    .line 867
    cmp-long v4, v8, v2

    .line 868
    .line 869
    if-gez v4, :cond_30

    .line 870
    .line 871
    goto :goto_1e

    .line 872
    :cond_30
    move-wide v2, v8

    .line 873
    :goto_1e
    move-wide/from16 v36, v2

    .line 874
    .line 875
    move-wide/from16 v27, v14

    .line 876
    .line 877
    move-object/from16 v2, v16

    .line 878
    .line 879
    goto :goto_1f

    .line 880
    :cond_31
    move-wide/from16 v18, v12

    .line 881
    .line 882
    move-wide/from16 v27, v5

    .line 883
    .line 884
    move-object/from16 v2, v16

    .line 885
    .line 886
    const-wide/16 v36, 0x0

    .line 887
    .line 888
    :goto_1f
    iget-wide v2, v2, Ld5/g;->b:J

    .line 889
    .line 890
    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    .line 891
    .line 892
    .line 893
    move-result-wide v2

    .line 894
    sub-long v32, v18, v2

    .line 895
    .line 896
    new-instance v2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;

    .line 897
    .line 898
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 899
    .line 900
    iget-wide v7, v3, Ld5/c;->a:J

    .line 901
    .line 902
    iget-wide v9, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 903
    .line 904
    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 905
    .line 906
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    .line 907
    .line 908
    iget-boolean v12, v3, Ld5/c;->d:Z

    .line 909
    .line 910
    if-eqz v12, :cond_32

    .line 911
    .line 912
    iget-object v12, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lv3/o0$e;

    .line 913
    .line 914
    goto :goto_20

    .line 915
    :cond_32
    const/4 v12, 0x0

    .line 916
    :goto_20
    move-object/from16 v40, v12

    .line 917
    .line 918
    move-object/from16 v24, v2

    .line 919
    .line 920
    move-wide/from16 v25, v7

    .line 921
    .line 922
    move-wide/from16 v29, v9

    .line 923
    .line 924
    move/from16 v31, v4

    .line 925
    .line 926
    move-object/from16 v38, v3

    .line 927
    .line 928
    move-object/from16 v39, v11

    .line 929
    .line 930
    invoke-direct/range {v24 .. v40}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;-><init>(JJJIJJJLd5/c;Lv3/o0;Lv3/o0$e;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v0, v2}, Lz4/a;->v(Lv3/r1;)V

    .line 934
    .line 935
    .line 936
    iget-boolean v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->q:Z

    .line 937
    .line 938
    if-nez v2, :cond_41

    .line 939
    .line 940
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 941
    .line 942
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lu/a;

    .line 943
    .line 944
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 945
    .line 946
    .line 947
    const-wide/16 v2, 0x1388

    .line 948
    .line 949
    if-eqz v1, :cond_3e

    .line 950
    .line 951
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 952
    .line 953
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lu/a;

    .line 954
    .line 955
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 956
    .line 957
    iget-wide v8, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 958
    .line 959
    invoke-static {v8, v9}, Lv5/e0;->u(J)J

    .line 960
    .line 961
    .line 962
    move-result-wide v8

    .line 963
    invoke-virtual {v7}, Ld5/c;->c()I

    .line 964
    .line 965
    .line 966
    move-result v10

    .line 967
    const/4 v11, 0x1

    .line 968
    sub-int/2addr v10, v11

    .line 969
    invoke-virtual {v7, v10}, Ld5/c;->b(I)Ld5/g;

    .line 970
    .line 971
    .line 972
    move-result-object v11

    .line 973
    iget-wide v12, v11, Ld5/g;->b:J

    .line 974
    .line 975
    invoke-static {v12, v13}, Lv5/e0;->I(J)J

    .line 976
    .line 977
    .line 978
    move-result-wide v12

    .line 979
    invoke-virtual {v7, v10}, Ld5/c;->e(I)J

    .line 980
    .line 981
    .line 982
    move-result-wide v14

    .line 983
    invoke-static {v8, v9}, Lv5/e0;->I(J)J

    .line 984
    .line 985
    .line 986
    move-result-wide v8

    .line 987
    iget-wide v5, v7, Ld5/c;->a:J

    .line 988
    .line 989
    invoke-static {v5, v6}, Lv5/e0;->I(J)J

    .line 990
    .line 991
    .line 992
    move-result-wide v5

    .line 993
    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    .line 994
    .line 995
    .line 996
    move-result-wide v24

    .line 997
    const/4 v7, 0x0

    .line 998
    :goto_21
    iget-object v10, v11, Ld5/g;->c:Ljava/util/List;

    .line 999
    .line 1000
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1001
    .line 1002
    .line 1003
    move-result v10

    .line 1004
    if-ge v7, v10, :cond_36

    .line 1005
    .line 1006
    iget-object v10, v11, Ld5/g;->c:Ljava/util/List;

    .line 1007
    .line 1008
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v10

    .line 1012
    check-cast v10, Ld5/a;

    .line 1013
    .line 1014
    iget-object v10, v10, Ld5/a;->c:Ljava/util/List;

    .line 1015
    .line 1016
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v16

    .line 1020
    const/4 v2, 0x0

    .line 1021
    if-eqz v16, :cond_33

    .line 1022
    .line 1023
    goto :goto_22

    .line 1024
    :cond_33
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v3

    .line 1028
    check-cast v3, Ld5/j;

    .line 1029
    .line 1030
    invoke-virtual {v3}, Ld5/j;->l()Lc5/c;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v3

    .line 1034
    if-eqz v3, :cond_35

    .line 1035
    .line 1036
    add-long v16, v5, v12

    .line 1037
    .line 1038
    invoke-interface {v3, v14, v15, v8, v9}, Lc5/c;->e(JJ)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v28

    .line 1042
    add-long v28, v28, v16

    .line 1043
    .line 1044
    sub-long v28, v28, v8

    .line 1045
    .line 1046
    const-wide/32 v16, 0x186a0

    .line 1047
    .line 1048
    .line 1049
    sub-long v30, v24, v16

    .line 1050
    .line 1051
    cmp-long v3, v28, v30

    .line 1052
    .line 1053
    if-ltz v3, :cond_34

    .line 1054
    .line 1055
    cmp-long v3, v28, v24

    .line 1056
    .line 1057
    if-lez v3, :cond_35

    .line 1058
    .line 1059
    add-long v16, v24, v16

    .line 1060
    .line 1061
    cmp-long v3, v28, v16

    .line 1062
    .line 1063
    if-gez v3, :cond_35

    .line 1064
    .line 1065
    :cond_34
    move-wide/from16 v24, v28

    .line 1066
    .line 1067
    :cond_35
    :goto_22
    add-int/lit8 v7, v7, 0x1

    .line 1068
    .line 1069
    const-wide/16 v2, 0x1388

    .line 1070
    .line 1071
    goto :goto_21

    .line 1072
    :cond_36
    const/4 v2, 0x0

    .line 1073
    const-wide/16 v5, 0x3e8

    .line 1074
    .line 1075
    sget-object v3, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1076
    .line 1077
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    div-long v7, v24, v5

    .line 1081
    .line 1082
    mul-long v9, v7, v5

    .line 1083
    .line 1084
    sub-long v9, v24, v9

    .line 1085
    .line 1086
    const-wide/16 v11, 0x0

    .line 1087
    .line 1088
    cmp-long v13, v9, v11

    .line 1089
    .line 1090
    if-nez v13, :cond_37

    .line 1091
    .line 1092
    goto :goto_26

    .line 1093
    :cond_37
    xor-long v11, v24, v5

    .line 1094
    .line 1095
    const/16 v14, 0x3f

    .line 1096
    .line 1097
    shr-long/2addr v11, v14

    .line 1098
    long-to-int v11, v11

    .line 1099
    const/4 v12, 0x1

    .line 1100
    or-int/2addr v11, v12

    .line 1101
    sget-object v14, Lq7/c;->a:[I

    .line 1102
    .line 1103
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1104
    .line 1105
    .line 1106
    move-result v15

    .line 1107
    aget v14, v14, v15

    .line 1108
    .line 1109
    packed-switch v14, :pswitch_data_0

    .line 1110
    .line 1111
    .line 1112
    new-instance v1, Ljava/lang/AssertionError;

    .line 1113
    .line 1114
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 1115
    .line 1116
    .line 1117
    throw v1

    .line 1118
    :pswitch_0
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v9

    .line 1122
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 1123
    .line 1124
    .line 1125
    move-result-wide v5

    .line 1126
    sub-long/2addr v5, v9

    .line 1127
    sub-long/2addr v9, v5

    .line 1128
    const-wide/16 v5, 0x0

    .line 1129
    .line 1130
    cmp-long v9, v9, v5

    .line 1131
    .line 1132
    if-nez v9, :cond_38

    .line 1133
    .line 1134
    sget-object v9, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 1135
    .line 1136
    if-eq v3, v9, :cond_39

    .line 1137
    .line 1138
    sget-object v9, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 1139
    .line 1140
    if-ne v3, v9, :cond_3b

    .line 1141
    .line 1142
    and-long v9, v7, v22

    .line 1143
    .line 1144
    cmp-long v3, v9, v5

    .line 1145
    .line 1146
    if-eqz v3, :cond_3b

    .line 1147
    .line 1148
    goto :goto_23

    .line 1149
    :cond_38
    if-lez v9, :cond_3b

    .line 1150
    .line 1151
    goto :goto_23

    .line 1152
    :pswitch_1
    if-lez v11, :cond_3b

    .line 1153
    .line 1154
    goto :goto_23

    .line 1155
    :pswitch_2
    if-gez v11, :cond_3b

    .line 1156
    .line 1157
    :cond_39
    :goto_23
    :pswitch_3
    move v2, v12

    .line 1158
    goto :goto_25

    .line 1159
    :pswitch_4
    if-nez v13, :cond_3a

    .line 1160
    .line 1161
    goto :goto_24

    .line 1162
    :cond_3a
    move v12, v2

    .line 1163
    :goto_24
    if-eqz v12, :cond_3d

    .line 1164
    .line 1165
    :cond_3b
    :goto_25
    :pswitch_5
    if-eqz v2, :cond_3c

    .line 1166
    .line 1167
    int-to-long v2, v11

    .line 1168
    add-long/2addr v7, v2

    .line 1169
    :cond_3c
    :goto_26
    invoke-virtual {v1, v4, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1170
    .line 1171
    .line 1172
    goto :goto_27

    .line 1173
    :cond_3d
    new-instance v1, Ljava/lang/ArithmeticException;

    .line 1174
    .line 1175
    const-string v2, "mode was UNNECESSARY, but rounding was necessary"

    .line 1176
    .line 1177
    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 1178
    .line 1179
    .line 1180
    throw v1

    .line 1181
    :cond_3e
    :goto_27
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Z

    .line 1182
    .line 1183
    if-eqz v1, :cond_3f

    .line 1184
    .line 1185
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B()V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_28

    .line 1189
    :cond_3f
    if-eqz p1, :cond_41

    .line 1190
    .line 1191
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 1192
    .line 1193
    iget-boolean v2, v1, Ld5/c;->d:Z

    .line 1194
    .line 1195
    if-eqz v2, :cond_41

    .line 1196
    .line 1197
    iget-wide v1, v1, Ld5/c;->e:J

    .line 1198
    .line 1199
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    cmp-long v3, v1, v3

    .line 1205
    .line 1206
    if-eqz v3, :cond_41

    .line 1207
    .line 1208
    const-wide/16 v3, 0x0

    .line 1209
    .line 1210
    cmp-long v5, v1, v3

    .line 1211
    .line 1212
    if-nez v5, :cond_40

    .line 1213
    .line 1214
    const-wide/16 v1, 0x1388

    .line 1215
    .line 1216
    :cond_40
    iget-wide v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:J

    .line 1217
    .line 1218
    add-long/2addr v5, v1

    .line 1219
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v1

    .line 1223
    sub-long/2addr v5, v1

    .line 1224
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1225
    .line 1226
    .line 1227
    move-result-wide v1

    .line 1228
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 1229
    .line 1230
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lb/m;

    .line 1231
    .line 1232
    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1233
    .line 1234
    .line 1235
    :cond_41
    :goto_28
    return-void

    .line 1236
    nop

    .line 1237
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public final B()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lb/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lt5/d0;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt5/d0;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Landroid/net/Uri;

    .line 33
    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Z

    .line 37
    .line 38
    new-instance v0, Lt5/f0;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Lt5/k;

    .line 41
    .line 42
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lt5/f0$a;

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-direct {v0, v2, v1, v4, v3}, Lt5/f0;-><init>(Lt5/k;Landroid/net/Uri;ILt5/f0$a;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Lt5/c0;

    .line 51
    .line 52
    check-cast v2, Lt5/u;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lt5/u;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 59
    .line 60
    invoke-virtual {v3, v0, v1, v2}, Lt5/d0;->f(Lt5/d0$d;Lt5/d0$a;I)J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->y:Lz4/w$a;

    .line 65
    .line 66
    new-instance v2, Lz4/n;

    .line 67
    .line 68
    iget-wide v5, v0, Lt5/f0;->a:J

    .line 69
    .line 70
    iget-object v7, v0, Lt5/f0;->b:Lt5/n;

    .line 71
    .line 72
    move-object v4, v2

    .line 73
    invoke-direct/range {v4 .. v9}, Lz4/n;-><init>(JLt5/n;J)V

    .line 74
    .line 75
    .line 76
    iget v0, v0, Lt5/f0;->c:I

    .line 77
    .line 78
    invoke-virtual {v1, v2, v0}, Lz4/w$a;->m(Lz4/n;I)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception v1

    .line 83
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw v1
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

.method public final f()Lv3/o0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->p:Lv3/o0;

    return-object v0
.end method

.method public final g(Lz4/r;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/source/dash/b;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/exoplayer2/source/dash/b;->u:Lcom/google/android/exoplayer2/source/dash/d;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/source/dash/d;->q:Z

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/android/exoplayer2/source/dash/d;->d:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Lb5/h;->A(Lb5/h$b;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v1, p1, Lcom/google/android/exoplayer2/source/dash/b;->z:Lz4/r$a;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 31
    .line 32
    iget p1, p1, Lcom/google/android/exoplayer2/source/dash/b;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Lt5/e0;

    invoke-interface {v0}, Lt5/e0;->a()V

    return-void
.end method

.method public final o(Lz4/t$b;Lt5/b;J)Lz4/r;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v1, v7, Lz4/s;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 14
    .line 15
    sub-int v11, v1, v2

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 18
    .line 19
    invoke-virtual {v1, v11}, Ld5/c;->b(I)Ld5/g;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-wide v5, v1, Ld5/g;->b:J

    .line 24
    .line 25
    iget-object v1, v0, Lz4/a;->c:Lz4/w$a;

    .line 26
    .line 27
    new-instance v13, Lz4/w$a;

    .line 28
    .line 29
    iget-object v2, v1, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    move-object v1, v13

    .line 33
    move-object/from16 v4, p1

    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, Lz4/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;J)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lz4/a;->d:La4/g$a;

    .line 39
    .line 40
    new-instance v2, La4/g$a;

    .line 41
    .line 42
    iget-object v1, v1, La4/g$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v2, v1, v3, v7}, La4/g$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/b;

    .line 49
    .line 50
    move-object v3, v1

    .line 51
    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 52
    .line 53
    add-int v7, v4, v11

    .line 54
    .line 55
    move v4, v7

    .line 56
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 57
    .line 58
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->w:Lc5/a;

    .line 59
    .line 60
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->s:Lcom/google/android/exoplayer2/source/dash/a$a;

    .line 61
    .line 62
    iget-object v9, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Lt5/l0;

    .line 63
    .line 64
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:La4/h;

    .line 65
    .line 66
    iget-object v12, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Lt5/c0;

    .line 67
    .line 68
    iget-wide v14, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 69
    .line 70
    move/from16 p1, v7

    .line 71
    .line 72
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Lt5/e0;

    .line 73
    .line 74
    move-object/from16 v16, v7

    .line 75
    .line 76
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->t:Lz4/i;

    .line 77
    .line 78
    move-object/from16 v18, v7

    .line 79
    .line 80
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    .line 81
    .line 82
    move-object/from16 v19, v7

    .line 83
    .line 84
    iget-object v7, v0, Lz4/a;->o:Lw3/a0;

    .line 85
    .line 86
    move-object/from16 v20, v7

    .line 87
    .line 88
    invoke-static {v7}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move/from16 v21, p1

    .line 92
    .line 93
    move v7, v11

    .line 94
    move-object v11, v2

    .line 95
    move-object/from16 v17, p2

    .line 96
    .line 97
    invoke-direct/range {v3 .. v20}, Lcom/google/android/exoplayer2/source/dash/b;-><init>(ILd5/c;Lc5/a;ILcom/google/android/exoplayer2/source/dash/a$a;Lt5/l0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;JLt5/e0;Lt5/b;Lz4/i;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;Lw3/a0;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 101
    .line 102
    move/from16 v4, v21

    .line 103
    .line 104
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object v1
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
.end method

.method public final t(Lt5/l0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Lt5/l0;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:La4/h;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lz4/a;->o:Lw3/a0;

    .line 10
    .line 11
    invoke-static {v1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0, v1}, La4/h;->c(Landroid/os/Looper;Lw3/a0;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:La4/h;

    .line 18
    .line 19
    invoke-interface {p1}, La4/h;->a()V

    .line 20
    .line 21
    .line 22
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->q:Z

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->r:Lt5/k$a;

    .line 32
    .line 33
    invoke-interface {p1}, Lt5/k$a;->a()Lt5/k;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Lt5/k;

    .line 38
    .line 39
    new-instance p1, Lt5/d0;

    .line 40
    .line 41
    const-string v0, "DashMediaSource"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lt5/d0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-static {p1}, Lv5/e0;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B()V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
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

.method public final w()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Lt5/k;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lt5/d0;->e(Lt5/d0$e;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:J

    .line 19
    .line 20
    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:J

    .line 21
    .line 22
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->q:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, v1

    .line 30
    :goto_0
    iput-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ld5/c;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->O:Landroid/net/Uri;

    .line 33
    .line 34
    iput-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Landroid/net/Uri;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->K:Lc5/b;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Landroid/os/Handler;

    .line 46
    .line 47
    :cond_2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iput-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 53
    .line 54
    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:I

    .line 55
    .line 56
    iput-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:J

    .line 57
    .line 58
    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:I

    .line 59
    .line 60
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->w:Lc5/a;

    .line 66
    .line 67
    iget-object v1, v0, Lc5/a;->a:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lc5/a;->b:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lc5/a;->c:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:La4/h;

    .line 83
    .line 84
    invoke-interface {v0}, La4/h;->release()V

    .line 85
    .line 86
    .line 87
    return-void
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

.method public final y()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Lt5/d0;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lv5/x;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    sget-boolean v3, Lv5/x;->c:Z

    .line 12
    .line 13
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_1
    sget-boolean v0, Lv5/x;->c:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-wide v0, Lv5/x;->d:J

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:J

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A(Z)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    throw v0

    .line 40
    :cond_1
    if-nez v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Lt5/d0;

    .line 43
    .line 44
    const-string v2, "SntpClient"

    .line 45
    .line 46
    invoke-direct {v0, v2}, Lt5/d0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    new-instance v2, Lv5/x$c;

    .line 50
    .line 51
    invoke-direct {v2}, Lv5/x$c;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lv5/x$b;

    .line 55
    .line 56
    invoke-direct {v3, v1}, Lv5/x$b;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2, v3, v4}, Lt5/d0;->f(Lt5/d0$d;Lt5/d0$a;I)J

    .line 60
    .line 61
    .line 62
    :goto_1
    return-void

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    throw v0
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

.method public final z(Lt5/f0;JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt5/f0<",
            "*>;JJ)V"
        }
    .end annotation

    .line 1
    new-instance p2, Lz4/n;

    .line 2
    .line 3
    iget-wide p3, p1, Lt5/f0;->a:J

    .line 4
    .line 5
    iget-object p3, p1, Lt5/f0;->d:Lt5/j0;

    .line 6
    .line 7
    iget-object p4, p3, Lt5/j0;->c:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object p3, p3, Lt5/j0;->d:Ljava/util/Map;

    .line 10
    .line 11
    invoke-direct {p2, p3}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Lt5/c0;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->y:Lz4/w$a;

    .line 20
    .line 21
    iget p1, p1, Lt5/f0;->c:I

    .line 22
    .line 23
    invoke-virtual {p3, p2, p1}, Lz4/w$a;->d(Lz4/n;I)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method
