.class public final Lx3/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    .line 1
    const/high16 v0, -0x200000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    move v0, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    ushr-int/lit8 v0, p1, 0x13

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v3, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    ushr-int/lit8 v4, p1, 0x11

    .line 23
    .line 24
    and-int/2addr v4, v1

    .line 25
    if-nez v4, :cond_3

    .line 26
    .line 27
    return v2

    .line 28
    :cond_3
    ushr-int/lit8 v5, p1, 0xc

    .line 29
    .line 30
    const/16 v6, 0xf

    .line 31
    .line 32
    and-int/2addr v5, v6

    .line 33
    if-eqz v5, :cond_12

    .line 34
    .line 35
    if-ne v5, v6, :cond_4

    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_4
    ushr-int/lit8 v6, p1, 0xa

    .line 40
    .line 41
    and-int/2addr v6, v1

    .line 42
    if-ne v6, v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iput v0, p0, Lx3/y$a;->a:I

    .line 46
    .line 47
    sget-object v2, Lx3/y;->a:[Ljava/lang/String;

    .line 48
    .line 49
    rsub-int/lit8 v7, v4, 0x3

    .line 50
    .line 51
    aget-object v2, v2, v7

    .line 52
    .line 53
    iput-object v2, p0, Lx3/y$a;->b:Ljava/lang/String;

    .line 54
    .line 55
    sget-object v2, Lx3/y;->b:[I

    .line 56
    .line 57
    aget v2, v2, v6

    .line 58
    .line 59
    iput v2, p0, Lx3/y$a;->d:I

    .line 60
    .line 61
    const/4 v6, 0x2

    .line 62
    if-ne v0, v6, :cond_6

    .line 63
    .line 64
    div-int/2addr v2, v6

    .line 65
    goto :goto_1

    .line 66
    :cond_6
    if-nez v0, :cond_7

    .line 67
    .line 68
    div-int/lit8 v2, v2, 0x4

    .line 69
    .line 70
    :goto_1
    iput v2, p0, Lx3/y$a;->d:I

    .line 71
    .line 72
    :cond_7
    ushr-int/lit8 v2, p1, 0x9

    .line 73
    .line 74
    and-int/2addr v2, v3

    .line 75
    const/16 v7, 0x480

    .line 76
    .line 77
    if-eq v4, v3, :cond_9

    .line 78
    .line 79
    if-eq v4, v6, :cond_b

    .line 80
    .line 81
    if-ne v4, v1, :cond_8

    .line 82
    .line 83
    const/16 v7, 0x180

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_9
    if-ne v0, v1, :cond_a

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_a
    const/16 v7, 0x240

    .line 96
    .line 97
    :cond_b
    :goto_2
    iput v7, p0, Lx3/y$a;->g:I

    .line 98
    .line 99
    if-ne v4, v1, :cond_d

    .line 100
    .line 101
    if-ne v0, v1, :cond_c

    .line 102
    .line 103
    sget-object v0, Lx3/y;->c:[I

    .line 104
    .line 105
    sub-int/2addr v5, v3

    .line 106
    aget v0, v0, v5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_c
    sget-object v0, Lx3/y;->d:[I

    .line 110
    .line 111
    sub-int/2addr v5, v3

    .line 112
    aget v0, v0, v5

    .line 113
    .line 114
    :goto_3
    iput v0, p0, Lx3/y$a;->f:I

    .line 115
    .line 116
    mul-int/lit8 v0, v0, 0xc

    .line 117
    .line 118
    iget v4, p0, Lx3/y$a;->d:I

    .line 119
    .line 120
    div-int/2addr v0, v4

    .line 121
    add-int/2addr v0, v2

    .line 122
    mul-int/lit8 v0, v0, 0x4

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_d
    const/16 v7, 0x90

    .line 126
    .line 127
    if-ne v0, v1, :cond_f

    .line 128
    .line 129
    if-ne v4, v6, :cond_e

    .line 130
    .line 131
    sget-object v0, Lx3/y;->e:[I

    .line 132
    .line 133
    sub-int/2addr v5, v3

    .line 134
    aget v0, v0, v5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_e
    sget-object v0, Lx3/y;->f:[I

    .line 138
    .line 139
    sub-int/2addr v5, v3

    .line 140
    aget v0, v0, v5

    .line 141
    .line 142
    :goto_4
    iput v0, p0, Lx3/y$a;->f:I

    .line 143
    .line 144
    mul-int/2addr v0, v7

    .line 145
    iget v4, p0, Lx3/y$a;->d:I

    .line 146
    .line 147
    div-int/2addr v0, v4

    .line 148
    add-int/2addr v0, v2

    .line 149
    :goto_5
    iput v0, p0, Lx3/y$a;->c:I

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_f
    sget-object v0, Lx3/y;->g:[I

    .line 153
    .line 154
    sub-int/2addr v5, v3

    .line 155
    aget v0, v0, v5

    .line 156
    .line 157
    iput v0, p0, Lx3/y$a;->f:I

    .line 158
    .line 159
    if-ne v4, v3, :cond_10

    .line 160
    .line 161
    const/16 v7, 0x48

    .line 162
    .line 163
    :cond_10
    mul-int/2addr v7, v0

    .line 164
    iget v0, p0, Lx3/y$a;->d:I

    .line 165
    .line 166
    div-int/2addr v7, v0

    .line 167
    add-int/2addr v7, v2

    .line 168
    iput v7, p0, Lx3/y$a;->c:I

    .line 169
    .line 170
    :goto_6
    shr-int/lit8 p1, p1, 0x6

    .line 171
    .line 172
    and-int/2addr p1, v1

    .line 173
    if-ne p1, v1, :cond_11

    .line 174
    .line 175
    move v6, v3

    .line 176
    :cond_11
    iput v6, p0, Lx3/y$a;->e:I

    .line 177
    .line 178
    return v3

    .line 179
    :cond_12
    :goto_7
    return v2
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
