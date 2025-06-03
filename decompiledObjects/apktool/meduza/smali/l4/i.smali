.class public final Ll4/i;
.super Ll4/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll4/i$a;
    }
.end annotation


# instance fields
.field public n:Ll4/i$a;

.field public o:I

.field public p:Z

.field public q:Lc4/y$c;

.field public r:Lc4/y$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll4/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Ll4/h;->g:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long p1, p1, v0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p1, p2

    .line 13
    :goto_0
    iput-boolean p1, p0, Ll4/i;->p:Z

    .line 14
    .line 15
    iget-object p1, p0, Ll4/i;->q:Lc4/y$c;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p2, p1, Lc4/y$c;->e:I

    .line 20
    .line 21
    :cond_1
    iput p2, p0, Ll4/i;->o:I

    .line 22
    .line 23
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
.end method

.method public final b(Lv5/u;)J
    .locals 11

    .line 1
    iget-object v0, p1, Lv5/u;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v0, v0, v1

    .line 5
    .line 6
    and-int/lit8 v2, v0, 0x1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v2, p0, Ll4/i;->n:Ll4/i$a;

    .line 15
    .line 16
    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget v4, v2, Ll4/i$a;->e:I

    .line 20
    .line 21
    shr-int/2addr v0, v3

    .line 22
    const/16 v5, 0x8

    .line 23
    .line 24
    rsub-int/lit8 v4, v4, 0x8

    .line 25
    .line 26
    const/16 v6, 0xff

    .line 27
    .line 28
    ushr-int v4, v6, v4

    .line 29
    .line 30
    and-int/2addr v0, v4

    .line 31
    iget-object v4, v2, Ll4/i$a;->d:[Lc4/y$b;

    .line 32
    .line 33
    aget-object v0, v4, v0

    .line 34
    .line 35
    iget-boolean v0, v0, Lc4/y$b;->a:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v2, Ll4/i$a;->a:Lc4/y$c;

    .line 40
    .line 41
    iget v0, v0, Lc4/y$c;->e:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, v2, Ll4/i$a;->a:Lc4/y$c;

    .line 45
    .line 46
    iget v0, v0, Lc4/y$c;->f:I

    .line 47
    .line 48
    :goto_0
    iget-boolean v2, p0, Ll4/i;->p:Z

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget v1, p0, Ll4/i;->o:I

    .line 53
    .line 54
    add-int/2addr v1, v0

    .line 55
    div-int/lit8 v1, v1, 0x4

    .line 56
    .line 57
    :cond_2
    int-to-long v1, v1

    .line 58
    iget-object v4, p1, Lv5/u;->a:[B

    .line 59
    .line 60
    array-length v6, v4

    .line 61
    iget v7, p1, Lv5/u;->c:I

    .line 62
    .line 63
    add-int/lit8 v7, v7, 0x4

    .line 64
    .line 65
    if-ge v6, v7, :cond_3

    .line 66
    .line 67
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    array-length v6, v4

    .line 72
    invoke-virtual {p1, v4, v6}, Lv5/u;->E([BI)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {p1, v7}, Lv5/u;->F(I)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v4, p1, Lv5/u;->a:[B

    .line 80
    .line 81
    iget p1, p1, Lv5/u;->c:I

    .line 82
    .line 83
    add-int/lit8 v6, p1, -0x4

    .line 84
    .line 85
    const-wide/16 v7, 0xff

    .line 86
    .line 87
    and-long v9, v1, v7

    .line 88
    .line 89
    long-to-int v9, v9

    .line 90
    int-to-byte v9, v9

    .line 91
    aput-byte v9, v4, v6

    .line 92
    .line 93
    add-int/lit8 v6, p1, -0x3

    .line 94
    .line 95
    ushr-long v9, v1, v5

    .line 96
    .line 97
    and-long/2addr v9, v7

    .line 98
    long-to-int v5, v9

    .line 99
    int-to-byte v5, v5

    .line 100
    aput-byte v5, v4, v6

    .line 101
    .line 102
    add-int/lit8 v5, p1, -0x2

    .line 103
    .line 104
    const/16 v6, 0x10

    .line 105
    .line 106
    ushr-long v9, v1, v6

    .line 107
    .line 108
    and-long/2addr v9, v7

    .line 109
    long-to-int v6, v9

    .line 110
    int-to-byte v6, v6

    .line 111
    aput-byte v6, v4, v5

    .line 112
    .line 113
    add-int/lit8 p1, p1, -0x1

    .line 114
    .line 115
    const/16 v5, 0x18

    .line 116
    .line 117
    ushr-long v5, v1, v5

    .line 118
    .line 119
    and-long/2addr v5, v7

    .line 120
    long-to-int v5, v5

    .line 121
    int-to-byte v5, v5

    .line 122
    aput-byte v5, v4, p1

    .line 123
    .line 124
    iput-boolean v3, p0, Ll4/i;->p:Z

    .line 125
    .line 126
    iput v0, p0, Ll4/i;->o:I

    .line 127
    .line 128
    return-wide v1
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

.method public final c(Lv5/u;JLl4/h$a;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Ll4/i;->n:Ll4/i$a;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v1, v2, Ll4/h$a;->a:Lv3/i0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return v4

    .line 18
    :cond_0
    iget-object v6, v0, Ll4/i;->q:Lc4/y$c;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v6, :cond_3

    .line 22
    .line 23
    invoke-static {v3, v1, v4}, Lc4/y;->c(ILv5/u;Z)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p1 .. p1}, Lv5/u;->m()I

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-virtual/range {p1 .. p1}, Lv5/u;->m()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-gtz v3, :cond_1

    .line 42
    .line 43
    const/4 v3, -0x1

    .line 44
    :cond_1
    move v10, v3

    .line 45
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-gtz v3, :cond_2

    .line 50
    .line 51
    const/4 v3, -0x1

    .line 52
    :cond_2
    move v11, v3

    .line 53
    invoke-virtual/range {p1 .. p1}, Lv5/u;->i()I

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    and-int/lit8 v4, v3, 0xf

    .line 61
    .line 62
    int-to-double v4, v4

    .line 63
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 64
    .line 65
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    double-to-int v12, v4

    .line 70
    and-int/lit16 v3, v3, 0xf0

    .line 71
    .line 72
    shr-int/lit8 v3, v3, 0x4

    .line 73
    .line 74
    int-to-double v3, v3

    .line 75
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    double-to-int v13, v3

    .line 80
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 81
    .line 82
    .line 83
    iget-object v3, v1, Lv5/u;->a:[B

    .line 84
    .line 85
    iget v1, v1, Lv5/u;->c:I

    .line 86
    .line 87
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    new-instance v1, Lc4/y$c;

    .line 92
    .line 93
    move-object v7, v1

    .line 94
    invoke-direct/range {v7 .. v14}, Lc4/y$c;-><init>(IIIIII[B)V

    .line 95
    .line 96
    .line 97
    iput-object v1, v0, Ll4/i;->q:Lc4/y$c;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iget-object v7, v0, Ll4/i;->r:Lc4/y$a;

    .line 101
    .line 102
    if-nez v7, :cond_4

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    invoke-static {v1, v3, v3}, Lc4/y;->b(Lv5/u;ZZ)Lc4/y$a;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v0, Ll4/i;->r:Lc4/y$a;

    .line 110
    .line 111
    :goto_0
    const/4 v1, 0x0

    .line 112
    goto/16 :goto_21

    .line 113
    .line 114
    :cond_4
    iget v3, v1, Lv5/u;->c:I

    .line 115
    .line 116
    new-array v8, v3, [B

    .line 117
    .line 118
    iget-object v5, v1, Lv5/u;->a:[B

    .line 119
    .line 120
    invoke-static {v5, v4, v8, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    iget v3, v6, Lc4/y$c;->a:I

    .line 124
    .line 125
    const/4 v5, 0x5

    .line 126
    invoke-static {v5, v1, v4}, Lc4/y;->c(ILv5/u;Z)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Lv5/u;->v()I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    new-instance v10, Lc4/x;

    .line 136
    .line 137
    iget-object v11, v1, Lv5/u;->a:[B

    .line 138
    .line 139
    invoke-direct {v10, v11}, Lc4/x;-><init>([B)V

    .line 140
    .line 141
    .line 142
    iget v1, v1, Lv5/u;->b:I

    .line 143
    .line 144
    mul-int/lit8 v1, v1, 0x8

    .line 145
    .line 146
    invoke-virtual {v10, v1}, Lc4/x;->e(I)V

    .line 147
    .line 148
    .line 149
    :goto_1
    const/16 v1, 0x18

    .line 150
    .line 151
    const/16 v11, 0x10

    .line 152
    .line 153
    if-ge v4, v9, :cond_12

    .line 154
    .line 155
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    const v13, 0x564342

    .line 160
    .line 161
    .line 162
    if-ne v12, v13, :cond_11

    .line 163
    .line 164
    invoke-virtual {v10, v11}, Lc4/x;->c(I)I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    new-array v12, v1, [J

    .line 173
    .line 174
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-nez v13, :cond_8

    .line 179
    .line 180
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    move/from16 v14, v16

    .line 187
    .line 188
    :goto_2
    if-ge v14, v1, :cond_7

    .line 189
    .line 190
    if-eqz v13, :cond_6

    .line 191
    .line 192
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-eqz v15, :cond_5

    .line 197
    .line 198
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    add-int/lit8 v5, v5, 0x1

    .line 203
    .line 204
    move-object v15, v8

    .line 205
    move/from16 p3, v9

    .line 206
    .line 207
    int-to-long v8, v5

    .line 208
    aput-wide v8, v12, v14

    .line 209
    .line 210
    const-wide/16 v8, 0x0

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_5
    move-object v15, v8

    .line 214
    move/from16 p3, v9

    .line 215
    .line 216
    const-wide/16 v8, 0x0

    .line 217
    .line 218
    aput-wide v8, v12, v14

    .line 219
    .line 220
    :goto_3
    const/4 v5, 0x5

    .line 221
    goto :goto_4

    .line 222
    :cond_6
    move-object v15, v8

    .line 223
    move/from16 p3, v9

    .line 224
    .line 225
    const-wide/16 v8, 0x0

    .line 226
    .line 227
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    add-int/lit8 v8, v16, 0x1

    .line 232
    .line 233
    int-to-long v8, v8

    .line 234
    aput-wide v8, v12, v14

    .line 235
    .line 236
    :goto_4
    add-int/lit8 v14, v14, 0x1

    .line 237
    .line 238
    move/from16 v9, p3

    .line 239
    .line 240
    move-object v8, v15

    .line 241
    goto :goto_2

    .line 242
    :cond_7
    move/from16 p3, v9

    .line 243
    .line 244
    move-object/from16 v16, v8

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_8
    move-object v15, v8

    .line 248
    move/from16 p3, v9

    .line 249
    .line 250
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    add-int/lit8 v5, v5, 0x1

    .line 255
    .line 256
    const/4 v8, 0x0

    .line 257
    :goto_5
    if-ge v8, v1, :cond_b

    .line 258
    .line 259
    sub-int v9, v1, v8

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    :goto_6
    if-lez v9, :cond_9

    .line 263
    .line 264
    add-int/lit8 v13, v13, 0x1

    .line 265
    .line 266
    ushr-int/lit8 v9, v9, 0x1

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_9
    invoke-virtual {v10, v13}, Lc4/x;->c(I)I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    const/4 v13, 0x0

    .line 274
    :goto_7
    if-ge v13, v9, :cond_a

    .line 275
    .line 276
    if-ge v8, v1, :cond_a

    .line 277
    .line 278
    move-object/from16 v16, v15

    .line 279
    .line 280
    int-to-long v14, v5

    .line 281
    aput-wide v14, v12, v8

    .line 282
    .line 283
    add-int/lit8 v8, v8, 0x1

    .line 284
    .line 285
    add-int/lit8 v13, v13, 0x1

    .line 286
    .line 287
    move-object/from16 v15, v16

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_a
    move-object/from16 v16, v15

    .line 291
    .line 292
    add-int/lit8 v5, v5, 0x1

    .line 293
    .line 294
    move-object/from16 v15, v16

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_b
    move-object/from16 v16, v15

    .line 298
    .line 299
    :goto_8
    const/4 v5, 0x4

    .line 300
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    const/4 v9, 0x2

    .line 305
    if-gt v8, v9, :cond_10

    .line 306
    .line 307
    const/4 v12, 0x1

    .line 308
    if-eq v8, v12, :cond_c

    .line 309
    .line 310
    if-ne v8, v9, :cond_f

    .line 311
    .line 312
    :cond_c
    const/16 v9, 0x20

    .line 313
    .line 314
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    add-int/2addr v5, v12

    .line 325
    invoke-virtual {v10, v12}, Lc4/x;->e(I)V

    .line 326
    .line 327
    .line 328
    if-ne v8, v12, :cond_e

    .line 329
    .line 330
    if-eqz v11, :cond_d

    .line 331
    .line 332
    int-to-long v8, v1

    .line 333
    int-to-long v11, v11

    .line 334
    long-to-double v8, v8

    .line 335
    long-to-double v11, v11

    .line 336
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 337
    .line 338
    div-double/2addr v13, v11

    .line 339
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 340
    .line 341
    .line 342
    move-result-wide v8

    .line 343
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 344
    .line 345
    .line 346
    move-result-wide v8

    .line 347
    double-to-long v14, v8

    .line 348
    goto :goto_9

    .line 349
    :cond_d
    const-wide/16 v14, 0x0

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :cond_e
    int-to-long v8, v1

    .line 353
    int-to-long v11, v11

    .line 354
    mul-long v14, v8, v11

    .line 355
    .line 356
    :goto_9
    int-to-long v8, v5

    .line 357
    mul-long/2addr v8, v14

    .line 358
    long-to-int v1, v8

    .line 359
    invoke-virtual {v10, v1}, Lc4/x;->e(I)V

    .line 360
    .line 361
    .line 362
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 363
    .line 364
    const/4 v5, 0x5

    .line 365
    move/from16 v9, p3

    .line 366
    .line 367
    move-object/from16 v8, v16

    .line 368
    .line 369
    goto/16 :goto_1

    .line 370
    .line 371
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v2, "lookup type greater than 2 not decodable: "

    .line 377
    .line 378
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    const/4 v2, 0x0

    .line 389
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    throw v1

    .line 394
    :cond_11
    const-string v1, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 395
    .line 396
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    iget v2, v10, Lc4/x;->b:I

    .line 401
    .line 402
    mul-int/lit8 v2, v2, 0x8

    .line 403
    .line 404
    iget v3, v10, Lc4/x;->c:I

    .line 405
    .line 406
    add-int/2addr v2, v3

    .line 407
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const/4 v2, 0x0

    .line 415
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    throw v1

    .line 420
    :cond_12
    move-object/from16 v16, v8

    .line 421
    .line 422
    const/4 v1, 0x6

    .line 423
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    add-int/lit8 v4, v4, 0x1

    .line 428
    .line 429
    const/4 v5, 0x0

    .line 430
    :goto_a
    if-ge v5, v4, :cond_14

    .line 431
    .line 432
    invoke-virtual {v10, v11}, Lc4/x;->c(I)I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    if-nez v8, :cond_13

    .line 437
    .line 438
    add-int/lit8 v5, v5, 0x1

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_13
    const-string v1, "placeholder of time domain transforms not zeroed out"

    .line 442
    .line 443
    const/4 v2, 0x0

    .line 444
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    throw v1

    .line 449
    :cond_14
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    const/4 v5, 0x1

    .line 454
    add-int/2addr v4, v5

    .line 455
    const/4 v8, 0x0

    .line 456
    :goto_b
    const/4 v9, 0x3

    .line 457
    if-ge v8, v4, :cond_1e

    .line 458
    .line 459
    invoke-virtual {v10, v11}, Lc4/x;->c(I)I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_1c

    .line 464
    .line 465
    if-ne v1, v5, :cond_1b

    .line 466
    .line 467
    const/4 v1, 0x5

    .line 468
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    new-array v5, v1, [I

    .line 473
    .line 474
    const/4 v11, 0x0

    .line 475
    const/4 v12, -0x1

    .line 476
    :goto_c
    if-ge v11, v1, :cond_16

    .line 477
    .line 478
    const/4 v13, 0x4

    .line 479
    invoke-virtual {v10, v13}, Lc4/x;->c(I)I

    .line 480
    .line 481
    .line 482
    move-result v13

    .line 483
    aput v13, v5, v11

    .line 484
    .line 485
    if-le v13, v12, :cond_15

    .line 486
    .line 487
    move v12, v13

    .line 488
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_16
    add-int/lit8 v12, v12, 0x1

    .line 492
    .line 493
    new-array v11, v12, [I

    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    :goto_d
    if-ge v13, v12, :cond_19

    .line 497
    .line 498
    invoke-virtual {v10, v9}, Lc4/x;->c(I)I

    .line 499
    .line 500
    .line 501
    move-result v9

    .line 502
    const/4 v14, 0x1

    .line 503
    add-int/lit8 v9, v9, 0x1

    .line 504
    .line 505
    aput v9, v11, v13

    .line 506
    .line 507
    const/4 v9, 0x2

    .line 508
    invoke-virtual {v10, v9}, Lc4/x;->c(I)I

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    const/16 v15, 0x8

    .line 513
    .line 514
    if-lez v9, :cond_17

    .line 515
    .line 516
    invoke-virtual {v10, v15}, Lc4/x;->e(I)V

    .line 517
    .line 518
    .line 519
    :cond_17
    const/16 v17, 0x0

    .line 520
    .line 521
    move/from16 p1, v4

    .line 522
    .line 523
    move/from16 v4, v17

    .line 524
    .line 525
    :goto_e
    shl-int/2addr v14, v9

    .line 526
    if-ge v4, v14, :cond_18

    .line 527
    .line 528
    invoke-virtual {v10, v15}, Lc4/x;->e(I)V

    .line 529
    .line 530
    .line 531
    add-int/lit8 v4, v4, 0x1

    .line 532
    .line 533
    const/16 v15, 0x8

    .line 534
    .line 535
    const/4 v14, 0x1

    .line 536
    goto :goto_e

    .line 537
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 538
    .line 539
    const/4 v9, 0x3

    .line 540
    move/from16 v4, p1

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_19
    move/from16 p1, v4

    .line 544
    .line 545
    const/4 v4, 0x2

    .line 546
    invoke-virtual {v10, v4}, Lc4/x;->e(I)V

    .line 547
    .line 548
    .line 549
    const/4 v4, 0x4

    .line 550
    invoke-virtual {v10, v4}, Lc4/x;->c(I)I

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    const/4 v9, 0x0

    .line 555
    const/4 v12, 0x0

    .line 556
    const/4 v13, 0x0

    .line 557
    :goto_f
    if-ge v9, v1, :cond_1d

    .line 558
    .line 559
    aget v14, v5, v9

    .line 560
    .line 561
    aget v14, v11, v14

    .line 562
    .line 563
    add-int/2addr v12, v14

    .line 564
    :goto_10
    if-ge v13, v12, :cond_1a

    .line 565
    .line 566
    invoke-virtual {v10, v4}, Lc4/x;->e(I)V

    .line 567
    .line 568
    .line 569
    add-int/lit8 v13, v13, 0x1

    .line 570
    .line 571
    goto :goto_10

    .line 572
    :cond_1a
    add-int/lit8 v9, v9, 0x1

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_1b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 578
    .line 579
    .line 580
    const-string v3, "floor type greater than 1 not decodable: "

    .line 581
    .line 582
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    const/4 v2, 0x0

    .line 593
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    throw v1

    .line 598
    :cond_1c
    move/from16 p1, v4

    .line 599
    .line 600
    const/16 v1, 0x8

    .line 601
    .line 602
    invoke-virtual {v10, v1}, Lc4/x;->e(I)V

    .line 603
    .line 604
    .line 605
    const/16 v4, 0x10

    .line 606
    .line 607
    invoke-virtual {v10, v4}, Lc4/x;->e(I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v10, v4}, Lc4/x;->e(I)V

    .line 611
    .line 612
    .line 613
    const/4 v4, 0x6

    .line 614
    invoke-virtual {v10, v4}, Lc4/x;->e(I)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v10, v1}, Lc4/x;->e(I)V

    .line 618
    .line 619
    .line 620
    const/4 v4, 0x4

    .line 621
    invoke-virtual {v10, v4}, Lc4/x;->c(I)I

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    add-int/lit8 v4, v4, 0x1

    .line 626
    .line 627
    const/4 v5, 0x0

    .line 628
    :goto_11
    if-ge v5, v4, :cond_1d

    .line 629
    .line 630
    invoke-virtual {v10, v1}, Lc4/x;->e(I)V

    .line 631
    .line 632
    .line 633
    add-int/lit8 v5, v5, 0x1

    .line 634
    .line 635
    const/16 v1, 0x8

    .line 636
    .line 637
    goto :goto_11

    .line 638
    :cond_1d
    add-int/lit8 v8, v8, 0x1

    .line 639
    .line 640
    const/4 v1, 0x6

    .line 641
    const/16 v11, 0x10

    .line 642
    .line 643
    const/4 v5, 0x1

    .line 644
    move/from16 v4, p1

    .line 645
    .line 646
    goto/16 :goto_b

    .line 647
    .line 648
    :cond_1e
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    const/4 v5, 0x1

    .line 653
    add-int/2addr v4, v5

    .line 654
    const/4 v8, 0x0

    .line 655
    :goto_12
    if-ge v8, v4, :cond_25

    .line 656
    .line 657
    const/16 v9, 0x10

    .line 658
    .line 659
    invoke-virtual {v10, v9}, Lc4/x;->c(I)I

    .line 660
    .line 661
    .line 662
    move-result v9

    .line 663
    const/4 v11, 0x2

    .line 664
    if-gt v9, v11, :cond_24

    .line 665
    .line 666
    const/16 v9, 0x18

    .line 667
    .line 668
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    add-int/2addr v1, v5

    .line 682
    const/16 v5, 0x8

    .line 683
    .line 684
    invoke-virtual {v10, v5}, Lc4/x;->e(I)V

    .line 685
    .line 686
    .line 687
    new-array v9, v1, [I

    .line 688
    .line 689
    const/4 v11, 0x0

    .line 690
    :goto_13
    const/4 v12, 0x3

    .line 691
    if-ge v11, v1, :cond_20

    .line 692
    .line 693
    invoke-virtual {v10, v12}, Lc4/x;->c(I)I

    .line 694
    .line 695
    .line 696
    move-result v12

    .line 697
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 698
    .line 699
    .line 700
    move-result v13

    .line 701
    if-eqz v13, :cond_1f

    .line 702
    .line 703
    const/4 v13, 0x5

    .line 704
    invoke-virtual {v10, v13}, Lc4/x;->c(I)I

    .line 705
    .line 706
    .line 707
    move-result v13

    .line 708
    goto :goto_14

    .line 709
    :cond_1f
    const/4 v13, 0x0

    .line 710
    :goto_14
    mul-int/lit8 v13, v13, 0x8

    .line 711
    .line 712
    add-int/2addr v13, v12

    .line 713
    aput v13, v9, v11

    .line 714
    .line 715
    add-int/lit8 v11, v11, 0x1

    .line 716
    .line 717
    goto :goto_13

    .line 718
    :cond_20
    const/4 v11, 0x0

    .line 719
    :goto_15
    if-ge v11, v1, :cond_23

    .line 720
    .line 721
    const/4 v12, 0x0

    .line 722
    :goto_16
    if-ge v12, v5, :cond_22

    .line 723
    .line 724
    aget v13, v9, v11

    .line 725
    .line 726
    const/4 v14, 0x1

    .line 727
    shl-int/2addr v14, v12

    .line 728
    and-int/2addr v13, v14

    .line 729
    if-eqz v13, :cond_21

    .line 730
    .line 731
    invoke-virtual {v10, v5}, Lc4/x;->e(I)V

    .line 732
    .line 733
    .line 734
    :cond_21
    add-int/lit8 v12, v12, 0x1

    .line 735
    .line 736
    const/16 v5, 0x8

    .line 737
    .line 738
    goto :goto_16

    .line 739
    :cond_22
    add-int/lit8 v11, v11, 0x1

    .line 740
    .line 741
    const/16 v5, 0x8

    .line 742
    .line 743
    goto :goto_15

    .line 744
    :cond_23
    add-int/lit8 v8, v8, 0x1

    .line 745
    .line 746
    const/4 v1, 0x6

    .line 747
    const/4 v5, 0x1

    .line 748
    goto :goto_12

    .line 749
    :cond_24
    const-string v1, "residueType greater than 2 is not decodable"

    .line 750
    .line 751
    const/4 v2, 0x0

    .line 752
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    throw v1

    .line 757
    :cond_25
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    add-int/lit8 v1, v1, 0x1

    .line 762
    .line 763
    const/4 v4, 0x0

    .line 764
    :goto_17
    if-ge v4, v1, :cond_2e

    .line 765
    .line 766
    const/16 v5, 0x10

    .line 767
    .line 768
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 769
    .line 770
    .line 771
    move-result v5

    .line 772
    if-eqz v5, :cond_26

    .line 773
    .line 774
    new-instance v8, Ljava/lang/StringBuilder;

    .line 775
    .line 776
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 777
    .line 778
    .line 779
    const-string v9, "mapping type other than 0 not supported: "

    .line 780
    .line 781
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    const-string v8, "VorbisUtil"

    .line 792
    .line 793
    invoke-static {v8, v5}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    goto :goto_1e

    .line 797
    :cond_26
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    if-eqz v5, :cond_27

    .line 802
    .line 803
    const/4 v5, 0x4

    .line 804
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    const/4 v8, 0x1

    .line 809
    add-int/2addr v5, v8

    .line 810
    goto :goto_18

    .line 811
    :cond_27
    const/4 v8, 0x1

    .line 812
    move v5, v8

    .line 813
    :goto_18
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 814
    .line 815
    .line 816
    move-result v9

    .line 817
    if-eqz v9, :cond_2a

    .line 818
    .line 819
    const/16 v9, 0x8

    .line 820
    .line 821
    invoke-virtual {v10, v9}, Lc4/x;->c(I)I

    .line 822
    .line 823
    .line 824
    move-result v9

    .line 825
    add-int/2addr v9, v8

    .line 826
    const/4 v8, 0x0

    .line 827
    :goto_19
    if-ge v8, v9, :cond_2a

    .line 828
    .line 829
    add-int/lit8 v11, v3, -0x1

    .line 830
    .line 831
    const/4 v12, 0x0

    .line 832
    move v13, v11

    .line 833
    :goto_1a
    if-lez v13, :cond_28

    .line 834
    .line 835
    add-int/lit8 v12, v12, 0x1

    .line 836
    .line 837
    ushr-int/lit8 v13, v13, 0x1

    .line 838
    .line 839
    goto :goto_1a

    .line 840
    :cond_28
    invoke-virtual {v10, v12}, Lc4/x;->e(I)V

    .line 841
    .line 842
    .line 843
    const/4 v12, 0x0

    .line 844
    :goto_1b
    if-lez v11, :cond_29

    .line 845
    .line 846
    add-int/lit8 v12, v12, 0x1

    .line 847
    .line 848
    ushr-int/lit8 v11, v11, 0x1

    .line 849
    .line 850
    goto :goto_1b

    .line 851
    :cond_29
    invoke-virtual {v10, v12}, Lc4/x;->e(I)V

    .line 852
    .line 853
    .line 854
    add-int/lit8 v8, v8, 0x1

    .line 855
    .line 856
    goto :goto_19

    .line 857
    :cond_2a
    const/4 v8, 0x2

    .line 858
    invoke-virtual {v10, v8}, Lc4/x;->c(I)I

    .line 859
    .line 860
    .line 861
    move-result v8

    .line 862
    if-nez v8, :cond_2d

    .line 863
    .line 864
    const/4 v8, 0x1

    .line 865
    if-le v5, v8, :cond_2b

    .line 866
    .line 867
    const/4 v8, 0x0

    .line 868
    :goto_1c
    if-ge v8, v3, :cond_2b

    .line 869
    .line 870
    const/4 v9, 0x4

    .line 871
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 872
    .line 873
    .line 874
    add-int/lit8 v8, v8, 0x1

    .line 875
    .line 876
    goto :goto_1c

    .line 877
    :cond_2b
    const/4 v8, 0x0

    .line 878
    :goto_1d
    if-ge v8, v5, :cond_2c

    .line 879
    .line 880
    const/16 v9, 0x8

    .line 881
    .line 882
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v10, v9}, Lc4/x;->e(I)V

    .line 889
    .line 890
    .line 891
    add-int/lit8 v8, v8, 0x1

    .line 892
    .line 893
    goto :goto_1d

    .line 894
    :cond_2c
    :goto_1e
    add-int/lit8 v4, v4, 0x1

    .line 895
    .line 896
    goto/16 :goto_17

    .line 897
    .line 898
    :cond_2d
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    .line 899
    .line 900
    const/4 v2, 0x0

    .line 901
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    throw v1

    .line 906
    :cond_2e
    const/4 v1, 0x6

    .line 907
    invoke-virtual {v10, v1}, Lc4/x;->c(I)I

    .line 908
    .line 909
    .line 910
    move-result v1

    .line 911
    add-int/lit8 v1, v1, 0x1

    .line 912
    .line 913
    new-array v9, v1, [Lc4/y$b;

    .line 914
    .line 915
    const/4 v3, 0x0

    .line 916
    :goto_1f
    if-ge v3, v1, :cond_2f

    .line 917
    .line 918
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    const/16 v5, 0x10

    .line 923
    .line 924
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 925
    .line 926
    .line 927
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 928
    .line 929
    .line 930
    const/16 v5, 0x8

    .line 931
    .line 932
    invoke-virtual {v10, v5}, Lc4/x;->c(I)I

    .line 933
    .line 934
    .line 935
    new-instance v5, Lc4/y$b;

    .line 936
    .line 937
    invoke-direct {v5, v4}, Lc4/y$b;-><init>(Z)V

    .line 938
    .line 939
    .line 940
    aput-object v5, v9, v3

    .line 941
    .line 942
    add-int/lit8 v3, v3, 0x1

    .line 943
    .line 944
    goto :goto_1f

    .line 945
    :cond_2f
    invoke-virtual {v10}, Lc4/x;->b()Z

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-eqz v3, :cond_32

    .line 950
    .line 951
    add-int/lit8 v1, v1, -0x1

    .line 952
    .line 953
    const/4 v3, 0x0

    .line 954
    move v10, v3

    .line 955
    :goto_20
    if-lez v1, :cond_30

    .line 956
    .line 957
    add-int/lit8 v10, v10, 0x1

    .line 958
    .line 959
    ushr-int/lit8 v1, v1, 0x1

    .line 960
    .line 961
    goto :goto_20

    .line 962
    :cond_30
    new-instance v1, Ll4/i$a;

    .line 963
    .line 964
    move-object v5, v1

    .line 965
    move-object/from16 v8, v16

    .line 966
    .line 967
    invoke-direct/range {v5 .. v10}, Ll4/i$a;-><init>(Lc4/y$c;Lc4/y$a;[B[Lc4/y$b;I)V

    .line 968
    .line 969
    .line 970
    :goto_21
    iput-object v1, v0, Ll4/i;->n:Ll4/i$a;

    .line 971
    .line 972
    if-nez v1, :cond_31

    .line 973
    .line 974
    const/4 v1, 0x1

    .line 975
    return v1

    .line 976
    :cond_31
    iget-object v3, v1, Ll4/i$a;->a:Lc4/y$c;

    .line 977
    .line 978
    new-instance v4, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 981
    .line 982
    .line 983
    iget-object v5, v3, Lc4/y$c;->g:[B

    .line 984
    .line 985
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    iget-object v5, v1, Ll4/i$a;->c:[B

    .line 989
    .line 990
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    iget-object v1, v1, Ll4/i$a;->b:Lc4/y$a;

    .line 994
    .line 995
    iget-object v1, v1, Lc4/y$a;->a:[Ljava/lang/String;

    .line 996
    .line 997
    invoke-static {v1}, Lo7/t;->q([Ljava/lang/Object;)Lo7/l0;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    invoke-static {v1}, Lc4/y;->a(Ljava/util/List;)Lp4/a;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    new-instance v5, Lv3/i0$a;

    .line 1006
    .line 1007
    invoke-direct {v5}, Lv3/i0$a;-><init>()V

    .line 1008
    .line 1009
    .line 1010
    const-string v6, "audio/vorbis"

    .line 1011
    .line 1012
    iput-object v6, v5, Lv3/i0$a;->k:Ljava/lang/String;

    .line 1013
    .line 1014
    iget v6, v3, Lc4/y$c;->d:I

    .line 1015
    .line 1016
    iput v6, v5, Lv3/i0$a;->f:I

    .line 1017
    .line 1018
    iget v6, v3, Lc4/y$c;->c:I

    .line 1019
    .line 1020
    iput v6, v5, Lv3/i0$a;->g:I

    .line 1021
    .line 1022
    iget v6, v3, Lc4/y$c;->a:I

    .line 1023
    .line 1024
    iput v6, v5, Lv3/i0$a;->x:I

    .line 1025
    .line 1026
    iget v3, v3, Lc4/y$c;->b:I

    .line 1027
    .line 1028
    iput v3, v5, Lv3/i0$a;->y:I

    .line 1029
    .line 1030
    iput-object v4, v5, Lv3/i0$a;->m:Ljava/util/List;

    .line 1031
    .line 1032
    iput-object v1, v5, Lv3/i0$a;->i:Lp4/a;

    .line 1033
    .line 1034
    new-instance v1, Lv3/i0;

    .line 1035
    .line 1036
    invoke-direct {v1, v5}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1037
    .line 1038
    .line 1039
    iput-object v1, v2, Ll4/h$a;->a:Lv3/i0;

    .line 1040
    .line 1041
    const/4 v1, 0x1

    .line 1042
    return v1

    .line 1043
    :cond_32
    const-string v1, "framing bit after modes not set as expected"

    .line 1044
    .line 1045
    const/4 v2, 0x0

    .line 1046
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    throw v1
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

.method public final d(Z)V
    .locals 0

    invoke-super {p0, p1}, Ll4/h;->d(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll4/i;->n:Ll4/i$a;

    iput-object p1, p0, Ll4/i;->q:Lc4/y$c;

    iput-object p1, p0, Ll4/i;->r:Lc4/y$a;

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Ll4/i;->o:I

    iput-boolean p1, p0, Ll4/i;->p:Z

    return-void
.end method
