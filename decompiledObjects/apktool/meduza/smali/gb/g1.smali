.class public final Lgb/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lgb/d1;


# direct methods
.method public constructor <init>(Lgb/d1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lgb/g1;->b:Lgb/d1;

    iput-object p2, p0, Lgb/g1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    sget-object v0, Leb/n;->b:Leb/n;

    .line 2
    .line 3
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 4
    .line 5
    iget-object v1, v1, Lgb/d1;->m:Lgb/d1$d;

    .line 6
    .line 7
    iget-object v2, v1, Lgb/d1$d;->a:Ljava/util/List;

    .line 8
    .line 9
    iget v3, v1, Lgb/d1$d;->b:I

    .line 10
    .line 11
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Leb/u;

    .line 16
    .line 17
    iget-object v2, v2, Leb/u;->a:Ljava/util/List;

    .line 18
    .line 19
    iget v1, v1, Lgb/d1$d;->c:I

    .line 20
    .line 21
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/net/SocketAddress;

    .line 26
    .line 27
    iget-object v2, p0, Lgb/g1;->b:Lgb/d1;

    .line 28
    .line 29
    iget-object v2, v2, Lgb/d1;->m:Lgb/d1$d;

    .line 30
    .line 31
    iget-object v3, p0, Lgb/g1;->a:Ljava/util/List;

    .line 32
    .line 33
    iput-object v3, v2, Lgb/d1$d;->a:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v2}, Lgb/d1$d;->a()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lgb/g1;->b:Lgb/d1;

    .line 39
    .line 40
    iget-object v3, p0, Lgb/g1;->a:Ljava/util/List;

    .line 41
    .line 42
    iput-object v3, v2, Lgb/d1;->n:Ljava/util/List;

    .line 43
    .line 44
    iget-object v2, p0, Lgb/g1;->b:Lgb/d1;

    .line 45
    .line 46
    iget-object v2, v2, Lgb/d1;->x:Leb/o;

    .line 47
    .line 48
    iget-object v2, v2, Leb/o;->a:Leb/n;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-eq v2, v0, :cond_0

    .line 52
    .line 53
    iget-object v2, p0, Lgb/g1;->b:Lgb/d1;

    .line 54
    .line 55
    iget-object v2, v2, Lgb/d1;->x:Leb/o;

    .line 56
    .line 57
    iget-object v2, v2, Leb/o;->a:Leb/n;

    .line 58
    .line 59
    sget-object v4, Leb/n;->a:Leb/n;

    .line 60
    .line 61
    if-ne v2, v4, :cond_4

    .line 62
    .line 63
    :cond_0
    iget-object v2, p0, Lgb/g1;->b:Lgb/d1;

    .line 64
    .line 65
    iget-object v2, v2, Lgb/d1;->m:Lgb/d1$d;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    move v5, v4

    .line 69
    :goto_0
    iget-object v6, v2, Lgb/d1$d;->a:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-ge v5, v6, :cond_2

    .line 76
    .line 77
    iget-object v6, v2, Lgb/d1$d;->a:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Leb/u;

    .line 84
    .line 85
    iget-object v6, v6, Leb/u;->a:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v6, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    const/4 v7, -0x1

    .line 92
    if-ne v6, v7, :cond_1

    .line 93
    .line 94
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    iput v5, v2, Lgb/d1$d;->b:I

    .line 98
    .line 99
    iput v6, v2, Lgb/d1$d;->c:I

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    :cond_2
    if-nez v4, :cond_4

    .line 103
    .line 104
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 105
    .line 106
    iget-object v1, v1, Lgb/d1;->x:Leb/o;

    .line 107
    .line 108
    iget-object v1, v1, Leb/o;->a:Leb/n;

    .line 109
    .line 110
    if-ne v1, v0, :cond_3

    .line 111
    .line 112
    iget-object v0, p0, Lgb/g1;->b:Lgb/d1;

    .line 113
    .line 114
    iget-object v0, v0, Lgb/d1;->w:Lgb/h2;

    .line 115
    .line 116
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 117
    .line 118
    iput-object v3, v1, Lgb/d1;->w:Lgb/h2;

    .line 119
    .line 120
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 121
    .line 122
    iget-object v1, v1, Lgb/d1;->m:Lgb/d1$d;

    .line 123
    .line 124
    invoke-virtual {v1}, Lgb/d1$d;->a()V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 128
    .line 129
    sget-object v2, Leb/n;->d:Leb/n;

    .line 130
    .line 131
    invoke-static {v1, v2}, Lgb/d1;->b(Lgb/d1;Leb/n;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    iget-object v0, p0, Lgb/g1;->b:Lgb/d1;

    .line 136
    .line 137
    iget-object v0, v0, Lgb/d1;->v:Lgb/x;

    .line 138
    .line 139
    sget-object v1, Leb/e1;->n:Leb/e1;

    .line 140
    .line 141
    const-string v2, "InternalSubchannel closed pending transport due to address change"

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v0, v1}, Lgb/h2;->c(Leb/e1;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lgb/g1;->b:Lgb/d1;

    .line 151
    .line 152
    iput-object v3, v0, Lgb/d1;->v:Lgb/x;

    .line 153
    .line 154
    iget-object v0, v0, Lgb/d1;->m:Lgb/d1$d;

    .line 155
    .line 156
    invoke-virtual {v0}, Lgb/d1$d;->a()V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lgb/g1;->b:Lgb/d1;

    .line 160
    .line 161
    invoke-static {v0}, Lgb/d1;->i(Lgb/d1;)V

    .line 162
    .line 163
    .line 164
    :cond_4
    move-object v0, v3

    .line 165
    :goto_1
    if-eqz v0, :cond_6

    .line 166
    .line 167
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 168
    .line 169
    iget-object v2, v1, Lgb/d1;->r:Leb/h1$c;

    .line 170
    .line 171
    if-eqz v2, :cond_5

    .line 172
    .line 173
    iget-object v1, v1, Lgb/d1;->s:Lgb/h2;

    .line 174
    .line 175
    sget-object v2, Leb/e1;->n:Leb/e1;

    .line 176
    .line 177
    const-string v4, "InternalSubchannel closed transport early due to address change"

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-interface {v1, v2}, Lgb/h2;->c(Leb/e1;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 187
    .line 188
    iget-object v1, v1, Lgb/d1;->r:Leb/h1$c;

    .line 189
    .line 190
    invoke-virtual {v1}, Leb/h1$c;->a()V

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 194
    .line 195
    iput-object v3, v1, Lgb/d1;->r:Leb/h1$c;

    .line 196
    .line 197
    iput-object v3, v1, Lgb/d1;->s:Lgb/h2;

    .line 198
    .line 199
    :cond_5
    iget-object v1, p0, Lgb/g1;->b:Lgb/d1;

    .line 200
    .line 201
    iput-object v0, v1, Lgb/d1;->s:Lgb/h2;

    .line 202
    .line 203
    iget-object v2, v1, Lgb/d1;->l:Leb/h1;

    .line 204
    .line 205
    new-instance v3, Lgb/g1$a;

    .line 206
    .line 207
    invoke-direct {v3, p0}, Lgb/g1$a;-><init>(Lgb/g1;)V

    .line 208
    .line 209
    .line 210
    const-wide/16 v4, 0x5

    .line 211
    .line 212
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 213
    .line 214
    iget-object v7, v1, Lgb/d1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 215
    .line 216
    invoke-virtual/range {v2 .. v7}, Leb/h1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Leb/h1$c;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iput-object v0, v1, Lgb/d1;->r:Leb/h1$c;

    .line 221
    .line 222
    :cond_6
    return-void
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
