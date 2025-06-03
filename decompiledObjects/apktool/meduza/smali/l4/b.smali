.class public final Ll4/b;
.super Ll4/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll4/b$a;
    }
.end annotation


# instance fields
.field public n:Lc4/o;

.field public o:Ll4/b$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll4/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lv5/u;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lv5/u;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v2, v0, v1

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    if-ne v2, v3, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v1

    .line 12
    :goto_0
    if-nez v2, :cond_1

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    const/4 v2, 0x2

    .line 18
    aget-byte v0, v0, v2

    .line 19
    .line 20
    and-int/lit16 v0, v0, 0xff

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    shr-int/2addr v0, v2

    .line 24
    const/4 v3, 0x6

    .line 25
    if-eq v0, v3, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x7

    .line 28
    if-ne v0, v3, :cond_3

    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1, v2}, Lv5/u;->H(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lv5/u;->B()J

    .line 34
    .line 35
    .line 36
    :cond_3
    invoke-static {v0, p1}, Lc4/l;->b(ILv5/u;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v1}, Lv5/u;->G(I)V

    .line 41
    .line 42
    .line 43
    int-to-long v0, v0

    .line 44
    return-wide v0
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

.method public final c(Lv5/u;JLl4/h$a;)Z
    .locals 21

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
    iget-object v3, v1, Lv5/u;->a:[B

    .line 8
    .line 9
    iget-object v4, v0, Ll4/b;->n:Lc4/o;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance v4, Lc4/o;

    .line 15
    .line 16
    const/16 v6, 0x11

    .line 17
    .line 18
    invoke-direct {v4, v3, v6}, Lc4/o;-><init>([BI)V

    .line 19
    .line 20
    .line 21
    iput-object v4, v0, Ll4/b;->n:Lc4/o;

    .line 22
    .line 23
    const/16 v6, 0x9

    .line 24
    .line 25
    iget v1, v1, Lv5/u;->c:I

    .line 26
    .line 27
    invoke-static {v3, v6, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v4, v1, v3}, Lc4/o;->c([BLp4/a;)Lv3/i0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v2, Ll4/h$a;->a:Lv3/i0;

    .line 37
    .line 38
    return v5

    .line 39
    :cond_0
    const/4 v6, 0x0

    .line 40
    aget-byte v3, v3, v6

    .line 41
    .line 42
    and-int/lit8 v7, v3, 0x7f

    .line 43
    .line 44
    const/4 v8, 0x3

    .line 45
    if-ne v7, v8, :cond_1

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, Lc4/m;->a(Lv5/u;)Lc4/o$a;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, Lc4/o;

    .line 52
    .line 53
    iget v10, v4, Lc4/o;->a:I

    .line 54
    .line 55
    iget v11, v4, Lc4/o;->b:I

    .line 56
    .line 57
    iget v12, v4, Lc4/o;->c:I

    .line 58
    .line 59
    iget v13, v4, Lc4/o;->d:I

    .line 60
    .line 61
    iget v14, v4, Lc4/o;->e:I

    .line 62
    .line 63
    iget v15, v4, Lc4/o;->g:I

    .line 64
    .line 65
    iget v3, v4, Lc4/o;->h:I

    .line 66
    .line 67
    iget-wide v6, v4, Lc4/o;->j:J

    .line 68
    .line 69
    iget-object v4, v4, Lc4/o;->l:Lp4/a;

    .line 70
    .line 71
    move-object v9, v2

    .line 72
    move/from16 v16, v3

    .line 73
    .line 74
    move-wide/from16 v17, v6

    .line 75
    .line 76
    move-object/from16 v19, v1

    .line 77
    .line 78
    move-object/from16 v20, v4

    .line 79
    .line 80
    invoke-direct/range {v9 .. v20}, Lc4/o;-><init>(IIIIIIIJLc4/o$a;Lp4/a;)V

    .line 81
    .line 82
    .line 83
    iput-object v2, v0, Ll4/b;->n:Lc4/o;

    .line 84
    .line 85
    new-instance v3, Ll4/b$a;

    .line 86
    .line 87
    invoke-direct {v3, v2, v1}, Ll4/b$a;-><init>(Lc4/o;Lc4/o$a;)V

    .line 88
    .line 89
    .line 90
    iput-object v3, v0, Ll4/b;->o:Ll4/b$a;

    .line 91
    .line 92
    return v5

    .line 93
    :cond_1
    const/4 v1, -0x1

    .line 94
    if-ne v3, v1, :cond_2

    .line 95
    .line 96
    move v1, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move v1, v6

    .line 99
    :goto_0
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object v1, v0, Ll4/b;->o:Ll4/b$a;

    .line 102
    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    move-wide/from16 v3, p2

    .line 106
    .line 107
    iput-wide v3, v1, Ll4/b$a;->c:J

    .line 108
    .line 109
    iput-object v1, v2, Ll4/h$a;->b:Ll4/b$a;

    .line 110
    .line 111
    :cond_3
    iget-object v1, v2, Ll4/h$a;->a:Lv3/i0;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    return v6

    .line 117
    :cond_4
    return v5
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

.method public final d(Z)V
    .locals 0

    invoke-super {p0, p1}, Ll4/h;->d(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll4/b;->n:Lc4/o;

    iput-object p1, p0, Ll4/b;->o:Ll4/b$a;

    :cond_0
    return-void
.end method
