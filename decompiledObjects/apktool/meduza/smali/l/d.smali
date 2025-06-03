.class public final Ll/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ll/j;

.field public c:I

.field public d:Ll/x0;

.field public e:Ll/x0;

.field public f:Ll/x0;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ll/d;->c:I

    iput-object p1, p0, Ll/d;->a:Landroid/view/View;

    invoke-static {}, Ll/j;->a()Ll/j;

    move-result-object p1

    iput-object p1, p0, Ll/d;->b:Ll/j;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/d;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    iget-object v1, p0, Ll/d;->d:Ll/x0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move v1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    :goto_0
    if-eqz v1, :cond_6

    .line 19
    .line 20
    iget-object v1, p0, Ll/d;->f:Ll/x0;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    new-instance v1, Ll/x0;

    .line 25
    .line 26
    invoke-direct {v1}, Ll/x0;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ll/d;->f:Ll/x0;

    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Ll/d;->f:Ll/x0;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput-object v4, v1, Ll/x0;->a:Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    iput-boolean v3, v1, Ll/x0;->d:Z

    .line 37
    .line 38
    iput-object v4, v1, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 39
    .line 40
    iput-boolean v3, v1, Ll/x0;->c:Z

    .line 41
    .line 42
    iget-object v4, p0, Ll/d;->a:Landroid/view/View;

    .line 43
    .line 44
    sget-object v5, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-static {v4}, Le0/d0$d;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iput-boolean v2, v1, Ll/x0;->d:Z

    .line 53
    .line 54
    iput-object v4, v1, Ll/x0;->a:Landroid/content/res/ColorStateList;

    .line 55
    .line 56
    :cond_2
    iget-object v4, p0, Ll/d;->a:Landroid/view/View;

    .line 57
    .line 58
    invoke-static {v4}, Le0/d0$d;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    iput-boolean v2, v1, Ll/x0;->c:Z

    .line 65
    .line 66
    iput-object v4, v1, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 67
    .line 68
    :cond_3
    iget-boolean v4, v1, Ll/x0;->d:Z

    .line 69
    .line 70
    if-nez v4, :cond_5

    .line 71
    .line 72
    iget-boolean v4, v1, Ll/x0;->c:Z

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v2, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    :goto_1
    iget-object v3, p0, Ll/d;->a:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/view/View;->getDrawableState()[I

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v0, v1, v3}, Ll/j;->d(Landroid/graphics/drawable/Drawable;Ll/x0;[I)V

    .line 86
    .line 87
    .line 88
    :goto_2
    if-eqz v2, :cond_6

    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    iget-object v1, p0, Ll/d;->e:Ll/x0;

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    iget-object v2, p0, Ll/d;->a:Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v0, v1, v2}, Ll/j;->d(Landroid/graphics/drawable/Drawable;Ll/x0;[I)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    iget-object v1, p0, Ll/d;->d:Ll/x0;

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    iget-object v2, p0, Ll/d;->a:Landroid/view/View;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v0, v1, v2}, Ll/j;->d(Landroid/graphics/drawable/Drawable;Ll/x0;[I)V

    .line 116
    .line 117
    .line 118
    :cond_8
    :goto_3
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
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

.method public final b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/d;->e:Ll/x0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/x0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/d;->e:Ll/x0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll/d;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v3, Lb/a0;->M:[I

    .line 8
    .line 9
    invoke-static {v0, p1, v3, p2}, Ll/z0;->m(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Ll/d;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v5, v0, Ll/z0;->b:Landroid/content/res/TypedArray;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    move v6, p2

    .line 23
    invoke-static/range {v1 .. v6}, Le0/d0;->g(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :try_start_0
    invoke-virtual {v0, p1}, Ll/z0;->l(I)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/4 v1, -0x1

    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Ll/z0;->i(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Ll/d;->c:I

    .line 39
    .line 40
    iget-object p1, p0, Ll/d;->b:Ll/j;

    .line 41
    .line 42
    iget-object p2, p0, Ll/d;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget v2, p0, Ll/d;->c:I

    .line 49
    .line 50
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    :try_start_1
    iget-object v3, p1, Ll/j;->a:Ll/q0;

    .line 52
    .line 53
    invoke-virtual {v3, p2, v2}, Ll/q0;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    .line 56
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    :try_start_2
    monitor-exit p1

    .line 58
    if-eqz p2, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0, p2}, Ll/d;->g(Landroid/content/res/ColorStateList;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p2

    .line 65
    monitor-exit p1

    .line 66
    throw p2

    .line 67
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 68
    invoke-virtual {v0, p1}, Ll/z0;->l(I)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    iget-object p2, p0, Ll/d;->a:Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ll/z0;->b(I)Landroid/content/res/ColorStateList;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p2, p1}, Le0/d0$d;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    const/4 p1, 0x2

    .line 84
    invoke-virtual {v0, p1}, Ll/z0;->l(I)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    iget-object p2, p0, Ll/d;->a:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {v0, p1, v1}, Ll/z0;->h(II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-static {p1, v1}, Ll/i0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p2, p1}, Le0/d0$d;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-virtual {v0}, Ll/z0;->n()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catchall_1
    move-exception p1

    .line 109
    invoke-virtual {v0}, Ll/z0;->n()V

    .line 110
    .line 111
    .line 112
    throw p1
    .line 113
    .line 114
    .line 115
.end method

.method public final e()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Ll/d;->c:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/d;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Ll/d;->a()V

    return-void
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iput p1, p0, Ll/d;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Ll/d;->b:Ll/j;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Ll/d;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, v0, Ll/j;->a:Ll/q0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, p1}, Ll/q0;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0

    .line 24
    throw p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Ll/d;->g(Landroid/content/res/ColorStateList;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ll/d;->a()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public final g(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Ll/d;->d:Ll/x0;

    if-nez v0, :cond_0

    new-instance v0, Ll/x0;

    invoke-direct {v0}, Ll/x0;-><init>()V

    iput-object v0, p0, Ll/d;->d:Ll/x0;

    :cond_0
    iget-object v0, p0, Ll/d;->d:Ll/x0;

    iput-object p1, v0, Ll/x0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/x0;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Ll/d;->d:Ll/x0;

    :goto_0
    invoke-virtual {p0}, Ll/d;->a()V

    return-void
.end method

.method public final h(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/d;->e:Ll/x0;

    if-nez v0, :cond_0

    new-instance v0, Ll/x0;

    invoke-direct {v0}, Ll/x0;-><init>()V

    iput-object v0, p0, Ll/d;->e:Ll/x0;

    :cond_0
    iget-object v0, p0, Ll/d;->e:Ll/x0;

    iput-object p1, v0, Ll/x0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/x0;->d:Z

    invoke-virtual {p0}, Ll/d;->a()V

    return-void
.end method

.method public final i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/d;->e:Ll/x0;

    if-nez v0, :cond_0

    new-instance v0, Ll/x0;

    invoke-direct {v0}, Ll/x0;-><init>()V

    iput-object v0, p0, Ll/d;->e:Ll/x0;

    :cond_0
    iget-object v0, p0, Ll/d;->e:Ll/x0;

    iput-object p1, v0, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/x0;->c:Z

    invoke-virtual {p0}, Ll/d;->a()V

    return-void
.end method
