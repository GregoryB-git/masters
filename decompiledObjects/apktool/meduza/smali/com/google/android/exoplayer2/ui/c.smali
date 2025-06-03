.class public final Lcom/google/android/exoplayer2/ui/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/ui/SubtitleView$a;


# instance fields
.field public final a:Lcom/google/android/exoplayer2/ui/a;

.field public final b:Ls5/h;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ls5/a;

.field public e:F

.field public f:I

.field public o:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    sget-object v0, Ls5/a;->g:Ls5/a;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    const v0, 0x3d5a511a    # 0.0533f

    iput v0, p0, Lcom/google/android/exoplayer2/ui/c;->e:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/c;->f:I

    const v1, 0x3da3d70a    # 0.08f

    iput v1, p0, Lcom/google/android/exoplayer2/ui/c;->o:F

    new-instance v1, Lcom/google/android/exoplayer2/ui/a;

    invoke-direct {v1, p1}, Lcom/google/android/exoplayer2/ui/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/ui/c;->a:Lcom/google/android/exoplayer2/ui/a;

    new-instance v2, Ls5/h;

    invoke-direct {v2, p1}, Ls5/h;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/c;->b:Ls5/h;

    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ls5/a;FIF)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh5/a;",
            ">;",
            "Ls5/a;",
            "FIF)V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    iput p3, p0, Lcom/google/android/exoplayer2/ui/c;->e:F

    iput p4, p0, Lcom/google/android/exoplayer2/ui/c;->f:I

    iput p5, p0, Lcom/google/android/exoplayer2/ui/c;->o:F

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh5/a;

    iget-object v4, v3, Lh5/a;->d:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/c;->c()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/c;->a:Lcom/google/android/exoplayer2/ui/a;

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/ui/a;->a(Ljava/util/List;Ls5/a;FIF)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final b(FI)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p1, p2, v0, v1}, Ls5/f;->b(FIII)F

    move-result p1

    const p2, -0x800001

    cmpl-float p2, p1, p2

    if-nez p2, :cond_0

    const-string p1, "unset"

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, p2

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, p2, v0

    const-string p1, "%.2fpx"

    invoke-static {p1, p2}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    new-array v3, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, v0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    .line 12
    .line 13
    iget v4, v4, Ls5/a;->a:I

    .line 14
    .line 15
    invoke-static {v4}, Lb/z;->p(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    aput-object v4, v3, v5

    .line 21
    .line 22
    iget v4, v0, Lcom/google/android/exoplayer2/ui/c;->f:I

    .line 23
    .line 24
    iget v6, v0, Lcom/google/android/exoplayer2/ui/c;->e:F

    .line 25
    .line 26
    invoke-virtual {v0, v6, v4}, Lcom/google/android/exoplayer2/ui/c;->b(FI)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v6, 0x1

    .line 31
    aput-object v4, v3, v6

    .line 32
    .line 33
    const v4, 0x3f99999a    # 1.2f

    .line 34
    .line 35
    .line 36
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/4 v8, 0x2

    .line 41
    aput-object v7, v3, v8

    .line 42
    .line 43
    iget-object v7, v0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    .line 44
    .line 45
    iget v9, v7, Ls5/a;->d:I

    .line 46
    .line 47
    const/4 v10, 0x3

    .line 48
    const-string v11, "unset"

    .line 49
    .line 50
    if-eq v9, v6, :cond_3

    .line 51
    .line 52
    if-eq v9, v8, :cond_2

    .line 53
    .line 54
    if-eq v9, v10, :cond_1

    .line 55
    .line 56
    if-eq v9, v2, :cond_0

    .line 57
    .line 58
    move-object v7, v11

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-array v9, v6, [Ljava/lang/Object;

    .line 61
    .line 62
    iget v7, v7, Ls5/a;->e:I

    .line 63
    .line 64
    invoke-static {v7}, Lb/z;->p(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    aput-object v7, v9, v5

    .line 69
    .line 70
    const-string v7, "-0.05em -0.05em 0.15em %s"

    .line 71
    .line 72
    invoke-static {v7, v9}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-array v9, v6, [Ljava/lang/Object;

    .line 78
    .line 79
    iget v7, v7, Ls5/a;->e:I

    .line 80
    .line 81
    invoke-static {v7}, Lb/z;->p(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    aput-object v7, v9, v5

    .line 86
    .line 87
    const-string v7, "0.06em 0.08em 0.15em %s"

    .line 88
    .line 89
    invoke-static {v7, v9}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    new-array v9, v6, [Ljava/lang/Object;

    .line 95
    .line 96
    iget v7, v7, Ls5/a;->e:I

    .line 97
    .line 98
    invoke-static {v7}, Lb/z;->p(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    aput-object v7, v9, v5

    .line 103
    .line 104
    const-string v7, "0.1em 0.12em 0.15em %s"

    .line 105
    .line 106
    invoke-static {v7, v9}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    goto :goto_0

    .line 111
    :cond_3
    new-array v9, v6, [Ljava/lang/Object;

    .line 112
    .line 113
    iget v7, v7, Ls5/a;->e:I

    .line 114
    .line 115
    invoke-static {v7}, Lb/z;->p(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    aput-object v7, v9, v5

    .line 120
    .line 121
    const-string v7, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    .line 122
    .line 123
    invoke-static {v7, v9}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    :goto_0
    aput-object v7, v3, v10

    .line 128
    .line 129
    const-string v7, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>"

    .line 130
    .line 131
    invoke-static {v7, v3}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    new-instance v3, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v7, "default_bg"

    .line 144
    .line 145
    invoke-static {v7}, Lb/z;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    new-array v12, v6, [Ljava/lang/Object;

    .line 150
    .line 151
    iget-object v13, v0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    .line 152
    .line 153
    iget v13, v13, Ls5/a;->b:I

    .line 154
    .line 155
    invoke-static {v13}, Lb/z;->p(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    aput-object v13, v12, v5

    .line 160
    .line 161
    const-string v13, "background-color:%s;"

    .line 162
    .line 163
    invoke-static {v13, v12}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-virtual {v3, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move v9, v5

    .line 171
    :goto_1
    iget-object v12, v0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-ge v9, v12, :cond_53

    .line 178
    .line 179
    iget-object v12, v0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    check-cast v12, Lh5/a;

    .line 186
    .line 187
    iget v14, v12, Lh5/a;->p:F

    .line 188
    .line 189
    const v15, -0x800001

    .line 190
    .line 191
    .line 192
    cmpl-float v16, v14, v15

    .line 193
    .line 194
    const/high16 v17, 0x42c80000    # 100.0f

    .line 195
    .line 196
    if-eqz v16, :cond_4

    .line 197
    .line 198
    mul-float v14, v14, v17

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    const/high16 v14, 0x42480000    # 50.0f

    .line 202
    .line 203
    :goto_2
    iget v2, v12, Lh5/a;->q:I

    .line 204
    .line 205
    const/16 v18, -0x32

    .line 206
    .line 207
    const/16 v19, -0x64

    .line 208
    .line 209
    if-eq v2, v6, :cond_6

    .line 210
    .line 211
    if-eq v2, v8, :cond_5

    .line 212
    .line 213
    move v2, v5

    .line 214
    goto :goto_3

    .line 215
    :cond_5
    move/from16 v2, v19

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_6
    move/from16 v2, v18

    .line 219
    .line 220
    :goto_3
    iget v10, v12, Lh5/a;->e:F

    .line 221
    .line 222
    cmpl-float v20, v10, v15

    .line 223
    .line 224
    const/16 v21, 0x0

    .line 225
    .line 226
    const/high16 v22, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const-string v15, "%.2f%%"

    .line 229
    .line 230
    if-eqz v20, :cond_e

    .line 231
    .line 232
    iget v4, v12, Lh5/a;->f:I

    .line 233
    .line 234
    if-eq v4, v6, :cond_c

    .line 235
    .line 236
    new-array v4, v6, [Ljava/lang/Object;

    .line 237
    .line 238
    mul-float v10, v10, v17

    .line 239
    .line 240
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    aput-object v10, v4, v5

    .line 245
    .line 246
    invoke-static {v15, v4}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    iget v10, v12, Lh5/a;->x:I

    .line 251
    .line 252
    if-ne v10, v6, :cond_9

    .line 253
    .line 254
    iget v10, v12, Lh5/a;->o:I

    .line 255
    .line 256
    if-eq v10, v6, :cond_8

    .line 257
    .line 258
    if-eq v10, v8, :cond_7

    .line 259
    .line 260
    move v10, v5

    .line 261
    goto :goto_4

    .line 262
    :cond_7
    move/from16 v10, v19

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    move/from16 v10, v18

    .line 266
    .line 267
    :goto_4
    neg-int v10, v10

    .line 268
    move/from16 v19, v10

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_9
    iget v10, v12, Lh5/a;->o:I

    .line 272
    .line 273
    if-eq v10, v6, :cond_b

    .line 274
    .line 275
    if-eq v10, v8, :cond_a

    .line 276
    .line 277
    move/from16 v18, v5

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_a
    move/from16 v18, v19

    .line 281
    .line 282
    :cond_b
    :goto_5
    move/from16 v19, v18

    .line 283
    .line 284
    :goto_6
    move v8, v5

    .line 285
    const v20, 0x3f99999a    # 1.2f

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    cmpl-float v4, v10, v21

    .line 290
    .line 291
    const-string v8, "%.2fem"

    .line 292
    .line 293
    if-ltz v4, :cond_d

    .line 294
    .line 295
    new-array v4, v6, [Ljava/lang/Object;

    .line 296
    .line 297
    const v20, 0x3f99999a    # 1.2f

    .line 298
    .line 299
    .line 300
    mul-float v10, v10, v20

    .line 301
    .line 302
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    aput-object v10, v4, v5

    .line 307
    .line 308
    invoke-static {v8, v4}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    move v8, v5

    .line 313
    move/from16 v19, v8

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_d
    const v20, 0x3f99999a    # 1.2f

    .line 317
    .line 318
    .line 319
    new-array v4, v6, [Ljava/lang/Object;

    .line 320
    .line 321
    neg-float v10, v10

    .line 322
    sub-float v10, v10, v22

    .line 323
    .line 324
    mul-float v10, v10, v20

    .line 325
    .line 326
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    aput-object v10, v4, v5

    .line 331
    .line 332
    invoke-static {v8, v4}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    move/from16 v19, v5

    .line 337
    .line 338
    move v8, v6

    .line 339
    goto :goto_7

    .line 340
    :cond_e
    move/from16 v20, v4

    .line 341
    .line 342
    new-array v4, v6, [Ljava/lang/Object;

    .line 343
    .line 344
    iget v8, v0, Lcom/google/android/exoplayer2/ui/c;->o:F

    .line 345
    .line 346
    sub-float v22, v22, v8

    .line 347
    .line 348
    mul-float v22, v22, v17

    .line 349
    .line 350
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    aput-object v8, v4, v5

    .line 355
    .line 356
    invoke-static {v15, v4}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move v8, v5

    .line 361
    :goto_7
    iget v10, v12, Lh5/a;->r:F

    .line 362
    .line 363
    const v22, -0x800001

    .line 364
    .line 365
    .line 366
    cmpl-float v22, v10, v22

    .line 367
    .line 368
    if-eqz v22, :cond_f

    .line 369
    .line 370
    new-array v5, v6, [Ljava/lang/Object;

    .line 371
    .line 372
    mul-float v10, v10, v17

    .line 373
    .line 374
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    const/16 v22, 0x0

    .line 379
    .line 380
    aput-object v10, v5, v22

    .line 381
    .line 382
    invoke-static {v15, v5}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    goto :goto_8

    .line 387
    :cond_f
    const-string v5, "fit-content"

    .line 388
    .line 389
    :goto_8
    iget-object v10, v12, Lh5/a;->b:Landroid/text/Layout$Alignment;

    .line 390
    .line 391
    const-string v15, "end"

    .line 392
    .line 393
    const-string v23, "start"

    .line 394
    .line 395
    const-string v24, "center"

    .line 396
    .line 397
    if-nez v10, :cond_10

    .line 398
    .line 399
    move-object/from16 v10, v24

    .line 400
    .line 401
    const/4 v6, 0x2

    .line 402
    goto :goto_9

    .line 403
    :cond_10
    sget-object v25, Lcom/google/android/exoplayer2/ui/c$a;->a:[I

    .line 404
    .line 405
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    aget v10, v25, v10

    .line 410
    .line 411
    if-eq v10, v6, :cond_12

    .line 412
    .line 413
    const/4 v6, 0x2

    .line 414
    if-eq v10, v6, :cond_11

    .line 415
    .line 416
    move-object/from16 v10, v24

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_11
    move-object v10, v15

    .line 420
    goto :goto_9

    .line 421
    :cond_12
    const/4 v6, 0x2

    .line 422
    move-object/from16 v10, v23

    .line 423
    .line 424
    :goto_9
    move/from16 v26, v2

    .line 425
    .line 426
    iget v2, v12, Lh5/a;->x:I

    .line 427
    .line 428
    move-object/from16 v27, v11

    .line 429
    .line 430
    const/4 v11, 0x1

    .line 431
    if-eq v2, v11, :cond_14

    .line 432
    .line 433
    if-eq v2, v6, :cond_13

    .line 434
    .line 435
    const-string v2, "horizontal-tb"

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_13
    const-string v2, "vertical-lr"

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_14
    const-string v2, "vertical-rl"

    .line 442
    .line 443
    :goto_a
    iget v6, v12, Lh5/a;->v:I

    .line 444
    .line 445
    iget v11, v12, Lh5/a;->w:F

    .line 446
    .line 447
    invoke-virtual {v0, v11, v6}, Lcom/google/android/exoplayer2/ui/c;->b(FI)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    iget-boolean v11, v12, Lh5/a;->t:Z

    .line 452
    .line 453
    if-eqz v11, :cond_15

    .line 454
    .line 455
    iget v11, v12, Lh5/a;->u:I

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_15
    iget-object v11, v0, Lcom/google/android/exoplayer2/ui/c;->d:Ls5/a;

    .line 459
    .line 460
    iget v11, v11, Ls5/a;->c:I

    .line 461
    .line 462
    :goto_b
    invoke-static {v11}, Lb/z;->p(I)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    move-object/from16 v28, v15

    .line 467
    .line 468
    iget v15, v12, Lh5/a;->x:I

    .line 469
    .line 470
    const-string v29, "left"

    .line 471
    .line 472
    const-string v30, "top"

    .line 473
    .line 474
    const/4 v0, 0x1

    .line 475
    if-eq v15, v0, :cond_18

    .line 476
    .line 477
    const/4 v0, 0x2

    .line 478
    if-eq v15, v0, :cond_17

    .line 479
    .line 480
    if-eqz v8, :cond_16

    .line 481
    .line 482
    const-string v30, "bottom"

    .line 483
    .line 484
    :cond_16
    const/4 v0, 0x2

    .line 485
    goto :goto_e

    .line 486
    :cond_17
    if-eqz v8, :cond_1a

    .line 487
    .line 488
    goto :goto_c

    .line 489
    :cond_18
    if-eqz v8, :cond_19

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_19
    :goto_c
    const-string v29, "right"

    .line 493
    .line 494
    :cond_1a
    :goto_d
    const/4 v0, 0x2

    .line 495
    move-object/from16 v46, v30

    .line 496
    .line 497
    move-object/from16 v30, v29

    .line 498
    .line 499
    move-object/from16 v29, v46

    .line 500
    .line 501
    :goto_e
    if-eq v15, v0, :cond_1c

    .line 502
    .line 503
    const/4 v0, 0x1

    .line 504
    if-ne v15, v0, :cond_1b

    .line 505
    .line 506
    goto :goto_f

    .line 507
    :cond_1b
    const-string v0, "width"

    .line 508
    .line 509
    move/from16 v46, v26

    .line 510
    .line 511
    move/from16 v26, v19

    .line 512
    .line 513
    move/from16 v19, v46

    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_1c
    :goto_f
    const-string v0, "height"

    .line 517
    .line 518
    :goto_10
    iget-object v8, v12, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 519
    .line 520
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 525
    .line 526
    .line 527
    move-result-object v15

    .line 528
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 529
    .line 530
    .line 531
    move-result-object v15

    .line 532
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 533
    .line 534
    sget-object v31, Lcom/google/android/exoplayer2/ui/b;->a:Ljava/util/regex/Pattern;

    .line 535
    .line 536
    move-object/from16 v31, v7

    .line 537
    .line 538
    const-string v7, ""

    .line 539
    .line 540
    move-object/from16 v32, v1

    .line 541
    .line 542
    const-string v1, "</span>"

    .line 543
    .line 544
    move-object/from16 v33, v1

    .line 545
    .line 546
    if-nez v8, :cond_1d

    .line 547
    .line 548
    new-instance v8, Lcom/google/android/exoplayer2/ui/b$a;

    .line 549
    .line 550
    sget-object v15, Lo7/m0;->o:Lo7/m0;

    .line 551
    .line 552
    invoke-direct {v8, v7, v15}, Lcom/google/android/exoplayer2/ui/b$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 553
    .line 554
    .line 555
    goto :goto_11

    .line 556
    :cond_1d
    instance-of v1, v8, Landroid/text/Spanned;

    .line 557
    .line 558
    if-nez v1, :cond_1e

    .line 559
    .line 560
    new-instance v1, Lcom/google/android/exoplayer2/ui/b$a;

    .line 561
    .line 562
    invoke-static {v8}, Lcom/google/android/exoplayer2/ui/b;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    sget-object v15, Lo7/m0;->o:Lo7/m0;

    .line 567
    .line 568
    invoke-direct {v1, v8, v15}, Lcom/google/android/exoplayer2/ui/b$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 569
    .line 570
    .line 571
    move-object v8, v1

    .line 572
    :goto_11
    move-object/from16 v42, v2

    .line 573
    .line 574
    move-object/from16 v45, v5

    .line 575
    .line 576
    move-object/from16 v38, v6

    .line 577
    .line 578
    move-object/from16 v34, v7

    .line 579
    .line 580
    move-object/from16 v43, v10

    .line 581
    .line 582
    move-object/from16 v36, v11

    .line 583
    .line 584
    move-object/from16 v35, v12

    .line 585
    .line 586
    move-object/from16 v41, v13

    .line 587
    .line 588
    goto/16 :goto_25

    .line 589
    .line 590
    :cond_1e
    check-cast v8, Landroid/text/Spanned;

    .line 591
    .line 592
    new-instance v1, Ljava/util/HashSet;

    .line 593
    .line 594
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 595
    .line 596
    .line 597
    move-object/from16 v34, v7

    .line 598
    .line 599
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 600
    .line 601
    .line 602
    move-result v7

    .line 603
    move-object/from16 v35, v12

    .line 604
    .line 605
    const-class v12, Landroid/text/style/BackgroundColorSpan;

    .line 606
    .line 607
    move-object/from16 v36, v11

    .line 608
    .line 609
    const/4 v11, 0x0

    .line 610
    invoke-interface {v8, v11, v7, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    check-cast v7, [Landroid/text/style/BackgroundColorSpan;

    .line 615
    .line 616
    array-length v11, v7

    .line 617
    const/4 v12, 0x0

    .line 618
    :goto_12
    if-ge v12, v11, :cond_1f

    .line 619
    .line 620
    aget-object v37, v7, v12

    .line 621
    .line 622
    invoke-virtual/range {v37 .. v37}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 623
    .line 624
    .line 625
    move-result v37

    .line 626
    move-object/from16 v38, v7

    .line 627
    .line 628
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    add-int/lit8 v12, v12, 0x1

    .line 636
    .line 637
    move-object/from16 v7, v38

    .line 638
    .line 639
    goto :goto_12

    .line 640
    :cond_1f
    new-instance v7, Ljava/util/HashMap;

    .line 641
    .line 642
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    if-eqz v11, :cond_20

    .line 654
    .line 655
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v11

    .line 659
    check-cast v11, Ljava/lang/Integer;

    .line 660
    .line 661
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 662
    .line 663
    .line 664
    move-result v11

    .line 665
    new-instance v12, Ljava/lang/StringBuilder;

    .line 666
    .line 667
    move-object/from16 v37, v1

    .line 668
    .line 669
    const/16 v1, 0xe

    .line 670
    .line 671
    invoke-direct {v12, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 672
    .line 673
    .line 674
    const-string v1, "bg_"

    .line 675
    .line 676
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-static {v1}, Lb/z;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    move-object/from16 v38, v6

    .line 691
    .line 692
    const/4 v12, 0x1

    .line 693
    new-array v6, v12, [Ljava/lang/Object;

    .line 694
    .line 695
    invoke-static {v11}, Lb/z;->p(I)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v11

    .line 699
    const/4 v12, 0x0

    .line 700
    aput-object v11, v6, v12

    .line 701
    .line 702
    invoke-static {v13, v6}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v6

    .line 706
    invoke-virtual {v7, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-object/from16 v1, v37

    .line 710
    .line 711
    move-object/from16 v6, v38

    .line 712
    .line 713
    goto :goto_13

    .line 714
    :cond_20
    move-object/from16 v38, v6

    .line 715
    .line 716
    const/4 v12, 0x0

    .line 717
    new-instance v1, Landroid/util/SparseArray;

    .line 718
    .line 719
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 720
    .line 721
    .line 722
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 723
    .line 724
    .line 725
    move-result v6

    .line 726
    const-class v11, Ljava/lang/Object;

    .line 727
    .line 728
    invoke-interface {v8, v12, v6, v11}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v6

    .line 732
    array-length v11, v6

    .line 733
    const/4 v12, 0x0

    .line 734
    :goto_14
    if-ge v12, v11, :cond_46

    .line 735
    .line 736
    move/from16 v37, v11

    .line 737
    .line 738
    aget-object v11, v6, v12

    .line 739
    .line 740
    move-object/from16 v39, v6

    .line 741
    .line 742
    instance-of v6, v11, Landroid/text/style/StrikethroughSpan;

    .line 743
    .line 744
    const/16 v40, 0x0

    .line 745
    .line 746
    if-eqz v6, :cond_21

    .line 747
    .line 748
    const-string v41, "<span style=\'text-decoration:line-through;\'>"

    .line 749
    .line 750
    move-object/from16 v42, v2

    .line 751
    .line 752
    move-object/from16 v45, v5

    .line 753
    .line 754
    move-object/from16 v43, v10

    .line 755
    .line 756
    move/from16 v44, v15

    .line 757
    .line 758
    move-object/from16 v2, v41

    .line 759
    .line 760
    move-object/from16 v41, v13

    .line 761
    .line 762
    goto/16 :goto_1d

    .line 763
    .line 764
    :cond_21
    move-object/from16 v41, v13

    .line 765
    .line 766
    instance-of v13, v11, Landroid/text/style/ForegroundColorSpan;

    .line 767
    .line 768
    if-eqz v13, :cond_22

    .line 769
    .line 770
    move-object v13, v11

    .line 771
    check-cast v13, Landroid/text/style/ForegroundColorSpan;

    .line 772
    .line 773
    move-object/from16 v42, v2

    .line 774
    .line 775
    move-object/from16 v43, v10

    .line 776
    .line 777
    const/4 v2, 0x1

    .line 778
    new-array v10, v2, [Ljava/lang/Object;

    .line 779
    .line 780
    invoke-virtual {v13}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 781
    .line 782
    .line 783
    move-result v13

    .line 784
    invoke-static {v13}, Lb/z;->p(I)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v13

    .line 788
    const/16 v22, 0x0

    .line 789
    .line 790
    aput-object v13, v10, v22

    .line 791
    .line 792
    const-string v13, "<span style=\'color:%s;\'>"

    .line 793
    .line 794
    invoke-static {v13, v10}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    move-object v2, v10

    .line 799
    goto/16 :goto_17

    .line 800
    .line 801
    :cond_22
    move-object/from16 v42, v2

    .line 802
    .line 803
    move-object/from16 v43, v10

    .line 804
    .line 805
    const/4 v2, 0x1

    .line 806
    const/16 v22, 0x0

    .line 807
    .line 808
    instance-of v10, v11, Landroid/text/style/BackgroundColorSpan;

    .line 809
    .line 810
    if-eqz v10, :cond_23

    .line 811
    .line 812
    move-object v10, v11

    .line 813
    check-cast v10, Landroid/text/style/BackgroundColorSpan;

    .line 814
    .line 815
    new-array v13, v2, [Ljava/lang/Object;

    .line 816
    .line 817
    invoke-virtual {v10}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    aput-object v2, v13, v22

    .line 826
    .line 827
    const-string v2, "<span class=\'bg_%s\'>"

    .line 828
    .line 829
    invoke-static {v2, v13}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    goto/16 :goto_17

    .line 834
    .line 835
    :cond_23
    instance-of v2, v11, Ll5/a;

    .line 836
    .line 837
    if-eqz v2, :cond_24

    .line 838
    .line 839
    const-string v2, "<span style=\'text-combine-upright:all;\'>"

    .line 840
    .line 841
    goto/16 :goto_17

    .line 842
    .line 843
    :cond_24
    instance-of v2, v11, Landroid/text/style/AbsoluteSizeSpan;

    .line 844
    .line 845
    if-eqz v2, :cond_26

    .line 846
    .line 847
    move-object v2, v11

    .line 848
    check-cast v2, Landroid/text/style/AbsoluteSizeSpan;

    .line 849
    .line 850
    invoke-virtual {v2}, Landroid/text/style/AbsoluteSizeSpan;->getDip()Z

    .line 851
    .line 852
    .line 853
    move-result v10

    .line 854
    invoke-virtual {v2}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 855
    .line 856
    .line 857
    move-result v2

    .line 858
    int-to-float v2, v2

    .line 859
    if-eqz v10, :cond_25

    .line 860
    .line 861
    goto :goto_15

    .line 862
    :cond_25
    div-float/2addr v2, v15

    .line 863
    :goto_15
    const/4 v10, 0x1

    .line 864
    new-array v13, v10, [Ljava/lang/Object;

    .line 865
    .line 866
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const/16 v22, 0x0

    .line 871
    .line 872
    aput-object v2, v13, v22

    .line 873
    .line 874
    const-string v2, "<span style=\'font-size:%.2fpx;\'>"

    .line 875
    .line 876
    invoke-static {v2, v13}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v2

    .line 880
    goto/16 :goto_17

    .line 881
    .line 882
    :cond_26
    const/4 v10, 0x1

    .line 883
    const/16 v22, 0x0

    .line 884
    .line 885
    instance-of v2, v11, Landroid/text/style/RelativeSizeSpan;

    .line 886
    .line 887
    if-eqz v2, :cond_27

    .line 888
    .line 889
    new-array v2, v10, [Ljava/lang/Object;

    .line 890
    .line 891
    move-object v10, v11

    .line 892
    check-cast v10, Landroid/text/style/RelativeSizeSpan;

    .line 893
    .line 894
    invoke-virtual {v10}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    .line 895
    .line 896
    .line 897
    move-result v10

    .line 898
    mul-float v10, v10, v17

    .line 899
    .line 900
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 901
    .line 902
    .line 903
    move-result-object v10

    .line 904
    aput-object v10, v2, v22

    .line 905
    .line 906
    const-string v10, "<span style=\'font-size:%.2f%%;\'>"

    .line 907
    .line 908
    invoke-static {v10, v2}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    goto/16 :goto_17

    .line 913
    .line 914
    :cond_27
    instance-of v2, v11, Landroid/text/style/TypefaceSpan;

    .line 915
    .line 916
    if-eqz v2, :cond_29

    .line 917
    .line 918
    move-object v2, v11

    .line 919
    check-cast v2, Landroid/text/style/TypefaceSpan;

    .line 920
    .line 921
    invoke-virtual {v2}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    if-eqz v2, :cond_28

    .line 926
    .line 927
    const/4 v10, 0x1

    .line 928
    new-array v13, v10, [Ljava/lang/Object;

    .line 929
    .line 930
    aput-object v2, v13, v22

    .line 931
    .line 932
    const-string v2, "<span style=\'font-family:\"%s\";\'>"

    .line 933
    .line 934
    invoke-static {v2, v13}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    goto :goto_17

    .line 939
    :cond_28
    :goto_16
    move-object/from16 v45, v5

    .line 940
    .line 941
    move/from16 v44, v15

    .line 942
    .line 943
    goto/16 :goto_1c

    .line 944
    .line 945
    :cond_29
    const/4 v10, 0x1

    .line 946
    instance-of v2, v11, Landroid/text/style/StyleSpan;

    .line 947
    .line 948
    if-eqz v2, :cond_2d

    .line 949
    .line 950
    move-object v2, v11

    .line 951
    check-cast v2, Landroid/text/style/StyleSpan;

    .line 952
    .line 953
    invoke-virtual {v2}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eq v2, v10, :cond_2c

    .line 958
    .line 959
    const/4 v10, 0x2

    .line 960
    if-eq v2, v10, :cond_2b

    .line 961
    .line 962
    const/4 v10, 0x3

    .line 963
    if-eq v2, v10, :cond_2a

    .line 964
    .line 965
    goto :goto_16

    .line 966
    :cond_2a
    const-string v2, "<b><i>"

    .line 967
    .line 968
    goto :goto_17

    .line 969
    :cond_2b
    const-string v2, "<i>"

    .line 970
    .line 971
    goto :goto_17

    .line 972
    :cond_2c
    const-string v2, "<b>"

    .line 973
    .line 974
    goto :goto_17

    .line 975
    :cond_2d
    instance-of v2, v11, Ll5/c;

    .line 976
    .line 977
    if-eqz v2, :cond_31

    .line 978
    .line 979
    move-object v2, v11

    .line 980
    check-cast v2, Ll5/c;

    .line 981
    .line 982
    iget v2, v2, Ll5/c;->b:I

    .line 983
    .line 984
    const/4 v10, -0x1

    .line 985
    if-eq v2, v10, :cond_30

    .line 986
    .line 987
    const/4 v10, 0x1

    .line 988
    if-eq v2, v10, :cond_2f

    .line 989
    .line 990
    const/4 v10, 0x2

    .line 991
    if-eq v2, v10, :cond_2e

    .line 992
    .line 993
    goto :goto_16

    .line 994
    :cond_2e
    const-string v2, "<ruby style=\'ruby-position:under;\'>"

    .line 995
    .line 996
    goto :goto_17

    .line 997
    :cond_2f
    const-string v2, "<ruby style=\'ruby-position:over;\'>"

    .line 998
    .line 999
    goto :goto_17

    .line 1000
    :cond_30
    const-string v2, "<ruby style=\'ruby-position:unset;\'>"

    .line 1001
    .line 1002
    goto :goto_17

    .line 1003
    :cond_31
    instance-of v2, v11, Landroid/text/style/UnderlineSpan;

    .line 1004
    .line 1005
    if-eqz v2, :cond_32

    .line 1006
    .line 1007
    const-string v2, "<u>"

    .line 1008
    .line 1009
    :goto_17
    move-object/from16 v45, v5

    .line 1010
    .line 1011
    move/from16 v44, v15

    .line 1012
    .line 1013
    goto :goto_1d

    .line 1014
    :cond_32
    instance-of v2, v11, Ll5/d;

    .line 1015
    .line 1016
    if-eqz v2, :cond_28

    .line 1017
    .line 1018
    move-object v2, v11

    .line 1019
    check-cast v2, Ll5/d;

    .line 1020
    .line 1021
    iget v10, v2, Ll5/d;->a:I

    .line 1022
    .line 1023
    iget v13, v2, Ll5/d;->b:I

    .line 1024
    .line 1025
    move/from16 v44, v15

    .line 1026
    .line 1027
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v45, v5

    .line 1033
    .line 1034
    const/4 v5, 0x1

    .line 1035
    if-eq v13, v5, :cond_34

    .line 1036
    .line 1037
    const/4 v5, 0x2

    .line 1038
    if-eq v13, v5, :cond_33

    .line 1039
    .line 1040
    goto :goto_19

    .line 1041
    :cond_33
    const-string v13, "open "

    .line 1042
    .line 1043
    goto :goto_18

    .line 1044
    :cond_34
    const/4 v5, 0x2

    .line 1045
    const-string v13, "filled "

    .line 1046
    .line 1047
    :goto_18
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    :goto_19
    if-eqz v10, :cond_38

    .line 1051
    .line 1052
    const/4 v13, 0x1

    .line 1053
    if-eq v10, v13, :cond_37

    .line 1054
    .line 1055
    if-eq v10, v5, :cond_36

    .line 1056
    .line 1057
    const/4 v5, 0x3

    .line 1058
    if-eq v10, v5, :cond_35

    .line 1059
    .line 1060
    move-object/from16 v5, v27

    .line 1061
    .line 1062
    goto :goto_1a

    .line 1063
    :cond_35
    const-string v5, "sesame"

    .line 1064
    .line 1065
    goto :goto_1a

    .line 1066
    :cond_36
    const-string v5, "dot"

    .line 1067
    .line 1068
    goto :goto_1a

    .line 1069
    :cond_37
    const-string v5, "circle"

    .line 1070
    .line 1071
    goto :goto_1a

    .line 1072
    :cond_38
    const-string v5, "none"

    .line 1073
    .line 1074
    :goto_1a
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    iget v2, v2, Ll5/d;->c:I

    .line 1082
    .line 1083
    const/4 v10, 0x2

    .line 1084
    if-eq v2, v10, :cond_39

    .line 1085
    .line 1086
    const-string v2, "over right"

    .line 1087
    .line 1088
    goto :goto_1b

    .line 1089
    :cond_39
    const-string v2, "under left"

    .line 1090
    .line 1091
    :goto_1b
    new-array v13, v10, [Ljava/lang/Object;

    .line 1092
    .line 1093
    const/4 v10, 0x0

    .line 1094
    aput-object v5, v13, v10

    .line 1095
    .line 1096
    const/4 v5, 0x1

    .line 1097
    aput-object v2, v13, v5

    .line 1098
    .line 1099
    const-string v2, "<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>"

    .line 1100
    .line 1101
    invoke-static {v2, v13}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    goto :goto_1d

    .line 1106
    :goto_1c
    move-object/from16 v2, v40

    .line 1107
    .line 1108
    :goto_1d
    if-nez v6, :cond_42

    .line 1109
    .line 1110
    instance-of v5, v11, Landroid/text/style/ForegroundColorSpan;

    .line 1111
    .line 1112
    if-nez v5, :cond_42

    .line 1113
    .line 1114
    instance-of v5, v11, Landroid/text/style/BackgroundColorSpan;

    .line 1115
    .line 1116
    if-nez v5, :cond_42

    .line 1117
    .line 1118
    instance-of v5, v11, Ll5/a;

    .line 1119
    .line 1120
    if-nez v5, :cond_42

    .line 1121
    .line 1122
    instance-of v5, v11, Landroid/text/style/AbsoluteSizeSpan;

    .line 1123
    .line 1124
    if-nez v5, :cond_42

    .line 1125
    .line 1126
    instance-of v5, v11, Landroid/text/style/RelativeSizeSpan;

    .line 1127
    .line 1128
    if-nez v5, :cond_42

    .line 1129
    .line 1130
    instance-of v5, v11, Ll5/d;

    .line 1131
    .line 1132
    if-eqz v5, :cond_3a

    .line 1133
    .line 1134
    goto/16 :goto_20

    .line 1135
    .line 1136
    :cond_3a
    instance-of v5, v11, Landroid/text/style/TypefaceSpan;

    .line 1137
    .line 1138
    if-eqz v5, :cond_3b

    .line 1139
    .line 1140
    move-object v5, v11

    .line 1141
    check-cast v5, Landroid/text/style/TypefaceSpan;

    .line 1142
    .line 1143
    invoke-virtual {v5}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v5

    .line 1147
    if-eqz v5, :cond_41

    .line 1148
    .line 1149
    goto :goto_20

    .line 1150
    :cond_3b
    instance-of v5, v11, Landroid/text/style/StyleSpan;

    .line 1151
    .line 1152
    if-eqz v5, :cond_3f

    .line 1153
    .line 1154
    move-object v5, v11

    .line 1155
    check-cast v5, Landroid/text/style/StyleSpan;

    .line 1156
    .line 1157
    invoke-virtual {v5}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 1158
    .line 1159
    .line 1160
    move-result v5

    .line 1161
    const/4 v6, 0x1

    .line 1162
    if-eq v5, v6, :cond_3e

    .line 1163
    .line 1164
    const/4 v6, 0x2

    .line 1165
    if-eq v5, v6, :cond_3d

    .line 1166
    .line 1167
    const/4 v6, 0x3

    .line 1168
    if-eq v5, v6, :cond_3c

    .line 1169
    .line 1170
    goto :goto_1f

    .line 1171
    :cond_3c
    const-string v5, "</i></b>"

    .line 1172
    .line 1173
    goto :goto_1e

    .line 1174
    :cond_3d
    const-string v5, "</i>"

    .line 1175
    .line 1176
    goto :goto_1e

    .line 1177
    :cond_3e
    const-string v5, "</b>"

    .line 1178
    .line 1179
    goto :goto_1e

    .line 1180
    :cond_3f
    instance-of v5, v11, Ll5/c;

    .line 1181
    .line 1182
    if-eqz v5, :cond_40

    .line 1183
    .line 1184
    move-object v5, v11

    .line 1185
    check-cast v5, Ll5/c;

    .line 1186
    .line 1187
    iget-object v5, v5, Ll5/c;->a:Ljava/lang/String;

    .line 1188
    .line 1189
    invoke-static {v5}, Lcom/google/android/exoplayer2/ui/b;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v5

    .line 1193
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v6

    .line 1197
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1198
    .line 1199
    .line 1200
    move-result v6

    .line 1201
    add-int/lit8 v6, v6, 0x10

    .line 1202
    .line 1203
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1206
    .line 1207
    .line 1208
    const-string v6, "<rt>"

    .line 1209
    .line 1210
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    const-string v5, "</rt></ruby>"

    .line 1217
    .line 1218
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v5

    .line 1225
    :goto_1e
    move-object/from16 v40, v5

    .line 1226
    .line 1227
    goto :goto_1f

    .line 1228
    :cond_40
    instance-of v5, v11, Landroid/text/style/UnderlineSpan;

    .line 1229
    .line 1230
    if-eqz v5, :cond_41

    .line 1231
    .line 1232
    const-string v5, "</u>"

    .line 1233
    .line 1234
    goto :goto_1e

    .line 1235
    :cond_41
    :goto_1f
    move-object/from16 v5, v40

    .line 1236
    .line 1237
    goto :goto_21

    .line 1238
    :cond_42
    :goto_20
    move-object/from16 v5, v33

    .line 1239
    .line 1240
    :goto_21
    invoke-interface {v8, v11}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 1241
    .line 1242
    .line 1243
    move-result v6

    .line 1244
    invoke-interface {v8, v11}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 1245
    .line 1246
    .line 1247
    move-result v10

    .line 1248
    if-eqz v2, :cond_45

    .line 1249
    .line 1250
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1251
    .line 1252
    .line 1253
    new-instance v11, Lcom/google/android/exoplayer2/ui/b$b;

    .line 1254
    .line 1255
    invoke-direct {v11, v6, v10, v2, v5}, Lcom/google/android/exoplayer2/ui/b$b;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v2

    .line 1262
    check-cast v2, Lcom/google/android/exoplayer2/ui/b$c;

    .line 1263
    .line 1264
    if-nez v2, :cond_43

    .line 1265
    .line 1266
    new-instance v2, Lcom/google/android/exoplayer2/ui/b$c;

    .line 1267
    .line 1268
    invoke-direct {v2}, Lcom/google/android/exoplayer2/ui/b$c;-><init>()V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v1, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1272
    .line 1273
    .line 1274
    :cond_43
    iget-object v2, v2, Lcom/google/android/exoplayer2/ui/b$c;->a:Ljava/util/ArrayList;

    .line 1275
    .line 1276
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    check-cast v2, Lcom/google/android/exoplayer2/ui/b$c;

    .line 1284
    .line 1285
    if-nez v2, :cond_44

    .line 1286
    .line 1287
    new-instance v2, Lcom/google/android/exoplayer2/ui/b$c;

    .line 1288
    .line 1289
    invoke-direct {v2}, Lcom/google/android/exoplayer2/ui/b$c;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v1, v10, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    :cond_44
    iget-object v2, v2, Lcom/google/android/exoplayer2/ui/b$c;->b:Ljava/util/ArrayList;

    .line 1296
    .line 1297
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1298
    .line 1299
    .line 1300
    :cond_45
    add-int/lit8 v12, v12, 0x1

    .line 1301
    .line 1302
    move/from16 v11, v37

    .line 1303
    .line 1304
    move-object/from16 v6, v39

    .line 1305
    .line 1306
    move-object/from16 v13, v41

    .line 1307
    .line 1308
    move-object/from16 v2, v42

    .line 1309
    .line 1310
    move-object/from16 v10, v43

    .line 1311
    .line 1312
    move/from16 v15, v44

    .line 1313
    .line 1314
    move-object/from16 v5, v45

    .line 1315
    .line 1316
    goto/16 :goto_14

    .line 1317
    .line 1318
    :cond_46
    move-object/from16 v42, v2

    .line 1319
    .line 1320
    move-object/from16 v45, v5

    .line 1321
    .line 1322
    move-object/from16 v43, v10

    .line 1323
    .line 1324
    move-object/from16 v41, v13

    .line 1325
    .line 1326
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1327
    .line 1328
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 1329
    .line 1330
    .line 1331
    move-result v5

    .line 1332
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1333
    .line 1334
    .line 1335
    const/4 v5, 0x0

    .line 1336
    const/4 v6, 0x0

    .line 1337
    :goto_22
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1338
    .line 1339
    .line 1340
    move-result v10

    .line 1341
    if-ge v5, v10, :cond_49

    .line 1342
    .line 1343
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 1344
    .line 1345
    .line 1346
    move-result v10

    .line 1347
    invoke-interface {v8, v6, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v6

    .line 1351
    invoke-static {v6}, Lcom/google/android/exoplayer2/ui/b;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v6

    .line 1355
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v6

    .line 1362
    check-cast v6, Lcom/google/android/exoplayer2/ui/b$c;

    .line 1363
    .line 1364
    iget-object v11, v6, Lcom/google/android/exoplayer2/ui/b$c;->b:Ljava/util/ArrayList;

    .line 1365
    .line 1366
    sget-object v12, Lcom/google/android/exoplayer2/ui/b$b;->f:Lb0/d;

    .line 1367
    .line 1368
    invoke-static {v11, v12}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1369
    .line 1370
    .line 1371
    iget-object v11, v6, Lcom/google/android/exoplayer2/ui/b$c;->b:Ljava/util/ArrayList;

    .line 1372
    .line 1373
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v11

    .line 1377
    :goto_23
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v12

    .line 1381
    if-eqz v12, :cond_47

    .line 1382
    .line 1383
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v12

    .line 1387
    check-cast v12, Lcom/google/android/exoplayer2/ui/b$b;

    .line 1388
    .line 1389
    iget-object v12, v12, Lcom/google/android/exoplayer2/ui/b$b;->d:Ljava/lang/String;

    .line 1390
    .line 1391
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    .line 1394
    goto :goto_23

    .line 1395
    :cond_47
    iget-object v11, v6, Lcom/google/android/exoplayer2/ui/b$c;->a:Ljava/util/ArrayList;

    .line 1396
    .line 1397
    sget-object v12, Lcom/google/android/exoplayer2/ui/b$b;->e:Lv4/d;

    .line 1398
    .line 1399
    invoke-static {v11, v12}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1400
    .line 1401
    .line 1402
    iget-object v6, v6, Lcom/google/android/exoplayer2/ui/b$c;->a:Ljava/util/ArrayList;

    .line 1403
    .line 1404
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v6

    .line 1408
    :goto_24
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1409
    .line 1410
    .line 1411
    move-result v11

    .line 1412
    if-eqz v11, :cond_48

    .line 1413
    .line 1414
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v11

    .line 1418
    check-cast v11, Lcom/google/android/exoplayer2/ui/b$b;

    .line 1419
    .line 1420
    iget-object v11, v11, Lcom/google/android/exoplayer2/ui/b$b;->c:Ljava/lang/String;

    .line 1421
    .line 1422
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1423
    .line 1424
    .line 1425
    goto :goto_24

    .line 1426
    :cond_48
    add-int/lit8 v5, v5, 0x1

    .line 1427
    .line 1428
    move v6, v10

    .line 1429
    goto :goto_22

    .line 1430
    :cond_49
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 1431
    .line 1432
    .line 1433
    move-result v1

    .line 1434
    invoke-interface {v8, v6, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v1

    .line 1438
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/b;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1443
    .line 1444
    .line 1445
    new-instance v8, Lcom/google/android/exoplayer2/ui/b$a;

    .line 1446
    .line 1447
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    invoke-direct {v8, v1, v7}, Lcom/google/android/exoplayer2/ui/b$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1452
    .line 1453
    .line 1454
    :goto_25
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v1

    .line 1462
    :goto_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1463
    .line 1464
    .line 1465
    move-result v2

    .line 1466
    if-eqz v2, :cond_4c

    .line 1467
    .line 1468
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    check-cast v2, Ljava/lang/String;

    .line 1473
    .line 1474
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v5

    .line 1478
    check-cast v5, Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-virtual {v3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v5

    .line 1484
    check-cast v5, Ljava/lang/String;

    .line 1485
    .line 1486
    if-eqz v5, :cond_4b

    .line 1487
    .line 1488
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    move-result v2

    .line 1496
    if-eqz v2, :cond_4a

    .line 1497
    .line 1498
    goto :goto_27

    .line 1499
    :cond_4a
    const/4 v2, 0x0

    .line 1500
    goto :goto_28

    .line 1501
    :cond_4b
    :goto_27
    const/4 v2, 0x1

    .line 1502
    :goto_28
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 1503
    .line 1504
    .line 1505
    goto :goto_26

    .line 1506
    :cond_4c
    const/16 v2, 0xe

    .line 1507
    .line 1508
    new-array v1, v2, [Ljava/lang/Object;

    .line 1509
    .line 1510
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v2

    .line 1514
    const/4 v5, 0x0

    .line 1515
    aput-object v2, v1, v5

    .line 1516
    .line 1517
    const/4 v2, 0x1

    .line 1518
    aput-object v29, v1, v2

    .line 1519
    .line 1520
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v2

    .line 1524
    const/4 v5, 0x2

    .line 1525
    aput-object v2, v1, v5

    .line 1526
    .line 1527
    const/4 v2, 0x3

    .line 1528
    aput-object v30, v1, v2

    .line 1529
    .line 1530
    const/4 v5, 0x4

    .line 1531
    aput-object v4, v1, v5

    .line 1532
    .line 1533
    const/4 v4, 0x5

    .line 1534
    aput-object v0, v1, v4

    .line 1535
    .line 1536
    const/4 v0, 0x6

    .line 1537
    aput-object v45, v1, v0

    .line 1538
    .line 1539
    const/4 v0, 0x7

    .line 1540
    aput-object v43, v1, v0

    .line 1541
    .line 1542
    const/16 v0, 0x8

    .line 1543
    .line 1544
    aput-object v42, v1, v0

    .line 1545
    .line 1546
    const/16 v0, 0x9

    .line 1547
    .line 1548
    aput-object v38, v1, v0

    .line 1549
    .line 1550
    const/16 v0, 0xa

    .line 1551
    .line 1552
    aput-object v36, v1, v0

    .line 1553
    .line 1554
    const/16 v0, 0xb

    .line 1555
    .line 1556
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v4

    .line 1560
    aput-object v4, v1, v0

    .line 1561
    .line 1562
    const/16 v0, 0xc

    .line 1563
    .line 1564
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v4

    .line 1568
    aput-object v4, v1, v0

    .line 1569
    .line 1570
    const/16 v0, 0xd

    .line 1571
    .line 1572
    move-object/from16 v12, v35

    .line 1573
    .line 1574
    iget v4, v12, Lh5/a;->y:F

    .line 1575
    .line 1576
    cmpl-float v6, v4, v21

    .line 1577
    .line 1578
    if-eqz v6, :cond_4f

    .line 1579
    .line 1580
    iget v6, v12, Lh5/a;->x:I

    .line 1581
    .line 1582
    const/4 v7, 0x2

    .line 1583
    const/4 v10, 0x1

    .line 1584
    if-eq v6, v7, :cond_4e

    .line 1585
    .line 1586
    if-ne v6, v10, :cond_4d

    .line 1587
    .line 1588
    goto :goto_29

    .line 1589
    :cond_4d
    const-string v6, "skewX"

    .line 1590
    .line 1591
    goto :goto_2a

    .line 1592
    :cond_4e
    :goto_29
    const-string v6, "skewY"

    .line 1593
    .line 1594
    :goto_2a
    new-array v11, v7, [Ljava/lang/Object;

    .line 1595
    .line 1596
    const/4 v7, 0x0

    .line 1597
    aput-object v6, v11, v7

    .line 1598
    .line 1599
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v4

    .line 1603
    aput-object v4, v11, v10

    .line 1604
    .line 1605
    const-string v4, "%s(%.2fdeg)"

    .line 1606
    .line 1607
    invoke-static {v4, v11}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v7

    .line 1611
    goto :goto_2b

    .line 1612
    :cond_4f
    const/4 v10, 0x1

    .line 1613
    move-object/from16 v7, v34

    .line 1614
    .line 1615
    :goto_2b
    aput-object v7, v1, v0

    .line 1616
    .line 1617
    const-string v0, "<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    .line 1618
    .line 1619
    invoke-static {v0, v1}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    move-object/from16 v1, v32

    .line 1624
    .line 1625
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1626
    .line 1627
    .line 1628
    new-array v0, v10, [Ljava/lang/Object;

    .line 1629
    .line 1630
    const/4 v4, 0x0

    .line 1631
    aput-object v31, v0, v4

    .line 1632
    .line 1633
    const-string v4, "<span class=\'%s\'>"

    .line 1634
    .line 1635
    invoke-static {v4, v0}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v0

    .line 1639
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1640
    .line 1641
    .line 1642
    iget-object v0, v12, Lh5/a;->c:Landroid/text/Layout$Alignment;

    .line 1643
    .line 1644
    if-eqz v0, :cond_52

    .line 1645
    .line 1646
    new-array v4, v10, [Ljava/lang/Object;

    .line 1647
    .line 1648
    sget-object v6, Lcom/google/android/exoplayer2/ui/c$a;->a:[I

    .line 1649
    .line 1650
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1651
    .line 1652
    .line 1653
    move-result v0

    .line 1654
    aget v0, v6, v0

    .line 1655
    .line 1656
    const/4 v6, 0x2

    .line 1657
    if-eq v0, v10, :cond_51

    .line 1658
    .line 1659
    if-eq v0, v6, :cond_50

    .line 1660
    .line 1661
    move-object/from16 v15, v24

    .line 1662
    .line 1663
    goto :goto_2c

    .line 1664
    :cond_50
    move-object/from16 v15, v28

    .line 1665
    .line 1666
    goto :goto_2c

    .line 1667
    :cond_51
    move-object/from16 v15, v23

    .line 1668
    .line 1669
    :goto_2c
    const/4 v0, 0x0

    .line 1670
    aput-object v15, v4, v0

    .line 1671
    .line 1672
    const-string v0, "<span style=\'display:inline-block; text-align:%s;\'>"

    .line 1673
    .line 1674
    invoke-static {v0, v4}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1679
    .line 1680
    .line 1681
    iget-object v0, v8, Lcom/google/android/exoplayer2/ui/b$a;->a:Ljava/lang/String;

    .line 1682
    .line 1683
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1684
    .line 1685
    .line 1686
    move-object/from16 v0, v33

    .line 1687
    .line 1688
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    .line 1691
    goto :goto_2d

    .line 1692
    :cond_52
    move-object/from16 v0, v33

    .line 1693
    .line 1694
    const/4 v6, 0x2

    .line 1695
    iget-object v4, v8, Lcom/google/android/exoplayer2/ui/b$a;->a:Ljava/lang/String;

    .line 1696
    .line 1697
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1698
    .line 1699
    .line 1700
    :goto_2d
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1701
    .line 1702
    .line 1703
    const-string v0, "</div>"

    .line 1704
    .line 1705
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1706
    .line 1707
    .line 1708
    add-int/lit8 v9, v9, 0x1

    .line 1709
    .line 1710
    move-object/from16 v0, p0

    .line 1711
    .line 1712
    move v10, v2

    .line 1713
    move v2, v5

    .line 1714
    move v8, v6

    .line 1715
    move/from16 v4, v20

    .line 1716
    .line 1717
    move-object/from16 v11, v27

    .line 1718
    .line 1719
    move-object/from16 v7, v31

    .line 1720
    .line 1721
    move-object/from16 v13, v41

    .line 1722
    .line 1723
    const/4 v6, 0x1

    .line 1724
    const/4 v5, 0x0

    .line 1725
    goto/16 :goto_1

    .line 1726
    .line 1727
    :cond_53
    const-string v0, "</div></body></html>"

    .line 1728
    .line 1729
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1730
    .line 1731
    .line 1732
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1735
    .line 1736
    .line 1737
    const-string v2, "<html><head><style>"

    .line 1738
    .line 1739
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1751
    .line 1752
    .line 1753
    move-result v4

    .line 1754
    if-eqz v4, :cond_54

    .line 1755
    .line 1756
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v4

    .line 1760
    check-cast v4, Ljava/lang/String;

    .line 1761
    .line 1762
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1763
    .line 1764
    .line 1765
    const-string v5, "{"

    .line 1766
    .line 1767
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v4

    .line 1774
    check-cast v4, Ljava/lang/String;

    .line 1775
    .line 1776
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1777
    .line 1778
    .line 1779
    const-string v4, "}"

    .line 1780
    .line 1781
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1782
    .line 1783
    .line 1784
    goto :goto_2e

    .line 1785
    :cond_54
    const-string v2, "</style></head>"

    .line 1786
    .line 1787
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v0

    .line 1794
    const/4 v2, 0x0

    .line 1795
    invoke-virtual {v1, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1796
    .line 1797
    .line 1798
    move-object/from16 v0, p0

    .line 1799
    .line 1800
    iget-object v2, v0, Lcom/google/android/exoplayer2/ui/c;->b:Ls5/h;

    .line 1801
    .line 1802
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v1

    .line 1806
    sget-object v3, Ln7/d;->c:Ljava/nio/charset/Charset;

    .line 1807
    .line 1808
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1809
    .line 1810
    .line 1811
    move-result-object v1

    .line 1812
    const/4 v3, 0x1

    .line 1813
    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v1

    .line 1817
    const-string v3, "text/html"

    .line 1818
    .line 1819
    const-string v4, "base64"

    .line 1820
    .line 1821
    invoke-virtual {v2, v1, v3, v4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1822
    .line 1823
    .line 1824
    return-void
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/c;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/c;->c()V

    :cond_0
    return-void
.end method
