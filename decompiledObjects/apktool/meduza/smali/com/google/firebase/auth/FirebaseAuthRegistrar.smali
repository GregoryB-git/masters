.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/c;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 9

    const-class v0, Lu7/f;

    invoke-interface {p5, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lu7/f;

    const-class v0, La8/a;

    invoke-interface {p5, v0}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    move-result-object v3

    const-class v0, Lq9/e;

    invoke-interface {p5, v0}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    move-result-object v4

    new-instance v0, Lc8/g;

    invoke-interface {p5, p0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p2}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p3}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p5, p4}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ljava/util/concurrent/Executor;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lc8/g;-><init>(Lu7/f;Lt9/b;Lt9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Ly7/a;

    .line 2
    .line 3
    const-class v1, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v3, Ld8/t;

    .line 6
    .line 7
    invoke-direct {v3, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, Ly7/b;

    .line 11
    .line 12
    const-class v1, Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v4, Ld8/t;

    .line 15
    .line 16
    invoke-direct {v4, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    const-class v0, Ly7/c;

    .line 20
    .line 21
    const-class v1, Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    new-instance v5, Ld8/t;

    .line 24
    .line 25
    invoke-direct {v5, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    const-class v0, Ly7/c;

    .line 29
    .line 30
    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v6, Ld8/t;

    .line 33
    .line 34
    invoke-direct {v6, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    const-class v0, Ly7/d;

    .line 38
    .line 39
    const-class v1, Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    new-instance v7, Ld8/t;

    .line 42
    .line 43
    invoke-direct {v7, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    new-array v0, v0, [Ld8/b;

    .line 48
    .line 49
    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 50
    .line 51
    const/4 v8, 0x1

    .line 52
    new-array v2, v8, [Ljava/lang/Class;

    .line 53
    .line 54
    const-class v9, Lc8/b;

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    aput-object v9, v2, v10

    .line 58
    .line 59
    new-instance v9, Ld8/b$a;

    .line 60
    .line 61
    invoke-direct {v9, v1, v2}, Ld8/b$a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    const-class v1, Lu7/f;

    .line 65
    .line 66
    invoke-static {v1}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 71
    .line 72
    .line 73
    const-class v1, Lq9/e;

    .line 74
    .line 75
    new-instance v2, Ld8/k;

    .line 76
    .line 77
    invoke-direct {v2, v8, v8, v1}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Ld8/k;

    .line 84
    .line 85
    invoke-direct {v1, v3, v8, v10}, Ld8/k;-><init>(Ld8/t;II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Ld8/k;

    .line 92
    .line 93
    invoke-direct {v1, v4, v8, v10}, Ld8/k;-><init>(Ld8/t;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Ld8/k;

    .line 100
    .line 101
    invoke-direct {v1, v5, v8, v10}, Ld8/k;-><init>(Ld8/t;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Ld8/k;

    .line 108
    .line 109
    invoke-direct {v1, v6, v8, v10}, Ld8/k;-><init>(Ld8/t;II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 113
    .line 114
    .line 115
    new-instance v1, Ld8/k;

    .line 116
    .line 117
    invoke-direct {v1, v7, v8, v10}, Ld8/k;-><init>(Ld8/t;II)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 121
    .line 122
    .line 123
    const-class v1, La8/a;

    .line 124
    .line 125
    invoke-static {v1}, Ld8/k;->b(Ljava/lang/Class;)Ld8/k;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v9, v1}, Ld8/b$a;->a(Ld8/k;)V

    .line 130
    .line 131
    .line 132
    new-instance v1, Lb8/q0;

    .line 133
    .line 134
    move-object v2, v1

    .line 135
    invoke-direct/range {v2 .. v7}, Lb8/q0;-><init>(Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/t;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, v9, Ld8/b$a;->f:Ld8/e;

    .line 139
    .line 140
    invoke-virtual {v9}, Ld8/b$a;->b()Ld8/b;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    aput-object v1, v0, v10

    .line 145
    .line 146
    new-instance v1, Lb/a0;

    .line 147
    .line 148
    invoke-direct {v1}, Lb/a0;-><init>()V

    .line 149
    .line 150
    .line 151
    const-class v2, Lq9/d;

    .line 152
    .line 153
    invoke-static {v2}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iput v8, v2, Ld8/b$a;->e:I

    .line 158
    .line 159
    new-instance v3, Ld8/a;

    .line 160
    .line 161
    invoke-direct {v3, v1}, Ld8/a;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 165
    .line 166
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    aput-object v1, v0, v8

    .line 171
    .line 172
    const/4 v1, 0x2

    .line 173
    const-string v2, "fire-auth"

    .line 174
    .line 175
    const-string v3, "23.2.0"

    .line 176
    .line 177
    invoke-static {v2, v3}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    aput-object v2, v0, v1

    .line 182
    .line 183
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0
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
