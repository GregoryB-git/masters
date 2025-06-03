.class public final LF0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:I

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;IIIIIIIIFILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF0/F;->a:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, LF0/F;->b:I

    .line 7
    .line 8
    iput p3, p0, LF0/F;->c:I

    .line 9
    .line 10
    iput p4, p0, LF0/F;->d:I

    .line 11
    .line 12
    iput p5, p0, LF0/F;->e:I

    .line 13
    .line 14
    iput p6, p0, LF0/F;->f:I

    .line 15
    .line 16
    iput p7, p0, LF0/F;->g:I

    .line 17
    .line 18
    iput p8, p0, LF0/F;->h:I

    .line 19
    .line 20
    iput p9, p0, LF0/F;->i:I

    .line 21
    .line 22
    iput p10, p0, LF0/F;->j:F

    .line 23
    .line 24
    iput p11, p0, LF0/F;->k:I

    .line 25
    .line 26
    iput-object p12, p0, LF0/F;->l:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Lg0/z;)LF0/F;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    and-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    move v5, v4

    .line 24
    move v6, v5

    .line 25
    :goto_0
    const/4 v7, 0x1

    .line 26
    if-ge v5, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v7}, Lg0/z;->U(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    move v8, v4

    .line 36
    :goto_1
    if-ge v8, v7, :cond_0

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    add-int/lit8 v10, v9, 0x4

    .line 43
    .line 44
    add-int/2addr v6, v10

    .line 45
    invoke-virtual {v0, v9}, Lg0/z;->U(I)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v8, v8, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0, v3}, Lg0/z;->T(I)V

    .line 58
    .line 59
    .line 60
    new-array v3, v6, [B

    .line 61
    .line 62
    const/4 v5, -0x1

    .line 63
    const/high16 v8, 0x3f800000    # 1.0f

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    move v13, v5

    .line 67
    move v14, v13

    .line 68
    move v15, v14

    .line 69
    move/from16 v16, v15

    .line 70
    .line 71
    move/from16 v17, v16

    .line 72
    .line 73
    move/from16 v18, v17

    .line 74
    .line 75
    move/from16 v19, v18

    .line 76
    .line 77
    move/from16 v21, v19

    .line 78
    .line 79
    move/from16 v20, v8

    .line 80
    .line 81
    move-object/from16 v22, v9

    .line 82
    .line 83
    move v5, v4

    .line 84
    move v8, v5

    .line 85
    :goto_2
    if-ge v5, v2, :cond_4

    .line 86
    .line 87
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    and-int/lit8 v9, v9, 0x3f

    .line 92
    .line 93
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    move v11, v4

    .line 98
    :goto_3
    if-ge v11, v10, :cond_3

    .line 99
    .line 100
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    sget-object v7, Lh0/d;->a:[B

    .line 105
    .line 106
    move/from16 v23, v2

    .line 107
    .line 108
    array-length v2, v7

    .line 109
    invoke-static {v7, v4, v3, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    .line 111
    .line 112
    array-length v2, v7

    .line 113
    add-int/2addr v8, v2

    .line 114
    invoke-virtual/range {p0 .. p0}, Lg0/z;->e()[B

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-static {v2, v7, v3, v8, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    .line 124
    .line 125
    const/16 v2, 0x21

    .line 126
    .line 127
    if-ne v9, v2, :cond_2

    .line 128
    .line 129
    if-nez v11, :cond_2

    .line 130
    .line 131
    add-int v2, v8, v12

    .line 132
    .line 133
    invoke-static {v3, v8, v2}, Lh0/d;->h([BII)Lh0/d$a;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget v13, v2, Lh0/d$a;->k:I

    .line 138
    .line 139
    iget v14, v2, Lh0/d$a;->l:I

    .line 140
    .line 141
    iget v7, v2, Lh0/d$a;->f:I

    .line 142
    .line 143
    add-int/lit8 v15, v7, 0x8

    .line 144
    .line 145
    iget v7, v2, Lh0/d$a;->g:I

    .line 146
    .line 147
    add-int/lit8 v16, v7, 0x8

    .line 148
    .line 149
    iget v7, v2, Lh0/d$a;->o:I

    .line 150
    .line 151
    iget v4, v2, Lh0/d$a;->p:I

    .line 152
    .line 153
    move/from16 v17, v4

    .line 154
    .line 155
    iget v4, v2, Lh0/d$a;->q:I

    .line 156
    .line 157
    move/from16 v18, v4

    .line 158
    .line 159
    iget v4, v2, Lh0/d$a;->m:F

    .line 160
    .line 161
    move/from16 v19, v4

    .line 162
    .line 163
    iget v4, v2, Lh0/d$a;->n:I

    .line 164
    .line 165
    move/from16 v20, v4

    .line 166
    .line 167
    iget v4, v2, Lh0/d$a;->a:I

    .line 168
    .line 169
    move/from16 v21, v7

    .line 170
    .line 171
    iget-boolean v7, v2, Lh0/d$a;->b:Z

    .line 172
    .line 173
    move/from16 v30, v9

    .line 174
    .line 175
    iget v9, v2, Lh0/d$a;->c:I

    .line 176
    .line 177
    move/from16 v31, v10

    .line 178
    .line 179
    iget v10, v2, Lh0/d$a;->d:I

    .line 180
    .line 181
    move/from16 v22, v13

    .line 182
    .line 183
    iget-object v13, v2, Lh0/d$a;->h:[I

    .line 184
    .line 185
    iget v2, v2, Lh0/d$a;->i:I

    .line 186
    .line 187
    move/from16 v24, v4

    .line 188
    .line 189
    move/from16 v25, v7

    .line 190
    .line 191
    move/from16 v26, v9

    .line 192
    .line 193
    move/from16 v27, v10

    .line 194
    .line 195
    move-object/from16 v28, v13

    .line 196
    .line 197
    move/from16 v29, v2

    .line 198
    .line 199
    invoke-static/range {v24 .. v29}, Lg0/d;->c(IZII[II)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    move/from16 v13, v22

    .line 204
    .line 205
    move-object/from16 v22, v2

    .line 206
    .line 207
    move/from16 v32, v18

    .line 208
    .line 209
    move/from16 v18, v17

    .line 210
    .line 211
    move/from16 v17, v21

    .line 212
    .line 213
    move/from16 v21, v20

    .line 214
    .line 215
    move/from16 v20, v19

    .line 216
    .line 217
    move/from16 v19, v32

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_2
    move/from16 v30, v9

    .line 221
    .line 222
    move/from16 v31, v10

    .line 223
    .line 224
    :goto_4
    add-int/2addr v8, v12

    .line 225
    invoke-virtual {v0, v12}, Lg0/z;->U(I)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 v11, v11, 0x1

    .line 229
    .line 230
    move/from16 v2, v23

    .line 231
    .line 232
    move/from16 v9, v30

    .line 233
    .line 234
    move/from16 v10, v31

    .line 235
    .line 236
    const/4 v4, 0x0

    .line 237
    const/4 v7, 0x1

    .line 238
    goto/16 :goto_3

    .line 239
    .line 240
    :cond_3
    move/from16 v23, v2

    .line 241
    .line 242
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    const/4 v4, 0x0

    .line 245
    const/4 v7, 0x1

    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_4
    if-nez v6, :cond_5

    .line 249
    .line 250
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_5
    move-object v11, v0

    .line 255
    goto :goto_6

    .line 256
    :cond_5
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    goto :goto_5

    .line 261
    :goto_6
    new-instance v0, LF0/F;

    .line 262
    .line 263
    const/4 v2, 0x1

    .line 264
    add-int/lit8 v12, v1, 0x1

    .line 265
    .line 266
    move-object v10, v0

    .line 267
    invoke-direct/range {v10 .. v22}, LF0/F;-><init>(Ljava/util/List;IIIIIIIIFILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :goto_7
    const-string v1, "Error parsing HEVC config"

    .line 272
    .line 273
    invoke-static {v1, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    throw v0
.end method
