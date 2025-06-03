.class public final Lc5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;


# instance fields
.field public final a:Lv3/i0;

.field public final b:Lr4/c;

.field public c:[J

.field public d:Z

.field public e:Ld5/f;

.field public f:Z

.field public o:I

.field public p:J


# direct methods
.method public constructor <init>(Ld5/f;Lv3/i0;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc5/f;->a:Lv3/i0;

    iput-object p1, p0, Lc5/f;->e:Ld5/f;

    new-instance p2, Lr4/c;

    invoke-direct {p2}, Lr4/c;-><init>()V

    iput-object p2, p0, Lc5/f;->b:Lr4/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lc5/f;->p:J

    iget-object p2, p1, Ld5/f;->b:[J

    iput-object p2, p0, Lc5/f;->c:[J

    invoke-virtual {p0, p1, p3}, Lc5/f;->d(Ld5/f;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c(J)V
    .locals 3

    iget-object v0, p0, Lc5/f;->c:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lv5/e0;->b([JJZ)I

    move-result v0

    iput v0, p0, Lc5/f;->o:I

    iget-boolean v2, p0, Lc5/f;->d:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lc5/f;->c:[J

    array-length v2, v2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide p1, p0, Lc5/f;->p:J

    return-void
.end method

.method public final d(Ld5/f;Z)V
    .locals 8

    iget v0, p0, Lc5/f;->o:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lc5/f;->c:[J

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, v3, v0

    :goto_0
    iput-boolean p2, p0, Lc5/f;->d:Z

    iput-object p1, p0, Lc5/f;->e:Ld5/f;

    iget-object p1, p1, Ld5/f;->b:[J

    iput-object p1, p0, Lc5/f;->c:[J

    iget-wide v6, p0, Lc5/f;->p:J

    cmp-long p2, v6, v1

    if-eqz p2, :cond_1

    invoke-virtual {p0, v6, v7}, Lc5/f;->c(J)V

    goto :goto_1

    :cond_1
    cmp-long p2, v4, v1

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p1, v4, v5, p2}, Lv5/e0;->b([JJZ)I

    move-result p1

    iput p1, p0, Lc5/f;->o:I

    :cond_2
    :goto_1
    return-void
.end method

.method public final m(J)I
    .locals 3

    iget v0, p0, Lc5/f;->o:I

    iget-object v1, p0, Lc5/f;->c:[J

    const/4 v2, 0x1

    invoke-static {v1, p1, p2, v2}, Lv5/e0;->b([JJZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Lc5/f;->o:I

    sub-int p2, p1, p2

    iput p1, p0, Lc5/f;->o:I

    return p2
.end method

.method public final r(Ll3/l;Lz3/g;I)I
    .locals 6

    .line 1
    iget v0, p0, Lc5/f;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Lc5/f;->c:[J

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    const/4 v3, -0x4

    .line 13
    const/4 v4, 0x4

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-boolean v5, p0, Lc5/f;->d:Z

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    iput v4, p2, Lz3/a;->a:I

    .line 21
    .line 22
    return v3

    .line 23
    :cond_1
    and-int/lit8 v5, p3, 0x2

    .line 24
    .line 25
    if-nez v5, :cond_6

    .line 26
    .line 27
    iget-boolean v5, p0, Lc5/f;->f:Z

    .line 28
    .line 29
    if-nez v5, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const/4 p1, -0x3

    .line 35
    return p1

    .line 36
    :cond_3
    and-int/lit8 p1, p3, 0x1

    .line 37
    .line 38
    if-nez p1, :cond_4

    .line 39
    .line 40
    add-int/lit8 p1, v0, 0x1

    .line 41
    .line 42
    iput p1, p0, Lc5/f;->o:I

    .line 43
    .line 44
    :cond_4
    and-int/lit8 p1, p3, 0x4

    .line 45
    .line 46
    if-nez p1, :cond_5

    .line 47
    .line 48
    iget-object p1, p0, Lc5/f;->b:Lr4/c;

    .line 49
    .line 50
    iget-object p3, p0, Lc5/f;->e:Ld5/f;

    .line 51
    .line 52
    iget-object p3, p3, Ld5/f;->a:[Lr4/a;

    .line 53
    .line 54
    aget-object p3, p3, v0

    .line 55
    .line 56
    invoke-virtual {p1, p3}, Lr4/c;->e(Lr4/a;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    array-length p3, p1

    .line 61
    invoke-virtual {p2, p3}, Lz3/g;->q(I)V

    .line 62
    .line 63
    .line 64
    iget-object p3, p2, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    :cond_5
    iget-object p1, p0, Lc5/f;->c:[J

    .line 70
    .line 71
    aget-wide v0, p1, v0

    .line 72
    .line 73
    iput-wide v0, p2, Lz3/g;->e:J

    .line 74
    .line 75
    iput v2, p2, Lz3/a;->a:I

    .line 76
    .line 77
    return v3

    .line 78
    :cond_6
    :goto_1
    iget-object p2, p0, Lc5/f;->a:Lv3/i0;

    .line 79
    .line 80
    iput-object p2, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 81
    .line 82
    iput-boolean v2, p0, Lc5/f;->f:Z

    .line 83
    .line 84
    const/4 p1, -0x5

    .line 85
    return p1
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
