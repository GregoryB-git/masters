.class public final synthetic Lx3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    iput p1, p0, Lx3/j;->a:I

    iput-object p2, p0, Lx3/j;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lx3/j;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lx3/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lx3/j;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lx3/l$a;

    .line 10
    .line 11
    iget-boolean v1, p0, Lx3/j;->b:Z

    .line 12
    .line 13
    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    .line 14
    .line 15
    sget v2, Lv5/e0;->a:I

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lx3/l;->o(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    iget-object v0, p0, Lx3/j;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lu9/c;

    .line 24
    .line 25
    iget-boolean v1, p0, Lx3/j;->b:Z

    .line 26
    .line 27
    sget-object v2, Lu9/c;->m:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v2, Lu9/c;->m:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v2

    .line 35
    :try_start_0
    iget-object v3, v0, Lu9/c;->a:Lu7/f;

    .line 36
    .line 37
    invoke-virtual {v3}, Lu7/f;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v3, v3, Lu7/f;->a:Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {v3}, Lr4/c;->b(Landroid/content/Context;)Lr4/c;

    .line 43
    .line 44
    .line 45
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 46
    :try_start_1
    iget-object v4, v0, Lu9/c;->c:Lw9/c;

    .line 47
    .line 48
    invoke-virtual {v4}, Lw9/c;->c()Lw9/a;

    .line 49
    .line 50
    .line 51
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    :try_start_2
    invoke-virtual {v3}, Lr4/c;->g()V

    .line 55
    .line 56
    .line 57
    :cond_0
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 58
    :try_start_3
    invoke-virtual {v4}, Lw9/a;->f()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v5, 0x5

    .line 63
    const/4 v6, 0x1

    .line 64
    const/4 v7, 0x0

    .line 65
    if-ne v3, v5, :cond_1

    .line 66
    .line 67
    move v3, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move v3, v7

    .line 70
    :goto_1
    if-nez v3, :cond_5

    .line 71
    .line 72
    invoke-virtual {v4}, Lw9/a;->f()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v8, 0x3

    .line 77
    if-ne v3, v8, :cond_2

    .line 78
    .line 79
    move v3, v6

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v3, v7

    .line 82
    :goto_2
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_3
    if-nez v1, :cond_4

    .line 86
    .line 87
    iget-object v1, v0, Lu9/c;->d:Lu9/k;

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Lu9/k;->b(Lw9/a;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_12

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :catch_0
    move-exception v1

    .line 97
    goto/16 :goto_b

    .line 98
    .line 99
    :cond_4
    :goto_3
    invoke-virtual {v0, v4}, Lu9/c;->c(Lw9/a;)Lw9/a;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_5

    .line 104
    :cond_5
    :goto_4
    invoke-virtual {v0, v4}, Lu9/c;->f(Lw9/a;)Lw9/a;

    .line 105
    .line 106
    .line 107
    move-result-object v1
    :try_end_3
    .catch Lu9/e; {:try_start_3 .. :try_end_3} :catch_0

    .line 108
    :goto_5
    monitor-enter v2

    .line 109
    :try_start_4
    iget-object v3, v0, Lu9/c;->a:Lu7/f;

    .line 110
    .line 111
    invoke-virtual {v3}, Lu7/f;->a()V

    .line 112
    .line 113
    .line 114
    iget-object v3, v3, Lu7/f;->a:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {v3}, Lr4/c;->b(Landroid/content/Context;)Lr4/c;

    .line 117
    .line 118
    .line 119
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 120
    :try_start_5
    iget-object v8, v0, Lu9/c;->c:Lw9/c;

    .line 121
    .line 122
    invoke-virtual {v8, v1}, Lw9/c;->b(Lw9/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 123
    .line 124
    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    :try_start_6
    invoke-virtual {v3}, Lr4/c;->g()V

    .line 128
    .line 129
    .line 130
    :cond_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 131
    monitor-enter v0

    .line 132
    :try_start_7
    iget-object v2, v0, Lu9/c;->k:Ljava/util/HashSet;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_7

    .line 139
    .line 140
    iget-object v2, v4, Lw9/a;->b:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v3, v1, Lw9/a;->b:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_7

    .line 149
    .line 150
    iget-object v2, v0, Lu9/c;->k:Ljava/util/HashSet;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_7

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lv9/a;

    .line 167
    .line 168
    invoke-interface {v3}, Lv9/a;->a()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_7
    monitor-exit v0

    .line 173
    invoke-virtual {v1}, Lw9/a;->f()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    const/4 v3, 0x4

    .line 178
    if-ne v2, v3, :cond_8

    .line 179
    .line 180
    move v2, v6

    .line 181
    goto :goto_7

    .line 182
    :cond_8
    move v2, v7

    .line 183
    :goto_7
    if-eqz v2, :cond_9

    .line 184
    .line 185
    iget-object v2, v1, Lw9/a;->b:Ljava/lang/String;

    .line 186
    .line 187
    monitor-enter v0

    .line 188
    :try_start_8
    iput-object v2, v0, Lu9/c;->j:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 189
    .line 190
    monitor-exit v0

    .line 191
    goto :goto_8

    .line 192
    :catchall_0
    move-exception v1

    .line 193
    monitor-exit v0

    .line 194
    throw v1

    .line 195
    :cond_9
    :goto_8
    invoke-virtual {v1}, Lw9/a;->f()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-ne v2, v5, :cond_a

    .line 200
    .line 201
    move v2, v6

    .line 202
    goto :goto_9

    .line 203
    :cond_a
    move v2, v7

    .line 204
    :goto_9
    if-eqz v2, :cond_b

    .line 205
    .line 206
    new-instance v1, Lu9/e;

    .line 207
    .line 208
    invoke-direct {v1}, Lu9/e;-><init>()V

    .line 209
    .line 210
    .line 211
    goto :goto_b

    .line 212
    :cond_b
    iget v2, v1, Lw9/a;->c:I

    .line 213
    .line 214
    const/4 v3, 0x2

    .line 215
    if-eq v2, v3, :cond_d

    .line 216
    .line 217
    if-ne v2, v6, :cond_c

    .line 218
    .line 219
    goto :goto_a

    .line 220
    :cond_c
    move v6, v7

    .line 221
    :cond_d
    :goto_a
    if-eqz v6, :cond_e

    .line 222
    .line 223
    new-instance v1, Ljava/io/IOException;

    .line 224
    .line 225
    const-string v2, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    .line 226
    .line 227
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_b

    .line 231
    :cond_e
    invoke-virtual {v0, v1}, Lu9/c;->g(Lw9/a;)V

    .line 232
    .line 233
    .line 234
    goto :goto_d

    .line 235
    :catchall_1
    move-exception v1

    .line 236
    monitor-exit v0

    .line 237
    throw v1

    .line 238
    :catchall_2
    move-exception v0

    .line 239
    if-eqz v3, :cond_f

    .line 240
    .line 241
    :try_start_9
    invoke-virtual {v3}, Lr4/c;->g()V

    .line 242
    .line 243
    .line 244
    :cond_f
    throw v0

    .line 245
    :catchall_3
    move-exception v0

    .line 246
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 247
    throw v0

    .line 248
    :goto_b
    iget-object v3, v0, Lu9/c;->g:Ljava/lang/Object;

    .line 249
    .line 250
    monitor-enter v3

    .line 251
    :try_start_a
    iget-object v0, v0, Lu9/c;->l:Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    :cond_10
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_11

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, Lu9/j;

    .line 268
    .line 269
    invoke-interface {v2, v1}, Lu9/j;->a(Ljava/lang/Exception;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_10

    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 276
    .line 277
    .line 278
    goto :goto_c

    .line 279
    :cond_11
    monitor-exit v3

    .line 280
    :cond_12
    :goto_d
    return-void

    .line 281
    :catchall_4
    move-exception v0

    .line 282
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 283
    throw v0

    .line 284
    :catchall_5
    move-exception v0

    .line 285
    if-eqz v3, :cond_13

    .line 286
    .line 287
    :try_start_b
    invoke-virtual {v3}, Lr4/c;->g()V

    .line 288
    .line 289
    .line 290
    :cond_13
    throw v0

    .line 291
    :catchall_6
    move-exception v0

    .line 292
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 293
    throw v0

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
