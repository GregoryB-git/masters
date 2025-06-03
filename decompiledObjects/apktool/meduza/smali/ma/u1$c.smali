.class public final Lma/u1$c;
.super Lma/u1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lma/u1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([BII)Ljava/lang/String;
    .locals 11

    .line 1
    or-int v0, p2, p3

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    sub-int/2addr v1, p2

    .line 5
    sub-int/2addr v1, p3

    .line 6
    or-int/2addr v0, v1

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ltz v0, :cond_10

    .line 10
    .line 11
    add-int v0, p2, p3

    .line 12
    .line 13
    new-array p3, p3, [C

    .line 14
    .line 15
    move v3, v1

    .line 16
    :goto_0
    if-ge p2, v0, :cond_2

    .line 17
    .line 18
    aget-byte v4, p1, p2

    .line 19
    .line 20
    if-ltz v4, :cond_0

    .line 21
    .line 22
    move v5, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v5, v1

    .line 25
    :goto_1
    if-nez v5, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    add-int/lit8 v5, v3, 0x1

    .line 31
    .line 32
    int-to-char v4, v4

    .line 33
    aput-char v4, p3, v3

    .line 34
    .line 35
    move v3, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_2
    move v8, v3

    .line 38
    :cond_3
    :goto_3
    if-ge p2, v0, :cond_f

    .line 39
    .line 40
    add-int/lit8 v3, p2, 0x1

    .line 41
    .line 42
    aget-byte p2, p1, p2

    .line 43
    .line 44
    if-ltz p2, :cond_4

    .line 45
    .line 46
    move v4, v2

    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move v4, v1

    .line 49
    :goto_4
    if-eqz v4, :cond_7

    .line 50
    .line 51
    add-int/lit8 v4, v8, 0x1

    .line 52
    .line 53
    int-to-char p2, p2

    .line 54
    aput-char p2, p3, v8

    .line 55
    .line 56
    move p2, v3

    .line 57
    :goto_5
    move v8, v4

    .line 58
    if-ge p2, v0, :cond_3

    .line 59
    .line 60
    aget-byte v3, p1, p2

    .line 61
    .line 62
    if-ltz v3, :cond_5

    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_6

    .line 66
    :cond_5
    move v4, v1

    .line 67
    :goto_6
    if-nez v4, :cond_6

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    add-int/lit8 p2, p2, 0x1

    .line 71
    .line 72
    add-int/lit8 v4, v8, 0x1

    .line 73
    .line 74
    int-to-char v3, v3

    .line 75
    aput-char v3, p3, v8

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    const/16 v4, -0x20

    .line 79
    .line 80
    if-ge p2, v4, :cond_8

    .line 81
    .line 82
    move v4, v2

    .line 83
    goto :goto_7

    .line 84
    :cond_8
    move v4, v1

    .line 85
    :goto_7
    if-eqz v4, :cond_a

    .line 86
    .line 87
    if-ge v3, v0, :cond_9

    .line 88
    .line 89
    add-int/lit8 v4, v3, 0x1

    .line 90
    .line 91
    aget-byte v3, p1, v3

    .line 92
    .line 93
    add-int/lit8 v5, v8, 0x1

    .line 94
    .line 95
    invoke-static {p2, v3, p3, v8}, Lma/u1$a;->b(BB[CI)V

    .line 96
    .line 97
    .line 98
    move p2, v4

    .line 99
    move v8, v5

    .line 100
    goto :goto_3

    .line 101
    :cond_9
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    throw p1

    .line 106
    :cond_a
    const/16 v4, -0x10

    .line 107
    .line 108
    if-ge p2, v4, :cond_b

    .line 109
    .line 110
    move v4, v2

    .line 111
    goto :goto_8

    .line 112
    :cond_b
    move v4, v1

    .line 113
    :goto_8
    if-eqz v4, :cond_d

    .line 114
    .line 115
    add-int/lit8 v4, v0, -0x1

    .line 116
    .line 117
    if-ge v3, v4, :cond_c

    .line 118
    .line 119
    add-int/lit8 v4, v3, 0x1

    .line 120
    .line 121
    aget-byte v3, p1, v3

    .line 122
    .line 123
    add-int/lit8 v5, v4, 0x1

    .line 124
    .line 125
    aget-byte v4, p1, v4

    .line 126
    .line 127
    add-int/lit8 v6, v8, 0x1

    .line 128
    .line 129
    invoke-static {p2, v3, v4, p3, v8}, Lma/u1$a;->c(BBB[CI)V

    .line 130
    .line 131
    .line 132
    move p2, v5

    .line 133
    move v8, v6

    .line 134
    goto :goto_3

    .line 135
    :cond_c
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    throw p1

    .line 140
    :cond_d
    add-int/lit8 v4, v0, -0x2

    .line 141
    .line 142
    if-ge v3, v4, :cond_e

    .line 143
    .line 144
    add-int/lit8 v4, v3, 0x1

    .line 145
    .line 146
    aget-byte v5, p1, v3

    .line 147
    .line 148
    add-int/lit8 v3, v4, 0x1

    .line 149
    .line 150
    aget-byte v6, p1, v4

    .line 151
    .line 152
    add-int/lit8 v9, v3, 0x1

    .line 153
    .line 154
    aget-byte v7, p1, v3

    .line 155
    .line 156
    add-int/lit8 v10, v8, 0x1

    .line 157
    .line 158
    move v3, p2

    .line 159
    move v4, v5

    .line 160
    move v5, v6

    .line 161
    move v6, v7

    .line 162
    move-object v7, p3

    .line 163
    invoke-static/range {v3 .. v8}, Lma/u1$a;->a(BBBB[CI)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v8, v10, 0x1

    .line 167
    .line 168
    move p2, v9

    .line 169
    goto/16 :goto_3

    .line 170
    .line 171
    :cond_e
    invoke-static {}, Lma/b0;->c()Lma/b0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    throw p1

    .line 176
    :cond_f
    new-instance p1, Ljava/lang/String;

    .line 177
    .line 178
    invoke-direct {p1, p3, v1, v8}, Ljava/lang/String;-><init>([CII)V

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_10
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 183
    .line 184
    const/4 v3, 0x3

    .line 185
    new-array v3, v3, [Ljava/lang/Object;

    .line 186
    .line 187
    array-length p1, p1

    .line 188
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    aput-object p1, v3, v1

    .line 193
    .line 194
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    aput-object p1, v3, v2

    .line 199
    .line 200
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const/4 p2, 0x2

    .line 205
    aput-object p1, v3, p2

    .line 206
    .line 207
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 208
    .line 209
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0
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

.method public final c(ILjava/nio/ByteBuffer;I)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p2, p3}, Lma/u1$b;->b(ILjava/nio/ByteBuffer;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/CharSequence;[BII)I
    .locals 7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr p4, p3

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v0, :cond_0

    add-int v3, v1, p3

    if-ge v3, p4, :cond_0

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ge v4, v2, :cond_0

    int-to-byte v2, v4

    aput-byte v2, p2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    add-int/2addr p3, v0

    return p3

    :cond_1
    add-int/2addr p3, v1

    :goto_1
    if-ge v1, v0, :cond_b

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ge v3, v2, :cond_2

    if-ge p3, p4, :cond_2

    add-int/lit8 v4, p3, 0x1

    int-to-byte v3, v3

    aput-byte v3, p2, p3

    goto :goto_2

    :cond_2
    const/16 v4, 0x800

    if-ge v3, v4, :cond_3

    add-int/lit8 v4, p4, -0x2

    if-gt p3, v4, :cond_3

    add-int/lit8 v4, p3, 0x1

    ushr-int/lit8 v5, v3, 0x6

    or-int/lit16 v5, v5, 0x3c0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 p3, v4, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    aput-byte v3, p2, v4

    goto :goto_3

    :cond_3
    const v4, 0xdfff

    const v5, 0xd800

    if-lt v3, v5, :cond_4

    if-ge v4, v3, :cond_5

    :cond_4
    add-int/lit8 v6, p4, -0x3

    if-gt p3, v6, :cond_5

    add-int/lit8 v4, p3, 0x1

    ushr-int/lit8 v5, v3, 0xc

    or-int/lit16 v5, v5, 0x1e0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 p3, v4, 0x1

    ushr-int/lit8 v5, v3, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v2

    int-to-byte v5, v5

    aput-byte v5, p2, v4

    add-int/lit8 v4, p3, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    aput-byte v3, p2, p3

    :goto_2
    move p3, v4

    goto :goto_3

    :cond_5
    add-int/lit8 v6, p4, -0x4

    if-gt p3, v6, :cond_8

    add-int/lit8 v4, v1, 0x1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eq v4, v5, :cond_7

    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v3, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v1

    add-int/lit8 v3, p3, 0x1

    ushr-int/lit8 v5, v1, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 p3, v3, 0x1

    ushr-int/lit8 v5, v1, 0xc

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v2

    int-to-byte v5, v5

    aput-byte v5, p2, v3

    add-int/lit8 v3, p3, 0x1

    ushr-int/lit8 v5, v1, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v2

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 p3, v3, 0x1

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p2, v3

    move v1, v4

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_6
    move v1, v4

    :cond_7
    new-instance p1, Lma/u1$d;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p1, v1, v0}, Lma/u1$d;-><init>(II)V

    throw p1

    :cond_8
    if-gt v5, v3, :cond_a

    if-gt v3, v4, :cond_a

    add-int/lit8 p2, v1, 0x1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-eq p2, p4, :cond_9

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result p1

    if-nez p1, :cond_a

    :cond_9
    new-instance p1, Lma/u1$d;

    invoke-direct {p1, v1, v0}, Lma/u1$d;-><init>(II)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed writing "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p4, " at index "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    return p3
.end method

.method public final e(I[BII)I
    .locals 11

    .line 1
    const/4 v0, -0x1

    .line 2
    const/16 v1, -0x13

    .line 3
    .line 4
    const/16 v2, -0x3e

    .line 5
    .line 6
    const/16 v3, -0x10

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, -0x60

    .line 10
    .line 11
    const/16 v6, -0x20

    .line 12
    .line 13
    const/16 v7, -0x41

    .line 14
    .line 15
    if-eqz p1, :cond_f

    .line 16
    .line 17
    if-lt p3, p4, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    int-to-byte v8, p1

    .line 21
    if-ge v8, v6, :cond_3

    .line 22
    .line 23
    if-lt v8, v2, :cond_2

    .line 24
    .line 25
    add-int/lit8 p1, p3, 0x1

    .line 26
    .line 27
    aget-byte p3, p2, p3

    .line 28
    .line 29
    if-le p3, v7, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p3, p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v0

    .line 36
    :cond_3
    if-ge v8, v3, :cond_9

    .line 37
    .line 38
    shr-int/lit8 p1, p1, 0x8

    .line 39
    .line 40
    not-int p1, p1

    .line 41
    int-to-byte p1, p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    add-int/lit8 p1, p3, 0x1

    .line 45
    .line 46
    aget-byte p3, p2, p3

    .line 47
    .line 48
    if-lt p1, p4, :cond_4

    .line 49
    .line 50
    invoke-static {v8, p3}, Lma/u1;->c(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_4
    move v10, p3

    .line 56
    move p3, p1

    .line 57
    move p1, v10

    .line 58
    :cond_5
    if-gt p1, v7, :cond_8

    .line 59
    .line 60
    if-ne v8, v6, :cond_6

    .line 61
    .line 62
    if-lt p1, v5, :cond_8

    .line 63
    .line 64
    :cond_6
    if-ne v8, v1, :cond_7

    .line 65
    .line 66
    if-ge p1, v5, :cond_8

    .line 67
    .line 68
    :cond_7
    add-int/lit8 p1, p3, 0x1

    .line 69
    .line 70
    aget-byte p3, p2, p3

    .line 71
    .line 72
    if-le p3, v7, :cond_1

    .line 73
    .line 74
    :cond_8
    return v0

    .line 75
    :cond_9
    shr-int/lit8 v9, p1, 0x8

    .line 76
    .line 77
    not-int v9, v9

    .line 78
    int-to-byte v9, v9

    .line 79
    if-nez v9, :cond_b

    .line 80
    .line 81
    add-int/lit8 p1, p3, 0x1

    .line 82
    .line 83
    aget-byte v9, p2, p3

    .line 84
    .line 85
    if-lt p1, p4, :cond_a

    .line 86
    .line 87
    invoke-static {v8, v9}, Lma/u1;->c(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :cond_a
    move p3, p1

    .line 93
    move p1, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_b
    shr-int/lit8 p1, p1, 0x10

    .line 96
    .line 97
    int-to-byte p1, p1

    .line 98
    :goto_1
    if-nez p1, :cond_d

    .line 99
    .line 100
    add-int/lit8 p1, p3, 0x1

    .line 101
    .line 102
    aget-byte p3, p2, p3

    .line 103
    .line 104
    if-lt p1, p4, :cond_c

    .line 105
    .line 106
    invoke-static {v8, v9, p3}, Lma/u1;->d(III)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    return p1

    .line 111
    :cond_c
    move v10, p3

    .line 112
    move p3, p1

    .line 113
    move p1, v10

    .line 114
    :cond_d
    if-gt v9, v7, :cond_e

    .line 115
    .line 116
    shl-int/lit8 v8, v8, 0x1c

    .line 117
    .line 118
    add-int/lit8 v9, v9, 0x70

    .line 119
    .line 120
    add-int/2addr v9, v8

    .line 121
    shr-int/lit8 v8, v9, 0x1e

    .line 122
    .line 123
    if-nez v8, :cond_e

    .line 124
    .line 125
    if-gt p1, v7, :cond_e

    .line 126
    .line 127
    add-int/lit8 p1, p3, 0x1

    .line 128
    .line 129
    aget-byte p3, p2, p3

    .line 130
    .line 131
    if-le p3, v7, :cond_1

    .line 132
    .line 133
    :cond_e
    return v0

    .line 134
    :cond_f
    :goto_2
    if-ge p3, p4, :cond_10

    .line 135
    .line 136
    aget-byte p1, p2, p3

    .line 137
    .line 138
    if-ltz p1, :cond_10

    .line 139
    .line 140
    add-int/lit8 p3, p3, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_10
    if-lt p3, p4, :cond_11

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_11
    :goto_3
    if-lt p3, p4, :cond_12

    .line 147
    .line 148
    :goto_4
    move v0, v4

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_12
    add-int/lit8 p1, p3, 0x1

    .line 152
    .line 153
    aget-byte p3, p2, p3

    .line 154
    .line 155
    if-gez p3, :cond_1f

    .line 156
    .line 157
    if-ge p3, v6, :cond_15

    .line 158
    .line 159
    if-lt p1, p4, :cond_14

    .line 160
    .line 161
    :cond_13
    move v0, p3

    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_14
    if-lt p3, v2, :cond_1e

    .line 165
    .line 166
    add-int/lit8 p3, p1, 0x1

    .line 167
    .line 168
    aget-byte p1, p2, p1

    .line 169
    .line 170
    if-le p1, v7, :cond_11

    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :cond_15
    if-ge p3, v3, :cond_19

    .line 175
    .line 176
    add-int/lit8 v8, p4, -0x1

    .line 177
    .line 178
    if-lt p1, v8, :cond_16

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_16
    add-int/lit8 v8, p1, 0x1

    .line 182
    .line 183
    aget-byte p1, p2, p1

    .line 184
    .line 185
    if-gt p1, v7, :cond_1e

    .line 186
    .line 187
    if-ne p3, v6, :cond_17

    .line 188
    .line 189
    if-lt p1, v5, :cond_1e

    .line 190
    .line 191
    :cond_17
    if-ne p3, v1, :cond_18

    .line 192
    .line 193
    if-ge p1, v5, :cond_1e

    .line 194
    .line 195
    :cond_18
    add-int/lit8 p3, v8, 0x1

    .line 196
    .line 197
    aget-byte p1, p2, v8

    .line 198
    .line 199
    if-le p1, v7, :cond_11

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_19
    add-int/lit8 v8, p4, -0x2

    .line 203
    .line 204
    if-lt p1, v8, :cond_1d

    .line 205
    .line 206
    :goto_5
    add-int/lit8 p3, p1, -0x1

    .line 207
    .line 208
    aget-byte p3, p2, p3

    .line 209
    .line 210
    sub-int/2addr p4, p1

    .line 211
    if-eqz p4, :cond_1c

    .line 212
    .line 213
    const/4 v0, 0x1

    .line 214
    if-eq p4, v0, :cond_1b

    .line 215
    .line 216
    const/4 v1, 0x2

    .line 217
    if-ne p4, v1, :cond_1a

    .line 218
    .line 219
    aget-byte p4, p2, p1

    .line 220
    .line 221
    add-int/2addr p1, v0

    .line 222
    aget-byte p1, p2, p1

    .line 223
    .line 224
    invoke-static {p3, p4, p1}, Lma/u1;->d(III)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    goto :goto_6

    .line 229
    :cond_1a
    new-instance p1, Ljava/lang/AssertionError;

    .line 230
    .line 231
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 232
    .line 233
    .line 234
    throw p1

    .line 235
    :cond_1b
    aget-byte p1, p2, p1

    .line 236
    .line 237
    invoke-static {p3, p1}, Lma/u1;->c(II)I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    :goto_6
    move v0, p1

    .line 242
    goto :goto_7

    .line 243
    :cond_1c
    const/16 p1, -0xc

    .line 244
    .line 245
    if-le p3, p1, :cond_13

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_1d
    add-int/lit8 v8, p1, 0x1

    .line 249
    .line 250
    aget-byte p1, p2, p1

    .line 251
    .line 252
    if-gt p1, v7, :cond_1e

    .line 253
    .line 254
    shl-int/lit8 p3, p3, 0x1c

    .line 255
    .line 256
    add-int/lit8 p1, p1, 0x70

    .line 257
    .line 258
    add-int/2addr p1, p3

    .line 259
    shr-int/lit8 p1, p1, 0x1e

    .line 260
    .line 261
    if-nez p1, :cond_1e

    .line 262
    .line 263
    add-int/lit8 p1, v8, 0x1

    .line 264
    .line 265
    aget-byte p3, p2, v8

    .line 266
    .line 267
    if-gt p3, v7, :cond_1e

    .line 268
    .line 269
    add-int/lit8 p3, p1, 0x1

    .line 270
    .line 271
    aget-byte p1, p2, p1

    .line 272
    .line 273
    if-le p1, v7, :cond_11

    .line 274
    .line 275
    :cond_1e
    :goto_7
    return v0

    .line 276
    :cond_1f
    move p3, p1

    .line 277
    goto/16 :goto_3
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method
