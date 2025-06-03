.class public final Lq5/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/CharSequence;

.field public d:I

.field public e:F

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:F

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lq5/f$d;->a:J

    iput-wide v0, p0, Lq5/f$d;->b:J

    const/4 v0, 0x2

    iput v0, p0, Lq5/f$d;->d:I

    const v0, -0x800001

    iput v0, p0, Lq5/f$d;->e:F

    const/4 v1, 0x1

    iput v1, p0, Lq5/f$d;->f:I

    const/4 v1, 0x0

    iput v1, p0, Lq5/f$d;->g:I

    iput v0, p0, Lq5/f$d;->h:F

    const/high16 v0, -0x80000000

    iput v0, p0, Lq5/f$d;->i:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lq5/f$d;->j:F

    iput v0, p0, Lq5/f$d;->k:I

    return-void
.end method


# virtual methods
.method public final a()Lh5/a$a;
    .locals 13

    .line 1
    iget v0, p0, Lq5/f$d;->h:F

    .line 2
    .line 3
    const v1, -0x800001

    .line 4
    .line 5
    .line 6
    cmpl-float v2, v0, v1

    .line 7
    .line 8
    const/high16 v3, 0x3f000000    # 0.5f

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/high16 v5, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v6, 0x5

    .line 14
    const/4 v7, 0x4

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v0, p0, Lq5/f$d;->d:I

    .line 19
    .line 20
    if-eq v0, v7, :cond_2

    .line 21
    .line 22
    if-eq v0, v6, :cond_1

    .line 23
    .line 24
    move v0, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    move v0, v4

    .line 29
    :goto_0
    iget v2, p0, Lq5/f$d;->i:I

    .line 30
    .line 31
    const/high16 v8, -0x80000000

    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    const/4 v10, 0x2

    .line 35
    const/4 v11, 0x1

    .line 36
    if-eq v2, v8, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    iget v2, p0, Lq5/f$d;->d:I

    .line 40
    .line 41
    if-eq v2, v11, :cond_5

    .line 42
    .line 43
    if-eq v2, v9, :cond_4

    .line 44
    .line 45
    if-eq v2, v7, :cond_5

    .line 46
    .line 47
    if-eq v2, v6, :cond_4

    .line 48
    .line 49
    move v2, v11

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    move v2, v10

    .line 52
    goto :goto_1

    .line 53
    :cond_5
    const/4 v2, 0x0

    .line 54
    :goto_1
    new-instance v8, Lh5/a$a;

    .line 55
    .line 56
    invoke-direct {v8}, Lh5/a$a;-><init>()V

    .line 57
    .line 58
    .line 59
    iget v12, p0, Lq5/f$d;->d:I

    .line 60
    .line 61
    if-eq v12, v11, :cond_8

    .line 62
    .line 63
    if-eq v12, v10, :cond_7

    .line 64
    .line 65
    if-eq v12, v9, :cond_6

    .line 66
    .line 67
    if-eq v12, v7, :cond_8

    .line 68
    .line 69
    if-eq v12, v6, :cond_6

    .line 70
    .line 71
    const-string v6, "Unknown textAlignment: "

    .line 72
    .line 73
    const-string v7, "WebvttCueParser"

    .line 74
    .line 75
    invoke-static {v6, v12, v7}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_7
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_8
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 87
    .line 88
    :goto_2
    iput-object v6, v8, Lh5/a$a;->c:Landroid/text/Layout$Alignment;

    .line 89
    .line 90
    iget v6, p0, Lq5/f$d;->e:F

    .line 91
    .line 92
    iget v7, p0, Lq5/f$d;->f:I

    .line 93
    .line 94
    cmpl-float v9, v6, v1

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    if-nez v7, :cond_9

    .line 99
    .line 100
    cmpg-float v4, v6, v4

    .line 101
    .line 102
    if-ltz v4, :cond_b

    .line 103
    .line 104
    cmpl-float v4, v6, v5

    .line 105
    .line 106
    if-lez v4, :cond_9

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_9
    if-eqz v9, :cond_a

    .line 110
    .line 111
    move v1, v6

    .line 112
    goto :goto_4

    .line 113
    :cond_a
    if-nez v7, :cond_c

    .line 114
    .line 115
    :cond_b
    :goto_3
    move v1, v5

    .line 116
    :cond_c
    :goto_4
    iput v1, v8, Lh5/a$a;->e:F

    .line 117
    .line 118
    iput v7, v8, Lh5/a$a;->f:I

    .line 119
    .line 120
    iget v1, p0, Lq5/f$d;->g:I

    .line 121
    .line 122
    iput v1, v8, Lh5/a$a;->g:I

    .line 123
    .line 124
    iput v0, v8, Lh5/a$a;->h:F

    .line 125
    .line 126
    iput v2, v8, Lh5/a$a;->i:I

    .line 127
    .line 128
    iget v1, p0, Lq5/f$d;->j:F

    .line 129
    .line 130
    if-eqz v2, :cond_10

    .line 131
    .line 132
    if-eq v2, v11, :cond_e

    .line 133
    .line 134
    if-ne v2, v10, :cond_d

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_e
    cmpg-float v2, v0, v3

    .line 148
    .line 149
    const/high16 v3, 0x40000000    # 2.0f

    .line 150
    .line 151
    if-gtz v2, :cond_f

    .line 152
    .line 153
    mul-float/2addr v0, v3

    .line 154
    goto :goto_5

    .line 155
    :cond_f
    sub-float/2addr v5, v0

    .line 156
    mul-float v0, v5, v3

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_10
    sub-float v0, v5, v0

    .line 160
    .line 161
    :goto_5
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    iput v0, v8, Lh5/a$a;->l:F

    .line 166
    .line 167
    iget v0, p0, Lq5/f$d;->k:I

    .line 168
    .line 169
    iput v0, v8, Lh5/a$a;->p:I

    .line 170
    .line 171
    iget-object v0, p0, Lq5/f$d;->c:Ljava/lang/CharSequence;

    .line 172
    .line 173
    if-eqz v0, :cond_11

    .line 174
    .line 175
    iput-object v0, v8, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 176
    .line 177
    :cond_11
    return-object v8
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
