.class public final Lma/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma/t1$b;,
        Lma/t1$c;,
        Lma/t1$d;,
        Lma/t1$e;
    }
.end annotation


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final c:Lma/t1$e;

.field public static final d:Z

.field public static final e:Z

.field public static final f:J

.field public static final g:J

.field public static final h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, [Ljava/lang/Object;

    .line 2
    .line 3
    const-class v1, [D

    .line 4
    .line 5
    const-class v2, [F

    .line 6
    .line 7
    const-class v3, [J

    .line 8
    .line 9
    const-class v4, [I

    .line 10
    .line 11
    const-class v5, [Z

    .line 12
    .line 13
    invoke-static {}, Lma/t1;->q()Lsun/misc/Unsafe;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    sput-object v6, Lma/t1;->a:Lsun/misc/Unsafe;

    .line 18
    .line 19
    sget-object v7, Lma/d;->a:Ljava/lang/Class;

    .line 20
    .line 21
    sput-object v7, Lma/t1;->b:Ljava/lang/Class;

    .line 22
    .line 23
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-static {v7}, Lma/t1;->f(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-static {v8}, Lma/t1;->f(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Lma/d;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_3

    .line 43
    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    new-instance v7, Lma/t1$c;

    .line 47
    .line 48
    invoke-direct {v7, v6}, Lma/t1$c;-><init>(Lsun/misc/Unsafe;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    if-eqz v8, :cond_2

    .line 53
    .line 54
    new-instance v7, Lma/t1$b;

    .line 55
    .line 56
    invoke-direct {v7, v6}, Lma/t1$b;-><init>(Lsun/misc/Unsafe;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    const/4 v7, 0x0

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    new-instance v7, Lma/t1$d;

    .line 63
    .line 64
    invoke-direct {v7, v6}, Lma/t1$d;-><init>(Lsun/misc/Unsafe;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    sput-object v7, Lma/t1;->c:Lma/t1$e;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    if-nez v7, :cond_4

    .line 71
    .line 72
    move v8, v6

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {v7}, Lma/t1$e;->u()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    :goto_2
    sput-boolean v8, Lma/t1;->d:Z

    .line 79
    .line 80
    if-nez v7, :cond_5

    .line 81
    .line 82
    move v8, v6

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-virtual {v7}, Lma/t1$e;->t()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    :goto_3
    sput-boolean v8, Lma/t1;->e:Z

    .line 89
    .line 90
    const-class v8, [B

    .line 91
    .line 92
    invoke-static {v8}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    int-to-long v8, v8

    .line 97
    sput-wide v8, Lma/t1;->f:J

    .line 98
    .line 99
    invoke-static {v5}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 106
    .line 107
    .line 108
    invoke-static {v4}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v3}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 112
    .line 113
    .line 114
    invoke-static {v3}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 118
    .line 119
    .line 120
    invoke-static {v2}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Lma/t1;->c(Ljava/lang/Class;)I

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lma/t1;->d(Ljava/lang/Class;)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lma/t1;->e()Ljava/lang/reflect/Field;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    if-nez v7, :cond_6

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    invoke-virtual {v7, v0}, Lma/t1$e;->l(Ljava/lang/reflect/Field;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    :goto_4
    const-wide/16 v0, -0x1

    .line 150
    .line 151
    :goto_5
    sput-wide v0, Lma/t1;->g:J

    .line 152
    .line 153
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    if-ne v0, v1, :cond_8

    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    :cond_8
    sput-boolean v6, Lma/t1;->h:Z

    .line 163
    .line 164
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 4

    const-class v0, Lma/t1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "platform method missing - proto runtime falling back to safer methods: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lma/t1;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static c(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    sget-boolean v0, Lma/t1;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0}, Lma/t1$e;->a(Ljava/lang/Class;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static d(Ljava/lang/Class;)V
    .locals 1

    sget-boolean v0, Lma/t1;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0}, Lma/t1$e;->b(Ljava/lang/Class;)I

    :cond_0
    return-void
.end method

.method public static e()Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    invoke-static {}, Lma/d;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-class v0, Ljava/nio/Buffer;

    .line 9
    .line 10
    const-string v2, "effectiveDirectAddress"

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-object v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-class v0, Ljava/nio/Buffer;

    .line 22
    .line 23
    const-string v2, "address"

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-object v0, v1

    .line 31
    :goto_1
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    :cond_1
    return-object v1
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
.end method

.method public static f(Ljava/lang/Class;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, [B

    invoke-static {}, Lma/d;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lma/t1;->b:Ljava/lang/Class;

    const-string v3, "peekLong"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    aput-object p0, v5, v2

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeLong"

    const/4 v5, 0x3

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeInt"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekInt"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v6, v8, v7

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByte"

    new-array v6, v4, [Ljava/lang/Class;

    aput-object p0, v6, v2

    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v8, v6, v7

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByte"

    new-array v6, v7, [Ljava/lang/Class;

    aput-object p0, v6, v2

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByteArray"

    const/4 v6, 0x4

    new-array v8, v6, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v0, v8, v7

    aput-object v9, v8, v4

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByteArray"

    new-array v6, v6, [Ljava/lang/Class;

    aput-object p0, v6, v2

    aput-object v0, v6, v7

    aput-object v9, v6, v4

    aput-object v9, v6, v5

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    :catchall_0
    return v2
.end method

.method public static g(Ljava/lang/Object;J)Z
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->d(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static h(J)B
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1}, Lma/t1$e;->e(J)B

    move-result p0

    return p0
.end method

.method public static i([BJ)B
    .locals 3

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    sget-wide v1, Lma/t1;->f:J

    add-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lma/t1$e;->f(Ljava/lang/Object;J)B

    move-result p0

    return p0
.end method

.method public static j(Ljava/lang/Object;J)B
    .locals 2

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, Lma/t1;->n(Ljava/lang/Object;J)I

    move-result p0

    not-long p1, p1

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static k(Ljava/lang/Object;J)B
    .locals 2

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, Lma/t1;->n(Ljava/lang/Object;J)I

    move-result p0

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static l(Ljava/lang/Object;J)D
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->g(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static m(Ljava/lang/Object;J)F
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->h(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static n(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->i(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static o(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->j(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static p(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2}, Lma/t1$e;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static q()Lsun/misc/Unsafe;
    .locals 1

    :try_start_0
    new-instance v0, Lma/t1$a;

    invoke-direct {v0}, Lma/t1$a;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static r(Ljava/lang/Object;JZ)V
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2, p3}, Lma/t1$e;->m(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static s([BJB)V
    .locals 3

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    sget-wide v1, Lma/t1;->f:J

    add-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2, p3}, Lma/t1$e;->n(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static t(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, Lma/t1;->n(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    not-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {p0, p1, v0, v1}, Lma/t1;->x(Ljava/lang/Object;IJ)V

    return-void
.end method

.method public static u(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, Lma/t1;->n(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {p0, p1, v0, v1}, Lma/t1;->x(Ljava/lang/Object;IJ)V

    return-void
.end method

.method public static v(Ljava/lang/Object;JD)V
    .locals 6

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lma/t1$e;->o(Ljava/lang/Object;JD)V

    return-void
.end method

.method public static w(Ljava/lang/Object;JF)V
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2, p3}, Lma/t1$e;->p(Ljava/lang/Object;JF)V

    return-void
.end method

.method public static x(Ljava/lang/Object;IJ)V
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2, p3}, Lma/t1$e;->q(Ljava/lang/Object;IJ)V

    return-void
.end method

.method public static y(Ljava/lang/Object;JJ)V
    .locals 6

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lma/t1$e;->r(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public static z(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Lma/t1;->c:Lma/t1$e;

    invoke-virtual {v0, p0, p1, p2, p3}, Lma/t1$e;->s(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
