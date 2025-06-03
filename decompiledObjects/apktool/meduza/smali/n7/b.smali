.class public abstract Ln7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Ln7/b;->a:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 10

    .line 1
    iget v0, p0, Ln7/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eq v0, v2, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v3

    .line 11
    :goto_0
    invoke-static {v0}, Lx6/b;->J(Z)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Ln7/b;->a:I

    .line 15
    .line 16
    invoke-static {v0}, Lq0/g;->c(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_b

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v0, v4, :cond_a

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    iput v2, p0, Ln7/b;->a:I

    .line 27
    .line 28
    move-object v2, p0

    .line 29
    check-cast v2, Ln7/o$a;

    .line 30
    .line 31
    :goto_1
    iget v4, v2, Ln7/o$a;->f:I

    .line 32
    .line 33
    :cond_1
    :goto_2
    iget v5, v2, Ln7/o$a;->f:I

    .line 34
    .line 35
    const/4 v6, -0x1

    .line 36
    if-eq v5, v6, :cond_9

    .line 37
    .line 38
    move-object v7, v2

    .line 39
    check-cast v7, Ln7/m;

    .line 40
    .line 41
    iget-object v8, v7, Ln7/m;->p:Ln7/n;

    .line 42
    .line 43
    iget-object v8, v8, Ln7/n;->a:Ln7/c;

    .line 44
    .line 45
    iget-object v7, v7, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 46
    .line 47
    invoke-virtual {v8, v5, v7}, Ln7/c;->a(ILjava/lang/CharSequence;)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-ne v5, v6, :cond_2

    .line 52
    .line 53
    iget-object v5, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    iput v6, v2, Ln7/o$a;->f:I

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 63
    .line 64
    iput v7, v2, Ln7/o$a;->f:I

    .line 65
    .line 66
    :goto_3
    iget v7, v2, Ln7/o$a;->f:I

    .line 67
    .line 68
    if-ne v7, v4, :cond_3

    .line 69
    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    iput v7, v2, Ln7/o$a;->f:I

    .line 73
    .line 74
    iget-object v5, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-le v7, v5, :cond_1

    .line 81
    .line 82
    iput v6, v2, Ln7/o$a;->f:I

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_4
    if-ge v4, v5, :cond_4

    .line 86
    .line 87
    iget-object v7, v2, Ln7/o$a;->d:Ln7/c;

    .line 88
    .line 89
    iget-object v8, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 90
    .line 91
    invoke-interface {v8, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-virtual {v7, v8}, Ln7/c;->b(C)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_4

    .line 100
    .line 101
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    :goto_5
    if-le v5, v4, :cond_5

    .line 105
    .line 106
    iget-object v7, v2, Ln7/o$a;->d:Ln7/c;

    .line 107
    .line 108
    iget-object v8, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 109
    .line 110
    add-int/lit8 v9, v5, -0x1

    .line 111
    .line 112
    invoke-interface {v8, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-virtual {v7, v8}, Ln7/c;->b(C)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    move v5, v9

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    iget-boolean v7, v2, Ln7/o$a;->e:Z

    .line 125
    .line 126
    if-eqz v7, :cond_6

    .line 127
    .line 128
    if-ne v4, v5, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    iget v7, v2, Ln7/o$a;->o:I

    .line 132
    .line 133
    if-ne v7, v1, :cond_7

    .line 134
    .line 135
    iget-object v5, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    iput v6, v2, Ln7/o$a;->f:I

    .line 142
    .line 143
    :goto_6
    if-le v5, v4, :cond_8

    .line 144
    .line 145
    iget-object v6, v2, Ln7/o$a;->d:Ln7/c;

    .line 146
    .line 147
    iget-object v7, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 148
    .line 149
    add-int/lit8 v8, v5, -0x1

    .line 150
    .line 151
    invoke-interface {v7, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    invoke-virtual {v6, v7}, Ln7/c;->b(C)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_8

    .line 160
    .line 161
    move v5, v8

    .line 162
    goto :goto_6

    .line 163
    :cond_7
    sub-int/2addr v7, v1

    .line 164
    iput v7, v2, Ln7/o$a;->o:I

    .line 165
    .line 166
    :cond_8
    iget-object v2, v2, Ln7/o$a;->c:Ljava/lang/CharSequence;

    .line 167
    .line 168
    invoke-interface {v2, v4, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    goto :goto_7

    .line 177
    :cond_9
    iput v0, v2, Ln7/b;->a:I

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    :goto_7
    iput-object v2, p0, Ln7/b;->b:Ljava/lang/String;

    .line 181
    .line 182
    iget v2, p0, Ln7/b;->a:I

    .line 183
    .line 184
    if-eq v2, v0, :cond_a

    .line 185
    .line 186
    iput v1, p0, Ln7/b;->a:I

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_a
    move v1, v3

    .line 190
    :cond_b
    :goto_8
    return v1
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

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Ln7/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Ln7/b;->a:I

    iget-object v0, p0, Ln7/b;->b:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Ln7/b;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
