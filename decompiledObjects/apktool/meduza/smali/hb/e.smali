.class public final Lhb/e;
.super Leb/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/e$d;,
        Lhb/e$b;,
        Lhb/e$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/v<",
        "Lhb/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lib/b;

.field public static final n:J

.field public static final o:Lgb/j3;


# instance fields
.field public final a:Lgb/e2;

.field public b:Lgb/r3$a;

.field public c:Lgb/j3;

.field public d:Lgb/j3;

.field public e:Ljavax/net/ssl/SSLSocketFactory;

.field public f:Lib/b;

.field public g:I

.field public h:J

.field public i:J

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Lhb/e;

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
    new-instance v0, Lib/b$a;

    .line 11
    .line 12
    sget-object v1, Lib/b;->e:Lib/b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lib/b$a;-><init>(Lib/b;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    new-array v1, v1, [Lib/a;

    .line 19
    .line 20
    sget-object v2, Lib/a;->q:Lib/a;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput-object v2, v1, v3

    .line 24
    .line 25
    sget-object v2, Lib/a;->s:Lib/a;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    aput-object v2, v1, v4

    .line 29
    .line 30
    sget-object v2, Lib/a;->r:Lib/a;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    aput-object v2, v1, v5

    .line 34
    .line 35
    sget-object v2, Lib/a;->t:Lib/a;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    aput-object v2, v1, v5

    .line 39
    .line 40
    sget-object v2, Lib/a;->v:Lib/a;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    aput-object v2, v1, v5

    .line 44
    .line 45
    sget-object v2, Lib/a;->u:Lib/a;

    .line 46
    .line 47
    const/4 v5, 0x5

    .line 48
    aput-object v2, v1, v5

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lib/b$a;->a([Lib/a;)V

    .line 51
    .line 52
    .line 53
    new-array v1, v4, [Lib/k;

    .line 54
    .line 55
    sget-object v2, Lib/k;->c:Lib/k;

    .line 56
    .line 57
    aput-object v2, v1, v3

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lib/b$a;->b([Lib/k;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v1, v0, Lib/b$a;->a:Z

    .line 63
    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    iput-boolean v4, v0, Lib/b$a;->d:Z

    .line 67
    .line 68
    new-instance v1, Lib/b;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lib/b;-><init>(Lib/b$a;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lhb/e;->m:Lib/b;

    .line 74
    .line 75
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 76
    .line 77
    const-wide/16 v1, 0x3e8

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    sput-wide v0, Lhb/e;->n:J

    .line 84
    .line 85
    new-instance v0, Lhb/e$a;

    .line 86
    .line 87
    invoke-direct {v0}, Lhb/e$a;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lgb/j3;

    .line 91
    .line 92
    invoke-direct {v1, v0}, Lgb/j3;-><init>(Lgb/h3$c;)V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lhb/e;->o:Lgb/j3;

    .line 96
    .line 97
    sget-object v0, Leb/k1;->a:Leb/k1;

    .line 98
    .line 99
    sget-object v1, Leb/k1;->b:Leb/k1;

    .line 100
    .line 101
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v1, "no TLS extensions for cleartext connections"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0
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

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Leb/v;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgb/r3;->c:Lgb/r3$a;

    .line 5
    .line 6
    iput-object v0, p0, Lhb/e;->b:Lgb/r3$a;

    .line 7
    .line 8
    sget-object v0, Lhb/e;->o:Lgb/j3;

    .line 9
    .line 10
    iput-object v0, p0, Lhb/e;->c:Lgb/j3;

    .line 11
    .line 12
    sget-object v0, Lgb/v0;->q:Lgb/v0$c;

    .line 13
    .line 14
    new-instance v1, Lgb/j3;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lgb/j3;-><init>(Lgb/h3$c;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lhb/e;->d:Lgb/j3;

    .line 20
    .line 21
    sget-object v0, Lhb/e;->m:Lib/b;

    .line 22
    .line 23
    iput-object v0, p0, Lhb/e;->f:Lib/b;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput v0, p0, Lhb/e;->g:I

    .line 27
    .line 28
    const-wide v0, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, Lhb/e;->h:J

    .line 34
    .line 35
    sget-wide v0, Lgb/v0;->l:J

    .line 36
    .line 37
    iput-wide v0, p0, Lhb/e;->i:J

    .line 38
    .line 39
    const v0, 0xffff

    .line 40
    .line 41
    .line 42
    iput v0, p0, Lhb/e;->j:I

    .line 43
    .line 44
    const/high16 v0, 0x400000

    .line 45
    .line 46
    iput v0, p0, Lhb/e;->k:I

    .line 47
    .line 48
    const v0, 0x7fffffff

    .line 49
    .line 50
    .line 51
    iput v0, p0, Lhb/e;->l:I

    .line 52
    .line 53
    new-instance v0, Lgb/e2;

    .line 54
    .line 55
    new-instance v1, Lhb/e$c;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lhb/e$c;-><init>(Lhb/e;)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lhb/e$b;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Lhb/e$b;-><init>(Lhb/e;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p1, v1, v2}, Lgb/e2;-><init>(Ljava/lang/String;Lhb/e$c;Lhb/e$b;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lhb/e;->a:Lgb/e2;

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
.end method


# virtual methods
.method public final b(Ljava/util/concurrent/TimeUnit;)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x1e

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lhb/e;->h:J

    .line 8
    .line 9
    sget-wide v2, Lgb/o1;->l:J

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lhb/e;->h:J

    .line 16
    .line 17
    sget-wide v2, Lhb/e;->n:J

    .line 18
    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-ltz p1, :cond_0

    .line 22
    .line 23
    const-wide v0, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide v0, p0, Lhb/e;->h:J

    .line 29
    .line 30
    :cond_0
    return-void
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

.method public final c()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lhb/e;->g:I

    return-void
.end method

.method public final d()Leb/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/o0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lhb/e;->a:Lgb/e2;

    return-object v0
.end method
