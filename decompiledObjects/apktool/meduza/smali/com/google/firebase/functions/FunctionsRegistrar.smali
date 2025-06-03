.class public final Lcom/google/firebase/functions/FunctionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/functions/FunctionsRegistrar$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/functions/FunctionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fn"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/functions/FunctionsRegistrar$a;

    invoke-direct {v0}, Lcom/google/firebase/functions/FunctionsRegistrar$a;-><init>()V

    sput-object v0, Lcom/google/firebase/functions/FunctionsRegistrar;->Companion:Lcom/google/firebase/functions/FunctionsRegistrar$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld8/t;Ld8/t;Ld8/u;)Lo9/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/functions/FunctionsRegistrar;->getComponents$lambda$0(Ld8/t;Ld8/t;Ld8/c;)Lo9/i;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(Ld8/t;Ld8/t;Ld8/c;)Lo9/i;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-class v3, Lu7/j;

    .line 8
    .line 9
    const-string v4, "$liteExecutor"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "$uiExecutor"

    .line 15
    .line 16
    invoke-static {v1, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "c"

    .line 20
    .line 21
    invoke-static {v2, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-class v4, Landroid/content/Context;

    .line 25
    .line 26
    invoke-interface {v2, v4}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "c.get(Context::class.java)"

    .line 31
    .line 32
    invoke-static {v4, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v4, Landroid/content/Context;

    .line 36
    .line 37
    invoke-interface {v2, v3}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v5, "c.get(FirebaseOptions::class.java)"

    .line 42
    .line 43
    invoke-static {v3, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v3, Lu7/j;

    .line 47
    .line 48
    invoke-interface {v2, v0}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v5, "c.get(liteExecutor)"

    .line 53
    .line 54
    invoke-static {v0, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    invoke-interface {v2, v1}, Ld8/c;->e(Ld8/t;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v5, "c.get(uiExecutor)"

    .line 64
    .line 65
    invoke-static {v1, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    const-class v5, Lc8/b;

    .line 71
    .line 72
    invoke-interface {v2, v5}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string v6, "c.getProvider(InternalAuthProvider::class.java)"

    .line 77
    .line 78
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-class v6, Ls9/a;

    .line 82
    .line 83
    invoke-interface {v2, v6}, Ld8/c;->b(Ljava/lang/Class;)Lt9/b;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const-string v7, "c.getProvider(FirebaseIn\u2026ceIdInternal::class.java)"

    .line 88
    .line 89
    invoke-static {v6, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-class v7, La8/a;

    .line 93
    .line 94
    invoke-interface {v2, v7}, Ld8/c;->f(Ljava/lang/Class;)Lt9/a;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-string v7, "c.getDeferred(InteropApp\u2026okenProvider::class.java)"

    .line 99
    .line 100
    invoke-static {v2, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-class v7, Landroid/content/Context;

    .line 104
    .line 105
    const-class v7, Ljava/util/concurrent/Executor;

    .line 106
    .line 107
    const-class v7, Ljava/util/concurrent/Executor;

    .line 108
    .line 109
    invoke-static {v4}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-static {v3}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v10, Lo9/h;

    .line 118
    .line 119
    invoke-direct {v10, v3}, Lo9/h;-><init>(Lb1/v;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v5}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-static {v6}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    invoke-static {v2}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    invoke-static {v0}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v2, Lp3/f;

    .line 139
    .line 140
    const/16 v16, 0x1

    .line 141
    .line 142
    move-object v11, v2

    .line 143
    move-object v15, v0

    .line 144
    invoke-direct/range {v11 .. v16}, Lp3/f;-><init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, Lp9/a;->a(Lp9/b;)Lqb/a;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-static {v1}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    new-instance v1, Lk3/y;

    .line 156
    .line 157
    const/4 v14, 0x2

    .line 158
    move-object v8, v1

    .line 159
    move-object v12, v0

    .line 160
    invoke-direct/range {v8 .. v14}, Lk3/y;-><init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Lo9/k;

    .line 164
    .line 165
    invoke-direct {v0, v1}, Lo9/k;-><init>(Lk3/y;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lb1/v;->f(Ljava/lang/Object;)Lb1/v;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v1, Lo9/j;

    .line 173
    .line 174
    invoke-direct {v1, v0}, Lo9/j;-><init>(Lb1/v;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1}, Lp9/a;->a(Lp9/b;)Lqb/a;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Lo9/i;

    .line 186
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
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Ly7/c;

    .line 2
    .line 3
    const-class v1, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v2, Ld8/t;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, Ly7/d;

    .line 11
    .line 12
    const-class v1, Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v3, Ld8/t;

    .line 15
    .line 16
    invoke-direct {v3, v0, v1}, Ld8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    new-array v0, v0, [Ld8/b;

    .line 21
    .line 22
    const-class v1, Lo9/i;

    .line 23
    .line 24
    invoke-static {v1}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v4, "fire-fn"

    .line 29
    .line 30
    iput-object v4, v1, Ld8/b$a;->a:Ljava/lang/String;

    .line 31
    .line 32
    const-class v5, Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v5}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 39
    .line 40
    .line 41
    const-class v5, Lu7/j;

    .line 42
    .line 43
    invoke-static {v5}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 48
    .line 49
    .line 50
    const-class v5, Lc8/b;

    .line 51
    .line 52
    invoke-static {v5}, Ld8/k;->b(Ljava/lang/Class;)Ld8/k;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 57
    .line 58
    .line 59
    const-class v5, Ls9/a;

    .line 60
    .line 61
    new-instance v6, Ld8/k;

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    invoke-direct {v6, v7, v7, v5}, Ld8/k;-><init>(IILjava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v6}, Ld8/b$a;->a(Ld8/k;)V

    .line 68
    .line 69
    .line 70
    const-class v5, La8/a;

    .line 71
    .line 72
    invoke-static {v5}, Ld8/k;->a(Ljava/lang/Class;)Ld8/k;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Ld8/k;

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-direct {v5, v2, v7, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 86
    .line 87
    .line 88
    new-instance v5, Ld8/k;

    .line 89
    .line 90
    invoke-direct {v5, v3, v7, v6}, Ld8/k;-><init>(Ld8/t;II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v5}, Ld8/b$a;->a(Ld8/k;)V

    .line 94
    .line 95
    .line 96
    new-instance v5, Lo9/l;

    .line 97
    .line 98
    invoke-direct {v5, v6, v2, v3}, Lo9/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object v5, v1, Ld8/b$a;->f:Ld8/e;

    .line 102
    .line 103
    invoke-virtual {v1}, Ld8/b$a;->b()Ld8/b;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    aput-object v1, v0, v6

    .line 108
    .line 109
    const-string v1, "21.1.0"

    .line 110
    .line 111
    invoke-static {v4, v1}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    aput-object v1, v0, v7

    .line 116
    .line 117
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "asList(\n      Component.\u2026onfig.VERSION_NAME)\n    )"

    .line 122
    .line 123
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v0
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
