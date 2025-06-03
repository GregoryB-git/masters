.class public final Lgb/r1;
.super Leb/n0;
.source "SourceFile"

# interfaces
.implements Leb/e0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/r1$n;,
        Lgb/r1$h;,
        Lgb/r1$i;,
        Lgb/r1$g;,
        Lgb/r1$o;,
        Lgb/r1$l;,
        Lgb/r1$k;,
        Lgb/r1$p;,
        Lgb/r1$f;,
        Lgb/r1$m;,
        Lgb/r1$e;,
        Lgb/r1$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/n0;",
        "Leb/e0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final e0:Ljava/util/logging/Logger;

.field public static final f0:Ljava/util/regex/Pattern;

.field public static final g0:Leb/e1;

.field public static final h0:Leb/e1;

.field public static final i0:Leb/e1;

.field public static final j0:Lgb/g2;

.field public static final k0:Lgb/r1$a;

.field public static final l0:Lgb/r1$d;


# instance fields
.field public A:Z

.field public final B:Ljava/util/HashSet;

.field public C:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lgb/r1$m$e<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final D:Ljava/lang/Object;

.field public final E:Ljava/util/HashSet;

.field public final F:Lgb/f0;

.field public final G:Lgb/r1$p;

.field public final H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public I:Z

.field public J:Z

.field public volatile K:Z

.field public final L:Ljava/util/concurrent/CountDownLatch;

.field public final M:Lgb/t1;

.field public final N:Lgb/m;

.field public final O:Lgb/p;

.field public final P:Lgb/n;

.field public final Q:Leb/c0;

.field public final R:Lgb/r1$m;

.field public S:I

.field public T:Lgb/g2;

.field public U:Z

.field public final V:Z

.field public final W:Lgb/y2$s;

.field public final X:J

.field public final Y:J

.field public final Z:Z

.field public final a0:Leb/q$a;

.field public final b:Leb/f0;

.field public final b0:Lgb/r1$i;

.field public final c:Ljava/lang/String;

.field public final c0:Lgb/r1$e;

.field public final d:Leb/w0;

.field public final d0:Lgb/x2;

.field public final e:Leb/u0$a;

.field public final f:Lgb/i;

.field public final g:Lgb/l;

.field public final h:Lgb/r1$n;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Lgb/j3;

.field public final k:Lgb/r1$h;

.field public final l:Lgb/r1$h;

.field public final m:Lgb/o3;

.field public final n:Leb/h1;

.field public final o:Leb/s;

.field public final p:Leb/m;

.field public final q:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Ln7/p;",
            ">;"
        }
    .end annotation
.end field

.field public final r:J

.field public final s:Lgb/y;

.field public final t:Lgb/j$a;

.field public final u:Le9/a;

.field public final v:Ljava/util/ArrayList;

.field public w:Lgb/s0;

.field public x:Z

.field public y:Lgb/r1$k;

.field public volatile z:Leb/k0$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    const-class v0, Lgb/r1;

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
    sput-object v0, Lgb/r1;->e0:Ljava/util/logging/Logger;

    .line 12
    .line 13
    const-string v0, "[a-zA-Z][a-zA-Z0-9+.-]*:/.*"

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lgb/r1;->f0:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 22
    .line 23
    const-string v1, "Channel shutdownNow invoked"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sput-object v1, Lgb/r1;->g0:Leb/e1;

    .line 30
    .line 31
    const-string v1, "Channel shutdown invoked"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lgb/r1;->h0:Leb/e1;

    .line 38
    .line 39
    const-string v1, "Subchannel shutdown invoked"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lgb/r1;->i0:Leb/e1;

    .line 46
    .line 47
    new-instance v0, Lgb/g2;

    .line 48
    .line 49
    new-instance v3, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v4, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v1, v0

    .line 64
    invoke-direct/range {v1 .. v7}, Lgb/g2;-><init>(Lgb/g2$a;Ljava/util/HashMap;Ljava/util/HashMap;Lgb/y2$b0;Ljava/lang/Object;Ljava/util/Map;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lgb/r1;->j0:Lgb/g2;

    .line 68
    .line 69
    new-instance v0, Lgb/r1$a;

    .line 70
    .line 71
    invoke-direct {v0}, Lgb/r1$a;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lgb/r1;->k0:Lgb/r1$a;

    .line 75
    .line 76
    new-instance v0, Lgb/r1$d;

    .line 77
    .line 78
    invoke-direct {v0}, Lgb/r1$d;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lgb/r1;->l0:Lgb/r1$d;

    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Lgb/e2;Lgb/v;Lgb/k0$a;Lgb/j3;Lgb/v0$d;Ljava/util/ArrayList;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    sget-object v3, Lgb/o3;->a:Lgb/o3$a;

    .line 8
    .line 9
    invoke-direct/range {p0 .. p0}, Leb/n0;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v13, Leb/h1;

    .line 13
    .line 14
    new-instance v4, Lgb/r1$c;

    .line 15
    .line 16
    invoke-direct {v4, v0}, Lgb/r1$c;-><init>(Lgb/r1;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v13, v4}, Leb/h1;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 20
    .line 21
    .line 22
    iput-object v13, v0, Lgb/r1;->n:Leb/h1;

    .line 23
    .line 24
    new-instance v4, Lgb/y;

    .line 25
    .line 26
    invoke-direct {v4}, Lgb/y;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v4, v0, Lgb/r1;->s:Lgb/y;

    .line 30
    .line 31
    new-instance v4, Ljava/util/HashSet;

    .line 32
    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    const/high16 v6, 0x3f400000    # 0.75f

    .line 36
    .line 37
    invoke-direct {v4, v5, v6}, Ljava/util/HashSet;-><init>(IF)V

    .line 38
    .line 39
    .line 40
    iput-object v4, v0, Lgb/r1;->B:Ljava/util/HashSet;

    .line 41
    .line 42
    new-instance v4, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v4, v0, Lgb/r1;->D:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance v4, Ljava/util/HashSet;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-direct {v4, v5, v6}, Ljava/util/HashSet;-><init>(IF)V

    .line 53
    .line 54
    .line 55
    iput-object v4, v0, Lgb/r1;->E:Ljava/util/HashSet;

    .line 56
    .line 57
    new-instance v4, Lgb/r1$p;

    .line 58
    .line 59
    invoke-direct {v4, v0}, Lgb/r1$p;-><init>(Lgb/r1;)V

    .line 60
    .line 61
    .line 62
    iput-object v4, v0, Lgb/r1;->G:Lgb/r1$p;

    .line 63
    .line 64
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 68
    .line 69
    .line 70
    iput-object v4, v0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    .line 73
    .line 74
    invoke-direct {v4, v5}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v4, v0, Lgb/r1;->L:Ljava/util/concurrent/CountDownLatch;

    .line 78
    .line 79
    iput v5, v0, Lgb/r1;->S:I

    .line 80
    .line 81
    sget-object v4, Lgb/r1;->j0:Lgb/g2;

    .line 82
    .line 83
    iput-object v4, v0, Lgb/r1;->T:Lgb/g2;

    .line 84
    .line 85
    iput-boolean v6, v0, Lgb/r1;->U:Z

    .line 86
    .line 87
    new-instance v4, Lgb/y2$s;

    .line 88
    .line 89
    invoke-direct {v4}, Lgb/y2$s;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v4, v0, Lgb/r1;->W:Lgb/y2$s;

    .line 93
    .line 94
    sget-object v4, Leb/q;->d:Leb/q$a;

    .line 95
    .line 96
    iput-object v4, v0, Lgb/r1;->a0:Leb/q$a;

    .line 97
    .line 98
    new-instance v14, Lgb/r1$g;

    .line 99
    .line 100
    invoke-direct {v14, v0}, Lgb/r1$g;-><init>(Lgb/r1;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Lgb/r1$i;

    .line 104
    .line 105
    invoke-direct {v4, v0}, Lgb/r1$i;-><init>(Lgb/r1;)V

    .line 106
    .line 107
    .line 108
    iput-object v4, v0, Lgb/r1;->b0:Lgb/r1$i;

    .line 109
    .line 110
    new-instance v4, Lgb/r1$e;

    .line 111
    .line 112
    invoke-direct {v4, v0}, Lgb/r1$e;-><init>(Lgb/r1;)V

    .line 113
    .line 114
    .line 115
    iput-object v4, v0, Lgb/r1;->c0:Lgb/r1$e;

    .line 116
    .line 117
    iget-object v15, v1, Lgb/e2;->f:Ljava/lang/String;

    .line 118
    .line 119
    const-string v4, "target"

    .line 120
    .line 121
    invoke-static {v15, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iput-object v15, v0, Lgb/r1;->c:Ljava/lang/String;

    .line 125
    .line 126
    new-instance v4, Leb/f0;

    .line 127
    .line 128
    sget-object v5, Leb/f0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    const-string v7, "Channel"

    .line 135
    .line 136
    invoke-direct {v4, v5, v6, v7, v15}, Leb/f0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iput-object v4, v0, Lgb/r1;->b:Leb/f0;

    .line 140
    .line 141
    iput-object v3, v0, Lgb/r1;->m:Lgb/o3;

    .line 142
    .line 143
    iget-object v5, v1, Lgb/e2;->a:Lgb/j3;

    .line 144
    .line 145
    const-string v6, "executorPool"

    .line 146
    .line 147
    invoke-static {v5, v6}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-object v5, v0, Lgb/r1;->j:Lgb/j3;

    .line 151
    .line 152
    invoke-virtual {v5}, Lgb/j3;->b()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    move-object v12, v5

    .line 157
    check-cast v12, Ljava/util/concurrent/Executor;

    .line 158
    .line 159
    const-string v5, "executor"

    .line 160
    .line 161
    invoke-static {v12, v5}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v12, v0, Lgb/r1;->i:Ljava/util/concurrent/Executor;

    .line 165
    .line 166
    new-instance v11, Lgb/r1$h;

    .line 167
    .line 168
    iget-object v5, v1, Lgb/e2;->b:Lgb/j3;

    .line 169
    .line 170
    const-string v6, "offloadExecutorPool"

    .line 171
    .line 172
    invoke-static {v5, v6}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v11, v5}, Lgb/r1$h;-><init>(Lgb/j3;)V

    .line 176
    .line 177
    .line 178
    iput-object v11, v0, Lgb/r1;->l:Lgb/r1$h;

    .line 179
    .line 180
    new-instance v10, Lgb/l;

    .line 181
    .line 182
    iget-object v5, v1, Lgb/e2;->g:Leb/b;

    .line 183
    .line 184
    move-object/from16 v6, p2

    .line 185
    .line 186
    invoke-direct {v10, v6, v5, v11}, Lgb/l;-><init>(Lgb/v;Leb/b;Lgb/r1$h;)V

    .line 187
    .line 188
    .line 189
    iput-object v10, v0, Lgb/r1;->g:Lgb/l;

    .line 190
    .line 191
    new-instance v9, Lgb/r1$n;

    .line 192
    .line 193
    invoke-virtual {v10}, Lgb/l;->p0()Ljava/util/concurrent/ScheduledExecutorService;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-direct {v9, v5}, Lgb/r1$n;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 198
    .line 199
    .line 200
    iput-object v9, v0, Lgb/r1;->h:Lgb/r1$n;

    .line 201
    .line 202
    new-instance v5, Lgb/p;

    .line 203
    .line 204
    invoke-virtual {v3}, Lgb/o3$a;->a()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const-string v8, "Channel for \'"

    .line 209
    .line 210
    move-object/from16 v16, v10

    .line 211
    .line 212
    const-string v10, "\'"

    .line 213
    .line 214
    invoke-static {v8, v15, v10}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-direct {v5, v4, v6, v7, v8}, Lgb/p;-><init>(Leb/f0;JLjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iput-object v5, v0, Lgb/r1;->O:Lgb/p;

    .line 222
    .line 223
    new-instance v10, Lgb/n;

    .line 224
    .line 225
    invoke-direct {v10, v5, v3}, Lgb/n;-><init>(Lgb/p;Lgb/o3;)V

    .line 226
    .line 227
    .line 228
    iput-object v10, v0, Lgb/r1;->P:Lgb/n;

    .line 229
    .line 230
    sget-object v6, Lgb/v0;->m:Lgb/t2;

    .line 231
    .line 232
    iget-boolean v3, v1, Lgb/e2;->p:Z

    .line 233
    .line 234
    iput-boolean v3, v0, Lgb/r1;->Z:Z

    .line 235
    .line 236
    new-instance v4, Lgb/i;

    .line 237
    .line 238
    iget-object v5, v1, Lgb/e2;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-direct {v4, v5}, Lgb/i;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    iput-object v4, v0, Lgb/r1;->f:Lgb/i;

    .line 244
    .line 245
    iget-object v8, v1, Lgb/e2;->d:Leb/w0;

    .line 246
    .line 247
    iput-object v8, v0, Lgb/r1;->d:Leb/w0;

    .line 248
    .line 249
    new-instance v7, Lgb/d3;

    .line 250
    .line 251
    iget v5, v1, Lgb/e2;->l:I

    .line 252
    .line 253
    move-object/from16 p2, v8

    .line 254
    .line 255
    iget v8, v1, Lgb/e2;->m:I

    .line 256
    .line 257
    invoke-direct {v7, v3, v5, v8, v4}, Lgb/d3;-><init>(ZIILgb/i;)V

    .line 258
    .line 259
    .line 260
    const/4 v3, 0x0

    .line 261
    iget-object v4, v1, Lgb/e2;->y:Lgb/e2$a;

    .line 262
    .line 263
    invoke-interface {v4}, Lgb/e2$a;->a()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v8, Leb/u0$a;

    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    move-object v4, v8

    .line 279
    move-object/from16 v18, v7

    .line 280
    .line 281
    move-object v7, v13

    .line 282
    move-object/from16 v19, p2

    .line 283
    .line 284
    move-object/from16 v20, v8

    .line 285
    .line 286
    move-object/from16 v8, v18

    .line 287
    .line 288
    move-object v2, v12

    .line 289
    move-object v12, v3

    .line 290
    invoke-direct/range {v4 .. v12}, Leb/u0$a;-><init>(Ljava/lang/Integer;Leb/z0;Leb/h1;Leb/u0$f;Ljava/util/concurrent/ScheduledExecutorService;Leb/d;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v3, v20

    .line 294
    .line 295
    iput-object v3, v0, Lgb/r1;->e:Leb/u0$a;

    .line 296
    .line 297
    invoke-virtual/range {v16 .. v16}, Lgb/l;->y0()Ljava/util/Collection;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    move-object/from16 v5, v19

    .line 302
    .line 303
    invoke-static {v15, v5, v3, v4}, Lgb/r1;->N(Ljava/lang/String;Leb/w0;Leb/u0$a;Ljava/util/Collection;)Lgb/s0;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    iput-object v3, v0, Lgb/r1;->w:Lgb/s0;

    .line 308
    .line 309
    new-instance v3, Lgb/r1$h;

    .line 310
    .line 311
    move-object/from16 v4, p4

    .line 312
    .line 313
    invoke-direct {v3, v4}, Lgb/r1$h;-><init>(Lgb/j3;)V

    .line 314
    .line 315
    .line 316
    iput-object v3, v0, Lgb/r1;->k:Lgb/r1$h;

    .line 317
    .line 318
    new-instance v3, Lgb/f0;

    .line 319
    .line 320
    invoke-direct {v3, v2, v13}, Lgb/f0;-><init>(Ljava/util/concurrent/Executor;Leb/h1;)V

    .line 321
    .line 322
    .line 323
    iput-object v3, v0, Lgb/r1;->F:Lgb/f0;

    .line 324
    .line 325
    invoke-virtual {v3, v14}, Lgb/f0;->g(Lgb/h2$a;)Ljava/lang/Runnable;

    .line 326
    .line 327
    .line 328
    move-object/from16 v2, p3

    .line 329
    .line 330
    iput-object v2, v0, Lgb/r1;->t:Lgb/j$a;

    .line 331
    .line 332
    iget-boolean v2, v1, Lgb/e2;->r:Z

    .line 333
    .line 334
    iput-boolean v2, v0, Lgb/r1;->V:Z

    .line 335
    .line 336
    new-instance v2, Lgb/r1$m;

    .line 337
    .line 338
    iget-object v3, v0, Lgb/r1;->w:Lgb/s0;

    .line 339
    .line 340
    invoke-virtual {v3}, Lgb/s0;->a()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-direct {v2, v0, v3}, Lgb/r1$m;-><init>(Lgb/r1;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iput-object v2, v0, Lgb/r1;->R:Lgb/r1$m;

    .line 348
    .line 349
    sget v3, Leb/g;->a:I

    .line 350
    .line 351
    invoke-virtual/range {p6 .. p6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-eqz v4, :cond_0

    .line 360
    .line 361
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    check-cast v4, Leb/f;

    .line 366
    .line 367
    new-instance v5, Leb/g$b;

    .line 368
    .line 369
    invoke-direct {v5, v2, v4}, Leb/g$b;-><init>(Le9/a;Leb/f;)V

    .line 370
    .line 371
    .line 372
    move-object v2, v5

    .line 373
    goto :goto_0

    .line 374
    :cond_0
    iput-object v2, v0, Lgb/r1;->u:Le9/a;

    .line 375
    .line 376
    new-instance v2, Ljava/util/ArrayList;

    .line 377
    .line 378
    iget-object v3, v1, Lgb/e2;->e:Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 381
    .line 382
    .line 383
    iput-object v2, v0, Lgb/r1;->v:Ljava/util/ArrayList;

    .line 384
    .line 385
    const-string v2, "stopwatchSupplier"

    .line 386
    .line 387
    move-object/from16 v3, p5

    .line 388
    .line 389
    invoke-static {v3, v2}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    iput-object v3, v0, Lgb/r1;->q:Ln7/q;

    .line 393
    .line 394
    iget-wide v2, v1, Lgb/e2;->k:J

    .line 395
    .line 396
    const-wide/16 v4, -0x1

    .line 397
    .line 398
    cmp-long v4, v2, v4

    .line 399
    .line 400
    if-nez v4, :cond_1

    .line 401
    .line 402
    goto :goto_1

    .line 403
    :cond_1
    sget-wide v4, Lgb/e2;->B:J

    .line 404
    .line 405
    cmp-long v4, v2, v4

    .line 406
    .line 407
    if-ltz v4, :cond_2

    .line 408
    .line 409
    const/16 v17, 0x1

    .line 410
    .line 411
    :cond_2
    move/from16 v4, v17

    .line 412
    .line 413
    const-string v5, "invalid idleTimeoutMillis %s"

    .line 414
    .line 415
    invoke-static {v2, v3, v5, v4}, Lx6/b;->m(JLjava/lang/String;Z)V

    .line 416
    .line 417
    .line 418
    iget-wide v2, v1, Lgb/e2;->k:J

    .line 419
    .line 420
    :goto_1
    iput-wide v2, v0, Lgb/r1;->r:J

    .line 421
    .line 422
    new-instance v2, Lgb/x2;

    .line 423
    .line 424
    new-instance v3, Lgb/r1$j;

    .line 425
    .line 426
    invoke-direct {v3, v0}, Lgb/r1$j;-><init>(Lgb/r1;)V

    .line 427
    .line 428
    .line 429
    iget-object v4, v0, Lgb/r1;->n:Leb/h1;

    .line 430
    .line 431
    iget-object v5, v0, Lgb/r1;->g:Lgb/l;

    .line 432
    .line 433
    invoke-virtual {v5}, Lgb/l;->p0()Ljava/util/concurrent/ScheduledExecutorService;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    new-instance v6, Ln7/p;

    .line 438
    .line 439
    invoke-direct {v6}, Ln7/p;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-direct {v2, v3, v4, v5, v6}, Lgb/x2;-><init>(Lgb/r1$j;Leb/h1;Ljava/util/concurrent/ScheduledExecutorService;Ln7/p;)V

    .line 443
    .line 444
    .line 445
    iput-object v2, v0, Lgb/r1;->d0:Lgb/x2;

    .line 446
    .line 447
    iget-object v2, v1, Lgb/e2;->i:Leb/s;

    .line 448
    .line 449
    const-string v3, "decompressorRegistry"

    .line 450
    .line 451
    invoke-static {v2, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    iput-object v2, v0, Lgb/r1;->o:Leb/s;

    .line 455
    .line 456
    iget-object v2, v1, Lgb/e2;->j:Leb/m;

    .line 457
    .line 458
    const-string v3, "compressorRegistry"

    .line 459
    .line 460
    invoke-static {v2, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iput-object v2, v0, Lgb/r1;->p:Leb/m;

    .line 464
    .line 465
    iget-wide v2, v1, Lgb/e2;->n:J

    .line 466
    .line 467
    iput-wide v2, v0, Lgb/r1;->Y:J

    .line 468
    .line 469
    iget-wide v2, v1, Lgb/e2;->o:J

    .line 470
    .line 471
    iput-wide v2, v0, Lgb/r1;->X:J

    .line 472
    .line 473
    new-instance v2, Lgb/t1;

    .line 474
    .line 475
    invoke-direct {v2}, Lgb/t1;-><init>()V

    .line 476
    .line 477
    .line 478
    iput-object v2, v0, Lgb/r1;->M:Lgb/t1;

    .line 479
    .line 480
    new-instance v2, Lgb/m;

    .line 481
    .line 482
    sget-object v3, Lgb/o3;->a:Lgb/o3$a;

    .line 483
    .line 484
    invoke-direct {v2, v3}, Lgb/m;-><init>(Lgb/o3;)V

    .line 485
    .line 486
    .line 487
    iput-object v2, v0, Lgb/r1;->N:Lgb/m;

    .line 488
    .line 489
    iget-object v1, v1, Lgb/e2;->q:Leb/c0;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    iput-object v1, v0, Lgb/r1;->Q:Leb/c0;

    .line 495
    .line 496
    iget-object v1, v1, Leb/c0;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 497
    .line 498
    invoke-static {v1, v0}, Leb/c0;->a(Ljava/util/AbstractMap;Leb/e0;)V

    .line 499
    .line 500
    .line 501
    iget-boolean v1, v0, Lgb/r1;->V:Z

    .line 502
    .line 503
    if-nez v1, :cond_3

    .line 504
    .line 505
    const/4 v1, 0x1

    .line 506
    iput-boolean v1, v0, Lgb/r1;->U:Z

    .line 507
    .line 508
    :cond_3
    return-void
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

.method public static I(Lgb/r1;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lgb/r1;->Q(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lgb/r1;->F:Lgb/f0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Lgb/f0;->i(Leb/k0$j;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lgb/r1;->P:Lgb/n;

    .line 12
    .line 13
    sget-object v2, Leb/d$a;->b:Leb/d$a;

    .line 14
    .line 15
    const-string v3, "Entering IDLE state"

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lgb/r1;->s:Lgb/y;

    .line 21
    .line 22
    sget-object v2, Leb/n;->d:Leb/n;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lgb/y;->a(Leb/n;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lgb/r1;->b0:Lgb/r1$i;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    new-array v3, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v4, p0, Lgb/r1;->D:Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v4, v3, v5

    .line 36
    .line 37
    iget-object v4, p0, Lgb/r1;->F:Lgb/f0;

    .line 38
    .line 39
    aput-object v4, v3, v0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move v4, v5

    .line 45
    :goto_0
    if-ge v4, v2, :cond_1

    .line 46
    .line 47
    aget-object v6, v3, v4

    .line 48
    .line 49
    iget-object v7, v1, Lgb/c1;->a:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v0, v5

    .line 62
    :goto_1
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Lgb/r1;->M()V

    .line 65
    .line 66
    .line 67
    :cond_2
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

.method public static J(Lgb/r1;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lgb/r1;->I:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lgb/r1;->B:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lgb/d1;

    .line 22
    .line 23
    sget-object v2, Lgb/r1;->g0:Leb/e1;

    .line 24
    .line 25
    iget-object v3, v1, Lgb/d1;->l:Leb/h1;

    .line 26
    .line 27
    new-instance v4, Lgb/h1;

    .line 28
    .line 29
    invoke-direct {v4, v1, v2}, Lgb/h1;-><init>(Lgb/d1;Leb/e1;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, Lgb/d1;->l:Leb/h1;

    .line 36
    .line 37
    new-instance v4, Lgb/k1;

    .line 38
    .line 39
    invoke-direct {v4, v1, v2}, Lgb/k1;-><init>(Lgb/d1;Leb/e1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p0, p0, Lgb/r1;->E:Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lgb/n2;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0

    .line 70
    :cond_2
    :goto_1
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static K(Lgb/r1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgb/r1;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lgb/r1;->B:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lgb/r1;->E:Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lgb/r1;->P:Lgb/n;

    .line 31
    .line 32
    sget-object v1, Leb/d$a;->b:Leb/d$a;

    .line 33
    .line 34
    const-string v2, "Terminated"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lgb/r1;->Q:Leb/c0;

    .line 40
    .line 41
    iget-object v0, v0, Leb/c0;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 42
    .line 43
    invoke-static {v0, p0}, Leb/c0;->b(Ljava/util/AbstractMap;Leb/e0;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lgb/r1;->j:Lgb/j3;

    .line 47
    .line 48
    iget-object v1, p0, Lgb/r1;->i:Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lgb/j3;->a(Ljava/util/concurrent/Executor;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lgb/r1;->k:Lgb/r1$h;

    .line 54
    .line 55
    monitor-enter v0

    .line 56
    :try_start_0
    iget-object v1, v0, Lgb/r1$h;->b:Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-object v3, v0, Lgb/r1$h;->a:Lgb/m2;

    .line 62
    .line 63
    invoke-interface {v3, v1}, Lgb/m2;->a(Ljava/util/concurrent/Executor;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lgb/r1$h;->b:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    .line 68
    :cond_1
    monitor-exit v0

    .line 69
    iget-object v0, p0, Lgb/r1;->l:Lgb/r1$h;

    .line 70
    .line 71
    monitor-enter v0

    .line 72
    :try_start_1
    iget-object v1, v0, Lgb/r1$h;->b:Ljava/util/concurrent/Executor;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    iget-object v3, v0, Lgb/r1$h;->a:Lgb/m2;

    .line 77
    .line 78
    invoke-interface {v3, v1}, Lgb/m2;->a(Ljava/util/concurrent/Executor;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, Lgb/r1$h;->b:Ljava/util/concurrent/Executor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    :cond_2
    monitor-exit v0

    .line 84
    iget-object v0, p0, Lgb/r1;->g:Lgb/l;

    .line 85
    .line 86
    invoke-virtual {v0}, Lgb/l;->close()V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    iput-boolean v0, p0, Lgb/r1;->K:Z

    .line 91
    .line 92
    iget-object p0, p0, Lgb/r1;->L:Ljava/util/concurrent/CountDownLatch;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    monitor-exit v0

    .line 100
    throw p0

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    monitor-exit v0

    .line 103
    throw p0

    .line 104
    :cond_3
    :goto_0
    return-void
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
.end method

.method public static N(Ljava/lang/String;Leb/w0;Leb/u0$a;Ljava/util/Collection;)Lgb/s0;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    new-instance v2, Ljava/net/URI;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception v2

    .line 14
    invoke-virtual {v2}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-object v2, v1

    .line 22
    :goto_0
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    monitor-enter p1

    .line 35
    :try_start_1
    iget-object v4, p1, Leb/w0;->c:Lo7/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    monitor-exit p1

    .line 38
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 39
    .line 40
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v4, Lo7/m0;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Lo7/m0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Leb/v0;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    monitor-exit p1

    .line 55
    throw p0

    .line 56
    :cond_1
    :goto_1
    move-object v3, v1

    .line 57
    :goto_2
    if-nez v3, :cond_3

    .line 58
    .line 59
    sget-object v4, Lgb/r1;->f0:Ljava/util/regex/Pattern;

    .line 60
    .line 61
    invoke-virtual {v4, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    :try_start_2
    new-instance v2, Ljava/net/URI;

    .line 72
    .line 73
    monitor-enter p1
    :try_end_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1

    .line 74
    :try_start_3
    iget-object v3, p1, Leb/w0;->a:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 75
    .line 76
    :try_start_4
    monitor-exit p1

    .line 77
    const-string v4, ""

    .line 78
    .line 79
    new-instance v5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v6, "/"

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-direct {v2, v3, v4, v5, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/net/URISyntaxException; {:try_start_4 .. :try_end_4} :catch_1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-nez v3, :cond_2

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_2
    monitor-enter p1

    .line 107
    :try_start_5
    iget-object v1, p1, Leb/w0;->c:Lo7/u;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 108
    .line 109
    monitor-exit p1

    .line 110
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 111
    .line 112
    invoke-virtual {v3, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast v1, Lo7/m0;

    .line 117
    .line 118
    invoke-virtual {v1, p1}, Lo7/m0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    move-object v1, p1

    .line 123
    check-cast v1, Leb/v0;

    .line 124
    .line 125
    :goto_3
    move-object v3, v1

    .line 126
    goto :goto_4

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    monitor-exit p1

    .line 129
    throw p0

    .line 130
    :catchall_2
    move-exception p0

    .line 131
    :try_start_6
    monitor-exit p1

    .line 132
    throw p0
    :try_end_6
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_1

    .line 133
    :catch_1
    move-exception p0

    .line 134
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_3
    :goto_4
    const/4 p1, 0x1

    .line 141
    const/4 v1, 0x0

    .line 142
    const/4 v4, 0x2

    .line 143
    if-nez v3, :cond_5

    .line 144
    .line 145
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 146
    .line 147
    const-string p3, "Could not find a NameResolverProvider for %s%s"

    .line 148
    .line 149
    new-array v2, v4, [Ljava/lang/Object;

    .line 150
    .line 151
    aput-object p0, v2, v1

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-lez p0, :cond_4

    .line 158
    .line 159
    new-instance p0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v1, " ("

    .line 165
    .line 166
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, ")"

    .line 173
    .line 174
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    goto :goto_5

    .line 182
    :cond_4
    const-string p0, ""

    .line 183
    .line 184
    :goto_5
    aput-object p0, v2, p1

    .line 185
    .line 186
    invoke-static {p3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p2

    .line 194
    :cond_5
    if-eqz p3, :cond_7

    .line 195
    .line 196
    invoke-virtual {v3}, Leb/v0;->c()Ljava/util/Collection;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-interface {p3, v5}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    .line 201
    .line 202
    .line 203
    move-result p3

    .line 204
    if-eqz p3, :cond_6

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    const-string p3, "Address types of NameResolver \'%s\' for \'%s\' not supported by transport"

    .line 210
    .line 211
    new-array v0, v4, [Ljava/lang/Object;

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    aput-object v2, v0, v1

    .line 218
    .line 219
    aput-object p0, v0, p1

    .line 220
    .line 221
    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p2

    .line 229
    :cond_7
    :goto_6
    invoke-virtual {v3, v2, p2}, Leb/u0$c;->b(Ljava/net/URI;Leb/u0$a;)Lgb/i0;

    .line 230
    .line 231
    .line 232
    move-result-object p3

    .line 233
    if-eqz p3, :cond_9

    .line 234
    .line 235
    new-instance p0, Lgb/c3;

    .line 236
    .line 237
    new-instance p1, Lgb/k;

    .line 238
    .line 239
    new-instance v0, Lgb/k0$a;

    .line 240
    .line 241
    invoke-direct {v0}, Lgb/k0$a;-><init>()V

    .line 242
    .line 243
    .line 244
    iget-object v1, p2, Leb/u0$a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 245
    .line 246
    if-eqz v1, :cond_8

    .line 247
    .line 248
    iget-object p2, p2, Leb/u0$a;->c:Leb/h1;

    .line 249
    .line 250
    invoke-direct {p1, v0, v1, p2}, Lgb/k;-><init>(Lgb/k0$a;Ljava/util/concurrent/ScheduledExecutorService;Leb/h1;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p0, p3, p1, p2}, Lgb/c3;-><init>(Leb/u0;Lgb/k;Leb/h1;)V

    .line 254
    .line 255
    .line 256
    return-object p0

    .line 257
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 258
    .line 259
    const-string p1, "ScheduledExecutorService not set in Builder"

    .line 260
    .line 261
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw p0

    .line 265
    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 266
    .line 267
    const-string p3, "cannot create a NameResolver for %s%s"

    .line 268
    .line 269
    new-array v2, v4, [Ljava/lang/Object;

    .line 270
    .line 271
    aput-object p0, v2, v1

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    if-lez p0, :cond_a

    .line 278
    .line 279
    new-instance p0, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v1, " ("

    .line 285
    .line 286
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v0, ")"

    .line 293
    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    goto :goto_7

    .line 302
    :cond_a
    const-string p0, ""

    .line 303
    .line 304
    :goto_7
    aput-object p0, v2, p1

    .line 305
    .line 306
    invoke-static {p3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p2
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


# virtual methods
.method public final C(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lgb/r1;->L:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final D()V
    .locals 2

    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/r1$b;

    invoke-direct {v1, p0}, Lgb/r1$b;-><init>(Lgb/r1;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E()Leb/n;
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/r1;->s:Lgb/y;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/y;->b:Leb/n;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v1, Leb/n;->d:Leb/n;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lgb/r1;->n:Leb/h1;

    .line 12
    .line 13
    new-instance v2, Lgb/w1;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lgb/w1;-><init>(Lgb/r1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Channel state API is not implemented"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
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

.method public final F(Leb/n;Lx0/f;)V
    .locals 2

    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/u1;

    invoke-direct {v1, p0, p2, p1}, Lgb/u1;-><init>(Lgb/r1;Lx0/f;Leb/n;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic G()Leb/n0;
    .locals 0

    invoke-virtual {p0}, Lgb/r1;->P()V

    return-object p0
.end method

.method public final H()Leb/n0;
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/r1;->P:Lgb/n;

    .line 2
    .line 3
    sget-object v1, Leb/d$a;->a:Leb/d$a;

    .line 4
    .line 5
    const-string v2, "shutdownNow() called"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lgb/r1;->P()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lgb/r1;->R:Lgb/r1$m;

    .line 14
    .line 15
    iget-object v1, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 16
    .line 17
    iget-object v1, v1, Lgb/r1;->n:Leb/h1;

    .line 18
    .line 19
    new-instance v2, Lgb/d2;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Lgb/d2;-><init>(Lgb/r1$m;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    .line 28
    .line 29
    new-instance v1, Lgb/y1;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lgb/y1;-><init>(Lgb/r1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-object p0
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

.method public final L(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1;->d0:Lgb/x2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lgb/x2;->f:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, v0, Lgb/x2;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, v0, Lgb/x2;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    :cond_0
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
.end method

.method public final M()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-boolean v0, p0, Lgb/r1;->A:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Lgb/r1;->b0:Lgb/r1$i;

    .line 20
    .line 21
    iget-object v0, v0, Lgb/c1;->a:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    xor-int/2addr v0, v1

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Lgb/r1;->L(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lgb/r1;->O()V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lgb/r1;->y:Lgb/r1$k;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object v0, p0, Lgb/r1;->P:Lgb/n;

    .line 45
    .line 46
    sget-object v2, Leb/d$a;->b:Leb/d$a;

    .line 47
    .line 48
    const-string v3, "Exiting idle mode"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v3}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lgb/r1$k;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lgb/r1$k;-><init>(Lgb/r1;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lgb/r1;->f:Lgb/i;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v3, Lgb/i$a;

    .line 64
    .line 65
    invoke-direct {v3, v2, v0}, Lgb/i$a;-><init>(Lgb/i;Lgb/r1$k;)V

    .line 66
    .line 67
    .line 68
    iput-object v3, v0, Lgb/r1$k;->a:Lgb/i$a;

    .line 69
    .line 70
    iput-object v0, p0, Lgb/r1;->y:Lgb/r1$k;

    .line 71
    .line 72
    new-instance v2, Lgb/r1$l;

    .line 73
    .line 74
    iget-object v3, p0, Lgb/r1;->w:Lgb/s0;

    .line 75
    .line 76
    invoke-direct {v2, p0, v0, v3}, Lgb/r1$l;-><init>(Lgb/r1;Lgb/r1$k;Leb/u0;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lgb/r1;->w:Lgb/s0;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lgb/s0;->d(Leb/u0$d;)V

    .line 82
    .line 83
    .line 84
    iput-boolean v1, p0, Lgb/r1;->x:Z

    .line 85
    .line 86
    :cond_3
    :goto_1
    return-void
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
.end method

.method public final O()V
    .locals 11

    .line 1
    iget-wide v0, p0, Lgb/r1;->r:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v2, p0, Lgb/r1;->d0:Lgb/x2;

    .line 11
    .line 12
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v3, v2, Lgb/x2;->d:Ln7/p;

    .line 22
    .line 23
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ln7/p;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    add-long/2addr v5, v0

    .line 30
    const/4 v3, 0x1

    .line 31
    iput-boolean v3, v2, Lgb/x2;->f:Z

    .line 32
    .line 33
    iget-wide v7, v2, Lgb/x2;->e:J

    .line 34
    .line 35
    sub-long v7, v5, v7

    .line 36
    .line 37
    const-wide/16 v9, 0x0

    .line 38
    .line 39
    cmp-long v3, v7, v9

    .line 40
    .line 41
    if-ltz v3, :cond_1

    .line 42
    .line 43
    iget-object v3, v2, Lgb/x2;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    :cond_1
    iget-object v3, v2, Lgb/x2;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    invoke-interface {v3, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object v3, v2, Lgb/x2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    new-instance v7, Lgb/x2$b;

    .line 58
    .line 59
    invoke-direct {v7, v2}, Lgb/x2$b;-><init>(Lgb/x2;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v3, v7, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, v2, Lgb/x2;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 67
    .line 68
    :cond_3
    iput-wide v5, v2, Lgb/x2;->e:J

    .line 69
    .line 70
    return-void
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

.method public final P()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/r1;->P:Lgb/n;

    .line 2
    .line 3
    sget-object v1, Leb/d$a;->a:Leb/d$a;

    .line 4
    .line 5
    const-string v2, "shutdown() called"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lgb/n;->a(Leb/d$a;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    .line 22
    .line 23
    new-instance v1, Lgb/x1;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lgb/x1;-><init>(Lgb/r1;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lgb/r1;->R:Lgb/r1$m;

    .line 32
    .line 33
    iget-object v1, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 34
    .line 35
    iget-object v1, v1, Lgb/r1;->n:Leb/h1;

    .line 36
    .line 37
    new-instance v2, Lgb/c2;

    .line 38
    .line 39
    invoke-direct {v2, v0}, Lgb/c2;-><init>(Lgb/r1$m;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    .line 46
    .line 47
    new-instance v1, Lgb/s1;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lgb/s1;-><init>(Lgb/r1;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final Q(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgb/r1;->n:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lgb/r1;->x:Z

    .line 10
    .line 11
    const-string v2, "nameResolver is not started"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lgb/r1;->y:Lgb/r1$k;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v0

    .line 23
    :goto_0
    const-string v2, "lbHelper is null"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lgb/r1;->w:Lgb/s0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Lgb/s0;->c()V

    .line 34
    .line 35
    .line 36
    iput-boolean v0, p0, Lgb/r1;->x:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lgb/r1;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, p0, Lgb/r1;->d:Leb/w0;

    .line 43
    .line 44
    iget-object v1, p0, Lgb/r1;->e:Leb/u0$a;

    .line 45
    .line 46
    iget-object v3, p0, Lgb/r1;->g:Lgb/l;

    .line 47
    .line 48
    invoke-virtual {v3}, Lgb/l;->y0()Ljava/util/Collection;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {p1, v0, v1, v3}, Lgb/r1;->N(Ljava/lang/String;Leb/w0;Leb/u0$a;Ljava/util/Collection;)Lgb/s0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lgb/r1;->w:Lgb/s0;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iput-object v2, p0, Lgb/r1;->w:Lgb/s0;

    .line 60
    .line 61
    :cond_3
    :goto_1
    iget-object p1, p0, Lgb/r1;->y:Lgb/r1$k;

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    iget-object p1, p1, Lgb/r1$k;->a:Lgb/i$a;

    .line 66
    .line 67
    iget-object v0, p1, Lgb/i$a;->b:Leb/k0;

    .line 68
    .line 69
    invoke-virtual {v0}, Leb/k0;->f()V

    .line 70
    .line 71
    .line 72
    iput-object v2, p1, Lgb/i$a;->b:Leb/k0;

    .line 73
    .line 74
    iput-object v2, p0, Lgb/r1;->y:Lgb/r1$k;

    .line 75
    .line 76
    :cond_4
    iput-object v2, p0, Lgb/r1;->z:Leb/k0$j;

    .line 77
    .line 78
    return-void
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
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/r1;->u:Le9/a;

    invoke-virtual {v0}, Le9/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Leb/f0;
    .locals 1

    iget-object v0, p0, Lgb/r1;->b:Leb/f0;

    return-object v0
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
    iget-object v1, p0, Lgb/r1;->b:Leb/f0;

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
    iget-object v1, p0, Lgb/r1;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "target"

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

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TReqT;TRespT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lgb/r1;->u:Le9/a;

    invoke-virtual {v0, p1, p2}, Le9/a;->v(Leb/t0;Leb/c;)Leb/e;

    move-result-object p1

    return-object p1
.end method
