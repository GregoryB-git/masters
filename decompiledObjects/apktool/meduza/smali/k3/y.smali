.class public final Lk3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lqb/a;

.field public final c:Lqb/a;

.field public final d:Lqb/a;

.field public final e:Lqb/a;

.field public final f:Lqb/a;


# direct methods
.method public synthetic constructor <init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V
    .locals 0

    iput p6, p0, Lk3/y;->a:I

    iput-object p1, p0, Lk3/y;->b:Lqb/a;

    iput-object p2, p0, Lk3/y;->c:Lqb/a;

    iput-object p3, p0, Lk3/y;->d:Lqb/a;

    iput-object p4, p0, Lk3/y;->e:Lqb/a;

    iput-object p5, p0, Lk3/y;->f:Lqb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lk3/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lk3/y;->b:Lqb/a;

    .line 8
    .line 9
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lt3/a;

    .line 15
    .line 16
    iget-object v0, p0, Lk3/y;->c:Lqb/a;

    .line 17
    .line 18
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, Lt3/a;

    .line 24
    .line 25
    iget-object v0, p0, Lk3/y;->d:Lqb/a;

    .line 26
    .line 27
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v4, v0

    .line 32
    check-cast v4, Lp3/d;

    .line 33
    .line 34
    iget-object v0, p0, Lk3/y;->e:Lqb/a;

    .line 35
    .line 36
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Lq3/k;

    .line 42
    .line 43
    iget-object v0, p0, Lk3/y;->f:Lqb/a;

    .line 44
    .line 45
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v6, v0

    .line 50
    check-cast v6, Lq3/m;

    .line 51
    .line 52
    new-instance v0, Lk3/w;

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    invoke-direct/range {v1 .. v6}, Lk3/w;-><init>(Lt3/a;Lt3/a;Lp3/d;Lq3/k;Lq3/m;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :goto_0
    iget-object v0, p0, Lk3/y;->b:Lqb/a;

    .line 60
    .line 61
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v2, v0

    .line 66
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    iget-object v0, p0, Lk3/y;->c:Lqb/a;

    .line 69
    .line 70
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v3, v0

    .line 75
    check-cast v3, Ll3/e;

    .line 76
    .line 77
    iget-object v0, p0, Lk3/y;->d:Lqb/a;

    .line 78
    .line 79
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v4, v0

    .line 84
    check-cast v4, Lq3/n;

    .line 85
    .line 86
    iget-object v0, p0, Lk3/y;->e:Lqb/a;

    .line 87
    .line 88
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v5, v0

    .line 93
    check-cast v5, Lr3/d;

    .line 94
    .line 95
    iget-object v0, p0, Lk3/y;->f:Lqb/a;

    .line 96
    .line 97
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    move-object v6, v0

    .line 102
    check-cast v6, Ls3/b;

    .line 103
    .line 104
    new-instance v0, Lp3/c;

    .line 105
    .line 106
    move-object v1, v0

    .line 107
    invoke-direct/range {v1 .. v6}, Lp3/c;-><init>(Ljava/util/concurrent/Executor;Ll3/e;Lq3/n;Lr3/d;Ls3/b;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
