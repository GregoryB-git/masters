.class public final Lt5/i;
.super Lt5/f;
.source "SourceFile"


# instance fields
.field public e:Lt5/n;

.field public f:[B

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt5/f;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lt5/f;->q(Lt5/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt5/i;->e:Lt5/n;

    .line 5
    .line 6
    iget-object v0, p1, Lt5/n;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data"

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v4, "Unsupported scheme: "

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, v2}, Lx6/b;->o(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget v2, Lv5/e0;->a:I

    .line 43
    .line 44
    const-string v2, ","

    .line 45
    .line 46
    const/4 v3, -0x1

    .line 47
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    array-length v2, v1

    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x1

    .line 54
    const/4 v5, 0x2

    .line 55
    const/4 v6, 0x0

    .line 56
    if-ne v2, v5, :cond_4

    .line 57
    .line 58
    aget-object v0, v1, v4

    .line 59
    .line 60
    aget-object v1, v1, v3

    .line 61
    .line 62
    const-string v2, ";base64"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    :try_start_0
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p0, Lt5/i;->f:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception p1

    .line 78
    const-string v1, "Error while parsing Base64 encoded string: "

    .line 79
    .line 80
    invoke-static {v1, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Lv3/a1;

    .line 85
    .line 86
    invoke-direct {v1, v0, p1, v4, v3}, Lv3/a1;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_0
    sget-object v1, Ln7/d;->a:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lv5/e0;->B(Ljava/lang/String;)[B

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lt5/i;->f:[B

    .line 105
    .line 106
    :goto_0
    iget-wide v0, p1, Lt5/n;->f:J

    .line 107
    .line 108
    iget-object v2, p0, Lt5/i;->f:[B

    .line 109
    .line 110
    array-length v3, v2

    .line 111
    int-to-long v3, v3

    .line 112
    cmp-long v3, v0, v3

    .line 113
    .line 114
    if-gtz v3, :cond_3

    .line 115
    .line 116
    long-to-int v0, v0

    .line 117
    iput v0, p0, Lt5/i;->g:I

    .line 118
    .line 119
    array-length v1, v2

    .line 120
    sub-int/2addr v1, v0

    .line 121
    iput v1, p0, Lt5/i;->h:I

    .line 122
    .line 123
    iget-wide v2, p1, Lt5/n;->g:J

    .line 124
    .line 125
    const-wide/16 v4, -0x1

    .line 126
    .line 127
    cmp-long v0, v2, v4

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    int-to-long v0, v1

    .line 132
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    long-to-int v0, v0

    .line 137
    iput v0, p0, Lt5/i;->h:I

    .line 138
    .line 139
    :cond_1
    invoke-virtual {p0, p1}, Lt5/f;->r(Lt5/n;)V

    .line 140
    .line 141
    .line 142
    iget-wide v0, p1, Lt5/n;->g:J

    .line 143
    .line 144
    cmp-long p1, v0, v4

    .line 145
    .line 146
    if-eqz p1, :cond_2

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    iget p1, p0, Lt5/i;->h:I

    .line 150
    .line 151
    int-to-long v0, p1

    .line 152
    :goto_1
    return-wide v0

    .line 153
    :cond_3
    iput-object v6, p0, Lt5/i;->f:[B

    .line 154
    .line 155
    new-instance p1, Lt5/l;

    .line 156
    .line 157
    const/16 v0, 0x7d8

    .line 158
    .line 159
    invoke-direct {p1, v0}, Lt5/l;-><init>(I)V

    .line 160
    .line 161
    .line 162
    throw p1

    .line 163
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v1, "Unexpected URI format: "

    .line 169
    .line 170
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v0, Lv3/a1;

    .line 181
    .line 182
    invoke-direct {v0, p1, v6, v4, v3}, Lv3/a1;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 183
    .line 184
    .line 185
    throw v0
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

.method public final close()V
    .locals 2

    iget-object v0, p0, Lt5/i;->f:[B

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lt5/i;->f:[B

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_0
    iput-object v1, p0, Lt5/i;->e:Lt5/n;

    return-void
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/i;->e:Lt5/n;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt5/n;->a:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lt5/i;->h:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lt5/i;->f:[B

    sget v1, Lv5/e0;->a:I

    iget v1, p0, Lt5/i;->g:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lt5/i;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lt5/i;->g:I

    iget p1, p0, Lt5/i;->h:I

    sub-int/2addr p1, p3

    iput p1, p0, Lt5/i;->h:I

    invoke-virtual {p0, p3}, Lt5/f;->o(I)V

    return p3
.end method
