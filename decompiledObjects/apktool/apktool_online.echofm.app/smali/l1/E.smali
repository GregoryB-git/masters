.class public final Ll1/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/K;


# instance fields
.field public final a:Ll1/D;

.field public final b:Lg0/z;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ll1/D;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/E;->a:Ll1/D;

    .line 5
    .line 6
    new-instance p1, Lg0/z;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ll1/E;->b:Lg0/z;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(Lg0/z;I)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p2, v1

    .line 9
    :goto_0
    const/4 v2, -0x1

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    add-int/2addr v4, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v4, v2

    .line 23
    :goto_1
    iget-boolean v3, p0, Ll1/E;->f:Z

    .line 24
    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    if-nez p2, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    iput-boolean v1, p0, Ll1/E;->f:Z

    .line 31
    .line 32
    invoke-virtual {p1, v4}, Lg0/z;->T(I)V

    .line 33
    .line 34
    .line 35
    :goto_2
    iput v1, p0, Ll1/E;->d:I

    .line 36
    .line 37
    :cond_3
    :goto_3
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-lez p2, :cond_9

    .line 42
    .line 43
    iget p2, p0, Ll1/E;->d:I

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    if-ge p2, v3, :cond_6

    .line 47
    .line 48
    if-nez p2, :cond_4

    .line 49
    .line 50
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    sub-int/2addr v4, v0

    .line 59
    invoke-virtual {p1, v4}, Lg0/z;->T(I)V

    .line 60
    .line 61
    .line 62
    const/16 v4, 0xff

    .line 63
    .line 64
    if-ne p2, v4, :cond_4

    .line 65
    .line 66
    iput-boolean v0, p0, Ll1/E;->f:Z

    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    iget v4, p0, Ll1/E;->d:I

    .line 74
    .line 75
    rsub-int/lit8 v4, v4, 0x3

    .line 76
    .line 77
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iget-object v4, p0, Ll1/E;->b:Lg0/z;

    .line 82
    .line 83
    invoke-virtual {v4}, Lg0/z;->e()[B

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget v5, p0, Ll1/E;->d:I

    .line 88
    .line 89
    invoke-virtual {p1, v4, v5, p2}, Lg0/z;->l([BII)V

    .line 90
    .line 91
    .line 92
    iget v4, p0, Ll1/E;->d:I

    .line 93
    .line 94
    add-int/2addr v4, p2

    .line 95
    iput v4, p0, Ll1/E;->d:I

    .line 96
    .line 97
    if-ne v4, v3, :cond_3

    .line 98
    .line 99
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 100
    .line 101
    invoke-virtual {p2, v1}, Lg0/z;->T(I)V

    .line 102
    .line 103
    .line 104
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 105
    .line 106
    invoke-virtual {p2, v3}, Lg0/z;->S(I)V

    .line 107
    .line 108
    .line 109
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 110
    .line 111
    invoke-virtual {p2, v0}, Lg0/z;->U(I)V

    .line 112
    .line 113
    .line 114
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 115
    .line 116
    invoke-virtual {p2}, Lg0/z;->G()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    iget-object v4, p0, Ll1/E;->b:Lg0/z;

    .line 121
    .line 122
    invoke-virtual {v4}, Lg0/z;->G()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    and-int/lit16 v5, p2, 0x80

    .line 127
    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    move v5, v0

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    move v5, v1

    .line 133
    :goto_4
    iput-boolean v5, p0, Ll1/E;->e:Z

    .line 134
    .line 135
    and-int/lit8 p2, p2, 0xf

    .line 136
    .line 137
    shl-int/lit8 p2, p2, 0x8

    .line 138
    .line 139
    or-int/2addr p2, v4

    .line 140
    add-int/2addr p2, v3

    .line 141
    iput p2, p0, Ll1/E;->c:I

    .line 142
    .line 143
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 144
    .line 145
    invoke-virtual {p2}, Lg0/z;->b()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    iget v3, p0, Ll1/E;->c:I

    .line 150
    .line 151
    if-ge p2, v3, :cond_3

    .line 152
    .line 153
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 154
    .line 155
    invoke-virtual {p2}, Lg0/z;->b()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    mul-int/lit8 p2, p2, 0x2

    .line 160
    .line 161
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    const/16 v3, 0x1002

    .line 166
    .line 167
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    iget-object v3, p0, Ll1/E;->b:Lg0/z;

    .line 172
    .line 173
    invoke-virtual {v3, p2}, Lg0/z;->c(I)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :cond_6
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    iget v3, p0, Ll1/E;->c:I

    .line 183
    .line 184
    iget v4, p0, Ll1/E;->d:I

    .line 185
    .line 186
    sub-int/2addr v3, v4

    .line 187
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    iget-object v3, p0, Ll1/E;->b:Lg0/z;

    .line 192
    .line 193
    invoke-virtual {v3}, Lg0/z;->e()[B

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iget v4, p0, Ll1/E;->d:I

    .line 198
    .line 199
    invoke-virtual {p1, v3, v4, p2}, Lg0/z;->l([BII)V

    .line 200
    .line 201
    .line 202
    iget v3, p0, Ll1/E;->d:I

    .line 203
    .line 204
    add-int/2addr v3, p2

    .line 205
    iput v3, p0, Ll1/E;->d:I

    .line 206
    .line 207
    iget p2, p0, Ll1/E;->c:I

    .line 208
    .line 209
    if-ne v3, p2, :cond_3

    .line 210
    .line 211
    iget-boolean v3, p0, Ll1/E;->e:Z

    .line 212
    .line 213
    if-eqz v3, :cond_8

    .line 214
    .line 215
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 216
    .line 217
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    iget v3, p0, Ll1/E;->c:I

    .line 222
    .line 223
    invoke-static {p2, v1, v3, v2}, Lg0/M;->x([BIII)I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    if-eqz p2, :cond_7

    .line 228
    .line 229
    iput-boolean v0, p0, Ll1/E;->f:Z

    .line 230
    .line 231
    return-void

    .line 232
    :cond_7
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 233
    .line 234
    iget v3, p0, Ll1/E;->c:I

    .line 235
    .line 236
    add-int/lit8 v3, v3, -0x4

    .line 237
    .line 238
    invoke-virtual {p2, v3}, Lg0/z;->S(I)V

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_8
    iget-object v3, p0, Ll1/E;->b:Lg0/z;

    .line 243
    .line 244
    invoke-virtual {v3, p2}, Lg0/z;->S(I)V

    .line 245
    .line 246
    .line 247
    :goto_5
    iget-object p2, p0, Ll1/E;->b:Lg0/z;

    .line 248
    .line 249
    invoke-virtual {p2, v1}, Lg0/z;->T(I)V

    .line 250
    .line 251
    .line 252
    iget-object p2, p0, Ll1/E;->a:Ll1/D;

    .line 253
    .line 254
    iget-object v3, p0, Ll1/E;->b:Lg0/z;

    .line 255
    .line 256
    invoke-interface {p2, v3}, Ll1/D;->a(Lg0/z;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_2

    .line 260
    .line 261
    :cond_9
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll1/E;->f:Z

    .line 3
    .line 4
    return-void
.end method

.method public c(Lg0/E;LF0/t;Ll1/K$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/E;->a:Ll1/D;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ll1/D;->c(Lg0/E;LF0/t;Ll1/K$d;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ll1/E;->f:Z

    .line 8
    .line 9
    return-void
.end method
