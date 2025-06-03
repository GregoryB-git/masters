.class public final Lo0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/q$a;,
        Lo0/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo0/i<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final k:Ljava/util/LinkedHashSet;

.field public static final l:Ljava/lang/Object;


# instance fields
.field public final a:Ldc/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/a<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lo0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lo0/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lnc/d0;

.field public final e:Lqc/r;

.field public final f:Ljava/lang/String;

.field public final g:Lrb/g;

.field public final h:Lqc/t;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ldc/p<",
            "-",
            "Lo0/k<",
            "TT;>;-",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final j:Lo0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/p<",
            "Lo0/q$a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lo0/q;->k:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo0/q;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr0/c;Ljava/util/List;Lo0/b;Lnc/d0;)V
    .locals 2

    .line 1
    sget-object v0, Lr0/f;->a:Lr0/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lo0/q;->a:Ldc/a;

    .line 7
    .line 8
    iput-object v0, p0, Lo0/q;->b:Lo0/m;

    .line 9
    .line 10
    iput-object p3, p0, Lo0/q;->c:Lo0/b;

    .line 11
    .line 12
    iput-object p4, p0, Lo0/q;->d:Lnc/d0;

    .line 13
    .line 14
    new-instance p1, Lo0/u;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-direct {p1, p0, p3}, Lo0/u;-><init>(Lo0/q;Lub/e;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lqc/r;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lqc/r;-><init>(Lo0/u;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lo0/q;->e:Lqc/r;

    .line 26
    .line 27
    const-string p1, ".tmp"

    .line 28
    .line 29
    iput-object p1, p0, Lo0/q;->f:Ljava/lang/String;

    .line 30
    .line 31
    new-instance p1, Lo0/w;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lo0/w;-><init>(Lo0/q;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lb/z;->n(Ldc/a;)Lrb/g;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lo0/q;->g:Lrb/g;

    .line 41
    .line 42
    sget-object p1, Lo0/c0;->a:Lo0/c0;

    .line 43
    .line 44
    new-instance v0, Lqc/t;

    .line 45
    .line 46
    if-nez p1, :cond_0

    .line 47
    .line 48
    sget-object p1, Leb/y;->b:Ld2/h0;

    .line 49
    .line 50
    :cond_0
    invoke-direct {v0, p1}, Lqc/t;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lo0/q;->h:Lqc/t;

    .line 54
    .line 55
    invoke-static {p2}, Lsb/q;->u(Ljava/lang/Iterable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lo0/q;->i:Ljava/util/List;

    .line 60
    .line 61
    new-instance p1, Lo0/p;

    .line 62
    .line 63
    new-instance p2, Lo0/r;

    .line 64
    .line 65
    invoke-direct {p2, p0}, Lo0/r;-><init>(Lo0/q;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lo0/s;->a:Lo0/s;

    .line 69
    .line 70
    new-instance v1, Lo0/t;

    .line 71
    .line 72
    invoke-direct {v1, p0, p3}, Lo0/t;-><init>(Lo0/q;Lub/e;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, p4, p2, v0, v1}, Lo0/p;-><init>(Lnc/d0;Lo0/r;Lo0/s;Lo0/t;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lo0/q;->j:Lo0/p;

    .line 79
    .line 80
    return-void
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public static final b(Lo0/q;Lo0/q$a$b;Lub/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lo0/x;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lo0/x;

    .line 10
    .line 11
    iget v1, v0, Lo0/x;->f:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lo0/x;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lo0/x;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lo0/x;-><init>(Lo0/q;Lub/e;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lo0/x;->d:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 31
    .line 32
    iget v2, v0, Lo0/x;->f:I

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    iget-object p0, v0, Lo0/x;->c:Lnc/r;

    .line 55
    .line 56
    iget-object p1, v0, Lo0/x;->b:Lo0/q;

    .line 57
    .line 58
    iget-object v2, v0, Lo0/x;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lo0/q$a$b;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    :goto_1
    iget-object p0, v0, Lo0/x;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lnc/r;

    .line 69
    .line 70
    :try_start_1
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_4
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p1, Lo0/q$a$b;->b:Lnc/r;

    .line 82
    .line 83
    :try_start_2
    iget-object v2, p0, Lo0/q;->h:Lqc/t;

    .line 84
    .line 85
    invoke-virtual {v2}, Lqc/t;->b()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lo0/b0;

    .line 90
    .line 91
    instance-of v6, v2, Lo0/c;

    .line 92
    .line 93
    if-eqz v6, :cond_6

    .line 94
    .line 95
    iget-object v2, p1, Lo0/q$a$b;->a:Ldc/p;

    .line 96
    .line 97
    iget-object p1, p1, Lo0/q$a$b;->d:Lub/h;

    .line 98
    .line 99
    iput-object p2, v0, Lo0/x;->a:Ljava/lang/Object;

    .line 100
    .line 101
    iput v5, v0, Lo0/x;->f:I

    .line 102
    .line 103
    invoke-virtual {p0, v0, p1, v2}, Lo0/q;->i(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v1, :cond_5

    .line 108
    .line 109
    goto/16 :goto_8

    .line 110
    .line 111
    :cond_5
    move-object v7, p2

    .line 112
    move-object p2, p0

    .line 113
    move-object p0, v7

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    instance-of v6, v2, Lo0/l;

    .line 116
    .line 117
    if-eqz v6, :cond_7

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_7
    instance-of v5, v2, Lo0/c0;

    .line 121
    .line 122
    :goto_2
    if-eqz v5, :cond_a

    .line 123
    .line 124
    iget-object v5, p1, Lo0/q$a$b;->c:Lo0/b0;

    .line 125
    .line 126
    if-ne v2, v5, :cond_9

    .line 127
    .line 128
    iput-object p1, v0, Lo0/x;->a:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object p0, v0, Lo0/x;->b:Lo0/q;

    .line 131
    .line 132
    iput-object p2, v0, Lo0/x;->c:Lnc/r;

    .line 133
    .line 134
    iput v4, v0, Lo0/x;->f:I

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lo0/q;->e(Lub/e;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 140
    if-ne v2, v1, :cond_8

    .line 141
    .line 142
    goto :goto_8

    .line 143
    :cond_8
    move-object v2, p1

    .line 144
    move-object p1, p0

    .line 145
    move-object p0, p2

    .line 146
    :goto_3
    :try_start_3
    iget-object p2, v2, Lo0/q$a$b;->a:Ldc/p;

    .line 147
    .line 148
    iget-object v2, v2, Lo0/q$a$b;->d:Lub/h;

    .line 149
    .line 150
    iput-object p0, v0, Lo0/x;->a:Ljava/lang/Object;

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    iput-object v4, v0, Lo0/x;->b:Lo0/q;

    .line 154
    .line 155
    iput-object v4, v0, Lo0/x;->c:Lnc/r;

    .line 156
    .line 157
    iput v3, v0, Lo0/x;->f:I

    .line 158
    .line 159
    invoke-virtual {p1, v0, v2, p2}, Lo0/q;->i(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    if-ne p2, v1, :cond_c

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    move-object p2, p0

    .line 168
    goto :goto_4

    .line 169
    :cond_9
    :try_start_4
    check-cast v2, Lo0/l;

    .line 170
    .line 171
    iget-object p0, v2, Lo0/l;->a:Ljava/lang/Throwable;

    .line 172
    .line 173
    throw p0

    .line 174
    :cond_a
    instance-of p0, v2, Lo0/j;

    .line 175
    .line 176
    if-eqz p0, :cond_b

    .line 177
    .line 178
    check-cast v2, Lo0/j;

    .line 179
    .line 180
    iget-object p0, v2, Lo0/j;->a:Ljava/lang/Throwable;

    .line 181
    .line 182
    throw p0

    .line 183
    :cond_b
    new-instance p0, Ln7/w;

    .line 184
    .line 185
    invoke-direct {p0}, Ln7/w;-><init>()V

    .line 186
    .line 187
    .line 188
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 189
    :catchall_2
    move-exception p0

    .line 190
    move-object p1, p0

    .line 191
    :goto_4
    move-object p0, p2

    .line 192
    :goto_5
    invoke-static {p1}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    :cond_c
    :goto_6
    invoke-static {p2}, Lrb/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-nez p1, :cond_d

    .line 201
    .line 202
    invoke-interface {p0, p2}, Lnc/r;->i0(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_d
    invoke-interface {p0, p1}, Lnc/r;->h0(Ljava/lang/Throwable;)Z

    .line 207
    .line 208
    .line 209
    :goto_7
    sget-object v1, Lrb/h;->a:Lrb/h;

    .line 210
    .line 211
    :goto_8
    return-object v1
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
.method public final a(Ldc/p;Lub/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/p<",
            "-TT;-",
            "Lub/e<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lb/z;->b()Lnc/s;

    move-result-object v0

    iget-object v1, p0, Lo0/q;->h:Lqc/t;

    invoke-virtual {v1}, Lqc/t;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/b0;

    new-instance v2, Lo0/q$a$b;

    invoke-interface {p2}, Lub/e;->getContext()Lub/h;

    move-result-object v3

    invoke-direct {v2, p1, v0, v1, v3}, Lo0/q$a$b;-><init>(Ldc/p;Lnc/s;Lo0/b0;Lub/h;)V

    iget-object p1, p0, Lo0/q;->j:Lo0/p;

    invoke-virtual {p1, v2}, Lo0/p;->a(Lo0/q$a;)V

    invoke-virtual {v0, p2}, Lnc/s;->await(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lo0/q;->g:Lrb/g;

    invoke-virtual {v0}, Lrb/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public final d(Lub/e;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo0/q$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo0/q$c;

    iget v1, v0, Lo0/q$c;->q:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/q$c;->q:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/q$c;

    invoke-direct {v0, p0, p1}, Lo0/q$c;-><init>(Lo0/q;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lo0/q$c;->o:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lo0/q$c;->q:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lo0/q$c;->d:Ljava/lang/Object;

    check-cast v1, Lvc/a;

    iget-object v2, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    check-cast v2, Lec/r;

    iget-object v3, v0, Lo0/q$c;->b:Ljava/lang/Object;

    check-cast v3, Lec/s;

    iget-object v0, v0, Lo0/q$c;->a:Lo0/q;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lo0/q$c;->f:Ljava/util/Iterator;

    iget-object v8, v0, Lo0/q$c;->e:Lo0/q$d;

    iget-object v9, v0, Lo0/q$c;->d:Ljava/lang/Object;

    check-cast v9, Lec/r;

    iget-object v10, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    check-cast v10, Lec/s;

    iget-object v11, v0, Lo0/q$c;->b:Ljava/lang/Object;

    check-cast v11, Lvc/a;

    iget-object v12, v0, Lo0/q$c;->a:Lo0/q;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, Lo0/q$c;->d:Ljava/lang/Object;

    check-cast v2, Lec/s;

    iget-object v8, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    check-cast v8, Lec/s;

    iget-object v9, v0, Lo0/q$c;->b:Ljava/lang/Object;

    check-cast v9, Lvc/a;

    iget-object v10, v0, Lo0/q$c;->a:Lo0/q;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    move-object v11, v9

    move-object v12, v10

    move-object v10, v8

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo0/q;->h:Lqc/t;

    invoke-virtual {p1}, Lqc/t;->b()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lo0/c0;->a:Lo0/c0;

    invoke-static {p1, v2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lo0/q;->h:Lqc/t;

    invoke-virtual {p1}, Lqc/t;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lo0/l;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move p1, v5

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v6

    :goto_2
    if-eqz p1, :cond_d

    invoke-static {}, Lb/a0;->e()Lvc/d;

    move-result-object p1

    new-instance v2, Lec/s;

    invoke-direct {v2}, Lec/s;-><init>()V

    iput-object p0, v0, Lo0/q$c;->a:Lo0/q;

    iput-object p1, v0, Lo0/q$c;->b:Ljava/lang/Object;

    iput-object v2, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    iput-object v2, v0, Lo0/q$c;->d:Ljava/lang/Object;

    iput v6, v0, Lo0/q$c;->q:I

    invoke-virtual {p0, v0}, Lo0/q;->h(Lub/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_7

    return-object v1

    :cond_7
    move-object v12, p0

    move-object v11, p1

    move-object v10, v2

    move-object p1, v8

    :goto_3
    iput-object p1, v2, Lec/s;->a:Ljava/lang/Object;

    new-instance v9, Lec/r;

    invoke-direct {v9}, Lec/r;-><init>()V

    new-instance v8, Lo0/q$d;

    invoke-direct {v8, v11, v9, v10, v12}, Lo0/q$d;-><init>(Lvc/a;Lec/r;Lec/s;Lo0/q;)V

    iget-object p1, v12, Lo0/q;->i:Ljava/util/List;

    if-nez p1, :cond_9

    :cond_8
    move-object v2, v9

    goto :goto_5

    :cond_9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldc/p;

    iput-object v12, v0, Lo0/q$c;->a:Lo0/q;

    iput-object v11, v0, Lo0/q$c;->b:Ljava/lang/Object;

    iput-object v10, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    iput-object v9, v0, Lo0/q$c;->d:Ljava/lang/Object;

    iput-object v8, v0, Lo0/q$c;->e:Lo0/q$d;

    iput-object v2, v0, Lo0/q$c;->f:Ljava/util/Iterator;

    iput v4, v0, Lo0/q$c;->q:I

    invoke-interface {p1, v8, v0}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :goto_5
    iput-object v7, v12, Lo0/q;->i:Ljava/util/List;

    iput-object v12, v0, Lo0/q$c;->a:Lo0/q;

    iput-object v10, v0, Lo0/q$c;->b:Ljava/lang/Object;

    iput-object v2, v0, Lo0/q$c;->c:Ljava/io/Serializable;

    iput-object v11, v0, Lo0/q$c;->d:Ljava/lang/Object;

    iput-object v7, v0, Lo0/q$c;->e:Lo0/q$d;

    iput-object v7, v0, Lo0/q$c;->f:Ljava/util/Iterator;

    iput v3, v0, Lo0/q$c;->q:I

    invoke-interface {v11, v0}, Lvc/a;->b(Lwb/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    move-object v3, v10

    move-object v1, v11

    move-object v0, v12

    :goto_6
    :try_start_0
    iput-boolean v6, v2, Lec/r;->a:Z

    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    iget-object p1, v0, Lo0/q;->h:Lqc/t;

    new-instance v0, Lo0/c;

    iget-object v1, v3, Lec/s;->a:Ljava/lang/Object;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :cond_c
    invoke-direct {v0, v1, v5}, Lo0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lqc/t;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lub/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo0/q$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo0/q$e;

    iget v1, v0, Lo0/q$e;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/q$e;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/q$e;

    invoke-direct {v0, p0, p1}, Lo0/q$e;-><init>(Lo0/q;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lo0/q$e;->b:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lo0/q$e;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lo0/q$e;->a:Lo0/q;

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lo0/q$e;->a:Lo0/q;

    iput v3, v0, Lo0/q$e;->d:I

    invoke-virtual {p0, v0}, Lo0/q;->d(Lub/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    iget-object v0, v0, Lo0/q;->h:Lqc/t;

    new-instance v1, Lo0/l;

    invoke-direct {v1, p1}, Lo0/l;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lqc/t;->setValue(Ljava/lang/Object;)V

    throw p1
.end method

.method public final f(Lub/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo0/q$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo0/q$f;

    iget v1, v0, Lo0/q$f;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/q$f;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/q$f;

    invoke-direct {v0, p0, p1}, Lo0/q$f;-><init>(Lo0/q;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lo0/q$f;->b:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lo0/q$f;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lo0/q$f;->a:Lo0/q;

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lo0/q$f;->a:Lo0/q;

    iput v3, v0, Lo0/q$f;->d:I

    invoke-virtual {p0, v0}, Lo0/q;->d(Lub/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_1
    iget-object v0, v0, Lo0/q;->h:Lqc/t;

    new-instance v1, Lo0/l;

    invoke-direct {v1, p1}, Lo0/l;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lqc/t;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final g(Lub/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo0/q$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo0/q$g;

    iget v1, v0, Lo0/q$g;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/q$g;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/q$g;

    invoke-direct {v0, p0, p1}, Lo0/q$g;-><init>(Lo0/q;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lo0/q$g;->c:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lo0/q$g;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lo0/q$g;->b:Ljava/io/FileInputStream;

    iget-object v0, v0, Lo0/q$g;->a:Lo0/q;

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Lo0/q;->c()Ljava/io/File;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v2, p0, Lo0/q;->b:Lo0/m;

    iput-object p0, v0, Lo0/q$g;->a:Lo0/q;

    iput-object p1, v0, Lo0/q$g;->b:Ljava/io/FileInputStream;

    iput v3, v0, Lo0/q$g;->e:I

    invoke-interface {v2, p1}, Lo0/m;->b(Ljava/io/FileInputStream;)Lr0/a;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    const/4 v2, 0x0

    :try_start_3
    invoke-static {v1, v2}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_5
    invoke-static {v1, p1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_1
    move-exception p1

    move-object v0, p0

    :goto_3
    invoke-virtual {v0}, Lo0/q;->c()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object p1, v0, Lo0/q;->b:Lo0/m;

    invoke-interface {p1}, Lo0/m;->a()Lr0/a;

    move-result-object p1

    return-object p1

    :cond_4
    throw p1
.end method

.method public final getData()Lqc/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqc/e<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lo0/q;->e:Lqc/r;

    return-object v0
.end method

.method public final h(Lub/e;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo0/q$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo0/q$h;

    iget v1, v0, Lo0/q$h;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/q$h;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/q$h;

    invoke-direct {v0, p0, p1}, Lo0/q$h;-><init>(Lo0/q;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lo0/q$h;->c:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lo0/q$h;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lo0/q$h;->b:Ljava/lang/Object;

    iget-object v0, v0, Lo0/q$h;->a:Ljava/lang/Object;

    check-cast v0, Lo0/a;

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lo0/q$h;->b:Ljava/lang/Object;

    check-cast v2, Lo0/a;

    iget-object v4, v0, Lo0/q$h;->a:Ljava/lang/Object;

    check-cast v4, Lo0/q;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lo0/q$h;->a:Ljava/lang/Object;

    check-cast v2, Lo0/q;

    :try_start_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lo0/a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lo0/q$h;->a:Ljava/lang/Object;

    iput v5, v0, Lo0/q$h;->e:I

    invoke-virtual {p0, v0}, Lo0/q;->g(Lub/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lo0/a; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    return-object p1

    :catch_2
    move-exception p1

    move-object v2, p0

    :goto_2
    iget-object v5, v2, Lo0/q;->c:Lo0/b;

    iput-object v2, v0, Lo0/q$h;->a:Ljava/lang/Object;

    iput-object p1, v0, Lo0/q$h;->b:Ljava/lang/Object;

    iput v4, v0, Lo0/q$h;->e:I

    invoke-interface {v5, p1}, Lo0/b;->a(Lo0/a;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, v6

    :goto_3
    :try_start_3
    iput-object v2, v0, Lo0/q$h;->a:Ljava/lang/Object;

    iput-object p1, v0, Lo0/q$h;->b:Ljava/lang/Object;

    iput v3, v0, Lo0/q$h;->e:I

    invoke-virtual {v4, p1, v0}, Lo0/q;->j(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, p1

    :goto_4
    return-object v1

    :catch_3
    move-exception p1

    move-object v0, v2

    :goto_5
    invoke-static {v0, p1}, Lx6/b;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final i(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lo0/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lo0/z;

    .line 7
    .line 8
    iget v1, v0, Lo0/z;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lo0/z;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo0/z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lo0/z;-><init>(Lo0/q;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lo0/z;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lo0/z;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p2, v0, Lo0/z;->b:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object p3, v0, Lo0/z;->a:Lo0/q;

    .line 43
    .line 44
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p2, v0, Lo0/z;->c:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p3, v0, Lo0/z;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p3, Lo0/c;

    .line 61
    .line 62
    iget-object v2, v0, Lo0/z;->a:Lo0/q;

    .line 63
    .line 64
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lo0/q;->h:Lqc/t;

    .line 72
    .line 73
    invoke-virtual {p1}, Lqc/t;->b()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lo0/c;

    .line 78
    .line 79
    invoke-virtual {p1}, Lo0/c;->a()V

    .line 80
    .line 81
    .line 82
    iget-object v2, p1, Lo0/c;->a:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance v6, Lo0/a0;

    .line 85
    .line 86
    invoke-direct {v6, v2, v3, p3}, Lo0/a0;-><init>(Ljava/lang/Object;Lub/e;Ldc/p;)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v0, Lo0/z;->a:Lo0/q;

    .line 90
    .line 91
    iput-object p1, v0, Lo0/z;->b:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v0, Lo0/z;->c:Ljava/lang/Object;

    .line 94
    .line 95
    iput v5, v0, Lo0/z;->f:I

    .line 96
    .line 97
    invoke-static {v0, p2, v6}, Lx6/b;->z0(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-ne p2, v1, :cond_4

    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_4
    move-object p3, p1

    .line 105
    move-object p1, p2

    .line 106
    move-object p2, v2

    .line 107
    move-object v2, p0

    .line 108
    :goto_1
    invoke-virtual {p3}, Lo0/c;->a()V

    .line 109
    .line 110
    .line 111
    invoke-static {p2, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-eqz p3, :cond_5

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    iput-object v2, v0, Lo0/z;->a:Lo0/q;

    .line 119
    .line 120
    iput-object p1, v0, Lo0/z;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, v0, Lo0/z;->c:Ljava/lang/Object;

    .line 123
    .line 124
    iput v4, v0, Lo0/z;->f:I

    .line 125
    .line 126
    invoke-virtual {v2, p1, v0}, Lo0/q;->j(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-ne p2, v1, :cond_6

    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_6
    move-object p2, p1

    .line 134
    move-object p3, v2

    .line 135
    :goto_2
    iget-object p1, p3, Lo0/q;->h:Lqc/t;

    .line 136
    .line 137
    new-instance p3, Lo0/c;

    .line 138
    .line 139
    if-eqz p2, :cond_7

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    const/4 v0, 0x0

    .line 147
    :goto_3
    invoke-direct {p3, p2, v0}, Lo0/c;-><init>(Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p3}, Lqc/t;->setValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :goto_4
    return-object p2
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
.end method

.method public final j(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lo0/q$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lo0/q$i;

    .line 7
    .line 8
    iget v1, v0, Lo0/q$i;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lo0/q$i;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo0/q$i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lo0/q$i;-><init>(Lo0/q;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lo0/q$i;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lo0/q$i;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lo0/q$i;->d:Ljava/io/FileOutputStream;

    .line 37
    .line 38
    iget-object v1, v0, Lo0/q$i;->c:Ljava/io/FileOutputStream;

    .line 39
    .line 40
    iget-object v2, v0, Lo0/q$i;->b:Ljava/io/File;

    .line 41
    .line 42
    iget-object v0, v0, Lo0/q$i;->a:Lo0/q;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lo0/q;->c()Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    :goto_1
    new-instance v2, Ljava/io/File;

    .line 87
    .line 88
    invoke-virtual {p0}, Lo0/q;->c()Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iget-object v4, p0, Lo0/q;->f:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v4, p2}, Lec/i;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    .line 106
    .line 107
    invoke-direct {p2, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    .line 109
    .line 110
    :try_start_2
    iget-object v4, p0, Lo0/q;->b:Lo0/m;

    .line 111
    .line 112
    new-instance v5, Lo0/q$b;

    .line 113
    .line 114
    invoke-direct {v5, p2}, Lo0/q$b;-><init>(Ljava/io/FileOutputStream;)V

    .line 115
    .line 116
    .line 117
    iput-object p0, v0, Lo0/q$i;->a:Lo0/q;

    .line 118
    .line 119
    iput-object v2, v0, Lo0/q$i;->b:Ljava/io/File;

    .line 120
    .line 121
    iput-object p2, v0, Lo0/q$i;->c:Ljava/io/FileOutputStream;

    .line 122
    .line 123
    iput-object p2, v0, Lo0/q$i;->d:Ljava/io/FileOutputStream;

    .line 124
    .line 125
    iput v3, v0, Lo0/q$i;->o:I

    .line 126
    .line 127
    invoke-interface {v4, p1, v5}, Lo0/m;->c(Ljava/lang/Object;Lo0/q$b;)Lrb/h;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    if-ne p1, v1, :cond_4

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_4
    move-object v0, p0

    .line 135
    move-object p1, p2

    .line 136
    move-object v1, p1

    .line 137
    :goto_2
    const/4 p2, 0x0

    .line 138
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V

    .line 143
    .line 144
    .line 145
    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    .line 147
    :try_start_4
    invoke-static {v1, p2}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lo0/q;->c()Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v2, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 155
    .line 156
    .line 157
    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_5
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    .line 164
    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v0, "Unable to rename "

    .line 171
    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 179
    .line 180
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 191
    :catch_0
    move-exception p1

    .line 192
    goto :goto_5

    .line 193
    :goto_3
    move-object p2, v1

    .line 194
    goto :goto_4

    .line 195
    :catchall_1
    move-exception p1

    .line 196
    :goto_4
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 197
    :catchall_2
    move-exception v0

    .line 198
    :try_start_7
    invoke-static {p2, p1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 202
    :goto_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    if-eqz p2, :cond_6

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 209
    .line 210
    .line 211
    :cond_6
    throw p1

    .line 212
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 213
    .line 214
    const-string v0, "Unable to create parent directories of "

    .line 215
    .line 216
    invoke-static {p2, v0}, Lec/i;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method
