.class public final Le7/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Le7/k3;


# direct methods
.method public synthetic constructor <init>(Le7/k3;JI)V
    .locals 0

    iput p4, p0, Le7/z3;->a:I

    iput-wide p2, p0, Le7/z3;->b:J

    iput-object p1, p0, Le7/z3;->c:Le7/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Le7/z3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/z3;->c:Le7/k3;

    .line 8
    .line 9
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Le7/l1;->u:Le7/q1;

    .line 14
    .line 15
    iget-wide v1, p0, Le7/z3;->b:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Le7/q1;->b(J)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Le7/z3;->c:Le7/k3;

    .line 21
    .line 22
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Le7/a1;->v:Le7/b1;

    .line 27
    .line 28
    iget-wide v1, p0, Le7/z3;->b:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "Session timeout duration set"

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_0
    iget-object v0, p0, Le7/z3;->c:Le7/k3;

    .line 41
    .line 42
    iget-wide v1, p0, Le7/z3;->b:J

    .line 43
    .line 44
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v3, v3, Le7/a1;->v:Le7/b1;

    .line 55
    .line 56
    const-string v4, "Resetting analytics data (FE)"

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Le7/b1;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Le7/o0;->r()Le7/q5;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Le7/o0;->l()V

    .line 66
    .line 67
    .line 68
    iget-object v3, v3, Le7/q5;->o:Le7/t5;

    .line 69
    .line 70
    iget-object v4, v3, Le7/t5;->c:Le7/s5;

    .line 71
    .line 72
    invoke-virtual {v4}, Le7/v;->a()V

    .line 73
    .line 74
    .line 75
    iget-object v4, v3, Le7/t5;->d:Le7/q5;

    .line 76
    .line 77
    invoke-virtual {v4}, Ld2/q;->h()Le7/h;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    sget-object v5, Le7/h0;->X0:Le7/m0;

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-virtual {v4, v6, v5}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-wide/16 v7, 0x0

    .line 89
    .line 90
    if-eqz v4, :cond_0

    .line 91
    .line 92
    iget-object v4, v3, Le7/t5;->d:Le7/q5;

    .line 93
    .line 94
    invoke-virtual {v4}, Ld2/q;->zzb()Lv6/b;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Lb/z;

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    goto :goto_1

    .line 108
    :cond_0
    move-wide v4, v7

    .line 109
    :goto_1
    iput-wide v4, v3, Le7/t5;->a:J

    .line 110
    .line 111
    iput-wide v4, v3, Le7/t5;->b:J

    .line 112
    .line 113
    invoke-virtual {v0}, Le7/o0;->m()Le7/t0;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Le7/t0;->x()V

    .line 118
    .line 119
    .line 120
    iget-object v3, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Le7/j2;

    .line 123
    .line 124
    invoke-virtual {v3}, Le7/j2;->d()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iget-object v5, v4, Le7/l1;->p:Le7/q1;

    .line 133
    .line 134
    invoke-virtual {v5, v1, v2}, Le7/q1;->b(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ld2/q;->j()Le7/l1;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v1, v1, Le7/l1;->F:Le7/r1;

    .line 142
    .line 143
    invoke-virtual {v1}, Le7/r1;->a()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_1

    .line 152
    .line 153
    iget-object v1, v4, Le7/l1;->F:Le7/r1;

    .line 154
    .line 155
    invoke-virtual {v1, v6}, Le7/r1;->b(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_1
    iget-object v1, v4, Le7/l1;->z:Le7/q1;

    .line 159
    .line 160
    invoke-virtual {v1, v7, v8}, Le7/q1;->b(J)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v4, Le7/l1;->A:Le7/q1;

    .line 164
    .line 165
    invoke-virtual {v1, v7, v8}, Le7/q1;->b(J)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Ld2/q;->h()Le7/h;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Le7/h;->B()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_2

    .line 177
    .line 178
    xor-int/lit8 v1, v3, 0x1

    .line 179
    .line 180
    invoke-virtual {v4, v1}, Le7/l1;->t(Z)V

    .line 181
    .line 182
    .line 183
    :cond_2
    iget-object v1, v4, Le7/l1;->G:Le7/r1;

    .line 184
    .line 185
    invoke-virtual {v1, v6}, Le7/r1;->b(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v4, Le7/l1;->H:Le7/q1;

    .line 189
    .line 190
    invoke-virtual {v1, v7, v8}, Le7/q1;->b(J)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v4, Le7/l1;->I:Le7/n1;

    .line 194
    .line 195
    invoke-virtual {v1, v6}, Le7/n1;->b(Landroid/os/Bundle;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Le7/o0;->q()Le7/w4;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Le7/o0;->l()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Le7/j0;->t()V

    .line 206
    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    invoke-virtual {v1, v2}, Le7/w4;->I(Z)Le7/k6;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v1}, Le7/o0;->n()Le7/w0;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, Le7/w0;->x()V

    .line 218
    .line 219
    .line 220
    new-instance v4, Ll6/q0;

    .line 221
    .line 222
    const/4 v5, 0x3

    .line 223
    invoke-direct {v4, v5, v1, v2}, Ll6/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v4}, Le7/w4;->x(Ljava/lang/Runnable;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Le7/o0;->r()Le7/q5;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iget-object v1, v1, Le7/q5;->f:Le7/v5;

    .line 234
    .line 235
    invoke-virtual {v1}, Le7/v5;->a()V

    .line 236
    .line 237
    .line 238
    xor-int/lit8 v1, v3, 0x1

    .line 239
    .line 240
    iput-boolean v1, v0, Le7/k3;->B:Z

    .line 241
    .line 242
    iget-object v0, p0, Le7/z3;->c:Le7/k3;

    .line 243
    .line 244
    invoke-virtual {v0}, Le7/o0;->q()Le7/w4;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1}, Le7/w4;->y(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
