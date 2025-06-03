.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final a:Ld8/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/o<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ld8/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/o<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ld8/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/o<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ld8/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/o<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld8/o;

    new-instance v1, Le8/h;

    invoke-direct {v1}, Le8/h;-><init>()V

    invoke-direct {v0, v1}, Ld8/o;-><init>(Lt9/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Ld8/o;

    new-instance v0, Ld8/o;

    new-instance v1, Le8/i;

    invoke-direct {v1}, Le8/i;-><init>()V

    invoke-direct {v0, v1}, Ld8/o;-><init>(Lt9/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Ld8/o;

    new-instance v0, Ld8/o;

    new-instance v1, Ld8/g;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ld8/g;-><init>(I)V

    invoke-direct {v0, v1}, Ld8/o;-><init>(Lt9/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Ld8/o;

    new-instance v0, Ld8/o;

    new-instance v1, Ld8/r;

    invoke-direct {v1, v2}, Ld8/r;-><init>(I)V

    invoke-direct {v0, v1}, Ld8/o;-><init>(Lt9/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Ld8/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/concurrent/ExecutorService;)Le8/f;
    .locals 2

    new-instance v0, Le8/f;

    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Ld8/o;

    invoke-virtual {v1}, Ld8/o;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0, v1}, Le8/f;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Ld8/b;

    .line 3
    .line 4
    const-class v1, Ly7/a;

    .line 5
    .line 6
    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    new-instance v3, Ld8/t;

    .line 9
    .line 10
    invoke-direct {v3, v1, v2}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    new-array v2, v1, [Ld8/t;

    .line 15
    .line 16
    const-class v4, Ly7/a;

    .line 17
    .line 18
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance v6, Ld8/t;

    .line 21
    .line 22
    invoke-direct {v6, v4, v5}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aput-object v6, v2, v4

    .line 27
    .line 28
    const-class v5, Ly7/a;

    .line 29
    .line 30
    const-class v6, Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    new-instance v7, Ld8/t;

    .line 33
    .line 34
    invoke-direct {v7, v5, v6}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    aput-object v7, v2, v5

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    new-instance v6, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v7, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    new-instance v15, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    array-length v3, v2

    .line 61
    move v8, v13

    .line 62
    :goto_0
    const-string v14, "Null interface"

    .line 63
    .line 64
    if-ge v8, v3, :cond_1

    .line 65
    .line 66
    aget-object v10, v2, v8

    .line 67
    .line 68
    if-eqz v10, :cond_0

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 74
    .line 75
    invoke-direct {v0, v14}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    invoke-static {v6, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    new-instance v2, Ld9/p;

    .line 83
    .line 84
    invoke-direct {v2, v4}, Ld9/p;-><init>(I)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Ld8/b;

    .line 88
    .line 89
    new-instance v10, Ljava/util/HashSet;

    .line 90
    .line 91
    invoke-direct {v10, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    new-instance v11, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v11, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 97
    .line 98
    .line 99
    move-object v8, v3

    .line 100
    move v12, v13

    .line 101
    move-object v6, v14

    .line 102
    move-object v14, v2

    .line 103
    invoke-direct/range {v8 .. v15}, Ld8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILd8/e;Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    aput-object v3, v0, v4

    .line 107
    .line 108
    const-class v2, Ly7/b;

    .line 109
    .line 110
    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    new-instance v7, Ld8/t;

    .line 113
    .line 114
    invoke-direct {v7, v2, v3}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 115
    .line 116
    .line 117
    new-array v2, v1, [Ld8/t;

    .line 118
    .line 119
    const-class v3, Ly7/b;

    .line 120
    .line 121
    const-class v8, Ljava/util/concurrent/ExecutorService;

    .line 122
    .line 123
    new-instance v9, Ld8/t;

    .line 124
    .line 125
    invoke-direct {v9, v3, v8}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 126
    .line 127
    .line 128
    aput-object v9, v2, v4

    .line 129
    .line 130
    const-class v3, Ly7/b;

    .line 131
    .line 132
    const-class v8, Ljava/util/concurrent/Executor;

    .line 133
    .line 134
    new-instance v9, Ld8/t;

    .line 135
    .line 136
    invoke-direct {v9, v3, v8}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    aput-object v9, v2, v5

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    new-instance v3, Ljava/util/HashSet;

    .line 143
    .line 144
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v8, Ljava/util/HashSet;

    .line 148
    .line 149
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 150
    .line 151
    .line 152
    const/4 v15, 0x0

    .line 153
    new-instance v17, Ljava/util/HashSet;

    .line 154
    .line 155
    invoke-direct/range {v17 .. v17}, Ljava/util/HashSet;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    array-length v7, v2

    .line 162
    move v9, v15

    .line 163
    :goto_1
    if-ge v9, v7, :cond_3

    .line 164
    .line 165
    aget-object v10, v2, v9

    .line 166
    .line 167
    if-eqz v10, :cond_2

    .line 168
    .line 169
    add-int/lit8 v9, v9, 0x1

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 173
    .line 174
    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_3
    invoke-static {v3, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance v2, Ld9/q;

    .line 182
    .line 183
    invoke-direct {v2, v4}, Ld9/q;-><init>(I)V

    .line 184
    .line 185
    .line 186
    new-instance v7, Ld8/b;

    .line 187
    .line 188
    new-instance v12, Ljava/util/HashSet;

    .line 189
    .line 190
    invoke-direct {v12, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 191
    .line 192
    .line 193
    new-instance v13, Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-direct {v13, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 196
    .line 197
    .line 198
    move-object v10, v7

    .line 199
    move v14, v15

    .line 200
    move-object/from16 v16, v2

    .line 201
    .line 202
    invoke-direct/range {v10 .. v17}, Ld8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILd8/e;Ljava/util/Set;)V

    .line 203
    .line 204
    .line 205
    aput-object v7, v0, v5

    .line 206
    .line 207
    const-class v2, Ly7/c;

    .line 208
    .line 209
    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 210
    .line 211
    new-instance v7, Ld8/t;

    .line 212
    .line 213
    invoke-direct {v7, v2, v3}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 214
    .line 215
    .line 216
    new-array v2, v1, [Ld8/t;

    .line 217
    .line 218
    const-class v3, Ly7/c;

    .line 219
    .line 220
    const-class v8, Ljava/util/concurrent/ExecutorService;

    .line 221
    .line 222
    new-instance v9, Ld8/t;

    .line 223
    .line 224
    invoke-direct {v9, v3, v8}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 225
    .line 226
    .line 227
    aput-object v9, v2, v4

    .line 228
    .line 229
    const-class v3, Ly7/c;

    .line 230
    .line 231
    const-class v8, Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    new-instance v9, Ld8/t;

    .line 234
    .line 235
    invoke-direct {v9, v3, v8}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 236
    .line 237
    .line 238
    aput-object v9, v2, v5

    .line 239
    .line 240
    const/4 v11, 0x0

    .line 241
    new-instance v3, Ljava/util/HashSet;

    .line 242
    .line 243
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 244
    .line 245
    .line 246
    new-instance v5, Ljava/util/HashSet;

    .line 247
    .line 248
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 249
    .line 250
    .line 251
    const/4 v15, 0x0

    .line 252
    new-instance v17, Ljava/util/HashSet;

    .line 253
    .line 254
    invoke-direct/range {v17 .. v17}, Ljava/util/HashSet;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    array-length v7, v2

    .line 261
    move v8, v15

    .line 262
    :goto_2
    if-ge v8, v7, :cond_5

    .line 263
    .line 264
    aget-object v9, v2, v8

    .line 265
    .line 266
    if-eqz v9, :cond_4

    .line 267
    .line 268
    add-int/lit8 v8, v8, 0x1

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 272
    .line 273
    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v0

    .line 277
    :cond_5
    invoke-static {v3, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    new-instance v2, Ld9/r;

    .line 281
    .line 282
    invoke-direct {v2, v4}, Ld9/r;-><init>(I)V

    .line 283
    .line 284
    .line 285
    new-instance v6, Ld8/b;

    .line 286
    .line 287
    new-instance v12, Ljava/util/HashSet;

    .line 288
    .line 289
    invoke-direct {v12, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 290
    .line 291
    .line 292
    new-instance v13, Ljava/util/HashSet;

    .line 293
    .line 294
    invoke-direct {v13, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 295
    .line 296
    .line 297
    move-object v10, v6

    .line 298
    move v14, v15

    .line 299
    move-object/from16 v16, v2

    .line 300
    .line 301
    invoke-direct/range {v10 .. v17}, Ld8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILd8/e;Ljava/util/Set;)V

    .line 302
    .line 303
    .line 304
    aput-object v6, v0, v1

    .line 305
    .line 306
    const/4 v1, 0x3

    .line 307
    const-class v2, Ly7/d;

    .line 308
    .line 309
    const-class v3, Ljava/util/concurrent/Executor;

    .line 310
    .line 311
    new-instance v5, Ld8/t;

    .line 312
    .line 313
    invoke-direct {v5, v2, v3}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v5}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    new-instance v3, Le0/d;

    .line 321
    .line 322
    invoke-direct {v3, v4}, Le0/d;-><init>(I)V

    .line 323
    .line 324
    .line 325
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 326
    .line 327
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    aput-object v2, v0, v1

    .line 332
    .line 333
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0
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
