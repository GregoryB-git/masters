.class public final Lgb/d1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/h2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final a:Lgb/x;

.field public b:Z

.field public final synthetic c:Lgb/d1;


# direct methods
.method public constructor <init>(Lgb/d1;Lgb/d1$b;)V
    .locals 0

    iput-object p1, p0, Lgb/d1$e;->c:Lgb/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lgb/d1$e;->b:Z

    iput-object p2, p0, Lgb/d1$e;->a:Lgb/x;

    return-void
.end method


# virtual methods
.method public final a(Leb/e1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/d1;->j:Leb/d;

    .line 4
    .line 5
    sget-object v1, Leb/d$a;->b:Leb/d$a;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v3, p0, Lgb/d1$e;->a:Lgb/x;

    .line 11
    .line 12
    invoke-interface {v3}, Leb/e0;->f()Leb/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object v3, v2, v4

    .line 18
    .line 19
    iget-object v3, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lgb/d1;->k(Leb/e1;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x1

    .line 29
    aput-object v3, v2, v4

    .line 30
    .line 31
    const-string v3, "{0} SHUTDOWN with {1}"

    .line 32
    .line 33
    invoke-virtual {v0, v1, v3, v2}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v4, p0, Lgb/d1$e;->b:Z

    .line 37
    .line 38
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 39
    .line 40
    iget-object v0, v0, Lgb/d1;->l:Leb/h1;

    .line 41
    .line 42
    new-instance v1, Lgb/d1$e$b;

    .line 43
    .line 44
    invoke-direct {v1, p0, p1}, Lgb/d1$e$b;-><init>(Lgb/d1$e;Leb/e1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/d1;->j:Leb/d;

    .line 4
    .line 5
    sget-object v1, Leb/d$a;->b:Leb/d$a;

    .line 6
    .line 7
    const-string v2, "READY"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Leb/d;->a(Leb/d$a;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 13
    .line 14
    iget-object v0, v0, Lgb/d1;->l:Leb/h1;

    .line 15
    .line 16
    new-instance v1, Lgb/d1$e$a;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lgb/d1$e$a;-><init>(Lgb/d1$e;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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

.method public final c(Leb/a;)Leb/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/d1;->k:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Leb/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v2, "Filter %s returned null"

    .line 25
    .line 26
    invoke-static {v2, p1, v1}, Lx6/b;->z(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lgb/d1$e;->b:Z

    .line 2
    .line 3
    const-string v1, "transportShutdown() must be called before transportTerminated()."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 9
    .line 10
    iget-object v0, v0, Lgb/d1;->j:Leb/d;

    .line 11
    .line 12
    sget-object v1, Leb/d$a;->b:Leb/d$a;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v3, p0, Lgb/d1$e;->a:Lgb/x;

    .line 18
    .line 19
    invoke-interface {v3}, Leb/e0;->f()Leb/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v3, v2, v4

    .line 25
    .line 26
    const-string v3, "{0} Terminated"

    .line 27
    .line 28
    invoke-virtual {v0, v1, v3, v2}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 32
    .line 33
    iget-object v0, v0, Lgb/d1;->h:Leb/c0;

    .line 34
    .line 35
    iget-object v1, p0, Lgb/d1$e;->a:Lgb/x;

    .line 36
    .line 37
    iget-object v0, v0, Leb/c0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-static {v0, v1}, Leb/c0;->b(Ljava/util/AbstractMap;Leb/e0;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 43
    .line 44
    iget-object v1, p0, Lgb/d1$e;->a:Lgb/x;

    .line 45
    .line 46
    iget-object v2, v0, Lgb/d1;->l:Leb/h1;

    .line 47
    .line 48
    new-instance v3, Lgb/j1;

    .line 49
    .line 50
    invoke-direct {v3, v0, v1, v4}, Lgb/j1;-><init>(Lgb/d1;Lgb/x;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 57
    .line 58
    iget-object v0, v0, Lgb/d1;->k:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Leb/i;

    .line 75
    .line 76
    iget-object v2, p0, Lgb/d1$e;->a:Lgb/x;

    .line 77
    .line 78
    invoke-interface {v2}, Lgb/x;->getAttributes()Leb/a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 86
    .line 87
    iget-object v0, v0, Lgb/d1;->l:Leb/h1;

    .line 88
    .line 89
    new-instance v1, Lgb/d1$e$c;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Lgb/d1$e$c;-><init>(Lgb/d1$e;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    return-void
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

.method public final e(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgb/d1$e;->c:Lgb/d1;

    .line 2
    .line 3
    iget-object v1, p0, Lgb/d1$e;->a:Lgb/x;

    .line 4
    .line 5
    iget-object v2, v0, Lgb/d1;->l:Leb/h1;

    .line 6
    .line 7
    new-instance v3, Lgb/j1;

    .line 8
    .line 9
    invoke-direct {v3, v0, v1, p1}, Lgb/j1;-><init>(Lgb/d1;Lgb/x;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v3}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
.end method
