.class public final Ll1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/K$c;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll1/j;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll1/j;->a:I

    iput-object p2, p0, Ll1/j;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(ILl1/K$b;)Ll1/K;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-eq p1, v1, :cond_d

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    if-eq p1, v1, :cond_d

    .line 9
    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-eq p1, v2, :cond_c

    .line 13
    .line 14
    const/16 v2, 0x1b

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq p1, v2, :cond_a

    .line 18
    .line 19
    const/16 v1, 0x24

    .line 20
    .line 21
    if-eq p1, v1, :cond_9

    .line 22
    .line 23
    const/16 v1, 0x2d

    .line 24
    .line 25
    if-eq p1, v1, :cond_8

    .line 26
    .line 27
    const/16 v1, 0x59

    .line 28
    .line 29
    if-eq p1, v1, :cond_7

    .line 30
    .line 31
    const/16 v1, 0xac

    .line 32
    .line 33
    if-eq p1, v1, :cond_6

    .line 34
    .line 35
    const/16 v1, 0x101

    .line 36
    .line 37
    if-eq p1, v1, :cond_5

    .line 38
    .line 39
    const/16 v1, 0x8a

    .line 40
    .line 41
    if-eq p1, v1, :cond_4

    .line 42
    .line 43
    const/16 v1, 0x8b

    .line 44
    .line 45
    if-eq p1, v1, :cond_3

    .line 46
    .line 47
    packed-switch p1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    packed-switch p1, :pswitch_data_1

    .line 51
    .line 52
    .line 53
    packed-switch p1, :pswitch_data_2

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :pswitch_0
    const/16 p1, 0x10

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ll1/j;->f(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v3, Ll1/E;

    .line 67
    .line 68
    new-instance p1, Ll1/x;

    .line 69
    .line 70
    const-string p2, "application/x-scte35"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ll1/x;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v3, p1}, Ll1/E;-><init>(Ll1/D;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-object v3

    .line 79
    :pswitch_1
    const/16 p1, 0x40

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ll1/j;->f(I)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    return-object v3

    .line 88
    :pswitch_2
    new-instance p1, Ll1/y;

    .line 89
    .line 90
    new-instance v0, Ll1/c;

    .line 91
    .line 92
    iget-object v1, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-direct {v0, v1, p2}, Ll1/c;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_3
    invoke-virtual {p0, v0}, Ll1/j;->f(I)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    new-instance v3, Ll1/y;

    .line 113
    .line 114
    new-instance p1, Ll1/s;

    .line 115
    .line 116
    iget-object v0, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-direct {p1, v0, p2}, Ll1/s;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v3, p1}, Ll1/y;-><init>(Ll1/m;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    return-object v3

    .line 129
    :pswitch_4
    new-instance p1, Ll1/y;

    .line 130
    .line 131
    new-instance v0, Ll1/o;

    .line 132
    .line 133
    invoke-virtual {p0, p2}, Ll1/j;->d(Ll1/K$b;)Ll1/M;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-direct {v0, p2}, Ll1/o;-><init>(Ll1/M;)V

    .line 138
    .line 139
    .line 140
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 141
    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_5
    invoke-virtual {p0, v0}, Ll1/j;->f(I)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_2

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    new-instance v3, Ll1/y;

    .line 152
    .line 153
    new-instance p1, Ll1/i;

    .line 154
    .line 155
    iget-object v0, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    const/4 v1, 0x0

    .line 162
    invoke-direct {p1, v1, v0, p2}, Ll1/i;-><init>(ZLjava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v3, p1}, Ll1/y;-><init>(Ll1/m;)V

    .line 166
    .line 167
    .line 168
    :goto_2
    return-object v3

    .line 169
    :cond_3
    new-instance p1, Ll1/y;

    .line 170
    .line 171
    new-instance v0, Ll1/k;

    .line 172
    .line 173
    iget-object v1, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    const/16 v2, 0x1520

    .line 180
    .line 181
    invoke-direct {v0, v1, p2, v2}, Ll1/k;-><init>(Ljava/lang/String;II)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 185
    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_4
    :pswitch_6
    new-instance p1, Ll1/y;

    .line 189
    .line 190
    new-instance v0, Ll1/k;

    .line 191
    .line 192
    iget-object v1, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    const/16 v2, 0x1000

    .line 199
    .line 200
    invoke-direct {v0, v1, p2, v2}, Ll1/k;-><init>(Ljava/lang/String;II)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 204
    .line 205
    .line 206
    return-object p1

    .line 207
    :cond_5
    new-instance p1, Ll1/E;

    .line 208
    .line 209
    new-instance p2, Ll1/x;

    .line 210
    .line 211
    const-string v0, "application/vnd.dvb.ait"

    .line 212
    .line 213
    invoke-direct {p2, v0}, Ll1/x;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {p1, p2}, Ll1/E;-><init>(Ll1/D;)V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_6
    new-instance p1, Ll1/y;

    .line 221
    .line 222
    new-instance v0, Ll1/f;

    .line 223
    .line 224
    iget-object v1, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-direct {v0, v1, p2}, Ll1/f;-><init>(Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 234
    .line 235
    .line 236
    return-object p1

    .line 237
    :cond_7
    new-instance p1, Ll1/y;

    .line 238
    .line 239
    new-instance v0, Ll1/l;

    .line 240
    .line 241
    iget-object p2, p2, Ll1/K$b;->d:Ljava/util/List;

    .line 242
    .line 243
    invoke-direct {v0, p2}, Ll1/l;-><init>(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 247
    .line 248
    .line 249
    return-object p1

    .line 250
    :cond_8
    new-instance p1, Ll1/y;

    .line 251
    .line 252
    new-instance p2, Ll1/u;

    .line 253
    .line 254
    invoke-direct {p2}, Ll1/u;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-direct {p1, p2}, Ll1/y;-><init>(Ll1/m;)V

    .line 258
    .line 259
    .line 260
    return-object p1

    .line 261
    :cond_9
    new-instance p1, Ll1/y;

    .line 262
    .line 263
    new-instance v0, Ll1/q;

    .line 264
    .line 265
    invoke-virtual {p0, p2}, Ll1/j;->c(Ll1/K$b;)Ll1/F;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-direct {v0, p2}, Ll1/q;-><init>(Ll1/F;)V

    .line 270
    .line 271
    .line 272
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 273
    .line 274
    .line 275
    return-object p1

    .line 276
    :cond_a
    invoke-virtual {p0, v1}, Ll1/j;->f(I)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-eqz p1, :cond_b

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_b
    new-instance v3, Ll1/y;

    .line 284
    .line 285
    new-instance p1, Ll1/p;

    .line 286
    .line 287
    invoke-virtual {p0, p2}, Ll1/j;->c(Ll1/K$b;)Ll1/F;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    const/4 v0, 0x1

    .line 292
    invoke-virtual {p0, v0}, Ll1/j;->f(I)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    const/16 v1, 0x8

    .line 297
    .line 298
    invoke-virtual {p0, v1}, Ll1/j;->f(I)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-direct {p1, p2, v0, v1}, Ll1/p;-><init>(Ll1/F;ZZ)V

    .line 303
    .line 304
    .line 305
    invoke-direct {v3, p1}, Ll1/y;-><init>(Ll1/m;)V

    .line 306
    .line 307
    .line 308
    :goto_3
    return-object v3

    .line 309
    :cond_c
    new-instance p1, Ll1/y;

    .line 310
    .line 311
    new-instance p2, Ll1/r;

    .line 312
    .line 313
    invoke-direct {p2}, Ll1/r;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-direct {p1, p2}, Ll1/y;-><init>(Ll1/m;)V

    .line 317
    .line 318
    .line 319
    return-object p1

    .line 320
    :cond_d
    new-instance p1, Ll1/y;

    .line 321
    .line 322
    new-instance v0, Ll1/t;

    .line 323
    .line 324
    iget-object v1, p2, Ll1/K$b;->b:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {p2}, Ll1/K$b;->a()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    invoke-direct {v0, v1, p2}, Ll1/t;-><init>(Ljava/lang/String;I)V

    .line 331
    .line 332
    .line 333
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 334
    .line 335
    .line 336
    return-object p1

    .line 337
    :cond_e
    :pswitch_7
    new-instance p1, Ll1/y;

    .line 338
    .line 339
    new-instance v0, Ll1/n;

    .line 340
    .line 341
    invoke-virtual {p0, p2}, Ll1/j;->d(Ll1/K$b;)Ll1/M;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    invoke-direct {v0, p2}, Ll1/n;-><init>(Ll1/M;)V

    .line 346
    .line 347
    .line 348
    invoke-direct {p1, v0}, Ll1/y;-><init>(Ll1/m;)V

    .line 349
    .line 350
    .line 351
    return-object p1

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_7
        :pswitch_2
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x86
        :pswitch_0
        :pswitch_2
        :pswitch_6
    .end packed-switch
.end method

.method public final c(Ll1/K$b;)Ll1/F;
    .locals 1

    .line 1
    new-instance v0, Ll1/F;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll1/j;->e(Ll1/K$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ll1/F;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d(Ll1/K$b;)Ll1/M;
    .locals 1

    .line 1
    new-instance v0, Ll1/M;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll1/j;->e(Ll1/K$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ll1/M;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final e(Ll1/K$b;)Ljava/util/List;
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ll1/j;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Ll1/j;->b:Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, Lg0/z;

    .line 13
    .line 14
    iget-object p1, p1, Ll1/K$b;->e:[B

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lg0/z;-><init>([B)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Ll1/j;->b:Ljava/util/List;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lg0/z;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_6

    .line 26
    .line 27
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0}, Lg0/z;->f()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v2

    .line 40
    const/16 v2, 0x86

    .line 41
    .line 42
    if-ne v1, v2, :cond_5

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    move v4, v2

    .line 57
    :goto_1
    if-ge v4, v1, :cond_5

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    invoke-virtual {v0, v5}, Lg0/z;->D(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    and-int/lit16 v7, v6, 0x80

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    move v7, v8

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move v7, v2

    .line 76
    :goto_2
    if-eqz v7, :cond_2

    .line 77
    .line 78
    and-int/lit8 v6, v6, 0x3f

    .line 79
    .line 80
    const-string v9, "application/cea-708"

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    const-string v9, "application/cea-608"

    .line 84
    .line 85
    move v6, v8

    .line 86
    :goto_3
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    int-to-byte v10, v10

    .line 91
    invoke-virtual {v0, v8}, Lg0/z;->U(I)V

    .line 92
    .line 93
    .line 94
    if-eqz v7, :cond_4

    .line 95
    .line 96
    and-int/lit8 v7, v10, 0x40

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    move v8, v2

    .line 102
    :goto_4
    invoke-static {v8}, Lg0/d;->b(Z)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_5

    .line 107
    :cond_4
    const/4 v7, 0x0

    .line 108
    :goto_5
    new-instance v8, Ld0/q$b;

    .line 109
    .line 110
    invoke-direct {v8}, Ld0/q$b;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v9}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8, v5}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v6}, Ld0/q$b;->L(I)Ld0/q$b;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v7}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5}, Ld0/q$b;->K()Ld0/q;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {v0, v3}, Lg0/z;->T(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    return-object p1
.end method

.method public final f(I)Z
    .locals 1

    .line 1
    iget v0, p0, Ll1/j;->a:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    return p1
.end method
