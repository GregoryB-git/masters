.class public final Lx/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/e$a;
    }
.end annotation


# static fields
.field public static final a:Lx/l;

.field public static final b:Lr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/f<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lx/j;

    .line 8
    .line 9
    invoke-direct {v0}, Lx/j;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    sput-object v0, Lx/e;->a:Lx/l;

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lx/i;

    .line 20
    .line 21
    invoke-direct {v0}, Lx/i;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/16 v1, 0x1a

    .line 26
    .line 27
    if-lt v0, v1, :cond_2

    .line 28
    .line 29
    new-instance v0, Lx/h;

    .line 30
    .line 31
    invoke-direct {v0}, Lx/h;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/16 v1, 0x18

    .line 36
    .line 37
    if-lt v0, v1, :cond_5

    .line 38
    .line 39
    sget-object v0, Lx/g;->c:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    const-string v1, "TypefaceCompatApi24Impl"

    .line 44
    .line 45
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 46
    .line 47
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_3
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    const/4 v0, 0x0

    .line 55
    :goto_1
    if-eqz v0, :cond_5

    .line 56
    .line 57
    new-instance v0, Lx/g;

    .line 58
    .line 59
    invoke-direct {v0}, Lx/g;-><init>()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    new-instance v0, Lx/f;

    .line 64
    .line 65
    invoke-direct {v0}, Lx/f;-><init>()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_2
    new-instance v0, Lr/f;

    .line 70
    .line 71
    const/16 v1, 0x10

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lr/f;-><init>(I)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lx/e;->b:Lr/f;

    .line 77
    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static a(Landroid/content/Context;Lw/d$b;Landroid/content/res/Resources;ILjava/lang/String;IILl/b0$a;)Landroid/graphics/Typeface;
    .locals 7

    .line 1
    instance-of v0, p1, Lw/d$e;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    check-cast p1, Lw/d$e;

    .line 6
    .line 7
    iget-object v0, p1, Lw/d$e;->d:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v0, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 25
    .line 26
    invoke-static {v3, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move-object v0, v1

    .line 40
    :goto_1
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p7, v0}, Lw/f$e;->b(Landroid/graphics/Typeface;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    const/4 v0, 0x1

    .line 47
    iget v3, p1, Lw/d$e;->c:I

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    move v2, v0

    .line 52
    :cond_3
    const/4 v0, -0x1

    .line 53
    iget v3, p1, Lw/d$e;->b:I

    .line 54
    .line 55
    new-instance v4, Landroid/os/Handler;

    .line 56
    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lx/e$a;

    .line 65
    .line 66
    invoke-direct {v5, p7}, Lx/e$a;-><init>(Ll/b0$a;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p1, Lw/d$e;->a:Lb0/g;

    .line 70
    .line 71
    new-instance p7, Lb0/c;

    .line 72
    .line 73
    invoke-direct {p7, v5, v4}, Lb0/c;-><init>(Lx/e$a;Landroid/os/Handler;)V

    .line 74
    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    sget-object v2, Lb0/l;->a:Lr/f;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v6, p1, Lb0/g;->e:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v6, "-"

    .line 91
    .line 92
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sget-object v6, Lb0/l;->a:Lr/f;

    .line 103
    .line 104
    invoke-virtual {v6, v2}, Lr/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Landroid/graphics/Typeface;

    .line 109
    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    new-instance p0, Lb0/a;

    .line 113
    .line 114
    invoke-direct {p0, v5, v6}, Lb0/a;-><init>(Lp2/m0;Landroid/graphics/Typeface;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    move-object v1, v6

    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_4
    if-ne v3, v0, :cond_5

    .line 124
    .line 125
    invoke-static {v2, p0, p1, p6}, Lb0/l;->a(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)Lb0/l$a;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p7, p0}, Lb0/c;->a(Lb0/l$a;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lb0/l$a;->a:Landroid/graphics/Typeface;

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_5
    new-instance v0, Lb0/h;

    .line 137
    .line 138
    invoke-direct {v0, v2, p0, p1, p6}, Lb0/h;-><init>(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)V

    .line 139
    .line 140
    .line 141
    :try_start_0
    sget-object p0, Lb0/l;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 142
    .line 143
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 144
    .line 145
    .line 146
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 147
    int-to-long v2, v3

    .line 148
    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 149
    .line 150
    invoke-interface {p0, v2, v3, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    .line 154
    :try_start_2
    check-cast p0, Lb0/l$a;

    .line 155
    .line 156
    invoke-virtual {p7, p0}, Lb0/c;->a(Lb0/l$a;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lb0/l$a;->a:Landroid/graphics/Typeface;

    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :catch_0
    new-instance p0, Ljava/lang/InterruptedException;

    .line 164
    .line 165
    const-string p1, "timeout"

    .line 166
    .line 167
    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p0

    .line 171
    :catch_1
    move-exception p0

    .line 172
    throw p0

    .line 173
    :catch_2
    move-exception p0

    .line 174
    new-instance p1, Ljava/lang/RuntimeException;

    .line 175
    .line 176
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 180
    :catch_3
    iget-object p0, p7, Lb0/c;->a:Lp2/m0;

    .line 181
    .line 182
    iget-object p1, p7, Lb0/c;->b:Landroid/os/Handler;

    .line 183
    .line 184
    new-instance p7, Lb0/b;

    .line 185
    .line 186
    const/4 v0, -0x3

    .line 187
    invoke-direct {p7, p0, v0}, Lb0/b;-><init>(Lp2/m0;I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 191
    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_6
    sget-object v0, Lb0/l;->a:Lr/f;

    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    iget-object v2, p1, Lb0/g;->e:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v2, "-"

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    sget-object v2, Lb0/l;->a:Lr/f;

    .line 220
    .line 221
    invoke-virtual {v2, v0}, Lr/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, Landroid/graphics/Typeface;

    .line 226
    .line 227
    if-eqz v2, :cond_7

    .line 228
    .line 229
    new-instance p0, Lb0/a;

    .line 230
    .line 231
    invoke-direct {p0, v5, v2}, Lb0/a;-><init>(Lp2/m0;Landroid/graphics/Typeface;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 235
    .line 236
    .line 237
    move-object v1, v2

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    new-instance v2, Lb0/i;

    .line 240
    .line 241
    invoke-direct {v2, p7}, Lb0/i;-><init>(Lb0/c;)V

    .line 242
    .line 243
    .line 244
    sget-object v3, Lb0/l;->c:Ljava/lang/Object;

    .line 245
    .line 246
    monitor-enter v3

    .line 247
    :try_start_3
    sget-object p7, Lb0/l;->d:Lr/h;

    .line 248
    .line 249
    invoke-virtual {p7, v0, v1}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Ljava/util/ArrayList;

    .line 254
    .line 255
    if-eqz v4, :cond_8

    .line 256
    .line 257
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    monitor-exit v3

    .line 261
    goto :goto_3

    .line 262
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {p7, v0, v4}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 274
    new-instance p7, Lb0/j;

    .line 275
    .line 276
    invoke-direct {p7, v0, p0, p1, p6}, Lb0/j;-><init>(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)V

    .line 277
    .line 278
    .line 279
    sget-object p0, Lb0/l;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 280
    .line 281
    new-instance p1, Lb0/k;

    .line 282
    .line 283
    invoke-direct {p1, v0}, Lb0/k;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-nez v0, :cond_9

    .line 291
    .line 292
    new-instance v0, Landroid/os/Handler;

    .line 293
    .line 294
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 299
    .line 300
    .line 301
    goto :goto_2

    .line 302
    :cond_9
    new-instance v0, Landroid/os/Handler;

    .line 303
    .line 304
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 305
    .line 306
    .line 307
    :goto_2
    new-instance v2, Lb0/p;

    .line 308
    .line 309
    invoke-direct {v2, v0, p7, p1}, Lb0/p;-><init>(Landroid/os/Handler;Lb0/j;Lb0/k;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 313
    .line 314
    .line 315
    goto :goto_3

    .line 316
    :catchall_0
    move-exception p0

    .line 317
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 318
    throw p0

    .line 319
    :cond_a
    sget-object v0, Lx/e;->a:Lx/l;

    .line 320
    .line 321
    check-cast p1, Lw/d$c;

    .line 322
    .line 323
    invoke-virtual {v0, p0, p1, p2, p6}, Lx/l;->a(Landroid/content/Context;Lw/d$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    if-eqz v1, :cond_b

    .line 328
    .line 329
    invoke-virtual {p7, v1}, Lw/f$e;->b(Landroid/graphics/Typeface;)V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_b
    invoke-virtual {p7}, Lw/f$e;->a()V

    .line 334
    .line 335
    .line 336
    :goto_3
    if-eqz v1, :cond_c

    .line 337
    .line 338
    sget-object p0, Lx/e;->b:Lr/f;

    .line 339
    .line 340
    invoke-static {p2, p3, p4, p5, p6}, Lx/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-virtual {p0, p1, v1}, Lr/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    :cond_c
    return-object v1
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
