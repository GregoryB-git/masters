.class public final Lf4/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lc4/o;

.field public final b:I

.field public final c:Lc4/l$a;


# direct methods
.method public constructor <init>(Lc4/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/a$a;->a:Lc4/o;

    iput p2, p0, Lf4/a$a;->b:I

    new-instance p1, Lc4/l$a;

    invoke-direct {p1}, Lc4/l$a;-><init>()V

    iput-object p1, p0, Lf4/a$a;->c:Lc4/l$a;

    return-void
.end method


# virtual methods
.method public final synthetic a()V
    .locals 0

    return-void
.end method

.method public final b(Lc4/i;J)Lc4/a$e;
    .locals 14

    .line 1
    invoke-interface {p1}, Lc4/i;->getPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    invoke-virtual {p0, p1}, Lf4/a$a;->c(Lc4/i;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-interface {p1}, Lc4/i;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    move-object v6, p0

    .line 14
    iget-object v7, v6, Lf4/a$a;->a:Lc4/o;

    .line 15
    .line 16
    iget v7, v7, Lc4/o;->c:I

    .line 17
    .line 18
    const/4 v8, 0x6

    .line 19
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    move-object v8, p1

    .line 24
    invoke-interface {p1, v7}, Lc4/i;->e(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lf4/a$a;->c(Lc4/i;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    invoke-interface {p1}, Lc4/i;->d()J

    .line 32
    .line 33
    .line 34
    move-result-wide v12

    .line 35
    cmp-long v7, v2, p2

    .line 36
    .line 37
    if-gtz v7, :cond_0

    .line 38
    .line 39
    cmp-long v7, v10, p2

    .line 40
    .line 41
    if-lez v7, :cond_0

    .line 42
    .line 43
    invoke-static {v0, v1}, Lc4/a$e;->a(J)Lc4/a$e;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    cmp-long v0, v10, p2

    .line 49
    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Lc4/a$e;

    .line 53
    .line 54
    const/4 v9, -0x2

    .line 55
    move-object v8, v0

    .line 56
    invoke-direct/range {v8 .. v13}, Lc4/a$e;-><init>(IJJ)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    new-instance v7, Lc4/a$e;

    .line 61
    .line 62
    const/4 v1, -0x1

    .line 63
    move-object v0, v7

    .line 64
    invoke-direct/range {v0 .. v5}, Lc4/a$e;-><init>(IJJ)V

    .line 65
    .line 66
    .line 67
    return-object v7
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

.method public final c(Lc4/i;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const-wide/16 v6, 0x6

    .line 14
    .line 15
    sub-long/2addr v4, v6

    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-gez v2, :cond_3

    .line 19
    .line 20
    iget-object v2, v0, Lf4/a$a;->a:Lc4/o;

    .line 21
    .line 22
    iget v3, v0, Lf4/a$a;->b:I

    .line 23
    .line 24
    iget-object v4, v0, Lf4/a$a;->c:Lc4/l$a;

    .line 25
    .line 26
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    const/4 v5, 0x2

    .line 31
    new-array v10, v5, [B

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    invoke-interface {v1, v10, v11, v5}, Lc4/i;->m([BII)V

    .line 35
    .line 36
    .line 37
    aget-byte v12, v10, v11

    .line 38
    .line 39
    and-int/lit16 v12, v12, 0xff

    .line 40
    .line 41
    shl-int/lit8 v12, v12, 0x8

    .line 42
    .line 43
    const/4 v13, 0x1

    .line 44
    aget-byte v14, v10, v13

    .line 45
    .line 46
    and-int/lit16 v14, v14, 0xff

    .line 47
    .line 48
    or-int/2addr v12, v14

    .line 49
    if-eq v12, v3, :cond_0

    .line 50
    .line 51
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 52
    .line 53
    .line 54
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v8, v2

    .line 59
    long-to-int v2, v8

    .line 60
    invoke-interface {v1, v2}, Lc4/i;->e(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_0
    new-instance v12, Lv5/u;

    .line 65
    .line 66
    const/16 v14, 0x10

    .line 67
    .line 68
    invoke-direct {v12, v14}, Lv5/u;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iget-object v14, v12, Lv5/u;->a:[B

    .line 72
    .line 73
    invoke-static {v10, v11, v14, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    iget-object v10, v12, Lv5/u;->a:[B

    .line 77
    .line 78
    const/16 v14, 0xe

    .line 79
    .line 80
    :goto_1
    if-ge v11, v14, :cond_2

    .line 81
    .line 82
    add-int v15, v5, v11

    .line 83
    .line 84
    rsub-int/lit8 v5, v11, 0xe

    .line 85
    .line 86
    invoke-interface {v1, v10, v15, v5}, Lc4/i;->g([BII)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const/4 v15, -0x1

    .line 91
    if-ne v5, v15, :cond_1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_1
    add-int/2addr v11, v5

    .line 95
    const/4 v5, 0x2

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    :goto_2
    invoke-virtual {v12, v11}, Lv5/u;->F(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 101
    .line 102
    .line 103
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    sub-long/2addr v8, v10

    .line 108
    long-to-int v5, v8

    .line 109
    invoke-interface {v1, v5}, Lc4/i;->e(I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v12, v2, v3, v4}, Lc4/l;->a(Lv5/u;Lc4/o;ILc4/l$a;)Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    :goto_3
    if-nez v11, :cond_3

    .line 117
    .line 118
    invoke-interface {v1, v13}, Lc4/i;->e(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 127
    .line 128
    .line 129
    move-result-wide v4

    .line 130
    sub-long/2addr v4, v6

    .line 131
    cmp-long v2, v2, v4

    .line 132
    .line 133
    if-ltz v2, :cond_4

    .line 134
    .line 135
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    invoke-interface/range {p1 .. p1}, Lc4/i;->d()J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    sub-long/2addr v2, v4

    .line 144
    long-to-int v2, v2

    .line 145
    invoke-interface {v1, v2}, Lc4/i;->e(I)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, Lf4/a$a;->a:Lc4/o;

    .line 149
    .line 150
    iget-wide v1, v1, Lc4/o;->j:J

    .line 151
    .line 152
    return-wide v1

    .line 153
    :cond_4
    iget-object v1, v0, Lf4/a$a;->c:Lc4/l$a;

    .line 154
    .line 155
    iget-wide v1, v1, Lc4/l$a;->a:J

    .line 156
    .line 157
    return-wide v1
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
