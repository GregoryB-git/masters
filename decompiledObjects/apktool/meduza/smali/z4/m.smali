.class public final Lz4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/m$a;
    }
.end annotation


# instance fields
.field public final a:Lt5/k;

.field public final b:I

.field public final c:Lz4/m$a;

.field public final d:[B

.field public e:I


# direct methods
.method public constructor <init>(Lt5/j0;ILz4/m$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lez p2, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lx6/b;->q(Z)V

    iput-object p1, p0, Lz4/m;->a:Lt5/k;

    iput p2, p0, Lz4/m;->b:I

    iput-object p3, p0, Lz4/m;->c:Lz4/m$a;

    new-array p1, v0, [B

    iput-object p1, p0, Lz4/m;->d:[B

    iput p2, p0, Lz4/m;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final close()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final f(Lt5/l0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz4/m;->a:Lt5/k;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lt5/k;->f(Lt5/l0;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method

.method public final h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lz4/m;->a:Lt5/k;

    invoke-interface {v0}, Lt5/k;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lz4/m;->a:Lt5/k;

    invoke-interface {v0}, Lt5/k;->l()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final read([BII)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz4/m;->e:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    iget-object v1, v0, Lz4/m;->a:Lt5/k;

    .line 9
    .line 10
    iget-object v3, v0, Lz4/m;->d:[B

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    invoke-interface {v1, v3, v4, v5}, Lt5/h;->read([BII)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    iget-object v1, v0, Lz4/m;->d:[B

    .line 22
    .line 23
    aget-byte v1, v1, v4

    .line 24
    .line 25
    and-int/lit16 v1, v1, 0xff

    .line 26
    .line 27
    shl-int/lit8 v1, v1, 0x4

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    new-array v3, v1, [B

    .line 33
    .line 34
    move v6, v1

    .line 35
    move v7, v4

    .line 36
    :goto_0
    if-lez v6, :cond_3

    .line 37
    .line 38
    iget-object v8, v0, Lz4/m;->a:Lt5/k;

    .line 39
    .line 40
    invoke-interface {v8, v3, v7, v6}, Lt5/h;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-ne v8, v2, :cond_2

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_2
    add-int/2addr v7, v8

    .line 48
    sub-int/2addr v6, v8

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    if-lez v1, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, v1, -0x1

    .line 53
    .line 54
    aget-byte v6, v3, v4

    .line 55
    .line 56
    if-nez v6, :cond_4

    .line 57
    .line 58
    move v1, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    if-lez v1, :cond_6

    .line 61
    .line 62
    iget-object v4, v0, Lz4/m;->c:Lz4/m$a;

    .line 63
    .line 64
    new-instance v6, Lv5/u;

    .line 65
    .line 66
    invoke-direct {v6, v3, v1}, Lv5/u;-><init>([BI)V

    .line 67
    .line 68
    .line 69
    check-cast v4, Lz4/y$a;

    .line 70
    .line 71
    iget-boolean v1, v4, Lz4/y$a;->m:Z

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    iget-wide v7, v4, Lz4/y$a;->j:J

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    iget-object v1, v4, Lz4/y$a;->n:Lz4/y;

    .line 79
    .line 80
    sget-object v3, Lz4/y;->U:Ljava/util/Map;

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Lz4/y;->w(Z)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    iget-wide v9, v4, Lz4/y$a;->j:J

    .line 87
    .line 88
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    :goto_2
    move-wide v10, v7

    .line 93
    iget v1, v6, Lv5/u;->c:I

    .line 94
    .line 95
    iget v3, v6, Lv5/u;->b:I

    .line 96
    .line 97
    sub-int v13, v1, v3

    .line 98
    .line 99
    iget-object v9, v4, Lz4/y$a;->l:Lz4/b0;

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v13, v6}, Lz4/b0;->a(ILv5/u;)V

    .line 105
    .line 106
    .line 107
    const/4 v12, 0x1

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x0

    .line 110
    invoke-interface/range {v9 .. v15}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 111
    .line 112
    .line 113
    iput-boolean v5, v4, Lz4/y$a;->m:Z

    .line 114
    .line 115
    :cond_6
    :goto_3
    move v4, v5

    .line 116
    :goto_4
    if-eqz v4, :cond_7

    .line 117
    .line 118
    iget v1, v0, Lz4/m;->b:I

    .line 119
    .line 120
    iput v1, v0, Lz4/m;->e:I

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_7
    return v2

    .line 124
    :cond_8
    :goto_5
    iget-object v1, v0, Lz4/m;->a:Lt5/k;

    .line 125
    .line 126
    iget v3, v0, Lz4/m;->e:I

    .line 127
    .line 128
    move/from16 v4, p3

    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    move-object/from16 v4, p1

    .line 135
    .line 136
    move/from16 v5, p2

    .line 137
    .line 138
    invoke-interface {v1, v4, v5, v3}, Lt5/h;->read([BII)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eq v1, v2, :cond_9

    .line 143
    .line 144
    iget v2, v0, Lz4/m;->e:I

    .line 145
    .line 146
    sub-int/2addr v2, v1

    .line 147
    iput v2, v0, Lz4/m;->e:I

    .line 148
    .line 149
    :cond_9
    return v1
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
