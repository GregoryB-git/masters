.class public final Ls0/m1$c;
.super Ls0/m1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls0/m1$b;-><init>()V

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
    if-ltz v0, :cond_11

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
    if-ge p2, v0, :cond_10

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
    if-eqz v4, :cond_b

    .line 86
    .line 87
    if-ge v3, v0, :cond_a

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
    const/16 v6, -0x3e

    .line 96
    .line 97
    if-lt p2, v6, :cond_9

    .line 98
    .line 99
    invoke-static {v3}, Ls0/m1$a;->c(B)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_9

    .line 104
    .line 105
    and-int/lit8 p2, p2, 0x1f

    .line 106
    .line 107
    shl-int/lit8 p2, p2, 0x6

    .line 108
    .line 109
    and-int/lit8 v3, v3, 0x3f

    .line 110
    .line 111
    or-int/2addr p2, v3

    .line 112
    int-to-char p2, p2

    .line 113
    aput-char p2, p3, v8

    .line 114
    .line 115
    move p2, v4

    .line 116
    move v8, v5

    .line 117
    goto :goto_3

    .line 118
    :cond_9
    invoke-static {}, Ls0/y;->a()Ls0/y;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    throw p1

    .line 123
    :cond_a
    invoke-static {}, Ls0/y;->a()Ls0/y;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    throw p1

    .line 128
    :cond_b
    const/16 v4, -0x10

    .line 129
    .line 130
    if-ge p2, v4, :cond_c

    .line 131
    .line 132
    move v4, v2

    .line 133
    goto :goto_8

    .line 134
    :cond_c
    move v4, v1

    .line 135
    :goto_8
    if-eqz v4, :cond_e

    .line 136
    .line 137
    add-int/lit8 v4, v0, -0x1

    .line 138
    .line 139
    if-ge v3, v4, :cond_d

    .line 140
    .line 141
    add-int/lit8 v4, v3, 0x1

    .line 142
    .line 143
    aget-byte v3, p1, v3

    .line 144
    .line 145
    add-int/lit8 v5, v4, 0x1

    .line 146
    .line 147
    aget-byte v4, p1, v4

    .line 148
    .line 149
    add-int/lit8 v6, v8, 0x1

    .line 150
    .line 151
    invoke-static {p2, v3, v4, p3, v8}, Ls0/m1$a;->b(BBB[CI)V

    .line 152
    .line 153
    .line 154
    move p2, v5

    .line 155
    move v8, v6

    .line 156
    goto :goto_3

    .line 157
    :cond_d
    invoke-static {}, Ls0/y;->a()Ls0/y;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    throw p1

    .line 162
    :cond_e
    add-int/lit8 v4, v0, -0x2

    .line 163
    .line 164
    if-ge v3, v4, :cond_f

    .line 165
    .line 166
    add-int/lit8 v4, v3, 0x1

    .line 167
    .line 168
    aget-byte v5, p1, v3

    .line 169
    .line 170
    add-int/lit8 v3, v4, 0x1

    .line 171
    .line 172
    aget-byte v6, p1, v4

    .line 173
    .line 174
    add-int/lit8 v9, v3, 0x1

    .line 175
    .line 176
    aget-byte v7, p1, v3

    .line 177
    .line 178
    add-int/lit8 v10, v8, 0x1

    .line 179
    .line 180
    move v3, p2

    .line 181
    move v4, v5

    .line 182
    move v5, v6

    .line 183
    move v6, v7

    .line 184
    move-object v7, p3

    .line 185
    invoke-static/range {v3 .. v8}, Ls0/m1$a;->a(BBBB[CI)V

    .line 186
    .line 187
    .line 188
    add-int/lit8 v8, v10, 0x1

    .line 189
    .line 190
    move p2, v9

    .line 191
    goto/16 :goto_3

    .line 192
    .line 193
    :cond_f
    invoke-static {}, Ls0/y;->a()Ls0/y;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    throw p1

    .line 198
    :cond_10
    new-instance p1, Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {p1, p3, v1, v8}, Ljava/lang/String;-><init>([CII)V

    .line 201
    .line 202
    .line 203
    return-object p1

    .line 204
    :cond_11
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 205
    .line 206
    const/4 v3, 0x3

    .line 207
    new-array v3, v3, [Ljava/lang/Object;

    .line 208
    .line 209
    array-length p1, p1

    .line 210
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    aput-object p1, v3, v1

    .line 215
    .line 216
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    aput-object p1, v3, v2

    .line 221
    .line 222
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    const/4 p2, 0x2

    .line 227
    aput-object p1, v3, p2

    .line 228
    .line 229
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 230
    .line 231
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0
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

.method public final b(Ljava/lang/CharSequence;[BII)I
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
    new-instance p1, Ls0/m1$d;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p1, v1, v0}, Ls0/m1$d;-><init>(II)V

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
    new-instance p1, Ls0/m1$d;

    invoke-direct {p1, v1, v0}, Ls0/m1$d;-><init>(II)V

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

.method public final c([BII)I
    .locals 6

    .line 1
    :goto_0
    if-ge p2, p3, :cond_0

    .line 2
    .line 3
    aget-byte v0, p1, p2

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p2, p2, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    if-lt p2, p3, :cond_1

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_1
    :goto_1
    if-lt p2, p3, :cond_2

    .line 15
    .line 16
    :goto_2
    const/4 v0, 0x0

    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_2
    add-int/lit8 v1, p2, 0x1

    .line 20
    .line 21
    aget-byte p2, p1, p2

    .line 22
    .line 23
    if-gez p2, :cond_f

    .line 24
    .line 25
    const/16 v2, -0x20

    .line 26
    .line 27
    const/16 v3, -0x41

    .line 28
    .line 29
    if-ge p2, v2, :cond_5

    .line 30
    .line 31
    if-lt v1, p3, :cond_4

    .line 32
    .line 33
    :cond_3
    move v0, p2

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_4
    const/16 v2, -0x3e

    .line 37
    .line 38
    if-lt p2, v2, :cond_e

    .line 39
    .line 40
    add-int/lit8 p2, v1, 0x1

    .line 41
    .line 42
    aget-byte v1, p1, v1

    .line 43
    .line 44
    if-le v1, v3, :cond_1

    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_5
    const/16 v4, -0x10

    .line 49
    .line 50
    if-ge p2, v4, :cond_9

    .line 51
    .line 52
    add-int/lit8 v4, p3, -0x1

    .line 53
    .line 54
    if-lt v1, v4, :cond_6

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_6
    add-int/lit8 v4, v1, 0x1

    .line 58
    .line 59
    aget-byte v1, p1, v1

    .line 60
    .line 61
    if-gt v1, v3, :cond_e

    .line 62
    .line 63
    const/16 v5, -0x60

    .line 64
    .line 65
    if-ne p2, v2, :cond_7

    .line 66
    .line 67
    if-lt v1, v5, :cond_e

    .line 68
    .line 69
    :cond_7
    const/16 v2, -0x13

    .line 70
    .line 71
    if-ne p2, v2, :cond_8

    .line 72
    .line 73
    if-ge v1, v5, :cond_e

    .line 74
    .line 75
    :cond_8
    add-int/lit8 p2, v4, 0x1

    .line 76
    .line 77
    aget-byte v1, p1, v4

    .line 78
    .line 79
    if-le v1, v3, :cond_1

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_9
    add-int/lit8 v2, p3, -0x2

    .line 83
    .line 84
    if-lt v1, v2, :cond_d

    .line 85
    .line 86
    :goto_3
    add-int/lit8 p2, v1, -0x1

    .line 87
    .line 88
    aget-byte p2, p1, p2

    .line 89
    .line 90
    sub-int/2addr p3, v1

    .line 91
    if-eqz p3, :cond_c

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    if-eq p3, v0, :cond_b

    .line 95
    .line 96
    const/4 v2, 0x2

    .line 97
    if-ne p3, v2, :cond_a

    .line 98
    .line 99
    aget-byte p3, p1, v1

    .line 100
    .line 101
    add-int/2addr v1, v0

    .line 102
    aget-byte p1, p1, v1

    .line 103
    .line 104
    invoke-static {p2, p3, p1}, Ls0/m1;->c(III)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    goto :goto_4

    .line 109
    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_b
    aget-byte p1, p1, v1

    .line 116
    .line 117
    invoke-static {p2, p1}, Ls0/m1;->b(II)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    :goto_4
    move v0, p1

    .line 122
    goto :goto_5

    .line 123
    :cond_c
    const/16 p1, -0xc

    .line 124
    .line 125
    if-le p2, p1, :cond_3

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_d
    add-int/lit8 v2, v1, 0x1

    .line 129
    .line 130
    aget-byte v1, p1, v1

    .line 131
    .line 132
    if-gt v1, v3, :cond_e

    .line 133
    .line 134
    shl-int/lit8 p2, p2, 0x1c

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x70

    .line 137
    .line 138
    add-int/2addr v1, p2

    .line 139
    shr-int/lit8 p2, v1, 0x1e

    .line 140
    .line 141
    if-nez p2, :cond_e

    .line 142
    .line 143
    add-int/lit8 p2, v2, 0x1

    .line 144
    .line 145
    aget-byte v1, p1, v2

    .line 146
    .line 147
    if-gt v1, v3, :cond_e

    .line 148
    .line 149
    add-int/lit8 v1, p2, 0x1

    .line 150
    .line 151
    aget-byte p2, p1, p2

    .line 152
    .line 153
    if-le p2, v3, :cond_f

    .line 154
    .line 155
    :cond_e
    :goto_5
    return v0

    .line 156
    :cond_f
    move p2, v1

    .line 157
    goto/16 :goto_1
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
