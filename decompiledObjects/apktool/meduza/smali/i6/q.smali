.class public final synthetic Li6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Li6/q;->a:I

    iput-object p1, p0, Li6/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li6/q;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/q;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Li6/q;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :pswitch_0
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Le7/i5;

    .line 12
    .line 13
    iget-object v0, v0, Le7/i5;->c:Le7/w4;

    .line 14
    .line 15
    new-instance v2, Landroid/content/ComponentName;

    .line 16
    .line 17
    iget-object v3, p0, Li6/q;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Le7/i5;

    .line 20
    .line 21
    iget-object v3, v3, Le7/i5;->c:Le7/w4;

    .line 22
    .line 23
    invoke-virtual {v3}, Ld2/q;->zza()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v0, Le7/w4;->e:Le7/n0;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    iput-object v1, v0, Le7/w4;->e:Le7/n0;

    .line 40
    .line 41
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 46
    .line 47
    const-string v3, "Disconnected from device MeasurementService"

    .line 48
    .line 49
    invoke-virtual {v1, v3, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Le7/w4;->A()V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :pswitch_1
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Le7/k3;

    .line 62
    .line 63
    invoke-virtual {v0}, Le7/k3;->L()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    const/4 v0, 0x0

    .line 68
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Runnable;

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_3
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lcom/google/android/gms/common/api/internal/zact;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/zact;->u:Ll6/r0;

    .line 84
    .line 85
    new-instance v1, Lj6/b;

    .line 86
    .line 87
    const/4 v2, 0x4

    .line 88
    invoke-direct {v1, v2}, Lj6/b;-><init>(I)V

    .line 89
    .line 90
    .line 91
    check-cast v0, Ll6/g0;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ll6/g0;->b(Lj6/b;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :goto_0
    :pswitch_4
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Li6/u;

    .line 100
    .line 101
    monitor-enter v0

    .line 102
    :try_start_0
    iget v1, v0, Li6/u;->a:I

    .line 103
    .line 104
    const/4 v2, 0x2

    .line 105
    if-eq v1, v2, :cond_1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    iget-object v1, v0, Li6/u;->d:Ljava/util/ArrayDeque;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    invoke-virtual {v0}, Li6/u;->c()V

    .line 117
    .line 118
    .line 119
    :goto_1
    monitor-exit v0

    .line 120
    return-void

    .line 121
    :cond_2
    iget-object v1, v0, Li6/u;->d:Ljava/util/ArrayDeque;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Li6/x;

    .line 128
    .line 129
    iget-object v3, v0, Li6/u;->e:Landroid/util/SparseArray;

    .line 130
    .line 131
    iget v4, v1, Li6/x;->a:I

    .line 132
    .line 133
    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, v0, Li6/u;->f:Li6/z;

    .line 137
    .line 138
    iget-object v3, v3, Li6/z;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 139
    .line 140
    new-instance v4, Li6/t;

    .line 141
    .line 142
    invoke-direct {v4, v0, v1}, Li6/t;-><init>(Li6/u;Li6/x;)V

    .line 143
    .line 144
    .line 145
    const-wide/16 v5, 0x1e

    .line 146
    .line 147
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 148
    .line 149
    invoke-interface {v3, v4, v5, v6, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 150
    .line 151
    .line 152
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    const-string v3, "MessengerIpcClient"

    .line 154
    .line 155
    const/4 v4, 0x3

    .line 156
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_3

    .line 161
    .line 162
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v4, "Sending "

    .line 167
    .line 168
    const-string v5, "MessengerIpcClient"

    .line 169
    .line 170
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    :cond_3
    iget-object v3, v0, Li6/u;->f:Li6/z;

    .line 178
    .line 179
    iget-object v4, v0, Li6/u;->b:Landroid/os/Messenger;

    .line 180
    .line 181
    iget v5, v1, Li6/x;->c:I

    .line 182
    .line 183
    iget-object v3, v3, Li6/z;->a:Landroid/content/Context;

    .line 184
    .line 185
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    iput v5, v6, Landroid/os/Message;->what:I

    .line 190
    .line 191
    iget v5, v1, Li6/x;->a:I

    .line 192
    .line 193
    iput v5, v6, Landroid/os/Message;->arg1:I

    .line 194
    .line 195
    iput-object v4, v6, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 196
    .line 197
    new-instance v4, Landroid/os/Bundle;

    .line 198
    .line 199
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Li6/x;->b()Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    const-string v7, "oneWay"

    .line 207
    .line 208
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const-string v5, "pkg"

    .line 216
    .line 217
    invoke-virtual {v4, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-object v1, v1, Li6/x;->d:Landroid/os/Bundle;

    .line 221
    .line 222
    const-string v3, "data"

    .line 223
    .line 224
    invoke-virtual {v4, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 228
    .line 229
    .line 230
    :try_start_1
    iget-object v1, v0, Li6/u;->c:Li6/v;

    .line 231
    .line 232
    iget-object v3, v1, Li6/v;->a:Landroid/os/Messenger;

    .line 233
    .line 234
    if-eqz v3, :cond_4

    .line 235
    .line 236
    invoke-virtual {v3, v6}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_4
    iget-object v1, v1, Li6/v;->b:Li6/k;

    .line 242
    .line 243
    if-eqz v1, :cond_5

    .line 244
    .line 245
    iget-object v1, v1, Li6/k;->a:Landroid/os/Messenger;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v6}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 256
    .line 257
    const-string v3, "Both messengers are null"

    .line 258
    .line 259
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 263
    :catch_0
    move-exception v1

    .line 264
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v0, v2, v1}, Li6/u;->a(ILjava/lang/String;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :catchall_0
    move-exception v1

    .line 274
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 275
    throw v1

    .line 276
    :goto_2
    iget-object v0, p0, Li6/q;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Le7/u6;

    .line 279
    .line 280
    iget-object v0, v0, Le7/u6;->a:Le7/j2;

    .line 281
    .line 282
    iget-object v0, v0, Le7/j2;->F:Le7/o4;

    .line 283
    .line 284
    if-eqz v0, :cond_6

    .line 285
    .line 286
    sget-object v2, Le7/h0;->z:Le7/m0;

    .line 287
    .line 288
    invoke-virtual {v2, v1}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Ljava/lang/Long;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 295
    .line 296
    .line 297
    move-result-wide v1

    .line 298
    invoke-virtual {v0, v1, v2}, Le7/o4;->v(J)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    const-string v1, "Component not created"

    .line 305
    .line 306
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
