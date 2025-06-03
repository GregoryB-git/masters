.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld8/u;)Lh3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(Ld8/c;)Lh3/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ld8/u;)Lh3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Ld8/c;)Lh3/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ld8/u;)Lh3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(Ld8/c;)Lh3/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ld8/c;)Lh3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lk3/w;->b(Landroid/content/Context;)V

    invoke-static {}, Lk3/w;->a()Lk3/w;

    move-result-object p0

    sget-object v0, Li3/a;->f:Li3/a;

    invoke-virtual {p0, v0}, Lk3/w;->c(Li3/a;)Lk3/t;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(Ld8/c;)Lh3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lk3/w;->b(Landroid/content/Context;)V

    invoke-static {}, Lk3/w;->a()Lk3/w;

    move-result-object p0

    sget-object v0, Li3/a;->f:Li3/a;

    invoke-virtual {p0, v0}, Lk3/w;->c(Li3/a;)Lk3/t;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(Ld8/c;)Lh3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lk3/w;->b(Landroid/content/Context;)V

    invoke-static {}, Lk3/w;->a()Lk3/w;

    move-result-object p0

    sget-object v0, Li3/a;->e:Li3/a;

    invoke-virtual {p0, v0}, Lk3/w;->c(Li3/a;)Lk3/t;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lh3/i;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v1, v1, [Ld8/b;

    .line 5
    .line 6
    invoke-static {v0}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "fire-transport"

    .line 11
    .line 12
    iput-object v3, v2, Ld8/b$a;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-class v4, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Ld9/p;

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-direct {v4, v5}, Ld9/p;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v4, v2, Ld8/b$a;->f:Ld8/e;

    .line 30
    .line 31
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v4, 0x0

    .line 36
    aput-object v2, v1, v4

    .line 37
    .line 38
    const-class v2, Lu8/a;

    .line 39
    .line 40
    new-instance v4, Ld8/t;

    .line 41
    .line 42
    invoke-direct {v4, v2, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-class v4, Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Ld9/q;

    .line 59
    .line 60
    invoke-direct {v4, v5}, Ld9/q;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v4, v2, Ld8/b$a;->f:Ld8/e;

    .line 64
    .line 65
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    aput-object v2, v1, v5

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    const-class v4, Lu8/b;

    .line 73
    .line 74
    new-instance v6, Ld8/t;

    .line 75
    .line 76
    invoke-direct {v6, v4, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v6}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-class v4, Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v0, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Ld9/r;

    .line 93
    .line 94
    invoke-direct {v4, v5}, Ld9/r;-><init>(I)V

    .line 95
    .line 96
    .line 97
    iput-object v4, v0, Ld8/b$a;->f:Ld8/e;

    .line 98
    .line 99
    invoke-virtual {v0}, Ld8/b$a;->b()Ld8/b;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    aput-object v0, v1, v2

    .line 104
    .line 105
    const/4 v0, 0x3

    .line 106
    const-string v2, "19.0.0"

    .line 107
    .line 108
    invoke-static {v3, v2}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    aput-object v2, v1, v0

    .line 113
    .line 114
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
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
