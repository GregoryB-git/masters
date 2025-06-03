.class public Lk0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/c1;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lt0/k;

.field public c:I

.field public d:J

.field public e:Z

.field public f:Lt0/z;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/t;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Lt0/k;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lt0/k;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk0/t;->b:Lt0/k;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lk0/t;->c:I

    .line 15
    .line 16
    const-wide/16 v0, 0x1388

    .line 17
    .line 18
    iput-wide v0, p0, Lk0/t;->d:J

    .line 19
    .line 20
    sget-object p1, Lt0/z;->a:Lt0/z;

    .line 21
    .line 22
    iput-object p1, p0, Lk0/t;->f:Lt0/z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;LD0/E;Lm0/x;Lz0/h;Lu0/b;)[Lk0/Y0;
    .locals 12

    .line 1
    move-object v10, p0

    .line 2
    new-instance v11, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, v10, Lk0/t;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget v2, v10, Lk0/t;->c:I

    .line 10
    .line 11
    iget-object v3, v10, Lk0/t;->f:Lt0/z;

    .line 12
    .line 13
    iget-boolean v4, v10, Lk0/t;->e:Z

    .line 14
    .line 15
    iget-wide v7, v10, Lk0/t;->d:J

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v5, p1

    .line 19
    move-object v6, p2

    .line 20
    move-object v9, v11

    .line 21
    invoke-virtual/range {v0 .. v9}, Lk0/t;->i(Landroid/content/Context;ILt0/z;ZLandroid/os/Handler;LD0/E;JLjava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v10, Lk0/t;->a:Landroid/content/Context;

    .line 25
    .line 26
    iget-boolean v1, v10, Lk0/t;->g:Z

    .line 27
    .line 28
    iget-boolean v2, v10, Lk0/t;->h:Z

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, v2}, Lk0/t;->c(Landroid/content/Context;ZZ)Lm0/z;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    iget-object v1, v10, Lk0/t;->a:Landroid/content/Context;

    .line 37
    .line 38
    iget v2, v10, Lk0/t;->c:I

    .line 39
    .line 40
    iget-object v3, v10, Lk0/t;->f:Lt0/z;

    .line 41
    .line 42
    iget-boolean v4, v10, Lk0/t;->e:Z

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    move-object v6, p1

    .line 46
    move-object v7, p3

    .line 47
    move-object v8, v11

    .line 48
    invoke-virtual/range {v0 .. v8}, Lk0/t;->b(Landroid/content/Context;ILt0/z;ZLm0/z;Landroid/os/Handler;Lm0/x;Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v1, v10, Lk0/t;->a:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v4, v10, Lk0/t;->c:I

    .line 58
    .line 59
    move-object v0, p0

    .line 60
    move-object/from16 v2, p4

    .line 61
    .line 62
    move-object v5, v11

    .line 63
    invoke-virtual/range {v0 .. v5}, Lk0/t;->h(Landroid/content/Context;Lz0/h;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v10, Lk0/t;->a:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, v10, Lk0/t;->c:I

    .line 73
    .line 74
    move-object/from16 v2, p5

    .line 75
    .line 76
    invoke-virtual/range {v0 .. v5}, Lk0/t;->f(Landroid/content/Context;Lu0/b;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v10, Lk0/t;->a:Landroid/content/Context;

    .line 80
    .line 81
    iget v1, v10, Lk0/t;->c:I

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1, v11}, Lk0/t;->d(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v11}, Lk0/t;->e(Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v10, Lk0/t;->a:Landroid/content/Context;

    .line 90
    .line 91
    iget v1, v10, Lk0/t;->c:I

    .line 92
    .line 93
    move-object v2, p1

    .line 94
    invoke-virtual {p0, v0, p1, v1, v11}, Lk0/t;->g(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    new-array v0, v0, [Lk0/Y0;

    .line 99
    .line 100
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, [Lk0/Y0;

    .line 105
    .line 106
    return-object v0
.end method

.method public b(Landroid/content/Context;ILt0/z;ZLm0/z;Landroid/os/Handler;Lm0/x;Ljava/util/ArrayList;)V
    .locals 18

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v9, p8

    .line 4
    .line 5
    const/4 v11, 0x2

    .line 6
    const/4 v12, 0x0

    .line 7
    const/4 v13, 0x1

    .line 8
    const-class v14, Lm0/z;

    .line 9
    .line 10
    const-class v15, Lm0/x;

    .line 11
    .line 12
    const-class v16, Landroid/os/Handler;

    .line 13
    .line 14
    const-string v8, "DefaultRenderersFactory"

    .line 15
    .line 16
    new-instance v7, Lm0/b0;

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lk0/t;->j()Lt0/m$b;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v1, v7

    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    move-object/from16 v4, p3

    .line 26
    .line 27
    move/from16 v5, p4

    .line 28
    .line 29
    move-object/from16 v6, p6

    .line 30
    .line 31
    move-object v10, v7

    .line 32
    move-object/from16 v7, p7

    .line 33
    .line 34
    move-object/from16 v17, v8

    .line 35
    .line 36
    move-object/from16 v8, p5

    .line 37
    .line 38
    invoke-direct/range {v1 .. v8}, Lm0/b0;-><init>(Landroid/content/Context;Lt0/m$b;Lt0/z;ZLandroid/os/Handler;Lm0/x;Lm0/z;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual/range {p8 .. p8}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ne v0, v11, :cond_1

    .line 52
    .line 53
    add-int/lit8 v1, v1, -0x1

    .line 54
    .line 55
    :cond_1
    :try_start_0
    const-string v0, "androidx.media3.decoder.midi.MidiRenderer"

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-array v2, v13, [Ljava/lang/Class;

    .line 62
    .line 63
    const-class v3, Landroid/content/Context;

    .line 64
    .line 65
    aput-object v3, v2, v12

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-array v2, v13, [Ljava/lang/Object;

    .line 72
    .line 73
    aput-object p1, v2, v12

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lk0/Y0;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    add-int/lit8 v2, v1, 0x1

    .line 82
    .line 83
    :try_start_1
    invoke-virtual {v9, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v0, "Loaded MidiRenderer."
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    .line 88
    move-object/from16 v3, v17

    .line 89
    .line 90
    :try_start_2
    invoke-static {v3, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catch_0
    move-exception v0

    .line 95
    goto :goto_1

    .line 96
    :catch_1
    :goto_0
    move v1, v2

    .line 97
    goto :goto_2

    .line 98
    :catch_2
    move-object/from16 v3, v17

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catch_3
    move-object/from16 v3, v17

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 105
    .line 106
    const-string v2, "Error instantiating MIDI extension"

    .line 107
    .line 108
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v1

    .line 112
    :goto_2
    move v2, v1

    .line 113
    :goto_3
    :try_start_3
    const-string v0, "androidx.media3.decoder.opus.LibopusAudioRenderer"

    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/4 v1, 0x3

    .line 120
    new-array v4, v1, [Ljava/lang/Class;

    .line 121
    .line 122
    aput-object v16, v4, v12

    .line 123
    .line 124
    aput-object v15, v4, v13

    .line 125
    .line 126
    aput-object v14, v4, v11

    .line 127
    .line 128
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-array v4, v1, [Ljava/lang/Object;

    .line 133
    .line 134
    aput-object p6, v4, v12

    .line 135
    .line 136
    aput-object p7, v4, v13

    .line 137
    .line 138
    aput-object p5, v4, v11

    .line 139
    .line 140
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Lk0/Y0;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 145
    .line 146
    add-int/lit8 v1, v2, 0x1

    .line 147
    .line 148
    :try_start_4
    invoke-virtual {v9, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const-string v0, "Loaded LibopusAudioRenderer."

    .line 152
    .line 153
    invoke-static {v3, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :catch_4
    move-exception v0

    .line 158
    goto :goto_4

    .line 159
    :catch_5
    move v2, v1

    .line 160
    goto :goto_5

    .line 161
    :goto_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 162
    .line 163
    const-string v2, "Error instantiating Opus extension"

    .line 164
    .line 165
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :catch_6
    :goto_5
    move v1, v2

    .line 170
    :goto_6
    :try_start_5
    const-string v0, "androidx.media3.decoder.flac.LibflacAudioRenderer"

    .line 171
    .line 172
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const/4 v2, 0x3

    .line 177
    new-array v4, v2, [Ljava/lang/Class;

    .line 178
    .line 179
    aput-object v16, v4, v12

    .line 180
    .line 181
    aput-object v15, v4, v13

    .line 182
    .line 183
    aput-object v14, v4, v11

    .line 184
    .line 185
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-array v4, v2, [Ljava/lang/Object;

    .line 190
    .line 191
    aput-object p6, v4, v12

    .line 192
    .line 193
    aput-object p7, v4, v13

    .line 194
    .line 195
    aput-object p5, v4, v11

    .line 196
    .line 197
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Lk0/Y0;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 202
    .line 203
    add-int/lit8 v2, v1, 0x1

    .line 204
    .line 205
    :try_start_6
    invoke-virtual {v9, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    const-string v0, "Loaded LibflacAudioRenderer."

    .line 209
    .line 210
    invoke-static {v3, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 211
    .line 212
    .line 213
    goto :goto_9

    .line 214
    :catch_7
    move-exception v0

    .line 215
    goto :goto_7

    .line 216
    :catch_8
    move v1, v2

    .line 217
    goto :goto_8

    .line 218
    :goto_7
    new-instance v1, Ljava/lang/RuntimeException;

    .line 219
    .line 220
    const-string v2, "Error instantiating FLAC extension"

    .line 221
    .line 222
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw v1

    .line 226
    :catch_9
    :goto_8
    move v2, v1

    .line 227
    :goto_9
    :try_start_7
    const-string v0, "androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer"

    .line 228
    .line 229
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const/4 v1, 0x3

    .line 234
    new-array v4, v1, [Ljava/lang/Class;

    .line 235
    .line 236
    aput-object v16, v4, v12

    .line 237
    .line 238
    aput-object v15, v4, v13

    .line 239
    .line 240
    aput-object v14, v4, v11

    .line 241
    .line 242
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-array v1, v1, [Ljava/lang/Object;

    .line 247
    .line 248
    aput-object p6, v1, v12

    .line 249
    .line 250
    aput-object p7, v1, v13

    .line 251
    .line 252
    aput-object p5, v1, v11

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Lk0/Y0;

    .line 259
    .line 260
    invoke-virtual {v9, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    const-string v0, "Loaded FfmpegAudioRenderer."

    .line 264
    .line 265
    invoke-static {v3, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_a

    .line 266
    .line 267
    .line 268
    goto :goto_a

    .line 269
    :catch_a
    move-exception v0

    .line 270
    new-instance v1, Ljava/lang/RuntimeException;

    .line 271
    .line 272
    const-string v2, "Error instantiating FFmpeg extension"

    .line 273
    .line 274
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    throw v1

    .line 278
    :catch_b
    :goto_a
    return-void
.end method

.method public c(Landroid/content/Context;ZZ)Lm0/z;
    .locals 1

    .line 1
    new-instance v0, Lm0/N$f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lm0/N$f;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Lm0/N$f;->k(Z)Lm0/N$f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p3}, Lm0/N$f;->j(Z)Lm0/N$f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lm0/N$f;->i()Lm0/N;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public d(Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p1, LE0/b;

    .line 2
    .line 3
    invoke-direct {p1}, LE0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    new-instance v0, Ls0/g;

    .line 2
    .line 3
    sget-object v1, Ls0/c$a;->a:Ls0/c$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ls0/g;-><init>(Ls0/c$a;Ls0/e;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public f(Landroid/content/Context;Lu0/b;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p1, Lu0/c;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lu0/c;-><init>(Lu0/b;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Landroid/content/Context;Lz0/h;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p1, Lz0/i;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lz0/i;-><init>(Lz0/h;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(Landroid/content/Context;ILt0/z;ZLandroid/os/Handler;LD0/E;JLjava/util/ArrayList;)V
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v11, p9

    .line 4
    .line 5
    const-string v12, "DefaultRenderersFactory"

    .line 6
    .line 7
    const-class v13, LD0/E;

    .line 8
    .line 9
    const-class v14, Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v15, LD0/k;

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Lk0/t;->j()Lt0/m$b;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v10, 0x32

    .line 18
    .line 19
    move-object v1, v15

    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    move-object/from16 v4, p3

    .line 23
    .line 24
    move-wide/from16 v5, p7

    .line 25
    .line 26
    move/from16 v7, p4

    .line 27
    .line 28
    move-object/from16 v8, p5

    .line 29
    .line 30
    move-object/from16 v9, p6

    .line 31
    .line 32
    invoke-direct/range {v1 .. v10}, LD0/k;-><init>(Landroid/content/Context;Lt0/m$b;Lt0/z;JZLandroid/os/Handler;LD0/E;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x2

    .line 46
    if-ne v0, v2, :cond_1

    .line 47
    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :cond_1
    const/16 v0, 0x32

    .line 51
    .line 52
    const/4 v3, 0x3

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x4

    .line 55
    const/4 v6, 0x1

    .line 56
    :try_start_0
    const-string v7, "androidx.media3.decoder.vp9.LibvpxVideoRenderer"

    .line 57
    .line 58
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    new-array v8, v5, [Ljava/lang/Class;

    .line 63
    .line 64
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    aput-object v9, v8, v4

    .line 67
    .line 68
    aput-object v14, v8, v6

    .line 69
    .line 70
    aput-object v13, v8, v2

    .line 71
    .line 72
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    aput-object v9, v8, v3

    .line 75
    .line 76
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    new-array v8, v5, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    aput-object v9, v8, v4

    .line 87
    .line 88
    aput-object p5, v8, v6

    .line 89
    .line 90
    aput-object p6, v8, v2

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    aput-object v9, v8, v3

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Lk0/Y0;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    add-int/lit8 v8, v1, 0x1

    .line 105
    .line 106
    :try_start_1
    invoke-virtual {v11, v1, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const-string v1, "Loaded LibvpxVideoRenderer."

    .line 110
    .line 111
    invoke-static {v12, v1}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catch_0
    move-exception v0

    .line 116
    goto :goto_0

    .line 117
    :catch_1
    move v1, v8

    .line 118
    goto :goto_1

    .line 119
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    const-string v2, "Error instantiating VP9 extension"

    .line 122
    .line 123
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :catch_2
    :goto_1
    move v8, v1

    .line 128
    :goto_2
    :try_start_2
    const-string v1, "androidx.media3.decoder.av1.Libgav1VideoRenderer"

    .line 129
    .line 130
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-array v7, v5, [Ljava/lang/Class;

    .line 135
    .line 136
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    aput-object v9, v7, v4

    .line 139
    .line 140
    aput-object v14, v7, v6

    .line 141
    .line 142
    aput-object v13, v7, v2

    .line 143
    .line 144
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    aput-object v9, v7, v3

    .line 147
    .line 148
    invoke-virtual {v1, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-array v7, v5, [Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    aput-object v9, v7, v4

    .line 159
    .line 160
    aput-object p5, v7, v6

    .line 161
    .line 162
    aput-object p6, v7, v2

    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    aput-object v9, v7, v3

    .line 169
    .line 170
    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Lk0/Y0;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 175
    .line 176
    add-int/lit8 v7, v8, 0x1

    .line 177
    .line 178
    :try_start_3
    invoke-virtual {v11, v8, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const-string v1, "Loaded Libgav1VideoRenderer."

    .line 182
    .line 183
    invoke-static {v12, v1}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :catch_3
    move-exception v0

    .line 188
    goto :goto_3

    .line 189
    :catch_4
    move v8, v7

    .line 190
    goto :goto_4

    .line 191
    :goto_3
    new-instance v1, Ljava/lang/RuntimeException;

    .line 192
    .line 193
    const-string v2, "Error instantiating AV1 extension"

    .line 194
    .line 195
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    throw v1

    .line 199
    :catch_5
    :goto_4
    move v7, v8

    .line 200
    :goto_5
    :try_start_4
    const-string v1, "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"

    .line 201
    .line 202
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-array v8, v5, [Ljava/lang/Class;

    .line 207
    .line 208
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 209
    .line 210
    aput-object v9, v8, v4

    .line 211
    .line 212
    aput-object v14, v8, v6

    .line 213
    .line 214
    aput-object v13, v8, v2

    .line 215
    .line 216
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 217
    .line 218
    aput-object v9, v8, v3

    .line 219
    .line 220
    invoke-virtual {v1, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    new-array v5, v5, [Ljava/lang/Object;

    .line 225
    .line 226
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    aput-object v8, v5, v4

    .line 231
    .line 232
    aput-object p5, v5, v6

    .line 233
    .line 234
    aput-object p6, v5, v2

    .line 235
    .line 236
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    aput-object v0, v5, v3

    .line 241
    .line 242
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Lk0/Y0;

    .line 247
    .line 248
    invoke-virtual {v11, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    const-string v0, "Loaded FfmpegVideoRenderer."

    .line 252
    .line 253
    invoke-static {v12, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :catch_6
    move-exception v0

    .line 258
    new-instance v1, Ljava/lang/RuntimeException;

    .line 259
    .line 260
    const-string v2, "Error instantiating FFmpeg extension"

    .line 261
    .line 262
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw v1

    .line 266
    :catch_7
    :goto_6
    return-void
.end method

.method public j()Lt0/m$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/t;->b:Lt0/k;

    .line 2
    .line 3
    return-object v0
.end method
