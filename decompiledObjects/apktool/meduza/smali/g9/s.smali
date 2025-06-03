.class public final synthetic Lg9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg9/u;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg9/u;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lg9/s;->a:I

    iput-object p1, p0, Lg9/s;->b:Lg9/u;

    iput-object p2, p0, Lg9/s;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lg9/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_2

    .line 7
    :pswitch_0
    iget-object v0, p0, Lg9/s;->b:Lg9/u;

    .line 8
    .line 9
    iget-object v1, p0, Lg9/s;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lj9/i;

    .line 12
    .line 13
    iget-object v0, v0, Lg9/u;->g:Li9/n;

    .line 14
    .line 15
    iget-object v0, v0, Li9/n;->f:Li9/h;

    .line 16
    .line 17
    iget-object v2, v0, Li9/h;->c:Li9/b;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Li9/b;->c(Lj9/i;)Lk9/k;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Lk9/k;->c()Lk9/f;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    instance-of v3, v3, Lk9/l;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v1}, Lj9/m;->m(Lj9/i;)Lj9/m;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    iget-object v0, v0, Li9/h;->a:Li9/g0;

    .line 40
    .line 41
    invoke-interface {v0, v1}, Li9/g0;->g(Lj9/i;)Lj9/m;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_1
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, Lk9/k;->c()Lk9/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v2, Lk9/d;->b:Lk9/d;

    .line 52
    .line 53
    new-instance v3, Lu7/m;

    .line 54
    .line 55
    new-instance v4, Ljava/util/Date;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, v4}, Lu7/m;-><init>(Ljava/util/Date;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0, v2, v3}, Lk9/f;->a(Lj9/m;Lk9/d;Lu7/m;)Lk9/d;

    .line 64
    .line 65
    .line 66
    :cond_2
    return-object v0

    .line 67
    :goto_2
    iget-object v0, p0, Lg9/s;->b:Lg9/u;

    .line 68
    .line 69
    iget-object v1, p0, Lg9/s;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lg9/f0;

    .line 72
    .line 73
    iget-object v0, v0, Lg9/u;->g:Li9/n;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-virtual {v0, v1, v2}, Li9/n;->b(Lg9/f0;Z)Lr4/c;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v2, Lg9/r0;

    .line 81
    .line 82
    iget-object v3, v0, Lr4/c;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Lt8/e;

    .line 85
    .line 86
    invoke-direct {v2, v1, v3}, Lg9/r0;-><init>(Lg9/f0;Lt8/e;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, Lr4/c;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lt8/c;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-virtual {v2, v0, v1}, Lg9/r0;->c(Lt8/c;Lg9/r0$a;)Lg9/r0$a;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-virtual {v2, v0, v1, v3}, Lg9/r0;->a(Lg9/r0$a;Lm9/k0;Z)Ld5/n;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v0, v0, Ld5/n;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lg9/s0;

    .line 106
    .line 107
    return-object v0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
