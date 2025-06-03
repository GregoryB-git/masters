.class public final Lnb/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Lnb/i$f;

.field public b:Leb/d;

.field public final synthetic c:Lnb/i;


# direct methods
.method public constructor <init>(Lnb/i;Lnb/i$f;Leb/d;)V
    .locals 0

    iput-object p1, p0, Lnb/i$d;->c:Lnb/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnb/i$d;->a:Lnb/i$f;

    iput-object p3, p0, Lnb/i$d;->b:Leb/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v0, p0, Lnb/i$d;->c:Lnb/i;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/i;->i:Lgb/o3;

    .line 4
    .line 5
    invoke-interface {v1}, Lgb/o3;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lnb/i;->l:Ljava/lang/Long;

    .line 14
    .line 15
    iget-object v0, p0, Lnb/i$d;->c:Lnb/i;

    .line 16
    .line 17
    iget-object v0, v0, Lnb/i;->f:Lnb/i$b;

    .line 18
    .line 19
    iget-object v0, v0, Lnb/i$b;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lnb/i$a;

    .line 40
    .line 41
    iget-object v2, v1, Lnb/i$a;->c:Lnb/i$a$a;

    .line 42
    .line 43
    iget-object v3, v2, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v2, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 51
    .line 52
    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v1, Lnb/i$a;->b:Lnb/i$a$a;

    .line 56
    .line 57
    iget-object v3, v1, Lnb/i$a;->c:Lnb/i$a$a;

    .line 58
    .line 59
    iput-object v3, v1, Lnb/i$a;->b:Lnb/i$a$a;

    .line 60
    .line 61
    iput-object v2, v1, Lnb/i$a;->c:Lnb/i$a$a;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lnb/i$d;->a:Lnb/i$f;

    .line 65
    .line 66
    iget-object v1, p0, Lnb/i$d;->b:Leb/d;

    .line 67
    .line 68
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 69
    .line 70
    new-instance v2, Lo7/t$a;

    .line 71
    .line 72
    invoke-direct {v2}, Lo7/t$a;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v3, v0, Lnb/i$f;->e:Lnb/i$f$b;

    .line 76
    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    new-instance v3, Lnb/i$j;

    .line 80
    .line 81
    invoke-direct {v3, v0, v1}, Lnb/i$j;-><init>(Lnb/i$f;Leb/d;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-object v3, v0, Lnb/i$f;->f:Lnb/i$f$a;

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    new-instance v3, Lnb/i$e;

    .line 92
    .line 93
    invoke-direct {v3, v0, v1}, Lnb/i$e;-><init>(Lnb/i$f;Leb/d;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v2}, Lo7/t$a;->e()Lo7/l0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {v0, v1}, Lo7/t;->r(I)Lo7/t$b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_1
    invoke-virtual {v0}, Lo7/a;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    invoke-virtual {v0}, Lo7/a;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Lnb/i$i;

    .line 119
    .line 120
    iget-object v3, p0, Lnb/i$d;->c:Lnb/i;

    .line 121
    .line 122
    iget-object v4, v3, Lnb/i;->f:Lnb/i$b;

    .line 123
    .line 124
    iget-object v3, v3, Lnb/i;->l:Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    invoke-interface {v2, v4, v5, v6}, Lnb/i$i;->a(Lnb/i$b;J)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    iget-object v0, p0, Lnb/i$d;->c:Lnb/i;

    .line 135
    .line 136
    iget-object v2, v0, Lnb/i;->f:Lnb/i$b;

    .line 137
    .line 138
    iget-object v0, v0, Lnb/i;->l:Ljava/lang/Long;

    .line 139
    .line 140
    iget-object v2, v2, Lnb/i$b;->a:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lnb/i$a;

    .line 161
    .line 162
    invoke-virtual {v3}, Lnb/i$a;->d()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_6

    .line 167
    .line 168
    iget v4, v3, Lnb/i$a;->e:I

    .line 169
    .line 170
    if-nez v4, :cond_5

    .line 171
    .line 172
    move v4, v1

    .line 173
    goto :goto_3

    .line 174
    :cond_5
    add-int/lit8 v4, v4, -0x1

    .line 175
    .line 176
    :goto_3
    iput v4, v3, Lnb/i$a;->e:I

    .line 177
    .line 178
    :cond_6
    invoke-virtual {v3}, Lnb/i$a;->d()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_4

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    iget-object v6, v3, Lnb/i$a;->a:Lnb/i$f;

    .line 189
    .line 190
    iget-object v6, v6, Lnb/i$f;->b:Ljava/lang/Long;

    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide v6

    .line 196
    iget-object v8, v3, Lnb/i$a;->a:Lnb/i$f;

    .line 197
    .line 198
    iget-object v8, v8, Lnb/i$f;->c:Ljava/lang/Long;

    .line 199
    .line 200
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide v8

    .line 204
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    iget-object v8, v3, Lnb/i$a;->d:Ljava/lang/Long;

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v8

    .line 214
    iget-object v10, v3, Lnb/i$a;->a:Lnb/i$f;

    .line 215
    .line 216
    iget-object v10, v10, Lnb/i$f;->b:Ljava/lang/Long;

    .line 217
    .line 218
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v10

    .line 222
    iget v12, v3, Lnb/i$a;->e:I

    .line 223
    .line 224
    int-to-long v12, v12

    .line 225
    mul-long/2addr v10, v12

    .line 226
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 227
    .line 228
    .line 229
    move-result-wide v6

    .line 230
    add-long/2addr v6, v8

    .line 231
    cmp-long v4, v4, v6

    .line 232
    .line 233
    if-lez v4, :cond_7

    .line 234
    .line 235
    const/4 v4, 0x1

    .line 236
    goto :goto_4

    .line 237
    :cond_7
    move v4, v1

    .line 238
    :goto_4
    if-eqz v4, :cond_4

    .line 239
    .line 240
    invoke-virtual {v3}, Lnb/i$a;->e()V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_8
    return-void
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
