.class public final Lma/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lma/k;


# direct methods
.method public constructor <init>(Lma/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lma/a0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lma/l;->a:Lma/k;

    iput-object p0, p1, Lma/k;->b:Lma/l;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "output"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(IZ)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->U(IZ)V

    return-void
.end method

.method public final b(ILma/h;)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->W(ILma/h;)V

    return-void
.end method

.method public final c(ID)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->a0(IJ)V

    return-void
.end method

.method public final d(II)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->c0(II)V

    return-void
.end method

.method public final e(II)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->Y(II)V

    return-void
.end method

.method public final f(IJ)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->a0(IJ)V

    return-void
.end method

.method public final g(FI)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lma/k;->Y(II)V

    return-void
.end method

.method public final h(ILma/i1;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lma/l;->a:Lma/k;

    .line 2
    .line 3
    check-cast p3, Lma/s0;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-virtual {v0, p1, v1}, Lma/k;->k0(II)V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lma/k;->b:Lma/l;

    .line 10
    .line 11
    invoke-interface {p2, p3, v1}, Lma/i1;->h(Ljava/lang/Object;Lma/l;)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x4

    .line 15
    invoke-virtual {v0, p1, p2}, Lma/k;->k0(II)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final i(II)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->c0(II)V

    return-void
.end method

.method public final j(IJ)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->n0(IJ)V

    return-void
.end method

.method public final k(ILma/i1;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    check-cast p3, Lma/s0;

    invoke-virtual {v0, p1, p3, p2}, Lma/k;->e0(ILma/s0;Lma/i1;)V

    return-void
.end method

.method public final l(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lma/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lma/l;->a:Lma/k;

    check-cast p2, Lma/h;

    invoke-virtual {v0, p1, p2}, Lma/k;->h0(ILma/h;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lma/l;->a:Lma/k;

    check-cast p2, Lma/s0;

    invoke-virtual {v0, p1, p2}, Lma/k;->g0(ILma/s0;)V

    :goto_0
    return-void
.end method

.method public final m(II)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->Y(II)V

    return-void
.end method

.method public final n(IJ)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->a0(IJ)V

    return-void
.end method

.method public final o(II)V
    .locals 2

    iget-object v0, p0, Lma/l;->a:Lma/k;

    shl-int/lit8 v1, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lma/k;->l0(II)V

    return-void
.end method

.method public final p(IJ)V
    .locals 4

    iget-object v0, p0, Lma/l;->a:Lma/k;

    const/4 v1, 0x1

    shl-long v1, p2, v1

    const/16 v3, 0x3f

    shr-long/2addr p2, v3

    xor-long/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->n0(IJ)V

    return-void
.end method

.method public final q(II)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2}, Lma/k;->l0(II)V

    return-void
.end method

.method public final r(IJ)V
    .locals 1

    iget-object v0, p0, Lma/l;->a:Lma/k;

    invoke-virtual {v0, p1, p2, p3}, Lma/k;->n0(IJ)V

    return-void
.end method
