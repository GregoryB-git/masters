.class public final Le7/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Le7/q5;


# direct methods
.method public constructor <init>(Le7/q5;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p2, p0, Le7/p5;->a:J

    iput-object p1, p0, Le7/p5;->b:Le7/q5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Le7/p5;->b:Le7/q5;

    .line 2
    .line 3
    iget-wide v1, p0, Le7/p5;->a:J

    .line 4
    .line 5
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Le7/q5;->v()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v3, v3, Le7/a1;->w:Le7/b1;

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "Activity resumed, time"

    .line 22
    .line 23
    invoke-virtual {v3, v5, v4}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sget-object v4, Le7/h0;->W0:Le7/m0;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v3, v5, v4}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Le7/h;->A()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    iget-boolean v3, v0, Le7/q5;->e:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Le7/h;->A()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v3, v3, Le7/l1;->C:Le7/o1;

    .line 69
    .line 70
    invoke-virtual {v3}, Le7/o1;->b()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    :cond_1
    :goto_0
    iget-object v3, v0, Le7/q5;->o:Le7/t5;

    .line 77
    .line 78
    iget-object v4, v3, Le7/t5;->d:Le7/q5;

    .line 79
    .line 80
    invoke-virtual {v4}, Le7/o0;->l()V

    .line 81
    .line 82
    .line 83
    iget-object v4, v3, Le7/t5;->c:Le7/s5;

    .line 84
    .line 85
    invoke-virtual {v4}, Le7/v;->a()V

    .line 86
    .line 87
    .line 88
    iput-wide v1, v3, Le7/t5;->a:J

    .line 89
    .line 90
    iput-wide v1, v3, Le7/t5;->b:J

    .line 91
    .line 92
    :cond_2
    iget-object v1, v0, Le7/q5;->p:Ll3/l;

    .line 93
    .line 94
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Le7/q5;

    .line 97
    .line 98
    invoke-virtual {v2}, Le7/o0;->l()V

    .line 99
    .line 100
    .line 101
    iget-object v2, v1, Ll3/l;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Le7/r5;

    .line 104
    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    iget-object v3, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Le7/q5;

    .line 110
    .line 111
    iget-object v3, v3, Le7/q5;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    .line 112
    .line 113
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Le7/q5;

    .line 119
    .line 120
    invoke-virtual {v2}, Ld2/q;->j()Le7/l1;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v2, v2, Le7/l1;->C:Le7/o1;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-virtual {v2, v3}, Le7/o1;->a(Z)V

    .line 128
    .line 129
    .line 130
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Le7/q5;

    .line 133
    .line 134
    invoke-virtual {v2}, Le7/o0;->l()V

    .line 135
    .line 136
    .line 137
    iput-boolean v3, v2, Le7/q5;->e:Z

    .line 138
    .line 139
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Le7/q5;

    .line 142
    .line 143
    invoke-virtual {v2}, Ld2/q;->h()Le7/h;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    sget-object v4, Le7/h0;->U0:Le7/m0;

    .line 148
    .line 149
    invoke-virtual {v2, v5, v4}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Le7/q5;

    .line 158
    .line 159
    invoke-virtual {v2}, Le7/o0;->o()Le7/k3;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iget-boolean v2, v2, Le7/k3;->w:Z

    .line 164
    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    iget-object v2, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Le7/q5;

    .line 170
    .line 171
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 176
    .line 177
    const-string v4, "Retrying trigger URI registration in foreground"

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Le7/b1;->b(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-object v1, v1, Ll3/l;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Le7/q5;

    .line 185
    .line 186
    invoke-virtual {v1}, Le7/o0;->o()Le7/k3;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1}, Le7/k3;->N()V

    .line 191
    .line 192
    .line 193
    :cond_4
    iget-object v0, v0, Le7/q5;->f:Le7/v5;

    .line 194
    .line 195
    iget-object v1, v0, Le7/v5;->a:Le7/q5;

    .line 196
    .line 197
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 198
    .line 199
    .line 200
    iget-object v1, v0, Le7/v5;->a:Le7/q5;

    .line 201
    .line 202
    iget-object v1, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Le7/j2;

    .line 205
    .line 206
    invoke-virtual {v1}, Le7/j2;->d()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    iget-object v1, v0, Le7/v5;->a:Le7/q5;

    .line 213
    .line 214
    invoke-virtual {v1}, Ld2/q;->zzb()Lv6/b;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lb/z;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 224
    .line 225
    .line 226
    move-result-wide v1

    .line 227
    invoke-virtual {v0, v1, v2, v3}, Le7/v5;->b(JZ)V

    .line 228
    .line 229
    .line 230
    :cond_5
    return-void
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
