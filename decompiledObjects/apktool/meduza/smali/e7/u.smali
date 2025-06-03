.class public final Le7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Le7/a;


# direct methods
.method public synthetic constructor <init>(Le7/a;Ljava/lang/String;JI)V
    .locals 0

    iput p5, p0, Le7/u;->a:I

    iput-object p2, p0, Le7/u;->b:Ljava/lang/String;

    iput-wide p3, p0, Le7/u;->c:J

    iput-object p1, p0, Le7/u;->d:Le7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Le7/u;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :pswitch_0
    iget-object v0, p0, Le7/u;->d:Le7/a;

    .line 10
    .line 11
    iget-object v2, p0, Le7/u;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v3, p0, Le7/u;->c:J

    .line 14
    .line 15
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v5, v0, Le7/a;->d:Lr/b;

    .line 22
    .line 23
    invoke-virtual {v5, v2, v1}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0}, Le7/o0;->p()Le7/s4;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v7, 0x0

    .line 36
    invoke-virtual {v6, v7}, Le7/s4;->v(Z)Le7/q4;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    iget-object v5, v0, Le7/a;->d:Lr/b;

    .line 49
    .line 50
    invoke-virtual {v5, v2}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v5, v0, Le7/a;->c:Lr/b;

    .line 54
    .line 55
    invoke-virtual {v5, v2, v1}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/Long;

    .line 60
    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 68
    .line 69
    const-string v2, "First ad unit exposure time was never set"

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    sub-long v7, v3, v7

    .line 80
    .line 81
    iget-object v1, v0, Le7/a;->c:Lr/b;

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2, v7, v8, v6}, Le7/a;->v(Ljava/lang/String;JLe7/q4;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iget-object v1, v0, Le7/a;->d:Lr/b;

    .line 90
    .line 91
    invoke-virtual {v1}, Lr/h;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    iget-wide v1, v0, Le7/a;->e:J

    .line 98
    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    cmp-long v5, v1, v7

    .line 102
    .line 103
    if-nez v5, :cond_1

    .line 104
    .line 105
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 110
    .line 111
    const-string v1, "First ad exposure time was never set"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    sub-long/2addr v3, v1

    .line 118
    invoke-virtual {v0, v3, v4, v6}, Le7/a;->t(JLe7/q4;)V

    .line 119
    .line 120
    .line 121
    iput-wide v7, v0, Le7/a;->e:J

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    iget-object v0, v0, Le7/a;->d:Lr/b;

    .line 125
    .line 126
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v2, v1}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 139
    .line 140
    const-string v1, "Call to endAdUnitExposure for unknown ad unit id"

    .line 141
    .line 142
    invoke-virtual {v0, v1, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    :goto_1
    return-void

    .line 146
    :goto_2
    iget-object v0, p0, Le7/u;->d:Le7/a;

    .line 147
    .line 148
    iget-object v2, p0, Le7/u;->b:Ljava/lang/String;

    .line 149
    .line 150
    iget-wide v3, p0, Le7/u;->c:J

    .line 151
    .line 152
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v5, v0, Le7/a;->d:Lr/b;

    .line 159
    .line 160
    invoke-virtual {v5}, Lr/h;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_5

    .line 165
    .line 166
    iput-wide v3, v0, Le7/a;->e:J

    .line 167
    .line 168
    :cond_5
    iget-object v5, v0, Le7/a;->d:Lr/b;

    .line 169
    .line 170
    invoke-virtual {v5, v2, v1}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/Integer;

    .line 175
    .line 176
    const/4 v5, 0x1

    .line 177
    if-eqz v1, :cond_6

    .line 178
    .line 179
    iget-object v0, v0, Le7/a;->d:Lr/b;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    add-int/2addr v1, v5

    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    iget-object v1, v0, Le7/a;->d:Lr/b;

    .line 192
    .line 193
    iget v6, v1, Lr/h;->c:I

    .line 194
    .line 195
    const/16 v7, 0x64

    .line 196
    .line 197
    if-lt v6, v7, :cond_7

    .line 198
    .line 199
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 204
    .line 205
    const-string v1, "Too many ads visible"

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v1, v2, v5}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Le7/a;->c:Lr/b;

    .line 219
    .line 220
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :goto_3
    invoke-virtual {v0, v2, v1}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    :goto_4
    return-void

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
