.class public final Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;
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


# virtual methods
.method public getComponents()Ljava/util/List;
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
    const-class v0, Lnc/a0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v1, v1, [Ld8/b;

    .line 5
    .line 6
    const-class v2, Ly7/a;

    .line 7
    .line 8
    new-instance v3, Ld8/t;

    .line 9
    .line 10
    invoke-direct {v3, v2, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v3}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Ly7/a;

    .line 18
    .line 19
    const-class v4, Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    new-instance v5, Ld8/t;

    .line 22
    .line 23
    invoke-direct {v5, v3, v4}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ld8/k;

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-direct {v3, v5, v4, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 34
    .line 35
    .line 36
    sget-object v3, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$a;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$a;

    .line 37
    .line 38
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 39
    .line 40
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    aput-object v2, v1, v6

    .line 45
    .line 46
    const-class v2, Ly7/c;

    .line 47
    .line 48
    new-instance v3, Ld8/t;

    .line 49
    .line 50
    invoke-direct {v3, v2, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-class v3, Ly7/c;

    .line 58
    .line 59
    const-class v5, Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    new-instance v7, Ld8/t;

    .line 62
    .line 63
    invoke-direct {v7, v3, v5}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Ld8/k;

    .line 67
    .line 68
    invoke-direct {v3, v7, v4, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 72
    .line 73
    .line 74
    sget-object v3, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$b;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$b;

    .line 75
    .line 76
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 77
    .line 78
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    aput-object v2, v1, v4

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const-class v3, Ly7/b;

    .line 86
    .line 87
    new-instance v5, Ld8/t;

    .line 88
    .line 89
    invoke-direct {v5, v3, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v5}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-class v5, Ly7/b;

    .line 97
    .line 98
    const-class v7, Ljava/util/concurrent/Executor;

    .line 99
    .line 100
    new-instance v8, Ld8/t;

    .line 101
    .line 102
    invoke-direct {v8, v5, v7}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    new-instance v5, Ld8/k;

    .line 106
    .line 107
    invoke-direct {v5, v8, v4, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 111
    .line 112
    .line 113
    sget-object v5, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$c;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$c;

    .line 114
    .line 115
    iput-object v5, v3, Ld8/b$a;->f:Ld8/e;

    .line 116
    .line 117
    invoke-virtual {v3}, Ld8/b$a;->b()Ld8/b;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    aput-object v3, v1, v2

    .line 122
    .line 123
    const/4 v2, 0x3

    .line 124
    const-class v3, Ly7/d;

    .line 125
    .line 126
    new-instance v5, Ld8/t;

    .line 127
    .line 128
    invoke-direct {v5, v3, v0}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v5}, Ld8/b;->a(Ld8/t;)Ld8/b$a;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-class v3, Ly7/d;

    .line 136
    .line 137
    const-class v5, Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    new-instance v7, Ld8/t;

    .line 140
    .line 141
    invoke-direct {v7, v3, v5}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 142
    .line 143
    .line 144
    new-instance v3, Ld8/k;

    .line 145
    .line 146
    invoke-direct {v3, v7, v4, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 150
    .line 151
    .line 152
    sget-object v3, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$d;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$d;

    .line 153
    .line 154
    iput-object v3, v0, Ld8/b$a;->f:Ld8/e;

    .line 155
    .line 156
    invoke-virtual {v0}, Ld8/b$a;->b()Ld8/b;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    aput-object v0, v1, v2

    .line 161
    .line 162
    invoke-static {v1}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0
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
