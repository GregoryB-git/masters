.class public final Leb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/c$b;,
        Leb/c$a;
    }
.end annotation


# static fields
.field public static final k:Leb/c;


# instance fields
.field public final a:Leb/q;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/String;

.field public final d:Leb/b;

.field public final e:Ljava/lang/String;

.field public final f:[[Ljava/lang/Object;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/h$a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/Integer;

.field public final j:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Leb/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Leb/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    new-array v1, v1, [I

    .line 8
    .line 9
    fill-array-data v1, :array_0

    .line 10
    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [[Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v1, v0, Leb/c$a;->f:[[Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Leb/c$a;->g:Ljava/util/List;

    .line 27
    .line 28
    new-instance v1, Leb/c;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Leb/c;-><init>(Leb/c$a;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Leb/c;->k:Leb/c;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :array_0
    .array-data 4
        0x0
        0x2
    .end array-data
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
.end method

.method public constructor <init>(Leb/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Leb/c$a;->a:Leb/q;

    iput-object v0, p0, Leb/c;->a:Leb/q;

    iget-object v0, p1, Leb/c$a;->b:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Leb/c;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p1, Leb/c$a;->c:Ljava/lang/String;

    iput-object v0, p0, Leb/c;->c:Ljava/lang/String;

    iget-object v0, p1, Leb/c$a;->d:Leb/b;

    iput-object v0, p0, Leb/c;->d:Leb/b;

    iget-object v0, p1, Leb/c$a;->e:Ljava/lang/String;

    iput-object v0, p0, Leb/c;->e:Ljava/lang/String;

    iget-object v0, p1, Leb/c$a;->f:[[Ljava/lang/Object;

    iput-object v0, p0, Leb/c;->f:[[Ljava/lang/Object;

    iget-object v0, p1, Leb/c$a;->g:Ljava/util/List;

    iput-object v0, p0, Leb/c;->g:Ljava/util/List;

    iget-object v0, p1, Leb/c$a;->h:Ljava/lang/Boolean;

    iput-object v0, p0, Leb/c;->h:Ljava/lang/Boolean;

    iget-object v0, p1, Leb/c$a;->i:Ljava/lang/Integer;

    iput-object v0, p0, Leb/c;->i:Ljava/lang/Integer;

    iget-object p1, p1, Leb/c$a;->j:Ljava/lang/Integer;

    iput-object p1, p0, Leb/c;->j:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Leb/c;)Leb/c$a;
    .locals 2

    new-instance v0, Leb/c$a;

    invoke-direct {v0}, Leb/c$a;-><init>()V

    iget-object v1, p0, Leb/c;->a:Leb/q;

    iput-object v1, v0, Leb/c$a;->a:Leb/q;

    iget-object v1, p0, Leb/c;->b:Ljava/util/concurrent/Executor;

    iput-object v1, v0, Leb/c$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Leb/c;->c:Ljava/lang/String;

    iput-object v1, v0, Leb/c$a;->c:Ljava/lang/String;

    iget-object v1, p0, Leb/c;->d:Leb/b;

    iput-object v1, v0, Leb/c$a;->d:Leb/b;

    iget-object v1, p0, Leb/c;->e:Ljava/lang/String;

    iput-object v1, v0, Leb/c$a;->e:Ljava/lang/String;

    iget-object v1, p0, Leb/c;->f:[[Ljava/lang/Object;

    iput-object v1, v0, Leb/c$a;->f:[[Ljava/lang/Object;

    iget-object v1, p0, Leb/c;->g:Ljava/util/List;

    iput-object v1, v0, Leb/c$a;->g:Ljava/util/List;

    iget-object v1, p0, Leb/c;->h:Ljava/lang/Boolean;

    iput-object v1, v0, Leb/c$a;->h:Ljava/lang/Boolean;

    iget-object v1, p0, Leb/c;->i:Ljava/lang/Integer;

    iput-object v1, v0, Leb/c$a;->i:Ljava/lang/Integer;

    iget-object p0, p0, Leb/c;->j:Ljava/lang/Integer;

    iput-object p0, v0, Leb/c$a;->j:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final a(Leb/c$b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/c$b<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Leb/c;->f:[[Ljava/lang/Object;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    aget-object v2, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Leb/c;->f:[[Ljava/lang/Object;

    aget-object p1, p1, v1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Leb/c$b;Ljava/lang/Object;)Leb/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/c$b<",
            "TT;>;TT;)",
            "Leb/c;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Leb/c;->b(Leb/c;)Leb/c$a;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Leb/c;->f:[[Ljava/lang/Object;

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    aget-object v3, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_1
    iget-object v3, p0, Leb/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    const/4 v4, 0x1

    if-ne v2, v5, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v1

    :goto_2
    add-int/2addr v3, v6

    const/4 v6, 0x2

    new-array v7, v6, [I

    aput v6, v7, v4

    aput v3, v7, v1

    const-class v3, Ljava/lang/Object;

    invoke-static {v3, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Ljava/lang/Object;

    iput-object v3, v0, Leb/c$a;->f:[[Ljava/lang/Object;

    iget-object v7, p0, Leb/c;->f:[[Ljava/lang/Object;

    array-length v8, v7

    invoke-static {v7, v1, v3, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ne v2, v5, :cond_3

    iget-object v2, v0, Leb/c$a;->f:[[Ljava/lang/Object;

    iget-object v3, p0, Leb/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v2, v3

    goto :goto_3

    :cond_3
    iget-object v3, v0, Leb/c$a;->f:[[Ljava/lang/Object;

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v3, v2

    :goto_3
    new-instance p1, Leb/c;

    invoke-direct {p1, v0}, Leb/c;-><init>(Leb/c$a;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Leb/c;->a:Leb/q;

    .line 6
    .line 7
    const-string v2, "deadline"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Leb/c;->c:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, "authority"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Leb/c;->d:Leb/b;

    .line 20
    .line 21
    const-string v2, "callCredentials"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Leb/c;->b:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    const-string v2, "executor"

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Leb/c;->e:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "compressorName"

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Leb/c;->f:[[Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "customOptions"

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    iget-object v2, p0, Leb/c;->h:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const-string v2, "waitForReady"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Ln7/g$a;->c(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Leb/c;->i:Ljava/lang/Integer;

    .line 73
    .line 74
    const-string v2, "maxInboundMessageSize"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Leb/c;->j:Ljava/lang/Integer;

    .line 80
    .line 81
    const-string v2, "maxOutboundMessageSize"

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Leb/c;->g:Ljava/util/List;

    .line 87
    .line 88
    const-string v2, "streamTracerFactories"

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
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
