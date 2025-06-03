.class public final Lgb/r1$o;
.super Lgb/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "o"
.end annotation


# instance fields
.field public final a:Leb/k0$b;

.field public final b:Leb/f0;

.field public final c:Lgb/n;

.field public final d:Lgb/p;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/u;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lgb/d1;

.field public g:Z

.field public h:Z

.field public i:Leb/h1$c;

.field public final synthetic j:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;Leb/k0$b;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 2
    .line 3
    invoke-direct {p0}, Lgb/e;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, Leb/k0$b;->a:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lgb/r1$o;->e:Ljava/util/List;

    .line 9
    .line 10
    sget-object v0, Lgb/r1;->e0:Ljava/util/logging/Logger;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lgb/r1$o;->a:Leb/k0$b;

    .line 16
    .line 17
    invoke-virtual {p1}, Lgb/r1;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Leb/f0;

    .line 22
    .line 23
    sget-object v2, Leb/f0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const-string v4, "Subchannel"

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4, v0}, Leb/f0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lgb/r1$o;->b:Leb/f0;

    .line 35
    .line 36
    new-instance v0, Lgb/p;

    .line 37
    .line 38
    iget-object v2, p1, Lgb/r1;->m:Lgb/o3;

    .line 39
    .line 40
    invoke-interface {v2}, Lgb/o3;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    const-string v4, "Subchannel for "

    .line 45
    .line 46
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object p2, p2, Leb/k0$b;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {v0, v1, v2, v3, p2}, Lgb/p;-><init>(Leb/f0;JLjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lgb/r1$o;->d:Lgb/p;

    .line 63
    .line 64
    new-instance p2, Lgb/n;

    .line 65
    .line 66
    iget-object p1, p1, Lgb/r1;->m:Lgb/o3;

    .line 67
    .line 68
    invoke-direct {p2, v0, p1}, Lgb/n;-><init>(Lgb/p;Lgb/o3;)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Lgb/r1$o;->c:Lgb/n;

    .line 72
    .line 73
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Leb/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    invoke-virtual {v0}, Leb/h1;->d()V

    iget-boolean v0, p0, Lgb/r1$o;->g:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/r1$o;->e:Ljava/util/List;

    return-object v0
.end method

.method public final c()Leb/a;
    .locals 1

    iget-object v0, p0, Lgb/r1$o;->a:Leb/k0$b;

    iget-object v0, v0, Leb/k0$b;->b:Leb/a;

    return-object v0
.end method

.method public final d()Leb/d;
    .locals 1

    iget-object v0, p0, Lgb/r1$o;->c:Lgb/n;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lgb/r1$o;->g:Z

    const-string v1, "Subchannel is not started"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/r1$o;->f:Lgb/d1;

    return-object v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    invoke-virtual {v0}, Leb/h1;->d()V

    iget-boolean v0, p0, Lgb/r1$o;->g:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/r1$o;->f:Lgb/d1;

    invoke-virtual {v0}, Lgb/d1;->a()Lgb/h2;

    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    .line 4
    .line 5
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgb/r1$o;->f:Lgb/d1;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-boolean v1, p0, Lgb/r1$o;->h:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v0, p0, Lgb/r1$o;->h:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 21
    .line 22
    iget-boolean v0, v0, Lgb/r1;->J:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lgb/r1$o;->i:Leb/h1$c;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Leb/h1$c;->a()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lgb/r1$o;->i:Leb/h1$c;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    iput-boolean v1, p0, Lgb/r1$o;->h:Z

    .line 39
    .line 40
    :goto_0
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 41
    .line 42
    iget-boolean v1, v0, Lgb/r1;->J:Z

    .line 43
    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    iget-object v2, v0, Lgb/r1;->n:Leb/h1;

    .line 47
    .line 48
    new-instance v3, Lgb/p1;

    .line 49
    .line 50
    new-instance v0, Lgb/r1$o$b;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lgb/r1$o$b;-><init>(Lgb/r1$o;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v3, v0}, Lgb/p1;-><init>(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v4, 0x5

    .line 59
    .line 60
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 61
    .line 62
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 63
    .line 64
    iget-object v0, v0, Lgb/r1;->g:Lgb/l;

    .line 65
    .line 66
    invoke-virtual {v0}, Lgb/l;->p0()Ljava/util/concurrent/ScheduledExecutorService;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual/range {v2 .. v7}, Leb/h1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Leb/h1$c;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lgb/r1$o;->i:Leb/h1$c;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    iget-object v0, p0, Lgb/r1$o;->f:Lgb/d1;

    .line 78
    .line 79
    sget-object v1, Lgb/r1;->h0:Leb/e1;

    .line 80
    .line 81
    iget-object v2, v0, Lgb/d1;->l:Leb/h1;

    .line 82
    .line 83
    new-instance v3, Lgb/h1;

    .line 84
    .line 85
    invoke-direct {v3, v0, v1}, Lgb/h1;-><init>(Lgb/d1;Leb/e1;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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

.method public final h(Leb/k0$k;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 4
    .line 5
    iget-object v1, v1, Lgb/r1;->n:Leb/h1;

    .line 6
    .line 7
    invoke-virtual {v1}, Leb/h1;->d()V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, v0, Lgb/r1$o;->g:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    xor-int/2addr v1, v2

    .line 14
    const-string v3, "already started"

    .line 15
    .line 16
    invoke-static {v1, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v0, Lgb/r1$o;->h:Z

    .line 20
    .line 21
    xor-int/2addr v1, v2

    .line 22
    const-string v3, "already shutdown"

    .line 23
    .line 24
    invoke-static {v1, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 28
    .line 29
    iget-boolean v1, v1, Lgb/r1;->J:Z

    .line 30
    .line 31
    xor-int/2addr v1, v2

    .line 32
    const-string v3, "Channel is being terminated"

    .line 33
    .line 34
    invoke-static {v1, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v2, v0, Lgb/r1$o;->g:Z

    .line 38
    .line 39
    new-instance v1, Lgb/d1;

    .line 40
    .line 41
    iget-object v2, v0, Lgb/r1$o;->a:Leb/k0$b;

    .line 42
    .line 43
    iget-object v5, v2, Leb/k0$b;->a:Ljava/util/List;

    .line 44
    .line 45
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 46
    .line 47
    invoke-virtual {v2}, Lgb/r1;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 57
    .line 58
    iget-object v7, v2, Lgb/r1;->t:Lgb/j$a;

    .line 59
    .line 60
    iget-object v8, v2, Lgb/r1;->g:Lgb/l;

    .line 61
    .line 62
    invoke-virtual {v8}, Lgb/l;->p0()Ljava/util/concurrent/ScheduledExecutorService;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 67
    .line 68
    iget-object v10, v2, Lgb/r1;->q:Ln7/q;

    .line 69
    .line 70
    iget-object v11, v2, Lgb/r1;->n:Leb/h1;

    .line 71
    .line 72
    new-instance v12, Lgb/r1$o$a;

    .line 73
    .line 74
    move-object/from16 v3, p1

    .line 75
    .line 76
    invoke-direct {v12, v0, v3}, Lgb/r1$o$a;-><init>(Lgb/r1$o;Leb/k0$k;)V

    .line 77
    .line 78
    .line 79
    iget-object v13, v2, Lgb/r1;->Q:Leb/c0;

    .line 80
    .line 81
    iget-object v2, v2, Lgb/r1;->M:Lgb/t1;

    .line 82
    .line 83
    new-instance v14, Lgb/m;

    .line 84
    .line 85
    iget-object v2, v2, Lgb/t1;->a:Lgb/o3;

    .line 86
    .line 87
    invoke-direct {v14, v2}, Lgb/m;-><init>(Lgb/o3;)V

    .line 88
    .line 89
    .line 90
    iget-object v15, v0, Lgb/r1$o;->d:Lgb/p;

    .line 91
    .line 92
    iget-object v2, v0, Lgb/r1$o;->b:Leb/f0;

    .line 93
    .line 94
    iget-object v3, v0, Lgb/r1$o;->c:Lgb/n;

    .line 95
    .line 96
    iget-object v4, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 97
    .line 98
    iget-object v4, v4, Lgb/r1;->v:Ljava/util/ArrayList;

    .line 99
    .line 100
    move-object/from16 v18, v4

    .line 101
    .line 102
    move-object v4, v1

    .line 103
    move-object/from16 v16, v2

    .line 104
    .line 105
    move-object/from16 v17, v3

    .line 106
    .line 107
    invoke-direct/range {v4 .. v18}, Lgb/d1;-><init>(Ljava/util/List;Ljava/lang/String;Lgb/j$a;Lgb/l;Ljava/util/concurrent/ScheduledExecutorService;Ln7/q;Leb/h1;Lgb/r1$o$a;Leb/c0;Lgb/m;Lgb/p;Leb/f0;Lgb/n;Ljava/util/ArrayList;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 111
    .line 112
    iget-object v3, v2, Lgb/r1;->O:Lgb/p;

    .line 113
    .line 114
    sget-object v6, Leb/b0$a;->a:Leb/b0$a;

    .line 115
    .line 116
    iget-object v2, v2, Lgb/r1;->m:Lgb/o3;

    .line 117
    .line 118
    invoke-interface {v2}, Lgb/o3;->a()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v4, "timestampNanos"

    .line 127
    .line 128
    invoke-static {v2, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance v10, Leb/b0;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v7

    .line 137
    const-string v5, "Child Subchannel started"

    .line 138
    .line 139
    move-object v4, v10

    .line 140
    move-object v9, v1

    .line 141
    invoke-direct/range {v4 .. v9}, Leb/b0;-><init>(Ljava/lang/String;Leb/b0$a;JLeb/e0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v10}, Lgb/p;->b(Leb/b0;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, v0, Lgb/r1$o;->f:Lgb/d1;

    .line 148
    .line 149
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 150
    .line 151
    iget-object v2, v2, Lgb/r1;->Q:Leb/c0;

    .line 152
    .line 153
    iget-object v2, v2, Leb/c0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 154
    .line 155
    invoke-static {v2, v1}, Leb/c0;->a(Ljava/util/AbstractMap;Leb/e0;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 159
    .line 160
    iget-object v2, v2, Lgb/r1;->B:Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    return-void
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
.end method

.method public final i(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Leb/u;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    .line 4
    .line 5
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lgb/r1$o;->e:Ljava/util/List;

    .line 9
    .line 10
    iget-object v0, p0, Lgb/r1$o;->j:Lgb/r1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lgb/r1$o;->f:Lgb/d1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "newAddressGroups contains null entry"

    .line 35
    .line 36
    invoke-static {v2, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    xor-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    const-string v2, "newAddressGroups is empty"

    .line 47
    .line 48
    invoke-static {v2, v1}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v1, v0, Lgb/d1;->l:Leb/h1;

    .line 61
    .line 62
    new-instance v2, Lgb/g1;

    .line 63
    .line 64
    invoke-direct {v2, v0, p1}, Lgb/g1;-><init>(Lgb/d1;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/r1$o;->b:Leb/f0;

    invoke-virtual {v0}, Leb/f0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
