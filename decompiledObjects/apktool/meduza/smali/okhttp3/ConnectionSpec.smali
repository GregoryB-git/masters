.class public final Lokhttp3/ConnectionSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/ConnectionSpec$Builder;
    }
.end annotation


# static fields
.field public static final e:Lokhttp3/ConnectionSpec;

.field public static final f:Lokhttp3/ConnectionSpec;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 24

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v1, v0, [Lokhttp3/CipherSuite;

    .line 4
    .line 5
    sget-object v2, Lokhttp3/CipherSuite;->q:Lokhttp3/CipherSuite;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    aput-object v2, v1, v3

    .line 9
    .line 10
    sget-object v4, Lokhttp3/CipherSuite;->r:Lokhttp3/CipherSuite;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    aput-object v4, v1, v5

    .line 14
    .line 15
    sget-object v6, Lokhttp3/CipherSuite;->s:Lokhttp3/CipherSuite;

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    aput-object v6, v1, v7

    .line 19
    .line 20
    sget-object v8, Lokhttp3/CipherSuite;->t:Lokhttp3/CipherSuite;

    .line 21
    .line 22
    const/4 v9, 0x3

    .line 23
    aput-object v8, v1, v9

    .line 24
    .line 25
    sget-object v10, Lokhttp3/CipherSuite;->u:Lokhttp3/CipherSuite;

    .line 26
    .line 27
    const/4 v11, 0x4

    .line 28
    aput-object v10, v1, v11

    .line 29
    .line 30
    sget-object v12, Lokhttp3/CipherSuite;->k:Lokhttp3/CipherSuite;

    .line 31
    .line 32
    const/4 v13, 0x5

    .line 33
    aput-object v12, v1, v13

    .line 34
    .line 35
    sget-object v14, Lokhttp3/CipherSuite;->m:Lokhttp3/CipherSuite;

    .line 36
    .line 37
    const/4 v15, 0x6

    .line 38
    aput-object v14, v1, v15

    .line 39
    .line 40
    sget-object v16, Lokhttp3/CipherSuite;->l:Lokhttp3/CipherSuite;

    .line 41
    .line 42
    const/16 v17, 0x7

    .line 43
    .line 44
    aput-object v16, v1, v17

    .line 45
    .line 46
    sget-object v18, Lokhttp3/CipherSuite;->n:Lokhttp3/CipherSuite;

    .line 47
    .line 48
    const/16 v19, 0x8

    .line 49
    .line 50
    aput-object v18, v1, v19

    .line 51
    .line 52
    sget-object v20, Lokhttp3/CipherSuite;->p:Lokhttp3/CipherSuite;

    .line 53
    .line 54
    const/16 v21, 0x9

    .line 55
    .line 56
    aput-object v20, v1, v21

    .line 57
    .line 58
    sget-object v22, Lokhttp3/CipherSuite;->o:Lokhttp3/CipherSuite;

    .line 59
    .line 60
    const/16 v23, 0xa

    .line 61
    .line 62
    aput-object v22, v1, v23

    .line 63
    .line 64
    const/16 v0, 0x12

    .line 65
    .line 66
    new-array v0, v0, [Lokhttp3/CipherSuite;

    .line 67
    .line 68
    aput-object v2, v0, v3

    .line 69
    .line 70
    aput-object v4, v0, v5

    .line 71
    .line 72
    aput-object v6, v0, v7

    .line 73
    .line 74
    aput-object v8, v0, v9

    .line 75
    .line 76
    aput-object v10, v0, v11

    .line 77
    .line 78
    aput-object v12, v0, v13

    .line 79
    .line 80
    aput-object v14, v0, v15

    .line 81
    .line 82
    aput-object v16, v0, v17

    .line 83
    .line 84
    aput-object v18, v0, v19

    .line 85
    .line 86
    aput-object v20, v0, v21

    .line 87
    .line 88
    aput-object v22, v0, v23

    .line 89
    .line 90
    sget-object v2, Lokhttp3/CipherSuite;->i:Lokhttp3/CipherSuite;

    .line 91
    .line 92
    const/16 v4, 0xb

    .line 93
    .line 94
    aput-object v2, v0, v4

    .line 95
    .line 96
    sget-object v2, Lokhttp3/CipherSuite;->j:Lokhttp3/CipherSuite;

    .line 97
    .line 98
    const/16 v4, 0xc

    .line 99
    .line 100
    aput-object v2, v0, v4

    .line 101
    .line 102
    sget-object v2, Lokhttp3/CipherSuite;->g:Lokhttp3/CipherSuite;

    .line 103
    .line 104
    const/16 v4, 0xd

    .line 105
    .line 106
    aput-object v2, v0, v4

    .line 107
    .line 108
    sget-object v2, Lokhttp3/CipherSuite;->h:Lokhttp3/CipherSuite;

    .line 109
    .line 110
    const/16 v4, 0xe

    .line 111
    .line 112
    aput-object v2, v0, v4

    .line 113
    .line 114
    sget-object v2, Lokhttp3/CipherSuite;->e:Lokhttp3/CipherSuite;

    .line 115
    .line 116
    const/16 v4, 0xf

    .line 117
    .line 118
    aput-object v2, v0, v4

    .line 119
    .line 120
    sget-object v2, Lokhttp3/CipherSuite;->f:Lokhttp3/CipherSuite;

    .line 121
    .line 122
    const/16 v4, 0x10

    .line 123
    .line 124
    aput-object v2, v0, v4

    .line 125
    .line 126
    sget-object v2, Lokhttp3/CipherSuite;->d:Lokhttp3/CipherSuite;

    .line 127
    .line 128
    const/16 v4, 0x11

    .line 129
    .line 130
    aput-object v2, v0, v4

    .line 131
    .line 132
    new-instance v2, Lokhttp3/ConnectionSpec$Builder;

    .line 133
    .line 134
    invoke-direct {v2, v5}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v1}, Lokhttp3/ConnectionSpec$Builder;->b([Lokhttp3/CipherSuite;)V

    .line 138
    .line 139
    .line 140
    new-array v1, v7, [Lokhttp3/TlsVersion;

    .line 141
    .line 142
    sget-object v4, Lokhttp3/TlsVersion;->b:Lokhttp3/TlsVersion;

    .line 143
    .line 144
    aput-object v4, v1, v3

    .line 145
    .line 146
    sget-object v6, Lokhttp3/TlsVersion;->c:Lokhttp3/TlsVersion;

    .line 147
    .line 148
    aput-object v6, v1, v5

    .line 149
    .line 150
    invoke-virtual {v2, v1}, Lokhttp3/ConnectionSpec$Builder;->d([Lokhttp3/TlsVersion;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v1, v2, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 154
    .line 155
    const-string v8, "no TLS extensions for cleartext connections"

    .line 156
    .line 157
    if-eqz v1, :cond_2

    .line 158
    .line 159
    iput-boolean v5, v2, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 160
    .line 161
    new-instance v1, Lokhttp3/ConnectionSpec;

    .line 162
    .line 163
    invoke-direct {v1, v2}, Lokhttp3/ConnectionSpec;-><init>(Lokhttp3/ConnectionSpec$Builder;)V

    .line 164
    .line 165
    .line 166
    new-instance v1, Lokhttp3/ConnectionSpec$Builder;

    .line 167
    .line 168
    invoke-direct {v1, v5}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lokhttp3/ConnectionSpec$Builder;->b([Lokhttp3/CipherSuite;)V

    .line 172
    .line 173
    .line 174
    new-array v2, v11, [Lokhttp3/TlsVersion;

    .line 175
    .line 176
    aput-object v4, v2, v3

    .line 177
    .line 178
    aput-object v6, v2, v5

    .line 179
    .line 180
    sget-object v4, Lokhttp3/TlsVersion;->d:Lokhttp3/TlsVersion;

    .line 181
    .line 182
    aput-object v4, v2, v7

    .line 183
    .line 184
    sget-object v4, Lokhttp3/TlsVersion;->e:Lokhttp3/TlsVersion;

    .line 185
    .line 186
    aput-object v4, v2, v9

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Lokhttp3/ConnectionSpec$Builder;->d([Lokhttp3/TlsVersion;)V

    .line 189
    .line 190
    .line 191
    iget-boolean v2, v1, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 192
    .line 193
    if-eqz v2, :cond_1

    .line 194
    .line 195
    iput-boolean v5, v1, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 196
    .line 197
    new-instance v2, Lokhttp3/ConnectionSpec;

    .line 198
    .line 199
    invoke-direct {v2, v1}, Lokhttp3/ConnectionSpec;-><init>(Lokhttp3/ConnectionSpec$Builder;)V

    .line 200
    .line 201
    .line 202
    sput-object v2, Lokhttp3/ConnectionSpec;->e:Lokhttp3/ConnectionSpec;

    .line 203
    .line 204
    new-instance v1, Lokhttp3/ConnectionSpec$Builder;

    .line 205
    .line 206
    invoke-direct {v1, v5}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v0}, Lokhttp3/ConnectionSpec$Builder;->b([Lokhttp3/CipherSuite;)V

    .line 210
    .line 211
    .line 212
    new-array v0, v5, [Lokhttp3/TlsVersion;

    .line 213
    .line 214
    aput-object v4, v0, v3

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Lokhttp3/ConnectionSpec$Builder;->d([Lokhttp3/TlsVersion;)V

    .line 217
    .line 218
    .line 219
    iget-boolean v0, v1, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 220
    .line 221
    if-eqz v0, :cond_0

    .line 222
    .line 223
    iput-boolean v5, v1, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 224
    .line 225
    new-instance v0, Lokhttp3/ConnectionSpec;

    .line 226
    .line 227
    invoke-direct {v0, v1}, Lokhttp3/ConnectionSpec;-><init>(Lokhttp3/ConnectionSpec$Builder;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 231
    .line 232
    invoke-direct {v0, v3}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Lokhttp3/ConnectionSpec;

    .line 236
    .line 237
    invoke-direct {v1, v0}, Lokhttp3/ConnectionSpec;-><init>(Lokhttp3/ConnectionSpec$Builder;)V

    .line 238
    .line 239
    .line 240
    sput-object v1, Lokhttp3/ConnectionSpec;->f:Lokhttp3/ConnectionSpec;

    .line 241
    .line 242
    return-void

    .line 243
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 256
    .line 257
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0
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

.method public constructor <init>(Lokhttp3/ConnectionSpec$Builder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lokhttp3/ConnectionSpec$Builder;->a:Z

    iput-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    iget-object v0, p1, Lokhttp3/ConnectionSpec$Builder;->b:[Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    iget-object v0, p1, Lokhttp3/ConnectionSpec$Builder;->c:[Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    iget-boolean p1, p1, Lokhttp3/ConnectionSpec$Builder;->d:Z

    iput-boolean p1, p0, Lokhttp3/ConnectionSpec;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v2, Lokhttp3/internal/Util;->o:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lokhttp3/internal/Util;->r(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v2, Lokhttp3/CipherSuite;->b:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v0, p1}, Lokhttp3/internal/Util;->r(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lokhttp3/ConnectionSpec;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lokhttp3/ConnectionSpec;

    iget-boolean v2, p0, Lokhttp3/ConnectionSpec;->a:Z

    iget-boolean v3, p1, Lokhttp3/ConnectionSpec;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    iget-object v3, p1, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    iget-object v3, p1, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lokhttp3/ConnectionSpec;->b:Z

    iget-boolean p1, p1, Lokhttp3/ConnectionSpec;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x20f

    iget-object v1, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lokhttp3/ConnectionSpec;->b:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x11

    :goto_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ConnectionSpec()"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "[all enabled]"

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    new-instance v4, Ljava/util/ArrayList;

    .line 19
    .line 20
    array-length v5, v0

    .line 21
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    array-length v5, v0

    .line 25
    move v6, v1

    .line 26
    :goto_0
    if-ge v6, v5, :cond_1

    .line 27
    .line 28
    aget-object v7, v0, v6

    .line 29
    .line 30
    invoke-static {v7}, Lokhttp3/CipherSuite;->a(Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v0, v2

    .line 46
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v0, v3

    .line 52
    :goto_2
    iget-object v4, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v4, :cond_6

    .line 55
    .line 56
    if-eqz v4, :cond_5

    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    array-length v3, v4

    .line 61
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    array-length v3, v4

    .line 65
    :goto_3
    if-ge v1, v3, :cond_4

    .line 66
    .line 67
    aget-object v5, v4, v1

    .line 68
    .line 69
    invoke-static {v5}, Lokhttp3/TlsVersion;->f(Ljava/lang/String;)Lokhttp3/TlsVersion;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v2, "ConnectionSpec(cipherSuites="

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ", tlsVersions="

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, ", supportsTlsExtensions="

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->b:Z

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ")"

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0
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
