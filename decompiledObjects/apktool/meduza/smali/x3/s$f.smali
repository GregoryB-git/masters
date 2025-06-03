.class public final Lx3/s$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lv3/i0;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[Lx3/f;


# direct methods
.method public constructor <init>(Lv3/i0;IIIIIII[Lx3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/s$f;->a:Lv3/i0;

    iput p2, p0, Lx3/s$f;->b:I

    iput p3, p0, Lx3/s$f;->c:I

    iput p4, p0, Lx3/s$f;->d:I

    iput p5, p0, Lx3/s$f;->e:I

    iput p6, p0, Lx3/s$f;->f:I

    iput p7, p0, Lx3/s$f;->g:I

    iput p8, p0, Lx3/s$f;->h:I

    iput-object p9, p0, Lx3/s$f;->i:[Lx3/f;

    return-void
.end method

.method public static c(Lx3/d;Z)Landroid/media/AudioAttributes;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/media/AudioAttributes$Builder;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 p1, 0x10

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lx3/d;->a()Lx3/d$c;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, Lx3/d$c;->a:Landroid/media/AudioAttributes;

    .line 34
    .line 35
    return-object p0
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
.method public final a(ZLx3/d;I)Landroid/media/AudioTrack;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lx3/s$f;->b(ZLx3/d;I)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ne v3, v1, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 15
    .line 16
    .line 17
    :catch_0
    new-instance p1, Lx3/m$b;

    .line 18
    .line 19
    iget v4, p0, Lx3/s$f;->e:I

    .line 20
    .line 21
    iget v5, p0, Lx3/s$f;->f:I

    .line 22
    .line 23
    iget v6, p0, Lx3/s$f;->h:I

    .line 24
    .line 25
    iget-object v7, p0, Lx3/s$f;->a:Lv3/i0;

    .line 26
    .line 27
    iget p2, p0, Lx3/s$f;->c:I

    .line 28
    .line 29
    if-ne p2, v1, :cond_1

    .line 30
    .line 31
    move v8, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v8, v0

    .line 34
    :goto_0
    const/4 v9, 0x0

    .line 35
    move-object v2, p1

    .line 36
    invoke-direct/range {v2 .. v9}, Lx3/m$b;-><init>(IIIILv3/i0;ZLjava/lang/RuntimeException;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :catch_1
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :catch_2
    move-exception p1

    .line 43
    :goto_1
    move-object v9, p1

    .line 44
    new-instance p1, Lx3/m$b;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iget v4, p0, Lx3/s$f;->e:I

    .line 48
    .line 49
    iget v5, p0, Lx3/s$f;->f:I

    .line 50
    .line 51
    iget v6, p0, Lx3/s$f;->h:I

    .line 52
    .line 53
    iget-object v7, p0, Lx3/s$f;->a:Lv3/i0;

    .line 54
    .line 55
    iget p2, p0, Lx3/s$f;->c:I

    .line 56
    .line 57
    if-ne p2, v1, :cond_2

    .line 58
    .line 59
    move v8, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v8, v0

    .line 62
    :goto_2
    move-object v2, p1

    .line 63
    invoke-direct/range {v2 .. v9}, Lx3/m$b;-><init>(IIIILv3/i0;ZLjava/lang/RuntimeException;)V

    .line 64
    .line 65
    .line 66
    throw p1
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

.method public final b(ZLx3/d;I)Landroid/media/AudioTrack;
    .locals 8

    .line 1
    sget v0, Lv5/e0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lx3/s$f;->e:I

    .line 8
    .line 9
    iget v1, p0, Lx3/s$f;->f:I

    .line 10
    .line 11
    iget v2, p0, Lx3/s$f;->g:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lx3/s;->x(III)Landroid/media/AudioFormat;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2, p1}, Lx3/s$f;->c(Lx3/d;Z)Landroid/media/AudioAttributes;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, Landroid/media/AudioTrack$Builder;

    .line 22
    .line 23
    invoke-direct {p2}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget v0, p0, Lx3/s$f;->h:I

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget p3, p0, Lx3/s$f;->c:I

    .line 50
    .line 51
    if-ne p3, p2, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p2, 0x0

    .line 55
    :goto_0
    invoke-static {p1, p2}, Laa/v;->d(Landroid/media/AudioTrack$Builder;Z)Landroid/media/AudioTrack$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_1
    const/16 v1, 0x15

    .line 65
    .line 66
    if-lt v0, v1, :cond_2

    .line 67
    .line 68
    new-instance v0, Landroid/media/AudioTrack;

    .line 69
    .line 70
    invoke-static {p2, p1}, Lx3/s$f;->c(Lx3/d;Z)Landroid/media/AudioAttributes;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget p1, p0, Lx3/s$f;->e:I

    .line 75
    .line 76
    iget p2, p0, Lx3/s$f;->f:I

    .line 77
    .line 78
    iget v1, p0, Lx3/s$f;->g:I

    .line 79
    .line 80
    invoke-static {p1, p2, v1}, Lx3/s;->x(III)Landroid/media/AudioFormat;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget v5, p0, Lx3/s$f;->h:I

    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    move-object v2, v0

    .line 88
    move v7, p3

    .line 89
    invoke-direct/range {v2 .. v7}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_2
    iget p1, p2, Lx3/d;->c:I

    .line 94
    .line 95
    invoke-static {p1}, Lv5/e0;->y(I)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    new-instance p1, Landroid/media/AudioTrack;

    .line 100
    .line 101
    iget v2, p0, Lx3/s$f;->e:I

    .line 102
    .line 103
    iget v3, p0, Lx3/s$f;->f:I

    .line 104
    .line 105
    iget v4, p0, Lx3/s$f;->g:I

    .line 106
    .line 107
    iget v5, p0, Lx3/s$f;->h:I

    .line 108
    .line 109
    const/4 v6, 0x1

    .line 110
    if-nez p3, :cond_3

    .line 111
    .line 112
    move-object v0, p1

    .line 113
    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    const/4 v6, 0x1

    .line 118
    move-object v0, p1

    .line 119
    move v7, p3

    .line 120
    invoke-direct/range {v0 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 121
    .line 122
    .line 123
    :goto_1
    return-object p1
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
