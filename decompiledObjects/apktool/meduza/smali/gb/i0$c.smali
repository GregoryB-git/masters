.class public final Lgb/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Leb/u0$d;

.field public final synthetic b:Lgb/i0;


# direct methods
.method public constructor <init>(Lgb/i0;Leb/u0$d;)V
    .locals 0

    iput-object p1, p0, Lgb/i0$c;->b:Lgb/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "savedListener"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lgb/i0$c;->a:Leb/u0$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    sget-object v0, Lgb/i0;->s:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string v2, "Attempting DNS resolution of "

    .line 12
    .line 13
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 18
    .line 19
    iget-object v3, v3, Lgb/i0;->f:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->finer(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    :try_start_0
    iget-object v5, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 35
    .line 36
    iget-object v6, v5, Lgb/i0;->f:Ljava/lang/String;

    .line 37
    .line 38
    iget v7, v5, Lgb/i0;->g:I

    .line 39
    .line 40
    invoke-static {v6, v7}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v5, v5, Lgb/i0;->a:Leb/z0;

    .line 45
    .line 46
    invoke-interface {v5, v6}, Leb/z0;->a(Ljava/net/InetSocketAddress;)Leb/y0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    new-instance v6, Leb/u;

    .line 53
    .line 54
    invoke-direct {v6, v5}, Leb/u;-><init>(Ljava/net/SocketAddress;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v6, v2

    .line 59
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    sget-object v7, Leb/a;->b:Leb/a;

    .line 64
    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v5, "Using proxy address "

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->finer(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v1, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    iget-object v0, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 100
    .line 101
    invoke-virtual {v0}, Lgb/i0;->e()Lgb/i0$a;

    .line 102
    .line 103
    .line 104
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 105
    :try_start_1
    iget-object v1, v0, Lgb/i0$a;->a:Leb/e1;

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget-object v2, p0, Lgb/i0$c;->a:Leb/u0$d;

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Leb/u0$d;->a(Leb/e1;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    .line 114
    iget-object v0, v0, Lgb/i0$a;->a:Leb/e1;

    .line 115
    .line 116
    if-nez v0, :cond_4

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    move v3, v4

    .line 120
    :goto_1
    iget-object v0, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 121
    .line 122
    iget-object v0, v0, Lgb/i0;->j:Leb/h1;

    .line 123
    .line 124
    new-instance v1, Lgb/i0$c$a;

    .line 125
    .line 126
    invoke-direct {v1, p0, v3}, Lgb/i0$c$a;-><init>(Lgb/i0$c;Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_5
    :try_start_2
    iget-object v1, v0, Lgb/i0$a;->b:Ljava/util/List;

    .line 134
    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    move-object v5, v1

    .line 138
    :cond_6
    iget-object v1, v0, Lgb/i0$a;->c:Leb/u0$b;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    move-object v2, v1

    .line 143
    :cond_7
    move-object v1, v0

    .line 144
    move-object v0, v5

    .line 145
    :goto_2
    :try_start_3
    iget-object v5, p0, Lgb/i0$c;->a:Leb/u0$d;

    .line 146
    .line 147
    new-instance v6, Leb/u0$e;

    .line 148
    .line 149
    invoke-direct {v6, v0, v7, v2}, Leb/u0$e;-><init>(Ljava/util/List;Leb/a;Leb/u0$b;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v6}, Leb/u0$d;->b(Leb/u0$e;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    .line 154
    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    iget-object v0, v1, Lgb/i0$a;->a:Leb/e1;

    .line 158
    .line 159
    if-nez v0, :cond_8

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_8
    move v3, v4

    .line 163
    :goto_3
    iget-object v0, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 164
    .line 165
    iget-object v0, v0, Lgb/i0;->j:Leb/h1;

    .line 166
    .line 167
    new-instance v1, Lgb/i0$c$a;

    .line 168
    .line 169
    invoke-direct {v1, p0, v3}, Lgb/i0$c$a;-><init>(Lgb/i0$c;Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    goto :goto_9

    .line 175
    :catch_0
    move-exception v0

    .line 176
    move-object v2, v1

    .line 177
    goto :goto_4

    .line 178
    :catchall_1
    move-exception v1

    .line 179
    goto :goto_a

    .line 180
    :catch_1
    move-exception v1

    .line 181
    move-object v2, v0

    .line 182
    goto :goto_5

    .line 183
    :catchall_2
    move-exception v0

    .line 184
    goto :goto_8

    .line 185
    :catch_2
    move-exception v0

    .line 186
    :goto_4
    move-object v1, v0

    .line 187
    :goto_5
    :try_start_4
    iget-object v0, p0, Lgb/i0$c;->a:Leb/u0$d;

    .line 188
    .line 189
    sget-object v5, Leb/e1;->n:Leb/e1;

    .line 190
    .line 191
    new-instance v6, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v7, "Unable to resolve host "

    .line 197
    .line 198
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    iget-object v7, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 202
    .line 203
    iget-object v7, v7, Lgb/i0;->f:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {v5, v6}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v5, v1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, v1}, Leb/u0$d;->a(Leb/e1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 221
    .line 222
    .line 223
    if-eqz v2, :cond_9

    .line 224
    .line 225
    iget-object v0, v2, Lgb/i0$a;->a:Leb/e1;

    .line 226
    .line 227
    if-nez v0, :cond_9

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_9
    move v3, v4

    .line 231
    :goto_6
    iget-object v0, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 232
    .line 233
    iget-object v0, v0, Lgb/i0;->j:Leb/h1;

    .line 234
    .line 235
    new-instance v1, Lgb/i0$c$a;

    .line 236
    .line 237
    invoke-direct {v1, p0, v3}, Lgb/i0$c$a;-><init>(Lgb/i0$c;Z)V

    .line 238
    .line 239
    .line 240
    :goto_7
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :goto_8
    move-object v1, v2

    .line 245
    :goto_9
    move-object v8, v1

    .line 246
    move-object v1, v0

    .line 247
    move-object v0, v8

    .line 248
    :goto_a
    if-eqz v0, :cond_a

    .line 249
    .line 250
    iget-object v0, v0, Lgb/i0$a;->a:Leb/e1;

    .line 251
    .line 252
    if-nez v0, :cond_a

    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_a
    move v3, v4

    .line 256
    :goto_b
    iget-object v0, p0, Lgb/i0$c;->b:Lgb/i0;

    .line 257
    .line 258
    iget-object v0, v0, Lgb/i0;->j:Leb/h1;

    .line 259
    .line 260
    new-instance v2, Lgb/i0$c$a;

    .line 261
    .line 262
    invoke-direct {v2, p0, v3}, Lgb/i0$c$a;-><init>(Lgb/i0$c;Z)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 266
    .line 267
    .line 268
    throw v1
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
