.class public final Lw5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:F

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;IFLjava/lang/String;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/e;->a:Ljava/util/List;

    iput p2, p0, Lw5/e;->b:I

    iput p3, p0, Lw5/e;->c:F

    iput-object p4, p0, Lw5/e;->g:Ljava/lang/String;

    iput p5, p0, Lw5/e;->d:I

    iput p6, p0, Lw5/e;->e:I

    iput p7, p0, Lw5/e;->f:I

    return-void
.end method

.method public static a(Lv5/u;)Lw5/e;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0, v1}, Lv5/u;->H(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    and-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget v3, v0, Lv5/u;->b:I

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move v5, v4

    .line 22
    move v6, v5

    .line 23
    :goto_0
    const/4 v7, 0x1

    .line 24
    if-ge v5, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v7}, Lv5/u;->H(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    move v8, v4

    .line 34
    :goto_1
    if-ge v8, v7, :cond_0

    .line 35
    .line 36
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    add-int/lit8 v10, v9, 0x4

    .line 41
    .line 42
    add-int/2addr v6, v10

    .line 43
    invoke-virtual {v0, v9}, Lv5/u;->H(I)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v0, v3}, Lv5/u;->G(I)V

    .line 53
    .line 54
    .line 55
    new-array v3, v6, [B

    .line 56
    .line 57
    const/high16 v5, 0x3f800000    # 1.0f

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v9, -0x1

    .line 61
    move v13, v5

    .line 62
    move-object v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v15

    .line 65
    .line 66
    move/from16 v17, v16

    .line 67
    .line 68
    move v5, v4

    .line 69
    move v8, v5

    .line 70
    :goto_2
    if-ge v5, v2, :cond_4

    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Lv5/u;->v()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    and-int/lit8 v9, v9, 0x3f

    .line 77
    .line 78
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    move v11, v4

    .line 83
    :goto_3
    if-ge v11, v10, :cond_3

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p0}, Lv5/u;->A()I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    sget-object v7, Lv5/q;->a:[B

    .line 90
    .line 91
    move/from16 v18, v2

    .line 92
    .line 93
    const/4 v2, 0x4

    .line 94
    invoke-static {v7, v4, v3, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v8, v8, 0x4

    .line 98
    .line 99
    iget-object v2, v0, Lv5/u;->a:[B

    .line 100
    .line 101
    iget v7, v0, Lv5/u;->b:I

    .line 102
    .line 103
    invoke-static {v2, v7, v3, v8, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    const/16 v2, 0x21

    .line 107
    .line 108
    if-ne v9, v2, :cond_2

    .line 109
    .line 110
    if-nez v11, :cond_2

    .line 111
    .line 112
    add-int v2, v8, v12

    .line 113
    .line 114
    invoke-static {v3, v8, v2}, Lv5/q;->c([BII)Lv5/q$a;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iget v15, v2, Lv5/q$a;->j:I

    .line 119
    .line 120
    iget v7, v2, Lv5/q$a;->k:I

    .line 121
    .line 122
    iget v13, v2, Lv5/q$a;->l:I

    .line 123
    .line 124
    iget v14, v2, Lv5/q$a;->i:F

    .line 125
    .line 126
    iget v4, v2, Lv5/q$a;->a:I

    .line 127
    .line 128
    move/from16 v16, v7

    .line 129
    .line 130
    iget-boolean v7, v2, Lv5/q$a;->b:Z

    .line 131
    .line 132
    move/from16 v25, v9

    .line 133
    .line 134
    iget v9, v2, Lv5/q$a;->c:I

    .line 135
    .line 136
    move/from16 v26, v10

    .line 137
    .line 138
    iget v10, v2, Lv5/q$a;->d:I

    .line 139
    .line 140
    move/from16 v17, v13

    .line 141
    .line 142
    iget-object v13, v2, Lv5/q$a;->e:[I

    .line 143
    .line 144
    iget v2, v2, Lv5/q$a;->f:I

    .line 145
    .line 146
    move/from16 v19, v4

    .line 147
    .line 148
    move/from16 v20, v7

    .line 149
    .line 150
    move/from16 v21, v9

    .line 151
    .line 152
    move/from16 v22, v10

    .line 153
    .line 154
    move-object/from16 v23, v13

    .line 155
    .line 156
    move/from16 v24, v2

    .line 157
    .line 158
    invoke-static/range {v19 .. v24}, Lb/a0;->m(IZII[II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move v13, v14

    .line 163
    move-object v14, v2

    .line 164
    goto :goto_4

    .line 165
    :cond_2
    move/from16 v25, v9

    .line 166
    .line 167
    move/from16 v26, v10

    .line 168
    .line 169
    :goto_4
    add-int/2addr v8, v12

    .line 170
    invoke-virtual {v0, v12}, Lv5/u;->H(I)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v11, v11, 0x1

    .line 174
    .line 175
    move/from16 v2, v18

    .line 176
    .line 177
    move/from16 v9, v25

    .line 178
    .line 179
    move/from16 v10, v26

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    const/4 v7, 0x1

    .line 183
    goto :goto_3

    .line 184
    :cond_3
    move/from16 v18, v2

    .line 185
    .line 186
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    const/4 v4, 0x0

    .line 189
    const/4 v7, 0x1

    .line 190
    goto :goto_2

    .line 191
    :cond_4
    if-nez v6, :cond_5

    .line 192
    .line 193
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_5

    .line 198
    :cond_5
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_5
    move-object v11, v0

    .line 203
    new-instance v0, Lw5/e;

    .line 204
    .line 205
    const/4 v2, 0x1

    .line 206
    add-int/lit8 v12, v1, 0x1

    .line 207
    .line 208
    move-object v10, v0

    .line 209
    invoke-direct/range {v10 .. v17}, Lw5/e;-><init>(Ljava/util/List;IFLjava/lang/String;III)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :catch_0
    move-exception v0

    .line 214
    const-string v1, "Error parsing HEVC config"

    .line 215
    .line 216
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0
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
