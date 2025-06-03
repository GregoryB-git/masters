.class public final Lhb/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/i;->g(Lgb/h2$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic b:Lhb/a;

.field public final synthetic c:Lhb/i;


# direct methods
.method public constructor <init>(Lhb/i;Ljava/util/concurrent/CountDownLatch;Lhb/a;)V
    .locals 0

    iput-object p1, p0, Lhb/i$b;->c:Lhb/i;

    iput-object p2, p0, Lhb/i$b;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lhb/i$b;->b:Lhb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lhb/i$b;->a:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 12
    .line 13
    .line 14
    :goto_0
    new-instance v0, Lhb/i$b$a;

    .line 15
    .line 16
    invoke-direct {v0}, Lhb/i$b$a;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lxc/s;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lxc/s;-><init>(Lxc/y;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const/4 v2, 0x1

    .line 26
    :try_start_1
    iget-object v3, p0, Lhb/i$b;->c:Lhb/i;

    .line 27
    .line 28
    iget-object v4, v3, Lhb/i;->Q:Leb/a0;

    .line 29
    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    iget-object v4, v3, Lhb/i;->A:Ljavax/net/SocketFactory;

    .line 33
    .line 34
    iget-object v3, v3, Lhb/i;->a:Ljava/net/InetSocketAddress;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v5, p0, Lhb/i$b;->c:Lhb/i;

    .line 41
    .line 42
    iget-object v5, v5, Lhb/i;->a:Ljava/net/InetSocketAddress;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v4, v3, v5}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :goto_1
    move-object v6, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    iget-object v5, v4, Leb/a0;->a:Ljava/net/SocketAddress;

    .line 55
    .line 56
    instance-of v6, v5, Ljava/net/InetSocketAddress;

    .line 57
    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    iget-object v6, v4, Leb/a0;->b:Ljava/net/InetSocketAddress;

    .line 61
    .line 62
    check-cast v5, Ljava/net/InetSocketAddress;

    .line 63
    .line 64
    iget-object v7, v4, Leb/a0;->c:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, v4, Leb/a0;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v3, v6, v5, v7, v4}, Lhb/i;->j(Lhb/i;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_1

    .line 73
    :goto_2
    iget-object v3, p0, Lhb/i$b;->c:Lhb/i;

    .line 74
    .line 75
    iget-object v4, v3, Lhb/i;->B:Ljavax/net/ssl/SSLSocketFactory;

    .line 76
    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    iget-object v5, v3, Lhb/i;->C:Ljavax/net/ssl/HostnameVerifier;

    .line 80
    .line 81
    invoke-virtual {v3}, Lhb/i;->m()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget-object v0, p0, Lhb/i$b;->c:Lhb/i;

    .line 86
    .line 87
    invoke-virtual {v0}, Lhb/i;->n()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    iget-object v0, p0, Lhb/i$b;->c:Lhb/i;

    .line 92
    .line 93
    iget-object v9, v0, Lhb/i;->F:Lib/b;

    .line 94
    .line 95
    invoke-static/range {v4 .. v9}, Lhb/n;->a(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Socket;Ljava/lang/String;ILib/b;)Ljavax/net/ssl/SSLSocket;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_1
    invoke-virtual {v6, v2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 104
    .line 105
    .line 106
    invoke-static {v6}, Lp2/m0;->b0(Ljava/net/Socket;)Lxc/e;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Lxc/s;

    .line 111
    .line 112
    invoke-direct {v3, v2}, Lxc/s;-><init>(Lxc/y;)V
    :try_end_1
    .catch Leb/f1; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 113
    .line 114
    .line 115
    :try_start_2
    iget-object v1, p0, Lhb/i$b;->b:Lhb/a;

    .line 116
    .line 117
    invoke-static {v6}, Lp2/m0;->a0(Ljava/net/Socket;)Lxc/d;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v1, v2, v6}, Lhb/a;->f(Lxc/d;Ljava/net/Socket;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lhb/i$b;->c:Lhb/i;

    .line 125
    .line 126
    iget-object v2, v1, Lhb/i;->u:Leb/a;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v4, Leb/a$a;

    .line 132
    .line 133
    invoke-direct {v4, v2}, Leb/a$a;-><init>(Leb/a;)V

    .line 134
    .line 135
    .line 136
    sget-object v2, Leb/z;->a:Leb/a$b;

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v2, v5}, Leb/a$a;->c(Leb/a$b;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v2, Leb/z;->b:Leb/a$b;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v4, v2, v5}, Leb/a$a;->c(Leb/a$b;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-object v2, Leb/z;->c:Leb/a$b;

    .line 155
    .line 156
    invoke-virtual {v4, v2, v0}, Leb/a$a;->c(Leb/a$b;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object v2, Lgb/u0;->a:Leb/a$b;

    .line 160
    .line 161
    if-nez v0, :cond_2

    .line 162
    .line 163
    sget-object v5, Leb/a1;->a:Leb/a1;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_2
    sget-object v5, Leb/a1;->b:Leb/a1;

    .line 167
    .line 168
    :goto_3
    invoke-virtual {v4, v2, v5}, Leb/a$a;->c(Leb/a$b;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Leb/a$a;->a()Leb/a;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iput-object v2, v1, Lhb/i;->u:Leb/a;
    :try_end_2
    .catch Leb/f1; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 176
    .line 177
    iget-object v1, p0, Lhb/i$b;->c:Lhb/i;

    .line 178
    .line 179
    new-instance v2, Lhb/i$d;

    .line 180
    .line 181
    iget-object v4, v1, Lhb/i;->g:Ljb/h;

    .line 182
    .line 183
    invoke-interface {v4, v3}, Ljb/h;->b(Lxc/s;)Ljb/f$c;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-direct {v2, v1, v3}, Lhb/i$d;-><init>(Lhb/i;Ljb/b;)V

    .line 188
    .line 189
    .line 190
    iput-object v2, v1, Lhb/i;->t:Lhb/i$d;

    .line 191
    .line 192
    iget-object v1, p0, Lhb/i$b;->c:Lhb/i;

    .line 193
    .line 194
    iget-object v1, v1, Lhb/i;->k:Ljava/lang/Object;

    .line 195
    .line 196
    monitor-enter v1

    .line 197
    :try_start_3
    iget-object v2, p0, Lhb/i$b;->c:Lhb/i;

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    iget-object v2, p0, Lhb/i$b;->c:Lhb/i;

    .line 205
    .line 206
    new-instance v3, Leb/c0$a;

    .line 207
    .line 208
    invoke-direct {v3, v0}, Leb/c0$a;-><init>(Ljavax/net/ssl/SSLSession;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    :cond_3
    monitor-exit v1

    .line 215
    return-void

    .line 216
    :catchall_0
    move-exception v0

    .line 217
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    throw v0

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    move-object v1, v3

    .line 221
    goto :goto_7

    .line 222
    :catch_1
    move-exception v0

    .line 223
    move-object v1, v3

    .line 224
    goto :goto_4

    .line 225
    :catch_2
    move-exception v0

    .line 226
    move-object v1, v3

    .line 227
    goto :goto_6

    .line 228
    :catchall_2
    move-exception v0

    .line 229
    goto :goto_7

    .line 230
    :catch_3
    move-exception v0

    .line 231
    goto :goto_4

    .line 232
    :catch_4
    move-exception v0

    .line 233
    goto :goto_6

    .line 234
    :cond_4
    :try_start_4
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 235
    .line 236
    new-instance v2, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v3, "Unsupported SocketAddress implementation "

    .line 242
    .line 243
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    iget-object v3, p0, Lhb/i$b;->c:Lhb/i;

    .line 247
    .line 248
    iget-object v3, v3, Lhb/i;->Q:Leb/a0;

    .line 249
    .line 250
    iget-object v3, v3, Leb/a0;->a:Ljava/net/SocketAddress;

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v0, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    new-instance v2, Leb/f1;

    .line 268
    .line 269
    invoke-direct {v2, v0}, Leb/f1;-><init>(Leb/e1;)V

    .line 270
    .line 271
    .line 272
    throw v2
    :try_end_4
    .catch Leb/f1; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 273
    :goto_4
    :try_start_5
    iget-object v2, p0, Lhb/i$b;->c:Lhb/i;

    .line 274
    .line 275
    invoke-virtual {v2, v0}, Lhb/i;->a(Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lhb/i$b;->c:Lhb/i;

    .line 279
    .line 280
    new-instance v2, Lhb/i$d;

    .line 281
    .line 282
    iget-object v3, v0, Lhb/i;->g:Ljb/h;

    .line 283
    .line 284
    invoke-interface {v3, v1}, Ljb/h;->b(Lxc/s;)Ljb/f$c;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v2, v0, v1}, Lhb/i$d;-><init>(Lhb/i;Ljb/b;)V

    .line 289
    .line 290
    .line 291
    :goto_5
    iput-object v2, v0, Lhb/i;->t:Lhb/i$d;

    .line 292
    .line 293
    return-void

    .line 294
    :goto_6
    :try_start_6
    iget-object v2, p0, Lhb/i$b;->c:Lhb/i;

    .line 295
    .line 296
    const/4 v3, 0x0

    .line 297
    sget-object v4, Ljb/a;->d:Ljb/a;

    .line 298
    .line 299
    iget-object v0, v0, Leb/f1;->a:Leb/e1;

    .line 300
    .line 301
    invoke-virtual {v2, v3, v4, v0}, Lhb/i;->t(ILjb/a;Leb/e1;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 302
    .line 303
    .line 304
    iget-object v0, p0, Lhb/i$b;->c:Lhb/i;

    .line 305
    .line 306
    new-instance v2, Lhb/i$d;

    .line 307
    .line 308
    iget-object v3, v0, Lhb/i;->g:Ljb/h;

    .line 309
    .line 310
    invoke-interface {v3, v1}, Ljb/h;->b(Lxc/s;)Ljb/f$c;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-direct {v2, v0, v1}, Lhb/i$d;-><init>(Lhb/i;Ljb/b;)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :goto_7
    iget-object v2, p0, Lhb/i$b;->c:Lhb/i;

    .line 319
    .line 320
    new-instance v3, Lhb/i$d;

    .line 321
    .line 322
    iget-object v4, v2, Lhb/i;->g:Ljb/h;

    .line 323
    .line 324
    invoke-interface {v4, v1}, Ljb/h;->b(Lxc/s;)Ljb/f$c;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-direct {v3, v2, v1}, Lhb/i$d;-><init>(Lhb/i;Ljb/b;)V

    .line 329
    .line 330
    .line 331
    iput-object v3, v2, Lhb/i;->t:Lhb/i$d;

    .line 332
    .line 333
    throw v0
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
