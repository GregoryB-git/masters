.class public final Lm4/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv5/c0;

.field public final b:Lv5/u;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/c0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lv5/c0;-><init>(J)V

    iput-object v0, p0, Lm4/v;->a:Lv5/c0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/v;->f:J

    iput-wide v0, p0, Lm4/v;->g:J

    iput-wide v0, p0, Lm4/v;->h:J

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lm4/v;->b:Lv5/u;

    return-void
.end method

.method public static b([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static c(Lv5/u;)J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv5/u;->b:I

    .line 4
    .line 5
    iget v2, v0, Lv5/u;->c:I

    .line 6
    .line 7
    sub-int/2addr v2, v1

    .line 8
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v5, 0x9

    .line 14
    .line 15
    if-ge v2, v5, :cond_0

    .line 16
    .line 17
    return-wide v3

    .line 18
    :cond_0
    new-array v2, v5, [B

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual {v0, v2, v6, v5}, Lv5/u;->d([BII)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lv5/u;->G(I)V

    .line 25
    .line 26
    .line 27
    aget-byte v0, v2, v6

    .line 28
    .line 29
    and-int/lit16 v1, v0, 0xc4

    .line 30
    .line 31
    const/16 v5, 0x44

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    const/4 v8, 0x1

    .line 35
    const/4 v9, 0x5

    .line 36
    const/4 v10, 0x4

    .line 37
    const/4 v11, 0x2

    .line 38
    if-eq v1, v5, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    aget-byte v1, v2, v11

    .line 42
    .line 43
    and-int/2addr v1, v10

    .line 44
    if-eq v1, v10, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    aget-byte v1, v2, v10

    .line 48
    .line 49
    and-int/2addr v1, v10

    .line 50
    if-eq v1, v10, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    aget-byte v1, v2, v9

    .line 54
    .line 55
    and-int/2addr v1, v8

    .line 56
    if-eq v1, v8, :cond_4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const/16 v1, 0x8

    .line 60
    .line 61
    aget-byte v1, v2, v1

    .line 62
    .line 63
    and-int/2addr v1, v7

    .line 64
    if-ne v1, v7, :cond_5

    .line 65
    .line 66
    move v6, v8

    .line 67
    :cond_5
    :goto_0
    if-nez v6, :cond_6

    .line 68
    .line 69
    return-wide v3

    .line 70
    :cond_6
    int-to-long v0, v0

    .line 71
    const-wide/16 v3, 0x38

    .line 72
    .line 73
    and-long/2addr v3, v0

    .line 74
    shr-long/2addr v3, v7

    .line 75
    const/16 v5, 0x1e

    .line 76
    .line 77
    shl-long/2addr v3, v5

    .line 78
    const-wide/16 v5, 0x3

    .line 79
    .line 80
    and-long/2addr v0, v5

    .line 81
    const/16 v12, 0x1c

    .line 82
    .line 83
    shl-long/2addr v0, v12

    .line 84
    or-long/2addr v0, v3

    .line 85
    aget-byte v3, v2, v8

    .line 86
    .line 87
    int-to-long v3, v3

    .line 88
    const-wide/16 v12, 0xff

    .line 89
    .line 90
    and-long/2addr v3, v12

    .line 91
    const/16 v8, 0x14

    .line 92
    .line 93
    shl-long/2addr v3, v8

    .line 94
    or-long/2addr v0, v3

    .line 95
    aget-byte v3, v2, v11

    .line 96
    .line 97
    int-to-long v3, v3

    .line 98
    const-wide/16 v14, 0xf8

    .line 99
    .line 100
    and-long v16, v3, v14

    .line 101
    .line 102
    shr-long v16, v16, v7

    .line 103
    .line 104
    const/16 v8, 0xf

    .line 105
    .line 106
    shl-long v16, v16, v8

    .line 107
    .line 108
    or-long v0, v0, v16

    .line 109
    .line 110
    and-long/2addr v3, v5

    .line 111
    const/16 v5, 0xd

    .line 112
    .line 113
    shl-long/2addr v3, v5

    .line 114
    or-long/2addr v0, v3

    .line 115
    aget-byte v3, v2, v7

    .line 116
    .line 117
    int-to-long v3, v3

    .line 118
    and-long/2addr v3, v12

    .line 119
    shl-long/2addr v3, v9

    .line 120
    or-long/2addr v0, v3

    .line 121
    aget-byte v2, v2, v10

    .line 122
    .line 123
    int-to-long v2, v2

    .line 124
    and-long/2addr v2, v14

    .line 125
    shr-long/2addr v2, v7

    .line 126
    or-long/2addr v0, v2

    .line 127
    return-wide v0
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


# virtual methods
.method public final a(Lc4/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm4/v;->b:Lv5/u;

    .line 2
    .line 3
    sget-object v1, Lv5/e0;->f:[B

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v2, v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lv5/u;->E([BI)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lm4/v;->c:Z

    .line 14
    .line 15
    invoke-interface {p1}, Lc4/i;->i()V

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
.end method
