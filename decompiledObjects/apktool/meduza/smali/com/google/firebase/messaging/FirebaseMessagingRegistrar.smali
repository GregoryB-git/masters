.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld8/t;Ld8/u;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Ld8/t;Ld8/c;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ld8/t;Ld8/c;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, Lu7/f;

    invoke-interface {p1, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lu7/f;

    const-class v0, Ls9/a;

    invoke-interface {p1, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ls9/a;

    const-class v0, Lca/f;

    invoke-interface {p1, v0}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    move-result-object v3

    const-class v0, Lq9/f;

    invoke-interface {p1, v0}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    move-result-object v4

    const-class v0, Lu9/d;

    invoke-interface {p1, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lu9/d;

    invoke-interface {p1, p0}, Ld8/c;->c(Ld8/t;)Lt9/b;

    move-result-object v6

    const-class p0, Lc9/d;

    invoke-interface {p1, p0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lc9/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lu7/f;Ls9/a;Lt9/b;Lt9/b;Lu9/d;Lt9/b;Lc9/d;)V

    return-object v8
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
    const-class v0, Lu8/b;

    .line 2
    .line 3
    const-class v1, Lh3/i;

    .line 4
    .line 5
    new-instance v2, Ld8/t;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Ld8/b;

    .line 12
    .line 13
    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 14
    .line 15
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v3, "fire-fcm"

    .line 20
    .line 21
    iput-object v3, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 22
    .line 23
    const-class v4, Lu7/f;

    .line 24
    .line 25
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 30
    .line 31
    .line 32
    const-class v4, Ls9/a;

    .line 33
    .line 34
    new-instance v5, Ld8/k;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-direct {v5, v6, v6, v4}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 41
    .line 42
    .line 43
    const-class v4, Lca/f;

    .line 44
    .line 45
    invoke-static {v4}, Ld8/k;->b(Ljava/lang/Class;)Ld8/k;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 50
    .line 51
    .line 52
    const-class v4, Lq9/f;

    .line 53
    .line 54
    invoke-static {v4}, Ld8/k;->b(Ljava/lang/Class;)Ld8/k;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 59
    .line 60
    .line 61
    const-class v4, Lu9/d;

    .line 62
    .line 63
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 68
    .line 69
    .line 70
    new-instance v4, Ld8/k;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    invoke-direct {v4, v2, v6, v5}, Ld8/k;-><init>(Ld8/t;II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 77
    .line 78
    .line 79
    const-class v4, Lc9/d;

    .line 80
    .line 81
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v1, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 86
    .line 87
    .line 88
    new-instance v4, Laa/n;

    .line 89
    .line 90
    invoke-direct {v4, v2}, Laa/n;-><init>(Ld8/t;)V

    .line 91
    .line 92
    .line 93
    iput-object v4, v1, Ld8/b$a;->f:Ld8/e;

    .line 94
    .line 95
    invoke-virtual {v1, v5}, Ld8/b$a;->c(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    aput-object v1, v0, v6

    .line 103
    .line 104
    const-string v1, "24.1.0"

    .line 105
    .line 106
    invoke-static {v3, v1}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    aput-object v1, v0, v5

    .line 111
    .line 112
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0
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
