.class public final Lw5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw5/j$e;,
        Lw5/j$d;,
        Lw5/j$c;,
        Lw5/j$b;,
        Lw5/j$a;
    }
.end annotation


# instance fields
.field public final a:Lw5/d;

.field public final b:Lw5/j$b;

.field public final c:Lw5/j$e;

.field public d:Z

.field public e:Landroid/view/Surface;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw5/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lw5/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw5/j;->a:Lw5/d;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget v1, Lv5/e0;->a:I

    .line 19
    .line 20
    const/16 v2, 0x11

    .line 21
    .line 22
    if-lt v1, v2, :cond_0

    .line 23
    .line 24
    const-string v1, "display"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/hardware/display/DisplayManager;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    new-instance v2, Lw5/j$d;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Lw5/j$d;-><init>(Landroid/hardware/display/DisplayManager;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v0

    .line 41
    :goto_0
    if-nez v2, :cond_2

    .line 42
    .line 43
    const-string v1, "window"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/view/WindowManager;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    new-instance v2, Lw5/j$c;

    .line 54
    .line 55
    invoke-direct {v2, p1}, Lw5/j$c;-><init>(Landroid/view/WindowManager;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v2, v0

    .line 60
    :cond_2
    :goto_1
    iput-object v2, p0, Lw5/j;->b:Lw5/j$b;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    sget-object v0, Lw5/j$e;->e:Lw5/j$e;

    .line 65
    .line 66
    :cond_3
    iput-object v0, p0, Lw5/j;->c:Lw5/j$e;

    .line 67
    .line 68
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    iput-wide v0, p0, Lw5/j;->k:J

    .line 74
    .line 75
    iput-wide v0, p0, Lw5/j;->l:J

    .line 76
    .line 77
    const/high16 p1, -0x40800000    # -1.0f

    .line 78
    .line 79
    iput p1, p0, Lw5/j;->f:F

    .line 80
    .line 81
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    iput p1, p0, Lw5/j;->i:F

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    iput p1, p0, Lw5/j;->j:I

    .line 87
    .line 88
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 3

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lw5/j;->e:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget v1, p0, Lw5/j;->j:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget v1, p0, Lw5/j;->h:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput v2, p0, Lw5/j;->h:F

    invoke-static {v0, v2}, Lw5/j$a;->a(Landroid/view/Surface;F)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 10

    .line 1
    sget v0, Lv5/e0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_b

    .line 6
    .line 7
    iget-object v0, p0, Lw5/j;->e:Landroid/view/Surface;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lw5/j;->a:Lw5/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lw5/d;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/high16 v2, -0x40800000    # -1.0f

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lw5/j;->a:Lw5/d;

    .line 24
    .line 25
    invoke-virtual {v0}, Lw5/d;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lw5/d;->a:Lw5/d$a;

    .line 37
    .line 38
    iget-wide v5, v0, Lw5/d$a;->e:J

    .line 39
    .line 40
    const-wide/16 v7, 0x0

    .line 41
    .line 42
    cmp-long v9, v5, v7

    .line 43
    .line 44
    if-nez v9, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-wide v7, v0, Lw5/d$a;->f:J

    .line 48
    .line 49
    div-long/2addr v7, v5

    .line 50
    :goto_0
    long-to-double v5, v7

    .line 51
    div-double/2addr v3, v5

    .line 52
    double-to-float v0, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v0, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget v0, p0, Lw5/j;->f:F

    .line 57
    .line 58
    :goto_1
    iget v3, p0, Lw5/j;->g:F

    .line 59
    .line 60
    cmpl-float v4, v0, v3

    .line 61
    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    cmpl-float v4, v0, v2

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x1

    .line 69
    if-eqz v4, :cond_8

    .line 70
    .line 71
    cmpl-float v2, v3, v2

    .line 72
    .line 73
    if-eqz v2, :cond_8

    .line 74
    .line 75
    iget-object v1, p0, Lw5/j;->a:Lw5/d;

    .line 76
    .line 77
    invoke-virtual {v1}, Lw5/d;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    iget-object v1, p0, Lw5/j;->a:Lw5/d;

    .line 84
    .line 85
    invoke-virtual {v1}, Lw5/d;->a()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    iget-object v1, v1, Lw5/d;->a:Lw5/d$a;

    .line 92
    .line 93
    iget-wide v1, v1, Lw5/d$a;->f:J

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :goto_2
    const-wide v3, 0x12a05f200L

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    cmp-long v1, v1, v3

    .line 107
    .line 108
    if-ltz v1, :cond_6

    .line 109
    .line 110
    move v1, v6

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    move v1, v5

    .line 113
    :goto_3
    if-eqz v1, :cond_7

    .line 114
    .line 115
    const v1, 0x3ca3d70a    # 0.02f

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 120
    .line 121
    :goto_4
    iget v2, p0, Lw5/j;->g:F

    .line 122
    .line 123
    sub-float v2, v0, v2

    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    cmpl-float v1, v2, v1

    .line 130
    .line 131
    if-ltz v1, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    if-eqz v4, :cond_9

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    iget-object v2, p0, Lw5/j;->a:Lw5/d;

    .line 138
    .line 139
    iget v2, v2, Lw5/d;->e:I

    .line 140
    .line 141
    if-lt v2, v1, :cond_a

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_a
    move v6, v5

    .line 145
    :goto_5
    if-eqz v6, :cond_b

    .line 146
    .line 147
    iput v0, p0, Lw5/j;->g:F

    .line 148
    .line 149
    invoke-virtual {p0, v5}, Lw5/j;->c(Z)V

    .line 150
    .line 151
    .line 152
    :cond_b
    :goto_6
    return-void
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

.method public final c(Z)V
    .locals 4

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lw5/j;->e:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget v1, p0, Lw5/j;->j:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iget-boolean v2, p0, Lw5/j;->d:Z

    if-eqz v2, :cond_1

    iget v2, p0, Lw5/j;->g:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_1

    iget v1, p0, Lw5/j;->i:F

    mul-float/2addr v1, v2

    :cond_1
    if-nez p1, :cond_2

    iget p1, p0, Lw5/j;->h:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    return-void

    :cond_2
    iput v1, p0, Lw5/j;->h:F

    invoke-static {v0, v1}, Lw5/j$a;->a(Landroid/view/Surface;F)V

    :cond_3
    :goto_0
    return-void
.end method
