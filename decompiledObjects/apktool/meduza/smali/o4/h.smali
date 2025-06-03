.class public final Lo4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/j$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo4/j$a;)Lo4/j;
    .locals 4

    .line 1
    sget v0, Lv5/e0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Lo4/j$a;->c:Lv3/i0;

    .line 12
    .line 13
    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lv5/p;->i(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "Creating an asynchronous MediaCodec adapter for track type "

    .line 20
    .line 21
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0}, Lv5/e0;->A(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "DMCodecAdapterFactory"

    .line 37
    .line 38
    invoke-static {v2, v1}, Lv5/m;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lo4/b$a;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lo4/b$a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Lo4/b$a;->b(Lo4/j$a;)Lo4/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    :try_start_0
    invoke-static {p1}, Lo4/r$a;->b(Lo4/j$a;)Landroid/media/MediaCodec;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "configureCodec"

    .line 57
    .line 58
    invoke-static {v1}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p1, Lo4/j$a;->b:Landroid/media/MediaFormat;

    .line 62
    .line 63
    iget-object v2, p1, Lo4/j$a;->d:Landroid/view/Surface;

    .line 64
    .line 65
    iget-object p1, p1, Lo4/j$a;->e:Landroid/media/MediaCrypto;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lp2/m0;->B()V

    .line 72
    .line 73
    .line 74
    const-string p1, "startCodec"

    .line 75
    .line 76
    invoke-static {p1}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lp2/m0;->B()V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lo4/r;

    .line 86
    .line 87
    invoke-direct {p1, v0}, Lo4/r;-><init>(Landroid/media/MediaCodec;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :catch_0
    move-exception p1

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    move-exception p1

    .line 94
    :goto_0
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 97
    .line 98
    .line 99
    :cond_1
    throw p1
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
.end method
