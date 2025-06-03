.class public final La2/f$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:La2/f$c;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lr/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/b<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, La2/f$f;->p:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, La2/f$f;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, La2/f$f;->h:F

    iput v0, p0, La2/f$f;->i:F

    iput v0, p0, La2/f$f;->j:F

    iput v0, p0, La2/f$f;->k:F

    const/16 v0, 0xff

    iput v0, p0, La2/f$f;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, La2/f$f;->m:Ljava/lang/String;

    iput-object v0, p0, La2/f$f;->n:Ljava/lang/Boolean;

    new-instance v0, Lr/b;

    invoke-direct {v0}, Lr/b;-><init>()V

    iput-object v0, p0, La2/f$f;->o:Lr/b;

    new-instance v0, La2/f$c;

    invoke-direct {v0}, La2/f$c;-><init>()V

    iput-object v0, p0, La2/f$f;->g:La2/f$c;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, La2/f$f;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, La2/f$f;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(La2/f$f;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, La2/f$f;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, La2/f$f;->h:F

    iput v0, p0, La2/f$f;->i:F

    iput v0, p0, La2/f$f;->j:F

    iput v0, p0, La2/f$f;->k:F

    const/16 v0, 0xff

    iput v0, p0, La2/f$f;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, La2/f$f;->m:Ljava/lang/String;

    iput-object v0, p0, La2/f$f;->n:Ljava/lang/Boolean;

    new-instance v0, Lr/b;

    invoke-direct {v0}, Lr/b;-><init>()V

    iput-object v0, p0, La2/f$f;->o:Lr/b;

    new-instance v1, La2/f$c;

    iget-object v2, p1, La2/f$f;->g:La2/f$c;

    invoke-direct {v1, v2, v0}, La2/f$c;-><init>(La2/f$c;Lr/b;)V

    iput-object v1, p0, La2/f$f;->g:La2/f$c;

    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, La2/f$f;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, La2/f$f;->a:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, La2/f$f;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, La2/f$f;->b:Landroid/graphics/Path;

    iget v1, p1, La2/f$f;->h:F

    iput v1, p0, La2/f$f;->h:F

    iget v1, p1, La2/f$f;->i:F

    iput v1, p0, La2/f$f;->i:F

    iget v1, p1, La2/f$f;->j:F

    iput v1, p0, La2/f$f;->j:F

    iget v1, p1, La2/f$f;->k:F

    iput v1, p0, La2/f$f;->k:F

    iget v1, p1, La2/f$f;->l:I

    iput v1, p0, La2/f$f;->l:I

    iget-object v1, p1, La2/f$f;->m:Ljava/lang/String;

    iput-object v1, p0, La2/f$f;->m:Ljava/lang/String;

    iget-object v1, p1, La2/f$f;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1, p0}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p1, La2/f$f;->n:Ljava/lang/Boolean;

    iput-object p1, p0, La2/f$f;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(La2/f$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    iget-object v0, v7, La2/f$c;->a:Landroid/graphics/Matrix;

    .line 8
    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v7, La2/f$c;->a:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-object v1, v7, La2/f$c;->j:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 22
    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    move-object v11, v6

    .line 26
    move v10, v9

    .line 27
    :goto_0
    iget-object v0, v7, La2/f$c;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ge v10, v0, :cond_1c

    .line 34
    .line 35
    iget-object v0, v7, La2/f$c;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La2/f$d;

    .line 42
    .line 43
    instance-of v1, v0, La2/f$c;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, La2/f$c;

    .line 49
    .line 50
    iget-object v2, v7, La2/f$c;->a:Landroid/graphics/Matrix;

    .line 51
    .line 52
    move-object/from16 v0, p0

    .line 53
    .line 54
    move-object/from16 v3, p3

    .line 55
    .line 56
    move/from16 v4, p4

    .line 57
    .line 58
    move/from16 v5, p5

    .line 59
    .line 60
    invoke-virtual/range {v0 .. v5}, La2/f$f;->a(La2/f$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_11

    .line 64
    .line 65
    :cond_0
    instance-of v1, v0, La2/f$e;

    .line 66
    .line 67
    if-eqz v1, :cond_1b

    .line 68
    .line 69
    check-cast v0, La2/f$e;

    .line 70
    .line 71
    move/from16 v1, p4

    .line 72
    .line 73
    int-to-float v2, v1

    .line 74
    iget v3, v11, La2/f$f;->j:F

    .line 75
    .line 76
    div-float/2addr v2, v3

    .line 77
    move/from16 v3, p5

    .line 78
    .line 79
    int-to-float v4, v3

    .line 80
    iget v5, v11, La2/f$f;->k:F

    .line 81
    .line 82
    div-float/2addr v4, v5

    .line 83
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    iget-object v12, v7, La2/f$c;->a:Landroid/graphics/Matrix;

    .line 88
    .line 89
    iget-object v13, v11, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 90
    .line 91
    invoke-virtual {v13, v12}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 92
    .line 93
    .line 94
    iget-object v11, v11, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 95
    .line 96
    invoke-virtual {v11, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x4

    .line 100
    new-array v2, v2, [F

    .line 101
    .line 102
    fill-array-data v2, :array_0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v2}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 106
    .line 107
    .line 108
    aget v4, v2, v9

    .line 109
    .line 110
    float-to-double v11, v4

    .line 111
    const/4 v4, 0x1

    .line 112
    aget v13, v2, v4

    .line 113
    .line 114
    float-to-double v13, v13

    .line 115
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v11

    .line 119
    double-to-float v11, v11

    .line 120
    const/4 v12, 0x2

    .line 121
    aget v13, v2, v12

    .line 122
    .line 123
    float-to-double v13, v13

    .line 124
    const/4 v15, 0x3

    .line 125
    aget v12, v2, v15

    .line 126
    .line 127
    move/from16 v16, v5

    .line 128
    .line 129
    float-to-double v4, v12

    .line 130
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    double-to-float v4, v4

    .line 135
    aget v5, v2, v9

    .line 136
    .line 137
    const/4 v12, 0x1

    .line 138
    aget v13, v2, v12

    .line 139
    .line 140
    const/4 v12, 0x2

    .line 141
    aget v12, v2, v12

    .line 142
    .line 143
    aget v2, v2, v15

    .line 144
    .line 145
    mul-float/2addr v5, v2

    .line 146
    mul-float/2addr v13, v12

    .line 147
    sub-float/2addr v5, v13

    .line 148
    invoke-static {v11, v4}, Ljava/lang/Math;->max(FF)F

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v4, 0x0

    .line 153
    cmpl-float v11, v2, v4

    .line 154
    .line 155
    if-lez v11, :cond_1

    .line 156
    .line 157
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    div-float/2addr v5, v2

    .line 162
    goto :goto_1

    .line 163
    :cond_1
    move v5, v4

    .line 164
    :goto_1
    cmpl-float v2, v5, v4

    .line 165
    .line 166
    if-nez v2, :cond_2

    .line 167
    .line 168
    goto/16 :goto_10

    .line 169
    .line 170
    :cond_2
    iget-object v2, v6, La2/f$f;->a:Landroid/graphics/Path;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 176
    .line 177
    .line 178
    iget-object v11, v0, La2/f$e;->a:[Lx/d$a;

    .line 179
    .line 180
    if-eqz v11, :cond_3

    .line 181
    .line 182
    invoke-static {v11, v2}, Lx/d$a;->b([Lx/d$a;Landroid/graphics/Path;)V

    .line 183
    .line 184
    .line 185
    :cond_3
    iget-object v2, v6, La2/f$f;->a:Landroid/graphics/Path;

    .line 186
    .line 187
    iget-object v11, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 188
    .line 189
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 190
    .line 191
    .line 192
    instance-of v11, v0, La2/f$a;

    .line 193
    .line 194
    if-eqz v11, :cond_5

    .line 195
    .line 196
    iget-object v4, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 197
    .line 198
    iget v0, v0, La2/f$e;->c:I

    .line 199
    .line 200
    if-nez v0, :cond_4

    .line 201
    .line 202
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 206
    .line 207
    :goto_2
    invoke-virtual {v4, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 211
    .line 212
    iget-object v4, v6, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 213
    .line 214
    invoke-virtual {v0, v2, v4}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 218
    .line 219
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 220
    .line 221
    .line 222
    goto/16 :goto_10

    .line 223
    .line 224
    :cond_5
    check-cast v0, La2/f$b;

    .line 225
    .line 226
    iget v11, v0, La2/f$b;->j:F

    .line 227
    .line 228
    cmpl-float v12, v11, v4

    .line 229
    .line 230
    const/high16 v13, 0x3f800000    # 1.0f

    .line 231
    .line 232
    if-nez v12, :cond_6

    .line 233
    .line 234
    iget v12, v0, La2/f$b;->k:F

    .line 235
    .line 236
    cmpl-float v12, v12, v13

    .line 237
    .line 238
    if-eqz v12, :cond_9

    .line 239
    .line 240
    :cond_6
    iget v12, v0, La2/f$b;->l:F

    .line 241
    .line 242
    add-float/2addr v11, v12

    .line 243
    rem-float/2addr v11, v13

    .line 244
    iget v14, v0, La2/f$b;->k:F

    .line 245
    .line 246
    add-float/2addr v14, v12

    .line 247
    rem-float/2addr v14, v13

    .line 248
    iget-object v12, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 249
    .line 250
    if-nez v12, :cond_7

    .line 251
    .line 252
    new-instance v12, Landroid/graphics/PathMeasure;

    .line 253
    .line 254
    invoke-direct {v12}, Landroid/graphics/PathMeasure;-><init>()V

    .line 255
    .line 256
    .line 257
    iput-object v12, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 258
    .line 259
    :cond_7
    iget-object v12, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 260
    .line 261
    iget-object v13, v6, La2/f$f;->a:Landroid/graphics/Path;

    .line 262
    .line 263
    invoke-virtual {v12, v13, v9}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 264
    .line 265
    .line 266
    iget-object v12, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 267
    .line 268
    invoke-virtual {v12}, Landroid/graphics/PathMeasure;->getLength()F

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    mul-float/2addr v11, v12

    .line 273
    mul-float/2addr v14, v12

    .line 274
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 275
    .line 276
    .line 277
    cmpl-float v13, v11, v14

    .line 278
    .line 279
    if-lez v13, :cond_8

    .line 280
    .line 281
    iget-object v13, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 282
    .line 283
    const/4 v15, 0x1

    .line 284
    invoke-virtual {v13, v11, v12, v2, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 285
    .line 286
    .line 287
    iget-object v11, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 288
    .line 289
    invoke-virtual {v11, v4, v14, v2, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_8
    const/4 v15, 0x1

    .line 294
    iget-object v12, v6, La2/f$f;->f:Landroid/graphics/PathMeasure;

    .line 295
    .line 296
    invoke-virtual {v12, v11, v14, v2, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 297
    .line 298
    .line 299
    :goto_3
    invoke-virtual {v2, v4, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 300
    .line 301
    .line 302
    :cond_9
    iget-object v4, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 303
    .line 304
    iget-object v11, v6, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 305
    .line 306
    invoke-virtual {v4, v2, v11}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 307
    .line 308
    .line 309
    iget-object v2, v0, La2/f$b;->g:Lw/c;

    .line 310
    .line 311
    iget-object v4, v2, Lw/c;->a:Landroid/graphics/Shader;

    .line 312
    .line 313
    if-eqz v4, :cond_a

    .line 314
    .line 315
    const/4 v4, 0x1

    .line 316
    goto :goto_4

    .line 317
    :cond_a
    move v4, v9

    .line 318
    :goto_4
    if-nez v4, :cond_c

    .line 319
    .line 320
    iget v4, v2, Lw/c;->c:I

    .line 321
    .line 322
    if-eqz v4, :cond_b

    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_b
    move v4, v9

    .line 326
    goto :goto_6

    .line 327
    :cond_c
    :goto_5
    const/4 v4, 0x1

    .line 328
    :goto_6
    const/high16 v11, 0x437f0000    # 255.0f

    .line 329
    .line 330
    const/16 v12, 0xff

    .line 331
    .line 332
    const v13, 0xffffff

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    if-eqz v4, :cond_11

    .line 337
    .line 338
    iget-object v4, v6, La2/f$f;->e:Landroid/graphics/Paint;

    .line 339
    .line 340
    if-nez v4, :cond_d

    .line 341
    .line 342
    new-instance v4, Landroid/graphics/Paint;

    .line 343
    .line 344
    const/4 v15, 0x1

    .line 345
    invoke-direct {v4, v15}, Landroid/graphics/Paint;-><init>(I)V

    .line 346
    .line 347
    .line 348
    iput-object v4, v6, La2/f$f;->e:Landroid/graphics/Paint;

    .line 349
    .line 350
    sget-object v15, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 351
    .line 352
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 353
    .line 354
    .line 355
    :cond_d
    iget-object v4, v6, La2/f$f;->e:Landroid/graphics/Paint;

    .line 356
    .line 357
    iget-object v15, v2, Lw/c;->a:Landroid/graphics/Shader;

    .line 358
    .line 359
    if-eqz v15, :cond_e

    .line 360
    .line 361
    const/16 v17, 0x1

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_e
    move/from16 v17, v9

    .line 365
    .line 366
    :goto_7
    if-eqz v17, :cond_f

    .line 367
    .line 368
    iget-object v2, v6, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 369
    .line 370
    invoke-virtual {v15, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 374
    .line 375
    .line 376
    iget v2, v0, La2/f$b;->i:F

    .line 377
    .line 378
    mul-float/2addr v2, v11

    .line 379
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_f
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 391
    .line 392
    .line 393
    iget v2, v2, Lw/c;->c:I

    .line 394
    .line 395
    iget v15, v0, La2/f$b;->i:F

    .line 396
    .line 397
    sget-object v17, La2/f;->r:Landroid/graphics/PorterDuff$Mode;

    .line 398
    .line 399
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 400
    .line 401
    .line 402
    move-result v9

    .line 403
    and-int/2addr v2, v13

    .line 404
    int-to-float v9, v9

    .line 405
    mul-float/2addr v9, v15

    .line 406
    float-to-int v9, v9

    .line 407
    shl-int/lit8 v9, v9, 0x18

    .line 408
    .line 409
    or-int/2addr v2, v9

    .line 410
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 411
    .line 412
    .line 413
    :goto_8
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 414
    .line 415
    .line 416
    iget-object v2, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 417
    .line 418
    iget v9, v0, La2/f$e;->c:I

    .line 419
    .line 420
    if-nez v9, :cond_10

    .line 421
    .line 422
    sget-object v9, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_10
    sget-object v9, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 426
    .line 427
    :goto_9
    invoke-virtual {v2, v9}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 428
    .line 429
    .line 430
    iget-object v2, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 431
    .line 432
    invoke-virtual {v8, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 433
    .line 434
    .line 435
    :cond_11
    iget-object v2, v0, La2/f$b;->e:Lw/c;

    .line 436
    .line 437
    iget-object v4, v2, Lw/c;->a:Landroid/graphics/Shader;

    .line 438
    .line 439
    if-eqz v4, :cond_12

    .line 440
    .line 441
    const/4 v4, 0x1

    .line 442
    goto :goto_a

    .line 443
    :cond_12
    const/4 v4, 0x0

    .line 444
    :goto_a
    if-nez v4, :cond_14

    .line 445
    .line 446
    iget v4, v2, Lw/c;->c:I

    .line 447
    .line 448
    if-eqz v4, :cond_13

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_13
    const/4 v4, 0x0

    .line 452
    goto :goto_c

    .line 453
    :cond_14
    :goto_b
    const/4 v4, 0x1

    .line 454
    :goto_c
    if-eqz v4, :cond_1a

    .line 455
    .line 456
    iget-object v4, v6, La2/f$f;->d:Landroid/graphics/Paint;

    .line 457
    .line 458
    if-nez v4, :cond_15

    .line 459
    .line 460
    new-instance v4, Landroid/graphics/Paint;

    .line 461
    .line 462
    const/4 v9, 0x1

    .line 463
    invoke-direct {v4, v9}, Landroid/graphics/Paint;-><init>(I)V

    .line 464
    .line 465
    .line 466
    iput-object v4, v6, La2/f$f;->d:Landroid/graphics/Paint;

    .line 467
    .line 468
    sget-object v15, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 469
    .line 470
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 471
    .line 472
    .line 473
    goto :goto_d

    .line 474
    :cond_15
    const/4 v9, 0x1

    .line 475
    :goto_d
    iget-object v4, v6, La2/f$f;->d:Landroid/graphics/Paint;

    .line 476
    .line 477
    iget-object v15, v0, La2/f$b;->n:Landroid/graphics/Paint$Join;

    .line 478
    .line 479
    if-eqz v15, :cond_16

    .line 480
    .line 481
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 482
    .line 483
    .line 484
    :cond_16
    iget-object v15, v0, La2/f$b;->m:Landroid/graphics/Paint$Cap;

    .line 485
    .line 486
    if-eqz v15, :cond_17

    .line 487
    .line 488
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 489
    .line 490
    .line 491
    :cond_17
    iget v15, v0, La2/f$b;->o:F

    .line 492
    .line 493
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 494
    .line 495
    .line 496
    iget-object v15, v2, Lw/c;->a:Landroid/graphics/Shader;

    .line 497
    .line 498
    if-eqz v15, :cond_18

    .line 499
    .line 500
    goto :goto_e

    .line 501
    :cond_18
    const/4 v9, 0x0

    .line 502
    :goto_e
    if-eqz v9, :cond_19

    .line 503
    .line 504
    iget-object v2, v6, La2/f$f;->c:Landroid/graphics/Matrix;

    .line 505
    .line 506
    invoke-virtual {v15, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 510
    .line 511
    .line 512
    iget v2, v0, La2/f$b;->h:F

    .line 513
    .line 514
    mul-float/2addr v2, v11

    .line 515
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 520
    .line 521
    .line 522
    goto :goto_f

    .line 523
    :cond_19
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 527
    .line 528
    .line 529
    iget v2, v2, Lw/c;->c:I

    .line 530
    .line 531
    iget v9, v0, La2/f$b;->h:F

    .line 532
    .line 533
    sget-object v11, La2/f;->r:Landroid/graphics/PorterDuff$Mode;

    .line 534
    .line 535
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 536
    .line 537
    .line 538
    move-result v11

    .line 539
    and-int/2addr v2, v13

    .line 540
    int-to-float v11, v11

    .line 541
    mul-float/2addr v11, v9

    .line 542
    float-to-int v9, v11

    .line 543
    shl-int/lit8 v9, v9, 0x18

    .line 544
    .line 545
    or-int/2addr v2, v9

    .line 546
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 547
    .line 548
    .line 549
    :goto_f
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 550
    .line 551
    .line 552
    mul-float v5, v5, v16

    .line 553
    .line 554
    iget v0, v0, La2/f$b;->f:F

    .line 555
    .line 556
    mul-float/2addr v0, v5

    .line 557
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 558
    .line 559
    .line 560
    iget-object v0, v6, La2/f$f;->b:Landroid/graphics/Path;

    .line 561
    .line 562
    invoke-virtual {v8, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 563
    .line 564
    .line 565
    :cond_1a
    :goto_10
    move-object v11, v6

    .line 566
    goto :goto_12

    .line 567
    :cond_1b
    :goto_11
    move/from16 v1, p4

    .line 568
    .line 569
    move/from16 v3, p5

    .line 570
    .line 571
    :goto_12
    add-int/lit8 v10, v10, 0x1

    .line 572
    .line 573
    const/4 v9, 0x0

    .line 574
    goto/16 :goto_0

    .line 575
    .line 576
    :cond_1c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    nop

    .line 581
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
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
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, La2/f$f;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, La2/f$f;->l:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, La2/f$f;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, La2/f$f;->l:I

    return-void
.end method
