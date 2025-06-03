.class public final Lj4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# static fields
.field public static final u:Le0/d;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lv5/u;

.field public final d:Lx3/y$a;

.field public final e:Lc4/p;

.field public final f:Lc4/q;

.field public final g:Lc4/g;

.field public h:Lc4/j;

.field public i:Lc4/v;

.field public j:Lc4/v;

.field public k:I

.field public l:Lp4/a;

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:Lj4/e;

.field public r:Z

.field public s:Z

.field public t:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/d;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, Lj4/d;->u:Le0/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj4/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Lj4/d;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Lj4/d;->a:I

    iput-wide p2, p0, Lj4/d;->b:J

    new-instance p1, Lv5/u;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lv5/u;-><init>(I)V

    iput-object p1, p0, Lj4/d;->c:Lv5/u;

    new-instance p1, Lx3/y$a;

    invoke-direct {p1}, Lx3/y$a;-><init>()V

    iput-object p1, p0, Lj4/d;->d:Lx3/y$a;

    new-instance p1, Lc4/p;

    invoke-direct {p1}, Lc4/p;-><init>()V

    iput-object p1, p0, Lj4/d;->e:Lc4/p;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lj4/d;->m:J

    new-instance p1, Lc4/q;

    invoke-direct {p1}, Lc4/q;-><init>()V

    iput-object p1, p0, Lj4/d;->f:Lc4/q;

    new-instance p1, Lc4/g;

    invoke-direct {p1}, Lc4/g;-><init>()V

    iput-object p1, p0, Lj4/d;->g:Lc4/g;

    iput-object p1, p0, Lj4/d;->j:Lc4/v;

    return-void
.end method

.method public static c(Lp4/a;)J
    .locals 6

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lp4/a;->a:[Lp4/a$b;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lp4/a;->a:[Lp4/a$b;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    instance-of v4, v3, Lu4/l;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v3, Lu4/l;

    .line 19
    .line 20
    iget-object v4, v3, Lu4/h;->a:Ljava/lang/String;

    .line 21
    .line 22
    const-string v5, "TLEN"

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    iget-object p0, v3, Lu4/l;->c:Lo7/t;

    .line 31
    .line 32
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-static {v0, v1}, Lv5/e0;->I(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    return-wide v0

    .line 47
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    return-wide v0
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


# virtual methods
.method public final a(Lc4/i;Z)Lj4/a;
    .locals 9

    .line 1
    iget-object v0, p0, Lj4/d;->c:Lv5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lv5/u;->a:[B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-interface {p1, v0, v1, v2}, Lc4/i;->m([BII)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lj4/d;->c:Lv5/u;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lj4/d;->d:Lx3/y$a;

    .line 16
    .line 17
    iget-object v1, p0, Lj4/d;->c:Lv5/u;

    .line 18
    .line 19
    invoke-virtual {v1}, Lv5/u;->f()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lx3/y$a;->a(I)Z

    .line 24
    .line 25
    .line 26
    new-instance v0, Lj4/a;

    .line 27
    .line 28
    invoke-interface {p1}, Lc4/i;->getLength()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-interface {p1}, Lc4/i;->getPosition()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    iget-object v7, p0, Lj4/d;->d:Lx3/y$a;

    .line 37
    .line 38
    move-object v2, v0

    .line 39
    move v8, p2

    .line 40
    invoke-direct/range {v2 .. v8}, Lj4/a;-><init>(JJLx3/y$a;Z)V

    .line 41
    .line 42
    .line 43
    return-object v0
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

.method public final b(Lc4/j;)V
    .locals 2

    iput-object p1, p0, Lj4/d;->h:Lc4/j;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    move-result-object p1

    iput-object p1, p0, Lj4/d;->i:Lc4/v;

    iput-object p1, p0, Lj4/d;->j:Lc4/v;

    iget-object p1, p0, Lj4/d;->h:Lc4/j;

    invoke-interface {p1}, Lc4/j;->m()V

    return-void
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lj4/d;->i:Lc4/v;

    .line 6
    .line 7
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lv5/e0;->a:I

    .line 11
    .line 12
    iget v2, v0, Lj4/d;->k:I

    .line 13
    .line 14
    const-wide/32 v3, 0xf4240

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0, v1, v6}, Lj4/d;->g(Lc4/i;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-object v3, v0

    .line 25
    goto/16 :goto_20

    .line 26
    .line 27
    :cond_0
    :goto_0
    iget-object v2, v0, Lj4/d;->q:Lj4/e;

    .line 28
    .line 29
    const/4 v9, 0x1

    .line 30
    if-nez v2, :cond_29

    .line 31
    .line 32
    new-instance v2, Lv5/u;

    .line 33
    .line 34
    iget-object v10, v0, Lj4/d;->d:Lx3/y$a;

    .line 35
    .line 36
    iget v10, v10, Lx3/y$a;->c:I

    .line 37
    .line 38
    invoke-direct {v2, v10}, Lv5/u;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iget-object v10, v2, Lv5/u;->a:[B

    .line 42
    .line 43
    iget-object v11, v0, Lj4/d;->d:Lx3/y$a;

    .line 44
    .line 45
    iget v11, v11, Lx3/y$a;->c:I

    .line 46
    .line 47
    invoke-interface {v1, v10, v6, v11}, Lc4/i;->m([BII)V

    .line 48
    .line 49
    .line 50
    iget-object v10, v0, Lj4/d;->d:Lx3/y$a;

    .line 51
    .line 52
    iget v11, v10, Lx3/y$a;->a:I

    .line 53
    .line 54
    and-int/2addr v11, v9

    .line 55
    const/16 v12, 0x24

    .line 56
    .line 57
    const/16 v13, 0x15

    .line 58
    .line 59
    iget v10, v10, Lx3/y$a;->e:I

    .line 60
    .line 61
    if-eqz v11, :cond_1

    .line 62
    .line 63
    if-eq v10, v9, :cond_3

    .line 64
    .line 65
    move v13, v12

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    if-eq v10, v9, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/16 v13, 0xd

    .line 71
    .line 72
    :cond_3
    :goto_1
    iget v10, v2, Lv5/u;->c:I

    .line 73
    .line 74
    add-int/lit8 v11, v13, 0x4

    .line 75
    .line 76
    const v14, 0x56425249

    .line 77
    .line 78
    .line 79
    const v15, 0x58696e67

    .line 80
    .line 81
    .line 82
    const v7, 0x496e666f

    .line 83
    .line 84
    .line 85
    if-lt v10, v11, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2, v13}, Lv5/u;->G(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eq v8, v15, :cond_6

    .line 95
    .line 96
    if-ne v8, v7, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    iget v8, v2, Lv5/u;->c:I

    .line 100
    .line 101
    const/16 v10, 0x28

    .line 102
    .line 103
    if-lt v8, v10, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2, v12}, Lv5/u;->G(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-ne v8, v14, :cond_5

    .line 113
    .line 114
    move v8, v14

    .line 115
    goto :goto_2

    .line 116
    :cond_5
    move v8, v6

    .line 117
    :cond_6
    :goto_2
    const-string v10, ", "

    .line 118
    .line 119
    const/4 v5, 0x2

    .line 120
    if-eq v8, v15, :cond_11

    .line 121
    .line 122
    if-ne v8, v7, :cond_7

    .line 123
    .line 124
    goto/16 :goto_9

    .line 125
    .line 126
    :cond_7
    if-ne v8, v14, :cond_10

    .line 127
    .line 128
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 133
    .line 134
    .line 135
    move-result-wide v13

    .line 136
    iget-object v15, v0, Lj4/d;->d:Lx3/y$a;

    .line 137
    .line 138
    const/16 v12, 0xa

    .line 139
    .line 140
    invoke-virtual {v2, v12}, Lv5/u;->H(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-gtz v12, :cond_8

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_8
    iget v11, v15, Lx3/y$a;->d:I

    .line 151
    .line 152
    move-wide/from16 v26, v7

    .line 153
    .line 154
    int-to-long v6, v12

    .line 155
    const/16 v8, 0x7d00

    .line 156
    .line 157
    if-lt v11, v8, :cond_9

    .line 158
    .line 159
    const/16 v8, 0x480

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_9
    const/16 v8, 0x240

    .line 163
    .line 164
    :goto_3
    move-object/from16 v28, v10

    .line 165
    .line 166
    int-to-long v9, v8

    .line 167
    mul-long v21, v9, v3

    .line 168
    .line 169
    int-to-long v8, v11

    .line 170
    move-wide/from16 v19, v6

    .line 171
    .line 172
    move-wide/from16 v23, v8

    .line 173
    .line 174
    invoke-static/range {v19 .. v24}, Lv5/e0;->O(JJJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v32

    .line 178
    invoke-virtual {v2}, Lv5/u;->A()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    invoke-virtual {v2}, Lv5/u;->A()I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {v2}, Lv5/u;->A()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    invoke-virtual {v2, v5}, Lv5/u;->H(I)V

    .line 191
    .line 192
    .line 193
    iget v9, v15, Lx3/y$a;->c:I

    .line 194
    .line 195
    int-to-long v9, v9

    .line 196
    add-long/2addr v9, v13

    .line 197
    new-array v11, v6, [J

    .line 198
    .line 199
    new-array v15, v6, [J

    .line 200
    .line 201
    move-wide v3, v13

    .line 202
    const/4 v13, 0x0

    .line 203
    :goto_4
    if-ge v13, v6, :cond_e

    .line 204
    .line 205
    int-to-long v0, v13

    .line 206
    mul-long v0, v0, v32

    .line 207
    .line 208
    move v14, v7

    .line 209
    move/from16 v21, v8

    .line 210
    .line 211
    int-to-long v7, v6

    .line 212
    div-long/2addr v0, v7

    .line 213
    aput-wide v0, v11, v13

    .line 214
    .line 215
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    aput-wide v0, v15, v13

    .line 220
    .line 221
    move/from16 v0, v21

    .line 222
    .line 223
    const/4 v1, 0x1

    .line 224
    if-eq v0, v1, :cond_d

    .line 225
    .line 226
    if-eq v0, v5, :cond_c

    .line 227
    .line 228
    const/4 v1, 0x3

    .line 229
    if-eq v0, v1, :cond_b

    .line 230
    .line 231
    const/4 v1, 0x4

    .line 232
    if-eq v0, v1, :cond_a

    .line 233
    .line 234
    :goto_5
    const/4 v0, 0x0

    .line 235
    goto :goto_7

    .line 236
    :cond_a
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    goto :goto_6

    .line 241
    :cond_b
    invoke-virtual {v2}, Lv5/u;->x()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    goto :goto_6

    .line 246
    :cond_c
    invoke-virtual {v2}, Lv5/u;->A()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    goto :goto_6

    .line 251
    :cond_d
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    :goto_6
    int-to-long v7, v1

    .line 256
    move/from16 v21, v6

    .line 257
    .line 258
    move v1, v14

    .line 259
    int-to-long v5, v1

    .line 260
    mul-long/2addr v7, v5

    .line 261
    add-long/2addr v3, v7

    .line 262
    add-int/lit8 v13, v13, 0x1

    .line 263
    .line 264
    const/4 v5, 0x2

    .line 265
    move v8, v0

    .line 266
    move v7, v1

    .line 267
    move/from16 v6, v21

    .line 268
    .line 269
    move-object/from16 v0, p0

    .line 270
    .line 271
    move-object/from16 v1, p1

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_e
    const-wide/16 v5, -0x1

    .line 275
    .line 276
    cmp-long v0, v26, v5

    .line 277
    .line 278
    if-eqz v0, :cond_f

    .line 279
    .line 280
    cmp-long v0, v26, v3

    .line 281
    .line 282
    if-eqz v0, :cond_f

    .line 283
    .line 284
    new-instance v0, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    const-string v1, "VBRI data size mismatch: "

    .line 290
    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    move-wide/from16 v1, v26

    .line 295
    .line 296
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    move-object/from16 v1, v28

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v1, "VbriSeeker"

    .line 312
    .line 313
    invoke-static {v1, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_f
    new-instance v0, Lj4/f;

    .line 317
    .line 318
    move-object/from16 v29, v0

    .line 319
    .line 320
    move-object/from16 v30, v11

    .line 321
    .line 322
    move-object/from16 v31, v15

    .line 323
    .line 324
    move-wide/from16 v34, v3

    .line 325
    .line 326
    invoke-direct/range {v29 .. v35}, Lj4/f;-><init>([J[JJJ)V

    .line 327
    .line 328
    .line 329
    :goto_7
    move-object/from16 v3, p0

    .line 330
    .line 331
    iget-object v1, v3, Lj4/d;->d:Lx3/y$a;

    .line 332
    .line 333
    iget v1, v1, Lx3/y$a;->c:I

    .line 334
    .line 335
    move-object/from16 v4, p1

    .line 336
    .line 337
    invoke-interface {v4, v1}, Lc4/i;->j(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_10
    move-object v3, v0

    .line 342
    move-object v4, v1

    .line 343
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 344
    .line 345
    .line 346
    const/4 v0, 0x0

    .line 347
    :goto_8
    const-wide/16 v9, -0x1

    .line 348
    .line 349
    goto/16 :goto_11

    .line 350
    .line 351
    :cond_11
    :goto_9
    move-object v3, v0

    .line 352
    move-object v4, v1

    .line 353
    move-object v1, v10

    .line 354
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 355
    .line 356
    .line 357
    move-result-wide v5

    .line 358
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 359
    .line 360
    .line 361
    move-result-wide v27

    .line 362
    iget-object v0, v3, Lj4/d;->d:Lx3/y$a;

    .line 363
    .line 364
    iget v9, v0, Lx3/y$a;->g:I

    .line 365
    .line 366
    iget v10, v0, Lx3/y$a;->d:I

    .line 367
    .line 368
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    and-int/lit8 v15, v11, 0x1

    .line 373
    .line 374
    const/4 v12, 0x1

    .line 375
    if-ne v15, v12, :cond_16

    .line 376
    .line 377
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 378
    .line 379
    .line 380
    move-result v15

    .line 381
    if-nez v15, :cond_12

    .line 382
    .line 383
    goto/16 :goto_c

    .line 384
    .line 385
    :cond_12
    int-to-long v14, v15

    .line 386
    move/from16 v23, v8

    .line 387
    .line 388
    int-to-long v7, v9

    .line 389
    const-wide/32 v19, 0xf4240

    .line 390
    .line 391
    .line 392
    mul-long v31, v7, v19

    .line 393
    .line 394
    int-to-long v7, v10

    .line 395
    move-wide/from16 v29, v14

    .line 396
    .line 397
    move-wide/from16 v33, v7

    .line 398
    .line 399
    invoke-static/range {v29 .. v34}, Lv5/e0;->O(JJJ)J

    .line 400
    .line 401
    .line 402
    move-result-wide v30

    .line 403
    const/4 v7, 0x6

    .line 404
    and-int/lit8 v8, v11, 0x6

    .line 405
    .line 406
    if-eq v8, v7, :cond_13

    .line 407
    .line 408
    new-instance v1, Lj4/g;

    .line 409
    .line 410
    iget v0, v0, Lx3/y$a;->c:I

    .line 411
    .line 412
    const-wide/16 v32, -0x1

    .line 413
    .line 414
    const/16 v34, 0x0

    .line 415
    .line 416
    move-object/from16 v26, v1

    .line 417
    .line 418
    move/from16 v29, v0

    .line 419
    .line 420
    invoke-direct/range {v26 .. v34}, Lj4/g;-><init>(JIJJ[J)V

    .line 421
    .line 422
    .line 423
    const-wide/16 v9, -0x1

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_13
    invoke-virtual {v2}, Lv5/u;->w()J

    .line 427
    .line 428
    .line 429
    move-result-wide v32

    .line 430
    const/16 v7, 0x64

    .line 431
    .line 432
    new-array v8, v7, [J

    .line 433
    .line 434
    const/4 v9, 0x0

    .line 435
    :goto_a
    if-ge v9, v7, :cond_14

    .line 436
    .line 437
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    int-to-long v10, v10

    .line 442
    aput-wide v10, v8, v9

    .line 443
    .line 444
    add-int/lit8 v9, v9, 0x1

    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_14
    const-wide/16 v9, -0x1

    .line 448
    .line 449
    cmp-long v2, v5, v9

    .line 450
    .line 451
    if-eqz v2, :cond_15

    .line 452
    .line 453
    add-long v14, v27, v32

    .line 454
    .line 455
    cmp-long v2, v5, v14

    .line 456
    .line 457
    if-eqz v2, :cond_15

    .line 458
    .line 459
    new-instance v2, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    const-string v7, "XING data size mismatch: "

    .line 465
    .line 466
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    const-string v2, "XingSeeker"

    .line 483
    .line 484
    invoke-static {v2, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    :cond_15
    new-instance v1, Lj4/g;

    .line 488
    .line 489
    iget v0, v0, Lx3/y$a;->c:I

    .line 490
    .line 491
    move-object/from16 v26, v1

    .line 492
    .line 493
    move/from16 v29, v0

    .line 494
    .line 495
    move-object/from16 v34, v8

    .line 496
    .line 497
    invoke-direct/range {v26 .. v34}, Lj4/g;-><init>(JIJJ[J)V

    .line 498
    .line 499
    .line 500
    :goto_b
    move-object v0, v1

    .line 501
    goto :goto_d

    .line 502
    :cond_16
    :goto_c
    move/from16 v23, v8

    .line 503
    .line 504
    const-wide/16 v9, -0x1

    .line 505
    .line 506
    const/4 v0, 0x0

    .line 507
    :goto_d
    if-eqz v0, :cond_1a

    .line 508
    .line 509
    iget-object v1, v3, Lj4/d;->e:Lc4/p;

    .line 510
    .line 511
    iget v2, v1, Lc4/p;->a:I

    .line 512
    .line 513
    const/4 v5, -0x1

    .line 514
    if-eq v2, v5, :cond_17

    .line 515
    .line 516
    iget v1, v1, Lc4/p;->b:I

    .line 517
    .line 518
    if-eq v1, v5, :cond_17

    .line 519
    .line 520
    const/4 v1, 0x1

    .line 521
    goto :goto_e

    .line 522
    :cond_17
    const/4 v1, 0x0

    .line 523
    :goto_e
    if-nez v1, :cond_1a

    .line 524
    .line 525
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 526
    .line 527
    .line 528
    add-int/lit16 v13, v13, 0x8d

    .line 529
    .line 530
    invoke-interface {v4, v13}, Lc4/i;->e(I)V

    .line 531
    .line 532
    .line 533
    iget-object v1, v3, Lj4/d;->c:Lv5/u;

    .line 534
    .line 535
    iget-object v1, v1, Lv5/u;->a:[B

    .line 536
    .line 537
    const/4 v2, 0x3

    .line 538
    const/4 v5, 0x0

    .line 539
    invoke-interface {v4, v1, v5, v2}, Lc4/i;->m([BII)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v3, Lj4/d;->c:Lv5/u;

    .line 543
    .line 544
    invoke-virtual {v1, v5}, Lv5/u;->G(I)V

    .line 545
    .line 546
    .line 547
    iget-object v1, v3, Lj4/d;->e:Lc4/p;

    .line 548
    .line 549
    iget-object v2, v3, Lj4/d;->c:Lv5/u;

    .line 550
    .line 551
    invoke-virtual {v2}, Lv5/u;->x()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    shr-int/lit8 v5, v2, 0xc

    .line 556
    .line 557
    and-int/lit16 v2, v2, 0xfff

    .line 558
    .line 559
    if-gtz v5, :cond_19

    .line 560
    .line 561
    if-lez v2, :cond_18

    .line 562
    .line 563
    goto :goto_f

    .line 564
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    goto :goto_10

    .line 568
    :cond_19
    :goto_f
    iput v5, v1, Lc4/p;->a:I

    .line 569
    .line 570
    iput v2, v1, Lc4/p;->b:I

    .line 571
    .line 572
    :cond_1a
    :goto_10
    iget-object v1, v3, Lj4/d;->d:Lx3/y$a;

    .line 573
    .line 574
    iget v1, v1, Lx3/y$a;->c:I

    .line 575
    .line 576
    invoke-interface {v4, v1}, Lc4/i;->j(I)V

    .line 577
    .line 578
    .line 579
    if-eqz v0, :cond_1b

    .line 580
    .line 581
    invoke-virtual {v0}, Lj4/g;->e()Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-nez v1, :cond_1b

    .line 586
    .line 587
    move/from16 v14, v23

    .line 588
    .line 589
    const v1, 0x496e666f

    .line 590
    .line 591
    .line 592
    if-ne v14, v1, :cond_1b

    .line 593
    .line 594
    const/4 v1, 0x0

    .line 595
    invoke-virtual {v3, v4, v1}, Lj4/d;->a(Lc4/i;Z)Lj4/a;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    :cond_1b
    :goto_11
    iget-object v1, v3, Lj4/d;->l:Lp4/a;

    .line 600
    .line 601
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 602
    .line 603
    .line 604
    move-result-wide v5

    .line 605
    if-eqz v1, :cond_1e

    .line 606
    .line 607
    iget-object v2, v1, Lp4/a;->a:[Lp4/a$b;

    .line 608
    .line 609
    array-length v2, v2

    .line 610
    const/4 v7, 0x0

    .line 611
    :goto_12
    if-ge v7, v2, :cond_1e

    .line 612
    .line 613
    iget-object v8, v1, Lp4/a;->a:[Lp4/a$b;

    .line 614
    .line 615
    aget-object v8, v8, v7

    .line 616
    .line 617
    instance-of v11, v8, Lu4/j;

    .line 618
    .line 619
    if-eqz v11, :cond_1d

    .line 620
    .line 621
    check-cast v8, Lu4/j;

    .line 622
    .line 623
    invoke-static {v1}, Lj4/d;->c(Lp4/a;)J

    .line 624
    .line 625
    .line 626
    move-result-wide v1

    .line 627
    iget-object v7, v8, Lu4/j;->e:[I

    .line 628
    .line 629
    array-length v7, v7

    .line 630
    add-int/lit8 v11, v7, 0x1

    .line 631
    .line 632
    new-array v13, v11, [J

    .line 633
    .line 634
    new-array v11, v11, [J

    .line 635
    .line 636
    const/4 v14, 0x0

    .line 637
    aput-wide v5, v13, v14

    .line 638
    .line 639
    const-wide/16 v15, 0x0

    .line 640
    .line 641
    aput-wide v15, v11, v14

    .line 642
    .line 643
    const/4 v14, 0x1

    .line 644
    const-wide/16 v17, 0x0

    .line 645
    .line 646
    :goto_13
    if-gt v14, v7, :cond_1c

    .line 647
    .line 648
    iget v15, v8, Lu4/j;->c:I

    .line 649
    .line 650
    iget-object v9, v8, Lu4/j;->e:[I

    .line 651
    .line 652
    add-int/lit8 v10, v14, -0x1

    .line 653
    .line 654
    aget v9, v9, v10

    .line 655
    .line 656
    add-int/2addr v15, v9

    .line 657
    move-object/from16 v24, v13

    .line 658
    .line 659
    int-to-long v12, v15

    .line 660
    add-long/2addr v5, v12

    .line 661
    iget v12, v8, Lu4/j;->d:I

    .line 662
    .line 663
    iget-object v13, v8, Lu4/j;->f:[I

    .line 664
    .line 665
    aget v10, v13, v10

    .line 666
    .line 667
    add-int/2addr v12, v10

    .line 668
    int-to-long v12, v12

    .line 669
    add-long v17, v17, v12

    .line 670
    .line 671
    aput-wide v5, v24, v14

    .line 672
    .line 673
    aput-wide v17, v11, v14

    .line 674
    .line 675
    add-int/lit8 v14, v14, 0x1

    .line 676
    .line 677
    move-object/from16 v13, v24

    .line 678
    .line 679
    const-wide/16 v9, -0x1

    .line 680
    .line 681
    goto :goto_13

    .line 682
    :cond_1c
    move-object/from16 v24, v13

    .line 683
    .line 684
    new-instance v5, Lj4/c;

    .line 685
    .line 686
    move-object/from16 v6, v24

    .line 687
    .line 688
    invoke-direct {v5, v6, v11, v1, v2}, Lj4/c;-><init>([J[JJ)V

    .line 689
    .line 690
    .line 691
    goto :goto_14

    .line 692
    :cond_1d
    add-int/lit8 v7, v7, 0x1

    .line 693
    .line 694
    const-wide/16 v9, -0x1

    .line 695
    .line 696
    goto :goto_12

    .line 697
    :cond_1e
    const/4 v5, 0x0

    .line 698
    :goto_14
    iget-boolean v1, v3, Lj4/d;->r:Z

    .line 699
    .line 700
    if-eqz v1, :cond_1f

    .line 701
    .line 702
    new-instance v0, Lj4/e$a;

    .line 703
    .line 704
    invoke-direct {v0}, Lj4/e$a;-><init>()V

    .line 705
    .line 706
    .line 707
    goto :goto_19

    .line 708
    :cond_1f
    iget v1, v3, Lj4/d;->a:I

    .line 709
    .line 710
    const/4 v2, 0x4

    .line 711
    and-int/2addr v1, v2

    .line 712
    if-eqz v1, :cond_22

    .line 713
    .line 714
    if-eqz v5, :cond_20

    .line 715
    .line 716
    iget-wide v0, v5, Lj4/c;->c:J

    .line 717
    .line 718
    goto :goto_15

    .line 719
    :cond_20
    if-eqz v0, :cond_21

    .line 720
    .line 721
    invoke-interface {v0}, Lc4/t;->h()J

    .line 722
    .line 723
    .line 724
    move-result-wide v1

    .line 725
    invoke-interface {v0}, Lj4/e;->c()J

    .line 726
    .line 727
    .line 728
    move-result-wide v11

    .line 729
    move-wide/from16 v25, v1

    .line 730
    .line 731
    move-wide/from16 v29, v11

    .line 732
    .line 733
    goto :goto_16

    .line 734
    :cond_21
    iget-object v0, v3, Lj4/d;->l:Lp4/a;

    .line 735
    .line 736
    invoke-static {v0}, Lj4/d;->c(Lp4/a;)J

    .line 737
    .line 738
    .line 739
    move-result-wide v0

    .line 740
    :goto_15
    move-wide/from16 v25, v0

    .line 741
    .line 742
    const-wide/16 v29, -0x1

    .line 743
    .line 744
    :goto_16
    new-instance v0, Lj4/b;

    .line 745
    .line 746
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 747
    .line 748
    .line 749
    move-result-wide v27

    .line 750
    move-object/from16 v24, v0

    .line 751
    .line 752
    invoke-direct/range {v24 .. v30}, Lj4/b;-><init>(JJJ)V

    .line 753
    .line 754
    .line 755
    goto :goto_17

    .line 756
    :cond_22
    if-eqz v5, :cond_23

    .line 757
    .line 758
    move-object v0, v5

    .line 759
    goto :goto_17

    .line 760
    :cond_23
    if-eqz v0, :cond_24

    .line 761
    .line 762
    goto :goto_17

    .line 763
    :cond_24
    const/4 v0, 0x0

    .line 764
    :goto_17
    if-eqz v0, :cond_25

    .line 765
    .line 766
    invoke-interface {v0}, Lc4/t;->e()Z

    .line 767
    .line 768
    .line 769
    move-result v1

    .line 770
    if-nez v1, :cond_27

    .line 771
    .line 772
    iget v1, v3, Lj4/d;->a:I

    .line 773
    .line 774
    const/4 v2, 0x1

    .line 775
    and-int/2addr v1, v2

    .line 776
    if-eqz v1, :cond_27

    .line 777
    .line 778
    :cond_25
    iget v0, v3, Lj4/d;->a:I

    .line 779
    .line 780
    const/4 v1, 0x2

    .line 781
    and-int/2addr v0, v1

    .line 782
    if-eqz v0, :cond_26

    .line 783
    .line 784
    const/4 v0, 0x1

    .line 785
    goto :goto_18

    .line 786
    :cond_26
    const/4 v0, 0x0

    .line 787
    :goto_18
    invoke-virtual {v3, v4, v0}, Lj4/d;->a(Lc4/i;Z)Lj4/a;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    :cond_27
    :goto_19
    iput-object v0, v3, Lj4/d;->q:Lj4/e;

    .line 792
    .line 793
    iget-object v1, v3, Lj4/d;->h:Lc4/j;

    .line 794
    .line 795
    invoke-interface {v1, v0}, Lc4/j;->t(Lc4/t;)V

    .line 796
    .line 797
    .line 798
    iget-object v0, v3, Lj4/d;->j:Lc4/v;

    .line 799
    .line 800
    new-instance v1, Lv3/i0$a;

    .line 801
    .line 802
    invoke-direct {v1}, Lv3/i0$a;-><init>()V

    .line 803
    .line 804
    .line 805
    iget-object v2, v3, Lj4/d;->d:Lx3/y$a;

    .line 806
    .line 807
    iget-object v5, v2, Lx3/y$a;->b:Ljava/lang/String;

    .line 808
    .line 809
    iput-object v5, v1, Lv3/i0$a;->k:Ljava/lang/String;

    .line 810
    .line 811
    const/16 v5, 0x1000

    .line 812
    .line 813
    iput v5, v1, Lv3/i0$a;->l:I

    .line 814
    .line 815
    iget v5, v2, Lx3/y$a;->e:I

    .line 816
    .line 817
    iput v5, v1, Lv3/i0$a;->x:I

    .line 818
    .line 819
    iget v2, v2, Lx3/y$a;->d:I

    .line 820
    .line 821
    iput v2, v1, Lv3/i0$a;->y:I

    .line 822
    .line 823
    iget-object v2, v3, Lj4/d;->e:Lc4/p;

    .line 824
    .line 825
    iget v5, v2, Lc4/p;->a:I

    .line 826
    .line 827
    iput v5, v1, Lv3/i0$a;->A:I

    .line 828
    .line 829
    iget v2, v2, Lc4/p;->b:I

    .line 830
    .line 831
    iput v2, v1, Lv3/i0$a;->B:I

    .line 832
    .line 833
    iget v2, v3, Lj4/d;->a:I

    .line 834
    .line 835
    and-int/lit8 v2, v2, 0x8

    .line 836
    .line 837
    if-eqz v2, :cond_28

    .line 838
    .line 839
    const/4 v2, 0x0

    .line 840
    goto :goto_1a

    .line 841
    :cond_28
    iget-object v2, v3, Lj4/d;->l:Lp4/a;

    .line 842
    .line 843
    :goto_1a
    iput-object v2, v1, Lv3/i0$a;->i:Lp4/a;

    .line 844
    .line 845
    new-instance v2, Lv3/i0;

    .line 846
    .line 847
    invoke-direct {v2, v1}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v0, v2}, Lc4/v;->d(Lv3/i0;)V

    .line 851
    .line 852
    .line 853
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 854
    .line 855
    .line 856
    move-result-wide v0

    .line 857
    iput-wide v0, v3, Lj4/d;->o:J

    .line 858
    .line 859
    goto :goto_1b

    .line 860
    :cond_29
    move-object v3, v0

    .line 861
    move-object v4, v1

    .line 862
    iget-wide v0, v3, Lj4/d;->o:J

    .line 863
    .line 864
    const-wide/16 v5, 0x0

    .line 865
    .line 866
    cmp-long v0, v0, v5

    .line 867
    .line 868
    if-eqz v0, :cond_2a

    .line 869
    .line 870
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 871
    .line 872
    .line 873
    move-result-wide v0

    .line 874
    iget-wide v5, v3, Lj4/d;->o:J

    .line 875
    .line 876
    cmp-long v2, v0, v5

    .line 877
    .line 878
    if-gez v2, :cond_2a

    .line 879
    .line 880
    sub-long/2addr v5, v0

    .line 881
    long-to-int v0, v5

    .line 882
    invoke-interface {v4, v0}, Lc4/i;->j(I)V

    .line 883
    .line 884
    .line 885
    :cond_2a
    :goto_1b
    iget v0, v3, Lj4/d;->p:I

    .line 886
    .line 887
    if-nez v0, :cond_31

    .line 888
    .line 889
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {p0 .. p1}, Lj4/d;->e(Lc4/i;)Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    if-eqz v0, :cond_2b

    .line 897
    .line 898
    goto/16 :goto_20

    .line 899
    .line 900
    :cond_2b
    iget-object v0, v3, Lj4/d;->c:Lv5/u;

    .line 901
    .line 902
    const/4 v1, 0x0

    .line 903
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 904
    .line 905
    .line 906
    iget-object v0, v3, Lj4/d;->c:Lv5/u;

    .line 907
    .line 908
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 909
    .line 910
    .line 911
    move-result v0

    .line 912
    iget v1, v3, Lj4/d;->k:I

    .line 913
    .line 914
    int-to-long v1, v1

    .line 915
    const v5, -0x1f400

    .line 916
    .line 917
    .line 918
    and-int/2addr v5, v0

    .line 919
    int-to-long v5, v5

    .line 920
    const-wide/32 v7, -0x1f400

    .line 921
    .line 922
    .line 923
    and-long/2addr v1, v7

    .line 924
    cmp-long v1, v5, v1

    .line 925
    .line 926
    if-nez v1, :cond_2c

    .line 927
    .line 928
    const/4 v1, 0x1

    .line 929
    goto :goto_1c

    .line 930
    :cond_2c
    const/4 v1, 0x0

    .line 931
    :goto_1c
    if-eqz v1, :cond_30

    .line 932
    .line 933
    invoke-static {v0}, Lx3/y;->a(I)I

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    const/4 v2, -0x1

    .line 938
    if-ne v1, v2, :cond_2d

    .line 939
    .line 940
    goto/16 :goto_1e

    .line 941
    .line 942
    :cond_2d
    iget-object v1, v3, Lj4/d;->d:Lx3/y$a;

    .line 943
    .line 944
    invoke-virtual {v1, v0}, Lx3/y$a;->a(I)Z

    .line 945
    .line 946
    .line 947
    iget-wide v0, v3, Lj4/d;->m:J

    .line 948
    .line 949
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    cmp-long v0, v0, v5

    .line 955
    .line 956
    if-nez v0, :cond_2e

    .line 957
    .line 958
    iget-object v0, v3, Lj4/d;->q:Lj4/e;

    .line 959
    .line 960
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 961
    .line 962
    .line 963
    move-result-wide v1

    .line 964
    invoke-interface {v0, v1, v2}, Lj4/e;->a(J)J

    .line 965
    .line 966
    .line 967
    move-result-wide v0

    .line 968
    iput-wide v0, v3, Lj4/d;->m:J

    .line 969
    .line 970
    iget-wide v0, v3, Lj4/d;->b:J

    .line 971
    .line 972
    cmp-long v0, v0, v5

    .line 973
    .line 974
    if-eqz v0, :cond_2e

    .line 975
    .line 976
    iget-object v0, v3, Lj4/d;->q:Lj4/e;

    .line 977
    .line 978
    const-wide/16 v1, 0x0

    .line 979
    .line 980
    invoke-interface {v0, v1, v2}, Lj4/e;->a(J)J

    .line 981
    .line 982
    .line 983
    move-result-wide v0

    .line 984
    iget-wide v5, v3, Lj4/d;->m:J

    .line 985
    .line 986
    iget-wide v7, v3, Lj4/d;->b:J

    .line 987
    .line 988
    sub-long/2addr v7, v0

    .line 989
    add-long/2addr v7, v5

    .line 990
    iput-wide v7, v3, Lj4/d;->m:J

    .line 991
    .line 992
    :cond_2e
    iget-object v0, v3, Lj4/d;->d:Lx3/y$a;

    .line 993
    .line 994
    iget v1, v0, Lx3/y$a;->c:I

    .line 995
    .line 996
    iput v1, v3, Lj4/d;->p:I

    .line 997
    .line 998
    iget-object v1, v3, Lj4/d;->q:Lj4/e;

    .line 999
    .line 1000
    instance-of v2, v1, Lj4/b;

    .line 1001
    .line 1002
    if-eqz v2, :cond_31

    .line 1003
    .line 1004
    check-cast v1, Lj4/b;

    .line 1005
    .line 1006
    iget-wide v5, v3, Lj4/d;->n:J

    .line 1007
    .line 1008
    iget v2, v0, Lx3/y$a;->g:I

    .line 1009
    .line 1010
    int-to-long v7, v2

    .line 1011
    add-long/2addr v5, v7

    .line 1012
    iget-wide v7, v3, Lj4/d;->m:J

    .line 1013
    .line 1014
    const-wide/32 v9, 0xf4240

    .line 1015
    .line 1016
    .line 1017
    mul-long/2addr v5, v9

    .line 1018
    iget v0, v0, Lx3/y$a;->d:I

    .line 1019
    .line 1020
    int-to-long v9, v0

    .line 1021
    div-long/2addr v5, v9

    .line 1022
    add-long/2addr v5, v7

    .line 1023
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v7

    .line 1027
    iget-object v0, v3, Lj4/d;->d:Lx3/y$a;

    .line 1028
    .line 1029
    iget v0, v0, Lx3/y$a;->c:I

    .line 1030
    .line 1031
    int-to-long v9, v0

    .line 1032
    add-long/2addr v7, v9

    .line 1033
    invoke-virtual {v1, v5, v6}, Lj4/b;->b(J)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    if-eqz v0, :cond_2f

    .line 1038
    .line 1039
    goto :goto_1d

    .line 1040
    :cond_2f
    iget-object v0, v1, Lj4/b;->b:Lv5/n;

    .line 1041
    .line 1042
    invoke-virtual {v0, v5, v6}, Lv5/n;->a(J)V

    .line 1043
    .line 1044
    .line 1045
    iget-object v0, v1, Lj4/b;->c:Lv5/n;

    .line 1046
    .line 1047
    invoke-virtual {v0, v7, v8}, Lv5/n;->a(J)V

    .line 1048
    .line 1049
    .line 1050
    :goto_1d
    iget-boolean v0, v3, Lj4/d;->s:Z

    .line 1051
    .line 1052
    if-eqz v0, :cond_31

    .line 1053
    .line 1054
    iget-wide v5, v3, Lj4/d;->t:J

    .line 1055
    .line 1056
    invoke-virtual {v1, v5, v6}, Lj4/b;->b(J)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    if-eqz v0, :cond_31

    .line 1061
    .line 1062
    const/4 v0, 0x0

    .line 1063
    iput-boolean v0, v3, Lj4/d;->s:Z

    .line 1064
    .line 1065
    iget-object v1, v3, Lj4/d;->i:Lc4/v;

    .line 1066
    .line 1067
    iput-object v1, v3, Lj4/d;->j:Lc4/v;

    .line 1068
    .line 1069
    goto :goto_1f

    .line 1070
    :cond_30
    :goto_1e
    const/4 v0, 0x0

    .line 1071
    const/4 v1, 0x1

    .line 1072
    invoke-interface {v4, v1}, Lc4/i;->j(I)V

    .line 1073
    .line 1074
    .line 1075
    iput v0, v3, Lj4/d;->k:I

    .line 1076
    .line 1077
    goto :goto_21

    .line 1078
    :cond_31
    :goto_1f
    const/4 v1, 0x1

    .line 1079
    iget-object v0, v3, Lj4/d;->j:Lc4/v;

    .line 1080
    .line 1081
    iget v2, v3, Lj4/d;->p:I

    .line 1082
    .line 1083
    invoke-interface {v0, v4, v2, v1}, Lc4/v;->e(Lt5/h;IZ)I

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    const/4 v1, -0x1

    .line 1088
    if-ne v0, v1, :cond_32

    .line 1089
    .line 1090
    :goto_20
    const/4 v0, -0x1

    .line 1091
    const/4 v6, -0x1

    .line 1092
    goto :goto_22

    .line 1093
    :cond_32
    iget v1, v3, Lj4/d;->p:I

    .line 1094
    .line 1095
    sub-int/2addr v1, v0

    .line 1096
    iput v1, v3, Lj4/d;->p:I

    .line 1097
    .line 1098
    if-lez v1, :cond_33

    .line 1099
    .line 1100
    :goto_21
    const/4 v0, -0x1

    .line 1101
    const/4 v6, 0x0

    .line 1102
    goto :goto_22

    .line 1103
    :cond_33
    iget-object v4, v3, Lj4/d;->j:Lc4/v;

    .line 1104
    .line 1105
    iget-wide v0, v3, Lj4/d;->n:J

    .line 1106
    .line 1107
    iget-wide v5, v3, Lj4/d;->m:J

    .line 1108
    .line 1109
    const-wide/32 v7, 0xf4240

    .line 1110
    .line 1111
    .line 1112
    mul-long/2addr v0, v7

    .line 1113
    iget-object v2, v3, Lj4/d;->d:Lx3/y$a;

    .line 1114
    .line 1115
    iget v7, v2, Lx3/y$a;->d:I

    .line 1116
    .line 1117
    int-to-long v7, v7

    .line 1118
    div-long/2addr v0, v7

    .line 1119
    add-long/2addr v5, v0

    .line 1120
    const/4 v7, 0x1

    .line 1121
    iget v8, v2, Lx3/y$a;->c:I

    .line 1122
    .line 1123
    const/4 v9, 0x0

    .line 1124
    const/4 v10, 0x0

    .line 1125
    invoke-interface/range {v4 .. v10}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 1126
    .line 1127
    .line 1128
    iget-wide v0, v3, Lj4/d;->n:J

    .line 1129
    .line 1130
    iget-object v2, v3, Lj4/d;->d:Lx3/y$a;

    .line 1131
    .line 1132
    iget v2, v2, Lx3/y$a;->g:I

    .line 1133
    .line 1134
    int-to-long v4, v2

    .line 1135
    add-long/2addr v0, v4

    .line 1136
    iput-wide v0, v3, Lj4/d;->n:J

    .line 1137
    .line 1138
    const/4 v0, 0x0

    .line 1139
    iput v0, v3, Lj4/d;->p:I

    .line 1140
    .line 1141
    move v6, v0

    .line 1142
    const/4 v0, -0x1

    .line 1143
    :goto_22
    if-ne v6, v0, :cond_34

    .line 1144
    .line 1145
    iget-object v0, v3, Lj4/d;->q:Lj4/e;

    .line 1146
    .line 1147
    instance-of v1, v0, Lj4/b;

    .line 1148
    .line 1149
    if-eqz v1, :cond_34

    .line 1150
    .line 1151
    iget-wide v1, v3, Lj4/d;->n:J

    .line 1152
    .line 1153
    iget-wide v4, v3, Lj4/d;->m:J

    .line 1154
    .line 1155
    const-wide/32 v7, 0xf4240

    .line 1156
    .line 1157
    .line 1158
    mul-long/2addr v1, v7

    .line 1159
    iget-object v7, v3, Lj4/d;->d:Lx3/y$a;

    .line 1160
    .line 1161
    iget v7, v7, Lx3/y$a;->d:I

    .line 1162
    .line 1163
    int-to-long v7, v7

    .line 1164
    div-long/2addr v1, v7

    .line 1165
    add-long/2addr v1, v4

    .line 1166
    invoke-interface {v0}, Lc4/t;->h()J

    .line 1167
    .line 1168
    .line 1169
    move-result-wide v4

    .line 1170
    cmp-long v0, v4, v1

    .line 1171
    .line 1172
    if-eqz v0, :cond_34

    .line 1173
    .line 1174
    iget-object v0, v3, Lj4/d;->q:Lj4/e;

    .line 1175
    .line 1176
    move-object v4, v0

    .line 1177
    check-cast v4, Lj4/b;

    .line 1178
    .line 1179
    iput-wide v1, v4, Lj4/b;->d:J

    .line 1180
    .line 1181
    iget-object v1, v3, Lj4/d;->h:Lc4/j;

    .line 1182
    .line 1183
    invoke-interface {v1, v0}, Lc4/j;->t(Lc4/t;)V

    .line 1184
    .line 1185
    .line 1186
    :cond_34
    return v6
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

.method public final e(Lc4/i;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lj4/d;->q:Lj4/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lj4/e;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lc4/i;->d()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x4

    .line 21
    .line 22
    sub-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, Lj4/d;->c:Lv5/u;

    .line 29
    .line 30
    iget-object v0, v0, Lv5/u;->a:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-interface {p1, v0, v2, v3, v1}, Lc4/i;->c([BIIZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    xor-int/2addr p1, v1

    .line 39
    return p1

    .line 40
    :catch_0
    return v1
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

.method public final f(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Lj4/d;->k:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj4/d;->m:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lj4/d;->n:J

    iput p1, p0, Lj4/d;->p:I

    iput-wide p3, p0, Lj4/d;->t:J

    iget-object p1, p0, Lj4/d;->q:Lj4/e;

    instance-of p2, p1, Lj4/b;

    if-eqz p2, :cond_0

    check-cast p1, Lj4/b;

    invoke-virtual {p1, p3, p4}, Lj4/b;->b(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj4/d;->s:Z

    iget-object p1, p0, Lj4/d;->g:Lc4/g;

    iput-object p1, p0, Lj4/d;->j:Lc4/v;

    :cond_0
    return-void
.end method

.method public final g(Lc4/i;Z)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz p2, :cond_0

    const v2, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v2, 0x20000

    :goto_0
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v3, :cond_4

    iget v3, v0, Lj4/d;->a:I

    and-int/lit8 v3, v3, 0x8

    if-nez v3, :cond_1

    move v3, v6

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    sget-object v3, Lj4/d;->u:Le0/d;

    :goto_2
    iget-object v7, v0, Lj4/d;->f:Lc4/q;

    invoke-virtual {v7, v1, v3}, Lc4/q;->a(Lc4/i;Lu4/g$a;)Lp4/a;

    move-result-object v3

    iput-object v3, v0, Lj4/d;->l:Lp4/a;

    if-eqz v3, :cond_3

    iget-object v7, v0, Lj4/d;->e:Lc4/p;

    invoke-virtual {v7, v3}, Lc4/p;->b(Lp4/a;)V

    :cond_3
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    move-result-wide v7

    long-to-int v3, v7

    if-nez p2, :cond_5

    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    goto :goto_3

    :cond_4
    move v3, v5

    :cond_5
    :goto_3
    move v7, v5

    move v8, v7

    move v9, v8

    :goto_4
    invoke-virtual/range {p0 .. p1}, Lj4/d;->e(Lc4/i;)Z

    move-result v10

    if-eqz v10, :cond_7

    if-lez v8, :cond_6

    goto :goto_7

    :cond_6
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_7
    iget-object v10, v0, Lj4/d;->c:Lv5/u;

    invoke-virtual {v10, v5}, Lv5/u;->G(I)V

    iget-object v10, v0, Lj4/d;->c:Lv5/u;

    invoke-virtual {v10}, Lv5/u;->f()I

    move-result v10

    if-eqz v7, :cond_9

    int-to-long v11, v7

    const v13, -0x1f400

    and-int/2addr v13, v10

    int-to-long v13, v13

    const-wide/32 v15, -0x1f400

    and-long/2addr v11, v15

    cmp-long v11, v13, v11

    if-nez v11, :cond_8

    move v11, v6

    goto :goto_5

    :cond_8
    move v11, v5

    :goto_5
    if-eqz v11, :cond_a

    :cond_9
    invoke-static {v10}, Lx3/y;->a(I)I

    move-result v11

    const/4 v12, -0x1

    if-ne v11, v12, :cond_e

    :cond_a
    add-int/lit8 v7, v9, 0x1

    if-ne v9, v2, :cond_c

    if-eqz p2, :cond_b

    return v5

    :cond_b
    const-string v1, "Searched too many bytes."

    invoke-static {v1, v4}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object v1

    throw v1

    :cond_c
    if-eqz p2, :cond_d

    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    add-int v8, v3, v7

    invoke-interface {v1, v8}, Lc4/i;->e(I)V

    goto :goto_6

    :cond_d
    invoke-interface {v1, v6}, Lc4/i;->j(I)V

    :goto_6
    move v8, v5

    move v9, v7

    move v7, v8

    goto :goto_4

    :cond_e
    add-int/lit8 v8, v8, 0x1

    if-ne v8, v6, :cond_f

    iget-object v7, v0, Lj4/d;->d:Lx3/y$a;

    invoke-virtual {v7, v10}, Lx3/y$a;->a(I)Z

    move v7, v10

    goto :goto_9

    :cond_f
    const/4 v10, 0x4

    if-ne v8, v10, :cond_11

    :goto_7
    if-eqz p2, :cond_10

    add-int/2addr v3, v9

    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    goto :goto_8

    :cond_10
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    :goto_8
    iput v7, v0, Lj4/d;->k:I

    return v6

    :cond_11
    :goto_9
    add-int/lit8 v11, v11, -0x4

    invoke-interface {v1, v11}, Lc4/i;->e(I)V

    goto :goto_4
.end method

.method public final i(Lc4/i;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj4/d;->g(Lc4/i;Z)Z

    move-result p1

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
