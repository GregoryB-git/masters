.class public final synthetic Ln1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Ln1/a;->a:I

    iput-object p1, p0, Ln1/a;->c:Ljava/lang/Object;

    iput p2, p0, Ln1/a;->b:I

    iput-object p3, p0, Ln1/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Ln1/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_1

    .line 8
    :pswitch_0
    iget-object v0, p0, Ln1/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    .line 12
    iget v2, p0, Ln1/a;->b:I

    .line 13
    .line 14
    iget-object v3, p0, Ln1/a;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lv5/l$a;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lv5/l$c;

    .line 33
    .line 34
    iget-boolean v5, v4, Lv5/l$c;->d:Z

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    const/4 v5, -0x1

    .line 39
    if-eq v2, v5, :cond_1

    .line 40
    .line 41
    iget-object v5, v4, Lv5/l$c;->b:Lv5/h$a;

    .line 42
    .line 43
    invoke-virtual {v5, v2}, Lv5/h$a;->a(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iput-boolean v1, v4, Lv5/l$c;->c:Z

    .line 47
    .line 48
    iget-object v4, v4, Lv5/l$c;->a:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {v3, v4}, Lv5/l$a;->invoke(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void

    .line 55
    :pswitch_1
    iget-object v0, p0, Ln1/a;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Landroidx/profileinstaller/b;

    .line 58
    .line 59
    iget v1, p0, Ln1/a;->b:I

    .line 60
    .line 61
    iget-object v2, p0, Ln1/a;->d:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v0, v0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/c$c;

    .line 64
    .line 65
    invoke-interface {v0, v1, v2}, Landroidx/profileinstaller/c$c;->b(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_1
    iget-object v0, p0, Ln1/a;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lm9/a$c;

    .line 72
    .line 73
    iget v2, p0, Ln1/a;->b:I

    .line 74
    .line 75
    iget-object v3, p0, Ln1/a;->d:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lp2/m0;->S()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    iget-object v4, v0, Lm9/a$c;->c:Lm9/a;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const/4 v5, 0x3

    .line 97
    new-array v5, v5, [Ljava/lang/Object;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    iget-object v7, v0, Lm9/a$c;->c:Lm9/a;

    .line 101
    .line 102
    invoke-static {v7}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    aput-object v7, v5, v6

    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    aput-object v6, v5, v1

    .line 117
    .line 118
    const/4 v6, 0x2

    .line 119
    aput-object v3, v5, v6

    .line 120
    .line 121
    const-string v6, "(%x) Stream received (%s): %s"

    .line 122
    .line 123
    invoke-static {v1, v4, v6, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    iget-object v0, v0, Lm9/a$c;->c:Lm9/a;

    .line 127
    .line 128
    if-ne v2, v1, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0, v3}, Lm9/a;->e(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    invoke-virtual {v0, v3}, Lm9/a;->f(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    return-void

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
