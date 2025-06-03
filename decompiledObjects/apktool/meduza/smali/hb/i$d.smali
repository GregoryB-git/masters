.class public final Lhb/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/b$a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Lhb/j;

.field public b:Ljb/b;

.field public c:Z

.field public final synthetic d:Lhb/i;


# direct methods
.method public constructor <init>(Lhb/i;Ljb/b;)V
    .locals 1

    iput-object p1, p0, Lhb/i$d;->d:Lhb/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lhb/j;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-direct {p1, v0}, Lhb/j;-><init>(Ljava/util/logging/Level;)V

    iput-object p1, p0, Lhb/i$d;->a:Lhb/j;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb/i$d;->c:Z

    iput-object p2, p0, Lhb/i$d;->b:Ljb/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "OkHttpClientTransport"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 19
    :try_start_0
    iget-object v2, p0, Lhb/i$d;->b:Ljb/b;

    .line 20
    .line 21
    check-cast v2, Ljb/f$c;

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljb/f$c;->f(Ljb/b$a;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lhb/i$d;->d:Lhb/i;

    .line 30
    .line 31
    iget-object v2, v2, Lhb/i;->G:Lgb/o1;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Lgb/o1;->a()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, p0, Lhb/i$d;->d:Lhb/i;

    .line 40
    .line 41
    iget-object v2, v2, Lhb/i;->k:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    :try_start_1
    iget-object v3, p0, Lhb/i$d;->d:Lhb/i;

    .line 45
    .line 46
    iget-object v3, v3, Lhb/i;->v:Leb/e1;

    .line 47
    .line 48
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    :try_start_2
    sget-object v2, Leb/e1;->n:Leb/e1;

    .line 52
    .line 53
    const-string v3, "End of stream or IOException"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_2
    iget-object v2, p0, Lhb/i$d;->d:Lhb/i;

    .line 60
    .line 61
    sget-object v4, Ljb/a;->d:Ljb/a;

    .line 62
    .line 63
    invoke-virtual {v2, v1, v4, v3}, Lhb/i;->t(ILjb/a;Leb/e1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    :try_start_3
    iget-object v1, p0, Lhb/i$d;->b:Ljb/b;

    .line 67
    .line 68
    check-cast v1, Ljb/f$c;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljb/f$c;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catch_0
    move-exception v1

    .line 75
    const-string v2, "bio == null"

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    throw v1

    .line 89
    :catch_1
    move-exception v1

    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception v3

    .line 92
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 94
    :catchall_1
    move-exception v2

    .line 95
    :try_start_6
    iget-object v3, p0, Lhb/i$d;->d:Lhb/i;

    .line 96
    .line 97
    sget-object v4, Ljb/a;->c:Ljb/a;

    .line 98
    .line 99
    sget-object v5, Leb/e1;->m:Leb/e1;

    .line 100
    .line 101
    const-string v6, "error in frame handler"

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5, v2}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v5, Lhb/i;->S:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {v3, v1, v4, v2}, Lhb/i;->t(ILjb/a;Leb/e1;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 114
    .line 115
    .line 116
    :try_start_7
    iget-object v1, p0, Lhb/i$d;->b:Ljb/b;

    .line 117
    .line 118
    check-cast v1, Ljb/f$c;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljb/f$c;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catch_2
    move-exception v1

    .line 125
    const-string v2, "bio == null"

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    throw v1

    .line 139
    :catch_3
    move-exception v1

    .line 140
    :goto_1
    sget-object v2, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 141
    .line 142
    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 143
    .line 144
    const-string v4, "Exception closing frame reader"

    .line 145
    .line 146
    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :goto_2
    iget-object v1, p0, Lhb/i$d;->d:Lhb/i;

    .line 150
    .line 151
    iget-object v1, v1, Lhb/i;->h:Lgb/h2$a;

    .line 152
    .line 153
    invoke-interface {v1}, Lgb/h2$a;->d()V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :catchall_2
    move-exception v1

    .line 165
    :try_start_8
    iget-object v2, p0, Lhb/i$d;->b:Ljb/b;

    .line 166
    .line 167
    check-cast v2, Ljb/f$c;

    .line 168
    .line 169
    invoke-virtual {v2}, Ljb/f$c;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catch_4
    move-exception v2

    .line 174
    const-string v3, "bio == null"

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_5

    .line 185
    .line 186
    throw v2

    .line 187
    :catch_5
    move-exception v2

    .line 188
    sget-object v3, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 189
    .line 190
    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 191
    .line 192
    const-string v5, "Exception closing frame reader"

    .line 193
    .line 194
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    :goto_3
    iget-object v2, p0, Lhb/i$d;->d:Lhb/i;

    .line 198
    .line 199
    iget-object v2, v2, Lhb/i;->h:Lgb/h2$a;

    .line 200
    .line 201
    invoke-interface {v2}, Lgb/h2$a;->d()V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v1
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
