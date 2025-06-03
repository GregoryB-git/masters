.class public final Lx3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/f;


# instance fields
.field public b:I

.field public c:F

.field public d:F

.field public e:Lx3/f$a;

.field public f:Lx3/f$a;

.field public g:Lx3/f$a;

.field public h:Lx3/f$a;

.field public i:Z

.field public j:Lx3/b0;

.field public k:Ljava/nio/ByteBuffer;

.field public l:Ljava/nio/ShortBuffer;

.field public m:Ljava/nio/ByteBuffer;

.field public n:J

.field public o:J

.field public p:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lx3/c0;->c:F

    iput v0, p0, Lx3/c0;->d:F

    sget-object v0, Lx3/f$a;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->f:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->g:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->h:Lx3/f$a;

    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lx3/c0;->l:Ljava/nio/ShortBuffer;

    iput-object v0, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lx3/c0;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/nio/ByteBuffer;
    .locals 7

    .line 1
    iget-object v0, p0, Lx3/c0;->j:Lx3/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, v0, Lx3/b0;->m:I

    .line 6
    .line 7
    iget v2, v0, Lx3/b0;->b:I

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    mul-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p0, Lx3/c0;->l:Ljava/nio/ShortBuffer;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v2, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lx3/c0;->l:Ljava/nio/ShortBuffer;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v2, p0, Lx3/c0;->l:Ljava/nio/ShortBuffer;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget v4, v0, Lx3/b0;->b:I

    .line 60
    .line 61
    div-int/2addr v3, v4

    .line 62
    iget v4, v0, Lx3/b0;->m:I

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iget-object v4, v0, Lx3/b0;->l:[S

    .line 69
    .line 70
    iget v5, v0, Lx3/b0;->b:I

    .line 71
    .line 72
    mul-int/2addr v5, v3

    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-virtual {v2, v4, v6, v5}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 75
    .line 76
    .line 77
    iget v2, v0, Lx3/b0;->m:I

    .line 78
    .line 79
    sub-int/2addr v2, v3

    .line 80
    iput v2, v0, Lx3/b0;->m:I

    .line 81
    .line 82
    iget-object v4, v0, Lx3/b0;->l:[S

    .line 83
    .line 84
    iget v0, v0, Lx3/b0;->b:I

    .line 85
    .line 86
    mul-int/2addr v3, v0

    .line 87
    mul-int/2addr v2, v0

    .line 88
    invoke-static {v4, v3, v4, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget-wide v2, p0, Lx3/c0;->o:J

    .line 92
    .line 93
    int-to-long v4, v1

    .line 94
    add-long/2addr v2, v4

    .line 95
    iput-wide v2, p0, Lx3/c0;->o:J

    .line 96
    .line 97
    iget-object v0, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iput-object v0, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    :cond_1
    iget-object v0, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    sget-object v1, Lx3/f;->a:Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    iput-object v1, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    return-object v0
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

.method public final b(Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lx3/c0;->j:Lx3/b0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-wide v3, p0, Lx3/c0;->n:J

    .line 22
    .line 23
    int-to-long v5, v2

    .line 24
    add-long/2addr v3, v5

    .line 25
    iput-wide v3, p0, Lx3/c0;->n:J

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget v4, v0, Lx3/b0;->b:I

    .line 32
    .line 33
    div-int/2addr v3, v4

    .line 34
    mul-int/2addr v4, v3

    .line 35
    mul-int/lit8 v4, v4, 0x2

    .line 36
    .line 37
    iget-object v5, v0, Lx3/b0;->j:[S

    .line 38
    .line 39
    iget v6, v0, Lx3/b0;->k:I

    .line 40
    .line 41
    invoke-virtual {v0, v5, v6, v3}, Lx3/b0;->b([SII)[S

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iput-object v5, v0, Lx3/b0;->j:[S

    .line 46
    .line 47
    iget v6, v0, Lx3/b0;->k:I

    .line 48
    .line 49
    iget v7, v0, Lx3/b0;->b:I

    .line 50
    .line 51
    mul-int/2addr v6, v7

    .line 52
    div-int/lit8 v4, v4, 0x2

    .line 53
    .line 54
    invoke-virtual {v1, v5, v6, v4}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    .line 55
    .line 56
    .line 57
    iget v1, v0, Lx3/b0;->k:I

    .line 58
    .line 59
    add-int/2addr v1, v3

    .line 60
    iput v1, v0, Lx3/b0;->k:I

    .line 61
    .line 62
    invoke-virtual {v0}, Lx3/b0;->e()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v0, v2

    .line 70
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 71
    .line 72
    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, Lx3/c0;->j:Lx3/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, v0, Lx3/b0;->k:I

    .line 6
    .line 7
    iget v2, v0, Lx3/b0;->c:F

    .line 8
    .line 9
    iget v3, v0, Lx3/b0;->d:F

    .line 10
    .line 11
    div-float/2addr v2, v3

    .line 12
    iget v4, v0, Lx3/b0;->e:F

    .line 13
    .line 14
    mul-float/2addr v4, v3

    .line 15
    iget v3, v0, Lx3/b0;->m:I

    .line 16
    .line 17
    int-to-float v5, v1

    .line 18
    div-float/2addr v5, v2

    .line 19
    iget v2, v0, Lx3/b0;->o:I

    .line 20
    .line 21
    int-to-float v2, v2

    .line 22
    add-float/2addr v5, v2

    .line 23
    div-float/2addr v5, v4

    .line 24
    const/high16 v2, 0x3f000000    # 0.5f

    .line 25
    .line 26
    add-float/2addr v5, v2

    .line 27
    float-to-int v2, v5

    .line 28
    add-int/2addr v3, v2

    .line 29
    iget-object v2, v0, Lx3/b0;->j:[S

    .line 30
    .line 31
    iget v4, v0, Lx3/b0;->h:I

    .line 32
    .line 33
    mul-int/lit8 v4, v4, 0x2

    .line 34
    .line 35
    add-int/2addr v4, v1

    .line 36
    invoke-virtual {v0, v2, v1, v4}, Lx3/b0;->b([SII)[S

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v0, Lx3/b0;->j:[S

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    move v4, v2

    .line 44
    :goto_0
    iget v5, v0, Lx3/b0;->h:I

    .line 45
    .line 46
    mul-int/lit8 v5, v5, 0x2

    .line 47
    .line 48
    iget v6, v0, Lx3/b0;->b:I

    .line 49
    .line 50
    mul-int v7, v5, v6

    .line 51
    .line 52
    if-ge v4, v7, :cond_0

    .line 53
    .line 54
    iget-object v5, v0, Lx3/b0;->j:[S

    .line 55
    .line 56
    mul-int/2addr v6, v1

    .line 57
    add-int/2addr v6, v4

    .line 58
    aput-short v2, v5, v6

    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget v1, v0, Lx3/b0;->k:I

    .line 64
    .line 65
    add-int/2addr v5, v1

    .line 66
    iput v5, v0, Lx3/b0;->k:I

    .line 67
    .line 68
    invoke-virtual {v0}, Lx3/b0;->e()V

    .line 69
    .line 70
    .line 71
    iget v1, v0, Lx3/b0;->m:I

    .line 72
    .line 73
    if-le v1, v3, :cond_1

    .line 74
    .line 75
    iput v3, v0, Lx3/b0;->m:I

    .line 76
    .line 77
    :cond_1
    iput v2, v0, Lx3/b0;->k:I

    .line 78
    .line 79
    iput v2, v0, Lx3/b0;->r:I

    .line 80
    .line 81
    iput v2, v0, Lx3/b0;->o:I

    .line 82
    .line 83
    :cond_2
    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lx3/c0;->p:Z

    .line 85
    .line 86
    return-void
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

.method public final d()Z
    .locals 2

    iget-boolean v0, p0, Lx3/c0;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx3/c0;->j:Lx3/b0;

    if-eqz v0, :cond_0

    iget v1, v0, Lx3/b0;->m:I

    iget v0, v0, Lx3/b0;->b:I

    mul-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(Lx3/f$a;)Lx3/f$a;
    .locals 3

    iget v0, p1, Lx3/f$a;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lx3/c0;->b:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p1, Lx3/f$a;->a:I

    :cond_0
    iput-object p1, p0, Lx3/c0;->e:Lx3/f$a;

    new-instance v2, Lx3/f$a;

    iget p1, p1, Lx3/f$a;->b:I

    invoke-direct {v2, v0, p1, v1}, Lx3/f$a;-><init>(III)V

    iput-object v2, p0, Lx3/c0;->f:Lx3/f$a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx3/c0;->i:Z

    return-object v2

    :cond_1
    new-instance v0, Lx3/f$b;

    invoke-direct {v0, p1}, Lx3/f$b;-><init>(Lx3/f$a;)V

    throw v0
.end method

.method public final flush()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lx3/c0;->isActive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lx3/c0;->e:Lx3/f$a;

    .line 9
    .line 10
    iput-object v0, p0, Lx3/c0;->g:Lx3/f$a;

    .line 11
    .line 12
    iget-object v2, p0, Lx3/c0;->f:Lx3/f$a;

    .line 13
    .line 14
    iput-object v2, p0, Lx3/c0;->h:Lx3/f$a;

    .line 15
    .line 16
    iget-boolean v3, p0, Lx3/c0;->i:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Lx3/b0;

    .line 21
    .line 22
    iget v5, v0, Lx3/f$a;->a:I

    .line 23
    .line 24
    iget v6, v0, Lx3/f$a;->b:I

    .line 25
    .line 26
    iget v7, p0, Lx3/c0;->c:F

    .line 27
    .line 28
    iget v8, p0, Lx3/c0;->d:F

    .line 29
    .line 30
    iget v9, v2, Lx3/f$a;->a:I

    .line 31
    .line 32
    move-object v4, v3

    .line 33
    invoke-direct/range {v4 .. v9}, Lx3/b0;-><init>(IIFFI)V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Lx3/c0;->j:Lx3/b0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lx3/c0;->j:Lx3/b0;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iput v1, v0, Lx3/b0;->k:I

    .line 44
    .line 45
    iput v1, v0, Lx3/b0;->m:I

    .line 46
    .line 47
    iput v1, v0, Lx3/b0;->o:I

    .line 48
    .line 49
    iput v1, v0, Lx3/b0;->p:I

    .line 50
    .line 51
    iput v1, v0, Lx3/b0;->q:I

    .line 52
    .line 53
    iput v1, v0, Lx3/b0;->r:I

    .line 54
    .line 55
    iput v1, v0, Lx3/b0;->s:I

    .line 56
    .line 57
    iput v1, v0, Lx3/b0;->t:I

    .line 58
    .line 59
    iput v1, v0, Lx3/b0;->u:I

    .line 60
    .line 61
    iput v1, v0, Lx3/b0;->v:I

    .line 62
    .line 63
    :cond_1
    :goto_0
    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    iput-object v0, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    const-wide/16 v2, 0x0

    .line 68
    .line 69
    iput-wide v2, p0, Lx3/c0;->n:J

    .line 70
    .line 71
    iput-wide v2, p0, Lx3/c0;->o:J

    .line 72
    .line 73
    iput-boolean v1, p0, Lx3/c0;->p:Z

    .line 74
    .line 75
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final isActive()Z
    .locals 3

    iget-object v0, p0, Lx3/c0;->f:Lx3/f$a;

    iget v0, v0, Lx3/f$a;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lx3/c0;->c:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x38d1b717    # 1.0E-4f

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lx3/c0;->d:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lx3/c0;->f:Lx3/f$a;

    iget v0, v0, Lx3/f$a;->a:I

    iget-object v1, p0, Lx3/c0;->e:Lx3/f$a;

    iget v1, v1, Lx3/f$a;->a:I

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final reset()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lx3/c0;->c:F

    iput v0, p0, Lx3/c0;->d:F

    sget-object v0, Lx3/f$a;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->f:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->g:Lx3/f$a;

    iput-object v0, p0, Lx3/c0;->h:Lx3/f$a;

    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/c0;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lx3/c0;->l:Ljava/nio/ShortBuffer;

    iput-object v0, p0, Lx3/c0;->m:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    iput v0, p0, Lx3/c0;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx3/c0;->i:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lx3/c0;->j:Lx3/b0;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lx3/c0;->n:J

    iput-wide v1, p0, Lx3/c0;->o:J

    iput-boolean v0, p0, Lx3/c0;->p:Z

    return-void
.end method
