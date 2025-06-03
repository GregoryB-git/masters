.class public final Lgb/e2;
.super Leb/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/e2$a;,
        Lgb/e2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/o0<",
        "Lgb/e2;",
        ">;"
    }
.end annotation


# static fields
.field public static final A:J

.field public static final B:J

.field public static final C:Lgb/j3;

.field public static final D:Leb/s;

.field public static final E:Leb/m;

.field public static final F:Ljava/lang/reflect/Method;

.field public static final z:Ljava/util/logging/Logger;


# instance fields
.field public a:Lgb/j3;

.field public b:Lgb/j3;

.field public final c:Ljava/util/ArrayList;

.field public d:Leb/w0;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/lang/String;

.field public final g:Leb/b;

.field public h:Ljava/lang/String;

.field public i:Leb/s;

.field public j:Leb/m;

.field public k:J

.field public l:I

.field public m:I

.field public n:J

.field public o:J

.field public p:Z

.field public q:Leb/c0;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public final x:Lgb/e2$b;

.field public final y:Lgb/e2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lgb/e2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lgb/e2;->z:Ljava/util/logging/Logger;

    .line 12
    .line 13
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    const-wide/16 v1, 0x1e

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, Lgb/e2;->A:J

    .line 22
    .line 23
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    const-wide/16 v1, 0x1

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sput-wide v0, Lgb/e2;->B:J

    .line 32
    .line 33
    sget-object v0, Lgb/v0;->p:Lgb/v0$b;

    .line 34
    .line 35
    new-instance v1, Lgb/j3;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lgb/j3;-><init>(Lgb/h3$c;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lgb/e2;->C:Lgb/j3;

    .line 41
    .line 42
    sget-object v0, Leb/s;->d:Leb/s;

    .line 43
    .line 44
    sput-object v0, Lgb/e2;->D:Leb/s;

    .line 45
    .line 46
    sget-object v0, Leb/m;->b:Leb/m;

    .line 47
    .line 48
    sput-object v0, Lgb/e2;->E:Leb/m;

    .line 49
    .line 50
    :try_start_0
    const-string v0, "io.grpc.census.InternalCensusStatsAccessor"

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "getClientInterceptor"

    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    new-array v2, v2, [Ljava/lang/Class;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    aput-object v4, v2, v3

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    aput-object v4, v2, v3

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    aput-object v4, v2, v3

    .line 71
    .line 72
    const/4 v3, 0x3

    .line 73
    aput-object v4, v2, v3

    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    goto :goto_1

    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto :goto_0

    .line 82
    :catch_1
    move-exception v0

    .line 83
    :goto_0
    sget-object v1, Lgb/e2;->z:Ljava/util/logging/Logger;

    .line 84
    .line 85
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 86
    .line 87
    const-string v3, "Unable to apply census stats"

    .line 88
    .line 89
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    :goto_1
    sput-object v0, Lgb/e2;->F:Ljava/lang/reflect/Method;

    .line 94
    .line 95
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
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

.method public constructor <init>(Ljava/lang/String;Lhb/e$c;Lhb/e$b;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Leb/o0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgb/e2;->C:Lgb/j3;

    .line 5
    .line 6
    iput-object v0, p0, Lgb/e2;->a:Lgb/j3;

    .line 7
    .line 8
    iput-object v0, p0, Lgb/e2;->b:Lgb/j3;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lgb/e2;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    sget-object v0, Leb/w0;->d:Ljava/util/logging/Logger;

    .line 18
    .line 19
    const-class v0, Leb/v0;

    .line 20
    .line 21
    const-class v1, Leb/w0;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    sget-object v2, Leb/w0;->e:Leb/w0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_1
    const-class v4, Lgb/j0;

    .line 35
    .line 36
    sget-boolean v5, Lgb/j0;->a:Z

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v4

    .line 43
    :try_start_2
    sget-object v5, Leb/w0;->d:Ljava/util/logging/Logger;

    .line 44
    .line 45
    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 46
    .line 47
    const-string v7, "Unable to find DNS NameResolver"

    .line 48
    .line 49
    invoke-virtual {v5, v6, v7, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v5, Leb/w0$a;

    .line 61
    .line 62
    invoke-direct {v5}, Leb/w0$a;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v2, v4, v5}, Leb/d1;->a(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Leb/d1$a;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    sget-object v2, Leb/w0;->d:Ljava/util/logging/Logger;

    .line 76
    .line 77
    const-string v4, "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration"

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    new-instance v2, Leb/w0;

    .line 83
    .line 84
    invoke-direct {v2}, Leb/w0;-><init>()V

    .line 85
    .line 86
    .line 87
    sput-object v2, Leb/w0;->e:Leb/w0;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_1

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Leb/v0;

    .line 104
    .line 105
    sget-object v4, Leb/w0;->d:Ljava/util/logging/Logger;

    .line 106
    .line 107
    new-instance v5, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v6, "Service loader found "

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sget-object v4, Leb/w0;->e:Leb/w0;

    .line 128
    .line 129
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    :try_start_3
    invoke-virtual {v2}, Leb/v0;->d()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    const-string v6, "isAvailable() returned false"

    .line 135
    .line 136
    invoke-static {v6, v5}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    iget-object v5, v4, Leb/w0;->b:Ljava/util/LinkedHashSet;

    .line 140
    .line 141
    invoke-virtual {v5, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 142
    .line 143
    .line 144
    :try_start_4
    monitor-exit v4

    .line 145
    goto :goto_1

    .line 146
    :catchall_0
    move-exception p1

    .line 147
    monitor-exit v4

    .line 148
    throw p1

    .line 149
    :cond_1
    sget-object v0, Leb/w0;->e:Leb/w0;

    .line 150
    .line 151
    invoke-virtual {v0}, Leb/w0;->a()V

    .line 152
    .line 153
    .line 154
    :cond_2
    sget-object v0, Leb/w0;->e:Leb/w0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 155
    .line 156
    monitor-exit v1

    .line 157
    iput-object v0, p0, Lgb/e2;->d:Leb/w0;

    .line 158
    .line 159
    new-instance v0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object v0, p0, Lgb/e2;->e:Ljava/util/ArrayList;

    .line 165
    .line 166
    const-string v0, "pick_first"

    .line 167
    .line 168
    iput-object v0, p0, Lgb/e2;->h:Ljava/lang/String;

    .line 169
    .line 170
    sget-object v0, Lgb/e2;->D:Leb/s;

    .line 171
    .line 172
    iput-object v0, p0, Lgb/e2;->i:Leb/s;

    .line 173
    .line 174
    sget-object v0, Lgb/e2;->E:Leb/m;

    .line 175
    .line 176
    iput-object v0, p0, Lgb/e2;->j:Leb/m;

    .line 177
    .line 178
    sget-wide v0, Lgb/e2;->A:J

    .line 179
    .line 180
    iput-wide v0, p0, Lgb/e2;->k:J

    .line 181
    .line 182
    const/4 v0, 0x5

    .line 183
    iput v0, p0, Lgb/e2;->l:I

    .line 184
    .line 185
    iput v0, p0, Lgb/e2;->m:I

    .line 186
    .line 187
    const-wide/32 v0, 0x1000000

    .line 188
    .line 189
    .line 190
    iput-wide v0, p0, Lgb/e2;->n:J

    .line 191
    .line 192
    const-wide/32 v0, 0x100000

    .line 193
    .line 194
    .line 195
    iput-wide v0, p0, Lgb/e2;->o:J

    .line 196
    .line 197
    const/4 v0, 0x1

    .line 198
    iput-boolean v0, p0, Lgb/e2;->p:Z

    .line 199
    .line 200
    sget-object v1, Leb/c0;->e:Leb/c0;

    .line 201
    .line 202
    iput-object v1, p0, Lgb/e2;->q:Leb/c0;

    .line 203
    .line 204
    iput-boolean v0, p0, Lgb/e2;->r:Z

    .line 205
    .line 206
    iput-boolean v0, p0, Lgb/e2;->s:Z

    .line 207
    .line 208
    iput-boolean v0, p0, Lgb/e2;->t:Z

    .line 209
    .line 210
    iput-boolean v0, p0, Lgb/e2;->u:Z

    .line 211
    .line 212
    iput-boolean v0, p0, Lgb/e2;->v:Z

    .line 213
    .line 214
    iput-boolean v0, p0, Lgb/e2;->w:Z

    .line 215
    .line 216
    const-string v0, "target"

    .line 217
    .line 218
    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iput-object p1, p0, Lgb/e2;->f:Ljava/lang/String;

    .line 222
    .line 223
    iput-object v3, p0, Lgb/e2;->g:Leb/b;

    .line 224
    .line 225
    iput-object p2, p0, Lgb/e2;->x:Lgb/e2$b;

    .line 226
    .line 227
    iput-object p3, p0, Lgb/e2;->y:Lgb/e2$a;

    .line 228
    .line 229
    return-void

    .line 230
    :catchall_1
    move-exception p1

    .line 231
    monitor-exit v1

    .line 232
    throw p1
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
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 13

    .line 1
    new-instance v0, Lgb/f2;

    .line 2
    .line 3
    new-instance v8, Lgb/r1;

    .line 4
    .line 5
    iget-object v1, p0, Lgb/e2;->x:Lgb/e2$b;

    .line 6
    .line 7
    invoke-interface {v1}, Lgb/e2$b;->a()Lhb/e$d;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Lgb/k0$a;

    .line 12
    .line 13
    invoke-direct {v4}, Lgb/k0$a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lgb/v0;->p:Lgb/v0$b;

    .line 17
    .line 18
    new-instance v5, Lgb/j3;

    .line 19
    .line 20
    invoke-direct {v5, v1}, Lgb/j3;-><init>(Lgb/h3$c;)V

    .line 21
    .line 22
    .line 23
    sget-object v6, Lgb/v0;->r:Lgb/v0$d;

    .line 24
    .line 25
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v1, p0, Lgb/e2;->c:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    const-class v1, Leb/y;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    monitor-exit v1

    .line 36
    iget-boolean v1, p0, Lgb/e2;->s:Z

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    sget-object v1, Lgb/e2;->F:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const/4 v10, 0x4

    .line 47
    :try_start_0
    new-array v10, v10, [Ljava/lang/Object;

    .line 48
    .line 49
    iget-boolean v11, p0, Lgb/e2;->t:Z

    .line 50
    .line 51
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    aput-object v11, v10, v9

    .line 56
    .line 57
    const/4 v11, 0x1

    .line 58
    iget-boolean v12, p0, Lgb/e2;->u:Z

    .line 59
    .line 60
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    aput-object v12, v10, v11

    .line 65
    .line 66
    const/4 v11, 0x2

    .line 67
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    aput-object v12, v10, v11

    .line 70
    .line 71
    const/4 v11, 0x3

    .line 72
    iget-boolean v12, p0, Lgb/e2;->v:Z

    .line 73
    .line 74
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    aput-object v12, v10, v11

    .line 79
    .line 80
    invoke-virtual {v1, v2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Leb/f;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception v1

    .line 88
    goto :goto_0

    .line 89
    :catch_1
    move-exception v1

    .line 90
    :goto_0
    sget-object v10, Lgb/e2;->z:Ljava/util/logging/Logger;

    .line 91
    .line 92
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 93
    .line 94
    const-string v12, "Unable to apply census stats"

    .line 95
    .line 96
    invoke-virtual {v10, v11, v12, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    move-object v1, v2

    .line 100
    :goto_1
    if-eqz v1, :cond_1

    .line 101
    .line 102
    invoke-virtual {v7, v9, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    iget-boolean v1, p0, Lgb/e2;->w:Z

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    :try_start_1
    const-string v1, "io.grpc.census.InternalCensusTracingAccessor"

    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v10, "getClientInterceptor"

    .line 116
    .line 117
    new-array v11, v9, [Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v1, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-array v10, v9, [Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v1, v2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Leb/f;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2

    .line 130
    .line 131
    move-object v2, v1

    .line 132
    goto :goto_3

    .line 133
    :catch_2
    move-exception v1

    .line 134
    goto :goto_2

    .line 135
    :catch_3
    move-exception v1

    .line 136
    goto :goto_2

    .line 137
    :catch_4
    move-exception v1

    .line 138
    goto :goto_2

    .line 139
    :catch_5
    move-exception v1

    .line 140
    :goto_2
    sget-object v10, Lgb/e2;->z:Ljava/util/logging/Logger;

    .line 141
    .line 142
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 143
    .line 144
    const-string v12, "Unable to apply census stats"

    .line 145
    .line 146
    invoke-virtual {v10, v11, v12, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    if-eqz v2, :cond_2

    .line 150
    .line 151
    invoke-virtual {v7, v9, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    move-object v1, v8

    .line 155
    move-object v2, p0

    .line 156
    invoke-direct/range {v1 .. v7}, Lgb/r1;-><init>(Lgb/e2;Lgb/v;Lgb/k0$a;Lgb/j3;Lgb/v0$d;Ljava/util/ArrayList;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, v8}, Lgb/f2;-><init>(Lgb/r1;)V

    .line 160
    .line 161
    .line 162
    return-object v0
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
