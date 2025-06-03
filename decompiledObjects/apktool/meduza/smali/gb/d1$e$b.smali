.class public final Lgb/d1$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/d1$e;->a(Leb/e1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Leb/e1;

.field public final synthetic b:Lgb/d1$e;


# direct methods
.method public constructor <init>(Lgb/d1$e;Leb/e1;)V
    .locals 0

    iput-object p1, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    iput-object p2, p0, Lgb/d1$e$b;->a:Leb/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/d1;->x:Leb/o;

    .line 6
    .line 7
    iget-object v0, v0, Leb/o;->a:Leb/n;

    .line 8
    .line 9
    sget-object v1, Leb/n;->e:Leb/n;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 15
    .line 16
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 17
    .line 18
    iget-object v0, v0, Lgb/d1;->w:Lgb/h2;

    .line 19
    .line 20
    iget-object v1, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 21
    .line 22
    iget-object v2, v1, Lgb/d1$e;->a:Lgb/x;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    iget-object v0, v1, Lgb/d1$e;->c:Lgb/d1;

    .line 28
    .line 29
    iput-object v3, v0, Lgb/d1;->w:Lgb/h2;

    .line 30
    .line 31
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 32
    .line 33
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 34
    .line 35
    iget-object v0, v0, Lgb/d1;->m:Lgb/d1$d;

    .line 36
    .line 37
    invoke-virtual {v0}, Lgb/d1$d;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 41
    .line 42
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 43
    .line 44
    sget-object v1, Leb/n;->d:Leb/n;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lgb/d1;->b(Lgb/d1;Leb/n;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    iget-object v0, v1, Lgb/d1$e;->c:Lgb/d1;

    .line 52
    .line 53
    iget-object v1, v0, Lgb/d1;->v:Lgb/x;

    .line 54
    .line 55
    if-ne v1, v2, :cond_8

    .line 56
    .line 57
    iget-object v0, v0, Lgb/d1;->x:Leb/o;

    .line 58
    .line 59
    iget-object v0, v0, Leb/o;->a:Leb/n;

    .line 60
    .line 61
    sget-object v1, Leb/n;->a:Leb/n;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v4, 0x1

    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    move v0, v4

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v0, v2

    .line 70
    :goto_0
    iget-object v1, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 71
    .line 72
    iget-object v1, v1, Lgb/d1$e;->c:Lgb/d1;

    .line 73
    .line 74
    iget-object v1, v1, Lgb/d1;->x:Leb/o;

    .line 75
    .line 76
    iget-object v1, v1, Leb/o;->a:Leb/n;

    .line 77
    .line 78
    const-string v5, "Expected state is CONNECTING, actual state is %s"

    .line 79
    .line 80
    invoke-static {v1, v5, v0}, Lx6/b;->G(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 84
    .line 85
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 86
    .line 87
    iget-object v0, v0, Lgb/d1;->m:Lgb/d1$d;

    .line 88
    .line 89
    iget-object v1, v0, Lgb/d1$d;->a:Ljava/util/List;

    .line 90
    .line 91
    iget v5, v0, Lgb/d1$d;->b:I

    .line 92
    .line 93
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Leb/u;

    .line 98
    .line 99
    iget v5, v0, Lgb/d1$d;->c:I

    .line 100
    .line 101
    add-int/2addr v5, v4

    .line 102
    iput v5, v0, Lgb/d1$d;->c:I

    .line 103
    .line 104
    iget-object v1, v1, Leb/u;->a:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-lt v5, v1, :cond_3

    .line 111
    .line 112
    iget v1, v0, Lgb/d1$d;->b:I

    .line 113
    .line 114
    add-int/2addr v1, v4

    .line 115
    iput v1, v0, Lgb/d1$d;->b:I

    .line 116
    .line 117
    iput v2, v0, Lgb/d1$d;->c:I

    .line 118
    .line 119
    :cond_3
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 120
    .line 121
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 122
    .line 123
    iget-object v0, v0, Lgb/d1;->m:Lgb/d1$d;

    .line 124
    .line 125
    iget v1, v0, Lgb/d1$d;->b:I

    .line 126
    .line 127
    iget-object v0, v0, Lgb/d1$d;->a:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-ge v1, v0, :cond_4

    .line 134
    .line 135
    move v0, v4

    .line 136
    goto :goto_1

    .line 137
    :cond_4
    move v0, v2

    .line 138
    :goto_1
    if-nez v0, :cond_7

    .line 139
    .line 140
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 141
    .line 142
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 143
    .line 144
    iput-object v3, v0, Lgb/d1;->v:Lgb/x;

    .line 145
    .line 146
    iget-object v0, v0, Lgb/d1;->m:Lgb/d1$d;

    .line 147
    .line 148
    invoke-virtual {v0}, Lgb/d1$d;->a()V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 152
    .line 153
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 154
    .line 155
    iget-object v1, p0, Lgb/d1$e$b;->a:Leb/e1;

    .line 156
    .line 157
    iget-object v3, v0, Lgb/d1;->l:Leb/h1;

    .line 158
    .line 159
    invoke-virtual {v3}, Leb/h1;->d()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Leb/e1;->e()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    xor-int/2addr v3, v4

    .line 167
    const-string v5, "The error status must not be OK"

    .line 168
    .line 169
    invoke-static {v5, v3}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    new-instance v3, Leb/o;

    .line 173
    .line 174
    sget-object v5, Leb/n;->c:Leb/n;

    .line 175
    .line 176
    invoke-direct {v3, v5, v1}, Leb/o;-><init>(Leb/n;Leb/e1;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3}, Lgb/d1;->j(Leb/o;)V

    .line 180
    .line 181
    .line 182
    iget-object v3, v0, Lgb/d1;->o:Lgb/j;

    .line 183
    .line 184
    if-nez v3, :cond_5

    .line 185
    .line 186
    iget-object v3, v0, Lgb/d1;->d:Lgb/j$a;

    .line 187
    .line 188
    check-cast v3, Lgb/k0$a;

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v3, Lgb/k0;

    .line 194
    .line 195
    invoke-direct {v3}, Lgb/k0;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object v3, v0, Lgb/d1;->o:Lgb/j;

    .line 199
    .line 200
    :cond_5
    iget-object v3, v0, Lgb/d1;->o:Lgb/j;

    .line 201
    .line 202
    check-cast v3, Lgb/k0;

    .line 203
    .line 204
    invoke-virtual {v3}, Lgb/k0;->a()J

    .line 205
    .line 206
    .line 207
    move-result-wide v5

    .line 208
    iget-object v3, v0, Lgb/d1;->p:Ln7/p;

    .line 209
    .line 210
    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 211
    .line 212
    invoke-virtual {v3, v11}, Ln7/p;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    sub-long v9, v5, v7

    .line 217
    .line 218
    iget-object v3, v0, Lgb/d1;->j:Leb/d;

    .line 219
    .line 220
    sget-object v5, Leb/d$a;->b:Leb/d$a;

    .line 221
    .line 222
    const/4 v6, 0x2

    .line 223
    new-array v6, v6, [Ljava/lang/Object;

    .line 224
    .line 225
    invoke-static {v1}, Lgb/d1;->k(Leb/e1;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    aput-object v1, v6, v2

    .line 230
    .line 231
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    aput-object v1, v6, v4

    .line 236
    .line 237
    const-string v1, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns"

    .line 238
    .line 239
    invoke-virtual {v3, v5, v1, v6}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, v0, Lgb/d1;->q:Leb/h1$c;

    .line 243
    .line 244
    if-nez v1, :cond_6

    .line 245
    .line 246
    move v2, v4

    .line 247
    :cond_6
    const-string v1, "previous reconnectTask is not done"

    .line 248
    .line 249
    invoke-static {v2, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    iget-object v7, v0, Lgb/d1;->l:Leb/h1;

    .line 253
    .line 254
    new-instance v8, Lgb/e1;

    .line 255
    .line 256
    invoke-direct {v8, v0}, Lgb/e1;-><init>(Lgb/d1;)V

    .line 257
    .line 258
    .line 259
    iget-object v12, v0, Lgb/d1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 260
    .line 261
    invoke-virtual/range {v7 .. v12}, Leb/h1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Leb/h1$c;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    iput-object v1, v0, Lgb/d1;->q:Leb/h1$c;

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_7
    iget-object v0, p0, Lgb/d1$e$b;->b:Lgb/d1$e;

    .line 269
    .line 270
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 271
    .line 272
    invoke-static {v0}, Lgb/d1;->i(Lgb/d1;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    :goto_2
    return-void
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
