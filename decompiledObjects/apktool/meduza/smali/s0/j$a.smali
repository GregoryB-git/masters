.class public abstract Ls0/j$a;
.super Ls0/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final e:[B

.field public final f:I

.field public g:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/j;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x14

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-array p1, p1, [B

    .line 13
    .line 14
    iput-object p1, p0, Ls0/j$a;->e:[B

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    iput p1, p0, Ls0/j$a;->f:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "bufferSize must be >= 0"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
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


# virtual methods
.method public final p0(I)V
    .locals 4

    iget-object v0, p0, Ls0/j$a;->e:[B

    iget v1, p0, Ls0/j$a;->g:I

    add-int/lit8 v2, v1, 0x1

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Ls0/j$a;->g:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    return-void
.end method

.method public final q0(J)V
    .locals 7

    iget-object v0, p0, Ls0/j$a;->e:[B

    iget v1, p0, Ls0/j$a;->g:I

    add-int/lit8 v2, v1, 0x1

    const-wide/16 v3, 0xff

    and-long v5, p1, v3

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v5, 0x8

    shr-long v5, p1, v5

    and-long/2addr v5, v3

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x1

    const/16 v5, 0x10

    shr-long v5, p1, v5

    and-long/2addr v5, v3

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v5, 0x18

    shr-long v5, p1, v5

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v3, 0x28

    shr-long v3, p1, v3

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x30

    shr-long v3, p1, v3

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Ls0/j$a;->g:I

    const/16 v1, 0x38

    shr-long/2addr p1, v1

    long-to-int p1, p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    return-void
.end method

.method public final r0(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Ls0/j$a;->s0(I)V

    return-void
.end method

.method public final s0(I)V
    .locals 4

    .line 1
    sget-boolean v0, Ls0/j;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 10
    .line 11
    iget v1, p0, Ls0/j$a;->g:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    iput v2, p0, Ls0/j$a;->g:I

    .line 16
    .line 17
    int-to-long v1, v1

    .line 18
    int-to-byte p1, p1

    .line 19
    invoke-static {v0, v1, v2, p1}, Ls0/l1;->p([BJB)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 24
    .line 25
    iget v1, p0, Ls0/j$a;->g:I

    .line 26
    .line 27
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    iput v2, p0, Ls0/j$a;->g:I

    .line 30
    .line 31
    int-to-long v1, v1

    .line 32
    and-int/lit8 v3, p1, 0x7f

    .line 33
    .line 34
    or-int/lit16 v3, v3, 0x80

    .line 35
    .line 36
    int-to-byte v3, v3

    .line 37
    invoke-static {v0, v1, v2, v3}, Ls0/l1;->p([BJB)V

    .line 38
    .line 39
    .line 40
    ushr-int/lit8 p1, p1, 0x7

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    and-int/lit8 v0, p1, -0x80

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 48
    .line 49
    iget v1, p0, Ls0/j$a;->g:I

    .line 50
    .line 51
    add-int/lit8 v2, v1, 0x1

    .line 52
    .line 53
    iput v2, p0, Ls0/j$a;->g:I

    .line 54
    .line 55
    int-to-byte p1, p1

    .line 56
    aput-byte p1, v0, v1

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 60
    .line 61
    iget v1, p0, Ls0/j$a;->g:I

    .line 62
    .line 63
    add-int/lit8 v2, v1, 0x1

    .line 64
    .line 65
    iput v2, p0, Ls0/j$a;->g:I

    .line 66
    .line 67
    and-int/lit8 v2, p1, 0x7f

    .line 68
    .line 69
    or-int/lit16 v2, v2, 0x80

    .line 70
    .line 71
    int-to-byte v2, v2

    .line 72
    aput-byte v2, v0, v1

    .line 73
    .line 74
    ushr-int/lit8 p1, p1, 0x7

    .line 75
    .line 76
    goto :goto_1
    .line 77
.end method

.method public final t0(J)V
    .locals 9

    .line 1
    sget-boolean v0, Ls0/j;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    const-wide/16 v4, -0x80

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :goto_0
    and-long v6, p1, v4

    .line 11
    .line 12
    cmp-long v0, v6, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 17
    .line 18
    iget v1, p0, Ls0/j$a;->g:I

    .line 19
    .line 20
    add-int/lit8 v2, v1, 0x1

    .line 21
    .line 22
    iput v2, p0, Ls0/j$a;->g:I

    .line 23
    .line 24
    int-to-long v1, v1

    .line 25
    long-to-int p1, p1

    .line 26
    int-to-byte p1, p1

    .line 27
    invoke-static {v0, v1, v2, p1}, Ls0/l1;->p([BJB)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 32
    .line 33
    iget v6, p0, Ls0/j$a;->g:I

    .line 34
    .line 35
    add-int/lit8 v7, v6, 0x1

    .line 36
    .line 37
    iput v7, p0, Ls0/j$a;->g:I

    .line 38
    .line 39
    int-to-long v6, v6

    .line 40
    long-to-int v8, p1

    .line 41
    and-int/lit8 v8, v8, 0x7f

    .line 42
    .line 43
    or-int/lit16 v8, v8, 0x80

    .line 44
    .line 45
    int-to-byte v8, v8

    .line 46
    invoke-static {v0, v6, v7, v8}, Ls0/l1;->p([BJB)V

    .line 47
    .line 48
    .line 49
    ushr-long/2addr p1, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    and-long v6, p1, v4

    .line 52
    .line 53
    cmp-long v0, v6, v2

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 58
    .line 59
    iget v1, p0, Ls0/j$a;->g:I

    .line 60
    .line 61
    add-int/lit8 v2, v1, 0x1

    .line 62
    .line 63
    iput v2, p0, Ls0/j$a;->g:I

    .line 64
    .line 65
    long-to-int p1, p1

    .line 66
    int-to-byte p1, p1

    .line 67
    aput-byte p1, v0, v1

    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    iget-object v0, p0, Ls0/j$a;->e:[B

    .line 71
    .line 72
    iget v6, p0, Ls0/j$a;->g:I

    .line 73
    .line 74
    add-int/lit8 v7, v6, 0x1

    .line 75
    .line 76
    iput v7, p0, Ls0/j$a;->g:I

    .line 77
    .line 78
    long-to-int v7, p1

    .line 79
    and-int/lit8 v7, v7, 0x7f

    .line 80
    .line 81
    or-int/lit16 v7, v7, 0x80

    .line 82
    .line 83
    int-to-byte v7, v7

    .line 84
    aput-byte v7, v0, v6

    .line 85
    .line 86
    ushr-long/2addr p1, v1

    .line 87
    goto :goto_1
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
.end method
