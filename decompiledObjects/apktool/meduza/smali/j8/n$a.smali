.class public final Lj8/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj8/n;->g(Lr8/h;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/tasks/Task<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Ljava/lang/Thread;

.field public final synthetic d:Lr8/h;

.field public final synthetic e:Z

.field public final synthetic f:Lj8/n;


# direct methods
.method public constructor <init>(Lj8/n;JLjava/lang/Throwable;Ljava/lang/Thread;Lr8/h;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lj8/n$a;->f:Lj8/n;

    iput-wide p2, p0, Lj8/n$a;->a:J

    iput-object p4, p0, Lj8/n$a;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lj8/n$a;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lj8/n$a;->d:Lr8/h;

    iput-boolean p7, p0, Lj8/n$a;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-wide v0, p0, Lj8/n$a;->a:J

    .line 2
    .line 3
    const-wide/16 v2, 0x3e8

    .line 4
    .line 5
    div-long/2addr v0, v2

    .line 6
    iget-object v2, p0, Lj8/n$a;->f:Lj8/n;

    .line 7
    .line 8
    invoke-virtual {v2}, Lj8/n;->e()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "FirebaseCrashlytics"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v0, "Tried to write a fatal exception while no session was open."

    .line 18
    .line 19
    invoke-static {v3, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    iget-object v5, p0, Lj8/n$a;->f:Lj8/n;

    .line 25
    .line 26
    iget-object v5, v5, Lj8/n;->c:Lr4/c;

    .line 27
    .line 28
    invoke-virtual {v5}, Lr4/c;->d()V

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lj8/n$a;->f:Lj8/n;

    .line 32
    .line 33
    iget-object v6, v5, Lj8/n;->m:Lj8/d0;

    .line 34
    .line 35
    iget-object v7, p0, Lj8/n$a;->b:Ljava/lang/Throwable;

    .line 36
    .line 37
    iget-object v8, p0, Lj8/n$a;->c:Ljava/lang/Thread;

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v9, "Persisting fatal event for session "

    .line 48
    .line 49
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/4 v9, 0x2

    .line 60
    invoke-static {v3, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    invoke-static {v3, v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    .line 68
    .line 69
    :cond_1
    new-instance v10, Ll8/c;

    .line 70
    .line 71
    sget-object v5, Lsb/t;->a:Lsb/t;

    .line 72
    .line 73
    invoke-direct {v10, v2, v0, v1, v5}, Ll8/c;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 74
    .line 75
    .line 76
    const/4 v11, 0x1

    .line 77
    const-string v9, "crash"

    .line 78
    .line 79
    invoke-virtual/range {v6 .. v11}, Lj8/d0;->e(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ll8/c;Z)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lj8/n$a;->f:Lj8/n;

    .line 83
    .line 84
    iget-wide v5, p0, Lj8/n$a;->a:J

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :try_start_0
    iget-object v0, v0, Lj8/n;->g:Lp8/e;

    .line 90
    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v7, ".ae"

    .line 97
    .line 98
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v5, Ljava/io/File;

    .line 112
    .line 113
    iget-object v0, v0, Lp8/e;->c:Ljava/io/File;

    .line 114
    .line 115
    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_2

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 126
    .line 127
    const-string v1, "Create new file failed."

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    const-string v1, "Could not create app exception marker file."

    .line 135
    .line 136
    invoke-static {v3, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 137
    .line 138
    .line 139
    :goto_0
    iget-object v0, p0, Lj8/n$a;->f:Lj8/n;

    .line 140
    .line 141
    iget-object v1, p0, Lj8/n$a;->d:Lr8/h;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    invoke-virtual {v0, v3, v1, v3}, Lj8/n;->b(ZLr8/h;Z)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lj8/n$a;->f:Lj8/n;

    .line 148
    .line 149
    new-instance v1, Lj8/f;

    .line 150
    .line 151
    invoke-direct {v1}, Lj8/f;-><init>()V

    .line 152
    .line 153
    .line 154
    iget-object v1, v1, Lj8/f;->a:Ljava/lang/String;

    .line 155
    .line 156
    iget-boolean v3, p0, Lj8/n$a;->e:Z

    .line 157
    .line 158
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v0, v1, v3}, Lj8/n;->c(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lj8/n$a;->f:Lj8/n;

    .line 166
    .line 167
    iget-object v0, v0, Lj8/n;->b:Lj8/w;

    .line 168
    .line 169
    invoke-virtual {v0}, Lj8/w;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_3

    .line 174
    .line 175
    :goto_1
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto :goto_2

    .line 180
    :cond_3
    iget-object v0, p0, Lj8/n$a;->d:Lr8/h;

    .line 181
    .line 182
    check-cast v0, Lr8/f;

    .line 183
    .line 184
    iget-object v0, v0, Lr8/f;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, Lj8/n$a;->f:Lj8/n;

    .line 197
    .line 198
    iget-object v1, v1, Lj8/n;->e:Lk8/i;

    .line 199
    .line 200
    iget-object v1, v1, Lk8/i;->a:Lk8/b;

    .line 201
    .line 202
    new-instance v3, Lj8/m;

    .line 203
    .line 204
    invoke-direct {v3, p0, v2}, Lj8/m;-><init>(Lj8/n$a;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_2
    return-object v0
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
