.class public final synthetic Lm9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm9/w;->a:I

    iput-object p1, p0, Lm9/w;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lm9/w;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :pswitch_0
    iget-object v0, p0, Lm9/w;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lm9/y;

    .line 12
    .line 13
    iget-object v2, v0, Lm9/y;->e:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v3, v0, Lm9/y;->f:Lg9/h;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    :try_start_0
    invoke-static {v2}, Lf7/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Lj6/g; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lj6/h; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catch_0
    move-exception v6

    .line 24
    goto :goto_0

    .line 25
    :catch_1
    move-exception v6

    .line 26
    goto :goto_0

    .line 27
    :catch_2
    move-exception v6

    .line 28
    :goto_0
    const-string v7, "GrpcCallProvider"

    .line 29
    .line 30
    const-string v8, "Failed to update ssl context: %s"

    .line 31
    .line 32
    new-array v9, v5, [Ljava/lang/Object;

    .line 33
    .line 34
    aput-object v6, v9, v4

    .line 35
    .line 36
    const/4 v6, 0x2

    .line 37
    invoke-static {v6, v7, v8, v9}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    iget-object v6, v3, Lg9/h;->c:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v7, Leb/r0;->c:Ljava/util/logging/Logger;

    .line 43
    .line 44
    const-class v7, Leb/p0;

    .line 45
    .line 46
    const-class v8, Leb/r0;

    .line 47
    .line 48
    monitor-enter v8

    .line 49
    :try_start_1
    sget-object v9, Leb/r0;->d:Leb/r0;

    .line 50
    .line 51
    if-nez v9, :cond_1

    .line 52
    .line 53
    invoke-static {}, Leb/r0;->a()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    new-instance v11, Leb/r0$a;

    .line 62
    .line 63
    invoke-direct {v11}, Leb/r0$a;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v7, v9, v10, v11}, Leb/d1;->a(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Leb/d1$a;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    new-instance v9, Leb/r0;

    .line 71
    .line 72
    invoke-direct {v9}, Leb/r0;-><init>()V

    .line 73
    .line 74
    .line 75
    sput-object v9, Leb/r0;->d:Leb/r0;

    .line 76
    .line 77
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_0

    .line 86
    .line 87
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    check-cast v9, Leb/p0;

    .line 92
    .line 93
    sget-object v10, Leb/r0;->c:Ljava/util/logging/Logger;

    .line 94
    .line 95
    new-instance v11, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v12, "Service loader found "

    .line 101
    .line 102
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v10, Leb/r0;->d:Leb/r0;

    .line 116
    .line 117
    monitor-enter v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 118
    :try_start_2
    invoke-virtual {v9}, Leb/p0;->b()Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    const-string v12, "isAvailable() returned false"

    .line 123
    .line 124
    invoke-static {v12, v11}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    iget-object v11, v10, Leb/r0;->a:Ljava/util/LinkedHashSet;

    .line 128
    .line 129
    invoke-virtual {v11, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 130
    .line 131
    .line 132
    :try_start_3
    monitor-exit v10

    .line 133
    goto :goto_2

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    monitor-exit v10

    .line 136
    throw v0

    .line 137
    :cond_0
    sget-object v7, Leb/r0;->d:Leb/r0;

    .line 138
    .line 139
    monitor-enter v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 140
    :try_start_4
    new-instance v9, Ljava/util/ArrayList;

    .line 141
    .line 142
    iget-object v10, v7, Leb/r0;->a:Ljava/util/LinkedHashSet;

    .line 143
    .line 144
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 145
    .line 146
    .line 147
    new-instance v10, Leb/q0;

    .line 148
    .line 149
    invoke-direct {v10}, Leb/q0;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-static {v10}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-static {v9, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    iput-object v9, v7, Leb/r0;->b:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 164
    .line 165
    :try_start_5
    monitor-exit v7

    .line 166
    goto :goto_3

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    monitor-exit v7

    .line 169
    throw v0

    .line 170
    :cond_1
    :goto_3
    sget-object v7, Leb/r0;->d:Leb/r0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 171
    .line 172
    monitor-exit v8

    .line 173
    monitor-enter v7

    .line 174
    :try_start_6
    iget-object v8, v7, Leb/r0;->b:Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 175
    .line 176
    monitor-exit v7

    .line 177
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_2

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_2
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Leb/p0;

    .line 189
    .line 190
    :goto_4
    if-eqz v1, :cond_4

    .line 191
    .line 192
    invoke-virtual {v1, v6}, Leb/p0;->a(Ljava/lang/String;)Leb/o0;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget-boolean v3, v3, Lg9/h;->d:Z

    .line 197
    .line 198
    if-nez v3, :cond_3

    .line 199
    .line 200
    invoke-virtual {v1}, Leb/o0;->c()V

    .line 201
    .line 202
    .line 203
    :cond_3
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 204
    .line 205
    invoke-virtual {v1, v3}, Leb/o0;->b(Ljava/util/concurrent/TimeUnit;)V

    .line 206
    .line 207
    .line 208
    new-instance v3, Lfb/a;

    .line 209
    .line 210
    invoke-direct {v3, v1}, Lfb/a;-><init>(Leb/o0;)V

    .line 211
    .line 212
    .line 213
    iput-object v2, v3, Lfb/a;->b:Landroid/content/Context;

    .line 214
    .line 215
    invoke-virtual {v3}, Lfb/a;->a()Leb/n0;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    iget-object v2, v0, Lm9/y;->b:Ln9/a;

    .line 220
    .line 221
    new-instance v3, Lm9/x;

    .line 222
    .line 223
    invoke-direct {v3, v0, v1, v4}, Lm9/x;-><init>(Lm9/y;Leb/n0;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v3}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 227
    .line 228
    .line 229
    sget-object v2, Leb/c;->k:Leb/c;

    .line 230
    .line 231
    sget-object v3, Lmb/a;->a:Leb/c$b;

    .line 232
    .line 233
    sget-object v6, Lmb/a$a;->a:Lmb/a$a;

    .line 234
    .line 235
    invoke-virtual {v2, v3, v6}, Leb/c;->c(Leb/c$b;Ljava/lang/Object;)Leb/c;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    iget-object v3, v0, Lm9/y;->g:Leb/b;

    .line 240
    .line 241
    invoke-static {v2}, Leb/c;->b(Leb/c;)Leb/c$a;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    iput-object v3, v2, Leb/c$a;->d:Leb/b;

    .line 246
    .line 247
    new-instance v3, Leb/c;

    .line 248
    .line 249
    invoke-direct {v3, v2}, Leb/c;-><init>(Leb/c$a;)V

    .line 250
    .line 251
    .line 252
    iget-object v2, v0, Lm9/y;->b:Ln9/a;

    .line 253
    .line 254
    iget-object v2, v2, Ln9/a;->a:Ln9/a$b;

    .line 255
    .line 256
    invoke-static {v3}, Leb/c;->b(Leb/c;)Leb/c$a;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    iput-object v2, v3, Leb/c$a;->b:Ljava/util/concurrent/Executor;

    .line 261
    .line 262
    new-instance v2, Leb/c;

    .line 263
    .line 264
    invoke-direct {v2, v3}, Leb/c;-><init>(Leb/c$a;)V

    .line 265
    .line 266
    .line 267
    iput-object v2, v0, Lm9/y;->c:Leb/c;

    .line 268
    .line 269
    const-string v0, "GrpcCallProvider"

    .line 270
    .line 271
    const-string v2, "Channel successfully reset."

    .line 272
    .line 273
    new-array v3, v4, [Ljava/lang/Object;

    .line 274
    .line 275
    invoke-static {v5, v0, v2, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-object v1

    .line 279
    :cond_4
    new-instance v0, Leb/p0$a;

    .line 280
    .line 281
    invoke-direct {v0}, Leb/p0$a;-><init>()V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :catchall_2
    move-exception v0

    .line 286
    monitor-exit v7

    .line 287
    throw v0

    .line 288
    :catchall_3
    move-exception v0

    .line 289
    monitor-exit v8

    .line 290
    throw v0

    .line 291
    :goto_5
    iget-object v0, p0, Lm9/w;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Ljava/lang/Runnable;

    .line 294
    .line 295
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 296
    .line 297
    .line 298
    return-object v1

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
