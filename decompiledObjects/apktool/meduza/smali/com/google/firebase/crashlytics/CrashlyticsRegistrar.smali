.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lfa/b$a;->a:Lfa/b$a;

    .line 2
    .line 3
    sget-object v1, Lfa/a;->b:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Dependency "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, " already added."

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v2, Lfa/a$a;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    new-instance v4, Lvc/d;

    .line 31
    .line 32
    invoke-direct {v4, v3}, Lvc/d;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v4}, Lfa/a$a;-><init>(Lvc/d;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "Dependency to "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, " added."

    .line 55
    .line 56
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "SessionsDependencies"

    .line 64
    .line 65
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Ly7/a;

    .line 5
    .line 6
    const-class v1, Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, Ld8/t;

    .line 9
    .line 10
    invoke-direct {v2, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iput-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ld8/t;

    .line 14
    .line 15
    const-class v0, Ly7/b;

    .line 16
    .line 17
    const-class v1, Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    new-instance v2, Ld8/t;

    .line 20
    .line 21
    invoke-direct {v2, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ld8/t;

    .line 25
    .line 26
    const-class v0, Ly7/c;

    .line 27
    .line 28
    const-class v1, Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    new-instance v2, Ld8/t;

    .line 31
    .line 32
    invoke-direct {v2, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ld8/t;

    .line 36
    .line 37
    return-void
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ld8/b;

    .line 3
    .line 4
    const-class v2, Lf8/c;

    .line 5
    .line 6
    invoke-static {v2}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "fire-cls"

    .line 11
    .line 12
    iput-object v3, v2, Ld8/b$a;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-class v4, Lu7/f;

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
    const-class v4, Lu9/d;

    .line 24
    .line 25
    invoke-static {v4}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ld8/t;

    .line 33
    .line 34
    invoke-static {v4}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ld8/t;

    .line 42
    .line 43
    invoke-static {v4}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ld8/t;

    .line 51
    .line 52
    invoke-static {v4}, Ld8/k;->c(Ld8/t;)Ld8/k;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 57
    .line 58
    .line 59
    const-class v4, Lg8/a;

    .line 60
    .line 61
    invoke-static {v4}, Ld8/k;->a(Ljava/lang/Class;)Ld8/k;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 66
    .line 67
    .line 68
    const-class v4, Lw7/a;

    .line 69
    .line 70
    invoke-static {v4}, Ld8/k;->a(Ljava/lang/Class;)Ld8/k;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 75
    .line 76
    .line 77
    const-class v4, Lda/a;

    .line 78
    .line 79
    invoke-static {v4}, Ld8/k;->a(Ljava/lang/Class;)Ld8/k;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v2, v4}, Ld8/b$a;->a(Ld8/k;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Ld;

    .line 87
    .line 88
    const/4 v5, 0x1

    .line 89
    invoke-direct {v4, p0, v5}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    iput-object v4, v2, Ld8/b$a;->f:Ld8/e;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ld8/b$a;->c(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/4 v2, 0x0

    .line 102
    aput-object v0, v1, v2

    .line 103
    .line 104
    const-string v0, "19.4.0"

    .line 105
    .line 106
    invoke-static {v3, v0}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    aput-object v0, v1, v5

    .line 111
    .line 112
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

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
