.class public abstract Lma/u1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(ILjava/nio/ByteBuffer;I)Ljava/lang/String;
    .locals 11

    .line 1
    or-int v0, p0, p2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sub-int/2addr v1, p0

    .line 8
    sub-int/2addr v1, p2

    .line 9
    or-int/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ltz v0, :cond_10

    .line 13
    .line 14
    add-int v0, p0, p2

    .line 15
    .line 16
    new-array p2, p2, [C

    .line 17
    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge p0, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ltz v4, :cond_0

    .line 26
    .line 27
    move v5, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v5, v1

    .line 30
    :goto_1
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 34
    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    int-to-char v4, v4

    .line 38
    aput-char v4, p2, v3

    .line 39
    .line 40
    move v3, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_2
    move v8, v3

    .line 43
    :cond_3
    :goto_3
    if-ge p0, v0, :cond_f

    .line 44
    .line 45
    add-int/lit8 v3, p0, 0x1

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-ltz p0, :cond_4

    .line 52
    .line 53
    move v4, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move v4, v1

    .line 56
    :goto_4
    if-eqz v4, :cond_7

    .line 57
    .line 58
    add-int/lit8 v4, v8, 0x1

    .line 59
    .line 60
    int-to-char p0, p0

    .line 61
    aput-char p0, p2, v8

    .line 62
    .line 63
    move p0, v3

    .line 64
    :goto_5
    move v8, v4

    .line 65
    if-ge p0, v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ltz v3, :cond_5

    .line 72
    .line 73
    move v4, v2

    .line 74
    goto :goto_6

    .line 75
    :cond_5
    move v4, v1

    .line 76
    :goto_6
    if-nez v4, :cond_6

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    add-int/lit8 p0, p0, 0x1

    .line 80
    .line 81
    add-int/lit8 v4, v8, 0x1

    .line 82
    .line 83
    int-to-char v3, v3

    .line 84
    aput-char v3, p2, v8

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_7
    const/16 v4, -0x20

    .line 88
    .line 89
    if-ge p0, v4, :cond_8

    .line 90
    .line 91
    move v4, v2

    .line 92
    goto :goto_7

    .line 93
    :cond_8
    move v4, v1

    .line 94
    :goto_7
    if-eqz v4, :cond_a

    .line 95
    .line 96
    if-ge v3, v0, :cond_9

    .line 97
    .line 98
    add-int/lit8 v4, v3, 0x1

    .line 99
    .line 100
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    add-int/lit8 v5, v8, 0x1

    .line 105
    .line 106
    invoke-static {p0, v3, p2, v8}, Lma/u1$a;->b(BB[CI)V

    .line 107
    .line 108
    .line 109
    move p0, v4

    .line 110
    move v8, v5

    .line 111
    goto :goto_3

    .line 112
    :cond_9
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    throw p0

    .line 117
    :cond_a
    const/16 v4, -0x10

    .line 118
    .line 119
    if-ge p0, v4, :cond_b

    .line 120
    .line 121
    move v4, v2

    .line 122
    goto :goto_8

    .line 123
    :cond_b
    move v4, v1

    .line 124
    :goto_8
    if-eqz v4, :cond_d

    .line 125
    .line 126
    add-int/lit8 v4, v0, -0x1

    .line 127
    .line 128
    if-ge v3, v4, :cond_c

    .line 129
    .line 130
    add-int/lit8 v4, v3, 0x1

    .line 131
    .line 132
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    add-int/lit8 v5, v4, 0x1

    .line 137
    .line 138
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    add-int/lit8 v6, v8, 0x1

    .line 143
    .line 144
    invoke-static {p0, v3, v4, p2, v8}, Lma/u1$a;->c(BBB[CI)V

    .line 145
    .line 146
    .line 147
    move p0, v5

    .line 148
    move v8, v6

    .line 149
    goto :goto_3

    .line 150
    :cond_c
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    throw p0

    .line 155
    :cond_d
    add-int/lit8 v4, v0, -0x2

    .line 156
    .line 157
    if-ge v3, v4, :cond_e

    .line 158
    .line 159
    add-int/lit8 v4, v3, 0x1

    .line 160
    .line 161
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    add-int/lit8 v3, v4, 0x1

    .line 166
    .line 167
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    add-int/lit8 v9, v3, 0x1

    .line 172
    .line 173
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    add-int/lit8 v10, v8, 0x1

    .line 178
    .line 179
    move v3, p0

    .line 180
    move v4, v5

    .line 181
    move v5, v6

    .line 182
    move v6, v7

    .line 183
    move-object v7, p2

    .line 184
    invoke-static/range {v3 .. v8}, Lma/u1$a;->a(BBBB[CI)V

    .line 185
    .line 186
    .line 187
    add-int/lit8 v8, v10, 0x1

    .line 188
    .line 189
    move p0, v9

    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    :cond_e
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    throw p0

    .line 197
    :cond_f
    new-instance p0, Ljava/lang/String;

    .line 198
    .line 199
    invoke-direct {p0, p2, v1, v8}, Ljava/lang/String;-><init>([CII)V

    .line 200
    .line 201
    .line 202
    return-object p0

    .line 203
    :cond_10
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 204
    .line 205
    const/4 v3, 0x3

    .line 206
    new-array v3, v3, [Ljava/lang/Object;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    aput-object p1, v3, v1

    .line 217
    .line 218
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    aput-object p0, v3, v2

    .line 223
    .line 224
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    const/4 p1, 0x2

    .line 229
    aput-object p0, v3, p1

    .line 230
    .line 231
    const-string p0, "buffer limit=%d, index=%d, limit=%d"

    .line 232
    .line 233
    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0
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


# virtual methods
.method public abstract a([BII)Ljava/lang/String;
.end method

.method public abstract c(ILjava/nio/ByteBuffer;I)Ljava/lang/String;
.end method

.method public abstract d(Ljava/lang/CharSequence;[BII)I
.end method

.method public abstract e(I[BII)I
.end method
