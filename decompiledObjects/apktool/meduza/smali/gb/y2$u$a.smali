.class public final Lgb/y2$u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2$u;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/y2$a0;

.field public final synthetic b:Lgb/y2$u;


# direct methods
.method public constructor <init>(Lgb/y2$u;Lgb/y2$a0;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    iput-object p2, p0, Lgb/y2$u$a;->a:Lgb/y2$a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v0, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/y2$u;->b:Lgb/y2;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/y2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 9
    .line 10
    iget-object v2, v1, Lgb/y2$u;->a:Lgb/y2$t;

    .line 11
    .line 12
    iget-boolean v2, v2, Lgb/y2$t;->c:Z

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 22
    .line 23
    iget-object v2, v1, Lgb/y2;->o:Lgb/y2$y;

    .line 24
    .line 25
    iget-object v6, p0, Lgb/y2$u$a;->a:Lgb/y2$a0;

    .line 26
    .line 27
    invoke-virtual {v2, v6}, Lgb/y2$y;->a(Lgb/y2$a0;)Lgb/y2$y;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, v1, Lgb/y2;->o:Lgb/y2$y;

    .line 32
    .line 33
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 34
    .line 35
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 36
    .line 37
    iget-object v2, v1, Lgb/y2;->o:Lgb/y2$y;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lgb/y2;->v(Lgb/y2$y;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 46
    .line 47
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 48
    .line 49
    iget-object v1, v1, Lgb/y2;->m:Lgb/y2$b0;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v2, v1, Lgb/y2$b0;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget v1, v1, Lgb/y2$b0;->b:I

    .line 60
    .line 61
    if-le v2, v1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move v4, v5

    .line 65
    :goto_0
    if-eqz v4, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_2
    :goto_1
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 72
    .line 73
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 74
    .line 75
    new-instance v2, Lgb/y2$t;

    .line 76
    .line 77
    iget-object v3, v1, Lgb/y2;->i:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-direct {v2, v3}, Lgb/y2$t;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v3, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 85
    .line 86
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 87
    .line 88
    iget-object v2, v1, Lgb/y2;->o:Lgb/y2$y;

    .line 89
    .line 90
    iget-boolean v4, v2, Lgb/y2$y;->h:Z

    .line 91
    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance v4, Lgb/y2$y;

    .line 96
    .line 97
    iget-object v7, v2, Lgb/y2$y;->b:Ljava/util/List;

    .line 98
    .line 99
    iget-object v8, v2, Lgb/y2$y;->c:Ljava/util/Collection;

    .line 100
    .line 101
    iget-object v9, v2, Lgb/y2$y;->d:Ljava/util/Collection;

    .line 102
    .line 103
    iget-object v10, v2, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 104
    .line 105
    iget-boolean v11, v2, Lgb/y2$y;->g:Z

    .line 106
    .line 107
    iget-boolean v12, v2, Lgb/y2$y;->a:Z

    .line 108
    .line 109
    const/4 v13, 0x1

    .line 110
    iget v14, v2, Lgb/y2$y;->e:I

    .line 111
    .line 112
    move-object v6, v4

    .line 113
    invoke-direct/range {v6 .. v14}, Lgb/y2$y;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lgb/y2$a0;ZZZI)V

    .line 114
    .line 115
    .line 116
    move-object v2, v4

    .line 117
    :goto_2
    iput-object v2, v1, Lgb/y2;->o:Lgb/y2$y;

    .line 118
    .line 119
    iget-object v1, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 120
    .line 121
    iget-object v1, v1, Lgb/y2$u;->b:Lgb/y2;

    .line 122
    .line 123
    :goto_3
    iput-object v3, v1, Lgb/y2;->w:Lgb/y2$t;

    .line 124
    .line 125
    move v4, v5

    .line 126
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    iget-object v0, p0, Lgb/y2$u$a;->a:Lgb/y2$a0;

    .line 130
    .line 131
    iget-object v1, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 132
    .line 133
    new-instance v2, Lgb/y2$z;

    .line 134
    .line 135
    iget-object v3, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 136
    .line 137
    iget-object v3, v3, Lgb/y2$u;->b:Lgb/y2;

    .line 138
    .line 139
    invoke-direct {v2, v3, v0}, Lgb/y2$z;-><init>(Lgb/y2;Lgb/y2$a0;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, v2}, Lgb/s;->l(Lgb/t;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lgb/y2$u$a;->a:Lgb/y2$a0;

    .line 146
    .line 147
    iget-object v0, v0, Lgb/y2$a0;->a:Lgb/s;

    .line 148
    .line 149
    sget-object v1, Leb/e1;->f:Leb/e1;

    .line 150
    .line 151
    const-string v2, "Unneeded hedging"

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v0, v1}, Lgb/s;->n(Leb/e1;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    if-eqz v3, :cond_6

    .line 162
    .line 163
    iget-object v0, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 164
    .line 165
    iget-object v0, v0, Lgb/y2$u;->b:Lgb/y2;

    .line 166
    .line 167
    iget-object v1, v0, Lgb/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 168
    .line 169
    new-instance v2, Lgb/y2$u;

    .line 170
    .line 171
    invoke-direct {v2, v0, v3}, Lgb/y2$u;-><init>(Lgb/y2;Lgb/y2$t;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v0, Lgb/y2;->g:Lgb/x0;

    .line 175
    .line 176
    iget-wide v4, v0, Lgb/x0;->b:J

    .line 177
    .line 178
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 179
    .line 180
    invoke-interface {v1, v2, v4, v5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v3, v0}, Lgb/y2$t;->a(Ljava/util/concurrent/ScheduledFuture;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    iget-object v0, p0, Lgb/y2$u$a;->b:Lgb/y2$u;

    .line 188
    .line 189
    iget-object v0, v0, Lgb/y2$u;->b:Lgb/y2;

    .line 190
    .line 191
    iget-object v1, p0, Lgb/y2$u$a;->a:Lgb/y2$a0;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lgb/y2;->t(Lgb/y2$a0;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    throw v1
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
