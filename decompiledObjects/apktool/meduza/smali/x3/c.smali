.class public final Lx3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/c$a;
    }
.end annotation


# static fields
.field public static final a:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lx3/c;->a:[I

    return-void

    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method public static a(ILv5/u;)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, v0}, Lv5/u;->D(I)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p1, Lv5/u;->a:[B

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/16 v1, -0x54

    .line 9
    .line 10
    aput-byte v1, p1, v0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    aput-byte v1, p1, v0

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, -0x1

    .line 19
    aput-byte v1, p1, v0

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    aput-byte v1, p1, v0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    shr-int/lit8 v1, p0, 0x10

    .line 26
    .line 27
    and-int/lit16 v1, v1, 0xff

    .line 28
    .line 29
    int-to-byte v1, v1

    .line 30
    aput-byte v1, p1, v0

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    shr-int/lit8 v1, p0, 0x8

    .line 34
    .line 35
    and-int/lit16 v1, v1, 0xff

    .line 36
    .line 37
    int-to-byte v1, v1

    .line 38
    aput-byte v1, p1, v0

    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    and-int/lit16 p0, p0, 0xff

    .line 42
    .line 43
    int-to-byte p0, p0

    .line 44
    aput-byte p0, p1, v0

    .line 45
    .line 46
    return-void
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

.method public static b(Lv5/t;)Lx3/c$a;
    .locals 9

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x4

    .line 12
    const v3, 0xffff

    .line 13
    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v3, 0x7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v2

    .line 26
    :goto_0
    add-int/2addr v0, v3

    .line 27
    const v3, 0xac41

    .line 28
    .line 29
    .line 30
    if-ne v1, v3, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x2

    .line 35
    invoke-virtual {p0, v1}, Lv5/t;->g(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x3

    .line 41
    if-ne v3, v5, :cond_3

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0, v1}, Lv5/t;->g(I)I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    :cond_3
    const/16 v3, 0xa

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Lv5/t;->g(I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0, v5}, Lv5/t;->g(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-lez v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lv5/t;->m(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0}, Lv5/t;->f()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const v7, 0xbb80

    .line 78
    .line 79
    .line 80
    const v8, 0xac44

    .line 81
    .line 82
    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    move v6, v7

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    move v6, v8

    .line 88
    :goto_1
    invoke-virtual {p0, v2}, Lv5/t;->g(I)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-ne v6, v8, :cond_6

    .line 93
    .line 94
    const/16 v8, 0xd

    .line 95
    .line 96
    if-ne p0, v8, :cond_6

    .line 97
    .line 98
    sget-object v1, Lx3/c;->a:[I

    .line 99
    .line 100
    aget p0, v1, p0

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    if-ne v6, v7, :cond_b

    .line 104
    .line 105
    sget-object v7, Lx3/c;->a:[I

    .line 106
    .line 107
    const/16 v8, 0xe

    .line 108
    .line 109
    if-ge p0, v8, :cond_b

    .line 110
    .line 111
    aget v4, v7, p0

    .line 112
    .line 113
    rem-int/lit8 v3, v3, 0x5

    .line 114
    .line 115
    const/16 v7, 0x8

    .line 116
    .line 117
    const/4 v8, 0x1

    .line 118
    if-eq v3, v8, :cond_9

    .line 119
    .line 120
    const/16 v8, 0xb

    .line 121
    .line 122
    if-eq v3, v1, :cond_8

    .line 123
    .line 124
    if-eq v3, v5, :cond_9

    .line 125
    .line 126
    if-eq v3, v2, :cond_7

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    if-eq p0, v5, :cond_a

    .line 130
    .line 131
    if-eq p0, v7, :cond_a

    .line 132
    .line 133
    if-ne p0, v8, :cond_b

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    if-eq p0, v7, :cond_a

    .line 137
    .line 138
    if-ne p0, v8, :cond_b

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_9
    if-eq p0, v5, :cond_a

    .line 142
    .line 143
    if-ne p0, v7, :cond_b

    .line 144
    .line 145
    :cond_a
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 146
    .line 147
    :cond_b
    :goto_3
    move p0, v4

    .line 148
    :goto_4
    new-instance v1, Lx3/c$a;

    .line 149
    .line 150
    invoke-direct {v1, v6, v0, p0}, Lx3/c$a;-><init>(III)V

    .line 151
    .line 152
    .line 153
    return-object v1
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
