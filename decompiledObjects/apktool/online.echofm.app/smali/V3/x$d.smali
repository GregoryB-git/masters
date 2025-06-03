.class public LV3/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->X(La4/i;LV3/h;LQ3/c;Z)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La4/i;

.field public final synthetic p:LV3/h;

.field public final synthetic q:LQ3/c;

.field public final synthetic r:Z

.field public final synthetic s:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;La4/i;LV3/h;LQ3/c;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$d;->s:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$d;->o:La4/i;

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$d;->p:LV3/h;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$d;->q:LQ3/c;

    .line 8
    .line 9
    iput-boolean p5, p0, LV3/x$d;->r:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 12

    .line 1
    iget-object v0, p0, LV3/x$d;->o:La4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LV3/x$d;->s:LV3/x;

    .line 8
    .line 9
    invoke-static {v1}, LV3/x;->n(LV3/x;)LY3/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LV3/v;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    if-eqz v1, :cond_f

    .line 25
    .line 26
    iget-object v3, p0, LV3/x$d;->o:La4/i;

    .line 27
    .line 28
    invoke-virtual {v3}, La4/i;->f()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    iget-object v3, p0, LV3/x$d;->o:La4/i;

    .line 35
    .line 36
    invoke-virtual {v1, v3}, LV3/v;->k(La4/i;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_f

    .line 41
    .line 42
    :cond_0
    iget-object v2, p0, LV3/x$d;->o:La4/i;

    .line 43
    .line 44
    iget-object v3, p0, LV3/x$d;->p:LV3/h;

    .line 45
    .line 46
    iget-object v4, p0, LV3/x$d;->q:LQ3/c;

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3, v4}, LV3/v;->j(La4/i;LV3/h;LQ3/c;)LY3/g;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1}, LV3/v;->i()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, LV3/x$d;->s:LV3/x;

    .line 59
    .line 60
    invoke-static {v1}, LV3/x;->n(LV3/x;)LY3/d;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3, v0}, LY3/d;->U(LV3/k;)LY3/d;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v1, v3}, LV3/x;->o(LV3/x;LY3/d;)LY3/d;

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {v2}, LY3/g;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/util/List;

    .line 76
    .line 77
    invoke-virtual {v2}, LY3/g;->b()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v4, 0x0

    .line 88
    :cond_2
    move v5, v4

    .line 89
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x1

    .line 94
    if-eqz v6, :cond_4

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, La4/i;

    .line 101
    .line 102
    iget-object v8, p0, LV3/x$d;->s:LV3/x;

    .line 103
    .line 104
    invoke-static {v8}, LV3/x;->c(LV3/x;)LX3/e;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    iget-object v9, p0, LV3/x$d;->o:La4/i;

    .line 109
    .line 110
    invoke-interface {v8, v9}, LX3/e;->i(La4/i;)V

    .line 111
    .line 112
    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v6}, La4/i;->g()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_2

    .line 120
    .line 121
    :cond_3
    move v5, v7

    .line 122
    goto :goto_0

    .line 123
    :cond_4
    iget-boolean v3, p0, LV3/x$d;->r:Z

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    return-object v6

    .line 129
    :cond_5
    iget-object v3, p0, LV3/x$d;->s:LV3/x;

    .line 130
    .line 131
    invoke-static {v3}, LV3/x;->n(LV3/x;)LY3/d;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    if-eqz v8, :cond_6

    .line 140
    .line 141
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, LV3/v;

    .line 146
    .line 147
    invoke-virtual {v8}, LV3/v;->h()Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_6

    .line 152
    .line 153
    move v8, v7

    .line 154
    goto :goto_1

    .line 155
    :cond_6
    move v8, v4

    .line 156
    :goto_1
    invoke-virtual {v0}, LV3/k;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_a

    .line 165
    .line 166
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    check-cast v10, Ld4/b;

    .line 171
    .line 172
    invoke-virtual {v3, v10}, LY3/d;->D(Ld4/b;)LY3/d;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    if-nez v8, :cond_9

    .line 177
    .line 178
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    if-eqz v8, :cond_8

    .line 183
    .line 184
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    check-cast v8, LV3/v;

    .line 189
    .line 190
    invoke-virtual {v8}, LV3/v;->h()Z

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-eqz v8, :cond_8

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_8
    move v8, v4

    .line 198
    goto :goto_3

    .line 199
    :cond_9
    :goto_2
    move v8, v7

    .line 200
    :goto_3
    if-nez v8, :cond_a

    .line 201
    .line 202
    invoke-virtual {v3}, LY3/d;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_7

    .line 207
    .line 208
    :cond_a
    if-eqz v5, :cond_b

    .line 209
    .line 210
    if-nez v8, :cond_b

    .line 211
    .line 212
    iget-object v3, p0, LV3/x$d;->s:LV3/x;

    .line 213
    .line 214
    invoke-static {v3}, LV3/x;->n(LV3/x;)LY3/d;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v3, v0}, LY3/d;->Y(LV3/k;)LY3/d;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, LY3/d;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_b

    .line 227
    .line 228
    iget-object v3, p0, LV3/x$d;->s:LV3/x;

    .line 229
    .line 230
    invoke-static {v3, v0}, LV3/x;->e(LV3/x;LY3/d;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-eqz v3, :cond_b

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    check-cast v3, La4/j;

    .line 249
    .line 250
    new-instance v9, LV3/x$r;

    .line 251
    .line 252
    iget-object v10, p0, LV3/x$d;->s:LV3/x;

    .line 253
    .line 254
    invoke-direct {v9, v10, v3}, LV3/x$r;-><init>(LV3/x;La4/j;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3}, La4/j;->h()La4/i;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iget-object v10, p0, LV3/x$d;->s:LV3/x;

    .line 262
    .line 263
    invoke-static {v10}, LV3/x;->g(LV3/x;)LV3/x$s;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    iget-object v11, p0, LV3/x$d;->s:LV3/x;

    .line 268
    .line 269
    invoke-static {v11, v3}, LV3/x;->f(LV3/x;La4/i;)La4/i;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v9}, LV3/x$r;->e(LV3/x$r;)LV3/y;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    invoke-interface {v10, v3, v11, v9, v9}, LV3/x$s;->b(La4/i;LV3/y;LT3/g;LV3/x$p;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_b
    if-nez v8, :cond_e

    .line 282
    .line 283
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_e

    .line 288
    .line 289
    iget-object v0, p0, LV3/x$d;->q:LQ3/c;

    .line 290
    .line 291
    if-nez v0, :cond_e

    .line 292
    .line 293
    if-eqz v5, :cond_c

    .line 294
    .line 295
    iget-object v0, p0, LV3/x$d;->s:LV3/x;

    .line 296
    .line 297
    invoke-static {v0}, LV3/x;->g(LV3/x;)LV3/x$s;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iget-object v3, p0, LV3/x$d;->s:LV3/x;

    .line 302
    .line 303
    iget-object v4, p0, LV3/x$d;->o:La4/i;

    .line 304
    .line 305
    invoke-static {v3, v4}, LV3/x;->f(LV3/x;La4/i;)La4/i;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-interface {v0, v3, v6}, LV3/x$s;->a(La4/i;LV3/y;)V

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_c
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-eqz v3, :cond_e

    .line 322
    .line 323
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    check-cast v3, La4/i;

    .line 328
    .line 329
    iget-object v5, p0, LV3/x$d;->s:LV3/x;

    .line 330
    .line 331
    invoke-virtual {v5, v3}, LV3/x;->b0(La4/i;)LV3/y;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    if-eqz v5, :cond_d

    .line 336
    .line 337
    move v6, v7

    .line 338
    goto :goto_6

    .line 339
    :cond_d
    move v6, v4

    .line 340
    :goto_6
    invoke-static {v6}, LY3/m;->f(Z)V

    .line 341
    .line 342
    .line 343
    iget-object v6, p0, LV3/x$d;->s:LV3/x;

    .line 344
    .line 345
    invoke-static {v6}, LV3/x;->g(LV3/x;)LV3/x$s;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    iget-object v8, p0, LV3/x$d;->s:LV3/x;

    .line 350
    .line 351
    invoke-static {v8, v3}, LV3/x;->f(LV3/x;La4/i;)La4/i;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-interface {v6, v3, v5}, LV3/x$s;->a(La4/i;LV3/y;)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_e
    :goto_7
    iget-object v0, p0, LV3/x$d;->s:LV3/x;

    .line 360
    .line 361
    invoke-static {v0, v1}, LV3/x;->h(LV3/x;Ljava/util/List;)V

    .line 362
    .line 363
    .line 364
    :cond_f
    return-object v2
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$d;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
