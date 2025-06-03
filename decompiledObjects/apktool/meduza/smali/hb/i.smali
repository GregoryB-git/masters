.class public final Lhb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/x;
.implements Lhb/b$a;
.implements Lhb/p$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/i$d;
    }
.end annotation


# static fields
.field public static final S:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljb/a;",
            "Leb/e1;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Ljava/util/logging/Logger;


# instance fields
.field public final A:Ljavax/net/SocketFactory;

.field public B:Ljavax/net/ssl/SSLSocketFactory;

.field public C:Ljavax/net/ssl/HostnameVerifier;

.field public D:I

.field public final E:Ljava/util/LinkedList;

.field public final F:Lib/b;

.field public G:Lgb/o1;

.field public H:Z

.field public I:J

.field public J:J

.field public K:Z

.field public final L:Ljava/lang/Runnable;

.field public final M:I

.field public final N:Z

.field public final O:Lgb/r3;

.field public final P:Lhb/i$a;

.field public final Q:Leb/a0;

.field public R:I

.field public final a:Ljava/net/InetSocketAddress;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Random;

.field public final e:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Ln7/p;",
            ">;"
        }
    .end annotation
.end field

.field public final f:I

.field public final g:Ljb/h;

.field public h:Lgb/h2$a;

.field public i:Lhb/b;

.field public j:Lhb/p;

.field public final k:Ljava/lang/Object;

.field public final l:Leb/f0;

.field public m:I

.field public final n:Ljava/util/HashMap;

.field public final o:Ljava/util/concurrent/Executor;

.field public final p:Lgb/f3;

.field public final q:Ljava/util/concurrent/ScheduledExecutorService;

.field public final r:I

.field public s:I

.field public t:Lhb/i$d;

.field public u:Leb/a;

.field public v:Leb/e1;

.field public w:Z

.field public x:Lgb/b1;

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    const-class v1, Ljb/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ljb/a;->b:Ljb/a;

    .line 9
    .line 10
    sget-object v2, Leb/e1;->m:Leb/e1;

    .line 11
    .line 12
    const-string v3, "No error: A GRPC status of OK should have been sent"

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljb/a;->c:Ljb/a;

    .line 22
    .line 23
    const-string v3, "Protocol error"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v1, Ljb/a;->d:Ljb/a;

    .line 33
    .line 34
    const-string v3, "Internal error"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v1, Ljb/a;->e:Ljb/a;

    .line 44
    .line 45
    const-string v3, "Flow control error"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v1, Ljb/a;->f:Ljb/a;

    .line 55
    .line 56
    const-string v3, "Stream closed"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object v1, Ljb/a;->o:Ljb/a;

    .line 66
    .line 67
    const-string v3, "Frame too large"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v1, Ljb/a;->p:Ljb/a;

    .line 77
    .line 78
    sget-object v3, Leb/e1;->n:Leb/e1;

    .line 79
    .line 80
    const-string v4, "Refused stream"

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    sget-object v1, Ljb/a;->q:Ljb/a;

    .line 90
    .line 91
    sget-object v3, Leb/e1;->f:Leb/e1;

    .line 92
    .line 93
    const-string v4, "Cancelled"

    .line 94
    .line 95
    invoke-virtual {v3, v4}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    sget-object v1, Ljb/a;->r:Ljb/a;

    .line 103
    .line 104
    const-string v3, "Compression error"

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v1, Ljb/a;->s:Ljb/a;

    .line 114
    .line 115
    const-string v3, "Connect error"

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    sget-object v1, Ljb/a;->t:Ljb/a;

    .line 125
    .line 126
    sget-object v2, Leb/e1;->k:Leb/e1;

    .line 127
    .line 128
    const-string v3, "Enhance your calm"

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v1, Ljb/a;->u:Ljb/a;

    .line 138
    .line 139
    sget-object v2, Leb/e1;->i:Leb/e1;

    .line 140
    .line 141
    const-string v3, "Inadequate security"

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, Lhb/i;->S:Ljava/util/Map;

    .line 155
    .line 156
    const-class v0, Lhb/i;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lhb/i;->T:Ljava/util/logging/Logger;

    .line 167
    .line 168
    return-void
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

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lhb/e$d;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Leb/a;Leb/a0;Lhb/f;)V
    .locals 4

    sget-object v0, Lgb/v0;->r:Lgb/v0$d;

    new-instance v1, Ljb/f;

    invoke-direct {v1}, Ljb/f;-><init>()V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    iput-object v2, p0, Lhb/i;->d:Ljava/util/Random;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lhb/i;->k:Ljava/lang/Object;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Lhb/i;->n:Ljava/util/HashMap;

    const/4 v3, 0x0

    iput v3, p0, Lhb/i;->D:I

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, Lhb/i;->E:Ljava/util/LinkedList;

    new-instance v3, Lhb/i$a;

    invoke-direct {v3, p0}, Lhb/i$a;-><init>(Lhb/i;)V

    iput-object v3, p0, Lhb/i;->P:Lhb/i$a;

    const/16 v3, 0x7530

    iput v3, p0, Lhb/i;->R:I

    const-string v3, "address"

    invoke-static {p2, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lhb/i;->a:Ljava/net/InetSocketAddress;

    iput-object p3, p0, Lhb/i;->b:Ljava/lang/String;

    iget p3, p1, Lhb/e$d;->r:I

    iput p3, p0, Lhb/i;->r:I

    iget p3, p1, Lhb/e$d;->v:I

    iput p3, p0, Lhb/i;->f:I

    iget-object p3, p1, Lhb/e$d;->b:Ljava/util/concurrent/Executor;

    const-string v3, "executor"

    invoke-static {p3, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lhb/i;->o:Ljava/util/concurrent/Executor;

    new-instance p3, Lgb/f3;

    iget-object v3, p1, Lhb/e$d;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p3, v3}, Lgb/f3;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p3, p0, Lhb/i;->p:Lgb/f3;

    iget-object p3, p1, Lhb/e$d;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-string v3, "scheduledExecutorService"

    invoke-static {p3, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lhb/i;->q:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p3, 0x3

    iput p3, p0, Lhb/i;->m:I

    iget-object p3, p1, Lhb/e$d;->f:Ljavax/net/SocketFactory;

    if-nez p3, :cond_0

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lhb/i;->A:Ljavax/net/SocketFactory;

    iget-object p3, p1, Lhb/e$d;->o:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p3, p0, Lhb/i;->B:Ljavax/net/ssl/SSLSocketFactory;

    iget-object p3, p1, Lhb/e$d;->p:Ljavax/net/ssl/HostnameVerifier;

    iput-object p3, p0, Lhb/i;->C:Ljavax/net/ssl/HostnameVerifier;

    iget-object p3, p1, Lhb/e$d;->q:Lib/b;

    const-string v3, "connectionSpec"

    invoke-static {p3, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lhb/i;->F:Lib/b;

    const-string p3, "stopwatchFactory"

    invoke-static {v0, p3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lhb/i;->e:Ln7/q;

    iput-object v1, p0, Lhb/i;->g:Ljb/h;

    const-string p3, "okhttp"

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p4, :cond_1

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p4, 0x20

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const-string p4, "grpc-java-"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x2f

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p3, "1.62.2"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 3
    iput-object p3, p0, Lhb/i;->c:Ljava/lang/String;

    iput-object p6, p0, Lhb/i;->Q:Leb/a0;

    iput-object p7, p0, Lhb/i;->L:Ljava/lang/Runnable;

    iget p3, p1, Lhb/e$d;->x:I

    iput p3, p0, Lhb/i;->M:I

    iget-object p3, p1, Lhb/e$d;->e:Lgb/r3$a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance p4, Lgb/r3;

    iget-object p3, p3, Lgb/r3$a;->a:Lgb/o3;

    invoke-direct {p4, p3}, Lgb/r3;-><init>(Lgb/o3;)V

    .line 5
    iput-object p4, p0, Lhb/i;->O:Lgb/r3;

    const-class p3, Lhb/i;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Leb/f0;->a(Ljava/lang/Class;Ljava/lang/String;)Leb/f0;

    move-result-object p2

    iput-object p2, p0, Lhb/i;->l:Leb/f0;

    .line 6
    sget-object p2, Leb/a;->b:Leb/a;

    .line 7
    sget-object p3, Lgb/u0;->b:Leb/a$b;

    .line 8
    new-instance p4, Ljava/util/IdentityHashMap;

    const/4 p6, 0x1

    invoke-direct {p4, p6}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 9
    invoke-virtual {p4, p3, p5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object p2, p2, Leb/a;->a:Ljava/util/IdentityHashMap;

    .line 11
    invoke-virtual {p2}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_2

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Leb/a$b;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p4, p5, p3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p2, Leb/a;

    .line 12
    invoke-direct {p2, p4}, Leb/a;-><init>(Ljava/util/IdentityHashMap;)V

    .line 13
    iput-object p2, p0, Lhb/i;->u:Leb/a;

    iget-boolean p1, p1, Lhb/e$d;->y:Z

    iput-boolean p1, p0, Lhb/i;->N:Z

    .line 14
    monitor-enter v2

    :try_start_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static i(Lhb/i;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ljb/a;->c:Ljb/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lhb/i;->x(Ljb/a;)Leb/e1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p1}, Leb/e1;->a(Ljava/lang/String;)Leb/e1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0, p1}, Lhb/i;->t(ILjb/a;Leb/e1;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
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
.end method

.method public static j(Lhb/i;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "\r\n"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lhb/i;->A:Ljavax/net/SocketFactory;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {v2, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v2, p0, Lhb/i;->A:Ljavax/net/SocketFactory;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-virtual {v2, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    .line 39
    .line 40
    .line 41
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 42
    :goto_0
    const/4 v2, 0x1

    .line 43
    :try_start_1
    invoke-virtual {p2, v2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 44
    .line 45
    .line 46
    iget v3, p0, Lhb/i;->R:I

    .line 47
    .line 48
    invoke-virtual {p2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Lp2/m0;->b0(Ljava/net/Socket;)Lxc/e;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {p2}, Lp2/m0;->a0(Ljava/net/Socket;)Lxc/d;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v5, Lxc/r;

    .line 60
    .line 61
    invoke-direct {v5, v4}, Lxc/r;-><init>(Lxc/w;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, p3, p4}, Lhb/i;->k(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lkb/b;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iget-object p1, p0, Lkb/b;->a:Lkb/a;

    .line 69
    .line 70
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 71
    .line 72
    const-string p4, "CONNECT %s:%d HTTP/1.1"

    .line 73
    .line 74
    const/4 v4, 0x2

    .line 75
    new-array v6, v4, [Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v7, p1, Lkb/a;->a:Ljava/lang/String;

    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    aput-object v7, v6, v8

    .line 81
    .line 82
    iget p1, p1, Lkb/a;->b:I

    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    aput-object p1, v6, v2

    .line 89
    .line 90
    invoke-static {p3, p4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v5, p1}, Lxc/r;->O(Ljava/lang/String;)Lxc/g;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v0}, Lxc/r;->O(Ljava/lang/String;)Lxc/g;

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lkb/b;->b:Lib/d;

    .line 101
    .line 102
    iget-object p1, p1, Lib/d;->a:[Ljava/lang/String;

    .line 103
    .line 104
    array-length p1, p1

    .line 105
    div-int/2addr p1, v4

    .line 106
    move p3, v8

    .line 107
    :goto_1
    if-ge p3, p1, :cond_5

    .line 108
    .line 109
    iget-object p4, p0, Lkb/b;->b:Lib/d;

    .line 110
    .line 111
    mul-int/lit8 v6, p3, 0x2

    .line 112
    .line 113
    if-ltz v6, :cond_2

    .line 114
    .line 115
    iget-object p4, p4, Lib/d;->a:[Ljava/lang/String;

    .line 116
    .line 117
    array-length v7, p4

    .line 118
    if-lt v6, v7, :cond_1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_1
    aget-object p4, p4, v6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_2
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    :goto_2
    move-object p4, v1

    .line 128
    :goto_3
    invoke-virtual {v5, p4}, Lxc/r;->O(Ljava/lang/String;)Lxc/g;

    .line 129
    .line 130
    .line 131
    const-string p4, ": "

    .line 132
    .line 133
    invoke-virtual {v5, p4}, Lxc/r;->O(Ljava/lang/String;)Lxc/g;

    .line 134
    .line 135
    .line 136
    iget-object p4, p0, Lkb/b;->b:Lib/d;

    .line 137
    .line 138
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    if-ltz v6, :cond_4

    .line 141
    .line 142
    iget-object p4, p4, Lib/d;->a:[Ljava/lang/String;

    .line 143
    .line 144
    array-length v7, p4

    .line 145
    if-lt v6, v7, :cond_3

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_3
    aget-object p4, p4, v6

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    :goto_4
    move-object p4, v1

    .line 155
    :goto_5
    invoke-interface {v5, p4}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 156
    .line 157
    .line 158
    invoke-interface {v5, v0}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 159
    .line 160
    .line 161
    add-int/lit8 p3, p3, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-virtual {v5, v0}, Lxc/r;->O(Ljava/lang/String;)Lxc/g;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Lxc/r;->flush()V

    .line 168
    .line 169
    .line 170
    invoke-static {v3}, Lhb/i;->r(Lxc/e;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Ls8/a;->a(Ljava/lang/String;)Ls8/a;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    :goto_6
    invoke-static {v3}, Lhb/i;->r(Lxc/e;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p3, ""

    .line 183
    .line 184
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_6

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_6
    iget p1, p0, Ls8/a;->b:I

    .line 192
    .line 193
    const/16 p3, 0xc8

    .line 194
    .line 195
    if-lt p1, p3, :cond_7

    .line 196
    .line 197
    const/16 p3, 0x12c

    .line 198
    .line 199
    if-ge p1, p3, :cond_7

    .line 200
    .line 201
    invoke-virtual {p2, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 202
    .line 203
    .line 204
    return-object p2

    .line 205
    :cond_7
    new-instance p1, Lxc/f;

    .line 206
    .line 207
    invoke-direct {p1}, Lxc/f;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 208
    .line 209
    .line 210
    :try_start_2
    invoke-virtual {p2}, Ljava/net/Socket;->shutdownOutput()V

    .line 211
    .line 212
    .line 213
    const-wide/16 p3, 0x400

    .line 214
    .line 215
    invoke-virtual {v3, p1, p3, p4}, Lxc/e;->e0(Lxc/f;J)J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :catch_0
    move-exception p3

    .line 220
    :try_start_3
    new-instance p4, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v0, "Unable to read body: "

    .line 226
    .line 227
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p3

    .line 241
    invoke-virtual {p1, p3}, Lxc/f;->H0(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 242
    .line 243
    .line 244
    :goto_7
    :try_start_4
    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 245
    .line 246
    .line 247
    :catch_1
    :try_start_5
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 248
    .line 249
    const-string p4, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"

    .line 250
    .line 251
    const/4 v0, 0x3

    .line 252
    new-array v0, v0, [Ljava/lang/Object;

    .line 253
    .line 254
    iget v1, p0, Ls8/a;->b:I

    .line 255
    .line 256
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    aput-object v1, v0, v8

    .line 261
    .line 262
    iget-object p0, p0, Ls8/a;->d:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p0, Ljava/lang/String;

    .line 265
    .line 266
    aput-object p0, v0, v2

    .line 267
    .line 268
    invoke-virtual {p1}, Lxc/f;->k0()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    aput-object p0, v0, v4

    .line 273
    .line 274
    invoke-static {p3, p4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    sget-object p1, Leb/e1;->n:Leb/e1;

    .line 279
    .line 280
    invoke-virtual {p1, p0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    new-instance p1, Leb/f1;

    .line 285
    .line 286
    invoke-direct {p1, p0}, Leb/f1;-><init>(Leb/e1;)V

    .line 287
    .line 288
    .line 289
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 290
    :catch_2
    move-exception p0

    .line 291
    move-object v1, p2

    .line 292
    goto :goto_8

    .line 293
    :catch_3
    move-exception p0

    .line 294
    :goto_8
    if-eqz v1, :cond_8

    .line 295
    .line 296
    invoke-static {v1}, Lgb/v0;->b(Ljava/io/Closeable;)V

    .line 297
    .line 298
    .line 299
    :cond_8
    sget-object p1, Leb/e1;->n:Leb/e1;

    .line 300
    .line 301
    const-string p2, "Failed trying to connect with proxy"

    .line 302
    .line 303
    invoke-virtual {p1, p2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p1, p0}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    new-instance p1, Leb/f1;

    .line 312
    .line 313
    invoke-direct {p1, p0}, Leb/f1;-><init>(Leb/e1;)V

    .line 314
    .line 315
    .line 316
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
.end method

.method public static r(Lxc/e;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Lxc/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lxc/f;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    const-wide/16 v1, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Lxc/e;->e0(Lxc/f;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    const-wide/16 v5, -0x1

    .line 13
    .line 14
    cmp-long v3, v3, v5

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    iget-wide v3, v0, Lxc/f;->b:J

    .line 19
    .line 20
    sub-long/2addr v3, v1

    .line 21
    invoke-virtual {v0, v3, v4}, Lxc/f;->I(J)B

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lxc/f;->f0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 35
    .line 36
    const-string v1, "\\n not found: "

    .line 37
    .line 38
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0}, Lxc/f;->c0()Lxc/i;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lxc/i;->l()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static x(Ljb/a;)Leb/e1;
    .locals 2

    .line 1
    sget-object v0, Lhb/i;->S:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Leb/e1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Leb/e1;->g:Leb/e1;

    .line 13
    .line 14
    const-string v1, "Unknown http2 error code: "

    .line 15
    .line 16
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget p0, p0, Ljb/a;->a:I

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    sget-object v0, Leb/e1;->n:Leb/e1;

    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    move-result-object p1

    sget-object v0, Ljb/a;->d:Ljb/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lhb/i;->t(ILjb/a;Leb/e1;)V

    return-void
.end method

.method public final b()[Lhb/p$b;
    .locals 7

    .line 1
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-array v1, v1, [Lhb/p$b;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lhb/h;

    .line 34
    .line 35
    add-int/lit8 v5, v2, 0x1

    .line 36
    .line 37
    iget-object v4, v4, Lhb/h;->l:Lhb/h$b;

    .line 38
    .line 39
    iget-object v6, v4, Lhb/h$b;->x:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    :try_start_1
    iget-object v4, v4, Lhb/h$b;->K:Lhb/p$b;

    .line 43
    .line 44
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :try_start_2
    aput-object v4, v1, v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    move v2, v5

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    :try_start_4
    throw v1

    .line 52
    :cond_0
    monitor-exit v0

    .line 53
    return-object v1

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    throw v1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final c(Leb/e1;)V
    .locals 2

    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhb/i;->v:Leb/e1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iput-object p1, p0, Lhb/i;->v:Leb/e1;

    iget-object v1, p0, Lhb/i;->h:Lgb/h2$a;

    invoke-interface {v1, p1}, Lgb/h2$a;->a(Leb/e1;)V

    invoke-virtual {p0}, Lhb/i;->w()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;
    .locals 18

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v1, p4

    .line 6
    .line 7
    const-string v2, "method"

    .line 8
    .line 9
    move-object/from16 v3, p1

    .line 10
    .line 11
    invoke-static {v3, v2}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "headers"

    .line 15
    .line 16
    invoke-static {v0, v2}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v15, Lhb/i;->u:Leb/a;

    .line 20
    .line 21
    new-instance v12, Lgb/l3;

    .line 22
    .line 23
    invoke-direct {v12, v1}, Lgb/l3;-><init>([Lm/e;)V

    .line 24
    .line 25
    .line 26
    array-length v4, v1

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-ge v5, v4, :cond_0

    .line 29
    .line 30
    aget-object v6, v1, v5

    .line 31
    .line 32
    invoke-virtual {v6, v2, v0}, Leb/h;->z(Leb/a;Leb/s0;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v14, v15, Lhb/i;->k:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v14

    .line 41
    :try_start_0
    new-instance v16, Lhb/h;

    .line 42
    .line 43
    iget-object v4, v15, Lhb/i;->i:Lhb/b;

    .line 44
    .line 45
    iget-object v6, v15, Lhb/i;->j:Lhb/p;

    .line 46
    .line 47
    iget-object v7, v15, Lhb/i;->k:Ljava/lang/Object;

    .line 48
    .line 49
    iget v8, v15, Lhb/i;->r:I

    .line 50
    .line 51
    iget v9, v15, Lhb/i;->f:I

    .line 52
    .line 53
    iget-object v10, v15, Lhb/i;->b:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v11, v15, Lhb/i;->c:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v13, v15, Lhb/i;->O:Lgb/r3;

    .line 58
    .line 59
    iget-boolean v5, v15, Lhb/i;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    move-object/from16 v1, v16

    .line 62
    .line 63
    move-object/from16 v2, p1

    .line 64
    .line 65
    move-object/from16 v3, p2

    .line 66
    .line 67
    move v0, v5

    .line 68
    move-object/from16 v5, p0

    .line 69
    .line 70
    move-object/from16 v17, v14

    .line 71
    .line 72
    move-object/from16 v14, p3

    .line 73
    .line 74
    move v15, v0

    .line 75
    :try_start_1
    invoke-direct/range {v1 .. v15}, Lhb/h;-><init>(Leb/t0;Leb/s0;Lhb/b;Lhb/i;Lhb/p;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lgb/l3;Lgb/r3;Leb/c;Z)V

    .line 76
    .line 77
    .line 78
    monitor-exit v17

    .line 79
    return-object v16

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    move-object/from16 v17, v14

    .line 84
    .line 85
    :goto_1
    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw v0
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final e(Lgb/o1$c$a;)V
    .locals 9

    .line 1
    sget-object v0, Ls7/c;->a:Ls7/c;

    .line 2
    .line 3
    iget-object v1, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Lhb/i;->i:Lhb/b;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v4

    .line 15
    :goto_0
    invoke-static {v2}, Lx6/b;->J(Z)V

    .line 16
    .line 17
    .line 18
    iget-boolean v2, p0, Lhb/i;->y:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lhb/i;->o()Leb/f1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v3, Lgb/b1;->g:Ljava/util/logging/Logger;

    .line 27
    .line 28
    new-instance v3, Lgb/a1;

    .line 29
    .line 30
    invoke-direct {v3, p1, v2}, Lgb/a1;-><init>(Lgb/u$a;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v0, v3}, Ls7/c;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_2
    sget-object v0, Lgb/b1;->g:Ljava/util/logging/Logger;

    .line 39
    .line 40
    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 41
    .line 42
    const-string v3, "Failed to execute PingCallback"

    .line 43
    .line 44
    invoke-virtual {v0, v2, v3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    monitor-exit v1

    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_5

    .line 51
    :cond_1
    iget-object v2, p0, Lhb/i;->x:Lgb/b1;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    move v3, v4

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    iget-object v2, p0, Lhb/i;->d:Ljava/util/Random;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    iget-object v2, p0, Lhb/i;->e:Ln7/q;

    .line 66
    .line 67
    invoke-interface {v2}, Ln7/q;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ln7/p;

    .line 72
    .line 73
    invoke-virtual {v2}, Ln7/p;->b()V

    .line 74
    .line 75
    .line 76
    new-instance v7, Lgb/b1;

    .line 77
    .line 78
    invoke-direct {v7, v5, v6, v2}, Lgb/b1;-><init>(JLn7/p;)V

    .line 79
    .line 80
    .line 81
    iput-object v7, p0, Lhb/i;->x:Lgb/b1;

    .line 82
    .line 83
    iget-object v2, p0, Lhb/i;->O:Lgb/r3;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-object v2, v7

    .line 89
    :goto_2
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iget-object v3, p0, Lhb/i;->i:Lhb/b;

    .line 92
    .line 93
    const/16 v7, 0x20

    .line 94
    .line 95
    ushr-long v7, v5, v7

    .line 96
    .line 97
    long-to-int v7, v7

    .line 98
    long-to-int v5, v5

    .line 99
    invoke-virtual {v3, v7, v5, v4}, Lhb/b;->e(IIZ)V

    .line 100
    .line 101
    .line 102
    :cond_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    monitor-enter v2

    .line 104
    :try_start_3
    iget-boolean v1, v2, Lgb/b1;->d:Z

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    iget-object v1, v2, Lgb/b1;->c:Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    monitor-exit v2

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    iget-object v1, v2, Lgb/b1;->e:Ljava/lang/Throwable;

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    new-instance v3, Lgb/a1;

    .line 120
    .line 121
    invoke-direct {v3, p1, v1}, Lgb/a1;-><init>(Lgb/u$a;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    iget-wide v3, v2, Lgb/b1;->f:J

    .line 126
    .line 127
    new-instance v1, Lgb/z0;

    .line 128
    .line 129
    invoke-direct {v1, p1, v3, v4}, Lgb/z0;-><init>(Lgb/u$a;J)V

    .line 130
    .line 131
    .line 132
    move-object v3, v1

    .line 133
    :goto_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 134
    :try_start_4
    invoke-virtual {v0, v3}, Ls7/c;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catchall_2
    move-exception p1

    .line 139
    sget-object v0, Lgb/b1;->g:Ljava/util/logging/Logger;

    .line 140
    .line 141
    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 142
    .line 143
    const-string v2, "Failed to execute PingCallback"

    .line 144
    .line 145
    invoke-virtual {v0, v1, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_4
    return-void

    .line 149
    :catchall_3
    move-exception p1

    .line 150
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 151
    throw p1

    .line 152
    :goto_5
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 153
    throw p1
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
.end method

.method public final f()Leb/f0;
    .locals 1

    iget-object v0, p0, Lhb/i;->l:Leb/f0;

    return-object v0
.end method

.method public final g(Lgb/h2$a;)Ljava/lang/Runnable;
    .locals 8

    .line 1
    iput-object p1, p0, Lhb/i;->h:Lgb/h2$a;

    .line 2
    .line 3
    iget-boolean p1, p0, Lhb/i;->H:Z

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    new-instance p1, Lgb/o1;

    .line 8
    .line 9
    new-instance v1, Lgb/o1$c;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lgb/o1$c;-><init>(Lgb/x;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lhb/i;->q:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    iget-wide v3, p0, Lhb/i;->I:J

    .line 17
    .line 18
    iget-wide v5, p0, Lhb/i;->J:J

    .line 19
    .line 20
    iget-boolean v7, p0, Lhb/i;->K:Z

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    invoke-direct/range {v0 .. v7}, Lgb/o1;-><init>(Lgb/o1$c;Ljava/util/concurrent/ScheduledExecutorService;JJZ)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lhb/i;->G:Lgb/o1;

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_0
    iget-boolean v0, p1, Lgb/o1;->d:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lgb/o1;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :cond_0
    monitor-exit p1

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    monitor-exit p1

    .line 40
    throw v0

    .line 41
    :cond_1
    :goto_0
    iget-object p1, p0, Lhb/i;->p:Lgb/f3;

    .line 42
    .line 43
    new-instance v0, Lhb/a;

    .line 44
    .line 45
    invoke-direct {v0, p1, p0}, Lhb/a;-><init>(Lgb/f3;Lhb/b$a;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lhb/i;->g:Ljb/h;

    .line 49
    .line 50
    new-instance v1, Lxc/r;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lxc/r;-><init>(Lxc/w;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-interface {p1, v1}, Ljb/h;->a(Lxc/r;)Ljb/f$d;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, Lhb/a$d;

    .line 61
    .line 62
    invoke-direct {v1, v0, p1}, Lhb/a$d;-><init>(Lhb/a;Ljb/c;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter p1

    .line 68
    :try_start_1
    new-instance v3, Lhb/b;

    .line 69
    .line 70
    invoke-direct {v3, p0, v1}, Lhb/b;-><init>(Lhb/b$a;Lhb/a$d;)V

    .line 71
    .line 72
    .line 73
    iput-object v3, p0, Lhb/i;->i:Lhb/b;

    .line 74
    .line 75
    new-instance v1, Lhb/p;

    .line 76
    .line 77
    invoke-direct {v1, p0, v3}, Lhb/p;-><init>(Lhb/p$c;Lhb/b;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lhb/i;->j:Lhb/p;

    .line 81
    .line 82
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 83
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 84
    .line 85
    invoke-direct {p1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lhb/i;->p:Lgb/f3;

    .line 89
    .line 90
    new-instance v2, Lhb/i$b;

    .line 91
    .line 92
    invoke-direct {v2, p0, p1, v0}, Lhb/i$b;-><init>(Lhb/i;Ljava/util/concurrent/CountDownLatch;Lhb/a;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lgb/f3;->execute(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    :try_start_2
    invoke-virtual {p0}, Lhb/i;->s()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lhb/i;->p:Lgb/f3;

    .line 105
    .line 106
    new-instance v0, Lhb/i$c;

    .line 107
    .line 108
    invoke-direct {v0, p0}, Lhb/i$c;-><init>(Lhb/i;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lgb/f3;->execute(Ljava/lang/Runnable;)V

    .line 112
    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    return-object p1

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :catchall_2
    move-exception v0

    .line 122
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    throw v0
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
.end method

.method public final getAttributes()Leb/a;
    .locals 1

    iget-object v0, p0, Lhb/i;->u:Leb/a;

    return-object v0
.end method

.method public final h(Leb/e1;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lhb/i;->c(Leb/e1;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lhb/h;

    .line 37
    .line 38
    iget-object v3, v3, Lhb/h;->l:Lhb/h$b;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    new-instance v5, Leb/s0;

    .line 42
    .line 43
    invoke-direct {v5}, Leb/s0;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v5, p1, v4}, Lgb/a$b;->i(Leb/s0;Leb/e1;Z)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lhb/h;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lhb/i;->q(Lhb/h;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lhb/h;

    .line 76
    .line 77
    iget-object v3, v2, Lhb/h;->l:Lhb/h$b;

    .line 78
    .line 79
    sget-object v4, Lgb/t$a;->d:Lgb/t$a;

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    new-instance v6, Leb/s0;

    .line 83
    .line 84
    invoke-direct {v6}, Leb/s0;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, p1, v4, v5, v6}, Lgb/a$b;->j(Leb/e1;Lgb/t$a;ZLeb/s0;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v2}, Lhb/i;->q(Lhb/h;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    iget-object p1, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lhb/i;->w()V

    .line 100
    .line 101
    .line 102
    monitor-exit v0

    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    throw p1
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
.end method

.method public final k(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lkb/b;
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    new-instance v2, Lkb/a$a;

    .line 6
    .line 7
    invoke-direct {v2}, Lkb/a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "https"

    .line 11
    .line 12
    iput-object v3, v2, Lkb/a$a;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "host == null"

    .line 19
    .line 20
    if-eqz v3, :cond_35

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x0

    .line 27
    move v7, v6

    .line 28
    :goto_0
    const/4 v8, -0x1

    .line 29
    if-ge v7, v5, :cond_3

    .line 30
    .line 31
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    const/16 v10, 0x25

    .line 36
    .line 37
    if-eq v9, v10, :cond_0

    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v9, Lxc/f;

    .line 43
    .line 44
    invoke-direct {v9}, Lxc/f;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v6, v7, v3}, Lxc/f;->G0(IILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    if-ge v7, v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3, v7}, Ljava/lang/String;->codePointAt(I)I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-ne v11, v10, :cond_1

    .line 57
    .line 58
    add-int/lit8 v12, v7, 0x2

    .line 59
    .line 60
    if-ge v12, v5, :cond_1

    .line 61
    .line 62
    add-int/lit8 v13, v7, 0x1

    .line 63
    .line 64
    invoke-virtual {v3, v13}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    invoke-static {v13}, Lkb/a;->a(C)I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    invoke-virtual {v3, v12}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    invoke-static {v14}, Lkb/a;->a(C)I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    if-eq v13, v8, :cond_1

    .line 81
    .line 82
    if-eq v14, v8, :cond_1

    .line 83
    .line 84
    shl-int/lit8 v7, v13, 0x4

    .line 85
    .line 86
    add-int/2addr v7, v14

    .line 87
    invoke-virtual {v9, v7}, Lxc/f;->B0(I)V

    .line 88
    .line 89
    .line 90
    move v7, v12

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    invoke-virtual {v9, v11}, Lxc/f;->I0(I)V

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    add-int/2addr v7, v11

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v9}, Lxc/f;->k0()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :goto_3
    const-string v7, "["

    .line 111
    .line 112
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const-string v9, ":"

    .line 117
    .line 118
    const/4 v10, 0x1

    .line 119
    if-eqz v7, :cond_28

    .line 120
    .line 121
    const-string v7, "]"

    .line 122
    .line 123
    invoke-virtual {v5, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_28

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    sub-int/2addr v7, v10

    .line 134
    const/16 v11, 0x10

    .line 135
    .line 136
    new-array v12, v11, [B

    .line 137
    .line 138
    move v13, v10

    .line 139
    move v14, v11

    .line 140
    move v10, v8

    .line 141
    move v11, v10

    .line 142
    move v8, v6

    .line 143
    :goto_4
    if-ge v13, v7, :cond_1b

    .line 144
    .line 145
    if-ne v6, v14, :cond_5

    .line 146
    .line 147
    :cond_4
    :goto_5
    move-object/from16 v17, v3

    .line 148
    .line 149
    goto/16 :goto_12

    .line 150
    .line 151
    :cond_5
    add-int/lit8 v14, v13, 0x2

    .line 152
    .line 153
    if-gt v14, v7, :cond_8

    .line 154
    .line 155
    const-string v15, "::"

    .line 156
    .line 157
    move/from16 v16, v11

    .line 158
    .line 159
    const/4 v11, 0x2

    .line 160
    invoke-virtual {v5, v13, v15, v8, v11}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-eqz v11, :cond_9

    .line 165
    .line 166
    const/4 v8, -0x1

    .line 167
    if-eq v10, v8, :cond_6

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_6
    add-int/lit8 v6, v6, 0x2

    .line 171
    .line 172
    move-object/from16 v17, v3

    .line 173
    .line 174
    move v10, v6

    .line 175
    if-ne v14, v7, :cond_7

    .line 176
    .line 177
    goto/16 :goto_c

    .line 178
    .line 179
    :cond_7
    move v11, v14

    .line 180
    goto/16 :goto_e

    .line 181
    .line 182
    :cond_8
    move/from16 v16, v11

    .line 183
    .line 184
    :cond_9
    if-eqz v6, :cond_17

    .line 185
    .line 186
    const/4 v11, 0x1

    .line 187
    invoke-virtual {v5, v13, v9, v8, v11}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-eqz v14, :cond_a

    .line 192
    .line 193
    add-int/lit8 v13, v13, 0x1

    .line 194
    .line 195
    goto/16 :goto_d

    .line 196
    .line 197
    :cond_a
    const-string v14, "."

    .line 198
    .line 199
    invoke-virtual {v5, v13, v14, v8, v11}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_4

    .line 204
    .line 205
    add-int/lit8 v8, v6, -0x2

    .line 206
    .line 207
    move v13, v8

    .line 208
    move/from16 v11, v16

    .line 209
    .line 210
    :goto_6
    if-ge v11, v7, :cond_14

    .line 211
    .line 212
    const/16 v14, 0x10

    .line 213
    .line 214
    if-ne v13, v14, :cond_b

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_b
    if-eq v13, v8, :cond_d

    .line 218
    .line 219
    invoke-virtual {v5, v11}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    const/16 v15, 0x2e

    .line 224
    .line 225
    if-eq v14, v15, :cond_c

    .line 226
    .line 227
    :goto_7
    move-object/from16 v17, v3

    .line 228
    .line 229
    move/from16 v16, v10

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_c
    add-int/lit8 v11, v11, 0x1

    .line 233
    .line 234
    :cond_d
    const/4 v14, 0x0

    .line 235
    move v15, v14

    .line 236
    move v14, v11

    .line 237
    :goto_8
    if-ge v14, v7, :cond_11

    .line 238
    .line 239
    move/from16 v16, v10

    .line 240
    .line 241
    invoke-virtual {v5, v14}, Ljava/lang/String;->charAt(I)C

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    move-object/from16 v17, v3

    .line 246
    .line 247
    const/16 v3, 0x30

    .line 248
    .line 249
    if-lt v10, v3, :cond_12

    .line 250
    .line 251
    const/16 v3, 0x39

    .line 252
    .line 253
    if-le v10, v3, :cond_e

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_e
    if-nez v15, :cond_f

    .line 257
    .line 258
    if-eq v11, v14, :cond_f

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_f
    mul-int/lit8 v15, v15, 0xa

    .line 262
    .line 263
    add-int/2addr v15, v10

    .line 264
    add-int/lit8 v15, v15, -0x30

    .line 265
    .line 266
    const/16 v3, 0xff

    .line 267
    .line 268
    if-le v15, v3, :cond_10

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_10
    add-int/lit8 v14, v14, 0x1

    .line 272
    .line 273
    move/from16 v10, v16

    .line 274
    .line 275
    move-object/from16 v3, v17

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_11
    move-object/from16 v17, v3

    .line 279
    .line 280
    move/from16 v16, v10

    .line 281
    .line 282
    :cond_12
    :goto_9
    sub-int v3, v14, v11

    .line 283
    .line 284
    if-nez v3, :cond_13

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_13
    add-int/lit8 v3, v13, 0x1

    .line 288
    .line 289
    int-to-byte v10, v15

    .line 290
    aput-byte v10, v12, v13

    .line 291
    .line 292
    move v13, v3

    .line 293
    move v11, v14

    .line 294
    move/from16 v10, v16

    .line 295
    .line 296
    move-object/from16 v3, v17

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_14
    move-object/from16 v17, v3

    .line 300
    .line 301
    move/from16 v16, v10

    .line 302
    .line 303
    add-int/lit8 v8, v8, 0x4

    .line 304
    .line 305
    if-eq v13, v8, :cond_15

    .line 306
    .line 307
    :goto_a
    const/4 v3, 0x0

    .line 308
    goto :goto_b

    .line 309
    :cond_15
    const/4 v3, 0x1

    .line 310
    :goto_b
    if-nez v3, :cond_16

    .line 311
    .line 312
    goto :goto_12

    .line 313
    :cond_16
    add-int/lit8 v6, v6, 0x2

    .line 314
    .line 315
    move/from16 v10, v16

    .line 316
    .line 317
    :goto_c
    const/16 v14, 0x10

    .line 318
    .line 319
    goto :goto_11

    .line 320
    :cond_17
    :goto_d
    move-object/from16 v17, v3

    .line 321
    .line 322
    move/from16 v16, v10

    .line 323
    .line 324
    move v11, v13

    .line 325
    move/from16 v10, v16

    .line 326
    .line 327
    :goto_e
    const/4 v3, 0x0

    .line 328
    move v13, v11

    .line 329
    :goto_f
    if-ge v13, v7, :cond_19

    .line 330
    .line 331
    invoke-virtual {v5, v13}, Ljava/lang/String;->charAt(I)C

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    invoke-static {v8}, Lkb/a;->a(C)I

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    const/4 v14, -0x1

    .line 340
    if-ne v8, v14, :cond_18

    .line 341
    .line 342
    goto :goto_10

    .line 343
    :cond_18
    shl-int/lit8 v3, v3, 0x4

    .line 344
    .line 345
    add-int/2addr v3, v8

    .line 346
    add-int/lit8 v13, v13, 0x1

    .line 347
    .line 348
    goto :goto_f

    .line 349
    :cond_19
    :goto_10
    sub-int v8, v13, v11

    .line 350
    .line 351
    if-eqz v8, :cond_1c

    .line 352
    .line 353
    const/4 v14, 0x4

    .line 354
    if-le v8, v14, :cond_1a

    .line 355
    .line 356
    goto :goto_12

    .line 357
    :cond_1a
    add-int/lit8 v8, v6, 0x1

    .line 358
    .line 359
    ushr-int/lit8 v14, v3, 0x8

    .line 360
    .line 361
    and-int/lit16 v14, v14, 0xff

    .line 362
    .line 363
    int-to-byte v14, v14

    .line 364
    aput-byte v14, v12, v6

    .line 365
    .line 366
    add-int/lit8 v6, v8, 0x1

    .line 367
    .line 368
    and-int/lit16 v3, v3, 0xff

    .line 369
    .line 370
    int-to-byte v3, v3

    .line 371
    aput-byte v3, v12, v8

    .line 372
    .line 373
    const/4 v8, 0x0

    .line 374
    const/16 v14, 0x10

    .line 375
    .line 376
    move-object/from16 v3, v17

    .line 377
    .line 378
    goto/16 :goto_4

    .line 379
    .line 380
    :cond_1b
    move-object/from16 v17, v3

    .line 381
    .line 382
    move/from16 v16, v10

    .line 383
    .line 384
    :goto_11
    if-eq v6, v14, :cond_1e

    .line 385
    .line 386
    const/4 v3, -0x1

    .line 387
    if-ne v10, v3, :cond_1d

    .line 388
    .line 389
    :cond_1c
    :goto_12
    const/4 v3, 0x0

    .line 390
    const/4 v5, 0x0

    .line 391
    goto :goto_14

    .line 392
    :cond_1d
    sub-int v3, v6, v10

    .line 393
    .line 394
    rsub-int/lit8 v5, v3, 0x10

    .line 395
    .line 396
    invoke-static {v12, v10, v12, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    .line 398
    .line 399
    rsub-int/lit8 v3, v6, 0x10

    .line 400
    .line 401
    add-int/2addr v3, v10

    .line 402
    const/4 v5, 0x0

    .line 403
    invoke-static {v12, v10, v3, v5}, Ljava/util/Arrays;->fill([BIIB)V

    .line 404
    .line 405
    .line 406
    move v3, v5

    .line 407
    goto :goto_13

    .line 408
    :cond_1e
    const/4 v3, 0x0

    .line 409
    :goto_13
    :try_start_0
    invoke-static {v12}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 410
    .line 411
    .line 412
    move-result-object v5
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 413
    :goto_14
    if-nez v5, :cond_1f

    .line 414
    .line 415
    goto/16 :goto_1a

    .line 416
    .line 417
    :cond_1f
    invoke-virtual {v5}, Ljava/net/InetAddress;->getAddress()[B

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    array-length v6, v5

    .line 422
    const/16 v7, 0x10

    .line 423
    .line 424
    if-ne v6, v7, :cond_27

    .line 425
    .line 426
    const/4 v6, -0x1

    .line 427
    move v8, v3

    .line 428
    move v10, v8

    .line 429
    :goto_15
    array-length v11, v5

    .line 430
    if-ge v8, v11, :cond_22

    .line 431
    .line 432
    move v11, v8

    .line 433
    :goto_16
    if-ge v11, v7, :cond_20

    .line 434
    .line 435
    aget-byte v7, v5, v11

    .line 436
    .line 437
    if-nez v7, :cond_20

    .line 438
    .line 439
    add-int/lit8 v7, v11, 0x1

    .line 440
    .line 441
    aget-byte v7, v5, v7

    .line 442
    .line 443
    if-nez v7, :cond_20

    .line 444
    .line 445
    add-int/lit8 v11, v11, 0x2

    .line 446
    .line 447
    const/16 v7, 0x10

    .line 448
    .line 449
    goto :goto_16

    .line 450
    :cond_20
    sub-int v7, v11, v8

    .line 451
    .line 452
    if-le v7, v10, :cond_21

    .line 453
    .line 454
    move v10, v7

    .line 455
    move v6, v8

    .line 456
    :cond_21
    add-int/lit8 v8, v11, 0x2

    .line 457
    .line 458
    const/16 v7, 0x10

    .line 459
    .line 460
    goto :goto_15

    .line 461
    :cond_22
    new-instance v7, Lxc/f;

    .line 462
    .line 463
    invoke-direct {v7}, Lxc/f;-><init>()V

    .line 464
    .line 465
    .line 466
    :cond_23
    :goto_17
    array-length v8, v5

    .line 467
    if-ge v3, v8, :cond_26

    .line 468
    .line 469
    const/16 v8, 0x3a

    .line 470
    .line 471
    if-ne v3, v6, :cond_24

    .line 472
    .line 473
    invoke-virtual {v7, v8}, Lxc/f;->B0(I)V

    .line 474
    .line 475
    .line 476
    add-int/2addr v3, v10

    .line 477
    const/16 v11, 0x10

    .line 478
    .line 479
    if-ne v3, v11, :cond_23

    .line 480
    .line 481
    invoke-virtual {v7, v8}, Lxc/f;->B0(I)V

    .line 482
    .line 483
    .line 484
    goto :goto_17

    .line 485
    :cond_24
    if-lez v3, :cond_25

    .line 486
    .line 487
    invoke-virtual {v7, v8}, Lxc/f;->B0(I)V

    .line 488
    .line 489
    .line 490
    :cond_25
    aget-byte v8, v5, v3

    .line 491
    .line 492
    and-int/lit16 v8, v8, 0xff

    .line 493
    .line 494
    shl-int/lit8 v8, v8, 0x8

    .line 495
    .line 496
    add-int/lit8 v11, v3, 0x1

    .line 497
    .line 498
    aget-byte v11, v5, v11

    .line 499
    .line 500
    and-int/lit16 v11, v11, 0xff

    .line 501
    .line 502
    or-int/2addr v8, v11

    .line 503
    int-to-long v11, v8

    .line 504
    invoke-virtual {v7, v11, v12}, Lxc/f;->C0(J)Lxc/f;

    .line 505
    .line 506
    .line 507
    add-int/lit8 v3, v3, 0x2

    .line 508
    .line 509
    goto :goto_17

    .line 510
    :cond_26
    invoke-virtual {v7}, Lxc/f;->k0()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    goto :goto_1b

    .line 515
    :cond_27
    new-instance v0, Ljava/lang/AssertionError;

    .line 516
    .line 517
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 518
    .line 519
    .line 520
    throw v0

    .line 521
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 522
    .line 523
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 524
    .line 525
    .line 526
    throw v0

    .line 527
    :cond_28
    move-object/from16 v17, v3

    .line 528
    .line 529
    :try_start_1
    invoke-static {v5}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 534
    .line 535
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    if-eqz v5, :cond_29

    .line 544
    .line 545
    goto :goto_1a

    .line 546
    :cond_29
    move v5, v6

    .line 547
    :goto_18
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    if-ge v5, v7, :cond_2d

    .line 552
    .line 553
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    const/16 v8, 0x1f

    .line 558
    .line 559
    if-le v7, v8, :cond_2c

    .line 560
    .line 561
    const/16 v8, 0x7f

    .line 562
    .line 563
    if-lt v7, v8, :cond_2a

    .line 564
    .line 565
    goto :goto_19

    .line 566
    :cond_2a
    const-string v8, " #%/:?@[\\]"

    .line 567
    .line 568
    invoke-virtual {v8, v7}, Ljava/lang/String;->indexOf(I)I

    .line 569
    .line 570
    .line 571
    move-result v7
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 572
    const/4 v8, -0x1

    .line 573
    if-eq v7, v8, :cond_2b

    .line 574
    .line 575
    goto :goto_19

    .line 576
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 577
    .line 578
    goto :goto_18

    .line 579
    :cond_2c
    :goto_19
    const/4 v6, 0x1

    .line 580
    :cond_2d
    if-eqz v6, :cond_2e

    .line 581
    .line 582
    :catch_1
    :goto_1a
    const/4 v3, 0x0

    .line 583
    :cond_2e
    :goto_1b
    if-eqz v3, :cond_34

    .line 584
    .line 585
    iput-object v3, v2, Lkb/a$a;->b:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getPort()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-lez v3, :cond_33

    .line 592
    .line 593
    const v5, 0xffff

    .line 594
    .line 595
    .line 596
    if-gt v3, v5, :cond_33

    .line 597
    .line 598
    iput v3, v2, Lkb/a$a;->c:I

    .line 599
    .line 600
    iget-object v3, v2, Lkb/a$a;->a:Ljava/lang/String;

    .line 601
    .line 602
    if-eqz v3, :cond_32

    .line 603
    .line 604
    iget-object v3, v2, Lkb/a$a;->b:Ljava/lang/String;

    .line 605
    .line 606
    if-eqz v3, :cond_31

    .line 607
    .line 608
    new-instance v3, Lkb/a;

    .line 609
    .line 610
    invoke-direct {v3, v2}, Lkb/a;-><init>(Lkb/a$a;)V

    .line 611
    .line 612
    .line 613
    new-instance v2, Lkb/b$a;

    .line 614
    .line 615
    invoke-direct {v2}, Lkb/b$a;-><init>()V

    .line 616
    .line 617
    .line 618
    iput-object v3, v2, Lkb/b$a;->a:Lkb/a;

    .line 619
    .line 620
    new-instance v4, Ljava/lang/StringBuilder;

    .line 621
    .line 622
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 623
    .line 624
    .line 625
    iget-object v5, v3, Lkb/a;->a:Ljava/lang/String;

    .line 626
    .line 627
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    iget v3, v3, Lkb/a;->b:I

    .line 634
    .line 635
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    const-string v4, "Host"

    .line 643
    .line 644
    invoke-virtual {v2, v4, v3}, Lkb/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    move-object/from16 v5, p0

    .line 648
    .line 649
    iget-object v3, v5, Lhb/i;->c:Ljava/lang/String;

    .line 650
    .line 651
    const-string v4, "User-Agent"

    .line 652
    .line 653
    invoke-virtual {v2, v4, v3}, Lkb/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    if-eqz v0, :cond_2f

    .line 657
    .line 658
    if-eqz v1, :cond_2f

    .line 659
    .line 660
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    const-string v1, "ISO-8859-1"

    .line 679
    .line 680
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-static {v0}, Lxc/i;->o([B)Lxc/i;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Lxc/i;->f()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    new-instance v1, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 695
    .line 696
    .line 697
    const-string v3, "Basic "

    .line 698
    .line 699
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v0
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    .line 709
    const-string v1, "Proxy-Authorization"

    .line 710
    .line 711
    invoke-virtual {v2, v1, v0}, Lkb/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    goto :goto_1c

    .line 715
    :catch_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 716
    .line 717
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 718
    .line 719
    .line 720
    throw v0

    .line 721
    :cond_2f
    :goto_1c
    iget-object v0, v2, Lkb/b$a;->a:Lkb/a;

    .line 722
    .line 723
    if-eqz v0, :cond_30

    .line 724
    .line 725
    new-instance v0, Lkb/b;

    .line 726
    .line 727
    invoke-direct {v0, v2}, Lkb/b;-><init>(Lkb/b$a;)V

    .line 728
    .line 729
    .line 730
    return-object v0

    .line 731
    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 732
    .line 733
    const-string v1, "url == null"

    .line 734
    .line 735
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    throw v0

    .line 739
    :cond_31
    move-object/from16 v5, p0

    .line 740
    .line 741
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 742
    .line 743
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v0

    .line 747
    :cond_32
    move-object/from16 v5, p0

    .line 748
    .line 749
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 750
    .line 751
    const-string v1, "scheme == null"

    .line 752
    .line 753
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    throw v0

    .line 757
    :cond_33
    move-object/from16 v5, p0

    .line 758
    .line 759
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 760
    .line 761
    const-string v1, "unexpected port: "

    .line 762
    .line 763
    invoke-static {v1, v3}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    throw v0

    .line 771
    :cond_34
    move-object/from16 v5, p0

    .line 772
    .line 773
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 774
    .line 775
    const-string v1, "unexpected host: "

    .line 776
    .line 777
    move-object/from16 v2, v17

    .line 778
    .line 779
    invoke-static {v1, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    throw v0

    .line 787
    :cond_35
    move-object/from16 v5, p0

    .line 788
    .line 789
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 790
    .line 791
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    throw v0
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public final l(ILeb/e1;Lgb/t$a;ZLjb/a;Leb/s0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lhb/h;

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    if-eqz p5, :cond_0

    .line 19
    .line 20
    iget-object p5, p0, Lhb/i;->i:Lhb/b;

    .line 21
    .line 22
    sget-object v2, Ljb/a;->q:Ljb/a;

    .line 23
    .line 24
    invoke-virtual {p5, p1, v2}, Lhb/b;->R(ILjb/a;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object p1, v1, Lhb/h;->l:Lhb/h$b;

    .line 30
    .line 31
    if-eqz p6, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p6, Leb/s0;

    .line 35
    .line 36
    invoke-direct {p6}, Leb/s0;-><init>()V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p1, p2, p3, p4, p6}, Lgb/a$b;->j(Leb/e1;Lgb/t$a;ZLeb/s0;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lhb/i;->u()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Lhb/i;->w()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lhb/i;->q(Lhb/h;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lhb/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lgb/v0;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhb/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final n()I
    .locals 3

    iget-object v0, p0, Lhb/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lgb/v0;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lhb/i;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public final o()Leb/f1;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhb/i;->v:Leb/e1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v2, Leb/f1;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Leb/f1;-><init>(Leb/e1;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object v2

    .line 15
    :cond_0
    sget-object v1, Leb/e1;->n:Leb/e1;

    .line 16
    .line 17
    const-string v2, "Connection closed"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Leb/f1;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Leb/f1;-><init>(Leb/e1;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v2

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final p(I)Z
    .locals 3

    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lhb/i;->m:I

    const/4 v2, 0x1

    if-ge p1, v1, :cond_0

    and-int/2addr p1, v2

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final q(Lhb/h;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lhb/i;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    iput-boolean v1, p0, Lhb/i;->z:Z

    .line 23
    .line 24
    iget-object v0, p0, Lhb/i;->G:Lgb/o1;

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget-boolean v2, v0, Lgb/o1;->d:Z

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget v2, v0, Lgb/o1;->e:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    if-eq v2, v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    :cond_1
    const/4 v2, 0x1

    .line 43
    iput v2, v0, Lgb/o1;->e:I

    .line 44
    .line 45
    :cond_2
    iget v2, v0, Lgb/o1;->e:I

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    if-ne v2, v3, :cond_3

    .line 49
    .line 50
    const/4 v2, 0x5

    .line 51
    iput v2, v0, Lgb/o1;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    :cond_3
    :goto_0
    monitor-exit v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    monitor-exit v0

    .line 57
    throw p1

    .line 58
    :cond_4
    :goto_1
    iget-boolean v0, p1, Lgb/a;->c:Z

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Lhb/i;->P:Lhb/i$a;

    .line 63
    .line 64
    invoke-virtual {v0, p1, v1}, Lgb/c1;->c(Ljava/lang/Object;Z)V

    .line 65
    .line 66
    .line 67
    :cond_5
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final s()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhb/i;->i:Lhb/b;

    .line 5
    .line 6
    invoke-virtual {v1}, Lhb/b;->w()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lc4/x;

    .line 10
    .line 11
    invoke-direct {v1}, Lc4/x;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x7

    .line 15
    iget v3, p0, Lhb/i;->f:I

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Lc4/x;->d(II)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lhb/i;->i:Lhb/b;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lhb/b;->a0(Lc4/x;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lhb/i;->f:I

    .line 27
    .line 28
    const v2, 0xffff

    .line 29
    .line 30
    .line 31
    if-le v1, v2, :cond_0

    .line 32
    .line 33
    iget-object v3, p0, Lhb/i;->i:Lhb/b;

    .line 34
    .line 35
    sub-int/2addr v1, v2

    .line 36
    int-to-long v1, v1

    .line 37
    invoke-virtual {v3, v4, v1, v2}, Lhb/b;->d(IJ)V

    .line 38
    .line 39
    .line 40
    :cond_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw v1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final t(ILjb/a;Leb/e1;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lhb/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhb/i;->v:Leb/e1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iput-object p3, p0, Lhb/i;->v:Leb/e1;

    .line 9
    .line 10
    iget-object v1, p0, Lhb/i;->h:Lgb/h2$a;

    .line 11
    .line 12
    invoke-interface {v1, p3}, Lgb/h2$a;->a(Leb/e1;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-boolean v3, p0, Lhb/i;->w:Z

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    iput-boolean v1, p0, Lhb/i;->w:Z

    .line 24
    .line 25
    iget-object v3, p0, Lhb/i;->i:Lhb/b;

    .line 26
    .line 27
    new-array v4, v2, [B

    .line 28
    .line 29
    invoke-virtual {v3, p2, v4}, Lhb/b;->o0(Ljb/a;[B)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object p2, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-le v4, p1, :cond_2

    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lhb/h;

    .line 74
    .line 75
    iget-object v4, v4, Lhb/h;->l:Lhb/h$b;

    .line 76
    .line 77
    sget-object v5, Lgb/t$a;->b:Lgb/t$a;

    .line 78
    .line 79
    new-instance v6, Leb/s0;

    .line 80
    .line 81
    invoke-direct {v6}, Leb/s0;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, p3, v5, v2, v6}, Lgb/a$b;->j(Leb/e1;Lgb/t$a;ZLeb/s0;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lhb/h;

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lhb/i;->q(Lhb/h;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    iget-object p1, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_4

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Lhb/h;

    .line 114
    .line 115
    iget-object v2, p2, Lhb/h;->l:Lhb/h$b;

    .line 116
    .line 117
    sget-object v3, Lgb/t$a;->d:Lgb/t$a;

    .line 118
    .line 119
    new-instance v4, Leb/s0;

    .line 120
    .line 121
    invoke-direct {v4}, Leb/s0;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, p3, v3, v1, v4}, Lgb/a$b;->j(Leb/e1;Lgb/t$a;ZLeb/s0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p2}, Lhb/i;->q(Lhb/h;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    iget-object p1, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lhb/i;->w()V

    .line 137
    .line 138
    .line 139
    monitor-exit v0

    .line 140
    return-void

    .line 141
    :catchall_0
    move-exception p1

    .line 142
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    throw p1
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lhb/i;->l:Leb/f0;

    .line 6
    .line 7
    iget-wide v1, v1, Leb/f0;->c:J

    .line 8
    .line 9
    const-string v3, "logId"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Ln7/g$a;->b(Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lhb/i;->a:Ljava/net/InetSocketAddress;

    .line 15
    .line 16
    const-string v2, "address"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final u()Z
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhb/i;->E:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lhb/i;->n:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    iget v2, p0, Lhb/i;->D:I

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lhb/i;->E:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhb/h;

    invoke-virtual {p0, v0}, Lhb/i;->v(Lhb/h;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final v(Lhb/h;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lhb/h;->l:Lhb/h$b;

    .line 2
    .line 3
    iget v0, v0, Lhb/h$b;->L:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, -0x1

    .line 8
    if-ne v0, v3, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    const-string v4, "StreamId already assigned"

    .line 14
    .line 15
    invoke-static {v0, v4}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 19
    .line 20
    iget v4, p0, Lhb/i;->m:I

    .line 21
    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v0, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-boolean v0, p0, Lhb/i;->z:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iput-boolean v2, p0, Lhb/i;->z:Z

    .line 34
    .line 35
    iget-object v0, p0, Lhb/i;->G:Lgb/o1;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lgb/o1;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-boolean v0, p1, Lgb/a;->c:Z

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lhb/i;->P:Lhb/i$a;

    .line 47
    .line 48
    invoke-virtual {v0, p1, v2}, Lgb/c1;->c(Ljava/lang/Object;Z)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v0, p1, Lhb/h;->l:Lhb/h$b;

    .line 52
    .line 53
    iget v4, p0, Lhb/i;->m:I

    .line 54
    .line 55
    iget v5, v0, Lhb/h$b;->L:I

    .line 56
    .line 57
    if-ne v5, v3, :cond_3

    .line 58
    .line 59
    move v3, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v3, v1

    .line 62
    :goto_1
    const-string v5, "the stream has been started with id %s"

    .line 63
    .line 64
    if-eqz v3, :cond_e

    .line 65
    .line 66
    iput v4, v0, Lhb/h$b;->L:I

    .line 67
    .line 68
    iget-object v3, v0, Lhb/h$b;->G:Lhb/p;

    .line 69
    .line 70
    new-instance v5, Lhb/p$b;

    .line 71
    .line 72
    iget v6, v3, Lhb/p;->c:I

    .line 73
    .line 74
    invoke-direct {v5, v3, v4, v6, v0}, Lhb/p$b;-><init>(Lhb/p;IILhb/h$b;)V

    .line 75
    .line 76
    .line 77
    iput-object v5, v0, Lhb/h$b;->K:Lhb/p$b;

    .line 78
    .line 79
    iget-object v3, v0, Lhb/h$b;->M:Lhb/h;

    .line 80
    .line 81
    iget-object v3, v3, Lhb/h;->l:Lhb/h$b;

    .line 82
    .line 83
    iget-object v4, v3, Lgb/a$b;->j:Lgb/t;

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    move v4, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v4, v1

    .line 90
    :goto_2
    invoke-static {v4}, Lx6/b;->J(Z)V

    .line 91
    .line 92
    .line 93
    iget-object v6, v3, Lgb/d$a;->b:Ljava/lang/Object;

    .line 94
    .line 95
    monitor-enter v6

    .line 96
    :try_start_0
    iget-boolean v4, v3, Lgb/d$a;->f:Z

    .line 97
    .line 98
    xor-int/2addr v4, v2

    .line 99
    const-string v5, "Already allocated"

    .line 100
    .line 101
    invoke-static {v4, v5}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-boolean v2, v3, Lgb/d$a;->f:Z

    .line 105
    .line 106
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 107
    iget-object v4, v3, Lgb/d$a;->b:Ljava/lang/Object;

    .line 108
    .line 109
    monitor-enter v4

    .line 110
    :try_start_1
    iget-object v5, v3, Lgb/d$a;->b:Ljava/lang/Object;

    .line 111
    .line 112
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :try_start_2
    iget-boolean v6, v3, Lgb/d$a;->f:Z

    .line 114
    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    iget v6, v3, Lgb/d$a;->e:I

    .line 118
    .line 119
    const v7, 0x8000

    .line 120
    .line 121
    .line 122
    if-ge v6, v7, :cond_5

    .line 123
    .line 124
    iget-boolean v6, v3, Lgb/d$a;->g:Z

    .line 125
    .line 126
    if-nez v6, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move v2, v1

    .line 130
    :goto_3
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    iget-object v2, v3, Lgb/a$b;->j:Lgb/t;

    .line 135
    .line 136
    invoke-interface {v2}, Lgb/n3;->c()V

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object v2, v3, Lgb/d$a;->c:Lgb/r3;

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v2, v2, Lgb/r3;->a:Lgb/o3;

    .line 145
    .line 146
    invoke-interface {v2}, Lgb/o3;->a()J

    .line 147
    .line 148
    .line 149
    iget-boolean v2, v0, Lhb/h$b;->I:Z

    .line 150
    .line 151
    if-eqz v2, :cond_9

    .line 152
    .line 153
    iget-object v2, v0, Lhb/h$b;->F:Lhb/b;

    .line 154
    .line 155
    iget-object v3, v0, Lhb/h$b;->M:Lhb/h;

    .line 156
    .line 157
    iget-boolean v3, v3, Lhb/h;->o:Z

    .line 158
    .line 159
    iget v4, v0, Lhb/h$b;->L:I

    .line 160
    .line 161
    iget-object v5, v0, Lhb/h$b;->y:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v2, v3, v4, v5}, Lhb/b;->A(ZILjava/util/List;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v0, Lhb/h$b;->M:Lhb/h;

    .line 167
    .line 168
    iget-object v2, v2, Lhb/h;->j:Lgb/l3;

    .line 169
    .line 170
    iget-object v2, v2, Lgb/l3;->a:[Lm/e;

    .line 171
    .line 172
    array-length v3, v2

    .line 173
    move v4, v1

    .line 174
    :goto_4
    if-ge v4, v3, :cond_7

    .line 175
    .line 176
    aget-object v5, v2, v4

    .line 177
    .line 178
    check-cast v5, Leb/h;

    .line 179
    .line 180
    invoke-virtual {v5}, Leb/h;->y()V

    .line 181
    .line 182
    .line 183
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_7
    const/4 v2, 0x0

    .line 187
    iput-object v2, v0, Lhb/h$b;->y:Ljava/util/ArrayList;

    .line 188
    .line 189
    iget-object v2, v0, Lhb/h$b;->z:Lxc/f;

    .line 190
    .line 191
    iget-wide v3, v2, Lxc/f;->b:J

    .line 192
    .line 193
    const-wide/16 v5, 0x0

    .line 194
    .line 195
    cmp-long v3, v3, v5

    .line 196
    .line 197
    if-lez v3, :cond_8

    .line 198
    .line 199
    iget-object v3, v0, Lhb/h$b;->G:Lhb/p;

    .line 200
    .line 201
    iget-boolean v4, v0, Lhb/h$b;->A:Z

    .line 202
    .line 203
    iget-object v5, v0, Lhb/h$b;->K:Lhb/p$b;

    .line 204
    .line 205
    iget-boolean v6, v0, Lhb/h$b;->B:Z

    .line 206
    .line 207
    invoke-virtual {v3, v4, v5, v2, v6}, Lhb/p;->a(ZLhb/p$b;Lxc/f;Z)V

    .line 208
    .line 209
    .line 210
    :cond_8
    iput-boolean v1, v0, Lhb/h$b;->I:Z

    .line 211
    .line 212
    :cond_9
    iget-object v0, p1, Lhb/h;->h:Leb/t0;

    .line 213
    .line 214
    iget-object v0, v0, Leb/t0;->a:Leb/t0$c;

    .line 215
    .line 216
    sget-object v1, Leb/t0$c;->a:Leb/t0$c;

    .line 217
    .line 218
    if-eq v0, v1, :cond_a

    .line 219
    .line 220
    sget-object v1, Leb/t0$c;->b:Leb/t0$c;

    .line 221
    .line 222
    if-ne v0, v1, :cond_b

    .line 223
    .line 224
    :cond_a
    iget-boolean p1, p1, Lhb/h;->o:Z

    .line 225
    .line 226
    if-eqz p1, :cond_c

    .line 227
    .line 228
    :cond_b
    iget-object p1, p0, Lhb/i;->i:Lhb/b;

    .line 229
    .line 230
    invoke-virtual {p1}, Lhb/b;->flush()V

    .line 231
    .line 232
    .line 233
    :cond_c
    iget p1, p0, Lhb/i;->m:I

    .line 234
    .line 235
    const v0, 0x7ffffffd

    .line 236
    .line 237
    .line 238
    if-lt p1, v0, :cond_d

    .line 239
    .line 240
    const p1, 0x7fffffff

    .line 241
    .line 242
    .line 243
    iput p1, p0, Lhb/i;->m:I

    .line 244
    .line 245
    sget-object v0, Ljb/a;->b:Ljb/a;

    .line 246
    .line 247
    sget-object v1, Leb/e1;->n:Leb/e1;

    .line 248
    .line 249
    const-string v2, "Stream ids exhausted"

    .line 250
    .line 251
    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {p0, p1, v0, v1}, Lhb/i;->t(ILjb/a;Leb/e1;)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_d
    add-int/lit8 p1, p1, 0x2

    .line 260
    .line 261
    iput p1, p0, Lhb/i;->m:I

    .line 262
    .line 263
    :goto_5
    return-void

    .line 264
    :catchall_0
    move-exception p1

    .line 265
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 266
    :try_start_5
    throw p1

    .line 267
    :catchall_1
    move-exception p1

    .line 268
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 269
    throw p1

    .line 270
    :catchall_2
    move-exception p1

    .line 271
    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 272
    throw p1

    .line 273
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    new-array v0, v2, [Ljava/lang/Object;

    .line 276
    .line 277
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    aput-object v2, v0, v1

    .line 282
    .line 283
    invoke-static {v5, v0}, Lp2/m0;->X(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final w()V
    .locals 9

    .line 1
    iget-object v0, p0, Lhb/i;->v:Leb/e1;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lhb/i;->n:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    iget-object v0, p0, Lhb/i;->E:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    iget-boolean v0, p0, Lhb/i;->y:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lhb/i;->y:Z

    .line 30
    .line 31
    iget-object v1, p0, Lhb/i;->G:Lgb/o1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    monitor-enter v1

    .line 38
    :try_start_0
    iget v4, v1, Lgb/o1;->e:I

    .line 39
    .line 40
    const/4 v5, 0x6

    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iput v5, v1, Lgb/o1;->e:I

    .line 44
    .line 45
    iget-object v4, v1, Lgb/o1;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-interface {v4, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v4, v1, Lgb/o1;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 53
    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-interface {v4, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 57
    .line 58
    .line 59
    iput-object v2, v1, Lgb/o1;->g:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :cond_3
    monitor-exit v1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    monitor-exit v1

    .line 65
    throw v0

    .line 66
    :cond_4
    :goto_0
    iget-object v1, p0, Lhb/i;->x:Lgb/b1;

    .line 67
    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Lhb/i;->o()Leb/f1;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    monitor-enter v1

    .line 75
    :try_start_1
    iget-boolean v5, v1, Lgb/b1;->d:Z

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    monitor-exit v1

    .line 80
    goto :goto_2

    .line 81
    :cond_5
    iput-boolean v0, v1, Lgb/b1;->d:Z

    .line 82
    .line 83
    iput-object v4, v1, Lgb/b1;->e:Ljava/lang/Throwable;

    .line 84
    .line 85
    iget-object v5, v1, Lgb/b1;->c:Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    iput-object v2, v1, Lgb/b1;->c:Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 90
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Ljava/util/Map$Entry;

    .line 109
    .line 110
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Lgb/u$a;

    .line 115
    .line 116
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 121
    .line 122
    new-instance v7, Lgb/a1;

    .line 123
    .line 124
    invoke-direct {v7, v6, v4}, Lgb/a1;-><init>(Lgb/u$a;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :try_start_2
    invoke-interface {v5, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_1
    move-exception v5

    .line 132
    sget-object v6, Lgb/b1;->g:Ljava/util/logging/Logger;

    .line 133
    .line 134
    sget-object v7, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 135
    .line 136
    const-string v8, "Failed to execute PingCallback"

    .line 137
    .line 138
    invoke-virtual {v6, v7, v8, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    :goto_2
    iput-object v2, p0, Lhb/i;->x:Lgb/b1;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catchall_2
    move-exception v0

    .line 146
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 147
    throw v0

    .line 148
    :cond_7
    :goto_3
    iget-boolean v1, p0, Lhb/i;->w:Z

    .line 149
    .line 150
    if-nez v1, :cond_8

    .line 151
    .line 152
    iput-boolean v0, p0, Lhb/i;->w:Z

    .line 153
    .line 154
    iget-object v0, p0, Lhb/i;->i:Lhb/b;

    .line 155
    .line 156
    sget-object v1, Ljb/a;->b:Ljb/a;

    .line 157
    .line 158
    new-array v2, v3, [B

    .line 159
    .line 160
    invoke-virtual {v0, v1, v2}, Lhb/b;->o0(Ljb/a;[B)V

    .line 161
    .line 162
    .line 163
    :cond_8
    iget-object v0, p0, Lhb/i;->i:Lhb/b;

    .line 164
    .line 165
    invoke-virtual {v0}, Lhb/b;->close()V

    .line 166
    .line 167
    .line 168
    :cond_9
    :goto_4
    return-void
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
