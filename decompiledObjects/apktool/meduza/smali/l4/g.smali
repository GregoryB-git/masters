.class public final Ll4/g;
.super Ll4/h;
.source "SourceFile"


# static fields
.field public static final o:[B

.field public static final p:[B


# instance fields
.field public n:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Ll4/g;->o:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Ll4/g;->p:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll4/h;-><init>()V

    return-void
.end method

.method public static e(Lv5/u;[B)Z
    .locals 4

    .line 1
    iget v0, p0, Lv5/u;->c:I

    .line 2
    .line 3
    iget v1, p0, Lv5/u;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    array-length v2, p1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    return v3

    .line 11
    :cond_0
    array-length v0, p1

    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    invoke-virtual {p0, v0, v3, v2}, Lv5/u;->d([BII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lv5/u;->G(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
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


# virtual methods
.method public final b(Lv5/u;)J
    .locals 4

    .line 1
    iget-object p1, p1, Lv5/u;->a:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-byte v1, p1, v0

    .line 5
    .line 6
    array-length v2, p1

    .line 7
    const/4 v3, 0x1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    aget-byte v0, p1, v3

    .line 11
    .line 12
    :cond_0
    invoke-static {v1, v0}, Lb/a0;->v(BB)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget p1, p0, Ll4/h;->i:I

    .line 17
    .line 18
    int-to-long v2, p1

    .line 19
    mul-long/2addr v2, v0

    .line 20
    const-wide/32 v0, 0xf4240

    .line 21
    .line 22
    .line 23
    div-long/2addr v2, v0

    .line 24
    return-wide v2
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

.method public final c(Lv5/u;JLl4/h$a;)Z
    .locals 7

    .line 1
    sget-object p2, Ll4/g;->o:[B

    .line 2
    .line 3
    invoke-static {p1, p2}, Ll4/g;->e(Lv5/u;[B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p1, Lv5/u;->a:[B

    .line 11
    .line 12
    iget p1, p1, Lv5/u;->c:I

    .line 13
    .line 14
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 p2, 0x9

    .line 19
    .line 20
    aget-byte p2, p1, p2

    .line 21
    .line 22
    and-int/lit16 p2, p2, 0xff

    .line 23
    .line 24
    invoke-static {p1}, Lb/a0;->n([B)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p4, Ll4/h$a;->a:Lv3/i0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return p3

    .line 33
    :cond_0
    new-instance v0, Lv3/i0$a;

    .line 34
    .line 35
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, "audio/opus"

    .line 39
    .line 40
    iput-object v1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 41
    .line 42
    iput p2, v0, Lv3/i0$a;->x:I

    .line 43
    .line 44
    const p2, 0xbb80

    .line 45
    .line 46
    .line 47
    iput p2, v0, Lv3/i0$a;->y:I

    .line 48
    .line 49
    iput-object p1, v0, Lv3/i0$a;->m:Ljava/util/List;

    .line 50
    .line 51
    new-instance p1, Lv3/i0;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget-object p2, Ll4/g;->p:[B

    .line 58
    .line 59
    invoke-static {p1, p2}, Ll4/g;->e(Lv5/u;[B)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const/4 v0, 0x0

    .line 64
    if-eqz p2, :cond_6

    .line 65
    .line 66
    iget-object p2, p4, Ll4/h$a;->a:Lv3/i0;

    .line 67
    .line 68
    invoke-static {p2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-boolean p2, p0, Ll4/g;->n:Z

    .line 72
    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    return p3

    .line 76
    :cond_2
    iput-boolean p3, p0, Ll4/g;->n:Z

    .line 77
    .line 78
    const/16 p2, 0x8

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lv5/u;->H(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v0, v0}, Lc4/y;->b(Lv5/u;ZZ)Lc4/y$a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object p1, p1, Lc4/y$a;->a:[Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {p1}, Lo7/t;->q([Ljava/lang/Object;)Lo7/l0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Lc4/y;->a(Ljava/util/List;)Lp4/a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-nez p1, :cond_3

    .line 98
    .line 99
    return p3

    .line 100
    :cond_3
    iget-object p2, p4, Ll4/h$a;->a:Lv3/i0;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v1, Lv3/i0$a;

    .line 106
    .line 107
    invoke-direct {v1, p2}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 108
    .line 109
    .line 110
    iget-object p2, p4, Ll4/h$a;->a:Lv3/i0;

    .line 111
    .line 112
    iget-object p2, p2, Lv3/i0;->r:Lp4/a;

    .line 113
    .line 114
    if-nez p2, :cond_4

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    iget-object p2, p2, Lp4/a;->a:[Lp4/a$b;

    .line 118
    .line 119
    array-length v2, p2

    .line 120
    if-nez v2, :cond_5

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    new-instance v2, Lp4/a;

    .line 124
    .line 125
    iget-wide v3, p1, Lp4/a;->b:J

    .line 126
    .line 127
    iget-object p1, p1, Lp4/a;->a:[Lp4/a$b;

    .line 128
    .line 129
    sget v5, Lv5/e0;->a:I

    .line 130
    .line 131
    array-length v5, p1

    .line 132
    array-length v6, p2

    .line 133
    add-int/2addr v5, v6

    .line 134
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    array-length p1, p1

    .line 139
    array-length v6, p2

    .line 140
    invoke-static {p2, v0, v5, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    .line 142
    .line 143
    check-cast v5, [Lp4/a$b;

    .line 144
    .line 145
    invoke-direct {v2, v3, v4, v5}, Lp4/a;-><init>(J[Lp4/a$b;)V

    .line 146
    .line 147
    .line 148
    move-object p1, v2

    .line 149
    :goto_0
    iput-object p1, v1, Lv3/i0$a;->i:Lp4/a;

    .line 150
    .line 151
    new-instance p1, Lv3/i0;

    .line 152
    .line 153
    invoke-direct {p1, v1}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 154
    .line 155
    .line 156
    :goto_1
    iput-object p1, p4, Ll4/h$a;->a:Lv3/i0;

    .line 157
    .line 158
    return p3

    .line 159
    :cond_6
    iget-object p1, p4, Ll4/h$a;->a:Lv3/i0;

    .line 160
    .line 161
    invoke-static {p1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    return v0
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

.method public final d(Z)V
    .locals 0

    invoke-super {p0, p1}, Ll4/h;->d(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll4/g;->n:Z

    :cond_0
    return-void
.end method
