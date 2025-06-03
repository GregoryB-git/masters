.class public final Lma/k$d;
.super Lma/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final h:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    invoke-direct {p0, p2}, Lma/k$a;-><init>(I)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lma/k$d;->h:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final T(B)V
    .locals 3

    iget v0, p0, Lma/k$a;->g:I

    iget v1, p0, Lma/k$a;->f:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lma/k$d;->u0()V

    :cond_0
    iget-object v0, p0, Lma/k$a;->e:[B

    iget v1, p0, Lma/k$a;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lma/k$a;->g:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final U(IZ)V
    .locals 2

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    int-to-byte p1, p2

    iget-object p2, p0, Lma/k$a;->e:[B

    iget v0, p0, Lma/k$a;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lma/k$a;->g:I

    aput-byte p1, p2, v0

    return-void
.end method

.method public final V([BI)V
    .locals 1

    invoke-virtual {p0, p2}, Lma/k$d;->m0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lma/k$d;->w0([BII)V

    return-void
.end method

.method public final W(ILma/h;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lma/k$d;->k0(II)V

    invoke-virtual {p0, p2}, Lma/k$d;->X(Lma/h;)V

    return-void
.end method

.method public final X(Lma/h;)V
    .locals 1

    invoke-virtual {p1}, Lma/h;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lma/k$d;->m0(I)V

    invoke-virtual {p1, p0}, Lma/h;->B(Lm/e;)V

    return-void
.end method

.method public final Y(II)V
    .locals 1

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    invoke-virtual {p0, p2}, Lma/k$a;->p0(I)V

    return-void
.end method

.method public final Z(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    invoke-virtual {p0, p1}, Lma/k$a;->p0(I)V

    return-void
.end method

.method public final a0(IJ)V
    .locals 1

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    invoke-virtual {p0, p2, p3}, Lma/k$a;->q0(J)V

    return-void
.end method

.method public final b0(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    invoke-virtual {p0, p1, p2}, Lma/k$a;->q0(J)V

    return-void
.end method

.method public final c0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, Lma/k$a;->s0(I)V

    goto :goto_0

    :cond_0
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lma/k$a;->t0(J)V

    :goto_0
    return-void
.end method

.method public final d0(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lma/k$d;->m0(I)V

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lma/k$d;->o0(J)V

    :goto_0
    return-void
.end method

.method public final e0(ILma/s0;Lma/i1;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lma/k$d;->k0(II)V

    move-object p1, p2

    check-cast p1, Lma/a;

    invoke-virtual {p1, p3}, Lma/a;->m(Lma/i1;)I

    move-result p1

    invoke-virtual {p0, p1}, Lma/k$d;->m0(I)V

    iget-object p1, p0, Lma/k;->b:Lma/l;

    invoke-interface {p3, p2, p1}, Lma/i1;->h(Ljava/lang/Object;Lma/l;)V

    return-void
.end method

.method public final f0(Lma/s0;)V
    .locals 1

    invoke-interface {p1}, Lma/s0;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lma/k$d;->m0(I)V

    invoke-interface {p1, p0}, Lma/s0;->i(Lma/k;)V

    return-void
.end method

.method public final g0(ILma/s0;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p0, v0, v1}, Lma/k$d;->k0(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2, p1}, Lma/k$d;->l0(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lma/k$d;->k0(II)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lma/k$d;->f0(Lma/s0;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x4

    .line 17
    invoke-virtual {p0, v0, p1}, Lma/k$d;->k0(II)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final h0(ILma/h;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lma/k$d;->k0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lma/k$d;->l0(II)V

    invoke-virtual {p0, v1, p2}, Lma/k$d;->W(ILma/h;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lma/k$d;->k0(II)V

    return-void
.end method

.method public final i0(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lma/k$d;->k0(II)V

    invoke-virtual {p0, p2}, Lma/k$d;->j0(Ljava/lang/String;)V

    return-void
.end method

.method public final j0(Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x3

    .line 6
    .line 7
    invoke-static {v0}, Lma/k;->P(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int v2, v1, v0

    .line 12
    .line 13
    iget v3, p0, Lma/k$a;->f:I

    .line 14
    .line 15
    if-le v2, v3, :cond_0

    .line 16
    .line 17
    new-array v1, v0, [B

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    sget-object v3, Lma/u1;->a:Lma/u1$b;

    .line 21
    .line 22
    invoke-virtual {v3, p1, v1, v2, v0}, Lma/u1$b;->d(Ljava/lang/CharSequence;[BII)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0, v0}, Lma/k$d;->m0(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1, v2, v0}, Lma/k$d;->w0([BII)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget v0, p0, Lma/k$a;->g:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    if-le v2, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lma/k$d;->u0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Lma/k;->P(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v2, p0, Lma/k$a;->g:I
    :try_end_0
    .catch Lma/u1$d; {:try_start_0 .. :try_end_0} :catch_2

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    add-int v1, v2, v0

    .line 54
    .line 55
    :try_start_1
    iput v1, p0, Lma/k$a;->g:I

    .line 56
    .line 57
    iget-object v3, p0, Lma/k$a;->e:[B

    .line 58
    .line 59
    iget v4, p0, Lma/k$a;->f:I

    .line 60
    .line 61
    sub-int/2addr v4, v1

    .line 62
    sget-object v5, Lma/u1;->a:Lma/u1$b;

    .line 63
    .line 64
    invoke-virtual {v5, p1, v3, v1, v4}, Lma/u1$b;->d(Ljava/lang/CharSequence;[BII)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iput v2, p0, Lma/k$a;->g:I

    .line 69
    .line 70
    sub-int v3, v1, v2

    .line 71
    .line 72
    sub-int/2addr v3, v0

    .line 73
    invoke-virtual {p0, v3}, Lma/k$a;->s0(I)V

    .line 74
    .line 75
    .line 76
    iput v1, p0, Lma/k$a;->g:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catch_0
    move-exception v0

    .line 80
    goto :goto_0

    .line 81
    :catch_1
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-static {p1}, Lma/u1;->b(Ljava/lang/CharSequence;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p0, v0}, Lma/k$a;->s0(I)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lma/k$a;->e:[B

    .line 91
    .line 92
    iget v3, p0, Lma/k$a;->g:I

    .line 93
    .line 94
    sget-object v4, Lma/u1;->a:Lma/u1$b;

    .line 95
    .line 96
    invoke-virtual {v4, p1, v1, v3, v0}, Lma/u1$b;->d(Ljava/lang/CharSequence;[BII)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, p0, Lma/k$a;->g:I
    :try_end_1
    .catch Lma/u1$d; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :goto_0
    :try_start_2
    new-instance v1, Lma/k$c;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Lma/k$c;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :goto_1
    iput v2, p0, Lma/k$a;->g:I

    .line 110
    .line 111
    throw v0
    :try_end_2
    .catch Lma/u1$d; {:try_start_2 .. :try_end_2} :catch_2

    .line 112
    :catch_2
    move-exception v0

    .line 113
    invoke-virtual {p0, p1, v0}, Lma/k;->S(Ljava/lang/String;Lma/u1$d;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    return-void
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

.method public final k0(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lma/k$d;->m0(I)V

    return-void
.end method

.method public final l0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    invoke-virtual {p0, p2}, Lma/k$a;->s0(I)V

    return-void
.end method

.method public final m0(I)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    invoke-virtual {p0, p1}, Lma/k$a;->s0(I)V

    return-void
.end method

.method public final n0(IJ)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lma/k$a;->r0(II)V

    invoke-virtual {p0, p2, p3}, Lma/k$a;->t0(J)V

    return-void
.end method

.method public final o0(J)V
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lma/k$d;->v0(I)V

    invoke-virtual {p0, p1, p2}, Lma/k$a;->t0(J)V

    return-void
.end method

.method public final s([BII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lma/k$d;->w0([BII)V

    return-void
.end method

.method public final u0()V
    .locals 4

    iget-object v0, p0, Lma/k$d;->h:Ljava/io/OutputStream;

    iget-object v1, p0, Lma/k$a;->e:[B

    iget v2, p0, Lma/k$a;->g:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lma/k$a;->g:I

    return-void
.end method

.method public final v0(I)V
    .locals 2

    iget v0, p0, Lma/k$a;->f:I

    iget v1, p0, Lma/k$a;->g:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Lma/k$d;->u0()V

    :cond_0
    return-void
.end method

.method public final w0([BII)V
    .locals 3

    iget v0, p0, Lma/k$a;->f:I

    iget v1, p0, Lma/k$a;->g:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lma/k$a;->e:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lma/k$a;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lma/k$a;->g:I

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lma/k$a;->e:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v0, p0, Lma/k$a;->f:I

    iput v0, p0, Lma/k$a;->g:I

    invoke-virtual {p0}, Lma/k$d;->u0()V

    iget v0, p0, Lma/k$a;->f:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, Lma/k$a;->e:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lma/k$a;->g:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lma/k$d;->h:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void
.end method
