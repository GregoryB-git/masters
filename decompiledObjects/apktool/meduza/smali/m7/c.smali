.class public final Lm7/c;
.super Lm7/w;
.source "SourceFile"


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm7/c;->o:I

    iput-object p1, p0, Lm7/c;->p:Ljava/lang/Object;

    invoke-direct {p0}, Lm7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget v0, p0, Lm7/c;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lm7/d;

    .line 12
    .line 13
    iget-object v0, v0, Lm7/d;->a:Lm7/e;

    .line 14
    .line 15
    iget-object v3, v0, Lm7/e;->b:Lm7/v;

    .line 16
    .line 17
    new-array v4, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v5, "unlinkToDeath"

    .line 20
    .line 21
    invoke-virtual {v3, v5, v4}, Lm7/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, Lm7/e;->n:Landroid/os/IInterface;

    .line 25
    .line 26
    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v0, v0, Lm7/e;->k:Lm7/x;

    .line 31
    .line 32
    invoke-interface {v3, v0, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lm7/d;

    .line 38
    .line 39
    iget-object v0, v0, Lm7/d;->a:Lm7/e;

    .line 40
    .line 41
    iput-object v1, v0, Lm7/e;->n:Landroid/os/IInterface;

    .line 42
    .line 43
    iput-boolean v2, v0, Lm7/e;->g:Z

    .line 44
    .line 45
    return-void

    .line 46
    :goto_0
    iget-object v0, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lm7/e;

    .line 49
    .line 50
    iget-object v0, v0, Lm7/e;->f:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v3, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lm7/e;

    .line 56
    .line 57
    iget-object v3, v3, Lm7/e;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-lez v3, :cond_0

    .line 64
    .line 65
    iget-object v3, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lm7/e;

    .line 68
    .line 69
    iget-object v3, v3, Lm7/e;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-lez v3, :cond_0

    .line 76
    .line 77
    iget-object v1, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lm7/e;

    .line 80
    .line 81
    iget-object v1, v1, Lm7/e;->b:Lm7/v;

    .line 82
    .line 83
    const-string v3, "Leaving the connection open for other ongoing calls."

    .line 84
    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v1, v3, v2}, Lm7/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    iget-object v3, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, Lm7/e;

    .line 94
    .line 95
    iget-object v4, v3, Lm7/e;->n:Landroid/os/IInterface;

    .line 96
    .line 97
    if-eqz v4, :cond_1

    .line 98
    .line 99
    iget-object v3, v3, Lm7/e;->b:Lm7/v;

    .line 100
    .line 101
    const-string v4, "Unbind from service."

    .line 102
    .line 103
    new-array v5, v2, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-virtual {v3, v4, v5}, Lm7/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Lm7/e;

    .line 111
    .line 112
    iget-object v4, v3, Lm7/e;->a:Landroid/content/Context;

    .line 113
    .line 114
    iget-object v3, v3, Lm7/e;->m:Lm7/d;

    .line 115
    .line 116
    invoke-virtual {v4, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v4, v3

    .line 122
    check-cast v4, Lm7/e;

    .line 123
    .line 124
    iput-boolean v2, v4, Lm7/e;->g:Z

    .line 125
    .line 126
    move-object v2, v3

    .line 127
    check-cast v2, Lm7/e;

    .line 128
    .line 129
    iput-object v1, v2, Lm7/e;->n:Landroid/os/IInterface;

    .line 130
    .line 131
    check-cast v3, Lm7/e;

    .line 132
    .line 133
    iput-object v1, v3, Lm7/e;->m:Lm7/d;

    .line 134
    .line 135
    :cond_1
    iget-object v1, p0, Lm7/c;->p:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Lm7/e;

    .line 138
    .line 139
    invoke-virtual {v1}, Lm7/e;->e()V

    .line 140
    .line 141
    .line 142
    :goto_1
    monitor-exit v0

    .line 143
    return-void

    .line 144
    :catchall_0
    move-exception v1

    .line 145
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    throw v1

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
