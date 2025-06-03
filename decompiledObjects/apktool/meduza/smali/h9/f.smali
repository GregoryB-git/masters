.class public final Lh9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[[B


# instance fields
.field public a:[B

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [[B

    const/4 v1, 0x2

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_4

    const/4 v3, 0x4

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_5

    const/4 v3, 0x5

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_6

    const/4 v3, 0x6

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_7

    const/4 v3, 0x7

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_8

    const/16 v3, 0x8

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_9

    const/16 v3, 0x9

    aput-object v2, v0, v3

    new-array v1, v1, [B

    fill-array-data v1, :array_a

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lh9/f;->c:[[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x80t
        0x0t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x40t
        0x0t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x20t
        0x0t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x10t
        0x0t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x8t
        0x0t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x4t
        0x0t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x2t
        0x0t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x1t
        0x0t
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x1t
        -0x80t
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x1t
        -0x40t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh9/f;->b:I

    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lh9/f;->a:[B

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Lh9/f;->b:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lh9/f;->a:[B

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    if-ge v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lh9/f;->a:[B

    return-void
.end method

.method public final b(B)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lh9/f;->d(B)V

    invoke-virtual {p0, v1}, Lh9/f;->d(B)V

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    invoke-virtual {p0, v1}, Lh9/f;->d(B)V

    invoke-virtual {p0, v0}, Lh9/f;->d(B)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lh9/f;->d(B)V

    :goto_0
    return-void
.end method

.method public final c(B)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lh9/f;->e(B)V

    invoke-virtual {p0, v1}, Lh9/f;->e(B)V

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    invoke-virtual {p0, v1}, Lh9/f;->e(B)V

    invoke-virtual {p0, v0}, Lh9/f;->e(B)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lh9/f;->e(B)V

    :goto_0
    return-void
.end method

.method public final d(B)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lh9/f;->a(I)V

    iget-object v0, p0, Lh9/f;->a:[B

    iget v1, p0, Lh9/f;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lh9/f;->b:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final e(B)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lh9/f;->a(I)V

    iget-object v0, p0, Lh9/f;->a:[B

    iget v1, p0, Lh9/f;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lh9/f;->b:I

    not-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public final f(J)V
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    not-long v3, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v3, p1

    .line 10
    :goto_0
    const-wide/16 v5, 0x40

    .line 11
    .line 12
    cmp-long v5, v3, v5

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    if-gez v5, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v7}, Lh9/f;->a(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lh9/f;->a:[B

    .line 22
    .line 23
    iget v1, p0, Lh9/f;->b:I

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x1

    .line 26
    .line 27
    iput v2, p0, Lh9/f;->b:I

    .line 28
    .line 29
    sget-object v2, Lh9/f;->c:[[B

    .line 30
    .line 31
    aget-object v2, v2, v7

    .line 32
    .line 33
    aget-byte v2, v2, v6

    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    xor-long/2addr p1, v2

    .line 37
    long-to-int p1, p1

    .line 38
    int-to-byte p1, p1

    .line 39
    aput-byte p1, v0, v1

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    cmp-long v0, v3, v0

    .line 43
    .line 44
    if-gez v0, :cond_2

    .line 45
    .line 46
    not-long v3, v3

    .line 47
    :cond_2
    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    rsub-int/lit8 v0, v0, 0x40

    .line 52
    .line 53
    add-int/2addr v0, v7

    .line 54
    const/4 v1, 0x7

    .line 55
    sget-object v3, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 56
    .line 57
    invoke-static {v0, v1, v3}, Lh9/e;->a(IILjava/math/RoundingMode;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0, v0}, Lh9/f;->a(I)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    if-lt v0, v1, :cond_7

    .line 66
    .line 67
    if-gez v2, :cond_3

    .line 68
    .line 69
    const/4 v1, -0x1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move v1, v6

    .line 72
    :goto_1
    iget v2, p0, Lh9/f;->b:I

    .line 73
    .line 74
    const/16 v3, 0xa

    .line 75
    .line 76
    if-ne v0, v3, :cond_4

    .line 77
    .line 78
    add-int/lit8 v3, v2, 0x2

    .line 79
    .line 80
    iget-object v4, p0, Lh9/f;->a:[B

    .line 81
    .line 82
    aput-byte v1, v4, v2

    .line 83
    .line 84
    add-int/lit8 v5, v2, 0x1

    .line 85
    .line 86
    aput-byte v1, v4, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    const/16 v3, 0x9

    .line 90
    .line 91
    if-ne v0, v3, :cond_5

    .line 92
    .line 93
    add-int/lit8 v3, v2, 0x1

    .line 94
    .line 95
    iget-object v4, p0, Lh9/f;->a:[B

    .line 96
    .line 97
    aput-byte v1, v4, v2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    move v3, v2

    .line 101
    :goto_2
    add-int/lit8 v1, v0, -0x1

    .line 102
    .line 103
    add-int/2addr v1, v2

    .line 104
    :goto_3
    if-lt v1, v3, :cond_6

    .line 105
    .line 106
    iget-object v2, p0, Lh9/f;->a:[B

    .line 107
    .line 108
    const-wide/16 v4, 0xff

    .line 109
    .line 110
    and-long/2addr v4, p1

    .line 111
    long-to-int v4, v4

    .line 112
    int-to-byte v4, v4

    .line 113
    aput-byte v4, v2, v1

    .line 114
    .line 115
    const/16 v2, 0x8

    .line 116
    .line 117
    shr-long/2addr p1, v2

    .line 118
    add-int/lit8 v1, v1, -0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    iget-object p1, p0, Lh9/f;->a:[B

    .line 122
    .line 123
    iget p2, p0, Lh9/f;->b:I

    .line 124
    .line 125
    aget-byte v1, p1, p2

    .line 126
    .line 127
    sget-object v2, Lh9/f;->c:[[B

    .line 128
    .line 129
    aget-object v2, v2, v0

    .line 130
    .line 131
    aget-byte v3, v2, v6

    .line 132
    .line 133
    xor-int/2addr v1, v3

    .line 134
    int-to-byte v1, v1

    .line 135
    aput-byte v1, p1, p2

    .line 136
    .line 137
    add-int/lit8 v1, p2, 0x1

    .line 138
    .line 139
    aget-byte v3, p1, v1

    .line 140
    .line 141
    aget-byte v2, v2, v7

    .line 142
    .line 143
    xor-int/2addr v2, v3

    .line 144
    int-to-byte v2, v2

    .line 145
    aput-byte v2, p1, v1

    .line 146
    .line 147
    add-int/2addr p2, v0

    .line 148
    iput p2, p0, Lh9/f;->b:I

    .line 149
    .line 150
    return-void

    .line 151
    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    .line 152
    .line 153
    new-array p2, v7, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    aput-object v0, p2, v6

    .line 160
    .line 161
    const-string v0, "Invalid length (%d) returned by signedNumLength"

    .line 162
    .line 163
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    throw p1
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
