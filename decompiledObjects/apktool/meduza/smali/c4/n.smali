.class public final Lc4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/t;


# instance fields
.field public final a:Lc4/o;

.field public final b:J


# direct methods
.method public constructor <init>(Lc4/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/n;->a:Lc4/o;

    iput-wide p2, p0, Lc4/n;->b:J

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 13

    .line 1
    iget-object v0, p0, Lc4/n;->a:Lc4/o;

    .line 2
    .line 3
    iget-object v0, v0, Lc4/o;->k:Lc4/o$a;

    .line 4
    .line 5
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc4/n;->a:Lc4/o;

    .line 9
    .line 10
    iget-object v1, v0, Lc4/o;->k:Lc4/o$a;

    .line 11
    .line 12
    iget-object v2, v1, Lc4/o$a;->a:[J

    .line 13
    .line 14
    iget-object v1, v1, Lc4/o$a;->b:[J

    .line 15
    .line 16
    iget v3, v0, Lc4/o;->e:I

    .line 17
    .line 18
    int-to-long v3, v3

    .line 19
    mul-long/2addr v3, p1

    .line 20
    const-wide/32 v5, 0xf4240

    .line 21
    .line 22
    .line 23
    div-long v7, v3, v5

    .line 24
    .line 25
    iget-wide v3, v0, Lc4/o;->j:J

    .line 26
    .line 27
    const-wide/16 v9, 0x1

    .line 28
    .line 29
    sub-long v11, v3, v9

    .line 30
    .line 31
    const-wide/16 v9, 0x0

    .line 32
    .line 33
    invoke-static/range {v7 .. v12}, Lv5/e0;->j(JJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-static {v2, v3, v4, v0}, Lv5/e0;->f([JJZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    const/4 v7, -0x1

    .line 45
    if-ne v0, v7, :cond_0

    .line 46
    .line 47
    move-wide v8, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    aget-wide v8, v2, v0

    .line 50
    .line 51
    :goto_0
    if-ne v0, v7, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    aget-wide v3, v1, v0

    .line 55
    .line 56
    :goto_1
    mul-long/2addr v8, v5

    .line 57
    iget-object v7, p0, Lc4/n;->a:Lc4/o;

    .line 58
    .line 59
    iget v7, v7, Lc4/o;->e:I

    .line 60
    .line 61
    int-to-long v10, v7

    .line 62
    div-long/2addr v8, v10

    .line 63
    iget-wide v10, p0, Lc4/n;->b:J

    .line 64
    .line 65
    add-long/2addr v3, v10

    .line 66
    new-instance v12, Lc4/u;

    .line 67
    .line 68
    invoke-direct {v12, v8, v9, v3, v4}, Lc4/u;-><init>(JJ)V

    .line 69
    .line 70
    .line 71
    cmp-long p1, v8, p1

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    array-length p1, v2

    .line 76
    add-int/lit8 p1, p1, -0x1

    .line 77
    .line 78
    if-ne v0, p1, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    aget-wide p1, v2, v0

    .line 84
    .line 85
    aget-wide v0, v1, v0

    .line 86
    .line 87
    mul-long/2addr p1, v5

    .line 88
    int-to-long v2, v7

    .line 89
    div-long/2addr p1, v2

    .line 90
    add-long/2addr v10, v0

    .line 91
    new-instance v0, Lc4/u;

    .line 92
    .line 93
    invoke-direct {v0, p1, p2, v10, v11}, Lc4/u;-><init>(JJ)V

    .line 94
    .line 95
    .line 96
    new-instance p1, Lc4/t$a;

    .line 97
    .line 98
    invoke-direct {p1, v12, v0}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_3
    :goto_2
    new-instance p1, Lc4/t$a;

    .line 103
    .line 104
    invoke-direct {p1, v12, v12}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 105
    .line 106
    .line 107
    return-object p1
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

.method public final h()J
    .locals 2

    iget-object v0, p0, Lc4/n;->a:Lc4/o;

    invoke-virtual {v0}, Lc4/o;->b()J

    move-result-wide v0

    return-wide v0
.end method
