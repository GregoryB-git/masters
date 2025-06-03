.class public final Landroidx/appcompat/app/b;
.super Lg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/b$a;
    }
.end annotation


# instance fields
.field public final f:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Landroidx/appcompat/app/b;->e(Landroid/content/Context;I)I

    move-result p2

    invoke-direct {p0, p1, p2}, Lg/n;-><init>(Landroid/content/Context;I)V

    new-instance p1, Landroidx/appcompat/app/AlertController;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, Landroidx/appcompat/app/AlertController;-><init>(Landroid/content/Context;Lg/n;Landroid/view/Window;)V

    iput-object p1, p0, Landroidx/appcompat/app/b;->f:Landroidx/appcompat/app/AlertController;

    return-void
.end method

.method public static e(Landroid/content/Context;I)I
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    return p1

    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const v0, 0x7f04002b

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    invoke-super/range {p0 .. p1}, Lg/n;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/appcompat/app/b;->f:Landroidx/appcompat/app/AlertController;

    .line 7
    .line 8
    iget v2, v1, Landroidx/appcompat/app/AlertController;->G:I

    .line 9
    .line 10
    iget v2, v1, Landroidx/appcompat/app/AlertController;->F:I

    .line 11
    .line 12
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->b:Lg/n;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lg/n;->setContentView(I)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 18
    .line 19
    const v3, 0x7f0a00c6

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x7f0a0107

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const v5, 0x7f0a005f

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const v7, 0x7f0a0055

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    const v9, 0x7f0a0061

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/view/ViewGroup;

    .line 55
    .line 56
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->h:Landroid/view/View;

    .line 57
    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    if-eqz v9, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget v9, v1, Landroidx/appcompat/app/AlertController;->i:I

    .line 64
    .line 65
    if-eqz v9, :cond_1

    .line 66
    .line 67
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->a:Landroid/content/Context;

    .line 68
    .line 69
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    iget v12, v1, Landroidx/appcompat/app/AlertController;->i:I

    .line 74
    .line 75
    invoke-virtual {v9, v12, v2, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object v9, v10

    .line 81
    :goto_0
    if-eqz v9, :cond_2

    .line 82
    .line 83
    const/4 v13, 0x1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v13, v11

    .line 86
    :goto_1
    if-eqz v13, :cond_3

    .line 87
    .line 88
    invoke-static {v9}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-nez v14, :cond_4

    .line 93
    .line 94
    :cond_3
    iget-object v14, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 95
    .line 96
    const/high16 v15, 0x20000

    .line 97
    .line 98
    invoke-virtual {v14, v15, v15}, Landroid/view/Window;->setFlags(II)V

    .line 99
    .line 100
    .line 101
    :cond_4
    const/16 v14, 0x8

    .line 102
    .line 103
    const/4 v15, -0x1

    .line 104
    if-eqz v13, :cond_6

    .line 105
    .line 106
    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 107
    .line 108
    const v12, 0x7f0a0060

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v12}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    check-cast v12, Landroid/widget/FrameLayout;

    .line 116
    .line 117
    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    .line 118
    .line 119
    invoke-direct {v13, v15, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v9, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    .line 124
    .line 125
    iget-boolean v9, v1, Landroidx/appcompat/app/AlertController;->j:Z

    .line 126
    .line 127
    if-eqz v9, :cond_5

    .line 128
    .line 129
    invoke-virtual {v12, v11, v11, v11, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 130
    .line 131
    .line 132
    :cond_5
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 133
    .line 134
    if-eqz v9, :cond_7

    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    check-cast v9, Landroidx/appcompat/widget/b$a;

    .line 141
    .line 142
    const/4 v12, 0x0

    .line 143
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_2
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-static {v3, v4}, Landroidx/appcompat/app/AlertController;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v5, v6}, Landroidx/appcompat/app/AlertController;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-static {v7, v8}, Landroidx/appcompat/app/AlertController;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 174
    .line 175
    const v7, 0x7f0a00d3

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    check-cast v6, Landroidx/core/widget/NestedScrollView;

    .line 183
    .line 184
    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 185
    .line 186
    invoke-virtual {v6, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 187
    .line 188
    .line 189
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 190
    .line 191
    invoke-virtual {v6, v11}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 192
    .line 193
    .line 194
    const v6, 0x102000b

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    check-cast v6, Landroid/widget/TextView;

    .line 202
    .line 203
    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->B:Landroid/widget/TextView;

    .line 204
    .line 205
    if-nez v6, :cond_8

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_8
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->f:Ljava/lang/CharSequence;

    .line 209
    .line 210
    if-eqz v7, :cond_9

    .line 211
    .line 212
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_9
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 220
    .line 221
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->B:Landroid/widget/TextView;

    .line 222
    .line 223
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 227
    .line 228
    if-eqz v6, :cond_a

    .line 229
    .line 230
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 231
    .line 232
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Landroid/view/ViewGroup;

    .line 237
    .line 238
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 239
    .line 240
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 245
    .line 246
    .line 247
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 248
    .line 249
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    .line 250
    .line 251
    invoke-direct {v9, v15, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6, v8, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_a
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    :goto_3
    const v6, 0x1020019

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    check-cast v6, Landroid/widget/Button;

    .line 269
    .line 270
    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 271
    .line 272
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->M:Landroidx/appcompat/app/AlertController$a;

    .line 273
    .line 274
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    .line 276
    .line 277
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->l:Ljava/lang/CharSequence;

    .line 278
    .line 279
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    if-eqz v6, :cond_b

    .line 284
    .line 285
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->n:Landroid/graphics/drawable/Drawable;

    .line 286
    .line 287
    if-nez v6, :cond_b

    .line 288
    .line 289
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 290
    .line 291
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    move v6, v11

    .line 295
    goto :goto_4

    .line 296
    :cond_b
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 297
    .line 298
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->l:Ljava/lang/CharSequence;

    .line 299
    .line 300
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->n:Landroid/graphics/drawable/Drawable;

    .line 304
    .line 305
    if-eqz v6, :cond_c

    .line 306
    .line 307
    iget v7, v1, Landroidx/appcompat/app/AlertController;->d:I

    .line 308
    .line 309
    invoke-virtual {v6, v11, v11, v7, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 310
    .line 311
    .line 312
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 313
    .line 314
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->n:Landroid/graphics/drawable/Drawable;

    .line 315
    .line 316
    invoke-virtual {v6, v7, v10, v10, v10}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 317
    .line 318
    .line 319
    :cond_c
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 320
    .line 321
    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    const/4 v6, 0x1

    .line 325
    :goto_4
    const v7, 0x102001a

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    check-cast v7, Landroid/widget/Button;

    .line 333
    .line 334
    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 335
    .line 336
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->M:Landroidx/appcompat/app/AlertController$a;

    .line 337
    .line 338
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    .line 340
    .line 341
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->p:Ljava/lang/CharSequence;

    .line 342
    .line 343
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-eqz v7, :cond_d

    .line 348
    .line 349
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    .line 350
    .line 351
    if-nez v7, :cond_d

    .line 352
    .line 353
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 354
    .line 355
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_d
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 360
    .line 361
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->p:Ljava/lang/CharSequence;

    .line 362
    .line 363
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 364
    .line 365
    .line 366
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    .line 367
    .line 368
    if-eqz v7, :cond_e

    .line 369
    .line 370
    iget v8, v1, Landroidx/appcompat/app/AlertController;->d:I

    .line 371
    .line 372
    invoke-virtual {v7, v11, v11, v8, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 373
    .line 374
    .line 375
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 376
    .line 377
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    .line 378
    .line 379
    invoke-virtual {v7, v8, v10, v10, v10}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 380
    .line 381
    .line 382
    :cond_e
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 383
    .line 384
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 385
    .line 386
    .line 387
    or-int/lit8 v6, v6, 0x2

    .line 388
    .line 389
    :goto_5
    const v7, 0x102001b

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    check-cast v7, Landroid/widget/Button;

    .line 397
    .line 398
    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 399
    .line 400
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->M:Landroidx/appcompat/app/AlertController$a;

    .line 401
    .line 402
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 403
    .line 404
    .line 405
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->t:Ljava/lang/CharSequence;

    .line 406
    .line 407
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    if-eqz v7, :cond_f

    .line 412
    .line 413
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    .line 414
    .line 415
    if-nez v7, :cond_f

    .line 416
    .line 417
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 418
    .line 419
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 420
    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_f
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 424
    .line 425
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->t:Ljava/lang/CharSequence;

    .line 426
    .line 427
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    .line 429
    .line 430
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    .line 431
    .line 432
    if-eqz v7, :cond_10

    .line 433
    .line 434
    iget v8, v1, Landroidx/appcompat/app/AlertController;->d:I

    .line 435
    .line 436
    invoke-virtual {v7, v11, v11, v8, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 437
    .line 438
    .line 439
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 440
    .line 441
    iget-object v8, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    .line 442
    .line 443
    invoke-virtual {v7, v8, v10, v10, v10}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 444
    .line 445
    .line 446
    :cond_10
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 447
    .line 448
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 449
    .line 450
    .line 451
    or-int/lit8 v6, v6, 0x4

    .line 452
    .line 453
    :goto_6
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->a:Landroid/content/Context;

    .line 454
    .line 455
    new-instance v8, Landroid/util/TypedValue;

    .line 456
    .line 457
    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    const v9, 0x7f040029

    .line 465
    .line 466
    .line 467
    const/4 v12, 0x1

    .line 468
    invoke-virtual {v7, v9, v8, v12}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 469
    .line 470
    .line 471
    iget v7, v8, Landroid/util/TypedValue;->data:I

    .line 472
    .line 473
    if-eqz v7, :cond_11

    .line 474
    .line 475
    move v7, v12

    .line 476
    goto :goto_7

    .line 477
    :cond_11
    move v7, v11

    .line 478
    :goto_7
    const/4 v8, 0x2

    .line 479
    if-eqz v7, :cond_14

    .line 480
    .line 481
    if-ne v6, v12, :cond_12

    .line 482
    .line 483
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->k:Landroid/widget/Button;

    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_12
    if-ne v6, v8, :cond_13

    .line 487
    .line 488
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    .line 489
    .line 490
    goto :goto_8

    .line 491
    :cond_13
    const/4 v7, 0x4

    .line 492
    if-ne v6, v7, :cond_14

    .line 493
    .line 494
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    .line 495
    .line 496
    :goto_8
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 501
    .line 502
    const/4 v12, 0x1

    .line 503
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 504
    .line 505
    const/high16 v12, 0x3f000000    # 0.5f

    .line 506
    .line 507
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 508
    .line 509
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 510
    .line 511
    .line 512
    :cond_14
    if-eqz v6, :cond_15

    .line 513
    .line 514
    const/4 v6, 0x1

    .line 515
    goto :goto_9

    .line 516
    :cond_15
    move v6, v11

    .line 517
    :goto_9
    if-nez v6, :cond_16

    .line 518
    .line 519
    invoke-virtual {v5, v14}, Landroid/view/View;->setVisibility(I)V

    .line 520
    .line 521
    .line 522
    :cond_16
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->C:Landroid/view/View;

    .line 523
    .line 524
    const v7, 0x7f0a0105

    .line 525
    .line 526
    .line 527
    if-eqz v6, :cond_17

    .line 528
    .line 529
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 530
    .line 531
    const/4 v9, -0x2

    .line 532
    invoke-direct {v6, v15, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 533
    .line 534
    .line 535
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->C:Landroid/view/View;

    .line 536
    .line 537
    invoke-virtual {v3, v9, v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 538
    .line 539
    .line 540
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 541
    .line 542
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    goto/16 :goto_a

    .line 547
    .line 548
    :cond_17
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 549
    .line 550
    const v9, 0x1020006

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    check-cast v6, Landroid/widget/ImageView;

    .line 558
    .line 559
    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 560
    .line 561
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    .line 562
    .line 563
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    const/4 v9, 0x1

    .line 568
    xor-int/2addr v6, v9

    .line 569
    if-eqz v6, :cond_1a

    .line 570
    .line 571
    iget-boolean v6, v1, Landroidx/appcompat/app/AlertController;->K:Z

    .line 572
    .line 573
    if-eqz v6, :cond_1a

    .line 574
    .line 575
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 576
    .line 577
    const v7, 0x7f0a0044

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    check-cast v6, Landroid/widget/TextView;

    .line 585
    .line 586
    iput-object v6, v1, Landroidx/appcompat/app/AlertController;->A:Landroid/widget/TextView;

    .line 587
    .line 588
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    .line 589
    .line 590
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    .line 592
    .line 593
    iget v6, v1, Landroidx/appcompat/app/AlertController;->x:I

    .line 594
    .line 595
    if-eqz v6, :cond_18

    .line 596
    .line 597
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 598
    .line 599
    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 600
    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_18
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->y:Landroid/graphics/drawable/Drawable;

    .line 604
    .line 605
    if-eqz v6, :cond_19

    .line 606
    .line 607
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 608
    .line 609
    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 610
    .line 611
    .line 612
    goto :goto_b

    .line 613
    :cond_19
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->A:Landroid/widget/TextView;

    .line 614
    .line 615
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 616
    .line 617
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 622
    .line 623
    invoke-virtual {v9}, Landroid/view/View;->getPaddingTop()I

    .line 624
    .line 625
    .line 626
    move-result v9

    .line 627
    iget-object v12, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 628
    .line 629
    invoke-virtual {v12}, Landroid/view/View;->getPaddingRight()I

    .line 630
    .line 631
    .line 632
    move-result v12

    .line 633
    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 634
    .line 635
    invoke-virtual {v13}, Landroid/view/View;->getPaddingBottom()I

    .line 636
    .line 637
    .line 638
    move-result v13

    .line 639
    invoke-virtual {v6, v7, v9, v12, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 640
    .line 641
    .line 642
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 643
    .line 644
    invoke-virtual {v6, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 645
    .line 646
    .line 647
    goto :goto_b

    .line 648
    :cond_1a
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 649
    .line 650
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 655
    .line 656
    .line 657
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/widget/ImageView;

    .line 658
    .line 659
    invoke-virtual {v6, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 660
    .line 661
    .line 662
    move-object v6, v3

    .line 663
    :goto_a
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 664
    .line 665
    .line 666
    :goto_b
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-eq v2, v14, :cond_1b

    .line 671
    .line 672
    const/4 v12, 0x1

    .line 673
    goto :goto_c

    .line 674
    :cond_1b
    move v12, v11

    .line 675
    :goto_c
    if-eqz v3, :cond_1c

    .line 676
    .line 677
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eq v2, v14, :cond_1c

    .line 682
    .line 683
    const/4 v2, 0x1

    .line 684
    goto :goto_d

    .line 685
    :cond_1c
    move v2, v11

    .line 686
    :goto_d
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    if-eq v5, v14, :cond_1d

    .line 691
    .line 692
    const/4 v5, 0x1

    .line 693
    goto :goto_e

    .line 694
    :cond_1d
    move v5, v11

    .line 695
    :goto_e
    if-nez v5, :cond_1e

    .line 696
    .line 697
    const v6, 0x7f0a00ff

    .line 698
    .line 699
    .line 700
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    if-eqz v6, :cond_1e

    .line 705
    .line 706
    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 707
    .line 708
    .line 709
    :cond_1e
    if-eqz v2, :cond_22

    .line 710
    .line 711
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 712
    .line 713
    if-eqz v6, :cond_1f

    .line 714
    .line 715
    const/4 v7, 0x1

    .line 716
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 717
    .line 718
    .line 719
    :cond_1f
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->f:Ljava/lang/CharSequence;

    .line 720
    .line 721
    if-nez v6, :cond_20

    .line 722
    .line 723
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 724
    .line 725
    if-eqz v6, :cond_21

    .line 726
    .line 727
    :cond_20
    const v6, 0x7f0a0104

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 731
    .line 732
    .line 733
    move-result-object v10

    .line 734
    :cond_21
    if-eqz v10, :cond_23

    .line 735
    .line 736
    invoke-virtual {v10, v11}, Landroid/view/View;->setVisibility(I)V

    .line 737
    .line 738
    .line 739
    goto :goto_f

    .line 740
    :cond_22
    const v3, 0x7f0a0100

    .line 741
    .line 742
    .line 743
    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    if-eqz v3, :cond_23

    .line 748
    .line 749
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 750
    .line 751
    .line 752
    :cond_23
    :goto_f
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 753
    .line 754
    instance-of v6, v3, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 755
    .line 756
    if-eqz v6, :cond_28

    .line 757
    .line 758
    if-eqz v5, :cond_25

    .line 759
    .line 760
    if-nez v2, :cond_24

    .line 761
    .line 762
    goto :goto_10

    .line 763
    :cond_24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    goto :goto_13

    .line 767
    :cond_25
    :goto_10
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    if-eqz v2, :cond_26

    .line 772
    .line 773
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 774
    .line 775
    .line 776
    move-result v7

    .line 777
    goto :goto_11

    .line 778
    :cond_26
    iget v7, v3, Landroidx/appcompat/app/AlertController$RecycleListView;->a:I

    .line 779
    .line 780
    :goto_11
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 781
    .line 782
    .line 783
    move-result v9

    .line 784
    if-eqz v5, :cond_27

    .line 785
    .line 786
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 787
    .line 788
    .line 789
    move-result v10

    .line 790
    goto :goto_12

    .line 791
    :cond_27
    iget v10, v3, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    .line 792
    .line 793
    :goto_12
    invoke-virtual {v3, v6, v7, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 794
    .line 795
    .line 796
    :cond_28
    :goto_13
    if-nez v12, :cond_2c

    .line 797
    .line 798
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 799
    .line 800
    if-eqz v3, :cond_29

    .line 801
    .line 802
    goto :goto_14

    .line 803
    :cond_29
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 804
    .line 805
    :goto_14
    if-eqz v3, :cond_2c

    .line 806
    .line 807
    if-eqz v5, :cond_2a

    .line 808
    .line 809
    move v11, v8

    .line 810
    :cond_2a
    or-int/2addr v2, v11

    .line 811
    const/4 v5, 0x3

    .line 812
    iget-object v6, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 813
    .line 814
    const v7, 0x7f0a00d2

    .line 815
    .line 816
    .line 817
    invoke-virtual {v6, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    .line 822
    .line 823
    const v8, 0x7f0a00d1

    .line 824
    .line 825
    .line 826
    invoke-virtual {v7, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    sget-object v8, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 831
    .line 832
    invoke-static {v3, v2, v5}, Le0/d0$e;->d(Landroid/view/View;II)V

    .line 833
    .line 834
    .line 835
    if-eqz v6, :cond_2b

    .line 836
    .line 837
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 838
    .line 839
    .line 840
    :cond_2b
    if-eqz v7, :cond_2c

    .line 841
    .line 842
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 843
    .line 844
    .line 845
    :cond_2c
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 846
    .line 847
    if-eqz v2, :cond_2d

    .line 848
    .line 849
    iget-object v3, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ListAdapter;

    .line 850
    .line 851
    if-eqz v3, :cond_2d

    .line 852
    .line 853
    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 854
    .line 855
    .line 856
    iget v1, v1, Landroidx/appcompat/app/AlertController;->E:I

    .line 857
    .line 858
    if-le v1, v15, :cond_2d

    .line 859
    .line 860
    const/4 v3, 0x1

    .line 861
    invoke-virtual {v2, v1, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 865
    .line 866
    .line 867
    :cond_2d
    return-void
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
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/b;->f:Landroidx/appcompat/app/AlertController;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->e(Landroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
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

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/b;->f:Landroidx/appcompat/app/AlertController;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->w:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->e(Landroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
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

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lg/n;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/b;->f:Landroidx/appcompat/app/AlertController;

    .line 5
    .line 6
    iput-object p1, v0, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->A:Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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
