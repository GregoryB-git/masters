.class public final Lx5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw5/i;
.implements Lx5/a;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Lx5/g;

.field public final d:Lx5/c;

.field public final e:Lv5/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv5/b0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lv5/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv5/b0<",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final o:[F

.field public final p:[F

.field public q:I

.field public r:Landroid/graphics/SurfaceTexture;

.field public volatile s:I

.field public t:I

.field public u:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lx5/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lx5/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lx5/g;

    invoke-direct {v0}, Lx5/g;-><init>()V

    iput-object v0, p0, Lx5/i;->c:Lx5/g;

    new-instance v0, Lx5/c;

    invoke-direct {v0}, Lx5/c;-><init>()V

    iput-object v0, p0, Lx5/i;->d:Lx5/c;

    new-instance v0, Lv5/b0;

    invoke-direct {v0}, Lv5/b0;-><init>()V

    iput-object v0, p0, Lx5/i;->e:Lv5/b0;

    new-instance v0, Lv5/b0;

    invoke-direct {v0}, Lv5/b0;-><init>()V

    iput-object v0, p0, Lx5/i;->f:Lv5/b0;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lx5/i;->o:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lx5/i;->p:[F

    const/4 v0, 0x0

    iput v0, p0, Lx5/i;->s:I

    const/4 v0, -0x1

    iput v0, p0, Lx5/i;->t:I

    return-void
.end method


# virtual methods
.method public final a(J[F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx5/i;->d:Lx5/c;

    .line 2
    .line 3
    iget-object v0, v0, Lx5/c;->c:Lv5/b0;

    .line 4
    .line 5
    invoke-virtual {v0, p3, p1, p2}, Lv5/b0;->a(Ljava/lang/Object;J)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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

.method public final b()Landroid/graphics/SurfaceTexture;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x3f000000    # 0.5f

    :try_start_0
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    invoke-static {}, Lv5/j;->a()V

    iget-object v0, p0, Lx5/i;->c:Lx5/g;

    invoke-virtual {v0}, Lx5/g;->a()V

    invoke-static {}, Lv5/j;->a()V

    invoke-static {}, Lv5/j;->d()I

    move-result v0

    iput v0, p0, Lx5/i;->q:I
    :try_end_0
    .catch Lv5/j$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "SceneRenderer"

    const-string v2, "Failed to initialize the renderer"

    invoke-static {v1, v2, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget v1, p0, Lx5/i;->q:I

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lx5/i;->r:Landroid/graphics/SurfaceTexture;

    new-instance v1, Lx5/h;

    invoke-direct {v1, p0}, Lx5/h;-><init>(Lx5/i;)V

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    iget-object v0, p0, Lx5/i;->r:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public final c(JJLv3/i0;Landroid/media/MediaFormat;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v4, v0, Lx5/i;->e:Lv5/b0;

    .line 8
    .line 9
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {v4, v5, v1, v2}, Lv5/b0;->a(Ljava/lang/Object;J)V

    .line 14
    .line 15
    .line 16
    iget-object v4, v3, Lv3/i0;->D:[B

    .line 17
    .line 18
    iget v3, v3, Lv3/i0;->E:I

    .line 19
    .line 20
    iget-object v5, v0, Lx5/i;->u:[B

    .line 21
    .line 22
    iget v6, v0, Lx5/i;->t:I

    .line 23
    .line 24
    iput-object v4, v0, Lx5/i;->u:[B

    .line 25
    .line 26
    const/4 v4, -0x1

    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    iget v3, v0, Lx5/i;->s:I

    .line 30
    .line 31
    :cond_0
    iput v3, v0, Lx5/i;->t:I

    .line 32
    .line 33
    if-ne v6, v3, :cond_1

    .line 34
    .line 35
    iget-object v3, v0, Lx5/i;->u:[B

    .line 36
    .line 37
    invoke-static {v5, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_e

    .line 44
    .line 45
    :cond_1
    iget-object v3, v0, Lx5/i;->u:[B

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x2

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x1

    .line 51
    if-eqz v3, :cond_b

    .line 52
    .line 53
    iget v8, v0, Lx5/i;->t:I

    .line 54
    .line 55
    new-instance v9, Lv5/u;

    .line 56
    .line 57
    invoke-direct {v9, v3}, Lv5/u;-><init>([B)V

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x4

    .line 61
    :try_start_0
    invoke-virtual {v9, v3}, Lv5/u;->H(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v9, v6}, Lv5/u;->G(I)V

    .line 69
    .line 70
    .line 71
    const v10, 0x70726f6a

    .line 72
    .line 73
    .line 74
    if-ne v3, v10, :cond_2

    .line 75
    .line 76
    move v3, v7

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v3, v6

    .line 79
    :goto_0
    if-eqz v3, :cond_6

    .line 80
    .line 81
    const/16 v3, 0x8

    .line 82
    .line 83
    invoke-virtual {v9, v3}, Lv5/u;->H(I)V

    .line 84
    .line 85
    .line 86
    iget v3, v9, Lv5/u;->b:I

    .line 87
    .line 88
    iget v10, v9, Lv5/u;->c:I

    .line 89
    .line 90
    :goto_1
    if-ge v3, v10, :cond_7

    .line 91
    .line 92
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    add-int/2addr v11, v3

    .line 97
    if-le v11, v3, :cond_7

    .line 98
    .line 99
    if-le v11, v10, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const v12, 0x79746d70

    .line 107
    .line 108
    .line 109
    if-eq v3, v12, :cond_5

    .line 110
    .line 111
    const v12, 0x6d736870

    .line 112
    .line 113
    .line 114
    if-ne v3, v12, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-virtual {v9, v11}, Lv5/u;->G(I)V

    .line 118
    .line 119
    .line 120
    move v3, v11

    .line 121
    goto :goto_1

    .line 122
    :cond_5
    :goto_2
    invoke-virtual {v9, v11}, Lv5/u;->F(I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v9}, Lx5/f;->a(Lv5/u;)Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    invoke-static {v9}, Lx5/f;->a(Lv5/u;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    goto :goto_4

    .line 135
    :catch_0
    :cond_7
    :goto_3
    move-object v3, v4

    .line 136
    :goto_4
    if-nez v3, :cond_8

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eq v9, v7, :cond_a

    .line 144
    .line 145
    if-eq v9, v5, :cond_9

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    new-instance v4, Lx5/e;

    .line 149
    .line 150
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    check-cast v9, Lx5/e$a;

    .line 155
    .line 156
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lx5/e$a;

    .line 161
    .line 162
    invoke-direct {v4, v9, v3, v8}, Lx5/e;-><init>(Lx5/e$a;Lx5/e$a;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_a
    new-instance v4, Lx5/e;

    .line 167
    .line 168
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Lx5/e$a;

    .line 173
    .line 174
    invoke-direct {v4, v3, v3, v8}, Lx5/e;-><init>(Lx5/e$a;Lx5/e$a;I)V

    .line 175
    .line 176
    .line 177
    :cond_b
    :goto_5
    if-eqz v4, :cond_c

    .line 178
    .line 179
    invoke-static {v4}, Lx5/g;->b(Lx5/e;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_c

    .line 184
    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_c
    iget v3, v0, Lx5/i;->t:I

    .line 188
    .line 189
    const/high16 v4, 0x43340000    # 180.0f

    .line 190
    .line 191
    float-to-double v8, v4

    .line 192
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 193
    .line 194
    .line 195
    move-result-wide v8

    .line 196
    double-to-float v4, v8

    .line 197
    const/high16 v8, 0x43b40000    # 360.0f

    .line 198
    .line 199
    float-to-double v8, v8

    .line 200
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 201
    .line 202
    .line 203
    move-result-wide v8

    .line 204
    double-to-float v8, v8

    .line 205
    const/16 v9, 0x24

    .line 206
    .line 207
    int-to-float v10, v9

    .line 208
    div-float v10, v4, v10

    .line 209
    .line 210
    const/16 v11, 0x48

    .line 211
    .line 212
    int-to-float v12, v11

    .line 213
    div-float v12, v8, v12

    .line 214
    .line 215
    const/16 v13, 0x3e70

    .line 216
    .line 217
    new-array v13, v13, [F

    .line 218
    .line 219
    const/16 v14, 0x29a0

    .line 220
    .line 221
    new-array v14, v14, [F

    .line 222
    .line 223
    move v15, v6

    .line 224
    move/from16 v16, v15

    .line 225
    .line 226
    move/from16 v17, v16

    .line 227
    .line 228
    :goto_6
    if-ge v15, v9, :cond_13

    .line 229
    .line 230
    int-to-float v9, v15

    .line 231
    mul-float/2addr v9, v10

    .line 232
    const/high16 v18, 0x40000000    # 2.0f

    .line 233
    .line 234
    div-float v19, v4, v18

    .line 235
    .line 236
    sub-float v9, v9, v19

    .line 237
    .line 238
    add-int/lit8 v6, v15, 0x1

    .line 239
    .line 240
    int-to-float v7, v6

    .line 241
    mul-float/2addr v7, v10

    .line 242
    sub-float v7, v7, v19

    .line 243
    .line 244
    const/4 v11, 0x0

    .line 245
    :goto_7
    const/16 v5, 0x49

    .line 246
    .line 247
    if-ge v11, v5, :cond_12

    .line 248
    .line 249
    move/from16 v20, v6

    .line 250
    .line 251
    const/4 v5, 0x0

    .line 252
    const/4 v6, 0x2

    .line 253
    :goto_8
    if-ge v5, v6, :cond_11

    .line 254
    .line 255
    if-nez v5, :cond_d

    .line 256
    .line 257
    move/from16 v21, v7

    .line 258
    .line 259
    move v6, v9

    .line 260
    goto :goto_9

    .line 261
    :cond_d
    move v6, v7

    .line 262
    move/from16 v21, v6

    .line 263
    .line 264
    :goto_9
    int-to-float v7, v11

    .line 265
    mul-float/2addr v7, v12

    .line 266
    const v22, 0x40490fdb    # (float)Math.PI

    .line 267
    .line 268
    .line 269
    add-float v22, v7, v22

    .line 270
    .line 271
    div-float v23, v8, v18

    .line 272
    .line 273
    move/from16 v24, v9

    .line 274
    .line 275
    sub-float v9, v22, v23

    .line 276
    .line 277
    add-int/lit8 v22, v16, 0x1

    .line 278
    .line 279
    move/from16 v23, v12

    .line 280
    .line 281
    const/high16 v12, 0x42480000    # 50.0f

    .line 282
    .line 283
    float-to-double v1, v12

    .line 284
    move/from16 v25, v11

    .line 285
    .line 286
    float-to-double v11, v9

    .line 287
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 288
    .line 289
    .line 290
    move-result-wide v26

    .line 291
    mul-double v26, v26, v1

    .line 292
    .line 293
    move v9, v3

    .line 294
    move/from16 v28, v4

    .line 295
    .line 296
    float-to-double v3, v6

    .line 297
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 298
    .line 299
    .line 300
    move-result-wide v29

    .line 301
    move/from16 v31, v9

    .line 302
    .line 303
    move v6, v10

    .line 304
    mul-double v9, v29, v26

    .line 305
    .line 306
    double-to-float v9, v9

    .line 307
    neg-float v9, v9

    .line 308
    aput v9, v13, v16

    .line 309
    .line 310
    add-int/lit8 v9, v22, 0x1

    .line 311
    .line 312
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 313
    .line 314
    .line 315
    move-result-wide v26

    .line 316
    move v10, v5

    .line 317
    move/from16 v29, v6

    .line 318
    .line 319
    mul-double v5, v26, v1

    .line 320
    .line 321
    double-to-float v5, v5

    .line 322
    aput v5, v13, v22

    .line 323
    .line 324
    add-int/lit8 v5, v9, 0x1

    .line 325
    .line 326
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 327
    .line 328
    .line 329
    move-result-wide v11

    .line 330
    mul-double/2addr v11, v1

    .line 331
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 332
    .line 333
    .line 334
    move-result-wide v1

    .line 335
    mul-double/2addr v1, v11

    .line 336
    double-to-float v1, v1

    .line 337
    aput v1, v13, v9

    .line 338
    .line 339
    add-int/lit8 v1, v17, 0x1

    .line 340
    .line 341
    div-float/2addr v7, v8

    .line 342
    aput v7, v14, v17

    .line 343
    .line 344
    add-int/lit8 v2, v1, 0x1

    .line 345
    .line 346
    add-int v3, v15, v10

    .line 347
    .line 348
    int-to-float v3, v3

    .line 349
    mul-float v3, v3, v29

    .line 350
    .line 351
    div-float v3, v3, v28

    .line 352
    .line 353
    aput v3, v14, v1

    .line 354
    .line 355
    if-nez v25, :cond_f

    .line 356
    .line 357
    if-eqz v10, :cond_e

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_e
    move v4, v10

    .line 361
    move/from16 v1, v25

    .line 362
    .line 363
    const/16 v3, 0x48

    .line 364
    .line 365
    goto :goto_b

    .line 366
    :cond_f
    :goto_a
    move/from16 v1, v25

    .line 367
    .line 368
    const/16 v3, 0x48

    .line 369
    .line 370
    move v4, v10

    .line 371
    if-ne v1, v3, :cond_10

    .line 372
    .line 373
    const/4 v6, 0x1

    .line 374
    if-ne v4, v6, :cond_10

    .line 375
    .line 376
    :goto_b
    add-int/lit8 v6, v5, -0x3

    .line 377
    .line 378
    const/4 v7, 0x3

    .line 379
    invoke-static {v13, v6, v13, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    .line 381
    .line 382
    add-int/lit8 v5, v5, 0x3

    .line 383
    .line 384
    add-int/lit8 v6, v2, -0x2

    .line 385
    .line 386
    const/4 v7, 0x2

    .line 387
    invoke-static {v14, v6, v14, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v2, v2, 0x2

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_10
    const/4 v7, 0x2

    .line 394
    :goto_c
    move/from16 v17, v2

    .line 395
    .line 396
    move/from16 v16, v5

    .line 397
    .line 398
    add-int/lit8 v5, v4, 0x1

    .line 399
    .line 400
    move v11, v1

    .line 401
    move v6, v7

    .line 402
    move/from16 v7, v21

    .line 403
    .line 404
    move/from16 v12, v23

    .line 405
    .line 406
    move/from16 v9, v24

    .line 407
    .line 408
    move/from16 v4, v28

    .line 409
    .line 410
    move/from16 v10, v29

    .line 411
    .line 412
    move/from16 v3, v31

    .line 413
    .line 414
    move-wide/from16 v1, p3

    .line 415
    .line 416
    goto/16 :goto_8

    .line 417
    .line 418
    :cond_11
    move/from16 v31, v3

    .line 419
    .line 420
    move/from16 v28, v4

    .line 421
    .line 422
    move/from16 v21, v7

    .line 423
    .line 424
    move/from16 v24, v9

    .line 425
    .line 426
    move/from16 v29, v10

    .line 427
    .line 428
    move v1, v11

    .line 429
    move/from16 v23, v12

    .line 430
    .line 431
    const/16 v3, 0x48

    .line 432
    .line 433
    move v7, v6

    .line 434
    add-int/lit8 v11, v1, 0x1

    .line 435
    .line 436
    move-wide/from16 v1, p3

    .line 437
    .line 438
    move/from16 v6, v20

    .line 439
    .line 440
    move/from16 v7, v21

    .line 441
    .line 442
    move/from16 v3, v31

    .line 443
    .line 444
    goto/16 :goto_7

    .line 445
    .line 446
    :cond_12
    move/from16 v31, v3

    .line 447
    .line 448
    move/from16 v20, v6

    .line 449
    .line 450
    move-wide/from16 v1, p3

    .line 451
    .line 452
    move/from16 v15, v20

    .line 453
    .line 454
    const/4 v5, 0x2

    .line 455
    const/4 v6, 0x0

    .line 456
    const/4 v7, 0x1

    .line 457
    const/16 v9, 0x24

    .line 458
    .line 459
    const/16 v11, 0x48

    .line 460
    .line 461
    goto/16 :goto_6

    .line 462
    .line 463
    :cond_13
    move/from16 v31, v3

    .line 464
    .line 465
    new-instance v1, Lx5/e$b;

    .line 466
    .line 467
    const/4 v2, 0x0

    .line 468
    const/4 v3, 0x1

    .line 469
    invoke-direct {v1, v2, v13, v14, v3}, Lx5/e$b;-><init>(I[F[FI)V

    .line 470
    .line 471
    .line 472
    new-instance v4, Lx5/e;

    .line 473
    .line 474
    new-instance v5, Lx5/e$a;

    .line 475
    .line 476
    new-array v3, v3, [Lx5/e$b;

    .line 477
    .line 478
    aput-object v1, v3, v2

    .line 479
    .line 480
    invoke-direct {v5, v3}, Lx5/e$a;-><init>([Lx5/e$b;)V

    .line 481
    .line 482
    .line 483
    move/from16 v1, v31

    .line 484
    .line 485
    invoke-direct {v4, v5, v5, v1}, Lx5/e;-><init>(Lx5/e$a;Lx5/e$a;I)V

    .line 486
    .line 487
    .line 488
    :goto_d
    iget-object v1, v0, Lx5/i;->f:Lv5/b0;

    .line 489
    .line 490
    move-wide/from16 v2, p3

    .line 491
    .line 492
    invoke-virtual {v1, v4, v2, v3}, Lv5/b0;->a(Ljava/lang/Object;J)V

    .line 493
    .line 494
    .line 495
    :goto_e
    return-void
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx5/i;->e:Lv5/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv5/b0;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx5/i;->d:Lx5/c;

    .line 7
    .line 8
    iget-object v1, v0, Lx5/c;->c:Lv5/b0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lv5/b0;->b()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, v0, Lx5/c;->d:Z

    .line 15
    .line 16
    iget-object v0, p0, Lx5/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
