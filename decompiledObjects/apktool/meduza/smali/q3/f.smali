.class public final synthetic Lq3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lq3/f;->a:I

    iput-object p1, p0, Lq3/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lq3/f;->d:Ljava/lang/Object;

    iput p3, p0, Lq3/f;->b:I

    iput-object p4, p0, Lq3/f;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lq3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_2

    .line 7
    :pswitch_0
    iget-object v0, p0, Lq3/f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lq3/k;

    .line 10
    .line 11
    iget-object v1, p0, Lq3/f;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lk3/s;

    .line 14
    .line 15
    iget v2, p0, Lq3/f;->b:I

    .line 16
    .line 17
    iget-object v3, p0, Lq3/f;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/lang/Runnable;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    :try_start_0
    iget-object v5, v0, Lq3/k;->f:Ls3/b;

    .line 26
    .line 27
    iget-object v6, v0, Lq3/k;->c:Lr3/d;

    .line 28
    .line 29
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    new-instance v7, Lio/flutter/plugins/firebase/auth/g;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    invoke-direct {v7, v6, v8}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5, v7}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v5, v0, Lq3/k;->a:Landroid/content/Context;

    .line 42
    .line 43
    const-string v6, "connectivity"

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 50
    .line 51
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_0

    .line 62
    .line 63
    move v8, v4

    .line 64
    :cond_0
    if-nez v8, :cond_1

    .line 65
    .line 66
    iget-object v5, v0, Lq3/k;->f:Ls3/b;

    .line 67
    .line 68
    new-instance v6, Lq3/g;

    .line 69
    .line 70
    invoke-direct {v6, v0, v1, v2}, Lq3/g;-><init>(Lq3/k;Lk3/s;I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v5, v6}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v0, v1, v2}, Lq3/k;->a(Lk3/s;I)V
    :try_end_0
    .catch Ls3/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    :try_start_1
    iget-object v0, v0, Lq3/k;->d:Lq3/n;

    .line 84
    .line 85
    add-int/2addr v2, v4

    .line 86
    invoke-interface {v0, v1, v2}, Lq3/n;->b(Lk3/s;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :goto_1
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :goto_2
    iget-object v0, p0, Lq3/f;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Li9/m0;

    .line 100
    .line 101
    iget-object v1, p0, Lq3/f;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, [B

    .line 104
    .line 105
    iget v2, p0, Lq3/f;->b:I

    .line 106
    .line 107
    iget-object v3, p0, Lq3/f;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Ljava/util/Map;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Li9/m0;->g([BI)Lk9/b;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    monitor-enter v3

    .line 116
    :try_start_2
    invoke-virtual {v0}, Lk9/k;->a()Lj9/i;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    monitor-exit v3

    .line 124
    return-void

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    throw v0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
