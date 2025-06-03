.class public Lz4/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/b0$b;,
        Lz4/b0$a;,
        Lz4/b0$c;
    }
.end annotation


# instance fields
.field public A:Lv3/i0;

.field public B:Lv3/i0;

.field public C:I

.field public D:Z

.field public E:Z

.field public F:J

.field public G:Z

.field public final a:Lz4/a0;

.field public final b:Lz4/b0$a;

.field public final c:Lz4/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz4/h0<",
            "Lz4/b0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:La4/h;

.field public final e:La4/g$a;

.field public f:Lz4/b0$c;

.field public g:Lv3/i0;

.field public h:La4/e;

.field public i:I

.field public j:[I

.field public k:[J

.field public l:[I

.field public m:[I

.field public n:[J

.field public o:[Lc4/v$a;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lt5/b;La4/h;La4/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz4/b0;->d:La4/h;

    iput-object p3, p0, Lz4/b0;->e:La4/g$a;

    new-instance p2, Lz4/a0;

    invoke-direct {p2, p1}, Lz4/a0;-><init>(Lt5/b;)V

    iput-object p2, p0, Lz4/b0;->a:Lz4/a0;

    new-instance p1, Lz4/b0$a;

    invoke-direct {p1}, Lz4/b0$a;-><init>()V

    iput-object p1, p0, Lz4/b0;->b:Lz4/b0$a;

    const/16 p1, 0x3e8

    iput p1, p0, Lz4/b0;->i:I

    new-array p2, p1, [I

    iput-object p2, p0, Lz4/b0;->j:[I

    new-array p2, p1, [J

    iput-object p2, p0, Lz4/b0;->k:[J

    new-array p2, p1, [J

    iput-object p2, p0, Lz4/b0;->n:[J

    new-array p2, p1, [I

    iput-object p2, p0, Lz4/b0;->m:[I

    new-array p2, p1, [I

    iput-object p2, p0, Lz4/b0;->l:[I

    new-array p1, p1, [Lc4/v$a;

    iput-object p1, p0, Lz4/b0;->o:[Lc4/v$a;

    new-instance p1, Lz4/h0;

    new-instance p2, Lr3/j;

    const/16 p3, 0xc

    invoke-direct {p2, p3}, Lr3/j;-><init>(I)V

    invoke-direct {p1, p2}, Lz4/h0;-><init>(Lr3/j;)V

    iput-object p1, p0, Lz4/b0;->c:Lz4/h0;

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lz4/b0;->t:J

    iput-wide p1, p0, Lz4/b0;->u:J

    iput-wide p1, p0, Lz4/b0;->v:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz4/b0;->y:Z

    iput-boolean p1, p0, Lz4/b0;->x:Z

    return-void
.end method


# virtual methods
.method public final a(ILv5/u;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    :cond_0
    :goto_0
    if-lez p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lz4/a0;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 10
    .line 11
    iget-object v3, v2, Lz4/a0$a;->c:Lt5/a;

    .line 12
    .line 13
    iget-object v4, v3, Lt5/a;->a:[B

    .line 14
    .line 15
    iget-wide v5, v0, Lz4/a0;->g:J

    .line 16
    .line 17
    iget-wide v7, v2, Lz4/a0$a;->a:J

    .line 18
    .line 19
    sub-long/2addr v5, v7

    .line 20
    long-to-int v2, v5

    .line 21
    iget v3, v3, Lt5/a;->b:I

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    invoke-virtual {p2, v4, v2, v1}, Lv5/u;->d([BII)V

    .line 25
    .line 26
    .line 27
    sub-int/2addr p1, v1

    .line 28
    iget-wide v2, v0, Lz4/a0;->g:J

    .line 29
    .line 30
    int-to-long v4, v1

    .line 31
    add-long/2addr v2, v4

    .line 32
    iput-wide v2, v0, Lz4/a0;->g:J

    .line 33
    .line 34
    iget-object v1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 35
    .line 36
    iget-wide v4, v1, Lz4/a0$a;->b:J

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    iget-object v1, v1, Lz4/a0$a;->d:Lz4/a0$a;

    .line 43
    .line 44
    iput-object v1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final b(ILv5/u;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/b0;->a(ILv5/u;)V

    return-void
.end method

.method public c(JIIILc4/v$a;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p4

    .line 4
    .line 5
    iget-boolean v2, v1, Lz4/b0;->z:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v1, Lz4/b0;->A:Lv3/i0;

    .line 10
    .line 11
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lz4/b0;->d(Lv3/i0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    and-int/lit8 v2, p3, 0x1

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    move v5, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v5, v3

    .line 26
    :goto_0
    iget-boolean v6, v1, Lz4/b0;->x:Z

    .line 27
    .line 28
    if-eqz v6, :cond_3

    .line 29
    .line 30
    if-nez v5, :cond_2

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    iput-boolean v3, v1, Lz4/b0;->x:Z

    .line 34
    .line 35
    :cond_3
    iget-wide v6, v1, Lz4/b0;->F:J

    .line 36
    .line 37
    add-long v6, p1, v6

    .line 38
    .line 39
    iget-boolean v8, v1, Lz4/b0;->D:Z

    .line 40
    .line 41
    if-eqz v8, :cond_6

    .line 42
    .line 43
    iget-wide v8, v1, Lz4/b0;->t:J

    .line 44
    .line 45
    cmp-long v8, v6, v8

    .line 46
    .line 47
    if-gez v8, :cond_4

    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    if-nez v2, :cond_6

    .line 51
    .line 52
    iget-boolean v2, v1, Lz4/b0;->E:Z

    .line 53
    .line 54
    if-nez v2, :cond_5

    .line 55
    .line 56
    const-string v2, "SampleQueue"

    .line 57
    .line 58
    const-string v8, "Overriding unexpected non-sync sample for format: "

    .line 59
    .line 60
    invoke-static {v8}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget-object v9, v1, Lz4/b0;->B:Lv3/i0;

    .line 65
    .line 66
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {v2, v8}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-boolean v4, v1, Lz4/b0;->E:Z

    .line 77
    .line 78
    :cond_5
    or-int/lit8 v2, p3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    move/from16 v2, p3

    .line 82
    .line 83
    :goto_1
    iget-boolean v8, v1, Lz4/b0;->G:Z

    .line 84
    .line 85
    const/4 v9, -0x1

    .line 86
    if-eqz v8, :cond_e

    .line 87
    .line 88
    if-eqz v5, :cond_d

    .line 89
    .line 90
    monitor-enter p0

    .line 91
    :try_start_0
    iget v5, v1, Lz4/b0;->p:I

    .line 92
    .line 93
    if-nez v5, :cond_8

    .line 94
    .line 95
    iget-wide v10, v1, Lz4/b0;->u:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    .line 97
    cmp-long v5, v6, v10

    .line 98
    .line 99
    if-lez v5, :cond_7

    .line 100
    .line 101
    move v5, v4

    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move v5, v3

    .line 104
    :goto_2
    monitor-exit p0

    .line 105
    goto :goto_4

    .line 106
    :cond_8
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    iget-wide v10, v1, Lz4/b0;->u:J

    .line 108
    .line 109
    iget v5, v1, Lz4/b0;->s:I

    .line 110
    .line 111
    invoke-virtual {v1, v5}, Lz4/b0;->m(I)J

    .line 112
    .line 113
    .line 114
    move-result-wide v12

    .line 115
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 116
    .line 117
    .line 118
    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    cmp-long v5, v10, v6

    .line 121
    .line 122
    if-ltz v5, :cond_9

    .line 123
    .line 124
    monitor-exit p0

    .line 125
    move v5, v3

    .line 126
    goto :goto_4

    .line 127
    :cond_9
    :try_start_4
    iget v5, v1, Lz4/b0;->p:I

    .line 128
    .line 129
    add-int/lit8 v8, v5, -0x1

    .line 130
    .line 131
    invoke-virtual {v1, v8}, Lz4/b0;->n(I)I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    :cond_a
    :goto_3
    iget v10, v1, Lz4/b0;->s:I

    .line 136
    .line 137
    if-le v5, v10, :cond_b

    .line 138
    .line 139
    iget-object v10, v1, Lz4/b0;->n:[J

    .line 140
    .line 141
    aget-wide v11, v10, v8

    .line 142
    .line 143
    cmp-long v10, v11, v6

    .line 144
    .line 145
    if-ltz v10, :cond_b

    .line 146
    .line 147
    add-int/lit8 v5, v5, -0x1

    .line 148
    .line 149
    add-int/lit8 v8, v8, -0x1

    .line 150
    .line 151
    if-ne v8, v9, :cond_a

    .line 152
    .line 153
    iget v8, v1, Lz4/b0;->i:I

    .line 154
    .line 155
    add-int/2addr v8, v9

    .line 156
    goto :goto_3

    .line 157
    :cond_b
    iget v8, v1, Lz4/b0;->q:I

    .line 158
    .line 159
    add-int/2addr v8, v5

    .line 160
    invoke-virtual {v1, v8}, Lz4/b0;->i(I)J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 161
    .line 162
    .line 163
    monitor-exit p0

    .line 164
    move v5, v4

    .line 165
    :goto_4
    if-nez v5, :cond_c

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_c
    iput-boolean v3, v1, Lz4/b0;->G:Z

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    :try_start_5
    monitor-exit p0

    .line 173
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    monitor-exit p0

    .line 176
    throw v0

    .line 177
    :cond_d
    :goto_5
    return-void

    .line 178
    :cond_e
    :goto_6
    iget-object v5, v1, Lz4/b0;->a:Lz4/a0;

    .line 179
    .line 180
    iget-wide v10, v5, Lz4/a0;->g:J

    .line 181
    .line 182
    int-to-long v12, v0

    .line 183
    sub-long/2addr v10, v12

    .line 184
    move/from16 v5, p5

    .line 185
    .line 186
    int-to-long v12, v5

    .line 187
    sub-long/2addr v10, v12

    .line 188
    monitor-enter p0

    .line 189
    :try_start_6
    iget v5, v1, Lz4/b0;->p:I

    .line 190
    .line 191
    if-lez v5, :cond_10

    .line 192
    .line 193
    sub-int/2addr v5, v4

    .line 194
    invoke-virtual {v1, v5}, Lz4/b0;->n(I)I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    iget-object v8, v1, Lz4/b0;->k:[J

    .line 199
    .line 200
    aget-wide v12, v8, v5

    .line 201
    .line 202
    iget-object v8, v1, Lz4/b0;->l:[I

    .line 203
    .line 204
    aget v5, v8, v5

    .line 205
    .line 206
    int-to-long v14, v5

    .line 207
    add-long/2addr v12, v14

    .line 208
    cmp-long v5, v12, v10

    .line 209
    .line 210
    if-gtz v5, :cond_f

    .line 211
    .line 212
    move v5, v4

    .line 213
    goto :goto_7

    .line 214
    :cond_f
    move v5, v3

    .line 215
    :goto_7
    invoke-static {v5}, Lx6/b;->q(Z)V

    .line 216
    .line 217
    .line 218
    :cond_10
    const/high16 v5, 0x20000000

    .line 219
    .line 220
    and-int/2addr v5, v2

    .line 221
    if-eqz v5, :cond_11

    .line 222
    .line 223
    move v5, v4

    .line 224
    goto :goto_8

    .line 225
    :cond_11
    move v5, v3

    .line 226
    :goto_8
    iput-boolean v5, v1, Lz4/b0;->w:Z

    .line 227
    .line 228
    iget-wide v12, v1, Lz4/b0;->v:J

    .line 229
    .line 230
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 231
    .line 232
    .line 233
    move-result-wide v12

    .line 234
    iput-wide v12, v1, Lz4/b0;->v:J

    .line 235
    .line 236
    iget v5, v1, Lz4/b0;->p:I

    .line 237
    .line 238
    invoke-virtual {v1, v5}, Lz4/b0;->n(I)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    iget-object v8, v1, Lz4/b0;->n:[J

    .line 243
    .line 244
    aput-wide v6, v8, v5

    .line 245
    .line 246
    iget-object v6, v1, Lz4/b0;->k:[J

    .line 247
    .line 248
    aput-wide v10, v6, v5

    .line 249
    .line 250
    iget-object v6, v1, Lz4/b0;->l:[I

    .line 251
    .line 252
    aput v0, v6, v5

    .line 253
    .line 254
    iget-object v0, v1, Lz4/b0;->m:[I

    .line 255
    .line 256
    aput v2, v0, v5

    .line 257
    .line 258
    iget-object v0, v1, Lz4/b0;->o:[Lc4/v$a;

    .line 259
    .line 260
    aput-object p6, v0, v5

    .line 261
    .line 262
    iget-object v0, v1, Lz4/b0;->j:[I

    .line 263
    .line 264
    iget v2, v1, Lz4/b0;->C:I

    .line 265
    .line 266
    aput v2, v0, v5

    .line 267
    .line 268
    iget-object v0, v1, Lz4/b0;->c:Lz4/h0;

    .line 269
    .line 270
    iget-object v0, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-nez v0, :cond_12

    .line 277
    .line 278
    move v0, v4

    .line 279
    goto :goto_9

    .line 280
    :cond_12
    move v0, v3

    .line 281
    :goto_9
    if-nez v0, :cond_13

    .line 282
    .line 283
    iget-object v0, v1, Lz4/b0;->c:Lz4/h0;

    .line 284
    .line 285
    iget-object v0, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    add-int/2addr v2, v9

    .line 292
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Lz4/b0$b;

    .line 297
    .line 298
    iget-object v0, v0, Lz4/b0$b;->a:Lv3/i0;

    .line 299
    .line 300
    iget-object v2, v1, Lz4/b0;->B:Lv3/i0;

    .line 301
    .line 302
    invoke-virtual {v0, v2}, Lv3/i0;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_15

    .line 307
    .line 308
    :cond_13
    iget-object v0, v1, Lz4/b0;->d:La4/h;

    .line 309
    .line 310
    if-eqz v0, :cond_14

    .line 311
    .line 312
    iget-object v2, v1, Lz4/b0;->e:La4/g$a;

    .line 313
    .line 314
    iget-object v5, v1, Lz4/b0;->B:Lv3/i0;

    .line 315
    .line 316
    invoke-interface {v0, v2, v5}, La4/h;->b(La4/g$a;Lv3/i0;)La4/h$b;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    goto :goto_a

    .line 321
    :cond_14
    sget-object v0, La4/h$b;->h:Le0/e;

    .line 322
    .line 323
    :goto_a
    iget-object v2, v1, Lz4/b0;->c:Lz4/h0;

    .line 324
    .line 325
    iget v5, v1, Lz4/b0;->q:I

    .line 326
    .line 327
    iget v6, v1, Lz4/b0;->p:I

    .line 328
    .line 329
    add-int/2addr v5, v6

    .line 330
    new-instance v6, Lz4/b0$b;

    .line 331
    .line 332
    iget-object v7, v1, Lz4/b0;->B:Lv3/i0;

    .line 333
    .line 334
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-direct {v6, v7, v0}, Lz4/b0$b;-><init>(Lv3/i0;La4/h$b;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v5, v6}, Lz4/h0;->a(ILz4/b0$b;)V

    .line 341
    .line 342
    .line 343
    :cond_15
    iget v0, v1, Lz4/b0;->p:I

    .line 344
    .line 345
    add-int/2addr v0, v4

    .line 346
    iput v0, v1, Lz4/b0;->p:I

    .line 347
    .line 348
    iget v2, v1, Lz4/b0;->i:I

    .line 349
    .line 350
    if-ne v0, v2, :cond_16

    .line 351
    .line 352
    add-int/lit16 v0, v2, 0x3e8

    .line 353
    .line 354
    new-array v4, v0, [I

    .line 355
    .line 356
    new-array v5, v0, [J

    .line 357
    .line 358
    new-array v6, v0, [J

    .line 359
    .line 360
    new-array v7, v0, [I

    .line 361
    .line 362
    new-array v8, v0, [I

    .line 363
    .line 364
    new-array v9, v0, [Lc4/v$a;

    .line 365
    .line 366
    iget v10, v1, Lz4/b0;->r:I

    .line 367
    .line 368
    sub-int/2addr v2, v10

    .line 369
    iget-object v11, v1, Lz4/b0;->k:[J

    .line 370
    .line 371
    invoke-static {v11, v10, v5, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 372
    .line 373
    .line 374
    iget-object v10, v1, Lz4/b0;->n:[J

    .line 375
    .line 376
    iget v11, v1, Lz4/b0;->r:I

    .line 377
    .line 378
    invoke-static {v10, v11, v6, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 379
    .line 380
    .line 381
    iget-object v10, v1, Lz4/b0;->m:[I

    .line 382
    .line 383
    iget v11, v1, Lz4/b0;->r:I

    .line 384
    .line 385
    invoke-static {v10, v11, v7, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 386
    .line 387
    .line 388
    iget-object v10, v1, Lz4/b0;->l:[I

    .line 389
    .line 390
    iget v11, v1, Lz4/b0;->r:I

    .line 391
    .line 392
    invoke-static {v10, v11, v8, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 393
    .line 394
    .line 395
    iget-object v10, v1, Lz4/b0;->o:[Lc4/v$a;

    .line 396
    .line 397
    iget v11, v1, Lz4/b0;->r:I

    .line 398
    .line 399
    invoke-static {v10, v11, v9, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 400
    .line 401
    .line 402
    iget-object v10, v1, Lz4/b0;->j:[I

    .line 403
    .line 404
    iget v11, v1, Lz4/b0;->r:I

    .line 405
    .line 406
    invoke-static {v10, v11, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 407
    .line 408
    .line 409
    iget v10, v1, Lz4/b0;->r:I

    .line 410
    .line 411
    iget-object v11, v1, Lz4/b0;->k:[J

    .line 412
    .line 413
    invoke-static {v11, v3, v5, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 414
    .line 415
    .line 416
    iget-object v11, v1, Lz4/b0;->n:[J

    .line 417
    .line 418
    invoke-static {v11, v3, v6, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 419
    .line 420
    .line 421
    iget-object v11, v1, Lz4/b0;->m:[I

    .line 422
    .line 423
    invoke-static {v11, v3, v7, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 424
    .line 425
    .line 426
    iget-object v11, v1, Lz4/b0;->l:[I

    .line 427
    .line 428
    invoke-static {v11, v3, v8, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 429
    .line 430
    .line 431
    iget-object v11, v1, Lz4/b0;->o:[Lc4/v$a;

    .line 432
    .line 433
    invoke-static {v11, v3, v9, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 434
    .line 435
    .line 436
    iget-object v11, v1, Lz4/b0;->j:[I

    .line 437
    .line 438
    invoke-static {v11, v3, v4, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 439
    .line 440
    .line 441
    iput-object v5, v1, Lz4/b0;->k:[J

    .line 442
    .line 443
    iput-object v6, v1, Lz4/b0;->n:[J

    .line 444
    .line 445
    iput-object v7, v1, Lz4/b0;->m:[I

    .line 446
    .line 447
    iput-object v8, v1, Lz4/b0;->l:[I

    .line 448
    .line 449
    iput-object v9, v1, Lz4/b0;->o:[Lc4/v$a;

    .line 450
    .line 451
    iput-object v4, v1, Lz4/b0;->j:[I

    .line 452
    .line 453
    iput v3, v1, Lz4/b0;->r:I

    .line 454
    .line 455
    iput v0, v1, Lz4/b0;->i:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 456
    .line 457
    :cond_16
    monitor-exit p0

    .line 458
    return-void

    .line 459
    :catchall_2
    move-exception v0

    .line 460
    monitor-exit p0

    .line 461
    throw v0
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
.end method

.method public final d(Lv3/i0;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lz4/b0;->l(Lv3/i0;)Lv3/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lz4/b0;->z:Z

    .line 7
    .line 8
    iput-object p1, p0, Lz4/b0;->A:Lv3/i0;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iput-boolean v1, p0, Lz4/b0;->y:Z

    .line 12
    .line 13
    iget-object p1, p0, Lz4/b0;->B:Lv3/i0;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object p1, p0, Lz4/b0;->c:Lz4/h0;

    .line 24
    .line 25
    iget-object p1, p1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    move p1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move p1, v1

    .line 36
    :goto_0
    if-nez p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lz4/b0;->c:Lz4/h0;

    .line 39
    .line 40
    iget-object p1, p1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/lit8 v3, v3, -0x1

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lz4/b0$b;

    .line 53
    .line 54
    iget-object p1, p1, Lz4/b0$b;->a:Lv3/i0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lv3/i0;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lz4/b0;->c:Lz4/h0;

    .line 63
    .line 64
    iget-object p1, p1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/lit8 v0, v0, -0x1

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lz4/b0$b;

    .line 77
    .line 78
    iget-object v0, p1, Lz4/b0$b;->a:Lv3/i0;

    .line 79
    .line 80
    :cond_2
    iput-object v0, p0, Lz4/b0;->B:Lv3/i0;

    .line 81
    .line 82
    iget-object p1, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p1, v0}, Lv5/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput-boolean p1, p0, Lz4/b0;->D:Z

    .line 91
    .line 92
    iput-boolean v1, p0, Lz4/b0;->E:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    move v1, v2

    .line 95
    :goto_1
    monitor-exit p0

    .line 96
    iget-object p1, p0, Lz4/b0;->f:Lz4/b0$c;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-interface {p1}, Lz4/b0$c;->a()V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    monitor-exit p0

    .line 108
    throw p1
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
.end method

.method public final e(Lt5/h;IZ)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lz4/b0;->w(Lt5/h;IZ)I

    move-result p1

    return p1
.end method

.method public final f(I)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lz4/b0;->u:J

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz4/b0;->m(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lz4/b0;->u:J

    .line 12
    .line 13
    iget v0, p0, Lz4/b0;->p:I

    .line 14
    .line 15
    sub-int/2addr v0, p1

    .line 16
    iput v0, p0, Lz4/b0;->p:I

    .line 17
    .line 18
    iget v0, p0, Lz4/b0;->q:I

    .line 19
    .line 20
    add-int/2addr v0, p1

    .line 21
    iput v0, p0, Lz4/b0;->q:I

    .line 22
    .line 23
    iget v1, p0, Lz4/b0;->r:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    iput v1, p0, Lz4/b0;->r:I

    .line 27
    .line 28
    iget v2, p0, Lz4/b0;->i:I

    .line 29
    .line 30
    if-lt v1, v2, :cond_0

    .line 31
    .line 32
    sub-int/2addr v1, v2

    .line 33
    iput v1, p0, Lz4/b0;->r:I

    .line 34
    .line 35
    :cond_0
    iget v1, p0, Lz4/b0;->s:I

    .line 36
    .line 37
    sub-int/2addr v1, p1

    .line 38
    iput v1, p0, Lz4/b0;->s:I

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    iput p1, p0, Lz4/b0;->s:I

    .line 44
    .line 45
    :cond_1
    iget-object v1, p0, Lz4/b0;->c:Lz4/h0;

    .line 46
    .line 47
    :goto_0
    iget-object v2, v1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    if-ge p1, v2, :cond_3

    .line 56
    .line 57
    iget-object v2, v1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    add-int/lit8 v3, p1, 0x1

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-lt v0, v2, :cond_3

    .line 66
    .line 67
    iget-object v2, v1, Lz4/h0;->c:Lv5/e;

    .line 68
    .line 69
    iget-object v4, v1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v2, v4}, Lv5/e;->accept(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 79
    .line 80
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->removeAt(I)V

    .line 81
    .line 82
    .line 83
    iget p1, v1, Lz4/h0;->a:I

    .line 84
    .line 85
    if-lez p1, :cond_2

    .line 86
    .line 87
    add-int/lit8 p1, p1, -0x1

    .line 88
    .line 89
    iput p1, v1, Lz4/h0;->a:I

    .line 90
    .line 91
    :cond_2
    move p1, v3

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    iget p1, p0, Lz4/b0;->p:I

    .line 94
    .line 95
    if-nez p1, :cond_5

    .line 96
    .line 97
    iget p1, p0, Lz4/b0;->r:I

    .line 98
    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    iget p1, p0, Lz4/b0;->i:I

    .line 102
    .line 103
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 104
    .line 105
    iget-object v0, p0, Lz4/b0;->k:[J

    .line 106
    .line 107
    aget-wide v1, v0, p1

    .line 108
    .line 109
    iget-object v0, p0, Lz4/b0;->l:[I

    .line 110
    .line 111
    aget p1, v0, p1

    .line 112
    .line 113
    int-to-long v3, p1

    .line 114
    add-long/2addr v1, v3

    .line 115
    return-wide v1

    .line 116
    :cond_5
    iget-object p1, p0, Lz4/b0;->k:[J

    .line 117
    .line 118
    iget v0, p0, Lz4/b0;->r:I

    .line 119
    .line 120
    aget-wide v0, p1, v0

    .line 121
    .line 122
    return-wide v0
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

.method public final g(JZZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v1, p0, Lz4/b0;->p:I

    .line 5
    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iget-object v4, p0, Lz4/b0;->n:[J

    .line 11
    .line 12
    iget v6, p0, Lz4/b0;->r:I

    .line 13
    .line 14
    aget-wide v7, v4, v6

    .line 15
    .line 16
    cmp-long v4, p1, v7

    .line 17
    .line 18
    if-gez v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-eqz p4, :cond_1

    .line 22
    .line 23
    iget p4, p0, Lz4/b0;->s:I

    .line 24
    .line 25
    if-eq p4, v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 v1, p4, 0x1

    .line 28
    .line 29
    :cond_1
    move v7, v1

    .line 30
    move-object v5, p0

    .line 31
    move-wide v8, p1

    .line 32
    move v10, p3

    .line 33
    invoke-virtual/range {v5 .. v10}, Lz4/b0;->k(IIJZ)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, -0x1

    .line 38
    if-ne p1, p2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p0, p1}, Lz4/b0;->f(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :cond_3
    :goto_0
    monitor-exit p0

    .line 46
    invoke-virtual {v0, v2, v3}, Lz4/a0;->b(J)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    monitor-exit p0

    .line 52
    throw p1
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

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v1, p0, Lz4/b0;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    :goto_0
    monitor-exit p0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, Lz4/b0;->f(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    invoke-virtual {v0, v1, v2}, Lz4/a0;->b(J)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    monitor-exit p0

    .line 23
    throw v0
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

.method public final i(I)J
    .locals 8

    .line 1
    iget v0, p0, Lz4/b0;->q:I

    .line 2
    .line 3
    iget v1, p0, Lz4/b0;->p:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    sub-int/2addr v0, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget v4, p0, Lz4/b0;->s:I

    .line 12
    .line 13
    sub-int/2addr v1, v4

    .line 14
    if-gt v0, v1, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    invoke-static {v1}, Lx6/b;->q(Z)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lz4/b0;->p:I

    .line 23
    .line 24
    sub-int/2addr v1, v0

    .line 25
    iput v1, p0, Lz4/b0;->p:I

    .line 26
    .line 27
    iget-wide v4, p0, Lz4/b0;->u:J

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lz4/b0;->m(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iput-wide v4, p0, Lz4/b0;->v:J

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    iget-boolean v0, p0, Lz4/b0;->w:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_1
    iput-boolean v2, p0, Lz4/b0;->w:Z

    .line 47
    .line 48
    iget-object v0, p0, Lz4/b0;->c:Lz4/h0;

    .line 49
    .line 50
    iget-object v1, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, -0x1

    .line 57
    add-int/2addr v1, v2

    .line 58
    :goto_1
    if-ltz v1, :cond_2

    .line 59
    .line 60
    iget-object v4, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ge p1, v4, :cond_2

    .line 67
    .line 68
    iget-object v4, v0, Lz4/h0;->c:Lv5/e;

    .line 69
    .line 70
    iget-object v5, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 71
    .line 72
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v4, v5}, Lv5/e;->accept(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 80
    .line 81
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->removeAt(I)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v1, v1, -0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    iget-object p1, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-lez p1, :cond_3

    .line 94
    .line 95
    iget p1, v0, Lz4/h0;->a:I

    .line 96
    .line 97
    iget-object v1, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v1, v2

    .line 104
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    :cond_3
    iput v2, v0, Lz4/h0;->a:I

    .line 109
    .line 110
    iget p1, p0, Lz4/b0;->p:I

    .line 111
    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    sub-int/2addr p1, v3

    .line 115
    invoke-virtual {p0, p1}, Lz4/b0;->n(I)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object v0, p0, Lz4/b0;->k:[J

    .line 120
    .line 121
    aget-wide v1, v0, p1

    .line 122
    .line 123
    iget-object v0, p0, Lz4/b0;->l:[I

    .line 124
    .line 125
    aget p1, v0, p1

    .line 126
    .line 127
    int-to-long v3, p1

    .line 128
    add-long/2addr v1, v3

    .line 129
    return-wide v1

    .line 130
    :cond_4
    const-wide/16 v0, 0x0

    .line 131
    .line 132
    return-wide v0
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

.method public final j(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz4/b0;->i(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v3, v0, Lz4/a0;->g:J

    .line 8
    .line 9
    cmp-long p1, v1, v3

    .line 10
    .line 11
    if-gtz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-static {p1}, Lx6/b;->q(Z)V

    .line 17
    .line 18
    .line 19
    iput-wide v1, v0, Lz4/a0;->g:J

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long p1, v1, v3

    .line 24
    .line 25
    if-eqz p1, :cond_4

    .line 26
    .line 27
    iget-object p1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 28
    .line 29
    iget-wide v3, p1, Lz4/a0$a;->a:J

    .line 30
    .line 31
    cmp-long v1, v1, v3

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    iget-wide v1, v0, Lz4/a0;->g:J

    .line 37
    .line 38
    iget-wide v3, p1, Lz4/a0$a;->b:J

    .line 39
    .line 40
    cmp-long v1, v1, v3

    .line 41
    .line 42
    if-lez v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p1, Lz4/a0$a;->d:Lz4/a0$a;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v1, p1, Lz4/a0$a;->d:Lz4/a0$a;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lz4/a0;->a(Lz4/a0$a;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lz4/a0$a;

    .line 56
    .line 57
    iget-wide v3, p1, Lz4/a0$a;->b:J

    .line 58
    .line 59
    iget v5, v0, Lz4/a0;->b:I

    .line 60
    .line 61
    invoke-direct {v2, v5, v3, v4}, Lz4/a0$a;-><init>(IJ)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p1, Lz4/a0$a;->d:Lz4/a0$a;

    .line 65
    .line 66
    iget-wide v3, v0, Lz4/a0;->g:J

    .line 67
    .line 68
    iget-wide v5, p1, Lz4/a0$a;->b:J

    .line 69
    .line 70
    cmp-long v3, v3, v5

    .line 71
    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    move-object p1, v2

    .line 75
    :cond_3
    iput-object p1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 76
    .line 77
    iget-object p1, v0, Lz4/a0;->e:Lz4/a0$a;

    .line 78
    .line 79
    if-ne p1, v1, :cond_5

    .line 80
    .line 81
    iput-object v2, v0, Lz4/a0;->e:Lz4/a0$a;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    iget-object p1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Lz4/a0;->a(Lz4/a0$a;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Lz4/a0$a;

    .line 90
    .line 91
    iget-wide v1, v0, Lz4/a0;->g:J

    .line 92
    .line 93
    iget v3, v0, Lz4/a0;->b:I

    .line 94
    .line 95
    invoke-direct {p1, v3, v1, v2}, Lz4/a0$a;-><init>(IJ)V

    .line 96
    .line 97
    .line 98
    iput-object p1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 99
    .line 100
    iput-object p1, v0, Lz4/a0;->e:Lz4/a0$a;

    .line 101
    .line 102
    iput-object p1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 103
    .line 104
    :cond_5
    :goto_3
    return-void
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
.end method

.method public final k(IIJZ)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v0

    :goto_0
    if-ge v2, p2, :cond_4

    iget-object v3, p0, Lz4/b0;->n:[J

    aget-wide v4, v3, p1

    cmp-long v3, v4, p3

    if-gtz v3, :cond_4

    if-eqz p5, :cond_0

    iget-object v3, p0, Lz4/b0;->m:[I

    aget v3, v3, p1

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    :cond_0
    cmp-long v1, v4, p3

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    add-int/lit8 p1, p1, 0x1

    iget v3, p0, Lz4/b0;->i:I

    if-ne p1, v3, :cond_3

    move p1, v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v1
.end method

.method public l(Lv3/i0;)Lv3/i0;
    .locals 5

    .line 1
    iget-wide v0, p0, Lz4/b0;->F:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p1, Lv3/i0;->x:J

    .line 10
    .line 11
    const-wide v2, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lv3/i0;->a()Lv3/i0$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-wide v1, p1, Lv3/i0;->x:J

    .line 25
    .line 26
    iget-wide v3, p0, Lz4/b0;->F:J

    .line 27
    .line 28
    add-long/2addr v1, v3

    .line 29
    iput-wide v1, v0, Lv3/i0$a;->o:J

    .line 30
    .line 31
    invoke-virtual {v0}, Lv3/i0$a;->a()Lv3/i0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    return-object p1
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

.method public final m(I)J
    .locals 7

    const-wide/high16 v0, -0x8000000000000000L

    if-nez p1, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2}, Lz4/b0;->n(I)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_3

    iget-object v4, p0, Lz4/b0;->n:[J

    aget-wide v5, v4, v2

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v4, p0, Lz4/b0;->m:[I

    aget v4, v4, v2

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    iget v2, p0, Lz4/b0;->i:I

    add-int/lit8 v2, v2, -0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-wide v0
.end method

.method public final n(I)I
    .locals 1

    iget v0, p0, Lz4/b0;->r:I

    add-int/2addr v0, p1

    iget p1, p0, Lz4/b0;->i:I

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    :goto_0
    return v0
.end method

.method public final declared-synchronized o(JZ)I
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lz4/b0;->s:I

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lz4/b0;->n(I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    iget v0, p0, Lz4/b0;->s:I

    .line 9
    .line 10
    iget v1, p0, Lz4/b0;->p:I

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v7

    .line 18
    :goto_0
    if-eqz v3, :cond_4

    .line 19
    .line 20
    iget-object v3, p0, Lz4/b0;->n:[J

    .line 21
    .line 22
    aget-wide v4, v3, v2

    .line 23
    .line 24
    cmp-long v3, p1, v4

    .line 25
    .line 26
    if-gez v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-wide v3, p0, Lz4/b0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    cmp-long v3, p1, v3

    .line 32
    .line 33
    if-lez v3, :cond_2

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    sub-int/2addr v1, v0

    .line 38
    monitor-exit p0

    .line 39
    return v1

    .line 40
    :cond_2
    sub-int v3, v1, v0

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    move-object v1, p0

    .line 44
    move-wide v4, p1

    .line 45
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lz4/b0;->k(IIJZ)I

    .line 46
    .line 47
    .line 48
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    const/4 p2, -0x1

    .line 50
    monitor-exit p0

    .line 51
    if-ne p1, p2, :cond_3

    .line 52
    .line 53
    return v7

    .line 54
    :cond_3
    return p1

    .line 55
    :cond_4
    :goto_1
    monitor-exit p0

    .line 56
    return v7

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit p0

    .line 59
    throw p1
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

.method public final declared-synchronized p()Lv3/i0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lz4/b0;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz4/b0;->B:Lv3/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized q(Z)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lz4/b0;->s:I

    .line 3
    .line 4
    iget v1, p0, Lz4/b0;->p:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v3

    .line 13
    :goto_0
    if-nez v1, :cond_3

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    iget-boolean p1, p0, Lz4/b0;->w:Z

    .line 18
    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lz4/b0;->B:Lv3/i0;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lz4/b0;->g:Lv3/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v3

    .line 31
    :cond_2
    :goto_1
    monitor-exit p0

    .line 32
    return v2

    .line 33
    :cond_3
    :try_start_1
    iget-object p1, p0, Lz4/b0;->c:Lz4/h0;

    .line 34
    .line 35
    iget v1, p0, Lz4/b0;->q:I

    .line 36
    .line 37
    add-int/2addr v1, v0

    .line 38
    invoke-virtual {p1, v1}, Lz4/h0;->b(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lz4/b0$b;

    .line 43
    .line 44
    iget-object p1, p1, Lz4/b0$b;->a:Lv3/i0;

    .line 45
    .line 46
    iget-object v0, p0, Lz4/b0;->g:Lv3/i0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    if-eq p1, v0, :cond_4

    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return v2

    .line 52
    :cond_4
    :try_start_2
    iget p1, p0, Lz4/b0;->s:I

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lz4/b0;->n(I)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p0, p1}, Lz4/b0;->r(I)Z

    .line 59
    .line 60
    .line 61
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    monitor-exit p0

    .line 63
    return p1

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p0

    .line 66
    throw p1
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

.method public final r(I)Z
    .locals 2

    iget-object v0, p0, Lz4/b0;->h:La4/e;

    if-eqz v0, :cond_1

    invoke-interface {v0}, La4/e;->e()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz4/b0;->m:[I

    aget p1, v0, p1

    const/high16 v0, 0x40000000    # 2.0f

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lz4/b0;->h:La4/e;

    invoke-interface {p1}, La4/e;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz4/b0;->h:La4/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, La4/e;->e()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lz4/b0;->h:La4/e;

    .line 14
    .line 15
    invoke-interface {v0}, La4/e;->k()La4/e$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :cond_1
    :goto_0
    return-void
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

.method public final t(Lv3/i0;Ll3/l;)V
    .locals 4

    iget-object v0, p0, Lz4/b0;->g:Lv3/i0;

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lv3/i0;->w:La4/d;

    :goto_1
    iput-object p1, p0, Lz4/b0;->g:Lv3/i0;

    iget-object v2, p1, Lv3/i0;->w:La4/d;

    iget-object v3, p0, Lz4/b0;->d:La4/h;

    if-eqz v3, :cond_2

    invoke-interface {v3, p1}, La4/h;->e(Lv3/i0;)I

    move-result v3

    invoke-virtual {p1, v3}, Lv3/i0;->b(I)Lv3/i0;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, p1

    :goto_2
    iput-object v3, p2, Ll3/l;->b:Ljava/lang/Object;

    iget-object v3, p0, Lz4/b0;->h:La4/e;

    iput-object v3, p2, Ll3/l;->a:Ljava/lang/Object;

    iget-object v3, p0, Lz4/b0;->d:La4/h;

    if-nez v3, :cond_3

    return-void

    :cond_3
    if-nez v1, :cond_4

    invoke-static {v0, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lz4/b0;->h:La4/e;

    iget-object v1, p0, Lz4/b0;->d:La4/h;

    iget-object v2, p0, Lz4/b0;->e:La4/g$a;

    invoke-interface {v1, v2, p1}, La4/h;->d(La4/g$a;Lv3/i0;)La4/e;

    move-result-object p1

    iput-object p1, p0, Lz4/b0;->h:La4/e;

    iput-object p1, p2, Ll3/l;->a:Ljava/lang/Object;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lz4/b0;->e:La4/g$a;

    invoke-interface {v0, p1}, La4/e;->f(La4/g$a;)V

    :cond_5
    return-void
.end method

.method public final u(Ll3/l;Lz3/g;IZ)I
    .locals 11

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lz4/b0;->b:Lz4/b0$a;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iput-boolean v1, p2, Lz3/g;->d:Z

    .line 14
    .line 15
    iget v4, p0, Lz4/b0;->s:I

    .line 16
    .line 17
    iget v5, p0, Lz4/b0;->p:I

    .line 18
    .line 19
    if-eq v4, v5, :cond_1

    .line 20
    .line 21
    move v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v5, v1

    .line 24
    :goto_1
    const/4 v6, -0x5

    .line 25
    const/4 v7, -0x3

    .line 26
    const/4 v8, -0x4

    .line 27
    const/4 v9, 0x4

    .line 28
    if-nez v5, :cond_5

    .line 29
    .line 30
    if-nez p4, :cond_4

    .line 31
    .line 32
    iget-boolean p4, p0, Lz4/b0;->w:Z

    .line 33
    .line 34
    if-eqz p4, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget-object p4, p0, Lz4/b0;->B:Lv3/i0;

    .line 38
    .line 39
    if-eqz p4, :cond_7

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, Lz4/b0;->g:Lv3/i0;

    .line 44
    .line 45
    if-eq p4, v0, :cond_7

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0, p4, p1}, Lz4/b0;->t(Lv3/i0;Ll3/l;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_4
    :goto_2
    iput v9, p2, Lz3/a;->a:I

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_5
    iget-object v5, p0, Lz4/b0;->c:Lz4/h0;

    .line 55
    .line 56
    iget v10, p0, Lz4/b0;->q:I

    .line 57
    .line 58
    add-int/2addr v10, v4

    .line 59
    invoke-virtual {v5, v10}, Lz4/h0;->b(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lz4/b0$b;

    .line 64
    .line 65
    iget-object v4, v4, Lz4/b0$b;->a:Lv3/i0;

    .line 66
    .line 67
    if-nez v0, :cond_c

    .line 68
    .line 69
    iget-object v0, p0, Lz4/b0;->g:Lv3/i0;

    .line 70
    .line 71
    if-eq v4, v0, :cond_6

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    iget p1, p0, Lz4/b0;->s:I

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lz4/b0;->n(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0, p1}, Lz4/b0;->r(I)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    iput-boolean v2, p2, Lz3/g;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    :cond_7
    monitor-exit p0

    .line 89
    move v6, v7

    .line 90
    goto :goto_6

    .line 91
    :cond_8
    :try_start_1
    iget-object v0, p0, Lz4/b0;->m:[I

    .line 92
    .line 93
    aget v0, v0, p1

    .line 94
    .line 95
    iput v0, p2, Lz3/a;->a:I

    .line 96
    .line 97
    iget v0, p0, Lz4/b0;->s:I

    .line 98
    .line 99
    iget v4, p0, Lz4/b0;->p:I

    .line 100
    .line 101
    sub-int/2addr v4, v2

    .line 102
    if-ne v0, v4, :cond_a

    .line 103
    .line 104
    if-nez p4, :cond_9

    .line 105
    .line 106
    iget-boolean p4, p0, Lz4/b0;->w:Z

    .line 107
    .line 108
    if-eqz p4, :cond_a

    .line 109
    .line 110
    :cond_9
    const/high16 p4, 0x20000000

    .line 111
    .line 112
    invoke-virtual {p2, p4}, Lz3/a;->l(I)V

    .line 113
    .line 114
    .line 115
    :cond_a
    iget-object p4, p0, Lz4/b0;->n:[J

    .line 116
    .line 117
    aget-wide v4, p4, p1

    .line 118
    .line 119
    iput-wide v4, p2, Lz3/g;->e:J

    .line 120
    .line 121
    iget-wide v6, p0, Lz4/b0;->t:J

    .line 122
    .line 123
    cmp-long p4, v4, v6

    .line 124
    .line 125
    if-gez p4, :cond_b

    .line 126
    .line 127
    const/high16 p4, -0x80000000

    .line 128
    .line 129
    invoke-virtual {p2, p4}, Lz3/a;->l(I)V

    .line 130
    .line 131
    .line 132
    :cond_b
    iget-object p4, p0, Lz4/b0;->l:[I

    .line 133
    .line 134
    aget p4, p4, p1

    .line 135
    .line 136
    iput p4, v3, Lz4/b0$a;->a:I

    .line 137
    .line 138
    iget-object p4, p0, Lz4/b0;->k:[J

    .line 139
    .line 140
    aget-wide v4, p4, p1

    .line 141
    .line 142
    iput-wide v4, v3, Lz4/b0$a;->b:J

    .line 143
    .line 144
    iget-object p4, p0, Lz4/b0;->o:[Lc4/v$a;

    .line 145
    .line 146
    aget-object p1, p4, p1

    .line 147
    .line 148
    iput-object p1, v3, Lz4/b0$a;->c:Lc4/v$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    :goto_3
    monitor-exit p0

    .line 151
    move v6, v8

    .line 152
    goto :goto_6

    .line 153
    :cond_c
    :goto_4
    :try_start_2
    invoke-virtual {p0, v4, p1}, Lz4/b0;->t(Lv3/i0;Ll3/l;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    .line 155
    .line 156
    :goto_5
    monitor-exit p0

    .line 157
    :goto_6
    if-ne v6, v8, :cond_10

    .line 158
    .line 159
    invoke-virtual {p2, v9}, Lz3/a;->m(I)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_10

    .line 164
    .line 165
    and-int/lit8 p1, p3, 0x1

    .line 166
    .line 167
    if-eqz p1, :cond_d

    .line 168
    .line 169
    move v1, v2

    .line 170
    :cond_d
    and-int/lit8 p1, p3, 0x4

    .line 171
    .line 172
    if-nez p1, :cond_f

    .line 173
    .line 174
    iget-object p1, p0, Lz4/b0;->a:Lz4/a0;

    .line 175
    .line 176
    iget-object p3, p0, Lz4/b0;->b:Lz4/b0$a;

    .line 177
    .line 178
    if-eqz v1, :cond_e

    .line 179
    .line 180
    iget-object p4, p1, Lz4/a0;->e:Lz4/a0$a;

    .line 181
    .line 182
    iget-object p1, p1, Lz4/a0;->c:Lv5/u;

    .line 183
    .line 184
    invoke-static {p4, p2, p3, p1}, Lz4/a0;->f(Lz4/a0$a;Lz3/g;Lz4/b0$a;Lv5/u;)Lz4/a0$a;

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_e
    iget-object p4, p1, Lz4/a0;->e:Lz4/a0$a;

    .line 189
    .line 190
    iget-object v0, p1, Lz4/a0;->c:Lv5/u;

    .line 191
    .line 192
    invoke-static {p4, p2, p3, v0}, Lz4/a0;->f(Lz4/a0$a;Lz3/g;Lz4/b0$a;Lv5/u;)Lz4/a0$a;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    iput-object p2, p1, Lz4/a0;->e:Lz4/a0$a;

    .line 197
    .line 198
    :cond_f
    :goto_7
    if-nez v1, :cond_10

    .line 199
    .line 200
    iget p1, p0, Lz4/b0;->s:I

    .line 201
    .line 202
    add-int/2addr p1, v2

    .line 203
    iput p1, p0, Lz4/b0;->s:I

    .line 204
    .line 205
    :cond_10
    return v6

    .line 206
    :catchall_0
    move-exception p1

    .line 207
    monitor-exit p0

    .line 208
    throw p1
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

.method public final v(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    iget-object v1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lz4/a0;->a(Lz4/a0$a;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 9
    .line 10
    iget v2, v0, Lz4/a0;->b:I

    .line 11
    .line 12
    iget-object v3, v1, Lz4/a0$a;->c:Lt5/a;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    move v3, v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v4

    .line 21
    :goto_0
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    iput-wide v6, v1, Lz4/a0$a;->a:J

    .line 27
    .line 28
    int-to-long v2, v2

    .line 29
    add-long/2addr v2, v6

    .line 30
    iput-wide v2, v1, Lz4/a0$a;->b:J

    .line 31
    .line 32
    iget-object v1, v0, Lz4/a0;->d:Lz4/a0$a;

    .line 33
    .line 34
    iput-object v1, v0, Lz4/a0;->e:Lz4/a0$a;

    .line 35
    .line 36
    iput-object v1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 37
    .line 38
    iput-wide v6, v0, Lz4/a0;->g:J

    .line 39
    .line 40
    iget-object v0, v0, Lz4/a0;->a:Lt5/b;

    .line 41
    .line 42
    check-cast v0, Lt5/o;

    .line 43
    .line 44
    invoke-virtual {v0}, Lt5/o;->a()V

    .line 45
    .line 46
    .line 47
    iput v4, p0, Lz4/b0;->p:I

    .line 48
    .line 49
    iput v4, p0, Lz4/b0;->q:I

    .line 50
    .line 51
    iput v4, p0, Lz4/b0;->r:I

    .line 52
    .line 53
    iput v4, p0, Lz4/b0;->s:I

    .line 54
    .line 55
    iput-boolean v5, p0, Lz4/b0;->x:Z

    .line 56
    .line 57
    const-wide/high16 v0, -0x8000000000000000L

    .line 58
    .line 59
    iput-wide v0, p0, Lz4/b0;->t:J

    .line 60
    .line 61
    iput-wide v0, p0, Lz4/b0;->u:J

    .line 62
    .line 63
    iput-wide v0, p0, Lz4/b0;->v:J

    .line 64
    .line 65
    iput-boolean v4, p0, Lz4/b0;->w:Z

    .line 66
    .line 67
    iget-object v0, p0, Lz4/b0;->c:Lz4/h0;

    .line 68
    .line 69
    :goto_1
    iget-object v1, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ge v4, v1, :cond_1

    .line 76
    .line 77
    iget-object v1, v0, Lz4/h0;->c:Lv5/e;

    .line 78
    .line 79
    iget-object v2, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v1, v2}, Lv5/e;->accept(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    const/4 v1, -0x1

    .line 92
    iput v1, v0, Lz4/h0;->a:I

    .line 93
    .line 94
    iget-object v0, v0, Lz4/h0;->b:Landroid/util/SparseArray;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Lz4/b0;->A:Lv3/i0;

    .line 103
    .line 104
    iput-object p1, p0, Lz4/b0;->B:Lv3/i0;

    .line 105
    .line 106
    iput-boolean v5, p0, Lz4/b0;->y:Z

    .line 107
    .line 108
    :cond_2
    return-void
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
.end method

.method public final w(Lt5/h;IZ)I
    .locals 8

    .line 1
    iget-object v0, p0, Lz4/b0;->a:Lz4/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lz4/a0;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 8
    .line 9
    iget-object v2, v1, Lz4/a0$a;->c:Lt5/a;

    .line 10
    .line 11
    iget-object v3, v2, Lt5/a;->a:[B

    .line 12
    .line 13
    iget-wide v4, v0, Lz4/a0;->g:J

    .line 14
    .line 15
    iget-wide v6, v1, Lz4/a0$a;->a:J

    .line 16
    .line 17
    sub-long/2addr v4, v6

    .line 18
    long-to-int v1, v4

    .line 19
    iget v2, v2, Lt5/a;->b:I

    .line 20
    .line 21
    add-int/2addr v1, v2

    .line 22
    invoke-interface {p1, v3, v1, p2}, Lt5/h;->read([BII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 p2, -0x1

    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    if-eqz p3, :cond_0

    .line 30
    .line 31
    move p1, p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-wide p2, v0, Lz4/a0;->g:J

    .line 40
    .line 41
    int-to-long v1, p1

    .line 42
    add-long/2addr p2, v1

    .line 43
    iput-wide p2, v0, Lz4/a0;->g:J

    .line 44
    .line 45
    iget-object v1, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 46
    .line 47
    iget-wide v2, v1, Lz4/a0$a;->b:J

    .line 48
    .line 49
    cmp-long p2, p2, v2

    .line 50
    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    iget-object p2, v1, Lz4/a0$a;->d:Lz4/a0$a;

    .line 54
    .line 55
    iput-object p2, v0, Lz4/a0;->f:Lz4/a0$a;

    .line 56
    .line 57
    :cond_2
    :goto_0
    return p1
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

.method public final declared-synchronized x(JZ)Z
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_1
    iput v0, p0, Lz4/b0;->s:I

    .line 5
    .line 6
    iget-object v1, p0, Lz4/b0;->a:Lz4/a0;

    .line 7
    .line 8
    iget-object v2, v1, Lz4/a0;->d:Lz4/a0$a;

    .line 9
    .line 10
    iput-object v2, v1, Lz4/a0;->e:Lz4/a0$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    .line 12
    :try_start_2
    monitor-exit p0

    .line 13
    invoke-virtual {p0, v0}, Lz4/b0;->n(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v1, p0, Lz4/b0;->s:I

    .line 18
    .line 19
    iget v2, p0, Lz4/b0;->p:I

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    move v3, v9

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v0

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget-object v3, p0, Lz4/b0;->n:[J

    .line 30
    .line 31
    aget-wide v5, v3, v4

    .line 32
    .line 33
    cmp-long v3, p1, v5

    .line 34
    .line 35
    if-ltz v3, :cond_3

    .line 36
    .line 37
    iget-wide v5, p0, Lz4/b0;->v:J

    .line 38
    .line 39
    cmp-long v3, p1, v5

    .line 40
    .line 41
    if-lez v3, :cond_1

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sub-int v5, v2, v1

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    move-object v3, p0

    .line 50
    move-wide v6, p1

    .line 51
    invoke-virtual/range {v3 .. v8}, Lz4/b0;->k(IIJZ)I

    .line 52
    .line 53
    .line 54
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    const/4 v1, -0x1

    .line 56
    if-ne p3, v1, :cond_2

    .line 57
    .line 58
    monitor-exit p0

    .line 59
    return v0

    .line 60
    :cond_2
    :try_start_3
    iput-wide p1, p0, Lz4/b0;->t:J

    .line 61
    .line 62
    iget p1, p0, Lz4/b0;->s:I

    .line 63
    .line 64
    add-int/2addr p1, p3

    .line 65
    iput p1, p0, Lz4/b0;->s:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return v9

    .line 69
    :cond_3
    :goto_1
    monitor-exit p0

    .line 70
    return v0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    :try_start_4
    monitor-exit p0

    .line 75
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 76
    :goto_2
    monitor-exit p0

    .line 77
    throw p1
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

.method public final declared-synchronized y(I)V
    .locals 2

    monitor-enter p0

    if-ltz p1, :cond_0

    :try_start_0
    iget v0, p0, Lz4/b0;->s:I

    add-int/2addr v0, p1

    iget v1, p0, Lz4/b0;->p:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    iget v0, p0, Lz4/b0;->s:I

    add-int/2addr v0, p1

    iput v0, p0, Lz4/b0;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method
