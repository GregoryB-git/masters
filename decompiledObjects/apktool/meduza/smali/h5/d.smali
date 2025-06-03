.class public final Lh5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh5/d$b;
    }
.end annotation


# instance fields
.field public final a:Lh5/b;

.field public final b:Lh5/k;

.field public final c:Ljava/util/ArrayDeque;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh5/b;

    invoke-direct {v0}, Lh5/b;-><init>()V

    iput-object v0, p0, Lh5/d;->a:Lh5/b;

    new-instance v0, Lh5/k;

    invoke-direct {v0}, Lh5/k;-><init>()V

    iput-object v0, p0, Lh5/d;->b:Lh5/k;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lh5/d;->c:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lh5/d;->c:Ljava/util/ArrayDeque;

    new-instance v3, Lh5/d$a;

    invoke-direct {v3, p0}, Lh5/d$a;-><init>(Lh5/d;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lh5/d;->d:I

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lh5/d;->e:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lh5/d;->d:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lh5/d;->c:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v0, p0, Lh5/d;->c:Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lh5/l;

    .line 29
    .line 30
    iget-object v1, p0, Lh5/d;->b:Lh5/k;

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    invoke-virtual {v1, v2}, Lz3/a;->m(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Lz3/a;->l(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v4, Lh5/d$b;

    .line 45
    .line 46
    iget-object v1, p0, Lh5/d;->b:Lh5/k;

    .line 47
    .line 48
    iget-wide v2, v1, Lz3/g;->e:J

    .line 49
    .line 50
    iget-object v5, p0, Lh5/d;->a:Lh5/b;

    .line 51
    .line 52
    iget-object v1, v1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    array-length v6, v1

    .line 69
    invoke-virtual {v5, v1, v7, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 73
    .line 74
    .line 75
    const-class v1, Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v5, v1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 86
    .line 87
    .line 88
    const-string v5, "c"

    .line 89
    .line 90
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v5, Lh5/a;->R:Le0/e;

    .line 98
    .line 99
    invoke-static {v5, v1}, Lv5/b;->a(Lv3/g$a;Ljava/util/ArrayList;)Lo7/l0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v4, v2, v3, v1}, Lh5/d$b;-><init>(JLo7/l0;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lh5/d;->b:Lh5/k;

    .line 107
    .line 108
    iget-wide v2, v1, Lz3/g;->e:J

    .line 109
    .line 110
    const-wide/16 v5, 0x0

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    invoke-virtual/range {v1 .. v6}, Lh5/l;->p(JLh5/g;J)V

    .line 114
    .line 115
    .line 116
    :goto_0
    iget-object v1, p0, Lh5/d;->b:Lh5/k;

    .line 117
    .line 118
    invoke-virtual {v1}, Lz3/g;->o()V

    .line 119
    .line 120
    .line 121
    iput v7, p0, Lh5/d;->d:I

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 125
    :goto_2
    return-object v0
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

.method public final c()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lh5/d;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget v0, p0, Lh5/d;->d:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iput v1, p0, Lh5/d;->d:I

    iget-object v0, p0, Lh5/d;->b:Lh5/k;

    :goto_0
    return-object v0
.end method

.method public final d(Lh5/k;)V
    .locals 3

    iget-boolean v0, p0, Lh5/d;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget v0, p0, Lh5/d;->d:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lh5/d;->b:Lh5/k;

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Lx6/b;->q(Z)V

    const/4 p1, 0x2

    iput p1, p0, Lh5/d;->d:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Lh5/d;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lh5/d;->b:Lh5/k;

    invoke-virtual {v0}, Lz3/g;->o()V

    const/4 v0, 0x0

    iput v0, p0, Lh5/d;->d:I

    return-void
.end method

.method public final release()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh5/d;->e:Z

    return-void
.end method
