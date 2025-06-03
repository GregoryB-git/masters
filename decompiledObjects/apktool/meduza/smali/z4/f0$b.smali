.class public final Lz4/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public b:Z

.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz4/f0;->r:Lv3/i0;

    .line 5
    .line 6
    const-wide/32 v0, 0xac44

    .line 7
    .line 8
    .line 9
    mul-long/2addr p1, v0

    .line 10
    const-wide/32 v0, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long/2addr p1, v0

    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-static {v0, v0}, Lv5/e0;->w(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-long v0, v0

    .line 20
    mul-long/2addr v0, p1

    .line 21
    iput-wide v0, p0, Lz4/f0$b;->a:J

    .line 22
    .line 23
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lz4/f0$b;->c(J)V

    .line 26
    .line 27
    .line 28
    return-void
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


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c(J)V
    .locals 8

    .line 1
    sget-object v0, Lz4/f0;->r:Lv3/i0;

    .line 2
    .line 3
    const-wide/32 v0, 0xac44

    .line 4
    .line 5
    .line 6
    mul-long/2addr p1, v0

    .line 7
    const-wide/32 v0, 0xf4240

    .line 8
    .line 9
    .line 10
    div-long/2addr p1, v0

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0, v0}, Lv5/e0;->w(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-long v0, v0

    .line 17
    mul-long v2, v0, p1

    .line 18
    .line 19
    iget-wide v6, p0, Lz4/f0$b;->a:J

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    invoke-static/range {v2 .. v7}, Lv5/e0;->j(JJJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    iput-wide p1, p0, Lz4/f0$b;->c:J

    .line 28
    .line 29
    return-void
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

.method public final m(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lz4/f0$b;->c:J

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lz4/f0$b;->c(J)V

    .line 4
    .line 5
    .line 6
    iget-wide p1, p0, Lz4/f0$b;->c:J

    .line 7
    .line 8
    sub-long/2addr p1, v0

    .line 9
    sget-object v0, Lz4/f0;->t:[B

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    int-to-long v0, v0

    .line 13
    div-long/2addr p1, v0

    .line 14
    long-to-int p1, p1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
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

.method public final r(Ll3/l;Lz3/g;I)I
    .locals 8

    .line 1
    iget-boolean v0, p0, Lz4/f0$b;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    and-int/lit8 v0, p3, 0x2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v2, p0, Lz4/f0$b;->a:J

    .line 12
    .line 13
    iget-wide v4, p0, Lz4/f0$b;->c:J

    .line 14
    .line 15
    sub-long/2addr v2, v4

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long p1, v2, v6

    .line 19
    .line 20
    const/4 v0, -0x4

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-virtual {p2, p1}, Lz3/a;->l(I)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    sget-object p1, Lz4/f0;->r:Lv3/i0;

    .line 29
    .line 30
    const/4 p1, 0x2

    .line 31
    invoke-static {p1, p1}, Lv5/e0;->w(II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-long v6, p1

    .line 36
    div-long/2addr v4, v6

    .line 37
    const-wide/32 v6, 0xf4240

    .line 38
    .line 39
    .line 40
    mul-long/2addr v4, v6

    .line 41
    const-wide/32 v6, 0xac44

    .line 42
    .line 43
    .line 44
    div-long/2addr v4, v6

    .line 45
    iput-wide v4, p2, Lz3/g;->e:J

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Lz3/a;->l(I)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lz4/f0;->t:[B

    .line 51
    .line 52
    array-length v4, p1

    .line 53
    int-to-long v4, v4

    .line 54
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    long-to-int v2, v2

    .line 59
    and-int/lit8 v3, p3, 0x4

    .line 60
    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {p2, v2}, Lz3/g;->q(I)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p2, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {p2, p1, v3, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    :cond_2
    and-int/lit8 p1, p3, 0x1

    .line 73
    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    iget-wide p1, p0, Lz4/f0$b;->c:J

    .line 77
    .line 78
    int-to-long v1, v2

    .line 79
    add-long/2addr p1, v1

    .line 80
    iput-wide p1, p0, Lz4/f0$b;->c:J

    .line 81
    .line 82
    :cond_3
    return v0

    .line 83
    :cond_4
    :goto_0
    sget-object p2, Lz4/f0;->r:Lv3/i0;

    .line 84
    .line 85
    iput-object p2, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 86
    .line 87
    iput-boolean v1, p0, Lz4/f0$b;->b:Z

    .line 88
    .line 89
    const/4 p1, -0x5

    .line 90
    return p1
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
