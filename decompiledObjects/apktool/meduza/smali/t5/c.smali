.class public final Lt5/c;
.super Lt5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/c$a;
    }
.end annotation


# instance fields
.field public final e:Landroid/content/res/AssetManager;

.field public f:Landroid/net/Uri;

.field public g:Ljava/io/InputStream;

.field public h:J

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt5/f;-><init>(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lt5/c;->e:Landroid/content/res/AssetManager;

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p1, Lt5/n;->a:Landroid/net/Uri;

    .line 2
    .line 3
    iput-object v0, p0, Lt5/c;->f:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v1, "/android_asset/"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0xf

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v1, "/"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lt5/f;->q(Lt5/n;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lt5/c;->e:Landroid/content/res/AssetManager;

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lt5/c;->g:Ljava/io/InputStream;

    .line 50
    .line 51
    iget-wide v3, p1, Lt5/n;->f:J

    .line 52
    .line 53
    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iget-wide v3, p1, Lt5/n;->f:J

    .line 58
    .line 59
    cmp-long v0, v0, v3

    .line 60
    .line 61
    if-ltz v0, :cond_4

    .line 62
    .line 63
    iget-wide v0, p1, Lt5/n;->g:J

    .line 64
    .line 65
    const-wide/16 v3, -0x1

    .line 66
    .line 67
    cmp-long v5, v0, v3

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    iput-wide v0, p0, Lt5/c;->h:J

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object v0, p0, Lt5/c;->g:Ljava/io/InputStream;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    int-to-long v0, v0

    .line 81
    iput-wide v0, p0, Lt5/c;->h:J

    .line 82
    .line 83
    const-wide/32 v5, 0x7fffffff

    .line 84
    .line 85
    .line 86
    cmp-long v0, v0, v5

    .line 87
    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    iput-wide v3, p0, Lt5/c;->h:J
    :try_end_0
    .catch Lt5/c$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    :cond_3
    :goto_1
    iput-boolean v2, p0, Lt5/c;->i:Z

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lt5/f;->r(Lt5/n;)V

    .line 95
    .line 96
    .line 97
    iget-wide v0, p0, Lt5/c;->h:J

    .line 98
    .line 99
    return-wide v0

    .line 100
    :cond_4
    :try_start_1
    new-instance p1, Lt5/c$a;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    const/16 v1, 0x7d8

    .line 104
    .line 105
    invoke-direct {p1, v1, v0}, Lt5/c$a;-><init>(ILjava/io/IOException;)V

    .line 106
    .line 107
    .line 108
    throw p1
    :try_end_1
    .catch Lt5/c$a; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 109
    :catch_0
    move-exception p1

    .line 110
    new-instance v0, Lt5/c$a;

    .line 111
    .line 112
    instance-of v1, p1, Ljava/io/FileNotFoundException;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    const/16 v1, 0x7d5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const/16 v1, 0x7d0

    .line 120
    .line 121
    :goto_2
    invoke-direct {v0, v1, p1}, Lt5/c$a;-><init>(ILjava/io/IOException;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :catch_1
    move-exception p1

    .line 126
    throw p1
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
.end method

.method public final close()V
    .locals 5

    const/4 v0, 0x0

    iput-object v0, p0, Lt5/c;->f:Landroid/net/Uri;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lt5/c;->g:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iput-object v0, p0, Lt5/c;->g:Ljava/io/InputStream;

    iget-boolean v0, p0, Lt5/c;->i:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lt5/c;->i:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_1
    return-void

    :catch_0
    move-exception v2

    :try_start_1
    new-instance v3, Lt5/c$a;

    const/16 v4, 0x7d0

    invoke-direct {v3, v4, v2}, Lt5/c$a;-><init>(ILjava/io/IOException;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    iput-object v0, p0, Lt5/c;->g:Ljava/io/InputStream;

    iget-boolean v0, p0, Lt5/c;->i:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lt5/c;->i:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_2
    throw v2
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/c;->f:Landroid/net/Uri;

    return-object v0
.end method

.method public final read([BII)I
    .locals 8

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lt5/c;->h:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, -0x1

    if-nez v2, :cond_1

    return v3

    :cond_1
    const-wide/16 v4, -0x1

    cmp-long v2, v0, v4

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v6, p3

    :try_start_0
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    :goto_0
    iget-object v0, p0, Lt5/c;->g:Ljava/io/InputStream;

    sget v1, Lv5/e0;->a:I

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v3, :cond_3

    return v3

    :cond_3
    iget-wide p2, p0, Lt5/c;->h:J

    cmp-long v0, p2, v4

    if-eqz v0, :cond_4

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lt5/c;->h:J

    :cond_4
    invoke-virtual {p0, p1}, Lt5/f;->o(I)V

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lt5/c$a;

    const/16 p3, 0x7d0

    invoke-direct {p2, p3, p1}, Lt5/c$a;-><init>(ILjava/io/IOException;)V

    throw p2
.end method
