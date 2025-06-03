.class public Lcom/google/firebase/FirebaseCommonRegistrar;
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

.method public static synthetic a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x20

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lca/f;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lca/d;

    .line 13
    .line 14
    new-instance v4, Ld8/k;

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct {v4, v5, v6, v3}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ld9/p;

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-direct {v3, v4}, Ld9/p;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 31
    .line 32
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    const-class v2, Ly7/a;

    .line 40
    .line 41
    const-class v3, Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    new-instance v4, Ld8/t;

    .line 44
    .line 45
    invoke-direct {v4, v2, v3}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    const-class v2, Lq9/c;

    .line 49
    .line 50
    new-array v3, v5, [Ljava/lang/Class;

    .line 51
    .line 52
    const-class v7, Lq9/e;

    .line 53
    .line 54
    aput-object v7, v3, v6

    .line 55
    .line 56
    const-class v7, Lq9/f;

    .line 57
    .line 58
    const/4 v8, 0x1

    .line 59
    aput-object v7, v3, v8

    .line 60
    .line 61
    new-instance v7, Ld8/b$a;

    .line 62
    .line 63
    invoke-direct {v7, v2, v3}, Ld8/b$a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    const-class v2, Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v2}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v7, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 73
    .line 74
    .line 75
    const-class v2, Lu7/f;

    .line 76
    .line 77
    invoke-static {v2}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v7, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 82
    .line 83
    .line 84
    const-class v2, Lq9/d;

    .line 85
    .line 86
    new-instance v3, Ld8/k;

    .line 87
    .line 88
    invoke-direct {v3, v5, v6, v2}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 92
    .line 93
    .line 94
    new-instance v2, Ld8/k;

    .line 95
    .line 96
    invoke-direct {v2, v8, v8, v0}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v2}, Ld8/b$a;->a(Ld8/k;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ld8/k;

    .line 103
    .line 104
    invoke-direct {v0, v4, v8, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, v0}, Ld8/b$a;->a(Ld8/k;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Ld;

    .line 111
    .line 112
    invoke-direct {v0, v4, v5}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    iput-object v0, v7, Ld8/b$a;->f:Ld8/e;

    .line 116
    .line 117
    invoke-virtual {v7}, Ld8/b$a;->b()Ld8/b;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v2, "fire-android"

    .line 131
    .line 132
    invoke-static {v2, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    const-string v0, "fire-core"

    .line 140
    .line 141
    const-string v2, "21.0.0"

    .line 142
    .line 143
    invoke-static {v0, v2}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v2, "device-name"

    .line 157
    .line 158
    invoke-static {v2, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-string v2, "device-model"

    .line 172
    .line 173
    invoke-static {v2, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v2, "device-brand"

    .line 187
    .line 188
    invoke-static {v2, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v0, Lr3/j;

    .line 196
    .line 197
    const/16 v2, 0xe

    .line 198
    .line 199
    invoke-direct {v0, v2}, Lr3/j;-><init>(I)V

    .line 200
    .line 201
    .line 202
    const-string v3, "android-target-sdk"

    .line 203
    .line 204
    invoke-static {v3, v0}, Lca/e;->b(Ljava/lang/String;Lca/e$a;)Ld8/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    new-instance v0, Le0/d;

    .line 212
    .line 213
    const/16 v3, 0x14

    .line 214
    .line 215
    invoke-direct {v0, v3}, Le0/d;-><init>(I)V

    .line 216
    .line 217
    .line 218
    const-string v3, "android-min-sdk"

    .line 219
    .line 220
    invoke-static {v3, v0}, Lca/e;->b(Ljava/lang/String;Lca/e$a;)Ld8/b;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    new-instance v0, Le0/e;

    .line 228
    .line 229
    const/16 v3, 0x13

    .line 230
    .line 231
    invoke-direct {v0, v3}, Le0/e;-><init>(I)V

    .line 232
    .line 233
    .line 234
    const-string v3, "android-platform"

    .line 235
    .line 236
    invoke-static {v3, v0}, Lca/e;->b(Ljava/lang/String;Lca/e$a;)Ld8/b;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    new-instance v0, Lw3/v;

    .line 244
    .line 245
    invoke-direct {v0, v2}, Lw3/v;-><init>(I)V

    .line 246
    .line 247
    .line 248
    const-string v2, "android-installer"

    .line 249
    .line 250
    invoke-static {v2, v0}, Lca/e;->b(Ljava/lang/String;Lca/e$a;)Ld8/b;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    :try_start_0
    sget-object v0, Lrb/b;->e:Lrb/b;

    .line 258
    .line 259
    invoke-virtual {v0}, Lrb/b;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    goto :goto_0

    .line 264
    :catch_0
    const/4 v0, 0x0

    .line 265
    :goto_0
    if-eqz v0, :cond_0

    .line 266
    .line 267
    const-string v2, "kotlin"

    .line 268
    .line 269
    invoke-static {v2, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    :cond_0
    return-object v1
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
