.class public final Lv5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv5/i$b;,
        Lv5/i$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:[Lv5/i$a;

.field public final c:[Lv5/i$b;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, v0, Lv5/i;->a:I

    .line 11
    .line 12
    invoke-static {}, Lv5/j;->a()V

    .line 13
    .line 14
    .line 15
    const v2, 0x8b31

    .line 16
    .line 17
    .line 18
    const-string v3, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"

    .line 19
    .line 20
    invoke-static {v1, v2, v3}, Lv5/i;->a(IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const v2, 0x8b30

    .line 24
    .line 25
    .line 26
    const-string v3, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"

    .line 27
    .line 28
    invoke-static {v1, v2, v3}, Lv5/i;->a(IILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    new-array v3, v2, [I

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    aput v4, v3, v4

    .line 39
    .line 40
    const v5, 0x8b82

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v5, v3, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 44
    .line 45
    .line 46
    aget v3, v3, v4

    .line 47
    .line 48
    if-ne v3, v2, :cond_0

    .line 49
    .line 50
    move v3, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v3, v4

    .line 53
    :goto_0
    const-string v5, "Unable to link shader program: \n"

    .line 54
    .line 55
    invoke-static {v5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v1}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5, v3}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v3, v0, Lv5/i;->d:Ljava/util/HashMap;

    .line 82
    .line 83
    new-array v3, v2, [I

    .line 84
    .line 85
    const v5, 0x8b89

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v5, v3, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 89
    .line 90
    .line 91
    aget v1, v3, v4

    .line 92
    .line 93
    new-array v1, v1, [Lv5/i$a;

    .line 94
    .line 95
    iput-object v1, v0, Lv5/i;->b:[Lv5/i$a;

    .line 96
    .line 97
    move v1, v4

    .line 98
    :goto_1
    aget v5, v3, v4

    .line 99
    .line 100
    if-ge v1, v5, :cond_3

    .line 101
    .line 102
    iget v15, v0, Lv5/i;->a:I

    .line 103
    .line 104
    new-array v5, v2, [I

    .line 105
    .line 106
    const v6, 0x8b8a

    .line 107
    .line 108
    .line 109
    invoke-static {v15, v6, v5, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 110
    .line 111
    .line 112
    aget v14, v5, v4

    .line 113
    .line 114
    new-array v13, v14, [B

    .line 115
    .line 116
    new-array v8, v2, [I

    .line 117
    .line 118
    new-array v10, v2, [I

    .line 119
    .line 120
    new-array v12, v2, [I

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v11, 0x0

    .line 124
    const/4 v2, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    move v5, v15

    .line 128
    move v6, v1

    .line 129
    move v7, v14

    .line 130
    move-object/from16 v17, v13

    .line 131
    .line 132
    move v13, v2

    .line 133
    move v2, v14

    .line 134
    move-object/from16 v14, v17

    .line 135
    .line 136
    move/from16 v18, v15

    .line 137
    .line 138
    move/from16 v15, v16

    .line 139
    .line 140
    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 141
    .line 142
    .line 143
    new-instance v5, Ljava/lang/String;

    .line 144
    .line 145
    move v14, v4

    .line 146
    :goto_2
    if-ge v14, v2, :cond_2

    .line 147
    .line 148
    move-object/from16 v6, v17

    .line 149
    .line 150
    aget-byte v7, v6, v14

    .line 151
    .line 152
    if-nez v7, :cond_1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_1
    add-int/lit8 v14, v14, 0x1

    .line 156
    .line 157
    move-object/from16 v17, v6

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_2
    move-object/from16 v6, v17

    .line 161
    .line 162
    move v14, v2

    .line 163
    :goto_3
    invoke-direct {v5, v6, v4, v14}, Ljava/lang/String;-><init>([BII)V

    .line 164
    .line 165
    .line 166
    move/from16 v2, v18

    .line 167
    .line 168
    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 169
    .line 170
    .line 171
    new-instance v2, Lv5/i$a;

    .line 172
    .line 173
    invoke-direct {v2, v5}, Lv5/i$a;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object v6, v0, Lv5/i;->b:[Lv5/i$a;

    .line 177
    .line 178
    aput-object v2, v6, v1

    .line 179
    .line 180
    iget-object v6, v0, Lv5/i;->d:Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-virtual {v6, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    add-int/lit8 v1, v1, 0x1

    .line 186
    .line 187
    const/4 v2, 0x1

    .line 188
    goto :goto_1

    .line 189
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object v1, v0, Lv5/i;->e:Ljava/util/HashMap;

    .line 195
    .line 196
    const/4 v1, 0x1

    .line 197
    new-array v2, v1, [I

    .line 198
    .line 199
    iget v3, v0, Lv5/i;->a:I

    .line 200
    .line 201
    const v5, 0x8b86

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v5, v2, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 205
    .line 206
    .line 207
    aget v3, v2, v4

    .line 208
    .line 209
    new-array v3, v3, [Lv5/i$b;

    .line 210
    .line 211
    iput-object v3, v0, Lv5/i;->c:[Lv5/i$b;

    .line 212
    .line 213
    move v3, v4

    .line 214
    :goto_4
    aget v5, v2, v4

    .line 215
    .line 216
    if-ge v3, v5, :cond_6

    .line 217
    .line 218
    iget v15, v0, Lv5/i;->a:I

    .line 219
    .line 220
    new-array v5, v1, [I

    .line 221
    .line 222
    const v6, 0x8b87

    .line 223
    .line 224
    .line 225
    invoke-static {v15, v6, v5, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 226
    .line 227
    .line 228
    new-array v12, v1, [I

    .line 229
    .line 230
    aget v14, v5, v4

    .line 231
    .line 232
    new-array v13, v14, [B

    .line 233
    .line 234
    new-array v8, v1, [I

    .line 235
    .line 236
    new-array v10, v1, [I

    .line 237
    .line 238
    const/4 v9, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v1, 0x0

    .line 241
    const/16 v16, 0x0

    .line 242
    .line 243
    move v5, v15

    .line 244
    move v6, v3

    .line 245
    move v7, v14

    .line 246
    move-object/from16 v17, v13

    .line 247
    .line 248
    move v13, v1

    .line 249
    move v1, v14

    .line 250
    move-object/from16 v14, v17

    .line 251
    .line 252
    move/from16 v19, v15

    .line 253
    .line 254
    move/from16 v15, v16

    .line 255
    .line 256
    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 257
    .line 258
    .line 259
    new-instance v5, Ljava/lang/String;

    .line 260
    .line 261
    move v14, v4

    .line 262
    :goto_5
    if-ge v14, v1, :cond_5

    .line 263
    .line 264
    move-object/from16 v6, v17

    .line 265
    .line 266
    aget-byte v7, v6, v14

    .line 267
    .line 268
    if-nez v7, :cond_4

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 272
    .line 273
    move-object/from16 v17, v6

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_5
    move-object/from16 v6, v17

    .line 277
    .line 278
    move v14, v1

    .line 279
    :goto_6
    invoke-direct {v5, v6, v4, v14}, Ljava/lang/String;-><init>([BII)V

    .line 280
    .line 281
    .line 282
    move/from16 v1, v19

    .line 283
    .line 284
    invoke-static {v1, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 285
    .line 286
    .line 287
    new-instance v1, Lv5/i$b;

    .line 288
    .line 289
    invoke-direct {v1, v5}, Lv5/i$b;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v6, v0, Lv5/i;->c:[Lv5/i$b;

    .line 293
    .line 294
    aput-object v1, v6, v3

    .line 295
    .line 296
    iget-object v6, v0, Lv5/i;->e:Ljava/util/HashMap;

    .line 297
    .line 298
    invoke-virtual {v6, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    add-int/lit8 v3, v3, 0x1

    .line 302
    .line 303
    const/4 v1, 0x1

    .line 304
    goto :goto_4

    .line 305
    :cond_6
    invoke-static {}, Lv5/j;->a()V

    .line 306
    .line 307
    .line 308
    return-void
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public static a(IILjava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const v3, 0x8b81

    invoke-static {p1, v3, v1, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    aget v1, v1, v2

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lv5/j;->b(Ljava/lang/String;Z)V

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    invoke-static {}, Lv5/j;->a()V

    return-void
.end method
