.class public final Lo4/f;
.super Lz3/g;
.source "SourceFile"


# instance fields
.field public q:J

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lz3/g;-><init>(I)V

    const/16 v0, 0x20

    iput v0, p0, Lo4/f;->s:I

    return-void
.end method


# virtual methods
.method public final o()V
    .locals 1

    invoke-super {p0}, Lz3/g;->o()V

    const/4 v0, 0x0

    iput v0, p0, Lo4/f;->r:I

    return-void
.end method

.method public final s(Lz3/g;)Z
    .locals 4

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lz3/a;->m(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 10
    .line 11
    .line 12
    const/high16 v0, 0x10000000

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lz3/a;->m(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    xor-int/2addr v0, v1

    .line 19
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {p1, v0}, Lz3/a;->m(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    xor-int/2addr v0, v1

    .line 28
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lo4/f;->r:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    move v3, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v2

    .line 39
    :goto_0
    if-nez v3, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iget v3, p0, Lo4/f;->s:I

    .line 43
    .line 44
    if-lt v0, v3, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p1}, Lz3/a;->n()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Lz3/a;->n()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eq v0, v3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v0, p1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget-object v3, p0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-int/2addr v0, v3

    .line 75
    const v3, 0x2ee000

    .line 76
    .line 77
    .line 78
    if-le v0, v3, :cond_4

    .line 79
    .line 80
    :goto_1
    move v0, v2

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    move v0, v1

    .line 83
    :goto_3
    if-nez v0, :cond_5

    .line 84
    .line 85
    return v2

    .line 86
    :cond_5
    iget v0, p0, Lo4/f;->r:I

    .line 87
    .line 88
    add-int/lit8 v2, v0, 0x1

    .line 89
    .line 90
    iput v2, p0, Lo4/f;->r:I

    .line 91
    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    iget-wide v2, p1, Lz3/g;->e:J

    .line 95
    .line 96
    iput-wide v2, p0, Lz3/g;->e:J

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lz3/a;->m(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    iput v1, p0, Lz3/a;->a:I

    .line 105
    .line 106
    :cond_6
    invoke-virtual {p1}, Lz3/a;->n()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    const/high16 v0, -0x80000000

    .line 113
    .line 114
    iput v0, p0, Lz3/a;->a:I

    .line 115
    .line 116
    :cond_7
    iget-object v0, p1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-virtual {p0, v2}, Lz3/g;->q(I)V

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    :cond_8
    iget-wide v2, p1, Lz3/g;->e:J

    .line 133
    .line 134
    iput-wide v2, p0, Lo4/f;->q:J

    .line 135
    .line 136
    return v1
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
