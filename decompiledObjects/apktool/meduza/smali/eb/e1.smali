.class public final Leb/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/e1$c;,
        Leb/e1$b;,
        Leb/e1$a;
    }
.end annotation


# static fields
.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/e1;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Leb/e1;

.field public static final f:Leb/e1;

.field public static final g:Leb/e1;

.field public static final h:Leb/e1;

.field public static final i:Leb/e1;

.field public static final j:Leb/e1;

.field public static final k:Leb/e1;

.field public static final l:Leb/e1;

.field public static final m:Leb/e1;

.field public static final n:Leb/e1;

.field public static final o:Leb/s0$f;

.field public static final p:Leb/s0$f;


# instance fields
.field public final a:Leb/e1$a;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Leb/e1$a;->values()[Leb/e1$a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    const/4 v5, 0x0

    .line 14
    if-ge v4, v2, :cond_1

    .line 15
    .line 16
    aget-object v6, v1, v4

    .line 17
    .line 18
    iget v7, v6, Leb/e1$a;->a:I

    .line 19
    .line 20
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    new-instance v8, Leb/e1;

    .line 25
    .line 26
    invoke-direct {v8, v6, v5, v5}, Leb/e1;-><init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v7, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Leb/e1;

    .line 34
    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "Code value duplication between "

    .line 43
    .line 44
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, v5, Leb/e1;->a:Leb/e1$a;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v2, " & "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, Leb/e1;->d:Ljava/util/List;

    .line 91
    .line 92
    sget-object v0, Leb/e1$a;->c:Leb/e1$a;

    .line 93
    .line 94
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Leb/e1;->e:Leb/e1;

    .line 99
    .line 100
    sget-object v0, Leb/e1$a;->d:Leb/e1$a;

    .line 101
    .line 102
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Leb/e1;->f:Leb/e1;

    .line 107
    .line 108
    sget-object v0, Leb/e1$a;->e:Leb/e1$a;

    .line 109
    .line 110
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sput-object v0, Leb/e1;->g:Leb/e1;

    .line 115
    .line 116
    sget-object v0, Leb/e1$a;->f:Leb/e1$a;

    .line 117
    .line 118
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 119
    .line 120
    .line 121
    sget-object v0, Leb/e1$a;->o:Leb/e1$a;

    .line 122
    .line 123
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Leb/e1;->h:Leb/e1;

    .line 128
    .line 129
    sget-object v0, Leb/e1$a;->p:Leb/e1$a;

    .line 130
    .line 131
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 132
    .line 133
    .line 134
    sget-object v0, Leb/e1$a;->q:Leb/e1$a;

    .line 135
    .line 136
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 137
    .line 138
    .line 139
    sget-object v0, Leb/e1$a;->r:Leb/e1$a;

    .line 140
    .line 141
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Leb/e1;->i:Leb/e1;

    .line 146
    .line 147
    sget-object v0, Leb/e1$a;->A:Leb/e1$a;

    .line 148
    .line 149
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Leb/e1;->j:Leb/e1;

    .line 154
    .line 155
    sget-object v0, Leb/e1$a;->s:Leb/e1$a;

    .line 156
    .line 157
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sput-object v0, Leb/e1;->k:Leb/e1;

    .line 162
    .line 163
    sget-object v0, Leb/e1$a;->t:Leb/e1$a;

    .line 164
    .line 165
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sput-object v0, Leb/e1;->l:Leb/e1;

    .line 170
    .line 171
    sget-object v0, Leb/e1$a;->u:Leb/e1$a;

    .line 172
    .line 173
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 174
    .line 175
    .line 176
    sget-object v0, Leb/e1$a;->v:Leb/e1$a;

    .line 177
    .line 178
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 179
    .line 180
    .line 181
    sget-object v0, Leb/e1$a;->w:Leb/e1$a;

    .line 182
    .line 183
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 184
    .line 185
    .line 186
    sget-object v0, Leb/e1$a;->x:Leb/e1$a;

    .line 187
    .line 188
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sput-object v0, Leb/e1;->m:Leb/e1;

    .line 193
    .line 194
    sget-object v0, Leb/e1$a;->y:Leb/e1$a;

    .line 195
    .line 196
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sput-object v0, Leb/e1;->n:Leb/e1;

    .line 201
    .line 202
    sget-object v0, Leb/e1$a;->z:Leb/e1$a;

    .line 203
    .line 204
    invoke-virtual {v0}, Leb/e1$a;->f()Leb/e1;

    .line 205
    .line 206
    .line 207
    new-instance v0, Leb/e1$b;

    .line 208
    .line 209
    invoke-direct {v0}, Leb/e1$b;-><init>()V

    .line 210
    .line 211
    .line 212
    new-instance v1, Leb/s0$f;

    .line 213
    .line 214
    const-string v2, "grpc-status"

    .line 215
    .line 216
    invoke-direct {v1, v2, v3, v0}, Leb/s0$f;-><init>(Ljava/lang/String;ZLeb/s0$g;)V

    .line 217
    .line 218
    .line 219
    sput-object v1, Leb/e1;->o:Leb/s0$f;

    .line 220
    .line 221
    new-instance v0, Leb/e1$c;

    .line 222
    .line 223
    invoke-direct {v0}, Leb/e1$c;-><init>()V

    .line 224
    .line 225
    .line 226
    new-instance v1, Leb/s0$f;

    .line 227
    .line 228
    const-string v2, "grpc-message"

    .line 229
    .line 230
    invoke-direct {v1, v2, v3, v0}, Leb/s0$f;-><init>(Ljava/lang/String;ZLeb/s0$g;)V

    .line 231
    .line 232
    .line 233
    sput-object v1, Leb/e1;->p:Leb/s0$f;

    .line 234
    .line 235
    return-void
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

.method public constructor <init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "code"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Leb/e1;->a:Leb/e1$a;

    iput-object p2, p0, Leb/e1;->b:Ljava/lang/String;

    iput-object p3, p0, Leb/e1;->c:Ljava/lang/Throwable;

    return-void
.end method

.method public static b(Leb/e1;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Leb/e1;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object p0, p0, Leb/e1;->a:Leb/e1$a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Leb/e1;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(I)Leb/e1;
    .locals 3

    if-ltz p0, :cond_1

    sget-object v0, Leb/e1;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leb/e1;

    return-object p0

    :cond_1
    :goto_0
    sget-object v0, Leb/e1;->g:Leb/e1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Throwable;)Leb/e1;
    .locals 2

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of v1, v0, Leb/f1;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Leb/f1;

    .line 14
    .line 15
    iget-object p0, v0, Leb/f1;->a:Leb/e1;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v1, v0, Leb/g1;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Leb/g1;

    .line 23
    .line 24
    iget-object p0, v0, Leb/g1;->a:Leb/e1;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object v0, Leb/e1;->g:Leb/e1;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
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


# virtual methods
.method public final a(Ljava/lang/String;)Leb/e1;
    .locals 4

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Leb/e1;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Leb/e1;

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    iget-object v2, p0, Leb/e1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Leb/e1;-><init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    new-instance v0, Leb/e1;

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Leb/e1;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Leb/e1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Leb/e1;-><init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final e()Z
    .locals 2

    sget-object v0, Leb/e1$a;->c:Leb/e1$a;

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Throwable;)Leb/e1;
    .locals 3

    iget-object v0, p0, Leb/e1;->c:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Leb/e1;

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    iget-object v2, p0, Leb/e1;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Leb/e1;-><init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Leb/e1;
    .locals 3

    iget-object v0, p0, Leb/e1;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Leb/e1;

    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    iget-object v2, p0, Leb/e1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Leb/e1;-><init>(Leb/e1$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "code"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Leb/e1;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v2, "description"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Leb/e1;->c:Ljava/lang/Throwable;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object v2, Ln7/u;->a:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v2, Ljava/io/StringWriter;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ljava/io/PrintWriter;

    .line 35
    .line 36
    invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_0
    const-string v2, "cause"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
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
